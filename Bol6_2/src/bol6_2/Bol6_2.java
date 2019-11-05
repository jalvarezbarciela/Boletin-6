package bol6_2;
import java.util.Scanner;
/**
 *
 * @author jalvarezbarciela
 */
public class Bol6_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Short num=new Short();
        System.out.println("Dime un numero");
        short a= sc.nextShort();
        System.out.println("Dime outro numero");
        short b= sc.nextShort();
        num.condicional(a, b);
    }
    
}
