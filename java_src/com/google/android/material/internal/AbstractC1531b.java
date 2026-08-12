package com.google.android.material.internal;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: renamed from: com.google.android.material.internal.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1531b {
    /* JADX INFO: renamed from: a */
    public static Activity m8372a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
