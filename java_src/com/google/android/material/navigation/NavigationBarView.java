package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.view.C0777g;
import androidx.appcompat.view.menu.C0786e;
import androidx.appcompat.view.menu.InterfaceC0792k;
import androidx.customview.view.AbsSavedState;
import p076Z0.AbstractC0638i;
import p076Z0.C0641l;

/* JADX INFO: loaded from: classes.dex */
public abstract class NavigationBarView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private final C1571h f7817a;

    /* JADX INFO: renamed from: b */
    private final AbstractC1574k f7818b;

    /* JADX INFO: renamed from: c */
    private final NavigationBarPresenter f7819c;

    /* JADX INFO: renamed from: d */
    private MenuInflater f7820d;

    /* JADX INFO: renamed from: e */
    private InterfaceC1558c f7821e;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1555a();

        /* JADX INFO: renamed from: f */
        Bundle f7822f;

        /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationBarView$SavedState$a */
        class C1555a implements Parcelable.ClassLoaderCreator {
            C1555a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i3) {
                return new SavedState[i3];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* JADX INFO: renamed from: d */
        private void m8524d(Parcel parcel, ClassLoader classLoader) {
            this.f7822f = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            super.writeToParcel(parcel, i3);
            parcel.writeBundle(this.f7822f);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m8524d(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationBarView$a */
    class C1556a implements C0786e.a {
        C1556a() {
        }

        @Override // androidx.appcompat.view.menu.C0786e.a
        /* JADX INFO: renamed from: a */
        public boolean mo2719a(C0786e c0786e, MenuItem menuItem) {
            NavigationBarView.m8518a(NavigationBarView.this);
            return (NavigationBarView.this.f7821e == null || NavigationBarView.this.f7821e.mo7180a(menuItem)) ? false : true;
        }

        @Override // androidx.appcompat.view.menu.C0786e.a
        /* JADX INFO: renamed from: b */
        public void mo2720b(C0786e c0786e) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationBarView$b */
    public interface InterfaceC1557b {
    }

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationBarView$c */
    public interface InterfaceC1558c {
        /* JADX INFO: renamed from: a */
        boolean mo7180a(MenuItem menuItem);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NavigationBarView(android.content.Context r11, android.util.AttributeSet r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationBarView.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ InterfaceC1557b m8518a(NavigationBarView navigationBarView) {
        navigationBarView.getClass();
        return null;
    }

    private MenuInflater getMenuInflater() {
        if (this.f7820d == null) {
            this.f7820d = new C0777g(getContext());
        }
        return this.f7820d;
    }

    private void setMeasureBottomPaddingFromLabelBaseline(boolean z2) {
        this.f7818b.setMeasurePaddingFromLabelBaseline(z2);
    }

    /* JADX INFO: renamed from: c */
    protected abstract AbstractC1574k mo7585c(Context context);

    /* JADX INFO: renamed from: d */
    public void m8520d(int i3) {
        this.f7819c.m8515g(true);
        getMenuInflater().inflate(i3, this.f7817a);
        this.f7819c.m8515g(false);
        this.f7819c.mo3068i(true);
    }

    /* JADX INFO: renamed from: e */
    protected boolean m8521e() {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m8522f(int i3, int i4, int i5, int i6) {
        this.f7818b.m8611o(i3, i4, i5, i6);
    }

    /* JADX INFO: renamed from: g */
    public boolean m8523g() {
        return false;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f7818b.getActiveIndicatorLabelPadding();
    }

    public int getCollapsedMaxItemCount() {
        return getMaxItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.f7818b.getHorizontalItemTextAppearanceActive();
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.f7818b.getHorizontalItemTextAppearanceInactive();
    }

    public int getIconLabelHorizontalSpacing() {
        return this.f7818b.getIconLabelHorizontalSpacing();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f7818b.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.f7818b.getItemActiveIndicatorExpandedHeight();
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.f7818b.getItemActiveIndicatorExpandedMarginHorizontal();
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.f7818b.getItemActiveIndicatorExpandedWidth();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f7818b.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f7818b.getItemActiveIndicatorMarginHorizontal();
    }

    public C0641l getItemActiveIndicatorShapeAppearance() {
        return this.f7818b.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f7818b.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f7818b.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f7818b.getItemBackgroundRes();
    }

    public int getItemGravity() {
        return this.f7818b.getItemGravity();
    }

    public int getItemIconGravity() {
        return this.f7818b.getItemIconGravity();
    }

    public int getItemIconSize() {
        return this.f7818b.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f7818b.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f7818b.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f7818b.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f7818b.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f7818b.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f7818b.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f7818b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f7818b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f7817a;
    }

    public InterfaceC0792k getMenuView() {
        return this.f7818b;
    }

    public ViewGroup getMenuViewGroup() {
        return this.f7818b;
    }

    public NavigationBarPresenter getPresenter() {
        return this.f7819c;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.f7818b.getScaleLabelTextWithFont();
    }

    public int getSelectedItemId() {
        return this.f7818b.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0638i.m2300e(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m4418a());
        this.f7817a.m3140T(savedState.f7822f);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f7822f = bundle;
        this.f7817a.m3142V(bundle);
        return savedState;
    }

    public void setActiveIndicatorLabelPadding(int i3) {
        this.f7818b.setActiveIndicatorLabelPadding(i3);
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        AbstractC0638i.m2299d(this, f3);
    }

    public void setHorizontalItemTextAppearanceActive(int i3) {
        this.f7818b.setHorizontalItemTextAppearanceActive(i3);
    }

    public void setHorizontalItemTextAppearanceInactive(int i3) {
        this.f7818b.setHorizontalItemTextAppearanceInactive(i3);
    }

    public void setIconLabelHorizontalSpacing(int i3) {
        this.f7818b.setIconLabelHorizontalSpacing(i3);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f7818b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z2) {
        this.f7818b.setItemActiveIndicatorEnabled(z2);
    }

    public void setItemActiveIndicatorExpandedHeight(int i3) {
        this.f7818b.setItemActiveIndicatorExpandedHeight(i3);
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i3) {
        this.f7818b.setItemActiveIndicatorExpandedMarginHorizontal(i3);
    }

    public void setItemActiveIndicatorExpandedWidth(int i3) {
        this.f7818b.setItemActiveIndicatorExpandedWidth(i3);
    }

    public void setItemActiveIndicatorHeight(int i3) {
        this.f7818b.setItemActiveIndicatorHeight(i3);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i3) {
        this.f7818b.setItemActiveIndicatorMarginHorizontal(i3);
    }

    public void setItemActiveIndicatorShapeAppearance(C0641l c0641l) {
        this.f7818b.setItemActiveIndicatorShapeAppearance(c0641l);
    }

    public void setItemActiveIndicatorWidth(int i3) {
        this.f7818b.setItemActiveIndicatorWidth(i3);
    }

    public void setItemBackground(Drawable drawable) {
        this.f7818b.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i3) {
        this.f7818b.setItemBackgroundRes(i3);
    }

    public void setItemGravity(int i3) {
        if (this.f7818b.getItemGravity() != i3) {
            this.f7818b.setItemGravity(i3);
            this.f7819c.mo3068i(false);
        }
    }

    public void setItemIconGravity(int i3) {
        if (this.f7818b.getItemIconGravity() != i3) {
            this.f7818b.setItemIconGravity(i3);
            this.f7819c.mo3068i(false);
        }
    }

    public void setItemIconSize(int i3) {
        this.f7818b.setItemIconSize(i3);
    }

    public void setItemIconSizeRes(int i3) {
        setItemIconSize(getResources().getDimensionPixelSize(i3));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f7818b.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i3) {
        this.f7818b.setItemPaddingBottom(i3);
    }

    public void setItemPaddingTop(int i3) {
        this.f7818b.setItemPaddingTop(i3);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f7818b.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i3) {
        this.f7818b.setItemTextAppearanceActive(i3);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z2) {
        this.f7818b.setItemTextAppearanceActiveBoldEnabled(z2);
    }

    public void setItemTextAppearanceInactive(int i3) {
        this.f7818b.setItemTextAppearanceInactive(i3);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f7818b.setItemTextColor(colorStateList);
    }

    public void setLabelFontScalingEnabled(boolean z2) {
        this.f7818b.setLabelFontScalingEnabled(z2);
    }

    public void setLabelMaxLines(int i3) {
        this.f7818b.setLabelMaxLines(i3);
    }

    public void setLabelVisibilityMode(int i3) {
        if (this.f7818b.getLabelVisibilityMode() != i3) {
            this.f7818b.setLabelVisibilityMode(i3);
            this.f7819c.mo3068i(false);
        }
    }

    public void setOnItemReselectedListener(InterfaceC1557b interfaceC1557b) {
    }

    public void setOnItemSelectedListener(InterfaceC1558c interfaceC1558c) {
        this.f7821e = interfaceC1558c;
    }

    public void setSelectedItemId(int i3) {
        MenuItem menuItemFindItem = this.f7817a.findItem(i3);
        if (menuItemFindItem != null) {
            boolean zM3137P = this.f7817a.m3137P(menuItemFindItem, this.f7819c, 0);
            if (menuItemFindItem.isCheckable()) {
                if (!zM3137P || menuItemFindItem.isChecked()) {
                    this.f7818b.setCheckedItem(menuItemFindItem);
                }
            }
        }
    }
}
