package p000a.p036j.p037a;

/* renamed from: a.j.a.k */
/* loaded from: classes.dex */
final class C0283k implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p000a.p036j.p037a.C0283k> CREATOR = null;

    /* renamed from: b */
    p000a.p036j.p037a.C0285l[] f921b;

    /* renamed from: c */
    int[] f922c;

    /* renamed from: d */
    p000a.p036j.p037a.C0246b[] f923d;

    /* renamed from: e */
    int f924e;

    /* renamed from: f */
    int f925f;

    /* renamed from: a.j.a.k$a */
    /* loaded from: classes.dex */
    static class C0284a implements android.os.Parcelable.Creator<p000a.p036j.p037a.C0283k> {
        C0284a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public p000a.p036j.p037a.C0283k createFromParcel(android.os.Parcel r2) {
                r1 = this;
                a.j.a.k r0 = new a.j.a.k
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ p000a.p036j.p037a.C0283k createFromParcel(android.os.Parcel r1) {
                r0 = this;
                a.j.a.k r1 = r0.createFromParcel(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public p000a.p036j.p037a.C0283k[] newArray(int r1) {
                r0 = this;
                a.j.a.k[] r1 = new p000a.p036j.p037a.C0283k[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ p000a.p036j.p037a.C0283k[] newArray(int r1) {
                r0 = this;
                a.j.a.k[] r1 = r0.newArray(r1)
                return r1
        }
    }

    static {
            a.j.a.k$a r0 = new a.j.a.k$a
            r0.<init>()
            p000a.p036j.p037a.C0283k.CREATOR = r0
            return
    }

    public C0283k() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f924e = r0
            return
    }

    public C0283k(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f924e = r0
            android.os.Parcelable$Creator<a.j.a.l> r0 = p000a.p036j.p037a.C0285l.CREATOR
            java.lang.Object[] r0 = r2.createTypedArray(r0)
            a.j.a.l[] r0 = (p000a.p036j.p037a.C0285l[]) r0
            r1.f921b = r0
            int[] r0 = r2.createIntArray()
            r1.f922c = r0
            android.os.Parcelable$Creator<a.j.a.b> r0 = p000a.p036j.p037a.C0246b.CREATOR
            java.lang.Object[] r0 = r2.createTypedArray(r0)
            a.j.a.b[] r0 = (p000a.p036j.p037a.C0246b[]) r0
            r1.f923d = r0
            int r0 = r2.readInt()
            r1.f924e = r0
            int r2 = r2.readInt()
            r1.f925f = r2
            return
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
            a.j.a.l[] r0 = r1.f921b
            r2.writeTypedArray(r0, r3)
            int[] r0 = r1.f922c
            r2.writeIntArray(r0)
            a.j.a.b[] r0 = r1.f923d
            r2.writeTypedArray(r0, r3)
            int r3 = r1.f924e
            r2.writeInt(r3)
            int r3 = r1.f925f
            r2.writeInt(r3)
            return
    }
}
