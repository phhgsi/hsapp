package com.google.firebase.messaging;

import java.util.Locale;

/* JADX INFO: renamed from: com.google.firebase.messaging.V */
/* JADX INFO: loaded from: classes.dex */
public final class C1714V extends Exception {

    /* JADX INFO: renamed from: d */
    private final int f8543d;

    C1714V(String str) {
        super(str);
        this.f8543d = m9361a(str);
    }

    /* JADX INFO: renamed from: a */
    private int m9361a(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.getClass();
        switch (lowerCase) {
        }
        return 0;
    }
}
