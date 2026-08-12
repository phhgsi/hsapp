package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.AbstractC0678F;
import androidx.activity.InterfaceC0681I;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.appcompat.app.AbstractC0740E;
import androidx.core.content.InterfaceC0967c;
import androidx.core.content.InterfaceC0968d;
import androidx.fragment.app.AbstractC1098z;
import androidx.lifecycle.AbstractC1126h;
import androidx.lifecycle.C1109J;
import androidx.lifecycle.InterfaceC1110K;
import androidx.lifecycle.InterfaceC1130l;
import androidx.lifecycle.InterfaceC1132n;
import androidx.savedstate.C1240a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p024I.InterfaceC0204a;
import p027J.InterfaceC0315v;
import p027J.InterfaceC0321y;
import p054S.AbstractC0503b;
import p057T.C0509c;
import p083b.AbstractC1294b;
import p083b.AbstractC1296d;
import p083b.InterfaceC1293a;
import p083b.InterfaceC1297e;
import p087c.AbstractC1307a;
import p087c.C1308b;
import p087c.C1310d;
import p100f0.InterfaceC1890d;
import p161x.C2510i;
import p161x.C2519r;
import p161x.InterfaceC2517p;
import p161x.InterfaceC2518q;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager {

    /* JADX INFO: renamed from: S */
    private static boolean f5026S = false;

    /* JADX INFO: renamed from: D */
    private AbstractC1294b f5030D;

    /* JADX INFO: renamed from: E */
    private AbstractC1294b f5031E;

    /* JADX INFO: renamed from: F */
    private AbstractC1294b f5032F;

    /* JADX INFO: renamed from: H */
    private boolean f5034H;

    /* JADX INFO: renamed from: I */
    private boolean f5035I;

    /* JADX INFO: renamed from: J */
    private boolean f5036J;

    /* JADX INFO: renamed from: K */
    private boolean f5037K;

    /* JADX INFO: renamed from: L */
    private boolean f5038L;

    /* JADX INFO: renamed from: M */
    private ArrayList f5039M;

    /* JADX INFO: renamed from: N */
    private ArrayList f5040N;

    /* JADX INFO: renamed from: O */
    private ArrayList f5041O;

    /* JADX INFO: renamed from: P */
    private C1094v f5042P;

    /* JADX INFO: renamed from: Q */
    private C0509c.c f5043Q;

    /* JADX INFO: renamed from: b */
    private boolean f5046b;

    /* JADX INFO: renamed from: d */
    ArrayList f5048d;

    /* JADX INFO: renamed from: e */
    private ArrayList f5049e;

    /* JADX INFO: renamed from: g */
    private OnBackPressedDispatcher f5051g;

    /* JADX INFO: renamed from: m */
    private ArrayList f5057m;

    /* JADX INFO: renamed from: v */
    private AbstractC1085m f5066v;

    /* JADX INFO: renamed from: w */
    private AbstractC1082j f5067w;

    /* JADX INFO: renamed from: x */
    private Fragment f5068x;

    /* JADX INFO: renamed from: y */
    Fragment f5069y;

    /* JADX INFO: renamed from: a */
    private final ArrayList f5045a = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final C1097y f5047c = new C1097y();

    /* JADX INFO: renamed from: f */
    private final LayoutInflaterFactory2C1086n f5050f = new LayoutInflaterFactory2C1086n(this);

    /* JADX INFO: renamed from: h */
    private final AbstractC0678F f5052h = new C1058b(false);

    /* JADX INFO: renamed from: i */
    private final AtomicInteger f5053i = new AtomicInteger();

    /* JADX INFO: renamed from: j */
    private final Map f5054j = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k */
    private final Map f5055k = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: l */
    private final Map f5056l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n */
    private final C1087o f5058n = new C1087o(this);

    /* JADX INFO: renamed from: o */
    private final CopyOnWriteArrayList f5059o = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: p */
    private final InterfaceC0204a f5060p = new InterfaceC0204a() { // from class: androidx.fragment.app.p
        @Override // p024I.InterfaceC0204a
        public final void accept(Object obj) {
            FragmentManager.m4759e(this.f5196a, (Configuration) obj);
        }
    };

    /* JADX INFO: renamed from: q */
    private final InterfaceC0204a f5061q = new InterfaceC0204a() { // from class: androidx.fragment.app.q
        @Override // p024I.InterfaceC0204a
        public final void accept(Object obj) {
            FragmentManager.m4752a(this.f5197a, (Integer) obj);
        }
    };

    /* JADX INFO: renamed from: r */
    private final InterfaceC0204a f5062r = new InterfaceC0204a() { // from class: androidx.fragment.app.r
        @Override // p024I.InterfaceC0204a
        public final void accept(Object obj) {
            FragmentManager.m4757d(this.f5198a, (C2510i) obj);
        }
    };

    /* JADX INFO: renamed from: s */
    private final InterfaceC0204a f5063s = new InterfaceC0204a() { // from class: androidx.fragment.app.s
        @Override // p024I.InterfaceC0204a
        public final void accept(Object obj) {
            FragmentManager.m4755c(this.f5199a, (C2519r) obj);
        }
    };

    /* JADX INFO: renamed from: t */
    private final InterfaceC0321y f5064t = new C1059c();

    /* JADX INFO: renamed from: u */
    int f5065u = -1;

    /* JADX INFO: renamed from: z */
    private AbstractC1084l f5070z = null;

    /* JADX INFO: renamed from: A */
    private AbstractC1084l f5027A = new C1060d();

    /* JADX INFO: renamed from: B */
    private InterfaceC1071G f5028B = null;

    /* JADX INFO: renamed from: C */
    private InterfaceC1071G f5029C = new C1061e();

    /* JADX INFO: renamed from: G */
    ArrayDeque f5033G = new ArrayDeque();

    /* JADX INFO: renamed from: R */
    private Runnable f5044R = new RunnableC1062f();

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$6 */
    class C10556 implements InterfaceC1130l {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f5071d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ AbstractC1126h f5072e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ FragmentManager f5073f;

        @Override // androidx.lifecycle.InterfaceC1130l
        /* JADX INFO: renamed from: d */
        public void mo2537d(InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar) {
            if (aVar == AbstractC1126h.a.ON_START && ((Bundle) this.f5073f.f5055k.get(this.f5071d)) != null) {
                throw null;
            }
            if (aVar == AbstractC1126h.a.ON_DESTROY) {
                this.f5072e.mo5134c(this);
                this.f5073f.f5056l.remove(this.f5071d);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$a */
    class C1057a implements InterfaceC1293a {
        C1057a() {
        }

        @Override // p083b.InterfaceC1293a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo4866a(Map map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                iArr[i3] = ((Boolean) arrayList.get(i3)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.f5033G.pollFirst();
            if (launchedFragmentInfo == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = launchedFragmentInfo.f5074d;
            int i4 = launchedFragmentInfo.f5075e;
            Fragment fragmentM5028i = FragmentManager.this.f5047c.m5028i(str);
            if (fragmentM5028i != null) {
                fragmentM5028i.onRequestPermissionsResult(i4, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$b */
    class C1058b extends AbstractC0678F {
        C1058b(boolean z2) {
            super(z2);
        }

        @Override // androidx.activity.AbstractC0678F
        /* JADX INFO: renamed from: d */
        public void mo2566d() {
            FragmentManager.this.m4788D0();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$c */
    class C1059c implements InterfaceC0321y {
        C1059c() {
        }

        @Override // p027J.InterfaceC0321y
        /* JADX INFO: renamed from: a */
        public boolean mo1159a(MenuItem menuItem) {
            return FragmentManager.this.m4798K(menuItem);
        }

        @Override // p027J.InterfaceC0321y
        /* JADX INFO: renamed from: b */
        public void mo1160b(Menu menu) {
            FragmentManager.this.m4800L(menu);
        }

        @Override // p027J.InterfaceC0321y
        /* JADX INFO: renamed from: c */
        public void mo1161c(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.m4787D(menu, menuInflater);
        }

        @Override // p027J.InterfaceC0321y
        /* JADX INFO: renamed from: d */
        public void mo1162d(Menu menu) {
            FragmentManager.this.m4807P(menu);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$d */
    class C1060d extends AbstractC1084l {
        C1060d() {
        }

        @Override // androidx.fragment.app.AbstractC1084l
        /* JADX INFO: renamed from: a */
        public Fragment mo4868a(ClassLoader classLoader, String str) {
            return FragmentManager.this.m4854u0().m4944b(FragmentManager.this.m4854u0().m4963m(), str, null);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$e */
    class C1061e implements InterfaceC1071G {
        C1061e() {
        }

        @Override // androidx.fragment.app.InterfaceC1071G
        /* JADX INFO: renamed from: a */
        public AbstractC1038F mo4869a(ViewGroup viewGroup) {
            return new C1074b(viewGroup);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$f */
    class RunnableC1062f implements Runnable {
        RunnableC1062f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.m4826b0(true);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$g */
    class C1063g implements InterfaceC1095w {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Fragment f5082a;

        C1063g(Fragment fragment) {
            this.f5082a = fragment;
        }

        @Override // androidx.fragment.app.InterfaceC1095w
        /* JADX INFO: renamed from: a */
        public void mo4870a(FragmentManager fragmentManager, Fragment fragment) {
            this.f5082a.onAttachFragment(fragment);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$h */
    class C1064h implements InterfaceC1293a {
        C1064h() {
        }

        @Override // p083b.InterfaceC1293a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo4866a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.f5033G.pollFirst();
            if (launchedFragmentInfo == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = launchedFragmentInfo.f5074d;
            int i3 = launchedFragmentInfo.f5075e;
            Fragment fragmentM5028i = FragmentManager.this.f5047c.m5028i(str);
            if (fragmentM5028i != null) {
                fragmentM5028i.onActivityResult(i3, activityResult.m2637d(), activityResult.m2636a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$i */
    class C1065i implements InterfaceC1293a {
        C1065i() {
        }

        @Override // p083b.InterfaceC1293a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo4866a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.f5033G.pollFirst();
            if (launchedFragmentInfo == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = launchedFragmentInfo.f5074d;
            int i3 = launchedFragmentInfo.f5075e;
            Fragment fragmentM5028i = FragmentManager.this.f5047c.m5028i(str);
            if (fragmentM5028i != null) {
                fragmentM5028i.onActivityResult(i3, activityResult.m2637d(), activityResult.m2636a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$j */
    static class C1066j extends AbstractC1307a {
        C1066j() {
        }

        @Override // p087c.AbstractC1307a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent mo4873a(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intentM2641a = intentSenderRequest.m2641a();
            if (intentM2641a != null && (bundleExtra = intentM2641a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intentM2641a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intentM2641a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.C0721a(intentSenderRequest.m2644f()).m2646b(null).m2647c(intentSenderRequest.m2643e(), intentSenderRequest.m2642d()).m2645a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.m4744H0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // p087c.AbstractC1307a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ActivityResult mo4874c(int i3, Intent intent) {
            return new ActivityResult(i3, intent);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$k */
    interface InterfaceC1067k {
        /* JADX INFO: renamed from: a */
        boolean mo4877a(ArrayList arrayList, ArrayList arrayList2);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$l */
    private class C1068l implements InterfaceC1067k {

        /* JADX INFO: renamed from: a */
        final String f5086a;

        /* JADX INFO: renamed from: b */
        final int f5087b;

        /* JADX INFO: renamed from: c */
        final int f5088c;

        C1068l(String str, int i3, int i4) {
            this.f5086a = str;
            this.f5087b = i3;
            this.f5088c = i4;
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC1067k
        /* JADX INFO: renamed from: a */
        public boolean mo4877a(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = FragmentManager.this.f5069y;
            if (fragment == null || this.f5087b >= 0 || this.f5086a != null || !fragment.getChildFragmentManager().m4822X0()) {
                return FragmentManager.this.m4825a1(arrayList, arrayList2, this.f5086a, this.f5087b, this.f5088c);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: B0 */
    static Fragment m4743B0(View view) {
        Object tag = view.getTag(AbstractC0503b.f1741a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: H0 */
    public static boolean m4744H0(int i3) {
        return f5026S || Log.isLoggable("FragmentManager", i3);
    }

    /* JADX INFO: renamed from: I0 */
    private boolean m4745I0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.m4850q();
    }

    /* JADX INFO: renamed from: J0 */
    private boolean m4746J0() {
        Fragment fragment = this.f5068x;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f5068x.getParentFragmentManager().m4746J0();
    }

    /* JADX INFO: renamed from: M */
    private void m4747M(Fragment fragment) {
        if (fragment == null || !fragment.equals(m4830f0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    /* JADX INFO: renamed from: T */
    private void m4748T(int i3) {
        try {
            this.f5046b = true;
            this.f5047c.m5023d(i3);
            m4814S0(i3, false);
            Iterator it = m4780u().iterator();
            while (it.hasNext()) {
                ((AbstractC1038F) it.next()).m4702j();
            }
            this.f5046b = false;
            m4826b0(true);
        } catch (Throwable th) {
            this.f5046b = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: W */
    private void m4749W() {
        if (this.f5038L) {
            this.f5038L = false;
            m4772o1();
        }
    }

    /* JADX INFO: renamed from: Y */
    private void m4750Y() {
        Iterator it = m4780u().iterator();
        while (it.hasNext()) {
            ((AbstractC1038F) it.next()).m4702j();
        }
    }

    /* JADX INFO: renamed from: Z0 */
    private boolean m4751Z0(String str, int i3, int i4) {
        m4826b0(false);
        m4753a0(true);
        Fragment fragment = this.f5069y;
        if (fragment != null && i3 < 0 && str == null && fragment.getChildFragmentManager().m4822X0()) {
            return true;
        }
        boolean zM4825a1 = m4825a1(this.f5039M, this.f5040N, str, i3, i4);
        if (zM4825a1) {
            this.f5046b = true;
            try {
                m4756c1(this.f5039M, this.f5040N);
            } finally {
                m4778s();
            }
        }
        m4775q1();
        m4749W();
        this.f5047c.m5021b();
        return zM4825a1;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m4752a(FragmentManager fragmentManager, Integer num) {
        if (fragmentManager.m4746J0() && num.intValue() == 80) {
            fragmentManager.m4793G(false);
        }
    }

    /* JADX INFO: renamed from: a0 */
    private void m4753a0(boolean z2) {
        if (this.f5046b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f5066v == null) {
            if (!this.f5037K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f5066v.m4964o().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2) {
            m4776r();
        }
        if (this.f5039M == null) {
            this.f5039M = new ArrayList();
            this.f5040N = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m4755c(FragmentManager fragmentManager, C2519r c2519r) {
        if (fragmentManager.m4746J0()) {
            fragmentManager.m4805O(c2519r.m12043a(), false);
        }
    }

    /* JADX INFO: renamed from: c1 */
    private void m4756c1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            if (!((C1073a) arrayList.get(i3)).f5238r) {
                if (i4 != i3) {
                    m4760e0(arrayList, arrayList2, i4, i3);
                }
                i4 = i3 + 1;
                if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                    while (i4 < size && ((Boolean) arrayList2.get(i4)).booleanValue() && !((C1073a) arrayList.get(i4)).f5238r) {
                        i4++;
                    }
                }
                m4760e0(arrayList, arrayList2, i3, i4);
                i3 = i4 - 1;
            }
            i3++;
        }
        if (i4 != size) {
            m4760e0(arrayList, arrayList2, i4, size);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m4757d(FragmentManager fragmentManager, C2510i c2510i) {
        if (fragmentManager.m4746J0()) {
            fragmentManager.m4795H(c2510i.m11925a(), false);
        }
    }

    /* JADX INFO: renamed from: d0 */
    private static void m4758d0(ArrayList arrayList, ArrayList arrayList2, int i3, int i4) {
        while (i3 < i4) {
            C1073a c1073a = (C1073a) arrayList.get(i3);
            if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                c1073a.m4889p(-1);
                c1073a.m4894u();
            } else {
                c1073a.m4889p(1);
                c1073a.m4893t();
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m4759e(FragmentManager fragmentManager, Configuration configuration) {
        if (fragmentManager.m4746J0()) {
            fragmentManager.m4782A(configuration, false);
        }
    }

    /* JADX INFO: renamed from: e0 */
    private void m4760e0(ArrayList arrayList, ArrayList arrayList2, int i3, int i4) {
        boolean z2 = ((C1073a) arrayList.get(i3)).f5238r;
        ArrayList arrayList3 = this.f5041O;
        if (arrayList3 == null) {
            this.f5041O = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f5041O.addAll(this.f5047c.m5034o());
        Fragment fragmentM4861y0 = m4861y0();
        boolean z3 = false;
        for (int i5 = i3; i5 < i4; i5++) {
            C1073a c1073a = (C1073a) arrayList.get(i5);
            fragmentM4861y0 = !((Boolean) arrayList2.get(i5)).booleanValue() ? c1073a.m4895v(this.f5041O, fragmentM4861y0) : c1073a.m4898y(this.f5041O, fragmentM4861y0);
            z3 = z3 || c1073a.f5229i;
        }
        this.f5041O.clear();
        if (!z2 && this.f5065u >= 1) {
            for (int i6 = i3; i6 < i4; i6++) {
                ArrayList arrayList4 = ((C1073a) arrayList.get(i6)).f5223c;
                int size = arrayList4.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList4.get(i7);
                    i7++;
                    Fragment fragment = ((AbstractC1098z.a) obj).f5241b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f5047c.m5037r(m4856w(fragment));
                    }
                }
            }
        }
        m4758d0(arrayList, arrayList2, i3, i4);
        boolean zBooleanValue = ((Boolean) arrayList2.get(i4 - 1)).booleanValue();
        for (int i8 = i3; i8 < i4; i8++) {
            C1073a c1073a2 = (C1073a) arrayList.get(i8);
            if (zBooleanValue) {
                for (int size2 = c1073a2.f5223c.size() - 1; size2 >= 0; size2--) {
                    Fragment fragment2 = ((AbstractC1098z.a) c1073a2.f5223c.get(size2)).f5241b;
                    if (fragment2 != null) {
                        m4856w(fragment2).m5009m();
                    }
                }
            } else {
                ArrayList arrayList5 = c1073a2.f5223c;
                int size3 = arrayList5.size();
                int i9 = 0;
                while (i9 < size3) {
                    Object obj2 = arrayList5.get(i9);
                    i9++;
                    Fragment fragment3 = ((AbstractC1098z.a) obj2).f5241b;
                    if (fragment3 != null) {
                        m4856w(fragment3).m5009m();
                    }
                }
            }
        }
        m4814S0(this.f5065u, true);
        for (AbstractC1038F abstractC1038F : m4781v(arrayList, i3, i4)) {
            abstractC1038F.m4707r(zBooleanValue);
            abstractC1038F.m4706p();
            abstractC1038F.m4701g();
        }
        while (i3 < i4) {
            C1073a c1073a3 = (C1073a) arrayList.get(i3);
            if (((Boolean) arrayList2.get(i3)).booleanValue() && c1073a3.f5113v >= 0) {
                c1073a3.f5113v = -1;
            }
            c1073a3.m4897x();
            i3++;
        }
        if (z3) {
            m4761e1();
        }
    }

    /* JADX INFO: renamed from: e1 */
    private void m4761e1() {
        ArrayList arrayList = this.f5057m;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        AbstractC0740E.m2693a(this.f5057m.get(0));
        throw null;
    }

    /* JADX INFO: renamed from: g0 */
    private int m4764g0(String str, int i3, boolean z2) {
        ArrayList arrayList = this.f5048d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i3 < 0) {
            if (z2) {
                return 0;
            }
            return this.f5048d.size() - 1;
        }
        int size = this.f5048d.size() - 1;
        while (size >= 0) {
            C1073a c1073a = (C1073a) this.f5048d.get(size);
            if ((str != null && str.equals(c1073a.m4896w())) || (i3 >= 0 && i3 == c1073a.f5113v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z2) {
            if (size == this.f5048d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C1073a c1073a2 = (C1073a) this.f5048d.get(size - 1);
            if ((str == null || !str.equals(c1073a2.m4896w())) && (i3 < 0 || i3 != c1073a2.f5113v)) {
                break;
            }
            size--;
        }
        return size;
    }

    /* JADX INFO: renamed from: g1 */
    static int m4765g1(int i3) {
        if (i3 == 4097) {
            return 8194;
        }
        if (i3 == 8194) {
            return 4097;
        }
        if (i3 == 8197) {
            return 4100;
        }
        if (i3 != 4099) {
            return i3 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    /* JADX INFO: renamed from: k0 */
    static FragmentManager m4767k0(View view) {
        AbstractActivityC1080h abstractActivityC1080h;
        Fragment fragmentM4768l0 = m4768l0(view);
        if (fragmentM4768l0 != null) {
            if (fragmentM4768l0.isAdded()) {
                return fragmentM4768l0.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + fragmentM4768l0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                abstractActivityC1080h = null;
                break;
            }
            if (context instanceof AbstractActivityC1080h) {
                abstractActivityC1080h = (AbstractActivityC1080h) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (abstractActivityC1080h != null) {
            return abstractActivityC1080h.m4929d0();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    /* JADX INFO: renamed from: l0 */
    private static Fragment m4768l0(View view) {
        while (view != null) {
            Fragment fragmentM4743B0 = m4743B0(view);
            if (fragmentM4743B0 != null) {
                return fragmentM4743B0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: m0 */
    private void m4769m0() {
        Iterator it = m4780u().iterator();
        while (it.hasNext()) {
            ((AbstractC1038F) it.next()).m4703k();
        }
    }

    /* JADX INFO: renamed from: m1 */
    private void m4770m1(Fragment fragment) {
        ViewGroup viewGroupM4777r0 = m4777r0(fragment);
        if (viewGroupM4777r0 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        int i3 = AbstractC0503b.f1743c;
        if (viewGroupM4777r0.getTag(i3) == null) {
            viewGroupM4777r0.setTag(i3, fragment);
        }
        ((Fragment) viewGroupM4777r0.getTag(i3)).setPopDirection(fragment.getPopDirection());
    }

    /* JADX INFO: renamed from: n0 */
    private boolean m4771n0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f5045a) {
            if (this.f5045a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f5045a.size();
                boolean zMo4877a = false;
                for (int i3 = 0; i3 < size; i3++) {
                    zMo4877a |= ((InterfaceC1067k) this.f5045a.get(i3)).mo4877a(arrayList, arrayList2);
                }
                return zMo4877a;
            } finally {
                this.f5045a.clear();
                this.f5066v.m4964o().removeCallbacks(this.f5044R);
            }
        }
    }

    /* JADX INFO: renamed from: o1 */
    private void m4772o1() {
        Iterator it = this.f5047c.m5030k().iterator();
        while (it.hasNext()) {
            m4819V0((C1096x) it.next());
        }
    }

    /* JADX INFO: renamed from: p0 */
    private C1094v m4773p0(Fragment fragment) {
        return this.f5042P.m4989k(fragment);
    }

    /* JADX INFO: renamed from: p1 */
    private void m4774p1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C1037E("FragmentManager"));
        AbstractC1085m abstractC1085m = this.f5066v;
        if (abstractC1085m != null) {
            try {
                abstractC1085m.mo4936t("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e3) {
                Log.e("FragmentManager", "Failed dumping state", e3);
                throw runtimeException;
            }
        }
        try {
            m4821X("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e4) {
            Log.e("FragmentManager", "Failed dumping state", e4);
            throw runtimeException;
        }
    }

    /* JADX INFO: renamed from: q1 */
    private void m4775q1() {
        synchronized (this.f5045a) {
            try {
                if (this.f5045a.isEmpty()) {
                    this.f5052h.m2572j(m4848o0() > 0 && m4802M0(this.f5068x));
                } else {
                    this.f5052h.m2572j(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    private void m4776r() {
        if (m4806O0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* JADX INFO: renamed from: r0 */
    private ViewGroup m4777r0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f5067w.mo4737g()) {
            View viewMo4736e = this.f5067w.mo4736e(fragment.mContainerId);
            if (viewMo4736e instanceof ViewGroup) {
                return (ViewGroup) viewMo4736e;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    private void m4778s() {
        this.f5046b = false;
        this.f5040N.clear();
        this.f5039M.clear();
    }

    /* JADX INFO: renamed from: t */
    private void m4779t() {
        AbstractC1085m abstractC1085m = this.f5066v;
        if (abstractC1085m instanceof InterfaceC1110K ? this.f5047c.m5035p().m4992o() : abstractC1085m.m4963m() instanceof Activity ? !((Activity) this.f5066v.m4963m()).isChangingConfigurations() : true) {
            Iterator it = this.f5054j.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((BackStackState) it.next()).f4939d.iterator();
                while (it2.hasNext()) {
                    this.f5047c.m5035p().m4987h((String) it2.next());
                }
            }
        }
    }

    /* JADX INFO: renamed from: u */
    private Set m4780u() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f5047c.m5030k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C1096x) it.next()).m5008k().mContainer;
            if (viewGroup != null) {
                hashSet.add(AbstractC1038F.m4694o(viewGroup, m4863z0()));
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: v */
    private Set m4781v(ArrayList arrayList, int i3, int i4) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i3 < i4) {
            ArrayList arrayList2 = ((C1073a) arrayList.get(i3)).f5223c;
            int size = arrayList2.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList2.get(i5);
                i5++;
                Fragment fragment = ((AbstractC1098z.a) obj).f5241b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(AbstractC1038F.m4693n(viewGroup, this));
                }
            }
            i3++;
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: A */
    void m4782A(Configuration configuration, boolean z2) {
        if (z2 && (this.f5066v instanceof InterfaceC0967c)) {
            m4774p1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.f5047c.m5034o()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z2) {
                    fragment.mChildFragmentManager.m4782A(configuration, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: A0 */
    public C0509c.c m4783A0() {
        return this.f5043Q;
    }

    /* JADX INFO: renamed from: B */
    boolean m4784B(MenuItem menuItem) {
        if (this.f5065u < 1) {
            return false;
        }
        for (Fragment fragment : this.f5047c.m5034o()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    void m4785C() {
        this.f5035I = false;
        this.f5036J = false;
        this.f5042P.m4994q(false);
        m4748T(1);
    }

    /* JADX INFO: renamed from: C0 */
    C1109J m4786C0(Fragment fragment) {
        return this.f5042P.m4991n(fragment);
    }

    /* JADX INFO: renamed from: D */
    boolean m4787D(Menu menu, MenuInflater menuInflater) {
        if (this.f5065u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (Fragment fragment : this.f5047c.m5034o()) {
            if (fragment != null && m4801L0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z2 = true;
            }
        }
        if (this.f5049e != null) {
            for (int i3 = 0; i3 < this.f5049e.size(); i3++) {
                Fragment fragment2 = (Fragment) this.f5049e.get(i3);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f5049e = arrayList;
        return z2;
    }

    /* JADX INFO: renamed from: D0 */
    void m4788D0() {
        m4826b0(true);
        if (this.f5052h.m2569g()) {
            m4822X0();
        } else {
            this.f5051g.m2607l();
        }
    }

    /* JADX INFO: renamed from: E */
    void m4789E() {
        this.f5037K = true;
        m4826b0(true);
        m4750Y();
        m4779t();
        m4748T(-1);
        Object obj = this.f5066v;
        if (obj instanceof InterfaceC0968d) {
            ((InterfaceC0968d) obj).mo2529f(this.f5061q);
        }
        Object obj2 = this.f5066v;
        if (obj2 instanceof InterfaceC0967c) {
            ((InterfaceC0967c) obj2).mo2534q(this.f5060p);
        }
        Object obj3 = this.f5066v;
        if (obj3 instanceof InterfaceC2517p) {
            ((InterfaceC2517p) obj3).mo2528d(this.f5062r);
        }
        Object obj4 = this.f5066v;
        if (obj4 instanceof InterfaceC2518q) {
            ((InterfaceC2518q) obj4).mo2533p(this.f5063s);
        }
        Object obj5 = this.f5066v;
        if (obj5 instanceof InterfaceC0315v) {
            ((InterfaceC0315v) obj5).mo1065k(this.f5064t);
        }
        this.f5066v = null;
        this.f5067w = null;
        this.f5068x = null;
        if (this.f5051g != null) {
            this.f5052h.m2570h();
            this.f5051g = null;
        }
        AbstractC1294b abstractC1294b = this.f5030D;
        if (abstractC1294b != null) {
            abstractC1294b.mo4734c();
            this.f5031E.mo4734c();
            this.f5032F.mo4734c();
        }
    }

    /* JADX INFO: renamed from: E0 */
    void m4790E0(Fragment fragment) {
        if (m4744H0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        m4770m1(fragment);
    }

    /* JADX INFO: renamed from: F */
    void m4791F() {
        m4748T(1);
    }

    /* JADX INFO: renamed from: F0 */
    void m4792F0(Fragment fragment) {
        if (fragment.mAdded && m4745I0(fragment)) {
            this.f5034H = true;
        }
    }

    /* JADX INFO: renamed from: G */
    void m4793G(boolean z2) {
        if (z2 && (this.f5066v instanceof InterfaceC0968d)) {
            m4774p1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.f5047c.m5034o()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z2) {
                    fragment.mChildFragmentManager.m4793G(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: G0 */
    public boolean m4794G0() {
        return this.f5037K;
    }

    /* JADX INFO: renamed from: H */
    void m4795H(boolean z2, boolean z3) {
        if (z3 && (this.f5066v instanceof InterfaceC2517p)) {
            m4774p1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.f5047c.m5034o()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z2);
                if (z3) {
                    fragment.mChildFragmentManager.m4795H(z2, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: I */
    void m4796I(Fragment fragment) {
        Iterator it = this.f5059o.iterator();
        while (it.hasNext()) {
            ((InterfaceC1095w) it.next()).mo4870a(this, fragment);
        }
    }

    /* JADX INFO: renamed from: J */
    void m4797J() {
        for (Fragment fragment : this.f5047c.m5031l()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.m4797J();
            }
        }
    }

    /* JADX INFO: renamed from: K */
    boolean m4798K(MenuItem menuItem) {
        if (this.f5065u < 1) {
            return false;
        }
        for (Fragment fragment : this.f5047c.m5034o()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: K0 */
    boolean m4799K0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    /* JADX INFO: renamed from: L */
    void m4800L(Menu menu) {
        if (this.f5065u < 1) {
            return;
        }
        for (Fragment fragment : this.f5047c.m5034o()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    /* JADX INFO: renamed from: L0 */
    boolean m4801L0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* JADX INFO: renamed from: M0 */
    boolean m4802M0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.m4861y0()) && m4802M0(fragmentManager.f5068x);
    }

    /* JADX INFO: renamed from: N */
    void m4803N() {
        m4748T(5);
    }

    /* JADX INFO: renamed from: N0 */
    boolean m4804N0(int i3) {
        return this.f5065u >= i3;
    }

    /* JADX INFO: renamed from: O */
    void m4805O(boolean z2, boolean z3) {
        if (z3 && (this.f5066v instanceof InterfaceC2518q)) {
            m4774p1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.f5047c.m5034o()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z2);
                if (z3) {
                    fragment.mChildFragmentManager.m4805O(z2, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: O0 */
    public boolean m4806O0() {
        return this.f5035I || this.f5036J;
    }

    /* JADX INFO: renamed from: P */
    boolean m4807P(Menu menu) {
        boolean z2 = false;
        if (this.f5065u < 1) {
            return false;
        }
        for (Fragment fragment : this.f5047c.m5034o()) {
            if (fragment != null && m4801L0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: P0 */
    void m4808P0(Fragment fragment, String[] strArr, int i3) {
        if (this.f5032F == null) {
            this.f5066v.m4965w(fragment, strArr, i3);
            return;
        }
        this.f5033G.addLast(new LaunchedFragmentInfo(fragment.mWho, i3));
        this.f5032F.m6590a(strArr);
    }

    /* JADX INFO: renamed from: Q */
    void m4809Q() {
        m4775q1();
        m4747M(this.f5069y);
    }

    /* JADX INFO: renamed from: Q0 */
    void m4810Q0(Fragment fragment, Intent intent, int i3, Bundle bundle) {
        if (this.f5030D == null) {
            this.f5066v.m4966y(fragment, intent, i3, bundle);
            return;
        }
        this.f5033G.addLast(new LaunchedFragmentInfo(fragment.mWho, i3));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f5030D.m6590a(intent);
    }

    /* JADX INFO: renamed from: R */
    void m4811R() {
        this.f5035I = false;
        this.f5036J = false;
        this.f5042P.m4994q(false);
        m4748T(7);
    }

    /* JADX INFO: renamed from: R0 */
    void m4812R0(Fragment fragment, IntentSender intentSender, int i3, Intent intent, int i4, int i5, int i6, Bundle bundle) {
        if (this.f5031E == null) {
            this.f5066v.m4967z(fragment, intentSender, i3, intent, i4, i5, i6, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (m4744H0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + fragment);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        IntentSenderRequest intentSenderRequestM2645a = new IntentSenderRequest.C0721a(intentSender).m2646b(intent).m2647c(i5, i4).m2645a();
        this.f5033G.addLast(new LaunchedFragmentInfo(fragment.mWho, i3));
        if (m4744H0(2)) {
            Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
        }
        this.f5031E.m6590a(intentSenderRequestM2645a);
    }

    /* JADX INFO: renamed from: S */
    void m4813S() {
        this.f5035I = false;
        this.f5036J = false;
        this.f5042P.m4994q(false);
        m4748T(5);
    }

    /* JADX INFO: renamed from: S0 */
    void m4814S0(int i3, boolean z2) {
        AbstractC1085m abstractC1085m;
        if (this.f5066v == null && i3 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i3 != this.f5065u) {
            this.f5065u = i3;
            this.f5047c.m5039t();
            m4772o1();
            if (this.f5034H && (abstractC1085m = this.f5066v) != null && this.f5065u == 7) {
                abstractC1085m.mo4933A();
                this.f5034H = false;
            }
        }
    }

    /* JADX INFO: renamed from: T0 */
    void m4815T0() {
        if (this.f5066v == null) {
            return;
        }
        this.f5035I = false;
        this.f5036J = false;
        this.f5042P.m4994q(false);
        for (Fragment fragment : this.f5047c.m5034o()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    /* JADX INFO: renamed from: U */
    void m4816U() {
        this.f5036J = true;
        this.f5042P.m4994q(true);
        m4748T(4);
    }

    /* JADX INFO: renamed from: U0 */
    void m4817U0(FragmentContainerView fragmentContainerView) {
        View view;
        for (C1096x c1096x : this.f5047c.m5030k()) {
            Fragment fragmentM5008k = c1096x.m5008k();
            if (fragmentM5008k.mContainerId == fragmentContainerView.getId() && (view = fragmentM5008k.mView) != null && view.getParent() == null) {
                fragmentM5008k.mContainer = fragmentContainerView;
                c1096x.m4999b();
            }
        }
    }

    /* JADX INFO: renamed from: V */
    void m4818V() {
        m4748T(2);
    }

    /* JADX INFO: renamed from: V0 */
    void m4819V0(C1096x c1096x) {
        Fragment fragmentM5008k = c1096x.m5008k();
        if (fragmentM5008k.mDeferStart) {
            if (this.f5046b) {
                this.f5038L = true;
            } else {
                fragmentM5008k.mDeferStart = false;
                c1096x.m5009m();
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    void m4820W0(int i3, int i4, boolean z2) {
        if (i3 >= 0) {
            m4824Z(new C1068l(null, i3, i4), z2);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i3);
    }

    /* JADX INFO: renamed from: X */
    public void m4821X(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f5047c.m5024e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f5049e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                Fragment fragment = (Fragment) this.f5049e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList arrayList2 = this.f5048d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                C1073a c1073a = (C1073a) this.f5048d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(c1073a.toString());
                c1073a.m4891r(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f5053i.get());
        synchronized (this.f5045a) {
            try {
                int size3 = this.f5045a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size3; i5++) {
                        InterfaceC1067k interfaceC1067k = (InterfaceC1067k) this.f5045a.get(i5);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.println(interfaceC1067k);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f5066v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f5067w);
        if (this.f5068x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f5068x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f5065u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f5035I);
        printWriter.print(" mStopped=");
        printWriter.print(this.f5036J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f5037K);
        if (this.f5034H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f5034H);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public boolean m4822X0() {
        return m4751Z0(null, -1, 0);
    }

    /* JADX INFO: renamed from: Y0 */
    public boolean m4823Y0(int i3, int i4) {
        if (i3 >= 0) {
            return m4751Z0(null, i3, i4);
        }
        throw new IllegalArgumentException("Bad id: " + i3);
    }

    /* JADX INFO: renamed from: Z */
    void m4824Z(InterfaceC1067k interfaceC1067k, boolean z2) {
        if (!z2) {
            if (this.f5066v == null) {
                if (!this.f5037K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            m4776r();
        }
        synchronized (this.f5045a) {
            try {
                if (this.f5066v == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f5045a.add(interfaceC1067k);
                    m4836i1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a1 */
    boolean m4825a1(ArrayList arrayList, ArrayList arrayList2, String str, int i3, int i4) {
        int iM4764g0 = m4764g0(str, i3, (i4 & 1) != 0);
        if (iM4764g0 < 0) {
            return false;
        }
        for (int size = this.f5048d.size() - 1; size >= iM4764g0; size--) {
            arrayList.add((C1073a) this.f5048d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: renamed from: b0 */
    boolean m4826b0(boolean z2) {
        m4753a0(z2);
        boolean z3 = false;
        while (m4771n0(this.f5039M, this.f5040N)) {
            z3 = true;
            this.f5046b = true;
            try {
                m4756c1(this.f5039M, this.f5040N);
            } finally {
                m4778s();
            }
        }
        m4775q1();
        m4749W();
        this.f5047c.m5021b();
        return z3;
    }

    /* JADX INFO: renamed from: b1 */
    void m4827b1(Fragment fragment) {
        if (m4744H0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        this.f5047c.m5040u(fragment);
        if (m4745I0(fragment)) {
            this.f5034H = true;
        }
        fragment.mRemoving = true;
        m4770m1(fragment);
    }

    /* JADX INFO: renamed from: c0 */
    void m4828c0(InterfaceC1067k interfaceC1067k, boolean z2) {
        if (z2 && (this.f5066v == null || this.f5037K)) {
            return;
        }
        m4753a0(z2);
        if (interfaceC1067k.mo4877a(this.f5039M, this.f5040N)) {
            this.f5046b = true;
            try {
                m4756c1(this.f5039M, this.f5040N);
            } finally {
                m4778s();
            }
        }
        m4775q1();
        m4749W();
        this.f5047c.m5021b();
    }

    /* JADX INFO: renamed from: d1 */
    void m4829d1(Fragment fragment) {
        this.f5042P.m4993p(fragment);
    }

    /* JADX INFO: renamed from: f0 */
    Fragment m4830f0(String str) {
        return this.f5047c.m5025f(str);
    }

    /* JADX INFO: renamed from: f1 */
    void m4831f1(Parcelable parcelable) {
        C1096x c1096x;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f5066v.m4963m().getClassLoader());
                this.f5055k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f5066v.m4963m().getClassLoader());
                arrayList.add((FragmentState) bundle.getParcelable("state"));
            }
        }
        this.f5047c.m5043x(arrayList);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        this.f5047c.m5041v();
        ArrayList arrayList2 = fragmentManagerState.f5090d;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            FragmentState fragmentStateM5019B = this.f5047c.m5019B((String) obj, null);
            if (fragmentStateM5019B != null) {
                Fragment fragmentM4988j = this.f5042P.m4988j(fragmentStateM5019B.f5099e);
                if (fragmentM4988j != null) {
                    if (m4744H0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragmentM4988j);
                    }
                    c1096x = new C1096x(this.f5058n, this.f5047c, fragmentM4988j, fragmentStateM5019B);
                } else {
                    c1096x = new C1096x(this.f5058n, this.f5047c, this.f5066v.m4963m().getClassLoader(), m4852s0(), fragmentStateM5019B);
                }
                Fragment fragmentM5008k = c1096x.m5008k();
                fragmentM5008k.mFragmentManager = this;
                if (m4744H0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragmentM5008k.mWho + "): " + fragmentM5008k);
                }
                c1096x.m5011o(this.f5066v.m4963m().getClassLoader());
                this.f5047c.m5037r(c1096x);
                c1096x.m5015t(this.f5065u);
            }
        }
        for (Fragment fragment : this.f5042P.m4990m()) {
            if (!this.f5047c.m5022c(fragment.mWho)) {
                if (m4744H0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + fragmentManagerState.f5090d);
                }
                this.f5042P.m4993p(fragment);
                fragment.mFragmentManager = this;
                C1096x c1096x2 = new C1096x(this.f5058n, this.f5047c, fragment);
                c1096x2.m5015t(1);
                c1096x2.m5009m();
                fragment.mRemoving = true;
                c1096x2.m5009m();
            }
        }
        this.f5047c.m5042w(fragmentManagerState.f5091e);
        if (fragmentManagerState.f5092f != null) {
            this.f5048d = new ArrayList(fragmentManagerState.f5092f.length);
            int i4 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f5092f;
                if (i4 >= backStackRecordStateArr.length) {
                    break;
                }
                C1073a c1073aM4672d = backStackRecordStateArr[i4].m4672d(this);
                if (m4744H0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i4 + " (index " + c1073aM4672d.f5113v + "): " + c1073aM4672d);
                    PrintWriter printWriter = new PrintWriter(new C1037E("FragmentManager"));
                    c1073aM4672d.m4892s("  ", printWriter, false);
                    printWriter.close();
                }
                this.f5048d.add(c1073aM4672d);
                i4++;
            }
        } else {
            this.f5048d = null;
        }
        this.f5053i.set(fragmentManagerState.f5093g);
        String str3 = fragmentManagerState.f5094h;
        if (str3 != null) {
            Fragment fragmentM4830f0 = m4830f0(str3);
            this.f5069y = fragmentM4830f0;
            m4747M(fragmentM4830f0);
        }
        ArrayList arrayList3 = fragmentManagerState.f5095i;
        if (arrayList3 != null) {
            for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                this.f5054j.put((String) arrayList3.get(i5), (BackStackState) fragmentManagerState.f5096j.get(i5));
            }
        }
        this.f5033G = new ArrayDeque(fragmentManagerState.f5097k);
    }

    /* JADX INFO: renamed from: h0 */
    public Fragment m4832h0(int i3) {
        return this.f5047c.m5026g(i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: h1 */
    public Bundle m4833h1() {
        BackStackRecordState[] backStackRecordStateArr;
        int size;
        Bundle bundle = new Bundle();
        m4769m0();
        m4750Y();
        m4826b0(true);
        this.f5035I = true;
        this.f5042P.m4994q(true);
        ArrayList arrayListM5044y = this.f5047c.m5044y();
        ArrayList arrayListM5032m = this.f5047c.m5032m();
        if (!arrayListM5032m.isEmpty()) {
            ArrayList arrayListM5045z = this.f5047c.m5045z();
            ArrayList arrayList = this.f5048d;
            int i3 = 0;
            if (arrayList == null || (size = arrayList.size()) <= 0) {
                backStackRecordStateArr = null;
            } else {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i4 = 0; i4 < size; i4++) {
                    backStackRecordStateArr[i4] = new BackStackRecordState((C1073a) this.f5048d.get(i4));
                    if (m4744H0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i4 + ": " + this.f5048d.get(i4));
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f5090d = arrayListM5044y;
            fragmentManagerState.f5091e = arrayListM5045z;
            fragmentManagerState.f5092f = backStackRecordStateArr;
            fragmentManagerState.f5093g = this.f5053i.get();
            Fragment fragment = this.f5069y;
            if (fragment != null) {
                fragmentManagerState.f5094h = fragment.mWho;
            }
            fragmentManagerState.f5095i.addAll(this.f5054j.keySet());
            fragmentManagerState.f5096j.addAll(this.f5054j.values());
            fragmentManagerState.f5097k = new ArrayList(this.f5033G);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.f5055k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f5055k.get(str));
            }
            int size2 = arrayListM5032m.size();
            while (i3 < size2) {
                Object obj = arrayListM5032m.get(i3);
                i3++;
                FragmentState fragmentState = (FragmentState) obj;
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", fragmentState);
                bundle.putBundle("fragment_" + fragmentState.f5099e, bundle2);
            }
        } else if (m4744H0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    /* JADX INFO: renamed from: i */
    void m4834i(C1073a c1073a) {
        if (this.f5048d == null) {
            this.f5048d = new ArrayList();
        }
        this.f5048d.add(c1073a);
    }

    /* JADX INFO: renamed from: i0 */
    public Fragment m4835i0(String str) {
        return this.f5047c.m5027h(str);
    }

    /* JADX INFO: renamed from: i1 */
    void m4836i1() {
        synchronized (this.f5045a) {
            try {
                if (this.f5045a.size() == 1) {
                    this.f5066v.m4964o().removeCallbacks(this.f5044R);
                    this.f5066v.m4964o().post(this.f5044R);
                    m4775q1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    C1096x m4837j(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            C0509c.m1856f(fragment, str);
        }
        if (m4744H0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        C1096x c1096xM4856w = m4856w(fragment);
        fragment.mFragmentManager = this;
        this.f5047c.m5037r(c1096xM4856w);
        if (!fragment.mDetached) {
            this.f5047c.m5020a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (m4745I0(fragment)) {
                this.f5034H = true;
            }
        }
        return c1096xM4856w;
    }

    /* JADX INFO: renamed from: j0 */
    Fragment m4838j0(String str) {
        return this.f5047c.m5028i(str);
    }

    /* JADX INFO: renamed from: j1 */
    void m4839j1(Fragment fragment, boolean z2) {
        ViewGroup viewGroupM4777r0 = m4777r0(fragment);
        if (viewGroupM4777r0 == null || !(viewGroupM4777r0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupM4777r0).setDrawDisappearingViewsLast(!z2);
    }

    /* JADX INFO: renamed from: k */
    public void m4840k(InterfaceC1095w interfaceC1095w) {
        this.f5059o.add(interfaceC1095w);
    }

    /* JADX INFO: renamed from: k1 */
    void m4841k1(Fragment fragment, AbstractC1126h.b bVar) {
        if (fragment.equals(m4830f0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: renamed from: l */
    void m4842l(Fragment fragment) {
        this.f5042P.m4985f(fragment);
    }

    /* JADX INFO: renamed from: l1 */
    void m4843l1(Fragment fragment) {
        if (fragment == null || (fragment.equals(m4830f0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f5069y;
            this.f5069y = fragment;
            m4747M(fragment2);
            m4747M(this.f5069y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: renamed from: m */
    int m4844m() {
        return this.f5053i.getAndIncrement();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    void m4845n(AbstractC1085m abstractC1085m, AbstractC1082j abstractC1082j, Fragment fragment) {
        String str;
        if (this.f5066v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f5066v = abstractC1085m;
        this.f5067w = abstractC1082j;
        this.f5068x = fragment;
        if (fragment != null) {
            m4840k(new C1063g(fragment));
        } else if (abstractC1085m instanceof InterfaceC1095w) {
            m4840k((InterfaceC1095w) abstractC1085m);
        }
        if (this.f5068x != null) {
            m4775q1();
        }
        if (abstractC1085m instanceof InterfaceC0681I) {
            InterfaceC0681I interfaceC0681I = (InterfaceC0681I) abstractC1085m;
            OnBackPressedDispatcher onBackPressedDispatcherMo2527c = interfaceC0681I.mo2527c();
            this.f5051g = onBackPressedDispatcherMo2527c;
            InterfaceC1132n interfaceC1132n = interfaceC0681I;
            if (fragment != null) {
                interfaceC1132n = fragment;
            }
            onBackPressedDispatcherMo2527c.m2605i(interfaceC1132n, this.f5052h);
        }
        if (fragment != null) {
            this.f5042P = fragment.mFragmentManager.m4773p0(fragment);
        } else if (abstractC1085m instanceof InterfaceC1110K) {
            this.f5042P = C1094v.m4983l(((InterfaceC1110K) abstractC1085m).getViewModelStore());
        } else {
            this.f5042P = new C1094v(false);
        }
        this.f5042P.m4994q(m4806O0());
        this.f5047c.m5018A(this.f5042P);
        Object obj = this.f5066v;
        if ((obj instanceof InterfaceC1890d) && fragment == null) {
            C1240a savedStateRegistry = ((InterfaceC1890d) obj).getSavedStateRegistry();
            savedStateRegistry.m6295h("android:support:fragments", new C1240a.c() { // from class: androidx.fragment.app.t
                @Override // androidx.savedstate.C1240a.c
                /* JADX INFO: renamed from: a */
                public final Bundle mo2629a() {
                    return this.f5200a.m4833h1();
                }
            });
            Bundle bundleM6290b = savedStateRegistry.m6290b("android:support:fragments");
            if (bundleM6290b != null) {
                m4831f1(bundleM6290b);
            }
        }
        Object obj2 = this.f5066v;
        if (obj2 instanceof InterfaceC1297e) {
            AbstractC1296d abstractC1296dMo2536s = ((InterfaceC1297e) obj2).mo2536s();
            if (fragment != null) {
                str = fragment.mWho + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f5030D = abstractC1296dMo2536s.m6604m(str2 + "StartActivityForResult", new C1310d(), new C1064h());
            this.f5031E = abstractC1296dMo2536s.m6604m(str2 + "StartIntentSenderForResult", new C1066j(), new C1065i());
            this.f5032F = abstractC1296dMo2536s.m6604m(str2 + "RequestPermissions", new C1308b(), new C1057a());
        }
        Object obj3 = this.f5066v;
        if (obj3 instanceof InterfaceC0967c) {
            ((InterfaceC0967c) obj3).mo2535r(this.f5060p);
        }
        Object obj4 = this.f5066v;
        if (obj4 instanceof InterfaceC0968d) {
            ((InterfaceC0968d) obj4).mo2530i(this.f5061q);
        }
        Object obj5 = this.f5066v;
        if (obj5 instanceof InterfaceC2517p) {
            ((InterfaceC2517p) obj5).mo2532l(this.f5062r);
        }
        Object obj6 = this.f5066v;
        if (obj6 instanceof InterfaceC2518q) {
            ((InterfaceC2518q) obj6).mo2531j(this.f5063s);
        }
        Object obj7 = this.f5066v;
        if ((obj7 instanceof InterfaceC0315v) && fragment == null) {
            ((InterfaceC0315v) obj7).mo1066n(this.f5064t);
        }
    }

    /* JADX INFO: renamed from: n1 */
    void m4846n1(Fragment fragment) {
        if (m4744H0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* JADX INFO: renamed from: o */
    void m4847o(Fragment fragment) {
        if (m4744H0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f5047c.m5020a(fragment);
            if (m4744H0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (m4745I0(fragment)) {
                this.f5034H = true;
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public int m4848o0() {
        ArrayList arrayList = this.f5048d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public AbstractC1098z m4849p() {
        return new C1073a(this);
    }

    /* JADX INFO: renamed from: q */
    boolean m4850q() {
        boolean zM4745I0 = false;
        for (Fragment fragment : this.f5047c.m5031l()) {
            if (fragment != null) {
                zM4745I0 = m4745I0(fragment);
            }
            if (zM4745I0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q0 */
    AbstractC1082j m4851q0() {
        return this.f5067w;
    }

    /* JADX INFO: renamed from: s0 */
    public AbstractC1084l m4852s0() {
        AbstractC1084l abstractC1084l = this.f5070z;
        if (abstractC1084l != null) {
            return abstractC1084l;
        }
        Fragment fragment = this.f5068x;
        return fragment != null ? fragment.mFragmentManager.m4852s0() : this.f5027A;
    }

    /* JADX INFO: renamed from: t0 */
    public List m4853t0() {
        return this.f5047c.m5034o();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f5068x;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f5068x)));
            sb.append("}");
        } else {
            AbstractC1085m abstractC1085m = this.f5066v;
            if (abstractC1085m != null) {
                sb.append(abstractC1085m.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f5066v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u0 */
    public AbstractC1085m m4854u0() {
        return this.f5066v;
    }

    /* JADX INFO: renamed from: v0 */
    LayoutInflater.Factory2 m4855v0() {
        return this.f5050f;
    }

    /* JADX INFO: renamed from: w */
    C1096x m4856w(Fragment fragment) {
        C1096x c1096xM5033n = this.f5047c.m5033n(fragment.mWho);
        if (c1096xM5033n != null) {
            return c1096xM5033n;
        }
        C1096x c1096x = new C1096x(this.f5058n, this.f5047c, fragment);
        c1096x.m5011o(this.f5066v.m4963m().getClassLoader());
        c1096x.m5015t(this.f5065u);
        return c1096x;
    }

    /* JADX INFO: renamed from: w0 */
    C1087o m4857w0() {
        return this.f5058n;
    }

    /* JADX INFO: renamed from: x */
    void m4858x(Fragment fragment) {
        if (m4744H0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (m4744H0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f5047c.m5040u(fragment);
            if (m4745I0(fragment)) {
                this.f5034H = true;
            }
            m4770m1(fragment);
        }
    }

    /* JADX INFO: renamed from: x0 */
    Fragment m4859x0() {
        return this.f5068x;
    }

    /* JADX INFO: renamed from: y */
    void m4860y() {
        this.f5035I = false;
        this.f5036J = false;
        this.f5042P.m4994q(false);
        m4748T(4);
    }

    /* JADX INFO: renamed from: y0 */
    public Fragment m4861y0() {
        return this.f5069y;
    }

    /* JADX INFO: renamed from: z */
    void m4862z() {
        this.f5035I = false;
        this.f5036J = false;
        this.f5042P.m4994q(false);
        m4748T(0);
    }

    /* JADX INFO: renamed from: z0 */
    InterfaceC1071G m4863z0() {
        InterfaceC1071G interfaceC1071G = this.f5028B;
        if (interfaceC1071G != null) {
            return interfaceC1071G;
        }
        Fragment fragment = this.f5068x;
        return fragment != null ? fragment.mFragmentManager.m4863z0() : this.f5029C;
    }

    static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new C1056a();

        /* JADX INFO: renamed from: d */
        String f5074d;

        /* JADX INFO: renamed from: e */
        int f5075e;

        /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$a */
        class C1056a implements Parcelable.Creator {
            C1056a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo[] newArray(int i3) {
                return new LaunchedFragmentInfo[i3];
            }
        }

        LaunchedFragmentInfo(String str, int i3) {
            this.f5074d = str;
            this.f5075e = i3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            parcel.writeString(this.f5074d);
            parcel.writeInt(this.f5075e);
        }

        LaunchedFragmentInfo(Parcel parcel) {
            this.f5074d = parcel.readString();
            this.f5075e = parcel.readInt();
        }
    }
}
