package org.example;

import org.example.model.Maskify;

public class Main {
    public static void main(String[] args) {
        System.out.println(Maskify.maskify("4556364607935616")); // ############5616
        System.out.println(Maskify.maskify("64607935616")); // #######5616
        System.out.println(Maskify.maskify("1")); // 1
        System.out.println(Maskify.maskify("")); // ""
        System.out.println(Maskify.maskify("Skippy")); // ##ippy
        System.out.println(Maskify.maskify("Nananananananananananananananana Batman!")); // ##ippy ####################################man!
    }
}