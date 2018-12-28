package cn.glieen;

import cn.glieen.handler.DefaultHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyTomcat {

    private int port;

    public MyTomcat(int port) {
        this.port = port;
    }

    public void start() throws IOException {
        System.out.println("Tomcat start!");
        ServerSocket serverSocket = new ServerSocket(port);
        while (true) {
            Socket socket = serverSocket.accept();
            new Thread(new DefaultHandler(socket)).start();
        }
    }
}
