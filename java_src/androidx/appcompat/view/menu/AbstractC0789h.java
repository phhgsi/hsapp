package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import p111i.InterfaceC2024e;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: androidx.appcompat.view.menu.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0789h implements InterfaceC2024e, InterfaceC0791j, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    private Rect f3048a;

    AbstractC0789h() {
    }

    /* JADX INFO: renamed from: A */
    protected static boolean m3202A(C0786e c0786e) {
        int size = c0786e.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = c0786e.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: B */
    protected static C0785d m3203B(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0785d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0785d) listAdapter;
    }

    /* JADX INFO: renamed from: r */
    protected static int m3204r(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i3) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i4 = 0;
        int i5 = 0;
        View view = null;
        for (int i6 = 0; i6 < count; i6++) {
            int itemViewType = listAdapter.getItemViewType(i6);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i6, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i3) {
                return i3;
            }
            if (measuredWidth > i4) {
                i4 = measuredWidth;
            }
        }
        return i4;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: b */
    public int mo3062b() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: d */
    public void mo3064d(Context context, C0786e c0786e) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: l */
    public boolean mo3069l(C0786e c0786e, C0788g c0788g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: m */
    public boolean mo3070m(C0786e c0786e, C0788g c0788g) {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo3091o(C0786e c0786e);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m3203B(listAdapter).f2979a.m3137P((MenuItem) listAdapter.getItem(i3), this, mo3092p() ? 0 : 4);
    }

    /* JADX INFO: renamed from: p */
    protected boolean mo3092p() {
        return true;
    }

    /* JADX INFO: renamed from: q */
    public Rect m3205q() {
        return this.f3048a;
    }

    /* JADX INFO: renamed from: s */
    public abstract void mo3093s(View view);

    /* JADX INFO: renamed from: t */
    public void m3206t(Rect rect) {
        this.f3048a = rect;
    }

    /* JADX INFO: renamed from: u */
    public abstract void mo3094u(boolean z2);

    /* JADX INFO: renamed from: v */
    public abstract void mo3095v(int i3);

    /* JADX INFO: renamed from: w */
    public abstract void mo3096w(int i3);

    /* JADX INFO: renamed from: x */
    public abstract void mo3097x(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: y */
    public abstract void mo3098y(boolean z2);

    /* JADX INFO: renamed from: z */
    public abstract void mo3099z(int i3);
}
