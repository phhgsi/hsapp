package p113i1;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: renamed from: i1.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2039l {

    /* JADX INFO: renamed from: i1.l$a */
    static class a implements InterfaceC2038k, Serializable {

        /* JADX INFO: renamed from: d */
        final InterfaceC2038k f9653d;

        /* JADX INFO: renamed from: e */
        volatile transient boolean f9654e;

        /* JADX INFO: renamed from: f */
        transient Object f9655f;

        a(InterfaceC2038k interfaceC2038k) {
            this.f9653d = (InterfaceC2038k) AbstractC2035h.m10240i(interfaceC2038k);
        }

        @Override // p113i1.InterfaceC2038k
        public Object get() {
            if (!this.f9654e) {
                synchronized (this) {
                    try {
                        if (!this.f9654e) {
                            Object obj = this.f9653d.get();
                            this.f9655f = obj;
                            this.f9654e = true;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return AbstractC2032e.m10227a(this.f9655f);
        }

        public String toString() {
            Object string;
            if (this.f9654e) {
                String strValueOf = String.valueOf(this.f9655f);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(strValueOf);
                sb.append(">");
                string = sb.toString();
            } else {
                string = this.f9653d;
            }
            String strValueOf2 = String.valueOf(string);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(strValueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: i1.l$b */
    static class b implements InterfaceC2038k {

        /* JADX INFO: renamed from: d */
        volatile InterfaceC2038k f9656d;

        /* JADX INFO: renamed from: e */
        volatile boolean f9657e;

        /* JADX INFO: renamed from: f */
        Object f9658f;

        b(InterfaceC2038k interfaceC2038k) {
            this.f9656d = (InterfaceC2038k) AbstractC2035h.m10240i(interfaceC2038k);
        }

        @Override // p113i1.InterfaceC2038k
        public Object get() {
            if (!this.f9657e) {
                synchronized (this) {
                    try {
                        if (!this.f9657e) {
                            InterfaceC2038k interfaceC2038k = this.f9656d;
                            Objects.requireNonNull(interfaceC2038k);
                            Object obj = interfaceC2038k.get();
                            this.f9658f = obj;
                            this.f9657e = true;
                            this.f9656d = null;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return AbstractC2032e.m10227a(this.f9658f);
        }

        public String toString() {
            Object string = this.f9656d;
            if (string == null) {
                String strValueOf = String.valueOf(this.f9658f);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(strValueOf);
                sb.append(">");
                string = sb.toString();
            }
            String strValueOf2 = String.valueOf(string);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(strValueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: i1.l$c */
    private static class c implements InterfaceC2038k, Serializable {

        /* JADX INFO: renamed from: d */
        final Object f9659d;

        c(Object obj) {
            this.f9659d = obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return AbstractC2033f.m10228a(this.f9659d, ((c) obj).f9659d);
            }
            return false;
        }

        @Override // p113i1.InterfaceC2038k
        public Object get() {
            return this.f9659d;
        }

        public int hashCode() {
            return AbstractC2033f.m10229b(this.f9659d);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f9659d);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
            sb.append("Suppliers.ofInstance(");
            sb.append(strValueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC2038k m10250a(InterfaceC2038k interfaceC2038k) {
        return ((interfaceC2038k instanceof b) || (interfaceC2038k instanceof a)) ? interfaceC2038k : interfaceC2038k instanceof Serializable ? new a(interfaceC2038k) : new b(interfaceC2038k);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC2038k m10251b(Object obj) {
        return new c(obj);
    }
}
