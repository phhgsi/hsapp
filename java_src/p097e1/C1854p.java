package p097e1;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: renamed from: e1.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1854p {

    /* JADX INFO: renamed from: a */
    private final String f9286a;

    public C1854p(String str) {
        this.f9286a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    /* JADX INFO: renamed from: e */
    private static String m9647e(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e3) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e3);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    /* JADX INFO: renamed from: a */
    public final int m9648a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m9647e(this.f9286a, str, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m9649b(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m9647e(this.f9286a, str, objArr), th);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m9650c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m9647e(this.f9286a, str, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m9651d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m9647e(this.f9286a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
        }
        return 0;
    }
}
