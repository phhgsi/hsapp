package p102f2;

import java.io.Closeable;
import p041N1.AbstractC0439b;
import p041N1.InterfaceC0446i;
import p068W1.InterfaceC0577l;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0607l;

/* JADX INFO: renamed from: f2.W */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1916W extends AbstractC1964w implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: f */
    public static final a f9425f = new a(null);

    /* JADX INFO: renamed from: f2.W$a */
    public static final class a extends AbstractC0439b {

        /* JADX INFO: renamed from: f2.W$a$a, reason: collision with other inner class name */
        static final class C2627a extends AbstractC0607l implements InterfaceC0577l {

            /* JADX INFO: renamed from: e */
            public static final C2627a f9426e = new C2627a();

            C2627a() {
                super(1);
            }

            @Override // p068W1.InterfaceC0577l
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final AbstractC1916W mo1406f(InterfaceC0446i.b bVar) {
                if (bVar instanceof AbstractC1916W) {
                    return (AbstractC1916W) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(AbstractC0602g abstractC0602g) {
            this();
        }

        private a() {
            super(AbstractC1964w.f9484e, C2627a.f9426e);
        }
    }
}
