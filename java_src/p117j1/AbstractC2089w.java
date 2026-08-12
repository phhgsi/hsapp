package p117j1;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p113i1.AbstractC2033f;
import p113i1.AbstractC2035h;

/* JADX INFO: renamed from: j1.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2089w {

    /* JADX INFO: renamed from: j1.w$a */
    class a extends AbstractC2065S {

        /* JADX INFO: renamed from: d */
        boolean f9771d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Object f9772e;

        a(Object obj) {
            this.f9772e = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f9771d;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f9771d) {
                throw new NoSuchElementException();
            }
            this.f9771d = true;
            return this.f9772e;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m10463a(Collection collection, Iterator it) {
        AbstractC2035h.m10240i(collection);
        AbstractC2035h.m10240i(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10464b(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !AbstractC2033f.m10228a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC2065S m10465c(Object obj) {
        return new a(obj);
    }
}
