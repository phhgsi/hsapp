package p160w1;

import p160w1.InterfaceC2496d;

/* JADX INFO: renamed from: w1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2493a {

    /* JADX INFO: renamed from: a */
    private int f11644a;

    /* JADX INFO: renamed from: b */
    private InterfaceC2496d.a f11645b = InterfaceC2496d.a.DEFAULT;

    /* JADX INFO: renamed from: w1.a$a */
    private static final class a implements InterfaceC2496d {

        /* JADX INFO: renamed from: a */
        private final int f11646a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC2496d.a f11647b;

        a(int i3, InterfaceC2496d.a aVar) {
            this.f11646a = i3;
            this.f11647b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return InterfaceC2496d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InterfaceC2496d)) {
                return false;
            }
            InterfaceC2496d interfaceC2496d = (InterfaceC2496d) obj;
            return this.f11646a == interfaceC2496d.tag() && this.f11647b.equals(interfaceC2496d.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f11646a) + (this.f11647b.hashCode() ^ 2041407134);
        }

        @Override // p160w1.InterfaceC2496d
        public InterfaceC2496d.a intEncoding() {
            return this.f11647b;
        }

        @Override // p160w1.InterfaceC2496d
        public int tag() {
            return this.f11646a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f11646a + "intEncoding=" + this.f11647b + ')';
        }
    }

    /* JADX INFO: renamed from: b */
    public static C2493a m11858b() {
        return new C2493a();
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC2496d m11859a() {
        return new a(this.f11644a, this.f11645b);
    }

    /* JADX INFO: renamed from: c */
    public C2493a m11860c(int i3) {
        this.f11644a = i3;
        return this;
    }
}
