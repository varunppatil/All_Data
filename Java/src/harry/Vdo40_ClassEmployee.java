package harry;



	
	class Employee2{
		int salary;
		String name ;
		
		int getSalary(int salary){
			System.out.println("The salary of employee is: " +salary);
			return salary;
		}
		
		String getName(String name) {
			System.out.println("The name is :" +name);
			return name;
		}
		String setName(String name1) {
			name = name1;
			return name;
		}
	}

	public class Vdo40_ClassEmployee {
	
		public static void main(String[] args) {
			Employee2 employee = new Employee2();
			employee.getSalary(40000);
			employee.getName("Yash");
			System.out.println(employee.setName("Varun"));
			System.out.println(employee.name);
		}

}
