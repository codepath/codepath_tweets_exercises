---
layout: exercises
title: Bonus 1
---

## Bonus 1 - User Profile

This is a bonus exercise for creating a user timeline.

1. In a TimelineActivity, tapping on the user's profile picture should open that user's timeline of tweets.

## Hints

Using the Twitter client to fetch a user timeline.

{% highlight java %}
client.getUserTimeline(user.getId(), page, new JsonHttpResponseHandler() {
	public void onSuccess(JSONArray json) {
	    Log.d("DEBUG", "timeline: " + json.toString());
	    ArrayList<Tweet> tweets = Tweet.fromJson(json);

	    // Do something with user tweets
	}

	public void onFailure(Exception e, JSONArray json) {
	    Log.d("DEBUG", "Fetch timeline error: " + e.toString());
	    Log.d("DEBUG", "Fetch timeline error json: " + json.toString());
	}
});
{% endhighlight %}
