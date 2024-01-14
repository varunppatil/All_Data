package harry;

import java.util.Scanner;

public class Vdo19_WebsiteType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Taking a Website to check: ");
		Scanner sc =  new Scanner (System.in);
		String website = sc.nextLine();
		
		// Contains logic was good Varun but it fails if ur website do have org,com and in @ starts so endsWith is good 
		
	/*	if (website.contains(".com")) {
			System.out.println(website + " is Commercial Website");
		}
		else if (website.contains(".org")){
			System.out.println(website + " is Organizational Website");
		}
		else if (website.contains(".in")) {
			System.out.println(website + " is Indian Webiste");
		}
		else
			System.out.println(website + " has Unique domain"); */
		if (website.endsWith(".com")) {
			System.out.println(website+ " is Commercial Website");
		}
		else if (website.endsWith(".org")){
			System.out.println(website+ " is Organizational Website");
		}
		else if (website.endsWith(".in")) {
			System.out.println(website+ " is Indian Webiste");
		}
		else
			System.out.println(website + " has Unique domain");
		
		}

}
