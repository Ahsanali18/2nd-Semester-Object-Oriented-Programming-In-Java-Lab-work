package IO;

import java.io.FileInputStream;

public class IOExample {
	
	public static void main(String[] args) {
		// file bath can be gived directly by object or we can store it in variable 
		String filepath ="C:\\Users\\Lenovo\\Desktop\\Test";
		// now we have to provide reader 
//		byte stream or character stream
//		Byte stream 
		FileInputStream fis;
		try {
		fis = new FileInputStream(filepath); //shows error we have to use try catch blocks
		fis.read(); //reads characters and give ASCII values 
		int data;
//		while(fis.read()!=-1 /*-1 represents the end of file*/) { This did not give correct data it only gives bytes
		while((data=fis.read())!=-1){
			System.out.println(data);
		}
			}
		catch(Exception e) {
			
		}
		
//		make file and store in it our own data
		
		
}
}
