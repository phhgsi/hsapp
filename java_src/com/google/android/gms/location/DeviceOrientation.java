package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.location.zzer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class DeviceOrientation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceOrientation> CREATOR = new zzm();
    private final float[] zza;
    private final float zzb;
    private final float zzc;
    private final long zzd;
    private final byte zze;
    private final float zzf;
    private final float zzg;

    DeviceOrientation(float[] fArr, float f3, float f4, long j3, byte b3, float f5, float f6) {
        zzj(fArr);
        zzer.zza(f3 >= 0.0f && f3 < 360.0f);
        zzer.zza(f4 >= 0.0f && f4 <= 180.0f);
        zzer.zza(f6 >= 0.0f && f6 <= 180.0f);
        zzer.zza(j3 >= 0);
        this.zza = fArr;
        this.zzb = f3;
        this.zzc = f4;
        this.zzf = f5;
        this.zzg = f6;
        this.zzd = j3;
        this.zze = (byte) (((byte) (((byte) (b3 | 16)) | 4)) | 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzj(float[] fArr) {
        zzer.zzb(fArr != null && fArr.length == 4, "Input attitude array should be of length 4.");
        zzer.zzb((Float.isNaN(fArr[0]) || Float.isNaN(fArr[1]) || Float.isNaN(fArr[2]) || Float.isNaN(fArr[3])) ? false : true, "Input attitude cannot contain NaNs.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceOrientation)) {
            return false;
        }
        DeviceOrientation deviceOrientation = (DeviceOrientation) obj;
        return Float.compare(this.zzb, deviceOrientation.zzb) == 0 && Float.compare(this.zzc, deviceOrientation.zzc) == 0 && (zza() == deviceOrientation.zza() && (!zza() || Float.compare(this.zzf, deviceOrientation.zzf) == 0)) && (hasConservativeHeadingErrorDegrees() == deviceOrientation.hasConservativeHeadingErrorDegrees() && (!hasConservativeHeadingErrorDegrees() || Float.compare(getConservativeHeadingErrorDegrees(), deviceOrientation.getConservativeHeadingErrorDegrees()) == 0)) && this.zzd == deviceOrientation.zzd && Arrays.equals(this.zza, deviceOrientation.zza);
    }

    public float[] getAttitude() {
        return (float[]) this.zza.clone();
    }

    public float getConservativeHeadingErrorDegrees() {
        return this.zzg;
    }

    public long getElapsedRealtimeNs() {
        return this.zzd;
    }

    public float getHeadingDegrees() {
        return this.zzb;
    }

    public float getHeadingErrorDegrees() {
        return this.zzc;
    }

    public boolean hasConservativeHeadingErrorDegrees() {
        return (this.zze & 64) != 0;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.zzb), Float.valueOf(this.zzc), Float.valueOf(this.zzg), Long.valueOf(this.zzd), this.zza, Byte.valueOf(this.zze));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeviceOrientation[");
        sb.append("attitude=");
        sb.append(Arrays.toString(this.zza));
        sb.append(", headingDegrees=");
        sb.append(this.zzb);
        sb.append(", headingErrorDegrees=");
        sb.append(this.zzc);
        if (hasConservativeHeadingErrorDegrees()) {
            sb.append(", conservativeHeadingErrorDegrees=");
            sb.append(this.zzg);
        }
        sb.append(", elapsedRealtimeNs=");
        sb.append(this.zzd);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloatArray(parcel, 1, getAttitude(), false);
        SafeParcelWriter.writeFloat(parcel, 4, getHeadingDegrees());
        SafeParcelWriter.writeFloat(parcel, 5, getHeadingErrorDegrees());
        SafeParcelWriter.writeLong(parcel, 6, getElapsedRealtimeNs());
        SafeParcelWriter.writeByte(parcel, 7, this.zze);
        SafeParcelWriter.writeFloat(parcel, 8, this.zzf);
        SafeParcelWriter.writeFloat(parcel, 9, getConservativeHeadingErrorDegrees());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zza() {
        return (this.zze & 32) != 0;
    }

    final /* synthetic */ float[] zzc() {
        return this.zza;
    }

    final /* synthetic */ float zzd() {
        return this.zzb;
    }

    final /* synthetic */ float zze() {
        return this.zzc;
    }

    final /* synthetic */ long zzf() {
        return this.zzd;
    }

    final /* synthetic */ byte zzg() {
        return this.zze;
    }

    final /* synthetic */ float zzh() {
        return this.zzf;
    }

    final /* synthetic */ float zzi() {
        return this.zzg;
    }

    public static final class Builder {
        private final float[] zza;
        private float zzb;
        private float zzc;
        private long zzd;
        private byte zze;
        private float zzf;
        private float zzg;

        public Builder(DeviceOrientation deviceOrientation) {
            this.zze = (byte) 0;
            DeviceOrientation.zzj(deviceOrientation.zzc());
            this.zza = Arrays.copyOf(deviceOrientation.zzc(), deviceOrientation.zzc().length);
            setHeadingDegrees(deviceOrientation.zzd());
            setHeadingErrorDegrees(deviceOrientation.zze());
            setConservativeHeadingErrorDegrees(deviceOrientation.zzi());
            setElapsedRealtimeNs(deviceOrientation.zzf());
            this.zzf = deviceOrientation.zzh();
            this.zze = deviceOrientation.zzg();
        }

        public DeviceOrientation build() {
            return new DeviceOrientation(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
        }

        public Builder clearConservativeHeadingErrorDegrees() {
            this.zzg = 180.0f;
            int i3 = this.zze & (-65);
            this.zzf = 0.0f;
            this.zze = (byte) (((byte) i3) & (-33));
            return this;
        }

        public Builder setAttitude(float[] fArr) {
            DeviceOrientation.zzj(fArr);
            System.arraycopy(fArr, 0, this.zza, 0, fArr.length);
            return this;
        }

        public Builder setConservativeHeadingErrorDegrees(float f3) {
            boolean z2 = false;
            if (f3 >= 0.0f && f3 <= 180.0f) {
                z2 = true;
            }
            zzer.zzb(z2, "conservativeHeadingErrorDegrees should be between 0 and 180.");
            this.zzg = f3;
            this.zze = (byte) (this.zze | 64);
            Parcelable.Creator<DeviceOrientation> creator = DeviceOrientation.CREATOR;
            this.zzf = f3 < 180.0f ? (float) (2.0d / (1.0d - Math.cos(Math.toRadians(f3)))) : 0.0f;
            this.zze = (byte) (this.zze | 32);
            return this;
        }

        public Builder setElapsedRealtimeNs(long j3) {
            zzer.zzb(j3 >= 0, "elapsedRealtimeNs should be greater than or equal to 0.");
            this.zzd = j3;
            return this;
        }

        public Builder setHeadingDegrees(float f3) {
            boolean z2 = false;
            if (f3 >= 0.0f && f3 < 360.0f) {
                z2 = true;
            }
            zzer.zzb(z2, "headingDegrees should be greater than or equal to 0 and less than 360.");
            this.zzb = f3;
            return this;
        }

        public Builder setHeadingErrorDegrees(float f3) {
            boolean z2 = false;
            if (f3 >= 0.0f && f3 <= 180.0f) {
                z2 = true;
            }
            zzer.zzb(z2, "headingErrorDegrees should be between 0 and 180.");
            this.zzc = f3;
            return this;
        }

        public Builder(float[] fArr, float f3, float f4, long j3) {
            this.zze = (byte) 0;
            DeviceOrientation.zzj(fArr);
            this.zza = Arrays.copyOf(fArr, fArr.length);
            setHeadingDegrees(f3);
            setHeadingErrorDegrees(f4);
            setElapsedRealtimeNs(j3);
            this.zzf = 0.0f;
            this.zzg = 180.0f;
            this.zze = (byte) 0;
        }
    }
}
