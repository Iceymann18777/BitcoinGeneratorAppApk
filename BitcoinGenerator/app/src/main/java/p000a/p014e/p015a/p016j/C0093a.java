package p000a.p014e.p015a.p016j;

/* renamed from: a.e.a.j.a */
/* loaded from: classes.dex */
public class C0093a {
    /* renamed from: a */
    private static int m3918a(p000a.p014e.p015a.p016j.C0102f r2) {
            a.e.a.j.f$b r0 = r2.m3838j()
            a.e.a.j.f$b r1 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f465d
            if (r0 != r1) goto L_0x0023
            int r0 = r2.f407H
            if (r0 != 0) goto L_0x0016
            int r0 = r2.m3840i()
            float r0 = (float) r0
            float r1 = r2.f406G
            float r0 = r0 * r1
            goto L_0x001e
        L_0x0016:
            int r0 = r2.m3840i()
            float r0 = (float) r0
            float r1 = r2.f406G
            float r0 = r0 / r1
        L_0x001e:
            int r0 = (int) r0
            r2.m3827o(r0)
            goto L_0x0048
        L_0x0023:
            a.e.a.j.f$b r0 = r2.m3824q()
            a.e.a.j.f$b r1 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f465d
            if (r0 != r1) goto L_0x0047
            int r0 = r2.f407H
            r1 = 1
            if (r0 != r1) goto L_0x003a
            int r0 = r2.m3820s()
            float r0 = (float) r0
            float r1 = r2.f406G
            float r0 = r0 * r1
            goto L_0x0042
        L_0x003a:
            int r0 = r2.m3820s()
            float r0 = (float) r0
            float r1 = r2.f406G
            float r0 = r0 / r1
        L_0x0042:
            int r0 = (int) r0
            r2.m3843g(r0)
            goto L_0x0048
        L_0x0047:
            r0 = -1
        L_0x0048:
            return r0
    }

    /* renamed from: a */
    private static int m3917a(p000a.p014e.p015a.p016j.C0102f r4, int r5) {
            int r0 = r5 * 2
            a.e.a.j.e[] r1 = r4.f400A
            r2 = r1[r0]
            int r0 = r0 + 1
            r0 = r1[r0]
            a.e.a.j.e r1 = r2.f375d
            if (r1 == 0) goto L_0x003b
            a.e.a.j.f r1 = r1.f373b
            a.e.a.j.f r3 = r4.f403D
            if (r1 != r3) goto L_0x003b
            a.e.a.j.e r1 = r0.f375d
            if (r1 == 0) goto L_0x003b
            a.e.a.j.f r1 = r1.f373b
            if (r1 != r3) goto L_0x003b
            int r1 = r3.m3851d(r5)
            if (r5 != 0) goto L_0x0025
            float r3 = r4.f421V
            goto L_0x0027
        L_0x0025:
            float r3 = r4.f422W
        L_0x0027:
            int r4 = r4.m3851d(r5)
            int r5 = r2.m3895b()
            int r1 = r1 - r5
            int r5 = r0.m3895b()
            int r1 = r1 - r5
            int r1 = r1 - r4
            float r4 = (float) r1
            float r4 = r4 * r3
            int r4 = (int) r4
            return r4
        L_0x003b:
            r4 = 0
            return r4
    }

    /* renamed from: a */
    private static int m3915a(p000a.p014e.p015a.p016j.C0102f r20, int r21, boolean r22, int r23) {
            r0 = r20
            r1 = r21
            r2 = r22
            boolean r3 = r0.f429b0
            r4 = 0
            if (r3 != 0) goto L_0x000c
            return r4
        L_0x000c:
            a.e.a.j.e r3 = r0.f457w
            a.e.a.j.e r3 = r3.f375d
            r5 = 1
            if (r3 == 0) goto L_0x0017
            if (r1 != r5) goto L_0x0017
            r3 = 1
            goto L_0x0018
        L_0x0017:
            r3 = 0
        L_0x0018:
            if (r2 == 0) goto L_0x002c
            int r6 = r20.m3857c()
            int r7 = r20.m3840i()
            int r8 = r20.m3857c()
            int r7 = r7 - r8
            int r8 = r1 * 2
            int r9 = r8 + 1
            goto L_0x003d
        L_0x002c:
            int r6 = r20.m3840i()
            int r7 = r20.m3857c()
            int r6 = r6 - r7
            int r7 = r20.m3857c()
            int r9 = r1 * 2
            int r8 = r9 + 1
        L_0x003d:
            a.e.a.j.e[] r10 = r0.f400A
            r11 = r10[r9]
            a.e.a.j.e r11 = r11.f375d
            if (r11 == 0) goto L_0x004f
            r10 = r10[r8]
            a.e.a.j.e r10 = r10.f375d
            if (r10 != 0) goto L_0x004f
            r10 = r8
            r8 = r9
            r9 = -1
            goto L_0x0051
        L_0x004f:
            r10 = r9
            r9 = 1
        L_0x0051:
            if (r3 == 0) goto L_0x0056
            int r11 = r23 - r6
            goto L_0x0058
        L_0x0056:
            r11 = r23
        L_0x0058:
            a.e.a.j.e[] r13 = r0.f400A
            r13 = r13[r8]
            int r13 = r13.m3895b()
            int r13 = r13 * r9
            int r14 = m3917a(r20, r21)
            int r13 = r13 + r14
            int r11 = r11 + r13
            if (r1 != 0) goto L_0x006f
            int r14 = r20.m3820s()
            goto L_0x0073
        L_0x006f:
            int r14 = r20.m3840i()
        L_0x0073:
            int r14 = r14 * r9
            a.e.a.j.e[] r15 = r0.f400A
            r15 = r15[r8]
            a.e.a.j.m r15 = r15.m3893d()
            java.util.HashSet<a.e.a.j.o> r15 = r15.f522a
            java.util.Iterator r15 = r15.iterator()
        L_0x0083:
            boolean r17 = r15.hasNext()
            if (r17 == 0) goto L_0x009e
            java.lang.Object r17 = r15.next()
            r12 = r17
            a.e.a.j.m r12 = (p000a.p014e.p015a.p016j.C0112m) r12
            a.e.a.j.e r12 = r12.f510c
            a.e.a.j.f r12 = r12.f373b
            int r12 = m3915a(r12, r1, r2, r11)
            int r4 = java.lang.Math.max(r4, r12)
            goto L_0x0083
        L_0x009e:
            a.e.a.j.e[] r12 = r0.f400A
            r12 = r12[r10]
            a.e.a.j.m r12 = r12.m3893d()
            java.util.HashSet<a.e.a.j.o> r12 = r12.f522a
            java.util.Iterator r12 = r12.iterator()
            r15 = 0
        L_0x00ad:
            boolean r17 = r12.hasNext()
            if (r17 == 0) goto L_0x00cf
            java.lang.Object r17 = r12.next()
            r5 = r17
            a.e.a.j.m r5 = (p000a.p014e.p015a.p016j.C0112m) r5
            a.e.a.j.e r5 = r5.f510c
            a.e.a.j.f r5 = r5.f373b
            r23 = r12
            int r12 = r14 + r11
            int r5 = m3915a(r5, r1, r2, r12)
            int r15 = java.lang.Math.max(r15, r5)
            r12 = r23
            r5 = 1
            goto L_0x00ad
        L_0x00cf:
            if (r3 == 0) goto L_0x00d5
            int r4 = r4 - r6
            int r15 = r15 + r7
        L_0x00d3:
            r5 = 1
            goto L_0x00e4
        L_0x00d5:
            if (r1 != 0) goto L_0x00dc
            int r5 = r20.m3820s()
            goto L_0x00e0
        L_0x00dc:
            int r5 = r20.m3840i()
        L_0x00e0:
            int r5 = r5 * r9
            int r15 = r15 + r5
            goto L_0x00d3
        L_0x00e4:
            if (r1 != r5) goto L_0x0156
            a.e.a.j.e r12 = r0.f457w
            a.e.a.j.m r12 = r12.m3893d()
            java.util.HashSet<a.e.a.j.o> r12 = r12.f522a
            java.util.Iterator r12 = r12.iterator()
            r18 = 0
        L_0x00f4:
            boolean r16 = r12.hasNext()
            if (r16 == 0) goto L_0x0137
            java.lang.Object r16 = r12.next()
            r23 = r12
            r12 = r16
            a.e.a.j.m r12 = (p000a.p014e.p015a.p016j.C0112m) r12
            if (r9 != r5) goto L_0x011b
            a.e.a.j.e r5 = r12.f510c
            a.e.a.j.f r5 = r5.f373b
            int r12 = r6 + r11
            int r5 = m3915a(r5, r1, r2, r12)
            r12 = r18
            int r5 = java.lang.Math.max(r12, r5)
            r18 = r5
            r17 = r10
            goto L_0x0131
        L_0x011b:
            r5 = r18
            a.e.a.j.e r12 = r12.f510c
            a.e.a.j.f r12 = r12.f373b
            int r16 = r7 * r9
            r17 = r10
            int r10 = r16 + r11
            int r10 = m3915a(r12, r1, r2, r10)
            int r5 = java.lang.Math.max(r5, r10)
            r18 = r5
        L_0x0131:
            r12 = r23
            r10 = r17
            r5 = 1
            goto L_0x00f4
        L_0x0137:
            r17 = r10
            r5 = r18
            a.e.a.j.e r10 = r0.f457w
            a.e.a.j.m r10 = r10.m3893d()
            java.util.HashSet<a.e.a.j.o> r10 = r10.f522a
            int r10 = r10.size()
            if (r10 <= 0) goto L_0x0154
            if (r3 != 0) goto L_0x0154
            r3 = 1
            if (r9 != r3) goto L_0x0151
            int r3 = r5 + r6
            goto L_0x0159
        L_0x0151:
            int r3 = r5 - r7
            goto L_0x0159
        L_0x0154:
            r3 = r5
            goto L_0x0159
        L_0x0156:
            r17 = r10
            r3 = 0
        L_0x0159:
            int r3 = java.lang.Math.max(r15, r3)
            int r3 = java.lang.Math.max(r4, r3)
            int r13 = r13 + r3
            int r3 = r11 + r14
            r4 = -1
            if (r9 != r4) goto L_0x0168
            goto L_0x016d
        L_0x0168:
            r19 = r11
            r11 = r3
            r3 = r19
        L_0x016d:
            if (r2 == 0) goto L_0x0176
            p000a.p014e.p015a.p016j.C0110k.m3769a(r0, r1, r3)
            r0.m3876a(r3, r11, r1)
            goto L_0x017e
        L_0x0176:
            a.e.a.j.h r2 = r0.f450p
            r2.m3788a(r0, r1)
            r0.m3850d(r3, r1)
        L_0x017e:
            a.e.a.j.f$b r2 = r20.m3855c(r21)
            a.e.a.j.f$b r3 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f465d
            if (r2 != r3) goto L_0x0192
            float r2 = r0.f406G
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0192
            a.e.a.j.h r2 = r0.f450p
            r2.m3788a(r0, r1)
        L_0x0192:
            a.e.a.j.e[] r2 = r0.f400A
            r3 = r2[r8]
            a.e.a.j.e r3 = r3.f375d
            if (r3 == 0) goto L_0x01bb
            r2 = r2[r17]
            a.e.a.j.e r2 = r2.f375d
            if (r2 == 0) goto L_0x01bb
            a.e.a.j.f r2 = r20.m3836k()
            a.e.a.j.e[] r3 = r0.f400A
            r4 = r3[r8]
            a.e.a.j.e r4 = r4.f375d
            a.e.a.j.f r4 = r4.f373b
            if (r4 != r2) goto L_0x01bb
            r3 = r3[r17]
            a.e.a.j.e r3 = r3.f375d
            a.e.a.j.f r3 = r3.f373b
            if (r3 != r2) goto L_0x01bb
            a.e.a.j.h r2 = r0.f450p
            r2.m3788a(r0, r1)
        L_0x01bb:
            return r13
    }

    /* renamed from: a */
    private static int m3910a(p000a.p014e.p015a.p016j.C0106h r10, int r11) {
            int r0 = r11 * 2
            java.util.List r1 = r10.m3790a(r11)
            int r2 = r1.size()
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x000d:
            if (r4 >= r2) goto L_0x003a
            java.lang.Object r6 = r1.get(r4)
            a.e.a.j.f r6 = (p000a.p014e.p015a.p016j.C0102f) r6
            a.e.a.j.e[] r7 = r6.f400A
            int r8 = r0 + 1
            r9 = r7[r8]
            a.e.a.j.e r9 = r9.f375d
            if (r9 == 0) goto L_0x002e
            r9 = r7[r0]
            a.e.a.j.e r9 = r9.f375d
            if (r9 == 0) goto L_0x002c
            r7 = r7[r8]
            a.e.a.j.e r7 = r7.f375d
            if (r7 == 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r7 = 0
            goto L_0x002f
        L_0x002e:
            r7 = 1
        L_0x002f:
            int r6 = m3915a(r6, r11, r7, r3)
            int r5 = java.lang.Math.max(r5, r6)
            int r4 = r4 + 1
            goto L_0x000d
        L_0x003a:
            int[] r10 = r10.f493e
            r10[r11] = r5
            return r5
    }

    /* renamed from: a */
    private static void m3919a(p000a.p014e.p015a.p016j.C0097e r3) {
            a.e.a.j.m r0 = r3.m3893d()
            a.e.a.j.e r1 = r3.f375d
            if (r1 == 0) goto L_0x0013
            a.e.a.j.e r2 = r1.f375d
            if (r2 == r3) goto L_0x0013
            a.e.a.j.m r3 = r1.m3893d()
            r3.m3752a(r0)
        L_0x0013:
            return
    }

    /* renamed from: a */
    private static void m3916a(p000a.p014e.p015a.p016j.C0102f r6, int r7, int r8) {
            int r0 = r7 * 2
            a.e.a.j.e[] r1 = r6.f400A
            r2 = r1[r0]
            int r3 = r0 + 1
            r1 = r1[r3]
            a.e.a.j.e r3 = r2.f375d
            r4 = 1
            if (r3 == 0) goto L_0x0015
            a.e.a.j.e r3 = r1.f375d
            if (r3 == 0) goto L_0x0015
            r3 = 1
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            if (r3 == 0) goto L_0x0025
            int r8 = m3917a(r6, r7)
            int r0 = r2.m3895b()
            int r8 = r8 + r0
            p000a.p014e.p015a.p016j.C0110k.m3769a(r6, r7, r8)
            return
        L_0x0025:
            float r3 = r6.f406G
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0060
            a.e.a.j.f$b r3 = r6.m3855c(r7)
            a.e.a.j.f$b r5 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f465d
            if (r3 != r5) goto L_0x0060
            int r8 = m3918a(r6)
            a.e.a.j.e[] r3 = r6.f400A
            r0 = r3[r0]
            a.e.a.j.m r0 = r0.m3893d()
            float r0 = r0.f514g
            int r0 = (int) r0
            int r3 = r0 + r8
            a.e.a.j.m r5 = r1.m3893d()
            a.e.a.j.m r2 = r2.m3893d()
            r5.f513f = r2
            a.e.a.j.m r2 = r1.m3893d()
            float r8 = (float) r8
            r2.f514g = r8
            a.e.a.j.m r8 = r1.m3893d()
            r8.f523b = r4
            r6.m3876a(r0, r3, r7)
            return
        L_0x0060:
            int r0 = r6.m3848e(r7)
            int r8 = r8 - r0
            int r0 = r6.m3851d(r7)
            int r0 = r8 - r0
            r6.m3876a(r0, r8, r7)
            p000a.p014e.p015a.p016j.C0110k.m3769a(r6, r7, r0)
            return
    }

    /* renamed from: a */
    public static void m3912a(p000a.p014e.p015a.p016j.C0105g r10) {
            int r0 = r10.m3810M()
            r1 = 32
            r0 = r0 & r1
            if (r0 == r1) goto L_0x000d
            m3908b(r10)
            return
        L_0x000d:
            r0 = 1
            r10.f471D0 = r0
            r1 = 0
            r10.f486x0 = r1
            r10.f487y0 = r1
            r10.f488z0 = r1
            java.util.ArrayList<a.e.a.j.f> r2 = r10.f534k0
            java.util.List<a.e.a.j.h> r3 = r10.f485w0
            a.e.a.j.f$b r4 = r10.m3838j()
            a.e.a.j.f$b r5 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f464c
            if (r4 != r5) goto L_0x0025
            r4 = 1
            goto L_0x0026
        L_0x0025:
            r4 = 0
        L_0x0026:
            a.e.a.j.f$b r5 = r10.m3824q()
            a.e.a.j.f$b r6 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f464c
            if (r5 != r6) goto L_0x0030
            r5 = 1
            goto L_0x0031
        L_0x0030:
            r5 = 0
        L_0x0031:
            if (r4 != 0) goto L_0x0038
            if (r5 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r6 = 0
            goto L_0x0039
        L_0x0038:
            r6 = 1
        L_0x0039:
            r3.clear()
            java.util.Iterator r7 = r2.iterator()
        L_0x0040:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0055
            java.lang.Object r8 = r7.next()
            a.e.a.j.f r8 = (p000a.p014e.p015a.p016j.C0102f) r8
            r9 = 0
            r8.f450p = r9
            r8.f433d0 = r1
            r8.mo3882F()
            goto L_0x0040
        L_0x0055:
            java.util.Iterator r2 = r2.iterator()
        L_0x0059:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0075
            java.lang.Object r7 = r2.next()
            a.e.a.j.f r7 = (p000a.p014e.p015a.p016j.C0102f) r7
            a.e.a.j.h r8 = r7.f450p
            if (r8 != 0) goto L_0x0059
            boolean r7 = m3913a(r7, r3, r6)
            if (r7 != 0) goto L_0x0059
            m3908b(r10)
            r10.f471D0 = r1
            return
        L_0x0075:
            java.util.Iterator r2 = r3.iterator()
            r6 = 0
            r7 = 0
        L_0x007b:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x0098
            java.lang.Object r8 = r2.next()
            a.e.a.j.h r8 = (p000a.p014e.p015a.p016j.C0106h) r8
            int r9 = m3910a(r8, r1)
            int r6 = java.lang.Math.max(r6, r9)
            int r8 = m3910a(r8, r0)
            int r7 = java.lang.Math.max(r7, r8)
            goto L_0x007b
        L_0x0098:
            if (r4 == 0) goto L_0x00a8
            a.e.a.j.f$b r2 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f463b
            r10.m3871a(r2)
            r10.m3827o(r6)
            r10.f486x0 = r0
            r10.f487y0 = r0
            r10.f468A0 = r6
        L_0x00a8:
            if (r5 == 0) goto L_0x00b8
            a.e.a.j.f$b r2 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f463b
            r10.m3860b(r2)
            r10.m3843g(r7)
            r10.f486x0 = r0
            r10.f488z0 = r0
            r10.f469B0 = r7
        L_0x00b8:
            int r2 = r10.m3820s()
            m3909a(r3, r1, r2)
            int r10 = r10.m3840i()
            m3909a(r3, r0, r10)
            return
    }

    /* renamed from: a */
    private static void m3911a(p000a.p014e.p015a.p016j.C0105g r1, p000a.p014e.p015a.p016j.C0102f r2, p000a.p014e.p015a.p016j.C0106h r3) {
            r0 = 0
            r3.f492d = r0
            r1.f471D0 = r0
            r2.f429b0 = r0
            return
    }

    /* renamed from: a */
    public static void m3909a(java.util.List<p000a.p014e.p015a.p016j.C0106h> r5, int r6, int r7) {
            int r0 = r5.size()
            r1 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x002c
            java.lang.Object r2 = r5.get(r1)
            a.e.a.j.h r2 = (p000a.p014e.p015a.p016j.C0106h) r2
            java.util.Set r2 = r2.m3785b(r6)
            java.util.Iterator r2 = r2.iterator()
        L_0x0015:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0029
            java.lang.Object r3 = r2.next()
            a.e.a.j.f r3 = (p000a.p014e.p015a.p016j.C0102f) r3
            boolean r4 = r3.f429b0
            if (r4 == 0) goto L_0x0015
            m3916a(r3, r6, r7)
            goto L_0x0015
        L_0x0029:
            int r1 = r1 + 1
            goto L_0x0005
        L_0x002c:
            return
    }

    /* renamed from: a */
    private static boolean m3914a(p000a.p014e.p015a.p016j.C0102f r8, p000a.p014e.p015a.p016j.C0106h r9, java.util.List<p000a.p014e.p015a.p016j.C0106h> r10, boolean r11) {
            r0 = 1
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            r8.f431c0 = r1
            a.e.a.j.f r2 = r8.m3836k()
            a.e.a.j.g r2 = (p000a.p014e.p015a.p016j.C0105g) r2
            a.e.a.j.h r3 = r8.f450p
            if (r3 != 0) goto L_0x01f0
            r8.f429b0 = r0
            java.util.List<a.e.a.j.f> r3 = r9.f489a
            r3.add(r8)
            r8.f450p = r9
            a.e.a.j.e r3 = r8.f453s
            a.e.a.j.e r3 = r3.f375d
            if (r3 != 0) goto L_0x0044
            a.e.a.j.e r3 = r8.f455u
            a.e.a.j.e r3 = r3.f375d
            if (r3 != 0) goto L_0x0044
            a.e.a.j.e r3 = r8.f454t
            a.e.a.j.e r3 = r3.f375d
            if (r3 != 0) goto L_0x0044
            a.e.a.j.e r3 = r8.f456v
            a.e.a.j.e r3 = r3.f375d
            if (r3 != 0) goto L_0x0044
            a.e.a.j.e r3 = r8.f457w
            a.e.a.j.e r3 = r3.f375d
            if (r3 != 0) goto L_0x0044
            a.e.a.j.e r3 = r8.f460z
            a.e.a.j.e r3 = r3.f375d
            if (r3 != 0) goto L_0x0044
            m3911a(r2, r8, r9)
            if (r11 == 0) goto L_0x0044
            return r1
        L_0x0044:
            a.e.a.j.e r3 = r8.f454t
            a.e.a.j.e r3 = r3.f375d
            if (r3 == 0) goto L_0x0077
            a.e.a.j.e r3 = r8.f456v
            a.e.a.j.e r3 = r3.f375d
            if (r3 == 0) goto L_0x0077
            a.e.a.j.f$b r3 = r2.m3824q()
            a.e.a.j.f$b r4 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f464c
            if (r11 == 0) goto L_0x005c
            m3911a(r2, r8, r9)
            return r1
        L_0x005c:
            a.e.a.j.e r3 = r8.f454t
            a.e.a.j.e r3 = r3.f375d
            a.e.a.j.f r3 = r3.f373b
            a.e.a.j.f r4 = r8.m3836k()
            if (r3 != r4) goto L_0x0074
            a.e.a.j.e r3 = r8.f456v
            a.e.a.j.e r3 = r3.f375d
            a.e.a.j.f r3 = r3.f373b
            a.e.a.j.f r4 = r8.m3836k()
            if (r3 == r4) goto L_0x0077
        L_0x0074:
            m3911a(r2, r8, r9)
        L_0x0077:
            a.e.a.j.e r3 = r8.f453s
            a.e.a.j.e r3 = r3.f375d
            if (r3 == 0) goto L_0x00aa
            a.e.a.j.e r3 = r8.f455u
            a.e.a.j.e r3 = r3.f375d
            if (r3 == 0) goto L_0x00aa
            a.e.a.j.f$b r3 = r2.m3838j()
            a.e.a.j.f$b r4 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f464c
            if (r11 == 0) goto L_0x008f
            m3911a(r2, r8, r9)
            return r1
        L_0x008f:
            a.e.a.j.e r3 = r8.f453s
            a.e.a.j.e r3 = r3.f375d
            a.e.a.j.f r3 = r3.f373b
            a.e.a.j.f r4 = r8.m3836k()
            if (r3 != r4) goto L_0x00a7
            a.e.a.j.e r3 = r8.f455u
            a.e.a.j.e r3 = r3.f375d
            a.e.a.j.f r3 = r3.f373b
            a.e.a.j.f r4 = r8.m3836k()
            if (r3 == r4) goto L_0x00aa
        L_0x00a7:
            m3911a(r2, r8, r9)
        L_0x00aa:
            a.e.a.j.f$b r3 = r8.m3838j()
            a.e.a.j.f$b r4 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f465d
            if (r3 != r4) goto L_0x00b4
            r3 = 1
            goto L_0x00b5
        L_0x00b4:
            r3 = 0
        L_0x00b5:
            a.e.a.j.f$b r4 = r8.m3824q()
            a.e.a.j.f$b r5 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f465d
            if (r4 != r5) goto L_0x00bf
            r4 = 1
            goto L_0x00c0
        L_0x00bf:
            r4 = 0
        L_0x00c0:
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x00ce
            float r3 = r8.f406G
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x00ce
            m3918a(r8)
            goto L_0x00e4
        L_0x00ce:
            a.e.a.j.f$b r3 = r8.m3838j()
            a.e.a.j.f$b r4 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f465d
            if (r3 == r4) goto L_0x00de
            a.e.a.j.f$b r3 = r8.m3824q()
            a.e.a.j.f$b r4 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f465d
            if (r3 != r4) goto L_0x00e4
        L_0x00de:
            m3911a(r2, r8, r9)
            if (r11 == 0) goto L_0x00e4
            return r1
        L_0x00e4:
            a.e.a.j.e r3 = r8.f453s
            a.e.a.j.e r3 = r3.f375d
            if (r3 != 0) goto L_0x00f0
            a.e.a.j.e r3 = r8.f455u
            a.e.a.j.e r3 = r3.f375d
            if (r3 == 0) goto L_0x012a
        L_0x00f0:
            a.e.a.j.e r3 = r8.f453s
            a.e.a.j.e r3 = r3.f375d
            if (r3 == 0) goto L_0x0102
            a.e.a.j.f r3 = r3.f373b
            a.e.a.j.f r4 = r8.f403D
            if (r3 != r4) goto L_0x0102
            a.e.a.j.e r3 = r8.f455u
            a.e.a.j.e r3 = r3.f375d
            if (r3 == 0) goto L_0x012a
        L_0x0102:
            a.e.a.j.e r3 = r8.f455u
            a.e.a.j.e r3 = r3.f375d
            if (r3 == 0) goto L_0x0114
            a.e.a.j.f r3 = r3.f373b
            a.e.a.j.f r4 = r8.f403D
            if (r3 != r4) goto L_0x0114
            a.e.a.j.e r3 = r8.f453s
            a.e.a.j.e r3 = r3.f375d
            if (r3 == 0) goto L_0x012a
        L_0x0114:
            a.e.a.j.e r3 = r8.f453s
            a.e.a.j.e r3 = r3.f375d
            if (r3 == 0) goto L_0x013d
            a.e.a.j.f r3 = r3.f373b
            a.e.a.j.f r4 = r8.f403D
            if (r3 != r4) goto L_0x013d
            a.e.a.j.e r3 = r8.f455u
            a.e.a.j.e r3 = r3.f375d
            if (r3 == 0) goto L_0x013d
            a.e.a.j.f r3 = r3.f373b
            if (r3 != r4) goto L_0x013d
        L_0x012a:
            a.e.a.j.e r3 = r8.f460z
            a.e.a.j.e r3 = r3.f375d
            if (r3 != 0) goto L_0x013d
            boolean r3 = r8 instanceof p000a.p014e.p015a.p016j.C0107i
            if (r3 != 0) goto L_0x013d
            boolean r3 = r8 instanceof p000a.p014e.p015a.p016j.C0109j
            if (r3 != 0) goto L_0x013d
            java.util.List<a.e.a.j.f> r3 = r9.f494f
            r3.add(r8)
        L_0x013d:
            a.e.a.j.e r3 = r8.f454t
            a.e.a.j.e r3 = r3.f375d
            if (r3 != 0) goto L_0x0149
            a.e.a.j.e r3 = r8.f456v
            a.e.a.j.e r3 = r3.f375d
            if (r3 == 0) goto L_0x0183
        L_0x0149:
            a.e.a.j.e r3 = r8.f454t
            a.e.a.j.e r3 = r3.f375d
            if (r3 == 0) goto L_0x015b
            a.e.a.j.f r3 = r3.f373b
            a.e.a.j.f r4 = r8.f403D
            if (r3 != r4) goto L_0x015b
            a.e.a.j.e r3 = r8.f456v
            a.e.a.j.e r3 = r3.f375d
            if (r3 == 0) goto L_0x0183
        L_0x015b:
            a.e.a.j.e r3 = r8.f456v
            a.e.a.j.e r3 = r3.f375d
            if (r3 == 0) goto L_0x016d
            a.e.a.j.f r3 = r3.f373b
            a.e.a.j.f r4 = r8.f403D
            if (r3 != r4) goto L_0x016d
            a.e.a.j.e r3 = r8.f454t
            a.e.a.j.e r3 = r3.f375d
            if (r3 == 0) goto L_0x0183
        L_0x016d:
            a.e.a.j.e r3 = r8.f454t
            a.e.a.j.e r3 = r3.f375d
            if (r3 == 0) goto L_0x019c
            a.e.a.j.f r3 = r3.f373b
            a.e.a.j.f r4 = r8.f403D
            if (r3 != r4) goto L_0x019c
            a.e.a.j.e r3 = r8.f456v
            a.e.a.j.e r3 = r3.f375d
            if (r3 == 0) goto L_0x019c
            a.e.a.j.f r3 = r3.f373b
            if (r3 != r4) goto L_0x019c
        L_0x0183:
            a.e.a.j.e r3 = r8.f460z
            a.e.a.j.e r3 = r3.f375d
            if (r3 != 0) goto L_0x019c
            a.e.a.j.e r3 = r8.f457w
            a.e.a.j.e r3 = r3.f375d
            if (r3 != 0) goto L_0x019c
            boolean r3 = r8 instanceof p000a.p014e.p015a.p016j.C0107i
            if (r3 != 0) goto L_0x019c
            boolean r3 = r8 instanceof p000a.p014e.p015a.p016j.C0109j
            if (r3 != 0) goto L_0x019c
            java.util.List<a.e.a.j.f> r3 = r9.f495g
            r3.add(r8)
        L_0x019c:
            boolean r3 = r8 instanceof p000a.p014e.p015a.p016j.C0109j
            if (r3 == 0) goto L_0x01bc
            m3911a(r2, r8, r9)
            if (r11 == 0) goto L_0x01a6
            return r1
        L_0x01a6:
            r3 = r8
            a.e.a.j.j r3 = (p000a.p014e.p015a.p016j.C0109j) r3
            r4 = 0
        L_0x01aa:
            int r5 = r3.f508l0
            if (r4 >= r5) goto L_0x01bc
            a.e.a.j.f[] r5 = r3.f507k0
            r5 = r5[r4]
            boolean r5 = m3914a(r5, r9, r10, r11)
            if (r5 != 0) goto L_0x01b9
            return r1
        L_0x01b9:
            int r4 = r4 + 1
            goto L_0x01aa
        L_0x01bc:
            a.e.a.j.e[] r3 = r8.f400A
            int r3 = r3.length
            r4 = 0
        L_0x01c0:
            if (r4 >= r3) goto L_0x01ef
            a.e.a.j.e[] r5 = r8.f400A
            r5 = r5[r4]
            a.e.a.j.e r6 = r5.f375d
            if (r6 == 0) goto L_0x01ec
            a.e.a.j.f r6 = r6.f373b
            a.e.a.j.f r7 = r8.m3836k()
            if (r6 == r7) goto L_0x01ec
            a.e.a.j.e$d r6 = r5.f374c
            a.e.a.j.e$d r7 = p000a.p014e.p015a.p016j.C0097e.EnumC0101d.f395h
            if (r6 != r7) goto L_0x01de
            m3911a(r2, r8, r9)
            if (r11 == 0) goto L_0x01e1
            return r1
        L_0x01de:
            m3919a(r5)
        L_0x01e1:
            a.e.a.j.e r5 = r5.f375d
            a.e.a.j.f r5 = r5.f373b
            boolean r5 = m3914a(r5, r9, r10, r11)
            if (r5 != 0) goto L_0x01ec
            return r1
        L_0x01ec:
            int r4 = r4 + 1
            goto L_0x01c0
        L_0x01ef:
            return r0
        L_0x01f0:
            if (r3 == r9) goto L_0x022f
            java.util.List<a.e.a.j.f> r11 = r9.f489a
            java.util.List<a.e.a.j.f> r2 = r3.f489a
            r11.addAll(r2)
            java.util.List<a.e.a.j.f> r11 = r9.f494f
            a.e.a.j.h r2 = r8.f450p
            java.util.List<a.e.a.j.f> r2 = r2.f494f
            r11.addAll(r2)
            java.util.List<a.e.a.j.f> r11 = r9.f495g
            a.e.a.j.h r2 = r8.f450p
            java.util.List<a.e.a.j.f> r2 = r2.f495g
            r11.addAll(r2)
            a.e.a.j.h r11 = r8.f450p
            boolean r11 = r11.f492d
            if (r11 != 0) goto L_0x0213
            r9.f492d = r1
        L_0x0213:
            a.e.a.j.h r11 = r8.f450p
            r10.remove(r11)
            a.e.a.j.h r8 = r8.f450p
            java.util.List<a.e.a.j.f> r8 = r8.f489a
            java.util.Iterator r8 = r8.iterator()
        L_0x0220:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x022f
            java.lang.Object r10 = r8.next()
            a.e.a.j.f r10 = (p000a.p014e.p015a.p016j.C0102f) r10
            r10.f450p = r9
            goto L_0x0220
        L_0x022f:
            return r0
    }

    /* renamed from: a */
    private static boolean m3913a(p000a.p014e.p015a.p016j.C0102f r3, java.util.List<p000a.p014e.p015a.p016j.C0106h> r4, boolean r5) {
            a.e.a.j.h r0 = new a.e.a.j.h
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 1
            r0.<init>(r1, r2)
            r4.add(r0)
            boolean r3 = m3914a(r3, r0, r4, r5)
            return r3
    }

    /* renamed from: b */
    private static void m3908b(p000a.p014e.p015a.p016j.C0105g r2) {
            java.util.List<a.e.a.j.h> r0 = r2.f485w0
            r0.clear()
            java.util.List<a.e.a.j.h> r0 = r2.f485w0
            a.e.a.j.h r1 = new a.e.a.j.h
            java.util.ArrayList<a.e.a.j.f> r2 = r2.f534k0
            r1.<init>(r2)
            r2 = 0
            r0.add(r2, r1)
            return
    }
}
