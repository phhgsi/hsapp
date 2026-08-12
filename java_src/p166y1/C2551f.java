package p166y1;

import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import p002A1.InterfaceC0027b;
import p012E.AbstractC0125v;
import p026I1.InterfaceC0224i;
import p129m1.C2267e;
import p136o1.InterfaceC2299a;
import p139p1.C2318E;
import p139p1.C2322c;
import p139p1.C2337r;
import p139p1.InterfaceC2324e;
import p139p1.InterfaceC2327h;
import p166y1.InterfaceC2555j;

/* JADX INFO: renamed from: y1.f */
/* JADX INFO: loaded from: classes.dex */
public class C2551f implements InterfaceC2554i, InterfaceC2555j {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0027b f11852a;

    /* JADX INFO: renamed from: b */
    private final Context f11853b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0027b f11854c;

    /* JADX INFO: renamed from: d */
    private final Set f11855d;

    /* JADX INFO: renamed from: e */
    private final Executor f11856e;

    private C2551f(final Context context, final String str, Set set, InterfaceC0027b interfaceC0027b, Executor executor) {
        this(new InterfaceC0027b() { // from class: y1.c
            @Override // p002A1.InterfaceC0027b
            public final Object get() {
                return C2551f.m12197d(context, str);
            }
        }, set, executor, interfaceC0027b, context);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m12196c(C2551f c2551f) {
        String string;
        synchronized (c2551f) {
            try {
                C2562q c2562q = (C2562q) c2551f.f11852a.get();
                List listM12219c = c2562q.m12219c();
                c2562q.m12218b();
                JSONArray jSONArray = new JSONArray();
                for (int i3 = 0; i3 < listM12219c.size(); i3++) {
                    AbstractC2563r abstractC2563r = (AbstractC2563r) listM12219c.get(i3);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", abstractC2563r.mo12195c());
                    jSONObject.put("dates", new JSONArray((Collection) abstractC2563r.mo12194b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C2562q m12197d(Context context, String str) {
        return new C2562q(context, str);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C2551f m12198e(C2318E c2318e, InterfaceC2324e interfaceC2324e) {
        return new C2551f((Context) interfaceC2324e.mo11086a(Context.class), ((C2267e) interfaceC2324e.mo11086a(C2267e.class)).m10851n(), interfaceC2324e.mo11088c(InterfaceC2552g.class), interfaceC2324e.mo11089d(InterfaceC0224i.class), (Executor) interfaceC2324e.mo11091f(c2318e));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Void m12199f(C2551f c2551f) {
        synchronized (c2551f) {
            ((C2562q) c2551f.f11852a.get()).m12224k(System.currentTimeMillis(), ((InterfaceC0224i) c2551f.f11854c.get()).mo619a());
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static C2322c m12200g() {
        final C2318E c2318eM11084a = C2318E.m11084a(InterfaceC2299a.class, Executor.class);
        return C2322c.m11096d(C2551f.class, InterfaceC2554i.class, InterfaceC2555j.class).m11115b(C2337r.m11166j(Context.class)).m11115b(C2337r.m11166j(C2267e.class)).m11115b(C2337r.m11169m(InterfaceC2552g.class)).m11115b(C2337r.m11168l(InterfaceC0224i.class)).m11115b(C2337r.m11167k(c2318eM11084a)).m11119f(new InterfaceC2327h() { // from class: y1.b
            @Override // p139p1.InterfaceC2327h
            /* JADX INFO: renamed from: a */
            public final Object mo195a(InterfaceC2324e interfaceC2324e) {
                return C2551f.m12198e(c2318eM11084a, interfaceC2324e);
            }
        }).m11117d();
    }

    @Override // p166y1.InterfaceC2554i
    /* JADX INFO: renamed from: a */
    public Task mo12201a() {
        return !AbstractC0125v.m361a(this.f11853b) ? Tasks.forResult("") : Tasks.call(this.f11856e, new Callable() { // from class: y1.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C2551f.m12196c(this.f11850a);
            }
        });
    }

    @Override // p166y1.InterfaceC2555j
    /* JADX INFO: renamed from: b */
    public synchronized InterfaceC2555j.a mo12202b(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2562q c2562q = (C2562q) this.f11852a.get();
        if (!c2562q.m12222i(jCurrentTimeMillis)) {
            return InterfaceC2555j.a.NONE;
        }
        c2562q.m12221g();
        return InterfaceC2555j.a.GLOBAL;
    }

    /* JADX INFO: renamed from: h */
    public Task m12203h() {
        return this.f11855d.size() <= 0 ? Tasks.forResult(null) : !AbstractC0125v.m361a(this.f11853b) ? Tasks.forResult(null) : Tasks.call(this.f11856e, new Callable() { // from class: y1.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C2551f.m12199f(this.f11851a);
            }
        });
    }

    C2551f(InterfaceC0027b interfaceC0027b, Set set, Executor executor, InterfaceC0027b interfaceC0027b2, Context context) {
        this.f11852a = interfaceC0027b;
        this.f11855d = set;
        this.f11856e = executor;
        this.f11854c = interfaceC0027b2;
        this.f11853b = context;
    }
}
