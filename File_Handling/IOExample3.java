package IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOExample3 {
	public static void main(String[] args) {
		
		String writer= "This is my first file!";
		String filepath="java-course.txt";
		
		String oldName="java-course.txt";
		String newName="File Handling.txt";
		try {
		FileOutputStream fos= new FileOutputStream(filepath);
		byte[] stringintoBytes= writer.getBytes();
		fos.write(stringintoBytes);
		
		fos.close();
		
		File oldfile=new File(oldName);
		File newfile=new File(newName);
		
		boolean renamed= oldfile.renameTo(newfile);
		
		if(renamed) {
			System.out.println("File is sucessfully renamed!");
		}
		else {
			System.out.println("File is not renamed there is issue!");
		}
	}
		catch(IOException e) {
			e.printStackTrace();
	}
}
}