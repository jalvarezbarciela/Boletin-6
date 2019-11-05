package bol6_1;
/**
 *
 * @author jalvarezbarciela
 */
public class Positivo {
    private float numero;
    
    public Positivo(){
    
}
    public Positivo(float numero){
        this.numero=numero;
    }
    public void condicional(float numero){
        if(numero>=0)
            System.out.println("Es positivo");
    }       
            

}
