package com.syscho.grpc.client;

import com.syscho.grpc.client.stream.TransferResponseStreamObserver;
import com.syscho.grpc.client.stream.AccountStreamObserver;
import com.syscho.grpc.stub.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class NginxTestClient {

    AccountServiceGrpc.AccountServiceBlockingStub accountServiceBlockingStub;
    AccountServiceGrpc.AccountServiceStub accountServiceStub;

    @BeforeAll
    public void setup() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("192.168.0.189", 8585)
                .usePlaintext().build();
        //stub from proto file
        accountServiceBlockingStub = AccountServiceGrpc.newBlockingStub(channel);
        System.out.println("stub created");
    }




    @Test
    public void loadBalanceTest() {

        for (int i =1 ;i< 10;i++){
            AccountResponse balance = accountServiceBlockingStub.getBalance(
                    BalanceRequest.newBuilder().setAccountNumber(i).build());
            System.out.println(balance);
        }

    }

    @Test
    public void loadBalancingWithStream() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        StreamObserver<DepositRequest> depositRequestStreamObserver =
                accountServiceStub.deposit(new AccountStreamObserver(countDownLatch));
        for (int i = 0; i < 5; i++) {
            DepositRequest depositRequest = DepositRequest.newBuilder().setAmount(10)
                    .setAccountNumber(4).build();

            depositRequestStreamObserver.onNext(depositRequest);
        }

        depositRequestStreamObserver.onCompleted();
        countDownLatch.await();
    }



}

