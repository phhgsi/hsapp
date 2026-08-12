package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC1126h;

/* JADX INFO: loaded from: classes.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C1070a();

    /* JADX INFO: renamed from: d */
    final String f5098d;

    /* JADX INFO: renamed from: e */
    final String f5099e;

    /* JADX INFO: renamed from: f */
    final boolean f5100f;

    /* JADX INFO: renamed from: g */
    final int f5101g;

    /* JADX INFO: renamed from: h */
    final int f5102h;

    /* JADX INFO: renamed from: i */
    final String f5103i;

    /* JADX INFO: renamed from: j */
    final boolean f5104j;

    /* JADX INFO: renamed from: k */
    final boolean f5105k;

    /* JADX INFO: renamed from: l */
    final boolean f5106l;

    /* JADX INFO: renamed from: m */
    final Bundle f5107m;

    /* JADX INFO: renamed from: n */
    final boolean f5108n;

    /* JADX INFO: renamed from: o */
    final int f5109o;

    /* JADX INFO: renamed from: p */
    Bundle f5110p;

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentState$a */
    class C1070a implements Parcelable.Creator {
        C1070a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentState[] newArray(int i3) {
            return new FragmentState[i3];
        }
    }

    FragmentState(Fragment fragment) {
        this.f5098d = fragment.getClass().getName();
        this.f5099e = fragment.mWho;
        this.f5100f = fragment.mFromLayout;
        this.f5101g = fragment.mFragmentId;
        this.f5102h = fragment.mContainerId;
        this.f5103i = fragment.mTag;
        this.f5104j = fragment.mRetainInstance;
        this.f5105k = fragment.mRemoving;
        this.f5106l = fragment.mDetached;
        this.f5107m = fragment.mArguments;
        this.f5108n = fragment.mHidden;
        this.f5109o = fragment.mMaxState.ordinal();
    }

    /* JADX INFO: renamed from: a */
    Fragment m4880a(AbstractC1084l abstractC1084l, ClassLoader classLoader) {
        Fragment fragmentMo4868a = abstractC1084l.mo4868a(classLoader, this.f5098d);
        Bundle bundle = this.f5107m;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fragmentMo4868a.setArguments(this.f5107m);
        fragmentMo4868a.mWho = this.f5099e;
        fragmentMo4868a.mFromLayout = this.f5100f;
        fragmentMo4868a.mRestored = true;
        fragmentMo4868a.mFragmentId = this.f5101g;
        fragmentMo4868a.mContainerId = this.f5102h;
        fragmentMo4868a.mTag = this.f5103i;
        fragmentMo4868a.mRetainInstance = this.f5104j;
        fragmentMo4868a.mRemoving = this.f5105k;
        fragmentMo4868a.mDetached = this.f5106l;
        fragmentMo4868a.mHidden = this.f5108n;
        fragmentMo4868a.mMaxState = AbstractC1126h.b.values()[this.f5109o];
        Bundle bundle2 = this.f5110p;
        if (bundle2 != null) {
            fragmentMo4868a.mSavedFragmentState = bundle2;
            return fragmentMo4868a;
        }
        fragmentMo4868a.mSavedFragmentState = new Bundle();
        return fragmentMo4868a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f5098d);
        sb.append(" (");
        sb.append(this.f5099e);
        sb.append(")}:");
        if (this.f5100f) {
            sb.append(" fromLayout");
        }
        if (this.f5102h != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f5102h));
        }
        String str = this.f5103i;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f5103i);
        }
        if (this.f5104j) {
            sb.append(" retainInstance");
        }
        if (this.f5105k) {
            sb.append(" removing");
        }
        if (this.f5106l) {
            sb.append(" detached");
        }
        if (this.f5108n) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f5098d);
        parcel.writeString(this.f5099e);
        parcel.writeInt(this.f5100f ? 1 : 0);
        parcel.writeInt(this.f5101g);
        parcel.writeInt(this.f5102h);
        parcel.writeString(this.f5103i);
        parcel.writeInt(this.f5104j ? 1 : 0);
        parcel.writeInt(this.f5105k ? 1 : 0);
        parcel.writeInt(this.f5106l ? 1 : 0);
        parcel.writeBundle(this.f5107m);
        parcel.writeInt(this.f5108n ? 1 : 0);
        parcel.writeBundle(this.f5110p);
        parcel.writeInt(this.f5109o);
    }

    FragmentState(Parcel parcel) {
        this.f5098d = parcel.readString();
        this.f5099e = parcel.readString();
        this.f5100f = parcel.readInt() != 0;
        this.f5101g = parcel.readInt();
        this.f5102h = parcel.readInt();
        this.f5103i = parcel.readString();
        this.f5104j = parcel.readInt() != 0;
        this.f5105k = parcel.readInt() != 0;
        this.f5106l = parcel.readInt() != 0;
        this.f5107m = parcel.readBundle();
        this.f5108n = parcel.readInt() != 0;
        this.f5110p = parcel.readBundle();
        this.f5109o = parcel.readInt();
    }
}
