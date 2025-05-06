package Esercizio1;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi la tua parola");
        String valore = scanner.next();


        boolean result = stringaPariDispari(valore);
        System.out.println(result);


        System.out.println("Inserisci l'anno");
        int anno = scanner.nextInt();
        boolean controllo = annoBisestile(anno);
        System.out.println(controllo);

    }

    public static boolean stringaPariDispari (String x){
      int y = x.length();
      if(y%2==0){
          return true;
      }else {
          return false;
      }
    }

    public static boolean annoBisestile (int anno){
        if(anno%4==0 || anno%100==0 && anno%400==0){
            return true;
        }else {
            return false;
        }
    }
}
