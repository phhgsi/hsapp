package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.emoji2.text.C1015f;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import p012E.AbstractC0124u;
import p015F.AbstractC0138j;
import p015F.C0134f;
import p024I.AbstractC0211h;
import p167z.AbstractC2567D;

/* JADX INFO: renamed from: androidx.emoji2.text.k */
/* JADX INFO: loaded from: classes.dex */
public class C1020k extends C1015f.c {

    /* JADX INFO: renamed from: k */
    private static final a f4874k = new a();

    /* JADX INFO: renamed from: androidx.emoji2.text.k$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public Typeface m4583a(Context context, AbstractC0138j.b bVar) {
            return AbstractC0138j.m400a(context, null, new AbstractC0138j.b[]{bVar});
        }

        /* JADX INFO: renamed from: b */
        public AbstractC0138j.a m4584b(Context context, C0134f c0134f) {
            return AbstractC0138j.m401b(context, null, c0134f);
        }

        /* JADX INFO: renamed from: c */
        public void m4585c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.emoji2.text.k$b */
    static class b implements C1015f.h {

        /* JADX INFO: renamed from: a */
        private final Context f4875a;

        /* JADX INFO: renamed from: b */
        private final C0134f f4876b;

        /* JADX INFO: renamed from: c */
        private final a f4877c;

        /* JADX INFO: renamed from: d */
        private final Object f4878d = new Object();

        /* JADX INFO: renamed from: e */
        private Handler f4879e;

        /* JADX INFO: renamed from: f */
        private Executor f4880f;

        /* JADX INFO: renamed from: g */
        private ThreadPoolExecutor f4881g;

        /* JADX INFO: renamed from: h */
        C1015f.i f4882h;

        /* JADX INFO: renamed from: i */
        private ContentObserver f4883i;

        /* JADX INFO: renamed from: j */
        private Runnable f4884j;

        b(Context context, C0134f c0134f, a aVar) {
            AbstractC0211h.m611h(context, "Context cannot be null");
            AbstractC0211h.m611h(c0134f, "FontRequest cannot be null");
            this.f4875a = context.getApplicationContext();
            this.f4876b = c0134f;
            this.f4877c = aVar;
        }

        /* JADX INFO: renamed from: b */
        private void m4586b() {
            synchronized (this.f4878d) {
                try {
                    this.f4882h = null;
                    ContentObserver contentObserver = this.f4883i;
                    if (contentObserver != null) {
                        this.f4877c.m4585c(this.f4875a, contentObserver);
                        this.f4883i = null;
                    }
                    Handler handler = this.f4879e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f4884j);
                    }
                    this.f4879e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f4881g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f4880f = null;
                    this.f4881g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: e */
        private AbstractC0138j.b m4587e() {
            try {
                AbstractC0138j.a aVarM4584b = this.f4877c.m4584b(this.f4875a, this.f4876b);
                if (aVarM4584b.m407e() == 0) {
                    AbstractC0138j.b[] bVarArrM405c = aVarM4584b.m405c();
                    if (bVarArrM405c == null || bVarArrM405c.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrM405c[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarM4584b.m407e() + ")");
            } catch (PackageManager.NameNotFoundException e3) {
                throw new RuntimeException("provider not found", e3);
            }
        }

        @Override // androidx.emoji2.text.C1015f.h
        /* JADX INFO: renamed from: a */
        public void mo4502a(C1015f.i iVar) {
            AbstractC0211h.m611h(iVar, "LoaderCallback cannot be null");
            synchronized (this.f4878d) {
                this.f4882h = iVar;
            }
            m4589d();
        }

        /* JADX INFO: renamed from: c */
        void m4588c() {
            synchronized (this.f4878d) {
                try {
                    if (this.f4882h == null) {
                        return;
                    }
                    try {
                        AbstractC0138j.b bVarM4587e = m4587e();
                        int iM410b = bVarM4587e.m410b();
                        if (iM410b == 2) {
                            synchronized (this.f4878d) {
                            }
                        }
                        if (iM410b != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iM410b + ")");
                        }
                        try {
                            AbstractC0124u.m359a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceM4583a = this.f4877c.m4583a(this.f4875a, bVarM4587e);
                            ByteBuffer byteBufferM12251f = AbstractC2567D.m12251f(this.f4875a, null, bVarM4587e.m413e());
                            if (byteBufferM12251f == null || typefaceM4583a == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            C1023n c1023nM4601b = C1023n.m4601b(typefaceM4583a, byteBufferM12251f);
                            AbstractC0124u.m360b();
                            synchronized (this.f4878d) {
                                try {
                                    C1015f.i iVar = this.f4882h;
                                    if (iVar != null) {
                                        iVar.mo4505b(c1023nM4601b);
                                    }
                                } finally {
                                }
                            }
                            m4586b();
                        } catch (Throwable th) {
                            AbstractC0124u.m360b();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f4878d) {
                            try {
                                C1015f.i iVar2 = this.f4882h;
                                if (iVar2 != null) {
                                    iVar2.mo4504a(th2);
                                }
                                m4586b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        /* JADX INFO: renamed from: d */
        void m4589d() {
            synchronized (this.f4878d) {
                try {
                    if (this.f4882h == null) {
                        return;
                    }
                    if (this.f4880f == null) {
                        ThreadPoolExecutor threadPoolExecutorM4508b = AbstractC1012c.m4508b("emojiCompat");
                        this.f4881g = threadPoolExecutorM4508b;
                        this.f4880f = threadPoolExecutorM4508b;
                    }
                    this.f4880f.execute(new Runnable() { // from class: androidx.emoji2.text.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f4885d.m4588c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public void m4590f(Executor executor) {
            synchronized (this.f4878d) {
                this.f4880f = executor;
            }
        }
    }

    public C1020k(Context context, C0134f c0134f) {
        super(new b(context, c0134f, f4874k));
    }

    /* JADX INFO: renamed from: c */
    public C1020k m4582c(Executor executor) {
        ((b) m4551a()).m4590f(executor);
        return this;
    }
}
