package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.AbstractC1099A;
import androidx.lifecycle.AbstractC1111L;
import androidx.lifecycle.AbstractC1116M;
import androidx.lifecycle.AbstractC1126h;
import androidx.lifecycle.C1102D;
import androidx.lifecycle.C1106G;
import androidx.lifecycle.C1109J;
import androidx.lifecycle.C1133o;
import androidx.lifecycle.C1136r;
import androidx.lifecycle.InterfaceC1110K;
import androidx.lifecycle.InterfaceC1125g;
import androidx.lifecycle.InterfaceC1130l;
import androidx.lifecycle.InterfaceC1132n;
import androidx.lifecycle.LiveData;
import androidx.loader.app.AbstractC1145a;
import androidx.savedstate.C1240a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p027J.AbstractC0313u;
import p057T.C0509c;
import p069X.AbstractC0589a;
import p069X.C0592d;
import p083b.AbstractC1294b;
import p083b.AbstractC1296d;
import p083b.InterfaceC1293a;
import p083b.InterfaceC1297e;
import p087c.AbstractC1307a;
import p100f0.AbstractC1891e;
import p100f0.C1889c;
import p100f0.InterfaceC1890d;
import p123l.InterfaceC2116a;
import p161x.AbstractC2504c;
import p161x.AbstractC2521t;

/* JADX INFO: loaded from: classes.dex */
public abstract class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1132n, InterfaceC1110K, InterfaceC1125g, InterfaceC1890d {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    C1050j mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    C1106G.b mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    AbstractC1085m mHost;
    boolean mInLayout;
    boolean mIsCreated;
    LayoutInflater mLayoutInflater;
    C1133o mLifecycleRegistry;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    C1889c mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    View mView;
    C1036D mViewLifecycleOwner;
    int mState = -1;
    String mWho = UUID.randomUUID().toString();
    String mTargetWho = null;
    private Boolean mIsPrimaryNavigationFragment = null;
    FragmentManager mChildFragmentManager = new C1093u();
    boolean mMenuVisible = true;
    boolean mUserVisibleHint = true;
    Runnable mPostponedDurationRunnable = new RunnableC1042b();
    AbstractC1126h.b mMaxState = AbstractC1126h.b.RESUMED;
    C1136r mViewLifecycleOwnerLiveData = new C1136r();
    private final AtomicInteger mNextLocalRequestCode = new AtomicInteger();
    private final ArrayList<AbstractC1053m> mOnPreAttachedListeners = new ArrayList<>();
    private final AbstractC1053m mSavedStateAttachListener = new C1043c();

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1040a();

        /* JADX INFO: renamed from: d */
        final Bundle f4983d;

        /* JADX INFO: renamed from: androidx.fragment.app.Fragment$SavedState$a */
        class C1040a implements Parcelable.ClassLoaderCreator {
            C1040a() {
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

        SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f4983d = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            parcel.writeBundle(this.f4983d);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$a */
    class C1041a extends AbstractC1294b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AtomicReference f4984a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AbstractC1307a f4985b;

        C1041a(AtomicReference atomicReference, AbstractC1307a abstractC1307a) {
            this.f4984a = atomicReference;
            this.f4985b = abstractC1307a;
        }

        @Override // p083b.AbstractC1294b
        /* JADX INFO: renamed from: b */
        public void mo4733b(Object obj, AbstractC2504c abstractC2504c) {
            AbstractC1294b abstractC1294b = (AbstractC1294b) this.f4984a.get();
            if (abstractC1294b == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            abstractC1294b.mo4733b(obj, abstractC2504c);
        }

        @Override // p083b.AbstractC1294b
        /* JADX INFO: renamed from: c */
        public void mo4734c() {
            AbstractC1294b abstractC1294b = (AbstractC1294b) this.f4984a.getAndSet(null);
            if (abstractC1294b != null) {
                abstractC1294b.mo4734c();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$b */
    class RunnableC1042b implements Runnable {
        RunnableC1042b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$c */
    class C1043c extends AbstractC1053m {
        C1043c() {
            super(null);
        }

        @Override // androidx.fragment.app.Fragment.AbstractC1053m
        /* JADX INFO: renamed from: a */
        void mo4735a() {
            Fragment.this.mSavedStateRegistryController.m9771c();
            AbstractC1099A.m5056c(Fragment.this);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$d */
    class RunnableC1044d implements Runnable {
        RunnableC1044d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$e */
    class RunnableC1045e implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ AbstractC1038F f4990d;

        RunnableC1045e(AbstractC1038F abstractC1038F) {
            this.f4990d = abstractC1038F;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4990d.m4701g();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$f */
    class C1046f extends AbstractC1082j {
        C1046f() {
        }

        @Override // androidx.fragment.app.AbstractC1082j
        /* JADX INFO: renamed from: e */
        public View mo4736e(int i3) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i3);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.AbstractC1082j
        /* JADX INFO: renamed from: g */
        public boolean mo4737g() {
            return Fragment.this.mView != null;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$g */
    class C1047g implements InterfaceC2116a {
        C1047g() {
        }

        @Override // p123l.InterfaceC2116a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC1296d apply(Void r3) {
            Fragment fragment = Fragment.this;
            Object obj = fragment.mHost;
            return obj instanceof InterfaceC1297e ? ((InterfaceC1297e) obj).mo2536s() : fragment.requireActivity().mo2536s();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$h */
    class C1048h implements InterfaceC2116a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC1296d f4994a;

        C1048h(AbstractC1296d abstractC1296d) {
            this.f4994a = abstractC1296d;
        }

        @Override // p123l.InterfaceC2116a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC1296d apply(Void r12) {
            return this.f4994a;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$i */
    class C1049i extends AbstractC1053m {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC2116a f4996a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AtomicReference f4997b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ AbstractC1307a f4998c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC1293a f4999d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1049i(InterfaceC2116a interfaceC2116a, AtomicReference atomicReference, AbstractC1307a abstractC1307a, InterfaceC1293a interfaceC1293a) {
            super(null);
            this.f4996a = interfaceC2116a;
            this.f4997b = atomicReference;
            this.f4998c = abstractC1307a;
            this.f4999d = interfaceC1293a;
        }

        @Override // androidx.fragment.app.Fragment.AbstractC1053m
        /* JADX INFO: renamed from: a */
        void mo4735a() {
            String strGenerateActivityResultKey = Fragment.this.generateActivityResultKey();
            this.f4997b.set(((AbstractC1296d) this.f4996a.apply(null)).m6603l(strGenerateActivityResultKey, Fragment.this, this.f4998c, this.f4999d));
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$j */
    static class C1050j {

        /* JADX INFO: renamed from: a */
        View f5001a;

        /* JADX INFO: renamed from: b */
        boolean f5002b;

        /* JADX INFO: renamed from: c */
        int f5003c;

        /* JADX INFO: renamed from: d */
        int f5004d;

        /* JADX INFO: renamed from: e */
        int f5005e;

        /* JADX INFO: renamed from: f */
        int f5006f;

        /* JADX INFO: renamed from: g */
        int f5007g;

        /* JADX INFO: renamed from: h */
        ArrayList f5008h;

        /* JADX INFO: renamed from: i */
        ArrayList f5009i;

        /* JADX INFO: renamed from: j */
        Object f5010j = null;

        /* JADX INFO: renamed from: k */
        Object f5011k;

        /* JADX INFO: renamed from: l */
        Object f5012l;

        /* JADX INFO: renamed from: m */
        Object f5013m;

        /* JADX INFO: renamed from: n */
        Object f5014n;

        /* JADX INFO: renamed from: o */
        Object f5015o;

        /* JADX INFO: renamed from: p */
        Boolean f5016p;

        /* JADX INFO: renamed from: q */
        Boolean f5017q;

        /* JADX INFO: renamed from: r */
        float f5018r;

        /* JADX INFO: renamed from: s */
        View f5019s;

        /* JADX INFO: renamed from: t */
        boolean f5020t;

        C1050j() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f5011k = obj;
            this.f5012l = null;
            this.f5013m = obj;
            this.f5014n = null;
            this.f5015o = obj;
            this.f5018r = 1.0f;
            this.f5019s = null;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$k */
    static class C1051k {
        /* JADX INFO: renamed from: a */
        static void m4740a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$l */
    public static class C1052l extends RuntimeException {
        public C1052l(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$m */
    private static abstract class AbstractC1053m {
        private AbstractC1053m() {
        }

        /* JADX INFO: renamed from: a */
        abstract void mo4735a();

        /* synthetic */ AbstractC1053m(RunnableC1042b runnableC1042b) {
            this();
        }
    }

    public Fragment() {
        m4726e();
    }

    /* JADX INFO: renamed from: a */
    private C1050j m4723a() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C1050j();
        }
        return this.mAnimationInfo;
    }

    /* JADX INFO: renamed from: b */
    private int m4724b() {
        AbstractC1126h.b bVar = this.mMaxState;
        return (bVar == AbstractC1126h.b.INITIALIZED || this.mParentFragment == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.mParentFragment.m4724b());
    }

    /* JADX INFO: renamed from: d */
    private Fragment m4725d(boolean z2) {
        String str;
        if (z2) {
            C0509c.m1860j(this);
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.m4830f0(str);
    }

    /* JADX INFO: renamed from: e */
    private void m4726e() {
        this.mLifecycleRegistry = new C1133o(this);
        this.mSavedStateRegistryController = C1889c.m9769a(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        m4728g(this.mSavedStateAttachListener);
    }

    /* JADX INFO: renamed from: f */
    private AbstractC1294b m4727f(AbstractC1307a abstractC1307a, InterfaceC2116a interfaceC2116a, InterfaceC1293a interfaceC1293a) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            m4728g(new C1049i(interfaceC2116a, atomicReference, abstractC1307a, interfaceC1293a));
            return new C1041a(atomicReference, abstractC1307a);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    /* JADX INFO: renamed from: g */
    private void m4728g(AbstractC1053m abstractC1053m) {
        if (this.mState >= 0) {
            abstractC1053m.mo4735a();
        } else {
            this.mOnPreAttachedListeners.add(abstractC1053m);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m4729h() {
        if (FragmentManager.m4744H0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    void callStartTransitionListener(boolean z2) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        C1050j c1050j = this.mAnimationInfo;
        if (c1050j != null) {
            c1050j.f5020t = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        AbstractC1038F abstractC1038FM4693n = AbstractC1038F.m4693n(viewGroup, fragmentManager);
        abstractC1038FM4693n.m4706p();
        if (z2) {
            this.mHost.m4964o().post(new RunnableC1045e(abstractC1038FM4693n));
        } else {
            abstractC1038FM4693n.m4701g();
        }
    }

    AbstractC1082j createFragmentContainer() {
        return new C1046f();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment fragmentM4725d = m4725d(false);
        if (fragmentM4725d != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragmentM4725d);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            AbstractC1145a.m5195b(this).mo5196a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.m4821X(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.m4838j0(str);
    }

    String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final AbstractActivityC1080h getActivity() {
        AbstractC1085m abstractC1085m = this.mHost;
        if (abstractC1085m == null) {
            return null;
        }
        return (AbstractActivityC1080h) abstractC1085m.m4962h();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C1050j c1050j = this.mAnimationInfo;
        if (c1050j == null || (bool = c1050j.f5017q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C1050j c1050j = this.mAnimationInfo;
        if (c1050j == null || (bool = c1050j.f5016p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    View getAnimatingAway() {
        C1050j c1050j = this.mAnimationInfo;
        if (c1050j == null) {
            return null;
        }
        return c1050j.f5001a;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        AbstractC1085m abstractC1085m = this.mHost;
        if (abstractC1085m == null) {
            return null;
        }
        return abstractC1085m.m4963m();
    }

    @Override // androidx.lifecycle.InterfaceC1125g
    public AbstractC0589a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && FragmentManager.m4744H0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C0592d c0592d = new C0592d();
        if (application != null) {
            c0592d.m2122c(C1106G.a.f5278g, application);
        }
        c0592d.m2122c(AbstractC1099A.f5249a, this);
        c0592d.m2122c(AbstractC1099A.f5250b, this);
        if (getArguments() != null) {
            c0592d.m2122c(AbstractC1099A.f5251c, getArguments());
        }
        return c0592d;
    }

    public C1106G.b getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && FragmentManager.m4744H0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new C1102D(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    int getEnterAnim() {
        C1050j c1050j = this.mAnimationInfo;
        if (c1050j == null) {
            return 0;
        }
        return c1050j.f5003c;
    }

    public Object getEnterTransition() {
        C1050j c1050j = this.mAnimationInfo;
        if (c1050j == null) {
            return null;
        }
        return c1050j.f5010j;
    }

    AbstractC2521t getEnterTransitionCallback() {
        C1050j c1050j = this.mAnimationInfo;
        if (c1050j == null) {
            return null;
        }
        c1050j.getClass();
        return null;
    }

    int getExitAnim() {
        C1050j c1050j = this.mAnimationInfo;
        if (c1050j == null) {
            return 0;
        }
        return c1050j.f5004d;
    }

    public Object getExitTransition() {
        C1050j c1050j = this.mAnimationInfo;
        if (c1050j == null) {
            return null;
        }
        return c1050j.f5012l;
    }

    AbstractC2521t getExitTransitionCallback() {
        C1050j c1050j = this.mAnimationInfo;
        if (c1050j == null) {
            return null;
        }
        c1050j.getClass();
        return null;
    }

    View getFocusedView() {
        C1050j c1050j = this.mAnimationInfo;
        if (c1050j == null) {
            return null;
        }
        return c1050j.f5019s;
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        AbstractC1085m abstractC1085m = this.mHost;
        if (abstractC1085m == null) {
            return null;
        }
        return abstractC1085m.mo4937u();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.InterfaceC1132n
    public AbstractC1126h getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public AbstractC1145a getLoaderManager() {
        return AbstractC1145a.m5195b(this);
    }

    int getNextTransition() {
        C1050j c1050j = this.mAnimationInfo;
        if (c1050j == null) {
            return 0;
        }
        return c1050j.f5007g;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    boolean getPopDirection() {
        C1050j c1050j = this.mAnimationInfo;
        if (c1050j == null) {
            return false;
        }
        return c1050j.f5002b;
    }

    int getPopEnterAnim() {
        C1050j c1050j = this.mAnimationInfo;
        if (c1050j == null) {
            return 0;
        }
        return c1050j.f5005e;
    }

    int getPopExitAnim() {
        C1050j c1050j = this.mAnimationInfo;
        if (c1050j == null) {
            return 0;
        }
        return c1050j.f5006f;
    }

    float getPostOnViewCreatedAlpha() {
        C1050j c1050j = this.mAnimationInfo;
        if (c1050j == null) {
            return 1.0f;
        }
        return c1050j.f5018r;
    }

    public Object getReenterTransition() {
        C1050j c1050j = this.mAnimationInfo;
        if (c1050j == null) {
            return null;
        }
        Object obj = c1050j.f5013m;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        C0509c.m1858h(this);
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        C1050j c1050j = this.mAnimationInfo;
        if (c1050j == null) {
            return null;
        }
        Object obj = c1050j.f5011k;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // p100f0.InterfaceC1890d
    public final C1240a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.m9770b();
    }

    public Object getSharedElementEnterTransition() {
        C1050j c1050j = this.mAnimationInfo;
        if (c1050j == null) {
            return null;
        }
        return c1050j.f5014n;
    }

    public Object getSharedElementReturnTransition() {
        C1050j c1050j = this.mAnimationInfo;
        if (c1050j == null) {
            return null;
        }
        Object obj = c1050j.f5015o;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        C1050j c1050j = this.mAnimationInfo;
        return (c1050j == null || (arrayList = c1050j.f5008h) == null) ? new ArrayList<>() : arrayList;
    }

    ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        C1050j c1050j = this.mAnimationInfo;
        return (c1050j == null || (arrayList = c1050j.f5009i) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i3) {
        return getResources().getString(i3);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return m4725d(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        C0509c.m1859i(this);
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i3) {
        return getResources().getText(i3);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public InterfaceC1132n getViewLifecycleOwner() {
        C1036D c1036d = this.mViewLifecycleOwner;
        if (c1036d != null) {
            return c1036d;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.InterfaceC1110K
    public C1109J getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m4724b() != AbstractC1126h.b.INITIALIZED.ordinal()) {
            return this.mFragmentManager.m4786C0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    void initState() {
        m4726e();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C1093u();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        return fragmentManager != null && fragmentManager.m4799K0(this.mParentFragment);
    }

    final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        return fragmentManager == null || fragmentManager.m4801L0(this.mParentFragment);
    }

    boolean isPostponed() {
        C1050j c1050j = this.mAnimationInfo;
        if (c1050j == null) {
            return false;
        }
        return c1050j.f5020t;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.m4806O0();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    void noteStateNotSaved() {
        this.mChildFragmentManager.m4815T0();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i3, int i4, Intent intent) {
        if (FragmentManager.m4744H0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i3 + " resultCode: " + i4 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        AbstractC1085m abstractC1085m = this.mHost;
        Activity activityM4962h = abstractC1085m == null ? null : abstractC1085m.m4962h();
        if (activityM4962h != null) {
            this.mCalled = false;
            onAttach(activityM4962h);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (this.mChildFragmentManager.m4804N0(1)) {
            return;
        }
        this.mChildFragmentManager.m4785C();
    }

    public Animation onCreateAnimation(int i3, boolean z2, int i4) {
        return null;
    }

    public Animator onCreateAnimator(int i3, boolean z2, int i4) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i3 = this.mContentLayoutId;
        if (i3 != 0) {
            return layoutInflater.inflate(i3, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z2) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        AbstractC1085m abstractC1085m = this.mHost;
        Activity activityM4962h = abstractC1085m == null ? null : abstractC1085m.m4962h();
        if (activityM4962h != null) {
            this.mCalled = false;
            onInflate(activityM4962h, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z2) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z2) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z2) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.m4815T0();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            m4729h();
            this.mChildFragmentManager.m4860y();
        } else {
            throw new C1072H("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    void performAttach() {
        ArrayList<AbstractC1053m> arrayList = this.mOnPreAttachedListeners;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            AbstractC1053m abstractC1053m = arrayList.get(i3);
            i3++;
            abstractC1053m.mo4735a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.m4845n(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.m4963m());
        if (this.mCalled) {
            this.mFragmentManager.m4796I(this);
            this.mChildFragmentManager.m4862z();
        } else {
            throw new C1072H("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m4784B(menuItem);
    }

    void performCreate(Bundle bundle) {
        this.mChildFragmentManager.m4815T0();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.mo5132a(new InterfaceC1130l() { // from class: androidx.fragment.app.Fragment.6
            @Override // androidx.lifecycle.InterfaceC1130l
            /* JADX INFO: renamed from: d */
            public void mo2537d(InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar) {
                View view;
                if (aVar != AbstractC1126h.a.ON_STOP || (view = Fragment.this.mView) == null) {
                    return;
                }
                C1051k.m4740a(view);
            }
        });
        this.mSavedStateRegistryController.m9772d(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.m5152h(AbstractC1126h.a.ON_CREATE);
            return;
        }
        throw new C1072H("Fragment " + this + " did not call through to super.onCreate()");
    }

    boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z2 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z2 = true;
        }
        return this.mChildFragmentManager.m4787D(menu, menuInflater) | z2;
    }

    void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.m4815T0();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C1036D(this, getViewModelStore());
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.m4685d()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
        } else {
            this.mViewLifecycleOwner.m4684b();
            AbstractC1111L.m5091a(this.mView, this.mViewLifecycleOwner);
            AbstractC1116M.m5112a(this.mView, this.mViewLifecycleOwner);
            AbstractC1891e.m9775a(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.mo5106i(this.mViewLifecycleOwner);
        }
    }

    void performDestroy() {
        this.mChildFragmentManager.m4789E();
        this.mLifecycleRegistry.m5152h(AbstractC1126h.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new C1072H("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void performDestroyView() {
        this.mChildFragmentManager.m4791F();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().mo5133b().m5141b(AbstractC1126h.b.CREATED)) {
            this.mViewLifecycleOwner.m4683a(AbstractC1126h.a.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            AbstractC1145a.m5195b(this).mo5197c();
            this.mPerformedCreateView = false;
        } else {
            throw new C1072H("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (this.mChildFragmentManager.m4794G0()) {
                return;
            }
            this.mChildFragmentManager.m4789E();
            this.mChildFragmentManager = new C1093u();
            return;
        }
        throw new C1072H("Fragment " + this + " did not call through to super.onDetach()");
    }

    LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    void performLowMemory() {
        onLowMemory();
    }

    void performMultiWindowModeChanged(boolean z2) {
        onMultiWindowModeChanged(z2);
    }

    boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m4798K(menuItem);
    }

    void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.m4800L(menu);
    }

    void performPause() {
        this.mChildFragmentManager.m4803N();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m4683a(AbstractC1126h.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.m5152h(AbstractC1126h.a.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new C1072H("Fragment " + this + " did not call through to super.onPause()");
    }

    void performPictureInPictureModeChanged(boolean z2) {
        onPictureInPictureModeChanged(z2);
    }

    boolean performPrepareOptionsMenu(Menu menu) {
        boolean z2 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z2 = true;
        }
        return this.mChildFragmentManager.m4807P(menu) | z2;
    }

    void performPrimaryNavigationFragmentChanged() {
        boolean zM4802M0 = this.mFragmentManager.m4802M0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zM4802M0) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zM4802M0);
            onPrimaryNavigationFragmentChanged(zM4802M0);
            this.mChildFragmentManager.m4809Q();
        }
    }

    void performResume() {
        this.mChildFragmentManager.m4815T0();
        this.mChildFragmentManager.m4826b0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new C1072H("Fragment " + this + " did not call through to super.onResume()");
        }
        C1133o c1133o = this.mLifecycleRegistry;
        AbstractC1126h.a aVar = AbstractC1126h.a.ON_RESUME;
        c1133o.m5152h(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m4683a(aVar);
        }
        this.mChildFragmentManager.m4811R();
    }

    void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m9773e(bundle);
        Bundle bundleM4833h1 = this.mChildFragmentManager.m4833h1();
        if (bundleM4833h1 != null) {
            bundle.putParcelable("android:support:fragments", bundleM4833h1);
        }
    }

    void performStart() {
        this.mChildFragmentManager.m4815T0();
        this.mChildFragmentManager.m4826b0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new C1072H("Fragment " + this + " did not call through to super.onStart()");
        }
        C1133o c1133o = this.mLifecycleRegistry;
        AbstractC1126h.a aVar = AbstractC1126h.a.ON_START;
        c1133o.m5152h(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m4683a(aVar);
        }
        this.mChildFragmentManager.m4813S();
    }

    void performStop() {
        this.mChildFragmentManager.m4816U();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m4683a(AbstractC1126h.a.ON_STOP);
        }
        this.mLifecycleRegistry.m5152h(AbstractC1126h.a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new C1072H("Fragment " + this + " did not call through to super.onStop()");
    }

    void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.m4818V();
    }

    public void postponeEnterTransition() {
        m4723a().f5020t = true;
    }

    public final <I, O> AbstractC1294b registerForActivityResult(AbstractC1307a abstractC1307a, InterfaceC1293a interfaceC1293a) {
        return m4727f(abstractC1307a, new C1047g(), interfaceC1293a);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i3) {
        if (this.mHost != null) {
            getParentFragmentManager().m4808P0(this, strArr, i3);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final AbstractActivityC1080h requireActivity() {
        AbstractActivityC1080h activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.mChildFragmentManager.m4831f1(parcelable);
        this.mChildFragmentManager.m4785C();
    }

    final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.m4686e(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.m4683a(AbstractC1126h.a.ON_CREATE);
            }
        } else {
            throw new C1072H("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z2) {
        m4723a().f5017q = Boolean.valueOf(z2);
    }

    public void setAllowReturnTransitionOverlap(boolean z2) {
        m4723a().f5016p = Boolean.valueOf(z2);
    }

    void setAnimations(int i3, int i4, int i5, int i6) {
        if (this.mAnimationInfo == null && i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) {
            return;
        }
        m4723a().f5003c = i3;
        m4723a().f5004d = i4;
        m4723a().f5005e = i5;
        m4723a().f5006f = i6;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(AbstractC2521t abstractC2521t) {
        m4723a().getClass();
    }

    public void setEnterTransition(Object obj) {
        m4723a().f5010j = obj;
    }

    public void setExitSharedElementCallback(AbstractC2521t abstractC2521t) {
        m4723a().getClass();
    }

    public void setExitTransition(Object obj) {
        m4723a().f5012l = obj;
    }

    void setFocusedView(View view) {
        m4723a().f5019s = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z2) {
        if (this.mHasMenu != z2) {
            this.mHasMenu = z2;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.mo4933A();
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (savedState == null || (bundle = savedState.f4983d) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z2) {
        if (this.mMenuVisible != z2) {
            this.mMenuVisible = z2;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo4933A();
            }
        }
    }

    void setNextTransition(int i3) {
        if (this.mAnimationInfo == null && i3 == 0) {
            return;
        }
        m4723a();
        this.mAnimationInfo.f5007g = i3;
    }

    void setPopDirection(boolean z2) {
        if (this.mAnimationInfo == null) {
            return;
        }
        m4723a().f5002b = z2;
    }

    void setPostOnViewCreatedAlpha(float f3) {
        m4723a().f5018r = f3;
    }

    public void setReenterTransition(Object obj) {
        m4723a().f5013m = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z2) {
        C0509c.m1861k(this);
        this.mRetainInstance = z2;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z2) {
            fragmentManager.m4842l(this);
        } else {
            fragmentManager.m4829d1(this);
        }
    }

    public void setReturnTransition(Object obj) {
        m4723a().f5011k = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        m4723a().f5014n = obj;
    }

    void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        m4723a();
        C1050j c1050j = this.mAnimationInfo;
        c1050j.f5008h = arrayList;
        c1050j.f5009i = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        m4723a().f5015o = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i3) {
        if (fragment != null) {
            C0509c.m1862l(this, fragment, i3);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        for (Fragment fragmentM4725d = fragment; fragmentM4725d != null; fragmentM4725d = fragmentM4725d.m4725d(false)) {
            if (fragmentM4725d.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i3;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z2) {
        C0509c.m1863m(this, z2);
        if (!this.mUserVisibleHint && z2 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.m4819V0(fragmentManager.m4856w(this));
        }
        this.mUserVisibleHint = z2;
        this.mDeferStart = this.mState < 5 && !z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z2);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        AbstractC1085m abstractC1085m = this.mHost;
        if (abstractC1085m != null) {
            return abstractC1085m.mo4939x(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i3) {
        startActivityForResult(intent, i3, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i3, Intent intent, int i4, int i5, int i6, Bundle bundle) {
        Bundle bundle2;
        if (this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (FragmentManager.m4744H0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" received the following in startIntentSenderForResult() requestCode: ");
            sb.append(i3);
            sb.append(" IntentSender: ");
            sb.append(intentSender);
            sb.append(" fillInIntent: ");
            sb.append(intent);
            sb.append(" options: ");
            bundle2 = bundle;
            sb.append(bundle2);
            Log.v("FragmentManager", sb.toString());
        } else {
            bundle2 = bundle;
        }
        getParentFragmentManager().m4812R0(this, intentSender, i3, intent, i4, i5, i6, bundle2);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !m4723a().f5020t) {
            return;
        }
        if (this.mHost == null) {
            m4723a().f5020t = false;
        } else if (Looper.myLooper() != this.mHost.m4964o().getLooper()) {
            this.mHost.m4964o().postAtFrontOfQueue(new RunnableC1044d());
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) AbstractC1084l.m4961d(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return fragment;
            }
            bundle.setClassLoader(fragment.getClass().getClassLoader());
            fragment.setArguments(bundle);
            return fragment;
        } catch (IllegalAccessException e3) {
            throw new C1052l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (InstantiationException e4) {
            throw new C1052l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (NoSuchMethodException e5) {
            throw new C1052l("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e5);
        } catch (InvocationTargetException e6) {
            throw new C1052l("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e6);
        }
    }

    public final String getString(int i3, Object... objArr) {
        return getResources().getString(i3, objArr);
    }

    public final void postponeEnterTransition(long j3, TimeUnit timeUnit) {
        m4723a().f5020t = true;
        FragmentManager fragmentManager = this.mFragmentManager;
        Handler handlerM4964o = fragmentManager != null ? fragmentManager.m4854u0().m4964o() : new Handler(Looper.getMainLooper());
        handlerM4964o.removeCallbacks(this.mPostponedDurationRunnable);
        handlerM4964o.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j3));
    }

    public final <I, O> AbstractC1294b registerForActivityResult(AbstractC1307a abstractC1307a, AbstractC1296d abstractC1296d, InterfaceC1293a interfaceC1293a) {
        return m4727f(abstractC1307a, new C1048h(abstractC1296d), interfaceC1293a);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        AbstractC1085m abstractC1085m = this.mHost;
        if (abstractC1085m != null) {
            abstractC1085m.m4966y(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i3, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().m4810Q0(this, intent, i3, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        AbstractC1085m abstractC1085m = this.mHost;
        if (abstractC1085m != null) {
            LayoutInflater layoutInflaterMo4938v = abstractC1085m.mo4938v();
            AbstractC0313u.m1063a(layoutInflaterMo4938v, this.mChildFragmentManager.m4855v0());
            return layoutInflaterMo4938v;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }
}
