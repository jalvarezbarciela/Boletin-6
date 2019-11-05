package bol6_6;
/**
 *
 * @author jalvarezbarciela
 */
public class Ventas {
    private String nome;
    private int ventasAnuales;
    
    public Ventas(){
        
    }
    public Ventas(String nome,int ventas){
        this.nome=nome;
        ventasAnuales=ventas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVentasAnuales(int ventasAnuales) {
        this.ventasAnuales = ventasAnuales;
    }

    public String getNome() {
        return nome;
    }

    public int getVentasAnuales() {
        return ventasAnuales;
    }
    public void Condicional(){
        if(ventasAnuales<=100)
            System.out.println(nome+" ten ventas anuales baixas");
        else if(100<ventasAnuales&ventasAnuales<=500)
            System.out.println(nome+" ten ventas anuales medias");
            else if(500<ventasAnuales&ventasAnuales<=1000)
                System.out.println(nome+" ten ventas anuales altas");
                else if(ventasAnuales>1000)
                    System.out.println(nome+" ten ventas anuales altas");
    }    
}
