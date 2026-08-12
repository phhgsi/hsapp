package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.ArrayList;
import java.util.HashMap;
import p146s.AbstractC2389k;
import p146s.AbstractC2390l;
import p146s.C2382d;
import p146s.C2383e;
import p146s.C2384f;
import p146s.C2386h;
import p149t.C2410b;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: x */
    private static C0948j f3849x;

    /* JADX INFO: renamed from: a */
    SparseArray f3850a;

    /* JADX INFO: renamed from: b */
    private ArrayList f3851b;

    /* JADX INFO: renamed from: c */
    protected C2384f f3852c;

    /* JADX INFO: renamed from: d */
    private int f3853d;

    /* JADX INFO: renamed from: e */
    private int f3854e;

    /* JADX INFO: renamed from: f */
    private int f3855f;

    /* JADX INFO: renamed from: g */
    private int f3856g;

    /* JADX INFO: renamed from: h */
    protected boolean f3857h;

    /* JADX INFO: renamed from: i */
    private int f3858i;

    /* JADX INFO: renamed from: j */
    private C0943e f3859j;

    /* JADX INFO: renamed from: k */
    protected C0942d f3860k;

    /* JADX INFO: renamed from: l */
    private int f3861l;

    /* JADX INFO: renamed from: m */
    private HashMap f3862m;

    /* JADX INFO: renamed from: n */
    private int f3863n;

    /* JADX INFO: renamed from: o */
    private int f3864o;

    /* JADX INFO: renamed from: p */
    int f3865p;

    /* JADX INFO: renamed from: q */
    int f3866q;

    /* JADX INFO: renamed from: r */
    int f3867r;

    /* JADX INFO: renamed from: s */
    int f3868s;

    /* JADX INFO: renamed from: t */
    private SparseArray f3869t;

    /* JADX INFO: renamed from: u */
    C0938c f3870u;

    /* JADX INFO: renamed from: v */
    private int f3871v;

    /* JADX INFO: renamed from: w */
    private int f3872w;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    static /* synthetic */ class C0936a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f3873a;

        static {
            int[] iArr = new int[C2383e.b.values().length];
            f3873a = iArr;
            try {
                iArr[C2383e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3873a[C2383e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3873a[C2383e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3873a[C2383e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$c */
    class C0938c implements C2410b.b {

        /* JADX INFO: renamed from: a */
        ConstraintLayout f3949a;

        /* JADX INFO: renamed from: b */
        int f3950b;

        /* JADX INFO: renamed from: c */
        int f3951c;

        /* JADX INFO: renamed from: d */
        int f3952d;

        /* JADX INFO: renamed from: e */
        int f3953e;

        /* JADX INFO: renamed from: f */
        int f3954f;

        /* JADX INFO: renamed from: g */
        int f3955g;

        public C0938c(ConstraintLayout constraintLayout) {
            this.f3949a = constraintLayout;
        }

        /* JADX INFO: renamed from: d */
        private boolean m4025d(int i3, int i4, int i5) {
            if (i3 == i4) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i3);
            View.MeasureSpec.getSize(i3);
            int mode2 = View.MeasureSpec.getMode(i4);
            int size = View.MeasureSpec.getSize(i4);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i5 == size;
            }
            return false;
        }

        @Override // p149t.C2410b.b
        /* JADX INFO: renamed from: a */
        public final void mo4026a() {
            int childCount = this.f3949a.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                this.f3949a.getChildAt(i3);
            }
            int size = this.f3949a.f3851b.size();
            if (size > 0) {
                for (int i4 = 0; i4 < size; i4++) {
                    ((AbstractC0941c) this.f3949a.f3851b.get(i4)).m4043l(this.f3949a);
                }
            }
        }

        @Override // p149t.C2410b.b
        /* JADX INFO: renamed from: b */
        public final void mo4027b(C2383e c2383e, C2410b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int iMax2;
            int i3;
            if (c2383e == null) {
                return;
            }
            if (c2383e.m11298S() == 8 && !c2383e.m11327g0()) {
                aVar.f11258e = 0;
                aVar.f11259f = 0;
                aVar.f11260g = 0;
                return;
            }
            if (c2383e.m11282K() == null) {
                return;
            }
            C2383e.b bVar = aVar.f11254a;
            C2383e.b bVar2 = aVar.f11255b;
            int i4 = aVar.f11256c;
            int i5 = aVar.f11257d;
            int i6 = this.f3950b + this.f3951c;
            int i7 = this.f3952d;
            View view = (View) c2383e.m11351s();
            int[] iArr = C0936a.f3873a;
            int i8 = iArr[bVar.ordinal()];
            if (i8 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            } else if (i8 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3954f, i7, -2);
            } else if (i8 == 3) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3954f, i7 + c2383e.m11264B(), -1);
            } else if (i8 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3954f, i7, -2);
                boolean z2 = c2383e.f10974v == 1;
                int i9 = aVar.f11263j;
                if (i9 == C2410b.a.f11252l || i9 == C2410b.a.f11253m) {
                    boolean z3 = view.getMeasuredHeight() == c2383e.m11361x();
                    if (aVar.f11263j == C2410b.a.f11253m || !z2 || ((z2 && z3) || c2383e.mo11222k0())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c2383e.m11300T(), 1073741824);
                    }
                }
            }
            int i10 = iArr[bVar2.ordinal()];
            if (i10 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            } else if (i10 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3955g, i6, -2);
            } else if (i10 == 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3955g, i6 + c2383e.m11296R(), -1);
            } else if (i10 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3955g, i6, -2);
                boolean z4 = c2383e.f10976w == 1;
                int i11 = aVar.f11263j;
                if (i11 == C2410b.a.f11252l || i11 == C2410b.a.f11253m) {
                    boolean z5 = view.getMeasuredWidth() == c2383e.m11300T();
                    if (aVar.f11263j == C2410b.a.f11253m || !z4 || ((z4 && z5) || c2383e.mo11223l0())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c2383e.m11361x(), 1073741824);
                    }
                }
            }
            C2384f c2384f = (C2384f) c2383e.m11282K();
            if (c2384f != null && AbstractC2389k.m11472b(ConstraintLayout.this.f3858i, 256) && view.getMeasuredWidth() == c2383e.m11300T() && view.getMeasuredWidth() < c2384f.m11300T() && view.getMeasuredHeight() == c2383e.m11361x() && view.getMeasuredHeight() < c2384f.m11361x() && view.getBaseline() == c2383e.m11345p() && !c2383e.m11334j0() && m4025d(c2383e.m11266C(), iMakeMeasureSpec, c2383e.m11300T()) && m4025d(c2383e.m11268D(), iMakeMeasureSpec2, c2383e.m11361x())) {
                aVar.f11258e = c2383e.m11300T();
                aVar.f11259f = c2383e.m11361x();
                aVar.f11260g = c2383e.m11345p();
                return;
            }
            C2383e.b bVar3 = C2383e.b.MATCH_CONSTRAINT;
            boolean z6 = bVar == bVar3;
            boolean z7 = bVar2 == bVar3;
            C2383e.b bVar4 = C2383e.b.MATCH_PARENT;
            boolean z8 = bVar2 == bVar4 || bVar2 == C2383e.b.FIXED;
            boolean z9 = bVar == bVar4 || bVar == C2383e.b.FIXED;
            boolean z10 = z6 && c2383e.f10937c0 > 0.0f;
            boolean z11 = z7 && c2383e.f10937c0 > 0.0f;
            if (view == null) {
                return;
            }
            C0937b c0937b = (C0937b) view.getLayoutParams();
            int i12 = aVar.f11263j;
            if (i12 != C2410b.a.f11252l && i12 != C2410b.a.f11253m && z6 && c2383e.f10974v == 0 && z7 && c2383e.f10976w == 0) {
                i3 = -1;
                iMax2 = 0;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof AbstractC0949k) && (c2383e instanceof AbstractC2390l)) {
                    ((AbstractC0949k) view).mo4003p((AbstractC2390l) c2383e, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                c2383e.m11293P0(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i13 = c2383e.f10980y;
                iMax = i13 > 0 ? Math.max(i13, measuredWidth) : measuredWidth;
                int i14 = c2383e.f10982z;
                if (i14 > 0) {
                    iMax = Math.min(i14, iMax);
                }
                int i15 = c2383e.f10900B;
                iMax2 = i15 > 0 ? Math.max(i15, measuredHeight) : measuredHeight;
                boolean z12 = z9;
                int i16 = c2383e.f10902C;
                if (i16 > 0) {
                    iMax2 = Math.min(i16, iMax2);
                }
                if (!AbstractC2389k.m11472b(ConstraintLayout.this.f3858i, 1)) {
                    if (z10 && z8) {
                        iMax = (int) ((iMax2 * c2383e.f10937c0) + 0.5f);
                    } else if (z11 && z12) {
                        iMax2 = (int) ((iMax / c2383e.f10937c0) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight != iMax2) {
                    if (measuredWidth != iMax) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    }
                    if (measuredHeight != iMax2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    c2383e.m11293P0(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = view.getMeasuredWidth();
                    iMax2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i3 = -1;
            }
            boolean z13 = baseline != i3;
            aVar.f11262i = (iMax == aVar.f11256c && iMax2 == aVar.f11257d) ? false : true;
            if (c0937b.f3911f0) {
                z13 = true;
            }
            if (z13 && baseline != -1 && c2383e.m11345p() != baseline) {
                aVar.f11262i = true;
            }
            aVar.f11258e = iMax;
            aVar.f11259f = iMax2;
            aVar.f11261h = z13;
            aVar.f11260g = baseline;
        }

        /* JADX INFO: renamed from: c */
        public void m4028c(int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f3950b = i5;
            this.f3951c = i6;
            this.f3952d = i7;
            this.f3953e = i8;
            this.f3954f = i3;
            this.f3955g = i4;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3850a = new SparseArray();
        this.f3851b = new ArrayList(4);
        this.f3852c = new C2384f();
        this.f3853d = 0;
        this.f3854e = 0;
        this.f3855f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f3856g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f3857h = true;
        this.f3858i = 257;
        this.f3859j = null;
        this.f3860k = null;
        this.f3861l = -1;
        this.f3862m = new HashMap();
        this.f3863n = -1;
        this.f3864o = -1;
        this.f3865p = -1;
        this.f3866q = -1;
        this.f3867r = 0;
        this.f3868s = 0;
        this.f3869t = new SparseArray();
        this.f3870u = new C0938c(this);
        this.f3871v = 0;
        this.f3872w = 0;
        m4008q(attributeSet, 0, 0);
    }

    /* JADX INFO: renamed from: A */
    private boolean m4004A() {
        int childCount = getChildCount();
        boolean z2 = false;
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            if (getChildAt(i3).isLayoutRequested()) {
                z2 = true;
                break;
            }
            i3++;
        }
        if (z2) {
            m4010w();
        }
        return z2;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static C0948j getSharedValues() {
        if (f3849x == null) {
            f3849x = new C0948j();
        }
        return f3849x;
    }

    /* JADX INFO: renamed from: k */
    private final C2383e m4007k(int i3) {
        if (i3 == 0) {
            return this.f3852c;
        }
        View viewFindViewById = (View) this.f3850a.get(i3);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i3)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f3852c;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((C0937b) viewFindViewById.getLayoutParams()).f3941u0;
    }

    /* JADX INFO: renamed from: q */
    private void m4008q(AttributeSet attributeSet, int i3, int i4) {
        this.f3852c.m11358v0(this);
        this.f3852c.m11386P1(this.f3870u);
        this.f3850a.put(getId(), this);
        this.f3859j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0947i.f4463m1, i3, i4);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i5);
                if (index == AbstractC0947i.f4553w1) {
                    this.f3853d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3853d);
                } else if (index == AbstractC0947i.f4562x1) {
                    this.f3854e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3854e);
                } else if (index == AbstractC0947i.f4535u1) {
                    this.f3855f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3855f);
                } else if (index == AbstractC0947i.f4544v1) {
                    this.f3856g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3856g);
                } else if (index == AbstractC0947i.f4393e3) {
                    this.f3858i = typedArrayObtainStyledAttributes.getInt(index, this.f3858i);
                } else if (index == AbstractC0947i.f4347Z1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m4019t(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f3860k = null;
                        }
                    }
                } else if (index == AbstractC0947i.f4172E1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0943e c0943e = new C0943e();
                        this.f3859j = c0943e;
                        c0943e.m4067k(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f3859j = null;
                    }
                    this.f3861l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f3852c.m11387Q1(this.f3858i);
    }

    /* JADX INFO: renamed from: s */
    private void m4009s() {
        this.f3857h = true;
        this.f3863n = -1;
        this.f3864o = -1;
        this.f3865p = -1;
        this.f3866q = -1;
        this.f3867r = 0;
        this.f3868s = 0;
    }

    /* JADX INFO: renamed from: w */
    private void m4010w() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            C2383e c2383eM4017p = m4017p(getChildAt(i3));
            if (c2383eM4017p != null) {
                c2383eM4017p.mo11348q0();
            }
        }
        if (zIsInEditMode) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    m4022x(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    m4007k(childAt.getId()).m11360w0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f3861l != -1) {
            for (int i5 = 0; i5 < childCount; i5++) {
                getChildAt(i5).getId();
            }
        }
        C0943e c0943e = this.f3859j;
        if (c0943e != null) {
            c0943e.m4063d(this, true);
        }
        this.f3852c.m11497o1();
        int size = this.f3851b.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC0941c) this.f3851b.get(i6)).m4045n(this);
            }
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            getChildAt(i7);
        }
        this.f3869t.clear();
        this.f3869t.put(0, this.f3852c);
        this.f3869t.put(getId(), this.f3852c);
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt2 = getChildAt(i8);
            this.f3869t.put(childAt2.getId(), m4017p(childAt2));
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt3 = getChildAt(i9);
            C2383e c2383eM4017p2 = m4017p(childAt3);
            if (c2383eM4017p2 != null) {
                C0937b c0937b = (C0937b) childAt3.getLayoutParams();
                this.f3852c.m11494a(c2383eM4017p2);
                m4012e(zIsInEditMode, childAt3, c2383eM4017p2, c0937b, this.f3869t);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    private void m4011z(C2383e c2383e, C0937b c0937b, SparseArray sparseArray, int i3, C2382d.b bVar) {
        View view = (View) this.f3850a.get(i3);
        C2383e c2383e2 = (C2383e) sparseArray.get(i3);
        if (c2383e2 == null || view == null || !(view.getLayoutParams() instanceof C0937b)) {
            return;
        }
        c0937b.f3911f0 = true;
        C2382d.b bVar2 = C2382d.b.BASELINE;
        if (bVar == bVar2) {
            C0937b c0937b2 = (C0937b) view.getLayoutParams();
            c0937b2.f3911f0 = true;
            c0937b2.f3941u0.m11271E0(true);
        }
        c2383e.mo11343o(bVar2).m11239b(c2383e2.mo11343o(bVar), c0937b.f3876C, c0937b.f3875B, true);
        c2383e.m11271E0(true);
        c2383e.mo11343o(C2382d.b.TOP).m11254q();
        c2383e.mo11343o(C2382d.b.BOTTOM).m11254q();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0937b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f3851b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i3 = 0; i3 < size; i3++) {
                ((AbstractC0941c) this.f3851b.get(i3)).m4044m(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i5 = Integer.parseInt(strArrSplit[0]);
                        int i6 = Integer.parseInt(strArrSplit[1]);
                        int i7 = Integer.parseInt(strArrSplit[2]);
                        int i8 = (int) ((i5 / 1080.0f) * width);
                        int i9 = (int) ((i6 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f3 = i8;
                        float f4 = i9;
                        float f5 = i8 + ((int) ((i7 / 1080.0f) * width));
                        canvas.drawLine(f3, f4, f5, f4, paint);
                        float f6 = i9 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f5, f4, f5, f6, paint);
                        canvas.drawLine(f5, f6, f3, f6, paint);
                        canvas.drawLine(f3, f6, f3, f4, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f3, f4, f5, f6, paint);
                        canvas.drawLine(f3, f6, f5, f4, paint);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017d  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void m4012e(boolean r15, android.view.View r16, p146s.C2383e r17, androidx.constraintlayout.widget.ConstraintLayout.C0937b r18, android.util.SparseArray r19) {
        /*
            Method dump skipped, instruction units count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m4012e(boolean, android.view.View, s.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0937b generateDefaultLayoutParams() {
        return new C0937b(-2, -2);
    }

    @Override // android.view.View
    public void forceLayout() {
        m4009s();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0937b generateLayoutParams(AttributeSet attributeSet) {
        return new C0937b(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.f3856g;
    }

    public int getMaxWidth() {
        return this.f3855f;
    }

    public int getMinHeight() {
        return this.f3854e;
    }

    public int getMinWidth() {
        return this.f3853d;
    }

    public int getOptimizationLevel() {
        return this.f3852c.m11376D1();
    }

    /* JADX INFO: renamed from: h */
    public Object m4015h(int i3, Object obj) {
        if (i3 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap map = this.f3862m;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f3862m.get(str);
    }

    /* JADX INFO: renamed from: l */
    public View m4016l(int i3) {
        return (View) this.f3850a.get(i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            C0937b c0937b = (C0937b) childAt.getLayoutParams();
            C2383e c2383e = c0937b.f3941u0;
            if ((childAt.getVisibility() != 8 || c0937b.f3913g0 || c0937b.f3915h0 || c0937b.f3919j0 || zIsInEditMode) && !c0937b.f3917i0) {
                int iM11302U = c2383e.m11302U();
                int iM11304V = c2383e.m11304V();
                childAt.layout(iM11302U, iM11304V, c2383e.m11300T() + iM11302U, c2383e.m11361x() + iM11304V);
            }
        }
        int size = this.f3851b.size();
        if (size > 0) {
            for (int i8 = 0; i8 < size; i8++) {
                ((AbstractC0941c) this.f3851b.get(i8)).m4042k(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i3, int i4) {
        if (this.f3871v == i3) {
            int i5 = this.f3872w;
        }
        if (!this.f3857h) {
            int childCount = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount) {
                    break;
                }
                if (getChildAt(i6).isLayoutRequested()) {
                    this.f3857h = true;
                    break;
                }
                i6++;
            }
        }
        this.f3871v = i3;
        this.f3872w = i4;
        this.f3852c.m11389S1(m4018r());
        if (this.f3857h) {
            this.f3857h = false;
            if (m4004A()) {
                this.f3852c.m11391U1();
            }
        }
        m4021v(this.f3852c, this.f3858i, i3, i4);
        m4020u(i3, i4, this.f3852c.m11300T(), this.f3852c.m11361x(), this.f3852c.m11383K1(), this.f3852c.m11381I1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C2383e c2383eM4017p = m4017p(view);
        if ((view instanceof C0945g) && !(c2383eM4017p instanceof C2386h)) {
            C0937b c0937b = (C0937b) view.getLayoutParams();
            C2386h c2386h = new C2386h();
            c0937b.f3941u0 = c2386h;
            c0937b.f3913g0 = true;
            c2386h.m11465u1(c0937b.f3898Y);
        }
        if (view instanceof AbstractC0941c) {
            AbstractC0941c abstractC0941c = (AbstractC0941c) view;
            abstractC0941c.m4046o();
            ((C0937b) view.getLayoutParams()).f3915h0 = true;
            if (!this.f3851b.contains(abstractC0941c)) {
                this.f3851b.add(abstractC0941c);
            }
        }
        this.f3850a.put(view.getId(), view);
        this.f3857h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f3850a.remove(view.getId());
        this.f3852c.m11496n1(m4017p(view));
        this.f3851b.remove(view);
        this.f3857h = true;
    }

    /* JADX INFO: renamed from: p */
    public final C2383e m4017p(View view) {
        if (view == this) {
            return this.f3852c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C0937b) {
            return ((C0937b) view.getLayoutParams()).f3941u0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C0937b) {
            return ((C0937b) view.getLayoutParams()).f3941u0;
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    protected boolean m4018r() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        m4009s();
        super.requestLayout();
    }

    public void setConstraintSet(C0943e c0943e) {
        this.f3859j = c0943e;
    }

    @Override // android.view.View
    public void setId(int i3) {
        this.f3850a.remove(getId());
        super.setId(i3);
        this.f3850a.put(getId(), this);
    }

    public void setMaxHeight(int i3) {
        if (i3 == this.f3856g) {
            return;
        }
        this.f3856g = i3;
        requestLayout();
    }

    public void setMaxWidth(int i3) {
        if (i3 == this.f3855f) {
            return;
        }
        this.f3855f = i3;
        requestLayout();
    }

    public void setMinHeight(int i3) {
        if (i3 == this.f3854e) {
            return;
        }
        this.f3854e = i3;
        requestLayout();
    }

    public void setMinWidth(int i3) {
        if (i3 == this.f3853d) {
            return;
        }
        this.f3853d = i3;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC0944f abstractC0944f) {
        C0942d c0942d = this.f3860k;
        if (c0942d != null) {
            c0942d.m4049c(abstractC0944f);
        }
    }

    public void setOptimizationLevel(int i3) {
        this.f3858i = i3;
        this.f3852c.m11387Q1(i3);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    protected void m4019t(int i3) {
        this.f3860k = new C0942d(getContext(), this, i3);
    }

    /* JADX INFO: renamed from: u */
    protected void m4020u(int i3, int i4, int i5, int i6, boolean z2, boolean z3) {
        C0938c c0938c = this.f3870u;
        int i7 = c0938c.f3953e;
        int iResolveSizeAndState = View.resolveSizeAndState(i5 + c0938c.f3952d, i3, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i6 + i7, i4, 0) & 16777215;
        int iMin = Math.min(this.f3855f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f3856g, iResolveSizeAndState2);
        if (z2) {
            iMin |= 16777216;
        }
        if (z3) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f3863n = iMin;
        this.f3864o = iMin2;
    }

    /* JADX INFO: renamed from: v */
    protected void m4021v(C2384f c2384f, int i3, int i4, int i5) {
        int i6;
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i7 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.f3870u.m4028c(i4, i5, iMax, iMax2, paddingWidth, i7);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 > 0 || iMax4 > 0) {
            if (m4018r()) {
                i6 = iMax4;
            }
            int i8 = size - paddingWidth;
            int i9 = size2 - i7;
            m4023y(c2384f, mode, i8, mode2, i9);
            c2384f.m11384L1(i3, mode, i8, mode2, i9, this.f3863n, this.f3864o, i6, iMax);
        }
        iMax3 = Math.max(0, getPaddingLeft());
        i6 = iMax3;
        int i82 = size - paddingWidth;
        int i92 = size2 - i7;
        m4023y(c2384f, mode, i82, mode2, i92);
        c2384f.m11384L1(i3, mode, i82, mode2, i92, this.f3863n, this.f3864o, i6, iMax);
    }

    /* JADX INFO: renamed from: x */
    public void m4022x(int i3, Object obj, Object obj2) {
        if (i3 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f3862m == null) {
                this.f3862m = new HashMap();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.f3862m.put(strSubstring, num);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r2
  0x003e: PHI (r2v4 s.e$b) = (r2v3 s.e$b), (r2v0 s.e$b) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void m4023y(p146s.C2384f r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.f3870u
            int r1 = r0.f3953e
            int r0 = r0.f3952d
            s.e$b r2 = p146s.C2383e.b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L2e
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = r6
            goto L38
        L1a:
            int r9 = r7.f3855f
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L38
        L23:
            s.e$b r9 = p146s.C2383e.b.WRAP_CONTENT
            if (r3 != 0) goto L18
            int r10 = r7.f3853d
            int r10 = java.lang.Math.max(r6, r10)
            goto L38
        L2e:
            s.e$b r9 = p146s.C2383e.b.WRAP_CONTENT
            if (r3 != 0) goto L38
            int r10 = r7.f3853d
            int r10 = java.lang.Math.max(r6, r10)
        L38:
            if (r11 == r5) goto L53
            if (r11 == 0) goto L48
            if (r11 == r4) goto L40
        L3e:
            r12 = r6
            goto L5d
        L40:
            int r11 = r7.f3856g
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L5d
        L48:
            s.e$b r2 = p146s.C2383e.b.WRAP_CONTENT
            if (r3 != 0) goto L3e
            int r11 = r7.f3854e
            int r12 = java.lang.Math.max(r6, r11)
            goto L5d
        L53:
            s.e$b r2 = p146s.C2383e.b.WRAP_CONTENT
            if (r3 != 0) goto L5d
            int r11 = r7.f3854e
            int r12 = java.lang.Math.max(r6, r11)
        L5d:
            int r11 = r8.m11300T()
            if (r10 != r11) goto L69
            int r11 = r8.m11361x()
            if (r12 == r11) goto L6c
        L69:
            r8.m11380H1()
        L6c:
            r8.m11328g1(r6)
            r8.m11330h1(r6)
            int r11 = r7.f3855f
            int r11 = r11 - r0
            r8.m11297R0(r11)
            int r11 = r7.f3856g
            int r11 = r11 - r1
            r8.m11295Q0(r11)
            r8.m11303U0(r6)
            r8.m11301T0(r6)
            r8.m11281J0(r9)
            r8.m11323e1(r10)
            r8.m11315a1(r2)
            r8.m11273F0(r12)
            int r9 = r7.f3853d
            int r9 = r9 - r0
            r8.m11303U0(r9)
            int r9 = r7.f3854e
            int r9 = r9 - r1
            r8.m11301T0(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m4023y(s.f, int, int, int, int):void");
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0937b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f3850a = new SparseArray();
        this.f3851b = new ArrayList(4);
        this.f3852c = new C2384f();
        this.f3853d = 0;
        this.f3854e = 0;
        this.f3855f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f3856g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f3857h = true;
        this.f3858i = 257;
        this.f3859j = null;
        this.f3860k = null;
        this.f3861l = -1;
        this.f3862m = new HashMap();
        this.f3863n = -1;
        this.f3864o = -1;
        this.f3865p = -1;
        this.f3866q = -1;
        this.f3867r = 0;
        this.f3868s = 0;
        this.f3869t = new SparseArray();
        this.f3870u = new C0938c(this);
        this.f3871v = 0;
        this.f3872w = 0;
        m4008q(attributeSet, i3, 0);
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    public static class C0937b extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: A */
        public int f3874A;

        /* JADX INFO: renamed from: B */
        public int f3875B;

        /* JADX INFO: renamed from: C */
        public int f3876C;

        /* JADX INFO: renamed from: D */
        boolean f3877D;

        /* JADX INFO: renamed from: E */
        boolean f3878E;

        /* JADX INFO: renamed from: F */
        public float f3879F;

        /* JADX INFO: renamed from: G */
        public float f3880G;

        /* JADX INFO: renamed from: H */
        public String f3881H;

        /* JADX INFO: renamed from: I */
        float f3882I;

        /* JADX INFO: renamed from: J */
        int f3883J;

        /* JADX INFO: renamed from: K */
        public float f3884K;

        /* JADX INFO: renamed from: L */
        public float f3885L;

        /* JADX INFO: renamed from: M */
        public int f3886M;

        /* JADX INFO: renamed from: N */
        public int f3887N;

        /* JADX INFO: renamed from: O */
        public int f3888O;

        /* JADX INFO: renamed from: P */
        public int f3889P;

        /* JADX INFO: renamed from: Q */
        public int f3890Q;

        /* JADX INFO: renamed from: R */
        public int f3891R;

        /* JADX INFO: renamed from: S */
        public int f3892S;

        /* JADX INFO: renamed from: T */
        public int f3893T;

        /* JADX INFO: renamed from: U */
        public float f3894U;

        /* JADX INFO: renamed from: V */
        public float f3895V;

        /* JADX INFO: renamed from: W */
        public int f3896W;

        /* JADX INFO: renamed from: X */
        public int f3897X;

        /* JADX INFO: renamed from: Y */
        public int f3898Y;

        /* JADX INFO: renamed from: Z */
        public boolean f3899Z;

        /* JADX INFO: renamed from: a */
        public int f3900a;

        /* JADX INFO: renamed from: a0 */
        public boolean f3901a0;

        /* JADX INFO: renamed from: b */
        public int f3902b;

        /* JADX INFO: renamed from: b0 */
        public String f3903b0;

        /* JADX INFO: renamed from: c */
        public float f3904c;

        /* JADX INFO: renamed from: c0 */
        public int f3905c0;

        /* JADX INFO: renamed from: d */
        public int f3906d;

        /* JADX INFO: renamed from: d0 */
        boolean f3907d0;

        /* JADX INFO: renamed from: e */
        public int f3908e;

        /* JADX INFO: renamed from: e0 */
        boolean f3909e0;

        /* JADX INFO: renamed from: f */
        public int f3910f;

        /* JADX INFO: renamed from: f0 */
        boolean f3911f0;

        /* JADX INFO: renamed from: g */
        public int f3912g;

        /* JADX INFO: renamed from: g0 */
        boolean f3913g0;

        /* JADX INFO: renamed from: h */
        public int f3914h;

        /* JADX INFO: renamed from: h0 */
        boolean f3915h0;

        /* JADX INFO: renamed from: i */
        public int f3916i;

        /* JADX INFO: renamed from: i0 */
        boolean f3917i0;

        /* JADX INFO: renamed from: j */
        public int f3918j;

        /* JADX INFO: renamed from: j0 */
        boolean f3919j0;

        /* JADX INFO: renamed from: k */
        public int f3920k;

        /* JADX INFO: renamed from: k0 */
        int f3921k0;

        /* JADX INFO: renamed from: l */
        public int f3922l;

        /* JADX INFO: renamed from: l0 */
        int f3923l0;

        /* JADX INFO: renamed from: m */
        public int f3924m;

        /* JADX INFO: renamed from: m0 */
        int f3925m0;

        /* JADX INFO: renamed from: n */
        public int f3926n;

        /* JADX INFO: renamed from: n0 */
        int f3927n0;

        /* JADX INFO: renamed from: o */
        public int f3928o;

        /* JADX INFO: renamed from: o0 */
        int f3929o0;

        /* JADX INFO: renamed from: p */
        public int f3930p;

        /* JADX INFO: renamed from: p0 */
        int f3931p0;

        /* JADX INFO: renamed from: q */
        public float f3932q;

        /* JADX INFO: renamed from: q0 */
        float f3933q0;

        /* JADX INFO: renamed from: r */
        public int f3934r;

        /* JADX INFO: renamed from: r0 */
        int f3935r0;

        /* JADX INFO: renamed from: s */
        public int f3936s;

        /* JADX INFO: renamed from: s0 */
        int f3937s0;

        /* JADX INFO: renamed from: t */
        public int f3938t;

        /* JADX INFO: renamed from: t0 */
        float f3939t0;

        /* JADX INFO: renamed from: u */
        public int f3940u;

        /* JADX INFO: renamed from: u0 */
        C2383e f3941u0;

        /* JADX INFO: renamed from: v */
        public int f3942v;

        /* JADX INFO: renamed from: v0 */
        public boolean f3943v0;

        /* JADX INFO: renamed from: w */
        public int f3944w;

        /* JADX INFO: renamed from: x */
        public int f3945x;

        /* JADX INFO: renamed from: y */
        public int f3946y;

        /* JADX INFO: renamed from: z */
        public int f3947z;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$b$a */
        private static class a {

            /* JADX INFO: renamed from: a */
            public static final SparseIntArray f3948a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f3948a = sparseIntArray;
                sparseIntArray.append(AbstractC0947i.f4268P2, 64);
                sparseIntArray.append(AbstractC0947i.f4518s2, 65);
                sparseIntArray.append(AbstractC0947i.f4146B2, 8);
                sparseIntArray.append(AbstractC0947i.f4155C2, 9);
                sparseIntArray.append(AbstractC0947i.f4173E2, 10);
                sparseIntArray.append(AbstractC0947i.f4182F2, 11);
                sparseIntArray.append(AbstractC0947i.f4236L2, 12);
                sparseIntArray.append(AbstractC0947i.f4227K2, 13);
                sparseIntArray.append(AbstractC0947i.f4428i2, 14);
                sparseIntArray.append(AbstractC0947i.f4419h2, 15);
                sparseIntArray.append(AbstractC0947i.f4383d2, 16);
                sparseIntArray.append(AbstractC0947i.f4401f2, 52);
                sparseIntArray.append(AbstractC0947i.f4392e2, 53);
                sparseIntArray.append(AbstractC0947i.f4437j2, 2);
                sparseIntArray.append(AbstractC0947i.f4455l2, 3);
                sparseIntArray.append(AbstractC0947i.f4446k2, 4);
                sparseIntArray.append(AbstractC0947i.f4308U2, 49);
                sparseIntArray.append(AbstractC0947i.f4316V2, 50);
                sparseIntArray.append(AbstractC0947i.f4491p2, 5);
                sparseIntArray.append(AbstractC0947i.f4500q2, 6);
                sparseIntArray.append(AbstractC0947i.f4509r2, 7);
                sparseIntArray.append(AbstractC0947i.f4472n1, 1);
                sparseIntArray.append(AbstractC0947i.f4191G2, 17);
                sparseIntArray.append(AbstractC0947i.f4200H2, 18);
                sparseIntArray.append(AbstractC0947i.f4482o2, 19);
                sparseIntArray.append(AbstractC0947i.f4473n2, 20);
                sparseIntArray.append(AbstractC0947i.f4348Z2, 21);
                sparseIntArray.append(AbstractC0947i.f4375c3, 22);
                sparseIntArray.append(AbstractC0947i.f4357a3, 23);
                sparseIntArray.append(AbstractC0947i.f4332X2, 24);
                sparseIntArray.append(AbstractC0947i.f4366b3, 25);
                sparseIntArray.append(AbstractC0947i.f4340Y2, 26);
                sparseIntArray.append(AbstractC0947i.f4324W2, 55);
                sparseIntArray.append(AbstractC0947i.f4384d3, 54);
                sparseIntArray.append(AbstractC0947i.f4563x2, 29);
                sparseIntArray.append(AbstractC0947i.f4244M2, 30);
                sparseIntArray.append(AbstractC0947i.f4464m2, 44);
                sparseIntArray.append(AbstractC0947i.f4581z2, 45);
                sparseIntArray.append(AbstractC0947i.f4260O2, 46);
                sparseIntArray.append(AbstractC0947i.f4572y2, 47);
                sparseIntArray.append(AbstractC0947i.f4252N2, 48);
                sparseIntArray.append(AbstractC0947i.f4365b2, 27);
                sparseIntArray.append(AbstractC0947i.f4356a2, 28);
                sparseIntArray.append(AbstractC0947i.f4276Q2, 31);
                sparseIntArray.append(AbstractC0947i.f4527t2, 32);
                sparseIntArray.append(AbstractC0947i.f4292S2, 33);
                sparseIntArray.append(AbstractC0947i.f4284R2, 34);
                sparseIntArray.append(AbstractC0947i.f4300T2, 35);
                sparseIntArray.append(AbstractC0947i.f4545v2, 36);
                sparseIntArray.append(AbstractC0947i.f4536u2, 37);
                sparseIntArray.append(AbstractC0947i.f4554w2, 38);
                sparseIntArray.append(AbstractC0947i.f4137A2, 39);
                sparseIntArray.append(AbstractC0947i.f4218J2, 40);
                sparseIntArray.append(AbstractC0947i.f4164D2, 41);
                sparseIntArray.append(AbstractC0947i.f4410g2, 42);
                sparseIntArray.append(AbstractC0947i.f4374c2, 43);
                sparseIntArray.append(AbstractC0947i.f4209I2, 51);
                sparseIntArray.append(AbstractC0947i.f4402f3, 66);
            }
        }

        public C0937b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3900a = -1;
            this.f3902b = -1;
            this.f3904c = -1.0f;
            this.f3906d = -1;
            this.f3908e = -1;
            this.f3910f = -1;
            this.f3912g = -1;
            this.f3914h = -1;
            this.f3916i = -1;
            this.f3918j = -1;
            this.f3920k = -1;
            this.f3922l = -1;
            this.f3924m = -1;
            this.f3926n = -1;
            this.f3928o = -1;
            this.f3930p = 0;
            this.f3932q = 0.0f;
            this.f3934r = -1;
            this.f3936s = -1;
            this.f3938t = -1;
            this.f3940u = -1;
            this.f3942v = Integer.MIN_VALUE;
            this.f3944w = Integer.MIN_VALUE;
            this.f3945x = Integer.MIN_VALUE;
            this.f3946y = Integer.MIN_VALUE;
            this.f3947z = Integer.MIN_VALUE;
            this.f3874A = Integer.MIN_VALUE;
            this.f3875B = Integer.MIN_VALUE;
            this.f3876C = 0;
            this.f3877D = true;
            this.f3878E = true;
            this.f3879F = 0.5f;
            this.f3880G = 0.5f;
            this.f3881H = null;
            this.f3882I = 0.0f;
            this.f3883J = 1;
            this.f3884K = -1.0f;
            this.f3885L = -1.0f;
            this.f3886M = 0;
            this.f3887N = 0;
            this.f3888O = 0;
            this.f3889P = 0;
            this.f3890Q = 0;
            this.f3891R = 0;
            this.f3892S = 0;
            this.f3893T = 0;
            this.f3894U = 1.0f;
            this.f3895V = 1.0f;
            this.f3896W = -1;
            this.f3897X = -1;
            this.f3898Y = -1;
            this.f3899Z = false;
            this.f3901a0 = false;
            this.f3903b0 = null;
            this.f3905c0 = 0;
            this.f3907d0 = true;
            this.f3909e0 = true;
            this.f3911f0 = false;
            this.f3913g0 = false;
            this.f3915h0 = false;
            this.f3917i0 = false;
            this.f3919j0 = false;
            this.f3921k0 = -1;
            this.f3923l0 = -1;
            this.f3925m0 = -1;
            this.f3927n0 = -1;
            this.f3929o0 = Integer.MIN_VALUE;
            this.f3931p0 = Integer.MIN_VALUE;
            this.f3933q0 = 0.5f;
            this.f3941u0 = new C2383e();
            this.f3943v0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0947i.f4463m1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                int i4 = a.f3948a.get(index);
                switch (i4) {
                    case 1:
                        this.f3898Y = typedArrayObtainStyledAttributes.getInt(index, this.f3898Y);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f3928o);
                        this.f3928o = resourceId;
                        if (resourceId == -1) {
                            this.f3928o = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f3930p = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3930p);
                        break;
                    case 4:
                        float f3 = typedArrayObtainStyledAttributes.getFloat(index, this.f3932q) % 360.0f;
                        this.f3932q = f3;
                        if (f3 < 0.0f) {
                            this.f3932q = (360.0f - f3) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f3900a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3900a);
                        break;
                    case 6:
                        this.f3902b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3902b);
                        break;
                    case 7:
                        this.f3904c = typedArrayObtainStyledAttributes.getFloat(index, this.f3904c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3906d);
                        this.f3906d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f3906d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case ConnectionResult.SERVICE_INVALID /* 9 */:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3908e);
                        this.f3908e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f3908e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3910f);
                        this.f3910f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f3910f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3912g);
                        this.f3912g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f3912g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3914h);
                        this.f3914h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f3914h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3916i);
                        this.f3916i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f3916i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3918j);
                        this.f3918j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f3918j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3920k);
                        this.f3920k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f3920k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3922l);
                        this.f3922l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f3922l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3934r);
                        this.f3934r = resourceId11;
                        if (resourceId11 == -1) {
                            this.f3934r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case ConnectionResult.SERVICE_UPDATING /* 18 */:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3936s);
                        this.f3936s = resourceId12;
                        if (resourceId12 == -1) {
                            this.f3936s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3938t);
                        this.f3938t = resourceId13;
                        if (resourceId13 == -1) {
                            this.f3938t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3940u);
                        this.f3940u = resourceId14;
                        if (resourceId14 == -1) {
                            this.f3940u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        this.f3942v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3942v);
                        break;
                    case 22:
                        this.f3944w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3944w);
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        this.f3945x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3945x);
                        break;
                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        this.f3946y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3946y);
                        break;
                    case 25:
                        this.f3947z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3947z);
                        break;
                    case 26:
                        this.f3874A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3874A);
                        break;
                    case 27:
                        this.f3899Z = typedArrayObtainStyledAttributes.getBoolean(index, this.f3899Z);
                        break;
                    case 28:
                        this.f3901a0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f3901a0);
                        break;
                    case 29:
                        this.f3879F = typedArrayObtainStyledAttributes.getFloat(index, this.f3879F);
                        break;
                    case 30:
                        this.f3880G = typedArrayObtainStyledAttributes.getFloat(index, this.f3880G);
                        break;
                    case 31:
                        int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f3888O = i5;
                        if (i5 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i6 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f3889P = i6;
                        if (i6 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.f3890Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3890Q);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f3890Q) == -2) {
                                this.f3890Q = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.f3892S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3892S);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f3892S) == -2) {
                                this.f3892S = -2;
                            }
                        }
                        break;
                    case 35:
                        this.f3894U = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f3894U));
                        this.f3888O = 2;
                        break;
                    case 36:
                        try {
                            this.f3891R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3891R);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f3891R) == -2) {
                                this.f3891R = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.f3893T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3893T);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f3893T) == -2) {
                                this.f3893T = -2;
                            }
                        }
                        break;
                    case 38:
                        this.f3895V = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f3895V));
                        this.f3889P = 2;
                        break;
                    default:
                        switch (i4) {
                            case 44:
                                C0943e.m4059p(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f3884K = typedArrayObtainStyledAttributes.getFloat(index, this.f3884K);
                                break;
                            case 46:
                                this.f3885L = typedArrayObtainStyledAttributes.getFloat(index, this.f3885L);
                                break;
                            case 47:
                                this.f3886M = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f3887N = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f3896W = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3896W);
                                break;
                            case 50:
                                this.f3897X = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3897X);
                                break;
                            case 51:
                                this.f3903b0 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3924m);
                                this.f3924m = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f3924m = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3926n);
                                this.f3926n = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f3926n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.f3876C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3876C);
                                break;
                            case 55:
                                this.f3875B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3875B);
                                break;
                            default:
                                switch (i4) {
                                    case 64:
                                        C0943e.m4057n(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.f3877D = true;
                                        break;
                                    case 65:
                                        C0943e.m4057n(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.f3878E = true;
                                        break;
                                    case 66:
                                        this.f3905c0 = typedArrayObtainStyledAttributes.getInt(index, this.f3905c0);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            m4024a();
        }

        /* JADX INFO: renamed from: a */
        public void m4024a() {
            this.f3913g0 = false;
            this.f3907d0 = true;
            this.f3909e0 = true;
            int i3 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i3 == -2 && this.f3899Z) {
                this.f3907d0 = false;
                if (this.f3888O == 0) {
                    this.f3888O = 1;
                }
            }
            int i4 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i4 == -2 && this.f3901a0) {
                this.f3909e0 = false;
                if (this.f3889P == 0) {
                    this.f3889P = 1;
                }
            }
            if (i3 == 0 || i3 == -1) {
                this.f3907d0 = false;
                if (i3 == 0 && this.f3888O == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f3899Z = true;
                }
            }
            if (i4 == 0 || i4 == -1) {
                this.f3909e0 = false;
                if (i4 == 0 && this.f3889P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f3901a0 = true;
                }
            }
            if (this.f3904c == -1.0f && this.f3900a == -1 && this.f3902b == -1) {
                return;
            }
            this.f3913g0 = true;
            this.f3907d0 = true;
            this.f3909e0 = true;
            if (!(this.f3941u0 instanceof C2386h)) {
                this.f3941u0 = new C2386h();
            }
            ((C2386h) this.f3941u0).m11465u1(this.f3898Y);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instruction units count: 255
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0937b.resolveLayoutDirection(int):void");
        }

        public C0937b(int i3, int i4) {
            super(i3, i4);
            this.f3900a = -1;
            this.f3902b = -1;
            this.f3904c = -1.0f;
            this.f3906d = -1;
            this.f3908e = -1;
            this.f3910f = -1;
            this.f3912g = -1;
            this.f3914h = -1;
            this.f3916i = -1;
            this.f3918j = -1;
            this.f3920k = -1;
            this.f3922l = -1;
            this.f3924m = -1;
            this.f3926n = -1;
            this.f3928o = -1;
            this.f3930p = 0;
            this.f3932q = 0.0f;
            this.f3934r = -1;
            this.f3936s = -1;
            this.f3938t = -1;
            this.f3940u = -1;
            this.f3942v = Integer.MIN_VALUE;
            this.f3944w = Integer.MIN_VALUE;
            this.f3945x = Integer.MIN_VALUE;
            this.f3946y = Integer.MIN_VALUE;
            this.f3947z = Integer.MIN_VALUE;
            this.f3874A = Integer.MIN_VALUE;
            this.f3875B = Integer.MIN_VALUE;
            this.f3876C = 0;
            this.f3877D = true;
            this.f3878E = true;
            this.f3879F = 0.5f;
            this.f3880G = 0.5f;
            this.f3881H = null;
            this.f3882I = 0.0f;
            this.f3883J = 1;
            this.f3884K = -1.0f;
            this.f3885L = -1.0f;
            this.f3886M = 0;
            this.f3887N = 0;
            this.f3888O = 0;
            this.f3889P = 0;
            this.f3890Q = 0;
            this.f3891R = 0;
            this.f3892S = 0;
            this.f3893T = 0;
            this.f3894U = 1.0f;
            this.f3895V = 1.0f;
            this.f3896W = -1;
            this.f3897X = -1;
            this.f3898Y = -1;
            this.f3899Z = false;
            this.f3901a0 = false;
            this.f3903b0 = null;
            this.f3905c0 = 0;
            this.f3907d0 = true;
            this.f3909e0 = true;
            this.f3911f0 = false;
            this.f3913g0 = false;
            this.f3915h0 = false;
            this.f3917i0 = false;
            this.f3919j0 = false;
            this.f3921k0 = -1;
            this.f3923l0 = -1;
            this.f3925m0 = -1;
            this.f3927n0 = -1;
            this.f3929o0 = Integer.MIN_VALUE;
            this.f3931p0 = Integer.MIN_VALUE;
            this.f3933q0 = 0.5f;
            this.f3941u0 = new C2383e();
            this.f3943v0 = false;
        }

        public C0937b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3900a = -1;
            this.f3902b = -1;
            this.f3904c = -1.0f;
            this.f3906d = -1;
            this.f3908e = -1;
            this.f3910f = -1;
            this.f3912g = -1;
            this.f3914h = -1;
            this.f3916i = -1;
            this.f3918j = -1;
            this.f3920k = -1;
            this.f3922l = -1;
            this.f3924m = -1;
            this.f3926n = -1;
            this.f3928o = -1;
            this.f3930p = 0;
            this.f3932q = 0.0f;
            this.f3934r = -1;
            this.f3936s = -1;
            this.f3938t = -1;
            this.f3940u = -1;
            this.f3942v = Integer.MIN_VALUE;
            this.f3944w = Integer.MIN_VALUE;
            this.f3945x = Integer.MIN_VALUE;
            this.f3946y = Integer.MIN_VALUE;
            this.f3947z = Integer.MIN_VALUE;
            this.f3874A = Integer.MIN_VALUE;
            this.f3875B = Integer.MIN_VALUE;
            this.f3876C = 0;
            this.f3877D = true;
            this.f3878E = true;
            this.f3879F = 0.5f;
            this.f3880G = 0.5f;
            this.f3881H = null;
            this.f3882I = 0.0f;
            this.f3883J = 1;
            this.f3884K = -1.0f;
            this.f3885L = -1.0f;
            this.f3886M = 0;
            this.f3887N = 0;
            this.f3888O = 0;
            this.f3889P = 0;
            this.f3890Q = 0;
            this.f3891R = 0;
            this.f3892S = 0;
            this.f3893T = 0;
            this.f3894U = 1.0f;
            this.f3895V = 1.0f;
            this.f3896W = -1;
            this.f3897X = -1;
            this.f3898Y = -1;
            this.f3899Z = false;
            this.f3901a0 = false;
            this.f3903b0 = null;
            this.f3905c0 = 0;
            this.f3907d0 = true;
            this.f3909e0 = true;
            this.f3911f0 = false;
            this.f3913g0 = false;
            this.f3915h0 = false;
            this.f3917i0 = false;
            this.f3919j0 = false;
            this.f3921k0 = -1;
            this.f3923l0 = -1;
            this.f3925m0 = -1;
            this.f3927n0 = -1;
            this.f3929o0 = Integer.MIN_VALUE;
            this.f3931p0 = Integer.MIN_VALUE;
            this.f3933q0 = 0.5f;
            this.f3941u0 = new C2383e();
            this.f3943v0 = false;
        }
    }
}
