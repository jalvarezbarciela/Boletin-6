package bol6_5;
/**
 *
 * @author jalvarezbarciela
 */
public class Numero {
    private int num1;
    private int num2;
    private int num3;
    public Numero(int a,int b,int c){
        num1=a;
        num2=b;
        num3=c;
    }
    public Numero(){
        
    }
    public void setNum1(int num){
        num1=num;
    }
    public void setNum2(int num){
        num2=num;
    }
    public void setNum3(int num){
        num3=num;
    }
    public void condicional(){
        
        if(num1>num2){            
           if(num1>num3){
               System.out.println("O numero 1 e o maior");
            }
           else{
               System.out.println("O numero 3 e o maior");
           }               
        }
        else{
            if(num2>num3)
                System.out.println("O numero 2 e o maior");
            else
                System.out.println("O numero 3 e o maior");
         
        }
    
    }
}    

