package com.example.tweetfilteredAPI.post;

import java.util.ArrayList;
import java.util.List;

import twitter4j.*;
import twitter4j.conf.*;

public class TwitterInfo {

	public List<Post> getPosts(){

		List<Post> allPosts = new ArrayList<Post>();
		List<String> media = null;

		ConfigurationBuilder configurationBuilder = new ConfigurationBuilder(); 							// Set up the configuration builder
		configurationBuilder.setDebugEnabled(true).setOAuthConsumerKey(ImportantConstants.CONSUMER_KEY) 	// For everything to work properly with Twitter's API
						.setOAuthConsumerSecret(ImportantConstants.CONSUMER_SECRET)							// We'd need the consumer key and secret AND
						.setOAuthAccessToken(ImportantConstants.ACCESS_TOKEN)								// The access token and secret.
						.setOAuthAccessTokenSecret(ImportantConstants.TOKEN_SECRET);
		
		Twitter twitter = new TwitterFactory(configurationBuilder.build()).getInstance(); // Getting the instance for the twitter account.
		
		try {
			User user = twitter.verifyCredentials(); // Getting the actual tweetfiltered account on twitter.
			List<Status> mentionedStatuses = twitter.getMentionsTimeline(); // Filling a list with the tweets we're menitioned in.
			
			for (Status s: mentionedStatuses) {

				
				if(s.getMediaEntities().length > 0) {
					media = new ArrayList<String>();

					for(int i = 0; i < s.getMediaEntities().length; i++) {
						if(s.getMediaEntities()[i].getType().equals("video")) media.add(s.getMediaEntities()[i].getVideoVariants()[0].getUrl()); // We get the video in its mp4 variant
						else media.add(s.getMediaEntities()[i].getMediaURL());
					}
				}
				else{
					media = null;
				}
					allPosts.add(new Post((s.getId()), s.getUser().getName(), s.getText().toString().replaceAll("https://t.co/[a-zA-Z_0-9]*",""), media));

				
			}
			
		}
		catch(TwitterException ex) { // We catch the exception and handle it.
			ex.printStackTrace();
			System.out.println("Failed to get tweets.");
			System.exit(-1);
		}
		catch(Exception ex){
			System.out.println("Problem with TwitterInfo...");
		}
		return allPosts;
	}

}
