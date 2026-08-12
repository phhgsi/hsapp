package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC1266k;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.transition.v */
/* JADX INFO: loaded from: classes.dex */
public class C1277v extends AbstractC1266k {

    /* JADX INFO: renamed from: R */
    int f6204R;

    /* JADX INFO: renamed from: P */
    ArrayList f6202P = new ArrayList();

    /* JADX INFO: renamed from: Q */
    private boolean f6203Q = true;

    /* JADX INFO: renamed from: S */
    boolean f6205S = false;

    /* JADX INFO: renamed from: T */
    private int f6206T = 0;

    /* JADX INFO: renamed from: androidx.transition.v$a */
    class a extends AbstractC1274s {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC1266k f6207a;

        a(AbstractC1266k abstractC1266k) {
            this.f6207a = abstractC1266k;
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: g */
        public void mo6358g(AbstractC1266k abstractC1266k) {
            this.f6207a.mo6413Y();
            abstractC1266k.mo6410U(this);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.v$b */
    static class b extends AbstractC1274s {

        /* JADX INFO: renamed from: a */
        C1277v f6209a;

        b(C1277v c1277v) {
            this.f6209a = c1277v;
        }

        @Override // androidx.transition.AbstractC1274s, androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: a */
        public void mo6352a(AbstractC1266k abstractC1266k) {
            C1277v c1277v = this.f6209a;
            if (c1277v.f6205S) {
                return;
            }
            c1277v.m6424f0();
            this.f6209a.f6205S = true;
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: g */
        public void mo6358g(AbstractC1266k abstractC1266k) {
            C1277v c1277v = this.f6209a;
            int i3 = c1277v.f6204R - 1;
            c1277v.f6204R = i3;
            if (i3 == 0) {
                c1277v.f6205S = false;
                c1277v.m6431p();
            }
            abstractC1266k.mo6410U(this);
        }
    }

    /* JADX INFO: renamed from: k0 */
    private void m6454k0(AbstractC1266k abstractC1266k) {
        this.f6202P.add(abstractC1266k);
        abstractC1266k.f6175u = this;
    }

    /* JADX INFO: renamed from: t0 */
    private void m6455t0() {
        b bVar = new b(this);
        ArrayList arrayList = this.f6202P;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((AbstractC1266k) obj).mo6415a(bVar);
        }
        this.f6204R = this.f6202P.size();
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: S */
    public void mo6408S(View view) {
        super.mo6408S(view);
        int size = this.f6202P.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((AbstractC1266k) this.f6202P.get(i3)).mo6408S(view);
        }
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: W */
    public void mo6412W(View view) {
        super.mo6412W(view);
        int size = this.f6202P.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((AbstractC1266k) this.f6202P.get(i3)).mo6412W(view);
        }
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: Y */
    protected void mo6413Y() {
        if (this.f6202P.isEmpty()) {
            m6424f0();
            m6431p();
            return;
        }
        m6455t0();
        int i3 = 0;
        if (this.f6203Q) {
            ArrayList arrayList = this.f6202P;
            int size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((AbstractC1266k) obj).mo6413Y();
            }
            return;
        }
        for (int i4 = 1; i4 < this.f6202P.size(); i4++) {
            ((AbstractC1266k) this.f6202P.get(i4 - 1)).mo6415a(new a((AbstractC1266k) this.f6202P.get(i4)));
        }
        AbstractC1266k abstractC1266k = (AbstractC1266k) this.f6202P.get(0);
        if (abstractC1266k != null) {
            abstractC1266k.mo6413Y();
        }
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: a0 */
    public void mo6416a0(AbstractC1266k.f fVar) {
        super.mo6416a0(fVar);
        this.f6206T |= 8;
        int size = this.f6202P.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((AbstractC1266k) this.f6202P.get(i3)).mo6416a0(fVar);
        }
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: c0 */
    public void mo6419c0(AbstractC1262g abstractC1262g) {
        super.mo6419c0(abstractC1262g);
        this.f6206T |= 4;
        if (this.f6202P != null) {
            for (int i3 = 0; i3 < this.f6202P.size(); i3++) {
                ((AbstractC1266k) this.f6202P.get(i3)).mo6419c0(abstractC1262g);
            }
        }
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: d0 */
    public void mo6420d0(AbstractC1276u abstractC1276u) {
        super.mo6420d0(abstractC1276u);
        this.f6206T |= 2;
        int size = this.f6202P.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((AbstractC1266k) this.f6202P.get(i3)).mo6420d0(abstractC1276u);
        }
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: f */
    protected void mo6423f() {
        super.mo6423f();
        int size = this.f6202P.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((AbstractC1266k) this.f6202P.get(i3)).mo6423f();
        }
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: g */
    public void mo6342g(C1279x c1279x) {
        if (m6406J(c1279x.f6212b)) {
            ArrayList arrayList = this.f6202P;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                AbstractC1266k abstractC1266k = (AbstractC1266k) obj;
                if (abstractC1266k.m6406J(c1279x.f6212b)) {
                    abstractC1266k.mo6342g(c1279x);
                    c1279x.f6213c.add(abstractC1266k);
                }
            }
        }
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: g0 */
    String mo6425g0(String str) {
        String strMo6425g0 = super.mo6425g0(str);
        for (int i3 = 0; i3 < this.f6202P.size(); i3++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strMo6425g0);
            sb.append("\n");
            sb.append(((AbstractC1266k) this.f6202P.get(i3)).mo6425g0(str + "  "));
            strMo6425g0 = sb.toString();
        }
        return strMo6425g0;
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public C1277v mo6415a(AbstractC1266k.g gVar) {
        return (C1277v) super.mo6415a(gVar);
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: i */
    void mo6426i(C1279x c1279x) {
        super.mo6426i(c1279x);
        int size = this.f6202P.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((AbstractC1266k) this.f6202P.get(i3)).mo6426i(c1279x);
        }
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public C1277v mo6417b(View view) {
        for (int i3 = 0; i3 < this.f6202P.size(); i3++) {
            ((AbstractC1266k) this.f6202P.get(i3)).mo6417b(view);
        }
        return (C1277v) super.mo6417b(view);
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: j */
    public void mo6343j(C1279x c1279x) {
        if (m6406J(c1279x.f6212b)) {
            ArrayList arrayList = this.f6202P;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                AbstractC1266k abstractC1266k = (AbstractC1266k) obj;
                if (abstractC1266k.m6406J(c1279x.f6212b)) {
                    abstractC1266k.mo6343j(c1279x);
                    c1279x.f6213c.add(abstractC1266k);
                }
            }
        }
    }

    /* JADX INFO: renamed from: j0 */
    public C1277v m6458j0(AbstractC1266k abstractC1266k) {
        m6454k0(abstractC1266k);
        long j3 = this.f6160f;
        if (j3 >= 0) {
            abstractC1266k.mo6414Z(j3);
        }
        if ((this.f6206T & 1) != 0) {
            abstractC1266k.mo6418b0(m6435u());
        }
        if ((this.f6206T & 2) != 0) {
            m6439y();
            abstractC1266k.mo6420d0(null);
        }
        if ((this.f6206T & 4) != 0) {
            abstractC1266k.mo6419c0(m6438x());
        }
        if ((this.f6206T & 8) != 0) {
            abstractC1266k.mo6416a0(m6434t());
        }
        return this;
    }

    /* JADX INFO: renamed from: l0 */
    public AbstractC1266k m6459l0(int i3) {
        if (i3 < 0 || i3 >= this.f6202P.size()) {
            return null;
        }
        return (AbstractC1266k) this.f6202P.get(i3);
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC1266k clone() {
        C1277v c1277v = (C1277v) super.clone();
        c1277v.f6202P = new ArrayList();
        int size = this.f6202P.size();
        for (int i3 = 0; i3 < size; i3++) {
            c1277v.m6454k0(((AbstractC1266k) this.f6202P.get(i3)).clone());
        }
        return c1277v;
    }

    /* JADX INFO: renamed from: m0 */
    public int m6460m0() {
        return this.f6202P.size();
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public C1277v mo6410U(AbstractC1266k.g gVar) {
        return (C1277v) super.mo6410U(gVar);
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: o */
    void mo6430o(ViewGroup viewGroup, C1280y c1280y, C1280y c1280y2, ArrayList arrayList, ArrayList arrayList2) {
        long jM6400B = m6400B();
        int size = this.f6202P.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC1266k abstractC1266k = (AbstractC1266k) this.f6202P.get(i3);
            if (jM6400B > 0 && (this.f6203Q || i3 == 0)) {
                long jM6400B2 = abstractC1266k.m6400B();
                if (jM6400B2 > 0) {
                    abstractC1266k.mo6422e0(jM6400B2 + jM6400B);
                } else {
                    abstractC1266k.mo6422e0(jM6400B);
                }
            }
            abstractC1266k.mo6430o(viewGroup, c1280y, c1280y2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public C1277v mo6411V(View view) {
        for (int i3 = 0; i3 < this.f6202P.size(); i3++) {
            ((AbstractC1266k) this.f6202P.get(i3)).mo6411V(view);
        }
        return (C1277v) super.mo6411V(view);
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public C1277v mo6414Z(long j3) {
        ArrayList arrayList;
        super.mo6414Z(j3);
        if (this.f6160f >= 0 && (arrayList = this.f6202P) != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((AbstractC1266k) this.f6202P.get(i3)).mo6414Z(j3);
            }
        }
        return this;
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: q */
    public AbstractC1266k mo6432q(Class cls, boolean z2) {
        for (int i3 = 0; i3 < this.f6202P.size(); i3++) {
            ((AbstractC1266k) this.f6202P.get(i3)).mo6432q(cls, z2);
        }
        return super.mo6432q(cls, z2);
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public C1277v mo6418b0(TimeInterpolator timeInterpolator) {
        this.f6206T |= 1;
        ArrayList arrayList = this.f6202P;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((AbstractC1266k) this.f6202P.get(i3)).mo6418b0(timeInterpolator);
            }
        }
        return (C1277v) super.mo6418b0(timeInterpolator);
    }

    /* JADX INFO: renamed from: r0 */
    public C1277v m6465r0(int i3) {
        if (i3 == 0) {
            this.f6203Q = true;
            return this;
        }
        if (i3 == 1) {
            this.f6203Q = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i3);
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public C1277v mo6422e0(long j3) {
        return (C1277v) super.mo6422e0(j3);
    }
}
