package p077Z1;

import java.util.Random;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: Z1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0652b extends AbstractC0651a {

    /* JADX INFO: renamed from: f */
    private final a f2339f = new a();

    /* JADX INFO: renamed from: Z1.b$a */
    public static final class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // p077Z1.AbstractC0651a
    /* JADX INFO: renamed from: c */
    public Random mo2488c() {
        Object obj = this.f2339f.get();
        AbstractC0606k.m2144d(obj, "get(...)");
        return (Random) obj;
    }
}
