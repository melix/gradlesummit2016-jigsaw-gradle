package com.acme;
import com.acme.internal.GreeterInternal;

public class Greeter {
   public String greet(String name) {
       return "Hello " + GreeterInternal.norma(name);
   }
}
