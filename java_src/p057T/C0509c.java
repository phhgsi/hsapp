package p057T;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p038M1.AbstractC0397C;
import p038M1.AbstractC0403I;
import p038M1.AbstractC0419m;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: T.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0509c {

    /* JADX INFO: renamed from: a */
    public static final C0509c f1756a = new C0509c();

    /* JADX INFO: renamed from: b */
    private static c f1757b = c.f1768d;

    /* JADX INFO: renamed from: T.c$a */
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* JADX INFO: renamed from: T.c$b */
    public interface b {
    }

    /* JADX INFO: renamed from: T.c$c */
    public static final class c {

        /* JADX INFO: renamed from: c */
        public static final a f1767c = new a(null);

        /* JADX INFO: renamed from: d */
        public static final c f1768d = new c(AbstractC0403I.m1405a(), null, AbstractC0397C.m1398d());

        /* JADX INFO: renamed from: a */
        private final Set f1769a;

        /* JADX INFO: renamed from: b */
        private final Map f1770b;

        /* JADX INFO: renamed from: T.c$c$a */
        public static final class a {
            public /* synthetic */ a(AbstractC0602g abstractC0602g) {
                this();
            }

            private a() {
            }
        }

        public c(Set set, b bVar, Map map) {
            AbstractC0606k.m2145e(set, "flags");
            AbstractC0606k.m2145e(map, "allowedViolations");
            this.f1769a = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f1770b = linkedHashMap;
        }

        /* JADX INFO: renamed from: a */
        public final Set m1868a() {
            return this.f1769a;
        }

        /* JADX INFO: renamed from: b */
        public final b m1869b() {
            return null;
        }

        /* JADX INFO: renamed from: c */
        public final Map m1870c() {
            return this.f1770b;
        }
    }

    private C0509c() {
    }

    /* JADX INFO: renamed from: b */
    private final c m1852b(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                AbstractC0606k.m2144d(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.m4783A0() != null) {
                    c cVarM4783A0 = parentFragmentManager.m4783A0();
                    AbstractC0606k.m2142b(cVarM4783A0);
                    return cVarM4783A0;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return f1757b;
    }

    /* JADX INFO: renamed from: c */
    private final void m1853c(c cVar, final AbstractC0519m abstractC0519m) {
        Fragment fragmentM1871a = abstractC0519m.m1871a();
        final String name = fragmentM1871a.getClass().getName();
        if (cVar.m1868a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, abstractC0519m);
        }
        cVar.m1869b();
        if (cVar.m1868a().contains(a.PENALTY_DEATH)) {
            m1865o(fragmentM1871a, new Runnable() { // from class: T.b
                @Override // java.lang.Runnable
                public final void run() {
                    C0509c.m1854d(name, abstractC0519m);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m1854d(String str, AbstractC0519m abstractC0519m) {
        AbstractC0606k.m2145e(abstractC0519m, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, abstractC0519m);
        throw abstractC0519m;
    }

    /* JADX INFO: renamed from: e */
    private final void m1855e(AbstractC0519m abstractC0519m) {
        if (FragmentManager.m4744H0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + abstractC0519m.m1871a().getClass().getName(), abstractC0519m);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m1856f(Fragment fragment, String str) {
        AbstractC0606k.m2145e(fragment, "fragment");
        AbstractC0606k.m2145e(str, "previousFragmentId");
        C0507a c0507a = new C0507a(fragment, str);
        C0509c c0509c = f1756a;
        c0509c.m1855e(c0507a);
        c cVarM1852b = c0509c.m1852b(fragment);
        if (cVarM1852b.m1868a().contains(a.DETECT_FRAGMENT_REUSE) && c0509c.m1866p(cVarM1852b, fragment.getClass(), c0507a.getClass())) {
            c0509c.m1853c(cVarM1852b, c0507a);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m1857g(Fragment fragment, ViewGroup viewGroup) {
        AbstractC0606k.m2145e(fragment, "fragment");
        C0510d c0510d = new C0510d(fragment, viewGroup);
        C0509c c0509c = f1756a;
        c0509c.m1855e(c0510d);
        c cVarM1852b = c0509c.m1852b(fragment);
        if (cVarM1852b.m1868a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && c0509c.m1866p(cVarM1852b, fragment.getClass(), c0510d.getClass())) {
            c0509c.m1853c(cVarM1852b, c0510d);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m1858h(Fragment fragment) {
        AbstractC0606k.m2145e(fragment, "fragment");
        C0511e c0511e = new C0511e(fragment);
        C0509c c0509c = f1756a;
        c0509c.m1855e(c0511e);
        c cVarM1852b = c0509c.m1852b(fragment);
        if (cVarM1852b.m1868a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && c0509c.m1866p(cVarM1852b, fragment.getClass(), c0511e.getClass())) {
            c0509c.m1853c(cVarM1852b, c0511e);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m1859i(Fragment fragment) {
        AbstractC0606k.m2145e(fragment, "fragment");
        C0512f c0512f = new C0512f(fragment);
        C0509c c0509c = f1756a;
        c0509c.m1855e(c0512f);
        c cVarM1852b = c0509c.m1852b(fragment);
        if (cVarM1852b.m1868a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && c0509c.m1866p(cVarM1852b, fragment.getClass(), c0512f.getClass())) {
            c0509c.m1853c(cVarM1852b, c0512f);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m1860j(Fragment fragment) {
        AbstractC0606k.m2145e(fragment, "fragment");
        C0513g c0513g = new C0513g(fragment);
        C0509c c0509c = f1756a;
        c0509c.m1855e(c0513g);
        c cVarM1852b = c0509c.m1852b(fragment);
        if (cVarM1852b.m1868a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && c0509c.m1866p(cVarM1852b, fragment.getClass(), c0513g.getClass())) {
            c0509c.m1853c(cVarM1852b, c0513g);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m1861k(Fragment fragment) {
        AbstractC0606k.m2145e(fragment, "fragment");
        C0515i c0515i = new C0515i(fragment);
        C0509c c0509c = f1756a;
        c0509c.m1855e(c0515i);
        c cVarM1852b = c0509c.m1852b(fragment);
        if (cVarM1852b.m1868a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && c0509c.m1866p(cVarM1852b, fragment.getClass(), c0515i.getClass())) {
            c0509c.m1853c(cVarM1852b, c0515i);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m1862l(Fragment fragment, Fragment fragment2, int i3) {
        AbstractC0606k.m2145e(fragment, "violatingFragment");
        AbstractC0606k.m2145e(fragment2, "targetFragment");
        C0516j c0516j = new C0516j(fragment, fragment2, i3);
        C0509c c0509c = f1756a;
        c0509c.m1855e(c0516j);
        c cVarM1852b = c0509c.m1852b(fragment);
        if (cVarM1852b.m1868a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && c0509c.m1866p(cVarM1852b, fragment.getClass(), c0516j.getClass())) {
            c0509c.m1853c(cVarM1852b, c0516j);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m1863m(Fragment fragment, boolean z2) {
        AbstractC0606k.m2145e(fragment, "fragment");
        C0517k c0517k = new C0517k(fragment, z2);
        C0509c c0509c = f1756a;
        c0509c.m1855e(c0517k);
        c cVarM1852b = c0509c.m1852b(fragment);
        if (cVarM1852b.m1868a().contains(a.DETECT_SET_USER_VISIBLE_HINT) && c0509c.m1866p(cVarM1852b, fragment.getClass(), c0517k.getClass())) {
            c0509c.m1853c(cVarM1852b, c0517k);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m1864n(Fragment fragment, ViewGroup viewGroup) {
        AbstractC0606k.m2145e(fragment, "fragment");
        AbstractC0606k.m2145e(viewGroup, "container");
        C0520n c0520n = new C0520n(fragment, viewGroup);
        C0509c c0509c = f1756a;
        c0509c.m1855e(c0520n);
        c cVarM1852b = c0509c.m1852b(fragment);
        if (cVarM1852b.m1868a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && c0509c.m1866p(cVarM1852b, fragment.getClass(), c0520n.getClass())) {
            c0509c.m1853c(cVarM1852b, c0520n);
        }
    }

    /* JADX INFO: renamed from: o */
    private final void m1865o(Fragment fragment, Runnable runnable) {
        if (!fragment.isAdded()) {
            runnable.run();
            return;
        }
        Handler handlerM4964o = fragment.getParentFragmentManager().m4854u0().m4964o();
        AbstractC0606k.m2144d(handlerM4964o, "fragment.parentFragmentManager.host.handler");
        if (AbstractC0606k.m2141a(handlerM4964o.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handlerM4964o.post(runnable);
        }
    }

    /* JADX INFO: renamed from: p */
    private final boolean m1866p(c cVar, Class cls, Class cls2) {
        Set set = (Set) cVar.m1870c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (AbstractC0606k.m2141a(cls2.getSuperclass(), AbstractC0519m.class) || !AbstractC0419m.m1464k(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
