package p051R;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.C1015f;
import p024I.AbstractC0211h;

/* JADX INFO: renamed from: R.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0495f {

    /* JADX INFO: renamed from: a */
    private final b f1718a;

    /* JADX INFO: renamed from: R.f$a */
    private static class a extends b {

        /* JADX INFO: renamed from: a */
        private final TextView f1719a;

        /* JADX INFO: renamed from: b */
        private final C0493d f1720b;

        /* JADX INFO: renamed from: c */
        private boolean f1721c = true;

        a(TextView textView) {
            this.f1719a = textView;
            this.f1720b = new C0493d(textView);
        }

        /* JADX INFO: renamed from: f */
        private InputFilter[] m1823f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f1720b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f1720b;
            return inputFilterArr2;
        }

        /* JADX INFO: renamed from: g */
        private SparseArray m1824g(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i3 = 0; i3 < inputFilterArr.length; i3++) {
                InputFilter inputFilter = inputFilterArr[i3];
                if (inputFilter instanceof C0493d) {
                    sparseArray.put(i3, inputFilter);
                }
            }
            return sparseArray;
        }

        /* JADX INFO: renamed from: h */
        private InputFilter[] m1825h(InputFilter[] inputFilterArr) {
            SparseArray sparseArrayM1824g = m1824g(inputFilterArr);
            if (sparseArrayM1824g.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayM1824g.size()];
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                if (sparseArrayM1824g.indexOfKey(i4) < 0) {
                    inputFilterArr2[i3] = inputFilterArr[i4];
                    i3++;
                }
            }
            return inputFilterArr2;
        }

        /* JADX INFO: renamed from: j */
        private TransformationMethod m1826j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof C0497h ? ((C0497h) transformationMethod).m1841a() : transformationMethod;
        }

        /* JADX INFO: renamed from: k */
        private void m1827k() {
            this.f1719a.setFilters(mo1829a(this.f1719a.getFilters()));
        }

        /* JADX INFO: renamed from: m */
        private TransformationMethod m1828m(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof C0497h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C0497h(transformationMethod);
        }

        @Override // p051R.C0495f.b
        /* JADX INFO: renamed from: a */
        InputFilter[] mo1829a(InputFilter[] inputFilterArr) {
            return !this.f1721c ? m1825h(inputFilterArr) : m1823f(inputFilterArr);
        }

        @Override // p051R.C0495f.b
        /* JADX INFO: renamed from: b */
        public boolean mo1830b() {
            return this.f1721c;
        }

        @Override // p051R.C0495f.b
        /* JADX INFO: renamed from: c */
        void mo1831c(boolean z2) {
            if (z2) {
                m1835l();
            }
        }

        @Override // p051R.C0495f.b
        /* JADX INFO: renamed from: d */
        void mo1832d(boolean z2) {
            this.f1721c = z2;
            m1835l();
            m1827k();
        }

        @Override // p051R.C0495f.b
        /* JADX INFO: renamed from: e */
        TransformationMethod mo1833e(TransformationMethod transformationMethod) {
            return this.f1721c ? m1828m(transformationMethod) : m1826j(transformationMethod);
        }

        /* JADX INFO: renamed from: i */
        void m1834i(boolean z2) {
            this.f1721c = z2;
        }

        /* JADX INFO: renamed from: l */
        void m1835l() {
            this.f1719a.setTransformationMethod(mo1833e(this.f1719a.getTransformationMethod()));
        }
    }

    /* JADX INFO: renamed from: R.f$b */
    static class b {
        b() {
        }

        /* JADX INFO: renamed from: a */
        abstract InputFilter[] mo1829a(InputFilter[] inputFilterArr);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo1830b();

        /* JADX INFO: renamed from: c */
        abstract void mo1831c(boolean z2);

        /* JADX INFO: renamed from: d */
        abstract void mo1832d(boolean z2);

        /* JADX INFO: renamed from: e */
        abstract TransformationMethod mo1833e(TransformationMethod transformationMethod);
    }

    /* JADX INFO: renamed from: R.f$c */
    private static class c extends b {

        /* JADX INFO: renamed from: a */
        private final a f1722a;

        c(TextView textView) {
            this.f1722a = new a(textView);
        }

        /* JADX INFO: renamed from: f */
        private boolean m1836f() {
            return !C1015f.m4531i();
        }

        @Override // p051R.C0495f.b
        /* JADX INFO: renamed from: a */
        InputFilter[] mo1829a(InputFilter[] inputFilterArr) {
            return m1836f() ? inputFilterArr : this.f1722a.mo1829a(inputFilterArr);
        }

        @Override // p051R.C0495f.b
        /* JADX INFO: renamed from: b */
        public boolean mo1830b() {
            return this.f1722a.mo1830b();
        }

        @Override // p051R.C0495f.b
        /* JADX INFO: renamed from: c */
        void mo1831c(boolean z2) {
            if (m1836f()) {
                return;
            }
            this.f1722a.mo1831c(z2);
        }

        @Override // p051R.C0495f.b
        /* JADX INFO: renamed from: d */
        void mo1832d(boolean z2) {
            if (m1836f()) {
                this.f1722a.m1834i(z2);
            } else {
                this.f1722a.mo1832d(z2);
            }
        }

        @Override // p051R.C0495f.b
        /* JADX INFO: renamed from: e */
        TransformationMethod mo1833e(TransformationMethod transformationMethod) {
            return m1836f() ? transformationMethod : this.f1722a.mo1833e(transformationMethod);
        }
    }

    public C0495f(TextView textView, boolean z2) {
        AbstractC0211h.m611h(textView, "textView cannot be null");
        if (z2) {
            this.f1718a = new a(textView);
        } else {
            this.f1718a = new c(textView);
        }
    }

    /* JADX INFO: renamed from: a */
    public InputFilter[] m1818a(InputFilter[] inputFilterArr) {
        return this.f1718a.mo1829a(inputFilterArr);
    }

    /* JADX INFO: renamed from: b */
    public boolean m1819b() {
        return this.f1718a.mo1830b();
    }

    /* JADX INFO: renamed from: c */
    public void m1820c(boolean z2) {
        this.f1718a.mo1831c(z2);
    }

    /* JADX INFO: renamed from: d */
    public void m1821d(boolean z2) {
        this.f1718a.mo1832d(z2);
    }

    /* JADX INFO: renamed from: e */
    public TransformationMethod m1822e(TransformationMethod transformationMethod) {
        return this.f1718a.mo1833e(transformationMethod);
    }
}
