package p008C1;

import p008C1.C0087a;
import p008C1.C0089c;

/* JADX INFO: renamed from: C1.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0090d {

    /* JADX INFO: renamed from: a */
    public static AbstractC0090d f184a = m245a().mo223a();

    /* JADX INFO: renamed from: C1.d$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract AbstractC0090d mo223a();

        /* JADX INFO: renamed from: b */
        public abstract a mo224b(String str);

        /* JADX INFO: renamed from: c */
        public abstract a mo225c(long j3);

        /* JADX INFO: renamed from: d */
        public abstract a mo226d(String str);

        /* JADX INFO: renamed from: e */
        public abstract a mo227e(String str);

        /* JADX INFO: renamed from: f */
        public abstract a mo228f(String str);

        /* JADX INFO: renamed from: g */
        public abstract a mo229g(C0089c.a aVar);

        /* JADX INFO: renamed from: h */
        public abstract a mo230h(long j3);
    }

    /* JADX INFO: renamed from: a */
    public static a m245a() {
        return new C0087a.b().mo230h(0L).mo229g(C0089c.a.ATTEMPT_MIGRATION).mo225c(0L);
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo215b();

    /* JADX INFO: renamed from: c */
    public abstract long mo216c();

    /* JADX INFO: renamed from: d */
    public abstract String mo217d();

    /* JADX INFO: renamed from: e */
    public abstract String mo218e();

    /* JADX INFO: renamed from: f */
    public abstract String mo219f();

    /* JADX INFO: renamed from: g */
    public abstract C0089c.a mo220g();

    /* JADX INFO: renamed from: h */
    public abstract long mo221h();

    /* JADX INFO: renamed from: i */
    public boolean m246i() {
        return mo220g() == C0089c.a.REGISTER_ERROR;
    }

    /* JADX INFO: renamed from: j */
    public boolean m247j() {
        return mo220g() == C0089c.a.NOT_GENERATED || mo220g() == C0089c.a.ATTEMPT_MIGRATION;
    }

    /* JADX INFO: renamed from: k */
    public boolean m248k() {
        return mo220g() == C0089c.a.REGISTERED;
    }

    /* JADX INFO: renamed from: l */
    public boolean m249l() {
        return mo220g() == C0089c.a.UNREGISTERED;
    }

    /* JADX INFO: renamed from: m */
    public boolean m250m() {
        return mo220g() == C0089c.a.ATTEMPT_MIGRATION;
    }

    /* JADX INFO: renamed from: n */
    public abstract a mo222n();

    /* JADX INFO: renamed from: o */
    public AbstractC0090d m251o(String str, long j3, long j4) {
        return mo222n().mo224b(str).mo225c(j3).mo230h(j4).mo223a();
    }

    /* JADX INFO: renamed from: p */
    public AbstractC0090d m252p() {
        return mo222n().mo224b(null).mo223a();
    }

    /* JADX INFO: renamed from: q */
    public AbstractC0090d m253q(String str) {
        return mo222n().mo227e(str).mo229g(C0089c.a.REGISTER_ERROR).mo223a();
    }

    /* JADX INFO: renamed from: r */
    public AbstractC0090d m254r() {
        return mo222n().mo229g(C0089c.a.NOT_GENERATED).mo223a();
    }

    /* JADX INFO: renamed from: s */
    public AbstractC0090d m255s(String str, String str2, long j3, String str3, long j4) {
        return mo222n().mo226d(str).mo229g(C0089c.a.REGISTERED).mo224b(str3).mo228f(str2).mo225c(j4).mo230h(j3).mo223a();
    }

    /* JADX INFO: renamed from: t */
    public AbstractC0090d m256t(String str) {
        return mo222n().mo226d(str).mo229g(C0089c.a.UNREGISTERED).mo223a();
    }
}
