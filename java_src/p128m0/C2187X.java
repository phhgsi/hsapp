package p128m0;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import co.median.android.MainActivity;
import org.json.JSONException;
import org.json.JSONObject;
import p071X1.AbstractC0606k;
import p135o0.AbstractC2296j;

/* JADX INFO: renamed from: m0.X */
/* JADX INFO: loaded from: classes.dex */
public final class C2187X {

    /* JADX INFO: renamed from: a */
    private final MainActivity f10258a;

    /* JADX INFO: renamed from: b */
    private final ViewGroup f10259b;

    /* JADX INFO: renamed from: c */
    private String f10260c;

    /* JADX INFO: renamed from: d */
    private int f10261d;

    /* JADX INFO: renamed from: e */
    private int f10262e;

    /* JADX INFO: renamed from: f */
    private int f10263f;

    /* JADX INFO: renamed from: g */
    private int f10264g;

    /* JADX INFO: renamed from: h */
    private boolean f10265h;

    /* JADX INFO: renamed from: i */
    private int f10266i;

    public C2187X(MainActivity mainActivity, ViewGroup viewGroup) {
        AbstractC0606k.m2145e(mainActivity, "activity");
        AbstractC0606k.m2145e(viewGroup, "rootLayout");
        this.f10258a = mainActivity;
        this.f10259b = viewGroup;
        this.f10260c = "";
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: m0.W
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C2187X.m10712b(this.f10243a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m10712b(C2187X c2187x) {
        Rect rect = new Rect();
        c2187x.f10259b.getWindowVisibleDisplayFrame(rect);
        if (c2187x.f10266i == 0) {
            c2187x.f10266i = c2187x.f10259b.getRootView().getHeight() - rect.bottom;
        }
        c2187x.f10263f = c2187x.f10259b.getRootView().getWidth();
        c2187x.f10264g = rect.bottom + c2187x.f10266i;
        int height = c2187x.f10259b.getRootView().getHeight() - c2187x.f10264g;
        c2187x.f10262e = height;
        if (height == c2187x.f10266i) {
            c2187x.f10262e = 0;
        }
        if (c2187x.f10262e != 0) {
            c2187x.f10261d = c2187x.f10263f;
            if (c2187x.f10265h) {
                return;
            }
            c2187x.f10265h = true;
            c2187x.m10713d();
            return;
        }
        c2187x.f10261d = 0;
        if (c2187x.f10265h) {
            c2187x.f10265h = false;
            c2187x.m10713d();
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m10713d() {
        if (TextUtils.isEmpty(this.f10260c)) {
            return;
        }
        this.f10258a.mo6920a(AbstractC2296j.m10965b(this.f10260c, m10714c()));
    }

    /* JADX INFO: renamed from: c */
    public final JSONObject m10714c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", this.f10261d);
        jSONObject.put("height", this.f10262e);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("width", this.f10263f);
        jSONObject2.put("height", this.f10264g);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("visible", this.f10265h);
        jSONObject3.put("keyboardWindowSize", jSONObject);
        jSONObject3.put("visibleWindowSize", jSONObject2);
        return jSONObject3;
    }
}
