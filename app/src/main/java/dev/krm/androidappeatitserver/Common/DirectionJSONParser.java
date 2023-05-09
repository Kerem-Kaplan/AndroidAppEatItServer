package dev.krm.androidappeatitserver.Common;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
public class DirectionJSONParser {

    public List<List<HashMap<String, String>>> parse(JSONObject jObject) {

        List<List<HashMap<String, String>>> routes=new ArrayList<List<HashMap<String,String>>>();
        JSONArray jRoutes=null;
        JSONArray jLegs=null;
        JSONArray jSteps=null;

        try{
            jRoutes=jObject.getJSONArray("routes");
            for (int i= 0;i<jRoutes.length();i++){
                jLegs=((JSONObject)jRoutes.get(i)).getJSONArray("legs");
                List path =new ArrayList<HashMap<String,String>>();

                for (int j=0; j<jLegs.length();j++){
                    jSteps= jLegs=((JSONObject)jRoutes.get(i)).getJSONArray("legs");

                    for(int k =0;k<jSteps.length();k++){
                        String polyline="";
                    }
                }
            }

        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
return "";
    }
}
*/
