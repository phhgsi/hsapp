package p020G1;

import p160w1.InterfaceC2495c;

/* JADX INFO: renamed from: G1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0181a {

    /* JADX INFO: renamed from: p */
    private static final C0181a f1138p = new a().m516a();

    /* JADX INFO: renamed from: a */
    private final long f1139a;

    /* JADX INFO: renamed from: b */
    private final String f1140b;

    /* JADX INFO: renamed from: c */
    private final String f1141c;

    /* JADX INFO: renamed from: d */
    private final c f1142d;

    /* JADX INFO: renamed from: e */
    private final d f1143e;

    /* JADX INFO: renamed from: f */
    private final String f1144f;

    /* JADX INFO: renamed from: g */
    private final String f1145g;

    /* JADX INFO: renamed from: h */
    private final int f1146h;

    /* JADX INFO: renamed from: i */
    private final int f1147i;

    /* JADX INFO: renamed from: j */
    private final String f1148j;

    /* JADX INFO: renamed from: k */
    private final long f1149k;

    /* JADX INFO: renamed from: l */
    private final b f1150l;

    /* JADX INFO: renamed from: m */
    private final String f1151m;

    /* JADX INFO: renamed from: n */
    private final long f1152n;

    /* JADX INFO: renamed from: o */
    private final String f1153o;

    /* JADX INFO: renamed from: G1.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private long f1154a = 0;

        /* JADX INFO: renamed from: b */
        private String f1155b = "";

        /* JADX INFO: renamed from: c */
        private String f1156c = "";

        /* JADX INFO: renamed from: d */
        private c f1157d = c.UNKNOWN;

        /* JADX INFO: renamed from: e */
        private d f1158e = d.UNKNOWN_OS;

        /* JADX INFO: renamed from: f */
        private String f1159f = "";

        /* JADX INFO: renamed from: g */
        private String f1160g = "";

        /* JADX INFO: renamed from: h */
        private int f1161h = 0;

        /* JADX INFO: renamed from: i */
        private int f1162i = 0;

        /* JADX INFO: renamed from: j */
        private String f1163j = "";

        /* JADX INFO: renamed from: k */
        private long f1164k = 0;

        /* JADX INFO: renamed from: l */
        private b f1165l = b.UNKNOWN_EVENT;

        /* JADX INFO: renamed from: m */
        private String f1166m = "";

        /* JADX INFO: renamed from: n */
        private long f1167n = 0;

        /* JADX INFO: renamed from: o */
        private String f1168o = "";

        a() {
        }

        /* JADX INFO: renamed from: a */
        public C0181a m516a() {
            return new C0181a(this.f1154a, this.f1155b, this.f1156c, this.f1157d, this.f1158e, this.f1159f, this.f1160g, this.f1161h, this.f1162i, this.f1163j, this.f1164k, this.f1165l, this.f1166m, this.f1167n, this.f1168o);
        }

        /* JADX INFO: renamed from: b */
        public a m517b(String str) {
            this.f1166m = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m518c(String str) {
            this.f1160g = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m519d(String str) {
            this.f1168o = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m520e(b bVar) {
            this.f1165l = bVar;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m521f(String str) {
            this.f1156c = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public a m522g(String str) {
            this.f1155b = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public a m523h(c cVar) {
            this.f1157d = cVar;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public a m524i(String str) {
            this.f1159f = str;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public a m525j(int i3) {
            this.f1161h = i3;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public a m526k(long j3) {
            this.f1154a = j3;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public a m527l(d dVar) {
            this.f1158e = dVar;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public a m528m(String str) {
            this.f1163j = str;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public a m529n(int i3) {
            this.f1162i = i3;
            return this;
        }
    }

    /* JADX INFO: renamed from: G1.a$b */
    public enum b implements InterfaceC2495c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* JADX INFO: renamed from: d */
        private final int f1173d;

        b(int i3) {
            this.f1173d = i3;
        }

        @Override // p160w1.InterfaceC2495c
        /* JADX INFO: renamed from: a */
        public int mo531a() {
            return this.f1173d;
        }
    }

    /* JADX INFO: renamed from: G1.a$c */
    public enum c implements InterfaceC2495c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* JADX INFO: renamed from: d */
        private final int f1179d;

        c(int i3) {
            this.f1179d = i3;
        }

        @Override // p160w1.InterfaceC2495c
        /* JADX INFO: renamed from: a */
        public int mo531a() {
            return this.f1179d;
        }
    }

    /* JADX INFO: renamed from: G1.a$d */
    public enum d implements InterfaceC2495c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* JADX INFO: renamed from: d */
        private final int f1185d;

        d(int i3) {
            this.f1185d = i3;
        }

        @Override // p160w1.InterfaceC2495c
        /* JADX INFO: renamed from: a */
        public int mo531a() {
            return this.f1185d;
        }
    }

    C0181a(long j3, String str, String str2, c cVar, d dVar, String str3, String str4, int i3, int i4, String str5, long j4, b bVar, String str6, long j5, String str7) {
        this.f1139a = j3;
        this.f1140b = str;
        this.f1141c = str2;
        this.f1142d = cVar;
        this.f1143e = dVar;
        this.f1144f = str3;
        this.f1145g = str4;
        this.f1146h = i3;
        this.f1147i = i4;
        this.f1148j = str5;
        this.f1149k = j4;
        this.f1150l = bVar;
        this.f1151m = str6;
        this.f1152n = j5;
        this.f1153o = str7;
    }

    /* JADX INFO: renamed from: p */
    public static a m500p() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    public String m501a() {
        return this.f1151m;
    }

    /* JADX INFO: renamed from: b */
    public long m502b() {
        return this.f1149k;
    }

    /* JADX INFO: renamed from: c */
    public long m503c() {
        return this.f1152n;
    }

    /* JADX INFO: renamed from: d */
    public String m504d() {
        return this.f1145g;
    }

    /* JADX INFO: renamed from: e */
    public String m505e() {
        return this.f1153o;
    }

    /* JADX INFO: renamed from: f */
    public b m506f() {
        return this.f1150l;
    }

    /* JADX INFO: renamed from: g */
    public String m507g() {
        return this.f1141c;
    }

    /* JADX INFO: renamed from: h */
    public String m508h() {
        return this.f1140b;
    }

    /* JADX INFO: renamed from: i */
    public c m509i() {
        return this.f1142d;
    }

    /* JADX INFO: renamed from: j */
    public String m510j() {
        return this.f1144f;
    }

    /* JADX INFO: renamed from: k */
    public int m511k() {
        return this.f1146h;
    }

    /* JADX INFO: renamed from: l */
    public long m512l() {
        return this.f1139a;
    }

    /* JADX INFO: renamed from: m */
    public d m513m() {
        return this.f1143e;
    }

    /* JADX INFO: renamed from: n */
    public String m514n() {
        return this.f1148j;
    }

    /* JADX INFO: renamed from: o */
    public int m515o() {
        return this.f1147i;
    }
}
