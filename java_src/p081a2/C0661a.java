package p081a2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import p071X1.AbstractC0606k;
import p077Z1.AbstractC0651a;

/* JADX INFO: renamed from: a2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0661a extends AbstractC0651a {
    @Override // p077Z1.AbstractC0651a
    /* JADX INFO: renamed from: c */
    public Random mo2488c() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        AbstractC0606k.m2144d(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
