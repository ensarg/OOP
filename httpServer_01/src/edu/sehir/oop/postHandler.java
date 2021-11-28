package edu.sehir.oop;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.stream.Collectors;

public class postHandler implements HttpHandler {
    static final int BUFFER_SIZE = 32 * 1024;
    public void handle (HttpExchange he) throws IOException {

        String requestMethod = he.getRequestMethod();
        System.out.println(requestMethod + " /post");
        if (requestMethod.equalsIgnoreCase("POST")) {
            String body = new BufferedReader(
                    new InputStreamReader(
                            he.getRequestBody()
                    )
            ).lines().collect(Collectors.joining("\n"));
            String[] parts = body.split("=");
            String name = null;
            if (parts.length > 1) {
                name = parts[1];
            }


            he.getResponseHeaders().set("Content-Type:","text/html");
            he.sendResponseHeaders(200, 0);
            OutputStream responseBody = he.getResponseBody();
            responseBody.write(Constants.getIndexHTML(name));
            responseBody.close();
        } else {
            new NotImplementedHandler().handle(he);
        }


    }
}
