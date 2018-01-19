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
	
	public void getEventByMounth(int num) {
		Logger logger = LoggerFactory.getLogger( HalifaxEvent.class );
		switch(num){
			case 1:
			{	
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
					logger.error("Something is wrong here" , e);
				}
				break;
			}
			case 2:
			{
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
				break;
			}	
		}
	}
}
		
	