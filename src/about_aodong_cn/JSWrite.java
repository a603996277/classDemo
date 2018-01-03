package about_aodong_cn;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
public class JSWrite {
	public static void main(String[] args) {
		Jswrite();
	}
	private static void Jswrite(){
		JsonObject objet=new JsonObject();
		JsonObject arrObject=new JsonObject();
		JsonArray array=new JsonArray();
		objet.addProperty("people", "zhang");
		objet.add("element", array);
		arrObject.addProperty("age", "27");
		arrObject.addProperty("name", "zhang");
		arrObject.addProperty("hibbt", "ant");
		array.add(arrObject);
		System.out.println(objet.toString());
	}

}
