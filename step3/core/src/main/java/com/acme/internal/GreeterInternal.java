package com.acme.internal;

import org.apache.commons.lang3.StringUtils;

public class GreeterInternal {
   public static String normalize(String name) {
       return StringUtils.capitalize(name);
   }
}
