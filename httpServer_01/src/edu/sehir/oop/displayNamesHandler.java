package edu.sehir.oop;

import com.sun.net.httpserver.*;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.Headers;


import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.*;
import java.net.Socket;
import java.util.Date;
import java.util.StringTokenizer;

public class displayNamesHandler implements HttpHandler {

    public void handle (HttpExchange he) throws IOException {
        // add the required response header for a PDF file
        Headers h = he.getResponseHeaders();
        h.add("Content-Type:","text/html");

        // a PDF (you provide your own!)
        File file = new File ("./web/namesform.html");
        byte [] bytearray  = new byte [(int)file.length()];
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        bis.read(bytearray, 0, bytearray.length);

        // ok, we are ready to send the response.
        he.sendResponseHeaders(200, file.length());
        OutputStream os = he.getResponseBody();
        os.write(bytearray,0,bytearray.length);
        os.close();
        he.close();


    }
}

