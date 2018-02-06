package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List lista = new ArrayList();

        lista.add("Julio");
        lista.add("Julio");
        lista.add(1);

        lista.remove(2);
        System.out.println(lista.contains("Julio"));

        System.out.println(lista.get(0));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
