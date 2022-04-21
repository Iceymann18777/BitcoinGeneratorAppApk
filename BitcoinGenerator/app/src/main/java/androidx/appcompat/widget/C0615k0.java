package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.k0 */
/* loaded from: classes.dex */
class C0615k0 extends android.content.res.Resources {

    /* renamed from: a */
    private final android.content.res.Resources f2198a;

    public C0615k0(android.content.res.Resources r4) {
            r3 = this;
            android.content.res.AssetManager r0 = r4.getAssets()
            android.util.DisplayMetrics r1 = r4.getDisplayMetrics()
            android.content.res.Configuration r2 = r4.getConfiguration()
            r3.<init>(r0, r1, r2)
            r3.f2198a = r4
            return
    }

    @Override // android.content.res.Resources
    public android.content.res.XmlResourceParser getAnimation(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            android.content.res.XmlResourceParser r2 = r0.getAnimation(r2)
            return r2
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            boolean r2 = r0.getBoolean(r2)
            return r2
    }

    @Override // android.content.res.Resources
    public int getColor(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            int r2 = r0.getColor(r2)
            return r2
    }

    @Override // android.content.res.Resources
    public android.content.res.ColorStateList getColorStateList(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            android.content.res.ColorStateList r2 = r0.getColorStateList(r2)
            return r2
    }

    @Override // android.content.res.Resources
    public android.content.res.Configuration getConfiguration() {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            android.content.res.Configuration r0 = r0.getConfiguration()
            return r0
    }

    @Override // android.content.res.Resources
    public float getDimension(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            float r2 = r0.getDimension(r2)
            return r2
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            int r2 = r0.getDimensionPixelOffset(r2)
            return r2
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            int r2 = r0.getDimensionPixelSize(r2)
            return r2
    }

    @Override // android.content.res.Resources
    public android.util.DisplayMetrics getDisplayMetrics() {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            return r0
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            return r2
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int r2, android.content.res.Resources.Theme r3) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2, r3)
            return r2
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawableForDensity(int r2, int r3) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            android.graphics.drawable.Drawable r2 = r0.getDrawableForDensity(r2, r3)
            return r2
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawableForDensity(int r2, int r3, android.content.res.Resources.Theme r4) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            android.graphics.drawable.Drawable r2 = r0.getDrawableForDensity(r2, r3, r4)
            return r2
    }

    @Override // android.content.res.Resources
    public float getFraction(int r2, int r3, int r4) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            float r2 = r0.getFraction(r2, r3, r4)
            return r2
    }

    @Override // android.content.res.Resources
    public int getIdentifier(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            int r2 = r0.getIdentifier(r2, r3, r4)
            return r2
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            int[] r2 = r0.getIntArray(r2)
            return r2
    }

    @Override // android.content.res.Resources
    public int getInteger(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            int r2 = r0.getInteger(r2)
            return r2
    }

    @Override // android.content.res.Resources
    public android.content.res.XmlResourceParser getLayout(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            android.content.res.XmlResourceParser r2 = r0.getLayout(r2)
            return r2
    }

    @Override // android.content.res.Resources
    public android.graphics.Movie getMovie(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            android.graphics.Movie r2 = r0.getMovie(r2)
            return r2
    }

    @Override // android.content.res.Resources
    public java.lang.String getQuantityString(int r2, int r3) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            java.lang.String r2 = r0.getQuantityString(r2, r3)
            return r2
    }

    @Override // android.content.res.Resources
    public java.lang.String getQuantityString(int r2, int r3, java.lang.Object... r4) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            java.lang.String r2 = r0.getQuantityString(r2, r3, r4)
            return r2
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence getQuantityText(int r2, int r3) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            java.lang.CharSequence r2 = r0.getQuantityText(r2, r3)
            return r2
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourceEntryName(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            java.lang.String r2 = r0.getResourceEntryName(r2)
            return r2
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourceName(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            java.lang.String r2 = r0.getResourceName(r2)
            return r2
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourcePackageName(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            java.lang.String r2 = r0.getResourcePackageName(r2)
            return r2
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourceTypeName(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            java.lang.String r2 = r0.getResourceTypeName(r2)
            return r2
    }

    @Override // android.content.res.Resources
    public java.lang.String getString(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            java.lang.String r2 = r0.getString(r2)
            return r2
    }

    @Override // android.content.res.Resources
    public java.lang.String getString(int r2, java.lang.Object... r3) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            java.lang.String r2 = r0.getString(r2, r3)
            return r2
    }

    @Override // android.content.res.Resources
    public java.lang.String[] getStringArray(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            java.lang.String[] r2 = r0.getStringArray(r2)
            return r2
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence getText(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            java.lang.CharSequence r2 = r0.getText(r2)
            return r2
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence getText(int r2, java.lang.CharSequence r3) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            java.lang.CharSequence r2 = r0.getText(r2, r3)
            return r2
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence[] getTextArray(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            java.lang.CharSequence[] r2 = r0.getTextArray(r2)
            return r2
    }

    @Override // android.content.res.Resources
    public void getValue(int r2, android.util.TypedValue r3, boolean r4) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            r0.getValue(r2, r3, r4)
            return
    }

    @Override // android.content.res.Resources
    public void getValue(java.lang.String r2, android.util.TypedValue r3, boolean r4) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            r0.getValue(r2, r3, r4)
            return
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int r2, int r3, android.util.TypedValue r4, boolean r5) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            r0.getValueForDensity(r2, r3, r4, r5)
            return
    }

    @Override // android.content.res.Resources
    public android.content.res.XmlResourceParser getXml(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            android.content.res.XmlResourceParser r2 = r0.getXml(r2)
            return r2
    }

    @Override // android.content.res.Resources
    public android.content.res.TypedArray obtainAttributes(android.util.AttributeSet r2, int[] r3) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            android.content.res.TypedArray r2 = r0.obtainAttributes(r2, r3)
            return r2
    }

    @Override // android.content.res.Resources
    public android.content.res.TypedArray obtainTypedArray(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            android.content.res.TypedArray r2 = r0.obtainTypedArray(r2)
            return r2
    }

    @Override // android.content.res.Resources
    public java.io.InputStream openRawResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            java.io.InputStream r2 = r0.openRawResource(r2)
            return r2
    }

    @Override // android.content.res.Resources
    public java.io.InputStream openRawResource(int r2, android.util.TypedValue r3) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            java.io.InputStream r2 = r0.openRawResource(r2, r3)
            return r2
    }

    @Override // android.content.res.Resources
    public android.content.res.AssetFileDescriptor openRawResourceFd(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            android.content.res.AssetFileDescriptor r2 = r0.openRawResourceFd(r2)
            return r2
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(java.lang.String r2, android.util.AttributeSet r3, android.os.Bundle r4) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            r0.parseBundleExtra(r2, r3, r4)
            return
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(android.content.res.XmlResourceParser r2, android.os.Bundle r3) {
            r1 = this;
            android.content.res.Resources r0 = r1.f2198a
            r0.parseBundleExtras(r2, r3)
            return
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(android.content.res.Configuration r2, android.util.DisplayMetrics r3) {
            r1 = this;
            super.updateConfiguration(r2, r3)
            android.content.res.Resources r0 = r1.f2198a
            if (r0 == 0) goto L_0x000a
            r0.updateConfiguration(r2, r3)
        L_0x000a:
            return
    }
}
