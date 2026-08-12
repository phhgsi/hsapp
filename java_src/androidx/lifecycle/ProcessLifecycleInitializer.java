package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.C1140v;
import androidx.startup.C1241a;
import java.util.List;
import p038M1.AbstractC0419m;
import p071X1.AbstractC0606k;
import p104g0.InterfaceC1975a;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC1975a {
    @Override // p104g0.InterfaceC1975a
    /* JADX INFO: renamed from: a */
    public List mo4490a() {
        return AbstractC0419m.m1459f();
    }

    @Override // p104g0.InterfaceC1975a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC1132n mo4491b(Context context) {
        AbstractC0606k.m2145e(context, "context");
        C1241a c1241aM6298e = C1241a.m6298e(context);
        AbstractC0606k.m2144d(c1241aM6298e, "getInstance(context)");
        if (!c1241aM6298e.m6303g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        C1129k.m5142a(context);
        C1140v.b bVar = C1140v.f5367i;
        bVar.m5177b(context);
        return bVar.m5176a();
    }
}
