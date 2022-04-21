package androidx.versionedparcelable;

/* renamed from: androidx.versionedparcelable.b */
/* loaded from: classes.dex */
class C0866b extends androidx.versionedparcelable.AbstractC0865a {

    /* renamed from: a */
    private final android.util.SparseIntArray f3273a;

    /* renamed from: b */
    private final android.os.Parcel f3274b;

    /* renamed from: c */
    private final int f3275c;

    /* renamed from: d */
    private final int f3276d;

    /* renamed from: e */
    private final java.lang.String f3277e;

    /* renamed from: f */
    private int f3278f;

    /* renamed from: g */
    private int f3279g;

    C0866b(android.os.Parcel r4) {
            r3 = this;
            int r0 = r4.dataPosition()
            int r1 = r4.dataSize()
            java.lang.String r2 = ""
            r3.<init>(r4, r0, r1, r2)
            return
    }

    C0866b(android.os.Parcel r2, int r3, int r4, java.lang.String r5) {
            r1 = this;
            r1.<init>()
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r1.f3273a = r0
            r0 = -1
            r1.f3278f = r0
            r0 = 0
            r1.f3279g = r0
            r1.f3274b = r2
            r1.f3275c = r3
            r1.f3276d = r4
            int r2 = r1.f3275c
            r1.f3279g = r2
            r1.f3277e = r5
            return
    }

    /* renamed from: d */
    private int m488d(int r4) {
            r3 = this;
        L_0x0000:
            int r0 = r3.f3279g
            int r1 = r3.f3276d
            if (r0 >= r1) goto L_0x0025
            android.os.Parcel r1 = r3.f3274b
            r1.setDataPosition(r0)
            android.os.Parcel r0 = r3.f3274b
            int r0 = r0.readInt()
            android.os.Parcel r1 = r3.f3274b
            int r1 = r1.readInt()
            int r2 = r3.f3279g
            int r2 = r2 + r0
            r3.f3279g = r2
            if (r1 != r4) goto L_0x0000
            android.os.Parcel r4 = r3.f3274b
            int r4 = r4.dataPosition()
            return r4
        L_0x0025:
            r4 = -1
            return r4
    }

    @Override // androidx.versionedparcelable.AbstractC0865a
    /* renamed from: a */
    public void mo497a() {
            r4 = this;
            int r0 = r4.f3278f
            if (r0 < 0) goto L_0x0021
            android.util.SparseIntArray r1 = r4.f3273a
            int r0 = r1.get(r0)
            android.os.Parcel r1 = r4.f3274b
            int r1 = r1.dataPosition()
            int r2 = r1 - r0
            android.os.Parcel r3 = r4.f3274b
            r3.setDataPosition(r0)
            android.os.Parcel r0 = r4.f3274b
            r0.writeInt(r2)
            android.os.Parcel r0 = r4.f3274b
            r0.setDataPosition(r1)
        L_0x0021:
            return
    }

    @Override // androidx.versionedparcelable.AbstractC0865a
    /* renamed from: a */
    public void mo495a(android.os.Parcelable r3) {
            r2 = this;
            android.os.Parcel r0 = r2.f3274b
            r1 = 0
            r0.writeParcelable(r3, r1)
            return
    }

    @Override // androidx.versionedparcelable.AbstractC0865a
    /* renamed from: a */
    public void mo494a(java.lang.String r2) {
            r1 = this;
            android.os.Parcel r0 = r1.f3274b
            r0.writeString(r2)
            return
    }

    @Override // androidx.versionedparcelable.AbstractC0865a
    /* renamed from: a */
    public void mo493a(byte[] r3) {
            r2 = this;
            if (r3 == 0) goto L_0x000e
            android.os.Parcel r0 = r2.f3274b
            int r1 = r3.length
            r0.writeInt(r1)
            android.os.Parcel r0 = r2.f3274b
            r0.writeByteArray(r3)
            goto L_0x0014
        L_0x000e:
            android.os.Parcel r3 = r2.f3274b
            r0 = -1
            r3.writeInt(r0)
        L_0x0014:
            return
    }

    @Override // androidx.versionedparcelable.AbstractC0865a
    /* renamed from: a */
    public boolean mo496a(int r2) {
            r1 = this;
            int r2 = r1.m488d(r2)
            r0 = -1
            if (r2 != r0) goto L_0x0009
            r2 = 0
            return r2
        L_0x0009:
            android.os.Parcel r0 = r1.f3274b
            r0.setDataPosition(r2)
            r2 = 1
            return r2
    }

    @Override // androidx.versionedparcelable.AbstractC0865a
    /* renamed from: b */
    protected androidx.versionedparcelable.AbstractC0865a mo492b() {
            r6 = this;
            androidx.versionedparcelable.b r0 = new androidx.versionedparcelable.b
            android.os.Parcel r1 = r6.f3274b
            int r2 = r1.dataPosition()
            int r3 = r6.f3279g
            int r4 = r6.f3275c
            if (r3 != r4) goto L_0x0010
            int r3 = r6.f3276d
        L_0x0010:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r6.f3277e
            r4.append(r5)
            java.lang.String r5 = "  "
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // androidx.versionedparcelable.AbstractC0865a
    /* renamed from: b */
    public void mo491b(int r3) {
            r2 = this;
            r2.mo497a()
            r2.f3278f = r3
            android.util.SparseIntArray r0 = r2.f3273a
            android.os.Parcel r1 = r2.f3274b
            int r1 = r1.dataPosition()
            r0.put(r3, r1)
            r0 = 0
            r2.mo490c(r0)
            r2.mo490c(r3)
            return
    }

    @Override // androidx.versionedparcelable.AbstractC0865a
    /* renamed from: c */
    public void mo490c(int r2) {
            r1 = this;
            android.os.Parcel r0 = r1.f3274b
            r0.writeInt(r2)
            return
    }

    @Override // androidx.versionedparcelable.AbstractC0865a
    /* renamed from: d */
    public byte[] mo489d() {
            r2 = this;
            android.os.Parcel r0 = r2.f3274b
            int r0 = r0.readInt()
            if (r0 >= 0) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            byte[] r0 = new byte[r0]
            android.os.Parcel r1 = r2.f3274b
            r1.readByteArray(r0)
            return r0
    }

    @Override // androidx.versionedparcelable.AbstractC0865a
    /* renamed from: e */
    public int mo487e() {
            r1 = this;
            android.os.Parcel r0 = r1.f3274b
            int r0 = r0.readInt()
            return r0
    }

    @Override // androidx.versionedparcelable.AbstractC0865a
    /* renamed from: f */
    public <T extends android.os.Parcelable> T mo486f() {
            r2 = this;
            android.os.Parcel r0 = r2.f3274b
            java.lang.Class<androidx.versionedparcelable.b> r1 = androidx.versionedparcelable.C0866b.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r0 = r0.readParcelable(r1)
            return r0
    }

    @Override // androidx.versionedparcelable.AbstractC0865a
    /* renamed from: g */
    public java.lang.String mo485g() {
            r1 = this;
            android.os.Parcel r0 = r1.f3274b
            java.lang.String r0 = r0.readString()
            return r0
    }
}
