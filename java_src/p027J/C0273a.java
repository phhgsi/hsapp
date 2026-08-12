package p027J;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p030K.C0356y;
import p030K.C0357z;
import p158w.AbstractC2485c;

/* JADX INFO: renamed from: J.a */
/* JADX INFO: loaded from: classes.dex */
public class C0273a {

    /* JADX INFO: renamed from: c */
    private static final View.AccessibilityDelegate f1302c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a */
    private final View.AccessibilityDelegate f1303a;

    /* JADX INFO: renamed from: b */
    private final View.AccessibilityDelegate f1304b;

    /* JADX INFO: renamed from: J.a$a */
    static final class a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a */
        final C0273a f1305a;

        a(C0273a c0273a) {
            this.f1305a = c0273a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f1305a.mo901a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C0357z c0357zMo902b = this.f1305a.mo902b(view);
            if (c0357zMo902b != null) {
                return (AccessibilityNodeProvider) c0357zMo902b.m1324e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1305a.mo904f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C0356y c0356yM1204V0 = C0356y.m1204V0(accessibilityNodeInfo);
            c0356yM1204V0.m1236K0(AbstractC0268W.m748Q(view));
            c0356yM1204V0.m1220B0(AbstractC0268W.m744M(view));
            c0356yM1204V0.m1229G0(AbstractC0268W.m784n(view));
            c0356yM1204V0.m1247Q0(AbstractC0268W.m736E(view));
            this.f1305a.mo905g(view, c0356yM1204V0);
            c0356yM1204V0.m1270f(accessibilityNodeInfo.getText(), view);
            List listM898c = C0273a.m898c(view);
            for (int i3 = 0; i3 < listM898c.size(); i3++) {
                c0356yM1204V0.m1263b((C0356y.a) listM898c.get(i3));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1305a.mo906h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f1305a.mo907i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i3, Bundle bundle) {
            return this.f1305a.mo908j(view, i3, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i3) {
            this.f1305a.mo909l(view, i3);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f1305a.mo910m(view, accessibilityEvent);
        }
    }

    public C0273a() {
        this(f1302c);
    }

    /* JADX INFO: renamed from: c */
    static List m898c(View view) {
        List list = (List) view.getTag(AbstractC2485c.f11517H);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    /* JADX INFO: renamed from: e */
    private boolean m899e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrM1216t = C0356y.m1216t(view.createAccessibilityNodeInfo().getText());
            for (int i3 = 0; clickableSpanArrM1216t != null && i3 < clickableSpanArrM1216t.length; i3++) {
                if (clickableSpan.equals(clickableSpanArrM1216t[i3])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    private boolean m900k(int i3, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(AbstractC2485c.f11518I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i3)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!m899e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo901a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1303a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: b */
    public C0357z mo902b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f1303a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C0357z(accessibilityNodeProvider);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    View.AccessibilityDelegate m903d() {
        return this.f1304b;
    }

    /* JADX INFO: renamed from: f */
    public void mo904f(View view, AccessibilityEvent accessibilityEvent) {
        this.f1303a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: g */
    public void mo905g(View view, C0356y c0356y) {
        this.f1303a.onInitializeAccessibilityNodeInfo(view, c0356y.m1255U0());
    }

    /* JADX INFO: renamed from: h */
    public void mo906h(View view, AccessibilityEvent accessibilityEvent) {
        this.f1303a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: i */
    public boolean mo907i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1303a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: j */
    public boolean mo908j(View view, int i3, Bundle bundle) {
        List listM898c = m898c(view);
        boolean zPerformAccessibilityAction = false;
        int i4 = 0;
        while (true) {
            if (i4 >= listM898c.size()) {
                break;
            }
            C0356y.a aVar = (C0356y.a) listM898c.get(i4);
            if (aVar.m1301b() == i3) {
                zPerformAccessibilityAction = aVar.m1303d(view, bundle);
                break;
            }
            i4++;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f1303a.performAccessibilityAction(view, i3, bundle);
        }
        return (zPerformAccessibilityAction || i3 != AbstractC2485c.f11530a || bundle == null) ? zPerformAccessibilityAction : m900k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* JADX INFO: renamed from: l */
    public void mo909l(View view, int i3) {
        this.f1303a.sendAccessibilityEvent(view, i3);
    }

    /* JADX INFO: renamed from: m */
    public void mo910m(View view, AccessibilityEvent accessibilityEvent) {
        this.f1303a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0273a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f1303a = accessibilityDelegate;
        this.f1304b = new a(this);
    }
}
