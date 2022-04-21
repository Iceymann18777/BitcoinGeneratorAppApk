package com.google.android.material.snackbar;

/* loaded from: classes.dex */
public final class Snackbar$SnackbarLayout extends com.google.android.material.snackbar.C0991d {
    public Snackbar$SnackbarLayout(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public Snackbar$SnackbarLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r6, int r7) {
            r5 = this;
            super.onMeasure(r6, r7)
            int r6 = r5.getChildCount()
            int r7 = r5.getMeasuredWidth()
            int r0 = r5.getPaddingLeft()
            int r7 = r7 - r0
            int r0 = r5.getPaddingRight()
            int r7 = r7 - r0
            r0 = 0
        L_0x0016:
            if (r0 >= r6) goto L_0x0039
            android.view.View r1 = r5.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            int r2 = r2.width
            r3 = -1
            if (r2 != r3) goto L_0x0036
            r2 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r2)
            int r4 = r1.getMeasuredHeight()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            r1.measure(r3, r2)
        L_0x0036:
            int r0 = r0 + 1
            goto L_0x0016
        L_0x0039:
            return
    }
}
