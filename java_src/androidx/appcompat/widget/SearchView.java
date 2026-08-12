package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.InterfaceC0773c;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.actions.SearchIntents;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p027J.AbstractC0268W;
import p036M.AbstractC0389a;
import p091d.AbstractC1760a;
import p091d.AbstractC1763d;
import p091d.AbstractC1765f;
import p091d.AbstractC1766g;
import p091d.AbstractC1767h;
import p091d.AbstractC1769j;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends AbstractC0840Q implements InterfaceC0773c {

    /* JADX INFO: renamed from: o0 */
    static final C0858o f3385o0;

    /* JADX INFO: renamed from: A */
    private Rect f3386A;

    /* JADX INFO: renamed from: B */
    private int[] f3387B;

    /* JADX INFO: renamed from: C */
    private int[] f3388C;

    /* JADX INFO: renamed from: D */
    private final ImageView f3389D;

    /* JADX INFO: renamed from: E */
    private final Drawable f3390E;

    /* JADX INFO: renamed from: F */
    private final int f3391F;

    /* JADX INFO: renamed from: G */
    private final int f3392G;

    /* JADX INFO: renamed from: H */
    private final Intent f3393H;

    /* JADX INFO: renamed from: I */
    private final Intent f3394I;

    /* JADX INFO: renamed from: J */
    private final CharSequence f3395J;

    /* JADX INFO: renamed from: K */
    private InterfaceC0856m f3396K;

    /* JADX INFO: renamed from: L */
    View.OnFocusChangeListener f3397L;

    /* JADX INFO: renamed from: M */
    private View.OnClickListener f3398M;

    /* JADX INFO: renamed from: N */
    private boolean f3399N;

    /* JADX INFO: renamed from: O */
    private boolean f3400O;

    /* JADX INFO: renamed from: P */
    AbstractC0389a f3401P;

    /* JADX INFO: renamed from: Q */
    private boolean f3402Q;

    /* JADX INFO: renamed from: R */
    private CharSequence f3403R;

    /* JADX INFO: renamed from: S */
    private boolean f3404S;

    /* JADX INFO: renamed from: T */
    private boolean f3405T;

    /* JADX INFO: renamed from: U */
    private int f3406U;

    /* JADX INFO: renamed from: V */
    private boolean f3407V;

    /* JADX INFO: renamed from: W */
    private CharSequence f3408W;

    /* JADX INFO: renamed from: a0 */
    private CharSequence f3409a0;

    /* JADX INFO: renamed from: b0 */
    private boolean f3410b0;

    /* JADX INFO: renamed from: c0 */
    private int f3411c0;

    /* JADX INFO: renamed from: d0 */
    SearchableInfo f3412d0;

    /* JADX INFO: renamed from: e0 */
    private Bundle f3413e0;

    /* JADX INFO: renamed from: f0 */
    private final Runnable f3414f0;

    /* JADX INFO: renamed from: g0 */
    private Runnable f3415g0;

    /* JADX INFO: renamed from: h0 */
    private final WeakHashMap f3416h0;

    /* JADX INFO: renamed from: i0 */
    private final View.OnClickListener f3417i0;

    /* JADX INFO: renamed from: j0 */
    View.OnKeyListener f3418j0;

    /* JADX INFO: renamed from: k0 */
    private final TextView.OnEditorActionListener f3419k0;

    /* JADX INFO: renamed from: l0 */
    private final AdapterView.OnItemClickListener f3420l0;

    /* JADX INFO: renamed from: m0 */
    private final AdapterView.OnItemSelectedListener f3421m0;

    /* JADX INFO: renamed from: n0 */
    private TextWatcher f3422n0;

    /* JADX INFO: renamed from: p */
    final SearchAutoComplete f3423p;

    /* JADX INFO: renamed from: q */
    private final View f3424q;

    /* JADX INFO: renamed from: r */
    private final View f3425r;

    /* JADX INFO: renamed from: s */
    private final View f3426s;

    /* JADX INFO: renamed from: t */
    final ImageView f3427t;

    /* JADX INFO: renamed from: u */
    final ImageView f3428u;

    /* JADX INFO: renamed from: v */
    final ImageView f3429v;

    /* JADX INFO: renamed from: w */
    final ImageView f3430w;

    /* JADX INFO: renamed from: x */
    private final View f3431x;

    /* JADX INFO: renamed from: y */
    private C0859p f3432y;

    /* JADX INFO: renamed from: z */
    private Rect f3433z;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0842a();

        /* JADX INFO: renamed from: f */
        boolean f3434f;

        /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$SavedState$a */
        class C0842a implements Parcelable.ClassLoaderCreator {
            C0842a() {
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

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f3434f + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            super.writeToParcel(parcel, i3);
            parcel.writeValue(Boolean.valueOf(this.f3434f));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3434f = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    public static class SearchAutoComplete extends C0883c {

        /* JADX INFO: renamed from: e */
        private int f3435e;

        /* JADX INFO: renamed from: f */
        private SearchView f3436f;

        /* JADX INFO: renamed from: g */
        private boolean f3437g;

        /* JADX INFO: renamed from: h */
        final Runnable f3438h;

        /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        class RunnableC0843a implements Runnable {
            RunnableC0843a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.m3586d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, AbstractC1760a.f8712m);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i3 = configuration.screenWidthDp;
            int i4 = configuration.screenHeightDp;
            if (i3 >= 960 && i4 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i3 < 600) {
                return (i3 < 640 || i4 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* JADX INFO: renamed from: b */
        void m3584b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f3385o0.m3594c(this);
                return;
            }
            C0854k.m3588b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        /* JADX INFO: renamed from: c */
        boolean m3585c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* JADX INFO: renamed from: d */
        void m3586d() {
            if (this.f3437g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f3437g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f3435e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.C0883c, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f3437g) {
                removeCallbacks(this.f3438h);
                post(this.f3438h);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z2, int i3, Rect rect) {
            super.onFocusChanged(z2, i3, rect);
            this.f3436f.m3577Z();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i3, KeyEvent keyEvent) {
            if (i3 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f3436f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i3, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z2) {
            super.onWindowFocusChanged(z2);
            if (z2 && this.f3436f.hasFocus() && getVisibility() == 0) {
                this.f3437g = true;
                if (SearchView.m3552M(getContext())) {
                    m3584b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z2) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z2) {
                this.f3437g = false;
                removeCallbacks(this.f3438h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f3437g = true;
                    return;
                }
                this.f3437g = false;
                removeCallbacks(this.f3438h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f3436f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i3) {
            super.setThreshold(i3);
            this.f3435e = i3;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i3) {
            super(context, attributeSet, i3);
            this.f3438h = new RunnableC0843a();
            this.f3435e = getThreshold();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$a */
    class C0844a implements TextWatcher {
        C0844a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            SearchView.this.m3576Y(charSequence);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$b */
    class RunnableC0845b implements Runnable {
        RunnableC0845b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m3580f0();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$c */
    class RunnableC0846c implements Runnable {
        RunnableC0846c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0389a abstractC0389a = SearchView.this.f3401P;
            if (abstractC0389a instanceof ViewOnClickListenerC0878Z) {
                abstractC0389a.mo1379a(null);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$d */
    class ViewOnFocusChangeListenerC0847d implements View.OnFocusChangeListener {
        ViewOnFocusChangeListenerC0847d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z2) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f3397L;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$e */
    class ViewOnLayoutChangeListenerC0848e implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC0848e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            SearchView.this.m3565B();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$f */
    class ViewOnClickListenerC0849f implements View.OnClickListener {
        ViewOnClickListenerC0849f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f3427t) {
                searchView.m3573V();
                return;
            }
            if (view == searchView.f3429v) {
                searchView.m3569R();
                return;
            }
            if (view == searchView.f3428u) {
                searchView.m3574W();
            } else if (view == searchView.f3430w) {
                searchView.m3578a0();
            } else if (view == searchView.f3423p) {
                searchView.m3566H();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$g */
    class ViewOnKeyListenerC0850g implements View.OnKeyListener {
        ViewOnKeyListenerC0850g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i3, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f3412d0 == null) {
                return false;
            }
            if (searchView.f3423p.isPopupShowing() && SearchView.this.f3423p.getListSelection() != -1) {
                return SearchView.this.m3575X(view, i3, keyEvent);
            }
            if (SearchView.this.f3423p.m3585c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i3 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.m3568P(0, null, searchView2.f3423p.getText().toString());
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$h */
    class C0851h implements TextView.OnEditorActionListener {
        C0851h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
            SearchView.this.m3574W();
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$i */
    class C0852i implements AdapterView.OnItemClickListener {
        C0852i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
            SearchView.this.m3570S(i3, 0, null);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$j */
    class C0853j implements AdapterView.OnItemSelectedListener {
        C0853j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i3, long j3) {
            SearchView.this.m3571T(i3);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$k */
    static class C0854k {
        /* JADX INFO: renamed from: a */
        static void m3587a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        /* JADX INFO: renamed from: b */
        static void m3588b(SearchAutoComplete searchAutoComplete, int i3) {
            searchAutoComplete.setInputMethodMode(i3);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$l */
    public interface InterfaceC0855l {
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$m */
    public interface InterfaceC0856m {
        /* JADX INFO: renamed from: a */
        boolean mo3589a(String str);

        /* JADX INFO: renamed from: b */
        boolean mo3590b(String str);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$n */
    public interface InterfaceC0857n {
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$o */
    private static class C0858o {

        /* JADX INFO: renamed from: a */
        private Method f3450a;

        /* JADX INFO: renamed from: b */
        private Method f3451b;

        /* JADX INFO: renamed from: c */
        private Method f3452c;

        C0858o() {
            this.f3450a = null;
            this.f3451b = null;
            this.f3452c = null;
            m3591d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f3450a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f3451b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f3452c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* JADX INFO: renamed from: d */
        private static void m3591d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* JADX INFO: renamed from: a */
        void m3592a(AutoCompleteTextView autoCompleteTextView) {
            m3591d();
            Method method = this.f3451b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        /* JADX INFO: renamed from: b */
        void m3593b(AutoCompleteTextView autoCompleteTextView) {
            m3591d();
            Method method = this.f3450a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        /* JADX INFO: renamed from: c */
        void m3594c(AutoCompleteTextView autoCompleteTextView) {
            m3591d();
            Method method = this.f3452c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$p */
    private static class C0859p extends TouchDelegate {

        /* JADX INFO: renamed from: a */
        private final View f3453a;

        /* JADX INFO: renamed from: b */
        private final Rect f3454b;

        /* JADX INFO: renamed from: c */
        private final Rect f3455c;

        /* JADX INFO: renamed from: d */
        private final Rect f3456d;

        /* JADX INFO: renamed from: e */
        private final int f3457e;

        /* JADX INFO: renamed from: f */
        private boolean f3458f;

        public C0859p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f3457e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f3454b = new Rect();
            this.f3456d = new Rect();
            this.f3455c = new Rect();
            m3595a(rect, rect2);
            this.f3453a = view;
        }

        /* JADX INFO: renamed from: a */
        public void m3595a(Rect rect, Rect rect2) {
            this.f3454b.set(rect);
            this.f3456d.set(rect);
            Rect rect3 = this.f3456d;
            int i3 = this.f3457e;
            rect3.inset(-i3, -i3);
            this.f3455c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z2;
            boolean z3;
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z4 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z3 = this.f3458f;
                    if (z3 && !this.f3456d.contains(x2, y2)) {
                        z4 = z3;
                        z2 = false;
                    }
                } else {
                    if (action == 3) {
                        z3 = this.f3458f;
                        this.f3458f = false;
                    }
                    z2 = true;
                    z4 = false;
                }
                z4 = z3;
                z2 = true;
            } else if (this.f3454b.contains(x2, y2)) {
                this.f3458f = true;
                z2 = true;
            } else {
                z2 = true;
                z4 = false;
            }
            if (!z4) {
                return false;
            }
            if (!z2 || this.f3455c.contains(x2, y2)) {
                Rect rect = this.f3455c;
                motionEvent.setLocation(x2 - rect.left, y2 - rect.top);
            } else {
                motionEvent.setLocation(this.f3453a.getWidth() / 2, this.f3453a.getHeight() / 2);
            }
            return this.f3453a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f3385o0 = Build.VERSION.SDK_INT < 29 ? new C0858o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: C */
    private Intent m3544C(String str, Uri uri, String str2, String str3, int i3, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f3409a0);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f3413e0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i3 != 0) {
            intent.putExtra("action_key", i3);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f3412d0.getSearchActivity());
        return intent;
    }

    /* JADX INFO: renamed from: D */
    private Intent m3545D(Cursor cursor, int i3, String str) {
        int position;
        String strM3723o;
        try {
            String strM3723o2 = ViewOnClickListenerC0878Z.m3723o(cursor, "suggest_intent_action");
            if (strM3723o2 == null) {
                strM3723o2 = this.f3412d0.getSuggestIntentAction();
            }
            if (strM3723o2 == null) {
                strM3723o2 = "android.intent.action.SEARCH";
            }
            String str2 = strM3723o2;
            String strM3723o3 = ViewOnClickListenerC0878Z.m3723o(cursor, "suggest_intent_data");
            if (strM3723o3 == null) {
                strM3723o3 = this.f3412d0.getSuggestIntentData();
            }
            if (strM3723o3 != null && (strM3723o = ViewOnClickListenerC0878Z.m3723o(cursor, "suggest_intent_data_id")) != null) {
                strM3723o3 = strM3723o3 + "/" + Uri.encode(strM3723o);
            }
            return m3544C(str2, strM3723o3 == null ? null : Uri.parse(strM3723o3), ViewOnClickListenerC0878Z.m3723o(cursor, "suggest_intent_extra_data"), ViewOnClickListenerC0878Z.m3723o(cursor, "suggest_intent_query"), i3, str);
        } catch (RuntimeException e3) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: E */
    private Intent m3546E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3413e0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* JADX INFO: renamed from: F */
    private Intent m3547F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* JADX INFO: renamed from: G */
    private void m3548G() {
        this.f3423p.dismissDropDown();
    }

    /* JADX INFO: renamed from: I */
    private void m3549I(View view, Rect rect) {
        view.getLocationInWindow(this.f3387B);
        getLocationInWindow(this.f3388C);
        int[] iArr = this.f3387B;
        int i3 = iArr[1];
        int[] iArr2 = this.f3388C;
        int i4 = i3 - iArr2[1];
        int i5 = iArr[0] - iArr2[0];
        rect.set(i5, i4, view.getWidth() + i5, view.getHeight() + i4);
    }

    /* JADX INFO: renamed from: J */
    private CharSequence m3550J(CharSequence charSequence) {
        if (!this.f3399N || this.f3390E == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f3423p.getTextSize()) * 1.25d);
        this.f3390E.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f3390E), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: K */
    private boolean m3551K() {
        SearchableInfo searchableInfo = this.f3412d0;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            Intent intent = this.f3412d0.getVoiceSearchLaunchWebSearch() ? this.f3393H : this.f3412d0.getVoiceSearchLaunchRecognizer() ? this.f3394I : null;
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: M */
    static boolean m3552M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* JADX INFO: renamed from: N */
    private boolean m3553N() {
        return (this.f3402Q || this.f3407V) && !m3567L();
    }

    /* JADX INFO: renamed from: O */
    private void m3554O(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e3) {
            Log.e("SearchView", "Failed launch activity: " + intent, e3);
        }
    }

    /* JADX INFO: renamed from: Q */
    private boolean m3555Q(int i3, int i4, String str) {
        Cursor cursorMo1380b = this.f3401P.mo1380b();
        if (cursorMo1380b == null || !cursorMo1380b.moveToPosition(i3)) {
            return false;
        }
        m3554O(m3545D(cursorMo1380b, i4, str));
        return true;
    }

    /* JADX INFO: renamed from: b0 */
    private void m3556b0() {
        post(this.f3414f0);
    }

    /* JADX INFO: renamed from: c0 */
    private void m3557c0(int i3) {
        Editable text = this.f3423p.getText();
        Cursor cursorMo1380b = this.f3401P.mo1380b();
        if (cursorMo1380b == null) {
            return;
        }
        if (!cursorMo1380b.moveToPosition(i3)) {
            setQuery(text);
            return;
        }
        CharSequence charSequenceMo1381c = this.f3401P.mo1381c(cursorMo1380b);
        if (charSequenceMo1381c != null) {
            setQuery(charSequenceMo1381c);
        } else {
            setQuery(text);
        }
    }

    /* JADX INFO: renamed from: e0 */
    private void m3558e0() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f3423p.getText());
        this.f3429v.setVisibility(!zIsEmpty || (this.f3399N && !this.f3410b0) ? 0 : 8);
        Drawable drawable = this.f3429v.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* JADX INFO: renamed from: g0 */
    private void m3559g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f3423p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m3550J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(AbstractC1763d.f8739e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(AbstractC1763d.f8740f);
    }

    /* JADX INFO: renamed from: h0 */
    private void m3560h0() {
        this.f3423p.setThreshold(this.f3412d0.getSuggestThreshold());
        this.f3423p.setImeOptions(this.f3412d0.getImeOptions());
        int inputType = this.f3412d0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f3412d0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f3423p.setInputType(inputType);
        AbstractC0389a abstractC0389a = this.f3401P;
        if (abstractC0389a != null) {
            abstractC0389a.mo1379a(null);
        }
        if (this.f3412d0.getSuggestAuthority() != null) {
            ViewOnClickListenerC0878Z viewOnClickListenerC0878Z = new ViewOnClickListenerC0878Z(getContext(), this, this.f3412d0, this.f3416h0);
            this.f3401P = viewOnClickListenerC0878Z;
            this.f3423p.setAdapter(viewOnClickListenerC0878Z);
            ((ViewOnClickListenerC0878Z) this.f3401P).m3734x(this.f3404S ? 2 : 1);
        }
    }

    /* JADX INFO: renamed from: i0 */
    private void m3561i0() {
        this.f3426s.setVisibility((m3553N() && (this.f3428u.getVisibility() == 0 || this.f3430w.getVisibility() == 0)) ? 0 : 8);
    }

    /* JADX INFO: renamed from: j0 */
    private void m3562j0(boolean z2) {
        this.f3428u.setVisibility((this.f3402Q && m3553N() && hasFocus() && (z2 || !this.f3407V)) ? 0 : 8);
    }

    /* JADX INFO: renamed from: k0 */
    private void m3563k0(boolean z2) {
        this.f3400O = z2;
        int i3 = 8;
        int i4 = z2 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f3423p.getText());
        this.f3427t.setVisibility(i4);
        m3562j0(!zIsEmpty);
        this.f3424q.setVisibility(z2 ? 8 : 0);
        if (this.f3389D.getDrawable() != null && !this.f3399N) {
            i3 = 0;
        }
        this.f3389D.setVisibility(i3);
        m3558e0();
        m3564l0(zIsEmpty);
        m3561i0();
    }

    /* JADX INFO: renamed from: l0 */
    private void m3564l0(boolean z2) {
        int i3 = 8;
        if (this.f3407V && !m3567L() && z2) {
            this.f3428u.setVisibility(8);
            i3 = 0;
        }
        this.f3430w.setVisibility(i3);
    }

    private void setQuery(CharSequence charSequence) {
        this.f3423p.setText(charSequence);
        this.f3423p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* JADX INFO: renamed from: B */
    void m3565B() {
        if (this.f3431x.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f3425r.getPaddingLeft();
            Rect rect = new Rect();
            boolean zM3878b = AbstractC0910p0.m3878b(this);
            int dimensionPixelSize = this.f3399N ? resources.getDimensionPixelSize(AbstractC1763d.f8737c) + resources.getDimensionPixelSize(AbstractC1763d.f8738d) : 0;
            this.f3423p.getDropDownBackground().getPadding(rect);
            this.f3423p.setDropDownHorizontalOffset(zM3878b ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f3423p.setDropDownWidth((((this.f3431x.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* JADX INFO: renamed from: H */
    void m3566H() {
        if (Build.VERSION.SDK_INT >= 29) {
            C0854k.m3587a(this.f3423p);
            return;
        }
        C0858o c0858o = f3385o0;
        c0858o.m3593b(this.f3423p);
        c0858o.m3592a(this.f3423p);
    }

    /* JADX INFO: renamed from: L */
    public boolean m3567L() {
        return this.f3400O;
    }

    /* JADX INFO: renamed from: P */
    void m3568P(int i3, String str, String str2) {
        getContext().startActivity(m3544C("android.intent.action.SEARCH", null, null, str2, i3, str));
    }

    /* JADX INFO: renamed from: R */
    void m3569R() {
        if (!TextUtils.isEmpty(this.f3423p.getText())) {
            this.f3423p.setText("");
            this.f3423p.requestFocus();
            this.f3423p.setImeVisibility(true);
        } else if (this.f3399N) {
            clearFocus();
            m3563k0(true);
        }
    }

    /* JADX INFO: renamed from: S */
    boolean m3570S(int i3, int i4, String str) {
        m3555Q(i3, 0, null);
        this.f3423p.setImeVisibility(false);
        m3548G();
        return true;
    }

    /* JADX INFO: renamed from: T */
    boolean m3571T(int i3) {
        m3557c0(i3);
        return true;
    }

    /* JADX INFO: renamed from: U */
    protected void m3572U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* JADX INFO: renamed from: V */
    void m3573V() {
        m3563k0(false);
        this.f3423p.requestFocus();
        this.f3423p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f3398M;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* JADX INFO: renamed from: W */
    void m3574W() {
        Editable text = this.f3423p.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        InterfaceC0856m interfaceC0856m = this.f3396K;
        if (interfaceC0856m == null || !interfaceC0856m.mo3590b(text.toString())) {
            if (this.f3412d0 != null) {
                m3568P(0, null, text.toString());
            }
            this.f3423p.setImeVisibility(false);
            m3548G();
        }
    }

    /* JADX INFO: renamed from: X */
    boolean m3575X(View view, int i3, KeyEvent keyEvent) {
        if (this.f3412d0 != null && this.f3401P != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i3 == 66 || i3 == 84 || i3 == 61) {
                return m3570S(this.f3423p.getListSelection(), 0, null);
            }
            if (i3 == 21 || i3 == 22) {
                this.f3423p.setSelection(i3 == 21 ? 0 : this.f3423p.length());
                this.f3423p.setListSelection(0);
                this.f3423p.clearListSelection();
                this.f3423p.m3584b();
                return true;
            }
            if (i3 == 19) {
                this.f3423p.getListSelection();
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Y */
    void m3576Y(CharSequence charSequence) {
        Editable text = this.f3423p.getText();
        this.f3409a0 = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        m3562j0(!zIsEmpty);
        m3564l0(zIsEmpty);
        m3558e0();
        m3561i0();
        if (this.f3396K != null && !TextUtils.equals(charSequence, this.f3408W)) {
            this.f3396K.mo3589a(charSequence.toString());
        }
        this.f3408W = charSequence.toString();
    }

    /* JADX INFO: renamed from: Z */
    void m3577Z() {
        m3563k0(m3567L());
        m3556b0();
        if (this.f3423p.hasFocus()) {
            m3566H();
        }
    }

    /* JADX INFO: renamed from: a0 */
    void m3578a0() {
        SearchableInfo searchableInfo = this.f3412d0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(m3547F(this.f3393H, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(m3546E(this.f3394I, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    @Override // androidx.appcompat.view.InterfaceC0773c
    /* JADX INFO: renamed from: c */
    public void mo3007c() {
        if (this.f3410b0) {
            return;
        }
        this.f3410b0 = true;
        int imeOptions = this.f3423p.getImeOptions();
        this.f3411c0 = imeOptions;
        this.f3423p.setImeOptions(imeOptions | 33554432);
        this.f3423p.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f3405T = true;
        super.clearFocus();
        this.f3423p.clearFocus();
        this.f3423p.setImeVisibility(false);
        this.f3405T = false;
    }

    /* JADX INFO: renamed from: d0 */
    public void m3579d0(CharSequence charSequence, boolean z2) {
        this.f3423p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f3423p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f3409a0 = charSequence;
        }
        if (!z2 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        m3574W();
    }

    @Override // androidx.appcompat.view.InterfaceC0773c
    /* JADX INFO: renamed from: f */
    public void mo3008f() {
        m3579d0("", false);
        clearFocus();
        m3563k0(true);
        this.f3423p.setImeOptions(this.f3411c0);
        this.f3410b0 = false;
    }

    /* JADX INFO: renamed from: f0 */
    void m3580f0() {
        int[] iArr = this.f3423p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f3425r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f3426s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f3423p.getImeOptions();
    }

    public int getInputType() {
        return this.f3423p.getInputType();
    }

    public int getMaxWidth() {
        return this.f3406U;
    }

    public CharSequence getQuery() {
        return this.f3423p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f3403R;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f3412d0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f3395J : getContext().getText(this.f3412d0.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.f3392G;
    }

    int getSuggestionRowLayout() {
        return this.f3391F;
    }

    public AbstractC0389a getSuggestionsAdapter() {
        return this.f3401P;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f3414f0);
        post(this.f3415g0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.AbstractC0840Q, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        super.onLayout(z2, i3, i4, i5, i6);
        if (z2) {
            m3549I(this.f3423p, this.f3433z);
            Rect rect = this.f3386A;
            Rect rect2 = this.f3433z;
            rect.set(rect2.left, 0, rect2.right, i6 - i4);
            C0859p c0859p = this.f3432y;
            if (c0859p != null) {
                c0859p.m3595a(this.f3386A, this.f3433z);
                return;
            }
            C0859p c0859p2 = new C0859p(this.f3386A, this.f3433z, this.f3423p);
            this.f3432y = c0859p2;
            setTouchDelegate(c0859p2);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0840Q, android.view.View
    protected void onMeasure(int i3, int i4) {
        int i5;
        if (m3567L()) {
            super.onMeasure(i3, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            int i6 = this.f3406U;
            size = i6 > 0 ? Math.min(i6, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f3406U;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i5 = this.f3406U) > 0) {
            size = Math.min(i5, size);
        }
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m4418a());
        m3563k0(savedState.f3434f);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3434f = m3567L();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        m3556b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i3, Rect rect) {
        if (this.f3405T || !isFocusable()) {
            return false;
        }
        if (m3567L()) {
            return super.requestFocus(i3, rect);
        }
        boolean zRequestFocus = this.f3423p.requestFocus(i3, rect);
        if (zRequestFocus) {
            m3563k0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f3413e0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            m3569R();
        } else {
            m3573V();
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.f3399N == z2) {
            return;
        }
        this.f3399N = z2;
        m3563k0(z2);
        m3559g0();
    }

    public void setImeOptions(int i3) {
        this.f3423p.setImeOptions(i3);
    }

    public void setInputType(int i3) {
        this.f3423p.setInputType(i3);
    }

    public void setMaxWidth(int i3) {
        this.f3406U = i3;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC0855l interfaceC0855l) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f3397L = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC0856m interfaceC0856m) {
        this.f3396K = interfaceC0856m;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f3398M = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC0857n interfaceC0857n) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f3403R = charSequence;
        m3559g0();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.f3404S = z2;
        AbstractC0389a abstractC0389a = this.f3401P;
        if (abstractC0389a instanceof ViewOnClickListenerC0878Z) {
            ((ViewOnClickListenerC0878Z) abstractC0389a).m3734x(z2 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f3412d0 = searchableInfo;
        if (searchableInfo != null) {
            m3560h0();
            m3559g0();
        }
        boolean zM3551K = m3551K();
        this.f3407V = zM3551K;
        if (zM3551K) {
            this.f3423p.setPrivateImeOptions("nm");
        }
        m3563k0(m3567L());
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.f3402Q = z2;
        m3563k0(m3567L());
    }

    public void setSuggestionsAdapter(AbstractC0389a abstractC0389a) {
        this.f3401P = abstractC0389a;
        this.f3423p.setAdapter(abstractC0389a);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1760a.f8692J);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f3433z = new Rect();
        this.f3386A = new Rect();
        this.f3387B = new int[2];
        this.f3388C = new int[2];
        this.f3414f0 = new RunnableC0845b();
        this.f3415g0 = new RunnableC0846c();
        this.f3416h0 = new WeakHashMap();
        ViewOnClickListenerC0849f viewOnClickListenerC0849f = new ViewOnClickListenerC0849f();
        this.f3417i0 = viewOnClickListenerC0849f;
        this.f3418j0 = new ViewOnKeyListenerC0850g();
        C0851h c0851h = new C0851h();
        this.f3419k0 = c0851h;
        C0852i c0852i = new C0852i();
        this.f3420l0 = c0852i;
        C0853j c0853j = new C0853j();
        this.f3421m0 = c0853j;
        this.f3422n0 = new C0844a();
        int[] iArr = AbstractC1769j.f9080n2;
        C0888e0 c0888e0M3765v = C0888e0.m3765v(context, attributeSet, iArr, i3, 0);
        AbstractC0268W.m771g0(this, context, iArr, attributeSet, c0888e0M3765v.m3783r(), i3, 0);
        LayoutInflater.from(context).inflate(c0888e0M3765v.m3779n(AbstractC1769j.f9130x2, AbstractC1766g.f8852r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(AbstractC1765f.f8796D);
        this.f3423p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f3424q = findViewById(AbstractC1765f.f8834z);
        View viewFindViewById = findViewById(AbstractC1765f.f8795C);
        this.f3425r = viewFindViewById;
        View viewFindViewById2 = findViewById(AbstractC1765f.f8802J);
        this.f3426s = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(AbstractC1765f.f8832x);
        this.f3427t = imageView;
        ImageView imageView2 = (ImageView) findViewById(AbstractC1765f.f8793A);
        this.f3428u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(AbstractC1765f.f8833y);
        this.f3429v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(AbstractC1765f.f8797E);
        this.f3430w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(AbstractC1765f.f8794B);
        this.f3389D = imageView5;
        AbstractC0268W.m781l0(viewFindViewById, c0888e0M3765v.m3772g(AbstractC1769j.f9135y2));
        AbstractC0268W.m781l0(viewFindViewById2, c0888e0M3765v.m3772g(AbstractC1769j.f8889C2));
        int i4 = AbstractC1769j.f8884B2;
        imageView.setImageDrawable(c0888e0M3765v.m3772g(i4));
        imageView2.setImageDrawable(c0888e0M3765v.m3772g(AbstractC1769j.f9120v2));
        imageView3.setImageDrawable(c0888e0M3765v.m3772g(AbstractC1769j.f9105s2));
        imageView4.setImageDrawable(c0888e0M3765v.m3772g(AbstractC1769j.f8899E2));
        imageView5.setImageDrawable(c0888e0M3765v.m3772g(i4));
        this.f3390E = c0888e0M3765v.m3772g(AbstractC1769j.f8879A2);
        AbstractC0898j0.m3829a(imageView, getResources().getString(AbstractC1767h.f8868n));
        this.f3391F = c0888e0M3765v.m3779n(AbstractC1769j.f8894D2, AbstractC1766g.f8851q);
        this.f3392G = c0888e0M3765v.m3779n(AbstractC1769j.f9110t2, 0);
        imageView.setOnClickListener(viewOnClickListenerC0849f);
        imageView3.setOnClickListener(viewOnClickListenerC0849f);
        imageView2.setOnClickListener(viewOnClickListenerC0849f);
        imageView4.setOnClickListener(viewOnClickListenerC0849f);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC0849f);
        searchAutoComplete.addTextChangedListener(this.f3422n0);
        searchAutoComplete.setOnEditorActionListener(c0851h);
        searchAutoComplete.setOnItemClickListener(c0852i);
        searchAutoComplete.setOnItemSelectedListener(c0853j);
        searchAutoComplete.setOnKeyListener(this.f3418j0);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0847d());
        setIconifiedByDefault(c0888e0M3765v.m3766a(AbstractC1769j.f9125w2, true));
        int iM3771f = c0888e0M3765v.m3771f(AbstractC1769j.f9090p2, -1);
        if (iM3771f != -1) {
            setMaxWidth(iM3771f);
        }
        this.f3395J = c0888e0M3765v.m3781p(AbstractC1769j.f9115u2);
        this.f3403R = c0888e0M3765v.m3781p(AbstractC1769j.f9140z2);
        int iM3776k = c0888e0M3765v.m3776k(AbstractC1769j.f9100r2, -1);
        if (iM3776k != -1) {
            setImeOptions(iM3776k);
        }
        int iM3776k2 = c0888e0M3765v.m3776k(AbstractC1769j.f9095q2, -1);
        if (iM3776k2 != -1) {
            setInputType(iM3776k2);
        }
        setFocusable(c0888e0M3765v.m3766a(AbstractC1769j.f9085o2, true));
        c0888e0M3765v.m3786x();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f3393H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f3394I = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f3431x = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0848e());
        }
        m3563k0(this.f3399N);
        m3559g0();
    }
}
