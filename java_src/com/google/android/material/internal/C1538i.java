package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0786e;
import androidx.appcompat.view.menu.C0788g;
import androidx.appcompat.view.menu.InterfaceC0791j;
import androidx.appcompat.view.menu.InterfaceC0792k;
import androidx.appcompat.view.menu.SubMenuC0794m;
import androidx.core.widget.AbstractC0988i;
import androidx.recyclerview.widget.C1232k;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p016F0.AbstractC0142c;
import p016F0.AbstractC0146g;
import p027J.AbstractC0268W;
import p027J.C0273a;
import p027J.C0318w0;
import p030K.C0356y;

/* JADX INFO: renamed from: com.google.android.material.internal.i */
/* JADX INFO: loaded from: classes.dex */
public class C1538i implements InterfaceC0791j {

    /* JADX INFO: renamed from: A */
    private int f7725A;

    /* JADX INFO: renamed from: B */
    int f7726B;

    /* JADX INFO: renamed from: a */
    private NavigationMenuView f7729a;

    /* JADX INFO: renamed from: b */
    LinearLayout f7730b;

    /* JADX INFO: renamed from: c */
    private InterfaceC0791j.a f7731c;

    /* JADX INFO: renamed from: d */
    C0786e f7732d;

    /* JADX INFO: renamed from: e */
    private int f7733e;

    /* JADX INFO: renamed from: f */
    c f7734f;

    /* JADX INFO: renamed from: g */
    LayoutInflater f7735g;

    /* JADX INFO: renamed from: i */
    ColorStateList f7737i;

    /* JADX INFO: renamed from: l */
    ColorStateList f7740l;

    /* JADX INFO: renamed from: m */
    ColorStateList f7741m;

    /* JADX INFO: renamed from: n */
    Drawable f7742n;

    /* JADX INFO: renamed from: o */
    RippleDrawable f7743o;

    /* JADX INFO: renamed from: p */
    int f7744p;

    /* JADX INFO: renamed from: q */
    int f7745q;

    /* JADX INFO: renamed from: r */
    int f7746r;

    /* JADX INFO: renamed from: s */
    int f7747s;

    /* JADX INFO: renamed from: t */
    int f7748t;

    /* JADX INFO: renamed from: u */
    int f7749u;

    /* JADX INFO: renamed from: v */
    int f7750v;

    /* JADX INFO: renamed from: w */
    int f7751w;

    /* JADX INFO: renamed from: x */
    boolean f7752x;

    /* JADX INFO: renamed from: z */
    private int f7754z;

    /* JADX INFO: renamed from: h */
    int f7736h = 0;

    /* JADX INFO: renamed from: j */
    int f7738j = 0;

    /* JADX INFO: renamed from: k */
    boolean f7739k = true;

    /* JADX INFO: renamed from: y */
    boolean f7753y = true;

    /* JADX INFO: renamed from: C */
    private int f7727C = -1;

    /* JADX INFO: renamed from: D */
    final View.OnClickListener f7728D = new a();

    /* JADX INFO: renamed from: com.google.android.material.internal.i$a */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z2 = true;
            C1538i.this.m8414Z(true);
            C0788g itemData = ((NavigationMenuItemView) view).getItemData();
            C1538i c1538i = C1538i.this;
            boolean zM3137P = c1538i.f7732d.m3137P(itemData, c1538i, 0);
            if (itemData != null && itemData.isCheckable() && zM3137P) {
                C1538i.this.f7734f.m8447M(itemData);
            } else {
                z2 = false;
            }
            C1538i.this.m8414Z(false);
            if (z2) {
                C1538i.this.mo3068i(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.i$b */
    private static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.i$c */
    private class c extends RecyclerView.AbstractC1197h {

        /* JADX INFO: renamed from: d */
        private final ArrayList f7756d = new ArrayList();

        /* JADX INFO: renamed from: e */
        private C0788g f7757e;

        /* JADX INFO: renamed from: f */
        private boolean f7758f;

        /* JADX INFO: renamed from: com.google.android.material.internal.i$c$a */
        class a extends C0273a {

            /* JADX INFO: renamed from: d */
            final /* synthetic */ int f7760d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ boolean f7761e;

            a(int i3, boolean z2) {
                this.f7760d = i3;
                this.f7761e = z2;
            }

            @Override // p027J.C0273a
            /* JADX INFO: renamed from: g */
            public void mo905g(View view, C0356y c0356y) {
                super.mo905g(view, c0356y);
                c0356y.m1292v0(C0356y.g.m1319a(c.this.m8430B(this.f7760d), 1, 1, 1, this.f7761e, view.isSelected()));
            }
        }

        c() {
            m8432J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: B */
        public int m8430B(int i3) {
            int i4 = i3;
            for (int i5 = 0; i5 < i3; i5++) {
                if (C1538i.this.f7734f.mo5717f(i5) == 2 || C1538i.this.f7734f.mo5717f(i5) == 3) {
                    i4--;
                }
            }
            return i4;
        }

        /* JADX INFO: renamed from: C */
        private void m8431C(int i3, int i4) {
            while (i3 < i4) {
                ((g) this.f7756d.get(i3)).f7766b = true;
                i3++;
            }
        }

        /* JADX INFO: renamed from: J */
        private void m8432J() {
            if (this.f7758f) {
                return;
            }
            this.f7758f = true;
            this.f7756d.clear();
            this.f7756d.add(new d());
            int size = C1538i.this.f7732d.m3128G().size();
            int i3 = -1;
            boolean z2 = false;
            int size2 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                C0788g c0788g = (C0788g) C1538i.this.f7732d.m3128G().get(i4);
                if (c0788g.isChecked()) {
                    m8447M(c0788g);
                }
                if (c0788g.isCheckable()) {
                    c0788g.m3195t(false);
                }
                if (c0788g.hasSubMenu()) {
                    SubMenu subMenu = c0788g.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i4 != 0) {
                            this.f7756d.add(new f(C1538i.this.f7726B, 0));
                        }
                        this.f7756d.add(new g(c0788g));
                        int size3 = this.f7756d.size();
                        int size4 = subMenu.size();
                        boolean z3 = false;
                        for (int i5 = 0; i5 < size4; i5++) {
                            C0788g c0788g2 = (C0788g) subMenu.getItem(i5);
                            if (c0788g2.isVisible()) {
                                if (!z3 && c0788g2.getIcon() != null) {
                                    z3 = true;
                                }
                                if (c0788g2.isCheckable()) {
                                    c0788g2.m3195t(false);
                                }
                                if (c0788g2.isChecked()) {
                                    m8447M(c0788g2);
                                }
                                this.f7756d.add(new g(c0788g2));
                            }
                        }
                        if (z3) {
                            m8431C(size3, this.f7756d.size());
                        }
                    }
                } else {
                    int groupId = c0788g.getGroupId();
                    if (groupId != i3) {
                        size2 = this.f7756d.size();
                        z2 = c0788g.getIcon() != null;
                        if (i4 != 0) {
                            size2++;
                            ArrayList arrayList = this.f7756d;
                            int i6 = C1538i.this.f7726B;
                            arrayList.add(new f(i6, i6));
                        }
                    } else if (!z2 && c0788g.getIcon() != null) {
                        m8431C(size2, this.f7756d.size());
                        z2 = true;
                    }
                    g gVar = new g(c0788g);
                    gVar.f7766b = z2;
                    this.f7756d.add(gVar);
                    i3 = groupId;
                }
            }
            this.f7758f = false;
        }

        /* JADX INFO: renamed from: L */
        private void m8433L(View view, int i3, boolean z2) {
            AbstractC0268W.m775i0(view, new a(i3, z2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: P */
        public void m8434P() {
            for (int i3 = 0; i3 < this.f7756d.size(); i3++) {
                if (this.f7756d.get(i3) instanceof f) {
                    m5721j(i3);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: Q */
        public void m8435Q() {
            for (int i3 = 0; i3 < this.f7756d.size(); i3++) {
                if ((this.f7756d.get(i3) instanceof g) && mo5717f(i3) == 1) {
                    m5721j(i3);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: R */
        public void m8436R() {
            for (int i3 = 0; i3 < this.f7756d.size(); i3++) {
                if ((this.f7756d.get(i3) instanceof g) && mo5717f(i3) == 0) {
                    m5721j(i3);
                }
            }
        }

        /* JADX INFO: renamed from: D */
        public Bundle m8440D() {
            Bundle bundle = new Bundle();
            C0788g c0788g = this.f7757e;
            if (c0788g != null) {
                bundle.putInt("android:menu:checked", c0788g.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f7756d.size();
            for (int i3 = 0; i3 < size; i3++) {
                e eVar = (e) this.f7756d.get(i3);
                if (eVar instanceof g) {
                    C0788g c0788gM8452a = ((g) eVar).m8452a();
                    View actionView = c0788gM8452a != null ? c0788gM8452a.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(c0788gM8452a.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        /* JADX INFO: renamed from: E */
        public C0788g m8441E() {
            return this.f7757e;
        }

        /* JADX INFO: renamed from: F */
        int m8442F() {
            int i3 = 0;
            for (int i4 = 0; i4 < C1538i.this.f7734f.mo5715d(); i4++) {
                int iMo5717f = C1538i.this.f7734f.mo5717f(i4);
                if (iMo5717f == 0 || iMo5717f == 1) {
                    i3++;
                }
            }
            return i3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1197h
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void mo5724m(l lVar, int i3) {
            int iMo5717f = mo5717f(i3);
            if (iMo5717f != 0) {
                if (iMo5717f != 1) {
                    if (iMo5717f != 2) {
                        return;
                    }
                    f fVar = (f) this.f7756d.get(i3);
                    lVar.f5699a.setPaddingRelative(C1538i.this.f7748t, fVar.m8451b(), C1538i.this.f7749u, fVar.m8450a());
                    return;
                }
                TextView textView = (TextView) lVar.f5699a;
                textView.setText(((g) this.f7756d.get(i3)).m8452a().getTitle());
                AbstractC0988i.m4394m(textView, C1538i.this.f7736h);
                textView.setPaddingRelative(C1538i.this.f7750v, textView.getPaddingTop(), C1538i.this.f7751w, textView.getPaddingBottom());
                ColorStateList colorStateList = C1538i.this.f7737i;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                m8433L(textView, i3, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.f5699a;
            navigationMenuItemView.setIconTintList(C1538i.this.f7741m);
            navigationMenuItemView.setTextAppearance(C1538i.this.f7738j);
            ColorStateList colorStateList2 = C1538i.this.f7740l;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = C1538i.this.f7742n;
            navigationMenuItemView.setBackground(drawable != null ? drawable.getConstantState().newDrawable() : null);
            RippleDrawable rippleDrawable = C1538i.this.f7743o;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            g gVar = (g) this.f7756d.get(i3);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.f7766b);
            C1538i c1538i = C1538i.this;
            int i4 = c1538i.f7744p;
            int i5 = c1538i.f7745q;
            navigationMenuItemView.setPadding(i4, i5, i4, i5);
            navigationMenuItemView.setIconPadding(C1538i.this.f7746r);
            C1538i c1538i2 = C1538i.this;
            if (c1538i2.f7752x) {
                navigationMenuItemView.setIconSize(c1538i2.f7747s);
            }
            navigationMenuItemView.setMaxLines(C1538i.this.f7754z);
            navigationMenuItemView.m8296D(gVar.m8452a(), C1538i.this.f7739k);
            m8433L(navigationMenuItemView, i3, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1197h
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public l mo5726o(ViewGroup viewGroup, int i3) {
            if (i3 == 0) {
                C1538i c1538i = C1538i.this;
                return new i(c1538i.f7735g, viewGroup, c1538i.f7728D);
            }
            if (i3 == 1) {
                return new k(C1538i.this.f7735g, viewGroup);
            }
            if (i3 == 2) {
                return new j(C1538i.this.f7735g, viewGroup);
            }
            if (i3 != 3) {
                return null;
            }
            return new b(C1538i.this.f7730b);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1197h
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public void mo5731t(l lVar) {
            if (lVar instanceof i) {
                ((NavigationMenuItemView) lVar.f5699a).m8297E();
            }
        }

        /* JADX INFO: renamed from: K */
        public void m8446K(Bundle bundle) {
            C0788g c0788gM8452a;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            C0788g c0788gM8452a2;
            int i3 = bundle.getInt("android:menu:checked", 0);
            if (i3 != 0) {
                this.f7758f = true;
                int size = this.f7756d.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        break;
                    }
                    e eVar = (e) this.f7756d.get(i4);
                    if ((eVar instanceof g) && (c0788gM8452a2 = ((g) eVar).m8452a()) != null && c0788gM8452a2.getItemId() == i3) {
                        m8447M(c0788gM8452a2);
                        break;
                    }
                    i4++;
                }
                this.f7758f = false;
                m8432J();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f7756d.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    e eVar2 = (e) this.f7756d.get(i5);
                    if ((eVar2 instanceof g) && (c0788gM8452a = ((g) eVar2).m8452a()) != null && (actionView = c0788gM8452a.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(c0788gM8452a.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: M */
        public void m8447M(C0788g c0788g) {
            if (this.f7757e == c0788g || !c0788g.isCheckable()) {
                return;
            }
            C0788g c0788g2 = this.f7757e;
            if (c0788g2 != null) {
                c0788g2.setChecked(false);
            }
            this.f7757e = c0788g;
            c0788g.setChecked(true);
        }

        /* JADX INFO: renamed from: N */
        public void m8448N(boolean z2) {
            this.f7758f = z2;
        }

        /* JADX INFO: renamed from: O */
        public void m8449O() {
            int size = this.f7756d.size();
            m8432J();
            m5720i();
            if (size == this.f7756d.size()) {
                m5722k(0, this.f7756d.size());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1197h
        /* JADX INFO: renamed from: d */
        public int mo5715d() {
            return this.f7756d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1197h
        /* JADX INFO: renamed from: e */
        public long mo5716e(int i3) {
            return i3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1197h
        /* JADX INFO: renamed from: f */
        public int mo5717f(int i3) {
            e eVar = (e) this.f7756d.get(i3);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                return ((g) eVar).m8452a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.i$d */
    private static class d implements e {
        d() {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.i$e */
    private interface e {
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.i$f */
    private static class f implements e {

        /* JADX INFO: renamed from: a */
        private final int f7763a;

        /* JADX INFO: renamed from: b */
        private final int f7764b;

        public f(int i3, int i4) {
            this.f7763a = i3;
            this.f7764b = i4;
        }

        /* JADX INFO: renamed from: a */
        public int m8450a() {
            return this.f7764b;
        }

        /* JADX INFO: renamed from: b */
        public int m8451b() {
            return this.f7763a;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.i$g */
    private static class g implements e {

        /* JADX INFO: renamed from: a */
        private final C0788g f7765a;

        /* JADX INFO: renamed from: b */
        boolean f7766b;

        g(C0788g c0788g) {
            this.f7765a = c0788g;
        }

        /* JADX INFO: renamed from: a */
        public C0788g m8452a() {
            return this.f7765a;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.i$h */
    private class h extends C1232k {
        h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.C1232k, p027J.C0273a
        /* JADX INFO: renamed from: g */
        public void mo905g(View view, C0356y c0356y) {
            super.mo905g(view, c0356y);
            c0356y.m1290u0(C0356y.f.m1317a(C1538i.this.f7734f.m8442F(), 1, false));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.i$i */
    private static class i extends l {
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(AbstractC0146g.f511b, viewGroup, false));
            this.f5699a.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.i$j */
    private static class j extends l {
        public j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(AbstractC0146g.f513d, viewGroup, false));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.i$k */
    private static class k extends l {
        public k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(AbstractC0146g.f514e, viewGroup, false));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.i$l */
    private static abstract class l extends RecyclerView.AbstractC1188C {
        public l(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: C */
    private boolean m8384C() {
        return m8420r() > 0;
    }

    /* JADX INFO: renamed from: a0 */
    private void m8385a0() {
        c cVar = this.f7734f;
        if (cVar != null) {
            cVar.m8434P();
        }
    }

    /* JADX INFO: renamed from: b0 */
    private void m8386b0() {
        c cVar = this.f7734f;
        if (cVar != null) {
            cVar.m8435Q();
        }
    }

    /* JADX INFO: renamed from: c0 */
    private void m8388c0() {
        c cVar = this.f7734f;
        if (cVar != null) {
            cVar.m8436R();
        }
    }

    /* JADX INFO: renamed from: d0 */
    private void m8389d0() {
        int i3 = (m8384C() || !this.f7753y) ? 0 : this.f7725A;
        NavigationMenuView navigationMenuView = this.f7729a;
        navigationMenuView.setPadding(0, i3, 0, navigationMenuView.getPaddingBottom());
    }

    /* JADX INFO: renamed from: A */
    public int m8390A() {
        return this.f7751w;
    }

    /* JADX INFO: renamed from: B */
    public int m8391B() {
        return this.f7750v;
    }

    /* JADX INFO: renamed from: D */
    public View m8392D(int i3) {
        View viewInflate = this.f7735g.inflate(i3, (ViewGroup) this.f7730b, false);
        m8415e(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: E */
    public void m8393E(boolean z2) {
        if (this.f7753y != z2) {
            this.f7753y = z2;
            m8389d0();
        }
    }

    /* JADX INFO: renamed from: F */
    public void m8394F(C0788g c0788g) {
        this.f7734f.m8447M(c0788g);
    }

    /* JADX INFO: renamed from: G */
    public void m8395G(int i3) {
        this.f7749u = i3;
        m8385a0();
    }

    /* JADX INFO: renamed from: H */
    public void m8396H(int i3) {
        this.f7748t = i3;
        m8385a0();
    }

    /* JADX INFO: renamed from: I */
    public void m8397I(int i3) {
        this.f7733e = i3;
    }

    /* JADX INFO: renamed from: J */
    public void m8398J(Drawable drawable) {
        this.f7742n = drawable;
        m8388c0();
    }

    /* JADX INFO: renamed from: K */
    public void m8399K(RippleDrawable rippleDrawable) {
        this.f7743o = rippleDrawable;
        m8388c0();
    }

    /* JADX INFO: renamed from: L */
    public void m8400L(int i3) {
        this.f7744p = i3;
        m8388c0();
    }

    /* JADX INFO: renamed from: M */
    public void m8401M(int i3) {
        this.f7746r = i3;
        m8388c0();
    }

    /* JADX INFO: renamed from: N */
    public void m8402N(int i3) {
        if (this.f7747s != i3) {
            this.f7747s = i3;
            this.f7752x = true;
            m8388c0();
        }
    }

    /* JADX INFO: renamed from: O */
    public void m8403O(ColorStateList colorStateList) {
        this.f7741m = colorStateList;
        m8388c0();
    }

    /* JADX INFO: renamed from: P */
    public void m8404P(int i3) {
        this.f7754z = i3;
        m8388c0();
    }

    /* JADX INFO: renamed from: Q */
    public void m8405Q(int i3) {
        this.f7738j = i3;
        m8388c0();
    }

    /* JADX INFO: renamed from: R */
    public void m8406R(boolean z2) {
        this.f7739k = z2;
        m8388c0();
    }

    /* JADX INFO: renamed from: S */
    public void m8407S(ColorStateList colorStateList) {
        this.f7740l = colorStateList;
        m8388c0();
    }

    /* JADX INFO: renamed from: T */
    public void m8408T(int i3) {
        this.f7745q = i3;
        m8388c0();
    }

    /* JADX INFO: renamed from: U */
    public void m8409U(int i3) {
        this.f7727C = i3;
        NavigationMenuView navigationMenuView = this.f7729a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i3);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m8410V(ColorStateList colorStateList) {
        this.f7737i = colorStateList;
        m8386b0();
    }

    /* JADX INFO: renamed from: W */
    public void m8411W(int i3) {
        this.f7751w = i3;
        m8386b0();
    }

    /* JADX INFO: renamed from: X */
    public void m8412X(int i3) {
        this.f7750v = i3;
        m8386b0();
    }

    /* JADX INFO: renamed from: Y */
    public void m8413Y(int i3) {
        this.f7736h = i3;
        m8386b0();
    }

    /* JADX INFO: renamed from: Z */
    public void m8414Z(boolean z2) {
        c cVar = this.f7734f;
        if (cVar != null) {
            cVar.m8448N(z2);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: a */
    public void mo3061a(C0786e c0786e, boolean z2) {
        InterfaceC0791j.a aVar = this.f7731c;
        if (aVar != null) {
            aVar.mo2717a(c0786e, z2);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: b */
    public int mo3062b() {
        return this.f7733e;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: d */
    public void mo3064d(Context context, C0786e c0786e) {
        this.f7735g = LayoutInflater.from(context);
        this.f7732d = c0786e;
        this.f7726B = context.getResources().getDimensionPixelOffset(AbstractC0142c.f413k);
    }

    /* JADX INFO: renamed from: e */
    public void m8415e(View view) {
        this.f7730b.addView(view);
        NavigationMenuView navigationMenuView = this.f7729a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: f */
    public void mo3087f(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f7729a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f7734f.m8446K(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f7730b.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m8416g(C0318w0 c0318w0) {
        int iM1088l = c0318w0.m1088l();
        if (this.f7725A != iM1088l) {
            this.f7725A = iM1088l;
            m8389d0();
        }
        NavigationMenuView navigationMenuView = this.f7729a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, c0318w0.m1085i());
        AbstractC0268W.m770g(this.f7730b, c0318w0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: h */
    public boolean mo3067h(SubMenuC0794m subMenuC0794m) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: i */
    public void mo3068i(boolean z2) {
        c cVar = this.f7734f;
        if (cVar != null) {
            cVar.m8449O();
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
        Bundle bundle = new Bundle();
        if (this.f7729a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f7729a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.f7734f;
        if (cVar != null) {
            bundle.putBundle("android:menu:adapter", cVar.m8440D());
        }
        if (this.f7730b != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.f7730b.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
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

    /* JADX INFO: renamed from: o */
    public C0788g m8417o() {
        return this.f7734f.m8441E();
    }

    /* JADX INFO: renamed from: p */
    public int m8418p() {
        return this.f7749u;
    }

    /* JADX INFO: renamed from: q */
    public int m8419q() {
        return this.f7748t;
    }

    /* JADX INFO: renamed from: r */
    public int m8420r() {
        return this.f7730b.getChildCount();
    }

    /* JADX INFO: renamed from: s */
    public Drawable m8421s() {
        return this.f7742n;
    }

    /* JADX INFO: renamed from: t */
    public int m8422t() {
        return this.f7744p;
    }

    /* JADX INFO: renamed from: u */
    public int m8423u() {
        return this.f7746r;
    }

    /* JADX INFO: renamed from: v */
    public int m8424v() {
        return this.f7754z;
    }

    /* JADX INFO: renamed from: w */
    public ColorStateList m8425w() {
        return this.f7740l;
    }

    /* JADX INFO: renamed from: x */
    public ColorStateList m8426x() {
        return this.f7741m;
    }

    /* JADX INFO: renamed from: y */
    public int m8427y() {
        return this.f7745q;
    }

    /* JADX INFO: renamed from: z */
    public InterfaceC0792k m8428z(ViewGroup viewGroup) {
        if (this.f7729a == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f7735g.inflate(AbstractC0146g.f515f, viewGroup, false);
            this.f7729a = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.f7729a));
            if (this.f7734f == null) {
                c cVar = new c();
                this.f7734f = cVar;
                cVar.m5733v(true);
            }
            int i3 = this.f7727C;
            if (i3 != -1) {
                this.f7729a.setOverScrollMode(i3);
            }
            LinearLayout linearLayout = (LinearLayout) this.f7735g.inflate(AbstractC0146g.f512c, (ViewGroup) this.f7729a, false);
            this.f7730b = linearLayout;
            linearLayout.setImportantForAccessibility(2);
            this.f7729a.setAdapter(this.f7734f);
        }
        return this.f7729a;
    }
}
