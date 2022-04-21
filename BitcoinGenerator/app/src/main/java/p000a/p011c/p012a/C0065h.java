package p000a.p011c.p012a;

/* renamed from: a.c.a.h */
/* loaded from: classes.dex */
class C0065h extends android.graphics.drawable.Drawable {

    /* renamed from: q */
    private static final double f196q = 0.0d;

    /* renamed from: r */
    static p000a.p011c.p012a.C0065h.AbstractC0066a f197r;

    /* renamed from: a */
    private final int f198a;

    /* renamed from: b */
    private android.graphics.Paint f199b;

    /* renamed from: c */
    private android.graphics.Paint f200c;

    /* renamed from: d */
    private android.graphics.Paint f201d;

    /* renamed from: e */
    private final android.graphics.RectF f202e;

    /* renamed from: f */
    private float f203f;

    /* renamed from: g */
    private android.graphics.Path f204g;

    /* renamed from: h */
    private float f205h;

    /* renamed from: i */
    private float f206i;

    /* renamed from: j */
    private float f207j;

    /* renamed from: k */
    private android.content.res.ColorStateList f208k;

    /* renamed from: l */
    private boolean f209l;

    /* renamed from: m */
    private final int f210m;

    /* renamed from: n */
    private final int f211n;

    /* renamed from: o */
    private boolean f212o;

    /* renamed from: p */
    private boolean f213p;

    /* renamed from: a.c.a.h$a */
    /* loaded from: classes.dex */
    interface AbstractC0066a {
        /* renamed from: a */
        void mo4080a(android.graphics.Canvas r1, android.graphics.RectF r2, float r3, android.graphics.Paint r4);
    }

    static {
            r0 = 4631530004285489152(0x4046800000000000, double:45.0)
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.cos(r0)
            p000a.p011c.p012a.C0065h.f196q = r0
            return
    }

    /* renamed from: a */
    static float m4097a(float r6, float r7, boolean r8) {
            if (r8 == 0) goto L_0x0013
            double r0 = (double) r6
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = p000a.p011c.p012a.C0065h.f196q
            double r2 = r2 - r4
            double r6 = (double) r7
            java.lang.Double.isNaN(r6)
            double r2 = r2 * r6
            java.lang.Double.isNaN(r0)
            double r0 = r0 + r2
            float r6 = (float) r0
        L_0x0013:
            return r6
    }

    /* renamed from: a */
    private void m4098a(float r4, float r5) {
            r3 = this;
            java.lang.String r0 = ". Must be >= 0"
            r1 = 0
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 < 0) goto L_0x0061
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0047
            int r4 = r3.m4084d(r4)
            float r4 = (float) r4
            int r5 = r3.m4084d(r5)
            float r5 = (float) r5
            r0 = 1
            int r1 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0021
            boolean r4 = r3.f213p
            if (r4 != 0) goto L_0x0020
            r3.f213p = r0
        L_0x0020:
            r4 = r5
        L_0x0021:
            float r1 = r3.f207j
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x002e
            float r1 = r3.f205h
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x002e
            return
        L_0x002e:
            r3.f207j = r4
            r3.f205h = r5
            r5 = 1069547520(0x3fc00000, float:1.5)
            float r4 = r4 * r5
            int r5 = r3.f198a
            float r5 = (float) r5
            float r4 = r4 + r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r5
            int r4 = (int) r4
            float r4 = (float) r4
            r3.f206i = r4
            r3.f209l = r0
            r3.invalidateSelf()
            return
        L_0x0047:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid max shadow size "
            r1.append(r2)
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            r4.<init>(r5)
            throw r4
        L_0x0061:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid shadow size "
            r1.append(r2)
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            r5.<init>(r4)
            throw r5
    }

    /* renamed from: a */
    private void m4095a(android.graphics.Canvas r13) {
            r12 = this;
            float r0 = r12.f203f
            float r1 = -r0
            float r2 = r12.f206i
            float r1 = r1 - r2
            int r2 = r12.f198a
            float r2 = (float) r2
            float r0 = r0 + r2
            float r2 = r12.f207j
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r0 = r0 + r2
            android.graphics.RectF r2 = r12.f202e
            float r2 = r2.width()
            float r9 = r0 * r3
            float r2 = r2 - r9
            r3 = 1
            r4 = 0
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x0022
            r2 = 1
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            android.graphics.RectF r6 = r12.f202e
            float r6 = r6.height()
            float r6 = r6 - r9
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0030
            r10 = 1
            goto L_0x0031
        L_0x0030:
            r10 = 0
        L_0x0031:
            int r11 = r13.save()
            android.graphics.RectF r3 = r12.f202e
            float r4 = r3.left
            float r4 = r4 + r0
            float r3 = r3.top
            float r3 = r3 + r0
            r13.translate(r4, r3)
            android.graphics.Path r3 = r12.f204g
            android.graphics.Paint r4 = r12.f200c
            r13.drawPath(r3, r4)
            if (r2 == 0) goto L_0x005c
            r4 = 0
            android.graphics.RectF r3 = r12.f202e
            float r3 = r3.width()
            float r6 = r3 - r9
            float r3 = r12.f203f
            float r7 = -r3
            android.graphics.Paint r8 = r12.f201d
            r3 = r13
            r5 = r1
            r3.drawRect(r4, r5, r6, r7, r8)
        L_0x005c:
            r13.restoreToCount(r11)
            int r11 = r13.save()
            android.graphics.RectF r3 = r12.f202e
            float r4 = r3.right
            float r4 = r4 - r0
            float r3 = r3.bottom
            float r3 = r3 - r0
            r13.translate(r4, r3)
            r3 = 1127481344(0x43340000, float:180.0)
            r13.rotate(r3)
            android.graphics.Path r3 = r12.f204g
            android.graphics.Paint r4 = r12.f200c
            r13.drawPath(r3, r4)
            if (r2 == 0) goto L_0x0093
            r4 = 0
            android.graphics.RectF r2 = r12.f202e
            float r2 = r2.width()
            float r6 = r2 - r9
            float r2 = r12.f203f
            float r2 = -r2
            float r3 = r12.f206i
            float r7 = r2 + r3
            android.graphics.Paint r8 = r12.f201d
            r3 = r13
            r5 = r1
            r3.drawRect(r4, r5, r6, r7, r8)
        L_0x0093:
            r13.restoreToCount(r11)
            int r2 = r13.save()
            android.graphics.RectF r3 = r12.f202e
            float r4 = r3.left
            float r4 = r4 + r0
            float r3 = r3.bottom
            float r3 = r3 - r0
            r13.translate(r4, r3)
            r3 = 1132920832(0x43870000, float:270.0)
            r13.rotate(r3)
            android.graphics.Path r3 = r12.f204g
            android.graphics.Paint r4 = r12.f200c
            r13.drawPath(r3, r4)
            if (r10 == 0) goto L_0x00c6
            r4 = 0
            android.graphics.RectF r3 = r12.f202e
            float r3 = r3.height()
            float r6 = r3 - r9
            float r3 = r12.f203f
            float r7 = -r3
            android.graphics.Paint r8 = r12.f201d
            r3 = r13
            r5 = r1
            r3.drawRect(r4, r5, r6, r7, r8)
        L_0x00c6:
            r13.restoreToCount(r2)
            int r2 = r13.save()
            android.graphics.RectF r3 = r12.f202e
            float r4 = r3.right
            float r4 = r4 - r0
            float r3 = r3.top
            float r3 = r3 + r0
            r13.translate(r4, r3)
            r0 = 1119092736(0x42b40000, float:90.0)
            r13.rotate(r0)
            android.graphics.Path r0 = r12.f204g
            android.graphics.Paint r3 = r12.f200c
            r13.drawPath(r0, r3)
            if (r10 == 0) goto L_0x00f9
            r4 = 0
            android.graphics.RectF r0 = r12.f202e
            float r0 = r0.height()
            float r6 = r0 - r9
            float r0 = r12.f203f
            float r7 = -r0
            android.graphics.Paint r8 = r12.f201d
            r3 = r13
            r5 = r1
            r3.drawRect(r4, r5, r6, r7, r8)
        L_0x00f9:
            r13.restoreToCount(r2)
            return
    }

    /* renamed from: b */
    static float m4090b(float r6, float r7, boolean r8) {
            r0 = 1069547520(0x3fc00000, float:1.5)
            float r6 = r6 * r0
            if (r8 == 0) goto L_0x0017
            double r0 = (double) r6
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = p000a.p011c.p012a.C0065h.f196q
            double r2 = r2 - r4
            double r6 = (double) r7
            java.lang.Double.isNaN(r6)
            double r2 = r2 * r6
            java.lang.Double.isNaN(r0)
            double r0 = r0 + r2
            float r6 = (float) r0
        L_0x0017:
            return r6
    }

    /* renamed from: b */
    private void m4089b(android.content.res.ColorStateList r4) {
            r3 = this;
            if (r4 != 0) goto L_0x0007
            r4 = 0
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r4)
        L_0x0007:
            r3.f208k = r4
            android.graphics.Paint r4 = r3.f199b
            android.content.res.ColorStateList r0 = r3.f208k
            int[] r1 = r3.getState()
            android.content.res.ColorStateList r2 = r3.f208k
            int r2 = r2.getDefaultColor()
            int r0 = r0.getColorForState(r1, r2)
            r4.setColor(r0)
            return
    }

    /* renamed from: b */
    private void m4088b(android.graphics.Rect r7) {
            r6 = this;
            float r0 = r6.f205h
            r1 = 1069547520(0x3fc00000, float:1.5)
            float r1 = r1 * r0
            android.graphics.RectF r2 = r6.f202e
            int r3 = r7.left
            float r3 = (float) r3
            float r3 = r3 + r0
            int r4 = r7.top
            float r4 = (float) r4
            float r4 = r4 + r1
            int r5 = r7.right
            float r5 = (float) r5
            float r5 = r5 - r0
            int r7 = r7.bottom
            float r7 = (float) r7
            float r7 = r7 - r1
            r2.set(r3, r4, r5, r7)
            r6.m4081g()
            return
    }

    /* renamed from: d */
    private int m4084d(float r3) {
            r2 = this;
            r0 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r0
            int r3 = (int) r3
            int r0 = r3 % 2
            r1 = 1
            if (r0 != r1) goto L_0x000a
            int r3 = r3 - r1
        L_0x000a:
            return r3
    }

    /* renamed from: g */
    private void m4081g() {
            r25 = this;
            r0 = r25
            android.graphics.RectF r1 = new android.graphics.RectF
            float r2 = r0.f203f
            float r3 = -r2
            float r4 = -r2
            r1.<init>(r3, r4, r2, r2)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>(r1)
            float r3 = r0.f206i
            float r4 = -r3
            float r3 = -r3
            r2.inset(r4, r3)
            android.graphics.Path r3 = r0.f204g
            if (r3 != 0) goto L_0x0023
            android.graphics.Path r3 = new android.graphics.Path
            r3.<init>()
            r0.f204g = r3
            goto L_0x0026
        L_0x0023:
            r3.reset()
        L_0x0026:
            android.graphics.Path r3 = r0.f204g
            android.graphics.Path$FillType r4 = android.graphics.Path.FillType.EVEN_ODD
            r3.setFillType(r4)
            android.graphics.Path r3 = r0.f204g
            float r4 = r0.f203f
            float r4 = -r4
            r5 = 0
            r3.moveTo(r4, r5)
            android.graphics.Path r3 = r0.f204g
            float r4 = r0.f206i
            float r4 = -r4
            r3.rLineTo(r4, r5)
            android.graphics.Path r3 = r0.f204g
            r4 = 1127481344(0x43340000, float:180.0)
            r6 = 1119092736(0x42b40000, float:90.0)
            r7 = 0
            r3.arcTo(r2, r4, r6, r7)
            android.graphics.Path r2 = r0.f204g
            r3 = 1132920832(0x43870000, float:270.0)
            r4 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r2.arcTo(r1, r3, r4, r7)
            android.graphics.Path r1 = r0.f204g
            r1.close()
            float r1 = r0.f203f
            float r2 = r0.f206i
            float r3 = r1 + r2
            float r3 = r1 / r3
            android.graphics.Paint r4 = r0.f200c
            android.graphics.RadialGradient r6 = new android.graphics.RadialGradient
            r9 = 0
            r10 = 0
            float r11 = r1 + r2
            r1 = 3
            int[] r12 = new int[r1]
            int r2 = r0.f210m
            r12[r7] = r2
            r15 = 1
            r12[r15] = r2
            int r2 = r0.f211n
            r16 = 2
            r12[r16] = r2
            float[] r13 = new float[r1]
            r13[r7] = r5
            r13[r15] = r3
            r2 = 1065353216(0x3f800000, float:1.0)
            r13[r16] = r2
            android.graphics.Shader$TileMode r14 = android.graphics.Shader.TileMode.CLAMP
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r4.setShader(r6)
            android.graphics.Paint r2 = r0.f201d
            android.graphics.LinearGradient r3 = new android.graphics.LinearGradient
            r18 = 0
            float r4 = r0.f203f
            float r5 = -r4
            float r6 = r0.f206i
            float r19 = r5 + r6
            r20 = 0
            float r4 = -r4
            float r21 = r4 - r6
            int[] r4 = new int[r1]
            int r5 = r0.f210m
            r4[r7] = r5
            r4[r15] = r5
            int r5 = r0.f211n
            r4[r16] = r5
            float[] r1 = new float[r1]
            r1 = {x00c0: FILL_ARRAY_DATA  , data: [0, 1056964608, 1065353216} // fill-array
            android.graphics.Shader$TileMode r24 = android.graphics.Shader.TileMode.CLAMP
            r17 = r3
            r22 = r4
            r23 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r2.setShader(r3)
            android.graphics.Paint r1 = r0.f201d
            r1.setAntiAlias(r7)
            return
    }

    /* renamed from: a */
    android.content.res.ColorStateList m4100a() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f208k
            return r0
    }

    /* renamed from: a */
    void m4099a(float r4) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x001a
            r0 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r0
            int r4 = (int) r4
            float r4 = (float) r4
            float r0 = r3.f203f
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0011
            return
        L_0x0011:
            r3.f203f = r4
            r4 = 1
            r3.f209l = r4
            r3.invalidateSelf()
            return
        L_0x001a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid radius "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ". Must be >= 0"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* renamed from: a */
    void m4096a(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.m4089b(r1)
            r0.invalidateSelf()
            return
    }

    /* renamed from: a */
    void m4094a(android.graphics.Rect r1) {
            r0 = this;
            r0.getPadding(r1)
            return
    }

    /* renamed from: a */
    void m4093a(boolean r1) {
            r0 = this;
            r0.f212o = r1
            r0.invalidateSelf()
            return
    }

    /* renamed from: b */
    float m4092b() {
            r1 = this;
            float r0 = r1.f203f
            return r0
    }

    /* renamed from: b */
    void m4091b(float r2) {
            r1 = this;
            float r0 = r1.f207j
            r1.m4098a(r0, r2)
            return
    }

    /* renamed from: c */
    float m4087c() {
            r1 = this;
            float r0 = r1.f205h
            return r0
    }

    /* renamed from: c */
    void m4086c(float r2) {
            r1 = this;
            float r0 = r1.f205h
            r1.m4098a(r2, r0)
            return
    }

    /* renamed from: d */
    float m4085d() {
            r5 = this;
            float r0 = r5.f205h
            float r1 = r5.f203f
            int r2 = r5.f198a
            float r2 = (float) r2
            float r1 = r1 + r2
            r2 = 1069547520(0x3fc00000, float:1.5)
            float r3 = r0 * r2
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r1 = r1 + r3
            float r0 = java.lang.Math.max(r0, r1)
            float r0 = r0 * r4
            float r1 = r5.f205h
            float r1 = r1 * r2
            int r2 = r5.f198a
            float r2 = (float) r2
            float r1 = r1 + r2
            float r1 = r1 * r4
            float r0 = r0 + r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r5) {
            r4 = this;
            boolean r0 = r4.f209l
            if (r0 == 0) goto L_0x000e
            android.graphics.Rect r0 = r4.getBounds()
            r4.m4088b(r0)
            r0 = 0
            r4.f209l = r0
        L_0x000e:
            float r0 = r4.f207j
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r2 = 0
            r5.translate(r2, r0)
            r4.m4095a(r5)
            float r0 = r4.f207j
            float r0 = -r0
            float r0 = r0 / r1
            r5.translate(r2, r0)
            a.c.a.h$a r0 = p000a.p011c.p012a.C0065h.f197r
            android.graphics.RectF r1 = r4.f202e
            float r2 = r4.f203f
            android.graphics.Paint r3 = r4.f199b
            r0.mo4080a(r5, r1, r2, r3)
            return
    }

    /* renamed from: e */
    float m4083e() {
            r4 = this;
            float r0 = r4.f205h
            float r1 = r4.f203f
            int r2 = r4.f198a
            float r2 = (float) r2
            float r1 = r1 + r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r3 = r0 / r2
            float r1 = r1 + r3
            float r0 = java.lang.Math.max(r0, r1)
            float r0 = r0 * r2
            float r1 = r4.f205h
            int r3 = r4.f198a
            float r3 = (float) r3
            float r1 = r1 + r3
            float r1 = r1 * r2
            float r0 = r0 + r1
            return r0
    }

    /* renamed from: f */
    float m4082f() {
            r1 = this;
            float r0 = r1.f207j
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect r5) {
            r4 = this;
            float r0 = r4.f205h
            float r1 = r4.f203f
            boolean r2 = r4.f212o
            float r0 = m4090b(r0, r1, r2)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            float r1 = r4.f205h
            float r2 = r4.f203f
            boolean r3 = r4.f212o
            float r1 = m4097a(r1, r2, r3)
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            r5.set(r1, r0, r1, r0)
            r5 = 1
            return r5
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f208k
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0010
        L_0x000a:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x0012
        L_0x0010:
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r1) {
            r0 = this;
            super.onBoundsChange(r1)
            r1 = 1
            r0.f209l = r1
            return
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r3) {
            r2 = this;
            android.content.res.ColorStateList r0 = r2.f208k
            int r1 = r0.getDefaultColor()
            int r3 = r0.getColorForState(r3, r1)
            android.graphics.Paint r0 = r2.f199b
            int r0 = r0.getColor()
            if (r0 != r3) goto L_0x0014
            r3 = 0
            return r3
        L_0x0014:
            android.graphics.Paint r0 = r2.f199b
            r0.setColor(r3)
            r3 = 1
            r2.f209l = r3
            r2.invalidateSelf()
            return r3
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f199b
            r0.setAlpha(r2)
            android.graphics.Paint r0 = r1.f200c
            r0.setAlpha(r2)
            android.graphics.Paint r0 = r1.f201d
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f199b
            r0.setColorFilter(r2)
            return
    }
}
