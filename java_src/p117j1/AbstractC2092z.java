package p117j1;

import java.util.Map;
import p113i1.InterfaceC2030c;

/* JADX INFO: renamed from: j1.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2092z {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: j1.z$a */
    private static abstract class a implements InterfaceC2030c {

        /* JADX INFO: renamed from: d */
        public static final a f9773d = new C2632a("KEY", 0);

        /* JADX INFO: renamed from: e */
        public static final a f9774e = new b("VALUE", 1);

        /* JADX INFO: renamed from: f */
        private static final /* synthetic */ a[] f9775f = m10477a();

        /* JADX INFO: renamed from: j1.z$a$a, reason: collision with other inner class name */
        enum C2632a extends a {
            C2632a(String str, int i3) {
                super(str, i3, null);
            }

            @Override // p113i1.InterfaceC2030c
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        }

        /* JADX INFO: renamed from: j1.z$a$b */
        enum b extends a {
            b(String str, int i3) {
                super(str, i3, null);
            }

            @Override // p113i1.InterfaceC2030c
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        }

        private a(String str, int i3) {
        }

        /* JADX INFO: renamed from: a */
        private static /* synthetic */ a[] m10477a() {
            return new a[]{f9773d, f9774e};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f9775f.clone();
        }

        /* synthetic */ a(String str, int i3, AbstractC2091y abstractC2091y) {
            this(str, i3);
        }
    }

    /* JADX INFO: renamed from: a */
    static boolean m10473a(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    static InterfaceC2030c m10474b() {
        return a.f9773d;
    }

    /* JADX INFO: renamed from: c */
    static String m10475c(Map map) {
        StringBuilder sbM10332a = AbstractC2074h.m10332a(map.size());
        sbM10332a.append('{');
        boolean z2 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z2) {
                sbM10332a.append(", ");
            }
            sbM10332a.append(entry.getKey());
            sbM10332a.append('=');
            sbM10332a.append(entry.getValue());
            z2 = false;
        }
        sbM10332a.append('}');
        return sbM10332a.toString();
    }

    /* JADX INFO: renamed from: d */
    static InterfaceC2030c m10476d() {
        return a.f9774e;
    }
}
