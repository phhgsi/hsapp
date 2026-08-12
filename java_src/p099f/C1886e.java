package p099f;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p099f.AbstractC1883b;

/* JADX INFO: renamed from: f.e */
/* JADX INFO: loaded from: classes.dex */
public class C1886e extends AbstractC1883b {

    /* JADX INFO: renamed from: m */
    private a f9388m;

    /* JADX INFO: renamed from: n */
    private boolean f9389n;

    /* JADX INFO: renamed from: f.e$a */
    static class a extends AbstractC1883b.d {

        /* JADX INFO: renamed from: J */
        int[][] f9390J;

        a(a aVar, C1886e c1886e, Resources resources) {
            super(aVar, c1886e, resources);
            if (aVar != null) {
                this.f9390J = aVar.f9390J;
            } else {
                this.f9390J = new int[m9739f()][];
            }
        }

        /* JADX INFO: renamed from: A */
        int m9767A(int[] iArr) {
            int[][] iArr2 = this.f9390J;
            int iM9741h = m9741h();
            for (int i3 = 0; i3 < iM9741h; i3++) {
                if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                    return i3;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C1886e(this, null);
        }

        @Override // p099f.AbstractC1883b.d
        /* JADX INFO: renamed from: o */
        public void mo9748o(int i3, int i4) {
            super.mo9748o(i3, i4);
            int[][] iArr = new int[i4][];
            System.arraycopy(this.f9390J, 0, iArr, 0, i3);
            this.f9390J = iArr;
        }

        @Override // p099f.AbstractC1883b.d
        /* JADX INFO: renamed from: r */
        void mo9716r() {
            int[][] iArr = this.f9390J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.f9390J[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.f9390J = iArr2;
        }

        /* JADX INFO: renamed from: z */
        int m9768z(int[] iArr, Drawable drawable) {
            int iM9735a = m9735a(drawable);
            this.f9390J[iM9735a] = iArr;
            return iM9735a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C1886e(this, resources);
        }
    }

    public C1886e() {
        this(null, null);
    }

    @Override // p099f.AbstractC1883b, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // p099f.AbstractC1883b
    /* JADX INFO: renamed from: h */
    void mo9702h(AbstractC1883b.d dVar) {
        super.mo9702h(dVar);
        if (dVar instanceof a) {
            this.f9388m = (a) dVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public void m9765j(int[] iArr, Drawable drawable) {
        if (drawable != null) {
            this.f9388m.m9768z(iArr, drawable);
            onStateChange(getState());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p099f.AbstractC1883b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a mo9701b() {
        return new a(this.f9388m, this, null);
    }

    /* JADX INFO: renamed from: l */
    int[] m9766l(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i3 = 0;
        for (int i4 = 0; i4 < attributeCount; i4++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i4);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i5 = i3 + 1;
                if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i3] = attributeNameResource;
                i3 = i5;
            }
        }
        return StateSet.trimStateSet(iArr, i3);
    }

    @Override // p099f.AbstractC1883b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f9389n && super.mutate() == this) {
            this.f9388m.mo9716r();
            this.f9389n = true;
        }
        return this;
    }

    @Override // p099f.AbstractC1883b, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        int iM9767A = this.f9388m.m9767A(iArr);
        if (iM9767A < 0) {
            iM9767A = this.f9388m.m9767A(StateSet.WILD_CARD);
        }
        return m9726g(iM9767A) || zOnStateChange;
    }

    C1886e(a aVar, Resources resources) {
        mo9702h(new a(aVar, this, resources));
        onStateChange(getState());
    }

    C1886e(a aVar) {
        if (aVar != null) {
            mo9702h(aVar);
        }
    }
}
