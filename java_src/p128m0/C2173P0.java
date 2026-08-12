package p128m0;

import android.text.TextUtils;
import android.util.Log;
import co.median.android.MainActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p135o0.AbstractC2296j;
import p135o0.InterfaceC2293g;

/* JADX INFO: renamed from: m0.P0 */
/* JADX INFO: loaded from: classes.dex */
public class C2173P0 {

    /* JADX INFO: renamed from: d */
    private static final String f10029d = "m0.P0";

    /* JADX INFO: renamed from: a */
    private final InterfaceC2293g f10030a;

    /* JADX INFO: renamed from: b */
    private final Map f10031b = new HashMap();

    /* JADX INFO: renamed from: c */
    private final List f10032c = new ArrayList();

    public C2173P0(InterfaceC2293g interfaceC2293g) {
        this.f10030a = interfaceC2293g;
    }

    /* JADX INFO: renamed from: c */
    private void m10666c(String str, JSONObject jSONObject) {
        InterfaceC2293g interfaceC2293g = this.f10030a;
        if (interfaceC2293g == null || !((MainActivity) interfaceC2293g).m6940o2()) {
            return;
        }
        try {
            this.f10030a.mo6920a(AbstractC2296j.m10965b(str, jSONObject));
        } catch (Exception e3) {
            Log.d(f10029d, "launchCallbackEvent: ", e3);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m10667a(String str) {
        return this.f10032c.contains(str);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m10668b(String str, JSONObject jSONObject) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (this.f10032c.contains(str)) {
                m10666c(str, jSONObject);
            } else {
                this.f10031b.put(str, jSONObject);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
