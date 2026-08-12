package p092d0;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import p012E.AbstractC0123t;
import p035L1.C0388t;
import p041N1.InterfaceC0442e;
import p044O1.AbstractC0452b;
import p047P1.AbstractC0476g;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;
import p079a0.C0657b;
import p102f2.C1938j;

/* JADX INFO: renamed from: d0.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1783n {

    /* JADX INFO: renamed from: a */
    public static final b f9142a = new b(null);

    /* JADX INFO: renamed from: d0.n$b */
    public static final class b {
        public /* synthetic */ b(AbstractC0602g abstractC0602g) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC1783n m9534a(Context context) {
            AbstractC0606k.m2145e(context, "context");
            StringBuilder sb = new StringBuilder();
            sb.append("AdServicesInfo.version=");
            C0657b c0657b = C0657b.f2344a;
            sb.append(c0657b.m2496a());
            Log.d("MeasurementManager", sb.toString());
            if (c0657b.m2496a() >= 5) {
                return new a(context);
            }
            return null;
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo9521a(AbstractC1770a abstractC1770a, InterfaceC0442e interfaceC0442e);

    /* JADX INFO: renamed from: b */
    public abstract Object mo9522b(InterfaceC0442e interfaceC0442e);

    /* JADX INFO: renamed from: c */
    public abstract Object mo9523c(Uri uri, InputEvent inputEvent, InterfaceC0442e interfaceC0442e);

    /* JADX INFO: renamed from: d */
    public abstract Object mo9524d(Uri uri, InterfaceC0442e interfaceC0442e);

    /* JADX INFO: renamed from: e */
    public abstract Object mo9525e(AbstractC1784o abstractC1784o, InterfaceC0442e interfaceC0442e);

    /* JADX INFO: renamed from: f */
    public abstract Object mo9526f(AbstractC1785p abstractC1785p, InterfaceC0442e interfaceC0442e);

    /* JADX INFO: renamed from: d0.n$a */
    private static final class a extends AbstractC1783n {

        /* JADX INFO: renamed from: b */
        private final MeasurementManager f9143b;

        public a(MeasurementManager measurementManager) {
            AbstractC0606k.m2145e(measurementManager, "mMeasurementManager");
            this.f9143b = measurementManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public final DeletionRequest m9531k(AbstractC1770a abstractC1770a) {
            AbstractC1780k.m9519a();
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: l */
        public final WebSourceRegistrationRequest m9532l(AbstractC1784o abstractC1784o) {
            AbstractC1781l.m9520a();
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: m */
        public final WebTriggerRegistrationRequest m9533m(AbstractC1785p abstractC1785p) {
            AbstractC1772c.m9511a();
            throw null;
        }

        @Override // p092d0.AbstractC1783n
        /* JADX INFO: renamed from: a */
        public Object mo9521a(AbstractC1770a abstractC1770a, InterfaceC0442e interfaceC0442e) throws Throwable {
            C1938j c1938j = new C1938j(AbstractC0452b.m1644c(interfaceC0442e), 1);
            c1938j.m9908y();
            this.f9143b.deleteRegistrations(m9531k(abstractC1770a), new ExecutorC1782m(), AbstractC0123t.m358a(c1938j));
            Object objM9906s = c1938j.m9906s();
            if (objM9906s == AbstractC0452b.m1647e()) {
                AbstractC0476g.m1767c(interfaceC0442e);
            }
            return objM9906s == AbstractC0452b.m1647e() ? objM9906s : C0388t.f1507a;
        }

        @Override // p092d0.AbstractC1783n
        /* JADX INFO: renamed from: b */
        public Object mo9522b(InterfaceC0442e interfaceC0442e) throws Throwable {
            C1938j c1938j = new C1938j(AbstractC0452b.m1644c(interfaceC0442e), 1);
            c1938j.m9908y();
            this.f9143b.getMeasurementApiStatus(new ExecutorC1782m(), AbstractC0123t.m358a(c1938j));
            Object objM9906s = c1938j.m9906s();
            if (objM9906s == AbstractC0452b.m1647e()) {
                AbstractC0476g.m1767c(interfaceC0442e);
            }
            return objM9906s;
        }

        @Override // p092d0.AbstractC1783n
        /* JADX INFO: renamed from: c */
        public Object mo9523c(Uri uri, InputEvent inputEvent, InterfaceC0442e interfaceC0442e) throws Throwable {
            C1938j c1938j = new C1938j(AbstractC0452b.m1644c(interfaceC0442e), 1);
            c1938j.m9908y();
            this.f9143b.registerSource(uri, inputEvent, new ExecutorC1782m(), AbstractC0123t.m358a(c1938j));
            Object objM9906s = c1938j.m9906s();
            if (objM9906s == AbstractC0452b.m1647e()) {
                AbstractC0476g.m1767c(interfaceC0442e);
            }
            return objM9906s == AbstractC0452b.m1647e() ? objM9906s : C0388t.f1507a;
        }

        @Override // p092d0.AbstractC1783n
        /* JADX INFO: renamed from: d */
        public Object mo9524d(Uri uri, InterfaceC0442e interfaceC0442e) throws Throwable {
            C1938j c1938j = new C1938j(AbstractC0452b.m1644c(interfaceC0442e), 1);
            c1938j.m9908y();
            this.f9143b.registerTrigger(uri, new ExecutorC1782m(), AbstractC0123t.m358a(c1938j));
            Object objM9906s = c1938j.m9906s();
            if (objM9906s == AbstractC0452b.m1647e()) {
                AbstractC0476g.m1767c(interfaceC0442e);
            }
            return objM9906s == AbstractC0452b.m1647e() ? objM9906s : C0388t.f1507a;
        }

        @Override // p092d0.AbstractC1783n
        /* JADX INFO: renamed from: e */
        public Object mo9525e(AbstractC1784o abstractC1784o, InterfaceC0442e interfaceC0442e) throws Throwable {
            C1938j c1938j = new C1938j(AbstractC0452b.m1644c(interfaceC0442e), 1);
            c1938j.m9908y();
            this.f9143b.registerWebSource(m9532l(abstractC1784o), new ExecutorC1782m(), AbstractC0123t.m358a(c1938j));
            Object objM9906s = c1938j.m9906s();
            if (objM9906s == AbstractC0452b.m1647e()) {
                AbstractC0476g.m1767c(interfaceC0442e);
            }
            return objM9906s == AbstractC0452b.m1647e() ? objM9906s : C0388t.f1507a;
        }

        @Override // p092d0.AbstractC1783n
        /* JADX INFO: renamed from: f */
        public Object mo9526f(AbstractC1785p abstractC1785p, InterfaceC0442e interfaceC0442e) throws Throwable {
            C1938j c1938j = new C1938j(AbstractC0452b.m1644c(interfaceC0442e), 1);
            c1938j.m9908y();
            this.f9143b.registerWebTrigger(m9533m(abstractC1785p), new ExecutorC1782m(), AbstractC0123t.m358a(c1938j));
            Object objM9906s = c1938j.m9906s();
            if (objM9906s == AbstractC0452b.m1647e()) {
                AbstractC0476g.m1767c(interfaceC0442e);
            }
            return objM9906s == AbstractC0452b.m1647e() ? objM9906s : C0388t.f1507a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Context context) {
            AbstractC0606k.m2145e(context, "context");
            Object systemService = context.getSystemService((Class<Object>) AbstractC1775f.m9514a());
            AbstractC0606k.m2144d(systemService, "context.getSystemService…:class.java\n            )");
            this(AbstractC1776g.m9515a(systemService));
        }
    }
}
