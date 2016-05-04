package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyDDmQgAayqPVa0g954ieLN7GVrcB5Uy4SQ";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bE7gJmMUuqnxSzXvFU-5W1vySemX2gOadFxZXVxHCpMnHnh7rGfrk37G1aKWSa9oMIfRtAqb5TW1de1VyUwI8-uY6qq635vlerdJFFNucUBDbZ8chR3jTnZoknY9pXmF-KTxLXF");

        c.createData("Working!!", "Test message");

        return c;
    }
}

