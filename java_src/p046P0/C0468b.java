package p046P0;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;
import androidx.appcompat.app.DialogInterfaceC0747c;
import androidx.appcompat.view.C0774d;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0149j;
import p016F0.AbstractC0150k;
import p043O0.AbstractC0450a;
import p067W0.AbstractC0556b;
import p076Z0.C0637h;
import p089c1.AbstractC1313a;
import p091d.AbstractC1760a;

/* JADX INFO: renamed from: P0.b */
/* JADX INFO: loaded from: classes.dex */
public class C0468b extends DialogInterfaceC0747c.a {

    /* JADX INFO: renamed from: e */
    private static final int f1673e = AbstractC1760a.f8710k;

    /* JADX INFO: renamed from: f */
    private static final int f1674f = AbstractC0149j.f568a;

    /* JADX INFO: renamed from: g */
    private static final int f1675g = AbstractC0140a.f348p;

    /* JADX INFO: renamed from: c */
    private Drawable f1676c;

    /* JADX INFO: renamed from: d */
    private final Rect f1677d;

    public C0468b(Context context) {
        this(context, 0);
    }

    /* JADX INFO: renamed from: o */
    private static Context m1727o(Context context) {
        int iM1728p = m1728p(context);
        Context contextM6668d = AbstractC1313a.m6668d(context, null, f1673e, f1674f);
        return iM1728p == 0 ? contextM6668d : new C0774d(contextM6668d, iM1728p);
    }

    /* JADX INFO: renamed from: p */
    private static int m1728p(Context context) {
        TypedValue typedValueM2069a = AbstractC0556b.m2069a(context, f1675g);
        if (typedValueM2069a == null) {
            return 0;
        }
        return typedValueM2069a.data;
    }

    /* JADX INFO: renamed from: q */
    private static int m1729q(Context context, int i3) {
        return i3 == 0 ? m1728p(context) : i3;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0747c.a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public C0468b mo1738l(CharSequence charSequence) {
        return (C0468b) super.mo1738l(charSequence);
    }

    /* JADX INFO: renamed from: B */
    public C0468b m1731B(View view) {
        return (C0468b) super.m2793m(view);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0747c.a
    /* JADX INFO: renamed from: a */
    public DialogInterfaceC0747c mo1732a() {
        DialogInterfaceC0747c dialogInterfaceC0747cMo1732a = super.mo1732a();
        Window window = dialogInterfaceC0747cMo1732a.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f1676c;
        if (drawable instanceof C0637h) {
            ((C0637h) drawable).m2273b0(decorView.getElevation());
        }
        window.setBackgroundDrawable(AbstractC0469c.m1749b(this.f1676c, this.f1677d));
        decorView.setOnTouchListener(new ViewOnTouchListenerC0467a(dialogInterfaceC0747cMo1732a, this.f1677d));
        return dialogInterfaceC0747cMo1732a;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0747c.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C0468b mo1733c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        return (C0468b) super.mo1733c(listAdapter, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0747c.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public C0468b mo1734d(View view) {
        return (C0468b) super.mo1734d(view);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0747c.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public C0468b mo1735e(Drawable drawable) {
        return (C0468b) super.mo1735e(drawable);
    }

    /* JADX INFO: renamed from: u */
    public C0468b m1742u(CharSequence charSequence) {
        return (C0468b) super.m2789f(charSequence);
    }

    /* JADX INFO: renamed from: v */
    public C0468b m1743v(int i3, DialogInterface.OnClickListener onClickListener) {
        return (C0468b) super.m2790g(i3, onClickListener);
    }

    /* JADX INFO: renamed from: w */
    public C0468b m1744w(DialogInterface.OnDismissListener onDismissListener) {
        return (C0468b) super.m2791h(onDismissListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0747c.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public C0468b mo1736i(DialogInterface.OnKeyListener onKeyListener) {
        return (C0468b) super.mo1736i(onKeyListener);
    }

    /* JADX INFO: renamed from: y */
    public C0468b m1746y(int i3, DialogInterface.OnClickListener onClickListener) {
        return (C0468b) super.m2792j(i3, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0747c.a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public C0468b mo1737k(ListAdapter listAdapter, int i3, DialogInterface.OnClickListener onClickListener) {
        return (C0468b) super.mo1737k(listAdapter, i3, onClickListener);
    }

    public C0468b(Context context, int i3) {
        super(m1727o(context), m1729q(context, i3));
        Context contextM2788b = m2788b();
        Resources.Theme theme = contextM2788b.getTheme();
        int i4 = f1673e;
        int i5 = f1674f;
        this.f1677d = AbstractC0469c.m1748a(contextM2788b, i4, i5);
        int iM1631c = AbstractC0450a.m1631c(contextM2788b, AbstractC0140a.f341i, getClass().getCanonicalName());
        TypedArray typedArrayObtainStyledAttributes = contextM2788b.obtainStyledAttributes(null, AbstractC0150k.f921j2, i4, i5);
        int color = typedArrayObtainStyledAttributes.getColor(AbstractC0150k.f971o2, iM1631c);
        typedArrayObtainStyledAttributes.recycle();
        C0637h c0637h = new C0637h(contextM2788b, null, i4, i5);
        c0637h.m2266Q(contextM2788b);
        c0637h.m2274c0(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(m2788b().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                c0637h.m2270Y(dimension);
            }
        }
        this.f1676c = c0637h;
    }
}
