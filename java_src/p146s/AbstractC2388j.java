package p146s;

import java.util.ArrayList;
import java.util.Arrays;
import p149t.AbstractC2417i;
import p149t.C2423o;

/* JADX INFO: renamed from: s.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2388j extends C2383e implements InterfaceC2387i {

    /* JADX INFO: renamed from: J0 */
    public C2383e[] f11072J0 = new C2383e[4];

    /* JADX INFO: renamed from: K0 */
    public int f11073K0 = 0;

    @Override // p146s.InterfaceC2387i
    /* JADX INFO: renamed from: a */
    public void mo11466a(C2383e c2383e) {
        if (c2383e == this || c2383e == null) {
            return;
        }
        int i3 = this.f11073K0 + 1;
        C2383e[] c2383eArr = this.f11072J0;
        if (i3 > c2383eArr.length) {
            this.f11072J0 = (C2383e[]) Arrays.copyOf(c2383eArr, c2383eArr.length * 2);
        }
        C2383e[] c2383eArr2 = this.f11072J0;
        int i4 = this.f11073K0;
        c2383eArr2[i4] = c2383e;
        this.f11073K0 = i4 + 1;
    }

    @Override // p146s.InterfaceC2387i
    /* JADX INFO: renamed from: c */
    public void mo11468c() {
        this.f11073K0 = 0;
        Arrays.fill(this.f11072J0, (Object) null);
    }

    /* JADX INFO: renamed from: l1 */
    public void m11469l1(ArrayList arrayList, int i3, C2423o c2423o) {
        for (int i4 = 0; i4 < this.f11073K0; i4++) {
            c2423o.m11643a(this.f11072J0[i4]);
        }
        for (int i5 = 0; i5 < this.f11073K0; i5++) {
            AbstractC2417i.m11628a(this.f11072J0[i5], i3, arrayList, c2423o);
        }
    }

    /* JADX INFO: renamed from: m1 */
    public int m11470m1(int i3) {
        int i4;
        int i5;
        for (int i6 = 0; i6 < this.f11073K0; i6++) {
            C2383e c2383e = this.f11072J0[i6];
            if (i3 == 0 && (i5 = c2383e.f10911G0) != -1) {
                return i5;
            }
            if (i3 == 1 && (i4 = c2383e.f10913H0) != -1) {
                return i4;
            }
        }
        return -1;
    }

    @Override // p146s.InterfaceC2387i
    /* JADX INFO: renamed from: b */
    public void mo11467b(C2384f c2384f) {
    }
}
