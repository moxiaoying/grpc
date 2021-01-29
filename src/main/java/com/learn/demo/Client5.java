package com.learn.demo;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Client5 {
    public static void main(String[] args){
        String text = "Thread5";
        final ManagedChannel channel = ManagedChannelBuilder.forTarget(Constants.IP+":"+Constants.PORT).usePlaintext().build();

        DoFormatGrpc.DoFormatBlockingStub stub = DoFormatGrpc.newBlockingStub(channel);
        DataOuterClass.Data data = DataOuterClass.Data.newBuilder().setText(text).build();

        DataOuterClass.Data dataResult = stub.text2Upper(data);
        System.out.println(dataResult);
        channel.shutdown();
    }
}
