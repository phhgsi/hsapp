package androidx.coordinatorlayout.widget;

import androidx.collection.C0929i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p024I.C0209f;
import p024I.InterfaceC0208e;

/* JADX INFO: renamed from: androidx.coordinatorlayout.widget.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0960b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0208e f4638a = new C0209f(10);

    /* JADX INFO: renamed from: b */
    private final C0929i f4639b = new C0929i();

    /* JADX INFO: renamed from: c */
    private final ArrayList f4640c = new ArrayList();

    /* JADX INFO: renamed from: d */
    private final HashSet f4641d = new HashSet();

    /* JADX INFO: renamed from: e */
    private void m4183e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f4639b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                m4183e(arrayList2.get(i3), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: f */
    private ArrayList m4184f() {
        ArrayList arrayList = (ArrayList) this.f4638a.mo602b();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    /* JADX INFO: renamed from: k */
    private void m4185k(ArrayList arrayList) {
        arrayList.clear();
        this.f4638a.mo601a(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public void m4186a(Object obj, Object obj2) {
        if (!this.f4639b.containsKey(obj) || !this.f4639b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayListM4184f = (ArrayList) this.f4639b.get(obj);
        if (arrayListM4184f == null) {
            arrayListM4184f = m4184f();
            this.f4639b.put(obj, arrayListM4184f);
        }
        arrayListM4184f.add(obj2);
    }

    /* JADX INFO: renamed from: b */
    public void m4187b(Object obj) {
        if (this.f4639b.containsKey(obj)) {
            return;
        }
        this.f4639b.put(obj, null);
    }

    /* JADX INFO: renamed from: c */
    public void m4188c() {
        int size = this.f4639b.size();
        for (int i3 = 0; i3 < size; i3++) {
            ArrayList arrayList = (ArrayList) this.f4639b.m3948j(i3);
            if (arrayList != null) {
                m4185k(arrayList);
            }
        }
        this.f4639b.clear();
    }

    /* JADX INFO: renamed from: d */
    public boolean m4189d(Object obj) {
        return this.f4639b.containsKey(obj);
    }

    /* JADX INFO: renamed from: g */
    public List m4190g(Object obj) {
        return (List) this.f4639b.get(obj);
    }

    /* JADX INFO: renamed from: h */
    public List m4191h(Object obj) {
        int size = this.f4639b.size();
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < size; i3++) {
            ArrayList arrayList2 = (ArrayList) this.f4639b.m3948j(i3);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f4639b.m3944f(i3));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public ArrayList m4192i() {
        this.f4640c.clear();
        this.f4641d.clear();
        int size = this.f4639b.size();
        for (int i3 = 0; i3 < size; i3++) {
            m4183e(this.f4639b.m3944f(i3), this.f4640c, this.f4641d);
        }
        return this.f4640c;
    }

    /* JADX INFO: renamed from: j */
    public boolean m4193j(Object obj) {
        int size = this.f4639b.size();
        for (int i3 = 0; i3 < size; i3++) {
            ArrayList arrayList = (ArrayList) this.f4639b.m3948j(i3);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
