package p051R;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.C1015f;

/* JADX INFO: renamed from: R.c */
/* JADX INFO: loaded from: classes.dex */
final class C0492c extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    private final TextView f1710a;

    /* JADX INFO: renamed from: b */
    private final a f1711b;

    /* JADX INFO: renamed from: R.c$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public boolean m1811a(InputConnection inputConnection, Editable editable, int i3, int i4, boolean z2) {
            return C1015f.m4528f(inputConnection, editable, i3, i4, z2);
        }

        /* JADX INFO: renamed from: b */
        public void m1812b(EditorInfo editorInfo) {
            if (C1015f.m4531i()) {
                C1015f.m4527c().m4546v(editorInfo);
            }
        }
    }

    C0492c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    /* JADX INFO: renamed from: a */
    private Editable m1810a() {
        return this.f1710a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i3, int i4) {
        return this.f1711b.m1811a(this, m1810a(), i3, i4, false) || super.deleteSurroundingText(i3, i4);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i3, int i4) {
        return this.f1711b.m1811a(this, m1810a(), i3, i4, true) || super.deleteSurroundingTextInCodePoints(i3, i4);
    }

    C0492c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, a aVar) {
        super(inputConnection, false);
        this.f1710a = textView;
        this.f1711b = aVar;
        aVar.m1812b(editorInfo);
    }
}
