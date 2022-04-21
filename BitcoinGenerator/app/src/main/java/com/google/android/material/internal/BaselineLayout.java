package com.google.android.material.internal;

/* loaded from: classes.dex */
public class BaselineLayout extends android.view.ViewGroup {

    /* renamed from: b */
    private int f3548b;

    public BaselineLayout(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            r3 = -1
            r2.f3548b = r3
            return
    }

    public BaselineLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            r2 = -1
            r1.f3548b = r2
            return
    }

    public BaselineLayout(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = -1
            r0.f3548b = r1
            return
    }

    @Override // android.view.View
    public int getBaseline() {
            r1 = this;
            int r0 = r1.f3548b
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            int r7 = r6.getChildCount()
            int r9 = r6.getPaddingLeft()
            int r10 = r10 - r8
            int r8 = r6.getPaddingRight()
            int r10 = r10 - r8
            int r10 = r10 - r9
            int r8 = r6.getPaddingTop()
            r11 = 0
        L_0x0014:
            if (r11 >= r7) goto L_0x004d
            android.view.View r0 = r6.getChildAt(r11)
            int r1 = r0.getVisibility()
            r2 = 8
            if (r1 != r2) goto L_0x0023
            goto L_0x004a
        L_0x0023:
            int r1 = r0.getMeasuredWidth()
            int r2 = r0.getMeasuredHeight()
            int r3 = r10 - r1
            int r3 = r3 / 2
            int r3 = r3 + r9
            int r4 = r6.f3548b
            r5 = -1
            if (r4 == r5) goto L_0x0044
            int r4 = r0.getBaseline()
            if (r4 == r5) goto L_0x0044
            int r4 = r6.f3548b
            int r4 = r4 + r8
            int r5 = r0.getBaseline()
            int r4 = r4 - r5
            goto L_0x0045
        L_0x0044:
            r4 = r8
        L_0x0045:
            int r1 = r1 + r3
            int r2 = r2 + r4
            r0.layout(r3, r4, r1, r2)
        L_0x004a:
            int r11 = r11 + 1
            goto L_0x0014
        L_0x004d:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r12, int r13) {
            r11 = this;
            int r0 = r11.getChildCount()
            r1 = -1
            r2 = 0
            r3 = -1
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x000b:
            if (r2 >= r0) goto L_0x004b
            android.view.View r8 = r11.getChildAt(r2)
            int r9 = r8.getVisibility()
            r10 = 8
            if (r9 != r10) goto L_0x001a
            goto L_0x0048
        L_0x001a:
            r11.measureChild(r8, r12, r13)
            int r9 = r8.getBaseline()
            if (r9 == r1) goto L_0x0030
            int r3 = java.lang.Math.max(r3, r9)
            int r10 = r8.getMeasuredHeight()
            int r10 = r10 - r9
            int r4 = java.lang.Math.max(r4, r10)
        L_0x0030:
            int r9 = r8.getMeasuredWidth()
            int r6 = java.lang.Math.max(r6, r9)
            int r9 = r8.getMeasuredHeight()
            int r5 = java.lang.Math.max(r5, r9)
            int r8 = r8.getMeasuredState()
            int r7 = android.view.View.combineMeasuredStates(r7, r8)
        L_0x0048:
            int r2 = r2 + 1
            goto L_0x000b
        L_0x004b:
            if (r3 == r1) goto L_0x005c
            int r0 = r11.getPaddingBottom()
            int r0 = java.lang.Math.max(r4, r0)
            int r0 = r0 + r3
            int r5 = java.lang.Math.max(r5, r0)
            r11.f3548b = r3
        L_0x005c:
            int r0 = r11.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r5, r0)
            int r1 = r11.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r6, r1)
            int r12 = android.view.View.resolveSizeAndState(r1, r12, r7)
            int r1 = r7 << 16
            int r13 = android.view.View.resolveSizeAndState(r0, r13, r1)
            r11.setMeasuredDimension(r12, r13)
            return
    }
}
