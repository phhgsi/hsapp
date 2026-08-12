package p094d2;

import java.util.Iterator;
import p068W1.InterfaceC0566a;
import p068W1.InterfaceC0577l;
import p071X1.AbstractC0606k;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: d2.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1827m extends AbstractC1823i {

    /* JADX INFO: renamed from: d2.m$a */
    public static final class a implements InterfaceC1820f {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Iterator f9227a;

        public a(Iterator it) {
            this.f9227a = it;
        }

        @Override // p094d2.InterfaceC1820f
        public Iterator iterator() {
            return this.f9227a;
        }
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC1820f m9588d(Iterator it) {
        AbstractC0606k.m2145e(it, "<this>");
        return m9589e(new a(it));
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC1820f m9589e(InterfaceC1820f interfaceC1820f) {
        AbstractC0606k.m2145e(interfaceC1820f, "<this>");
        return interfaceC1820f instanceof C1815a ? interfaceC1820f : new C1815a(interfaceC1820f);
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC1820f m9590f() {
        return C1816b.f9206a;
    }

    /* JADX INFO: renamed from: g */
    private static final InterfaceC1820f m9591g(InterfaceC1820f interfaceC1820f, InterfaceC0577l interfaceC0577l) {
        return interfaceC1820f instanceof C1831q ? ((C1831q) interfaceC1820f).m9607c(interfaceC0577l) : new C1818d(interfaceC1820f, new InterfaceC0577l() { // from class: d2.l
            @Override // p068W1.InterfaceC0577l
            /* JADX INFO: renamed from: f */
            public final Object mo1406f(Object obj) {
                return AbstractC1827m.m9593i(obj);
            }
        }, interfaceC0577l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Iterator m9592h(Iterable iterable) {
        AbstractC0606k.m2145e(iterable, "it");
        return iterable.iterator();
    }

    /* JADX INFO: renamed from: j */
    public static InterfaceC1820f m9594j(InterfaceC1820f interfaceC1820f) {
        AbstractC0606k.m2145e(interfaceC1820f, "<this>");
        return m9591g(interfaceC1820f, new InterfaceC0577l() { // from class: d2.k
            @Override // p068W1.InterfaceC0577l
            /* JADX INFO: renamed from: f */
            public final Object mo1406f(Object obj) {
                return AbstractC1827m.m9592h((Iterable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static InterfaceC1820f m9595k(final InterfaceC0566a interfaceC0566a) {
        AbstractC0606k.m2145e(interfaceC0566a, "nextFunction");
        return m9589e(new C1819e(interfaceC0566a, new InterfaceC0577l() { // from class: d2.j
            @Override // p068W1.InterfaceC0577l
            /* JADX INFO: renamed from: f */
            public final Object mo1406f(Object obj) {
                return AbstractC1827m.m9596l(interfaceC0566a, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final Object m9596l(InterfaceC0566a interfaceC0566a, Object obj) {
        AbstractC0606k.m2145e(obj, "it");
        return interfaceC0566a.mo464a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final Object m9593i(Object obj) {
        return obj;
    }
}
