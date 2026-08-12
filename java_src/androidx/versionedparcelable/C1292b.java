package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.collection.C0921a;

/* JADX INFO: renamed from: androidx.versionedparcelable.b */
/* JADX INFO: loaded from: classes.dex */
class C1292b extends AbstractC1291a {

    /* JADX INFO: renamed from: d */
    private final SparseIntArray f6324d;

    /* JADX INFO: renamed from: e */
    private final Parcel f6325e;

    /* JADX INFO: renamed from: f */
    private final int f6326f;

    /* JADX INFO: renamed from: g */
    private final int f6327g;

    /* JADX INFO: renamed from: h */
    private final String f6328h;

    /* JADX INFO: renamed from: i */
    private int f6329i;

    /* JADX INFO: renamed from: j */
    private int f6330j;

    /* JADX INFO: renamed from: k */
    private int f6331k;

    C1292b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0921a(), new C0921a(), new C0921a());
    }

    @Override // androidx.versionedparcelable.AbstractC1291a
    /* JADX INFO: renamed from: A */
    public void mo6554A(byte[] bArr) {
        if (bArr == null) {
            this.f6325e.writeInt(-1);
        } else {
            this.f6325e.writeInt(bArr.length);
            this.f6325e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1291a
    /* JADX INFO: renamed from: C */
    protected void mo6556C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f6325e, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC1291a
    /* JADX INFO: renamed from: E */
    public void mo6558E(int i3) {
        this.f6325e.writeInt(i3);
    }

    @Override // androidx.versionedparcelable.AbstractC1291a
    /* JADX INFO: renamed from: G */
    public void mo6560G(Parcelable parcelable) {
        this.f6325e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC1291a
    /* JADX INFO: renamed from: I */
    public void mo6562I(String str) {
        this.f6325e.writeString(str);
    }

    @Override // androidx.versionedparcelable.AbstractC1291a
    /* JADX INFO: renamed from: a */
    public void mo6567a() {
        int i3 = this.f6329i;
        if (i3 >= 0) {
            int i4 = this.f6324d.get(i3);
            int iDataPosition = this.f6325e.dataPosition();
            this.f6325e.setDataPosition(i4);
            this.f6325e.writeInt(iDataPosition - i4);
            this.f6325e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1291a
    /* JADX INFO: renamed from: b */
    protected AbstractC1291a mo6568b() {
        Parcel parcel = this.f6325e;
        int iDataPosition = parcel.dataPosition();
        int i3 = this.f6330j;
        if (i3 == this.f6326f) {
            i3 = this.f6327g;
        }
        return new C1292b(parcel, iDataPosition, i3, this.f6328h + "  ", this.f6321a, this.f6322b, this.f6323c);
    }

    @Override // androidx.versionedparcelable.AbstractC1291a
    /* JADX INFO: renamed from: g */
    public boolean mo6570g() {
        return this.f6325e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.AbstractC1291a
    /* JADX INFO: renamed from: i */
    public byte[] mo6572i() {
        int i3 = this.f6325e.readInt();
        if (i3 < 0) {
            return null;
        }
        byte[] bArr = new byte[i3];
        this.f6325e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.AbstractC1291a
    /* JADX INFO: renamed from: k */
    protected CharSequence mo6574k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f6325e);
    }

    @Override // androidx.versionedparcelable.AbstractC1291a
    /* JADX INFO: renamed from: m */
    public boolean mo6576m(int i3) {
        while (this.f6330j < this.f6327g) {
            int i4 = this.f6331k;
            if (i4 == i3) {
                return true;
            }
            if (String.valueOf(i4).compareTo(String.valueOf(i3)) > 0) {
                return false;
            }
            this.f6325e.setDataPosition(this.f6330j);
            int i5 = this.f6325e.readInt();
            this.f6331k = this.f6325e.readInt();
            this.f6330j += i5;
        }
        return this.f6331k == i3;
    }

    @Override // androidx.versionedparcelable.AbstractC1291a
    /* JADX INFO: renamed from: o */
    public int mo6578o() {
        return this.f6325e.readInt();
    }

    @Override // androidx.versionedparcelable.AbstractC1291a
    /* JADX INFO: renamed from: q */
    public Parcelable mo6580q() {
        return this.f6325e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.AbstractC1291a
    /* JADX INFO: renamed from: s */
    public String mo6582s() {
        return this.f6325e.readString();
    }

    @Override // androidx.versionedparcelable.AbstractC1291a
    /* JADX INFO: renamed from: w */
    public void mo6586w(int i3) {
        mo6567a();
        this.f6329i = i3;
        this.f6324d.put(i3, this.f6325e.dataPosition());
        mo6558E(0);
        mo6558E(i3);
    }

    @Override // androidx.versionedparcelable.AbstractC1291a
    /* JADX INFO: renamed from: y */
    public void mo6588y(boolean z2) {
        this.f6325e.writeInt(z2 ? 1 : 0);
    }

    private C1292b(Parcel parcel, int i3, int i4, String str, C0921a c0921a, C0921a c0921a2, C0921a c0921a3) {
        super(c0921a, c0921a2, c0921a3);
        this.f6324d = new SparseIntArray();
        this.f6329i = -1;
        this.f6331k = -1;
        this.f6325e = parcel;
        this.f6326f = i3;
        this.f6327g = i4;
        this.f6330j = i3;
        this.f6328h = str;
    }
}
