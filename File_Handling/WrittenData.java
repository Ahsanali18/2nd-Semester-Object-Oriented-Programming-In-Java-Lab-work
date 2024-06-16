package Filing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WrittenData {
	public static void main(String[] args) {
		String path="C://Users//Lenovo//Desktop//File4.txt";
		String data="Names: (Ahsan, Ahmed, Ali, Akbar, Soorat, Basit, Sachin)";
		
		File f=new File(path);
		FileWriter fw=null;
		
		try {
			fw=new FileWriter(path);
			fw.write(data);
			System.out.println("Data wrote sucessfully!");
		}
		catch(IOException ie) {
			ie.printStackTrace();
		}
		finally {
			try {
				fw.close();
			}catch(IOException ie) {
				ie.printStackTrace();
			}
		}
	}
}
