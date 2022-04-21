package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.y */
/* loaded from: classes.dex */
public class C0658y extends android.widget.TextView implements p000a.p018g.p029l.AbstractC0215q, androidx.core.widget.AbstractC0713b {

    /* renamed from: b */
    private final androidx.appcompat.widget.C0585e f2366b;

    /* renamed from: c */
    private final androidx.appcompat.widget.C0655x f2367c;

    /* renamed from: d */
    private java.util.concurrent.Future<p000a.p018g.p027j.C0175a> f2368d;

    public C0658y(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public C0658y(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 16842884(0x1010084, float:2.3693928E-38)
            r1.<init>(r2, r3, r0)
            return
    }

    public C0658y(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            android.content.Context r1 = androidx.appcompat.widget.C0632q0.m1914b(r1)
            r0.<init>(r1, r2, r3)
            androidx.appcompat.widget.e r1 = new androidx.appcompat.widget.e
            r1.<init>(r0)
            r0.f2366b = r1
            androidx.appcompat.widget.e r1 = r0.f2366b
            r1.m2084a(r2, r3)
            androidx.appcompat.widget.x r1 = new androidx.appcompat.widget.x
            r1.<init>(r0)
            r0.f2367c = r1
            androidx.appcompat.widget.x r1 = r0.f2367c
            r1.m1814a(r2, r3)
            androidx.appcompat.widget.x r1 = r0.f2367c
            r1.m1822a()
            return
    }

    /* renamed from: d */
    private void m1794d() {
            r2 = this;
            java.util.concurrent.Future<a.g.j.a> r0 = r2.f2368d
            if (r0 == 0) goto L_0x0010
            r1 = 0
            r2.f2368d = r1     // Catch: InterruptedException | ExecutionException -> 0x0010
            java.lang.Object r0 = r0.get()     // Catch: InterruptedException | ExecutionException -> 0x0010
            a.g.j.a r0 = (p000a.p018g.p027j.C0175a) r0     // Catch: InterruptedException | ExecutionException -> 0x0010
            androidx.core.widget.C0720i.m1493a(r2, r0)     // Catch: InterruptedException | ExecutionException -> 0x0010
        L_0x0010:
            return
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.e r0 = r1.f2366b
            if (r0 == 0) goto L_0x000a
            r0.m2089a()
        L_0x000a:
            androidx.appcompat.widget.x r0 = r1.f2367c
            if (r0 == 0) goto L_0x0011
            r0.m1822a()
        L_0x0011:
            return
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
            r1 = this;
            boolean r0 = androidx.core.widget.AbstractC0713b.f2708a
            if (r0 == 0) goto L_0x0009
            int r0 = super.getAutoSizeMaxTextSize()
            return r0
        L_0x0009:
            androidx.appcompat.widget.x r0 = r1.f2367c
            if (r0 == 0) goto L_0x0012
            int r0 = r0.m1807c()
            return r0
        L_0x0012:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
            r1 = this;
            boolean r0 = androidx.core.widget.AbstractC0713b.f2708a
            if (r0 == 0) goto L_0x0009
            int r0 = super.getAutoSizeMinTextSize()
            return r0
        L_0x0009:
            androidx.appcompat.widget.x r0 = r1.f2367c
            if (r0 == 0) goto L_0x0012
            int r0 = r0.m1806d()
            return r0
        L_0x0012:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
            r1 = this;
            boolean r0 = androidx.core.widget.AbstractC0713b.f2708a
            if (r0 == 0) goto L_0x0009
            int r0 = super.getAutoSizeStepGranularity()
            return r0
        L_0x0009:
            androidx.appcompat.widget.x r0 = r1.f2367c
            if (r0 == 0) goto L_0x0012
            int r0 = r0.m1805e()
            return r0
        L_0x0012:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
            r1 = this;
            boolean r0 = androidx.core.widget.AbstractC0713b.f2708a
            if (r0 == 0) goto L_0x0009
            int[] r0 = super.getAutoSizeTextAvailableSizes()
            return r0
        L_0x0009:
            androidx.appcompat.widget.x r0 = r1.f2367c
            if (r0 == 0) goto L_0x0012
            int[] r0 = r0.m1804f()
            return r0
        L_0x0012:
            r0 = 0
            int[] r0 = new int[r0]
            return r0
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
            r3 = this;
            boolean r0 = androidx.core.widget.AbstractC0713b.f2708a
            r1 = 0
            if (r0 == 0) goto L_0x000e
            int r0 = super.getAutoSizeTextType()
            r2 = 1
            if (r0 != r2) goto L_0x000d
            r1 = 1
        L_0x000d:
            return r1
        L_0x000e:
            androidx.appcompat.widget.x r0 = r3.f2367c
            if (r0 == 0) goto L_0x0017
            int r0 = r0.m1803g()
            return r0
        L_0x0017:
            return r1
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
            r1 = this;
            int r0 = androidx.core.widget.C0720i.m1496a(r1)
            return r0
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
            r1 = this;
            int r0 = androidx.core.widget.C0720i.m1490b(r1)
            return r0
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            androidx.appcompat.widget.e r0 = r1.f2366b
            if (r0 == 0) goto L_0x0009
            android.content.res.ColorStateList r0 = r0.m2083b()
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            return r0
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            androidx.appcompat.widget.e r0 = r1.f2366b
            if (r0 == 0) goto L_0x0009
            android.graphics.PorterDuff$Mode r0 = r0.m2080c()
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            return r0
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getText() {
            r1 = this;
            r1.m1794d()
            java.lang.CharSequence r0 = super.getText()
            return r0
    }

    public p000a.p018g.p027j.C0175a.C0176a getTextMetricsParamsCompat() {
            r1 = this;
            a.g.j.a$a r0 = androidx.core.widget.C0720i.m1486d(r1)
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r2) {
            r1 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r2)
            androidx.appcompat.widget.C0616l.m1972a(r0, r2, r1)
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            super.onLayout(r7, r8, r9, r10, r11)
            androidx.appcompat.widget.x r0 = r6.f2367c
            if (r0 == 0) goto L_0x000f
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.m1811a(r1, r2, r3, r4, r5)
        L_0x000f:
            return
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int r1, int r2) {
            r0 = this;
            r0.m1794d()
            super.onMeasure(r1, r2)
            return
    }

    @Override // android.widget.TextView
    protected void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            androidx.appcompat.widget.x r1 = r0.f2367c
            if (r1 == 0) goto L_0x0016
            boolean r2 = androidx.core.widget.AbstractC0713b.f2708a
            if (r2 != 0) goto L_0x0016
            boolean r1 = r1.m1802h()
            if (r1 == 0) goto L_0x0016
            androidx.appcompat.widget.x r1 = r0.f2367c
            r1.m1809b()
        L_0x0016:
            return
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) {
            r1 = this;
            boolean r0 = androidx.core.widget.AbstractC0713b.f2708a
            if (r0 == 0) goto L_0x0008
            super.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            goto L_0x000f
        L_0x0008:
            androidx.appcompat.widget.x r0 = r1.f2367c
            if (r0 == 0) goto L_0x000f
            r0.m1819a(r2, r3, r4, r5)
        L_0x000f:
            return
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] r2, int r3) {
            r1 = this;
            boolean r0 = androidx.core.widget.AbstractC0713b.f2708a
            if (r0 == 0) goto L_0x0008
            super.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3)
            goto L_0x000f
        L_0x0008:
            androidx.appcompat.widget.x r0 = r1.f2367c
            if (r0 == 0) goto L_0x000f
            r0.m1810a(r2, r3)
        L_0x000f:
            return
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int r2) {
            r1 = this;
            boolean r0 = androidx.core.widget.AbstractC0713b.f2708a
            if (r0 == 0) goto L_0x0008
            super.setAutoSizeTextTypeWithDefaults(r2)
            goto L_0x000f
        L_0x0008:
            androidx.appcompat.widget.x r0 = r1.f2367c
            if (r0 == 0) goto L_0x000f
            r0.m1821a(r2)
        L_0x000f:
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            super.setBackgroundDrawable(r2)
            androidx.appcompat.widget.e r0 = r1.f2366b
            if (r0 == 0) goto L_0x000a
            r0.m2085a(r2)
        L_0x000a:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            androidx.appcompat.widget.e r0 = r1.f2366b
            if (r0 == 0) goto L_0x000a
            r0.m2088a(r2)
        L_0x000a:
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.ActionMode$Callback r1 = androidx.core.widget.C0720i.m1491a(r0, r1)
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x000a
            super.setFirstBaselineToTopHeight(r3)
            goto L_0x000d
        L_0x000a:
            androidx.core.widget.C0720i.m1495a(r2, r3)
        L_0x000d:
            return
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x000a
            super.setLastBaselineToBottomHeight(r3)
            goto L_0x000d
        L_0x000a:
            androidx.core.widget.C0720i.m1489b(r2, r3)
        L_0x000d:
            return
    }

    @Override // android.widget.TextView
    public void setLineHeight(int r1) {
            r0 = this;
            androidx.core.widget.C0720i.m1487c(r0, r1)
            return
    }

    public void setPrecomputedText(p000a.p018g.p027j.C0175a r1) {
            r0 = this;
            androidx.core.widget.C0720i.m1493a(r0, r1)
            return
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.e r0 = r1.f2366b
            if (r0 == 0) goto L_0x0007
            r0.m2082b(r2)
        L_0x0007:
            return
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.e r0 = r1.f2366b
            if (r0 == 0) goto L_0x0007
            r0.m2086a(r2)
        L_0x0007:
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context r2, int r3) {
            r1 = this;
            super.setTextAppearance(r2, r3)
            androidx.appcompat.widget.x r0 = r1.f2367c
            if (r0 == 0) goto L_0x000a
            r0.m1818a(r2, r3)
        L_0x000a:
            return
    }

    public void setTextFuture(java.util.concurrent.Future<p000a.p018g.p027j.C0175a> r1) {
            r0 = this;
            r0.f2368d = r1
            r0.requestLayout()
            return
    }

    public void setTextMetricsParamsCompat(p000a.p018g.p027j.C0175a.C0176a r1) {
            r0 = this;
            androidx.core.widget.C0720i.m1494a(r0, r1)
            return
    }

    @Override // android.widget.TextView
    public void setTextSize(int r2, float r3) {
            r1 = this;
            boolean r0 = androidx.core.widget.AbstractC0713b.f2708a
            if (r0 == 0) goto L_0x0008
            super.setTextSize(r2, r3)
            goto L_0x000f
        L_0x0008:
            androidx.appcompat.widget.x r0 = r1.f2367c
            if (r0 == 0) goto L_0x000f
            r0.m1820a(r2, r3)
        L_0x000f:
            return
    }
}
