package p157v1;

import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p151t1.C2448b;
import p151t1.InterfaceC2447a;
import p151t1.InterfaceC2450d;
import p151t1.InterfaceC2451e;
import p151t1.InterfaceC2452f;
import p151t1.InterfaceC2453g;
import p154u1.InterfaceC2469a;
import p154u1.InterfaceC2470b;

/* JADX INFO: renamed from: v1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2481d implements InterfaceC2470b {

    /* JADX INFO: renamed from: e */
    private static final InterfaceC2450d f11488e = new InterfaceC2450d() { // from class: v1.a
        @Override // p151t1.InterfaceC2450d
        /* JADX INFO: renamed from: a */
        public final void mo9388a(Object obj, Object obj2) {
            C2481d.m11792c(obj, (InterfaceC2451e) obj2);
        }
    };

    /* JADX INFO: renamed from: f */
    private static final InterfaceC2452f f11489f = new InterfaceC2452f() { // from class: v1.b
        @Override // p151t1.InterfaceC2452f
        /* JADX INFO: renamed from: a */
        public final void mo11751a(Object obj, Object obj2) {
            ((InterfaceC2453g) obj2).mo11752b((String) obj);
        }
    };

    /* JADX INFO: renamed from: g */
    private static final InterfaceC2452f f11490g = new InterfaceC2452f() { // from class: v1.c
        @Override // p151t1.InterfaceC2452f
        /* JADX INFO: renamed from: a */
        public final void mo11751a(Object obj, Object obj2) {
            ((InterfaceC2453g) obj2).mo11753c(((Boolean) obj).booleanValue());
        }
    };

    /* JADX INFO: renamed from: h */
    private static final b f11491h = new b(null);

    /* JADX INFO: renamed from: a */
    private final Map f11492a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Map f11493b = new HashMap();

    /* JADX INFO: renamed from: c */
    private InterfaceC2450d f11494c = f11488e;

    /* JADX INFO: renamed from: d */
    private boolean f11495d = false;

    /* JADX INFO: renamed from: v1.d$a */
    class a implements InterfaceC2447a {
        a() {
        }

        @Override // p151t1.InterfaceC2447a
        /* JADX INFO: renamed from: a */
        public void mo11741a(Object obj, Writer writer) {
            C2482e c2482e = new C2482e(writer, C2481d.this.f11492a, C2481d.this.f11493b, C2481d.this.f11494c, C2481d.this.f11495d);
            c2482e.m11810h(obj, false);
            c2482e.m11817p();
        }
    }

    /* JADX INFO: renamed from: v1.d$b */
    private static final class b implements InterfaceC2452f {

        /* JADX INFO: renamed from: a */
        private static final DateFormat f11497a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f11497a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        @Override // p151t1.InterfaceC2452f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo11751a(Date date, InterfaceC2453g interfaceC2453g) {
            interfaceC2453g.mo11752b(f11497a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public C2481d() {
        m11802m(String.class, f11489f);
        m11802m(Boolean.class, f11490g);
        m11802m(Date.class, f11491h);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m11792c(Object obj, InterfaceC2451e interfaceC2451e) {
        throw new C2448b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC2447a m11798i() {
        return new a();
    }

    /* JADX INFO: renamed from: j */
    public C2481d m11799j(InterfaceC2469a interfaceC2469a) {
        interfaceC2469a.mo9387a(this);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public C2481d m11800k(boolean z2) {
        this.f11495d = z2;
        return this;
    }

    @Override // p154u1.InterfaceC2470b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C2481d mo11784a(Class cls, InterfaceC2450d interfaceC2450d) {
        this.f11492a.put(cls, interfaceC2450d);
        this.f11493b.remove(cls);
        return this;
    }

    /* JADX INFO: renamed from: m */
    public C2481d m11802m(Class cls, InterfaceC2452f interfaceC2452f) {
        this.f11493b.put(cls, interfaceC2452f);
        this.f11492a.remove(cls);
        return this;
    }
}
