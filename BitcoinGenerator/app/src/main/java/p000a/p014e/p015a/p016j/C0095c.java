package p000a.p014e.p015a.p016j;

/* renamed from: a.e.a.j.c */
/* loaded from: classes.dex */
class C0095c {
    /* renamed from: a */
    static void m3905a(p000a.p014e.p015a.p016j.C0105g r7, p000a.p014e.p015a.C0086e r8, int r9) {
            r0 = 0
            if (r9 != 0) goto L_0x000a
            int r1 = r7.f481s0
            a.e.a.j.d[] r2 = r7.f484v0
            r3 = r1
            r1 = 0
            goto L_0x0012
        L_0x000a:
            r1 = 2
            int r2 = r7.f482t0
            a.e.a.j.d[] r3 = r7.f483u0
            r6 = r3
            r3 = r2
            r2 = r6
        L_0x0012:
            if (r0 >= r3) goto L_0x002c
            r4 = r2[r0]
            r4.m3903a()
            r5 = 4
            boolean r5 = r7.m3793t(r5)
            if (r5 == 0) goto L_0x0026
            boolean r5 = p000a.p014e.p015a.p016j.C0110k.m3768a(r7, r8, r9, r1, r4)
            if (r5 != 0) goto L_0x0029
        L_0x0026:
            m3904a(r7, r8, r9, r1, r4)
        L_0x0029:
            int r0 = r0 + 1
            goto L_0x0012
        L_0x002c:
            return
    }

    /* renamed from: a */
    static void m3904a(p000a.p014e.p015a.p016j.C0105g r36, p000a.p014e.p015a.C0086e r37, int r38, int r39, p000a.p014e.p015a.p016j.C0096d r40) {
            r0 = r36
            r9 = r37
            r1 = r40
            a.e.a.j.f r10 = r1.f355a
            a.e.a.j.f r11 = r1.f357c
            a.e.a.j.f r12 = r1.f356b
            a.e.a.j.f r13 = r1.f358d
            a.e.a.j.f r2 = r1.f359e
            float r3 = r1.f365k
            a.e.a.j.f r4 = r1.f360f
            a.e.a.j.f r4 = r1.f361g
            a.e.a.j.f$b[] r4 = r0.f402C
            r4 = r4[r38]
            a.e.a.j.f$b r5 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f464c
            r7 = 1
            if (r4 != r5) goto L_0x0021
            r4 = 1
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            r5 = 2
            if (r38 != 0) goto L_0x0038
            int r8 = r2.f435e0
            if (r8 != 0) goto L_0x002b
            r8 = 1
            goto L_0x002c
        L_0x002b:
            r8 = 0
        L_0x002c:
            int r14 = r2.f435e0
            if (r14 != r7) goto L_0x0032
            r14 = 1
            goto L_0x0033
        L_0x0032:
            r14 = 0
        L_0x0033:
            int r15 = r2.f435e0
            if (r15 != r5) goto L_0x004c
            goto L_0x004a
        L_0x0038:
            int r8 = r2.f437f0
            if (r8 != 0) goto L_0x003e
            r8 = 1
            goto L_0x003f
        L_0x003e:
            r8 = 0
        L_0x003f:
            int r14 = r2.f437f0
            if (r14 != r7) goto L_0x0045
            r14 = 1
            goto L_0x0046
        L_0x0045:
            r14 = 0
        L_0x0046:
            int r15 = r2.f437f0
            if (r15 != r5) goto L_0x004c
        L_0x004a:
            r5 = 1
            goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            r15 = r8
            r8 = r10
            r16 = r14
            r14 = r5
            r5 = 0
        L_0x0053:
            r21 = 0
            if (r5 != 0) goto L_0x0124
            a.e.a.j.e[] r7 = r8.f400A
            r7 = r7[r39]
            if (r4 != 0) goto L_0x0063
            if (r14 == 0) goto L_0x0060
            goto L_0x0063
        L_0x0060:
            r23 = 4
            goto L_0x0065
        L_0x0063:
            r23 = 1
        L_0x0065:
            int r24 = r7.m3895b()
            a.e.a.j.e r6 = r7.f375d
            if (r6 == 0) goto L_0x0075
            if (r8 == r10) goto L_0x0075
            int r6 = r6.m3895b()
            int r24 = r24 + r6
        L_0x0075:
            r6 = r24
            if (r14 == 0) goto L_0x0083
            if (r8 == r10) goto L_0x0083
            if (r8 == r12) goto L_0x0083
            r24 = r3
            r23 = r5
            r3 = 6
            goto L_0x0093
        L_0x0083:
            if (r15 == 0) goto L_0x008d
            if (r4 == 0) goto L_0x008d
            r24 = r3
            r23 = r5
            r3 = 4
            goto L_0x0093
        L_0x008d:
            r24 = r3
            r3 = r23
            r23 = r5
        L_0x0093:
            a.e.a.j.e r5 = r7.f375d
            if (r5 == 0) goto L_0x00bc
            if (r8 != r12) goto L_0x00a6
            r25 = r15
            a.e.a.i r15 = r7.f380i
            a.e.a.i r5 = r5.f380i
            r26 = r2
            r2 = 5
            r9.m3945b(r15, r5, r6, r2)
            goto L_0x00b2
        L_0x00a6:
            r26 = r2
            r25 = r15
            a.e.a.i r2 = r7.f380i
            a.e.a.i r5 = r5.f380i
            r15 = 6
            r9.m3945b(r2, r5, r6, r15)
        L_0x00b2:
            a.e.a.i r2 = r7.f380i
            a.e.a.j.e r5 = r7.f375d
            a.e.a.i r5 = r5.f380i
            r9.m3953a(r2, r5, r6, r3)
            goto L_0x00c0
        L_0x00bc:
            r26 = r2
            r25 = r15
        L_0x00c0:
            if (r4 == 0) goto L_0x00f5
            int r2 = r8.m3822r()
            r3 = 8
            if (r2 == r3) goto L_0x00e4
            a.e.a.j.f$b[] r2 = r8.f402C
            r2 = r2[r38]
            a.e.a.j.f$b r3 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f465d
            if (r2 != r3) goto L_0x00e4
            a.e.a.j.e[] r2 = r8.f400A
            int r3 = r39 + 1
            r3 = r2[r3]
            a.e.a.i r3 = r3.f380i
            r2 = r2[r39]
            a.e.a.i r2 = r2.f380i
            r5 = 5
            r6 = 0
            r9.m3945b(r3, r2, r6, r5)
            goto L_0x00e5
        L_0x00e4:
            r6 = 0
        L_0x00e5:
            a.e.a.j.e[] r2 = r8.f400A
            r2 = r2[r39]
            a.e.a.i r2 = r2.f380i
            a.e.a.j.e[] r3 = r0.f400A
            r3 = r3[r39]
            a.e.a.i r3 = r3.f380i
            r5 = 6
            r9.m3945b(r2, r3, r6, r5)
        L_0x00f5:
            a.e.a.j.e[] r2 = r8.f400A
            int r3 = r39 + 1
            r2 = r2[r3]
            a.e.a.j.e r2 = r2.f375d
            if (r2 == 0) goto L_0x0114
            a.e.a.j.f r2 = r2.f373b
            a.e.a.j.e[] r3 = r2.f400A
            r5 = r3[r39]
            a.e.a.j.e r5 = r5.f375d
            if (r5 == 0) goto L_0x0114
            r3 = r3[r39]
            a.e.a.j.e r3 = r3.f375d
            a.e.a.j.f r3 = r3.f373b
            if (r3 == r8) goto L_0x0112
            goto L_0x0114
        L_0x0112:
            r21 = r2
        L_0x0114:
            if (r21 == 0) goto L_0x011b
            r8 = r21
            r5 = r23
            goto L_0x011c
        L_0x011b:
            r5 = 1
        L_0x011c:
            r3 = r24
            r15 = r25
            r2 = r26
            goto L_0x0053
        L_0x0124:
            r26 = r2
            r24 = r3
            r25 = r15
            if (r13 == 0) goto L_0x014c
            a.e.a.j.e[] r2 = r11.f400A
            int r3 = r39 + 1
            r5 = r2[r3]
            a.e.a.j.e r5 = r5.f375d
            if (r5 == 0) goto L_0x014c
            a.e.a.j.e[] r5 = r13.f400A
            r5 = r5[r3]
            a.e.a.i r6 = r5.f380i
            r2 = r2[r3]
            a.e.a.j.e r2 = r2.f375d
            a.e.a.i r2 = r2.f380i
            int r3 = r5.m3895b()
            int r3 = -r3
            r7 = 5
            r9.m3940c(r6, r2, r3, r7)
            goto L_0x014d
        L_0x014c:
            r7 = 5
        L_0x014d:
            if (r4 == 0) goto L_0x0167
            a.e.a.j.e[] r0 = r0.f400A
            int r2 = r39 + 1
            r0 = r0[r2]
            a.e.a.i r0 = r0.f380i
            a.e.a.j.e[] r3 = r11.f400A
            r4 = r3[r2]
            a.e.a.i r4 = r4.f380i
            r2 = r3[r2]
            int r2 = r2.m3895b()
            r3 = 6
            r9.m3945b(r0, r4, r2, r3)
        L_0x0167:
            java.util.ArrayList<a.e.a.j.f> r0 = r1.f362h
            if (r0 == 0) goto L_0x0216
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L_0x0216
            boolean r4 = r1.f368n
            if (r4 == 0) goto L_0x017e
            boolean r4 = r1.f370p
            if (r4 != 0) goto L_0x017e
            int r4 = r1.f364j
            float r4 = (float) r4
            goto L_0x0180
        L_0x017e:
            r4 = r24
        L_0x0180:
            r5 = 0
            r8 = r21
            r6 = 0
            r28 = 0
        L_0x0186:
            if (r6 >= r2) goto L_0x0216
            java.lang.Object r15 = r0.get(r6)
            a.e.a.j.f r15 = (p000a.p014e.p015a.p016j.C0102f) r15
            float[] r3 = r15.f439g0
            r3 = r3[r38]
            int r23 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r23 >= 0) goto L_0x01b2
            boolean r3 = r1.f370p
            if (r3 == 0) goto L_0x01ad
            a.e.a.j.e[] r3 = r15.f400A
            int r15 = r39 + 1
            r15 = r3[r15]
            a.e.a.i r15 = r15.f380i
            r3 = r3[r39]
            a.e.a.i r3 = r3.f380i
            r5 = 0
            r7 = 4
            r9.m3953a(r15, r3, r5, r7)
            r7 = 6
            goto L_0x01c8
        L_0x01ad:
            r7 = 4
            r3 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            goto L_0x01b3
        L_0x01b2:
            r7 = 4
        L_0x01b3:
            int r20 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r20 != 0) goto L_0x01cd
            a.e.a.j.e[] r3 = r15.f400A
            int r15 = r39 + 1
            r15 = r3[r15]
            a.e.a.i r15 = r15.f380i
            r3 = r3[r39]
            a.e.a.i r3 = r3.f380i
            r5 = 0
            r7 = 6
            r9.m3953a(r15, r3, r5, r7)
        L_0x01c8:
            r24 = r0
            r22 = r2
            goto L_0x020b
        L_0x01cd:
            r5 = 0
            r7 = 6
            if (r8 == 0) goto L_0x0204
            a.e.a.j.e[] r8 = r8.f400A
            r5 = r8[r39]
            a.e.a.i r5 = r5.f380i
            int r22 = r39 + 1
            r8 = r8[r22]
            a.e.a.i r8 = r8.f380i
            a.e.a.j.e[] r7 = r15.f400A
            r24 = r0
            r0 = r7[r39]
            a.e.a.i r0 = r0.f380i
            r7 = r7[r22]
            a.e.a.i r7 = r7.f380i
            r22 = r2
            a.e.a.b r2 = r37.m3948b()
            r27 = r2
            r29 = r4
            r30 = r3
            r31 = r5
            r32 = r8
            r33 = r0
            r34 = r7
            r27.m3983a(r28, r29, r30, r31, r32, r33, r34)
            r9.m3961a(r2)
            goto L_0x0208
        L_0x0204:
            r24 = r0
            r22 = r2
        L_0x0208:
            r28 = r3
            r8 = r15
        L_0x020b:
            int r6 = r6 + 1
            r2 = r22
            r0 = r24
            r3 = 1
            r5 = 0
            r7 = 5
            goto L_0x0186
        L_0x0216:
            if (r12 == 0) goto L_0x0276
            if (r12 == r13) goto L_0x021c
            if (r14 == 0) goto L_0x0276
        L_0x021c:
            a.e.a.j.e[] r0 = r10.f400A
            r1 = r0[r39]
            a.e.a.j.e[] r2 = r11.f400A
            int r3 = r39 + 1
            r2 = r2[r3]
            r4 = r0[r39]
            a.e.a.j.e r4 = r4.f375d
            if (r4 == 0) goto L_0x0234
            r0 = r0[r39]
            a.e.a.j.e r0 = r0.f375d
            a.e.a.i r0 = r0.f380i
            r4 = r0
            goto L_0x0236
        L_0x0234:
            r4 = r21
        L_0x0236:
            a.e.a.j.e[] r0 = r11.f400A
            r5 = r0[r3]
            a.e.a.j.e r5 = r5.f375d
            if (r5 == 0) goto L_0x0246
            r0 = r0[r3]
            a.e.a.j.e r0 = r0.f375d
            a.e.a.i r0 = r0.f380i
            r5 = r0
            goto L_0x0248
        L_0x0246:
            r5 = r21
        L_0x0248:
            if (r12 != r13) goto L_0x0250
            a.e.a.j.e[] r0 = r12.f400A
            r1 = r0[r39]
            r2 = r0[r3]
        L_0x0250:
            if (r4 == 0) goto L_0x0493
            if (r5 == 0) goto L_0x0493
            r0 = r26
            if (r38 != 0) goto L_0x025b
            float r0 = r0.f421V
            goto L_0x025d
        L_0x025b:
            float r0 = r0.f422W
        L_0x025d:
            r6 = r0
            int r3 = r1.m3895b()
            int r7 = r2.m3895b()
            a.e.a.i r1 = r1.f380i
            a.e.a.i r8 = r2.f380i
            r10 = 5
            r0 = r37
            r2 = r4
            r4 = r6
            r6 = r8
            r8 = r10
            r0.m3954a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0493
        L_0x0276:
            if (r25 == 0) goto L_0x0366
            if (r12 == 0) goto L_0x0366
            int r0 = r1.f364j
            if (r0 <= 0) goto L_0x0285
            int r1 = r1.f363i
            if (r1 != r0) goto L_0x0285
            r17 = 1
            goto L_0x0287
        L_0x0285:
            r17 = 0
        L_0x0287:
            r14 = r12
            r15 = r14
        L_0x0289:
            if (r14 == 0) goto L_0x0493
            a.e.a.j.f[] r0 = r14.f443i0
            r0 = r0[r38]
            r8 = r0
        L_0x0290:
            if (r8 == 0) goto L_0x029f
            int r0 = r8.m3822r()
            r7 = 8
            if (r0 != r7) goto L_0x02a1
            a.e.a.j.f[] r0 = r8.f443i0
            r8 = r0[r38]
            goto L_0x0290
        L_0x029f:
            r7 = 8
        L_0x02a1:
            if (r8 != 0) goto L_0x02ae
            if (r14 != r13) goto L_0x02a6
            goto L_0x02ae
        L_0x02a6:
            r18 = r8
            r19 = 4
            r20 = 6
            goto L_0x0359
        L_0x02ae:
            a.e.a.j.e[] r0 = r14.f400A
            r0 = r0[r39]
            a.e.a.i r1 = r0.f380i
            a.e.a.j.e r2 = r0.f375d
            if (r2 == 0) goto L_0x02bb
            a.e.a.i r2 = r2.f380i
            goto L_0x02bd
        L_0x02bb:
            r2 = r21
        L_0x02bd:
            if (r15 == r14) goto L_0x02c8
            a.e.a.j.e[] r2 = r15.f400A
            int r3 = r39 + 1
            r2 = r2[r3]
        L_0x02c5:
            a.e.a.i r2 = r2.f380i
            goto L_0x02db
        L_0x02c8:
            if (r14 != r12) goto L_0x02db
            if (r15 != r14) goto L_0x02db
            a.e.a.j.e[] r2 = r10.f400A
            r3 = r2[r39]
            a.e.a.j.e r3 = r3.f375d
            if (r3 == 0) goto L_0x02d9
            r2 = r2[r39]
            a.e.a.j.e r2 = r2.f375d
            goto L_0x02c5
        L_0x02d9:
            r2 = r21
        L_0x02db:
            int r0 = r0.m3895b()
            a.e.a.j.e[] r3 = r14.f400A
            int r4 = r39 + 1
            r3 = r3[r4]
            int r3 = r3.m3895b()
            if (r8 == 0) goto L_0x02f8
            a.e.a.j.e[] r5 = r8.f400A
            r5 = r5[r39]
            a.e.a.i r6 = r5.f380i
            a.e.a.j.e[] r7 = r14.f400A
            r7 = r7[r4]
        L_0x02f5:
            a.e.a.i r7 = r7.f380i
            goto L_0x030a
        L_0x02f8:
            a.e.a.j.e[] r5 = r11.f400A
            r5 = r5[r4]
            a.e.a.j.e r5 = r5.f375d
            if (r5 == 0) goto L_0x0303
            a.e.a.i r6 = r5.f380i
            goto L_0x0305
        L_0x0303:
            r6 = r21
        L_0x0305:
            a.e.a.j.e[] r7 = r14.f400A
            r7 = r7[r4]
            goto L_0x02f5
        L_0x030a:
            if (r5 == 0) goto L_0x0311
            int r5 = r5.m3895b()
            int r3 = r3 + r5
        L_0x0311:
            if (r15 == 0) goto L_0x031c
            a.e.a.j.e[] r5 = r15.f400A
            r5 = r5[r4]
            int r5 = r5.m3895b()
            int r0 = r0 + r5
        L_0x031c:
            if (r1 == 0) goto L_0x02a6
            if (r2 == 0) goto L_0x02a6
            if (r6 == 0) goto L_0x02a6
            if (r7 == 0) goto L_0x02a6
            if (r14 != r12) goto L_0x032e
            a.e.a.j.e[] r0 = r12.f400A
            r0 = r0[r39]
            int r0 = r0.m3895b()
        L_0x032e:
            r5 = r0
            if (r14 != r13) goto L_0x033c
            a.e.a.j.e[] r0 = r13.f400A
            r0 = r0[r4]
            int r0 = r0.m3895b()
            r18 = r0
            goto L_0x033e
        L_0x033c:
            r18 = r3
        L_0x033e:
            if (r17 == 0) goto L_0x0343
            r22 = 6
            goto L_0x0345
        L_0x0343:
            r22 = 4
        L_0x0345:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r37
            r3 = r5
            r5 = r6
            r6 = r7
            r19 = 4
            r20 = 6
            r7 = r18
            r18 = r8
            r8 = r22
            r0.m3954a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0359:
            int r0 = r14.m3822r()
            r8 = 8
            if (r0 == r8) goto L_0x0362
            r15 = r14
        L_0x0362:
            r14 = r18
            goto L_0x0289
        L_0x0366:
            r8 = 8
            r19 = 4
            r20 = 6
            if (r16 == 0) goto L_0x0493
            if (r12 == 0) goto L_0x0493
            int r0 = r1.f364j
            if (r0 <= 0) goto L_0x037b
            int r1 = r1.f363i
            if (r1 != r0) goto L_0x037b
            r17 = 1
            goto L_0x037d
        L_0x037b:
            r17 = 0
        L_0x037d:
            r14 = r12
            r15 = r14
        L_0x037f:
            if (r14 == 0) goto L_0x0435
            a.e.a.j.f[] r0 = r14.f443i0
            r0 = r0[r38]
        L_0x0385:
            if (r0 == 0) goto L_0x0392
            int r1 = r0.m3822r()
            if (r1 != r8) goto L_0x0392
            a.e.a.j.f[] r0 = r0.f443i0
            r0 = r0[r38]
            goto L_0x0385
        L_0x0392:
            if (r14 == r12) goto L_0x0422
            if (r14 == r13) goto L_0x0422
            if (r0 == 0) goto L_0x0422
            if (r0 != r13) goto L_0x039d
            r7 = r21
            goto L_0x039e
        L_0x039d:
            r7 = r0
        L_0x039e:
            a.e.a.j.e[] r0 = r14.f400A
            r0 = r0[r39]
            a.e.a.i r1 = r0.f380i
            a.e.a.j.e r2 = r0.f375d
            if (r2 == 0) goto L_0x03aa
            a.e.a.i r2 = r2.f380i
        L_0x03aa:
            a.e.a.j.e[] r2 = r15.f400A
            int r3 = r39 + 1
            r2 = r2[r3]
            a.e.a.i r2 = r2.f380i
            int r0 = r0.m3895b()
            a.e.a.j.e[] r4 = r14.f400A
            r4 = r4[r3]
            int r4 = r4.m3895b()
            if (r7 == 0) goto L_0x03ce
            a.e.a.j.e[] r5 = r7.f400A
            r5 = r5[r39]
            a.e.a.i r6 = r5.f380i
            a.e.a.j.e r8 = r5.f375d
            if (r8 == 0) goto L_0x03cb
            goto L_0x03df
        L_0x03cb:
            r8 = r21
            goto L_0x03e1
        L_0x03ce:
            a.e.a.j.e[] r5 = r14.f400A
            r5 = r5[r3]
            a.e.a.j.e r5 = r5.f375d
            if (r5 == 0) goto L_0x03d9
            a.e.a.i r6 = r5.f380i
            goto L_0x03db
        L_0x03d9:
            r6 = r21
        L_0x03db:
            a.e.a.j.e[] r8 = r14.f400A
            r8 = r8[r3]
        L_0x03df:
            a.e.a.i r8 = r8.f380i
        L_0x03e1:
            if (r5 == 0) goto L_0x03e8
            int r5 = r5.m3895b()
            int r4 = r4 + r5
        L_0x03e8:
            r18 = r4
            if (r15 == 0) goto L_0x03f5
            a.e.a.j.e[] r4 = r15.f400A
            r3 = r4[r3]
            int r3 = r3.m3895b()
            int r0 = r0 + r3
        L_0x03f5:
            r3 = r0
            if (r17 == 0) goto L_0x03fb
            r22 = 6
            goto L_0x03fd
        L_0x03fb:
            r22 = 4
        L_0x03fd:
            if (r1 == 0) goto L_0x0419
            if (r2 == 0) goto L_0x0419
            if (r6 == 0) goto L_0x0419
            if (r8 == 0) goto L_0x0419
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r37
            r5 = r6
            r6 = r8
            r23 = r7
            r7 = r18
            r18 = r15
            r15 = 8
            r8 = r22
            r0.m3954a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x041f
        L_0x0419:
            r23 = r7
            r18 = r15
            r15 = 8
        L_0x041f:
            r0 = r23
            goto L_0x0426
        L_0x0422:
            r18 = r15
            r15 = 8
        L_0x0426:
            int r1 = r14.m3822r()
            if (r1 == r15) goto L_0x042d
            goto L_0x042f
        L_0x042d:
            r14 = r18
        L_0x042f:
            r15 = r14
            r8 = 8
            r14 = r0
            goto L_0x037f
        L_0x0435:
            a.e.a.j.e[] r0 = r12.f400A
            r0 = r0[r39]
            a.e.a.j.e[] r1 = r10.f400A
            r1 = r1[r39]
            a.e.a.j.e r1 = r1.f375d
            a.e.a.j.e[] r2 = r13.f400A
            int r3 = r39 + 1
            r10 = r2[r3]
            a.e.a.j.e[] r2 = r11.f400A
            r2 = r2[r3]
            a.e.a.j.e r14 = r2.f375d
            if (r1 == 0) goto L_0x0482
            if (r12 == r13) goto L_0x045c
            a.e.a.i r2 = r0.f380i
            a.e.a.i r1 = r1.f380i
            int r0 = r0.m3895b()
            r15 = 5
            r9.m3953a(r2, r1, r0, r15)
            goto L_0x0483
        L_0x045c:
            r15 = 5
            if (r14 == 0) goto L_0x0483
            a.e.a.i r2 = r0.f380i
            a.e.a.i r3 = r1.f380i
            int r4 = r0.m3895b()
            r5 = 1056964608(0x3f000000, float:0.5)
            a.e.a.i r6 = r10.f380i
            a.e.a.i r7 = r14.f380i
            int r8 = r10.m3895b()
            r17 = 5
            r0 = r37
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r17
            r0.m3954a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0483
        L_0x0482:
            r15 = 5
        L_0x0483:
            if (r14 == 0) goto L_0x0493
            if (r12 == r13) goto L_0x0493
            a.e.a.i r0 = r10.f380i
            a.e.a.i r1 = r14.f380i
            int r2 = r10.m3895b()
            int r2 = -r2
            r9.m3953a(r0, r1, r2, r15)
        L_0x0493:
            if (r25 != 0) goto L_0x0497
            if (r16 == 0) goto L_0x04f7
        L_0x0497:
            if (r12 == 0) goto L_0x04f7
            a.e.a.j.e[] r0 = r12.f400A
            r0 = r0[r39]
            a.e.a.j.e[] r1 = r13.f400A
            int r2 = r39 + 1
            r1 = r1[r2]
            a.e.a.j.e r3 = r0.f375d
            if (r3 == 0) goto L_0x04aa
            a.e.a.i r3 = r3.f380i
            goto L_0x04ac
        L_0x04aa:
            r3 = r21
        L_0x04ac:
            a.e.a.j.e r4 = r1.f375d
            if (r4 == 0) goto L_0x04b3
            a.e.a.i r4 = r4.f380i
            goto L_0x04b5
        L_0x04b3:
            r4 = r21
        L_0x04b5:
            if (r11 == r13) goto L_0x04c4
            a.e.a.j.e[] r4 = r11.f400A
            r4 = r4[r2]
            a.e.a.j.e r4 = r4.f375d
            if (r4 == 0) goto L_0x04c2
            a.e.a.i r4 = r4.f380i
            goto L_0x04c4
        L_0x04c2:
            r4 = r21
        L_0x04c4:
            r5 = r4
            if (r12 != r13) goto L_0x04d2
            a.e.a.j.e[] r0 = r12.f400A
            r1 = r0[r39]
            r0 = r0[r2]
            r35 = r1
            r1 = r0
            r0 = r35
        L_0x04d2:
            if (r3 == 0) goto L_0x04f7
            if (r5 == 0) goto L_0x04f7
            r4 = 1056964608(0x3f000000, float:0.5)
            int r6 = r0.m3895b()
            if (r13 != 0) goto L_0x04df
            goto L_0x04e0
        L_0x04df:
            r11 = r13
        L_0x04e0:
            a.e.a.j.e[] r7 = r11.f400A
            r2 = r7[r2]
            int r7 = r2.m3895b()
            a.e.a.i r2 = r0.f380i
            a.e.a.i r8 = r1.f380i
            r10 = 5
            r0 = r37
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.m3954a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x04f7:
            return
    }
}
