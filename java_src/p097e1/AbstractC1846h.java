package p097e1;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: e1.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1846h {

    /* JADX INFO: renamed from: a */
    private static final ClassLoader f9276a = AbstractC1846h.class.getClassLoader();

    /* JADX INFO: renamed from: a */
    public static Parcelable m9641a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m9642b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + iDataAvail);
    }

    /* JADX INFO: renamed from: c */
    public static void m9643c(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
