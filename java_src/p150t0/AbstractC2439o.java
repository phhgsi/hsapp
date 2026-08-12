package p150t0;

import android.util.Base64;
import p144r0.EnumC2368e;
import p150t0.C2428d;

/* JADX INFO: renamed from: t0.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2439o {

    /* JADX INFO: renamed from: t0.o$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract AbstractC2439o mo11696a();

        /* JADX INFO: renamed from: b */
        public abstract a mo11697b(String str);

        /* JADX INFO: renamed from: c */
        public abstract a mo11698c(byte[] bArr);

        /* JADX INFO: renamed from: d */
        public abstract a mo11699d(EnumC2368e enumC2368e);
    }

    /* JADX INFO: renamed from: a */
    public static a m11726a() {
        return new C2428d.b().mo11699d(EnumC2368e.DEFAULT);
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo11693b();

    /* JADX INFO: renamed from: c */
    public abstract byte[] mo11694c();

    /* JADX INFO: renamed from: d */
    public abstract EnumC2368e mo11695d();

    /* JADX INFO: renamed from: e */
    public boolean m11727e() {
        return mo11694c() != null;
    }

    /* JADX INFO: renamed from: f */
    public AbstractC2439o m11728f(EnumC2368e enumC2368e) {
        return m11726a().mo11697b(mo11693b()).mo11699d(enumC2368e).mo11698c(mo11694c()).mo11696a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", mo11693b(), mo11695d(), mo11694c() == null ? "" : Base64.encodeToString(mo11694c(), 2));
    }
}
