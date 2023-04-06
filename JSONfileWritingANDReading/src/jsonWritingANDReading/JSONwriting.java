package jsonWritingANDReading;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONwriting {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("Name","Gowthaman");
		jsonObject.put("Age",26);
		
		JSONArray array=new JSONArray();
		array.add("Listner");
		array.add("Punctuality");
		
		jsonObject.put("Characteristics",array);
		
		FileWriter filewriter=new FileWriter("Gowtham.json");
		filewriter.write(jsonObject.toJSONString());
		filewriter.close();
		

	}

}
