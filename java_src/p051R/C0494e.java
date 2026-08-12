package p051R;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.C1015f;

/* JADX INFO: renamed from: R.e */
/* JADX INFO: loaded from: classes.dex */
final class C0494e implements KeyListener {

    /* JADX INFO: renamed from: a */
    private final KeyListener f1716a;

    /* JADX INFO: renamed from: b */
    private final a f1717b;

    /* JADX INFO: renamed from: R.e$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public boolean m1817a(Editable editable, int i3, KeyEvent keyEvent) {
            return C1015f.m4529g(editable, i3, keyEvent);
        }
    }

    C0494e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i3) {
        this.f1716a.clearMetaKeyState(view, editable, i3);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f1716a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i3, KeyEvent keyEvent) {
        return this.f1717b.m1817a(editable, i3, keyEvent) || this.f1716a.onKeyDown(view, editable, i3, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f1716a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i3, KeyEvent keyEvent) {
        return this.f1716a.onKeyUp(view, editable, i3, keyEvent);
    }

    C0494e(KeyListener keyListener, a aVar) {
        this.f1716a = keyListener;
        this.f1717b = aVar;
    }
}
