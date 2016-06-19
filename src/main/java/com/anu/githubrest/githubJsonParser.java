package com.anu.githubrest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;


public class githubJsonParser {
	JSONArray jsonObject;
	
	public githubJsonParser(String Json) throws ParseException{
		JSONParser parser = new JSONParser();
	}
	
	
	public void printurl(){
		for(int i =0;i<jsonObject.size();i++){
			JSONObject gist = (JSONObject)jsonObject.get(i);
			String url = (String) gist.get("url");
			String desc = (String) gist.get("description");
			System.out.println(desc + "=" + url);	
		}
		 
	}

}
