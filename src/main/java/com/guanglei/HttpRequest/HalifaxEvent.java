package com.guanglei.HttpRequest;

import java.io.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.*;

import org.apache.commons.lang3.StringUtils;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

/**
 * 
 * @author guanglei
 *
 */

public class HalifaxEvent {
	
	public void getFebruaryEvent() {
		Logger logger = LoggerFactory.getLogger( HalifaxEvent.class );
		String url = "http://www.destinationhalifax.com/content/winter-events-halifax";
		try {
			Document doc = Jsoup.connect(url).get();
			Element content = doc.getElementById("content");
			Elements event = content.select("span[style*=color: rgb(51, 51, 51);]");
			System.out.println("The February has following events: ");
			for (Element a : event) {
				  String eventText = a.text();
				  if(eventText.contains("February"))
					  System.out.println(eventText);		  
			}
		}
		catch(Exception e) {
			logger.error("Something is wrong here");
		}
		
		
		//create a socket
		/*
		String hostname = "www.destinationhalifax.com";
		String path="/content/winter-events-halifax";
		int port = 80;
		try {
			Socket socket = new Socket(InetAddress.getByName(hostname), port);
			BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(
			socket.getOutputStream(), "UTF8"));
			wr.write("GET "+ path +" HTTP/1.1\r\n");
			wr.write("HOST:" + "www.destinationhalifax.com" + "\r\n");
			wr.write("\r\n");
			wr.flush(); 
			// receive returned value
			BufferedReader rd = new BufferedReader(new InputStreamReader(
			socket.getInputStream()));
			
			String line;
			System.out.println("The February has following events: ");
			while ((line = rd.readLine()) != null) {
				if(line.contains("February")&&!line.startsWith("<p>"))
				{
					line =StringUtils.substringBetween(line,"blank", "</a>");
					line =StringUtils.remove(line,'"');
					line =StringUtils.remove(line,"&nbsp");
					line =StringUtils.remove(line,"<em>");
					line =StringUtils.remove(line,"</em>");
					line =StringUtils.remove(line,";");
					line =StringUtils.remove(line,"amp");
					line =StringUtils.remove(line,">");
					System.out.println(line);
				}
			}
			wr.close();
			rd.close();
			socket.close();
			
			
		}
		catch(Exception e){
			logger.error("Something is wrong here");
		}
		*/
		
	}
	
	public void getJanuaryEvent() {
		Logger logger = LoggerFactory.getLogger( HalifaxEvent.class );
		String url = "http://www.destinationhalifax.com/content/winter-events-halifax";
		try {
			Document doc = Jsoup.connect(url).get();
			Element content = doc.getElementById("content");
			Elements links = content.select("span[style*=font-size:16px;]");
			Elements event = links.select("a[target*=_blank]");
			System.out.println("The January has following events: ");
			for (Element a : event) {
				  String eventText = a.text();
				  System.out.println(eventText);		  
			}  
		}
		catch(Exception e) {
			logger.error("Something is wrong here");
		}
		
	}
}
		
	