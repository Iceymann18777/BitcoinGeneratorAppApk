package p000a.p014e.p015a;

/* renamed from: a.e.a.i */
/* loaded from: classes.dex */
public class C0091i {

    /* renamed from: k */
    private static int f335k = 1;

    /* renamed from: a */
    private java.lang.String f336a;

    /* renamed from: b */
    public int f337b;

    /* renamed from: c */
    int f338c;

    /* renamed from: d */
    public int f339d;

    /* renamed from: e */
    public float f340e;

    /* renamed from: f */
    float[] f341f;

    /* renamed from: g */
    p000a.p014e.p015a.C0091i.EnumC0092a f342g;

    /* renamed from: h */
    p000a.p014e.p015a.C0083b[] f343h;

    /* renamed from: i */
    int f344i;

    /* renamed from: j */
    public int f345j;

    /* renamed from: a.e.a.i$a */
    /* loaded from: classes.dex */
    public enum EnumC0092a {

        /* renamed from: b */
        public static final p000a.p014e.p015a.C0091i.EnumC0092a f346b = null;

        /* renamed from: c */
        public static final p000a.p014e.p015a.C0091i.EnumC0092a f347c = null;

        /* renamed from: d */
        public static final p000a.p014e.p015a.C0091i.EnumC0092a f348d = null;

        /* renamed from: e */
        public static final p000a.p014e.p015a.C0091i.EnumC0092a f349e = null;

        /* renamed from: f */
        public static final p000a.p014e.p015a.C0091i.EnumC0092a f350f = null;

        /* renamed from: g */
        private static final /* synthetic */ p000a.p014e.p015a.C0091i.EnumC0092a[] f351g = null;

        static {
                a.e.a.i$a r0 = new a.e.a.i$a
                r1 = 0
                java.lang.String r2 = "UNRESTRICTED"
                r0.<init>(r2, r1)
                p000a.p014e.p015a.C0091i.EnumC0092a.f346b = r0
                a.e.a.i$a r0 = new a.e.a.i$a
                r2 = 1
                java.lang.String r3 = "CONSTANT"
                r0.<init>(r3, r2)
                p000a.p014e.p015a.C0091i.EnumC0092a.f347c = r0
                a.e.a.i$a r0 = new a.e.a.i$a
                r3 = 2
                java.lang.String r4 = "SLACK"
                r0.<init>(r4, r3)
                p000a.p014e.p015a.C0091i.EnumC0092a.f348d = r0
                a.e.a.i$a r0 = new a.e.a.i$a
                r4 = 3
                java.lang.String r5 = "ERROR"
                r0.<init>(r5, r4)
                p000a.p014e.p015a.C0091i.EnumC0092a.f349e = r0
                a.e.a.i$a r0 = new a.e.a.i$a
                r5 = 4
                java.lang.String r6 = "UNKNOWN"
                r0.<init>(r6, r5)
                p000a.p014e.p015a.C0091i.EnumC0092a.f350f = r0
                r0 = 5
                a.e.a.i$a[] r0 = new p000a.p014e.p015a.C0091i.EnumC0092a[r0]
                a.e.a.i$a r6 = p000a.p014e.p015a.C0091i.EnumC0092a.f346b
                r0[r1] = r6
                a.e.a.i$a r1 = p000a.p014e.p015a.C0091i.EnumC0092a.f347c
                r0[r2] = r1
                a.e.a.i$a r1 = p000a.p014e.p015a.C0091i.EnumC0092a.f348d
                r0[r3] = r1
                a.e.a.i$a r1 = p000a.p014e.p015a.C0091i.EnumC0092a.f349e
                r0[r4] = r1
                a.e.a.i$a r1 = p000a.p014e.p015a.C0091i.EnumC0092a.f350f
                r0[r5] = r1
                p000a.p014e.p015a.C0091i.EnumC0092a.f351g = r0
                return
        }

        EnumC0092a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static p000a.p014e.p015a.C0091i.EnumC0092a valueOf(java.lang.String r1) {
                java.lang.Class<a.e.a.i$a> r0 = p000a.p014e.p015a.C0091i.EnumC0092a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                a.e.a.i$a r1 = (p000a.p014e.p015a.C0091i.EnumC0092a) r1
                return r1
        }

        public static p000a.p014e.p015a.C0091i.EnumC0092a[] values() {
                a.e.a.i$a[] r0 = p000a.p014e.p015a.C0091i.EnumC0092a.f351g
                java.lang.Object r0 = r0.clone()
                a.e.a.i$a[] r0 = (p000a.p014e.p015a.C0091i.EnumC0092a[]) r0
                return r0
        }
    }

    public C0091i(p000a.p014e.p015a.C0091i.EnumC0092a r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            r3 = -1
            r1.f337b = r3
            r1.f338c = r3
            r3 = 0
            r1.f339d = r3
            r0 = 7
            float[] r0 = new float[r0]
            r1.f341f = r0
            r0 = 8
            a.e.a.b[] r0 = new p000a.p014e.p015a.C0083b[r0]
            r1.f343h = r0
            r1.f344i = r3
            r1.f345j = r3
            r1.f342g = r2
            return
    }

    /* renamed from: b */
    static void m3922b() {
            int r0 = p000a.p014e.p015a.C0091i.f335k
            int r0 = r0 + 1
            p000a.p014e.p015a.C0091i.f335k = r0
            return
    }

    /* renamed from: a */
    public void m3925a() {
            r2 = this;
            r0 = 0
            r2.f336a = r0
            a.e.a.i$a r0 = p000a.p014e.p015a.C0091i.EnumC0092a.f350f
            r2.f342g = r0
            r0 = 0
            r2.f339d = r0
            r1 = -1
            r2.f337b = r1
            r2.f338c = r1
            r1 = 0
            r2.f340e = r1
            r2.f344i = r0
            r2.f345j = r0
            return
    }

    /* renamed from: a */
    public final void m3924a(p000a.p014e.p015a.C0083b r4) {
            r3 = this;
            r0 = 0
        L_0x0001:
            int r1 = r3.f344i
            if (r0 >= r1) goto L_0x000f
            a.e.a.b[] r1 = r3.f343h
            r1 = r1[r0]
            if (r1 != r4) goto L_0x000c
            return
        L_0x000c:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x000f:
            a.e.a.b[] r0 = r3.f343h
            int r2 = r0.length
            if (r1 < r2) goto L_0x001f
            int r1 = r0.length
            int r1 = r1 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.e.a.b[] r0 = (p000a.p014e.p015a.C0083b[]) r0
            r3.f343h = r0
        L_0x001f:
            a.e.a.b[] r0 = r3.f343h
            int r1 = r3.f344i
            r0[r1] = r4
            int r1 = r1 + 1
            r3.f344i = r1
            return
    }

    /* renamed from: a */
    public void m3923a(p000a.p014e.p015a.C0091i.EnumC0092a r1, java.lang.String r2) {
            r0 = this;
            r0.f342g = r1
            return
    }

    /* renamed from: b */
    public final void m3921b(p000a.p014e.p015a.C0083b r6) {
            r5 = this;
            int r0 = r5.f344i
            r1 = 0
            r2 = 0
        L_0x0004:
            if (r2 >= r0) goto L_0x0029
            a.e.a.b[] r3 = r5.f343h
            r3 = r3[r2]
            if (r3 != r6) goto L_0x0026
        L_0x000c:
            int r6 = r0 - r2
            int r6 = r6 + (-1)
            if (r1 >= r6) goto L_0x001f
            a.e.a.b[] r6 = r5.f343h
            int r3 = r2 + r1
            int r4 = r3 + 1
            r4 = r6[r4]
            r6[r3] = r4
            int r1 = r1 + 1
            goto L_0x000c
        L_0x001f:
            int r6 = r5.f344i
            int r6 = r6 + (-1)
            r5.f344i = r6
            return
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0029:
            return
    }

    /* renamed from: c */
    public final void m3920c(p000a.p014e.p015a.C0083b r6) {
            r5 = this;
            int r0 = r5.f344i
            r1 = 0
            r2 = 0
        L_0x0004:
            if (r2 >= r0) goto L_0x0014
            a.e.a.b[] r3 = r5.f343h
            r4 = r3[r2]
            a.e.a.a r4 = r4.f284d
            r3 = r3[r2]
            r4.m3996a(r3, r6, r1)
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0014:
            r5.f344i = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r1 = r2.f336a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
