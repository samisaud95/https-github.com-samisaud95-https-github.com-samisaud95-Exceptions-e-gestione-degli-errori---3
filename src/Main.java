//Scrivere una funzione che provi a
//dividere un numero per 0 e catturi l'eccezione leggendone il messaggio.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese numero");
            int x = scanner.nextInt();
            System.out.println("Ingrese un numero");
            int y = scanner.nextInt();

            int resultado = x / y;
            System.out.println(" El resultado es : " + resultado);
        } catch (Exception e) {
            System.out.println("El numero no es divisible por zero" + e);
        }
    }
}