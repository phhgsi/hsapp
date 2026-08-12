package p128m0;

import android.app.Activity;
import android.graphics.Point;
import android.util.Pair;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import co.median.android.AbstractC1323D;
import co.median.android.C1361s;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p135o0.C2287a;
import p135o0.C2290d;
import p135o0.InterfaceC2294h;

/* JADX INFO: renamed from: m0.o1 */
/* JADX INFO: loaded from: classes.dex */
public class C2237o1 {

    /* JADX INFO: renamed from: a */
    private C2170O f10346a;

    /* JADX INFO: renamed from: b */
    private boolean f10347b;

    /* JADX INFO: renamed from: c */
    private Map f10348c;

    /* JADX INFO: renamed from: d */
    private Map f10349d;

    /* JADX INFO: renamed from: e */
    private d f10350e = new d();

    /* JADX INFO: renamed from: f */
    private List f10351f;

    /* JADX INFO: renamed from: g */
    private Set f10352g;

    /* JADX INFO: renamed from: h */
    private InterfaceC2294h f10353h;

    /* JADX INFO: renamed from: i */
    private String f10354i;

    /* JADX INFO: renamed from: j */
    private boolean f10355j;

    /* JADX INFO: renamed from: k */
    private String f10356k;

    /* JADX INFO: renamed from: l */
    private boolean f10357l;

    /* JADX INFO: renamed from: m0.o1$a */
    class a extends C2290d.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Activity f10358a;

        a(Activity activity) {
            this.f10358a = activity;
        }
    }

    /* JADX INFO: renamed from: m0.o1$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2237o1.this.f10353h.loadUrl(C2237o1.this.f10354i);
        }
    }

    /* JADX INFO: renamed from: m0.o1$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Activity f10361d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f10362e;

        c(Activity activity, String str) {
            this.f10361d = activity;
            this.f10362e = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1361s c1361s = new C1361s(this.f10361d);
            C2237o1.this.f10353h = c1361s;
            C2237o1.this.f10352g.remove(this.f10362e);
            AbstractC1323D.m6735b(c1361s, this.f10361d);
            WindowManager windowManager = (WindowManager) this.f10361d.getSystemService("window");
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                c1361s.layout(0, 0, point.x, point.y);
            }
            new C2180T0(this.f10361d, C2237o1.this.f10350e, c1361s);
            C2237o1.this.f10353h = c1361s;
            C2237o1.this.f10352g.remove(this.f10362e);
            C2237o1.this.f10353h.loadUrl(this.f10362e);
        }
    }

    /* JADX INFO: renamed from: m0.o1$d */
    public class d {
        public d() {
        }

        /* JADX INFO: renamed from: a */
        public WebResourceResponse m10812a(Activity activity, InterfaceC2294h interfaceC2294h, String str) {
            return C2237o1.this.f10346a.m10656b(activity, interfaceC2294h, str, null);
        }

        /* JADX INFO: renamed from: b */
        public void m10813b(Activity activity, InterfaceC2294h interfaceC2294h, String str) {
            C2237o1 c2237o1 = C2237o1.this;
            c2237o1.f10348c.put(c2237o1.f10354i, c2237o1.f10353h);
            c2237o1.f10354i = null;
            c2237o1.f10353h = null;
            c2237o1.f10355j = false;
            c2237o1.f10346a.m10657c(null);
            c2237o1.m10804q(activity);
        }
    }

    /* JADX INFO: renamed from: p */
    private void m10803p(Activity activity) {
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArray = C2287a.m10903f(activity).f10564p1;
        if (jSONArray == null) {
            return;
        }
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i3);
            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("urls")) != null) {
                HashSet hashSet = new HashSet();
                for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                    if (!jSONArrayOptJSONArray.isNull(i4)) {
                        EnumC2240p1 enumC2240p1 = EnumC2240p1.f10371g;
                        Object objOpt = jSONArrayOptJSONArray.opt(i4);
                        String strOptString = objOpt instanceof String ? (String) objOpt : null;
                        if (strOptString == null && (objOpt instanceof JSONObject)) {
                            JSONObject jSONObject = (JSONObject) objOpt;
                            strOptString = jSONObject.optString(ImagesContract.URL);
                            String strM10904j = C2287a.m10904j(jSONObject, "disown");
                            if (strM10904j != null) {
                                if (strM10904j.equalsIgnoreCase("reload")) {
                                    enumC2240p1 = EnumC2240p1.Reload;
                                } else if (strM10904j.equalsIgnoreCase("never")) {
                                    enumC2240p1 = EnumC2240p1.Never;
                                } else if (strM10904j.equalsIgnoreCase("always")) {
                                    enumC2240p1 = EnumC2240p1.Always;
                                }
                            }
                        }
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                            this.f10349d.put(strOptString, enumC2240p1);
                        }
                    }
                }
                this.f10351f.add(hashSet);
            }
        }
        String str = this.f10356k;
        if (str != null) {
            m10811s(str);
        }
        m10804q(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public void m10804q(Activity activity) {
        if (this.f10357l || this.f10355j) {
            return;
        }
        if (this.f10353h != null && this.f10354i != null) {
            activity.runOnUiThread(new b());
            this.f10355j = true;
        } else {
            if (this.f10352g.isEmpty()) {
                return;
            }
            String str = (String) this.f10352g.iterator().next();
            this.f10354i = str;
            this.f10346a.m10657c(str);
            activity.runOnUiThread(new c(activity, str));
        }
    }

    /* JADX INFO: renamed from: r */
    private HashSet m10805r(String str) {
        HashSet hashSet = new HashSet();
        for (Set set : this.f10351f) {
            if (set.contains(str)) {
                hashSet.addAll(set);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: k */
    public void m10806k(InterfaceC2294h interfaceC2294h) {
        Iterator it = this.f10348c.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (this.f10348c.get(str) == interfaceC2294h) {
                it.remove();
                this.f10352g.add(str);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m10807l() {
        InterfaceC2294h interfaceC2294h = this.f10353h;
        if (interfaceC2294h != null) {
            interfaceC2294h.stopLoading();
        }
        this.f10355j = false;
        this.f10353h = null;
        this.f10354i = null;
        this.f10356k = null;
        this.f10348c.clear();
    }

    /* JADX INFO: renamed from: m */
    public void m10808m(Activity activity) {
        if (this.f10347b) {
            return;
        }
        this.f10347b = true;
        this.f10346a = new C2170O();
        this.f10348c = new HashMap();
        this.f10349d = new HashMap();
        this.f10351f = new ArrayList();
        this.f10352g = new HashSet();
        C2287a.m10903f(activity).m10914a(new a(activity));
        m10803p(activity);
    }

    /* JADX INFO: renamed from: n */
    public void m10809n(Activity activity) {
        this.f10357l = false;
        m10804q(activity);
    }

    /* JADX INFO: renamed from: o */
    public void m10810o() {
        this.f10357l = true;
        InterfaceC2294h interfaceC2294h = this.f10353h;
        if (interfaceC2294h != null) {
            interfaceC2294h.stopLoading();
            this.f10355j = false;
        }
    }

    /* JADX INFO: renamed from: s */
    public Pair m10811s(String str) {
        this.f10356k = str;
        HashSet hashSetM10805r = m10805r(str);
        if (hashSetM10805r.size() > 0) {
            HashSet hashSet = new HashSet(hashSetM10805r);
            String str2 = this.f10354i;
            if (str2 != null) {
                hashSet.remove(str2);
            }
            hashSet.removeAll(this.f10348c.keySet());
            this.f10352g.addAll(hashSet);
        }
        InterfaceC2294h interfaceC2294h = (InterfaceC2294h) this.f10348c.get(str);
        return interfaceC2294h == null ? new Pair(null, null) : new Pair(interfaceC2294h, (EnumC2240p1) this.f10349d.get(str));
    }
}
