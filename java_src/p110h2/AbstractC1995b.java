package p110h2;

import androidx.concurrent.futures.AbstractC0933b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: h2.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1995b extends AbstractC2014u {

    /* JADX INFO: renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9566a = AtomicReferenceFieldUpdater.newUpdater(AbstractC1995b.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = AbstractC1994a.f9565a;

    /* JADX INFO: renamed from: c */
    private final Object m10115c(Object obj) {
        Object obj2 = f9566a.get(this);
        Object obj3 = AbstractC1994a.f9565a;
        return obj2 != obj3 ? obj2 : AbstractC0933b.m3989a(f9566a, this, obj3, obj) ? obj : f9566a.get(this);
    }

    @Override // p110h2.AbstractC2014u
    /* JADX INFO: renamed from: a */
    public final Object mo10117a(Object obj) {
        Object objM10115c = f9566a.get(this);
        if (objM10115c == AbstractC1994a.f9565a) {
            objM10115c = m10115c(mo9996e(obj));
        }
        mo10118b(obj, objM10115c);
        return objM10115c;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo10118b(Object obj, Object obj2);

    /* JADX INFO: renamed from: e */
    public abstract Object mo9996e(Object obj);
}
