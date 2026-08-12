package p027J;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.app.AbstractC0740E;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p027J.C0273a;
import p027J.C0292j0;
import p030K.C0356y;
import p030K.InterfaceC0331B;
import p158w.AbstractC2485c;

/* JADX INFO: renamed from: J.W */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0268W {

    /* JADX INFO: renamed from: a */
    private static WeakHashMap f1281a = null;

    /* JADX INFO: renamed from: b */
    private static Field f1282b = null;

    /* JADX INFO: renamed from: c */
    private static boolean f1283c = false;

    /* JADX INFO: renamed from: d */
    private static final int[] f1284d = {AbstractC2485c.f11531b, AbstractC2485c.f11532c, AbstractC2485c.f11543n, AbstractC2485c.f11554y, AbstractC2485c.f11511B, AbstractC2485c.f11512C, AbstractC2485c.f11513D, AbstractC2485c.f11514E, AbstractC2485c.f11515F, AbstractC2485c.f11516G, AbstractC2485c.f11533d, AbstractC2485c.f11534e, AbstractC2485c.f11535f, AbstractC2485c.f11536g, AbstractC2485c.f11537h, AbstractC2485c.f11538i, AbstractC2485c.f11539j, AbstractC2485c.f11540k, AbstractC2485c.f11541l, AbstractC2485c.f11542m, AbstractC2485c.f11544o, AbstractC2485c.f11545p, AbstractC2485c.f11546q, AbstractC2485c.f11547r, AbstractC2485c.f11548s, AbstractC2485c.f11549t, AbstractC2485c.f11550u, AbstractC2485c.f11551v, AbstractC2485c.f11552w, AbstractC2485c.f11553x, AbstractC2485c.f11555z, AbstractC2485c.f11510A};

    /* JADX INFO: renamed from: e */
    private static final InterfaceC0239H f1285e = new InterfaceC0239H() { // from class: J.V
        @Override // p027J.InterfaceC0239H
        /* JADX INFO: renamed from: a */
        public final C0279d mo666a(C0279d c0279d) {
            return AbstractC0268W.m758a(c0279d);
        }
    };

    /* JADX INFO: renamed from: f */
    private static final e f1286f = new e();

    /* JADX INFO: renamed from: J.W$a */
    class a extends f {
        a(int i3, Class cls, int i4) {
            super(i3, cls, i4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p027J.AbstractC0268W.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean mo810c(View view) {
            return Boolean.valueOf(k.m860c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p027J.AbstractC0268W.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo811d(View view, Boolean bool) {
            k.m863f(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p027J.AbstractC0268W.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo812g(Boolean bool, Boolean bool2) {
            return !m831a(bool, bool2);
        }
    }

    /* JADX INFO: renamed from: J.W$b */
    class b extends f {
        b(int i3, Class cls, int i4, int i5) {
            super(i3, cls, i4, i5);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p027J.AbstractC0268W.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence mo810c(View view) {
            return k.m858a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p027J.AbstractC0268W.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo811d(View view, CharSequence charSequence) {
            k.m862e(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p027J.AbstractC0268W.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo812g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: J.W$c */
    class c extends f {
        c(int i3, Class cls, int i4, int i5) {
            super(i3, cls, i4, i5);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p027J.AbstractC0268W.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence mo810c(View view) {
            return m.m867b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p027J.AbstractC0268W.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo811d(View view, CharSequence charSequence) {
            m.m869d(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p027J.AbstractC0268W.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo812g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: J.W$d */
    class d extends f {
        d(int i3, Class cls, int i4) {
            super(i3, cls, i4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p027J.AbstractC0268W.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean mo810c(View view) {
            return Boolean.valueOf(k.m859b(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p027J.AbstractC0268W.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo811d(View view, Boolean bool) {
            k.m861d(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p027J.AbstractC0268W.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo812g(Boolean bool, Boolean bool2) {
            return !m831a(bool, bool2);
        }
    }

    /* JADX INFO: renamed from: J.W$f */
    static abstract class f {

        /* JADX INFO: renamed from: a */
        private final int f1288a;

        /* JADX INFO: renamed from: b */
        private final Class f1289b;

        /* JADX INFO: renamed from: c */
        private final int f1290c;

        /* JADX INFO: renamed from: d */
        private final int f1291d;

        f(int i3, Class cls, int i4) {
            this(i3, cls, 0, i4);
        }

        /* JADX INFO: renamed from: b */
        private boolean m830b() {
            return Build.VERSION.SDK_INT >= this.f1290c;
        }

        /* JADX INFO: renamed from: a */
        boolean m831a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        /* JADX INFO: renamed from: c */
        abstract Object mo810c(View view);

        /* JADX INFO: renamed from: d */
        abstract void mo811d(View view, Object obj);

        /* JADX INFO: renamed from: e */
        Object m832e(View view) {
            if (m830b()) {
                return mo810c(view);
            }
            Object tag = view.getTag(this.f1288a);
            if (this.f1289b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        /* JADX INFO: renamed from: f */
        void m833f(View view, Object obj) {
            if (m830b()) {
                mo811d(view, obj);
            } else if (mo812g(m832e(view), obj)) {
                AbstractC0268W.m776j(view);
                view.setTag(this.f1288a, obj);
                AbstractC0268W.m749R(view, this.f1291d);
            }
        }

        /* JADX INFO: renamed from: g */
        abstract boolean mo812g(Object obj, Object obj2);

        f(int i3, Class cls, int i4, int i5) {
            this.f1288a = i3;
            this.f1289b = cls;
            this.f1291d = i4;
            this.f1290c = i5;
        }
    }

    /* JADX INFO: renamed from: J.W$g */
    static class g {
        /* JADX INFO: renamed from: a */
        static WindowInsets m834a(View view, WindowInsets windowInsets) {
            return AbstractC0276b0.f1312b ? AbstractC0276b0.m921b(view, windowInsets) : view.dispatchApplyWindowInsets(windowInsets);
        }

        /* JADX INFO: renamed from: b */
        static WindowInsets m835b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        /* JADX INFO: renamed from: c */
        static void m836c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: renamed from: J.W$h */
    private static class h {

        /* JADX INFO: renamed from: J.W$h$a */
        class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a */
            C0318w0 f1292a = null;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ View f1293b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ InterfaceC0235F f1294c;

            a(View view, InterfaceC0235F interfaceC0235F) {
                this.f1293b = view;
                this.f1294c = interfaceC0235F;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C0318w0 c0318w0M1076z = C0318w0.m1076z(windowInsets, view);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 < 30) {
                    h.m837a(windowInsets, this.f1293b);
                    if (c0318w0M1076z.equals(this.f1292a)) {
                        return this.f1294c.mo662a(view, c0318w0M1076z).m1099x();
                    }
                }
                this.f1292a = c0318w0M1076z;
                C0318w0 c0318w0Mo662a = this.f1294c.mo662a(view, c0318w0M1076z);
                if (i3 >= 30) {
                    return c0318w0Mo662a.m1099x();
                }
                AbstractC0268W.m769f0(view);
                return c0318w0Mo662a.m1099x();
            }
        }

        /* JADX INFO: renamed from: a */
        static void m837a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(AbstractC2485c.f11529T);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* JADX INFO: renamed from: b */
        static C0318w0 m838b(View view, C0318w0 c0318w0, Rect rect) {
            WindowInsets windowInsetsM1099x = c0318w0.m1099x();
            if (windowInsetsM1099x != null) {
                return C0318w0.m1076z(view.computeSystemWindowInsets(windowInsetsM1099x, rect), view);
            }
            rect.setEmpty();
            return c0318w0;
        }

        /* JADX INFO: renamed from: c */
        static ColorStateList m839c(View view) {
            return view.getBackgroundTintList();
        }

        /* JADX INFO: renamed from: d */
        static PorterDuff.Mode m840d(View view) {
            return view.getBackgroundTintMode();
        }

        /* JADX INFO: renamed from: e */
        static float m841e(View view) {
            return view.getElevation();
        }

        /* JADX INFO: renamed from: f */
        static String m842f(View view) {
            return view.getTransitionName();
        }

        /* JADX INFO: renamed from: g */
        static float m843g(View view) {
            return view.getTranslationZ();
        }

        /* JADX INFO: renamed from: h */
        static float m844h(View view) {
            return view.getZ();
        }

        /* JADX INFO: renamed from: i */
        static boolean m845i(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* JADX INFO: renamed from: j */
        static void m846j(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        /* JADX INFO: renamed from: k */
        static void m847k(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        /* JADX INFO: renamed from: l */
        static void m848l(View view, float f3) {
            view.setElevation(f3);
        }

        /* JADX INFO: renamed from: m */
        static void m849m(View view, InterfaceC0235F interfaceC0235F) {
            a aVar = interfaceC0235F != null ? new a(view, interfaceC0235F) : null;
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(AbstractC2485c.f11522M, aVar);
            }
            if (view.getTag(AbstractC2485c.f11521L) != null) {
                return;
            }
            if (aVar != null) {
                view.setOnApplyWindowInsetsListener(aVar);
            } else {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(AbstractC2485c.f11529T));
            }
        }

        /* JADX INFO: renamed from: n */
        static void m850n(View view, String str) {
            view.setTransitionName(str);
        }

        /* JADX INFO: renamed from: o */
        static void m851o(View view, float f3) {
            view.setTranslationZ(f3);
        }

        /* JADX INFO: renamed from: p */
        static void m852p(View view, float f3) {
            view.setZ(f3);
        }

        /* JADX INFO: renamed from: q */
        static void m853q(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: renamed from: J.W$i */
    private static class i {
        /* JADX INFO: renamed from: a */
        public static C0318w0 m854a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C0318w0 c0318w0M1075y = C0318w0.m1075y(rootWindowInsets);
            c0318w0M1075y.m1096u(c0318w0M1075y);
            c0318w0M1075y.m1080d(view.getRootView());
            return c0318w0M1075y;
        }

        /* JADX INFO: renamed from: b */
        static void m855b(View view, int i3, int i4) {
            view.setScrollIndicators(i3, i4);
        }
    }

    /* JADX INFO: renamed from: J.W$j */
    static class j {
        /* JADX INFO: renamed from: a */
        static int m856a(View view) {
            return view.getImportantForAutofill();
        }

        /* JADX INFO: renamed from: b */
        static void m857b(View view, int i3) {
            view.setImportantForAutofill(i3);
        }
    }

    /* JADX INFO: renamed from: J.W$k */
    static class k {
        /* JADX INFO: renamed from: a */
        static CharSequence m858a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* JADX INFO: renamed from: b */
        static boolean m859b(View view) {
            return view.isAccessibilityHeading();
        }

        /* JADX INFO: renamed from: c */
        static boolean m860c(View view) {
            return view.isScreenReaderFocusable();
        }

        /* JADX INFO: renamed from: d */
        static void m861d(View view, boolean z2) {
            view.setAccessibilityHeading(z2);
        }

        /* JADX INFO: renamed from: e */
        static void m862e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* JADX INFO: renamed from: f */
        static void m863f(View view, boolean z2) {
            view.setScreenReaderFocusable(z2);
        }
    }

    /* JADX INFO: renamed from: J.W$l */
    private static class l {
        /* JADX INFO: renamed from: a */
        static View.AccessibilityDelegate m864a(View view) {
            return view.getAccessibilityDelegate();
        }

        /* JADX INFO: renamed from: b */
        static void m865b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i3, int i4) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i3, i4);
        }
    }

    /* JADX INFO: renamed from: J.W$m */
    private static class m {
        /* JADX INFO: renamed from: a */
        static WindowInsets m866a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        /* JADX INFO: renamed from: b */
        static CharSequence m867b(View view) {
            return view.getStateDescription();
        }

        /* JADX INFO: renamed from: c */
        public static C0265U0 m868c(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return C0265U0.m710f(windowInsetsController);
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        static void m869d(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: J.W$n */
    private static final class n {
        /* JADX INFO: renamed from: a */
        public static String[] m870a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        /* JADX INFO: renamed from: b */
        public static C0279d m871b(View view, C0279d c0279d) {
            ContentInfo contentInfoM945f = c0279d.m945f();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoM945f);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoM945f ? c0279d : C0279d.m941g(contentInfoPerformReceiveContent);
        }
    }

    /* JADX INFO: renamed from: J.W$o */
    static class o {

        /* JADX INFO: renamed from: d */
        private static final ArrayList f1295d = new ArrayList();

        /* JADX INFO: renamed from: a */
        private WeakHashMap f1296a = null;

        /* JADX INFO: renamed from: b */
        private SparseArray f1297b = null;

        /* JADX INFO: renamed from: c */
        private WeakReference f1298c = null;

        o() {
        }

        /* JADX INFO: renamed from: a */
        static o m872a(View view) {
            int i3 = AbstractC2485c.f11527R;
            o oVar = (o) view.getTag(i3);
            if (oVar != null) {
                return oVar;
            }
            o oVar2 = new o();
            view.setTag(i3, oVar2);
            return oVar2;
        }

        /* JADX INFO: renamed from: c */
        private View m873c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f1296a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewM873c = m873c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewM873c != null) {
                            return viewM873c;
                        }
                    }
                }
                if (m875e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        private SparseArray m874d() {
            if (this.f1297b == null) {
                this.f1297b = new SparseArray();
            }
            return this.f1297b;
        }

        /* JADX INFO: renamed from: e */
        private boolean m875e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(AbstractC2485c.f11528S);
            if (arrayList == null || arrayList.size() - 1 < 0) {
                return false;
            }
            AbstractC0740E.m2693a(arrayList.get(size));
            throw null;
        }

        /* JADX INFO: renamed from: g */
        private void m876g() {
            WeakHashMap weakHashMap = this.f1296a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f1295d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f1296a == null) {
                        this.f1296a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f1295d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f1296a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f1296a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        boolean m877b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m876g();
            }
            View viewM873c = m873c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewM873c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m874d().put(keyCode, new WeakReference(viewM873c));
                }
            }
            return viewM873c != null;
        }

        /* JADX INFO: renamed from: f */
        boolean m878f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int iIndexOfKey;
            WeakReference weakReference2 = this.f1298c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f1298c = new WeakReference(keyEvent);
            SparseArray sparseArrayM874d = m874d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayM874d.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) sparseArrayM874d.valueAt(iIndexOfKey);
                sparseArrayM874d.removeAt(iIndexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) sparseArrayM874d.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                m875e(view, keyEvent);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: A */
    public static int m730A(View view) {
        return view.getMinimumWidth();
    }

    /* JADX INFO: renamed from: A0 */
    private static f m731A0() {
        return new c(AbstractC2485c.f11526Q, CharSequence.class, 64, 30);
    }

    /* JADX INFO: renamed from: B */
    public static String[] m732B(View view) {
        return Build.VERSION.SDK_INT >= 31 ? n.m870a(view) : (String[]) view.getTag(AbstractC2485c.f11524O);
    }

    /* JADX INFO: renamed from: B0 */
    public static void m733B0(View view) {
        h.m853q(view);
    }

    /* JADX INFO: renamed from: C */
    public static ViewParent m734C(View view) {
        return view.getParentForAccessibility();
    }

    /* JADX INFO: renamed from: D */
    public static C0318w0 m735D(View view) {
        return i.m854a(view);
    }

    /* JADX INFO: renamed from: E */
    public static CharSequence m736E(View view) {
        return (CharSequence) m731A0().m832e(view);
    }

    /* JADX INFO: renamed from: F */
    public static String m737F(View view) {
        return h.m842f(view);
    }

    /* JADX INFO: renamed from: G */
    public static float m738G(View view) {
        return h.m843g(view);
    }

    /* JADX INFO: renamed from: H */
    public static C0265U0 m739H(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return m.m868c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return AbstractC0290i0.m978a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    public static int m740I(View view) {
        return view.getWindowSystemUiVisibility();
    }

    /* JADX INFO: renamed from: J */
    public static float m741J(View view) {
        return h.m844h(view);
    }

    /* JADX INFO: renamed from: K */
    public static boolean m742K(View view) {
        return m780l(view) != null;
    }

    /* JADX INFO: renamed from: L */
    public static boolean m743L(View view) {
        return view.hasTransientState();
    }

    /* JADX INFO: renamed from: M */
    public static boolean m744M(View view) {
        Boolean bool = (Boolean) m760b().m832e(view);
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: renamed from: N */
    public static boolean m745N(View view) {
        return view.isAttachedToWindow();
    }

    /* JADX INFO: renamed from: O */
    public static boolean m746O(View view) {
        return view.isLaidOut();
    }

    /* JADX INFO: renamed from: P */
    public static boolean m747P(View view) {
        return h.m845i(view);
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m748Q(View view) {
        Boolean bool = (Boolean) m773h0().m832e(view);
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: renamed from: R */
    static void m749R(View view, int i3) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z2 = m784n(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z2) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z2 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i3);
                if (z2) {
                    accessibilityEventObtain.getText().add(m784n(view));
                    m791q0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i3 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i3);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(m784n(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i3);
                } catch (AbstractMethodError e3) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public static void m750S(View view, int i3) {
        view.offsetLeftAndRight(i3);
    }

    /* JADX INFO: renamed from: T */
    public static void m751T(View view, int i3) {
        view.offsetTopAndBottom(i3);
    }

    /* JADX INFO: renamed from: U */
    public static C0318w0 m752U(View view, C0318w0 c0318w0) {
        WindowInsets windowInsetsM1099x = c0318w0.m1099x();
        if (windowInsetsM1099x != null) {
            WindowInsets windowInsetsM835b = g.m835b(view, windowInsetsM1099x);
            if (!windowInsetsM835b.equals(windowInsetsM1099x)) {
                return C0318w0.m1076z(windowInsetsM835b, view);
            }
        }
        return c0318w0;
    }

    /* JADX INFO: renamed from: V */
    public static void m753V(View view, C0356y c0356y) {
        view.onInitializeAccessibilityNodeInfo(c0356y.m1255U0());
    }

    /* JADX INFO: renamed from: W */
    private static f m754W() {
        return new b(AbstractC2485c.f11520K, CharSequence.class, 8, 28);
    }

    /* JADX INFO: renamed from: X */
    public static boolean m755X(View view, int i3, Bundle bundle) {
        return view.performAccessibilityAction(i3, bundle);
    }

    /* JADX INFO: renamed from: Y */
    public static C0279d m756Y(View view, C0279d c0279d) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0279d + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return n.m871b(view, c0279d);
        }
        InterfaceC0237G interfaceC0237G = (InterfaceC0237G) view.getTag(AbstractC2485c.f11523N);
        if (interfaceC0237G == null) {
            return m798u(view).mo666a(c0279d);
        }
        C0279d c0279dMo664a = interfaceC0237G.mo664a(view, c0279d);
        if (c0279dMo664a == null) {
            return null;
        }
        return m798u(view).mo666a(c0279dMo664a);
    }

    /* JADX INFO: renamed from: Z */
    public static void m757Z(View view) {
        view.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C0279d m758a(C0279d c0279d) {
        return c0279d;
    }

    /* JADX INFO: renamed from: a0 */
    public static void m759a0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* JADX INFO: renamed from: b */
    private static f m760b() {
        return new d(AbstractC2485c.f11519J, Boolean.class, 28);
    }

    /* JADX INFO: renamed from: b0 */
    public static void m761b0(View view, Runnable runnable, long j3) {
        view.postOnAnimationDelayed(runnable, j3);
    }

    /* JADX INFO: renamed from: c */
    public static int m762c(View view, CharSequence charSequence, InterfaceC0331B interfaceC0331B) {
        int iM788p = m788p(view, charSequence);
        if (iM788p != -1) {
            m764d(view, new C0356y.a(iM788p, charSequence, interfaceC0331B));
        }
        return iM788p;
    }

    /* JADX INFO: renamed from: c0 */
    public static void m763c0(View view, int i3) {
        m765d0(i3, view);
        m749R(view, 0);
    }

    /* JADX INFO: renamed from: d */
    private static void m764d(View view, C0356y.a aVar) {
        m776j(view);
        m765d0(aVar.m1301b(), view);
        m786o(view).add(aVar);
        m749R(view, 0);
    }

    /* JADX INFO: renamed from: d0 */
    private static void m765d0(int i3, View view) {
        List listM786o = m786o(view);
        for (int i4 = 0; i4 < listM786o.size(); i4++) {
            if (((C0356y.a) listM786o.get(i4)).m1301b() == i3) {
                listM786o.remove(i4);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static C0282e0 m766e(View view) {
        if (f1281a == null) {
            f1281a = new WeakHashMap();
        }
        C0282e0 c0282e0 = (C0282e0) f1281a.get(view);
        if (c0282e0 != null) {
            return c0282e0;
        }
        C0282e0 c0282e02 = new C0282e0(view);
        f1281a.put(view, c0282e02);
        return c0282e02;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m767e0(View view, C0356y.a aVar, CharSequence charSequence, InterfaceC0331B interfaceC0331B) {
        if (interfaceC0331B == null && charSequence == null) {
            m763c0(view, aVar.m1301b());
        } else {
            m764d(view, aVar.m1300a(charSequence, interfaceC0331B));
        }
    }

    /* JADX INFO: renamed from: f */
    public static C0318w0 m768f(View view, C0318w0 c0318w0, Rect rect) {
        return h.m838b(view, c0318w0, rect);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m769f0(View view) {
        g.m836c(view);
    }

    /* JADX INFO: renamed from: g */
    public static C0318w0 m770g(View view, C0318w0 c0318w0) {
        int i3 = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsM1099x = c0318w0.m1099x();
        if (windowInsetsM1099x != null) {
            WindowInsets windowInsetsM866a = i3 >= 30 ? m.m866a(view, windowInsetsM1099x) : g.m834a(view, windowInsetsM1099x);
            if (!windowInsetsM866a.equals(windowInsetsM1099x)) {
                return C0318w0.m1076z(windowInsetsM866a, view);
            }
        }
        return c0318w0;
    }

    /* JADX INFO: renamed from: g0 */
    public static void m771g0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            l.m865b(view, context, iArr, attributeSet, typedArray, i3, i4);
        }
    }

    /* JADX INFO: renamed from: h */
    static boolean m772h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return o.m872a(view).m877b(view, keyEvent);
    }

    /* JADX INFO: renamed from: h0 */
    private static f m773h0() {
        return new a(AbstractC2485c.f11525P, Boolean.class, 28);
    }

    /* JADX INFO: renamed from: i */
    static boolean m774i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return o.m872a(view).m878f(keyEvent);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m775i0(View view, C0273a c0273a) {
        if (c0273a == null && (m780l(view) instanceof C0273a.a)) {
            c0273a = new C0273a();
        }
        m791q0(view);
        view.setAccessibilityDelegate(c0273a == null ? null : c0273a.m903d());
    }

    /* JADX INFO: renamed from: j */
    static void m776j(View view) {
        C0273a c0273aM778k = m778k(view);
        if (c0273aM778k == null) {
            c0273aM778k = new C0273a();
        }
        m775i0(view, c0273aM778k);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m777j0(View view, boolean z2) {
        m760b().m833f(view, Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: k */
    public static C0273a m778k(View view) {
        View.AccessibilityDelegate accessibilityDelegateM780l = m780l(view);
        if (accessibilityDelegateM780l == null) {
            return null;
        }
        return accessibilityDelegateM780l instanceof C0273a.a ? ((C0273a.a) accessibilityDelegateM780l).f1305a : new C0273a(accessibilityDelegateM780l);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m779k0(View view, CharSequence charSequence) {
        m754W().m833f(view, charSequence);
        if (charSequence != null) {
            f1286f.m828a(view);
        } else {
            f1286f.m829d(view);
        }
    }

    /* JADX INFO: renamed from: l */
    private static View.AccessibilityDelegate m780l(View view) {
        return Build.VERSION.SDK_INT >= 29 ? l.m864a(view) : m782m(view);
    }

    /* JADX INFO: renamed from: l0 */
    public static void m781l0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* JADX INFO: renamed from: m */
    private static View.AccessibilityDelegate m782m(View view) {
        if (f1283c) {
            return null;
        }
        if (f1282b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f1282b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f1283c = true;
                return null;
            }
        }
        try {
            Object obj = f1282b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f1283c = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static void m783m0(View view, ColorStateList colorStateList) {
        h.m846j(view, colorStateList);
    }

    /* JADX INFO: renamed from: n */
    public static CharSequence m784n(View view) {
        return (CharSequence) m754W().m832e(view);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m785n0(View view, PorterDuff.Mode mode) {
        h.m847k(view, mode);
    }

    /* JADX INFO: renamed from: o */
    private static List m786o(View view) {
        int i3 = AbstractC2485c.f11517H;
        ArrayList arrayList = (ArrayList) view.getTag(i3);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i3, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: o0 */
    public static void m787o0(View view, float f3) {
        h.m848l(view, f3);
    }

    /* JADX INFO: renamed from: p */
    private static int m788p(View view, CharSequence charSequence) {
        List listM786o = m786o(view);
        for (int i3 = 0; i3 < listM786o.size(); i3++) {
            if (TextUtils.equals(charSequence, ((C0356y.a) listM786o.get(i3)).m1302c())) {
                return ((C0356y.a) listM786o.get(i3)).m1301b();
            }
        }
        int i4 = -1;
        int i5 = 0;
        while (true) {
            int[] iArr = f1284d;
            if (i5 >= iArr.length || i4 != -1) {
                break;
            }
            int i6 = iArr[i5];
            boolean z2 = true;
            for (int i7 = 0; i7 < listM786o.size(); i7++) {
                z2 &= ((C0356y.a) listM786o.get(i7)).m1301b() != i6;
            }
            if (z2) {
                i4 = i6;
            }
            i5++;
        }
        return i4;
    }

    /* JADX INFO: renamed from: p0 */
    public static void m789p0(View view, int i3) {
        view.setImportantForAccessibility(i3);
    }

    /* JADX INFO: renamed from: q */
    public static ColorStateList m790q(View view) {
        return h.m839c(view);
    }

    /* JADX INFO: renamed from: q0 */
    private static void m791q0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: r */
    public static PorterDuff.Mode m792r(View view) {
        return h.m840d(view);
    }

    /* JADX INFO: renamed from: r0 */
    public static void m793r0(View view, int i3) {
        if (Build.VERSION.SDK_INT >= 26) {
            j.m857b(view, i3);
        }
    }

    /* JADX INFO: renamed from: s */
    public static Display m794s(View view) {
        return view.getDisplay();
    }

    /* JADX INFO: renamed from: s0 */
    public static void m795s0(View view, InterfaceC0235F interfaceC0235F) {
        h.m849m(view, interfaceC0235F);
    }

    /* JADX INFO: renamed from: t */
    public static float m796t(View view) {
        return h.m841e(view);
    }

    /* JADX INFO: renamed from: t0 */
    public static void m797t0(View view, boolean z2) {
        m773h0().m833f(view, Boolean.valueOf(z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    private static InterfaceC0239H m798u(View view) {
        return view instanceof InterfaceC0239H ? (InterfaceC0239H) view : f1285e;
    }

    /* JADX INFO: renamed from: u0 */
    public static void m799u0(View view, int i3, int i4) {
        i.m855b(view, i3, i4);
    }

    /* JADX INFO: renamed from: v */
    public static boolean m800v(View view) {
        return view.getFitsSystemWindows();
    }

    /* JADX INFO: renamed from: v0 */
    public static void m801v0(View view, CharSequence charSequence) {
        m731A0().m833f(view, charSequence);
    }

    /* JADX INFO: renamed from: w */
    public static int m802w(View view) {
        return view.getImportantForAccessibility();
    }

    /* JADX INFO: renamed from: w0 */
    public static void m803w0(View view, String str) {
        h.m850n(view, str);
    }

    /* JADX INFO: renamed from: x */
    public static int m804x(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return j.m856a(view);
        }
        return 0;
    }

    /* JADX INFO: renamed from: x0 */
    public static void m805x0(View view, float f3) {
        h.m851o(view, f3);
    }

    /* JADX INFO: renamed from: y */
    public static int m806y(View view) {
        return view.getLayoutDirection();
    }

    /* JADX INFO: renamed from: y0 */
    public static void m807y0(View view, C0292j0.b bVar) {
        C0292j0.m984d(view, bVar);
    }

    /* JADX INFO: renamed from: z */
    public static int m808z(View view) {
        return view.getMinimumHeight();
    }

    /* JADX INFO: renamed from: z0 */
    public static void m809z0(View view, float f3) {
        h.m852p(view, f3);
    }

    /* JADX INFO: renamed from: J.W$e */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        private final WeakHashMap f1287a = new WeakHashMap();

        e() {
        }

        /* JADX INFO: renamed from: b */
        private void m825b(Map.Entry entry) {
            View view = (View) entry.getKey();
            boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z2 = view.isShown() && view.getWindowVisibility() == 0;
            if (zBooleanValue != z2) {
                AbstractC0268W.m749R(view, z2 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z2));
            }
        }

        /* JADX INFO: renamed from: c */
        private void m826c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        /* JADX INFO: renamed from: e */
        private void m827e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        /* JADX INFO: renamed from: a */
        void m828a(View view) {
            this.f1287a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                m826c(view);
            }
        }

        /* JADX INFO: renamed from: d */
        void m829d(View view) {
            this.f1287a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            m827e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator it = this.f1287a.entrySet().iterator();
                while (it.hasNext()) {
                    m825b((Map.Entry) it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            m826c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
