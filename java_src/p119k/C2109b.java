package p119k;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: k.b */
/* JADX INFO: loaded from: classes.dex */
public class C2109b implements Iterable {

    /* JADX INFO: renamed from: d */
    c f9833d;

    /* JADX INFO: renamed from: e */
    private c f9834e;

    /* JADX INFO: renamed from: f */
    private final WeakHashMap f9835f = new WeakHashMap();

    /* JADX INFO: renamed from: g */
    private int f9836g = 0;

    /* JADX INFO: renamed from: k.b$a */
    static class a extends e {
        a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // p119k.C2109b.e
        /* JADX INFO: renamed from: b */
        c mo10559b(c cVar) {
            return cVar.f9840g;
        }

        @Override // p119k.C2109b.e
        /* JADX INFO: renamed from: c */
        c mo10560c(c cVar) {
            return cVar.f9839f;
        }
    }

    /* JADX INFO: renamed from: k.b$b */
    private static class b extends e {
        b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // p119k.C2109b.e
        /* JADX INFO: renamed from: b */
        c mo10559b(c cVar) {
            return cVar.f9839f;
        }

        @Override // p119k.C2109b.e
        /* JADX INFO: renamed from: c */
        c mo10560c(c cVar) {
            return cVar.f9840g;
        }
    }

    /* JADX INFO: renamed from: k.b$c */
    static class c implements Map.Entry {

        /* JADX INFO: renamed from: d */
        final Object f9837d;

        /* JADX INFO: renamed from: e */
        final Object f9838e;

        /* JADX INFO: renamed from: f */
        c f9839f;

        /* JADX INFO: renamed from: g */
        c f9840g;

        c(Object obj, Object obj2) {
            this.f9837d = obj;
            this.f9838e = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f9837d.equals(cVar.f9837d) && this.f9838e.equals(cVar.f9838e);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f9837d;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f9838e;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f9837d.hashCode() ^ this.f9838e.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f9837d + "=" + this.f9838e;
        }
    }

    /* JADX INFO: renamed from: k.b$d */
    public class d extends f implements Iterator {

        /* JADX INFO: renamed from: d */
        private c f9841d;

        /* JADX INFO: renamed from: e */
        private boolean f9842e = true;

        d() {
        }

        @Override // p119k.C2109b.f
        /* JADX INFO: renamed from: a */
        void mo10561a(c cVar) {
            c cVar2 = this.f9841d;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f9840g;
                this.f9841d = cVar3;
                this.f9842e = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.f9842e) {
                this.f9842e = false;
                this.f9841d = C2109b.this.f9833d;
            } else {
                c cVar = this.f9841d;
                this.f9841d = cVar != null ? cVar.f9839f : null;
            }
            return this.f9841d;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f9842e) {
                return C2109b.this.f9833d != null;
            }
            c cVar = this.f9841d;
            return (cVar == null || cVar.f9839f == null) ? false : true;
        }
    }

    /* JADX INFO: renamed from: k.b$e */
    private static abstract class e extends f implements Iterator {

        /* JADX INFO: renamed from: d */
        c f9844d;

        /* JADX INFO: renamed from: e */
        c f9845e;

        e(c cVar, c cVar2) {
            this.f9844d = cVar2;
            this.f9845e = cVar;
        }

        /* JADX INFO: renamed from: e */
        private c m10563e() {
            c cVar = this.f9845e;
            c cVar2 = this.f9844d;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo10560c(cVar);
        }

        @Override // p119k.C2109b.f
        /* JADX INFO: renamed from: a */
        public void mo10561a(c cVar) {
            if (this.f9844d == cVar && cVar == this.f9845e) {
                this.f9845e = null;
                this.f9844d = null;
            }
            c cVar2 = this.f9844d;
            if (cVar2 == cVar) {
                this.f9844d = mo10559b(cVar2);
            }
            if (this.f9845e == cVar) {
                this.f9845e = m10563e();
            }
        }

        /* JADX INFO: renamed from: b */
        abstract c mo10559b(c cVar);

        /* JADX INFO: renamed from: c */
        abstract c mo10560c(c cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f9845e;
            this.f9845e = m10563e();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9845e != null;
        }
    }

    /* JADX INFO: renamed from: k.b$f */
    public static abstract class f {
        /* JADX INFO: renamed from: a */
        abstract void mo10561a(c cVar);
    }

    /* JADX INFO: renamed from: b */
    public Map.Entry m10555b() {
        return this.f9833d;
    }

    /* JADX INFO: renamed from: c */
    protected c mo10551c(Object obj) {
        c cVar = this.f9833d;
        while (cVar != null && !cVar.f9837d.equals(obj)) {
            cVar = cVar.f9839f;
        }
        return cVar;
    }

    /* JADX INFO: renamed from: d */
    public d m10556d() {
        d dVar = new d();
        this.f9835f.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Iterator descendingIterator() {
        b bVar = new b(this.f9834e, this.f9833d);
        this.f9835f.put(bVar, Boolean.FALSE);
        return bVar;
    }

    /* JADX INFO: renamed from: e */
    public Map.Entry m10557e() {
        return this.f9834e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2109b)) {
            return false;
        }
        C2109b c2109b = (C2109b) obj;
        if (size() != c2109b.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c2109b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    c m10558f(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f9836g++;
        c cVar2 = this.f9834e;
        if (cVar2 == null) {
            this.f9833d = cVar;
            this.f9834e = cVar;
            return cVar;
        }
        cVar2.f9839f = cVar;
        cVar.f9840g = cVar2;
        this.f9834e = cVar;
        return cVar;
    }

    /* JADX INFO: renamed from: g */
    public Object mo10552g(Object obj, Object obj2) {
        c cVarMo10551c = mo10551c(obj);
        if (cVarMo10551c != null) {
            return cVarMo10551c.f9838e;
        }
        m10558f(obj, obj2);
        return null;
    }

    /* JADX INFO: renamed from: h */
    public Object mo10553h(Object obj) {
        c cVarMo10551c = mo10551c(obj);
        if (cVarMo10551c == null) {
            return null;
        }
        this.f9836g--;
        if (!this.f9835f.isEmpty()) {
            Iterator it = this.f9835f.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).mo10561a(cVarMo10551c);
            }
        }
        c cVar = cVarMo10551c.f9840g;
        if (cVar != null) {
            cVar.f9839f = cVarMo10551c.f9839f;
        } else {
            this.f9833d = cVarMo10551c.f9839f;
        }
        c cVar2 = cVarMo10551c.f9839f;
        if (cVar2 != null) {
            cVar2.f9840g = cVar;
        } else {
            this.f9834e = cVar;
        }
        cVarMo10551c.f9839f = null;
        cVarMo10551c.f9840g = null;
        return cVarMo10551c.f9838e;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f9833d, this.f9834e);
        this.f9835f.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f9836g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
