package p000a.p033i.p034a;

/* renamed from: a.i.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC0237a implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p000a.p033i.p034a.AbstractC0237a> CREATOR = null;

    /* renamed from: c */
    public static final p000a.p033i.p034a.AbstractC0237a f700c = null;

    /* renamed from: b */
    private final android.os.Parcelable f701b;

    /* renamed from: a.i.a.a$a */
    /* loaded from: classes.dex */
    static class C0238a extends p000a.p033i.p034a.AbstractC0237a {
        C0238a() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }
    }

    /* renamed from: a.i.a.a$b */
    /* loaded from: classes.dex */
    static class C0239b implements android.os.Parcelable.ClassLoaderCreator<p000a.p033i.p034a.AbstractC0237a> {
        C0239b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p000a.p033i.p034a.AbstractC0237a createFromParcel(android.os.Parcel r2) {
                r1 = this;
                r0 = 0
                a.i.a.a r2 = r1.createFromParcel(r2, r0)
                return r2
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public p000a.p033i.p034a.AbstractC0237a createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                android.os.Parcelable r1 = r1.readParcelable(r2)
                if (r1 != 0) goto L_0x0009
                a.i.a.a r1 = p000a.p033i.p034a.AbstractC0237a.f700c
                return r1
            L_0x0009:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "superState must be null"
                r1.<init>(r2)
                throw r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                r0 = this;
                a.i.a.a r1 = r0.createFromParcel(r1)
                return r1
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public /* bridge */ /* synthetic */ p000a.p033i.p034a.AbstractC0237a createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                a.i.a.a r1 = r0.createFromParcel(r1, r2)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public p000a.p033i.p034a.AbstractC0237a[] newArray(int r1) {
                r0 = this;
                a.i.a.a[] r1 = new p000a.p033i.p034a.AbstractC0237a[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int r1) {
                r0 = this;
                a.i.a.a[] r1 = r0.newArray(r1)
                return r1
        }
    }

    static {
            a.i.a.a$a r0 = new a.i.a.a$a
            r0.<init>()
            p000a.p033i.p034a.AbstractC0237a.f700c = r0
            a.i.a.a$b r0 = new a.i.a.a$b
            r0.<init>()
            p000a.p033i.p034a.AbstractC0237a.CREATOR = r0
            return
    }

    private AbstractC0237a() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f701b = r0
            return
    }

    /* synthetic */ AbstractC0237a(p000a.p033i.p034a.AbstractC0237a.C0238a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    protected AbstractC0237a(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>()
            android.os.Parcelable r1 = r1.readParcelable(r2)
            if (r1 == 0) goto L_0x000a
            goto L_0x000c
        L_0x000a:
            a.i.a.a r1 = p000a.p033i.p034a.AbstractC0237a.f700c
        L_0x000c:
            r0.f701b = r1
            return
    }

    protected AbstractC0237a(android.os.Parcelable r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L_0x000e
            a.i.a.a r0 = p000a.p033i.p034a.AbstractC0237a.f700c
            if (r2 == r0) goto L_0x000a
            goto L_0x000b
        L_0x000a:
            r2 = 0
        L_0x000b:
            r1.f701b = r2
            return
        L_0x000e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "superState must not be null"
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: a */
    public final android.os.Parcelable m3347a() {
            r1 = this;
            android.os.Parcelable r0 = r1.f701b
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            android.os.Parcelable r0 = r1.f701b
            r2.writeParcelable(r0, r3)
            return
    }
}
