package bol6_4;
import java.util.Scanner;
/**
 *
 * @author jalvarezbarciela
 */
public class Bol6_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Condicional comparacion=new Condicional("Alex",70,"Aurelio",78);
        comparacion.condicional();
        Condicional comparacion2=new Condicional();
        System.out.println("Pon o nome da primeira persona");
        String nome1=sc.nextLine();
        comparacion2.persona1.setNome(nome1);
        System.out.println("Pon o nome da segunda persona");
        String nome2=sc.nextLine();
        comparacion2.persona2.setNome(nome2);
        System.out.println("Pon o peso da primeira persona");
        float peso1=sc.nextFloat();
        comparacion2.persona1.setPeso(peso1);
        System.out.println("Pon o peso da segunda persona");
        float peso2=sc.nextFloat();
        comparacion2.persona2.setPeso(peso2);
        comparacion2.condicional();
    }   
}
