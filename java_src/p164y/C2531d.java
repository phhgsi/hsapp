package p164y;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: y.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2531d {

    /* JADX INFO: renamed from: a */
    private final Shader f11803a;

    /* JADX INFO: renamed from: b */
    private final ColorStateList f11804b;

    /* JADX INFO: renamed from: c */
    private int f11805c;

    private C2531d(Shader shader, ColorStateList colorStateList, int i3) {
        this.f11803a = shader;
        this.f11804b = colorStateList;
        this.f11805c = i3;
    }

    /* JADX INFO: renamed from: a */
    private static C2531d m12092a(Resources resources, int i3, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i3);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (name.equals("gradient")) {
            return m12095d(AbstractC2536i.m12129b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return m12094c(AbstractC2530c.m12085b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    /* JADX INFO: renamed from: b */
    static C2531d m12093b(int i3) {
        return new C2531d(null, null, i3);
    }

    /* JADX INFO: renamed from: c */
    static C2531d m12094c(ColorStateList colorStateList) {
        return new C2531d(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* JADX INFO: renamed from: d */
    static C2531d m12095d(Shader shader) {
        return new C2531d(shader, null, 0);
    }

    /* JADX INFO: renamed from: g */
    public static C2531d m12096g(Resources resources, int i3, Resources.Theme theme) {
        try {
            return m12092a(resources, i3, theme);
        } catch (Exception e3) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public int m12097e() {
        return this.f11805c;
    }

    /* JADX INFO: renamed from: f */
    public Shader m12098f() {
        return this.f11803a;
    }

    /* JADX INFO: renamed from: h */
    public boolean m12099h() {
        return this.f11803a != null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m12100i() {
        ColorStateList colorStateList;
        return this.f11803a == null && (colorStateList = this.f11804b) != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: j */
    public boolean m12101j(int[] iArr) {
        if (!m12100i()) {
            return false;
        }
        ColorStateList colorStateList = this.f11804b;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.f11805c) {
            return false;
        }
        this.f11805c = colorForState;
        return true;
    }

    /* JADX INFO: renamed from: k */
    public void m12102k(int i3) {
        this.f11805c = i3;
    }

    /* JADX INFO: renamed from: l */
    public boolean m12103l() {
        return m12099h() || this.f11805c != 0;
    }
}
