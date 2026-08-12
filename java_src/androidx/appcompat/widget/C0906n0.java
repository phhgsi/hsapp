package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import p091d.AbstractC1763d;
import p091d.AbstractC1765f;
import p091d.AbstractC1766g;
import p091d.AbstractC1768i;

/* JADX INFO: renamed from: androidx.appcompat.widget.n0 */
/* JADX INFO: loaded from: classes.dex */
class C0906n0 {

    /* JADX INFO: renamed from: a */
    private final Context f3736a;

    /* JADX INFO: renamed from: b */
    private final View f3737b;

    /* JADX INFO: renamed from: c */
    private final TextView f3738c;

    /* JADX INFO: renamed from: d */
    private final WindowManager.LayoutParams f3739d;

    /* JADX INFO: renamed from: e */
    private final Rect f3740e;

    /* JADX INFO: renamed from: f */
    private final int[] f3741f;

    /* JADX INFO: renamed from: g */
    private final int[] f3742g;

    C0906n0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f3739d = layoutParams;
        this.f3740e = new Rect();
        this.f3741f = new int[2];
        this.f3742g = new int[2];
        this.f3736a = context;
        View viewInflate = LayoutInflater.from(context).inflate(AbstractC1766g.f8853s, (ViewGroup) null);
        this.f3737b = viewInflate;
        this.f3738c = (TextView) viewInflate.findViewById(AbstractC1765f.f8827s);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = AbstractC1768i.f8869a;
        layoutParams.flags = 24;
    }

    /* JADX INFO: renamed from: a */
    private void m3857a(View view, int i3, int i4, boolean z2, WindowManager.LayoutParams layoutParams) {
        int height;
        int i5;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f3736a.getResources().getDimensionPixelOffset(AbstractC1763d.f8745k);
        if (view.getWidth() < dimensionPixelOffset) {
            i3 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f3736a.getResources().getDimensionPixelOffset(AbstractC1763d.f8744j);
            height = i4 + dimensionPixelOffset2;
            i5 = i4 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i5 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f3736a.getResources().getDimensionPixelOffset(z2 ? AbstractC1763d.f8747m : AbstractC1763d.f8746l);
        View viewM3858b = m3858b(view);
        if (viewM3858b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        viewM3858b.getWindowVisibleDisplayFrame(this.f3740e);
        Rect rect = this.f3740e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f3736a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f3740e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewM3858b.getLocationOnScreen(this.f3742g);
        view.getLocationOnScreen(this.f3741f);
        int[] iArr = this.f3741f;
        int i6 = iArr[0];
        int[] iArr2 = this.f3742g;
        int i7 = i6 - iArr2[0];
        iArr[0] = i7;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i7 + i3) - (viewM3858b.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f3737b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f3737b.getMeasuredHeight();
        int i8 = this.f3741f[1];
        int i9 = ((i5 + i8) - dimensionPixelOffset3) - measuredHeight;
        int i10 = i8 + height + dimensionPixelOffset3;
        if (z2) {
            if (i9 >= 0) {
                layoutParams.y = i9;
                return;
            } else {
                layoutParams.y = i10;
                return;
            }
        }
        if (measuredHeight + i10 <= this.f3740e.height()) {
            layoutParams.y = i10;
        } else {
            layoutParams.y = i9;
        }
    }

    /* JADX INFO: renamed from: b */
    private static View m3858b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams).type != 2) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return ((Activity) context).getWindow().getDecorView();
                }
            }
        }
        return rootView;
    }

    /* JADX INFO: renamed from: c */
    void m3859c() {
        if (m3860d()) {
            ((WindowManager) this.f3736a.getSystemService("window")).removeView(this.f3737b);
        }
    }

    /* JADX INFO: renamed from: d */
    boolean m3860d() {
        return this.f3737b.getParent() != null;
    }

    /* JADX INFO: renamed from: e */
    void m3861e(View view, int i3, int i4, boolean z2, CharSequence charSequence) {
        if (m3860d()) {
            m3859c();
        }
        this.f3738c.setText(charSequence);
        m3857a(view, i3, i4, z2, this.f3739d);
        ((WindowManager) this.f3736a.getSystemService("window")).addView(this.f3737b, this.f3739d);
    }
}
