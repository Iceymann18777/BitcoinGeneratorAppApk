package p000a.p014e.p015a;

/* renamed from: a.e.a.e */
/* loaded from: classes.dex */
public class C0086e {

    /* renamed from: p */
    private static int f289p = 1000;

    /* renamed from: q */
    public static p000a.p014e.p015a.C0088f f290q;

    /* renamed from: a */
    int f291a;

    /* renamed from: b */
    private java.util.HashMap<java.lang.String, p000a.p014e.p015a.C0091i> f292b;

    /* renamed from: c */
    private p000a.p014e.p015a.C0086e.AbstractC0087a f293c;

    /* renamed from: d */
    private int f294d;

    /* renamed from: e */
    private int f295e;

    /* renamed from: f */
    p000a.p014e.p015a.C0083b[] f296f;

    /* renamed from: g */
    public boolean f297g;

    /* renamed from: h */
    private boolean[] f298h;

    /* renamed from: i */
    int f299i;

    /* renamed from: j */
    int f300j;

    /* renamed from: k */
    private int f301k;

    /* renamed from: l */
    final p000a.p014e.p015a.C0084c f302l;

    /* renamed from: m */
    private p000a.p014e.p015a.C0091i[] f303m;

    /* renamed from: n */
    private int f304n;

    /* renamed from: o */
    private final p000a.p014e.p015a.C0086e.AbstractC0087a f305o;

    /* renamed from: a.e.a.e$a */
    /* loaded from: classes.dex */
    interface AbstractC0087a {
        /* renamed from: a */
        p000a.p014e.p015a.C0091i mo3930a(p000a.p014e.p015a.C0086e r1, boolean[] r2);

        /* renamed from: a */
        void mo3931a(p000a.p014e.p015a.C0086e.AbstractC0087a r1);

        /* renamed from: a */
        void mo3929a(p000a.p014e.p015a.C0091i r1);

        void clear();

        p000a.p014e.p015a.C0091i getKey();
    }

    public C0086e() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f291a = r0
            r1 = 0
            r3.f292b = r1
            r2 = 32
            r3.f294d = r2
            int r2 = r3.f294d
            r3.f295e = r2
            r3.f296f = r1
            r3.f297g = r0
            boolean[] r1 = new boolean[r2]
            r3.f298h = r1
            r1 = 1
            r3.f299i = r1
            r3.f300j = r0
            r3.f301k = r2
            int r1 = p000a.p014e.p015a.C0086e.f289p
            a.e.a.i[] r1 = new p000a.p014e.p015a.C0091i[r1]
            r3.f303m = r1
            r3.f304n = r0
            a.e.a.b[] r0 = new p000a.p014e.p015a.C0083b[r2]
            a.e.a.b[] r0 = new p000a.p014e.p015a.C0083b[r2]
            r3.f296f = r0
            r3.m3932j()
            a.e.a.c r0 = new a.e.a.c
            r0.<init>()
            r3.f302l = r0
            a.e.a.d r0 = new a.e.a.d
            a.e.a.c r1 = r3.f302l
            r0.<init>(r1)
            r3.f293c = r0
            a.e.a.b r0 = new a.e.a.b
            a.e.a.c r1 = r3.f302l
            r0.<init>(r1)
            r3.f305o = r0
            return
    }

    /* renamed from: a */
    private final int m3958a(p000a.p014e.p015a.C0086e.AbstractC0087a r14, boolean r15) {
            r13 = this;
            a.e.a.f r15 = p000a.p014e.p015a.C0086e.f290q
            r0 = 1
            if (r15 == 0) goto L_0x000b
            long r2 = r15.f314h
            long r2 = r2 + r0
            r15.f314h = r2
        L_0x000b:
            r15 = 0
            r2 = 0
        L_0x000d:
            int r3 = r13.f299i
            if (r2 >= r3) goto L_0x0018
            boolean[] r3 = r13.f298h
            r3[r2] = r15
            int r2 = r2 + 1
            goto L_0x000d
        L_0x0018:
            r2 = 0
            r3 = 0
        L_0x001a:
            if (r2 != 0) goto L_0x00b3
            a.e.a.f r4 = p000a.p014e.p015a.C0086e.f290q
            if (r4 == 0) goto L_0x0025
            long r5 = r4.f315i
            long r5 = r5 + r0
            r4.f315i = r5
        L_0x0025:
            int r3 = r3 + 1
            int r4 = r13.f299i
            int r4 = r4 * 2
            if (r3 < r4) goto L_0x002e
            return r3
        L_0x002e:
            a.e.a.i r4 = r14.getKey()
            r5 = 1
            if (r4 == 0) goto L_0x003f
            boolean[] r4 = r13.f298h
            a.e.a.i r6 = r14.getKey()
            int r6 = r6.f337b
            r4[r6] = r5
        L_0x003f:
            boolean[] r4 = r13.f298h
            a.e.a.i r4 = r14.mo3930a(r13, r4)
            if (r4 == 0) goto L_0x0052
            boolean[] r6 = r13.f298h
            int r7 = r4.f337b
            boolean r8 = r6[r7]
            if (r8 == 0) goto L_0x0050
            return r3
        L_0x0050:
            r6[r7] = r5
        L_0x0052:
            if (r4 == 0) goto L_0x00b0
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r7 = -1
            r6 = 0
            r8 = -1
            r9 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L_0x005d:
            int r10 = r13.f300j
            if (r6 >= r10) goto L_0x0091
            a.e.a.b[] r10 = r13.f296f
            r10 = r10[r6]
            a.e.a.i r11 = r10.f281a
            a.e.a.i$a r11 = r11.f342g
            a.e.a.i$a r12 = p000a.p014e.p015a.C0091i.EnumC0092a.f346b
            if (r11 != r12) goto L_0x006e
            goto L_0x008e
        L_0x006e:
            boolean r11 = r10.f285e
            if (r11 == 0) goto L_0x0073
            goto L_0x008e
        L_0x0073:
            boolean r11 = r10.m3973b(r4)
            if (r11 == 0) goto L_0x008e
            a.e.a.a r11 = r10.f284d
            float r11 = r11.m3985b(r4)
            r12 = 0
            int r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r12 >= 0) goto L_0x008e
            float r10 = r10.f282b
            float r10 = -r10
            float r10 = r10 / r11
            int r11 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x008e
            r8 = r6
            r9 = r10
        L_0x008e:
            int r6 = r6 + 1
            goto L_0x005d
        L_0x0091:
            if (r8 <= r7) goto L_0x00b0
            a.e.a.b[] r5 = r13.f296f
            r5 = r5[r8]
            a.e.a.i r6 = r5.f281a
            r6.f338c = r7
            a.e.a.f r6 = p000a.p014e.p015a.C0086e.f290q
            if (r6 == 0) goto L_0x00a4
            long r9 = r6.f316j
            long r9 = r9 + r0
            r6.f316j = r9
        L_0x00a4:
            r5.m3965d(r4)
            a.e.a.i r4 = r5.f281a
            r4.f338c = r8
            r4.m3920c(r5)
            goto L_0x001a
        L_0x00b0:
            r2 = 1
            goto L_0x001a
        L_0x00b3:
            return r3
    }

    /* renamed from: a */
    public static p000a.p014e.p015a.C0083b m3957a(p000a.p014e.p015a.C0086e r1, p000a.p014e.p015a.C0091i r2, p000a.p014e.p015a.C0091i r3, p000a.p014e.p015a.C0091i r4, float r5, boolean r6) {
            a.e.a.b r0 = r1.m3948b()
            if (r6 == 0) goto L_0x0009
            r1.m3947b(r0)
        L_0x0009:
            r0.m3977a(r2, r3, r4, r5)
            return r0
    }

    /* renamed from: a */
    private p000a.p014e.p015a.C0091i m3956a(p000a.p014e.p015a.C0091i.EnumC0092a r3, java.lang.String r4) {
            r2 = this;
            a.e.a.c r0 = r2.f302l
            a.e.a.g<a.e.a.i> r0 = r0.f287b
            java.lang.Object r0 = r0.mo3928a()
            a.e.a.i r0 = (p000a.p014e.p015a.C0091i) r0
            if (r0 != 0) goto L_0x0012
            a.e.a.i r0 = new a.e.a.i
            r0.<init>(r3, r4)
            goto L_0x0015
        L_0x0012:
            r0.m3925a()
        L_0x0015:
            r0.m3923a(r3, r4)
            int r3 = r2.f304n
            int r4 = p000a.p014e.p015a.C0086e.f289p
            if (r3 < r4) goto L_0x002e
            int r4 = r4 * 2
            p000a.p014e.p015a.C0086e.f289p = r4
            a.e.a.i[] r3 = r2.f303m
            int r4 = p000a.p014e.p015a.C0086e.f289p
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            a.e.a.i[] r3 = (p000a.p014e.p015a.C0091i[]) r3
            r2.f303m = r3
        L_0x002e:
            a.e.a.i[] r3 = r2.f303m
            int r4 = r2.f304n
            int r1 = r4 + 1
            r2.f304n = r1
            r3[r4] = r0
            return r0
    }

    /* renamed from: b */
    private int m3946b(p000a.p014e.p015a.C0086e.AbstractC0087a r18) {
            r17 = this;
            r0 = r17
            r2 = 0
        L_0x0003:
            int r3 = r0.f300j
            r4 = 0
            if (r2 >= r3) goto L_0x0022
            a.e.a.b[] r3 = r0.f296f
            r6 = r3[r2]
            a.e.a.i r6 = r6.f281a
            a.e.a.i$a r6 = r6.f342g
            a.e.a.i$a r7 = p000a.p014e.p015a.C0091i.EnumC0092a.f346b
            if (r6 != r7) goto L_0x0015
            goto L_0x001f
        L_0x0015:
            r3 = r3[r2]
            float r3 = r3.f282b
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x001f
            r2 = 1
            goto L_0x0023
        L_0x001f:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x0022:
            r2 = 0
        L_0x0023:
            if (r2 == 0) goto L_0x00d0
            r2 = 0
            r3 = 0
        L_0x0027:
            if (r2 != 0) goto L_0x00d1
            a.e.a.f r6 = p000a.p014e.p015a.C0086e.f290q
            r7 = 1
            if (r6 == 0) goto L_0x0034
            long r9 = r6.f317k
            long r9 = r9 + r7
            r6.f317k = r9
        L_0x0034:
            int r3 = r3 + 1
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r9 = -1
            r6 = 0
            r10 = -1
            r11 = -1
            r12 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r13 = 0
        L_0x0041:
            int r14 = r0.f300j
            if (r6 >= r14) goto L_0x009f
            a.e.a.b[] r14 = r0.f296f
            r14 = r14[r6]
            a.e.a.i r15 = r14.f281a
            a.e.a.i$a r15 = r15.f342g
            a.e.a.i$a r1 = p000a.p014e.p015a.C0091i.EnumC0092a.f346b
            if (r15 != r1) goto L_0x0052
            goto L_0x0099
        L_0x0052:
            boolean r1 = r14.f285e
            if (r1 == 0) goto L_0x0057
            goto L_0x0099
        L_0x0057:
            float r1 = r14.f282b
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x0099
            r1 = 1
        L_0x005e:
            int r15 = r0.f299i
            if (r1 >= r15) goto L_0x0099
            a.e.a.c r15 = r0.f302l
            a.e.a.i[] r15 = r15.f288c
            r15 = r15[r1]
            a.e.a.a r5 = r14.f284d
            float r5 = r5.m3985b(r15)
            int r16 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r16 > 0) goto L_0x0073
            goto L_0x0093
        L_0x0073:
            r4 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = 0
        L_0x0078:
            r7 = 7
            if (r10 >= r7) goto L_0x008f
            float[] r7 = r15.f341f
            r7 = r7[r10]
            float r7 = r7 / r5
            int r8 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r8 >= 0) goto L_0x0086
            if (r10 == r4) goto L_0x0088
        L_0x0086:
            if (r10 <= r4) goto L_0x008c
        L_0x0088:
            r12 = r1
            r11 = r6
            r13 = r7
            r4 = r10
        L_0x008c:
            int r10 = r10 + 1
            goto L_0x0078
        L_0x008f:
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r4
        L_0x0093:
            int r1 = r1 + 1
            r4 = 0
            r7 = 1
            goto L_0x005e
        L_0x0099:
            int r6 = r6 + 1
            r4 = 0
            r7 = 1
            goto L_0x0041
        L_0x009f:
            if (r10 == r9) goto L_0x00c5
            a.e.a.b[] r1 = r0.f296f
            r1 = r1[r10]
            a.e.a.i r4 = r1.f281a
            r4.f338c = r9
            a.e.a.f r4 = p000a.p014e.p015a.C0086e.f290q
            if (r4 == 0) goto L_0x00b4
            long r5 = r4.f316j
            r7 = 1
            long r5 = r5 + r7
            r4.f316j = r5
        L_0x00b4:
            a.e.a.c r4 = r0.f302l
            a.e.a.i[] r4 = r4.f288c
            r4 = r4[r11]
            r1.m3965d(r4)
            a.e.a.i r4 = r1.f281a
            r4.f338c = r10
            r4.m3920c(r1)
            goto L_0x00c6
        L_0x00c5:
            r2 = 1
        L_0x00c6:
            int r1 = r0.f299i
            int r1 = r1 / 2
            if (r3 <= r1) goto L_0x00cd
            r2 = 1
        L_0x00cd:
            r4 = 0
            goto L_0x0027
        L_0x00d0:
            r3 = 0
        L_0x00d1:
            return r3
    }

    /* renamed from: b */
    private void m3947b(p000a.p014e.p015a.C0083b r2) {
            r1 = this;
            r0 = 0
            r2.m3981a(r1, r0)
            return
    }

    /* renamed from: c */
    private final void m3941c(p000a.p014e.p015a.C0083b r4) {
            r3 = this;
            a.e.a.b[] r0 = r3.f296f
            int r1 = r3.f300j
            r2 = r0[r1]
            if (r2 == 0) goto L_0x0011
            a.e.a.c r2 = r3.f302l
            a.e.a.g<a.e.a.b> r2 = r2.f286a
            r0 = r0[r1]
            r2.mo3927a(r0)
        L_0x0011:
            a.e.a.b[] r0 = r3.f296f
            int r1 = r3.f300j
            r0[r1] = r4
            a.e.a.i r0 = r4.f281a
            r0.f338c = r1
            int r1 = r1 + 1
            r3.f300j = r1
            r0.m3920c(r4)
            return
    }

    /* renamed from: d */
    private final void m3938d(p000a.p014e.p015a.C0083b r3) {
            r2 = this;
            int r0 = r2.f300j
            if (r0 <= 0) goto L_0x0014
            a.e.a.a r0 = r3.f284d
            a.e.a.b[] r1 = r2.f296f
            r0.m3995a(r3, r1)
            a.e.a.a r0 = r3.f284d
            int r0 = r0.f270a
            if (r0 != 0) goto L_0x0014
            r0 = 1
            r3.f285e = r0
        L_0x0014:
            return
    }

    /* renamed from: g */
    private void m3935g() {
            r3 = this;
            r0 = 0
        L_0x0001:
            int r1 = r3.f300j
            if (r0 >= r1) goto L_0x0012
            a.e.a.b[] r1 = r3.f296f
            r1 = r1[r0]
            a.e.a.i r2 = r1.f281a
            float r1 = r1.f282b
            r2.f340e = r1
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0012:
            return
    }

    /* renamed from: h */
    public static p000a.p014e.p015a.C0088f m3934h() {
            a.e.a.f r0 = p000a.p014e.p015a.C0086e.f290q
            return r0
    }

    /* renamed from: i */
    private void m3933i() {
            r6 = this;
            int r0 = r6.f294d
            int r0 = r0 * 2
            r6.f294d = r0
            a.e.a.b[] r0 = r6.f296f
            int r1 = r6.f294d
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.e.a.b[] r0 = (p000a.p014e.p015a.C0083b[]) r0
            r6.f296f = r0
            a.e.a.c r0 = r6.f302l
            a.e.a.i[] r1 = r0.f288c
            int r2 = r6.f294d
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            a.e.a.i[] r1 = (p000a.p014e.p015a.C0091i[]) r1
            r0.f288c = r1
            int r0 = r6.f294d
            boolean[] r1 = new boolean[r0]
            r6.f298h = r1
            r6.f295e = r0
            r6.f301k = r0
            a.e.a.f r1 = p000a.p014e.p015a.C0086e.f290q
            if (r1 == 0) goto L_0x0044
            long r2 = r1.f310d
            r4 = 1
            long r2 = r2 + r4
            r1.f310d = r2
            long r2 = r1.f321o
            long r4 = (long) r0
            long r2 = java.lang.Math.max(r2, r4)
            r1.f321o = r2
            a.e.a.f r0 = p000a.p014e.p015a.C0086e.f290q
            long r1 = r0.f321o
            r0.f306A = r1
        L_0x0044:
            return
    }

    /* renamed from: j */
    private void m3932j() {
            r3 = this;
            r0 = 0
        L_0x0001:
            a.e.a.b[] r1 = r3.f296f
            int r2 = r1.length
            if (r0 >= r2) goto L_0x0019
            r1 = r1[r0]
            if (r1 == 0) goto L_0x0011
            a.e.a.c r2 = r3.f302l
            a.e.a.g<a.e.a.b> r2 = r2.f286a
            r2.mo3927a(r1)
        L_0x0011:
            a.e.a.b[] r1 = r3.f296f
            r2 = 0
            r1[r0] = r2
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0019:
            return
    }

    /* renamed from: a */
    public p000a.p014e.p015a.C0083b m3953a(p000a.p014e.p015a.C0091i r2, p000a.p014e.p015a.C0091i r3, int r4, int r5) {
            r1 = this;
            a.e.a.b r0 = r1.m3948b()
            r0.m3979a(r2, r3, r4)
            r2 = 6
            if (r5 == r2) goto L_0x000d
            r0.m3981a(r1, r5)
        L_0x000d:
            r1.m3961a(r0)
            return r0
    }

    /* renamed from: a */
    public p000a.p014e.p015a.C0091i m3963a() {
            r5 = this;
            a.e.a.f r0 = p000a.p014e.p015a.C0086e.f290q
            if (r0 == 0) goto L_0x000b
            long r1 = r0.f320n
            r3 = 1
            long r1 = r1 + r3
            r0.f320n = r1
        L_0x000b:
            int r0 = r5.f299i
            int r0 = r0 + 1
            int r1 = r5.f295e
            if (r0 < r1) goto L_0x0016
            r5.m3933i()
        L_0x0016:
            a.e.a.i$a r0 = p000a.p014e.p015a.C0091i.EnumC0092a.f348d
            r1 = 0
            a.e.a.i r0 = r5.m3956a(r0, r1)
            int r1 = r5.f291a
            int r1 = r1 + 1
            r5.f291a = r1
            int r1 = r5.f299i
            int r1 = r1 + 1
            r5.f299i = r1
            int r1 = r5.f291a
            r0.f337b = r1
            a.e.a.c r2 = r5.f302l
            a.e.a.i[] r2 = r2.f288c
            r2[r1] = r0
            return r0
    }

    /* renamed from: a */
    public p000a.p014e.p015a.C0091i m3962a(int r6, java.lang.String r7) {
            r5 = this;
            a.e.a.f r0 = p000a.p014e.p015a.C0086e.f290q
            if (r0 == 0) goto L_0x000b
            long r1 = r0.f318l
            r3 = 1
            long r1 = r1 + r3
            r0.f318l = r1
        L_0x000b:
            int r0 = r5.f299i
            int r0 = r0 + 1
            int r1 = r5.f295e
            if (r0 < r1) goto L_0x0016
            r5.m3933i()
        L_0x0016:
            a.e.a.i$a r0 = p000a.p014e.p015a.C0091i.EnumC0092a.f349e
            a.e.a.i r7 = r5.m3956a(r0, r7)
            int r0 = r5.f291a
            int r0 = r0 + 1
            r5.f291a = r0
            int r0 = r5.f299i
            int r0 = r0 + 1
            r5.f299i = r0
            int r0 = r5.f291a
            r7.f337b = r0
            r7.f339d = r6
            a.e.a.c r6 = r5.f302l
            a.e.a.i[] r6 = r6.f288c
            r6[r0] = r7
            a.e.a.e$a r6 = r5.f293c
            r6.mo3929a(r7)
            return r7
    }

    /* renamed from: a */
    public p000a.p014e.p015a.C0091i m3949a(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r3.f299i
            int r1 = r1 + 1
            int r2 = r3.f295e
            if (r1 < r2) goto L_0x000f
            r3.m3933i()
        L_0x000f:
            boolean r1 = r4 instanceof p000a.p014e.p015a.p016j.C0097e
            if (r1 == 0) goto L_0x0057
            a.e.a.j.e r4 = (p000a.p014e.p015a.p016j.C0097e) r4
            a.e.a.i r0 = r4.m3892e()
            if (r0 != 0) goto L_0x0025
            a.e.a.c r0 = r3.f302l
            r4.m3899a(r0)
            a.e.a.i r4 = r4.m3892e()
            r0 = r4
        L_0x0025:
            int r4 = r0.f337b
            r1 = -1
            if (r4 == r1) goto L_0x0036
            int r2 = r3.f291a
            if (r4 > r2) goto L_0x0036
            a.e.a.c r2 = r3.f302l
            a.e.a.i[] r2 = r2.f288c
            r4 = r2[r4]
            if (r4 != 0) goto L_0x0057
        L_0x0036:
            int r4 = r0.f337b
            if (r4 == r1) goto L_0x003d
            r0.m3925a()
        L_0x003d:
            int r4 = r3.f291a
            int r4 = r4 + 1
            r3.f291a = r4
            int r4 = r3.f299i
            int r4 = r4 + 1
            r3.f299i = r4
            int r4 = r3.f291a
            r0.f337b = r4
            a.e.a.i$a r1 = p000a.p014e.p015a.C0091i.EnumC0092a.f346b
            r0.f342g = r1
            a.e.a.c r1 = r3.f302l
            a.e.a.i[] r1 = r1.f288c
            r1[r4] = r0
        L_0x0057:
            return r0
    }

    /* renamed from: a */
    public void m3961a(p000a.p014e.p015a.C0083b r8) {
            r7 = this;
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            a.e.a.f r0 = p000a.p014e.p015a.C0086e.f290q
            r1 = 1
            if (r0 == 0) goto L_0x0017
            long r3 = r0.f312f
            long r3 = r3 + r1
            r0.f312f = r3
            boolean r3 = r8.f285e
            if (r3 == 0) goto L_0x0017
            long r3 = r0.f313g
            long r3 = r3 + r1
            r0.f313g = r3
        L_0x0017:
            int r0 = r7.f300j
            r3 = 1
            int r0 = r0 + r3
            int r4 = r7.f301k
            if (r0 >= r4) goto L_0x0026
            int r0 = r7.f299i
            int r0 = r0 + r3
            int r4 = r7.f295e
            if (r0 < r4) goto L_0x0029
        L_0x0026:
            r7.m3933i()
        L_0x0029:
            r0 = 0
            boolean r4 = r8.f285e
            if (r4 != 0) goto L_0x0085
            r7.m3938d(r8)
            boolean r4 = r8.m3969c()
            if (r4 == 0) goto L_0x0038
            return
        L_0x0038:
            r8.m3984a()
            boolean r4 = r8.m3982a(r7)
            if (r4 == 0) goto L_0x007e
            a.e.a.i r0 = r7.m3963a()
            r8.f281a = r0
            r7.m3941c(r8)
            a.e.a.e$a r4 = r7.f305o
            r4.mo3931a(r8)
            a.e.a.e$a r4 = r7.f305o
            r7.m3958a(r4, r3)
            int r4 = r0.f338c
            r5 = -1
            if (r4 != r5) goto L_0x007d
            a.e.a.i r4 = r8.f281a
            if (r4 != r0) goto L_0x006f
            a.e.a.i r0 = r8.m3968c(r0)
            if (r0 == 0) goto L_0x006f
            a.e.a.f r4 = p000a.p014e.p015a.C0086e.f290q
            if (r4 == 0) goto L_0x006c
            long r5 = r4.f316j
            long r5 = r5 + r1
            r4.f316j = r5
        L_0x006c:
            r8.m3965d(r0)
        L_0x006f:
            boolean r0 = r8.f285e
            if (r0 != 0) goto L_0x0078
            a.e.a.i r0 = r8.f281a
            r0.m3920c(r8)
        L_0x0078:
            int r0 = r7.f300j
            int r0 = r0 - r3
            r7.f300j = r0
        L_0x007d:
            r0 = 1
        L_0x007e:
            boolean r1 = r8.m3974b()
            if (r1 != 0) goto L_0x0085
            return
        L_0x0085:
            if (r0 != 0) goto L_0x008a
            r7.m3941c(r8)
        L_0x008a:
            return
    }

    /* renamed from: a */
    void m3960a(p000a.p014e.p015a.C0083b r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            a.e.a.i r4 = r1.m3962a(r4, r0)
            r2.m3980a(r4, r3)
            return
    }

    /* renamed from: a */
    void m3959a(p000a.p014e.p015a.C0086e.AbstractC0087a r6) {
            r5 = this;
            a.e.a.f r0 = p000a.p014e.p015a.C0086e.f290q
            if (r0 == 0) goto L_0x0023
            long r1 = r0.f325s
            r3 = 1
            long r1 = r1 + r3
            r0.f325s = r1
            long r1 = r0.f326t
            int r3 = r5.f299i
            long r3 = (long) r3
            long r1 = java.lang.Math.max(r1, r3)
            r0.f326t = r1
            a.e.a.f r0 = p000a.p014e.p015a.C0086e.f290q
            long r1 = r0.f327u
            int r3 = r5.f300j
            long r3 = (long) r3
            long r1 = java.lang.Math.max(r1, r3)
            r0.f327u = r1
        L_0x0023:
            r0 = r6
            a.e.a.b r0 = (p000a.p014e.p015a.C0083b) r0
            r5.m3938d(r0)
            r5.m3946b(r6)
            r0 = 0
            r5.m3958a(r6, r0)
            r5.m3935g()
            return
    }

    /* renamed from: a */
    public void m3955a(p000a.p014e.p015a.C0091i r3, int r4) {
            r2 = this;
            int r0 = r3.f338c
            r1 = -1
            if (r0 == r1) goto L_0x0023
            a.e.a.b[] r1 = r2.f296f
            r0 = r1[r0]
            boolean r1 = r0.f285e
            if (r1 == 0) goto L_0x0011
        L_0x000d:
            float r3 = (float) r4
            r0.f282b = r3
            goto L_0x002d
        L_0x0011:
            a.e.a.a r1 = r0.f284d
            int r1 = r1.f270a
            if (r1 != 0) goto L_0x001b
            r3 = 1
            r0.f285e = r3
            goto L_0x000d
        L_0x001b:
            a.e.a.b r0 = r2.m3948b()
            r0.m3967c(r3, r4)
            goto L_0x002a
        L_0x0023:
            a.e.a.b r0 = r2.m3948b()
            r0.m3972b(r3, r4)
        L_0x002a:
            r2.m3961a(r0)
        L_0x002d:
            return
    }

    /* renamed from: a */
    public void m3954a(p000a.p014e.p015a.C0091i r12, p000a.p014e.p015a.C0091i r13, int r14, float r15, p000a.p014e.p015a.C0091i r16, p000a.p014e.p015a.C0091i r17, int r18, int r19) {
            r11 = this;
            r0 = r11
            r1 = r19
            a.e.a.b r10 = r11.m3948b()
            r2 = r10
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r2.m3978a(r3, r4, r5, r6, r7, r8, r9)
            r2 = 6
            if (r1 == r2) goto L_0x001b
            r10.m3981a(r11, r1)
        L_0x001b:
            r11.m3961a(r10)
            return
    }

    /* renamed from: a */
    public void m3952a(p000a.p014e.p015a.C0091i r8, p000a.p014e.p015a.C0091i r9, p000a.p014e.p015a.C0091i r10, p000a.p014e.p015a.C0091i r11, float r12, int r13) {
            r7 = this;
            a.e.a.b r6 = r7.m3948b()
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.m3975a(r1, r2, r3, r4, r5)
            r8 = 6
            if (r13 == r8) goto L_0x0013
            r6.m3981a(r7, r13)
        L_0x0013:
            r7.m3961a(r6)
            return
    }

    /* renamed from: a */
    public void m3951a(p000a.p014e.p015a.C0091i r4, p000a.p014e.p015a.C0091i r5, boolean r6) {
            r3 = this;
            a.e.a.b r0 = r3.m3948b()
            a.e.a.i r1 = r3.m3942c()
            r2 = 0
            r1.f339d = r2
            r0.m3976a(r4, r5, r1, r2)
            if (r6 == 0) goto L_0x001f
            a.e.a.a r4 = r0.f284d
            float r4 = r4.m3985b(r1)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            r5 = 1
            r3.m3960a(r0, r4, r5)
        L_0x001f:
            r3.m3961a(r0)
            return
    }

    /* renamed from: a */
    public void m3950a(p000a.p014e.p015a.p016j.C0102f r19, p000a.p014e.p015a.p016j.C0102f r20, float r21, int r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            a.e.a.j.e$d r3 = p000a.p014e.p015a.p016j.C0097e.EnumC0101d.f390c
            a.e.a.j.e r3 = r1.mo3780a(r3)
            a.e.a.i r5 = r0.m3949a(r3)
            a.e.a.j.e$d r3 = p000a.p014e.p015a.p016j.C0097e.EnumC0101d.f391d
            a.e.a.j.e r3 = r1.mo3780a(r3)
            a.e.a.i r7 = r0.m3949a(r3)
            a.e.a.j.e$d r3 = p000a.p014e.p015a.p016j.C0097e.EnumC0101d.f392e
            a.e.a.j.e r3 = r1.mo3780a(r3)
            a.e.a.i r3 = r0.m3949a(r3)
            a.e.a.j.e$d r4 = p000a.p014e.p015a.p016j.C0097e.EnumC0101d.f393f
            a.e.a.j.e r1 = r1.mo3780a(r4)
            a.e.a.i r8 = r0.m3949a(r1)
            a.e.a.j.e$d r1 = p000a.p014e.p015a.p016j.C0097e.EnumC0101d.f390c
            a.e.a.j.e r1 = r2.mo3780a(r1)
            a.e.a.i r1 = r0.m3949a(r1)
            a.e.a.j.e$d r4 = p000a.p014e.p015a.p016j.C0097e.EnumC0101d.f391d
            a.e.a.j.e r4 = r2.mo3780a(r4)
            a.e.a.i r9 = r0.m3949a(r4)
            a.e.a.j.e$d r4 = p000a.p014e.p015a.p016j.C0097e.EnumC0101d.f392e
            a.e.a.j.e r4 = r2.mo3780a(r4)
            a.e.a.i r12 = r0.m3949a(r4)
            a.e.a.j.e$d r4 = p000a.p014e.p015a.p016j.C0097e.EnumC0101d.f393f
            a.e.a.j.e r2 = r2.mo3780a(r4)
            a.e.a.i r10 = r0.m3949a(r2)
            a.e.a.b r2 = r18.m3948b()
            r4 = r21
            double r13 = (double) r4
            double r15 = java.lang.Math.sin(r13)
            r4 = r22
            r17 = r3
            double r3 = (double) r4
            java.lang.Double.isNaN(r3)
            r19 = r12
            double r11 = r15 * r3
            float r11 = (float) r11
            r6 = r2
            r6.m3970b(r7, r8, r9, r10, r11)
            r0.m3961a(r2)
            a.e.a.b r2 = r18.m3948b()
            double r6 = java.lang.Math.cos(r13)
            java.lang.Double.isNaN(r3)
            double r6 = r6 * r3
            float r9 = (float) r6
            r4 = r2
            r6 = r17
            r7 = r1
            r8 = r19
            r4.m3970b(r5, r6, r7, r8, r9)
            r0.m3961a(r2)
            return
    }

    /* renamed from: b */
    public int m3943b(java.lang.Object r2) {
            r1 = this;
            a.e.a.j.e r2 = (p000a.p014e.p015a.p016j.C0097e) r2
            a.e.a.i r2 = r2.m3892e()
            if (r2 == 0) goto L_0x000f
            float r2 = r2.f340e
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r2 = (int) r2
            return r2
        L_0x000f:
            r2 = 0
            return r2
    }

    /* renamed from: b */
    public p000a.p014e.p015a.C0083b m3948b() {
            r2 = this;
            a.e.a.c r0 = r2.f302l
            a.e.a.g<a.e.a.b> r0 = r0.f286a
            java.lang.Object r0 = r0.mo3928a()
            a.e.a.b r0 = (p000a.p014e.p015a.C0083b) r0
            if (r0 != 0) goto L_0x0014
            a.e.a.b r0 = new a.e.a.b
            a.e.a.c r1 = r2.f302l
            r0.<init>(r1)
            goto L_0x0017
        L_0x0014:
            r0.m3966d()
        L_0x0017:
            p000a.p014e.p015a.C0091i.m3922b()
            return r0
    }

    /* renamed from: b */
    public void m3945b(p000a.p014e.p015a.C0091i r4, p000a.p014e.p015a.C0091i r5, int r6, int r7) {
            r3 = this;
            a.e.a.b r0 = r3.m3948b()
            a.e.a.i r1 = r3.m3942c()
            r2 = 0
            r1.f339d = r2
            r0.m3976a(r4, r5, r1, r6)
            r4 = 6
            if (r7 == r4) goto L_0x001f
            a.e.a.a r4 = r0.f284d
            float r4 = r4.m3985b(r1)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            r3.m3960a(r0, r4, r7)
        L_0x001f:
            r3.m3961a(r0)
            return
    }

    /* renamed from: b */
    public void m3944b(p000a.p014e.p015a.C0091i r4, p000a.p014e.p015a.C0091i r5, boolean r6) {
            r3 = this;
            a.e.a.b r0 = r3.m3948b()
            a.e.a.i r1 = r3.m3942c()
            r2 = 0
            r1.f339d = r2
            r0.m3971b(r4, r5, r1, r2)
            if (r6 == 0) goto L_0x001f
            a.e.a.a r4 = r0.f284d
            float r4 = r4.m3985b(r1)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            r5 = 1
            r3.m3960a(r0, r4, r5)
        L_0x001f:
            r3.m3961a(r0)
            return
    }

    /* renamed from: c */
    public p000a.p014e.p015a.C0091i m3942c() {
            r5 = this;
            a.e.a.f r0 = p000a.p014e.p015a.C0086e.f290q
            if (r0 == 0) goto L_0x000b
            long r1 = r0.f319m
            r3 = 1
            long r1 = r1 + r3
            r0.f319m = r1
        L_0x000b:
            int r0 = r5.f299i
            int r0 = r0 + 1
            int r1 = r5.f295e
            if (r0 < r1) goto L_0x0016
            r5.m3933i()
        L_0x0016:
            a.e.a.i$a r0 = p000a.p014e.p015a.C0091i.EnumC0092a.f348d
            r1 = 0
            a.e.a.i r0 = r5.m3956a(r0, r1)
            int r1 = r5.f291a
            int r1 = r1 + 1
            r5.f291a = r1
            int r1 = r5.f299i
            int r1 = r1 + 1
            r5.f299i = r1
            int r1 = r5.f291a
            r0.f337b = r1
            a.e.a.c r2 = r5.f302l
            a.e.a.i[] r2 = r2.f288c
            r2[r1] = r0
            return r0
    }

    /* renamed from: c */
    public void m3940c(p000a.p014e.p015a.C0091i r4, p000a.p014e.p015a.C0091i r5, int r6, int r7) {
            r3 = this;
            a.e.a.b r0 = r3.m3948b()
            a.e.a.i r1 = r3.m3942c()
            r2 = 0
            r1.f339d = r2
            r0.m3971b(r4, r5, r1, r6)
            r4 = 6
            if (r7 == r4) goto L_0x001f
            a.e.a.a r4 = r0.f284d
            float r4 = r4.m3985b(r1)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            r3.m3960a(r0, r4, r7)
        L_0x001f:
            r3.m3961a(r0)
            return
    }

    /* renamed from: d */
    public p000a.p014e.p015a.C0084c m3939d() {
            r1 = this;
            a.e.a.c r0 = r1.f302l
            return r0
    }

    /* renamed from: e */
    public void m3937e() {
            r5 = this;
            a.e.a.f r0 = p000a.p014e.p015a.C0086e.f290q
            r1 = 1
            if (r0 == 0) goto L_0x000b
            long r3 = r0.f311e
            long r3 = r3 + r1
            r0.f311e = r3
        L_0x000b:
            boolean r0 = r5.f297g
            if (r0 == 0) goto L_0x003b
            a.e.a.f r0 = p000a.p014e.p015a.C0086e.f290q
            if (r0 == 0) goto L_0x0018
            long r3 = r0.f323q
            long r3 = r3 + r1
            r0.f323q = r3
        L_0x0018:
            r0 = 0
            r3 = 0
        L_0x001a:
            int r4 = r5.f300j
            if (r3 >= r4) goto L_0x002a
            a.e.a.b[] r4 = r5.f296f
            r4 = r4[r3]
            boolean r4 = r4.f285e
            if (r4 != 0) goto L_0x0027
            goto L_0x002b
        L_0x0027:
            int r3 = r3 + 1
            goto L_0x001a
        L_0x002a:
            r0 = 1
        L_0x002b:
            if (r0 != 0) goto L_0x002e
            goto L_0x003b
        L_0x002e:
            a.e.a.f r0 = p000a.p014e.p015a.C0086e.f290q
            if (r0 == 0) goto L_0x0037
            long r3 = r0.f322p
            long r3 = r3 + r1
            r0.f322p = r3
        L_0x0037:
            r5.m3935g()
            goto L_0x0040
        L_0x003b:
            a.e.a.e$a r0 = r5.f293c
            r5.m3959a(r0)
        L_0x0040:
            return
    }

    /* renamed from: f */
    public void m3936f() {
            r5 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            a.e.a.c r2 = r5.f302l
            a.e.a.i[] r3 = r2.f288c
            int r4 = r3.length
            if (r1 >= r4) goto L_0x0013
            r2 = r3[r1]
            if (r2 == 0) goto L_0x0010
            r2.m3925a()
        L_0x0010:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x0013:
            a.e.a.g<a.e.a.i> r1 = r2.f287b
            a.e.a.i[] r2 = r5.f303m
            int r3 = r5.f304n
            r1.mo3926a(r2, r3)
            r5.f304n = r0
            a.e.a.c r1 = r5.f302l
            a.e.a.i[] r1 = r1.f288c
            r2 = 0
            java.util.Arrays.fill(r1, r2)
            java.util.HashMap<java.lang.String, a.e.a.i> r1 = r5.f292b
            if (r1 == 0) goto L_0x002d
            r1.clear()
        L_0x002d:
            r5.f291a = r0
            a.e.a.e$a r1 = r5.f293c
            r1.clear()
            r1 = 1
            r5.f299i = r1
            r1 = 0
        L_0x0038:
            int r2 = r5.f300j
            if (r1 >= r2) goto L_0x0045
            a.e.a.b[] r2 = r5.f296f
            r2 = r2[r1]
            r2.f283c = r0
            int r1 = r1 + 1
            goto L_0x0038
        L_0x0045:
            r5.m3932j()
            r5.f300j = r0
            return
    }
}
