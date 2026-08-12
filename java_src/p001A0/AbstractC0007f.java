package p001A0;

import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p001A0.C0004c;
import p010D0.InterfaceC0092a;
import p144r0.EnumC2368e;

/* JADX INFO: renamed from: A0.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0007f {

    /* JADX INFO: renamed from: A0.f$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private InterfaceC0092a f13a;

        /* JADX INFO: renamed from: b */
        private Map f14b = new HashMap();

        /* JADX INFO: renamed from: a */
        public a m52a(EnumC2368e enumC2368e, b bVar) {
            this.f14b.put(enumC2368e, bVar);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public AbstractC0007f m53b() {
            if (this.f13a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f14b.keySet().size() < EnumC2368e.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f14b;
            this.f14b = new HashMap();
            return AbstractC0007f.m46d(this.f13a, map);
        }

        /* JADX INFO: renamed from: c */
        public a m54c(InterfaceC0092a interfaceC0092a) {
            this.f13a = interfaceC0092a;
            return this;
        }
    }

    /* JADX INFO: renamed from: A0.f$b */
    public static abstract class b {

        /* JADX INFO: renamed from: A0.f$b$a */
        public static abstract class a {
            /* JADX INFO: renamed from: a */
            public abstract b mo36a();

            /* JADX INFO: renamed from: b */
            public abstract a mo37b(long j3);

            /* JADX INFO: renamed from: c */
            public abstract a mo38c(Set set);

            /* JADX INFO: renamed from: d */
            public abstract a mo39d(long j3);
        }

        /* JADX INFO: renamed from: a */
        public static a m55a() {
            return new C0004c.b().mo38c(Collections.EMPTY_SET);
        }

        /* JADX INFO: renamed from: b */
        abstract long mo33b();

        /* JADX INFO: renamed from: c */
        abstract Set mo34c();

        /* JADX INFO: renamed from: d */
        abstract long mo35d();
    }

    /* JADX INFO: renamed from: A0.f$c */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* JADX INFO: renamed from: a */
    private long m44a(int i3, long j3) {
        return (long) (Math.pow(3.0d, i3 - 1) * j3 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j3 > 1 ? j3 : 2L) * ((long) r7))));
    }

    /* JADX INFO: renamed from: b */
    public static a m45b() {
        return new a();
    }

    /* JADX INFO: renamed from: d */
    static AbstractC0007f m46d(InterfaceC0092a interfaceC0092a, Map map) {
        return new C0003b(interfaceC0092a, map);
    }

    /* JADX INFO: renamed from: f */
    public static AbstractC0007f m47f(InterfaceC0092a interfaceC0092a) {
        return m45b().m52a(EnumC2368e.DEFAULT, b.m55a().mo37b(30000L).mo39d(86400000L).mo36a()).m52a(EnumC2368e.HIGHEST, b.m55a().mo37b(1000L).mo39d(86400000L).mo36a()).m52a(EnumC2368e.VERY_LOW, b.m55a().mo37b(86400000L).mo39d(86400000L).mo38c(m48i(c.DEVICE_IDLE)).mo36a()).m54c(interfaceC0092a).m53b();
    }

    /* JADX INFO: renamed from: i */
    private static Set m48i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    /* JADX INFO: renamed from: j */
    private void m49j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    /* JADX INFO: renamed from: c */
    public JobInfo.Builder m50c(JobInfo.Builder builder, EnumC2368e enumC2368e, long j3, int i3) {
        builder.setMinimumLatency(m51g(enumC2368e, j3, i3));
        m49j(builder, ((b) mo32h().get(enumC2368e)).mo34c());
        return builder;
    }

    /* JADX INFO: renamed from: e */
    abstract InterfaceC0092a mo31e();

    /* JADX INFO: renamed from: g */
    public long m51g(EnumC2368e enumC2368e, long j3, int i3) {
        long jMo259a = j3 - mo31e().mo259a();
        b bVar = (b) mo32h().get(enumC2368e);
        return Math.min(Math.max(m44a(i3, bVar.mo33b()), jMo259a), bVar.mo35d());
    }

    /* JADX INFO: renamed from: h */
    abstract Map mo32h();
}
