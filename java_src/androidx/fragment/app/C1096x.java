package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.AbstractC1038F;
import androidx.lifecycle.AbstractC1126h;
import androidx.lifecycle.InterfaceC1110K;
import p027J.AbstractC0268W;
import p054S.AbstractC0503b;
import p057T.C0509c;

/* JADX INFO: renamed from: androidx.fragment.app.x */
/* JADX INFO: loaded from: classes.dex */
class C1096x {

    /* JADX INFO: renamed from: a */
    private final C1087o f5209a;

    /* JADX INFO: renamed from: b */
    private final C1097y f5210b;

    /* JADX INFO: renamed from: c */
    private final Fragment f5211c;

    /* JADX INFO: renamed from: d */
    private boolean f5212d = false;

    /* JADX INFO: renamed from: e */
    private int f5213e = -1;

    /* JADX INFO: renamed from: androidx.fragment.app.x$a */
    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f5214a;

        a(View view) {
            this.f5214a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f5214a.removeOnAttachStateChangeListener(this);
            AbstractC0268W.m769f0(this.f5214a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.x$b */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f5216a;

        static {
            int[] iArr = new int[AbstractC1126h.b.values().length];
            f5216a = iArr;
            try {
                iArr[AbstractC1126h.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5216a[AbstractC1126h.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5216a[AbstractC1126h.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5216a[AbstractC1126h.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    C1096x(C1087o c1087o, C1097y c1097y, Fragment fragment) {
        this.f5209a = c1087o;
        this.f5210b = c1097y;
        this.f5211c = fragment;
    }

    /* JADX INFO: renamed from: l */
    private boolean m4996l(View view) {
        if (view == this.f5211c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f5211c.mView) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    private Bundle m4997q() {
        Bundle bundle = new Bundle();
        this.f5211c.performSaveInstanceState(bundle);
        this.f5209a.m4977j(this.f5211c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f5211c.mView != null) {
            m5014s();
        }
        if (this.f5211c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f5211c.mSavedViewState);
        }
        if (this.f5211c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f5211c.mSavedViewRegistryState);
        }
        if (!this.f5211c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f5211c.mUserVisibleHint);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    void m4998a() {
        if (FragmentManager.m4744H0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f5211c);
        }
        Fragment fragment = this.f5211c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        C1087o c1087o = this.f5209a;
        Fragment fragment2 = this.f5211c;
        c1087o.m4968a(fragment2, fragment2.mSavedFragmentState, false);
    }

    /* JADX INFO: renamed from: b */
    void m4999b() {
        int iM5029j = this.f5210b.m5029j(this.f5211c);
        Fragment fragment = this.f5211c;
        fragment.mContainer.addView(fragment.mView, iM5029j);
    }

    /* JADX INFO: renamed from: c */
    void m5000c() {
        if (FragmentManager.m4744H0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f5211c);
        }
        Fragment fragment = this.f5211c;
        Fragment fragment2 = fragment.mTarget;
        C1096x c1096xM5033n = null;
        if (fragment2 != null) {
            C1096x c1096xM5033n2 = this.f5210b.m5033n(fragment2.mWho);
            if (c1096xM5033n2 == null) {
                throw new IllegalStateException("Fragment " + this.f5211c + " declared target fragment " + this.f5211c.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f5211c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            c1096xM5033n = c1096xM5033n2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (c1096xM5033n = this.f5210b.m5033n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f5211c + " declared target fragment " + this.f5211c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (c1096xM5033n != null) {
            c1096xM5033n.m5009m();
        }
        Fragment fragment4 = this.f5211c;
        fragment4.mHost = fragment4.mFragmentManager.m4854u0();
        Fragment fragment5 = this.f5211c;
        fragment5.mParentFragment = fragment5.mFragmentManager.m4859x0();
        this.f5209a.m4974g(this.f5211c, false);
        this.f5211c.performAttach();
        this.f5209a.m4969b(this.f5211c, false);
    }

    /* JADX INFO: renamed from: d */
    int m5001d() {
        Fragment fragment = this.f5211c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f5213e;
        int i3 = b.f5216a[fragment.mMaxState.ordinal()];
        if (i3 != 1) {
            iMin = i3 != 2 ? i3 != 3 ? i3 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        Fragment fragment2 = this.f5211c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                iMin = Math.max(this.f5213e, 2);
                View view = this.f5211c.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f5213e < 4 ? Math.min(iMin, fragment2.mState) : Math.min(iMin, 1);
            }
        }
        if (!this.f5211c.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        Fragment fragment3 = this.f5211c;
        ViewGroup viewGroup = fragment3.mContainer;
        AbstractC1038F.e.b bVarM4704l = viewGroup != null ? AbstractC1038F.m4693n(viewGroup, fragment3.getParentFragmentManager()).m4704l(this) : null;
        if (bVarM4704l == AbstractC1038F.e.b.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (bVarM4704l == AbstractC1038F.e.b.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment4 = this.f5211c;
            if (fragment4.mRemoving) {
                iMin = fragment4.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment5 = this.f5211c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (FragmentManager.m4744H0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f5211c);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: e */
    void m5002e() {
        if (FragmentManager.m4744H0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f5211c);
        }
        Fragment fragment = this.f5211c;
        if (fragment.mIsCreated) {
            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
            this.f5211c.mState = 1;
            return;
        }
        this.f5209a.m4975h(fragment, fragment.mSavedFragmentState, false);
        Fragment fragment2 = this.f5211c;
        fragment2.performCreate(fragment2.mSavedFragmentState);
        C1087o c1087o = this.f5209a;
        Fragment fragment3 = this.f5211c;
        c1087o.m4970c(fragment3, fragment3.mSavedFragmentState, false);
    }

    /* JADX INFO: renamed from: f */
    void m5003f() {
        String resourceName;
        if (this.f5211c.mFromLayout) {
            return;
        }
        if (FragmentManager.m4744H0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f5211c);
        }
        Fragment fragment = this.f5211c;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        Fragment fragment2 = this.f5211c;
        ViewGroup viewGroup = fragment2.mContainer;
        if (viewGroup == null) {
            int i3 = fragment2.mContainerId;
            if (i3 == 0) {
                viewGroup = null;
            } else {
                if (i3 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f5211c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.mFragmentManager.m4851q0().mo4736e(this.f5211c.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f5211c;
                    if (!fragment3.mRestored) {
                        try {
                            resourceName = fragment3.getResources().getResourceName(this.f5211c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f5211c.mContainerId) + " (" + resourceName + ") for fragment " + this.f5211c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C0509c.m1864n(this.f5211c, viewGroup);
                }
            }
        }
        Fragment fragment4 = this.f5211c;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.f5211c.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f5211c;
            fragment5.mView.setTag(AbstractC0503b.f1741a, fragment5);
            if (viewGroup != null) {
                m4999b();
            }
            Fragment fragment6 = this.f5211c;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            if (AbstractC0268W.m745N(this.f5211c.mView)) {
                AbstractC0268W.m769f0(this.f5211c.mView);
            } else {
                View view2 = this.f5211c.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f5211c.performViewCreated();
            C1087o c1087o = this.f5209a;
            Fragment fragment7 = this.f5211c;
            c1087o.m4980m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.f5211c.mView.getVisibility();
            this.f5211c.setPostOnViewCreatedAlpha(this.f5211c.mView.getAlpha());
            Fragment fragment8 = this.f5211c;
            if (fragment8.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment8.mView.findFocus();
                if (viewFindFocus != null) {
                    this.f5211c.setFocusedView(viewFindFocus);
                    if (FragmentManager.m4744H0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f5211c);
                    }
                }
                this.f5211c.mView.setAlpha(0.0f);
            }
        }
        this.f5211c.mState = 2;
    }

    /* JADX INFO: renamed from: g */
    void m5004g() {
        Fragment fragmentM5025f;
        if (FragmentManager.m4744H0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f5211c);
        }
        Fragment fragment = this.f5211c;
        boolean zIsChangingConfigurations = true;
        boolean z2 = fragment.mRemoving && !fragment.isInBackStack();
        if (z2) {
            Fragment fragment2 = this.f5211c;
            if (!fragment2.mBeingSaved) {
                this.f5210b.m5019B(fragment2.mWho, null);
            }
        }
        if (!z2 && !this.f5210b.m5035p().m4995r(this.f5211c)) {
            String str = this.f5211c.mTargetWho;
            if (str != null && (fragmentM5025f = this.f5210b.m5025f(str)) != null && fragmentM5025f.mRetainInstance) {
                this.f5211c.mTarget = fragmentM5025f;
            }
            this.f5211c.mState = 0;
            return;
        }
        AbstractC1085m abstractC1085m = this.f5211c.mHost;
        if (abstractC1085m instanceof InterfaceC1110K) {
            zIsChangingConfigurations = this.f5210b.m5035p().m4992o();
        } else if (abstractC1085m.m4963m() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) abstractC1085m.m4963m()).isChangingConfigurations();
        }
        if ((z2 && !this.f5211c.mBeingSaved) || zIsChangingConfigurations) {
            this.f5210b.m5035p().m4986g(this.f5211c);
        }
        this.f5211c.performDestroy();
        this.f5209a.m4971d(this.f5211c, false);
        for (C1096x c1096x : this.f5210b.m5030k()) {
            if (c1096x != null) {
                Fragment fragmentM5008k = c1096x.m5008k();
                if (this.f5211c.mWho.equals(fragmentM5008k.mTargetWho)) {
                    fragmentM5008k.mTarget = this.f5211c;
                    fragmentM5008k.mTargetWho = null;
                }
            }
        }
        Fragment fragment3 = this.f5211c;
        String str2 = fragment3.mTargetWho;
        if (str2 != null) {
            fragment3.mTarget = this.f5210b.m5025f(str2);
        }
        this.f5210b.m5038s(this);
    }

    /* JADX INFO: renamed from: h */
    void m5005h() {
        View view;
        if (FragmentManager.m4744H0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f5211c);
        }
        Fragment fragment = this.f5211c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f5211c.performDestroyView();
        this.f5209a.m4981n(this.f5211c, false);
        Fragment fragment2 = this.f5211c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.mo5106i(null);
        this.f5211c.mInLayout = false;
    }

    /* JADX INFO: renamed from: i */
    void m5006i() {
        if (FragmentManager.m4744H0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f5211c);
        }
        this.f5211c.performDetach();
        this.f5209a.m4972e(this.f5211c, false);
        Fragment fragment = this.f5211c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if ((!fragment.mRemoving || fragment.isInBackStack()) && !this.f5210b.m5035p().m4995r(this.f5211c)) {
            return;
        }
        if (FragmentManager.m4744H0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f5211c);
        }
        this.f5211c.initState();
    }

    /* JADX INFO: renamed from: j */
    void m5007j() {
        Fragment fragment = this.f5211c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.m4744H0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f5211c);
            }
            Fragment fragment2 = this.f5211c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f5211c.mSavedFragmentState);
            View view = this.f5211c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f5211c;
                fragment3.mView.setTag(AbstractC0503b.f1741a, fragment3);
                Fragment fragment4 = this.f5211c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f5211c.performViewCreated();
                C1087o c1087o = this.f5209a;
                Fragment fragment5 = this.f5211c;
                c1087o.m4980m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f5211c.mState = 2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    Fragment m5008k() {
        return this.f5211c;
    }

    /* JADX INFO: renamed from: m */
    void m5009m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f5212d) {
            if (FragmentManager.m4744H0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + m5008k());
                return;
            }
            return;
        }
        try {
            this.f5212d = true;
            boolean z2 = false;
            while (true) {
                int iM5001d = m5001d();
                Fragment fragment = this.f5211c;
                int i3 = fragment.mState;
                if (iM5001d == i3) {
                    if (!z2 && i3 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f5211c.mBeingSaved) {
                        if (FragmentManager.m4744H0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f5211c);
                        }
                        this.f5210b.m5035p().m4986g(this.f5211c);
                        this.f5210b.m5038s(this);
                        if (FragmentManager.m4744H0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f5211c);
                        }
                        this.f5211c.initState();
                    }
                    Fragment fragment2 = this.f5211c;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            AbstractC1038F abstractC1038FM4693n = AbstractC1038F.m4693n(viewGroup, fragment2.getParentFragmentManager());
                            if (this.f5211c.mHidden) {
                                abstractC1038FM4693n.m4697c(this);
                            } else {
                                abstractC1038FM4693n.m4699e(this);
                            }
                        }
                        Fragment fragment3 = this.f5211c;
                        FragmentManager fragmentManager = fragment3.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.m4792F0(fragment3);
                        }
                        Fragment fragment4 = this.f5211c;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.f5211c.mChildFragmentManager.m4797J();
                    }
                    this.f5212d = false;
                    return;
                }
                if (iM5001d <= i3) {
                    switch (i3 - 1) {
                        case -1:
                            m5006i();
                            break;
                        case 0:
                            if (fragment.mBeingSaved && this.f5210b.m5036q(fragment.mWho) == null) {
                                m5013r();
                            }
                            m5004g();
                            break;
                        case 1:
                            m5005h();
                            this.f5211c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.m4744H0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f5211c);
                            }
                            Fragment fragment5 = this.f5211c;
                            if (fragment5.mBeingSaved) {
                                m5013r();
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                m5014s();
                            }
                            Fragment fragment6 = this.f5211c;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                AbstractC1038F.m4693n(viewGroup2, fragment6.getParentFragmentManager()).m4698d(this);
                            }
                            this.f5211c.mState = 3;
                            break;
                        case 4:
                            m5017v();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            m5010n();
                            break;
                    }
                } else {
                    switch (i3 + 1) {
                        case 0:
                            m5000c();
                            break;
                        case 1:
                            m5002e();
                            break;
                        case 2:
                            m5007j();
                            m5003f();
                            break;
                        case 3:
                            m4998a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                AbstractC1038F.m4693n(viewGroup3, fragment.getParentFragmentManager()).m4696b(AbstractC1038F.e.c.m4720b(this.f5211c.mView.getVisibility()), this);
                            }
                            this.f5211c.mState = 4;
                            break;
                        case 5:
                            m5016u();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            m5012p();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.f5212d = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: n */
    void m5010n() {
        if (FragmentManager.m4744H0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f5211c);
        }
        this.f5211c.performPause();
        this.f5209a.m4973f(this.f5211c, false);
    }

    /* JADX INFO: renamed from: o */
    void m5011o(ClassLoader classLoader) {
        Bundle bundle = this.f5211c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f5211c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f5211c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f5211c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.f5211c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f5211c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.f5211c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f5211c;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    /* JADX INFO: renamed from: p */
    void m5012p() {
        if (FragmentManager.m4744H0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f5211c);
        }
        View focusedView = this.f5211c.getFocusedView();
        if (focusedView != null && m4996l(focusedView)) {
            boolean zRequestFocus = focusedView.requestFocus();
            if (FragmentManager.m4744H0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                sb.append(zRequestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f5211c);
                sb.append(" resulting in focused view ");
                sb.append(this.f5211c.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f5211c.setFocusedView(null);
        this.f5211c.performResume();
        this.f5209a.m4976i(this.f5211c, false);
        Fragment fragment = this.f5211c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* JADX INFO: renamed from: r */
    void m5013r() {
        FragmentState fragmentState = new FragmentState(this.f5211c);
        Fragment fragment = this.f5211c;
        if (fragment.mState <= -1 || fragmentState.f5110p != null) {
            fragmentState.f5110p = fragment.mSavedFragmentState;
        } else {
            Bundle bundleM4997q = m4997q();
            fragmentState.f5110p = bundleM4997q;
            if (this.f5211c.mTargetWho != null) {
                if (bundleM4997q == null) {
                    fragmentState.f5110p = new Bundle();
                }
                fragmentState.f5110p.putString("android:target_state", this.f5211c.mTargetWho);
                int i3 = this.f5211c.mTargetRequestCode;
                if (i3 != 0) {
                    fragmentState.f5110p.putInt("android:target_req_state", i3);
                }
            }
        }
        this.f5210b.m5019B(this.f5211c.mWho, fragmentState);
    }

    /* JADX INFO: renamed from: s */
    void m5014s() {
        if (this.f5211c.mView == null) {
            return;
        }
        if (FragmentManager.m4744H0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f5211c + " with view " + this.f5211c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f5211c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f5211c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f5211c.mViewLifecycleOwner.m4687f(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f5211c.mSavedViewRegistryState = bundle;
    }

    /* JADX INFO: renamed from: t */
    void m5015t(int i3) {
        this.f5213e = i3;
    }

    /* JADX INFO: renamed from: u */
    void m5016u() {
        if (FragmentManager.m4744H0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f5211c);
        }
        this.f5211c.performStart();
        this.f5209a.m4978k(this.f5211c, false);
    }

    /* JADX INFO: renamed from: v */
    void m5017v() {
        if (FragmentManager.m4744H0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f5211c);
        }
        this.f5211c.performStop();
        this.f5209a.m4979l(this.f5211c, false);
    }

    C1096x(C1087o c1087o, C1097y c1097y, ClassLoader classLoader, AbstractC1084l abstractC1084l, FragmentState fragmentState) {
        this.f5209a = c1087o;
        this.f5210b = c1097y;
        Fragment fragmentM4880a = fragmentState.m4880a(abstractC1084l, classLoader);
        this.f5211c = fragmentM4880a;
        if (FragmentManager.m4744H0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentM4880a);
        }
    }

    C1096x(C1087o c1087o, C1097y c1097y, Fragment fragment, FragmentState fragmentState) {
        this.f5209a = c1087o;
        this.f5210b = c1097y;
        this.f5211c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.f5110p;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
