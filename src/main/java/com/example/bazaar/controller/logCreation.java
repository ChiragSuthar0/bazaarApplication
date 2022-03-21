package com.example.bazaar.controller;

import java.io.*;

public class logCreation {

    public static void log_Creation(String a) {
        try(FileWriter fw = new FileWriter("logs.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(a);
            //more code
            out.println("______________________________________________________________________________________________");
            //more code
        } catch (IOException e) {
            //exception handling left as an exercise for the reader
        }
    }
}