package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.collection.C0929i;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.List;
import p075Z.AbstractC0629g;
import p164y.AbstractC2541n;

/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {

    /* JADX INFO: renamed from: G */
    final C0929i f5448G;

    /* JADX INFO: renamed from: H */
    private final Handler f5449H;

    /* JADX INFO: renamed from: I */
    private final List f5450I;

    /* JADX INFO: renamed from: J */
    private boolean f5451J;

    /* JADX INFO: renamed from: K */
    private int f5452K;

    /* JADX INFO: renamed from: L */
    private boolean f5453L;

    /* JADX INFO: renamed from: M */
    private int f5454M;

    /* JADX INFO: renamed from: N */
    private final Runnable f5455N;

    /* JADX INFO: renamed from: androidx.preference.PreferenceGroup$a */
    class RunnableC1153a implements Runnable {
        RunnableC1153a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.f5448G.clear();
            }
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.f5448G = new C0929i();
        this.f5449H = new Handler(Looper.getMainLooper());
        this.f5451J = true;
        this.f5452K = 0;
        this.f5453L = false;
        this.f5454M = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f5455N = new RunnableC1153a();
        this.f5450I = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0629g.f2152v0, i3, i4);
        int i5 = AbstractC0629g.f2156x0;
        this.f5451J = AbstractC2541n.m12163b(typedArrayObtainStyledAttributes, i5, i5, true);
        int i6 = AbstractC0629g.f2154w0;
        if (typedArrayObtainStyledAttributes.hasValue(i6)) {
            m5251H(AbstractC2541n.m12165d(typedArrayObtainStyledAttributes, i6, i6, Api.BaseClientBuilder.API_PRIORITY_OTHER));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: F */
    public Preference m5249F(int i3) {
        return (Preference) this.f5450I.get(i3);
    }

    /* JADX INFO: renamed from: G */
    public int m5250G() {
        return this.f5450I.size();
    }

    /* JADX INFO: renamed from: H */
    public void m5251H(int i3) {
        if (i3 != Integer.MAX_VALUE && !m5241o()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f5454M = i3;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: s */
    public void mo5244s(boolean z2) {
        super.mo5244s(z2);
        int iM5250G = m5250G();
        for (int i3 = 0; i3 < iM5250G; i3++) {
            m5249F(i3).m5246w(this, z2);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
