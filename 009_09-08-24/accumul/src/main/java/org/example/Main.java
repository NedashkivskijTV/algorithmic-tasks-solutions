package org.example;

import org.example.model.Accumul;

public class Main {
    public static void main(String[] args) {
        System.out.println(Accumul.accum("abcd")); // A-Bb-Ccc-Dddd
        System.out.println(Accumul.accum("RqaEzty")); // R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy
        System.out.println(Accumul.accum("cwAt")); // C-Ww-Aaa-Tttt
    }

}
