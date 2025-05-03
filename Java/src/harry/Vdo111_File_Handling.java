package harry;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Vdo111_File_Handling {

	public static void main(String[] args) throws Throwable {

		
		 /* try { File file = new File("C:\\Users\\HP\\Documents\\newFile.txt");
		  file.createNewFile(); } catch (IOException e) { throw new
		  Exception("Issue in creating file "); }
		  
		  try { FileWriter ft = new
		  FileWriter("C:\\Users\\HP\\Documents\\newFile2.txt");
		  ft.write("Data added in file"); ft.close(); } catch (IOException e) { // TODO
		  Auto-generated catch block e.printStackTrace(); }
		 

		File file = new File("C:\\Users\\HP\\Documents\\newFile2.txt");

		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();

				System.out.println(line);

			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}*/
		
		File file = new File("C:\\Users\\HP\\Documents\\newFile2.txt");
		
		if(file.exists()) {
			
			file.delete();
			System.out.println("File has been deleted");
		}
		else System.out.println("Issues in deleting file");

	}

}
