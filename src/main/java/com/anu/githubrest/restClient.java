package com.anu.githubrest;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

public interface restClient {
	
	public String getResponse() throws ClientProtocolException, IOException;
	public int getStatus();

}
