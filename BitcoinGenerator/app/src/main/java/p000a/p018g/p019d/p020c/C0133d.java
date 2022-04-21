package p000a.p018g.p019d.p020c;

/* renamed from: a.g.d.c.d */
/* loaded from: classes.dex */
final class C0133d {

    /* renamed from: a.g.d.c.d$a */
    /* loaded from: classes.dex */
    static final class C0134a {

        /* renamed from: a */
        final int[] f550a;

        /* renamed from: b */
        final float[] f551b;

        C0134a(int r4, int r5) {
                r3 = this;
                r3.<init>()
                r0 = 2
                int[] r1 = new int[r0]
                r2 = 0
                r1[r2] = r4
                r4 = 1
                r1[r4] = r5
                r3.f550a = r1
                float[] r4 = new float[r0]
                r4 = {x0016: FILL_ARRAY_DATA  , data: [0, 1065353216} // fill-array
                r3.f551b = r4
                return
        }

        C0134a(int r4, int r5, int r6) {
                r3 = this;
                r3.<init>()
                r0 = 3
                int[] r1 = new int[r0]
                r2 = 0
                r1[r2] = r4
                r4 = 1
                r1[r4] = r5
                r4 = 2
                r1[r4] = r6
                r3.f550a = r1
                float[] r4 = new float[r0]
                r4 = {x001a: FILL_ARRAY_DATA  , data: [0, 1056964608, 1065353216} // fill-array
                r3.f551b = r4
                return
        }

        C0134a(java.util.List<java.lang.Integer> r5, java.util.List<java.lang.Float> r6) {
                r4 = this;
                r4.<init>()
                int r0 = r5.size()
                int[] r1 = new int[r0]
                r4.f550a = r1
                float[] r1 = new float[r0]
                r4.f551b = r1
                r1 = 0
            L_0x0010:
                if (r1 >= r0) goto L_0x0031
                int[] r2 = r4.f550a
                java.lang.Object r3 = r5.get(r1)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r2[r1] = r3
                float[] r2 = r4.f551b
                java.lang.Object r3 = r6.get(r1)
                java.lang.Float r3 = (java.lang.Float) r3
                float r3 = r3.floatValue()
                r2[r1] = r3
                int r1 = r1 + 1
                goto L_0x0010
            L_0x0031:
                return
        }
    }

    /* renamed from: a */
    private static p000a.p018g.p019d.p020c.C0133d.C0134a m3693a(p000a.p018g.p019d.p020c.C0133d.C0134a r0, int r1, int r2, boolean r3, int r4) {
            if (r0 == 0) goto L_0x0003
            return r0
        L_0x0003:
            a.g.d.c.d$a r0 = new a.g.d.c.d$a
            if (r3 == 0) goto L_0x000b
            r0.<init>(r1, r4, r2)
            return r0
        L_0x000b:
            r0.<init>(r1, r2)
            return r0
    }

    /* renamed from: a */
    private static android.graphics.Shader.TileMode m3694a(int r1) {
            r0 = 1
            if (r1 == r0) goto L_0x000c
            r0 = 2
            if (r1 == r0) goto L_0x0009
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
            return r1
        L_0x0009:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.MIRROR
            return r1
        L_0x000c:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.REPEAT
            return r1
    }

    /* renamed from: a */
    static android.graphics.Shader m3692a(android.content.res.Resources r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.content.res.Resources.Theme r23) {
            r0 = r21
            java.lang.String r1 = r21.getName()
            java.lang.String r2 = "gradient"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00d4
            int[] r1 = p000a.p018g.C0123c.GradientColor
            r2 = r20
            r3 = r22
            r4 = r23
            android.content.res.TypedArray r1 = p000a.p018g.p019d.p020c.C0140g.m3681a(r2, r4, r3, r1)
            int r5 = p000a.p018g.C0123c.GradientColor_android_startX
            r6 = 0
            java.lang.String r7 = "startX"
            float r9 = p000a.p018g.p019d.p020c.C0140g.m3678a(r1, r0, r7, r5, r6)
            int r5 = p000a.p018g.C0123c.GradientColor_android_startY
            java.lang.String r7 = "startY"
            float r10 = p000a.p018g.p019d.p020c.C0140g.m3678a(r1, r0, r7, r5, r6)
            int r5 = p000a.p018g.C0123c.GradientColor_android_endX
            java.lang.String r7 = "endX"
            float r11 = p000a.p018g.p019d.p020c.C0140g.m3678a(r1, r0, r7, r5, r6)
            int r5 = p000a.p018g.C0123c.GradientColor_android_endY
            java.lang.String r7 = "endY"
            float r12 = p000a.p018g.p019d.p020c.C0140g.m3678a(r1, r0, r7, r5, r6)
            int r5 = p000a.p018g.C0123c.GradientColor_android_centerX
            java.lang.String r7 = "centerX"
            float r14 = p000a.p018g.p019d.p020c.C0140g.m3678a(r1, r0, r7, r5, r6)
            int r5 = p000a.p018g.C0123c.GradientColor_android_centerY
            java.lang.String r7 = "centerY"
            float r15 = p000a.p018g.p019d.p020c.C0140g.m3678a(r1, r0, r7, r5, r6)
            int r5 = p000a.p018g.C0123c.GradientColor_android_type
            r7 = 0
            java.lang.String r8 = "type"
            int r5 = p000a.p018g.p019d.p020c.C0140g.m3673b(r1, r0, r8, r5, r7)
            int r8 = p000a.p018g.C0123c.GradientColor_android_startColor
            java.lang.String r13 = "startColor"
            int r8 = p000a.p018g.p019d.p020c.C0140g.m3677a(r1, r0, r13, r8, r7)
            java.lang.String r13 = "centerColor"
            boolean r6 = p000a.p018g.p019d.p020c.C0140g.m3675a(r0, r13)
            int r2 = p000a.p018g.C0123c.GradientColor_android_centerColor
            int r2 = p000a.p018g.p019d.p020c.C0140g.m3677a(r1, r0, r13, r2, r7)
            int r13 = p000a.p018g.C0123c.GradientColor_android_endColor
            java.lang.String r3 = "endColor"
            int r3 = p000a.p018g.p019d.p020c.C0140g.m3677a(r1, r0, r3, r13, r7)
            int r13 = p000a.p018g.C0123c.GradientColor_android_tileMode
            java.lang.String r4 = "tileMode"
            int r4 = p000a.p018g.p019d.p020c.C0140g.m3673b(r1, r0, r4, r13, r7)
            int r7 = p000a.p018g.C0123c.GradientColor_android_gradientRadius
            java.lang.String r13 = "gradientRadius"
            r17 = r14
            r14 = 0
            float r7 = p000a.p018g.p019d.p020c.C0140g.m3678a(r1, r0, r13, r7, r14)
            r1.recycle()
            a.g.d.c.d$a r0 = m3691b(r20, r21, r22, r23)
            a.g.d.c.d$a r0 = m3693a(r0, r8, r3, r6, r2)
            r1 = 1
            if (r5 == r1) goto L_0x00af
            r1 = 2
            if (r5 == r1) goto L_0x00a3
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient
            int[] r13 = r0.f550a
            float[] r14 = r0.f551b
            android.graphics.Shader$TileMode r15 = m3694a(r4)
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r1
        L_0x00a3:
            android.graphics.SweepGradient r1 = new android.graphics.SweepGradient
            int[] r2 = r0.f550a
            float[] r0 = r0.f551b
            r3 = r17
            r1.<init>(r3, r15, r2, r0)
            return r1
        L_0x00af:
            r3 = r17
            r1 = 0
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00cc
            android.graphics.RadialGradient r1 = new android.graphics.RadialGradient
            int[] r2 = r0.f550a
            float[] r0 = r0.f551b
            android.graphics.Shader$TileMode r19 = m3694a(r4)
            r13 = r1
            r14 = r3
            r16 = r7
            r17 = r2
            r18 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            return r1
        L_0x00cc:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r0.<init>(r1)
            throw r0
        L_0x00d4:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = r21.getPositionDescription()
            r3.append(r0)
            java.lang.String r0 = ": invalid gradient color tag "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: b */
    private static p000a.p018g.p019d.p020c.C0133d.C0134a m3691b(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r9.next()
            if (r3 == r1) goto L_0x008a
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x008a
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = p000a.p018g.C0123c.GradientColorItem
            android.content.res.TypedArray r3 = p000a.p018g.p019d.p020c.C0140g.m3681a(r8, r11, r10, r3)
            int r5 = p000a.p018g.C0123c.GradientColorItem_android_color
            boolean r5 = r3.hasValue(r5)
            int r6 = p000a.p018g.C0123c.GradientColorItem_android_offset
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L_0x006a
            if (r6 == 0) goto L_0x006a
            int r5 = p000a.p018g.C0123c.GradientColorItem_android_color
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = p000a.p018g.C0123c.GradientColorItem_android_offset
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x006a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' "
            r10.append(r9)
            java.lang.String r9 = "attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L_0x008a:
            int r8 = r4.size()
            if (r8 <= 0) goto L_0x0096
            a.g.d.c.d$a r8 = new a.g.d.c.d$a
            r8.<init>(r4, r2)
            return r8
        L_0x0096:
            r8 = 0
            return r8
    }
}
