package p027J;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: J.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0275b {

    /* JADX INFO: renamed from: a */
    private final Context f1308a;

    /* JADX INFO: renamed from: b */
    private a f1309b;

    /* JADX INFO: renamed from: c */
    private b f1310c;

    /* JADX INFO: renamed from: J.b$a */
    public interface a {
    }

    /* JADX INFO: renamed from: J.b$b */
    public interface b {
        void onActionProviderVisibilityChanged(boolean z2);
    }

    public AbstractC0275b(Context context) {
        this.f1308a = context;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo911a();

    /* JADX INFO: renamed from: b */
    public abstract boolean mo912b();

    /* JADX INFO: renamed from: c */
    public abstract View mo913c(MenuItem menuItem);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo914d();

    /* JADX INFO: renamed from: e */
    public abstract void mo915e(SubMenu subMenu);

    /* JADX INFO: renamed from: f */
    public abstract boolean mo916f();

    /* JADX INFO: renamed from: g */
    public void m917g() {
        this.f1310c = null;
        this.f1309b = null;
    }

    /* JADX INFO: renamed from: h */
    public void m918h(a aVar) {
        this.f1309b = aVar;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo919i(b bVar);
}
