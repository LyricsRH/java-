package 六;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

//从文本读取格式文件，常用做法，先用readed读一行，再用scanner扫描这一行

public class F9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new F9().run();
	}
	
	public void run(){
		
		
		try {
			BufferedReader bufferedReader=new BufferedReader(new FileReader("AreaCodes.txt"));
		    Map<Integer , String> map=new HashMap<Integer, String>();
		   
		    while(true){
		    	String line=bufferedReader.readLine();
		    	if (line==null) break;
		    	Scanner scanner=new Scanner(line);
		    	scanner.useDelimiter("-");
		    	map.put(scanner.nextInt(), scanner.next());
		    }
		    
		    Scanner scanner2=new Scanner(System.in);
		    while(true){
		    	System.out.print("enter a code:");
		    	int num=scanner2.nextInt();
		        System.out.println(map.get(num));
		    }
		    	    
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
