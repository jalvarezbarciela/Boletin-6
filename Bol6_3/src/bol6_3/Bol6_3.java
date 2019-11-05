package bol6_3;
import java.util.Scanner;
/**
 *
 * @author jalvarezbarciela
 */
public class Bol6_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Numero a= new Numero();
        System.out.println("Escribe un numero");
        float numero=sc.nextInt();
        a.condicional(numero);
        
    }
    
}
