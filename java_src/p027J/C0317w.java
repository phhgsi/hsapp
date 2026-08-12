package p027J;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.appcompat.app.AbstractC0740E;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: J.w */
/* JADX INFO: loaded from: classes.dex */
public class C0317w {

    /* JADX INFO: renamed from: a */
    private final Runnable f1383a;

    /* JADX INFO: renamed from: b */
    private final CopyOnWriteArrayList f1384b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    private final Map f1385c = new HashMap();

    public C0317w(Runnable runnable) {
        this.f1383a = runnable;
    }

    /* JADX INFO: renamed from: a */
    public void m1068a(InterfaceC0321y interfaceC0321y) {
        this.f1384b.add(interfaceC0321y);
        this.f1383a.run();
    }

    /* JADX INFO: renamed from: b */
    public void m1069b(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f1384b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0321y) it.next()).mo1161c(menu, menuInflater);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m1070c(Menu menu) {
        Iterator it = this.f1384b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0321y) it.next()).mo1160b(menu);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m1071d(MenuItem menuItem) {
        Iterator it = this.f1384b.iterator();
        while (it.hasNext()) {
            if (((InterfaceC0321y) it.next()).mo1159a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m1072e(Menu menu) {
        Iterator it = this.f1384b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0321y) it.next()).mo1162d(menu);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m1073f(InterfaceC0321y interfaceC0321y) {
        this.f1384b.remove(interfaceC0321y);
        AbstractC0740E.m2693a(this.f1385c.remove(interfaceC0321y));
        this.f1383a.run();
    }
}
