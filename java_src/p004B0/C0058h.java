package p004B0;

import android.content.Context;
import p032K1.InterfaceC0359a;
import p156v0.AbstractC2477d;
import p156v0.InterfaceC2475b;

/* JADX INFO: renamed from: B0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0058h implements InterfaceC2475b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0359a f126a;

    public C0058h(InterfaceC0359a interfaceC0359a) {
        this.f126a = interfaceC0359a;
    }

    /* JADX INFO: renamed from: a */
    public static C0058h m181a(InterfaceC0359a interfaceC0359a) {
        return new C0058h(interfaceC0359a);
    }

    /* JADX INFO: renamed from: c */
    public static String m182c(Context context) {
        return (String) AbstractC2477d.m11790c(AbstractC0056f.m174b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p032K1.InterfaceC0359a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return m182c((Context) this.f126a.get());
    }
}
