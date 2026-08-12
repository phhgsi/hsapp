package p117j1;

import p113i1.AbstractC2035h;

/* JADX INFO: renamed from: j1.g */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2073g {
    /* JADX INFO: renamed from: a */
    static void m10329a(Object obj, Object obj2) {
        if (obj == null) {
            String strValueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 24);
            sb.append("null key in entry: null=");
            sb.append(strValueOf);
            throw new NullPointerException(sb.toString());
        }
        if (obj2 != null) {
            return;
        }
        String strValueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 26);
        sb2.append("null value in entry: ");
        sb2.append(strValueOf2);
        sb2.append("=null");
        throw new NullPointerException(sb2.toString());
    }

    /* JADX INFO: renamed from: b */
    static int m10330b(int i3, String str) {
        if (i3 >= 0) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i3);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: c */
    static void m10331c(boolean z2) {
        AbstractC2035h.m10246o(z2, "no calls to next() since the last call to remove()");
    }
}
