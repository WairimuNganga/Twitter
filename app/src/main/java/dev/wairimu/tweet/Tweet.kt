package dev.wairimu.tweet

import org.w3c.dom.Comment

data class Tweet(
  var name:String,
  var date:String,
  var person:String,
  var tweet:String,
  var like:String,
  var retweet:String,
  var numOfRetweets:String,
  var comments:String,
  var noOfLikes:String,
  var moreTweets:String,
  var upload:String
 )

