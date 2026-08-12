package p160w1;

import java.io.OutputStream;

/* JADX INFO: renamed from: w1.b */
/* JADX INFO: loaded from: classes.dex */
final class C2494b extends OutputStream {

    /* JADX INFO: renamed from: d */
    private long f11648d = 0;

    C2494b() {
    }

    /* JADX INFO: renamed from: a */
    long m11861a() {
        return this.f11648d;
    }

    @Override // java.io.OutputStream
    public void write(int i3) {
        this.f11648d++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f11648d += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i3, int i4) {
        int i5;
        if (i3 >= 0 && i3 <= bArr.length && i4 >= 0 && (i5 = i3 + i4) <= bArr.length && i5 >= 0) {
            this.f11648d += (long) i4;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
