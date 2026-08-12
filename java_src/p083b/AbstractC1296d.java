package p083b;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.AbstractC1126h;
import androidx.lifecycle.InterfaceC1130l;
import androidx.lifecycle.InterfaceC1132n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import p012E.AbstractC0106c;
import p068W1.InterfaceC0566a;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;
import p071X1.AbstractC0607l;
import p071X1.AbstractC0616u;
import p077Z1.AbstractC0653c;
import p087c.AbstractC1307a;
import p094d2.AbstractC1821g;
import p161x.AbstractC2504c;

/* JADX INFO: renamed from: b.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1296d {

    /* JADX INFO: renamed from: h */
    private static final b f6338h = new b(null);

    /* JADX INFO: renamed from: a */
    private final Map f6339a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    private final Map f6340b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    private final Map f6341c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    private final List f6342d = new ArrayList();

    /* JADX INFO: renamed from: e */
    private final transient Map f6343e = new LinkedHashMap();

    /* JADX INFO: renamed from: f */
    private final Map f6344f = new LinkedHashMap();

    /* JADX INFO: renamed from: g */
    private final Bundle f6345g = new Bundle();

    /* JADX INFO: renamed from: b.d$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private final InterfaceC1293a f6346a;

        /* JADX INFO: renamed from: b */
        private final AbstractC1307a f6347b;

        public a(InterfaceC1293a interfaceC1293a, AbstractC1307a abstractC1307a) {
            AbstractC0606k.m2145e(interfaceC1293a, "callback");
            AbstractC0606k.m2145e(abstractC1307a, "contract");
            this.f6346a = interfaceC1293a;
            this.f6347b = abstractC1307a;
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC1293a m6606a() {
            return this.f6346a;
        }

        /* JADX INFO: renamed from: b */
        public final AbstractC1307a m6607b() {
            return this.f6347b;
        }
    }

    /* JADX INFO: renamed from: b.d$b */
    private static final class b {
        public /* synthetic */ b(AbstractC0602g abstractC0602g) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: b.d$c */
    private static final class c {

        /* JADX INFO: renamed from: a */
        private final AbstractC1126h f6348a;

        /* JADX INFO: renamed from: b */
        private final List f6349b;

        public c(AbstractC1126h abstractC1126h) {
            AbstractC0606k.m2145e(abstractC1126h, "lifecycle");
            this.f6348a = abstractC1126h;
            this.f6349b = new ArrayList();
        }

        /* JADX INFO: renamed from: a */
        public final void m6608a(InterfaceC1130l interfaceC1130l) {
            AbstractC0606k.m2145e(interfaceC1130l, "observer");
            this.f6348a.mo5132a(interfaceC1130l);
            this.f6349b.add(interfaceC1130l);
        }

        /* JADX INFO: renamed from: b */
        public final void m6609b() {
            Iterator it = this.f6349b.iterator();
            while (it.hasNext()) {
                this.f6348a.mo5134c((InterfaceC1130l) it.next());
            }
            this.f6349b.clear();
        }
    }

    /* JADX INFO: renamed from: b.d$d */
    static final class d extends AbstractC0607l implements InterfaceC0566a {

        /* JADX INFO: renamed from: e */
        public static final d f6350e = new d();

        d() {
            super(0);
        }

        @Override // p068W1.InterfaceC0566a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Integer mo464a() {
            return Integer.valueOf(AbstractC0653c.f2340d.mo2487b(2147418112) + 65536);
        }
    }

    /* JADX INFO: renamed from: b.d$e */
    public static final class e extends AbstractC1294b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f6352b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ AbstractC1307a f6353c;

        e(String str, AbstractC1307a abstractC1307a) {
            this.f6352b = str;
            this.f6353c = abstractC1307a;
        }

        @Override // p083b.AbstractC1294b
        /* JADX INFO: renamed from: b */
        public void mo4733b(Object obj, AbstractC2504c abstractC2504c) throws Exception {
            Object obj2 = AbstractC1296d.this.f6340b.get(this.f6352b);
            AbstractC1307a abstractC1307a = this.f6353c;
            if (obj2 != null) {
                int iIntValue = ((Number) obj2).intValue();
                AbstractC1296d.this.f6342d.add(this.f6352b);
                try {
                    AbstractC1296d.this.mo2550i(iIntValue, this.f6353c, obj, abstractC2504c);
                    return;
                } catch (Exception e3) {
                    AbstractC1296d.this.f6342d.remove(this.f6352b);
                    throw e3;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC1307a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // p083b.AbstractC1294b
        /* JADX INFO: renamed from: c */
        public void mo4734c() {
            AbstractC1296d.this.m6605p(this.f6352b);
        }
    }

    /* JADX INFO: renamed from: b.d$f */
    public static final class f extends AbstractC1294b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f6355b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ AbstractC1307a f6356c;

        f(String str, AbstractC1307a abstractC1307a) {
            this.f6355b = str;
            this.f6356c = abstractC1307a;
        }

        @Override // p083b.AbstractC1294b
        /* JADX INFO: renamed from: b */
        public void mo4733b(Object obj, AbstractC2504c abstractC2504c) throws Exception {
            Object obj2 = AbstractC1296d.this.f6340b.get(this.f6355b);
            AbstractC1307a abstractC1307a = this.f6356c;
            if (obj2 != null) {
                int iIntValue = ((Number) obj2).intValue();
                AbstractC1296d.this.f6342d.add(this.f6355b);
                try {
                    AbstractC1296d.this.mo2550i(iIntValue, this.f6356c, obj, abstractC2504c);
                    return;
                } catch (Exception e3) {
                    AbstractC1296d.this.f6342d.remove(this.f6355b);
                    throw e3;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC1307a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // p083b.AbstractC1294b
        /* JADX INFO: renamed from: c */
        public void mo4734c() {
            AbstractC1296d.this.m6605p(this.f6355b);
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m6594d(int i3, String str) {
        this.f6339a.put(Integer.valueOf(i3), str);
        this.f6340b.put(str, Integer.valueOf(i3));
    }

    /* JADX INFO: renamed from: g */
    private final void m6595g(String str, int i3, Intent intent, a aVar) {
        if ((aVar != null ? aVar.m6606a() : null) == null || !this.f6342d.contains(str)) {
            this.f6344f.remove(str);
            this.f6345g.putParcelable(str, new ActivityResult(i3, intent));
        } else {
            aVar.m6606a().mo4866a(aVar.m6607b().mo4874c(i3, intent));
            this.f6342d.remove(str);
        }
    }

    /* JADX INFO: renamed from: h */
    private final int m6596h() {
        for (Number number : AbstractC1821g.m9595k(d.f6350e)) {
            if (!this.f6339a.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m6597n(AbstractC1296d abstractC1296d, String str, InterfaceC1293a interfaceC1293a, AbstractC1307a abstractC1307a, InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar) {
        AbstractC0606k.m2145e(abstractC1296d, "this$0");
        AbstractC0606k.m2145e(str, "$key");
        AbstractC0606k.m2145e(interfaceC1293a, "$callback");
        AbstractC0606k.m2145e(abstractC1307a, "$contract");
        AbstractC0606k.m2145e(interfaceC1132n, "<anonymous parameter 0>");
        AbstractC0606k.m2145e(aVar, "event");
        if (AbstractC1126h.a.ON_START != aVar) {
            if (AbstractC1126h.a.ON_STOP == aVar) {
                abstractC1296d.f6343e.remove(str);
                return;
            } else {
                if (AbstractC1126h.a.ON_DESTROY == aVar) {
                    abstractC1296d.m6605p(str);
                    return;
                }
                return;
            }
        }
        abstractC1296d.f6343e.put(str, new a(interfaceC1293a, abstractC1307a));
        if (abstractC1296d.f6344f.containsKey(str)) {
            Object obj = abstractC1296d.f6344f.get(str);
            abstractC1296d.f6344f.remove(str);
            interfaceC1293a.mo4866a(obj);
        }
        ActivityResult activityResult = (ActivityResult) AbstractC0106c.m324a(abstractC1296d.f6345g, str, ActivityResult.class);
        if (activityResult != null) {
            abstractC1296d.f6345g.remove(str);
            interfaceC1293a.mo4866a(abstractC1307a.mo4874c(activityResult.m2637d(), activityResult.m2636a()));
        }
    }

    /* JADX INFO: renamed from: o */
    private final void m6598o(String str) {
        if (((Integer) this.f6340b.get(str)) != null) {
            return;
        }
        m6594d(m6596h(), str);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m6599e(int i3, int i4, Intent intent) {
        String str = (String) this.f6339a.get(Integer.valueOf(i3));
        if (str == null) {
            return false;
        }
        m6595g(str, i4, intent, (a) this.f6343e.get(str));
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m6600f(int i3, Object obj) {
        String str = (String) this.f6339a.get(Integer.valueOf(i3));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f6343e.get(str);
        if ((aVar != null ? aVar.m6606a() : null) == null) {
            this.f6345g.remove(str);
            this.f6344f.put(str, obj);
            return true;
        }
        InterfaceC1293a interfaceC1293aM6606a = aVar.m6606a();
        AbstractC0606k.m2143c(interfaceC1293aM6606a, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.f6342d.remove(str)) {
            return true;
        }
        interfaceC1293aM6606a.mo4866a(obj);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo2550i(int i3, AbstractC1307a abstractC1307a, Object obj, AbstractC2504c abstractC2504c);

    /* JADX INFO: renamed from: j */
    public final void m6601j(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.f6342d.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle2 != null) {
            this.f6345g.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            String str = stringArrayList.get(i3);
            if (this.f6340b.containsKey(str)) {
                Integer num = (Integer) this.f6340b.remove(str);
                if (!this.f6345g.containsKey(str)) {
                    AbstractC0616u.m2167a(this.f6339a).remove(num);
                }
            }
            Integer num2 = integerArrayList.get(i3);
            AbstractC0606k.m2144d(num2, "rcs[i]");
            int iIntValue = num2.intValue();
            String str2 = stringArrayList.get(i3);
            AbstractC0606k.m2144d(str2, "keys[i]");
            m6594d(iIntValue, str2);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m6602k(Bundle bundle) {
        AbstractC0606k.m2145e(bundle, "outState");
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f6340b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f6340b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f6342d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.f6345g));
    }

    /* JADX INFO: renamed from: l */
    public final AbstractC1294b m6603l(final String str, InterfaceC1132n interfaceC1132n, final AbstractC1307a abstractC1307a, final InterfaceC1293a interfaceC1293a) {
        AbstractC0606k.m2145e(str, "key");
        AbstractC0606k.m2145e(interfaceC1132n, "lifecycleOwner");
        AbstractC0606k.m2145e(abstractC1307a, "contract");
        AbstractC0606k.m2145e(interfaceC1293a, "callback");
        AbstractC1126h lifecycle = interfaceC1132n.getLifecycle();
        if (lifecycle.mo5133b().m5141b(AbstractC1126h.b.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + interfaceC1132n + " is attempting to register while current state is " + lifecycle.mo5133b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        m6598o(str);
        c cVar = (c) this.f6341c.get(str);
        if (cVar == null) {
            cVar = new c(lifecycle);
        }
        cVar.m6608a(new InterfaceC1130l() { // from class: b.c
            @Override // androidx.lifecycle.InterfaceC1130l
            /* JADX INFO: renamed from: d */
            public final void mo2537d(InterfaceC1132n interfaceC1132n2, AbstractC1126h.a aVar) {
                AbstractC1296d.m6597n(this.f6334d, str, interfaceC1293a, abstractC1307a, interfaceC1132n2, aVar);
            }
        });
        this.f6341c.put(str, cVar);
        return new e(str, abstractC1307a);
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC1294b m6604m(String str, AbstractC1307a abstractC1307a, InterfaceC1293a interfaceC1293a) {
        AbstractC0606k.m2145e(str, "key");
        AbstractC0606k.m2145e(abstractC1307a, "contract");
        AbstractC0606k.m2145e(interfaceC1293a, "callback");
        m6598o(str);
        this.f6343e.put(str, new a(interfaceC1293a, abstractC1307a));
        if (this.f6344f.containsKey(str)) {
            Object obj = this.f6344f.get(str);
            this.f6344f.remove(str);
            interfaceC1293a.mo4866a(obj);
        }
        ActivityResult activityResult = (ActivityResult) AbstractC0106c.m324a(this.f6345g, str, ActivityResult.class);
        if (activityResult != null) {
            this.f6345g.remove(str);
            interfaceC1293a.mo4866a(abstractC1307a.mo4874c(activityResult.m2637d(), activityResult.m2636a()));
        }
        return new f(str, abstractC1307a);
    }

    /* JADX INFO: renamed from: p */
    public final void m6605p(String str) {
        Integer num;
        AbstractC0606k.m2145e(str, "key");
        if (!this.f6342d.contains(str) && (num = (Integer) this.f6340b.remove(str)) != null) {
            this.f6339a.remove(num);
        }
        this.f6343e.remove(str);
        if (this.f6344f.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f6344f.get(str));
            this.f6344f.remove(str);
        }
        if (this.f6345g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((ActivityResult) AbstractC0106c.m324a(this.f6345g, str, ActivityResult.class)));
            this.f6345g.remove(str);
        }
        c cVar = (c) this.f6341c.get(str);
        if (cVar != null) {
            cVar.m6609b();
            this.f6341c.remove(str);
        }
    }
}
