package p000a.p036j.p037a;

/* renamed from: a.j.a.l */
/* loaded from: classes.dex */
final class C0285l implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p000a.p036j.p037a.C0285l> CREATOR = null;

    /* renamed from: b */
    final java.lang.String f926b;

    /* renamed from: c */
    final int f927c;

    /* renamed from: d */
    final boolean f928d;

    /* renamed from: e */
    final int f929e;

    /* renamed from: f */
    final int f930f;

    /* renamed from: g */
    final java.lang.String f931g;

    /* renamed from: h */
    final boolean f932h;

    /* renamed from: i */
    final boolean f933i;

    /* renamed from: j */
    final android.os.Bundle f934j;

    /* renamed from: k */
    final boolean f935k;

    /* renamed from: l */
    android.os.Bundle f936l;

    /* renamed from: m */
    p000a.p036j.p037a.ComponentCallbacksC0248c f937m;

    /* renamed from: a.j.a.l$a */
    /* loaded from: classes.dex */
    static class C0286a implements android.os.Parcelable.Creator<p000a.p036j.p037a.C0285l> {
        C0286a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public p000a.p036j.p037a.C0285l createFromParcel(android.os.Parcel r2) {
                r1 = this;
                a.j.a.l r0 = new a.j.a.l
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ p000a.p036j.p037a.C0285l createFromParcel(android.os.Parcel r1) {
                r0 = this;
                a.j.a.l r1 = r0.createFromParcel(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public p000a.p036j.p037a.C0285l[] newArray(int r1) {
                r0 = this;
                a.j.a.l[] r1 = new p000a.p036j.p037a.C0285l[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ p000a.p036j.p037a.C0285l[] newArray(int r1) {
                r0 = this;
                a.j.a.l[] r1 = r0.newArray(r1)
                return r1
        }
    }

    static {
            a.j.a.l$a r0 = new a.j.a.l$a
            r0.<init>()
            p000a.p036j.p037a.C0285l.CREATOR = r0
            return
    }

    C0285l(p000a.p036j.p037a.ComponentCallbacksC0248c r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1.f926b = r0
            int r0 = r2.f793f
            r1.f927c = r0
            boolean r0 = r2.f801n
            r1.f928d = r0
            int r0 = r2.f812y
            r1.f929e = r0
            int r0 = r2.f813z
            r1.f930f = r0
            java.lang.String r0 = r2.f766A
            r1.f931g = r0
            boolean r0 = r2.f769D
            r1.f932h = r0
            boolean r0 = r2.f768C
            r1.f933i = r0
            android.os.Bundle r0 = r2.f795h
            r1.f934j = r0
            boolean r2 = r2.f767B
            r1.f935k = r2
            return
    }

    C0285l(android.os.Parcel r4) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = r4.readString()
            r3.f926b = r0
            int r0 = r4.readInt()
            r3.f927c = r0
            int r0 = r4.readInt()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0019
            r0 = 1
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r3.f928d = r0
            int r0 = r4.readInt()
            r3.f929e = r0
            int r0 = r4.readInt()
            r3.f930f = r0
            java.lang.String r0 = r4.readString()
            r3.f931g = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            r3.f932h = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L_0x0041
            r0 = 1
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            r3.f933i = r0
            android.os.Bundle r0 = r4.readBundle()
            r3.f934j = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r1 = 0
        L_0x0052:
            r3.f935k = r1
            android.os.Bundle r4 = r4.readBundle()
            r3.f936l = r4
            return
    }

    /* renamed from: a */
    public p000a.p036j.p037a.ComponentCallbacksC0248c m2995a(p000a.p036j.p037a.AbstractC0261g r4, p000a.p036j.p037a.AbstractC0259e r5, p000a.p036j.p037a.ComponentCallbacksC0248c r6, p000a.p036j.p037a.C0282j r7, androidx.lifecycle.C0761r r8) {
            r3 = this;
            a.j.a.c r0 = r3.f937m
            if (r0 != 0) goto L_0x0081
            android.content.Context r0 = r4.m3136c()
            android.os.Bundle r1 = r3.f934j
            if (r1 == 0) goto L_0x0013
            java.lang.ClassLoader r2 = r0.getClassLoader()
            r1.setClassLoader(r2)
        L_0x0013:
            if (r5 == 0) goto L_0x001e
            java.lang.String r1 = r3.f926b
            android.os.Bundle r2 = r3.f934j
            a.j.a.c r5 = r5.mo3168a(r0, r1, r2)
            goto L_0x0026
        L_0x001e:
            java.lang.String r5 = r3.f926b
            android.os.Bundle r1 = r3.f934j
            a.j.a.c r5 = p000a.p036j.p037a.ComponentCallbacksC0248c.m3245a(r0, r5, r1)
        L_0x0026:
            r3.f937m = r5
            android.os.Bundle r5 = r3.f936l
            if (r5 == 0) goto L_0x0039
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r5.setClassLoader(r0)
            a.j.a.c r5 = r3.f937m
            android.os.Bundle r0 = r3.f936l
            r5.f790c = r0
        L_0x0039:
            a.j.a.c r5 = r3.f937m
            int r0 = r3.f927c
            r5.m3256a(r0, r6)
            a.j.a.c r5 = r3.f937m
            boolean r6 = r3.f928d
            r5.f801n = r6
            r6 = 1
            r5.f803p = r6
            int r6 = r3.f929e
            r5.f812y = r6
            int r6 = r3.f930f
            r5.f813z = r6
            java.lang.String r6 = r3.f931g
            r5.f766A = r6
            boolean r6 = r3.f932h
            r5.f769D = r6
            boolean r6 = r3.f933i
            r5.f768C = r6
            boolean r6 = r3.f935k
            r5.f767B = r6
            a.j.a.i r4 = r4.f854d
            r5.f806s = r4
            boolean r4 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r4 == 0) goto L_0x0081
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Instantiated fragment "
            r4.append(r5)
            a.j.a.c r5 = r3.f937m
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "FragmentManager"
            android.util.Log.v(r5, r4)
        L_0x0081:
            a.j.a.c r4 = r3.f937m
            r4.f809v = r7
            r4.f810w = r8
            return r4
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
            java.lang.String r2 = r0.f926b
            r1.writeString(r2)
            int r2 = r0.f927c
            r1.writeInt(r2)
            boolean r2 = r0.f928d
            r1.writeInt(r2)
            int r2 = r0.f929e
            r1.writeInt(r2)
            int r2 = r0.f930f
            r1.writeInt(r2)
            java.lang.String r2 = r0.f931g
            r1.writeString(r2)
            boolean r2 = r0.f932h
            r1.writeInt(r2)
            boolean r2 = r0.f933i
            r1.writeInt(r2)
            android.os.Bundle r2 = r0.f934j
            r1.writeBundle(r2)
            boolean r2 = r0.f935k
            r1.writeInt(r2)
            android.os.Bundle r2 = r0.f936l
            r1.writeBundle(r2)
            return
    }
}
