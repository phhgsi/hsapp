package p003B;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import p027J.AbstractC0275b;

/* JADX INFO: renamed from: B.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceMenuItemC0029b extends MenuItem {
    /* JADX INFO: renamed from: a */
    AbstractC0275b mo80a();

    /* JADX INFO: renamed from: b */
    InterfaceMenuItemC0029b mo81b(AbstractC0275b abstractC0275b);

    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    MenuItem setActionView(int i3);

    @Override // android.view.MenuItem
    MenuItem setActionView(View view);

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c3, int i3);

    @Override // android.view.MenuItem
    InterfaceMenuItemC0029b setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c3, int i3);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c3, char c4, int i3, int i4);

    @Override // android.view.MenuItem
    void setShowAsAction(int i3);

    @Override // android.view.MenuItem
    MenuItem setShowAsActionFlags(int i3);

    @Override // android.view.MenuItem
    InterfaceMenuItemC0029b setTooltipText(CharSequence charSequence);
}
