package com.syscho.grpc.server;

import com.syscho.grpc.service.AccountService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class AccountServer2 {
    public static void main(String[] args) throws IOException, InterruptedException {


        Server server = ServerBuilder.forPort(6061).
                addService(new AccountService())
                .build();
        
        server.start();

        System.out.println("Server started on " + server.getPort());

        server.awaitTermination();
    }
}
