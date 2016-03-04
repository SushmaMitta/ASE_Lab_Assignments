package com.mkyong.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class JerseyPostReminder {

		public static void main(String[] args) {

			try {

		        URL url = new URL("http://localhost:8080/RESTfulExample/rest/json/reminders/post");
		        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		        conn.setDoOutput(true);
		        conn.setRequestMethod("POST");
		        conn.setRequestProperty("Content-Type", "application/json");

		        String input = "{\"singer\":\"Metallica\",\"title\":\"Fade To Black\"}";
		        
		        OutputStream os = conn.getOutputStream();
		        os.write(input.getBytes());
		        os.flush();

		        if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
		            throw new RuntimeException("Failed : HTTP error code : "
		                + conn.getResponseCode());
		        }

		        BufferedReader br = new BufferedReader(new InputStreamReader(
		                (conn.getInputStream())));

		        String output;
		        System.out.println("Output from Server .... \n");
		        while ((output = br.readLine()) != null) {
		            System.out.println(output);
		        }

		        conn.disconnect();

		      } catch (MalformedURLException e) {

		        e.printStackTrace();

		      } catch (IOException e) {

		        e.printStackTrace();

		     }
		}
	
}
