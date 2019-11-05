package bol6_6;
/**
 *
 * @author jalvarezbarciela
 */
public class Bol6_6 {
    public static void main(String[] args) {
        Ventas obxeto=new Ventas("A",900);
        obxeto.Condicional();
        Ventas obxeto1=new Ventas();
        obxeto1.setNome("Papel");
        obxeto1.setVentasAnuales(2000);
        obxeto1.Condicional();
    }
    
}
