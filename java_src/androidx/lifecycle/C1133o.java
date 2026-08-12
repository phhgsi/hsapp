package androidx.lifecycle;

import androidx.lifecycle.AbstractC1126h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;
import p115j.C2044c;
import p119k.C2108a;
import p119k.C2109b;

/* JADX INFO: renamed from: androidx.lifecycle.o */
/* JADX INFO: loaded from: classes.dex */
public class C1133o extends AbstractC1126h {

    /* JADX INFO: renamed from: j */
    public static final a f5351j = new a(null);

    /* JADX INFO: renamed from: b */
    private final boolean f5352b;

    /* JADX INFO: renamed from: c */
    private C2108a f5353c;

    /* JADX INFO: renamed from: d */
    private AbstractC1126h.b f5354d;

    /* JADX INFO: renamed from: e */
    private final WeakReference f5355e;

    /* JADX INFO: renamed from: f */
    private int f5356f;

    /* JADX INFO: renamed from: g */
    private boolean f5357g;

    /* JADX INFO: renamed from: h */
    private boolean f5358h;

    /* JADX INFO: renamed from: i */
    private ArrayList f5359i;

    /* JADX INFO: renamed from: androidx.lifecycle.o$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0602g abstractC0602g) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC1126h.b m5154a(AbstractC1126h.b bVar, AbstractC1126h.b bVar2) {
            AbstractC0606k.m2145e(bVar, "state1");
            return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.o$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private AbstractC1126h.b f5360a;

        /* JADX INFO: renamed from: b */
        private InterfaceC1130l f5361b;

        public b(InterfaceC1131m interfaceC1131m, AbstractC1126h.b bVar) {
            AbstractC0606k.m2145e(bVar, "initialState");
            AbstractC0606k.m2142b(interfaceC1131m);
            this.f5361b = C1134p.m5162f(interfaceC1131m);
            this.f5360a = bVar;
        }

        /* JADX INFO: renamed from: a */
        public final void m5155a(InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar) {
            AbstractC0606k.m2145e(aVar, "event");
            AbstractC1126h.b bVarM5136b = aVar.m5136b();
            this.f5360a = C1133o.f5351j.m5154a(this.f5360a, bVarM5136b);
            InterfaceC1130l interfaceC1130l = this.f5361b;
            AbstractC0606k.m2142b(interfaceC1132n);
            interfaceC1130l.mo2537d(interfaceC1132n, aVar);
            this.f5360a = bVarM5136b;
        }

        /* JADX INFO: renamed from: b */
        public final AbstractC1126h.b m5156b() {
            return this.f5360a;
        }
    }

    private C1133o(InterfaceC1132n interfaceC1132n, boolean z2) {
        this.f5352b = z2;
        this.f5353c = new C2108a();
        this.f5354d = AbstractC1126h.b.INITIALIZED;
        this.f5359i = new ArrayList();
        this.f5355e = new WeakReference(interfaceC1132n);
    }

    /* JADX INFO: renamed from: d */
    private final void m5143d(InterfaceC1132n interfaceC1132n) {
        Iterator itDescendingIterator = this.f5353c.descendingIterator();
        AbstractC0606k.m2144d(itDescendingIterator, "observerMap.descendingIterator()");
        while (itDescendingIterator.hasNext() && !this.f5358h) {
            Map.Entry entry = (Map.Entry) itDescendingIterator.next();
            AbstractC0606k.m2144d(entry, "next()");
            InterfaceC1131m interfaceC1131m = (InterfaceC1131m) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.m5156b().compareTo(this.f5354d) > 0 && !this.f5358h && this.f5353c.contains(interfaceC1131m)) {
                AbstractC1126h.a aVarM5137a = AbstractC1126h.a.Companion.m5137a(bVar.m5156b());
                if (aVarM5137a == null) {
                    throw new IllegalStateException("no event down from " + bVar.m5156b());
                }
                m5150l(aVarM5137a.m5136b());
                bVar.m5155a(interfaceC1132n, aVarM5137a);
                m5149k();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private final AbstractC1126h.b m5144e(InterfaceC1131m interfaceC1131m) {
        b bVar;
        Map.Entry entryM10554i = this.f5353c.m10554i(interfaceC1131m);
        AbstractC1126h.b bVar2 = null;
        AbstractC1126h.b bVarM5156b = (entryM10554i == null || (bVar = (b) entryM10554i.getValue()) == null) ? null : bVar.m5156b();
        if (!this.f5359i.isEmpty()) {
            bVar2 = (AbstractC1126h.b) this.f5359i.get(r0.size() - 1);
        }
        a aVar = f5351j;
        return aVar.m5154a(aVar.m5154a(this.f5354d, bVarM5156b), bVar2);
    }

    /* JADX INFO: renamed from: f */
    private final void m5145f(String str) {
        if (!this.f5352b || C2044c.m10260f().mo10262b()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    /* JADX INFO: renamed from: g */
    private final void m5146g(InterfaceC1132n interfaceC1132n) {
        C2109b.d dVarM10556d = this.f5353c.m10556d();
        AbstractC0606k.m2144d(dVarM10556d, "observerMap.iteratorWithAdditions()");
        while (dVarM10556d.hasNext() && !this.f5358h) {
            Map.Entry entry = (Map.Entry) dVarM10556d.next();
            InterfaceC1131m interfaceC1131m = (InterfaceC1131m) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.m5156b().compareTo(this.f5354d) < 0 && !this.f5358h && this.f5353c.contains(interfaceC1131m)) {
                m5150l(bVar.m5156b());
                AbstractC1126h.a aVarM5138b = AbstractC1126h.a.Companion.m5138b(bVar.m5156b());
                if (aVarM5138b == null) {
                    throw new IllegalStateException("no event up from " + bVar.m5156b());
                }
                bVar.m5155a(interfaceC1132n, aVarM5138b);
                m5149k();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private final boolean m5147i() {
        if (this.f5353c.size() == 0) {
            return true;
        }
        Map.Entry entryM10555b = this.f5353c.m10555b();
        AbstractC0606k.m2142b(entryM10555b);
        AbstractC1126h.b bVarM5156b = ((b) entryM10555b.getValue()).m5156b();
        Map.Entry entryM10557e = this.f5353c.m10557e();
        AbstractC0606k.m2142b(entryM10557e);
        AbstractC1126h.b bVarM5156b2 = ((b) entryM10557e.getValue()).m5156b();
        return bVarM5156b == bVarM5156b2 && this.f5354d == bVarM5156b2;
    }

    /* JADX INFO: renamed from: j */
    private final void m5148j(AbstractC1126h.b bVar) {
        AbstractC1126h.b bVar2 = this.f5354d;
        if (bVar2 == bVar) {
            return;
        }
        if (bVar2 == AbstractC1126h.b.INITIALIZED && bVar == AbstractC1126h.b.DESTROYED) {
            throw new IllegalStateException(("no event down from " + this.f5354d + " in component " + this.f5355e.get()).toString());
        }
        this.f5354d = bVar;
        if (this.f5357g || this.f5356f != 0) {
            this.f5358h = true;
            return;
        }
        this.f5357g = true;
        m5151n();
        this.f5357g = false;
        if (this.f5354d == AbstractC1126h.b.DESTROYED) {
            this.f5353c = new C2108a();
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m5149k() {
        this.f5359i.remove(r0.size() - 1);
    }

    /* JADX INFO: renamed from: l */
    private final void m5150l(AbstractC1126h.b bVar) {
        this.f5359i.add(bVar);
    }

    /* JADX INFO: renamed from: n */
    private final void m5151n() {
        InterfaceC1132n interfaceC1132n = (InterfaceC1132n) this.f5355e.get();
        if (interfaceC1132n == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!m5147i()) {
            this.f5358h = false;
            AbstractC1126h.b bVar = this.f5354d;
            Map.Entry entryM10555b = this.f5353c.m10555b();
            AbstractC0606k.m2142b(entryM10555b);
            if (bVar.compareTo(((b) entryM10555b.getValue()).m5156b()) < 0) {
                m5143d(interfaceC1132n);
            }
            Map.Entry entryM10557e = this.f5353c.m10557e();
            if (!this.f5358h && entryM10557e != null && this.f5354d.compareTo(((b) entryM10557e.getValue()).m5156b()) > 0) {
                m5146g(interfaceC1132n);
            }
        }
        this.f5358h = false;
    }

    @Override // androidx.lifecycle.AbstractC1126h
    /* JADX INFO: renamed from: a */
    public void mo5132a(InterfaceC1131m interfaceC1131m) {
        InterfaceC1132n interfaceC1132n;
        AbstractC0606k.m2145e(interfaceC1131m, "observer");
        m5145f("addObserver");
        AbstractC1126h.b bVar = this.f5354d;
        AbstractC1126h.b bVar2 = AbstractC1126h.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC1126h.b.INITIALIZED;
        }
        b bVar3 = new b(interfaceC1131m, bVar2);
        if (((b) this.f5353c.mo10552g(interfaceC1131m, bVar3)) == null && (interfaceC1132n = (InterfaceC1132n) this.f5355e.get()) != null) {
            boolean z2 = this.f5356f != 0 || this.f5357g;
            AbstractC1126h.b bVarM5144e = m5144e(interfaceC1131m);
            this.f5356f++;
            while (bVar3.m5156b().compareTo(bVarM5144e) < 0 && this.f5353c.contains(interfaceC1131m)) {
                m5150l(bVar3.m5156b());
                AbstractC1126h.a aVarM5138b = AbstractC1126h.a.Companion.m5138b(bVar3.m5156b());
                if (aVarM5138b == null) {
                    throw new IllegalStateException("no event up from " + bVar3.m5156b());
                }
                bVar3.m5155a(interfaceC1132n, aVarM5138b);
                m5149k();
                bVarM5144e = m5144e(interfaceC1131m);
            }
            if (!z2) {
                m5151n();
            }
            this.f5356f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC1126h
    /* JADX INFO: renamed from: b */
    public AbstractC1126h.b mo5133b() {
        return this.f5354d;
    }

    @Override // androidx.lifecycle.AbstractC1126h
    /* JADX INFO: renamed from: c */
    public void mo5134c(InterfaceC1131m interfaceC1131m) {
        AbstractC0606k.m2145e(interfaceC1131m, "observer");
        m5145f("removeObserver");
        this.f5353c.mo10553h(interfaceC1131m);
    }

    /* JADX INFO: renamed from: h */
    public void m5152h(AbstractC1126h.a aVar) {
        AbstractC0606k.m2145e(aVar, "event");
        m5145f("handleLifecycleEvent");
        m5148j(aVar.m5136b());
    }

    /* JADX INFO: renamed from: m */
    public void m5153m(AbstractC1126h.b bVar) {
        AbstractC0606k.m2145e(bVar, "state");
        m5145f("setCurrentState");
        m5148j(bVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1133o(InterfaceC1132n interfaceC1132n) {
        this(interfaceC1132n, true);
        AbstractC0606k.m2145e(interfaceC1132n, "provider");
    }
}
