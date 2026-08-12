package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.AbstractC1098z;
import androidx.lifecycle.AbstractC1126h;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new C1033a();

    /* JADX INFO: renamed from: d */
    final int[] f4925d;

    /* JADX INFO: renamed from: e */
    final ArrayList f4926e;

    /* JADX INFO: renamed from: f */
    final int[] f4927f;

    /* JADX INFO: renamed from: g */
    final int[] f4928g;

    /* JADX INFO: renamed from: h */
    final int f4929h;

    /* JADX INFO: renamed from: i */
    final String f4930i;

    /* JADX INFO: renamed from: j */
    final int f4931j;

    /* JADX INFO: renamed from: k */
    final int f4932k;

    /* JADX INFO: renamed from: l */
    final CharSequence f4933l;

    /* JADX INFO: renamed from: m */
    final int f4934m;

    /* JADX INFO: renamed from: n */
    final CharSequence f4935n;

    /* JADX INFO: renamed from: o */
    final ArrayList f4936o;

    /* JADX INFO: renamed from: p */
    final ArrayList f4937p;

    /* JADX INFO: renamed from: q */
    final boolean f4938q;

    /* JADX INFO: renamed from: androidx.fragment.app.BackStackRecordState$a */
    class C1033a implements Parcelable.Creator {
        C1033a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState[] newArray(int i3) {
            return new BackStackRecordState[i3];
        }
    }

    BackStackRecordState(C1073a c1073a) {
        int size = c1073a.f5223c.size();
        this.f4925d = new int[size * 6];
        if (!c1073a.f5229i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f4926e = new ArrayList(size);
        this.f4927f = new int[size];
        this.f4928g = new int[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC1098z.a aVar = (AbstractC1098z.a) c1073a.f5223c.get(i4);
            int i5 = i3 + 1;
            this.f4925d[i3] = aVar.f5240a;
            ArrayList arrayList = this.f4926e;
            Fragment fragment = aVar.f5241b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f4925d;
            iArr[i5] = aVar.f5242c ? 1 : 0;
            iArr[i3 + 2] = aVar.f5243d;
            iArr[i3 + 3] = aVar.f5244e;
            int i6 = i3 + 5;
            iArr[i3 + 4] = aVar.f5245f;
            i3 += 6;
            iArr[i6] = aVar.f5246g;
            this.f4927f[i4] = aVar.f5247h.ordinal();
            this.f4928g[i4] = aVar.f5248i.ordinal();
        }
        this.f4929h = c1073a.f5228h;
        this.f4930i = c1073a.f5231k;
        this.f4931j = c1073a.f5113v;
        this.f4932k = c1073a.f5232l;
        this.f4933l = c1073a.f5233m;
        this.f4934m = c1073a.f5234n;
        this.f4935n = c1073a.f5235o;
        this.f4936o = c1073a.f5236p;
        this.f4937p = c1073a.f5237q;
        this.f4938q = c1073a.f5238r;
    }

    /* JADX INFO: renamed from: a */
    private void m4671a(C1073a c1073a) {
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z2 = true;
            if (i3 >= this.f4925d.length) {
                c1073a.f5228h = this.f4929h;
                c1073a.f5231k = this.f4930i;
                c1073a.f5229i = true;
                c1073a.f5232l = this.f4932k;
                c1073a.f5233m = this.f4933l;
                c1073a.f5234n = this.f4934m;
                c1073a.f5235o = this.f4935n;
                c1073a.f5236p = this.f4936o;
                c1073a.f5237q = this.f4937p;
                c1073a.f5238r = this.f4938q;
                return;
            }
            AbstractC1098z.a aVar = new AbstractC1098z.a();
            int i5 = i3 + 1;
            aVar.f5240a = this.f4925d[i3];
            if (FragmentManager.m4744H0(2)) {
                Log.v("FragmentManager", "Instantiate " + c1073a + " op #" + i4 + " base fragment #" + this.f4925d[i5]);
            }
            aVar.f5247h = AbstractC1126h.b.values()[this.f4927f[i4]];
            aVar.f5248i = AbstractC1126h.b.values()[this.f4928g[i4]];
            int[] iArr = this.f4925d;
            int i6 = i3 + 2;
            if (iArr[i5] == 0) {
                z2 = false;
            }
            aVar.f5242c = z2;
            int i7 = iArr[i6];
            aVar.f5243d = i7;
            int i8 = iArr[i3 + 3];
            aVar.f5244e = i8;
            int i9 = i3 + 5;
            int i10 = iArr[i3 + 4];
            aVar.f5245f = i10;
            i3 += 6;
            int i11 = iArr[i9];
            aVar.f5246g = i11;
            c1073a.f5224d = i7;
            c1073a.f5225e = i8;
            c1073a.f5226f = i10;
            c1073a.f5227g = i11;
            c1073a.m5049e(aVar);
            i4++;
        }
    }

    /* JADX INFO: renamed from: d */
    public C1073a m4672d(FragmentManager fragmentManager) {
        C1073a c1073a = new C1073a(fragmentManager);
        m4671a(c1073a);
        c1073a.f5113v = this.f4931j;
        for (int i3 = 0; i3 < this.f4926e.size(); i3++) {
            String str = (String) this.f4926e.get(i3);
            if (str != null) {
                ((AbstractC1098z.a) c1073a.f5223c.get(i3)).f5241b = fragmentManager.m4830f0(str);
            }
        }
        c1073a.m4889p(1);
        return c1073a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeIntArray(this.f4925d);
        parcel.writeStringList(this.f4926e);
        parcel.writeIntArray(this.f4927f);
        parcel.writeIntArray(this.f4928g);
        parcel.writeInt(this.f4929h);
        parcel.writeString(this.f4930i);
        parcel.writeInt(this.f4931j);
        parcel.writeInt(this.f4932k);
        TextUtils.writeToParcel(this.f4933l, parcel, 0);
        parcel.writeInt(this.f4934m);
        TextUtils.writeToParcel(this.f4935n, parcel, 0);
        parcel.writeStringList(this.f4936o);
        parcel.writeStringList(this.f4937p);
        parcel.writeInt(this.f4938q ? 1 : 0);
    }

    BackStackRecordState(Parcel parcel) {
        this.f4925d = parcel.createIntArray();
        this.f4926e = parcel.createStringArrayList();
        this.f4927f = parcel.createIntArray();
        this.f4928g = parcel.createIntArray();
        this.f4929h = parcel.readInt();
        this.f4930i = parcel.readString();
        this.f4931j = parcel.readInt();
        this.f4932k = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f4933l = (CharSequence) creator.createFromParcel(parcel);
        this.f4934m = parcel.readInt();
        this.f4935n = (CharSequence) creator.createFromParcel(parcel);
        this.f4936o = parcel.createStringArrayList();
        this.f4937p = parcel.createStringArrayList();
        this.f4938q = parcel.readInt() != 0;
    }
}
