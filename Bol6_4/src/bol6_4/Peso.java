package bol6_4;
/**
 *
 * @author jalvarezbarciela
 */
public class Peso {
    private String nome;
    private float peso;
public Peso(String nome,float peso){
    this.nome=nome;
    this.peso=peso;
}
public Peso(){
    
}
public void setNome(String nome){
    this.nome=nome;
}
public void setPeso(float peso){
    this.peso=peso;
}
public String getNome(){
    return nome;
}
public float getPeso(){
    return peso;
}
        

}
