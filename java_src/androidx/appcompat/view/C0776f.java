package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.AbstractC0772b;
import androidx.collection.C0929i;
import java.util.ArrayList;
import p003B.InterfaceMenuC0028a;
import p003B.InterfaceMenuItemC0029b;
import p111i.MenuC2023d;
import p111i.MenuItemC2022c;

/* JADX INFO: renamed from: androidx.appcompat.view.f */
/* JADX INFO: loaded from: classes.dex */
public class C0776f extends ActionMode {

    /* JADX INFO: renamed from: a */
    final Context f2831a;

    /* JADX INFO: renamed from: b */
    final AbstractC0772b f2832b;

    /* JADX INFO: renamed from: androidx.appcompat.view.f$a */
    public static class a implements AbstractC0772b.a {

        /* JADX INFO: renamed from: a */
        final ActionMode.Callback f2833a;

        /* JADX INFO: renamed from: b */
        final Context f2834b;

        /* JADX INFO: renamed from: c */
        final ArrayList f2835c = new ArrayList();

        /* JADX INFO: renamed from: d */
        final C0929i f2836d = new C0929i();

        public a(Context context, ActionMode.Callback callback) {
            this.f2834b = context;
            this.f2833a = callback;
        }

        /* JADX INFO: renamed from: f */
        private Menu m3015f(Menu menu) {
            Menu menu2 = (Menu) this.f2836d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            MenuC2023d menuC2023d = new MenuC2023d(this.f2834b, (InterfaceMenuC0028a) menu);
            this.f2836d.put(menu, menuC2023d);
            return menuC2023d;
        }

        @Override // androidx.appcompat.view.AbstractC0772b.a
        /* JADX INFO: renamed from: a */
        public boolean mo2929a(AbstractC0772b abstractC0772b, Menu menu) {
            return this.f2833a.onPrepareActionMode(m3016e(abstractC0772b), m3015f(menu));
        }

        @Override // androidx.appcompat.view.AbstractC0772b.a
        /* JADX INFO: renamed from: b */
        public void mo2930b(AbstractC0772b abstractC0772b) {
            this.f2833a.onDestroyActionMode(m3016e(abstractC0772b));
        }

        @Override // androidx.appcompat.view.AbstractC0772b.a
        /* JADX INFO: renamed from: c */
        public boolean mo2931c(AbstractC0772b abstractC0772b, MenuItem menuItem) {
            return this.f2833a.onActionItemClicked(m3016e(abstractC0772b), new MenuItemC2022c(this.f2834b, (InterfaceMenuItemC0029b) menuItem));
        }

        @Override // androidx.appcompat.view.AbstractC0772b.a
        /* JADX INFO: renamed from: d */
        public boolean mo2932d(AbstractC0772b abstractC0772b, Menu menu) {
            return this.f2833a.onCreateActionMode(m3016e(abstractC0772b), m3015f(menu));
        }

        /* JADX INFO: renamed from: e */
        public ActionMode m3016e(AbstractC0772b abstractC0772b) {
            int size = this.f2835c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0776f c0776f = (C0776f) this.f2835c.get(i3);
                if (c0776f != null && c0776f.f2832b == abstractC0772b) {
                    return c0776f;
                }
            }
            C0776f c0776f2 = new C0776f(this.f2834b, abstractC0772b);
            this.f2835c.add(c0776f2);
            return c0776f2;
        }
    }

    public C0776f(Context context, AbstractC0772b abstractC0772b) {
        this.f2831a = context;
        this.f2832b = abstractC0772b;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f2832b.mo2754c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f2832b.mo2755d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC2023d(this.f2831a, (InterfaceMenuC0028a) this.f2832b.mo2756e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f2832b.mo2757f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f2832b.mo2758g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f2832b.m3004h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f2832b.mo2759i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f2832b.m3005j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f2832b.mo2760k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f2832b.mo2761l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f2832b.mo2762m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f2832b.mo2764o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f2832b.m3006p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f2832b.mo2766r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z2) {
        this.f2832b.mo2767s(z2);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i3) {
        this.f2832b.mo2763n(i3);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i3) {
        this.f2832b.mo2765q(i3);
    }
}
