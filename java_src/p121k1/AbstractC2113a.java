package p121k1;

import p113i1.AbstractC2035h;

/* JADX INFO: renamed from: k1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2113a extends AbstractC2114b {
    /* JADX INFO: renamed from: a */
    public static int m10573a(int i3, int i4, int i5) {
        AbstractC2035h.m10237f(i4 <= i5, "min (%s) must be less than or equal to max (%s)", i4, i5);
        return Math.min(Math.max(i3, i4), i5);
    }
}
