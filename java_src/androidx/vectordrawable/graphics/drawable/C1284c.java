package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.collection.C0921a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000A.AbstractC0000a;
import p164y.AbstractC2538k;
import p164y.AbstractC2541n;

/* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.c */
/* JADX INFO: loaded from: classes.dex */
public class C1284c extends AbstractC1288g implements Animatable {

    /* JADX INFO: renamed from: b */
    private c f6233b;

    /* JADX INFO: renamed from: c */
    private Context f6234c;

    /* JADX INFO: renamed from: d */
    private ArgbEvaluator f6235d;

    /* JADX INFO: renamed from: e */
    d f6236e;

    /* JADX INFO: renamed from: f */
    private Animator.AnimatorListener f6237f;

    /* JADX INFO: renamed from: g */
    ArrayList f6238g;

    /* JADX INFO: renamed from: h */
    final Drawable.Callback f6239h;

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.c$a */
    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C1284c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
            C1284c.this.scheduleSelf(runnable, j3);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C1284c.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.c$b */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(C1284c.this.f6238g);
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((AbstractC1283b) arrayList.get(i3)).mo1933b(C1284c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(C1284c.this.f6238g);
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((AbstractC1283b) arrayList.get(i3)).mo6476c(C1284c.this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.c$c */
    private static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        int f6242a;

        /* JADX INFO: renamed from: b */
        C1289h f6243b;

        /* JADX INFO: renamed from: c */
        AnimatorSet f6244c;

        /* JADX INFO: renamed from: d */
        ArrayList f6245d;

        /* JADX INFO: renamed from: e */
        C0921a f6246e;

        public c(Context context, c cVar, Drawable.Callback callback, Resources resources) {
            if (cVar != null) {
                this.f6242a = cVar.f6242a;
                C1289h c1289h = cVar.f6243b;
                if (c1289h != null) {
                    Drawable.ConstantState constantState = c1289h.getConstantState();
                    if (resources != null) {
                        this.f6243b = (C1289h) constantState.newDrawable(resources);
                    } else {
                        this.f6243b = (C1289h) constantState.newDrawable();
                    }
                    C1289h c1289h2 = (C1289h) this.f6243b.mutate();
                    this.f6243b = c1289h2;
                    c1289h2.setCallback(callback);
                    this.f6243b.setBounds(cVar.f6243b.getBounds());
                    this.f6243b.m6516h(false);
                }
                ArrayList arrayList = cVar.f6245d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f6245d = new ArrayList(size);
                    this.f6246e = new C0921a(size);
                    for (int i3 = 0; i3 < size; i3++) {
                        Animator animator = (Animator) cVar.f6245d.get(i3);
                        Animator animatorClone = animator.clone();
                        String str = (String) cVar.f6246e.get(animator);
                        animatorClone.setTarget(this.f6243b.m6515d(str));
                        this.f6245d.add(animatorClone);
                        this.f6246e.put(animatorClone, str);
                    }
                    m6485a();
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m6485a() {
            if (this.f6244c == null) {
                this.f6244c = new AnimatorSet();
            }
            this.f6244c.playTogether(this.f6245d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6242a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    C1284c() {
        this(null, null, null);
    }

    /* JADX INFO: renamed from: a */
    public static C1284c m6477a(Context context, int i3) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C1284c c1284c = new C1284c(context);
            Drawable drawableM12140f = AbstractC2538k.m12140f(context.getResources(), i3, context.getTheme());
            c1284c.f6250a = drawableM12140f;
            drawableM12140f.setCallback(c1284c.f6239h);
            c1284c.f6236e = new d(c1284c.f6250a.getConstantState());
            return c1284c;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(i3);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return m6478b(context, context.getResources(), xml, attributeSetAsAttributeSet, context.getTheme());
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e3) {
            Log.e("AnimatedVDCompat", "parser error", e3);
            return null;
        } catch (XmlPullParserException e4) {
            Log.e("AnimatedVDCompat", "parser error", e4);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C1284c m6478b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C1284c c1284c = new C1284c(context);
        c1284c.inflate(resources, xmlPullParser, attributeSet, theme);
        return c1284c;
    }

    /* JADX INFO: renamed from: d */
    private static void m6479d(AnimatedVectorDrawable animatedVectorDrawable, AbstractC1283b abstractC1283b) {
        animatedVectorDrawable.registerAnimationCallback(abstractC1283b.m6475a());
    }

    /* JADX INFO: renamed from: e */
    private void m6480e() {
        Animator.AnimatorListener animatorListener = this.f6237f;
        if (animatorListener != null) {
            this.f6233b.f6244c.removeListener(animatorListener);
            this.f6237f = null;
        }
    }

    /* JADX INFO: renamed from: f */
    private void m6481f(String str, Animator animator) {
        animator.setTarget(this.f6233b.f6243b.m6515d(str));
        c cVar = this.f6233b;
        if (cVar.f6245d == null) {
            cVar.f6245d = new ArrayList();
            this.f6233b.f6246e = new C0921a();
        }
        this.f6233b.f6245d.add(animator);
        this.f6233b.f6246e.put(animator, str);
    }

    /* JADX INFO: renamed from: h */
    private static boolean m6482h(AnimatedVectorDrawable animatedVectorDrawable, AbstractC1283b abstractC1283b) {
        return animatedVectorDrawable.unregisterAnimationCallback(abstractC1283b.m6475a());
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            AbstractC0000a.m0a(drawable, theme);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m6483c(AbstractC1283b abstractC1283b) {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            m6479d((AnimatedVectorDrawable) drawable, abstractC1283b);
            return;
        }
        if (abstractC1283b == null) {
            return;
        }
        if (this.f6238g == null) {
            this.f6238g = new ArrayList();
        }
        if (this.f6238g.contains(abstractC1283b)) {
            return;
        }
        this.f6238g.add(abstractC1283b);
        if (this.f6237f == null) {
            this.f6237f = new b();
        }
        this.f6233b.f6244c.addListener(this.f6237f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            return AbstractC0000a.m1b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f6233b.f6243b.draw(canvas);
        if (this.f6233b.f6244c.isStarted()) {
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m6484g(AbstractC1283b abstractC1283b) {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            m6482h((AnimatedVectorDrawable) drawable, abstractC1283b);
        }
        ArrayList arrayList = this.f6238g;
        if (arrayList == null || abstractC1283b == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(abstractC1283b);
        if (this.f6238g.size() == 0) {
            m6480e();
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f6250a;
        return drawable != null ? AbstractC0000a.m3d(drawable) : this.f6233b.f6243b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f6250a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f6233b.f6242a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f6250a;
        return drawable != null ? AbstractC0000a.m4e(drawable) : this.f6233b.f6243b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f6250a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new d(this.f6250a.getConstantState());
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f6250a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f6233b.f6243b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f6250a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f6233b.f6243b.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f6250a;
        return drawable != null ? drawable.getOpacity() : this.f6233b.f6243b.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            AbstractC0000a.m6g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM12180s = AbstractC2541n.m12180s(resources, theme, attributeSet, AbstractC1282a.f6223e);
                    int resourceId = typedArrayM12180s.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C1289h c1289hM6509b = C1289h.m6509b(resources, resourceId, theme);
                        c1289hM6509b.m6516h(false);
                        c1289hM6509b.setCallback(this.f6239h);
                        C1289h c1289h = this.f6233b.f6243b;
                        if (c1289h != null) {
                            c1289h.setCallback(null);
                        }
                        this.f6233b.f6243b = c1289hM6509b;
                    }
                    typedArrayM12180s.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, AbstractC1282a.f6224f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f6234c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        m6481f(string, AbstractC1286e.m6495i(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f6233b.m6485a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f6250a;
        return drawable != null ? AbstractC0000a.m7h(drawable) : this.f6233b.f6243b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f6250a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f6233b.f6244c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f6250a;
        return drawable != null ? drawable.isStateful() : this.f6233b.f6243b.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f6233b.f6243b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i3) {
        Drawable drawable = this.f6250a;
        return drawable != null ? drawable.setLevel(i3) : this.f6233b.f6243b.setLevel(i3);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f6250a;
        return drawable != null ? drawable.setState(iArr) : this.f6233b.f6243b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i3) {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            drawable.setAlpha(i3);
        } else {
            this.f6233b.f6243b.setAlpha(i3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            AbstractC0000a.m9j(drawable, z2);
        } else {
            this.f6233b.f6243b.setAutoMirrored(z2);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i3) {
        super.setChangingConfigurations(i3);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i3, PorterDuff.Mode mode) {
        super.setColorFilter(i3, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z2) {
        super.setFilterBitmap(z2);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f3, float f4) {
        super.setHotspot(f3, f4);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i3, int i4, int i5, int i6) {
        super.setHotspotBounds(i3, i4, i5, i6);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i3) {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            AbstractC0000a.m13n(drawable, i3);
        } else {
            this.f6233b.f6243b.setTint(i3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            AbstractC0000a.m14o(drawable, colorStateList);
        } else {
            this.f6233b.f6243b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            AbstractC0000a.m15p(drawable, mode);
        } else {
            this.f6233b.f6243b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f6233b.f6243b.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f6233b.f6244c.isStarted()) {
                return;
            }
            this.f6233b.f6244c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f6233b.f6244c.end();
        }
    }

    private C1284c(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f6233b.f6243b.setColorFilter(colorFilter);
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.c$d */
    private static class d extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        private final Drawable.ConstantState f6247a;

        public d(Drawable.ConstantState constantState) {
            this.f6247a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f6247a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6247a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C1284c c1284c = new C1284c();
            Drawable drawableNewDrawable = this.f6247a.newDrawable();
            c1284c.f6250a = drawableNewDrawable;
            drawableNewDrawable.setCallback(c1284c.f6239h);
            return c1284c;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C1284c c1284c = new C1284c();
            Drawable drawableNewDrawable = this.f6247a.newDrawable(resources);
            c1284c.f6250a = drawableNewDrawable;
            drawableNewDrawable.setCallback(c1284c.f6239h);
            return c1284c;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1284c c1284c = new C1284c();
            Drawable drawableNewDrawable = this.f6247a.newDrawable(resources, theme);
            c1284c.f6250a = drawableNewDrawable;
            drawableNewDrawable.setCallback(c1284c.f6239h);
            return c1284c;
        }
    }

    private C1284c(Context context, c cVar, Resources resources) {
        this.f6235d = null;
        this.f6237f = null;
        this.f6238g = null;
        a aVar = new a();
        this.f6239h = aVar;
        this.f6234c = context;
        if (cVar != null) {
            this.f6233b = cVar;
        } else {
            this.f6233b = new c(context, cVar, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
