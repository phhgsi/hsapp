package p061U0;

import android.content.ContentResolver;
import android.provider.Settings;

/* JADX INFO: renamed from: U0.a */
/* JADX INFO: loaded from: classes.dex */
public class C0534a {
    /* JADX INFO: renamed from: a */
    public float m1914a(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
