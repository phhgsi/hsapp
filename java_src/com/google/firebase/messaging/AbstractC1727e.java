package com.google.firebase.messaging;

import android.os.Bundle;
import androidx.collection.C0921a;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.firebase.messaging.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1727e {

    /* JADX INFO: renamed from: a */
    public static final long f8606a = TimeUnit.MINUTES.toMillis(3);

    /* JADX INFO: renamed from: com.google.firebase.messaging.e$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static C0921a m9430a(Bundle bundle) {
            C0921a c0921a = new C0921a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c0921a.put(str, str2);
                    }
                }
            }
            return c0921a;
        }
    }
}
