package p071X1;

import java.io.Serializable;
import p090c2.InterfaceC1314a;
import p090c2.InterfaceC1316c;

/* JADX INFO: renamed from: X1.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0598c implements InterfaceC1314a, Serializable {

    /* JADX INFO: renamed from: j */
    public static final Object f1993j = a.f2000d;

    /* JADX INFO: renamed from: d */
    private transient InterfaceC1314a f1994d;

    /* JADX INFO: renamed from: e */
    protected final Object f1995e;

    /* JADX INFO: renamed from: f */
    private final Class f1996f;

    /* JADX INFO: renamed from: g */
    private final String f1997g;

    /* JADX INFO: renamed from: h */
    private final String f1998h;

    /* JADX INFO: renamed from: i */
    private final boolean f1999i;

    /* JADX INFO: renamed from: X1.c$a */
    private static class a implements Serializable {

        /* JADX INFO: renamed from: d */
        private static final a f2000d = new a();

        private a() {
        }
    }

    protected AbstractC0598c(Object obj, Class cls, String str, String str2, boolean z2) {
        this.f1995e = obj;
        this.f1996f = cls;
        this.f1997g = str;
        this.f1998h = str2;
        this.f1999i = z2;
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC1314a mo2131c() {
        InterfaceC1314a interfaceC1314a = this.f1994d;
        if (interfaceC1314a != null) {
            return interfaceC1314a;
        }
        InterfaceC1314a interfaceC1314aMo2132e = mo2132e();
        this.f1994d = interfaceC1314aMo2132e;
        return interfaceC1314aMo2132e;
    }

    /* JADX INFO: renamed from: e */
    protected abstract InterfaceC1314a mo2132e();

    /* JADX INFO: renamed from: g */
    public Object m2133g() {
        return this.f1995e;
    }

    /* JADX INFO: renamed from: h */
    public String m2134h() {
        return this.f1997g;
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC1316c m2135i() {
        Class cls = this.f1996f;
        if (cls == null) {
            return null;
        }
        return this.f1999i ? AbstractC0614s.m2157c(cls) : AbstractC0614s.m2156b(cls);
    }

    /* JADX INFO: renamed from: j */
    public String m2136j() {
        return this.f1998h;
    }
}
