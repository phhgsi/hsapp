package p093d1;

import android.app.PendingIntent;
import java.util.Map;

/* JADX INFO: renamed from: d1.a */
/* JADX INFO: loaded from: classes.dex */
public class C1789a {

    /* JADX INFO: renamed from: a */
    private final String f9153a;

    /* JADX INFO: renamed from: b */
    private final int f9154b;

    /* JADX INFO: renamed from: c */
    private final int f9155c;

    /* JADX INFO: renamed from: d */
    private final int f9156d;

    /* JADX INFO: renamed from: e */
    private final Integer f9157e;

    /* JADX INFO: renamed from: f */
    private final int f9158f;

    /* JADX INFO: renamed from: g */
    private final long f9159g;

    /* JADX INFO: renamed from: h */
    private final long f9160h;

    /* JADX INFO: renamed from: i */
    private final long f9161i;

    /* JADX INFO: renamed from: j */
    private final long f9162j;

    /* JADX INFO: renamed from: k */
    private final PendingIntent f9163k;

    /* JADX INFO: renamed from: l */
    private final PendingIntent f9164l;

    /* JADX INFO: renamed from: m */
    private final PendingIntent f9165m;

    /* JADX INFO: renamed from: n */
    private final PendingIntent f9166n;

    /* JADX INFO: renamed from: o */
    private final Map f9167o;

    /* JADX INFO: renamed from: p */
    private boolean f9168p = false;

    private C1789a(String str, int i3, int i4, int i5, Integer num, int i6, long j3, long j4, long j5, long j6, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        this.f9153a = str;
        this.f9154b = i3;
        this.f9155c = i4;
        this.f9156d = i5;
        this.f9157e = num;
        this.f9158f = i6;
        this.f9159g = j3;
        this.f9160h = j4;
        this.f9161i = j5;
        this.f9162j = j6;
        this.f9163k = pendingIntent;
        this.f9164l = pendingIntent2;
        this.f9165m = pendingIntent3;
        this.f9166n = pendingIntent4;
        this.f9167o = map;
    }

    /* JADX INFO: renamed from: e */
    public static C1789a m9537e(String str, int i3, int i4, int i5, Integer num, int i6, long j3, long j4, long j5, long j6, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        return new C1789a(str, i3, i4, i5, num, i6, j3, j4, j5, j6, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map);
    }

    /* JADX INFO: renamed from: h */
    private final boolean m9538h(AbstractC1792d abstractC1792d) {
        return abstractC1792d.mo9535a() && this.f9161i <= this.f9162j;
    }

    /* JADX INFO: renamed from: a */
    public boolean m9539a(int i3) {
        return m9542d(AbstractC1792d.m9548c(i3)) != null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m9540b(AbstractC1792d abstractC1792d) {
        return m9542d(abstractC1792d) != null;
    }

    /* JADX INFO: renamed from: c */
    public int m9541c() {
        return this.f9155c;
    }

    /* JADX INFO: renamed from: d */
    final PendingIntent m9542d(AbstractC1792d abstractC1792d) {
        if (abstractC1792d.mo9536b() == 0) {
            PendingIntent pendingIntent = this.f9164l;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (m9538h(abstractC1792d)) {
                return this.f9166n;
            }
            return null;
        }
        if (abstractC1792d.mo9536b() == 1) {
            PendingIntent pendingIntent2 = this.f9163k;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (m9538h(abstractC1792d)) {
                return this.f9165m;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    final void m9543f() {
        this.f9168p = true;
    }

    /* JADX INFO: renamed from: g */
    final boolean m9544g() {
        return this.f9168p;
    }
}
