package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: androidx.appcompat.widget.d0 */
/* JADX INFO: loaded from: classes.dex */
class C0886d0 extends AbstractC0875W {

    /* JADX INFO: renamed from: b */
    private final WeakReference f3650b;

    public C0886d0(Context context, Resources resources) {
        super(resources);
        this.f3650b = new WeakReference(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i3) {
        Drawable drawableM3709a = m3709a(i3);
        Context context = (Context) this.f3650b.get();
        if (drawableM3709a != null && context != null) {
            C0873V.m3682h().m3698x(context, i3, drawableM3709a);
        }
        return drawableM3709a;
    }
}
