package de.neuefische;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        neuerVersuch();

    }
    public static void neuerVersuch () {
        Scanner sc = new Scanner(System.in);
        String [] arrayWorte = new String[4];
        int i = 0;
        while (i < arrayWorte.length){
            System.out.println("Gib ein Wort ein");
            String wort = sc.nextLine();
            arrayWorte[i] = wort;
            i++;

            if (wort.equals("exit")){
                sc.close();
                break;
            }
            for (int a = 0; a < i; a++) {
                System.out.println(arrayWorte[a]);

            }
        }
    }
}