package com.company;

import java.time.LocalDate;
import java.util.Date;


public class Daty {
    public static void main(String[] args) {

        LocalDate data =  LocalDate.now();
        System.out.println(data);

        Date data1 = new Date();
        System.out.println("Format daty: " + data1);
        System.out.println("Format tekstowy daty: " + data1.toString());

        LocalDate data2 = LocalDate.of(2022,01,29);
        System.out.println(data2);

        LocalDate data3 = LocalDate.parse("2021-10-23");
        System.out.println(data3);



    }
}
