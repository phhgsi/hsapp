package p124l0;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p130m2.AbstractC2276a;

/* JADX INFO: renamed from: l0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2117a implements InterfaceC2124h {

    /* JADX INFO: renamed from: c */
    private static final Set f9850c = new HashSet();

    /* JADX INFO: renamed from: a */
    private final String f9851a;

    /* JADX INFO: renamed from: b */
    private final String f9852b;

    /* JADX INFO: renamed from: l0.a$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        static final Set f9853a = new HashSet(Arrays.asList(AbstractC2130n.m10594d().mo10585a()));
    }

    /* JADX INFO: renamed from: l0.a$b */
    public static class b extends AbstractC2117a {
        b(String str, String str2) {
            super(str, str2);
        }

        @Override // p124l0.AbstractC2117a
        /* JADX INFO: renamed from: c */
        public final boolean mo10577c() {
            return true;
        }
    }

    /* JADX INFO: renamed from: l0.a$c */
    public static class c extends AbstractC2117a {
        c(String str, String str2) {
            super(str, str2);
        }

        @Override // p124l0.AbstractC2117a
        /* JADX INFO: renamed from: c */
        public final boolean mo10577c() {
            return Build.VERSION.SDK_INT >= 24;
        }
    }

    /* JADX INFO: renamed from: l0.a$d */
    public static class d extends AbstractC2117a {
        d(String str, String str2) {
            super(str, str2);
        }

        @Override // p124l0.AbstractC2117a
        /* JADX INFO: renamed from: c */
        public final boolean mo10577c() {
            return false;
        }
    }

    /* JADX INFO: renamed from: l0.a$e */
    public static class e extends AbstractC2117a {
        e(String str, String str2) {
            super(str, str2);
        }

        @Override // p124l0.AbstractC2117a
        /* JADX INFO: renamed from: c */
        public final boolean mo10577c() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* JADX INFO: renamed from: l0.a$f */
    public static class f extends AbstractC2117a {
        f(String str, String str2) {
            super(str, str2);
        }

        @Override // p124l0.AbstractC2117a
        /* JADX INFO: renamed from: c */
        public final boolean mo10577c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* JADX INFO: renamed from: l0.a$g */
    public static class g extends AbstractC2117a {
        g(String str, String str2) {
            super(str, str2);
        }

        @Override // p124l0.AbstractC2117a
        /* JADX INFO: renamed from: c */
        public final boolean mo10577c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* JADX INFO: renamed from: l0.a$h */
    public static class h extends AbstractC2117a {
        h(String str, String str2) {
            super(str, str2);
        }

        @Override // p124l0.AbstractC2117a
        /* JADX INFO: renamed from: c */
        public final boolean mo10577c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* JADX INFO: renamed from: l0.a$i */
    public static class i extends AbstractC2117a {
        i(String str, String str2) {
            super(str, str2);
        }

        @Override // p124l0.AbstractC2117a
        /* JADX INFO: renamed from: c */
        public final boolean mo10577c() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    AbstractC2117a(String str, String str2) {
        this.f9851a = str;
        this.f9852b = str2;
        f9850c.add(this);
    }

    /* JADX INFO: renamed from: e */
    public static Set m10574e() {
        return Collections.unmodifiableSet(f9850c);
    }

    @Override // p124l0.InterfaceC2124h
    /* JADX INFO: renamed from: a */
    public String mo10575a() {
        return this.f9851a;
    }

    @Override // p124l0.InterfaceC2124h
    /* JADX INFO: renamed from: b */
    public boolean mo10576b() {
        return mo10577c() || mo10578d();
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo10577c();

    /* JADX INFO: renamed from: d */
    public boolean mo10578d() {
        return AbstractC2276a.m10868b(a.f9853a, this.f9852b);
    }
}
