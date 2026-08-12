package p008C1;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.stats.CodePackage;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import p129m1.C2267e;

/* JADX INFO: renamed from: C1.b */
/* JADX INFO: loaded from: classes.dex */
public class C0088b {

    /* JADX INFO: renamed from: c */
    private static final String[] f173c = {"*", "FCM", CodePackage.GCM, ""};

    /* JADX INFO: renamed from: a */
    private final SharedPreferences f174a;

    /* JADX INFO: renamed from: b */
    private final String f175b;

    public C0088b(C2267e c2267e) {
        this.f174a = c2267e.m10848j().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f175b = m232b(c2267e);
    }

    /* JADX INFO: renamed from: a */
    private String m231a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    /* JADX INFO: renamed from: b */
    private static String m232b(C2267e c2267e) {
        String strM10863d = c2267e.m10850m().m10863d();
        if (strM10863d != null) {
            return strM10863d;
        }
        String strM10862c = c2267e.m10850m().m10862c();
        if (!strM10862c.startsWith("1:") && !strM10862c.startsWith("2:")) {
            return strM10862c;
        }
        String[] strArrSplit = strM10862c.split(":");
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    private static String m233c(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private String m234d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private PublicKey m235e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e3) {
            Log.w("ContentValues", "Invalid key stored " + e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    private String m236g() {
        String string;
        synchronized (this.f174a) {
            string = this.f174a.getString("|S|id", null);
        }
        return string;
    }

    /* JADX INFO: renamed from: h */
    private String m237h() {
        synchronized (this.f174a) {
            try {
                String string = this.f174a.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey publicKeyM235e = m235e(string);
                if (publicKeyM235e == null) {
                    return null;
                }
                return m233c(publicKeyM235e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public String m238f() {
        synchronized (this.f174a) {
            try {
                String strM236g = m236g();
                if (strM236g != null) {
                    return strM236g;
                }
                return m237h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public String m239i() {
        synchronized (this.f174a) {
            try {
                for (String str : f173c) {
                    String string = this.f174a.getString(m231a(this.f175b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = m234d(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
