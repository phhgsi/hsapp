package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.InterfaceC0791j;
import androidx.appcompat.view.menu.InterfaceC0792k;
import java.util.ArrayList;
import p091d.AbstractC1766g;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.c */
/* JADX INFO: loaded from: classes.dex */
public class C0784c implements InterfaceC0791j, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    Context f2967a;

    /* JADX INFO: renamed from: b */
    LayoutInflater f2968b;

    /* JADX INFO: renamed from: c */
    C0786e f2969c;

    /* JADX INFO: renamed from: d */
    ExpandedMenuView f2970d;

    /* JADX INFO: renamed from: e */
    int f2971e;

    /* JADX INFO: renamed from: f */
    int f2972f;

    /* JADX INFO: renamed from: g */
    int f2973g;

    /* JADX INFO: renamed from: h */
    private InterfaceC0791j.a f2974h;

    /* JADX INFO: renamed from: i */
    a f2975i;

    /* JADX INFO: renamed from: j */
    private int f2976j;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.c$a */
    private class a extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        private int f2977a = -1;

        public a() {
            m3107a();
        }

        /* JADX INFO: renamed from: a */
        void m3107a() {
            C0788g c0788gM3171x = C0784c.this.f2969c.m3171x();
            if (c0788gM3171x != null) {
                ArrayList arrayListM3124B = C0784c.this.f2969c.m3124B();
                int size = arrayListM3124B.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (((C0788g) arrayListM3124B.get(i3)) == c0788gM3171x) {
                        this.f2977a = i3;
                        return;
                    }
                }
            }
            this.f2977a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0788g getItem(int i3) {
            ArrayList arrayListM3124B = C0784c.this.f2969c.m3124B();
            int i4 = i3 + C0784c.this.f2971e;
            int i5 = this.f2977a;
            if (i5 >= 0 && i4 >= i5) {
                i4++;
            }
            return (C0788g) arrayListM3124B.get(i4);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = C0784c.this.f2969c.m3124B().size() - C0784c.this.f2971e;
            return this.f2977a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i3) {
            return i3;
        }

        @Override // android.widget.Adapter
        public View getView(int i3, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0784c c0784c = C0784c.this;
                view = c0784c.f2968b.inflate(c0784c.f2973g, viewGroup, false);
            }
            ((InterfaceC0792k.a) view).mo3048e(getItem(i3), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m3107a();
            super.notifyDataSetChanged();
        }
    }

    public C0784c(Context context, int i3) {
        this(i3, 0);
        this.f2967a = context;
        this.f2968b = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: a */
    public void mo3061a(C0786e c0786e, boolean z2) {
        InterfaceC0791j.a aVar = this.f2974h;
        if (aVar != null) {
            aVar.mo2717a(c0786e, z2);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: b */
    public int mo3062b() {
        return this.f2976j;
    }

    /* JADX INFO: renamed from: c */
    public ListAdapter m3103c() {
        if (this.f2975i == null) {
            this.f2975i = new a();
        }
        return this.f2975i;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: d */
    public void mo3064d(Context context, C0786e c0786e) {
        if (this.f2972f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f2972f);
            this.f2967a = contextThemeWrapper;
            this.f2968b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f2967a != null) {
            this.f2967a = context;
            if (this.f2968b == null) {
                this.f2968b = LayoutInflater.from(context);
            }
        }
        this.f2969c = c0786e;
        a aVar = this.f2975i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC0792k m3104e(ViewGroup viewGroup) {
        if (this.f2970d == null) {
            this.f2970d = (ExpandedMenuView) this.f2968b.inflate(AbstractC1766g.f8841g, viewGroup, false);
            if (this.f2975i == null) {
                this.f2975i = new a();
            }
            this.f2970d.setAdapter((ListAdapter) this.f2975i);
            this.f2970d.setOnItemClickListener(this);
        }
        return this.f2970d;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: f */
    public void mo3087f(Parcelable parcelable) {
        m3105g((Bundle) parcelable);
    }

    /* JADX INFO: renamed from: g */
    public void m3105g(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f2970d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: h */
    public boolean mo3067h(SubMenuC0794m subMenuC0794m) {
        if (!subMenuC0794m.hasVisibleItems()) {
            return false;
        }
        new DialogInterfaceOnKeyListenerC0787f(subMenuC0794m).m3175d(null);
        InterfaceC0791j.a aVar = this.f2974h;
        if (aVar == null) {
            return true;
        }
        aVar.mo2718b(subMenuC0794m);
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: i */
    public void mo3068i(boolean z2) {
        a aVar = this.f2975i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: j */
    public boolean mo3089j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: k */
    public Parcelable mo3090k() {
        if (this.f2970d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        m3106o(bundle);
        return bundle;
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

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: n */
    public void mo3071n(InterfaceC0791j.a aVar) {
        this.f2974h = aVar;
    }

    /* JADX INFO: renamed from: o */
    public void m3106o(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f2970d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        this.f2969c.m3137P(this.f2975i.getItem(i3), this, 0);
    }

    public C0784c(int i3, int i4) {
        this.f2973g = i3;
        this.f2972f = i4;
    }
}
