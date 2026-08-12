package p117j1;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import p117j1.AbstractC2082p;
import p117j1.AbstractC2083q;

/* JADX INFO: renamed from: j1.s */
/* JADX INFO: loaded from: classes.dex */
public class C2085s extends AbstractC2083q implements InterfaceC2048A {

    /* JADX INFO: renamed from: f */
    private final transient AbstractC2084r f9768f;

    /* JADX INFO: renamed from: j1.s$a */
    public static final class a extends AbstractC2083q.a {
        /* JADX INFO: renamed from: a */
        public C2085s m10447a() {
            Collection collectionEntrySet = this.f9764a.entrySet();
            Comparator comparator = this.f9765b;
            if (comparator != null) {
                collectionEntrySet = AbstractC2054G.m10276a(comparator).m10279d().m10278b(collectionEntrySet);
            }
            return C2085s.m10444e(collectionEntrySet, this.f9766c);
        }
    }

    C2085s(AbstractC2082p abstractC2082p, int i3, Comparator comparator) {
        super(abstractC2082p, i3);
        this.f9768f = m10443d(comparator);
    }

    /* JADX INFO: renamed from: d */
    private static AbstractC2084r m10443d(Comparator comparator) {
        return comparator == null ? AbstractC2084r.m10438m() : AbstractC2086t.m10452w(comparator);
    }

    /* JADX INFO: renamed from: e */
    static C2085s m10444e(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return m10445f();
        }
        AbstractC2082p.a aVar = new AbstractC2082p.a(collection.size());
        Iterator it = collection.iterator();
        int size = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            AbstractC2084r abstractC2084rM10446g = m10446g(comparator, (Collection) entry.getValue());
            if (!abstractC2084rM10446g.isEmpty()) {
                aVar.m10432e(key, abstractC2084rM10446g);
                size += abstractC2084rM10446g.size();
            }
        }
        return new C2085s(aVar.m10431b(), size, comparator);
    }

    /* JADX INFO: renamed from: f */
    public static C2085s m10445f() {
        return C2078l.f9739g;
    }

    /* JADX INFO: renamed from: g */
    private static AbstractC2084r m10446g(Comparator comparator, Collection collection) {
        return comparator == null ? AbstractC2084r.m10437j(collection) : AbstractC2086t.m10451t(comparator, collection);
    }
}
