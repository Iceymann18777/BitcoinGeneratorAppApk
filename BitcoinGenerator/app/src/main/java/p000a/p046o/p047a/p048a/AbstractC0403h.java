package p000a.p046o.p047a.p048a;

/* renamed from: a.o.a.a.h */
/* loaded from: classes.dex */
abstract class AbstractC0403h extends android.graphics.drawable.Drawable implements androidx.core.graphics.drawable.AbstractC0699b {

    /* renamed from: b */
    android.graphics.drawable.Drawable f1208b;

    AbstractC0403h() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0007
            androidx.core.graphics.drawable.C0698a.m1602a(r0, r2)
        L_0x0007:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0008
            r0.clearColorFilter()
            return
        L_0x0008:
            super.clearColorFilter()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0009
            android.graphics.ColorFilter r0 = androidx.core.graphics.drawable.C0698a.m1595d(r0)
            return r0
        L_0x0009:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable getCurrent() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0009
            android.graphics.drawable.Drawable r0 = r0.getCurrent()
            return r0
        L_0x0009:
            android.graphics.drawable.Drawable r0 = super.getCurrent()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0009
            int r0 = r0.getMinimumHeight()
            return r0
        L_0x0009:
            int r0 = super.getMinimumHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0009
            int r0 = r0.getMinimumWidth()
            return r0
        L_0x0009:
            int r0 = super.getMinimumWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0009
            boolean r2 = r0.getPadding(r2)
            return r2
        L_0x0009:
            boolean r2 = super.getPadding(r2)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0009
            int[] r0 = r0.getState()
            return r0
        L_0x0009:
            int[] r0 = super.getState()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.Region getTransparentRegion() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0009
            android.graphics.Region r0 = r0.getTransparentRegion()
            return r0
        L_0x0009:
            android.graphics.Region r0 = super.getTransparentRegion()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0007
            androidx.core.graphics.drawable.C0698a.m1592g(r0)
        L_0x0007:
            return
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0009
            boolean r2 = r0.setLevel(r2)
            return r2
        L_0x0009:
            boolean r2 = super.onLevelChange(r2)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0008
            r0.setChangingConfigurations(r2)
            return
        L_0x0008:
            super.setChangingConfigurations(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int r2, android.graphics.PorterDuff.Mode r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0008
            r0.setColorFilter(r2, r3)
            return
        L_0x0008:
            super.setColorFilter(r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0007
            r0.setFilterBitmap(r2)
        L_0x0007:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float r2, float r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0007
            androidx.core.graphics.drawable.C0698a.m1606a(r0, r2, r3)
        L_0x0007:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0007
            androidx.core.graphics.drawable.C0698a.m1604a(r0, r2, r3, r4, r5)
        L_0x0007:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0009
            boolean r2 = r0.setState(r2)
            return r2
        L_0x0009:
            boolean r2 = super.setState(r2)
            return r2
    }
}
