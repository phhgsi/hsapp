package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0740E;
import androidx.fragment.app.AbstractC1098z;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1075c;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.AbstractC1533d;
import com.google.android.material.internal.AbstractC1549t;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0142c;
import p016F0.AbstractC0143d;
import p016F0.AbstractC0144e;
import p016F0.AbstractC0146g;
import p016F0.AbstractC0148i;
import p016F0.AbstractC0149j;
import p016F0.AbstractC0150k;
import p027J.AbstractC0268W;
import p027J.C0318w0;
import p027J.InterfaceC0235F;
import p046P0.ViewOnTouchListenerC0467a;
import p067W0.AbstractC0556b;
import p076Z0.C0637h;
import p095e.AbstractC1832a;
import p167z.C2572e;

/* JADX INFO: renamed from: com.google.android.material.datepicker.h */
/* JADX INFO: loaded from: classes.dex */
public class C1501h<S> extends DialogInterfaceOnCancelListenerC1075c {

    /* JADX INFO: renamed from: C */
    static final Object f7539C = "CONFIRM_BUTTON_TAG";

    /* JADX INFO: renamed from: D */
    static final Object f7540D = "CANCEL_BUTTON_TAG";

    /* JADX INFO: renamed from: E */
    static final Object f7541E = "TOGGLE_BUTTON_TAG";

    /* JADX INFO: renamed from: A */
    private CharSequence f7542A;

    /* JADX INFO: renamed from: B */
    private CharSequence f7543B;

    /* JADX INFO: renamed from: a */
    private final LinkedHashSet f7544a = new LinkedHashSet();

    /* JADX INFO: renamed from: b */
    private final LinkedHashSet f7545b = new LinkedHashSet();

    /* JADX INFO: renamed from: c */
    private final LinkedHashSet f7546c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    private final LinkedHashSet f7547d = new LinkedHashSet();

    /* JADX INFO: renamed from: e */
    private int f7548e;

    /* JADX INFO: renamed from: f */
    private AbstractC1506m f7549f;

    /* JADX INFO: renamed from: g */
    private CalendarConstraints f7550g;

    /* JADX INFO: renamed from: h */
    private C1499f f7551h;

    /* JADX INFO: renamed from: i */
    private int f7552i;

    /* JADX INFO: renamed from: j */
    private CharSequence f7553j;

    /* JADX INFO: renamed from: k */
    private boolean f7554k;

    /* JADX INFO: renamed from: l */
    private int f7555l;

    /* JADX INFO: renamed from: m */
    private int f7556m;

    /* JADX INFO: renamed from: n */
    private CharSequence f7557n;

    /* JADX INFO: renamed from: o */
    private int f7558o;

    /* JADX INFO: renamed from: p */
    private CharSequence f7559p;

    /* JADX INFO: renamed from: q */
    private int f7560q;

    /* JADX INFO: renamed from: r */
    private CharSequence f7561r;

    /* JADX INFO: renamed from: s */
    private int f7562s;

    /* JADX INFO: renamed from: t */
    private CharSequence f7563t;

    /* JADX INFO: renamed from: u */
    private TextView f7564u;

    /* JADX INFO: renamed from: v */
    private TextView f7565v;

    /* JADX INFO: renamed from: w */
    private CheckableImageButton f7566w;

    /* JADX INFO: renamed from: x */
    private C0637h f7567x;

    /* JADX INFO: renamed from: y */
    private Button f7568y;

    /* JADX INFO: renamed from: z */
    private boolean f7569z;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.h$a */
    class a implements InterfaceC0235F {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f7570a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f7571b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f7572c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f7573d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f7574e;

        a(int i3, View view, int i4, int i5, int i6) {
            this.f7570a = i3;
            this.f7571b = view;
            this.f7572c = i4;
            this.f7573d = i5;
            this.f7574e = i6;
        }

        @Override // p027J.InterfaceC0235F
        /* JADX INFO: renamed from: a */
        public C0318w0 mo662a(View view, C0318w0 c0318w0) {
            C2572e c2572eM1082f = c0318w0.m1082f(C0318w0.p.m1142d());
            if (this.f7570a >= 0) {
                this.f7571b.getLayoutParams().height = this.f7570a + c2572eM1082f.f11900b;
                View view2 = this.f7571b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f7571b;
            view3.setPadding(this.f7572c + c2572eM1082f.f11899a, this.f7573d + c2572eM1082f.f11900b, this.f7574e + c2572eM1082f.f11901c, view3.getPaddingBottom());
            return c0318w0;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.h$b */
    class b extends AbstractC1505l {
        b() {
        }
    }

    /* JADX INFO: renamed from: A */
    private void m8177A() {
        this.f7564u.setText((this.f7555l == 1 && m8189v()) ? this.f7543B : this.f7542A);
    }

    /* JADX INFO: renamed from: B */
    private void m8178B(CheckableImageButton checkableImageButton) {
        this.f7566w.setContentDescription(this.f7555l == 1 ? checkableImageButton.getContext().getString(AbstractC0148i.f563w) : checkableImageButton.getContext().getString(AbstractC0148i.f565y));
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m8179k(C1501h c1501h, View view) {
        c1501h.m8182n();
        throw null;
    }

    /* JADX INFO: renamed from: l */
    private static Drawable m8180l(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, AbstractC1832a.m9609b(context, AbstractC0143d.f447c));
        stateListDrawable.addState(new int[0], AbstractC1832a.m9609b(context, AbstractC0143d.f448d));
        return stateListDrawable;
    }

    /* JADX INFO: renamed from: m */
    private void m8181m(Window window) {
        if (this.f7569z) {
            return;
        }
        View viewFindViewById = requireView().findViewById(AbstractC0144e.f487g);
        AbstractC1533d.m8376a(window, true, AbstractC1549t.m8499d(viewFindViewById), null);
        int paddingTop = viewFindViewById.getPaddingTop();
        AbstractC0268W.m795s0(viewFindViewById, new a(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingLeft(), paddingTop, viewFindViewById.getPaddingRight()));
        this.f7569z = true;
    }

    /* JADX INFO: renamed from: n */
    private DateSelector m8182n() {
        AbstractC0740E.m2693a(getArguments().getParcelable("DATE_SELECTOR_KEY"));
        return null;
    }

    /* JADX INFO: renamed from: o */
    private static CharSequence m8183o(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(String.valueOf(charSequence), "\n");
        return strArrSplit.length > 1 ? strArrSplit[0] : charSequence;
    }

    /* JADX INFO: renamed from: p */
    private String m8184p() {
        m8182n();
        requireContext();
        throw null;
    }

    /* JADX INFO: renamed from: r */
    private static int m8185r(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(AbstractC0142c.f402e0);
        int i3 = Month.m8125f().f7478g;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(AbstractC0142c.f406g0) * i3) + ((i3 - 1) * resources.getDimensionPixelOffset(AbstractC0142c.f412j0));
    }

    /* JADX INFO: renamed from: s */
    private int m8186s(Context context) {
        int i3 = this.f7548e;
        if (i3 != 0) {
            return i3;
        }
        m8182n();
        throw null;
    }

    /* JADX INFO: renamed from: t */
    private void m8187t(Context context) {
        this.f7566w.setTag(f7541E);
        this.f7566w.setImageDrawable(m8180l(context));
        this.f7566w.setChecked(this.f7555l != 0);
        AbstractC0268W.m775i0(this.f7566w, null);
        m8178B(this.f7566w);
        this.f7566w.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1501h.m8179k(this.f7538a, view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    static boolean m8188u(Context context) {
        return m8191x(context, R.attr.windowFullscreen);
    }

    /* JADX INFO: renamed from: v */
    private boolean m8189v() {
        return getResources().getConfiguration().orientation == 2;
    }

    /* JADX INFO: renamed from: w */
    static boolean m8190w(Context context) {
        return m8191x(context, AbstractC0140a.f320M);
    }

    /* JADX INFO: renamed from: x */
    static boolean m8191x(Context context, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC0556b.m2074f(context, AbstractC0140a.f351s, C1499f.class.getCanonicalName()), new int[]{i3});
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z2;
    }

    /* JADX INFO: renamed from: y */
    private void m8192y() {
        int iM8186s = m8186s(requireContext());
        m8182n();
        C1499f c1499fM8151A = C1499f.m8151A(null, iM8186s, this.f7550g, null);
        this.f7551h = c1499fM8151A;
        AbstractC1506m abstractC1506mM8195k = c1499fM8151A;
        if (this.f7555l == 1) {
            m8182n();
            abstractC1506mM8195k = C1502i.m8195k(null, iM8186s, this.f7550g);
        }
        this.f7549f = abstractC1506mM8195k;
        m8177A();
        m8194z(m8193q());
        AbstractC1098z abstractC1098zM4849p = getChildFragmentManager().m4849p();
        abstractC1098zM4849p.m5051m(AbstractC0144e.f504x, this.f7549f);
        abstractC1098zM4849p.mo4885h();
        this.f7549f.mo8169i(new b());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1075c, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f7546c.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1075c, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f7548e = bundle.getInt("OVERRIDE_THEME_RES_ID");
        AbstractC0740E.m2693a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f7550g = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        AbstractC0740E.m2693a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f7552i = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f7553j = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f7555l = bundle.getInt("INPUT_MODE_KEY");
        this.f7556m = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f7557n = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f7558o = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f7559p = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f7560q = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f7561r = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f7562s = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f7563t = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f7553j;
        if (text == null) {
            text = requireContext().getResources().getText(this.f7552i);
        }
        this.f7542A = text;
        this.f7543B = m8183o(text);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1075c
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), m8186s(requireContext()));
        Context context = dialog.getContext();
        this.f7554k = m8188u(context);
        int i3 = AbstractC0140a.f351s;
        int i4 = AbstractC0149j.f590w;
        this.f7567x = new C0637h(context, null, i3, i4);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0150k.f912i3, i3, i4);
        int color = typedArrayObtainStyledAttributes.getColor(AbstractC0150k.f922j3, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f7567x.m2266Q(context);
        this.f7567x.m2274c0(ColorStateList.valueOf(color));
        this.f7567x.m2273b0(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f7554k ? AbstractC0146g.f535z : AbstractC0146g.f534y, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f7554k) {
            viewInflate.findViewById(AbstractC0144e.f504x).setLayoutParams(new LinearLayout.LayoutParams(m8185r(context), -2));
        } else {
            viewInflate.findViewById(AbstractC0144e.f505y).setLayoutParams(new LinearLayout.LayoutParams(m8185r(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(AbstractC0144e.f457B);
        this.f7565v = textView;
        textView.setAccessibilityLiveRegion(1);
        this.f7566w = (CheckableImageButton) viewInflate.findViewById(AbstractC0144e.f458C);
        this.f7564u = (TextView) viewInflate.findViewById(AbstractC0144e.f459D);
        m8187t(context);
        this.f7568y = (Button) viewInflate.findViewById(AbstractC0144e.f484d);
        m8182n();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1075c, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f7547d.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1075c, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f7548e);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        CalendarConstraints.C1490b c1490b = new CalendarConstraints.C1490b(this.f7550g);
        C1499f c1499f = this.f7551h;
        Month monthM8172v = c1499f == null ? null : c1499f.m8172v();
        if (monthM8172v != null) {
            c1490b.m8116b(monthM8172v.f7480i);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c1490b.m8115a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f7552i);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f7553j);
        bundle.putInt("INPUT_MODE_KEY", this.f7555l);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f7556m);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f7557n);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f7558o);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f7559p);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f7560q);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f7561r);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f7562s);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f7563t);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1075c, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f7554k) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f7567x);
            m8181m(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(AbstractC0142c.f410i0);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f7567x, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC0467a(requireDialog(), rect));
        }
        m8192y();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1075c, androidx.fragment.app.Fragment
    public void onStop() {
        this.f7549f.m8218j();
        super.onStop();
    }

    /* JADX INFO: renamed from: q */
    public String m8193q() {
        m8182n();
        getContext();
        throw null;
    }

    /* JADX INFO: renamed from: z */
    void m8194z(String str) {
        this.f7565v.setContentDescription(m8184p());
        this.f7565v.setText(str);
    }
}
