/**
 * Created by Anna Kacprzak on 2016-07-19.
 */

import java.util.Scanner;

import static java.lang.Math.*;

public class Tutorial2 {

    public static void main(String[] args) {

        String imie = cwiczenie1();
        cwiczenie2(imie);

    }

    private static String cwiczenie1() {
        System.out.println("Podaj swoje imię");
        String imie;
        Scanner input = new Scanner(System.in);
        imie = input.nextLine();
        String a = "Ania";
        String b = "Tomek";
        if (imie.equals(a)) {
            System.out.println("Witaj " + a);
        } else if (imie.equals(b)) {
            System.out.println("Witaj " + b);
        } else {
            System.out.println("Przykro mi nie znam Cię " + imie);
        }
        return imie;
    }

    private static void cwiczenie2(String imie){

        System.out.println(imie + " podaj dwolną liczbę ");
        Double liczba1;
        Scanner input1 = new Scanner(System.in);
        liczba1 = input1.nextDouble();
        System.out.println(imie + " twoja liczba to " + liczba1);

        System.out.println(imie + "Podaj drugą liczbę ");
        Double liczba2;
        Scanner input2 = new Scanner(System.in);
        liczba2 = input2.nextDouble();
        System.out.println(imie + " twoja druga liczba to  " + liczba2);

        double liczba3 = liczba1 + liczba2;
        System.out.println(imie + " suma Twoich liczb to " + liczba3);
        double liczba4 = pow(liczba1, liczba2);
        System.out.println(imie + " jedna Twoja liczba podniesiona do potęgi drugiej liczby to " + liczba4);

        if (liczba1 > liczba2) {
            System.out.println(liczba1 + " jest większa od " + liczba2);
        } else if (liczba1 > 0) {
            System.out.println(liczba1 + "  jest większa od 0");
            System.out.println(liczba1 + " nie jest większa od " + liczba2);
        }
    }


}
