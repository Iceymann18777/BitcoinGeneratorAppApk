package com.google.android.material.snackbar;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends android.widget.LinearLayout implements com.google.android.material.snackbar.AbstractC0993e {

    /* renamed from: b */
    private android.widget.TextView f3622b;

    /* renamed from: c */
    private android.widget.Button f3623c;

    /* renamed from: d */
    private int f3624d;

    /* renamed from: e */
    private int f3625e;

    public SnackbarContentLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SnackbarContentLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            int[] r0 = p050b.p051a.p052a.p053a.C0876i.SnackbarLayout
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            int r3 = p050b.p051a.p052a.p053a.C0876i.SnackbarLayout_android_maxWidth
            r0 = -1
            int r3 = r2.getDimensionPixelSize(r3, r0)
            r1.f3624d = r3
            int r3 = p050b.p051a.p052a.p053a.C0876i.SnackbarLayout_maxActionInlineWidth
            int r3 = r2.getDimensionPixelSize(r3, r0)
            r1.f3625e = r3
            r2.recycle()
            return
    }

    /* renamed from: a */
    private static void m60a(android.view.View r2, int r3, int r4) {
            boolean r0 = p000a.p018g.p029l.C0216r.m3395z(r2)
            if (r0 == 0) goto L_0x0012
            int r0 = p000a.p018g.p029l.C0216r.m3407n(r2)
            int r1 = p000a.p018g.p029l.C0216r.m3408m(r2)
            p000a.p018g.p029l.C0216r.m3441a(r2, r0, r3, r1, r4)
            goto L_0x001d
        L_0x0012:
            int r0 = r2.getPaddingLeft()
            int r1 = r2.getPaddingRight()
            r2.setPadding(r0, r3, r1, r4)
        L_0x001d:
            return
    }

    /* renamed from: a */
    private boolean m61a(int r3, int r4, int r5) {
            r2 = this;
            int r0 = r2.getOrientation()
            r1 = 1
            if (r3 == r0) goto L_0x000c
            r2.setOrientation(r3)
            r3 = 1
            goto L_0x000d
        L_0x000c:
            r3 = 0
        L_0x000d:
            android.widget.TextView r0 = r2.f3622b
            int r0 = r0.getPaddingTop()
            if (r0 != r4) goto L_0x001d
            android.widget.TextView r0 = r2.f3622b
            int r0 = r0.getPaddingBottom()
            if (r0 == r5) goto L_0x0023
        L_0x001d:
            android.widget.TextView r3 = r2.f3622b
            m60a(r3, r4, r5)
            r3 = 1
        L_0x0023:
            return r3
    }

    public android.widget.Button getActionView() {
            r1 = this;
            android.widget.Button r0 = r1.f3623c
            return r0
    }

    public android.widget.TextView getMessageView() {
            r1 = this;
            android.widget.TextView r0 = r1.f3622b
            return r0
    }

    @Override // android.view.View
    protected void onFinishInflate() {
            r1 = this;
            super.onFinishInflate()
            int r0 = p050b.p051a.p052a.p053a.C0872e.snackbar_text
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f3622b = r0
            int r0 = p050b.p051a.p052a.p053a.C0872e.snackbar_action
            android.view.View r0 = r1.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.f3623c = r0
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int r8, int r9) {
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f3624d
            if (r0 <= 0) goto L_0x0018
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f3624d
            if (r0 <= r1) goto L_0x0018
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L_0x0018:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = p050b.p051a.p052a.p053a.C0870c.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = p050b.p051a.p052a.p053a.C0870c.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f3622b
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003c
            r2 = 1
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            if (r2 == 0) goto L_0x0056
            int r5 = r7.f3625e
            if (r5 <= 0) goto L_0x0056
            android.widget.Button r5 = r7.f3623c
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f3625e
            if (r5 <= r6) goto L_0x0056
            int r1 = r0 - r1
            boolean r0 = r7.m61a(r4, r0, r1)
            if (r0 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0056:
            if (r2 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r1
        L_0x005a:
            boolean r0 = r7.m61a(r3, r0, r0)
            if (r0 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r4 = 0
        L_0x0062:
            if (r4 == 0) goto L_0x0067
            super.onMeasure(r8, r9)
        L_0x0067:
            return
    }
}
