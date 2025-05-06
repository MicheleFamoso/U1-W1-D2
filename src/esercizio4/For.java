package esercizio4;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int numero = scanner.nextInt();
        for (int i = 0; i < numero + 1; i++) {
           int x = i;
           x= numero   - x ;
            System.out.println(x);
        }

        }
    }

