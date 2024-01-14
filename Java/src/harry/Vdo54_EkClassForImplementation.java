package harry;

public class Vdo54_EkClassForImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Volcano v= new Volcano();
		System.out.println(v.speedUp(3));
		System.out.println(v.applyBrakes(5));
		System.out.println(v.c);
	//	v.c=23; We can create properties in interface but cannot change them as they are final 
		v.d=2; // It is in class so it is not final
	}

}
