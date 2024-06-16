package Filing;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingByInputStream {
	public static void main(String[] args) {
		
		String path="C://Users//Lenovo//Desktop//File3.txt";
		int data;
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(path);
			while((data=fis.read())!=-1){
				System.out.print((char)data);
			}
		}catch(IOException ie) {
			ie.printStackTrace();
		}
		finally {
			try {
				fis.close();
			}
			catch(IOException ie) {
				ie.printStackTrace();
			}
		}
		
	}
}
