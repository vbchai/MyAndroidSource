package com.wilber.myandroidsource.annotation;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by PMA on 05/04/2016.
 */
public class AnnotationReferences {//put in syncadapter

    @Retention(RetentionPolicy.SOURCE)
    @IntDef({STATE_1, STATE_2, STATE_3})
    public @interface Status{}

    public static final int STATE_1 = 0;
    public static final int STATE_2 = 1;
    public static final int STATE_3 = 2;

}
