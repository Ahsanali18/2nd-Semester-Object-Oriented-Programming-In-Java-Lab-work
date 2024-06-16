package IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreatingFile {
	public static void main(String[] args) {
		String message="Hello! I created my first file!";
		String filePath="java-course.txt";
		
		try {
			FileOutputStream fos=new FileOutputStream(filePath);
			byte[] changeMessageIntoBytes= message.getBytes();
			
			fos.write(changeMessageIntoBytes);
			fos.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
