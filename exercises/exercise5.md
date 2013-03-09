---
layout: exercises
title: Exercise 5
---

## Exercise 5 - User Flows

The goal of this application is to begin to connect the pieces of the application together.

1. LoginActivity
   - Upon successfully logging in, start the TimelineActivity.
2. Add action bar for compose and refresh
    - Access user info from twitter client to set the title
    - Add items to manu/activity_tweets
    - Implement intent for compose
    - Implement refresh
  - TimelineActivity (tapping to reply)
    - Add onClick listener to ListView
    - Launch a compose w/ embedded replyId and defaultText
    - In ComposeActivity, check for replyId and defaultText
  - Add load more
    - Add footer view to listview
    - Hook up onClick handler, call to twitter.getTimeline(page)
    - adapter.add()
    
### Hints