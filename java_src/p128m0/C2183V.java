package p128m0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.AbstractC0966b;
import co.median.android.MainActivity;
import co.median.android.jrejze.R;
import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONArray;
import org.json.JSONObject;
import p132n0.C2279a;
import p135o0.C2292f;

/* JADX INFO: renamed from: m0.V */
/* JADX INFO: loaded from: classes.dex */
public class C2183V extends BaseExpandableListAdapter implements ExpandableListView.OnGroupClickListener, ExpandableListView.OnChildClickListener {

    /* JADX INFO: renamed from: l */
    private static final String f10230l = "m0.V";

    /* JADX INFO: renamed from: a */
    private final MainActivity f10231a;

    /* JADX INFO: renamed from: b */
    private final ExpandableListView f10232b;

    /* JADX INFO: renamed from: c */
    private final int f10233c;

    /* JADX INFO: renamed from: d */
    private final int f10234d;

    /* JADX INFO: renamed from: e */
    private int f10235e;

    /* JADX INFO: renamed from: f */
    private int f10236f;

    /* JADX INFO: renamed from: g */
    private int f10237g;

    /* JADX INFO: renamed from: k */
    private int f10241k;

    /* JADX INFO: renamed from: i */
    private boolean f10239i = false;

    /* JADX INFO: renamed from: j */
    private boolean f10240j = false;

    /* JADX INFO: renamed from: h */
    private JSONArray f10238h = new JSONArray();

    C2183V(MainActivity mainActivity, ExpandableListView expandableListView) {
        this.f10231a = mainActivity;
        this.f10233c = mainActivity.getResources().getInteger(R.integer.sidebar_icon_size);
        this.f10234d = mainActivity.getResources().getInteger(R.integer.sidebar_expand_indicator_size);
        this.f10232b = expandableListView;
        this.f10236f = AbstractC0966b.getColor(mainActivity, R.color.sidebarForeground);
        this.f10237g = AbstractC0966b.getColor(mainActivity, R.color.sidebarBackground);
        this.f10235e = AbstractC0966b.getColor(mainActivity, R.color.sidebarHighlight);
        expandableListView.setAdapter(this);
        expandableListView.setOnGroupClickListener(this);
        expandableListView.setOnChildClickListener(this);
        expandableListView.setDividerHeight(5);
    }

    /* JADX INFO: renamed from: b */
    private RippleDrawable m10679b() {
        GradientDrawable gradientDrawableM10680c = m10680c();
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_activated}, gradientDrawableM10680c);
        stateListDrawable.addState(new int[]{android.R.attr.state_selected}, gradientDrawableM10680c);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(m10681d());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(100.0f);
        gradientDrawable.setColor(colorStateListValueOf);
        return new RippleDrawable(colorStateListValueOf, stateListDrawable, gradientDrawable);
    }

    /* JADX INFO: renamed from: c */
    private GradientDrawable m10680c() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(100.0f);
        gradientDrawable.setColor(this.f10235e);
        gradientDrawable.setAlpha(100);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: d */
    private int m10681d() {
        int iMax;
        int iMax2;
        int iMax3;
        float f3 = AbstractC2207e1.m10765d(this.f10231a) ? 0.2f : -0.2f;
        int iAlpha = Color.alpha(this.f10237g);
        int iRed = Color.red(this.f10237g);
        int iGreen = Color.green(this.f10237g);
        int iBlue = Color.blue(this.f10237g);
        if (f3 > 0.0f) {
            iMax = Math.min((int) (iRed + ((255 - iRed) * f3)), 255);
            iMax2 = Math.min((int) (iGreen + ((255 - iGreen) * f3)), 255);
            iMax3 = Math.min((int) (iBlue + ((255 - iBlue) * f3)), 255);
        } else {
            float f4 = f3 + 1.0f;
            iMax = Math.max((int) (iRed * f4), 0);
            iMax2 = Math.max((int) (iGreen * f4), 0);
            iMax3 = Math.max((int) (iBlue * f4), 0);
        }
        return Color.argb(iAlpha, iMax, iMax2, iMax3);
    }

    /* JADX INFO: renamed from: e */
    private String m10682e(int i3) {
        return m10687j("label", i3);
    }

    /* JADX INFO: renamed from: f */
    private String m10683f(int i3, int i4) {
        return m10688k("label", i3, i4);
    }

    /* JADX INFO: renamed from: g */
    private Pair m10684g(int i3) {
        return new Pair(m10687j(ImagesContract.URL, i3), m10687j("javascript", i3));
    }

    /* JADX INFO: renamed from: h */
    private Pair m10685h(int i3, int i4) {
        return new Pair(m10688k(ImagesContract.URL, i3, i4), m10688k("javascript", i3, i4));
    }

    /* JADX INFO: renamed from: i */
    private boolean m10686i(int i3) {
        try {
            return ((JSONObject) this.f10238h.get(i3)).optBoolean("isGrouping", false);
        } catch (Exception e3) {
            C2292f.m10956b().m10960f(f10230l, e3.getMessage(), e3);
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    private String m10687j(String str, int i3) {
        try {
            JSONObject jSONObject = (JSONObject) this.f10238h.get(i3);
            if (jSONObject.isNull(str)) {
                return null;
            }
            return jSONObject.getString(str).trim();
        } catch (Exception e3) {
            C2292f.m10956b().m10960f(f10230l, e3.getMessage(), e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    private String m10688k(String str, int i3, int i4) {
        try {
            JSONObject jSONObject = ((JSONObject) this.f10238h.get(i3)).getJSONArray("subLinks").getJSONObject(i4);
            if (jSONObject.isNull(str)) {
                return null;
            }
            return jSONObject.getString(str).trim();
        } catch (Exception e3) {
            C2292f.m10956b().m10960f(f10230l, e3.getMessage(), e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    private void m10689l(String str, String str2) {
        if (C2210f1.m10771a().m10773b() != null) {
            str = str.replaceAll("GONATIVE_USERID", C2210f1.m10771a().m10773b());
        }
        if (str2 == null) {
            this.f10231a.m6915W1().m6674d(str, true);
        } else {
            this.f10231a.m6915W1().m6676f(str, str2, true, false);
        }
        this.f10231a.m6950w1();
    }

    /* JADX INFO: renamed from: a */
    public void m10690a(String str) {
        String strReplaceAll = str.replaceAll("/$", "");
        if (this.f10238h == null) {
            return;
        }
        for (int i3 = 0; i3 < this.f10238h.length(); i3++) {
            if (strReplaceAll.equals(this.f10238h.optJSONObject(i3).optString(ImagesContract.URL).replaceAll("/$", ""))) {
                this.f10232b.setItemChecked(i3, true);
                this.f10241k = i3;
                return;
            }
        }
    }

    @Override // android.widget.ExpandableListAdapter
    public Object getChild(int i3, int i4) {
        return null;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i3, int i4) {
        return 0L;
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public int getChildType(int i3, int i4) {
        return (this.f10239i || this.f10240j) ? 0 : 1;
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public int getChildTypeCount() {
        return 2;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int i3, int i4, boolean z2, View view, ViewGroup viewGroup) {
        int i5;
        String strM10688k;
        if (view == null) {
            LayoutInflater layoutInflater = this.f10231a.getLayoutInflater();
            view = (this.f10239i || this.f10240j) ? layoutInflater.inflate(R.layout.menu_child_icon, viewGroup, false) : layoutInflater.inflate(R.layout.menu_child_noicon, viewGroup, false);
        }
        ((RelativeLayout) view.findViewById(R.id.menu_item)).setBackground(m10679b());
        int i6 = this.f10241k == this.f10232b.getFlatListPosition(ExpandableListView.getPackedPositionForChild(i3, i4)) ? 1 : 0;
        if (i6 != 0) {
            i5 = this.f10235e;
            strM10688k = m10688k("activeIcon", i3, i4);
        } else {
            i5 = this.f10236f;
            strM10688k = m10688k("inactiveIcon", i3, i4);
        }
        if (strM10688k == null || strM10688k.isEmpty()) {
            strM10688k = m10688k("icon", i3, i4);
        }
        TextView textView = (TextView) view.findViewById(R.id.menu_item_title);
        textView.setText(m10683f(i3, i4));
        textView.setTextColor(i5);
        textView.setTypeface(Typeface.create("sans-serif-medium", i6));
        ImageView imageView = (ImageView) view.findViewById(R.id.menu_item_icon);
        if (imageView != null) {
            if (strM10688k != null && !strM10688k.isEmpty()) {
                imageView.setImageDrawable(new C2279a(this.f10231a, strM10688k, this.f10233c, i5).m10885a());
                imageView.setVisibility(0);
                return view;
            }
            imageView.setVisibility(4);
        }
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i3) {
        try {
            JSONObject jSONObject = (JSONObject) this.f10238h.get(i3);
            if (jSONObject.optBoolean("isGrouping", false)) {
                return jSONObject.getJSONArray("subLinks").length();
            }
        } catch (Exception e3) {
            C2292f.m10956b().m10960f(f10230l, e3.getMessage(), e3);
        }
        return 0;
    }

    @Override // android.widget.ExpandableListAdapter
    public Object getGroup(int i3) {
        return null;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        return this.f10238h.length();
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i3) {
        return 0L;
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public int getGroupType(int i3) {
        return this.f10239i ? 0 : 1;
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public int getGroupTypeCount() {
        return 2;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getGroupView(int i3, boolean z2, View view, ViewGroup viewGroup) {
        int i4;
        String strM10687j;
        if (view == null) {
            view = this.f10231a.getLayoutInflater().inflate(this.f10239i ? R.layout.menu_group_icon : R.layout.menu_group_noicon, (ViewGroup) null);
        }
        ((RelativeLayout) view.findViewById(R.id.menu_item)).setBackground(m10679b());
        int i5 = this.f10241k == i3 ? 1 : 0;
        if (i5 != 0) {
            i4 = this.f10235e;
            strM10687j = m10687j("activeIcon", i3);
        } else {
            i4 = this.f10236f;
            strM10687j = m10687j("inactiveIcon", i3);
        }
        if (strM10687j == null || strM10687j.isEmpty()) {
            strM10687j = m10687j("icon", i3);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.menu_group_indicator);
        if (m10686i(i3)) {
            imageView.setImageDrawable(new C2279a(this.f10231a, z2 ? "fas fa-angle-up" : "fas fa-angle-down", this.f10234d, i4).m10885a());
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        TextView textView = (TextView) view.findViewById(R.id.menu_item_title);
        textView.setText(m10682e(i3));
        textView.setTextColor(i4);
        textView.setTypeface(Typeface.create("sans-serif-medium", i5));
        ImageView imageView2 = (ImageView) view.findViewById(R.id.menu_item_icon);
        if (imageView2 != null) {
            if (strM10687j != null && !strM10687j.isEmpty()) {
                imageView2.setImageDrawable(new C2279a(this.f10231a, strM10687j, this.f10233c, i4).m10885a());
                imageView2.setVisibility(0);
                return view;
            }
            imageView2.setVisibility(4);
        }
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i3, int i4) {
        return true;
    }

    /* JADX INFO: renamed from: m */
    public void m10691m() {
        Resources.Theme theme = this.f10231a.getTheme();
        this.f10236f = this.f10231a.getResources().getColor(R.color.sidebarForeground, theme);
        this.f10237g = this.f10231a.getResources().getColor(R.color.sidebarBackground, theme);
        this.f10235e = this.f10231a.getResources().getColor(R.color.sidebarHighlight, theme);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: n */
    public synchronized void m10692n(JSONArray jSONArray) {
        JSONArray jSONArrayOptJSONArray;
        int i3;
        try {
            this.f10238h = jSONArray;
            if (jSONArray == null) {
                this.f10238h = new JSONArray();
            }
            this.f10239i = false;
            this.f10240j = false;
            for (int i4 = 0; i4 < this.f10238h.length(); i4++) {
                JSONObject jSONObjectOptJSONObject = this.f10238h.optJSONObject(i4);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("icon");
                    String strOptString2 = jSONObjectOptJSONObject.optString("activeIcon");
                    if (!strOptString.isEmpty() || !strOptString2.isEmpty()) {
                        this.f10239i = true;
                    }
                    if (jSONObjectOptJSONObject.optBoolean("isGrouping", false) && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("subLinks")) != null) {
                        for (0; i3 < jSONArrayOptJSONArray.length(); i3 + 1) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i3);
                            i3 = (jSONObjectOptJSONObject2.optString("icon").isEmpty() && jSONObjectOptJSONObject2.optString("activeIcon").isEmpty()) ? i3 + 1 : 0;
                            this.f10240j = true;
                        }
                    }
                }
            }
            notifyDataSetChanged();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ExpandableListView.OnChildClickListener
    public boolean onChildClick(ExpandableListView expandableListView, View view, int i3, int i4, long j3) {
        int flatListPosition = expandableListView.getFlatListPosition(ExpandableListView.getPackedPositionForChild(i3, i4));
        expandableListView.setItemChecked(flatListPosition, true);
        this.f10241k = flatListPosition;
        Pair pairM10685h = m10685h(i3, i4);
        m10689l((String) pairM10685h.first, (String) pairM10685h.second);
        return true;
    }

    @Override // android.widget.ExpandableListView.OnGroupClickListener
    public boolean onGroupClick(ExpandableListView expandableListView, View view, int i3, long j3) {
        try {
            if (m10686i(i3)) {
                return false;
            }
            Pair pairM10684g = m10684g(i3);
            m10689l((String) pairM10684g.first, (String) pairM10684g.second);
            return true;
        } catch (Exception e3) {
            C2292f.m10956b().m10960f(f10230l, e3.getMessage(), e3);
            return false;
        }
    }
}
