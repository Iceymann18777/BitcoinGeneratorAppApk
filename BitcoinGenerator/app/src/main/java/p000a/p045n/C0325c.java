package p000a.p045n;

/* renamed from: a.n.c */
/* loaded from: classes.dex */
public class C0325c extends p000a.p045n.AbstractC0367m {

    /* renamed from: N */
    private static final java.lang.String[] f1020N = null;

    /* renamed from: O */
    private static final android.util.Property<android.graphics.drawable.Drawable, android.graphics.PointF> f1021O = null;

    /* renamed from: P */
    private static final android.util.Property<p000a.p045n.C0325c.C0336k, android.graphics.PointF> f1022P = null;

    /* renamed from: Q */
    private static final android.util.Property<p000a.p045n.C0325c.C0336k, android.graphics.PointF> f1023Q = null;

    /* renamed from: R */
    private static final android.util.Property<android.view.View, android.graphics.PointF> f1024R = null;

    /* renamed from: S */
    private static final android.util.Property<android.view.View, android.graphics.PointF> f1025S = null;

    /* renamed from: T */
    private static final android.util.Property<android.view.View, android.graphics.PointF> f1026T = null;

    /* renamed from: U */
    private static p000a.p045n.C0363k f1027U;

    /* renamed from: K */
    private int[] f1028K;

    /* renamed from: L */
    private boolean f1029L;

    /* renamed from: M */
    private boolean f1030M;

    /* renamed from: a.n.c$a */
    /* loaded from: classes.dex */
    class C0326a extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ android.view.ViewGroup f1031a;

        /* renamed from: b */
        final /* synthetic */ android.graphics.drawable.BitmapDrawable f1032b;

        /* renamed from: c */
        final /* synthetic */ android.view.View f1033c;

        /* renamed from: d */
        final /* synthetic */ float f1034d;

        C0326a(p000a.p045n.C0325c r1, android.view.ViewGroup r2, android.graphics.drawable.BitmapDrawable r3, android.view.View r4, float r5) {
                r0 = this;
                r0.f1031a = r2
                r0.f1032b = r3
                r0.f1033c = r4
                r0.f1034d = r5
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                android.view.ViewGroup r2 = r1.f1031a
                a.n.c0 r2 = p000a.p045n.C0341d0.m2898b(r2)
                android.graphics.drawable.BitmapDrawable r0 = r1.f1032b
                r2.mo2770a(r0)
                android.view.View r2 = r1.f1033c
                float r0 = r1.f1034d
                p000a.p045n.C0341d0.m2902a(r2, r0)
                return
        }
    }

    /* renamed from: a.n.c$b */
    /* loaded from: classes.dex */
    static class C0327b extends android.util.Property<android.graphics.drawable.Drawable, android.graphics.PointF> {

        /* renamed from: a */
        private android.graphics.Rect f1035a;

        C0327b(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.f1035a = r1
                return
        }

        /* renamed from: a */
        public android.graphics.PointF m2921a(android.graphics.drawable.Drawable r3) {
                r2 = this;
                android.graphics.Rect r0 = r2.f1035a
                r3.copyBounds(r0)
                android.graphics.PointF r3 = new android.graphics.PointF
                android.graphics.Rect r0 = r2.f1035a
                int r1 = r0.left
                float r1 = (float) r1
                int r0 = r0.top
                float r0 = (float) r0
                r3.<init>(r1, r0)
                return r3
        }

        /* renamed from: a */
        public void m2920a(android.graphics.drawable.Drawable r3, android.graphics.PointF r4) {
                r2 = this;
                android.graphics.Rect r0 = r2.f1035a
                r3.copyBounds(r0)
                android.graphics.Rect r0 = r2.f1035a
                float r1 = r4.x
                int r1 = java.lang.Math.round(r1)
                float r4 = r4.y
                int r4 = java.lang.Math.round(r4)
                r0.offsetTo(r1, r4)
                android.graphics.Rect r4 = r2.f1035a
                r3.setBounds(r4)
                return
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ android.graphics.PointF get(android.graphics.drawable.Drawable r1) {
                r0 = this;
                android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
                android.graphics.PointF r1 = r0.m2921a(r1)
                return r1
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(android.graphics.drawable.Drawable r1, android.graphics.PointF r2) {
                r0 = this;
                android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
                android.graphics.PointF r2 = (android.graphics.PointF) r2
                r0.m2920a(r1, r2)
                return
        }
    }

    /* renamed from: a.n.c$c */
    /* loaded from: classes.dex */
    static class C0328c extends android.util.Property<p000a.p045n.C0325c.C0336k, android.graphics.PointF> {
        C0328c(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* renamed from: a */
        public android.graphics.PointF m2919a(p000a.p045n.C0325c.C0336k r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: a */
        public void m2918a(p000a.p045n.C0325c.C0336k r1, android.graphics.PointF r2) {
                r0 = this;
                r1.m2907b(r2)
                return
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ android.graphics.PointF get(p000a.p045n.C0325c.C0336k r1) {
                r0 = this;
                a.n.c$k r1 = (p000a.p045n.C0325c.C0336k) r1
                android.graphics.PointF r1 = r0.m2919a(r1)
                return r1
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(p000a.p045n.C0325c.C0336k r1, android.graphics.PointF r2) {
                r0 = this;
                a.n.c$k r1 = (p000a.p045n.C0325c.C0336k) r1
                android.graphics.PointF r2 = (android.graphics.PointF) r2
                r0.m2918a(r1, r2)
                return
        }
    }

    /* renamed from: a.n.c$d */
    /* loaded from: classes.dex */
    static class C0329d extends android.util.Property<p000a.p045n.C0325c.C0336k, android.graphics.PointF> {
        C0329d(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* renamed from: a */
        public android.graphics.PointF m2917a(p000a.p045n.C0325c.C0336k r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: a */
        public void m2916a(p000a.p045n.C0325c.C0336k r1, android.graphics.PointF r2) {
                r0 = this;
                r1.m2908a(r2)
                return
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ android.graphics.PointF get(p000a.p045n.C0325c.C0336k r1) {
                r0 = this;
                a.n.c$k r1 = (p000a.p045n.C0325c.C0336k) r1
                android.graphics.PointF r1 = r0.m2917a(r1)
                return r1
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(p000a.p045n.C0325c.C0336k r1, android.graphics.PointF r2) {
                r0 = this;
                a.n.c$k r1 = (p000a.p045n.C0325c.C0336k) r1
                android.graphics.PointF r2 = (android.graphics.PointF) r2
                r0.m2916a(r1, r2)
                return
        }
    }

    /* renamed from: a.n.c$e */
    /* loaded from: classes.dex */
    static class C0330e extends android.util.Property<android.view.View, android.graphics.PointF> {
        C0330e(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* renamed from: a */
        public android.graphics.PointF m2915a(android.view.View r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: a */
        public void m2914a(android.view.View r4, android.graphics.PointF r5) {
                r3 = this;
                int r0 = r4.getLeft()
                int r1 = r4.getTop()
                float r2 = r5.x
                int r2 = java.lang.Math.round(r2)
                float r5 = r5.y
                int r5 = java.lang.Math.round(r5)
                p000a.p045n.C0341d0.m2900a(r4, r0, r1, r2, r5)
                return
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ android.graphics.PointF get(android.view.View r1) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                android.graphics.PointF r1 = r0.m2915a(r1)
                return r1
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(android.view.View r1, android.graphics.PointF r2) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                android.graphics.PointF r2 = (android.graphics.PointF) r2
                r0.m2914a(r1, r2)
                return
        }
    }

    /* renamed from: a.n.c$f */
    /* loaded from: classes.dex */
    static class C0331f extends android.util.Property<android.view.View, android.graphics.PointF> {
        C0331f(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* renamed from: a */
        public android.graphics.PointF m2913a(android.view.View r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: a */
        public void m2912a(android.view.View r4, android.graphics.PointF r5) {
                r3 = this;
                float r0 = r5.x
                int r0 = java.lang.Math.round(r0)
                float r5 = r5.y
                int r5 = java.lang.Math.round(r5)
                int r1 = r4.getRight()
                int r2 = r4.getBottom()
                p000a.p045n.C0341d0.m2900a(r4, r0, r5, r1, r2)
                return
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ android.graphics.PointF get(android.view.View r1) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                android.graphics.PointF r1 = r0.m2913a(r1)
                return r1
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(android.view.View r1, android.graphics.PointF r2) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                android.graphics.PointF r2 = (android.graphics.PointF) r2
                r0.m2912a(r1, r2)
                return
        }
    }

    /* renamed from: a.n.c$g */
    /* loaded from: classes.dex */
    static class C0332g extends android.util.Property<android.view.View, android.graphics.PointF> {
        C0332g(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* renamed from: a */
        public android.graphics.PointF m2911a(android.view.View r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: a */
        public void m2910a(android.view.View r4, android.graphics.PointF r5) {
                r3 = this;
                float r0 = r5.x
                int r0 = java.lang.Math.round(r0)
                float r5 = r5.y
                int r5 = java.lang.Math.round(r5)
                int r1 = r4.getWidth()
                int r1 = r1 + r0
                int r2 = r4.getHeight()
                int r2 = r2 + r5
                p000a.p045n.C0341d0.m2900a(r4, r0, r5, r1, r2)
                return
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ android.graphics.PointF get(android.view.View r1) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                android.graphics.PointF r1 = r0.m2911a(r1)
                return r1
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(android.view.View r1, android.graphics.PointF r2) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                android.graphics.PointF r2 = (android.graphics.PointF) r2
                r0.m2910a(r1, r2)
                return
        }
    }

    /* renamed from: a.n.c$h */
    /* loaded from: classes.dex */
    class C0333h extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ p000a.p045n.C0325c.C0336k f1036a;
        private p000a.p045n.C0325c.C0336k mViewBounds;

        C0333h(p000a.p045n.C0325c r1, p000a.p045n.C0325c.C0336k r2) {
                r0 = this;
                r0.f1036a = r2
                r0.<init>()
                a.n.c$k r1 = r0.f1036a
                r0.mViewBounds = r1
                return
        }
    }

    /* renamed from: a.n.c$i */
    /* loaded from: classes.dex */
    class C0334i extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f1037a;

        /* renamed from: b */
        final /* synthetic */ android.view.View f1038b;

        /* renamed from: c */
        final /* synthetic */ android.graphics.Rect f1039c;

        /* renamed from: d */
        final /* synthetic */ int f1040d;

        /* renamed from: e */
        final /* synthetic */ int f1041e;

        /* renamed from: f */
        final /* synthetic */ int f1042f;

        /* renamed from: g */
        final /* synthetic */ int f1043g;

        C0334i(p000a.p045n.C0325c r1, android.view.View r2, android.graphics.Rect r3, int r4, int r5, int r6, int r7) {
                r0 = this;
                r0.f1038b = r2
                r0.f1039c = r3
                r0.f1040d = r4
                r0.f1041e = r5
                r0.f1042f = r6
                r0.f1043g = r7
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r1) {
                r0 = this;
                r1 = 1
                r0.f1037a = r1
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r5) {
                r4 = this;
                boolean r5 = r4.f1037a
                if (r5 != 0) goto L_0x0018
                android.view.View r5 = r4.f1038b
                android.graphics.Rect r0 = r4.f1039c
                p000a.p018g.p029l.C0216r.m3435a(r5, r0)
                android.view.View r5 = r4.f1038b
                int r0 = r4.f1040d
                int r1 = r4.f1041e
                int r2 = r4.f1042f
                int r3 = r4.f1043g
                p000a.p045n.C0341d0.m2900a(r5, r0, r1, r2, r3)
            L_0x0018:
                return
        }
    }

    /* renamed from: a.n.c$j */
    /* loaded from: classes.dex */
    class C0335j extends p000a.p045n.C0374n {

        /* renamed from: a */
        boolean f1044a;

        /* renamed from: b */
        final /* synthetic */ android.view.ViewGroup f1045b;

        C0335j(p000a.p045n.C0325c r1, android.view.ViewGroup r2) {
                r0 = this;
                r0.f1045b = r2
                r0.<init>()
                r1 = 0
                r0.f1044a = r1
                return
        }

        @Override // p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: b */
        public void mo2775b(p000a.p045n.AbstractC0367m r3) {
                r2 = this;
                boolean r0 = r2.f1044a
                if (r0 != 0) goto L_0x000a
                android.view.ViewGroup r0 = r2.f1045b
                r1 = 0
                p000a.p045n.C0388x.m2765a(r0, r1)
            L_0x000a:
                r3.mo2785b(r2)
                return
        }

        @Override // p000a.p045n.C0374n, p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: c */
        public void mo2809c(p000a.p045n.AbstractC0367m r2) {
                r1 = this;
                android.view.ViewGroup r2 = r1.f1045b
                r0 = 0
                p000a.p045n.C0388x.m2765a(r2, r0)
                return
        }

        @Override // p000a.p045n.C0374n, p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: d */
        public void mo2808d(p000a.p045n.AbstractC0367m r2) {
                r1 = this;
                android.view.ViewGroup r2 = r1.f1045b
                r0 = 1
                p000a.p045n.C0388x.m2765a(r2, r0)
                return
        }
    }

    /* renamed from: a.n.c$k */
    /* loaded from: classes.dex */
    private static class C0336k {

        /* renamed from: a */
        private int f1046a;

        /* renamed from: b */
        private int f1047b;

        /* renamed from: c */
        private int f1048c;

        /* renamed from: d */
        private int f1049d;

        /* renamed from: e */
        private android.view.View f1050e;

        /* renamed from: f */
        private int f1051f;

        /* renamed from: g */
        private int f1052g;

        C0336k(android.view.View r1) {
                r0 = this;
                r0.<init>()
                r0.f1050e = r1
                return
        }

        /* renamed from: a */
        private void m2909a() {
                r5 = this;
                android.view.View r0 = r5.f1050e
                int r1 = r5.f1046a
                int r2 = r5.f1047b
                int r3 = r5.f1048c
                int r4 = r5.f1049d
                p000a.p045n.C0341d0.m2900a(r0, r1, r2, r3, r4)
                r0 = 0
                r5.f1051f = r0
                r5.f1052g = r0
                return
        }

        /* renamed from: a */
        void m2908a(android.graphics.PointF r2) {
                r1 = this;
                float r0 = r2.x
                int r0 = java.lang.Math.round(r0)
                r1.f1048c = r0
                float r2 = r2.y
                int r2 = java.lang.Math.round(r2)
                r1.f1049d = r2
                int r2 = r1.f1052g
                int r2 = r2 + 1
                r1.f1052g = r2
                int r2 = r1.f1051f
                int r0 = r1.f1052g
                if (r2 != r0) goto L_0x001f
                r1.m2909a()
            L_0x001f:
                return
        }

        /* renamed from: b */
        void m2907b(android.graphics.PointF r2) {
                r1 = this;
                float r0 = r2.x
                int r0 = java.lang.Math.round(r0)
                r1.f1046a = r0
                float r2 = r2.y
                int r2 = java.lang.Math.round(r2)
                r1.f1047b = r2
                int r2 = r1.f1051f
                int r2 = r2 + 1
                r1.f1051f = r2
                int r2 = r1.f1051f
                int r0 = r1.f1052g
                if (r2 != r0) goto L_0x001f
                r1.m2909a()
            L_0x001f:
                return
        }
    }

    static {
            r0 = 5
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "android:changeBounds:bounds"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "android:changeBounds:clip"
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "android:changeBounds:parent"
            r0[r1] = r2
            r1 = 3
            java.lang.String r2 = "android:changeBounds:windowX"
            r0[r1] = r2
            r1 = 4
            java.lang.String r2 = "android:changeBounds:windowY"
            r0[r1] = r2
            p000a.p045n.C0325c.f1020N = r0
            a.n.c$b r0 = new a.n.c$b
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r2 = "boundsOrigin"
            r0.<init>(r1, r2)
            p000a.p045n.C0325c.f1021O = r0
            a.n.c$c r0 = new a.n.c$c
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r2 = "topLeft"
            r0.<init>(r1, r2)
            p000a.p045n.C0325c.f1022P = r0
            a.n.c$d r0 = new a.n.c$d
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r3 = "bottomRight"
            r0.<init>(r1, r3)
            p000a.p045n.C0325c.f1023Q = r0
            a.n.c$e r0 = new a.n.c$e
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            r0.<init>(r1, r3)
            p000a.p045n.C0325c.f1024R = r0
            a.n.c$f r0 = new a.n.c$f
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            r0.<init>(r1, r2)
            p000a.p045n.C0325c.f1025S = r0
            a.n.c$g r0 = new a.n.c$g
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r2 = "position"
            r0.<init>(r1, r2)
            p000a.p045n.C0325c.f1026T = r0
            a.n.k r0 = new a.n.k
            r0.<init>()
            p000a.p045n.C0325c.f1027U = r0
            return
    }

    public C0325c() {
            r1 = this;
            r1.<init>()
            r0 = 2
            int[] r0 = new int[r0]
            r1.f1028K = r0
            r0 = 0
            r1.f1029L = r0
            r1.f1030M = r0
            return
    }

    /* renamed from: a */
    private boolean m2923a(android.view.View r4, android.view.View r5) {
            r3 = this;
            boolean r0 = r3.f1030M
            r1 = 1
            if (r0 == 0) goto L_0x0015
            a.n.s r0 = r3.m2833a(r4, r1)
            r2 = 0
            if (r0 != 0) goto L_0x0011
            if (r4 != r5) goto L_0x000f
            goto L_0x0015
        L_0x000f:
            r1 = 0
            goto L_0x0015
        L_0x0011:
            android.view.View r4 = r0.f1167b
            if (r5 != r4) goto L_0x000f
        L_0x0015:
            return r1
    }

    /* renamed from: d */
    private void m2922d(p000a.p045n.C0383s r8) {
            r7 = this;
            android.view.View r0 = r8.f1167b
            boolean r1 = p000a.p018g.p029l.C0216r.m3397x(r0)
            if (r1 != 0) goto L_0x0014
            int r1 = r0.getWidth()
            if (r1 != 0) goto L_0x0014
            int r1 = r0.getHeight()
            if (r1 == 0) goto L_0x0077
        L_0x0014:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.f1166a
            android.graphics.Rect r2 = new android.graphics.Rect
            int r3 = r0.getLeft()
            int r4 = r0.getTop()
            int r5 = r0.getRight()
            int r6 = r0.getBottom()
            r2.<init>(r3, r4, r5, r6)
            java.lang.String r3 = "android:changeBounds:bounds"
            r1.put(r3, r2)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.f1166a
            android.view.View r2 = r8.f1167b
            android.view.ViewParent r2 = r2.getParent()
            java.lang.String r3 = "android:changeBounds:parent"
            r1.put(r3, r2)
            boolean r1 = r7.f1030M
            if (r1 == 0) goto L_0x0068
            android.view.View r1 = r8.f1167b
            int[] r2 = r7.f1028K
            r1.getLocationInWindow(r2)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.f1166a
            int[] r2 = r7.f1028K
            r3 = 0
            r2 = r2[r3]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "android:changeBounds:windowX"
            r1.put(r3, r2)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.f1166a
            int[] r2 = r7.f1028K
            r3 = 1
            r2 = r2[r3]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "android:changeBounds:windowY"
            r1.put(r3, r2)
        L_0x0068:
            boolean r1 = r7.f1029L
            if (r1 == 0) goto L_0x0077
            java.util.Map<java.lang.String, java.lang.Object> r8 = r8.f1166a
            android.graphics.Rect r0 = p000a.p018g.p029l.C0216r.m3421d(r0)
            java.lang.String r1 = "android:changeBounds:clip"
            r8.put(r1, r0)
        L_0x0077:
            return
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public android.animation.Animator mo2831a(android.view.ViewGroup r19, p000a.p045n.C0383s r20, p000a.p045n.C0383s r21) {
            r18 = this;
            r8 = r18
            r0 = r20
            r1 = r21
            if (r0 == 0) goto L_0x0255
            if (r1 != 0) goto L_0x000c
            goto L_0x0255
        L_0x000c:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r0.f1166a
            java.util.Map<java.lang.String, java.lang.Object> r4 = r1.f1166a
            java.lang.String r5 = "android:changeBounds:parent"
            java.lang.Object r3 = r3.get(r5)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            java.lang.Object r4 = r4.get(r5)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r3 == 0) goto L_0x0253
            if (r4 != 0) goto L_0x0024
            goto L_0x0253
        L_0x0024:
            android.view.View r9 = r1.f1167b
            boolean r3 = r8.m2923a(r3, r4)
            if (r3 == 0) goto L_0x01ac
            java.util.Map<java.lang.String, java.lang.Object> r3 = r0.f1166a
            java.lang.String r5 = "android:changeBounds:bounds"
            java.lang.Object r3 = r3.get(r5)
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            java.util.Map<java.lang.String, java.lang.Object> r6 = r1.f1166a
            java.lang.Object r5 = r6.get(r5)
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            int r6 = r3.left
            int r7 = r5.left
            int r11 = r3.top
            int r12 = r5.top
            int r13 = r3.right
            int r14 = r5.right
            int r3 = r3.bottom
            int r15 = r5.bottom
            int r5 = r13 - r6
            int r2 = r3 - r11
            int r10 = r14 - r7
            int r4 = r15 - r12
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.f1166a
            r16 = r9
            java.lang.String r9 = "android:changeBounds:clip"
            java.lang.Object r0 = r0.get(r9)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f1166a
            java.lang.Object r1 = r1.get(r9)
            r9 = r1
            android.graphics.Rect r9 = (android.graphics.Rect) r9
            if (r5 == 0) goto L_0x006f
            if (r2 != 0) goto L_0x0073
        L_0x006f:
            if (r10 == 0) goto L_0x0082
            if (r4 == 0) goto L_0x0082
        L_0x0073:
            if (r6 != r7) goto L_0x007a
            if (r11 == r12) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r1 = 0
            goto L_0x007b
        L_0x007a:
            r1 = 1
        L_0x007b:
            if (r13 != r14) goto L_0x007f
            if (r3 == r15) goto L_0x0083
        L_0x007f:
            int r1 = r1 + 1
            goto L_0x0083
        L_0x0082:
            r1 = 0
        L_0x0083:
            if (r0 == 0) goto L_0x008b
            boolean r17 = r0.equals(r9)
            if (r17 == 0) goto L_0x008f
        L_0x008b:
            if (r0 != 0) goto L_0x0091
            if (r9 == 0) goto L_0x0091
        L_0x008f:
            int r1 = r1 + 1
        L_0x0091:
            if (r1 <= 0) goto L_0x01e5
            r19 = r9
            boolean r9 = r8.f1029L
            r20 = r0
            r0 = 2
            if (r9 != 0) goto L_0x0122
            r9 = r16
            p000a.p045n.C0341d0.m2900a(r9, r6, r11, r13, r3)
            if (r1 != r0) goto L_0x00fa
            if (r5 != r10) goto L_0x00b6
            if (r2 != r4) goto L_0x00b6
            a.n.g r0 = r18.m2820f()
            float r1 = (float) r6
            float r2 = (float) r11
            float r3 = (float) r7
            float r4 = (float) r12
            android.graphics.Path r0 = r0.mo2810a(r1, r2, r3, r4)
            android.util.Property<android.view.View, android.graphics.PointF> r1 = p000a.p045n.C0325c.f1026T
            goto L_0x011c
        L_0x00b6:
            a.n.c$k r1 = new a.n.c$k
            r1.<init>(r9)
            a.n.g r2 = r18.m2820f()
            float r4 = (float) r6
            float r5 = (float) r11
            float r6 = (float) r7
            float r7 = (float) r12
            android.graphics.Path r2 = r2.mo2810a(r4, r5, r6, r7)
            android.util.Property<a.n.c$k, android.graphics.PointF> r4 = p000a.p045n.C0325c.f1022P
            android.animation.ObjectAnimator r2 = p000a.p045n.C0350f.m2870a(r1, r4, r2)
            a.n.g r4 = r18.m2820f()
            float r5 = (float) r13
            float r3 = (float) r3
            float r6 = (float) r14
            float r7 = (float) r15
            android.graphics.Path r3 = r4.mo2810a(r5, r3, r6, r7)
            android.util.Property<a.n.c$k, android.graphics.PointF> r4 = p000a.p045n.C0325c.f1023Q
            android.animation.ObjectAnimator r3 = p000a.p045n.C0350f.m2870a(r1, r4, r3)
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            r5 = 0
            r0[r5] = r2
            r2 = 1
            r0[r2] = r3
            r4.playTogether(r0)
            a.n.c$h r0 = new a.n.c$h
            r0.<init>(r8, r1)
            r4.addListener(r0)
            r0 = r4
            goto L_0x0191
        L_0x00fa:
            if (r6 != r7) goto L_0x010e
            if (r11 == r12) goto L_0x00ff
            goto L_0x010e
        L_0x00ff:
            a.n.g r0 = r18.m2820f()
            float r1 = (float) r13
            float r2 = (float) r3
            float r3 = (float) r14
            float r4 = (float) r15
            android.graphics.Path r0 = r0.mo2810a(r1, r2, r3, r4)
            android.util.Property<android.view.View, android.graphics.PointF> r1 = p000a.p045n.C0325c.f1024R
            goto L_0x011c
        L_0x010e:
            a.n.g r0 = r18.m2820f()
            float r1 = (float) r6
            float r2 = (float) r11
            float r3 = (float) r7
            float r4 = (float) r12
            android.graphics.Path r0 = r0.mo2810a(r1, r2, r3, r4)
            android.util.Property<android.view.View, android.graphics.PointF> r1 = p000a.p045n.C0325c.f1025S
        L_0x011c:
            android.animation.ObjectAnimator r0 = p000a.p045n.C0350f.m2870a(r9, r1, r0)
            goto L_0x0191
        L_0x0122:
            r9 = r16
            int r1 = java.lang.Math.max(r5, r10)
            int r3 = java.lang.Math.max(r2, r4)
            int r1 = r1 + r6
            int r3 = r3 + r11
            p000a.p045n.C0341d0.m2900a(r9, r6, r11, r1, r3)
            if (r6 != r7) goto L_0x0138
            if (r11 == r12) goto L_0x0136
            goto L_0x0138
        L_0x0136:
            r11 = 0
            goto L_0x014b
        L_0x0138:
            a.n.g r1 = r18.m2820f()
            float r3 = (float) r6
            float r6 = (float) r11
            float r11 = (float) r7
            float r13 = (float) r12
            android.graphics.Path r1 = r1.mo2810a(r3, r6, r11, r13)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = p000a.p045n.C0325c.f1026T
            android.animation.ObjectAnimator r1 = p000a.p045n.C0350f.m2870a(r9, r3, r1)
            r11 = r1
        L_0x014b:
            if (r20 != 0) goto L_0x0154
            android.graphics.Rect r1 = new android.graphics.Rect
            r3 = 0
            r1.<init>(r3, r3, r5, r2)
            goto L_0x0157
        L_0x0154:
            r3 = 0
            r1 = r20
        L_0x0157:
            if (r19 != 0) goto L_0x015f
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r3, r3, r10, r4)
            goto L_0x0161
        L_0x015f:
            r2 = r19
        L_0x0161:
            boolean r4 = r1.equals(r2)
            if (r4 != 0) goto L_0x018c
            p000a.p018g.p029l.C0216r.m3435a(r9, r1)
            a.n.k r4 = p000a.p045n.C0325c.f1027U
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r1
            r1 = 1
            r0[r1] = r2
            java.lang.String r1 = "clipBounds"
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofObject(r9, r1, r4, r0)
            a.n.c$i r13 = new a.n.c$i
            r0 = r13
            r1 = r18
            r2 = r9
            r3 = r19
            r4 = r7
            r5 = r12
            r6 = r14
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.addListener(r13)
            goto L_0x018d
        L_0x018c:
            r10 = 0
        L_0x018d:
            android.animation.Animator r0 = p000a.p045n.C0382r.m2774a(r11, r10)
        L_0x0191:
            android.view.ViewParent r1 = r9.getParent()
            boolean r1 = r1 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x01ab
            android.view.ViewParent r1 = r9.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2 = 1
            p000a.p045n.C0388x.m2765a(r1, r2)
            a.n.c$j r2 = new a.n.c$j
            r2.<init>(r8, r1)
            r8.mo2795a(r2)
        L_0x01ab:
            return r0
        L_0x01ac:
            java.util.Map<java.lang.String, java.lang.Object> r2 = r0.f1166a
            java.lang.String r3 = "android:changeBounds:windowX"
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.f1166a
            java.lang.String r4 = "android:changeBounds:windowY"
            java.lang.Object r0 = r0.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r5 = r1.f1166a
            java.lang.Object r3 = r5.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f1166a
            java.lang.Object r1 = r1.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r2 != r3) goto L_0x01e7
            if (r0 == r1) goto L_0x01e5
            goto L_0x01e7
        L_0x01e5:
            r0 = 0
            return r0
        L_0x01e7:
            int[] r4 = r8.f1028K
            r5 = r19
            r5.getLocationInWindow(r4)
            int r4 = r9.getWidth()
            int r6 = r9.getHeight()
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r6, r7)
            android.graphics.Canvas r6 = new android.graphics.Canvas
            r6.<init>(r4)
            r9.draw(r6)
            android.graphics.drawable.BitmapDrawable r6 = new android.graphics.drawable.BitmapDrawable
            r6.<init>(r4)
            float r7 = p000a.p045n.C0341d0.m2896c(r9)
            r4 = 0
            p000a.p045n.C0341d0.m2902a(r9, r4)
            a.n.c0 r4 = p000a.p045n.C0341d0.m2898b(r19)
            r4.mo2769b(r6)
            a.n.g r4 = r18.m2820f()
            int[] r10 = r8.f1028K
            r11 = 0
            r12 = r10[r11]
            int r2 = r2 - r12
            float r2 = (float) r2
            r12 = 1
            r13 = r10[r12]
            int r0 = r0 - r13
            float r0 = (float) r0
            r13 = r10[r11]
            int r3 = r3 - r13
            float r3 = (float) r3
            r10 = r10[r12]
            int r1 = r1 - r10
            float r1 = (float) r1
            android.graphics.Path r0 = r4.mo2810a(r2, r0, r3, r1)
            android.util.Property<android.graphics.drawable.Drawable, android.graphics.PointF> r1 = p000a.p045n.C0325c.f1021O
            android.animation.PropertyValuesHolder r0 = p000a.p045n.C0356i.m2858a(r1, r0)
            android.animation.PropertyValuesHolder[] r1 = new android.animation.PropertyValuesHolder[r12]
            r1[r11] = r0
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r6, r1)
            a.n.c$a r11 = new a.n.c$a
            r0 = r11
            r1 = r18
            r2 = r19
            r3 = r6
            r4 = r9
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r10.addListener(r11)
            return r10
        L_0x0253:
            r0 = 0
            return r0
        L_0x0255:
            r0 = 0
            return r0
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public void mo2792a(p000a.p045n.C0383s r1) {
            r0 = this;
            r0.m2922d(r1)
            return
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: c */
    public void mo2783c(p000a.p045n.C0383s r1) {
            r0 = this;
            r0.m2922d(r1)
            return
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: m */
    public java.lang.String[] mo2813m() {
            r1 = this;
            java.lang.String[] r0 = p000a.p045n.C0325c.f1020N
            return r0
    }
}
