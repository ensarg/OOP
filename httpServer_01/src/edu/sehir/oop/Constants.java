package edu.sehir.oop;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

class Constants {
    static final String TEXTHTML = "text/html";
    static final String APPLICATIONJSON = "application/json";
    static final String CONTENTTYPE = "Content-Type";
    static byte[] getIndexHTML(String name) throws IOException {
        if (name == null) {
            name = "Anonymous";
        }
        String content = new String(
                Files.readAllBytes(Paths.get("./welcome.html"))
        );
        content = content.replace("{name}", name);
        return content.getBytes();
    }
}