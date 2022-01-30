package com.company;

import java.io.File;
import java.io.FilenameFilter;

public class Main {

    public static void main(String[] args) throws Exception {

        File plik = new File("C:\\Users\\uczen.A306K09\\IdeaProjects\\30-01-22_p.Czaja");

        if (plik.exists()) {
            System.out.println("plik istnieje");
        } else {
            System.out.println("plik nie istnieje");
        }
//---------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------- Sprawdza czy jest katalog w danej ścieżce: ---------------------------");
        if (plik.isDirectory()) {
            System.out.println("Directory");
        } else {
            System.out.println("is not Directory");
        }
//--------------------------------------------------------------------------------------------------------------------------
        System.out.println("------------------------------- Wypisuje wszystkie pliki '.txt' z katologu: ----------------------------");

        File[] f = plik.listFiles(new FilenameFilter()  {
            public boolean accept(File directory, String f)  {
                return f.endsWith(".txt");
            }});
        System.out.println("Wszystkie pliki .txt: ");
        // Wyświetla nazwy plików
        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i].getName());
        }
//--------------------------------------------------------------------------------------------------------------------------------
        System.out.println("------------------------------- Wypisuje wszystkie pliki z katologu: ----------------------------");

        File[] f1 = plik.listFiles();
        // Wyświetla nazwy plików
        for (int i = 0; i < f1.length; i++) {
            System.out.println(f1[i].getName());
        }
//------------------------------------------------------------------------------------------------------------------
        System.out.println("------------------------------- Tablica z plikami: ----------------------------");
        File plik1 = new File("Plik_1.txt");
        File plik2 = new File("Plik_2.txt");
        File plik3 = new File("Plik_3.txt");
        File[] tab = {plik1, plik2, plik3};
        //System.out.println(tab.length);
        for (File p : tab) {
            System.out.println(p);
        }
        System.out.println("--------------");
        int i = 0;
        while (i < tab.length){
            System.out.println("# " + tab[i].getName());
            i++;
        }
//----------------------------------------------------------------------------------------------------------------------


    }
}
