package p144r0;

/* JADX INFO: renamed from: r0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2366c {

    /* JADX INFO: renamed from: a */
    private final String f10846a;

    private C2366c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f10846a = str;
    }

    /* JADX INFO: renamed from: b */
    public static C2366c m11213b(String str) {
        return new C2366c(str);
    }

    /* JADX INFO: renamed from: a */
    public String m11214a() {
        return this.f10846a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2366c) {
            return this.f10846a.equals(((C2366c) obj).f10846a);
        }
        return false;
    }

    public int hashCode() {
        return this.f10846a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f10846a + "\"}";
    }
}
