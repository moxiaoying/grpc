package com.learn.demo;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Client1 {
    public static void main(String[] args){
        String text = "Thread1";
        final ManagedChannel channel = ManagedChannelBuilder.forTarget(Constants.IP+":"+Constants.PORT).usePlaintext().build();

        DoFormatGrpc.DoFormatBlockingStub stub = DoFormatGrpc.newBlockingStub(channel);
        DataOuterClass.Data data = DataOuterClass.Data.newBuilder().setText(text).build();

        DataOuterClass.Data dataResult = stub.text2Upper(data);
        System.out.println(dataResult);
        channel.shutdown();
    }
}
