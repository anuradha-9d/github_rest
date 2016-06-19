package com.anu.githubrest;



import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.http.client.ClientProtocolException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tests {
	
	String URL = "https://api.github.com/users/anuradha-9d/gists";
	
	@Test
	public void testReg() throws ClientProtocolException, IOException{
		githubClient gh = new githubClient(URL);		
		
		int status = gh.getStatus();
		Assert.assertEquals(200, status);
		}
	
	
	
	@Test
	public void printurl() throws ClientProtocolException, IOException, ParseException{
		githubClient gh = new githubClient(URL);
		String json = gh.getResponse();
		githubJsonParser jp = new githubJsonParser(json);
		jp.printurl();
		
	}
	
	@DataProvider(name = "dp")
	public Object[][] getTestInputs() throws IOException{
		String filePath = "/Users/rakesh.varma/Downloads/ViewOnly.xlsx";
		return excelUtils.readXLSXFile(filePath);
	}
	

}
