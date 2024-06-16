package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WritingToFileUsingFileWriterClass {
	public static void main(String[] args) {
		String filePath="C:/Users/Lenovo/Desktop/FileWriter.txt";
		String data="Hello! This is my data i have write by using FileWriter class!";
		
		try {
			FileWriter fw=new FileWriter(filePath);
			try {
			fw.write(data);
			}
			finally {
				fw.close();
			}
		}catch(IOException io) {
			io.printStackTrace();
		}
	}
}

