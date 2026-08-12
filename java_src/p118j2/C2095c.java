package p118j2;

/* JADX INFO: renamed from: j2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2095c extends AbstractC2098f {

    /* JADX INFO: renamed from: l */
    public static final C2095c f9807l = new C2095c();

    private C2095c() {
        super(AbstractC2104l.f9820c, AbstractC2104l.f9821d, AbstractC2104l.f9822e, AbstractC2104l.f9818a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p102f2.AbstractC1964w
    public String toString() {
        return "Dispatchers.Default";
    }
}
