
abstract class NewBank{    
abstract int getRateOfInterest();    
}    
class UI extends NewBank{    
int getRateOfInterest(){return 7;}    
}    
class PNB extends NewBank{    
int getRateOfInterest(){return 8;}    
}    
    
class TestBank{    
public static void main(String args[]){    
NewBank b;  
b=new UI();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
b=new PNB();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
}}    