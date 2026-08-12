package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import p008C1.AbstractC0090d;

/* JADX INFO: renamed from: com.google.firebase.installations.e */
/* JADX INFO: loaded from: classes.dex */
class C1682e implements InterfaceC1685h {

    /* JADX INFO: renamed from: a */
    private final C1686i f8451a;

    /* JADX INFO: renamed from: b */
    private final TaskCompletionSource f8452b;

    public C1682e(C1686i c1686i, TaskCompletionSource taskCompletionSource) {
        this.f8451a = c1686i;
        this.f8452b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.InterfaceC1685h
    /* JADX INFO: renamed from: a */
    public boolean mo9189a(AbstractC0090d abstractC0090d) {
        if (!abstractC0090d.m248k() || this.f8451a.m9199f(abstractC0090d)) {
            return false;
        }
        this.f8452b.setResult(AbstractC1684g.m9191a().mo9156b(abstractC0090d.mo215b()).mo9158d(abstractC0090d.mo216c()).mo9157c(abstractC0090d.mo221h()).mo9155a());
        return true;
    }

    @Override // com.google.firebase.installations.InterfaceC1685h
    /* JADX INFO: renamed from: b */
    public boolean mo9190b(Exception exc) {
        this.f8452b.trySetException(exc);
        return true;
    }
}
