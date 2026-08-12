package p098e2;

import p071X1.AbstractC0606k;
import p086b2.AbstractC1304d;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: e2.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1877m extends AbstractC1876l {
    /* JADX INFO: renamed from: d */
    public static boolean m9667d(String str, String str2, boolean z2) {
        return str == null ? str2 == null : !z2 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m9668e(String str, int i3, String str2, int i4, int i5, boolean z2) {
        AbstractC0606k.m2145e(str, "<this>");
        AbstractC0606k.m2145e(str2, "other");
        return !z2 ? str.regionMatches(i3, str2, i4, i5) : str.regionMatches(z2, i3, str2, i4, i5);
    }

    /* JADX INFO: renamed from: f */
    public static final String m9669f(String str, String str2, String str3, boolean z2) {
        AbstractC0606k.m2145e(str, "<this>");
        AbstractC0606k.m2145e(str2, "oldValue");
        AbstractC0606k.m2145e(str3, "newValue");
        int i3 = 0;
        int iM9682o = AbstractC1879o.m9682o(str, str2, 0, z2);
        if (iM9682o < 0) {
            return str;
        }
        int length = str2.length();
        int iA = AbstractC1304d.m6631a(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i3, iM9682o);
            sb.append(str3);
            i3 = iM9682o + length;
            if (iM9682o >= str.length()) {
                break;
            }
            iM9682o = AbstractC1879o.m9682o(str, str2, iM9682o + iA, z2);
        } while (iM9682o > 0);
        sb.append((CharSequence) str, i3, str.length());
        String string = sb.toString();
        AbstractC0606k.m2144d(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ String m9670g(String str, String str2, String str3, boolean z2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return m9669f(str, str2, str3, z2);
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m9671h(String str, String str2, boolean z2) {
        AbstractC0606k.m2145e(str, "<this>");
        AbstractC0606k.m2145e(str2, "prefix");
        return !z2 ? str.startsWith(str2) : m9668e(str, 0, str2, 0, str2.length(), z2);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ boolean m9672i(String str, String str2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        return m9671h(str, str2, z2);
    }
}
