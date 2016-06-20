package com.acme.cli;

import com.acme.Greeter;
import com.acme.internal.GreeterInternal;

import java.io.*;

public class GreeterCli {

    public static void main(String... args) {
    	 try {
	         Greeter greeter = new Greeter();
	         String line;
	         BufferedReader reader = new BufferedReader(
	         	new InputStreamReader(System.in));
	         while ((line=readName(reader))!=null) {
	             System.out.println(greeter.greet(line));
	         }
	     } catch (Exception e) {
	     	e.printStackTrace();
	     }
	}

    private static String readName(BufferedReader reader) throws IOException {
        System.out.print("Name> ");
        return GreeterInternal.normalize(reader.readLine());
    }

}
