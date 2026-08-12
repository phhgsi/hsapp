package p153u0;

import android.content.Context;
import p010D0.InterfaceC0092a;

/* JADX INFO: renamed from: u0.c */
/* JADX INFO: loaded from: classes.dex */
final class C2458c extends AbstractC2463h {

    /* JADX INFO: renamed from: a */
    private final Context f11443a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0092a f11444b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0092a f11445c;

    /* JADX INFO: renamed from: d */
    private final String f11446d;

    C2458c(Context context, InterfaceC0092a interfaceC0092a, InterfaceC0092a interfaceC0092a2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f11443a = context;
        if (interfaceC0092a == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f11444b = interfaceC0092a;
        if (interfaceC0092a2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f11445c = interfaceC0092a2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f11446d = str;
    }

    @Override // p153u0.AbstractC2463h
    /* JADX INFO: renamed from: b */
    public Context mo11762b() {
        return this.f11443a;
    }

    @Override // p153u0.AbstractC2463h
    /* JADX INFO: renamed from: c */
    public String mo11763c() {
        return this.f11446d;
    }

    @Override // p153u0.AbstractC2463h
    /* JADX INFO: renamed from: d */
    public InterfaceC0092a mo11764d() {
        return this.f11445c;
    }

    @Override // p153u0.AbstractC2463h
    /* JADX INFO: renamed from: e */
    public InterfaceC0092a mo11765e() {
        return this.f11444b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2463h) {
            AbstractC2463h abstractC2463h = (AbstractC2463h) obj;
            if (this.f11443a.equals(abstractC2463h.mo11762b()) && this.f11444b.equals(abstractC2463h.mo11765e()) && this.f11445c.equals(abstractC2463h.mo11764d()) && this.f11446d.equals(abstractC2463h.mo11763c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f11443a.hashCode() ^ 1000003) * 1000003) ^ this.f11444b.hashCode()) * 1000003) ^ this.f11445c.hashCode()) * 1000003) ^ this.f11446d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f11443a + ", wallClock=" + this.f11444b + ", monotonicClock=" + this.f11445c + ", backendName=" + this.f11446d + "}";
    }
}
