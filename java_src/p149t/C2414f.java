package p149t;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: t.f */
/* JADX INFO: loaded from: classes.dex */
public class C2414f implements InterfaceC2412d {

    /* JADX INFO: renamed from: d */
    AbstractC2424p f11278d;

    /* JADX INFO: renamed from: f */
    int f11280f;

    /* JADX INFO: renamed from: g */
    public int f11281g;

    /* JADX INFO: renamed from: a */
    public InterfaceC2412d f11275a = null;

    /* JADX INFO: renamed from: b */
    public boolean f11276b = false;

    /* JADX INFO: renamed from: c */
    public boolean f11277c = false;

    /* JADX INFO: renamed from: e */
    a f11279e = a.UNKNOWN;

    /* JADX INFO: renamed from: h */
    int f11282h = 1;

    /* JADX INFO: renamed from: i */
    C2415g f11283i = null;

    /* JADX INFO: renamed from: j */
    public boolean f11284j = false;

    /* JADX INFO: renamed from: k */
    List f11285k = new ArrayList();

    /* JADX INFO: renamed from: l */
    List f11286l = new ArrayList();

    /* JADX INFO: renamed from: t.f$a */
    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C2414f(AbstractC2424p abstractC2424p) {
        this.f11278d = abstractC2424p;
    }

    @Override // p149t.InterfaceC2412d
    /* JADX INFO: renamed from: a */
    public void mo11596a(InterfaceC2412d interfaceC2412d) {
        Iterator it = this.f11286l.iterator();
        while (it.hasNext()) {
            if (!((C2414f) it.next()).f11284j) {
                return;
            }
        }
        this.f11277c = true;
        InterfaceC2412d interfaceC2412d2 = this.f11275a;
        if (interfaceC2412d2 != null) {
            interfaceC2412d2.mo11596a(this);
        }
        if (this.f11276b) {
            this.f11278d.mo11596a(this);
            return;
        }
        C2414f c2414f = null;
        int i3 = 0;
        for (C2414f c2414f2 : this.f11286l) {
            if (!(c2414f2 instanceof C2415g)) {
                i3++;
                c2414f = c2414f2;
            }
        }
        if (c2414f != null && i3 == 1 && c2414f.f11284j) {
            C2415g c2415g = this.f11283i;
            if (c2415g != null) {
                if (!c2415g.f11284j) {
                    return;
                } else {
                    this.f11280f = this.f11282h * c2415g.f11281g;
                }
            }
            mo11618d(c2414f.f11281g + this.f11280f);
        }
        InterfaceC2412d interfaceC2412d3 = this.f11275a;
        if (interfaceC2412d3 != null) {
            interfaceC2412d3.mo11596a(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m11616b(InterfaceC2412d interfaceC2412d) {
        this.f11285k.add(interfaceC2412d);
        if (this.f11284j) {
            interfaceC2412d.mo11596a(interfaceC2412d);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m11617c() {
        this.f11286l.clear();
        this.f11285k.clear();
        this.f11284j = false;
        this.f11281g = 0;
        this.f11277c = false;
        this.f11276b = false;
    }

    /* JADX INFO: renamed from: d */
    public void mo11618d(int i3) {
        if (this.f11284j) {
            return;
        }
        this.f11284j = true;
        this.f11281g = i3;
        for (InterfaceC2412d interfaceC2412d : this.f11285k) {
            interfaceC2412d.mo11596a(interfaceC2412d);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11278d.f11329b.m11353t());
        sb.append(":");
        sb.append(this.f11279e);
        sb.append("(");
        sb.append(this.f11284j ? Integer.valueOf(this.f11281g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f11286l.size());
        sb.append(":d=");
        sb.append(this.f11285k.size());
        sb.append(">");
        return sb.toString();
    }
}
