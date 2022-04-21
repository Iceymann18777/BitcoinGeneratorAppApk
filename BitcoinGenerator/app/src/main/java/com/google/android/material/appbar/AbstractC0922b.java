package com.google.android.material.appbar;

/* renamed from: com.google.android.material.appbar.b */
/* loaded from: classes.dex */
abstract class AbstractC0922b extends com.google.android.material.appbar.C0923c<android.view.View> {

    /* renamed from: d */
    final android.graphics.Rect f3394d;

    /* renamed from: e */
    final android.graphics.Rect f3395e;

    /* renamed from: f */
    private int f3396f;

    /* renamed from: g */
    private int f3397g;

    public AbstractC0922b() {
            r1 = this;
            r1.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.f3394d = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.f3395e = r0
            r0 = 0
            r1.f3396f = r0
            return
    }

    public AbstractC0922b(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f3394d = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f3395e = r1
            r1 = 0
            r0.f3396f = r1
            return
    }

    /* renamed from: c */
    private static int m326c(int r0) {
            if (r0 != 0) goto L_0x0005
            r0 = 8388659(0x800033, float:1.1755015E-38)
        L_0x0005:
            return r0
    }

    /* renamed from: a */
    final int m332a(android.view.View r4) {
            r3 = this;
            int r0 = r3.f3397g
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x0014
        L_0x0006:
            float r4 = r3.mo328b(r4)
            int r0 = r3.f3397g
            float r2 = (float) r0
            float r4 = r4 * r2
            int r4 = (int) r4
            int r1 = p000a.p018g.p024g.C0158a.m3608a(r4, r1, r0)
        L_0x0014:
            return r1
    }

    /* renamed from: a */
    abstract android.view.View mo330a(java.util.List<android.view.View> r1);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public boolean mo331a(androidx.coordinatorlayout.widget.CoordinatorLayout r13, android.view.View r14, int r15, int r16, int r17, int r18) {
            r12 = this;
            r0 = r12
            android.view.ViewGroup$LayoutParams r1 = r14.getLayoutParams()
            int r1 = r1.height
            r2 = -1
            if (r1 == r2) goto L_0x000d
            r3 = -2
            if (r1 != r3) goto L_0x005d
        L_0x000d:
            java.util.List r3 = r13.m1704b(r14)
            android.view.View r3 = r12.mo330a(r3)
            if (r3 == 0) goto L_0x005d
            boolean r4 = p000a.p018g.p029l.C0216r.m3415g(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0032
            boolean r4 = p000a.p018g.p029l.C0216r.m3415g(r14)
            if (r4 != 0) goto L_0x0032
            r4 = r14
            p000a.p018g.p029l.C0216r.m3429a(r14, r5)
            boolean r6 = p000a.p018g.p029l.C0216r.m3415g(r14)
            if (r6 == 0) goto L_0x0033
            r14.requestLayout()
            return r5
        L_0x0032:
            r4 = r14
        L_0x0033:
            int r6 = android.view.View.MeasureSpec.getSize(r17)
            if (r6 != 0) goto L_0x003d
            int r6 = r13.getHeight()
        L_0x003d:
            int r7 = r3.getMeasuredHeight()
            int r6 = r6 - r7
            int r3 = r12.mo325c(r3)
            int r6 = r6 + r3
            if (r1 != r2) goto L_0x004c
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x004e
        L_0x004c:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x004e:
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r1)
            r6 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r11 = r18
            r6.m1717a(r7, r8, r9, r10, r11)
            return r5
        L_0x005d:
            r1 = 0
            return r1
    }

    /* renamed from: b */
    abstract float mo328b(android.view.View r1);

    /* renamed from: b */
    public final void m329b(int r1) {
            r0 = this;
            r0.f3397g = r1
            return
    }

    @Override // com.google.android.material.appbar.C0923c
    /* renamed from: b */
    protected void mo321b(androidx.coordinatorlayout.widget.CoordinatorLayout r9, android.view.View r10, int r11) {
            r8 = this;
            java.util.List r0 = r9.m1704b(r10)
            android.view.View r0 = r8.mo330a(r0)
            if (r0 == 0) goto L_0x0092
            android.view.ViewGroup$LayoutParams r1 = r10.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r1
            android.graphics.Rect r5 = r8.f3394d
            int r2 = r9.getPaddingLeft()
            int r3 = r1.leftMargin
            int r2 = r2 + r3
            int r3 = r0.getBottom()
            int r4 = r1.topMargin
            int r3 = r3 + r4
            int r4 = r9.getWidth()
            int r6 = r9.getPaddingRight()
            int r4 = r4 - r6
            int r6 = r1.rightMargin
            int r4 = r4 - r6
            int r6 = r9.getHeight()
            int r7 = r0.getBottom()
            int r6 = r6 + r7
            int r7 = r9.getPaddingBottom()
            int r6 = r6 - r7
            int r7 = r1.bottomMargin
            int r6 = r6 - r7
            r5.set(r2, r3, r4, r6)
            a.g.l.z r2 = r9.getLastWindowInsets()
            if (r2 == 0) goto L_0x0064
            boolean r9 = p000a.p018g.p029l.C0216r.m3415g(r9)
            if (r9 == 0) goto L_0x0064
            boolean r9 = p000a.p018g.p029l.C0216r.m3415g(r10)
            if (r9 != 0) goto L_0x0064
            int r9 = r5.left
            int r3 = r2.m3357c()
            int r9 = r9 + r3
            r5.left = r9
            int r9 = r5.right
            int r2 = r2.m3356d()
            int r9 = r9 - r2
            r5.right = r9
        L_0x0064:
            android.graphics.Rect r9 = r8.f3395e
            int r1 = r1.f2596c
            int r2 = m326c(r1)
            int r3 = r10.getMeasuredWidth()
            int r4 = r10.getMeasuredHeight()
            r6 = r9
            r7 = r11
            p000a.p018g.p029l.C0200c.m3489a(r2, r3, r4, r5, r6, r7)
            int r11 = r8.m332a(r0)
            int r1 = r9.left
            int r2 = r9.top
            int r2 = r2 - r11
            int r3 = r9.right
            int r4 = r9.bottom
            int r4 = r4 - r11
            r10.layout(r1, r2, r3, r4)
            int r9 = r9.top
            int r10 = r0.getBottom()
            int r9 = r9 - r10
            goto L_0x0096
        L_0x0092:
            super.mo321b(r9, r10, r11)
            r9 = 0
        L_0x0096:
            r8.f3396f = r9
            return
    }

    /* renamed from: c */
    public final int m327c() {
            r1 = this;
            int r0 = r1.f3397g
            return r0
    }

    /* renamed from: c */
    int mo325c(android.view.View r1) {
            r0 = this;
            int r1 = r1.getMeasuredHeight()
            return r1
    }

    /* renamed from: d */
    final int m324d() {
            r1 = this;
            int r0 = r1.f3396f
            return r0
    }
}
