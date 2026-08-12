package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0786e;
import androidx.appcompat.view.menu.C0788g;
import androidx.appcompat.widget.AbstractC0836M;
import androidx.appcompat.widget.C0888e0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p003B.InterfaceMenuC0028a;
import p027J.AbstractC0275b;
import p027J.AbstractC0319x;
import p091d.AbstractC1769j;
import p111i.MenuItemC2022c;

/* JADX INFO: renamed from: androidx.appcompat.view.g */
/* JADX INFO: loaded from: classes.dex */
public class C0777g extends MenuInflater {

    /* JADX INFO: renamed from: e */
    static final Class[] f2837e;

    /* JADX INFO: renamed from: f */
    static final Class[] f2838f;

    /* JADX INFO: renamed from: a */
    final Object[] f2839a;

    /* JADX INFO: renamed from: b */
    final Object[] f2840b;

    /* JADX INFO: renamed from: c */
    Context f2841c;

    /* JADX INFO: renamed from: d */
    private Object f2842d;

    /* JADX INFO: renamed from: androidx.appcompat.view.g$a */
    private static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c */
        private static final Class[] f2843c = {MenuItem.class};

        /* JADX INFO: renamed from: a */
        private Object f2844a;

        /* JADX INFO: renamed from: b */
        private Method f2845b;

        public a(Object obj, String str) {
            this.f2844a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f2845b = cls.getMethod(str, f2843c);
            } catch (Exception e3) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e3);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f2845b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f2845b.invoke(this.f2844a, menuItem)).booleanValue();
                }
                this.f2845b.invoke(this.f2844a, menuItem);
                return true;
            } catch (Exception e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.g$b */
    private class b {

        /* JADX INFO: renamed from: A */
        AbstractC0275b f2846A;

        /* JADX INFO: renamed from: B */
        private CharSequence f2847B;

        /* JADX INFO: renamed from: C */
        private CharSequence f2848C;

        /* JADX INFO: renamed from: D */
        private ColorStateList f2849D = null;

        /* JADX INFO: renamed from: E */
        private PorterDuff.Mode f2850E = null;

        /* JADX INFO: renamed from: a */
        private Menu f2852a;

        /* JADX INFO: renamed from: b */
        private int f2853b;

        /* JADX INFO: renamed from: c */
        private int f2854c;

        /* JADX INFO: renamed from: d */
        private int f2855d;

        /* JADX INFO: renamed from: e */
        private int f2856e;

        /* JADX INFO: renamed from: f */
        private boolean f2857f;

        /* JADX INFO: renamed from: g */
        private boolean f2858g;

        /* JADX INFO: renamed from: h */
        private boolean f2859h;

        /* JADX INFO: renamed from: i */
        private int f2860i;

        /* JADX INFO: renamed from: j */
        private int f2861j;

        /* JADX INFO: renamed from: k */
        private CharSequence f2862k;

        /* JADX INFO: renamed from: l */
        private CharSequence f2863l;

        /* JADX INFO: renamed from: m */
        private int f2864m;

        /* JADX INFO: renamed from: n */
        private char f2865n;

        /* JADX INFO: renamed from: o */
        private int f2866o;

        /* JADX INFO: renamed from: p */
        private char f2867p;

        /* JADX INFO: renamed from: q */
        private int f2868q;

        /* JADX INFO: renamed from: r */
        private int f2869r;

        /* JADX INFO: renamed from: s */
        private boolean f2870s;

        /* JADX INFO: renamed from: t */
        private boolean f2871t;

        /* JADX INFO: renamed from: u */
        private boolean f2872u;

        /* JADX INFO: renamed from: v */
        private int f2873v;

        /* JADX INFO: renamed from: w */
        private int f2874w;

        /* JADX INFO: renamed from: x */
        private String f2875x;

        /* JADX INFO: renamed from: y */
        private String f2876y;

        /* JADX INFO: renamed from: z */
        private String f2877z;

        public b(Menu menu) {
            this.f2852a = menu;
            m3028h();
        }

        /* JADX INFO: renamed from: c */
        private char m3020c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* JADX INFO: renamed from: e */
        private Object m3021e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C0777g.this.f2841c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e3) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e3);
                return null;
            }
        }

        /* JADX INFO: renamed from: i */
        private void m3022i(MenuItem menuItem) {
            boolean z2 = false;
            menuItem.setChecked(this.f2870s).setVisible(this.f2871t).setEnabled(this.f2872u).setCheckable(this.f2869r >= 1).setTitleCondensed(this.f2863l).setIcon(this.f2864m);
            int i3 = this.f2873v;
            if (i3 >= 0) {
                menuItem.setShowAsAction(i3);
            }
            if (this.f2877z != null) {
                if (C0777g.this.f2841c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(C0777g.this.m3019b(), this.f2877z));
            }
            if (this.f2869r >= 2) {
                if (menuItem instanceof C0788g) {
                    ((C0788g) menuItem).m3195t(true);
                } else if (menuItem instanceof MenuItemC2022c) {
                    ((MenuItemC2022c) menuItem).m10207h(true);
                }
            }
            String str = this.f2875x;
            if (str != null) {
                menuItem.setActionView((View) m3021e(str, C0777g.f2837e, C0777g.this.f2839a));
                z2 = true;
            }
            int i4 = this.f2874w;
            if (i4 > 0) {
                if (z2) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i4);
                }
            }
            AbstractC0275b abstractC0275b = this.f2846A;
            if (abstractC0275b != null) {
                AbstractC0319x.m1145a(menuItem, abstractC0275b);
            }
            AbstractC0319x.m1147c(menuItem, this.f2847B);
            AbstractC0319x.m1151g(menuItem, this.f2848C);
            AbstractC0319x.m1146b(menuItem, this.f2865n, this.f2866o);
            AbstractC0319x.m1150f(menuItem, this.f2867p, this.f2868q);
            PorterDuff.Mode mode = this.f2850E;
            if (mode != null) {
                AbstractC0319x.m1149e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f2849D;
            if (colorStateList != null) {
                AbstractC0319x.m1148d(menuItem, colorStateList);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m3023a() {
            this.f2859h = true;
            m3022i(this.f2852a.add(this.f2853b, this.f2860i, this.f2861j, this.f2862k));
        }

        /* JADX INFO: renamed from: b */
        public SubMenu m3024b() {
            this.f2859h = true;
            SubMenu subMenuAddSubMenu = this.f2852a.addSubMenu(this.f2853b, this.f2860i, this.f2861j, this.f2862k);
            m3022i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        /* JADX INFO: renamed from: d */
        public boolean m3025d() {
            return this.f2859h;
        }

        /* JADX INFO: renamed from: f */
        public void m3026f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = C0777g.this.f2841c.obtainStyledAttributes(attributeSet, AbstractC1769j.f9124w1);
            this.f2853b = typedArrayObtainStyledAttributes.getResourceId(AbstractC1769j.f9134y1, 0);
            this.f2854c = typedArrayObtainStyledAttributes.getInt(AbstractC1769j.f8878A1, 0);
            this.f2855d = typedArrayObtainStyledAttributes.getInt(AbstractC1769j.f8883B1, 0);
            this.f2856e = typedArrayObtainStyledAttributes.getInt(AbstractC1769j.f8888C1, 0);
            this.f2857f = typedArrayObtainStyledAttributes.getBoolean(AbstractC1769j.f9139z1, true);
            this.f2858g = typedArrayObtainStyledAttributes.getBoolean(AbstractC1769j.f9129x1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: g */
        public void m3027g(AttributeSet attributeSet) {
            C0888e0 c0888e0M3764u = C0888e0.m3764u(C0777g.this.f2841c, attributeSet, AbstractC1769j.f8893D1);
            this.f2860i = c0888e0M3764u.m3779n(AbstractC1769j.f8908G1, 0);
            this.f2861j = (c0888e0M3764u.m3776k(AbstractC1769j.f8923J1, this.f2854c) & (-65536)) | (c0888e0M3764u.m3776k(AbstractC1769j.f8928K1, this.f2855d) & 65535);
            this.f2862k = c0888e0M3764u.m3781p(AbstractC1769j.f8933L1);
            this.f2863l = c0888e0M3764u.m3781p(AbstractC1769j.f8938M1);
            this.f2864m = c0888e0M3764u.m3779n(AbstractC1769j.f8898E1, 0);
            this.f2865n = m3020c(c0888e0M3764u.m3780o(AbstractC1769j.f8943N1));
            this.f2866o = c0888e0M3764u.m3776k(AbstractC1769j.f8978U1, 4096);
            this.f2867p = m3020c(c0888e0M3764u.m3780o(AbstractC1769j.f8948O1));
            this.f2868q = c0888e0M3764u.m3776k(AbstractC1769j.f8998Y1, 4096);
            int i3 = AbstractC1769j.f8953P1;
            if (c0888e0M3764u.m3784s(i3)) {
                this.f2869r = c0888e0M3764u.m3766a(i3, false) ? 1 : 0;
            } else {
                this.f2869r = this.f2856e;
            }
            this.f2870s = c0888e0M3764u.m3766a(AbstractC1769j.f8913H1, false);
            this.f2871t = c0888e0M3764u.m3766a(AbstractC1769j.f8918I1, this.f2857f);
            this.f2872u = c0888e0M3764u.m3766a(AbstractC1769j.f8903F1, this.f2858g);
            this.f2873v = c0888e0M3764u.m3776k(AbstractC1769j.f9003Z1, -1);
            this.f2877z = c0888e0M3764u.m3780o(AbstractC1769j.f8958Q1);
            this.f2874w = c0888e0M3764u.m3779n(AbstractC1769j.f8963R1, 0);
            this.f2875x = c0888e0M3764u.m3780o(AbstractC1769j.f8973T1);
            String strM3780o = c0888e0M3764u.m3780o(AbstractC1769j.f8968S1);
            this.f2876y = strM3780o;
            boolean z2 = strM3780o != null;
            if (z2 && this.f2874w == 0 && this.f2875x == null) {
                this.f2846A = (AbstractC0275b) m3021e(strM3780o, C0777g.f2838f, C0777g.this.f2840b);
            } else {
                if (z2) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f2846A = null;
            }
            this.f2847B = c0888e0M3764u.m3781p(AbstractC1769j.f8983V1);
            this.f2848C = c0888e0M3764u.m3781p(AbstractC1769j.f9009a2);
            int i4 = AbstractC1769j.f8993X1;
            if (c0888e0M3764u.m3784s(i4)) {
                this.f2850E = AbstractC0836M.m3454e(c0888e0M3764u.m3776k(i4, -1), this.f2850E);
            } else {
                this.f2850E = null;
            }
            int i5 = AbstractC1769j.f8988W1;
            if (c0888e0M3764u.m3784s(i5)) {
                this.f2849D = c0888e0M3764u.m3768c(i5);
            } else {
                this.f2849D = null;
            }
            c0888e0M3764u.m3786x();
            this.f2859h = false;
        }

        /* JADX INFO: renamed from: h */
        public void m3028h() {
            this.f2853b = 0;
            this.f2854c = 0;
            this.f2855d = 0;
            this.f2856e = 0;
            this.f2857f = true;
            this.f2858g = true;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f2837e = clsArr;
        f2838f = clsArr;
    }

    public C0777g(Context context) {
        super(context);
        this.f2841c = context;
        Object[] objArr = {context};
        this.f2839a = objArr;
        this.f2840b = objArr;
    }

    /* JADX INFO: renamed from: a */
    private Object m3017a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m3017a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX INFO: renamed from: c */
    private void m3018c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (!z2) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z3 && name2.equals(str)) {
                        z3 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.m3028h();
                    } else if (name2.equals("item")) {
                        if (!bVar.m3025d()) {
                            AbstractC0275b abstractC0275b = bVar.f2846A;
                            if (abstractC0275b == null || !abstractC0275b.mo911a()) {
                                bVar.m3023a();
                            } else {
                                bVar.m3024b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z2 = true;
                    }
                }
            } else if (!z3) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.m3026f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.m3027g(attributeSet);
                } else if (name3.equals("menu")) {
                    m3018c(xmlPullParser, attributeSet, bVar.m3024b());
                } else {
                    str = name3;
                    z3 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* JADX INFO: renamed from: b */
    Object m3019b() {
        if (this.f2842d == null) {
            this.f2842d = m3017a(this.f2841c);
        }
        return this.f2842d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i3, Menu menu) {
        if (!(menu instanceof InterfaceMenuC0028a)) {
            super.inflate(i3, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z2 = false;
        try {
            try {
                layout = this.f2841c.getResources().getLayout(i3);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof C0786e) {
                    C0786e c0786e = (C0786e) menu;
                    if (c0786e.m3129H()) {
                        c0786e.m3160i0();
                        z2 = true;
                    }
                }
                m3018c(layout, attributeSetAsAttributeSet, menu);
                if (z2) {
                    ((C0786e) menu).m3159h0();
                }
                if (layout != null) {
                    layout.close();
                }
            } catch (IOException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            } catch (XmlPullParserException e4) {
                throw new InflateException("Error inflating menu XML", e4);
            }
        } catch (Throwable th) {
            if (z2) {
                ((C0786e) menu).m3159h0();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
