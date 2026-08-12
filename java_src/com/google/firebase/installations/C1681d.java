package com.google.firebase.installations;

import p129m1.AbstractC2273k;

/* JADX INFO: renamed from: com.google.firebase.installations.d */
/* JADX INFO: loaded from: classes.dex */
public class C1681d extends AbstractC2273k {

    /* JADX INFO: renamed from: d */
    private final a f8446d;

    /* JADX INFO: renamed from: com.google.firebase.installations.d$a */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public C1681d(a aVar) {
        this.f8446d = aVar;
    }

    public C1681d(String str, a aVar) {
        super(str);
        this.f8446d = aVar;
    }
}
