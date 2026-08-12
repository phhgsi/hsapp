package p012E;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: E.r */
/* JADX INFO: loaded from: classes.dex */
final class C0121r implements InterfaceC0114k {

    /* JADX INFO: renamed from: a */
    private final LocaleList f242a;

    C0121r(Object obj) {
        this.f242a = AbstractC0120q.m356a(obj);
    }

    @Override // p012E.InterfaceC0114k
    /* JADX INFO: renamed from: a */
    public String mo349a() {
        return this.f242a.toLanguageTags();
    }

    @Override // p012E.InterfaceC0114k
    /* JADX INFO: renamed from: b */
    public Object mo350b() {
        return this.f242a;
    }

    public boolean equals(Object obj) {
        return this.f242a.equals(((InterfaceC0114k) obj).mo350b());
    }

    @Override // p012E.InterfaceC0114k
    public Locale get(int i3) {
        return this.f242a.get(i3);
    }

    public int hashCode() {
        return this.f242a.hashCode();
    }

    @Override // p012E.InterfaceC0114k
    public boolean isEmpty() {
        return this.f242a.isEmpty();
    }

    @Override // p012E.InterfaceC0114k
    public int size() {
        return this.f242a.size();
    }

    public String toString() {
        return this.f242a.toString();
    }
}
