package p094d2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p038M1.AbstractC0419m;
import p068W1.InterfaceC0577l;
import p071X1.AbstractC0606k;
import p074Y1.InterfaceC0622a;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: d2.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1830p extends AbstractC1828n {

    /* JADX INFO: renamed from: d2.p$a */
    public static final class a implements Iterable, InterfaceC0622a {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC1820f f9228d;

        public a(InterfaceC1820f interfaceC1820f) {
            this.f9228d = interfaceC1820f;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f9228d.iterator();
        }
    }

    /* JADX INFO: renamed from: n */
    public static Iterable m9598n(InterfaceC1820f interfaceC1820f) {
        AbstractC0606k.m2145e(interfaceC1820f, "<this>");
        return new a(interfaceC1820f);
    }

    /* JADX INFO: renamed from: o */
    public static InterfaceC1820f m9599o(InterfaceC1820f interfaceC1820f, InterfaceC0577l interfaceC0577l) {
        AbstractC0606k.m2145e(interfaceC1820f, "<this>");
        AbstractC0606k.m2145e(interfaceC0577l, "predicate");
        return new C1817c(interfaceC1820f, true, interfaceC0577l);
    }

    /* JADX INFO: renamed from: p */
    public static final InterfaceC1820f m9600p(InterfaceC1820f interfaceC1820f, InterfaceC0577l interfaceC0577l) {
        AbstractC0606k.m2145e(interfaceC1820f, "<this>");
        AbstractC0606k.m2145e(interfaceC0577l, "predicate");
        return new C1817c(interfaceC1820f, false, interfaceC0577l);
    }

    /* JADX INFO: renamed from: q */
    public static InterfaceC1820f m9601q(InterfaceC1820f interfaceC1820f) {
        AbstractC0606k.m2145e(interfaceC1820f, "<this>");
        InterfaceC1820f interfaceC1820fM9600p = m9600p(interfaceC1820f, new InterfaceC0577l() { // from class: d2.o
            @Override // p068W1.InterfaceC0577l
            /* JADX INFO: renamed from: f */
            public final Object mo1406f(Object obj) {
                return Boolean.valueOf(AbstractC1830p.m9602r(obj));
            }
        });
        AbstractC0606k.m2143c(interfaceC1820fM9600p, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return interfaceC1820fM9600p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final boolean m9602r(Object obj) {
        return obj == null;
    }

    /* JADX INFO: renamed from: s */
    public static InterfaceC1820f m9603s(InterfaceC1820f interfaceC1820f, InterfaceC0577l interfaceC0577l) {
        AbstractC0606k.m2145e(interfaceC1820f, "<this>");
        AbstractC0606k.m2145e(interfaceC0577l, "transform");
        return new C1831q(interfaceC1820f, interfaceC0577l);
    }

    /* JADX INFO: renamed from: t */
    public static List m9604t(InterfaceC1820f interfaceC1820f) {
        AbstractC0606k.m2145e(interfaceC1820f, "<this>");
        Iterator it = interfaceC1820f.iterator();
        if (!it.hasNext()) {
            return AbstractC0419m.m1459f();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0419m.m1455b(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
