package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p054S.AbstractC0504c;
import p057T.C0509c;

/* JADX INFO: renamed from: androidx.fragment.app.n */
/* JADX INFO: loaded from: classes.dex */
class LayoutInflaterFactory2C1086n implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a */
    final FragmentManager f5191a;

    /* JADX INFO: renamed from: androidx.fragment.app.n$a */
    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C1096x f5192a;

        a(C1096x c1096x) {
            this.f5192a = c1096x;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment fragmentM5008k = this.f5192a.m5008k();
            this.f5192a.m5009m();
            AbstractC1038F.m4693n((ViewGroup) fragmentM5008k.mView.getParent(), LayoutInflaterFactory2C1086n.this.f5191a).m4702j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    LayoutInflaterFactory2C1086n(FragmentManager fragmentManager) {
        this.f5191a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C1096x c1096xM4856w;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f5191a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0504c.f1744a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(AbstractC0504c.f1745b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC0504c.f1746c, -1);
        String string = typedArrayObtainStyledAttributes.getString(AbstractC0504c.f1747d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !AbstractC1084l.m4959b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentM4832h0 = resourceId != -1 ? this.f5191a.m4832h0(resourceId) : null;
        if (fragmentM4832h0 == null && string != null) {
            fragmentM4832h0 = this.f5191a.m4835i0(string);
        }
        if (fragmentM4832h0 == null && id != -1) {
            fragmentM4832h0 = this.f5191a.m4832h0(id);
        }
        if (fragmentM4832h0 == null) {
            fragmentM4832h0 = this.f5191a.m4852s0().mo4868a(context.getClassLoader(), attributeValue);
            fragmentM4832h0.mFromLayout = true;
            fragmentM4832h0.mFragmentId = resourceId != 0 ? resourceId : id;
            fragmentM4832h0.mContainerId = id;
            fragmentM4832h0.mTag = string;
            fragmentM4832h0.mInLayout = true;
            FragmentManager fragmentManager = this.f5191a;
            fragmentM4832h0.mFragmentManager = fragmentManager;
            fragmentM4832h0.mHost = fragmentManager.m4854u0();
            fragmentM4832h0.onInflate(this.f5191a.m4854u0().m4963m(), attributeSet, fragmentM4832h0.mSavedFragmentState);
            c1096xM4856w = this.f5191a.m4837j(fragmentM4832h0);
            if (FragmentManager.m4744H0(2)) {
                Log.v("FragmentManager", "Fragment " + fragmentM4832h0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (fragmentM4832h0.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            fragmentM4832h0.mInLayout = true;
            FragmentManager fragmentManager2 = this.f5191a;
            fragmentM4832h0.mFragmentManager = fragmentManager2;
            fragmentM4832h0.mHost = fragmentManager2.m4854u0();
            fragmentM4832h0.onInflate(this.f5191a.m4854u0().m4963m(), attributeSet, fragmentM4832h0.mSavedFragmentState);
            c1096xM4856w = this.f5191a.m4856w(fragmentM4832h0);
            if (FragmentManager.m4744H0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + fragmentM4832h0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        C0509c.m1857g(fragmentM4832h0, viewGroup);
        fragmentM4832h0.mContainer = viewGroup;
        c1096xM4856w.m5009m();
        c1096xM4856w.m5007j();
        View view2 = fragmentM4832h0.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragmentM4832h0.mView.getTag() == null) {
            fragmentM4832h0.mView.setTag(string);
        }
        fragmentM4832h0.mView.addOnAttachStateChangeListener(new a(c1096xM4856w));
        return fragmentM4832h0.mView;
    }
}
