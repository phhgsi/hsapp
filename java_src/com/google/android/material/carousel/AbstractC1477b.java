package com.google.android.material.carousel;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.google.android.material.carousel.b */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1477b {

    /* JADX INFO: renamed from: a */
    final int f7299a;

    /* JADX INFO: renamed from: com.google.android.material.carousel.b$a */
    class a extends AbstractC1477b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CarouselLayoutManager f7300b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i3, CarouselLayoutManager carouselLayoutManager) {
            super(i3, null);
            this.f7300b = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.AbstractC1477b
        /* JADX INFO: renamed from: d */
        int mo7841d() {
            return this.f7300b.m5826b0();
        }

        @Override // com.google.android.material.carousel.AbstractC1477b
        /* JADX INFO: renamed from: e */
        int mo7842e() {
            return this.f7300b.m5840i0();
        }

        @Override // com.google.android.material.carousel.AbstractC1477b
        /* JADX INFO: renamed from: f */
        int mo7843f() {
            return this.f7300b.m5862s0() - this.f7300b.m5843j0();
        }

        @Override // com.google.android.material.carousel.AbstractC1477b
        /* JADX INFO: renamed from: g */
        int mo7844g() {
            return mo7845h();
        }

        @Override // com.google.android.material.carousel.AbstractC1477b
        /* JADX INFO: renamed from: h */
        int mo7845h() {
            return 0;
        }

        @Override // com.google.android.material.carousel.AbstractC1477b
        /* JADX INFO: renamed from: i */
        public void mo7846i(View view, int i3, int i4) {
            int iMo7842e = mo7842e();
            this.f7300b.m5786D0(view, iMo7842e, i3, iMo7842e + m7848k(view), i4);
        }

        @Override // com.google.android.material.carousel.AbstractC1477b
        /* JADX INFO: renamed from: j */
        public void mo7847j(View view, Rect rect, float f3, float f4) {
            view.offsetTopAndBottom((int) (f4 - (rect.top + f3)));
        }

        /* JADX INFO: renamed from: k */
        int m7848k(View view) {
            RecyclerView.C1206q c1206q = (RecyclerView.C1206q) view.getLayoutParams();
            return this.f7300b.m5821X(view) + ((ViewGroup.MarginLayoutParams) c1206q).leftMargin + ((ViewGroup.MarginLayoutParams) c1206q).rightMargin;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.b$b */
    class b extends AbstractC1477b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CarouselLayoutManager f7301b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i3, CarouselLayoutManager carouselLayoutManager) {
            super(i3, null);
            this.f7301b = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.AbstractC1477b
        /* JADX INFO: renamed from: d */
        int mo7841d() {
            return this.f7301b.m5826b0() - this.f7301b.m5838h0();
        }

        @Override // com.google.android.material.carousel.AbstractC1477b
        /* JADX INFO: renamed from: e */
        int mo7842e() {
            return 0;
        }

        @Override // com.google.android.material.carousel.AbstractC1477b
        /* JADX INFO: renamed from: f */
        int mo7843f() {
            return this.f7301b.m5862s0();
        }

        @Override // com.google.android.material.carousel.AbstractC1477b
        /* JADX INFO: renamed from: g */
        int mo7844g() {
            return this.f7301b.m7823F2() ? mo7843f() : mo7842e();
        }

        @Override // com.google.android.material.carousel.AbstractC1477b
        /* JADX INFO: renamed from: h */
        int mo7845h() {
            return this.f7301b.m5845k0();
        }

        @Override // com.google.android.material.carousel.AbstractC1477b
        /* JADX INFO: renamed from: i */
        public void mo7846i(View view, int i3, int i4) {
            int iMo7845h = mo7845h();
            this.f7301b.m5786D0(view, i3, iMo7845h, i4, iMo7845h + m7849k(view));
        }

        @Override // com.google.android.material.carousel.AbstractC1477b
        /* JADX INFO: renamed from: j */
        public void mo7847j(View view, Rect rect, float f3, float f4) {
            view.offsetLeftAndRight((int) (f4 - (rect.left + f3)));
        }

        /* JADX INFO: renamed from: k */
        int m7849k(View view) {
            RecyclerView.C1206q c1206q = (RecyclerView.C1206q) view.getLayoutParams();
            return this.f7301b.m5820W(view) + ((ViewGroup.MarginLayoutParams) c1206q).topMargin + ((ViewGroup.MarginLayoutParams) c1206q).bottomMargin;
        }
    }

    /* synthetic */ AbstractC1477b(int i3, a aVar) {
        this(i3);
    }

    /* JADX INFO: renamed from: a */
    private static AbstractC1477b m7838a(CarouselLayoutManager carouselLayoutManager) {
        return new b(0, carouselLayoutManager);
    }

    /* JADX INFO: renamed from: b */
    static AbstractC1477b m7839b(CarouselLayoutManager carouselLayoutManager, int i3) {
        if (i3 == 0) {
            return m7838a(carouselLayoutManager);
        }
        if (i3 == 1) {
            return m7840c(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* JADX INFO: renamed from: c */
    private static AbstractC1477b m7840c(CarouselLayoutManager carouselLayoutManager) {
        return new a(1, carouselLayoutManager);
    }

    /* JADX INFO: renamed from: d */
    abstract int mo7841d();

    /* JADX INFO: renamed from: e */
    abstract int mo7842e();

    /* JADX INFO: renamed from: f */
    abstract int mo7843f();

    /* JADX INFO: renamed from: g */
    abstract int mo7844g();

    /* JADX INFO: renamed from: h */
    abstract int mo7845h();

    /* JADX INFO: renamed from: i */
    abstract void mo7846i(View view, int i3, int i4);

    /* JADX INFO: renamed from: j */
    abstract void mo7847j(View view, Rect rect, float f3, float f4);

    private AbstractC1477b(int i3) {
        this.f7299a = i3;
    }
}
