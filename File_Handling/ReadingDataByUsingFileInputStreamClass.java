package FileHandling;

import java.io.IOException;
import java.io.FileInputStream;

public class ReadingDataByUsingFileInputStreamClass {

	public static void main(String[] args) {
		String filePath="C:\\Users\\Lenovo\\Desktop\\FileInputStream.txt";
		
		try {
			FileInputStream fis=new FileInputStream(filePath);
			int data;
			while((data=fis.read())!=-1) {
				System.out.print((char)data);
			}
		}catch(IOException io) {
			io.printStackTrace();
		}
	}

}
