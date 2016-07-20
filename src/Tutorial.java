/**
 * Created by Anna Kacprzak on 2016-07-19.
 */

import static java.lang.Math.*;
public class Tutorial {
    public static void main (String [] args) {
        System.out.println ("Hello World");

        String hello = "Welcome ";
        String world = "Everyone!";
        String powitanie = hello+world; //łączenie Stringów
        System.out.println(powitanie);

        String czesc = powitanie.substring(0, 8)+"My Dear";
        System.out.println(czesc);

        String treasure = "Jewellery";
        char x = 'a';
        boolean w = false;
        double y = 2.50;
        int z = 55;
        final double LICZBA_P = 20;
        String kotek = "Goodbye ";
        String myszka = "little ";
        String lisek = "Monster!";
        String pozegnanie = kotek+myszka+lisek;
        String pozegnanie2 = pozegnanie.substring(0, 14);
        System.out.println(pozegnanie);
        System.out.println(pozegnanie2);


        System.out.println("I really love " + treasure);
        System.out.println("The first letter of the alphabet is " + x);
        System.out.println("His story was " + w);
        System.out.println(z + y);
        System.out.println(LICZBA_P);

        double m = 15;
        double n = 5.5;
        double o = 5;
        double  s = (m+n)*o;
        double t = (m-n)/o;
        double r = (m++)+(n++)+(o++);
        boolean porown1 = (m+n)>o;
        boolean porown2 = m==n;
        System.out.println(porown1);
        System.out.println(porown2);
        System.out.println(s);
        System.out.println(t);
        System.out.println(r);

        double liczba= 126;
        int f= 333;
        double potega = pow(liczba,f);
        double bezwzgl = abs(liczba);
        double miks = sqrt(pow(liczba,f));
        System.out.println("Wynik potegowania to " + potega);
        System.out.println("Wartość bezwzględna z liczby -5 to " + bezwzgl );
        System.out.println("Pierwiastek kwadratowy podniesiony do potęgi f wynosi " + miks);

    }
}
