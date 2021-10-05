package httprequests;

import org.json.JSONArray;
import org.json.JSONObject;

public class Split {
    public static String parse(String responseBody) {
        JSONArray albums = new JSONArray(responseBody);
        for (int i = 0; i < albums.length(); i++) {
            JSONObject album = albums.getJSONObject(i);
            int id = album.getInt("id");
            int userId = album.getInt("userId");
            String title = album.getString("title");
            // store this data in database, show it in UI, now print in console.
            System.out.println(id + " " + title+ " " + userId);
        }
        return null;

}}

