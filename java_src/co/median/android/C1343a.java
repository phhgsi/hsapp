package co.median.android;

import android.content.Context;
import android.os.AsyncTask;
import java.io.OutputStreamWriter;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;
import p128m0.AbstractC2181U;
import p135o0.C2287a;
import p135o0.C2292f;

/* JADX INFO: renamed from: co.median.android.a */
/* JADX INFO: loaded from: classes.dex */
public class C1343a {

    /* JADX INFO: renamed from: b */
    private static final String f6562b = "co.median.android.a";

    /* JADX INFO: renamed from: a */
    private Context f6563a;

    /* JADX INFO: renamed from: co.median.android.a$a */
    private static class a extends AsyncTask {

        /* JADX INFO: renamed from: a */
        WeakReference f6564a;

        a(Context context) {
            this.f6564a = new WeakReference(context);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            Context context = (Context) this.f6564a.get();
            if (context == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(AbstractC2181U.m10674b(context));
            try {
                jSONObject.put("event", "launch");
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://events.gonative.io/api/events/new").openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setDoInput(false);
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
                    outputStreamWriter.write(jSONObject.toString());
                    outputStreamWriter.close();
                    httpURLConnection.connect();
                    httpURLConnection.getResponseCode();
                    httpURLConnection.disconnect();
                } catch (Exception e3) {
                    C2292f.m10956b().m10960f(C1343a.f6562b, e3.getMessage(), e3);
                }
                return null;
            } catch (JSONException e4) {
                C2292f.m10956b().m10960f(C1343a.f6562b, e4.getMessage(), e4);
                return null;
            }
        }
    }

    C1343a(Context context) {
        this.f6563a = context;
    }

    /* JADX INFO: renamed from: b */
    public void m6980b() {
        if (C2287a.m10903f(this.f6563a).f10491N) {
            return;
        }
        new a(this.f6563a).execute(new Void[0]);
    }
}
