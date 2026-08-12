package p135o0;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

/* JADX INFO: renamed from: o0.f */
/* JADX INFO: loaded from: classes.dex */
public class C2292f {

    /* JADX INFO: renamed from: b */
    private static C2292f f10602b;

    /* JADX INFO: renamed from: a */
    private Context f10603a;

    private C2292f() {
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C2292f m10956b() {
        try {
            if (f10602b == null) {
                f10602b = new C2292f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f10602b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m10957d(String str) {
        Toast.makeText(this.f10603a, str, 0).show();
    }

    /* JADX INFO: renamed from: c */
    public void m10958c(Context context) {
        this.f10603a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: e */
    public void m10959e(String str, String str2) {
        if (str2 == null) {
            str2 = "null";
        }
        Log.e(str, str2);
    }

    /* JADX INFO: renamed from: f */
    public void m10960f(String str, String str2, Exception exc) {
        if (exc != null) {
            if (str2 == null) {
                str2 = "null";
            }
            Log.e(str, str2, exc);
        } else {
            if (str2 == null) {
                str2 = "null";
            }
            Log.e(str, str2);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m10961g(String str, final String str2, Exception exc, int i3) {
        m10960f(str, str2, exc);
        if (i3 != 1 || this.f10603a == null || str2 == null) {
            return;
        }
        try {
            new Handler(this.f10603a.getMainLooper()).post(new Runnable() { // from class: o0.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10600d.m10957d(str2);
                }
            });
        } catch (Exception unused) {
        }
    }
}
