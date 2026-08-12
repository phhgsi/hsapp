package p131n;

import android.os.Bundle;

/* JADX INFO: renamed from: n.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2277a {

    /* JADX INFO: renamed from: a */
    public final Integer f10432a;

    /* JADX INFO: renamed from: b */
    public final Integer f10433b;

    /* JADX INFO: renamed from: c */
    public final Integer f10434c;

    /* JADX INFO: renamed from: d */
    public final Integer f10435d;

    /* JADX INFO: renamed from: n.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private Integer f10436a;

        /* JADX INFO: renamed from: b */
        private Integer f10437b;

        /* JADX INFO: renamed from: c */
        private Integer f10438c;

        /* JADX INFO: renamed from: d */
        private Integer f10439d;

        /* JADX INFO: renamed from: a */
        public C2277a m10871a() {
            return new C2277a(this.f10436a, this.f10437b, this.f10438c, this.f10439d);
        }

        /* JADX INFO: renamed from: b */
        public a m10872b(int i3) {
            this.f10437b = Integer.valueOf(i3);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m10873c(int i3) {
            this.f10436a = Integer.valueOf(i3 | (-16777216));
            return this;
        }
    }

    C2277a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f10432a = num;
        this.f10433b = num2;
        this.f10434c = num3;
        this.f10435d = num4;
    }

    /* JADX INFO: renamed from: a */
    Bundle m10870a() {
        Bundle bundle = new Bundle();
        Integer num = this.f10432a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f10433b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f10434c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f10435d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
