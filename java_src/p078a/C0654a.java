package p078a;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0654a {

    /* JADX INFO: renamed from: a */
    private final Set f2342a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b */
    private volatile Context f2343b;

    /* JADX INFO: renamed from: a */
    public final void m2491a(InterfaceC0655b interfaceC0655b) {
        AbstractC0606k.m2145e(interfaceC0655b, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Context context = this.f2343b;
        if (context != null) {
            interfaceC0655b.mo2494a(context);
        }
        this.f2342a.add(interfaceC0655b);
    }

    /* JADX INFO: renamed from: b */
    public final void m2492b() {
        this.f2343b = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m2493c(Context context) {
        AbstractC0606k.m2145e(context, "context");
        this.f2343b = context;
        Iterator it = this.f2342a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0655b) it.next()).mo2494a(context);
        }
    }
}
