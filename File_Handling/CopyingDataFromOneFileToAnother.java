package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingDataFromOneFileToAnother {
	public static void main(String[] args) {
		String firstFilePath="C:\\Users\\Lenovo\\Desktop\\firstFile.txt";
		String secondFilePath="C:\\Users\\Lenovo\\Desktop\\SecondFile.txt";
		
		try {
			FileInputStream fis= new FileInputStream(firstFilePath);
			FileOutputStream fos= new FileOutputStream(secondFilePath);
			
			int data;
			while((data=fis.read())!=-1) {
				fos.write((char)data);
			}
			System.out.println("Data Transferred Sucessfully!");
		}catch(IOException io) {
			io.printStackTrace();
		}
	}
}
