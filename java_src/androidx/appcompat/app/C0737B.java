package androidx.appcompat.app;

import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: androidx.appcompat.app.B */
/* JADX INFO: loaded from: classes.dex */
class C0737B {

    /* JADX INFO: renamed from: a */
    private final Deque f2586a = new ArrayDeque();

    C0737B() {
    }

    /* JADX INFO: renamed from: b */
    private static boolean m2683b(XmlPullParser xmlPullParser) {
        if (xmlPullParser != null) {
            try {
                if (xmlPullParser.getEventType() != 3) {
                    if (xmlPullParser.getEventType() != 1) {
                        return false;
                    }
                }
            } catch (XmlPullParserException unused) {
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    private static XmlPullParser m2684c(Deque deque) {
        while (!deque.isEmpty()) {
            XmlPullParser xmlPullParser = (XmlPullParser) ((WeakReference) deque.peek()).get();
            if (!m2683b(xmlPullParser)) {
                return xmlPullParser;
            }
            deque.pop();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private static boolean m2685d(XmlPullParser xmlPullParser, XmlPullParser xmlPullParser2) {
        if (xmlPullParser2 == null || xmlPullParser == xmlPullParser2) {
            return false;
        }
        try {
            if (xmlPullParser2.getEventType() == 2) {
                return "include".equals(xmlPullParser2.getName());
            }
            return false;
        } catch (XmlPullParserException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    boolean m2686a(AttributeSet attributeSet) {
        if (!(attributeSet instanceof XmlPullParser)) {
            return false;
        }
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        if (xmlPullParser.getDepth() != 1) {
            return false;
        }
        XmlPullParser xmlPullParserM2684c = m2684c(this.f2586a);
        this.f2586a.push(new WeakReference(xmlPullParser));
        return m2685d(xmlPullParser, xmlPullParserM2684c);
    }
}
