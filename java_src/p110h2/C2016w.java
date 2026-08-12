package p110h2;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p086b2.AbstractC1304d;

/* JADX INFO: renamed from: h2.w */
/* JADX INFO: loaded from: classes.dex */
public final class C2016w {
    private volatile AtomicReferenceArray<Object> array;

    public C2016w(int i3) {
        this.array = new AtomicReferenceArray<>(i3);
    }

    /* JADX INFO: renamed from: a */
    public final int m10187a() {
        return this.array.length();
    }

    /* JADX INFO: renamed from: b */
    public final Object m10188b(int i3) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i3 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m10189c(int i3, Object obj) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i3 < length) {
            atomicReferenceArray.set(i3, obj);
            return;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(AbstractC1304d.m6631a(i3 + 1, length * 2));
        for (int i4 = 0; i4 < length; i4++) {
            atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
        }
        atomicReferenceArray2.set(i3, obj);
        this.array = atomicReferenceArray2;
    }
}
