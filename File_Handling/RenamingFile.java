package FileHandling;
import java.io.File;
import java.io.IOException;

public class RenamingFile {
	public static void main(String[] args) {
		
		String oldName="C:\\Users\\Lenovo\\Desktop\\RemainRename.txt";
		String newName="C:\\Users\\Lenovo\\Desktop\\Renamed.txt";
		
		File oldFile= new File(oldName);
		File newFile= new File(newName);
		
		if(!oldFile.exists()) {
			System.out.println("File donot exists!");
			return;
		}
		boolean renamed=oldFile.renameTo(newFile);
		if(renamed) {
			System.out.println("File Renamed SuccessFully!");
		}
		else
			System.out.println("File Doesn't Exists");
	}
}
