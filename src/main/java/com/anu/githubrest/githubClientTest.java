package com.anu.githubrest;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

public class githubClientTest {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		// TODO Auto-generated method stub
	String URL = "https://api.github.com/users/anuradha-9d/gists";
		githubClient gt = new githubClient(URL);
		
		String response = gt.getResponse();
		
		System.out.println(response);
		System.out.println(gt.getStatus());
		
		gt.close();
		

	}

}
