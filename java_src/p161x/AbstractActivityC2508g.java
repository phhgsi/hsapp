package p161x;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.collection.C0929i;
import androidx.lifecycle.AbstractC1126h;
import androidx.lifecycle.C1133o;
import androidx.lifecycle.FragmentC1141w;
import androidx.lifecycle.InterfaceC1132n;
import p027J.AbstractC0311t;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: x.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC2508g extends Activity implements InterfaceC1132n, AbstractC0311t.a {

    /* JADX INFO: renamed from: a */
    private final C0929i f11695a = new C0929i(0, 1, null);

    /* JADX INFO: renamed from: b */
    private final C1133o f11696b = new C1133o(this);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        if (r4.equals("--list-dumpables") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0043, code lost:
    
        if (r4.equals("--dump-dumpable") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
    
        return false;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m11920w(java.lang.String[] r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L5e
            int r1 = r4.length
            if (r1 != 0) goto L7
            goto L5e
        L7:
            r4 = r4[r0]
            int r1 = r4.hashCode()
            r2 = 1
            switch(r1) {
                case -645125871: goto L4e;
                case 100470631: goto L3d;
                case 472614934: goto L34;
                case 1159329357: goto L23;
                case 1455016274: goto L12;
                default: goto L11;
            }
        L11:
            goto L5e
        L12:
            java.lang.String r1 = "--autofill"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L1b
            goto L5e
        L1b:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r4 < r1) goto L22
            return r2
        L22:
            return r0
        L23:
            java.lang.String r1 = "--contentcapture"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L2c
            goto L5e
        L2c:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r4 < r1) goto L33
            return r2
        L33:
            return r0
        L34:
            java.lang.String r1 = "--list-dumpables"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L46
            goto L5e
        L3d:
            java.lang.String r1 = "--dump-dumpable"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L46
            goto L5e
        L46:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r4 < r1) goto L4d
            return r2
        L4d:
            return r0
        L4e:
            java.lang.String r1 = "--translation"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L57
            goto L5e
        L57:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r4 < r1) goto L5e
            return r2
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p161x.AbstractActivityC2508g.m11920w(java.lang.String[]):boolean");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC0606k.m2145e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC0606k.m2144d(decorView, "getDecorView(...)");
        if (AbstractC0311t.m1058d(decorView, keyEvent)) {
            return true;
        }
        return AbstractC0311t.m1059e(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        AbstractC0606k.m2145e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC0606k.m2144d(decorView, "getDecorView(...)");
        if (AbstractC0311t.m1058d(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // p027J.AbstractC0311t.a
    /* JADX INFO: renamed from: e */
    public boolean mo1061e(KeyEvent keyEvent) {
        AbstractC0606k.m2145e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    public AbstractC1126h getLifecycle() {
        return this.f11696b;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC1141w.f5379b.m5185c(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        AbstractC0606k.m2145e(bundle, "outState");
        this.f11696b.m5153m(AbstractC1126h.b.CREATED);
        super.onSaveInstanceState(bundle);
    }

    /* JADX INFO: renamed from: v */
    protected final boolean m11921v(String[] strArr) {
        return !m11920w(strArr);
    }
}
