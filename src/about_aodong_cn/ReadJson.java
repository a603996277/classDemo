package about_aodong_cn;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.JsonArray;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;	

public class ReadJson {
	
	/**
	 * @param args
	 */
	public String GetValue(String item){
		String value = null;
		JsonParser parser= new JsonParser();
		try {
			JsonObject object=(JsonObject) parser.parse(new FileReader("lib/test.json"));
			JsonArray array =object.get("rows").getAsJsonArray();
			for (int i = 0; i < array.size();  i++) {
				 JsonObject arrayObject=array.get(i).getAsJsonObject();
				 value=arrayObject.get(item).getAsString();
				 //gald you game  summertrain
				 //System.out.println(item+":  ·µ»ØµÄÖµvalue    "+"value");
			}
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}

}
