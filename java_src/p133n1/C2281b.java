package p133n1;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdy;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.internal.AbstractC1660a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p129m1.AbstractC2264b;
import p129m1.C2267e;
import p163x1.AbstractC2524a;
import p163x1.InterfaceC2525b;
import p163x1.InterfaceC2527d;

/* JADX INFO: renamed from: n1.b */
/* JADX INFO: loaded from: classes.dex */
public class C2281b implements InterfaceC2280a {

    /* JADX INFO: renamed from: c */
    private static volatile InterfaceC2280a f10457c;

    /* JADX INFO: renamed from: a */
    private final AppMeasurementSdk f10458a;

    /* JADX INFO: renamed from: b */
    final Map f10459b;

    private C2281b(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f10458a = appMeasurementSdk;
        this.f10459b = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC2280a m10888c(C2267e c2267e, Context context, InterfaceC2527d interfaceC2527d) {
        Preconditions.checkNotNull(c2267e);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(interfaceC2527d);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f10457c == null) {
            synchronized (C2281b.class) {
                try {
                    if (f10457c == null) {
                        Bundle bundle = new Bundle(1);
                        if (c2267e.m10853t()) {
                            interfaceC2527d.mo11178b(AbstractC2264b.class, new Executor() { // from class: n1.c
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new InterfaceC2525b() { // from class: n1.d
                                @Override // p163x1.InterfaceC2525b
                                /* JADX INFO: renamed from: a */
                                public final void mo9204a(AbstractC2524a abstractC2524a) {
                                    C2281b.m10889d(abstractC2524a);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", c2267e.m10852s());
                        }
                        f10457c = new C2281b(zzdy.zza(context, (String) null, (String) null, (String) null, bundle).zzb());
                    }
                } finally {
                }
            }
        }
        return f10457c;
    }

    /* JADX INFO: renamed from: d */
    static /* synthetic */ void m10889d(AbstractC2524a abstractC2524a) {
        throw null;
    }

    @Override // p133n1.InterfaceC2280a
    /* JADX INFO: renamed from: a */
    public void mo10886a(String str, String str2, Object obj) {
        if (AbstractC1660a.m9115e(str) && AbstractC1660a.m9113c(str, str2)) {
            this.f10458a.setUserProperty(str, str2, obj);
        }
    }

    @Override // p133n1.InterfaceC2280a
    /* JADX INFO: renamed from: b */
    public void mo10887b(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (AbstractC1660a.m9115e(str) && AbstractC1660a.m9112b(str2, bundle) && AbstractC1660a.m9114d(str, str2, bundle)) {
            AbstractC1660a.m9111a(str, str2, bundle);
            this.f10458a.logEvent(str, str2, bundle);
        }
    }
}
