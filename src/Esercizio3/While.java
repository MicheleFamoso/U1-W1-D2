package Esercizio3;

import java.util.Arrays;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
    String parola="";
        String fine= ":q";
        while (!parola.equals(fine)){
            System.out.println("Scrivi una parola");
            parola= scanner.next();
            String x="";
            String y = ",";
            if(parola.equals(fine)){
                System.out.println("finito");
            }else {

                for (int i = 0; i < parola.length(); i++) {
                    x= x + parola.charAt(i)+y;
                }System.out.println(x);
            }

        }







    }


}
