package androidx.activity.result;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.BaseGmsClient;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;

/* JADX INFO: loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {

    /* JADX INFO: renamed from: d */
    private final IntentSender f2476d;

    /* JADX INFO: renamed from: e */
    private final Intent f2477e;

    /* JADX INFO: renamed from: f */
    private final int f2478f;

    /* JADX INFO: renamed from: g */
    private final int f2479g;

    /* JADX INFO: renamed from: h */
    public static final C0723c f2475h = new C0723c(null);
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new C0722b();

    /* JADX INFO: renamed from: androidx.activity.result.IntentSenderRequest$a */
    public static final class C0721a {

        /* JADX INFO: renamed from: a */
        private final IntentSender f2480a;

        /* JADX INFO: renamed from: b */
        private Intent f2481b;

        /* JADX INFO: renamed from: c */
        private int f2482c;

        /* JADX INFO: renamed from: d */
        private int f2483d;

        public C0721a(IntentSender intentSender) {
            AbstractC0606k.m2145e(intentSender, "intentSender");
            this.f2480a = intentSender;
        }

        /* JADX INFO: renamed from: a */
        public final IntentSenderRequest m2645a() {
            return new IntentSenderRequest(this.f2480a, this.f2481b, this.f2482c, this.f2483d);
        }

        /* JADX INFO: renamed from: b */
        public final C0721a m2646b(Intent intent) {
            this.f2481b = intent;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public final C0721a m2647c(int i3, int i4) {
            this.f2483d = i3;
            this.f2482c = i4;
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public C0721a(PendingIntent pendingIntent) {
            AbstractC0606k.m2145e(pendingIntent, BaseGmsClient.KEY_PENDING_INTENT);
            IntentSender intentSender = pendingIntent.getIntentSender();
            AbstractC0606k.m2144d(intentSender, "pendingIntent.intentSender");
            this(intentSender);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.result.IntentSenderRequest$b */
    public static final class C0722b implements Parcelable.Creator {
        C0722b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            AbstractC0606k.m2145e(parcel, "inParcel");
            return new IntentSenderRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest[] newArray(int i3) {
            return new IntentSenderRequest[i3];
        }
    }

    /* JADX INFO: renamed from: androidx.activity.result.IntentSenderRequest$c */
    public static final class C0723c {
        public /* synthetic */ C0723c(AbstractC0602g abstractC0602g) {
            this();
        }

        private C0723c() {
        }
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i3, int i4) {
        AbstractC0606k.m2145e(intentSender, "intentSender");
        this.f2476d = intentSender;
        this.f2477e = intent;
        this.f2478f = i3;
        this.f2479g = i4;
    }

    /* JADX INFO: renamed from: a */
    public final Intent m2641a() {
        return this.f2477e;
    }

    /* JADX INFO: renamed from: d */
    public final int m2642d() {
        return this.f2478f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m2643e() {
        return this.f2479g;
    }

    /* JADX INFO: renamed from: f */
    public final IntentSender m2644f() {
        return this.f2476d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        AbstractC0606k.m2145e(parcel, "dest");
        parcel.writeParcelable(this.f2476d, i3);
        parcel.writeParcelable(this.f2477e, i3);
        parcel.writeInt(this.f2478f);
        parcel.writeInt(this.f2479g);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntentSenderRequest(Parcel parcel) {
        AbstractC0606k.m2145e(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        AbstractC0606k.m2142b(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}
