package org.example.model;

//https://www.codewars.com/kata/53dbd5315a3c69eed20002dd/train/java

import java.util.List;
import java.util.stream.Collectors;

public class Kata {
  
  public static List<Object> filterList(final List<Object> list) {
    return list.stream()
            .filter(o -> o instanceof Integer)
            .collect(Collectors.toList());
  }

}
