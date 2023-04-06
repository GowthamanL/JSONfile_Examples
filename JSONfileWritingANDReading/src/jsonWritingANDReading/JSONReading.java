package jsonWritingANDReading;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONReading {

	public static void main(String[] args) throws IOException, ParseException {

		FileReader file=new FileReader("Gowtham.json");

		JSONParser parser=new JSONParser();

		Object parsedObj=parser.parse(file);

		JSONObject jsonObj=(JSONObject) parsedObj;
		
		String name=(String) jsonObj.get("Name");
		Long age=(Long)jsonObj.get("Age");
		System.out.println("Name is : "+name);
		System.out.println("Age is : "+age);

		JSONArray array=(JSONArray) jsonObj.get("Characteristics");
		
		Iterator iterator=array.iterator();
		
		while (iterator.hasNext())
		{
			System.out.println("Characteristic : "+iterator.next());

		}
	}
}
