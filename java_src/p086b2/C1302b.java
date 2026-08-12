package p086b2;

import java.util.NoSuchElementException;
import p038M1.AbstractC0396B;

/* JADX INFO: renamed from: b2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1302b extends AbstractC0396B {

    /* JADX INFO: renamed from: d */
    private final int f6365d;

    /* JADX INFO: renamed from: e */
    private final int f6366e;

    /* JADX INFO: renamed from: f */
    private boolean f6367f;

    /* JADX INFO: renamed from: g */
    private int f6368g;

    public C1302b(int i3, int i4, int i5) {
        this.f6365d = i5;
        this.f6366e = i4;
        boolean z2 = false;
        if (i5 <= 0 ? i3 >= i4 : i3 <= i4) {
            z2 = true;
        }
        this.f6367f = z2;
        this.f6368g = z2 ? i3 : i4;
    }

    @Override // p038M1.AbstractC0396B
    /* JADX INFO: renamed from: a */
    public int mo1394a() {
        int i3 = this.f6368g;
        if (i3 != this.f6366e) {
            this.f6368g = this.f6365d + i3;
            return i3;
        }
        if (!this.f6367f) {
            throw new NoSuchElementException();
        }
        this.f6367f = false;
        return i3;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6367f;
    }
}
