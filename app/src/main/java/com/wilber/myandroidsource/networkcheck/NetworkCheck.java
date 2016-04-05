package com.wilber.myandroidsource.networkcheck;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by PMA on 05/04/2016.
 */
/* <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
 * must be included in AndroidManifest.xml in order to check network state
 */
public class NetworkCheck {

    public static boolean isNetworkAvailable(Context c) {
        ConnectivityManager connectivityManager = (ConnectivityManager)c.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();
        return activeNetwork != null && activeNetwork.isConnectedOrConnecting();
    }
}
