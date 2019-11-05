package bol6_1;

import java.util.Scanner;

/**
 *
 * @author jalvarezbarciela
 */
public class Bol6_1 {
    public static void main(String[] args) {
        Positivo positivo=new Positivo();
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe un numero");
        float numero=sc.nextFloat();
        positivo.condicional(numero);
    }
    
}
