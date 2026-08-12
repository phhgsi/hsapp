package p150t0;

import java.util.Arrays;
import p144r0.C2366c;

/* JADX INFO: renamed from: t0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2432h {

    /* JADX INFO: renamed from: a */
    private final C2366c f11408a;

    /* JADX INFO: renamed from: b */
    private final byte[] f11409b;

    public C2432h(C2366c c2366c, byte[] bArr) {
        if (c2366c == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f11408a = c2366c;
        this.f11409b = bArr;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m11707a() {
        return this.f11409b;
    }

    /* JADX INFO: renamed from: b */
    public C2366c m11708b() {
        return this.f11408a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2432h)) {
            return false;
        }
        C2432h c2432h = (C2432h) obj;
        if (this.f11408a.equals(c2432h.f11408a)) {
            return Arrays.equals(this.f11409b, c2432h.f11409b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f11408a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f11409b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f11408a + ", bytes=[...]}";
    }
}
