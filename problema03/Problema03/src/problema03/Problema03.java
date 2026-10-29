
/*
 * Programa para generar la planilla mensual
 * del servicio telefonico residencial.
 */
package problema03;

import java.util.Scanner;

public class Problema03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String titular;
        String direccion;
        double costoMinuto;
        int minutos;
        double total;

        System.out.println("DATOS DEL CLIENTE");
        System.out.print("Ingrese el nombre del titular: ");
        titular = teclado.nextLine();

        System.out.print("Ingrese la direccion: ");
        direccion = teclado.nextLine();

        System.out.print("Ingrese el costo por minuto: $");
        costoMinuto = teclado.nextDouble();

        System.out.print("Ingrese los minutos consumidos: ");
        minutos = teclado.nextInt();

        total = costoMinuto * minutos;

        System.out.println();
        System.out.println("==========================================================");
        System.out.println("          PLANILLA DE SERVICIO TELEFONICO");
        System.out.println("==========================================================");
        System.out.println("Titular: " + titular);
        System.out.println("Direccion: " + direccion);
        System.out.println("----------------------------------------------------------");
        System.out.printf("Costo por minuto: $%.2f%n", costoMinuto);
        System.out.println("Minutos consumidos: " + minutos);
        System.out.println("----------------------------------------------------------");
        System.out.printf("VALOR TOTAL A PAGAR:  $%.2f%n", total);
        System.out.println("==========================================================");

        teclado.close();
    }
}
