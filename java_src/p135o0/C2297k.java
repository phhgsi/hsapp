package p135o0;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o0.k */
/* JADX INFO: loaded from: classes.dex */
public class C2297k {

    /* JADX INFO: renamed from: a */
    private final List f10604a = new ArrayList();

    /* JADX INFO: renamed from: o0.k$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        final Pattern f10605a;

        /* JADX INFO: renamed from: b */
        final String f10606b;

        a(Pattern pattern, String str) {
            this.f10605a = pattern;
            this.f10606b = str;
        }
    }

    public C2297k(JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i3);
            if (jSONObjectOptJSONObject != null) {
                String strM10970g = AbstractC2296j.m10970g(jSONObjectOptJSONObject, "regex");
                String strM10970g2 = AbstractC2296j.m10970g(jSONObjectOptJSONObject, "mode");
                if (strM10970g != null && strM10970g2 != null) {
                    try {
                        this.f10604a.add(new a(Pattern.compile(strM10970g), strM10970g2));
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public String m10974a(String str) {
        if (str == null) {
            return "internal";
        }
        for (a aVar : this.f10604a) {
            if (aVar.f10605a.matcher(str).matches()) {
                return aVar.f10606b;
            }
        }
        return "internal";
    }

    /* JADX INFO: renamed from: b */
    public boolean m10975b() {
        return this.f10604a.isEmpty();
    }
}
