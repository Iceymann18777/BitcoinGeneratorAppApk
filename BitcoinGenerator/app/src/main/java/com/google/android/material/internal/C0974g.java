package com.google.android.material.internal;

/* renamed from: com.google.android.material.internal.g */
/* loaded from: classes.dex */
public class C0974g extends android.util.SparseArray<android.os.Parcelable> implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.material.internal.C0974g> CREATOR = null;

    /* renamed from: com.google.android.material.internal.g$a */
    /* loaded from: classes.dex */
    static class C0975a implements android.os.Parcelable.ClassLoaderCreator<com.google.android.material.internal.C0974g> {
        C0975a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public com.google.android.material.internal.C0974g createFromParcel(android.os.Parcel r3) {
                r2 = this;
                com.google.android.material.internal.g r0 = new com.google.android.material.internal.g
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public com.google.android.material.internal.C0974g createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                r1 = this;
                com.google.android.material.internal.g r0 = new com.google.android.material.internal.g
                r0.<init>(r2, r3)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                r0 = this;
                com.google.android.material.internal.g r1 = r0.createFromParcel(r1)
                return r1
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public /* bridge */ /* synthetic */ com.google.android.material.internal.C0974g createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                com.google.android.material.internal.g r1 = r0.createFromParcel(r1, r2)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public com.google.android.material.internal.C0974g[] newArray(int r1) {
                r0 = this;
                com.google.android.material.internal.g[] r1 = new com.google.android.material.internal.C0974g[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int r1) {
                r0 = this;
                com.google.android.material.internal.g[] r1 = r0.newArray(r1)
                return r1
        }
    }

    static {
            com.google.android.material.internal.g$a r0 = new com.google.android.material.internal.g$a
            r0.<init>()
            com.google.android.material.internal.C0974g.CREATOR = r0
            return
    }

    public C0974g() {
            r0 = this;
            r0.<init>()
            return
    }

    public C0974g(android.os.Parcel r5, java.lang.ClassLoader r6) {
            r4 = this;
            r4.<init>()
            int r0 = r5.readInt()
            int[] r1 = new int[r0]
            r5.readIntArray(r1)
            android.os.Parcelable[] r5 = r5.readParcelableArray(r6)
            r6 = 0
        L_0x0011:
            if (r6 >= r0) goto L_0x001d
            r2 = r1[r6]
            r3 = r5[r6]
            r4.put(r2, r3)
            int r6 = r6 + 1
            goto L_0x0011
        L_0x001d:
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r6, int r7) {
            r5 = this;
            int r0 = r5.size()
            int[] r1 = new int[r0]
            android.os.Parcelable[] r2 = new android.os.Parcelable[r0]
            r3 = 0
        L_0x0009:
            if (r3 >= r0) goto L_0x001c
            int r4 = r5.keyAt(r3)
            r1[r3] = r4
            java.lang.Object r4 = r5.valueAt(r3)
            android.os.Parcelable r4 = (android.os.Parcelable) r4
            r2[r3] = r4
            int r3 = r3 + 1
            goto L_0x0009
        L_0x001c:
            r6.writeInt(r0)
            r6.writeIntArray(r1)
            r6.writeParcelableArray(r2, r7)
            return
    }
}
