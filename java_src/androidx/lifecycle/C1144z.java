package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.appcompat.app.AbstractC0740E;
import androidx.savedstate.C1240a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p012E.AbstractC0107d;
import p035L1.AbstractC0385q;
import p038M1.AbstractC0397C;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: androidx.lifecycle.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1144z {

    /* JADX INFO: renamed from: f */
    public static final a f5382f = new a(null);

    /* JADX INFO: renamed from: g */
    private static final Class[] f5383g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a */
    private final Map f5384a;

    /* JADX INFO: renamed from: b */
    private final Map f5385b;

    /* JADX INFO: renamed from: c */
    private final Map f5386c;

    /* JADX INFO: renamed from: d */
    private final Map f5387d;

    /* JADX INFO: renamed from: e */
    private final C1240a.c f5388e;

    /* JADX INFO: renamed from: androidx.lifecycle.z$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0602g abstractC0602g) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1144z m5193a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new C1144z();
                }
                HashMap map = new HashMap();
                for (String str : bundle2.keySet()) {
                    AbstractC0606k.m2144d(str, "key");
                    map.put(str, bundle2.get(str));
                }
                return new C1144z(map);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = parcelableArrayList.get(i3);
                AbstractC0606k.m2143c(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i3));
            }
            return new C1144z(linkedHashMap);
        }

        /* JADX INFO: renamed from: b */
        public final boolean m5194b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : C1144z.f5383g) {
                AbstractC0606k.m2142b(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        private a() {
        }
    }

    public C1144z(Map map) {
        AbstractC0606k.m2145e(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f5384a = linkedHashMap;
        this.f5385b = new LinkedHashMap();
        this.f5386c = new LinkedHashMap();
        this.f5387d = new LinkedHashMap();
        this.f5388e = new C1240a.c() { // from class: androidx.lifecycle.y
            @Override // androidx.savedstate.C1240a.c
            /* JADX INFO: renamed from: a */
            public final Bundle mo2629a() {
                return C1144z.m5190d(this.f5381a);
            }
        };
        linkedHashMap.putAll(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final Bundle m5190d(C1144z c1144z) {
        AbstractC0606k.m2145e(c1144z, "this$0");
        for (Map.Entry entry : AbstractC0397C.m1403i(c1144z.f5385b).entrySet()) {
            c1144z.m5192e((String) entry.getKey(), ((C1240a.c) entry.getValue()).mo2629a());
        }
        Set<String> setKeySet = c1144z.f5384a.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(c1144z.f5384a.get(str));
        }
        return AbstractC0107d.m326a(AbstractC0385q.m1378a("keys", arrayList), AbstractC0385q.m1378a("values", arrayList2));
    }

    /* JADX INFO: renamed from: c */
    public final C1240a.c m5191c() {
        return this.f5388e;
    }

    /* JADX INFO: renamed from: e */
    public final void m5192e(String str, Object obj) {
        AbstractC0606k.m2145e(str, "key");
        if (!f5382f.m5194b(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            AbstractC0606k.m2142b(obj);
            sb.append(obj.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj2 = this.f5386c.get(str);
        C1136r c1136r = obj2 instanceof C1136r ? (C1136r) obj2 : null;
        if (c1136r != null) {
            c1136r.mo5106i(obj);
        } else {
            this.f5384a.put(str, obj);
        }
        AbstractC0740E.m2693a(this.f5387d.get(str));
    }

    public C1144z() {
        this.f5384a = new LinkedHashMap();
        this.f5385b = new LinkedHashMap();
        this.f5386c = new LinkedHashMap();
        this.f5387d = new LinkedHashMap();
        this.f5388e = new C1240a.c() { // from class: androidx.lifecycle.y
            @Override // androidx.savedstate.C1240a.c
            /* JADX INFO: renamed from: a */
            public final Bundle mo2629a() {
                return C1144z.m5190d(this.f5381a);
            }
        };
    }
}
