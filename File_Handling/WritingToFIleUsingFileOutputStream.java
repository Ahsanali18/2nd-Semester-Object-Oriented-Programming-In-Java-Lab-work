package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class WritingToFIleUsingFileOutputStream {
	public static void main(String[] args) {
		String filePath="C:\\Users\\Lenovo\\Desktop\\File.txt";
		String data="Hello! I have write in file by using FileOutputStream class";
		
		try {
			FileOutputStream fos=new FileOutputStream(filePath);
			byte[] dataIntoBytes= data.getBytes();
			fos.write(dataIntoBytes);
		}catch(IOException io) {
			io.printStackTrace();
		}
	}
}
