package jsonfileparsing;


import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;
import com.mysql.cj.xdevapi.JsonArray;

public class Jsonfile {

	public static void main(String[] args) throws IOException, ParseException {
		
		JSONParser js = new JSONParser();
		
		FileReader fr = new FileReader("jsonfile.json");
		
		Object ob = js.parse(fr);
		
		JSONObject jo = (JSONObject)ob ;
		
		String name =(String)jo.get("a");
		
		long age =(long)jo.get("b");                                                              
		
		System.out.println(name +"   "+ age);
		
	     JSONArray jsarray =(JSONArray)jo.get("k");
		
		Iterator iterator = jsarray.iterator();
				
				while(iterator.hasNext()) {
					
					System.out.println(iterator.next());
					
					
				}
		
		

	}

}
