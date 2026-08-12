package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import p000A.InterfaceC0001b;

/* JADX INFO: renamed from: androidx.appcompat.widget.t */
/* JADX INFO: loaded from: classes.dex */
class C0914t {

    /* JADX INFO: renamed from: c */
    private static final int[] f3765c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a */
    private final ProgressBar f3766a;

    /* JADX INFO: renamed from: b */
    private Bitmap f3767b;

    /* JADX INFO: renamed from: androidx.appcompat.widget.t$a */
    private static class a {
        /* JADX INFO: renamed from: a */
        public static void m3889a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i3) {
            layerDrawable2.setLayerGravity(i3, layerDrawable.getLayerGravity(i3));
            layerDrawable2.setLayerWidth(i3, layerDrawable.getLayerWidth(i3));
            layerDrawable2.setLayerHeight(i3, layerDrawable.getLayerHeight(i3));
            layerDrawable2.setLayerInsetLeft(i3, layerDrawable.getLayerInsetLeft(i3));
            layerDrawable2.setLayerInsetRight(i3, layerDrawable.getLayerInsetRight(i3));
            layerDrawable2.setLayerInsetTop(i3, layerDrawable.getLayerInsetTop(i3));
            layerDrawable2.setLayerInsetBottom(i3, layerDrawable.getLayerInsetBottom(i3));
            layerDrawable2.setLayerInsetStart(i3, layerDrawable.getLayerInsetStart(i3));
            layerDrawable2.setLayerInsetEnd(i3, layerDrawable.getLayerInsetEnd(i3));
        }
    }

    C0914t(ProgressBar progressBar) {
        this.f3766a = progressBar;
    }

    /* JADX INFO: renamed from: a */
    private Shape m3884a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* JADX INFO: renamed from: e */
    private Drawable m3885e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i3 = 0; i3 < numberOfFrames; i3++) {
            Drawable drawableM3888d = m3888d(animationDrawable.getFrame(i3), true);
            drawableM3888d.setLevel(10000);
            animationDrawable2.addFrame(drawableM3888d, animationDrawable.getDuration(i3));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* JADX INFO: renamed from: b */
    Bitmap m3886b() {
        return this.f3767b;
    }

    /* JADX INFO: renamed from: c */
    void mo3887c(AttributeSet attributeSet, int i3) {
        C0888e0 c0888e0M3765v = C0888e0.m3765v(this.f3766a.getContext(), attributeSet, f3765c, i3, 0);
        Drawable drawableM3773h = c0888e0M3765v.m3773h(0);
        if (drawableM3773h != null) {
            this.f3766a.setIndeterminateDrawable(m3885e(drawableM3773h));
        }
        Drawable drawableM3773h2 = c0888e0M3765v.m3773h(1);
        if (drawableM3773h2 != null) {
            this.f3766a.setProgressDrawable(m3888d(drawableM3773h2, false));
        }
        c0888e0M3765v.m3786x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    Drawable m3888d(Drawable drawable, boolean z2) {
        if (drawable instanceof InterfaceC0001b) {
            InterfaceC0001b interfaceC0001b = (InterfaceC0001b) drawable;
            Drawable drawableM30b = interfaceC0001b.m30b();
            if (drawableM30b != null) {
                interfaceC0001b.m29a(m3888d(drawableM30b, z2));
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i3 = 0; i3 < numberOfLayers; i3++) {
                    int id = layerDrawable.getId(i3);
                    drawableArr[i3] = m3888d(layerDrawable.getDrawable(i3), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i4 = 0; i4 < numberOfLayers; i4++) {
                    layerDrawable2.setId(i4, layerDrawable.getId(i4));
                    a.m3889a(layerDrawable, layerDrawable2, i4);
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f3767b == null) {
                    this.f3767b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(m3884a());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z2 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
