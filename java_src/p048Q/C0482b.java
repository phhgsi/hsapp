package p048Q;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: Q.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0482b extends AbstractC0483c {
    /* JADX INFO: renamed from: h */
    public static C0482b m1781h(ByteBuffer byteBuffer) {
        return m1782i(byteBuffer, new C0482b());
    }

    /* JADX INFO: renamed from: i */
    public static C0482b m1782i(ByteBuffer byteBuffer, C0482b c0482b) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c0482b.m1783f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* JADX INFO: renamed from: f */
    public C0482b m1783f(int i3, ByteBuffer byteBuffer) {
        m1784g(i3, byteBuffer);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public void m1784g(int i3, ByteBuffer byteBuffer) {
        m1790c(i3, byteBuffer);
    }

    /* JADX INFO: renamed from: j */
    public C0481a m1785j(C0481a c0481a, int i3) {
        int iM1789b = m1789b(6);
        if (iM1789b != 0) {
            return c0481a.m1772f(m1788a(m1791d(iM1789b) + (i3 * 4)), this.f1690b);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public int m1786k() {
        int iM1789b = m1789b(6);
        if (iM1789b != 0) {
            return m1792e(iM1789b);
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public int m1787l() {
        int iM1789b = m1789b(4);
        if (iM1789b != 0) {
            return this.f1690b.getInt(iM1789b + this.f1689a);
        }
        return 0;
    }
}
