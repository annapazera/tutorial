package com.piotrprzybylak;

import java.util.Scanner;

/**
 * Created by Anna Kacprzak on 2016-07-20.
 */
public class KlasaPiotra {

    public static void main(String[] args) {

        powitanie();

        double kwadrat;
        kwadrat = podniesDoKwadratu(5);
        System.out.println(kwadrat);

        System.out.println(  " podaj dwolną liczbę ");
        double liczba;
        Scanner input = new Scanner(System.in);
        liczba = input.nextDouble();

        double wynikKwadrtowania = podniesDoKwadratu(liczba);
        System.out.println(" twoja liczba to podniesiona do kwadratu to " + wynikKwadrtowania);

        double wynik1 = podziel(liczba, 20);
        double wynik2 = podziel(liczba, 10);

        System.out.println("Wynik1 = " + wynik1);
        System.out.println("Wynik2 = " + wynik2);
    }


    static void powitanie(){
        double obliczenie = 2 + 2;
        System.out.println("2 + 2 = " + obliczenie);
        return;
    }


    static double podniesDoKwadratu(double x){
        double y;
        y= x * x;
        return y;
    }

    static double podziel(double dzielna, double dzielnik){
        double wynik;
        wynik= dzielna/dzielnik;
        return wynik;
    }

}
