package com.learn.demo;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class DefinedServer {

    public Server server = null;


    //    启动服务端
    private void start() throws Exception{
        this.server = ServerBuilder.forPort(Constants.PORT).addService(new Text2UpperImpl()).build().start();
        System.out.println("server started!");

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("关闭jvm");
            DefinedServer.this.stop();
        }));
        System.out.println("执行到这里");
    }

    //    停止服务端
    private void stop() {
        if (null != this.server) {
            this.server.shutdown();
        }
    }
    //    让服务器等待（否则启动完就会退出）
    private void awaitTermination() throws InterruptedException {
        if (null != this.server){
            this.server.awaitTermination();
        }
    }

    public static void main(String[] args) throws Exception{
        DefinedServer server = new DefinedServer();
        server.start();
        server.awaitTermination();
    }
}
