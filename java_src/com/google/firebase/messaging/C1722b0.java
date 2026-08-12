package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.firebase.messaging.b0 */
/* JADX INFO: loaded from: classes.dex */
final class C1722b0 {

    /* JADX INFO: renamed from: d */
    private static final Pattern f8589d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a */
    private final String f8590a;

    /* JADX INFO: renamed from: b */
    private final String f8591b;

    /* JADX INFO: renamed from: c */
    private final String f8592c;

    private C1722b0(String str, String str2) {
        this.f8590a = m9404d(str2, str);
        this.f8591b = str;
        this.f8592c = str + "!" + str2;
    }

    /* JADX INFO: renamed from: a */
    static C1722b0 m9403a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new C1722b0(strArrSplit[0], strArrSplit[1]);
    }

    /* JADX INFO: renamed from: d */
    private static String m9404d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f8589d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    /* JADX INFO: renamed from: b */
    public String m9405b() {
        return this.f8591b;
    }

    /* JADX INFO: renamed from: c */
    public String m9406c() {
        return this.f8590a;
    }

    /* JADX INFO: renamed from: e */
    public String m9407e() {
        return this.f8592c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1722b0)) {
            return false;
        }
        C1722b0 c1722b0 = (C1722b0) obj;
        return this.f8590a.equals(c1722b0.f8590a) && this.f8591b.equals(c1722b0.f8591b);
    }

    public int hashCode() {
        return Objects.hashCode(this.f8591b, this.f8590a);
    }
}
