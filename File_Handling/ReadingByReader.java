package Filing;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingByReader {
	public static void main(String[] args) {
		String path="C://Users//Lenovo//Desktop//F2.txt";
		int data;
		File f=new File(path);
		FileReader fr;
		try {
			fr=new FileReader(path);
			while((data=fr.read())!=-1) {
				System.out.print((char)data);
			}
			System.out.println();
			System.out.println("Data readed from file "+f.getName()+" having path "+f.getAbsolutePath()+" sucessfully!");
		}
		catch(IOException ie) {
			ie.printStackTrace();
		}
		
	}
}
