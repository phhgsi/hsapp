package co.median.android.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import androidx.appcompat.widget.C0911q;
import p027J.AbstractC0268W;

/* JADX INFO: renamed from: co.median.android.widget.a */
/* JADX INFO: loaded from: classes.dex */
class C1368a extends C0911q {

    /* JADX INFO: renamed from: d */
    private Animation.AnimationListener f6766d;

    /* JADX INFO: renamed from: e */
    int f6767e;

    /* JADX INFO: renamed from: co.median.android.widget.a$a */
    private class a extends OvalShape {

        /* JADX INFO: renamed from: d */
        private RadialGradient f6768d;

        /* JADX INFO: renamed from: e */
        private Paint f6769e = new Paint();

        a(int i3) {
            C1368a.this.f6767e = i3;
            m7129a((int) rect().width());
        }

        /* JADX INFO: renamed from: a */
        private void m7129a(int i3) {
            float f3 = i3 / 2;
            RadialGradient radialGradient = new RadialGradient(f3, f3, C1368a.this.f6767e, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f6768d = radialGradient;
            this.f6769e.setShader(radialGradient);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = C1368a.this.getWidth() / 2;
            float height = C1368a.this.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.f6769e);
            canvas.drawCircle(width, height, r0 - C1368a.this.f6767e, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f3, float f4) {
            super.onResize(f3, f4);
            m7129a((int) f3);
        }
    }

    C1368a(Context context, int i3) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f3 = getContext().getResources().getDisplayMetrics().density;
        int i4 = (int) (1.75f * f3);
        int i5 = (int) (0.0f * f3);
        this.f6767e = (int) (3.5f * f3);
        if (m7127c()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            AbstractC0268W.m787o0(this, f3 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new a(this.f6767e));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f6767e, i5, i4, 503316480);
            int i6 = this.f6767e;
            setPadding(i6, i6, i6, i6);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i3);
        AbstractC0268W.m781l0(this, shapeDrawable);
    }

    /* JADX INFO: renamed from: c */
    private boolean m7127c() {
        return true;
    }

    /* JADX INFO: renamed from: d */
    public void m7128d(Animation.AnimationListener animationListener) {
        this.f6766d = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f6766d;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f6766d;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        if (m7127c()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f6767e * 2), getMeasuredHeight() + (this.f6767e * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i3) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i3);
        }
    }
}
