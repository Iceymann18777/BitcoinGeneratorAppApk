package androidx.versionedparcelable;

/* loaded from: classes.dex */
public class ParcelImpl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl> CREATOR = null;

    /* renamed from: b */
    private final androidx.versionedparcelable.AbstractC0867c f3272b;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    /* loaded from: classes.dex */
    static class C0864a implements android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl> {
        C0864a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.versionedparcelable.ParcelImpl createFromParcel(android.os.Parcel r2) {
                r1 = this;
                androidx.versionedparcelable.ParcelImpl r0 = new androidx.versionedparcelable.ParcelImpl
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ androidx.versionedparcelable.ParcelImpl createFromParcel(android.os.Parcel r1) {
                r0 = this;
                androidx.versionedparcelable.ParcelImpl r1 = r0.createFromParcel(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.versionedparcelable.ParcelImpl[] newArray(int r1) {
                r0 = this;
                androidx.versionedparcelable.ParcelImpl[] r1 = new androidx.versionedparcelable.ParcelImpl[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ androidx.versionedparcelable.ParcelImpl[] newArray(int r1) {
                r0 = this;
                androidx.versionedparcelable.ParcelImpl[] r1 = r0.newArray(r1)
                return r1
        }
    }

    static {
            androidx.versionedparcelable.ParcelImpl$a r0 = new androidx.versionedparcelable.ParcelImpl$a
            r0.<init>()
            androidx.versionedparcelable.ParcelImpl.CREATOR = r0
            return
    }

    protected ParcelImpl(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            androidx.versionedparcelable.b r0 = new androidx.versionedparcelable.b
            r0.<init>(r2)
            androidx.versionedparcelable.c r2 = r0.m498h()
            r1.f3272b = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            androidx.versionedparcelable.b r2 = new androidx.versionedparcelable.b
            r2.<init>(r1)
            androidx.versionedparcelable.c r1 = r0.f3272b
            r2.m512a(r1)
            return
    }
}
