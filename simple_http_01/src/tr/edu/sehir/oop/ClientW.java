package tr.edu.sehir.oop;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


import java.net.Socket;

class ClientW implements Runnable {
    private Socket client;

    //Constructor
    ClientW(Socket client) {
        this.client = client;

    }

    public void run(){
        String line;
        BufferedReader in = null;
        PrintWriter out = null;
        try{
            in = new BufferedReader(new
                    InputStreamReader(client.getInputStream()));
            out = new
                    PrintWriter(client.getOutputStream(), true);
            Thread.sleep( 1000);
        } catch (IOException | InterruptedException e) {
            System.out.println("in or out failed");
            System.exit(-1);
        }



        //while(true){
            try{
                line = in.readLine();
                System.out.println("line read from client: " + line);
               //  GET /web/namesform.html HTTP/1.1



                long time = System.currentTimeMillis();

                // Creating date format
                DateFormat simple = new SimpleDateFormat("dd MMM yyyy HH:mm:ss:SSS Z");

                // Creating date from milliseconds
                // using Date() constructor
                Date result = new Date(time);

                // Formatting Date according to the
                // given format
                System.out.println(simple.format(result));

                //Send data back to client
                String resp ="HTTP/1.1 200 OK\n\n" +
                        "<html><body><h1>received from browser:"+line+"<br>hello <br> from server <br>time:"+simple.format(result)+" </h1></body></html>" ;
                String resp2 = "HTTP/1.1 200 OK\n\n " +
                        "<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<body>\n" +
                        "<h2>Welcome </h2>\n" +
                        "<p><a href=\"http://127.0.01:4321/web/namesform.html\">Clik to enter your name</a></p>\n" +
                        "</body>\n" +
                        "</html>\n";

                //        "ClientW:  + helllo  " + time;
                //out.println(resp+time);
                out.println(resp2);


            in.close();
            out.close();

            }catch (IOException e) {
                System.out.println("Read failed");
                System.exit(-1);
            }
        //}
    }
}