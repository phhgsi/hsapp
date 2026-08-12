package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.DialogC0717q;
import androidx.appcompat.view.AbstractC0772b;
import p027J.AbstractC0311t;
import p091d.AbstractC1760a;

/* JADX INFO: renamed from: androidx.appcompat.app.y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogC0769y extends DialogC0717q implements InterfaceC0749e {

    /* JADX INFO: renamed from: d */
    private AbstractC0751g f2801d;

    /* JADX INFO: renamed from: e */
    private final AbstractC0311t.a f2802e;

    public AbstractDialogC0769y(Context context, int i3) {
        super(context, m2971h(context, i3));
        this.f2802e = new AbstractC0311t.a() { // from class: androidx.appcompat.app.x
            @Override // p027J.AbstractC0311t.a
            /* JADX INFO: renamed from: e */
            public final boolean mo1061e(KeyEvent keyEvent) {
                return this.f2800a.m2973i(keyEvent);
            }
        };
        AbstractC0751g abstractC0751gM2972f = m2972f();
        abstractC0751gM2972f.mo2840Q(m2971h(context, i3));
        abstractC0751gM2972f.mo2855z(null);
    }

    /* JADX INFO: renamed from: h */
    private static int m2971h(Context context, int i3) {
        if (i3 != 0) {
            return i3;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC1760a.f8724y, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.DialogC0717q, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2634d();
        m2972f().mo2842e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        m2972f().mo2828A();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC0311t.m1059e(this.f2802e, getWindow().getDecorView(), this, keyEvent);
    }

    /* JADX INFO: renamed from: f */
    public AbstractC0751g m2972f() {
        if (this.f2801d == null) {
            this.f2801d = AbstractC0751g.m2822k(this, this);
        }
        return this.f2801d;
    }

    @Override // android.app.Dialog
    public View findViewById(int i3) {
        return m2972f().mo2846l(i3);
    }

    @Override // androidx.appcompat.app.InterfaceC0749e
    /* JADX INFO: renamed from: g */
    public void mo2797g(AbstractC0772b abstractC0772b) {
    }

    /* JADX INFO: renamed from: i */
    boolean m2973i(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m2972f().mo2853w();
    }

    /* JADX INFO: renamed from: j */
    public boolean m2974j(int i3) {
        return m2972f().mo2834I(i3);
    }

    @Override // androidx.appcompat.app.InterfaceC0749e
    /* JADX INFO: renamed from: o */
    public void mo2802o(AbstractC0772b abstractC0772b) {
    }

    @Override // androidx.activity.DialogC0717q, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        m2972f().mo2852v();
        super.onCreate(bundle);
        m2972f().mo2855z(bundle);
    }

    @Override // androidx.activity.DialogC0717q, android.app.Dialog
    protected void onStop() {
        super.onStop();
        m2972f().mo2833F();
    }

    @Override // androidx.activity.DialogC0717q, android.app.Dialog
    public void setContentView(int i3) {
        m2634d();
        m2972f().mo2835K(i3);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m2972f().mo2841R(charSequence);
    }

    @Override // androidx.appcompat.app.InterfaceC0749e
    /* JADX INFO: renamed from: u */
    public AbstractC0772b mo2809u(AbstractC0772b.a aVar) {
        return null;
    }

    @Override // androidx.activity.DialogC0717q, android.app.Dialog
    public void setContentView(View view) {
        m2634d();
        m2972f().mo2836L(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i3) {
        super.setTitle(i3);
        m2972f().mo2841R(getContext().getString(i3));
    }

    @Override // androidx.activity.DialogC0717q, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2634d();
        m2972f().mo2837M(view, layoutParams);
    }
}
