package p051R;

import android.text.Editable;
import androidx.emoji2.text.C1024o;

/* JADX INFO: renamed from: R.b */
/* JADX INFO: loaded from: classes.dex */
final class C0491b extends Editable.Factory {

    /* JADX INFO: renamed from: a */
    private static final Object f1707a = new Object();

    /* JADX INFO: renamed from: b */
    private static volatile Editable.Factory f1708b;

    /* JADX INFO: renamed from: c */
    private static Class f1709c;

    private C0491b() {
        try {
            f1709c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C0491b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f1708b == null) {
            synchronized (f1707a) {
                try {
                    if (f1708b == null) {
                        f1708b = new C0491b();
                    }
                } finally {
                }
            }
        }
        return f1708b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f1709c;
        return cls != null ? C1024o.m4612c(cls, charSequence) : super.newEditable(charSequence);
    }
}
