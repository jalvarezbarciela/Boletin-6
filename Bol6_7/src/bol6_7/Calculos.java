package bol6_7;

import java.util.Scanner;

/**
 *
 * @author jalvarezbarciela
 */
public class Calculos {
        Scanner teclado = new Scanner(System.in);

    public void perimetroCuadrado() {
        System.out.println("Cal é o valor do lado?");
        float lado = teclado.nextFloat();
        float perimetro = lado * lado;
        System.out.println("O perímetro do cadrado é " + perimetro);
    }

    public void perimetroTriangulo() {
        System.out.println("Cal é o valor da base?");
        float base = teclado.nextFloat();
        System.out.println("Cal é a altura?");
        float altura = teclado.nextFloat();
        float perimetro = base * altura / 2;
        System.out.println("O perímetro do triángulo é " + perimetro);
    }

    public void perimetroCirculo() {
        System.out.println("Cal é o tamaño do radio?");
        float radio = teclado.nextFloat();
        float perimetro = (float) Math.PI * ((float) Math.pow(radio, 2));
        System.out.println("O perímetro do cículo é " + perimetro);
    }

    public void calculos() {
        System.out.println("Que perímetro desea calcula?\n1.-Cuadrado."
                + "\n2.-Triángulo.\n3.-Círculo.");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                if (opcion == 1) {
                    perimetroCuadrado();
                    break;
                }
            case 2:
                if (opcion == 2) {
                    perimetroTriangulo();
                    break;
                }
            case 3:
                if (opcion == 3) {
                    perimetroCirculo();
                    break;
                }
            default:
                System.out.println("Opción incorrecta");
        }

    }

}
    

