package Filing;

import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;

public class Appending {
	public static void main(String[] args) {
		String path="C://Users//Lenovo//Desktop//F1.txt";
		String data=" The end appended this text";
		
		File f=new File(path);
		FileOutputStream fos;
		
		try {
			fos=new FileOutputStream(path,true);
			byte[] writedata=data.getBytes();
			fos.write(writedata);
			System.out.println("Appended Sucessfully!");
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}
