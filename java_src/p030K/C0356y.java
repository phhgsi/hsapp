package p030K;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.app.AbstractC0740E;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p030K.InterfaceC0331B;
import p158w.AbstractC2485c;

/* JADX INFO: renamed from: K.y */
/* JADX INFO: loaded from: classes.dex */
public class C0356y {

    /* JADX INFO: renamed from: d */
    private static int f1422d;

    /* JADX INFO: renamed from: a */
    private final AccessibilityNodeInfo f1423a;

    /* JADX INFO: renamed from: b */
    public int f1424b = -1;

    /* JADX INFO: renamed from: c */
    private int f1425c = -1;

    /* JADX INFO: renamed from: K.y$a */
    public static class a {

        /* JADX INFO: renamed from: A */
        public static final a f1426A;

        /* JADX INFO: renamed from: B */
        public static final a f1427B;

        /* JADX INFO: renamed from: C */
        public static final a f1428C;

        /* JADX INFO: renamed from: D */
        public static final a f1429D;

        /* JADX INFO: renamed from: E */
        public static final a f1430E;

        /* JADX INFO: renamed from: F */
        public static final a f1431F;

        /* JADX INFO: renamed from: G */
        public static final a f1432G;

        /* JADX INFO: renamed from: H */
        public static final a f1433H;

        /* JADX INFO: renamed from: I */
        public static final a f1434I;

        /* JADX INFO: renamed from: J */
        public static final a f1435J;

        /* JADX INFO: renamed from: K */
        public static final a f1436K;

        /* JADX INFO: renamed from: L */
        public static final a f1437L;

        /* JADX INFO: renamed from: M */
        public static final a f1438M;

        /* JADX INFO: renamed from: N */
        public static final a f1439N;

        /* JADX INFO: renamed from: O */
        public static final a f1440O;

        /* JADX INFO: renamed from: P */
        public static final a f1441P;

        /* JADX INFO: renamed from: Q */
        public static final a f1442Q;

        /* JADX INFO: renamed from: R */
        public static final a f1443R;

        /* JADX INFO: renamed from: S */
        public static final a f1444S;

        /* JADX INFO: renamed from: T */
        public static final a f1445T;

        /* JADX INFO: renamed from: U */
        public static final a f1446U;

        /* JADX INFO: renamed from: V */
        public static final a f1447V;

        /* JADX INFO: renamed from: e */
        public static final a f1448e = new a(1, null);

        /* JADX INFO: renamed from: f */
        public static final a f1449f = new a(2, null);

        /* JADX INFO: renamed from: g */
        public static final a f1450g = new a(4, null);

        /* JADX INFO: renamed from: h */
        public static final a f1451h = new a(8, null);

        /* JADX INFO: renamed from: i */
        public static final a f1452i = new a(16, null);

        /* JADX INFO: renamed from: j */
        public static final a f1453j = new a(32, null);

        /* JADX INFO: renamed from: k */
        public static final a f1454k = new a(64, null);

        /* JADX INFO: renamed from: l */
        public static final a f1455l = new a(128, null);

        /* JADX INFO: renamed from: m */
        public static final a f1456m = new a(256, (CharSequence) null, InterfaceC0331B.b.class);

        /* JADX INFO: renamed from: n */
        public static final a f1457n = new a(512, (CharSequence) null, InterfaceC0331B.b.class);

        /* JADX INFO: renamed from: o */
        public static final a f1458o = new a(1024, (CharSequence) null, InterfaceC0331B.c.class);

        /* JADX INFO: renamed from: p */
        public static final a f1459p = new a(2048, (CharSequence) null, InterfaceC0331B.c.class);

        /* JADX INFO: renamed from: q */
        public static final a f1460q = new a(4096, null);

        /* JADX INFO: renamed from: r */
        public static final a f1461r = new a(8192, null);

        /* JADX INFO: renamed from: s */
        public static final a f1462s = new a(16384, null);

        /* JADX INFO: renamed from: t */
        public static final a f1463t = new a(32768, null);

        /* JADX INFO: renamed from: u */
        public static final a f1464u = new a(65536, null);

        /* JADX INFO: renamed from: v */
        public static final a f1465v = new a(131072, (CharSequence) null, InterfaceC0331B.g.class);

        /* JADX INFO: renamed from: w */
        public static final a f1466w = new a(262144, null);

        /* JADX INFO: renamed from: x */
        public static final a f1467x = new a(524288, null);

        /* JADX INFO: renamed from: y */
        public static final a f1468y = new a(1048576, null);

        /* JADX INFO: renamed from: z */
        public static final a f1469z = new a(2097152, (CharSequence) null, InterfaceC0331B.h.class);

        /* JADX INFO: renamed from: a */
        final Object f1470a;

        /* JADX INFO: renamed from: b */
        private final int f1471b;

        /* JADX INFO: renamed from: c */
        private final Class f1472c;

        /* JADX INFO: renamed from: d */
        protected final InterfaceC0331B f1473d;

        static {
            int i3 = Build.VERSION.SDK_INT;
            f1426A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f1427B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, InterfaceC0331B.e.class);
            f1428C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f1429D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f1430E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f1431F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            f1432G = new a(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f1433H = new a(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f1434I = new a(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            f1435J = new a(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            f1436K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f1437L = new a(i3 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, InterfaceC0331B.f.class);
            f1438M = new a(i3 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, InterfaceC0331B.d.class);
            f1439N = new a(i3 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            f1440O = new a(i3 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            f1441P = new a(i3 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            f1442Q = new a(i3 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            f1443R = new a(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            f1444S = new a(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            f1445T = new a(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            f1446U = new a(i3 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            f1447V = new a(i3 >= 34 ? d.m1308a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i3, CharSequence charSequence) {
            this(null, i3, charSequence, null, null);
        }

        /* JADX INFO: renamed from: a */
        public a m1300a(CharSequence charSequence, InterfaceC0331B interfaceC0331B) {
            return new a(null, this.f1471b, charSequence, interfaceC0331B, this.f1472c);
        }

        /* JADX INFO: renamed from: b */
        public int m1301b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f1470a).getId();
        }

        /* JADX INFO: renamed from: c */
        public CharSequence m1302c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f1470a).getLabel();
        }

        /* JADX INFO: renamed from: d */
        public boolean m1303d(View view, Bundle bundle) {
            if (this.f1473d == null) {
                return false;
            }
            Class cls = this.f1472c;
            if (cls != null) {
                try {
                    AbstractC0740E.m2693a(cls.getDeclaredConstructor(null).newInstance(null));
                    throw null;
                } catch (Exception e3) {
                    Class cls2 = this.f1472c;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e3);
                }
            }
            return this.f1473d.mo1175a(view, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f1470a;
            return obj2 == null ? aVar.f1470a == null : obj2.equals(aVar.f1470a);
        }

        public int hashCode() {
            Object obj = this.f1470a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String strM1211j = C0356y.m1211j(this.f1471b);
            if (strM1211j.equals("ACTION_UNKNOWN") && m1302c() != null) {
                strM1211j = m1302c().toString();
            }
            sb.append(strM1211j);
            return sb.toString();
        }

        public a(int i3, CharSequence charSequence, InterfaceC0331B interfaceC0331B) {
            this(null, i3, charSequence, interfaceC0331B, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i3, CharSequence charSequence, Class cls) {
            this(null, i3, charSequence, null, cls);
        }

        a(Object obj, int i3, CharSequence charSequence, InterfaceC0331B interfaceC0331B, Class cls) {
            this.f1471b = i3;
            this.f1473d = interfaceC0331B;
            if (obj == null) {
                this.f1470a = new AccessibilityNodeInfo.AccessibilityAction(i3, charSequence);
            } else {
                this.f1470a = obj;
            }
            this.f1472c = cls;
        }
    }

    /* JADX INFO: renamed from: K.y$b */
    private static class b {
        /* JADX INFO: renamed from: a */
        public static CharSequence m1304a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        /* JADX INFO: renamed from: b */
        public static void m1305b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: K.y$c */
    private static class c {
        /* JADX INFO: renamed from: a */
        public static String m1306a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        /* JADX INFO: renamed from: b */
        public static boolean m1307b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    /* JADX INFO: renamed from: K.y$d */
    private static class d {
        /* JADX INFO: renamed from: a */
        public static AccessibilityNodeInfo.AccessibilityAction m1308a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        /* JADX INFO: renamed from: b */
        public static void m1309b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        /* JADX INFO: renamed from: c */
        public static CharSequence m1310c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        /* JADX INFO: renamed from: d */
        public static boolean m1311d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }
    }

    /* JADX INFO: renamed from: K.y$e */
    private static class e {
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static int m1313b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getChecked();
        }

        /* JADX INFO: renamed from: c */
        public static int m1314c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExpandedState();
        }

        /* JADX INFO: renamed from: d */
        public static CharSequence m1315d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getSupplementalDescription();
        }

        /* JADX INFO: renamed from: e */
        public static boolean m1316e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isFieldRequired();
        }
    }

    /* JADX INFO: renamed from: K.y$f */
    public static class f {

        /* JADX INFO: renamed from: a */
        final Object f1474a;

        f(Object obj) {
            this.f1474a = obj;
        }

        /* JADX INFO: renamed from: a */
        public static f m1317a(int i3, int i4, boolean z2) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i3, i4, z2));
        }

        /* JADX INFO: renamed from: b */
        public static f m1318b(int i3, int i4, boolean z2, int i5) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i3, i4, z2, i5));
        }
    }

    /* JADX INFO: renamed from: K.y$g */
    public static class g {

        /* JADX INFO: renamed from: a */
        final Object f1475a;

        g(Object obj) {
            this.f1475a = obj;
        }

        /* JADX INFO: renamed from: a */
        public static g m1319a(int i3, int i4, int i5, int i6, boolean z2, boolean z3) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i3, i4, i5, i6, z2, z3));
        }
    }

    private C0356y(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1423a = accessibilityNodeInfo;
    }

    /* JADX INFO: renamed from: B */
    private SparseArray m1200B(View view) {
        SparseArray sparseArrayM1201D = m1201D(view);
        if (sparseArrayM1201D != null) {
            return sparseArrayM1201D;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(AbstractC2485c.f11518I, sparseArray);
        return sparseArray;
    }

    /* JADX INFO: renamed from: D */
    private SparseArray m1201D(View view) {
        return (SparseArray) view.getTag(AbstractC2485c.f11518I);
    }

    /* JADX INFO: renamed from: K */
    private boolean m1202K() {
        return !m1209h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* JADX INFO: renamed from: L */
    private int m1203L(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i3)).get())) {
                    return sparseArray.keyAt(i3);
                }
            }
        }
        int i4 = f1422d;
        f1422d = i4 + 1;
        return i4;
    }

    /* JADX INFO: renamed from: V0 */
    public static C0356y m1204V0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0356y(accessibilityNodeInfo);
    }

    /* JADX INFO: renamed from: e */
    private void m1205e(ClickableSpan clickableSpan, Spanned spanned, int i3) {
        m1209h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m1209h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m1209h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m1209h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i3));
    }

    /* JADX INFO: renamed from: f0 */
    public static C0356y m1206f0() {
        return m1204V0(AccessibilityNodeInfo.obtain());
    }

    /* JADX INFO: renamed from: g */
    private void m1207g() {
        this.f1423a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f1423a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f1423a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f1423a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    /* JADX INFO: renamed from: g0 */
    public static C0356y m1208g0(C0356y c0356y) {
        return m1204V0(AccessibilityNodeInfo.obtain(c0356y.f1423a));
    }

    /* JADX INFO: renamed from: h */
    private List m1209h(String str) {
        ArrayList<Integer> integerArrayList = this.f1423a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f1423a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: h0 */
    public static C0356y m1210h0(View view) {
        return m1204V0(AccessibilityNodeInfo.obtain(view));
    }

    /* JADX INFO: renamed from: j */
    static String m1211j(int i3) {
        if (i3 == 1) {
            return "ACTION_FOCUS";
        }
        if (i3 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i3) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i3) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i3) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i3) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: l */
    private boolean m1212l(int i3) {
        Bundle bundleM1298z = m1298z();
        return bundleM1298z != null && (bundleM1298z.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i3) == i3;
    }

    /* JADX INFO: renamed from: l0 */
    private void m1213l0(View view) {
        SparseArray sparseArrayM1201D = m1201D(view);
        if (sparseArrayM1201D != null) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < sparseArrayM1201D.size(); i3++) {
                if (((WeakReference) sparseArrayM1201D.valueAt(i3)).get() == null) {
                    arrayList.add(Integer.valueOf(i3));
                }
            }
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                sparseArrayM1201D.remove(((Integer) arrayList.get(i4)).intValue());
            }
        }
    }

    /* JADX INFO: renamed from: n0 */
    private void m1214n0(int i3, boolean z2) {
        Bundle bundleM1298z = m1298z();
        if (bundleM1298z != null) {
            int i4 = bundleM1298z.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i3);
            if (!z2) {
                i3 = 0;
            }
            bundleM1298z.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i3 | i4);
        }
    }

    /* JADX INFO: renamed from: q */
    private String m1215q() {
        int iM1281p = m1281p();
        return iM1281p == 1 ? "TRUE" : iM1281p == 2 ? "PARTIAL" : "FALSE";
    }

    /* JADX INFO: renamed from: t */
    public static ClickableSpan[] m1216t(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    static String m1217y(int i3) {
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? "UNKNOWN" : "FULL" : "PARTIAL" : "COLLAPSED" : "UNDEFINED";
    }

    /* JADX INFO: renamed from: A */
    public int m1218A() {
        return this.f1423a.getMaxTextLength();
    }

    /* JADX INFO: renamed from: A0 */
    public void m1219A0(boolean z2) {
        this.f1423a.setFocused(z2);
    }

    /* JADX INFO: renamed from: B0 */
    public void m1220B0(boolean z2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1423a.setHeading(z2);
        } else {
            m1214n0(2, z2);
        }
    }

    /* JADX INFO: renamed from: C */
    public CharSequence m1221C() {
        return this.f1423a.getPackageName();
    }

    /* JADX INFO: renamed from: C0 */
    public void m1222C0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1423a.setHintText(charSequence);
        } else {
            this.f1423a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public void m1223D0(View view) {
        this.f1423a.setLabelFor(view);
    }

    /* JADX INFO: renamed from: E */
    public CharSequence m1224E() {
        return Build.VERSION.SDK_INT >= 30 ? b.m1304a(this.f1423a) : this.f1423a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    /* JADX INFO: renamed from: E0 */
    public void m1225E0(int i3) {
        this.f1423a.setMaxTextLength(i3);
    }

    /* JADX INFO: renamed from: F */
    public CharSequence m1226F() {
        return Build.VERSION.SDK_INT >= 36 ? e.m1315d(this.f1423a) : this.f1423a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY");
    }

    /* JADX INFO: renamed from: F0 */
    public void m1227F0(CharSequence charSequence) {
        this.f1423a.setPackageName(charSequence);
    }

    /* JADX INFO: renamed from: G */
    public CharSequence m1228G() {
        if (!m1202K()) {
            return this.f1423a.getText();
        }
        List listM1209h = m1209h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List listM1209h2 = m1209h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List listM1209h3 = m1209h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List listM1209h4 = m1209h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f1423a.getText(), 0, this.f1423a.getText().length()));
        for (int i3 = 0; i3 < listM1209h.size(); i3++) {
            spannableString.setSpan(new C0332a(((Integer) listM1209h4.get(i3)).intValue(), this, m1298z().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) listM1209h.get(i3)).intValue(), ((Integer) listM1209h2.get(i3)).intValue(), ((Integer) listM1209h3.get(i3)).intValue());
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: G0 */
    public void m1229G0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1423a.setPaneTitle(charSequence);
        } else {
            this.f1423a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* JADX INFO: renamed from: H */
    public CharSequence m1230H() {
        return Build.VERSION.SDK_INT >= 28 ? this.f1423a.getTooltipText() : this.f1423a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    /* JADX INFO: renamed from: H0 */
    public void m1231H0(View view) {
        this.f1424b = -1;
        this.f1423a.setParent(view);
    }

    /* JADX INFO: renamed from: I */
    public String m1232I() {
        return Build.VERSION.SDK_INT >= 33 ? c.m1306a(this.f1423a) : this.f1423a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    /* JADX INFO: renamed from: I0 */
    public void m1233I0(View view, int i3) {
        this.f1424b = i3;
        this.f1423a.setParent(view, i3);
    }

    /* JADX INFO: renamed from: J */
    public String m1234J() {
        return this.f1423a.getViewIdResourceName();
    }

    /* JADX INFO: renamed from: J0 */
    public void m1235J0(CharSequence charSequence) {
        this.f1423a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    /* JADX INFO: renamed from: K0 */
    public void m1236K0(boolean z2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1423a.setScreenReaderFocusable(z2);
        } else {
            m1214n0(1, z2);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m1237L0(boolean z2) {
        this.f1423a.setScrollable(z2);
    }

    /* JADX INFO: renamed from: M */
    public boolean m1238M() {
        return Build.VERSION.SDK_INT >= 34 ? d.m1311d(this.f1423a) : m1212l(64);
    }

    /* JADX INFO: renamed from: M0 */
    public void m1239M0(boolean z2) {
        this.f1423a.setSelected(z2);
    }

    /* JADX INFO: renamed from: N */
    public boolean m1240N() {
        return this.f1423a.isAccessibilityFocused();
    }

    /* JADX INFO: renamed from: N0 */
    public void m1241N0(boolean z2) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1423a.setShowingHintText(z2);
        } else {
            m1214n0(4, z2);
        }
    }

    /* JADX INFO: renamed from: O */
    public boolean m1242O() {
        return this.f1423a.isCheckable();
    }

    /* JADX INFO: renamed from: O0 */
    public void m1243O0(View view) {
        this.f1425c = -1;
        this.f1423a.setSource(view);
    }

    /* JADX INFO: renamed from: P */
    public boolean m1244P() {
        return this.f1423a.isChecked();
    }

    /* JADX INFO: renamed from: P0 */
    public void m1245P0(View view, int i3) {
        this.f1425c = i3;
        this.f1423a.setSource(view, i3);
    }

    /* JADX INFO: renamed from: Q */
    public boolean m1246Q() {
        return this.f1423a.isClickable();
    }

    /* JADX INFO: renamed from: Q0 */
    public void m1247Q0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.m1305b(this.f1423a, charSequence);
        } else {
            this.f1423a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* JADX INFO: renamed from: R */
    public boolean m1248R() {
        return this.f1423a.isContextClickable();
    }

    /* JADX INFO: renamed from: R0 */
    public void m1249R0(CharSequence charSequence) {
        this.f1423a.setText(charSequence);
    }

    /* JADX INFO: renamed from: S */
    public boolean m1250S() {
        return this.f1423a.isEnabled();
    }

    /* JADX INFO: renamed from: S0 */
    public void m1251S0(View view) {
        this.f1423a.setTraversalAfter(view);
    }

    /* JADX INFO: renamed from: T */
    public boolean m1252T() {
        return Build.VERSION.SDK_INT >= 36 ? e.m1316e(this.f1423a) : this.f1423a.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
    }

    /* JADX INFO: renamed from: T0 */
    public void m1253T0(boolean z2) {
        this.f1423a.setVisibleToUser(z2);
    }

    /* JADX INFO: renamed from: U */
    public boolean m1254U() {
        return this.f1423a.isFocusable();
    }

    /* JADX INFO: renamed from: U0 */
    public AccessibilityNodeInfo m1255U0() {
        return this.f1423a;
    }

    /* JADX INFO: renamed from: V */
    public boolean m1256V() {
        return this.f1423a.isFocused();
    }

    /* JADX INFO: renamed from: W */
    public boolean m1257W() {
        return m1212l(67108864);
    }

    /* JADX INFO: renamed from: X */
    public boolean m1258X() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f1423a.isImportantForAccessibility();
        }
        return true;
    }

    /* JADX INFO: renamed from: Y */
    public boolean m1259Y() {
        return this.f1423a.isLongClickable();
    }

    /* JADX INFO: renamed from: Z */
    public boolean m1260Z() {
        return this.f1423a.isPassword();
    }

    /* JADX INFO: renamed from: a */
    public void m1261a(int i3) {
        this.f1423a.addAction(i3);
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m1262a0() {
        return this.f1423a.isScrollable();
    }

    /* JADX INFO: renamed from: b */
    public void m1263b(a aVar) {
        this.f1423a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f1470a);
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m1264b0() {
        return this.f1423a.isSelected();
    }

    /* JADX INFO: renamed from: c */
    public void m1265c(View view) {
        this.f1423a.addChild(view);
    }

    /* JADX INFO: renamed from: c0 */
    public boolean m1266c0() {
        return Build.VERSION.SDK_INT >= 26 ? this.f1423a.isShowingHintText() : m1212l(4);
    }

    /* JADX INFO: renamed from: d */
    public void m1267d(View view, int i3) {
        this.f1423a.addChild(view, i3);
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m1268d0() {
        return Build.VERSION.SDK_INT >= 33 ? c.m1307b(this.f1423a) : m1212l(8388608);
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m1269e0() {
        return this.f1423a.isVisibleToUser();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0356y)) {
            return false;
        }
        C0356y c0356y = (C0356y) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1423a;
        if (accessibilityNodeInfo == null) {
            if (c0356y.f1423a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(c0356y.f1423a)) {
            return false;
        }
        return this.f1425c == c0356y.f1425c && this.f1424b == c0356y.f1424b;
    }

    /* JADX INFO: renamed from: f */
    public void m1270f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            m1207g();
            m1213l0(view);
            ClickableSpan[] clickableSpanArrM1216t = m1216t(charSequence);
            if (clickableSpanArrM1216t == null || clickableSpanArrM1216t.length <= 0) {
                return;
            }
            m1298z().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", AbstractC2485c.f11530a);
            SparseArray sparseArrayM1200B = m1200B(view);
            for (int i3 = 0; i3 < clickableSpanArrM1216t.length; i3++) {
                int iM1203L = m1203L(clickableSpanArrM1216t[i3], sparseArrayM1200B);
                sparseArrayM1200B.put(iM1203L, new WeakReference(clickableSpanArrM1216t[i3]));
                m1205e(clickableSpanArrM1216t[i3], (Spanned) charSequence, iM1203L);
            }
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1423a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public List m1271i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f1423a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new a(actionList.get(i3)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i0 */
    public boolean m1272i0(int i3, Bundle bundle) {
        return this.f1423a.performAction(i3, bundle);
    }

    /* JADX INFO: renamed from: k */
    public int m1274k() {
        return this.f1423a.getActions();
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m1275k0(a aVar) {
        return this.f1423a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f1470a);
    }

    /* JADX INFO: renamed from: m */
    public void m1276m(Rect rect) {
        this.f1423a.getBoundsInParent(rect);
    }

    /* JADX INFO: renamed from: m0 */
    public void m1277m0(boolean z2) {
        this.f1423a.setAccessibilityFocused(z2);
    }

    /* JADX INFO: renamed from: n */
    public void m1278n(Rect rect) {
        this.f1423a.getBoundsInScreen(rect);
    }

    /* JADX INFO: renamed from: o */
    public void m1279o(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.m1309b(this.f1423a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f1423a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m1280o0(Rect rect) {
        this.f1423a.setBoundsInParent(rect);
    }

    /* JADX INFO: renamed from: p */
    public int m1281p() {
        return Build.VERSION.SDK_INT >= 36 ? e.m1313b(this.f1423a) : this.f1423a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", this.f1423a.isChecked() ? 1 : 0);
    }

    /* JADX INFO: renamed from: p0 */
    public void m1282p0(Rect rect) {
        this.f1423a.setBoundsInScreen(rect);
    }

    /* JADX INFO: renamed from: q0 */
    public void m1283q0(boolean z2) {
        this.f1423a.setCheckable(z2);
    }

    /* JADX INFO: renamed from: r */
    public int m1284r() {
        return this.f1423a.getChildCount();
    }

    /* JADX INFO: renamed from: r0 */
    public void m1285r0(boolean z2) {
        this.f1423a.setChecked(z2);
    }

    /* JADX INFO: renamed from: s */
    public CharSequence m1286s() {
        return this.f1423a.getClassName();
    }

    /* JADX INFO: renamed from: s0 */
    public void m1287s0(CharSequence charSequence) {
        this.f1423a.setClassName(charSequence);
    }

    /* JADX INFO: renamed from: t0 */
    public void m1288t0(boolean z2) {
        this.f1423a.setClickable(z2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m1276m(rect);
        sb.append("; boundsInParent: " + rect);
        m1278n(rect);
        sb.append("; boundsInScreen: " + rect);
        m1279o(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(m1221C());
        sb.append("; className: ");
        sb.append(m1286s());
        sb.append("; text: ");
        sb.append(m1228G());
        sb.append("; error: ");
        sb.append(m1293w());
        sb.append("; maxTextLength: ");
        sb.append(m1218A());
        sb.append("; stateDescription: ");
        sb.append(m1224E());
        sb.append("; contentDescription: ");
        sb.append(m1291v());
        sb.append("; supplementalDescription: ");
        sb.append(m1226F());
        sb.append("; tooltipText: ");
        sb.append(m1230H());
        sb.append("; viewIdResName: ");
        sb.append(m1234J());
        sb.append("; uniqueId: ");
        sb.append(m1232I());
        sb.append("; checkable: ");
        sb.append(m1242O());
        sb.append("; checked: ");
        sb.append(m1215q());
        sb.append("; fieldRequired: ");
        sb.append(m1252T());
        sb.append("; focusable: ");
        sb.append(m1254U());
        sb.append("; focused: ");
        sb.append(m1256V());
        sb.append("; selected: ");
        sb.append(m1264b0());
        sb.append("; clickable: ");
        sb.append(m1246Q());
        sb.append("; longClickable: ");
        sb.append(m1259Y());
        sb.append("; contextClickable: ");
        sb.append(m1248R());
        sb.append("; expandedState: ");
        sb.append(m1217y(m1295x()));
        sb.append("; enabled: ");
        sb.append(m1250S());
        sb.append("; password: ");
        sb.append(m1260Z());
        sb.append("; scrollable: " + m1262a0());
        sb.append("; containerTitle: ");
        sb.append(m1289u());
        sb.append("; granularScrollingSupported: ");
        sb.append(m1257W());
        sb.append("; importantForAccessibility: ");
        sb.append(m1258X());
        sb.append("; visible: ");
        sb.append(m1269e0());
        sb.append("; isTextSelectable: ");
        sb.append(m1268d0());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(m1238M());
        sb.append("; [");
        List listM1271i = m1271i();
        for (int i3 = 0; i3 < listM1271i.size(); i3++) {
            a aVar = (a) listM1271i.get(i3);
            String strM1211j = m1211j(aVar.m1301b());
            if (strM1211j.equals("ACTION_UNKNOWN") && aVar.m1302c() != null) {
                strM1211j = aVar.m1302c().toString();
            }
            sb.append(strM1211j);
            if (i3 != listM1271i.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public CharSequence m1289u() {
        return Build.VERSION.SDK_INT >= 34 ? d.m1310c(this.f1423a) : this.f1423a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    /* JADX INFO: renamed from: u0 */
    public void m1290u0(Object obj) {
        this.f1423a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((f) obj).f1474a);
    }

    /* JADX INFO: renamed from: v */
    public CharSequence m1291v() {
        return this.f1423a.getContentDescription();
    }

    /* JADX INFO: renamed from: v0 */
    public void m1292v0(Object obj) {
        this.f1423a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((g) obj).f1475a);
    }

    /* JADX INFO: renamed from: w */
    public CharSequence m1293w() {
        return this.f1423a.getError();
    }

    /* JADX INFO: renamed from: w0 */
    public void m1294w0(CharSequence charSequence) {
        this.f1423a.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: x */
    public int m1295x() {
        return Build.VERSION.SDK_INT >= 36 ? e.m1314c(this.f1423a) : this.f1423a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
    }

    /* JADX INFO: renamed from: x0 */
    public void m1296x0(boolean z2) {
        this.f1423a.setEnabled(z2);
    }

    /* JADX INFO: renamed from: y0 */
    public void m1297y0(CharSequence charSequence) {
        this.f1423a.setError(charSequence);
    }

    /* JADX INFO: renamed from: z */
    public Bundle m1298z() {
        return this.f1423a.getExtras();
    }

    /* JADX INFO: renamed from: z0 */
    public void m1299z0(boolean z2) {
        this.f1423a.setFocusable(z2);
    }

    /* JADX INFO: renamed from: j0 */
    public void m1273j0() {
    }
}
