package co.median.android;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import androidx.core.content.AbstractC0966b;
import co.median.android.jrejze.R;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p099f.C1886e;
import p128m0.C2174Q;
import p135o0.AbstractC2296j;
import p135o0.C2287a;
import p135o0.C2290d;
import p135o0.C2292f;

/* JADX INFO: renamed from: co.median.android.z */
/* JADX INFO: loaded from: classes.dex */
public class C1378z implements NavigationBarView.InterfaceC1558c {

    /* JADX INFO: renamed from: m */
    private static final String f6846m = "co.median.android.z";

    /* JADX INFO: renamed from: a */
    private final MainActivity f6847a;

    /* JADX INFO: renamed from: b */
    private final BottomNavigationView f6848b;

    /* JADX INFO: renamed from: c */
    private final C2287a f6849c;

    /* JADX INFO: renamed from: d */
    private String f6850d;

    /* JADX INFO: renamed from: e */
    private String f6851e;

    /* JADX INFO: renamed from: f */
    private JSONArray f6852f;

    /* JADX INFO: renamed from: g */
    private Map f6853g;

    /* JADX INFO: renamed from: h */
    private final int f6854h;

    /* JADX INFO: renamed from: i */
    private int f6855i;

    /* JADX INFO: renamed from: k */
    private boolean f6857k;

    /* JADX INFO: renamed from: j */
    private final Map f6856j = new HashMap();

    /* JADX INFO: renamed from: l */
    private boolean f6858l = true;

    /* JADX INFO: renamed from: co.median.android.z$a */
    class a extends C2290d.a {
        a() {
        }
    }

    /* JADX INFO: renamed from: co.median.android.z$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        Pattern f6860a;

        /* JADX INFO: renamed from: b */
        JSONArray f6861b;

        private b() {
        }
    }

    C1378z(MainActivity mainActivity, BottomNavigationView bottomNavigationView) {
        this.f6847a = mainActivity;
        this.f6848b = bottomNavigationView;
        bottomNavigationView.setOnItemSelectedListener(this);
        this.f6849c = C2287a.m10903f(mainActivity);
        this.f6854h = mainActivity.getResources().getInteger(R.integer.tabbar_icon_size);
        this.f6855i = AbstractC0966b.getColor(mainActivity, R.color.tabBarTextColor);
        C2287a.m10903f(mainActivity).m10914a(new a());
        m7175i();
    }

    /* JADX INFO: renamed from: d */
    private int m7172d(int i3, float f3) {
        return (i3 & 16777215) | (Math.round(Color.alpha(i3) * f3) << 24);
    }

    /* JADX INFO: renamed from: g */
    private List m7173g(int i3) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArray = this.f6852f;
        if (jSONArray == null || i3 < 0 || i3 >= jSONArray.length() || (jSONObjectOptJSONObject = this.f6852f.optJSONObject(i3)) == null) {
            return null;
        }
        if (this.f6856j.containsKey(jSONObjectOptJSONObject)) {
            return (List) this.f6856j.get(jSONObjectOptJSONObject);
        }
        List listM7174h = m7174h(jSONObjectOptJSONObject);
        this.f6856j.put(jSONObjectOptJSONObject, listM7174h);
        return listM7174h;
    }

    /* JADX INFO: renamed from: h */
    private List m7174h(JSONObject jSONObject) {
        Object objOpt;
        if (jSONObject == null || (objOpt = jSONObject.opt("regex")) == null) {
            return null;
        }
        return AbstractC2296j.m10966c(objOpt);
    }

    /* JADX INFO: renamed from: i */
    private void m7175i() {
        C2287a c2287a = this.f6849c;
        ArrayList arrayList = c2287a.f10521b0;
        ArrayList arrayList2 = c2287a.f10524c0;
        if (arrayList == null || arrayList2 == null) {
            return;
        }
        this.f6853g = new HashMap();
        HashMap map = new HashMap();
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            map.put((String) arrayList2.get(i3), (Pattern) arrayList.get(i3));
        }
        for (Map.Entry entry : this.f6849c.f10513Y.entrySet()) {
            b bVar = new b();
            bVar.f6861b = (JSONArray) entry.getValue();
            bVar.f6860a = (Pattern) map.get(entry.getKey());
            this.f6853g.put((String) entry.getKey(), bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m7176j(int i3) {
        m7185n(i3, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m7177k(boolean z2) {
        if (z2) {
            this.f6848b.setVisibility(0);
        } else {
            this.f6848b.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: o */
    private void m7178o(String str) {
        if (str == null) {
            this.f6850d = null;
            m7186q(false);
            return;
        }
        String str2 = this.f6850d;
        if (str2 == null || !str2.equals(str)) {
            this.f6850d = str;
            m7179p((JSONArray) C2287a.m10903f(this.f6847a).f10513Y.get(str));
            m7186q(this.f6848b.getMenu().size() != 0);
        }
    }

    /* JADX INFO: renamed from: p */
    private void m7179p(JSONArray jSONArray) {
        this.f6852f = jSONArray;
        if (jSONArray == null) {
            this.f6848b.getMenu().clear();
            return;
        }
        Menu menu = this.f6848b.getMenu();
        int size = menu.size();
        int length = jSONArray.length();
        final int i3 = -1;
        int i4 = 0;
        while (true) {
            if (i4 >= jSONArray.length()) {
                break;
            }
            if (i4 > 4) {
                C2292f.m10956b().m10959e(f6846m, "Tab menu items list should not have more than 5 items");
                break;
            }
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i4);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("label");
                String strOptString2 = jSONObjectOptJSONObject.optString("icon");
                String strOptString3 = jSONObjectOptJSONObject.optString("activeIcon");
                String strOptString4 = jSONObjectOptJSONObject.optString("inactiveIcon");
                if (!strOptString.isEmpty() || !strOptString2.isEmpty() || !strOptString3.isEmpty() || !jSONObjectOptJSONObject.optString(ImagesContract.URL).isEmpty()) {
                    if (strOptString2.isEmpty()) {
                        strOptString2 = !strOptString3.isEmpty() ? strOptString3 : "faw_question";
                    }
                    if (strOptString3.isEmpty()) {
                        strOptString3 = strOptString2;
                    }
                    if (strOptString4.isEmpty()) {
                        strOptString4 = strOptString2;
                    }
                    C1886e c1886eM10669a = C2174Q.m10669a(this.f6847a, strOptString3, strOptString4, this.f6854h, this.f6855i);
                    if (i4 < size) {
                        MenuItem item = menu.getItem(i4);
                        if (item != null) {
                            item.setTitle(strOptString);
                            item.setIcon(c1886eM10669a);
                        }
                    } else {
                        menu.add(0, i4, 0, strOptString).setIcon(c1886eM10669a);
                    }
                    if (jSONObjectOptJSONObject.optBoolean("selected")) {
                        i3 = i4;
                    }
                }
            }
            i4++;
        }
        if (size > length) {
            for (int i5 = length; i5 < size; i5++) {
                MenuItem item2 = menu.getItem(length);
                if (item2 != null) {
                    menu.removeItem(item2.getItemId());
                }
            }
        }
        if (i3 > -1) {
            new Handler().postDelayed(new Runnable() { // from class: m0.b1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10289d.m7176j(i3);
                }
            }, 10L);
        }
    }

    @Override // com.google.android.material.navigation.NavigationBarView.InterfaceC1558c
    /* JADX INFO: renamed from: a */
    public boolean mo7180a(MenuItem menuItem) {
        JSONArray jSONArray = this.f6852f;
        if (jSONArray != null) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(menuItem.getItemId());
            String strOptString = jSONObjectOptJSONObject.optString(ImagesContract.URL);
            String strOptString2 = jSONObjectOptJSONObject.optString("javascript");
            if (!this.f6858l) {
                this.f6858l = true;
                return true;
            }
            if (!TextUtils.isEmpty(strOptString)) {
                if (TextUtils.isEmpty(strOptString2)) {
                    this.f6847a.m6915W1().m6675e(strOptString, true, true);
                } else {
                    this.f6847a.m6915W1().m6676f(strOptString, strOptString2, true, true);
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public void m7181e(String str) {
        if (this.f6852f == null) {
            return;
        }
        for (int i3 = 0; i3 < this.f6852f.length(); i3++) {
            List listM7173g = m7173g(i3);
            if (listM7173g != null) {
                Iterator it = listM7173g.iterator();
                while (it.hasNext()) {
                    if (((Pattern) it.next()).matcher(str).matches()) {
                        this.f6848b.getMenu().findItem(i3).setChecked(true);
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m7182f(String str) {
        String str2;
        this.f6851e = str;
        if (this.f6847a == null || str == null) {
            return;
        }
        if (this.f6857k) {
            m7181e(str);
            return;
        }
        C2287a c2287a = this.f6849c;
        ArrayList arrayList = c2287a.f10521b0;
        ArrayList arrayList2 = c2287a.f10524c0;
        int i3 = 0;
        if (arrayList == null || arrayList2 == null) {
            m7186q(false);
            return;
        }
        while (true) {
            if (i3 >= arrayList.size()) {
                str2 = null;
                break;
            } else {
                if (((Pattern) arrayList.get(i3)).matcher(str).matches()) {
                    str2 = (String) arrayList2.get(i3);
                    break;
                }
                i3++;
            }
        }
        m7178o(str2);
        if (str2 != null) {
            m7181e(str);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m7183l() {
        Resources.Theme theme = this.f6847a.getTheme();
        this.f6848b.setBackgroundColor(this.f6847a.getResources().getColor(R.color.tabBarBackground, theme));
        this.f6855i = this.f6847a.getResources().getColor(R.color.tabBarTextColor, theme);
        int color = this.f6847a.getResources().getColor(R.color.tabBarIndicator, theme);
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{android.R.attr.state_checked}, new int[]{-16842912}}, new int[]{color, this.f6855i});
        this.f6848b.setItemIconTintList(colorStateList);
        this.f6848b.setItemTextColor(colorStateList);
        float f3 = Build.VERSION.SDK_INT >= 29 ? this.f6847a.getResources().getFloat(R.dimen.material_emphasis_disabled) : 0.38f;
        ColorStateList colorStateList2 = new ColorStateList(new int[][]{new int[]{android.R.attr.state_activated}, new int[]{android.R.attr.state_checked}}, new int[]{m7172d(color, f3), m7172d(color, f3)});
        this.f6848b.setItemActiveIndicatorEnabled(true);
        this.f6848b.setItemActiveIndicatorColor(colorStateList2);
    }

    /* JADX INFO: renamed from: m */
    public boolean m7184m(String str, String str2) {
        BottomNavigationView bottomNavigationView;
        if (str == null) {
            return false;
        }
        if (str2 == null) {
            str2 = "";
        }
        if (this.f6852f != null) {
            for (int i3 = 0; i3 < this.f6852f.length(); i3++) {
                JSONObject jSONObjectOptJSONObject = this.f6852f.optJSONObject(i3);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString(ImagesContract.URL);
                    String strOptString2 = jSONObjectOptJSONObject.optString("javascript");
                    if (str.equals(strOptString) && str2.equals(strOptString2) && (bottomNavigationView = this.f6848b) != null) {
                        bottomNavigationView.setSelectedItemId(i3);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public void m7185n(int i3, boolean z2) {
        if (i3 < 0 || i3 >= this.f6848b.getMenu().size()) {
            return;
        }
        this.f6858l = z2;
        this.f6848b.setSelectedItemId(i3);
    }

    /* JADX INFO: renamed from: q */
    public void m7186q(final boolean z2) {
        this.f6847a.runOnUiThread(new Runnable() { // from class: m0.a1
            @Override // java.lang.Runnable
            public final void run() {
                this.f10284d.m7177k(z2);
            }
        });
    }
}
