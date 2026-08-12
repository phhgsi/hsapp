package p021H;

import android.text.SpannableStringBuilder;
import com.google.android.gms.common.ConnectionResult;
import java.util.Locale;

/* JADX INFO: renamed from: H.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0183a {

    /* JADX INFO: renamed from: d */
    static final InterfaceC0196n f1189d;

    /* JADX INFO: renamed from: e */
    private static final String f1190e;

    /* JADX INFO: renamed from: f */
    private static final String f1191f;

    /* JADX INFO: renamed from: g */
    static final C0183a f1192g;

    /* JADX INFO: renamed from: h */
    static final C0183a f1193h;

    /* JADX INFO: renamed from: a */
    private final boolean f1194a;

    /* JADX INFO: renamed from: b */
    private final int f1195b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0196n f1196c;

    /* JADX INFO: renamed from: H.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private boolean f1197a;

        /* JADX INFO: renamed from: b */
        private int f1198b;

        /* JADX INFO: renamed from: c */
        private InterfaceC0196n f1199c;

        public a() {
            m551c(C0183a.m542e(Locale.getDefault()));
        }

        /* JADX INFO: renamed from: b */
        private static C0183a m550b(boolean z2) {
            return z2 ? C0183a.f1193h : C0183a.f1192g;
        }

        /* JADX INFO: renamed from: c */
        private void m551c(boolean z2) {
            this.f1197a = z2;
            this.f1199c = C0183a.f1189d;
            this.f1198b = 2;
        }

        /* JADX INFO: renamed from: a */
        public C0183a m552a() {
            return (this.f1198b == 2 && this.f1199c == C0183a.f1189d) ? m550b(this.f1197a) : new C0183a(this.f1197a, this.f1198b, this.f1199c);
        }
    }

    /* JADX INFO: renamed from: H.a$b */
    private static class b {

        /* JADX INFO: renamed from: f */
        private static final byte[] f1200f = new byte[1792];

        /* JADX INFO: renamed from: a */
        private final CharSequence f1201a;

        /* JADX INFO: renamed from: b */
        private final boolean f1202b;

        /* JADX INFO: renamed from: c */
        private final int f1203c;

        /* JADX INFO: renamed from: d */
        private int f1204d;

        /* JADX INFO: renamed from: e */
        private char f1205e;

        static {
            for (int i3 = 0; i3 < 1792; i3++) {
                f1200f[i3] = Character.getDirectionality(i3);
            }
        }

        b(CharSequence charSequence, boolean z2) {
            this.f1201a = charSequence;
            this.f1202b = z2;
            this.f1203c = charSequence.length();
        }

        /* JADX INFO: renamed from: c */
        private static byte m553c(char c3) {
            return c3 < 1792 ? f1200f[c3] : Character.getDirectionality(c3);
        }

        /* JADX INFO: renamed from: f */
        private byte m554f() {
            char cCharAt;
            int i3 = this.f1204d;
            do {
                int i4 = this.f1204d;
                if (i4 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f1201a;
                int i5 = i4 - 1;
                this.f1204d = i5;
                cCharAt = charSequence.charAt(i5);
                this.f1205e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f1204d = i3;
            this.f1205e = ';';
            return (byte) 13;
        }

        /* JADX INFO: renamed from: g */
        private byte m555g() {
            char cCharAt;
            do {
                int i3 = this.f1204d;
                if (i3 >= this.f1203c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f1201a;
                this.f1204d = i3 + 1;
                cCharAt = charSequence.charAt(i3);
                this.f1205e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        /* JADX INFO: renamed from: h */
        private byte m556h() {
            char cCharAt;
            int i3 = this.f1204d;
            while (true) {
                int i4 = this.f1204d;
                if (i4 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f1201a;
                int i5 = i4 - 1;
                this.f1204d = i5;
                char cCharAt2 = charSequence.charAt(i5);
                this.f1205e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i6 = this.f1204d;
                        if (i6 > 0) {
                            CharSequence charSequence2 = this.f1201a;
                            int i7 = i6 - 1;
                            this.f1204d = i7;
                            cCharAt = charSequence2.charAt(i7);
                            this.f1205e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f1204d = i3;
            this.f1205e = '>';
            return (byte) 13;
        }

        /* JADX INFO: renamed from: i */
        private byte m557i() {
            char cCharAt;
            int i3 = this.f1204d;
            while (true) {
                int i4 = this.f1204d;
                if (i4 >= this.f1203c) {
                    this.f1204d = i3;
                    this.f1205e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f1201a;
                this.f1204d = i4 + 1;
                char cCharAt2 = charSequence.charAt(i4);
                this.f1205e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i5 = this.f1204d;
                        if (i5 < this.f1203c) {
                            CharSequence charSequence2 = this.f1201a;
                            this.f1204d = i5 + 1;
                            cCharAt = charSequence2.charAt(i5);
                            this.f1205e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        byte m558a() {
            char cCharAt = this.f1201a.charAt(this.f1204d - 1);
            this.f1205e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f1201a, this.f1204d);
                this.f1204d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f1204d--;
            byte bM553c = m553c(this.f1205e);
            if (!this.f1202b) {
                return bM553c;
            }
            char c3 = this.f1205e;
            return c3 == '>' ? m556h() : c3 == ';' ? m554f() : bM553c;
        }

        /* JADX INFO: renamed from: b */
        byte m559b() {
            char cCharAt = this.f1201a.charAt(this.f1204d);
            this.f1205e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f1201a, this.f1204d);
                this.f1204d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f1204d++;
            byte bM553c = m553c(this.f1205e);
            if (!this.f1202b) {
                return bM553c;
            }
            char c3 = this.f1205e;
            return c3 == '<' ? m557i() : c3 == '&' ? m555g() : bM553c;
        }

        /* JADX INFO: renamed from: d */
        int m560d() {
            this.f1204d = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (this.f1204d < this.f1203c && i3 == 0) {
                byte bM559b = m559b();
                if (bM559b != 0) {
                    if (bM559b == 1 || bM559b == 2) {
                        if (i5 == 0) {
                            return 1;
                        }
                    } else if (bM559b != 9) {
                        switch (bM559b) {
                            case 14:
                            case 15:
                                i5++;
                                i4 = -1;
                                continue;
                            case 16:
                            case 17:
                                i5++;
                                i4 = 1;
                                continue;
                            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                                i5--;
                                i4 = 0;
                                continue;
                        }
                    }
                } else if (i5 == 0) {
                    return -1;
                }
                i3 = i5;
            }
            if (i3 == 0) {
                return 0;
            }
            if (i4 != 0) {
                return i4;
            }
            while (this.f1204d > 0) {
                switch (m558a()) {
                    case 14:
                    case 15:
                        if (i3 == i5) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i3 == i5) {
                            return 1;
                        }
                        break;
                    case ConnectionResult.SERVICE_UPDATING /* 18 */:
                        i5++;
                        continue;
                }
                i5--;
            }
            return 0;
        }

        /* JADX INFO: renamed from: e */
        int m561e() {
            this.f1204d = this.f1203c;
            int i3 = 0;
            while (true) {
                int i4 = i3;
                while (this.f1204d > 0) {
                    byte bM558a = m558a();
                    if (bM558a == 0) {
                        if (i3 == 0) {
                            return -1;
                        }
                        if (i4 == 0) {
                            break;
                        }
                    } else if (bM558a == 1 || bM558a == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                        if (i4 == 0) {
                            break;
                        }
                    } else if (bM558a != 9) {
                        switch (bM558a) {
                            case 14:
                            case 15:
                                if (i4 == i3) {
                                    return -1;
                                }
                                i3--;
                                break;
                            case 16:
                            case 17:
                                if (i4 == i3) {
                                    return 1;
                                }
                                i3--;
                                break;
                            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                                i3++;
                                break;
                            default:
                                if (i4 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        }
    }

    static {
        InterfaceC0196n interfaceC0196n = AbstractC0197o.f1217c;
        f1189d = interfaceC0196n;
        f1190e = Character.toString((char) 8206);
        f1191f = Character.toString((char) 8207);
        f1192g = new C0183a(false, 2, interfaceC0196n);
        f1193h = new C0183a(true, 2, interfaceC0196n);
    }

    C0183a(boolean z2, int i3, InterfaceC0196n interfaceC0196n) {
        this.f1194a = z2;
        this.f1195b = i3;
        this.f1196c = interfaceC0196n;
    }

    /* JADX INFO: renamed from: a */
    private static int m539a(CharSequence charSequence) {
        return new b(charSequence, false).m560d();
    }

    /* JADX INFO: renamed from: b */
    private static int m540b(CharSequence charSequence) {
        return new b(charSequence, false).m561e();
    }

    /* JADX INFO: renamed from: c */
    public static C0183a m541c() {
        return new a().m552a();
    }

    /* JADX INFO: renamed from: e */
    static boolean m542e(Locale locale) {
        return AbstractC0198p.m588a(locale) == 1;
    }

    /* JADX INFO: renamed from: f */
    private String m543f(CharSequence charSequence, InterfaceC0196n interfaceC0196n) {
        boolean zMo582a = interfaceC0196n.mo582a(charSequence, 0, charSequence.length());
        return (this.f1194a || !(zMo582a || m540b(charSequence) == 1)) ? this.f1194a ? (!zMo582a || m540b(charSequence) == -1) ? f1191f : "" : "" : f1190e;
    }

    /* JADX INFO: renamed from: g */
    private String m544g(CharSequence charSequence, InterfaceC0196n interfaceC0196n) {
        boolean zMo582a = interfaceC0196n.mo582a(charSequence, 0, charSequence.length());
        return (this.f1194a || !(zMo582a || m539a(charSequence) == 1)) ? this.f1194a ? (!zMo582a || m539a(charSequence) == -1) ? f1191f : "" : "" : f1190e;
    }

    /* JADX INFO: renamed from: d */
    public boolean m545d() {
        return (this.f1195b & 2) != 0;
    }

    /* JADX INFO: renamed from: h */
    public CharSequence m546h(CharSequence charSequence) {
        return m547i(charSequence, this.f1196c, true);
    }

    /* JADX INFO: renamed from: i */
    public CharSequence m547i(CharSequence charSequence, InterfaceC0196n interfaceC0196n, boolean z2) {
        if (charSequence == null) {
            return null;
        }
        boolean zMo582a = interfaceC0196n.mo582a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m545d() && z2) {
            spannableStringBuilder.append((CharSequence) m544g(charSequence, zMo582a ? AbstractC0197o.f1216b : AbstractC0197o.f1215a));
        }
        if (zMo582a != this.f1194a) {
            spannableStringBuilder.append(zMo582a ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z2) {
            spannableStringBuilder.append((CharSequence) m543f(charSequence, zMo582a ? AbstractC0197o.f1216b : AbstractC0197o.f1215a));
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: j */
    public String m548j(String str) {
        return m549k(str, this.f1196c, true);
    }

    /* JADX INFO: renamed from: k */
    public String m549k(String str, InterfaceC0196n interfaceC0196n, boolean z2) {
        if (str == null) {
            return null;
        }
        return m547i(str, interfaceC0196n, z2).toString();
    }
}
