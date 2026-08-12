package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.InterfaceC0791j;
import androidx.appcompat.view.menu.InterfaceC0792k;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0782a implements InterfaceC0791j {

    /* JADX INFO: renamed from: a */
    protected Context f2920a;

    /* JADX INFO: renamed from: b */
    protected Context f2921b;

    /* JADX INFO: renamed from: c */
    protected C0786e f2922c;

    /* JADX INFO: renamed from: d */
    protected LayoutInflater f2923d;

    /* JADX INFO: renamed from: e */
    protected LayoutInflater f2924e;

    /* JADX INFO: renamed from: f */
    private InterfaceC0791j.a f2925f;

    /* JADX INFO: renamed from: g */
    private int f2926g;

    /* JADX INFO: renamed from: h */
    private int f2927h;

    /* JADX INFO: renamed from: i */
    protected InterfaceC0792k f2928i;

    /* JADX INFO: renamed from: j */
    private int f2929j;

    public AbstractC0782a(Context context, int i3, int i4) {
        this.f2920a = context;
        this.f2923d = LayoutInflater.from(context);
        this.f2926g = i3;
        this.f2927h = i4;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: a */
    public void mo3061a(C0786e c0786e, boolean z2) {
        InterfaceC0791j.a aVar = this.f2925f;
        if (aVar != null) {
            aVar.mo2717a(c0786e, z2);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: b */
    public int mo3062b() {
        return this.f2929j;
    }

    /* JADX INFO: renamed from: c */
    protected void m3063c(View view, int i3) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f2928i).addView(view, i3);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: d */
    public void mo3064d(Context context, C0786e c0786e) {
        this.f2921b = context;
        this.f2924e = LayoutInflater.from(context);
        this.f2922c = c0786e;
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo3065e(C0788g c0788g, InterfaceC0792k.a aVar);

    /* JADX INFO: renamed from: g */
    public InterfaceC0792k.a m3066g(ViewGroup viewGroup) {
        return (InterfaceC0792k.a) this.f2923d.inflate(this.f2927h, viewGroup, false);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: h */
    public boolean mo3067h(SubMenuC0794m subMenuC0794m) {
        InterfaceC0791j.a aVar = this.f2925f;
        C0786e c0786e = subMenuC0794m;
        if (aVar == null) {
            return false;
        }
        if (subMenuC0794m == null) {
            c0786e = this.f2922c;
        }
        return aVar.mo2718b(c0786e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: i */
    public void mo3068i(boolean z2) {
        ViewGroup viewGroup = (ViewGroup) this.f2928i;
        if (viewGroup == null) {
            return;
        }
        C0786e c0786e = this.f2922c;
        int i3 = 0;
        if (c0786e != null) {
            c0786e.m3167t();
            ArrayList arrayListM3128G = this.f2922c.m3128G();
            int size = arrayListM3128G.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                C0788g c0788g = (C0788g) arrayListM3128G.get(i5);
                if (mo3077t(i4, c0788g)) {
                    View childAt = viewGroup.getChildAt(i4);
                    C0788g itemData = childAt instanceof InterfaceC0792k.a ? ((InterfaceC0792k.a) childAt).getItemData() : null;
                    View viewMo3074q = mo3074q(c0788g, childAt, viewGroup);
                    if (c0788g != itemData) {
                        viewMo3074q.setPressed(false);
                        viewMo3074q.jumpDrawablesToCurrentState();
                    }
                    if (viewMo3074q != childAt) {
                        m3063c(viewMo3074q, i4);
                    }
                    i4++;
                }
            }
            i3 = i4;
        }
        while (i3 < viewGroup.getChildCount()) {
            if (!mo3072o(viewGroup, i3)) {
                i3++;
            }
        }
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
        this.f2925f = aVar;
    }

    /* JADX INFO: renamed from: o */
    protected boolean mo3072o(ViewGroup viewGroup, int i3) {
        viewGroup.removeViewAt(i3);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public InterfaceC0791j.a m3073p() {
        return this.f2925f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public View mo3074q(C0788g c0788g, View view, ViewGroup viewGroup) {
        InterfaceC0792k.a aVarM3066g = view instanceof InterfaceC0792k.a ? (InterfaceC0792k.a) view : m3066g(viewGroup);
        mo3065e(c0788g, aVarM3066g);
        return (View) aVarM3066g;
    }

    /* JADX INFO: renamed from: r */
    public InterfaceC0792k mo3075r(ViewGroup viewGroup) {
        if (this.f2928i == null) {
            InterfaceC0792k interfaceC0792k = (InterfaceC0792k) this.f2923d.inflate(this.f2926g, viewGroup, false);
            this.f2928i = interfaceC0792k;
            interfaceC0792k.mo3054b(this.f2922c);
            mo3068i(true);
        }
        return this.f2928i;
    }

    /* JADX INFO: renamed from: s */
    public void m3076s(int i3) {
        this.f2929j = i3;
    }

    /* JADX INFO: renamed from: t */
    public abstract boolean mo3077t(int i3, C0788g c0788g);
}
