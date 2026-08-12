package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.InterfaceC0792k;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.d */
/* JADX INFO: loaded from: classes.dex */
public class C0785d extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    C0786e f2979a;

    /* JADX INFO: renamed from: b */
    private int f2980b = -1;

    /* JADX INFO: renamed from: c */
    private boolean f2981c;

    /* JADX INFO: renamed from: d */
    private final boolean f2982d;

    /* JADX INFO: renamed from: e */
    private final LayoutInflater f2983e;

    /* JADX INFO: renamed from: f */
    private final int f2984f;

    public C0785d(C0786e c0786e, LayoutInflater layoutInflater, boolean z2, int i3) {
        this.f2982d = z2;
        this.f2983e = layoutInflater;
        this.f2979a = c0786e;
        this.f2984f = i3;
        m3109a();
    }

    /* JADX INFO: renamed from: a */
    void m3109a() {
        C0788g c0788gM3171x = this.f2979a.m3171x();
        if (c0788gM3171x != null) {
            ArrayList arrayListM3124B = this.f2979a.m3124B();
            int size = arrayListM3124B.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((C0788g) arrayListM3124B.get(i3)) == c0788gM3171x) {
                    this.f2980b = i3;
                    return;
                }
            }
        }
        this.f2980b = -1;
    }

    /* JADX INFO: renamed from: b */
    public C0786e m3110b() {
        return this.f2979a;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0788g getItem(int i3) {
        ArrayList arrayListM3124B = this.f2982d ? this.f2979a.m3124B() : this.f2979a.m3128G();
        int i4 = this.f2980b;
        if (i4 >= 0 && i3 >= i4) {
            i3++;
        }
        return (C0788g) arrayListM3124B.get(i3);
    }

    /* JADX INFO: renamed from: d */
    public void m3112d(boolean z2) {
        this.f2981c = z2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f2980b < 0 ? (this.f2982d ? this.f2979a.m3124B() : this.f2979a.m3128G()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i3) {
        return i3;
    }

    @Override // android.widget.Adapter
    public View getView(int i3, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2983e.inflate(this.f2984f, viewGroup, false);
        }
        int groupId = getItem(i3).getGroupId();
        int i4 = i3 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f2979a.mo3130I() && groupId != (i4 >= 0 ? getItem(i4).getGroupId() : groupId));
        InterfaceC0792k.a aVar = (InterfaceC0792k.a) view;
        if (this.f2981c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo3048e(getItem(i3), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m3109a();
        super.notifyDataSetChanged();
    }
}
