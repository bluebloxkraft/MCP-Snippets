package client.pkg;

import java.io.InputStreamReader;
import java.net.URL;

import com.google.gson.Gson;

public class UpdateChecker {

	static String jsonFileUrl = "json url (for eg. https://github.com/BlueBloxKraft/MCP-Snippets/raw/main/JsonUpdateChecker/Example.json)";
	public static double latest_version = -1;
	
	/*
         * check the JSON file the latest version
       	 */
	public static void checkLatestVersion() {
		try {
			URL url = new URL(jsonFileUrl);
			InputStreamReader isr = new InputStreamReader(url.openStream());
			UpdateFile uf = new Gson().fromJson(isr, UpdateFile.class);
			
			latest_version = uf.version;
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * this boolean tells us whether an update has been found
	 */ 
	public static boolean foundUpdate() {
		return latest_version > YourClient.instance.version;
	}
	
	class UpdateFile {
		double version;
	}
	
}
