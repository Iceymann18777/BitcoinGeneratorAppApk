package p000a.p014e.p015a.p016j;

/* renamed from: a.e.a.j.d */
/* loaded from: classes.dex */
public class C0096d {

    /* renamed from: a */
    protected p000a.p014e.p015a.p016j.C0102f f355a;

    /* renamed from: b */
    protected p000a.p014e.p015a.p016j.C0102f f356b;

    /* renamed from: c */
    protected p000a.p014e.p015a.p016j.C0102f f357c;

    /* renamed from: d */
    protected p000a.p014e.p015a.p016j.C0102f f358d;

    /* renamed from: e */
    protected p000a.p014e.p015a.p016j.C0102f f359e;

    /* renamed from: f */
    protected p000a.p014e.p015a.p016j.C0102f f360f;

    /* renamed from: g */
    protected p000a.p014e.p015a.p016j.C0102f f361g;

    /* renamed from: h */
    protected java.util.ArrayList<p000a.p014e.p015a.p016j.C0102f> f362h;

    /* renamed from: i */
    protected int f363i;

    /* renamed from: j */
    protected int f364j;

    /* renamed from: k */
    protected float f365k;

    /* renamed from: l */
    private int f366l;

    /* renamed from: m */
    private boolean f367m;

    /* renamed from: n */
    protected boolean f368n;

    /* renamed from: o */
    protected boolean f369o;

    /* renamed from: p */
    protected boolean f370p;

    /* renamed from: q */
    private boolean f371q;

    public C0096d(p000a.p014e.p015a.p016j.C0102f r2, int r3, boolean r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f365k = r0
            r0 = 0
            r1.f367m = r0
            r1.f355a = r2
            r1.f366l = r3
            r1.f367m = r4
            return
    }

    /* renamed from: a */
    private static boolean m3902a(p000a.p014e.p015a.p016j.C0102f r2, int r3) {
            int r0 = r2.m3822r()
            r1 = 8
            if (r0 == r1) goto L_0x001d
            a.e.a.j.f$b[] r0 = r2.f402C
            r0 = r0[r3]
            a.e.a.j.f$b r1 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f465d
            if (r0 != r1) goto L_0x001d
            int[] r2 = r2.f438g
            r0 = r2[r3]
            if (r0 == 0) goto L_0x001b
            r2 = r2[r3]
            r3 = 3
            if (r2 != r3) goto L_0x001d
        L_0x001b:
            r2 = 1
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            return r2
    }

    /* renamed from: b */
    private void m3901b() {
            r13 = this;
            int r0 = r13.f366l
            r1 = 2
            int r0 = r0 * 2
            a.e.a.j.f r2 = r13.f355a
            r3 = 0
            r4 = r2
            r5 = r4
            r2 = 0
        L_0x000b:
            r6 = 1
            if (r2 != 0) goto L_0x00c0
            int r7 = r13.f363i
            int r7 = r7 + r6
            r13.f363i = r7
            a.e.a.j.f[] r7 = r4.f443i0
            int r8 = r13.f366l
            r9 = 0
            r7[r8] = r9
            a.e.a.j.f[] r7 = r4.f441h0
            r7[r8] = r9
            int r7 = r4.m3822r()
            r8 = 8
            if (r7 == r8) goto L_0x0091
            a.e.a.j.f r7 = r13.f356b
            if (r7 != 0) goto L_0x002c
            r13.f356b = r4
        L_0x002c:
            r13.f358d = r4
            a.e.a.j.f$b[] r7 = r4.f402C
            int r8 = r13.f366l
            r7 = r7[r8]
            a.e.a.j.f$b r10 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f465d
            if (r7 != r10) goto L_0x0091
            int[] r7 = r4.f438g
            r10 = r7[r8]
            if (r10 == 0) goto L_0x0047
            r10 = r7[r8]
            r11 = 3
            if (r10 == r11) goto L_0x0047
            r7 = r7[r8]
            if (r7 != r1) goto L_0x0091
        L_0x0047:
            int r7 = r13.f364j
            int r7 = r7 + r6
            r13.f364j = r7
            float[] r7 = r4.f439g0
            int r8 = r13.f366l
            r10 = r7[r8]
            r11 = 0
            int r12 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r12 <= 0) goto L_0x005e
            float r12 = r13.f365k
            r7 = r7[r8]
            float r12 = r12 + r7
            r13.f365k = r12
        L_0x005e:
            int r7 = r13.f366l
            boolean r7 = m3902a(r4, r7)
            if (r7 == 0) goto L_0x007f
            int r7 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r7 >= 0) goto L_0x006d
            r13.f368n = r6
            goto L_0x006f
        L_0x006d:
            r13.f369o = r6
        L_0x006f:
            java.util.ArrayList<a.e.a.j.f> r7 = r13.f362h
            if (r7 != 0) goto L_0x007a
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r13.f362h = r7
        L_0x007a:
            java.util.ArrayList<a.e.a.j.f> r7 = r13.f362h
            r7.add(r4)
        L_0x007f:
            a.e.a.j.f r7 = r13.f360f
            if (r7 != 0) goto L_0x0085
            r13.f360f = r4
        L_0x0085:
            a.e.a.j.f r7 = r13.f361g
            if (r7 == 0) goto L_0x008f
            a.e.a.j.f[] r7 = r7.f441h0
            int r8 = r13.f366l
            r7[r8] = r4
        L_0x008f:
            r13.f361g = r4
        L_0x0091:
            if (r5 == r4) goto L_0x0099
            a.e.a.j.f[] r5 = r5.f443i0
            int r7 = r13.f366l
            r5[r7] = r4
        L_0x0099:
            a.e.a.j.e[] r5 = r4.f400A
            int r7 = r0 + 1
            r5 = r5[r7]
            a.e.a.j.e r5 = r5.f375d
            if (r5 == 0) goto L_0x00b7
            a.e.a.j.f r5 = r5.f373b
            a.e.a.j.e[] r7 = r5.f400A
            r8 = r7[r0]
            a.e.a.j.e r8 = r8.f375d
            if (r8 == 0) goto L_0x00b7
            r7 = r7[r0]
            a.e.a.j.e r7 = r7.f375d
            a.e.a.j.f r7 = r7.f373b
            if (r7 == r4) goto L_0x00b6
            goto L_0x00b7
        L_0x00b6:
            r9 = r5
        L_0x00b7:
            if (r9 == 0) goto L_0x00ba
            goto L_0x00bc
        L_0x00ba:
            r9 = r4
            r2 = 1
        L_0x00bc:
            r5 = r4
            r4 = r9
            goto L_0x000b
        L_0x00c0:
            r13.f357c = r4
            int r0 = r13.f366l
            if (r0 != 0) goto L_0x00cd
            boolean r0 = r13.f367m
            if (r0 == 0) goto L_0x00cd
            a.e.a.j.f r0 = r13.f357c
            goto L_0x00cf
        L_0x00cd:
            a.e.a.j.f r0 = r13.f355a
        L_0x00cf:
            r13.f359e = r0
            boolean r0 = r13.f369o
            if (r0 == 0) goto L_0x00da
            boolean r0 = r13.f368n
            if (r0 == 0) goto L_0x00da
            r3 = 1
        L_0x00da:
            r13.f370p = r3
            return
    }

    /* renamed from: a */
    public void m3903a() {
            r1 = this;
            boolean r0 = r1.f371q
            if (r0 != 0) goto L_0x0007
            r1.m3901b()
        L_0x0007:
            r0 = 1
            r1.f371q = r0
            return
    }
}
