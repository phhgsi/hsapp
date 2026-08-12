package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: renamed from: androidx.transition.A */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1242A {

    /* JADX INFO: renamed from: a */
    private static final AbstractC1245D f6055a;

    /* JADX INFO: renamed from: b */
    static final Property f6056b;

    /* JADX INFO: renamed from: c */
    static final Property f6057c;

    /* JADX INFO: renamed from: androidx.transition.A$a */
    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(AbstractC1242A.m6305b(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f3) {
            AbstractC1242A.m6308e(view, f3.floatValue());
        }
    }

    /* JADX INFO: renamed from: androidx.transition.A$b */
    class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f6055a = new C1254M();
        } else {
            f6055a = new C1253L();
        }
        f6056b = new a(Float.class, "translationAlpha");
        f6057c = new b(Rect.class, "clipBounds");
    }

    /* JADX INFO: renamed from: a */
    static void m6304a(View view) {
        f6055a.m6318a(view);
    }

    /* JADX INFO: renamed from: b */
    static float m6305b(View view) {
        return f6055a.mo6319b(view);
    }

    /* JADX INFO: renamed from: c */
    static void m6306c(View view) {
        f6055a.m6320c(view);
    }

    /* JADX INFO: renamed from: d */
    static void m6307d(View view, int i3, int i4, int i5, int i6) {
        f6055a.mo6321d(view, i3, i4, i5, i6);
    }

    /* JADX INFO: renamed from: e */
    static void m6308e(View view, float f3) {
        f6055a.mo6322e(view, f3);
    }

    /* JADX INFO: renamed from: f */
    static void m6309f(View view, int i3) {
        f6055a.mo6323f(view, i3);
    }

    /* JADX INFO: renamed from: g */
    static void m6310g(View view, Matrix matrix) {
        f6055a.mo6324g(view, matrix);
    }

    /* JADX INFO: renamed from: h */
    static void m6311h(View view, Matrix matrix) {
        f6055a.mo6325h(view, matrix);
    }
}
