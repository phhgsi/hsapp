package p051R;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.android.gms.common.api.Api;
import p024I.AbstractC0211h;

/* JADX INFO: renamed from: R.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0490a {

    /* JADX INFO: renamed from: a */
    private final b f1702a;

    /* JADX INFO: renamed from: b */
    private int f1703b = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: c */
    private int f1704c = 0;

    /* JADX INFO: renamed from: R.a$a */
    private static class a extends b {

        /* JADX INFO: renamed from: a */
        private final EditText f1705a;

        /* JADX INFO: renamed from: b */
        private final C0496g f1706b;

        a(EditText editText, boolean z2) {
            this.f1705a = editText;
            C0496g c0496g = new C0496g(editText, z2);
            this.f1706b = c0496g;
            editText.addTextChangedListener(c0496g);
            editText.setEditableFactory(C0491b.getInstance());
        }

        @Override // p051R.C0490a.b
        /* JADX INFO: renamed from: a */
        KeyListener mo1807a(KeyListener keyListener) {
            if (keyListener instanceof C0494e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new C0494e(keyListener);
        }

        @Override // p051R.C0490a.b
        /* JADX INFO: renamed from: b */
        InputConnection mo1808b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof C0492c ? inputConnection : new C0492c(this.f1705a, inputConnection, editorInfo);
        }

        @Override // p051R.C0490a.b
        /* JADX INFO: renamed from: c */
        void mo1809c(boolean z2) {
            this.f1706b.m1840c(z2);
        }
    }

    /* JADX INFO: renamed from: R.a$b */
    static class b {
        b() {
        }

        /* JADX INFO: renamed from: a */
        abstract KeyListener mo1807a(KeyListener keyListener);

        /* JADX INFO: renamed from: b */
        abstract InputConnection mo1808b(InputConnection inputConnection, EditorInfo editorInfo);

        /* JADX INFO: renamed from: c */
        abstract void mo1809c(boolean z2);
    }

    public C0490a(EditText editText, boolean z2) {
        AbstractC0211h.m611h(editText, "editText cannot be null");
        this.f1702a = new a(editText, z2);
    }

    /* JADX INFO: renamed from: a */
    public KeyListener m1804a(KeyListener keyListener) {
        return this.f1702a.mo1807a(keyListener);
    }

    /* JADX INFO: renamed from: b */
    public InputConnection m1805b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f1702a.mo1808b(inputConnection, editorInfo);
    }

    /* JADX INFO: renamed from: c */
    public void m1806c(boolean z2) {
        this.f1702a.mo1809c(z2);
    }
}
