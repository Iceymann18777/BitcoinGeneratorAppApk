package androidx.core.graphics.drawable;

/* renamed from: androidx.core.graphics.drawable.e */
/* loaded from: classes.dex */
class C0704e extends androidx.core.graphics.drawable.C0701d {

    /* renamed from: i */
    private static java.lang.reflect.Method f2648i;

    /* renamed from: androidx.core.graphics.drawable.e$a */
    /* loaded from: classes.dex */
    private static class C0705a extends androidx.core.graphics.drawable.C0701d.AbstractC0702a {
        C0705a(androidx.core.graphics.drawable.C0701d.AbstractC0702a r1, android.content.res.Resources r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.core.graphics.drawable.C0701d.AbstractC0702a, android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
                r1 = this;
                androidx.core.graphics.drawable.e r0 = new androidx.core.graphics.drawable.e
                r0.<init>(r1, r2)
                return r0
        }
    }

    C0704e(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.<init>(r1)
            r0.m1583d()
            return
    }

    C0704e(androidx.core.graphics.drawable.C0701d.AbstractC0702a r1, android.content.res.Resources r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.m1583d()
            return
    }

    /* renamed from: d */
    private void m1583d() {
            r3 = this;
            java.lang.reflect.Method r0 = androidx.core.graphics.drawable.C0704e.f2648i
            if (r0 != 0) goto L_0x001a
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            java.lang.String r1 = "isProjected"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: Exception -> 0x0012
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: Exception -> 0x0012
            androidx.core.graphics.drawable.C0704e.f2648i = r0     // Catch: Exception -> 0x0012
            goto L_0x001a
        L_0x0012:
            r0 = move-exception
            java.lang.String r1 = "WrappedDrawableApi21"
            java.lang.String r2 = "Failed to retrieve Drawable#isProjected() method"
            android.util.Log.w(r1, r2, r0)
        L_0x001a:
            return
    }

    @Override // androidx.core.graphics.drawable.C0701d
    /* renamed from: b */
    protected boolean mo1585b() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 21
            if (r0 != r2) goto L_0x001a
            android.graphics.drawable.Drawable r0 = r3.f2643g
            boolean r2 = r0 instanceof android.graphics.drawable.GradientDrawable
            if (r2 != 0) goto L_0x0019
            boolean r2 = r0 instanceof android.graphics.drawable.DrawableContainer
            if (r2 != 0) goto L_0x0019
            boolean r2 = r0 instanceof android.graphics.drawable.InsetDrawable
            if (r2 != 0) goto L_0x0019
            boolean r0 = r0 instanceof android.graphics.drawable.RippleDrawable
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r1 = 1
        L_0x001a:
            return r1
    }

    @Override // androidx.core.graphics.drawable.C0701d
    /* renamed from: c */
    androidx.core.graphics.drawable.C0701d.AbstractC0702a mo1584c() {
            r3 = this;
            androidx.core.graphics.drawable.e$a r0 = new androidx.core.graphics.drawable.e$a
            androidx.core.graphics.drawable.d$a r1 = r3.f2641e
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.Rect getDirtyBounds() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2643g
            android.graphics.Rect r0 = r0.getDirtyBounds()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2643g
            r0.getOutline(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float r2, float r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2643g
            r0.setHotspot(r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2643g
            r0.setHotspotBounds(r2, r3, r4, r5)
            return
    }

    @Override // androidx.core.graphics.drawable.C0701d, android.graphics.drawable.Drawable
    public boolean setState(int[] r1) {
            r0 = this;
            boolean r1 = super.setState(r1)
            if (r1 == 0) goto L_0x000b
            r0.invalidateSelf()
            r1 = 1
            return r1
        L_0x000b:
            r1 = 0
            return r1
    }

    @Override // androidx.core.graphics.drawable.C0701d, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.AbstractC0699b
    public void setTint(int r2) {
            r1 = this;
            boolean r0 = r1.mo1585b()
            if (r0 == 0) goto L_0x000a
            super.setTint(r2)
            goto L_0x000f
        L_0x000a:
            android.graphics.drawable.Drawable r0 = r1.f2643g
            r0.setTint(r2)
        L_0x000f:
            return
    }

    @Override // androidx.core.graphics.drawable.C0701d, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.AbstractC0699b
    public void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            boolean r0 = r1.mo1585b()
            if (r0 == 0) goto L_0x000a
            super.setTintList(r2)
            goto L_0x000f
        L_0x000a:
            android.graphics.drawable.Drawable r0 = r1.f2643g
            r0.setTintList(r2)
        L_0x000f:
            return
    }

    @Override // androidx.core.graphics.drawable.C0701d, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.AbstractC0699b
    public void setTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            boolean r0 = r1.mo1585b()
            if (r0 == 0) goto L_0x000a
            super.setTintMode(r2)
            goto L_0x000f
        L_0x000a:
            android.graphics.drawable.Drawable r0 = r1.f2643g
            r0.setTintMode(r2)
        L_0x000f:
            return
    }
}
