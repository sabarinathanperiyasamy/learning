package filewriting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Filewrite {

	public static void main(String[] args) throws IOException {
	
		String location = "file1.txt";
		String b = null;
		
		
		//FileWriter fw = new FileWriter(location);
		//BufferedWriter bw = new BufferedWriter(fw);
		//bw.write(content);
		String a;
		FileReader fr = new FileReader(location);
		BufferedReader bw = new BufferedReader(fr);
		 while(( a= bw.readLine())!=null ){
			 
			 b=a+b;
			
		 }
		 
		System.out.print(b);
		bw.close();

		
		
	
		
		//bw.close();
		
		

	}

	private static void While(boolean b) {
		// TODO Auto-generated method stub
		
	}

	private static void While(String string) {
		// TODO Auto-generated method stub
		
	}

}
