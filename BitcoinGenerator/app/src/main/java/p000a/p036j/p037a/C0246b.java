package p000a.p036j.p037a;

/* renamed from: a.j.a.b */
/* loaded from: classes.dex */
final class C0246b implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p000a.p036j.p037a.C0246b> CREATOR = null;

    /* renamed from: b */
    final int[] f752b;

    /* renamed from: c */
    final int f753c;

    /* renamed from: d */
    final int f754d;

    /* renamed from: e */
    final java.lang.String f755e;

    /* renamed from: f */
    final int f756f;

    /* renamed from: g */
    final int f757g;

    /* renamed from: h */
    final java.lang.CharSequence f758h;

    /* renamed from: i */
    final int f759i;

    /* renamed from: j */
    final java.lang.CharSequence f760j;

    /* renamed from: k */
    final java.util.ArrayList<java.lang.String> f761k;

    /* renamed from: l */
    final java.util.ArrayList<java.lang.String> f762l;

    /* renamed from: m */
    final boolean f763m;

    /* renamed from: a.j.a.b$a */
    /* loaded from: classes.dex */
    static class C0247a implements android.os.Parcelable.Creator<p000a.p036j.p037a.C0246b> {
        C0247a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public p000a.p036j.p037a.C0246b createFromParcel(android.os.Parcel r2) {
                r1 = this;
                a.j.a.b r0 = new a.j.a.b
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ p000a.p036j.p037a.C0246b createFromParcel(android.os.Parcel r1) {
                r0 = this;
                a.j.a.b r1 = r0.createFromParcel(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public p000a.p036j.p037a.C0246b[] newArray(int r1) {
                r0 = this;
                a.j.a.b[] r1 = new p000a.p036j.p037a.C0246b[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ p000a.p036j.p037a.C0246b[] newArray(int r1) {
                r0 = this;
                a.j.a.b[] r1 = r0.newArray(r1)
                return r1
        }
    }

    static {
            a.j.a.b$a r0 = new a.j.a.b$a
            r0.<init>()
            p000a.p036j.p037a.C0246b.CREATOR = r0
            return
    }

    public C0246b(p000a.p036j.p037a.C0244a r8) {
            r7 = this;
            r7.<init>()
            java.util.ArrayList<a.j.a.a$a> r0 = r8.f727b
            int r0 = r0.size()
            int r1 = r0 * 6
            int[] r1 = new int[r1]
            r7.f752b = r1
            boolean r1 = r8.f734i
            if (r1 == 0) goto L_0x007d
            r1 = 0
            r2 = 0
        L_0x0015:
            if (r1 >= r0) goto L_0x0050
            java.util.ArrayList<a.j.a.a$a> r3 = r8.f727b
            java.lang.Object r3 = r3.get(r1)
            a.j.a.a$a r3 = (p000a.p036j.p037a.C0244a.C0245a) r3
            int[] r4 = r7.f752b
            int r5 = r2 + 1
            int r6 = r3.f746a
            r4[r2] = r6
            int r2 = r5 + 1
            a.j.a.c r6 = r3.f747b
            if (r6 == 0) goto L_0x0030
            int r6 = r6.f793f
            goto L_0x0031
        L_0x0030:
            r6 = -1
        L_0x0031:
            r4[r5] = r6
            int[] r4 = r7.f752b
            int r5 = r2 + 1
            int r6 = r3.f748c
            r4[r2] = r6
            int r2 = r5 + 1
            int r6 = r3.f749d
            r4[r5] = r6
            int r5 = r2 + 1
            int r6 = r3.f750e
            r4[r2] = r6
            int r2 = r5 + 1
            int r3 = r3.f751f
            r4[r5] = r3
            int r1 = r1 + 1
            goto L_0x0015
        L_0x0050:
            int r0 = r8.f732g
            r7.f753c = r0
            int r0 = r8.f733h
            r7.f754d = r0
            java.lang.String r0 = r8.f735j
            r7.f755e = r0
            int r0 = r8.f737l
            r7.f756f = r0
            int r0 = r8.f738m
            r7.f757g = r0
            java.lang.CharSequence r0 = r8.f739n
            r7.f758h = r0
            int r0 = r8.f740o
            r7.f759i = r0
            java.lang.CharSequence r0 = r8.f741p
            r7.f760j = r0
            java.util.ArrayList<java.lang.String> r0 = r8.f742q
            r7.f761k = r0
            java.util.ArrayList<java.lang.String> r0 = r8.f743r
            r7.f762l = r0
            boolean r8 = r8.f744s
            r7.f763m = r8
            return
        L_0x007d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Not on back stack"
            r8.<init>(r0)
            goto L_0x0086
        L_0x0085:
            throw r8
        L_0x0086:
            goto L_0x0085
    }

    public C0246b(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            int[] r0 = r2.createIntArray()
            r1.f752b = r0
            int r0 = r2.readInt()
            r1.f753c = r0
            int r0 = r2.readInt()
            r1.f754d = r0
            java.lang.String r0 = r2.readString()
            r1.f755e = r0
            int r0 = r2.readInt()
            r1.f756f = r0
            int r0 = r2.readInt()
            r1.f757g = r0
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r0 = r0.createFromParcel(r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.f758h = r0
            int r0 = r2.readInt()
            r1.f759i = r0
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r0 = r0.createFromParcel(r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.f760j = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.f761k = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.f762l = r0
            int r2 = r2.readInt()
            if (r2 == 0) goto L_0x0055
            r2 = 1
            goto L_0x0056
        L_0x0055:
            r2 = 0
        L_0x0056:
            r1.f763m = r2
            return
    }

    /* renamed from: a */
    public p000a.p036j.p037a.C0244a m3285a(p000a.p036j.p037a.LayoutInflater$Factory2C0266i r7) {
            r6 = this;
            a.j.a.a r0 = new a.j.a.a
            r0.<init>(r7)
            r1 = 0
            r2 = 0
        L_0x0007:
            int[] r3 = r6.f752b
            int r3 = r3.length
            if (r1 >= r3) goto L_0x008d
            a.j.a.a$a r3 = new a.j.a.a$a
            r3.<init>()
            int[] r4 = r6.f752b
            int r5 = r1 + 1
            r1 = r4[r1]
            r3.f746a = r1
            boolean r1 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r1 == 0) goto L_0x0047
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Instantiate "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = " op #"
            r1.append(r4)
            r1.append(r2)
            java.lang.String r4 = " base fragment #"
            r1.append(r4)
            int[] r4 = r6.f752b
            r4 = r4[r5]
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "FragmentManager"
            android.util.Log.v(r4, r1)
        L_0x0047:
            int[] r1 = r6.f752b
            int r4 = r5 + 1
            r1 = r1[r5]
            if (r1 < 0) goto L_0x0058
            android.util.SparseArray<a.j.a.c> r5 = r7.f868f
            java.lang.Object r1 = r5.get(r1)
            a.j.a.c r1 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r1
            goto L_0x0059
        L_0x0058:
            r1 = 0
        L_0x0059:
            r3.f747b = r1
            int[] r1 = r6.f752b
            int r5 = r4 + 1
            r4 = r1[r4]
            r3.f748c = r4
            int r4 = r5 + 1
            r5 = r1[r5]
            r3.f749d = r5
            int r5 = r4 + 1
            r4 = r1[r4]
            r3.f750e = r4
            int r4 = r5 + 1
            r1 = r1[r5]
            r3.f751f = r1
            int r1 = r3.f748c
            r0.f728c = r1
            int r1 = r3.f749d
            r0.f729d = r1
            int r1 = r3.f750e
            r0.f730e = r1
            int r1 = r3.f751f
            r0.f731f = r1
            r0.m3300a(r3)
            int r2 = r2 + 1
            r1 = r4
            goto L_0x0007
        L_0x008d:
            int r7 = r6.f753c
            r0.f732g = r7
            int r7 = r6.f754d
            r0.f733h = r7
            java.lang.String r7 = r6.f755e
            r0.f735j = r7
            int r7 = r6.f756f
            r0.f737l = r7
            r7 = 1
            r0.f734i = r7
            int r1 = r6.f757g
            r0.f738m = r1
            java.lang.CharSequence r1 = r6.f758h
            r0.f739n = r1
            int r1 = r6.f759i
            r0.f740o = r1
            java.lang.CharSequence r1 = r6.f760j
            r0.f741p = r1
            java.util.ArrayList<java.lang.String> r1 = r6.f761k
            r0.f742q = r1
            java.util.ArrayList<java.lang.String> r1 = r6.f762l
            r0.f743r = r1
            boolean r1 = r6.f763m
            r0.f744s = r1
            r0.m3303a(r7)
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
            int[] r3 = r1.f752b
            r2.writeIntArray(r3)
            int r3 = r1.f753c
            r2.writeInt(r3)
            int r3 = r1.f754d
            r2.writeInt(r3)
            java.lang.String r3 = r1.f755e
            r2.writeString(r3)
            int r3 = r1.f756f
            r2.writeInt(r3)
            int r3 = r1.f757g
            r2.writeInt(r3)
            java.lang.CharSequence r3 = r1.f758h
            r0 = 0
            android.text.TextUtils.writeToParcel(r3, r2, r0)
            int r3 = r1.f759i
            r2.writeInt(r3)
            java.lang.CharSequence r3 = r1.f760j
            android.text.TextUtils.writeToParcel(r3, r2, r0)
            java.util.ArrayList<java.lang.String> r3 = r1.f761k
            r2.writeStringList(r3)
            java.util.ArrayList<java.lang.String> r3 = r1.f762l
            r2.writeStringList(r3)
            boolean r3 = r1.f763m
            r2.writeInt(r3)
            return
    }
}
