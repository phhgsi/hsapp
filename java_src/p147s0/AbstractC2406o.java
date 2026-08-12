package p147s0;

import android.util.SparseArray;
import p147s0.C2400i;

/* JADX INFO: renamed from: s0.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2406o {

    /* JADX INFO: renamed from: s0.o$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract AbstractC2406o mo11569a();

        /* JADX INFO: renamed from: b */
        public abstract a mo11570b(b bVar);

        /* JADX INFO: renamed from: c */
        public abstract a mo11571c(c cVar);
    }

    /* JADX INFO: renamed from: s0.o$b */
    public enum b {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);


        /* JADX INFO: renamed from: z */
        private static final SparseArray f11215z;

        /* JADX INFO: renamed from: d */
        private final int f11216d;

        static {
            b bVar = UNKNOWN_MOBILE_SUBTYPE;
            b bVar2 = GPRS;
            b bVar3 = EDGE;
            b bVar4 = UMTS;
            b bVar5 = CDMA;
            b bVar6 = EVDO_0;
            b bVar7 = EVDO_A;
            b bVar8 = RTT;
            b bVar9 = HSDPA;
            b bVar10 = HSUPA;
            b bVar11 = HSPA;
            b bVar12 = IDEN;
            b bVar13 = EVDO_B;
            b bVar14 = LTE;
            b bVar15 = EHRPD;
            b bVar16 = HSPAP;
            b bVar17 = GSM;
            b bVar18 = TD_SCDMA;
            b bVar19 = IWLAN;
            b bVar20 = LTE_CA;
            SparseArray sparseArray = new SparseArray();
            f11215z = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(1, bVar2);
            sparseArray.put(2, bVar3);
            sparseArray.put(3, bVar4);
            sparseArray.put(4, bVar5);
            sparseArray.put(5, bVar6);
            sparseArray.put(6, bVar7);
            sparseArray.put(7, bVar8);
            sparseArray.put(8, bVar9);
            sparseArray.put(9, bVar10);
            sparseArray.put(10, bVar11);
            sparseArray.put(11, bVar12);
            sparseArray.put(12, bVar13);
            sparseArray.put(13, bVar14);
            sparseArray.put(14, bVar15);
            sparseArray.put(15, bVar16);
            sparseArray.put(16, bVar17);
            sparseArray.put(17, bVar18);
            sparseArray.put(18, bVar19);
            sparseArray.put(19, bVar20);
        }

        b(int i3) {
            this.f11216d = i3;
        }

        /* JADX INFO: renamed from: a */
        public static b m11584a(int i3) {
            return (b) f11215z.get(i3);
        }

        /* JADX INFO: renamed from: b */
        public int m11585b() {
            return this.f11216d;
        }
    }

    /* JADX INFO: renamed from: s0.o$c */
    public enum c {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);


        /* JADX INFO: renamed from: x */
        private static final SparseArray f11236x;

        /* JADX INFO: renamed from: d */
        private final int f11238d;

        static {
            c cVar = MOBILE;
            c cVar2 = WIFI;
            c cVar3 = MOBILE_MMS;
            c cVar4 = MOBILE_SUPL;
            c cVar5 = MOBILE_DUN;
            c cVar6 = MOBILE_HIPRI;
            c cVar7 = WIMAX;
            c cVar8 = BLUETOOTH;
            c cVar9 = DUMMY;
            c cVar10 = ETHERNET;
            c cVar11 = MOBILE_FOTA;
            c cVar12 = MOBILE_IMS;
            c cVar13 = MOBILE_CBS;
            c cVar14 = WIFI_P2P;
            c cVar15 = MOBILE_IA;
            c cVar16 = MOBILE_EMERGENCY;
            c cVar17 = PROXY;
            c cVar18 = VPN;
            c cVar19 = NONE;
            SparseArray sparseArray = new SparseArray();
            f11236x = sparseArray;
            sparseArray.put(0, cVar);
            sparseArray.put(1, cVar2);
            sparseArray.put(2, cVar3);
            sparseArray.put(3, cVar4);
            sparseArray.put(4, cVar5);
            sparseArray.put(5, cVar6);
            sparseArray.put(6, cVar7);
            sparseArray.put(7, cVar8);
            sparseArray.put(8, cVar9);
            sparseArray.put(9, cVar10);
            sparseArray.put(10, cVar11);
            sparseArray.put(11, cVar12);
            sparseArray.put(12, cVar13);
            sparseArray.put(13, cVar14);
            sparseArray.put(14, cVar15);
            sparseArray.put(15, cVar16);
            sparseArray.put(16, cVar17);
            sparseArray.put(17, cVar18);
            sparseArray.put(-1, cVar19);
        }

        c(int i3) {
            this.f11238d = i3;
        }

        /* JADX INFO: renamed from: a */
        public static c m11586a(int i3) {
            return (c) f11236x.get(i3);
        }

        /* JADX INFO: renamed from: b */
        public int m11587b() {
            return this.f11238d;
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m11583a() {
        return new C2400i.b();
    }

    /* JADX INFO: renamed from: b */
    public abstract b mo11567b();

    /* JADX INFO: renamed from: c */
    public abstract c mo11568c();
}
