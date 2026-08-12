package p038M1;

import java.util.AbstractList;
import java.util.List;
import p074Y1.InterfaceC0622a;

/* JADX INFO: renamed from: M1.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0410d extends AbstractList implements List, InterfaceC0622a {
    protected AbstractC0410d() {
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo1418b();

    /* JADX INFO: renamed from: c */
    public abstract Object mo1419c(int i3);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i3) {
        return mo1419c(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo1418b();
    }
}
