package com.mejia.richard.zemoga;

import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import javax.swing.*;
import java.util.List;
import java.util.stream.Collectors;

public class ZemogaTestApplicationGetData {
	public static void main(String[] args) throws TwitterException {
//		Tweet();
		NewTweet();
	}

//	public static void Tweet() throws TwitterException {
//		ConfigurationBuilder cb = new ConfigurationBuilder();
//		cb.setDebugEnabled(true)
//				.setOAuthConsumerKey("KRy7l0v8wex3w8Sy5zThai3Ea")
//				.setOAuthConsumerSecret("X2eBm0Y21kYEuR74W3Frqc2JVIizOj8Q1EVGatDsEVVEJo0ucu")
//				.setOAuthAccessToken("1220032047516921859-otvXjhExyUTZ5GLxssc9h5ORqtPZja")
//				.setOAuthAccessTokenSecret("tmJKqM4ORfQW6CH7wIVV8uKNpmSEmeFAP8lYwGb19uYjj");
//		TwitterFactory tf = new TwitterFactory(cb.build());
//		Twitter twitter = tf.getInstance();
//
//		List<Status> status = twitter.getHomeTimeline();
//		for(Status s:status){
//			System.out.println("User: "+s.getUser());
//			System.out.println("Text: "+s.getText()+"\n");
//		}
//
//		Status tweetEscrito = twitter.updateStatus("this is my message RPMC");
//	}

	public static void NewTweet() throws TwitterException {
		Twitter twitter = TwitterFactory.getSingleton();
		String myTweet = "testing function in java";
		try {
//			String createTweet = createTweet(twitter, myTweet);
//			System.out.println("createTweet: "+createTweet);
			StringBuilder listHomeTimeLine = new StringBuilder();
			StringBuilder listHomeTimeLine2 = new StringBuilder();
			List<String> getHomeTimeline = getTimeLine(twitter);
			ResponseList<Status> getTimeLineResponseList = getTimeLineResponseList(twitter);
			for(String homeTimeline:getHomeTimeline){
				System.out.println("Text: "+homeTimeline+"\n");
				listHomeTimeLine.append(homeTimeline).append("\n");
			}
			for(Status homeTimeline2:getTimeLineResponseList){
				listHomeTimeLine2.append(homeTimeline2.getText());
				System.out.println("getId: "+homeTimeline2.getId()+"\n");
				System.out.println("getText: "+homeTimeline2.getText()+"\n");
				System.out.println("---------------------------------------------------");
			}
			JTextPane jtp = new JTextPane();
			jtp.setContentType("text/html");
			jtp.setText("<!DOCTYPE html>\n" +
					"<html lang=\"en\">\n" +
					"<head>\n" +
					"    <meta charset=\"UTF-8\">\n" +
					"    <title>Title</title>\n" +
					"</head>\n" +
					"<body>\n" +
					"<p>"+listHomeTimeLine2.toString()+"</p>\n" +
					"</body>\n" +
					"</html>"); //Your whole html here..
			jtp.print();
		}catch (Exception e){

		}
	}

	public static List<String> getTimeLine(Twitter twitter) throws TwitterException {
		return twitter.getHomeTimeline().stream()
				.map(item -> item.getText())
				.collect(Collectors.toList());
	}

	public static ResponseList<Status> getTimeLineResponseList(Twitter twitter) throws TwitterException {
		return twitter.getHomeTimeline();
//		return twitter.timelines().getUserTimeline();
	}

	public static String createTweet(Twitter twitter, String tweet) throws TwitterException {
		Status status = twitter.updateStatus(tweet);
		return status.getText();
	}
}
