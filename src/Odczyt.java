/**
 * Created by Anna Kacprzak on 2016-07-19.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.io.PrintWriter;

public class Odczyt {
    public static void main(String[] args) throws FileNotFoundException{
//        File file = new File("AlaKot.txt");
//        Scanner in = new Scanner(file);
//
//        String zdanie = in.nextLine();
//        System.out.println(zdanie);
        PrintWriter zapis= new PrintWriter ("AlaKot.txt");
        zapis.println("Ala ma kota, a kot ma Alę");
        zapis.close();
    }
}