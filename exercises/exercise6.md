---
layout: exercises
title: Exercise 6
---

## Exercise 6 - Networking

The goal of this exercise is to augment the User model to parse more of the JSON response and to use SmartImageView to display profile images.

1. In the User class, add an accessor for profileImageUrl
2. TimelineAdapter
   - Add a SmartImageView and display the profileImageUrl of the user for each tweet.
3. TimelineActivity
   - Add a "load more" button as a footer view to the ListView
   - Use the pages parameter to fetch subsequent pages of the home timeline. Note: you have to track what the current page is yourself.
