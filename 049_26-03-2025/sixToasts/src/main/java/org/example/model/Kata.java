package org.example.model;

public class Kata{
  public static int sixToast(int num){
//    int extraToasts = num - 6;
//    return extraToasts > 0 ? extraToasts : extraToasts * -1;

    return Math.abs(6 - num);
  }
}