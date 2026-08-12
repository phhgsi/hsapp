package androidx.fragment.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.DialogC0717q;
import androidx.lifecycle.AbstractC1111L;
import androidx.lifecycle.AbstractC1116M;
import androidx.lifecycle.InterfaceC1132n;
import androidx.lifecycle.InterfaceC1137s;
import p100f0.AbstractC1891e;

/* JADX INFO: renamed from: androidx.fragment.app.c */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC1075c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private boolean mCreatingDialog;
    private Dialog mDialog;
    private boolean mDismissed;
    private Handler mHandler;
    private boolean mShownByMe;
    private boolean mViewDestroyed;
    private Runnable mDismissRunnable = new a();
    private DialogInterface.OnCancelListener mOnCancelListener = new b();
    private DialogInterface.OnDismissListener mOnDismissListener = new c();
    private int mStyle = 0;
    private int mTheme = 0;
    private boolean mCancelable = true;
    private boolean mShowsDialog = true;
    private int mBackStackId = -1;
    private InterfaceC1137s mObserver = new d();
    private boolean mDialogCreated = false;

    /* JADX INFO: renamed from: androidx.fragment.app.c$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogInterfaceOnCancelListenerC1075c.this.mOnDismissListener.onDismiss(DialogInterfaceOnCancelListenerC1075c.this.mDialog);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$b */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC1075c.this.mDialog != null) {
                DialogInterfaceOnCancelListenerC1075c dialogInterfaceOnCancelListenerC1075c = DialogInterfaceOnCancelListenerC1075c.this;
                dialogInterfaceOnCancelListenerC1075c.onCancel(dialogInterfaceOnCancelListenerC1075c.mDialog);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$c */
    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC1075c.this.mDialog != null) {
                DialogInterfaceOnCancelListenerC1075c dialogInterfaceOnCancelListenerC1075c = DialogInterfaceOnCancelListenerC1075c.this;
                dialogInterfaceOnCancelListenerC1075c.onDismiss(dialogInterfaceOnCancelListenerC1075c.mDialog);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$d */
    class d implements InterfaceC1137s {
        d() {
        }

        @Override // androidx.lifecycle.InterfaceC1137s
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo4919a(InterfaceC1132n interfaceC1132n) {
            if (interfaceC1132n == null || !DialogInterfaceOnCancelListenerC1075c.this.mShowsDialog) {
                return;
            }
            View viewRequireView = DialogInterfaceOnCancelListenerC1075c.this.requireView();
            if (viewRequireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (DialogInterfaceOnCancelListenerC1075c.this.mDialog != null) {
                if (FragmentManager.m4744H0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogInterfaceOnCancelListenerC1075c.this.mDialog);
                }
                DialogInterfaceOnCancelListenerC1075c.this.mDialog.setContentView(viewRequireView);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$e */
    class e extends AbstractC1082j {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC1082j f5165a;

        e(AbstractC1082j abstractC1082j) {
            this.f5165a = abstractC1082j;
        }

        @Override // androidx.fragment.app.AbstractC1082j
        /* JADX INFO: renamed from: e */
        public View mo4736e(int i3) {
            return this.f5165a.mo4737g() ? this.f5165a.mo4736e(i3) : DialogInterfaceOnCancelListenerC1075c.this.onFindViewById(i3);
        }

        @Override // androidx.fragment.app.AbstractC1082j
        /* JADX INFO: renamed from: g */
        public boolean mo4737g() {
            return this.f5165a.mo4737g() || DialogInterfaceOnCancelListenerC1075c.this.onHasView();
        }
    }

    /* JADX INFO: renamed from: i */
    private void m4917i(boolean z2, boolean z3, boolean z4) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z3) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            if (z4) {
                getParentFragmentManager().m4823Y0(this.mBackStackId, 1);
            } else {
                getParentFragmentManager().m4820W0(this.mBackStackId, 1, z2);
            }
            this.mBackStackId = -1;
            return;
        }
        AbstractC1098z abstractC1098zM4849p = getParentFragmentManager().m4849p();
        abstractC1098zM4849p.m5053o(true);
        abstractC1098zM4849p.mo4888l(this);
        if (z4) {
            abstractC1098zM4849p.mo4885h();
        } else if (z2) {
            abstractC1098zM4849p.mo4884g();
        } else {
            abstractC1098zM4849p.mo4883f();
        }
    }

    /* JADX INFO: renamed from: j */
    private void m4918j(Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog dialogOnCreateDialog = onCreateDialog(bundle);
                this.mDialog = dialogOnCreateDialog;
                if (this.mShowsDialog) {
                    setupDialog(dialogOnCreateDialog, this.mStyle);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
                this.mCreatingDialog = false;
            } catch (Throwable th) {
                this.mCreatingDialog = false;
                throw th;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    AbstractC1082j createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    public void dismiss() {
        m4917i(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        m4917i(true, false, false);
    }

    public void dismissNow() {
        m4917i(false, false, true);
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().m5102e(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (FragmentManager.m4744H0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC0717q(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().m5105h(this.mObserver);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (FragmentManager.m4744H0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        m4917i(true, true, false);
    }

    View onFindViewById(int i3) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i3);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.mShowsDialog && !this.mCreatingDialog) {
            m4918j(bundle);
            if (FragmentManager.m4744H0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.mDialog;
            if (dialog != null) {
                return layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (FragmentManager.m4744H0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.mShowsDialog) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return layoutInflaterOnGetLayoutInflater;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, bundleOnSaveInstanceState);
        }
        int i3 = this.mStyle;
        if (i3 != 0) {
            bundle.putInt(SAVED_STYLE, i3);
        }
        int i4 = this.mTheme;
        if (i4 != 0) {
            bundle.putInt(SAVED_THEME, i4);
        }
        boolean z2 = this.mCancelable;
        if (!z2) {
            bundle.putBoolean(SAVED_CANCELABLE, z2);
        }
        boolean z3 = this.mShowsDialog;
        if (!z3) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z3);
        }
        int i5 = this.mBackStackId;
        if (i5 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i5);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            AbstractC1111L.m5091a(decorView, this);
            AbstractC1116M.m5112a(decorView, this);
            AbstractC1891e.m9775a(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z2) {
        this.mCancelable = z2;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z2);
        }
    }

    public void setShowsDialog(boolean z2) {
        this.mShowsDialog = z2;
    }

    public void setStyle(int i3, int i4) {
        if (FragmentManager.m4744H0(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i3 + ", " + i4);
        }
        this.mStyle = i3;
        if (i3 == 2 || i3 == 3) {
            this.mTheme = R.style.Theme.Panel;
        }
        if (i4 != 0) {
            this.mTheme = i4;
        }
    }

    public void setupDialog(Dialog dialog, int i3) {
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        AbstractC1098z abstractC1098zM4849p = fragmentManager.m4849p();
        abstractC1098zM4849p.m5053o(true);
        abstractC1098zM4849p.m5048d(this, str);
        abstractC1098zM4849p.mo4883f();
    }

    public void showNow(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        AbstractC1098z abstractC1098zM4849p = fragmentManager.m4849p();
        abstractC1098zM4849p.m5053o(true);
        abstractC1098zM4849p.m5048d(this, str);
        abstractC1098zM4849p.mo4885h();
    }

    public int show(AbstractC1098z abstractC1098z, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        abstractC1098z.m5048d(this, str);
        this.mViewDestroyed = false;
        int iMo4883f = abstractC1098z.mo4883f();
        this.mBackStackId = iMo4883f;
        return iMo4883f;
    }
}
