package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class AlertDialogLayout extends androidx.appcompat.widget.C0593g0 {
    public AlertDialogLayout(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public AlertDialogLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* renamed from: a */
    private void m2253a(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            int r4 = r4 + r2
            int r5 = r5 + r3
            r1.layout(r2, r3, r4, r5)
            return
    }

    /* renamed from: c */
    private static int m2251c(android.view.View r3) {
            int r0 = p000a.p018g.p029l.C0216r.m3410k(r3)
            if (r0 <= 0) goto L_0x0007
            return r0
        L_0x0007:
            boolean r0 = r3 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 == 0) goto L_0x001e
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r0 = r3.getChildCount()
            r2 = 1
            if (r0 != r2) goto L_0x001e
            android.view.View r3 = r3.getChildAt(r1)
            int r3 = m2251c(r3)
            return r3
        L_0x001e:
            return r1
    }

    /* renamed from: c */
    private void m2252c(int r11, int r12) {
            r10 = this;
            int r0 = r10.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r1 = 0
        L_0x000b:
            if (r1 >= r11) goto L_0x003a
            android.view.View r3 = r10.getChildAt(r1)
            int r2 = r3.getVisibility()
            r4 = 8
            if (r2 == r4) goto L_0x0037
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            r8 = r2
            androidx.appcompat.widget.g0$a r8 = (androidx.appcompat.widget.C0593g0.C0594a) r8
            int r2 = r8.width
            r4 = -1
            if (r2 != r4) goto L_0x0037
            int r9 = r8.height
            int r2 = r3.getMeasuredHeight()
            r8.height = r2
            r5 = 0
            r7 = 0
            r2 = r10
            r4 = r0
            r6 = r12
            r2.measureChildWithMargins(r3, r4, r5, r6, r7)
            r8.height = r9
        L_0x0037:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x003a:
            return
    }

    /* renamed from: d */
    private boolean m2250d(int r17, int r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            int r3 = r16.getChildCount()
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r6
            r8 = r7
            r4 = 0
        L_0x0010:
            r9 = 8
            if (r4 >= r3) goto L_0x0040
            android.view.View r10 = r0.getChildAt(r4)
            int r11 = r10.getVisibility()
            if (r11 != r9) goto L_0x001f
            goto L_0x003d
        L_0x001f:
            int r9 = r10.getId()
            int r11 = p000a.p001a.C0005f.topPanel
            if (r9 != r11) goto L_0x0029
            r6 = r10
            goto L_0x003d
        L_0x0029:
            int r11 = p000a.p001a.C0005f.buttonPanel
            if (r9 != r11) goto L_0x002f
            r7 = r10
            goto L_0x003d
        L_0x002f:
            int r11 = p000a.p001a.C0005f.contentPanel
            if (r9 == r11) goto L_0x0039
            int r11 = p000a.p001a.C0005f.customPanel
            if (r9 != r11) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            return r5
        L_0x0039:
            if (r8 == 0) goto L_0x003c
            return r5
        L_0x003c:
            r8 = r10
        L_0x003d:
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0040:
            int r4 = android.view.View.MeasureSpec.getMode(r18)
            int r10 = android.view.View.MeasureSpec.getSize(r18)
            int r11 = android.view.View.MeasureSpec.getMode(r17)
            int r12 = r16.getPaddingTop()
            int r13 = r16.getPaddingBottom()
            int r12 = r12 + r13
            if (r6 == 0) goto L_0x0068
            r6.measure(r1, r5)
            int r13 = r6.getMeasuredHeight()
            int r12 = r12 + r13
            int r6 = r6.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r5, r6)
            goto L_0x0069
        L_0x0068:
            r6 = 0
        L_0x0069:
            if (r7 == 0) goto L_0x0081
            r7.measure(r1, r5)
            int r13 = m2251c(r7)
            int r14 = r7.getMeasuredHeight()
            int r14 = r14 - r13
            int r12 = r12 + r13
            int r15 = r7.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r6, r15)
            goto L_0x0083
        L_0x0081:
            r13 = 0
            r14 = 0
        L_0x0083:
            if (r8 == 0) goto L_0x00a4
            if (r4 != 0) goto L_0x0089
            r15 = 0
            goto L_0x0093
        L_0x0089:
            int r15 = r10 - r12
            int r15 = java.lang.Math.max(r5, r15)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r4)
        L_0x0093:
            r8.measure(r1, r15)
            int r15 = r8.getMeasuredHeight()
            int r12 = r12 + r15
            int r5 = r8.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r6, r5)
            goto L_0x00a5
        L_0x00a4:
            r15 = 0
        L_0x00a5:
            int r10 = r10 - r12
            r5 = 1073741824(0x40000000, float:2.0)
            if (r7 == 0) goto L_0x00c7
            int r12 = r12 - r13
            int r14 = java.lang.Math.min(r10, r14)
            if (r14 <= 0) goto L_0x00b3
            int r10 = r10 - r14
            int r13 = r13 + r14
        L_0x00b3:
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r5)
            r7.measure(r1, r13)
            int r13 = r7.getMeasuredHeight()
            int r12 = r12 + r13
            int r7 = r7.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r6, r7)
        L_0x00c7:
            if (r8 == 0) goto L_0x00e1
            if (r10 <= 0) goto L_0x00e1
            int r12 = r12 - r15
            int r15 = r15 + r10
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r4)
            r8.measure(r1, r4)
            int r4 = r8.getMeasuredHeight()
            int r12 = r12 + r4
            int r4 = r8.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r6, r4)
        L_0x00e1:
            r4 = 0
            r7 = 0
        L_0x00e3:
            if (r4 >= r3) goto L_0x00fa
            android.view.View r8 = r0.getChildAt(r4)
            int r10 = r8.getVisibility()
            if (r10 == r9) goto L_0x00f7
            int r8 = r8.getMeasuredWidth()
            int r7 = java.lang.Math.max(r7, r8)
        L_0x00f7:
            int r4 = r4 + 1
            goto L_0x00e3
        L_0x00fa:
            int r4 = r16.getPaddingLeft()
            int r8 = r16.getPaddingRight()
            int r4 = r4 + r8
            int r7 = r7 + r4
            int r1 = android.view.View.resolveSizeAndState(r7, r1, r6)
            r4 = 0
            int r4 = android.view.View.resolveSizeAndState(r12, r2, r4)
            r0.setMeasuredDimension(r1, r4)
            if (r11 == r5) goto L_0x0115
            r0.m2252c(r3, r2)
        L_0x0115:
            r1 = 1
            return r1
    }

    @Override // androidx.appcompat.widget.C0593g0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r21 - r19
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r0 = r17.getMeasuredHeight()
            int r10 = r17.getChildCount()
            int r1 = r17.getGravity()
            r2 = r1 & 112(0x70, float:1.57E-43)
            r3 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r1 & r3
            r1 = 16
            if (r2 == r1) goto L_0x0040
            r1 = 80
            if (r2 == r1) goto L_0x0035
            int r0 = r17.getPaddingTop()
            goto L_0x004b
        L_0x0035:
            int r1 = r17.getPaddingTop()
            int r1 = r1 + r22
            int r1 = r1 - r20
            int r0 = r1 - r0
            goto L_0x004b
        L_0x0040:
            int r1 = r17.getPaddingTop()
            int r2 = r22 - r20
            int r2 = r2 - r0
            int r2 = r2 / 2
            int r0 = r1 + r2
        L_0x004b:
            android.graphics.drawable.Drawable r1 = r17.getDividerDrawable()
            r2 = 0
            if (r1 != 0) goto L_0x0054
            r12 = 0
            goto L_0x0059
        L_0x0054:
            int r1 = r1.getIntrinsicHeight()
            r12 = r1
        L_0x0059:
            r13 = 0
        L_0x005a:
            if (r13 >= r10) goto L_0x00bd
            android.view.View r1 = r6.getChildAt(r13)
            if (r1 == 0) goto L_0x00ba
            int r2 = r1.getVisibility()
            r3 = 8
            if (r2 == r3) goto L_0x00ba
            int r4 = r1.getMeasuredWidth()
            int r14 = r1.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            r15 = r2
            androidx.appcompat.widget.g0$a r15 = (androidx.appcompat.widget.C0593g0.C0594a) r15
            int r2 = r15.f2125b
            if (r2 >= 0) goto L_0x007e
            r2 = r11
        L_0x007e:
            int r3 = p000a.p018g.p029l.C0216r.m3411j(r17)
            int r2 = p000a.p018g.p029l.C0200c.m3490a(r2, r3)
            r2 = r2 & 7
            r3 = 1
            if (r2 == r3) goto L_0x0095
            r3 = 5
            if (r2 == r3) goto L_0x0092
            int r2 = r15.leftMargin
            int r2 = r2 + r7
            goto L_0x00a0
        L_0x0092:
            int r2 = r8 - r4
            goto L_0x009d
        L_0x0095:
            int r2 = r9 - r4
            int r2 = r2 / 2
            int r2 = r2 + r7
            int r3 = r15.leftMargin
            int r2 = r2 + r3
        L_0x009d:
            int r3 = r15.rightMargin
            int r2 = r2 - r3
        L_0x00a0:
            boolean r3 = r6.m2060b(r13)
            if (r3 == 0) goto L_0x00a7
            int r0 = r0 + r12
        L_0x00a7:
            int r3 = r15.topMargin
            int r16 = r0 + r3
            r0 = r17
            r3 = r16
            r5 = r14
            r0.m2253a(r1, r2, r3, r4, r5)
            int r0 = r15.bottomMargin
            int r14 = r14 + r0
            int r16 = r16 + r14
            r0 = r16
        L_0x00ba:
            int r13 = r13 + 1
            goto L_0x005a
        L_0x00bd:
            return
    }

    @Override // androidx.appcompat.widget.C0593g0, android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.m2250d(r2, r3)
            if (r0 != 0) goto L_0x0009
            super.onMeasure(r2, r3)
        L_0x0009:
            return
    }
}
