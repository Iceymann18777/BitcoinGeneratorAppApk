package p000a.p018g.p021e;

/* renamed from: a.g.e.b */
/* loaded from: classes.dex */
public class C0142b {

    /* renamed from: a.g.e.b$a */
    /* loaded from: classes.dex */
    private static class C0143a {

        /* renamed from: a */
        int f556a;

        /* renamed from: b */
        boolean f557b;

        C0143a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: a.g.e.b$b */
    /* loaded from: classes.dex */
    public static class C0144b {

        /* renamed from: a */
        public char f558a;

        /* renamed from: b */
        public float[] f559b;

        C0144b(char r1, float[] r2) {
                r0 = this;
                r0.<init>()
                r0.f558a = r1
                r0.f559b = r2
                return
        }

        C0144b(p000a.p018g.p021e.C0142b.C0144b r3) {
                r2 = this;
                r2.<init>()
                char r0 = r3.f558a
                r2.f558a = r0
                float[] r3 = r3.f559b
                int r0 = r3.length
                r1 = 0
                float[] r3 = p000a.p018g.p021e.C0142b.m3663a(r3, r1, r0)
                r2.f559b = r3
                return
        }

        /* renamed from: a */
        private static void m3656a(android.graphics.Path r48, double r49, double r51, double r53, double r55, double r57, double r59, double r61, double r63, double r65) {
                r0 = r53
                r2 = 4616189618054758400(0x4010000000000000, double:4.0)
                double r4 = r65 * r2
                r6 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
                double r4 = r4 / r6
                double r4 = java.lang.Math.abs(r4)
                double r4 = java.lang.Math.ceil(r4)
                int r4 = (int) r4
                double r5 = java.lang.Math.cos(r61)
                double r7 = java.lang.Math.sin(r61)
                double r9 = java.lang.Math.cos(r63)
                double r11 = java.lang.Math.sin(r63)
                double r13 = -r0
                double r15 = r13 * r5
                double r17 = r15 * r11
                double r19 = r55 * r7
                double r21 = r19 * r9
                double r17 = r17 - r21
                double r13 = r13 * r7
                double r11 = r11 * r13
                double r21 = r55 * r5
                double r9 = r9 * r21
                double r11 = r11 + r9
                double r9 = (double) r4
                java.lang.Double.isNaN(r9)
                double r9 = r65 / r9
                r23 = 0
                r23 = r57
                r27 = r59
                r29 = r11
                r25 = r17
                r11 = 0
                r17 = r63
            L_0x004c:
                if (r11 >= r4) goto L_0x00f0
                double r31 = r17 + r9
                double r33 = java.lang.Math.sin(r31)
                double r35 = java.lang.Math.cos(r31)
                double r37 = r0 * r5
                double r37 = r37 * r35
                double r37 = r49 + r37
                double r39 = r19 * r33
                double r2 = r37 - r39
                double r37 = r0 * r7
                double r37 = r37 * r35
                double r37 = r51 + r37
                double r39 = r21 * r33
                double r0 = r37 + r39
                double r37 = r15 * r33
                double r39 = r19 * r35
                double r37 = r37 - r39
                double r33 = r33 * r13
                double r35 = r35 * r21
                double r33 = r33 + r35
                double r17 = r31 - r17
                r35 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r35 = r17 / r35
                double r35 = java.lang.Math.tan(r35)
                double r17 = java.lang.Math.sin(r17)
                r39 = 4613937818241073152(0x4008000000000000, double:3.0)
                double r43 = r35 * r39
                double r43 = r43 * r35
                r35 = 4616189618054758400(0x4010000000000000, double:4.0)
                double r43 = r43 + r35
                double r41 = java.lang.Math.sqrt(r43)
                r43 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r41 = r41 - r43
                double r17 = r17 * r41
                double r17 = r17 / r39
                double r25 = r25 * r17
                r12 = r4
                r39 = r5
                double r4 = r23 + r25
                double r29 = r29 * r17
                r61 = r7
                double r6 = r27 + r29
                double r23 = r17 * r37
                r55 = r9
                double r8 = r2 - r23
                double r17 = r17 * r33
                r57 = r12
                r23 = r13
                double r12 = r0 - r17
                r10 = 0
                r14 = r48
                r14.rLineTo(r10, r10)
                float r4 = (float) r4
                float r5 = (float) r6
                float r6 = (float) r8
                float r7 = (float) r12
                float r8 = (float) r2
                float r9 = (float) r0
                r41 = r48
                r42 = r4
                r43 = r5
                r44 = r6
                r45 = r7
                r46 = r8
                r47 = r9
                r41.cubicTo(r42, r43, r44, r45, r46, r47)
                int r11 = r11 + 1
                r9 = r55
                r4 = r57
                r7 = r61
                r27 = r0
                r13 = r23
                r17 = r31
                r29 = r33
                r25 = r37
                r5 = r39
                r0 = r53
                r23 = r2
                r2 = r35
                goto L_0x004c
            L_0x00f0:
                return
        }

        /* renamed from: a */
        private static void m3655a(android.graphics.Path r41, float r42, float r43, float r44, float r45, float r46, float r47, float r48, boolean r49, boolean r50) {
                r1 = r42
                r3 = r44
                r0 = r46
                r2 = r47
                r7 = r48
                r9 = r50
                double r4 = (double) r7
                double r19 = java.lang.Math.toRadians(r4)
                double r4 = java.lang.Math.cos(r19)
                double r10 = java.lang.Math.sin(r19)
                double r13 = (double) r1
                java.lang.Double.isNaN(r13)
                double r15 = r13 * r4
                r6 = r43
                r17 = r13
                double r13 = (double) r6
                java.lang.Double.isNaN(r13)
                double r21 = r13 * r10
                double r15 = r15 + r21
                double r6 = (double) r0
                java.lang.Double.isNaN(r6)
                double r15 = r15 / r6
                float r8 = -r1
                double r8 = (double) r8
                java.lang.Double.isNaN(r8)
                double r8 = r8 * r10
                java.lang.Double.isNaN(r13)
                double r21 = r13 * r4
                double r8 = r8 + r21
                r21 = r13
                double r13 = (double) r2
                java.lang.Double.isNaN(r13)
                double r8 = r8 / r13
                double r1 = (double) r3
                java.lang.Double.isNaN(r1)
                double r1 = r1 * r4
                r12 = r45
                r23 = r8
                double r8 = (double) r12
                java.lang.Double.isNaN(r8)
                double r25 = r8 * r10
                double r1 = r1 + r25
                java.lang.Double.isNaN(r6)
                double r1 = r1 / r6
                float r12 = -r3
                r25 = r6
                double r6 = (double) r12
                java.lang.Double.isNaN(r6)
                double r6 = r6 * r10
                java.lang.Double.isNaN(r8)
                double r8 = r8 * r4
                double r6 = r6 + r8
                java.lang.Double.isNaN(r13)
                double r6 = r6 / r13
                double r8 = r15 - r1
                double r27 = r23 - r6
                double r29 = r15 + r1
                r31 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r29 = r29 / r31
                double r33 = r23 + r6
                double r33 = r33 / r31
                double r31 = r8 * r8
                double r35 = r27 * r27
                r37 = r10
                double r10 = r31 + r35
                java.lang.String r12 = "PathParser"
                r31 = 0
                int r35 = (r10 > r31 ? 1 : (r10 == r31 ? 0 : -1))
                if (r35 != 0) goto L_0x0092
                java.lang.String r0 = " Points are coincident"
                android.util.Log.w(r12, r0)
                return
            L_0x0092:
                r35 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r35 = r35 / r10
                r39 = 4598175219545276416(0x3fd0000000000000, double:0.25)
                double r35 = r35 - r39
                int r39 = (r35 > r31 ? 1 : (r35 == r31 ? 0 : -1))
                if (r39 >= 0) goto L_0x00d5
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Points are too far apart "
                r1.append(r2)
                r1.append(r10)
                java.lang.String r1 = r1.toString()
                android.util.Log.w(r12, r1)
                double r1 = java.lang.Math.sqrt(r10)
                r4 = 4611685973391391630(0x3ffffff583a53b8e, double:1.99999)
                double r1 = r1 / r4
                float r1 = (float) r1
                float r5 = r0 * r1
                float r6 = r47 * r1
                r0 = r41
                r1 = r42
                r2 = r43
                r3 = r44
                r4 = r45
                r7 = r48
                r8 = r49
                r9 = r50
                m3655a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
            L_0x00d5:
                double r10 = java.lang.Math.sqrt(r35)
                double r8 = r8 * r10
                double r10 = r10 * r27
                r0 = r49
                r3 = r50
                if (r0 != r3) goto L_0x00e8
                double r29 = r29 - r10
                double r33 = r33 + r8
                goto L_0x00ec
            L_0x00e8:
                double r29 = r29 + r10
                double r33 = r33 - r8
            L_0x00ec:
                double r8 = r23 - r33
                double r10 = r15 - r29
                double r23 = java.lang.Math.atan2(r8, r10)
                double r6 = r6 - r33
                double r1 = r1 - r29
                double r0 = java.lang.Math.atan2(r6, r1)
                double r0 = r0 - r23
                int r2 = (r0 > r31 ? 1 : (r0 == r31 ? 0 : -1))
                if (r2 < 0) goto L_0x0104
                r2 = 1
                goto L_0x0105
            L_0x0104:
                r2 = 0
            L_0x0105:
                if (r3 == r2) goto L_0x0113
                r2 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
                int r6 = (r0 > r31 ? 1 : (r0 == r31 ? 0 : -1))
                if (r6 <= 0) goto L_0x0112
                double r0 = r0 - r2
                goto L_0x0113
            L_0x0112:
                double r0 = r0 + r2
            L_0x0113:
                java.lang.Double.isNaN(r25)
                double r29 = r29 * r25
                java.lang.Double.isNaN(r13)
                double r33 = r33 * r13
                double r2 = r29 * r4
                double r10 = r33 * r37
                double r7 = r2 - r10
                r2 = r25
                double r29 = r29 * r37
                double r33 = r33 * r4
                double r9 = r29 + r33
                r6 = r41
                r11 = r2
                r2 = r17
                r4 = r21
                r15 = r2
                r17 = r4
                r21 = r23
                r23 = r0
                m3656a(r6, r7, r9, r11, r13, r15, r17, r19, r21, r23)
                return
        }

        /* renamed from: a */
        private static void m3654a(android.graphics.Path r24, float[] r25, char r26, char r27, float[] r28) {
                r10 = r24
                r11 = r27
                r12 = r28
                r13 = 0
                r0 = r25[r13]
                r14 = 1
                r1 = r25[r14]
                r15 = 2
                r2 = r25[r15]
                r16 = 3
                r3 = r25[r16]
                r17 = 4
                r4 = r25[r17]
                r18 = 5
                r5 = r25[r18]
                switch(r11) {
                    case 65: goto L_0x0036;
                    case 67: goto L_0x0032;
                    case 72: goto L_0x002f;
                    case 76: goto L_0x001e;
                    case 77: goto L_0x001e;
                    case 81: goto L_0x002c;
                    case 83: goto L_0x002c;
                    case 84: goto L_0x001e;
                    case 86: goto L_0x002f;
                    case 90: goto L_0x0021;
                    case 97: goto L_0x0036;
                    case 99: goto L_0x0032;
                    case 104: goto L_0x002f;
                    case 108: goto L_0x001e;
                    case 109: goto L_0x001e;
                    case 113: goto L_0x002c;
                    case 115: goto L_0x002c;
                    case 116: goto L_0x001e;
                    case 118: goto L_0x002f;
                    case 122: goto L_0x0021;
                    default: goto L_0x001e;
                }
            L_0x001e:
                r19 = 2
                goto L_0x0039
            L_0x0021:
                r24.close()
                r10.moveTo(r4, r5)
                r0 = r4
                r2 = r0
                r1 = r5
                r3 = r1
                goto L_0x001e
            L_0x002c:
                r19 = 4
                goto L_0x0039
            L_0x002f:
                r19 = 1
                goto L_0x0039
            L_0x0032:
                r6 = 6
                r19 = 6
                goto L_0x0039
            L_0x0036:
                r6 = 7
                r19 = 7
            L_0x0039:
                r8 = r0
                r7 = r1
                r20 = r4
                r21 = r5
                r9 = 0
                r0 = r26
            L_0x0042:
                int r1 = r12.length
                if (r9 >= r1) goto L_0x030a
                r1 = 65
                if (r11 == r1) goto L_0x02c4
                r1 = 67
                if (r11 == r1) goto L_0x0299
                r5 = 72
                if (r11 == r5) goto L_0x028b
                r5 = 81
                if (r11 == r5) goto L_0x026a
                r6 = 86
                if (r11 == r6) goto L_0x025c
                r6 = 97
                if (r11 == r6) goto L_0x020f
                r6 = 99
                if (r11 == r6) goto L_0x01e2
                r15 = 104(0x68, float:1.46E-43)
                if (r11 == r15) goto L_0x01d5
                r15 = 113(0x71, float:1.58E-43)
                if (r11 == r15) goto L_0x01b6
                r14 = 118(0x76, float:1.65E-43)
                if (r11 == r14) goto L_0x01aa
                r14 = 76
                if (r11 == r14) goto L_0x0199
                r14 = 77
                if (r11 == r14) goto L_0x0179
                r14 = 83
                r22 = 1073741824(0x40000000, float:2.0)
                if (r11 == r14) goto L_0x0148
                r13 = 84
                if (r11 == r13) goto L_0x0121
                r4 = 108(0x6c, float:1.51E-43)
                if (r11 == r4) goto L_0x010e
                r4 = 109(0x6d, float:1.53E-43)
                if (r11 == r4) goto L_0x00f1
                r4 = 115(0x73, float:1.61E-43)
                if (r11 == r4) goto L_0x00bb
                r1 = 116(0x74, float:1.63E-43)
                if (r11 == r1) goto L_0x0093
            L_0x008f:
                r22 = r9
                goto L_0x0300
            L_0x0093:
                if (r0 == r15) goto L_0x00a1
                r1 = 116(0x74, float:1.63E-43)
                if (r0 == r1) goto L_0x00a1
                if (r0 == r5) goto L_0x00a1
                if (r0 != r13) goto L_0x009e
                goto L_0x00a1
            L_0x009e:
                r0 = 0
                r4 = 0
                goto L_0x00a5
            L_0x00a1:
                float r4 = r8 - r2
                float r0 = r7 - r3
            L_0x00a5:
                int r1 = r9 + 0
                r2 = r12[r1]
                int r3 = r9 + 1
                r5 = r12[r3]
                r10.rQuadTo(r4, r0, r2, r5)
                float r4 = r4 + r8
                float r0 = r0 + r7
                r1 = r12[r1]
                float r8 = r8 + r1
                r1 = r12[r3]
                float r7 = r7 + r1
                r3 = r0
                r2 = r4
                goto L_0x008f
            L_0x00bb:
                if (r0 == r6) goto L_0x00c9
                r4 = 115(0x73, float:1.61E-43)
                if (r0 == r4) goto L_0x00c9
                if (r0 == r1) goto L_0x00c9
                if (r0 != r14) goto L_0x00c6
                goto L_0x00c9
            L_0x00c6:
                r1 = 0
                r2 = 0
                goto L_0x00cf
            L_0x00c9:
                float r0 = r8 - r2
                float r1 = r7 - r3
                r2 = r1
                r1 = r0
            L_0x00cf:
                int r13 = r9 + 0
                r3 = r12[r13]
                int r14 = r9 + 1
                r4 = r12[r14]
                int r15 = r9 + 2
                r5 = r12[r15]
                int r22 = r9 + 3
                r6 = r12[r22]
                r0 = r24
                r0.rCubicTo(r1, r2, r3, r4, r5, r6)
                r0 = r12[r13]
                float r0 = r0 + r8
                r1 = r12[r14]
                float r1 = r1 + r7
                r2 = r12[r15]
                float r8 = r8 + r2
                r2 = r12[r22]
                goto L_0x020a
            L_0x00f1:
                int r0 = r9 + 0
                r1 = r12[r0]
                float r8 = r8 + r1
                int r1 = r9 + 1
                r4 = r12[r1]
                float r7 = r7 + r4
                if (r9 <= 0) goto L_0x0105
                r0 = r12[r0]
                r1 = r12[r1]
                r10.rLineTo(r0, r1)
                goto L_0x008f
            L_0x0105:
                r0 = r12[r0]
                r1 = r12[r1]
                r10.rMoveTo(r0, r1)
                goto L_0x0193
            L_0x010e:
                int r0 = r9 + 0
                r1 = r12[r0]
                int r4 = r9 + 1
                r5 = r12[r4]
                r10.rLineTo(r1, r5)
                r0 = r12[r0]
                float r8 = r8 + r0
                r0 = r12[r4]
            L_0x011e:
                float r7 = r7 + r0
                goto L_0x008f
            L_0x0121:
                if (r0 == r15) goto L_0x012b
                r1 = 116(0x74, float:1.63E-43)
                if (r0 == r1) goto L_0x012b
                if (r0 == r5) goto L_0x012b
                if (r0 != r13) goto L_0x0131
            L_0x012b:
                float r8 = r8 * r22
                float r8 = r8 - r2
                float r7 = r7 * r22
                float r7 = r7 - r3
            L_0x0131:
                int r0 = r9 + 0
                r1 = r12[r0]
                int r2 = r9 + 1
                r3 = r12[r2]
                r10.quadTo(r8, r7, r1, r3)
                r0 = r12[r0]
                r1 = r12[r2]
                r3 = r7
                r2 = r8
                r22 = r9
                r8 = r0
                r7 = r1
                goto L_0x0300
            L_0x0148:
                if (r0 == r6) goto L_0x0152
                r4 = 115(0x73, float:1.61E-43)
                if (r0 == r4) goto L_0x0152
                if (r0 == r1) goto L_0x0152
                if (r0 != r14) goto L_0x0158
            L_0x0152:
                float r8 = r8 * r22
                float r8 = r8 - r2
                float r7 = r7 * r22
                float r7 = r7 - r3
            L_0x0158:
                r2 = r7
                r1 = r8
                int r7 = r9 + 0
                r3 = r12[r7]
                int r8 = r9 + 1
                r4 = r12[r8]
                int r13 = r9 + 2
                r5 = r12[r13]
                int r14 = r9 + 3
                r6 = r12[r14]
                r0 = r24
                r0.cubicTo(r1, r2, r3, r4, r5, r6)
                r0 = r12[r7]
                r1 = r12[r8]
                r8 = r12[r13]
                r7 = r12[r14]
                goto L_0x020b
            L_0x0179:
                int r0 = r9 + 0
                r8 = r12[r0]
                int r1 = r9 + 1
                r7 = r12[r1]
                if (r9 <= 0) goto L_0x018c
                r0 = r12[r0]
                r1 = r12[r1]
                r10.lineTo(r0, r1)
                goto L_0x008f
            L_0x018c:
                r0 = r12[r0]
                r1 = r12[r1]
                r10.moveTo(r0, r1)
            L_0x0193:
                r21 = r7
                r20 = r8
                goto L_0x008f
            L_0x0199:
                int r0 = r9 + 0
                r1 = r12[r0]
                int r4 = r9 + 1
                r5 = r12[r4]
                r10.lineTo(r1, r5)
                r8 = r12[r0]
                r7 = r12[r4]
                goto L_0x008f
            L_0x01aa:
                int r0 = r9 + 0
                r1 = r12[r0]
                r4 = 0
                r10.rLineTo(r4, r1)
                r0 = r12[r0]
                goto L_0x011e
            L_0x01b6:
                int r0 = r9 + 0
                r1 = r12[r0]
                int r2 = r9 + 1
                r3 = r12[r2]
                int r4 = r9 + 2
                r5 = r12[r4]
                int r6 = r9 + 3
                r13 = r12[r6]
                r10.rQuadTo(r1, r3, r5, r13)
                r0 = r12[r0]
                float r0 = r0 + r8
                r1 = r12[r2]
                float r1 = r1 + r7
                r2 = r12[r4]
                float r8 = r8 + r2
                r2 = r12[r6]
                goto L_0x020a
            L_0x01d5:
                int r0 = r9 + 0
                r1 = r12[r0]
                r4 = 0
                r10.rLineTo(r1, r4)
                r0 = r12[r0]
                float r8 = r8 + r0
                goto L_0x008f
            L_0x01e2:
                int r0 = r9 + 0
                r1 = r12[r0]
                int r0 = r9 + 1
                r2 = r12[r0]
                int r13 = r9 + 2
                r3 = r12[r13]
                int r14 = r9 + 3
                r4 = r12[r14]
                int r15 = r9 + 4
                r5 = r12[r15]
                int r22 = r9 + 5
                r6 = r12[r22]
                r0 = r24
                r0.rCubicTo(r1, r2, r3, r4, r5, r6)
                r0 = r12[r13]
                float r0 = r0 + r8
                r1 = r12[r14]
                float r1 = r1 + r7
                r2 = r12[r15]
                float r8 = r8 + r2
                r2 = r12[r22]
            L_0x020a:
                float r7 = r7 + r2
            L_0x020b:
                r2 = r0
                r3 = r1
                goto L_0x008f
            L_0x020f:
                int r13 = r9 + 5
                r0 = r12[r13]
                float r3 = r0 + r8
                int r14 = r9 + 6
                r0 = r12[r14]
                float r4 = r0 + r7
                int r0 = r9 + 0
                r5 = r12[r0]
                int r0 = r9 + 1
                r6 = r12[r0]
                int r0 = r9 + 2
                r15 = r12[r0]
                int r0 = r9 + 3
                r0 = r12[r0]
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L_0x0233
                r22 = 1
                goto L_0x0235
            L_0x0233:
                r22 = 0
            L_0x0235:
                int r0 = r9 + 4
                r0 = r12[r0]
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L_0x0240
                r23 = 1
                goto L_0x0242
            L_0x0240:
                r23 = 0
            L_0x0242:
                r0 = r24
                r1 = r8
                r2 = r7
                r11 = r7
                r7 = r15
                r15 = r8
                r8 = r22
                r22 = r9
                r9 = r23
                m3655a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r0 = r12[r13]
                float r8 = r15 + r0
                r0 = r12[r14]
                float r7 = r11 + r0
                goto L_0x02fe
            L_0x025c:
                r15 = r8
                r22 = r9
                int r9 = r22 + 0
                r0 = r12[r9]
                r10.lineTo(r15, r0)
                r7 = r12[r9]
                goto L_0x0300
            L_0x026a:
                r22 = r9
                int r9 = r22 + 0
                r0 = r12[r9]
                int r1 = r22 + 1
                r2 = r12[r1]
                int r3 = r22 + 2
                r4 = r12[r3]
                int r5 = r22 + 3
                r6 = r12[r5]
                r10.quadTo(r0, r2, r4, r6)
                r0 = r12[r9]
                r1 = r12[r1]
                r8 = r12[r3]
                r7 = r12[r5]
                r2 = r0
                r3 = r1
                goto L_0x0300
            L_0x028b:
                r11 = r7
                r22 = r9
                int r9 = r22 + 0
                r0 = r12[r9]
                r10.lineTo(r0, r11)
                r8 = r12[r9]
                goto L_0x0300
            L_0x0299:
                r22 = r9
                int r9 = r22 + 0
                r1 = r12[r9]
                int r9 = r22 + 1
                r2 = r12[r9]
                int r9 = r22 + 2
                r3 = r12[r9]
                int r7 = r22 + 3
                r4 = r12[r7]
                int r8 = r22 + 4
                r5 = r12[r8]
                int r11 = r22 + 5
                r6 = r12[r11]
                r0 = r24
                r0.cubicTo(r1, r2, r3, r4, r5, r6)
                r8 = r12[r8]
                r0 = r12[r11]
                r1 = r12[r9]
                r2 = r12[r7]
                r7 = r0
                r3 = r2
                r2 = r1
                goto L_0x0300
            L_0x02c4:
                r11 = r7
                r15 = r8
                r22 = r9
                int r13 = r22 + 5
                r3 = r12[r13]
                int r14 = r22 + 6
                r4 = r12[r14]
                int r9 = r22 + 0
                r5 = r12[r9]
                int r9 = r22 + 1
                r6 = r12[r9]
                int r9 = r22 + 2
                r7 = r12[r9]
                int r9 = r22 + 3
                r0 = r12[r9]
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L_0x02e7
                r8 = 1
                goto L_0x02e8
            L_0x02e7:
                r8 = 0
            L_0x02e8:
                int r9 = r22 + 4
                r0 = r12[r9]
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L_0x02f2
                r9 = 1
                goto L_0x02f3
            L_0x02f2:
                r9 = 0
            L_0x02f3:
                r0 = r24
                r1 = r15
                r2 = r11
                m3655a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r8 = r12[r13]
                r7 = r12[r14]
            L_0x02fe:
                r3 = r7
                r2 = r8
            L_0x0300:
                int r9 = r22 + r19
                r0 = r27
                r11 = r0
                r13 = 0
                r14 = 1
                r15 = 2
                goto L_0x0042
            L_0x030a:
                r11 = r7
                r15 = r8
                r0 = 0
                r25[r0] = r15
                r0 = 1
                r25[r0] = r11
                r0 = 2
                r25[r0] = r2
                r25[r16] = r3
                r25[r17] = r20
                r25[r18] = r21
                return
        }

        /* renamed from: a */
        public static void m3653a(p000a.p018g.p021e.C0142b.C0144b[] r5, android.graphics.Path r6) {
                r0 = 6
                float[] r0 = new float[r0]
                r1 = 109(0x6d, float:1.53E-43)
                r2 = 0
            L_0x0006:
                int r3 = r5.length
                if (r2 >= r3) goto L_0x001b
                r3 = r5[r2]
                char r3 = r3.f558a
                r4 = r5[r2]
                float[] r4 = r4.f559b
                m3654a(r6, r0, r1, r3, r4)
                r1 = r5[r2]
                char r1 = r1.f558a
                int r2 = r2 + 1
                goto L_0x0006
            L_0x001b:
                return
        }

        /* renamed from: a */
        public void m3657a(p000a.p018g.p021e.C0142b.C0144b r5, p000a.p018g.p021e.C0142b.C0144b r6, float r7) {
                r4 = this;
                r0 = 0
            L_0x0001:
                float[] r1 = r5.f559b
                int r2 = r1.length
                if (r0 >= r2) goto L_0x001b
                float[] r2 = r4.f559b
                r1 = r1[r0]
                r3 = 1065353216(0x3f800000, float:1.0)
                float r3 = r3 - r7
                float r1 = r1 * r3
                float[] r3 = r6.f559b
                r3 = r3[r0]
                float r3 = r3 * r7
                float r1 = r1 + r3
                r2[r0] = r1
                int r0 = r0 + 1
                goto L_0x0001
            L_0x001b:
                return
        }
    }

    /* renamed from: a */
    private static int m3666a(java.lang.String r3, int r4) {
        L_0x0000:
            int r0 = r3.length()
            if (r4 >= r0) goto L_0x0026
            char r0 = r3.charAt(r4)
            int r1 = r0 + (-65)
            int r2 = r0 + (-90)
            int r1 = r1 * r2
            if (r1 <= 0) goto L_0x001a
            int r1 = r0 + (-97)
            int r2 = r0 + (-122)
            int r1 = r1 * r2
            if (r1 > 0) goto L_0x0023
        L_0x001a:
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == r1) goto L_0x0023
            r1 = 69
            if (r0 == r1) goto L_0x0023
            return r4
        L_0x0023:
            int r4 = r4 + 1
            goto L_0x0000
        L_0x0026:
            return r4
    }

    /* renamed from: a */
    private static void m3665a(java.lang.String r8, int r9, p000a.p018g.p021e.C0142b.C0143a r10) {
            r0 = 0
            r10.f557b = r0
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0007:
            int r5 = r8.length()
            if (r1 >= r5) goto L_0x003b
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L_0x0033
            r6 = 69
            if (r5 == r6) goto L_0x0031
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L_0x0031
            switch(r5) {
                case 44: goto L_0x0033;
                case 45: goto L_0x002a;
                case 46: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x002f
        L_0x0022:
            if (r3 != 0) goto L_0x0027
            r2 = 0
            r3 = 1
            goto L_0x0035
        L_0x0027:
            r10.f557b = r7
            goto L_0x0033
        L_0x002a:
            if (r1 == r9) goto L_0x002f
            if (r2 != 0) goto L_0x002f
            goto L_0x0027
        L_0x002f:
            r2 = 0
            goto L_0x0035
        L_0x0031:
            r2 = 1
            goto L_0x0035
        L_0x0033:
            r2 = 0
            r4 = 1
        L_0x0035:
            if (r4 == 0) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x003b:
            r10.f556a = r1
            return
    }

    /* renamed from: a */
    private static void m3664a(java.util.ArrayList<p000a.p018g.p021e.C0142b.C0144b> r1, char r2, float[] r3) {
            a.g.e.b$b r0 = new a.g.e.b$b
            r0.<init>(r2, r3)
            r1.add(r0)
            return
    }

    /* renamed from: a */
    public static boolean m3661a(p000a.p018g.p021e.C0142b.C0144b[] r4, p000a.p018g.p021e.C0142b.C0144b[] r5) {
            r0 = 0
            if (r4 == 0) goto L_0x002c
            if (r5 != 0) goto L_0x0006
            goto L_0x002c
        L_0x0006:
            int r1 = r4.length
            int r2 = r5.length
            if (r1 == r2) goto L_0x000b
            return r0
        L_0x000b:
            r1 = 0
        L_0x000c:
            int r2 = r4.length
            if (r1 >= r2) goto L_0x002a
            r2 = r4[r1]
            char r2 = r2.f558a
            r3 = r5[r1]
            char r3 = r3.f558a
            if (r2 != r3) goto L_0x0029
            r2 = r4[r1]
            float[] r2 = r2.f559b
            int r2 = r2.length
            r3 = r5[r1]
            float[] r3 = r3.f559b
            int r3 = r3.length
            if (r2 == r3) goto L_0x0026
            goto L_0x0029
        L_0x0026:
            int r1 = r1 + 1
            goto L_0x000c
        L_0x0029:
            return r0
        L_0x002a:
            r4 = 1
            return r4
        L_0x002c:
            return r0
    }

    /* renamed from: a */
    static float[] m3663a(float[] r2, int r3, int r4) {
            if (r3 > r4) goto L_0x001a
            int r0 = r2.length
            if (r3 < 0) goto L_0x0014
            if (r3 > r0) goto L_0x0014
            int r4 = r4 - r3
            int r0 = r0 - r3
            int r0 = java.lang.Math.min(r4, r0)
            float[] r4 = new float[r4]
            r1 = 0
            java.lang.System.arraycopy(r2, r3, r4, r1, r0)
            return r4
        L_0x0014:
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            throw r2
        L_0x001a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    /* renamed from: a */
    public static p000a.p018g.p021e.C0142b.C0144b[] m3667a(java.lang.String r7) {
            if (r7 != 0) goto L_0x0004
            r7 = 0
            return r7
        L_0x0004:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = 1
            r4 = 0
        L_0x000d:
            int r5 = r7.length()
            if (r3 >= r5) goto L_0x0036
            int r3 = m3666a(r7, r3)
            java.lang.String r4 = r7.substring(r4, r3)
            java.lang.String r4 = r4.trim()
            int r5 = r4.length()
            if (r5 <= 0) goto L_0x0030
            float[] r5 = m3658c(r4)
            char r4 = r4.charAt(r2)
            m3664a(r0, r4, r5)
        L_0x0030:
            int r4 = r3 + 1
            r6 = r4
            r4 = r3
            r3 = r6
            goto L_0x000d
        L_0x0036:
            int r3 = r3 - r4
            if (r3 != r1) goto L_0x0048
            int r1 = r7.length()
            if (r4 >= r1) goto L_0x0048
            char r7 = r7.charAt(r4)
            float[] r1 = new float[r2]
            m3664a(r0, r7, r1)
        L_0x0048:
            int r7 = r0.size()
            a.g.e.b$b[] r7 = new p000a.p018g.p021e.C0142b.C0144b[r7]
            java.lang.Object[] r7 = r0.toArray(r7)
            a.g.e.b$b[] r7 = (p000a.p018g.p021e.C0142b.C0144b[]) r7
            return r7
    }

    /* renamed from: a */
    public static p000a.p018g.p021e.C0142b.C0144b[] m3662a(p000a.p018g.p021e.C0142b.C0144b[] r4) {
            if (r4 != 0) goto L_0x0004
            r4 = 0
            return r4
        L_0x0004:
            int r0 = r4.length
            a.g.e.b$b[] r0 = new p000a.p018g.p021e.C0142b.C0144b[r0]
            r1 = 0
        L_0x0008:
            int r2 = r4.length
            if (r1 >= r2) goto L_0x0017
            a.g.e.b$b r2 = new a.g.e.b$b
            r3 = r4[r1]
            r2.<init>(r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L_0x0008
        L_0x0017:
            return r0
    }

    /* renamed from: b */
    public static android.graphics.Path m3660b(java.lang.String r4) {
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            a.g.e.b$b[] r1 = m3667a(r4)
            if (r1 == 0) goto L_0x0027
            p000a.p018g.p021e.C0142b.C0144b.m3653a(r1, r0)     // Catch: RuntimeException -> 0x000f
            return r0
        L_0x000f:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error in parsing "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r0)
            throw r1
        L_0x0027:
            r4 = 0
            return r4
    }

    /* renamed from: b */
    public static void m3659b(p000a.p018g.p021e.C0142b.C0144b[] r5, p000a.p018g.p021e.C0142b.C0144b[] r6) {
            r0 = 0
            r1 = 0
        L_0x0002:
            int r2 = r6.length
            if (r1 >= r2) goto L_0x0027
            r2 = r5[r1]
            r3 = r6[r1]
            char r3 = r3.f558a
            r2.f558a = r3
            r2 = 0
        L_0x000e:
            r3 = r6[r1]
            float[] r3 = r3.f559b
            int r3 = r3.length
            if (r2 >= r3) goto L_0x0024
            r3 = r5[r1]
            float[] r3 = r3.f559b
            r4 = r6[r1]
            float[] r4 = r4.f559b
            r4 = r4[r2]
            r3[r2] = r4
            int r2 = r2 + 1
            goto L_0x000e
        L_0x0024:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x0027:
            return
    }

    /* renamed from: c */
    private static float[] m3658c(java.lang.String r8) {
            r0 = 0
            char r1 = r8.charAt(r0)
            r2 = 122(0x7a, float:1.71E-43)
            if (r1 == r2) goto L_0x0064
            char r1 = r8.charAt(r0)
            r2 = 90
            if (r1 != r2) goto L_0x0012
            goto L_0x0064
        L_0x0012:
            int r1 = r8.length()     // Catch: NumberFormatException -> 0x0047
            float[] r1 = new float[r1]     // Catch: NumberFormatException -> 0x0047
            a.g.e.b$a r2 = new a.g.e.b$a     // Catch: NumberFormatException -> 0x0047
            r2.<init>()     // Catch: NumberFormatException -> 0x0047
            int r3 = r8.length()     // Catch: NumberFormatException -> 0x0047
            r4 = 1
            r5 = 0
        L_0x0023:
            if (r4 >= r3) goto L_0x0042
            m3665a(r8, r4, r2)     // Catch: NumberFormatException -> 0x0047
            int r6 = r2.f556a     // Catch: NumberFormatException -> 0x0047
            if (r4 >= r6) goto L_0x0039
            int r7 = r5 + 1
            java.lang.String r4 = r8.substring(r4, r6)     // Catch: NumberFormatException -> 0x0047
            float r4 = java.lang.Float.parseFloat(r4)     // Catch: NumberFormatException -> 0x0047
            r1[r5] = r4     // Catch: NumberFormatException -> 0x0047
            r5 = r7
        L_0x0039:
            boolean r4 = r2.f557b     // Catch: NumberFormatException -> 0x0047
            if (r4 == 0) goto L_0x003f
            r4 = r6
            goto L_0x0023
        L_0x003f:
            int r4 = r6 + 1
            goto L_0x0023
        L_0x0042:
            float[] r8 = m3663a(r1, r0, r5)     // Catch: NumberFormatException -> 0x0047
            return r8
        L_0x0047:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "error in parsing \""
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = "\""
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r1.<init>(r8, r0)
            throw r1
        L_0x0064:
            float[] r8 = new float[r0]
            return r8
    }
}
