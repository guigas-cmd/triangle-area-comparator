package application;
import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y; // class
        x = new Triangle(); // instanciacao
        y = new Triangle();

        double p;
        double areay, areax;


        System.out.println("Enter the measures of triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        p = (x.a + x.b + x.c) / 2;

        areax = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.b));
        System.out.printf("Triangle X area: %.4f%n", areax);

        p = (y.a + y.b + y.c) / 2;
        areay = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
        System.out.printf("Triangle Y area: %.4f%n", areay);


        if(areax > areay){
            System.out.println("Large area: X");
        }
        else{
            System.out.println("Large area: Y");
        }

        System.out.println("end");
        sc.close();
    }
}
