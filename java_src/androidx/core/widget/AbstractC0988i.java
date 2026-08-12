package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p021H.AbstractC0195m;
import p024I.AbstractC0211h;

/* JADX INFO: renamed from: androidx.core.widget.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0988i {

    /* JADX INFO: renamed from: androidx.core.widget.i$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static int m4398a(TextView textView) {
            return textView.getBreakStrategy();
        }

        /* JADX INFO: renamed from: b */
        static int m4399b(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        /* JADX INFO: renamed from: c */
        static void m4400c(TextView textView, int i3) {
            textView.setBreakStrategy(i3);
        }

        /* JADX INFO: renamed from: d */
        static void m4401d(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        /* JADX INFO: renamed from: e */
        static void m4402e(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        /* JADX INFO: renamed from: f */
        static void m4403f(TextView textView, int i3) {
            textView.setHyphenationFrequency(i3);
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.i$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static DecimalFormatSymbols m4404a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.i$c */
    static class c {
        /* JADX INFO: renamed from: a */
        static String[] m4405a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        /* JADX INFO: renamed from: b */
        static PrecomputedText.Params m4406b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        /* JADX INFO: renamed from: c */
        static void m4407c(TextView textView, int i3) {
            textView.setFirstBaselineToTopHeight(i3);
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.i$d */
    static class d {
        /* JADX INFO: renamed from: a */
        public static void m4408a(TextView textView, int i3, float f3) {
            textView.setLineHeight(i3, f3);
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.i$e */
    private static class e implements ActionMode.Callback {

        /* JADX INFO: renamed from: a */
        private final ActionMode.Callback f4736a;

        /* JADX INFO: renamed from: b */
        private final TextView f4737b;

        /* JADX INFO: renamed from: c */
        private Class f4738c;

        /* JADX INFO: renamed from: d */
        private Method f4739d;

        /* JADX INFO: renamed from: e */
        private boolean f4740e;

        /* JADX INFO: renamed from: f */
        private boolean f4741f = false;

        e(ActionMode.Callback callback, TextView textView) {
            this.f4736a = callback;
            this.f4737b = textView;
        }

        /* JADX INFO: renamed from: a */
        private Intent m4409a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* JADX INFO: renamed from: b */
        private Intent m4410b(ResolveInfo resolveInfo, TextView textView) {
            Intent intentPutExtra = m4409a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m4412e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* JADX INFO: renamed from: c */
        private List m4411c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m4409a(), 0)) {
                    if (m4413f(resolveInfo, context)) {
                        arrayList.add(resolveInfo);
                    }
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: e */
        private boolean m4412e(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        /* JADX INFO: renamed from: f */
        private boolean m4413f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        /* JADX INFO: renamed from: g */
        private void m4414g(Menu menu) {
            Context context = this.f4737b.getContext();
            PackageManager packageManager = context.getPackageManager();
            boolean z2 = this.f4741f;
            Class<?> cls = Integer.TYPE;
            if (!z2) {
                this.f4741f = true;
                try {
                    Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f4738c = cls2;
                    this.f4739d = cls2.getDeclaredMethod("removeItemAt", cls);
                    this.f4740e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f4738c = null;
                    this.f4739d = null;
                    this.f4740e = false;
                }
            }
            try {
                Method declaredMethod = (this.f4740e && this.f4738c.isInstance(menu)) ? this.f4739d : menu.getClass().getDeclaredMethod("removeItemAt", cls);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List listM4411c = m4411c(context, packageManager);
                for (int i3 = 0; i3 < listM4411c.size(); i3++) {
                    ResolveInfo resolveInfo = (ResolveInfo) listM4411c.get(i3);
                    menu.add(0, 0, i3 + 100, resolveInfo.loadLabel(packageManager)).setIntent(m4410b(resolveInfo, this.f4737b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        /* JADX INFO: renamed from: d */
        ActionMode.Callback m4415d() {
            return this.f4736a;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f4736a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f4736a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f4736a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m4414g(menu);
            return this.f4736a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m4382a(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* JADX INFO: renamed from: b */
    public static int m4383b(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* JADX INFO: renamed from: c */
    private static int m4384c(TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        return textDirectionHeuristic == textDirectionHeuristic3 ? 7 : 1;
    }

    /* JADX INFO: renamed from: d */
    private static TextDirectionHeuristic m4385d(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(c.m4405a(b.m4404a(textView.getTextLocale()))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z2 = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                if (!z2) {
                }
                break;
        }
        return TextDirectionHeuristics.LTR;
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC0195m.a m4386e(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new AbstractC0195m.a(c.m4406b(textView));
        }
        AbstractC0195m.a.C2606a c2606a = new AbstractC0195m.a.C2606a(new TextPaint(textView.getPaint()));
        c2606a.m579b(a.m4398a(textView));
        c2606a.m580c(a.m4399b(textView));
        c2606a.m581d(m4385d(textView));
        return c2606a.m578a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static void m4387f(TextView textView, ColorStateList colorStateList) {
        AbstractC0211h.m610g(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            a.m4401d(textView, colorStateList);
        } else if (textView instanceof InterfaceC0991l) {
            ((InterfaceC0991l) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static void m4388g(TextView textView, PorterDuff.Mode mode) {
        AbstractC0211h.m610g(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            a.m4402e(textView, mode);
        } else if (textView instanceof InterfaceC0991l) {
            ((InterfaceC0991l) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m4389h(TextView textView, int i3) {
        AbstractC0211h.m607d(i3);
        if (Build.VERSION.SDK_INT >= 28) {
            c.m4407c(textView, i3);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i4 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i3 > Math.abs(i4)) {
            textView.setPadding(textView.getPaddingLeft(), i3 + i4, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m4390i(TextView textView, int i3) {
        AbstractC0211h.m607d(i3);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i4 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i3 > Math.abs(i4)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i3 - i4);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m4391j(TextView textView, int i3) {
        AbstractC0211h.m607d(i3);
        if (i3 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i3 - r0, 1.0f);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m4392k(TextView textView, int i3, float f3) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.m4408a(textView, i3, f3);
        } else {
            m4391j(textView, Math.round(TypedValue.applyDimension(i3, f3, textView.getResources().getDisplayMetrics())));
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m4393l(TextView textView, AbstractC0195m abstractC0195m) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        m4386e(textView);
        throw null;
    }

    /* JADX INFO: renamed from: m */
    public static void m4394m(TextView textView, int i3) {
        textView.setTextAppearance(i3);
    }

    /* JADX INFO: renamed from: n */
    public static void m4395n(TextView textView, AbstractC0195m.a aVar) {
        textView.setTextDirection(m4384c(aVar.m576d()));
        textView.getPaint().set(aVar.m577e());
        a.m4400c(textView, aVar.m574b());
        a.m4403f(textView, aVar.m575c());
    }

    /* JADX INFO: renamed from: o */
    public static ActionMode.Callback m4396o(ActionMode.Callback callback) {
        return (!(callback instanceof e) || Build.VERSION.SDK_INT < 26) ? callback : ((e) callback).m4415d();
    }

    /* JADX INFO: renamed from: p */
    public static ActionMode.Callback m4397p(TextView textView, ActionMode.Callback callback) {
        int i3 = Build.VERSION.SDK_INT;
        return (i3 < 26 || i3 > 27 || (callback instanceof e) || callback == null) ? callback : new e(callback, textView);
    }
}
