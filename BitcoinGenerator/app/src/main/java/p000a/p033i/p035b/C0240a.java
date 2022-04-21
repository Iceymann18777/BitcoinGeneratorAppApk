package p000a.p033i.p035b;

/* renamed from: a.i.b.a */
/* loaded from: classes.dex */
public class C0240a {

    /* renamed from: w */
    private static final android.view.animation.Interpolator f702w = null;

    /* renamed from: a */
    private int f703a;

    /* renamed from: b */
    private int f704b;

    /* renamed from: c */
    private int f705c;

    /* renamed from: d */
    private float[] f706d;

    /* renamed from: e */
    private float[] f707e;

    /* renamed from: f */
    private float[] f708f;

    /* renamed from: g */
    private float[] f709g;

    /* renamed from: h */
    private int[] f710h;

    /* renamed from: i */
    private int[] f711i;

    /* renamed from: j */
    private int[] f712j;

    /* renamed from: k */
    private int f713k;

    /* renamed from: l */
    private android.view.VelocityTracker f714l;

    /* renamed from: m */
    private float f715m;

    /* renamed from: n */
    private float f716n;

    /* renamed from: o */
    private int f717o;

    /* renamed from: p */
    private int f718p;

    /* renamed from: q */
    private android.widget.OverScroller f719q;

    /* renamed from: r */
    private final p000a.p033i.p035b.C0240a.AbstractC0243c f720r;

    /* renamed from: s */
    private android.view.View f721s;

    /* renamed from: t */
    private boolean f722t;

    /* renamed from: u */
    private final android.view.ViewGroup f723u;

    /* renamed from: v */
    private final java.lang.Runnable f724v;

    /* renamed from: a.i.b.a$a  reason: invalid class name */
    /* loaded from: classes.dex */
    static class animationInterpolatorC0241a implements android.view.animation.Interpolator {
        animationInterpolatorC0241a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float r3) {
                r2 = this;
                r0 = 1065353216(0x3f800000, float:1.0)
                float r3 = r3 - r0
                float r1 = r3 * r3
                float r1 = r1 * r3
                float r1 = r1 * r3
                float r1 = r1 * r3
                float r1 = r1 + r0
                return r1
        }
    }

    /* renamed from: a.i.b.a$b */
    /* loaded from: classes.dex */
    class RunnableC0242b implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ p000a.p033i.p035b.C0240a f725b;

        RunnableC0242b(p000a.p033i.p035b.C0240a r1) {
                r0 = this;
                r0.f725b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                a.i.b.a r0 = r2.f725b
                r1 = 0
                r0.m3317c(r1)
                return
        }
    }

    /* renamed from: a.i.b.a$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0243c {
        public AbstractC0243c() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public int m3304a(int r1) {
                r0 = this;
                return r1
        }

        /* renamed from: a */
        public int mo303a(android.view.View r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: a */
        public abstract int mo237a(android.view.View r1, int r2, int r3);

        /* renamed from: a */
        public void mo1420a(int r1, int r2) {
                r0 = this;
                return
        }

        /* renamed from: a */
        public abstract void mo238a(android.view.View r1, float r2, float r3);

        /* renamed from: a */
        public void mo301a(android.view.View r1, int r2) {
                r0 = this;
                return
        }

        /* renamed from: a */
        public abstract void mo236a(android.view.View r1, int r2, int r3, int r4, int r5);

        /* renamed from: b */
        public int mo235b(android.view.View r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: b */
        public abstract int mo233b(android.view.View r1, int r2, int r3);

        /* renamed from: b */
        public void mo1416b(int r1, int r2) {
                r0 = this;
                return
        }

        /* renamed from: b */
        public boolean mo1417b(int r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: b */
        public abstract boolean mo234b(android.view.View r1, int r2);

        /* renamed from: c */
        public abstract void mo232c(int r1);
    }

    static {
            a.i.b.a$a r0 = new a.i.b.a$a
            r0.<init>()
            p000a.p033i.p035b.C0240a.f702w = r0
            return
    }

    private C0240a(android.content.Context r2, android.view.ViewGroup r3, p000a.p033i.p035b.C0240a.AbstractC0243c r4) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f705c = r0
            a.i.b.a$b r0 = new a.i.b.a$b
            r0.<init>(r1)
            r1.f724v = r0
            if (r3 == 0) goto L_0x0053
            if (r4 == 0) goto L_0x004b
            r1.f723u = r3
            r1.f720r = r4
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r2)
            android.content.res.Resources r4 = r2.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            r0 = 1101004800(0x41a00000, float:20.0)
            float r4 = r4 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r0
            int r4 = (int) r4
            r1.f717o = r4
            int r4 = r3.getScaledTouchSlop()
            r1.f704b = r4
            int r4 = r3.getScaledMaximumFlingVelocity()
            float r4 = (float) r4
            r1.f715m = r4
            int r3 = r3.getScaledMinimumFlingVelocity()
            float r3 = (float) r3
            r1.f716n = r3
            android.widget.OverScroller r3 = new android.widget.OverScroller
            android.view.animation.Interpolator r4 = p000a.p033i.p035b.C0240a.f702w
            r3.<init>(r2, r4)
            r1.f719q = r3
            return
        L_0x004b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Callback may not be null"
            r2.<init>(r3)
            throw r2
        L_0x0053:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Parent view may not be null"
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: a */
    private float m3343a(float r3, float r4, float r5) {
            r2 = this;
            float r0 = java.lang.Math.abs(r3)
            r1 = 0
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x000a
            return r1
        L_0x000a:
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0015
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            float r5 = -r5
        L_0x0014:
            return r5
        L_0x0015:
            return r3
    }

    /* renamed from: a */
    private int m3338a(int r2, int r3, int r4) {
            r1 = this;
            int r0 = java.lang.Math.abs(r2)
            if (r0 >= r3) goto L_0x0008
            r2 = 0
            return r2
        L_0x0008:
            if (r0 <= r4) goto L_0x000f
            if (r2 <= 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            int r4 = -r4
        L_0x000e:
            return r4
        L_0x000f:
            return r2
    }

    /* renamed from: a */
    private int m3332a(android.view.View r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            float r0 = r6.f716n
            int r0 = (int) r0
            float r1 = r6.f715m
            int r1 = (int) r1
            int r10 = r6.m3338a(r10, r0, r1)
            float r0 = r6.f716n
            int r0 = (int) r0
            float r1 = r6.f715m
            int r1 = (int) r1
            int r11 = r6.m3338a(r11, r0, r1)
            int r0 = java.lang.Math.abs(r8)
            int r1 = java.lang.Math.abs(r9)
            int r2 = java.lang.Math.abs(r10)
            int r3 = java.lang.Math.abs(r11)
            int r4 = r2 + r3
            int r5 = r0 + r1
            if (r10 == 0) goto L_0x002d
            float r0 = (float) r2
            float r2 = (float) r4
            goto L_0x002f
        L_0x002d:
            float r0 = (float) r0
            float r2 = (float) r5
        L_0x002f:
            float r0 = r0 / r2
            if (r11 == 0) goto L_0x0035
            float r1 = (float) r3
            float r2 = (float) r4
            goto L_0x0037
        L_0x0035:
            float r1 = (float) r1
            float r2 = (float) r5
        L_0x0037:
            float r1 = r1 / r2
            a.i.b.a$c r2 = r6.f720r
            int r2 = r2.mo303a(r7)
            int r8 = r6.m3323b(r8, r10, r2)
            a.i.b.a$c r10 = r6.f720r
            int r7 = r10.mo235b(r7)
            int r7 = r6.m3323b(r9, r11, r7)
            float r8 = (float) r8
            float r8 = r8 * r0
            float r7 = (float) r7
            float r7 = r7 * r1
            float r8 = r8 + r7
            int r7 = (int) r8
            return r7
    }

    /* renamed from: a */
    public static p000a.p033i.p035b.C0240a m3331a(android.view.ViewGroup r1, float r2, p000a.p033i.p035b.C0240a.AbstractC0243c r3) {
            a.i.b.a r1 = m3330a(r1, r3)
            int r3 = r1.f704b
            float r3 = (float) r3
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 / r2
            float r3 = r3 * r0
            int r2 = (int) r3
            r1.f704b = r2
            return r1
    }

    /* renamed from: a */
    public static p000a.p033i.p035b.C0240a m3330a(android.view.ViewGroup r2, p000a.p033i.p035b.C0240a.AbstractC0243c r3) {
            a.i.b.a r0 = new a.i.b.a
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r2, r3)
            return r0
    }

    /* renamed from: a */
    private void m3344a(float r4, float r5) {
            r3 = this;
            r0 = 1
            r3.f722t = r0
            a.i.b.a$c r1 = r3.f720r
            android.view.View r2 = r3.f721s
            r1.mo238a(r2, r4, r5)
            r4 = 0
            r3.f722t = r4
            int r5 = r3.f703a
            if (r5 != r0) goto L_0x0014
            r3.m3317c(r4)
        L_0x0014:
            return
    }

    /* renamed from: a */
    private void m3342a(float r3, float r4, int r5) {
            r2 = this;
            r0 = 1
            boolean r1 = r2.m3341a(r3, r4, r5, r0)
            if (r1 == 0) goto L_0x0008
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            r1 = 4
            boolean r1 = r2.m3341a(r4, r3, r5, r1)
            if (r1 == 0) goto L_0x0012
            r0 = r0 | 4
        L_0x0012:
            r1 = 2
            boolean r1 = r2.m3341a(r3, r4, r5, r1)
            if (r1 == 0) goto L_0x001b
            r0 = r0 | 2
        L_0x001b:
            r1 = 8
            boolean r3 = r2.m3341a(r4, r3, r5, r1)
            if (r3 == 0) goto L_0x0025
            r0 = r0 | 8
        L_0x0025:
            if (r0 == 0) goto L_0x0033
            int[] r3 = r2.f711i
            r4 = r3[r5]
            r4 = r4 | r0
            r3[r5] = r4
            a.i.b.a$c r3 = r2.f720r
            r3.mo1420a(r0, r5)
        L_0x0033:
            return
    }

    /* renamed from: a */
    private void m3337a(int r11, int r12, int r13, int r14) {
            r10 = this;
            android.view.View r0 = r10.f721s
            int r0 = r0.getLeft()
            android.view.View r1 = r10.f721s
            int r1 = r1.getTop()
            if (r13 == 0) goto L_0x001d
            a.i.b.a$c r2 = r10.f720r
            android.view.View r3 = r10.f721s
            int r11 = r2.mo237a(r3, r11, r13)
            android.view.View r2 = r10.f721s
            int r3 = r11 - r0
            p000a.p018g.p029l.C0216r.m3422c(r2, r3)
        L_0x001d:
            r6 = r11
            if (r14 == 0) goto L_0x002f
            a.i.b.a$c r11 = r10.f720r
            android.view.View r2 = r10.f721s
            int r12 = r11.mo233b(r2, r12, r14)
            android.view.View r11 = r10.f721s
            int r2 = r12 - r1
            p000a.p018g.p029l.C0216r.m3420d(r11, r2)
        L_0x002f:
            r7 = r12
            if (r13 != 0) goto L_0x0034
            if (r14 == 0) goto L_0x003f
        L_0x0034:
            int r8 = r6 - r0
            int r9 = r7 - r1
            a.i.b.a$c r4 = r10.f720r
            android.view.View r5 = r10.f721s
            r4.mo236a(r5, r6, r7, r8, r9)
        L_0x003f:
            return
    }

    /* renamed from: a */
    private boolean m3341a(float r4, float r5, int r6, int r7) {
            r3 = this;
            float r4 = java.lang.Math.abs(r4)
            float r5 = java.lang.Math.abs(r5)
            int[] r0 = r3.f710h
            r0 = r0[r6]
            r0 = r0 & r7
            r1 = 0
            if (r0 != r7) goto L_0x0057
            int r0 = r3.f718p
            r0 = r0 & r7
            if (r0 == 0) goto L_0x0057
            int[] r0 = r3.f712j
            r0 = r0[r6]
            r0 = r0 & r7
            if (r0 == r7) goto L_0x0057
            int[] r0 = r3.f711i
            r0 = r0[r6]
            r0 = r0 & r7
            if (r0 == r7) goto L_0x0057
            int r0 = r3.f704b
            float r2 = (float) r0
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0030
            float r0 = (float) r0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0030
            goto L_0x0057
        L_0x0030:
            r0 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r0
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x0048
            a.i.b.a$c r5 = r3.f720r
            boolean r5 = r5.mo1417b(r7)
            if (r5 == 0) goto L_0x0048
            int[] r4 = r3.f712j
            r5 = r4[r6]
            r5 = r5 | r7
            r4[r6] = r5
            return r1
        L_0x0048:
            int[] r5 = r3.f711i
            r5 = r5[r6]
            r5 = r5 & r7
            if (r5 != 0) goto L_0x0057
            int r5 = r3.f704b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0057
            r1 = 1
        L_0x0057:
            return r1
    }

    /* renamed from: a */
    private boolean m3335a(android.view.View r5, float r6, float r7) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            a.i.b.a$c r1 = r4.f720r
            int r1 = r1.mo303a(r5)
            r2 = 1
            if (r1 <= 0) goto L_0x000f
            r1 = 1
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            a.i.b.a$c r3 = r4.f720r
            int r5 = r3.mo235b(r5)
            if (r5 <= 0) goto L_0x001a
            r5 = 1
            goto L_0x001b
        L_0x001a:
            r5 = 0
        L_0x001b:
            if (r1 == 0) goto L_0x002f
            if (r5 == 0) goto L_0x002f
            float r6 = r6 * r6
            float r7 = r7 * r7
            float r6 = r6 + r7
            int r5 = r4.f704b
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x002e
            r0 = 1
        L_0x002e:
            return r0
        L_0x002f:
            if (r1 == 0) goto L_0x003e
            float r5 = java.lang.Math.abs(r6)
            int r6 = r4.f704b
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x003d
            r0 = 1
        L_0x003d:
            return r0
        L_0x003e:
            if (r5 == 0) goto L_0x004c
            float r5 = java.lang.Math.abs(r7)
            int r6 = r4.f704b
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x004c
            r0 = 1
        L_0x004c:
            return r0
    }

    /* renamed from: b */
    private float m3327b(float r3) {
            r2 = this;
            r0 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 - r0
            r0 = 1055999547(0x3ef1463b, float:0.47123894)
            float r3 = r3 * r0
            double r0 = (double) r3
            double r0 = java.lang.Math.sin(r0)
            float r3 = (float) r0
            return r3
    }

    /* renamed from: b */
    private int m3323b(int r4, int r5, int r6) {
            r3 = this;
            if (r4 != 0) goto L_0x0004
            r4 = 0
            return r4
        L_0x0004:
            android.view.ViewGroup r0 = r3.f723u
            int r0 = r0.getWidth()
            int r1 = r0 / 2
            int r2 = java.lang.Math.abs(r4)
            float r2 = (float) r2
            float r0 = (float) r0
            float r2 = r2 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r0, r2)
            float r1 = (float) r1
            float r2 = r3.m3327b(r2)
            float r2 = r2 * r1
            float r1 = r1 + r2
            int r5 = java.lang.Math.abs(r5)
            if (r5 <= 0) goto L_0x0038
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r5 = (float) r5
            float r1 = r1 / r5
            float r5 = java.lang.Math.abs(r1)
            float r5 = r5 * r4
            int r4 = java.lang.Math.round(r5)
            int r4 = r4 * 4
            goto L_0x0045
        L_0x0038:
            int r4 = java.lang.Math.abs(r4)
            float r4 = (float) r4
            float r5 = (float) r6
            float r4 = r4 / r5
            float r4 = r4 + r0
            r5 = 1132462080(0x43800000, float:256.0)
            float r4 = r4 * r5
            int r4 = (int) r4
        L_0x0045:
            r5 = 600(0x258, float:8.41E-43)
            int r4 = java.lang.Math.min(r4, r5)
            return r4
    }

    /* renamed from: b */
    private void m3326b(float r3, float r4, int r5) {
            r2 = this;
            r2.m3307f(r5)
            float[] r0 = r2.f706d
            float[] r1 = r2.f708f
            r1[r5] = r3
            r0[r5] = r3
            float[] r0 = r2.f707e
            float[] r1 = r2.f709g
            r1[r5] = r4
            r0[r5] = r4
            int[] r0 = r2.f710h
            int r3 = (int) r3
            int r4 = (int) r4
            int r3 = r2.m3309e(r3, r4)
            r0[r5] = r3
            int r3 = r2.f713k
            r4 = 1
            int r4 = r4 << r5
            r3 = r3 | r4
            r2.f713k = r3
            return
    }

    /* renamed from: b */
    private boolean m3322b(int r11, int r12, int r13, int r14) {
            r10 = this;
            android.view.View r0 = r10.f721s
            int r2 = r0.getLeft()
            android.view.View r0 = r10.f721s
            int r3 = r0.getTop()
            int r11 = r11 - r2
            int r12 = r12 - r3
            if (r11 != 0) goto L_0x001c
            if (r12 != 0) goto L_0x001c
            android.widget.OverScroller r11 = r10.f719q
            r11.abortAnimation()
            r11 = 0
            r10.m3317c(r11)
            return r11
        L_0x001c:
            android.view.View r5 = r10.f721s
            r4 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            int r6 = r4.m3332a(r5, r6, r7, r8, r9)
            android.widget.OverScroller r1 = r10.f719q
            r4 = r11
            r5 = r12
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.m3317c(r11)
            r11 = 1
            return r11
    }

    /* renamed from: c */
    private void m3315c(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = r7.getPointerCount()
            r1 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x0025
            int r2 = r7.getPointerId(r1)
            boolean r3 = r6.m3305g(r2)
            if (r3 != 0) goto L_0x0012
            goto L_0x0022
        L_0x0012:
            float r3 = r7.getX(r1)
            float r4 = r7.getY(r1)
            float[] r5 = r6.f708f
            r5[r2] = r3
            float[] r3 = r6.f709g
            r3[r2] = r4
        L_0x0022:
            int r1 = r1 + 1
            goto L_0x0005
        L_0x0025:
            return
    }

    /* renamed from: e */
    private int m3309e(int r4, int r5) {
            r3 = this;
            android.view.ViewGroup r0 = r3.f723u
            int r0 = r0.getLeft()
            int r1 = r3.f717o
            int r0 = r0 + r1
            if (r4 >= r0) goto L_0x000d
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            android.view.ViewGroup r1 = r3.f723u
            int r1 = r1.getTop()
            int r2 = r3.f717o
            int r1 = r1 + r2
            if (r5 >= r1) goto L_0x001b
            r0 = r0 | 4
        L_0x001b:
            android.view.ViewGroup r1 = r3.f723u
            int r1 = r1.getRight()
            int r2 = r3.f717o
            int r1 = r1 - r2
            if (r4 <= r1) goto L_0x0028
            r0 = r0 | 2
        L_0x0028:
            android.view.ViewGroup r4 = r3.f723u
            int r4 = r4.getBottom()
            int r1 = r3.f717o
            int r4 = r4 - r1
            if (r5 <= r4) goto L_0x0035
            r0 = r0 | 8
        L_0x0035:
            return r0
    }

    /* renamed from: e */
    private void m3310e(int r3) {
            r2 = this;
            float[] r0 = r2.f706d
            if (r0 == 0) goto L_0x0033
            boolean r0 = r2.m3325b(r3)
            if (r0 != 0) goto L_0x000b
            goto L_0x0033
        L_0x000b:
            float[] r0 = r2.f706d
            r1 = 0
            r0[r3] = r1
            float[] r0 = r2.f707e
            r0[r3] = r1
            float[] r0 = r2.f708f
            r0[r3] = r1
            float[] r0 = r2.f709g
            r0[r3] = r1
            int[] r0 = r2.f710h
            r1 = 0
            r0[r3] = r1
            int[] r0 = r2.f711i
            r0[r3] = r1
            int[] r0 = r2.f712j
            r0[r3] = r1
            int r0 = r2.f713k
            r1 = 1
            int r3 = r1 << r3
            r3 = r3 ^ (-1)
            r3 = r3 & r0
            r2.f713k = r3
        L_0x0033:
            return
    }

    /* renamed from: f */
    private void m3308f() {
            r2 = this;
            float[] r0 = r2.f706d
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            float[] r0 = r2.f707e
            java.util.Arrays.fill(r0, r1)
            float[] r0 = r2.f708f
            java.util.Arrays.fill(r0, r1)
            float[] r0 = r2.f709g
            java.util.Arrays.fill(r0, r1)
            int[] r0 = r2.f710h
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            int[] r0 = r2.f711i
            java.util.Arrays.fill(r0, r1)
            int[] r0 = r2.f712j
            java.util.Arrays.fill(r0, r1)
            r2.f713k = r1
            return
    }

    /* renamed from: f */
    private void m3307f(int r10) {
            r9 = this;
            float[] r0 = r9.f706d
            if (r0 == 0) goto L_0x0007
            int r0 = r0.length
            if (r0 > r10) goto L_0x0052
        L_0x0007:
            int r10 = r10 + 1
            float[] r0 = new float[r10]
            float[] r1 = new float[r10]
            float[] r2 = new float[r10]
            float[] r3 = new float[r10]
            int[] r4 = new int[r10]
            int[] r5 = new int[r10]
            int[] r10 = new int[r10]
            float[] r6 = r9.f706d
            if (r6 == 0) goto L_0x0044
            int r7 = r6.length
            r8 = 0
            java.lang.System.arraycopy(r6, r8, r0, r8, r7)
            float[] r6 = r9.f707e
            int r7 = r6.length
            java.lang.System.arraycopy(r6, r8, r1, r8, r7)
            float[] r6 = r9.f708f
            int r7 = r6.length
            java.lang.System.arraycopy(r6, r8, r2, r8, r7)
            float[] r6 = r9.f709g
            int r7 = r6.length
            java.lang.System.arraycopy(r6, r8, r3, r8, r7)
            int[] r6 = r9.f710h
            int r7 = r6.length
            java.lang.System.arraycopy(r6, r8, r4, r8, r7)
            int[] r6 = r9.f711i
            int r7 = r6.length
            java.lang.System.arraycopy(r6, r8, r5, r8, r7)
            int[] r6 = r9.f712j
            int r7 = r6.length
            java.lang.System.arraycopy(r6, r8, r10, r8, r7)
        L_0x0044:
            r9.f706d = r0
            r9.f707e = r1
            r9.f708f = r2
            r9.f709g = r3
            r9.f710h = r4
            r9.f711i = r5
            r9.f712j = r10
        L_0x0052:
            return
    }

    /* renamed from: g */
    private void m3306g() {
            r4 = this;
            android.view.VelocityTracker r0 = r4.f714l
            float r1 = r4.f715m
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r2, r1)
            android.view.VelocityTracker r0 = r4.f714l
            int r1 = r4.f705c
            float r0 = r0.getXVelocity(r1)
            float r1 = r4.f716n
            float r2 = r4.f715m
            float r0 = r4.m3343a(r0, r1, r2)
            android.view.VelocityTracker r1 = r4.f714l
            int r2 = r4.f705c
            float r1 = r1.getYVelocity(r2)
            float r2 = r4.f716n
            float r3 = r4.f715m
            float r1 = r4.m3343a(r1, r2, r3)
            r4.m3344a(r0, r1)
            return
    }

    /* renamed from: g */
    private boolean m3305g(int r3) {
            r2 = this;
            boolean r0 = r2.m3325b(r3)
            if (r0 != 0) goto L_0x002d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring pointerId="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " because ACTION_DOWN was not received "
            r0.append(r3)
            java.lang.String r3 = "for this pointer before ACTION_MOVE. It likely happened because "
            r0.append(r3)
            java.lang.String r3 = " ViewDragHelper did not receive all the events in the event stream."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "ViewDragHelper"
            android.util.Log.e(r0, r3)
            r3 = 0
            return r3
        L_0x002d:
            r3 = 1
            return r3
    }

    /* renamed from: a */
    public void m3346a() {
            r1 = this;
            r0 = -1
            r1.f705c = r0
            r1.m3308f()
            android.view.VelocityTracker r0 = r1.f714l
            if (r0 == 0) goto L_0x0010
            r0.recycle()
            r0 = 0
            r1.f714l = r0
        L_0x0010:
            return
    }

    /* renamed from: a */
    public void m3345a(float r1) {
            r0 = this;
            r0.f716n = r1
            return
    }

    /* renamed from: a */
    public void m3336a(android.view.MotionEvent r10) {
            r9 = this;
            int r0 = r10.getActionMasked()
            int r1 = r10.getActionIndex()
            if (r0 != 0) goto L_0x000d
            r9.m3346a()
        L_0x000d:
            android.view.VelocityTracker r2 = r9.f714l
            if (r2 != 0) goto L_0x0017
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r9.f714l = r2
        L_0x0017:
            android.view.VelocityTracker r2 = r9.f714l
            r2.addMovement(r10)
            r2 = 0
            if (r0 == 0) goto L_0x014a
            r3 = 1
            if (r0 == r3) goto L_0x013f
            r4 = 2
            if (r0 == r4) goto L_0x00bc
            r4 = 3
            if (r0 == r4) goto L_0x00b2
            r4 = 5
            if (r0 == r4) goto L_0x0075
            r4 = 6
            if (r0 == r4) goto L_0x0030
            goto L_0x0172
        L_0x0030:
            int r0 = r10.getPointerId(r1)
            int r1 = r9.f703a
            if (r1 != r3) goto L_0x0070
            int r1 = r9.f705c
            if (r0 != r1) goto L_0x0070
            int r1 = r10.getPointerCount()
        L_0x0040:
            r3 = -1
            if (r2 >= r1) goto L_0x006a
            int r4 = r10.getPointerId(r2)
            int r5 = r9.f705c
            if (r4 != r5) goto L_0x004c
            goto L_0x0067
        L_0x004c:
            float r5 = r10.getX(r2)
            float r6 = r10.getY(r2)
            int r5 = (int) r5
            int r6 = (int) r6
            android.view.View r5 = r9.m3324b(r5, r6)
            android.view.View r6 = r9.f721s
            if (r5 != r6) goto L_0x0067
            boolean r4 = r9.m3320b(r6, r4)
            if (r4 == 0) goto L_0x0067
            int r10 = r9.f705c
            goto L_0x006b
        L_0x0067:
            int r2 = r2 + 1
            goto L_0x0040
        L_0x006a:
            r10 = -1
        L_0x006b:
            if (r10 != r3) goto L_0x0070
            r9.m3306g()
        L_0x0070:
            r9.m3310e(r0)
            goto L_0x0172
        L_0x0075:
            int r0 = r10.getPointerId(r1)
            float r2 = r10.getX(r1)
            float r10 = r10.getY(r1)
            r9.m3326b(r2, r10, r0)
            int r1 = r9.f703a
            if (r1 != 0) goto L_0x00a3
            int r1 = (int) r2
            int r10 = (int) r10
            android.view.View r10 = r9.m3324b(r1, r10)
            r9.m3320b(r10, r0)
            int[] r10 = r9.f710h
            r10 = r10[r0]
            int r1 = r9.f718p
            r2 = r10 & r1
            if (r2 == 0) goto L_0x0172
            a.i.b.a$c r2 = r9.f720r
            r10 = r10 & r1
            r2.mo1416b(r10, r0)
            goto L_0x0172
        L_0x00a3:
            int r1 = (int) r2
            int r10 = (int) r10
            boolean r10 = r9.m3316c(r1, r10)
            if (r10 == 0) goto L_0x0172
            android.view.View r10 = r9.f721s
            r9.m3320b(r10, r0)
            goto L_0x0172
        L_0x00b2:
            int r10 = r9.f703a
            if (r10 != r3) goto L_0x0146
            r10 = 0
            r9.m3344a(r10, r10)
            goto L_0x0146
        L_0x00bc:
            int r0 = r9.f703a
            if (r0 != r3) goto L_0x00fc
            int r0 = r9.f705c
            boolean r0 = r9.m3305g(r0)
            if (r0 != 0) goto L_0x00ca
            goto L_0x0172
        L_0x00ca:
            int r0 = r9.f705c
            int r0 = r10.findPointerIndex(r0)
            float r1 = r10.getX(r0)
            float r0 = r10.getY(r0)
            float[] r2 = r9.f708f
            int r3 = r9.f705c
            r2 = r2[r3]
            float r1 = r1 - r2
            int r1 = (int) r1
            float[] r2 = r9.f709g
            r2 = r2[r3]
            float r0 = r0 - r2
            int r0 = (int) r0
            android.view.View r2 = r9.f721s
            int r2 = r2.getLeft()
            int r2 = r2 + r1
            android.view.View r3 = r9.f721s
            int r3 = r3.getTop()
            int r3 = r3 + r0
            r9.m3337a(r2, r3, r1, r0)
        L_0x00f7:
            r9.m3315c(r10)
            goto L_0x0172
        L_0x00fc:
            int r0 = r10.getPointerCount()
        L_0x0100:
            if (r2 >= r0) goto L_0x00f7
            int r1 = r10.getPointerId(r2)
            boolean r4 = r9.m3305g(r1)
            if (r4 != 0) goto L_0x010d
            goto L_0x013c
        L_0x010d:
            float r4 = r10.getX(r2)
            float r5 = r10.getY(r2)
            float[] r6 = r9.f706d
            r6 = r6[r1]
            float r6 = r4 - r6
            float[] r7 = r9.f707e
            r7 = r7[r1]
            float r7 = r5 - r7
            r9.m3342a(r6, r7, r1)
            int r8 = r9.f703a
            if (r8 != r3) goto L_0x0129
            goto L_0x00f7
        L_0x0129:
            int r4 = (int) r4
            int r5 = (int) r5
            android.view.View r4 = r9.m3324b(r4, r5)
            boolean r5 = r9.m3335a(r4, r6, r7)
            if (r5 == 0) goto L_0x013c
            boolean r1 = r9.m3320b(r4, r1)
            if (r1 == 0) goto L_0x013c
            goto L_0x00f7
        L_0x013c:
            int r2 = r2 + 1
            goto L_0x0100
        L_0x013f:
            int r10 = r9.f703a
            if (r10 != r3) goto L_0x0146
            r9.m3306g()
        L_0x0146:
            r9.m3346a()
            goto L_0x0172
        L_0x014a:
            float r0 = r10.getX()
            float r1 = r10.getY()
            int r10 = r10.getPointerId(r2)
            int r2 = (int) r0
            int r3 = (int) r1
            android.view.View r2 = r9.m3324b(r2, r3)
            r9.m3326b(r0, r1, r10)
            r9.m3320b(r2, r10)
            int[] r0 = r9.f710h
            r0 = r0[r10]
            int r1 = r9.f718p
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0172
            a.i.b.a$c r2 = r9.f720r
            r0 = r0 & r1
            r2.mo1416b(r0, r10)
        L_0x0172:
            return
    }

    /* renamed from: a */
    public void m3334a(android.view.View r3, int r4) {
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
            android.view.ViewGroup r1 = r2.f723u
            if (r0 != r1) goto L_0x0016
            r2.f721s = r3
            r2.f705c = r4
            a.i.b.a$c r0 = r2.f720r
            r0.mo301a(r3, r4)
            r3 = 1
            r2.m3317c(r3)
            return
        L_0x0016:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view ("
            r4.append(r0)
            android.view.ViewGroup r0 = r2.f723u
            r4.append(r0)
            java.lang.String r0 = ")"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    /* renamed from: a */
    public boolean m3340a(int r5) {
            r4 = this;
            float[] r0 = r4.f706d
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r2 >= r0) goto L_0x0012
            boolean r3 = r4.m3339a(r5, r2)
            if (r3 == 0) goto L_0x000f
            r5 = 1
            return r5
        L_0x000f:
            int r2 = r2 + 1
            goto L_0x0005
        L_0x0012:
            return r1
    }

    /* renamed from: a */
    public boolean m3339a(int r7, int r8) {
            r6 = this;
            boolean r0 = r6.m3325b(r8)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = r7 & 1
            r2 = 1
            if (r0 != r2) goto L_0x000f
            r0 = 1
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r3 = 2
            r7 = r7 & r3
            if (r7 != r3) goto L_0x0016
            r7 = 1
            goto L_0x0017
        L_0x0016:
            r7 = 0
        L_0x0017:
            float[] r3 = r6.f708f
            r3 = r3[r8]
            float[] r4 = r6.f706d
            r4 = r4[r8]
            float r3 = r3 - r4
            float[] r4 = r6.f709g
            r4 = r4[r8]
            float[] r5 = r6.f707e
            r8 = r5[r8]
            float r4 = r4 - r8
            if (r0 == 0) goto L_0x003d
            if (r7 == 0) goto L_0x003d
            float r3 = r3 * r3
            float r4 = r4 * r4
            float r3 = r3 + r4
            int r7 = r6.f704b
            int r7 = r7 * r7
            float r7 = (float) r7
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x003c
            r1 = 1
        L_0x003c:
            return r1
        L_0x003d:
            if (r0 == 0) goto L_0x004c
            float r7 = java.lang.Math.abs(r3)
            int r8 = r6.f704b
            float r8 = (float) r8
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x004b
            r1 = 1
        L_0x004b:
            return r1
        L_0x004c:
            if (r7 == 0) goto L_0x005a
            float r7 = java.lang.Math.abs(r4)
            int r8 = r6.f704b
            float r8 = (float) r8
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x005a
            r1 = 1
        L_0x005a:
            return r1
    }

    /* renamed from: a */
    public boolean m3333a(android.view.View r3, int r4, int r5) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r3.getLeft()
            if (r4 < r1) goto L_0x001d
            int r1 = r3.getRight()
            if (r4 >= r1) goto L_0x001d
            int r4 = r3.getTop()
            if (r5 < r4) goto L_0x001d
            int r3 = r3.getBottom()
            if (r5 >= r3) goto L_0x001d
            r0 = 1
        L_0x001d:
            return r0
    }

    /* renamed from: a */
    public boolean m3329a(boolean r12) {
            r11 = this;
            int r0 = r11.f703a
            r1 = 2
            r2 = 0
            if (r0 != r1) goto L_0x006a
            android.widget.OverScroller r0 = r11.f719q
            boolean r0 = r0.computeScrollOffset()
            android.widget.OverScroller r3 = r11.f719q
            int r3 = r3.getCurrX()
            android.widget.OverScroller r4 = r11.f719q
            int r10 = r4.getCurrY()
            android.view.View r4 = r11.f721s
            int r4 = r4.getLeft()
            int r8 = r3 - r4
            android.view.View r4 = r11.f721s
            int r4 = r4.getTop()
            int r9 = r10 - r4
            if (r8 == 0) goto L_0x002f
            android.view.View r4 = r11.f721s
            p000a.p018g.p029l.C0216r.m3422c(r4, r8)
        L_0x002f:
            if (r9 == 0) goto L_0x0036
            android.view.View r4 = r11.f721s
            p000a.p018g.p029l.C0216r.m3420d(r4, r9)
        L_0x0036:
            if (r8 != 0) goto L_0x003a
            if (r9 == 0) goto L_0x0043
        L_0x003a:
            a.i.b.a$c r4 = r11.f720r
            android.view.View r5 = r11.f721s
            r6 = r3
            r7 = r10
            r4.mo236a(r5, r6, r7, r8, r9)
        L_0x0043:
            if (r0 == 0) goto L_0x005b
            android.widget.OverScroller r4 = r11.f719q
            int r4 = r4.getFinalX()
            if (r3 != r4) goto L_0x005b
            android.widget.OverScroller r3 = r11.f719q
            int r3 = r3.getFinalY()
            if (r10 != r3) goto L_0x005b
            android.widget.OverScroller r0 = r11.f719q
            r0.abortAnimation()
            r0 = 0
        L_0x005b:
            if (r0 != 0) goto L_0x006a
            if (r12 == 0) goto L_0x0067
            android.view.ViewGroup r12 = r11.f723u
            java.lang.Runnable r0 = r11.f724v
            r12.post(r0)
            goto L_0x006a
        L_0x0067:
            r11.m3317c(r2)
        L_0x006a:
            int r12 = r11.f703a
            if (r12 != r1) goto L_0x006f
            r2 = 1
        L_0x006f:
            return r2
    }

    /* renamed from: b */
    public android.view.View m3328b() {
            r1 = this;
            android.view.View r0 = r1.f721s
            return r0
    }

    /* renamed from: b */
    public android.view.View m3324b(int r4, int r5) {
            r3 = this;
            android.view.ViewGroup r0 = r3.f723u
            int r0 = r0.getChildCount()
            int r0 = r0 + (-1)
        L_0x0008:
            if (r0 < 0) goto L_0x0031
            android.view.ViewGroup r1 = r3.f723u
            a.i.b.a$c r2 = r3.f720r
            r2.m3304a(r0)
            android.view.View r1 = r1.getChildAt(r0)
            int r2 = r1.getLeft()
            if (r4 < r2) goto L_0x002e
            int r2 = r1.getRight()
            if (r4 >= r2) goto L_0x002e
            int r2 = r1.getTop()
            if (r5 < r2) goto L_0x002e
            int r2 = r1.getBottom()
            if (r5 >= r2) goto L_0x002e
            return r1
        L_0x002e:
            int r0 = r0 + (-1)
            goto L_0x0008
        L_0x0031:
            r4 = 0
            return r4
    }

    /* renamed from: b */
    public boolean m3325b(int r3) {
            r2 = this;
            int r0 = r2.f713k
            r1 = 1
            int r3 = r1 << r3
            r3 = r3 & r0
            if (r3 == 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            r1 = 0
        L_0x000a:
            return r1
    }

    /* renamed from: b */
    public boolean m3321b(android.view.MotionEvent r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.m3346a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f714l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f714l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f714l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.m3310e(r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.m3326b(r7, r1, r2)
            int r3 = r0.f703a
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f710h
            r1 = r1[r2]
            int r3 = r0.f718p
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            a.i.b.a$c r4 = r0.f720r
            r1 = r1 & r3
            r4.mo1416b(r1, r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.m3324b(r3, r1)
            android.view.View r3 = r0.f721s
            if (r1 != r3) goto L_0x0031
            r0.m3320b(r1, r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f706d
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f707e
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.m3305g(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f706d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f707e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.m3324b(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.m3335a(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = 1
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            a.i.b.a$c r14 = r0.f720r
            int r12 = r14.mo237a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            a.i.b.a$c r5 = r0.f720r
            int r5 = r5.mo233b(r7, r15, r14)
            a.i.b.a$c r14 = r0.f720r
            int r14 = r14.mo303a(r7)
            a.i.b.a$c r15 = r0.f720r
            int r15 = r15.mo235b(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.m3342a(r9, r10, r4)
            int r5 = r0.f703a
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.m3320b(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.m3315c(r17)
            goto L_0x0031
        L_0x00ff:
            r16.m3346a()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.m3326b(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.m3324b(r2, r3)
            android.view.View r3 = r0.f721s
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f703a
            if (r3 != r4) goto L_0x0125
            r0.m3320b(r2, r1)
        L_0x0125:
            int[] r2 = r0.f710h
            r2 = r2[r1]
            int r3 = r0.f718p
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            a.i.b.a$c r4 = r0.f720r
            r2 = r2 & r3
            r4.mo1416b(r2, r1)
        L_0x0135:
            int r1 = r0.f703a
            if (r1 != r6) goto L_0x013a
            r5 = 1
        L_0x013a:
            return r5
    }

    /* renamed from: b */
    boolean m3320b(android.view.View r3, int r4) {
            r2 = this;
            android.view.View r0 = r2.f721s
            r1 = 1
            if (r3 != r0) goto L_0x000a
            int r0 = r2.f705c
            if (r0 != r4) goto L_0x000a
            return r1
        L_0x000a:
            if (r3 == 0) goto L_0x001a
            a.i.b.a$c r0 = r2.f720r
            boolean r0 = r0.mo234b(r3, r4)
            if (r0 == 0) goto L_0x001a
            r2.f705c = r4
            r2.m3334a(r3, r4)
            return r1
        L_0x001a:
            r3 = 0
            return r3
    }

    /* renamed from: b */
    public boolean m3319b(android.view.View r1, int r2, int r3) {
            r0 = this;
            r0.f721s = r1
            r1 = -1
            r0.f705c = r1
            r1 = 0
            boolean r1 = r0.m3322b(r2, r3, r1, r1)
            if (r1 != 0) goto L_0x0017
            int r2 = r0.f703a
            if (r2 != 0) goto L_0x0017
            android.view.View r2 = r0.f721s
            if (r2 == 0) goto L_0x0017
            r2 = 0
            r0.f721s = r2
        L_0x0017:
            return r1
    }

    /* renamed from: c */
    public int m3318c() {
            r1 = this;
            int r0 = r1.f717o
            return r0
    }

    /* renamed from: c */
    void m3317c(int r3) {
            r2 = this;
            android.view.ViewGroup r0 = r2.f723u
            java.lang.Runnable r1 = r2.f724v
            r0.removeCallbacks(r1)
            int r0 = r2.f703a
            if (r0 == r3) goto L_0x0019
            r2.f703a = r3
            a.i.b.a$c r0 = r2.f720r
            r0.mo232c(r3)
            int r3 = r2.f703a
            if (r3 != 0) goto L_0x0019
            r3 = 0
            r2.f721s = r3
        L_0x0019:
            return
    }

    /* renamed from: c */
    public boolean m3316c(int r2, int r3) {
            r1 = this;
            android.view.View r0 = r1.f721s
            boolean r2 = r1.m3333a(r0, r2, r3)
            return r2
    }

    /* renamed from: d */
    public int m3314d() {
            r1 = this;
            int r0 = r1.f704b
            return r0
    }

    /* renamed from: d */
    public void m3313d(int r1) {
            r0 = this;
            r0.f718p = r1
            return
    }

    /* renamed from: d */
    public boolean m3312d(int r4, int r5) {
            r3 = this;
            boolean r0 = r3.f722t
            if (r0 == 0) goto L_0x001b
            android.view.VelocityTracker r0 = r3.f714l
            int r1 = r3.f705c
            float r0 = r0.getXVelocity(r1)
            int r0 = (int) r0
            android.view.VelocityTracker r1 = r3.f714l
            int r2 = r3.f705c
            float r1 = r1.getYVelocity(r2)
            int r1 = (int) r1
            boolean r4 = r3.m3322b(r4, r5, r0, r1)
            return r4
        L_0x001b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased"
            r4.<init>(r5)
            throw r4
    }

    /* renamed from: e */
    public int m3311e() {
            r1 = this;
            int r0 = r1.f703a
            return r0
    }
}
