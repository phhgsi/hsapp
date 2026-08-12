package p051R;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C1015f;
import com.google.android.gms.common.api.Api;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: R.g */
/* JADX INFO: loaded from: classes.dex */
final class C0496g implements TextWatcher {

    /* JADX INFO: renamed from: a */
    private final EditText f1723a;

    /* JADX INFO: renamed from: b */
    private final boolean f1724b;

    /* JADX INFO: renamed from: c */
    private C1015f.f f1725c;

    /* JADX INFO: renamed from: d */
    private int f1726d = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: e */
    private int f1727e = 0;

    /* JADX INFO: renamed from: f */
    private boolean f1728f = true;

    /* JADX INFO: renamed from: R.g$a */
    private static class a extends C1015f.f {

        /* JADX INFO: renamed from: a */
        private final Reference f1729a;

        a(EditText editText) {
            this.f1729a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.C1015f.f
        /* JADX INFO: renamed from: b */
        public void mo1816b() {
            super.mo1816b();
            C0496g.m1838b((EditText) this.f1729a.get(), 1);
        }
    }

    C0496g(EditText editText, boolean z2) {
        this.f1723a = editText;
        this.f1724b = z2;
    }

    /* JADX INFO: renamed from: a */
    private C1015f.f m1837a() {
        if (this.f1725c == null) {
            this.f1725c = new a(this.f1723a);
        }
        return this.f1725c;
    }

    /* JADX INFO: renamed from: b */
    static void m1838b(EditText editText, int i3) {
        if (i3 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C1015f.m4527c().m4540p(editableText);
            C0493d.m1814b(editableText, selectionStart, selectionEnd);
        }
    }

    /* JADX INFO: renamed from: d */
    private boolean m1839d() {
        if (this.f1728f) {
            return (this.f1724b || C1015f.m4531i()) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m1840c(boolean z2) {
        if (this.f1728f != z2) {
            if (this.f1725c != null) {
                C1015f.m4527c().m4545u(this.f1725c);
            }
            this.f1728f = z2;
            if (z2) {
                m1838b(this.f1723a, C1015f.m4527c().m4535e());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        if (this.f1723a.isInEditMode() || m1839d() || i4 > i5 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iM4535e = C1015f.m4527c().m4535e();
        if (iM4535e != 0) {
            if (iM4535e == 1) {
                C1015f.m4527c().m4543s((Spannable) charSequence, i3, i3 + i5, this.f1726d, this.f1727e);
                return;
            } else if (iM4535e != 3) {
                return;
            }
        }
        C1015f.m4527c().m4544t(m1837a());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
    }
}
