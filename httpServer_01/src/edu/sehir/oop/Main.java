package edu.sehir.oop;
import com.sun.net.httpserver.*;

import java.io.IOException;
import java.net.*;


public class Main {

    public static void main(String[] args) throws IOException {


        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        HttpContext context = server.createContext("/");
        //context.setHandler(new infoHandler());
        context.setHandler(new welcomePageHandler());
        server.createContext("/web", new displayNamesHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
    }

}
