package p012E;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: E.j */
/* JADX INFO: loaded from: classes.dex */
final class C0113j implements InterfaceC0114k {

    /* JADX INFO: renamed from: c */
    private static final Locale[] f236c = new Locale[0];

    /* JADX INFO: renamed from: d */
    private static final Locale f237d = new Locale("en", "XA");

    /* JADX INFO: renamed from: e */
    private static final Locale f238e = new Locale("ar", "XB");

    /* JADX INFO: renamed from: f */
    private static final Locale f239f = C0112i.m337b("en-Latn");

    /* JADX INFO: renamed from: a */
    private final Locale[] f240a;

    /* JADX INFO: renamed from: b */
    private final String f241b;

    C0113j(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f240a = f236c;
            this.f241b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < localeArr.length; i3++) {
            Locale locale = localeArr[i3];
            if (locale == null) {
                throw new NullPointerException("list[" + i3 + "] is null");
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                m348c(sb, locale2);
                if (i3 < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f240a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f241b = sb.toString();
    }

    /* JADX INFO: renamed from: c */
    static void m348c(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    @Override // p012E.InterfaceC0114k
    /* JADX INFO: renamed from: a */
    public String mo349a() {
        return this.f241b;
    }

    @Override // p012E.InterfaceC0114k
    /* JADX INFO: renamed from: b */
    public Object mo350b() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0113j)) {
            return false;
        }
        Locale[] localeArr = ((C0113j) obj).f240a;
        if (this.f240a.length != localeArr.length) {
            return false;
        }
        int i3 = 0;
        while (true) {
            Locale[] localeArr2 = this.f240a;
            if (i3 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i3].equals(localeArr[i3])) {
                return false;
            }
            i3++;
        }
    }

    @Override // p012E.InterfaceC0114k
    public Locale get(int i3) {
        if (i3 < 0) {
            return null;
        }
        Locale[] localeArr = this.f240a;
        if (i3 < localeArr.length) {
            return localeArr[i3];
        }
        return null;
    }

    public int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f240a) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // p012E.InterfaceC0114k
    public boolean isEmpty() {
        return this.f240a.length == 0;
    }

    @Override // p012E.InterfaceC0114k
    public int size() {
        return this.f240a.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i3 = 0;
        while (true) {
            Locale[] localeArr = this.f240a;
            if (i3 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i3]);
            if (i3 < this.f240a.length - 1) {
                sb.append(',');
            }
            i3++;
        }
    }
}
