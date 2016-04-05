package com.wilber.myandroidsource.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by PMA on 05/04/2016.
 */
public class PreferencesReferences {

    @Retention(RetentionPolicy.SOURCE)
    @IntDef({STATE_1, STATE_2, STATE_3})
    public @interface Status{}

    public static final int STATE_1 = 0;
    public static final int STATE_2 = 1;
    public static final int STATE_3 = 2;

    public static void sharedPreferencesExample(Context c, @Status int status) {// status  = STATE_1/STATE_2/STATE_3
        //getDefaultSharedPreferences is the same as getSharedPreferences(context.getPackageName() + "_Preferences", Context.MODE_PRIVATE);
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(c);
        SharedPreferences.Editor spe = sp.edit();

        //need to use @SuppressWarnings("ResourceType") when getInt from sharedPreferences when using annotation
        spe.putInt("key", status);
        spe.commit();
        /*
        commit is synchronous and apply is asynchronous
        consider when to use commit/apply to improve performance
         */
    }
}
