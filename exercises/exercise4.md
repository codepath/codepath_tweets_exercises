---
layout: exercises
title: Exercise 4
---

## Exercise 4 - Interaction

The goal of this exercise is to handle clicks to various areas of the Twitter app as well as to continue implementing integration with the Twitter client.

1. TimelineActivity
   - Fetch the home timeline tweets using the Twitter client (sample code in Hints)
   - Upon fetching the data, update the adapter.
2. ComposeActivity
   - Hook up the Tweet button to create a new tweet using the text in the EditText control. Print out a message if the post is successful or not. See the hints for an example of how to use the TwitterClient class.
3. ViewTweetActivity
   - Create a new Activity to display a single tweet (example design in Benchmarks).
   - Include buttons for reply, retweet, and favorite (sample code for using the Twitter client included in the Hints section).
   - Implement retweet and favorite. The reply button will be implemented in the next exercise.

### Hints

Using the Twitter client to fetch the home timeline.

{% highlight java %}
client.getHomeTimeline(new JsonHttpResponseHandler() {
    public void onSuccess(JSONArray json) {
        Log.d("DEBUG", "timeline: " + json.toString());
        ArrayList<Tweet> tweets = Tweet.fromJson(json);

        // Update the adapter with the new tweets.
    }

    public void onFailure(Exception e, JSONArray json) {
        Log.d("DEBUG", "Fetch timeline error: " + e.toString());
        Log.d("DEBUG", "Fetch timeline error json: " + json.toString());
    }
});
{% endhighlight %}

Using the Twitter client to post a Tweet.

{% highlight java %}
TwitterClient client = new TwitterClient();
client.postTweet("This is the tweet body!", new AsyncHttpResponseHandler() {
    public void onSuccess(String jsonTweetString) {
        Log.d("Successfully posted tweet!");
    }

    public void onFailure(Exception e) {
        Log.d("DEBUG", "Post reply error: " + e.toString());
        Toast.makeText(ComposeActivity.this, "Error posting tweet! ", 
          Toast.LENGTH_SHORT).show();
    }
});
{% endhighlight %}

Using the Twitter client to retweet a Tweet.

{% highlight java %}
client.retweet(tweetId, new AsyncHttpResponseHandler() {
    @Override
    public void onSuccess(int i, String s) {
        Log.d("DEBUG", "retweet: " + s);
        Toast.makeText(getBaseContext(), "Retweeted!", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onFailure(Throwable throwable, String s) {
        Log.d("DEBUG", s);
        Toast.makeText(getBaseContext(), "Error retweeting.", Toast.LENGTH_SHORT).show();
    }
});
{% endhighlight %}

Using the Twitter client to favorite a Tweet.

{% highlight java %}
client.favorite(tweetId, new AsyncHttpResponseHandler() {
    @Override
    public void onSuccess(int i, String s) {
        Log.d("DEBUG", "favorite: " + s);
        Toast.makeText(getBaseContext(), "Favorited!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailure(Throwable throwable, String s) {
        Log.d("DEBUG", s);
        Toast.makeText(getBaseContext(), "Error favoriting.", Toast.LENGTH_SHORT).show();
    }
});
{% endhighlight %}

### Benchmarks

<img src="{{ site.base_url }}/images/tweet.png" alt="View Tweet" height="400" />