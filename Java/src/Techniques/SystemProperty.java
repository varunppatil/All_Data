package Techniques;

public class SystemProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = System.getProperty("user.dir")+ "\\varun.jpg";
		// Because getProperty returning path with "\" slash so for matching we need \\ as system doesnt consider \ slash.
		System.out.println(str);
		String mvnEnv=System.getProperty("environment");
		System.out.println(mvnEnv);
	}

}
