package p139p1;

import androidx.appcompat.app.AbstractC0740E;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p163x1.AbstractC2524a;
import p163x1.InterfaceC2525b;
import p163x1.InterfaceC2526c;
import p163x1.InterfaceC2527d;

/* JADX INFO: renamed from: p1.v */
/* JADX INFO: loaded from: classes.dex */
class C2341v implements InterfaceC2527d, InterfaceC2526c {

    /* JADX INFO: renamed from: a */
    private final Map f10774a = new HashMap();

    /* JADX INFO: renamed from: b */
    private Queue f10775b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    private final Executor f10776c;

    C2341v(Executor executor) {
        this.f10776c = executor;
    }

    /* JADX INFO: renamed from: e */
    private synchronized Set m11176e(AbstractC2524a abstractC2524a) {
        throw null;
    }

    @Override // p163x1.InterfaceC2527d
    /* JADX INFO: renamed from: a */
    public void mo11177a(Class cls, InterfaceC2525b interfaceC2525b) {
        mo11178b(cls, this.f10776c, interfaceC2525b);
    }

    @Override // p163x1.InterfaceC2527d
    /* JADX INFO: renamed from: b */
    public synchronized void mo11178b(Class cls, Executor executor, InterfaceC2525b interfaceC2525b) {
        try {
            AbstractC2317D.m11081b(cls);
            AbstractC2317D.m11081b(interfaceC2525b);
            AbstractC2317D.m11081b(executor);
            if (!this.f10774a.containsKey(cls)) {
                this.f10774a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f10774a.get(cls)).put(interfaceC2525b, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    void m11179d() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.f10775b;
                if (queue != null) {
                    this.f10775b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                AbstractC0740E.m2693a(it.next());
                m11180f(null);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m11180f(final AbstractC2524a abstractC2524a) {
        AbstractC2317D.m11081b(abstractC2524a);
        synchronized (this) {
            try {
                Queue queue = this.f10775b;
                if (queue != null) {
                    queue.add(abstractC2524a);
                    return;
                }
                for (final Map.Entry entry : m11176e(abstractC2524a)) {
                    ((Executor) entry.getValue()).execute(new Runnable(entry, abstractC2524a) { // from class: p1.u

                        /* JADX INFO: renamed from: d */
                        public final /* synthetic */ Map.Entry f10773d;

                        @Override // java.lang.Runnable
                        public final void run() {
                            ((InterfaceC2525b) this.f10773d.getKey()).mo9204a(null);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
