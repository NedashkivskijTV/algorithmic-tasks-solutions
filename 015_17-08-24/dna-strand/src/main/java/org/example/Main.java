package org.example;

import org.example.model.DnaStrand;

public class Main {
    public static void main(String[] args) {
        System.out.println(DnaStrand.makeComplement("ATTGC")); // TAACG
        System.out.println(DnaStrand.makeComplement("GTAT")); // CATA
    }
}