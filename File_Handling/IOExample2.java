package IO;

import java.io.FileOutputStream;

public class IOExample2 {
	public static void main(String[] args) {
		String writetoFile= "Hello, This is my first file";
		String filepath="C:\\Users\\Lenovo\\Desktop\\Example2.txt";
		
		try {
			FileOutputStream fos= new FileOutputStream(filepath);
//			byte[] write = write.getBytes();
			byte[] bytes = writetoFile.getBytes();
			
			fos.write(bytes);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
