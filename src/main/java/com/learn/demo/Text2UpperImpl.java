package com.learn.demo;

import io.grpc.stub.StreamObserver;

public class Text2UpperImpl extends DoFormatGrpc.DoFormatImplBase{
    @Override
    public void text2Upper(DataOuterClass.Data request,
                           StreamObserver<DataOuterClass.Data> responseObserver){
        System.out.println(request.getText());
        String textUpper = request.getText().toUpperCase();
        DataOuterClass.Data data = DataOuterClass.Data.newBuilder().setText(textUpper).build();
        responseObserver.onNext(data);
        responseObserver.onCompleted();
    }
}
