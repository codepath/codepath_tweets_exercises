---
layout: exercises
title: Exercise 3
---

## Exercise 3 - Views

The goal of this exercise is to create the activities for the ComposeActivity and the TimelineActivity. The ComposeActivity includes an EditText to collect user input. The TimeLineActivity includes a ListView which will display a list of tweets.

Note: to change which activity launches by default, modify the AndroidManifest.xml and move the intent-filter to the Activity you want to launch. Only put the intent-filter in one Activity.

{% highlight xml %}
<activity
    android:name="com.example.testapp.SecondActivity"
    android:label="@string/title_activity_second" >
    <intent-filter>
        <action android:name="android.intent.action.MAIN" />
        <category android:name="android.intent.category.LAUNCHER" />
    </intent-filter>
</activity>
{% endhighlight %}

1. Create a new activity, ComposeActivity
   - At a minimum, add a Cancel button, a Tweet button, and an EditText control.
   - Experiment with setting the background property to a hex color like "#888888".
   - Experiment with layout_margin and padding.
   - When the ComposeActivity launches, the keyboard should be visible immediately.
   - The screenshot in the benchmarks section should give you an idea of what a compose activity could look like.
2. Create a User class
   - Should include fields and public accessors for screenName, name, and profileImageUrl.
3. Create a Tweet class
   - Should include fields and public accessors for user (of type User), and text.
   - Should include a static method called fakeTweets. The method fakeTweets should return an `ArrayList<Tweet>` of at least 3 manually created tweets with user objects and text.
4. Create a new activity, TimelineActivity
   - Should include a ListView
   - Create a TweetAdapter with tweets from the `Tweet.fakeTweets()` method.
   - Set the adapter of the ListView
5. Create a new class, `TimelineAdapter` that extends `ArrayAdapter<Tweet>`
   - Create a new layout file called tweet_item.xml that represents the view of a tweet. Should include a layout that contains a TextView for the user's name and a TextView for the tweet.
      - Set background color, margin, padding, font of the layout and TextViews as appropriate.
   - Create a constructor that takes a context and an `ArrayList<Tweet>`
   - Override the getView method to configure the view of the tweet.

### Hints

Sample constructor of the `TimelineAdapter`

{% highlight java %}
public class TimelineAdapter extends ArrayAdapter<Tweet> {
    
    public TimelineAdapter(Context context, ArrayList<Tweet> items) {
        super(context, 0, items);
    }
}
{% endhighlight %}

### Benchmarks

<img src="{{ site.base_url }}/images/compose.png" alt="Compose Screen" width="400" height="453" />

TODO: Add a screenshot w/ a very basic tweet view