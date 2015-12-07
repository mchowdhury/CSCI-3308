## Awake+

If you struggle waking up in the morning without hitting the snooze button or if you enjoy getting rewarded for things you already do, Awake+ is for you! We incorporate the psychological principle of gamification into our alarm clock to motivate you to get up in the morning. Our system is simple: wake up without hitting snooze to earn points which you can redeem for great rewards such as buy one get one free's and discounts at local restaurants and more.

The interface is user friendly and derived from the [Android Open Source Project's DeskClock](https://android.googlesource.com/platform/packages/apps/DeskClock/) application, so it won't require any new learning. Just download and start earning!
  
The repository is organized with all pdf, text, and presentations in the home directory and all code in the Awake+ directory. The code that we modified is located in the Awake+ directory under Awake+/app/src/main/java/com/android/deskclock.

The Documentation is located in the JavaDocs folder from the home directory.

TO BUILD/RUN:

  </br>
  <h5>Prerequisites:</h5>
  <p>Android device running Android 4.4+ with root access</p>
  </br>
<h5>Download and Installation Instructions:</h5>

1. Using a ADB or a terminal on your phone remove the Android DeskClock Application:
<table class="wikitable">
<tr>
<th style="width: 500px; font-size: 125%;">ADB
</th>
<th style="width: 500px; font-size: 125%;">Terminal (on device)
</th>
<tr>
<td>
<pre><code>$ adb root
$ adb remount
$ adb shell rm -f /system/app/DeskClock.apk</code>
</pre>
</td>
<td>
<pre><code>$ su
$ mount -o rw,remount /system
$ rm -f /system/app/DeskClock.apk
</code>
</pre>
</td></tr>
</table>
</br>

2. Reboot your phone.

3. Connect your phone to your computer and click the green run arrow in Android Studio.

4. The Awake+ app should automatically launch on your phone.
