package Filing;
import java.io.File;
import java.io.IOException;

public class DeletingFile {
	public static void main(String[] args) {
		String path="C://Users//Lenovo//Desktop//File4.txt";
		
		File f=new File(path);
			if(f.delete()) {
				System.out.println("File Deleted Sucessfully!");
			}
			else
				System.out.println("File doesn't found");
	}
}
