package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.security.Timestamp;
import java.util.Date;

public class Cwiczenia {
    public static void main(String[] args) throws FileNotFoundException {
        File d = new File("Plik_2.txt");
        if(d.exists()) {
        Date czas = new Date(d.lastModified());
            System.out.println("Nazwa pliku: " + d.getName() + "; Data modyfikacji pliku: " + czas);
        }

        else {
            System.out.println("Plik nie istnieje");
        }
//---------------------------------------------------------------------------------------------------------------------
        System.out.println("---------------------------Wyświetla daty wszystkich plików '.txt' w katalogu---------------------");
        File pliki = new File("C:\\Users\\uczen.A306K09\\IdeaProjects\\30-01-22_p.Czaja");
        if (pliki.exists()) {

            File[] f = pliki.listFiles(new FilenameFilter()  {
                public boolean accept(File directory, String f)  {
                    return f.endsWith(".txt");
                }});

            // Wyświetla nazwy plików
            for (int i = 0; i < f.length; i++) {
                Date czas1 = new Date(f[i].lastModified());
                System.out.println(f[i].getName() + "          " + czas1);
            }
        }
        else {
            System.out.println("Brak plików");
        }
//---------------------------------------------------------------------------------------------------------------------
        System.out.println("---------------------------Wyświetla daty wszystkich plików w katalogu---------------------");

        File[] f1 = pliki.listFiles();
        // Wyświetla nazwy plików
        for (int i = 0; i < f1.length; i++) {
            Date czas2 = new Date(f1[i].lastModified());
            System.out.println(f1[i].getName() + "   " + czas2);
        }

//---------------------------------------------------------------------------------------------------------------------
        System.out.println("---------------------------Wyświetla daty plików z tablicy ---------------------");

        File plik1 = new File("Plik_1.txt");
        File plik2 = new File("Plik_2.txt");
        File plik3 = new File("Plik_3.txt");
        File[] tab1 = {plik1, plik2, plik3};
        //System.out.println(tab.length);
        for (File p : tab1) {
            Date czas4 = new Date(p.lastModified());
            System.out.println(p + "   " + czas4);
        }
    }
}
