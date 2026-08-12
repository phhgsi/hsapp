package p030K;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: K.z */
/* JADX INFO: loaded from: classes.dex */
public class C0357z {

    /* JADX INFO: renamed from: a */
    private final Object f1476a;

    /* JADX INFO: renamed from: K.z$a */
    static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a */
        final C0357z f1477a;

        a(C0357z c0357z) {
            this.f1477a = c0357z;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i3) {
            C0356y c0356yMo1321b = this.f1477a.mo1321b(i3);
            if (c0356yMo1321b == null) {
                return null;
            }
            return c0356yMo1321b.m1255U0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i3) {
            List listM1322c = this.f1477a.m1322c(str, i3);
            if (listM1322c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listM1322c.size();
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add(((C0356y) listM1322c.get(i4)).m1255U0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i3) {
            C0356y c0356yMo1323d = this.f1477a.mo1323d(i3);
            if (c0356yMo1323d == null) {
                return null;
            }
            return c0356yMo1323d.m1255U0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i3, int i4, Bundle bundle) {
            return this.f1477a.mo1325f(i3, i4, bundle);
        }
    }

    /* JADX INFO: renamed from: K.z$b */
    static class b extends a {
        b(C0357z c0357z) {
            super(c0357z);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i3, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f1477a.m1320a(i3, C0356y.m1204V0(accessibilityNodeInfo), str, bundle);
        }
    }

    public C0357z() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1476a = new b(this);
        } else {
            this.f1476a = new a(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public C0356y mo1321b(int i3) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public List m1322c(String str, int i3) {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public C0356y mo1323d(int i3) {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public Object m1324e() {
        return this.f1476a;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo1325f(int i3, int i4, Bundle bundle) {
        return false;
    }

    public C0357z(Object obj) {
        this.f1476a = obj;
    }

    /* JADX INFO: renamed from: a */
    public void m1320a(int i3, C0356y c0356y, String str, Bundle bundle) {
    }
}
