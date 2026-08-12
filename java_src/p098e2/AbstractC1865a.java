package p098e2;

import p086b2.C1303c;

/* JADX INFO: renamed from: e2.a */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1865a {
    /* JADX INFO: renamed from: a */
    public static final int m9654a(int i3) {
        if (2 <= i3 && i3 < 37) {
            return i3;
        }
        throw new IllegalArgumentException("radix " + i3 + " was not in valid range " + new C1303c(2, 36));
    }

    /* JADX INFO: renamed from: b */
    public static final int m9655b(char c3, int i3) {
        return Character.digit((int) c3, i3);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m9656c(char c3) {
        return Character.isWhitespace(c3) || Character.isSpaceChar(c3);
    }
}
