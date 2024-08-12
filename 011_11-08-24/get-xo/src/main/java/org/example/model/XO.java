package org.example.model;

//https://www.codewars.com/kata/55908aad6620c066bc00002a/train/java

public class XO {
  public static boolean getXO (String str) {
    String strNoO = str.toLowerCase().replaceAll("x", "");
    String strNoX = str.toLowerCase().replaceAll("o", "");
    return strNoO.length() == strNoX.length();
  }

}
