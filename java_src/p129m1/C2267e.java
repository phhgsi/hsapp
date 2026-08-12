package p129m1;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import androidx.collection.C0921a;
import com.google.android.gms.common.api.internal.AbstractC1390a;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p002A1.InterfaceC0027b;
import p012E.AbstractC0125v;
import p017F1.C0151a;
import p029J1.AbstractC0329c;
import p029J1.C0328b;
import p139p1.C2322c;
import p139p1.C2326g;
import p139p1.C2334o;
import p139p1.C2343x;
import p142q1.EnumC2362l;
import p163x1.InterfaceC2526c;
import p166y1.C2551f;

/* JADX INFO: renamed from: m1.e */
/* JADX INFO: loaded from: classes.dex */
public class C2267e {

    /* JADX INFO: renamed from: k */
    private static final Object f10410k = new Object();

    /* JADX INFO: renamed from: l */
    static final Map f10411l = new C0921a();

    /* JADX INFO: renamed from: a */
    private final Context f10412a;

    /* JADX INFO: renamed from: b */
    private final String f10413b;

    /* JADX INFO: renamed from: c */
    private final C2274l f10414c;

    /* JADX INFO: renamed from: d */
    private final C2334o f10415d;

    /* JADX INFO: renamed from: g */
    private final C2343x f10418g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC0027b f10419h;

    /* JADX INFO: renamed from: e */
    private final AtomicBoolean f10416e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    private final AtomicBoolean f10417f = new AtomicBoolean();

    /* JADX INFO: renamed from: i */
    private final List f10420i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j */
    private final List f10421j = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: m1.e$a */
    public interface a {
        void onBackgroundStateChanged(boolean z2);
    }

    /* JADX INFO: renamed from: m1.e$b */
    private static class b implements BackgroundDetector.BackgroundStateChangeListener {

        /* JADX INFO: renamed from: a */
        private static AtomicReference f10422a = new AtomicReference();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static void m10855b(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f10422a.get() == null) {
                    b bVar = new b();
                    if (AbstractC1390a.m7213a(f10422a, null, bVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z2) {
            synchronized (C2267e.f10410k) {
                try {
                    ArrayList arrayList = new ArrayList(C2267e.f10411l.values());
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        C2267e c2267e = (C2267e) obj;
                        if (c2267e.f10416e.get()) {
                            c2267e.m10845v(z2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: m1.e$c */
    private static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: b */
        private static AtomicReference f10423b = new AtomicReference();

        /* JADX INFO: renamed from: a */
        private final Context f10424a;

        public c(Context context) {
            this.f10424a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static void m10857b(Context context) {
            if (f10423b.get() == null) {
                c cVar = new c(context);
                if (AbstractC1390a.m7213a(f10423b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m10858c() {
            this.f10424a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C2267e.f10410k) {
                try {
                    Iterator it = C2267e.f10411l.values().iterator();
                    while (it.hasNext()) {
                        ((C2267e) it.next()).m10840o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            m10858c();
        }
    }

    protected C2267e(final Context context, String str, C2274l c2274l) {
        this.f10412a = (Context) Preconditions.checkNotNull(context);
        this.f10413b = Preconditions.checkNotEmpty(str);
        this.f10414c = (C2274l) Preconditions.checkNotNull(c2274l);
        AbstractC2275m abstractC2275mM9508b = FirebaseInitProvider.m9508b();
        AbstractC0329c.m1171b("Firebase");
        AbstractC0329c.m1171b("ComponentDiscovery");
        List listM11129b = C2326g.m11127c(context, ComponentDiscoveryService.class).m11129b();
        AbstractC0329c.m1170a();
        AbstractC0329c.m1171b("Runtime");
        C2334o.b bVarM11150f = C2334o.m11136k(EnumC2362l.INSTANCE).m11148d(listM11129b).m11147c(new FirebaseCommonRegistrar()).m11147c(new ExecutorsRegistrar()).m11146b(C2322c.m11101q(context, Context.class, new Class[0])).m11146b(C2322c.m11101q(this, C2267e.class, new Class[0])).m11146b(C2322c.m11101q(c2274l, C2274l.class, new Class[0])).m11150f(new C0328b());
        if (AbstractC0125v.m361a(context) && FirebaseInitProvider.m9509c()) {
            bVarM11150f.m11146b(C2322c.m11101q(abstractC2275mM9508b, AbstractC2275m.class, new Class[0]));
        }
        C2334o c2334oM11149e = bVarM11150f.m11149e();
        this.f10415d = c2334oM11149e;
        AbstractC0329c.m1170a();
        this.f10418g = new C2343x(new InterfaceC0027b() { // from class: m1.c
            @Override // p002A1.InterfaceC0027b
            public final Object get() {
                return C2267e.m10833b(this.f10407a, context);
            }
        });
        this.f10419h = c2334oM11149e.mo11089d(C2551f.class);
        m10846g(new a() { // from class: m1.d
            @Override // p129m1.C2267e.a
            public final void onBackgroundStateChanged(boolean z2) {
                C2267e.m10832a(this.f10409a, z2);
            }
        });
        AbstractC0329c.m1170a();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10832a(C2267e c2267e, boolean z2) {
        if (z2) {
            c2267e.getClass();
        } else {
            ((C2551f) c2267e.f10419h.get()).m12203h();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C0151a m10833b(C2267e c2267e, Context context) {
        return new C0151a(context, c2267e.m10851n(), (InterfaceC2526c) c2267e.f10415d.mo11086a(InterfaceC2526c.class));
    }

    /* JADX INFO: renamed from: h */
    private void m10838h() {
        Preconditions.checkState(!this.f10417f.get(), "FirebaseApp was deleted");
    }

    /* JADX INFO: renamed from: k */
    public static C2267e m10839k() {
        C2267e c2267e;
        synchronized (f10410k) {
            try {
                c2267e = (C2267e) f10411l.get("[DEFAULT]");
                if (c2267e == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((C2551f) c2267e.f10419h.get()).m12203h();
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2267e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public void m10840o() {
        if (!AbstractC0125v.m361a(this.f10412a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m10849l());
            c.m10857b(this.f10412a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m10849l());
        this.f10415d.m11144n(m10853t());
        ((C2551f) this.f10419h.get()).m12203h();
    }

    /* JADX INFO: renamed from: p */
    public static C2267e m10841p(Context context) {
        synchronized (f10410k) {
            try {
                if (f10411l.containsKey("[DEFAULT]")) {
                    return m10839k();
                }
                C2274l c2274lM10860a = C2274l.m10860a(context);
                if (c2274lM10860a == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return m10842q(context, c2274lM10860a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static C2267e m10842q(Context context, C2274l c2274l) {
        return m10843r(context, c2274l, "[DEFAULT]");
    }

    /* JADX INFO: renamed from: r */
    public static C2267e m10843r(Context context, C2274l c2274l, String str) {
        C2267e c2267e;
        b.m10855b(context);
        String strM10844u = m10844u(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f10410k) {
            Map map = f10411l;
            Preconditions.checkState(!map.containsKey(strM10844u), "FirebaseApp name " + strM10844u + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            c2267e = new C2267e(context, strM10844u, c2274l);
            map.put(strM10844u, c2267e);
        }
        c2267e.m10840o();
        return c2267e;
    }

    /* JADX INFO: renamed from: u */
    private static String m10844u(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m10845v(boolean z2) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f10420i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).onBackgroundStateChanged(z2);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2267e) {
            return this.f10413b.equals(((C2267e) obj).m10849l());
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public void m10846g(a aVar) {
        m10838h();
        if (this.f10416e.get() && BackgroundDetector.getInstance().isInBackground()) {
            aVar.onBackgroundStateChanged(true);
        }
        this.f10420i.add(aVar);
    }

    public int hashCode() {
        return this.f10413b.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public Object m10847i(Class cls) {
        m10838h();
        return this.f10415d.mo11086a(cls);
    }

    /* JADX INFO: renamed from: j */
    public Context m10848j() {
        m10838h();
        return this.f10412a;
    }

    /* JADX INFO: renamed from: l */
    public String m10849l() {
        m10838h();
        return this.f10413b;
    }

    /* JADX INFO: renamed from: m */
    public C2274l m10850m() {
        m10838h();
        return this.f10414c;
    }

    /* JADX INFO: renamed from: n */
    public String m10851n() {
        return Base64Utils.encodeUrlSafeNoPadding(m10849l().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(m10850m().m10862c().getBytes(Charset.defaultCharset()));
    }

    /* JADX INFO: renamed from: s */
    public boolean m10852s() {
        m10838h();
        return ((C0151a) this.f10418g.get()).m427b();
    }

    /* JADX INFO: renamed from: t */
    public boolean m10853t() {
        return "[DEFAULT]".equals(m10849l());
    }

    public String toString() {
        return Objects.toStringHelper(this).add(AppMeasurementSdk.ConditionalUserProperty.NAME, this.f10413b).add("options", this.f10414c).toString();
    }
}
