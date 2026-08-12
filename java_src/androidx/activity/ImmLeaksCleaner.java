package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC1126h;
import androidx.lifecycle.InterfaceC1130l;
import androidx.lifecycle.InterfaceC1132n;
import java.lang.reflect.Field;
import p035L1.AbstractC0376h;
import p035L1.InterfaceC0375g;
import p068W1.InterfaceC0566a;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;
import p071X1.AbstractC0607l;

/* JADX INFO: loaded from: classes.dex */
public final class ImmLeaksCleaner implements InterfaceC1130l {

    /* JADX INFO: renamed from: e */
    public static final C0684c f2400e = new C0684c(null);

    /* JADX INFO: renamed from: f */
    private static final InterfaceC0375g f2401f = AbstractC0376h.m1364a(C0683b.f2403e);

    /* JADX INFO: renamed from: d */
    private final Activity f2402d;

    /* JADX INFO: renamed from: androidx.activity.ImmLeaksCleaner$a */
    public static abstract class AbstractC0682a {
        public /* synthetic */ AbstractC0682a(AbstractC0602g abstractC0602g) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo2576a(InputMethodManager inputMethodManager);

        /* JADX INFO: renamed from: b */
        public abstract Object mo2577b(InputMethodManager inputMethodManager);

        /* JADX INFO: renamed from: c */
        public abstract View mo2578c(InputMethodManager inputMethodManager);

        private AbstractC0682a() {
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ImmLeaksCleaner$b */
    static final class C0683b extends AbstractC0607l implements InterfaceC0566a {

        /* JADX INFO: renamed from: e */
        public static final C0683b f2403e = new C0683b();

        C0683b() {
            super(0);
        }

        @Override // p068W1.InterfaceC0566a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final AbstractC0682a mo464a() {
            try {
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                declaredField3.setAccessible(true);
                AbstractC0606k.m2144d(declaredField3, "hField");
                AbstractC0606k.m2144d(declaredField, "servedViewField");
                AbstractC0606k.m2144d(declaredField2, "nextServedViewField");
                return new C0686e(declaredField3, declaredField, declaredField2);
            } catch (NoSuchFieldException unused) {
                return C0685d.f2404a;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ImmLeaksCleaner$c */
    public static final class C0684c {
        public /* synthetic */ C0684c(AbstractC0602g abstractC0602g) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC0682a m2580a() {
            return (AbstractC0682a) ImmLeaksCleaner.f2401f.getValue();
        }

        private C0684c() {
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ImmLeaksCleaner$d */
    public static final class C0685d extends AbstractC0682a {

        /* JADX INFO: renamed from: a */
        public static final C0685d f2404a = new C0685d();

        private C0685d() {
            super(null);
        }

        @Override // androidx.activity.ImmLeaksCleaner.AbstractC0682a
        /* JADX INFO: renamed from: a */
        public boolean mo2576a(InputMethodManager inputMethodManager) {
            AbstractC0606k.m2145e(inputMethodManager, "<this>");
            return false;
        }

        @Override // androidx.activity.ImmLeaksCleaner.AbstractC0682a
        /* JADX INFO: renamed from: b */
        public Object mo2577b(InputMethodManager inputMethodManager) {
            AbstractC0606k.m2145e(inputMethodManager, "<this>");
            return null;
        }

        @Override // androidx.activity.ImmLeaksCleaner.AbstractC0682a
        /* JADX INFO: renamed from: c */
        public View mo2578c(InputMethodManager inputMethodManager) {
            AbstractC0606k.m2145e(inputMethodManager, "<this>");
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ImmLeaksCleaner$e */
    public static final class C0686e extends AbstractC0682a {

        /* JADX INFO: renamed from: a */
        private final Field f2405a;

        /* JADX INFO: renamed from: b */
        private final Field f2406b;

        /* JADX INFO: renamed from: c */
        private final Field f2407c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0686e(Field field, Field field2, Field field3) {
            super(null);
            AbstractC0606k.m2145e(field, "hField");
            AbstractC0606k.m2145e(field2, "servedViewField");
            AbstractC0606k.m2145e(field3, "nextServedViewField");
            this.f2405a = field;
            this.f2406b = field2;
            this.f2407c = field3;
        }

        @Override // androidx.activity.ImmLeaksCleaner.AbstractC0682a
        /* JADX INFO: renamed from: a */
        public boolean mo2576a(InputMethodManager inputMethodManager) {
            AbstractC0606k.m2145e(inputMethodManager, "<this>");
            try {
                this.f2407c.set(inputMethodManager, null);
                return true;
            } catch (IllegalAccessException unused) {
                return false;
            }
        }

        @Override // androidx.activity.ImmLeaksCleaner.AbstractC0682a
        /* JADX INFO: renamed from: b */
        public Object mo2577b(InputMethodManager inputMethodManager) {
            AbstractC0606k.m2145e(inputMethodManager, "<this>");
            try {
                return this.f2405a.get(inputMethodManager);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.activity.ImmLeaksCleaner.AbstractC0682a
        /* JADX INFO: renamed from: c */
        public View mo2578c(InputMethodManager inputMethodManager) {
            AbstractC0606k.m2145e(inputMethodManager, "<this>");
            try {
                return (View) this.f2406b.get(inputMethodManager);
            } catch (ClassCastException | IllegalAccessException unused) {
                return null;
            }
        }
    }

    public ImmLeaksCleaner(Activity activity) {
        AbstractC0606k.m2145e(activity, "activity");
        this.f2402d = activity;
    }

    @Override // androidx.lifecycle.InterfaceC1130l
    /* JADX INFO: renamed from: d */
    public void mo2537d(InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar) {
        AbstractC0606k.m2145e(interfaceC1132n, "source");
        AbstractC0606k.m2145e(aVar, "event");
        if (aVar != AbstractC1126h.a.ON_DESTROY) {
            return;
        }
        Object systemService = this.f2402d.getSystemService("input_method");
        AbstractC0606k.m2143c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        AbstractC0682a abstractC0682aM2580a = f2400e.m2580a();
        Object objMo2577b = abstractC0682aM2580a.mo2577b(inputMethodManager);
        if (objMo2577b == null) {
            return;
        }
        synchronized (objMo2577b) {
            View viewMo2578c = abstractC0682aM2580a.mo2578c(inputMethodManager);
            if (viewMo2578c == null) {
                return;
            }
            if (viewMo2578c.isAttachedToWindow()) {
                return;
            }
            boolean zMo2576a = abstractC0682aM2580a.mo2576a(inputMethodManager);
            if (zMo2576a) {
                inputMethodManager.isActive();
            }
        }
    }
}
