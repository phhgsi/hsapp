package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: androidx.appcompat.widget.b */
/* JADX INFO: loaded from: classes.dex */
class C0881b extends Drawable {

    /* JADX INFO: renamed from: a */
    final ActionBarContainer f3631a;

    /* JADX INFO: renamed from: androidx.appcompat.widget.b$a */
    private static class a {
        /* JADX INFO: renamed from: a */
        public static void m3747a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C0881b(ActionBarContainer actionBarContainer) {
        this.f3631a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f3631a;
        if (actionBarContainer.f3115h) {
            Drawable drawable = actionBarContainer.f3114g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f3112e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f3631a;
        Drawable drawable3 = actionBarContainer2.f3113f;
        if (drawable3 == null || !actionBarContainer2.f3116i) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f3631a;
        if (actionBarContainer.f3115h) {
            if (actionBarContainer.f3114g != null) {
                a.m3747a(actionBarContainer.f3112e, outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f3112e;
            if (drawable != null) {
                a.m3747a(drawable, outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i3) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
