package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.AbstractC1098z;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.ConnectionResult;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.a */
/* JADX INFO: loaded from: classes.dex */
final class C1073a extends AbstractC1098z implements FragmentManager.InterfaceC1067k {

    /* JADX INFO: renamed from: t */
    final FragmentManager f5111t;

    /* JADX INFO: renamed from: u */
    boolean f5112u;

    /* JADX INFO: renamed from: v */
    int f5113v;

    /* JADX INFO: renamed from: w */
    boolean f5114w;

    C1073a(FragmentManager fragmentManager) {
        super(fragmentManager.m4852s0(), fragmentManager.m4854u0() != null ? fragmentManager.m4854u0().m4963m().getClassLoader() : null);
        this.f5113v = -1;
        this.f5114w = false;
        this.f5111t = fragmentManager;
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC1067k
    /* JADX INFO: renamed from: a */
    public boolean mo4877a(ArrayList arrayList, ArrayList arrayList2) {
        if (FragmentManager.m4744H0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f5229i) {
            return true;
        }
        this.f5111t.m4834i(this);
        return true;
    }

    @Override // androidx.fragment.app.AbstractC1098z
    /* JADX INFO: renamed from: f */
    public int mo4883f() {
        return m4890q(false);
    }

    @Override // androidx.fragment.app.AbstractC1098z
    /* JADX INFO: renamed from: g */
    public int mo4884g() {
        return m4890q(true);
    }

    @Override // androidx.fragment.app.AbstractC1098z
    /* JADX INFO: renamed from: h */
    public void mo4885h() {
        m5050j();
        this.f5111t.m4828c0(this, false);
    }

    @Override // androidx.fragment.app.AbstractC1098z
    /* JADX INFO: renamed from: i */
    public void mo4886i() {
        m5050j();
        this.f5111t.m4828c0(this, true);
    }

    @Override // androidx.fragment.app.AbstractC1098z
    /* JADX INFO: renamed from: k */
    void mo4887k(int i3, Fragment fragment, String str, int i4) {
        super.mo4887k(i3, fragment, str, i4);
        fragment.mFragmentManager = this.f5111t;
    }

    @Override // androidx.fragment.app.AbstractC1098z
    /* JADX INFO: renamed from: l */
    public AbstractC1098z mo4888l(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f5111t) {
            return super.mo4888l(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* JADX INFO: renamed from: p */
    void m4889p(int i3) {
        if (this.f5229i) {
            if (FragmentManager.m4744H0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i3);
            }
            int size = this.f5223c.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractC1098z.a aVar = (AbstractC1098z.a) this.f5223c.get(i4);
                Fragment fragment = aVar.f5241b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i3;
                    if (FragmentManager.m4744H0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f5241b + " to " + aVar.f5241b.mBackStackNesting);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    int m4890q(boolean z2) {
        if (this.f5112u) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.m4744H0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C1037E("FragmentManager"));
            m4891r("  ", printWriter);
            printWriter.close();
        }
        this.f5112u = true;
        if (this.f5229i) {
            this.f5113v = this.f5111t.m4844m();
        } else {
            this.f5113v = -1;
        }
        this.f5111t.m4824Z(this, z2);
        return this.f5113v;
    }

    /* JADX INFO: renamed from: r */
    public void m4891r(String str, PrintWriter printWriter) {
        m4892s(str, printWriter, true);
    }

    /* JADX INFO: renamed from: s */
    public void m4892s(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f5231k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f5113v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f5112u);
            if (this.f5228h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f5228h));
            }
            if (this.f5224d != 0 || this.f5225e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f5224d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f5225e));
            }
            if (this.f5226f != 0 || this.f5227g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f5226f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f5227g));
            }
            if (this.f5232l != 0 || this.f5233m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f5232l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f5233m);
            }
            if (this.f5234n != 0 || this.f5235o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f5234n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f5235o);
            }
        }
        if (this.f5223c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f5223c.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC1098z.a aVar = (AbstractC1098z.a) this.f5223c.get(i3);
            switch (aVar.f5240a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f5240a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i3);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f5241b);
            if (z2) {
                if (aVar.f5243d != 0 || aVar.f5244e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f5243d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f5244e));
                }
                if (aVar.f5245f != 0 || aVar.f5246g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f5245f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f5246g));
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    void m4893t() {
        int size = this.f5223c.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC1098z.a aVar = (AbstractC1098z.a) this.f5223c.get(i3);
            Fragment fragment = aVar.f5241b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f5114w;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f5228h);
                fragment.setSharedElementNames(this.f5236p, this.f5237q);
            }
            switch (aVar.f5240a) {
                case 1:
                    fragment.setAnimations(aVar.f5243d, aVar.f5244e, aVar.f5245f, aVar.f5246g);
                    this.f5111t.m4839j1(fragment, false);
                    this.f5111t.m4837j(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f5240a);
                case 3:
                    fragment.setAnimations(aVar.f5243d, aVar.f5244e, aVar.f5245f, aVar.f5246g);
                    this.f5111t.m4827b1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f5243d, aVar.f5244e, aVar.f5245f, aVar.f5246g);
                    this.f5111t.m4790E0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f5243d, aVar.f5244e, aVar.f5245f, aVar.f5246g);
                    this.f5111t.m4839j1(fragment, false);
                    this.f5111t.m4846n1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f5243d, aVar.f5244e, aVar.f5245f, aVar.f5246g);
                    this.f5111t.m4858x(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f5243d, aVar.f5244e, aVar.f5245f, aVar.f5246g);
                    this.f5111t.m4839j1(fragment, false);
                    this.f5111t.m4847o(fragment);
                    break;
                case 8:
                    this.f5111t.m4843l1(fragment);
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    this.f5111t.m4843l1(null);
                    break;
                case 10:
                    this.f5111t.m4841k1(fragment, aVar.f5248i);
                    break;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f5113v >= 0) {
            sb.append(" #");
            sb.append(this.f5113v);
        }
        if (this.f5231k != null) {
            sb.append(" ");
            sb.append(this.f5231k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    void m4894u() {
        for (int size = this.f5223c.size() - 1; size >= 0; size--) {
            AbstractC1098z.a aVar = (AbstractC1098z.a) this.f5223c.get(size);
            Fragment fragment = aVar.f5241b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f5114w;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.m4765g1(this.f5228h));
                fragment.setSharedElementNames(this.f5237q, this.f5236p);
            }
            switch (aVar.f5240a) {
                case 1:
                    fragment.setAnimations(aVar.f5243d, aVar.f5244e, aVar.f5245f, aVar.f5246g);
                    this.f5111t.m4839j1(fragment, true);
                    this.f5111t.m4827b1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f5240a);
                case 3:
                    fragment.setAnimations(aVar.f5243d, aVar.f5244e, aVar.f5245f, aVar.f5246g);
                    this.f5111t.m4837j(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f5243d, aVar.f5244e, aVar.f5245f, aVar.f5246g);
                    this.f5111t.m4846n1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f5243d, aVar.f5244e, aVar.f5245f, aVar.f5246g);
                    this.f5111t.m4839j1(fragment, true);
                    this.f5111t.m4790E0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f5243d, aVar.f5244e, aVar.f5245f, aVar.f5246g);
                    this.f5111t.m4847o(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f5243d, aVar.f5244e, aVar.f5245f, aVar.f5246g);
                    this.f5111t.m4839j1(fragment, true);
                    this.f5111t.m4858x(fragment);
                    break;
                case 8:
                    this.f5111t.m4843l1(null);
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    this.f5111t.m4843l1(fragment);
                    break;
                case 10:
                    this.f5111t.m4841k1(fragment, aVar.f5247h);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.fragment.app.Fragment m4895v(java.util.ArrayList r17, androidx.fragment.app.Fragment r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList r5 = r0.f5223c
            int r5 = r5.size()
            if (r4 >= r5) goto Lbe
            java.util.ArrayList r5 = r0.f5223c
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.z$a r5 = (androidx.fragment.app.AbstractC1098z.a) r5
            int r6 = r5.f5240a
            r7 = 1
            if (r6 == r7) goto Lb6
            r8 = 2
            r9 = 0
            r10 = 3
            r11 = 9
            if (r6 == r8) goto L5a
            if (r6 == r10) goto L43
            r8 = 6
            if (r6 == r8) goto L43
            r8 = 7
            if (r6 == r8) goto Lb6
            r8 = 8
            if (r6 == r8) goto L31
            goto Lbb
        L31:
            java.util.ArrayList r6 = r0.f5223c
            androidx.fragment.app.z$a r8 = new androidx.fragment.app.z$a
            r8.<init>(r11, r3, r7)
            r6.add(r4, r8)
            r5.f5242c = r7
            int r4 = r4 + 1
            androidx.fragment.app.Fragment r3 = r5.f5241b
            goto Lbb
        L43:
            androidx.fragment.app.Fragment r6 = r5.f5241b
            r1.remove(r6)
            androidx.fragment.app.Fragment r5 = r5.f5241b
            if (r5 != r3) goto Lbb
            java.util.ArrayList r3 = r0.f5223c
            androidx.fragment.app.z$a r6 = new androidx.fragment.app.z$a
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r9
            goto Lbb
        L5a:
            androidx.fragment.app.Fragment r6 = r5.f5241b
            int r8 = r6.mContainerId
            int r12 = r1.size()
            int r12 = r12 - r7
            r13 = 0
        L64:
            if (r12 < 0) goto La4
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.Fragment r14 = (androidx.fragment.app.Fragment) r14
            int r15 = r14.mContainerId
            if (r15 != r8) goto La1
            if (r14 != r6) goto L74
            r13 = r7
            goto La1
        L74:
            if (r14 != r3) goto L83
            java.util.ArrayList r3 = r0.f5223c
            androidx.fragment.app.z$a r15 = new androidx.fragment.app.z$a
            r15.<init>(r11, r14, r7)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r9
        L83:
            androidx.fragment.app.z$a r15 = new androidx.fragment.app.z$a
            r15.<init>(r10, r14, r7)
            int r2 = r5.f5243d
            r15.f5243d = r2
            int r2 = r5.f5245f
            r15.f5245f = r2
            int r2 = r5.f5244e
            r15.f5244e = r2
            int r2 = r5.f5246g
            r15.f5246g = r2
            java.util.ArrayList r2 = r0.f5223c
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r7
        La1:
            int r12 = r12 + (-1)
            goto L64
        La4:
            if (r13 == 0) goto Lae
            java.util.ArrayList r2 = r0.f5223c
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lbb
        Lae:
            r5.f5240a = r7
            r5.f5242c = r7
            r1.add(r6)
            goto Lbb
        Lb6:
            androidx.fragment.app.Fragment r2 = r5.f5241b
            r1.add(r2)
        Lbb:
            int r4 = r4 + r7
            goto L7
        Lbe:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1073a.m4895v(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    /* JADX INFO: renamed from: w */
    public String m4896w() {
        return this.f5231k;
    }

    /* JADX INFO: renamed from: x */
    public void m4897x() {
        if (this.f5239s != null) {
            for (int i3 = 0; i3 < this.f5239s.size(); i3++) {
                ((Runnable) this.f5239s.get(i3)).run();
            }
            this.f5239s = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.fragment.app.Fragment m4898y(java.util.ArrayList r6, androidx.fragment.app.Fragment r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.f5223c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList r2 = r5.f5223c
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.z$a r2 = (androidx.fragment.app.AbstractC1098z.a) r2
            int r3 = r2.f5240a
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            androidx.lifecycle.h$b r3 = r2.f5247h
            r2.f5248i = r3
            goto L32
        L22:
            androidx.fragment.app.Fragment r7 = r2.f5241b
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.Fragment r2 = r2.f5241b
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.Fragment r2 = r2.f5241b
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1073a.m4898y(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }
}
