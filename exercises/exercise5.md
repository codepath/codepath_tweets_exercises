---
layout: exercises
title: Exercise 5
---

## Exercise 5 - User Flows

The goal of this exercise is to begin to connect the pieces of the application together.

1. LoginActivity
   - Upon successfully logging in, start the TimelineActivity.
2. TimelineActivity
   - When a user taps on a row in the ListView, start a ViewTweetActivity with the Tweet that the user tapped on.
3. ViewTweetActivity
   - On the reply button, start a ComposeActivity.
   - Note: replying to a tweet requires the id of the original tweet. The ComposeActivity should be able to distinguish between a tweet and a reply.
3. For TimelineActivity, add action bar items for compose and refresh
   - Access user info from twitter client to set the title
   - On compose, start the ComposeActivity
   - On refresh, fetch the home timeline using the Twitter client.


