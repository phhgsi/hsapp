package p160w1;

/* JADX INFO: renamed from: w1.d */
/* JADX INFO: loaded from: classes.dex */
public @interface InterfaceC2496d {

    /* JADX INFO: renamed from: w1.d$a */
    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
