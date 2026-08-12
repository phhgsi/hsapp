package p139p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: p1.q */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2336q {

    /* JADX INFO: renamed from: p1.q$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        private final C2322c f10764a;

        /* JADX INFO: renamed from: b */
        private final Set f10765b = new HashSet();

        /* JADX INFO: renamed from: c */
        private final Set f10766c = new HashSet();

        b(C2322c c2322c) {
            this.f10764a = c2322c;
        }

        /* JADX INFO: renamed from: a */
        void m11154a(b bVar) {
            this.f10765b.add(bVar);
        }

        /* JADX INFO: renamed from: b */
        void m11155b(b bVar) {
            this.f10766c.add(bVar);
        }

        /* JADX INFO: renamed from: c */
        C2322c m11156c() {
            return this.f10764a;
        }

        /* JADX INFO: renamed from: d */
        Set m11157d() {
            return this.f10765b;
        }

        /* JADX INFO: renamed from: e */
        boolean m11158e() {
            return this.f10765b.isEmpty();
        }

        /* JADX INFO: renamed from: f */
        boolean m11159f() {
            return this.f10766c.isEmpty();
        }

        /* JADX INFO: renamed from: g */
        void m11160g(b bVar) {
            this.f10766c.remove(bVar);
        }
    }

    /* JADX INFO: renamed from: p1.q$c */
    private static class c {

        /* JADX INFO: renamed from: a */
        private final C2318E f10767a;

        /* JADX INFO: renamed from: b */
        private final boolean f10768b;

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f10767a.equals(this.f10767a) && cVar.f10768b == this.f10768b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((this.f10767a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f10768b).hashCode();
        }

        private c(C2318E c2318e, boolean z2) {
            this.f10767a = c2318e;
            this.f10768b = z2;
        }
    }

    /* JADX INFO: renamed from: a */
    static void m11151a(List list) {
        Set<b> setM11153c = m11153c(list);
        Set setM11152b = m11152b(setM11153c);
        int i3 = 0;
        while (!setM11152b.isEmpty()) {
            b bVar = (b) setM11152b.iterator().next();
            setM11152b.remove(bVar);
            i3++;
            for (b bVar2 : bVar.m11157d()) {
                bVar2.m11160g(bVar);
                if (bVar2.m11159f()) {
                    setM11152b.add(bVar2);
                }
            }
        }
        if (i3 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 : setM11153c) {
            if (!bVar3.m11159f() && !bVar3.m11158e()) {
                arrayList.add(bVar3.m11156c());
            }
        }
        throw new C2338s(arrayList);
    }

    /* JADX INFO: renamed from: b */
    private static Set m11152b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.m11159f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: c */
    private static Set m11153c(List list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (C2337r c2337r : bVar.m11156c().m11102g()) {
                            if (c2337r.m11172d() && (set = (Set) map.get(new c(c2337r.m11170b(), c2337r.m11174f()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.m11154a(bVar2);
                                    bVar2.m11155b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            C2322c c2322c = (C2322c) it.next();
            b bVar3 = new b(c2322c);
            for (C2318E c2318e : c2322c.m11105j()) {
                c cVar = new c(c2318e, !c2322c.m11109p());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f10768b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", c2318e));
                }
                set2.add(bVar3);
            }
        }
    }
}
