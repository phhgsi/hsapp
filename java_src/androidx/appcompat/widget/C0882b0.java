package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.widget.b0 */
/* JADX INFO: loaded from: classes.dex */
public class C0882b0 extends ContextWrapper {

    /* JADX INFO: renamed from: c */
    private static final Object f3632c = new Object();

    /* JADX INFO: renamed from: d */
    private static ArrayList f3633d;

    /* JADX INFO: renamed from: a */
    private final Resources f3634a;

    /* JADX INFO: renamed from: b */
    private final Resources.Theme f3635b;

    private C0882b0(Context context) {
        super(context);
        if (!C0908o0.m3864d()) {
            this.f3634a = new C0886d0(this, context.getResources());
            this.f3635b = null;
            return;
        }
        C0908o0 c0908o0 = new C0908o0(this, context.getResources());
        this.f3634a = c0908o0;
        Resources.Theme themeNewTheme = c0908o0.newTheme();
        this.f3635b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    /* JADX INFO: renamed from: a */
    private static boolean m3748a(Context context) {
        return ((context instanceof C0882b0) || (context.getResources() instanceof C0886d0) || (context.getResources() instanceof C0908o0) || !C0908o0.m3864d()) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static Context m3749b(Context context) {
        if (!m3748a(context)) {
            return context;
        }
        synchronized (f3632c) {
            try {
                ArrayList arrayList = f3633d;
                if (arrayList == null) {
                    f3633d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f3633d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f3633d.remove(size);
                        }
                    }
                    for (int size2 = f3633d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f3633d.get(size2);
                        C0882b0 c0882b0 = weakReference2 != null ? (C0882b0) weakReference2.get() : null;
                        if (c0882b0 != null && c0882b0.getBaseContext() == context) {
                            return c0882b0;
                        }
                    }
                }
                C0882b0 c0882b02 = new C0882b0(context);
                f3633d.add(new WeakReference(c0882b02));
                return c0882b02;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f3634a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f3634a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f3635b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i3) {
        Resources.Theme theme = this.f3635b;
        if (theme == null) {
            super.setTheme(i3);
        } else {
            theme.applyStyle(i3, true);
        }
    }
}
