package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.j */
/* loaded from: classes.dex */
public class C0813j extends android.view.ViewGroup implements p000a.p018g.p029l.AbstractC0214p, p000a.p018g.p029l.AbstractC0207i {

    /* renamed from: A0 */
    private static final int[] f3069A0 = null;

    /* renamed from: B0 */
    static final boolean f3070B0 = false;

    /* renamed from: C0 */
    static final boolean f3071C0 = false;

    /* renamed from: D0 */
    static final boolean f3072D0 = false;

    /* renamed from: E0 */
    private static final boolean f3073E0 = false;

    /* renamed from: F0 */
    private static final boolean f3074F0 = false;

    /* renamed from: G0 */
    private static final java.lang.Class<?>[] f3075G0 = null;

    /* renamed from: H0 */
    static final android.view.animation.Interpolator f3076H0 = null;

    /* renamed from: z0 */
    private static final int[] f3077z0 = null;

    /* renamed from: A */
    boolean f3078A;

    /* renamed from: B */
    private final android.view.accessibility.AccessibilityManager f3079B;

    /* renamed from: C */
    private java.util.List<androidx.recyclerview.widget.C0813j.AbstractC0841q> f3080C;

    /* renamed from: D */
    boolean f3081D;

    /* renamed from: E */
    boolean f3082E;

    /* renamed from: F */
    private int f3083F;

    /* renamed from: G */
    private int f3084G;

    /* renamed from: H */
    private androidx.recyclerview.widget.C0813j.C0828k f3085H;

    /* renamed from: I */
    private android.widget.EdgeEffect f3086I;

    /* renamed from: J */
    private android.widget.EdgeEffect f3087J;

    /* renamed from: K */
    private android.widget.EdgeEffect f3088K;

    /* renamed from: L */
    private android.widget.EdgeEffect f3089L;

    /* renamed from: M */
    androidx.recyclerview.widget.C0813j.AbstractC0829l f3090M;

    /* renamed from: N */
    private int f3091N;

    /* renamed from: O */
    private int f3092O;

    /* renamed from: P */
    private android.view.VelocityTracker f3093P;

    /* renamed from: Q */
    private int f3094Q;

    /* renamed from: R */
    private int f3095R;

    /* renamed from: S */
    private int f3096S;

    /* renamed from: T */
    private int f3097T;

    /* renamed from: U */
    private int f3098U;

    /* renamed from: V */
    private androidx.recyclerview.widget.C0813j.AbstractC0842r f3099V;

    /* renamed from: W */
    private final int f3100W;

    /* renamed from: a0 */
    private final int f3101a0;

    /* renamed from: b */
    private final androidx.recyclerview.widget.C0813j.C0849x f3102b;

    /* renamed from: b0 */
    private float f3103b0;

    /* renamed from: c */
    final androidx.recyclerview.widget.C0813j.C0847v f3104c;

    /* renamed from: c0 */
    private float f3105c0;

    /* renamed from: d */
    private androidx.recyclerview.widget.C0813j.C0850y f3106d;

    /* renamed from: d0 */
    private boolean f3107d0;

    /* renamed from: e */
    androidx.recyclerview.widget.C0780a f3108e;

    /* renamed from: e0 */
    final androidx.recyclerview.widget.C0813j.RunnableC0819c0 f3109e0;

    /* renamed from: f */
    androidx.recyclerview.widget.C0783b f3110f;

    /* renamed from: f0 */
    androidx.recyclerview.widget.RunnableC0802e f3111f0;

    /* renamed from: g */
    final androidx.recyclerview.widget.C0861o f3112g;

    /* renamed from: g0 */
    androidx.recyclerview.widget.RunnableC0802e.C0804b f3113g0;

    /* renamed from: h */
    boolean f3114h;

    /* renamed from: h0 */
    final androidx.recyclerview.widget.C0813j.C0815a0 f3115h0;

    /* renamed from: i */
    final android.graphics.Rect f3116i;

    /* renamed from: i0 */
    private androidx.recyclerview.widget.C0813j.AbstractC0844t f3117i0;

    /* renamed from: j */
    private final android.graphics.Rect f3118j;

    /* renamed from: j0 */
    private java.util.List<androidx.recyclerview.widget.C0813j.AbstractC0844t> f3119j0;

    /* renamed from: k */
    final android.graphics.RectF f3120k;

    /* renamed from: k0 */
    boolean f3121k0;

    /* renamed from: l */
    androidx.recyclerview.widget.C0813j.AbstractC0824g f3122l;

    /* renamed from: l0 */
    boolean f3123l0;

    /* renamed from: m */
    androidx.recyclerview.widget.C0813j.AbstractC0835o f3124m;

    /* renamed from: m0 */
    private androidx.recyclerview.widget.C0813j.AbstractC0829l.AbstractC0831b f3125m0;

    /* renamed from: n */
    androidx.recyclerview.widget.C0813j.AbstractC0848w f3126n;

    /* renamed from: n0 */
    boolean f3127n0;

    /* renamed from: o */
    final java.util.ArrayList<androidx.recyclerview.widget.C0813j.AbstractC0834n> f3128o;

    /* renamed from: o0 */
    androidx.recyclerview.widget.C0854k f3129o0;

    /* renamed from: p */
    private final java.util.ArrayList<androidx.recyclerview.widget.C0813j.AbstractC0843s> f3130p;

    /* renamed from: p0 */
    private androidx.recyclerview.widget.C0813j.AbstractC0827j f3131p0;

    /* renamed from: q */
    private androidx.recyclerview.widget.C0813j.AbstractC0843s f3132q;

    /* renamed from: q0 */
    private final int[] f3133q0;

    /* renamed from: r */
    boolean f3134r;

    /* renamed from: r0 */
    private p000a.p018g.p029l.C0209k f3135r0;

    /* renamed from: s */
    boolean f3136s;

    /* renamed from: s0 */
    private final int[] f3137s0;

    /* renamed from: t */
    boolean f3138t;

    /* renamed from: t0 */
    final int[] f3139t0;

    /* renamed from: u */
    boolean f3140u;

    /* renamed from: u0 */
    private final int[] f3141u0;

    /* renamed from: v */
    private int f3142v;

    /* renamed from: v0 */
    final int[] f3143v0;

    /* renamed from: w */
    boolean f3144w;

    /* renamed from: w0 */
    final java.util.List<androidx.recyclerview.widget.C0813j.AbstractC0821d0> f3145w0;

    /* renamed from: x */
    boolean f3146x;

    /* renamed from: x0 */
    private java.lang.Runnable f3147x0;

    /* renamed from: y */
    private boolean f3148y;

    /* renamed from: y0 */
    private final androidx.recyclerview.widget.C0861o.AbstractC0863b f3149y0;

    /* renamed from: z */
    private int f3150z;

    /* renamed from: androidx.recyclerview.widget.j$a */
    /* loaded from: classes.dex */
    class RunnableC0814a implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ androidx.recyclerview.widget.C0813j f3151b;

        RunnableC0814a(androidx.recyclerview.widget.C0813j r1) {
                r0 = this;
                r0.f3151b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.recyclerview.widget.j r0 = r2.f3151b
                boolean r1 = r0.f3140u
                if (r1 == 0) goto L_0x0022
                boolean r0 = r0.isLayoutRequested()
                if (r0 == 0) goto L_0x000d
                goto L_0x0022
            L_0x000d:
                androidx.recyclerview.widget.j r0 = r2.f3151b
                boolean r1 = r0.f3134r
                if (r1 != 0) goto L_0x0017
                r0.requestLayout()
                return
            L_0x0017:
                boolean r1 = r0.f3146x
                if (r1 == 0) goto L_0x001f
                r1 = 1
                r0.f3144w = r1
                return
            L_0x001f:
                r0.m971b()
            L_0x0022:
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$a0 */
    /* loaded from: classes.dex */
    public static class C0815a0 {

        /* renamed from: a */
        int f3152a;

        /* renamed from: b */
        private android.util.SparseArray<java.lang.Object> f3153b;

        /* renamed from: c */
        int f3154c;

        /* renamed from: d */
        int f3155d;

        /* renamed from: e */
        int f3156e;

        /* renamed from: f */
        int f3157f;

        /* renamed from: g */
        boolean f3158g;

        /* renamed from: h */
        boolean f3159h;

        /* renamed from: i */
        boolean f3160i;

        /* renamed from: j */
        boolean f3161j;

        /* renamed from: k */
        boolean f3162k;

        /* renamed from: l */
        boolean f3163l;

        /* renamed from: m */
        int f3164m;

        /* renamed from: n */
        long f3165n;

        /* renamed from: o */
        int f3166o;

        /* renamed from: p */
        int f3167p;

        /* renamed from: q */
        int f3168q;

        public C0815a0() {
                r2 = this;
                r2.<init>()
                r0 = -1
                r2.f3152a = r0
                r0 = 0
                r2.f3154c = r0
                r2.f3155d = r0
                r1 = 1
                r2.f3156e = r1
                r2.f3157f = r0
                r2.f3158g = r0
                r2.f3159h = r0
                r2.f3160i = r0
                r2.f3161j = r0
                r2.f3162k = r0
                r2.f3163l = r0
                return
        }

        /* renamed from: a */
        public int m907a() {
                r2 = this;
                boolean r0 = r2.f3159h
                if (r0 == 0) goto L_0x000a
                int r0 = r2.f3154c
                int r1 = r2.f3155d
                int r0 = r0 - r1
                goto L_0x000c
            L_0x000a:
                int r0 = r2.f3157f
            L_0x000c:
                return r0
        }

        /* renamed from: a */
        void m906a(int r4) {
                r3 = this;
                int r0 = r3.f3156e
                r0 = r0 & r4
                if (r0 == 0) goto L_0x0006
                return
            L_0x0006:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Layout state should be one of "
                r1.append(r2)
                java.lang.String r4 = java.lang.Integer.toBinaryString(r4)
                r1.append(r4)
                java.lang.String r4 = " but it is "
                r1.append(r4)
                int r4 = r3.f3156e
                java.lang.String r4 = java.lang.Integer.toBinaryString(r4)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        /* renamed from: a */
        void m905a(androidx.recyclerview.widget.C0813j.AbstractC0824g r2) {
                r1 = this;
                r0 = 1
                r1.f3156e = r0
                int r2 = r2.mo106a()
                r1.f3157f = r2
                r2 = 0
                r1.f3159h = r2
                r1.f3160i = r2
                r1.f3161j = r2
                return
        }

        /* renamed from: b */
        public int m904b() {
                r1 = this;
                int r0 = r1.f3152a
                return r0
        }

        /* renamed from: c */
        public boolean m903c() {
                r2 = this;
                int r0 = r2.f3152a
                r1 = -1
                if (r0 == r1) goto L_0x0007
                r0 = 1
                goto L_0x0008
            L_0x0007:
                r0 = 0
            L_0x0008:
                return r0
        }

        /* renamed from: d */
        public boolean m902d() {
                r1 = this;
                boolean r0 = r1.f3159h
                return r0
        }

        /* renamed from: e */
        public boolean m901e() {
                r1 = this;
                boolean r0 = r1.f3163l
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "State{mTargetPosition="
                r0.append(r1)
                int r1 = r2.f3152a
                r0.append(r1)
                java.lang.String r1 = ", mData="
                r0.append(r1)
                android.util.SparseArray<java.lang.Object> r1 = r2.f3153b
                r0.append(r1)
                java.lang.String r1 = ", mItemCount="
                r0.append(r1)
                int r1 = r2.f3157f
                r0.append(r1)
                java.lang.String r1 = ", mIsMeasuring="
                r0.append(r1)
                boolean r1 = r2.f3161j
                r0.append(r1)
                java.lang.String r1 = ", mPreviousLayoutItemCount="
                r0.append(r1)
                int r1 = r2.f3154c
                r0.append(r1)
                java.lang.String r1 = ", mDeletedInvisibleItemCountSincePreviousLayout="
                r0.append(r1)
                int r1 = r2.f3155d
                r0.append(r1)
                java.lang.String r1 = ", mStructureChanged="
                r0.append(r1)
                boolean r1 = r2.f3158g
                r0.append(r1)
                java.lang.String r1 = ", mInPreLayout="
                r0.append(r1)
                boolean r1 = r2.f3159h
                r0.append(r1)
                java.lang.String r1 = ", mRunSimpleAnimations="
                r0.append(r1)
                boolean r1 = r2.f3162k
                r0.append(r1)
                java.lang.String r1 = ", mRunPredictiveAnimations="
                r0.append(r1)
                boolean r1 = r2.f3163l
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$b */
    /* loaded from: classes.dex */
    class RunnableC0816b implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ androidx.recyclerview.widget.C0813j f3169b;

        RunnableC0816b(androidx.recyclerview.widget.C0813j r1) {
                r0 = this;
                r0.f3169b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.recyclerview.widget.j r0 = r2.f3169b
                androidx.recyclerview.widget.j$l r0 = r0.f3090M
                if (r0 == 0) goto L_0x0009
                r0.mo802i()
            L_0x0009:
                androidx.recyclerview.widget.j r0 = r2.f3169b
                r1 = 0
                r0.f3127n0 = r1
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$b0 */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0817b0 {
        /* renamed from: a */
        public abstract android.view.View m900a(androidx.recyclerview.widget.C0813j.C0847v r1, int r2, int r3);
    }

    /* renamed from: androidx.recyclerview.widget.j$c  reason: invalid class name */
    /* loaded from: classes.dex */
    static class animationInterpolatorC0818c implements android.view.animation.Interpolator {
        animationInterpolatorC0818c() {
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

    /* renamed from: androidx.recyclerview.widget.j$c0 */
    /* loaded from: classes.dex */
    class RunnableC0819c0 implements java.lang.Runnable {

        /* renamed from: b */
        private int f3170b;

        /* renamed from: c */
        private int f3171c;

        /* renamed from: d */
        android.widget.OverScroller f3172d;

        /* renamed from: e */
        android.view.animation.Interpolator f3173e;

        /* renamed from: f */
        private boolean f3174f;

        /* renamed from: g */
        private boolean f3175g;

        /* renamed from: h */
        final /* synthetic */ androidx.recyclerview.widget.C0813j f3176h;

        RunnableC0819c0(androidx.recyclerview.widget.C0813j r3) {
                r2 = this;
                r2.f3176h = r3
                r2.<init>()
                android.view.animation.Interpolator r0 = androidx.recyclerview.widget.C0813j.f3076H0
                r2.f3173e = r0
                r0 = 0
                r2.f3174f = r0
                r2.f3175g = r0
                android.widget.OverScroller r0 = new android.widget.OverScroller
                android.content.Context r3 = r3.getContext()
                android.view.animation.Interpolator r1 = androidx.recyclerview.widget.C0813j.f3076H0
                r0.<init>(r3, r1)
                r2.f3172d = r0
                return
        }

        /* renamed from: a */
        private float m898a(float r3) {
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

        /* renamed from: a */
        private int m896a(int r5, int r6, int r7, int r8) {
                r4 = this;
                int r0 = java.lang.Math.abs(r5)
                int r1 = java.lang.Math.abs(r6)
                if (r0 <= r1) goto L_0x000c
                r2 = 1
                goto L_0x000d
            L_0x000c:
                r2 = 0
            L_0x000d:
                int r7 = r7 * r7
                int r8 = r8 * r8
                int r7 = r7 + r8
                double r7 = (double) r7
                double r7 = java.lang.Math.sqrt(r7)
                int r7 = (int) r7
                int r5 = r5 * r5
                int r6 = r6 * r6
                int r5 = r5 + r6
                double r5 = (double) r5
                double r5 = java.lang.Math.sqrt(r5)
                int r5 = (int) r5
                androidx.recyclerview.widget.j r6 = r4.f3176h
                if (r2 == 0) goto L_0x002c
                int r6 = r6.getWidth()
                goto L_0x0030
            L_0x002c:
                int r6 = r6.getHeight()
            L_0x0030:
                int r8 = r6 / 2
                float r5 = (float) r5
                r3 = 1065353216(0x3f800000, float:1.0)
                float r5 = r5 * r3
                float r6 = (float) r6
                float r5 = r5 / r6
                float r5 = java.lang.Math.min(r3, r5)
                float r8 = (float) r8
                float r5 = r4.m898a(r5)
                float r5 = r5 * r8
                float r8 = r8 + r5
                if (r7 <= 0) goto L_0x0058
                r5 = 1148846080(0x447a0000, float:1000.0)
                float r6 = (float) r7
                float r8 = r8 / r6
                float r6 = java.lang.Math.abs(r8)
                float r6 = r6 * r5
                int r5 = java.lang.Math.round(r6)
                int r5 = r5 * 4
                goto L_0x0064
            L_0x0058:
                if (r2 == 0) goto L_0x005b
                goto L_0x005c
            L_0x005b:
                r0 = r1
            L_0x005c:
                float r5 = (float) r0
                float r5 = r5 / r6
                float r5 = r5 + r3
                r6 = 1133903872(0x43960000, float:300.0)
                float r5 = r5 * r6
                int r5 = (int) r5
            L_0x0064:
                r6 = 2000(0x7d0, float:2.803E-42)
                int r5 = java.lang.Math.min(r5, r6)
                return r5
        }

        /* renamed from: c */
        private void m892c() {
                r1 = this;
                r0 = 0
                r1.f3175g = r0
                r0 = 1
                r1.f3174f = r0
                return
        }

        /* renamed from: d */
        private void m891d() {
                r1 = this;
                r0 = 0
                r1.f3174f = r0
                boolean r0 = r1.f3175g
                if (r0 == 0) goto L_0x000a
                r1.m899a()
            L_0x000a:
                return
        }

        /* renamed from: a */
        void m899a() {
                r1 = this;
                boolean r0 = r1.f3174f
                if (r0 == 0) goto L_0x0008
                r0 = 1
                r1.f3175g = r0
                goto L_0x0012
            L_0x0008:
                androidx.recyclerview.widget.j r0 = r1.f3176h
                r0.removeCallbacks(r1)
                androidx.recyclerview.widget.j r0 = r1.f3176h
                p000a.p018g.p029l.C0216r.m3432a(r0, r1)
            L_0x0012:
                return
        }

        /* renamed from: a */
        public void m897a(int r11, int r12) {
                r10 = this;
                androidx.recyclerview.widget.j r0 = r10.f3176h
                r1 = 2
                r0.setScrollState(r1)
                r0 = 0
                r10.f3171c = r0
                r10.f3170b = r0
                android.widget.OverScroller r1 = r10.f3172d
                r2 = 0
                r3 = 0
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
                r7 = 2147483647(0x7fffffff, float:NaN)
                r8 = -2147483648(0xffffffff80000000, float:-0.0)
                r9 = 2147483647(0x7fffffff, float:NaN)
                r4 = r11
                r5 = r12
                r1.fling(r2, r3, r4, r5, r6, r7, r8, r9)
                r10.m899a()
                return
        }

        /* renamed from: a */
        public void m895a(int r7, int r8, int r9, android.view.animation.Interpolator r10) {
                r6 = this;
                android.view.animation.Interpolator r0 = r6.f3173e
                if (r0 == r10) goto L_0x0013
                r6.f3173e = r10
                android.widget.OverScroller r0 = new android.widget.OverScroller
                androidx.recyclerview.widget.j r1 = r6.f3176h
                android.content.Context r1 = r1.getContext()
                r0.<init>(r1, r10)
                r6.f3172d = r0
            L_0x0013:
                androidx.recyclerview.widget.j r10 = r6.f3176h
                r0 = 2
                r10.setScrollState(r0)
                r10 = 0
                r6.f3171c = r10
                r6.f3170b = r10
                android.widget.OverScroller r0 = r6.f3172d
                r1 = 0
                r2 = 0
                r3 = r7
                r4 = r8
                r5 = r9
                r0.startScroll(r1, r2, r3, r4, r5)
                int r7 = android.os.Build.VERSION.SDK_INT
                r8 = 23
                if (r7 >= r8) goto L_0x0033
                android.widget.OverScroller r7 = r6.f3172d
                r7.computeScrollOffset()
            L_0x0033:
                r6.m899a()
                return
        }

        /* renamed from: a */
        public void m894a(int r2, int r3, android.view.animation.Interpolator r4) {
                r1 = this;
                r0 = 0
                int r0 = r1.m896a(r2, r3, r0, r0)
                if (r4 != 0) goto L_0x0009
                android.view.animation.Interpolator r4 = androidx.recyclerview.widget.C0813j.f3076H0
            L_0x0009:
                r1.m895a(r2, r3, r0, r4)
                return
        }

        /* renamed from: b */
        public void m893b() {
                r1 = this;
                androidx.recyclerview.widget.j r0 = r1.f3176h
                r0.removeCallbacks(r1)
                android.widget.OverScroller r0 = r1.f3172d
                r0.abortAnimation()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r22 = this;
                r0 = r22
                androidx.recyclerview.widget.j r1 = r0.f3176h
                androidx.recyclerview.widget.j$o r1 = r1.f3124m
                if (r1 != 0) goto L_0x000c
                r22.m893b()
                return
            L_0x000c:
                r22.m892c()
                androidx.recyclerview.widget.j r1 = r0.f3176h
                r1.m971b()
                android.widget.OverScroller r1 = r0.f3172d
                androidx.recyclerview.widget.j r2 = r0.f3176h
                androidx.recyclerview.widget.j$o r2 = r2.f3124m
                androidx.recyclerview.widget.j$z r2 = r2.f3216g
                boolean r3 = r1.computeScrollOffset()
                r4 = 0
                if (r3 == 0) goto L_0x0183
                androidx.recyclerview.widget.j r3 = r0.f3176h
                int[] r3 = r3.f3139t0
                int r11 = r1.getCurrX()
                int r12 = r1.getCurrY()
                int r5 = r0.f3170b
                int r13 = r11 - r5
                int r5 = r0.f3171c
                int r14 = r12 - r5
                r0.f3170b = r11
                r0.f3171c = r12
                androidx.recyclerview.widget.j r5 = r0.f3176h
                r9 = 0
                r10 = 1
                r6 = r13
                r7 = r14
                r8 = r3
                boolean r5 = r5.m1002a(r6, r7, r8, r9, r10)
                r6 = 1
                if (r5 == 0) goto L_0x004f
                r5 = r3[r4]
                int r13 = r13 - r5
                r3 = r3[r6]
                int r14 = r14 - r3
            L_0x004f:
                androidx.recyclerview.widget.j r3 = r0.f3176h
                androidx.recyclerview.widget.j$g r5 = r3.f3122l
                if (r5 == 0) goto L_0x0094
                int[] r5 = r3.f3143v0
                r3.m1003a(r13, r14, r5)
                androidx.recyclerview.widget.j r3 = r0.f3176h
                int[] r3 = r3.f3143v0
                r5 = r3[r4]
                r3 = r3[r6]
                int r7 = r13 - r5
                int r8 = r14 - r3
                if (r2 == 0) goto L_0x0098
                boolean r9 = r2.m584b()
                if (r9 != 0) goto L_0x0098
                boolean r9 = r2.m583c()
                if (r9 == 0) goto L_0x0098
                androidx.recyclerview.widget.j r9 = r0.f3176h
                androidx.recyclerview.widget.j$a0 r9 = r9.f3115h0
                int r9 = r9.m907a()
                if (r9 != 0) goto L_0x0082
                r2.m582d()
                goto L_0x0098
            L_0x0082:
                int r10 = r2.m588a()
                if (r10 < r9) goto L_0x008c
                int r9 = r9 - r6
                r2.m587a(r9)
            L_0x008c:
                int r9 = r13 - r7
                int r10 = r14 - r8
                r2.m586a(r9, r10)
                goto L_0x0098
            L_0x0094:
                r3 = 0
                r5 = 0
                r7 = 0
                r8 = 0
            L_0x0098:
                androidx.recyclerview.widget.j r9 = r0.f3176h
                java.util.ArrayList<androidx.recyclerview.widget.j$n> r9 = r9.f3128o
                boolean r9 = r9.isEmpty()
                if (r9 != 0) goto L_0x00a7
                androidx.recyclerview.widget.j r9 = r0.f3176h
                r9.invalidate()
            L_0x00a7:
                androidx.recyclerview.widget.j r9 = r0.f3176h
                int r9 = r9.getOverScrollMode()
                r10 = 2
                if (r9 == r10) goto L_0x00b5
                androidx.recyclerview.widget.j r9 = r0.f3176h
                r9.m969b(r13, r14)
            L_0x00b5:
                androidx.recyclerview.widget.j r15 = r0.f3176h
                r20 = 0
                r21 = 1
                r16 = r5
                r17 = r3
                r18 = r7
                r19 = r8
                boolean r9 = r15.m1008a(r16, r17, r18, r19, r20, r21)
                if (r9 != 0) goto L_0x010b
                if (r7 != 0) goto L_0x00cd
                if (r8 == 0) goto L_0x010b
            L_0x00cd:
                float r9 = r1.getCurrVelocity()
                int r9 = (int) r9
                if (r7 == r11) goto L_0x00dc
                if (r7 >= 0) goto L_0x00d8
                int r15 = -r9
                goto L_0x00dd
            L_0x00d8:
                if (r7 <= 0) goto L_0x00dc
                r15 = r9
                goto L_0x00dd
            L_0x00dc:
                r15 = 0
            L_0x00dd:
                if (r8 == r12) goto L_0x00e6
                if (r8 >= 0) goto L_0x00e3
                int r9 = -r9
                goto L_0x00e7
            L_0x00e3:
                if (r8 <= 0) goto L_0x00e6
                goto L_0x00e7
            L_0x00e6:
                r9 = 0
            L_0x00e7:
                androidx.recyclerview.widget.j r4 = r0.f3176h
                int r4 = r4.getOverScrollMode()
                if (r4 == r10) goto L_0x00f4
                androidx.recyclerview.widget.j r4 = r0.f3176h
                r4.m1009a(r15, r9)
            L_0x00f4:
                if (r15 != 0) goto L_0x00fe
                if (r7 == r11) goto L_0x00fe
                int r4 = r1.getFinalX()
                if (r4 != 0) goto L_0x010b
            L_0x00fe:
                if (r9 != 0) goto L_0x0108
                if (r8 == r12) goto L_0x0108
                int r4 = r1.getFinalY()
                if (r4 != 0) goto L_0x010b
            L_0x0108:
                r1.abortAnimation()
            L_0x010b:
                if (r5 != 0) goto L_0x010f
                if (r3 == 0) goto L_0x0114
            L_0x010f:
                androidx.recyclerview.widget.j r4 = r0.f3176h
                r4.m951d(r5, r3)
            L_0x0114:
                androidx.recyclerview.widget.j r4 = r0.f3176h
                boolean r4 = androidx.recyclerview.widget.C0813j.m978a(r4)
                if (r4 != 0) goto L_0x0121
                androidx.recyclerview.widget.j r4 = r0.f3176h
                r4.invalidate()
            L_0x0121:
                if (r14 == 0) goto L_0x0131
                androidx.recyclerview.widget.j r4 = r0.f3176h
                androidx.recyclerview.widget.j$o r4 = r4.f3124m
                boolean r4 = r4.mo732b()
                if (r4 == 0) goto L_0x0131
                if (r3 != r14) goto L_0x0131
                r3 = 1
                goto L_0x0132
            L_0x0131:
                r3 = 0
            L_0x0132:
                if (r13 == 0) goto L_0x0142
                androidx.recyclerview.widget.j r4 = r0.f3176h
                androidx.recyclerview.widget.j$o r4 = r4.f3124m
                boolean r4 = r4.mo788a()
                if (r4 == 0) goto L_0x0142
                if (r5 != r13) goto L_0x0142
                r4 = 1
                goto L_0x0143
            L_0x0142:
                r4 = 0
            L_0x0143:
                if (r13 != 0) goto L_0x0147
                if (r14 == 0) goto L_0x014e
            L_0x0147:
                if (r4 != 0) goto L_0x014e
                if (r3 == 0) goto L_0x014c
                goto L_0x014e
            L_0x014c:
                r3 = 0
                goto L_0x014f
            L_0x014e:
                r3 = 1
            L_0x014f:
                boolean r1 = r1.isFinished()
                if (r1 != 0) goto L_0x016d
                if (r3 != 0) goto L_0x0160
                androidx.recyclerview.widget.j r1 = r0.f3176h
                boolean r1 = r1.m952d(r6)
                if (r1 != 0) goto L_0x0160
                goto L_0x016d
            L_0x0160:
                r22.m899a()
                androidx.recyclerview.widget.j r1 = r0.f3176h
                androidx.recyclerview.widget.e r3 = r1.f3111f0
                if (r3 == 0) goto L_0x0183
                r3.m1067a(r1, r13, r14)
                goto L_0x0183
            L_0x016d:
                androidx.recyclerview.widget.j r1 = r0.f3176h
                r3 = 0
                r1.setScrollState(r3)
                boolean r1 = androidx.recyclerview.widget.C0813j.f3072D0
                if (r1 == 0) goto L_0x017e
                androidx.recyclerview.widget.j r1 = r0.f3176h
                androidx.recyclerview.widget.e$b r1 = r1.f3113g0
                r1.m1061a()
            L_0x017e:
                androidx.recyclerview.widget.j r1 = r0.f3176h
                r1.mo1010a(r6)
            L_0x0183:
                if (r2 == 0) goto L_0x0196
                boolean r1 = r2.m584b()
                if (r1 == 0) goto L_0x018f
                r1 = 0
                r2.m586a(r1, r1)
            L_0x018f:
                boolean r1 = r0.f3175g
                if (r1 != 0) goto L_0x0196
                r2.m582d()
            L_0x0196:
                r22.m891d()
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$d */
    /* loaded from: classes.dex */
    class C0820d implements androidx.recyclerview.widget.C0861o.AbstractC0863b {

        /* renamed from: a */
        final /* synthetic */ androidx.recyclerview.widget.C0813j f3177a;

        C0820d(androidx.recyclerview.widget.C0813j r1) {
                r0 = this;
                r0.f3177a = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.C0861o.AbstractC0863b
        /* renamed from: a */
        public void mo518a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r3) {
                r2 = this;
                androidx.recyclerview.widget.j r0 = r2.f3177a
                androidx.recyclerview.widget.j$o r1 = r0.f3124m
                android.view.View r3 = r3.f3179a
                androidx.recyclerview.widget.j$v r0 = r0.f3104c
                r1.m761a(r3, r0)
                return
        }

        @Override // androidx.recyclerview.widget.C0861o.AbstractC0863b
        /* renamed from: a */
        public void mo517a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r2, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r3, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r4) {
                r1 = this;
                androidx.recyclerview.widget.j r0 = r1.f3177a
                androidx.recyclerview.widget.j$v r0 = r0.f3104c
                r0.m605c(r2)
                androidx.recyclerview.widget.j r0 = r1.f3177a
                r0.m965b(r2, r3, r4)
                return
        }

        @Override // androidx.recyclerview.widget.C0861o.AbstractC0863b
        /* renamed from: b */
        public void mo516b(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r3, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r4, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r5) {
                r2 = this;
                r0 = 0
                r3.m881a(r0)
                androidx.recyclerview.widget.j r0 = r2.f3177a
                boolean r1 = r0.f3081D
                androidx.recyclerview.widget.j$l r0 = r0.f3090M
                if (r1 == 0) goto L_0x0013
                boolean r3 = r0.mo572a(r3, r3, r4, r5)
                if (r3 == 0) goto L_0x001e
                goto L_0x0019
            L_0x0013:
                boolean r3 = r0.mo567c(r3, r4, r5)
                if (r3 == 0) goto L_0x001e
            L_0x0019:
                androidx.recyclerview.widget.j r3 = r2.f3177a
                r3.m915s()
            L_0x001e:
                return
        }

        @Override // androidx.recyclerview.widget.C0861o.AbstractC0863b
        /* renamed from: c */
        public void mo515c(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r2, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r3, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r4) {
                r1 = this;
                androidx.recyclerview.widget.j r0 = r1.f3177a
                r0.m984a(r2, r3, r4)
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$d0 */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0821d0 {

        /* renamed from: s */
        private static final java.util.List<java.lang.Object> f3178s = null;

        /* renamed from: a */
        public final android.view.View f3179a;

        /* renamed from: b */
        java.lang.ref.WeakReference<androidx.recyclerview.widget.C0813j> f3180b;

        /* renamed from: c */
        int f3181c;

        /* renamed from: d */
        int f3182d;

        /* renamed from: e */
        long f3183e;

        /* renamed from: f */
        int f3184f;

        /* renamed from: g */
        int f3185g;

        /* renamed from: h */
        androidx.recyclerview.widget.C0813j.AbstractC0821d0 f3186h;

        /* renamed from: i */
        androidx.recyclerview.widget.C0813j.AbstractC0821d0 f3187i;

        /* renamed from: j */
        int f3188j;

        /* renamed from: k */
        java.util.List<java.lang.Object> f3189k;

        /* renamed from: l */
        java.util.List<java.lang.Object> f3190l;

        /* renamed from: m */
        private int f3191m;

        /* renamed from: n */
        androidx.recyclerview.widget.C0813j.C0847v f3192n;

        /* renamed from: o */
        boolean f3193o;

        /* renamed from: p */
        private int f3194p;

        /* renamed from: q */
        int f3195q;

        /* renamed from: r */
        androidx.recyclerview.widget.C0813j f3196r;

        static {
                java.util.List r0 = java.util.Collections.emptyList()
                androidx.recyclerview.widget.C0813j.AbstractC0821d0.f3178s = r0
                return
        }

        public AbstractC0821d0(android.view.View r4) {
                r3 = this;
                r3.<init>()
                r0 = -1
                r3.f3181c = r0
                r3.f3182d = r0
                r1 = -1
                r3.f3183e = r1
                r3.f3184f = r0
                r3.f3185g = r0
                r1 = 0
                r3.f3186h = r1
                r3.f3187i = r1
                r3.f3189k = r1
                r3.f3190l = r1
                r2 = 0
                r3.f3191m = r2
                r3.f3192n = r1
                r3.f3193o = r2
                r3.f3194p = r2
                r3.f3195q = r0
                if (r4 == 0) goto L_0x0029
                r3.f3179a = r4
                return
            L_0x0029:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "itemView may not be null"
                r4.<init>(r0)
                throw r4
        }

        /* renamed from: A */
        private void m890A() {
                r1 = this;
                java.util.List<java.lang.Object> r0 = r1.f3189k
                if (r0 != 0) goto L_0x0013
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f3189k = r0
                java.util.List<java.lang.Object> r0 = r1.f3189k
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                r1.f3190l = r0
            L_0x0013:
                return
        }

        /* renamed from: a */
        void m889a() {
                r1 = this;
                r0 = -1
                r1.f3182d = r0
                r1.f3185g = r0
                return
        }

        /* renamed from: a */
        void m888a(int r2) {
                r1 = this;
                int r0 = r1.f3188j
                r2 = r2 | r0
                r1.f3188j = r2
                return
        }

        /* renamed from: a */
        void m887a(int r3, int r4) {
                r2 = this;
                int r0 = r2.f3188j
                r1 = r4 ^ (-1)
                r0 = r0 & r1
                r3 = r3 & r4
                r3 = r3 | r0
                r2.f3188j = r3
                return
        }

        /* renamed from: a */
        void m886a(int r2, int r3, boolean r4) {
                r1 = this;
                r0 = 8
                r1.m888a(r0)
                r1.m885a(r3, r4)
                r1.f3181c = r2
                return
        }

        /* renamed from: a */
        void m885a(int r3, boolean r4) {
                r2 = this;
                int r0 = r2.f3182d
                r1 = -1
                if (r0 != r1) goto L_0x0009
                int r0 = r2.f3181c
                r2.f3182d = r0
            L_0x0009:
                int r0 = r2.f3185g
                if (r0 != r1) goto L_0x0011
                int r0 = r2.f3181c
                r2.f3185g = r0
            L_0x0011:
                if (r4 == 0) goto L_0x0018
                int r4 = r2.f3185g
                int r4 = r4 + r3
                r2.f3185g = r4
            L_0x0018:
                int r4 = r2.f3181c
                int r4 = r4 + r3
                r2.f3181c = r4
                android.view.View r3 = r2.f3179a
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                if (r3 == 0) goto L_0x0030
                android.view.View r3 = r2.f3179a
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                androidx.recyclerview.widget.j$p r3 = (androidx.recyclerview.widget.C0813j.C0840p) r3
                r4 = 1
                r3.f3236c = r4
            L_0x0030:
                return
        }

        /* renamed from: a */
        void m884a(androidx.recyclerview.widget.C0813j.C0847v r1, boolean r2) {
                r0 = this;
                r0.f3192n = r1
                r0.f3193o = r2
                return
        }

        /* renamed from: a */
        void m883a(androidx.recyclerview.widget.C0813j r3) {
                r2 = this;
                int r0 = r2.f3195q
                r1 = -1
                if (r0 == r1) goto L_0x0006
                goto L_0x000c
            L_0x0006:
                android.view.View r0 = r2.f3179a
                int r0 = p000a.p018g.p029l.C0216r.m3413h(r0)
            L_0x000c:
                r2.f3194p = r0
                r0 = 4
                r3.m987a(r2, r0)
                return
        }

        /* renamed from: a */
        void m882a(java.lang.Object r3) {
                r2 = this;
                r0 = 1024(0x400, float:1.435E-42)
                if (r3 != 0) goto L_0x0008
                r2.m888a(r0)
                goto L_0x0015
            L_0x0008:
                int r1 = r2.f3188j
                r0 = r0 & r1
                if (r0 != 0) goto L_0x0015
                r2.m890A()
                java.util.List<java.lang.Object> r0 = r2.f3189k
                r0.add(r3)
            L_0x0015:
                return
        }

        /* renamed from: a */
        public final void m881a(boolean r3) {
                r2 = this;
                r0 = 1
                int r1 = r2.f3191m
                if (r3 == 0) goto L_0x0007
                int r1 = r1 - r0
                goto L_0x0008
            L_0x0007:
                int r1 = r1 + r0
            L_0x0008:
                r2.f3191m = r1
                int r1 = r2.f3191m
                if (r1 >= 0) goto L_0x0028
                r3 = 0
                r2.f3191m = r3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for "
                r3.append(r0)
                r3.append(r2)
                java.lang.String r3 = r3.toString()
                java.lang.String r0 = "View"
                android.util.Log.e(r0, r3)
                goto L_0x003e
            L_0x0028:
                if (r3 != 0) goto L_0x0033
                if (r1 != r0) goto L_0x0033
                int r3 = r2.f3188j
                r3 = r3 | 16
            L_0x0030:
                r2.f3188j = r3
                goto L_0x003e
            L_0x0033:
                if (r3 == 0) goto L_0x003e
                int r3 = r2.f3191m
                if (r3 != 0) goto L_0x003e
                int r3 = r2.f3188j
                r3 = r3 & (-17)
                goto L_0x0030
            L_0x003e:
                return
        }

        /* renamed from: b */
        void m880b() {
                r1 = this;
                java.util.List<java.lang.Object> r0 = r1.f3189k
                if (r0 == 0) goto L_0x0007
                r0.clear()
            L_0x0007:
                int r0 = r1.f3188j
                r0 = r0 & (-1025(0xfffffffffffffbff, float:NaN))
                r1.f3188j = r0
                return
        }

        /* renamed from: b */
        void m878b(androidx.recyclerview.widget.C0813j r2) {
                r1 = this;
                int r0 = r1.f3194p
                r2.m987a(r1, r0)
                r2 = 0
                r1.f3194p = r2
                return
        }

        /* renamed from: b */
        boolean m879b(int r2) {
                r1 = this;
                int r0 = r1.f3188j
                r2 = r2 & r0
                if (r2 == 0) goto L_0x0007
                r2 = 1
                goto L_0x0008
            L_0x0007:
                r2 = 0
            L_0x0008:
                return r2
        }

        /* renamed from: c */
        void m877c() {
                r1 = this;
                int r0 = r1.f3188j
                r0 = r0 & (-33)
                r1.f3188j = r0
                return
        }

        /* renamed from: d */
        void m876d() {
                r1 = this;
                int r0 = r1.f3188j
                r0 = r0 & (-257(0xfffffffffffffeff, float:NaN))
                r1.f3188j = r0
                return
        }

        /* renamed from: e */
        boolean m875e() {
                r1 = this;
                int r0 = r1.f3188j
                r0 = r0 & 16
                if (r0 != 0) goto L_0x0010
                android.view.View r0 = r1.f3179a
                boolean r0 = p000a.p018g.p029l.C0216r.m3399v(r0)
                if (r0 == 0) goto L_0x0010
                r0 = 1
                goto L_0x0011
            L_0x0010:
                r0 = 0
            L_0x0011:
                return r0
        }

        /* renamed from: f */
        public final int m874f() {
                r1 = this;
                androidx.recyclerview.widget.j r0 = r1.f3196r
                if (r0 != 0) goto L_0x0006
                r0 = -1
                return r0
            L_0x0006:
                int r0 = r0.m966b(r1)
                return r0
        }

        /* renamed from: g */
        public final long m873g() {
                r2 = this;
                long r0 = r2.f3183e
                return r0
        }

        /* renamed from: h */
        public final int m872h() {
                r1 = this;
                int r0 = r1.f3184f
                return r0
        }

        /* renamed from: i */
        public final int m871i() {
                r2 = this;
                int r0 = r2.f3185g
                r1 = -1
                if (r0 != r1) goto L_0x0007
                int r0 = r2.f3181c
            L_0x0007:
                return r0
        }

        /* renamed from: j */
        public final int m870j() {
                r1 = this;
                int r0 = r1.f3182d
                return r0
        }

        /* renamed from: k */
        java.util.List<java.lang.Object> m869k() {
                r1 = this;
                int r0 = r1.f3188j
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 != 0) goto L_0x0017
                java.util.List<java.lang.Object> r0 = r1.f3189k
                if (r0 == 0) goto L_0x0014
                int r0 = r0.size()
                if (r0 != 0) goto L_0x0011
                goto L_0x0014
            L_0x0011:
                java.util.List<java.lang.Object> r0 = r1.f3190l
                return r0
            L_0x0014:
                java.util.List<java.lang.Object> r0 = androidx.recyclerview.widget.C0813j.AbstractC0821d0.f3178s
                return r0
            L_0x0017:
                java.util.List<java.lang.Object> r0 = androidx.recyclerview.widget.C0813j.AbstractC0821d0.f3178s
                return r0
        }

        /* renamed from: l */
        boolean m868l() {
                r1 = this;
                int r0 = r1.f3188j
                r0 = r0 & 512(0x200, float:7.175E-43)
                if (r0 != 0) goto L_0x000f
                boolean r0 = r1.m866n()
                if (r0 == 0) goto L_0x000d
                goto L_0x000f
            L_0x000d:
                r0 = 0
                goto L_0x0010
            L_0x000f:
                r0 = 1
            L_0x0010:
                return r0
        }

        /* renamed from: m */
        boolean m867m() {
                r2 = this;
                int r0 = r2.f3188j
                r1 = 1
                r0 = r0 & r1
                if (r0 == 0) goto L_0x0007
                goto L_0x0008
            L_0x0007:
                r1 = 0
            L_0x0008:
                return r1
        }

        /* renamed from: n */
        boolean m866n() {
                r1 = this;
                int r0 = r1.f3188j
                r0 = r0 & 4
                if (r0 == 0) goto L_0x0008
                r0 = 1
                goto L_0x0009
            L_0x0008:
                r0 = 0
            L_0x0009:
                return r0
        }

        /* renamed from: o */
        public final boolean m865o() {
                r1 = this;
                int r0 = r1.f3188j
                r0 = r0 & 16
                if (r0 != 0) goto L_0x0010
                android.view.View r0 = r1.f3179a
                boolean r0 = p000a.p018g.p029l.C0216r.m3399v(r0)
                if (r0 != 0) goto L_0x0010
                r0 = 1
                goto L_0x0011
            L_0x0010:
                r0 = 0
            L_0x0011:
                return r0
        }

        /* renamed from: p */
        boolean m864p() {
                r1 = this;
                int r0 = r1.f3188j
                r0 = r0 & 8
                if (r0 == 0) goto L_0x0008
                r0 = 1
                goto L_0x0009
            L_0x0008:
                r0 = 0
            L_0x0009:
                return r0
        }

        /* renamed from: q */
        boolean m863q() {
                r1 = this;
                androidx.recyclerview.widget.j$v r0 = r1.f3192n
                if (r0 == 0) goto L_0x0006
                r0 = 1
                goto L_0x0007
            L_0x0006:
                r0 = 0
            L_0x0007:
                return r0
        }

        /* renamed from: r */
        boolean m862r() {
                r1 = this;
                int r0 = r1.f3188j
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L_0x0008
                r0 = 1
                goto L_0x0009
            L_0x0008:
                r0 = 0
            L_0x0009:
                return r0
        }

        /* renamed from: s */
        boolean m861s() {
                r1 = this;
                int r0 = r1.f3188j
                r0 = r0 & 2
                if (r0 == 0) goto L_0x0008
                r0 = 1
                goto L_0x0009
            L_0x0008:
                r0 = 0
            L_0x0009:
                return r0
        }

        /* renamed from: t */
        boolean m860t() {
                r1 = this;
                int r0 = r1.f3188j
                r0 = r0 & 2
                if (r0 == 0) goto L_0x0008
                r0 = 1
                goto L_0x0009
            L_0x0008:
                r0 = 0
            L_0x0009:
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "ViewHolder{"
                r1.append(r2)
                int r2 = r4.hashCode()
                java.lang.String r2 = java.lang.Integer.toHexString(r2)
                r1.append(r2)
                java.lang.String r2 = " position="
                r1.append(r2)
                int r2 = r4.f3181c
                r1.append(r2)
                java.lang.String r2 = " id="
                r1.append(r2)
                long r2 = r4.f3183e
                r1.append(r2)
                java.lang.String r2 = ", oldPos="
                r1.append(r2)
                int r2 = r4.f3182d
                r1.append(r2)
                java.lang.String r2 = ", pLpos:"
                r1.append(r2)
                int r2 = r4.f3185g
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                boolean r1 = r4.m863q()
                if (r1 == 0) goto L_0x005d
                java.lang.String r1 = " scrap "
                r0.append(r1)
                boolean r1 = r4.f3193o
                if (r1 == 0) goto L_0x0058
                java.lang.String r1 = "[changeScrap]"
                goto L_0x005a
            L_0x0058:
                java.lang.String r1 = "[attachedScrap]"
            L_0x005a:
                r0.append(r1)
            L_0x005d:
                boolean r1 = r4.m866n()
                if (r1 == 0) goto L_0x0068
                java.lang.String r1 = " invalid"
                r0.append(r1)
            L_0x0068:
                boolean r1 = r4.m867m()
                if (r1 != 0) goto L_0x0073
                java.lang.String r1 = " unbound"
                r0.append(r1)
            L_0x0073:
                boolean r1 = r4.m860t()
                if (r1 == 0) goto L_0x007e
                java.lang.String r1 = " update"
                r0.append(r1)
            L_0x007e:
                boolean r1 = r4.m864p()
                if (r1 == 0) goto L_0x0089
                java.lang.String r1 = " removed"
                r0.append(r1)
            L_0x0089:
                boolean r1 = r4.m856x()
                if (r1 == 0) goto L_0x0094
                java.lang.String r1 = " ignored"
                r0.append(r1)
            L_0x0094:
                boolean r1 = r4.m862r()
                if (r1 == 0) goto L_0x009f
                java.lang.String r1 = " tmpDetached"
                r0.append(r1)
            L_0x009f:
                boolean r1 = r4.m865o()
                if (r1 != 0) goto L_0x00c0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = " not recyclable("
                r1.append(r2)
                int r2 = r4.f3191m
                r1.append(r2)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            L_0x00c0:
                boolean r1 = r4.m868l()
                if (r1 == 0) goto L_0x00cb
                java.lang.String r1 = " undefined adapter position"
                r0.append(r1)
            L_0x00cb:
                android.view.View r1 = r4.f3179a
                android.view.ViewParent r1 = r1.getParent()
                if (r1 != 0) goto L_0x00d8
                java.lang.String r1 = " no parent"
                r0.append(r1)
            L_0x00d8:
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        /* renamed from: u */
        void m859u() {
                r4 = this;
                r0 = 0
                r4.f3188j = r0
                r1 = -1
                r4.f3181c = r1
                r4.f3182d = r1
                r2 = -1
                r4.f3183e = r2
                r4.f3185g = r1
                r4.f3191m = r0
                r2 = 0
                r4.f3186h = r2
                r4.f3187i = r2
                r4.m880b()
                r4.f3194p = r0
                r4.f3195q = r1
                androidx.recyclerview.widget.C0813j.m944e(r4)
                return
        }

        /* renamed from: v */
        void m858v() {
                r2 = this;
                int r0 = r2.f3182d
                r1 = -1
                if (r0 != r1) goto L_0x0009
                int r0 = r2.f3181c
                r2.f3182d = r0
            L_0x0009:
                return
        }

        /* renamed from: w */
        boolean m857w() {
                r1 = this;
                int r0 = r1.f3188j
                r0 = r0 & 16
                if (r0 == 0) goto L_0x0008
                r0 = 1
                goto L_0x0009
            L_0x0008:
                r0 = 0
            L_0x0009:
                return r0
        }

        /* renamed from: x */
        boolean m856x() {
                r1 = this;
                int r0 = r1.f3188j
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x0008
                r0 = 1
                goto L_0x0009
            L_0x0008:
                r0 = 0
            L_0x0009:
                return r0
        }

        /* renamed from: y */
        void m855y() {
                r1 = this;
                androidx.recyclerview.widget.j$v r0 = r1.f3192n
                r0.m605c(r1)
                return
        }

        /* renamed from: z */
        boolean m854z() {
                r1 = this;
                int r0 = r1.f3188j
                r0 = r0 & 32
                if (r0 == 0) goto L_0x0008
                r0 = 1
                goto L_0x0009
            L_0x0008:
                r0 = 0
            L_0x0009:
                return r0
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$e */
    /* loaded from: classes.dex */
    class C0822e implements androidx.recyclerview.widget.C0783b.AbstractC0785b {

        /* renamed from: a */
        final /* synthetic */ androidx.recyclerview.widget.C0813j f3197a;

        C0822e(androidx.recyclerview.widget.C0813j r1) {
                r0 = this;
                r0.f3197a = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.C0783b.AbstractC0785b
        /* renamed from: a */
        public int mo853a() {
                r1 = this;
                androidx.recyclerview.widget.j r0 = r1.f3197a
                int r0 = r0.getChildCount()
                return r0
        }

        @Override // androidx.recyclerview.widget.C0783b.AbstractC0785b
        /* renamed from: a */
        public android.view.View mo852a(int r2) {
                r1 = this;
                androidx.recyclerview.widget.j r0 = r1.f3197a
                android.view.View r2 = r0.getChildAt(r2)
                return r2
        }

        @Override // androidx.recyclerview.widget.C0783b.AbstractC0785b
        /* renamed from: a */
        public void mo851a(android.view.View r2) {
                r1 = this;
                androidx.recyclerview.widget.j$d0 r2 = androidx.recyclerview.widget.C0813j.m924k(r2)
                if (r2 == 0) goto L_0x000b
                androidx.recyclerview.widget.j r0 = r1.f3197a
                r2.m878b(r0)
            L_0x000b:
                return
        }

        @Override // androidx.recyclerview.widget.C0783b.AbstractC0785b
        /* renamed from: a */
        public void mo850a(android.view.View r2, int r3) {
                r1 = this;
                androidx.recyclerview.widget.j r0 = r1.f3197a
                r0.addView(r2, r3)
                androidx.recyclerview.widget.j r3 = r1.f3197a
                r3.m994a(r2)
                return
        }

        @Override // androidx.recyclerview.widget.C0783b.AbstractC0785b
        /* renamed from: a */
        public void mo849a(android.view.View r3, int r4, android.view.ViewGroup.LayoutParams r5) {
                r2 = this;
                androidx.recyclerview.widget.j$d0 r0 = androidx.recyclerview.widget.C0813j.m924k(r3)
                if (r0 == 0) goto L_0x0036
                boolean r1 = r0.m862r()
                if (r1 != 0) goto L_0x0033
                boolean r1 = r0.m856x()
                if (r1 == 0) goto L_0x0013
                goto L_0x0033
            L_0x0013:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Called attach on a child which is not detached: "
                r4.append(r5)
                r4.append(r0)
                androidx.recyclerview.widget.j r5 = r2.f3197a
                java.lang.String r5 = r5.m932i()
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                throw r3
            L_0x0033:
                r0.m876d()
            L_0x0036:
                androidx.recyclerview.widget.j r0 = r2.f3197a
                androidx.recyclerview.widget.C0813j.m975a(r0, r3, r4, r5)
                return
        }

        @Override // androidx.recyclerview.widget.C0783b.AbstractC0785b
        /* renamed from: b */
        public void mo848b() {
                r4 = this;
                int r0 = r4.mo853a()
                r1 = 0
            L_0x0005:
                if (r1 >= r0) goto L_0x0016
                android.view.View r2 = r4.mo852a(r1)
                androidx.recyclerview.widget.j r3 = r4.f3197a
                r3.m967b(r2)
                r2.clearAnimation()
                int r1 = r1 + 1
                goto L_0x0005
            L_0x0016:
                androidx.recyclerview.widget.j r0 = r4.f3197a
                r0.removeAllViews()
                return
        }

        @Override // androidx.recyclerview.widget.C0783b.AbstractC0785b
        /* renamed from: b */
        public void mo847b(int r4) {
                r3 = this;
                android.view.View r0 = r3.mo852a(r4)
                if (r0 == 0) goto L_0x003e
                androidx.recyclerview.widget.j$d0 r0 = androidx.recyclerview.widget.C0813j.m924k(r0)
                if (r0 == 0) goto L_0x003e
                boolean r1 = r0.m862r()
                if (r1 == 0) goto L_0x0039
                boolean r1 = r0.m856x()
                if (r1 == 0) goto L_0x0019
                goto L_0x0039
            L_0x0019:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "called detach on an already detached child "
                r1.append(r2)
                r1.append(r0)
                androidx.recyclerview.widget.j r0 = r3.f3197a
                java.lang.String r0 = r0.m932i()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r4.<init>(r0)
                throw r4
            L_0x0039:
                r1 = 256(0x100, float:3.59E-43)
                r0.m888a(r1)
            L_0x003e:
                androidx.recyclerview.widget.j r0 = r3.f3197a
                androidx.recyclerview.widget.C0813j.m977a(r0, r4)
                return
        }

        @Override // androidx.recyclerview.widget.C0783b.AbstractC0785b
        /* renamed from: b */
        public void mo846b(android.view.View r2) {
                r1 = this;
                androidx.recyclerview.widget.j$d0 r2 = androidx.recyclerview.widget.C0813j.m924k(r2)
                if (r2 == 0) goto L_0x000b
                androidx.recyclerview.widget.j r0 = r1.f3197a
                r2.m883a(r0)
            L_0x000b:
                return
        }

        @Override // androidx.recyclerview.widget.C0783b.AbstractC0785b
        /* renamed from: c */
        public int mo844c(android.view.View r2) {
                r1 = this;
                androidx.recyclerview.widget.j r0 = r1.f3197a
                int r2 = r0.indexOfChild(r2)
                return r2
        }

        @Override // androidx.recyclerview.widget.C0783b.AbstractC0785b
        /* renamed from: c */
        public void mo845c(int r3) {
                r2 = this;
                androidx.recyclerview.widget.j r0 = r2.f3197a
                android.view.View r0 = r0.getChildAt(r3)
                if (r0 == 0) goto L_0x0010
                androidx.recyclerview.widget.j r1 = r2.f3197a
                r1.m967b(r0)
                r0.clearAnimation()
            L_0x0010:
                androidx.recyclerview.widget.j r0 = r2.f3197a
                r0.removeViewAt(r3)
                return
        }

        @Override // androidx.recyclerview.widget.C0783b.AbstractC0785b
        /* renamed from: d */
        public androidx.recyclerview.widget.C0813j.AbstractC0821d0 mo843d(android.view.View r1) {
                r0 = this;
                androidx.recyclerview.widget.j$d0 r1 = androidx.recyclerview.widget.C0813j.m924k(r1)
                return r1
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$f */
    /* loaded from: classes.dex */
    class C0823f implements androidx.recyclerview.widget.C0780a.AbstractC0781a {

        /* renamed from: a */
        final /* synthetic */ androidx.recyclerview.widget.C0813j f3198a;

        C0823f(androidx.recyclerview.widget.C0813j r1) {
                r0 = this;
                r0.f3198a = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.C0780a.AbstractC0781a
        /* renamed from: a */
        public androidx.recyclerview.widget.C0813j.AbstractC0821d0 mo842a(int r4) {
                r3 = this;
                androidx.recyclerview.widget.j r0 = r3.f3198a
                r1 = 1
                androidx.recyclerview.widget.j$d0 r4 = r0.m1001a(r4, r1)
                r0 = 0
                if (r4 != 0) goto L_0x000b
                return r0
            L_0x000b:
                androidx.recyclerview.widget.j r1 = r3.f3198a
                androidx.recyclerview.widget.b r1 = r1.f3110f
                android.view.View r2 = r4.f3179a
                boolean r1 = r1.m1119c(r2)
                if (r1 == 0) goto L_0x0018
                return r0
            L_0x0018:
                return r4
        }

        @Override // androidx.recyclerview.widget.C0780a.AbstractC0781a
        /* renamed from: a */
        public void mo841a(int r2, int r3) {
                r1 = this;
                androidx.recyclerview.widget.j r0 = r1.f3198a
                r0.m937g(r2, r3)
                androidx.recyclerview.widget.j r2 = r1.f3198a
                r3 = 1
                r2.f3121k0 = r3
                return
        }

        @Override // androidx.recyclerview.widget.C0780a.AbstractC0781a
        /* renamed from: a */
        public void mo840a(int r2, int r3, java.lang.Object r4) {
                r1 = this;
                androidx.recyclerview.widget.j r0 = r1.f3198a
                r0.m1005a(r2, r3, r4)
                androidx.recyclerview.widget.j r2 = r1.f3198a
                r3 = 1
                r2.f3123l0 = r3
                return
        }

        @Override // androidx.recyclerview.widget.C0780a.AbstractC0781a
        /* renamed from: a */
        public void mo839a(androidx.recyclerview.widget.C0780a.C0782b r1) {
                r0 = this;
                r0.m835c(r1)
                return
        }

        @Override // androidx.recyclerview.widget.C0780a.AbstractC0781a
        /* renamed from: b */
        public void mo838b(int r2, int r3) {
                r1 = this;
                androidx.recyclerview.widget.j r0 = r1.f3198a
                r0.m941f(r2, r3)
                androidx.recyclerview.widget.j r2 = r1.f3198a
                r3 = 1
                r2.f3121k0 = r3
                return
        }

        @Override // androidx.recyclerview.widget.C0780a.AbstractC0781a
        /* renamed from: b */
        public void mo837b(androidx.recyclerview.widget.C0780a.C0782b r1) {
                r0 = this;
                r0.m835c(r1)
                return
        }

        @Override // androidx.recyclerview.widget.C0780a.AbstractC0781a
        /* renamed from: c */
        public void mo836c(int r3, int r4) {
                r2 = this;
                androidx.recyclerview.widget.j r0 = r2.f3198a
                r1 = 1
                r0.m1004a(r3, r4, r1)
                androidx.recyclerview.widget.j r3 = r2.f3198a
                r3.f3121k0 = r1
                androidx.recyclerview.widget.j$a0 r3 = r3.f3115h0
                int r0 = r3.f3155d
                int r0 = r0 + r4
                r3.f3155d = r0
                return
        }

        /* renamed from: c */
        void m835c(androidx.recyclerview.widget.C0780a.C0782b r5) {
                r4 = this;
                int r0 = r5.f2945a
                r1 = 1
                if (r0 == r1) goto L_0x0036
                r2 = 2
                if (r0 == r2) goto L_0x002a
                r2 = 4
                if (r0 == r2) goto L_0x001c
                r2 = 8
                if (r0 == r2) goto L_0x0010
                goto L_0x0041
            L_0x0010:
                androidx.recyclerview.widget.j r0 = r4.f3198a
                androidx.recyclerview.widget.j$o r2 = r0.f3124m
                int r3 = r5.f2946b
                int r5 = r5.f2948d
                r2.mo742a(r0, r3, r5, r1)
                goto L_0x0041
            L_0x001c:
                androidx.recyclerview.widget.j r0 = r4.f3198a
                androidx.recyclerview.widget.j$o r1 = r0.f3124m
                int r2 = r5.f2946b
                int r3 = r5.f2948d
                java.lang.Object r5 = r5.f2947c
                r1.mo741a(r0, r2, r3, r5)
                goto L_0x0041
            L_0x002a:
                androidx.recyclerview.widget.j r0 = r4.f3198a
                androidx.recyclerview.widget.j$o r1 = r0.f3124m
                int r2 = r5.f2946b
                int r5 = r5.f2948d
                r1.mo719b(r0, r2, r5)
                goto L_0x0041
            L_0x0036:
                androidx.recyclerview.widget.j r0 = r4.f3198a
                androidx.recyclerview.widget.j$o r1 = r0.f3124m
                int r2 = r5.f2946b
                int r5 = r5.f2948d
                r1.mo743a(r0, r2, r5)
            L_0x0041:
                return
        }

        @Override // androidx.recyclerview.widget.C0780a.AbstractC0781a
        /* renamed from: d */
        public void mo834d(int r3, int r4) {
                r2 = this;
                androidx.recyclerview.widget.j r0 = r2.f3198a
                r1 = 0
                r0.m1004a(r3, r4, r1)
                androidx.recyclerview.widget.j r3 = r2.f3198a
                r4 = 1
                r3.f3121k0 = r4
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$g */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0824g<VH extends androidx.recyclerview.widget.C0813j.AbstractC0821d0> {

        /* renamed from: a */
        private final androidx.recyclerview.widget.C0813j.C0825h f3199a;

        /* renamed from: b */
        private boolean f3200b;

        public AbstractC0824g() {
                r1 = this;
                r1.<init>()
                androidx.recyclerview.widget.j$h r0 = new androidx.recyclerview.widget.j$h
                r0.<init>()
                r1.f3199a = r0
                r0 = 0
                r1.f3200b = r0
                return
        }

        /* renamed from: a */
        public abstract int mo106a();

        /* renamed from: a */
        public abstract long mo105a(int r1);

        /* renamed from: a */
        public final VH m833a(android.view.ViewGroup r2, int r3) {
                r1 = this;
                java.lang.String r0 = "RV CreateView"
                p000a.p018g.p025h.C0159a.m3606a(r0)     // Catch: all -> 0x001f
                androidx.recyclerview.widget.j$d0 r2 = r1.mo97b(r2, r3)     // Catch: all -> 0x001f
                android.view.View r0 = r2.f3179a     // Catch: all -> 0x001f
                android.view.ViewParent r0 = r0.getParent()     // Catch: all -> 0x001f
                if (r0 != 0) goto L_0x0017
                r2.f3184f = r3     // Catch: all -> 0x001f
                p000a.p018g.p025h.C0159a.m3607a()
                return r2
            L_0x0017:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: all -> 0x001f
                java.lang.String r3 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
                r2.<init>(r3)     // Catch: all -> 0x001f
                throw r2     // Catch: all -> 0x001f
            L_0x001f:
                r2 = move-exception
                p000a.p018g.p025h.C0159a.m3607a()
                throw r2
        }

        /* renamed from: a */
        public final void m831a(VH r3, int r4) {
                r2 = this;
                r3.f3181c = r4
                boolean r0 = r2.m827b()
                if (r0 == 0) goto L_0x000e
                long r0 = r2.mo105a(r4)
                r3.f3183e = r0
            L_0x000e:
                r0 = 519(0x207, float:7.27E-43)
                r1 = 1
                r3.m887a(r1, r0)
                java.lang.String r0 = "RV OnBindView"
                p000a.p018g.p025h.C0159a.m3606a(r0)
                java.util.List r0 = r3.m869k()
                r2.m830a(r3, r4, r0)
                r3.m880b()
                android.view.View r3 = r3.f3179a
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                boolean r4 = r3 instanceof androidx.recyclerview.widget.C0813j.C0840p
                if (r4 == 0) goto L_0x0031
                androidx.recyclerview.widget.j$p r3 = (androidx.recyclerview.widget.C0813j.C0840p) r3
                r3.f3236c = r1
            L_0x0031:
                p000a.p018g.p025h.C0159a.m3607a()
                return
        }

        /* renamed from: a */
        public void m830a(VH r1, int r2, java.util.List<java.lang.Object> r3) {
                r0 = this;
                r0.mo96b(r1, r2)
                return
        }

        /* renamed from: a */
        public void m829a(androidx.recyclerview.widget.C0813j.AbstractC0826i r2) {
                r1 = this;
                androidx.recyclerview.widget.j$h r0 = r1.f3199a
                r0.registerObserver(r2)
                return
        }

        /* renamed from: a */
        public void m828a(androidx.recyclerview.widget.C0813j r1) {
                r0 = this;
                return
        }

        /* renamed from: a */
        public boolean m832a(VH r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: b */
        public abstract int mo98b(int r1);

        /* renamed from: b */
        public abstract VH mo97b(android.view.ViewGroup r1, int r2);

        /* renamed from: b */
        public void m826b(VH r1) {
                r0 = this;
                return
        }

        /* renamed from: b */
        public abstract void mo96b(VH r1, int r2);

        /* renamed from: b */
        public void m825b(androidx.recyclerview.widget.C0813j.AbstractC0826i r2) {
                r1 = this;
                androidx.recyclerview.widget.j$h r0 = r1.f3199a
                r0.unregisterObserver(r2)
                return
        }

        /* renamed from: b */
        public void m824b(androidx.recyclerview.widget.C0813j r1) {
                r0 = this;
                return
        }

        /* renamed from: b */
        public final boolean m827b() {
                r1 = this;
                boolean r0 = r1.f3200b
                return r0
        }

        /* renamed from: c */
        public final void m823c() {
                r1 = this;
                androidx.recyclerview.widget.j$h r0 = r1.f3199a
                r0.m821a()
                return
        }

        /* renamed from: c */
        public void m822c(VH r1) {
                r0 = this;
                return
        }

        /* renamed from: d */
        public abstract void mo94d(VH r1);
    }

    /* renamed from: androidx.recyclerview.widget.j$h */
    /* loaded from: classes.dex */
    static class C0825h extends android.database.Observable<androidx.recyclerview.widget.C0813j.AbstractC0826i> {
        C0825h() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public void m821a() {
                r2 = this;
                java.util.ArrayList r0 = r2.mObservers
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L_0x0008:
                if (r0 < 0) goto L_0x0018
                java.util.ArrayList r1 = r2.mObservers
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.j$i r1 = (androidx.recyclerview.widget.C0813j.AbstractC0826i) r1
                r1.mo590a()
                int r0 = r0 + (-1)
                goto L_0x0008
            L_0x0018:
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$i */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0826i {
        public AbstractC0826i() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public void mo590a() {
                r0 = this;
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$j */
    /* loaded from: classes.dex */
    public interface AbstractC0827j {
        /* renamed from: a */
        int m820a(int r1, int r2);
    }

    /* renamed from: androidx.recyclerview.widget.j$k */
    /* loaded from: classes.dex */
    public static class C0828k {
        public C0828k() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        protected android.widget.EdgeEffect m819a(androidx.recyclerview.widget.C0813j r1, int r2) {
                r0 = this;
                android.widget.EdgeEffect r2 = new android.widget.EdgeEffect
                android.content.Context r1 = r1.getContext()
                r2.<init>(r1)
                return r2
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$l */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0829l {

        /* renamed from: a */
        private androidx.recyclerview.widget.C0813j.AbstractC0829l.AbstractC0831b f3201a;

        /* renamed from: b */
        private java.util.ArrayList<androidx.recyclerview.widget.C0813j.AbstractC0829l.AbstractC0830a> f3202b;

        /* renamed from: c */
        private long f3203c;

        /* renamed from: d */
        private long f3204d;

        /* renamed from: e */
        private long f3205e;

        /* renamed from: f */
        private long f3206f;

        /* renamed from: androidx.recyclerview.widget.j$l$a */
        /* loaded from: classes.dex */
        public interface AbstractC0830a {
            /* renamed from: a */
            void m801a();
        }

        /* renamed from: androidx.recyclerview.widget.j$l$b */
        /* loaded from: classes.dex */
        interface AbstractC0831b {
            /* renamed from: a */
            void mo798a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1);
        }

        /* renamed from: androidx.recyclerview.widget.j$l$c */
        /* loaded from: classes.dex */
        public static class C0832c {

            /* renamed from: a */
            public int f3207a;

            /* renamed from: b */
            public int f3208b;

            public C0832c() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            /* renamed from: a */
            public androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c m800a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r2) {
                    r1 = this;
                    r0 = 0
                    r1.m799a(r2, r0)
                    return r1
            }

            /* renamed from: a */
            public androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c m799a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1, int r2) {
                    r0 = this;
                    android.view.View r1 = r1.f3179a
                    int r2 = r1.getLeft()
                    r0.f3207a = r2
                    int r2 = r1.getTop()
                    r0.f3208b = r2
                    r1.getRight()
                    r1.getBottom()
                    return r0
            }
        }

        public AbstractC0829l() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.f3201a = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.f3202b = r0
                r0 = 120(0x78, double:5.93E-322)
                r2.f3203c = r0
                r2.f3204d = r0
                r0 = 250(0xfa, double:1.235E-321)
                r2.f3205e = r0
                r2.f3206f = r0
                return
        }

        /* renamed from: e */
        static int m806e(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r3) {
                int r0 = r3.f3188j
                r0 = r0 & 14
                boolean r1 = r3.m866n()
                if (r1 == 0) goto L_0x000c
                r3 = 4
                return r3
            L_0x000c:
                r1 = r0 & 4
                if (r1 != 0) goto L_0x0021
                int r1 = r3.m870j()
                int r3 = r3.m874f()
                r2 = -1
                if (r1 == r2) goto L_0x0021
                if (r3 == r2) goto L_0x0021
                if (r1 == r3) goto L_0x0021
                r0 = r0 | 2048(0x800, float:2.87E-42)
            L_0x0021:
                return r0
        }

        /* renamed from: a */
        public androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c m817a(androidx.recyclerview.widget.C0813j.C0815a0 r1, androidx.recyclerview.widget.C0813j.AbstractC0821d0 r2) {
                r0 = this;
                androidx.recyclerview.widget.j$l$c r1 = r0.m803h()
                r1.m800a(r2)
                return r1
        }

        /* renamed from: a */
        public androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c m816a(androidx.recyclerview.widget.C0813j.C0815a0 r1, androidx.recyclerview.widget.C0813j.AbstractC0821d0 r2, int r3, java.util.List<java.lang.Object> r4) {
                r0 = this;
                androidx.recyclerview.widget.j$l$c r1 = r0.m803h()
                r1.m800a(r2)
                return r1
        }

        /* renamed from: a */
        public final void m818a() {
                r3 = this;
                java.util.ArrayList<androidx.recyclerview.widget.j$l$a> r0 = r3.f3202b
                int r0 = r0.size()
                r1 = 0
            L_0x0007:
                if (r1 >= r0) goto L_0x0017
                java.util.ArrayList<androidx.recyclerview.widget.j$l$a> r2 = r3.f3202b
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.j$l$a r2 = (androidx.recyclerview.widget.C0813j.AbstractC0829l.AbstractC0830a) r2
                r2.m801a()
                int r1 = r1 + 1
                goto L_0x0007
            L_0x0017:
                java.util.ArrayList<androidx.recyclerview.widget.j$l$a> r0 = r3.f3202b
                r0.clear()
                return
        }

        /* renamed from: a */
        void m814a(androidx.recyclerview.widget.C0813j.AbstractC0829l.AbstractC0831b r1) {
                r0 = this;
                r0.f3201a = r1
                return
        }

        /* renamed from: a */
        public abstract boolean mo575a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1);

        /* renamed from: a */
        public abstract boolean mo572a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1, androidx.recyclerview.widget.C0813j.AbstractC0821d0 r2, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r3, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r4);

        /* renamed from: a */
        public abstract boolean mo571a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r2, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r3);

        /* renamed from: a */
        public boolean mo815a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1, java.util.List<java.lang.Object> r2) {
                r0 = this;
                boolean r1 = r0.mo575a(r1)
                return r1
        }

        /* renamed from: b */
        public abstract void mo813b();

        /* renamed from: b */
        public final void m812b(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r2) {
                r1 = this;
                r1.m808d(r2)
                androidx.recyclerview.widget.j$l$b r0 = r1.f3201a
                if (r0 == 0) goto L_0x000a
                r0.mo798a(r2)
            L_0x000a:
                return
        }

        /* renamed from: b */
        public abstract boolean mo569b(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r2, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r3);

        /* renamed from: c */
        public long m811c() {
                r2 = this;
                long r0 = r2.f3203c
                return r0
        }

        /* renamed from: c */
        public abstract void mo810c(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1);

        /* renamed from: c */
        public abstract boolean mo567c(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r2, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r3);

        /* renamed from: d */
        public long m809d() {
                r2 = this;
                long r0 = r2.f3206f
                return r0
        }

        /* renamed from: d */
        public void m808d(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1) {
                r0 = this;
                return
        }

        /* renamed from: e */
        public long m807e() {
                r2 = this;
                long r0 = r2.f3205e
                return r0
        }

        /* renamed from: f */
        public long m805f() {
                r2 = this;
                long r0 = r2.f3204d
                return r0
        }

        /* renamed from: g */
        public abstract boolean mo804g();

        /* renamed from: h */
        public androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c m803h() {
                r1 = this;
                androidx.recyclerview.widget.j$l$c r0 = new androidx.recyclerview.widget.j$l$c
                r0.<init>()
                return r0
        }

        /* renamed from: i */
        public abstract void mo802i();
    }

    /* renamed from: androidx.recyclerview.widget.j$m */
    /* loaded from: classes.dex */
    private class C0833m implements androidx.recyclerview.widget.C0813j.AbstractC0829l.AbstractC0831b {

        /* renamed from: a */
        final /* synthetic */ androidx.recyclerview.widget.C0813j f3209a;

        C0833m(androidx.recyclerview.widget.C0813j r1) {
                r0 = this;
                r0.f3209a = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.C0813j.AbstractC0829l.AbstractC0831b
        /* renamed from: a */
        public void mo798a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r3) {
                r2 = this;
                r0 = 1
                r3.m881a(r0)
                androidx.recyclerview.widget.j$d0 r0 = r3.f3186h
                r1 = 0
                if (r0 == 0) goto L_0x000f
                androidx.recyclerview.widget.j$d0 r0 = r3.f3187i
                if (r0 != 0) goto L_0x000f
                r3.f3186h = r1
            L_0x000f:
                r3.f3187i = r1
                boolean r0 = r3.m857w()
                if (r0 != 0) goto L_0x002f
                androidx.recyclerview.widget.j r0 = r2.f3209a
                android.view.View r1 = r3.f3179a
                boolean r0 = r0.m930i(r1)
                if (r0 != 0) goto L_0x002f
                boolean r0 = r3.m862r()
                if (r0 == 0) goto L_0x002f
                androidx.recyclerview.widget.j r0 = r2.f3209a
                android.view.View r3 = r3.f3179a
                r1 = 0
                r0.removeDetachedView(r3, r1)
            L_0x002f:
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$n */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0834n {
        public AbstractC0834n() {
                r0 = this;
                r0.<init>()
                return
        }

        @java.lang.Deprecated
        /* renamed from: a */
        public void m797a(android.graphics.Canvas r1, androidx.recyclerview.widget.C0813j r2) {
                r0 = this;
                return
        }

        /* renamed from: a */
        public void m796a(android.graphics.Canvas r1, androidx.recyclerview.widget.C0813j r2, androidx.recyclerview.widget.C0813j.C0815a0 r3) {
                r0 = this;
                r0.m797a(r1, r2)
                return
        }

        @java.lang.Deprecated
        /* renamed from: a */
        public void m795a(android.graphics.Rect r1, int r2, androidx.recyclerview.widget.C0813j r3) {
                r0 = this;
                r2 = 0
                r1.set(r2, r2, r2, r2)
                return
        }

        /* renamed from: a */
        public void m794a(android.graphics.Rect r1, android.view.View r2, androidx.recyclerview.widget.C0813j r3, androidx.recyclerview.widget.C0813j.C0815a0 r4) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                androidx.recyclerview.widget.j$p r2 = (androidx.recyclerview.widget.C0813j.C0840p) r2
                int r2 = r2.m654a()
                r0.m795a(r1, r2, r3)
                return
        }

        @java.lang.Deprecated
        /* renamed from: b */
        public void m793b(android.graphics.Canvas r1, androidx.recyclerview.widget.C0813j r2) {
                r0 = this;
                return
        }

        /* renamed from: b */
        public void mo792b(android.graphics.Canvas r1, androidx.recyclerview.widget.C0813j r2, androidx.recyclerview.widget.C0813j.C0815a0 r3) {
                r0 = this;
                r0.m793b(r1, r2)
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$o */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0835o {

        /* renamed from: a */
        androidx.recyclerview.widget.C0783b f3210a;

        /* renamed from: b */
        androidx.recyclerview.widget.C0813j f3211b;

        /* renamed from: c */
        private final androidx.recyclerview.widget.C0858n.AbstractC0860b f3212c;

        /* renamed from: d */
        private final androidx.recyclerview.widget.C0858n.AbstractC0860b f3213d;

        /* renamed from: e */
        androidx.recyclerview.widget.C0858n f3214e;

        /* renamed from: f */
        androidx.recyclerview.widget.C0858n f3215f;

        /* renamed from: g */
        androidx.recyclerview.widget.C0813j.AbstractC0852z f3216g;

        /* renamed from: h */
        boolean f3217h;

        /* renamed from: i */
        boolean f3218i;

        /* renamed from: j */
        boolean f3219j;

        /* renamed from: k */
        private boolean f3220k;

        /* renamed from: l */
        private boolean f3221l;

        /* renamed from: m */
        int f3222m;

        /* renamed from: n */
        boolean f3223n;

        /* renamed from: o */
        private int f3224o;

        /* renamed from: p */
        private int f3225p;

        /* renamed from: q */
        private int f3226q;

        /* renamed from: r */
        private int f3227r;

        /* renamed from: androidx.recyclerview.widget.j$o$a */
        /* loaded from: classes.dex */
        class C0836a implements androidx.recyclerview.widget.C0858n.AbstractC0860b {

            /* renamed from: a */
            final /* synthetic */ androidx.recyclerview.widget.C0813j.AbstractC0835o f3228a;

            C0836a(androidx.recyclerview.widget.C0813j.AbstractC0835o r1) {
                    r0 = this;
                    r0.f3228a = r1
                    r0.<init>()
                    return
            }

            @Override // androidx.recyclerview.widget.C0858n.AbstractC0860b
            /* renamed from: a */
            public int mo543a() {
                    r2 = this;
                    androidx.recyclerview.widget.j$o r0 = r2.f3228a
                    int r0 = r0.m665q()
                    androidx.recyclerview.widget.j$o r1 = r2.f3228a
                    int r1 = r1.m668o()
                    int r0 = r0 - r1
                    return r0
            }

            @Override // androidx.recyclerview.widget.C0858n.AbstractC0860b
            /* renamed from: a */
            public int mo541a(android.view.View r3) {
                    r2 = this;
                    android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                    androidx.recyclerview.widget.j$p r0 = (androidx.recyclerview.widget.C0813j.C0840p) r0
                    androidx.recyclerview.widget.j$o r1 = r2.f3228a
                    int r3 = r1.m679i(r3)
                    int r0 = r0.rightMargin
                    int r3 = r3 + r0
                    return r3
            }

            @Override // androidx.recyclerview.widget.C0858n.AbstractC0860b
            /* renamed from: a */
            public android.view.View mo542a(int r2) {
                    r1 = this;
                    androidx.recyclerview.widget.j$o r0 = r1.f3228a
                    android.view.View r2 = r0.m715c(r2)
                    return r2
            }

            @Override // androidx.recyclerview.widget.C0858n.AbstractC0860b
            /* renamed from: b */
            public int mo540b() {
                    r1 = this;
                    androidx.recyclerview.widget.j$o r0 = r1.f3228a
                    int r0 = r0.m670n()
                    return r0
            }

            @Override // androidx.recyclerview.widget.C0858n.AbstractC0860b
            /* renamed from: b */
            public int mo539b(android.view.View r3) {
                    r2 = this;
                    android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                    androidx.recyclerview.widget.j$p r0 = (androidx.recyclerview.widget.C0813j.C0840p) r0
                    androidx.recyclerview.widget.j$o r1 = r2.f3228a
                    int r3 = r1.m689f(r3)
                    int r0 = r0.leftMargin
                    int r3 = r3 - r0
                    return r3
            }
        }

        /* renamed from: androidx.recyclerview.widget.j$o$b */
        /* loaded from: classes.dex */
        class C0837b implements androidx.recyclerview.widget.C0858n.AbstractC0860b {

            /* renamed from: a */
            final /* synthetic */ androidx.recyclerview.widget.C0813j.AbstractC0835o f3229a;

            C0837b(androidx.recyclerview.widget.C0813j.AbstractC0835o r1) {
                    r0 = this;
                    r0.f3229a = r1
                    r0.<init>()
                    return
            }

            @Override // androidx.recyclerview.widget.C0858n.AbstractC0860b
            /* renamed from: a */
            public int mo543a() {
                    r2 = this;
                    androidx.recyclerview.widget.j$o r0 = r2.f3229a
                    int r0 = r0.m682h()
                    androidx.recyclerview.widget.j$o r1 = r2.f3229a
                    int r1 = r1.m672m()
                    int r0 = r0 - r1
                    return r0
            }

            @Override // androidx.recyclerview.widget.C0858n.AbstractC0860b
            /* renamed from: a */
            public int mo541a(android.view.View r3) {
                    r2 = this;
                    android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                    androidx.recyclerview.widget.j$p r0 = (androidx.recyclerview.widget.C0813j.C0840p) r0
                    androidx.recyclerview.widget.j$o r1 = r2.f3229a
                    int r3 = r1.m695e(r3)
                    int r0 = r0.bottomMargin
                    int r3 = r3 + r0
                    return r3
            }

            @Override // androidx.recyclerview.widget.C0858n.AbstractC0860b
            /* renamed from: a */
            public android.view.View mo542a(int r2) {
                    r1 = this;
                    androidx.recyclerview.widget.j$o r0 = r1.f3229a
                    android.view.View r2 = r0.m715c(r2)
                    return r2
            }

            @Override // androidx.recyclerview.widget.C0858n.AbstractC0860b
            /* renamed from: b */
            public int mo540b() {
                    r1 = this;
                    androidx.recyclerview.widget.j$o r0 = r1.f3229a
                    int r0 = r0.m666p()
                    return r0
            }

            @Override // androidx.recyclerview.widget.C0858n.AbstractC0860b
            /* renamed from: b */
            public int mo539b(android.view.View r3) {
                    r2 = this;
                    android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                    androidx.recyclerview.widget.j$p r0 = (androidx.recyclerview.widget.C0813j.C0840p) r0
                    androidx.recyclerview.widget.j$o r1 = r2.f3229a
                    int r3 = r1.m677j(r3)
                    int r0 = r0.topMargin
                    int r3 = r3 - r0
                    return r3
            }
        }

        /* renamed from: androidx.recyclerview.widget.j$o$c */
        /* loaded from: classes.dex */
        public interface AbstractC0838c {
            /* renamed from: a */
            void mo655a(int r1, int r2);
        }

        /* renamed from: androidx.recyclerview.widget.j$o$d */
        /* loaded from: classes.dex */
        public static class C0839d {

            /* renamed from: a */
            public int f3230a;

            /* renamed from: b */
            public int f3231b;

            /* renamed from: c */
            public boolean f3232c;

            /* renamed from: d */
            public boolean f3233d;

            public C0839d() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        public AbstractC0835o() {
                r2 = this;
                r2.<init>()
                androidx.recyclerview.widget.j$o$a r0 = new androidx.recyclerview.widget.j$o$a
                r0.<init>(r2)
                r2.f3212c = r0
                androidx.recyclerview.widget.j$o$b r0 = new androidx.recyclerview.widget.j$o$b
                r0.<init>(r2)
                r2.f3213d = r0
                androidx.recyclerview.widget.n r0 = new androidx.recyclerview.widget.n
                androidx.recyclerview.widget.n$b r1 = r2.f3212c
                r0.<init>(r1)
                r2.f3214e = r0
                androidx.recyclerview.widget.n r0 = new androidx.recyclerview.widget.n
                androidx.recyclerview.widget.n$b r1 = r2.f3213d
                r0.<init>(r1)
                r2.f3215f = r0
                r0 = 0
                r2.f3217h = r0
                r2.f3218i = r0
                r2.f3219j = r0
                r0 = 1
                r2.f3220k = r0
                r2.f3221l = r0
                return
        }

        /* renamed from: a */
        public static int m785a(int r2, int r3, int r4) {
                int r0 = android.view.View.MeasureSpec.getMode(r2)
                int r2 = android.view.View.MeasureSpec.getSize(r2)
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r1) goto L_0x0015
                r1 = 1073741824(0x40000000, float:2.0)
                if (r0 == r1) goto L_0x0014
                int r2 = java.lang.Math.max(r3, r4)
            L_0x0014:
                return r2
            L_0x0015:
                int r3 = java.lang.Math.max(r3, r4)
                int r2 = java.lang.Math.min(r2, r3)
                return r2
        }

        /* renamed from: a */
        public static int m784a(int r4, int r5, int r6, int r7, boolean r8) {
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x0020
                if (r7 < 0) goto L_0x0011
                goto L_0x0022
            L_0x0011:
                if (r7 != r1) goto L_0x0033
                if (r5 == r2) goto L_0x001c
                if (r5 == 0) goto L_0x0019
                if (r5 == r3) goto L_0x001c
            L_0x0019:
                r5 = 0
                r7 = 0
                goto L_0x001d
            L_0x001c:
                r7 = r4
            L_0x001d:
                r6 = r5
                r4 = r7
                goto L_0x0034
            L_0x0020:
                if (r7 < 0) goto L_0x0026
            L_0x0022:
                r4 = r7
                r6 = 1073741824(0x40000000, float:2.0)
                goto L_0x0034
            L_0x0026:
                if (r7 != r1) goto L_0x002a
                r6 = r5
                goto L_0x0034
            L_0x002a:
                if (r7 != r0) goto L_0x0033
                if (r5 == r2) goto L_0x0030
                if (r5 != r3) goto L_0x0034
            L_0x0030:
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0034
            L_0x0033:
                r4 = 0
            L_0x0034:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r6)
                return r4
        }

        /* renamed from: a */
        public static androidx.recyclerview.widget.C0813j.AbstractC0835o.C0839d m775a(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
                androidx.recyclerview.widget.j$o$d r0 = new androidx.recyclerview.widget.j$o$d
                r0.<init>()
                int[] r1 = p000a.p044m.C0318b.RecyclerView
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r1, r4, r5)
                int r3 = p000a.p044m.C0318b.RecyclerView_android_orientation
                r4 = 1
                int r3 = r2.getInt(r3, r4)
                r0.f3230a = r3
                int r3 = p000a.p044m.C0318b.RecyclerView_spanCount
                int r3 = r2.getInt(r3, r4)
                r0.f3231b = r3
                int r3 = p000a.p044m.C0318b.RecyclerView_reverseLayout
                r4 = 0
                boolean r3 = r2.getBoolean(r3, r4)
                r0.f3232c = r3
                int r3 = p000a.p044m.C0318b.RecyclerView_stackFromEnd
                boolean r3 = r2.getBoolean(r3, r4)
                r0.f3233d = r3
                r2.recycle()
                return r0
        }

        /* renamed from: a */
        private void m781a(int r1, android.view.View r2) {
                r0 = this;
                androidx.recyclerview.widget.b r2 = r0.f3210a
                r2.m1129a(r1)
                return
        }

        /* renamed from: a */
        private void m764a(android.view.View r5, int r6, boolean r7) {
                r4 = this;
                androidx.recyclerview.widget.j$d0 r0 = androidx.recyclerview.widget.C0813j.m924k(r5)
                if (r7 != 0) goto L_0x0015
                boolean r7 = r0.m864p()
                if (r7 == 0) goto L_0x000d
                goto L_0x0015
            L_0x000d:
                androidx.recyclerview.widget.j r7 = r4.f3211b
                androidx.recyclerview.widget.o r7 = r7.f3112g
                r7.m523g(r0)
                goto L_0x001c
            L_0x0015:
                androidx.recyclerview.widget.j r7 = r4.f3211b
                androidx.recyclerview.widget.o r7 = r7.f3112g
                r7.m535a(r0)
            L_0x001c:
                android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
                androidx.recyclerview.widget.j$p r7 = (androidx.recyclerview.widget.C0813j.C0840p) r7
                boolean r1 = r0.m854z()
                r2 = 0
                if (r1 != 0) goto L_0x0091
                boolean r1 = r0.m863q()
                if (r1 == 0) goto L_0x0030
                goto L_0x0091
            L_0x0030:
                android.view.ViewParent r1 = r5.getParent()
                androidx.recyclerview.widget.j r3 = r4.f3211b
                if (r1 != r3) goto L_0x0079
                androidx.recyclerview.widget.b r1 = r4.f3210a
                int r1 = r1.m1122b(r5)
                r3 = -1
                if (r6 != r3) goto L_0x0047
                androidx.recyclerview.widget.b r6 = r4.f3210a
                int r6 = r6.m1130a()
            L_0x0047:
                if (r1 == r3) goto L_0x0053
                if (r1 == r6) goto L_0x00a7
                androidx.recyclerview.widget.j r5 = r4.f3211b
                androidx.recyclerview.widget.j$o r5 = r5.f3124m
                r5.m786a(r1, r6)
                goto L_0x00a7
            L_0x0053:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r0 = "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"
                r7.append(r0)
                androidx.recyclerview.widget.j r0 = r4.f3211b
                int r5 = r0.indexOfChild(r5)
                r7.append(r5)
                androidx.recyclerview.widget.j r5 = r4.f3211b
                java.lang.String r5 = r5.m932i()
                r7.append(r5)
                java.lang.String r5 = r7.toString()
                r6.<init>(r5)
                throw r6
            L_0x0079:
                androidx.recyclerview.widget.b r1 = r4.f3210a
                r1.m1126a(r5, r6, r2)
                r6 = 1
                r7.f3236c = r6
                androidx.recyclerview.widget.j$z r6 = r4.f3216g
                if (r6 == 0) goto L_0x00a7
                boolean r6 = r6.m583c()
                if (r6 == 0) goto L_0x00a7
                androidx.recyclerview.widget.j$z r6 = r4.f3216g
                r6.m585a(r5)
                goto L_0x00a7
            L_0x0091:
                boolean r1 = r0.m863q()
                if (r1 == 0) goto L_0x009b
                r0.m855y()
                goto L_0x009e
            L_0x009b:
                r0.m877c()
            L_0x009e:
                androidx.recyclerview.widget.b r1 = r4.f3210a
                android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
                r1.m1127a(r5, r6, r3, r2)
            L_0x00a7:
                boolean r5 = r7.f3237d
                if (r5 == 0) goto L_0x00b2
                android.view.View r5 = r0.f3179a
                r5.invalidate()
                r7.f3237d = r2
            L_0x00b2:
                return
        }

        /* renamed from: a */
        private void m752a(androidx.recyclerview.widget.C0813j.C0847v r3, int r4, android.view.View r5) {
                r2 = this;
                androidx.recyclerview.widget.j$d0 r0 = androidx.recyclerview.widget.C0813j.m924k(r5)
                boolean r1 = r0.m856x()
                if (r1 == 0) goto L_0x000b
                return
            L_0x000b:
                boolean r1 = r0.m866n()
                if (r1 == 0) goto L_0x0028
                boolean r1 = r0.m864p()
                if (r1 != 0) goto L_0x0028
                androidx.recyclerview.widget.j r1 = r2.f3211b
                androidx.recyclerview.widget.j$g r1 = r1.f3122l
                boolean r1 = r1.m827b()
                if (r1 != 0) goto L_0x0028
                r2.m685g(r4)
                r3.m610b(r0)
                goto L_0x0035
            L_0x0028:
                r2.m787a(r4)
                r3.m606c(r5)
                androidx.recyclerview.widget.j r3 = r2.f3211b
                androidx.recyclerview.widget.o r3 = r3.f3112g
                r3.m526d(r0)
            L_0x0035:
                return
        }

        /* renamed from: b */
        private static boolean m729b(int r3, int r4, int r5) {
                int r0 = android.view.View.MeasureSpec.getMode(r4)
                int r4 = android.view.View.MeasureSpec.getSize(r4)
                r1 = 0
                if (r5 <= 0) goto L_0x000e
                if (r3 == r5) goto L_0x000e
                return r1
            L_0x000e:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = 1
                if (r0 == r5) goto L_0x001f
                if (r0 == 0) goto L_0x001e
                r5 = 1073741824(0x40000000, float:2.0)
                if (r0 == r5) goto L_0x001a
                return r1
            L_0x001a:
                if (r4 != r3) goto L_0x001d
                r1 = 1
            L_0x001d:
                return r1
            L_0x001e:
                return r2
            L_0x001f:
                if (r4 < r3) goto L_0x0022
                r1 = 1
            L_0x0022:
                return r1
        }

        /* renamed from: b */
        private int[] m718b(androidx.recyclerview.widget.C0813j r8, android.view.View r9, android.graphics.Rect r10, boolean r11) {
                r7 = this;
                r8 = 2
                int[] r8 = new int[r8]
                int r11 = r7.m670n()
                int r0 = r7.m666p()
                int r1 = r7.m665q()
                int r2 = r7.m668o()
                int r1 = r1 - r2
                int r2 = r7.m682h()
                int r3 = r7.m672m()
                int r2 = r2 - r3
                int r3 = r9.getLeft()
                int r4 = r10.left
                int r3 = r3 + r4
                int r4 = r9.getScrollX()
                int r3 = r3 - r4
                int r4 = r9.getTop()
                int r5 = r10.top
                int r4 = r4 + r5
                int r9 = r9.getScrollY()
                int r4 = r4 - r9
                int r9 = r10.width()
                int r9 = r9 + r3
                int r10 = r10.height()
                int r10 = r10 + r4
                int r3 = r3 - r11
                r11 = 0
                int r5 = java.lang.Math.min(r11, r3)
                int r4 = r4 - r0
                int r0 = java.lang.Math.min(r11, r4)
                int r9 = r9 - r1
                int r1 = java.lang.Math.max(r11, r9)
                int r10 = r10 - r2
                int r10 = java.lang.Math.max(r11, r10)
                int r2 = r7.m678j()
                r6 = 1
                if (r2 != r6) goto L_0x0063
                if (r1 == 0) goto L_0x005e
                goto L_0x006b
            L_0x005e:
                int r1 = java.lang.Math.max(r5, r9)
                goto L_0x006b
            L_0x0063:
                if (r5 == 0) goto L_0x0066
                goto L_0x006a
            L_0x0066:
                int r5 = java.lang.Math.min(r3, r1)
            L_0x006a:
                r1 = r5
            L_0x006b:
                if (r0 == 0) goto L_0x006e
                goto L_0x0072
            L_0x006e:
                int r0 = java.lang.Math.min(r4, r10)
            L_0x0072:
                r8[r11] = r1
                r8[r6] = r0
                return r8
        }

        /* renamed from: d */
        private boolean m698d(androidx.recyclerview.widget.C0813j r7, int r8, int r9) {
                r6 = this;
                android.view.View r7 = r7.getFocusedChild()
                r0 = 0
                if (r7 != 0) goto L_0x0008
                return r0
            L_0x0008:
                int r1 = r6.m670n()
                int r2 = r6.m666p()
                int r3 = r6.m665q()
                int r4 = r6.m668o()
                int r3 = r3 - r4
                int r4 = r6.m682h()
                int r5 = r6.m672m()
                int r4 = r4 - r5
                androidx.recyclerview.widget.j r5 = r6.f3211b
                android.graphics.Rect r5 = r5.f3116i
                r6.m724b(r7, r5)
                int r7 = r5.left
                int r7 = r7 - r8
                if (r7 >= r3) goto L_0x0040
                int r7 = r5.right
                int r7 = r7 - r8
                if (r7 <= r1) goto L_0x0040
                int r7 = r5.top
                int r7 = r7 - r9
                if (r7 >= r4) goto L_0x0040
                int r7 = r5.bottom
                int r7 = r7 - r9
                if (r7 > r2) goto L_0x003e
                goto L_0x0040
            L_0x003e:
                r7 = 1
                return r7
            L_0x0040:
                return r0
        }

        /* renamed from: A */
        boolean mo791A() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* renamed from: B */
        void m790B() {
                r1 = this;
                androidx.recyclerview.widget.j$z r0 = r1.f3216g
                if (r0 == 0) goto L_0x0007
                r0.m582d()
            L_0x0007:
                return
        }

        /* renamed from: C */
        public boolean mo789C() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* renamed from: a */
        public int mo778a(int r1, androidx.recyclerview.widget.C0813j.C0847v r2, androidx.recyclerview.widget.C0813j.C0815a0 r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: a */
        public int mo756a(androidx.recyclerview.widget.C0813j.C0815a0 r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: a */
        public int mo751a(androidx.recyclerview.widget.C0813j.C0847v r1, androidx.recyclerview.widget.C0813j.C0815a0 r2) {
                r0 = this;
                androidx.recyclerview.widget.j r1 = r0.f3211b
                r2 = 1
                if (r1 == 0) goto L_0x0018
                androidx.recyclerview.widget.j$g r1 = r1.f3122l
                if (r1 != 0) goto L_0x000a
                goto L_0x0018
            L_0x000a:
                boolean r1 = r0.mo788a()
                if (r1 == 0) goto L_0x0018
                androidx.recyclerview.widget.j r1 = r0.f3211b
                androidx.recyclerview.widget.j$g r1 = r1.f3122l
                int r2 = r1.mo106a()
            L_0x0018:
                return r2
        }

        /* renamed from: a */
        public android.view.View mo765a(android.view.View r1, int r2, androidx.recyclerview.widget.C0813j.C0847v r3, androidx.recyclerview.widget.C0813j.C0815a0 r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: a */
        public androidx.recyclerview.widget.C0813j.C0840p mo776a(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                androidx.recyclerview.widget.j$p r0 = new androidx.recyclerview.widget.j$p
                r0.<init>(r2, r3)
                return r0
        }

        /* renamed from: a */
        public androidx.recyclerview.widget.C0813j.C0840p mo758a(android.view.ViewGroup.LayoutParams r2) {
                r1 = this;
                boolean r0 = r2 instanceof androidx.recyclerview.widget.C0813j.C0840p
                if (r0 == 0) goto L_0x000c
                androidx.recyclerview.widget.j$p r0 = new androidx.recyclerview.widget.j$p
                androidx.recyclerview.widget.j$p r2 = (androidx.recyclerview.widget.C0813j.C0840p) r2
                r0.<init>(r2)
                return r0
            L_0x000c:
                boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
                if (r0 == 0) goto L_0x0018
                androidx.recyclerview.widget.j$p r0 = new androidx.recyclerview.widget.j$p
                android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
                r0.<init>(r2)
                return r0
            L_0x0018:
                androidx.recyclerview.widget.j$p r0 = new androidx.recyclerview.widget.j$p
                r0.<init>(r2)
                return r0
        }

        /* renamed from: a */
        public void m787a(int r2) {
                r1 = this;
                android.view.View r0 = r1.m715c(r2)
                r1.m781a(r2, r0)
                return
        }

        /* renamed from: a */
        public void m786a(int r3, int r4) {
                r2 = this;
                android.view.View r0 = r2.m715c(r3)
                if (r0 == 0) goto L_0x000d
                r2.m787a(r3)
                r2.m712c(r0, r4)
                return
            L_0x000d:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot move a child from non-existing index:"
                r0.append(r1)
                r0.append(r3)
                androidx.recyclerview.widget.j r3 = r2.f3211b
                java.lang.String r3 = r3.toString()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r4.<init>(r3)
                throw r4
        }

        /* renamed from: a */
        public void mo783a(int r1, int r2, androidx.recyclerview.widget.C0813j.C0815a0 r3, androidx.recyclerview.widget.C0813j.AbstractC0835o.AbstractC0838c r4) {
                r0 = this;
                return
        }

        /* renamed from: a */
        public void mo780a(int r1, androidx.recyclerview.widget.C0813j.AbstractC0835o.AbstractC0838c r2) {
                r0 = this;
                return
        }

        /* renamed from: a */
        public void m779a(int r2, androidx.recyclerview.widget.C0813j.C0847v r3) {
                r1 = this;
                android.view.View r0 = r1.m715c(r2)
                r1.m685g(r2)
                r3.m611b(r0)
                return
        }

        /* renamed from: a */
        void m777a(p000a.p018g.p029l.p030a0.C0191c r3) {
                r2 = this;
                androidx.recyclerview.widget.j r0 = r2.f3211b
                androidx.recyclerview.widget.j$v r1 = r0.f3104c
                androidx.recyclerview.widget.j$a0 r0 = r0.f3115h0
                r2.m748a(r1, r0, r3)
                return
        }

        /* renamed from: a */
        public void mo774a(android.graphics.Rect r3, int r4, int r5) {
                r2 = this;
                int r0 = r3.width()
                int r1 = r2.m670n()
                int r0 = r0 + r1
                int r1 = r2.m668o()
                int r0 = r0 + r1
                int r3 = r3.height()
                int r1 = r2.m666p()
                int r3 = r3 + r1
                int r1 = r2.m672m()
                int r3 = r3 + r1
                int r1 = r2.m674l()
                int r4 = m785a(r4, r0, r1)
                int r0 = r2.m676k()
                int r3 = m785a(r5, r3, r0)
                r2.m714c(r4, r3)
                return
        }

        /* renamed from: a */
        public void mo773a(android.os.Parcelable r1) {
                r0 = this;
                return
        }

        /* renamed from: a */
        public void m772a(android.view.View r2) {
                r1 = this;
                r0 = -1
                r1.m771a(r2, r0)
                return
        }

        /* renamed from: a */
        public void m771a(android.view.View r2, int r3) {
                r1 = this;
                r0 = 1
                r1.m764a(r2, r3, r0)
                return
        }

        /* renamed from: a */
        public void m770a(android.view.View r6, int r7, int r8) {
                r5 = this;
                android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
                androidx.recyclerview.widget.j$p r0 = (androidx.recyclerview.widget.C0813j.C0840p) r0
                androidx.recyclerview.widget.j r1 = r5.f3211b
                android.graphics.Rect r1 = r1.m940f(r6)
                int r2 = r1.left
                int r3 = r1.right
                int r2 = r2 + r3
                int r7 = r7 + r2
                int r2 = r1.top
                int r1 = r1.bottom
                int r2 = r2 + r1
                int r8 = r8 + r2
                int r1 = r5.m665q()
                int r2 = r5.m664r()
                int r3 = r5.m670n()
                int r4 = r5.m668o()
                int r3 = r3 + r4
                int r4 = r0.leftMargin
                int r3 = r3 + r4
                int r4 = r0.rightMargin
                int r3 = r3 + r4
                int r3 = r3 + r7
                int r7 = r0.width
                boolean r4 = r5.mo788a()
                int r7 = m784a(r1, r2, r3, r7, r4)
                int r1 = r5.m682h()
                int r2 = r5.m680i()
                int r3 = r5.m666p()
                int r4 = r5.m672m()
                int r3 = r3 + r4
                int r4 = r0.topMargin
                int r3 = r3 + r4
                int r4 = r0.bottomMargin
                int r3 = r3 + r4
                int r3 = r3 + r8
                int r8 = r0.height
                boolean r4 = r5.mo732b()
                int r8 = m784a(r1, r2, r3, r8, r4)
                boolean r0 = r5.m768a(r6, r7, r8, r0)
                if (r0 == 0) goto L_0x0065
                r6.measure(r7, r8)
            L_0x0065:
                return
        }

        /* renamed from: a */
        public void m769a(android.view.View r4, int r5, int r6, int r7, int r8) {
                r3 = this;
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                androidx.recyclerview.widget.j$p r0 = (androidx.recyclerview.widget.C0813j.C0840p) r0
                android.graphics.Rect r1 = r0.f3235b
                int r2 = r1.left
                int r5 = r5 + r2
                int r2 = r0.leftMargin
                int r5 = r5 + r2
                int r2 = r1.top
                int r6 = r6 + r2
                int r2 = r0.topMargin
                int r6 = r6 + r2
                int r2 = r1.right
                int r7 = r7 - r2
                int r2 = r0.rightMargin
                int r7 = r7 - r2
                int r1 = r1.bottom
                int r8 = r8 - r1
                int r0 = r0.bottomMargin
                int r8 = r8 - r0
                r4.layout(r5, r6, r7, r8)
                return
        }

        /* renamed from: a */
        public void m766a(android.view.View r3, int r4, androidx.recyclerview.widget.C0813j.C0840p r5) {
                r2 = this;
                androidx.recyclerview.widget.j$d0 r0 = androidx.recyclerview.widget.C0813j.m924k(r3)
                boolean r1 = r0.m864p()
                if (r1 == 0) goto L_0x0012
                androidx.recyclerview.widget.j r1 = r2.f3211b
                androidx.recyclerview.widget.o r1 = r1.f3112g
                r1.m535a(r0)
                goto L_0x0019
            L_0x0012:
                androidx.recyclerview.widget.j r1 = r2.f3211b
                androidx.recyclerview.widget.o r1 = r1.f3112g
                r1.m523g(r0)
            L_0x0019:
                androidx.recyclerview.widget.b r1 = r2.f3210a
                boolean r0 = r0.m864p()
                r1.m1127a(r3, r4, r5, r0)
                return
        }

        /* renamed from: a */
        void m763a(android.view.View r3, p000a.p018g.p029l.p030a0.C0191c r4) {
                r2 = this;
                androidx.recyclerview.widget.j$d0 r0 = androidx.recyclerview.widget.C0813j.m924k(r3)
                if (r0 == 0) goto L_0x001f
                boolean r1 = r0.m864p()
                if (r1 != 0) goto L_0x001f
                androidx.recyclerview.widget.b r1 = r2.f3210a
                android.view.View r0 = r0.f3179a
                boolean r0 = r1.m1119c(r0)
                if (r0 != 0) goto L_0x001f
                androidx.recyclerview.widget.j r0 = r2.f3211b
                androidx.recyclerview.widget.j$v r1 = r0.f3104c
                androidx.recyclerview.widget.j$a0 r0 = r0.f3115h0
                r2.mo746a(r1, r0, r3, r4)
            L_0x001f:
                return
        }

        /* renamed from: a */
        public void m762a(android.view.View r2, android.graphics.Rect r3) {
                r1 = this;
                androidx.recyclerview.widget.j r0 = r1.f3211b
                if (r0 != 0) goto L_0x0009
                r2 = 0
                r3.set(r2, r2, r2, r2)
                return
            L_0x0009:
                android.graphics.Rect r2 = r0.m940f(r2)
                r3.set(r2)
                return
        }

        /* renamed from: a */
        public void m761a(android.view.View r1, androidx.recyclerview.widget.C0813j.C0847v r2) {
                r0 = this;
                r0.m667o(r1)
                r2.m611b(r1)
                return
        }

        /* renamed from: a */
        public void m760a(android.view.View r6, boolean r7, android.graphics.Rect r8) {
                r5 = this;
                if (r7 == 0) goto L_0x0022
                android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
                androidx.recyclerview.widget.j$p r7 = (androidx.recyclerview.widget.C0813j.C0840p) r7
                android.graphics.Rect r7 = r7.f3235b
                int r0 = r7.left
                int r0 = -r0
                int r1 = r7.top
                int r1 = -r1
                int r2 = r6.getWidth()
                int r3 = r7.right
                int r2 = r2 + r3
                int r3 = r6.getHeight()
                int r7 = r7.bottom
                int r3 = r3 + r7
                r8.set(r0, r1, r2, r3)
                goto L_0x002e
            L_0x0022:
                int r7 = r6.getWidth()
                int r0 = r6.getHeight()
                r1 = 0
                r8.set(r1, r1, r7, r0)
            L_0x002e:
                androidx.recyclerview.widget.j r7 = r5.f3211b
                if (r7 == 0) goto L_0x006b
                android.graphics.Matrix r7 = r6.getMatrix()
                if (r7 == 0) goto L_0x006b
                boolean r0 = r7.isIdentity()
                if (r0 != 0) goto L_0x006b
                androidx.recyclerview.widget.j r0 = r5.f3211b
                android.graphics.RectF r0 = r0.f3120k
                r0.set(r8)
                r7.mapRect(r0)
                float r7 = r0.left
                double r1 = (double) r7
                double r1 = java.lang.Math.floor(r1)
                int r7 = (int) r1
                float r1 = r0.top
                double r1 = (double) r1
                double r1 = java.lang.Math.floor(r1)
                int r1 = (int) r1
                float r2 = r0.right
                double r2 = (double) r2
                double r2 = java.lang.Math.ceil(r2)
                int r2 = (int) r2
                float r0 = r0.bottom
                double r3 = (double) r0
                double r3 = java.lang.Math.ceil(r3)
                int r0 = (int) r3
                r8.set(r7, r1, r2, r0)
            L_0x006b:
                int r7 = r6.getLeft()
                int r6 = r6.getTop()
                r8.offset(r7, r6)
                return
        }

        /* renamed from: a */
        public void mo757a(android.view.accessibility.AccessibilityEvent r3) {
                r2 = this;
                androidx.recyclerview.widget.j r0 = r2.f3211b
                androidx.recyclerview.widget.j$v r1 = r0.f3104c
                androidx.recyclerview.widget.j$a0 r0 = r0.f3115h0
                r2.m745a(r1, r0, r3)
                return
        }

        /* renamed from: a */
        public void m755a(androidx.recyclerview.widget.C0813j.AbstractC0824g r1, androidx.recyclerview.widget.C0813j.AbstractC0824g r2) {
                r0 = this;
                return
        }

        /* renamed from: a */
        public void m753a(androidx.recyclerview.widget.C0813j.C0847v r3) {
                r2 = this;
                int r0 = r2.m697e()
                int r0 = r0 + (-1)
            L_0x0006:
                if (r0 < 0) goto L_0x0012
                android.view.View r1 = r2.m715c(r0)
                r2.m752a(r3, r0, r1)
                int r0 = r0 + (-1)
                goto L_0x0006
            L_0x0012:
                return
        }

        /* renamed from: a */
        public void m750a(androidx.recyclerview.widget.C0813j.C0847v r1, androidx.recyclerview.widget.C0813j.C0815a0 r2, int r3, int r4) {
                r0 = this;
                androidx.recyclerview.widget.j r1 = r0.f3211b
                r1.m958c(r3, r4)
                return
        }

        /* renamed from: a */
        public void m748a(androidx.recyclerview.widget.C0813j.C0847v r4, androidx.recyclerview.widget.C0813j.C0815a0 r5, p000a.p018g.p029l.p030a0.C0191c r6) {
                r3 = this;
                androidx.recyclerview.widget.j r0 = r3.f3211b
                r1 = -1
                boolean r0 = r0.canScrollVertically(r1)
                r2 = 1
                if (r0 != 0) goto L_0x0012
                androidx.recyclerview.widget.j r0 = r3.f3211b
                boolean r0 = r0.canScrollHorizontally(r1)
                if (r0 == 0) goto L_0x001a
            L_0x0012:
                r0 = 8192(0x2000, float:1.14794E-41)
                r6.m3544a(r0)
                r6.m3511i(r2)
            L_0x001a:
                androidx.recyclerview.widget.j r0 = r3.f3211b
                boolean r0 = r0.canScrollVertically(r2)
                if (r0 != 0) goto L_0x002a
                androidx.recyclerview.widget.j r0 = r3.f3211b
                boolean r0 = r0.canScrollHorizontally(r2)
                if (r0 == 0) goto L_0x0032
            L_0x002a:
                r0 = 4096(0x1000, float:5.74E-42)
                r6.m3544a(r0)
                r6.m3511i(r2)
            L_0x0032:
                int r0 = r3.mo721b(r4, r5)
                int r1 = r3.mo751a(r4, r5)
                boolean r2 = r3.m700d(r4, r5)
                int r4 = r3.m709c(r4, r5)
                a.g.l.a0.c$b r4 = p000a.p018g.p029l.p030a0.C0191c.C0193b.m3497a(r0, r1, r2, r4)
                r6.m3537a(r4)
                return
        }

        /* renamed from: a */
        public void mo746a(androidx.recyclerview.widget.C0813j.C0847v r7, androidx.recyclerview.widget.C0813j.C0815a0 r8, android.view.View r9, p000a.p018g.p029l.p030a0.C0191c r10) {
                r6 = this;
                boolean r7 = r6.mo732b()
                r8 = 0
                if (r7 == 0) goto L_0x000d
                int r7 = r6.m673l(r9)
                r0 = r7
                goto L_0x000e
            L_0x000d:
                r0 = 0
            L_0x000e:
                boolean r7 = r6.mo788a()
                if (r7 == 0) goto L_0x001a
                int r8 = r6.m673l(r9)
                r2 = r8
                goto L_0x001b
            L_0x001a:
                r2 = 0
            L_0x001b:
                r1 = 1
                r3 = 1
                r4 = 0
                r5 = 0
                a.g.l.a0.c$c r7 = p000a.p018g.p029l.p030a0.C0191c.C0194c.m3496a(r0, r1, r2, r3, r4, r5)
                r10.m3530b(r7)
                return
        }

        /* renamed from: a */
        public void m745a(androidx.recyclerview.widget.C0813j.C0847v r2, androidx.recyclerview.widget.C0813j.C0815a0 r3, android.view.accessibility.AccessibilityEvent r4) {
                r1 = this;
                androidx.recyclerview.widget.j r2 = r1.f3211b
                if (r2 == 0) goto L_0x0039
                if (r4 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0007:
                r3 = 1
                boolean r2 = r2.canScrollVertically(r3)
                if (r2 != 0) goto L_0x0029
                androidx.recyclerview.widget.j r2 = r1.f3211b
                r0 = -1
                boolean r2 = r2.canScrollVertically(r0)
                if (r2 != 0) goto L_0x0029
                androidx.recyclerview.widget.j r2 = r1.f3211b
                boolean r2 = r2.canScrollHorizontally(r0)
                if (r2 != 0) goto L_0x0029
                androidx.recyclerview.widget.j r2 = r1.f3211b
                boolean r2 = r2.canScrollHorizontally(r3)
                if (r2 == 0) goto L_0x0028
                goto L_0x0029
            L_0x0028:
                r3 = 0
            L_0x0029:
                r4.setScrollable(r3)
                androidx.recyclerview.widget.j r2 = r1.f3211b
                androidx.recyclerview.widget.j$g r2 = r2.f3122l
                if (r2 == 0) goto L_0x0039
                int r2 = r2.mo106a()
                r4.setItemCount(r2)
            L_0x0039:
                return
        }

        /* renamed from: a */
        void m744a(androidx.recyclerview.widget.C0813j r2) {
                r1 = this;
                r0 = 1
                r1.f3218i = r0
                r1.m720b(r2)
                return
        }

        /* renamed from: a */
        public void mo743a(androidx.recyclerview.widget.C0813j r1, int r2, int r3) {
                r0 = this;
                return
        }

        /* renamed from: a */
        public void mo742a(androidx.recyclerview.widget.C0813j r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }

        /* renamed from: a */
        public void mo741a(androidx.recyclerview.widget.C0813j r1, int r2, int r3, java.lang.Object r4) {
                r0 = this;
                r0.m707c(r1, r2, r3)
                return
        }

        /* renamed from: a */
        void m736a(androidx.recyclerview.widget.C0813j r2, androidx.recyclerview.widget.C0813j.C0847v r3) {
                r1 = this;
                r0 = 0
                r1.f3218i = r0
                r1.mo717b(r2, r3)
                return
        }

        /* renamed from: a */
        public void mo733a(java.lang.String r2) {
                r1 = this;
                androidx.recyclerview.widget.j r0 = r1.f3211b
                if (r0 == 0) goto L_0x0007
                r0.m974a(r2)
            L_0x0007:
                return
        }

        /* renamed from: a */
        public boolean mo788a() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* renamed from: a */
        boolean m782a(int r3, android.os.Bundle r4) {
                r2 = this;
                androidx.recyclerview.widget.j r0 = r2.f3211b
                androidx.recyclerview.widget.j$v r1 = r0.f3104c
                androidx.recyclerview.widget.j$a0 r0 = r0.f3115h0
                boolean r3 = r2.m749a(r1, r0, r3, r4)
                return r3
        }

        /* renamed from: a */
        boolean m768a(android.view.View r3, int r4, int r5, androidx.recyclerview.widget.C0813j.C0840p r6) {
                r2 = this;
                boolean r0 = r3.isLayoutRequested()
                if (r0 != 0) goto L_0x0025
                boolean r0 = r2.f3220k
                if (r0 == 0) goto L_0x0025
                int r0 = r3.getWidth()
                int r1 = r6.width
                boolean r4 = m729b(r0, r4, r1)
                if (r4 == 0) goto L_0x0025
                int r3 = r3.getHeight()
                int r4 = r6.height
                boolean r3 = m729b(r3, r5, r4)
                if (r3 != 0) goto L_0x0023
                goto L_0x0025
            L_0x0023:
                r3 = 0
                goto L_0x0026
            L_0x0025:
                r3 = 1
            L_0x0026:
                return r3
        }

        /* renamed from: a */
        boolean m767a(android.view.View r8, int r9, android.os.Bundle r10) {
                r7 = this;
                androidx.recyclerview.widget.j r0 = r7.f3211b
                androidx.recyclerview.widget.j$v r2 = r0.f3104c
                androidx.recyclerview.widget.j$a0 r3 = r0.f3115h0
                r1 = r7
                r4 = r8
                r5 = r9
                r6 = r10
                boolean r8 = r1.m747a(r2, r3, r4, r5, r6)
                return r8
        }

        /* renamed from: a */
        public boolean m759a(android.view.View r3, boolean r4, boolean r5) {
                r2 = this;
                androidx.recyclerview.widget.n r5 = r2.f3214e
                r0 = 24579(0x6003, float:3.4443E-41)
                boolean r5 = r5.m549a(r3, r0)
                r1 = 1
                if (r5 == 0) goto L_0x0015
                androidx.recyclerview.widget.n r5 = r2.f3215f
                boolean r3 = r5.m549a(r3, r0)
                if (r3 == 0) goto L_0x0015
                r3 = 1
                goto L_0x0016
            L_0x0015:
                r3 = 0
            L_0x0016:
                if (r4 == 0) goto L_0x0019
                return r3
            L_0x0019:
                r3 = r3 ^ r1
                return r3
        }

        /* renamed from: a */
        public boolean mo754a(androidx.recyclerview.widget.C0813j.C0840p r1) {
                r0 = this;
                if (r1 == 0) goto L_0x0004
                r1 = 1
                goto L_0x0005
            L_0x0004:
                r1 = 0
            L_0x0005:
                return r1
        }

        /* renamed from: a */
        public boolean m749a(androidx.recyclerview.widget.C0813j.C0847v r2, androidx.recyclerview.widget.C0813j.C0815a0 r3, int r4, android.os.Bundle r5) {
                r1 = this;
                androidx.recyclerview.widget.j r2 = r1.f3211b
                r3 = 0
                if (r2 != 0) goto L_0x0006
                return r3
            L_0x0006:
                r5 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r4 == r5) goto L_0x0042
                r5 = 8192(0x2000, float:1.14794E-41)
                if (r4 == r5) goto L_0x0012
                r2 = 0
            L_0x0010:
                r4 = 0
                goto L_0x006e
            L_0x0012:
                r4 = -1
                boolean r2 = r2.canScrollVertically(r4)
                if (r2 == 0) goto L_0x0029
                int r2 = r1.m682h()
                int r5 = r1.m666p()
                int r2 = r2 - r5
                int r5 = r1.m672m()
                int r2 = r2 - r5
                int r2 = -r2
                goto L_0x002a
            L_0x0029:
                r2 = 0
            L_0x002a:
                androidx.recyclerview.widget.j r5 = r1.f3211b
                boolean r4 = r5.canScrollHorizontally(r4)
                if (r4 == 0) goto L_0x0010
                int r4 = r1.m665q()
                int r5 = r1.m670n()
                int r4 = r4 - r5
                int r5 = r1.m668o()
                int r4 = r4 - r5
                int r4 = -r4
                goto L_0x006e
            L_0x0042:
                boolean r2 = r2.canScrollVertically(r0)
                if (r2 == 0) goto L_0x0057
                int r2 = r1.m682h()
                int r4 = r1.m666p()
                int r2 = r2 - r4
                int r4 = r1.m672m()
                int r2 = r2 - r4
                goto L_0x0058
            L_0x0057:
                r2 = 0
            L_0x0058:
                androidx.recyclerview.widget.j r4 = r1.f3211b
                boolean r4 = r4.canScrollHorizontally(r0)
                if (r4 == 0) goto L_0x0010
                int r4 = r1.m665q()
                int r5 = r1.m670n()
                int r4 = r4 - r5
                int r5 = r1.m668o()
                int r4 = r4 - r5
            L_0x006e:
                if (r2 != 0) goto L_0x0073
                if (r4 != 0) goto L_0x0073
                return r3
            L_0x0073:
                androidx.recyclerview.widget.j r3 = r1.f3211b
                r3.m931i(r4, r2)
                return r0
        }

        /* renamed from: a */
        public boolean m747a(androidx.recyclerview.widget.C0813j.C0847v r1, androidx.recyclerview.widget.C0813j.C0815a0 r2, android.view.View r3, int r4, android.os.Bundle r5) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: a */
        public boolean m740a(androidx.recyclerview.widget.C0813j r7, android.view.View r8, android.graphics.Rect r9, boolean r10) {
                r6 = this;
                r5 = 0
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                boolean r7 = r0.m739a(r1, r2, r3, r4, r5)
                return r7
        }

        /* renamed from: a */
        public boolean m739a(androidx.recyclerview.widget.C0813j r3, android.view.View r4, android.graphics.Rect r5, boolean r6, boolean r7) {
                r2 = this;
                int[] r4 = r2.m718b(r3, r4, r5, r6)
                r5 = 0
                r0 = r4[r5]
                r1 = 1
                r4 = r4[r1]
                if (r7 == 0) goto L_0x0012
                boolean r7 = r2.m698d(r3, r0, r4)
                if (r7 == 0) goto L_0x0017
            L_0x0012:
                if (r0 != 0) goto L_0x0018
                if (r4 == 0) goto L_0x0017
                goto L_0x0018
            L_0x0017:
                return r5
            L_0x0018:
                if (r6 == 0) goto L_0x001e
                r3.scrollBy(r0, r4)
                goto L_0x0021
            L_0x001e:
                r3.m931i(r0, r4)
            L_0x0021:
                return r1
        }

        @java.lang.Deprecated
        /* renamed from: a */
        public boolean m738a(androidx.recyclerview.widget.C0813j r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                boolean r2 = r0.m659w()
                if (r2 != 0) goto L_0x000f
                boolean r1 = r1.m920n()
                if (r1 == 0) goto L_0x000d
                goto L_0x000f
            L_0x000d:
                r1 = 0
                goto L_0x0010
            L_0x000f:
                r1 = 1
            L_0x0010:
                return r1
        }

        /* renamed from: a */
        public boolean m737a(androidx.recyclerview.widget.C0813j r1, androidx.recyclerview.widget.C0813j.C0815a0 r2, android.view.View r3, android.view.View r4) {
                r0 = this;
                boolean r1 = r0.m738a(r1, r3, r4)
                return r1
        }

        /* renamed from: a */
        public boolean m735a(androidx.recyclerview.widget.C0813j r1, java.util.ArrayList<android.view.View> r2, int r3, int r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: a */
        public boolean m734a(java.lang.Runnable r2) {
                r1 = this;
                androidx.recyclerview.widget.j r0 = r1.f3211b
                if (r0 == 0) goto L_0x0009
                boolean r2 = r0.removeCallbacks(r2)
                return r2
            L_0x0009:
                r2 = 0
                return r2
        }

        /* renamed from: b */
        public int mo728b(int r1, androidx.recyclerview.widget.C0813j.C0847v r2, androidx.recyclerview.widget.C0813j.C0815a0 r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: b */
        public int mo723b(androidx.recyclerview.widget.C0813j.C0815a0 r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: b */
        public int mo721b(androidx.recyclerview.widget.C0813j.C0847v r1, androidx.recyclerview.widget.C0813j.C0815a0 r2) {
                r0 = this;
                androidx.recyclerview.widget.j r1 = r0.f3211b
                r2 = 1
                if (r1 == 0) goto L_0x0018
                androidx.recyclerview.widget.j$g r1 = r1.f3122l
                if (r1 != 0) goto L_0x000a
                goto L_0x0018
            L_0x000a:
                boolean r1 = r0.mo732b()
                if (r1 == 0) goto L_0x0018
                androidx.recyclerview.widget.j r1 = r0.f3211b
                androidx.recyclerview.widget.j$g r1 = r1.f3122l
                int r2 = r1.mo106a()
            L_0x0018:
                return r2
        }

        /* renamed from: b */
        public android.view.View mo731b(int r6) {
                r5 = this;
                int r0 = r5.m697e()
                r1 = 0
            L_0x0005:
                if (r1 >= r0) goto L_0x0032
                android.view.View r2 = r5.m715c(r1)
                androidx.recyclerview.widget.j$d0 r3 = androidx.recyclerview.widget.C0813j.m924k(r2)
                if (r3 != 0) goto L_0x0012
                goto L_0x002f
            L_0x0012:
                int r4 = r3.m871i()
                if (r4 != r6) goto L_0x002f
                boolean r4 = r3.m856x()
                if (r4 != 0) goto L_0x002f
                androidx.recyclerview.widget.j r4 = r5.f3211b
                androidx.recyclerview.widget.j$a0 r4 = r4.f3115h0
                boolean r4 = r4.m902d()
                if (r4 != 0) goto L_0x002e
                boolean r3 = r3.m864p()
                if (r3 != 0) goto L_0x002f
            L_0x002e:
                return r2
            L_0x002f:
                int r1 = r1 + 1
                goto L_0x0005
            L_0x0032:
                r6 = 0
                return r6
        }

        /* renamed from: b */
        void m730b(int r2, int r3) {
                r1 = this;
                int r0 = android.view.View.MeasureSpec.getSize(r2)
                r1.f3226q = r0
                int r2 = android.view.View.MeasureSpec.getMode(r2)
                r1.f3224o = r2
                int r2 = r1.f3224o
                r0 = 0
                if (r2 != 0) goto L_0x0017
                boolean r2 = androidx.recyclerview.widget.C0813j.f3071C0
                if (r2 != 0) goto L_0x0017
                r1.f3226q = r0
            L_0x0017:
                int r2 = android.view.View.MeasureSpec.getSize(r3)
                r1.f3227r = r2
                int r2 = android.view.View.MeasureSpec.getMode(r3)
                r1.f3225p = r2
                int r2 = r1.f3225p
                if (r2 != 0) goto L_0x002d
                boolean r2 = androidx.recyclerview.widget.C0813j.f3071C0
                if (r2 != 0) goto L_0x002d
                r1.f3227r = r0
            L_0x002d:
                return
        }

        /* renamed from: b */
        public void m727b(android.view.View r2) {
                r1 = this;
                r0 = -1
                r1.m726b(r2, r0)
                return
        }

        /* renamed from: b */
        public void m726b(android.view.View r2, int r3) {
                r1 = this;
                r0 = 0
                r1.m764a(r2, r3, r0)
                return
        }

        /* renamed from: b */
        public void m724b(android.view.View r1, android.graphics.Rect r2) {
                r0 = this;
                androidx.recyclerview.widget.C0813j.m993a(r1, r2)
                return
        }

        /* renamed from: b */
        public void m722b(androidx.recyclerview.widget.C0813j.C0847v r3) {
                r2 = this;
                int r0 = r2.m697e()
                int r0 = r0 + (-1)
            L_0x0006:
                if (r0 < 0) goto L_0x001c
                android.view.View r1 = r2.m715c(r0)
                androidx.recyclerview.widget.j$d0 r1 = androidx.recyclerview.widget.C0813j.m924k(r1)
                boolean r1 = r1.m856x()
                if (r1 != 0) goto L_0x0019
                r2.m779a(r0, r3)
            L_0x0019:
                int r0 = r0 + (-1)
                goto L_0x0006
            L_0x001c:
                return
        }

        /* renamed from: b */
        public void m720b(androidx.recyclerview.widget.C0813j r1) {
                r0 = this;
                return
        }

        /* renamed from: b */
        public void mo719b(androidx.recyclerview.widget.C0813j r1, int r2, int r3) {
                r0 = this;
                return
        }

        /* renamed from: b */
        public void mo717b(androidx.recyclerview.widget.C0813j r1, androidx.recyclerview.widget.C0813j.C0847v r2) {
                r0 = this;
                r0.m708c(r1)
                return
        }

        /* renamed from: b */
        public boolean mo732b() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* renamed from: b */
        boolean m725b(android.view.View r3, int r4, int r5, androidx.recyclerview.widget.C0813j.C0840p r6) {
                r2 = this;
                boolean r0 = r2.f3220k
                if (r0 == 0) goto L_0x001f
                int r0 = r3.getMeasuredWidth()
                int r1 = r6.width
                boolean r4 = m729b(r0, r4, r1)
                if (r4 == 0) goto L_0x001f
                int r3 = r3.getMeasuredHeight()
                int r4 = r6.height
                boolean r3 = m729b(r3, r5, r4)
                if (r3 != 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                goto L_0x0020
            L_0x001f:
                r3 = 1
            L_0x0020:
                return r3
        }

        /* renamed from: c */
        public int mo711c(androidx.recyclerview.widget.C0813j.C0815a0 r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: c */
        public int m709c(androidx.recyclerview.widget.C0813j.C0847v r1, androidx.recyclerview.widget.C0813j.C0815a0 r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: c */
        public android.view.View m715c(int r2) {
                r1 = this;
                androidx.recyclerview.widget.b r0 = r1.f3210a
                if (r0 == 0) goto L_0x0009
                android.view.View r2 = r0.m1120c(r2)
                goto L_0x000a
            L_0x0009:
                r2 = 0
            L_0x000a:
                return r2
        }

        /* renamed from: c */
        public android.view.View m713c(android.view.View r3) {
                r2 = this;
                androidx.recyclerview.widget.j r0 = r2.f3211b
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                android.view.View r3 = r0.m956c(r3)
                if (r3 != 0) goto L_0x000d
                return r1
            L_0x000d:
                androidx.recyclerview.widget.b r0 = r2.f3210a
                boolean r0 = r0.m1119c(r3)
                if (r0 == 0) goto L_0x0016
                return r1
            L_0x0016:
                return r3
        }

        /* renamed from: c */
        public abstract androidx.recyclerview.widget.C0813j.C0840p mo716c();

        /* renamed from: c */
        public void m714c(int r2, int r3) {
                r1 = this;
                androidx.recyclerview.widget.j r0 = r1.f3211b
                androidx.recyclerview.widget.C0813j.m976a(r0, r2, r3)
                return
        }

        /* renamed from: c */
        public void m712c(android.view.View r2, int r3) {
                r1 = this;
                android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
                androidx.recyclerview.widget.j$p r0 = (androidx.recyclerview.widget.C0813j.C0840p) r0
                r1.m766a(r2, r3, r0)
                return
        }

        /* renamed from: c */
        void m710c(androidx.recyclerview.widget.C0813j.C0847v r7) {
                r6 = this;
                int r0 = r7.m601e()
                int r1 = r0 + (-1)
            L_0x0006:
                if (r1 < 0) goto L_0x0039
                android.view.View r2 = r7.m608c(r1)
                androidx.recyclerview.widget.j$d0 r3 = androidx.recyclerview.widget.C0813j.m924k(r2)
                boolean r4 = r3.m856x()
                if (r4 == 0) goto L_0x0017
                goto L_0x0036
            L_0x0017:
                r4 = 0
                r3.m881a(r4)
                boolean r5 = r3.m862r()
                if (r5 == 0) goto L_0x0026
                androidx.recyclerview.widget.j r5 = r6.f3211b
                r5.removeDetachedView(r2, r4)
            L_0x0026:
                androidx.recyclerview.widget.j r4 = r6.f3211b
                androidx.recyclerview.widget.j$l r4 = r4.f3090M
                if (r4 == 0) goto L_0x002f
                r4.mo810c(r3)
            L_0x002f:
                r4 = 1
                r3.m881a(r4)
                r7.m623a(r2)
            L_0x0036:
                int r1 = r1 + (-1)
                goto L_0x0006
            L_0x0039:
                r7.m609c()
                if (r0 <= 0) goto L_0x0043
                androidx.recyclerview.widget.j r7 = r6.f3211b
                r7.invalidate()
            L_0x0043:
                return
        }

        @java.lang.Deprecated
        /* renamed from: c */
        public void m708c(androidx.recyclerview.widget.C0813j r1) {
                r0 = this;
                return
        }

        /* renamed from: c */
        public void m707c(androidx.recyclerview.widget.C0813j r1, int r2, int r3) {
                r0 = this;
                return
        }

        /* renamed from: d */
        public int m706d() {
                r1 = this;
                r0 = -1
                return r0
        }

        /* renamed from: d */
        public int m703d(android.view.View r1) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.recyclerview.widget.j$p r1 = (androidx.recyclerview.widget.C0813j.C0840p) r1
                android.graphics.Rect r1 = r1.f3235b
                int r1 = r1.bottom
                return r1
        }

        /* renamed from: d */
        public int mo701d(androidx.recyclerview.widget.C0813j.C0815a0 r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: d */
        public android.view.View m702d(android.view.View r1, int r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: d */
        public void mo705d(int r2) {
                r1 = this;
                androidx.recyclerview.widget.j r0 = r1.f3211b
                if (r0 == 0) goto L_0x0007
                r0.m947e(r2)
            L_0x0007:
                return
        }

        /* renamed from: d */
        void m704d(int r9, int r10) {
                r8 = this;
                int r0 = r8.m697e()
                if (r0 != 0) goto L_0x000c
                androidx.recyclerview.widget.j r0 = r8.f3211b
                r0.m958c(r9, r10)
                return
            L_0x000c:
                r1 = 0
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 2147483647(0x7fffffff, float:NaN)
                r2 = 2147483647(0x7fffffff, float:NaN)
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
            L_0x0019:
                if (r1 >= r0) goto L_0x003d
                android.view.View r6 = r8.m715c(r1)
                androidx.recyclerview.widget.j r7 = r8.f3211b
                android.graphics.Rect r7 = r7.f3116i
                r8.m724b(r6, r7)
                int r6 = r7.left
                if (r6 >= r3) goto L_0x002b
                r3 = r6
            L_0x002b:
                int r6 = r7.right
                if (r6 <= r4) goto L_0x0030
                r4 = r6
            L_0x0030:
                int r6 = r7.top
                if (r6 >= r2) goto L_0x0035
                r2 = r6
            L_0x0035:
                int r6 = r7.bottom
                if (r6 <= r5) goto L_0x003a
                r5 = r6
            L_0x003a:
                int r1 = r1 + 1
                goto L_0x0019
            L_0x003d:
                androidx.recyclerview.widget.j r0 = r8.f3211b
                android.graphics.Rect r0 = r0.f3116i
                r0.set(r3, r2, r4, r5)
                androidx.recyclerview.widget.j r0 = r8.f3211b
                android.graphics.Rect r0 = r0.f3116i
                r8.mo774a(r0, r9, r10)
                return
        }

        /* renamed from: d */
        public void mo699d(androidx.recyclerview.widget.C0813j r1) {
                r0 = this;
                return
        }

        /* renamed from: d */
        public boolean m700d(androidx.recyclerview.widget.C0813j.C0847v r1, androidx.recyclerview.widget.C0813j.C0815a0 r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: e */
        public int m697e() {
                r1 = this;
                androidx.recyclerview.widget.b r0 = r1.f3210a
                if (r0 == 0) goto L_0x0009
                int r0 = r0.m1130a()
                goto L_0x000a
            L_0x0009:
                r0 = 0
            L_0x000a:
                return r0
        }

        /* renamed from: e */
        public int m695e(android.view.View r2) {
                r1 = this;
                int r0 = r2.getBottom()
                int r2 = r1.m703d(r2)
                int r0 = r0 + r2
                return r0
        }

        /* renamed from: e */
        public int mo694e(androidx.recyclerview.widget.C0813j.C0815a0 r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: e */
        public void mo696e(int r2) {
                r1 = this;
                androidx.recyclerview.widget.j r0 = r1.f3211b
                if (r0 == 0) goto L_0x0007
                r0.m942f(r2)
            L_0x0007:
                return
        }

        /* renamed from: e */
        public void mo693e(androidx.recyclerview.widget.C0813j.C0847v r1, androidx.recyclerview.widget.C0813j.C0815a0 r2) {
                r0 = this;
                java.lang.String r1 = "RecyclerView"
                java.lang.String r2 = "You must override onLayoutChildren(Recycler recycler, State state) "
                android.util.Log.e(r1, r2)
                return
        }

        /* renamed from: e */
        void m692e(androidx.recyclerview.widget.C0813j r3) {
                r2 = this;
                int r0 = r3.getWidth()
                r1 = 1073741824(0x40000000, float:2.0)
                int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
                int r3 = r3.getHeight()
                int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
                r2.m730b(r0, r3)
                return
        }

        /* renamed from: f */
        public int m689f(android.view.View r2) {
                r1 = this;
                int r0 = r2.getLeft()
                int r2 = r1.m675k(r2)
                int r0 = r0 - r2
                return r0
        }

        /* renamed from: f */
        public int mo688f(androidx.recyclerview.widget.C0813j.C0815a0 r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: f */
        public void mo690f(int r1) {
                r0 = this;
                return
        }

        /* renamed from: f */
        void m687f(androidx.recyclerview.widget.C0813j r2) {
                r1 = this;
                if (r2 != 0) goto L_0x000b
                r2 = 0
                r1.f3211b = r2
                r1.f3210a = r2
                r2 = 0
                r1.f3226q = r2
                goto L_0x001b
            L_0x000b:
                r1.f3211b = r2
                androidx.recyclerview.widget.b r0 = r2.f3110f
                r1.f3210a = r0
                int r0 = r2.getWidth()
                r1.f3226q = r0
                int r2 = r2.getHeight()
            L_0x001b:
                r1.f3227r = r2
                r2 = 1073741824(0x40000000, float:2.0)
                r1.f3224o = r2
                r1.f3225p = r2
                return
        }

        /* renamed from: f */
        public boolean m691f() {
                r1 = this;
                androidx.recyclerview.widget.j r0 = r1.f3211b
                if (r0 == 0) goto L_0x000a
                boolean r0 = r0.f3114h
                if (r0 == 0) goto L_0x000a
                r0 = 1
                goto L_0x000b
            L_0x000a:
                r0 = 0
            L_0x000b:
                return r0
        }

        /* renamed from: g */
        public int m684g(android.view.View r3) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.j$p r0 = (androidx.recyclerview.widget.C0813j.C0840p) r0
                android.graphics.Rect r0 = r0.f3235b
                int r3 = r3.getMeasuredHeight()
                int r1 = r0.top
                int r3 = r3 + r1
                int r0 = r0.bottom
                int r3 = r3 + r0
                return r3
        }

        /* renamed from: g */
        public android.view.View m686g() {
                r3 = this;
                androidx.recyclerview.widget.j r0 = r3.f3211b
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                android.view.View r0 = r0.getFocusedChild()
                if (r0 == 0) goto L_0x0016
                androidx.recyclerview.widget.b r2 = r3.f3210a
                boolean r2 = r2.m1119c(r0)
                if (r2 == 0) goto L_0x0015
                goto L_0x0016
            L_0x0015:
                return r0
            L_0x0016:
                return r1
        }

        /* renamed from: g */
        public void m685g(int r2) {
                r1 = this;
                android.view.View r0 = r1.m715c(r2)
                if (r0 == 0) goto L_0x000b
                androidx.recyclerview.widget.b r0 = r1.f3210a
                r0.m1116e(r2)
            L_0x000b:
                return
        }

        /* renamed from: g */
        public void mo683g(androidx.recyclerview.widget.C0813j.C0815a0 r1) {
                r0 = this;
                return
        }

        /* renamed from: h */
        public int m682h() {
                r1 = this;
                int r0 = r1.f3227r
                return r0
        }

        /* renamed from: h */
        public int m681h(android.view.View r3) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.j$p r0 = (androidx.recyclerview.widget.C0813j.C0840p) r0
                android.graphics.Rect r0 = r0.f3235b
                int r3 = r3.getMeasuredWidth()
                int r1 = r0.left
                int r3 = r3 + r1
                int r0 = r0.right
                int r3 = r3 + r0
                return r3
        }

        /* renamed from: i */
        public int m680i() {
                r1 = this;
                int r0 = r1.f3225p
                return r0
        }

        /* renamed from: i */
        public int m679i(android.view.View r2) {
                r1 = this;
                int r0 = r2.getRight()
                int r2 = r1.m671m(r2)
                int r0 = r0 + r2
                return r0
        }

        /* renamed from: j */
        public int m678j() {
                r1 = this;
                androidx.recyclerview.widget.j r0 = r1.f3211b
                int r0 = p000a.p018g.p029l.C0216r.m3411j(r0)
                return r0
        }

        /* renamed from: j */
        public int m677j(android.view.View r2) {
                r1 = this;
                int r0 = r2.getTop()
                int r2 = r1.m669n(r2)
                int r0 = r0 - r2
                return r0
        }

        /* renamed from: k */
        public int m676k() {
                r1 = this;
                androidx.recyclerview.widget.j r0 = r1.f3211b
                int r0 = p000a.p018g.p029l.C0216r.m3410k(r0)
                return r0
        }

        /* renamed from: k */
        public int m675k(android.view.View r1) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.recyclerview.widget.j$p r1 = (androidx.recyclerview.widget.C0813j.C0840p) r1
                android.graphics.Rect r1 = r1.f3235b
                int r1 = r1.left
                return r1
        }

        /* renamed from: l */
        public int m674l() {
                r1 = this;
                androidx.recyclerview.widget.j r0 = r1.f3211b
                int r0 = p000a.p018g.p029l.C0216r.m3409l(r0)
                return r0
        }

        /* renamed from: l */
        public int m673l(android.view.View r1) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.recyclerview.widget.j$p r1 = (androidx.recyclerview.widget.C0813j.C0840p) r1
                int r1 = r1.m654a()
                return r1
        }

        /* renamed from: m */
        public int m672m() {
                r1 = this;
                androidx.recyclerview.widget.j r0 = r1.f3211b
                if (r0 == 0) goto L_0x0009
                int r0 = r0.getPaddingBottom()
                goto L_0x000a
            L_0x0009:
                r0 = 0
            L_0x000a:
                return r0
        }

        /* renamed from: m */
        public int m671m(android.view.View r1) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.recyclerview.widget.j$p r1 = (androidx.recyclerview.widget.C0813j.C0840p) r1
                android.graphics.Rect r1 = r1.f3235b
                int r1 = r1.right
                return r1
        }

        /* renamed from: n */
        public int m670n() {
                r1 = this;
                androidx.recyclerview.widget.j r0 = r1.f3211b
                if (r0 == 0) goto L_0x0009
                int r0 = r0.getPaddingLeft()
                goto L_0x000a
            L_0x0009:
                r0 = 0
            L_0x000a:
                return r0
        }

        /* renamed from: n */
        public int m669n(android.view.View r1) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.recyclerview.widget.j$p r1 = (androidx.recyclerview.widget.C0813j.C0840p) r1
                android.graphics.Rect r1 = r1.f3235b
                int r1 = r1.top
                return r1
        }

        /* renamed from: o */
        public int m668o() {
                r1 = this;
                androidx.recyclerview.widget.j r0 = r1.f3211b
                if (r0 == 0) goto L_0x0009
                int r0 = r0.getPaddingRight()
                goto L_0x000a
            L_0x0009:
                r0 = 0
            L_0x000a:
                return r0
        }

        /* renamed from: o */
        public void m667o(android.view.View r2) {
                r1 = this;
                androidx.recyclerview.widget.b r0 = r1.f3210a
                r0.m1117d(r2)
                return
        }

        /* renamed from: p */
        public int m666p() {
                r1 = this;
                androidx.recyclerview.widget.j r0 = r1.f3211b
                if (r0 == 0) goto L_0x0009
                int r0 = r0.getPaddingTop()
                goto L_0x000a
            L_0x0009:
                r0 = 0
            L_0x000a:
                return r0
        }

        /* renamed from: q */
        public int m665q() {
                r1 = this;
                int r0 = r1.f3226q
                return r0
        }

        /* renamed from: r */
        public int m664r() {
                r1 = this;
                int r0 = r1.f3224o
                return r0
        }

        /* renamed from: s */
        boolean m663s() {
                r5 = this;
                int r0 = r5.m697e()
                r1 = 0
                r2 = 0
            L_0x0006:
                if (r2 >= r0) goto L_0x001d
                android.view.View r3 = r5.m715c(r2)
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                int r4 = r3.width
                if (r4 >= 0) goto L_0x001a
                int r3 = r3.height
                if (r3 >= 0) goto L_0x001a
                r0 = 1
                return r0
            L_0x001a:
                int r2 = r2 + 1
                goto L_0x0006
            L_0x001d:
                return r1
        }

        /* renamed from: t */
        public boolean m662t() {
                r1 = this;
                boolean r0 = r1.f3218i
                return r0
        }

        /* renamed from: u */
        public boolean mo661u() {
                r1 = this;
                boolean r0 = r1.f3219j
                return r0
        }

        /* renamed from: v */
        public final boolean m660v() {
                r1 = this;
                boolean r0 = r1.f3221l
                return r0
        }

        /* renamed from: w */
        public boolean m659w() {
                r1 = this;
                androidx.recyclerview.widget.j$z r0 = r1.f3216g
                if (r0 == 0) goto L_0x000c
                boolean r0 = r0.m583c()
                if (r0 == 0) goto L_0x000c
                r0 = 1
                goto L_0x000d
            L_0x000c:
                r0 = 0
            L_0x000d:
                return r0
        }

        /* renamed from: x */
        public android.os.Parcelable mo658x() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* renamed from: y */
        public void m657y() {
                r1 = this;
                androidx.recyclerview.widget.j r0 = r1.f3211b
                if (r0 == 0) goto L_0x0007
                r0.requestLayout()
            L_0x0007:
                return
        }

        /* renamed from: z */
        public void m656z() {
                r1 = this;
                r0 = 1
                r1.f3217h = r0
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$p */
    /* loaded from: classes.dex */
    public static class C0840p extends android.view.ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        androidx.recyclerview.widget.C0813j.AbstractC0821d0 f3234a;

        /* renamed from: b */
        final android.graphics.Rect f3235b;

        /* renamed from: c */
        boolean f3236c;

        /* renamed from: d */
        boolean f3237d;

        public C0840p(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.f3235b = r1
                r1 = 1
                r0.f3236c = r1
                r1 = 0
                r0.f3237d = r1
                return
        }

        public C0840p(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.f3235b = r1
                r1 = 1
                r0.f3236c = r1
                r1 = 0
                r0.f3237d = r1
                return
        }

        public C0840p(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.f3235b = r1
                r1 = 1
                r0.f3236c = r1
                r1 = 0
                r0.f3237d = r1
                return
        }

        public C0840p(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.f3235b = r1
                r1 = 1
                r0.f3236c = r1
                r1 = 0
                r0.f3237d = r1
                return
        }

        public C0840p(androidx.recyclerview.widget.C0813j.C0840p r1) {
                r0 = this;
                r0.<init>(r1)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.f3235b = r1
                r1 = 1
                r0.f3236c = r1
                r1 = 0
                r0.f3237d = r1
                return
        }

        /* renamed from: a */
        public int m654a() {
                r1 = this;
                androidx.recyclerview.widget.j$d0 r0 = r1.f3234a
                int r0 = r0.m871i()
                return r0
        }

        /* renamed from: b */
        public boolean m653b() {
                r1 = this;
                androidx.recyclerview.widget.j$d0 r0 = r1.f3234a
                boolean r0 = r0.m861s()
                return r0
        }

        /* renamed from: c */
        public boolean m652c() {
                r1 = this;
                androidx.recyclerview.widget.j$d0 r0 = r1.f3234a
                boolean r0 = r0.m864p()
                return r0
        }

        /* renamed from: d */
        public boolean m651d() {
                r1 = this;
                androidx.recyclerview.widget.j$d0 r0 = r1.f3234a
                boolean r0 = r0.m866n()
                return r0
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$q */
    /* loaded from: classes.dex */
    public interface AbstractC0841q {
        /* renamed from: a */
        void m650a(android.view.View r1);

        /* renamed from: b */
        void m649b(android.view.View r1);
    }

    /* renamed from: androidx.recyclerview.widget.j$r */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0842r {
        /* renamed from: a */
        public abstract boolean m648a(int r1, int r2);
    }

    /* renamed from: androidx.recyclerview.widget.j$s */
    /* loaded from: classes.dex */
    public interface AbstractC0843s {
        /* renamed from: a */
        void mo646a(boolean r1);

        /* renamed from: a */
        boolean mo647a(androidx.recyclerview.widget.C0813j r1, android.view.MotionEvent r2);

        /* renamed from: b */
        void mo645b(androidx.recyclerview.widget.C0813j r1, android.view.MotionEvent r2);
    }

    /* renamed from: androidx.recyclerview.widget.j$t */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0844t {
        public AbstractC0844t() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public void m644a(androidx.recyclerview.widget.C0813j r1, int r2) {
                r0 = this;
                return
        }

        /* renamed from: a */
        public void mo643a(androidx.recyclerview.widget.C0813j r1, int r2, int r3) {
                r0 = this;
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$u */
    /* loaded from: classes.dex */
    public static class C0845u {

        /* renamed from: a */
        android.util.SparseArray<androidx.recyclerview.widget.C0813j.C0845u.C0846a> f3238a;

        /* renamed from: b */
        private int f3239b;

        /* renamed from: androidx.recyclerview.widget.j$u$a */
        /* loaded from: classes.dex */
        static class C0846a {

            /* renamed from: a */
            final java.util.ArrayList<androidx.recyclerview.widget.C0813j.AbstractC0821d0> f3240a;

            /* renamed from: b */
            int f3241b;

            /* renamed from: c */
            long f3242c;

            /* renamed from: d */
            long f3243d;

            C0846a() {
                    r2 = this;
                    r2.<init>()
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    r2.f3240a = r0
                    r0 = 5
                    r2.f3241b = r0
                    r0 = 0
                    r2.f3242c = r0
                    r2.f3243d = r0
                    return
            }
        }

        public C0845u() {
                r1 = this;
                r1.<init>()
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r1.f3238a = r0
                r0 = 0
                r1.f3239b = r0
                return
        }

        /* renamed from: b */
        private androidx.recyclerview.widget.C0813j.C0845u.C0846a m634b(int r3) {
                r2 = this;
                android.util.SparseArray<androidx.recyclerview.widget.j$u$a> r0 = r2.f3238a
                java.lang.Object r0 = r0.get(r3)
                androidx.recyclerview.widget.j$u$a r0 = (androidx.recyclerview.widget.C0813j.C0845u.C0846a) r0
                if (r0 != 0) goto L_0x0014
                androidx.recyclerview.widget.j$u$a r0 = new androidx.recyclerview.widget.j$u$a
                r0.<init>()
                android.util.SparseArray<androidx.recyclerview.widget.j$u$a> r1 = r2.f3238a
                r1.put(r3, r0)
            L_0x0014:
                return r0
        }

        /* renamed from: a */
        long m638a(long r5, long r7) {
                r4 = this;
                r0 = 0
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 != 0) goto L_0x0007
                return r7
            L_0x0007:
                r0 = 4
                long r5 = r5 / r0
                r2 = 3
                long r5 = r5 * r2
                long r7 = r7 / r0
                long r5 = r5 + r7
                return r5
        }

        /* renamed from: a */
        public androidx.recyclerview.widget.C0813j.AbstractC0821d0 m641a(int r2) {
                r1 = this;
                android.util.SparseArray<androidx.recyclerview.widget.j$u$a> r0 = r1.f3238a
                java.lang.Object r2 = r0.get(r2)
                androidx.recyclerview.widget.j$u$a r2 = (androidx.recyclerview.widget.C0813j.C0845u.C0846a) r2
                if (r2 == 0) goto L_0x0021
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r2.f3240a
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x0021
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r2 = r2.f3240a
                int r0 = r2.size()
                int r0 = r0 + (-1)
                java.lang.Object r2 = r2.remove(r0)
                androidx.recyclerview.widget.j$d0 r2 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r2
                return r2
            L_0x0021:
                r2 = 0
                return r2
        }

        /* renamed from: a */
        void m642a() {
                r1 = this;
                int r0 = r1.f3239b
                int r0 = r0 + 1
                r1.f3239b = r0
                return
        }

        /* renamed from: a */
        void m640a(int r3, long r4) {
                r2 = this;
                androidx.recyclerview.widget.j$u$a r3 = r2.m634b(r3)
                long r0 = r3.f3243d
                long r4 = r2.m638a(r0, r4)
                r3.f3243d = r4
                return
        }

        /* renamed from: a */
        public void m637a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r4) {
                r3 = this;
                int r0 = r4.m872h()
                androidx.recyclerview.widget.j$u$a r1 = r3.m634b(r0)
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r1 = r1.f3240a
                android.util.SparseArray<androidx.recyclerview.widget.j$u$a> r2 = r3.f3238a
                java.lang.Object r0 = r2.get(r0)
                androidx.recyclerview.widget.j$u$a r0 = (androidx.recyclerview.widget.C0813j.C0845u.C0846a) r0
                int r0 = r0.f3241b
                int r2 = r1.size()
                if (r0 > r2) goto L_0x001b
                return
            L_0x001b:
                r4.m859u()
                r1.add(r4)
                return
        }

        /* renamed from: a */
        void m636a(androidx.recyclerview.widget.C0813j.AbstractC0824g r1, androidx.recyclerview.widget.C0813j.AbstractC0824g r2, boolean r3) {
                r0 = this;
                if (r1 == 0) goto L_0x0005
                r0.m631c()
            L_0x0005:
                if (r3 != 0) goto L_0x000e
                int r1 = r0.f3239b
                if (r1 != 0) goto L_0x000e
                r0.m635b()
            L_0x000e:
                if (r2 == 0) goto L_0x0013
                r0.m642a()
            L_0x0013:
                return
        }

        /* renamed from: a */
        boolean m639a(int r5, long r6, long r8) {
                r4 = this;
                androidx.recyclerview.widget.j$u$a r5 = r4.m634b(r5)
                long r0 = r5.f3243d
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 == 0) goto L_0x0014
                long r6 = r6 + r0
                int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r5 >= 0) goto L_0x0012
                goto L_0x0014
            L_0x0012:
                r5 = 0
                goto L_0x0015
            L_0x0014:
                r5 = 1
            L_0x0015:
                return r5
        }

        /* renamed from: b */
        public void m635b() {
                r2 = this;
                r0 = 0
            L_0x0001:
                android.util.SparseArray<androidx.recyclerview.widget.j$u$a> r1 = r2.f3238a
                int r1 = r1.size()
                if (r0 >= r1) goto L_0x0019
                android.util.SparseArray<androidx.recyclerview.widget.j$u$a> r1 = r2.f3238a
                java.lang.Object r1 = r1.valueAt(r0)
                androidx.recyclerview.widget.j$u$a r1 = (androidx.recyclerview.widget.C0813j.C0845u.C0846a) r1
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r1 = r1.f3240a
                r1.clear()
                int r0 = r0 + 1
                goto L_0x0001
            L_0x0019:
                return
        }

        /* renamed from: b */
        void m633b(int r3, long r4) {
                r2 = this;
                androidx.recyclerview.widget.j$u$a r3 = r2.m634b(r3)
                long r0 = r3.f3242c
                long r4 = r2.m638a(r0, r4)
                r3.f3242c = r4
                return
        }

        /* renamed from: b */
        boolean m632b(int r5, long r6, long r8) {
                r4 = this;
                androidx.recyclerview.widget.j$u$a r5 = r4.m634b(r5)
                long r0 = r5.f3242c
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 == 0) goto L_0x0014
                long r6 = r6 + r0
                int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r5 >= 0) goto L_0x0012
                goto L_0x0014
            L_0x0012:
                r5 = 0
                goto L_0x0015
            L_0x0014:
                r5 = 1
            L_0x0015:
                return r5
        }

        /* renamed from: c */
        void m631c() {
                r1 = this;
                int r0 = r1.f3239b
                int r0 = r0 + (-1)
                r1.f3239b = r0
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$v */
    /* loaded from: classes.dex */
    public final class C0847v {

        /* renamed from: a */
        final java.util.ArrayList<androidx.recyclerview.widget.C0813j.AbstractC0821d0> f3244a;

        /* renamed from: b */
        java.util.ArrayList<androidx.recyclerview.widget.C0813j.AbstractC0821d0> f3245b;

        /* renamed from: c */
        final java.util.ArrayList<androidx.recyclerview.widget.C0813j.AbstractC0821d0> f3246c;

        /* renamed from: d */
        private final java.util.List<androidx.recyclerview.widget.C0813j.AbstractC0821d0> f3247d;

        /* renamed from: e */
        private int f3248e;

        /* renamed from: f */
        int f3249f;

        /* renamed from: g */
        androidx.recyclerview.widget.C0813j.C0845u f3250g;

        /* renamed from: h */
        private androidx.recyclerview.widget.C0813j.AbstractC0817b0 f3251h;

        /* renamed from: i */
        final /* synthetic */ androidx.recyclerview.widget.C0813j f3252i;

        public C0847v(androidx.recyclerview.widget.C0813j r1) {
                r0 = this;
                r0.f3252i = r1
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.f3244a = r1
                r1 = 0
                r0.f3245b = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.f3246c = r1
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r1 = r0.f3244a
                java.util.List r1 = java.util.Collections.unmodifiableList(r1)
                r0.f3247d = r1
                r1 = 2
                r0.f3248e = r1
                r0.f3249f = r1
                return
        }

        /* renamed from: a */
        private void m622a(android.view.ViewGroup r5, boolean r6) {
                r4 = this;
                int r0 = r5.getChildCount()
                r1 = 1
                int r0 = r0 - r1
            L_0x0006:
                if (r0 < 0) goto L_0x0018
                android.view.View r2 = r5.getChildAt(r0)
                boolean r3 = r2 instanceof android.view.ViewGroup
                if (r3 == 0) goto L_0x0015
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r4.m622a(r2, r1)
            L_0x0015:
                int r0 = r0 + (-1)
                goto L_0x0006
            L_0x0018:
                if (r6 != 0) goto L_0x001b
                return
            L_0x001b:
                int r6 = r5.getVisibility()
                r0 = 4
                if (r6 != r0) goto L_0x002a
                r6 = 0
                r5.setVisibility(r6)
                r5.setVisibility(r0)
                goto L_0x0034
            L_0x002a:
                int r6 = r5.getVisibility()
                r5.setVisibility(r0)
                r5.setVisibility(r6)
            L_0x0034:
                return
        }

        /* renamed from: a */
        private boolean m619a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r10, int r11, int r12, long r13) {
                r9 = this;
                androidx.recyclerview.widget.j r0 = r9.f3252i
                r10.f3196r = r0
                int r2 = r10.m872h()
                androidx.recyclerview.widget.j r0 = r9.f3252i
                long r7 = r0.getNanoTime()
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r3 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x0023
                androidx.recyclerview.widget.j$u r1 = r9.f3250g
                r3 = r7
                r5 = r13
                boolean r13 = r1.m639a(r2, r3, r5)
                if (r13 != 0) goto L_0x0023
                r10 = 0
                return r10
            L_0x0023:
                androidx.recyclerview.widget.j r13 = r9.f3252i
                androidx.recyclerview.widget.j$g r13 = r13.f3122l
                r13.m831a(r10, r11)
                androidx.recyclerview.widget.j r11 = r9.f3252i
                long r13 = r11.getNanoTime()
                androidx.recyclerview.widget.j$u r11 = r9.f3250g
                int r0 = r10.m872h()
                long r13 = r13 - r7
                r11.m640a(r0, r13)
                r9.m599e(r10)
                androidx.recyclerview.widget.j r11 = r9.f3252i
                androidx.recyclerview.widget.j$a0 r11 = r11.f3115h0
                boolean r11 = r11.m902d()
                if (r11 == 0) goto L_0x0049
                r10.f3185g = r12
            L_0x0049:
                r10 = 1
                return r10
        }

        /* renamed from: e */
        private void m599e(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r3) {
                r2 = this;
                androidx.recyclerview.widget.j r0 = r2.f3252i
                boolean r0 = r0.m921m()
                if (r0 == 0) goto L_0x002a
                android.view.View r0 = r3.f3179a
                int r1 = p000a.p018g.p029l.C0216r.m3413h(r0)
                if (r1 != 0) goto L_0x0014
                r1 = 1
                p000a.p018g.p029l.C0216r.m3418e(r0, r1)
            L_0x0014:
                boolean r1 = p000a.p018g.p029l.C0216r.m3402s(r0)
                if (r1 != 0) goto L_0x002a
                r1 = 16384(0x4000, float:2.2959E-41)
                r3.m888a(r1)
                androidx.recyclerview.widget.j r3 = r2.f3252i
                androidx.recyclerview.widget.k r3 = r3.f3129o0
                a.g.l.a r3 = r3.m581b()
                p000a.p018g.p029l.C0216r.m3440a(r0, r3)
            L_0x002a:
                return
        }

        /* renamed from: f */
        private void m596f(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r2) {
                r1 = this;
                android.view.View r2 = r2.f3179a
                boolean r0 = r2 instanceof android.view.ViewGroup
                if (r0 == 0) goto L_0x000c
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r0 = 0
                r1.m622a(r2, r0)
            L_0x000c:
                return
        }

        /* renamed from: a */
        public int m629a(int r4) {
                r3 = this;
                if (r4 < 0) goto L_0x0020
                androidx.recyclerview.widget.j r0 = r3.f3252i
                androidx.recyclerview.widget.j$a0 r0 = r0.f3115h0
                int r0 = r0.m907a()
                if (r4 >= r0) goto L_0x0020
                androidx.recyclerview.widget.j r0 = r3.f3252i
                androidx.recyclerview.widget.j$a0 r0 = r0.f3115h0
                boolean r0 = r0.m902d()
                if (r0 != 0) goto L_0x0017
                return r4
            L_0x0017:
                androidx.recyclerview.widget.j r0 = r3.f3252i
                androidx.recyclerview.widget.a r0 = r0.f3108e
                int r4 = r0.m1145b(r4)
                return r4
            L_0x0020:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "invalid position "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = ". State "
                r1.append(r4)
                java.lang.String r4 = "item count is "
                r1.append(r4)
                androidx.recyclerview.widget.j r4 = r3.f3252i
                androidx.recyclerview.widget.j$a0 r4 = r4.f3115h0
                int r4 = r4.m907a()
                r1.append(r4)
                androidx.recyclerview.widget.j r4 = r3.f3252i
                java.lang.String r4 = r4.m932i()
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        /* renamed from: a */
        androidx.recyclerview.widget.C0813j.AbstractC0821d0 m626a(int r6, boolean r7) {
                r5 = this;
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r5.f3244a
                int r0 = r0.size()
                r1 = 0
                r2 = 0
            L_0x0008:
                if (r2 >= r0) goto L_0x003b
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r3 = r5.f3244a
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.j$d0 r3 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r3
                boolean r4 = r3.m854z()
                if (r4 != 0) goto L_0x0038
                int r4 = r3.m871i()
                if (r4 != r6) goto L_0x0038
                boolean r4 = r3.m866n()
                if (r4 != 0) goto L_0x0038
                androidx.recyclerview.widget.j r4 = r5.f3252i
                androidx.recyclerview.widget.j$a0 r4 = r4.f3115h0
                boolean r4 = r4.f3159h
                if (r4 != 0) goto L_0x0032
                boolean r4 = r3.m864p()
                if (r4 != 0) goto L_0x0038
            L_0x0032:
                r6 = 32
                r3.m888a(r6)
                return r3
            L_0x0038:
                int r2 = r2 + 1
                goto L_0x0008
            L_0x003b:
                if (r7 != 0) goto L_0x008d
                androidx.recyclerview.widget.j r0 = r5.f3252i
                androidx.recyclerview.widget.b r0 = r0.f3110f
                android.view.View r0 = r0.m1123b(r6)
                if (r0 == 0) goto L_0x008d
                androidx.recyclerview.widget.j$d0 r6 = androidx.recyclerview.widget.C0813j.m924k(r0)
                androidx.recyclerview.widget.j r7 = r5.f3252i
                androidx.recyclerview.widget.b r7 = r7.f3110f
                r7.m1113f(r0)
                androidx.recyclerview.widget.j r7 = r5.f3252i
                androidx.recyclerview.widget.b r7 = r7.f3110f
                int r7 = r7.m1122b(r0)
                r1 = -1
                if (r7 == r1) goto L_0x006d
                androidx.recyclerview.widget.j r1 = r5.f3252i
                androidx.recyclerview.widget.b r1 = r1.f3110f
                r1.m1129a(r7)
                r5.m606c(r0)
                r7 = 8224(0x2020, float:1.1524E-41)
                r6.m888a(r7)
                return r6
            L_0x006d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "layout index should not be -1 after unhiding a view:"
                r0.append(r1)
                r0.append(r6)
                androidx.recyclerview.widget.j r6 = r5.f3252i
                java.lang.String r6 = r6.m932i()
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                r7.<init>(r6)
                throw r7
            L_0x008d:
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r5.f3246c
                int r0 = r0.size()
            L_0x0093:
                if (r1 >= r0) goto L_0x00b4
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r2 = r5.f3246c
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.j$d0 r2 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r2
                boolean r3 = r2.m866n()
                if (r3 != 0) goto L_0x00b1
                int r3 = r2.m871i()
                if (r3 != r6) goto L_0x00b1
                if (r7 != 0) goto L_0x00b0
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r6 = r5.f3246c
                r6.remove(r1)
            L_0x00b0:
                return r2
            L_0x00b1:
                int r1 = r1 + 1
                goto L_0x0093
            L_0x00b4:
                r6 = 0
                return r6
        }

        /* renamed from: a */
        androidx.recyclerview.widget.C0813j.AbstractC0821d0 m625a(int r17, boolean r18, long r19) {
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x022c
                androidx.recyclerview.widget.j r1 = r6.f3252i
                androidx.recyclerview.widget.j$a0 r1 = r1.f3115h0
                int r1 = r1.m907a()
                if (r3 >= r1) goto L_0x022c
                androidx.recyclerview.widget.j r1 = r6.f3252i
                androidx.recyclerview.widget.j$a0 r1 = r1.f3115h0
                boolean r1 = r1.m902d()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.j$d0 r1 = r16.m614b(r17)
                if (r1 == 0) goto L_0x0028
                r4 = 1
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.j$d0 r1 = r16.m626a(r17, r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.m602d(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.m888a(r5)
                boolean r5 = r1.m863q()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.j r5 = r6.f3252i
                android.view.View r9 = r1.f3179a
                r5.removeDetachedView(r9, r8)
                r1.m855y()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.m854z()
                if (r5 == 0) goto L_0x0057
                r1.m877c()
            L_0x0057:
                r6.m610b(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = 1
            L_0x005d:
                if (r1 != 0) goto L_0x0185
                androidx.recyclerview.widget.j r5 = r6.f3252i
                androidx.recyclerview.widget.a r5 = r5.f3108e
                int r5 = r5.m1145b(r3)
                if (r5 < 0) goto L_0x0148
                androidx.recyclerview.widget.j r9 = r6.f3252i
                androidx.recyclerview.widget.j$g r9 = r9.f3122l
                int r9 = r9.mo106a()
                if (r5 >= r9) goto L_0x0148
                androidx.recyclerview.widget.j r9 = r6.f3252i
                androidx.recyclerview.widget.j$g r9 = r9.f3122l
                int r9 = r9.mo98b(r5)
                androidx.recyclerview.widget.j r10 = r6.f3252i
                androidx.recyclerview.widget.j$g r10 = r10.f3122l
                boolean r10 = r10.m827b()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.j r1 = r6.f3252i
                androidx.recyclerview.widget.j$g r1 = r1.f3122l
                long r10 = r1.mo105a(r5)
                androidx.recyclerview.widget.j$d0 r1 = r6.m624a(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.f3181c = r5
                r4 = 1
            L_0x0096:
                if (r1 != 0) goto L_0x00eb
                androidx.recyclerview.widget.j$b0 r0 = r6.f3251h
                if (r0 == 0) goto L_0x00eb
                android.view.View r0 = r0.m900a(r6, r3, r9)
                if (r0 == 0) goto L_0x00eb
                androidx.recyclerview.widget.j r1 = r6.f3252i
                androidx.recyclerview.widget.j$d0 r1 = r1.m945e(r0)
                if (r1 == 0) goto L_0x00ce
                boolean r0 = r1.m856x()
                if (r0 != 0) goto L_0x00b1
                goto L_0x00eb
            L_0x00b1:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
                r1.append(r2)
                androidx.recyclerview.widget.j r2 = r6.f3252i
                java.lang.String r2 = r2.m932i()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00ce:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
                r1.append(r2)
                androidx.recyclerview.widget.j r2 = r6.f3252i
                java.lang.String r2 = r2.m932i()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00eb:
                if (r1 != 0) goto L_0x0101
                androidx.recyclerview.widget.j$u r0 = r16.m604d()
                androidx.recyclerview.widget.j$d0 r1 = r0.m641a(r9)
                if (r1 == 0) goto L_0x0101
                r1.m859u()
                boolean r0 = androidx.recyclerview.widget.C0813j.f3070B0
                if (r0 == 0) goto L_0x0101
                r6.m596f(r1)
            L_0x0101:
                if (r1 != 0) goto L_0x0185
                androidx.recyclerview.widget.j r0 = r6.f3252i
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x011f
                androidx.recyclerview.widget.j$u r10 = r6.f3250g
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.m632b(r11, r12, r14)
                if (r5 != 0) goto L_0x011f
                return r2
            L_0x011f:
                androidx.recyclerview.widget.j r2 = r6.f3252i
                androidx.recyclerview.widget.j$g r5 = r2.f3122l
                androidx.recyclerview.widget.j$d0 r2 = r5.m833a(r2, r9)
                boolean r5 = androidx.recyclerview.widget.C0813j.f3072D0
                if (r5 == 0) goto L_0x013a
                android.view.View r5 = r2.f3179a
                androidx.recyclerview.widget.j r5 = androidx.recyclerview.widget.C0813j.m927j(r5)
                if (r5 == 0) goto L_0x013a
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.f3180b = r10
            L_0x013a:
                androidx.recyclerview.widget.j r5 = r6.f3252i
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.j$u r5 = r6.f3250g
                long r10 = r10 - r0
                r5.m633b(r9, r10)
                r10 = r2
                goto L_0x0186
            L_0x0148:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ")."
                r1.append(r2)
                java.lang.String r2 = "state:"
                r1.append(r2)
                androidx.recyclerview.widget.j r2 = r6.f3252i
                androidx.recyclerview.widget.j$a0 r2 = r2.f3115h0
                int r2 = r2.m907a()
                r1.append(r2)
                androidx.recyclerview.widget.j r2 = r6.f3252i
                java.lang.String r2 = r2.m932i()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0185:
                r10 = r1
            L_0x0186:
                r9 = r4
                if (r9 == 0) goto L_0x01bf
                androidx.recyclerview.widget.j r0 = r6.f3252i
                androidx.recyclerview.widget.j$a0 r0 = r0.f3115h0
                boolean r0 = r0.m902d()
                if (r0 != 0) goto L_0x01bf
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r10.m879b(r0)
                if (r1 == 0) goto L_0x01bf
                r10.m887a(r8, r0)
                androidx.recyclerview.widget.j r0 = r6.f3252i
                androidx.recyclerview.widget.j$a0 r0 = r0.f3115h0
                boolean r0 = r0.f3162k
                if (r0 == 0) goto L_0x01bf
                int r0 = androidx.recyclerview.widget.C0813j.AbstractC0829l.m806e(r10)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.j r1 = r6.f3252i
                androidx.recyclerview.widget.j$l r2 = r1.f3090M
                androidx.recyclerview.widget.j$a0 r1 = r1.f3115h0
                java.util.List r4 = r10.m869k()
                androidx.recyclerview.widget.j$l$c r0 = r2.m816a(r1, r10, r0, r4)
                androidx.recyclerview.widget.j r1 = r6.f3252i
                r1.m985a(r10, r0)
            L_0x01bf:
                androidx.recyclerview.widget.j r0 = r6.f3252i
                androidx.recyclerview.widget.j$a0 r0 = r0.f3115h0
                boolean r0 = r0.m902d()
                if (r0 == 0) goto L_0x01d2
                boolean r0 = r10.m867m()
                if (r0 == 0) goto L_0x01d2
                r10.f3185g = r3
                goto L_0x01e5
            L_0x01d2:
                boolean r0 = r10.m867m()
                if (r0 == 0) goto L_0x01e7
                boolean r0 = r10.m860t()
                if (r0 != 0) goto L_0x01e7
                boolean r0 = r10.m866n()
                if (r0 == 0) goto L_0x01e5
                goto L_0x01e7
            L_0x01e5:
                r0 = 0
                goto L_0x01fa
            L_0x01e7:
                androidx.recyclerview.widget.j r0 = r6.f3252i
                androidx.recyclerview.widget.a r0 = r0.f3108e
                int r2 = r0.m1145b(r3)
                r0 = r16
                r1 = r10
                r3 = r17
                r4 = r19
                boolean r0 = r0.m619a(r1, r2, r3, r4)
            L_0x01fa:
                android.view.View r1 = r10.f3179a
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x0210
                androidx.recyclerview.widget.j r1 = r6.f3252i
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
            L_0x0208:
                androidx.recyclerview.widget.j$p r1 = (androidx.recyclerview.widget.C0813j.C0840p) r1
                android.view.View r2 = r10.f3179a
                r2.setLayoutParams(r1)
                goto L_0x0221
            L_0x0210:
                androidx.recyclerview.widget.j r2 = r6.f3252i
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x021f
                androidx.recyclerview.widget.j r2 = r6.f3252i
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams(r1)
                goto L_0x0208
            L_0x021f:
                androidx.recyclerview.widget.j$p r1 = (androidx.recyclerview.widget.C0813j.C0840p) r1
            L_0x0221:
                r1.f3234a = r10
                if (r9 == 0) goto L_0x0228
                if (r0 == 0) goto L_0x0228
                goto L_0x0229
            L_0x0228:
                r7 = 0
            L_0x0229:
                r1.f3237d = r7
                return r10
            L_0x022c:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.j r2 = r6.f3252i
                androidx.recyclerview.widget.j$a0 r2 = r2.f3115h0
                int r2 = r2.m907a()
                r1.append(r2)
                androidx.recyclerview.widget.j r2 = r6.f3252i
                java.lang.String r2 = r2.m932i()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                goto L_0x0265
            L_0x0264:
                throw r0
            L_0x0265:
                goto L_0x0264
        }

        /* renamed from: a */
        androidx.recyclerview.widget.C0813j.AbstractC0821d0 m624a(long r7, int r9, boolean r10) {
                r6 = this;
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r6.f3244a
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L_0x0008:
                if (r0 < 0) goto L_0x0059
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r1 = r6.f3244a
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.j$d0 r1 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r1
                long r2 = r1.m873g()
                int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r4 != 0) goto L_0x0056
                boolean r2 = r1.m854z()
                if (r2 != 0) goto L_0x0056
                int r2 = r1.m872h()
                if (r9 != r2) goto L_0x0042
                r7 = 32
                r1.m888a(r7)
                boolean r7 = r1.m864p()
                if (r7 == 0) goto L_0x0041
                androidx.recyclerview.widget.j r7 = r6.f3252i
                androidx.recyclerview.widget.j$a0 r7 = r7.f3115h0
                boolean r7 = r7.m902d()
                if (r7 != 0) goto L_0x0041
                r7 = 2
                r8 = 14
                r1.m887a(r7, r8)
            L_0x0041:
                return r1
            L_0x0042:
                if (r10 != 0) goto L_0x0056
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r2 = r6.f3244a
                r2.remove(r0)
                androidx.recyclerview.widget.j r2 = r6.f3252i
                android.view.View r3 = r1.f3179a
                r4 = 0
                r2.removeDetachedView(r3, r4)
                android.view.View r1 = r1.f3179a
                r6.m623a(r1)
            L_0x0056:
                int r0 = r0 + (-1)
                goto L_0x0008
            L_0x0059:
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r6.f3246c
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L_0x0061:
                r1 = 0
                if (r0 < 0) goto L_0x008b
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r2 = r6.f3246c
                java.lang.Object r2 = r2.get(r0)
                androidx.recyclerview.widget.j$d0 r2 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r2
                long r3 = r2.m873g()
                int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                if (r5 != 0) goto L_0x0088
                int r3 = r2.m872h()
                if (r9 != r3) goto L_0x0082
                if (r10 != 0) goto L_0x0081
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r7 = r6.f3246c
                r7.remove(r0)
            L_0x0081:
                return r2
            L_0x0082:
                if (r10 != 0) goto L_0x0088
                r6.m600e(r0)
                return r1
            L_0x0088:
                int r0 = r0 + (-1)
                goto L_0x0061
            L_0x008b:
                return r1
        }

        /* renamed from: a */
        public void m630a() {
                r1 = this;
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r1.f3244a
                r0.clear()
                r1.m593i()
                return
        }

        /* renamed from: a */
        void m628a(int r5, int r6) {
                r4 = this;
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r4.f3246c
                int r0 = r0.size()
                r1 = 0
            L_0x0007:
                if (r1 >= r0) goto L_0x001e
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r2 = r4.f3246c
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.j$d0 r2 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r2
                if (r2 == 0) goto L_0x001b
                int r3 = r2.f3181c
                if (r3 < r5) goto L_0x001b
                r3 = 1
                r2.m885a(r6, r3)
            L_0x001b:
                int r1 = r1 + 1
                goto L_0x0007
            L_0x001e:
                return
        }

        /* renamed from: a */
        void m627a(int r5, int r6, boolean r7) {
                r4 = this;
                int r0 = r5 + r6
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r1 = r4.f3246c
                int r1 = r1.size()
                int r1 = r1 + (-1)
            L_0x000a:
                if (r1 < 0) goto L_0x002c
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r2 = r4.f3246c
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.j$d0 r2 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r2
                if (r2 == 0) goto L_0x0029
                int r3 = r2.f3181c
                if (r3 < r0) goto L_0x001f
                int r3 = -r6
                r2.m885a(r3, r7)
                goto L_0x0029
            L_0x001f:
                if (r3 < r5) goto L_0x0029
                r3 = 8
                r2.m888a(r3)
                r4.m600e(r1)
            L_0x0029:
                int r1 = r1 + (-1)
                goto L_0x000a
            L_0x002c:
                return
        }

        /* renamed from: a */
        void m623a(android.view.View r2) {
                r1 = this;
                androidx.recyclerview.widget.j$d0 r2 = androidx.recyclerview.widget.C0813j.m924k(r2)
                r0 = 0
                r2.f3192n = r0
                r0 = 0
                r2.f3193o = r0
                r2.m877c()
                r1.m610b(r2)
                return
        }

        /* renamed from: a */
        void m621a(androidx.recyclerview.widget.C0813j.AbstractC0817b0 r1) {
                r0 = this;
                r0.f3251h = r1
                return
        }

        /* renamed from: a */
        void m620a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r3) {
                r2 = this;
                androidx.recyclerview.widget.j r0 = r2.f3252i
                androidx.recyclerview.widget.j$w r0 = r0.f3126n
                if (r0 == 0) goto L_0x0009
                r0.m591a(r3)
            L_0x0009:
                androidx.recyclerview.widget.j r0 = r2.f3252i
                androidx.recyclerview.widget.j$g r0 = r0.f3122l
                if (r0 == 0) goto L_0x0012
                r0.mo94d(r3)
            L_0x0012:
                androidx.recyclerview.widget.j r0 = r2.f3252i
                androidx.recyclerview.widget.j$a0 r1 = r0.f3115h0
                if (r1 == 0) goto L_0x001d
                androidx.recyclerview.widget.o r0 = r0.f3112g
                r0.m522h(r3)
            L_0x001d:
                return
        }

        /* renamed from: a */
        void m618a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r4, boolean r5) {
                r3 = this;
                androidx.recyclerview.widget.C0813j.m944e(r4)
                r0 = 16384(0x4000, float:2.2959E-41)
                boolean r1 = r4.m879b(r0)
                r2 = 0
                if (r1 == 0) goto L_0x0015
                r1 = 0
                r4.m887a(r1, r0)
                android.view.View r0 = r4.f3179a
                p000a.p018g.p029l.C0216r.m3440a(r0, r2)
            L_0x0015:
                if (r5 == 0) goto L_0x001a
                r3.m620a(r4)
            L_0x001a:
                r4.f3196r = r2
                androidx.recyclerview.widget.j$u r5 = r3.m604d()
                r5.m637a(r4)
                return
        }

        /* renamed from: a */
        void m617a(androidx.recyclerview.widget.C0813j.AbstractC0824g r2, androidx.recyclerview.widget.C0813j.AbstractC0824g r3, boolean r4) {
                r1 = this;
                r1.m630a()
                androidx.recyclerview.widget.j$u r0 = r1.m604d()
                r0.m636a(r2, r3, r4)
                return
        }

        /* renamed from: a */
        void m616a(androidx.recyclerview.widget.C0813j.C0845u r2) {
                r1 = this;
                androidx.recyclerview.widget.j$u r0 = r1.f3250g
                if (r0 == 0) goto L_0x0007
                r0.m631c()
            L_0x0007:
                r1.f3250g = r2
                androidx.recyclerview.widget.j$u r2 = r1.f3250g
                if (r2 == 0) goto L_0x001a
                androidx.recyclerview.widget.j r2 = r1.f3252i
                androidx.recyclerview.widget.j$g r2 = r2.getAdapter()
                if (r2 == 0) goto L_0x001a
                androidx.recyclerview.widget.j$u r2 = r1.f3250g
                r2.m642a()
            L_0x001a:
                return
        }

        /* renamed from: b */
        android.view.View m612b(int r3, boolean r4) {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                androidx.recyclerview.widget.j$d0 r3 = r2.m625a(r3, r4, r0)
                android.view.View r3 = r3.f3179a
                return r3
        }

        /* renamed from: b */
        androidx.recyclerview.widget.C0813j.AbstractC0821d0 m614b(int r10) {
                r9 = this;
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r9.f3245b
                r1 = 0
                if (r0 == 0) goto L_0x0072
                int r0 = r0.size()
                if (r0 != 0) goto L_0x000c
                goto L_0x0072
            L_0x000c:
                r2 = 0
                r3 = 0
            L_0x000e:
                r4 = 32
                if (r3 >= r0) goto L_0x002d
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r5 = r9.f3245b
                java.lang.Object r5 = r5.get(r3)
                androidx.recyclerview.widget.j$d0 r5 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r5
                boolean r6 = r5.m854z()
                if (r6 != 0) goto L_0x002a
                int r6 = r5.m871i()
                if (r6 != r10) goto L_0x002a
                r5.m888a(r4)
                return r5
            L_0x002a:
                int r3 = r3 + 1
                goto L_0x000e
            L_0x002d:
                androidx.recyclerview.widget.j r3 = r9.f3252i
                androidx.recyclerview.widget.j$g r3 = r3.f3122l
                boolean r3 = r3.m827b()
                if (r3 == 0) goto L_0x0072
                androidx.recyclerview.widget.j r3 = r9.f3252i
                androidx.recyclerview.widget.a r3 = r3.f3108e
                int r10 = r3.m1145b(r10)
                if (r10 <= 0) goto L_0x0072
                androidx.recyclerview.widget.j r3 = r9.f3252i
                androidx.recyclerview.widget.j$g r3 = r3.f3122l
                int r3 = r3.mo106a()
                if (r10 >= r3) goto L_0x0072
                androidx.recyclerview.widget.j r3 = r9.f3252i
                androidx.recyclerview.widget.j$g r3 = r3.f3122l
                long r5 = r3.mo105a(r10)
            L_0x0053:
                if (r2 >= r0) goto L_0x0072
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r10 = r9.f3245b
                java.lang.Object r10 = r10.get(r2)
                androidx.recyclerview.widget.j$d0 r10 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r10
                boolean r3 = r10.m854z()
                if (r3 != 0) goto L_0x006f
                long r7 = r10.m873g()
                int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r3 != 0) goto L_0x006f
                r10.m888a(r4)
                return r10
            L_0x006f:
                int r2 = r2 + 1
                goto L_0x0053
            L_0x0072:
                return r1
        }

        /* renamed from: b */
        void m615b() {
                r4 = this;
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r4.f3246c
                int r0 = r0.size()
                r1 = 0
                r2 = 0
            L_0x0008:
                if (r2 >= r0) goto L_0x0018
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r3 = r4.f3246c
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.j$d0 r3 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r3
                r3.m889a()
                int r2 = r2 + 1
                goto L_0x0008
            L_0x0018:
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r4.f3244a
                int r0 = r0.size()
                r2 = 0
            L_0x001f:
                if (r2 >= r0) goto L_0x002f
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r3 = r4.f3244a
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.j$d0 r3 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r3
                r3.m889a()
                int r2 = r2 + 1
                goto L_0x001f
            L_0x002f:
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r4.f3245b
                if (r0 == 0) goto L_0x0047
                int r0 = r0.size()
            L_0x0037:
                if (r1 >= r0) goto L_0x0047
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r2 = r4.f3245b
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.j$d0 r2 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r2
                r2.m889a()
                int r1 = r1 + 1
                goto L_0x0037
            L_0x0047:
                return
        }

        /* renamed from: b */
        void m613b(int r9, int r10) {
                r8 = this;
                if (r9 >= r10) goto L_0x0007
                r0 = -1
                r0 = r9
                r1 = r10
                r2 = -1
                goto L_0x000b
            L_0x0007:
                r0 = 1
                r1 = r9
                r0 = r10
                r2 = 1
            L_0x000b:
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r3 = r8.f3246c
                int r3 = r3.size()
                r4 = 0
                r5 = 0
            L_0x0013:
                if (r5 >= r3) goto L_0x0034
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r6 = r8.f3246c
                java.lang.Object r6 = r6.get(r5)
                androidx.recyclerview.widget.j$d0 r6 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r6
                if (r6 == 0) goto L_0x0031
                int r7 = r6.f3181c
                if (r7 < r0) goto L_0x0031
                if (r7 <= r1) goto L_0x0026
                goto L_0x0031
            L_0x0026:
                if (r7 != r9) goto L_0x002e
                int r7 = r10 - r9
                r6.m885a(r7, r4)
                goto L_0x0031
            L_0x002e:
                r6.m885a(r2, r4)
            L_0x0031:
                int r5 = r5 + 1
                goto L_0x0013
            L_0x0034:
                return
        }

        /* renamed from: b */
        public void m611b(android.view.View r4) {
                r3 = this;
                androidx.recyclerview.widget.j$d0 r0 = androidx.recyclerview.widget.C0813j.m924k(r4)
                boolean r1 = r0.m862r()
                if (r1 == 0) goto L_0x0010
                androidx.recyclerview.widget.j r1 = r3.f3252i
                r2 = 0
                r1.removeDetachedView(r4, r2)
            L_0x0010:
                boolean r4 = r0.m863q()
                if (r4 == 0) goto L_0x001a
                r0.m855y()
                goto L_0x0023
            L_0x001a:
                boolean r4 = r0.m854z()
                if (r4 == 0) goto L_0x0023
                r0.m877c()
            L_0x0023:
                r3.m610b(r0)
                return
        }

        /* renamed from: b */
        void m610b(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r7) {
                r6 = this;
                boolean r0 = r7.m863q()
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x00e6
                android.view.View r0 = r7.f3179a
                android.view.ViewParent r0 = r0.getParent()
                if (r0 == 0) goto L_0x0012
                goto L_0x00e6
            L_0x0012:
                boolean r0 = r7.m862r()
                if (r0 != 0) goto L_0x00c6
                boolean r0 = r7.m856x()
                if (r0 != 0) goto L_0x00a9
                boolean r0 = r7.m875e()
                androidx.recyclerview.widget.j r3 = r6.f3252i
                androidx.recyclerview.widget.j$g r3 = r3.f3122l
                if (r3 == 0) goto L_0x0032
                if (r0 == 0) goto L_0x0032
                boolean r3 = r3.m832a(r7)
                if (r3 == 0) goto L_0x0032
                r3 = 1
                goto L_0x0033
            L_0x0032:
                r3 = 0
            L_0x0033:
                if (r3 != 0) goto L_0x003e
                boolean r3 = r7.m865o()
                if (r3 == 0) goto L_0x003c
                goto L_0x003e
            L_0x003c:
                r3 = 0
                goto L_0x0098
            L_0x003e:
                int r3 = r6.f3249f
                if (r3 <= 0) goto L_0x0091
                r3 = 526(0x20e, float:7.37E-43)
                boolean r3 = r7.m879b(r3)
                if (r3 != 0) goto L_0x0091
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r3 = r6.f3246c
                int r3 = r3.size()
                int r4 = r6.f3249f
                if (r3 < r4) goto L_0x005b
                if (r3 <= 0) goto L_0x005b
                r6.m600e(r1)
                int r3 = r3 + (-1)
            L_0x005b:
                boolean r4 = androidx.recyclerview.widget.C0813j.f3072D0
                if (r4 == 0) goto L_0x008a
                if (r3 <= 0) goto L_0x008a
                androidx.recyclerview.widget.j r4 = r6.f3252i
                androidx.recyclerview.widget.e$b r4 = r4.f3113g0
                int r5 = r7.f3181c
                boolean r4 = r4.m1060a(r5)
                if (r4 != 0) goto L_0x008a
                int r3 = r3 + (-1)
            L_0x006f:
                if (r3 < 0) goto L_0x0089
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r4 = r6.f3246c
                java.lang.Object r4 = r4.get(r3)
                androidx.recyclerview.widget.j$d0 r4 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r4
                int r4 = r4.f3181c
                androidx.recyclerview.widget.j r5 = r6.f3252i
                androidx.recyclerview.widget.e$b r5 = r5.f3113g0
                boolean r4 = r5.m1060a(r4)
                if (r4 != 0) goto L_0x0086
                goto L_0x0089
            L_0x0086:
                int r3 = r3 + (-1)
                goto L_0x006f
            L_0x0089:
                int r3 = r3 + r2
            L_0x008a:
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r4 = r6.f3246c
                r4.add(r3, r7)
                r3 = 1
                goto L_0x0092
            L_0x0091:
                r3 = 0
            L_0x0092:
                if (r3 != 0) goto L_0x0098
                r6.m618a(r7, r2)
                r1 = 1
            L_0x0098:
                androidx.recyclerview.widget.j r2 = r6.f3252i
                androidx.recyclerview.widget.o r2 = r2.f3112g
                r2.m522h(r7)
                if (r3 != 0) goto L_0x00a8
                if (r1 != 0) goto L_0x00a8
                if (r0 == 0) goto L_0x00a8
                r0 = 0
                r7.f3196r = r0
            L_0x00a8:
                return
            L_0x00a9:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
                r0.append(r1)
                androidx.recyclerview.widget.j r1 = r6.f3252i
                java.lang.String r1 = r1.m932i()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.<init>(r0)
                throw r7
            L_0x00c6:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
                r1.append(r2)
                r1.append(r7)
                androidx.recyclerview.widget.j r7 = r6.f3252i
                java.lang.String r7 = r7.m932i()
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                r0.<init>(r7)
                throw r0
            L_0x00e6:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Scrapped or attached views may not be recycled. isScrap:"
                r3.append(r4)
                boolean r4 = r7.m863q()
                r3.append(r4)
                java.lang.String r4 = " isAttached:"
                r3.append(r4)
                android.view.View r7 = r7.f3179a
                android.view.ViewParent r7 = r7.getParent()
                if (r7 == 0) goto L_0x0107
                r1 = 1
            L_0x0107:
                r3.append(r1)
                androidx.recyclerview.widget.j r7 = r6.f3252i
                java.lang.String r7 = r7.m932i()
                r3.append(r7)
                java.lang.String r7 = r3.toString()
                r0.<init>(r7)
                goto L_0x011c
            L_0x011b:
                throw r0
            L_0x011c:
                goto L_0x011b
        }

        /* renamed from: c */
        android.view.View m608c(int r2) {
                r1 = this;
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r1.f3244a
                java.lang.Object r2 = r0.get(r2)
                androidx.recyclerview.widget.j$d0 r2 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r2
                android.view.View r2 = r2.f3179a
                return r2
        }

        /* renamed from: c */
        void m609c() {
                r1 = this;
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r1.f3244a
                r0.clear()
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r1.f3245b
                if (r0 == 0) goto L_0x000c
                r0.clear()
            L_0x000c:
                return
        }

        /* renamed from: c */
        void m607c(int r4, int r5) {
                r3 = this;
                int r5 = r5 + r4
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r3.f3246c
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L_0x0009:
                if (r0 < 0) goto L_0x0026
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r1 = r3.f3246c
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.j$d0 r1 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r1
                if (r1 != 0) goto L_0x0016
                goto L_0x0023
            L_0x0016:
                int r2 = r1.f3181c
                if (r2 < r4) goto L_0x0023
                if (r2 >= r5) goto L_0x0023
                r2 = 2
                r1.m888a(r2)
                r3.m600e(r0)
            L_0x0023:
                int r0 = r0 + (-1)
                goto L_0x0009
            L_0x0026:
                return
        }

        /* renamed from: c */
        void m606c(android.view.View r3) {
                r2 = this;
                androidx.recyclerview.widget.j$d0 r3 = androidx.recyclerview.widget.C0813j.m924k(r3)
                r0 = 12
                boolean r0 = r3.m879b(r0)
                if (r0 != 0) goto L_0x002d
                boolean r0 = r3.m861s()
                if (r0 == 0) goto L_0x002d
                androidx.recyclerview.widget.j r0 = r2.f3252i
                boolean r0 = r0.m988a(r3)
                if (r0 == 0) goto L_0x001b
                goto L_0x002d
            L_0x001b:
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r2.f3245b
                if (r0 != 0) goto L_0x0026
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.f3245b = r0
            L_0x0026:
                r0 = 1
                r3.m884a(r2, r0)
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r2.f3245b
                goto L_0x0067
            L_0x002d:
                boolean r0 = r3.m866n()
                if (r0 == 0) goto L_0x0061
                boolean r0 = r3.m864p()
                if (r0 != 0) goto L_0x0061
                androidx.recyclerview.widget.j r0 = r2.f3252i
                androidx.recyclerview.widget.j$g r0 = r0.f3122l
                boolean r0 = r0.m827b()
                if (r0 == 0) goto L_0x0044
                goto L_0x0061
            L_0x0044:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
                r0.append(r1)
                androidx.recyclerview.widget.j r1 = r2.f3252i
                java.lang.String r1 = r1.m932i()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
            L_0x0061:
                r0 = 0
                r3.m884a(r2, r0)
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r2.f3244a
            L_0x0067:
                r0.add(r3)
                return
        }

        /* renamed from: c */
        void m605c(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r2) {
                r1 = this;
                boolean r0 = r2.f3193o
                if (r0 == 0) goto L_0x0007
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r1.f3245b
                goto L_0x0009
            L_0x0007:
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r1.f3244a
            L_0x0009:
                r0.remove(r2)
                r0 = 0
                r2.f3192n = r0
                r0 = 0
                r2.f3193o = r0
                r2.m877c()
                return
        }

        /* renamed from: d */
        public android.view.View m603d(int r2) {
                r1 = this;
                r0 = 0
                android.view.View r2 = r1.m612b(r2, r0)
                return r2
        }

        /* renamed from: d */
        androidx.recyclerview.widget.C0813j.C0845u m604d() {
                r1 = this;
                androidx.recyclerview.widget.j$u r0 = r1.f3250g
                if (r0 != 0) goto L_0x000b
                androidx.recyclerview.widget.j$u r0 = new androidx.recyclerview.widget.j$u
                r0.<init>()
                r1.f3250g = r0
            L_0x000b:
                androidx.recyclerview.widget.j$u r0 = r1.f3250g
                return r0
        }

        /* renamed from: d */
        boolean m602d(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r8) {
                r7 = this;
                boolean r0 = r8.m864p()
                if (r0 == 0) goto L_0x000f
                androidx.recyclerview.widget.j r8 = r7.f3252i
                androidx.recyclerview.widget.j$a0 r8 = r8.f3115h0
                boolean r8 = r8.m902d()
                return r8
            L_0x000f:
                int r0 = r8.f3181c
                if (r0 < 0) goto L_0x0059
                androidx.recyclerview.widget.j r1 = r7.f3252i
                androidx.recyclerview.widget.j$g r1 = r1.f3122l
                int r1 = r1.mo106a()
                if (r0 >= r1) goto L_0x0059
                androidx.recyclerview.widget.j r0 = r7.f3252i
                androidx.recyclerview.widget.j$a0 r0 = r0.f3115h0
                boolean r0 = r0.m902d()
                r1 = 0
                if (r0 != 0) goto L_0x0039
                androidx.recyclerview.widget.j r0 = r7.f3252i
                androidx.recyclerview.widget.j$g r0 = r0.f3122l
                int r2 = r8.f3181c
                int r0 = r0.mo98b(r2)
                int r2 = r8.m872h()
                if (r0 == r2) goto L_0x0039
                return r1
            L_0x0039:
                androidx.recyclerview.widget.j r0 = r7.f3252i
                androidx.recyclerview.widget.j$g r0 = r0.f3122l
                boolean r0 = r0.m827b()
                r2 = 1
                if (r0 == 0) goto L_0x0058
                long r3 = r8.m873g()
                androidx.recyclerview.widget.j r0 = r7.f3252i
                androidx.recyclerview.widget.j$g r0 = r0.f3122l
                int r8 = r8.f3181c
                long r5 = r0.mo105a(r8)
                int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r8 != 0) goto L_0x0057
                r1 = 1
            L_0x0057:
                return r1
            L_0x0058:
                return r2
            L_0x0059:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid view holder adapter position"
                r1.append(r2)
                r1.append(r8)
                androidx.recyclerview.widget.j r8 = r7.f3252i
                java.lang.String r8 = r8.m932i()
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                r0.<init>(r8)
                throw r0
        }

        /* renamed from: e */
        int m601e() {
                r1 = this;
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r1.f3244a
                int r0 = r0.size()
                return r0
        }

        /* renamed from: e */
        void m600e(int r3) {
                r2 = this;
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r2.f3246c
                java.lang.Object r0 = r0.get(r3)
                androidx.recyclerview.widget.j$d0 r0 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r0
                r1 = 1
                r2.m618a(r0, r1)
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r2.f3246c
                r0.remove(r3)
                return
        }

        /* renamed from: f */
        public java.util.List<androidx.recyclerview.widget.C0813j.AbstractC0821d0> m598f() {
                r1 = this;
                java.util.List<androidx.recyclerview.widget.j$d0> r0 = r1.f3247d
                return r0
        }

        /* renamed from: f */
        public void m597f(int r1) {
                r0 = this;
                r0.f3248e = r1
                r0.m592j()
                return
        }

        /* renamed from: g */
        void m595g() {
                r4 = this;
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r4.f3246c
                int r0 = r0.size()
                r1 = 0
            L_0x0007:
                if (r1 >= r0) goto L_0x0021
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r2 = r4.f3246c
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.j$d0 r2 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r2
                android.view.View r2 = r2.f3179a
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                androidx.recyclerview.widget.j$p r2 = (androidx.recyclerview.widget.C0813j.C0840p) r2
                if (r2 == 0) goto L_0x001e
                r3 = 1
                r2.f3236c = r3
            L_0x001e:
                int r1 = r1 + 1
                goto L_0x0007
            L_0x0021:
                return
        }

        /* renamed from: h */
        void m594h() {
                r4 = this;
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r4.f3246c
                int r0 = r0.size()
                r1 = 0
            L_0x0007:
                if (r1 >= r0) goto L_0x001e
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r2 = r4.f3246c
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.j$d0 r2 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r2
                if (r2 == 0) goto L_0x001b
                r3 = 6
                r2.m888a(r3)
                r3 = 0
                r2.m882a(r3)
            L_0x001b:
                int r1 = r1 + 1
                goto L_0x0007
            L_0x001e:
                androidx.recyclerview.widget.j r0 = r4.f3252i
                androidx.recyclerview.widget.j$g r0 = r0.f3122l
                if (r0 == 0) goto L_0x002a
                boolean r0 = r0.m827b()
                if (r0 != 0) goto L_0x002d
            L_0x002a:
                r4.m593i()
            L_0x002d:
                return
        }

        /* renamed from: i */
        void m593i() {
                r1 = this;
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r1.f3246c
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L_0x0008:
                if (r0 < 0) goto L_0x0010
                r1.m600e(r0)
                int r0 = r0 + (-1)
                goto L_0x0008
            L_0x0010:
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r1.f3246c
                r0.clear()
                boolean r0 = androidx.recyclerview.widget.C0813j.f3072D0
                if (r0 == 0) goto L_0x0020
                androidx.recyclerview.widget.j r0 = r1.f3252i
                androidx.recyclerview.widget.e$b r0 = r0.f3113g0
                r0.m1061a()
            L_0x0020:
                return
        }

        /* renamed from: j */
        void m592j() {
                r3 = this;
                androidx.recyclerview.widget.j r0 = r3.f3252i
                androidx.recyclerview.widget.j$o r0 = r0.f3124m
                if (r0 == 0) goto L_0x0009
                int r0 = r0.f3222m
                goto L_0x000a
            L_0x0009:
                r0 = 0
            L_0x000a:
                int r1 = r3.f3248e
                int r1 = r1 + r0
                r3.f3249f = r1
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r3.f3246c
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L_0x0017:
                if (r0 < 0) goto L_0x0029
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r1 = r3.f3246c
                int r1 = r1.size()
                int r2 = r3.f3249f
                if (r1 <= r2) goto L_0x0029
                r3.m600e(r0)
                int r0 = r0 + (-1)
                goto L_0x0017
            L_0x0029:
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$w */
    /* loaded from: classes.dex */
    public interface AbstractC0848w {
        /* renamed from: a */
        void m591a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1);
    }

    /* renamed from: androidx.recyclerview.widget.j$x */
    /* loaded from: classes.dex */
    private class C0849x extends androidx.recyclerview.widget.C0813j.AbstractC0826i {

        /* renamed from: a */
        final /* synthetic */ androidx.recyclerview.widget.C0813j f3253a;

        C0849x(androidx.recyclerview.widget.C0813j r1) {
                r0 = this;
                r0.f3253a = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.C0813j.AbstractC0826i
        /* renamed from: a */
        public void mo590a() {
                r3 = this;
                androidx.recyclerview.widget.j r0 = r3.f3253a
                r1 = 0
                r0.m974a(r1)
                androidx.recyclerview.widget.j r0 = r3.f3253a
                androidx.recyclerview.widget.j$a0 r1 = r0.f3115h0
                r2 = 1
                r1.f3158g = r2
                r0.m961b(r2)
                androidx.recyclerview.widget.j r0 = r3.f3253a
                androidx.recyclerview.widget.a r0 = r0.f3108e
                boolean r0 = r0.m1142c()
                if (r0 != 0) goto L_0x001f
                androidx.recyclerview.widget.j r0 = r3.f3253a
                r0.requestLayout()
            L_0x001f:
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$y */
    /* loaded from: classes.dex */
    public static class C0850y extends p000a.p033i.p034a.AbstractC0237a {
        public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.C0813j.C0850y> CREATOR = null;

        /* renamed from: d */
        android.os.Parcelable f3254d;

        /* renamed from: androidx.recyclerview.widget.j$y$a */
        /* loaded from: classes.dex */
        static class C0851a implements android.os.Parcelable.ClassLoaderCreator<androidx.recyclerview.widget.C0813j.C0850y> {
            C0851a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public androidx.recyclerview.widget.C0813j.C0850y createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    androidx.recyclerview.widget.j$y r0 = new androidx.recyclerview.widget.j$y
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public androidx.recyclerview.widget.C0813j.C0850y createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    androidx.recyclerview.widget.j$y r0 = new androidx.recyclerview.widget.j$y
                    r0.<init>(r2, r3)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                    r0 = this;
                    androidx.recyclerview.widget.j$y r1 = r0.createFromParcel(r1)
                    return r1
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ androidx.recyclerview.widget.C0813j.C0850y createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                    r0 = this;
                    androidx.recyclerview.widget.j$y r1 = r0.createFromParcel(r1, r2)
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public androidx.recyclerview.widget.C0813j.C0850y[] newArray(int r1) {
                    r0 = this;
                    androidx.recyclerview.widget.j$y[] r1 = new androidx.recyclerview.widget.C0813j.C0850y[r1]
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    androidx.recyclerview.widget.j$y[] r1 = r0.newArray(r1)
                    return r1
            }
        }

        static {
                androidx.recyclerview.widget.j$y$a r0 = new androidx.recyclerview.widget.j$y$a
                r0.<init>()
                androidx.recyclerview.widget.C0813j.C0850y.CREATOR = r0
                return
        }

        C0850y(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                if (r2 == 0) goto L_0x0006
                goto L_0x000c
            L_0x0006:
                java.lang.Class<androidx.recyclerview.widget.j$o> r2 = androidx.recyclerview.widget.C0813j.AbstractC0835o.class
                java.lang.ClassLoader r2 = r2.getClassLoader()
            L_0x000c:
                android.os.Parcelable r1 = r1.readParcelable(r2)
                r0.f3254d = r1
                return
        }

        C0850y(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* renamed from: a */
        void m589a(androidx.recyclerview.widget.C0813j.C0850y r1) {
                r0 = this;
                android.os.Parcelable r1 = r1.f3254d
                r0.f3254d = r1
                return
        }

        @Override // p000a.p033i.p034a.AbstractC0237a, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                super.writeToParcel(r2, r3)
                android.os.Parcelable r3 = r1.f3254d
                r0 = 0
                r2.writeParcelable(r3, r0)
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$z */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0852z {

        /* renamed from: androidx.recyclerview.widget.j$z$a */
        /* loaded from: classes.dex */
        public interface AbstractC0853a {
        }

        /* renamed from: a */
        public abstract int m588a();

        /* renamed from: a */
        public abstract void m587a(int r1);

        /* renamed from: a */
        abstract void m586a(int r1, int r2);

        /* renamed from: a */
        protected abstract void m585a(android.view.View r1);

        /* renamed from: b */
        public abstract boolean m584b();

        /* renamed from: c */
        public abstract boolean m583c();

        /* renamed from: d */
        protected final void m582d() {
                r0 = this;
                r0 = 0
                throw r0
        }
    }

    static {
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 16843830(0x1010436, float:2.369658E-38)
            r1[r2] = r3
            androidx.recyclerview.widget.C0813j.f3077z0 = r1
            int[] r1 = new int[r0]
            r3 = 16842987(0x10100eb, float:2.3694217E-38)
            r1[r2] = r3
            androidx.recyclerview.widget.C0813j.f3069A0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 18
            if (r1 == r3) goto L_0x0025
            r3 = 19
            if (r1 == r3) goto L_0x0025
            r3 = 20
            if (r1 != r3) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r1 = 0
            goto L_0x0026
        L_0x0025:
            r1 = 1
        L_0x0026:
            androidx.recyclerview.widget.C0813j.f3070B0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r1 < r3) goto L_0x0030
            r1 = 1
            goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            androidx.recyclerview.widget.C0813j.f3071C0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 16
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r1 < r3) goto L_0x003f
            r1 = 1
            goto L_0x0040
        L_0x003f:
            r1 = 0
        L_0x0040:
            androidx.recyclerview.widget.C0813j.f3072D0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 15
            if (r1 > r3) goto L_0x004a
            r1 = 1
            goto L_0x004b
        L_0x004a:
            r1 = 0
        L_0x004b:
            androidx.recyclerview.widget.C0813j.f3073E0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 > r3) goto L_0x0053
            r1 = 1
            goto L_0x0054
        L_0x0053:
            r1 = 0
        L_0x0054:
            androidx.recyclerview.widget.C0813j.f3074F0 = r1
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r1[r2] = r3
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            androidx.recyclerview.widget.C0813j.f3075G0 = r1
            androidx.recyclerview.widget.j$c r0 = new androidx.recyclerview.widget.j$c
            r0.<init>()
            androidx.recyclerview.widget.C0813j.f3076H0 = r0
            return
    }

    public C0813j(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public C0813j(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public C0813j(android.content.Context r13, android.util.AttributeSet r14, int r15) {
            r12 = this;
            r12.<init>(r13, r14, r15)
            androidx.recyclerview.widget.j$x r0 = new androidx.recyclerview.widget.j$x
            r0.<init>(r12)
            r12.f3102b = r0
            androidx.recyclerview.widget.j$v r0 = new androidx.recyclerview.widget.j$v
            r0.<init>(r12)
            r12.f3104c = r0
            androidx.recyclerview.widget.o r0 = new androidx.recyclerview.widget.o
            r0.<init>()
            r12.f3112g = r0
            androidx.recyclerview.widget.j$a r0 = new androidx.recyclerview.widget.j$a
            r0.<init>(r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r12.f3116i = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r12.f3118j = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r12.f3120k = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.f3128o = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.f3130p = r0
            r0 = 0
            r12.f3142v = r0
            r12.f3081D = r0
            r12.f3082E = r0
            r12.f3083F = r0
            r12.f3084G = r0
            androidx.recyclerview.widget.j$k r1 = new androidx.recyclerview.widget.j$k
            r1.<init>()
            r12.f3085H = r1
            androidx.recyclerview.widget.c r1 = new androidx.recyclerview.widget.c
            r1.<init>()
            r12.f3090M = r1
            r12.f3091N = r0
            r1 = -1
            r12.f3092O = r1
            r2 = 1
            r12.f3103b0 = r2
            r12.f3105c0 = r2
            r2 = 1
            r12.f3107d0 = r2
            androidx.recyclerview.widget.j$c0 r3 = new androidx.recyclerview.widget.j$c0
            r3.<init>(r12)
            r12.f3109e0 = r3
            boolean r3 = androidx.recyclerview.widget.C0813j.f3072D0
            if (r3 == 0) goto L_0x0077
            androidx.recyclerview.widget.e$b r3 = new androidx.recyclerview.widget.e$b
            r3.<init>()
            goto L_0x0078
        L_0x0077:
            r3 = 0
        L_0x0078:
            r12.f3113g0 = r3
            androidx.recyclerview.widget.j$a0 r3 = new androidx.recyclerview.widget.j$a0
            r3.<init>()
            r12.f3115h0 = r3
            r12.f3121k0 = r0
            r12.f3123l0 = r0
            androidx.recyclerview.widget.j$m r3 = new androidx.recyclerview.widget.j$m
            r3.<init>(r12)
            r12.f3125m0 = r3
            r12.f3127n0 = r0
            r3 = 2
            int[] r4 = new int[r3]
            r12.f3133q0 = r4
            int[] r4 = new int[r3]
            r12.f3137s0 = r4
            int[] r4 = new int[r3]
            r12.f3139t0 = r4
            int[] r4 = new int[r3]
            r12.f3141u0 = r4
            int[] r4 = new int[r3]
            r12.f3143v0 = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r12.f3145w0 = r4
            androidx.recyclerview.widget.j$b r4 = new androidx.recyclerview.widget.j$b
            r4.<init>(r12)
            r12.f3147x0 = r4
            androidx.recyclerview.widget.j$d r4 = new androidx.recyclerview.widget.j$d
            r4.<init>(r12)
            r12.f3149y0 = r4
            if (r14 == 0) goto L_0x00ca
            int[] r4 = androidx.recyclerview.widget.C0813j.f3069A0
            android.content.res.TypedArray r4 = r13.obtainStyledAttributes(r14, r4, r15, r0)
            boolean r5 = r4.getBoolean(r0, r2)
            r12.f3114h = r5
            r4.recycle()
            goto L_0x00cc
        L_0x00ca:
            r12.f3114h = r2
        L_0x00cc:
            r12.setScrollContainer(r2)
            r12.setFocusableInTouchMode(r2)
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r13)
            int r5 = r4.getScaledTouchSlop()
            r12.f3098U = r5
            float r5 = p000a.p018g.p029l.C0220s.m3384b(r4, r13)
            r12.f3103b0 = r5
            float r5 = p000a.p018g.p029l.C0220s.m3383c(r4, r13)
            r12.f3105c0 = r5
            int r5 = r4.getScaledMinimumFlingVelocity()
            r12.f3100W = r5
            int r4 = r4.getScaledMaximumFlingVelocity()
            r12.f3101a0 = r4
            int r4 = r12.getOverScrollMode()
            if (r4 != r3) goto L_0x00fc
            r3 = 1
            goto L_0x00fd
        L_0x00fc:
            r3 = 0
        L_0x00fd:
            r12.setWillNotDraw(r3)
            androidx.recyclerview.widget.j$l r3 = r12.f3090M
            androidx.recyclerview.widget.j$l$b r4 = r12.f3125m0
            r3.m814a(r4)
            r12.m926k()
            r12.m1021G()
            r12.m1022F()
            int r3 = p000a.p018g.p029l.C0216r.m3413h(r12)
            if (r3 != 0) goto L_0x0119
            p000a.p018g.p029l.C0216r.m3418e(r12, r2)
        L_0x0119:
            android.content.Context r3 = r12.getContext()
            java.lang.String r4 = "accessibility"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.view.accessibility.AccessibilityManager r3 = (android.view.accessibility.AccessibilityManager) r3
            r12.f3079B = r3
            androidx.recyclerview.widget.k r3 = new androidx.recyclerview.widget.k
            r3.<init>(r12)
            r12.setAccessibilityDelegateCompat(r3)
            r3 = 262144(0x40000, float:3.67342E-40)
            if (r14 == 0) goto L_0x0195
            int[] r4 = p000a.p044m.C0318b.RecyclerView
            android.content.res.TypedArray r4 = r13.obtainStyledAttributes(r14, r4, r15, r0)
            int r5 = p000a.p044m.C0318b.RecyclerView_layoutManager
            java.lang.String r8 = r4.getString(r5)
            int r5 = p000a.p044m.C0318b.RecyclerView_android_descendantFocusability
            int r5 = r4.getInt(r5, r1)
            if (r5 != r1) goto L_0x014a
            r12.setDescendantFocusability(r3)
        L_0x014a:
            int r1 = p000a.p044m.C0318b.RecyclerView_fastScrollEnabled
            boolean r1 = r4.getBoolean(r1, r0)
            r12.f3138t = r1
            boolean r1 = r12.f3138t
            if (r1 == 0) goto L_0x0175
            int r1 = p000a.p044m.C0318b.RecyclerView_fastScrollVerticalThumbDrawable
            android.graphics.drawable.Drawable r1 = r4.getDrawable(r1)
            android.graphics.drawable.StateListDrawable r1 = (android.graphics.drawable.StateListDrawable) r1
            int r3 = p000a.p044m.C0318b.RecyclerView_fastScrollVerticalTrackDrawable
            android.graphics.drawable.Drawable r3 = r4.getDrawable(r3)
            int r5 = p000a.p044m.C0318b.RecyclerView_fastScrollHorizontalThumbDrawable
            android.graphics.drawable.Drawable r5 = r4.getDrawable(r5)
            android.graphics.drawable.StateListDrawable r5 = (android.graphics.drawable.StateListDrawable) r5
            int r6 = p000a.p044m.C0318b.RecyclerView_fastScrollHorizontalTrackDrawable
            android.graphics.drawable.Drawable r6 = r4.getDrawable(r6)
            r12.m996a(r1, r3, r5, r6)
        L_0x0175:
            r4.recycle()
            r11 = 0
            r6 = r12
            r7 = r13
            r9 = r14
            r10 = r15
            r6.m997a(r7, r8, r9, r10, r11)
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r1 < r3) goto L_0x0198
            int[] r1 = androidx.recyclerview.widget.C0813j.f3077z0
            android.content.res.TypedArray r13 = r13.obtainStyledAttributes(r14, r1, r15, r0)
            boolean r14 = r13.getBoolean(r0, r2)
            r13.recycle()
            r2 = r14
            goto L_0x0198
        L_0x0195:
            r12.setDescendantFocusability(r3)
        L_0x0198:
            r12.setNestedScrollingEnabled(r2)
            return
    }

    /* renamed from: A */
    private void m1027A() {
            r8 = this;
            androidx.recyclerview.widget.j$a0 r0 = r8.f3115h0
            r1 = 1
            r0.m906a(r1)
            androidx.recyclerview.widget.j$a0 r0 = r8.f3115h0
            r8.m989a(r0)
            androidx.recyclerview.widget.j$a0 r0 = r8.f3115h0
            r2 = 0
            r0.f3161j = r2
            r8.m911w()
            androidx.recyclerview.widget.o r0 = r8.f3112g
            r0.m538a()
            r8.m917q()
            r8.m1019I()
            r8.m1014N()
            androidx.recyclerview.widget.j$a0 r0 = r8.f3115h0
            boolean r3 = r0.f3162k
            if (r3 == 0) goto L_0x002c
            boolean r3 = r8.f3123l0
            if (r3 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            r0.f3160i = r1
            r8.f3123l0 = r2
            r8.f3121k0 = r2
            androidx.recyclerview.widget.j$a0 r0 = r8.f3115h0
            boolean r1 = r0.f3163l
            r0.f3159h = r1
            androidx.recyclerview.widget.j$g r1 = r8.f3122l
            int r1 = r1.mo106a()
            r0.f3157f = r1
            int[] r0 = r8.f3133q0
            r8.m972a(r0)
            androidx.recyclerview.widget.j$a0 r0 = r8.f3115h0
            boolean r0 = r0.f3162k
            if (r0 == 0) goto L_0x00b3
            androidx.recyclerview.widget.b r0 = r8.f3110f
            int r0 = r0.m1130a()
            r1 = 0
        L_0x0053:
            if (r1 >= r0) goto L_0x00b3
            androidx.recyclerview.widget.b r3 = r8.f3110f
            android.view.View r3 = r3.m1120c(r1)
            androidx.recyclerview.widget.j$d0 r3 = m924k(r3)
            boolean r4 = r3.m856x()
            if (r4 != 0) goto L_0x00b0
            boolean r4 = r3.m866n()
            if (r4 == 0) goto L_0x0074
            androidx.recyclerview.widget.j$g r4 = r8.f3122l
            boolean r4 = r4.m827b()
            if (r4 != 0) goto L_0x0074
            goto L_0x00b0
        L_0x0074:
            androidx.recyclerview.widget.j$l r4 = r8.f3090M
            androidx.recyclerview.widget.j$a0 r5 = r8.f3115h0
            int r6 = androidx.recyclerview.widget.C0813j.AbstractC0829l.m806e(r3)
            java.util.List r7 = r3.m869k()
            androidx.recyclerview.widget.j$l$c r4 = r4.m816a(r5, r3, r6, r7)
            androidx.recyclerview.widget.o r5 = r8.f3112g
            r5.m527c(r3, r4)
            androidx.recyclerview.widget.j$a0 r4 = r8.f3115h0
            boolean r4 = r4.f3160i
            if (r4 == 0) goto L_0x00b0
            boolean r4 = r3.m861s()
            if (r4 == 0) goto L_0x00b0
            boolean r4 = r3.m864p()
            if (r4 != 0) goto L_0x00b0
            boolean r4 = r3.m856x()
            if (r4 != 0) goto L_0x00b0
            boolean r4 = r3.m866n()
            if (r4 != 0) goto L_0x00b0
            long r4 = r8.m955c(r3)
            androidx.recyclerview.widget.o r6 = r8.f3112g
            r6.m536a(r4, r3)
        L_0x00b0:
            int r1 = r1 + 1
            goto L_0x0053
        L_0x00b3:
            androidx.recyclerview.widget.j$a0 r0 = r8.f3115h0
            boolean r0 = r0.f3163l
            if (r0 == 0) goto L_0x0117
            r8.m912v()
            androidx.recyclerview.widget.j$a0 r0 = r8.f3115h0
            boolean r1 = r0.f3158g
            r0.f3158g = r2
            androidx.recyclerview.widget.j$o r3 = r8.f3124m
            androidx.recyclerview.widget.j$v r4 = r8.f3104c
            r3.mo693e(r4, r0)
            androidx.recyclerview.widget.j$a0 r0 = r8.f3115h0
            r0.f3158g = r1
            r0 = 0
        L_0x00ce:
            androidx.recyclerview.widget.b r1 = r8.f3110f
            int r1 = r1.m1130a()
            if (r0 >= r1) goto L_0x0117
            androidx.recyclerview.widget.b r1 = r8.f3110f
            android.view.View r1 = r1.m1120c(r0)
            androidx.recyclerview.widget.j$d0 r1 = m924k(r1)
            boolean r3 = r1.m856x()
            if (r3 == 0) goto L_0x00e7
            goto L_0x0114
        L_0x00e7:
            androidx.recyclerview.widget.o r3 = r8.f3112g
            boolean r3 = r3.m528c(r1)
            if (r3 != 0) goto L_0x0114
            int r3 = androidx.recyclerview.widget.C0813j.AbstractC0829l.m806e(r1)
            r4 = 8192(0x2000, float:1.14794E-41)
            boolean r4 = r1.m879b(r4)
            if (r4 != 0) goto L_0x00fd
            r3 = r3 | 4096(0x1000, float:5.74E-42)
        L_0x00fd:
            androidx.recyclerview.widget.j$l r5 = r8.f3090M
            androidx.recyclerview.widget.j$a0 r6 = r8.f3115h0
            java.util.List r7 = r1.m869k()
            androidx.recyclerview.widget.j$l$c r3 = r5.m816a(r6, r1, r3, r7)
            if (r4 == 0) goto L_0x010f
            r8.m985a(r1, r3)
            goto L_0x0114
        L_0x010f:
            androidx.recyclerview.widget.o r4 = r8.f3112g
            r4.m533a(r1, r3)
        L_0x0114:
            int r0 = r0 + 1
            goto L_0x00ce
        L_0x0117:
            r8.m1012a()
            r8.m916r()
            r8.m954c(r2)
            androidx.recyclerview.widget.j$a0 r0 = r8.f3115h0
            r1 = 2
            r0.f3156e = r1
            return
    }

    /* renamed from: B */
    private void m1026B() {
            r4 = this;
            r4.m911w()
            r4.m917q()
            androidx.recyclerview.widget.j$a0 r0 = r4.f3115h0
            r1 = 6
            r0.m906a(r1)
            androidx.recyclerview.widget.a r0 = r4.f3108e
            r0.m1146b()
            androidx.recyclerview.widget.j$a0 r0 = r4.f3115h0
            androidx.recyclerview.widget.j$g r1 = r4.f3122l
            int r1 = r1.mo106a()
            r0.f3157f = r1
            androidx.recyclerview.widget.j$a0 r0 = r4.f3115h0
            r1 = 0
            r0.f3155d = r1
            r0.f3159h = r1
            androidx.recyclerview.widget.j$o r2 = r4.f3124m
            androidx.recyclerview.widget.j$v r3 = r4.f3104c
            r2.mo693e(r3, r0)
            androidx.recyclerview.widget.j$a0 r0 = r4.f3115h0
            r0.f3158g = r1
            r2 = 0
            r4.f3106d = r2
            boolean r2 = r0.f3162k
            if (r2 == 0) goto L_0x003a
            androidx.recyclerview.widget.j$l r2 = r4.f3090M
            if (r2 == 0) goto L_0x003a
            r2 = 1
            goto L_0x003b
        L_0x003a:
            r2 = 0
        L_0x003b:
            r0.f3162k = r2
            androidx.recyclerview.widget.j$a0 r0 = r4.f3115h0
            r2 = 4
            r0.f3156e = r2
            r4.m916r()
            r4.m954c(r1)
            return
    }

    /* renamed from: C */
    private void m1025C() {
            r11 = this;
            androidx.recyclerview.widget.j$a0 r0 = r11.f3115h0
            r1 = 4
            r0.m906a(r1)
            r11.m911w()
            r11.m917q()
            androidx.recyclerview.widget.j$a0 r0 = r11.f3115h0
            r1 = 1
            r0.f3156e = r1
            boolean r0 = r0.f3162k
            if (r0 == 0) goto L_0x0088
            androidx.recyclerview.widget.b r0 = r11.f3110f
            int r0 = r0.m1130a()
            int r0 = r0 - r1
        L_0x001c:
            if (r0 < 0) goto L_0x0081
            androidx.recyclerview.widget.b r2 = r11.f3110f
            android.view.View r2 = r2.m1120c(r0)
            androidx.recyclerview.widget.j$d0 r5 = m924k(r2)
            boolean r2 = r5.m856x()
            if (r2 == 0) goto L_0x002f
            goto L_0x007e
        L_0x002f:
            long r2 = r11.m955c(r5)
            androidx.recyclerview.widget.j$l r4 = r11.f3090M
            androidx.recyclerview.widget.j$a0 r6 = r11.f3115h0
            androidx.recyclerview.widget.j$l$c r4 = r4.m817a(r6, r5)
            androidx.recyclerview.widget.o r6 = r11.f3112g
            androidx.recyclerview.widget.j$d0 r6 = r6.m537a(r2)
            if (r6 == 0) goto L_0x0079
            boolean r7 = r6.m856x()
            if (r7 != 0) goto L_0x0079
            androidx.recyclerview.widget.o r7 = r11.f3112g
            boolean r8 = r7.m530b(r6)
            androidx.recyclerview.widget.o r7 = r11.f3112g
            boolean r9 = r7.m530b(r5)
            if (r8 == 0) goto L_0x005a
            if (r6 != r5) goto L_0x005a
            goto L_0x0079
        L_0x005a:
            androidx.recyclerview.widget.o r7 = r11.f3112g
            androidx.recyclerview.widget.j$l$c r7 = r7.m524f(r6)
            androidx.recyclerview.widget.o r10 = r11.f3112g
            r10.m529b(r5, r4)
            androidx.recyclerview.widget.o r4 = r11.f3112g
            androidx.recyclerview.widget.j$l$c r10 = r4.m525e(r5)
            if (r7 != 0) goto L_0x0071
            r11.m999a(r2, r5, r6)
            goto L_0x007e
        L_0x0071:
            r3 = r11
            r4 = r6
            r6 = r7
            r7 = r10
            r3.m986a(r4, r5, r6, r7, r8, r9)
            goto L_0x007e
        L_0x0079:
            androidx.recyclerview.widget.o r2 = r11.f3112g
            r2.m529b(r5, r4)
        L_0x007e:
            int r0 = r0 + (-1)
            goto L_0x001c
        L_0x0081:
            androidx.recyclerview.widget.o r0 = r11.f3112g
            androidx.recyclerview.widget.o$b r2 = r11.f3149y0
            r0.m532a(r2)
        L_0x0088:
            androidx.recyclerview.widget.j$o r0 = r11.f3124m
            androidx.recyclerview.widget.j$v r2 = r11.f3104c
            r0.m710c(r2)
            androidx.recyclerview.widget.j$a0 r0 = r11.f3115h0
            int r2 = r0.f3157f
            r0.f3154c = r2
            r2 = 0
            r11.f3081D = r2
            r11.f3082E = r2
            r0.f3162k = r2
            r0.f3163l = r2
            androidx.recyclerview.widget.j$o r0 = r11.f3124m
            r0.f3217h = r2
            androidx.recyclerview.widget.j$v r0 = r11.f3104c
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r0.f3245b
            if (r0 == 0) goto L_0x00ab
            r0.clear()
        L_0x00ab:
            androidx.recyclerview.widget.j$o r0 = r11.f3124m
            boolean r3 = r0.f3223n
            if (r3 == 0) goto L_0x00ba
            r0.f3222m = r2
            r0.f3223n = r2
            androidx.recyclerview.widget.j$v r0 = r11.f3104c
            r0.m592j()
        L_0x00ba:
            androidx.recyclerview.widget.j$o r0 = r11.f3124m
            androidx.recyclerview.widget.j$a0 r3 = r11.f3115h0
            r0.mo683g(r3)
            r11.m916r()
            r11.m954c(r2)
            androidx.recyclerview.widget.o r0 = r11.f3112g
            r0.m538a()
            int[] r0 = r11.f3133q0
            r3 = r0[r2]
            r0 = r0[r1]
            boolean r0 = r11.m925k(r3, r0)
            if (r0 == 0) goto L_0x00db
            r11.m951d(r2, r2)
        L_0x00db:
            r11.m1018J()
            r11.m1016L()
            return
    }

    /* renamed from: D */
    private android.view.View m1024D() {
            r5 = this;
            androidx.recyclerview.widget.j$a0 r0 = r5.f3115h0
            int r0 = r0.f3164m
            r1 = -1
            if (r0 == r1) goto L_0x0008
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            androidx.recyclerview.widget.j$a0 r1 = r5.f3115h0
            int r1 = r1.m907a()
            r2 = r0
        L_0x0010:
            if (r2 >= r1) goto L_0x0027
            androidx.recyclerview.widget.j$d0 r3 = r5.m959c(r2)
            if (r3 != 0) goto L_0x0019
            goto L_0x0027
        L_0x0019:
            android.view.View r4 = r3.f3179a
            boolean r4 = r4.hasFocusable()
            if (r4 == 0) goto L_0x0024
            android.view.View r0 = r3.f3179a
            return r0
        L_0x0024:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x0027:
            int r0 = java.lang.Math.min(r1, r0)
            int r0 = r0 + (-1)
        L_0x002d:
            r1 = 0
            if (r0 < 0) goto L_0x0045
            androidx.recyclerview.widget.j$d0 r2 = r5.m959c(r0)
            if (r2 != 0) goto L_0x0037
            return r1
        L_0x0037:
            android.view.View r1 = r2.f3179a
            boolean r1 = r1.hasFocusable()
            if (r1 == 0) goto L_0x0042
            android.view.View r0 = r2.f3179a
            return r0
        L_0x0042:
            int r0 = r0 + (-1)
            goto L_0x002d
        L_0x0045:
            return r1
    }

    /* renamed from: E */
    private boolean m1023E() {
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.f3110f
            int r0 = r0.m1130a()
            r1 = 0
            r2 = 0
        L_0x0008:
            if (r2 >= r0) goto L_0x0028
            androidx.recyclerview.widget.b r3 = r5.f3110f
            android.view.View r3 = r3.m1120c(r2)
            androidx.recyclerview.widget.j$d0 r3 = m924k(r3)
            if (r3 == 0) goto L_0x0025
            boolean r4 = r3.m856x()
            if (r4 == 0) goto L_0x001d
            goto L_0x0025
        L_0x001d:
            boolean r3 = r3.m861s()
            if (r3 == 0) goto L_0x0025
            r0 = 1
            return r0
        L_0x0025:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x0028:
            return r1
    }

    @android.annotation.SuppressLint({"InlinedApi"})
    /* renamed from: F */
    private void m1022F() {
            r1 = this;
            int r0 = p000a.p018g.p029l.C0216r.m3412i(r1)
            if (r0 != 0) goto L_0x000b
            r0 = 8
            p000a.p018g.p029l.C0216r.m3416f(r1, r0)
        L_0x000b:
            return
    }

    /* renamed from: G */
    private void m1021G() {
            r2 = this;
            androidx.recyclerview.widget.b r0 = new androidx.recyclerview.widget.b
            androidx.recyclerview.widget.j$e r1 = new androidx.recyclerview.widget.j$e
            r1.<init>(r2)
            r0.<init>(r1)
            r2.f3110f = r0
            return
    }

    /* renamed from: H */
    private boolean m1020H() {
            r1 = this;
            androidx.recyclerview.widget.j$l r0 = r1.f3090M
            if (r0 == 0) goto L_0x000e
            androidx.recyclerview.widget.j$o r0 = r1.f3124m
            boolean r0 = r0.mo789C()
            if (r0 == 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
    }

    /* renamed from: I */
    private void m1019I() {
            r5 = this;
            boolean r0 = r5.f3081D
            if (r0 == 0) goto L_0x0012
            androidx.recyclerview.widget.a r0 = r5.f3108e
            r0.m1134f()
            boolean r0 = r5.f3082E
            if (r0 == 0) goto L_0x0012
            androidx.recyclerview.widget.j$o r0 = r5.f3124m
            r0.mo699d(r5)
        L_0x0012:
            boolean r0 = r5.m1020H()
            if (r0 == 0) goto L_0x001e
            androidx.recyclerview.widget.a r0 = r5.f3108e
            r0.m1136e()
            goto L_0x0023
        L_0x001e:
            androidx.recyclerview.widget.a r0 = r5.f3108e
            r0.m1146b()
        L_0x0023:
            boolean r0 = r5.f3121k0
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0030
            boolean r0 = r5.f3123l0
            if (r0 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r0 = 0
            goto L_0x0031
        L_0x0030:
            r0 = 1
        L_0x0031:
            androidx.recyclerview.widget.j$a0 r3 = r5.f3115h0
            boolean r4 = r5.f3140u
            if (r4 == 0) goto L_0x0055
            androidx.recyclerview.widget.j$l r4 = r5.f3090M
            if (r4 == 0) goto L_0x0055
            boolean r4 = r5.f3081D
            if (r4 != 0) goto L_0x0047
            if (r0 != 0) goto L_0x0047
            androidx.recyclerview.widget.j$o r4 = r5.f3124m
            boolean r4 = r4.f3217h
            if (r4 == 0) goto L_0x0055
        L_0x0047:
            boolean r4 = r5.f3081D
            if (r4 == 0) goto L_0x0053
            androidx.recyclerview.widget.j$g r4 = r5.f3122l
            boolean r4 = r4.m827b()
            if (r4 == 0) goto L_0x0055
        L_0x0053:
            r4 = 1
            goto L_0x0056
        L_0x0055:
            r4 = 0
        L_0x0056:
            r3.f3162k = r4
            androidx.recyclerview.widget.j$a0 r3 = r5.f3115h0
            boolean r4 = r3.f3162k
            if (r4 == 0) goto L_0x006b
            if (r0 == 0) goto L_0x006b
            boolean r0 = r5.f3081D
            if (r0 != 0) goto L_0x006b
            boolean r0 = r5.m1020H()
            if (r0 == 0) goto L_0x006b
            r1 = 1
        L_0x006b:
            r3.f3163l = r1
            return
    }

    /* renamed from: J */
    private void m1018J() {
            r7 = this;
            boolean r0 = r7.f3107d0
            if (r0 == 0) goto L_0x00b2
            androidx.recyclerview.widget.j$g r0 = r7.f3122l
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r7.hasFocus()
            if (r0 == 0) goto L_0x00b2
            int r0 = r7.getDescendantFocusability()
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r1) goto L_0x00b2
            int r0 = r7.getDescendantFocusability()
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r1) goto L_0x0026
            boolean r0 = r7.isFocused()
            if (r0 == 0) goto L_0x0026
            goto L_0x00b2
        L_0x0026:
            boolean r0 = r7.isFocused()
            if (r0 != 0) goto L_0x0055
            android.view.View r0 = r7.getFocusedChild()
            boolean r1 = androidx.recyclerview.widget.C0813j.f3074F0
            if (r1 == 0) goto L_0x004c
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L_0x0040
            boolean r1 = r0.hasFocus()
            if (r1 != 0) goto L_0x004c
        L_0x0040:
            androidx.recyclerview.widget.b r0 = r7.f3110f
            int r0 = r0.m1130a()
            if (r0 != 0) goto L_0x0055
            r7.requestFocus()
            return
        L_0x004c:
            androidx.recyclerview.widget.b r1 = r7.f3110f
            boolean r0 = r1.m1119c(r0)
            if (r0 != 0) goto L_0x0055
            return
        L_0x0055:
            androidx.recyclerview.widget.j$a0 r0 = r7.f3115h0
            long r0 = r0.f3165n
            r2 = -1
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0071
            androidx.recyclerview.widget.j$g r0 = r7.f3122l
            boolean r0 = r0.m827b()
            if (r0 == 0) goto L_0x0071
            androidx.recyclerview.widget.j$a0 r0 = r7.f3115h0
            long r0 = r0.f3165n
            androidx.recyclerview.widget.j$d0 r0 = r7.m1000a(r0)
            goto L_0x0072
        L_0x0071:
            r0 = r4
        L_0x0072:
            if (r0 == 0) goto L_0x008a
            androidx.recyclerview.widget.b r1 = r7.f3110f
            android.view.View r5 = r0.f3179a
            boolean r1 = r1.m1119c(r5)
            if (r1 != 0) goto L_0x008a
            android.view.View r1 = r0.f3179a
            boolean r1 = r1.hasFocusable()
            if (r1 != 0) goto L_0x0087
            goto L_0x008a
        L_0x0087:
            android.view.View r4 = r0.f3179a
            goto L_0x0096
        L_0x008a:
            androidx.recyclerview.widget.b r0 = r7.f3110f
            int r0 = r0.m1130a()
            if (r0 <= 0) goto L_0x0096
            android.view.View r4 = r7.m1024D()
        L_0x0096:
            if (r4 == 0) goto L_0x00b2
            androidx.recyclerview.widget.j$a0 r0 = r7.f3115h0
            int r0 = r0.f3166o
            long r5 = (long) r0
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x00ae
            android.view.View r0 = r4.findViewById(r0)
            if (r0 == 0) goto L_0x00ae
            boolean r1 = r0.isFocusable()
            if (r1 == 0) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            r0 = r4
        L_0x00af:
            r0.requestFocus()
        L_0x00b2:
            return
    }

    /* renamed from: K */
    private void m1017K() {
            r2 = this;
            android.widget.EdgeEffect r0 = r2.f3086I
            if (r0 == 0) goto L_0x000e
            r0.onRelease()
            android.widget.EdgeEffect r0 = r2.f3086I
            boolean r0 = r0.isFinished()
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            android.widget.EdgeEffect r1 = r2.f3087J
            if (r1 == 0) goto L_0x001d
            r1.onRelease()
            android.widget.EdgeEffect r1 = r2.f3087J
            boolean r1 = r1.isFinished()
            r0 = r0 | r1
        L_0x001d:
            android.widget.EdgeEffect r1 = r2.f3088K
            if (r1 == 0) goto L_0x002b
            r1.onRelease()
            android.widget.EdgeEffect r1 = r2.f3088K
            boolean r1 = r1.isFinished()
            r0 = r0 | r1
        L_0x002b:
            android.widget.EdgeEffect r1 = r2.f3089L
            if (r1 == 0) goto L_0x0039
            r1.onRelease()
            android.widget.EdgeEffect r1 = r2.f3089L
            boolean r1 = r1.isFinished()
            r0 = r0 | r1
        L_0x0039:
            if (r0 == 0) goto L_0x003e
            p000a.p018g.p029l.C0216r.m3450A(r2)
        L_0x003e:
            return
    }

    /* renamed from: L */
    private void m1016L() {
            r3 = this;
            androidx.recyclerview.widget.j$a0 r0 = r3.f3115h0
            r1 = -1
            r0.f3165n = r1
            r1 = -1
            r0.f3164m = r1
            r0.f3166o = r1
            return
    }

    /* renamed from: M */
    private void m1015M() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.f3093P
            if (r0 == 0) goto L_0x0007
            r0.clear()
        L_0x0007:
            r0 = 0
            r1.mo1010a(r0)
            r1.m1017K()
            return
    }

    /* renamed from: N */
    private void m1014N() {
            r4 = this;
            boolean r0 = r4.f3107d0
            r1 = 0
            if (r0 == 0) goto L_0x0014
            boolean r0 = r4.hasFocus()
            if (r0 == 0) goto L_0x0014
            androidx.recyclerview.widget.j$g r0 = r4.f3122l
            if (r0 == 0) goto L_0x0014
            android.view.View r0 = r4.getFocusedChild()
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 != 0) goto L_0x0018
            goto L_0x001c
        L_0x0018:
            androidx.recyclerview.widget.j$d0 r1 = r4.m950d(r0)
        L_0x001c:
            if (r1 != 0) goto L_0x0022
            r4.m1016L()
            goto L_0x0056
        L_0x0022:
            androidx.recyclerview.widget.j$a0 r0 = r4.f3115h0
            androidx.recyclerview.widget.j$g r2 = r4.f3122l
            boolean r2 = r2.m827b()
            if (r2 == 0) goto L_0x0031
            long r2 = r1.m873g()
            goto L_0x0033
        L_0x0031:
            r2 = -1
        L_0x0033:
            r0.f3165n = r2
            androidx.recyclerview.widget.j$a0 r0 = r4.f3115h0
            boolean r2 = r4.f3081D
            if (r2 == 0) goto L_0x003d
            r2 = -1
            goto L_0x004a
        L_0x003d:
            boolean r2 = r1.m864p()
            if (r2 == 0) goto L_0x0046
            int r2 = r1.f3182d
            goto L_0x004a
        L_0x0046:
            int r2 = r1.m874f()
        L_0x004a:
            r0.f3164m = r2
            androidx.recyclerview.widget.j$a0 r0 = r4.f3115h0
            android.view.View r1 = r1.f3179a
            int r1 = r4.m922l(r1)
            r0.f3166o = r1
        L_0x0056:
            return
    }

    /* renamed from: O */
    private void m1013O() {
            r1 = this;
            androidx.recyclerview.widget.j$c0 r0 = r1.f3109e0
            r0.m893b()
            androidx.recyclerview.widget.j$o r0 = r1.f3124m
            if (r0 == 0) goto L_0x000c
            r0.m790B()
        L_0x000c:
            return
    }

    /* renamed from: a */
    private java.lang.String m998a(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            char r0 = r4.charAt(r0)
            r1 = 46
            if (r0 != r1) goto L_0x001d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r3.getPackageName()
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            return r3
        L_0x001d:
            java.lang.String r3 = "."
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x0026
            return r4
        L_0x0026:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class<androidx.recyclerview.widget.j> r0 = androidx.recyclerview.widget.C0813j.class
            java.lang.Package r0 = r0.getPackage()
            java.lang.String r0 = r0.getName()
            r3.append(r0)
            r3.append(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            return r3
    }

    /* renamed from: a */
    private void m1011a(float r7, float r8, float r9, float r10) {
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.m943f()
            android.widget.EdgeEffect r3 = r6.f3086I
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
        L_0x001c:
            androidx.core.widget.C0715d.m1509a(r3, r4, r9)
            r9 = 1
            goto L_0x0039
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0038
            r6.m939g()
            android.widget.EdgeEffect r3 = r6.f3088K
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L_0x001c
        L_0x0038:
            r9 = 0
        L_0x0039:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0053
            r6.m935h()
            android.widget.EdgeEffect r9 = r6.f3087J
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.C0715d.m1509a(r9, r0, r7)
            goto L_0x006f
        L_0x0053:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x006e
            r6.m948e()
            android.widget.EdgeEffect r9 = r6.f3089L
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.C0715d.m1509a(r9, r3, r0)
            goto L_0x006f
        L_0x006e:
            r1 = r9
        L_0x006f:
            if (r1 != 0) goto L_0x0079
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0079
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007c
        L_0x0079:
            p000a.p018g.p029l.C0216r.m3450A(r6)
        L_0x007c:
            return
    }

    /* renamed from: a */
    private void m999a(long r7, androidx.recyclerview.widget.C0813j.AbstractC0821d0 r9, androidx.recyclerview.widget.C0813j.AbstractC0821d0 r10) {
            r6 = this;
            androidx.recyclerview.widget.b r0 = r6.f3110f
            int r0 = r0.m1130a()
            r1 = 0
        L_0x0007:
            if (r1 >= r0) goto L_0x0075
            androidx.recyclerview.widget.b r2 = r6.f3110f
            android.view.View r2 = r2.m1120c(r1)
            androidx.recyclerview.widget.j$d0 r2 = m924k(r2)
            if (r2 != r9) goto L_0x0016
            goto L_0x0072
        L_0x0016:
            long r3 = r6.m955c(r2)
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x0072
            androidx.recyclerview.widget.j$g r7 = r6.f3122l
            java.lang.String r8 = " \n View Holder 2:"
            if (r7 == 0) goto L_0x004e
            boolean r7 = r7.m827b()
            if (r7 == 0) goto L_0x004e
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r10.append(r0)
            r10.append(r2)
            r10.append(r8)
            r10.append(r9)
            java.lang.String r8 = r6.m932i()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r7.<init>(r8)
            throw r7
        L_0x004e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r10.append(r0)
            r10.append(r2)
            r10.append(r8)
            r10.append(r9)
            java.lang.String r8 = r6.m932i()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r7.<init>(r8)
            throw r7
        L_0x0072:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x0075:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r7.append(r8)
            r7.append(r10)
            java.lang.String r8 = " cannot be found but it is necessary for "
            r7.append(r8)
            r7.append(r9)
            java.lang.String r8 = r6.m932i()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "RecyclerView"
            android.util.Log.e(r8, r7)
            return
    }

    /* renamed from: a */
    private void m997a(android.content.Context r8, java.lang.String r9, android.util.AttributeSet r10, int r11, int r12) {
            r7 = this;
            java.lang.String r0 = ": Could not instantiate the LayoutManager: "
            if (r9 == 0) goto L_0x011d
            java.lang.String r9 = r9.trim()
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto L_0x011d
            java.lang.String r9 = r7.m998a(r8, r9)
            boolean r1 = r7.isInEditMode()     // Catch: ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            if (r1 == 0) goto L_0x0021
            java.lang.Class r1 = r7.getClass()     // Catch: ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            goto L_0x0025
        L_0x0021:
            java.lang.ClassLoader r1 = r8.getClassLoader()     // Catch: ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
        L_0x0025:
            java.lang.Class r1 = r1.loadClass(r9)     // Catch: ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            java.lang.Class<androidx.recyclerview.widget.j$o> r2 = androidx.recyclerview.widget.C0813j.AbstractC0835o.class
            java.lang.Class r1 = r1.asSubclass(r2)     // Catch: ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            r2 = 0
            r3 = 1
            r4 = 0
            java.lang.Class<?>[] r5 = androidx.recyclerview.widget.C0813j.f3075G0     // Catch: NoSuchMethodException -> 0x004f, ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            java.lang.reflect.Constructor r5 = r1.getConstructor(r5)     // Catch: NoSuchMethodException -> 0x004f, ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: NoSuchMethodException -> 0x004f, ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            r6[r4] = r8     // Catch: NoSuchMethodException -> 0x004f, ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            r6[r3] = r10     // Catch: NoSuchMethodException -> 0x004f, ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            r8 = 2
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: NoSuchMethodException -> 0x004f, ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            r6[r8] = r11     // Catch: NoSuchMethodException -> 0x004f, ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            r8 = 3
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)     // Catch: NoSuchMethodException -> 0x004f, ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            r6[r8] = r11     // Catch: NoSuchMethodException -> 0x004f, ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            r2 = r6
            goto L_0x0056
        L_0x004f:
            r8 = move-exception
            java.lang.Class[] r11 = new java.lang.Class[r4]     // Catch: NoSuchMethodException -> 0x0064, ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            java.lang.reflect.Constructor r5 = r1.getConstructor(r11)     // Catch: NoSuchMethodException -> 0x0064, ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
        L_0x0056:
            r5.setAccessible(r3)     // Catch: ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            java.lang.Object r8 = r5.newInstance(r2)     // Catch: ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            androidx.recyclerview.widget.j$o r8 = (androidx.recyclerview.widget.C0813j.AbstractC0835o) r8     // Catch: ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            r7.setLayoutManager(r8)     // Catch: ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            goto L_0x011d
        L_0x0064:
            r11 = move-exception
            r11.initCause(r8)     // Catch: ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            r12.<init>()     // Catch: ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            java.lang.String r1 = r10.getPositionDescription()     // Catch: ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            r12.append(r1)     // Catch: ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            java.lang.String r1 = ": Error creating LayoutManager "
            r12.append(r1)     // Catch: ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            r12.append(r9)     // Catch: ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            java.lang.String r12 = r12.toString()     // Catch: ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            r8.<init>(r12, r11)     // Catch: ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
            throw r8     // Catch: ClassCastException -> 0x0086, IllegalAccessException -> 0x00a5, InstantiationException -> 0x00c4, InvocationTargetException -> 0x00e1, ClassNotFoundException -> 0x00fe
        L_0x0086:
            r8 = move-exception
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r12.append(r10)
            java.lang.String r10 = ": Class is not a LayoutManager "
            r12.append(r10)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r11.<init>(r9, r8)
            throw r11
        L_0x00a5:
            r8 = move-exception
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r12.append(r10)
            java.lang.String r10 = ": Cannot access non-public constructor "
            r12.append(r10)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r11.<init>(r9, r8)
            throw r11
        L_0x00c4:
            r8 = move-exception
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r12.append(r10)
            r12.append(r0)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r11.<init>(r9, r8)
            throw r11
        L_0x00e1:
            r8 = move-exception
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r12.append(r10)
            r12.append(r0)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r11.<init>(r9, r8)
            throw r11
        L_0x00fe:
            r8 = move-exception
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r12.append(r10)
            java.lang.String r10 = ": Unable to find LayoutManager "
            r12.append(r10)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r11.<init>(r9, r8)
            throw r11
        L_0x011d:
            return
    }

    /* renamed from: a */
    static void m993a(android.view.View r6, android.graphics.Rect r7) {
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            androidx.recyclerview.widget.j$p r0 = (androidx.recyclerview.widget.C0813j.C0840p) r0
            android.graphics.Rect r1 = r0.f3235b
            int r2 = r6.getLeft()
            int r3 = r1.left
            int r2 = r2 - r3
            int r3 = r0.leftMargin
            int r2 = r2 - r3
            int r3 = r6.getTop()
            int r4 = r1.top
            int r3 = r3 - r4
            int r4 = r0.topMargin
            int r3 = r3 - r4
            int r4 = r6.getRight()
            int r5 = r1.right
            int r4 = r4 + r5
            int r5 = r0.rightMargin
            int r4 = r4 + r5
            int r6 = r6.getBottom()
            int r1 = r1.bottom
            int r6 = r6 + r1
            int r0 = r0.bottomMargin
            int r6 = r6 + r0
            r7.set(r2, r3, r4, r6)
            return
    }

    /* renamed from: a */
    private void m992a(android.view.View r12, android.view.View r13) {
            r11 = this;
            if (r13 == 0) goto L_0x0004
            r0 = r13
            goto L_0x0005
        L_0x0004:
            r0 = r12
        L_0x0005:
            android.graphics.Rect r1 = r11.f3116i
            int r2 = r0.getWidth()
            int r3 = r0.getHeight()
            r4 = 0
            r1.set(r4, r4, r2, r3)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof androidx.recyclerview.widget.C0813j.C0840p
            if (r1 == 0) goto L_0x0041
            androidx.recyclerview.widget.j$p r0 = (androidx.recyclerview.widget.C0813j.C0840p) r0
            boolean r1 = r0.f3236c
            if (r1 != 0) goto L_0x0041
            android.graphics.Rect r0 = r0.f3235b
            android.graphics.Rect r1 = r11.f3116i
            int r2 = r1.left
            int r3 = r0.left
            int r2 = r2 - r3
            r1.left = r2
            int r2 = r1.right
            int r3 = r0.right
            int r2 = r2 + r3
            r1.right = r2
            int r2 = r1.top
            int r3 = r0.top
            int r2 = r2 - r3
            r1.top = r2
            int r2 = r1.bottom
            int r0 = r0.bottom
            int r2 = r2 + r0
            r1.bottom = r2
        L_0x0041:
            if (r13 == 0) goto L_0x004d
            android.graphics.Rect r0 = r11.f3116i
            r11.offsetDescendantRectToMyCoords(r13, r0)
            android.graphics.Rect r0 = r11.f3116i
            r11.offsetRectIntoDescendantCoords(r12, r0)
        L_0x004d:
            androidx.recyclerview.widget.j$o r5 = r11.f3124m
            android.graphics.Rect r8 = r11.f3116i
            boolean r0 = r11.f3140u
            r1 = 1
            r9 = r0 ^ 1
            if (r13 != 0) goto L_0x005a
            r10 = 1
            goto L_0x005b
        L_0x005a:
            r10 = 0
        L_0x005b:
            r6 = r11
            r7 = r12
            r5.m739a(r6, r7, r8, r9, r10)
            return
    }

    /* renamed from: a */
    private void m986a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r2, androidx.recyclerview.widget.C0813j.AbstractC0821d0 r3, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r4, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r5, boolean r6, boolean r7) {
            r1 = this;
            r0 = 0
            r2.m881a(r0)
            if (r6 == 0) goto L_0x0009
            r1.m949d(r2)
        L_0x0009:
            if (r2 == r3) goto L_0x001f
            if (r7 == 0) goto L_0x0010
            r1.m949d(r3)
        L_0x0010:
            r2.f3186h = r3
            r1.m949d(r2)
            androidx.recyclerview.widget.j$v r6 = r1.f3104c
            r6.m605c(r2)
            r3.m881a(r0)
            r3.f3187i = r2
        L_0x001f:
            androidx.recyclerview.widget.j$l r6 = r1.f3090M
            boolean r2 = r6.mo572a(r2, r3, r4, r5)
            if (r2 == 0) goto L_0x002a
            r1.m915s()
        L_0x002a:
            return
    }

    /* renamed from: a */
    private void m983a(androidx.recyclerview.widget.C0813j.AbstractC0824g r3, boolean r4, boolean r5) {
            r2 = this;
            androidx.recyclerview.widget.j$g r0 = r2.f3122l
            if (r0 == 0) goto L_0x000e
            androidx.recyclerview.widget.j$x r1 = r2.f3102b
            r0.m825b(r1)
            androidx.recyclerview.widget.j$g r0 = r2.f3122l
            r0.m824b(r2)
        L_0x000e:
            if (r4 == 0) goto L_0x0012
            if (r5 == 0) goto L_0x0015
        L_0x0012:
            r2.m914t()
        L_0x0015:
            androidx.recyclerview.widget.a r5 = r2.f3108e
            r5.m1134f()
            androidx.recyclerview.widget.j$g r5 = r2.f3122l
            r2.f3122l = r3
            if (r3 == 0) goto L_0x0028
            androidx.recyclerview.widget.j$x r0 = r2.f3102b
            r3.m829a(r0)
            r3.m828a(r2)
        L_0x0028:
            androidx.recyclerview.widget.j$o r3 = r2.f3124m
            if (r3 == 0) goto L_0x0031
            androidx.recyclerview.widget.j$g r0 = r2.f3122l
            r3.m755a(r5, r0)
        L_0x0031:
            androidx.recyclerview.widget.j$v r3 = r2.f3104c
            androidx.recyclerview.widget.j$g r0 = r2.f3122l
            r3.m617a(r5, r0, r4)
            androidx.recyclerview.widget.j$a0 r3 = r2.f3115h0
            r4 = 1
            r3.f3158g = r4
            return
    }

    /* renamed from: a */
    static /* synthetic */ void m977a(androidx.recyclerview.widget.C0813j r0, int r1) {
            r0.detachViewFromParent(r1)
            return
    }

    /* renamed from: a */
    static /* synthetic */ void m976a(androidx.recyclerview.widget.C0813j r0, int r1, int r2) {
            r0.setMeasuredDimension(r1, r2)
            return
    }

    /* renamed from: a */
    static /* synthetic */ void m975a(androidx.recyclerview.widget.C0813j r0, android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0.attachViewToParent(r1, r2, r3)
            return
    }

    /* renamed from: a */
    private void m972a(int[] r9) {
            r8 = this;
            androidx.recyclerview.widget.b r0 = r8.f3110f
            int r0 = r0.m1130a()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0010
            r0 = -1
            r9[r2] = r0
            r9[r1] = r0
            return
        L_0x0010:
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x001b:
            if (r3 >= r0) goto L_0x003b
            androidx.recyclerview.widget.b r6 = r8.f3110f
            android.view.View r6 = r6.m1120c(r3)
            androidx.recyclerview.widget.j$d0 r6 = m924k(r6)
            boolean r7 = r6.m856x()
            if (r7 == 0) goto L_0x002e
            goto L_0x0038
        L_0x002e:
            int r6 = r6.m871i()
            if (r6 >= r4) goto L_0x0035
            r4 = r6
        L_0x0035:
            if (r6 <= r5) goto L_0x0038
            r5 = r6
        L_0x0038:
            int r3 = r3 + 1
            goto L_0x001b
        L_0x003b:
            r9[r2] = r4
            r9[r1] = r5
            return
    }

    /* renamed from: a */
    private boolean m995a(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = r7.getAction()
            androidx.recyclerview.widget.j$s r1 = r6.f3132q
            r2 = 1
            if (r1 == 0) goto L_0x001a
            r3 = 0
            if (r0 != 0) goto L_0x000f
            r6.f3132q = r3
            goto L_0x001a
        L_0x000f:
            r1.mo645b(r6, r7)
            r7 = 3
            if (r0 == r7) goto L_0x0017
            if (r0 != r2) goto L_0x0019
        L_0x0017:
            r6.f3132q = r3
        L_0x0019:
            return r2
        L_0x001a:
            r1 = 0
            if (r0 == 0) goto L_0x003a
            java.util.ArrayList<androidx.recyclerview.widget.j$s> r0 = r6.f3130p
            int r0 = r0.size()
            r3 = 0
        L_0x0024:
            if (r3 >= r0) goto L_0x003a
            java.util.ArrayList<androidx.recyclerview.widget.j$s> r4 = r6.f3130p
            java.lang.Object r4 = r4.get(r3)
            androidx.recyclerview.widget.j$s r4 = (androidx.recyclerview.widget.C0813j.AbstractC0843s) r4
            boolean r5 = r4.mo647a(r6, r7)
            if (r5 == 0) goto L_0x0037
            r6.f3132q = r4
            return r2
        L_0x0037:
            int r3 = r3 + 1
            goto L_0x0024
        L_0x003a:
            return r1
    }

    /* renamed from: a */
    private boolean m991a(android.view.View r7, android.view.View r8, int r9) {
            r6 = this;
            r0 = 0
            if (r8 == 0) goto L_0x0108
            if (r8 != r6) goto L_0x0007
            goto L_0x0108
        L_0x0007:
            android.view.View r1 = r6.m956c(r8)
            if (r1 != 0) goto L_0x000e
            return r0
        L_0x000e:
            r1 = 1
            if (r7 != 0) goto L_0x0012
            return r1
        L_0x0012:
            android.view.View r2 = r6.m956c(r7)
            if (r2 != 0) goto L_0x0019
            return r1
        L_0x0019:
            android.graphics.Rect r2 = r6.f3116i
            int r3 = r7.getWidth()
            int r4 = r7.getHeight()
            r2.set(r0, r0, r3, r4)
            android.graphics.Rect r2 = r6.f3118j
            int r3 = r8.getWidth()
            int r4 = r8.getHeight()
            r2.set(r0, r0, r3, r4)
            android.graphics.Rect r2 = r6.f3116i
            r6.offsetDescendantRectToMyCoords(r7, r2)
            android.graphics.Rect r7 = r6.f3118j
            r6.offsetDescendantRectToMyCoords(r8, r7)
            androidx.recyclerview.widget.j$o r7 = r6.f3124m
            int r7 = r7.m678j()
            r8 = -1
            if (r7 != r1) goto L_0x0048
            r7 = -1
            goto L_0x0049
        L_0x0048:
            r7 = 1
        L_0x0049:
            android.graphics.Rect r2 = r6.f3116i
            int r3 = r2.left
            android.graphics.Rect r4 = r6.f3118j
            int r4 = r4.left
            if (r3 < r4) goto L_0x0057
            int r2 = r2.right
            if (r2 > r4) goto L_0x0063
        L_0x0057:
            android.graphics.Rect r2 = r6.f3116i
            int r2 = r2.right
            android.graphics.Rect r3 = r6.f3118j
            int r3 = r3.right
            if (r2 >= r3) goto L_0x0063
            r2 = 1
            goto L_0x007e
        L_0x0063:
            android.graphics.Rect r2 = r6.f3116i
            int r3 = r2.right
            android.graphics.Rect r4 = r6.f3118j
            int r4 = r4.right
            if (r3 > r4) goto L_0x0071
            int r2 = r2.left
            if (r2 < r4) goto L_0x007d
        L_0x0071:
            android.graphics.Rect r2 = r6.f3116i
            int r2 = r2.left
            android.graphics.Rect r3 = r6.f3118j
            int r3 = r3.left
            if (r2 <= r3) goto L_0x007d
            r2 = -1
            goto L_0x007e
        L_0x007d:
            r2 = 0
        L_0x007e:
            android.graphics.Rect r3 = r6.f3116i
            int r4 = r3.top
            android.graphics.Rect r5 = r6.f3118j
            int r5 = r5.top
            if (r4 < r5) goto L_0x008c
            int r3 = r3.bottom
            if (r3 > r5) goto L_0x0098
        L_0x008c:
            android.graphics.Rect r3 = r6.f3116i
            int r3 = r3.bottom
            android.graphics.Rect r4 = r6.f3118j
            int r4 = r4.bottom
            if (r3 >= r4) goto L_0x0098
            r8 = 1
            goto L_0x00b2
        L_0x0098:
            android.graphics.Rect r3 = r6.f3116i
            int r4 = r3.bottom
            android.graphics.Rect r5 = r6.f3118j
            int r5 = r5.bottom
            if (r4 > r5) goto L_0x00a6
            int r3 = r3.top
            if (r3 < r5) goto L_0x00b1
        L_0x00a6:
            android.graphics.Rect r3 = r6.f3116i
            int r3 = r3.top
            android.graphics.Rect r4 = r6.f3118j
            int r4 = r4.top
            if (r3 <= r4) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r8 = 0
        L_0x00b2:
            if (r9 == r1) goto L_0x00ff
            r3 = 2
            if (r9 == r3) goto L_0x00f5
            r7 = 17
            if (r9 == r7) goto L_0x00f1
            r7 = 33
            if (r9 == r7) goto L_0x00ed
            r7 = 66
            if (r9 == r7) goto L_0x00e9
            r7 = 130(0x82, float:1.82E-43)
            if (r9 != r7) goto L_0x00cb
            if (r8 <= 0) goto L_0x00ca
            r0 = 1
        L_0x00ca:
            return r0
        L_0x00cb:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Invalid direction: "
            r8.append(r0)
            r8.append(r9)
            java.lang.String r9 = r6.m932i()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x00e9:
            if (r2 <= 0) goto L_0x00ec
            r0 = 1
        L_0x00ec:
            return r0
        L_0x00ed:
            if (r8 >= 0) goto L_0x00f0
            r0 = 1
        L_0x00f0:
            return r0
        L_0x00f1:
            if (r2 >= 0) goto L_0x00f4
            r0 = 1
        L_0x00f4:
            return r0
        L_0x00f5:
            if (r8 > 0) goto L_0x00fd
            if (r8 != 0) goto L_0x00fe
            int r2 = r2 * r7
            if (r2 < 0) goto L_0x00fe
        L_0x00fd:
            r0 = 1
        L_0x00fe:
            return r0
        L_0x00ff:
            if (r8 < 0) goto L_0x0107
            if (r8 != 0) goto L_0x0108
            int r2 = r2 * r7
            if (r2 > 0) goto L_0x0108
        L_0x0107:
            r0 = 1
        L_0x0108:
            return r0
    }

    /* renamed from: a */
    static /* synthetic */ boolean m978a(androidx.recyclerview.widget.C0813j r0) {
            boolean r0 = r0.awakenScrollBars()
            return r0
    }

    /* renamed from: b */
    private boolean m968b(android.view.MotionEvent r8) {
            r7 = this;
            int r0 = r8.getAction()
            r1 = 3
            if (r0 == r1) goto L_0x0009
            if (r0 != 0) goto L_0x000c
        L_0x0009:
            r2 = 0
            r7.f3132q = r2
        L_0x000c:
            java.util.ArrayList<androidx.recyclerview.widget.j$s> r2 = r7.f3130p
            int r2 = r2.size()
            r3 = 0
            r4 = 0
        L_0x0014:
            if (r4 >= r2) goto L_0x002d
            java.util.ArrayList<androidx.recyclerview.widget.j$s> r5 = r7.f3130p
            java.lang.Object r5 = r5.get(r4)
            androidx.recyclerview.widget.j$s r5 = (androidx.recyclerview.widget.C0813j.AbstractC0843s) r5
            boolean r6 = r5.mo647a(r7, r8)
            if (r6 == 0) goto L_0x002a
            if (r0 == r1) goto L_0x002a
            r7.f3132q = r5
            r8 = 1
            return r8
        L_0x002a:
            int r4 = r4 + 1
            goto L_0x0014
        L_0x002d:
            return r3
    }

    /* renamed from: c */
    private void m957c(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionIndex()
            int r1 = r4.getPointerId(r0)
            int r2 = r3.f3092O
            if (r1 != r2) goto L_0x002d
            if (r0 != 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            int r1 = r4.getPointerId(r0)
            r3.f3092O = r1
            float r1 = r4.getX(r0)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r3.f3096S = r1
            r3.f3094Q = r1
            float r4 = r4.getY(r0)
            float r4 = r4 + r2
            int r4 = (int) r4
            r3.f3097T = r4
            r3.f3095R = r4
        L_0x002d:
            return
    }

    /* renamed from: d */
    private void m949d(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r6) {
            r5 = this;
            android.view.View r0 = r6.f3179a
            android.view.ViewParent r1 = r0.getParent()
            r2 = 1
            if (r1 != r5) goto L_0x000b
            r1 = 1
            goto L_0x000c
        L_0x000b:
            r1 = 0
        L_0x000c:
            androidx.recyclerview.widget.j$v r3 = r5.f3104c
            androidx.recyclerview.widget.j$d0 r4 = r5.m945e(r0)
            r3.m605c(r4)
            boolean r6 = r6.m862r()
            if (r6 == 0) goto L_0x0026
            androidx.recyclerview.widget.b r6 = r5.f3110f
            r1 = -1
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            r6.m1127a(r0, r1, r3, r2)
            goto L_0x0031
        L_0x0026:
            androidx.recyclerview.widget.b r6 = r5.f3110f
            if (r1 != 0) goto L_0x002e
            r6.m1125a(r0, r2)
            goto L_0x0031
        L_0x002e:
            r6.m1128a(r0)
        L_0x0031:
            return
    }

    /* renamed from: e */
    static void m944e(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r3) {
            java.lang.ref.WeakReference<androidx.recyclerview.widget.j> r0 = r3.f3180b
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = r0.get()
        L_0x0008:
            android.view.View r0 = (android.view.View) r0
        L_0x000a:
            r1 = 0
            if (r0 == 0) goto L_0x001d
            android.view.View r2 = r3.f3179a
            if (r0 != r2) goto L_0x0012
            return
        L_0x0012:
            android.view.ViewParent r0 = r0.getParent()
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L_0x001b
            goto L_0x0008
        L_0x001b:
            r0 = r1
            goto L_0x000a
        L_0x001d:
            r3.f3180b = r1
        L_0x001f:
            return
    }

    private p000a.p018g.p029l.C0209k getScrollingChildHelper() {
            r1 = this;
            a.g.l.k r0 = r1.f3135r0
            if (r0 != 0) goto L_0x000b
            a.g.l.k r0 = new a.g.l.k
            r0.<init>(r1)
            r1.f3135r0 = r0
        L_0x000b:
            a.g.l.k r0 = r1.f3135r0
            return r0
    }

    /* renamed from: j */
    static androidx.recyclerview.widget.C0813j m927j(android.view.View r4) {
            boolean r0 = r4 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r4 instanceof androidx.recyclerview.widget.C0813j
            if (r0 == 0) goto L_0x000d
            androidx.recyclerview.widget.j r4 = (androidx.recyclerview.widget.C0813j) r4
            return r4
        L_0x000d:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r2 = 0
        L_0x0014:
            if (r2 >= r0) goto L_0x0024
            android.view.View r3 = r4.getChildAt(r2)
            androidx.recyclerview.widget.j r3 = m927j(r3)
            if (r3 == 0) goto L_0x0021
            return r3
        L_0x0021:
            int r2 = r2 + 1
            goto L_0x0014
        L_0x0024:
            return r1
    }

    /* renamed from: k */
    static androidx.recyclerview.widget.C0813j.AbstractC0821d0 m924k(android.view.View r0) {
            if (r0 != 0) goto L_0x0004
            r0 = 0
            return r0
        L_0x0004:
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.recyclerview.widget.j$p r0 = (androidx.recyclerview.widget.C0813j.C0840p) r0
            androidx.recyclerview.widget.j$d0 r0 = r0.f3234a
            return r0
    }

    /* renamed from: k */
    private boolean m925k(int r5, int r6) {
            r4 = this;
            int[] r0 = r4.f3133q0
            r4.m972a(r0)
            int[] r0 = r4.f3133q0
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != r5) goto L_0x0011
            r5 = r0[r3]
            if (r5 == r6) goto L_0x0012
        L_0x0011:
            r1 = 1
        L_0x0012:
            return r1
    }

    /* renamed from: l */
    private int m922l(android.view.View r4) {
            r3 = this;
        L_0x0000:
            int r0 = r4.getId()
        L_0x0004:
            boolean r1 = r4.isFocused()
            if (r1 != 0) goto L_0x0022
            boolean r1 = r4 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0022
            boolean r1 = r4.hasFocus()
            if (r1 == 0) goto L_0x0022
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r4 = r4.getFocusedChild()
            int r1 = r4.getId()
            r2 = -1
            if (r1 == r2) goto L_0x0004
            goto L_0x0000
        L_0x0022:
            return r0
    }

    /* renamed from: y */
    private void m909y() {
            r1 = this;
            r1.m1015M()
            r0 = 0
            r1.setScrollState(r0)
            return
    }

    /* renamed from: z */
    private void m908z() {
            r3 = this;
            int r0 = r3.f3150z
            r1 = 0
            r3.f3150z = r1
            if (r0 == 0) goto L_0x001c
            boolean r1 = r3.m921m()
            if (r1 == 0) goto L_0x001c
            android.view.accessibility.AccessibilityEvent r1 = android.view.accessibility.AccessibilityEvent.obtain()
            r2 = 2048(0x800, float:2.87E-42)
            r1.setEventType(r2)
            p000a.p018g.p029l.p030a0.C0187a.m3548a(r1, r0)
            r3.sendAccessibilityEventUnchecked(r1)
        L_0x001c:
            return
    }

    /* renamed from: a */
    androidx.recyclerview.widget.C0813j.AbstractC0821d0 m1001a(int r6, boolean r7) {
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.f3110f
            int r0 = r0.m1124b()
            r1 = 0
            r2 = 0
        L_0x0008:
            if (r2 >= r0) goto L_0x003a
            androidx.recyclerview.widget.b r3 = r5.f3110f
            android.view.View r3 = r3.m1118d(r2)
            androidx.recyclerview.widget.j$d0 r3 = m924k(r3)
            if (r3 == 0) goto L_0x0037
            boolean r4 = r3.m864p()
            if (r4 != 0) goto L_0x0037
            if (r7 == 0) goto L_0x0023
            int r4 = r3.f3181c
            if (r4 == r6) goto L_0x002a
            goto L_0x0037
        L_0x0023:
            int r4 = r3.m871i()
            if (r4 == r6) goto L_0x002a
            goto L_0x0037
        L_0x002a:
            androidx.recyclerview.widget.b r1 = r5.f3110f
            android.view.View r4 = r3.f3179a
            boolean r1 = r1.m1119c(r4)
            if (r1 == 0) goto L_0x0036
            r1 = r3
            goto L_0x0037
        L_0x0036:
            return r3
        L_0x0037:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x003a:
            return r1
    }

    /* renamed from: a */
    public androidx.recyclerview.widget.C0813j.AbstractC0821d0 m1000a(long r8) {
            r7 = this;
            androidx.recyclerview.widget.j$g r0 = r7.f3122l
            r1 = 0
            if (r0 == 0) goto L_0x003f
            boolean r0 = r0.m827b()
            if (r0 != 0) goto L_0x000c
            goto L_0x003f
        L_0x000c:
            androidx.recyclerview.widget.b r0 = r7.f3110f
            int r0 = r0.m1124b()
            r2 = 0
        L_0x0013:
            if (r2 >= r0) goto L_0x003f
            androidx.recyclerview.widget.b r3 = r7.f3110f
            android.view.View r3 = r3.m1118d(r2)
            androidx.recyclerview.widget.j$d0 r3 = m924k(r3)
            if (r3 == 0) goto L_0x003c
            boolean r4 = r3.m864p()
            if (r4 != 0) goto L_0x003c
            long r4 = r3.m873g()
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x003c
            androidx.recyclerview.widget.b r1 = r7.f3110f
            android.view.View r4 = r3.f3179a
            boolean r1 = r1.m1119c(r4)
            if (r1 == 0) goto L_0x003b
            r1 = r3
            goto L_0x003c
        L_0x003b:
            return r3
        L_0x003c:
            int r2 = r2 + 1
            goto L_0x0013
        L_0x003f:
            return r1
    }

    /* renamed from: a */
    void m1012a() {
            r4 = this;
            androidx.recyclerview.widget.b r0 = r4.f3110f
            int r0 = r0.m1124b()
            r1 = 0
        L_0x0007:
            if (r1 >= r0) goto L_0x001f
            androidx.recyclerview.widget.b r2 = r4.f3110f
            android.view.View r2 = r2.m1118d(r1)
            androidx.recyclerview.widget.j$d0 r2 = m924k(r2)
            boolean r3 = r2.m856x()
            if (r3 != 0) goto L_0x001c
            r2.m889a()
        L_0x001c:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x001f:
            androidx.recyclerview.widget.j$v r0 = r4.f3104c
            r0.m615b()
            return
    }

    @Override // p000a.p018g.p029l.AbstractC0207i
    /* renamed from: a */
    public void mo1010a(int r2) {
            r1 = this;
            a.g.l.k r0 = r1.getScrollingChildHelper()
            r0.m3456c(r2)
            return
    }

    /* renamed from: a */
    void m1009a(int r3, int r4) {
            r2 = this;
            if (r3 >= 0) goto L_0x000c
            r2.m943f()
            android.widget.EdgeEffect r0 = r2.f3086I
            int r1 = -r3
            r0.onAbsorb(r1)
            goto L_0x0016
        L_0x000c:
            if (r3 <= 0) goto L_0x0016
            r2.m939g()
            android.widget.EdgeEffect r0 = r2.f3088K
            r0.onAbsorb(r3)
        L_0x0016:
            if (r4 >= 0) goto L_0x0022
            r2.m935h()
            android.widget.EdgeEffect r0 = r2.f3087J
            int r1 = -r4
            r0.onAbsorb(r1)
            goto L_0x002c
        L_0x0022:
            if (r4 <= 0) goto L_0x002c
            r2.m948e()
            android.widget.EdgeEffect r0 = r2.f3089L
            r0.onAbsorb(r4)
        L_0x002c:
            if (r3 != 0) goto L_0x0030
            if (r4 == 0) goto L_0x0033
        L_0x0030:
            p000a.p018g.p029l.C0216r.m3450A(r2)
        L_0x0033:
            return
    }

    /* renamed from: a */
    public void m1006a(int r3, int r4, android.view.animation.Interpolator r5) {
            r2 = this;
            androidx.recyclerview.widget.j$o r0 = r2.f3124m
            if (r0 != 0) goto L_0x000c
            java.lang.String r3 = "RecyclerView"
            java.lang.String r4 = "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r3, r4)
            return
        L_0x000c:
            boolean r1 = r2.f3146x
            if (r1 == 0) goto L_0x0011
            return
        L_0x0011:
            boolean r0 = r0.mo788a()
            r1 = 0
            if (r0 != 0) goto L_0x0019
            r3 = 0
        L_0x0019:
            androidx.recyclerview.widget.j$o r0 = r2.f3124m
            boolean r0 = r0.mo732b()
            if (r0 != 0) goto L_0x0022
            r4 = 0
        L_0x0022:
            if (r3 != 0) goto L_0x0026
            if (r4 == 0) goto L_0x002b
        L_0x0026:
            androidx.recyclerview.widget.j$c0 r0 = r2.f3109e0
            r0.m894a(r3, r4, r5)
        L_0x002b:
            return
    }

    /* renamed from: a */
    void m1005a(int r7, int r8, java.lang.Object r9) {
            r6 = this;
            androidx.recyclerview.widget.b r0 = r6.f3110f
            int r0 = r0.m1124b()
            int r1 = r7 + r8
            r2 = 0
        L_0x0009:
            if (r2 >= r0) goto L_0x0037
            androidx.recyclerview.widget.b r3 = r6.f3110f
            android.view.View r3 = r3.m1118d(r2)
            androidx.recyclerview.widget.j$d0 r4 = m924k(r3)
            if (r4 == 0) goto L_0x0034
            boolean r5 = r4.m856x()
            if (r5 == 0) goto L_0x001e
            goto L_0x0034
        L_0x001e:
            int r5 = r4.f3181c
            if (r5 < r7) goto L_0x0034
            if (r5 >= r1) goto L_0x0034
            r5 = 2
            r4.m888a(r5)
            r4.m882a(r9)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.recyclerview.widget.j$p r3 = (androidx.recyclerview.widget.C0813j.C0840p) r3
            r4 = 1
            r3.f3236c = r4
        L_0x0034:
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0037:
            androidx.recyclerview.widget.j$v r9 = r6.f3104c
            r9.m607c(r7, r8)
            return
    }

    /* renamed from: a */
    void m1004a(int r8, int r9, boolean r10) {
            r7 = this;
            int r0 = r8 + r9
            androidx.recyclerview.widget.b r1 = r7.f3110f
            int r1 = r1.m1124b()
            r2 = 0
        L_0x0009:
            if (r2 >= r1) goto L_0x0037
            androidx.recyclerview.widget.b r3 = r7.f3110f
            android.view.View r3 = r3.m1118d(r2)
            androidx.recyclerview.widget.j$d0 r3 = m924k(r3)
            if (r3 == 0) goto L_0x0034
            boolean r4 = r3.m856x()
            if (r4 != 0) goto L_0x0034
            int r4 = r3.f3181c
            r5 = 1
            if (r4 < r0) goto L_0x002b
            int r4 = -r9
            r3.m885a(r4, r10)
        L_0x0026:
            androidx.recyclerview.widget.j$a0 r3 = r7.f3115h0
            r3.f3158g = r5
            goto L_0x0034
        L_0x002b:
            if (r4 < r8) goto L_0x0034
            int r4 = r8 + (-1)
            int r6 = -r9
            r3.m886a(r4, r6, r10)
            goto L_0x0026
        L_0x0034:
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0037:
            androidx.recyclerview.widget.j$v r0 = r7.f3104c
            r0.m627a(r8, r9, r10)
            r7.requestLayout()
            return
    }

    /* renamed from: a */
    void m1003a(int r5, int r6, int[] r7) {
            r4 = this;
            r4.m911w()
            r4.m917q()
            java.lang.String r0 = "RV Scroll"
            p000a.p018g.p025h.C0159a.m3606a(r0)
            androidx.recyclerview.widget.j$a0 r0 = r4.f3115h0
            r4.m989a(r0)
            r0 = 0
            if (r5 == 0) goto L_0x001e
            androidx.recyclerview.widget.j$o r1 = r4.f3124m
            androidx.recyclerview.widget.j$v r2 = r4.f3104c
            androidx.recyclerview.widget.j$a0 r3 = r4.f3115h0
            int r5 = r1.mo778a(r5, r2, r3)
            goto L_0x001f
        L_0x001e:
            r5 = 0
        L_0x001f:
            if (r6 == 0) goto L_0x002c
            androidx.recyclerview.widget.j$o r1 = r4.f3124m
            androidx.recyclerview.widget.j$v r2 = r4.f3104c
            androidx.recyclerview.widget.j$a0 r3 = r4.f3115h0
            int r6 = r1.mo728b(r6, r2, r3)
            goto L_0x002d
        L_0x002c:
            r6 = 0
        L_0x002d:
            p000a.p018g.p025h.C0159a.m3607a()
            r4.m913u()
            r4.m916r()
            r4.m954c(r0)
            if (r7 == 0) goto L_0x0040
            r7[r0] = r5
            r5 = 1
            r7[r5] = r6
        L_0x0040:
            return
    }

    /* renamed from: a */
    void m996a(android.graphics.drawable.StateListDrawable r11, android.graphics.drawable.Drawable r12, android.graphics.drawable.StateListDrawable r13, android.graphics.drawable.Drawable r14) {
            r10 = this;
            if (r11 == 0) goto L_0x002d
            if (r12 == 0) goto L_0x002d
            if (r13 == 0) goto L_0x002d
            if (r14 == 0) goto L_0x002d
            android.content.Context r0 = r10.getContext()
            android.content.res.Resources r0 = r0.getResources()
            androidx.recyclerview.widget.d r1 = new androidx.recyclerview.widget.d
            int r2 = p000a.p044m.C0317a.fastscroll_default_thickness
            int r7 = r0.getDimensionPixelSize(r2)
            int r2 = p000a.p044m.C0317a.fastscroll_minimum_range
            int r8 = r0.getDimensionPixelSize(r2)
            int r2 = p000a.p044m.C0317a.fastscroll_margin
            int r9 = r0.getDimensionPixelOffset(r2)
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x002d:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Trying to set fast scroller without both required drawables."
            r12.append(r13)
            java.lang.String r13 = r10.m932i()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
    }

    /* renamed from: a */
    void m994a(android.view.View r3) {
            r2 = this;
            androidx.recyclerview.widget.j$d0 r0 = m924k(r3)
            r2.m936g(r3)
            androidx.recyclerview.widget.j$g r1 = r2.f3122l
            if (r1 == 0) goto L_0x0010
            if (r0 == 0) goto L_0x0010
            r1.m826b(r0)
        L_0x0010:
            java.util.List<androidx.recyclerview.widget.j$q> r0 = r2.f3080C
            if (r0 == 0) goto L_0x002a
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L_0x001a:
            if (r0 < 0) goto L_0x002a
            java.util.List<androidx.recyclerview.widget.j$q> r1 = r2.f3080C
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.j$q r1 = (androidx.recyclerview.widget.C0813j.AbstractC0841q) r1
            r1.m649b(r3)
            int r0 = r0 + (-1)
            goto L_0x001a
        L_0x002a:
            return
    }

    /* renamed from: a */
    final void m989a(androidx.recyclerview.widget.C0813j.C0815a0 r4) {
            r3 = this;
            int r0 = r3.getScrollState()
            r1 = 2
            if (r0 != r1) goto L_0x0022
            androidx.recyclerview.widget.j$c0 r0 = r3.f3109e0
            android.widget.OverScroller r0 = r0.f3172d
            int r1 = r0.getFinalX()
            int r2 = r0.getCurrX()
            int r1 = r1 - r2
            r4.f3167p = r1
            int r1 = r0.getFinalY()
            int r0 = r0.getCurrY()
            int r1 = r1 - r0
            r4.f3168q = r1
            goto L_0x0027
        L_0x0022:
            r0 = 0
            r4.f3167p = r0
            r4.f3168q = r0
        L_0x0027:
            return
    }

    /* renamed from: a */
    void m985a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r4, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r5) {
            r3 = this;
            r0 = 0
            r1 = 8192(0x2000, float:1.14794E-41)
            r4.m887a(r0, r1)
            androidx.recyclerview.widget.j$a0 r0 = r3.f3115h0
            boolean r0 = r0.f3160i
            if (r0 == 0) goto L_0x0027
            boolean r0 = r4.m861s()
            if (r0 == 0) goto L_0x0027
            boolean r0 = r4.m864p()
            if (r0 != 0) goto L_0x0027
            boolean r0 = r4.m856x()
            if (r0 != 0) goto L_0x0027
            long r0 = r3.m955c(r4)
            androidx.recyclerview.widget.o r2 = r3.f3112g
            r2.m536a(r0, r4)
        L_0x0027:
            androidx.recyclerview.widget.o r0 = r3.f3112g
            r0.m527c(r4, r5)
            return
    }

    /* renamed from: a */
    void m984a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r2, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r3, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r4) {
            r1 = this;
            r0 = 0
            r2.m881a(r0)
            androidx.recyclerview.widget.j$l r0 = r1.f3090M
            boolean r2 = r0.mo571a(r2, r3, r4)
            if (r2 == 0) goto L_0x000f
            r1.m915s()
        L_0x000f:
            return
    }

    /* renamed from: a */
    public void m982a(androidx.recyclerview.widget.C0813j.AbstractC0834n r2) {
            r1 = this;
            r0 = -1
            r1.m981a(r2, r0)
            return
    }

    /* renamed from: a */
    public void m981a(androidx.recyclerview.widget.C0813j.AbstractC0834n r3, int r4) {
            r2 = this;
            androidx.recyclerview.widget.j$o r0 = r2.f3124m
            if (r0 == 0) goto L_0x0009
            java.lang.String r1 = "Cannot add item decoration during a scroll  or layout"
            r0.mo733a(r1)
        L_0x0009:
            java.util.ArrayList<androidx.recyclerview.widget.j$n> r0 = r2.f3128o
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0015
            r0 = 0
            r2.setWillNotDraw(r0)
        L_0x0015:
            if (r4 >= 0) goto L_0x001d
            java.util.ArrayList<androidx.recyclerview.widget.j$n> r4 = r2.f3128o
            r4.add(r3)
            goto L_0x0022
        L_0x001d:
            java.util.ArrayList<androidx.recyclerview.widget.j$n> r0 = r2.f3128o
            r0.add(r4, r3)
        L_0x0022:
            r2.m919o()
            r2.requestLayout()
            return
    }

    /* renamed from: a */
    public void m980a(androidx.recyclerview.widget.C0813j.AbstractC0843s r2) {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.j$s> r0 = r1.f3130p
            r0.add(r2)
            return
    }

    /* renamed from: a */
    public void m979a(androidx.recyclerview.widget.C0813j.AbstractC0844t r2) {
            r1 = this;
            java.util.List<androidx.recyclerview.widget.j$t> r0 = r1.f3119j0
            if (r0 != 0) goto L_0x000b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3119j0 = r0
        L_0x000b:
            java.util.List<androidx.recyclerview.widget.j$t> r0 = r1.f3119j0
            r0.add(r2)
            return
    }

    /* renamed from: a */
    void m974a(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.m920n()
            if (r0 == 0) goto L_0x0029
            if (r3 != 0) goto L_0x0023
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot call this method while RecyclerView is computing a layout or scrolling"
            r0.append(r1)
            java.lang.String r1 = r2.m932i()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L_0x0023:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0029:
            int r3 = r2.f3084G
            if (r3 <= 0) goto L_0x004e
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r1 = r2.m932i()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            java.lang.String r0 = "RecyclerView"
            java.lang.String r1 = "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame."
            android.util.Log.w(r0, r1, r3)
        L_0x004e:
            return
    }

    /* renamed from: a */
    void m973a(boolean r3) {
            r2 = this;
            int r0 = r2.f3083F
            r1 = 1
            int r0 = r0 - r1
            r2.f3083F = r0
            int r0 = r2.f3083F
            if (r0 >= r1) goto L_0x0015
            r0 = 0
            r2.f3083F = r0
            if (r3 == 0) goto L_0x0015
            r2.m908z()
            r2.m953d()
        L_0x0015:
            return
    }

    /* renamed from: a */
    public boolean m1008a(int r8, int r9, int r10, int r11, int[] r12, int r13) {
            r7 = this;
            a.g.l.k r0 = r7.getScrollingChildHelper()
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            boolean r8 = r0.m3464a(r1, r2, r3, r4, r5, r6)
            return r8
    }

    /* renamed from: a */
    boolean m1007a(int r19, int r20, android.view.MotionEvent r21) {
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r18.m971b()
            androidx.recyclerview.widget.j$g r0 = r7.f3122l
            r11 = 1
            r12 = 0
            if (r0 == 0) goto L_0x0025
            int[] r0 = r7.f3143v0
            r7.m1003a(r8, r9, r0)
            int[] r0 = r7.f3143v0
            r1 = r0[r12]
            r0 = r0[r11]
            int r2 = r8 - r1
            int r3 = r9 - r0
            r6 = r0
            r15 = r1
            r13 = r2
            r14 = r3
            goto L_0x0029
        L_0x0025:
            r6 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0029:
            java.util.ArrayList<androidx.recyclerview.widget.j$n> r0 = r7.f3128o
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0034
            r18.invalidate()
        L_0x0034:
            int[] r5 = r7.f3137s0
            r16 = 0
            r0 = r18
            r1 = r15
            r2 = r6
            r3 = r13
            r4 = r14
            r17 = r6
            r6 = r16
            boolean r0 = r0.m1008a(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0076
            int r0 = r7.f3096S
            int[] r1 = r7.f3137s0
            r2 = r1[r12]
            int r0 = r0 - r2
            r7.f3096S = r0
            int r0 = r7.f3097T
            r2 = r1[r11]
            int r0 = r0 - r2
            r7.f3097T = r0
            if (r10 == 0) goto L_0x0063
            r0 = r1[r12]
            float r0 = (float) r0
            r1 = r1[r11]
            float r1 = (float) r1
            r10.offsetLocation(r0, r1)
        L_0x0063:
            int[] r0 = r7.f3141u0
            r1 = r0[r12]
            int[] r2 = r7.f3137s0
            r3 = r2[r12]
            int r1 = r1 + r3
            r0[r12] = r1
            r1 = r0[r11]
            r2 = r2[r11]
            int r1 = r1 + r2
            r0[r11] = r1
            goto L_0x0097
        L_0x0076:
            int r0 = r18.getOverScrollMode()
            r1 = 2
            if (r0 == r1) goto L_0x0097
            if (r10 == 0) goto L_0x0094
            r0 = 8194(0x2002, float:1.1482E-41)
            boolean r0 = p000a.p018g.p029l.C0206h.m3471a(r10, r0)
            if (r0 != 0) goto L_0x0094
            float r0 = r21.getX()
            float r1 = (float) r13
            float r2 = r21.getY()
            float r3 = (float) r14
            r7.m1011a(r0, r1, r2, r3)
        L_0x0094:
            r18.m969b(r19, r20)
        L_0x0097:
            r0 = r17
            if (r15 != 0) goto L_0x009d
            if (r0 == 0) goto L_0x00a0
        L_0x009d:
            r7.m951d(r15, r0)
        L_0x00a0:
            boolean r1 = r18.awakenScrollBars()
            if (r1 != 0) goto L_0x00a9
            r18.invalidate()
        L_0x00a9:
            if (r15 != 0) goto L_0x00ad
            if (r0 == 0) goto L_0x00ae
        L_0x00ad:
            r12 = 1
        L_0x00ae:
            return r12
    }

    /* renamed from: a */
    public boolean m1002a(int r7, int r8, int[] r9, int[] r10, int r11) {
            r6 = this;
            a.g.l.k r0 = r6.getScrollingChildHelper()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.m3462a(r1, r2, r3, r4, r5)
            return r7
    }

    /* renamed from: a */
    boolean m990a(android.view.accessibility.AccessibilityEvent r3) {
            r2 = this;
            boolean r0 = r2.m920n()
            r1 = 0
            if (r0 == 0) goto L_0x0019
            if (r3 == 0) goto L_0x000e
            int r3 = p000a.p018g.p029l.p030a0.C0187a.m3549a(r3)
            goto L_0x000f
        L_0x000e:
            r3 = 0
        L_0x000f:
            if (r3 != 0) goto L_0x0012
            r3 = 0
        L_0x0012:
            int r0 = r2.f3150z
            r3 = r3 | r0
            r2.f3150z = r3
            r3 = 1
            return r3
        L_0x0019:
            return r1
    }

    /* renamed from: a */
    boolean m988a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r3) {
            r2 = this;
            androidx.recyclerview.widget.j$l r0 = r2.f3090M
            if (r0 == 0) goto L_0x0011
            java.util.List r1 = r3.m869k()
            boolean r3 = r0.mo815a(r3, r1)
            if (r3 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r3 = 0
            goto L_0x0012
        L_0x0011:
            r3 = 1
        L_0x0012:
            return r3
    }

    /* renamed from: a */
    boolean m987a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r2, int r3) {
            r1 = this;
            boolean r0 = r1.m920n()
            if (r0 == 0) goto L_0x000f
            r2.f3195q = r3
            java.util.List<androidx.recyclerview.widget.j$d0> r3 = r1.f3145w0
            r3.add(r2)
            r2 = 0
            return r2
        L_0x000f:
            android.view.View r2 = r2.f3179a
            p000a.p018g.p029l.C0216r.m3418e(r2, r3)
            r2 = 1
            return r2
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(java.util.ArrayList<android.view.View> r2, int r3, int r4) {
            r1 = this;
            androidx.recyclerview.widget.j$o r0 = r1.f3124m
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.m735a(r1, r2, r3, r4)
            if (r0 != 0) goto L_0x000d
        L_0x000a:
            super.addFocusables(r2, r3, r4)
        L_0x000d:
            return
    }

    /* renamed from: b */
    int m966b(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r2) {
            r1 = this;
            r0 = 524(0x20c, float:7.34E-43)
            boolean r0 = r2.m879b(r0)
            if (r0 != 0) goto L_0x0018
            boolean r0 = r2.m867m()
            if (r0 != 0) goto L_0x000f
            goto L_0x0018
        L_0x000f:
            androidx.recyclerview.widget.a r0 = r1.f3108e
            int r2 = r2.f3181c
            int r2 = r0.m1150a(r2)
            return r2
        L_0x0018:
            r2 = -1
            return r2
    }

    /* renamed from: b */
    void m971b() {
            r3 = this;
            boolean r0 = r3.f3140u
            java.lang.String r1 = "RV FullInvalidate"
            if (r0 == 0) goto L_0x0064
            boolean r0 = r3.f3081D
            if (r0 == 0) goto L_0x000b
            goto L_0x0064
        L_0x000b:
            androidx.recyclerview.widget.a r0 = r3.f3108e
            boolean r0 = r0.m1142c()
            if (r0 != 0) goto L_0x0014
            return
        L_0x0014:
            androidx.recyclerview.widget.a r0 = r3.f3108e
            r2 = 4
            boolean r0 = r0.m1141c(r2)
            if (r0 == 0) goto L_0x0052
            androidx.recyclerview.widget.a r0 = r3.f3108e
            r2 = 11
            boolean r0 = r0.m1141c(r2)
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = "RV PartialInvalidate"
            p000a.p018g.p025h.C0159a.m3606a(r0)
            r3.m911w()
            r3.m917q()
            androidx.recyclerview.widget.a r0 = r3.f3108e
            r0.m1136e()
            boolean r0 = r3.f3144w
            if (r0 != 0) goto L_0x004a
            boolean r0 = r3.m1023E()
            if (r0 == 0) goto L_0x0045
            r3.m960c()
            goto L_0x004a
        L_0x0045:
            androidx.recyclerview.widget.a r0 = r3.f3108e
            r0.m1151a()
        L_0x004a:
            r0 = 1
            r3.m954c(r0)
            r3.m916r()
            goto L_0x0060
        L_0x0052:
            androidx.recyclerview.widget.a r0 = r3.f3108e
            boolean r0 = r0.m1142c()
            if (r0 == 0) goto L_0x0063
            p000a.p018g.p025h.C0159a.m3606a(r1)
            r3.m960c()
        L_0x0060:
            p000a.p018g.p025h.C0159a.m3607a()
        L_0x0063:
            return
        L_0x0064:
            p000a.p018g.p025h.C0159a.m3606a(r1)
            r3.m960c()
            p000a.p018g.p025h.C0159a.m3607a()
            return
    }

    /* renamed from: b */
    void m970b(int r3) {
            r2 = this;
            androidx.recyclerview.widget.j$o r0 = r2.f3124m
            if (r0 == 0) goto L_0x0007
            r0.mo690f(r3)
        L_0x0007:
            r2.m938g(r3)
            androidx.recyclerview.widget.j$t r0 = r2.f3117i0
            if (r0 == 0) goto L_0x0011
            r0.m644a(r2, r3)
        L_0x0011:
            java.util.List<androidx.recyclerview.widget.j$t> r0 = r2.f3119j0
            if (r0 == 0) goto L_0x002b
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L_0x001b:
            if (r0 < 0) goto L_0x002b
            java.util.List<androidx.recyclerview.widget.j$t> r1 = r2.f3119j0
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.j$t r1 = (androidx.recyclerview.widget.C0813j.AbstractC0844t) r1
            r1.m644a(r2, r3)
            int r0 = r0 + (-1)
            goto L_0x001b
        L_0x002b:
            return
    }

    /* renamed from: b */
    void m969b(int r3, int r4) {
            r2 = this;
            android.widget.EdgeEffect r0 = r2.f3086I
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0018
            if (r3 <= 0) goto L_0x0018
            android.widget.EdgeEffect r0 = r2.f3086I
            r0.onRelease()
            android.widget.EdgeEffect r0 = r2.f3086I
            boolean r0 = r0.isFinished()
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            android.widget.EdgeEffect r1 = r2.f3088K
            if (r1 == 0) goto L_0x0031
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L_0x0031
            if (r3 >= 0) goto L_0x0031
            android.widget.EdgeEffect r3 = r2.f3088K
            r3.onRelease()
            android.widget.EdgeEffect r3 = r2.f3088K
            boolean r3 = r3.isFinished()
            r0 = r0 | r3
        L_0x0031:
            android.widget.EdgeEffect r3 = r2.f3087J
            if (r3 == 0) goto L_0x0049
            boolean r3 = r3.isFinished()
            if (r3 != 0) goto L_0x0049
            if (r4 <= 0) goto L_0x0049
            android.widget.EdgeEffect r3 = r2.f3087J
            r3.onRelease()
            android.widget.EdgeEffect r3 = r2.f3087J
            boolean r3 = r3.isFinished()
            r0 = r0 | r3
        L_0x0049:
            android.widget.EdgeEffect r3 = r2.f3089L
            if (r3 == 0) goto L_0x0061
            boolean r3 = r3.isFinished()
            if (r3 != 0) goto L_0x0061
            if (r4 >= 0) goto L_0x0061
            android.widget.EdgeEffect r3 = r2.f3089L
            r3.onRelease()
            android.widget.EdgeEffect r3 = r2.f3089L
            boolean r3 = r3.isFinished()
            r0 = r0 | r3
        L_0x0061:
            if (r0 == 0) goto L_0x0066
            p000a.p018g.p029l.C0216r.m3450A(r2)
        L_0x0066:
            return
    }

    /* renamed from: b */
    void m967b(android.view.View r3) {
            r2 = this;
            androidx.recyclerview.widget.j$d0 r0 = m924k(r3)
            r2.m933h(r3)
            androidx.recyclerview.widget.j$g r1 = r2.f3122l
            if (r1 == 0) goto L_0x0010
            if (r0 == 0) goto L_0x0010
            r1.m822c(r0)
        L_0x0010:
            java.util.List<androidx.recyclerview.widget.j$q> r0 = r2.f3080C
            if (r0 == 0) goto L_0x002a
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L_0x001a:
            if (r0 < 0) goto L_0x002a
            java.util.List<androidx.recyclerview.widget.j$q> r1 = r2.f3080C
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.j$q r1 = (androidx.recyclerview.widget.C0813j.AbstractC0841q) r1
            r1.m650a(r3)
            int r0 = r0 + (-1)
            goto L_0x001a
        L_0x002a:
            return
    }

    /* renamed from: b */
    void m965b(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r2, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r3, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r4) {
            r1 = this;
            r1.m949d(r2)
            r0 = 0
            r2.m881a(r0)
            androidx.recyclerview.widget.j$l r0 = r1.f3090M
            boolean r2 = r0.mo569b(r2, r3, r4)
            if (r2 == 0) goto L_0x0012
            r1.m915s()
        L_0x0012:
            return
    }

    /* renamed from: b */
    public void m964b(androidx.recyclerview.widget.C0813j.AbstractC0834n r3) {
            r2 = this;
            androidx.recyclerview.widget.j$o r0 = r2.f3124m
            if (r0 == 0) goto L_0x0009
            java.lang.String r1 = "Cannot remove item decoration during a scroll  or layout"
            r0.mo733a(r1)
        L_0x0009:
            java.util.ArrayList<androidx.recyclerview.widget.j$n> r0 = r2.f3128o
            r0.remove(r3)
            java.util.ArrayList<androidx.recyclerview.widget.j$n> r3 = r2.f3128o
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0023
            int r3 = r2.getOverScrollMode()
            r0 = 2
            if (r3 != r0) goto L_0x001f
            r3 = 1
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            r2.setWillNotDraw(r3)
        L_0x0023:
            r2.m919o()
            r2.requestLayout()
            return
    }

    /* renamed from: b */
    public void m963b(androidx.recyclerview.widget.C0813j.AbstractC0843s r2) {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.j$s> r0 = r1.f3130p
            r0.remove(r2)
            androidx.recyclerview.widget.j$s r0 = r1.f3132q
            if (r0 != r2) goto L_0x000c
            r2 = 0
            r1.f3132q = r2
        L_0x000c:
            return
    }

    /* renamed from: b */
    public void m962b(androidx.recyclerview.widget.C0813j.AbstractC0844t r2) {
            r1 = this;
            java.util.List<androidx.recyclerview.widget.j$t> r0 = r1.f3119j0
            if (r0 == 0) goto L_0x0007
            r0.remove(r2)
        L_0x0007:
            return
    }

    /* renamed from: b */
    void m961b(boolean r2) {
            r1 = this;
            boolean r0 = r1.f3082E
            r2 = r2 | r0
            r1.f3082E = r2
            r2 = 1
            r1.f3081D = r2
            r1.m918p()
            return
    }

    /* renamed from: c */
    long m955c(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r3) {
            r2 = this;
            androidx.recyclerview.widget.j$g r0 = r2.f3122l
            boolean r0 = r0.m827b()
            if (r0 == 0) goto L_0x000d
            long r0 = r3.m873g()
            goto L_0x0010
        L_0x000d:
            int r3 = r3.f3181c
            long r0 = (long) r3
        L_0x0010:
            return r0
    }

    /* renamed from: c */
    public android.view.View m956c(android.view.View r3) {
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
    }

    /* renamed from: c */
    public androidx.recyclerview.widget.C0813j.AbstractC0821d0 m959c(int r6) {
            r5 = this;
            boolean r0 = r5.f3081D
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            androidx.recyclerview.widget.b r0 = r5.f3110f
            int r0 = r0.m1124b()
            r2 = 0
        L_0x000d:
            if (r2 >= r0) goto L_0x0037
            androidx.recyclerview.widget.b r3 = r5.f3110f
            android.view.View r3 = r3.m1118d(r2)
            androidx.recyclerview.widget.j$d0 r3 = m924k(r3)
            if (r3 == 0) goto L_0x0034
            boolean r4 = r3.m864p()
            if (r4 != 0) goto L_0x0034
            int r4 = r5.m966b(r3)
            if (r4 != r6) goto L_0x0034
            androidx.recyclerview.widget.b r1 = r5.f3110f
            android.view.View r4 = r3.f3179a
            boolean r1 = r1.m1119c(r4)
            if (r1 == 0) goto L_0x0033
            r1 = r3
            goto L_0x0034
        L_0x0033:
            return r3
        L_0x0034:
            int r2 = r2 + 1
            goto L_0x000d
        L_0x0037:
            return r1
    }

    /* renamed from: c */
    void m960c() {
            r2 = this;
            androidx.recyclerview.widget.j$g r0 = r2.f3122l
            java.lang.String r1 = "RecyclerView"
            if (r0 != 0) goto L_0x000c
            java.lang.String r0 = "No adapter attached; skipping layout"
        L_0x0008:
            android.util.Log.e(r1, r0)
            return
        L_0x000c:
            androidx.recyclerview.widget.j$o r0 = r2.f3124m
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = "No layout manager attached; skipping layout"
            goto L_0x0008
        L_0x0013:
            androidx.recyclerview.widget.j$a0 r0 = r2.f3115h0
            r1 = 0
            r0.f3161j = r1
            int r0 = r0.f3156e
            r1 = 1
            if (r0 != r1) goto L_0x0029
            r2.m1027A()
        L_0x0020:
            androidx.recyclerview.widget.j$o r0 = r2.f3124m
            r0.m692e(r2)
            r2.m1026B()
            goto L_0x004f
        L_0x0029:
            androidx.recyclerview.widget.a r0 = r2.f3108e
            boolean r0 = r0.m1139d()
            if (r0 != 0) goto L_0x0020
            androidx.recyclerview.widget.j$o r0 = r2.f3124m
            int r0 = r0.m665q()
            int r1 = r2.getWidth()
            if (r0 != r1) goto L_0x0020
            androidx.recyclerview.widget.j$o r0 = r2.f3124m
            int r0 = r0.m682h()
            int r1 = r2.getHeight()
            if (r0 == r1) goto L_0x004a
            goto L_0x0020
        L_0x004a:
            androidx.recyclerview.widget.j$o r0 = r2.f3124m
            r0.m692e(r2)
        L_0x004f:
            r2.m1025C()
            return
    }

    /* renamed from: c */
    void m958c(int r3, int r4) {
            r2 = this;
            int r0 = r2.getPaddingLeft()
            int r1 = r2.getPaddingRight()
            int r0 = r0 + r1
            int r1 = p000a.p018g.p029l.C0216r.m3409l(r2)
            int r3 = androidx.recyclerview.widget.C0813j.AbstractC0835o.m785a(r3, r0, r1)
            int r0 = r2.getPaddingTop()
            int r1 = r2.getPaddingBottom()
            int r0 = r0 + r1
            int r1 = p000a.p018g.p029l.C0216r.m3410k(r2)
            int r4 = androidx.recyclerview.widget.C0813j.AbstractC0835o.m785a(r4, r0, r1)
            r2.setMeasuredDimension(r3, r4)
            return
    }

    /* renamed from: c */
    void m954c(boolean r4) {
            r3 = this;
            int r0 = r3.f3142v
            r1 = 1
            if (r0 >= r1) goto L_0x0007
            r3.f3142v = r1
        L_0x0007:
            r0 = 0
            if (r4 != 0) goto L_0x0010
            boolean r2 = r3.f3146x
            if (r2 != 0) goto L_0x0010
            r3.f3144w = r0
        L_0x0010:
            int r2 = r3.f3142v
            if (r2 != r1) goto L_0x002f
            if (r4 == 0) goto L_0x0029
            boolean r4 = r3.f3144w
            if (r4 == 0) goto L_0x0029
            boolean r4 = r3.f3146x
            if (r4 != 0) goto L_0x0029
            androidx.recyclerview.widget.j$o r4 = r3.f3124m
            if (r4 == 0) goto L_0x0029
            androidx.recyclerview.widget.j$g r4 = r3.f3122l
            if (r4 == 0) goto L_0x0029
            r3.m960c()
        L_0x0029:
            boolean r4 = r3.f3146x
            if (r4 != 0) goto L_0x002f
            r3.f3144w = r0
        L_0x002f:
            int r4 = r3.f3142v
            int r4 = r4 - r1
            r3.f3142v = r4
            return
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.recyclerview.widget.C0813j.C0840p
            if (r0 == 0) goto L_0x0010
            androidx.recyclerview.widget.j$o r0 = r1.f3124m
            androidx.recyclerview.widget.j$p r2 = (androidx.recyclerview.widget.C0813j.C0840p) r2
            boolean r2 = r0.mo754a(r2)
            if (r2 == 0) goto L_0x0010
            r2 = 1
            goto L_0x0011
        L_0x0010:
            r2 = 0
        L_0x0011:
            return r2
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
            r2 = this;
            androidx.recyclerview.widget.j$o r0 = r2.f3124m
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r0.mo788a()
            if (r0 == 0) goto L_0x0014
            androidx.recyclerview.widget.j$o r0 = r2.f3124m
            androidx.recyclerview.widget.j$a0 r1 = r2.f3115h0
            int r1 = r0.mo756a(r1)
        L_0x0014:
            return r1
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
            r2 = this;
            androidx.recyclerview.widget.j$o r0 = r2.f3124m
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r0.mo788a()
            if (r0 == 0) goto L_0x0014
            androidx.recyclerview.widget.j$o r0 = r2.f3124m
            androidx.recyclerview.widget.j$a0 r1 = r2.f3115h0
            int r1 = r0.mo723b(r1)
        L_0x0014:
            return r1
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
            r2 = this;
            androidx.recyclerview.widget.j$o r0 = r2.f3124m
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r0.mo788a()
            if (r0 == 0) goto L_0x0014
            androidx.recyclerview.widget.j$o r0 = r2.f3124m
            androidx.recyclerview.widget.j$a0 r1 = r2.f3115h0
            int r1 = r0.mo711c(r1)
        L_0x0014:
            return r1
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
            r2 = this;
            androidx.recyclerview.widget.j$o r0 = r2.f3124m
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r0.mo732b()
            if (r0 == 0) goto L_0x0014
            androidx.recyclerview.widget.j$o r0 = r2.f3124m
            androidx.recyclerview.widget.j$a0 r1 = r2.f3115h0
            int r1 = r0.mo701d(r1)
        L_0x0014:
            return r1
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
            r2 = this;
            androidx.recyclerview.widget.j$o r0 = r2.f3124m
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r0.mo732b()
            if (r0 == 0) goto L_0x0014
            androidx.recyclerview.widget.j$o r0 = r2.f3124m
            androidx.recyclerview.widget.j$a0 r1 = r2.f3115h0
            int r1 = r0.mo694e(r1)
        L_0x0014:
            return r1
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
            r2 = this;
            androidx.recyclerview.widget.j$o r0 = r2.f3124m
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r0.mo732b()
            if (r0 == 0) goto L_0x0014
            androidx.recyclerview.widget.j$o r0 = r2.f3124m
            androidx.recyclerview.widget.j$a0 r1 = r2.f3115h0
            int r1 = r0.mo688f(r1)
        L_0x0014:
            return r1
    }

    /* renamed from: d */
    public androidx.recyclerview.widget.C0813j.AbstractC0821d0 m950d(android.view.View r1) {
            r0 = this;
            android.view.View r1 = r0.m956c(r1)
            if (r1 != 0) goto L_0x0008
            r1 = 0
            goto L_0x000c
        L_0x0008:
            androidx.recyclerview.widget.j$d0 r1 = r0.m945e(r1)
        L_0x000c:
            return r1
    }

    /* renamed from: d */
    void m953d() {
            r5 = this;
            java.util.List<androidx.recyclerview.widget.j$d0> r0 = r5.f3145w0
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L_0x0008:
            if (r0 < 0) goto L_0x0030
            java.util.List<androidx.recyclerview.widget.j$d0> r1 = r5.f3145w0
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.j$d0 r1 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r1
            android.view.View r2 = r1.f3179a
            android.view.ViewParent r2 = r2.getParent()
            if (r2 != r5) goto L_0x002d
            boolean r2 = r1.m856x()
            if (r2 == 0) goto L_0x0021
            goto L_0x002d
        L_0x0021:
            int r2 = r1.f3195q
            r3 = -1
            if (r2 == r3) goto L_0x002d
            android.view.View r4 = r1.f3179a
            p000a.p018g.p029l.C0216r.m3418e(r4, r2)
            r1.f3195q = r3
        L_0x002d:
            int r0 = r0 + (-1)
            goto L_0x0008
        L_0x0030:
            java.util.List<androidx.recyclerview.widget.j$d0> r0 = r5.f3145w0
            r0.clear()
            return
    }

    /* renamed from: d */
    void m951d(int r3, int r4) {
            r2 = this;
            int r0 = r2.f3084G
            int r0 = r0 + 1
            r2.f3084G = r0
            int r0 = r2.getScrollX()
            int r1 = r2.getScrollY()
            r2.onScrollChanged(r0, r1, r0, r1)
            r2.m934h(r3, r4)
            androidx.recyclerview.widget.j$t r0 = r2.f3117i0
            if (r0 == 0) goto L_0x001b
            r0.mo643a(r2, r3, r4)
        L_0x001b:
            java.util.List<androidx.recyclerview.widget.j$t> r0 = r2.f3119j0
            if (r0 == 0) goto L_0x0035
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L_0x0025:
            if (r0 < 0) goto L_0x0035
            java.util.List<androidx.recyclerview.widget.j$t> r1 = r2.f3119j0
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.j$t r1 = (androidx.recyclerview.widget.C0813j.AbstractC0844t) r1
            r1.mo643a(r2, r3, r4)
            int r0 = r0 + (-1)
            goto L_0x0025
        L_0x0035:
            int r3 = r2.f3084G
            int r3 = r3 + (-1)
            r2.f3084G = r3
            return
    }

    /* renamed from: d */
    public boolean m952d(int r2) {
            r1 = this;
            a.g.l.k r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.m3467a(r2)
            return r2
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float r2, float r3, boolean r4) {
            r1 = this;
            a.g.l.k r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.m3468a(r2, r3, r4)
            return r2
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float r2, float r3) {
            r1 = this;
            a.g.l.k r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.m3469a(r2, r3)
            return r2
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int r2, int r3, int[] r4, int[] r5) {
            r1 = this;
            a.g.l.k r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.m3463a(r2, r3, r4, r5)
            return r2
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int r7, int r8, int r9, int r10, int[] r11) {
            r6 = this;
            a.g.l.k r0 = r6.getScrollingChildHelper()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.m3465a(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> r1) {
            r0 = this;
            r0.dispatchThawSelfOnly(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(android.util.SparseArray<android.os.Parcelable> r1) {
            r0 = this;
            r0.dispatchFreezeSelfOnly(r1)
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r8) {
            r7 = this;
            super.draw(r8)
            java.util.ArrayList<androidx.recyclerview.widget.j$n> r0 = r7.f3128o
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L_0x000b:
            if (r2 >= r0) goto L_0x001d
            java.util.ArrayList<androidx.recyclerview.widget.j$n> r3 = r7.f3128o
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.j$n r3 = (androidx.recyclerview.widget.C0813j.AbstractC0834n) r3
            androidx.recyclerview.widget.j$a0 r4 = r7.f3115h0
            r3.mo792b(r8, r7, r4)
            int r2 = r2 + 1
            goto L_0x000b
        L_0x001d:
            android.widget.EdgeEffect r0 = r7.f3086I
            r2 = 1
            if (r0 == 0) goto L_0x0057
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0057
            int r0 = r8.save()
            boolean r3 = r7.f3114h
            if (r3 == 0) goto L_0x0035
            int r3 = r7.getPaddingBottom()
            goto L_0x0036
        L_0x0035:
            r3 = 0
        L_0x0036:
            r4 = 1132920832(0x43870000, float:270.0)
            r8.rotate(r4)
            int r4 = r7.getHeight()
            int r4 = -r4
            int r4 = r4 + r3
            float r3 = (float) r4
            r4 = 0
            r8.translate(r3, r4)
            android.widget.EdgeEffect r3 = r7.f3086I
            if (r3 == 0) goto L_0x0052
            boolean r3 = r3.draw(r8)
            if (r3 == 0) goto L_0x0052
            r3 = 1
            goto L_0x0053
        L_0x0052:
            r3 = 0
        L_0x0053:
            r8.restoreToCount(r0)
            goto L_0x0058
        L_0x0057:
            r3 = 0
        L_0x0058:
            android.widget.EdgeEffect r0 = r7.f3087J
            if (r0 == 0) goto L_0x0088
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0088
            int r0 = r8.save()
            boolean r4 = r7.f3114h
            if (r4 == 0) goto L_0x0077
            int r4 = r7.getPaddingLeft()
            float r4 = (float) r4
            int r5 = r7.getPaddingTop()
            float r5 = (float) r5
            r8.translate(r4, r5)
        L_0x0077:
            android.widget.EdgeEffect r4 = r7.f3087J
            if (r4 == 0) goto L_0x0083
            boolean r4 = r4.draw(r8)
            if (r4 == 0) goto L_0x0083
            r4 = 1
            goto L_0x0084
        L_0x0083:
            r4 = 0
        L_0x0084:
            r3 = r3 | r4
            r8.restoreToCount(r0)
        L_0x0088:
            android.widget.EdgeEffect r0 = r7.f3088K
            if (r0 == 0) goto L_0x00c1
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00c1
            int r0 = r8.save()
            int r4 = r7.getWidth()
            boolean r5 = r7.f3114h
            if (r5 == 0) goto L_0x00a3
            int r5 = r7.getPaddingTop()
            goto L_0x00a4
        L_0x00a3:
            r5 = 0
        L_0x00a4:
            r6 = 1119092736(0x42b40000, float:90.0)
            r8.rotate(r6)
            int r5 = -r5
            float r5 = (float) r5
            int r4 = -r4
            float r4 = (float) r4
            r8.translate(r5, r4)
            android.widget.EdgeEffect r4 = r7.f3088K
            if (r4 == 0) goto L_0x00bc
            boolean r4 = r4.draw(r8)
            if (r4 == 0) goto L_0x00bc
            r4 = 1
            goto L_0x00bd
        L_0x00bc:
            r4 = 0
        L_0x00bd:
            r3 = r3 | r4
            r8.restoreToCount(r0)
        L_0x00c1:
            android.widget.EdgeEffect r0 = r7.f3089L
            if (r0 == 0) goto L_0x010d
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x010d
            int r0 = r8.save()
            r4 = 1127481344(0x43340000, float:180.0)
            r8.rotate(r4)
            boolean r4 = r7.f3114h
            if (r4 == 0) goto L_0x00ee
            int r4 = r7.getWidth()
            int r4 = -r4
            int r5 = r7.getPaddingRight()
            int r4 = r4 + r5
            float r4 = (float) r4
            int r5 = r7.getHeight()
            int r5 = -r5
            int r6 = r7.getPaddingBottom()
            int r5 = r5 + r6
            goto L_0x00f9
        L_0x00ee:
            int r4 = r7.getWidth()
            int r4 = -r4
            float r4 = (float) r4
            int r5 = r7.getHeight()
            int r5 = -r5
        L_0x00f9:
            float r5 = (float) r5
            r8.translate(r4, r5)
            android.widget.EdgeEffect r4 = r7.f3089L
            if (r4 == 0) goto L_0x0108
            boolean r4 = r4.draw(r8)
            if (r4 == 0) goto L_0x0108
            r1 = 1
        L_0x0108:
            r1 = r1 | r3
            r8.restoreToCount(r0)
            goto L_0x010e
        L_0x010d:
            r1 = r3
        L_0x010e:
            if (r1 != 0) goto L_0x0125
            androidx.recyclerview.widget.j$l r8 = r7.f3090M
            if (r8 == 0) goto L_0x0125
            java.util.ArrayList<androidx.recyclerview.widget.j$n> r8 = r7.f3128o
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x0125
            androidx.recyclerview.widget.j$l r8 = r7.f3090M
            boolean r8 = r8.mo804g()
            if (r8 == 0) goto L_0x0125
            r1 = 1
        L_0x0125:
            if (r1 == 0) goto L_0x012a
            p000a.p018g.p029l.C0216r.m3450A(r7)
        L_0x012a:
            return
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas r1, android.view.View r2, long r3) {
            r0 = this;
            boolean r1 = super.drawChild(r1, r2, r3)
            return r1
    }

    /* renamed from: e */
    public androidx.recyclerview.widget.C0813j.AbstractC0821d0 m945e(android.view.View r4) {
            r3 = this;
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L_0x0028
            if (r0 != r3) goto L_0x0009
            goto L_0x0028
        L_0x0009:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "View "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " is not a direct child of "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x0028:
            androidx.recyclerview.widget.j$d0 r4 = m924k(r4)
            return r4
    }

    /* renamed from: e */
    void m948e() {
            r4 = this;
            android.widget.EdgeEffect r0 = r4.f3089L
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            androidx.recyclerview.widget.j$k r0 = r4.f3085H
            r1 = 3
            android.widget.EdgeEffect r0 = r0.m819a(r4, r1)
            r4.f3089L = r0
            boolean r0 = r4.f3114h
            if (r0 == 0) goto L_0x0031
            android.widget.EdgeEffect r0 = r4.f3089L
            int r1 = r4.getMeasuredWidth()
            int r2 = r4.getPaddingLeft()
            int r1 = r1 - r2
            int r2 = r4.getPaddingRight()
            int r1 = r1 - r2
            int r2 = r4.getMeasuredHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            goto L_0x003b
        L_0x0031:
            android.widget.EdgeEffect r0 = r4.f3089L
            int r1 = r4.getMeasuredWidth()
            int r2 = r4.getMeasuredHeight()
        L_0x003b:
            r0.setSize(r1, r2)
            return
    }

    /* renamed from: e */
    public void m947e(int r4) {
            r3 = this;
            androidx.recyclerview.widget.b r0 = r3.f3110f
            int r0 = r0.m1130a()
            r1 = 0
        L_0x0007:
            if (r1 >= r0) goto L_0x0015
            androidx.recyclerview.widget.b r2 = r3.f3110f
            android.view.View r2 = r2.m1120c(r1)
            r2.offsetLeftAndRight(r4)
            int r1 = r1 + 1
            goto L_0x0007
        L_0x0015:
            return
    }

    /* renamed from: e */
    public boolean m946e(int r8, int r9) {
            r7 = this;
            androidx.recyclerview.widget.j$o r0 = r7.f3124m
            r1 = 0
            if (r0 != 0) goto L_0x000d
            java.lang.String r8 = "RecyclerView"
            java.lang.String r9 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r8, r9)
            return r1
        L_0x000d:
            boolean r2 = r7.f3146x
            if (r2 == 0) goto L_0x0012
            return r1
        L_0x0012:
            boolean r0 = r0.mo788a()
            androidx.recyclerview.widget.j$o r2 = r7.f3124m
            boolean r2 = r2.mo732b()
            if (r0 == 0) goto L_0x0026
            int r3 = java.lang.Math.abs(r8)
            int r4 = r7.f3100W
            if (r3 >= r4) goto L_0x0027
        L_0x0026:
            r8 = 0
        L_0x0027:
            if (r2 == 0) goto L_0x0031
            int r3 = java.lang.Math.abs(r9)
            int r4 = r7.f3100W
            if (r3 >= r4) goto L_0x0032
        L_0x0031:
            r9 = 0
        L_0x0032:
            if (r8 != 0) goto L_0x0037
            if (r9 != 0) goto L_0x0037
            return r1
        L_0x0037:
            float r3 = (float) r8
            float r4 = (float) r9
            boolean r5 = r7.dispatchNestedPreFling(r3, r4)
            if (r5 != 0) goto L_0x007e
            r5 = 1
            if (r0 != 0) goto L_0x0047
            if (r2 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r6 = 0
            goto L_0x0048
        L_0x0047:
            r6 = 1
        L_0x0048:
            r7.dispatchNestedFling(r3, r4, r6)
            androidx.recyclerview.widget.j$r r3 = r7.f3099V
            if (r3 == 0) goto L_0x0056
            boolean r3 = r3.m648a(r8, r9)
            if (r3 == 0) goto L_0x0056
            return r5
        L_0x0056:
            if (r6 == 0) goto L_0x007e
            if (r0 == 0) goto L_0x005b
            r1 = 1
        L_0x005b:
            if (r2 == 0) goto L_0x005f
            r1 = r1 | 2
        L_0x005f:
            r7.m928j(r1, r5)
            int r0 = r7.f3101a0
            int r1 = -r0
            int r8 = java.lang.Math.min(r8, r0)
            int r8 = java.lang.Math.max(r1, r8)
            int r0 = r7.f3101a0
            int r1 = -r0
            int r9 = java.lang.Math.min(r9, r0)
            int r9 = java.lang.Math.max(r1, r9)
            androidx.recyclerview.widget.j$c0 r0 = r7.f3109e0
            r0.m897a(r8, r9)
            return r5
        L_0x007e:
            return r1
    }

    /* renamed from: f */
    android.graphics.Rect m940f(android.view.View r9) {
            r8 = this;
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.recyclerview.widget.j$p r0 = (androidx.recyclerview.widget.C0813j.C0840p) r0
            boolean r1 = r0.f3236c
            if (r1 != 0) goto L_0x000d
            android.graphics.Rect r9 = r0.f3235b
            return r9
        L_0x000d:
            androidx.recyclerview.widget.j$a0 r1 = r8.f3115h0
            boolean r1 = r1.m902d()
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0.m653b()
            if (r1 != 0) goto L_0x0021
            boolean r1 = r0.m651d()
            if (r1 == 0) goto L_0x0024
        L_0x0021:
            android.graphics.Rect r9 = r0.f3235b
            return r9
        L_0x0024:
            android.graphics.Rect r1 = r0.f3235b
            r2 = 0
            r1.set(r2, r2, r2, r2)
            java.util.ArrayList<androidx.recyclerview.widget.j$n> r3 = r8.f3128o
            int r3 = r3.size()
            r4 = 0
        L_0x0031:
            if (r4 >= r3) goto L_0x0068
            android.graphics.Rect r5 = r8.f3116i
            r5.set(r2, r2, r2, r2)
            java.util.ArrayList<androidx.recyclerview.widget.j$n> r5 = r8.f3128o
            java.lang.Object r5 = r5.get(r4)
            androidx.recyclerview.widget.j$n r5 = (androidx.recyclerview.widget.C0813j.AbstractC0834n) r5
            android.graphics.Rect r6 = r8.f3116i
            androidx.recyclerview.widget.j$a0 r7 = r8.f3115h0
            r5.m794a(r6, r9, r8, r7)
            int r5 = r1.left
            android.graphics.Rect r6 = r8.f3116i
            int r7 = r6.left
            int r5 = r5 + r7
            r1.left = r5
            int r5 = r1.top
            int r7 = r6.top
            int r5 = r5 + r7
            r1.top = r5
            int r5 = r1.right
            int r7 = r6.right
            int r5 = r5 + r7
            r1.right = r5
            int r5 = r1.bottom
            int r6 = r6.bottom
            int r5 = r5 + r6
            r1.bottom = r5
            int r4 = r4 + 1
            goto L_0x0031
        L_0x0068:
            r0.f3236c = r2
            return r1
    }

    /* renamed from: f */
    void m943f() {
            r4 = this;
            android.widget.EdgeEffect r0 = r4.f3086I
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            androidx.recyclerview.widget.j$k r0 = r4.f3085H
            r1 = 0
            android.widget.EdgeEffect r0 = r0.m819a(r4, r1)
            r4.f3086I = r0
            boolean r0 = r4.f3114h
            if (r0 == 0) goto L_0x0031
            android.widget.EdgeEffect r0 = r4.f3086I
            int r1 = r4.getMeasuredHeight()
            int r2 = r4.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r4.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = r4.getMeasuredWidth()
            int r3 = r4.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r4.getPaddingRight()
            int r2 = r2 - r3
            goto L_0x003b
        L_0x0031:
            android.widget.EdgeEffect r0 = r4.f3086I
            int r1 = r4.getMeasuredHeight()
            int r2 = r4.getMeasuredWidth()
        L_0x003b:
            r0.setSize(r1, r2)
            return
    }

    /* renamed from: f */
    public void m942f(int r4) {
            r3 = this;
            androidx.recyclerview.widget.b r0 = r3.f3110f
            int r0 = r0.m1130a()
            r1 = 0
        L_0x0007:
            if (r1 >= r0) goto L_0x0015
            androidx.recyclerview.widget.b r2 = r3.f3110f
            android.view.View r2 = r2.m1120c(r1)
            r2.offsetTopAndBottom(r4)
            int r1 = r1 + 1
            goto L_0x0007
        L_0x0015:
            return
    }

    /* renamed from: f */
    void m941f(int r6, int r7) {
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.f3110f
            int r0 = r0.m1124b()
            r1 = 0
            r2 = 0
        L_0x0008:
            if (r2 >= r0) goto L_0x002b
            androidx.recyclerview.widget.b r3 = r5.f3110f
            android.view.View r3 = r3.m1118d(r2)
            androidx.recyclerview.widget.j$d0 r3 = m924k(r3)
            if (r3 == 0) goto L_0x0028
            boolean r4 = r3.m856x()
            if (r4 != 0) goto L_0x0028
            int r4 = r3.f3181c
            if (r4 < r6) goto L_0x0028
            r3.m885a(r7, r1)
            androidx.recyclerview.widget.j$a0 r3 = r5.f3115h0
            r4 = 1
            r3.f3158g = r4
        L_0x0028:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x002b:
            androidx.recyclerview.widget.j$v r0 = r5.f3104c
            r0.m628a(r6, r7)
            r5.requestLayout()
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.View focusSearch(android.view.View r9, int r10) {
            r8 = this;
            androidx.recyclerview.widget.j$o r0 = r8.f3124m
            android.view.View r0 = r0.m702d(r9, r10)
            if (r0 == 0) goto L_0x0009
            return r0
        L_0x0009:
            androidx.recyclerview.widget.j$g r0 = r8.f3122l
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001f
            androidx.recyclerview.widget.j$o r0 = r8.f3124m
            if (r0 == 0) goto L_0x001f
            boolean r0 = r8.m920n()
            if (r0 != 0) goto L_0x001f
            boolean r0 = r8.f3146x
            if (r0 != 0) goto L_0x001f
            r0 = 1
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            r4 = 0
            if (r0 == 0) goto L_0x009b
            r5 = 2
            if (r10 == r5) goto L_0x002c
            if (r10 != r1) goto L_0x009b
        L_0x002c:
            androidx.recyclerview.widget.j$o r0 = r8.f3124m
            boolean r0 = r0.mo732b()
            if (r0 == 0) goto L_0x004a
            if (r10 != r5) goto L_0x0039
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x003b
        L_0x0039:
            r0 = 33
        L_0x003b:
            android.view.View r6 = r3.findNextFocus(r8, r9, r0)
            if (r6 != 0) goto L_0x0043
            r6 = 1
            goto L_0x0044
        L_0x0043:
            r6 = 0
        L_0x0044:
            boolean r7 = androidx.recyclerview.widget.C0813j.f3073E0
            if (r7 == 0) goto L_0x004b
            r10 = r0
            goto L_0x004b
        L_0x004a:
            r6 = 0
        L_0x004b:
            if (r6 != 0) goto L_0x007b
            androidx.recyclerview.widget.j$o r0 = r8.f3124m
            boolean r0 = r0.mo788a()
            if (r0 == 0) goto L_0x007b
            androidx.recyclerview.widget.j$o r0 = r8.f3124m
            int r0 = r0.m678j()
            if (r0 != r1) goto L_0x005f
            r0 = 1
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            if (r10 != r5) goto L_0x0064
            r5 = 1
            goto L_0x0065
        L_0x0064:
            r5 = 0
        L_0x0065:
            r0 = r0 ^ r5
            if (r0 == 0) goto L_0x006b
            r0 = 66
            goto L_0x006d
        L_0x006b:
            r0 = 17
        L_0x006d:
            android.view.View r5 = r3.findNextFocus(r8, r9, r0)
            if (r5 != 0) goto L_0x0075
            r6 = 1
            goto L_0x0076
        L_0x0075:
            r6 = 0
        L_0x0076:
            boolean r1 = androidx.recyclerview.widget.C0813j.f3073E0
            if (r1 == 0) goto L_0x007b
            r10 = r0
        L_0x007b:
            if (r6 == 0) goto L_0x0096
            r8.m971b()
            android.view.View r0 = r8.m956c(r9)
            if (r0 != 0) goto L_0x0087
            return r4
        L_0x0087:
            r8.m911w()
            androidx.recyclerview.widget.j$o r0 = r8.f3124m
            androidx.recyclerview.widget.j$v r1 = r8.f3104c
            androidx.recyclerview.widget.j$a0 r5 = r8.f3115h0
            r0.mo765a(r9, r10, r1, r5)
            r8.m954c(r2)
        L_0x0096:
            android.view.View r0 = r3.findNextFocus(r8, r9, r10)
            goto L_0x00bf
        L_0x009b:
            android.view.View r1 = r3.findNextFocus(r8, r9, r10)
            if (r1 != 0) goto L_0x00be
            if (r0 == 0) goto L_0x00be
            r8.m971b()
            android.view.View r0 = r8.m956c(r9)
            if (r0 != 0) goto L_0x00ad
            return r4
        L_0x00ad:
            r8.m911w()
            androidx.recyclerview.widget.j$o r0 = r8.f3124m
            androidx.recyclerview.widget.j$v r1 = r8.f3104c
            androidx.recyclerview.widget.j$a0 r3 = r8.f3115h0
            android.view.View r0 = r0.mo765a(r9, r10, r1, r3)
            r8.m954c(r2)
            goto L_0x00bf
        L_0x00be:
            r0 = r1
        L_0x00bf:
            if (r0 == 0) goto L_0x00d6
            boolean r1 = r0.hasFocusable()
            if (r1 != 0) goto L_0x00d6
            android.view.View r1 = r8.getFocusedChild()
            if (r1 != 0) goto L_0x00d2
            android.view.View r9 = super.focusSearch(r9, r10)
            return r9
        L_0x00d2:
            r8.m992a(r0, r4)
            return r9
        L_0x00d6:
            boolean r1 = r8.m991a(r9, r0, r10)
            if (r1 == 0) goto L_0x00dd
            goto L_0x00e1
        L_0x00dd:
            android.view.View r0 = super.focusSearch(r9, r10)
        L_0x00e1:
            return r0
    }

    /* renamed from: g */
    void m939g() {
            r4 = this;
            android.widget.EdgeEffect r0 = r4.f3088K
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            androidx.recyclerview.widget.j$k r0 = r4.f3085H
            r1 = 2
            android.widget.EdgeEffect r0 = r0.m819a(r4, r1)
            r4.f3088K = r0
            boolean r0 = r4.f3114h
            if (r0 == 0) goto L_0x0031
            android.widget.EdgeEffect r0 = r4.f3088K
            int r1 = r4.getMeasuredHeight()
            int r2 = r4.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r4.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = r4.getMeasuredWidth()
            int r3 = r4.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r4.getPaddingRight()
            int r2 = r2 - r3
            goto L_0x003b
        L_0x0031:
            android.widget.EdgeEffect r0 = r4.f3088K
            int r1 = r4.getMeasuredHeight()
            int r2 = r4.getMeasuredWidth()
        L_0x003b:
            r0.setSize(r1, r2)
            return
    }

    /* renamed from: g */
    public void m938g(int r1) {
            r0 = this;
            return
    }

    /* renamed from: g */
    void m937g(int r10, int r11) {
            r9 = this;
            androidx.recyclerview.widget.b r0 = r9.f3110f
            int r0 = r0.m1124b()
            r1 = 1
            if (r10 >= r11) goto L_0x000e
            r2 = -1
            r2 = r10
            r3 = r11
            r4 = -1
            goto L_0x0011
        L_0x000e:
            r3 = r10
            r2 = r11
            r4 = 1
        L_0x0011:
            r5 = 0
            r6 = 0
        L_0x0013:
            if (r6 >= r0) goto L_0x003a
            androidx.recyclerview.widget.b r7 = r9.f3110f
            android.view.View r7 = r7.m1118d(r6)
            androidx.recyclerview.widget.j$d0 r7 = m924k(r7)
            if (r7 == 0) goto L_0x0037
            int r8 = r7.f3181c
            if (r8 < r2) goto L_0x0037
            if (r8 <= r3) goto L_0x0028
            goto L_0x0037
        L_0x0028:
            if (r8 != r10) goto L_0x0030
            int r8 = r11 - r10
            r7.m885a(r8, r5)
            goto L_0x0033
        L_0x0030:
            r7.m885a(r4, r5)
        L_0x0033:
            androidx.recyclerview.widget.j$a0 r7 = r9.f3115h0
            r7.f3158g = r1
        L_0x0037:
            int r6 = r6 + 1
            goto L_0x0013
        L_0x003a:
            androidx.recyclerview.widget.j$v r0 = r9.f3104c
            r0.m613b(r10, r11)
            r9.requestLayout()
            return
    }

    /* renamed from: g */
    public void m936g(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            androidx.recyclerview.widget.j$o r0 = r3.f3124m
            if (r0 == 0) goto L_0x0009
            androidx.recyclerview.widget.j$p r0 = r0.mo716c()
            return r0
        L_0x0009:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "RecyclerView has no LayoutManager"
            r1.append(r2)
            java.lang.String r2 = r3.m932i()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.recyclerview.widget.j$o r0 = r2.f3124m
            if (r0 == 0) goto L_0x000d
            android.content.Context r1 = r2.getContext()
            androidx.recyclerview.widget.j$p r3 = r0.mo776a(r1, r3)
            return r3
        L_0x000d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "RecyclerView has no LayoutManager"
            r0.append(r1)
            java.lang.String r1 = r2.m932i()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r3) {
            r2 = this;
            androidx.recyclerview.widget.j$o r0 = r2.f3124m
            if (r0 == 0) goto L_0x0009
            androidx.recyclerview.widget.j$p r3 = r0.mo758a(r3)
            return r3
        L_0x0009:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "RecyclerView has no LayoutManager"
            r0.append(r1)
            java.lang.String r1 = r2.m932i()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public androidx.recyclerview.widget.C0813j.AbstractC0824g getAdapter() {
            r1 = this;
            androidx.recyclerview.widget.j$g r0 = r1.f3122l
            return r0
    }

    @Override // android.view.View
    public int getBaseline() {
            r1 = this;
            androidx.recyclerview.widget.j$o r0 = r1.f3124m
            if (r0 == 0) goto L_0x0009
            int r0 = r0.m706d()
            return r0
        L_0x0009:
            int r0 = super.getBaseline()
            return r0
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int r2, int r3) {
            r1 = this;
            androidx.recyclerview.widget.j$j r0 = r1.f3131p0
            if (r0 != 0) goto L_0x0009
            int r2 = super.getChildDrawingOrder(r2, r3)
            return r2
        L_0x0009:
            int r2 = r0.m820a(r2, r3)
            return r2
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
            r1 = this;
            boolean r0 = r1.f3114h
            return r0
    }

    public androidx.recyclerview.widget.C0854k getCompatAccessibilityDelegate() {
            r1 = this;
            androidx.recyclerview.widget.k r0 = r1.f3129o0
            return r0
    }

    public androidx.recyclerview.widget.C0813j.C0828k getEdgeEffectFactory() {
            r1 = this;
            androidx.recyclerview.widget.j$k r0 = r1.f3085H
            return r0
    }

    public androidx.recyclerview.widget.C0813j.AbstractC0829l getItemAnimator() {
            r1 = this;
            androidx.recyclerview.widget.j$l r0 = r1.f3090M
            return r0
    }

    public int getItemDecorationCount() {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.j$n> r0 = r1.f3128o
            int r0 = r0.size()
            return r0
    }

    public androidx.recyclerview.widget.C0813j.AbstractC0835o getLayoutManager() {
            r1 = this;
            androidx.recyclerview.widget.j$o r0 = r1.f3124m
            return r0
    }

    public int getMaxFlingVelocity() {
            r1 = this;
            int r0 = r1.f3101a0
            return r0
    }

    public int getMinFlingVelocity() {
            r1 = this;
            int r0 = r1.f3100W
            return r0
    }

    long getNanoTime() {
            r2 = this;
            boolean r0 = androidx.recyclerview.widget.C0813j.f3072D0
            if (r0 == 0) goto L_0x0009
            long r0 = java.lang.System.nanoTime()
            return r0
        L_0x0009:
            r0 = 0
            return r0
    }

    public androidx.recyclerview.widget.C0813j.AbstractC0842r getOnFlingListener() {
            r1 = this;
            androidx.recyclerview.widget.j$r r0 = r1.f3099V
            return r0
    }

    public boolean getPreserveFocusAfterLayout() {
            r1 = this;
            boolean r0 = r1.f3107d0
            return r0
    }

    public androidx.recyclerview.widget.C0813j.C0845u getRecycledViewPool() {
            r1 = this;
            androidx.recyclerview.widget.j$v r0 = r1.f3104c
            androidx.recyclerview.widget.j$u r0 = r0.m604d()
            return r0
    }

    public int getScrollState() {
            r1 = this;
            int r0 = r1.f3091N
            return r0
    }

    /* renamed from: h */
    void m935h() {
            r4 = this;
            android.widget.EdgeEffect r0 = r4.f3087J
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            androidx.recyclerview.widget.j$k r0 = r4.f3085H
            r1 = 1
            android.widget.EdgeEffect r0 = r0.m819a(r4, r1)
            r4.f3087J = r0
            boolean r0 = r4.f3114h
            if (r0 == 0) goto L_0x0031
            android.widget.EdgeEffect r0 = r4.f3087J
            int r1 = r4.getMeasuredWidth()
            int r2 = r4.getPaddingLeft()
            int r1 = r1 - r2
            int r2 = r4.getPaddingRight()
            int r1 = r1 - r2
            int r2 = r4.getMeasuredHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            goto L_0x003b
        L_0x0031:
            android.widget.EdgeEffect r0 = r4.f3087J
            int r1 = r4.getMeasuredWidth()
            int r2 = r4.getMeasuredHeight()
        L_0x003b:
            r0.setSize(r1, r2)
            return
    }

    /* renamed from: h */
    public void m934h(int r1, int r2) {
            r0 = this;
            return
    }

    /* renamed from: h */
    public void m933h(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
            r1 = this;
            a.g.l.k r0 = r1.getScrollingChildHelper()
            boolean r0 = r0.m3470a()
            return r0
    }

    /* renamed from: i */
    java.lang.String m932i() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ", adapter:"
            r0.append(r1)
            androidx.recyclerview.widget.j$g r1 = r2.f3122l
            r0.append(r1)
            java.lang.String r1 = ", layout:"
            r0.append(r1)
            androidx.recyclerview.widget.j$o r1 = r2.f3124m
            r0.append(r1)
            java.lang.String r1 = ", context:"
            r0.append(r1)
            android.content.Context r1 = r2.getContext()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* renamed from: i */
    public void m931i(int r2, int r3) {
            r1 = this;
            r0 = 0
            r1.m1006a(r2, r3, r0)
            return
    }

    /* renamed from: i */
    boolean m930i(android.view.View r3) {
            r2 = this;
            r2.m911w()
            androidx.recyclerview.widget.b r0 = r2.f3110f
            boolean r0 = r0.m1115e(r3)
            if (r0 == 0) goto L_0x0019
            androidx.recyclerview.widget.j$d0 r3 = m924k(r3)
            androidx.recyclerview.widget.j$v r1 = r2.f3104c
            r1.m605c(r3)
            androidx.recyclerview.widget.j$v r1 = r2.f3104c
            r1.m610b(r3)
        L_0x0019:
            r3 = r0 ^ 1
            r2.m954c(r3)
            return r0
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
            r1 = this;
            boolean r0 = r1.f3134r
            return r0
    }

    @Override // android.view.View, p000a.p018g.p029l.AbstractC0208j
    public boolean isNestedScrollingEnabled() {
            r1 = this;
            a.g.l.k r0 = r1.getScrollingChildHelper()
            boolean r0 = r0.m3459b()
            return r0
    }

    /* renamed from: j */
    public boolean m929j() {
            r1 = this;
            boolean r0 = r1.f3140u
            if (r0 == 0) goto L_0x0013
            boolean r0 = r1.f3081D
            if (r0 != 0) goto L_0x0013
            androidx.recyclerview.widget.a r0 = r1.f3108e
            boolean r0 = r0.m1142c()
            if (r0 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r0 = 0
            goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            return r0
    }

    /* renamed from: j */
    public boolean m928j(int r2, int r3) {
            r1 = this;
            a.g.l.k r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.m3466a(r2, r3)
            return r2
    }

    /* renamed from: k */
    void m926k() {
            r2 = this;
            androidx.recyclerview.widget.a r0 = new androidx.recyclerview.widget.a
            androidx.recyclerview.widget.j$f r1 = new androidx.recyclerview.widget.j$f
            r1.<init>(r2)
            r0.<init>(r1)
            r2.f3108e = r0
            return
    }

    /* renamed from: l */
    void m923l() {
            r1 = this;
            r0 = 0
            r1.f3089L = r0
            r1.f3087J = r0
            r1.f3088K = r0
            r1.f3086I = r0
            return
    }

    /* renamed from: m */
    boolean m921m() {
            r1 = this;
            android.view.accessibility.AccessibilityManager r0 = r1.f3079B
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            return r0
    }

    /* renamed from: n */
    public boolean m920n() {
            r1 = this;
            int r0 = r1.f3083F
            if (r0 <= 0) goto L_0x0006
            r0 = 1
            goto L_0x0007
        L_0x0006:
            r0 = 0
        L_0x0007:
            return r0
    }

    /* renamed from: o */
    void m919o() {
            r4 = this;
            androidx.recyclerview.widget.b r0 = r4.f3110f
            int r0 = r0.m1124b()
            r1 = 0
        L_0x0007:
            if (r1 >= r0) goto L_0x001b
            androidx.recyclerview.widget.b r2 = r4.f3110f
            android.view.View r2 = r2.m1118d(r1)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.recyclerview.widget.j$p r2 = (androidx.recyclerview.widget.C0813j.C0840p) r2
            r3 = 1
            r2.f3236c = r3
            int r1 = r1 + 1
            goto L_0x0007
        L_0x001b:
            androidx.recyclerview.widget.j$v r0 = r4.f3104c
            r0.m595g()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r4 = this;
            super.onAttachedToWindow()
            r0 = 0
            r4.f3083F = r0
            r1 = 1
            r4.f3134r = r1
            boolean r2 = r4.f3140u
            if (r2 == 0) goto L_0x0014
            boolean r2 = r4.isLayoutRequested()
            if (r2 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            r4.f3140u = r1
            androidx.recyclerview.widget.j$o r1 = r4.f3124m
            if (r1 == 0) goto L_0x001e
            r1.m744a(r4)
        L_0x001e:
            r4.f3127n0 = r0
            boolean r0 = androidx.recyclerview.widget.C0813j.f3072D0
            if (r0 == 0) goto L_0x0067
            java.lang.ThreadLocal<androidx.recyclerview.widget.e> r0 = androidx.recyclerview.widget.RunnableC0802e.f3041f
            java.lang.Object r0 = r0.get()
            androidx.recyclerview.widget.e r0 = (androidx.recyclerview.widget.RunnableC0802e) r0
            r4.f3111f0 = r0
            androidx.recyclerview.widget.e r0 = r4.f3111f0
            if (r0 != 0) goto L_0x0062
            androidx.recyclerview.widget.e r0 = new androidx.recyclerview.widget.e
            r0.<init>()
            r4.f3111f0 = r0
            android.view.Display r0 = p000a.p018g.p029l.C0216r.m3419e(r4)
            r1 = 1114636288(0x42700000, float:60.0)
            boolean r2 = r4.isInEditMode()
            if (r2 != 0) goto L_0x0052
            if (r0 == 0) goto L_0x0052
            float r0 = r0.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r0 = 1114636288(0x42700000, float:60.0)
        L_0x0054:
            androidx.recyclerview.widget.e r1 = r4.f3111f0
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r2 = r2 / r0
            long r2 = (long) r2
            r1.f3045d = r2
            java.lang.ThreadLocal<androidx.recyclerview.widget.e> r0 = androidx.recyclerview.widget.RunnableC0802e.f3041f
            r0.set(r1)
        L_0x0062:
            androidx.recyclerview.widget.e r0 = r4.f3111f0
            r0.m1069a(r4)
        L_0x0067:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            androidx.recyclerview.widget.j$l r0 = r2.f3090M
            if (r0 == 0) goto L_0x000a
            r0.mo813b()
        L_0x000a:
            r2.m910x()
            r0 = 0
            r2.f3134r = r0
            androidx.recyclerview.widget.j$o r0 = r2.f3124m
            if (r0 == 0) goto L_0x0019
            androidx.recyclerview.widget.j$v r1 = r2.f3104c
            r0.m736a(r2, r1)
        L_0x0019:
            java.util.List<androidx.recyclerview.widget.j$d0> r0 = r2.f3145w0
            r0.clear()
            java.lang.Runnable r0 = r2.f3147x0
            r2.removeCallbacks(r0)
            androidx.recyclerview.widget.o r0 = r2.f3112g
            r0.m531b()
            boolean r0 = androidx.recyclerview.widget.C0813j.f3072D0
            if (r0 == 0) goto L_0x0036
            androidx.recyclerview.widget.e r0 = r2.f3111f0
            if (r0 == 0) goto L_0x0036
            r0.m1063b(r2)
            r0 = 0
            r2.f3111f0 = r0
        L_0x0036:
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            super.onDraw(r5)
            java.util.ArrayList<androidx.recyclerview.widget.j$n> r0 = r4.f3128o
            int r0 = r0.size()
            r1 = 0
        L_0x000a:
            if (r1 >= r0) goto L_0x001c
            java.util.ArrayList<androidx.recyclerview.widget.j$n> r2 = r4.f3128o
            java.lang.Object r2 = r2.get(r1)
            androidx.recyclerview.widget.j$n r2 = (androidx.recyclerview.widget.C0813j.AbstractC0834n) r2
            androidx.recyclerview.widget.j$a0 r3 = r4.f3115h0
            r2.m796a(r5, r4, r3)
            int r1 = r1 + 1
            goto L_0x000a
        L_0x001c:
            return
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
            r5 = this;
            androidx.recyclerview.widget.j$o r0 = r5.f3124m
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r5.f3146x
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L_0x0077
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L_0x003c
            androidx.recyclerview.widget.j$o r0 = r5.f3124m
            boolean r0 = r0.mo732b()
            if (r0 == 0) goto L_0x002c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            androidx.recyclerview.widget.j$o r3 = r5.f3124m
            boolean r3 = r3.mo788a()
            if (r3 == 0) goto L_0x0061
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L_0x0062
        L_0x003c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0060
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.j$o r3 = r5.f3124m
            boolean r3 = r3.mo732b()
            if (r3 == 0) goto L_0x0055
            float r0 = -r0
            goto L_0x0061
        L_0x0055:
            androidx.recyclerview.widget.j$o r3 = r5.f3124m
            boolean r3 = r3.mo788a()
            if (r3 == 0) goto L_0x0060
            r3 = r0
            r0 = 0
            goto L_0x0062
        L_0x0060:
            r0 = 0
        L_0x0061:
            r3 = 0
        L_0x0062:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x006a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0077
        L_0x006a:
            float r2 = r5.f3103b0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f3105c0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.m1007a(r2, r0, r6)
        L_0x0077:
            return r1
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
            r8 = this;
            boolean r0 = r8.f3146x
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r8.m968b(r9)
            r2 = 1
            if (r0 == 0) goto L_0x0011
            r8.m909y()
            return r2
        L_0x0011:
            androidx.recyclerview.widget.j$o r0 = r8.f3124m
            if (r0 != 0) goto L_0x0016
            return r1
        L_0x0016:
            boolean r0 = r0.mo788a()
            androidx.recyclerview.widget.j$o r3 = r8.f3124m
            boolean r3 = r3.mo732b()
            android.view.VelocityTracker r4 = r8.f3093P
            if (r4 != 0) goto L_0x002a
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r8.f3093P = r4
        L_0x002a:
            android.view.VelocityTracker r4 = r8.f3093P
            r4.addMovement(r9)
            int r4 = r9.getActionMasked()
            int r5 = r9.getActionIndex()
            r6 = 2
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r4 == 0) goto L_0x00da
            if (r4 == r2) goto L_0x00d1
            if (r4 == r6) goto L_0x0071
            r0 = 3
            if (r4 == r0) goto L_0x006c
            r0 = 5
            if (r4 == r0) goto L_0x0050
            r0 = 6
            if (r4 == r0) goto L_0x004b
            goto L_0x011a
        L_0x004b:
            r8.m957c(r9)
            goto L_0x011a
        L_0x0050:
            int r0 = r9.getPointerId(r5)
            r8.f3092O = r0
            float r0 = r9.getX(r5)
            float r0 = r0 + r7
            int r0 = (int) r0
            r8.f3096S = r0
            r8.f3094Q = r0
            float r9 = r9.getY(r5)
            float r9 = r9 + r7
            int r9 = (int) r9
            r8.f3097T = r9
            r8.f3095R = r9
            goto L_0x011a
        L_0x006c:
            r8.m909y()
            goto L_0x011a
        L_0x0071:
            int r4 = r8.f3092O
            int r4 = r9.findPointerIndex(r4)
            if (r4 >= 0) goto L_0x0097
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            r9.append(r0)
            int r0 = r8.f3092O
            r9.append(r0)
            java.lang.String r0 = " not found. Did any MotionEvents get skipped?"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "RecyclerView"
            android.util.Log.e(r0, r9)
            return r1
        L_0x0097:
            float r5 = r9.getX(r4)
            float r5 = r5 + r7
            int r5 = (int) r5
            float r9 = r9.getY(r4)
            float r9 = r9 + r7
            int r9 = (int) r9
            int r4 = r8.f3091N
            if (r4 == r2) goto L_0x011a
            int r4 = r8.f3094Q
            int r4 = r5 - r4
            int r6 = r8.f3095R
            int r6 = r9 - r6
            if (r0 == 0) goto L_0x00bd
            int r0 = java.lang.Math.abs(r4)
            int r4 = r8.f3098U
            if (r0 <= r4) goto L_0x00bd
            r8.f3096S = r5
            r0 = 1
            goto L_0x00be
        L_0x00bd:
            r0 = 0
        L_0x00be:
            if (r3 == 0) goto L_0x00cb
            int r3 = java.lang.Math.abs(r6)
            int r4 = r8.f3098U
            if (r3 <= r4) goto L_0x00cb
            r8.f3097T = r9
            r0 = 1
        L_0x00cb:
            if (r0 == 0) goto L_0x011a
            r8.setScrollState(r2)
            goto L_0x011a
        L_0x00d1:
            android.view.VelocityTracker r9 = r8.f3093P
            r9.clear()
            r8.mo1010a(r1)
            goto L_0x011a
        L_0x00da:
            boolean r4 = r8.f3148y
            if (r4 == 0) goto L_0x00e0
            r8.f3148y = r1
        L_0x00e0:
            int r4 = r9.getPointerId(r1)
            r8.f3092O = r4
            float r4 = r9.getX()
            float r4 = r4 + r7
            int r4 = (int) r4
            r8.f3096S = r4
            r8.f3094Q = r4
            float r9 = r9.getY()
            float r9 = r9 + r7
            int r9 = (int) r9
            r8.f3097T = r9
            r8.f3095R = r9
            int r9 = r8.f3091N
            if (r9 != r6) goto L_0x0108
            android.view.ViewParent r9 = r8.getParent()
            r9.requestDisallowInterceptTouchEvent(r2)
            r8.setScrollState(r2)
        L_0x0108:
            int[] r9 = r8.f3141u0
            r9[r2] = r1
            r9[r1] = r1
            if (r0 == 0) goto L_0x0112
            r9 = 1
            goto L_0x0113
        L_0x0112:
            r9 = 0
        L_0x0113:
            if (r3 == 0) goto L_0x0117
            r9 = r9 | 2
        L_0x0117:
            r8.m928j(r9, r1)
        L_0x011a:
            int r9 = r8.f3091N
            if (r9 != r2) goto L_0x011f
            r1 = 1
        L_0x011f:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            java.lang.String r1 = "RV OnLayout"
            p000a.p018g.p025h.C0159a.m3606a(r1)
            r0.m960c()
            p000a.p018g.p025h.C0159a.m3607a()
            r1 = 1
            r0.f3140u = r1
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r8, int r9) {
            r7 = this;
            androidx.recyclerview.widget.j$o r0 = r7.f3124m
            if (r0 != 0) goto L_0x0008
            r7.m958c(r8, r9)
            return
        L_0x0008:
            boolean r0 = r0.mo661u()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0074
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            int r3 = android.view.View.MeasureSpec.getMode(r9)
            androidx.recyclerview.widget.j$o r4 = r7.f3124m
            androidx.recyclerview.widget.j$v r5 = r7.f3104c
            androidx.recyclerview.widget.j$a0 r6 = r7.f3115h0
            r4.m750a(r5, r6, r8, r9)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r0 != r4) goto L_0x0028
            if (r3 != r4) goto L_0x0028
            r2 = 1
        L_0x0028:
            if (r2 != 0) goto L_0x0073
            androidx.recyclerview.widget.j$g r0 = r7.f3122l
            if (r0 != 0) goto L_0x002f
            goto L_0x0073
        L_0x002f:
            androidx.recyclerview.widget.j$a0 r0 = r7.f3115h0
            int r0 = r0.f3156e
            if (r0 != r1) goto L_0x0038
            r7.m1027A()
        L_0x0038:
            androidx.recyclerview.widget.j$o r0 = r7.f3124m
            r0.m730b(r8, r9)
            androidx.recyclerview.widget.j$a0 r0 = r7.f3115h0
            r0.f3161j = r1
            r7.m1026B()
            androidx.recyclerview.widget.j$o r0 = r7.f3124m
            r0.m704d(r8, r9)
            androidx.recyclerview.widget.j$o r0 = r7.f3124m
            boolean r0 = r0.mo791A()
            if (r0 == 0) goto L_0x00e0
            androidx.recyclerview.widget.j$o r0 = r7.f3124m
            int r2 = r7.getMeasuredWidth()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r4)
            int r3 = r7.getMeasuredHeight()
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4)
            r0.m730b(r2, r3)
            androidx.recyclerview.widget.j$a0 r0 = r7.f3115h0
            r0.f3161j = r1
            r7.m1026B()
            androidx.recyclerview.widget.j$o r0 = r7.f3124m
            r0.m704d(r8, r9)
            goto L_0x00e0
        L_0x0073:
            return
        L_0x0074:
            boolean r0 = r7.f3136s
            if (r0 == 0) goto L_0x0082
            androidx.recyclerview.widget.j$o r0 = r7.f3124m
            androidx.recyclerview.widget.j$v r1 = r7.f3104c
            androidx.recyclerview.widget.j$a0 r2 = r7.f3115h0
            r0.m750a(r1, r2, r8, r9)
            return
        L_0x0082:
            boolean r0 = r7.f3078A
            if (r0 == 0) goto L_0x00aa
            r7.m911w()
            r7.m917q()
            r7.m1019I()
            r7.m916r()
            androidx.recyclerview.widget.j$a0 r0 = r7.f3115h0
            boolean r3 = r0.f3163l
            if (r3 == 0) goto L_0x009b
            r0.f3159h = r1
            goto L_0x00a4
        L_0x009b:
            androidx.recyclerview.widget.a r0 = r7.f3108e
            r0.m1146b()
            androidx.recyclerview.widget.j$a0 r0 = r7.f3115h0
            r0.f3159h = r2
        L_0x00a4:
            r7.f3078A = r2
            r7.m954c(r2)
            goto L_0x00bc
        L_0x00aa:
            androidx.recyclerview.widget.j$a0 r0 = r7.f3115h0
            boolean r0 = r0.f3163l
            if (r0 == 0) goto L_0x00bc
            int r8 = r7.getMeasuredWidth()
            int r9 = r7.getMeasuredHeight()
            r7.setMeasuredDimension(r8, r9)
            return
        L_0x00bc:
            androidx.recyclerview.widget.j$g r0 = r7.f3122l
            if (r0 == 0) goto L_0x00c9
            androidx.recyclerview.widget.j$a0 r1 = r7.f3115h0
            int r0 = r0.mo106a()
            r1.f3157f = r0
            goto L_0x00cd
        L_0x00c9:
            androidx.recyclerview.widget.j$a0 r0 = r7.f3115h0
            r0.f3157f = r2
        L_0x00cd:
            r7.m911w()
            androidx.recyclerview.widget.j$o r0 = r7.f3124m
            androidx.recyclerview.widget.j$v r1 = r7.f3104c
            androidx.recyclerview.widget.j$a0 r3 = r7.f3115h0
            r0.m750a(r1, r3, r8, r9)
            r7.m954c(r2)
            androidx.recyclerview.widget.j$a0 r8 = r7.f3115h0
            r8.f3159h = r2
        L_0x00e0:
            return
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int r2, android.graphics.Rect r3) {
            r1 = this;
            boolean r0 = r1.m920n()
            if (r0 == 0) goto L_0x0008
            r2 = 0
            return r2
        L_0x0008:
            boolean r2 = super.onRequestFocusInDescendants(r2, r3)
            return r2
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.recyclerview.widget.C0813j.C0850y
            if (r0 != 0) goto L_0x0008
            super.onRestoreInstanceState(r2)
            return
        L_0x0008:
            androidx.recyclerview.widget.j$y r2 = (androidx.recyclerview.widget.C0813j.C0850y) r2
            r1.f3106d = r2
            androidx.recyclerview.widget.j$y r2 = r1.f3106d
            android.os.Parcelable r2 = r2.m3347a()
            super.onRestoreInstanceState(r2)
            androidx.recyclerview.widget.j$o r2 = r1.f3124m
            if (r2 == 0) goto L_0x0022
            androidx.recyclerview.widget.j$y r0 = r1.f3106d
            android.os.Parcelable r0 = r0.f3254d
            if (r0 == 0) goto L_0x0022
            r2.mo773a(r0)
        L_0x0022:
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            androidx.recyclerview.widget.j$y r0 = new androidx.recyclerview.widget.j$y
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            androidx.recyclerview.widget.j$y r1 = r2.f3106d
            if (r1 == 0) goto L_0x0011
            r0.m589a(r1)
            goto L_0x001d
        L_0x0011:
            androidx.recyclerview.widget.j$o r1 = r2.f3124m
            if (r1 == 0) goto L_0x001a
            android.os.Parcelable r1 = r1.mo658x()
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            r0.f3254d = r1
        L_0x001d:
            return r0
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            if (r1 != r3) goto L_0x0007
            if (r2 == r4) goto L_0x000a
        L_0x0007:
            r0.m923l()
        L_0x000a:
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r15) {
            r14 = this;
            boolean r0 = r14.f3146x
            r1 = 0
            if (r0 != 0) goto L_0x01c7
            boolean r0 = r14.f3148y
            if (r0 == 0) goto L_0x000b
            goto L_0x01c7
        L_0x000b:
            boolean r0 = r14.m995a(r15)
            r2 = 1
            if (r0 == 0) goto L_0x0016
            r14.m909y()
            return r2
        L_0x0016:
            androidx.recyclerview.widget.j$o r0 = r14.f3124m
            if (r0 != 0) goto L_0x001b
            return r1
        L_0x001b:
            boolean r0 = r0.mo788a()
            androidx.recyclerview.widget.j$o r3 = r14.f3124m
            boolean r3 = r3.mo732b()
            android.view.VelocityTracker r4 = r14.f3093P
            if (r4 != 0) goto L_0x002f
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r14.f3093P = r4
        L_0x002f:
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r15)
            int r5 = r15.getActionMasked()
            int r6 = r15.getActionIndex()
            if (r5 != 0) goto L_0x0043
            int[] r7 = r14.f3141u0
            r7[r2] = r1
            r7[r1] = r1
        L_0x0043:
            int[] r7 = r14.f3141u0
            r8 = r7[r1]
            float r8 = (float) r8
            r7 = r7[r2]
            float r7 = (float) r7
            r4.offsetLocation(r8, r7)
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r5 == 0) goto L_0x0196
            if (r5 == r2) goto L_0x0154
            r8 = 2
            if (r5 == r8) goto L_0x0088
            r0 = 3
            if (r5 == r0) goto L_0x0083
            r0 = 5
            if (r5 == r0) goto L_0x0067
            r0 = 6
            if (r5 == r0) goto L_0x0062
            goto L_0x01bc
        L_0x0062:
            r14.m957c(r15)
            goto L_0x01bc
        L_0x0067:
            int r0 = r15.getPointerId(r6)
            r14.f3092O = r0
            float r0 = r15.getX(r6)
            float r0 = r0 + r7
            int r0 = (int) r0
            r14.f3096S = r0
            r14.f3094Q = r0
            float r15 = r15.getY(r6)
            float r15 = r15 + r7
            int r15 = (int) r15
            r14.f3097T = r15
            r14.f3095R = r15
            goto L_0x01bc
        L_0x0083:
            r14.m909y()
            goto L_0x01bc
        L_0x0088:
            int r5 = r14.f3092O
            int r5 = r15.findPointerIndex(r5)
            if (r5 >= 0) goto L_0x00ae
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            r15.append(r0)
            int r0 = r14.f3092O
            r15.append(r0)
            java.lang.String r0 = " not found. Did any MotionEvents get skipped?"
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            java.lang.String r0 = "RecyclerView"
            android.util.Log.e(r0, r15)
            return r1
        L_0x00ae:
            float r6 = r15.getX(r5)
            float r6 = r6 + r7
            int r6 = (int) r6
            float r15 = r15.getY(r5)
            float r15 = r15 + r7
            int r15 = (int) r15
            int r5 = r14.f3096S
            int r5 = r5 - r6
            int r7 = r14.f3097T
            int r13 = r7 - r15
            int[] r10 = r14.f3139t0
            int[] r11 = r14.f3137s0
            r12 = 0
            r7 = r14
            r8 = r5
            r9 = r13
            boolean r7 = r7.m1002a(r8, r9, r10, r11, r12)
            if (r7 == 0) goto L_0x00f4
            int[] r7 = r14.f3139t0
            r8 = r7[r1]
            int r5 = r5 - r8
            r7 = r7[r2]
            int r13 = r13 - r7
            int[] r7 = r14.f3137s0
            r8 = r7[r1]
            float r8 = (float) r8
            r7 = r7[r2]
            float r7 = (float) r7
            r4.offsetLocation(r8, r7)
            int[] r7 = r14.f3141u0
            r8 = r7[r1]
            int[] r9 = r14.f3137s0
            r10 = r9[r1]
            int r8 = r8 + r10
            r7[r1] = r8
            r8 = r7[r2]
            r9 = r9[r2]
            int r8 = r8 + r9
            r7[r2] = r8
        L_0x00f4:
            int r7 = r14.f3091N
            if (r7 == r2) goto L_0x011f
            if (r0 == 0) goto L_0x0109
            int r7 = java.lang.Math.abs(r5)
            int r8 = r14.f3098U
            if (r7 <= r8) goto L_0x0109
            if (r5 <= 0) goto L_0x0106
            int r5 = r5 - r8
            goto L_0x0107
        L_0x0106:
            int r5 = r5 + r8
        L_0x0107:
            r7 = 1
            goto L_0x010a
        L_0x0109:
            r7 = 0
        L_0x010a:
            if (r3 == 0) goto L_0x011a
            int r8 = java.lang.Math.abs(r13)
            int r9 = r14.f3098U
            if (r8 <= r9) goto L_0x011a
            if (r13 <= 0) goto L_0x0118
            int r13 = r13 - r9
            goto L_0x0119
        L_0x0118:
            int r13 = r13 + r9
        L_0x0119:
            r7 = 1
        L_0x011a:
            if (r7 == 0) goto L_0x011f
            r14.setScrollState(r2)
        L_0x011f:
            int r7 = r14.f3091N
            if (r7 != r2) goto L_0x01bc
            int[] r7 = r14.f3137s0
            r8 = r7[r1]
            int r6 = r6 - r8
            r14.f3096S = r6
            r6 = r7[r2]
            int r15 = r15 - r6
            r14.f3097T = r15
            if (r0 == 0) goto L_0x0133
            r15 = r5
            goto L_0x0134
        L_0x0133:
            r15 = 0
        L_0x0134:
            if (r3 == 0) goto L_0x0138
            r0 = r13
            goto L_0x0139
        L_0x0138:
            r0 = 0
        L_0x0139:
            boolean r15 = r14.m1007a(r15, r0, r4)
            if (r15 == 0) goto L_0x0146
            android.view.ViewParent r15 = r14.getParent()
            r15.requestDisallowInterceptTouchEvent(r2)
        L_0x0146:
            androidx.recyclerview.widget.e r15 = r14.f3111f0
            if (r15 == 0) goto L_0x01bc
            if (r5 != 0) goto L_0x014e
            if (r13 == 0) goto L_0x01bc
        L_0x014e:
            androidx.recyclerview.widget.e r15 = r14.f3111f0
            r15.m1067a(r14, r5, r13)
            goto L_0x01bc
        L_0x0154:
            android.view.VelocityTracker r15 = r14.f3093P
            r15.addMovement(r4)
            android.view.VelocityTracker r15 = r14.f3093P
            r5 = 1000(0x3e8, float:1.401E-42)
            int r6 = r14.f3101a0
            float r6 = (float) r6
            r15.computeCurrentVelocity(r5, r6)
            r15 = 0
            if (r0 == 0) goto L_0x0170
            android.view.VelocityTracker r0 = r14.f3093P
            int r5 = r14.f3092O
            float r0 = r0.getXVelocity(r5)
            float r0 = -r0
            goto L_0x0171
        L_0x0170:
            r0 = 0
        L_0x0171:
            if (r3 == 0) goto L_0x017d
            android.view.VelocityTracker r3 = r14.f3093P
            int r5 = r14.f3092O
            float r3 = r3.getYVelocity(r5)
            float r3 = -r3
            goto L_0x017e
        L_0x017d:
            r3 = 0
        L_0x017e:
            int r5 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r5 != 0) goto L_0x0186
            int r15 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r15 == 0) goto L_0x018e
        L_0x0186:
            int r15 = (int) r0
            int r0 = (int) r3
            boolean r15 = r14.m946e(r15, r0)
            if (r15 != 0) goto L_0x0191
        L_0x018e:
            r14.setScrollState(r1)
        L_0x0191:
            r14.m1015M()
            r1 = 1
            goto L_0x01bc
        L_0x0196:
            int r5 = r15.getPointerId(r1)
            r14.f3092O = r5
            float r5 = r15.getX()
            float r5 = r5 + r7
            int r5 = (int) r5
            r14.f3096S = r5
            r14.f3094Q = r5
            float r15 = r15.getY()
            float r15 = r15 + r7
            int r15 = (int) r15
            r14.f3097T = r15
            r14.f3095R = r15
            if (r0 == 0) goto L_0x01b4
            r15 = 1
            goto L_0x01b5
        L_0x01b4:
            r15 = 0
        L_0x01b5:
            if (r3 == 0) goto L_0x01b9
            r15 = r15 | 2
        L_0x01b9:
            r14.m928j(r15, r1)
        L_0x01bc:
            if (r1 != 0) goto L_0x01c3
            android.view.VelocityTracker r15 = r14.f3093P
            r15.addMovement(r4)
        L_0x01c3:
            r4.recycle()
            return r2
        L_0x01c7:
            return r1
    }

    /* renamed from: p */
    void m918p() {
            r4 = this;
            androidx.recyclerview.widget.b r0 = r4.f3110f
            int r0 = r0.m1124b()
            r1 = 0
        L_0x0007:
            if (r1 >= r0) goto L_0x0022
            androidx.recyclerview.widget.b r2 = r4.f3110f
            android.view.View r2 = r2.m1118d(r1)
            androidx.recyclerview.widget.j$d0 r2 = m924k(r2)
            if (r2 == 0) goto L_0x001f
            boolean r3 = r2.m856x()
            if (r3 != 0) goto L_0x001f
            r3 = 6
            r2.m888a(r3)
        L_0x001f:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x0022:
            r4.m919o()
            androidx.recyclerview.widget.j$v r0 = r4.f3104c
            r0.m594h()
            return
    }

    /* renamed from: q */
    void m917q() {
            r1 = this;
            int r0 = r1.f3083F
            int r0 = r0 + 1
            r1.f3083F = r0
            return
    }

    /* renamed from: r */
    void m916r() {
            r1 = this;
            r0 = 1
            r1.m973a(r0)
            return
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(android.view.View r3, boolean r4) {
            r2 = this;
            androidx.recyclerview.widget.j$d0 r0 = m924k(r3)
            if (r0 == 0) goto L_0x0035
            boolean r1 = r0.m862r()
            if (r1 == 0) goto L_0x0010
            r0.m876d()
            goto L_0x0035
        L_0x0010:
            boolean r1 = r0.m856x()
            if (r1 == 0) goto L_0x0017
            goto L_0x0035
        L_0x0017:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Called removeDetachedView with a view which is not flagged as tmp detached."
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r2.m932i()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x0035:
            r3.clearAnimation()
            r2.m967b(r3)
            super.removeDetachedView(r3, r4)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View r3, android.view.View r4) {
            r2 = this;
            androidx.recyclerview.widget.j$o r0 = r2.f3124m
            androidx.recyclerview.widget.j$a0 r1 = r2.f3115h0
            boolean r0 = r0.m737a(r2, r1, r3, r4)
            if (r0 != 0) goto L_0x000f
            if (r4 == 0) goto L_0x000f
            r2.m992a(r3, r4)
        L_0x000f:
            super.requestChildFocus(r3, r4)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View r2, android.graphics.Rect r3, boolean r4) {
            r1 = this;
            androidx.recyclerview.widget.j$o r0 = r1.f3124m
            boolean r2 = r0.m740a(r1, r2, r3, r4)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean r4) {
            r3 = this;
            java.util.ArrayList<androidx.recyclerview.widget.j$s> r0 = r3.f3130p
            int r0 = r0.size()
            r1 = 0
        L_0x0007:
            if (r1 >= r0) goto L_0x0017
            java.util.ArrayList<androidx.recyclerview.widget.j$s> r2 = r3.f3130p
            java.lang.Object r2 = r2.get(r1)
            androidx.recyclerview.widget.j$s r2 = (androidx.recyclerview.widget.C0813j.AbstractC0843s) r2
            r2.mo646a(r4)
            int r1 = r1 + 1
            goto L_0x0007
        L_0x0017:
            super.requestDisallowInterceptTouchEvent(r4)
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
            r1 = this;
            int r0 = r1.f3142v
            if (r0 != 0) goto L_0x000c
            boolean r0 = r1.f3146x
            if (r0 != 0) goto L_0x000c
            super.requestLayout()
            goto L_0x000f
        L_0x000c:
            r0 = 1
            r1.f3144w = r0
        L_0x000f:
            return
    }

    /* renamed from: s */
    void m915s() {
            r1 = this;
            boolean r0 = r1.f3127n0
            if (r0 != 0) goto L_0x0010
            boolean r0 = r1.f3134r
            if (r0 == 0) goto L_0x0010
            java.lang.Runnable r0 = r1.f3147x0
            p000a.p018g.p029l.C0216r.m3432a(r1, r0)
            r0 = 1
            r1.f3127n0 = r0
        L_0x0010:
            return
    }

    @Override // android.view.View
    public void scrollBy(int r4, int r5) {
            r3 = this;
            androidx.recyclerview.widget.j$o r0 = r3.f3124m
            if (r0 != 0) goto L_0x000c
            java.lang.String r4 = "RecyclerView"
            java.lang.String r5 = "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r4, r5)
            return
        L_0x000c:
            boolean r1 = r3.f3146x
            if (r1 == 0) goto L_0x0011
            return
        L_0x0011:
            boolean r0 = r0.mo788a()
            androidx.recyclerview.widget.j$o r1 = r3.f3124m
            boolean r1 = r1.mo732b()
            if (r0 != 0) goto L_0x001f
            if (r1 == 0) goto L_0x002c
        L_0x001f:
            r2 = 0
            if (r0 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r4 = 0
        L_0x0024:
            if (r1 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r5 = 0
        L_0x0028:
            r0 = 0
            r3.m1007a(r4, r5, r0)
        L_0x002c:
            return
    }

    @Override // android.view.View
    public void scrollTo(int r1, int r2) {
            r0 = this;
            java.lang.String r1 = "RecyclerView"
            java.lang.String r2 = "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead"
            android.util.Log.w(r1, r2)
            return
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            boolean r0 = r1.m990a(r2)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            super.sendAccessibilityEventUnchecked(r2)
            return
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.C0854k r1) {
            r0 = this;
            r0.f3129o0 = r1
            androidx.recyclerview.widget.k r1 = r0.f3129o0
            p000a.p018g.p029l.C0216r.m3440a(r0, r1)
            return
    }

    public void setAdapter(androidx.recyclerview.widget.C0813j.AbstractC0824g r3) {
            r2 = this;
            r0 = 0
            r2.setLayoutFrozen(r0)
            r1 = 1
            r2.m983a(r3, r0, r1)
            r2.m961b(r0)
            r2.requestLayout()
            return
    }

    public void setChildDrawingOrderCallback(androidx.recyclerview.widget.C0813j.AbstractC0827j r2) {
            r1 = this;
            androidx.recyclerview.widget.j$j r0 = r1.f3131p0
            if (r2 != r0) goto L_0x0005
            return
        L_0x0005:
            r1.f3131p0 = r2
            androidx.recyclerview.widget.j$j r2 = r1.f3131p0
            if (r2 == 0) goto L_0x000d
            r2 = 1
            goto L_0x000e
        L_0x000d:
            r2 = 0
        L_0x000e:
            r1.setChildrenDrawingOrderEnabled(r2)
            return
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean r2) {
            r1 = this;
            boolean r0 = r1.f3114h
            if (r2 == r0) goto L_0x0007
            r1.m923l()
        L_0x0007:
            r1.f3114h = r2
            super.setClipToPadding(r2)
            boolean r2 = r1.f3140u
            if (r2 == 0) goto L_0x0013
            r1.requestLayout()
        L_0x0013:
            return
    }

    public void setEdgeEffectFactory(androidx.recyclerview.widget.C0813j.C0828k r1) {
            r0 = this;
            p000a.p018g.p028k.C0184g.m3556a(r1)
            r0.f3085H = r1
            r0.m923l()
            return
    }

    public void setHasFixedSize(boolean r1) {
            r0 = this;
            r0.f3136s = r1
            return
    }

    public void setItemAnimator(androidx.recyclerview.widget.C0813j.AbstractC0829l r3) {
            r2 = this;
            androidx.recyclerview.widget.j$l r0 = r2.f3090M
            if (r0 == 0) goto L_0x000d
            r0.mo813b()
            androidx.recyclerview.widget.j$l r0 = r2.f3090M
            r1 = 0
            r0.m814a(r1)
        L_0x000d:
            r2.f3090M = r3
            androidx.recyclerview.widget.j$l r3 = r2.f3090M
            if (r3 == 0) goto L_0x0018
            androidx.recyclerview.widget.j$l$b r0 = r2.f3125m0
            r3.m814a(r0)
        L_0x0018:
            return
    }

    public void setItemViewCacheSize(int r2) {
            r1 = this;
            androidx.recyclerview.widget.j$v r0 = r1.f3104c
            r0.m597f(r2)
            return
    }

    public void setLayoutFrozen(boolean r10) {
            r9 = this;
            boolean r0 = r9.f3146x
            if (r10 == r0) goto L_0x0038
            java.lang.String r0 = "Do not setLayoutFrozen in layout or scroll"
            r9.m974a(r0)
            if (r10 != 0) goto L_0x0020
            r10 = 0
            r9.f3146x = r10
            boolean r0 = r9.f3144w
            if (r0 == 0) goto L_0x001d
            androidx.recyclerview.widget.j$o r0 = r9.f3124m
            if (r0 == 0) goto L_0x001d
            androidx.recyclerview.widget.j$g r0 = r9.f3122l
            if (r0 == 0) goto L_0x001d
            r9.requestLayout()
        L_0x001d:
            r9.f3144w = r10
            goto L_0x0038
        L_0x0020:
            long r3 = android.os.SystemClock.uptimeMillis()
            r5 = 3
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r3
            android.view.MotionEvent r10 = android.view.MotionEvent.obtain(r1, r3, r5, r6, r7, r8)
            r9.onTouchEvent(r10)
            r10 = 1
            r9.f3146x = r10
            r9.f3148y = r10
            r9.m910x()
        L_0x0038:
            return
    }

    public void setLayoutManager(androidx.recyclerview.widget.C0813j.AbstractC0835o r4) {
            r3 = this;
            androidx.recyclerview.widget.j$o r0 = r3.f3124m
            if (r4 != r0) goto L_0x0005
            return
        L_0x0005:
            r3.m910x()
            androidx.recyclerview.widget.j$o r0 = r3.f3124m
            if (r0 == 0) goto L_0x003a
            androidx.recyclerview.widget.j$l r0 = r3.f3090M
            if (r0 == 0) goto L_0x0013
            r0.mo813b()
        L_0x0013:
            androidx.recyclerview.widget.j$o r0 = r3.f3124m
            androidx.recyclerview.widget.j$v r1 = r3.f3104c
            r0.m722b(r1)
            androidx.recyclerview.widget.j$o r0 = r3.f3124m
            androidx.recyclerview.widget.j$v r1 = r3.f3104c
            r0.m710c(r1)
            androidx.recyclerview.widget.j$v r0 = r3.f3104c
            r0.m630a()
            boolean r0 = r3.f3134r
            if (r0 == 0) goto L_0x0031
            androidx.recyclerview.widget.j$o r0 = r3.f3124m
            androidx.recyclerview.widget.j$v r1 = r3.f3104c
            r0.m736a(r3, r1)
        L_0x0031:
            androidx.recyclerview.widget.j$o r0 = r3.f3124m
            r1 = 0
            r0.m687f(r1)
            r3.f3124m = r1
            goto L_0x003f
        L_0x003a:
            androidx.recyclerview.widget.j$v r0 = r3.f3104c
            r0.m630a()
        L_0x003f:
            androidx.recyclerview.widget.b r0 = r3.f3110f
            r0.m1121c()
            r3.f3124m = r4
            if (r4 == 0) goto L_0x0080
            androidx.recyclerview.widget.j r0 = r4.f3211b
            if (r0 != 0) goto L_0x005b
            androidx.recyclerview.widget.j$o r4 = r3.f3124m
            r4.m687f(r3)
            boolean r4 = r3.f3134r
            if (r4 == 0) goto L_0x0080
            androidx.recyclerview.widget.j$o r4 = r3.f3124m
            r4.m744a(r3)
            goto L_0x0080
        L_0x005b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "LayoutManager "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " is already attached to a RecyclerView:"
            r1.append(r2)
            androidx.recyclerview.widget.j r4 = r4.f3211b
            java.lang.String r4 = r4.m932i()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x0080:
            androidx.recyclerview.widget.j$v r4 = r3.f3104c
            r4.m592j()
            r3.requestLayout()
            return
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean r2) {
            r1 = this;
            a.g.l.k r0 = r1.getScrollingChildHelper()
            r0.m3460a(r2)
            return
    }

    public void setOnFlingListener(androidx.recyclerview.widget.C0813j.AbstractC0842r r1) {
            r0 = this;
            r0.f3099V = r1
            return
    }

    @java.lang.Deprecated
    public void setOnScrollListener(androidx.recyclerview.widget.C0813j.AbstractC0844t r1) {
            r0 = this;
            r0.f3117i0 = r1
            return
    }

    public void setPreserveFocusAfterLayout(boolean r1) {
            r0 = this;
            r0.f3107d0 = r1
            return
    }

    public void setRecycledViewPool(androidx.recyclerview.widget.C0813j.C0845u r2) {
            r1 = this;
            androidx.recyclerview.widget.j$v r0 = r1.f3104c
            r0.m616a(r2)
            return
    }

    public void setRecyclerListener(androidx.recyclerview.widget.C0813j.AbstractC0848w r1) {
            r0 = this;
            r0.f3126n = r1
            return
    }

    void setScrollState(int r2) {
            r1 = this;
            int r0 = r1.f3091N
            if (r2 != r0) goto L_0x0005
            return
        L_0x0005:
            r1.f3091N = r2
            r0 = 2
            if (r2 == r0) goto L_0x000d
            r1.m1013O()
        L_0x000d:
            r1.m970b(r2)
            return
    }

    public void setScrollingTouchSlop(int r4) {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            if (r4 == 0) goto L_0x002e
            r1 = 1
            if (r4 == r1) goto L_0x0029
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "setScrollingTouchSlop(): bad argument constant "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "; using default value"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.w(r1, r4)
            goto L_0x002e
        L_0x0029:
            int r4 = r0.getScaledPagingTouchSlop()
            goto L_0x0032
        L_0x002e:
            int r4 = r0.getScaledTouchSlop()
        L_0x0032:
            r3.f3098U = r4
            return
    }

    public void setViewCacheExtension(androidx.recyclerview.widget.C0813j.AbstractC0817b0 r2) {
            r1 = this;
            androidx.recyclerview.widget.j$v r0 = r1.f3104c
            r0.m621a(r2)
            return
    }

    @Override // android.view.View
    public boolean startNestedScroll(int r2) {
            r1 = this;
            a.g.l.k r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.m3458b(r2)
            return r2
    }

    @Override // android.view.View, p000a.p018g.p029l.AbstractC0208j
    public void stopNestedScroll() {
            r1 = this;
            a.g.l.k r0 = r1.getScrollingChildHelper()
            r0.m3457c()
            return
    }

    /* renamed from: t */
    void m914t() {
            r2 = this;
            androidx.recyclerview.widget.j$l r0 = r2.f3090M
            if (r0 == 0) goto L_0x0007
            r0.mo813b()
        L_0x0007:
            androidx.recyclerview.widget.j$o r0 = r2.f3124m
            if (r0 == 0) goto L_0x0017
            androidx.recyclerview.widget.j$v r1 = r2.f3104c
            r0.m722b(r1)
            androidx.recyclerview.widget.j$o r0 = r2.f3124m
            androidx.recyclerview.widget.j$v r1 = r2.f3104c
            r0.m710c(r1)
        L_0x0017:
            androidx.recyclerview.widget.j$v r0 = r2.f3104c
            r0.m630a()
            return
    }

    /* renamed from: u */
    void m913u() {
            r7 = this;
            androidx.recyclerview.widget.b r0 = r7.f3110f
            int r0 = r0.m1130a()
            r1 = 0
        L_0x0007:
            if (r1 >= r0) goto L_0x003f
            androidx.recyclerview.widget.b r2 = r7.f3110f
            android.view.View r2 = r2.m1120c(r1)
            androidx.recyclerview.widget.j$d0 r3 = r7.m945e(r2)
            if (r3 == 0) goto L_0x003c
            androidx.recyclerview.widget.j$d0 r3 = r3.f3187i
            if (r3 == 0) goto L_0x003c
            android.view.View r3 = r3.f3179a
            int r4 = r2.getLeft()
            int r2 = r2.getTop()
            int r5 = r3.getLeft()
            if (r4 != r5) goto L_0x002f
            int r5 = r3.getTop()
            if (r2 == r5) goto L_0x003c
        L_0x002f:
            int r5 = r3.getWidth()
            int r5 = r5 + r4
            int r6 = r3.getHeight()
            int r6 = r6 + r2
            r3.layout(r4, r2, r5, r6)
        L_0x003c:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x003f:
            return
    }

    /* renamed from: v */
    void m912v() {
            r4 = this;
            androidx.recyclerview.widget.b r0 = r4.f3110f
            int r0 = r0.m1124b()
            r1 = 0
        L_0x0007:
            if (r1 >= r0) goto L_0x001f
            androidx.recyclerview.widget.b r2 = r4.f3110f
            android.view.View r2 = r2.m1118d(r1)
            androidx.recyclerview.widget.j$d0 r2 = m924k(r2)
            boolean r3 = r2.m856x()
            if (r3 != 0) goto L_0x001c
            r2.m858v()
        L_0x001c:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x001f:
            return
    }

    /* renamed from: w */
    void m911w() {
            r2 = this;
            int r0 = r2.f3142v
            r1 = 1
            int r0 = r0 + r1
            r2.f3142v = r0
            int r0 = r2.f3142v
            if (r0 != r1) goto L_0x0011
            boolean r0 = r2.f3146x
            if (r0 != 0) goto L_0x0011
            r0 = 0
            r2.f3144w = r0
        L_0x0011:
            return
    }

    /* renamed from: x */
    public void m910x() {
            r1 = this;
            r0 = 0
            r1.setScrollState(r0)
            r1.m1013O()
            return
    }
}
