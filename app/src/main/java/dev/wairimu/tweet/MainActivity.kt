package dev.wairimu.tweet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.wairimu.tweet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweets()
    }
    fun displayTweets(){
        var tweet1 = Tweet("Mumbi wa Njambi","29 July"," ","Make your life a masterpiece.#YOLO"," "," ","78","","89","","")
        var tweet2 = Tweet("Mumbi wa Njambi","29 July"," ","Make your life a masterpiece.#YOLO"," "," ","78","","89","","")
        var tweet3 = Tweet("Mumbi wa Njambi","29 July"," ","Make your life a masterpiece.#YOLO"," "," ","78","","89","","")
        var tweet4 = Tweet("Mumbi wa Njambi","29 July"," ","Make your life a masterpiece.#YOLO"," "," ","78","","89","","")
        var tweet5 = Tweet("Mumbi wa Njambi","29 July"," ","Make your life a masterpiece.#YOLO"," "," ","78","","89","","")
        var tweet6 = Tweet("Mumbi wa Njambi","29 July"," ","Make your life a masterpiece.#YOLO"," "," ","78","","89","","")
        var tweet7 = Tweet("Mumbi wa Njambi","29 July"," ","Make your life a masterpiece.#YOLO"," "," ","78","","89","","")
        var tweet8 = Tweet("Mumbi wa Njambi","29 July"," ","Make your life a masterpiece.#YOLO"," "," ","78","","89","","")
        var tweet9 = Tweet("Mumbi wa Njambi","29 July"," ","Make your life a masterpiece.#YOLO"," "," ","78","","89","","")
        var tweet10 = Tweet("Mumbi wa Njambi","29 July"," ","Make your life a masterpiece.#YOLO"," "," ","78","","89","","")
        var tweet11 = Tweet("Mumbi wa Njambi","29 July"," ","Make your life a masterpiece.#YOLO"," "," ","78","","89","","")
        var tweet12 = Tweet("Mumbi wa Njambi","29 July"," ","Make your life a masterpiece.#YOLO"," "," ","78","","89","","")
        var tweetList = listOf(tweet1,tweet10,tweet11,tweet12,tweet2,tweet3,tweet4,tweet5,tweet6,tweet7,tweet8,tweet9)
        var tweetsAdapter = TweetRVAdapter(tweetList)
        binding.rvTweets.layoutManager = LinearLayoutManager(this)
        binding.rvTweets.adapter = tweetsAdapter
    }

}