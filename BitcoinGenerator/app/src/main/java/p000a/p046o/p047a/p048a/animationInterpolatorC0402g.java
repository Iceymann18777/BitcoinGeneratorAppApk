package p000a.p046o.p047a.p048a;

/* renamed from: a.o.a.a.g  reason: invalid class name */
/* loaded from: classes.dex */
public class animationInterpolatorC0402g implements android.view.animation.Interpolator {

    /* renamed from: a */
    private float[] f1206a;

    /* renamed from: b */
    private float[] f1207b;

    public animationInterpolatorC0402g(android.content.Context r2, android.util.AttributeSet r3, org.xmlpull.v1.XmlPullParser r4) {
            r1 = this;
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            r1.<init>(r0, r2, r3, r4)
            return
    }

    public animationInterpolatorC0402g(android.content.res.Resources r2, android.content.res.Resources.Theme r3, android.util.AttributeSet r4, org.xmlpull.v1.XmlPullParser r5) {
            r1 = this;
            r1.<init>()
            int[] r0 = p000a.p046o.p047a.p048a.C0392a.f1192l
            android.content.res.TypedArray r2 = p000a.p018g.p019d.p020c.C0140g.m3681a(r2, r3, r4, r0)
            r1.m2731a(r2, r5)
            r2.recycle()
            return
    }

    /* renamed from: a */
    private void m2733a(float r3, float r4) {
            r2 = this;
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1 = 0
            r0.moveTo(r1, r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.quadTo(r3, r4, r1, r1)
            r2.m2730a(r0)
            return
    }

    /* renamed from: a */
    private void m2732a(float r9, float r10, float r11, float r12) {
            r8 = this;
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r0 = 0
            r7.moveTo(r0, r0)
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r0.cubicTo(r1, r2, r3, r4, r5, r6)
            r8.m2730a(r7)
            return
    }

    /* renamed from: a */
    private void m2731a(android.content.res.TypedArray r8, org.xmlpull.v1.XmlPullParser r9) {
            r7 = this;
            java.lang.String r0 = "pathData"
            boolean r1 = p000a.p018g.p019d.p020c.C0140g.m3675a(r9, r0)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            java.lang.String r8 = p000a.p018g.p019d.p020c.C0140g.m3679a(r8, r9, r0, r1)
            android.graphics.Path r9 = p000a.p018g.p021e.C0142b.m3660b(r8)
            if (r9 == 0) goto L_0x0017
            r7.m2730a(r9)
            goto L_0x006a
        L_0x0017:
            android.view.InflateException r9 = new android.view.InflateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "The path is null, which is created from "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8)
            throw r9
        L_0x002e:
            java.lang.String r0 = "controlX1"
            boolean r1 = p000a.p018g.p019d.p020c.C0140g.m3675a(r9, r0)
            if (r1 == 0) goto L_0x007b
            java.lang.String r1 = "controlY1"
            boolean r2 = p000a.p018g.p019d.p020c.C0140g.m3675a(r9, r1)
            if (r2 == 0) goto L_0x0073
            r2 = 0
            r3 = 0
            float r0 = p000a.p018g.p019d.p020c.C0140g.m3678a(r8, r9, r0, r2, r3)
            r2 = 1
            float r1 = p000a.p018g.p019d.p020c.C0140g.m3678a(r8, r9, r1, r2, r3)
            java.lang.String r2 = "controlX2"
            boolean r4 = p000a.p018g.p019d.p020c.C0140g.m3675a(r9, r2)
            java.lang.String r5 = "controlY2"
            boolean r6 = p000a.p018g.p019d.p020c.C0140g.m3675a(r9, r5)
            if (r4 != r6) goto L_0x006b
            if (r4 != 0) goto L_0x005d
            r7.m2733a(r0, r1)
            goto L_0x006a
        L_0x005d:
            r4 = 2
            float r2 = p000a.p018g.p019d.p020c.C0140g.m3678a(r8, r9, r2, r4, r3)
            r4 = 3
            float r8 = p000a.p018g.p019d.p020c.C0140g.m3678a(r8, r9, r5, r4, r3)
            r7.m2732a(r0, r1, r2, r8)
        L_0x006a:
            return
        L_0x006b:
            android.view.InflateException r8 = new android.view.InflateException
            java.lang.String r9 = "pathInterpolator requires both controlX2 and controlY2 for cubic Beziers."
            r8.<init>(r9)
            throw r8
        L_0x0073:
            android.view.InflateException r8 = new android.view.InflateException
            java.lang.String r9 = "pathInterpolator requires the controlY1 attribute"
            r8.<init>(r9)
            throw r8
        L_0x007b:
            android.view.InflateException r8 = new android.view.InflateException
            java.lang.String r9 = "pathInterpolator requires the controlX1 attribute"
            r8.<init>(r9)
            throw r8
    }

    /* renamed from: a */
    private void m2730a(android.graphics.Path r11) {
            r10 = this;
            android.graphics.PathMeasure r0 = new android.graphics.PathMeasure
            r1 = 0
            r0.<init>(r11, r1)
            float r11 = r0.getLength()
            r2 = 990057071(0x3b03126f, float:0.002)
            float r2 = r11 / r2
            int r2 = (int) r2
            r3 = 1
            int r2 = r2 + r3
            r4 = 3000(0xbb8, float:4.204E-42)
            int r2 = java.lang.Math.min(r4, r2)
            if (r2 <= 0) goto L_0x00fb
            float[] r4 = new float[r2]
            r10.f1206a = r4
            float[] r4 = new float[r2]
            r10.f1207b = r4
            r4 = 2
            float[] r4 = new float[r4]
            r5 = 0
        L_0x0026:
            if (r5 >= r2) goto L_0x0042
            float r6 = (float) r5
            float r6 = r6 * r11
            int r7 = r2 + (-1)
            float r7 = (float) r7
            float r6 = r6 / r7
            r7 = 0
            r0.getPosTan(r6, r4, r7)
            float[] r6 = r10.f1206a
            r7 = r4[r1]
            r6[r5] = r7
            float[] r6 = r10.f1207b
            r7 = r4[r3]
            r6[r5] = r7
            int r5 = r5 + 1
            goto L_0x0026
        L_0x0042:
            float[] r11 = r10.f1206a
            r11 = r11[r1]
            float r11 = java.lang.Math.abs(r11)
            double r4 = (double) r11
            r6 = 4532020583610935537(0x3ee4f8b588e368f1, double:1.0E-5)
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 > 0) goto L_0x00bd
            float[] r11 = r10.f1207b
            r11 = r11[r1]
            float r11 = java.lang.Math.abs(r11)
            double r4 = (double) r11
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 > 0) goto L_0x00bd
            float[] r11 = r10.f1206a
            int r4 = r2 + (-1)
            r11 = r11[r4]
            r5 = 1065353216(0x3f800000, float:1.0)
            float r11 = r11 - r5
            float r11 = java.lang.Math.abs(r11)
            double r8 = (double) r11
            int r11 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r11 > 0) goto L_0x00bd
            float[] r11 = r10.f1207b
            r11 = r11[r4]
            float r11 = r11 - r5
            float r11 = java.lang.Math.abs(r11)
            double r4 = (double) r11
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 > 0) goto L_0x00bd
            r11 = 0
            r11 = 0
            r3 = 0
        L_0x0084:
            if (r1 >= r2) goto L_0x00ae
            float[] r4 = r10.f1206a
            int r5 = r11 + 1
            r11 = r4[r11]
            int r3 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0097
            r4[r1] = r11
            int r1 = r1 + 1
            r3 = r11
            r11 = r5
            goto L_0x0084
        L_0x0097:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The Path cannot loop back on itself, x :"
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        L_0x00ae:
            boolean r11 = r0.nextContour()
            if (r11 != 0) goto L_0x00b5
            return
        L_0x00b5:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The Path should be continuous, can't have 2+ contours"
            r11.<init>(r0)
            throw r11
        L_0x00bd:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "The Path must start at (0,0) and end at (1,1) start: "
            r0.append(r4)
            float[] r4 = r10.f1206a
            r4 = r4[r1]
            r0.append(r4)
            java.lang.String r4 = ","
            r0.append(r4)
            float[] r5 = r10.f1207b
            r1 = r5[r1]
            r0.append(r1)
            java.lang.String r1 = " end:"
            r0.append(r1)
            float[] r1 = r10.f1206a
            int r2 = r2 - r3
            r1 = r1[r2]
            r0.append(r1)
            r0.append(r4)
            float[] r1 = r10.f1207b
            r1 = r1[r2]
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        L_0x00fb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The Path has a invalid length "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            goto L_0x0113
        L_0x0112:
            throw r0
        L_0x0113:
            goto L_0x0112
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float r7) {
            r6 = this;
            r0 = 0
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r1 > 0) goto L_0x0006
            return r0
        L_0x0006:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r2 < 0) goto L_0x000d
            return r1
        L_0x000d:
            r1 = 0
            float[] r2 = r6.f1206a
            int r2 = r2.length
            r3 = 1
            int r2 = r2 - r3
        L_0x0013:
            int r4 = r2 - r1
            if (r4 <= r3) goto L_0x0027
            int r4 = r1 + r2
            int r4 = r4 / 2
            float[] r5 = r6.f1206a
            r5 = r5[r4]
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x0025
            r2 = r4
            goto L_0x0013
        L_0x0025:
            r1 = r4
            goto L_0x0013
        L_0x0027:
            float[] r3 = r6.f1206a
            r4 = r3[r2]
            r5 = r3[r1]
            float r4 = r4 - r5
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0037
            float[] r7 = r6.f1207b
            r7 = r7[r1]
            return r7
        L_0x0037:
            r0 = r3[r1]
            float r7 = r7 - r0
            float r7 = r7 / r4
            float[] r0 = r6.f1207b
            r1 = r0[r1]
            r0 = r0[r2]
            float r0 = r0 - r1
            float r7 = r7 * r0
            float r1 = r1 + r7
            return r1
    }
}
