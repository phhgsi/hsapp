package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import p091d.AbstractC1760a;

/* JADX INFO: renamed from: androidx.appcompat.app.c */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceC0747c extends AbstractDialogC0769y implements DialogInterface {

    /* JADX INFO: renamed from: f */
    final AlertController f2676f;

    /* JADX INFO: renamed from: androidx.appcompat.app.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final AlertController.C0734b f2677a;

        /* JADX INFO: renamed from: b */
        private final int f2678b;

        public a(Context context) {
            this(context, DialogInterfaceC0747c.m2786l(context, 0));
        }

        /* JADX INFO: renamed from: a */
        public DialogInterfaceC0747c mo1732a() {
            DialogInterfaceC0747c dialogInterfaceC0747c = new DialogInterfaceC0747c(this.f2677a.f2547a, this.f2678b);
            this.f2677a.m2682a(dialogInterfaceC0747c.f2676f);
            dialogInterfaceC0747c.setCancelable(this.f2677a.f2564r);
            if (this.f2677a.f2564r) {
                dialogInterfaceC0747c.setCanceledOnTouchOutside(true);
            }
            dialogInterfaceC0747c.setOnCancelListener(this.f2677a.f2565s);
            dialogInterfaceC0747c.setOnDismissListener(this.f2677a.f2566t);
            DialogInterface.OnKeyListener onKeyListener = this.f2677a.f2567u;
            if (onKeyListener != null) {
                dialogInterfaceC0747c.setOnKeyListener(onKeyListener);
            }
            return dialogInterfaceC0747c;
        }

        /* JADX INFO: renamed from: b */
        public Context m2788b() {
            return this.f2677a.f2547a;
        }

        /* JADX INFO: renamed from: c */
        public a mo1733c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0734b c0734b = this.f2677a;
            c0734b.f2569w = listAdapter;
            c0734b.f2570x = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a mo1734d(View view) {
            this.f2677a.f2553g = view;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a mo1735e(Drawable drawable) {
            this.f2677a.f2550d = drawable;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m2789f(CharSequence charSequence) {
            this.f2677a.f2554h = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public a m2790g(int i3, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0734b c0734b = this.f2677a;
            c0734b.f2558l = c0734b.f2547a.getText(i3);
            this.f2677a.f2560n = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public a m2791h(DialogInterface.OnDismissListener onDismissListener) {
            this.f2677a.f2566t = onDismissListener;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public a mo1736i(DialogInterface.OnKeyListener onKeyListener) {
            this.f2677a.f2567u = onKeyListener;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public a m2792j(int i3, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0734b c0734b = this.f2677a;
            c0734b.f2555i = c0734b.f2547a.getText(i3);
            this.f2677a.f2557k = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public a mo1737k(ListAdapter listAdapter, int i3, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0734b c0734b = this.f2677a;
            c0734b.f2569w = listAdapter;
            c0734b.f2570x = onClickListener;
            c0734b.f2540I = i3;
            c0734b.f2539H = true;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public a mo1738l(CharSequence charSequence) {
            this.f2677a.f2552f = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public a m2793m(View view) {
            AlertController.C0734b c0734b = this.f2677a;
            c0734b.f2572z = view;
            c0734b.f2571y = 0;
            c0734b.f2536E = false;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public DialogInterfaceC0747c m2794n() {
            DialogInterfaceC0747c dialogInterfaceC0747cMo1732a = mo1732a();
            dialogInterfaceC0747cMo1732a.show();
            return dialogInterfaceC0747cMo1732a;
        }

        public a(Context context, int i3) {
            this.f2677a = new AlertController.C0734b(new ContextThemeWrapper(context, DialogInterfaceC0747c.m2786l(context, i3)));
            this.f2678b = i3;
        }
    }

    protected DialogInterfaceC0747c(Context context, int i3) {
        super(context, m2786l(context, i3));
        this.f2676f = new AlertController(getContext(), this, getWindow());
    }

    /* JADX INFO: renamed from: l */
    static int m2786l(Context context, int i3) {
        if (((i3 >>> 24) & 255) >= 1) {
            return i3;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC1760a.f8711l, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX INFO: renamed from: k */
    public ListView m2787k() {
        return this.f2676f.m2667d();
    }

    @Override // androidx.appcompat.app.AbstractDialogC0769y, androidx.activity.DialogC0717q, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2676f.m2668e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i3, KeyEvent keyEvent) {
        if (this.f2676f.m2669f(i3, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i3, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i3, KeyEvent keyEvent) {
        if (this.f2676f.m2670g(i3, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i3, keyEvent);
    }

    @Override // androidx.appcompat.app.AbstractDialogC0769y, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f2676f.m2676p(charSequence);
    }
}
