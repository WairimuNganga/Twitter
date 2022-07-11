package dev.wairimu.tweet

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweetRVAdapter(var tweetList:List<Tweet>):RecyclerView.Adapter<TweetViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
        var tweetView = LayoutInflater.from(parent.context).inflate(R.layout.tweet_item,parent,false)
        return TweetViewHolder(tweetView)
    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        var currentTweet = tweetList.get(position)
        holder.tvName.text = currentTweet.name
        holder.tvDate.text = currentTweet.date
        holder.tvComment.text = currentTweet.tweet
        holder.tvLikeNo.text = currentTweet.noOfLikes
        holder.tvNoRetweets.text = currentTweet.numOfRetweets
    }
    override fun getItemCount(): Int {
        return tweetList.size
    }
}
class TweetViewHolder(tweetView: View):RecyclerView.ViewHolder(tweetView){
    var tvName= tweetView.findViewById<TextView>(R.id.tvName)
    var ivPerson = tweetView.findViewById<ImageView>(R.id.ivPerson)
    var tvDate = tweetView.findViewById<TextView>(R.id.tvDate)
    var ivMore= tweetView.findViewById<ImageView>(R.id.ivMore)
    var tvComment = tweetView.findViewById<TextView>(R.id.tvComment)
    var imgComment = tweetView.findViewById<ImageView>(R.id.imgComment)
    var imgRetweet = tweetView.findViewById<ImageView>(R.id.imgRetweet)
    var imgLike = tweetView.findViewById<ImageView>(R.id.imgLike)
    var tvLikeNo= tweetView.findViewById<TextView>(R.id.tvLikeNo)
    var imgDownload = tweetView.findViewById<ImageView>(R.id.imgDownload)
    var tvNoRetweets =tweetView.findViewById<TextView>(R.id.tvNoRetweets)

}