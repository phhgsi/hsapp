package p102f2;

import p110h2.C2018y;

/* JADX INFO: renamed from: f2.n0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1947n0 {

    /* JADX INFO: renamed from: a */
    private static final C2018y f9462a = new C2018y("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b */
    public static final C2018y f9463b = new C2018y("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c */
    private static final C2018y f9464c = new C2018y("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d */
    private static final C2018y f9465d = new C2018y("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e */
    private static final C2018y f9466e = new C2018y("SEALED");

    /* JADX INFO: renamed from: f */
    private static final C1909O f9467f = new C1909O(false);

    /* JADX INFO: renamed from: g */
    private static final C1909O f9468g = new C1909O(true);

    /* JADX INFO: renamed from: g */
    public static final Object m10004g(Object obj) {
        return obj instanceof InterfaceC1921a0 ? new C1923b0((InterfaceC1921a0) obj) : obj;
    }

    /* JADX INFO: renamed from: h */
    public static final Object m10005h(Object obj) {
        InterfaceC1921a0 interfaceC1921a0;
        C1923b0 c1923b0 = obj instanceof C1923b0 ? (C1923b0) obj : null;
        return (c1923b0 == null || (interfaceC1921a0 = c1923b0.f9430a) == null) ? obj : interfaceC1921a0;
    }
}
