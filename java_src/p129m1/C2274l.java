package p129m1;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* JADX INFO: renamed from: m1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2274l {

    /* JADX INFO: renamed from: a */
    private final String f10425a;

    /* JADX INFO: renamed from: b */
    private final String f10426b;

    /* JADX INFO: renamed from: c */
    private final String f10427c;

    /* JADX INFO: renamed from: d */
    private final String f10428d;

    /* JADX INFO: renamed from: e */
    private final String f10429e;

    /* JADX INFO: renamed from: f */
    private final String f10430f;

    /* JADX INFO: renamed from: g */
    private final String f10431g;

    private C2274l(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f10426b = str;
        this.f10425a = str2;
        this.f10427c = str3;
        this.f10428d = str4;
        this.f10429e = str5;
        this.f10430f = str6;
        this.f10431g = str7;
    }

    /* JADX INFO: renamed from: a */
    public static C2274l m10860a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new C2274l(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    /* JADX INFO: renamed from: b */
    public String m10861b() {
        return this.f10425a;
    }

    /* JADX INFO: renamed from: c */
    public String m10862c() {
        return this.f10426b;
    }

    /* JADX INFO: renamed from: d */
    public String m10863d() {
        return this.f10429e;
    }

    /* JADX INFO: renamed from: e */
    public String m10864e() {
        return this.f10431g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2274l)) {
            return false;
        }
        C2274l c2274l = (C2274l) obj;
        return Objects.equal(this.f10426b, c2274l.f10426b) && Objects.equal(this.f10425a, c2274l.f10425a) && Objects.equal(this.f10427c, c2274l.f10427c) && Objects.equal(this.f10428d, c2274l.f10428d) && Objects.equal(this.f10429e, c2274l.f10429e) && Objects.equal(this.f10430f, c2274l.f10430f) && Objects.equal(this.f10431g, c2274l.f10431g);
    }

    public int hashCode() {
        return Objects.hashCode(this.f10426b, this.f10425a, this.f10427c, this.f10428d, this.f10429e, this.f10430f, this.f10431g);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f10426b).add("apiKey", this.f10425a).add("databaseUrl", this.f10427c).add("gcmSenderId", this.f10429e).add("storageBucket", this.f10430f).add("projectId", this.f10431g).toString();
    }
}
