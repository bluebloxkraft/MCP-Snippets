package client.pkg;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class UpdateChecker {

	private static boolean available = false;
	
	static String jsonUrl = "JSON URL goes here";
	
	public static boolean isAvailable() {
		return available;
	}
	
	public static void makeAvailable() {
		available = true;
	}
	
	public static void makeUnavailable() {
		available = false;
	}
	
	public static double getClientVersion() {
		return 1.0;
	}
	
	private static JsonArray getVersion(){
        JsonArray latestVer = new JsonArray();
        try{
            URL url = new URL(jsonUrl);
            InputStreamReader reader = new InputStreamReader(url.openStream());
            latestVer = new Gson().fromJson(reader, JsonArray.class);
        }catch (Exception e){
            e.printStackTrace();
        }
        return latestVer;
    }

	private static List<Double> version(){
        List<Double> ver = new ArrayList<>();
        for(JsonElement version : getVersion()){
            JsonObject e = version.getAsJsonObject();
            ver.add(e.get("version").getAsDouble());
        }
        return ver;
    }
	
	static double[] verArray = version().stream().mapToDouble(d -> d).toArray();
	
	public static void checkIfAvailable() {
		if(verArray.length == 1) {
			if(getClientVersion() < verArray[0]) {
				makeAvailable();
			} else {
				makeUnavailable();
			}
		}
	}
	
}