package p000a.p001a.p004l.p005a;

/* renamed from: a.a.l.a.d */
/* loaded from: classes.dex */
public class C0025d extends android.graphics.drawable.Drawable {

    /* renamed from: m */
    private static final float f70m = 0.0f;

    /* renamed from: a */
    private final android.graphics.Paint f71a;

    /* renamed from: b */
    private float f72b;

    /* renamed from: c */
    private float f73c;

    /* renamed from: d */
    private float f74d;

    /* renamed from: e */
    private float f75e;

    /* renamed from: f */
    private boolean f76f;

    /* renamed from: g */
    private final android.graphics.Path f77g;

    /* renamed from: h */
    private final int f78h;

    /* renamed from: i */
    private boolean f79i;

    /* renamed from: j */
    private float f80j;

    /* renamed from: k */
    private float f81k;

    /* renamed from: l */
    private int f82l;

    static {
            r0 = 4631530004285489152(0x4046800000000000, double:45.0)
            double r0 = java.lang.Math.toRadians(r0)
            float r0 = (float) r0
            p000a.p001a.p004l.p005a.C0025d.f70m = r0
            return
    }

    public C0025d(android.content.Context r7) {
            r6 = this;
            r6.<init>()
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r6.f71a = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r6.f77g = r0
            r0 = 0
            r6.f79i = r0
            r1 = 2
            r6.f82l = r1
            android.graphics.Paint r1 = r6.f71a
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r2)
            android.graphics.Paint r1 = r6.f71a
            android.graphics.Paint$Join r2 = android.graphics.Paint.Join.MITER
            r1.setStrokeJoin(r2)
            android.graphics.Paint r1 = r6.f71a
            android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.BUTT
            r1.setStrokeCap(r2)
            android.graphics.Paint r1 = r6.f71a
            r2 = 1
            r1.setAntiAlias(r2)
            android.content.res.Resources$Theme r7 = r7.getTheme()
            int[] r1 = p000a.p001a.C0009j.DrawerArrowToggle
            int r3 = p000a.p001a.C0000a.drawerArrowStyle
            int r4 = p000a.p001a.C0008i.Base_Widget_AppCompat_DrawerArrowToggle
            r5 = 0
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r5, r1, r3, r4)
            int r1 = p000a.p001a.C0009j.DrawerArrowToggle_color
            int r1 = r7.getColor(r1, r0)
            r6.m4198a(r1)
            int r1 = p000a.p001a.C0009j.DrawerArrowToggle_thickness
            r3 = 0
            float r1 = r7.getDimension(r1, r3)
            r6.m4200a(r1)
            int r1 = p000a.p001a.C0009j.DrawerArrowToggle_spinBars
            boolean r1 = r7.getBoolean(r1, r2)
            r6.m4197a(r1)
            int r1 = p000a.p001a.C0009j.DrawerArrowToggle_gapBetweenBars
            float r1 = r7.getDimension(r1, r3)
            int r1 = java.lang.Math.round(r1)
            float r1 = (float) r1
            r6.m4196b(r1)
            int r1 = p000a.p001a.C0009j.DrawerArrowToggle_drawableSize
            int r0 = r7.getDimensionPixelSize(r1, r0)
            r6.f78h = r0
            int r0 = p000a.p001a.C0009j.DrawerArrowToggle_barLength
            float r0 = r7.getDimension(r0, r3)
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            r6.f73c = r0
            int r0 = p000a.p001a.C0009j.DrawerArrowToggle_arrowHeadLength
            float r0 = r7.getDimension(r0, r3)
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            r6.f72b = r0
            int r0 = p000a.p001a.C0009j.DrawerArrowToggle_arrowShaftLength
            float r0 = r7.getDimension(r0, r3)
            r6.f74d = r0
            r7.recycle()
            return
    }

    /* renamed from: a */
    private static float m4199a(float r0, float r1, float r2) {
            float r1 = r1 - r0
            float r1 = r1 * r2
            float r0 = r0 + r1
            return r0
    }

    /* renamed from: a */
    public void m4200a(float r5) {
            r4 = this;
            android.graphics.Paint r0 = r4.f71a
            float r0 = r0.getStrokeWidth()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0025
            android.graphics.Paint r0 = r4.f71a
            r0.setStrokeWidth(r5)
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            double r0 = (double) r5
            float r5 = p000a.p001a.p004l.p005a.C0025d.f70m
            double r2 = (double) r5
            double r2 = java.lang.Math.cos(r2)
            java.lang.Double.isNaN(r0)
            double r0 = r0 * r2
            float r5 = (float) r0
            r4.f81k = r5
            r4.invalidateSelf()
        L_0x0025:
            return
    }

    /* renamed from: a */
    public void m4198a(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f71a
            int r0 = r0.getColor()
            if (r2 == r0) goto L_0x0010
            android.graphics.Paint r0 = r1.f71a
            r0.setColor(r2)
            r1.invalidateSelf()
        L_0x0010:
            return
    }

    /* renamed from: a */
    public void m4197a(boolean r2) {
            r1 = this;
            boolean r0 = r1.f76f
            if (r0 == r2) goto L_0x0009
            r1.f76f = r2
            r1.invalidateSelf()
        L_0x0009:
            return
    }

    /* renamed from: b */
    public void m4196b(float r2) {
            r1 = this;
            float r0 = r1.f75e
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x000b
            r1.f75e = r2
            r1.invalidateSelf()
        L_0x000b:
            return
    }

    /* renamed from: b */
    public void m4195b(boolean r2) {
            r1 = this;
            boolean r0 = r1.f79i
            if (r0 == r2) goto L_0x0009
            r1.f79i = r2
            r1.invalidateSelf()
        L_0x0009:
            return
    }

    /* renamed from: c */
    public void m4194c(float r2) {
            r1 = this;
            float r0 = r1.f80j
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x000b
            r1.f80j = r2
            r1.invalidateSelf()
        L_0x000b:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            android.graphics.Rect r2 = r18.getBounds()
            int r3 = r0.f82l
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0021
            if (r3 == r5) goto L_0x0020
            r6 = 3
            if (r3 == r6) goto L_0x001a
            int r3 = androidx.core.graphics.drawable.C0698a.m1594e(r18)
            if (r3 != r5) goto L_0x0021
            goto L_0x0020
        L_0x001a:
            int r3 = androidx.core.graphics.drawable.C0698a.m1594e(r18)
            if (r3 != 0) goto L_0x0021
        L_0x0020:
            r4 = 1
        L_0x0021:
            float r3 = r0.f72b
            float r3 = r3 * r3
            r6 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r6
            double r7 = (double) r3
            double r7 = java.lang.Math.sqrt(r7)
            float r3 = (float) r7
            float r7 = r0.f73c
            float r8 = r0.f80j
            float r3 = m4199a(r7, r3, r8)
            float r7 = r0.f73c
            float r8 = r0.f74d
            float r9 = r0.f80j
            float r7 = m4199a(r7, r8, r9)
            float r8 = r0.f81k
            float r9 = r0.f80j
            r10 = 0
            float r8 = m4199a(r10, r8, r9)
            int r8 = java.lang.Math.round(r8)
            float r8 = (float) r8
            float r9 = p000a.p001a.p004l.p005a.C0025d.f70m
            float r11 = r0.f80j
            float r9 = m4199a(r10, r9, r11)
            if (r4 == 0) goto L_0x005b
            r11 = 0
            goto L_0x005d
        L_0x005b:
            r11 = -1020002304(0xffffffffc3340000, float:-180.0)
        L_0x005d:
            r12 = 1127481344(0x43340000, float:180.0)
            if (r4 == 0) goto L_0x0064
            r13 = 1127481344(0x43340000, float:180.0)
            goto L_0x0065
        L_0x0064:
            r13 = 0
        L_0x0065:
            float r14 = r0.f80j
            float r11 = m4199a(r11, r13, r14)
            double r13 = (double) r3
            r15 = r11
            double r10 = (double) r9
            double r16 = java.lang.Math.cos(r10)
            java.lang.Double.isNaN(r13)
            double r16 = r16 * r13
            r9 = r4
            long r3 = java.lang.Math.round(r16)
            float r3 = (float) r3
            double r10 = java.lang.Math.sin(r10)
            java.lang.Double.isNaN(r13)
            double r13 = r13 * r10
            long r10 = java.lang.Math.round(r13)
            float r4 = (float) r10
            android.graphics.Path r10 = r0.f77g
            r10.rewind()
            float r10 = r0.f75e
            android.graphics.Paint r11 = r0.f71a
            float r11 = r11.getStrokeWidth()
            float r10 = r10 + r11
            float r11 = r0.f81k
            float r11 = -r11
            float r13 = r0.f80j
            float r10 = m4199a(r10, r11, r13)
            float r11 = -r7
            float r11 = r11 / r6
            android.graphics.Path r13 = r0.f77g
            float r14 = r11 + r8
            r5 = 0
            r13.moveTo(r14, r5)
            android.graphics.Path r13 = r0.f77g
            float r8 = r8 * r6
            float r7 = r7 - r8
            r13.rLineTo(r7, r5)
            android.graphics.Path r5 = r0.f77g
            r5.moveTo(r11, r10)
            android.graphics.Path r5 = r0.f77g
            r5.rLineTo(r3, r4)
            android.graphics.Path r5 = r0.f77g
            float r7 = -r10
            r5.moveTo(r11, r7)
            android.graphics.Path r5 = r0.f77g
            float r4 = -r4
            r5.rLineTo(r3, r4)
            android.graphics.Path r3 = r0.f77g
            r3.close()
            r19.save()
            android.graphics.Paint r3 = r0.f71a
            float r3 = r3.getStrokeWidth()
            int r4 = r2.height()
            float r4 = (float) r4
            r5 = 1077936128(0x40400000, float:3.0)
            float r5 = r5 * r3
            float r4 = r4 - r5
            float r5 = r0.f75e
            float r6 = r6 * r5
            float r4 = r4 - r6
            int r4 = (int) r4
            int r4 = r4 / 4
            int r4 = r4 * 2
            float r4 = (float) r4
            r6 = 1069547520(0x3fc00000, float:1.5)
            float r3 = r3 * r6
            float r3 = r3 + r5
            float r4 = r4 + r3
            int r2 = r2.centerX()
            float r2 = (float) r2
            r1.translate(r2, r4)
            boolean r2 = r0.f76f
            if (r2 == 0) goto L_0x010e
            boolean r2 = r0.f79i
            r2 = r2 ^ r9
            if (r2 == 0) goto L_0x0106
            r5 = -1
            goto L_0x0107
        L_0x0106:
            r5 = 1
        L_0x0107:
            float r2 = (float) r5
            float r11 = r15 * r2
            r1.rotate(r11)
            goto L_0x0113
        L_0x010e:
            if (r9 == 0) goto L_0x0113
            r1.rotate(r12)
        L_0x0113:
            android.graphics.Path r2 = r0.f77g
            android.graphics.Paint r3 = r0.f71a
            r1.drawPath(r2, r3)
            r19.restore()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            int r0 = r1.f78h
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            int r0 = r1.f78h
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f71a
            int r0 = r0.getAlpha()
            if (r2 == r0) goto L_0x0010
            android.graphics.Paint r0 = r1.f71a
            r0.setAlpha(r2)
            r1.invalidateSelf()
        L_0x0010:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f71a
            r0.setColorFilter(r2)
            r1.invalidateSelf()
            return
    }
}
