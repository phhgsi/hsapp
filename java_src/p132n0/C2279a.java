package p132n0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: n0.a */
/* JADX INFO: loaded from: classes.dex */
public class C2279a {

    /* JADX INFO: renamed from: a */
    private final Context f10453a;

    /* JADX INFO: renamed from: b */
    private final String f10454b;

    /* JADX INFO: renamed from: c */
    private final int f10455c;

    /* JADX INFO: renamed from: d */
    private final int f10456d;

    public C2279a(Context context, String str, int i3, int i4) {
        this.f10453a = context;
        this.f10454b = str;
        this.f10455c = i3;
        this.f10456d = i4;
    }

    /* JADX INFO: renamed from: a */
    public Drawable m10885a() {
        int iMax = Math.max(this.f10455c, 1);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax, iMax, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setColor(this.f10456d);
        paint.setStyle(Paint.Style.FILL);
        float f3 = iMax;
        float f4 = f3 / 2.0f;
        canvas.drawCircle(f4, f4, f3 / 3.0f, paint);
        return new BitmapDrawable(this.f10453a.getResources(), bitmapCreateBitmap);
    }
}
