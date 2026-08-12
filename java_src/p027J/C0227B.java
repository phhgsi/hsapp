package p027J;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: J.B */
/* JADX INFO: loaded from: classes.dex */
public class C0227B {

    /* JADX INFO: renamed from: a */
    private ViewParent f1249a;

    /* JADX INFO: renamed from: b */
    private ViewParent f1250b;

    /* JADX INFO: renamed from: c */
    private final View f1251c;

    /* JADX INFO: renamed from: d */
    private boolean f1252d;

    /* JADX INFO: renamed from: e */
    private int[] f1253e;

    public C0227B(View view) {
        this.f1251c = view;
    }

    /* JADX INFO: renamed from: g */
    private boolean m629g(int i3, int i4, int i5, int i6, int[] iArr, int i7, int[] iArr2) {
        ViewParent viewParentM630h;
        int i8;
        int i9;
        int[] iArr3;
        if (!m641l() || (viewParentM630h = m630h(i7)) == null) {
            return false;
        }
        if (i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f1251c.getLocationInWindow(iArr);
            i8 = iArr[0];
            i9 = iArr[1];
        } else {
            i8 = 0;
            i9 = 0;
        }
        if (iArr2 == null) {
            int[] iArrM631i = m631i();
            iArrM631i[0] = 0;
            iArrM631i[1] = 0;
            iArr3 = iArrM631i;
        } else {
            iArr3 = iArr2;
        }
        AbstractC0278c0.m928d(viewParentM630h, this.f1251c, i3, i4, i5, i6, i7, iArr3);
        if (iArr != null) {
            this.f1251c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i8;
            iArr[1] = iArr[1] - i9;
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    private ViewParent m630h(int i3) {
        if (i3 == 0) {
            return this.f1249a;
        }
        if (i3 != 1) {
            return null;
        }
        return this.f1250b;
    }

    /* JADX INFO: renamed from: i */
    private int[] m631i() {
        if (this.f1253e == null) {
            this.f1253e = new int[2];
        }
        return this.f1253e;
    }

    /* JADX INFO: renamed from: n */
    private void m632n(int i3, ViewParent viewParent) {
        if (i3 == 0) {
            this.f1249a = viewParent;
        } else {
            if (i3 != 1) {
                return;
            }
            this.f1250b = viewParent;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m633a(float f3, float f4, boolean z2) {
        ViewParent viewParentM630h;
        if (!m641l() || (viewParentM630h = m630h(0)) == null) {
            return false;
        }
        return AbstractC0278c0.m925a(viewParentM630h, this.f1251c, f3, f4, z2);
    }

    /* JADX INFO: renamed from: b */
    public boolean m634b(float f3, float f4) {
        ViewParent viewParentM630h;
        if (!m641l() || (viewParentM630h = m630h(0)) == null) {
            return false;
        }
        return AbstractC0278c0.m926b(viewParentM630h, this.f1251c, f3, f4);
    }

    /* JADX INFO: renamed from: c */
    public boolean m635c(int i3, int i4, int[] iArr, int[] iArr2) {
        return m636d(i3, i4, iArr, iArr2, 0);
    }

    /* JADX INFO: renamed from: d */
    public boolean m636d(int i3, int i4, int[] iArr, int[] iArr2, int i5) {
        ViewParent viewParentM630h;
        int i6;
        int i7;
        if (!m641l() || (viewParentM630h = m630h(i5)) == null) {
            return false;
        }
        if (i3 == 0 && i4 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f1251c.getLocationInWindow(iArr2);
            i6 = iArr2[0];
            i7 = iArr2[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr == null) {
            iArr = m631i();
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        AbstractC0278c0.m927c(viewParentM630h, this.f1251c, i3, i4, iArr3, i5);
        if (iArr2 != null) {
            this.f1251c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i6;
            iArr2[1] = iArr2[1] - i7;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public void m637e(int i3, int i4, int i5, int i6, int[] iArr, int i7, int[] iArr2) {
        m629g(i3, i4, i5, i6, iArr, i7, iArr2);
    }

    /* JADX INFO: renamed from: f */
    public boolean m638f(int i3, int i4, int i5, int i6, int[] iArr) {
        return m629g(i3, i4, i5, i6, iArr, 0, null);
    }

    /* JADX INFO: renamed from: j */
    public boolean m639j() {
        return m640k(0);
    }

    /* JADX INFO: renamed from: k */
    public boolean m640k(int i3) {
        return m630h(i3) != null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m641l() {
        return this.f1252d;
    }

    /* JADX INFO: renamed from: m */
    public void m642m(boolean z2) {
        if (this.f1252d) {
            AbstractC0268W.m733B0(this.f1251c);
        }
        this.f1252d = z2;
    }

    /* JADX INFO: renamed from: o */
    public boolean m643o(int i3) {
        return m644p(i3, 0);
    }

    /* JADX INFO: renamed from: p */
    public boolean m644p(int i3, int i4) {
        if (m640k(i4)) {
            return true;
        }
        if (!m641l()) {
            return false;
        }
        View view = this.f1251c;
        for (ViewParent parent = this.f1251c.getParent(); parent != null; parent = parent.getParent()) {
            if (AbstractC0278c0.m930f(parent, view, this.f1251c, i3, i4)) {
                m632n(i4, parent);
                AbstractC0278c0.m929e(parent, view, this.f1251c, i3, i4);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public void m645q() {
        m646r(0);
    }

    /* JADX INFO: renamed from: r */
    public void m646r(int i3) {
        ViewParent viewParentM630h = m630h(i3);
        if (viewParentM630h != null) {
            AbstractC0278c0.m931g(viewParentM630h, this.f1251c, i3);
            m632n(i3, null);
        }
    }
}
