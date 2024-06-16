package Filing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendingByWriter {
	public static void main(String[] args) {
		String path="C://Users//Lenovo//Desktop//File4.txt";
		String data="(Furqan, Najeeb, Zeeshan, Shahjan)";
		
		File f=new File(path);
		FileWriter fr=null;
		
		try {
			fr=new FileWriter(path,true);
			fr.append(data);
			System.out.println("Data Appended Sucessfully!");
		}
		catch(IOException ie) {
			ie.printStackTrace();
		}
		finally {
			try {
				fr.close();
			}catch(IOException ie) {
				System.out.println(ie.getMessage());
			}
		}
	}
}
