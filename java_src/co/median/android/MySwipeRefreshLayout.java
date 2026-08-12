package co.median.android;

import android.content.Context;
import android.util.AttributeSet;
import co.median.android.widget.AbstractC1369b;

/* JADX INFO: loaded from: classes.dex */
public class MySwipeRefreshLayout extends AbstractC1369b {

    /* JADX INFO: renamed from: R */
    private InterfaceC1342a f6561R;

    /* JADX INFO: renamed from: co.median.android.MySwipeRefreshLayout$a */
    public interface InterfaceC1342a {
        /* JADX INFO: renamed from: a */
        boolean mo6978a();
    }

    public MySwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // co.median.android.widget.AbstractC1369b
    /* JADX INFO: renamed from: c */
    public boolean mo6977c() {
        InterfaceC1342a interfaceC1342a = this.f6561R;
        return interfaceC1342a != null ? interfaceC1342a.mo6978a() : super.mo6977c();
    }

    public void setCanChildScrollUpCallback(InterfaceC1342a interfaceC1342a) {
        this.f6561R = interfaceC1342a;
    }
}
