package p117j1;

import java.util.NoSuchElementException;
import p113i1.AbstractC2035h;

/* JADX INFO: renamed from: j1.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2068b extends AbstractC2065S {

    /* JADX INFO: renamed from: d */
    private b f9705d = b.NOT_READY;

    /* JADX INFO: renamed from: e */
    private Object f9706e;

    /* JADX INFO: renamed from: j1.b$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f9707a;

        static {
            int[] iArr = new int[b.values().length];
            f9707a = iArr;
            try {
                iArr[b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9707a[b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: j1.b$b */
    private enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected AbstractC2068b() {
    }

    /* JADX INFO: renamed from: c */
    private boolean m10325c() {
        this.f9705d = b.FAILED;
        this.f9706e = mo10320a();
        if (this.f9705d == b.DONE) {
            return false;
        }
        this.f9705d = b.READY;
        return true;
    }

    /* JADX INFO: renamed from: a */
    protected abstract Object mo10320a();

    /* JADX INFO: renamed from: b */
    protected final Object m10326b() {
        this.f9705d = b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractC2035h.m10245n(this.f9705d != b.FAILED);
        int i3 = a.f9707a[this.f9705d.ordinal()];
        if (i3 == 1) {
            return false;
        }
        if (i3 != 2) {
            return m10325c();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f9705d = b.NOT_READY;
        Object objM10270a = AbstractC2052E.m10270a(this.f9706e);
        this.f9706e = null;
        return objM10270a;
    }
}
