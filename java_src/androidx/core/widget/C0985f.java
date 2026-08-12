package androidx.core.widget;

import android.widget.ListView;

/* JADX INFO: renamed from: androidx.core.widget.f */
/* JADX INFO: loaded from: classes.dex */
public class C0985f extends AbstractViewOnTouchListenerC0980a {

    /* JADX INFO: renamed from: s */
    private final ListView f4735s;

    public C0985f(ListView listView) {
        super(listView);
        this.f4735s = listView;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC0980a
    /* JADX INFO: renamed from: a */
    public boolean mo4317a(int i3) {
        return false;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC0980a
    /* JADX INFO: renamed from: b */
    public boolean mo4318b(int i3) {
        ListView listView = this.f4735s;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i4 = firstVisiblePosition + childCount;
        if (i3 > 0) {
            if (i4 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i3 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC0980a
    /* JADX INFO: renamed from: j */
    public void mo4320j(int i3, int i4) {
        this.f4735s.scrollListBy(i4);
    }
}
