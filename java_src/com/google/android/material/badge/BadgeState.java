package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.material.drawable.AbstractC1519d;
import com.google.android.material.internal.AbstractC1546q;
import java.util.Locale;
import p016F0.AbstractC0142c;
import p016F0.AbstractC0147h;
import p016F0.AbstractC0148i;
import p016F0.AbstractC0149j;
import p016F0.AbstractC0150k;
import p067W0.AbstractC0557c;
import p067W0.C0559e;

/* JADX INFO: loaded from: classes.dex */
public final class BadgeState {

    /* JADX INFO: renamed from: a */
    private final State f6972a;

    /* JADX INFO: renamed from: b */
    private final State f6973b;

    /* JADX INFO: renamed from: c */
    final float f6974c;

    /* JADX INFO: renamed from: d */
    final float f6975d;

    /* JADX INFO: renamed from: e */
    final float f6976e;

    /* JADX INFO: renamed from: f */
    final float f6977f;

    /* JADX INFO: renamed from: g */
    final float f6978g;

    /* JADX INFO: renamed from: h */
    final float f6979h;

    /* JADX INFO: renamed from: i */
    final int f6980i;

    /* JADX INFO: renamed from: j */
    final int f6981j;

    /* JADX INFO: renamed from: k */
    int f6982k;

    /* JADX INFO: renamed from: l */
    int f6983l;

    BadgeState(Context context, int i3, int i4, int i5, State state) {
        State state2 = new State();
        this.f6973b = state2;
        state = state == null ? new State() : state;
        if (i3 != 0) {
            state.f6992d = i3;
        }
        TypedArray typedArrayM7381a = m7381a(context, state.f6992d, i4, i5);
        Resources resources = context.getResources();
        this.f6974c = typedArrayM7381a.getDimensionPixelSize(AbstractC0150k.f1032v, -1);
        this.f6980i = context.getResources().getDimensionPixelSize(AbstractC0142c.f394a0);
        this.f6981j = context.getResources().getDimensionPixelSize(AbstractC0142c.f398c0);
        this.f6975d = typedArrayM7381a.getDimensionPixelSize(AbstractC0150k.f639F, -1);
        int i6 = AbstractC0150k.f621D;
        int i7 = AbstractC0142c.f431t;
        this.f6976e = typedArrayM7381a.getDimension(i6, resources.getDimension(i7));
        int i8 = AbstractC0150k.f666I;
        int i9 = AbstractC0142c.f433u;
        this.f6978g = typedArrayM7381a.getDimension(i8, resources.getDimension(i9));
        this.f6977f = typedArrayM7381a.getDimension(AbstractC0150k.f1023u, resources.getDimension(i7));
        this.f6979h = typedArrayM7381a.getDimension(AbstractC0150k.f630E, resources.getDimension(i9));
        boolean z2 = true;
        this.f6982k = typedArrayM7381a.getInt(AbstractC0150k.f729P, 1);
        this.f6983l = typedArrayM7381a.getInt(AbstractC0150k.f1005s, 0);
        state2.f7000l = state.f7000l == -2 ? 255 : state.f7000l;
        if (state.f7002n != -2) {
            state2.f7002n = state.f7002n;
        } else {
            int i10 = AbstractC0150k.f720O;
            if (typedArrayM7381a.hasValue(i10)) {
                state2.f7002n = typedArrayM7381a.getInt(i10, 0);
            } else {
                state2.f7002n = -1;
            }
        }
        if (state.f7001m != null) {
            state2.f7001m = state.f7001m;
        } else {
            int i11 = AbstractC0150k.f1059y;
            if (typedArrayM7381a.hasValue(i11)) {
                state2.f7001m = typedArrayM7381a.getString(i11);
            }
        }
        state2.f7006r = state.f7006r;
        state2.f7007s = state.f7007s == null ? context.getString(AbstractC0148i.f550j) : state.f7007s;
        state2.f7008t = state.f7008t == 0 ? AbstractC0147h.f536a : state.f7008t;
        state2.f7009u = state.f7009u == 0 ? AbstractC0148i.f555o : state.f7009u;
        if (state.f7011w != null && !state.f7011w.booleanValue()) {
            z2 = false;
        }
        state2.f7011w = Boolean.valueOf(z2);
        state2.f7003o = state.f7003o == -2 ? typedArrayM7381a.getInt(AbstractC0150k.f702M, -2) : state.f7003o;
        state2.f7004p = state.f7004p == -2 ? typedArrayM7381a.getInt(AbstractC0150k.f711N, -2) : state.f7004p;
        state2.f6996h = Integer.valueOf(state.f6996h == null ? typedArrayM7381a.getResourceId(AbstractC0150k.f1041w, AbstractC0149j.f570c) : state.f6996h.intValue());
        state2.f6997i = Integer.valueOf(state.f6997i == null ? typedArrayM7381a.getResourceId(AbstractC0150k.f1050x, 0) : state.f6997i.intValue());
        state2.f6998j = Integer.valueOf(state.f6998j == null ? typedArrayM7381a.getResourceId(AbstractC0150k.f648G, AbstractC0149j.f570c) : state.f6998j.intValue());
        state2.f6999k = Integer.valueOf(state.f6999k == null ? typedArrayM7381a.getResourceId(AbstractC0150k.f657H, 0) : state.f6999k.intValue());
        state2.f6993e = Integer.valueOf(state.f6993e == null ? m7380H(context, typedArrayM7381a, AbstractC0150k.f996r) : state.f6993e.intValue());
        state2.f6995g = Integer.valueOf(state.f6995g == null ? typedArrayM7381a.getResourceId(AbstractC0150k.f1068z, AbstractC0149j.f571d) : state.f6995g.intValue());
        if (state.f6994f != null) {
            state2.f6994f = state.f6994f;
        } else {
            int i12 = AbstractC0150k.f594A;
            if (typedArrayM7381a.hasValue(i12)) {
                state2.f6994f = Integer.valueOf(m7380H(context, typedArrayM7381a, i12));
            } else {
                state2.f6994f = Integer.valueOf(new C0559e(context, state2.f6995g.intValue()).m2101j().getDefaultColor());
            }
        }
        state2.f7010v = Integer.valueOf(state.f7010v == null ? typedArrayM7381a.getInt(AbstractC0150k.f1014t, 8388661) : state.f7010v.intValue());
        state2.f7012x = Integer.valueOf(state.f7012x == null ? typedArrayM7381a.getDimensionPixelSize(AbstractC0150k.f612C, resources.getDimensionPixelSize(AbstractC0142c.f396b0)) : state.f7012x.intValue());
        state2.f7013y = Integer.valueOf(state.f7013y == null ? typedArrayM7381a.getDimensionPixelSize(AbstractC0150k.f603B, resources.getDimensionPixelSize(AbstractC0142c.f435v)) : state.f7013y.intValue());
        state2.f7014z = Integer.valueOf(state.f7014z == null ? typedArrayM7381a.getDimensionPixelOffset(AbstractC0150k.f675J, 0) : state.f7014z.intValue());
        state2.f6984A = Integer.valueOf(state.f6984A == null ? typedArrayM7381a.getDimensionPixelOffset(AbstractC0150k.f738Q, 0) : state.f6984A.intValue());
        state2.f6985B = Integer.valueOf(state.f6985B == null ? typedArrayM7381a.getDimensionPixelOffset(AbstractC0150k.f684K, state2.f7014z.intValue()) : state.f6985B.intValue());
        state2.f6986C = Integer.valueOf(state.f6986C == null ? typedArrayM7381a.getDimensionPixelOffset(AbstractC0150k.f747R, state2.f6984A.intValue()) : state.f6986C.intValue());
        state2.f6989F = Integer.valueOf(state.f6989F == null ? typedArrayM7381a.getDimensionPixelOffset(AbstractC0150k.f693L, 0) : state.f6989F.intValue());
        state2.f6987D = Integer.valueOf(state.f6987D == null ? 0 : state.f6987D.intValue());
        state2.f6988E = Integer.valueOf(state.f6988E == null ? 0 : state.f6988E.intValue());
        state2.f6990G = Boolean.valueOf(state.f6990G == null ? typedArrayM7381a.getBoolean(AbstractC0150k.f987q, false) : state.f6990G.booleanValue());
        typedArrayM7381a.recycle();
        if (state.f7005q == null) {
            state2.f7005q = Build.VERSION.SDK_INT >= 24 ? Locale.getDefault(Locale.Category.FORMAT) : Locale.getDefault();
        } else {
            state2.f7005q = state.f7005q;
        }
        this.f6972a = state;
    }

    /* JADX INFO: renamed from: H */
    private static int m7380H(Context context, TypedArray typedArray, int i3) {
        return AbstractC0557c.m2077a(context, typedArray, i3).getDefaultColor();
    }

    /* JADX INFO: renamed from: a */
    private TypedArray m7381a(Context context, int i3, int i4, int i5) {
        AttributeSet attributeSetM8256i;
        int styleAttribute;
        if (i3 != 0) {
            attributeSetM8256i = AbstractC1519d.m8256i(context, i3, "badge");
            styleAttribute = attributeSetM8256i.getStyleAttribute();
        } else {
            attributeSetM8256i = null;
            styleAttribute = 0;
        }
        return AbstractC1546q.m8488i(context, attributeSetM8256i, AbstractC0150k.f978p, i4, styleAttribute == 0 ? i5 : styleAttribute, new int[0]);
    }

    /* JADX INFO: renamed from: A */
    int m7382A() {
        return this.f6973b.f6995g.intValue();
    }

    /* JADX INFO: renamed from: B */
    int m7383B() {
        return this.f6973b.f6986C.intValue();
    }

    /* JADX INFO: renamed from: C */
    int m7384C() {
        return this.f6973b.f6984A.intValue();
    }

    /* JADX INFO: renamed from: D */
    boolean m7385D() {
        return this.f6973b.f7002n != -1;
    }

    /* JADX INFO: renamed from: E */
    boolean m7386E() {
        return this.f6973b.f7001m != null;
    }

    /* JADX INFO: renamed from: F */
    boolean m7387F() {
        return this.f6973b.f6990G.booleanValue();
    }

    /* JADX INFO: renamed from: G */
    boolean m7388G() {
        return this.f6973b.f7011w.booleanValue();
    }

    /* JADX INFO: renamed from: I */
    void m7389I(int i3) {
        this.f6972a.f7000l = i3;
        this.f6973b.f7000l = i3;
    }

    /* JADX INFO: renamed from: b */
    int m7390b() {
        return this.f6973b.f6987D.intValue();
    }

    /* JADX INFO: renamed from: c */
    int m7391c() {
        return this.f6973b.f6988E.intValue();
    }

    /* JADX INFO: renamed from: d */
    int m7392d() {
        return this.f6973b.f7000l;
    }

    /* JADX INFO: renamed from: e */
    int m7393e() {
        return this.f6973b.f6993e.intValue();
    }

    /* JADX INFO: renamed from: f */
    int m7394f() {
        return this.f6973b.f7010v.intValue();
    }

    /* JADX INFO: renamed from: g */
    int m7395g() {
        return this.f6973b.f7012x.intValue();
    }

    /* JADX INFO: renamed from: h */
    int m7396h() {
        return this.f6973b.f6997i.intValue();
    }

    /* JADX INFO: renamed from: i */
    int m7397i() {
        return this.f6973b.f6996h.intValue();
    }

    /* JADX INFO: renamed from: j */
    int m7398j() {
        return this.f6973b.f6994f.intValue();
    }

    /* JADX INFO: renamed from: k */
    int m7399k() {
        return this.f6973b.f7013y.intValue();
    }

    /* JADX INFO: renamed from: l */
    int m7400l() {
        return this.f6973b.f6999k.intValue();
    }

    /* JADX INFO: renamed from: m */
    int m7401m() {
        return this.f6973b.f6998j.intValue();
    }

    /* JADX INFO: renamed from: n */
    int m7402n() {
        return this.f6973b.f7009u;
    }

    /* JADX INFO: renamed from: o */
    CharSequence m7403o() {
        return this.f6973b.f7006r;
    }

    /* JADX INFO: renamed from: p */
    CharSequence m7404p() {
        return this.f6973b.f7007s;
    }

    /* JADX INFO: renamed from: q */
    int m7405q() {
        return this.f6973b.f7008t;
    }

    /* JADX INFO: renamed from: r */
    int m7406r() {
        return this.f6973b.f6985B.intValue();
    }

    /* JADX INFO: renamed from: s */
    int m7407s() {
        return this.f6973b.f7014z.intValue();
    }

    /* JADX INFO: renamed from: t */
    int m7408t() {
        return this.f6973b.f6989F.intValue();
    }

    /* JADX INFO: renamed from: u */
    int m7409u() {
        return this.f6973b.f7003o;
    }

    /* JADX INFO: renamed from: v */
    int m7410v() {
        return this.f6973b.f7004p;
    }

    /* JADX INFO: renamed from: w */
    int m7411w() {
        return this.f6973b.f7002n;
    }

    /* JADX INFO: renamed from: x */
    Locale m7412x() {
        return this.f6973b.f7005q;
    }

    /* JADX INFO: renamed from: y */
    State m7413y() {
        return this.f6972a;
    }

    /* JADX INFO: renamed from: z */
    String m7414z() {
        return this.f6973b.f7001m;
    }

    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new C1433a();

        /* JADX INFO: renamed from: A */
        private Integer f6984A;

        /* JADX INFO: renamed from: B */
        private Integer f6985B;

        /* JADX INFO: renamed from: C */
        private Integer f6986C;

        /* JADX INFO: renamed from: D */
        private Integer f6987D;

        /* JADX INFO: renamed from: E */
        private Integer f6988E;

        /* JADX INFO: renamed from: F */
        private Integer f6989F;

        /* JADX INFO: renamed from: G */
        private Boolean f6990G;

        /* JADX INFO: renamed from: H */
        private Integer f6991H;

        /* JADX INFO: renamed from: d */
        private int f6992d;

        /* JADX INFO: renamed from: e */
        private Integer f6993e;

        /* JADX INFO: renamed from: f */
        private Integer f6994f;

        /* JADX INFO: renamed from: g */
        private Integer f6995g;

        /* JADX INFO: renamed from: h */
        private Integer f6996h;

        /* JADX INFO: renamed from: i */
        private Integer f6997i;

        /* JADX INFO: renamed from: j */
        private Integer f6998j;

        /* JADX INFO: renamed from: k */
        private Integer f6999k;

        /* JADX INFO: renamed from: l */
        private int f7000l;

        /* JADX INFO: renamed from: m */
        private String f7001m;

        /* JADX INFO: renamed from: n */
        private int f7002n;

        /* JADX INFO: renamed from: o */
        private int f7003o;

        /* JADX INFO: renamed from: p */
        private int f7004p;

        /* JADX INFO: renamed from: q */
        private Locale f7005q;

        /* JADX INFO: renamed from: r */
        private CharSequence f7006r;

        /* JADX INFO: renamed from: s */
        private CharSequence f7007s;

        /* JADX INFO: renamed from: t */
        private int f7008t;

        /* JADX INFO: renamed from: u */
        private int f7009u;

        /* JADX INFO: renamed from: v */
        private Integer f7010v;

        /* JADX INFO: renamed from: w */
        private Boolean f7011w;

        /* JADX INFO: renamed from: x */
        private Integer f7012x;

        /* JADX INFO: renamed from: y */
        private Integer f7013y;

        /* JADX INFO: renamed from: z */
        private Integer f7014z;

        /* JADX INFO: renamed from: com.google.android.material.badge.BadgeState$State$a */
        class C1433a implements Parcelable.Creator {
            C1433a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public State createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public State[] newArray(int i3) {
                return new State[i3];
            }
        }

        public State() {
            this.f7000l = 255;
            this.f7002n = -2;
            this.f7003o = -2;
            this.f7004p = -2;
            this.f7011w = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            parcel.writeInt(this.f6992d);
            parcel.writeSerializable(this.f6993e);
            parcel.writeSerializable(this.f6994f);
            parcel.writeSerializable(this.f6995g);
            parcel.writeSerializable(this.f6996h);
            parcel.writeSerializable(this.f6997i);
            parcel.writeSerializable(this.f6998j);
            parcel.writeSerializable(this.f6999k);
            parcel.writeInt(this.f7000l);
            parcel.writeString(this.f7001m);
            parcel.writeInt(this.f7002n);
            parcel.writeInt(this.f7003o);
            parcel.writeInt(this.f7004p);
            CharSequence charSequence = this.f7006r;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.f7007s;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.f7008t);
            parcel.writeSerializable(this.f7010v);
            parcel.writeSerializable(this.f7012x);
            parcel.writeSerializable(this.f7013y);
            parcel.writeSerializable(this.f7014z);
            parcel.writeSerializable(this.f6984A);
            parcel.writeSerializable(this.f6985B);
            parcel.writeSerializable(this.f6986C);
            parcel.writeSerializable(this.f6989F);
            parcel.writeSerializable(this.f6987D);
            parcel.writeSerializable(this.f6988E);
            parcel.writeSerializable(this.f7011w);
            parcel.writeSerializable(this.f7005q);
            parcel.writeSerializable(this.f6990G);
            parcel.writeSerializable(this.f6991H);
        }

        State(Parcel parcel) {
            this.f7000l = 255;
            this.f7002n = -2;
            this.f7003o = -2;
            this.f7004p = -2;
            this.f7011w = Boolean.TRUE;
            this.f6992d = parcel.readInt();
            this.f6993e = (Integer) parcel.readSerializable();
            this.f6994f = (Integer) parcel.readSerializable();
            this.f6995g = (Integer) parcel.readSerializable();
            this.f6996h = (Integer) parcel.readSerializable();
            this.f6997i = (Integer) parcel.readSerializable();
            this.f6998j = (Integer) parcel.readSerializable();
            this.f6999k = (Integer) parcel.readSerializable();
            this.f7000l = parcel.readInt();
            this.f7001m = parcel.readString();
            this.f7002n = parcel.readInt();
            this.f7003o = parcel.readInt();
            this.f7004p = parcel.readInt();
            this.f7006r = parcel.readString();
            this.f7007s = parcel.readString();
            this.f7008t = parcel.readInt();
            this.f7010v = (Integer) parcel.readSerializable();
            this.f7012x = (Integer) parcel.readSerializable();
            this.f7013y = (Integer) parcel.readSerializable();
            this.f7014z = (Integer) parcel.readSerializable();
            this.f6984A = (Integer) parcel.readSerializable();
            this.f6985B = (Integer) parcel.readSerializable();
            this.f6986C = (Integer) parcel.readSerializable();
            this.f6989F = (Integer) parcel.readSerializable();
            this.f6987D = (Integer) parcel.readSerializable();
            this.f6988E = (Integer) parcel.readSerializable();
            this.f7011w = (Boolean) parcel.readSerializable();
            this.f7005q = (Locale) parcel.readSerializable();
            this.f6990G = (Boolean) parcel.readSerializable();
            this.f6991H = (Integer) parcel.readSerializable();
        }
    }
}
