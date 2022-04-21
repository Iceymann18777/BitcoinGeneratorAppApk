package p000a.p001a.p004l.p005a;

/* renamed from: a.a.l.a.c */
/* loaded from: classes.dex */
public class C0024c extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {

    /* renamed from: b */
    private android.graphics.drawable.Drawable f69b;

    public C0024c(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.<init>()
            r0.m4201a(r1)
            return
    }

    /* renamed from: a */
    public android.graphics.drawable.Drawable m4202a() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            return r0
    }

    /* renamed from: a */
    public void m4201a(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f69b
            if (r0 == 0) goto L_0x0008
            r1 = 0
            r0.setCallback(r1)
        L_0x0008:
            r2.f69b = r3
            if (r3 == 0) goto L_0x000f
            r3.setCallback(r2)
        L_0x000f:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            r0.draw(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            int r0 = r0.getChangingConfigurations()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable getCurrent() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            android.graphics.drawable.Drawable r0 = r0.getCurrent()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            int r0 = r0.getIntrinsicHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            int r0 = r0.getIntrinsicWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            int r0 = r0.getMinimumHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            int r0 = r0.getMinimumWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            int r0 = r0.getOpacity()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            boolean r2 = r0.getPadding(r2)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            int[] r0 = r0.getState()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.Region getTransparentRegion() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            android.graphics.Region r0 = r0.getTransparentRegion()
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            boolean r0 = androidx.core.graphics.drawable.C0698a.m1593f(r0)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            boolean r0 = r0.isStateful()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            androidx.core.graphics.drawable.C0698a.m1592g(r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            r0.setBounds(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            boolean r2 = r0.setLevel(r2)
            return r2
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2, long r3) {
            r0 = this;
            r0.scheduleSelf(r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            androidx.core.graphics.drawable.C0698a.m1599a(r0, r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            r0.setChangingConfigurations(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            r0.setColorFilter(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            r0.setDither(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            r0.setFilterBitmap(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float r2, float r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            androidx.core.graphics.drawable.C0698a.m1606a(r0, r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            androidx.core.graphics.drawable.C0698a.m1604a(r0, r2, r3, r4, r5)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            boolean r2 = r0.setState(r2)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            androidx.core.graphics.drawable.C0698a.m1597b(r0, r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            androidx.core.graphics.drawable.C0698a.m1603a(r0, r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f69b
            androidx.core.graphics.drawable.C0698a.m1600a(r0, r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            boolean r0 = super.setVisible(r2, r3)
            if (r0 != 0) goto L_0x0011
            android.graphics.drawable.Drawable r0 = r1.f69b
            boolean r2 = r0.setVisible(r2, r3)
            if (r2 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r2 = 0
            goto L_0x0012
        L_0x0011:
            r2 = 1
        L_0x0012:
            return r2
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2) {
            r0 = this;
            r0.unscheduleSelf(r2)
            return
    }
}
