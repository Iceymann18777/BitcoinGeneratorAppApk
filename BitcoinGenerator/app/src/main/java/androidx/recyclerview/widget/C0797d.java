package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.d */
/* loaded from: classes.dex */
class C0797d extends androidx.recyclerview.widget.C0813j.AbstractC0834n implements androidx.recyclerview.widget.C0813j.AbstractC0843s {

    /* renamed from: D */
    private static final int[] f3005D = null;

    /* renamed from: E */
    private static final int[] f3006E = null;

    /* renamed from: A */
    int f3007A;

    /* renamed from: B */
    private final java.lang.Runnable f3008B;

    /* renamed from: C */
    private final androidx.recyclerview.widget.C0813j.AbstractC0844t f3009C;

    /* renamed from: a */
    private final int f3010a;

    /* renamed from: b */
    private final int f3011b;

    /* renamed from: c */
    final android.graphics.drawable.StateListDrawable f3012c;

    /* renamed from: d */
    final android.graphics.drawable.Drawable f3013d;

    /* renamed from: e */
    private final int f3014e;

    /* renamed from: f */
    private final int f3015f;

    /* renamed from: g */
    private final android.graphics.drawable.StateListDrawable f3016g;

    /* renamed from: h */
    private final android.graphics.drawable.Drawable f3017h;

    /* renamed from: i */
    private final int f3018i;

    /* renamed from: j */
    private final int f3019j;

    /* renamed from: k */
    int f3020k;

    /* renamed from: l */
    int f3021l;

    /* renamed from: m */
    float f3022m;

    /* renamed from: n */
    int f3023n;

    /* renamed from: o */
    int f3024o;

    /* renamed from: p */
    float f3025p;

    /* renamed from: q */
    private int f3026q;

    /* renamed from: r */
    private int f3027r;

    /* renamed from: s */
    private androidx.recyclerview.widget.C0813j f3028s;

    /* renamed from: t */
    private boolean f3029t;

    /* renamed from: u */
    private boolean f3030u;

    /* renamed from: v */
    private int f3031v;

    /* renamed from: w */
    private int f3032w;

    /* renamed from: x */
    private final int[] f3033x;

    /* renamed from: y */
    private final int[] f3034y;

    /* renamed from: z */
    final android.animation.ValueAnimator f3035z;

    /* renamed from: androidx.recyclerview.widget.d$a */
    /* loaded from: classes.dex */
    class RunnableC0798a implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ androidx.recyclerview.widget.C0797d f3036b;

        RunnableC0798a(androidx.recyclerview.widget.C0797d r1) {
                r0 = this;
                r0.f3036b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.recyclerview.widget.d r0 = r2.f3036b
                r1 = 500(0x1f4, float:7.0E-43)
                r0.m1088a(r1)
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    /* loaded from: classes.dex */
    class C0799b extends androidx.recyclerview.widget.C0813j.AbstractC0844t {

        /* renamed from: a */
        final /* synthetic */ androidx.recyclerview.widget.C0797d f3037a;

        C0799b(androidx.recyclerview.widget.C0797d r1) {
                r0 = this;
                r0.f3037a = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.C0813j.AbstractC0844t
        /* renamed from: a */
        public void mo643a(androidx.recyclerview.widget.C0813j r1, int r2, int r3) {
                r0 = this;
                androidx.recyclerview.widget.d r2 = r0.f3037a
                int r3 = r1.computeHorizontalScrollOffset()
                int r1 = r1.computeVerticalScrollOffset()
                r2.m1087a(r3, r1)
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    /* loaded from: classes.dex */
    private class C0800c extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f3038a;

        /* renamed from: b */
        final /* synthetic */ androidx.recyclerview.widget.C0797d f3039b;

        C0800c(androidx.recyclerview.widget.C0797d r1) {
                r0 = this;
                r0.f3039b = r1
                r0.<init>()
                r1 = 0
                r0.f3038a = r1
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r1) {
                r0 = this;
                r1 = 1
                r0.f3038a = r1
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r3) {
                r2 = this;
                boolean r3 = r2.f3038a
                r0 = 0
                if (r3 == 0) goto L_0x0008
                r2.f3038a = r0
                return
            L_0x0008:
                androidx.recyclerview.widget.d r3 = r2.f3039b
                android.animation.ValueAnimator r3 = r3.f3035z
                java.lang.Object r3 = r3.getAnimatedValue()
                java.lang.Float r3 = (java.lang.Float) r3
                float r3 = r3.floatValue()
                r1 = 0
                int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r3 != 0) goto L_0x0023
                androidx.recyclerview.widget.d r3 = r2.f3039b
                r3.f3007A = r0
                r3.m1081b(r0)
                goto L_0x002b
            L_0x0023:
                androidx.recyclerview.widget.d r3 = r2.f3039b
                r0 = 2
                r3.f3007A = r0
                r3.m1092a()
            L_0x002b:
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d */
    /* loaded from: classes.dex */
    private class C0801d implements android.animation.ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ androidx.recyclerview.widget.C0797d f3040a;

        C0801d(androidx.recyclerview.widget.C0797d r1) {
                r0 = this;
                r0.f3040a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r2) {
                r1 = this;
                java.lang.Object r2 = r2.getAnimatedValue()
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                r0 = 1132396544(0x437f0000, float:255.0)
                float r2 = r2 * r0
                int r2 = (int) r2
                androidx.recyclerview.widget.d r0 = r1.f3040a
                android.graphics.drawable.StateListDrawable r0 = r0.f3012c
                r0.setAlpha(r2)
                androidx.recyclerview.widget.d r0 = r1.f3040a
                android.graphics.drawable.Drawable r0 = r0.f3013d
                r0.setAlpha(r2)
                androidx.recyclerview.widget.d r2 = r1.f3040a
                r2.m1092a()
                return
        }
    }

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16842919(0x10100a7, float:2.3694026E-38)
            r0[r1] = r2
            androidx.recyclerview.widget.C0797d.f3005D = r0
            int[] r0 = new int[r1]
            androidx.recyclerview.widget.C0797d.f3006E = r0
            return
    }

    C0797d(androidx.recyclerview.widget.C0813j r4, android.graphics.drawable.StateListDrawable r5, android.graphics.drawable.Drawable r6, android.graphics.drawable.StateListDrawable r7, android.graphics.drawable.Drawable r8, int r9, int r10, int r11) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f3026q = r0
            r3.f3027r = r0
            r3.f3029t = r0
            r3.f3030u = r0
            r3.f3031v = r0
            r3.f3032w = r0
            r1 = 2
            int[] r2 = new int[r1]
            r3.f3033x = r2
            int[] r2 = new int[r1]
            r3.f3034y = r2
            float[] r1 = new float[r1]
            r1 = {x008c: FILL_ARRAY_DATA  , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            r3.f3035z = r1
            r3.f3007A = r0
            androidx.recyclerview.widget.d$a r0 = new androidx.recyclerview.widget.d$a
            r0.<init>(r3)
            r3.f3008B = r0
            androidx.recyclerview.widget.d$b r0 = new androidx.recyclerview.widget.d$b
            r0.<init>(r3)
            r3.f3009C = r0
            r3.f3012c = r5
            r3.f3013d = r6
            r3.f3016g = r7
            r3.f3017h = r8
            int r5 = r5.getIntrinsicWidth()
            int r5 = java.lang.Math.max(r9, r5)
            r3.f3014e = r5
            int r5 = r6.getIntrinsicWidth()
            int r5 = java.lang.Math.max(r9, r5)
            r3.f3015f = r5
            int r5 = r7.getIntrinsicWidth()
            int r5 = java.lang.Math.max(r9, r5)
            r3.f3018i = r5
            int r5 = r8.getIntrinsicWidth()
            int r5 = java.lang.Math.max(r9, r5)
            r3.f3019j = r5
            r3.f3010a = r10
            r3.f3011b = r11
            android.graphics.drawable.StateListDrawable r5 = r3.f3012c
            r6 = 255(0xff, float:3.57E-43)
            r5.setAlpha(r6)
            android.graphics.drawable.Drawable r5 = r3.f3013d
            r5.setAlpha(r6)
            android.animation.ValueAnimator r5 = r3.f3035z
            androidx.recyclerview.widget.d$c r6 = new androidx.recyclerview.widget.d$c
            r6.<init>(r3)
            r5.addListener(r6)
            android.animation.ValueAnimator r5 = r3.f3035z
            androidx.recyclerview.widget.d$d r6 = new androidx.recyclerview.widget.d$d
            r6.<init>(r3)
            r5.addUpdateListener(r6)
            r3.m1085a(r4)
            return
    }

    /* renamed from: a */
    private int m1089a(float r3, float r4, int[] r5, int r6, int r7, int r8) {
            r2 = this;
            r0 = 1
            r0 = r5[r0]
            r1 = 0
            r5 = r5[r1]
            int r0 = r0 - r5
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            float r4 = r4 - r3
            float r3 = (float) r0
            float r4 = r4 / r3
            int r6 = r6 - r8
            float r3 = (float) r6
            float r4 = r4 * r3
            int r3 = (int) r4
            int r7 = r7 + r3
            if (r7 >= r6) goto L_0x0018
            if (r7 < 0) goto L_0x0018
            return r3
        L_0x0018:
            return r1
    }

    /* renamed from: a */
    private void m1091a(float r9) {
            r8 = this;
            int[] r3 = r8.m1076e()
            r7 = 0
            r0 = r3[r7]
            float r0 = (float) r0
            r1 = 1
            r1 = r3[r1]
            float r1 = (float) r1
            float r9 = java.lang.Math.min(r1, r9)
            float r9 = java.lang.Math.max(r0, r9)
            int r0 = r8.f3024o
            float r0 = (float) r0
            float r0 = r0 - r9
            float r0 = java.lang.Math.abs(r0)
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0023
            return
        L_0x0023:
            float r1 = r8.f3025p
            androidx.recyclerview.widget.j r0 = r8.f3028s
            int r4 = r0.computeHorizontalScrollRange()
            androidx.recyclerview.widget.j r0 = r8.f3028s
            int r5 = r0.computeHorizontalScrollOffset()
            int r6 = r8.f3026q
            r0 = r8
            r2 = r9
            int r0 = r0.m1089a(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0040
            androidx.recyclerview.widget.j r1 = r8.f3028s
            r1.scrollBy(r0, r7)
        L_0x0040:
            r8.f3025p = r9
            return
    }

    /* renamed from: a */
    private void m1086a(android.graphics.Canvas r7) {
            r6 = this;
            int r0 = r6.f3027r
            int r1 = r6.f3018i
            int r0 = r0 - r1
            int r2 = r6.f3024o
            int r3 = r6.f3023n
            int r4 = r3 / 2
            int r2 = r2 - r4
            android.graphics.drawable.StateListDrawable r4 = r6.f3016g
            r5 = 0
            r4.setBounds(r5, r5, r3, r1)
            android.graphics.drawable.Drawable r1 = r6.f3017h
            int r3 = r6.f3026q
            int r4 = r6.f3019j
            r1.setBounds(r5, r5, r3, r4)
            float r1 = (float) r0
            r3 = 0
            r7.translate(r3, r1)
            android.graphics.drawable.Drawable r1 = r6.f3017h
            r1.draw(r7)
            float r1 = (float) r2
            r7.translate(r1, r3)
            android.graphics.drawable.StateListDrawable r1 = r6.f3016g
            r1.draw(r7)
            int r1 = -r2
            float r1 = (float) r1
            int r0 = -r0
            float r0 = (float) r0
            r7.translate(r1, r0)
            return
    }

    /* renamed from: b */
    private void m1083b(float r9) {
            r8 = this;
            int[] r3 = r8.m1075f()
            r7 = 0
            r0 = r3[r7]
            float r0 = (float) r0
            r1 = 1
            r1 = r3[r1]
            float r1 = (float) r1
            float r9 = java.lang.Math.min(r1, r9)
            float r9 = java.lang.Math.max(r0, r9)
            int r0 = r8.f3021l
            float r0 = (float) r0
            float r0 = r0 - r9
            float r0 = java.lang.Math.abs(r0)
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0023
            return
        L_0x0023:
            float r1 = r8.f3022m
            androidx.recyclerview.widget.j r0 = r8.f3028s
            int r4 = r0.computeVerticalScrollRange()
            androidx.recyclerview.widget.j r0 = r8.f3028s
            int r5 = r0.computeVerticalScrollOffset()
            int r6 = r8.f3027r
            r0 = r8
            r2 = r9
            int r0 = r0.m1089a(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0040
            androidx.recyclerview.widget.j r1 = r8.f3028s
            r1.scrollBy(r7, r0)
        L_0x0040:
            r8.f3022m = r9
            return
    }

    /* renamed from: b */
    private void m1080b(android.graphics.Canvas r7) {
            r6 = this;
            int r0 = r6.f3026q
            int r1 = r6.f3014e
            int r0 = r0 - r1
            int r2 = r6.f3021l
            int r3 = r6.f3020k
            int r4 = r3 / 2
            int r2 = r2 - r4
            android.graphics.drawable.StateListDrawable r4 = r6.f3012c
            r5 = 0
            r4.setBounds(r5, r5, r1, r3)
            android.graphics.drawable.Drawable r1 = r6.f3013d
            int r3 = r6.f3015f
            int r4 = r6.f3027r
            r1.setBounds(r5, r5, r3, r4)
            boolean r1 = r6.m1074g()
            if (r1 == 0) goto L_0x003f
            android.graphics.drawable.Drawable r0 = r6.f3013d
            r0.draw(r7)
            int r0 = r6.f3014e
            float r0 = (float) r0
            float r1 = (float) r2
            r7.translate(r0, r1)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            r7.scale(r0, r1)
            android.graphics.drawable.StateListDrawable r0 = r6.f3012c
            r0.draw(r7)
            r7.scale(r1, r1)
            int r0 = r6.f3014e
            goto L_0x0052
        L_0x003f:
            float r1 = (float) r0
            r3 = 0
            r7.translate(r1, r3)
            android.graphics.drawable.Drawable r1 = r6.f3013d
            r1.draw(r7)
            float r1 = (float) r2
            r7.translate(r3, r1)
            android.graphics.drawable.StateListDrawable r1 = r6.f3012c
            r1.draw(r7)
        L_0x0052:
            int r0 = -r0
            float r0 = (float) r0
            int r1 = -r2
            float r1 = (float) r1
            r7.translate(r0, r1)
            return
    }

    /* renamed from: c */
    private void m1079c() {
            r2 = this;
            androidx.recyclerview.widget.j r0 = r2.f3028s
            java.lang.Runnable r1 = r2.f3008B
            r0.removeCallbacks(r1)
            return
    }

    /* renamed from: c */
    private void m1078c(int r5) {
            r4 = this;
            r4.m1079c()
            androidx.recyclerview.widget.j r0 = r4.f3028s
            java.lang.Runnable r1 = r4.f3008B
            long r2 = (long) r5
            r0.postDelayed(r1, r2)
            return
    }

    /* renamed from: d */
    private void m1077d() {
            r2 = this;
            androidx.recyclerview.widget.j r0 = r2.f3028s
            r0.m964b(r2)
            androidx.recyclerview.widget.j r0 = r2.f3028s
            r0.m963b(r2)
            androidx.recyclerview.widget.j r0 = r2.f3028s
            androidx.recyclerview.widget.j$t r1 = r2.f3009C
            r0.m962b(r1)
            r2.m1079c()
            return
    }

    /* renamed from: e */
    private int[] m1076e() {
            r3 = this;
            int[] r0 = r3.f3034y
            int r1 = r3.f3011b
            r2 = 0
            r0[r2] = r1
            int r2 = r3.f3026q
            int r2 = r2 - r1
            r1 = 1
            r0[r1] = r2
            return r0
    }

    /* renamed from: f */
    private int[] m1075f() {
            r3 = this;
            int[] r0 = r3.f3033x
            int r1 = r3.f3011b
            r2 = 0
            r0[r2] = r1
            int r2 = r3.f3027r
            int r2 = r2 - r1
            r1 = 1
            r0[r1] = r2
            return r0
    }

    /* renamed from: g */
    private boolean m1074g() {
            r2 = this;
            androidx.recyclerview.widget.j r0 = r2.f3028s
            int r0 = p000a.p018g.p029l.C0216r.m3411j(r0)
            r1 = 1
            if (r0 != r1) goto L_0x000a
            goto L_0x000b
        L_0x000a:
            r1 = 0
        L_0x000b:
            return r1
    }

    /* renamed from: h */
    private void m1073h() {
            r2 = this;
            androidx.recyclerview.widget.j r0 = r2.f3028s
            r0.m982a(r2)
            androidx.recyclerview.widget.j r0 = r2.f3028s
            r0.m980a(r2)
            androidx.recyclerview.widget.j r0 = r2.f3028s
            androidx.recyclerview.widget.j$t r1 = r2.f3009C
            r0.m979a(r1)
            return
    }

    /* renamed from: a */
    void m1092a() {
            r1 = this;
            androidx.recyclerview.widget.j r0 = r1.f3028s
            r0.invalidate()
            return
    }

    /* renamed from: a */
    void m1088a(int r6) {
            r5 = this;
            int r0 = r5.f3007A
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L_0x0009
            if (r0 == r1) goto L_0x000e
            goto L_0x0033
        L_0x0009:
            android.animation.ValueAnimator r0 = r5.f3035z
            r0.cancel()
        L_0x000e:
            r0 = 3
            r5.f3007A = r0
            android.animation.ValueAnimator r0 = r5.f3035z
            float[] r1 = new float[r1]
            r3 = 0
            java.lang.Object r4 = r0.getAnimatedValue()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r1[r3] = r4
            r3 = 0
            r1[r2] = r3
            r0.setFloatValues(r1)
            android.animation.ValueAnimator r0 = r5.f3035z
            long r1 = (long) r6
            r0.setDuration(r1)
            android.animation.ValueAnimator r6 = r5.f3035z
            r6.start()
        L_0x0033:
            return
    }

    /* renamed from: a */
    void m1087a(int r9, int r10) {
            r8 = this;
            androidx.recyclerview.widget.j r0 = r8.f3028s
            int r0 = r0.computeVerticalScrollRange()
            int r1 = r8.f3027r
            int r2 = r0 - r1
            r3 = 0
            r4 = 1
            if (r2 <= 0) goto L_0x0014
            int r2 = r8.f3010a
            if (r1 < r2) goto L_0x0014
            r2 = 1
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            r8.f3029t = r2
            androidx.recyclerview.widget.j r2 = r8.f3028s
            int r2 = r2.computeHorizontalScrollRange()
            int r5 = r8.f3026q
            int r6 = r2 - r5
            if (r6 <= 0) goto L_0x0029
            int r6 = r8.f3010a
            if (r5 < r6) goto L_0x0029
            r6 = 1
            goto L_0x002a
        L_0x0029:
            r6 = 0
        L_0x002a:
            r8.f3030u = r6
            boolean r6 = r8.f3029t
            if (r6 != 0) goto L_0x003c
            boolean r6 = r8.f3030u
            if (r6 != 0) goto L_0x003c
            int r9 = r8.f3031v
            if (r9 == 0) goto L_0x003b
            r8.m1081b(r3)
        L_0x003b:
            return
        L_0x003c:
            boolean r3 = r8.f3029t
            r6 = 1073741824(0x40000000, float:2.0)
            if (r3 == 0) goto L_0x0057
            float r10 = (float) r10
            float r3 = (float) r1
            float r7 = r3 / r6
            float r10 = r10 + r7
            float r3 = r3 * r10
            float r10 = (float) r0
            float r3 = r3 / r10
            int r10 = (int) r3
            r8.f3021l = r10
            int r10 = r1 * r1
            int r10 = r10 / r0
            int r10 = java.lang.Math.min(r1, r10)
            r8.f3020k = r10
        L_0x0057:
            boolean r10 = r8.f3030u
            if (r10 == 0) goto L_0x0070
            float r9 = (float) r9
            float r10 = (float) r5
            float r0 = r10 / r6
            float r9 = r9 + r0
            float r10 = r10 * r9
            float r9 = (float) r2
            float r10 = r10 / r9
            int r9 = (int) r10
            r8.f3024o = r9
            int r9 = r5 * r5
            int r9 = r9 / r2
            int r9 = java.lang.Math.min(r5, r9)
            r8.f3023n = r9
        L_0x0070:
            int r9 = r8.f3031v
            if (r9 == 0) goto L_0x0076
            if (r9 != r4) goto L_0x0079
        L_0x0076:
            r8.m1081b(r4)
        L_0x0079:
            return
    }

    /* renamed from: a */
    public void m1085a(androidx.recyclerview.widget.C0813j r2) {
            r1 = this;
            androidx.recyclerview.widget.j r0 = r1.f3028s
            if (r0 != r2) goto L_0x0005
            return
        L_0x0005:
            if (r0 == 0) goto L_0x000a
            r1.m1077d()
        L_0x000a:
            r1.f3028s = r2
            androidx.recyclerview.widget.j r2 = r1.f3028s
            if (r2 == 0) goto L_0x0013
            r1.m1073h()
        L_0x0013:
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0843s
    /* renamed from: a */
    public void mo646a(boolean r1) {
            r0 = this;
            return
    }

    /* renamed from: a */
    boolean m1090a(float r3, float r4) {
            r2 = this;
            int r0 = r2.f3027r
            int r1 = r2.f3018i
            int r0 = r0 - r1
            float r0 = (float) r0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 < 0) goto L_0x0021
            int r4 = r2.f3024o
            int r0 = r2.f3023n
            int r1 = r0 / 2
            int r1 = r4 - r1
            float r1 = (float) r1
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0021
            int r0 = r0 / 2
            int r4 = r4 + r0
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x0021
            r3 = 1
            goto L_0x0022
        L_0x0021:
            r3 = 0
        L_0x0022:
            return r3
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0843s
    /* renamed from: a */
    public boolean mo647a(androidx.recyclerview.widget.C0813j r6, android.view.MotionEvent r7) {
            r5 = this;
            int r6 = r5.f3031v
            r0 = 0
            r1 = 2
            r2 = 1
            if (r6 != r2) goto L_0x0046
            float r6 = r7.getX()
            float r3 = r7.getY()
            boolean r6 = r5.m1082b(r6, r3)
            float r3 = r7.getX()
            float r4 = r7.getY()
            boolean r3 = r5.m1090a(r3, r4)
            int r4 = r7.getAction()
            if (r4 != 0) goto L_0x0049
            if (r6 != 0) goto L_0x0029
            if (r3 == 0) goto L_0x0049
        L_0x0029:
            if (r3 == 0) goto L_0x0036
            r5.f3032w = r2
            float r6 = r7.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f3025p = r6
            goto L_0x0042
        L_0x0036:
            if (r6 == 0) goto L_0x0042
            r5.f3032w = r1
            float r6 = r7.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f3022m = r6
        L_0x0042:
            r5.m1081b(r1)
            goto L_0x0048
        L_0x0046:
            if (r6 != r1) goto L_0x0049
        L_0x0048:
            r0 = 1
        L_0x0049:
            return r0
    }

    /* renamed from: b */
    public void m1084b() {
            r5 = this;
            int r0 = r5.f3007A
            if (r0 == 0) goto L_0x000d
            r1 = 3
            if (r0 == r1) goto L_0x0008
            goto L_0x003c
        L_0x0008:
            android.animation.ValueAnimator r0 = r5.f3035z
            r0.cancel()
        L_0x000d:
            r0 = 1
            r5.f3007A = r0
            android.animation.ValueAnimator r1 = r5.f3035z
            r2 = 2
            float[] r2 = new float[r2]
            r3 = 0
            java.lang.Object r4 = r1.getAnimatedValue()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r2[r3] = r4
            r3 = 1065353216(0x3f800000, float:1.0)
            r2[r0] = r3
            r1.setFloatValues(r2)
            android.animation.ValueAnimator r0 = r5.f3035z
            r1 = 500(0x1f4, double:2.47E-321)
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r5.f3035z
            r1 = 0
            r0.setStartDelay(r1)
            android.animation.ValueAnimator r0 = r5.f3035z
            r0.start()
        L_0x003c:
            return
    }

    /* renamed from: b */
    void m1081b(int r4) {
            r3 = this;
            r0 = 2
            if (r4 != r0) goto L_0x0011
            int r1 = r3.f3031v
            if (r1 == r0) goto L_0x0011
            android.graphics.drawable.StateListDrawable r1 = r3.f3012c
            int[] r2 = androidx.recyclerview.widget.C0797d.f3005D
            r1.setState(r2)
            r3.m1079c()
        L_0x0011:
            if (r4 != 0) goto L_0x0017
            r3.m1092a()
            goto L_0x001a
        L_0x0017:
            r3.m1084b()
        L_0x001a:
            int r1 = r3.f3031v
            if (r1 != r0) goto L_0x002a
            if (r4 == r0) goto L_0x002a
            android.graphics.drawable.StateListDrawable r0 = r3.f3012c
            int[] r1 = androidx.recyclerview.widget.C0797d.f3006E
            r0.setState(r1)
            r0 = 1200(0x4b0, float:1.682E-42)
            goto L_0x002f
        L_0x002a:
            r0 = 1
            if (r4 != r0) goto L_0x0032
            r0 = 1500(0x5dc, float:2.102E-42)
        L_0x002f:
            r3.m1078c(r0)
        L_0x0032:
            r3.f3031v = r4
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0834n
    /* renamed from: b */
    public void mo792b(android.graphics.Canvas r1, androidx.recyclerview.widget.C0813j r2, androidx.recyclerview.widget.C0813j.C0815a0 r3) {
            r0 = this;
            int r2 = r0.f3026q
            androidx.recyclerview.widget.j r3 = r0.f3028s
            int r3 = r3.getWidth()
            if (r2 != r3) goto L_0x0028
            int r2 = r0.f3027r
            androidx.recyclerview.widget.j r3 = r0.f3028s
            int r3 = r3.getHeight()
            if (r2 == r3) goto L_0x0015
            goto L_0x0028
        L_0x0015:
            int r2 = r0.f3007A
            if (r2 == 0) goto L_0x0027
            boolean r2 = r0.f3029t
            if (r2 == 0) goto L_0x0020
            r0.m1080b(r1)
        L_0x0020:
            boolean r2 = r0.f3030u
            if (r2 == 0) goto L_0x0027
            r0.m1086a(r1)
        L_0x0027:
            return
        L_0x0028:
            androidx.recyclerview.widget.j r1 = r0.f3028s
            int r1 = r1.getWidth()
            r0.f3026q = r1
            androidx.recyclerview.widget.j r1 = r0.f3028s
            int r1 = r1.getHeight()
            r0.f3027r = r1
            r1 = 0
            r0.m1081b(r1)
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0843s
    /* renamed from: b */
    public void mo645b(androidx.recyclerview.widget.C0813j r5, android.view.MotionEvent r6) {
            r4 = this;
            int r5 = r4.f3031v
            if (r5 != 0) goto L_0x0005
            return
        L_0x0005:
            int r5 = r6.getAction()
            r0 = 1
            r1 = 2
            if (r5 != 0) goto L_0x0046
            float r5 = r6.getX()
            float r2 = r6.getY()
            boolean r5 = r4.m1082b(r5, r2)
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r2 = r4.m1090a(r2, r3)
            if (r5 != 0) goto L_0x0029
            if (r2 == 0) goto L_0x007f
        L_0x0029:
            if (r2 == 0) goto L_0x0036
            r4.f3032w = r0
            float r5 = r6.getX()
            int r5 = (int) r5
            float r5 = (float) r5
            r4.f3025p = r5
            goto L_0x0042
        L_0x0036:
            if (r5 == 0) goto L_0x0042
            r4.f3032w = r1
            float r5 = r6.getY()
            int r5 = (int) r5
            float r5 = (float) r5
            r4.f3022m = r5
        L_0x0042:
            r4.m1081b(r1)
            goto L_0x007f
        L_0x0046:
            int r5 = r6.getAction()
            if (r5 != r0) goto L_0x005c
            int r5 = r4.f3031v
            if (r5 != r1) goto L_0x005c
            r5 = 0
            r4.f3022m = r5
            r4.f3025p = r5
            r4.m1081b(r0)
            r5 = 0
            r4.f3032w = r5
            goto L_0x007f
        L_0x005c:
            int r5 = r6.getAction()
            if (r5 != r1) goto L_0x007f
            int r5 = r4.f3031v
            if (r5 != r1) goto L_0x007f
            r4.m1084b()
            int r5 = r4.f3032w
            if (r5 != r0) goto L_0x0074
            float r5 = r6.getX()
            r4.m1091a(r5)
        L_0x0074:
            int r5 = r4.f3032w
            if (r5 != r1) goto L_0x007f
            float r5 = r6.getY()
            r4.m1083b(r5)
        L_0x007f:
            return
    }

    /* renamed from: b */
    boolean m1082b(float r3, float r4) {
            r2 = this;
            boolean r0 = r2.m1074g()
            if (r0 == 0) goto L_0x0010
            int r0 = r2.f3014e
            int r0 = r0 / 2
            float r0 = (float) r0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x0031
            goto L_0x001a
        L_0x0010:
            int r0 = r2.f3026q
            int r1 = r2.f3014e
            int r0 = r0 - r1
            float r0 = (float) r0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 < 0) goto L_0x0031
        L_0x001a:
            int r3 = r2.f3021l
            int r0 = r2.f3020k
            int r1 = r0 / 2
            int r1 = r3 - r1
            float r1 = (float) r1
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0031
            int r0 = r0 / 2
            int r3 = r3 + r0
            float r3 = (float) r3
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x0031
            r3 = 1
            goto L_0x0032
        L_0x0031:
            r3 = 0
        L_0x0032:
            return r3
    }
}
