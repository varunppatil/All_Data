package harry;

class Animal{

private int weight;

public void animalWeight(int wt){
	this.weight = wt;
	
	System.out.print("Weight of animal is " +weight+ "\n");

}


}

class Dog extends Animal{
     private int name;
	public void nameOfAnimal(int n){
	 this.name = n;
	 System.out.println("The name of dog is " +name);
		
		  Animal d= new Animal();
		  
		  d.animalWeight(32);
		 
}
}


  public class Vdo45_InheritanceInJava
  {
	  public static void main(String[] args){
		  Dog dd= new Dog();
		  dd.animalWeight(2);
		  dd.nameOfAnimal(0);
  } 
  }
 