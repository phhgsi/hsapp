package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.location.zzek;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new zzp();
    public static final int INITIAL_TRIGGER_DWELL = 4;
    public static final int INITIAL_TRIGGER_ENTER = 1;
    public static final int INITIAL_TRIGGER_EXIT = 2;
    private final List zza;
    private final int zzb;
    private final String zzc;

    public static final class Builder {
        private final List zza = new ArrayList();
        private int zzb = 5;

        public Builder addGeofence(Geofence geofence) {
            Preconditions.checkArgument(geofence instanceof zzek, "Geofence must be created using Geofence.Builder.");
            this.zza.add((zzek) geofence);
            return this;
        }

        public Builder addGeofences(List<? extends Geofence> list) {
            Iterator<? extends Geofence> it = list.iterator();
            while (it.hasNext()) {
                addGeofence(it.next());
            }
            return this;
        }

        public GeofencingRequest build() {
            Preconditions.checkArgument(!this.zza.isEmpty(), "No geofence has been added to this request.");
            return new GeofencingRequest(new ArrayList(this.zza), this.zzb, null);
        }

        public Builder setInitialTrigger(int i3) {
            this.zzb = i3 & 7;
            return this;
        }
    }

    public @interface InitialTrigger {
    }

    GeofencingRequest(List list, int i3, String str) {
        this.zza = list;
        this.zzb = i3;
        this.zzc = str;
    }

    public List<Geofence> getGeofences() {
        return new ArrayList(this.zza);
    }

    public int getInitialTrigger() {
        return this.zzb;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.zza);
        int length = strValueOf.length();
        int i3 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 45 + String.valueOf(i3).length() + 1);
        sb.append("GeofencingRequest[geofences=");
        sb.append(strValueOf);
        sb.append(", initialTrigger=");
        sb.append(i3);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        List list = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, list, false);
        SafeParcelWriter.writeInt(parcel, 2, getInitialTrigger());
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
