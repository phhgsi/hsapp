package androidx.preference;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.common.api.Api;
import java.util.List;
import p075Z.AbstractC0623a;
import p075Z.AbstractC0624b;
import p075Z.AbstractC0625c;
import p075Z.AbstractC0627e;
import p075Z.AbstractC0629g;
import p164y.AbstractC2541n;

/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* JADX INFO: renamed from: A */
    private boolean f5418A;

    /* JADX INFO: renamed from: B */
    private int f5419B;

    /* JADX INFO: renamed from: C */
    private int f5420C;

    /* JADX INFO: renamed from: D */
    private List f5421D;

    /* JADX INFO: renamed from: E */
    private InterfaceC1152b f5422E;

    /* JADX INFO: renamed from: F */
    private final View.OnClickListener f5423F;

    /* JADX INFO: renamed from: d */
    private final Context f5424d;

    /* JADX INFO: renamed from: e */
    private int f5425e;

    /* JADX INFO: renamed from: f */
    private int f5426f;

    /* JADX INFO: renamed from: g */
    private CharSequence f5427g;

    /* JADX INFO: renamed from: h */
    private CharSequence f5428h;

    /* JADX INFO: renamed from: i */
    private int f5429i;

    /* JADX INFO: renamed from: j */
    private String f5430j;

    /* JADX INFO: renamed from: k */
    private Intent f5431k;

    /* JADX INFO: renamed from: l */
    private String f5432l;

    /* JADX INFO: renamed from: m */
    private boolean f5433m;

    /* JADX INFO: renamed from: n */
    private boolean f5434n;

    /* JADX INFO: renamed from: o */
    private boolean f5435o;

    /* JADX INFO: renamed from: p */
    private String f5436p;

    /* JADX INFO: renamed from: q */
    private Object f5437q;

    /* JADX INFO: renamed from: r */
    private boolean f5438r;

    /* JADX INFO: renamed from: s */
    private boolean f5439s;

    /* JADX INFO: renamed from: t */
    private boolean f5440t;

    /* JADX INFO: renamed from: u */
    private boolean f5441u;

    /* JADX INFO: renamed from: v */
    private boolean f5442v;

    /* JADX INFO: renamed from: w */
    private boolean f5443w;

    /* JADX INFO: renamed from: x */
    private boolean f5444x;

    /* JADX INFO: renamed from: y */
    private boolean f5445y;

    /* JADX INFO: renamed from: z */
    private boolean f5446z;

    /* JADX INFO: renamed from: androidx.preference.Preference$a */
    class ViewOnClickListenerC1151a implements View.OnClickListener {
        ViewOnClickListenerC1151a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.mo5203y(view);
        }
    }

    /* JADX INFO: renamed from: androidx.preference.Preference$b */
    public interface InterfaceC1152b {
        /* JADX INFO: renamed from: a */
        CharSequence mo5212a(Preference preference);
    }

    public Preference(Context context, AttributeSet attributeSet, int i3, int i4) {
        this.f5425e = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f5426f = 0;
        this.f5433m = true;
        this.f5434n = true;
        this.f5435o = true;
        this.f5438r = true;
        this.f5439s = true;
        this.f5440t = true;
        this.f5441u = true;
        this.f5442v = true;
        this.f5444x = true;
        this.f5418A = true;
        int i5 = AbstractC0627e.f2050a;
        this.f5419B = i5;
        this.f5423F = new ViewOnClickListenerC1151a();
        this.f5424d = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0629g.f2068I, i3, i4);
        this.f5429i = AbstractC2541n.m12175n(typedArrayObtainStyledAttributes, AbstractC0629g.f2122g0, AbstractC0629g.f2070J, 0);
        this.f5430j = AbstractC2541n.m12176o(typedArrayObtainStyledAttributes, AbstractC0629g.f2128j0, AbstractC0629g.f2082P);
        this.f5427g = AbstractC2541n.m12177p(typedArrayObtainStyledAttributes, AbstractC0629g.f2144r0, AbstractC0629g.f2078N);
        this.f5428h = AbstractC2541n.m12177p(typedArrayObtainStyledAttributes, AbstractC0629g.f2142q0, AbstractC0629g.f2084Q);
        this.f5425e = AbstractC2541n.m12165d(typedArrayObtainStyledAttributes, AbstractC0629g.f2132l0, AbstractC0629g.f2086R, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.f5432l = AbstractC2541n.m12176o(typedArrayObtainStyledAttributes, AbstractC0629g.f2120f0, AbstractC0629g.f2096W);
        this.f5419B = AbstractC2541n.m12175n(typedArrayObtainStyledAttributes, AbstractC0629g.f2130k0, AbstractC0629g.f2076M, i5);
        this.f5420C = AbstractC2541n.m12175n(typedArrayObtainStyledAttributes, AbstractC0629g.f2146s0, AbstractC0629g.f2088S, 0);
        this.f5433m = AbstractC2541n.m12163b(typedArrayObtainStyledAttributes, AbstractC0629g.f2117e0, AbstractC0629g.f2074L, true);
        this.f5434n = AbstractC2541n.m12163b(typedArrayObtainStyledAttributes, AbstractC0629g.f2136n0, AbstractC0629g.f2080O, true);
        this.f5435o = AbstractC2541n.m12163b(typedArrayObtainStyledAttributes, AbstractC0629g.f2134m0, AbstractC0629g.f2072K, true);
        this.f5436p = AbstractC2541n.m12176o(typedArrayObtainStyledAttributes, AbstractC0629g.f2111c0, AbstractC0629g.f2090T);
        int i6 = AbstractC0629g.f2102Z;
        this.f5441u = AbstractC2541n.m12163b(typedArrayObtainStyledAttributes, i6, i6, this.f5434n);
        int i7 = AbstractC0629g.f2105a0;
        this.f5442v = AbstractC2541n.m12163b(typedArrayObtainStyledAttributes, i7, i7, this.f5434n);
        int i8 = AbstractC0629g.f2108b0;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            this.f5437q = mo5210v(typedArrayObtainStyledAttributes, i8);
        } else {
            int i9 = AbstractC0629g.f2092U;
            if (typedArrayObtainStyledAttributes.hasValue(i9)) {
                this.f5437q = mo5210v(typedArrayObtainStyledAttributes, i9);
            }
        }
        this.f5418A = AbstractC2541n.m12163b(typedArrayObtainStyledAttributes, AbstractC0629g.f2138o0, AbstractC0629g.f2094V, true);
        int i10 = AbstractC0629g.f2140p0;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i10);
        this.f5443w = zHasValue;
        if (zHasValue) {
            this.f5444x = AbstractC2541n.m12163b(typedArrayObtainStyledAttributes, i10, AbstractC0629g.f2098X, true);
        }
        this.f5445y = AbstractC2541n.m12163b(typedArrayObtainStyledAttributes, AbstractC0629g.f2124h0, AbstractC0629g.f2100Y, false);
        int i11 = AbstractC0629g.f2126i0;
        this.f5440t = AbstractC2541n.m12163b(typedArrayObtainStyledAttributes, i11, i11, true);
        int i12 = AbstractC0629g.f2114d0;
        this.f5446z = AbstractC2541n.m12163b(typedArrayObtainStyledAttributes, i12, i12, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: A */
    protected boolean m5224A(int i3) {
        if (!m5227E()) {
            return false;
        }
        if (i3 == m5235h(~i3)) {
            return true;
        }
        m5237j();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    /* JADX INFO: renamed from: B */
    protected boolean m5225B(String str) {
        if (!m5227E()) {
            return false;
        }
        Object obj = null;
        if (TextUtils.equals(str, m5236i(null))) {
            return true;
        }
        m5237j();
        obj.getClass();
        throw null;
    }

    /* JADX INFO: renamed from: C */
    public final void m5226C(InterfaceC1152b interfaceC1152b) {
        this.f5422E = interfaceC1152b;
        mo5207r();
    }

    /* JADX INFO: renamed from: D */
    public boolean mo5208D() {
        return !mo5242p();
    }

    /* JADX INFO: renamed from: E */
    protected boolean m5227E() {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean m5228a(Object obj) {
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(Preference preference) {
        int i3 = this.f5425e;
        int i4 = preference.f5425e;
        if (i3 != i4) {
            return i3 - i4;
        }
        CharSequence charSequence = this.f5427g;
        CharSequence charSequence2 = preference.f5427g;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f5427g.toString());
    }

    /* JADX INFO: renamed from: c */
    public Context m5230c() {
        return this.f5424d;
    }

    /* JADX INFO: renamed from: d */
    StringBuilder m5231d() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequenceM5240n = m5240n();
        if (!TextUtils.isEmpty(charSequenceM5240n)) {
            sb.append(charSequenceM5240n);
            sb.append(' ');
        }
        CharSequence charSequenceMo5221l = mo5221l();
        if (!TextUtils.isEmpty(charSequenceMo5221l)) {
            sb.append(charSequenceMo5221l);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    /* JADX INFO: renamed from: e */
    public String m5232e() {
        return this.f5432l;
    }

    /* JADX INFO: renamed from: f */
    public Intent m5233f() {
        return this.f5431k;
    }

    /* JADX INFO: renamed from: g */
    protected boolean m5234g(boolean z2) {
        if (!m5227E()) {
            return z2;
        }
        m5237j();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    /* JADX INFO: renamed from: h */
    protected int m5235h(int i3) {
        if (!m5227E()) {
            return i3;
        }
        m5237j();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    /* JADX INFO: renamed from: i */
    protected String m5236i(String str) {
        if (!m5227E()) {
            return str;
        }
        m5237j();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public AbstractC0623a m5237j() {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public AbstractC0624b m5238k() {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public CharSequence mo5221l() {
        return m5239m() != null ? m5239m().mo5212a(this) : this.f5428h;
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC1152b m5239m() {
        return this.f5422E;
    }

    /* JADX INFO: renamed from: n */
    public CharSequence m5240n() {
        return this.f5427g;
    }

    /* JADX INFO: renamed from: o */
    public boolean m5241o() {
        return !TextUtils.isEmpty(this.f5430j);
    }

    /* JADX INFO: renamed from: p */
    public boolean mo5242p() {
        return this.f5433m && this.f5438r && this.f5439s;
    }

    /* JADX INFO: renamed from: q */
    public boolean m5243q() {
        return this.f5434n;
    }

    /* JADX INFO: renamed from: r */
    protected void mo5207r() {
    }

    /* JADX INFO: renamed from: s */
    public void mo5244s(boolean z2) {
        List list = this.f5421D;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((Preference) list.get(i3)).m5245u(this, z2);
        }
    }

    /* JADX INFO: renamed from: t */
    protected void mo5204t() {
    }

    public String toString() {
        return m5231d().toString();
    }

    /* JADX INFO: renamed from: u */
    public void m5245u(Preference preference, boolean z2) {
        if (this.f5438r == z2) {
            this.f5438r = !z2;
            mo5244s(mo5208D());
            mo5207r();
        }
    }

    /* JADX INFO: renamed from: v */
    protected Object mo5210v(TypedArray typedArray, int i3) {
        return null;
    }

    /* JADX INFO: renamed from: w */
    public void m5246w(Preference preference, boolean z2) {
        if (this.f5439s == z2) {
            this.f5439s = !z2;
            mo5244s(mo5208D());
            mo5207r();
        }
    }

    /* JADX INFO: renamed from: x */
    public void m5247x() {
        if (mo5242p() && m5243q()) {
            mo5204t();
            m5238k();
            if (this.f5431k != null) {
                m5230c().startActivity(this.f5431k);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    protected void mo5203y(View view) {
        m5247x();
    }

    /* JADX INFO: renamed from: z */
    protected boolean m5248z(boolean z2) {
        if (!m5227E()) {
            return false;
        }
        if (z2 == m5234g(!z2)) {
            return true;
        }
        m5237j();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public Preference(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2541n.m12162a(context, AbstractC0625c.f2045g, R.attr.preferenceStyle));
    }
}
