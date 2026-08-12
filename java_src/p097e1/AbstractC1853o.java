package p097e1;

import android.content.Context;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: e1.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1853o {

    /* JADX INFO: renamed from: a */
    protected final C1854p f9281a;

    /* JADX INFO: renamed from: b */
    private final IntentFilter f9282b;

    /* JADX INFO: renamed from: c */
    private final Context f9283c;

    /* JADX INFO: renamed from: d */
    protected final Set f9284d = new HashSet();

    /* JADX INFO: renamed from: e */
    private volatile boolean f9285e = false;

    protected AbstractC1853o(C1854p c1854p, IntentFilter intentFilter, Context context) {
        this.f9281a = c1854p;
        this.f9282b = intentFilter;
        this.f9283c = AbstractC1838C.m9633a(context);
    }
}
