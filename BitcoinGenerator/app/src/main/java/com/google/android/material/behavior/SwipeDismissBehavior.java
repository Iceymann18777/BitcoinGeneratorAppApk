package com.google.android.material.behavior;

import android.view.View;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c<V> {

    /* renamed from: a */
    p000a.p033i.p035b.C0240a f3410a;

    /* renamed from: b */
    com.google.android.material.behavior.SwipeDismissBehavior.AbstractC0928b f3411b;

    /* renamed from: c */
    private boolean f3412c;

    /* renamed from: d */
    private float f3413d;

    /* renamed from: e */
    private boolean f3414e;

    /* renamed from: f */
    int f3415f;

    /* renamed from: g */
    float f3416g;

    /* renamed from: h */
    float f3417h;

    /* renamed from: i */
    float f3418i;

    /* renamed from: j */
    private final p000a.p033i.p035b.C0240a.AbstractC0243c f3419j;

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    /* loaded from: classes.dex */
    class C0927a extends p000a.p033i.p035b.C0240a.AbstractC0243c {

        /* renamed from: a */
        private int f3420a;

        /* renamed from: b */
        private int f3421b;

        /* renamed from: c */
        final /* synthetic */ com.google.android.material.behavior.SwipeDismissBehavior f3422c;

        C0927a(com.google.android.material.behavior.SwipeDismissBehavior r1) {
                r0 = this;
                r0.f3422c = r1
                r0.<init>()
                r1 = -1
                r0.f3421b = r1
                return
        }

        /* renamed from: a */
        private boolean m302a(android.view.View r6, float r7) {
                r5 = this;
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x0036
                int r6 = p000a.p018g.p029l.C0216r.m3411j(r6)
                if (r6 != r2) goto L_0x000f
                r6 = 1
                goto L_0x0010
            L_0x000f:
                r6 = 0
            L_0x0010:
                com.google.android.material.behavior.SwipeDismissBehavior r3 = r5.f3422c
                int r3 = r3.f3415f
                r4 = 2
                if (r3 != r4) goto L_0x0018
                return r2
            L_0x0018:
                if (r3 != 0) goto L_0x0027
                if (r6 == 0) goto L_0x0021
                int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r6 >= 0) goto L_0x0026
                goto L_0x0025
            L_0x0021:
                int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r6 <= 0) goto L_0x0026
            L_0x0025:
                r1 = 1
            L_0x0026:
                return r1
            L_0x0027:
                if (r3 != r2) goto L_0x0035
                if (r6 == 0) goto L_0x0030
                int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r6 <= 0) goto L_0x0035
                goto L_0x0034
            L_0x0030:
                int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r6 >= 0) goto L_0x0035
            L_0x0034:
                r1 = 1
            L_0x0035:
                return r1
            L_0x0036:
                int r7 = r6.getLeft()
                int r0 = r5.f3420a
                int r7 = r7 - r0
                int r6 = r6.getWidth()
                float r6 = (float) r6
                com.google.android.material.behavior.SwipeDismissBehavior r0 = r5.f3422c
                float r0 = r0.f3416g
                float r6 = r6 * r0
                int r6 = java.lang.Math.round(r6)
                int r7 = java.lang.Math.abs(r7)
                if (r7 < r6) goto L_0x0053
                r1 = 1
            L_0x0053:
                return r1
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: a */
        public int mo303a(android.view.View r1) {
                r0 = this;
                int r1 = r1.getWidth()
                return r1
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: a */
        public int mo237a(android.view.View r3, int r4, int r5) {
                r2 = this;
                int r5 = p000a.p018g.p029l.C0216r.m3411j(r3)
                r0 = 1
                if (r5 != r0) goto L_0x0009
                r5 = 1
                goto L_0x000a
            L_0x0009:
                r5 = 0
            L_0x000a:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = r2.f3422c
                int r1 = r1.f3415f
                if (r1 != 0) goto L_0x0024
                if (r5 == 0) goto L_0x001c
            L_0x0012:
                int r5 = r2.f3420a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f3420a
                goto L_0x0037
            L_0x001c:
                int r5 = r2.f3420a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L_0x0037
            L_0x0024:
                if (r1 != r0) goto L_0x0029
                if (r5 == 0) goto L_0x0012
                goto L_0x001c
            L_0x0029:
                int r5 = r2.f3420a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f3420a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L_0x0037:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.m307a(r5, r4, r3)
                return r3
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: a */
        public void mo238a(android.view.View r3, float r4, float r5) {
                r2 = this;
                r5 = -1
                r2.f3421b = r5
                int r5 = r3.getWidth()
                boolean r4 = r2.m302a(r3, r4)
                if (r4 == 0) goto L_0x001a
                int r4 = r3.getLeft()
                int r0 = r2.f3420a
                if (r4 >= r0) goto L_0x0017
                int r0 = r0 - r5
                goto L_0x0018
            L_0x0017:
                int r0 = r0 + r5
            L_0x0018:
                r4 = 1
                goto L_0x001d
            L_0x001a:
                int r0 = r2.f3420a
                r4 = 0
            L_0x001d:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = r2.f3422c
                a.i.b.a r5 = r5.f3410a
                int r1 = r3.getTop()
                boolean r5 = r5.m3312d(r0, r1)
                if (r5 == 0) goto L_0x0036
                com.google.android.material.behavior.SwipeDismissBehavior$c r5 = new com.google.android.material.behavior.SwipeDismissBehavior$c
                com.google.android.material.behavior.SwipeDismissBehavior r0 = r2.f3422c
                r5.<init>(r0, r3, r4)
                p000a.p018g.p029l.C0216r.m3432a(r3, r5)
                goto L_0x0041
            L_0x0036:
                if (r4 == 0) goto L_0x0041
                com.google.android.material.behavior.SwipeDismissBehavior r4 = r2.f3422c
                com.google.android.material.behavior.SwipeDismissBehavior$b r4 = r4.f3411b
                if (r4 == 0) goto L_0x0041
                r4.m299a(r3)
            L_0x0041:
                return
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: a */
        public void mo301a(android.view.View r1, int r2) {
                r0 = this;
                r0.f3421b = r2
                int r2 = r1.getLeft()
                r0.f3420a = r2
                android.view.ViewParent r1 = r1.getParent()
                if (r1 == 0) goto L_0x0012
                r2 = 1
                r1.requestDisallowInterceptTouchEvent(r2)
            L_0x0012:
                return
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: a */
        public void mo236a(android.view.View r3, int r4, int r5, int r6, int r7) {
                r2 = this;
                int r5 = r2.f3420a
                float r5 = (float) r5
                int r6 = r3.getWidth()
                float r6 = (float) r6
                com.google.android.material.behavior.SwipeDismissBehavior r7 = r2.f3422c
                float r7 = r7.f3417h
                float r6 = r6 * r7
                float r5 = r5 + r6
                int r6 = r2.f3420a
                float r6 = (float) r6
                int r7 = r3.getWidth()
                float r7 = (float) r7
                com.google.android.material.behavior.SwipeDismissBehavior r0 = r2.f3422c
                float r0 = r0.f3418i
                float r7 = r7 * r0
                float r6 = r6 + r7
                float r4 = (float) r4
                r7 = 1065353216(0x3f800000, float:1.0)
                int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r0 > 0) goto L_0x0029
                r3.setAlpha(r7)
                goto L_0x003f
            L_0x0029:
                r0 = 0
                int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r1 < 0) goto L_0x0032
                r3.setAlpha(r0)
                goto L_0x003f
            L_0x0032:
                float r4 = com.google.android.material.behavior.SwipeDismissBehavior.m304b(r5, r6, r4)
                float r4 = r7 - r4
                float r4 = com.google.android.material.behavior.SwipeDismissBehavior.m309a(r0, r4, r7)
                r3.setAlpha(r4)
            L_0x003f:
                return
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: b */
        public int mo233b(android.view.View r1, int r2, int r3) {
                r0 = this;
                int r1 = r1.getTop()
                return r1
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: b */
        public boolean mo234b(android.view.View r2, int r3) {
                r1 = this;
                int r3 = r1.f3421b
                r0 = -1
                if (r3 != r0) goto L_0x000f
                com.google.android.material.behavior.SwipeDismissBehavior r3 = r1.f3422c
                boolean r2 = r3.mo63a(r2)
                if (r2 == 0) goto L_0x000f
                r2 = 1
                goto L_0x0010
            L_0x000f:
                r2 = 0
            L_0x0010:
                return r2
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: c */
        public void mo232c(int r2) {
                r1 = this;
                com.google.android.material.behavior.SwipeDismissBehavior r0 = r1.f3422c
                com.google.android.material.behavior.SwipeDismissBehavior$b r0 = r0.f3411b
                if (r0 == 0) goto L_0x0009
                r0.m300a(r2)
            L_0x0009:
                return
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    /* loaded from: classes.dex */
    public interface AbstractC0928b {
        /* renamed from: a */
        void m300a(int r1);

        /* renamed from: a */
        void m299a(android.view.View r1);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    /* loaded from: classes.dex */
    private class RunnableC0929c implements java.lang.Runnable {

        /* renamed from: b */
        private final android.view.View f3423b;

        /* renamed from: c */
        private final boolean f3424c;

        /* renamed from: d */
        final /* synthetic */ com.google.android.material.behavior.SwipeDismissBehavior f3425d;

        RunnableC0929c(com.google.android.material.behavior.SwipeDismissBehavior r1, android.view.View r2, boolean r3) {
                r0 = this;
                r0.f3425d = r1
                r0.<init>()
                r0.f3423b = r2
                r0.f3424c = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.google.android.material.behavior.SwipeDismissBehavior r0 = r2.f3425d
                a.i.b.a r0 = r0.f3410a
                if (r0 == 0) goto L_0x0013
                r1 = 1
                boolean r0 = r0.m3329a(r1)
                if (r0 == 0) goto L_0x0013
                android.view.View r0 = r2.f3423b
                p000a.p018g.p029l.C0216r.m3432a(r0, r2)
                goto L_0x0022
            L_0x0013:
                boolean r0 = r2.f3424c
                if (r0 == 0) goto L_0x0022
                com.google.android.material.behavior.SwipeDismissBehavior r0 = r2.f3425d
                com.google.android.material.behavior.SwipeDismissBehavior$b r0 = r0.f3411b
                if (r0 == 0) goto L_0x0022
                android.view.View r1 = r2.f3423b
                r0.m299a(r1)
            L_0x0022:
                return
        }
    }

    public SwipeDismissBehavior() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f3413d = r0
            r1 = 2
            r2.f3415f = r1
            r1 = 1056964608(0x3f000000, float:0.5)
            r2.f3416g = r1
            r2.f3417h = r0
            r2.f3418i = r1
            com.google.android.material.behavior.SwipeDismissBehavior$a r0 = new com.google.android.material.behavior.SwipeDismissBehavior$a
            r0.<init>(r2)
            r2.f3419j = r0
            return
    }

    /* renamed from: a */
    static float m309a(float r0, float r1, float r2) {
            float r0 = java.lang.Math.max(r0, r1)
            float r0 = java.lang.Math.min(r0, r2)
            return r0
    }

    /* renamed from: a */
    static int m307a(int r0, int r1, int r2) {
            int r0 = java.lang.Math.max(r0, r1)
            int r0 = java.lang.Math.min(r0, r2)
            return r0
    }

    /* renamed from: a */
    private void m306a(android.view.ViewGroup r3) {
            r2 = this;
            a.i.b.a r0 = r2.f3410a
            if (r0 != 0) goto L_0x0019
            boolean r0 = r2.f3414e
            if (r0 == 0) goto L_0x0011
            float r0 = r2.f3413d
            a.i.b.a$c r1 = r2.f3419j
            a.i.b.a r3 = p000a.p033i.p035b.C0240a.m3331a(r3, r0, r1)
            goto L_0x0017
        L_0x0011:
            a.i.b.a$c r0 = r2.f3419j
            a.i.b.a r3 = p000a.p033i.p035b.C0240a.m3330a(r3, r0)
        L_0x0017:
            r2.f3410a = r3
        L_0x0019:
            return
    }

    /* renamed from: b */
    static float m304b(float r0, float r1, float r2) {
            float r2 = r2 - r0
            float r1 = r1 - r0
            float r2 = r2 / r1
            return r2
    }

    /* renamed from: a */
    public void m310a(float r3) {
            r2 = this;
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = m309a(r0, r3, r1)
            r2.f3418i = r3
            return
    }

    /* renamed from: a */
    public void m308a(int r1) {
            r0 = this;
            r0.f3415f = r1
            return
    }

    /* renamed from: a */
    public boolean mo63a(android.view.View r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public boolean mo62a(androidx.coordinatorlayout.widget.CoordinatorLayout r4, V r5, android.view.MotionEvent r6) {
            r3 = this;
            boolean r0 = r3.f3412c
            int r1 = r6.getActionMasked()
            r2 = 0
            if (r1 == 0) goto L_0x0013
            r5 = 1
            if (r1 == r5) goto L_0x0010
            r5 = 3
            if (r1 == r5) goto L_0x0010
            goto L_0x0025
        L_0x0010:
            r3.f3412c = r2
            goto L_0x0025
        L_0x0013:
            float r0 = r6.getX()
            int r0 = (int) r0
            float r1 = r6.getY()
            int r1 = (int) r1
            boolean r5 = r4.m1718a(r5, r0, r1)
            r3.f3412c = r5
            boolean r0 = r3.f3412c
        L_0x0025:
            if (r0 == 0) goto L_0x0031
            r3.m306a(r4)
            a.i.b.a r4 = r3.f3410a
            boolean r4 = r4.m3321b(r6)
            return r4
        L_0x0031:
            return r2
    }

    /* renamed from: b */
    public void m305b(float r3) {
            r2 = this;
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = m309a(r0, r3, r1)
            r2.f3417h = r3
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: b */
    public boolean mo18b(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.MotionEvent r3) {
            r0 = this;
            a.i.b.a r1 = r0.f3410a
            if (r1 == 0) goto L_0x0009
            r1.m3336a(r3)
            r1 = 1
            return r1
        L_0x0009:
            r1 = 0
            return r1
    }
}
