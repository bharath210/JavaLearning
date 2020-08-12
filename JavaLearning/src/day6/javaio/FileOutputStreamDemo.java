package day6.javaio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		
		FileInputStream fi = new FileInputStream("E:\\demo.text");
		
		String str = "Hello file output Stream";
		FileOutputStream fo = new FileOutputStream("E:\\demo.text");
		fo.write(30);
		fo.close();
	
	}

}
