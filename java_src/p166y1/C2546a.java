package p166y1;

import java.util.List;

/* JADX INFO: renamed from: y1.a */
/* JADX INFO: loaded from: classes.dex */
final class C2546a extends AbstractC2563r {

    /* JADX INFO: renamed from: a */
    private final String f11845a;

    /* JADX INFO: renamed from: b */
    private final List f11846b;

    C2546a(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f11845a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f11846b = list;
    }

    @Override // p166y1.AbstractC2563r
    /* JADX INFO: renamed from: b */
    public List mo12194b() {
        return this.f11846b;
    }

    @Override // p166y1.AbstractC2563r
    /* JADX INFO: renamed from: c */
    public String mo12195c() {
        return this.f11845a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2563r) {
            AbstractC2563r abstractC2563r = (AbstractC2563r) obj;
            if (this.f11845a.equals(abstractC2563r.mo12195c()) && this.f11846b.equals(abstractC2563r.mo12194b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f11845a.hashCode() ^ 1000003) * 1000003) ^ this.f11846b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f11845a + ", usedDates=" + this.f11846b + "}";
    }
}
