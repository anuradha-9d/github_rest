package com.anu.githubrest;



import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
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

}
