package p076Z0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: Z0.r */
/* JADX INFO: loaded from: classes.dex */
class C0647r extends AbstractC0645p {

    /* JADX INFO: renamed from: Z0.r$a */
    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (C0647r.this.f2304e.isEmpty()) {
                return;
            }
            outline.setPath(C0647r.this.f2304e);
        }
    }

    C0647r(View view) {
        m2444k(view);
    }

    /* JADX INFO: renamed from: k */
    private void m2444k(View view) {
        view.setOutlineProvider(new a());
    }

    @Override // p076Z0.AbstractC0645p
    /* JADX INFO: renamed from: b */
    void mo2431b(View view) {
        view.setClipToOutline(!mo2437i());
        if (mo2437i()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // p076Z0.AbstractC0645p
    /* JADX INFO: renamed from: i */
    boolean mo2437i() {
        return this.f2300a;
    }
}
