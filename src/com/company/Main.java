package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Documents doc1 = new Documents("jakis tekst");
        Documents doc2 = new Documents("abc");
        Documents doc3 = new Documents("cba");
        Documents doc4 = new Documents("xyz");

        List<Documents> documentsList = new ArrayList<>();
        documentsList.add(doc1);
        documentsList.add(doc2);
        documentsList.add(doc3);
        documentsList.add(doc4);


        System.out.println("Co chcesz wyszukać");
        Scanner scanner = new Scanner(System.in);
        String napis = scanner.nextLine();

        int licznik = documentsList.size() - 1; // 1;  // nie rozumiem dlaczego ta jedynka działa ?????
        int zliczacz = 1;
        System.out.println(licznik);  //numerowanie od jedynki
        System.out.println(documentsList.size());

        for (int i = 0; i <= licznik; i++) {
            if (documentsList.get(i).getDescryption().trim().contains(napis)) {
                System.out.println(documentsList.get(i).getDescryption());  // wyświetlenie opisu
                System.out.println(documentsList.get(i).toString());  // wyświetlenie całego dokumentu
                zliczacz++;
            }
        }
        if (zliczacz < 1) {
            System.out.println("niestety nie znaleziona takiego napisu");
        }
    }
}