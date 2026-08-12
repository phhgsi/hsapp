package p012E;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: E.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0112i {

    /* JADX INFO: renamed from: b */
    private static final C0112i f233b = m336a(new Locale[0]);

    /* JADX INFO: renamed from: a */
    private final InterfaceC0114k f234a;

    /* JADX INFO: renamed from: E.i$a */
    static class a {

        /* JADX INFO: renamed from: a */
        private static final Locale[] f235a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        /* JADX INFO: renamed from: a */
        static Locale m346a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* JADX INFO: renamed from: E.i$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static LocaleList m347a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }
    }

    private C0112i(InterfaceC0114k interfaceC0114k) {
        this.f234a = interfaceC0114k;
    }

    /* JADX INFO: renamed from: a */
    public static C0112i m336a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? m340j(b.m347a(localeArr)) : new C0112i(new C0113j(localeArr));
    }

    /* JADX INFO: renamed from: b */
    static Locale m337b(String str) {
        if (str.contains("-")) {
            String[] strArrSplit = str.split("-", -1);
            if (strArrSplit.length > 2) {
                return new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            }
            if (strArrSplit.length > 1) {
                return new Locale(strArrSplit[0], strArrSplit[1]);
            }
            if (strArrSplit.length == 1) {
                return new Locale(strArrSplit[0]);
            }
        } else {
            if (!str.contains("_")) {
                return new Locale(str);
            }
            String[] strArrSplit2 = str.split("_", -1);
            if (strArrSplit2.length > 2) {
                return new Locale(strArrSplit2[0], strArrSplit2[1], strArrSplit2[2]);
            }
            if (strArrSplit2.length > 1) {
                return new Locale(strArrSplit2[0], strArrSplit2[1]);
            }
            if (strArrSplit2.length == 1) {
                return new Locale(strArrSplit2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    /* JADX INFO: renamed from: c */
    public static C0112i m338c(String str) {
        if (str == null || str.isEmpty()) {
            return m339e();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i3 = 0; i3 < length; i3++) {
            localeArr[i3] = a.m346a(strArrSplit[i3]);
        }
        return m336a(localeArr);
    }

    /* JADX INFO: renamed from: e */
    public static C0112i m339e() {
        return f233b;
    }

    /* JADX INFO: renamed from: j */
    public static C0112i m340j(LocaleList localeList) {
        return new C0112i(new C0121r(localeList));
    }

    /* JADX INFO: renamed from: d */
    public Locale m341d(int i3) {
        return this.f234a.get(i3);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0112i) && this.f234a.equals(((C0112i) obj).f234a);
    }

    /* JADX INFO: renamed from: f */
    public boolean m342f() {
        return this.f234a.isEmpty();
    }

    /* JADX INFO: renamed from: g */
    public int m343g() {
        return this.f234a.size();
    }

    /* JADX INFO: renamed from: h */
    public String m344h() {
        return this.f234a.mo349a();
    }

    public int hashCode() {
        return this.f234a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public Object m345i() {
        return this.f234a.mo350b();
    }

    public String toString() {
        return this.f234a.toString();
    }
}
