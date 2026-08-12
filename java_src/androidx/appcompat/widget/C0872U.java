package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0785d;
import androidx.appcompat.view.menu.C0786e;
import androidx.appcompat.view.menu.C0788g;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.appcompat.widget.U */
/* JADX INFO: loaded from: classes.dex */
public class C0872U extends C0841S implements InterfaceC0862T {

    /* JADX INFO: renamed from: K */
    private static Method f3562K;

    /* JADX INFO: renamed from: J */
    private InterfaceC0862T f3563J;

    /* JADX INFO: renamed from: androidx.appcompat.widget.U$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static void m3672a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        /* JADX INFO: renamed from: b */
        static void m3673b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.U$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static void m3674a(PopupWindow popupWindow, boolean z2) {
            popupWindow.setTouchModal(z2);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.U$c */
    public static class c extends C0837N {

        /* JADX INFO: renamed from: n */
        final int f3564n;

        /* JADX INFO: renamed from: o */
        final int f3565o;

        /* JADX INFO: renamed from: p */
        private InterfaceC0862T f3566p;

        /* JADX INFO: renamed from: q */
        private MenuItem f3567q;

        public c(Context context, boolean z2) {
            super(context, z2);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f3564n = 21;
                this.f3565o = 22;
            } else {
                this.f3564n = 22;
                this.f3565o = 21;
            }
        }

        @Override // androidx.appcompat.widget.C0837N
        /* JADX INFO: renamed from: d */
        public /* bridge */ /* synthetic */ int mo3469d(int i3, int i4, int i5, int i6, int i7) {
            return super.mo3469d(i3, i4, i5, i6, i7);
        }

        @Override // androidx.appcompat.widget.C0837N
        /* JADX INFO: renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo3470e(MotionEvent motionEvent, int i3) {
            return super.mo3470e(motionEvent, i3);
        }

        @Override // androidx.appcompat.widget.C0837N, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.C0837N, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.C0837N, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.C0837N, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.C0837N, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            C0785d c0785d;
            int headersCount;
            int iPointToPosition;
            int i3;
            if (this.f3566p != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c0785d = (C0785d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0785d = (C0785d) adapter;
                    headersCount = 0;
                }
                C0788g item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i3 = iPointToPosition - headersCount) < 0 || i3 >= c0785d.getCount()) ? null : c0785d.getItem(i3);
                MenuItem menuItem = this.f3567q;
                if (menuItem != item) {
                    C0786e c0786eM3110b = c0785d.m3110b();
                    if (menuItem != null) {
                        this.f3566p.mo3101b(c0786eM3110b, menuItem);
                    }
                    this.f3567q = item;
                    if (item != null) {
                        this.f3566p.mo3100a(c0786eM3110b, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i3, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i3 == this.f3564n) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i3 != this.f3565o) {
                return super.onKeyDown(i3, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (C0785d) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0785d) adapter).m3110b().m3154e(false);
            return true;
        }

        @Override // androidx.appcompat.widget.C0837N, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(InterfaceC0862T interfaceC0862T) {
            this.f3566p = interfaceC0862T;
        }

        @Override // androidx.appcompat.widget.C0837N, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f3562K = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0872U(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
    }

    /* JADX INFO: renamed from: S */
    public void m3668S(Object obj) {
        a.m3672a(this.f3351F, (Transition) obj);
    }

    /* JADX INFO: renamed from: T */
    public void m3669T(Object obj) {
        a.m3673b(this.f3351F, (Transition) obj);
    }

    /* JADX INFO: renamed from: U */
    public void m3670U(InterfaceC0862T interfaceC0862T) {
        this.f3563J = interfaceC0862T;
    }

    /* JADX INFO: renamed from: V */
    public void m3671V(boolean z2) {
        if (Build.VERSION.SDK_INT > 28) {
            b.m3674a(this.f3351F, z2);
            return;
        }
        Method method = f3562K;
        if (method != null) {
            try {
                method.invoke(this.f3351F, Boolean.valueOf(z2));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0862T
    /* JADX INFO: renamed from: a */
    public void mo3100a(C0786e c0786e, MenuItem menuItem) {
        InterfaceC0862T interfaceC0862T = this.f3563J;
        if (interfaceC0862T != null) {
            interfaceC0862T.mo3100a(c0786e, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0862T
    /* JADX INFO: renamed from: b */
    public void mo3101b(C0786e c0786e, MenuItem menuItem) {
        InterfaceC0862T interfaceC0862T = this.f3563J;
        if (interfaceC0862T != null) {
            interfaceC0862T.mo3101b(c0786e, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.C0841S
    /* JADX INFO: renamed from: s */
    C0837N mo3534s(Context context, boolean z2) {
        c cVar = new c(context, z2);
        cVar.setHoverListener(this);
        return cVar;
    }
}
