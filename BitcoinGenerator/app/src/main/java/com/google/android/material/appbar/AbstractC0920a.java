package com.google.android.material.appbar;

import android.view.View;

/* renamed from: com.google.android.material.appbar.a */
/* loaded from: classes.dex */
abstract class AbstractC0920a<V extends android.view.View> extends com.google.android.material.appbar.C0923c<V> {

    /* renamed from: d */
    private java.lang.Runnable f3384d;

    /* renamed from: e */
    android.widget.OverScroller f3385e;

    /* renamed from: f */
    private boolean f3386f;

    /* renamed from: g */
    private int f3387g;

    /* renamed from: h */
    private int f3388h;

    /* renamed from: i */
    private int f3389i;

    /* renamed from: j */
    private android.view.VelocityTracker f3390j;

    /* renamed from: com.google.android.material.appbar.a$a */
    /* loaded from: classes.dex */
    private class RunnableC0921a implements java.lang.Runnable {

        /* renamed from: b */
        private final androidx.coordinatorlayout.widget.CoordinatorLayout f3391b;

        /* renamed from: c */
        private final V f3392c;

        /* renamed from: d */
        final /* synthetic */ com.google.android.material.appbar.AbstractC0920a f3393d;

        RunnableC0921a(com.google.android.material.appbar.AbstractC0920a r1, androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3) {
                r0 = this;
                r0.f3393d = r1
                r0.<init>()
                r0.f3391b = r2
                r0.f3392c = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                V extends android.view.View r0 = r4.f3392c
                if (r0 == 0) goto L_0x002e
                com.google.android.material.appbar.a r0 = r4.f3393d
                android.widget.OverScroller r0 = r0.f3385e
                if (r0 == 0) goto L_0x002e
                boolean r0 = r0.computeScrollOffset()
                if (r0 == 0) goto L_0x0025
                com.google.android.material.appbar.a r0 = r4.f3393d
                androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r4.f3391b
                V extends android.view.View r2 = r4.f3392c
                android.widget.OverScroller r3 = r0.f3385e
                int r3 = r3.getCurrY()
                r0.m335c(r1, r2, r3)
                V extends android.view.View r0 = r4.f3392c
                p000a.p018g.p029l.C0216r.m3432a(r0, r4)
                goto L_0x002e
            L_0x0025:
                com.google.android.material.appbar.a r0 = r4.f3393d
                androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r4.f3391b
                V extends android.view.View r2 = r4.f3392c
                r0.mo333e(r1, r2)
            L_0x002e:
                return
        }
    }

    public AbstractC0920a() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f3387g = r0
            r1.f3389i = r0
            return
    }

    public AbstractC0920a(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = -1
            r0.f3387g = r1
            r0.f3389i = r1
            return
    }

    /* renamed from: d */
    private void m334d() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.f3390j
            if (r0 != 0) goto L_0x000a
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r1.f3390j = r0
        L_0x000a:
            return
    }

    /* renamed from: a */
    final int m340a(androidx.coordinatorlayout.widget.CoordinatorLayout r8, V r9, int r10, int r11, int r12) {
            r7 = this;
            int r0 = r7.mo337c()
            int r4 = r0 - r10
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            int r8 = r1.mo338b(r2, r3, r4, r5, r6)
            return r8
    }

    /* renamed from: a */
    abstract boolean mo342a(V r1);

    /* renamed from: a */
    final boolean m341a(androidx.coordinatorlayout.widget.CoordinatorLayout r14, V r15, int r16, int r17, float r18) {
            r13 = this;
            r0 = r13
            r1 = r15
            java.lang.Runnable r2 = r0.f3384d
            if (r2 == 0) goto L_0x000c
            r15.removeCallbacks(r2)
            r2 = 0
            r0.f3384d = r2
        L_0x000c:
            android.widget.OverScroller r2 = r0.f3385e
            if (r2 != 0) goto L_0x001b
            android.widget.OverScroller r2 = new android.widget.OverScroller
            android.content.Context r3 = r15.getContext()
            r2.<init>(r3)
            r0.f3385e = r2
        L_0x001b:
            android.widget.OverScroller r4 = r0.f3385e
            r5 = 0
            int r6 = r13.m322b()
            r7 = 0
            int r8 = java.lang.Math.round(r18)
            r9 = 0
            r10 = 0
            r11 = r16
            r12 = r17
            r4.fling(r5, r6, r7, r8, r9, r10, r11, r12)
            android.widget.OverScroller r2 = r0.f3385e
            boolean r2 = r2.computeScrollOffset()
            if (r2 == 0) goto L_0x0047
            com.google.android.material.appbar.a$a r2 = new com.google.android.material.appbar.a$a
            r3 = r14
            r2.<init>(r13, r14, r15)
            r0.f3384d = r2
            java.lang.Runnable r2 = r0.f3384d
            p000a.p018g.p029l.C0216r.m3432a(r15, r2)
            r1 = 1
            return r1
        L_0x0047:
            r3 = r14
            r13.mo333e(r14, r15)
            r1 = 0
            return r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public boolean mo62a(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
            r4 = this;
            int r0 = r4.f3389i
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.f3389i = r0
        L_0x0012:
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x001f
            boolean r0 = r4.f3386f
            if (r0 == 0) goto L_0x001f
            return r2
        L_0x001f:
            int r0 = r7.getActionMasked()
            r3 = 0
            if (r0 == 0) goto L_0x0060
            r5 = -1
            if (r0 == r2) goto L_0x0051
            if (r0 == r1) goto L_0x002f
            r6 = 3
            if (r0 == r6) goto L_0x0051
            goto L_0x0083
        L_0x002f:
            int r6 = r4.f3387g
            if (r6 != r5) goto L_0x0034
            goto L_0x0083
        L_0x0034:
            int r6 = r7.findPointerIndex(r6)
            if (r6 != r5) goto L_0x003b
            goto L_0x0083
        L_0x003b:
            float r5 = r7.getY(r6)
            int r5 = (int) r5
            int r6 = r4.f3388h
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r4.f3389i
            if (r6 <= r0) goto L_0x0083
            r4.f3386f = r2
            r4.f3388h = r5
            goto L_0x0083
        L_0x0051:
            r4.f3386f = r3
            r4.f3387g = r5
            android.view.VelocityTracker r5 = r4.f3390j
            if (r5 == 0) goto L_0x0083
            r5.recycle()
            r5 = 0
            r4.f3390j = r5
            goto L_0x0083
        L_0x0060:
            r4.f3386f = r3
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r2 = r4.mo342a(r6)
            if (r2 == 0) goto L_0x0083
            boolean r5 = r5.m1718a(r6, r0, r1)
            if (r5 == 0) goto L_0x0083
            r4.f3388h = r1
            int r5 = r7.getPointerId(r3)
            r4.f3387g = r5
            r4.m334d()
        L_0x0083:
            android.view.VelocityTracker r5 = r4.f3390j
            if (r5 == 0) goto L_0x008a
            r5.addMovement(r7)
        L_0x008a:
            boolean r5 = r4.f3386f
            return r5
    }

    /* renamed from: b */
    abstract int mo339b(V r1);

    /* renamed from: b */
    abstract int mo338b(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, int r3, int r4, int r5);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: b */
    public boolean mo18b(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
            r11 = this;
            int r0 = r11.f3389i
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r12.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r11.f3389i = r0
        L_0x0012:
            int r0 = r14.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x008d
            r3 = -1
            if (r0 == r1) goto L_0x005c
            r4 = 2
            if (r0 == r4) goto L_0x0025
            r12 = 3
            if (r0 == r12) goto L_0x007e
            goto L_0x00ae
        L_0x0025:
            int r0 = r11.f3387g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r3) goto L_0x002e
            return r2
        L_0x002e:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r2 = r11.f3388h
            int r2 = r2 - r0
            boolean r3 = r11.f3386f
            if (r3 != 0) goto L_0x0049
            int r3 = java.lang.Math.abs(r2)
            int r4 = r11.f3389i
            if (r3 <= r4) goto L_0x0049
            r11.f3386f = r1
            if (r2 <= 0) goto L_0x0048
            int r2 = r2 - r4
            goto L_0x0049
        L_0x0048:
            int r2 = r2 + r4
        L_0x0049:
            r6 = r2
            boolean r2 = r11.f3386f
            if (r2 == 0) goto L_0x00ae
            r11.f3388h = r0
            int r7 = r11.mo339b(r13)
            r8 = 0
            r3 = r11
            r4 = r12
            r5 = r13
            r3.m340a(r4, r5, r6, r7, r8)
            goto L_0x00ae
        L_0x005c:
            android.view.VelocityTracker r0 = r11.f3390j
            if (r0 == 0) goto L_0x007e
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f3390j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f3390j
            int r4 = r11.f3387g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo336c(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.m341a(r6, r7, r8, r9, r10)
        L_0x007e:
            r11.f3386f = r2
            r11.f3387g = r3
            android.view.VelocityTracker r12 = r11.f3390j
            if (r12 == 0) goto L_0x00ae
            r12.recycle()
            r12 = 0
            r11.f3390j = r12
            goto L_0x00ae
        L_0x008d:
            float r0 = r14.getX()
            int r0 = (int) r0
            float r3 = r14.getY()
            int r3 = (int) r3
            boolean r12 = r12.m1718a(r13, r0, r3)
            if (r12 == 0) goto L_0x00b6
            boolean r12 = r11.mo342a(r13)
            if (r12 == 0) goto L_0x00b6
            r11.f3388h = r3
            int r12 = r14.getPointerId(r2)
            r11.f3387g = r12
            r11.m334d()
        L_0x00ae:
            android.view.VelocityTracker r12 = r11.f3390j
            if (r12 == 0) goto L_0x00b5
            r12.addMovement(r14)
        L_0x00b5:
            return r1
        L_0x00b6:
            return r2
    }

    /* renamed from: c */
    abstract int mo337c();

    /* renamed from: c */
    abstract int mo336c(V r1);

    /* renamed from: c */
    int m335c(androidx.coordinatorlayout.widget.CoordinatorLayout r7, V r8, int r9) {
            r6 = this;
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2147483647(0x7fffffff, float:NaN)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            int r7 = r0.mo338b(r1, r2, r3, r4, r5)
            return r7
    }

    /* renamed from: e */
    abstract void mo333e(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2);
}
