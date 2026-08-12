package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzjc extends zzil {
    private static final Logger zzb = Logger.getLogger(zzjc.class.getName());
    private static final boolean zzc = zzml.zzc();
    zzjf zza;

    private static class zza extends zzjc {
        private final byte[] zzb;
        private final int zzc;
        private int zzd;

        zza(byte[] bArr, int i3, int i4) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i4) | i4) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i4)));
            }
            this.zzb = bArr;
            this.zzd = 0;
            this.zzc = i4;
        }

        private final void zzc(byte[] bArr, int i3, int i4) throws zzb {
            try {
                System.arraycopy(bArr, i3, this.zzb, this.zzd, i4);
                this.zzd += i4;
            } catch (IndexOutOfBoundsException e3) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i4)), e3);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final int zza() {
            return this.zzc - this.zzd;
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(byte[] bArr, int i3, int i4) throws zzb {
            zzc(i4);
            zzc(bArr, 0, i4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzd(int i3, int i4) {
            zzc(i3, 0);
            zzc(i4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(byte b3) throws zzb {
            int i3 = this.zzd;
            try {
                int i4 = i3 + 1;
                try {
                    this.zzb[i3] = b3;
                    this.zzd = i4;
                } catch (IndexOutOfBoundsException e3) {
                    e = e3;
                    i3 = i4;
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(i3), Integer.valueOf(this.zzc), 1), e);
                }
            } catch (IndexOutOfBoundsException e4) {
                e = e4;
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(int i3, int i4) {
            zzc(i3, 0);
            zzb(i4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(int i3) {
            if (i3 >= 0) {
                zzc(i3);
            } else {
                zzb(i3);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzc(int i3, int i4) {
            zzc((i3 << 3) | i4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzc(int i3) throws zzb {
            while ((i3 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i4 = this.zzd;
                    this.zzd = i4 + 1;
                    bArr[i4] = (byte) (i3 | 128);
                    i3 >>>= 7;
                } catch (IndexOutOfBoundsException e3) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e3);
                }
            }
            byte[] bArr2 = this.zzb;
            int i5 = this.zzd;
            this.zzd = i5 + 1;
            bArr2[i5] = (byte) i3;
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i3, boolean z2) {
            zzc(i3, 0);
            zza(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(int i3, zzik zzikVar) {
            zzc(1, 3);
            zzd(2, i3);
            zza(3, zzikVar);
            zzc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i3, zzik zzikVar) {
            zzc(i3, 2);
            zza(zzikVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(zzik zzikVar) {
            zzc(zzikVar.zzb());
            zzikVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(int i3, long j3) {
            zzc(i3, 0);
            zzb(j3);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i3, int i4) {
            zzc(i3, 5);
            zza(i4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(long j3) throws zzb {
            if (zzjc.zzc && zza() >= 10) {
                while ((j3 & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i3 = this.zzd;
                    this.zzd = i3 + 1;
                    zzml.zza(bArr, i3, (byte) (((int) j3) | 128));
                    j3 >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i4 = this.zzd;
                this.zzd = 1 + i4;
                zzml.zza(bArr2, i4, (byte) j3);
                return;
            }
            while ((j3 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.zzb;
                    int i5 = this.zzd;
                    this.zzd = i5 + 1;
                    bArr3[i5] = (byte) (((int) j3) | 128);
                    j3 >>>= 7;
                } catch (IndexOutOfBoundsException e3) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e3);
                }
            }
            byte[] bArr4 = this.zzb;
            int i6 = this.zzd;
            this.zzd = i6 + 1;
            bArr4[i6] = (byte) j3;
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i3) throws zzb {
            try {
                byte[] bArr = this.zzb;
                int i4 = this.zzd;
                int i5 = i4 + 1;
                this.zzd = i5;
                bArr[i4] = (byte) i3;
                int i6 = i4 + 2;
                this.zzd = i6;
                bArr[i5] = (byte) (i3 >> 8);
                int i7 = i4 + 3;
                this.zzd = i7;
                bArr[i6] = (byte) (i3 >> 16);
                this.zzd = i4 + 4;
                bArr[i7] = (byte) (i3 >>> 24);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e3);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i3, long j3) {
            zzc(i3, 1);
            zza(j3);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(long j3) throws zzb {
            try {
                byte[] bArr = this.zzb;
                int i3 = this.zzd;
                int i4 = i3 + 1;
                this.zzd = i4;
                bArr[i3] = (byte) j3;
                int i5 = i3 + 2;
                this.zzd = i5;
                bArr[i4] = (byte) (j3 >> 8);
                int i6 = i3 + 3;
                this.zzd = i6;
                bArr[i5] = (byte) (j3 >> 16);
                int i7 = i3 + 4;
                this.zzd = i7;
                bArr[i6] = (byte) (j3 >> 24);
                int i8 = i3 + 5;
                this.zzd = i8;
                bArr[i7] = (byte) (j3 >> 32);
                int i9 = i3 + 6;
                this.zzd = i9;
                bArr[i8] = (byte) (j3 >> 40);
                int i10 = i3 + 7;
                this.zzd = i10;
                bArr[i9] = (byte) (j3 >> 48);
                this.zzd = i3 + 8;
                bArr[i10] = (byte) (j3 >> 56);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e3);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzil
        public final void zza(byte[] bArr, int i3, int i4) throws zzb {
            zzc(bArr, i3, i4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        final void zza(int i3, zzlc zzlcVar, zzlu zzluVar) {
            zzc(i3, 2);
            zzc(((zzib) zzlcVar).zza(zzluVar));
            zzluVar.zza(zzlcVar, this.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(zzlc zzlcVar) {
            zzc(zzlcVar.zzcb());
            zzlcVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i3, zzlc zzlcVar) {
            zzc(1, 3);
            zzd(2, i3);
            zzc(3, 2);
            zza(zzlcVar);
            zzc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i3, String str) {
            zzc(i3, 2);
            zza(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(String str) throws zzb {
            int i3 = this.zzd;
            try {
                int iZzj = zzjc.zzj(str.length() * 3);
                int iZzj2 = zzjc.zzj(str.length());
                if (iZzj2 == iZzj) {
                    int i4 = i3 + iZzj2;
                    this.zzd = i4;
                    int iZza = zzmp.zza(str, this.zzb, i4, zza());
                    this.zzd = i3;
                    zzc((iZza - i3) - iZzj2);
                    this.zzd = iZza;
                    return;
                }
                zzc(zzmp.zza(str));
                this.zzd = zzmp.zza(str, this.zzb, this.zzd, zza());
            } catch (zzmt e3) {
                this.zzd = i3;
                zza(str, e3);
            } catch (IndexOutOfBoundsException e4) {
                throw new zzb(e4);
            }
        }
    }

    public static class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        zzb(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    public static int zza(double d3) {
        return 8;
    }

    public static int zzb(int i3, boolean z2) {
        return zzj(i3 << 3) + 1;
    }

    public static int zzc(long j3) {
        return 8;
    }

    public static int zzd(int i3) {
        return zzg(i3);
    }

    public static int zze(int i3) {
        return 4;
    }

    public static int zzf(int i3, int i4) {
        return zzj(i3 << 3) + 4;
    }

    public static int zzg(int i3) {
        return 4;
    }

    public static int zzh(int i3, int i4) {
        return zzj(i3 << 3) + 4;
    }

    private static long zzi(long j3) {
        return (j3 >> 63) ^ (j3 << 1);
    }

    public static int zzj(int i3, int i4) {
        return zzj(i3 << 3) + zzj(i4);
    }

    private static int zzl(int i3) {
        return (i3 >> 31) ^ (i3 << 1);
    }

    public abstract int zza();

    public abstract void zza(byte b3);

    public abstract void zza(int i3);

    public abstract void zza(int i3, int i4);

    public abstract void zza(int i3, long j3);

    public abstract void zza(int i3, zzik zzikVar);

    public abstract void zza(int i3, zzlc zzlcVar);

    abstract void zza(int i3, zzlc zzlcVar, zzlu zzluVar);

    public abstract void zza(int i3, String str);

    public abstract void zza(int i3, boolean z2);

    public abstract void zza(long j3);

    public abstract void zza(zzik zzikVar);

    public abstract void zza(zzlc zzlcVar);

    public abstract void zza(String str);

    public abstract void zzb(int i3);

    public abstract void zzb(int i3, int i4);

    public abstract void zzb(int i3, long j3);

    public abstract void zzb(int i3, zzik zzikVar);

    public abstract void zzb(long j3);

    abstract void zzb(byte[] bArr, int i3, int i4);

    public abstract void zzc(int i3);

    public abstract void zzc(int i3, int i4);

    public abstract void zzd(int i3, int i4);

    public final void zzk(int i3, int i4) {
        zzd(i3, zzl(i4));
    }

    private zzjc() {
    }

    public static int zza(float f3) {
        return 4;
    }

    public static int zzb(zzik zzikVar) {
        int iZzb = zzikVar.zzb();
        return zzj(iZzb) + iZzb;
    }

    public static int zzd(int i3, long j3) {
        return zzj(i3 << 3) + zzg(j3);
    }

    public static int zze(long j3) {
        return 8;
    }

    public static int zzf(int i3) {
        return zzg(i3);
    }

    public static int zzg(int i3, int i4) {
        return zzj(i3 << 3) + zzg(i4);
    }

    public static int zzh(int i3) {
        return zzj(zzl(i3));
    }

    public static int zzi(int i3, int i4) {
        return zzj(i3 << 3) + zzj(zzl(i4));
    }

    public final void zzk(int i3) {
        zzc(zzl(i3));
    }

    public static int zza(boolean z2) {
        return 1;
    }

    public static int zzc(int i3, zzik zzikVar) {
        int iZzj = zzj(i3 << 3);
        int iZzb = zzikVar.zzb();
        return iZzj + zzj(iZzb) + iZzb;
    }

    public static int zze(int i3, int i4) {
        return zzj(i3 << 3) + zzg(i4);
    }

    public static int zzf(int i3, long j3) {
        return zzj(i3 << 3) + zzg(zzi(j3));
    }

    public static int zzj(int i3) {
        return (352 - (Integer.numberOfLeadingZeros(i3) * 9)) >>> 6;
    }

    public final void zzh(int i3, long j3) {
        zzb(i3, zzi(j3));
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzj(length) + length;
    }

    @Deprecated
    static int zzb(int i3, zzlc zzlcVar, zzlu zzluVar) {
        return (zzj(i3 << 3) << 1) + ((zzib) zzlcVar).zza(zzluVar);
    }

    public static int zzd(long j3) {
        return zzg(j3);
    }

    public static int zzg(int i3, long j3) {
        return zzj(i3 << 3) + zzg(j3);
    }

    public static int zzi(int i3) {
        return zzj(i3 << 3);
    }

    public final void zzh(long j3) {
        zzb(zzi(j3));
    }

    public static int zzd(int i3, zzik zzikVar) {
        return (zzj(8) << 1) + zzj(2, i3) + zzc(3, zzikVar);
    }

    public static int zze(int i3, long j3) {
        return zzj(i3 << 3) + 8;
    }

    public static int zzf(long j3) {
        return zzg(zzi(j3));
    }

    public static int zza(int i3, double d3) {
        return zzj(i3 << 3) + 8;
    }

    @Deprecated
    public static int zzb(zzlc zzlcVar) {
        return zzlcVar.zzcb();
    }

    public static int zzc(int i3, long j3) {
        return zzj(i3 << 3) + 8;
    }

    public static int zzg(long j3) {
        return (640 - (Long.numberOfLeadingZeros(j3) * 9)) >>> 6;
    }

    public static int zza(int i3, float f3) {
        return zzj(i3 << 3) + 4;
    }

    public static int zzb(int i3, zzkk zzkkVar) {
        int iZzj = zzj(i3 << 3);
        int iZza = zzkkVar.zza();
        return iZzj + zzj(iZza) + iZza;
    }

    static int zzc(int i3, zzlc zzlcVar, zzlu zzluVar) {
        return zzj(i3 << 3) + zza(zzlcVar, zzluVar);
    }

    public static int zza(int i3, zzkk zzkkVar) {
        return (zzj(8) << 1) + zzj(2, i3) + zzb(3, zzkkVar);
    }

    public static int zzc(zzlc zzlcVar) {
        int iZzcb = zzlcVar.zzcb();
        return zzj(iZzcb) + iZzcb;
    }

    public static int zzb(int i3, zzlc zzlcVar) {
        return (zzj(8) << 1) + zzj(2, i3) + zzj(24) + zzc(zzlcVar);
    }

    public static int zza(zzkk zzkkVar) {
        int iZza = zzkkVar.zza();
        return zzj(iZza) + iZza;
    }

    static int zza(zzlc zzlcVar, zzlu zzluVar) {
        int iZza = ((zzib) zzlcVar).zza(zzluVar);
        return zzj(iZza) + iZza;
    }

    public static int zzb(int i3, String str) {
        return zzj(i3 << 3) + zzb(str);
    }

    final void zza(String str, zzmt zzmtVar) throws zzb {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzmtVar);
        byte[] bytes = str.getBytes(zzjv.zza);
        try {
            zzc(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e3) {
            throw new zzb(e3);
        }
    }

    public static int zzb(String str) {
        int length;
        try {
            length = zzmp.zza(str);
        } catch (zzmt unused) {
            length = str.getBytes(zzjv.zza).length;
        }
        return zzj(length) + length;
    }

    public static zzjc zzb(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzb(boolean z2) {
        zza(z2 ? (byte) 1 : (byte) 0);
    }

    public final void zzb(int i3, double d3) {
        zza(i3, Double.doubleToRawLongBits(d3));
    }

    public final void zzb(double d3) {
        zza(Double.doubleToRawLongBits(d3));
    }

    public final void zzb(int i3, float f3) {
        zza(i3, Float.floatToRawIntBits(f3));
    }

    public final void zzb(float f3) {
        zza(Float.floatToRawIntBits(f3));
    }
}
