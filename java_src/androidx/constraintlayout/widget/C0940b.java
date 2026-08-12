package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.b */
/* JADX INFO: loaded from: classes.dex */
public class C0940b {

    /* JADX INFO: renamed from: a */
    private boolean f3960a;

    /* JADX INFO: renamed from: b */
    String f3961b;

    /* JADX INFO: renamed from: c */
    private b f3962c;

    /* JADX INFO: renamed from: d */
    private int f3963d;

    /* JADX INFO: renamed from: e */
    private float f3964e;

    /* JADX INFO: renamed from: f */
    private String f3965f;

    /* JADX INFO: renamed from: g */
    boolean f3966g;

    /* JADX INFO: renamed from: h */
    private int f3967h;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.b$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f3968a;

        static {
            int[] iArr = new int[b.values().length];
            f3968a = iArr;
            try {
                iArr[b.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3968a[b.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3968a[b.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3968a[b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3968a[b.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3968a[b.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3968a[b.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3968a[b.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.b$b */
    public enum b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public C0940b(String str, b bVar, Object obj, boolean z2) {
        this.f3961b = str;
        this.f3962c = bVar;
        this.f3960a = z2;
        m4033d(obj);
    }

    /* JADX INFO: renamed from: a */
    public static HashMap m4030a(HashMap map, View view) {
        HashMap map2 = new HashMap();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            C0940b c0940b = (C0940b) map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new C0940b(c0940b, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map2.put(str, new C0940b(c0940b, cls.getMethod("getMap" + str, null).invoke(view, null)));
                }
            } catch (IllegalAccessException e3) {
                e3.printStackTrace();
            } catch (NoSuchMethodException e4) {
                e4.printStackTrace();
            } catch (InvocationTargetException e5) {
                e5.printStackTrace();
            }
        }
        return map2;
    }

    /* JADX INFO: renamed from: b */
    public static void m4031b(Context context, XmlPullParser xmlPullParser, HashMap map) {
        b bVar;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC0947i.f4220J4);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        b bVar2 = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i3);
            if (index == AbstractC0947i.f4229K4) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == AbstractC0947i.f4310U4) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z2 = true;
            } else if (index == AbstractC0947i.f4238L4) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                bVar2 = b.BOOLEAN_TYPE;
            } else {
                if (index == AbstractC0947i.f4254N4) {
                    bVar = b.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == AbstractC0947i.f4246M4) {
                    bVar = b.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == AbstractC0947i.f4286R4) {
                    bVar = b.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == AbstractC0947i.f4262O4) {
                    bVar = b.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == AbstractC0947i.f4270P4) {
                    bVar = b.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == AbstractC0947i.f4278Q4) {
                    bVar = b.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == AbstractC0947i.f4302T4) {
                    bVar = b.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == AbstractC0947i.f4294S4) {
                    bVar = b.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                bVar2 = bVar;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            map.put(string, new C0940b(string, bVar2, objValueOf2, z2));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: c */
    public static void m4032c(View view, HashMap map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            C0940b c0940b = (C0940b) map.get(str);
            String str2 = c0940b.f3960a ? str : "set" + str;
            try {
                int i3 = a.f3968a[c0940b.f3962c.ordinal()];
                Class<?> cls2 = Float.TYPE;
                Class<?> cls3 = Integer.TYPE;
                switch (i3) {
                    case 1:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(c0940b.f3963d));
                        break;
                    case 2:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(c0940b.f3966g));
                        break;
                    case 3:
                        cls.getMethod(str2, CharSequence.class).invoke(view, c0940b.f3965f);
                        break;
                    case 4:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(c0940b.f3967h));
                        break;
                    case 5:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(c0940b.f3967h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(c0940b.f3963d));
                        break;
                    case 7:
                        cls.getMethod(str2, cls2).invoke(view, Float.valueOf(c0940b.f3964e));
                        break;
                    case 8:
                        cls.getMethod(str2, cls2).invoke(view, Float.valueOf(c0940b.f3964e));
                        break;
                }
            } catch (IllegalAccessException e3) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e3.printStackTrace();
            } catch (NoSuchMethodException e4) {
                Log.e("TransitionLayout", e4.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(str2);
                Log.e("TransitionLayout", sb.toString());
            } catch (InvocationTargetException e5) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m4033d(Object obj) {
        switch (a.f3968a[this.f3962c.ordinal()]) {
            case 1:
            case 6:
                this.f3963d = ((Integer) obj).intValue();
                break;
            case 2:
                this.f3966g = ((Boolean) obj).booleanValue();
                break;
            case 3:
                this.f3965f = (String) obj;
                break;
            case 4:
            case 5:
                this.f3967h = ((Integer) obj).intValue();
                break;
            case 7:
                this.f3964e = ((Float) obj).floatValue();
                break;
            case 8:
                this.f3964e = ((Float) obj).floatValue();
                break;
        }
    }

    public C0940b(C0940b c0940b, Object obj) {
        this.f3960a = false;
        this.f3961b = c0940b.f3961b;
        this.f3962c = c0940b.f3962c;
        m4033d(obj);
    }
}
