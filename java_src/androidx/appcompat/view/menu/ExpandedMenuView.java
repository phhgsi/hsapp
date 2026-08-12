package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0786e;
import androidx.appcompat.widget.C0888e0;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements C0786e.b, InterfaceC0792k, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: c */
    private static final int[] f2900c = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: a */
    private C0786e f2901a;

    /* JADX INFO: renamed from: b */
    private int f2902b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.C0786e.b
    /* JADX INFO: renamed from: a */
    public boolean mo3053a(C0788g c0788g) {
        return this.f2901a.m3136O(c0788g, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0792k
    /* JADX INFO: renamed from: b */
    public void mo3054b(C0786e c0786e) {
        this.f2901a = c0786e;
    }

    public int getWindowAnimations() {
        return this.f2902b;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        mo3053a((C0788g) getAdapter().getItem(i3));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0888e0 c0888e0M3765v = C0888e0.m3765v(context, attributeSet, f2900c, i3, 0);
        if (c0888e0M3765v.m3784s(0)) {
            setBackgroundDrawable(c0888e0M3765v.m3772g(0));
        }
        if (c0888e0M3765v.m3784s(1)) {
            setDivider(c0888e0M3765v.m3772g(1));
        }
        c0888e0M3765v.m3786x();
    }
}
