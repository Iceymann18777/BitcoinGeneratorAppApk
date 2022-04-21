package androidx.core.graphics.drawable;

/* renamed from: androidx.core.graphics.drawable.d */
/* loaded from: classes.dex */
class C0701d extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback, androidx.core.graphics.drawable.AbstractC0700c, androidx.core.graphics.drawable.AbstractC0699b {

    /* renamed from: h */
    static final android.graphics.PorterDuff.Mode f2637h = null;

    /* renamed from: b */
    private int f2638b;

    /* renamed from: c */
    private android.graphics.PorterDuff.Mode f2639c;

    /* renamed from: d */
    private boolean f2640d;

    /* renamed from: e */
    androidx.core.graphics.drawable.C0701d.AbstractC0702a f2641e;

    /* renamed from: f */
    private boolean f2642f;

    /* renamed from: g */
    android.graphics.drawable.Drawable f2643g;

    /* renamed from: androidx.core.graphics.drawable.d$a */
    /* loaded from: classes.dex */
    protected static abstract class AbstractC0702a extends android.graphics.drawable.Drawable.ConstantState {

        /* renamed from: a */
        int f2644a;

        /* renamed from: b */
        android.graphics.drawable.Drawable.ConstantState f2645b;

        /* renamed from: c */
        android.content.res.ColorStateList f2646c;

        /* renamed from: d */
        android.graphics.PorterDuff.Mode f2647d;

        AbstractC0702a(androidx.core.graphics.drawable.C0701d.AbstractC0702a r1, android.content.res.Resources r2) {
                r0 = this;
                r0.<init>()
                r2 = 0
                r0.f2646c = r2
                android.graphics.PorterDuff$Mode r2 = androidx.core.graphics.drawable.C0701d.f2637h
                r0.f2647d = r2
                if (r1 == 0) goto L_0x001c
                int r2 = r1.f2644a
                r0.f2644a = r2
                android.graphics.drawable.Drawable$ConstantState r2 = r1.f2645b
                r0.f2645b = r2
                android.content.res.ColorStateList r2 = r1.f2646c
                r0.f2646c = r2
                android.graphics.PorterDuff$Mode r1 = r1.f2647d
                r0.f2647d = r1
            L_0x001c:
                return
        }

        /* renamed from: a */
        boolean m1586a() {
                r1 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r1.f2645b
                if (r0 == 0) goto L_0x0006
                r0 = 1
                goto L_0x0007
            L_0x0006:
                r0 = 0
            L_0x0007:
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r2 = this;
                int r0 = r2.f2644a
                android.graphics.drawable.Drawable$ConstantState r1 = r2.f2645b
                if (r1 == 0) goto L_0x000b
                int r1 = r1.getChangingConfigurations()
                goto L_0x000c
            L_0x000b:
                r1 = 0
            L_0x000c:
                r0 = r0 | r1
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r1 = this;
                r0 = 0
                android.graphics.drawable.Drawable r0 = r1.newDrawable(r0)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public abstract android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r1);
    }

    /* renamed from: androidx.core.graphics.drawable.d$b */
    /* loaded from: classes.dex */
    private static class C0703b extends androidx.core.graphics.drawable.C0701d.AbstractC0702a {
        C0703b(androidx.core.graphics.drawable.C0701d.AbstractC0702a r1, android.content.res.Resources r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.core.graphics.drawable.C0701d.AbstractC0702a, android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
                r1 = this;
                androidx.core.graphics.drawable.d r0 = new androidx.core.graphics.drawable.d
                r0.<init>(r1, r2)
                return r0
        }
    }

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            androidx.core.graphics.drawable.C0701d.f2637h = r0
            return
    }

    C0701d(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.<init>()
            androidx.core.graphics.drawable.d$a r0 = r1.mo1584c()
            r1.f2641e = r0
            r1.mo1588a(r2)
            return
    }

    C0701d(androidx.core.graphics.drawable.C0701d.AbstractC0702a r1, android.content.res.Resources r2) {
            r0 = this;
            r0.<init>()
            r0.f2641e = r1
            r0.m1589a(r2)
            return
    }

    /* renamed from: a */
    private void m1589a(android.content.res.Resources r2) {
            r1 = this;
            androidx.core.graphics.drawable.d$a r0 = r1.f2641e
            if (r0 == 0) goto L_0x000f
            android.graphics.drawable.Drawable$ConstantState r0 = r0.f2645b
            if (r0 == 0) goto L_0x000f
            android.graphics.drawable.Drawable r2 = r0.newDrawable(r2)
            r1.mo1588a(r2)
        L_0x000f:
            return
    }

    /* renamed from: a */
    private boolean m1587a(int[] r5) {
            r4 = this;
            boolean r0 = r4.mo1585b()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            androidx.core.graphics.drawable.d$a r0 = r4.f2641e
            android.content.res.ColorStateList r2 = r0.f2646c
            android.graphics.PorterDuff$Mode r0 = r0.f2647d
            if (r2 == 0) goto L_0x0031
            if (r0 == 0) goto L_0x0031
            int r3 = r2.getDefaultColor()
            int r5 = r2.getColorForState(r5, r3)
            boolean r2 = r4.f2640d
            if (r2 == 0) goto L_0x0026
            int r2 = r4.f2638b
            if (r5 != r2) goto L_0x0026
            android.graphics.PorterDuff$Mode r2 = r4.f2639c
            if (r0 == r2) goto L_0x0036
        L_0x0026:
            r4.setColorFilter(r5, r0)
            r4.f2638b = r5
            r4.f2639c = r0
            r5 = 1
            r4.f2640d = r5
            return r5
        L_0x0031:
            r4.f2640d = r1
            r4.clearColorFilter()
        L_0x0036:
            return r1
    }

    @Override // androidx.core.graphics.drawable.AbstractC0700c
    /* renamed from: a */
    public final android.graphics.drawable.Drawable mo1590a() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2643g
            return r0
    }

    @Override // androidx.core.graphics.drawable.AbstractC0700c
    /* renamed from: a */
    public final void mo1588a(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f2643g
            if (r0 == 0) goto L_0x0008
            r1 = 0
            r0.setCallback(r1)
        L_0x0008:
            r2.f2643g = r3
            if (r3 == 0) goto L_0x0036
            r3.setCallback(r2)
            boolean r0 = r3.isVisible()
            r1 = 1
            r2.setVisible(r0, r1)
            int[] r0 = r3.getState()
            r2.setState(r0)
            int r0 = r3.getLevel()
            r2.setLevel(r0)
            android.graphics.Rect r0 = r3.getBounds()
            r2.setBounds(r0)
            androidx.core.graphics.drawable.d$a r0 = r2.f2641e
            if (r0 == 0) goto L_0x0036
            android.graphics.drawable.Drawable$ConstantState r3 = r3.getConstantState()
            r0.f2645b = r3
        L_0x0036:
            r2.invalidateSelf()
            return
    }

    /* renamed from: b */
    protected boolean mo1585b() {
            r1 = this;
            r0 = 1
            return r0
    }

    /* renamed from: c */
    androidx.core.graphics.drawable.C0701d.AbstractC0702a mo1584c() {
            r3 = this;
            androidx.core.graphics.drawable.d$b r0 = new androidx.core.graphics.drawable.d$b
            androidx.core.graphics.drawable.d$a r1 = r3.f2641e
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2643g
            r0.draw(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
            r2 = this;
            int r0 = super.getChangingConfigurations()
            androidx.core.graphics.drawable.d$a r1 = r2.f2641e
            if (r1 == 0) goto L_0x000d
            int r1 = r1.getChangingConfigurations()
            goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            r0 = r0 | r1
            android.graphics.drawable.Drawable r1 = r2.f2643g
            int r1 = r1.getChangingConfigurations()
            r0 = r0 | r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r2 = this;
            androidx.core.graphics.drawable.d$a r0 = r2.f2641e
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.m1586a()
            if (r0 == 0) goto L_0x0015
            androidx.core.graphics.drawable.d$a r0 = r2.f2641e
            int r1 = r2.getChangingConfigurations()
            r0.f2644a = r1
            androidx.core.graphics.drawable.d$a r0 = r2.f2641e
            return r0
        L_0x0015:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable getCurrent() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2643g
            android.graphics.drawable.Drawable r0 = r0.getCurrent()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2643g
            int r0 = r0.getIntrinsicHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2643g
            int r0 = r0.getIntrinsicWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2643g
            int r0 = r0.getMinimumHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2643g
            int r0 = r0.getMinimumWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2643g
            int r0 = r0.getOpacity()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2643g
            boolean r2 = r0.getPadding(r2)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2643g
            int[] r0 = r0.getState()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.Region getTransparentRegion() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2643g
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
            android.graphics.drawable.Drawable r0 = r1.f2643g
            boolean r0 = r0.isAutoMirrored()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            boolean r0 = r1.mo1585b()
            if (r0 == 0) goto L_0x000d
            androidx.core.graphics.drawable.d$a r0 = r1.f2641e
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.f2646c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.f2643g
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2643g
            r0.jumpToCurrentState()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r2 = this;
            boolean r0 = r2.f2642f
            if (r0 != 0) goto L_0x002a
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r2) goto L_0x002a
            androidx.core.graphics.drawable.d$a r0 = r2.mo1584c()
            r2.f2641e = r0
            android.graphics.drawable.Drawable r0 = r2.f2643g
            if (r0 == 0) goto L_0x0017
            r0.mutate()
        L_0x0017:
            androidx.core.graphics.drawable.d$a r0 = r2.f2641e
            if (r0 == 0) goto L_0x0027
            android.graphics.drawable.Drawable r1 = r2.f2643g
            if (r1 == 0) goto L_0x0024
            android.graphics.drawable.Drawable$ConstantState r1 = r1.getConstantState()
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            r0.f2645b = r1
        L_0x0027:
            r0 = 1
            r2.f2642f = r0
        L_0x002a:
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2643g
            if (r0 == 0) goto L_0x0007
            r0.setBounds(r2)
        L_0x0007:
            return
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2643g
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
            android.graphics.drawable.Drawable r0 = r1.f2643g
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2643g
            r0.setAutoMirrored(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2643g
            r0.setChangingConfigurations(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2643g
            r0.setColorFilter(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2643g
            r0.setDither(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2643g
            r0.setFilterBitmap(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2643g
            boolean r0 = r0.setState(r2)
            boolean r2 = r1.m1587a(r2)
            if (r2 != 0) goto L_0x0011
            if (r0 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r2 = 0
            goto L_0x0012
        L_0x0011:
            r2 = 1
        L_0x0012:
            return r2
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.AbstractC0699b
    public void setTint(int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setTintList(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.AbstractC0699b
    public void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.core.graphics.drawable.d$a r0 = r1.f2641e
            r0.f2646c = r2
            int[] r2 = r1.getState()
            r1.m1587a(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.AbstractC0699b
    public void setTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.core.graphics.drawable.d$a r0 = r1.f2641e
            r0.f2647d = r2
            int[] r2 = r1.getState()
            r1.m1587a(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            boolean r0 = super.setVisible(r2, r3)
            if (r0 != 0) goto L_0x0011
            android.graphics.drawable.Drawable r0 = r1.f2643g
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
