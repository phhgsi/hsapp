package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import p091d.AbstractC1768i;

/* JADX INFO: renamed from: androidx.appcompat.view.d */
/* JADX INFO: loaded from: classes.dex */
public class C0774d extends ContextWrapper {

    /* JADX INFO: renamed from: f */
    private static Configuration f2818f;

    /* JADX INFO: renamed from: a */
    private int f2819a;

    /* JADX INFO: renamed from: b */
    private Resources.Theme f2820b;

    /* JADX INFO: renamed from: c */
    private LayoutInflater f2821c;

    /* JADX INFO: renamed from: d */
    private Configuration f2822d;

    /* JADX INFO: renamed from: e */
    private Resources f2823e;

    public C0774d(Context context, int i3) {
        super(context);
        this.f2819a = i3;
    }

    /* JADX INFO: renamed from: b */
    private Resources m3009b() {
        if (this.f2823e == null) {
            Configuration configuration = this.f2822d;
            if (configuration == null || (Build.VERSION.SDK_INT >= 26 && m3011e(configuration))) {
                this.f2823e = super.getResources();
            } else {
                this.f2823e = createConfigurationContext(this.f2822d).getResources();
            }
        }
        return this.f2823e;
    }

    /* JADX INFO: renamed from: d */
    private void m3010d() {
        boolean z2 = this.f2820b == null;
        if (z2) {
            this.f2820b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2820b.setTo(theme);
            }
        }
        m3014f(this.f2820b, this.f2819a, z2);
    }

    /* JADX INFO: renamed from: e */
    private static boolean m3011e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f2818f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f2818f = configuration2;
        }
        return configuration.equals(f2818f);
    }

    /* JADX INFO: renamed from: a */
    public void m3012a(Configuration configuration) {
        if (this.f2823e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f2822d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f2822d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* JADX INFO: renamed from: c */
    public int m3013c() {
        return this.f2819a;
    }

    /* JADX INFO: renamed from: f */
    protected void m3014f(Resources.Theme theme, int i3, boolean z2) {
        theme.applyStyle(i3, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m3009b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2821c == null) {
            this.f2821c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2821c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f2820b;
        if (theme != null) {
            return theme;
        }
        if (this.f2819a == 0) {
            this.f2819a = AbstractC1768i.f8874f;
        }
        m3010d();
        return this.f2820b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i3) {
        if (this.f2819a != i3) {
            this.f2819a = i3;
            m3010d();
        }
    }

    public C0774d(Context context, Resources.Theme theme) {
        super(context);
        this.f2820b = theme;
    }
}
