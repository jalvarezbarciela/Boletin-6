package bol6_2;
/**
 *
 * @author jalvarezbarciela
 */
public class Short {
    private short num1;
    private short num2;
    public Short(short a,short b){
        num1=a;
        num2=b;
    }
    public Short(){
        
    }
    public void setNum1(short num){
        num1=num;
    }
    public void setNum2(short num){
        num2=num;
    }
    public void condicional(short a,short b){
        num1=a;
        num2=b;
        short s=(short) (num1+num2);
        short r=(short) (num1-num2);
        if(num1>=num2){            
            System.out.println("Suma="+s+"\nResta="+r);
        }
        else{
            System.out.println("Suma="+s);
        }
    
    }
}
