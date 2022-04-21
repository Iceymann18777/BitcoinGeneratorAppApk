package androidx.core.widget;

/* renamed from: androidx.core.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractView$OnTouchListenerC0710a implements android.view.View.OnTouchListener {

    /* renamed from: s */
    private static final int f2678s = 0;

    /* renamed from: b */
    final androidx.core.widget.AbstractView$OnTouchListenerC0710a.C0711a f2679b;

    /* renamed from: c */
    private final android.view.animation.Interpolator f2680c;

    /* renamed from: d */
    final android.view.View f2681d;

    /* renamed from: e */
    private java.lang.Runnable f2682e;

    /* renamed from: f */
    private float[] f2683f;

    /* renamed from: g */
    private float[] f2684g;

    /* renamed from: h */
    private int f2685h;

    /* renamed from: i */
    private int f2686i;

    /* renamed from: j */
    private float[] f2687j;

    /* renamed from: k */
    private float[] f2688k;

    /* renamed from: l */
    private float[] f2689l;

    /* renamed from: m */
    private boolean f2690m;

    /* renamed from: n */
    boolean f2691n;

    /* renamed from: o */
    boolean f2692o;

    /* renamed from: p */
    boolean f2693p;

    /* renamed from: q */
    private boolean f2694q;

    /* renamed from: r */
    private boolean f2695r;

    /* renamed from: androidx.core.widget.a$a */
    /* loaded from: classes.dex */
    private static class C0711a {

        /* renamed from: a */
        private int f2696a;

        /* renamed from: b */
        private int f2697b;

        /* renamed from: c */
        private float f2698c;

        /* renamed from: d */
        private float f2699d;

        /* renamed from: e */
        private long f2700e;

        /* renamed from: f */
        private long f2701f;

        /* renamed from: g */
        private int f2702g;

        /* renamed from: h */
        private int f2703h;

        /* renamed from: i */
        private long f2704i;

        /* renamed from: j */
        private float f2705j;

        /* renamed from: k */
        private int f2706k;

        C0711a() {
                r2 = this;
                r2.<init>()
                r0 = -9223372036854775808
                r2.f2700e = r0
                r0 = -1
                r2.f2704i = r0
                r0 = 0
                r2.f2701f = r0
                r0 = 0
                r2.f2702g = r0
                r2.f2703h = r0
                return
        }

        /* renamed from: a */
        private float m1524a(float r3) {
                r2 = this;
                r0 = -1065353216(0xffffffffc0800000, float:-4.0)
                float r0 = r0 * r3
                float r0 = r0 * r3
                r1 = 1082130432(0x40800000, float:4.0)
                float r3 = r3 * r1
                float r0 = r0 + r3
                return r0
        }

        /* renamed from: a */
        private float m1521a(long r8) {
                r7 = this;
                long r0 = r7.f2700e
                r2 = 0
                int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r3 >= 0) goto L_0x0008
                return r2
            L_0x0008:
                long r0 = r7.f2704i
                r3 = 0
                r5 = 1065353216(0x3f800000, float:1.0)
                int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r6 < 0) goto L_0x0029
                int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r3 >= 0) goto L_0x0017
                goto L_0x0029
            L_0x0017:
                long r8 = r8 - r0
                float r0 = r7.f2705j
                float r1 = r5 - r0
                float r8 = (float) r8
                int r9 = r7.f2706k
                float r9 = (float) r9
                float r8 = r8 / r9
                float r8 = androidx.core.widget.AbstractView$OnTouchListenerC0710a.m1542a(r8, r2, r5)
                float r0 = r0 * r8
                float r1 = r1 + r0
                return r1
            L_0x0029:
                long r0 = r7.f2700e
                long r8 = r8 - r0
                r0 = 1056964608(0x3f000000, float:0.5)
                float r8 = (float) r8
                int r9 = r7.f2696a
                float r9 = (float) r9
                float r8 = r8 / r9
                float r8 = androidx.core.widget.AbstractView$OnTouchListenerC0710a.m1542a(r8, r2, r5)
                float r8 = r8 * r0
                return r8
        }

        /* renamed from: a */
        public void m1525a() {
                r5 = this;
                long r0 = r5.f2701f
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L_0x002c
                long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
                float r2 = r5.m1521a(r0)
                float r2 = r5.m1524a(r2)
                long r3 = r5.f2701f
                long r3 = r0 - r3
                r5.f2701f = r0
                float r0 = (float) r3
                float r0 = r0 * r2
                float r1 = r5.f2698c
                float r1 = r1 * r0
                int r1 = (int) r1
                r5.f2702g = r1
                float r1 = r5.f2699d
                float r0 = r0 * r1
                int r0 = (int) r0
                r5.f2703h = r0
                return
            L_0x002c:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "Cannot compute scroll delta before calling start()"
                r0.<init>(r1)
                throw r0
        }

        /* renamed from: a */
        public void m1523a(float r1, float r2) {
                r0 = this;
                r0.f2698c = r1
                r0.f2699d = r2
                return
        }

        /* renamed from: a */
        public void m1522a(int r1) {
                r0 = this;
                r0.f2697b = r1
                return
        }

        /* renamed from: b */
        public int m1520b() {
                r1 = this;
                int r0 = r1.f2702g
                return r0
        }

        /* renamed from: b */
        public void m1519b(int r1) {
                r0 = this;
                r0.f2696a = r1
                return
        }

        /* renamed from: c */
        public int m1518c() {
                r1 = this;
                int r0 = r1.f2703h
                return r0
        }

        /* renamed from: d */
        public int m1517d() {
                r2 = this;
                float r0 = r2.f2698c
                float r1 = java.lang.Math.abs(r0)
                float r0 = r0 / r1
                int r0 = (int) r0
                return r0
        }

        /* renamed from: e */
        public int m1516e() {
                r2 = this;
                float r0 = r2.f2699d
                float r1 = java.lang.Math.abs(r0)
                float r0 = r0 / r1
                int r0 = (int) r0
                return r0
        }

        /* renamed from: f */
        public boolean m1515f() {
                r6 = this;
                long r0 = r6.f2704i
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L_0x0018
                long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
                long r2 = r6.f2704i
                int r4 = r6.f2706k
                long r4 = (long) r4
                long r2 = r2 + r4
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L_0x0018
                r0 = 1
                goto L_0x0019
            L_0x0018:
                r0 = 0
            L_0x0019:
                return r0
        }

        /* renamed from: g */
        public void m1514g() {
                r5 = this;
                long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
                long r2 = r5.f2700e
                long r2 = r0 - r2
                int r3 = (int) r2
                int r2 = r5.f2697b
                r4 = 0
                int r2 = androidx.core.widget.AbstractView$OnTouchListenerC0710a.m1539a(r3, r4, r2)
                r5.f2706k = r2
                float r2 = r5.m1521a(r0)
                r5.f2705j = r2
                r5.f2704i = r0
                return
        }

        /* renamed from: h */
        public void m1513h() {
                r2 = this;
                long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
                r2.f2700e = r0
                r0 = -1
                r2.f2704i = r0
                long r0 = r2.f2700e
                r2.f2701f = r0
                r0 = 1056964608(0x3f000000, float:0.5)
                r2.f2705j = r0
                r0 = 0
                r2.f2702g = r0
                r2.f2703h = r0
                return
        }
    }

    /* renamed from: androidx.core.widget.a$b */
    /* loaded from: classes.dex */
    private class RunnableC0712b implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ androidx.core.widget.AbstractView$OnTouchListenerC0710a f2707b;

        RunnableC0712b(androidx.core.widget.AbstractView$OnTouchListenerC0710a r1) {
                r0 = this;
                r0.f2707b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                androidx.core.widget.a r0 = r4.f2707b
                boolean r1 = r0.f2693p
                if (r1 != 0) goto L_0x0007
                return
            L_0x0007:
                boolean r1 = r0.f2691n
                r2 = 0
                if (r1 == 0) goto L_0x0013
                r0.f2691n = r2
                androidx.core.widget.a$a r0 = r0.f2679b
                r0.m1513h()
            L_0x0013:
                androidx.core.widget.a r0 = r4.f2707b
                androidx.core.widget.a$a r0 = r0.f2679b
                boolean r1 = r0.m1515f()
                if (r1 != 0) goto L_0x0049
                androidx.core.widget.a r1 = r4.f2707b
                boolean r1 = r1.m1537b()
                if (r1 != 0) goto L_0x0026
                goto L_0x0049
            L_0x0026:
                androidx.core.widget.a r1 = r4.f2707b
                boolean r3 = r1.f2692o
                if (r3 == 0) goto L_0x0031
                r1.f2692o = r2
                r1.m1544a()
            L_0x0031:
                r0.m1525a()
                int r1 = r0.m1520b()
                int r0 = r0.m1518c()
                androidx.core.widget.a r2 = r4.f2707b
                r2.mo1503a(r1, r0)
                androidx.core.widget.a r0 = r4.f2707b
                android.view.View r0 = r0.f2681d
                p000a.p018g.p029l.C0216r.m3432a(r0, r4)
                return
            L_0x0049:
                androidx.core.widget.a r0 = r4.f2707b
                r0.f2693p = r2
                return
        }
    }

    static {
            int r0 = android.view.ViewConfiguration.getTapTimeout()
            androidx.core.widget.AbstractView$OnTouchListenerC0710a.f2678s = r0
            return
    }

    public AbstractView$OnTouchListenerC0710a(android.view.View r4) {
            r3 = this;
            r3.<init>()
            androidx.core.widget.a$a r0 = new androidx.core.widget.a$a
            r0.<init>()
            r3.f2679b = r0
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            r3.f2680c = r0
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x007c: FILL_ARRAY_DATA  , data: [0, 0} // fill-array
            r3.f2683f = r1
            float[] r1 = new float[r0]
            r1 = {x0084: FILL_ARRAY_DATA  , data: [2139095039, 2139095039} // fill-array
            r3.f2684g = r1
            float[] r1 = new float[r0]
            r1 = {x008c: FILL_ARRAY_DATA  , data: [0, 0} // fill-array
            r3.f2687j = r1
            float[] r1 = new float[r0]
            r1 = {x0094: FILL_ARRAY_DATA  , data: [0, 0} // fill-array
            r3.f2688k = r1
            float[] r0 = new float[r0]
            r0 = {x009c: FILL_ARRAY_DATA  , data: [2139095039, 2139095039} // fill-array
            r3.f2689l = r0
            r3.f2681d = r4
            android.content.res.Resources r4 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            r0 = 1153753088(0x44c4e000, float:1575.0)
            float r0 = r0 * r4
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r2 = 1134395392(0x439d8000, float:315.0)
            float r4 = r4 * r2
            float r4 = r4 + r1
            int r4 = (int) r4
            float r0 = (float) r0
            r3.m1536b(r0, r0)
            float r4 = (float) r4
            r3.m1534c(r4, r4)
            r4 = 1
            r3.m1530d(r4)
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r3.m1543a(r4, r4)
            r4 = 1045220557(0x3e4ccccd, float:0.2)
            r3.m1531d(r4, r4)
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.m1529e(r4, r4)
            int r4 = androidx.core.widget.AbstractView$OnTouchListenerC0710a.f2678s
            r3.m1533c(r4)
            r4 = 500(0x1f4, float:7.0E-43)
            r3.m1526f(r4)
            r3.m1528e(r4)
            return
    }

    /* renamed from: a */
    static float m1542a(float r1, float r2, float r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0005
            return r3
        L_0x0005:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x000a
            return r2
        L_0x000a:
            return r1
    }

    /* renamed from: a */
    private float m1541a(float r2, float r3, float r4, float r5) {
            r1 = this;
            float r2 = r2 * r3
            r0 = 0
            float r2 = m1542a(r2, r0, r4)
            float r4 = r1.m1527f(r5, r2)
            float r3 = r3 - r5
            float r2 = r1.m1527f(r3, r2)
            float r2 = r2 - r4
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 >= 0) goto L_0x001e
            android.view.animation.Interpolator r3 = r1.f2680c
            float r2 = -r2
            float r2 = r3.getInterpolation(r2)
            float r2 = -r2
            goto L_0x0028
        L_0x001e:
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0031
            android.view.animation.Interpolator r3 = r1.f2680c
            float r2 = r3.getInterpolation(r2)
        L_0x0028:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            float r2 = m1542a(r2, r3, r4)
            return r2
        L_0x0031:
            return r0
    }

    /* renamed from: a */
    private float m1540a(int r4, float r5, float r6, float r7) {
            r3 = this;
            float[] r0 = r3.f2683f
            r0 = r0[r4]
            float[] r1 = r3.f2684g
            r1 = r1[r4]
            float r5 = r3.m1541a(r0, r6, r1, r5)
            r6 = 0
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0012
            return r6
        L_0x0012:
            float[] r0 = r3.f2687j
            r0 = r0[r4]
            float[] r1 = r3.f2688k
            r1 = r1[r4]
            float[] r2 = r3.f2689l
            r4 = r2[r4]
            float r0 = r0 * r7
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x002b
            float r5 = r5 * r0
            float r4 = m1542a(r5, r1, r4)
            return r4
        L_0x002b:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = m1542a(r5, r1, r4)
            float r4 = -r4
            return r4
    }

    /* renamed from: a */
    static int m1539a(int r0, int r1, int r2) {
            if (r0 <= r2) goto L_0x0003
            return r2
        L_0x0003:
            if (r0 >= r1) goto L_0x0006
            return r1
        L_0x0006:
            return r0
    }

    /* renamed from: c */
    private void m1535c() {
            r1 = this;
            boolean r0 = r1.f2691n
            if (r0 == 0) goto L_0x0008
            r0 = 0
            r1.f2693p = r0
            goto L_0x000d
        L_0x0008:
            androidx.core.widget.a$a r0 = r1.f2679b
            r0.m1514g()
        L_0x000d:
            return
    }

    /* renamed from: d */
    private void m1532d() {
            r6 = this;
            java.lang.Runnable r0 = r6.f2682e
            if (r0 != 0) goto L_0x000b
            androidx.core.widget.a$b r0 = new androidx.core.widget.a$b
            r0.<init>(r6)
            r6.f2682e = r0
        L_0x000b:
            r0 = 1
            r6.f2693p = r0
            r6.f2691n = r0
            boolean r1 = r6.f2690m
            if (r1 != 0) goto L_0x0021
            int r1 = r6.f2686i
            if (r1 <= 0) goto L_0x0021
            android.view.View r2 = r6.f2681d
            java.lang.Runnable r3 = r6.f2682e
            long r4 = (long) r1
            p000a.p018g.p029l.C0216r.m3431a(r2, r3, r4)
            goto L_0x0026
        L_0x0021:
            java.lang.Runnable r1 = r6.f2682e
            r1.run()
        L_0x0026:
            r6.f2690m = r0
            return
    }

    /* renamed from: f */
    private float m1527f(float r5, float r6) {
            r4 = this;
            r0 = 0
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 != 0) goto L_0x0006
            return r0
        L_0x0006:
            int r1 = r4.f2685h
            r2 = 1
            if (r1 == 0) goto L_0x0018
            if (r1 == r2) goto L_0x0018
            r2 = 2
            if (r1 == r2) goto L_0x0011
            goto L_0x002e
        L_0x0011:
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x002e
            float r6 = -r6
            float r5 = r5 / r6
            return r5
        L_0x0018:
            int r1 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x002e
            r1 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 < 0) goto L_0x0025
            float r5 = r5 / r6
            float r1 = r1 - r5
            return r1
        L_0x0025:
            boolean r5 = r4.f2693p
            if (r5 == 0) goto L_0x002e
            int r5 = r4.f2685h
            if (r5 != r2) goto L_0x002e
            return r1
        L_0x002e:
            return r0
    }

    /* renamed from: a */
    public androidx.core.widget.AbstractView$OnTouchListenerC0710a m1543a(float r3, float r4) {
            r2 = this;
            float[] r0 = r2.f2684g
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            return r2
    }

    /* renamed from: a */
    public androidx.core.widget.AbstractView$OnTouchListenerC0710a m1538a(boolean r2) {
            r1 = this;
            boolean r0 = r1.f2694q
            if (r0 == 0) goto L_0x0009
            if (r2 != 0) goto L_0x0009
            r1.m1535c()
        L_0x0009:
            r1.f2694q = r2
            return r1
    }

    /* renamed from: a */
    void m1544a() {
            r8 = this;
            long r2 = android.os.SystemClock.uptimeMillis()
            r4 = 3
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r2
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r0, r2, r4, r5, r6, r7)
            android.view.View r1 = r8.f2681d
            r1.onTouchEvent(r0)
            r0.recycle()
            return
    }

    /* renamed from: a */
    public abstract void mo1503a(int r1, int r2);

    /* renamed from: a */
    public abstract boolean mo1504a(int r1);

    /* renamed from: b */
    public androidx.core.widget.AbstractView$OnTouchListenerC0710a m1536b(float r4, float r5) {
            r3 = this;
            float[] r0 = r3.f2689l
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 / r1
            r2 = 0
            r0[r2] = r4
            float r5 = r5 / r1
            r4 = 1
            r0[r4] = r5
            return r3
    }

    /* renamed from: b */
    boolean m1537b() {
            r2 = this;
            androidx.core.widget.a$a r0 = r2.f2679b
            int r1 = r0.m1516e()
            int r0 = r0.m1517d()
            if (r1 == 0) goto L_0x0012
            boolean r1 = r2.mo1502b(r1)
            if (r1 != 0) goto L_0x001a
        L_0x0012:
            if (r0 == 0) goto L_0x001c
            boolean r0 = r2.mo1504a(r0)
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
    }

    /* renamed from: b */
    public abstract boolean mo1502b(int r1);

    /* renamed from: c */
    public androidx.core.widget.AbstractView$OnTouchListenerC0710a m1534c(float r4, float r5) {
            r3 = this;
            float[] r0 = r3.f2688k
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 / r1
            r2 = 0
            r0[r2] = r4
            float r5 = r5 / r1
            r4 = 1
            r0[r4] = r5
            return r3
    }

    /* renamed from: c */
    public androidx.core.widget.AbstractView$OnTouchListenerC0710a m1533c(int r1) {
            r0 = this;
            r0.f2686i = r1
            return r0
    }

    /* renamed from: d */
    public androidx.core.widget.AbstractView$OnTouchListenerC0710a m1531d(float r3, float r4) {
            r2 = this;
            float[] r0 = r2.f2683f
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            return r2
    }

    /* renamed from: d */
    public androidx.core.widget.AbstractView$OnTouchListenerC0710a m1530d(int r1) {
            r0 = this;
            r0.f2685h = r1
            return r0
    }

    /* renamed from: e */
    public androidx.core.widget.AbstractView$OnTouchListenerC0710a m1529e(float r4, float r5) {
            r3 = this;
            float[] r0 = r3.f2687j
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 / r1
            r2 = 0
            r0[r2] = r4
            float r5 = r5 / r1
            r4 = 1
            r0[r4] = r5
            return r3
    }

    /* renamed from: e */
    public androidx.core.widget.AbstractView$OnTouchListenerC0710a m1528e(int r2) {
            r1 = this;
            androidx.core.widget.a$a r0 = r1.f2679b
            r0.m1522a(r2)
            return r1
    }

    /* renamed from: f */
    public androidx.core.widget.AbstractView$OnTouchListenerC0710a m1526f(int r2) {
            r1 = this;
            androidx.core.widget.a$a r0 = r1.f2679b
            r0.m1519b(r2)
            return r1
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
            r5 = this;
            boolean r0 = r5.f2694q
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.m1535c()
            goto L_0x0058
        L_0x001a:
            r5.f2692o = r2
            r5.f2690m = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2681d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m1540a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2681d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m1540a(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f2679b
            r7.m1523a(r0, r6)
            boolean r6 = r5.f2693p
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.m1537b()
            if (r6 == 0) goto L_0x0058
            r5.m1532d()
        L_0x0058:
            boolean r6 = r5.f2695r
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f2693p
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
    }
}
