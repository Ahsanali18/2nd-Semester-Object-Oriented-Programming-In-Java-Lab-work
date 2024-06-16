package FileHandling;
import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		File f=new File("C:/Users/Lenovo/Desktop/NewFile.txt");
		
		try {
			if(f.createNewFile()) {
				System.out.println("File created Sucessfully!");
				System.out.println(f.createNewFile());
			}
			else
				System.out.println("File already exists!");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
}

