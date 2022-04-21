package com.google.android.material.internal;

/* renamed from: com.google.android.material.internal.c */
/* loaded from: classes.dex */
public class C0959c extends androidx.appcompat.widget.C0593g0 {

    /* renamed from: q */
    private android.graphics.drawable.Drawable f3566q;

    /* renamed from: r */
    private final android.graphics.Rect f3567r;

    /* renamed from: s */
    private final android.graphics.Rect f3568s;

    /* renamed from: t */
    private int f3569t;

    /* renamed from: u */
    protected boolean f3570u;

    /* renamed from: v */
    boolean f3571v;

    public C0959c(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public C0959c(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public C0959c(android.content.Context r9, android.util.AttributeSet r10, int r11) {
            r8 = this;
            r8.<init>(r9, r10, r11)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.f3567r = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.f3568s = r0
            r0 = 119(0x77, float:1.67E-43)
            r8.f3569t = r0
            r0 = 1
            r8.f3570u = r0
            r1 = 0
            r8.f3571v = r1
            int[] r4 = p050b.p051a.p052a.p053a.C0876i.ForegroundLinearLayout
            int[] r7 = new int[r1]
            r6 = 0
            r2 = r9
            r3 = r10
            r5 = r11
            android.content.res.TypedArray r9 = com.google.android.material.internal.C0981j.m73c(r2, r3, r4, r5, r6, r7)
            int r10 = p050b.p051a.p052a.p053a.C0876i.ForegroundLinearLayout_android_foregroundGravity
            int r11 = r8.f3569t
            int r10 = r9.getInt(r10, r11)
            r8.f3569t = r10
            int r10 = p050b.p051a.p052a.p053a.C0876i.ForegroundLinearLayout_android_foreground
            android.graphics.drawable.Drawable r10 = r9.getDrawable(r10)
            if (r10 == 0) goto L_0x003c
            r8.setForeground(r10)
        L_0x003c:
            int r10 = p050b.p051a.p052a.p053a.C0876i.ForegroundLinearLayout_foregroundInsidePadding
            boolean r10 = r9.getBoolean(r10, r0)
            r8.f3570u = r10
            r9.recycle()
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r9) {
            r8 = this;
            super.draw(r9)
            android.graphics.drawable.Drawable r0 = r8.f3566q
            if (r0 == 0) goto L_0x0054
            boolean r1 = r8.f3571v
            if (r1 == 0) goto L_0x0051
            r1 = 0
            r8.f3571v = r1
            android.graphics.Rect r2 = r8.f3567r
            android.graphics.Rect r3 = r8.f3568s
            int r4 = r8.getRight()
            int r5 = r8.getLeft()
            int r4 = r4 - r5
            int r5 = r8.getBottom()
            int r6 = r8.getTop()
            int r5 = r5 - r6
            boolean r6 = r8.f3570u
            if (r6 == 0) goto L_0x002c
            r2.set(r1, r1, r4, r5)
            goto L_0x0041
        L_0x002c:
            int r1 = r8.getPaddingLeft()
            int r6 = r8.getPaddingTop()
            int r7 = r8.getPaddingRight()
            int r4 = r4 - r7
            int r7 = r8.getPaddingBottom()
            int r5 = r5 - r7
            r2.set(r1, r6, r4, r5)
        L_0x0041:
            int r1 = r8.f3569t
            int r4 = r0.getIntrinsicWidth()
            int r5 = r0.getIntrinsicHeight()
            android.view.Gravity.apply(r1, r4, r5, r2, r3)
            r0.setBounds(r3)
        L_0x0051:
            r0.draw(r9)
        L_0x0054:
            return
    }

    @Override // android.view.View
    @android.annotation.TargetApi(21)
    public void drawableHotspotChanged(float r2, float r3) {
            r1 = this;
            super.drawableHotspotChanged(r2, r3)
            android.graphics.drawable.Drawable r0 = r1.f3566q
            if (r0 == 0) goto L_0x000a
            r0.setHotspot(r2, r3)
        L_0x000a:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
            r2 = this;
            super.drawableStateChanged()
            android.graphics.drawable.Drawable r0 = r2.f3566q
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0016
            android.graphics.drawable.Drawable r0 = r2.f3566q
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L_0x0016:
            return
    }

    @Override // android.view.View
    public android.graphics.drawable.Drawable getForeground() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f3566q
            return r0
    }

    @Override // android.view.View
    public int getForegroundGravity() {
            r1 = this;
            int r0 = r1.f3569t
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            android.graphics.drawable.Drawable r0 = r1.f3566q
            if (r0 == 0) goto L_0x000a
            r0.jumpToCurrentState()
        L_0x000a:
            return
    }

    @Override // androidx.appcompat.widget.C0593g0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            boolean r2 = r0.f3571v
            r1 = r1 | r2
            r0.f3571v = r1
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            r1 = 1
            r0.f3571v = r1
            return
    }

    @Override // android.view.View
    public void setForeground(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f3566q
            if (r0 == r3) goto L_0x0040
            if (r0 == 0) goto L_0x000f
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r2.f3566q
            r2.unscheduleDrawable(r0)
        L_0x000f:
            r2.f3566q = r3
            if (r3 == 0) goto L_0x0036
            r0 = 0
            r2.setWillNotDraw(r0)
            r3.setCallback(r2)
            boolean r0 = r3.isStateful()
            if (r0 == 0) goto L_0x0027
            int[] r0 = r2.getDrawableState()
            r3.setState(r0)
        L_0x0027:
            int r0 = r2.f3569t
            r1 = 119(0x77, float:1.67E-43)
            if (r0 != r1) goto L_0x003a
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.getPadding(r0)
            goto L_0x003a
        L_0x0036:
            r3 = 1
            r2.setWillNotDraw(r3)
        L_0x003a:
            r2.requestLayout()
            r2.invalidate()
        L_0x0040:
            return
    }

    @Override // android.view.View
    public void setForegroundGravity(int r2) {
            r1 = this;
            int r0 = r1.f3569t
            if (r0 == r2) goto L_0x002d
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r0 = r0 & r2
            if (r0 != 0) goto L_0x000e
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r2 = r2 | r0
        L_0x000e:
            r0 = r2 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0014
            r2 = r2 | 48
        L_0x0014:
            r1.f3569t = r2
            int r2 = r1.f3569t
            r0 = 119(0x77, float:1.67E-43)
            if (r2 != r0) goto L_0x002a
            android.graphics.drawable.Drawable r2 = r1.f3566q
            if (r2 == 0) goto L_0x002a
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.drawable.Drawable r0 = r1.f3566q
            r0.getPadding(r2)
        L_0x002a:
            r1.requestLayout()
        L_0x002d:
            return
    }

    @Override // android.view.View
    protected boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto L_0x000d
            android.graphics.drawable.Drawable r0 = r1.f3566q
            if (r2 != r0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            r2 = 0
            goto L_0x000e
        L_0x000d:
            r2 = 1
        L_0x000e:
            return r2
    }
}
