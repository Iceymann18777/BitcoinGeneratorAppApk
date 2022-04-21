package androidx.appcompat.app;

/* renamed from: androidx.appcompat.app.l */
/* loaded from: classes.dex */
class C0473l {

    /* renamed from: d */
    private static androidx.appcompat.app.C0473l f1532d;

    /* renamed from: a */
    public long f1533a;

    /* renamed from: b */
    public long f1534b;

    /* renamed from: c */
    public int f1535c;

    C0473l() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    static androidx.appcompat.app.C0473l m2511a() {
            androidx.appcompat.app.l r0 = androidx.appcompat.app.C0473l.f1532d
            if (r0 != 0) goto L_0x000b
            androidx.appcompat.app.l r0 = new androidx.appcompat.app.l
            r0.<init>()
            androidx.appcompat.app.C0473l.f1532d = r0
        L_0x000b:
            androidx.appcompat.app.l r0 = androidx.appcompat.app.C0473l.f1532d
            return r0
    }

    /* renamed from: a */
    public void m2510a(long r16, double r18, double r20) {
            r15 = this;
            r0 = r15
            r1 = 946728000000(0xdc6d62da00, double:4.67745780756E-312)
            long r3 = r16 - r1
            float r3 = (float) r3
            r4 = 1285868416(0x4ca4cb80, float:8.64E7)
            float r3 = r3 / r4
            r4 = 1015868197(0x3c8ceb25, float:0.01720197)
            float r4 = r4 * r3
            r5 = 1086828178(0x40c7ae92, float:6.24006)
            float r4 = r4 + r5
            double r5 = (double) r4
            double r7 = java.lang.Math.sin(r5)
            r9 = 4584977093208571904(0x3fa11c5fc0000000, double:0.03341960161924362)
            double r7 = r7 * r9
            java.lang.Double.isNaN(r5)
            double r7 = r7 + r5
            r9 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 * r4
            double r9 = (double) r9
            double r9 = java.lang.Math.sin(r9)
            r11 = 4555074754578481152(0x3f36e05b00000000, double:3.4906598739326E-4)
            double r9 = r9 * r11
            double r7 = r7 + r9
            r9 = 1077936128(0x40400000, float:3.0)
            float r4 = r4 * r9
            double r9 = (double) r4
            double r9 = java.lang.Math.sin(r9)
            r11 = 4527795603731644416(0x3ed5f61cc0000000, double:5.236000106378924E-6)
            double r9 = r9 * r11
            double r7 = r7 + r9
            r9 = 4610769955021710130(0x3ffcbed85e1ce332, double:1.796593063)
            double r7 = r7 + r9
            r9 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r7 = r7 + r9
            r9 = r20
            double r9 = -r9
            r11 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r9 = r9 / r11
            r4 = 980151802(0x3a6bedfa, float:9.0E-4)
            float r3 = r3 - r4
            double r11 = (double) r3
            java.lang.Double.isNaN(r11)
            double r11 = r11 - r9
            long r11 = java.lang.Math.round(r11)
            float r3 = (float) r11
            float r3 = r3 + r4
            double r3 = (double) r3
            java.lang.Double.isNaN(r3)
            double r3 = r3 + r9
            double r5 = java.lang.Math.sin(r5)
            r9 = 4572760506128099233(0x3f75b573eab367a1, double:0.0053)
            double r5 = r5 * r9
            double r3 = r3 + r5
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = r5 * r7
            double r5 = java.lang.Math.sin(r5)
            r9 = -4648766856319305620(0xbf7c432ca57a786c, double:-0.0069)
            double r5 = r5 * r9
            double r3 = r3 + r5
            double r5 = java.lang.Math.sin(r7)
            r7 = 4601044547609296896(0x3fda31a380000000, double:0.4092797040939331)
            double r7 = java.lang.Math.sin(r7)
            double r5 = r5 * r7
            double r5 = java.lang.Math.asin(r5)
            r7 = 4580687790437564416(0x3f91df46a0000000, double:0.01745329238474369)
            double r7 = r7 * r18
            r9 = -4631161762379464704(0xbfbaceea00000000, double:-0.10471975803375244)
            double r9 = java.lang.Math.sin(r9)
            double r11 = java.lang.Math.sin(r7)
            double r13 = java.lang.Math.sin(r5)
            double r11 = r11 * r13
            double r9 = r9 - r11
            double r7 = java.lang.Math.cos(r7)
            double r5 = java.lang.Math.cos(r5)
            double r7 = r7 * r5
            double r9 = r9 / r7
            r5 = 1
            r6 = -1
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r8 < 0) goto L_0x00d6
            r0.f1535c = r5
        L_0x00d1:
            r0.f1533a = r6
            r0.f1534b = r6
            return
        L_0x00d6:
            r11 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r8 = 0
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 > 0) goto L_0x00e0
            r0.f1535c = r8
            goto L_0x00d1
        L_0x00e0:
            double r6 = java.lang.Math.acos(r9)
            r9 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r6 = r6 / r9
            float r6 = (float) r6
            double r6 = (double) r6
            java.lang.Double.isNaN(r6)
            double r9 = r3 + r6
            r11 = 4725570615333879808(0x4194997000000000, double:8.64E7)
            double r9 = r9 * r11
            long r9 = java.lang.Math.round(r9)
            long r9 = r9 + r1
            r0.f1533a = r9
            java.lang.Double.isNaN(r6)
            double r3 = r3 - r6
            double r3 = r3 * r11
            long r3 = java.lang.Math.round(r3)
            long r3 = r3 + r1
            r0.f1534b = r3
            long r1 = r0.f1534b
            int r3 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r3 >= 0) goto L_0x011b
            long r1 = r0.f1533a
            int r3 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x011b
            r0.f1535c = r8
            goto L_0x011d
        L_0x011b:
            r0.f1535c = r5
        L_0x011d:
            return
    }
}
