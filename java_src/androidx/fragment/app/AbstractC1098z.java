package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1126h;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p057T.C0509c;

/* JADX INFO: renamed from: androidx.fragment.app.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1098z {

    /* JADX INFO: renamed from: a */
    private final AbstractC1084l f5221a;

    /* JADX INFO: renamed from: b */
    private final ClassLoader f5222b;

    /* JADX INFO: renamed from: d */
    int f5224d;

    /* JADX INFO: renamed from: e */
    int f5225e;

    /* JADX INFO: renamed from: f */
    int f5226f;

    /* JADX INFO: renamed from: g */
    int f5227g;

    /* JADX INFO: renamed from: h */
    int f5228h;

    /* JADX INFO: renamed from: i */
    boolean f5229i;

    /* JADX INFO: renamed from: k */
    String f5231k;

    /* JADX INFO: renamed from: l */
    int f5232l;

    /* JADX INFO: renamed from: m */
    CharSequence f5233m;

    /* JADX INFO: renamed from: n */
    int f5234n;

    /* JADX INFO: renamed from: o */
    CharSequence f5235o;

    /* JADX INFO: renamed from: p */
    ArrayList f5236p;

    /* JADX INFO: renamed from: q */
    ArrayList f5237q;

    /* JADX INFO: renamed from: s */
    ArrayList f5239s;

    /* JADX INFO: renamed from: c */
    ArrayList f5223c = new ArrayList();

    /* JADX INFO: renamed from: j */
    boolean f5230j = true;

    /* JADX INFO: renamed from: r */
    boolean f5238r = false;

    /* JADX INFO: renamed from: androidx.fragment.app.z$a */
    static final class a {

        /* JADX INFO: renamed from: a */
        int f5240a;

        /* JADX INFO: renamed from: b */
        Fragment f5241b;

        /* JADX INFO: renamed from: c */
        boolean f5242c;

        /* JADX INFO: renamed from: d */
        int f5243d;

        /* JADX INFO: renamed from: e */
        int f5244e;

        /* JADX INFO: renamed from: f */
        int f5245f;

        /* JADX INFO: renamed from: g */
        int f5246g;

        /* JADX INFO: renamed from: h */
        AbstractC1126h.b f5247h;

        /* JADX INFO: renamed from: i */
        AbstractC1126h.b f5248i;

        a() {
        }

        a(int i3, Fragment fragment) {
            this.f5240a = i3;
            this.f5241b = fragment;
            this.f5242c = false;
            AbstractC1126h.b bVar = AbstractC1126h.b.RESUMED;
            this.f5247h = bVar;
            this.f5248i = bVar;
        }

        a(int i3, Fragment fragment, boolean z2) {
            this.f5240a = i3;
            this.f5241b = fragment;
            this.f5242c = z2;
            AbstractC1126h.b bVar = AbstractC1126h.b.RESUMED;
            this.f5247h = bVar;
            this.f5248i = bVar;
        }
    }

    AbstractC1098z(AbstractC1084l abstractC1084l, ClassLoader classLoader) {
        this.f5221a = abstractC1084l;
        this.f5222b = classLoader;
    }

    /* JADX INFO: renamed from: b */
    public AbstractC1098z m5046b(int i3, Fragment fragment, String str) {
        mo4887k(i3, fragment, str, 1);
        return this;
    }

    /* JADX INFO: renamed from: c */
    AbstractC1098z m5047c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return m5046b(viewGroup.getId(), fragment, str);
    }

    /* JADX INFO: renamed from: d */
    public AbstractC1098z m5048d(Fragment fragment, String str) {
        mo4887k(0, fragment, str, 1);
        return this;
    }

    /* JADX INFO: renamed from: e */
    void m5049e(a aVar) {
        this.f5223c.add(aVar);
        aVar.f5243d = this.f5224d;
        aVar.f5244e = this.f5225e;
        aVar.f5245f = this.f5226f;
        aVar.f5246g = this.f5227g;
    }

    /* JADX INFO: renamed from: f */
    public abstract int mo4883f();

    /* JADX INFO: renamed from: g */
    public abstract int mo4884g();

    /* JADX INFO: renamed from: h */
    public abstract void mo4885h();

    /* JADX INFO: renamed from: i */
    public abstract void mo4886i();

    /* JADX INFO: renamed from: j */
    public AbstractC1098z m5050j() {
        if (this.f5229i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f5230j = false;
        return this;
    }

    /* JADX INFO: renamed from: k */
    void mo4887k(int i3, Fragment fragment, String str, int i4) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            C0509c.m1856f(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i3 != 0) {
            if (i3 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i5 = fragment.mFragmentId;
            if (i5 != 0 && i5 != i3) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i3);
            }
            fragment.mFragmentId = i3;
            fragment.mContainerId = i3;
        }
        m5049e(new a(i4, fragment));
    }

    /* JADX INFO: renamed from: l */
    public AbstractC1098z mo4888l(Fragment fragment) {
        m5049e(new a(3, fragment));
        return this;
    }

    /* JADX INFO: renamed from: m */
    public AbstractC1098z m5051m(int i3, Fragment fragment) {
        return m5052n(i3, fragment, null);
    }

    /* JADX INFO: renamed from: n */
    public AbstractC1098z m5052n(int i3, Fragment fragment, String str) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        mo4887k(i3, fragment, str, 2);
        return this;
    }

    /* JADX INFO: renamed from: o */
    public AbstractC1098z m5053o(boolean z2) {
        this.f5238r = z2;
        return this;
    }
}
