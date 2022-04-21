package p050b.p051a.p052a.p053a.p055k;

/* renamed from: b.a.a.a.k.a */
/* loaded from: classes.dex */
public class C0887a extends androidx.appcompat.widget.C0588f {

    /* renamed from: d */
    private final p050b.p051a.p052a.p053a.p055k.C0889c f3302d;

    /* renamed from: e */
    private int f3303e;

    /* renamed from: f */
    private android.graphics.PorterDuff.Mode f3304f;

    /* renamed from: g */
    private android.content.res.ColorStateList f3305g;

    /* renamed from: h */
    private android.graphics.drawable.Drawable f3306h;

    /* renamed from: i */
    private int f3307i;

    /* renamed from: j */
    private int f3308j;

    /* renamed from: k */
    private int f3309k;

    public C0887a(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = p050b.p051a.p052a.p053a.C0869b.materialButtonStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public C0887a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
            r7 = this;
            r7.<init>(r8, r9, r10)
            int[] r2 = p050b.p051a.p052a.p053a.C0876i.MaterialButton
            int r4 = p050b.p051a.p052a.p053a.C0875h.Widget_MaterialComponents_Button
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r8 = com.google.android.material.internal.C0981j.m73c(r0, r1, r2, r3, r4, r5)
            int r9 = p050b.p051a.p052a.p053a.C0876i.MaterialButton_iconPadding
            int r9 = r8.getDimensionPixelSize(r9, r6)
            r7.f3303e = r9
            int r9 = p050b.p051a.p052a.p053a.C0876i.MaterialButton_iconTintMode
            r10 = -1
            int r9 = r8.getInt(r9, r10)
            android.graphics.PorterDuff$Mode r10 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r9 = com.google.android.material.internal.C0982k.m71a(r9, r10)
            r7.f3304f = r9
            android.content.Context r9 = r7.getContext()
            int r10 = p050b.p051a.p052a.p053a.C0876i.MaterialButton_iconTint
            android.content.res.ColorStateList r9 = p050b.p051a.p052a.p053a.p060o.C0906a.m401a(r9, r8, r10)
            r7.f3305g = r9
            android.content.Context r9 = r7.getContext()
            int r10 = p050b.p051a.p052a.p053a.C0876i.MaterialButton_icon
            android.graphics.drawable.Drawable r9 = p050b.p051a.p052a.p053a.p060o.C0906a.m400b(r9, r8, r10)
            r7.f3306h = r9
            int r9 = p050b.p051a.p052a.p053a.C0876i.MaterialButton_iconGravity
            r10 = 1
            int r9 = r8.getInteger(r9, r10)
            r7.f3309k = r9
            int r9 = p050b.p051a.p052a.p053a.C0876i.MaterialButton_iconSize
            int r9 = r8.getDimensionPixelSize(r9, r6)
            r7.f3307i = r9
            b.a.a.a.k.c r9 = new b.a.a.a.k.c
            r9.<init>(r7)
            r7.f3302d = r9
            b.a.a.a.k.c r9 = r7.f3302d
            r9.m451a(r8)
            r8.recycle()
            int r8 = r7.f3303e
            r7.setCompoundDrawablePadding(r8)
            r7.m456c()
            return
    }

    /* renamed from: a */
    private boolean m458a() {
            r2 = this;
            int r0 = p000a.p018g.p029l.C0216r.m3411j(r2)
            r1 = 1
            if (r0 != r1) goto L_0x0008
            goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            return r1
    }

    /* renamed from: b */
    private boolean m457b() {
            r1 = this;
            b.a.a.a.k.c r0 = r1.f3302d
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.m438g()
            if (r0 != 0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            return r0
    }

    /* renamed from: c */
    private void m456c() {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.f3306h
            if (r0 == 0) goto L_0x0039
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r5.f3306h = r0
            android.graphics.drawable.Drawable r0 = r5.f3306h
            android.content.res.ColorStateList r1 = r5.f3305g
            androidx.core.graphics.drawable.C0698a.m1603a(r0, r1)
            android.graphics.PorterDuff$Mode r0 = r5.f3304f
            if (r0 == 0) goto L_0x001a
            android.graphics.drawable.Drawable r1 = r5.f3306h
            androidx.core.graphics.drawable.C0698a.m1600a(r1, r0)
        L_0x001a:
            int r0 = r5.f3307i
            if (r0 == 0) goto L_0x001f
            goto L_0x0025
        L_0x001f:
            android.graphics.drawable.Drawable r0 = r5.f3306h
            int r0 = r0.getIntrinsicWidth()
        L_0x0025:
            int r1 = r5.f3307i
            if (r1 == 0) goto L_0x002a
            goto L_0x0030
        L_0x002a:
            android.graphics.drawable.Drawable r1 = r5.f3306h
            int r1 = r1.getIntrinsicHeight()
        L_0x0030:
            android.graphics.drawable.Drawable r2 = r5.f3306h
            int r3 = r5.f3308j
            r4 = 0
            int r0 = r0 + r3
            r2.setBounds(r3, r4, r0, r1)
        L_0x0039:
            android.graphics.drawable.Drawable r0 = r5.f3306h
            r1 = 0
            androidx.core.widget.C0720i.m1492a(r5, r0, r1, r1, r1)
            return
    }

    @Override // android.view.View
    public android.content.res.ColorStateList getBackgroundTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.getSupportBackgroundTintList()
            return r0
    }

    @Override // android.view.View
    public android.graphics.PorterDuff.Mode getBackgroundTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.getSupportBackgroundTintMode()
            return r0
    }

    public int getCornerRadius() {
            r1 = this;
            boolean r0 = r1.m457b()
            if (r0 == 0) goto L_0x000d
            b.a.a.a.k.c r0 = r1.f3302d
            int r0 = r0.m455a()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            return r0
    }

    public android.graphics.drawable.Drawable getIcon() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f3306h
            return r0
    }

    public int getIconGravity() {
            r1 = this;
            int r0 = r1.f3309k
            return r0
    }

    public int getIconPadding() {
            r1 = this;
            int r0 = r1.f3303e
            return r0
    }

    public int getIconSize() {
            r1 = this;
            int r0 = r1.f3307i
            return r0
    }

    public android.content.res.ColorStateList getIconTint() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f3305g
            return r0
    }

    public android.graphics.PorterDuff.Mode getIconTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.f3304f
            return r0
    }

    public android.content.res.ColorStateList getRippleColor() {
            r1 = this;
            boolean r0 = r1.m457b()
            if (r0 == 0) goto L_0x000d
            b.a.a.a.k.c r0 = r1.f3302d
            android.content.res.ColorStateList r0 = r0.m447b()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            return r0
    }

    public android.content.res.ColorStateList getStrokeColor() {
            r1 = this;
            boolean r0 = r1.m457b()
            if (r0 == 0) goto L_0x000d
            b.a.a.a.k.c r0 = r1.f3302d
            android.content.res.ColorStateList r0 = r0.m444c()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            return r0
    }

    public int getStrokeWidth() {
            r1 = this;
            boolean r0 = r1.m457b()
            if (r0 == 0) goto L_0x000d
            b.a.a.a.k.c r0 = r1.f3302d
            int r0 = r0.m441d()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            return r0
    }

    @Override // androidx.appcompat.widget.C0588f, p000a.p018g.p029l.AbstractC0215q
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            boolean r0 = r1.m457b()
            if (r0 == 0) goto L_0x000d
            b.a.a.a.k.c r0 = r1.f3302d
            android.content.res.ColorStateList r0 = r0.m440e()
            return r0
        L_0x000d:
            android.content.res.ColorStateList r0 = super.getSupportBackgroundTintList()
            return r0
    }

    @Override // androidx.appcompat.widget.C0588f, p000a.p018g.p029l.AbstractC0215q
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            boolean r0 = r1.m457b()
            if (r0 == 0) goto L_0x000d
            b.a.a.a.k.c r0 = r1.f3302d
            android.graphics.PorterDuff$Mode r0 = r0.m439f()
            return r0
        L_0x000d:
            android.graphics.PorterDuff$Mode r0 = super.getSupportBackgroundTintMode()
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(android.graphics.Canvas r3) {
            r2 = this;
            super.onDraw(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L_0x0014
            boolean r0 = r2.m457b()
            if (r0 == 0) goto L_0x0014
            b.a.a.a.k.c r0 = r2.f3302d
            r0.m450a(r3)
        L_0x0014:
            return
    }

    @Override // androidx.appcompat.widget.C0588f, android.widget.TextView, android.view.View
    protected void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r2 != r0) goto L_0x0012
            b.a.a.a.k.c r2 = r1.f3302d
            if (r2 == 0) goto L_0x0012
            int r6 = r6 - r4
            int r5 = r5 - r3
            r2.m453a(r6, r5)
        L_0x0012:
            return
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int r3, int r4) {
            r2 = this;
            super.onMeasure(r3, r4)
            android.graphics.drawable.Drawable r3 = r2.f3306h
            if (r3 == 0) goto L_0x004c
            int r3 = r2.f3309k
            r4 = 2
            if (r3 == r4) goto L_0x000d
            goto L_0x004c
        L_0x000d:
            android.text.TextPaint r3 = r2.getPaint()
            java.lang.CharSequence r0 = r2.getText()
            java.lang.String r0 = r0.toString()
            float r3 = r3.measureText(r0)
            int r3 = (int) r3
            int r0 = r2.f3307i
            if (r0 != 0) goto L_0x0028
            android.graphics.drawable.Drawable r0 = r2.f3306h
            int r0 = r0.getIntrinsicWidth()
        L_0x0028:
            int r1 = r2.getMeasuredWidth()
            int r1 = r1 - r3
            int r3 = p000a.p018g.p029l.C0216r.m3408m(r2)
            int r1 = r1 - r3
            int r1 = r1 - r0
            int r3 = r2.f3303e
            int r1 = r1 - r3
            int r3 = p000a.p018g.p029l.C0216r.m3407n(r2)
            int r1 = r1 - r3
            int r1 = r1 / r4
            boolean r3 = r2.m458a()
            if (r3 == 0) goto L_0x0043
            int r1 = -r1
        L_0x0043:
            int r3 = r2.f3308j
            if (r3 == r1) goto L_0x004c
            r2.f3308j = r1
            r2.m456c()
        L_0x004c:
            return
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.setBackgroundDrawable(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
            r1 = this;
            boolean r0 = r1.m457b()
            if (r0 == 0) goto L_0x000c
            b.a.a.a.k.c r0 = r1.f3302d
            r0.m454a(r2)
            goto L_0x000f
        L_0x000c:
            super.setBackgroundColor(r2)
        L_0x000f:
            return
    }

    @Override // androidx.appcompat.widget.C0588f, android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            boolean r0 = r2.m457b()
            if (r0 == 0) goto L_0x0025
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            if (r3 == r0) goto L_0x0019
            java.lang.String r0 = "MaterialButton"
            java.lang.String r1 = "Setting a custom background is not supported."
            android.util.Log.i(r0, r1)
            b.a.a.a.k.c r0 = r2.f3302d
            r0.m437h()
            goto L_0x0025
        L_0x0019:
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            int[] r3 = r3.getState()
            r0.setState(r3)
            goto L_0x0028
        L_0x0025:
            super.setBackgroundDrawable(r3)
        L_0x0028:
            return
    }

    @Override // androidx.appcompat.widget.C0588f, android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            if (r2 == 0) goto L_0x000b
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p000a.p001a.p002k.p003a.C0010a.m4259c(r0, r2)
            goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            r1.setBackgroundDrawable(r2)
            return
    }

    @Override // android.view.View
    public void setBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.setSupportBackgroundTintList(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.setSupportBackgroundTintMode(r1)
            return
    }

    public void setCornerRadius(int r2) {
            r1 = this;
            boolean r0 = r1.m457b()
            if (r0 == 0) goto L_0x000b
            b.a.a.a.k.c r0 = r1.f3302d
            r0.m446b(r2)
        L_0x000b:
            return
    }

    public void setCornerRadiusResource(int r2) {
            r1 = this;
            boolean r0 = r1.m457b()
            if (r0 == 0) goto L_0x0011
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setCornerRadius(r2)
        L_0x0011:
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f3306h
            if (r0 == r2) goto L_0x0009
            r1.f3306h = r2
            r1.m456c()
        L_0x0009:
            return
    }

    public void setIconGravity(int r1) {
            r0 = this;
            r0.f3309k = r1
            return
    }

    public void setIconPadding(int r2) {
            r1 = this;
            int r0 = r1.f3303e
            if (r0 == r2) goto L_0x0009
            r1.f3303e = r2
            r1.setCompoundDrawablePadding(r2)
        L_0x0009:
            return
    }

    public void setIconResource(int r2) {
            r1 = this;
            if (r2 == 0) goto L_0x000b
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p000a.p001a.p002k.p003a.C0010a.m4259c(r0, r2)
            goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            r1.setIcon(r2)
            return
    }

    public void setIconSize(int r2) {
            r1 = this;
            if (r2 < 0) goto L_0x000c
            int r0 = r1.f3307i
            if (r0 == r2) goto L_0x000b
            r1.f3307i = r2
            r1.m456c()
        L_0x000b:
            return
        L_0x000c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "iconSize cannot be less than 0"
            r2.<init>(r0)
            throw r2
    }

    public void setIconTint(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f3305g
            if (r0 == r2) goto L_0x0009
            r1.f3305g = r2
            r1.m456c()
        L_0x0009:
            return
    }

    public void setIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.f3304f
            if (r0 == r2) goto L_0x0009
            r1.f3304f = r2
            r1.m456c()
        L_0x0009:
            return
    }

    public void setIconTintResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = p000a.p001a.p002k.p003a.C0010a.m4260b(r0, r2)
            r1.setIconTint(r2)
            return
    }

    void setInternalBackground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            return
    }

    public void setRippleColor(android.content.res.ColorStateList r2) {
            r1 = this;
            boolean r0 = r1.m457b()
            if (r0 == 0) goto L_0x000b
            b.a.a.a.k.c r0 = r1.f3302d
            r0.m452a(r2)
        L_0x000b:
            return
    }

    public void setRippleColorResource(int r2) {
            r1 = this;
            boolean r0 = r1.m457b()
            if (r0 == 0) goto L_0x0011
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = p000a.p001a.p002k.p003a.C0010a.m4260b(r0, r2)
            r1.setRippleColor(r2)
        L_0x0011:
            return
    }

    public void setStrokeColor(android.content.res.ColorStateList r2) {
            r1 = this;
            boolean r0 = r1.m457b()
            if (r0 == 0) goto L_0x000b
            b.a.a.a.k.c r0 = r1.f3302d
            r0.m445b(r2)
        L_0x000b:
            return
    }

    public void setStrokeColorResource(int r2) {
            r1 = this;
            boolean r0 = r1.m457b()
            if (r0 == 0) goto L_0x0011
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = p000a.p001a.p002k.p003a.C0010a.m4260b(r0, r2)
            r1.setStrokeColor(r2)
        L_0x0011:
            return
    }

    public void setStrokeWidth(int r2) {
            r1 = this;
            boolean r0 = r1.m457b()
            if (r0 == 0) goto L_0x000b
            b.a.a.a.k.c r0 = r1.f3302d
            r0.m443c(r2)
        L_0x000b:
            return
    }

    public void setStrokeWidthResource(int r2) {
            r1 = this;
            boolean r0 = r1.m457b()
            if (r0 == 0) goto L_0x0011
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setStrokeWidth(r2)
        L_0x0011:
            return
    }

    @Override // androidx.appcompat.widget.C0588f, p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            boolean r0 = r1.m457b()
            if (r0 == 0) goto L_0x000c
            b.a.a.a.k.c r0 = r1.f3302d
            r0.m442c(r2)
            goto L_0x0013
        L_0x000c:
            b.a.a.a.k.c r0 = r1.f3302d
            if (r0 == 0) goto L_0x0013
            super.setSupportBackgroundTintList(r2)
        L_0x0013:
            return
    }

    @Override // androidx.appcompat.widget.C0588f, p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            boolean r0 = r1.m457b()
            if (r0 == 0) goto L_0x000c
            b.a.a.a.k.c r0 = r1.f3302d
            r0.m449a(r2)
            goto L_0x0013
        L_0x000c:
            b.a.a.a.k.c r0 = r1.f3302d
            if (r0 == 0) goto L_0x0013
            super.setSupportBackgroundTintMode(r2)
        L_0x0013:
            return
    }
}
