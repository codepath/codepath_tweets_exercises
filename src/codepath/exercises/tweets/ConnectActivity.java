package codepath.exercises.tweets;

import codepath.exercises.scaffold.OAuthLoginActivity;
import codepath.exercises.scaffold.TwitterClient;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class ConnectActivity extends OAuthLoginActivity<TwitterClient> {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_connect);
	}

	// Triggered automatically when twitter authentication is successful
	@Override
	public void onLoginSuccess() {
		// We should probably launch the main timeline view on twitter success
	}

	// Triggered automatically if twitter authentication fails
	@Override
	public void onLoginFailure(Exception e) {
		e.printStackTrace();
	}

	// This method should be used as the onClick handler for a "Connect" button
	// Triggers an auto-connect function built into TwitterClient
	// which prompts users to sign into twitter so we can access the twitter API.
	public void loginToTwitter(View view) {
		getClient().connect();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_connect, menu);
		return true;
	}
}