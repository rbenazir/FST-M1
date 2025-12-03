package activities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Activity14 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("src/main/java/activities/NewFile.txt");
		boolean fileCreated=file.createNewFile();
		FileWriter fw=new FileWriter(file);
		fw.write("hello world");
		fw.close();
	}

}
