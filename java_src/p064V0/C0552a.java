package p064V0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0915u;
import androidx.core.widget.AbstractC0982c;
import com.google.android.material.internal.AbstractC1546q;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0149j;
import p016F0.AbstractC0150k;
import p043O0.AbstractC0450a;
import p067W0.AbstractC0557c;
import p089c1.AbstractC1313a;
import p091d.AbstractC1760a;

/* JADX INFO: renamed from: V0.a */
/* JADX INFO: loaded from: classes.dex */
public class C0552a extends C0915u {

    /* JADX INFO: renamed from: g */
    private static final int f1944g = AbstractC0149j.f587t;

    /* JADX INFO: renamed from: h */
    private static final int[][] f1945h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: e */
    private ColorStateList f1946e;

    /* JADX INFO: renamed from: f */
    private boolean f1947f;

    public C0552a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1760a.f8690H);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f1946e == null) {
            int iM1632d = AbstractC0450a.m1632d(this, AbstractC1760a.f8718s);
            int iM1632d2 = AbstractC0450a.m1632d(this, AbstractC0140a.f339g);
            int iM1632d3 = AbstractC0450a.m1632d(this, AbstractC0140a.f341i);
            int[][] iArr = f1945h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = AbstractC0450a.m1638j(iM1632d3, iM1632d, 1.0f);
            iArr2[1] = AbstractC0450a.m1638j(iM1632d3, iM1632d2, 0.54f);
            iArr2[2] = AbstractC0450a.m1638j(iM1632d3, iM1632d2, 0.38f);
            iArr2[3] = AbstractC0450a.m1638j(iM1632d3, iM1632d2, 0.38f);
            this.f1946e = new ColorStateList(iArr, iArr2);
        }
        return this.f1946e;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1947f && AbstractC0982c.m4351b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f1947f = z2;
        if (z2) {
            AbstractC0982c.m4353d(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC0982c.m4353d(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0552a(Context context, AttributeSet attributeSet, int i3) {
        int i4 = f1944g;
        super(AbstractC1313a.m6668d(context, attributeSet, i3, i4), attributeSet, i3);
        Context context2 = getContext();
        TypedArray typedArrayM8488i = AbstractC1546q.m8488i(context2, attributeSet, AbstractC0150k.f787V3, i3, i4, new int[0]);
        int i5 = AbstractC0150k.f796W3;
        if (typedArrayM8488i.hasValue(i5)) {
            AbstractC0982c.m4353d(this, AbstractC0557c.m2077a(context2, typedArrayM8488i, i5));
        }
        this.f1947f = typedArrayM8488i.getBoolean(AbstractC0150k.f805X3, false);
        typedArrayM8488i.recycle();
    }
}
