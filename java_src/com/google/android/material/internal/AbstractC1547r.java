package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.material.internal.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1547r {

    /* JADX INFO: renamed from: a */
    private static final Comparator f7803a = new a();

    /* JADX INFO: renamed from: com.google.android.material.internal.r$a */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    /* JADX INFO: renamed from: a */
    private static ImageView m8490a(Toolbar toolbar, Drawable drawable) {
        ImageView imageView;
        Drawable drawable2;
        if (drawable == null) {
            return null;
        }
        for (int i3 = 0; i3 < toolbar.getChildCount(); i3++) {
            View childAt = toolbar.getChildAt(i3);
            if ((childAt instanceof ImageView) && (drawable2 = (imageView = (ImageView) childAt).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                return imageView;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static ImageView m8491b(Toolbar toolbar) {
        return m8490a(toolbar, toolbar.getLogo());
    }

    /* JADX INFO: renamed from: c */
    public static TextView m8492c(Toolbar toolbar) {
        List listM8493d = m8493d(toolbar, toolbar.getSubtitle());
        if (listM8493d.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(listM8493d, f7803a);
    }

    /* JADX INFO: renamed from: d */
    private static List m8493d(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < toolbar.getChildCount(); i3++) {
            View childAt = toolbar.getChildAt(i3);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static TextView m8494e(Toolbar toolbar) {
        List listM8493d = m8493d(toolbar, toolbar.getTitle());
        if (listM8493d.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(listM8493d, f7803a);
    }
}
