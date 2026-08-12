package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import p024I.AbstractC0206c;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k */
    static final PorterDuff.Mode f4659k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a */
    public int f4660a;

    /* JADX INFO: renamed from: b */
    Object f4661b;

    /* JADX INFO: renamed from: c */
    public byte[] f4662c;

    /* JADX INFO: renamed from: d */
    public Parcelable f4663d;

    /* JADX INFO: renamed from: e */
    public int f4664e;

    /* JADX INFO: renamed from: f */
    public int f4665f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f4666g;

    /* JADX INFO: renamed from: h */
    PorterDuff.Mode f4667h;

    /* JADX INFO: renamed from: i */
    public String f4668i;

    /* JADX INFO: renamed from: j */
    public String f4669j;

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$a */
    static class C0970a {
        /* JADX INFO: renamed from: a */
        static int m4247a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0972c.m4253a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return 0;
            } catch (NoSuchMethodException e4) {
                Log.e("IconCompat", "Unable to get icon resource", e4);
                return 0;
            } catch (InvocationTargetException e5) {
                Log.e("IconCompat", "Unable to get icon resource", e5);
                return 0;
            }
        }

        /* JADX INFO: renamed from: b */
        static String m4248b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0972c.m4254b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e3) {
                Log.e("IconCompat", "Unable to get icon package", e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.e("IconCompat", "Unable to get icon package", e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.e("IconCompat", "Unable to get icon package", e5);
                return null;
            }
        }

        /* JADX INFO: renamed from: c */
        static int m4249c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0972c.m4255c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e3) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e3);
                return -1;
            } catch (NoSuchMethodException e4) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e4);
                return -1;
            } catch (InvocationTargetException e5) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e5);
                return -1;
            }
        }

        /* JADX INFO: renamed from: d */
        static Uri m4250d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0972c.m4256d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e3) {
                Log.e("IconCompat", "Unable to get icon uri", e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.e("IconCompat", "Unable to get icon uri", e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.e("IconCompat", "Unable to get icon uri", e5);
                return null;
            }
        }

        /* JADX INFO: renamed from: e */
        static Icon m4251e(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f4660a) {
                case -1:
                    return (Icon) iconCompat.f4661b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f4661b);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.m4239f(), iconCompat.f4664e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f4661b, iconCompat.f4664e, iconCompat.f4665f);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f4661b);
                    break;
                case 5:
                    iconCreateWithBitmap = Build.VERSION.SDK_INT < 26 ? Icon.createWithBitmap(IconCompat.m4233a((Bitmap) iconCompat.f4661b, false)) : C0971b.m4252a((Bitmap) iconCompat.f4661b);
                    break;
                case 6:
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 30) {
                        iconCreateWithBitmap = C0973d.m4257a(iconCompat.m4241h());
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.m4241h());
                        }
                        InputStream inputStreamM4242i = iconCompat.m4242i(context);
                        if (inputStreamM4242i == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.m4241h());
                        }
                        if (i3 < 26) {
                            iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.m4233a(BitmapFactory.decodeStream(inputStreamM4242i), false));
                        } else {
                            iconCreateWithBitmap = C0971b.m4252a(BitmapFactory.decodeStream(inputStreamM4242i));
                        }
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.f4666g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f4667h;
            if (mode != IconCompat.f4659k) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$b */
    static class C0971b {
        /* JADX INFO: renamed from: a */
        static Icon m4252a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$c */
    static class C0972c {
        /* JADX INFO: renamed from: a */
        static int m4253a(Object obj) {
            return ((Icon) obj).getResId();
        }

        /* JADX INFO: renamed from: b */
        static String m4254b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        /* JADX INFO: renamed from: c */
        static int m4255c(Object obj) {
            return ((Icon) obj).getType();
        }

        /* JADX INFO: renamed from: d */
        static Uri m4256d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$d */
    static class C0973d {
        /* JADX INFO: renamed from: a */
        static Icon m4257a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f4660a = -1;
        this.f4662c = null;
        this.f4663d = null;
        this.f4664e = 0;
        this.f4665f = 0;
        this.f4666g = null;
        this.f4667h = f4659k;
        this.f4668i = null;
    }

    /* JADX INFO: renamed from: a */
    static Bitmap m4233a(Bitmap bitmap, boolean z2) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f3 = iMin;
        float f4 = 0.5f * f3;
        float f5 = 0.9166667f * f4;
        if (z2) {
            float f6 = 0.010416667f * f3;
            paint.setColor(0);
            paint.setShadowLayer(f6, 0.0f, f3 * 0.020833334f, 1023410176);
            canvas.drawCircle(f4, f4, f5, paint);
            paint.setShadowLayer(f6, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f4, f4, f5, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f4, f4, f5, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: b */
    public static IconCompat m4234b(Bitmap bitmap) {
        AbstractC0206c.m598c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f4661b = bitmap;
        return iconCompat;
    }

    /* JADX INFO: renamed from: c */
    public static IconCompat m4235c(Resources resources, String str, int i3) {
        AbstractC0206c.m598c(str);
        if (i3 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f4664e = i3;
        if (resources != null) {
            try {
                iconCompat.f4661b = resources.getResourceName(i3);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f4661b = str;
        }
        iconCompat.f4669j = str;
        return iconCompat;
    }

    /* JADX INFO: renamed from: n */
    private static String m4236n(int i3) {
        switch (i3) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* JADX INFO: renamed from: d */
    public Bitmap m4237d() {
        int i3 = this.f4660a;
        if (i3 == -1) {
            Object obj = this.f4661b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i3 == 1) {
            return (Bitmap) this.f4661b;
        }
        if (i3 == 5) {
            return m4233a((Bitmap) this.f4661b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    /* JADX INFO: renamed from: e */
    public int m4238e() {
        int i3 = this.f4660a;
        if (i3 == -1) {
            return C0970a.m4247a(this.f4661b);
        }
        if (i3 == 2) {
            return this.f4664e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* JADX INFO: renamed from: f */
    public String m4239f() {
        int i3 = this.f4660a;
        if (i3 == -1) {
            return C0970a.m4248b(this.f4661b);
        }
        if (i3 == 2) {
            String str = this.f4669j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f4661b).split(":", -1)[0] : this.f4669j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* JADX INFO: renamed from: g */
    public int m4240g() {
        int i3 = this.f4660a;
        return i3 == -1 ? C0970a.m4249c(this.f4661b) : i3;
    }

    /* JADX INFO: renamed from: h */
    public Uri m4241h() {
        int i3 = this.f4660a;
        if (i3 == -1) {
            return C0970a.m4250d(this.f4661b);
        }
        if (i3 == 4 || i3 == 6) {
            return Uri.parse((String) this.f4661b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* JADX INFO: renamed from: i */
    public InputStream m4242i(Context context) {
        Uri uriM4241h = m4241h();
        String scheme = uriM4241h.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriM4241h);
            } catch (Exception e3) {
                Log.w("IconCompat", "Unable to load image from URI: " + uriM4241h, e3);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f4661b));
        } catch (FileNotFoundException e4) {
            Log.w("IconCompat", "Unable to load image from path: " + uriM4241h, e4);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m4243j() {
        this.f4667h = PorterDuff.Mode.valueOf(this.f4668i);
        switch (this.f4660a) {
            case -1:
                Parcelable parcelable = this.f4663d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f4661b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f4663d;
                if (parcelable2 != null) {
                    this.f4661b = parcelable2;
                    return;
                }
                byte[] bArr = this.f4662c;
                this.f4661b = bArr;
                this.f4660a = 3;
                this.f4664e = 0;
                this.f4665f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f4662c, Charset.forName("UTF-16"));
                this.f4661b = str;
                if (this.f4660a == 2 && this.f4669j == null) {
                    this.f4669j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f4661b = this.f4662c;
                return;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m4244k(boolean z2) {
        this.f4668i = this.f4667h.name();
        switch (this.f4660a) {
            case -1:
                if (z2) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f4663d = (Parcelable) this.f4661b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z2) {
                    this.f4663d = (Parcelable) this.f4661b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f4661b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f4662c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f4662c = ((String) this.f4661b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f4662c = (byte[]) this.f4661b;
                return;
            case 4:
            case 6:
                this.f4662c = this.f4661b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    /* JADX INFO: renamed from: l */
    public Icon m4245l() {
        return m4246m(null);
    }

    /* JADX INFO: renamed from: m */
    public Icon m4246m(Context context) {
        return C0970a.m4251e(this, context);
    }

    public String toString() {
        if (this.f4660a == -1) {
            return String.valueOf(this.f4661b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(m4236n(this.f4660a));
        switch (this.f4660a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f4661b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f4661b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f4669j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m4238e())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f4664e);
                if (this.f4665f != 0) {
                    sb.append(" off=");
                    sb.append(this.f4665f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f4661b);
                break;
        }
        if (this.f4666g != null) {
            sb.append(" tint=");
            sb.append(this.f4666g);
        }
        if (this.f4667h != f4659k) {
            sb.append(" mode=");
            sb.append(this.f4667h);
        }
        sb.append(")");
        return sb.toString();
    }

    IconCompat(int i3) {
        this.f4662c = null;
        this.f4663d = null;
        this.f4664e = 0;
        this.f4665f = 0;
        this.f4666g = null;
        this.f4667h = f4659k;
        this.f4668i = null;
        this.f4660a = i3;
    }
}
