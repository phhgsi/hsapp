package com.google.android.gms.common.api.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.a */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1390a {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m7213a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
