package com.piotrprzybylak;

/**
 * Created by Anna Kacprzak on 2016-07-20.
 */
public class PrzepisNaPotrawkeZSoczewicy {

    public static void main(String[] args) {
        namoczSoczewice();
        gotuj(5);
        dodajCebule();
        gotuj(10);
        podawaj();

    }

    private static void podawaj() {
        System.out.println("Podawaj!");
    }


    private static void namoczSoczewice() {
        System.out.println("Namocz soczewice w garnku");
    }
    private static void dodajCebule (){
        System.out.println("Dodaj cebule");
    }
    public static void gotuj(int minuty) {
        System.out.println("Poloz garnek na palniku");
        System.out.println("Wlacz palnik");
        System.out.println("Czekaj " + minuty +" minut");
        System.out.println("Wylacz palnik");
    }
}
