package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import p008C1.AbstractC0090d;

/* JADX INFO: renamed from: com.google.firebase.installations.f */
/* JADX INFO: loaded from: classes.dex */
class C1683f implements InterfaceC1685h {

    /* JADX INFO: renamed from: a */
    final TaskCompletionSource f8453a;

    public C1683f(TaskCompletionSource taskCompletionSource) {
        this.f8453a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.InterfaceC1685h
    /* JADX INFO: renamed from: a */
    public boolean mo9189a(AbstractC0090d abstractC0090d) {
        if (!abstractC0090d.m249l() && !abstractC0090d.m248k() && !abstractC0090d.m246i()) {
            return false;
        }
        this.f8453a.trySetResult(abstractC0090d.mo217d());
        return true;
    }

    @Override // com.google.firebase.installations.InterfaceC1685h
    /* JADX INFO: renamed from: b */
    public boolean mo9190b(Exception exc) {
        return false;
    }
}
