package p048Q;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: Q.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0481a extends AbstractC0483c {
    /* JADX INFO: renamed from: f */
    public C0481a m1772f(int i3, ByteBuffer byteBuffer) {
        m1773g(i3, byteBuffer);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public void m1773g(int i3, ByteBuffer byteBuffer) {
        m1790c(i3, byteBuffer);
    }

    /* JADX INFO: renamed from: h */
    public int m1774h(int i3) {
        int iM1789b = m1789b(16);
        if (iM1789b != 0) {
            return this.f1690b.getInt(m1791d(iM1789b) + (i3 * 4));
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public int m1775i() {
        int iM1789b = m1789b(16);
        if (iM1789b != 0) {
            return m1792e(iM1789b);
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public boolean m1776j() {
        int iM1789b = m1789b(6);
        return (iM1789b == 0 || this.f1690b.get(iM1789b + this.f1689a) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public short m1777k() {
        int iM1789b = m1789b(14);
        if (iM1789b != 0) {
            return this.f1690b.getShort(iM1789b + this.f1689a);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: l */
    public int m1778l() {
        int iM1789b = m1789b(4);
        if (iM1789b != 0) {
            return this.f1690b.getInt(iM1789b + this.f1689a);
        }
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public short m1779m() {
        int iM1789b = m1789b(8);
        if (iM1789b != 0) {
            return this.f1690b.getShort(iM1789b + this.f1689a);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: n */
    public short m1780n() {
        int iM1789b = m1789b(12);
        if (iM1789b != 0) {
            return this.f1690b.getShort(iM1789b + this.f1689a);
        }
        return (short) 0;
    }
}
