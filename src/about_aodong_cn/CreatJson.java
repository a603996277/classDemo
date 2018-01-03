package about_aodong_cn;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class CreatJson {

	public static void main(String[] args) {
		JsonObject object = new JsonObject();
		object.addProperty("cat", "it");
		JsonArray array = new JsonArray();
		JsonObject lan1 = new JsonObject();
		lan1.addProperty("id", 1);
		lan1.addProperty("ide", "eclipse");
		lan1.addProperty("lan","java");
		array.add(lan1);
		
		JsonObject lan2 = new JsonObject();
		lan1.addProperty("id", 2);
		lan1.addProperty("ide", "X-code");
		lan1.addProperty("lan","swift");
		array.add(lan2);
		
		JsonObject lan3 = new JsonObject();
		lan1.addProperty("id", 3);
		lan1.addProperty("ide", "Visul Studio");
		lan1.addProperty("lan","c#");
		array.add(lan3);
		object.add("language", array);
		
		System.out.println(object.toString());
		System.out.println("123");
	}

}
