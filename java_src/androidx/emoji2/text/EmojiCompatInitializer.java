package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.C1015f;
import androidx.lifecycle.AbstractC1121c;
import androidx.lifecycle.AbstractC1126h;
import androidx.lifecycle.InterfaceC1122d;
import androidx.lifecycle.InterfaceC1132n;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.C1241a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import p012E.AbstractC0124u;
import p104g0.InterfaceC1975a;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC1975a {

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$a */
    static class C1007a extends C1015f.c {
        protected C1007a(Context context) {
            super(new C1008b(context));
            m4552b(1);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$b */
    static class C1008b implements C1015f.h {

        /* JADX INFO: renamed from: a */
        private final Context f4808a;

        /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$b$a */
        class a extends C1015f.i {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C1015f.i f4809a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ ThreadPoolExecutor f4810b;

            a(C1015f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f4809a = iVar;
                this.f4810b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.C1015f.i
            /* JADX INFO: renamed from: a */
            public void mo4504a(Throwable th) {
                try {
                    this.f4809a.mo4504a(th);
                } finally {
                    this.f4810b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.C1015f.i
            /* JADX INFO: renamed from: b */
            public void mo4505b(C1023n c1023n) {
                try {
                    this.f4809a.mo4505b(c1023n);
                } finally {
                    this.f4810b.shutdown();
                }
            }
        }

        C1008b(Context context) {
            this.f4808a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.C1015f.h
        /* JADX INFO: renamed from: a */
        public void mo4502a(final C1015f.i iVar) {
            final ThreadPoolExecutor threadPoolExecutorM4508b = AbstractC1012c.m4508b("EmojiCompatInitializer");
            threadPoolExecutorM4508b.execute(new Runnable() { // from class: androidx.emoji2.text.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4850d.m4503c(iVar, threadPoolExecutorM4508b);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: c */
        public void m4503c(C1015f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                C1020k c1020kM4511a = AbstractC1013d.m4511a(this.f4808a);
                if (c1020kM4511a == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                c1020kM4511a.m4582c(threadPoolExecutor);
                c1020kM4511a.m4551a().mo4502a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th) {
                iVar.mo4504a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$c */
    static class RunnableC1009c implements Runnable {
        RunnableC1009c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AbstractC0124u.m359a("EmojiCompat.EmojiCompatInitializer.run");
                if (C1015f.m4531i()) {
                    C1015f.m4527c().m4537l();
                }
            } finally {
                AbstractC0124u.m360b();
            }
        }
    }

    @Override // p104g0.InterfaceC1975a
    /* JADX INFO: renamed from: a */
    public List mo4490a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p104g0.InterfaceC1975a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean mo4491b(Context context) {
        C1015f.m4530h(new C1007a(context));
        m4493d(context);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: d */
    void m4493d(Context context) {
        final AbstractC1126h lifecycle = ((InterfaceC1132n) C1241a.m6298e(context).m6302f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.mo5132a(new InterfaceC1122d() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.InterfaceC1122d
            /* JADX INFO: renamed from: a */
            public void mo4495a(InterfaceC1132n interfaceC1132n) {
                EmojiCompatInitializer.this.m4494e();
                lifecycle.mo5134c(this);
            }

            @Override // androidx.lifecycle.InterfaceC1122d
            /* JADX INFO: renamed from: b */
            public /* synthetic */ void mo4496b(InterfaceC1132n interfaceC1132n) {
                AbstractC1121c.m5128b(this, interfaceC1132n);
            }

            @Override // androidx.lifecycle.InterfaceC1122d
            /* JADX INFO: renamed from: c */
            public /* synthetic */ void mo4497c(InterfaceC1132n interfaceC1132n) {
                AbstractC1121c.m5127a(this, interfaceC1132n);
            }

            @Override // androidx.lifecycle.InterfaceC1122d
            /* JADX INFO: renamed from: e */
            public /* synthetic */ void mo4498e(InterfaceC1132n interfaceC1132n) {
                AbstractC1121c.m5129c(this, interfaceC1132n);
            }

            @Override // androidx.lifecycle.InterfaceC1122d
            /* JADX INFO: renamed from: g */
            public /* synthetic */ void mo4499g(InterfaceC1132n interfaceC1132n) {
                AbstractC1121c.m5130d(this, interfaceC1132n);
            }

            @Override // androidx.lifecycle.InterfaceC1122d
            /* JADX INFO: renamed from: h */
            public /* synthetic */ void mo4500h(InterfaceC1132n interfaceC1132n) {
                AbstractC1121c.m5131e(this, interfaceC1132n);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    void m4494e() {
        AbstractC1012c.m4509c().postDelayed(new RunnableC1009c(), 500L);
    }
}
