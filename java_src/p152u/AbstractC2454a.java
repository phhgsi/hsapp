package p152u;

import android.view.View;

/* JADX INFO: renamed from: u.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2454a {
    /* JADX INFO: renamed from: a */
    public static String m11754a(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
