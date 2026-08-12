package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* JADX INFO: renamed from: androidx.appcompat.view.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractWindowCallbackC0779i implements Window.Callback {

    /* JADX INFO: renamed from: a */
    final Window.Callback f2887a;

    /* JADX INFO: renamed from: androidx.appcompat.view.i$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static boolean m3039a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        /* JADX INFO: renamed from: b */
        static ActionMode m3040b(Window.Callback callback, ActionMode.Callback callback2, int i3) {
            return callback.onWindowStartingActionMode(callback2, i3);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.i$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static void m3041a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i3) {
            callback.onProvideKeyboardShortcuts(list, menu, i3);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.i$c */
    static class c {
        /* JADX INFO: renamed from: a */
        static void m3042a(Window.Callback callback, boolean z2) {
            callback.onPointerCaptureChanged(z2);
        }
    }

    public AbstractWindowCallbackC0779i(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f2887a = callback;
    }

    /* JADX INFO: renamed from: a */
    public final Window.Callback m3038a() {
        return this.f2887a;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2887a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f2887a.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f2887a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2887a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2887a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2887a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.f2887a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.f2887a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f2887a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i3, Menu menu) {
        return this.f2887a.onCreatePanelMenu(i3, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i3) {
        return this.f2887a.onCreatePanelView(i3);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f2887a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        return this.f2887a.onMenuItemSelected(i3, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i3, Menu menu) {
        return this.f2887a.onMenuOpened(i3, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i3, Menu menu) {
        this.f2887a.onPanelClosed(i3, menu);
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z2) {
        c.m3042a(this.f2887a, z2);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i3, View view, Menu menu) {
        return this.f2887a.onPreparePanel(i3, view, menu);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List list, Menu menu, int i3) {
        b.m3041a(this.f2887a, list, menu, i3);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return a.m3039a(this.f2887a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f2887a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z2) {
        this.f2887a.onWindowFocusChanged(z2);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i3) {
        return a.m3040b(this.f2887a, callback, i3);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f2887a.onSearchRequested();
    }
}
