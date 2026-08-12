package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;
import p140q.C2346a;
import p152u.AbstractC2454a;
import p152u.AbstractC2455b;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.e */
/* JADX INFO: loaded from: classes.dex */
public class C0943e {

    /* JADX INFO: renamed from: f */
    private static final int[] f4002f = {0, 4, 8};

    /* JADX INFO: renamed from: g */
    private static SparseIntArray f4003g = new SparseIntArray();

    /* JADX INFO: renamed from: h */
    private static SparseIntArray f4004h = new SparseIntArray();

    /* JADX INFO: renamed from: a */
    public String f4005a = "";

    /* JADX INFO: renamed from: b */
    public int f4006b = 0;

    /* JADX INFO: renamed from: c */
    private HashMap f4007c = new HashMap();

    /* JADX INFO: renamed from: d */
    private boolean f4008d = true;

    /* JADX INFO: renamed from: e */
    private HashMap f4009e = new HashMap();

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        int f4010a;

        /* JADX INFO: renamed from: b */
        String f4011b;

        /* JADX INFO: renamed from: c */
        public final d f4012c = new d();

        /* JADX INFO: renamed from: d */
        public final c f4013d = new c();

        /* JADX INFO: renamed from: e */
        public final b f4014e = new b();

        /* JADX INFO: renamed from: f */
        public final e f4015f = new e();

        /* JADX INFO: renamed from: g */
        public HashMap f4016g = new HashMap();

        /* JADX INFO: renamed from: h */
        C2610a f4017h;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.e$a$a, reason: collision with other inner class name */
        static class C2610a {

            /* JADX INFO: renamed from: a */
            int[] f4018a = new int[10];

            /* JADX INFO: renamed from: b */
            int[] f4019b = new int[10];

            /* JADX INFO: renamed from: c */
            int f4020c = 0;

            /* JADX INFO: renamed from: d */
            int[] f4021d = new int[10];

            /* JADX INFO: renamed from: e */
            float[] f4022e = new float[10];

            /* JADX INFO: renamed from: f */
            int f4023f = 0;

            /* JADX INFO: renamed from: g */
            int[] f4024g = new int[5];

            /* JADX INFO: renamed from: h */
            String[] f4025h = new String[5];

            /* JADX INFO: renamed from: i */
            int f4026i = 0;

            /* JADX INFO: renamed from: j */
            int[] f4027j = new int[4];

            /* JADX INFO: renamed from: k */
            boolean[] f4028k = new boolean[4];

            /* JADX INFO: renamed from: l */
            int f4029l = 0;

            C2610a() {
            }

            /* JADX INFO: renamed from: a */
            void m4073a(int i3, float f3) {
                int i4 = this.f4023f;
                int[] iArr = this.f4021d;
                if (i4 >= iArr.length) {
                    this.f4021d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f4022e;
                    this.f4022e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f4021d;
                int i5 = this.f4023f;
                iArr2[i5] = i3;
                float[] fArr2 = this.f4022e;
                this.f4023f = i5 + 1;
                fArr2[i5] = f3;
            }

            /* JADX INFO: renamed from: b */
            void m4074b(int i3, int i4) {
                int i5 = this.f4020c;
                int[] iArr = this.f4018a;
                if (i5 >= iArr.length) {
                    this.f4018a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f4019b;
                    this.f4019b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f4018a;
                int i6 = this.f4020c;
                iArr3[i6] = i3;
                int[] iArr4 = this.f4019b;
                this.f4020c = i6 + 1;
                iArr4[i6] = i4;
            }

            /* JADX INFO: renamed from: c */
            void m4075c(int i3, String str) {
                int i4 = this.f4026i;
                int[] iArr = this.f4024g;
                if (i4 >= iArr.length) {
                    this.f4024g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f4025h;
                    this.f4025h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f4024g;
                int i5 = this.f4026i;
                iArr2[i5] = i3;
                String[] strArr2 = this.f4025h;
                this.f4026i = i5 + 1;
                strArr2[i5] = str;
            }

            /* JADX INFO: renamed from: d */
            void m4076d(int i3, boolean z2) {
                int i4 = this.f4029l;
                int[] iArr = this.f4027j;
                if (i4 >= iArr.length) {
                    this.f4027j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f4028k;
                    this.f4028k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f4027j;
                int i5 = this.f4029l;
                iArr2[i5] = i3;
                boolean[] zArr2 = this.f4028k;
                this.f4029l = i5 + 1;
                zArr2[i5] = z2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public void m4070d(int i3, ConstraintLayout.C0937b c0937b) {
            this.f4010a = i3;
            b bVar = this.f4014e;
            bVar.f4073i = c0937b.f3906d;
            bVar.f4075j = c0937b.f3908e;
            bVar.f4077k = c0937b.f3910f;
            bVar.f4079l = c0937b.f3912g;
            bVar.f4081m = c0937b.f3914h;
            bVar.f4083n = c0937b.f3916i;
            bVar.f4085o = c0937b.f3918j;
            bVar.f4087p = c0937b.f3920k;
            bVar.f4089q = c0937b.f3922l;
            bVar.f4090r = c0937b.f3924m;
            bVar.f4091s = c0937b.f3926n;
            bVar.f4092t = c0937b.f3934r;
            bVar.f4093u = c0937b.f3936s;
            bVar.f4094v = c0937b.f3938t;
            bVar.f4095w = c0937b.f3940u;
            bVar.f4096x = c0937b.f3879F;
            bVar.f4097y = c0937b.f3880G;
            bVar.f4098z = c0937b.f3881H;
            bVar.f4031A = c0937b.f3928o;
            bVar.f4032B = c0937b.f3930p;
            bVar.f4033C = c0937b.f3932q;
            bVar.f4034D = c0937b.f3896W;
            bVar.f4035E = c0937b.f3897X;
            bVar.f4036F = c0937b.f3898Y;
            bVar.f4071h = c0937b.f3904c;
            bVar.f4067f = c0937b.f3900a;
            bVar.f4069g = c0937b.f3902b;
            bVar.f4063d = ((ViewGroup.MarginLayoutParams) c0937b).width;
            bVar.f4065e = ((ViewGroup.MarginLayoutParams) c0937b).height;
            bVar.f4037G = ((ViewGroup.MarginLayoutParams) c0937b).leftMargin;
            bVar.f4038H = ((ViewGroup.MarginLayoutParams) c0937b).rightMargin;
            bVar.f4039I = ((ViewGroup.MarginLayoutParams) c0937b).topMargin;
            bVar.f4040J = ((ViewGroup.MarginLayoutParams) c0937b).bottomMargin;
            bVar.f4043M = c0937b.f3876C;
            bVar.f4051U = c0937b.f3885L;
            bVar.f4052V = c0937b.f3884K;
            bVar.f4054X = c0937b.f3887N;
            bVar.f4053W = c0937b.f3886M;
            bVar.f4082m0 = c0937b.f3899Z;
            bVar.f4084n0 = c0937b.f3901a0;
            bVar.f4055Y = c0937b.f3888O;
            bVar.f4056Z = c0937b.f3889P;
            bVar.f4058a0 = c0937b.f3892S;
            bVar.f4060b0 = c0937b.f3893T;
            bVar.f4062c0 = c0937b.f3890Q;
            bVar.f4064d0 = c0937b.f3891R;
            bVar.f4066e0 = c0937b.f3894U;
            bVar.f4068f0 = c0937b.f3895V;
            bVar.f4080l0 = c0937b.f3903b0;
            bVar.f4045O = c0937b.f3944w;
            bVar.f4047Q = c0937b.f3946y;
            bVar.f4044N = c0937b.f3942v;
            bVar.f4046P = c0937b.f3945x;
            bVar.f4049S = c0937b.f3947z;
            bVar.f4048R = c0937b.f3874A;
            bVar.f4050T = c0937b.f3875B;
            bVar.f4088p0 = c0937b.f3905c0;
            bVar.f4041K = c0937b.getMarginEnd();
            this.f4014e.f4042L = c0937b.getMarginStart();
        }

        /* JADX INFO: renamed from: b */
        public void m4071b(ConstraintLayout.C0937b c0937b) {
            b bVar = this.f4014e;
            c0937b.f3906d = bVar.f4073i;
            c0937b.f3908e = bVar.f4075j;
            c0937b.f3910f = bVar.f4077k;
            c0937b.f3912g = bVar.f4079l;
            c0937b.f3914h = bVar.f4081m;
            c0937b.f3916i = bVar.f4083n;
            c0937b.f3918j = bVar.f4085o;
            c0937b.f3920k = bVar.f4087p;
            c0937b.f3922l = bVar.f4089q;
            c0937b.f3924m = bVar.f4090r;
            c0937b.f3926n = bVar.f4091s;
            c0937b.f3934r = bVar.f4092t;
            c0937b.f3936s = bVar.f4093u;
            c0937b.f3938t = bVar.f4094v;
            c0937b.f3940u = bVar.f4095w;
            ((ViewGroup.MarginLayoutParams) c0937b).leftMargin = bVar.f4037G;
            ((ViewGroup.MarginLayoutParams) c0937b).rightMargin = bVar.f4038H;
            ((ViewGroup.MarginLayoutParams) c0937b).topMargin = bVar.f4039I;
            ((ViewGroup.MarginLayoutParams) c0937b).bottomMargin = bVar.f4040J;
            c0937b.f3947z = bVar.f4049S;
            c0937b.f3874A = bVar.f4048R;
            c0937b.f3944w = bVar.f4045O;
            c0937b.f3946y = bVar.f4047Q;
            c0937b.f3879F = bVar.f4096x;
            c0937b.f3880G = bVar.f4097y;
            c0937b.f3928o = bVar.f4031A;
            c0937b.f3930p = bVar.f4032B;
            c0937b.f3932q = bVar.f4033C;
            c0937b.f3881H = bVar.f4098z;
            c0937b.f3896W = bVar.f4034D;
            c0937b.f3897X = bVar.f4035E;
            c0937b.f3885L = bVar.f4051U;
            c0937b.f3884K = bVar.f4052V;
            c0937b.f3887N = bVar.f4054X;
            c0937b.f3886M = bVar.f4053W;
            c0937b.f3899Z = bVar.f4082m0;
            c0937b.f3901a0 = bVar.f4084n0;
            c0937b.f3888O = bVar.f4055Y;
            c0937b.f3889P = bVar.f4056Z;
            c0937b.f3892S = bVar.f4058a0;
            c0937b.f3893T = bVar.f4060b0;
            c0937b.f3890Q = bVar.f4062c0;
            c0937b.f3891R = bVar.f4064d0;
            c0937b.f3894U = bVar.f4066e0;
            c0937b.f3895V = bVar.f4068f0;
            c0937b.f3898Y = bVar.f4036F;
            c0937b.f3904c = bVar.f4071h;
            c0937b.f3900a = bVar.f4067f;
            c0937b.f3902b = bVar.f4069g;
            ((ViewGroup.MarginLayoutParams) c0937b).width = bVar.f4063d;
            ((ViewGroup.MarginLayoutParams) c0937b).height = bVar.f4065e;
            String str = bVar.f4080l0;
            if (str != null) {
                c0937b.f3903b0 = str;
            }
            c0937b.f3905c0 = bVar.f4088p0;
            c0937b.setMarginStart(bVar.f4042L);
            c0937b.setMarginEnd(this.f4014e.f4041K);
            c0937b.m4024a();
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f4014e.m4077a(this.f4014e);
            aVar.f4013d.m4079a(this.f4013d);
            aVar.f4012c.m4081a(this.f4012c);
            aVar.f4015f.m4083a(this.f4015f);
            aVar.f4010a = this.f4010a;
            aVar.f4017h = this.f4017h;
            return aVar;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.e$b */
    public static class b {

        /* JADX INFO: renamed from: q0 */
        private static SparseIntArray f4030q0;

        /* JADX INFO: renamed from: d */
        public int f4063d;

        /* JADX INFO: renamed from: e */
        public int f4065e;

        /* JADX INFO: renamed from: j0 */
        public int[] f4076j0;

        /* JADX INFO: renamed from: k0 */
        public String f4078k0;

        /* JADX INFO: renamed from: l0 */
        public String f4080l0;

        /* JADX INFO: renamed from: a */
        public boolean f4057a = false;

        /* JADX INFO: renamed from: b */
        public boolean f4059b = false;

        /* JADX INFO: renamed from: c */
        public boolean f4061c = false;

        /* JADX INFO: renamed from: f */
        public int f4067f = -1;

        /* JADX INFO: renamed from: g */
        public int f4069g = -1;

        /* JADX INFO: renamed from: h */
        public float f4071h = -1.0f;

        /* JADX INFO: renamed from: i */
        public int f4073i = -1;

        /* JADX INFO: renamed from: j */
        public int f4075j = -1;

        /* JADX INFO: renamed from: k */
        public int f4077k = -1;

        /* JADX INFO: renamed from: l */
        public int f4079l = -1;

        /* JADX INFO: renamed from: m */
        public int f4081m = -1;

        /* JADX INFO: renamed from: n */
        public int f4083n = -1;

        /* JADX INFO: renamed from: o */
        public int f4085o = -1;

        /* JADX INFO: renamed from: p */
        public int f4087p = -1;

        /* JADX INFO: renamed from: q */
        public int f4089q = -1;

        /* JADX INFO: renamed from: r */
        public int f4090r = -1;

        /* JADX INFO: renamed from: s */
        public int f4091s = -1;

        /* JADX INFO: renamed from: t */
        public int f4092t = -1;

        /* JADX INFO: renamed from: u */
        public int f4093u = -1;

        /* JADX INFO: renamed from: v */
        public int f4094v = -1;

        /* JADX INFO: renamed from: w */
        public int f4095w = -1;

        /* JADX INFO: renamed from: x */
        public float f4096x = 0.5f;

        /* JADX INFO: renamed from: y */
        public float f4097y = 0.5f;

        /* JADX INFO: renamed from: z */
        public String f4098z = null;

        /* JADX INFO: renamed from: A */
        public int f4031A = -1;

        /* JADX INFO: renamed from: B */
        public int f4032B = 0;

        /* JADX INFO: renamed from: C */
        public float f4033C = 0.0f;

        /* JADX INFO: renamed from: D */
        public int f4034D = -1;

        /* JADX INFO: renamed from: E */
        public int f4035E = -1;

        /* JADX INFO: renamed from: F */
        public int f4036F = -1;

        /* JADX INFO: renamed from: G */
        public int f4037G = 0;

        /* JADX INFO: renamed from: H */
        public int f4038H = 0;

        /* JADX INFO: renamed from: I */
        public int f4039I = 0;

        /* JADX INFO: renamed from: J */
        public int f4040J = 0;

        /* JADX INFO: renamed from: K */
        public int f4041K = 0;

        /* JADX INFO: renamed from: L */
        public int f4042L = 0;

        /* JADX INFO: renamed from: M */
        public int f4043M = 0;

        /* JADX INFO: renamed from: N */
        public int f4044N = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: O */
        public int f4045O = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: P */
        public int f4046P = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: Q */
        public int f4047Q = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: R */
        public int f4048R = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: S */
        public int f4049S = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: T */
        public int f4050T = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: U */
        public float f4051U = -1.0f;

        /* JADX INFO: renamed from: V */
        public float f4052V = -1.0f;

        /* JADX INFO: renamed from: W */
        public int f4053W = 0;

        /* JADX INFO: renamed from: X */
        public int f4054X = 0;

        /* JADX INFO: renamed from: Y */
        public int f4055Y = 0;

        /* JADX INFO: renamed from: Z */
        public int f4056Z = 0;

        /* JADX INFO: renamed from: a0 */
        public int f4058a0 = -1;

        /* JADX INFO: renamed from: b0 */
        public int f4060b0 = -1;

        /* JADX INFO: renamed from: c0 */
        public int f4062c0 = -1;

        /* JADX INFO: renamed from: d0 */
        public int f4064d0 = -1;

        /* JADX INFO: renamed from: e0 */
        public float f4066e0 = 1.0f;

        /* JADX INFO: renamed from: f0 */
        public float f4068f0 = 1.0f;

        /* JADX INFO: renamed from: g0 */
        public int f4070g0 = -1;

        /* JADX INFO: renamed from: h0 */
        public int f4072h0 = 0;

        /* JADX INFO: renamed from: i0 */
        public int f4074i0 = -1;

        /* JADX INFO: renamed from: m0 */
        public boolean f4082m0 = false;

        /* JADX INFO: renamed from: n0 */
        public boolean f4084n0 = false;

        /* JADX INFO: renamed from: o0 */
        public boolean f4086o0 = true;

        /* JADX INFO: renamed from: p0 */
        public int f4088p0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f4030q0 = sparseIntArray;
            sparseIntArray.append(AbstractC0947i.f4311U5, 24);
            f4030q0.append(AbstractC0947i.f4319V5, 25);
            f4030q0.append(AbstractC0947i.f4335X5, 28);
            f4030q0.append(AbstractC0947i.f4343Y5, 29);
            f4030q0.append(AbstractC0947i.f4387d6, 35);
            f4030q0.append(AbstractC0947i.f4378c6, 34);
            f4030q0.append(AbstractC0947i.f4176E5, 4);
            f4030q0.append(AbstractC0947i.f4167D5, 3);
            f4030q0.append(AbstractC0947i.f4149B5, 1);
            f4030q0.append(AbstractC0947i.f4441j6, 6);
            f4030q0.append(AbstractC0947i.f4450k6, 7);
            f4030q0.append(AbstractC0947i.f4239L5, 17);
            f4030q0.append(AbstractC0947i.f4247M5, 18);
            f4030q0.append(AbstractC0947i.f4255N5, 19);
            f4030q0.append(AbstractC0947i.f4449k5, 26);
            f4030q0.append(AbstractC0947i.f4351Z5, 31);
            f4030q0.append(AbstractC0947i.f4360a6, 32);
            f4030q0.append(AbstractC0947i.f4230K5, 10);
            f4030q0.append(AbstractC0947i.f4221J5, 9);
            f4030q0.append(AbstractC0947i.f4477n6, 13);
            f4030q0.append(AbstractC0947i.f4504q6, 16);
            f4030q0.append(AbstractC0947i.f4486o6, 14);
            f4030q0.append(AbstractC0947i.f4459l6, 11);
            f4030q0.append(AbstractC0947i.f4495p6, 15);
            f4030q0.append(AbstractC0947i.f4468m6, 12);
            f4030q0.append(AbstractC0947i.f4414g6, 38);
            f4030q0.append(AbstractC0947i.f4295S5, 37);
            f4030q0.append(AbstractC0947i.f4287R5, 39);
            f4030q0.append(AbstractC0947i.f4405f6, 40);
            f4030q0.append(AbstractC0947i.f4279Q5, 20);
            f4030q0.append(AbstractC0947i.f4396e6, 36);
            f4030q0.append(AbstractC0947i.f4212I5, 5);
            f4030q0.append(AbstractC0947i.f4303T5, 76);
            f4030q0.append(AbstractC0947i.f4369b6, 76);
            f4030q0.append(AbstractC0947i.f4327W5, 76);
            f4030q0.append(AbstractC0947i.f4158C5, 76);
            f4030q0.append(AbstractC0947i.f4140A5, 76);
            f4030q0.append(AbstractC0947i.f4476n5, 23);
            f4030q0.append(AbstractC0947i.f4494p5, 27);
            f4030q0.append(AbstractC0947i.f4512r5, 30);
            f4030q0.append(AbstractC0947i.f4521s5, 8);
            f4030q0.append(AbstractC0947i.f4485o5, 33);
            f4030q0.append(AbstractC0947i.f4503q5, 2);
            f4030q0.append(AbstractC0947i.f4458l5, 22);
            f4030q0.append(AbstractC0947i.f4467m5, 21);
            f4030q0.append(AbstractC0947i.f4423h6, 41);
            f4030q0.append(AbstractC0947i.f4263O5, 42);
            f4030q0.append(AbstractC0947i.f4584z5, 41);
            f4030q0.append(AbstractC0947i.f4575y5, 42);
            f4030q0.append(AbstractC0947i.f4513r6, 97);
            f4030q0.append(AbstractC0947i.f4185F5, 61);
            f4030q0.append(AbstractC0947i.f4203H5, 62);
            f4030q0.append(AbstractC0947i.f4194G5, 63);
            f4030q0.append(AbstractC0947i.f4432i6, 69);
            f4030q0.append(AbstractC0947i.f4271P5, 70);
            f4030q0.append(AbstractC0947i.f4557w5, 71);
            f4030q0.append(AbstractC0947i.f4539u5, 72);
            f4030q0.append(AbstractC0947i.f4548v5, 73);
            f4030q0.append(AbstractC0947i.f4566x5, 74);
            f4030q0.append(AbstractC0947i.f4530t5, 75);
        }

        /* JADX INFO: renamed from: a */
        public void m4077a(b bVar) {
            this.f4057a = bVar.f4057a;
            this.f4063d = bVar.f4063d;
            this.f4059b = bVar.f4059b;
            this.f4065e = bVar.f4065e;
            this.f4067f = bVar.f4067f;
            this.f4069g = bVar.f4069g;
            this.f4071h = bVar.f4071h;
            this.f4073i = bVar.f4073i;
            this.f4075j = bVar.f4075j;
            this.f4077k = bVar.f4077k;
            this.f4079l = bVar.f4079l;
            this.f4081m = bVar.f4081m;
            this.f4083n = bVar.f4083n;
            this.f4085o = bVar.f4085o;
            this.f4087p = bVar.f4087p;
            this.f4089q = bVar.f4089q;
            this.f4090r = bVar.f4090r;
            this.f4091s = bVar.f4091s;
            this.f4092t = bVar.f4092t;
            this.f4093u = bVar.f4093u;
            this.f4094v = bVar.f4094v;
            this.f4095w = bVar.f4095w;
            this.f4096x = bVar.f4096x;
            this.f4097y = bVar.f4097y;
            this.f4098z = bVar.f4098z;
            this.f4031A = bVar.f4031A;
            this.f4032B = bVar.f4032B;
            this.f4033C = bVar.f4033C;
            this.f4034D = bVar.f4034D;
            this.f4035E = bVar.f4035E;
            this.f4036F = bVar.f4036F;
            this.f4037G = bVar.f4037G;
            this.f4038H = bVar.f4038H;
            this.f4039I = bVar.f4039I;
            this.f4040J = bVar.f4040J;
            this.f4041K = bVar.f4041K;
            this.f4042L = bVar.f4042L;
            this.f4043M = bVar.f4043M;
            this.f4044N = bVar.f4044N;
            this.f4045O = bVar.f4045O;
            this.f4046P = bVar.f4046P;
            this.f4047Q = bVar.f4047Q;
            this.f4048R = bVar.f4048R;
            this.f4049S = bVar.f4049S;
            this.f4050T = bVar.f4050T;
            this.f4051U = bVar.f4051U;
            this.f4052V = bVar.f4052V;
            this.f4053W = bVar.f4053W;
            this.f4054X = bVar.f4054X;
            this.f4055Y = bVar.f4055Y;
            this.f4056Z = bVar.f4056Z;
            this.f4058a0 = bVar.f4058a0;
            this.f4060b0 = bVar.f4060b0;
            this.f4062c0 = bVar.f4062c0;
            this.f4064d0 = bVar.f4064d0;
            this.f4066e0 = bVar.f4066e0;
            this.f4068f0 = bVar.f4068f0;
            this.f4070g0 = bVar.f4070g0;
            this.f4072h0 = bVar.f4072h0;
            this.f4074i0 = bVar.f4074i0;
            this.f4080l0 = bVar.f4080l0;
            int[] iArr = bVar.f4076j0;
            if (iArr != null) {
                this.f4076j0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f4076j0 = null;
            }
            this.f4078k0 = bVar.f4078k0;
            this.f4082m0 = bVar.f4082m0;
            this.f4084n0 = bVar.f4084n0;
            this.f4086o0 = bVar.f4086o0;
            this.f4088p0 = bVar.f4088p0;
        }

        /* JADX INFO: renamed from: b */
        void m4078b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0947i.f4440j5);
            this.f4059b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                int i4 = f4030q0.get(index);
                if (i4 == 80) {
                    this.f4082m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f4082m0);
                } else if (i4 == 81) {
                    this.f4084n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f4084n0);
                } else if (i4 != 97) {
                    switch (i4) {
                        case 1:
                            this.f4089q = C0943e.m4056m(typedArrayObtainStyledAttributes, index, this.f4089q);
                            break;
                        case 2:
                            this.f4040J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4040J);
                            break;
                        case 3:
                            this.f4087p = C0943e.m4056m(typedArrayObtainStyledAttributes, index, this.f4087p);
                            break;
                        case 4:
                            this.f4085o = C0943e.m4056m(typedArrayObtainStyledAttributes, index, this.f4085o);
                            break;
                        case 5:
                            this.f4098z = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f4034D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4034D);
                            break;
                        case 7:
                            this.f4035E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4035E);
                            break;
                        case 8:
                            this.f4041K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4041K);
                            break;
                        case ConnectionResult.SERVICE_INVALID /* 9 */:
                            this.f4095w = C0943e.m4056m(typedArrayObtainStyledAttributes, index, this.f4095w);
                            break;
                        case 10:
                            this.f4094v = C0943e.m4056m(typedArrayObtainStyledAttributes, index, this.f4094v);
                            break;
                        case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                            this.f4047Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4047Q);
                            break;
                        case 12:
                            this.f4048R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4048R);
                            break;
                        case 13:
                            this.f4044N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4044N);
                            break;
                        case 14:
                            this.f4046P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4046P);
                            break;
                        case 15:
                            this.f4049S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4049S);
                            break;
                        case 16:
                            this.f4045O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4045O);
                            break;
                        case 17:
                            this.f4067f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4067f);
                            break;
                        case ConnectionResult.SERVICE_UPDATING /* 18 */:
                            this.f4069g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4069g);
                            break;
                        case 19:
                            this.f4071h = typedArrayObtainStyledAttributes.getFloat(index, this.f4071h);
                            break;
                        case 20:
                            this.f4096x = typedArrayObtainStyledAttributes.getFloat(index, this.f4096x);
                            break;
                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                            this.f4065e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f4065e);
                            break;
                        case 22:
                            this.f4063d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f4063d);
                            break;
                        case ConnectionResult.API_DISABLED /* 23 */:
                            this.f4037G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4037G);
                            break;
                        case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                            this.f4073i = C0943e.m4056m(typedArrayObtainStyledAttributes, index, this.f4073i);
                            break;
                        case 25:
                            this.f4075j = C0943e.m4056m(typedArrayObtainStyledAttributes, index, this.f4075j);
                            break;
                        case 26:
                            this.f4036F = typedArrayObtainStyledAttributes.getInt(index, this.f4036F);
                            break;
                        case 27:
                            this.f4038H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4038H);
                            break;
                        case 28:
                            this.f4077k = C0943e.m4056m(typedArrayObtainStyledAttributes, index, this.f4077k);
                            break;
                        case 29:
                            this.f4079l = C0943e.m4056m(typedArrayObtainStyledAttributes, index, this.f4079l);
                            break;
                        case 30:
                            this.f4042L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4042L);
                            break;
                        case 31:
                            this.f4092t = C0943e.m4056m(typedArrayObtainStyledAttributes, index, this.f4092t);
                            break;
                        case 32:
                            this.f4093u = C0943e.m4056m(typedArrayObtainStyledAttributes, index, this.f4093u);
                            break;
                        case 33:
                            this.f4039I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4039I);
                            break;
                        case 34:
                            this.f4083n = C0943e.m4056m(typedArrayObtainStyledAttributes, index, this.f4083n);
                            break;
                        case 35:
                            this.f4081m = C0943e.m4056m(typedArrayObtainStyledAttributes, index, this.f4081m);
                            break;
                        case 36:
                            this.f4097y = typedArrayObtainStyledAttributes.getFloat(index, this.f4097y);
                            break;
                        case 37:
                            this.f4052V = typedArrayObtainStyledAttributes.getFloat(index, this.f4052V);
                            break;
                        case 38:
                            this.f4051U = typedArrayObtainStyledAttributes.getFloat(index, this.f4051U);
                            break;
                        case 39:
                            this.f4053W = typedArrayObtainStyledAttributes.getInt(index, this.f4053W);
                            break;
                        case 40:
                            this.f4054X = typedArrayObtainStyledAttributes.getInt(index, this.f4054X);
                            break;
                        case 41:
                            C0943e.m4057n(this, typedArrayObtainStyledAttributes, index, 0);
                            break;
                        case 42:
                            C0943e.m4057n(this, typedArrayObtainStyledAttributes, index, 1);
                            break;
                        default:
                            switch (i4) {
                                case 54:
                                    this.f4055Y = typedArrayObtainStyledAttributes.getInt(index, this.f4055Y);
                                    break;
                                case 55:
                                    this.f4056Z = typedArrayObtainStyledAttributes.getInt(index, this.f4056Z);
                                    break;
                                case 56:
                                    this.f4058a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4058a0);
                                    break;
                                case 57:
                                    this.f4060b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4060b0);
                                    break;
                                case 58:
                                    this.f4062c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4062c0);
                                    break;
                                case 59:
                                    this.f4064d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4064d0);
                                    break;
                                default:
                                    switch (i4) {
                                        case 61:
                                            this.f4031A = C0943e.m4056m(typedArrayObtainStyledAttributes, index, this.f4031A);
                                            break;
                                        case 62:
                                            this.f4032B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4032B);
                                            break;
                                        case 63:
                                            this.f4033C = typedArrayObtainStyledAttributes.getFloat(index, this.f4033C);
                                            break;
                                        default:
                                            switch (i4) {
                                                case 69:
                                                    this.f4066e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f4068f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f4070g0 = typedArrayObtainStyledAttributes.getInt(index, this.f4070g0);
                                                    break;
                                                case 73:
                                                    this.f4072h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4072h0);
                                                    break;
                                                case 74:
                                                    this.f4078k0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f4086o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f4086o0);
                                                    break;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f4030q0.get(index));
                                                    break;
                                                case 77:
                                                    this.f4080l0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    switch (i4) {
                                                        case 91:
                                                            this.f4090r = C0943e.m4056m(typedArrayObtainStyledAttributes, index, this.f4090r);
                                                            break;
                                                        case 92:
                                                            this.f4091s = C0943e.m4056m(typedArrayObtainStyledAttributes, index, this.f4091s);
                                                            break;
                                                        case 93:
                                                            this.f4043M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4043M);
                                                            break;
                                                        case 94:
                                                            this.f4050T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4050T);
                                                            break;
                                                        default:
                                                            Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f4030q0.get(index));
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    this.f4088p0 = typedArrayObtainStyledAttributes.getInt(index, this.f4088p0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.e$c */
    public static class c {

        /* JADX INFO: renamed from: o */
        private static SparseIntArray f4099o;

        /* JADX INFO: renamed from: a */
        public boolean f4100a = false;

        /* JADX INFO: renamed from: b */
        public int f4101b = -1;

        /* JADX INFO: renamed from: c */
        public int f4102c = 0;

        /* JADX INFO: renamed from: d */
        public String f4103d = null;

        /* JADX INFO: renamed from: e */
        public int f4104e = -1;

        /* JADX INFO: renamed from: f */
        public int f4105f = 0;

        /* JADX INFO: renamed from: g */
        public float f4106g = Float.NaN;

        /* JADX INFO: renamed from: h */
        public int f4107h = -1;

        /* JADX INFO: renamed from: i */
        public float f4108i = Float.NaN;

        /* JADX INFO: renamed from: j */
        public float f4109j = Float.NaN;

        /* JADX INFO: renamed from: k */
        public int f4110k = -1;

        /* JADX INFO: renamed from: l */
        public String f4111l = null;

        /* JADX INFO: renamed from: m */
        public int f4112m = -3;

        /* JADX INFO: renamed from: n */
        public int f4113n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f4099o = sparseIntArray;
            sparseIntArray.append(AbstractC0947i.f4168D6, 1);
            f4099o.append(AbstractC0947i.f4186F6, 2);
            f4099o.append(AbstractC0947i.f4222J6, 3);
            f4099o.append(AbstractC0947i.f4159C6, 4);
            f4099o.append(AbstractC0947i.f4150B6, 5);
            f4099o.append(AbstractC0947i.f4141A6, 6);
            f4099o.append(AbstractC0947i.f4177E6, 7);
            f4099o.append(AbstractC0947i.f4213I6, 8);
            f4099o.append(AbstractC0947i.f4204H6, 9);
            f4099o.append(AbstractC0947i.f4195G6, 10);
        }

        /* JADX INFO: renamed from: a */
        public void m4079a(c cVar) {
            this.f4100a = cVar.f4100a;
            this.f4101b = cVar.f4101b;
            this.f4103d = cVar.f4103d;
            this.f4104e = cVar.f4104e;
            this.f4105f = cVar.f4105f;
            this.f4108i = cVar.f4108i;
            this.f4106g = cVar.f4106g;
            this.f4107h = cVar.f4107h;
        }

        /* JADX INFO: renamed from: b */
        void m4080b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0947i.f4585z6);
            this.f4100a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                switch (f4099o.get(index)) {
                    case 1:
                        this.f4108i = typedArrayObtainStyledAttributes.getFloat(index, this.f4108i);
                        break;
                    case 2:
                        this.f4104e = typedArrayObtainStyledAttributes.getInt(index, this.f4104e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f4103d = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f4103d = C2346a.f10783c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f4105f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f4101b = C0943e.m4056m(typedArrayObtainStyledAttributes, index, this.f4101b);
                        break;
                    case 6:
                        this.f4102c = typedArrayObtainStyledAttributes.getInteger(index, this.f4102c);
                        break;
                    case 7:
                        this.f4106g = typedArrayObtainStyledAttributes.getFloat(index, this.f4106g);
                        break;
                    case 8:
                        this.f4110k = typedArrayObtainStyledAttributes.getInteger(index, this.f4110k);
                        break;
                    case ConnectionResult.SERVICE_INVALID /* 9 */:
                        this.f4109j = typedArrayObtainStyledAttributes.getFloat(index, this.f4109j);
                        break;
                    case 10:
                        int i4 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i4 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f4113n = resourceId;
                            if (resourceId != -1) {
                                this.f4112m = -2;
                            }
                        } else if (i4 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f4111l = string;
                            if (string.indexOf("/") > 0) {
                                this.f4113n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f4112m = -2;
                            } else {
                                this.f4112m = -1;
                            }
                        } else {
                            this.f4112m = typedArrayObtainStyledAttributes.getInteger(index, this.f4113n);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.e$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public boolean f4114a = false;

        /* JADX INFO: renamed from: b */
        public int f4115b = 0;

        /* JADX INFO: renamed from: c */
        public int f4116c = 0;

        /* JADX INFO: renamed from: d */
        public float f4117d = 1.0f;

        /* JADX INFO: renamed from: e */
        public float f4118e = Float.NaN;

        /* JADX INFO: renamed from: a */
        public void m4081a(d dVar) {
            this.f4114a = dVar.f4114a;
            this.f4115b = dVar.f4115b;
            this.f4117d = dVar.f4117d;
            this.f4118e = dVar.f4118e;
            this.f4116c = dVar.f4116c;
        }

        /* JADX INFO: renamed from: b */
        void m4082b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0947i.f4312U6);
            this.f4114a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == AbstractC0947i.f4328W6) {
                    this.f4117d = typedArrayObtainStyledAttributes.getFloat(index, this.f4117d);
                } else if (index == AbstractC0947i.f4320V6) {
                    this.f4115b = typedArrayObtainStyledAttributes.getInt(index, this.f4115b);
                    this.f4115b = C0943e.f4002f[this.f4115b];
                } else if (index == AbstractC0947i.f4344Y6) {
                    this.f4116c = typedArrayObtainStyledAttributes.getInt(index, this.f4116c);
                } else if (index == AbstractC0947i.f4336X6) {
                    this.f4118e = typedArrayObtainStyledAttributes.getFloat(index, this.f4118e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.e$e */
    public static class e {

        /* JADX INFO: renamed from: o */
        private static SparseIntArray f4119o;

        /* JADX INFO: renamed from: a */
        public boolean f4120a = false;

        /* JADX INFO: renamed from: b */
        public float f4121b = 0.0f;

        /* JADX INFO: renamed from: c */
        public float f4122c = 0.0f;

        /* JADX INFO: renamed from: d */
        public float f4123d = 0.0f;

        /* JADX INFO: renamed from: e */
        public float f4124e = 1.0f;

        /* JADX INFO: renamed from: f */
        public float f4125f = 1.0f;

        /* JADX INFO: renamed from: g */
        public float f4126g = Float.NaN;

        /* JADX INFO: renamed from: h */
        public float f4127h = Float.NaN;

        /* JADX INFO: renamed from: i */
        public int f4128i = -1;

        /* JADX INFO: renamed from: j */
        public float f4129j = 0.0f;

        /* JADX INFO: renamed from: k */
        public float f4130k = 0.0f;

        /* JADX INFO: renamed from: l */
        public float f4131l = 0.0f;

        /* JADX INFO: renamed from: m */
        public boolean f4132m = false;

        /* JADX INFO: renamed from: n */
        public float f4133n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f4119o = sparseIntArray;
            sparseIntArray.append(AbstractC0947i.f4532t7, 1);
            f4119o.append(AbstractC0947i.f4541u7, 2);
            f4119o.append(AbstractC0947i.f4550v7, 3);
            f4119o.append(AbstractC0947i.f4514r7, 4);
            f4119o.append(AbstractC0947i.f4523s7, 5);
            f4119o.append(AbstractC0947i.f4478n7, 6);
            f4119o.append(AbstractC0947i.f4487o7, 7);
            f4119o.append(AbstractC0947i.f4496p7, 8);
            f4119o.append(AbstractC0947i.f4505q7, 9);
            f4119o.append(AbstractC0947i.f4559w7, 10);
            f4119o.append(AbstractC0947i.f4568x7, 11);
            f4119o.append(AbstractC0947i.f4577y7, 12);
        }

        /* JADX INFO: renamed from: a */
        public void m4083a(e eVar) {
            this.f4120a = eVar.f4120a;
            this.f4121b = eVar.f4121b;
            this.f4122c = eVar.f4122c;
            this.f4123d = eVar.f4123d;
            this.f4124e = eVar.f4124e;
            this.f4125f = eVar.f4125f;
            this.f4126g = eVar.f4126g;
            this.f4127h = eVar.f4127h;
            this.f4128i = eVar.f4128i;
            this.f4129j = eVar.f4129j;
            this.f4130k = eVar.f4130k;
            this.f4131l = eVar.f4131l;
            this.f4132m = eVar.f4132m;
            this.f4133n = eVar.f4133n;
        }

        /* JADX INFO: renamed from: b */
        void m4084b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0947i.f4469m7);
            this.f4120a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                switch (f4119o.get(index)) {
                    case 1:
                        this.f4121b = typedArrayObtainStyledAttributes.getFloat(index, this.f4121b);
                        break;
                    case 2:
                        this.f4122c = typedArrayObtainStyledAttributes.getFloat(index, this.f4122c);
                        break;
                    case 3:
                        this.f4123d = typedArrayObtainStyledAttributes.getFloat(index, this.f4123d);
                        break;
                    case 4:
                        this.f4124e = typedArrayObtainStyledAttributes.getFloat(index, this.f4124e);
                        break;
                    case 5:
                        this.f4125f = typedArrayObtainStyledAttributes.getFloat(index, this.f4125f);
                        break;
                    case 6:
                        this.f4126g = typedArrayObtainStyledAttributes.getDimension(index, this.f4126g);
                        break;
                    case 7:
                        this.f4127h = typedArrayObtainStyledAttributes.getDimension(index, this.f4127h);
                        break;
                    case 8:
                        this.f4129j = typedArrayObtainStyledAttributes.getDimension(index, this.f4129j);
                        break;
                    case ConnectionResult.SERVICE_INVALID /* 9 */:
                        this.f4130k = typedArrayObtainStyledAttributes.getDimension(index, this.f4130k);
                        break;
                    case 10:
                        this.f4131l = typedArrayObtainStyledAttributes.getDimension(index, this.f4131l);
                        break;
                    case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                        this.f4132m = true;
                        this.f4133n = typedArrayObtainStyledAttributes.getDimension(index, this.f4133n);
                        break;
                    case 12:
                        this.f4128i = C0943e.m4056m(typedArrayObtainStyledAttributes, index, this.f4128i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        f4003g.append(AbstractC0947i.f4579z0, 25);
        f4003g.append(AbstractC0947i.f4135A0, 26);
        f4003g.append(AbstractC0947i.f4153C0, 29);
        f4003g.append(AbstractC0947i.f4162D0, 30);
        f4003g.append(AbstractC0947i.f4216J0, 36);
        f4003g.append(AbstractC0947i.f4207I0, 35);
        f4003g.append(AbstractC0947i.f4408g0, 4);
        f4003g.append(AbstractC0947i.f4399f0, 3);
        f4003g.append(AbstractC0947i.f4363b0, 1);
        f4003g.append(AbstractC0947i.f4381d0, 91);
        f4003g.append(AbstractC0947i.f4372c0, 92);
        f4003g.append(AbstractC0947i.f4290S0, 6);
        f4003g.append(AbstractC0947i.f4298T0, 7);
        f4003g.append(AbstractC0947i.f4471n0, 17);
        f4003g.append(AbstractC0947i.f4480o0, 18);
        f4003g.append(AbstractC0947i.f4489p0, 19);
        f4003g.append(AbstractC0947i.f4533u, 27);
        f4003g.append(AbstractC0947i.f4171E0, 32);
        f4003g.append(AbstractC0947i.f4180F0, 33);
        f4003g.append(AbstractC0947i.f4462m0, 10);
        f4003g.append(AbstractC0947i.f4453l0, 9);
        f4003g.append(AbstractC0947i.f4322W0, 13);
        f4003g.append(AbstractC0947i.f4346Z0, 16);
        f4003g.append(AbstractC0947i.f4330X0, 14);
        f4003g.append(AbstractC0947i.f4306U0, 11);
        f4003g.append(AbstractC0947i.f4338Y0, 15);
        f4003g.append(AbstractC0947i.f4314V0, 12);
        f4003g.append(AbstractC0947i.f4242M0, 40);
        f4003g.append(AbstractC0947i.f4561x0, 39);
        f4003g.append(AbstractC0947i.f4552w0, 41);
        f4003g.append(AbstractC0947i.f4234L0, 42);
        f4003g.append(AbstractC0947i.f4543v0, 20);
        f4003g.append(AbstractC0947i.f4225K0, 37);
        f4003g.append(AbstractC0947i.f4444k0, 5);
        f4003g.append(AbstractC0947i.f4570y0, 87);
        f4003g.append(AbstractC0947i.f4198H0, 87);
        f4003g.append(AbstractC0947i.f4144B0, 87);
        f4003g.append(AbstractC0947i.f4390e0, 87);
        f4003g.append(AbstractC0947i.f4354a0, 87);
        f4003g.append(AbstractC0947i.f4578z, 24);
        f4003g.append(AbstractC0947i.f4143B, 28);
        f4003g.append(AbstractC0947i.f4249N, 31);
        f4003g.append(AbstractC0947i.f4257O, 8);
        f4003g.append(AbstractC0947i.f4134A, 34);
        f4003g.append(AbstractC0947i.f4152C, 2);
        f4003g.append(AbstractC0947i.f4560x, 23);
        f4003g.append(AbstractC0947i.f4569y, 21);
        f4003g.append(AbstractC0947i.f4250N0, 95);
        f4003g.append(AbstractC0947i.f4498q0, 96);
        f4003g.append(AbstractC0947i.f4551w, 22);
        f4003g.append(AbstractC0947i.f4161D, 43);
        f4003g.append(AbstractC0947i.f4273Q, 44);
        f4003g.append(AbstractC0947i.f4233L, 45);
        f4003g.append(AbstractC0947i.f4241M, 46);
        f4003g.append(AbstractC0947i.f4224K, 60);
        f4003g.append(AbstractC0947i.f4206I, 47);
        f4003g.append(AbstractC0947i.f4215J, 48);
        f4003g.append(AbstractC0947i.f4170E, 49);
        f4003g.append(AbstractC0947i.f4179F, 50);
        f4003g.append(AbstractC0947i.f4188G, 51);
        f4003g.append(AbstractC0947i.f4197H, 52);
        f4003g.append(AbstractC0947i.f4265P, 53);
        f4003g.append(AbstractC0947i.f4258O0, 54);
        f4003g.append(AbstractC0947i.f4507r0, 55);
        f4003g.append(AbstractC0947i.f4266P0, 56);
        f4003g.append(AbstractC0947i.f4516s0, 57);
        f4003g.append(AbstractC0947i.f4274Q0, 58);
        f4003g.append(AbstractC0947i.f4525t0, 59);
        f4003g.append(AbstractC0947i.f4417h0, 61);
        f4003g.append(AbstractC0947i.f4435j0, 62);
        f4003g.append(AbstractC0947i.f4426i0, 63);
        f4003g.append(AbstractC0947i.f4281R, 64);
        f4003g.append(AbstractC0947i.f4436j1, 65);
        f4003g.append(AbstractC0947i.f4329X, 66);
        f4003g.append(AbstractC0947i.f4445k1, 67);
        f4003g.append(AbstractC0947i.f4373c1, 79);
        f4003g.append(AbstractC0947i.f4542v, 38);
        f4003g.append(AbstractC0947i.f4364b1, 68);
        f4003g.append(AbstractC0947i.f4282R0, 69);
        f4003g.append(AbstractC0947i.f4534u0, 70);
        f4003g.append(AbstractC0947i.f4355a1, 97);
        f4003g.append(AbstractC0947i.f4313V, 71);
        f4003g.append(AbstractC0947i.f4297T, 72);
        f4003g.append(AbstractC0947i.f4305U, 73);
        f4003g.append(AbstractC0947i.f4321W, 74);
        f4003g.append(AbstractC0947i.f4289S, 75);
        f4003g.append(AbstractC0947i.f4382d1, 76);
        f4003g.append(AbstractC0947i.f4189G0, 77);
        f4003g.append(AbstractC0947i.f4454l1, 78);
        f4003g.append(AbstractC0947i.f4345Z, 80);
        f4003g.append(AbstractC0947i.f4337Y, 81);
        f4003g.append(AbstractC0947i.f4391e1, 82);
        f4003g.append(AbstractC0947i.f4427i1, 83);
        f4003g.append(AbstractC0947i.f4418h1, 84);
        f4003g.append(AbstractC0947i.f4409g1, 85);
        f4003g.append(AbstractC0947i.f4400f1, 86);
        SparseIntArray sparseIntArray = f4004h;
        int i3 = AbstractC0947i.f4484o4;
        sparseIntArray.append(i3, 6);
        f4004h.append(i3, 7);
        f4004h.append(AbstractC0947i.f4438j3, 27);
        f4004h.append(AbstractC0947i.f4511r4, 13);
        f4004h.append(AbstractC0947i.f4538u4, 16);
        f4004h.append(AbstractC0947i.f4520s4, 14);
        f4004h.append(AbstractC0947i.f4493p4, 11);
        f4004h.append(AbstractC0947i.f4529t4, 15);
        f4004h.append(AbstractC0947i.f4502q4, 12);
        f4004h.append(AbstractC0947i.f4430i4, 40);
        f4004h.append(AbstractC0947i.f4367b4, 39);
        f4004h.append(AbstractC0947i.f4358a4, 41);
        f4004h.append(AbstractC0947i.f4421h4, 42);
        f4004h.append(AbstractC0947i.f4349Z3, 20);
        f4004h.append(AbstractC0947i.f4412g4, 37);
        f4004h.append(AbstractC0947i.f4301T3, 5);
        f4004h.append(AbstractC0947i.f4376c4, 87);
        f4004h.append(AbstractC0947i.f4403f4, 87);
        f4004h.append(AbstractC0947i.f4385d4, 87);
        f4004h.append(AbstractC0947i.f4277Q3, 87);
        f4004h.append(AbstractC0947i.f4269P3, 87);
        f4004h.append(AbstractC0947i.f4483o3, 24);
        f4004h.append(AbstractC0947i.f4501q3, 28);
        f4004h.append(AbstractC0947i.f4156C3, 31);
        f4004h.append(AbstractC0947i.f4165D3, 8);
        f4004h.append(AbstractC0947i.f4492p3, 34);
        f4004h.append(AbstractC0947i.f4510r3, 2);
        f4004h.append(AbstractC0947i.f4465m3, 23);
        f4004h.append(AbstractC0947i.f4474n3, 21);
        f4004h.append(AbstractC0947i.f4439j4, 95);
        f4004h.append(AbstractC0947i.f4309U3, 96);
        f4004h.append(AbstractC0947i.f4456l3, 22);
        f4004h.append(AbstractC0947i.f4519s3, 43);
        f4004h.append(AbstractC0947i.f4183F3, 44);
        f4004h.append(AbstractC0947i.f4138A3, 45);
        f4004h.append(AbstractC0947i.f4147B3, 46);
        f4004h.append(AbstractC0947i.f4582z3, 60);
        f4004h.append(AbstractC0947i.f4564x3, 47);
        f4004h.append(AbstractC0947i.f4573y3, 48);
        f4004h.append(AbstractC0947i.f4528t3, 49);
        f4004h.append(AbstractC0947i.f4537u3, 50);
        f4004h.append(AbstractC0947i.f4546v3, 51);
        f4004h.append(AbstractC0947i.f4555w3, 52);
        f4004h.append(AbstractC0947i.f4174E3, 53);
        f4004h.append(AbstractC0947i.f4448k4, 54);
        f4004h.append(AbstractC0947i.f4317V3, 55);
        f4004h.append(AbstractC0947i.f4457l4, 56);
        f4004h.append(AbstractC0947i.f4325W3, 57);
        f4004h.append(AbstractC0947i.f4466m4, 58);
        f4004h.append(AbstractC0947i.f4333X3, 59);
        f4004h.append(AbstractC0947i.f4293S3, 62);
        f4004h.append(AbstractC0947i.f4285R3, 63);
        f4004h.append(AbstractC0947i.f4192G3, 64);
        f4004h.append(AbstractC0947i.f4184F4, 65);
        f4004h.append(AbstractC0947i.f4245M3, 66);
        f4004h.append(AbstractC0947i.f4193G4, 67);
        f4004h.append(AbstractC0947i.f4565x4, 79);
        f4004h.append(AbstractC0947i.f4447k3, 38);
        f4004h.append(AbstractC0947i.f4574y4, 98);
        f4004h.append(AbstractC0947i.f4556w4, 68);
        f4004h.append(AbstractC0947i.f4475n4, 69);
        f4004h.append(AbstractC0947i.f4341Y3, 70);
        f4004h.append(AbstractC0947i.f4228K3, 71);
        f4004h.append(AbstractC0947i.f4210I3, 72);
        f4004h.append(AbstractC0947i.f4219J3, 73);
        f4004h.append(AbstractC0947i.f4237L3, 74);
        f4004h.append(AbstractC0947i.f4201H3, 75);
        f4004h.append(AbstractC0947i.f4583z4, 76);
        f4004h.append(AbstractC0947i.f4394e4, 77);
        f4004h.append(AbstractC0947i.f4202H4, 78);
        f4004h.append(AbstractC0947i.f4261O3, 80);
        f4004h.append(AbstractC0947i.f4253N3, 81);
        f4004h.append(AbstractC0947i.f4139A4, 82);
        f4004h.append(AbstractC0947i.f4175E4, 83);
        f4004h.append(AbstractC0947i.f4166D4, 84);
        f4004h.append(AbstractC0947i.f4157C4, 85);
        f4004h.append(AbstractC0947i.f4148B4, 86);
        f4004h.append(AbstractC0947i.f4547v4, 97);
    }

    /* JADX INFO: renamed from: h */
    private int[] m4053h(View view, String str) {
        int iIntValue;
        Object objM4015h;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < strArrSplit.length) {
            String strTrim = strArrSplit[i3].trim();
            try {
                iIntValue = AbstractC0946h.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objM4015h = ((ConstraintLayout) view.getParent()).m4015h(0, strTrim)) != null && (objM4015h instanceof Integer)) {
                iIntValue = ((Integer) objM4015h).intValue();
            }
            iArr[i4] = iIntValue;
            i3++;
            i4++;
        }
        return i4 != strArrSplit.length ? Arrays.copyOf(iArr, i4) : iArr;
    }

    /* JADX INFO: renamed from: i */
    private a m4054i(Context context, AttributeSet attributeSet, boolean z2) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2 ? AbstractC0947i.f4429i3 : AbstractC0947i.f4524t);
        m4060q(context, aVar, typedArrayObtainStyledAttributes, z2);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    /* JADX INFO: renamed from: j */
    private a m4055j(int i3) {
        if (!this.f4009e.containsKey(Integer.valueOf(i3))) {
            this.f4009e.put(Integer.valueOf(i3), new a());
        }
        return (a) this.f4009e.get(Integer.valueOf(i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static int m4056m(TypedArray typedArray, int i3, int i4) {
        int resourceId = typedArray.getResourceId(i3, i4);
        return resourceId == -1 ? typedArray.getInt(i3, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void m4057n(java.lang.Object r4, android.content.res.TypedArray r5, int r6, int r7) {
        /*
            if (r4 != 0) goto L4
            goto L71
        L4:
            android.util.TypedValue r0 = r5.peekValue(r6)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L72
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L2b
            int r5 = r5.getInt(r6, r2)
            r6 = -4
            r0 = -2
            if (r5 == r6) goto L27
            r6 = -3
            if (r5 == r6) goto L21
            if (r5 == r0) goto L23
            r6 = -1
            if (r5 == r6) goto L23
        L21:
            r5 = r2
            goto L30
        L23:
            r3 = r2
            r2 = r5
            r5 = r3
            goto L30
        L27:
            r2 = 1
            r5 = r2
            r2 = r0
            goto L30
        L2b:
            int r5 = r5.getDimensionPixelSize(r6, r2)
            goto L23
        L30:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.C0937b
            if (r6 == 0) goto L42
            androidx.constraintlayout.widget.ConstraintLayout$b r4 = (androidx.constraintlayout.widget.ConstraintLayout.C0937b) r4
            if (r7 != 0) goto L3d
            r4.width = r2
            r4.f3899Z = r5
            return
        L3d:
            r4.height = r2
            r4.f3901a0 = r5
            return
        L42:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.C0943e.b
            if (r6 == 0) goto L54
            androidx.constraintlayout.widget.e$b r4 = (androidx.constraintlayout.widget.C0943e.b) r4
            if (r7 != 0) goto L4f
            r4.f4063d = r2
            r4.f4082m0 = r5
            return
        L4f:
            r4.f4065e = r2
            r4.f4084n0 = r5
            return
        L54:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.C0943e.a.C2610a
            if (r6 == 0) goto L71
            androidx.constraintlayout.widget.e$a$a r4 = (androidx.constraintlayout.widget.C0943e.a.C2610a) r4
            if (r7 != 0) goto L67
            r6 = 23
            r4.m4074b(r6, r2)
            r6 = 80
            r4.m4076d(r6, r5)
            return
        L67:
            r6 = 21
            r4.m4074b(r6, r2)
            r6 = 81
            r4.m4076d(r6, r5)
        L71:
            return
        L72:
            java.lang.String r5 = r5.getString(r6)
            m4058o(r4, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0943e.m4057n(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    /* JADX INFO: renamed from: o */
    static void m4058o(Object obj, String str, int i3) {
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf(61);
        int length = str.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.C0937b) {
                    ConstraintLayout.C0937b c0937b = (ConstraintLayout.C0937b) obj;
                    if (i3 == 0) {
                        ((ViewGroup.MarginLayoutParams) c0937b).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c0937b).height = 0;
                    }
                    m4059p(c0937b, strTrim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).f4098z = strTrim2;
                    return;
                } else {
                    if (obj instanceof a.C2610a) {
                        ((a.C2610a) obj).m4075c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f3 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.C0937b) {
                        ConstraintLayout.C0937b c0937b2 = (ConstraintLayout.C0937b) obj;
                        if (i3 == 0) {
                            ((ViewGroup.MarginLayoutParams) c0937b2).width = 0;
                            c0937b2.f3884K = f3;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0937b2).height = 0;
                            c0937b2.f3885L = f3;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar = (b) obj;
                        if (i3 == 0) {
                            bVar.f4063d = 0;
                            bVar.f4052V = f3;
                            return;
                        } else {
                            bVar.f4065e = 0;
                            bVar.f4051U = f3;
                            return;
                        }
                    }
                    if (obj instanceof a.C2610a) {
                        a.C2610a c2610a = (a.C2610a) obj;
                        if (i3 == 0) {
                            c2610a.m4074b(23, 0);
                            c2610a.m4073a(39, f3);
                            return;
                        } else {
                            c2610a.m4074b(21, 0);
                            c2610a.m4073a(40, f3);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.C0937b) {
                        ConstraintLayout.C0937b c0937b3 = (ConstraintLayout.C0937b) obj;
                        if (i3 == 0) {
                            ((ViewGroup.MarginLayoutParams) c0937b3).width = 0;
                            c0937b3.f3894U = fMax;
                            c0937b3.f3888O = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0937b3).height = 0;
                            c0937b3.f3895V = fMax;
                            c0937b3.f3889P = 2;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar2 = (b) obj;
                        if (i3 == 0) {
                            bVar2.f4063d = 0;
                            bVar2.f4066e0 = fMax;
                            bVar2.f4055Y = 2;
                            return;
                        } else {
                            bVar2.f4065e = 0;
                            bVar2.f4068f0 = fMax;
                            bVar2.f4056Z = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C2610a) {
                        a.C2610a c2610a2 = (a.C2610a) obj;
                        if (i3 == 0) {
                            c2610a2.m4074b(23, 0);
                            c2610a2.m4074b(54, 2);
                        } else {
                            c2610a2.m4074b(21, 0);
                            c2610a2.m4074b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: p */
    static void m4059p(ConstraintLayout.C0937b c0937b, String str) {
        float fAbs = Float.NaN;
        int i3 = -1;
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i4 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i3 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i3 = 1;
                }
                i4 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i4);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i4, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f3 = Float.parseFloat(strSubstring3);
                        float f4 = Float.parseFloat(strSubstring4);
                        if (f3 > 0.0f && f4 > 0.0f) {
                            fAbs = i3 == 1 ? Math.abs(f4 / f3) : Math.abs(f3 / f4);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c0937b.f3881H = str;
        c0937b.f3882I = fAbs;
        c0937b.f3883J = i3;
    }

    /* JADX INFO: renamed from: q */
    private void m4060q(Context context, a aVar, TypedArray typedArray, boolean z2) {
        if (z2) {
            m4061r(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = typedArray.getIndex(i3);
            if (index != AbstractC0947i.f4542v && AbstractC0947i.f4249N != index && AbstractC0947i.f4257O != index) {
                aVar.f4013d.f4100a = true;
                aVar.f4014e.f4059b = true;
                aVar.f4012c.f4114a = true;
                aVar.f4015f.f4120a = true;
            }
            switch (f4003g.get(index)) {
                case 1:
                    b bVar = aVar.f4014e;
                    bVar.f4089q = m4056m(typedArray, index, bVar.f4089q);
                    break;
                case 2:
                    b bVar2 = aVar.f4014e;
                    bVar2.f4040J = typedArray.getDimensionPixelSize(index, bVar2.f4040J);
                    break;
                case 3:
                    b bVar3 = aVar.f4014e;
                    bVar3.f4087p = m4056m(typedArray, index, bVar3.f4087p);
                    break;
                case 4:
                    b bVar4 = aVar.f4014e;
                    bVar4.f4085o = m4056m(typedArray, index, bVar4.f4085o);
                    break;
                case 5:
                    aVar.f4014e.f4098z = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f4014e;
                    bVar5.f4034D = typedArray.getDimensionPixelOffset(index, bVar5.f4034D);
                    break;
                case 7:
                    b bVar6 = aVar.f4014e;
                    bVar6.f4035E = typedArray.getDimensionPixelOffset(index, bVar6.f4035E);
                    break;
                case 8:
                    b bVar7 = aVar.f4014e;
                    bVar7.f4041K = typedArray.getDimensionPixelSize(index, bVar7.f4041K);
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    b bVar8 = aVar.f4014e;
                    bVar8.f4095w = m4056m(typedArray, index, bVar8.f4095w);
                    break;
                case 10:
                    b bVar9 = aVar.f4014e;
                    bVar9.f4094v = m4056m(typedArray, index, bVar9.f4094v);
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    b bVar10 = aVar.f4014e;
                    bVar10.f4047Q = typedArray.getDimensionPixelSize(index, bVar10.f4047Q);
                    break;
                case 12:
                    b bVar11 = aVar.f4014e;
                    bVar11.f4048R = typedArray.getDimensionPixelSize(index, bVar11.f4048R);
                    break;
                case 13:
                    b bVar12 = aVar.f4014e;
                    bVar12.f4044N = typedArray.getDimensionPixelSize(index, bVar12.f4044N);
                    break;
                case 14:
                    b bVar13 = aVar.f4014e;
                    bVar13.f4046P = typedArray.getDimensionPixelSize(index, bVar13.f4046P);
                    break;
                case 15:
                    b bVar14 = aVar.f4014e;
                    bVar14.f4049S = typedArray.getDimensionPixelSize(index, bVar14.f4049S);
                    break;
                case 16:
                    b bVar15 = aVar.f4014e;
                    bVar15.f4045O = typedArray.getDimensionPixelSize(index, bVar15.f4045O);
                    break;
                case 17:
                    b bVar16 = aVar.f4014e;
                    bVar16.f4067f = typedArray.getDimensionPixelOffset(index, bVar16.f4067f);
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    b bVar17 = aVar.f4014e;
                    bVar17.f4069g = typedArray.getDimensionPixelOffset(index, bVar17.f4069g);
                    break;
                case 19:
                    b bVar18 = aVar.f4014e;
                    bVar18.f4071h = typedArray.getFloat(index, bVar18.f4071h);
                    break;
                case 20:
                    b bVar19 = aVar.f4014e;
                    bVar19.f4096x = typedArray.getFloat(index, bVar19.f4096x);
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    b bVar20 = aVar.f4014e;
                    bVar20.f4065e = typedArray.getLayoutDimension(index, bVar20.f4065e);
                    break;
                case 22:
                    d dVar = aVar.f4012c;
                    dVar.f4115b = typedArray.getInt(index, dVar.f4115b);
                    d dVar2 = aVar.f4012c;
                    dVar2.f4115b = f4002f[dVar2.f4115b];
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    b bVar21 = aVar.f4014e;
                    bVar21.f4063d = typedArray.getLayoutDimension(index, bVar21.f4063d);
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    b bVar22 = aVar.f4014e;
                    bVar22.f4037G = typedArray.getDimensionPixelSize(index, bVar22.f4037G);
                    break;
                case 25:
                    b bVar23 = aVar.f4014e;
                    bVar23.f4073i = m4056m(typedArray, index, bVar23.f4073i);
                    break;
                case 26:
                    b bVar24 = aVar.f4014e;
                    bVar24.f4075j = m4056m(typedArray, index, bVar24.f4075j);
                    break;
                case 27:
                    b bVar25 = aVar.f4014e;
                    bVar25.f4036F = typedArray.getInt(index, bVar25.f4036F);
                    break;
                case 28:
                    b bVar26 = aVar.f4014e;
                    bVar26.f4038H = typedArray.getDimensionPixelSize(index, bVar26.f4038H);
                    break;
                case 29:
                    b bVar27 = aVar.f4014e;
                    bVar27.f4077k = m4056m(typedArray, index, bVar27.f4077k);
                    break;
                case 30:
                    b bVar28 = aVar.f4014e;
                    bVar28.f4079l = m4056m(typedArray, index, bVar28.f4079l);
                    break;
                case 31:
                    b bVar29 = aVar.f4014e;
                    bVar29.f4042L = typedArray.getDimensionPixelSize(index, bVar29.f4042L);
                    break;
                case 32:
                    b bVar30 = aVar.f4014e;
                    bVar30.f4092t = m4056m(typedArray, index, bVar30.f4092t);
                    break;
                case 33:
                    b bVar31 = aVar.f4014e;
                    bVar31.f4093u = m4056m(typedArray, index, bVar31.f4093u);
                    break;
                case 34:
                    b bVar32 = aVar.f4014e;
                    bVar32.f4039I = typedArray.getDimensionPixelSize(index, bVar32.f4039I);
                    break;
                case 35:
                    b bVar33 = aVar.f4014e;
                    bVar33.f4083n = m4056m(typedArray, index, bVar33.f4083n);
                    break;
                case 36:
                    b bVar34 = aVar.f4014e;
                    bVar34.f4081m = m4056m(typedArray, index, bVar34.f4081m);
                    break;
                case 37:
                    b bVar35 = aVar.f4014e;
                    bVar35.f4097y = typedArray.getFloat(index, bVar35.f4097y);
                    break;
                case 38:
                    aVar.f4010a = typedArray.getResourceId(index, aVar.f4010a);
                    break;
                case 39:
                    b bVar36 = aVar.f4014e;
                    bVar36.f4052V = typedArray.getFloat(index, bVar36.f4052V);
                    break;
                case 40:
                    b bVar37 = aVar.f4014e;
                    bVar37.f4051U = typedArray.getFloat(index, bVar37.f4051U);
                    break;
                case 41:
                    b bVar38 = aVar.f4014e;
                    bVar38.f4053W = typedArray.getInt(index, bVar38.f4053W);
                    break;
                case 42:
                    b bVar39 = aVar.f4014e;
                    bVar39.f4054X = typedArray.getInt(index, bVar39.f4054X);
                    break;
                case 43:
                    d dVar3 = aVar.f4012c;
                    dVar3.f4117d = typedArray.getFloat(index, dVar3.f4117d);
                    break;
                case 44:
                    e eVar = aVar.f4015f;
                    eVar.f4132m = true;
                    eVar.f4133n = typedArray.getDimension(index, eVar.f4133n);
                    break;
                case 45:
                    e eVar2 = aVar.f4015f;
                    eVar2.f4122c = typedArray.getFloat(index, eVar2.f4122c);
                    break;
                case 46:
                    e eVar3 = aVar.f4015f;
                    eVar3.f4123d = typedArray.getFloat(index, eVar3.f4123d);
                    break;
                case 47:
                    e eVar4 = aVar.f4015f;
                    eVar4.f4124e = typedArray.getFloat(index, eVar4.f4124e);
                    break;
                case 48:
                    e eVar5 = aVar.f4015f;
                    eVar5.f4125f = typedArray.getFloat(index, eVar5.f4125f);
                    break;
                case 49:
                    e eVar6 = aVar.f4015f;
                    eVar6.f4126g = typedArray.getDimension(index, eVar6.f4126g);
                    break;
                case 50:
                    e eVar7 = aVar.f4015f;
                    eVar7.f4127h = typedArray.getDimension(index, eVar7.f4127h);
                    break;
                case 51:
                    e eVar8 = aVar.f4015f;
                    eVar8.f4129j = typedArray.getDimension(index, eVar8.f4129j);
                    break;
                case 52:
                    e eVar9 = aVar.f4015f;
                    eVar9.f4130k = typedArray.getDimension(index, eVar9.f4130k);
                    break;
                case 53:
                    e eVar10 = aVar.f4015f;
                    eVar10.f4131l = typedArray.getDimension(index, eVar10.f4131l);
                    break;
                case 54:
                    b bVar40 = aVar.f4014e;
                    bVar40.f4055Y = typedArray.getInt(index, bVar40.f4055Y);
                    break;
                case 55:
                    b bVar41 = aVar.f4014e;
                    bVar41.f4056Z = typedArray.getInt(index, bVar41.f4056Z);
                    break;
                case 56:
                    b bVar42 = aVar.f4014e;
                    bVar42.f4058a0 = typedArray.getDimensionPixelSize(index, bVar42.f4058a0);
                    break;
                case 57:
                    b bVar43 = aVar.f4014e;
                    bVar43.f4060b0 = typedArray.getDimensionPixelSize(index, bVar43.f4060b0);
                    break;
                case 58:
                    b bVar44 = aVar.f4014e;
                    bVar44.f4062c0 = typedArray.getDimensionPixelSize(index, bVar44.f4062c0);
                    break;
                case 59:
                    b bVar45 = aVar.f4014e;
                    bVar45.f4064d0 = typedArray.getDimensionPixelSize(index, bVar45.f4064d0);
                    break;
                case 60:
                    e eVar11 = aVar.f4015f;
                    eVar11.f4121b = typedArray.getFloat(index, eVar11.f4121b);
                    break;
                case 61:
                    b bVar46 = aVar.f4014e;
                    bVar46.f4031A = m4056m(typedArray, index, bVar46.f4031A);
                    break;
                case 62:
                    b bVar47 = aVar.f4014e;
                    bVar47.f4032B = typedArray.getDimensionPixelSize(index, bVar47.f4032B);
                    break;
                case 63:
                    b bVar48 = aVar.f4014e;
                    bVar48.f4033C = typedArray.getFloat(index, bVar48.f4033C);
                    break;
                case 64:
                    c cVar = aVar.f4013d;
                    cVar.f4101b = m4056m(typedArray, index, cVar.f4101b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f4013d.f4103d = typedArray.getString(index);
                    } else {
                        aVar.f4013d.f4103d = C2346a.f10783c[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    aVar.f4013d.f4105f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f4013d;
                    cVar2.f4108i = typedArray.getFloat(index, cVar2.f4108i);
                    break;
                case 68:
                    d dVar4 = aVar.f4012c;
                    dVar4.f4118e = typedArray.getFloat(index, dVar4.f4118e);
                    break;
                case 69:
                    aVar.f4014e.f4066e0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f4014e.f4068f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f4014e;
                    bVar49.f4070g0 = typedArray.getInt(index, bVar49.f4070g0);
                    break;
                case 73:
                    b bVar50 = aVar.f4014e;
                    bVar50.f4072h0 = typedArray.getDimensionPixelSize(index, bVar50.f4072h0);
                    break;
                case 74:
                    aVar.f4014e.f4078k0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f4014e;
                    bVar51.f4086o0 = typedArray.getBoolean(index, bVar51.f4086o0);
                    break;
                case 76:
                    c cVar3 = aVar.f4013d;
                    cVar3.f4104e = typedArray.getInt(index, cVar3.f4104e);
                    break;
                case 77:
                    aVar.f4014e.f4080l0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f4012c;
                    dVar5.f4116c = typedArray.getInt(index, dVar5.f4116c);
                    break;
                case 79:
                    c cVar4 = aVar.f4013d;
                    cVar4.f4106g = typedArray.getFloat(index, cVar4.f4106g);
                    break;
                case 80:
                    b bVar52 = aVar.f4014e;
                    bVar52.f4082m0 = typedArray.getBoolean(index, bVar52.f4082m0);
                    break;
                case 81:
                    b bVar53 = aVar.f4014e;
                    bVar53.f4084n0 = typedArray.getBoolean(index, bVar53.f4084n0);
                    break;
                case 82:
                    c cVar5 = aVar.f4013d;
                    cVar5.f4102c = typedArray.getInteger(index, cVar5.f4102c);
                    break;
                case 83:
                    e eVar12 = aVar.f4015f;
                    eVar12.f4128i = m4056m(typedArray, index, eVar12.f4128i);
                    break;
                case 84:
                    c cVar6 = aVar.f4013d;
                    cVar6.f4110k = typedArray.getInteger(index, cVar6.f4110k);
                    break;
                case 85:
                    c cVar7 = aVar.f4013d;
                    cVar7.f4109j = typedArray.getFloat(index, cVar7.f4109j);
                    break;
                case 86:
                    int i4 = typedArray.peekValue(index).type;
                    if (i4 == 1) {
                        aVar.f4013d.f4113n = typedArray.getResourceId(index, -1);
                        c cVar8 = aVar.f4013d;
                        if (cVar8.f4113n != -1) {
                            cVar8.f4112m = -2;
                        }
                    } else if (i4 == 3) {
                        aVar.f4013d.f4111l = typedArray.getString(index);
                        if (aVar.f4013d.f4111l.indexOf("/") > 0) {
                            aVar.f4013d.f4113n = typedArray.getResourceId(index, -1);
                            aVar.f4013d.f4112m = -2;
                        } else {
                            aVar.f4013d.f4112m = -1;
                        }
                    } else {
                        c cVar9 = aVar.f4013d;
                        cVar9.f4112m = typedArray.getInteger(index, cVar9.f4113n);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f4003g.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f4003g.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f4014e;
                    bVar54.f4090r = m4056m(typedArray, index, bVar54.f4090r);
                    break;
                case 92:
                    b bVar55 = aVar.f4014e;
                    bVar55.f4091s = m4056m(typedArray, index, bVar55.f4091s);
                    break;
                case 93:
                    b bVar56 = aVar.f4014e;
                    bVar56.f4043M = typedArray.getDimensionPixelSize(index, bVar56.f4043M);
                    break;
                case 94:
                    b bVar57 = aVar.f4014e;
                    bVar57.f4050T = typedArray.getDimensionPixelSize(index, bVar57.f4050T);
                    break;
                case 95:
                    m4057n(aVar.f4014e, typedArray, index, 0);
                    break;
                case 96:
                    m4057n(aVar.f4014e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f4014e;
                    bVar58.f4088p0 = typedArray.getInt(index, bVar58.f4088p0);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    private static void m4061r(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C2610a c2610a = new a.C2610a();
        aVar.f4017h = c2610a;
        aVar.f4013d.f4100a = false;
        aVar.f4014e.f4059b = false;
        aVar.f4012c.f4114a = false;
        aVar.f4015f.f4120a = false;
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = typedArray.getIndex(i3);
            switch (f4004h.get(index)) {
                case 2:
                    c2610a.m4074b(2, typedArray.getDimensionPixelSize(index, aVar.f4014e.f4040J));
                    break;
                case 3:
                case 4:
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f4003g.get(index));
                    break;
                case 5:
                    c2610a.m4075c(5, typedArray.getString(index));
                    break;
                case 6:
                    c2610a.m4074b(6, typedArray.getDimensionPixelOffset(index, aVar.f4014e.f4034D));
                    break;
                case 7:
                    c2610a.m4074b(7, typedArray.getDimensionPixelOffset(index, aVar.f4014e.f4035E));
                    break;
                case 8:
                    c2610a.m4074b(8, typedArray.getDimensionPixelSize(index, aVar.f4014e.f4041K));
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    c2610a.m4074b(11, typedArray.getDimensionPixelSize(index, aVar.f4014e.f4047Q));
                    break;
                case 12:
                    c2610a.m4074b(12, typedArray.getDimensionPixelSize(index, aVar.f4014e.f4048R));
                    break;
                case 13:
                    c2610a.m4074b(13, typedArray.getDimensionPixelSize(index, aVar.f4014e.f4044N));
                    break;
                case 14:
                    c2610a.m4074b(14, typedArray.getDimensionPixelSize(index, aVar.f4014e.f4046P));
                    break;
                case 15:
                    c2610a.m4074b(15, typedArray.getDimensionPixelSize(index, aVar.f4014e.f4049S));
                    break;
                case 16:
                    c2610a.m4074b(16, typedArray.getDimensionPixelSize(index, aVar.f4014e.f4045O));
                    break;
                case 17:
                    c2610a.m4074b(17, typedArray.getDimensionPixelOffset(index, aVar.f4014e.f4067f));
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    c2610a.m4074b(18, typedArray.getDimensionPixelOffset(index, aVar.f4014e.f4069g));
                    break;
                case 19:
                    c2610a.m4073a(19, typedArray.getFloat(index, aVar.f4014e.f4071h));
                    break;
                case 20:
                    c2610a.m4073a(20, typedArray.getFloat(index, aVar.f4014e.f4096x));
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    c2610a.m4074b(21, typedArray.getLayoutDimension(index, aVar.f4014e.f4065e));
                    break;
                case 22:
                    c2610a.m4074b(22, f4002f[typedArray.getInt(index, aVar.f4012c.f4115b)]);
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    c2610a.m4074b(23, typedArray.getLayoutDimension(index, aVar.f4014e.f4063d));
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    c2610a.m4074b(24, typedArray.getDimensionPixelSize(index, aVar.f4014e.f4037G));
                    break;
                case 27:
                    c2610a.m4074b(27, typedArray.getInt(index, aVar.f4014e.f4036F));
                    break;
                case 28:
                    c2610a.m4074b(28, typedArray.getDimensionPixelSize(index, aVar.f4014e.f4038H));
                    break;
                case 31:
                    c2610a.m4074b(31, typedArray.getDimensionPixelSize(index, aVar.f4014e.f4042L));
                    break;
                case 34:
                    c2610a.m4074b(34, typedArray.getDimensionPixelSize(index, aVar.f4014e.f4039I));
                    break;
                case 37:
                    c2610a.m4073a(37, typedArray.getFloat(index, aVar.f4014e.f4097y));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f4010a);
                    aVar.f4010a = resourceId;
                    c2610a.m4074b(38, resourceId);
                    break;
                case 39:
                    c2610a.m4073a(39, typedArray.getFloat(index, aVar.f4014e.f4052V));
                    break;
                case 40:
                    c2610a.m4073a(40, typedArray.getFloat(index, aVar.f4014e.f4051U));
                    break;
                case 41:
                    c2610a.m4074b(41, typedArray.getInt(index, aVar.f4014e.f4053W));
                    break;
                case 42:
                    c2610a.m4074b(42, typedArray.getInt(index, aVar.f4014e.f4054X));
                    break;
                case 43:
                    c2610a.m4073a(43, typedArray.getFloat(index, aVar.f4012c.f4117d));
                    break;
                case 44:
                    c2610a.m4076d(44, true);
                    c2610a.m4073a(44, typedArray.getDimension(index, aVar.f4015f.f4133n));
                    break;
                case 45:
                    c2610a.m4073a(45, typedArray.getFloat(index, aVar.f4015f.f4122c));
                    break;
                case 46:
                    c2610a.m4073a(46, typedArray.getFloat(index, aVar.f4015f.f4123d));
                    break;
                case 47:
                    c2610a.m4073a(47, typedArray.getFloat(index, aVar.f4015f.f4124e));
                    break;
                case 48:
                    c2610a.m4073a(48, typedArray.getFloat(index, aVar.f4015f.f4125f));
                    break;
                case 49:
                    c2610a.m4073a(49, typedArray.getDimension(index, aVar.f4015f.f4126g));
                    break;
                case 50:
                    c2610a.m4073a(50, typedArray.getDimension(index, aVar.f4015f.f4127h));
                    break;
                case 51:
                    c2610a.m4073a(51, typedArray.getDimension(index, aVar.f4015f.f4129j));
                    break;
                case 52:
                    c2610a.m4073a(52, typedArray.getDimension(index, aVar.f4015f.f4130k));
                    break;
                case 53:
                    c2610a.m4073a(53, typedArray.getDimension(index, aVar.f4015f.f4131l));
                    break;
                case 54:
                    c2610a.m4074b(54, typedArray.getInt(index, aVar.f4014e.f4055Y));
                    break;
                case 55:
                    c2610a.m4074b(55, typedArray.getInt(index, aVar.f4014e.f4056Z));
                    break;
                case 56:
                    c2610a.m4074b(56, typedArray.getDimensionPixelSize(index, aVar.f4014e.f4058a0));
                    break;
                case 57:
                    c2610a.m4074b(57, typedArray.getDimensionPixelSize(index, aVar.f4014e.f4060b0));
                    break;
                case 58:
                    c2610a.m4074b(58, typedArray.getDimensionPixelSize(index, aVar.f4014e.f4062c0));
                    break;
                case 59:
                    c2610a.m4074b(59, typedArray.getDimensionPixelSize(index, aVar.f4014e.f4064d0));
                    break;
                case 60:
                    c2610a.m4073a(60, typedArray.getFloat(index, aVar.f4015f.f4121b));
                    break;
                case 62:
                    c2610a.m4074b(62, typedArray.getDimensionPixelSize(index, aVar.f4014e.f4032B));
                    break;
                case 63:
                    c2610a.m4073a(63, typedArray.getFloat(index, aVar.f4014e.f4033C));
                    break;
                case 64:
                    c2610a.m4074b(64, m4056m(typedArray, index, aVar.f4013d.f4101b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c2610a.m4075c(65, typedArray.getString(index));
                    } else {
                        c2610a.m4075c(65, C2346a.f10783c[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    c2610a.m4074b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c2610a.m4073a(67, typedArray.getFloat(index, aVar.f4013d.f4108i));
                    break;
                case 68:
                    c2610a.m4073a(68, typedArray.getFloat(index, aVar.f4012c.f4118e));
                    break;
                case 69:
                    c2610a.m4073a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c2610a.m4073a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c2610a.m4074b(72, typedArray.getInt(index, aVar.f4014e.f4070g0));
                    break;
                case 73:
                    c2610a.m4074b(73, typedArray.getDimensionPixelSize(index, aVar.f4014e.f4072h0));
                    break;
                case 74:
                    c2610a.m4075c(74, typedArray.getString(index));
                    break;
                case 75:
                    c2610a.m4076d(75, typedArray.getBoolean(index, aVar.f4014e.f4086o0));
                    break;
                case 76:
                    c2610a.m4074b(76, typedArray.getInt(index, aVar.f4013d.f4104e));
                    break;
                case 77:
                    c2610a.m4075c(77, typedArray.getString(index));
                    break;
                case 78:
                    c2610a.m4074b(78, typedArray.getInt(index, aVar.f4012c.f4116c));
                    break;
                case 79:
                    c2610a.m4073a(79, typedArray.getFloat(index, aVar.f4013d.f4106g));
                    break;
                case 80:
                    c2610a.m4076d(80, typedArray.getBoolean(index, aVar.f4014e.f4082m0));
                    break;
                case 81:
                    c2610a.m4076d(81, typedArray.getBoolean(index, aVar.f4014e.f4084n0));
                    break;
                case 82:
                    c2610a.m4074b(82, typedArray.getInteger(index, aVar.f4013d.f4102c));
                    break;
                case 83:
                    c2610a.m4074b(83, m4056m(typedArray, index, aVar.f4015f.f4128i));
                    break;
                case 84:
                    c2610a.m4074b(84, typedArray.getInteger(index, aVar.f4013d.f4110k));
                    break;
                case 85:
                    c2610a.m4073a(85, typedArray.getFloat(index, aVar.f4013d.f4109j));
                    break;
                case 86:
                    int i4 = typedArray.peekValue(index).type;
                    if (i4 == 1) {
                        aVar.f4013d.f4113n = typedArray.getResourceId(index, -1);
                        c2610a.m4074b(89, aVar.f4013d.f4113n);
                        c cVar = aVar.f4013d;
                        if (cVar.f4113n != -1) {
                            cVar.f4112m = -2;
                            c2610a.m4074b(88, -2);
                        }
                    } else if (i4 == 3) {
                        aVar.f4013d.f4111l = typedArray.getString(index);
                        c2610a.m4075c(90, aVar.f4013d.f4111l);
                        if (aVar.f4013d.f4111l.indexOf("/") > 0) {
                            aVar.f4013d.f4113n = typedArray.getResourceId(index, -1);
                            c2610a.m4074b(89, aVar.f4013d.f4113n);
                            aVar.f4013d.f4112m = -2;
                            c2610a.m4074b(88, -2);
                        } else {
                            aVar.f4013d.f4112m = -1;
                            c2610a.m4074b(88, -1);
                        }
                    } else {
                        c cVar2 = aVar.f4013d;
                        cVar2.f4112m = typedArray.getInteger(index, cVar2.f4113n);
                        c2610a.m4074b(88, aVar.f4013d.f4112m);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f4003g.get(index));
                    break;
                case 93:
                    c2610a.m4074b(93, typedArray.getDimensionPixelSize(index, aVar.f4014e.f4043M));
                    break;
                case 94:
                    c2610a.m4074b(94, typedArray.getDimensionPixelSize(index, aVar.f4014e.f4050T));
                    break;
                case 95:
                    m4057n(c2610a, typedArray, index, 0);
                    break;
                case 96:
                    m4057n(c2610a, typedArray, index, 1);
                    break;
                case 97:
                    c2610a.m4074b(97, typedArray.getInt(index, aVar.f4014e.f4088p0));
                    break;
                case 98:
                    if (AbstractC2455b.f11436y) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f4010a);
                        aVar.f4010a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.f4011b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f4011b = typedArray.getString(index);
                    } else {
                        aVar.f4010a = typedArray.getResourceId(index, aVar.f4010a);
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m4062c(ConstraintLayout constraintLayout) {
        m4063d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* JADX INFO: renamed from: d */
    void m4063d(ConstraintLayout constraintLayout, boolean z2) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f4009e.keySet());
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = constraintLayout.getChildAt(i3);
            int id = childAt.getId();
            if (!this.f4009e.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + AbstractC2454a.m11754a(childAt));
            } else {
                if (this.f4008d && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f4009e.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = (a) this.f4009e.get(Integer.valueOf(id));
                        if (aVar != null) {
                            if (childAt instanceof C0939a) {
                                aVar.f4014e.f4074i0 = 1;
                                C0939a c0939a = (C0939a) childAt;
                                c0939a.setId(id);
                                c0939a.setType(aVar.f4014e.f4070g0);
                                c0939a.setMargin(aVar.f4014e.f4072h0);
                                c0939a.setAllowsGoneWidget(aVar.f4014e.f4086o0);
                                b bVar = aVar.f4014e;
                                int[] iArr = bVar.f4076j0;
                                if (iArr != null) {
                                    c0939a.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f4078k0;
                                    if (str != null) {
                                        bVar.f4076j0 = m4053h(c0939a, str);
                                        c0939a.setReferencedIds(aVar.f4014e.f4076j0);
                                    }
                                }
                            }
                            ConstraintLayout.C0937b c0937b = (ConstraintLayout.C0937b) childAt.getLayoutParams();
                            c0937b.m4024a();
                            aVar.m4071b(c0937b);
                            if (z2) {
                                C0940b.m4032c(childAt, aVar.f4016g);
                            }
                            childAt.setLayoutParams(c0937b);
                            d dVar = aVar.f4012c;
                            if (dVar.f4116c == 0) {
                                childAt.setVisibility(dVar.f4115b);
                            }
                            childAt.setAlpha(aVar.f4012c.f4117d);
                            childAt.setRotation(aVar.f4015f.f4121b);
                            childAt.setRotationX(aVar.f4015f.f4122c);
                            childAt.setRotationY(aVar.f4015f.f4123d);
                            childAt.setScaleX(aVar.f4015f.f4124e);
                            childAt.setScaleY(aVar.f4015f.f4125f);
                            e eVar = aVar.f4015f;
                            if (eVar.f4128i != -1) {
                                if (((View) childAt.getParent()).findViewById(aVar.f4015f.f4128i) != null) {
                                    float top = (r4.getTop() + r4.getBottom()) / 2.0f;
                                    float left = (r4.getLeft() + r4.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f4126g)) {
                                    childAt.setPivotX(aVar.f4015f.f4126g);
                                }
                                if (!Float.isNaN(aVar.f4015f.f4127h)) {
                                    childAt.setPivotY(aVar.f4015f.f4127h);
                                }
                            }
                            childAt.setTranslationX(aVar.f4015f.f4129j);
                            childAt.setTranslationY(aVar.f4015f.f4130k);
                            childAt.setTranslationZ(aVar.f4015f.f4131l);
                            e eVar2 = aVar.f4015f;
                            if (eVar2.f4132m) {
                                childAt.setElevation(eVar2.f4133n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar2 = (a) this.f4009e.get(num);
            if (aVar2 != null) {
                if (aVar2.f4014e.f4074i0 == 1) {
                    C0939a c0939a2 = new C0939a(constraintLayout.getContext());
                    c0939a2.setId(num.intValue());
                    b bVar2 = aVar2.f4014e;
                    int[] iArr2 = bVar2.f4076j0;
                    if (iArr2 != null) {
                        c0939a2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar2.f4078k0;
                        if (str2 != null) {
                            bVar2.f4076j0 = m4053h(c0939a2, str2);
                            c0939a2.setReferencedIds(aVar2.f4014e.f4076j0);
                        }
                    }
                    c0939a2.setType(aVar2.f4014e.f4070g0);
                    c0939a2.setMargin(aVar2.f4014e.f4072h0);
                    ConstraintLayout.C0937b c0937bM4013f = constraintLayout.generateDefaultLayoutParams();
                    c0939a2.m4046o();
                    aVar2.m4071b(c0937bM4013f);
                    constraintLayout.addView(c0939a2, c0937bM4013f);
                }
                if (aVar2.f4014e.f4057a) {
                    View c0945g = new C0945g(constraintLayout.getContext());
                    c0945g.setId(num.intValue());
                    ConstraintLayout.C0937b c0937bM4013f2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.m4071b(c0937bM4013f2);
                    constraintLayout.addView(c0945g, c0937bM4013f2);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = constraintLayout.getChildAt(i4);
            if (childAt2 instanceof AbstractC0941c) {
                ((AbstractC0941c) childAt2).mo4041f(constraintLayout);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m4064e(Context context, int i3) {
        m4065f((ConstraintLayout) LayoutInflater.from(context).inflate(i3, (ViewGroup) null));
    }

    /* JADX INFO: renamed from: f */
    public void m4065f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f4009e.clear();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = constraintLayout.getChildAt(i3);
            ConstraintLayout.C0937b c0937b = (ConstraintLayout.C0937b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f4008d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f4009e.containsKey(Integer.valueOf(id))) {
                this.f4009e.put(Integer.valueOf(id), new a());
            }
            a aVar = (a) this.f4009e.get(Integer.valueOf(id));
            if (aVar != null) {
                aVar.f4016g = C0940b.m4030a(this.f4007c, childAt);
                aVar.m4070d(id, c0937b);
                aVar.f4012c.f4115b = childAt.getVisibility();
                aVar.f4012c.f4117d = childAt.getAlpha();
                aVar.f4015f.f4121b = childAt.getRotation();
                aVar.f4015f.f4122c = childAt.getRotationX();
                aVar.f4015f.f4123d = childAt.getRotationY();
                aVar.f4015f.f4124e = childAt.getScaleX();
                aVar.f4015f.f4125f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f4015f;
                    eVar.f4126g = pivotX;
                    eVar.f4127h = pivotY;
                }
                aVar.f4015f.f4129j = childAt.getTranslationX();
                aVar.f4015f.f4130k = childAt.getTranslationY();
                aVar.f4015f.f4131l = childAt.getTranslationZ();
                e eVar2 = aVar.f4015f;
                if (eVar2.f4132m) {
                    eVar2.f4133n = childAt.getElevation();
                }
                if (childAt instanceof C0939a) {
                    C0939a c0939a = (C0939a) childAt;
                    aVar.f4014e.f4086o0 = c0939a.getAllowsGoneWidget();
                    aVar.f4014e.f4076j0 = c0939a.getReferencedIds();
                    aVar.f4014e.f4070g0 = c0939a.getType();
                    aVar.f4014e.f4072h0 = c0939a.getMargin();
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m4066g(int i3, int i4, int i5, float f3) {
        b bVar = m4055j(i3).f4014e;
        bVar.f4031A = i4;
        bVar.f4032B = i5;
        bVar.f4033C = f3;
    }

    /* JADX INFO: renamed from: k */
    public void m4067k(Context context, int i3) {
        XmlResourceParser xml = context.getResources().getXml(i3);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarM4054i = m4054i(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarM4054i.f4014e.f4057a = true;
                    }
                    this.f4009e.put(Integer.valueOf(aVarM4054i.f4010a), aVarM4054i);
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x01ce, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4068l(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0943e.m4068l(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
