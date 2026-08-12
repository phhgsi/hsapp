package p015F;

import android.util.Base64;
import java.util.List;
import p024I.AbstractC0211h;

/* JADX INFO: renamed from: F.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0134f {

    /* JADX INFO: renamed from: a */
    private final String f266a;

    /* JADX INFO: renamed from: b */
    private final String f267b;

    /* JADX INFO: renamed from: c */
    private final String f268c;

    /* JADX INFO: renamed from: d */
    private final List f269d;

    /* JADX INFO: renamed from: e */
    private final int f270e;

    /* JADX INFO: renamed from: f */
    private final String f271f;

    /* JADX INFO: renamed from: g */
    private final String f272g;

    /* JADX INFO: renamed from: h */
    private final String f273h;

    public C0134f(String str, String str2, String str3, List list) {
        this(str, str2, str3, list, null, null);
    }

    /* JADX INFO: renamed from: a */
    private String m379a(String str, String str2, String str3, String str4, String str5) {
        return str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    /* JADX INFO: renamed from: b */
    public List m380b() {
        return this.f269d;
    }

    /* JADX INFO: renamed from: c */
    public int m381c() {
        return this.f270e;
    }

    /* JADX INFO: renamed from: d */
    String m382d() {
        return this.f273h;
    }

    /* JADX INFO: renamed from: e */
    public String m383e() {
        return this.f266a;
    }

    /* JADX INFO: renamed from: f */
    public String m384f() {
        return this.f267b;
    }

    /* JADX INFO: renamed from: g */
    public String m385g() {
        return this.f268c;
    }

    /* JADX INFO: renamed from: h */
    public String m386h() {
        return this.f271f;
    }

    /* JADX INFO: renamed from: i */
    public String m387i() {
        return this.f272g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f266a + ", mProviderPackage: " + this.f267b + ", mQuery: " + this.f268c + ", mSystemFont: " + this.f271f + ", mVariationSettings: " + this.f272g + ", mCertificates:");
        for (int i3 = 0; i3 < this.f269d.size(); i3++) {
            sb.append(" [");
            List list = (List) this.f269d.get(i3);
            for (int i4 = 0; i4 < list.size(); i4++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i4), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f270e);
        return sb.toString();
    }

    public C0134f(String str, String str2, String str3, List list, String str4, String str5) {
        this.f266a = (String) AbstractC0211h.m610g(str);
        this.f267b = (String) AbstractC0211h.m610g(str2);
        this.f268c = (String) AbstractC0211h.m610g(str3);
        this.f269d = (List) AbstractC0211h.m610g(list);
        this.f270e = 0;
        this.f271f = str4;
        this.f272g = str5;
        this.f273h = m379a(str, str2, str3, str4, str5);
    }
}
