package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC1111L;
import androidx.lifecycle.AbstractC1126h;
import androidx.lifecycle.C1133o;
import androidx.lifecycle.InterfaceC1132n;
import androidx.savedstate.C1240a;
import p071X1.AbstractC0606k;
import p100f0.AbstractC1891e;
import p100f0.C1889c;
import p100f0.InterfaceC1890d;

/* JADX INFO: renamed from: androidx.activity.q */
/* JADX INFO: loaded from: classes.dex */
public class DialogC0717q extends Dialog implements InterfaceC1132n, InterfaceC0681I, InterfaceC1890d {

    /* JADX INFO: renamed from: a */
    private C1133o f2466a;

    /* JADX INFO: renamed from: b */
    private final C1889c f2467b;

    /* JADX INFO: renamed from: c */
    private final OnBackPressedDispatcher f2468c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC0717q(Context context, int i3) {
        super(context, i3);
        AbstractC0606k.m2145e(context, "context");
        this.f2467b = C1889c.f9393d.m9774a(this);
        this.f2468c = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.p
            @Override // java.lang.Runnable
            public final void run() {
                DialogC0717q.m2633e(this.f2465d);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    private final C1133o m2632b() {
        C1133o c1133o = this.f2466a;
        if (c1133o != null) {
            return c1133o;
        }
        C1133o c1133o2 = new C1133o(this);
        this.f2466a = c1133o2;
        return c1133o2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final void m2633e(DialogC0717q dialogC0717q) {
        AbstractC0606k.m2145e(dialogC0717q, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC0606k.m2145e(view, "view");
        m2634d();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.activity.InterfaceC0681I
    /* JADX INFO: renamed from: c */
    public final OnBackPressedDispatcher mo2527c() {
        return this.f2468c;
    }

    /* JADX INFO: renamed from: d */
    public void m2634d() {
        Window window = getWindow();
        AbstractC0606k.m2142b(window);
        View decorView = window.getDecorView();
        AbstractC0606k.m2144d(decorView, "window!!.decorView");
        AbstractC1111L.m5091a(decorView, this);
        Window window2 = getWindow();
        AbstractC0606k.m2142b(window2);
        View decorView2 = window2.getDecorView();
        AbstractC0606k.m2144d(decorView2, "window!!.decorView");
        AbstractC0690M.m2591a(decorView2, this);
        Window window3 = getWindow();
        AbstractC0606k.m2142b(window3);
        View decorView3 = window3.getDecorView();
        AbstractC0606k.m2144d(decorView3, "window!!.decorView");
        AbstractC1891e.m9775a(decorView3, this);
    }

    @Override // androidx.lifecycle.InterfaceC1132n
    public AbstractC1126h getLifecycle() {
        return m2632b();
    }

    @Override // p100f0.InterfaceC1890d
    public C1240a getSavedStateRegistry() {
        return this.f2467b.m9770b();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f2468c.m2607l();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f2468c;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC0606k.m2144d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            onBackPressedDispatcher.m2608o(onBackInvokedDispatcher);
        }
        this.f2467b.m9772d(bundle);
        m2632b().m5152h(AbstractC1126h.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        AbstractC0606k.m2144d(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f2467b.m9773e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        m2632b().m5152h(AbstractC1126h.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        m2632b().m5152h(AbstractC1126h.a.ON_DESTROY);
        this.f2466a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i3) {
        m2634d();
        super.setContentView(i3);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        AbstractC0606k.m2145e(view, "view");
        m2634d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC0606k.m2145e(view, "view");
        m2634d();
        super.setContentView(view, layoutParams);
    }
}
