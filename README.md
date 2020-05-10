# Demo app that displays the issue in Android 10 Documents UI

Actual Documents UI displays only one GET_CONTENT intent handler activity from unique package.

I reproduce the bug on Android 10 and 11.

Steps to reproduce with demo app from this repo:
1. run the app;
2. push "launch";
3. see the bug.

**Expected result:** you can see "First provider" and "Second provider".\
**Actual result:** you can see only "Second provider" on Android 10 and 11.

Android 9 and below | Android 10 and above
------------ | -------------
![no bug](https://i.imgur.com/ZDh8bbU.png) | ![bug](https://i.imgur.com/XVFITWx.png)

I guess the problem is in the 
[following line of code](https://cs.android.com/android/platform/superproject/+/master:packages/apps/DocumentsUI/src/com/android/documentsui/sidebar/RootsFragment.java;l=370)
 (maps unique package to single handler).

You can download already built apk [here](https://drive.google.com/file/d/1PnF6YQ2jtoKpKnqWwLe0nQ0oIMSGKkRO/view?usp=sharing).
