package p097e1;

import android.content.Context;

/* JADX INFO: renamed from: e1.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1838C {
    /* JADX INFO: renamed from: a */
    public static Context m9633a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }
}
