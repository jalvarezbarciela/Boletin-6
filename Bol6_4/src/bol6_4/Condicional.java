package bol6_4;
/**
 *
 * @author jalvarezbarciela
 */
public class Condicional {
    Peso persona1=new Peso();
    Peso persona2=new Peso();
    public Condicional(String nome1,float peso1,String nome2,float peso2){
        persona1=new Peso(nome1,peso1);
        persona2=new Peso(nome2,peso2);
    }
    public Condicional(){

    }
    public void condicional(){
    if(persona1.getPeso()>persona2.getPeso()) {
        float c=persona1.getPeso()-persona2.getPeso();
        System.out.println(persona1.getNome()+" pesa mais que "+persona2.getNome()+" por "+c+" kilos");
    }
    else{if(persona2.getPeso()>persona1.getPeso()){
        float c=persona2.getPeso()-persona1.getPeso();
        System.out.println(persona2.getNome()+" pesa mais que "+persona1.getNome()+" por "+c+" kilos");
    }
    else{
        System.out.println("Pesan o mesmo");
    }
    }
    }    
}
