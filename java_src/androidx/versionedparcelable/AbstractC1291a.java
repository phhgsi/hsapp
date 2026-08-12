package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.collection.C0921a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p116j0.InterfaceC2047a;

/* JADX INFO: renamed from: androidx.versionedparcelable.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1291a {

    /* JADX INFO: renamed from: a */
    protected final C0921a f6321a;

    /* JADX INFO: renamed from: b */
    protected final C0921a f6322b;

    /* JADX INFO: renamed from: c */
    protected final C0921a f6323c;

    public AbstractC1291a(C0921a c0921a, C0921a c0921a2, C0921a c0921a3) {
        this.f6321a = c0921a;
        this.f6322b = c0921a2;
        this.f6323c = c0921a3;
    }

    /* JADX INFO: renamed from: N */
    private void m6550N(InterfaceC2047a interfaceC2047a) {
        try {
            mo6562I(m6551c(interfaceC2047a.getClass()).getName());
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException(interfaceC2047a.getClass().getSimpleName() + " does not have a Parcelizer", e3);
        }
    }

    /* JADX INFO: renamed from: c */
    private Class m6551c(Class cls) throws ClassNotFoundException {
        Class cls2 = (Class) this.f6323c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f6323c.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: d */
    private Method m6552d(String str) throws NoSuchMethodException {
        Method method = (Method) this.f6321a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC1291a.class.getClassLoader()).getDeclaredMethod("read", AbstractC1291a.class);
        this.f6321a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    private Method m6553e(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        Method method = (Method) this.f6322b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsM6551c = m6551c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM6551c.getDeclaredMethod("write", cls, AbstractC1291a.class);
        this.f6322b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: A */
    protected abstract void mo6554A(byte[] bArr);

    /* JADX INFO: renamed from: B */
    public void m6555B(byte[] bArr, int i3) {
        mo6586w(i3);
        mo6554A(bArr);
    }

    /* JADX INFO: renamed from: C */
    protected abstract void mo6556C(CharSequence charSequence);

    /* JADX INFO: renamed from: D */
    public void m6557D(CharSequence charSequence, int i3) {
        mo6586w(i3);
        mo6556C(charSequence);
    }

    /* JADX INFO: renamed from: E */
    protected abstract void mo6558E(int i3);

    /* JADX INFO: renamed from: F */
    public void m6559F(int i3, int i4) {
        mo6586w(i4);
        mo6558E(i3);
    }

    /* JADX INFO: renamed from: G */
    protected abstract void mo6560G(Parcelable parcelable);

    /* JADX INFO: renamed from: H */
    public void m6561H(Parcelable parcelable, int i3) {
        mo6586w(i3);
        mo6560G(parcelable);
    }

    /* JADX INFO: renamed from: I */
    protected abstract void mo6562I(String str);

    /* JADX INFO: renamed from: J */
    public void m6563J(String str, int i3) {
        mo6586w(i3);
        mo6562I(str);
    }

    /* JADX INFO: renamed from: K */
    protected void m6564K(InterfaceC2047a interfaceC2047a, AbstractC1291a abstractC1291a) {
        try {
            m6553e(interfaceC2047a.getClass()).invoke(null, interfaceC2047a, abstractC1291a);
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e3);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e4);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e5);
        } catch (InvocationTargetException e6) {
            if (!(e6.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e6);
            }
            throw ((RuntimeException) e6.getCause());
        }
    }

    /* JADX INFO: renamed from: L */
    protected void m6565L(InterfaceC2047a interfaceC2047a) {
        if (interfaceC2047a == null) {
            mo6562I(null);
            return;
        }
        m6550N(interfaceC2047a);
        AbstractC1291a abstractC1291aMo6568b = mo6568b();
        m6564K(interfaceC2047a, abstractC1291aMo6568b);
        abstractC1291aMo6568b.mo6567a();
    }

    /* JADX INFO: renamed from: M */
    public void m6566M(InterfaceC2047a interfaceC2047a, int i3) {
        mo6586w(i3);
        m6565L(interfaceC2047a);
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo6567a();

    /* JADX INFO: renamed from: b */
    protected abstract AbstractC1291a mo6568b();

    /* JADX INFO: renamed from: f */
    public boolean m6569f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    protected abstract boolean mo6570g();

    /* JADX INFO: renamed from: h */
    public boolean m6571h(boolean z2, int i3) {
        return !mo6576m(i3) ? z2 : mo6570g();
    }

    /* JADX INFO: renamed from: i */
    protected abstract byte[] mo6572i();

    /* JADX INFO: renamed from: j */
    public byte[] m6573j(byte[] bArr, int i3) {
        return !mo6576m(i3) ? bArr : mo6572i();
    }

    /* JADX INFO: renamed from: k */
    protected abstract CharSequence mo6574k();

    /* JADX INFO: renamed from: l */
    public CharSequence m6575l(CharSequence charSequence, int i3) {
        return !mo6576m(i3) ? charSequence : mo6574k();
    }

    /* JADX INFO: renamed from: m */
    protected abstract boolean mo6576m(int i3);

    /* JADX INFO: renamed from: n */
    protected InterfaceC2047a m6577n(String str, AbstractC1291a abstractC1291a) {
        try {
            return (InterfaceC2047a) m6552d(str).invoke(null, abstractC1291a);
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e3);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e4);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e5);
        } catch (InvocationTargetException e6) {
            if (e6.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e6.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e6);
        }
    }

    /* JADX INFO: renamed from: o */
    protected abstract int mo6578o();

    /* JADX INFO: renamed from: p */
    public int m6579p(int i3, int i4) {
        return !mo6576m(i4) ? i3 : mo6578o();
    }

    /* JADX INFO: renamed from: q */
    protected abstract Parcelable mo6580q();

    /* JADX INFO: renamed from: r */
    public Parcelable m6581r(Parcelable parcelable, int i3) {
        return !mo6576m(i3) ? parcelable : mo6580q();
    }

    /* JADX INFO: renamed from: s */
    protected abstract String mo6582s();

    /* JADX INFO: renamed from: t */
    public String m6583t(String str, int i3) {
        return !mo6576m(i3) ? str : mo6582s();
    }

    /* JADX INFO: renamed from: u */
    protected InterfaceC2047a m6584u() {
        String strMo6582s = mo6582s();
        if (strMo6582s == null) {
            return null;
        }
        return m6577n(strMo6582s, mo6568b());
    }

    /* JADX INFO: renamed from: v */
    public InterfaceC2047a m6585v(InterfaceC2047a interfaceC2047a, int i3) {
        return !mo6576m(i3) ? interfaceC2047a : m6584u();
    }

    /* JADX INFO: renamed from: w */
    protected abstract void mo6586w(int i3);

    /* JADX INFO: renamed from: x */
    public void m6587x(boolean z2, boolean z3) {
    }

    /* JADX INFO: renamed from: y */
    protected abstract void mo6588y(boolean z2);

    /* JADX INFO: renamed from: z */
    public void m6589z(boolean z2, int i3) {
        mo6586w(i3);
        mo6588y(z2);
    }
}
