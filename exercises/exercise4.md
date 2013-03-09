---
layout: exercises
title: Exercise 4
---

## Exercise 4 - Interaction

The goal of this exercise is to handle clicks to various areas of the Twitter app.

- ComposeActivity
   - Hook up the Tweet button to create a new tweet using the text in the EditText control. Print out a message if the post is successful or not. See the hints for an example of how to use the TwitterClient class.
- TimelineActivity
   - When a user taps on a row in the ListView, toast the text of the tweet that they clicked on.

### Hints

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