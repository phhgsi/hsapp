package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogInterfaceC0747c;
import androidx.appcompat.view.menu.InterfaceC0791j;
import p091d.AbstractC1766g;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.f */
/* JADX INFO: loaded from: classes.dex */
class DialogInterfaceOnKeyListenerC0787f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0791j.a {

    /* JADX INFO: renamed from: a */
    private C0786e f3012a;

    /* JADX INFO: renamed from: b */
    private DialogInterfaceC0747c f3013b;

    /* JADX INFO: renamed from: c */
    C0784c f3014c;

    /* JADX INFO: renamed from: d */
    private InterfaceC0791j.a f3015d;

    public DialogInterfaceOnKeyListenerC0787f(C0786e c0786e) {
        this.f3012a = c0786e;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j.a
    /* JADX INFO: renamed from: a */
    public void mo2717a(C0786e c0786e, boolean z2) {
        if (z2 || c0786e == this.f3012a) {
            m3174c();
        }
        InterfaceC0791j.a aVar = this.f3015d;
        if (aVar != null) {
            aVar.mo2717a(c0786e, z2);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j.a
    /* JADX INFO: renamed from: b */
    public boolean mo2718b(C0786e c0786e) {
        InterfaceC0791j.a aVar = this.f3015d;
        if (aVar != null) {
            return aVar.mo2718b(c0786e);
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public void m3174c() {
        DialogInterfaceC0747c dialogInterfaceC0747c = this.f3013b;
        if (dialogInterfaceC0747c != null) {
            dialogInterfaceC0747c.dismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m3175d(IBinder iBinder) {
        C0786e c0786e = this.f3012a;
        DialogInterfaceC0747c.a aVar = new DialogInterfaceC0747c.a(c0786e.m3170w());
        C0784c c0784c = new C0784c(aVar.m2788b(), AbstractC1766g.f8844j);
        this.f3014c = c0784c;
        c0784c.mo3071n(this);
        this.f3012a.m3149b(this.f3014c);
        aVar.mo1733c(this.f3014c.m3103c(), this);
        View viewM3123A = c0786e.m3123A();
        if (viewM3123A != null) {
            aVar.mo1734d(viewM3123A);
        } else {
            aVar.mo1735e(c0786e.m3172y()).mo1738l(c0786e.m3173z());
        }
        aVar.mo1736i(this);
        DialogInterfaceC0747c dialogInterfaceC0747cMo1732a = aVar.mo1732a();
        this.f3013b = dialogInterfaceC0747cMo1732a;
        dialogInterfaceC0747cMo1732a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f3013b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f3013b.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i3) {
        this.f3012a.m3136O((C0788g) this.f3014c.m3103c().getItem(i3), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f3014c.mo3061a(this.f3012a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i3 == 82 || i3 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f3013b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f3013b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f3012a.m3154e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f3012a.performShortcut(i3, keyEvent, 0);
    }
}
