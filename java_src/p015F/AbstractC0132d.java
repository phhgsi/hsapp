package p015F;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import p015F.AbstractC0133e;

/* JADX INFO: renamed from: F.d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0132d {
    /* JADX INFO: renamed from: a */
    public static AbstractC0133e.a m370a(Context context, Uri uri) {
        return Build.VERSION.SDK_INT < 24 ? new AbstractC0133e.b(context, uri) : new AbstractC0133e.c(context, uri);
    }
}
