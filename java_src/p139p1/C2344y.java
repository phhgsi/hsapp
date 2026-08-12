package p139p1;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p002A1.InterfaceC0027b;

/* JADX INFO: renamed from: p1.y */
/* JADX INFO: loaded from: classes.dex */
class C2344y implements InterfaceC0027b {

    /* JADX INFO: renamed from: b */
    private volatile Set f10781b = null;

    /* JADX INFO: renamed from: a */
    private volatile Set f10780a = Collections.newSetFromMap(new ConcurrentHashMap());

    C2344y(Collection collection) {
        this.f10780a.addAll(collection);
    }

    /* JADX INFO: renamed from: b */
    static C2344y m11181b(Collection collection) {
        return new C2344y((Set) collection);
    }

    /* JADX INFO: renamed from: d */
    private synchronized void m11182d() {
        try {
            Iterator it = this.f10780a.iterator();
            while (it.hasNext()) {
                this.f10781b.add(((InterfaceC0027b) it.next()).get());
            }
            this.f10780a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    synchronized void m11183a(InterfaceC0027b interfaceC0027b) {
        try {
            if (this.f10781b == null) {
                this.f10780a.add(interfaceC0027b);
            } else {
                this.f10781b.add(interfaceC0027b.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p002A1.InterfaceC0027b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f10781b == null) {
            synchronized (this) {
                try {
                    if (this.f10781b == null) {
                        this.f10781b = Collections.newSetFromMap(new ConcurrentHashMap());
                        m11182d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f10781b);
    }
}
