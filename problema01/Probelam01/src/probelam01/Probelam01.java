
package probelam01;

import java.util.Scanner;

public class Probelam01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String proyecto1; 
        String proyecto2; 
        String proyecto3;
        double gasto1; 
        double gasto2; 
        double gasto3; 
        double total;

        System.out.println("CONTROL DE GASTOS DE PROYECTOS");
        System.out.println();

        System.out.print("Ingrese el nombre del proyecto 1: ");
        proyecto1 = teclado.nextLine();

        System.out.print("Ingrese el gasto mensual: ");
        gasto1 = Double.parseDouble(teclado.nextLine());

        System.out.println();

        System.out.print("Ingrese el nombre del proyecto 2: ");
        proyecto2 = teclado.nextLine();

        System.out.print("Ingrese el gasto mensual: ");
        gasto2 = Double.parseDouble(teclado.nextLine());

        System.out.println();

        System.out.print("Ingrese el nombre del proyecto 3: ");
        proyecto3 = teclado.nextLine();

        System.out.print("Ingrese el gasto mensual: ");
        gasto3 = Double.parseDouble(teclado.nextLine());

        total = gasto1 + gasto2 + gasto3;

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("REPORTE DE GASTOS");
        System.out.println("----------------------------------------");

        System.out.printf("1. %s: $%.2f%n", proyecto1, gasto1);
        System.out.printf("2. %s: $%.2f%n", proyecto2, gasto2);
        System.out.printf("3. %s: $%.2f%n", proyecto3, gasto3);

        System.out.println("----------------------------------------");
        System.out.printf("GASTO MENSUAL TOTAL: $%.2f%n", total);
        System.out.println("----------------------------------------");

        teclado.close();
    }
}
