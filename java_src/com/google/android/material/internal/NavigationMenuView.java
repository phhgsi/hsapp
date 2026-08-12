package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.C0786e;
import androidx.appcompat.view.menu.InterfaceC0792k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC0792k {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0792k
    /* JADX INFO: renamed from: b */
    public void mo3054b(C0786e c0786e) {
    }

    public int getWindowAnimations() {
        return 0;
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }
}
