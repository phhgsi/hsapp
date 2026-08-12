package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.DialogInterfaceC0747c;
import p024I.AbstractC0206c;
import p091d.AbstractC1760a;
import p095e.AbstractC1832a;
import p111i.InterfaceC2024e;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {

    /* JADX INFO: renamed from: i */
    private static final int[] f3220i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a */
    private final C0885d f3221a;

    /* JADX INFO: renamed from: b */
    private final Context f3222b;

    /* JADX INFO: renamed from: c */
    private AbstractViewOnTouchListenerC0839P f3223c;

    /* JADX INFO: renamed from: d */
    private SpinnerAdapter f3224d;

    /* JADX INFO: renamed from: e */
    private final boolean f3225e;

    /* JADX INFO: renamed from: f */
    private InterfaceC0823g f3226f;

    /* JADX INFO: renamed from: g */
    int f3227g;

    /* JADX INFO: renamed from: h */
    final Rect f3228h;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0816a();

        /* JADX INFO: renamed from: d */
        boolean f3229d;

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$SavedState$a */
        class C0816a implements Parcelable.Creator {
            C0816a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i3) {
                return new SavedState[i3];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            super.writeToParcel(parcel, i3);
            parcel.writeByte(this.f3229d ? (byte) 1 : (byte) 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f3229d = parcel.readByte() != 0;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    class C0817a extends AbstractViewOnTouchListenerC0839P {

        /* JADX INFO: renamed from: j */
        final /* synthetic */ C0822f f3230j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0817a(View view, C0822f c0822f) {
            super(view);
            this.f3230j = c0822f;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0839P
        /* JADX INFO: renamed from: b */
        public InterfaceC2024e mo3050b() {
            return this.f3230j;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0839P
        /* JADX INFO: renamed from: c */
        public boolean mo3051c() {
            if (AppCompatSpinner.this.getInternalPopup().mo3343c()) {
                return true;
            }
            AppCompatSpinner.this.m3339b();
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    class ViewTreeObserverOnGlobalLayoutListenerC0818b implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC0818b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().mo3343c()) {
                AppCompatSpinner.this.m3339b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$c */
    private static final class C0819c {
        /* JADX INFO: renamed from: a */
        static void m3342a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (AbstractC0206c.m596a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$d */
    class DialogInterfaceOnClickListenerC0820d implements InterfaceC0823g, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a */
        DialogInterfaceC0747c f3233a;

        /* JADX INFO: renamed from: b */
        private ListAdapter f3234b;

        /* JADX INFO: renamed from: c */
        private CharSequence f3235c;

        DialogInterfaceOnClickListenerC0820d() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0823g
        /* JADX INFO: renamed from: c */
        public boolean mo3343c() {
            DialogInterfaceC0747c dialogInterfaceC0747c = this.f3233a;
            if (dialogInterfaceC0747c != null) {
                return dialogInterfaceC0747c.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0823g
        /* JADX INFO: renamed from: d */
        public int mo3344d() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0823g
        public void dismiss() {
            DialogInterfaceC0747c dialogInterfaceC0747c = this.f3233a;
            if (dialogInterfaceC0747c != null) {
                dialogInterfaceC0747c.dismiss();
                this.f3233a = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0823g
        /* JADX INFO: renamed from: f */
        public Drawable mo3345f() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0823g
        /* JADX INFO: renamed from: h */
        public void mo3346h(CharSequence charSequence) {
            this.f3235c = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0823g
        /* JADX INFO: renamed from: i */
        public void mo3347i(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0823g
        /* JADX INFO: renamed from: j */
        public void mo3348j(int i3) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0823g
        /* JADX INFO: renamed from: k */
        public void mo3349k(int i3) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0823g
        /* JADX INFO: renamed from: l */
        public void mo3350l(int i3) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0823g
        /* JADX INFO: renamed from: m */
        public void mo3351m(int i3, int i4) {
            if (this.f3234b == null) {
                return;
            }
            DialogInterfaceC0747c.a aVar = new DialogInterfaceC0747c.a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f3235c;
            if (charSequence != null) {
                aVar.mo1738l(charSequence);
            }
            DialogInterfaceC0747c dialogInterfaceC0747cMo1732a = aVar.mo1737k(this.f3234b, AppCompatSpinner.this.getSelectedItemPosition(), this).mo1732a();
            this.f3233a = dialogInterfaceC0747cMo1732a;
            ListView listViewM2787k = dialogInterfaceC0747cMo1732a.m2787k();
            listViewM2787k.setTextDirection(i3);
            listViewM2787k.setTextAlignment(i4);
            this.f3233a.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0823g
        /* JADX INFO: renamed from: n */
        public int mo3352n() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0823g
        /* JADX INFO: renamed from: o */
        public CharSequence mo3353o() {
            return this.f3235c;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i3) {
            AppCompatSpinner.this.setSelection(i3);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i3, this.f3234b.getItemId(i3));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0823g
        /* JADX INFO: renamed from: p */
        public void mo3354p(ListAdapter listAdapter) {
            this.f3234b = listAdapter;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$e */
    private static class C0821e implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: a */
        private SpinnerAdapter f3237a;

        /* JADX INFO: renamed from: b */
        private ListAdapter f3238b;

        public C0821e(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f3237a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f3238b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null || !(spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                return;
            }
            C0819c.m3342a((ThemedSpinnerAdapter) spinnerAdapter, theme);
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f3238b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f3237a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i3, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f3237a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i3, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i3) {
            SpinnerAdapter spinnerAdapter = this.f3237a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i3);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i3) {
            SpinnerAdapter spinnerAdapter = this.f3237a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i3);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i3) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i3, View view, ViewGroup viewGroup) {
            return getDropDownView(i3, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f3237a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i3) {
            ListAdapter listAdapter = this.f3238b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i3);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f3237a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f3237a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$f */
    class C0822f extends C0841S implements InterfaceC0823g {

        /* JADX INFO: renamed from: J */
        private CharSequence f3239J;

        /* JADX INFO: renamed from: K */
        ListAdapter f3240K;

        /* JADX INFO: renamed from: L */
        private final Rect f3241L;

        /* JADX INFO: renamed from: M */
        private int f3242M;

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$f$a */
        class a implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ AppCompatSpinner f3244a;

            a(AppCompatSpinner appCompatSpinner) {
                this.f3244a = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
                AppCompatSpinner.this.setSelection(i3);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C0822f c0822f = C0822f.this;
                    AppCompatSpinner.this.performItemClick(view, i3, c0822f.f3240K.getItemId(i3));
                }
                C0822f.this.dismiss();
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$f$b */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C0822f c0822f = C0822f.this;
                if (!c0822f.m3358V(AppCompatSpinner.this)) {
                    C0822f.this.dismiss();
                } else {
                    C0822f.this.m3356T();
                    C0822f.super.mo3086e();
                }
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$f$c */
        class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f3247a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f3247a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f3247a);
                }
            }
        }

        public C0822f(Context context, AttributeSet attributeSet, int i3) {
            super(context, attributeSet, i3);
            this.f3241L = new Rect();
            m3513D(AppCompatSpinner.this);
            m3519J(true);
            m3524P(0);
            m3521L(new a(AppCompatSpinner.this));
        }

        /* JADX INFO: renamed from: T */
        void m3356T() {
            int i3;
            Drawable drawableM3528f = m3528f();
            if (drawableM3528f != null) {
                drawableM3528f.getPadding(AppCompatSpinner.this.f3228h);
                i3 = AbstractC0910p0.m3878b(AppCompatSpinner.this) ? AppCompatSpinner.this.f3228h.right : -AppCompatSpinner.this.f3228h.left;
            } else {
                Rect rect = AppCompatSpinner.this.f3228h;
                rect.right = 0;
                rect.left = 0;
                i3 = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i4 = appCompatSpinner.f3227g;
            if (i4 == -2) {
                int iM3338a = appCompatSpinner.m3338a((SpinnerAdapter) this.f3240K, m3528f());
                int i5 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f3228h;
                int i6 = (i5 - rect2.left) - rect2.right;
                if (iM3338a > i6) {
                    iM3338a = i6;
                }
                m3515F(Math.max(iM3338a, (width - paddingLeft) - paddingRight));
            } else if (i4 == -1) {
                m3515F((width - paddingLeft) - paddingRight);
            } else {
                m3515F(i4);
            }
            m3531l(AbstractC0910p0.m3878b(AppCompatSpinner.this) ? i3 + (((width - paddingRight) - m3540z()) - m3357U()) : i3 + paddingLeft + m3357U());
        }

        /* JADX INFO: renamed from: U */
        public int m3357U() {
            return this.f3242M;
        }

        /* JADX INFO: renamed from: V */
        boolean m3358V(View view) {
            return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.f3241L);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0823g
        /* JADX INFO: renamed from: h */
        public void mo3346h(CharSequence charSequence) {
            this.f3239J = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0823g
        /* JADX INFO: renamed from: k */
        public void mo3349k(int i3) {
            this.f3242M = i3;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0823g
        /* JADX INFO: renamed from: m */
        public void mo3351m(int i3, int i4) {
            ViewTreeObserver viewTreeObserver;
            boolean zMo3085c = mo3085c();
            m3356T();
            m3518I(2);
            super.mo3086e();
            ListView listViewMo3088g = mo3088g();
            listViewMo3088g.setChoiceMode(1);
            listViewMo3088g.setTextDirection(i3);
            listViewMo3088g.setTextAlignment(i4);
            m3525Q(AppCompatSpinner.this.getSelectedItemPosition());
            if (zMo3085c || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            m3520K(new c(bVar));
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0823g
        /* JADX INFO: renamed from: o */
        public CharSequence mo3353o() {
            return this.f3239J;
        }

        @Override // androidx.appcompat.widget.C0841S, androidx.appcompat.widget.AppCompatSpinner.InterfaceC0823g
        /* JADX INFO: renamed from: p */
        public void mo3354p(ListAdapter listAdapter) {
            super.mo3354p(listAdapter);
            this.f3240K = listAdapter;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$g */
    interface InterfaceC0823g {
        /* JADX INFO: renamed from: c */
        boolean mo3343c();

        /* JADX INFO: renamed from: d */
        int mo3344d();

        void dismiss();

        /* JADX INFO: renamed from: f */
        Drawable mo3345f();

        /* JADX INFO: renamed from: h */
        void mo3346h(CharSequence charSequence);

        /* JADX INFO: renamed from: i */
        void mo3347i(Drawable drawable);

        /* JADX INFO: renamed from: j */
        void mo3348j(int i3);

        /* JADX INFO: renamed from: k */
        void mo3349k(int i3);

        /* JADX INFO: renamed from: l */
        void mo3350l(int i3);

        /* JADX INFO: renamed from: m */
        void mo3351m(int i3, int i4);

        /* JADX INFO: renamed from: n */
        int mo3352n();

        /* JADX INFO: renamed from: o */
        CharSequence mo3353o();

        /* JADX INFO: renamed from: p */
        void mo3354p(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1760a.f8694L);
    }

    /* JADX INFO: renamed from: a */
    int m3338a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i3 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f3228h);
        Rect rect = this.f3228h;
        return iMax2 + rect.left + rect.right;
    }

    /* JADX INFO: renamed from: b */
    void m3339b() {
        this.f3226f.mo3351m(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0885d c0885d = this.f3221a;
        if (c0885d != null) {
            c0885d.m3754b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0823g interfaceC0823g = this.f3226f;
        return interfaceC0823g != null ? interfaceC0823g.mo3344d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0823g interfaceC0823g = this.f3226f;
        return interfaceC0823g != null ? interfaceC0823g.mo3352n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f3226f != null ? this.f3227g : super.getDropDownWidth();
    }

    final InterfaceC0823g getInternalPopup() {
        return this.f3226f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0823g interfaceC0823g = this.f3226f;
        return interfaceC0823g != null ? interfaceC0823g.mo3345f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f3222b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0823g interfaceC0823g = this.f3226f;
        return interfaceC0823g != null ? interfaceC0823g.mo3353o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0885d c0885d = this.f3221a;
        if (c0885d != null) {
            return c0885d.m3755c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0885d c0885d = this.f3221a;
        if (c0885d != null) {
            return c0885d.m3756d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0823g interfaceC0823g = this.f3226f;
        if (interfaceC0823g == null || !interfaceC0823g.mo3343c()) {
            return;
        }
        this.f3226f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        if (this.f3226f == null || View.MeasureSpec.getMode(i3) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m3338a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i3)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f3229d || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0818b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        InterfaceC0823g interfaceC0823g = this.f3226f;
        savedState.f3229d = interfaceC0823g != null && interfaceC0823g.mo3343c();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC0839P abstractViewOnTouchListenerC0839P = this.f3223c;
        if (abstractViewOnTouchListenerC0839P == null || !abstractViewOnTouchListenerC0839P.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        InterfaceC0823g interfaceC0823g = this.f3226f;
        if (interfaceC0823g == null) {
            return super.performClick();
        }
        if (interfaceC0823g.mo3343c()) {
            return true;
        }
        m3339b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0885d c0885d = this.f3221a;
        if (c0885d != null) {
            c0885d.m3758f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0885d c0885d = this.f3221a;
        if (c0885d != null) {
            c0885d.m3759g(i3);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i3) {
        InterfaceC0823g interfaceC0823g = this.f3226f;
        if (interfaceC0823g == null) {
            super.setDropDownHorizontalOffset(i3);
        } else {
            interfaceC0823g.mo3349k(i3);
            this.f3226f.mo3350l(i3);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i3) {
        InterfaceC0823g interfaceC0823g = this.f3226f;
        if (interfaceC0823g != null) {
            interfaceC0823g.mo3348j(i3);
        } else {
            super.setDropDownVerticalOffset(i3);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i3) {
        if (this.f3226f != null) {
            this.f3227g = i3;
        } else {
            super.setDropDownWidth(i3);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0823g interfaceC0823g = this.f3226f;
        if (interfaceC0823g != null) {
            interfaceC0823g.mo3347i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i3) {
        setPopupBackgroundDrawable(AbstractC1832a.m9609b(getPopupContext(), i3));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0823g interfaceC0823g = this.f3226f;
        if (interfaceC0823g != null) {
            interfaceC0823g.mo3346h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0885d c0885d = this.f3221a;
        if (c0885d != null) {
            c0885d.m3761i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0885d c0885d = this.f3221a;
        if (c0885d != null) {
            c0885d.m3762j(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f3225e) {
            this.f3224d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f3226f != null) {
            Context context = this.f3222b;
            if (context == null) {
                context = getContext();
            }
            this.f3226f.mo3354p(new C0821e(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i3, int i4) {
        this(context, attributeSet, i3, i4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.AppCompatSpinner] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppCompatSpinner(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
