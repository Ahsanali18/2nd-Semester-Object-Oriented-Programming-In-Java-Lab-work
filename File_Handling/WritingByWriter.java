package Filing;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingByWriter {
	public static void main(String[] args) {
		String path="C://Users//Lenovo//Desktop//File3.txt";
		String data="Hello! This is my 3rd File"
				+ "\nThis contains Teachers Data:\n Teachers Name: Sir Sajjad, Sir Mohsin"
				+ "Sir Kashif, Sir Saleem, Sir Junaid, Sir Naveen";
		File f=new File(path);
		FileWriter fw=null;
		
		try {
			fw=new FileWriter(path,true);
			fw.write(data);
			System.out.println("Data written to file having name: "+f.getName()+" successfully!");
		}
		catch(IOException ie) {
			ie.printStackTrace();
		}
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
