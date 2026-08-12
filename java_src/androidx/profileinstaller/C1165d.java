package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.AbstractC1170i;
import com.google.android.gms.common.ConnectionResult;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.profileinstaller.d */
/* JADX INFO: loaded from: classes.dex */
public class C1165d {

    /* JADX INFO: renamed from: a */
    private final AssetManager f5491a;

    /* JADX INFO: renamed from: b */
    private final Executor f5492b;

    /* JADX INFO: renamed from: c */
    private final AbstractC1170i.c f5493c;

    /* JADX INFO: renamed from: e */
    private final File f5495e;

    /* JADX INFO: renamed from: f */
    private final String f5496f;

    /* JADX INFO: renamed from: g */
    private final String f5497g;

    /* JADX INFO: renamed from: h */
    private final String f5498h;

    /* JADX INFO: renamed from: j */
    private C1166e[] f5500j;

    /* JADX INFO: renamed from: k */
    private byte[] f5501k;

    /* JADX INFO: renamed from: i */
    private boolean f5499i = false;

    /* JADX INFO: renamed from: d */
    private final byte[] f5494d = m5292d();

    public C1165d(AssetManager assetManager, Executor executor, AbstractC1170i.c cVar, String str, String str2, String str3, File file) {
        this.f5491a = assetManager;
        this.f5492b = executor;
        this.f5493c = cVar;
        this.f5496f = str;
        this.f5497g = str2;
        this.f5498h = str3;
        this.f5495e = file;
    }

    /* JADX INFO: renamed from: b */
    private C1165d m5290b(C1166e[] c1166eArr, byte[] bArr) {
        InputStream inputStreamM5294g;
        try {
            inputStreamM5294g = m5294g(this.f5491a, this.f5498h);
        } catch (FileNotFoundException e3) {
            this.f5493c.mo5273b(9, e3);
        } catch (IOException e4) {
            this.f5493c.mo5273b(7, e4);
        } catch (IllegalStateException e5) {
            this.f5500j = null;
            this.f5493c.mo5273b(8, e5);
        }
        if (inputStreamM5294g == null) {
            if (inputStreamM5294g != null) {
                inputStreamM5294g.close();
            }
            return null;
        }
        try {
            this.f5500j = AbstractC1175n.m5364q(inputStreamM5294g, AbstractC1175n.m5362o(inputStreamM5294g, AbstractC1175n.f5529b), bArr, c1166eArr);
            inputStreamM5294g.close();
            return this;
        } catch (Throwable th) {
            try {
                inputStreamM5294g.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m5291c() {
        if (!this.f5499i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    /* JADX INFO: renamed from: d */
    private static byte[] m5292d() {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 24 || i3 > 34) {
            return null;
        }
        switch (i3) {
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case 25:
                return AbstractC1177p.f5544e;
            case 26:
                return AbstractC1177p.f5543d;
            case 27:
                return AbstractC1177p.f5542c;
            case 28:
            case 29:
            case 30:
                return AbstractC1177p.f5541b;
            case 31:
            case 32:
            case 33:
            case 34:
                return AbstractC1177p.f5540a;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: f */
    private InputStream m5293f(AssetManager assetManager) {
        try {
            return m5294g(assetManager, this.f5497g);
        } catch (FileNotFoundException e3) {
            this.f5493c.mo5273b(6, e3);
            return null;
        } catch (IOException e4) {
            this.f5493c.mo5273b(7, e4);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    private InputStream m5294g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e3) {
            String message = e3.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f5493c.mo5272a(5, null);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    private C1166e[] m5295i(InputStream inputStream) {
        try {
            try {
                try {
                    try {
                        C1166e[] c1166eArrM5370w = AbstractC1175n.m5370w(inputStream, AbstractC1175n.m5362o(inputStream, AbstractC1175n.f5528a), this.f5496f);
                        try {
                            inputStream.close();
                            return c1166eArrM5370w;
                        } catch (IOException e3) {
                            this.f5493c.mo5273b(7, e3);
                            return c1166eArrM5370w;
                        }
                    } catch (IOException e4) {
                        this.f5493c.mo5273b(7, e4);
                        return null;
                    }
                } catch (IllegalStateException e5) {
                    this.f5493c.mo5273b(8, e5);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e6) {
                this.f5493c.mo5273b(7, e6);
                inputStream.close();
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e7) {
                this.f5493c.mo5273b(7, e7);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    private static boolean m5296j() {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 24 || i3 > 34) {
            return false;
        }
        if (i3 != 24 && i3 != 25) {
            switch (i3) {
                case 31:
                case 32:
                case 33:
                case 34:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    private void m5297k(final int i3, final Object obj) {
        this.f5492b.execute(new Runnable() { // from class: androidx.profileinstaller.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f5488d.f5493c.mo5273b(i3, obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public boolean m5298e() {
        if (this.f5494d == null) {
            m5297k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f5495e.exists()) {
            try {
                this.f5495e.createNewFile();
            } catch (IOException unused) {
                m5297k(4, null);
                return false;
            }
        } else if (!this.f5495e.canWrite()) {
            m5297k(4, null);
            return false;
        }
        this.f5499i = true;
        return true;
    }

    /* JADX INFO: renamed from: h */
    public C1165d m5299h() {
        C1165d c1165dM5290b;
        m5291c();
        if (this.f5494d != null) {
            InputStream inputStreamM5293f = m5293f(this.f5491a);
            if (inputStreamM5293f != null) {
                this.f5500j = m5295i(inputStreamM5293f);
            }
            C1166e[] c1166eArr = this.f5500j;
            if (c1166eArr != null && m5296j() && (c1165dM5290b = m5290b(c1166eArr, this.f5494d)) != null) {
                return c1165dM5290b;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: l */
    public C1165d m5300l() {
        ByteArrayOutputStream byteArrayOutputStream;
        C1166e[] c1166eArr = this.f5500j;
        byte[] bArr = this.f5494d;
        if (c1166eArr != null && bArr != null) {
            m5291c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    AbstractC1175n.m5337E(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e3) {
                this.f5493c.mo5273b(7, e3);
            } catch (IllegalStateException e4) {
                this.f5493c.mo5273b(8, e4);
            }
            if (!AbstractC1175n.m5334B(byteArrayOutputStream, bArr, c1166eArr)) {
                this.f5493c.mo5273b(5, null);
                this.f5500j = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.f5501k = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f5500j = null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public boolean m5301m() {
        byte[] bArr = this.f5501k;
        if (bArr == null) {
            return false;
        }
        m5291c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f5495e);
                    try {
                        AbstractC1167f.m5313l(byteArrayInputStream, fileOutputStream);
                        m5297k(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return true;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
                this.f5501k = null;
                this.f5500j = null;
            }
        } catch (FileNotFoundException e3) {
            m5297k(6, e3);
            return false;
        } catch (IOException e4) {
            m5297k(7, e4);
            return false;
        }
    }
}
