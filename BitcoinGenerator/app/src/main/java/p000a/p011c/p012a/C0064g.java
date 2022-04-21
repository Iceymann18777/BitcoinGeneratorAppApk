package p000a.p011c.p012a;

/* renamed from: a.c.a.g */
/* loaded from: classes.dex */
class C0064g extends android.graphics.drawable.Drawable {

    /* renamed from: a */
    private float f185a;

    /* renamed from: b */
    private final android.graphics.Paint f186b;

    /* renamed from: c */
    private final android.graphics.RectF f187c;

    /* renamed from: d */
    private final android.graphics.Rect f188d;

    /* renamed from: e */
    private float f189e;

    /* renamed from: f */
    private boolean f190f;

    /* renamed from: g */
    private boolean f191g;

    /* renamed from: h */
    private android.content.res.ColorStateList f192h;

    /* renamed from: i */
    private android.graphics.PorterDuffColorFilter f193i;

    /* renamed from: j */
    private android.content.res.ColorStateList f194j;

    /* renamed from: k */
    private android.graphics.PorterDuff.Mode f195k;

    /* renamed from: a */
    private android.graphics.PorterDuffColorFilter m4105a(android.content.res.ColorStateList r3, android.graphics.PorterDuff.Mode r4) {
            r2 = this;
            if (r3 == 0) goto L_0x0014
            if (r4 != 0) goto L_0x0005
            goto L_0x0014
        L_0x0005:
            int[] r0 = r2.getState()
            r1 = 0
            int r3 = r3.getColorForState(r0, r1)
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            r0.<init>(r3, r4)
            return r0
        L_0x0014:
            r3 = 0
            return r3
    }

    /* renamed from: a */
    private void m4104a(android.graphics.Rect r6) {
            r5 = this;
            if (r6 != 0) goto L_0x0006
            android.graphics.Rect r6 = r5.getBounds()
        L_0x0006:
            android.graphics.RectF r0 = r5.f187c
            int r1 = r6.left
            float r1 = (float) r1
            int r2 = r6.top
            float r2 = (float) r2
            int r3 = r6.right
            float r3 = (float) r3
            int r4 = r6.bottom
            float r4 = (float) r4
            r0.set(r1, r2, r3, r4)
            android.graphics.Rect r0 = r5.f188d
            r0.set(r6)
            boolean r6 = r5.f190f
            if (r6 == 0) goto L_0x004c
            float r6 = r5.f189e
            float r0 = r5.f185a
            boolean r1 = r5.f191g
            float r6 = p000a.p011c.p012a.C0065h.m4090b(r6, r0, r1)
            float r0 = r5.f189e
            float r1 = r5.f185a
            boolean r2 = r5.f191g
            float r0 = p000a.p011c.p012a.C0065h.m4097a(r0, r1, r2)
            android.graphics.Rect r1 = r5.f188d
            double r2 = (double) r0
            double r2 = java.lang.Math.ceil(r2)
            int r0 = (int) r2
            double r2 = (double) r6
            double r2 = java.lang.Math.ceil(r2)
            int r6 = (int) r2
            r1.inset(r0, r6)
            android.graphics.RectF r6 = r5.f187c
            android.graphics.Rect r0 = r5.f188d
            r6.set(r0)
        L_0x004c:
            return
    }

    /* renamed from: b */
    private void m4102b(android.content.res.ColorStateList r4) {
            r3 = this;
            if (r4 != 0) goto L_0x0007
            r4 = 0
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r4)
        L_0x0007:
            r3.f192h = r4
            android.graphics.Paint r4 = r3.f186b
            android.content.res.ColorStateList r0 = r3.f192h
            int[] r1 = r3.getState()
            android.content.res.ColorStateList r2 = r3.f192h
            int r2 = r2.getDefaultColor()
            int r0 = r0.getColorForState(r1, r2)
            r4.setColor(r0)
            return
    }

    /* renamed from: a */
    public android.content.res.ColorStateList m4109a() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f192h
            return r0
    }

    /* renamed from: a */
    void m4108a(float r2) {
            r1 = this;
            float r0 = r1.f185a
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            r1.f185a = r2
            r2 = 0
            r1.m4104a(r2)
            r1.invalidateSelf()
            return
    }

    /* renamed from: a */
    void m4107a(float r2, boolean r3, boolean r4) {
            r1 = this;
            float r0 = r1.f189e
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x000f
            boolean r0 = r1.f190f
            if (r0 != r3) goto L_0x000f
            boolean r0 = r1.f191g
            if (r0 != r4) goto L_0x000f
            return
        L_0x000f:
            r1.f189e = r2
            r1.f190f = r3
            r1.f191g = r4
            r2 = 0
            r1.m4104a(r2)
            r1.invalidateSelf()
            return
    }

    /* renamed from: a */
    public void m4106a(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.m4102b(r1)
            r0.invalidateSelf()
            return
    }

    /* renamed from: b */
    float m4103b() {
            r1 = this;
            float r0 = r1.f189e
            return r0
    }

    /* renamed from: c */
    public float m4101c() {
            r1 = this;
            float r0 = r1.f185a
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r5) {
            r4 = this;
            android.graphics.Paint r0 = r4.f186b
            android.graphics.PorterDuffColorFilter r1 = r4.f193i
            if (r1 == 0) goto L_0x0013
            android.graphics.ColorFilter r1 = r0.getColorFilter()
            if (r1 != 0) goto L_0x0013
            android.graphics.PorterDuffColorFilter r1 = r4.f193i
            r0.setColorFilter(r1)
            r1 = 1
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            android.graphics.RectF r2 = r4.f187c
            float r3 = r4.f185a
            r5.drawRoundRect(r2, r3, r3, r0)
            if (r1 == 0) goto L_0x0021
            r5 = 0
            r0.setColorFilter(r5)
        L_0x0021:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline r3) {
            r2 = this;
            android.graphics.Rect r0 = r2.f188d
            float r1 = r2.f185a
            r3.setRoundRect(r0, r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f194j
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f192h
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r1) {
            r0 = this;
            super.onBoundsChange(r1)
            r0.m4104a(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r4) {
            r3 = this;
            android.content.res.ColorStateList r0 = r3.f192h
            int r1 = r0.getDefaultColor()
            int r4 = r0.getColorForState(r4, r1)
            android.graphics.Paint r0 = r3.f186b
            int r0 = r0.getColor()
            r1 = 1
            if (r4 == r0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x001d
            android.graphics.Paint r2 = r3.f186b
            r2.setColor(r4)
        L_0x001d:
            android.content.res.ColorStateList r4 = r3.f194j
            if (r4 == 0) goto L_0x002c
            android.graphics.PorterDuff$Mode r2 = r3.f195k
            if (r2 == 0) goto L_0x002c
            android.graphics.PorterDuffColorFilter r4 = r3.m4105a(r4, r2)
            r3.f193i = r4
            return r1
        L_0x002c:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f186b
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f186b
            r0.setColorFilter(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.f194j = r2
            android.content.res.ColorStateList r2 = r1.f194j
            android.graphics.PorterDuff$Mode r0 = r1.f195k
            android.graphics.PorterDuffColorFilter r2 = r1.m4105a(r2, r0)
            r1.f193i = r2
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            r1.f195k = r2
            android.content.res.ColorStateList r2 = r1.f194j
            android.graphics.PorterDuff$Mode r0 = r1.f195k
            android.graphics.PorterDuffColorFilter r2 = r1.m4105a(r2, r0)
            r1.f193i = r2
            r1.invalidateSelf()
            return
    }
}
