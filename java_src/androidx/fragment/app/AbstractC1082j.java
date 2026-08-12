package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: renamed from: androidx.fragment.app.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1082j {
    /* JADX INFO: renamed from: b */
    public Fragment m4944b(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    /* JADX INFO: renamed from: e */
    public abstract View mo4736e(int i3);

    /* JADX INFO: renamed from: g */
    public abstract boolean mo4737g();
}
