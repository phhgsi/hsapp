package p030K;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: K.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0332a extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    private final int f1419a;

    /* JADX INFO: renamed from: b */
    private final C0356y f1420b;

    /* JADX INFO: renamed from: c */
    private final int f1421c;

    public C0332a(int i3, C0356y c0356y, int i4) {
        this.f1419a = i3;
        this.f1420b = c0356y;
        this.f1421c = i4;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1419a);
        this.f1420b.m1272i0(this.f1421c, bundle);
    }
}
