package FileHandling;

import java.io.File;

public class FileInformation {
	public static void main(String[] args) {
		File f= new File("C:\\Users\\Lenovo\\Desktop\\File.txt");
		
		if(f.exists()) {
			System.out.println("File Name: "+f.getName());
			System.out.println("File Path: "+f.getAbsolutePath());
			System.out.println("File can be readed: "+f.canRead());
			System.out.println("File can be writed: "+f.canWrite());
			System.out.println("File length (total Characters): "+f.length());
			System.out.println("File removed: "+f.delete());
		}
		else
			System.out.println("File don't exists!");
	}

}
