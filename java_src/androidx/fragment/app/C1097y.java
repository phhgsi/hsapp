package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.fragment.app.y */
/* JADX INFO: loaded from: classes.dex */
class C1097y {

    /* JADX INFO: renamed from: a */
    private final ArrayList f5217a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final HashMap f5218b = new HashMap();

    /* JADX INFO: renamed from: c */
    private final HashMap f5219c = new HashMap();

    /* JADX INFO: renamed from: d */
    private C1094v f5220d;

    C1097y() {
    }

    /* JADX INFO: renamed from: A */
    void m5018A(C1094v c1094v) {
        this.f5220d = c1094v;
    }

    /* JADX INFO: renamed from: B */
    FragmentState m5019B(String str, FragmentState fragmentState) {
        return fragmentState != null ? (FragmentState) this.f5219c.put(str, fragmentState) : (FragmentState) this.f5219c.remove(str);
    }

    /* JADX INFO: renamed from: a */
    void m5020a(Fragment fragment) {
        if (this.f5217a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f5217a) {
            this.f5217a.add(fragment);
        }
        fragment.mAdded = true;
    }

    /* JADX INFO: renamed from: b */
    void m5021b() {
        this.f5218b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: renamed from: c */
    boolean m5022c(String str) {
        return this.f5218b.get(str) != null;
    }

    /* JADX INFO: renamed from: d */
    void m5023d(int i3) {
        for (C1096x c1096x : this.f5218b.values()) {
            if (c1096x != null) {
                c1096x.m5015t(i3);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    void m5024e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f5218b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C1096x c1096x : this.f5218b.values()) {
                printWriter.print(str);
                if (c1096x != null) {
                    Fragment fragmentM5008k = c1096x.m5008k();
                    printWriter.println(fragmentM5008k);
                    fragmentM5008k.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f5217a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i3 = 0; i3 < size; i3++) {
                Fragment fragment = (Fragment) this.f5217a.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    /* JADX INFO: renamed from: f */
    Fragment m5025f(String str) {
        C1096x c1096x = (C1096x) this.f5218b.get(str);
        if (c1096x != null) {
            return c1096x.m5008k();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    Fragment m5026g(int i3) {
        for (int size = this.f5217a.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f5217a.get(size);
            if (fragment != null && fragment.mFragmentId == i3) {
                return fragment;
            }
        }
        for (C1096x c1096x : this.f5218b.values()) {
            if (c1096x != null) {
                Fragment fragmentM5008k = c1096x.m5008k();
                if (fragmentM5008k.mFragmentId == i3) {
                    return fragmentM5008k;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    Fragment m5027h(String str) {
        if (str != null) {
            for (int size = this.f5217a.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f5217a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C1096x c1096x : this.f5218b.values()) {
            if (c1096x != null) {
                Fragment fragmentM5008k = c1096x.m5008k();
                if (str.equals(fragmentM5008k.mTag)) {
                    return fragmentM5008k;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    Fragment m5028i(String str) {
        Fragment fragmentFindFragmentByWho;
        for (C1096x c1096x : this.f5218b.values()) {
            if (c1096x != null && (fragmentFindFragmentByWho = c1096x.m5008k().findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    int m5029j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f5217a.indexOf(fragment);
        for (int i3 = iIndexOf - 1; i3 >= 0; i3--) {
            Fragment fragment2 = (Fragment) this.f5217a.get(i3);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f5217a.size()) {
                return -1;
            }
            Fragment fragment3 = (Fragment) this.f5217a.get(iIndexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    List m5030k() {
        ArrayList arrayList = new ArrayList();
        for (C1096x c1096x : this.f5218b.values()) {
            if (c1096x != null) {
                arrayList.add(c1096x);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    List m5031l() {
        ArrayList arrayList = new ArrayList();
        for (C1096x c1096x : this.f5218b.values()) {
            if (c1096x != null) {
                arrayList.add(c1096x.m5008k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    ArrayList m5032m() {
        return new ArrayList(this.f5219c.values());
    }

    /* JADX INFO: renamed from: n */
    C1096x m5033n(String str) {
        return (C1096x) this.f5218b.get(str);
    }

    /* JADX INFO: renamed from: o */
    List m5034o() {
        ArrayList arrayList;
        if (this.f5217a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f5217a) {
            arrayList = new ArrayList(this.f5217a);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    C1094v m5035p() {
        return this.f5220d;
    }

    /* JADX INFO: renamed from: q */
    FragmentState m5036q(String str) {
        return (FragmentState) this.f5219c.get(str);
    }

    /* JADX INFO: renamed from: r */
    void m5037r(C1096x c1096x) {
        Fragment fragmentM5008k = c1096x.m5008k();
        if (m5022c(fragmentM5008k.mWho)) {
            return;
        }
        this.f5218b.put(fragmentM5008k.mWho, c1096x);
        if (fragmentM5008k.mRetainInstanceChangedWhileDetached) {
            if (fragmentM5008k.mRetainInstance) {
                this.f5220d.m4985f(fragmentM5008k);
            } else {
                this.f5220d.m4993p(fragmentM5008k);
            }
            fragmentM5008k.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.m4744H0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragmentM5008k);
        }
    }

    /* JADX INFO: renamed from: s */
    void m5038s(C1096x c1096x) {
        Fragment fragmentM5008k = c1096x.m5008k();
        if (fragmentM5008k.mRetainInstance) {
            this.f5220d.m4993p(fragmentM5008k);
        }
        if (((C1096x) this.f5218b.put(fragmentM5008k.mWho, null)) != null && FragmentManager.m4744H0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragmentM5008k);
        }
    }

    /* JADX INFO: renamed from: t */
    void m5039t() {
        ArrayList arrayList = this.f5217a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            C1096x c1096x = (C1096x) this.f5218b.get(((Fragment) obj).mWho);
            if (c1096x != null) {
                c1096x.m5009m();
            }
        }
        for (C1096x c1096x2 : this.f5218b.values()) {
            if (c1096x2 != null) {
                c1096x2.m5009m();
                Fragment fragmentM5008k = c1096x2.m5008k();
                if (fragmentM5008k.mRemoving && !fragmentM5008k.isInBackStack()) {
                    if (fragmentM5008k.mBeingSaved && !this.f5219c.containsKey(fragmentM5008k.mWho)) {
                        c1096x2.m5013r();
                    }
                    m5038s(c1096x2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: u */
    void m5040u(Fragment fragment) {
        synchronized (this.f5217a) {
            this.f5217a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* JADX INFO: renamed from: v */
    void m5041v() {
        this.f5218b.clear();
    }

    /* JADX INFO: renamed from: w */
    void m5042w(List list) {
        this.f5217a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Fragment fragmentM5025f = m5025f(str);
                if (fragmentM5025f == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.m4744H0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + fragmentM5025f);
                }
                m5020a(fragmentM5025f);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    void m5043x(ArrayList arrayList) {
        this.f5219c.clear();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            FragmentState fragmentState = (FragmentState) obj;
            this.f5219c.put(fragmentState.f5099e, fragmentState);
        }
    }

    /* JADX INFO: renamed from: y */
    ArrayList m5044y() {
        ArrayList arrayList = new ArrayList(this.f5218b.size());
        for (C1096x c1096x : this.f5218b.values()) {
            if (c1096x != null) {
                Fragment fragmentM5008k = c1096x.m5008k();
                c1096x.m5013r();
                arrayList.add(fragmentM5008k.mWho);
                if (FragmentManager.m4744H0(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragmentM5008k + ": " + fragmentM5008k.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    ArrayList m5045z() {
        synchronized (this.f5217a) {
            try {
                if (this.f5217a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f5217a.size());
                ArrayList arrayList2 = this.f5217a;
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    Fragment fragment = (Fragment) obj;
                    arrayList.add(fragment.mWho);
                    if (FragmentManager.m4744H0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment.mWho + "): " + fragment);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
