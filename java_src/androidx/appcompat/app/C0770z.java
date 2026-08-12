package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.view.C0774d;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.C0824B;
import androidx.appcompat.widget.C0829F;
import androidx.appcompat.widget.C0882b0;
import androidx.appcompat.widget.C0883c;
import androidx.appcompat.widget.C0887e;
import androidx.appcompat.widget.C0889f;
import androidx.appcompat.widget.C0891g;
import androidx.appcompat.widget.C0899k;
import androidx.appcompat.widget.C0907o;
import androidx.appcompat.widget.C0911q;
import androidx.appcompat.widget.C0912r;
import androidx.appcompat.widget.C0915u;
import androidx.appcompat.widget.C0916v;
import androidx.appcompat.widget.C0918x;
import androidx.collection.C0929i;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p027J.AbstractC0268W;
import p091d.AbstractC1769j;

/* JADX INFO: renamed from: androidx.appcompat.app.z */
/* JADX INFO: loaded from: classes.dex */
public class C0770z {

    /* JADX INFO: renamed from: b */
    private static final Class[] f2803b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c */
    private static final int[] f2804c = {R.attr.onClick};

    /* JADX INFO: renamed from: d */
    private static final int[] f2805d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e */
    private static final int[] f2806e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f */
    private static final int[] f2807f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g */
    private static final String[] f2808g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h */
    private static final C0929i f2809h = new C0929i();

    /* JADX INFO: renamed from: a */
    private final Object[] f2810a = new Object[2];

    /* JADX INFO: renamed from: androidx.appcompat.app.z$a */
    private static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        private final View f2811a;

        /* JADX INFO: renamed from: b */
        private final String f2812b;

        /* JADX INFO: renamed from: c */
        private Method f2813c;

        /* JADX INFO: renamed from: d */
        private Context f2814d;

        public a(View view, String str) {
            this.f2811a = view;
            this.f2812b = str;
        }

        /* JADX INFO: renamed from: a */
        private void m2997a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f2812b, View.class)) != null) {
                        this.f2813c = method;
                        this.f2814d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f2811a.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f2811a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f2812b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f2811a.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f2813c == null) {
                m2997a(this.f2811a.getContext());
            }
            try {
                this.f2813c.invoke(this.f2814d, view);
            } catch (IllegalAccessException e3) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException("Could not execute method for android:onClick", e4);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2975a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2805d);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            AbstractC0268W.m777j0(view, typedArrayObtainStyledAttributes.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f2806e);
        if (typedArrayObtainStyledAttributes2.hasValue(0)) {
            AbstractC0268W.m779k0(view, typedArrayObtainStyledAttributes2.getString(0));
        }
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f2807f);
        if (typedArrayObtainStyledAttributes3.hasValue(0)) {
            AbstractC0268W.m797t0(view, typedArrayObtainStyledAttributes3.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes3.recycle();
    }

    /* JADX INFO: renamed from: b */
    private void m2976b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2804c);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: s */
    private View m2977s(Context context, String str, String str2) {
        String str3;
        C0929i c0929i = f2809h;
        Constructor constructor = (Constructor) c0929i.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2803b);
            c0929i.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2810a);
    }

    /* JADX INFO: renamed from: t */
    private View m2978t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f2810a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return m2977s(context, str, null);
            }
            int i3 = 0;
            while (true) {
                String[] strArr = f2808g;
                if (i3 >= strArr.length) {
                    return null;
                }
                View viewM2977s = m2977s(context, str, strArr[i3]);
                if (viewM2977s != null) {
                    return viewM2977s;
                }
                i3++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f2810a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    /* JADX INFO: renamed from: u */
    private static Context m2979u(Context context, AttributeSet attributeSet, boolean z2, boolean z3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1769j.f8985V3, 0, 0);
        int resourceId = z2 ? typedArrayObtainStyledAttributes.getResourceId(AbstractC1769j.f8990W3, 0) : 0;
        if (z3 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC1769j.f8995X3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == 0 || ((context instanceof C0774d) && ((C0774d) context).m3013c() == resourceId)) ? context : new C0774d(context, resourceId);
    }

    /* JADX INFO: renamed from: v */
    private void m2980v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    /* JADX INFO: renamed from: c */
    protected C0883c mo2981c(Context context, AttributeSet attributeSet) {
        return new C0883c(context, attributeSet);
    }

    /* JADX INFO: renamed from: d */
    protected C0887e mo2982d(Context context, AttributeSet attributeSet) {
        return new C0887e(context, attributeSet);
    }

    /* JADX INFO: renamed from: e */
    protected C0889f mo2983e(Context context, AttributeSet attributeSet) {
        return new C0889f(context, attributeSet);
    }

    /* JADX INFO: renamed from: f */
    protected C0891g m2984f(Context context, AttributeSet attributeSet) {
        return new C0891g(context, attributeSet);
    }

    /* JADX INFO: renamed from: g */
    protected C0899k m2985g(Context context, AttributeSet attributeSet) {
        return new C0899k(context, attributeSet);
    }

    /* JADX INFO: renamed from: h */
    protected C0907o m2986h(Context context, AttributeSet attributeSet) {
        return new C0907o(context, attributeSet);
    }

    /* JADX INFO: renamed from: i */
    protected C0911q m2987i(Context context, AttributeSet attributeSet) {
        return new C0911q(context, attributeSet);
    }

    /* JADX INFO: renamed from: j */
    protected C0912r m2988j(Context context, AttributeSet attributeSet) {
        return new C0912r(context, attributeSet);
    }

    /* JADX INFO: renamed from: k */
    protected C0915u mo2989k(Context context, AttributeSet attributeSet) {
        return new C0915u(context, attributeSet);
    }

    /* JADX INFO: renamed from: l */
    protected C0916v m2990l(Context context, AttributeSet attributeSet) {
        return new C0916v(context, attributeSet);
    }

    /* JADX INFO: renamed from: m */
    protected C0918x m2991m(Context context, AttributeSet attributeSet) {
        return new C0918x(context, attributeSet);
    }

    /* JADX INFO: renamed from: n */
    protected AppCompatSpinner m2992n(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    /* JADX INFO: renamed from: o */
    protected C0824B mo2993o(Context context, AttributeSet attributeSet) {
        return new C0824B(context, attributeSet);
    }

    /* JADX INFO: renamed from: p */
    protected C0829F m2994p(Context context, AttributeSet attributeSet) {
        return new C0829F(context, attributeSet);
    }

    /* JADX INFO: renamed from: q */
    protected View m2995q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final View m2996r(View view, String str, Context context, AttributeSet attributeSet, boolean z2, boolean z3, boolean z4, boolean z5) {
        Context context2;
        View viewM2990l;
        context2 = (!z2 || view == null) ? context : view.getContext();
        if (z3 || z4) {
            context2 = m2979u(context2, attributeSet, z3, z4);
        }
        if (z5) {
            context2 = C0882b0.m3749b(context2);
        }
        str.getClass();
        switch (str) {
            case "RatingBar":
                viewM2990l = m2990l(context2, attributeSet);
                m2980v(viewM2990l, str);
                break;
            case "CheckedTextView":
                viewM2990l = m2984f(context2, attributeSet);
                m2980v(viewM2990l, str);
                break;
            case "MultiAutoCompleteTextView":
                viewM2990l = m2988j(context2, attributeSet);
                m2980v(viewM2990l, str);
                break;
            case "TextView":
                viewM2990l = mo2993o(context2, attributeSet);
                m2980v(viewM2990l, str);
                break;
            case "ImageButton":
                viewM2990l = m2986h(context2, attributeSet);
                m2980v(viewM2990l, str);
                break;
            case "SeekBar":
                viewM2990l = m2991m(context2, attributeSet);
                m2980v(viewM2990l, str);
                break;
            case "Spinner":
                viewM2990l = m2992n(context2, attributeSet);
                m2980v(viewM2990l, str);
                break;
            case "RadioButton":
                viewM2990l = mo2989k(context2, attributeSet);
                m2980v(viewM2990l, str);
                break;
            case "ToggleButton":
                viewM2990l = m2994p(context2, attributeSet);
                m2980v(viewM2990l, str);
                break;
            case "ImageView":
                viewM2990l = m2987i(context2, attributeSet);
                m2980v(viewM2990l, str);
                break;
            case "AutoCompleteTextView":
                viewM2990l = mo2981c(context2, attributeSet);
                m2980v(viewM2990l, str);
                break;
            case "CheckBox":
                viewM2990l = mo2983e(context2, attributeSet);
                m2980v(viewM2990l, str);
                break;
            case "EditText":
                viewM2990l = m2985g(context2, attributeSet);
                m2980v(viewM2990l, str);
                break;
            case "Button":
                viewM2990l = mo2982d(context2, attributeSet);
                m2980v(viewM2990l, str);
                break;
            default:
                viewM2990l = m2995q(context2, str, attributeSet);
                break;
        }
        if (viewM2990l == null && context != context2) {
            viewM2990l = m2978t(context2, str, attributeSet);
        }
        if (viewM2990l != null) {
            m2976b(viewM2990l, attributeSet);
            m2975a(context2, viewM2990l, attributeSet);
        }
        return viewM2990l;
    }
}
