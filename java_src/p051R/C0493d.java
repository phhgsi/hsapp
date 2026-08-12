package p051R;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C1015f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: R.d */
/* JADX INFO: loaded from: classes.dex */
final class C0493d implements InputFilter {

    /* JADX INFO: renamed from: a */
    private final TextView f1712a;

    /* JADX INFO: renamed from: b */
    private C1015f.f f1713b;

    /* JADX INFO: renamed from: R.d$a */
    private static class a extends C1015f.f {

        /* JADX INFO: renamed from: a */
        private final Reference f1714a;

        /* JADX INFO: renamed from: b */
        private final Reference f1715b;

        a(TextView textView, C0493d c0493d) {
            this.f1714a = new WeakReference(textView);
            this.f1715b = new WeakReference(c0493d);
        }

        /* JADX INFO: renamed from: c */
        private boolean m1815c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.C1015f.f
        /* JADX INFO: renamed from: b */
        public void mo1816b() {
            CharSequence text;
            CharSequence charSequenceM4540p;
            super.mo1816b();
            TextView textView = (TextView) this.f1714a.get();
            if (m1815c(textView, (InputFilter) this.f1715b.get()) && textView.isAttachedToWindow() && text != (charSequenceM4540p = C1015f.m4527c().m4540p((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(charSequenceM4540p);
                int selectionEnd = Selection.getSelectionEnd(charSequenceM4540p);
                textView.setText(charSequenceM4540p);
                if (charSequenceM4540p instanceof Spannable) {
                    C0493d.m1814b((Spannable) charSequenceM4540p, selectionStart, selectionEnd);
                }
            }
        }
    }

    C0493d(TextView textView) {
        this.f1712a = textView;
    }

    /* JADX INFO: renamed from: a */
    private C1015f.f m1813a() {
        if (this.f1713b == null) {
            this.f1713b = new a(this.f1712a, this);
        }
        return this.f1713b;
    }

    /* JADX INFO: renamed from: b */
    static void m1814b(Spannable spannable, int i3, int i4) {
        if (i3 >= 0 && i4 >= 0) {
            Selection.setSelection(spannable, i3, i4);
        } else if (i3 >= 0) {
            Selection.setSelection(spannable, i3);
        } else if (i4 >= 0) {
            Selection.setSelection(spannable, i4);
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i3, int i4, Spanned spanned, int i5, int i6) {
        if (this.f1712a.isInEditMode()) {
            return charSequence;
        }
        int iM4535e = C1015f.m4527c().m4535e();
        if (iM4535e != 0) {
            if (iM4535e == 1) {
                if ((i6 == 0 && i5 == 0 && spanned.length() == 0 && charSequence == this.f1712a.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i3 != 0 || i4 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i3, i4);
                }
                return C1015f.m4527c().m4541q(charSequence, 0, charSequence.length());
            }
            if (iM4535e != 3) {
                return charSequence;
            }
        }
        C1015f.m4527c().m4544t(m1813a());
        return charSequence;
    }
}
