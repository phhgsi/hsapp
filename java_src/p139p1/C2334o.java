package p139p1;

import android.util.Log;
import com.google.android.gms.common.api.internal.AbstractC1390a;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p002A1.InterfaceC0027b;
import p139p1.C2334o;
import p148s1.InterfaceC2408a;
import p163x1.InterfaceC2526c;
import p163x1.InterfaceC2527d;

/* JADX INFO: renamed from: p1.o */
/* JADX INFO: loaded from: classes.dex */
public class C2334o implements InterfaceC2324e, InterfaceC2408a {

    /* JADX INFO: renamed from: i */
    private static final InterfaceC0027b f10750i = new InterfaceC0027b() { // from class: p1.k
        @Override // p002A1.InterfaceC0027b
        public final Object get() {
            return Collections.EMPTY_SET;
        }
    };

    /* JADX INFO: renamed from: a */
    private final Map f10751a;

    /* JADX INFO: renamed from: b */
    private final Map f10752b;

    /* JADX INFO: renamed from: c */
    private final Map f10753c;

    /* JADX INFO: renamed from: d */
    private final List f10754d;

    /* JADX INFO: renamed from: e */
    private Set f10755e;

    /* JADX INFO: renamed from: f */
    private final C2341v f10756f;

    /* JADX INFO: renamed from: g */
    private final AtomicReference f10757g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC2329j f10758h;

    /* JADX INFO: renamed from: p1.o$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final Executor f10759a;

        /* JADX INFO: renamed from: b */
        private final List f10760b = new ArrayList();

        /* JADX INFO: renamed from: c */
        private final List f10761c = new ArrayList();

        /* JADX INFO: renamed from: d */
        private InterfaceC2329j f10762d = InterfaceC2329j.f10743a;

        b(Executor executor) {
            this.f10759a = executor;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ ComponentRegistrar m11145a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        /* JADX INFO: renamed from: b */
        public b m11146b(C2322c c2322c) {
            this.f10761c.add(c2322c);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m11147c(final ComponentRegistrar componentRegistrar) {
            this.f10760b.add(new InterfaceC0027b() { // from class: p1.p
                @Override // p002A1.InterfaceC0027b
                public final Object get() {
                    return C2334o.b.m11145a(componentRegistrar);
                }
            });
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m11148d(Collection collection) {
            this.f10760b.addAll(collection);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C2334o m11149e() {
            return new C2334o(this.f10759a, this.f10760b, this.f10761c, this.f10762d);
        }

        /* JADX INFO: renamed from: f */
        public b m11150f(InterfaceC2329j interfaceC2329j) {
            this.f10762d = interfaceC2329j;
            return this;
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m11133h(C2334o c2334o, C2322c c2322c) {
        c2334o.getClass();
        return c2322c.m11103h().mo195a(new C2319F(c2322c, c2334o));
    }

    /* JADX INFO: renamed from: k */
    public static b m11136k(Executor executor) {
        return new b(executor);
    }

    /* JADX INFO: renamed from: l */
    private void m11137l(List list) {
        int i3;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f10754d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC0027b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f10758h.mo1169a(componentRegistrar));
                        it.remove();
                    }
                } catch (C2342w e3) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e3);
                }
            }
            Iterator it2 = list.iterator();
            while (true) {
                i3 = 0;
                if (!it2.hasNext()) {
                    break;
                }
                Object[] array = ((C2322c) it2.next()).m11105j().toArray();
                int length = array.length;
                while (true) {
                    if (i3 < length) {
                        Object obj = array[i3];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f10755e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f10755e.add(obj.toString());
                        }
                        i3++;
                    }
                }
            }
            if (this.f10751a.isEmpty()) {
                AbstractC2336q.m11151a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f10751a.keySet());
                arrayList2.addAll(list);
                AbstractC2336q.m11151a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final C2322c c2322c = (C2322c) it3.next();
                this.f10751a.put(c2322c, new C2343x(new InterfaceC0027b() { // from class: p1.l
                    @Override // p002A1.InterfaceC0027b
                    public final Object get() {
                        return C2334o.m11133h(this.f10744a, c2322c);
                    }
                }));
            }
            arrayList.addAll(m11142r(list));
            arrayList.addAll(m11143s());
            m11141q();
        }
        int size = arrayList.size();
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            ((Runnable) obj2).run();
        }
        m11140p();
    }

    /* JADX INFO: renamed from: m */
    private void m11138m(Map map, boolean z2) {
        for (Map.Entry entry : map.entrySet()) {
            C2322c c2322c = (C2322c) entry.getKey();
            InterfaceC0027b interfaceC0027b = (InterfaceC0027b) entry.getValue();
            if (c2322c.m11107n() || (c2322c.m11108o() && z2)) {
                interfaceC0027b.get();
            }
        }
        this.f10756f.m11179d();
    }

    /* JADX INFO: renamed from: o */
    private static List m11139o(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    private void m11140p() {
        Boolean bool = (Boolean) this.f10757g.get();
        if (bool != null) {
            m11138m(this.f10751a, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: q */
    private void m11141q() {
        for (C2322c c2322c : this.f10751a.keySet()) {
            for (C2337r c2337r : c2322c.m11102g()) {
                if (c2337r.m11174f() && !this.f10753c.containsKey(c2337r.m11170b())) {
                    this.f10753c.put(c2337r.m11170b(), C2344y.m11181b(Collections.EMPTY_SET));
                } else if (this.f10752b.containsKey(c2337r.m11170b())) {
                    continue;
                } else {
                    if (c2337r.m11173e()) {
                        throw new C2345z(String.format("Unsatisfied dependency for component %s: %s", c2322c, c2337r.m11170b()));
                    }
                    if (!c2337r.m11174f()) {
                        this.f10752b.put(c2337r.m11170b(), C2316C.m11078c());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    private List m11142r(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2322c c2322c = (C2322c) it.next();
            if (c2322c.m11109p()) {
                final InterfaceC0027b interfaceC0027b = (InterfaceC0027b) this.f10751a.get(c2322c);
                for (C2318E c2318e : c2322c.m11105j()) {
                    if (this.f10752b.containsKey(c2318e)) {
                        final C2316C c2316c = (C2316C) ((InterfaceC0027b) this.f10752b.get(c2318e));
                        arrayList.add(new Runnable() { // from class: p1.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                c2316c.m11079d(interfaceC0027b);
                            }
                        });
                    } else {
                        this.f10752b.put(c2318e, interfaceC0027b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    private List m11143s() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f10751a.entrySet()) {
            C2322c c2322c = (C2322c) entry.getKey();
            if (!c2322c.m11109p()) {
                InterfaceC0027b interfaceC0027b = (InterfaceC0027b) entry.getValue();
                for (C2318E c2318e : c2322c.m11105j()) {
                    if (!map.containsKey(c2318e)) {
                        map.put(c2318e, new HashSet());
                    }
                    ((Set) map.get(c2318e)).add(interfaceC0027b);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f10753c.containsKey(entry2.getKey())) {
                final C2344y c2344y = (C2344y) this.f10753c.get(entry2.getKey());
                for (final InterfaceC0027b interfaceC0027b2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: p1.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            c2344y.m11183a(interfaceC0027b2);
                        }
                    });
                }
            } else {
                this.f10753c.put((C2318E) entry2.getKey(), C2344y.m11181b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // p139p1.InterfaceC2324e
    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object mo11086a(Class cls) {
        return AbstractC2323d.m11121a(this, cls);
    }

    @Override // p139p1.InterfaceC2324e
    /* JADX INFO: renamed from: b */
    public /* synthetic */ Set mo11087b(C2318E c2318e) {
        return AbstractC2323d.m11125e(this, c2318e);
    }

    @Override // p139p1.InterfaceC2324e
    /* JADX INFO: renamed from: c */
    public /* synthetic */ Set mo11088c(Class cls) {
        return AbstractC2323d.m11124d(this, cls);
    }

    @Override // p139p1.InterfaceC2324e
    /* JADX INFO: renamed from: d */
    public /* synthetic */ InterfaceC0027b mo11089d(Class cls) {
        return AbstractC2323d.m11123c(this, cls);
    }

    @Override // p139p1.InterfaceC2324e
    /* JADX INFO: renamed from: e */
    public synchronized InterfaceC0027b mo11090e(C2318E c2318e) {
        AbstractC2317D.m11082c(c2318e, "Null interface requested.");
        return (InterfaceC0027b) this.f10752b.get(c2318e);
    }

    @Override // p139p1.InterfaceC2324e
    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object mo11091f(C2318E c2318e) {
        return AbstractC2323d.m11122b(this, c2318e);
    }

    @Override // p139p1.InterfaceC2324e
    /* JADX INFO: renamed from: g */
    public synchronized InterfaceC0027b mo11092g(C2318E c2318e) {
        C2344y c2344y = (C2344y) this.f10753c.get(c2318e);
        if (c2344y != null) {
            return c2344y;
        }
        return f10750i;
    }

    /* JADX INFO: renamed from: n */
    public void m11144n(boolean z2) {
        HashMap map;
        if (AbstractC1390a.m7213a(this.f10757g, null, Boolean.valueOf(z2))) {
            synchronized (this) {
                map = new HashMap(this.f10751a);
            }
            m11138m(map, z2);
        }
    }

    private C2334o(Executor executor, Iterable iterable, Collection collection, InterfaceC2329j interfaceC2329j) {
        this.f10751a = new HashMap();
        this.f10752b = new HashMap();
        this.f10753c = new HashMap();
        this.f10755e = new HashSet();
        this.f10757g = new AtomicReference();
        C2341v c2341v = new C2341v(executor);
        this.f10756f = c2341v;
        this.f10758h = interfaceC2329j;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C2322c.m11101q(c2341v, C2341v.class, InterfaceC2527d.class, InterfaceC2526c.class));
        arrayList.add(C2322c.m11101q(this, InterfaceC2408a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C2322c c2322c = (C2322c) it.next();
            if (c2322c != null) {
                arrayList.add(c2322c);
            }
        }
        this.f10754d = m11139o(iterable);
        m11137l(arrayList);
    }
}
