package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.collection.C0922b;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p024I.AbstractC0211h;

/* JADX INFO: renamed from: androidx.emoji2.text.f */
/* JADX INFO: loaded from: classes.dex */
public class C1015f {

    /* JADX INFO: renamed from: o */
    private static final Object f4816o = new Object();

    /* JADX INFO: renamed from: p */
    private static final Object f4817p = new Object();

    /* JADX INFO: renamed from: q */
    private static volatile C1015f f4818q;

    /* JADX INFO: renamed from: b */
    private final Set f4820b;

    /* JADX INFO: renamed from: e */
    private final b f4823e;

    /* JADX INFO: renamed from: f */
    final h f4824f;

    /* JADX INFO: renamed from: g */
    private final j f4825g;

    /* JADX INFO: renamed from: h */
    final boolean f4826h;

    /* JADX INFO: renamed from: i */
    final boolean f4827i;

    /* JADX INFO: renamed from: j */
    final int[] f4828j;

    /* JADX INFO: renamed from: k */
    private final boolean f4829k;

    /* JADX INFO: renamed from: l */
    private final int f4830l;

    /* JADX INFO: renamed from: m */
    private final int f4831m;

    /* JADX INFO: renamed from: n */
    private final e f4832n;

    /* JADX INFO: renamed from: a */
    private final ReadWriteLock f4819a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c */
    private volatile int f4821c = 3;

    /* JADX INFO: renamed from: d */
    private final Handler f4822d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: androidx.emoji2.text.f$a */
    private static final class a extends b {

        /* JADX INFO: renamed from: b */
        private volatile C1018i f4833b;

        /* JADX INFO: renamed from: c */
        private volatile C1023n f4834c;

        /* JADX INFO: renamed from: androidx.emoji2.text.f$a$a, reason: collision with other inner class name */
        class C2611a extends i {
            C2611a() {
            }

            @Override // androidx.emoji2.text.C1015f.i
            /* JADX INFO: renamed from: a */
            public void mo4504a(Throwable th) {
                a.this.f4836a.m4538n(th);
            }

            @Override // androidx.emoji2.text.C1015f.i
            /* JADX INFO: renamed from: b */
            public void mo4505b(C1023n c1023n) {
                a.this.m4550d(c1023n);
            }
        }

        a(C1015f c1015f) {
            super(c1015f);
        }

        @Override // androidx.emoji2.text.C1015f.b
        /* JADX INFO: renamed from: a */
        void mo4547a() {
            try {
                this.f4836a.f4824f.mo4502a(new C2611a());
            } catch (Throwable th) {
                this.f4836a.m4538n(th);
            }
        }

        @Override // androidx.emoji2.text.C1015f.b
        /* JADX INFO: renamed from: b */
        CharSequence mo4548b(CharSequence charSequence, int i3, int i4, int i5, boolean z2) {
            return this.f4833b.m4565h(charSequence, i3, i4, i5, z2);
        }

        @Override // androidx.emoji2.text.C1015f.b
        /* JADX INFO: renamed from: c */
        void mo4549c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f4834c.m4604e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f4836a.f4826h);
        }

        /* JADX INFO: renamed from: d */
        void m4550d(C1023n c1023n) {
            if (c1023n == null) {
                this.f4836a.m4538n(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f4834c = c1023n;
            C1023n c1023n2 = this.f4834c;
            j jVar = this.f4836a.f4825g;
            e eVar = this.f4836a.f4832n;
            C1015f c1015f = this.f4836a;
            this.f4833b = new C1018i(c1023n2, jVar, eVar, c1015f.f4827i, c1015f.f4828j, AbstractC1017h.m4554a());
            this.f4836a.m4539o();
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        final C1015f f4836a;

        b(C1015f c1015f) {
            this.f4836a = c1015f;
        }

        /* JADX INFO: renamed from: a */
        abstract void mo4547a();

        /* JADX INFO: renamed from: b */
        abstract CharSequence mo4548b(CharSequence charSequence, int i3, int i4, int i5, boolean z2);

        /* JADX INFO: renamed from: c */
        abstract void mo4549c(EditorInfo editorInfo);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$c */
    public static abstract class c {

        /* JADX INFO: renamed from: a */
        final h f4837a;

        /* JADX INFO: renamed from: b */
        j f4838b;

        /* JADX INFO: renamed from: c */
        boolean f4839c;

        /* JADX INFO: renamed from: d */
        boolean f4840d;

        /* JADX INFO: renamed from: e */
        int[] f4841e;

        /* JADX INFO: renamed from: f */
        Set f4842f;

        /* JADX INFO: renamed from: g */
        boolean f4843g;

        /* JADX INFO: renamed from: h */
        int f4844h = -16711936;

        /* JADX INFO: renamed from: i */
        int f4845i = 0;

        /* JADX INFO: renamed from: j */
        e f4846j = new C1014e();

        protected c(h hVar) {
            AbstractC0211h.m611h(hVar, "metadataLoader cannot be null.");
            this.f4837a = hVar;
        }

        /* JADX INFO: renamed from: a */
        protected final h m4551a() {
            return this.f4837a;
        }

        /* JADX INFO: renamed from: b */
        public c m4552b(int i3) {
            this.f4845i = i3;
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$d */
    public static class d implements j {
        @Override // androidx.emoji2.text.C1015f.j
        /* JADX INFO: renamed from: a */
        public AbstractC1019j mo4553a(C1025p c1025p) {
            return new C1026q(c1025p);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        boolean mo4524a(CharSequence charSequence, int i3, int i4, int i5);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$f */
    public static abstract class f {
        /* JADX INFO: renamed from: a */
        public void mo3615a(Throwable th) {
        }

        /* JADX INFO: renamed from: b */
        public void mo1816b() {
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$g */
    private static class g implements Runnable {

        /* JADX INFO: renamed from: d */
        private final List f4847d;

        /* JADX INFO: renamed from: e */
        private final Throwable f4848e;

        /* JADX INFO: renamed from: f */
        private final int f4849f;

        g(f fVar, int i3) {
            this(Arrays.asList((f) AbstractC0211h.m611h(fVar, "initCallback cannot be null")), i3, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f4847d.size();
            int i3 = 0;
            if (this.f4849f != 1) {
                while (i3 < size) {
                    ((f) this.f4847d.get(i3)).mo3615a(this.f4848e);
                    i3++;
                }
            } else {
                while (i3 < size) {
                    ((f) this.f4847d.get(i3)).mo1816b();
                    i3++;
                }
            }
        }

        g(Collection collection, int i3) {
            this(collection, i3, null);
        }

        g(Collection collection, int i3, Throwable th) {
            AbstractC0211h.m611h(collection, "initCallbacks cannot be null");
            this.f4847d = new ArrayList(collection);
            this.f4849f = i3;
            this.f4848e = th;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$h */
    public interface h {
        /* JADX INFO: renamed from: a */
        void mo4502a(i iVar);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$i */
    public static abstract class i {
        /* JADX INFO: renamed from: a */
        public abstract void mo4504a(Throwable th);

        /* JADX INFO: renamed from: b */
        public abstract void mo4505b(C1023n c1023n);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$j */
    public interface j {
        /* JADX INFO: renamed from: a */
        AbstractC1019j mo4553a(C1025p c1025p);
    }

    private C1015f(c cVar) {
        this.f4826h = cVar.f4839c;
        this.f4827i = cVar.f4840d;
        this.f4828j = cVar.f4841e;
        this.f4829k = cVar.f4843g;
        this.f4830l = cVar.f4844h;
        this.f4824f = cVar.f4837a;
        this.f4831m = cVar.f4845i;
        this.f4832n = cVar.f4846j;
        C0922b c0922b = new C0922b();
        this.f4820b = c0922b;
        j jVar = cVar.f4838b;
        this.f4825g = jVar == null ? new d() : jVar;
        Set set = cVar.f4842f;
        if (set != null && !set.isEmpty()) {
            c0922b.addAll(cVar.f4842f);
        }
        this.f4823e = new a(this);
        m4533m();
    }

    /* JADX INFO: renamed from: c */
    public static C1015f m4527c() {
        C1015f c1015f;
        synchronized (f4816o) {
            c1015f = f4818q;
            AbstractC0211h.m612i(c1015f != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return c1015f;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m4528f(InputConnection inputConnection, Editable editable, int i3, int i4, boolean z2) {
        return C1018i.m4558b(inputConnection, editable, i3, i4, z2);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m4529g(Editable editable, int i3, KeyEvent keyEvent) {
        return C1018i.m4559c(editable, i3, keyEvent);
    }

    /* JADX INFO: renamed from: h */
    public static C1015f m4530h(c cVar) {
        C1015f c1015f;
        C1015f c1015f2 = f4818q;
        if (c1015f2 != null) {
            return c1015f2;
        }
        synchronized (f4816o) {
            try {
                c1015f = f4818q;
                if (c1015f == null) {
                    c1015f = new C1015f(cVar);
                    f4818q = c1015f;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1015f;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m4531i() {
        return f4818q != null;
    }

    /* JADX INFO: renamed from: k */
    private boolean m4532k() {
        return m4535e() == 1;
    }

    /* JADX INFO: renamed from: m */
    private void m4533m() {
        this.f4819a.writeLock().lock();
        try {
            if (this.f4831m == 0) {
                this.f4821c = 0;
            }
            this.f4819a.writeLock().unlock();
            if (m4535e() == 0) {
                this.f4823e.mo4547a();
            }
        } catch (Throwable th) {
            this.f4819a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public int m4534d() {
        return this.f4830l;
    }

    /* JADX INFO: renamed from: e */
    public int m4535e() {
        this.f4819a.readLock().lock();
        try {
            return this.f4821c;
        } finally {
            this.f4819a.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m4536j() {
        return this.f4829k;
    }

    /* JADX INFO: renamed from: l */
    public void m4537l() {
        AbstractC0211h.m612i(this.f4831m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (m4532k()) {
            return;
        }
        this.f4819a.writeLock().lock();
        try {
            if (this.f4821c == 0) {
                return;
            }
            this.f4821c = 0;
            this.f4819a.writeLock().unlock();
            this.f4823e.mo4547a();
        } finally {
            this.f4819a.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: n */
    void m4538n(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f4819a.writeLock().lock();
        try {
            this.f4821c = 2;
            arrayList.addAll(this.f4820b);
            this.f4820b.clear();
            this.f4819a.writeLock().unlock();
            this.f4822d.post(new g(arrayList, this.f4821c, th));
        } catch (Throwable th2) {
            this.f4819a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: o */
    void m4539o() {
        ArrayList arrayList = new ArrayList();
        this.f4819a.writeLock().lock();
        try {
            this.f4821c = 1;
            arrayList.addAll(this.f4820b);
            this.f4820b.clear();
            this.f4819a.writeLock().unlock();
            this.f4822d.post(new g(arrayList, this.f4821c));
        } catch (Throwable th) {
            this.f4819a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: p */
    public CharSequence m4540p(CharSequence charSequence) {
        return m4541q(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    /* JADX INFO: renamed from: q */
    public CharSequence m4541q(CharSequence charSequence, int i3, int i4) {
        return m4542r(charSequence, i3, i4, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: r */
    public CharSequence m4542r(CharSequence charSequence, int i3, int i4, int i5) {
        return m4543s(charSequence, i3, i4, i5, 0);
    }

    /* JADX INFO: renamed from: s */
    public CharSequence m4543s(CharSequence charSequence, int i3, int i4, int i5, int i6) {
        boolean z2;
        AbstractC0211h.m612i(m4532k(), "Not initialized yet");
        AbstractC0211h.m608e(i3, "start cannot be negative");
        AbstractC0211h.m608e(i4, "end cannot be negative");
        AbstractC0211h.m608e(i5, "maxEmojiCount cannot be negative");
        AbstractC0211h.m605b(i3 <= i4, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        AbstractC0211h.m605b(i3 <= charSequence.length(), "start should be < than charSequence length");
        AbstractC0211h.m605b(i4 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i3 == i4) {
            return charSequence;
        }
        if (i6 != 1) {
            z2 = i6 != 2 ? this.f4826h : false;
        } else {
            z2 = true;
        }
        return this.f4823e.mo4548b(charSequence, i3, i4, i5, z2);
    }

    /* JADX INFO: renamed from: t */
    public void m4544t(f fVar) {
        AbstractC0211h.m611h(fVar, "initCallback cannot be null");
        this.f4819a.writeLock().lock();
        try {
            if (this.f4821c == 1 || this.f4821c == 2) {
                this.f4822d.post(new g(fVar, this.f4821c));
            } else {
                this.f4820b.add(fVar);
            }
            this.f4819a.writeLock().unlock();
        } catch (Throwable th) {
            this.f4819a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: u */
    public void m4545u(f fVar) {
        AbstractC0211h.m611h(fVar, "initCallback cannot be null");
        this.f4819a.writeLock().lock();
        try {
            this.f4820b.remove(fVar);
        } finally {
            this.f4819a.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m4546v(EditorInfo editorInfo) {
        if (!m4532k() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f4823e.mo4549c(editorInfo);
    }
}
