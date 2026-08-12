package co.median.android;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p128m0.AbstractC2181U;
import p135o0.AbstractC2296j;
import p135o0.C2292f;

/* JADX INFO: renamed from: co.median.android.y */
/* JADX INFO: loaded from: classes.dex */
public class C1377y {

    /* JADX INFO: renamed from: e */
    private static final String f6835e = "co.median.android.y";

    /* JADX INFO: renamed from: a */
    private Context f6836a;

    /* JADX INFO: renamed from: b */
    private JSONObject f6837b;

    /* JADX INFO: renamed from: c */
    private String f6838c;

    /* JADX INFO: renamed from: d */
    private List f6839d = new LinkedList();

    /* JADX INFO: renamed from: co.median.android.y$a */
    private class a {

        /* JADX INFO: renamed from: a */
        private String f6840a;

        /* JADX INFO: renamed from: b */
        private List f6841b;

        a(String str, List list) {
            this.f6840a = str;
            this.f6841b = list;
        }

        /* JADX INFO: renamed from: c */
        void m7168c() {
            new b(C1377y.this.f6836a, this, C1377y.this).execute(new Void[0]);
        }
    }

    /* JADX INFO: renamed from: co.median.android.y$b */
    private static class b extends AsyncTask {

        /* JADX INFO: renamed from: a */
        private a f6843a;

        /* JADX INFO: renamed from: b */
        private C1377y f6844b;

        /* JADX INFO: renamed from: c */
        private Context f6845c;

        b(Context context, a aVar, C1377y c1377y) {
            this.f6843a = aVar;
            this.f6844b = c1377y;
            this.f6845c = context;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            HashMap map = new HashMap();
            map.putAll(AbstractC2181U.m10674b(this.f6844b.f6836a));
            if (((GoNativeApplication) this.f6845c).m6768c() != null) {
                map.putAll(((GoNativeApplication) this.f6845c).m6768c());
            }
            if (this.f6844b.f6837b != null) {
                Iterator<String> itKeys = this.f6844b.f6837b.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put("customData_" + next, this.f6844b.f6837b.opt(next));
                }
            }
            try {
                JSONObject jSONObject = new JSONObject(map);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f6843a.f6840a).openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setDoOutput(true);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
                outputStreamWriter.write(jSONObject.toString());
                outputStreamWriter.close();
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode >= 200 && responseCode <= 299) {
                    return null;
                }
                Log.w(C1377y.f6835e, "Recevied status code " + responseCode + " when posting to " + this.f6843a.f6840a);
                return null;
            } catch (Exception e3) {
                C2292f.m10956b().m10960f(C1377y.f6835e, "Error posting to " + this.f6843a.f6840a, e3);
                return null;
            }
        }
    }

    C1377y(Context context) {
        this.f6836a = context;
    }

    /* JADX INFO: renamed from: d */
    public void m7164d(String str) {
        this.f6838c = str;
        for (a aVar : this.f6839d) {
            if (AbstractC2296j.m10971h(str, aVar.f6841b)) {
                aVar.m7168c();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m7165e(JSONArray jSONArray) {
        this.f6839d.clear();
        if (jSONArray == null) {
            return;
        }
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i3);
            if (jSONObjectOptJSONObject != null) {
                String strM10970g = AbstractC2296j.m10970g(jSONObjectOptJSONObject, ImagesContract.URL);
                if (strM10970g == null) {
                    Log.w(f6835e, "Invalid registration: endpoint url is null");
                } else {
                    this.f6839d.add(new a(strM10970g, AbstractC2296j.m10966c(jSONObjectOptJSONObject.opt("urlRegex"))));
                }
            }
        }
    }
}
