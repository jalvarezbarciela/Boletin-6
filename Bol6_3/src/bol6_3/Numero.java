package bol6_3;
/**
 *
 * @author jalvarezbarciela
 */
public class Numero {
       private float numero;
    
    public Numero(){
    
}
    public Numero(float numero){
        this.numero=numero;
    }
    public void condicional(float numero){
        if(numero>0)
            System.out.println("+");
        else if(numero<0)
            System.out.println("-");
        else 
            System.out.println("0");
    } 
}
