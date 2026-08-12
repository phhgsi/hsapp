package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.messaging.AbstractC1727e;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new C1711S();

    /* JADX INFO: renamed from: d */
    Bundle f8510d;

    /* JADX INFO: renamed from: e */
    private Map f8511e;

    /* JADX INFO: renamed from: f */
    private C1710b f8512f;

    /* JADX INFO: renamed from: com.google.firebase.messaging.RemoteMessage$b */
    public static class C1710b {

        /* JADX INFO: renamed from: a */
        private final String f8513a;

        /* JADX INFO: renamed from: b */
        private final String f8514b;

        /* JADX INFO: renamed from: c */
        private final String[] f8515c;

        /* JADX INFO: renamed from: d */
        private final String f8516d;

        /* JADX INFO: renamed from: e */
        private final String f8517e;

        /* JADX INFO: renamed from: f */
        private final String[] f8518f;

        /* JADX INFO: renamed from: g */
        private final String f8519g;

        /* JADX INFO: renamed from: h */
        private final String f8520h;

        /* JADX INFO: renamed from: i */
        private final String f8521i;

        /* JADX INFO: renamed from: j */
        private final String f8522j;

        /* JADX INFO: renamed from: k */
        private final String f8523k;

        /* JADX INFO: renamed from: l */
        private final String f8524l;

        /* JADX INFO: renamed from: m */
        private final String f8525m;

        /* JADX INFO: renamed from: n */
        private final Uri f8526n;

        /* JADX INFO: renamed from: o */
        private final String f8527o;

        /* JADX INFO: renamed from: p */
        private final Integer f8528p;

        /* JADX INFO: renamed from: q */
        private final Integer f8529q;

        /* JADX INFO: renamed from: r */
        private final Integer f8530r;

        /* JADX INFO: renamed from: s */
        private final int[] f8531s;

        /* JADX INFO: renamed from: t */
        private final Long f8532t;

        /* JADX INFO: renamed from: u */
        private final boolean f8533u;

        /* JADX INFO: renamed from: v */
        private final boolean f8534v;

        /* JADX INFO: renamed from: w */
        private final boolean f8535w;

        /* JADX INFO: renamed from: x */
        private final boolean f8536x;

        /* JADX INFO: renamed from: y */
        private final boolean f8537y;

        /* JADX INFO: renamed from: z */
        private final long[] f8538z;

        /* JADX INFO: renamed from: c */
        private static String[] m9352c(C1701J c1701j, String str) {
            Object[] objArrM9321g = c1701j.m9321g(str);
            if (objArrM9321g == null) {
                return null;
            }
            String[] strArr = new String[objArrM9321g.length];
            for (int i3 = 0; i3 < objArrM9321g.length; i3++) {
                strArr[i3] = String.valueOf(objArrM9321g[i3]);
            }
            return strArr;
        }

        /* JADX INFO: renamed from: a */
        public String m9353a() {
            return this.f8516d;
        }

        /* JADX INFO: renamed from: b */
        public Uri m9354b() {
            String str = this.f8520h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public String m9355d() {
            return this.f8513a;
        }

        private C1710b(C1701J c1701j) {
            this.f8513a = c1701j.m9330p("gcm.n.title");
            this.f8514b = c1701j.m9322h("gcm.n.title");
            this.f8515c = m9352c(c1701j, "gcm.n.title");
            this.f8516d = c1701j.m9330p("gcm.n.body");
            this.f8517e = c1701j.m9322h("gcm.n.body");
            this.f8518f = m9352c(c1701j, "gcm.n.body");
            this.f8519g = c1701j.m9330p("gcm.n.icon");
            this.f8521i = c1701j.m9329o();
            this.f8522j = c1701j.m9330p("gcm.n.tag");
            this.f8523k = c1701j.m9330p("gcm.n.color");
            this.f8524l = c1701j.m9330p("gcm.n.click_action");
            this.f8525m = c1701j.m9330p("gcm.n.android_channel_id");
            this.f8526n = c1701j.m9320f();
            this.f8520h = c1701j.m9330p("gcm.n.image");
            this.f8527o = c1701j.m9330p("gcm.n.ticker");
            this.f8528p = c1701j.m9317b("gcm.n.notification_priority");
            this.f8529q = c1701j.m9317b("gcm.n.visibility");
            this.f8530r = c1701j.m9317b("gcm.n.notification_count");
            this.f8533u = c1701j.m9316a("gcm.n.sticky");
            this.f8534v = c1701j.m9316a("gcm.n.local_only");
            this.f8535w = c1701j.m9316a("gcm.n.default_sound");
            this.f8536x = c1701j.m9316a("gcm.n.default_vibrate_timings");
            this.f8537y = c1701j.m9316a("gcm.n.default_light_settings");
            this.f8532t = c1701j.m9324j("gcm.n.event_time");
            this.f8531s = c1701j.m9319e();
            this.f8538z = c1701j.m9331q();
        }
    }

    public RemoteMessage(Bundle bundle) {
        this.f8510d = bundle;
    }

    /* JADX INFO: renamed from: d */
    public C1710b m9351d() {
        if (this.f8512f == null && C1701J.m9311t(this.f8510d)) {
            this.f8512f = new C1710b(new C1701J(this.f8510d));
        }
        return this.f8512f;
    }

    public Map getData() {
        if (this.f8511e == null) {
            this.f8511e = AbstractC1727e.a.m9430a(this.f8510d);
        }
        return this.f8511e;
    }

    public String getFrom() {
        return this.f8510d.getString("from");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        C1711S.m9356c(this, parcel, i3);
    }
}
