package androidx.loader.app;

import androidx.appcompat.app.AbstractC0740E;
import androidx.collection.C0930j;
import androidx.lifecycle.AbstractC1105F;
import androidx.lifecycle.AbstractC1107H;
import androidx.lifecycle.C1106G;
import androidx.lifecycle.C1109J;
import androidx.lifecycle.InterfaceC1132n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p024I.AbstractC0205b;
import p069X.AbstractC0589a;

/* JADX INFO: renamed from: androidx.loader.app.b */
/* JADX INFO: loaded from: classes.dex */
class C1146b extends AbstractC1145a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1132n f5389a;

    /* JADX INFO: renamed from: b */
    private final a f5390b;

    /* JADX INFO: renamed from: androidx.loader.app.b$a */
    static class a extends AbstractC1105F {

        /* JADX INFO: renamed from: f */
        private static final C1106G.b f5391f = new C2617a();

        /* JADX INFO: renamed from: d */
        private C0930j f5392d = new C0930j();

        /* JADX INFO: renamed from: e */
        private boolean f5393e = false;

        /* JADX INFO: renamed from: androidx.loader.app.b$a$a, reason: collision with other inner class name */
        static class C2617a implements C1106G.b {
            C2617a() {
            }

            @Override // androidx.lifecycle.C1106G.b
            /* JADX INFO: renamed from: a */
            public AbstractC1105F mo2118a(Class cls) {
                return new a();
            }

            @Override // androidx.lifecycle.C1106G.b
            /* JADX INFO: renamed from: b */
            public /* synthetic */ AbstractC1105F mo2119b(Class cls, AbstractC0589a abstractC0589a) {
                return AbstractC1107H.m5085b(this, cls, abstractC0589a);
            }
        }

        a() {
        }

        /* JADX INFO: renamed from: g */
        static a m5198g(C1109J c1109j) {
            return (a) new C1106G(c1109j, f5391f).m5075a(a.class);
        }

        @Override // androidx.lifecycle.AbstractC1105F
        /* JADX INFO: renamed from: d */
        protected void mo4984d() {
            super.mo4984d();
            if (this.f5392d.m3957i() <= 0) {
                this.f5392d.m3950b();
            } else {
                AbstractC0740E.m2693a(this.f5392d.m3958j(0));
                throw null;
            }
        }

        /* JADX INFO: renamed from: f */
        public void m5199f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f5392d.m3957i() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("    ");
                if (this.f5392d.m3957i() <= 0) {
                    return;
                }
                AbstractC0740E.m2693a(this.f5392d.m3958j(0));
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f5392d.m3955g(0));
                printWriter.print(": ");
                throw null;
            }
        }

        /* JADX INFO: renamed from: h */
        void m5200h() {
            if (this.f5392d.m3957i() <= 0) {
                return;
            }
            AbstractC0740E.m2693a(this.f5392d.m3958j(0));
            throw null;
        }
    }

    C1146b(InterfaceC1132n interfaceC1132n, C1109J c1109j) {
        this.f5389a = interfaceC1132n;
        this.f5390b = a.m5198g(c1109j);
    }

    @Override // androidx.loader.app.AbstractC1145a
    /* JADX INFO: renamed from: a */
    public void mo5196a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f5390b.m5199f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.AbstractC1145a
    /* JADX INFO: renamed from: c */
    public void mo5197c() {
        this.f5390b.m5200h();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractC0205b.m595a(this.f5389a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
