package p048Q;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: Q.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0483c {

    /* JADX INFO: renamed from: a */
    protected int f1689a;

    /* JADX INFO: renamed from: b */
    protected ByteBuffer f1690b;

    /* JADX INFO: renamed from: c */
    private int f1691c;

    /* JADX INFO: renamed from: d */
    private int f1692d;

    /* JADX INFO: renamed from: e */
    AbstractC0484d f1693e = AbstractC0484d.m1793a();

    /* JADX INFO: renamed from: a */
    protected int m1788a(int i3) {
        return i3 + this.f1690b.getInt(i3);
    }

    /* JADX INFO: renamed from: b */
    protected int m1789b(int i3) {
        if (i3 < this.f1692d) {
            return this.f1690b.getShort(this.f1691c + i3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    protected void m1790c(int i3, ByteBuffer byteBuffer) {
        this.f1690b = byteBuffer;
        if (byteBuffer == null) {
            this.f1689a = 0;
            this.f1691c = 0;
            this.f1692d = 0;
        } else {
            this.f1689a = i3;
            int i4 = i3 - byteBuffer.getInt(i3);
            this.f1691c = i4;
            this.f1692d = this.f1690b.getShort(i4);
        }
    }

    /* JADX INFO: renamed from: d */
    protected int m1791d(int i3) {
        int i4 = i3 + this.f1689a;
        return i4 + this.f1690b.getInt(i4) + 4;
    }

    /* JADX INFO: renamed from: e */
    protected int m1792e(int i3) {
        int i4 = i3 + this.f1689a;
        return this.f1690b.getInt(i4 + this.f1690b.getInt(i4));
    }
}
