package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.base.C1385R;
import com.google.android.gms.common.util.DeviceProperties;
import p000A.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
public final class zaaa extends Button {
    public zaaa(Context context, AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    private static final int zab(int i3, int i4, int i5, int i6) {
        if (i3 == 0) {
            return i4;
        }
        if (i3 == 1) {
            return i5;
        }
        if (i3 == 2) {
            return i6;
        }
        throw new IllegalStateException("Unknown color scheme: " + i3);
    }

    public final void zaa(Resources resources, int i3, int i4) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i5 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i5);
        setMinWidth(i5);
        int i6 = C1385R.drawable.common_google_signin_btn_icon_dark;
        int i7 = C1385R.drawable.common_google_signin_btn_icon_light;
        int iZab = zab(i4, i6, i7, i7);
        int i8 = C1385R.drawable.common_google_signin_btn_text_dark;
        int i9 = C1385R.drawable.common_google_signin_btn_text_light;
        int iZab2 = zab(i4, i8, i9, i9);
        if (i3 == 0 || i3 == 1) {
            iZab = iZab2;
        } else if (i3 != 2) {
            throw new IllegalStateException("Unknown button size: " + i3);
        }
        Drawable drawableM17r = AbstractC0000a.m17r(resources.getDrawable(iZab));
        AbstractC0000a.m14o(drawableM17r, resources.getColorStateList(C1385R.color.common_google_signin_btn_tint));
        AbstractC0000a.m15p(drawableM17r, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawableM17r);
        int i10 = C1385R.color.common_google_signin_btn_text_dark;
        int i11 = C1385R.color.common_google_signin_btn_text_light;
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zab(i4, i10, i11, i11))));
        if (i3 == 0) {
            setText(resources.getString(C1385R.string.common_signin_button_text));
        } else if (i3 == 1) {
            setText(resources.getString(C1385R.string.common_signin_button_text_long));
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("Unknown button size: " + i3);
            }
            setText((CharSequence) null);
        }
        setTransformationMethod(null);
        if (DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}
