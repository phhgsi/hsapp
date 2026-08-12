package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AbstractC0840Q;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p027J.AbstractC0268W;
import p091d.AbstractC1760a;
import p091d.AbstractC1765f;
import p091d.AbstractC1769j;

/* JADX INFO: loaded from: classes.dex */
class AlertController {

    /* JADX INFO: renamed from: A */
    NestedScrollView f2484A;

    /* JADX INFO: renamed from: C */
    private Drawable f2486C;

    /* JADX INFO: renamed from: D */
    private ImageView f2487D;

    /* JADX INFO: renamed from: E */
    private TextView f2488E;

    /* JADX INFO: renamed from: F */
    private TextView f2489F;

    /* JADX INFO: renamed from: G */
    private View f2490G;

    /* JADX INFO: renamed from: H */
    ListAdapter f2491H;

    /* JADX INFO: renamed from: J */
    private int f2493J;

    /* JADX INFO: renamed from: K */
    private int f2494K;

    /* JADX INFO: renamed from: L */
    int f2495L;

    /* JADX INFO: renamed from: M */
    int f2496M;

    /* JADX INFO: renamed from: N */
    int f2497N;

    /* JADX INFO: renamed from: O */
    int f2498O;

    /* JADX INFO: renamed from: P */
    private boolean f2499P;

    /* JADX INFO: renamed from: R */
    Handler f2501R;

    /* JADX INFO: renamed from: a */
    private final Context f2503a;

    /* JADX INFO: renamed from: b */
    final AbstractDialogC0769y f2504b;

    /* JADX INFO: renamed from: c */
    private final Window f2505c;

    /* JADX INFO: renamed from: d */
    private final int f2506d;

    /* JADX INFO: renamed from: e */
    private CharSequence f2507e;

    /* JADX INFO: renamed from: f */
    private CharSequence f2508f;

    /* JADX INFO: renamed from: g */
    ListView f2509g;

    /* JADX INFO: renamed from: h */
    private View f2510h;

    /* JADX INFO: renamed from: i */
    private int f2511i;

    /* JADX INFO: renamed from: j */
    private int f2512j;

    /* JADX INFO: renamed from: k */
    private int f2513k;

    /* JADX INFO: renamed from: l */
    private int f2514l;

    /* JADX INFO: renamed from: m */
    private int f2515m;

    /* JADX INFO: renamed from: o */
    Button f2517o;

    /* JADX INFO: renamed from: p */
    private CharSequence f2518p;

    /* JADX INFO: renamed from: q */
    Message f2519q;

    /* JADX INFO: renamed from: r */
    private Drawable f2520r;

    /* JADX INFO: renamed from: s */
    Button f2521s;

    /* JADX INFO: renamed from: t */
    private CharSequence f2522t;

    /* JADX INFO: renamed from: u */
    Message f2523u;

    /* JADX INFO: renamed from: v */
    private Drawable f2524v;

    /* JADX INFO: renamed from: w */
    Button f2525w;

    /* JADX INFO: renamed from: x */
    private CharSequence f2526x;

    /* JADX INFO: renamed from: y */
    Message f2527y;

    /* JADX INFO: renamed from: z */
    private Drawable f2528z;

    /* JADX INFO: renamed from: n */
    private boolean f2516n = false;

    /* JADX INFO: renamed from: B */
    private int f2485B = 0;

    /* JADX INFO: renamed from: I */
    int f2492I = -1;

    /* JADX INFO: renamed from: Q */
    private int f2500Q = 0;

    /* JADX INFO: renamed from: S */
    private final View.OnClickListener f2502S = new ViewOnClickListenerC0733a();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: a */
        private final int f2529a;

        /* JADX INFO: renamed from: b */
        private final int f2530b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1769j.f9065k2);
            this.f2530b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC1769j.f9070l2, -1);
            this.f2529a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC1769j.f9075m2, -1);
        }

        /* JADX INFO: renamed from: a */
        public void m2680a(boolean z2, boolean z3) {
            if (z3 && z2) {
                return;
            }
            setPadding(getPaddingLeft(), z2 ? getPaddingTop() : this.f2529a, getPaddingRight(), z3 ? getPaddingBottom() : this.f2530b);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$a */
    class ViewOnClickListenerC0733a implements View.OnClickListener {
        ViewOnClickListenerC0733a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message messageObtain = (view != alertController.f2517o || (message3 = alertController.f2519q) == null) ? (view != alertController.f2521s || (message2 = alertController.f2523u) == null) ? (view != alertController.f2525w || (message = alertController.f2527y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f2501R.obtainMessage(1, alertController2.f2504b).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b */
    public static class C0734b {

        /* JADX INFO: renamed from: A */
        public int f2532A;

        /* JADX INFO: renamed from: B */
        public int f2533B;

        /* JADX INFO: renamed from: C */
        public int f2534C;

        /* JADX INFO: renamed from: D */
        public int f2535D;

        /* JADX INFO: renamed from: F */
        public boolean[] f2537F;

        /* JADX INFO: renamed from: G */
        public boolean f2538G;

        /* JADX INFO: renamed from: H */
        public boolean f2539H;

        /* JADX INFO: renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f2541J;

        /* JADX INFO: renamed from: K */
        public Cursor f2542K;

        /* JADX INFO: renamed from: L */
        public String f2543L;

        /* JADX INFO: renamed from: M */
        public String f2544M;

        /* JADX INFO: renamed from: N */
        public AdapterView.OnItemSelectedListener f2545N;

        /* JADX INFO: renamed from: a */
        public final Context f2547a;

        /* JADX INFO: renamed from: b */
        public final LayoutInflater f2548b;

        /* JADX INFO: renamed from: d */
        public Drawable f2550d;

        /* JADX INFO: renamed from: f */
        public CharSequence f2552f;

        /* JADX INFO: renamed from: g */
        public View f2553g;

        /* JADX INFO: renamed from: h */
        public CharSequence f2554h;

        /* JADX INFO: renamed from: i */
        public CharSequence f2555i;

        /* JADX INFO: renamed from: j */
        public Drawable f2556j;

        /* JADX INFO: renamed from: k */
        public DialogInterface.OnClickListener f2557k;

        /* JADX INFO: renamed from: l */
        public CharSequence f2558l;

        /* JADX INFO: renamed from: m */
        public Drawable f2559m;

        /* JADX INFO: renamed from: n */
        public DialogInterface.OnClickListener f2560n;

        /* JADX INFO: renamed from: o */
        public CharSequence f2561o;

        /* JADX INFO: renamed from: p */
        public Drawable f2562p;

        /* JADX INFO: renamed from: q */
        public DialogInterface.OnClickListener f2563q;

        /* JADX INFO: renamed from: s */
        public DialogInterface.OnCancelListener f2565s;

        /* JADX INFO: renamed from: t */
        public DialogInterface.OnDismissListener f2566t;

        /* JADX INFO: renamed from: u */
        public DialogInterface.OnKeyListener f2567u;

        /* JADX INFO: renamed from: v */
        public CharSequence[] f2568v;

        /* JADX INFO: renamed from: w */
        public ListAdapter f2569w;

        /* JADX INFO: renamed from: x */
        public DialogInterface.OnClickListener f2570x;

        /* JADX INFO: renamed from: y */
        public int f2571y;

        /* JADX INFO: renamed from: z */
        public View f2572z;

        /* JADX INFO: renamed from: c */
        public int f2549c = 0;

        /* JADX INFO: renamed from: e */
        public int f2551e = 0;

        /* JADX INFO: renamed from: E */
        public boolean f2536E = false;

        /* JADX INFO: renamed from: I */
        public int f2540I = -1;

        /* JADX INFO: renamed from: O */
        public boolean f2546O = true;

        /* JADX INFO: renamed from: r */
        public boolean f2564r = true;

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$a */
        class a extends ArrayAdapter {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ RecycleListView f2573a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i3, int i4, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i3, i4, charSequenceArr);
                this.f2573a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i3, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i3, view, viewGroup);
                boolean[] zArr = C0734b.this.f2537F;
                if (zArr != null && zArr[i3]) {
                    this.f2573a.setItemChecked(i3, true);
                }
                return view2;
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$b */
        class b extends CursorAdapter {

            /* JADX INFO: renamed from: a */
            private final int f2575a;

            /* JADX INFO: renamed from: b */
            private final int f2576b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ RecycleListView f2577c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ AlertController f2578d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z2, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z2);
                this.f2577c = recycleListView;
                this.f2578d = alertController;
                Cursor cursor2 = getCursor();
                this.f2575a = cursor2.getColumnIndexOrThrow(C0734b.this.f2543L);
                this.f2576b = cursor2.getColumnIndexOrThrow(C0734b.this.f2544M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f2575a));
                this.f2577c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f2576b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0734b.this.f2548b.inflate(this.f2578d.f2496M, viewGroup, false);
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$c */
        class c implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ AlertController f2580a;

            c(AlertController alertController) {
                this.f2580a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
                C0734b.this.f2570x.onClick(this.f2580a.f2504b, i3);
                if (C0734b.this.f2539H) {
                    return;
                }
                this.f2580a.f2504b.dismiss();
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$d */
        class d implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ RecycleListView f2582a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ AlertController f2583b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f2582a = recycleListView;
                this.f2583b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
                boolean[] zArr = C0734b.this.f2537F;
                if (zArr != null) {
                    zArr[i3] = this.f2582a.isItemChecked(i3);
                }
                C0734b.this.f2541J.onClick(this.f2583b.f2504b, i3, this.f2582a.isItemChecked(i3));
            }
        }

        public C0734b(Context context) {
            this.f2547a = context;
            this.f2548b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX INFO: renamed from: b */
        private void m2681b(AlertController alertController) {
            C0734b c0734b;
            AlertController alertController2;
            ListAdapter c0736d;
            RecycleListView recycleListView = (RecycleListView) this.f2548b.inflate(alertController.f2495L, (ViewGroup) null);
            if (!this.f2538G) {
                c0734b = this;
                alertController2 = alertController;
                int i3 = c0734b.f2539H ? alertController2.f2497N : alertController2.f2498O;
                if (c0734b.f2542K != null) {
                    c0736d = new SimpleCursorAdapter(c0734b.f2547a, i3, c0734b.f2542K, new String[]{c0734b.f2543L}, new int[]{R.id.text1});
                } else {
                    c0736d = c0734b.f2569w;
                    if (c0736d == null) {
                        c0736d = new C0736d(c0734b.f2547a, i3, R.id.text1, c0734b.f2568v);
                    }
                }
            } else if (this.f2542K == null) {
                c0734b = this;
                c0736d = c0734b.new a(this.f2547a, alertController.f2496M, R.id.text1, this.f2568v, recycleListView);
                recycleListView = recycleListView;
                alertController2 = alertController;
            } else {
                c0734b = this;
                alertController2 = alertController;
                c0736d = c0734b.new b(c0734b.f2547a, c0734b.f2542K, false, recycleListView, alertController2);
            }
            alertController2.f2491H = c0736d;
            alertController2.f2492I = c0734b.f2540I;
            if (c0734b.f2570x != null) {
                recycleListView.setOnItemClickListener(new c(alertController2));
            } else if (c0734b.f2541J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController2));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = c0734b.f2545N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (c0734b.f2539H) {
                recycleListView.setChoiceMode(1);
            } else if (c0734b.f2538G) {
                recycleListView.setChoiceMode(2);
            }
            alertController2.f2509g = recycleListView;
        }

        /* JADX INFO: renamed from: a */
        public void m2682a(AlertController alertController) {
            AlertController alertController2;
            View view = this.f2553g;
            if (view != null) {
                alertController.m2672k(view);
            } else {
                CharSequence charSequence = this.f2552f;
                if (charSequence != null) {
                    alertController.m2676p(charSequence);
                }
                Drawable drawable = this.f2550d;
                if (drawable != null) {
                    alertController.m2674m(drawable);
                }
                int i3 = this.f2549c;
                if (i3 != 0) {
                    alertController.m2673l(i3);
                }
                int i4 = this.f2551e;
                if (i4 != 0) {
                    alertController.m2673l(alertController.m2666c(i4));
                }
            }
            CharSequence charSequence2 = this.f2554h;
            if (charSequence2 != null) {
                alertController.m2675n(charSequence2);
            }
            CharSequence charSequence3 = this.f2555i;
            if (charSequence3 == null && this.f2556j == null) {
                alertController2 = alertController;
            } else {
                alertController.m2671j(-1, charSequence3, this.f2557k, null, this.f2556j);
                alertController2 = alertController;
            }
            CharSequence charSequence4 = this.f2558l;
            if (charSequence4 != null || this.f2559m != null) {
                alertController2.m2671j(-2, charSequence4, this.f2560n, null, this.f2559m);
            }
            CharSequence charSequence5 = this.f2561o;
            if (charSequence5 != null || this.f2562p != null) {
                alertController2.m2671j(-3, charSequence5, this.f2563q, null, this.f2562p);
            }
            if (this.f2568v != null || this.f2542K != null || this.f2569w != null) {
                m2681b(alertController2);
            }
            View view2 = this.f2572z;
            if (view2 != null) {
                if (this.f2536E) {
                    alertController2.m2679s(view2, this.f2532A, this.f2533B, this.f2534C, this.f2535D);
                    return;
                } else {
                    alertController2.m2678r(view2);
                    return;
                }
            }
            int i5 = this.f2571y;
            if (i5 != 0) {
                alertController2.m2677q(i5);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$c */
    private static final class HandlerC0735c extends Handler {

        /* JADX INFO: renamed from: a */
        private WeakReference f2585a;

        public HandlerC0735c(DialogInterface dialogInterface) {
            this.f2585a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i3 = message.what;
            if (i3 == -3 || i3 == -2 || i3 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f2585a.get(), message.what);
            } else {
                if (i3 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$d */
    private static class C0736d extends ArrayAdapter {
        public C0736d(Context context, int i3, int i4, CharSequence[] charSequenceArr) {
            super(context, i3, i4, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i3) {
            return i3;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, AbstractDialogC0769y abstractDialogC0769y, Window window) {
        this.f2503a = context;
        this.f2504b = abstractDialogC0769y;
        this.f2505c = window;
        this.f2501R = new HandlerC0735c(abstractDialogC0769y);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC1769j.f8901F, AbstractC1760a.f8710k, 0);
        this.f2493J = typedArrayObtainStyledAttributes.getResourceId(AbstractC1769j.f8906G, 0);
        this.f2494K = typedArrayObtainStyledAttributes.getResourceId(AbstractC1769j.f8916I, 0);
        this.f2495L = typedArrayObtainStyledAttributes.getResourceId(AbstractC1769j.f8926K, 0);
        this.f2496M = typedArrayObtainStyledAttributes.getResourceId(AbstractC1769j.f8931L, 0);
        this.f2497N = typedArrayObtainStyledAttributes.getResourceId(AbstractC1769j.f8941N, 0);
        this.f2498O = typedArrayObtainStyledAttributes.getResourceId(AbstractC1769j.f8921J, 0);
        this.f2499P = typedArrayObtainStyledAttributes.getBoolean(AbstractC1769j.f8936M, true);
        this.f2506d = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC1769j.f8911H, 0);
        typedArrayObtainStyledAttributes.recycle();
        abstractDialogC0769y.m2974j(1);
    }

    /* JADX INFO: renamed from: a */
    static boolean m2655a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m2655a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private void m2656b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: h */
    private ViewGroup m2657h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* JADX INFO: renamed from: i */
    private int m2658i() {
        int i3 = this.f2494K;
        return i3 == 0 ? this.f2493J : this.f2500Q == 1 ? i3 : this.f2493J;
    }

    /* JADX INFO: renamed from: o */
    private void m2659o(ViewGroup viewGroup, View view, int i3, int i4) {
        View viewFindViewById = this.f2505c.findViewById(AbstractC1765f.f8830v);
        View viewFindViewById2 = this.f2505c.findViewById(AbstractC1765f.f8829u);
        AbstractC0268W.m799u0(view, i3, i4);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    /* JADX INFO: renamed from: t */
    private void m2660t(ViewGroup viewGroup) {
        int i3;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f2517o = button;
        button.setOnClickListener(this.f2502S);
        if (TextUtils.isEmpty(this.f2518p) && this.f2520r == null) {
            this.f2517o.setVisibility(8);
            i3 = 0;
        } else {
            this.f2517o.setText(this.f2518p);
            Drawable drawable = this.f2520r;
            if (drawable != null) {
                int i4 = this.f2506d;
                drawable.setBounds(0, 0, i4, i4);
                this.f2517o.setCompoundDrawables(this.f2520r, null, null, null);
            }
            this.f2517o.setVisibility(0);
            i3 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f2521s = button2;
        button2.setOnClickListener(this.f2502S);
        if (TextUtils.isEmpty(this.f2522t) && this.f2524v == null) {
            this.f2521s.setVisibility(8);
        } else {
            this.f2521s.setText(this.f2522t);
            Drawable drawable2 = this.f2524v;
            if (drawable2 != null) {
                int i5 = this.f2506d;
                drawable2.setBounds(0, 0, i5, i5);
                this.f2521s.setCompoundDrawables(this.f2524v, null, null, null);
            }
            this.f2521s.setVisibility(0);
            i3 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f2525w = button3;
        button3.setOnClickListener(this.f2502S);
        if (TextUtils.isEmpty(this.f2526x) && this.f2528z == null) {
            this.f2525w.setVisibility(8);
        } else {
            this.f2525w.setText(this.f2526x);
            Drawable drawable3 = this.f2528z;
            if (drawable3 != null) {
                int i6 = this.f2506d;
                drawable3.setBounds(0, 0, i6, i6);
                this.f2525w.setCompoundDrawables(this.f2528z, null, null, null);
            }
            this.f2525w.setVisibility(0);
            i3 |= 4;
        }
        if (m2665y(this.f2503a)) {
            if (i3 == 1) {
                m2656b(this.f2517o);
            } else if (i3 == 2) {
                m2656b(this.f2521s);
            } else if (i3 == 4) {
                m2656b(this.f2525w);
            }
        }
        if (i3 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* JADX INFO: renamed from: u */
    private void m2661u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f2505c.findViewById(AbstractC1765f.f8831w);
        this.f2484A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f2484A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f2489F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f2508f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f2484A.removeView(this.f2489F);
        if (this.f2509g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f2484A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f2484A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f2509g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX INFO: renamed from: v */
    private void m2662v(ViewGroup viewGroup) {
        View viewInflate = this.f2510h;
        if (viewInflate == null) {
            viewInflate = this.f2511i != 0 ? LayoutInflater.from(this.f2503a).inflate(this.f2511i, viewGroup, false) : null;
        }
        boolean z2 = viewInflate != null;
        if (!z2 || !m2655a(viewInflate)) {
            this.f2505c.setFlags(131072, 131072);
        }
        if (!z2) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f2505c.findViewById(AbstractC1765f.f8822n);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f2516n) {
            frameLayout.setPadding(this.f2512j, this.f2513k, this.f2514l, this.f2515m);
        }
        if (this.f2509g != null) {
            ((LinearLayout.LayoutParams) ((AbstractC0840Q.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    /* JADX INFO: renamed from: w */
    private void m2663w(ViewGroup viewGroup) {
        if (this.f2490G != null) {
            viewGroup.addView(this.f2490G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f2505c.findViewById(AbstractC1765f.f8807O).setVisibility(8);
            return;
        }
        this.f2487D = (ImageView) this.f2505c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f2507e) || !this.f2499P) {
            this.f2505c.findViewById(AbstractC1765f.f8807O).setVisibility(8);
            this.f2487D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f2505c.findViewById(AbstractC1765f.f8818j);
        this.f2488E = textView;
        textView.setText(this.f2507e);
        int i3 = this.f2485B;
        if (i3 != 0) {
            this.f2487D.setImageResource(i3);
            return;
        }
        Drawable drawable = this.f2486C;
        if (drawable != null) {
            this.f2487D.setImageDrawable(drawable);
        } else {
            this.f2488E.setPadding(this.f2487D.getPaddingLeft(), this.f2487D.getPaddingTop(), this.f2487D.getPaddingRight(), this.f2487D.getPaddingBottom());
            this.f2487D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    private void m2664x() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f2505c.findViewById(AbstractC1765f.f8828t);
        int i3 = AbstractC1765f.f8808P;
        View viewFindViewById4 = viewFindViewById3.findViewById(i3);
        int i4 = AbstractC1765f.f8821m;
        View viewFindViewById5 = viewFindViewById3.findViewById(i4);
        int i5 = AbstractC1765f.f8819k;
        View viewFindViewById6 = viewFindViewById3.findViewById(i5);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(AbstractC1765f.f8823o);
        m2662v(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(i3);
        View viewFindViewById8 = viewGroup.findViewById(i4);
        View viewFindViewById9 = viewGroup.findViewById(i5);
        ViewGroup viewGroupM2657h = m2657h(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM2657h2 = m2657h(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupM2657h3 = m2657h(viewFindViewById9, viewFindViewById6);
        m2661u(viewGroupM2657h2);
        m2660t(viewGroupM2657h3);
        m2663w(viewGroupM2657h);
        boolean z2 = viewGroup.getVisibility() != 8;
        boolean z3 = (viewGroupM2657h == null || viewGroupM2657h.getVisibility() == 8) ? 0 : 1;
        boolean z4 = (viewGroupM2657h3 == null || viewGroupM2657h3.getVisibility() == 8) ? false : true;
        if (!z4 && viewGroupM2657h2 != null && (viewFindViewById2 = viewGroupM2657h2.findViewById(AbstractC1765f.f8803K)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z3 != 0) {
            NestedScrollView nestedScrollView = this.f2484A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f2508f == null && this.f2509g == null) ? null : viewGroupM2657h.findViewById(AbstractC1765f.f8806N);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupM2657h2 != null && (viewFindViewById = viewGroupM2657h2.findViewById(AbstractC1765f.f8804L)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f2509g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).m2680a(z3, z4);
        }
        if (!z2) {
            View view = this.f2509g;
            if (view == null) {
                view = this.f2484A;
            }
            if (view != null) {
                m2659o(viewGroupM2657h2, view, z3 | (z4 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f2509g;
        if (listView2 == null || (listAdapter = this.f2491H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i6 = this.f2492I;
        if (i6 > -1) {
            listView2.setItemChecked(i6, true);
            listView2.setSelection(i6);
        }
    }

    /* JADX INFO: renamed from: y */
    private static boolean m2665y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC1760a.f8709j, typedValue, true);
        return typedValue.data != 0;
    }

    /* JADX INFO: renamed from: c */
    public int m2666c(int i3) {
        TypedValue typedValue = new TypedValue();
        this.f2503a.getTheme().resolveAttribute(i3, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX INFO: renamed from: d */
    public ListView m2667d() {
        return this.f2509g;
    }

    /* JADX INFO: renamed from: e */
    public void m2668e() {
        this.f2504b.setContentView(m2658i());
        m2664x();
    }

    /* JADX INFO: renamed from: f */
    public boolean m2669f(int i3, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2484A;
        return nestedScrollView != null && nestedScrollView.m4301t(keyEvent);
    }

    /* JADX INFO: renamed from: g */
    public boolean m2670g(int i3, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2484A;
        return nestedScrollView != null && nestedScrollView.m4301t(keyEvent);
    }

    /* JADX INFO: renamed from: j */
    public void m2671j(int i3, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f2501R.obtainMessage(i3, onClickListener);
        }
        if (i3 == -3) {
            this.f2526x = charSequence;
            this.f2527y = message;
            this.f2528z = drawable;
        } else if (i3 == -2) {
            this.f2522t = charSequence;
            this.f2523u = message;
            this.f2524v = drawable;
        } else {
            if (i3 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f2518p = charSequence;
            this.f2519q = message;
            this.f2520r = drawable;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m2672k(View view) {
        this.f2490G = view;
    }

    /* JADX INFO: renamed from: l */
    public void m2673l(int i3) {
        this.f2486C = null;
        this.f2485B = i3;
        ImageView imageView = this.f2487D;
        if (imageView != null) {
            if (i3 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f2487D.setImageResource(this.f2485B);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m2674m(Drawable drawable) {
        this.f2486C = drawable;
        this.f2485B = 0;
        ImageView imageView = this.f2487D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f2487D.setImageDrawable(drawable);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m2675n(CharSequence charSequence) {
        this.f2508f = charSequence;
        TextView textView = this.f2489F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m2676p(CharSequence charSequence) {
        this.f2507e = charSequence;
        TextView textView = this.f2488E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m2677q(int i3) {
        this.f2510h = null;
        this.f2511i = i3;
        this.f2516n = false;
    }

    /* JADX INFO: renamed from: r */
    public void m2678r(View view) {
        this.f2510h = view;
        this.f2511i = 0;
        this.f2516n = false;
    }

    /* JADX INFO: renamed from: s */
    public void m2679s(View view, int i3, int i4, int i5, int i6) {
        this.f2510h = view;
        this.f2511i = 0;
        this.f2516n = true;
        this.f2512j = i3;
        this.f2513k = i4;
        this.f2514l = i5;
        this.f2515m = i6;
    }
}
