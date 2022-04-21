package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ButtonBarLayout extends android.widget.LinearLayout {

    /* renamed from: b */
    private boolean f1884b;

    /* renamed from: c */
    private int f1885c;

    /* renamed from: d */
    private int f1886d;

    public ButtonBarLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = -1
            r1.f1885c = r0
            r0 = 0
            r1.f1886d = r0
            int[] r0 = p000a.p001a.C0009j.ButtonBarLayout
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            int r3 = p000a.p001a.C0009j.ButtonBarLayout_allowStacking
            r0 = 1
            boolean r3 = r2.getBoolean(r3, r0)
            r1.f1884b = r3
            r2.recycle()
            return
    }

    /* renamed from: a */
    private int m2248a(int r3) {
            r2 = this;
            int r0 = r2.getChildCount()
        L_0x0004:
            if (r3 >= r0) goto L_0x0014
            android.view.View r1 = r2.getChildAt(r3)
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0011
            return r3
        L_0x0011:
            int r3 = r3 + 1
            goto L_0x0004
        L_0x0014:
            r3 = -1
            return r3
    }

    /* renamed from: a */
    private boolean m2249a() {
            r2 = this;
            int r0 = r2.getOrientation()
            r1 = 1
            if (r0 != r1) goto L_0x0008
            goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            return r1
    }

    private void setStacked(boolean r2) {
            r1 = this;
            r1.setOrientation(r2)
            if (r2 == 0) goto L_0x0007
            r0 = 5
            goto L_0x0009
        L_0x0007:
            r0 = 80
        L_0x0009:
            r1.setGravity(r0)
            int r0 = p000a.p001a.C0005f.spacer
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L_0x001d
            if (r2 == 0) goto L_0x0019
            r2 = 8
            goto L_0x001a
        L_0x0019:
            r2 = 4
        L_0x001a:
            r0.setVisibility(r2)
        L_0x001d:
            int r2 = r1.getChildCount()
            int r2 = r2 + (-2)
        L_0x0023:
            if (r2 < 0) goto L_0x002f
            android.view.View r0 = r1.getChildAt(r2)
            r1.bringChildToFront(r0)
            int r2 = r2 + (-1)
            goto L_0x0023
        L_0x002f:
            return
    }

    @Override // android.view.View
    public int getMinimumHeight() {
            r2 = this;
            int r0 = r2.f1886d
            int r1 = super.getMinimumHeight()
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int r6, int r7) {
            r5 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            boolean r1 = r5.f1884b
            r2 = 0
            if (r1 == 0) goto L_0x0018
            int r1 = r5.f1885c
            if (r0 <= r1) goto L_0x0016
            boolean r1 = r5.m2249a()
            if (r1 == 0) goto L_0x0016
            r5.setStacked(r2)
        L_0x0016:
            r5.f1885c = r0
        L_0x0018:
            boolean r1 = r5.m2249a()
            r3 = 1
            if (r1 != 0) goto L_0x002f
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 != r4) goto L_0x002f
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r1 = 1
            goto L_0x0031
        L_0x002f:
            r0 = r6
            r1 = 0
        L_0x0031:
            super.onMeasure(r0, r7)
            boolean r0 = r5.f1884b
            if (r0 == 0) goto L_0x0052
            boolean r0 = r5.m2249a()
            if (r0 != 0) goto L_0x0052
            int r0 = r5.getMeasuredWidthAndState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r4
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 != r4) goto L_0x004b
            r0 = 1
            goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            if (r0 == 0) goto L_0x0052
            r5.setStacked(r3)
            r1 = 1
        L_0x0052:
            if (r1 == 0) goto L_0x0057
            super.onMeasure(r6, r7)
        L_0x0057:
            int r6 = r5.m2248a(r2)
            if (r6 < 0) goto L_0x00a5
            android.view.View r7 = r5.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r1 = r5.getPaddingTop()
            int r7 = r7.getMeasuredHeight()
            int r1 = r1 + r7
            int r7 = r0.topMargin
            int r1 = r1 + r7
            int r7 = r0.bottomMargin
            int r1 = r1 + r7
            int r1 = r1 + r2
            boolean r7 = r5.m2249a()
            if (r7 == 0) goto L_0x009f
            int r6 = r6 + r3
            int r6 = r5.m2248a(r6)
            if (r6 < 0) goto L_0x009d
            android.view.View r6 = r5.getChildAt(r6)
            int r6 = r6.getPaddingTop()
            r7 = 1098907648(0x41800000, float:16.0)
            android.content.res.Resources r0 = r5.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r0 = r0 * r7
            int r7 = (int) r0
            int r6 = r6 + r7
            int r1 = r1 + r6
        L_0x009d:
            r2 = r1
            goto L_0x00a5
        L_0x009f:
            int r6 = r5.getPaddingBottom()
            int r2 = r1 + r6
        L_0x00a5:
            int r6 = p000a.p018g.p029l.C0216r.m3410k(r5)
            if (r6 == r2) goto L_0x00ae
            r5.setMinimumHeight(r2)
        L_0x00ae:
            return
    }

    public void setAllowStacking(boolean r2) {
            r1 = this;
            boolean r0 = r1.f1884b
            if (r0 == r2) goto L_0x0018
            r1.f1884b = r2
            boolean r2 = r1.f1884b
            if (r2 != 0) goto L_0x0015
            int r2 = r1.getOrientation()
            r0 = 1
            if (r2 != r0) goto L_0x0015
            r2 = 0
            r1.setStacked(r2)
        L_0x0015:
            r1.requestLayout()
        L_0x0018:
            return
    }
}
