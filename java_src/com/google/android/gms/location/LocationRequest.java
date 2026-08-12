package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.location.zzeo;

/* JADX INFO: loaded from: classes.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzaf();

    @Deprecated
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;

    @Deprecated
    public static final int PRIORITY_HIGH_ACCURACY = 100;

    @Deprecated
    public static final int PRIORITY_LOW_POWER = 104;

    @Deprecated
    public static final int PRIORITY_NO_POWER = 105;
    private int zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private int zzf;
    private float zzg;
    private boolean zzh;
    private long zzi;
    private final int zzj;
    private final int zzk;
    private final boolean zzl;
    private final WorkSource zzm;
    private final com.google.android.gms.internal.location.zze zzn;

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }

    @Deprecated
    public static LocationRequest create() {
        return new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }

    private static String zze(long j3) {
        return j3 == Long.MAX_VALUE ? "∞" : zzeo.zzb(j3);
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.zza == locationRequest.zza && ((isPassive() || this.zzb == locationRequest.zzb) && this.zzc == locationRequest.zzc && isBatched() == locationRequest.isBatched() && ((!isBatched() || this.zzd == locationRequest.zzd) && this.zze == locationRequest.zze && this.zzf == locationRequest.zzf && this.zzg == locationRequest.zzg && this.zzh == locationRequest.zzh && this.zzj == locationRequest.zzj && this.zzk == locationRequest.zzk && this.zzl == locationRequest.zzl && this.zzm.equals(locationRequest.zzm) && Objects.equal(this.zzn, locationRequest.zzn)))) {
                return true;
            }
        }
        return false;
    }

    public long getDurationMillis() {
        return this.zze;
    }

    @Deprecated
    public long getExpirationTime() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.zze;
        long j4 = jElapsedRealtime + j3;
        if (((jElapsedRealtime ^ j4) & (j3 ^ j4)) < 0) {
            return Long.MAX_VALUE;
        }
        return j4;
    }

    @Deprecated
    public long getFastestInterval() {
        return getMinUpdateIntervalMillis();
    }

    public int getGranularity() {
        return this.zzj;
    }

    @Deprecated
    public long getInterval() {
        return getIntervalMillis();
    }

    public long getIntervalMillis() {
        return this.zzb;
    }

    public long getMaxUpdateAgeMillis() {
        return this.zzi;
    }

    public long getMaxUpdateDelayMillis() {
        return this.zzd;
    }

    public int getMaxUpdates() {
        return this.zzf;
    }

    @Deprecated
    public long getMaxWaitTime() {
        return Math.max(this.zzd, this.zzb);
    }

    public float getMinUpdateDistanceMeters() {
        return this.zzg;
    }

    public long getMinUpdateIntervalMillis() {
        return this.zzc;
    }

    @Deprecated
    public int getNumUpdates() {
        return getMaxUpdates();
    }

    public int getPriority() {
        return this.zza;
    }

    @Deprecated
    public float getSmallestDisplacement() {
        return getMinUpdateDistanceMeters();
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), Long.valueOf(this.zzc), this.zzm);
    }

    public boolean isBatched() {
        long j3 = this.zzd;
        return j3 > 0 && (j3 >> 1) >= this.zzb;
    }

    @Deprecated
    public boolean isFastestIntervalExplicitlySet() {
        return true;
    }

    public boolean isPassive() {
        return this.zza == 105;
    }

    public boolean isWaitForAccurateLocation() {
        return this.zzh;
    }

    @Deprecated
    public LocationRequest setExpirationDuration(long j3) {
        Preconditions.checkArgument(j3 > 0, "durationMillis must be greater than 0");
        this.zze = j3;
        return this;
    }

    @Deprecated
    public LocationRequest setExpirationTime(long j3) {
        this.zze = Math.max(1L, j3 - SystemClock.elapsedRealtime());
        return this;
    }

    @Deprecated
    public LocationRequest setFastestInterval(long j3) {
        Preconditions.checkArgument(j3 >= 0, "illegal fastest interval: %d", Long.valueOf(j3));
        this.zzc = j3;
        return this;
    }

    @Deprecated
    public LocationRequest setInterval(long j3) {
        Preconditions.checkArgument(j3 >= 0, "intervalMillis must be greater than or equal to 0");
        long j4 = this.zzc;
        long j5 = this.zzb;
        if (j4 == j5 / 6) {
            this.zzc = j3 / 6;
        }
        if (this.zzi == j5) {
            this.zzi = j3;
        }
        this.zzb = j3;
        return this;
    }

    @Deprecated
    public LocationRequest setMaxWaitTime(long j3) {
        Preconditions.checkArgument(j3 >= 0, "illegal max wait time: %d", Long.valueOf(j3));
        this.zzd = j3;
        return this;
    }

    @Deprecated
    public LocationRequest setNumUpdates(int i3) {
        if (i3 > 0) {
            this.zzf = i3;
            return this;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 20);
        sb.append("invalid numUpdates: ");
        sb.append(i3);
        throw new IllegalArgumentException(sb.toString());
    }

    @Deprecated
    public LocationRequest setPriority(int i3) {
        zzan.zza(i3);
        this.zza = i3;
        return this;
    }

    @Deprecated
    public LocationRequest setSmallestDisplacement(float f3) {
        if (f3 >= 0.0f) {
            this.zzg = f3;
            return this;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(f3).length() + 22);
        sb.append("invalid displacement: ");
        sb.append(f3);
        throw new IllegalArgumentException(sb.toString());
    }

    @Deprecated
    public LocationRequest setWaitForAccurateLocation(boolean z2) {
        this.zzh = z2;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (isPassive()) {
            sb.append(zzan.zzb(this.zza));
            if (this.zzd > 0) {
                sb.append("/");
                zzeo.zzc(this.zzd, sb);
            }
        } else {
            sb.append("@");
            if (isBatched()) {
                zzeo.zzc(this.zzb, sb);
                sb.append("/");
                zzeo.zzc(this.zzd, sb);
            } else {
                zzeo.zzc(this.zzb, sb);
            }
            sb.append(" ");
            sb.append(zzan.zzb(this.zza));
        }
        if (isPassive() || this.zzc != this.zzb) {
            sb.append(", minUpdateInterval=");
            sb.append(zze(this.zzc));
        }
        if (this.zzg > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(this.zzg);
        }
        if (!isPassive() ? this.zzi != this.zzb : this.zzi != Long.MAX_VALUE) {
            sb.append(", maxUpdateAge=");
            sb.append(zze(this.zzi));
        }
        if (this.zze != Long.MAX_VALUE) {
            sb.append(", duration=");
            zzeo.zzc(this.zze, sb);
        }
        if (this.zzf != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.zzf);
        }
        if (this.zzk != 0) {
            sb.append(", ");
            sb.append(zzar.zzb(this.zzk));
        }
        if (this.zzj != 0) {
            sb.append(", ");
            sb.append(zzq.zzb(this.zzj));
        }
        if (this.zzh) {
            sb.append(", waitForAccurateLocation");
        }
        if (this.zzl) {
            sb.append(", bypass");
        }
        if (!WorkSourceUtil.isEmpty(this.zzm)) {
            sb.append(", ");
            sb.append(this.zzm);
        }
        if (this.zzn != null) {
            sb.append(", impersonation=");
            sb.append(this.zzn);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getPriority());
        SafeParcelWriter.writeLong(parcel, 2, getIntervalMillis());
        SafeParcelWriter.writeLong(parcel, 3, getMinUpdateIntervalMillis());
        SafeParcelWriter.writeInt(parcel, 6, getMaxUpdates());
        SafeParcelWriter.writeFloat(parcel, 7, getMinUpdateDistanceMeters());
        SafeParcelWriter.writeLong(parcel, 8, getMaxUpdateDelayMillis());
        SafeParcelWriter.writeBoolean(parcel, 9, isWaitForAccurateLocation());
        SafeParcelWriter.writeLong(parcel, 10, getDurationMillis());
        SafeParcelWriter.writeLong(parcel, 11, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 12, getGranularity());
        SafeParcelWriter.writeInt(parcel, 13, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzl);
        SafeParcelWriter.writeParcelable(parcel, 16, this.zzm, i3, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzn, i3, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.zzk;
    }

    public final boolean zzb() {
        return this.zzl;
    }

    public final WorkSource zzc() {
        return this.zzm;
    }

    public final com.google.android.gms.internal.location.zze zzd() {
        return this.zzn;
    }

    public static final class Builder {
        public static final long IMPLICIT_MAX_UPDATE_AGE = -1;
        public static final long IMPLICIT_MIN_UPDATE_INTERVAL = -1;
        private int zza;
        private long zzb;
        private long zzc;
        private long zzd;
        private long zze;
        private int zzf;
        private float zzg;
        private boolean zzh;
        private long zzi;
        private int zzj;
        private int zzk;
        private boolean zzl;
        private WorkSource zzm;
        private com.google.android.gms.internal.location.zze zzn;

        public Builder(int i3, long j3) {
            this(j3);
            setPriority(i3);
        }

        public LocationRequest build() {
            int i3 = this.zza;
            long j3 = this.zzb;
            long jMin = this.zzc;
            if (jMin == -1) {
                jMin = j3;
            } else if (i3 != 105) {
                jMin = Math.min(jMin, j3);
            }
            long jMax = Math.max(this.zzd, this.zzb);
            long j4 = this.zze;
            int i4 = this.zzf;
            float f3 = this.zzg;
            boolean z2 = this.zzh;
            long j5 = this.zzi;
            if (j5 == -1) {
                j5 = this.zzb;
            }
            return new LocationRequest(i3, j3, jMin, jMax, Long.MAX_VALUE, j4, i4, f3, z2, j5, this.zzj, this.zzk, this.zzl, new WorkSource(this.zzm), this.zzn);
        }

        public Builder setDurationMillis(long j3) {
            Preconditions.checkArgument(j3 > 0, "durationMillis must be greater than 0");
            this.zze = j3;
            return this;
        }

        public Builder setGranularity(int i3) {
            zzq.zza(i3);
            this.zzj = i3;
            return this;
        }

        public Builder setIntervalMillis(long j3) {
            Preconditions.checkArgument(j3 >= 0, "intervalMillis must be greater than or equal to 0");
            this.zzb = j3;
            return this;
        }

        public Builder setMaxUpdateAgeMillis(long j3) {
            boolean z2 = true;
            if (j3 != -1 && j3 < 0) {
                z2 = false;
            }
            Preconditions.checkArgument(z2, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.zzi = j3;
            return this;
        }

        public Builder setMaxUpdateDelayMillis(long j3) {
            Preconditions.checkArgument(j3 >= 0, "maxUpdateDelayMillis must be greater than or equal to 0");
            this.zzd = j3;
            return this;
        }

        public Builder setMaxUpdates(int i3) {
            Preconditions.checkArgument(i3 > 0, "maxUpdates must be greater than 0");
            this.zzf = i3;
            return this;
        }

        public Builder setMinUpdateDistanceMeters(float f3) {
            Preconditions.checkArgument(f3 >= 0.0f, "minUpdateDistanceMeters must be greater than or equal to 0");
            this.zzg = f3;
            return this;
        }

        public Builder setMinUpdateIntervalMillis(long j3) {
            boolean z2 = true;
            if (j3 != -1 && j3 < 0) {
                z2 = false;
            }
            Preconditions.checkArgument(z2, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
            this.zzc = j3;
            return this;
        }

        public Builder setPriority(int i3) {
            zzan.zza(i3);
            this.zza = i3;
            return this;
        }

        public Builder setWaitForAccurateLocation(boolean z2) {
            this.zzh = z2;
            return this;
        }

        public final Builder zza(int i3) {
            zzar.zza(i3);
            this.zzk = i3;
            return this;
        }

        public final Builder zzb(boolean z2) {
            this.zzl = z2;
            return this;
        }

        public final Builder zzc(WorkSource workSource) {
            this.zzm = workSource;
            return this;
        }

        public Builder(long j3) {
            this.zza = 102;
            this.zzc = -1L;
            this.zzd = 0L;
            this.zze = Long.MAX_VALUE;
            this.zzf = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.zzg = 0.0f;
            this.zzh = true;
            this.zzi = -1L;
            this.zzj = 0;
            this.zzk = 0;
            this.zzl = false;
            this.zzm = null;
            this.zzn = null;
            setIntervalMillis(j3);
        }

        public Builder(LocationRequest locationRequest) {
            this(locationRequest.getPriority(), locationRequest.getIntervalMillis());
            setMinUpdateIntervalMillis(locationRequest.getMinUpdateIntervalMillis());
            setMaxUpdateDelayMillis(locationRequest.getMaxUpdateDelayMillis());
            setDurationMillis(locationRequest.getDurationMillis());
            setMaxUpdates(locationRequest.getMaxUpdates());
            setMinUpdateDistanceMeters(locationRequest.getMinUpdateDistanceMeters());
            setWaitForAccurateLocation(locationRequest.isWaitForAccurateLocation());
            setMaxUpdateAgeMillis(locationRequest.getMaxUpdateAgeMillis());
            setGranularity(locationRequest.getGranularity());
            int iZza = locationRequest.zza();
            zzar.zza(iZza);
            this.zzk = iZza;
            this.zzl = locationRequest.zzb();
            this.zzm = locationRequest.zzc();
            com.google.android.gms.internal.location.zze zzeVarZzd = locationRequest.zzd();
            boolean z2 = true;
            if (zzeVarZzd != null && zzeVarZzd.zza()) {
                z2 = false;
            }
            Preconditions.checkArgument(z2);
            this.zzn = zzeVarZzd;
        }
    }

    LocationRequest(int i3, long j3, long j4, long j5, long j6, long j7, int i4, float f3, boolean z2, long j8, int i5, int i6, boolean z3, WorkSource workSource, com.google.android.gms.internal.location.zze zzeVar) {
        this.zza = i3;
        if (i3 == 105) {
            this.zzb = Long.MAX_VALUE;
        } else {
            this.zzb = j3;
        }
        this.zzc = j4;
        this.zzd = j5;
        this.zze = j6 == Long.MAX_VALUE ? j7 : Math.min(Math.max(1L, j6 - SystemClock.elapsedRealtime()), j7);
        this.zzf = i4;
        this.zzg = f3;
        this.zzh = z2;
        this.zzi = j8 != -1 ? j8 : j3;
        this.zzj = i5;
        this.zzk = i6;
        this.zzl = z3;
        this.zzm = workSource;
        this.zzn = zzeVar;
    }
}
