---
layout: exercises
title: Exercise 1
---

## Exercise 1 - App Fundamentals

The goal of this exercise is to set up the initial project, configure a few application settings in the AndroidManifest.xml, and make some minor modifications to an Activity. You will begin by downloading a starting project that is mostly blank, but includes some libraries to make it easier to work with the Twitter API.

### Tasks

1. Download the initial project [here][1]. 
2. Run the application on your Android phone or the emulator.
3. Modify some application properties
   - Change the name of your Twitter client to one of your choosing.
   - Download an image to use as the app icon.
      - Use the [asset studio][2] to create images with the appropriate dimensions.
4. Create a new activity called LoginActivity
   - Add a TextView
   - Add a Button (the name should be from a string resource)
5. Logging
   - In your LoginActivity, add log messages in the onCreate, onPause, and onResume methods with a tag like "DEBUG".
   - Create a log filter for the LogCat view that only shows log messages with the tag, "DEBUG"
   - Ensure that you can see the activity lifecycle messages in LogCat when you run the application.

### Hints

Use the code below to log a message in an activity.

{% highlight java %}
Log.d("DEBUG", "This message should appear in the LogCat.");
{% endhighlight %}

[1]: https://github.com/thecodepath/codepath_tweets_exercises
[2]: http://android-ui-utils.googlecode.com/hg/asset-studio/dist/icons-launcher.html