package p000a.p036j.p037a;

/* renamed from: a.j.a.i */
/* loaded from: classes.dex */
final class LayoutInflater$Factory2C0266i extends p000a.p036j.p037a.AbstractC0262h implements android.view.LayoutInflater.Factory2 {

    /* renamed from: F */
    static boolean f855F = false;

    /* renamed from: G */
    static java.lang.reflect.Field f856G;

    /* renamed from: H */
    static final android.view.animation.Interpolator f857H = null;

    /* renamed from: I */
    static final android.view.animation.Interpolator f858I = null;

    /* renamed from: A */
    android.os.Bundle f859A;

    /* renamed from: B */
    android.util.SparseArray<android.os.Parcelable> f860B;

    /* renamed from: C */
    java.util.ArrayList<p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0281m> f861C;

    /* renamed from: D */
    p000a.p036j.p037a.C0282j f862D;

    /* renamed from: E */
    java.lang.Runnable f863E;

    /* renamed from: b */
    java.util.ArrayList<p000a.p036j.p037a.LayoutInflater$Factory2C0266i.AbstractC0280l> f864b;

    /* renamed from: c */
    boolean f865c;

    /* renamed from: d */
    int f866d;

    /* renamed from: e */
    final java.util.ArrayList<p000a.p036j.p037a.ComponentCallbacksC0248c> f867e;

    /* renamed from: f */
    android.util.SparseArray<p000a.p036j.p037a.ComponentCallbacksC0248c> f868f;

    /* renamed from: g */
    java.util.ArrayList<p000a.p036j.p037a.C0244a> f869g;

    /* renamed from: h */
    java.util.ArrayList<p000a.p036j.p037a.ComponentCallbacksC0248c> f870h;

    /* renamed from: i */
    java.util.ArrayList<p000a.p036j.p037a.C0244a> f871i;

    /* renamed from: j */
    java.util.ArrayList<java.lang.Integer> f872j;

    /* renamed from: k */
    java.util.ArrayList<p000a.p036j.p037a.AbstractC0262h.AbstractC0265c> f873k;

    /* renamed from: l */
    private final java.util.concurrent.CopyOnWriteArrayList<p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0278j> f874l;

    /* renamed from: m */
    int f875m;

    /* renamed from: n */
    p000a.p036j.p037a.AbstractC0261g f876n;

    /* renamed from: o */
    p000a.p036j.p037a.AbstractC0259e f877o;

    /* renamed from: p */
    p000a.p036j.p037a.ComponentCallbacksC0248c f878p;

    /* renamed from: q */
    p000a.p036j.p037a.ComponentCallbacksC0248c f879q;

    /* renamed from: r */
    boolean f880r;

    /* renamed from: s */
    boolean f881s;

    /* renamed from: t */
    boolean f882t;

    /* renamed from: u */
    boolean f883u;

    /* renamed from: v */
    java.lang.String f884v;

    /* renamed from: w */
    boolean f885w;

    /* renamed from: x */
    java.util.ArrayList<p000a.p036j.p037a.C0244a> f886x;

    /* renamed from: y */
    java.util.ArrayList<java.lang.Boolean> f887y;

    /* renamed from: z */
    java.util.ArrayList<p000a.p036j.p037a.ComponentCallbacksC0248c> f888z;

    /* renamed from: a.j.a.i$a */
    /* loaded from: classes.dex */
    class RunnableC0267a implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ p000a.p036j.p037a.LayoutInflater$Factory2C0266i f889b;

        RunnableC0267a(p000a.p036j.p037a.LayoutInflater$Factory2C0266i r1) {
                r0 = this;
                r0.f889b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                a.j.a.i r0 = r1.f889b
                r0.m3018o()
                return
        }
    }

    /* renamed from: a.j.a.i$b */
    /* loaded from: classes.dex */
    class C0268b extends p000a.p036j.p037a.LayoutInflater$Factory2C0266i.animationAnimation$AnimationListenerC0274f {

        /* renamed from: b */
        final /* synthetic */ android.view.ViewGroup f890b;

        /* renamed from: c */
        final /* synthetic */ p000a.p036j.p037a.ComponentCallbacksC0248c f891c;

        /* renamed from: d */
        final /* synthetic */ p000a.p036j.p037a.LayoutInflater$Factory2C0266i f892d;

        /* renamed from: a.j.a.i$b$a */
        /* loaded from: classes.dex */
        class RunnableC0269a implements java.lang.Runnable {

            /* renamed from: b */
            final /* synthetic */ p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0268b f893b;

            RunnableC0269a(p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0268b r1) {
                    r0 = this;
                    r0.f893b = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r7 = this;
                    a.j.a.i$b r0 = r7.f893b
                    a.j.a.c r0 = r0.f891c
                    android.view.View r0 = r0.m3208g()
                    if (r0 == 0) goto L_0x0022
                    a.j.a.i$b r0 = r7.f893b
                    a.j.a.c r0 = r0.f891c
                    r1 = 0
                    r0.m3237a(r1)
                    a.j.a.i$b r0 = r7.f893b
                    a.j.a.i r1 = r0.f892d
                    a.j.a.c r2 = r0.f891c
                    int r3 = r2.m3184x()
                    r4 = 0
                    r5 = 0
                    r6 = 0
                    r1.m3103a(r2, r3, r4, r5, r6)
                L_0x0022:
                    return
            }
        }

        C0268b(p000a.p036j.p037a.LayoutInflater$Factory2C0266i r1, android.view.animation.Animation.AnimationListener r2, android.view.ViewGroup r3, p000a.p036j.p037a.ComponentCallbacksC0248c r4) {
                r0 = this;
                r0.f892d = r1
                r0.f890b = r3
                r0.f891c = r4
                r0.<init>(r2)
                return
        }

        @Override // p000a.p036j.p037a.LayoutInflater$Factory2C0266i.animationAnimation$AnimationListenerC0274f, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(android.view.animation.Animation r2) {
                r1 = this;
                super.onAnimationEnd(r2)
                android.view.ViewGroup r2 = r1.f890b
                a.j.a.i$b$a r0 = new a.j.a.i$b$a
                r0.<init>(r1)
                r2.post(r0)
                return
        }
    }

    /* renamed from: a.j.a.i$c */
    /* loaded from: classes.dex */
    class C0270c extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ android.view.ViewGroup f894a;

        /* renamed from: b */
        final /* synthetic */ android.view.View f895b;

        /* renamed from: c */
        final /* synthetic */ p000a.p036j.p037a.ComponentCallbacksC0248c f896c;

        /* renamed from: d */
        final /* synthetic */ p000a.p036j.p037a.LayoutInflater$Factory2C0266i f897d;

        C0270c(p000a.p036j.p037a.LayoutInflater$Factory2C0266i r1, android.view.ViewGroup r2, android.view.View r3, p000a.p036j.p037a.ComponentCallbacksC0248c r4) {
                r0 = this;
                r0.f897d = r1
                r0.f894a = r2
                r0.f895b = r3
                r0.f896c = r4
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r7) {
                r6 = this;
                android.view.ViewGroup r7 = r6.f894a
                android.view.View r0 = r6.f895b
                r7.endViewTransition(r0)
                a.j.a.c r7 = r6.f896c
                android.animation.Animator r7 = r7.m3206h()
                a.j.a.c r0 = r6.f896c
                r1 = 0
                r0.m3251a(r1)
                if (r7 == 0) goto L_0x002d
                android.view.ViewGroup r7 = r6.f894a
                android.view.View r0 = r6.f895b
                int r7 = r7.indexOfChild(r0)
                if (r7 >= 0) goto L_0x002d
                a.j.a.i r0 = r6.f897d
                a.j.a.c r1 = r6.f896c
                int r2 = r1.m3184x()
                r3 = 0
                r4 = 0
                r5 = 0
                r0.m3103a(r1, r2, r3, r4, r5)
            L_0x002d:
                return
        }
    }

    /* renamed from: a.j.a.i$d */
    /* loaded from: classes.dex */
    class C0271d extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ android.view.ViewGroup f898a;

        /* renamed from: b */
        final /* synthetic */ android.view.View f899b;

        /* renamed from: c */
        final /* synthetic */ p000a.p036j.p037a.ComponentCallbacksC0248c f900c;

        C0271d(p000a.p036j.p037a.LayoutInflater$Factory2C0266i r1, android.view.ViewGroup r2, android.view.View r3, p000a.p036j.p037a.ComponentCallbacksC0248c r4) {
                r0 = this;
                r0.f898a = r2
                r0.f899b = r3
                r0.f900c = r4
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r3) {
                r2 = this;
                android.view.ViewGroup r0 = r2.f898a
                android.view.View r1 = r2.f899b
                r0.endViewTransition(r1)
                r3.removeListener(r2)
                a.j.a.c r3 = r2.f900c
                android.view.View r3 = r3.f775J
                if (r3 == 0) goto L_0x0015
                r0 = 8
                r3.setVisibility(r0)
            L_0x0015:
                return
        }
    }

    /* renamed from: a.j.a.i$e */
    /* loaded from: classes.dex */
    private static class C0272e extends p000a.p036j.p037a.LayoutInflater$Factory2C0266i.animationAnimation$AnimationListenerC0274f {

        /* renamed from: b */
        android.view.View f901b;

        /* renamed from: a.j.a.i$e$a */
        /* loaded from: classes.dex */
        class RunnableC0273a implements java.lang.Runnable {

            /* renamed from: b */
            final /* synthetic */ p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0272e f902b;

            RunnableC0273a(p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0272e r1) {
                    r0 = this;
                    r0.f902b = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r3 = this;
                    a.j.a.i$e r0 = r3.f902b
                    android.view.View r0 = r0.f901b
                    r1 = 0
                    r2 = 0
                    r0.setLayerType(r1, r2)
                    return
            }
        }

        C0272e(android.view.View r1, android.view.animation.Animation.AnimationListener r2) {
                r0 = this;
                r0.<init>(r2)
                r0.f901b = r1
                return
        }

        @Override // p000a.p036j.p037a.LayoutInflater$Factory2C0266i.animationAnimation$AnimationListenerC0274f, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(android.view.animation.Animation r4) {
                r3 = this;
                android.view.View r0 = r3.f901b
                boolean r0 = p000a.p018g.p029l.C0216r.m3398w(r0)
                if (r0 != 0) goto L_0x0017
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 24
                if (r0 < r1) goto L_0x000f
                goto L_0x0017
            L_0x000f:
                android.view.View r0 = r3.f901b
                r1 = 0
                r2 = 0
                r0.setLayerType(r1, r2)
                goto L_0x0021
            L_0x0017:
                android.view.View r0 = r3.f901b
                a.j.a.i$e$a r1 = new a.j.a.i$e$a
                r1.<init>(r3)
                r0.post(r1)
            L_0x0021:
                super.onAnimationEnd(r4)
                return
        }
    }

    /* renamed from: a.j.a.i$f  reason: invalid class name */
    /* loaded from: classes.dex */
    private static class animationAnimation$AnimationListenerC0274f implements android.view.animation.Animation.AnimationListener {

        /* renamed from: a */
        private final android.view.animation.Animation.AnimationListener f903a;

        animationAnimation$AnimationListenerC0274f(android.view.animation.Animation.AnimationListener r1) {
                r0 = this;
                r0.<init>()
                r0.f903a = r1
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(android.view.animation.Animation r2) {
                r1 = this;
                android.view.animation.Animation$AnimationListener r0 = r1.f903a
                if (r0 == 0) goto L_0x0007
                r0.onAnimationEnd(r2)
            L_0x0007:
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(android.view.animation.Animation r2) {
                r1 = this;
                android.view.animation.Animation$AnimationListener r0 = r1.f903a
                if (r0 == 0) goto L_0x0007
                r0.onAnimationRepeat(r2)
            L_0x0007:
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(android.view.animation.Animation r2) {
                r1 = this;
                android.view.animation.Animation$AnimationListener r0 = r1.f903a
                if (r0 == 0) goto L_0x0007
                r0.onAnimationStart(r2)
            L_0x0007:
                return
        }
    }

    /* renamed from: a.j.a.i$g */
    /* loaded from: classes.dex */
    private static class C0275g {

        /* renamed from: a */
        public final android.view.animation.Animation f904a;

        /* renamed from: b */
        public final android.animation.Animator f905b;

        C0275g(android.animation.Animator r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f904a = r0
                r1.f905b = r2
                if (r2 == 0) goto L_0x000b
                return
            L_0x000b:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Animator cannot be null"
                r2.<init>(r0)
                throw r2
        }

        C0275g(android.view.animation.Animation r2) {
                r1 = this;
                r1.<init>()
                r1.f904a = r2
                r0 = 0
                r1.f905b = r0
                if (r2 == 0) goto L_0x000b
                return
            L_0x000b:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Animation cannot be null"
                r2.<init>(r0)
                throw r2
        }
    }

    /* renamed from: a.j.a.i$h */
    /* loaded from: classes.dex */
    private static class C0276h extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        android.view.View f906a;

        C0276h(android.view.View r1) {
                r0 = this;
                r0.<init>()
                r0.f906a = r1
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r4) {
                r3 = this;
                android.view.View r0 = r3.f906a
                r1 = 0
                r2 = 0
                r0.setLayerType(r1, r2)
                r4.removeListener(r3)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r3) {
                r2 = this;
                android.view.View r3 = r2.f906a
                r0 = 2
                r1 = 0
                r3.setLayerType(r0, r1)
                return
        }
    }

    /* renamed from: a.j.a.i$i */
    /* loaded from: classes.dex */
    private static class RunnableC0277i extends android.view.animation.AnimationSet implements java.lang.Runnable {

        /* renamed from: b */
        private final android.view.ViewGroup f907b;

        /* renamed from: c */
        private final android.view.View f908c;

        /* renamed from: d */
        private boolean f909d;

        /* renamed from: e */
        private boolean f910e;

        /* renamed from: f */
        private boolean f911f;

        RunnableC0277i(android.view.animation.Animation r2, android.view.ViewGroup r3, android.view.View r4) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r0 = 1
                r1.f911f = r0
                r1.f907b = r3
                r1.f908c = r4
                r1.addAnimation(r2)
                android.view.ViewGroup r2 = r1.f907b
                r2.post(r1)
                return
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long r3, android.view.animation.Transformation r5) {
                r2 = this;
                r0 = 1
                r2.f911f = r0
                boolean r1 = r2.f909d
                if (r1 == 0) goto L_0x000b
                boolean r3 = r2.f910e
                r3 = r3 ^ r0
                return r3
            L_0x000b:
                boolean r3 = super.getTransformation(r3, r5)
                if (r3 != 0) goto L_0x0018
                r2.f909d = r0
                android.view.ViewGroup r3 = r2.f907b
                p000a.p036j.p037a.ViewTreeObserver$OnPreDrawListenerC0303q.m2950a(r3, r2)
            L_0x0018:
                return r0
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long r3, android.view.animation.Transformation r5, float r6) {
                r2 = this;
                r0 = 1
                r2.f911f = r0
                boolean r1 = r2.f909d
                if (r1 == 0) goto L_0x000b
                boolean r3 = r2.f910e
                r3 = r3 ^ r0
                return r3
            L_0x000b:
                boolean r3 = super.getTransformation(r3, r5, r6)
                if (r3 != 0) goto L_0x0018
                r2.f909d = r0
                android.view.ViewGroup r3 = r2.f907b
                p000a.p036j.p037a.ViewTreeObserver$OnPreDrawListenerC0303q.m2950a(r3, r2)
            L_0x0018:
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                boolean r0 = r2.f909d
                if (r0 != 0) goto L_0x0011
                boolean r0 = r2.f911f
                if (r0 == 0) goto L_0x0011
                r0 = 0
                r2.f911f = r0
                android.view.ViewGroup r0 = r2.f907b
                r0.post(r2)
                goto L_0x001b
            L_0x0011:
                android.view.ViewGroup r0 = r2.f907b
                android.view.View r1 = r2.f908c
                r0.endViewTransition(r1)
                r0 = 1
                r2.f910e = r0
            L_0x001b:
                return
        }
    }

    /* renamed from: a.j.a.i$j */
    /* loaded from: classes.dex */
    private static final class C0278j {

        /* renamed from: a */
        final p000a.p036j.p037a.AbstractC0262h.AbstractC0264b f912a;

        /* renamed from: b */
        final boolean f913b;
    }

    /* renamed from: a.j.a.i$k */
    /* loaded from: classes.dex */
    static class C0279k {

        /* renamed from: a */
        public static final int[] f914a = null;

        static {
                r0 = 3
                int[] r0 = new int[r0]
                r0 = {x000a: FILL_ARRAY_DATA  , data: [16842755, 16842960, 16842961} // fill-array
                p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0279k.f914a = r0
                return
        }
    }

    /* renamed from: a.j.a.i$l */
    /* loaded from: classes.dex */
    interface AbstractC0280l {
        /* renamed from: a */
        boolean mo3004a(java.util.ArrayList<p000a.p036j.p037a.C0244a> r1, java.util.ArrayList<java.lang.Boolean> r2);
    }

    /* renamed from: a.j.a.i$m */
    /* loaded from: classes.dex */
    static class C0281m implements p000a.p036j.p037a.ComponentCallbacksC0248c.AbstractC0254f {

        /* renamed from: a */
        final boolean f915a;

        /* renamed from: b */
        final p000a.p036j.p037a.C0244a f916b;

        /* renamed from: c */
        private int f917c;

        C0281m(p000a.p036j.p037a.C0244a r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.f915a = r2
                r0.f916b = r1
                return
        }

        @Override // p000a.p036j.p037a.ComponentCallbacksC0248c.AbstractC0254f
        /* renamed from: a */
        public void mo3003a() {
                r1 = this;
                int r0 = r1.f917c
                int r0 = r0 + (-1)
                r1.f917c = r0
                int r0 = r1.f917c
                if (r0 == 0) goto L_0x000b
                return
            L_0x000b:
                a.j.a.a r0 = r1.f916b
                a.j.a.i r0 = r0.f726a
                r0.m3008w()
                return
        }

        @Override // p000a.p036j.p037a.ComponentCallbacksC0248c.AbstractC0254f
        /* renamed from: b */
        public void mo3002b() {
                r1 = this;
                int r0 = r1.f917c
                int r0 = r0 + 1
                r1.f917c = r0
                return
        }

        /* renamed from: c */
        public void m3001c() {
                r4 = this;
                a.j.a.a r0 = r4.f916b
                a.j.a.i r1 = r0.f726a
                boolean r2 = r4.f915a
                r3 = 0
                r1.m3105a(r0, r2, r3, r3)
                return
        }

        /* renamed from: d */
        public void m3000d() {
                r7 = this;
                int r0 = r7.f917c
                r1 = 0
                r2 = 1
                if (r0 <= 0) goto L_0x0008
                r0 = 1
                goto L_0x0009
            L_0x0008:
                r0 = 0
            L_0x0009:
                a.j.a.a r3 = r7.f916b
                a.j.a.i r3 = r3.f726a
                java.util.ArrayList<a.j.a.c> r4 = r3.f867e
                int r4 = r4.size()
            L_0x0013:
                if (r1 >= r4) goto L_0x002f
                java.util.ArrayList<a.j.a.c> r5 = r3.f867e
                java.lang.Object r5 = r5.get(r1)
                a.j.a.c r5 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r5
                r6 = 0
                r5.m3253a(r6)
                if (r0 == 0) goto L_0x002c
                boolean r6 = r5.m3281D()
                if (r6 == 0) goto L_0x002c
                r5.m3261Y()
            L_0x002c:
                int r1 = r1 + 1
                goto L_0x0013
            L_0x002f:
                a.j.a.a r1 = r7.f916b
                a.j.a.i r3 = r1.f726a
                boolean r4 = r7.f915a
                r0 = r0 ^ r2
                r3.m3105a(r1, r4, r0, r2)
                return
        }

        /* renamed from: e */
        public boolean m2999e() {
                r1 = this;
                int r0 = r1.f917c
                if (r0 != 0) goto L_0x0006
                r0 = 1
                goto L_0x0007
            L_0x0006:
                r0 = 0
            L_0x0007:
                return r0
        }
    }

    static {
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r1 = 1075838976(0x40200000, float:2.5)
            r0.<init>(r1)
            p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f857H = r0
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r2 = 1069547520(0x3fc00000, float:1.5)
            r0.<init>(r2)
            p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f858I = r0
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>(r1)
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>(r2)
            return
    }

    LayoutInflater$Factory2C0266i() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f866d = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.f867e = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r2.f874l = r1
            r2.f875m = r0
            r0 = 0
            r2.f859A = r0
            r2.f860B = r0
            a.j.a.i$a r0 = new a.j.a.i$a
            r0.<init>(r2)
            r2.f863E = r0
            return
    }

    /* renamed from: A */
    private void m3114A() {
            r1 = this;
            r0 = 0
            r1.f865c = r0
            java.util.ArrayList<java.lang.Boolean> r0 = r1.f887y
            r0.clear()
            java.util.ArrayList<a.j.a.a> r0 = r1.f886x
            r0.clear()
            return
    }

    /* renamed from: B */
    private void m3113B() {
            r9 = this;
            android.util.SparseArray<a.j.a.c> r0 = r9.f868f
            r1 = 0
            if (r0 != 0) goto L_0x0007
            r0 = 0
            goto L_0x000b
        L_0x0007:
            int r0 = r0.size()
        L_0x000b:
            if (r1 >= r0) goto L_0x004e
            android.util.SparseArray<a.j.a.c> r2 = r9.f868f
            java.lang.Object r2 = r2.valueAt(r1)
            r4 = r2
            a.j.a.c r4 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r4
            if (r4 == 0) goto L_0x004b
            android.view.View r2 = r4.m3208g()
            if (r2 == 0) goto L_0x003e
            int r5 = r4.m3184x()
            android.view.View r2 = r4.m3208g()
            android.view.animation.Animation r3 = r2.getAnimation()
            if (r3 == 0) goto L_0x0032
            r3.cancel()
            r2.clearAnimation()
        L_0x0032:
            r2 = 0
            r4.m3237a(r2)
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r9
            r3.m3103a(r4, r5, r6, r7, r8)
            goto L_0x004b
        L_0x003e:
            android.animation.Animator r2 = r4.m3206h()
            if (r2 == 0) goto L_0x004b
            android.animation.Animator r2 = r4.m3206h()
            r2.end()
        L_0x004b:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x004e:
            return
    }

    /* renamed from: C */
    private void m3112C() {
            r2 = this;
            java.util.ArrayList<a.j.a.i$m> r0 = r2.f861C
            if (r0 == 0) goto L_0x0019
        L_0x0004:
            java.util.ArrayList<a.j.a.i$m> r0 = r2.f861C
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0019
            java.util.ArrayList<a.j.a.i$m> r0 = r2.f861C
            r1 = 0
            java.lang.Object r0 = r0.remove(r1)
            a.j.a.i$m r0 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0281m) r0
            r0.m3000d()
            goto L_0x0004
        L_0x0019:
            return
    }

    /* renamed from: a */
    private int m3074a(java.util.ArrayList<p000a.p036j.p037a.C0244a> r8, java.util.ArrayList<java.lang.Boolean> r9, int r10, int r11, p000a.p013d.C0069b<p000a.p036j.p037a.ComponentCallbacksC0248c> r12) {
            r7 = this;
            int r0 = r11 + (-1)
            r1 = r11
        L_0x0003:
            if (r0 < r10) goto L_0x005a
            java.lang.Object r2 = r8.get(r0)
            a.j.a.a r2 = (p000a.p036j.p037a.C0244a) r2
            java.lang.Object r3 = r9.get(r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            boolean r4 = r2.m3287d()
            r5 = 0
            if (r4 == 0) goto L_0x0026
            int r4 = r0 + 1
            boolean r4 = r2.m3296a(r8, r4, r11)
            if (r4 != 0) goto L_0x0026
            r4 = 1
            goto L_0x0027
        L_0x0026:
            r4 = 0
        L_0x0027:
            if (r4 == 0) goto L_0x0057
            java.util.ArrayList<a.j.a.i$m> r4 = r7.f861C
            if (r4 != 0) goto L_0x0034
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r7.f861C = r4
        L_0x0034:
            a.j.a.i$m r4 = new a.j.a.i$m
            r4.<init>(r2, r3)
            java.util.ArrayList<a.j.a.i$m> r6 = r7.f861C
            r6.add(r4)
            r2.m3299a(r4)
            if (r3 == 0) goto L_0x0047
            r2.m3293b()
            goto L_0x004a
        L_0x0047:
            r2.m3289b(r5)
        L_0x004a:
            int r1 = r1 + (-1)
            if (r0 == r1) goto L_0x0054
            r8.remove(r0)
            r8.add(r1, r2)
        L_0x0054:
            r7.m3107a(r12)
        L_0x0057:
            int r0 = r0 + (-1)
            goto L_0x0003
        L_0x005a:
            return r1
    }

    /* renamed from: a */
    static p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0275g m3091a(android.content.Context r0, float r1, float r2) {
            android.view.animation.AlphaAnimation r0 = new android.view.animation.AlphaAnimation
            r0.<init>(r1, r2)
            android.view.animation.Interpolator r1 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f858I
            r0.setInterpolator(r1)
            r1 = 220(0xdc, double:1.087E-321)
            r0.setDuration(r1)
            a.j.a.i$g r1 = new a.j.a.i$g
            r1.<init>(r0)
            return r1
    }

    /* renamed from: a */
    static p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0275g m3090a(android.content.Context r10, float r11, float r12, float r13, float r14) {
            android.view.animation.AnimationSet r10 = new android.view.animation.AnimationSet
            r0 = 0
            r10.<init>(r0)
            android.view.animation.ScaleAnimation r0 = new android.view.animation.ScaleAnimation
            r6 = 1
            r7 = 1056964608(0x3f000000, float:0.5)
            r8 = 1
            r9 = 1056964608(0x3f000000, float:0.5)
            r1 = r0
            r2 = r11
            r3 = r12
            r4 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            android.view.animation.Interpolator r11 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f857H
            r0.setInterpolator(r11)
            r11 = 220(0xdc, double:1.087E-321)
            r0.setDuration(r11)
            r10.addAnimation(r0)
            android.view.animation.AlphaAnimation r0 = new android.view.animation.AlphaAnimation
            r0.<init>(r13, r14)
            android.view.animation.Interpolator r13 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f858I
            r0.setInterpolator(r13)
            r0.setDuration(r11)
            r10.addAnimation(r0)
            a.j.a.i$g r11 = new a.j.a.i$g
            r11.<init>(r10)
            return r11
    }

    /* renamed from: a */
    private static android.view.animation.Animation.AnimationListener m3081a(android.view.animation.Animation r3) {
            java.lang.String r0 = "FragmentManager"
            java.lang.reflect.Field r1 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f856G     // Catch: IllegalAccessException -> 0x001f, NoSuchFieldException -> 0x0023
            if (r1 != 0) goto L_0x0016
            java.lang.Class<android.view.animation.Animation> r1 = android.view.animation.Animation.class
            java.lang.String r2 = "mListener"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: IllegalAccessException -> 0x001f, NoSuchFieldException -> 0x0023
            p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f856G = r1     // Catch: IllegalAccessException -> 0x001f, NoSuchFieldException -> 0x0023
            java.lang.reflect.Field r1 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f856G     // Catch: IllegalAccessException -> 0x001f, NoSuchFieldException -> 0x0023
            r2 = 1
            r1.setAccessible(r2)     // Catch: IllegalAccessException -> 0x001f, NoSuchFieldException -> 0x0023
        L_0x0016:
            java.lang.reflect.Field r1 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f856G     // Catch: IllegalAccessException -> 0x001f, NoSuchFieldException -> 0x0023
            java.lang.Object r3 = r1.get(r3)     // Catch: IllegalAccessException -> 0x001f, NoSuchFieldException -> 0x0023
            android.view.animation.Animation$AnimationListener r3 = (android.view.animation.Animation.AnimationListener) r3     // Catch: IllegalAccessException -> 0x001f, NoSuchFieldException -> 0x0023
            goto L_0x002a
        L_0x001f:
            r3 = move-exception
            java.lang.String r1 = "Cannot access Animation's mListener field"
            goto L_0x0026
        L_0x0023:
            r3 = move-exception
            java.lang.String r1 = "No field with the name mListener is found in Animation class"
        L_0x0026:
            android.util.Log.e(r0, r1, r3)
            r3 = 0
        L_0x002a:
            return r3
    }

    /* renamed from: a */
    private void m3107a(p000a.p013d.C0069b<p000a.p036j.p037a.ComponentCallbacksC0248c> r11) {
            r10 = this;
            int r0 = r10.f875m
            r1 = 1
            if (r0 >= r1) goto L_0x0006
            return
        L_0x0006:
            r1 = 3
            int r0 = java.lang.Math.min(r0, r1)
            java.util.ArrayList<a.j.a.c> r1 = r10.f867e
            int r1 = r1.size()
            r2 = 0
            r8 = 0
        L_0x0013:
            if (r8 >= r1) goto L_0x0043
            java.util.ArrayList<a.j.a.c> r2 = r10.f867e
            java.lang.Object r2 = r2.get(r8)
            r9 = r2
            a.j.a.c r9 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r9
            int r2 = r9.f789b
            if (r2 >= r0) goto L_0x0040
            int r5 = r9.m3192p()
            int r6 = r9.m3191q()
            r7 = 0
            r2 = r10
            r3 = r9
            r4 = r0
            r2.m3103a(r3, r4, r5, r6, r7)
            android.view.View r2 = r9.f775J
            if (r2 == 0) goto L_0x0040
            boolean r2 = r9.f767B
            if (r2 != 0) goto L_0x0040
            boolean r2 = r9.f780O
            if (r2 == 0) goto L_0x0040
            r11.add(r9)
        L_0x0040:
            int r8 = r8 + 1
            goto L_0x0013
        L_0x0043:
            return
    }

    /* renamed from: a */
    private void m3101a(p000a.p036j.p037a.ComponentCallbacksC0248c r5, p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0275g r6, int r7) {
            r4 = this;
            android.view.View r0 = r5.f775J
            android.view.ViewGroup r1 = r5.f774I
            r1.startViewTransition(r0)
            r5.m3232b(r7)
            android.view.animation.Animation r7 = r6.f904a
            if (r7 == 0) goto L_0x002d
            a.j.a.i$i r2 = new a.j.a.i$i
            r2.<init>(r7, r1, r0)
            android.view.View r7 = r5.f775J
            r5.m3237a(r7)
            android.view.animation.Animation$AnimationListener r7 = m3081a(r2)
            a.j.a.i$b r3 = new a.j.a.i$b
            r3.<init>(r4, r7, r1, r5)
            r2.setAnimationListener(r3)
            m3082a(r0, r6)
            android.view.View r5 = r5.f775J
            r5.startAnimation(r2)
            goto L_0x0047
        L_0x002d:
            android.animation.Animator r7 = r6.f905b
            r5.m3251a(r7)
            a.j.a.i$c r2 = new a.j.a.i$c
            r2.<init>(r4, r1, r0, r5)
            r7.addListener(r2)
            android.view.View r0 = r5.f775J
            r7.setTarget(r0)
            android.view.View r5 = r5.f775J
            m3082a(r5, r6)
            r7.start()
        L_0x0047:
            return
    }

    /* renamed from: a */
    private static void m3093a(p000a.p036j.p037a.C0282j r3) {
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.List r0 = r3.m2997b()
            if (r0 == 0) goto L_0x001d
            java.util.Iterator r0 = r0.iterator()
        L_0x000d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x001d
            java.lang.Object r1 = r0.next()
            a.j.a.c r1 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r1
            r2 = 1
            r1.f770E = r2
            goto L_0x000d
        L_0x001d:
            java.util.List r3 = r3.m2998a()
            if (r3 == 0) goto L_0x0037
            java.util.Iterator r3 = r3.iterator()
        L_0x0027:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0037
            java.lang.Object r0 = r3.next()
            a.j.a.j r0 = (p000a.p036j.p037a.C0282j) r0
            m3093a(r0)
            goto L_0x0027
        L_0x0037:
            return
    }

    /* renamed from: a */
    private static void m3082a(android.view.View r3, p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0275g r4) {
            if (r3 == 0) goto L_0x002d
            if (r4 != 0) goto L_0x0005
            goto L_0x002d
        L_0x0005:
            boolean r0 = m3060b(r3, r4)
            if (r0 == 0) goto L_0x002d
            android.animation.Animator r0 = r4.f905b
            if (r0 == 0) goto L_0x0018
            a.j.a.i$h r4 = new a.j.a.i$h
            r4.<init>(r3)
            r0.addListener(r4)
            goto L_0x002d
        L_0x0018:
            android.view.animation.Animation r0 = r4.f904a
            android.view.animation.Animation$AnimationListener r0 = m3081a(r0)
            r1 = 2
            r2 = 0
            r3.setLayerType(r1, r2)
            android.view.animation.Animation r4 = r4.f904a
            a.j.a.i$e r1 = new a.j.a.i$e
            r1.<init>(r3, r0)
            r4.setAnimationListener(r1)
        L_0x002d:
            return
    }

    /* renamed from: a */
    private void m3080a(java.lang.RuntimeException r8) {
            r7 = this;
            java.lang.String r0 = r8.getMessage()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.e(r1, r0)
            java.lang.String r0 = "Activity state:"
            android.util.Log.e(r1, r0)
            a.g.k.b r0 = new a.g.k.b
            r0.<init>(r1)
            java.io.PrintWriter r2 = new java.io.PrintWriter
            r2.<init>(r0)
            a.j.a.g r0 = r7.f876n
            java.lang.String r3 = "Failed dumping state"
            r4 = 0
            r5 = 0
            java.lang.String r6 = "  "
            if (r0 == 0) goto L_0x0028
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: Exception -> 0x002e
            r0.mo3139a(r6, r5, r2, r4)     // Catch: Exception -> 0x002e
            goto L_0x0032
        L_0x0028:
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch: Exception -> 0x002e
            r7.mo3077a(r6, r5, r2, r0)     // Catch: Exception -> 0x002e
            goto L_0x0032
        L_0x002e:
            r0 = move-exception
            android.util.Log.e(r1, r3, r0)
        L_0x0032:
            throw r8
    }

    /* renamed from: a */
    private void m3076a(java.util.ArrayList<p000a.p036j.p037a.C0244a> r8, java.util.ArrayList<java.lang.Boolean> r9) {
            r7 = this;
            java.util.ArrayList<a.j.a.i$m> r0 = r7.f861C
            r1 = 0
            if (r0 != 0) goto L_0x0007
            r0 = 0
            goto L_0x000b
        L_0x0007:
            int r0 = r0.size()
        L_0x000b:
            r2 = r0
            r0 = 0
        L_0x000d:
            if (r0 >= r2) goto L_0x0074
            java.util.ArrayList<a.j.a.i$m> r3 = r7.f861C
            java.lang.Object r3 = r3.get(r0)
            a.j.a.i$m r3 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0281m) r3
            r4 = -1
            if (r8 == 0) goto L_0x0036
            boolean r5 = r3.f915a
            if (r5 != 0) goto L_0x0036
            a.j.a.a r5 = r3.f916b
            int r5 = r8.indexOf(r5)
            if (r5 == r4) goto L_0x0036
            java.lang.Object r5 = r9.get(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0036
        L_0x0032:
            r3.m3001c()
            goto L_0x0071
        L_0x0036:
            boolean r5 = r3.m2999e()
            if (r5 != 0) goto L_0x004a
            if (r8 == 0) goto L_0x0071
            a.j.a.a r5 = r3.f916b
            int r6 = r8.size()
            boolean r5 = r5.m3296a(r8, r1, r6)
            if (r5 == 0) goto L_0x0071
        L_0x004a:
            java.util.ArrayList<a.j.a.i$m> r5 = r7.f861C
            r5.remove(r0)
            int r0 = r0 + (-1)
            int r2 = r2 + (-1)
            if (r8 == 0) goto L_0x006e
            boolean r5 = r3.f915a
            if (r5 != 0) goto L_0x006e
            a.j.a.a r5 = r3.f916b
            int r5 = r8.indexOf(r5)
            if (r5 == r4) goto L_0x006e
            java.lang.Object r4 = r9.get(r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x006e
            goto L_0x0032
        L_0x006e:
            r3.m3000d()
        L_0x0071:
            int r0 = r0 + 1
            goto L_0x000d
        L_0x0074:
            return
    }

    /* renamed from: a */
    private static void m3075a(java.util.ArrayList<p000a.p036j.p037a.C0244a> r3, java.util.ArrayList<java.lang.Boolean> r4, int r5, int r6) {
        L_0x0000:
            if (r5 >= r6) goto L_0x002c
            java.lang.Object r0 = r3.get(r5)
            a.j.a.a r0 = (p000a.p036j.p037a.C0244a) r0
            java.lang.Object r1 = r4.get(r5)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 1
            if (r1 == 0) goto L_0x0023
            r1 = -1
            r0.m3303a(r1)
            int r1 = r6 + (-1)
            if (r5 != r1) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r2 = 0
        L_0x001f:
            r0.m3289b(r2)
            goto L_0x0029
        L_0x0023:
            r0.m3303a(r2)
            r0.m3293b()
        L_0x0029:
            int r5 = r5 + 1
            goto L_0x0000
        L_0x002c:
            return
    }

    /* renamed from: a */
    static boolean m3095a(p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0275g r4) {
            android.view.animation.Animation r0 = r4.f904a
            boolean r1 = r0 instanceof android.view.animation.AlphaAnimation
            r2 = 1
            if (r1 == 0) goto L_0x0008
            return r2
        L_0x0008:
            boolean r1 = r0 instanceof android.view.animation.AnimationSet
            if (r1 == 0) goto L_0x0027
            android.view.animation.AnimationSet r0 = (android.view.animation.AnimationSet) r0
            java.util.List r4 = r0.getAnimations()
            r0 = 0
            r1 = 0
        L_0x0014:
            int r3 = r4.size()
            if (r1 >= r3) goto L_0x0026
            java.lang.Object r3 = r4.get(r1)
            boolean r3 = r3 instanceof android.view.animation.AlphaAnimation
            if (r3 == 0) goto L_0x0023
            return r2
        L_0x0023:
            int r1 = r1 + 1
            goto L_0x0014
        L_0x0026:
            return r0
        L_0x0027:
            android.animation.Animator r4 = r4.f905b
            boolean r4 = m3092a(r4)
            return r4
    }

    /* renamed from: a */
    static boolean m3092a(android.animation.Animator r5) {
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof android.animation.ValueAnimator
            r2 = 1
            if (r1 == 0) goto L_0x0025
            android.animation.ValueAnimator r5 = (android.animation.ValueAnimator) r5
            android.animation.PropertyValuesHolder[] r5 = r5.getValues()
            r1 = 0
        L_0x0010:
            int r3 = r5.length
            if (r1 >= r3) goto L_0x0046
            r3 = r5[r1]
            java.lang.String r3 = r3.getPropertyName()
            java.lang.String r4 = "alpha"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0022
            return r2
        L_0x0022:
            int r1 = r1 + 1
            goto L_0x0010
        L_0x0025:
            boolean r1 = r5 instanceof android.animation.AnimatorSet
            if (r1 == 0) goto L_0x0046
            android.animation.AnimatorSet r5 = (android.animation.AnimatorSet) r5
            java.util.ArrayList r5 = r5.getChildAnimations()
            r1 = 0
        L_0x0030:
            int r3 = r5.size()
            if (r1 >= r3) goto L_0x0046
            java.lang.Object r3 = r5.get(r1)
            android.animation.Animator r3 = (android.animation.Animator) r3
            boolean r3 = m3092a(r3)
            if (r3 == 0) goto L_0x0043
            return r2
        L_0x0043:
            int r1 = r1 + 1
            goto L_0x0030
        L_0x0046:
            return r0
    }

    /* renamed from: a */
    private boolean m3078a(java.lang.String r9, int r10, int r11) {
            r8 = this;
            r8.m3018o()
            r0 = 1
            r8.m3049c(r0)
            a.j.a.c r1 = r8.f879q
            if (r1 == 0) goto L_0x001c
            if (r10 >= 0) goto L_0x001c
            if (r9 != 0) goto L_0x001c
            a.j.a.h r1 = r1.m3271O()
            if (r1 == 0) goto L_0x001c
            boolean r1 = r1.mo3048d()
            if (r1 == 0) goto L_0x001c
            return r0
        L_0x001c:
            java.util.ArrayList<a.j.a.a> r3 = r8.f886x
            java.util.ArrayList<java.lang.Boolean> r4 = r8.f887y
            r2 = r8
            r5 = r9
            r6 = r10
            r7 = r11
            boolean r9 = r2.m3073a(r3, r4, r5, r6, r7)
            if (r9 == 0) goto L_0x003c
            r8.f865c = r0
            java.util.ArrayList<a.j.a.a> r10 = r8.f886x     // Catch: all -> 0x0037
            java.util.ArrayList<java.lang.Boolean> r11 = r8.f887y     // Catch: all -> 0x0037
            r8.m3050c(r10, r11)     // Catch: all -> 0x0037
            r8.m3114A()
            goto L_0x003c
        L_0x0037:
            r9 = move-exception
            r8.m3114A()
            throw r9
        L_0x003c:
            r8.m3020n()
            r8.m3006y()
            return r9
    }

    /* renamed from: b */
    public static int m3069b(int r1, boolean r2) {
            r0 = 4097(0x1001, float:5.741E-42)
            if (r1 == r0) goto L_0x001a
            r0 = 4099(0x1003, float:5.744E-42)
            if (r1 == r0) goto L_0x0014
            r0 = 8194(0x2002, float:1.1482E-41)
            if (r1 == r0) goto L_0x000e
            r1 = -1
            goto L_0x001f
        L_0x000e:
            if (r2 == 0) goto L_0x0012
            r1 = 3
            goto L_0x001f
        L_0x0012:
            r1 = 4
            goto L_0x001f
        L_0x0014:
            if (r2 == 0) goto L_0x0018
            r1 = 5
            goto L_0x001f
        L_0x0018:
            r1 = 6
            goto L_0x001f
        L_0x001a:
            if (r2 == 0) goto L_0x001e
            r1 = 1
            goto L_0x001f
        L_0x001e:
            r1 = 2
        L_0x001f:
            return r1
    }

    /* renamed from: b */
    private void m3068b(p000a.p013d.C0069b<p000a.p036j.p037a.ComponentCallbacksC0248c> r6) {
            r5 = this;
            int r0 = r6.size()
            r1 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x0022
            java.lang.Object r2 = r6.m4070c(r1)
            a.j.a.c r2 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r2
            boolean r3 = r2.f799l
            if (r3 != 0) goto L_0x001f
            android.view.View r3 = r2.m3183y()
            float r4 = r3.getAlpha()
            r2.f782Q = r4
            r2 = 0
            r3.setAlpha(r2)
        L_0x001f:
            int r1 = r1 + 1
            goto L_0x0005
        L_0x0022:
            return
    }

    /* renamed from: b */
    private void m3057b(java.util.ArrayList<p000a.p036j.p037a.C0244a> r16, java.util.ArrayList<java.lang.Boolean> r17, int r18, int r19) {
            r15 = this;
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            java.lang.Object r0 = r7.get(r9)
            a.j.a.a r0 = (p000a.p036j.p037a.C0244a) r0
            boolean r11 = r0.f744s
            java.util.ArrayList<a.j.a.c> r0 = r6.f888z
            if (r0 != 0) goto L_0x001d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.f888z = r0
            goto L_0x0020
        L_0x001d:
            r0.clear()
        L_0x0020:
            java.util.ArrayList<a.j.a.c> r0 = r6.f888z
            java.util.ArrayList<a.j.a.c> r1 = r6.f867e
            r0.addAll(r1)
            a.j.a.c r0 = r15.m3014q()
            r1 = 0
            r2 = r0
            r0 = r9
            r12 = 0
        L_0x002f:
            r13 = 1
            if (r0 >= r10) goto L_0x005e
            java.lang.Object r3 = r7.get(r0)
            a.j.a.a r3 = (p000a.p036j.p037a.C0244a) r3
            java.lang.Object r4 = r8.get(r0)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x004b
            java.util.ArrayList<a.j.a.c> r4 = r6.f888z
            a.j.a.c r2 = r3.m3295a(r4, r2)
            goto L_0x0051
        L_0x004b:
            java.util.ArrayList<a.j.a.c> r4 = r6.f888z
            a.j.a.c r2 = r3.m3290b(r4, r2)
        L_0x0051:
            if (r12 != 0) goto L_0x005a
            boolean r3 = r3.f734i
            if (r3 == 0) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            r12 = 0
            goto L_0x005b
        L_0x005a:
            r12 = 1
        L_0x005b:
            int r0 = r0 + 1
            goto L_0x002f
        L_0x005e:
            java.util.ArrayList<a.j.a.c> r0 = r6.f888z
            r0.clear()
            if (r11 != 0) goto L_0x0072
            r5 = 0
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            p000a.p036j.p037a.C0288n.m2982a(r0, r1, r2, r3, r4, r5)
        L_0x0072:
            m3075a(r16, r17, r18, r19)
            if (r11 == 0) goto L_0x0092
            a.d.b r14 = new a.d.b
            r14.<init>()
            r15.m3107a(r14)
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r14
            int r0 = r0.m3074a(r1, r2, r3, r4, r5)
            r15.m3068b(r14)
            r4 = r0
            goto L_0x0093
        L_0x0092:
            r4 = r10
        L_0x0093:
            if (r4 == r9) goto L_0x00a7
            if (r11 == 0) goto L_0x00a7
            r5 = 1
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            p000a.p036j.p037a.C0288n.m2982a(r0, r1, r2, r3, r4, r5)
            int r0 = r6.f875m
            r15.m3108a(r0, r13)
        L_0x00a7:
            if (r9 >= r10) goto L_0x00cb
            java.lang.Object r0 = r7.get(r9)
            a.j.a.a r0 = (p000a.p036j.p037a.C0244a) r0
            java.lang.Object r1 = r8.get(r9)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00c5
            int r1 = r0.f737l
            if (r1 < 0) goto L_0x00c5
            r15.m3070b(r1)
            r1 = -1
            r0.f737l = r1
        L_0x00c5:
            r0.m3286e()
            int r9 = r9 + 1
            goto L_0x00a7
        L_0x00cb:
            if (r12 == 0) goto L_0x00d0
            r15.m3012s()
        L_0x00d0:
            return
    }

    /* renamed from: b */
    static boolean m3060b(android.view.View r3, p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0275g r4) {
            r0 = 0
            if (r3 == 0) goto L_0x001f
            if (r4 != 0) goto L_0x0006
            goto L_0x001f
        L_0x0006:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 19
            if (r1 < r2) goto L_0x001f
            int r1 = r3.getLayerType()
            if (r1 != 0) goto L_0x001f
            boolean r3 = p000a.p018g.p029l.C0216r.m3400u(r3)
            if (r3 == 0) goto L_0x001f
            boolean r3 = m3095a(r4)
            if (r3 == 0) goto L_0x001f
            r0 = 1
        L_0x001f:
            return r0
    }

    /* renamed from: b */
    private boolean m3058b(java.util.ArrayList<p000a.p036j.p037a.C0244a> r5, java.util.ArrayList<java.lang.Boolean> r6) {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<a.j.a.i$l> r0 = r4.f864b     // Catch: all -> 0x003c
            r1 = 0
            if (r0 == 0) goto L_0x003a
            java.util.ArrayList<a.j.a.i$l> r0 = r4.f864b     // Catch: all -> 0x003c
            int r0 = r0.size()     // Catch: all -> 0x003c
            if (r0 != 0) goto L_0x000f
            goto L_0x003a
        L_0x000f:
            java.util.ArrayList<a.j.a.i$l> r0 = r4.f864b     // Catch: all -> 0x003c
            int r0 = r0.size()     // Catch: all -> 0x003c
            r2 = 0
        L_0x0016:
            if (r1 >= r0) goto L_0x0028
            java.util.ArrayList<a.j.a.i$l> r3 = r4.f864b     // Catch: all -> 0x003c
            java.lang.Object r3 = r3.get(r1)     // Catch: all -> 0x003c
            a.j.a.i$l r3 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i.AbstractC0280l) r3     // Catch: all -> 0x003c
            boolean r3 = r3.mo3004a(r5, r6)     // Catch: all -> 0x003c
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L_0x0016
        L_0x0028:
            java.util.ArrayList<a.j.a.i$l> r5 = r4.f864b     // Catch: all -> 0x003c
            r5.clear()     // Catch: all -> 0x003c
            a.j.a.g r5 = r4.f876n     // Catch: all -> 0x003c
            android.os.Handler r5 = r5.m3134e()     // Catch: all -> 0x003c
            java.lang.Runnable r6 = r4.f863E     // Catch: all -> 0x003c
            r5.removeCallbacks(r6)     // Catch: all -> 0x003c
            monitor-exit(r4)     // Catch: all -> 0x003c
            return r2
        L_0x003a:
            monitor-exit(r4)     // Catch: all -> 0x003c
            return r1
        L_0x003c:
            r5 = move-exception
            monitor-exit(r4)     // Catch: all -> 0x003c
            goto L_0x0040
        L_0x003f:
            throw r5
        L_0x0040:
            goto L_0x003f
    }

    /* renamed from: c */
    private void m3050c(java.util.ArrayList<p000a.p036j.p037a.C0244a> r5, java.util.ArrayList<java.lang.Boolean> r6) {
            r4 = this;
            if (r5 == 0) goto L_0x006e
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0009
            goto L_0x006e
        L_0x0009:
            if (r6 == 0) goto L_0x0066
            int r0 = r5.size()
            int r1 = r6.size()
            if (r0 != r1) goto L_0x0066
            r4.m3076a(r5, r6)
            int r0 = r5.size()
            r1 = 0
            r2 = 0
        L_0x001e:
            if (r1 >= r0) goto L_0x0060
            java.lang.Object r3 = r5.get(r1)
            a.j.a.a r3 = (p000a.p036j.p037a.C0244a) r3
            boolean r3 = r3.f744s
            if (r3 != 0) goto L_0x005d
            if (r2 == r1) goto L_0x002f
            r4.m3057b(r5, r6, r2, r1)
        L_0x002f:
            int r2 = r1 + 1
            java.lang.Object r3 = r6.get(r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0058
        L_0x003d:
            if (r2 >= r0) goto L_0x0058
            java.lang.Object r3 = r6.get(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0058
            java.lang.Object r3 = r5.get(r2)
            a.j.a.a r3 = (p000a.p036j.p037a.C0244a) r3
            boolean r3 = r3.f744s
            if (r3 != 0) goto L_0x0058
            int r2 = r2 + 1
            goto L_0x003d
        L_0x0058:
            r4.m3057b(r5, r6, r1, r2)
            int r1 = r2 + (-1)
        L_0x005d:
            int r1 = r1 + 1
            goto L_0x001e
        L_0x0060:
            if (r2 == r0) goto L_0x0065
            r4.m3057b(r5, r6, r2, r0)
        L_0x0065:
            return
        L_0x0066:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Internal error with the back stack records"
            r5.<init>(r6)
            throw r5
        L_0x006e:
            return
    }

    /* renamed from: c */
    private void m3049c(boolean r3) {
            r2 = this;
            boolean r0 = r2.f865c
            if (r0 != 0) goto L_0x004e
            a.j.a.g r0 = r2.f876n
            if (r0 == 0) goto L_0x0046
            android.os.Looper r0 = android.os.Looper.myLooper()
            a.j.a.g r1 = r2.f876n
            android.os.Handler r1 = r1.m3134e()
            android.os.Looper r1 = r1.getLooper()
            if (r0 != r1) goto L_0x003e
            if (r3 != 0) goto L_0x001d
            r2.m3005z()
        L_0x001d:
            java.util.ArrayList<a.j.a.a> r3 = r2.f886x
            if (r3 != 0) goto L_0x002f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f886x = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f887y = r3
        L_0x002f:
            r3 = 1
            r2.f865c = r3
            r3 = 0
            r0 = 0
            r2.m3076a(r0, r0)     // Catch: all -> 0x003a
            r2.f865c = r3
            return
        L_0x003a:
            r0 = move-exception
            r2.f865c = r3
            throw r0
        L_0x003e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Must be called from main thread of fragment host"
            r3.<init>(r0)
            throw r3
        L_0x0046:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Fragment host has been destroyed"
            r3.<init>(r0)
            throw r3
        L_0x004e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "FragmentManager is already executing transactions"
            r3.<init>(r0)
            throw r3
    }

    /* renamed from: d */
    private void m3047d(int r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.f865c = r0     // Catch: all -> 0x000d
            r2.m3108a(r3, r1)     // Catch: all -> 0x000d
            r2.f865c = r1
            r2.m3018o()
            return
        L_0x000d:
            r3 = move-exception
            r2.f865c = r1
            throw r3
    }

    /* renamed from: e */
    public static int m3042e(int r3) {
            r0 = 8194(0x2002, float:1.1482E-41)
            r1 = 4099(0x1003, float:5.744E-42)
            r2 = 4097(0x1001, float:5.741E-42)
            if (r3 == r2) goto L_0x0013
            if (r3 == r1) goto L_0x0011
            if (r3 == r0) goto L_0x000e
            r0 = 0
            goto L_0x0013
        L_0x000e:
            r0 = 4097(0x1001, float:5.741E-42)
            goto L_0x0013
        L_0x0011:
            r0 = 4099(0x1003, float:5.744E-42)
        L_0x0013:
            return r0
    }

    /* renamed from: p */
    private p000a.p036j.p037a.ComponentCallbacksC0248c m3015p(p000a.p036j.p037a.ComponentCallbacksC0248c r5) {
            r4 = this;
            android.view.ViewGroup r0 = r5.f774I
            android.view.View r1 = r5.f775J
            r2 = 0
            if (r0 == 0) goto L_0x0028
            if (r1 != 0) goto L_0x000a
            goto L_0x0028
        L_0x000a:
            java.util.ArrayList<a.j.a.c> r1 = r4.f867e
            int r5 = r1.indexOf(r5)
            int r5 = r5 + (-1)
        L_0x0012:
            if (r5 < 0) goto L_0x0028
            java.util.ArrayList<a.j.a.c> r1 = r4.f867e
            java.lang.Object r1 = r1.get(r5)
            a.j.a.c r1 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r1
            android.view.ViewGroup r3 = r1.f774I
            if (r3 != r0) goto L_0x0025
            android.view.View r3 = r1.f775J
            if (r3 == 0) goto L_0x0025
            return r1
        L_0x0025:
            int r5 = r5 + (-1)
            goto L_0x0012
        L_0x0028:
            return r2
    }

    /* renamed from: y */
    private void m3006y() {
            r3 = this;
            android.util.SparseArray<a.j.a.c> r0 = r3.f868f
            if (r0 == 0) goto L_0x0020
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L_0x000a:
            if (r0 < 0) goto L_0x0020
            android.util.SparseArray<a.j.a.c> r1 = r3.f868f
            java.lang.Object r1 = r1.valueAt(r0)
            if (r1 != 0) goto L_0x001d
            android.util.SparseArray<a.j.a.c> r1 = r3.f868f
            int r2 = r1.keyAt(r0)
            r1.delete(r2)
        L_0x001d:
            int r0 = r0 + (-1)
            goto L_0x000a
        L_0x0020:
            return
    }

    /* renamed from: z */
    private void m3005z() {
            r3 = this;
            boolean r0 = r3.mo3055c()
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = r3.f884v
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Can not perform this action inside of "
            r1.append(r2)
            java.lang.String r2 = r3.f884v
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0024:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can not perform this action after onSaveInstanceState"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: a */
    public p000a.p036j.p037a.ComponentCallbacksC0248c m3110a(int r4) {
            r3 = this;
            java.util.ArrayList<a.j.a.c> r0 = r3.f867e
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L_0x0008:
            if (r0 < 0) goto L_0x001c
            java.util.ArrayList<a.j.a.c> r1 = r3.f867e
            java.lang.Object r1 = r1.get(r0)
            a.j.a.c r1 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r1
            if (r1 == 0) goto L_0x0019
            int r2 = r1.f812y
            if (r2 != r4) goto L_0x0019
            return r1
        L_0x0019:
            int r0 = r0 + (-1)
            goto L_0x0008
        L_0x001c:
            android.util.SparseArray<a.j.a.c> r0 = r3.f868f
            if (r0 == 0) goto L_0x003a
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L_0x0026:
            if (r0 < 0) goto L_0x003a
            android.util.SparseArray<a.j.a.c> r1 = r3.f868f
            java.lang.Object r1 = r1.valueAt(r0)
            a.j.a.c r1 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r1
            if (r1 == 0) goto L_0x0037
            int r2 = r1.f812y
            if (r2 != r4) goto L_0x0037
            return r1
        L_0x0037:
            int r0 = r0 + (-1)
            goto L_0x0026
        L_0x003a:
            r4 = 0
            return r4
    }

    /* renamed from: a */
    public p000a.p036j.p037a.ComponentCallbacksC0248c m3088a(android.os.Bundle r5, java.lang.String r6) {
            r4 = this;
            r0 = -1
            int r5 = r5.getInt(r6, r0)
            r1 = 0
            if (r5 != r0) goto L_0x0009
            return r1
        L_0x0009:
            android.util.SparseArray<a.j.a.c> r0 = r4.f868f
            java.lang.Object r0 = r0.get(r5)
            a.j.a.c r0 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r0
            if (r0 == 0) goto L_0x0014
            return r0
        L_0x0014:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Fragment no longer exists for key "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = ": index "
            r2.append(r6)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r0.<init>(r5)
            r4.m3080a(r0)
            throw r1
    }

    /* renamed from: a */
    public p000a.p036j.p037a.ComponentCallbacksC0248c m3079a(java.lang.String r4) {
            r3 = this;
            if (r4 == 0) goto L_0x0022
            java.util.ArrayList<a.j.a.c> r0 = r3.f867e
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L_0x000a:
            if (r0 < 0) goto L_0x0022
            java.util.ArrayList<a.j.a.c> r1 = r3.f867e
            java.lang.Object r1 = r1.get(r0)
            a.j.a.c r1 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r1
            if (r1 == 0) goto L_0x001f
            java.lang.String r2 = r1.f766A
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x001f
            return r1
        L_0x001f:
            int r0 = r0 + (-1)
            goto L_0x000a
        L_0x0022:
            android.util.SparseArray<a.j.a.c> r0 = r3.f868f
            if (r0 == 0) goto L_0x0046
            if (r4 == 0) goto L_0x0046
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L_0x002e:
            if (r0 < 0) goto L_0x0046
            android.util.SparseArray<a.j.a.c> r1 = r3.f868f
            java.lang.Object r1 = r1.valueAt(r0)
            a.j.a.c r1 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r1
            if (r1 == 0) goto L_0x0043
            java.lang.String r2 = r1.f766A
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0043
            return r1
        L_0x0043:
            int r0 = r0 + (-1)
            goto L_0x002e
        L_0x0046:
            r4 = 0
            return r4
    }

    /* renamed from: a */
    p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0275g m3102a(p000a.p036j.p037a.ComponentCallbacksC0248c r5, int r6, boolean r7, int r8) {
            r4 = this;
            int r0 = r5.m3192p()
            android.view.animation.Animation r1 = r5.m3255a(r6, r7, r0)
            if (r1 == 0) goto L_0x0010
            a.j.a.i$g r5 = new a.j.a.i$g
            r5.<init>(r1)
            return r5
        L_0x0010:
            android.animation.Animator r5 = r5.m3231b(r6, r7, r0)
            if (r5 == 0) goto L_0x001c
            a.j.a.i$g r6 = new a.j.a.i$g
            r6.<init>(r5)
            return r6
        L_0x001c:
            if (r0 == 0) goto L_0x0077
            a.j.a.g r5 = r4.f876n
            android.content.Context r5 = r5.m3136c()
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r5 = r5.getResourceTypeName(r0)
            java.lang.String r1 = "anim"
            boolean r5 = r1.equals(r5)
            r1 = 0
            if (r5 == 0) goto L_0x004d
            a.j.a.g r2 = r4.f876n     // Catch: RuntimeException -> 0x0049, NotFoundException -> 0x004b
            android.content.Context r2 = r2.m3136c()     // Catch: RuntimeException -> 0x0049, NotFoundException -> 0x004b
            android.view.animation.Animation r2 = android.view.animation.AnimationUtils.loadAnimation(r2, r0)     // Catch: RuntimeException -> 0x0049, NotFoundException -> 0x004b
            if (r2 == 0) goto L_0x0047
            a.j.a.i$g r3 = new a.j.a.i$g     // Catch: RuntimeException -> 0x0049, NotFoundException -> 0x004b
            r3.<init>(r2)     // Catch: RuntimeException -> 0x0049, NotFoundException -> 0x004b
            return r3
        L_0x0047:
            r1 = 1
            goto L_0x004d
        L_0x0049:
            goto L_0x004d
        L_0x004b:
            r5 = move-exception
            throw r5
        L_0x004d:
            if (r1 != 0) goto L_0x0077
            a.j.a.g r1 = r4.f876n     // Catch: RuntimeException -> 0x0061
            android.content.Context r1 = r1.m3136c()     // Catch: RuntimeException -> 0x0061
            android.animation.Animator r1 = android.animation.AnimatorInflater.loadAnimator(r1, r0)     // Catch: RuntimeException -> 0x0061
            if (r1 == 0) goto L_0x0077
            a.j.a.i$g r2 = new a.j.a.i$g     // Catch: RuntimeException -> 0x0061
            r2.<init>(r1)     // Catch: RuntimeException -> 0x0061
            return r2
        L_0x0061:
            r1 = move-exception
            if (r5 != 0) goto L_0x0076
            a.j.a.g r5 = r4.f876n
            android.content.Context r5 = r5.m3136c()
            android.view.animation.Animation r5 = android.view.animation.AnimationUtils.loadAnimation(r5, r0)
            if (r5 == 0) goto L_0x0077
            a.j.a.i$g r6 = new a.j.a.i$g
            r6.<init>(r5)
            return r6
        L_0x0076:
            throw r1
        L_0x0077:
            r5 = 0
            if (r6 != 0) goto L_0x007b
            return r5
        L_0x007b:
            int r6 = m3069b(r6, r7)
            if (r6 >= 0) goto L_0x0082
            return r5
        L_0x0082:
            r7 = 1064933786(0x3f79999a, float:0.975)
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            switch(r6) {
                case 1: goto L_0x00d6;
                case 2: goto L_0x00cb;
                case 3: goto L_0x00c0;
                case 4: goto L_0x00b2;
                case 5: goto L_0x00a7;
                case 6: goto L_0x009c;
                default: goto L_0x008b;
            }
        L_0x008b:
            if (r8 != 0) goto L_0x00e2
            a.j.a.g r6 = r4.f876n
            boolean r6 = r6.mo3131h()
            if (r6 == 0) goto L_0x00e2
            a.j.a.g r6 = r4.f876n
            int r8 = r6.mo3132g()
            goto L_0x00e2
        L_0x009c:
            a.j.a.g r5 = r4.f876n
            android.content.Context r5 = r5.m3136c()
            a.j.a.i$g r5 = m3091a(r5, r1, r0)
            return r5
        L_0x00a7:
            a.j.a.g r5 = r4.f876n
            android.content.Context r5 = r5.m3136c()
            a.j.a.i$g r5 = m3091a(r5, r0, r1)
            return r5
        L_0x00b2:
            a.j.a.g r5 = r4.f876n
            android.content.Context r5 = r5.m3136c()
            r6 = 1065982362(0x3f89999a, float:1.075)
            a.j.a.i$g r5 = m3090a(r5, r1, r6, r1, r0)
            return r5
        L_0x00c0:
            a.j.a.g r5 = r4.f876n
            android.content.Context r5 = r5.m3136c()
            a.j.a.i$g r5 = m3090a(r5, r7, r1, r0, r1)
            return r5
        L_0x00cb:
            a.j.a.g r5 = r4.f876n
            android.content.Context r5 = r5.m3136c()
            a.j.a.i$g r5 = m3090a(r5, r1, r7, r1, r0)
            return r5
        L_0x00d6:
            a.j.a.g r5 = r4.f876n
            android.content.Context r5 = r5.m3136c()
            r6 = 1066401792(0x3f900000, float:1.125)
            a.j.a.i$g r5 = m3090a(r5, r6, r1, r0, r1)
        L_0x00e2:
            return r5
    }

    @Override // p000a.p036j.p037a.AbstractC0262h
    /* renamed from: a */
    public p000a.p036j.p037a.AbstractC0287m mo3111a() {
            r1 = this;
            a.j.a.a r0 = new a.j.a.a
            r0.<init>(r1)
            return r0
    }

    /* renamed from: a */
    public void m3109a(int r5, p000a.p036j.p037a.C0244a r6) {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<a.j.a.a> r0 = r4.f871i     // Catch: all -> 0x009e
            if (r0 != 0) goto L_0x000c
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: all -> 0x009e
            r0.<init>()     // Catch: all -> 0x009e
            r4.f871i = r0     // Catch: all -> 0x009e
        L_0x000c:
            java.util.ArrayList<a.j.a.a> r0 = r4.f871i     // Catch: all -> 0x009e
            int r0 = r0.size()     // Catch: all -> 0x009e
            if (r5 >= r0) goto L_0x003c
            boolean r0 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F     // Catch: all -> 0x009e
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: all -> 0x009e
            r1.<init>()     // Catch: all -> 0x009e
            java.lang.String r2 = "Setting back stack index "
            r1.append(r2)     // Catch: all -> 0x009e
            r1.append(r5)     // Catch: all -> 0x009e
            java.lang.String r2 = " to "
            r1.append(r2)     // Catch: all -> 0x009e
            r1.append(r6)     // Catch: all -> 0x009e
            java.lang.String r1 = r1.toString()     // Catch: all -> 0x009e
            android.util.Log.v(r0, r1)     // Catch: all -> 0x009e
        L_0x0036:
            java.util.ArrayList<a.j.a.a> r0 = r4.f871i     // Catch: all -> 0x009e
            r0.set(r5, r6)     // Catch: all -> 0x009e
            goto L_0x009c
        L_0x003c:
            if (r0 >= r5) goto L_0x0075
            java.util.ArrayList<a.j.a.a> r1 = r4.f871i     // Catch: all -> 0x009e
            r2 = 0
            r1.add(r2)     // Catch: all -> 0x009e
            java.util.ArrayList<java.lang.Integer> r1 = r4.f872j     // Catch: all -> 0x009e
            if (r1 != 0) goto L_0x004f
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: all -> 0x009e
            r1.<init>()     // Catch: all -> 0x009e
            r4.f872j = r1     // Catch: all -> 0x009e
        L_0x004f:
            boolean r1 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F     // Catch: all -> 0x009e
            if (r1 == 0) goto L_0x0069
            java.lang.String r1 = "FragmentManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: all -> 0x009e
            r2.<init>()     // Catch: all -> 0x009e
            java.lang.String r3 = "Adding available back stack index "
            r2.append(r3)     // Catch: all -> 0x009e
            r2.append(r0)     // Catch: all -> 0x009e
            java.lang.String r2 = r2.toString()     // Catch: all -> 0x009e
            android.util.Log.v(r1, r2)     // Catch: all -> 0x009e
        L_0x0069:
            java.util.ArrayList<java.lang.Integer> r1 = r4.f872j     // Catch: all -> 0x009e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: all -> 0x009e
            r1.add(r2)     // Catch: all -> 0x009e
            int r0 = r0 + 1
            goto L_0x003c
        L_0x0075:
            boolean r0 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F     // Catch: all -> 0x009e
            if (r0 == 0) goto L_0x0097
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: all -> 0x009e
            r1.<init>()     // Catch: all -> 0x009e
            java.lang.String r2 = "Adding back stack index "
            r1.append(r2)     // Catch: all -> 0x009e
            r1.append(r5)     // Catch: all -> 0x009e
            java.lang.String r5 = " with "
            r1.append(r5)     // Catch: all -> 0x009e
            r1.append(r6)     // Catch: all -> 0x009e
            java.lang.String r5 = r1.toString()     // Catch: all -> 0x009e
            android.util.Log.v(r0, r5)     // Catch: all -> 0x009e
        L_0x0097:
            java.util.ArrayList<a.j.a.a> r5 = r4.f871i     // Catch: all -> 0x009e
            r5.add(r6)     // Catch: all -> 0x009e
        L_0x009c:
            monitor-exit(r4)     // Catch: all -> 0x009e
            return
        L_0x009e:
            r5 = move-exception
            monitor-exit(r4)     // Catch: all -> 0x009e
            goto L_0x00a2
        L_0x00a1:
            throw r5
        L_0x00a2:
            goto L_0x00a1
    }

    /* renamed from: a */
    void m3108a(int r4, boolean r5) {
            r3 = this;
            a.j.a.g r0 = r3.f876n
            if (r0 != 0) goto L_0x000f
            if (r4 != 0) goto L_0x0007
            goto L_0x000f
        L_0x0007:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "No activity"
            r4.<init>(r5)
            throw r4
        L_0x000f:
            if (r5 != 0) goto L_0x0016
            int r5 = r3.f875m
            if (r4 != r5) goto L_0x0016
            return
        L_0x0016:
            r3.f875m = r4
            android.util.SparseArray<a.j.a.c> r4 = r3.f868f
            if (r4 == 0) goto L_0x006e
            java.util.ArrayList<a.j.a.c> r4 = r3.f867e
            int r4 = r4.size()
            r5 = 0
            r0 = 0
        L_0x0024:
            if (r0 >= r4) goto L_0x0034
            java.util.ArrayList<a.j.a.c> r1 = r3.f867e
            java.lang.Object r1 = r1.get(r0)
            a.j.a.c r1 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r1
            r3.m3032h(r1)
            int r0 = r0 + 1
            goto L_0x0024
        L_0x0034:
            android.util.SparseArray<a.j.a.c> r4 = r3.f868f
            int r4 = r4.size()
            r0 = 0
        L_0x003b:
            if (r0 >= r4) goto L_0x0059
            android.util.SparseArray<a.j.a.c> r1 = r3.f868f
            java.lang.Object r1 = r1.valueAt(r0)
            a.j.a.c r1 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r1
            if (r1 == 0) goto L_0x0056
            boolean r2 = r1.f800m
            if (r2 != 0) goto L_0x004f
            boolean r2 = r1.f768C
            if (r2 == 0) goto L_0x0056
        L_0x004f:
            boolean r2 = r1.f780O
            if (r2 != 0) goto L_0x0056
            r3.m3032h(r1)
        L_0x0056:
            int r0 = r0 + 1
            goto L_0x003b
        L_0x0059:
            r3.m3007x()
            boolean r4 = r3.f880r
            if (r4 == 0) goto L_0x006e
            a.j.a.g r4 = r3.f876n
            if (r4 == 0) goto L_0x006e
            int r0 = r3.f875m
            r1 = 4
            if (r0 != r1) goto L_0x006e
            r4.mo3130i()
            r3.f880r = r5
        L_0x006e:
            return
    }

    /* renamed from: a */
    void m3106a(p000a.p036j.p037a.C0244a r2) {
            r1 = this;
            java.util.ArrayList<a.j.a.a> r0 = r1.f869g
            if (r0 != 0) goto L_0x000b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f869g = r0
        L_0x000b:
            java.util.ArrayList<a.j.a.a> r0 = r1.f869g
            r0.add(r2)
            return
    }

    /* renamed from: a */
    void m3105a(p000a.p036j.p037a.C0244a r8, boolean r9, boolean r10, boolean r11) {
            r7 = this;
            if (r9 == 0) goto L_0x0006
            r8.m3289b(r11)
            goto L_0x0009
        L_0x0006:
            r8.m3293b()
        L_0x0009:
            java.util.ArrayList r1 = new java.util.ArrayList
            r6 = 1
            r1.<init>(r6)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r6)
            r1.add(r8)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r2.add(r9)
            if (r10 == 0) goto L_0x0027
            r3 = 0
            r4 = 1
            r5 = 1
            r0 = r7
            p000a.p036j.p037a.C0288n.m2982a(r0, r1, r2, r3, r4, r5)
        L_0x0027:
            if (r11 == 0) goto L_0x002e
            int r9 = r7.f875m
            r7.m3108a(r9, r6)
        L_0x002e:
            android.util.SparseArray<a.j.a.c> r9 = r7.f868f
            if (r9 == 0) goto L_0x006e
            int r9 = r9.size()
            r10 = 0
            r0 = 0
        L_0x0038:
            if (r0 >= r9) goto L_0x006e
            android.util.SparseArray<a.j.a.c> r1 = r7.f868f
            java.lang.Object r1 = r1.valueAt(r0)
            a.j.a.c r1 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r1
            if (r1 == 0) goto L_0x006b
            android.view.View r2 = r1.f775J
            if (r2 == 0) goto L_0x006b
            boolean r2 = r1.f780O
            if (r2 == 0) goto L_0x006b
            int r2 = r1.f813z
            boolean r2 = r8.m3292b(r2)
            if (r2 == 0) goto L_0x006b
            float r2 = r1.f782Q
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x0060
            android.view.View r4 = r1.f775J
            r4.setAlpha(r2)
        L_0x0060:
            if (r11 == 0) goto L_0x0065
            r1.f782Q = r3
            goto L_0x006b
        L_0x0065:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.f782Q = r2
            r1.f780O = r10
        L_0x006b:
            int r0 = r0 + 1
            goto L_0x0038
        L_0x006e:
            return
    }

    /* renamed from: a */
    public void m3104a(p000a.p036j.p037a.ComponentCallbacksC0248c r4) {
            r3 = this;
            boolean r0 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r0 == 0) goto L_0x001a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "attach: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L_0x001a:
            boolean r0 = r4.f768C
            if (r0 == 0) goto L_0x0078
            r0 = 0
            r4.f768C = r0
            boolean r0 = r4.f799l
            if (r0 != 0) goto L_0x0078
            java.util.ArrayList<a.j.a.c> r0 = r3.f867e
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x0061
            boolean r0 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r0 == 0) goto L_0x0047
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "add from attach: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L_0x0047:
            java.util.ArrayList<a.j.a.c> r0 = r3.f867e
            monitor-enter(r0)
            java.util.ArrayList<a.j.a.c> r1 = r3.f867e     // Catch: all -> 0x005e
            r1.add(r4)     // Catch: all -> 0x005e
            monitor-exit(r0)     // Catch: all -> 0x005e
            r0 = 1
            r4.f799l = r0
            boolean r1 = r4.f771F
            if (r1 == 0) goto L_0x0078
            boolean r4 = r4.f772G
            if (r4 == 0) goto L_0x0078
            r3.f880r = r0
            goto L_0x0078
        L_0x005e:
            r4 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x005e
            throw r4
        L_0x0061:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment already added: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x0078:
            return
    }

    /* renamed from: a */
    void m3103a(p000a.p036j.p037a.ComponentCallbacksC0248c r17, int r18, int r19, int r20, boolean r21) {
            r16 = this;
            r6 = r16
            r7 = r17
            boolean r0 = r7.f799l
            r8 = 1
            if (r0 == 0) goto L_0x0011
            boolean r0 = r7.f768C
            if (r0 == 0) goto L_0x000e
            goto L_0x0011
        L_0x000e:
            r0 = r18
            goto L_0x0016
        L_0x0011:
            r0 = r18
            if (r0 <= r8) goto L_0x0016
            r0 = 1
        L_0x0016:
            boolean r1 = r7.f800m
            if (r1 == 0) goto L_0x002a
            int r1 = r7.f789b
            if (r0 <= r1) goto L_0x002a
            if (r1 != 0) goto L_0x0028
            boolean r0 = r17.m3282C()
            if (r0 == 0) goto L_0x0028
            r0 = 1
            goto L_0x002a
        L_0x0028:
            int r0 = r7.f789b
        L_0x002a:
            boolean r1 = r7.f777L
            r9 = 3
            r10 = 2
            if (r1 == 0) goto L_0x0038
            int r1 = r7.f789b
            if (r1 >= r9) goto L_0x0038
            if (r0 <= r10) goto L_0x0038
            r11 = 2
            goto L_0x0039
        L_0x0038:
            r11 = r0
        L_0x0039:
            int r0 = r7.f789b
            java.lang.String r12 = "FragmentManager"
            r13 = 0
            r14 = 0
            if (r0 > r11) goto L_0x02d8
            boolean r0 = r7.f801n
            if (r0 == 0) goto L_0x004a
            boolean r0 = r7.f802o
            if (r0 != 0) goto L_0x004a
            return
        L_0x004a:
            android.view.View r0 = r17.m3208g()
            if (r0 != 0) goto L_0x0056
            android.animation.Animator r0 = r17.m3206h()
            if (r0 == 0) goto L_0x006a
        L_0x0056:
            r7.m3237a(r14)
            r7.m3251a(r14)
            int r2 = r17.m3184x()
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r16
            r1 = r17
            r0.m3103a(r1, r2, r3, r4, r5)
        L_0x006a:
            int r0 = r7.f789b
            if (r0 == 0) goto L_0x0076
            if (r0 == r8) goto L_0x01a0
            if (r0 == r10) goto L_0x0292
            if (r0 == r9) goto L_0x02b2
            goto L_0x041a
        L_0x0076:
            if (r11 <= 0) goto L_0x01a0
            boolean r0 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r0 == 0) goto L_0x0090
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x0090:
            android.os.Bundle r0 = r7.f790c
            if (r0 == 0) goto L_0x00e3
            a.j.a.g r1 = r6.f876n
            android.content.Context r1 = r1.m3136c()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r7.f790c
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r7.f791d = r0
            android.os.Bundle r0 = r7.f790c
            java.lang.String r1 = "android:target_state"
            a.j.a.c r0 = r6.m3088a(r0, r1)
            r7.f796i = r0
            a.j.a.c r0 = r7.f796i
            if (r0 == 0) goto L_0x00c3
            android.os.Bundle r0 = r7.f790c
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r13)
            r7.f798k = r0
        L_0x00c3:
            java.lang.Boolean r0 = r7.f792e
            if (r0 == 0) goto L_0x00d0
            boolean r0 = r0.booleanValue()
            r7.f778M = r0
            r7.f792e = r14
            goto L_0x00da
        L_0x00d0:
            android.os.Bundle r0 = r7.f790c
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r8)
            r7.f778M = r0
        L_0x00da:
            boolean r0 = r7.f778M
            if (r0 != 0) goto L_0x00e3
            r7.f777L = r8
            if (r11 <= r10) goto L_0x00e3
            r11 = 2
        L_0x00e3:
            a.j.a.g r0 = r6.f876n
            r7.f807t = r0
            a.j.a.c r1 = r6.f878p
            r7.f811x = r1
            if (r1 == 0) goto L_0x00f0
            a.j.a.i r0 = r1.f808u
            goto L_0x00f4
        L_0x00f0:
            a.j.a.i r0 = r0.m3135d()
        L_0x00f4:
            r7.f806s = r0
            a.j.a.c r0 = r7.f796i
            java.lang.String r15 = "Fragment "
            if (r0 == 0) goto L_0x013a
            android.util.SparseArray<a.j.a.c> r1 = r6.f868f
            int r0 = r0.f793f
            java.lang.Object r0 = r1.get(r0)
            a.j.a.c r1 = r7.f796i
            if (r0 != r1) goto L_0x0116
            int r0 = r1.f789b
            if (r0 >= r8) goto L_0x013a
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r16
            r0.m3103a(r1, r2, r3, r4, r5)
            goto L_0x013a
        L_0x0116:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            r1.append(r7)
            java.lang.String r2 = " declared target fragment "
            r1.append(r2)
            a.j.a.c r2 = r7.f796i
            r1.append(r2)
            java.lang.String r2 = " that does not belong to this FragmentManager!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x013a:
            a.j.a.g r0 = r6.f876n
            android.content.Context r0 = r0.m3136c()
            r6.m3065b(r7, r0, r13)
            r7.f773H = r13
            a.j.a.g r0 = r6.f876n
            android.content.Context r0 = r0.m3136c()
            r7.m3248a(r0)
            boolean r0 = r7.f773H
            if (r0 == 0) goto L_0x0186
            a.j.a.c r0 = r7.f811x
            if (r0 != 0) goto L_0x015c
            a.j.a.g r0 = r6.f876n
            r0.mo3141a(r7)
            goto L_0x015f
        L_0x015c:
            r0.m3252a(r7)
        L_0x015f:
            a.j.a.g r0 = r6.f876n
            android.content.Context r0 = r0.m3136c()
            r6.m3100a(r7, r0, r13)
            boolean r0 = r7.f784S
            if (r0 != 0) goto L_0x017c
            android.os.Bundle r0 = r7.f790c
            r6.m3052c(r7, r0, r13)
            android.os.Bundle r0 = r7.f790c
            r7.m3205h(r0)
            android.os.Bundle r0 = r7.f790c
            r6.m3064b(r7, r0, r13)
            goto L_0x0183
        L_0x017c:
            android.os.Bundle r0 = r7.f790c
            r7.m3199k(r0)
            r7.f789b = r8
        L_0x0183:
            r7.f770E = r13
            goto L_0x01a0
        L_0x0186:
            a.j.a.r r0 = new a.j.a.r
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            r1.append(r7)
            java.lang.String r2 = " did not call through to super.onAttach()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01a0:
            r16.m3046d(r17)
            if (r11 <= r8) goto L_0x0292
            boolean r0 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r0 == 0) goto L_0x01bd
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto ACTIVITY_CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x01bd:
            boolean r0 = r7.f801n
            if (r0 != 0) goto L_0x027d
            int r0 = r7.f813z
            if (r0 == 0) goto L_0x0233
            r1 = -1
            if (r0 == r1) goto L_0x0214
            a.j.a.e r1 = r6.f877o
            android.view.View r0 = r1.mo3169a(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x0234
            boolean r1 = r7.f803p
            if (r1 == 0) goto L_0x01d7
            goto L_0x0234
        L_0x01d7:
            android.content.res.Resources r0 = r17.m3188t()     // Catch: NotFoundException -> 0x01e2
            int r1 = r7.f813z     // Catch: NotFoundException -> 0x01e2
            java.lang.String r0 = r0.getResourceName(r1)     // Catch: NotFoundException -> 0x01e2
            goto L_0x01e4
        L_0x01e2:
            java.lang.String r0 = "unknown"
        L_0x01e4:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No view found for id 0x"
            r2.append(r3)
            int r3 = r7.f813z
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") for fragment "
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            r6.m3080a(r1)
            throw r14
        L_0x0214:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r6.m3080a(r0)
            throw r14
        L_0x0233:
            r0 = r14
        L_0x0234:
            r7.f774I = r0
            android.os.Bundle r1 = r7.f790c
            android.view.LayoutInflater r1 = r7.m3203i(r1)
            android.os.Bundle r2 = r7.f790c
            r7.m3229b(r1, r0, r2)
            android.view.View r1 = r7.f775J
            if (r1 == 0) goto L_0x027b
            r7.f776K = r1
            r1.setSaveFromParentEnabled(r13)
            if (r0 == 0) goto L_0x0251
            android.view.View r1 = r7.f775J
            r0.addView(r1)
        L_0x0251:
            boolean r0 = r7.f767B
            if (r0 == 0) goto L_0x025c
            android.view.View r0 = r7.f775J
            r1 = 8
            r0.setVisibility(r1)
        L_0x025c:
            android.view.View r0 = r7.f775J
            android.os.Bundle r1 = r7.f790c
            r7.m3236a(r0, r1)
            android.view.View r0 = r7.f775J
            android.os.Bundle r1 = r7.f790c
            r6.m3098a(r7, r0, r1, r13)
            android.view.View r0 = r7.f775J
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0277
            android.view.ViewGroup r0 = r7.f774I
            if (r0 == 0) goto L_0x0277
            goto L_0x0278
        L_0x0277:
            r8 = 0
        L_0x0278:
            r7.f780O = r8
            goto L_0x027d
        L_0x027b:
            r7.f776K = r14
        L_0x027d:
            android.os.Bundle r0 = r7.f790c
            r7.m3207g(r0)
            android.os.Bundle r0 = r7.f790c
            r6.m3099a(r7, r0, r13)
            android.view.View r0 = r7.f775J
            if (r0 == 0) goto L_0x0290
            android.os.Bundle r0 = r7.f790c
            r7.m3197l(r0)
        L_0x0290:
            r7.f790c = r14
        L_0x0292:
            if (r11 <= r10) goto L_0x02b2
            boolean r0 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r0 == 0) goto L_0x02ac
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto STARTED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x02ac:
            r17.m3264V()
            r6.m3037f(r7, r13)
        L_0x02b2:
            if (r11 <= r9) goto L_0x041a
            boolean r0 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r0 == 0) goto L_0x02cc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto RESUMED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x02cc:
            r17.m3265U()
            r6.m3040e(r7, r13)
            r7.f790c = r14
            r7.f791d = r14
            goto L_0x041a
        L_0x02d8:
            if (r0 <= r11) goto L_0x041a
            if (r0 == r8) goto L_0x03a6
            if (r0 == r10) goto L_0x0325
            if (r0 == r9) goto L_0x0305
            r1 = 4
            if (r0 == r1) goto L_0x02e5
            goto L_0x041a
        L_0x02e5:
            if (r11 >= r1) goto L_0x0305
            boolean r0 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r0 == 0) goto L_0x02ff
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom RESUMED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x02ff:
            r17.m3266T()
            r6.m3044d(r7, r13)
        L_0x0305:
            if (r11 >= r9) goto L_0x0325
            boolean r0 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r0 == 0) goto L_0x031f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom STARTED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x031f:
            r17.m3263W()
            r6.m3034g(r7, r13)
        L_0x0325:
            if (r11 >= r10) goto L_0x03a6
            boolean r0 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r0 == 0) goto L_0x033f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom ACTIVITY_CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x033f:
            android.view.View r0 = r7.f775J
            if (r0 == 0) goto L_0x0352
            a.j.a.g r0 = r6.f876n
            boolean r0 = r0.mo3137b(r7)
            if (r0 == 0) goto L_0x0352
            android.util.SparseArray<android.os.Parcelable> r0 = r7.f791d
            if (r0 != 0) goto L_0x0352
            r16.m3021m(r17)
        L_0x0352:
            r17.m3269Q()
            r6.m3031h(r7, r13)
            android.view.View r0 = r7.f775J
            if (r0 == 0) goto L_0x0397
            android.view.ViewGroup r1 = r7.f774I
            if (r1 == 0) goto L_0x0397
            r1.endViewTransition(r0)
            android.view.View r0 = r7.f775J
            r0.clearAnimation()
            int r0 = r6.f875m
            r1 = 0
            if (r0 <= 0) goto L_0x0388
            boolean r0 = r6.f883u
            if (r0 != 0) goto L_0x0388
            android.view.View r0 = r7.f775J
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0388
            float r0 = r7.f782Q
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0388
            r0 = r19
            r2 = r20
            a.j.a.i$g r0 = r6.m3102a(r7, r0, r13, r2)
            goto L_0x0389
        L_0x0388:
            r0 = r14
        L_0x0389:
            r7.f782Q = r1
            if (r0 == 0) goto L_0x0390
            r6.m3101a(r7, r0, r11)
        L_0x0390:
            android.view.ViewGroup r0 = r7.f774I
            android.view.View r1 = r7.f775J
            r0.removeView(r1)
        L_0x0397:
            r7.f774I = r14
            r7.f775J = r14
            r7.f787V = r14
            androidx.lifecycle.l<androidx.lifecycle.g> r0 = r7.f788W
            r0.mo1360a(r14)
            r7.f776K = r14
            r7.f802o = r13
        L_0x03a6:
            if (r11 >= r8) goto L_0x041a
            boolean r0 = r6.f883u
            if (r0 == 0) goto L_0x03cd
            android.view.View r0 = r17.m3208g()
            if (r0 == 0) goto L_0x03bd
            android.view.View r0 = r17.m3208g()
            r7.m3237a(r14)
            r0.clearAnimation()
            goto L_0x03cd
        L_0x03bd:
            android.animation.Animator r0 = r17.m3206h()
            if (r0 == 0) goto L_0x03cd
            android.animation.Animator r0 = r17.m3206h()
            r7.m3251a(r14)
            r0.cancel()
        L_0x03cd:
            android.view.View r0 = r17.m3208g()
            if (r0 != 0) goto L_0x0416
            android.animation.Animator r0 = r17.m3206h()
            if (r0 == 0) goto L_0x03da
            goto L_0x0416
        L_0x03da:
            boolean r0 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r0 == 0) goto L_0x03f2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x03f2:
            boolean r0 = r7.f770E
            if (r0 != 0) goto L_0x03fd
            r17.m3270P()
            r6.m3063b(r7, r13)
            goto L_0x03ff
        L_0x03fd:
            r7.f789b = r13
        L_0x03ff:
            r17.m3268R()
            r6.m3051c(r7, r13)
            if (r21 != 0) goto L_0x041a
            boolean r0 = r7.f770E
            if (r0 != 0) goto L_0x040f
            r16.m3035g(r17)
            goto L_0x041a
        L_0x040f:
            r7.f807t = r14
            r7.f811x = r14
            r7.f806s = r14
            goto L_0x041a
        L_0x0416:
            r7.m3232b(r11)
            goto L_0x041b
        L_0x041a:
            r8 = r11
        L_0x041b:
            int r0 = r7.f789b
            if (r0 == r8) goto L_0x044c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " not updated inline; "
            r0.append(r1)
            java.lang.String r1 = "expected state "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r7.f789b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r12, r0)
            r7.f789b = r8
        L_0x044c:
            return
    }

    /* renamed from: a */
    void m3100a(p000a.p036j.p037a.ComponentCallbacksC0248c r4, android.content.Context r5, boolean r6) {
            r3 = this;
            a.j.a.c r0 = r3.f878p
            if (r0 == 0) goto L_0x0012
            a.j.a.h r0 = r0.m3193o()
            boolean r1 = r0 instanceof p000a.p036j.p037a.LayoutInflater$Factory2C0266i
            if (r1 == 0) goto L_0x0012
            a.j.a.i r0 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i) r0
            r1 = 1
            r0.m3100a(r4, r5, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<a.j.a.i$j> r0 = r3.f874l
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            a.j.a.i$j r1 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0278j) r1
            if (r6 == 0) goto L_0x002a
            boolean r2 = r1.f913b
            if (r2 == 0) goto L_0x0018
        L_0x002a:
            a.j.a.h$b r1 = r1.f912a
            r1.m3128a(r3, r4, r5)
            goto L_0x0018
        L_0x0030:
            return
    }

    /* renamed from: a */
    void m3099a(p000a.p036j.p037a.ComponentCallbacksC0248c r4, android.os.Bundle r5, boolean r6) {
            r3 = this;
            a.j.a.c r0 = r3.f878p
            if (r0 == 0) goto L_0x0012
            a.j.a.h r0 = r0.m3193o()
            boolean r1 = r0 instanceof p000a.p036j.p037a.LayoutInflater$Factory2C0266i
            if (r1 == 0) goto L_0x0012
            a.j.a.i r0 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i) r0
            r1 = 1
            r0.m3099a(r4, r5, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<a.j.a.i$j> r0 = r3.f874l
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            a.j.a.i$j r1 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0278j) r1
            if (r6 == 0) goto L_0x002a
            boolean r2 = r1.f913b
            if (r2 == 0) goto L_0x0018
        L_0x002a:
            a.j.a.h$b r1 = r1.f912a
            r1.m3127a(r3, r4, r5)
            goto L_0x0018
        L_0x0030:
            return
    }

    /* renamed from: a */
    void m3098a(p000a.p036j.p037a.ComponentCallbacksC0248c r4, android.view.View r5, android.os.Bundle r6, boolean r7) {
            r3 = this;
            a.j.a.c r0 = r3.f878p
            if (r0 == 0) goto L_0x0012
            a.j.a.h r0 = r0.m3193o()
            boolean r1 = r0 instanceof p000a.p036j.p037a.LayoutInflater$Factory2C0266i
            if (r1 == 0) goto L_0x0012
            a.j.a.i r0 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i) r0
            r1 = 1
            r0.m3098a(r4, r5, r6, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<a.j.a.i$j> r0 = r3.f874l
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            a.j.a.i$j r1 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0278j) r1
            if (r7 == 0) goto L_0x002a
            boolean r2 = r1.f913b
            if (r2 == 0) goto L_0x0018
        L_0x002a:
            a.j.a.h$b r1 = r1.f912a
            r1.m3126a(r3, r4, r5, r6)
            goto L_0x0018
        L_0x0030:
            return
    }

    /* renamed from: a */
    public void m3097a(p000a.p036j.p037a.ComponentCallbacksC0248c r4, boolean r5) {
            r3 = this;
            boolean r0 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r0 == 0) goto L_0x001a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "add: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L_0x001a:
            r3.m3038f(r4)
            boolean r0 = r4.f768C
            if (r0 != 0) goto L_0x0068
            java.util.ArrayList<a.j.a.c> r0 = r3.f867e
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x0051
            java.util.ArrayList<a.j.a.c> r0 = r3.f867e
            monitor-enter(r0)
            java.util.ArrayList<a.j.a.c> r1 = r3.f867e     // Catch: all -> 0x004e
            r1.add(r4)     // Catch: all -> 0x004e
            monitor-exit(r0)     // Catch: all -> 0x004e
            r0 = 1
            r4.f799l = r0
            r1 = 0
            r4.f800m = r1
            android.view.View r2 = r4.f775J
            if (r2 != 0) goto L_0x003e
            r4.f781P = r1
        L_0x003e:
            boolean r1 = r4.f771F
            if (r1 == 0) goto L_0x0048
            boolean r1 = r4.f772G
            if (r1 == 0) goto L_0x0048
            r3.f880r = r0
        L_0x0048:
            if (r5 == 0) goto L_0x0068
            r3.m3029i(r4)
            goto L_0x0068
        L_0x004e:
            r4 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x004e
            throw r4
        L_0x0051:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fragment already added: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L_0x0068:
            return
    }

    /* renamed from: a */
    public void m3096a(p000a.p036j.p037a.AbstractC0261g r2, p000a.p036j.p037a.AbstractC0259e r3, p000a.p036j.p037a.ComponentCallbacksC0248c r4) {
            r1 = this;
            a.j.a.g r0 = r1.f876n
            if (r0 != 0) goto L_0x000b
            r1.f876n = r2
            r1.f877o = r3
            r1.f878p = r4
            return
        L_0x000b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Already attached"
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: a */
    public void m3094a(p000a.p036j.p037a.LayoutInflater$Factory2C0266i.AbstractC0280l r2, boolean r3) {
            r1 = this;
            if (r3 != 0) goto L_0x0005
            r1.m3005z()
        L_0x0005:
            monitor-enter(r1)
            boolean r0 = r1.f883u     // Catch: all -> 0x0030
            if (r0 != 0) goto L_0x0024
            a.j.a.g r0 = r1.f876n     // Catch: all -> 0x0030
            if (r0 != 0) goto L_0x000f
            goto L_0x0024
        L_0x000f:
            java.util.ArrayList<a.j.a.i$l> r3 = r1.f864b     // Catch: all -> 0x0030
            if (r3 != 0) goto L_0x001a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: all -> 0x0030
            r3.<init>()     // Catch: all -> 0x0030
            r1.f864b = r3     // Catch: all -> 0x0030
        L_0x001a:
            java.util.ArrayList<a.j.a.i$l> r3 = r1.f864b     // Catch: all -> 0x0030
            r3.add(r2)     // Catch: all -> 0x0030
            r1.m3008w()     // Catch: all -> 0x0030
            monitor-exit(r1)     // Catch: all -> 0x0030
            return
        L_0x0024:
            if (r3 == 0) goto L_0x0028
            monitor-exit(r1)     // Catch: all -> 0x0030
            return
        L_0x0028:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: all -> 0x0030
            java.lang.String r3 = "Activity has been destroyed"
            r2.<init>(r3)     // Catch: all -> 0x0030
            throw r2     // Catch: all -> 0x0030
        L_0x0030:
            r2 = move-exception
            monitor-exit(r1)     // Catch: all -> 0x0030
            throw r2
    }

    /* renamed from: a */
    public void m3089a(android.content.res.Configuration r3) {
            r2 = this;
            r0 = 0
        L_0x0001:
            java.util.ArrayList<a.j.a.c> r1 = r2.f867e
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x0019
            java.util.ArrayList<a.j.a.c> r1 = r2.f867e
            java.lang.Object r1 = r1.get(r0)
            a.j.a.c r1 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r1
            if (r1 == 0) goto L_0x0016
            r1.m3242a(r3)
        L_0x0016:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0019:
            return
    }

    /* renamed from: a */
    public void m3087a(android.os.Bundle r2, java.lang.String r3, p000a.p036j.p037a.ComponentCallbacksC0248c r4) {
            r1 = this;
            int r0 = r4.f793f
            if (r0 < 0) goto L_0x0008
            r2.putInt(r3, r0)
            return
        L_0x0008:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Fragment "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r4 = " is not currently in the FragmentManager"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            r1.m3080a(r2)
            r2 = 0
            throw r2
    }

    /* renamed from: a */
    void m3086a(android.os.Parcelable r14, p000a.p036j.p037a.C0282j r15) {
            r13 = this;
            if (r14 != 0) goto L_0x0003
            return
        L_0x0003:
            a.j.a.k r14 = (p000a.p036j.p037a.C0283k) r14
            a.j.a.l[] r0 = r14.f921b
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            r0 = 0
            r1 = 0
            if (r15 == 0) goto L_0x00a7
            java.util.List r2 = r15.m2997b()
            java.util.List r3 = r15.m2998a()
            java.util.List r4 = r15.m2996c()
            if (r2 == 0) goto L_0x0021
            int r5 = r2.size()
            goto L_0x0022
        L_0x0021:
            r5 = 0
        L_0x0022:
            r6 = 0
        L_0x0023:
            if (r6 >= r5) goto L_0x00a9
            java.lang.Object r7 = r2.get(r6)
            a.j.a.c r7 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r7
            boolean r8 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r8 == 0) goto L_0x0045
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "restoreAllState: re-attaching retained "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "FragmentManager"
            android.util.Log.v(r9, r8)
        L_0x0045:
            r8 = 0
        L_0x0046:
            a.j.a.l[] r9 = r14.f921b
            int r10 = r9.length
            if (r8 >= r10) goto L_0x0056
            r9 = r9[r8]
            int r9 = r9.f927c
            int r10 = r7.f793f
            if (r9 == r10) goto L_0x0056
            int r8 = r8 + 1
            goto L_0x0046
        L_0x0056:
            a.j.a.l[] r9 = r14.f921b
            int r10 = r9.length
            if (r8 == r10) goto L_0x008b
            r8 = r9[r8]
            r8.f937m = r7
            r7.f791d = r0
            r7.f805r = r1
            r7.f802o = r1
            r7.f799l = r1
            r7.f796i = r0
            android.os.Bundle r9 = r8.f936l
            if (r9 == 0) goto L_0x0088
            a.j.a.g r10 = r13.f876n
            android.content.Context r10 = r10.m3136c()
            java.lang.ClassLoader r10 = r10.getClassLoader()
            r9.setClassLoader(r10)
            android.os.Bundle r9 = r8.f936l
            java.lang.String r10 = "android:view_state"
            android.util.SparseArray r9 = r9.getSparseParcelableArray(r10)
            r7.f791d = r9
            android.os.Bundle r8 = r8.f936l
            r7.f790c = r8
        L_0x0088:
            int r6 = r6 + 1
            goto L_0x0023
        L_0x008b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r1 = "Could not find active fragment with index "
            r15.append(r1)
            int r1 = r7.f793f
            r15.append(r1)
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            r13.m3080a(r14)
            throw r0
        L_0x00a7:
            r3 = r0
            r4 = r3
        L_0x00a9:
            android.util.SparseArray r2 = new android.util.SparseArray
            a.j.a.l[] r5 = r14.f921b
            int r5 = r5.length
            r2.<init>(r5)
            r13.f868f = r2
            r2 = 0
        L_0x00b4:
            a.j.a.l[] r5 = r14.f921b
            int r6 = r5.length
            if (r2 >= r6) goto L_0x0118
            r5 = r5[r2]
            if (r5 == 0) goto L_0x0115
            if (r3 == 0) goto L_0x00cd
            int r6 = r3.size()
            if (r2 >= r6) goto L_0x00cd
            java.lang.Object r6 = r3.get(r2)
            a.j.a.j r6 = (p000a.p036j.p037a.C0282j) r6
            r11 = r6
            goto L_0x00ce
        L_0x00cd:
            r11 = r0
        L_0x00ce:
            if (r4 == 0) goto L_0x00de
            int r6 = r4.size()
            if (r2 >= r6) goto L_0x00de
            java.lang.Object r6 = r4.get(r2)
            androidx.lifecycle.r r6 = (androidx.lifecycle.C0761r) r6
            r12 = r6
            goto L_0x00df
        L_0x00de:
            r12 = r0
        L_0x00df:
            a.j.a.g r8 = r13.f876n
            a.j.a.e r9 = r13.f877o
            a.j.a.c r10 = r13.f878p
            r7 = r5
            a.j.a.c r6 = r7.m2995a(r8, r9, r10, r11, r12)
            boolean r7 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r7 == 0) goto L_0x010c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "restoreAllState: active #"
            r7.append(r8)
            r7.append(r2)
            java.lang.String r8 = ": "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "FragmentManager"
            android.util.Log.v(r8, r7)
        L_0x010c:
            android.util.SparseArray<a.j.a.c> r7 = r13.f868f
            int r8 = r6.f793f
            r7.put(r8, r6)
            r5.f937m = r0
        L_0x0115:
            int r2 = r2 + 1
            goto L_0x00b4
        L_0x0118:
            if (r15 == 0) goto L_0x0164
            java.util.List r15 = r15.m2997b()
            if (r15 == 0) goto L_0x0125
            int r2 = r15.size()
            goto L_0x0126
        L_0x0125:
            r2 = 0
        L_0x0126:
            r3 = 0
        L_0x0127:
            if (r3 >= r2) goto L_0x0164
            java.lang.Object r4 = r15.get(r3)
            a.j.a.c r4 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r4
            int r5 = r4.f797j
            if (r5 < 0) goto L_0x0161
            android.util.SparseArray<a.j.a.c> r6 = r13.f868f
            java.lang.Object r5 = r6.get(r5)
            a.j.a.c r5 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r5
            r4.f796i = r5
            a.j.a.c r5 = r4.f796i
            if (r5 != 0) goto L_0x0161
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Re-attaching retained fragment "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r6 = " target no longer exists: "
            r5.append(r6)
            int r4 = r4.f797j
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "FragmentManager"
            android.util.Log.w(r5, r4)
        L_0x0161:
            int r3 = r3 + 1
            goto L_0x0127
        L_0x0164:
            java.util.ArrayList<a.j.a.c> r15 = r13.f867e
            r15.clear()
            int[] r15 = r14.f922c
            if (r15 == 0) goto L_0x01e1
            r15 = 0
        L_0x016e:
            int[] r2 = r14.f922c
            int r3 = r2.length
            if (r15 >= r3) goto L_0x01e1
            android.util.SparseArray<a.j.a.c> r3 = r13.f868f
            r2 = r2[r15]
            java.lang.Object r2 = r3.get(r2)
            a.j.a.c r2 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r2
            if (r2 == 0) goto L_0x01c3
            r3 = 1
            r2.f799l = r3
            boolean r3 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r3 == 0) goto L_0x01a4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "restoreAllState: added #"
            r3.append(r4)
            r3.append(r15)
            java.lang.String r4 = ": "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "FragmentManager"
            android.util.Log.v(r4, r3)
        L_0x01a4:
            java.util.ArrayList<a.j.a.c> r3 = r13.f867e
            boolean r3 = r3.contains(r2)
            if (r3 != 0) goto L_0x01bb
            java.util.ArrayList<a.j.a.c> r3 = r13.f867e
            monitor-enter(r3)
            java.util.ArrayList<a.j.a.c> r4 = r13.f867e     // Catch: all -> 0x01b8
            r4.add(r2)     // Catch: all -> 0x01b8
            monitor-exit(r3)     // Catch: all -> 0x01b8
            int r15 = r15 + 1
            goto L_0x016e
        L_0x01b8:
            r14 = move-exception
            monitor-exit(r3)     // Catch: all -> 0x01b8
            throw r14
        L_0x01bb:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "Already added!"
            r14.<init>(r15)
            throw r14
        L_0x01c3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No instantiated fragment for index #"
            r2.append(r3)
            int[] r14 = r14.f922c
            r14 = r14[r15]
            r2.append(r14)
            java.lang.String r14 = r2.toString()
            r1.<init>(r14)
            r13.m3080a(r1)
            throw r0
        L_0x01e1:
            a.j.a.b[] r15 = r14.f923d
            if (r15 == 0) goto L_0x0248
            java.util.ArrayList r0 = new java.util.ArrayList
            int r15 = r15.length
            r0.<init>(r15)
            r13.f869g = r0
            r15 = 0
        L_0x01ee:
            a.j.a.b[] r0 = r14.f923d
            int r2 = r0.length
            if (r15 >= r2) goto L_0x024a
            r0 = r0[r15]
            a.j.a.a r0 = r0.m3285a(r13)
            boolean r2 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r2 == 0) goto L_0x0239
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "restoreAllState: back stack #"
            r2.append(r3)
            r2.append(r15)
            java.lang.String r3 = " (index "
            r2.append(r3)
            int r3 = r0.f737l
            r2.append(r3)
            java.lang.String r3 = "): "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r2)
            a.g.k.b r2 = new a.g.k.b
            java.lang.String r3 = "FragmentManager"
            r2.<init>(r3)
            java.io.PrintWriter r3 = new java.io.PrintWriter
            r3.<init>(r2)
            java.lang.String r2 = "  "
            r0.m3297a(r2, r3, r1)
            r3.close()
        L_0x0239:
            java.util.ArrayList<a.j.a.a> r2 = r13.f869g
            r2.add(r0)
            int r2 = r0.f737l
            if (r2 < 0) goto L_0x0245
            r13.m3109a(r2, r0)
        L_0x0245:
            int r15 = r15 + 1
            goto L_0x01ee
        L_0x0248:
            r13.f869g = r0
        L_0x024a:
            int r15 = r14.f924e
            if (r15 < 0) goto L_0x0258
            android.util.SparseArray<a.j.a.c> r0 = r13.f868f
            java.lang.Object r15 = r0.get(r15)
            a.j.a.c r15 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r15
            r13.f879q = r15
        L_0x0258:
            int r14 = r14.f925f
            r13.f866d = r14
            return
    }

    /* renamed from: a */
    public void m3085a(android.view.Menu r3) {
            r2 = this;
            int r0 = r2.f875m
            r1 = 1
            if (r0 >= r1) goto L_0x0006
            return
        L_0x0006:
            r0 = 0
        L_0x0007:
            java.util.ArrayList<a.j.a.c> r1 = r2.f867e
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x001f
            java.util.ArrayList<a.j.a.c> r1 = r2.f867e
            java.lang.Object r1 = r1.get(r0)
            a.j.a.c r1 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r1
            if (r1 == 0) goto L_0x001c
            r1.m3222c(r3)
        L_0x001c:
            int r0 = r0 + 1
            goto L_0x0007
        L_0x001f:
            return
    }

    @Override // p000a.p036j.p037a.AbstractC0262h
    /* renamed from: a */
    public void mo3077a(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r1 = "    "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.SparseArray<a.j.a.c> r1 = r6.f868f
            r2 = 0
            if (r1 == 0) goto L_0x005a
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x005a
            r9.print(r7)
            java.lang.String r3 = "Active Fragments in "
            r9.print(r3)
            int r3 = java.lang.System.identityHashCode(r6)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r9.print(r3)
            java.lang.String r3 = ":"
            r9.println(r3)
            r3 = 0
        L_0x0035:
            if (r3 >= r1) goto L_0x005a
            android.util.SparseArray<a.j.a.c> r4 = r6.f868f
            java.lang.Object r4 = r4.valueAt(r3)
            a.j.a.c r4 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r4
            r9.print(r7)
            java.lang.String r5 = "  #"
            r9.print(r5)
            r9.print(r3)
            java.lang.String r5 = ": "
            r9.print(r5)
            r9.println(r4)
            if (r4 == 0) goto L_0x0057
            r4.m3234a(r0, r8, r9, r10)
        L_0x0057:
            int r3 = r3 + 1
            goto L_0x0035
        L_0x005a:
            java.util.ArrayList<a.j.a.c> r1 = r6.f867e
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x008f
            r9.print(r7)
            java.lang.String r3 = "Added Fragments:"
            r9.println(r3)
            r3 = 0
        L_0x006b:
            if (r3 >= r1) goto L_0x008f
            java.util.ArrayList<a.j.a.c> r4 = r6.f867e
            java.lang.Object r4 = r4.get(r3)
            a.j.a.c r4 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r4
            r9.print(r7)
            java.lang.String r5 = "  #"
            r9.print(r5)
            r9.print(r3)
            java.lang.String r5 = ": "
            r9.print(r5)
            java.lang.String r4 = r4.toString()
            r9.println(r4)
            int r3 = r3 + 1
            goto L_0x006b
        L_0x008f:
            java.util.ArrayList<a.j.a.c> r1 = r6.f870h
            if (r1 == 0) goto L_0x00c6
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00c6
            r9.print(r7)
            java.lang.String r3 = "Fragments Created Menus:"
            r9.println(r3)
            r3 = 0
        L_0x00a2:
            if (r3 >= r1) goto L_0x00c6
            java.util.ArrayList<a.j.a.c> r4 = r6.f870h
            java.lang.Object r4 = r4.get(r3)
            a.j.a.c r4 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r4
            r9.print(r7)
            java.lang.String r5 = "  #"
            r9.print(r5)
            r9.print(r3)
            java.lang.String r5 = ": "
            r9.print(r5)
            java.lang.String r4 = r4.toString()
            r9.println(r4)
            int r3 = r3 + 1
            goto L_0x00a2
        L_0x00c6:
            java.util.ArrayList<a.j.a.a> r1 = r6.f869g
            if (r1 == 0) goto L_0x0100
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0100
            r9.print(r7)
            java.lang.String r3 = "Back Stack:"
            r9.println(r3)
            r3 = 0
        L_0x00d9:
            if (r3 >= r1) goto L_0x0100
            java.util.ArrayList<a.j.a.a> r4 = r6.f869g
            java.lang.Object r4 = r4.get(r3)
            a.j.a.a r4 = (p000a.p036j.p037a.C0244a) r4
            r9.print(r7)
            java.lang.String r5 = "  #"
            r9.print(r5)
            r9.print(r3)
            java.lang.String r5 = ": "
            r9.print(r5)
            java.lang.String r5 = r4.toString()
            r9.println(r5)
            r4.m3298a(r0, r8, r9, r10)
            int r3 = r3 + 1
            goto L_0x00d9
        L_0x0100:
            monitor-enter(r6)
            java.util.ArrayList<a.j.a.a> r8 = r6.f871i     // Catch: all -> 0x020b
            if (r8 == 0) goto L_0x0136
            java.util.ArrayList<a.j.a.a> r8 = r6.f871i     // Catch: all -> 0x020b
            int r8 = r8.size()     // Catch: all -> 0x020b
            if (r8 <= 0) goto L_0x0136
            r9.print(r7)     // Catch: all -> 0x020b
            java.lang.String r10 = "Back Stack Indices:"
            r9.println(r10)     // Catch: all -> 0x020b
            r10 = 0
        L_0x0116:
            if (r10 >= r8) goto L_0x0136
            java.util.ArrayList<a.j.a.a> r0 = r6.f871i     // Catch: all -> 0x020b
            java.lang.Object r0 = r0.get(r10)     // Catch: all -> 0x020b
            a.j.a.a r0 = (p000a.p036j.p037a.C0244a) r0     // Catch: all -> 0x020b
            r9.print(r7)     // Catch: all -> 0x020b
            java.lang.String r1 = "  #"
            r9.print(r1)     // Catch: all -> 0x020b
            r9.print(r10)     // Catch: all -> 0x020b
            java.lang.String r1 = ": "
            r9.print(r1)     // Catch: all -> 0x020b
            r9.println(r0)     // Catch: all -> 0x020b
            int r10 = r10 + 1
            goto L_0x0116
        L_0x0136:
            java.util.ArrayList<java.lang.Integer> r8 = r6.f872j     // Catch: all -> 0x020b
            if (r8 == 0) goto L_0x0157
            java.util.ArrayList<java.lang.Integer> r8 = r6.f872j     // Catch: all -> 0x020b
            int r8 = r8.size()     // Catch: all -> 0x020b
            if (r8 <= 0) goto L_0x0157
            r9.print(r7)     // Catch: all -> 0x020b
            java.lang.String r8 = "mAvailBackStackIndices: "
            r9.print(r8)     // Catch: all -> 0x020b
            java.util.ArrayList<java.lang.Integer> r8 = r6.f872j     // Catch: all -> 0x020b
            java.lang.Object[] r8 = r8.toArray()     // Catch: all -> 0x020b
            java.lang.String r8 = java.util.Arrays.toString(r8)     // Catch: all -> 0x020b
            r9.println(r8)     // Catch: all -> 0x020b
        L_0x0157:
            monitor-exit(r6)     // Catch: all -> 0x020b
            java.util.ArrayList<a.j.a.i$l> r8 = r6.f864b
            if (r8 == 0) goto L_0x018a
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x018a
            r9.print(r7)
            java.lang.String r10 = "Pending Actions:"
            r9.println(r10)
        L_0x016a:
            if (r2 >= r8) goto L_0x018a
            java.util.ArrayList<a.j.a.i$l> r10 = r6.f864b
            java.lang.Object r10 = r10.get(r2)
            a.j.a.i$l r10 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i.AbstractC0280l) r10
            r9.print(r7)
            java.lang.String r0 = "  #"
            r9.print(r0)
            r9.print(r2)
            java.lang.String r0 = ": "
            r9.print(r0)
            r9.println(r10)
            int r2 = r2 + 1
            goto L_0x016a
        L_0x018a:
            r9.print(r7)
            java.lang.String r8 = "FragmentManager misc state:"
            r9.println(r8)
            r9.print(r7)
            java.lang.String r8 = "  mHost="
            r9.print(r8)
            a.j.a.g r8 = r6.f876n
            r9.println(r8)
            r9.print(r7)
            java.lang.String r8 = "  mContainer="
            r9.print(r8)
            a.j.a.e r8 = r6.f877o
            r9.println(r8)
            a.j.a.c r8 = r6.f878p
            if (r8 == 0) goto L_0x01bd
            r9.print(r7)
            java.lang.String r8 = "  mParent="
            r9.print(r8)
            a.j.a.c r8 = r6.f878p
            r9.println(r8)
        L_0x01bd:
            r9.print(r7)
            java.lang.String r8 = "  mCurState="
            r9.print(r8)
            int r8 = r6.f875m
            r9.print(r8)
            java.lang.String r8 = " mStateSaved="
            r9.print(r8)
            boolean r8 = r6.f881s
            r9.print(r8)
            java.lang.String r8 = " mStopped="
            r9.print(r8)
            boolean r8 = r6.f882t
            r9.print(r8)
            java.lang.String r8 = " mDestroyed="
            r9.print(r8)
            boolean r8 = r6.f883u
            r9.println(r8)
            boolean r8 = r6.f880r
            if (r8 == 0) goto L_0x01f9
            r9.print(r7)
            java.lang.String r8 = "  mNeedMenuInvalidate="
            r9.print(r8)
            boolean r8 = r6.f880r
            r9.println(r8)
        L_0x01f9:
            java.lang.String r8 = r6.f884v
            if (r8 == 0) goto L_0x020a
            r9.print(r7)
            java.lang.String r7 = "  mNoTransactionsBecause="
            r9.print(r7)
            java.lang.String r7 = r6.f884v
            r9.println(r7)
        L_0x020a:
            return
        L_0x020b:
            r7 = move-exception
            monitor-exit(r6)     // Catch: all -> 0x020b
            goto L_0x020f
        L_0x020e:
            throw r7
        L_0x020f:
            goto L_0x020e
    }

    /* renamed from: a */
    public void m3072a(boolean r3) {
            r2 = this;
            java.util.ArrayList<a.j.a.c> r0 = r2.f867e
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L_0x0008:
            if (r0 < 0) goto L_0x001a
            java.util.ArrayList<a.j.a.c> r1 = r2.f867e
            java.lang.Object r1 = r1.get(r0)
            a.j.a.c r1 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r1
            if (r1 == 0) goto L_0x0017
            r1.m3215d(r3)
        L_0x0017:
            int r0 = r0 + (-1)
            goto L_0x0008
        L_0x001a:
            return
    }

    /* renamed from: a */
    public boolean m3084a(android.view.Menu r8, android.view.MenuInflater r9) {
            r7 = this;
            int r0 = r7.f875m
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L_0x0007
            return r1
        L_0x0007:
            r0 = 0
            r3 = r0
            r0 = 0
            r4 = 0
        L_0x000b:
            java.util.ArrayList<a.j.a.c> r5 = r7.f867e
            int r5 = r5.size()
            if (r0 >= r5) goto L_0x0031
            java.util.ArrayList<a.j.a.c> r5 = r7.f867e
            java.lang.Object r5 = r5.get(r0)
            a.j.a.c r5 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r5
            if (r5 == 0) goto L_0x002e
            boolean r6 = r5.m3227b(r8, r9)
            if (r6 == 0) goto L_0x002e
            if (r3 != 0) goto L_0x002a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x002a:
            r3.add(r5)
            r4 = 1
        L_0x002e:
            int r0 = r0 + 1
            goto L_0x000b
        L_0x0031:
            java.util.ArrayList<a.j.a.c> r8 = r7.f870h
            if (r8 == 0) goto L_0x0053
        L_0x0035:
            java.util.ArrayList<a.j.a.c> r8 = r7.f870h
            int r8 = r8.size()
            if (r1 >= r8) goto L_0x0053
            java.util.ArrayList<a.j.a.c> r8 = r7.f870h
            java.lang.Object r8 = r8.get(r1)
            a.j.a.c r8 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r8
            if (r3 == 0) goto L_0x004d
            boolean r9 = r3.contains(r8)
            if (r9 != 0) goto L_0x0050
        L_0x004d:
            r8.m3278H()
        L_0x0050:
            int r1 = r1 + 1
            goto L_0x0035
        L_0x0053:
            r7.f870h = r3
            return r4
    }

    /* renamed from: a */
    public boolean m3083a(android.view.MenuItem r5) {
            r4 = this;
            int r0 = r4.f875m
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L_0x0007
            return r1
        L_0x0007:
            r0 = 0
        L_0x0008:
            java.util.ArrayList<a.j.a.c> r3 = r4.f867e
            int r3 = r3.size()
            if (r0 >= r3) goto L_0x0024
            java.util.ArrayList<a.j.a.c> r3 = r4.f867e
            java.lang.Object r3 = r3.get(r0)
            a.j.a.c r3 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r3
            if (r3 == 0) goto L_0x0021
            boolean r3 = r3.m3221c(r5)
            if (r3 == 0) goto L_0x0021
            return r2
        L_0x0021:
            int r0 = r0 + 1
            goto L_0x0008
        L_0x0024:
            return r1
    }

    /* renamed from: a */
    boolean m3073a(java.util.ArrayList<p000a.p036j.p037a.C0244a> r6, java.util.ArrayList<java.lang.Boolean> r7, java.lang.String r8, int r9, int r10) {
            r5 = this;
            java.util.ArrayList<a.j.a.a> r0 = r5.f869g
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            r2 = 1
            if (r8 != 0) goto L_0x0029
            if (r9 >= 0) goto L_0x0029
            r3 = r10 & 1
            if (r3 != 0) goto L_0x0029
            int r8 = r0.size()
            int r8 = r8 - r2
            if (r8 >= 0) goto L_0x0017
            return r1
        L_0x0017:
            java.util.ArrayList<a.j.a.a> r9 = r5.f869g
            java.lang.Object r8 = r9.remove(r8)
            r6.add(r8)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            r7.add(r6)
            goto L_0x00a4
        L_0x0029:
            if (r8 != 0) goto L_0x0031
            if (r9 < 0) goto L_0x002e
            goto L_0x0031
        L_0x002e:
            r8 = -1
            r0 = -1
            goto L_0x007e
        L_0x0031:
            java.util.ArrayList<a.j.a.a> r0 = r5.f869g
            int r0 = r0.size()
            int r0 = r0 - r2
        L_0x0038:
            if (r0 < 0) goto L_0x0059
            java.util.ArrayList<a.j.a.a> r3 = r5.f869g
            java.lang.Object r3 = r3.get(r0)
            a.j.a.a r3 = (p000a.p036j.p037a.C0244a) r3
            if (r8 == 0) goto L_0x004f
            java.lang.String r4 = r3.m3288c()
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x004f
            goto L_0x0059
        L_0x004f:
            if (r9 < 0) goto L_0x0056
            int r3 = r3.f737l
            if (r9 != r3) goto L_0x0056
            goto L_0x0059
        L_0x0056:
            int r0 = r0 + (-1)
            goto L_0x0038
        L_0x0059:
            if (r0 >= 0) goto L_0x005c
            return r1
        L_0x005c:
            r10 = r10 & r2
            if (r10 == 0) goto L_0x007e
        L_0x005f:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L_0x007e
            java.util.ArrayList<a.j.a.a> r10 = r5.f869g
            java.lang.Object r10 = r10.get(r0)
            a.j.a.a r10 = (p000a.p036j.p037a.C0244a) r10
            if (r8 == 0) goto L_0x0077
            java.lang.String r3 = r10.m3288c()
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L_0x005f
        L_0x0077:
            if (r9 < 0) goto L_0x007e
            int r10 = r10.f737l
            if (r9 != r10) goto L_0x007e
            goto L_0x005f
        L_0x007e:
            java.util.ArrayList<a.j.a.a> r8 = r5.f869g
            int r8 = r8.size()
            int r8 = r8 - r2
            if (r0 != r8) goto L_0x0088
            return r1
        L_0x0088:
            java.util.ArrayList<a.j.a.a> r8 = r5.f869g
            int r8 = r8.size()
            int r8 = r8 - r2
        L_0x008f:
            if (r8 <= r0) goto L_0x00a4
            java.util.ArrayList<a.j.a.a> r9 = r5.f869g
            java.lang.Object r9 = r9.remove(r8)
            r6.add(r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            r7.add(r9)
            int r8 = r8 + (-1)
            goto L_0x008f
        L_0x00a4:
            return r2
    }

    /* renamed from: b */
    public int m3067b(p000a.p036j.p037a.C0244a r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<java.lang.Integer> r0 = r4.f872j     // Catch: all -> 0x0085
            if (r0 == 0) goto L_0x004b
            java.util.ArrayList<java.lang.Integer> r0 = r4.f872j     // Catch: all -> 0x0085
            int r0 = r0.size()     // Catch: all -> 0x0085
            if (r0 > 0) goto L_0x000e
            goto L_0x004b
        L_0x000e:
            java.util.ArrayList<java.lang.Integer> r0 = r4.f872j     // Catch: all -> 0x0085
            java.util.ArrayList<java.lang.Integer> r1 = r4.f872j     // Catch: all -> 0x0085
            int r1 = r1.size()     // Catch: all -> 0x0085
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.remove(r1)     // Catch: all -> 0x0085
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: all -> 0x0085
            int r0 = r0.intValue()     // Catch: all -> 0x0085
            boolean r1 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F     // Catch: all -> 0x0085
            if (r1 == 0) goto L_0x0044
            java.lang.String r1 = "FragmentManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: all -> 0x0085
            r2.<init>()     // Catch: all -> 0x0085
            java.lang.String r3 = "Adding back stack index "
            r2.append(r3)     // Catch: all -> 0x0085
            r2.append(r0)     // Catch: all -> 0x0085
            java.lang.String r3 = " with "
            r2.append(r3)     // Catch: all -> 0x0085
            r2.append(r5)     // Catch: all -> 0x0085
            java.lang.String r2 = r2.toString()     // Catch: all -> 0x0085
            android.util.Log.v(r1, r2)     // Catch: all -> 0x0085
        L_0x0044:
            java.util.ArrayList<a.j.a.a> r1 = r4.f871i     // Catch: all -> 0x0085
            r1.set(r0, r5)     // Catch: all -> 0x0085
            monitor-exit(r4)     // Catch: all -> 0x0085
            return r0
        L_0x004b:
            java.util.ArrayList<a.j.a.a> r0 = r4.f871i     // Catch: all -> 0x0085
            if (r0 != 0) goto L_0x0056
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: all -> 0x0085
            r0.<init>()     // Catch: all -> 0x0085
            r4.f871i = r0     // Catch: all -> 0x0085
        L_0x0056:
            java.util.ArrayList<a.j.a.a> r0 = r4.f871i     // Catch: all -> 0x0085
            int r0 = r0.size()     // Catch: all -> 0x0085
            boolean r1 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F     // Catch: all -> 0x0085
            if (r1 == 0) goto L_0x007e
            java.lang.String r1 = "FragmentManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: all -> 0x0085
            r2.<init>()     // Catch: all -> 0x0085
            java.lang.String r3 = "Setting back stack index "
            r2.append(r3)     // Catch: all -> 0x0085
            r2.append(r0)     // Catch: all -> 0x0085
            java.lang.String r3 = " to "
            r2.append(r3)     // Catch: all -> 0x0085
            r2.append(r5)     // Catch: all -> 0x0085
            java.lang.String r2 = r2.toString()     // Catch: all -> 0x0085
            android.util.Log.v(r1, r2)     // Catch: all -> 0x0085
        L_0x007e:
            java.util.ArrayList<a.j.a.a> r1 = r4.f871i     // Catch: all -> 0x0085
            r1.add(r5)     // Catch: all -> 0x0085
            monitor-exit(r4)     // Catch: all -> 0x0085
            return r0
        L_0x0085:
            r5 = move-exception
            monitor-exit(r4)     // Catch: all -> 0x0085
            throw r5
    }

    /* renamed from: b */
    public p000a.p036j.p037a.ComponentCallbacksC0248c m3059b(java.lang.String r3) {
            r2 = this;
            android.util.SparseArray<a.j.a.c> r0 = r2.f868f
            if (r0 == 0) goto L_0x0022
            if (r3 == 0) goto L_0x0022
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L_0x000c:
            if (r0 < 0) goto L_0x0022
            android.util.SparseArray<a.j.a.c> r1 = r2.f868f
            java.lang.Object r1 = r1.valueAt(r0)
            a.j.a.c r1 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r1
            if (r1 == 0) goto L_0x001f
            a.j.a.c r1 = r1.m3235a(r3)
            if (r1 == 0) goto L_0x001f
            return r1
        L_0x001f:
            int r0 = r0 + (-1)
            goto L_0x000c
        L_0x0022:
            r3 = 0
            return r3
    }

    @Override // p000a.p036j.p037a.AbstractC0262h
    /* renamed from: b */
    public java.util.List<p000a.p036j.p037a.ComponentCallbacksC0248c> mo3071b() {
            r2 = this;
            java.util.ArrayList<a.j.a.c> r0 = r2.f867e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000d
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L_0x000d:
            java.util.ArrayList<a.j.a.c> r0 = r2.f867e
            monitor-enter(r0)
            java.util.ArrayList<a.j.a.c> r1 = r2.f867e     // Catch: all -> 0x001a
            java.lang.Object r1 = r1.clone()     // Catch: all -> 0x001a
            java.util.List r1 = (java.util.List) r1     // Catch: all -> 0x001a
            monitor-exit(r0)     // Catch: all -> 0x001a
            return r1
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x001a
            throw r1
    }

    /* renamed from: b */
    public void m3070b(int r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.ArrayList<a.j.a.a> r0 = r3.f871i     // Catch: all -> 0x0037
            r1 = 0
            r0.set(r4, r1)     // Catch: all -> 0x0037
            java.util.ArrayList<java.lang.Integer> r0 = r3.f872j     // Catch: all -> 0x0037
            if (r0 != 0) goto L_0x0012
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: all -> 0x0037
            r0.<init>()     // Catch: all -> 0x0037
            r3.f872j = r0     // Catch: all -> 0x0037
        L_0x0012:
            boolean r0 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F     // Catch: all -> 0x0037
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: all -> 0x0037
            r1.<init>()     // Catch: all -> 0x0037
            java.lang.String r2 = "Freeing back stack index "
            r1.append(r2)     // Catch: all -> 0x0037
            r1.append(r4)     // Catch: all -> 0x0037
            java.lang.String r1 = r1.toString()     // Catch: all -> 0x0037
            android.util.Log.v(r0, r1)     // Catch: all -> 0x0037
        L_0x002c:
            java.util.ArrayList<java.lang.Integer> r0 = r3.f872j     // Catch: all -> 0x0037
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: all -> 0x0037
            r0.add(r4)     // Catch: all -> 0x0037
            monitor-exit(r3)     // Catch: all -> 0x0037
            return
        L_0x0037:
            r4 = move-exception
            monitor-exit(r3)     // Catch: all -> 0x0037
            throw r4
    }

    /* renamed from: b */
    void m3066b(p000a.p036j.p037a.ComponentCallbacksC0248c r8) {
            r7 = this;
            android.view.View r0 = r8.f775J
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x007f
            int r0 = r8.m3191q()
            boolean r3 = r8.f767B
            r3 = r3 ^ r1
            int r4 = r8.m3190r()
            a.j.a.i$g r0 = r7.m3102a(r8, r0, r3, r4)
            if (r0 == 0) goto L_0x0050
            android.animation.Animator r3 = r0.f905b
            if (r3 == 0) goto L_0x0050
            android.view.View r4 = r8.f775J
            r3.setTarget(r4)
            boolean r3 = r8.f767B
            if (r3 == 0) goto L_0x0040
            boolean r3 = r8.m3283B()
            if (r3 == 0) goto L_0x002e
            r8.m3209f(r2)
            goto L_0x0045
        L_0x002e:
            android.view.ViewGroup r3 = r8.f774I
            android.view.View r4 = r8.f775J
            r3.startViewTransition(r4)
            android.animation.Animator r5 = r0.f905b
            a.j.a.i$d r6 = new a.j.a.i$d
            r6.<init>(r7, r3, r4, r8)
            r5.addListener(r6)
            goto L_0x0045
        L_0x0040:
            android.view.View r3 = r8.f775J
            r3.setVisibility(r2)
        L_0x0045:
            android.view.View r3 = r8.f775J
            m3082a(r3, r0)
            android.animation.Animator r0 = r0.f905b
            r0.start()
            goto L_0x007f
        L_0x0050:
            if (r0 == 0) goto L_0x0063
            android.view.View r3 = r8.f775J
            m3082a(r3, r0)
            android.view.View r3 = r8.f775J
            android.view.animation.Animation r4 = r0.f904a
            r3.startAnimation(r4)
            android.view.animation.Animation r0 = r0.f904a
            r0.start()
        L_0x0063:
            boolean r0 = r8.f767B
            if (r0 == 0) goto L_0x0070
            boolean r0 = r8.m3283B()
            if (r0 != 0) goto L_0x0070
            r0 = 8
            goto L_0x0071
        L_0x0070:
            r0 = 0
        L_0x0071:
            android.view.View r3 = r8.f775J
            r3.setVisibility(r0)
            boolean r0 = r8.m3283B()
            if (r0 == 0) goto L_0x007f
            r8.m3209f(r2)
        L_0x007f:
            boolean r0 = r8.f799l
            if (r0 == 0) goto L_0x008d
            boolean r0 = r8.f771F
            if (r0 == 0) goto L_0x008d
            boolean r0 = r8.f772G
            if (r0 == 0) goto L_0x008d
            r7.f880r = r1
        L_0x008d:
            r8.f781P = r2
            boolean r0 = r8.f767B
            r8.m3233a(r0)
            return
    }

    /* renamed from: b */
    void m3065b(p000a.p036j.p037a.ComponentCallbacksC0248c r4, android.content.Context r5, boolean r6) {
            r3 = this;
            a.j.a.c r0 = r3.f878p
            if (r0 == 0) goto L_0x0012
            a.j.a.h r0 = r0.m3193o()
            boolean r1 = r0 instanceof p000a.p036j.p037a.LayoutInflater$Factory2C0266i
            if (r1 == 0) goto L_0x0012
            a.j.a.i r0 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i) r0
            r1 = 1
            r0.m3065b(r4, r5, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<a.j.a.i$j> r0 = r3.f874l
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            a.j.a.i$j r1 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0278j) r1
            if (r6 == 0) goto L_0x002a
            boolean r2 = r1.f913b
            if (r2 == 0) goto L_0x0018
        L_0x002a:
            a.j.a.h$b r1 = r1.f912a
            r1.m3124b(r3, r4, r5)
            goto L_0x0018
        L_0x0030:
            return
    }

    /* renamed from: b */
    void m3064b(p000a.p036j.p037a.ComponentCallbacksC0248c r4, android.os.Bundle r5, boolean r6) {
            r3 = this;
            a.j.a.c r0 = r3.f878p
            if (r0 == 0) goto L_0x0012
            a.j.a.h r0 = r0.m3193o()
            boolean r1 = r0 instanceof p000a.p036j.p037a.LayoutInflater$Factory2C0266i
            if (r1 == 0) goto L_0x0012
            a.j.a.i r0 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i) r0
            r1 = 1
            r0.m3064b(r4, r5, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<a.j.a.i$j> r0 = r3.f874l
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            a.j.a.i$j r1 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0278j) r1
            if (r6 == 0) goto L_0x002a
            boolean r2 = r1.f913b
            if (r2 == 0) goto L_0x0018
        L_0x002a:
            a.j.a.h$b r1 = r1.f912a
            r1.m3123b(r3, r4, r5)
            goto L_0x0018
        L_0x0030:
            return
    }

    /* renamed from: b */
    void m3063b(p000a.p036j.p037a.ComponentCallbacksC0248c r4, boolean r5) {
            r3 = this;
            a.j.a.c r0 = r3.f878p
            if (r0 == 0) goto L_0x0012
            a.j.a.h r0 = r0.m3193o()
            boolean r1 = r0 instanceof p000a.p036j.p037a.LayoutInflater$Factory2C0266i
            if (r1 == 0) goto L_0x0012
            a.j.a.i r0 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i) r0
            r1 = 1
            r0.m3063b(r4, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<a.j.a.i$j> r0 = r3.f874l
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            a.j.a.i$j r1 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0278j) r1
            if (r5 == 0) goto L_0x002a
            boolean r2 = r1.f913b
            if (r2 == 0) goto L_0x0018
        L_0x002a:
            a.j.a.h$b r1 = r1.f912a
            r1.m3129a(r3, r4)
            goto L_0x0018
        L_0x0030:
            return
    }

    /* renamed from: b */
    public void m3056b(boolean r3) {
            r2 = this;
            java.util.ArrayList<a.j.a.c> r0 = r2.f867e
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L_0x0008:
            if (r0 < 0) goto L_0x001a
            java.util.ArrayList<a.j.a.c> r1 = r2.f867e
            java.lang.Object r1 = r1.get(r0)
            a.j.a.c r1 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r1
            if (r1 == 0) goto L_0x0017
            r1.m3212e(r3)
        L_0x0017:
            int r0 = r0 + (-1)
            goto L_0x0008
        L_0x001a:
            return
    }

    /* renamed from: b */
    public boolean m3062b(android.view.Menu r5) {
            r4 = this;
            int r0 = r4.f875m
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L_0x0007
            return r1
        L_0x0007:
            r0 = 0
        L_0x0008:
            java.util.ArrayList<a.j.a.c> r3 = r4.f867e
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0024
            java.util.ArrayList<a.j.a.c> r3 = r4.f867e
            java.lang.Object r3 = r3.get(r1)
            a.j.a.c r3 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r3
            if (r3 == 0) goto L_0x0021
            boolean r3 = r3.m3217d(r5)
            if (r3 == 0) goto L_0x0021
            r0 = 1
        L_0x0021:
            int r1 = r1 + 1
            goto L_0x0008
        L_0x0024:
            return r0
    }

    /* renamed from: b */
    public boolean m3061b(android.view.MenuItem r5) {
            r4 = this;
            int r0 = r4.f875m
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L_0x0007
            return r1
        L_0x0007:
            r0 = 0
        L_0x0008:
            java.util.ArrayList<a.j.a.c> r3 = r4.f867e
            int r3 = r3.size()
            if (r0 >= r3) goto L_0x0024
            java.util.ArrayList<a.j.a.c> r3 = r4.f867e
            java.lang.Object r3 = r3.get(r0)
            a.j.a.c r3 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r3
            if (r3 == 0) goto L_0x0021
            boolean r3 = r3.m3216d(r5)
            if (r3 == 0) goto L_0x0021
            return r2
        L_0x0021:
            int r0 = r0 + 1
            goto L_0x0008
        L_0x0024:
            return r1
    }

    /* renamed from: c */
    public void m3053c(p000a.p036j.p037a.ComponentCallbacksC0248c r4) {
            r3 = this;
            boolean r0 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r0 == 0) goto L_0x001a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "detach: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L_0x001a:
            boolean r0 = r4.f768C
            if (r0 != 0) goto L_0x0059
            r0 = 1
            r4.f768C = r0
            boolean r1 = r4.f799l
            if (r1 == 0) goto L_0x0059
            boolean r1 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r1 == 0) goto L_0x003f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "remove from detach: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r1)
        L_0x003f:
            java.util.ArrayList<a.j.a.c> r1 = r3.f867e
            monitor-enter(r1)
            java.util.ArrayList<a.j.a.c> r2 = r3.f867e     // Catch: all -> 0x0056
            r2.remove(r4)     // Catch: all -> 0x0056
            monitor-exit(r1)     // Catch: all -> 0x0056
            boolean r1 = r4.f771F
            if (r1 == 0) goto L_0x0052
            boolean r1 = r4.f772G
            if (r1 == 0) goto L_0x0052
            r3.f880r = r0
        L_0x0052:
            r0 = 0
            r4.f799l = r0
            goto L_0x0059
        L_0x0056:
            r4 = move-exception
            monitor-exit(r1)     // Catch: all -> 0x0056
            throw r4
        L_0x0059:
            return
    }

    /* renamed from: c */
    void m3052c(p000a.p036j.p037a.ComponentCallbacksC0248c r4, android.os.Bundle r5, boolean r6) {
            r3 = this;
            a.j.a.c r0 = r3.f878p
            if (r0 == 0) goto L_0x0012
            a.j.a.h r0 = r0.m3193o()
            boolean r1 = r0 instanceof p000a.p036j.p037a.LayoutInflater$Factory2C0266i
            if (r1 == 0) goto L_0x0012
            a.j.a.i r0 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i) r0
            r1 = 1
            r0.m3052c(r4, r5, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<a.j.a.i$j> r0 = r3.f874l
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            a.j.a.i$j r1 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0278j) r1
            if (r6 == 0) goto L_0x002a
            boolean r2 = r1.f913b
            if (r2 == 0) goto L_0x0018
        L_0x002a:
            a.j.a.h$b r1 = r1.f912a
            r1.m3121c(r3, r4, r5)
            goto L_0x0018
        L_0x0030:
            return
    }

    /* renamed from: c */
    void m3051c(p000a.p036j.p037a.ComponentCallbacksC0248c r4, boolean r5) {
            r3 = this;
            a.j.a.c r0 = r3.f878p
            if (r0 == 0) goto L_0x0012
            a.j.a.h r0 = r0.m3193o()
            boolean r1 = r0 instanceof p000a.p036j.p037a.LayoutInflater$Factory2C0266i
            if (r1 == 0) goto L_0x0012
            a.j.a.i r0 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i) r0
            r1 = 1
            r0.m3051c(r4, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<a.j.a.i$j> r0 = r3.f874l
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            a.j.a.i$j r1 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0278j) r1
            if (r5 == 0) goto L_0x002a
            boolean r2 = r1.f913b
            if (r2 == 0) goto L_0x0018
        L_0x002a:
            a.j.a.h$b r1 = r1.f912a
            r1.m3125b(r3, r4)
            goto L_0x0018
        L_0x0030:
            return
    }

    @Override // p000a.p036j.p037a.AbstractC0262h
    /* renamed from: c */
    public boolean mo3055c() {
            r1 = this;
            boolean r0 = r1.f881s
            if (r0 != 0) goto L_0x000b
            boolean r0 = r1.f882t
            if (r0 == 0) goto L_0x0009
            goto L_0x000b
        L_0x0009:
            r0 = 0
            goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            return r0
    }

    /* renamed from: c */
    boolean m3054c(int r2) {
            r1 = this;
            int r0 = r1.f875m
            if (r0 < r2) goto L_0x0006
            r2 = 1
            goto L_0x0007
        L_0x0006:
            r2 = 0
        L_0x0007:
            return r2
    }

    /* renamed from: d */
    void m3046d(p000a.p036j.p037a.ComponentCallbacksC0248c r4) {
            r3 = this;
            boolean r0 = r4.f801n
            if (r0 == 0) goto L_0x003a
            boolean r0 = r4.f804q
            if (r0 != 0) goto L_0x003a
            android.os.Bundle r0 = r4.f790c
            android.view.LayoutInflater r0 = r4.m3203i(r0)
            android.os.Bundle r1 = r4.f790c
            r2 = 0
            r4.m3229b(r0, r2, r1)
            android.view.View r0 = r4.f775J
            if (r0 == 0) goto L_0x0038
            r4.f776K = r0
            r1 = 0
            r0.setSaveFromParentEnabled(r1)
            boolean r0 = r4.f767B
            if (r0 == 0) goto L_0x0029
            android.view.View r0 = r4.f775J
            r2 = 8
            r0.setVisibility(r2)
        L_0x0029:
            android.view.View r0 = r4.f775J
            android.os.Bundle r2 = r4.f790c
            r4.m3236a(r0, r2)
            android.view.View r0 = r4.f775J
            android.os.Bundle r2 = r4.f790c
            r3.m3098a(r4, r0, r2, r1)
            goto L_0x003a
        L_0x0038:
            r4.f776K = r2
        L_0x003a:
            return
    }

    /* renamed from: d */
    void m3045d(p000a.p036j.p037a.ComponentCallbacksC0248c r4, android.os.Bundle r5, boolean r6) {
            r3 = this;
            a.j.a.c r0 = r3.f878p
            if (r0 == 0) goto L_0x0012
            a.j.a.h r0 = r0.m3193o()
            boolean r1 = r0 instanceof p000a.p036j.p037a.LayoutInflater$Factory2C0266i
            if (r1 == 0) goto L_0x0012
            a.j.a.i r0 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i) r0
            r1 = 1
            r0.m3045d(r4, r5, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<a.j.a.i$j> r0 = r3.f874l
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            a.j.a.i$j r1 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0278j) r1
            if (r6 == 0) goto L_0x002a
            boolean r2 = r1.f913b
            if (r2 == 0) goto L_0x0018
        L_0x002a:
            a.j.a.h$b r1 = r1.f912a
            r1.m3119d(r3, r4, r5)
            goto L_0x0018
        L_0x0030:
            return
    }

    /* renamed from: d */
    void m3044d(p000a.p036j.p037a.ComponentCallbacksC0248c r4, boolean r5) {
            r3 = this;
            a.j.a.c r0 = r3.f878p
            if (r0 == 0) goto L_0x0012
            a.j.a.h r0 = r0.m3193o()
            boolean r1 = r0 instanceof p000a.p036j.p037a.LayoutInflater$Factory2C0266i
            if (r1 == 0) goto L_0x0012
            a.j.a.i r0 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i) r0
            r1 = 1
            r0.m3044d(r4, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<a.j.a.i$j> r0 = r3.f874l
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            a.j.a.i$j r1 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0278j) r1
            if (r5 == 0) goto L_0x002a
            boolean r2 = r1.f913b
            if (r2 == 0) goto L_0x0018
        L_0x002a:
            a.j.a.h$b r1 = r1.f912a
            r1.m3122c(r3, r4)
            goto L_0x0018
        L_0x0030:
            return
    }

    @Override // p000a.p036j.p037a.AbstractC0262h
    /* renamed from: d */
    public boolean mo3048d() {
            r3 = this;
            r3.m3005z()
            r0 = 0
            r1 = -1
            r2 = 0
            boolean r0 = r3.m3078a(r0, r1, r2)
            return r0
    }

    /* renamed from: e */
    public void m3043e() {
            r1 = this;
            r0 = 0
            r1.f881s = r0
            r1.f882t = r0
            r0 = 2
            r1.m3047d(r0)
            return
    }

    /* renamed from: e */
    public void m3041e(p000a.p036j.p037a.ComponentCallbacksC0248c r3) {
            r2 = this;
            boolean r0 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r0 == 0) goto L_0x001a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "hide: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L_0x001a:
            boolean r0 = r3.f767B
            if (r0 != 0) goto L_0x0026
            r0 = 1
            r3.f767B = r0
            boolean r1 = r3.f781P
            r0 = r0 ^ r1
            r3.f781P = r0
        L_0x0026:
            return
    }

    /* renamed from: e */
    void m3040e(p000a.p036j.p037a.ComponentCallbacksC0248c r4, boolean r5) {
            r3 = this;
            a.j.a.c r0 = r3.f878p
            if (r0 == 0) goto L_0x0012
            a.j.a.h r0 = r0.m3193o()
            boolean r1 = r0 instanceof p000a.p036j.p037a.LayoutInflater$Factory2C0266i
            if (r1 == 0) goto L_0x0012
            a.j.a.i r0 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i) r0
            r1 = 1
            r0.m3040e(r4, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<a.j.a.i$j> r0 = r3.f874l
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            a.j.a.i$j r1 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0278j) r1
            if (r5 == 0) goto L_0x002a
            boolean r2 = r1.f913b
            if (r2 == 0) goto L_0x0018
        L_0x002a:
            a.j.a.h$b r1 = r1.f912a
            r1.m3120d(r3, r4)
            goto L_0x0018
        L_0x0030:
            return
    }

    /* renamed from: f */
    public void m3039f() {
            r1 = this;
            r0 = 0
            r1.f881s = r0
            r1.f882t = r0
            r0 = 1
            r1.m3047d(r0)
            return
    }

    /* renamed from: f */
    void m3038f(p000a.p036j.p037a.ComponentCallbacksC0248c r3) {
            r2 = this;
            int r0 = r3.f793f
            if (r0 < 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r2.f866d
            int r1 = r0 + 1
            r2.f866d = r1
            a.j.a.c r1 = r2.f878p
            r3.m3256a(r0, r1)
            android.util.SparseArray<a.j.a.c> r0 = r2.f868f
            if (r0 != 0) goto L_0x001b
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.f868f = r0
        L_0x001b:
            android.util.SparseArray<a.j.a.c> r0 = r2.f868f
            int r1 = r3.f793f
            r0.put(r1, r3)
            boolean r0 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r0 == 0) goto L_0x003c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Allocated fragment index "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r3)
        L_0x003c:
            return
    }

    /* renamed from: f */
    void m3037f(p000a.p036j.p037a.ComponentCallbacksC0248c r4, boolean r5) {
            r3 = this;
            a.j.a.c r0 = r3.f878p
            if (r0 == 0) goto L_0x0012
            a.j.a.h r0 = r0.m3193o()
            boolean r1 = r0 instanceof p000a.p036j.p037a.LayoutInflater$Factory2C0266i
            if (r1 == 0) goto L_0x0012
            a.j.a.i r0 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i) r0
            r1 = 1
            r0.m3037f(r4, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<a.j.a.i$j> r0 = r3.f874l
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            a.j.a.i$j r1 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0278j) r1
            if (r5 == 0) goto L_0x002a
            boolean r2 = r1.f913b
            if (r2 == 0) goto L_0x0018
        L_0x002a:
            a.j.a.h$b r1 = r1.f912a
            r1.m3118e(r3, r4)
            goto L_0x0018
        L_0x0030:
            return
    }

    /* renamed from: g */
    public void m3036g() {
            r1 = this;
            r0 = 1
            r1.f883u = r0
            r1.m3018o()
            r0 = 0
            r1.m3047d(r0)
            r0 = 0
            r1.f876n = r0
            r1.f877o = r0
            r1.f878p = r0
            return
    }

    /* renamed from: g */
    void m3035g(p000a.p036j.p037a.ComponentCallbacksC0248c r4) {
            r3 = this;
            int r0 = r4.f793f
            if (r0 >= 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r0 == 0) goto L_0x001f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Freeing fragment index "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L_0x001f:
            android.util.SparseArray<a.j.a.c> r0 = r3.f868f
            int r1 = r4.f793f
            r2 = 0
            r0.put(r1, r2)
            r4.m3182z()
            return
    }

    /* renamed from: g */
    void m3034g(p000a.p036j.p037a.ComponentCallbacksC0248c r4, boolean r5) {
            r3 = this;
            a.j.a.c r0 = r3.f878p
            if (r0 == 0) goto L_0x0012
            a.j.a.h r0 = r0.m3193o()
            boolean r1 = r0 instanceof p000a.p036j.p037a.LayoutInflater$Factory2C0266i
            if (r1 == 0) goto L_0x0012
            a.j.a.i r0 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i) r0
            r1 = 1
            r0.m3034g(r4, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<a.j.a.i$j> r0 = r3.f874l
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            a.j.a.i$j r1 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0278j) r1
            if (r5 == 0) goto L_0x002a
            boolean r2 = r1.f913b
            if (r2 == 0) goto L_0x0018
        L_0x002a:
            a.j.a.h$b r1 = r1.f912a
            r1.m3117f(r3, r4)
            goto L_0x0018
        L_0x0030:
            return
    }

    /* renamed from: h */
    public void m3033h() {
            r1 = this;
            r0 = 1
            r1.m3047d(r0)
            return
    }

    /* renamed from: h */
    void m3032h(p000a.p036j.p037a.ComponentCallbacksC0248c r11) {
            r10 = this;
            if (r11 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r10.f875m
            boolean r1 = r11.f800m
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001a
            boolean r1 = r11.m3282C()
            if (r1 == 0) goto L_0x0016
            int r0 = java.lang.Math.min(r0, r2)
            goto L_0x001a
        L_0x0016:
            int r0 = java.lang.Math.min(r0, r3)
        L_0x001a:
            r6 = r0
            int r7 = r11.m3191q()
            int r8 = r11.m3190r()
            r9 = 0
            r4 = r10
            r5 = r11
            r4.m3103a(r5, r6, r7, r8, r9)
            android.view.View r0 = r11.f775J
            if (r0 == 0) goto L_0x008c
            a.j.a.c r0 = r10.m3015p(r11)
            if (r0 == 0) goto L_0x004b
            android.view.View r0 = r0.f775J
            android.view.ViewGroup r1 = r11.f774I
            int r0 = r1.indexOfChild(r0)
            android.view.View r4 = r11.f775J
            int r4 = r1.indexOfChild(r4)
            if (r4 >= r0) goto L_0x004b
            r1.removeViewAt(r4)
            android.view.View r4 = r11.f775J
            r1.addView(r4, r0)
        L_0x004b:
            boolean r0 = r11.f780O
            if (r0 == 0) goto L_0x008c
            android.view.ViewGroup r0 = r11.f774I
            if (r0 == 0) goto L_0x008c
            float r0 = r11.f782Q
            r1 = 0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x005f
            android.view.View r4 = r11.f775J
            r4.setAlpha(r0)
        L_0x005f:
            r11.f782Q = r1
            r11.f780O = r3
            int r0 = r11.m3191q()
            int r1 = r11.m3190r()
            a.j.a.i$g r0 = r10.m3102a(r11, r0, r2, r1)
            if (r0 == 0) goto L_0x008c
            android.view.View r1 = r11.f775J
            m3082a(r1, r0)
            android.view.animation.Animation r1 = r0.f904a
            if (r1 == 0) goto L_0x0080
            android.view.View r0 = r11.f775J
            r0.startAnimation(r1)
            goto L_0x008c
        L_0x0080:
            android.animation.Animator r1 = r0.f905b
            android.view.View r2 = r11.f775J
            r1.setTarget(r2)
            android.animation.Animator r0 = r0.f905b
            r0.start()
        L_0x008c:
            boolean r0 = r11.f781P
            if (r0 == 0) goto L_0x0093
            r10.m3066b(r11)
        L_0x0093:
            return
    }

    /* renamed from: h */
    void m3031h(p000a.p036j.p037a.ComponentCallbacksC0248c r4, boolean r5) {
            r3 = this;
            a.j.a.c r0 = r3.f878p
            if (r0 == 0) goto L_0x0012
            a.j.a.h r0 = r0.m3193o()
            boolean r1 = r0 instanceof p000a.p036j.p037a.LayoutInflater$Factory2C0266i
            if (r1 == 0) goto L_0x0012
            a.j.a.i r0 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i) r0
            r1 = 1
            r0.m3031h(r4, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<a.j.a.i$j> r0 = r3.f874l
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            a.j.a.i$j r1 = (p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0278j) r1
            if (r5 == 0) goto L_0x002a
            boolean r2 = r1.f913b
            if (r2 == 0) goto L_0x0018
        L_0x002a:
            a.j.a.h$b r1 = r1.f912a
            r1.m3116g(r3, r4)
            goto L_0x0018
        L_0x0030:
            return
    }

    /* renamed from: i */
    public void m3030i() {
            r2 = this;
            r0 = 0
        L_0x0001:
            java.util.ArrayList<a.j.a.c> r1 = r2.f867e
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x0019
            java.util.ArrayList<a.j.a.c> r1 = r2.f867e
            java.lang.Object r1 = r1.get(r0)
            a.j.a.c r1 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r1
            if (r1 == 0) goto L_0x0016
            r1.m3267S()
        L_0x0016:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0019:
            return
    }

    /* renamed from: i */
    void m3029i(p000a.p036j.p037a.ComponentCallbacksC0248c r7) {
            r6 = this;
            int r2 = r6.f875m
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r0.m3103a(r1, r2, r3, r4, r5)
            return
    }

    /* renamed from: j */
    public void m3028j() {
            r1 = this;
            r0 = 3
            r1.m3047d(r0)
            return
    }

    /* renamed from: j */
    public void m3027j(p000a.p036j.p037a.ComponentCallbacksC0248c r8) {
            r7 = this;
            boolean r0 = r8.f777L
            if (r0 == 0) goto L_0x0019
            boolean r0 = r7.f865c
            if (r0 == 0) goto L_0x000c
            r8 = 1
            r7.f885w = r8
            return
        L_0x000c:
            r0 = 0
            r8.f777L = r0
            int r3 = r7.f875m
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r7
            r2 = r8
            r1.m3103a(r2, r3, r4, r5, r6)
        L_0x0019:
            return
    }

    /* renamed from: k */
    public void m3026k() {
            r1 = this;
            r0 = 0
            r1.f881s = r0
            r1.f882t = r0
            r0 = 4
            r1.m3047d(r0)
            return
    }

    /* renamed from: k */
    public void m3025k(p000a.p036j.p037a.ComponentCallbacksC0248c r4) {
            r3 = this;
            boolean r0 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r0 == 0) goto L_0x0024
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "remove: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " nesting="
            r0.append(r1)
            int r1 = r4.f805r
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L_0x0024:
            boolean r0 = r4.m3282C()
            r1 = 1
            r0 = r0 ^ r1
            boolean r2 = r4.f768C
            if (r2 == 0) goto L_0x0030
            if (r0 == 0) goto L_0x0048
        L_0x0030:
            java.util.ArrayList<a.j.a.c> r0 = r3.f867e
            monitor-enter(r0)
            java.util.ArrayList<a.j.a.c> r2 = r3.f867e     // Catch: all -> 0x0049
            r2.remove(r4)     // Catch: all -> 0x0049
            monitor-exit(r0)     // Catch: all -> 0x0049
            boolean r0 = r4.f771F
            if (r0 == 0) goto L_0x0043
            boolean r0 = r4.f772G
            if (r0 == 0) goto L_0x0043
            r3.f880r = r1
        L_0x0043:
            r0 = 0
            r4.f799l = r0
            r4.f800m = r1
        L_0x0048:
            return
        L_0x0049:
            r4 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x0049
            throw r4
    }

    /* renamed from: l */
    android.os.Bundle m3023l(p000a.p036j.p037a.ComponentCallbacksC0248c r4) {
            r3 = this;
            android.os.Bundle r0 = r3.f859A
            if (r0 != 0) goto L_0x000b
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r3.f859A = r0
        L_0x000b:
            android.os.Bundle r0 = r3.f859A
            r4.m3201j(r0)
            android.os.Bundle r0 = r3.f859A
            r1 = 0
            r3.m3045d(r4, r0, r1)
            android.os.Bundle r0 = r3.f859A
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0024
            android.os.Bundle r0 = r3.f859A
            r3.f859A = r1
            goto L_0x0025
        L_0x0024:
            r0 = r1
        L_0x0025:
            android.view.View r1 = r4.f775J
            if (r1 == 0) goto L_0x002c
            r3.m3021m(r4)
        L_0x002c:
            android.util.SparseArray<android.os.Parcelable> r1 = r4.f791d
            if (r1 == 0) goto L_0x003e
            if (r0 != 0) goto L_0x0037
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L_0x0037:
            android.util.SparseArray<android.os.Parcelable> r1 = r4.f791d
            java.lang.String r2 = "android:view_state"
            r0.putSparseParcelableArray(r2, r1)
        L_0x003e:
            boolean r1 = r4.f778M
            if (r1 != 0) goto L_0x0050
            if (r0 != 0) goto L_0x0049
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L_0x0049:
            boolean r4 = r4.f778M
            java.lang.String r1 = "android:user_visible_hint"
            r0.putBoolean(r1, r4)
        L_0x0050:
            return r0
    }

    /* renamed from: l */
    public void m3024l() {
            r1 = this;
            r0 = 0
            r1.f881s = r0
            r1.f882t = r0
            r0 = 3
            r1.m3047d(r0)
            return
    }

    /* renamed from: m */
    public void m3022m() {
            r1 = this;
            r0 = 1
            r1.f882t = r0
            r0 = 2
            r1.m3047d(r0)
            return
    }

    /* renamed from: m */
    void m3021m(p000a.p036j.p037a.ComponentCallbacksC0248c r3) {
            r2 = this;
            android.view.View r0 = r3.f776K
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.util.SparseArray<android.os.Parcelable> r0 = r2.f860B
            if (r0 != 0) goto L_0x0011
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.f860B = r0
            goto L_0x0014
        L_0x0011:
            r0.clear()
        L_0x0014:
            android.view.View r0 = r3.f776K
            android.util.SparseArray<android.os.Parcelable> r1 = r2.f860B
            r0.saveHierarchyState(r1)
            android.util.SparseArray<android.os.Parcelable> r0 = r2.f860B
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x002a
            android.util.SparseArray<android.os.Parcelable> r0 = r2.f860B
            r3.f791d = r0
            r3 = 0
            r2.f860B = r3
        L_0x002a:
            return
    }

    /* renamed from: n */
    void m3020n() {
            r1 = this;
            boolean r0 = r1.f885w
            if (r0 == 0) goto L_0x000a
            r0 = 0
            r1.f885w = r0
            r1.m3007x()
        L_0x000a:
            return
    }

    /* renamed from: n */
    public void m3019n(p000a.p036j.p037a.ComponentCallbacksC0248c r4) {
            r3 = this;
            if (r4 == 0) goto L_0x0036
            android.util.SparseArray<a.j.a.c> r0 = r3.f868f
            int r1 = r4.f793f
            java.lang.Object r0 = r0.get(r1)
            if (r0 != r4) goto L_0x0017
            a.j.a.g r0 = r4.f807t
            if (r0 == 0) goto L_0x0036
            a.j.a.h r0 = r4.m3193o()
            if (r0 != r3) goto L_0x0017
            goto L_0x0036
        L_0x0017:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " is not an active fragment of FragmentManager "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x0036:
            r3.f879q = r4
            return
    }

    /* renamed from: o */
    public void m3017o(p000a.p036j.p037a.ComponentCallbacksC0248c r3) {
            r2 = this;
            boolean r0 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r0 == 0) goto L_0x001a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "show: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L_0x001a:
            boolean r0 = r3.f767B
            if (r0 == 0) goto L_0x0027
            r0 = 0
            r3.f767B = r0
            boolean r0 = r3.f781P
            r0 = r0 ^ 1
            r3.f781P = r0
        L_0x0027:
            return
    }

    /* renamed from: o */
    public boolean m3018o() {
            r4 = this;
            r0 = 1
            r4.m3049c(r0)
            r1 = 0
        L_0x0005:
            java.util.ArrayList<a.j.a.a> r2 = r4.f886x
            java.util.ArrayList<java.lang.Boolean> r3 = r4.f887y
            boolean r2 = r4.m3058b(r2, r3)
            if (r2 == 0) goto L_0x0022
            r4.f865c = r0
            java.util.ArrayList<a.j.a.a> r1 = r4.f886x     // Catch: all -> 0x001d
            java.util.ArrayList<java.lang.Boolean> r2 = r4.f887y     // Catch: all -> 0x001d
            r4.m3050c(r1, r2)     // Catch: all -> 0x001d
            r4.m3114A()
            r1 = 1
            goto L_0x0005
        L_0x001d:
            r0 = move-exception
            r4.m3114A()
            throw r0
        L_0x0022:
            r4.m3020n()
            r4.m3006y()
            return r1
    }

    @Override // android.view.LayoutInflater.Factory2
    public android.view.View onCreateView(android.view.View r13, java.lang.String r14, android.content.Context r15, android.util.AttributeSet r16) {
            r12 = this;
            r6 = r12
            r0 = r15
            r1 = r16
            java.lang.String r2 = "fragment"
            r3 = r14
            boolean r2 = r2.equals(r14)
            r3 = 0
            if (r2 != 0) goto L_0x000f
            return r3
        L_0x000f:
            java.lang.String r2 = "class"
            java.lang.String r2 = r1.getAttributeValue(r3, r2)
            int[] r4 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.C0279k.f914a
            android.content.res.TypedArray r4 = r15.obtainStyledAttributes(r1, r4)
            r5 = 0
            if (r2 != 0) goto L_0x0022
            java.lang.String r2 = r4.getString(r5)
        L_0x0022:
            r7 = r2
            r2 = -1
            r8 = 1
            int r9 = r4.getResourceId(r8, r2)
            r10 = 2
            java.lang.String r10 = r4.getString(r10)
            r4.recycle()
            a.j.a.g r4 = r6.f876n
            android.content.Context r4 = r4.m3136c()
            boolean r4 = p000a.p036j.p037a.ComponentCallbacksC0248c.m3246a(r4, r7)
            if (r4 != 0) goto L_0x003e
            return r3
        L_0x003e:
            if (r13 == 0) goto L_0x0044
            int r5 = r13.getId()
        L_0x0044:
            if (r5 != r2) goto L_0x0069
            if (r9 != r2) goto L_0x0069
            if (r10 == 0) goto L_0x004b
            goto L_0x0069
        L_0x004b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = r16.getPositionDescription()
            r2.append(r1)
            java.lang.String r1 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            r2.append(r1)
            r2.append(r7)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0069:
            if (r9 == r2) goto L_0x0070
            a.j.a.c r4 = r12.m3110a(r9)
            goto L_0x0071
        L_0x0070:
            r4 = r3
        L_0x0071:
            if (r4 != 0) goto L_0x0079
            if (r10 == 0) goto L_0x0079
            a.j.a.c r4 = r12.m3079a(r10)
        L_0x0079:
            if (r4 != 0) goto L_0x0081
            if (r5 == r2) goto L_0x0081
            a.j.a.c r4 = r12.m3110a(r5)
        L_0x0081:
            boolean r2 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r2 == 0) goto L_0x00af
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r11 = "onCreateView: id=0x"
            r2.append(r11)
            java.lang.String r11 = java.lang.Integer.toHexString(r9)
            r2.append(r11)
            java.lang.String r11 = " fname="
            r2.append(r11)
            r2.append(r7)
            java.lang.String r11 = " existing="
            r2.append(r11)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r11 = "FragmentManager"
            android.util.Log.v(r11, r2)
        L_0x00af:
            if (r4 != 0) goto L_0x00da
            a.j.a.e r2 = r6.f877o
            a.j.a.c r0 = r2.mo3168a(r15, r7, r3)
            r0.f801n = r8
            if (r9 == 0) goto L_0x00bd
            r2 = r9
            goto L_0x00be
        L_0x00bd:
            r2 = r5
        L_0x00be:
            r0.f812y = r2
            r0.f813z = r5
            r0.f766A = r10
            r0.f802o = r8
            r0.f806s = r6
            a.j.a.g r2 = r6.f876n
            r0.f807t = r2
            android.content.Context r2 = r2.m3136c()
            android.os.Bundle r3 = r0.f790c
            r0.m3247a(r2, r1, r3)
            r12.m3097a(r0, r8)
            r11 = r0
            goto L_0x00f2
        L_0x00da:
            boolean r0 = r4.f802o
            if (r0 != 0) goto L_0x013c
            r4.f802o = r8
            a.j.a.g r0 = r6.f876n
            r4.f807t = r0
            boolean r2 = r4.f770E
            if (r2 != 0) goto L_0x00f1
            android.content.Context r0 = r0.m3136c()
            android.os.Bundle r2 = r4.f790c
            r4.m3247a(r0, r1, r2)
        L_0x00f1:
            r11 = r4
        L_0x00f2:
            int r0 = r6.f875m
            if (r0 >= r8) goto L_0x0104
            boolean r0 = r11.f801n
            if (r0 == 0) goto L_0x0104
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r12
            r1 = r11
            r0.m3103a(r1, r2, r3, r4, r5)
            goto L_0x0107
        L_0x0104:
            r12.m3029i(r11)
        L_0x0107:
            android.view.View r0 = r11.f775J
            if (r0 == 0) goto L_0x0120
            if (r9 == 0) goto L_0x0110
            r0.setId(r9)
        L_0x0110:
            android.view.View r0 = r11.f775J
            java.lang.Object r0 = r0.getTag()
            if (r0 != 0) goto L_0x011d
            android.view.View r0 = r11.f775J
            r0.setTag(r10)
        L_0x011d:
            android.view.View r0 = r11.f775J
            return r0
        L_0x0120:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " did not create a view."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x013c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = r16.getPositionDescription()
            r2.append(r1)
            java.lang.String r1 = ": Duplicate id 0x"
            r2.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r9)
            r2.append(r1)
            java.lang.String r1 = ", tag "
            r2.append(r1)
            r2.append(r10)
            java.lang.String r1 = ", or parent id 0x"
            r2.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r5)
            r2.append(r1)
            java.lang.String r1 = " with another fragment for "
            r2.append(r1)
            r2.append(r7)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            android.view.View r2 = r1.onCreateView(r0, r2, r3, r4)
            return r2
    }

    /* renamed from: p */
    android.view.LayoutInflater.Factory2 m3016p() {
            r0 = this;
            return r0
    }

    /* renamed from: q */
    public p000a.p036j.p037a.ComponentCallbacksC0248c m3014q() {
            r1 = this;
            a.j.a.c r0 = r1.f879q
            return r0
    }

    /* renamed from: r */
    public void m3013r() {
            r3 = this;
            r0 = 0
            r3.f862D = r0
            r0 = 0
            r3.f881s = r0
            r3.f882t = r0
            java.util.ArrayList<a.j.a.c> r1 = r3.f867e
            int r1 = r1.size()
        L_0x000e:
            if (r0 >= r1) goto L_0x0020
            java.util.ArrayList<a.j.a.c> r2 = r3.f867e
            java.lang.Object r2 = r2.get(r0)
            a.j.a.c r2 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r2
            if (r2 == 0) goto L_0x001d
            r2.m3279F()
        L_0x001d:
            int r0 = r0 + 1
            goto L_0x000e
        L_0x0020:
            return
    }

    /* renamed from: s */
    void m3012s() {
            r2 = this;
            java.util.ArrayList<a.j.a.h$c> r0 = r2.f873k
            if (r0 == 0) goto L_0x001b
            r0 = 0
        L_0x0005:
            java.util.ArrayList<a.j.a.h$c> r1 = r2.f873k
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x001b
            java.util.ArrayList<a.j.a.h$c> r1 = r2.f873k
            java.lang.Object r1 = r1.get(r0)
            a.j.a.h$c r1 = (p000a.p036j.p037a.AbstractC0262h.AbstractC0265c) r1
            r1.m3115a()
            int r0 = r0 + 1
            goto L_0x0005
        L_0x001b:
            return
    }

    /* renamed from: t */
    p000a.p036j.p037a.C0282j m3011t() {
            r1 = this;
            a.j.a.j r0 = r1.f862D
            m3093a(r0)
            a.j.a.j r0 = r1.f862D
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.794E-43)
            r0.<init>(r1)
            java.lang.String r1 = "FragmentManager{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            a.j.a.c r1 = r2.f878p
            if (r1 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            a.j.a.g r1 = r2.f876n
        L_0x0023:
            p000a.p018g.p028k.C0178a.m3564a(r1, r0)
            java.lang.String r1 = "}}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* renamed from: u */
    android.os.Parcelable m3010u() {
            r13 = this;
            r13.m3112C()
            r13.m3113B()
            r13.m3018o()
            r0 = 1
            r13.f881s = r0
            r1 = 0
            r13.f862D = r1
            android.util.SparseArray<a.j.a.c> r2 = r13.f868f
            if (r2 == 0) goto L_0x01bf
            int r2 = r2.size()
            if (r2 > 0) goto L_0x001b
            goto L_0x01bf
        L_0x001b:
            android.util.SparseArray<a.j.a.c> r2 = r13.f868f
            int r2 = r2.size()
            a.j.a.l[] r3 = new p000a.p036j.p037a.C0285l[r2]
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0026:
            java.lang.String r7 = " has cleared index: "
            java.lang.String r8 = "Failure saving state: active "
            java.lang.String r9 = ": "
            java.lang.String r10 = "FragmentManager"
            if (r5 >= r2) goto L_0x00e9
            android.util.SparseArray<a.j.a.c> r11 = r13.f868f
            java.lang.Object r11 = r11.valueAt(r5)
            a.j.a.c r11 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r11
            if (r11 == 0) goto L_0x00e5
            int r6 = r11.f793f
            if (r6 < 0) goto L_0x00c5
            a.j.a.l r6 = new a.j.a.l
            r6.<init>(r11)
            r3[r5] = r6
            int r7 = r11.f789b
            if (r7 <= 0) goto L_0x009f
            android.os.Bundle r7 = r6.f936l
            if (r7 != 0) goto L_0x009f
            android.os.Bundle r7 = r13.m3023l(r11)
            r6.f936l = r7
            a.j.a.c r7 = r11.f796i
            if (r7 == 0) goto L_0x00a3
            int r7 = r7.f793f
            if (r7 < 0) goto L_0x007b
            android.os.Bundle r7 = r6.f936l
            if (r7 != 0) goto L_0x0066
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            r6.f936l = r7
        L_0x0066:
            android.os.Bundle r7 = r6.f936l
            a.j.a.c r8 = r11.f796i
            java.lang.String r12 = "android:target_state"
            r13.m3087a(r7, r12, r8)
            int r7 = r11.f798k
            if (r7 == 0) goto L_0x00a3
            android.os.Bundle r8 = r6.f936l
            java.lang.String r12 = "android:target_req_state"
            r8.putInt(r12, r7)
            goto L_0x00a3
        L_0x007b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failure saving state: "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r3 = " has target not in fragment manager: "
            r2.append(r3)
            a.j.a.c r3 = r11.f796i
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            r13.m3080a(r0)
            throw r1
        L_0x009f:
            android.os.Bundle r7 = r11.f790c
            r6.f936l = r7
        L_0x00a3:
            boolean r7 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r7 == 0) goto L_0x00c3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Saved state of "
            r7.append(r8)
            r7.append(r11)
            r7.append(r9)
            android.os.Bundle r6 = r6.f936l
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            android.util.Log.v(r10, r6)
        L_0x00c3:
            r6 = 1
            goto L_0x00e5
        L_0x00c5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r2.append(r11)
            r2.append(r7)
            int r3 = r11.f793f
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            r13.m3080a(r0)
            throw r1
        L_0x00e5:
            int r5 = r5 + 1
            goto L_0x0026
        L_0x00e9:
            if (r6 != 0) goto L_0x00f5
            boolean r0 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r0 == 0) goto L_0x00f4
            java.lang.String r0 = "saveAllState: no fragments!"
            android.util.Log.v(r10, r0)
        L_0x00f4:
            return r1
        L_0x00f5:
            java.util.ArrayList<a.j.a.c> r0 = r13.f867e
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x015f
            int[] r2 = new int[r0]
            r5 = 0
        L_0x0100:
            if (r5 >= r0) goto L_0x0160
            java.util.ArrayList<a.j.a.c> r6 = r13.f867e
            java.lang.Object r6 = r6.get(r5)
            a.j.a.c r6 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r6
            int r6 = r6.f793f
            r2[r5] = r6
            r6 = r2[r5]
            if (r6 < 0) goto L_0x0139
            boolean r6 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r6 == 0) goto L_0x0136
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r11 = "saveAllState: adding fragment #"
            r6.append(r11)
            r6.append(r5)
            r6.append(r9)
            java.util.ArrayList<a.j.a.c> r11 = r13.f867e
            java.lang.Object r11 = r11.get(r5)
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r10, r6)
        L_0x0136:
            int r5 = r5 + 1
            goto L_0x0100
        L_0x0139:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            java.util.ArrayList<a.j.a.c> r4 = r13.f867e
            java.lang.Object r4 = r4.get(r5)
            r3.append(r4)
            r3.append(r7)
            r2 = r2[r5]
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            r13.m3080a(r0)
            throw r1
        L_0x015f:
            r2 = r1
        L_0x0160:
            java.util.ArrayList<a.j.a.a> r0 = r13.f869g
            if (r0 == 0) goto L_0x01a4
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x01a4
            a.j.a.b[] r1 = new p000a.p036j.p037a.C0246b[r0]
        L_0x016c:
            if (r4 >= r0) goto L_0x01a4
            a.j.a.b r5 = new a.j.a.b
            java.util.ArrayList<a.j.a.a> r6 = r13.f869g
            java.lang.Object r6 = r6.get(r4)
            a.j.a.a r6 = (p000a.p036j.p037a.C0244a) r6
            r5.<init>(r6)
            r1[r4] = r5
            boolean r5 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r5 == 0) goto L_0x01a1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "saveAllState: adding back stack #"
            r5.append(r6)
            r5.append(r4)
            r5.append(r9)
            java.util.ArrayList<a.j.a.a> r6 = r13.f869g
            java.lang.Object r6 = r6.get(r4)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r10, r5)
        L_0x01a1:
            int r4 = r4 + 1
            goto L_0x016c
        L_0x01a4:
            a.j.a.k r0 = new a.j.a.k
            r0.<init>()
            r0.f921b = r3
            r0.f922c = r2
            r0.f923d = r1
            a.j.a.c r1 = r13.f879q
            if (r1 == 0) goto L_0x01b7
            int r1 = r1.f793f
            r0.f924e = r1
        L_0x01b7:
            int r1 = r13.f866d
            r0.f925f = r1
            r13.m3009v()
            return r0
        L_0x01bf:
            return r1
    }

    /* renamed from: v */
    void m3009v() {
            r9 = this;
            android.util.SparseArray<a.j.a.c> r0 = r9.f868f
            r1 = 0
            if (r0 == 0) goto L_0x009e
            r0 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r2 = 0
        L_0x000a:
            android.util.SparseArray<a.j.a.c> r6 = r9.f868f
            int r6 = r6.size()
            if (r2 >= r6) goto L_0x00a1
            android.util.SparseArray<a.j.a.c> r6 = r9.f868f
            java.lang.Object r6 = r6.valueAt(r2)
            a.j.a.c r6 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r6
            if (r6 == 0) goto L_0x009a
            boolean r7 = r6.f769D
            if (r7 == 0) goto L_0x004e
            if (r3 != 0) goto L_0x0027
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x0027:
            r3.add(r6)
            a.j.a.c r7 = r6.f796i
            if (r7 == 0) goto L_0x0031
            int r7 = r7.f793f
            goto L_0x0032
        L_0x0031:
            r7 = -1
        L_0x0032:
            r6.f797j = r7
            boolean r7 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r7 == 0) goto L_0x004e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "retainNonConfig: keeping retained "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "FragmentManager"
            android.util.Log.v(r8, r7)
        L_0x004e:
            a.j.a.i r7 = r6.f808u
            if (r7 == 0) goto L_0x005a
            r7.m3009v()
            a.j.a.i r7 = r6.f808u
            a.j.a.j r7 = r7.f862D
            goto L_0x005c
        L_0x005a:
            a.j.a.j r7 = r6.f809v
        L_0x005c:
            if (r4 != 0) goto L_0x0074
            if (r7 == 0) goto L_0x0074
            java.util.ArrayList r4 = new java.util.ArrayList
            android.util.SparseArray<a.j.a.c> r8 = r9.f868f
            int r8 = r8.size()
            r4.<init>(r8)
            r8 = 0
        L_0x006c:
            if (r8 >= r2) goto L_0x0074
            r4.add(r1)
            int r8 = r8 + 1
            goto L_0x006c
        L_0x0074:
            if (r4 == 0) goto L_0x0079
            r4.add(r7)
        L_0x0079:
            if (r5 != 0) goto L_0x0093
            androidx.lifecycle.r r7 = r6.f810w
            if (r7 == 0) goto L_0x0093
            java.util.ArrayList r5 = new java.util.ArrayList
            android.util.SparseArray<a.j.a.c> r7 = r9.f868f
            int r7 = r7.size()
            r5.<init>(r7)
            r7 = 0
        L_0x008b:
            if (r7 >= r2) goto L_0x0093
            r5.add(r1)
            int r7 = r7 + 1
            goto L_0x008b
        L_0x0093:
            if (r5 == 0) goto L_0x009a
            androidx.lifecycle.r r6 = r6.f810w
            r5.add(r6)
        L_0x009a:
            int r2 = r2 + 1
            goto L_0x000a
        L_0x009e:
            r3 = r1
            r4 = r3
            r5 = r4
        L_0x00a1:
            if (r3 != 0) goto L_0x00aa
            if (r4 != 0) goto L_0x00aa
            if (r5 != 0) goto L_0x00aa
            r9.f862D = r1
            goto L_0x00b1
        L_0x00aa:
            a.j.a.j r0 = new a.j.a.j
            r0.<init>(r3, r4, r5)
            r9.f862D = r0
        L_0x00b1:
            return
    }

    /* renamed from: w */
    void m3008w() {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<a.j.a.i$m> r0 = r4.f861C     // Catch: all -> 0x003b
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0011
            java.util.ArrayList<a.j.a.i$m> r0 = r4.f861C     // Catch: all -> 0x003b
            boolean r0 = r0.isEmpty()     // Catch: all -> 0x003b
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            java.util.ArrayList<a.j.a.i$l> r3 = r4.f864b     // Catch: all -> 0x003b
            if (r3 == 0) goto L_0x001f
            java.util.ArrayList<a.j.a.i$l> r3 = r4.f864b     // Catch: all -> 0x003b
            int r3 = r3.size()     // Catch: all -> 0x003b
            if (r3 != r2) goto L_0x001f
            r1 = 1
        L_0x001f:
            if (r0 != 0) goto L_0x0023
            if (r1 == 0) goto L_0x0039
        L_0x0023:
            a.j.a.g r0 = r4.f876n     // Catch: all -> 0x003b
            android.os.Handler r0 = r0.m3134e()     // Catch: all -> 0x003b
            java.lang.Runnable r1 = r4.f863E     // Catch: all -> 0x003b
            r0.removeCallbacks(r1)     // Catch: all -> 0x003b
            a.j.a.g r0 = r4.f876n     // Catch: all -> 0x003b
            android.os.Handler r0 = r0.m3134e()     // Catch: all -> 0x003b
            java.lang.Runnable r1 = r4.f863E     // Catch: all -> 0x003b
            r0.post(r1)     // Catch: all -> 0x003b
        L_0x0039:
            monitor-exit(r4)     // Catch: all -> 0x003b
            return
        L_0x003b:
            r0 = move-exception
            monitor-exit(r4)     // Catch: all -> 0x003b
            throw r0
    }

    /* renamed from: x */
    void m3007x() {
            r2 = this;
            android.util.SparseArray<a.j.a.c> r0 = r2.f868f
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
        L_0x0006:
            android.util.SparseArray<a.j.a.c> r1 = r2.f868f
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x001e
            android.util.SparseArray<a.j.a.c> r1 = r2.f868f
            java.lang.Object r1 = r1.valueAt(r0)
            a.j.a.c r1 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r1
            if (r1 == 0) goto L_0x001b
            r2.m3027j(r1)
        L_0x001b:
            int r0 = r0 + 1
            goto L_0x0006
        L_0x001e:
            return
    }
}
