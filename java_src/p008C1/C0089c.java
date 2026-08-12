package p008C1;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p129m1.C2267e;

/* JADX INFO: renamed from: C1.c */
/* JADX INFO: loaded from: classes.dex */
public class C0089c {

    /* JADX INFO: renamed from: a */
    private File f176a;

    /* JADX INFO: renamed from: b */
    private final C2267e f177b;

    /* JADX INFO: renamed from: C1.c$a */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C0089c(C2267e c2267e) {
        this.f177b = c2267e;
    }

    /* JADX INFO: renamed from: a */
    private File m240a() {
        if (this.f176a == null) {
            synchronized (this) {
                try {
                    if (this.f176a == null) {
                        this.f176a = new File(this.f177b.m10848j().getFilesDir(), "PersistedInstallation." + this.f177b.m10851n() + ".json");
                    }
                } finally {
                }
            }
        }
        return this.f176a;
    }

    /* JADX INFO: renamed from: c */
    private JSONObject m241c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(m240a());
            while (true) {
                try {
                    int i3 = fileInputStream.read(bArr, 0, 16384);
                    if (i3 < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, i3);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: b */
    public AbstractC0090d m242b(AbstractC0090d abstractC0090d) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", abstractC0090d.mo217d());
            jSONObject.put("Status", abstractC0090d.mo220g().ordinal());
            jSONObject.put("AuthToken", abstractC0090d.mo215b());
            jSONObject.put("RefreshToken", abstractC0090d.mo219f());
            jSONObject.put("TokenCreationEpochInSecs", abstractC0090d.mo221h());
            jSONObject.put("ExpiresInSecs", abstractC0090d.mo216c());
            jSONObject.put("FisError", abstractC0090d.mo218e());
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f177b.m10848j().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!fileCreateTempFile.renameTo(m240a())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
        return abstractC0090d;
    }

    /* JADX INFO: renamed from: d */
    public AbstractC0090d m243d() {
        JSONObject jSONObjectM241c = m241c();
        String strOptString = jSONObjectM241c.optString("Fid", null);
        int iOptInt = jSONObjectM241c.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String strOptString2 = jSONObjectM241c.optString("AuthToken", null);
        String strOptString3 = jSONObjectM241c.optString("RefreshToken", null);
        long jOptLong = jSONObjectM241c.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObjectM241c.optLong("ExpiresInSecs", 0L);
        return AbstractC0090d.m245a().mo226d(strOptString).mo229g(a.values()[iOptInt]).mo224b(strOptString2).mo228f(strOptString3).mo230h(jOptLong).mo225c(jOptLong2).mo227e(jSONObjectM241c.optString("FisError", null)).mo223a();
    }
}
