package com.company;

import java.io.File;
import java.security.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class SprawdzanieDat {
    public static void main(String[] args) throws ParseException {
//        try {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Podaj date w formacie dd-MM-yyyy HH:mm:" );
//            String podajDate = scanner.nextLine();
//
//            String dataString = podajDate;
//            SimpleDateFormat formatDaty = new SimpleDateFormat("dd-MM-yyyy HH:mm");
//            Date czas = formatDaty.parse(dataString);
//            System.out.println("Data wpisana: " + czas);
//
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
////----------------------------------------------------------------------------------------------------------------------
//        File pl2 = new File("Plik_2.txt");
//        File pl3 = new File("Plik_3.txt");
//        File pl4 = new File("Plik_4.txt");
//        File pl4kopia = new File("Plik_4kopia.txt");
//        Date time2 = new Date(pl2.lastModified());
//        Date time3 = new Date(pl3.lastModified());
//        Date time4 = new Date(pl4.lastModified());
//        Date time4kopia = new Date(pl4kopia.lastModified());
//        if  (time2 == time3) {
//            System.out.println(pl2.getName()+" "+ time2);
//            System.out.println(pl3.getName()+" "+ time3);
//            System.out.println("Pliki mają ten sam czas modyfikacji");
//        }
//        else {
//            System.out.println(pl2.getName()+" "+ time2);
//            System.out.println(pl3.getName()+" "+ time3);
//            System.out.println("Pliki mają różne czasy modyfikacji");
//        }
//        if  (time2 == time4) {
//            System.out.println(pl2.getName()+" "+ time2);
//            System.out.println(pl4.getName()+" "+ time4);
//            System.out.println("## Pliki mają ten sam czas modyfikacji");
//        }
//        else {
//            System.out.println(pl2.getName()+" "+ time2);
//            System.out.println(pl4.getName()+" "+ time4);
//            System.out.println("## Pliki mają różne czasy modyfikacji");
//        }
//        if  (time4kopia == time4) {
//            System.out.println(pl4kopia.getName()+" "+ time4kopia);
//            System.out.println(pl4.getName()+" "+ time4);
//            System.out.println("### Pliki mają ten sam czas modyfikacji");
//        }
//        else {
//            System.out.println(pl4kopia.getName()+" "+ time4kopia);
//            System.out.println(pl4.getName()+" "+ time4);
//            System.out.println("### Pliki mają różne czasy modyfikacji");
//        }
//----------------------------------------------------------------------------------------------------------------------
        File plik1 = new File("Plik_1.txt");
        File plik2 = new File("Plik_2.txt");
        File plik3 = new File("Plik_3.txt");
        File[] tab1 = {plik1, plik2, plik3};
        //System.out.println(tab.length);
        for (File p1 : tab1) {
            Date czasy1 = new Date(p1.lastModified());
            System.out.println(p1 + "   " + czasy1);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj date w formacie dd-MM-yyyy HH:mm:ss ----------");
        String podajDate1 = scanner.nextLine();

        String dataString1 = podajDate1;
        SimpleDateFormat formatDaty = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date czasy = formatDaty.parse(dataString1);
        System.out.println("Data wpisana: " + czasy);
        File plik10 = new File("Plik_1.txt");
        File plik20 = new File("Plik_2.txt");
        File plik30 = new File("Plik_3.txt");
        File[] tab2 = {plik10, plik20, plik30};


        for (File p2 : tab2) {
            Date czasy2 = new Date(p2.lastModified());
            boolean bool = czasy2.after(czasy);
            if (bool == true) {
                System.out.println("Wyświetl pliki after--- " + p2.getName() + " " + czasy2 + " ");
            }
            else {
                System.out.println("Wyświetl pliki before--- " + p2.getName() + " " + czasy2 + " ");

            }
        }

//        for (File p2 : tab2) {
//            Date czasy2 = new Date(p2.lastModified());
//            //System.out.println(p1 + "   " + czasy1);
//        boolean boolbefore = czasy2.before(czasy);
//           System.out.println("Before: --------- "+p2.getName() + " " + czasy2 +" " + boolbefore);
//        }


    }
}

