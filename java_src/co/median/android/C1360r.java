package co.median.android;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: co.median.android.r */
/* JADX INFO: loaded from: classes.dex */
public class C1360r {

    /* JADX INFO: renamed from: c */
    private b f6700c;

    /* JADX INFO: renamed from: d */
    private String f6701d = null;

    /* JADX INFO: renamed from: a */
    private final LinkedHashMap f6698a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    private final List f6699b = new ArrayList();

    /* JADX INFO: renamed from: co.median.android.r$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final String f6702a;

        /* JADX INFO: renamed from: b */
        private boolean f6703b;

        /* JADX INFO: renamed from: c */
        private int f6704c = -1;

        /* JADX INFO: renamed from: d */
        private int f6705d = -1;

        /* JADX INFO: renamed from: e */
        private boolean f6706e;

        a(String str, boolean z2) {
            this.f6702a = str;
            this.f6703b = z2;
        }

        /* JADX INFO: renamed from: h */
        public void m7073h(int i3, int i4) {
            this.f6704c = i3;
            this.f6705d = i4;
        }

        public String toString() {
            return "id=" + this.f6702a + "\nisRoot=" + this.f6703b + "\nurlLevel=" + this.f6704c + "\nparentUrlLevel=" + this.f6705d;
        }
    }

    /* JADX INFO: renamed from: co.median.android.r$b */
    interface b {
        /* JADX INFO: renamed from: a */
        void mo7074a();
    }

    /* JADX INFO: renamed from: co.median.android.r$c */
    interface c {
        /* JADX INFO: renamed from: a */
        boolean mo7075a(String str);
    }

    /* JADX INFO: renamed from: a */
    public void m7049a(c cVar) {
        this.f6699b.add(cVar);
    }

    /* JADX INFO: renamed from: b */
    public void m7050b(String str, boolean z2) {
        this.f6698a.put(str, new a(str, z2));
    }

    /* JADX INFO: renamed from: c */
    public String m7051c() {
        return this.f6701d;
    }

    /* JADX INFO: renamed from: d */
    public String m7052d() {
        Iterator it = this.f6698a.entrySet().iterator();
        while (it.hasNext()) {
            a aVar = (a) ((Map.Entry) it.next()).getValue();
            if (!aVar.f6703b) {
                return aVar.f6702a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public int m7053e(String str) {
        a aVar = (a) this.f6698a.get(str);
        if (aVar != null) {
            return aVar.f6705d;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public int m7054f(String str) {
        a aVar = (a) this.f6698a.get(str);
        if (aVar != null) {
            return aVar.f6704c;
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public int m7055g() {
        return this.f6698a.size();
    }

    /* JADX INFO: renamed from: h */
    public boolean m7056h(String str) {
        a aVar = (a) this.f6698a.get(str);
        if (aVar != null) {
            return aVar.f6706e;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public boolean m7057i(String str) {
        a aVar = (a) this.f6698a.get(str);
        if (aVar != null) {
            return aVar.f6703b;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public void m7058j(String str) {
        if (this.f6699b.isEmpty()) {
            return;
        }
        Iterator it = this.f6699b.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).mo7075a(str)) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m7059k(String str) {
        this.f6698a.remove(str);
        if (this.f6700c == null || this.f6698a.size() > 1) {
            return;
        }
        this.f6700c.mo7074a();
    }

    /* JADX INFO: renamed from: l */
    public void m7060l(String str) {
        for (Map.Entry entry : this.f6698a.entrySet()) {
            a aVar = (a) entry.getValue();
            if (TextUtils.equals(str, (CharSequence) entry.getKey())) {
                aVar.f6703b = true;
            } else {
                aVar.f6703b = false;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m7061m(String str) {
        this.f6701d = str;
    }

    /* JADX INFO: renamed from: n */
    public void m7062n(String str, boolean z2) {
        a aVar = (a) this.f6698a.get(str);
        if (aVar != null) {
            aVar.f6706e = z2;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m7063o(b bVar) {
        this.f6700c = bVar;
    }

    /* JADX INFO: renamed from: p */
    public void m7064p(String str, int i3) {
        a aVar = (a) this.f6698a.get(str);
        if (aVar != null) {
            aVar.m7073h(i3, aVar.f6705d);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m7065q(String str, int i3, int i4) {
        a aVar = (a) this.f6698a.get(str);
        if (aVar != null) {
            aVar.m7073h(i3, i4);
        }
    }
}
