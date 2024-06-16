package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class ReadingDataByUsingFileReaderClass {
	public static void main(String[] args) {
		
		String filePath="C:\\Users\\Lenovo\\Desktop\\FileReader.txt";
		
		try {
			FileReader fr= new FileReader(filePath);
			int data;
			while((data=fr.read())!=-1) {
				System.out.print((char)data);
			}
		}catch(IOException io) {
			io.printStackTrace();
		}
	}

}
