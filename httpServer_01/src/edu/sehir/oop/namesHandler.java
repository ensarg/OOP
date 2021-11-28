package edu.sehir.oop;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.*;
;


public class namesHandler implements HttpHandler {
    static final int BUFFER_SIZE = 32 * 1024;
    public void handle (HttpExchange he) throws IOException {
        // add the required response header for a html file

        Headers h = he.getResponseHeaders();
        h.add("Content-Type:","text/html");

       // System.out.println("request body is: "+ he.getRequestBody());

        InputStream is = he.getRequestBody();
        byte[] bytearray = new byte[BUFFER_SIZE];
        int read;
        long count = 0L;
        while((read = is.read(bytearray)) != -1) {
            count += read;
        }
        is.close();


        System.out.println("Received " + count + " bytes\n");



        StringBuilder response = new StringBuilder();
        response.append("<html><body>");
        //response.append("hello " + he.getPrincipal().getUsername());
        response.append("parameters:  " +new String(bytearray));
        response.append("</body></html>");



        // ok, we are ready to send the response.
        he.sendResponseHeaders(200, response.length());
        OutputStream os = he.getResponseBody();
        //os.write(response.toString().getBytes());
        os.write(response.toString().getBytes());
        os.close();
        he.close();




    }
}
