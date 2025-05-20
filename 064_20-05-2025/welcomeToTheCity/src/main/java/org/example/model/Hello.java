package org.example.model;

// https://www.codewars.com/kata/5302d846be2a9189af0001e4/train/java

public class Hello {
    public String sayHello(String[] name, String city, String state) {
//    StringBuilder resultString = new StringBuilder();
//
//    resultString.append("Hello,");
//
//    for (String s : name) {
//      resultString.append(" ").append(s);
//    }
//
//    resultString.append("! Welcome to ")
//            .append(city)
//            .append(", ")
//            .append(state)
//            .append("!");
//
//    return resultString.toString();

      return String.format("Hello, %s! Welcome to %s, %s!", String.join(" ", name), city, state);
    }

}
