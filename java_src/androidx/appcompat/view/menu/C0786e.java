package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.AbstractC0966b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p003B.InterfaceMenuC0028a;
import p027J.AbstractC0275b;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.e */
/* JADX INFO: loaded from: classes.dex */
public class C0786e implements InterfaceMenuC0028a {

    /* JADX INFO: renamed from: A */
    private static final int[] f2985A = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a */
    private final Context f2986a;

    /* JADX INFO: renamed from: b */
    private final Resources f2987b;

    /* JADX INFO: renamed from: c */
    private boolean f2988c;

    /* JADX INFO: renamed from: d */
    private boolean f2989d;

    /* JADX INFO: renamed from: e */
    private a f2990e;

    /* JADX INFO: renamed from: m */
    private ContextMenu.ContextMenuInfo f2998m;

    /* JADX INFO: renamed from: n */
    CharSequence f2999n;

    /* JADX INFO: renamed from: o */
    Drawable f3000o;

    /* JADX INFO: renamed from: p */
    View f3001p;

    /* JADX INFO: renamed from: x */
    private C0788g f3009x;

    /* JADX INFO: renamed from: z */
    private boolean f3011z;

    /* JADX INFO: renamed from: l */
    private int f2997l = 0;

    /* JADX INFO: renamed from: q */
    private boolean f3002q = false;

    /* JADX INFO: renamed from: r */
    private boolean f3003r = false;

    /* JADX INFO: renamed from: s */
    private boolean f3004s = false;

    /* JADX INFO: renamed from: t */
    private boolean f3005t = false;

    /* JADX INFO: renamed from: u */
    private boolean f3006u = false;

    /* JADX INFO: renamed from: v */
    private ArrayList f3007v = new ArrayList();

    /* JADX INFO: renamed from: w */
    private CopyOnWriteArrayList f3008w = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: y */
    private boolean f3010y = false;

    /* JADX INFO: renamed from: f */
    private ArrayList f2991f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private ArrayList f2992g = new ArrayList();

    /* JADX INFO: renamed from: h */
    private boolean f2993h = true;

    /* JADX INFO: renamed from: i */
    private ArrayList f2994i = new ArrayList();

    /* JADX INFO: renamed from: j */
    private ArrayList f2995j = new ArrayList();

    /* JADX INFO: renamed from: k */
    private boolean f2996k = true;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.e$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo2719a(C0786e c0786e, MenuItem menuItem);

        /* JADX INFO: renamed from: b */
        void mo2720b(C0786e c0786e);
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.e$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        boolean mo3053a(C0788g c0788g);
    }

    public C0786e(Context context) {
        this.f2986a = context;
        this.f2987b = context.getResources();
        m3117g0(true);
    }

    /* JADX INFO: renamed from: D */
    private static int m3113D(int i3) {
        int i4 = ((-65536) & i3) >> 16;
        if (i4 >= 0) {
            int[] iArr = f2985A;
            if (i4 < iArr.length) {
                return (i3 & 65535) | (iArr[i4] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* JADX INFO: renamed from: Q */
    private void m3114Q(int i3, boolean z2) {
        if (i3 < 0 || i3 >= this.f2991f.size()) {
            return;
        }
        this.f2991f.remove(i3);
        if (z2) {
            mo3135N(true);
        }
    }

    /* JADX INFO: renamed from: b0 */
    private void m3115b0(int i3, CharSequence charSequence, int i4, Drawable drawable, View view) {
        Resources resourcesM3126E = m3126E();
        if (view != null) {
            this.f3001p = view;
            this.f2999n = null;
            this.f3000o = null;
        } else {
            if (i3 > 0) {
                this.f2999n = resourcesM3126E.getText(i3);
            } else if (charSequence != null) {
                this.f2999n = charSequence;
            }
            if (i4 > 0) {
                this.f3000o = AbstractC0966b.getDrawable(m3170w(), i4);
            } else if (drawable != null) {
                this.f3000o = drawable;
            }
            this.f3001p = null;
        }
        mo3135N(false);
    }

    /* JADX INFO: renamed from: g */
    private C0788g m3116g(int i3, int i4, int i5, int i6, CharSequence charSequence, int i7) {
        return new C0788g(this, i3, i4, i5, i6, charSequence, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX INFO: renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m3117g0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f2987b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f2986a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f2986a
            boolean r3 = p027J.AbstractC0272Z.m891l(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f2989d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0786e.m3117g0(boolean):void");
    }

    /* JADX INFO: renamed from: i */
    private void m3118i(boolean z2) {
        if (this.f3008w.isEmpty()) {
            return;
        }
        m3160i0();
        for (WeakReference weakReference : this.f3008w) {
            InterfaceC0791j interfaceC0791j = (InterfaceC0791j) weakReference.get();
            if (interfaceC0791j == null) {
                this.f3008w.remove(weakReference);
            } else {
                interfaceC0791j.mo3068i(z2);
            }
        }
        m3159h0();
    }

    /* JADX INFO: renamed from: j */
    private void m3119j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.f3008w.isEmpty()) {
            return;
        }
        for (WeakReference weakReference : this.f3008w) {
            InterfaceC0791j interfaceC0791j = (InterfaceC0791j) weakReference.get();
            if (interfaceC0791j == null) {
                this.f3008w.remove(weakReference);
            } else {
                int iMo3062b = interfaceC0791j.mo3062b();
                if (iMo3062b > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(iMo3062b)) != null) {
                    interfaceC0791j.mo3087f(parcelable);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    private void m3120k(Bundle bundle) {
        Parcelable parcelableMo3090k;
        if (this.f3008w.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference weakReference : this.f3008w) {
            InterfaceC0791j interfaceC0791j = (InterfaceC0791j) weakReference.get();
            if (interfaceC0791j == null) {
                this.f3008w.remove(weakReference);
            } else {
                int iMo3062b = interfaceC0791j.mo3062b();
                if (iMo3062b > 0 && (parcelableMo3090k = interfaceC0791j.mo3090k()) != null) {
                    sparseArray.put(iMo3062b, parcelableMo3090k);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    /* JADX INFO: renamed from: l */
    private boolean m3121l(SubMenuC0794m subMenuC0794m, InterfaceC0791j interfaceC0791j) {
        if (this.f3008w.isEmpty()) {
            return false;
        }
        boolean zMo3067h = interfaceC0791j != null ? interfaceC0791j.mo3067h(subMenuC0794m) : false;
        for (WeakReference weakReference : this.f3008w) {
            InterfaceC0791j interfaceC0791j2 = (InterfaceC0791j) weakReference.get();
            if (interfaceC0791j2 == null) {
                this.f3008w.remove(weakReference);
            } else if (!zMo3067h) {
                zMo3067h = interfaceC0791j2.mo3067h(subMenuC0794m);
            }
        }
        return zMo3067h;
    }

    /* JADX INFO: renamed from: p */
    private static int m3122p(ArrayList arrayList, int i3) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C0788g) arrayList.get(size)).m3181f() <= i3) {
                return size + 1;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: A */
    public View m3123A() {
        return this.f3001p;
    }

    /* JADX INFO: renamed from: B */
    public ArrayList m3124B() {
        m3167t();
        return this.f2995j;
    }

    /* JADX INFO: renamed from: C */
    boolean m3125C() {
        return this.f3005t;
    }

    /* JADX INFO: renamed from: E */
    Resources m3126E() {
        return this.f2987b;
    }

    /* JADX INFO: renamed from: F */
    public C0786e mo3127F() {
        return this;
    }

    /* JADX INFO: renamed from: G */
    public ArrayList m3128G() {
        if (!this.f2993h) {
            return this.f2992g;
        }
        this.f2992g.clear();
        int size = this.f2991f.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0788g c0788g = (C0788g) this.f2991f.get(i3);
            if (c0788g.isVisible()) {
                this.f2992g.add(c0788g);
            }
        }
        this.f2993h = false;
        this.f2996k = true;
        return this.f2992g;
    }

    /* JADX INFO: renamed from: H */
    public boolean m3129H() {
        return !this.f3002q;
    }

    /* JADX INFO: renamed from: I */
    public boolean mo3130I() {
        return this.f3010y;
    }

    /* JADX INFO: renamed from: J */
    boolean mo3131J() {
        return this.f2988c;
    }

    /* JADX INFO: renamed from: K */
    public boolean mo3132K() {
        return this.f2989d;
    }

    /* JADX INFO: renamed from: L */
    void m3133L(C0788g c0788g) {
        this.f2996k = true;
        mo3135N(true);
    }

    /* JADX INFO: renamed from: M */
    void m3134M(C0788g c0788g) {
        this.f2993h = true;
        mo3135N(true);
    }

    /* JADX INFO: renamed from: N */
    public void mo3135N(boolean z2) {
        if (this.f3002q) {
            this.f3003r = true;
            if (z2) {
                this.f3004s = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f2993h = true;
            this.f2996k = true;
        }
        m3118i(z2);
    }

    /* JADX INFO: renamed from: O */
    public boolean m3136O(MenuItem menuItem, int i3) {
        return m3137P(menuItem, null, i3);
    }

    /* JADX INFO: renamed from: P */
    public boolean m3137P(MenuItem menuItem, InterfaceC0791j interfaceC0791j, int i3) {
        C0788g c0788g = (C0788g) menuItem;
        if (c0788g == null || !c0788g.isEnabled()) {
            return false;
        }
        boolean zM3186k = c0788g.m3186k();
        AbstractC0275b abstractC0275bMo80a = c0788g.mo80a();
        boolean z2 = abstractC0275bMo80a != null && abstractC0275bMo80a.mo911a();
        if (c0788g.m3185j()) {
            boolean zExpandActionView = c0788g.expandActionView() | zM3186k;
            if (zExpandActionView) {
                m3154e(true);
            }
            return zExpandActionView;
        }
        if (!c0788g.hasSubMenu() && !z2) {
            if ((i3 & 1) == 0) {
                m3154e(true);
            }
            return zM3186k;
        }
        if ((i3 & 4) == 0) {
            m3154e(false);
        }
        if (!c0788g.hasSubMenu()) {
            c0788g.m3199x(new SubMenuC0794m(m3170w(), this, c0788g));
        }
        SubMenuC0794m subMenuC0794m = (SubMenuC0794m) c0788g.getSubMenu();
        if (z2) {
            abstractC0275bMo80a.mo915e(subMenuC0794m);
        }
        boolean zM3121l = m3121l(subMenuC0794m, interfaceC0791j) | zM3186k;
        if (!zM3121l) {
            m3154e(true);
        }
        return zM3121l;
    }

    /* JADX INFO: renamed from: R */
    public void m3138R(InterfaceC0791j interfaceC0791j) {
        for (WeakReference weakReference : this.f3008w) {
            InterfaceC0791j interfaceC0791j2 = (InterfaceC0791j) weakReference.get();
            if (interfaceC0791j2 == null || interfaceC0791j2 == interfaceC0791j) {
                this.f3008w.remove(weakReference);
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public void m3139S(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo3169v());
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = getItem(i3);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0794m) item.getSubMenu()).m3139S(bundle);
            }
        }
        int i4 = bundle.getInt("android:menu:expandedactionview");
        if (i4 <= 0 || (menuItemFindItem = findItem(i4)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    /* JADX INFO: renamed from: T */
    public void m3140T(Bundle bundle) {
        m3119j(bundle);
    }

    /* JADX INFO: renamed from: U */
    public void m3141U(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = getItem(i3);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0794m) item.getSubMenu()).m3141U(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo3169v(), sparseArray);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m3142V(Bundle bundle) {
        m3120k(bundle);
    }

    /* JADX INFO: renamed from: W */
    public void mo3143W(a aVar) {
        this.f2990e = aVar;
    }

    /* JADX INFO: renamed from: X */
    public C0786e m3144X(int i3) {
        this.f2997l = i3;
        return this;
    }

    /* JADX INFO: renamed from: Y */
    void m3145Y(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f2991f.size();
        m3160i0();
        for (int i3 = 0; i3 < size; i3++) {
            C0788g c0788g = (C0788g) this.f2991f.get(i3);
            if (c0788g.getGroupId() == groupId && c0788g.m3188m() && c0788g.isCheckable()) {
                c0788g.m3194s(c0788g == menuItem);
            }
        }
        m3159h0();
    }

    /* JADX INFO: renamed from: Z */
    protected C0786e m3146Z(int i3) {
        m3115b0(0, null, i3, null, null);
        return this;
    }

    /* JADX INFO: renamed from: a */
    protected MenuItem mo3147a(int i3, int i4, int i5, CharSequence charSequence) {
        int iM3113D = m3113D(i5);
        C0788g c0788gM3116g = m3116g(i3, i4, i5, iM3113D, charSequence, this.f2997l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f2998m;
        if (contextMenuInfo != null) {
            c0788gM3116g.m3197v(contextMenuInfo);
        }
        ArrayList arrayList = this.f2991f;
        arrayList.add(m3122p(arrayList, iM3113D), c0788gM3116g);
        mo3135N(true);
        return c0788gM3116g;
    }

    /* JADX INFO: renamed from: a0 */
    protected C0786e m3148a0(Drawable drawable) {
        m3115b0(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return mo3147a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i3, int i4, int i5, ComponentName componentName, Intent[] intentArr, Intent intent, int i6, MenuItem[] menuItemArr) {
        int i7;
        PackageManager packageManager = this.f2986a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i6 & 1) == 0) {
            removeGroup(i3);
        }
        for (int i8 = 0; i8 < size; i8++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i8);
            int i9 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i9 < 0 ? intent : intentArr[i9]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i3, i4, i5, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i7 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i7] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* JADX INFO: renamed from: b */
    public void m3149b(InterfaceC0791j interfaceC0791j) {
        m3150c(interfaceC0791j, this.f2986a);
    }

    /* JADX INFO: renamed from: c */
    public void m3150c(InterfaceC0791j interfaceC0791j, Context context) {
        this.f3008w.add(new WeakReference(interfaceC0791j));
        interfaceC0791j.mo3064d(context, this);
        this.f2996k = true;
    }

    /* JADX INFO: renamed from: c0 */
    protected C0786e m3151c0(int i3) {
        m3115b0(i3, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        C0788g c0788g = this.f3009x;
        if (c0788g != null) {
            mo3156f(c0788g);
        }
        this.f2991f.clear();
        mo3135N(true);
    }

    public void clearHeader() {
        this.f3000o = null;
        this.f2999n = null;
        this.f3001p = null;
        mo3135N(false);
    }

    @Override // android.view.Menu
    public void close() {
        m3154e(true);
    }

    /* JADX INFO: renamed from: d */
    public void m3152d() {
        a aVar = this.f2990e;
        if (aVar != null) {
            aVar.mo2720b(this);
        }
    }

    /* JADX INFO: renamed from: d0 */
    protected C0786e m3153d0(CharSequence charSequence) {
        m3115b0(0, charSequence, 0, null, null);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m3154e(boolean z2) {
        if (this.f3006u) {
            return;
        }
        this.f3006u = true;
        for (WeakReference weakReference : this.f3008w) {
            InterfaceC0791j interfaceC0791j = (InterfaceC0791j) weakReference.get();
            if (interfaceC0791j == null) {
                this.f3008w.remove(weakReference);
            } else {
                interfaceC0791j.mo3061a(this, z2);
            }
        }
        this.f3006u = false;
    }

    /* JADX INFO: renamed from: e0 */
    protected C0786e m3155e0(View view) {
        m3115b0(0, null, 0, null, view);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo3156f(C0788g c0788g) {
        boolean zMo3069l = false;
        if (!this.f3008w.isEmpty() && this.f3009x == c0788g) {
            m3160i0();
            for (WeakReference weakReference : this.f3008w) {
                InterfaceC0791j interfaceC0791j = (InterfaceC0791j) weakReference.get();
                if (interfaceC0791j != null) {
                    zMo3069l = interfaceC0791j.mo3069l(this, c0788g);
                    if (zMo3069l) {
                        break;
                    }
                } else {
                    this.f3008w.remove(weakReference);
                }
            }
            m3159h0();
            if (zMo3069l) {
                this.f3009x = null;
            }
        }
        return zMo3069l;
    }

    /* JADX INFO: renamed from: f0 */
    public void m3157f0(boolean z2) {
        this.f3011z = z2;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i3) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            C0788g c0788g = (C0788g) this.f2991f.get(i4);
            if (c0788g.getItemId() == i3) {
                return c0788g;
            }
            if (c0788g.hasSubMenu() && (menuItemFindItem = c0788g.getSubMenu().findItem(i3)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i3) {
        return (MenuItem) this.f2991f.get(i3);
    }

    /* JADX INFO: renamed from: h */
    boolean mo3158h(C0786e c0786e, MenuItem menuItem) {
        a aVar = this.f2990e;
        return aVar != null && aVar.mo2719a(c0786e, menuItem);
    }

    /* JADX INFO: renamed from: h0 */
    public void m3159h0() {
        this.f3002q = false;
        if (this.f3003r) {
            this.f3003r = false;
            mo3135N(this.f3004s);
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f3011z) {
            return true;
        }
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((C0788g) this.f2991f.get(i3)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i0 */
    public void m3160i0() {
        if (this.f3002q) {
            return;
        }
        this.f3002q = true;
        this.f3003r = false;
        this.f3004s = false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i3, KeyEvent keyEvent) {
        return m3165r(i3, keyEvent) != null;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo3161m(C0788g c0788g) {
        boolean zMo3070m = false;
        if (this.f3008w.isEmpty()) {
            return false;
        }
        m3160i0();
        for (WeakReference weakReference : this.f3008w) {
            InterfaceC0791j interfaceC0791j = (InterfaceC0791j) weakReference.get();
            if (interfaceC0791j != null) {
                zMo3070m = interfaceC0791j.mo3070m(this, c0788g);
                if (zMo3070m) {
                    break;
                }
            } else {
                this.f3008w.remove(weakReference);
            }
        }
        m3159h0();
        if (zMo3070m) {
            this.f3009x = c0788g;
        }
        return zMo3070m;
    }

    /* JADX INFO: renamed from: n */
    public int m3162n(int i3) {
        return m3163o(i3, 0);
    }

    /* JADX INFO: renamed from: o */
    public int m3163o(int i3, int i4) {
        int size = size();
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < size) {
            if (((C0788g) this.f2991f.get(i4)).getGroupId() == i3) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i3, int i4) {
        return m3136O(findItem(i3), i4);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i3, KeyEvent keyEvent, int i4) {
        C0788g c0788gM3165r = m3165r(i3, keyEvent);
        boolean zM3136O = c0788gM3165r != null ? m3136O(c0788gM3165r, i4) : false;
        if ((i4 & 2) != 0) {
            m3154e(true);
        }
        return zM3136O;
    }

    /* JADX INFO: renamed from: q */
    public int m3164q(int i3) {
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((C0788g) this.f2991f.get(i4)).getItemId() == i3) {
                return i4;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: r */
    C0788g m3165r(int i3, KeyEvent keyEvent) {
        ArrayList arrayList = this.f3007v;
        arrayList.clear();
        m3166s(arrayList, i3, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0788g) arrayList.get(0);
        }
        boolean zMo3131J = mo3131J();
        for (int i4 = 0; i4 < size; i4++) {
            C0788g c0788g = (C0788g) arrayList.get(i4);
            char alphabeticShortcut = zMo3131J ? c0788g.getAlphabeticShortcut() : c0788g.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zMo3131J && alphabeticShortcut == '\b' && i3 == 67))) {
                return c0788g;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void removeGroup(int i3) {
        int iM3162n = m3162n(i3);
        if (iM3162n >= 0) {
            int size = this.f2991f.size() - iM3162n;
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                if (i4 >= size || ((C0788g) this.f2991f.get(iM3162n)).getGroupId() != i3) {
                    break;
                }
                m3114Q(iM3162n, false);
                i4 = i5;
            }
            mo3135N(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i3) {
        m3114Q(m3164q(i3), true);
    }

    /* JADX INFO: renamed from: s */
    void m3166s(List list, int i3, KeyEvent keyEvent) {
        boolean zMo3131J = mo3131J();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i3 == 67) {
            int size = this.f2991f.size();
            for (int i4 = 0; i4 < size; i4++) {
                C0788g c0788g = (C0788g) this.f2991f.get(i4);
                if (c0788g.hasSubMenu()) {
                    ((C0786e) c0788g.getSubMenu()).m3166s(list, i3, keyEvent);
                }
                char alphabeticShortcut = zMo3131J ? c0788g.getAlphabeticShortcut() : c0788g.getNumericShortcut();
                if ((modifiers & 69647) == ((zMo3131J ? c0788g.getAlphabeticModifiers() : c0788g.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zMo3131J && alphabeticShortcut == '\b' && i3 == 67)) && c0788g.isEnabled()) {
                        list.add(c0788g);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i3, boolean z2, boolean z3) {
        int size = this.f2991f.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0788g c0788g = (C0788g) this.f2991f.get(i4);
            if (c0788g.getGroupId() == i3) {
                c0788g.m3195t(z3);
                c0788g.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f3010y = z2;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i3, boolean z2) {
        int size = this.f2991f.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0788g c0788g = (C0788g) this.f2991f.get(i4);
            if (c0788g.getGroupId() == i3) {
                c0788g.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i3, boolean z2) {
        int size = this.f2991f.size();
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            C0788g c0788g = (C0788g) this.f2991f.get(i4);
            if (c0788g.getGroupId() == i3 && c0788g.m3200y(z2)) {
                z3 = true;
            }
        }
        if (z3) {
            mo3135N(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f2988c = z2;
        mo3135N(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f2991f.size();
    }

    /* JADX INFO: renamed from: t */
    public void m3167t() {
        ArrayList arrayListM3128G = m3128G();
        if (this.f2996k) {
            boolean zMo3089j = false;
            for (WeakReference weakReference : this.f3008w) {
                InterfaceC0791j interfaceC0791j = (InterfaceC0791j) weakReference.get();
                if (interfaceC0791j == null) {
                    this.f3008w.remove(weakReference);
                } else {
                    zMo3089j |= interfaceC0791j.mo3089j();
                }
            }
            if (zMo3089j) {
                this.f2994i.clear();
                this.f2995j.clear();
                int size = arrayListM3128G.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C0788g c0788g = (C0788g) arrayListM3128G.get(i3);
                    if (c0788g.m3187l()) {
                        this.f2994i.add(c0788g);
                    } else {
                        this.f2995j.add(c0788g);
                    }
                }
            } else {
                this.f2994i.clear();
                this.f2995j.clear();
                this.f2995j.addAll(m3128G());
            }
            this.f2996k = false;
        }
    }

    /* JADX INFO: renamed from: u */
    public ArrayList m3168u() {
        m3167t();
        return this.f2994i;
    }

    /* JADX INFO: renamed from: v */
    protected String mo3169v() {
        return "android:menu:actionviewstates";
    }

    /* JADX INFO: renamed from: w */
    public Context m3170w() {
        return this.f2986a;
    }

    /* JADX INFO: renamed from: x */
    public C0788g m3171x() {
        return this.f3009x;
    }

    /* JADX INFO: renamed from: y */
    public Drawable m3172y() {
        return this.f3000o;
    }

    /* JADX INFO: renamed from: z */
    public CharSequence m3173z() {
        return this.f2999n;
    }

    @Override // android.view.Menu
    public MenuItem add(int i3) {
        return mo3147a(0, 0, 0, this.f2987b.getString(i3));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i3) {
        return addSubMenu(0, 0, 0, this.f2987b.getString(i3));
    }

    @Override // android.view.Menu
    public MenuItem add(int i3, int i4, int i5, CharSequence charSequence) {
        return mo3147a(i3, i4, i5, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i3, int i4, int i5, CharSequence charSequence) {
        C0788g c0788g = (C0788g) mo3147a(i3, i4, i5, charSequence);
        SubMenuC0794m subMenuC0794m = new SubMenuC0794m(this.f2986a, this, c0788g);
        c0788g.m3199x(subMenuC0794m);
        return subMenuC0794m;
    }

    @Override // android.view.Menu
    public MenuItem add(int i3, int i4, int i5, int i6) {
        return mo3147a(i3, i4, i5, this.f2987b.getString(i6));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i3, int i4, int i5, int i6) {
        return addSubMenu(i3, i4, i5, this.f2987b.getString(i6));
    }
}
