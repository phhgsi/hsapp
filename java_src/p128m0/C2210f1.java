package p128m0;

import android.content.Context;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p135o0.C2287a;
import p135o0.C2292f;

/* JADX INFO: renamed from: m0.f1 */
/* JADX INFO: loaded from: classes.dex */
public class C2210f1 {

    /* JADX INFO: renamed from: c */
    private static final String f10314c = "m0.f1";

    /* JADX INFO: renamed from: d */
    private static C2210f1 f10315d;

    /* JADX INFO: renamed from: a */
    private Pattern f10316a = null;

    /* JADX INFO: renamed from: b */
    private String f10317b = null;

    private C2210f1() {
    }

    /* JADX INFO: renamed from: a */
    public static C2210f1 m10771a() {
        if (f10315d == null) {
            f10315d = new C2210f1();
        }
        return f10315d;
    }

    /* JADX INFO: renamed from: e */
    private void m10772e(String str) {
        this.f10317b = str;
    }

    /* JADX INFO: renamed from: b */
    public String m10773b() {
        return this.f10317b;
    }

    /* JADX INFO: renamed from: c */
    public void m10774c(Context context) {
        String str = C2287a.m10903f(context).f10471D;
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            this.f10316a = Pattern.compile(str);
        } catch (PatternSyntaxException e3) {
            C2292f.m10956b().m10960f(f10314c, e3.getMessage(), e3);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m10775d(String str) {
        Pattern pattern = this.f10316a;
        if (pattern != null) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.groupCount() <= 0 || !matcher.find()) {
                return;
            }
            m10772e(matcher.group(1));
        }
    }
}
