---
layout: exercises
title: Exercise 2
---

## Exercise 2 - User Interface

The goal of this exercise is to implement the basic login view using a few basic views and layouts. You will also integrate with the Twitter library to support logging in to Twitter.

1. Add labels, images, and buttons to create the view of the LoginActivity
   - Must include at least 2 TextViews.  (e.g., a title and a subtitle)
   - Must include a Button or an ImageButton
   - Must use RelativeLayout
   - Experiment with match\_parent vs. wrap\_content
2. Integrate Twitter
   - Modify LoginActivity to subclass `OAuthLoginActivity<TwitterClient>`
   - Add methods for onLoginSuccess and onLoginFailure
   - Add method, onLoginButton
   - In the layout XML, add the android:onClick property to the button.
   - Clicking on the button should open Chrome and prompt you to login into Twitter.  Upon successfully logging in, you should see, "Successfully logged into Twitter!" in LogCat.

### Hints

Subclassing OAuthLoginActivity

{% highlight java %}
public class LoginActivity extends OAuthLoginActivity<TwitterClient> {
    @Override
    public void onLoginSuccess() {
        Log.d("DEBUG", "Successfully logged into Twitter!");
    }

    @Override
    public void onLoginFailure(Exception e) {
        Log.d("DEBUG", "Error logging in to Twitter!");
    }

    public void onLoginButton(View view) {
        getClient().connect();
    }
} 
{% endhighlight %}

Adding a click handler to a Button via XML

{% highlight xml %}
<Button
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:onClick="onLoginButton" />
{% endhighlight %}

### Benchmarks

See other benchmarks for login screens [here](http://www.android-app-patterns.com/category/start-screen).

<img src="{{ site.base_url }}/images/twitter_login.jpg" alt="Twitter Login Screen" height="400" />
<img src="{{ site.base_url }}/images/path_login.jpg" alt="Path Login Screen" height="400"  />