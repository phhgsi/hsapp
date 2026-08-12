package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p067W0.AbstractC0561g;
import p067W0.C0559e;

/* JADX INFO: renamed from: com.google.android.material.internal.n */
/* JADX INFO: loaded from: classes.dex */
public class C1543n {

    /* JADX INFO: renamed from: c */
    private float f7793c;

    /* JADX INFO: renamed from: d */
    private float f7794d;

    /* JADX INFO: renamed from: g */
    private C0559e f7797g;

    /* JADX INFO: renamed from: a */
    private final TextPaint f7791a = new TextPaint(1);

    /* JADX INFO: renamed from: b */
    private final AbstractC0561g f7792b = new a();

    /* JADX INFO: renamed from: e */
    private boolean f7795e = true;

    /* JADX INFO: renamed from: f */
    private WeakReference f7796f = new WeakReference(null);

    /* JADX INFO: renamed from: com.google.android.material.internal.n$a */
    class a extends AbstractC0561g {
        a() {
        }

        @Override // p067W0.AbstractC0561g
        /* JADX INFO: renamed from: a */
        public void mo2065a(int i3) {
            C1543n.this.f7795e = true;
            b bVar = (b) C1543n.this.f7796f.get();
            if (bVar != null) {
                bVar.mo7512a();
            }
        }

        @Override // p067W0.AbstractC0561g
        /* JADX INFO: renamed from: b */
        public void mo2066b(Typeface typeface, boolean z2) {
            if (z2) {
                return;
            }
            C1543n.this.f7795e = true;
            b bVar = (b) C1543n.this.f7796f.get();
            if (bVar != null) {
                bVar.mo7512a();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.n$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo7512a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C1543n(b bVar) {
        m8474j(bVar);
    }

    /* JADX INFO: renamed from: c */
    private float m8467c(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f7791a.getFontMetrics().ascent);
    }

    /* JADX INFO: renamed from: d */
    private float m8468d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f7791a.measureText(charSequence, 0, charSequence.length());
    }

    /* JADX INFO: renamed from: i */
    private void m8469i(String str) {
        this.f7793c = m8468d(str);
        this.f7794d = m8467c(str);
        this.f7795e = false;
    }

    /* JADX INFO: renamed from: e */
    public C0559e m8470e() {
        return this.f7797g;
    }

    /* JADX INFO: renamed from: f */
    public float m8471f(String str) {
        if (!this.f7795e) {
            return this.f7794d;
        }
        m8469i(str);
        return this.f7794d;
    }

    /* JADX INFO: renamed from: g */
    public TextPaint m8472g() {
        return this.f7791a;
    }

    /* JADX INFO: renamed from: h */
    public float m8473h(String str) {
        if (!this.f7795e) {
            return this.f7793c;
        }
        m8469i(str);
        return this.f7793c;
    }

    /* JADX INFO: renamed from: j */
    public void m8474j(b bVar) {
        this.f7796f = new WeakReference(bVar);
    }

    /* JADX INFO: renamed from: k */
    public void m8475k(C0559e c0559e, Context context) {
        if (this.f7797g != c0559e) {
            this.f7797g = c0559e;
            if (c0559e != null) {
                c0559e.m2106q(context, this.f7791a, this.f7792b);
                b bVar = (b) this.f7796f.get();
                if (bVar != null) {
                    this.f7791a.drawableState = bVar.getState();
                }
                c0559e.m2105p(context, this.f7791a, this.f7792b);
                this.f7795e = true;
            }
            b bVar2 = (b) this.f7796f.get();
            if (bVar2 != null) {
                bVar2.mo7512a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m8476l(boolean z2) {
        this.f7795e = z2;
    }

    /* JADX INFO: renamed from: m */
    public void m8477m(boolean z2) {
        this.f7795e = z2;
    }

    /* JADX INFO: renamed from: n */
    public void m8478n(Context context) {
        this.f7797g.m2105p(context, this.f7791a, this.f7792b);
    }
}
