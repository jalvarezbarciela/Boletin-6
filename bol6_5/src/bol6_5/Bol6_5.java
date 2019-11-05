package bol6_5;

import java.util.Scanner;

/**
 *
 * @author jalvarezbarciela
 */
public class Bol6_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Numero comparacion=new Numero(2,3,4);
        comparacion.condicional();
        Numero comparacion2=new Numero();
        System.out.println("Dime o valor do numero 1");
        int a=sc.nextInt();
        comparacion2.setNum1(a);
        System.out.println("Dime o valor do numero 2");
        int b=sc.nextInt();
        comparacion2.setNum2(b);
        System.out.println("Dime o valor do numero 3");
        int c=sc.nextInt();
        comparacion2.setNum3(c);
        comparacion2.condicional();
    }
    
}
