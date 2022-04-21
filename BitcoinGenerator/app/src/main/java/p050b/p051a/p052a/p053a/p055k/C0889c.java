package p050b.p051a.p052a.p053a.p055k;

/* renamed from: b.a.a.a.k.c */
/* loaded from: classes.dex */
class C0889c {

    /* renamed from: w */
    private static final boolean f3310w = false;

    /* renamed from: a */
    private final p050b.p051a.p052a.p053a.p055k.C0887a f3311a;

    /* renamed from: b */
    private int f3312b;

    /* renamed from: c */
    private int f3313c;

    /* renamed from: d */
    private int f3314d;

    /* renamed from: e */
    private int f3315e;

    /* renamed from: f */
    private int f3316f;

    /* renamed from: g */
    private int f3317g;

    /* renamed from: h */
    private android.graphics.PorterDuff.Mode f3318h;

    /* renamed from: i */
    private android.content.res.ColorStateList f3319i;

    /* renamed from: j */
    private android.content.res.ColorStateList f3320j;

    /* renamed from: k */
    private android.content.res.ColorStateList f3321k;

    /* renamed from: l */
    private final android.graphics.Paint f3322l;

    /* renamed from: m */
    private final android.graphics.Rect f3323m;

    /* renamed from: n */
    private final android.graphics.RectF f3324n;

    /* renamed from: o */
    private android.graphics.drawable.GradientDrawable f3325o;

    /* renamed from: p */
    private android.graphics.drawable.Drawable f3326p;

    /* renamed from: q */
    private android.graphics.drawable.GradientDrawable f3327q;

    /* renamed from: r */
    private android.graphics.drawable.Drawable f3328r;

    /* renamed from: s */
    private android.graphics.drawable.GradientDrawable f3329s;

    /* renamed from: t */
    private android.graphics.drawable.GradientDrawable f3330t;

    /* renamed from: u */
    private android.graphics.drawable.GradientDrawable f3331u;

    /* renamed from: v */
    private boolean f3332v;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            p050b.p051a.p052a.p053a.p055k.C0889c.f3310w = r0
            return
    }

    public C0889c(p050b.p051a.p052a.p053a.p055k.C0887a r3) {
            r2 = this;
            r2.<init>()
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            r2.f3322l = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.f3323m = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r2.f3324n = r0
            r0 = 0
            r2.f3332v = r0
            r2.f3311a = r3
            return
    }

    /* renamed from: a */
    private android.graphics.drawable.InsetDrawable m448a(android.graphics.drawable.Drawable r8) {
            r7 = this;
            android.graphics.drawable.InsetDrawable r6 = new android.graphics.drawable.InsetDrawable
            int r2 = r7.f3312b
            int r3 = r7.f3314d
            int r4 = r7.f3313c
            int r5 = r7.f3315e
            r0 = r6
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    /* renamed from: i */
    private android.graphics.drawable.Drawable m436i() {
            r4 = this;
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r4.f3325o = r0
            android.graphics.drawable.GradientDrawable r0 = r4.f3325o
            int r1 = r4.f3316f
            float r1 = (float) r1
            r2 = 925353388(0x3727c5ac, float:1.0E-5)
            float r1 = r1 + r2
            r0.setCornerRadius(r1)
            android.graphics.drawable.GradientDrawable r0 = r4.f3325o
            r1 = -1
            r0.setColor(r1)
            android.graphics.drawable.GradientDrawable r0 = r4.f3325o
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.C0698a.m1591h(r0)
            r4.f3326p = r0
            android.graphics.drawable.Drawable r0 = r4.f3326p
            android.content.res.ColorStateList r3 = r4.f3319i
            androidx.core.graphics.drawable.C0698a.m1603a(r0, r3)
            android.graphics.PorterDuff$Mode r0 = r4.f3318h
            if (r0 == 0) goto L_0x0031
            android.graphics.drawable.Drawable r3 = r4.f3326p
            androidx.core.graphics.drawable.C0698a.m1600a(r3, r0)
        L_0x0031:
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r4.f3327q = r0
            android.graphics.drawable.GradientDrawable r0 = r4.f3327q
            int r3 = r4.f3316f
            float r3 = (float) r3
            float r3 = r3 + r2
            r0.setCornerRadius(r3)
            android.graphics.drawable.GradientDrawable r0 = r4.f3327q
            r0.setColor(r1)
            android.graphics.drawable.GradientDrawable r0 = r4.f3327q
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.C0698a.m1591h(r0)
            r4.f3328r = r0
            android.graphics.drawable.Drawable r0 = r4.f3328r
            android.content.res.ColorStateList r1 = r4.f3321k
            androidx.core.graphics.drawable.C0698a.m1603a(r0, r1)
            android.graphics.drawable.LayerDrawable r0 = new android.graphics.drawable.LayerDrawable
            r1 = 2
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r1]
            r2 = 0
            android.graphics.drawable.Drawable r3 = r4.f3326p
            r1[r2] = r3
            r2 = 1
            android.graphics.drawable.Drawable r3 = r4.f3328r
            r1[r2] = r3
            r0.<init>(r1)
            android.graphics.drawable.InsetDrawable r0 = r4.m448a(r0)
            return r0
    }

    @android.annotation.TargetApi(21)
    /* renamed from: j */
    private android.graphics.drawable.Drawable m435j() {
            r6 = this;
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r6.f3329s = r0
            android.graphics.drawable.GradientDrawable r0 = r6.f3329s
            int r1 = r6.f3316f
            float r1 = (float) r1
            r2 = 925353388(0x3727c5ac, float:1.0E-5)
            float r1 = r1 + r2
            r0.setCornerRadius(r1)
            android.graphics.drawable.GradientDrawable r0 = r6.f3329s
            r1 = -1
            r0.setColor(r1)
            r6.m431n()
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r6.f3330t = r0
            android.graphics.drawable.GradientDrawable r0 = r6.f3330t
            int r3 = r6.f3316f
            float r3 = (float) r3
            float r3 = r3 + r2
            r0.setCornerRadius(r3)
            android.graphics.drawable.GradientDrawable r0 = r6.f3330t
            r3 = 0
            r0.setColor(r3)
            android.graphics.drawable.GradientDrawable r0 = r6.f3330t
            int r4 = r6.f3317g
            android.content.res.ColorStateList r5 = r6.f3320j
            r0.setStroke(r4, r5)
            android.graphics.drawable.LayerDrawable r0 = new android.graphics.drawable.LayerDrawable
            r4 = 2
            android.graphics.drawable.Drawable[] r4 = new android.graphics.drawable.Drawable[r4]
            android.graphics.drawable.GradientDrawable r5 = r6.f3329s
            r4[r3] = r5
            android.graphics.drawable.GradientDrawable r3 = r6.f3330t
            r5 = 1
            r4[r5] = r3
            r0.<init>(r4)
            android.graphics.drawable.InsetDrawable r0 = r6.m448a(r0)
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            r6.f3331u = r3
            android.graphics.drawable.GradientDrawable r3 = r6.f3331u
            int r4 = r6.f3316f
            float r4 = (float) r4
            float r4 = r4 + r2
            r3.setCornerRadius(r4)
            android.graphics.drawable.GradientDrawable r2 = r6.f3331u
            r2.setColor(r1)
            b.a.a.a.k.b r1 = new b.a.a.a.k.b
            android.content.res.ColorStateList r2 = r6.f3321k
            android.content.res.ColorStateList r2 = p050b.p051a.p052a.p053a.p061p.C0907a.m398a(r2)
            android.graphics.drawable.GradientDrawable r3 = r6.f3331u
            r1.<init>(r2, r0, r3)
            return r1
    }

    /* renamed from: k */
    private android.graphics.drawable.GradientDrawable m434k() {
            r2 = this;
            boolean r0 = p050b.p051a.p052a.p053a.p055k.C0889c.f3310w
            if (r0 == 0) goto L_0x0028
            b.a.a.a.k.a r0 = r2.f3311a
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L_0x0028
            b.a.a.a.k.a r0 = r2.f3311a
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.RippleDrawable r0 = (android.graphics.drawable.RippleDrawable) r0
            r1 = 0
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            android.graphics.drawable.InsetDrawable r0 = (android.graphics.drawable.InsetDrawable) r0
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            android.graphics.drawable.LayerDrawable r0 = (android.graphics.drawable.LayerDrawable) r0
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
            return r0
        L_0x0028:
            r0 = 0
            return r0
    }

    /* renamed from: l */
    private android.graphics.drawable.GradientDrawable m433l() {
            r2 = this;
            boolean r0 = p050b.p051a.p052a.p053a.p055k.C0889c.f3310w
            if (r0 == 0) goto L_0x0029
            b.a.a.a.k.a r0 = r2.f3311a
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L_0x0029
            b.a.a.a.k.a r0 = r2.f3311a
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.RippleDrawable r0 = (android.graphics.drawable.RippleDrawable) r0
            r1 = 0
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            android.graphics.drawable.InsetDrawable r0 = (android.graphics.drawable.InsetDrawable) r0
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            android.graphics.drawable.LayerDrawable r0 = (android.graphics.drawable.LayerDrawable) r0
            r1 = 1
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
            return r0
        L_0x0029:
            r0 = 0
            return r0
    }

    /* renamed from: m */
    private void m432m() {
            r2 = this;
            boolean r0 = p050b.p051a.p052a.p053a.p055k.C0889c.f3310w
            if (r0 == 0) goto L_0x0012
            android.graphics.drawable.GradientDrawable r0 = r2.f3330t
            if (r0 == 0) goto L_0x0012
            b.a.a.a.k.a r0 = r2.f3311a
            android.graphics.drawable.Drawable r1 = r2.m435j()
            r0.setInternalBackground(r1)
            goto L_0x001b
        L_0x0012:
            boolean r0 = p050b.p051a.p052a.p053a.p055k.C0889c.f3310w
            if (r0 != 0) goto L_0x001b
            b.a.a.a.k.a r0 = r2.f3311a
            r0.invalidate()
        L_0x001b:
            return
    }

    /* renamed from: n */
    private void m431n() {
            r2 = this;
            android.graphics.drawable.GradientDrawable r0 = r2.f3329s
            if (r0 == 0) goto L_0x0012
            android.content.res.ColorStateList r1 = r2.f3319i
            androidx.core.graphics.drawable.C0698a.m1603a(r0, r1)
            android.graphics.PorterDuff$Mode r0 = r2.f3318h
            if (r0 == 0) goto L_0x0012
            android.graphics.drawable.GradientDrawable r1 = r2.f3329s
            androidx.core.graphics.drawable.C0698a.m1600a(r1, r0)
        L_0x0012:
            return
    }

    /* renamed from: a */
    int m455a() {
            r1 = this;
            int r0 = r1.f3316f
            return r0
    }

    /* renamed from: a */
    void m454a(int r2) {
            r1 = this;
            boolean r0 = p050b.p051a.p052a.p053a.p055k.C0889c.f3310w
            if (r0 == 0) goto L_0x000c
            android.graphics.drawable.GradientDrawable r0 = r1.f3329s
            if (r0 == 0) goto L_0x000c
        L_0x0008:
            r0.setColor(r2)
            goto L_0x0015
        L_0x000c:
            boolean r0 = p050b.p051a.p052a.p053a.p055k.C0889c.f3310w
            if (r0 != 0) goto L_0x0015
            android.graphics.drawable.GradientDrawable r0 = r1.f3325o
            if (r0 == 0) goto L_0x0015
            goto L_0x0008
        L_0x0015:
            return
    }

    /* renamed from: a */
    void m453a(int r5, int r6) {
            r4 = this;
            android.graphics.drawable.GradientDrawable r0 = r4.f3331u
            if (r0 == 0) goto L_0x0011
            int r1 = r4.f3312b
            int r2 = r4.f3314d
            int r3 = r4.f3313c
            int r6 = r6 - r3
            int r3 = r4.f3315e
            int r5 = r5 - r3
            r0.setBounds(r1, r2, r6, r5)
        L_0x0011:
            return
    }

    /* renamed from: a */
    void m452a(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f3321k
            if (r0 == r2) goto L_0x002b
            r1.f3321k = r2
            boolean r0 = p050b.p051a.p052a.p053a.p055k.C0889c.f3310w
            if (r0 == 0) goto L_0x0020
            b.a.a.a.k.a r0 = r1.f3311a
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.RippleDrawable
            if (r0 == 0) goto L_0x0020
            b.a.a.a.k.a r0 = r1.f3311a
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.RippleDrawable r0 = (android.graphics.drawable.RippleDrawable) r0
            r0.setColor(r2)
            goto L_0x002b
        L_0x0020:
            boolean r0 = p050b.p051a.p052a.p053a.p055k.C0889c.f3310w
            if (r0 != 0) goto L_0x002b
            android.graphics.drawable.Drawable r0 = r1.f3328r
            if (r0 == 0) goto L_0x002b
            androidx.core.graphics.drawable.C0698a.m1603a(r0, r2)
        L_0x002b:
            return
    }

    /* renamed from: a */
    public void m451a(android.content.res.TypedArray r6) {
            r5 = this;
            int r0 = p050b.p051a.p052a.p053a.C0876i.MaterialButton_android_insetLeft
            r1 = 0
            int r0 = r6.getDimensionPixelOffset(r0, r1)
            r5.f3312b = r0
            int r0 = p050b.p051a.p052a.p053a.C0876i.MaterialButton_android_insetRight
            int r0 = r6.getDimensionPixelOffset(r0, r1)
            r5.f3313c = r0
            int r0 = p050b.p051a.p052a.p053a.C0876i.MaterialButton_android_insetTop
            int r0 = r6.getDimensionPixelOffset(r0, r1)
            r5.f3314d = r0
            int r0 = p050b.p051a.p052a.p053a.C0876i.MaterialButton_android_insetBottom
            int r0 = r6.getDimensionPixelOffset(r0, r1)
            r5.f3315e = r0
            int r0 = p050b.p051a.p052a.p053a.C0876i.MaterialButton_cornerRadius
            int r0 = r6.getDimensionPixelSize(r0, r1)
            r5.f3316f = r0
            int r0 = p050b.p051a.p052a.p053a.C0876i.MaterialButton_strokeWidth
            int r0 = r6.getDimensionPixelSize(r0, r1)
            r5.f3317g = r0
            int r0 = p050b.p051a.p052a.p053a.C0876i.MaterialButton_backgroundTintMode
            r2 = -1
            int r0 = r6.getInt(r0, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r0 = com.google.android.material.internal.C0982k.m71a(r0, r2)
            r5.f3318h = r0
            b.a.a.a.k.a r0 = r5.f3311a
            android.content.Context r0 = r0.getContext()
            int r2 = p050b.p051a.p052a.p053a.C0876i.MaterialButton_backgroundTint
            android.content.res.ColorStateList r0 = p050b.p051a.p052a.p053a.p060o.C0906a.m401a(r0, r6, r2)
            r5.f3319i = r0
            b.a.a.a.k.a r0 = r5.f3311a
            android.content.Context r0 = r0.getContext()
            int r2 = p050b.p051a.p052a.p053a.C0876i.MaterialButton_strokeColor
            android.content.res.ColorStateList r0 = p050b.p051a.p052a.p053a.p060o.C0906a.m401a(r0, r6, r2)
            r5.f3320j = r0
            b.a.a.a.k.a r0 = r5.f3311a
            android.content.Context r0 = r0.getContext()
            int r2 = p050b.p051a.p052a.p053a.C0876i.MaterialButton_rippleColor
            android.content.res.ColorStateList r6 = p050b.p051a.p052a.p053a.p060o.C0906a.m401a(r0, r6, r2)
            r5.f3321k = r6
            android.graphics.Paint r6 = r5.f3322l
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r6.setStyle(r0)
            android.graphics.Paint r6 = r5.f3322l
            int r0 = r5.f3317g
            float r0 = (float) r0
            r6.setStrokeWidth(r0)
            android.graphics.Paint r6 = r5.f3322l
            android.content.res.ColorStateList r0 = r5.f3320j
            if (r0 == 0) goto L_0x0089
            b.a.a.a.k.a r2 = r5.f3311a
            int[] r2 = r2.getDrawableState()
            int r1 = r0.getColorForState(r2, r1)
        L_0x0089:
            r6.setColor(r1)
            b.a.a.a.k.a r6 = r5.f3311a
            int r6 = p000a.p018g.p029l.C0216r.m3407n(r6)
            b.a.a.a.k.a r0 = r5.f3311a
            int r0 = r0.getPaddingTop()
            b.a.a.a.k.a r1 = r5.f3311a
            int r1 = p000a.p018g.p029l.C0216r.m3408m(r1)
            b.a.a.a.k.a r2 = r5.f3311a
            int r2 = r2.getPaddingBottom()
            b.a.a.a.k.a r3 = r5.f3311a
            boolean r4 = p050b.p051a.p052a.p053a.p055k.C0889c.f3310w
            if (r4 == 0) goto L_0x00af
            android.graphics.drawable.Drawable r4 = r5.m435j()
            goto L_0x00b3
        L_0x00af:
            android.graphics.drawable.Drawable r4 = r5.m436i()
        L_0x00b3:
            r3.setInternalBackground(r4)
            b.a.a.a.k.a r3 = r5.f3311a
            int r4 = r5.f3312b
            int r6 = r6 + r4
            int r4 = r5.f3314d
            int r0 = r0 + r4
            int r4 = r5.f3313c
            int r1 = r1 + r4
            int r4 = r5.f3315e
            int r2 = r2 + r4
            p000a.p018g.p029l.C0216r.m3441a(r3, r6, r0, r1, r2)
            return
    }

    /* renamed from: a */
    void m450a(android.graphics.Canvas r9) {
            r8 = this;
            if (r9 == 0) goto L_0x005b
            android.content.res.ColorStateList r0 = r8.f3320j
            if (r0 == 0) goto L_0x005b
            int r0 = r8.f3317g
            if (r0 <= 0) goto L_0x005b
            android.graphics.Rect r0 = r8.f3323m
            b.a.a.a.k.a r1 = r8.f3311a
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            android.graphics.Rect r1 = r1.getBounds()
            r0.set(r1)
            android.graphics.RectF r0 = r8.f3324n
            android.graphics.Rect r1 = r8.f3323m
            int r2 = r1.left
            float r2 = (float) r2
            int r3 = r8.f3317g
            float r4 = (float) r3
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            float r2 = r2 + r4
            int r4 = r8.f3312b
            float r4 = (float) r4
            float r2 = r2 + r4
            int r4 = r1.top
            float r4 = (float) r4
            float r6 = (float) r3
            float r6 = r6 / r5
            float r4 = r4 + r6
            int r6 = r8.f3314d
            float r6 = (float) r6
            float r4 = r4 + r6
            int r6 = r1.right
            float r6 = (float) r6
            float r7 = (float) r3
            float r7 = r7 / r5
            float r6 = r6 - r7
            int r7 = r8.f3313c
            float r7 = (float) r7
            float r6 = r6 - r7
            int r1 = r1.bottom
            float r1 = (float) r1
            float r3 = (float) r3
            float r3 = r3 / r5
            float r1 = r1 - r3
            int r3 = r8.f3315e
            float r3 = (float) r3
            float r1 = r1 - r3
            r0.set(r2, r4, r6, r1)
            int r0 = r8.f3316f
            float r0 = (float) r0
            int r1 = r8.f3317g
            float r1 = (float) r1
            float r1 = r1 / r5
            float r0 = r0 - r1
            android.graphics.RectF r1 = r8.f3324n
            android.graphics.Paint r2 = r8.f3322l
            r9.drawRoundRect(r1, r0, r0, r2)
        L_0x005b:
            return
    }

    /* renamed from: a */
    void m449a(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.f3318h
            if (r0 == r2) goto L_0x0019
            r1.f3318h = r2
            boolean r2 = p050b.p051a.p052a.p053a.p055k.C0889c.f3310w
            if (r2 == 0) goto L_0x000e
            r1.m431n()
            goto L_0x0019
        L_0x000e:
            android.graphics.drawable.Drawable r2 = r1.f3326p
            if (r2 == 0) goto L_0x0019
            android.graphics.PorterDuff$Mode r0 = r1.f3318h
            if (r0 == 0) goto L_0x0019
            androidx.core.graphics.drawable.C0698a.m1600a(r2, r0)
        L_0x0019:
            return
    }

    /* renamed from: b */
    android.content.res.ColorStateList m447b() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f3321k
            return r0
    }

    /* renamed from: b */
    void m446b(int r4) {
            r3 = this;
            int r0 = r3.f3316f
            if (r0 == r4) goto L_0x005c
            r3.f3316f = r4
            boolean r0 = p050b.p051a.p052a.p053a.p055k.C0889c.f3310w
            r1 = 925353388(0x3727c5ac, float:1.0E-5)
            if (r0 == 0) goto L_0x0041
            android.graphics.drawable.GradientDrawable r0 = r3.f3329s
            if (r0 == 0) goto L_0x0041
            android.graphics.drawable.GradientDrawable r0 = r3.f3330t
            if (r0 == 0) goto L_0x0041
            android.graphics.drawable.GradientDrawable r0 = r3.f3331u
            if (r0 == 0) goto L_0x0041
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 != r2) goto L_0x002f
            android.graphics.drawable.GradientDrawable r0 = r3.m434k()
            float r2 = (float) r4
            float r2 = r2 + r1
            r0.setCornerRadius(r2)
            android.graphics.drawable.GradientDrawable r0 = r3.m433l()
            r0.setCornerRadius(r2)
        L_0x002f:
            android.graphics.drawable.GradientDrawable r0 = r3.f3329s
            float r4 = (float) r4
            float r4 = r4 + r1
            r0.setCornerRadius(r4)
            android.graphics.drawable.GradientDrawable r0 = r3.f3330t
            r0.setCornerRadius(r4)
            android.graphics.drawable.GradientDrawable r0 = r3.f3331u
            r0.setCornerRadius(r4)
            goto L_0x005c
        L_0x0041:
            boolean r0 = p050b.p051a.p052a.p053a.p055k.C0889c.f3310w
            if (r0 != 0) goto L_0x005c
            android.graphics.drawable.GradientDrawable r0 = r3.f3325o
            if (r0 == 0) goto L_0x005c
            android.graphics.drawable.GradientDrawable r2 = r3.f3327q
            if (r2 == 0) goto L_0x005c
            float r4 = (float) r4
            float r4 = r4 + r1
            r0.setCornerRadius(r4)
            android.graphics.drawable.GradientDrawable r0 = r3.f3327q
            r0.setCornerRadius(r4)
            b.a.a.a.k.a r4 = r3.f3311a
            r4.invalidate()
        L_0x005c:
            return
    }

    /* renamed from: b */
    void m445b(android.content.res.ColorStateList r4) {
            r3 = this;
            android.content.res.ColorStateList r0 = r3.f3320j
            if (r0 == r4) goto L_0x001b
            r3.f3320j = r4
            android.graphics.Paint r0 = r3.f3322l
            r1 = 0
            if (r4 == 0) goto L_0x0015
            b.a.a.a.k.a r2 = r3.f3311a
            int[] r2 = r2.getDrawableState()
            int r1 = r4.getColorForState(r2, r1)
        L_0x0015:
            r0.setColor(r1)
            r3.m432m()
        L_0x001b:
            return
    }

    /* renamed from: c */
    android.content.res.ColorStateList m444c() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f3320j
            return r0
    }

    /* renamed from: c */
    void m443c(int r2) {
            r1 = this;
            int r0 = r1.f3317g
            if (r0 == r2) goto L_0x000f
            r1.f3317g = r2
            android.graphics.Paint r0 = r1.f3322l
            float r2 = (float) r2
            r0.setStrokeWidth(r2)
            r1.m432m()
        L_0x000f:
            return
    }

    /* renamed from: c */
    void m442c(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f3319i
            if (r0 == r2) goto L_0x0017
            r1.f3319i = r2
            boolean r2 = p050b.p051a.p052a.p053a.p055k.C0889c.f3310w
            if (r2 == 0) goto L_0x000e
            r1.m431n()
            goto L_0x0017
        L_0x000e:
            android.graphics.drawable.Drawable r2 = r1.f3326p
            if (r2 == 0) goto L_0x0017
            android.content.res.ColorStateList r0 = r1.f3319i
            androidx.core.graphics.drawable.C0698a.m1603a(r2, r0)
        L_0x0017:
            return
    }

    /* renamed from: d */
    int m441d() {
            r1 = this;
            int r0 = r1.f3317g
            return r0
    }

    /* renamed from: e */
    android.content.res.ColorStateList m440e() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f3319i
            return r0
    }

    /* renamed from: f */
    android.graphics.PorterDuff.Mode m439f() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.f3318h
            return r0
    }

    /* renamed from: g */
    boolean m438g() {
            r1 = this;
            boolean r0 = r1.f3332v
            return r0
    }

    /* renamed from: h */
    void m437h() {
            r2 = this;
            r0 = 1
            r2.f3332v = r0
            b.a.a.a.k.a r0 = r2.f3311a
            android.content.res.ColorStateList r1 = r2.f3319i
            r0.setSupportBackgroundTintList(r1)
            b.a.a.a.k.a r0 = r2.f3311a
            android.graphics.PorterDuff$Mode r1 = r2.f3318h
            r0.setSupportBackgroundTintMode(r1)
            return
    }
}
