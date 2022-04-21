package p000a.p014e.p015a;

/* renamed from: a.e.a.a */
/* loaded from: classes.dex */
public class C0082a {

    /* renamed from: a */
    int f270a;

    /* renamed from: b */
    private final p000a.p014e.p015a.C0083b f271b;

    /* renamed from: c */
    private final p000a.p014e.p015a.C0084c f272c;

    /* renamed from: d */
    private int f273d;

    /* renamed from: e */
    private p000a.p014e.p015a.C0091i f274e;

    /* renamed from: f */
    private int[] f275f;

    /* renamed from: g */
    private int[] f276g;

    /* renamed from: h */
    private float[] f277h;

    /* renamed from: i */
    private int f278i;

    /* renamed from: j */
    private int f279j;

    /* renamed from: k */
    private boolean f280k;

    C0082a(p000a.p014e.p015a.C0083b r4, p000a.p014e.p015a.C0084c r5) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f270a = r0
            r1 = 8
            r3.f273d = r1
            r1 = 0
            r3.f274e = r1
            int r1 = r3.f273d
            int[] r2 = new int[r1]
            r3.f275f = r2
            int[] r2 = new int[r1]
            r3.f276g = r2
            float[] r1 = new float[r1]
            r3.f277h = r1
            r1 = -1
            r3.f278i = r1
            r3.f279j = r1
            r3.f280k = r0
            r3.f271b = r4
            r3.f272c = r5
            return
    }

    /* renamed from: a */
    private boolean m3990a(p000a.p014e.p015a.C0091i r1, p000a.p014e.p015a.C0086e r2) {
            r0 = this;
            int r1 = r1.f345j
            r2 = 1
            if (r1 > r2) goto L_0x0006
            goto L_0x0007
        L_0x0006:
            r2 = 0
        L_0x0007:
            return r2
    }

    /* renamed from: a */
    public final float m3989a(p000a.p014e.p015a.C0091i r9, boolean r10) {
            r8 = this;
            a.e.a.i r0 = r8.f274e
            if (r0 != r9) goto L_0x0007
            r0 = 0
            r8.f274e = r0
        L_0x0007:
            int r0 = r8.f278i
            r1 = 0
            r2 = -1
            if (r0 != r2) goto L_0x000e
            return r1
        L_0x000e:
            r3 = 0
            r4 = -1
        L_0x0010:
            if (r0 == r2) goto L_0x005b
            int r5 = r8.f270a
            if (r3 >= r5) goto L_0x005b
            int[] r5 = r8.f275f
            r5 = r5[r0]
            int r6 = r9.f337b
            if (r5 != r6) goto L_0x0051
            int r1 = r8.f278i
            if (r0 != r1) goto L_0x0029
            int[] r1 = r8.f276g
            r1 = r1[r0]
            r8.f278i = r1
            goto L_0x002f
        L_0x0029:
            int[] r1 = r8.f276g
            r3 = r1[r0]
            r1[r4] = r3
        L_0x002f:
            if (r10 == 0) goto L_0x0036
            a.e.a.b r10 = r8.f271b
            r9.m3921b(r10)
        L_0x0036:
            int r10 = r9.f345j
            int r10 = r10 + (-1)
            r9.f345j = r10
            int r9 = r8.f270a
            int r9 = r9 + (-1)
            r8.f270a = r9
            int[] r9 = r8.f275f
            r9[r0] = r2
            boolean r9 = r8.f280k
            if (r9 == 0) goto L_0x004c
            r8.f279j = r0
        L_0x004c:
            float[] r9 = r8.f277h
            r9 = r9[r0]
            return r9
        L_0x0051:
            int[] r4 = r8.f276g
            r4 = r4[r0]
            int r3 = r3 + 1
            r7 = r4
            r4 = r0
            r0 = r7
            goto L_0x0010
        L_0x005b:
            return r1
    }

    /* renamed from: a */
    final p000a.p014e.p015a.C0091i m3997a(int r4) {
            r3 = this;
            int r0 = r3.f278i
            r1 = 0
        L_0x0003:
            r2 = -1
            if (r0 == r2) goto L_0x001e
            int r2 = r3.f270a
            if (r1 >= r2) goto L_0x001e
            if (r1 != r4) goto L_0x0017
            a.e.a.c r4 = r3.f272c
            a.e.a.i[] r4 = r4.f288c
            int[] r1 = r3.f275f
            r0 = r1[r0]
            r4 = r4[r0]
            return r4
        L_0x0017:
            int[] r2 = r3.f276g
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L_0x0003
        L_0x001e:
            r4 = 0
            return r4
    }

    /* renamed from: a */
    p000a.p014e.p015a.C0091i m3994a(p000a.p014e.p015a.C0086e r15) {
            r14 = this;
            int r0 = r14.f278i
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = r1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x000a:
            r9 = -1
            if (r0 == r9) goto L_0x0089
            int r9 = r14.f270a
            if (r2 >= r9) goto L_0x0089
            float[] r9 = r14.f277h
            r10 = r9[r0]
            r11 = 981668463(0x3a83126f, float:0.001)
            a.e.a.c r12 = r14.f272c
            a.e.a.i[] r12 = r12.f288c
            int[] r13 = r14.f275f
            r13 = r13[r0]
            r12 = r12[r13]
            int r13 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x0030
            r11 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x003c
            r9[r0] = r3
            goto L_0x0036
        L_0x0030:
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x003c
            r9[r0] = r3
        L_0x0036:
            a.e.a.b r9 = r14.f271b
            r12.m3921b(r9)
            r10 = 0
        L_0x003c:
            r9 = 1
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 == 0) goto L_0x0082
            a.e.a.i$a r11 = r12.f342g
            a.e.a.i$a r13 = p000a.p014e.p015a.C0091i.EnumC0092a.f346b
            if (r11 != r13) goto L_0x0062
            if (r4 != 0) goto L_0x0051
        L_0x0049:
            boolean r4 = r14.m3990a(r12, r15)
            r6 = r4
            r5 = r10
            r4 = r12
            goto L_0x0082
        L_0x0051:
            int r11 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x0056
            goto L_0x0049
        L_0x0056:
            if (r6 != 0) goto L_0x0082
            boolean r11 = r14.m3990a(r12, r15)
            if (r11 == 0) goto L_0x0082
            r5 = r10
            r4 = r12
            r6 = 1
            goto L_0x0082
        L_0x0062:
            if (r4 != 0) goto L_0x0082
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 >= 0) goto L_0x0082
            if (r1 != 0) goto L_0x0072
        L_0x006a:
            boolean r1 = r14.m3990a(r12, r15)
            r8 = r1
            r7 = r10
            r1 = r12
            goto L_0x0082
        L_0x0072:
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x0077
            goto L_0x006a
        L_0x0077:
            if (r8 != 0) goto L_0x0082
            boolean r11 = r14.m3990a(r12, r15)
            if (r11 == 0) goto L_0x0082
            r7 = r10
            r1 = r12
            r8 = 1
        L_0x0082:
            int[] r9 = r14.f276g
            r0 = r9[r0]
            int r2 = r2 + 1
            goto L_0x000a
        L_0x0089:
            if (r4 == 0) goto L_0x008c
            return r4
        L_0x008c:
            return r1
    }

    /* renamed from: a */
    p000a.p014e.p015a.C0091i m3988a(boolean[] r9, p000a.p014e.p015a.C0091i r10) {
            r8 = this;
            int r0 = r8.f278i
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0006:
            r5 = -1
            if (r0 == r5) goto L_0x0044
            int r5 = r8.f270a
            if (r2 >= r5) goto L_0x0044
            float[] r5 = r8.f277h
            r5 = r5[r0]
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x003d
            a.e.a.c r5 = r8.f272c
            a.e.a.i[] r5 = r5.f288c
            int[] r6 = r8.f275f
            r6 = r6[r0]
            r5 = r5[r6]
            if (r9 == 0) goto L_0x0027
            int r6 = r5.f337b
            boolean r6 = r9[r6]
            if (r6 != 0) goto L_0x003d
        L_0x0027:
            if (r5 == r10) goto L_0x003d
            a.e.a.i$a r6 = r5.f342g
            a.e.a.i$a r7 = p000a.p014e.p015a.C0091i.EnumC0092a.f348d
            if (r6 == r7) goto L_0x0033
            a.e.a.i$a r7 = p000a.p014e.p015a.C0091i.EnumC0092a.f349e
            if (r6 != r7) goto L_0x003d
        L_0x0033:
            float[] r6 = r8.f277h
            r6 = r6[r0]
            int r7 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x003d
            r3 = r5
            r4 = r6
        L_0x003d:
            int[] r5 = r8.f276g
            r0 = r5[r0]
            int r2 = r2 + 1
            goto L_0x0006
        L_0x0044:
            return r3
    }

    /* renamed from: a */
    public final void m3999a() {
            r5 = this;
            int r0 = r5.f278i
            r1 = 0
            r2 = 0
        L_0x0004:
            r3 = -1
            if (r0 == r3) goto L_0x0023
            int r4 = r5.f270a
            if (r2 >= r4) goto L_0x0023
            a.e.a.c r3 = r5.f272c
            a.e.a.i[] r3 = r3.f288c
            int[] r4 = r5.f275f
            r4 = r4[r0]
            r3 = r3[r4]
            if (r3 == 0) goto L_0x001c
            a.e.a.b r4 = r5.f271b
            r3.m3921b(r4)
        L_0x001c:
            int[] r3 = r5.f276g
            r0 = r3[r0]
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0023:
            r5.f278i = r3
            r5.f279j = r3
            r5.f280k = r1
            r5.f270a = r1
            return
    }

    /* renamed from: a */
    void m3998a(float r5) {
            r4 = this;
            int r0 = r4.f278i
            r1 = 0
        L_0x0003:
            r2 = -1
            if (r0 == r2) goto L_0x0018
            int r2 = r4.f270a
            if (r1 >= r2) goto L_0x0018
            float[] r2 = r4.f277h
            r3 = r2[r0]
            float r3 = r3 / r5
            r2[r0] = r3
            int[] r2 = r4.f276g
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L_0x0003
        L_0x0018:
            return
    }

    /* renamed from: a */
    final void m3996a(p000a.p014e.p015a.C0083b r9, p000a.p014e.p015a.C0083b r10, boolean r11) {
            r8 = this;
            int r0 = r8.f278i
            r1 = 0
        L_0x0003:
            r2 = 0
        L_0x0004:
            r3 = -1
            if (r0 == r3) goto L_0x005b
            int r4 = r8.f270a
            if (r2 >= r4) goto L_0x005b
            int[] r4 = r8.f275f
            r4 = r4[r0]
            a.e.a.i r5 = r10.f281a
            int r6 = r5.f337b
            if (r4 != r6) goto L_0x0054
            float[] r2 = r8.f277h
            r0 = r2[r0]
            r8.m3989a(r5, r11)
            a.e.a.a r2 = r10.f284d
            int r4 = r2.f278i
            r5 = 0
        L_0x0021:
            if (r4 == r3) goto L_0x0041
            int r6 = r2.f270a
            if (r5 >= r6) goto L_0x0041
            a.e.a.c r6 = r8.f272c
            a.e.a.i[] r6 = r6.f288c
            int[] r7 = r2.f275f
            r7 = r7[r4]
            r6 = r6[r7]
            float[] r7 = r2.f277h
            r7 = r7[r4]
            float r7 = r7 * r0
            r8.m3991a(r6, r7, r11)
            int[] r6 = r2.f276g
            r4 = r6[r4]
            int r5 = r5 + 1
            goto L_0x0021
        L_0x0041:
            float r2 = r9.f282b
            float r3 = r10.f282b
            float r3 = r3 * r0
            float r2 = r2 + r3
            r9.f282b = r2
            if (r11 == 0) goto L_0x0051
            a.e.a.i r0 = r10.f281a
            r0.m3921b(r9)
        L_0x0051:
            int r0 = r8.f278i
            goto L_0x0003
        L_0x0054:
            int[] r3 = r8.f276g
            r0 = r3[r0]
            int r2 = r2 + 1
            goto L_0x0004
        L_0x005b:
            return
    }

    /* renamed from: a */
    void m3995a(p000a.p014e.p015a.C0083b r11, p000a.p014e.p015a.C0083b[] r12) {
            r10 = this;
            int r0 = r10.f278i
            r1 = 0
        L_0x0003:
            r2 = 0
        L_0x0004:
            r3 = -1
            if (r0 == r3) goto L_0x0066
            int r4 = r10.f270a
            if (r2 >= r4) goto L_0x0066
            a.e.a.c r4 = r10.f272c
            a.e.a.i[] r4 = r4.f288c
            int[] r5 = r10.f275f
            r5 = r5[r0]
            r4 = r4[r5]
            int r5 = r4.f338c
            if (r5 == r3) goto L_0x005f
            float[] r2 = r10.f277h
            r0 = r2[r0]
            r2 = 1
            r10.m3989a(r4, r2)
            int r4 = r4.f338c
            r4 = r12[r4]
            boolean r5 = r4.f285e
            if (r5 != 0) goto L_0x004e
            a.e.a.a r5 = r4.f284d
            int r6 = r5.f278i
            r7 = 0
        L_0x002e:
            if (r6 == r3) goto L_0x004e
            int r8 = r5.f270a
            if (r7 >= r8) goto L_0x004e
            a.e.a.c r8 = r10.f272c
            a.e.a.i[] r8 = r8.f288c
            int[] r9 = r5.f275f
            r9 = r9[r6]
            r8 = r8[r9]
            float[] r9 = r5.f277h
            r9 = r9[r6]
            float r9 = r9 * r0
            r10.m3991a(r8, r9, r2)
            int[] r8 = r5.f276g
            r6 = r8[r6]
            int r7 = r7 + 1
            goto L_0x002e
        L_0x004e:
            float r2 = r11.f282b
            float r3 = r4.f282b
            float r3 = r3 * r0
            float r2 = r2 + r3
            r11.f282b = r2
            a.e.a.i r0 = r4.f281a
            r0.m3921b(r11)
            int r0 = r10.f278i
            goto L_0x0003
        L_0x005f:
            int[] r3 = r10.f276g
            r0 = r3[r0]
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0066:
            return
    }

    /* renamed from: a */
    public final void m3992a(p000a.p014e.p015a.C0091i r10, float r11) {
            r9 = this;
            r0 = 1
            r1 = 0
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x000a
            r9.m3989a(r10, r0)
            return
        L_0x000a:
            int r1 = r9.f278i
            r2 = 0
            r3 = -1
            if (r1 != r3) goto L_0x0048
            r9.f278i = r2
            float[] r1 = r9.f277h
            int r2 = r9.f278i
            r1[r2] = r11
            int[] r11 = r9.f275f
            int r1 = r10.f337b
            r11[r2] = r1
            int[] r11 = r9.f276g
            r11[r2] = r3
            int r11 = r10.f345j
            int r11 = r11 + r0
            r10.f345j = r11
            a.e.a.b r11 = r9.f271b
            r10.m3924a(r11)
            int r10 = r9.f270a
            int r10 = r10 + r0
            r9.f270a = r10
            boolean r10 = r9.f280k
            if (r10 != 0) goto L_0x0047
            int r10 = r9.f279j
            int r10 = r10 + r0
            r9.f279j = r10
            int r10 = r9.f279j
            int[] r11 = r9.f275f
            int r1 = r11.length
            if (r10 < r1) goto L_0x0047
            r9.f280k = r0
            int r10 = r11.length
            int r10 = r10 - r0
            r9.f279j = r10
        L_0x0047:
            return
        L_0x0048:
            r4 = 0
            r5 = -1
        L_0x004a:
            if (r1 == r3) goto L_0x0069
            int r6 = r9.f270a
            if (r4 >= r6) goto L_0x0069
            int[] r6 = r9.f275f
            r7 = r6[r1]
            int r8 = r10.f337b
            if (r7 != r8) goto L_0x005d
            float[] r10 = r9.f277h
            r10[r1] = r11
            return
        L_0x005d:
            r6 = r6[r1]
            if (r6 >= r8) goto L_0x0062
            r5 = r1
        L_0x0062:
            int[] r6 = r9.f276g
            r1 = r6[r1]
            int r4 = r4 + 1
            goto L_0x004a
        L_0x0069:
            int r1 = r9.f279j
            int r4 = r1 + 1
            boolean r6 = r9.f280k
            if (r6 == 0) goto L_0x007a
            int[] r4 = r9.f275f
            r6 = r4[r1]
            if (r6 != r3) goto L_0x0078
            goto L_0x007b
        L_0x0078:
            int r1 = r4.length
            goto L_0x007b
        L_0x007a:
            r1 = r4
        L_0x007b:
            int[] r4 = r9.f275f
            int r6 = r4.length
            if (r1 < r6) goto L_0x0094
            int r6 = r9.f270a
            int r4 = r4.length
            if (r6 >= r4) goto L_0x0094
            r4 = 0
        L_0x0086:
            int[] r6 = r9.f275f
            int r7 = r6.length
            if (r4 >= r7) goto L_0x0094
            r6 = r6[r4]
            if (r6 != r3) goto L_0x0091
            r1 = r4
            goto L_0x0094
        L_0x0091:
            int r4 = r4 + 1
            goto L_0x0086
        L_0x0094:
            int[] r4 = r9.f275f
            int r6 = r4.length
            if (r1 < r6) goto L_0x00c4
            int r1 = r4.length
            int r4 = r9.f273d
            int r4 = r4 * 2
            r9.f273d = r4
            r9.f280k = r2
            int r2 = r1 + (-1)
            r9.f279j = r2
            float[] r2 = r9.f277h
            int r4 = r9.f273d
            float[] r2 = java.util.Arrays.copyOf(r2, r4)
            r9.f277h = r2
            int[] r2 = r9.f275f
            int r4 = r9.f273d
            int[] r2 = java.util.Arrays.copyOf(r2, r4)
            r9.f275f = r2
            int[] r2 = r9.f276g
            int r4 = r9.f273d
            int[] r2 = java.util.Arrays.copyOf(r2, r4)
            r9.f276g = r2
        L_0x00c4:
            int[] r2 = r9.f275f
            int r4 = r10.f337b
            r2[r1] = r4
            float[] r2 = r9.f277h
            r2[r1] = r11
            int[] r11 = r9.f276g
            if (r5 == r3) goto L_0x00d9
            r2 = r11[r5]
            r11[r1] = r2
            r11[r5] = r1
            goto L_0x00df
        L_0x00d9:
            int r2 = r9.f278i
            r11[r1] = r2
            r9.f278i = r1
        L_0x00df:
            int r11 = r10.f345j
            int r11 = r11 + r0
            r10.f345j = r11
            a.e.a.b r11 = r9.f271b
            r10.m3924a(r11)
            int r10 = r9.f270a
            int r10 = r10 + r0
            r9.f270a = r10
            boolean r10 = r9.f280k
            if (r10 != 0) goto L_0x00f7
            int r10 = r9.f279j
            int r10 = r10 + r0
            r9.f279j = r10
        L_0x00f7:
            int r10 = r9.f270a
            int[] r11 = r9.f275f
            int r11 = r11.length
            if (r10 < r11) goto L_0x0100
            r9.f280k = r0
        L_0x0100:
            int r10 = r9.f279j
            int[] r11 = r9.f275f
            int r1 = r11.length
            if (r10 < r1) goto L_0x010d
            r9.f280k = r0
            int r10 = r11.length
            int r10 = r10 - r0
            r9.f279j = r10
        L_0x010d:
            return
    }

    /* renamed from: a */
    final void m3991a(p000a.p014e.p015a.C0091i r11, float r12, boolean r13) {
            r10 = this;
            r0 = 0
            int r1 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r1 != 0) goto L_0x0006
            return
        L_0x0006:
            int r1 = r10.f278i
            r2 = 0
            r3 = -1
            r4 = 1
            if (r1 != r3) goto L_0x0045
            r10.f278i = r2
            float[] r13 = r10.f277h
            int r0 = r10.f278i
            r13[r0] = r12
            int[] r12 = r10.f275f
            int r13 = r11.f337b
            r12[r0] = r13
            int[] r12 = r10.f276g
            r12[r0] = r3
            int r12 = r11.f345j
            int r12 = r12 + r4
            r11.f345j = r12
            a.e.a.b r12 = r10.f271b
            r11.m3924a(r12)
            int r11 = r10.f270a
            int r11 = r11 + r4
            r10.f270a = r11
            boolean r11 = r10.f280k
            if (r11 != 0) goto L_0x0044
            int r11 = r10.f279j
            int r11 = r11 + r4
            r10.f279j = r11
            int r11 = r10.f279j
            int[] r12 = r10.f275f
            int r13 = r12.length
            if (r11 < r13) goto L_0x0044
            r10.f280k = r4
            int r11 = r12.length
            int r11 = r11 - r4
            r10.f279j = r11
        L_0x0044:
            return
        L_0x0045:
            r5 = 0
            r6 = -1
        L_0x0047:
            if (r1 == r3) goto L_0x0097
            int r7 = r10.f270a
            if (r5 >= r7) goto L_0x0097
            int[] r7 = r10.f275f
            r8 = r7[r1]
            int r9 = r11.f337b
            if (r8 != r9) goto L_0x008b
            float[] r2 = r10.f277h
            r3 = r2[r1]
            float r3 = r3 + r12
            r2[r1] = r3
            r12 = r2[r1]
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 != 0) goto L_0x008a
            int r12 = r10.f278i
            if (r1 != r12) goto L_0x006d
            int[] r12 = r10.f276g
            r12 = r12[r1]
            r10.f278i = r12
            goto L_0x0073
        L_0x006d:
            int[] r12 = r10.f276g
            r0 = r12[r1]
            r12[r6] = r0
        L_0x0073:
            if (r13 == 0) goto L_0x007a
            a.e.a.b r12 = r10.f271b
            r11.m3921b(r12)
        L_0x007a:
            boolean r12 = r10.f280k
            if (r12 == 0) goto L_0x0080
            r10.f279j = r1
        L_0x0080:
            int r12 = r11.f345j
            int r12 = r12 - r4
            r11.f345j = r12
            int r11 = r10.f270a
            int r11 = r11 - r4
            r10.f270a = r11
        L_0x008a:
            return
        L_0x008b:
            r7 = r7[r1]
            if (r7 >= r9) goto L_0x0090
            r6 = r1
        L_0x0090:
            int[] r7 = r10.f276g
            r1 = r7[r1]
            int r5 = r5 + 1
            goto L_0x0047
        L_0x0097:
            int r13 = r10.f279j
            int r0 = r13 + 1
            boolean r1 = r10.f280k
            if (r1 == 0) goto L_0x00a8
            int[] r0 = r10.f275f
            r1 = r0[r13]
            if (r1 != r3) goto L_0x00a6
            goto L_0x00a9
        L_0x00a6:
            int r13 = r0.length
            goto L_0x00a9
        L_0x00a8:
            r13 = r0
        L_0x00a9:
            int[] r0 = r10.f275f
            int r1 = r0.length
            if (r13 < r1) goto L_0x00c2
            int r1 = r10.f270a
            int r0 = r0.length
            if (r1 >= r0) goto L_0x00c2
            r0 = 0
        L_0x00b4:
            int[] r1 = r10.f275f
            int r5 = r1.length
            if (r0 >= r5) goto L_0x00c2
            r1 = r1[r0]
            if (r1 != r3) goto L_0x00bf
            r13 = r0
            goto L_0x00c2
        L_0x00bf:
            int r0 = r0 + 1
            goto L_0x00b4
        L_0x00c2:
            int[] r0 = r10.f275f
            int r1 = r0.length
            if (r13 < r1) goto L_0x00f2
            int r13 = r0.length
            int r0 = r10.f273d
            int r0 = r0 * 2
            r10.f273d = r0
            r10.f280k = r2
            int r0 = r13 + (-1)
            r10.f279j = r0
            float[] r0 = r10.f277h
            int r1 = r10.f273d
            float[] r0 = java.util.Arrays.copyOf(r0, r1)
            r10.f277h = r0
            int[] r0 = r10.f275f
            int r1 = r10.f273d
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r10.f275f = r0
            int[] r0 = r10.f276g
            int r1 = r10.f273d
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r10.f276g = r0
        L_0x00f2:
            int[] r0 = r10.f275f
            int r1 = r11.f337b
            r0[r13] = r1
            float[] r0 = r10.f277h
            r0[r13] = r12
            int[] r12 = r10.f276g
            if (r6 == r3) goto L_0x0107
            r0 = r12[r6]
            r12[r13] = r0
            r12[r6] = r13
            goto L_0x010d
        L_0x0107:
            int r0 = r10.f278i
            r12[r13] = r0
            r10.f278i = r13
        L_0x010d:
            int r12 = r11.f345j
            int r12 = r12 + r4
            r11.f345j = r12
            a.e.a.b r12 = r10.f271b
            r11.m3924a(r12)
            int r11 = r10.f270a
            int r11 = r11 + r4
            r10.f270a = r11
            boolean r11 = r10.f280k
            if (r11 != 0) goto L_0x0125
            int r11 = r10.f279j
            int r11 = r11 + r4
            r10.f279j = r11
        L_0x0125:
            int r11 = r10.f279j
            int[] r12 = r10.f275f
            int r13 = r12.length
            if (r11 < r13) goto L_0x0132
            r10.f280k = r4
            int r11 = r12.length
            int r11 = r11 - r4
            r10.f279j = r11
        L_0x0132:
            return
    }

    /* renamed from: a */
    final boolean m3993a(p000a.p014e.p015a.C0091i r7) {
            r6 = this;
            int r0 = r6.f278i
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L_0x0007
            return r2
        L_0x0007:
            r3 = 0
        L_0x0008:
            if (r0 == r1) goto L_0x001f
            int r4 = r6.f270a
            if (r3 >= r4) goto L_0x001f
            int[] r4 = r6.f275f
            r4 = r4[r0]
            int r5 = r7.f337b
            if (r4 != r5) goto L_0x0018
            r7 = 1
            return r7
        L_0x0018:
            int[] r4 = r6.f276g
            r0 = r4[r0]
            int r3 = r3 + 1
            goto L_0x0008
        L_0x001f:
            return r2
    }

    /* renamed from: b */
    final float m3986b(int r4) {
            r3 = this;
            int r0 = r3.f278i
            r1 = 0
        L_0x0003:
            r2 = -1
            if (r0 == r2) goto L_0x0018
            int r2 = r3.f270a
            if (r1 >= r2) goto L_0x0018
            if (r1 != r4) goto L_0x0011
            float[] r4 = r3.f277h
            r4 = r4[r0]
            return r4
        L_0x0011:
            int[] r2 = r3.f276g
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L_0x0003
        L_0x0018:
            r4 = 0
            return r4
    }

    /* renamed from: b */
    public final float m3985b(p000a.p014e.p015a.C0091i r5) {
            r4 = this;
            int r0 = r4.f278i
            r1 = 0
        L_0x0003:
            r2 = -1
            if (r0 == r2) goto L_0x001e
            int r2 = r4.f270a
            if (r1 >= r2) goto L_0x001e
            int[] r2 = r4.f275f
            r2 = r2[r0]
            int r3 = r5.f337b
            if (r2 != r3) goto L_0x0017
            float[] r5 = r4.f277h
            r5 = r5[r0]
            return r5
        L_0x0017:
            int[] r2 = r4.f276g
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L_0x0003
        L_0x001e:
            r5 = 0
            return r5
    }

    /* renamed from: b */
    void m3987b() {
            r5 = this;
            int r0 = r5.f278i
            r1 = 0
        L_0x0003:
            r2 = -1
            if (r0 == r2) goto L_0x001b
            int r2 = r5.f270a
            if (r1 >= r2) goto L_0x001b
            float[] r2 = r5.f277h
            r3 = r2[r0]
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r3 * r4
            r2[r0] = r3
            int[] r2 = r5.f276g
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L_0x0003
        L_0x001b:
            return
    }

    public java.lang.String toString() {
            r5 = this;
            int r0 = r5.f278i
            java.lang.String r1 = ""
            r2 = 0
        L_0x0005:
            r3 = -1
            if (r0 == r3) goto L_0x0055
            int r3 = r5.f270a
            if (r2 >= r3) goto L_0x0055
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " -> "
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            float[] r1 = r5.f277h
            r1 = r1[r0]
            r3.append(r1)
            java.lang.String r1 = " : "
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            a.e.a.c r1 = r5.f272c
            a.e.a.i[] r1 = r1.f288c
            int[] r4 = r5.f275f
            r4 = r4[r0]
            r1 = r1[r4]
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            int[] r3 = r5.f276g
            r0 = r3[r0]
            int r2 = r2 + 1
            goto L_0x0005
        L_0x0055:
            return r1
    }
}
