package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.c */
/* loaded from: classes.dex */
public class C0786c extends androidx.recyclerview.widget.AbstractC0857m {

    /* renamed from: s */
    private static android.animation.TimeInterpolator f2954s;

    /* renamed from: h */
    private java.util.ArrayList<androidx.recyclerview.widget.C0813j.AbstractC0821d0> f2955h;

    /* renamed from: i */
    private java.util.ArrayList<androidx.recyclerview.widget.C0813j.AbstractC0821d0> f2956i;

    /* renamed from: j */
    private java.util.ArrayList<androidx.recyclerview.widget.C0786c.C0796j> f2957j;

    /* renamed from: k */
    private java.util.ArrayList<androidx.recyclerview.widget.C0786c.C0795i> f2958k;

    /* renamed from: l */
    java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.C0813j.AbstractC0821d0>> f2959l;

    /* renamed from: m */
    java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.C0786c.C0796j>> f2960m;

    /* renamed from: n */
    java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.C0786c.C0795i>> f2961n;

    /* renamed from: o */
    java.util.ArrayList<androidx.recyclerview.widget.C0813j.AbstractC0821d0> f2962o;

    /* renamed from: p */
    java.util.ArrayList<androidx.recyclerview.widget.C0813j.AbstractC0821d0> f2963p;

    /* renamed from: q */
    java.util.ArrayList<androidx.recyclerview.widget.C0813j.AbstractC0821d0> f2964q;

    /* renamed from: r */
    java.util.ArrayList<androidx.recyclerview.widget.C0813j.AbstractC0821d0> f2965r;

    /* renamed from: androidx.recyclerview.widget.c$a */
    /* loaded from: classes.dex */
    class RunnableC0787a implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ java.util.ArrayList f2966b;

        /* renamed from: c */
        final /* synthetic */ androidx.recyclerview.widget.C0786c f2967c;

        RunnableC0787a(androidx.recyclerview.widget.C0786c r1, java.util.ArrayList r2) {
                r0 = this;
                r0.f2967c = r1
                r0.f2966b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
                java.util.ArrayList r0 = r8.f2966b
                java.util.Iterator r0 = r0.iterator()
            L_0x0006:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0022
                java.lang.Object r1 = r0.next()
                androidx.recyclerview.widget.c$j r1 = (androidx.recyclerview.widget.C0786c.C0796j) r1
                androidx.recyclerview.widget.c r2 = r8.f2967c
                androidx.recyclerview.widget.j$d0 r3 = r1.f3000a
                int r4 = r1.f3001b
                int r5 = r1.f3002c
                int r6 = r1.f3003d
                int r7 = r1.f3004e
                r2.m1097b(r3, r4, r5, r6, r7)
                goto L_0x0006
            L_0x0022:
                java.util.ArrayList r0 = r8.f2966b
                r0.clear()
                androidx.recyclerview.widget.c r0 = r8.f2967c
                java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.c$j>> r0 = r0.f2960m
                java.util.ArrayList r1 = r8.f2966b
                r0.remove(r1)
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$b */
    /* loaded from: classes.dex */
    class RunnableC0788b implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ java.util.ArrayList f2968b;

        /* renamed from: c */
        final /* synthetic */ androidx.recyclerview.widget.C0786c f2969c;

        RunnableC0788b(androidx.recyclerview.widget.C0786c r1, java.util.ArrayList r2) {
                r0 = this;
                r0.f2969c = r1
                r0.f2968b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                java.util.ArrayList r0 = r3.f2968b
                java.util.Iterator r0 = r0.iterator()
            L_0x0006:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0018
                java.lang.Object r1 = r0.next()
                androidx.recyclerview.widget.c$i r1 = (androidx.recyclerview.widget.C0786c.C0795i) r1
                androidx.recyclerview.widget.c r2 = r3.f2969c
                r2.m1102a(r1)
                goto L_0x0006
            L_0x0018:
                java.util.ArrayList r0 = r3.f2968b
                r0.clear()
                androidx.recyclerview.widget.c r0 = r3.f2969c
                java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.c$i>> r0 = r0.f2961n
                java.util.ArrayList r1 = r3.f2968b
                r0.remove(r1)
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c */
    /* loaded from: classes.dex */
    class RunnableC0789c implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ java.util.ArrayList f2970b;

        /* renamed from: c */
        final /* synthetic */ androidx.recyclerview.widget.C0786c f2971c;

        RunnableC0789c(androidx.recyclerview.widget.C0786c r1, java.util.ArrayList r2) {
                r0 = this;
                r0.f2971c = r1
                r0.f2970b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                java.util.ArrayList r0 = r3.f2970b
                java.util.Iterator r0 = r0.iterator()
            L_0x0006:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0018
                java.lang.Object r1 = r0.next()
                androidx.recyclerview.widget.j$d0 r1 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r1
                androidx.recyclerview.widget.c r2 = r3.f2971c
                r2.m1095t(r1)
                goto L_0x0006
            L_0x0018:
                java.util.ArrayList r0 = r3.f2970b
                r0.clear()
                androidx.recyclerview.widget.c r0 = r3.f2971c
                java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.j$d0>> r0 = r0.f2959l
                java.util.ArrayList r1 = r3.f2970b
                r0.remove(r1)
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$d */
    /* loaded from: classes.dex */
    class C0790d extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ androidx.recyclerview.widget.C0813j.AbstractC0821d0 f2972a;

        /* renamed from: b */
        final /* synthetic */ android.view.ViewPropertyAnimator f2973b;

        /* renamed from: c */
        final /* synthetic */ android.view.View f2974c;

        /* renamed from: d */
        final /* synthetic */ androidx.recyclerview.widget.C0786c f2975d;

        C0790d(androidx.recyclerview.widget.C0786c r1, androidx.recyclerview.widget.C0813j.AbstractC0821d0 r2, android.view.ViewPropertyAnimator r3, android.view.View r4) {
                r0 = this;
                r0.f2975d = r1
                r0.f2972a = r2
                r0.f2973b = r3
                r0.f2974c = r4
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                android.view.ViewPropertyAnimator r2 = r1.f2973b
                r0 = 0
                r2.setListener(r0)
                android.view.View r2 = r1.f2974c
                r0 = 1065353216(0x3f800000, float:1.0)
                r2.setAlpha(r0)
                androidx.recyclerview.widget.c r2 = r1.f2975d
                androidx.recyclerview.widget.j$d0 r0 = r1.f2972a
                r2.m558l(r0)
                androidx.recyclerview.widget.c r2 = r1.f2975d
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r2 = r2.f2964q
                androidx.recyclerview.widget.j$d0 r0 = r1.f2972a
                r2.remove(r0)
                androidx.recyclerview.widget.c r2 = r1.f2975d
                r2.m1096j()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                androidx.recyclerview.widget.c r2 = r1.f2975d
                androidx.recyclerview.widget.j$d0 r0 = r1.f2972a
                r2.m557m(r0)
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$e */
    /* loaded from: classes.dex */
    class C0791e extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ androidx.recyclerview.widget.C0813j.AbstractC0821d0 f2976a;

        /* renamed from: b */
        final /* synthetic */ android.view.View f2977b;

        /* renamed from: c */
        final /* synthetic */ android.view.ViewPropertyAnimator f2978c;

        /* renamed from: d */
        final /* synthetic */ androidx.recyclerview.widget.C0786c f2979d;

        C0791e(androidx.recyclerview.widget.C0786c r1, androidx.recyclerview.widget.C0813j.AbstractC0821d0 r2, android.view.View r3, android.view.ViewPropertyAnimator r4) {
                r0 = this;
                r0.f2979d = r1
                r0.f2976a = r2
                r0.f2977b = r3
                r0.f2978c = r4
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r2) {
                r1 = this;
                android.view.View r2 = r1.f2977b
                r0 = 1065353216(0x3f800000, float:1.0)
                r2.setAlpha(r0)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                android.view.ViewPropertyAnimator r2 = r1.f2978c
                r0 = 0
                r2.setListener(r0)
                androidx.recyclerview.widget.c r2 = r1.f2979d
                androidx.recyclerview.widget.j$d0 r0 = r1.f2976a
                r2.m562h(r0)
                androidx.recyclerview.widget.c r2 = r1.f2979d
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r2 = r2.f2962o
                androidx.recyclerview.widget.j$d0 r0 = r1.f2976a
                r2.remove(r0)
                androidx.recyclerview.widget.c r2 = r1.f2979d
                r2.m1096j()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                androidx.recyclerview.widget.c r2 = r1.f2979d
                androidx.recyclerview.widget.j$d0 r0 = r1.f2976a
                r2.m561i(r0)
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$f */
    /* loaded from: classes.dex */
    class C0792f extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ androidx.recyclerview.widget.C0813j.AbstractC0821d0 f2980a;

        /* renamed from: b */
        final /* synthetic */ int f2981b;

        /* renamed from: c */
        final /* synthetic */ android.view.View f2982c;

        /* renamed from: d */
        final /* synthetic */ int f2983d;

        /* renamed from: e */
        final /* synthetic */ android.view.ViewPropertyAnimator f2984e;

        /* renamed from: f */
        final /* synthetic */ androidx.recyclerview.widget.C0786c f2985f;

        C0792f(androidx.recyclerview.widget.C0786c r1, androidx.recyclerview.widget.C0813j.AbstractC0821d0 r2, int r3, android.view.View r4, int r5, android.view.ViewPropertyAnimator r6) {
                r0 = this;
                r0.f2985f = r1
                r0.f2980a = r2
                r0.f2981b = r3
                r0.f2982c = r4
                r0.f2983d = r5
                r0.f2984e = r6
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r2) {
                r1 = this;
                int r2 = r1.f2981b
                r0 = 0
                if (r2 == 0) goto L_0x000a
                android.view.View r2 = r1.f2982c
                r2.setTranslationX(r0)
            L_0x000a:
                int r2 = r1.f2983d
                if (r2 == 0) goto L_0x0013
                android.view.View r2 = r1.f2982c
                r2.setTranslationY(r0)
            L_0x0013:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                android.view.ViewPropertyAnimator r2 = r1.f2984e
                r0 = 0
                r2.setListener(r0)
                androidx.recyclerview.widget.c r2 = r1.f2985f
                androidx.recyclerview.widget.j$d0 r0 = r1.f2980a
                r2.m560j(r0)
                androidx.recyclerview.widget.c r2 = r1.f2985f
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r2 = r2.f2963p
                androidx.recyclerview.widget.j$d0 r0 = r1.f2980a
                r2.remove(r0)
                androidx.recyclerview.widget.c r2 = r1.f2985f
                r2.m1096j()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                androidx.recyclerview.widget.c r2 = r1.f2985f
                androidx.recyclerview.widget.j$d0 r0 = r1.f2980a
                r2.m559k(r0)
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$g */
    /* loaded from: classes.dex */
    class C0793g extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ androidx.recyclerview.widget.C0786c.C0795i f2986a;

        /* renamed from: b */
        final /* synthetic */ android.view.ViewPropertyAnimator f2987b;

        /* renamed from: c */
        final /* synthetic */ android.view.View f2988c;

        /* renamed from: d */
        final /* synthetic */ androidx.recyclerview.widget.C0786c f2989d;

        C0793g(androidx.recyclerview.widget.C0786c r1, androidx.recyclerview.widget.C0786c.C0795i r2, android.view.ViewPropertyAnimator r3, android.view.View r4) {
                r0 = this;
                r0.f2989d = r1
                r0.f2986a = r2
                r0.f2987b = r3
                r0.f2988c = r4
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r3) {
                r2 = this;
                android.view.ViewPropertyAnimator r3 = r2.f2987b
                r0 = 0
                r3.setListener(r0)
                android.view.View r3 = r2.f2988c
                r0 = 1065353216(0x3f800000, float:1.0)
                r3.setAlpha(r0)
                android.view.View r3 = r2.f2988c
                r0 = 0
                r3.setTranslationX(r0)
                android.view.View r3 = r2.f2988c
                r3.setTranslationY(r0)
                androidx.recyclerview.widget.c r3 = r2.f2989d
                androidx.recyclerview.widget.c$i r0 = r2.f2986a
                androidx.recyclerview.widget.j$d0 r0 = r0.f2994a
                r1 = 1
                r3.m570a(r0, r1)
                androidx.recyclerview.widget.c r3 = r2.f2989d
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r3 = r3.f2965r
                androidx.recyclerview.widget.c$i r0 = r2.f2986a
                androidx.recyclerview.widget.j$d0 r0 = r0.f2994a
                r3.remove(r0)
                androidx.recyclerview.widget.c r3 = r2.f2989d
                r3.m1096j()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r3) {
                r2 = this;
                androidx.recyclerview.widget.c r3 = r2.f2989d
                androidx.recyclerview.widget.c$i r0 = r2.f2986a
                androidx.recyclerview.widget.j$d0 r0 = r0.f2994a
                r1 = 1
                r3.m568b(r0, r1)
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$h */
    /* loaded from: classes.dex */
    class C0794h extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ androidx.recyclerview.widget.C0786c.C0795i f2990a;

        /* renamed from: b */
        final /* synthetic */ android.view.ViewPropertyAnimator f2991b;

        /* renamed from: c */
        final /* synthetic */ android.view.View f2992c;

        /* renamed from: d */
        final /* synthetic */ androidx.recyclerview.widget.C0786c f2993d;

        C0794h(androidx.recyclerview.widget.C0786c r1, androidx.recyclerview.widget.C0786c.C0795i r2, android.view.ViewPropertyAnimator r3, android.view.View r4) {
                r0 = this;
                r0.f2993d = r1
                r0.f2990a = r2
                r0.f2991b = r3
                r0.f2992c = r4
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r3) {
                r2 = this;
                android.view.ViewPropertyAnimator r3 = r2.f2991b
                r0 = 0
                r3.setListener(r0)
                android.view.View r3 = r2.f2992c
                r0 = 1065353216(0x3f800000, float:1.0)
                r3.setAlpha(r0)
                android.view.View r3 = r2.f2992c
                r0 = 0
                r3.setTranslationX(r0)
                android.view.View r3 = r2.f2992c
                r3.setTranslationY(r0)
                androidx.recyclerview.widget.c r3 = r2.f2993d
                androidx.recyclerview.widget.c$i r0 = r2.f2990a
                androidx.recyclerview.widget.j$d0 r0 = r0.f2995b
                r1 = 0
                r3.m570a(r0, r1)
                androidx.recyclerview.widget.c r3 = r2.f2993d
                java.util.ArrayList<androidx.recyclerview.widget.j$d0> r3 = r3.f2965r
                androidx.recyclerview.widget.c$i r0 = r2.f2990a
                androidx.recyclerview.widget.j$d0 r0 = r0.f2995b
                r3.remove(r0)
                androidx.recyclerview.widget.c r3 = r2.f2993d
                r3.m1096j()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r3) {
                r2 = this;
                androidx.recyclerview.widget.c r3 = r2.f2993d
                androidx.recyclerview.widget.c$i r0 = r2.f2990a
                androidx.recyclerview.widget.j$d0 r0 = r0.f2995b
                r1 = 0
                r3.m568b(r0, r1)
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$i */
    /* loaded from: classes.dex */
    private static class C0795i {

        /* renamed from: a */
        public androidx.recyclerview.widget.C0813j.AbstractC0821d0 f2994a;

        /* renamed from: b */
        public androidx.recyclerview.widget.C0813j.AbstractC0821d0 f2995b;

        /* renamed from: c */
        public int f2996c;

        /* renamed from: d */
        public int f2997d;

        /* renamed from: e */
        public int f2998e;

        /* renamed from: f */
        public int f2999f;

        private C0795i(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1, androidx.recyclerview.widget.C0813j.AbstractC0821d0 r2) {
                r0 = this;
                r0.<init>()
                r0.f2994a = r1
                r0.f2995b = r2
                return
        }

        C0795i(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1, androidx.recyclerview.widget.C0813j.AbstractC0821d0 r2, int r3, int r4, int r5, int r6) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.f2996c = r3
                r0.f2997d = r4
                r0.f2998e = r5
                r0.f2999f = r6
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ChangeInfo{oldHolder="
                r0.append(r1)
                androidx.recyclerview.widget.j$d0 r1 = r2.f2994a
                r0.append(r1)
                java.lang.String r1 = ", newHolder="
                r0.append(r1)
                androidx.recyclerview.widget.j$d0 r1 = r2.f2995b
                r0.append(r1)
                java.lang.String r1 = ", fromX="
                r0.append(r1)
                int r1 = r2.f2996c
                r0.append(r1)
                java.lang.String r1 = ", fromY="
                r0.append(r1)
                int r1 = r2.f2997d
                r0.append(r1)
                java.lang.String r1 = ", toX="
                r0.append(r1)
                int r1 = r2.f2998e
                r0.append(r1)
                java.lang.String r1 = ", toY="
                r0.append(r1)
                int r1 = r2.f2999f
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$j */
    /* loaded from: classes.dex */
    private static class C0796j {

        /* renamed from: a */
        public androidx.recyclerview.widget.C0813j.AbstractC0821d0 f3000a;

        /* renamed from: b */
        public int f3001b;

        /* renamed from: c */
        public int f3002c;

        /* renamed from: d */
        public int f3003d;

        /* renamed from: e */
        public int f3004e;

        C0796j(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                r0.<init>()
                r0.f3000a = r1
                r0.f3001b = r2
                r0.f3002c = r3
                r0.f3003d = r4
                r0.f3004e = r5
                return
        }
    }

    public C0786c() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2955h = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2956i = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2957j = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2958k = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2959l = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2960m = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2961n = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2962o = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2963p = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2964q = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2965r = r0
            return
    }

    /* renamed from: a */
    private void m1099a(java.util.List<androidx.recyclerview.widget.C0786c.C0795i> r4, androidx.recyclerview.widget.C0813j.AbstractC0821d0 r5) {
            r3 = this;
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L_0x0006:
            if (r0 < 0) goto L_0x0022
            java.lang.Object r1 = r4.get(r0)
            androidx.recyclerview.widget.c$i r1 = (androidx.recyclerview.widget.C0786c.C0795i) r1
            boolean r2 = r3.m1101a(r1, r5)
            if (r2 == 0) goto L_0x001f
            androidx.recyclerview.widget.j$d0 r2 = r1.f2994a
            if (r2 != 0) goto L_0x001f
            androidx.recyclerview.widget.j$d0 r2 = r1.f2995b
            if (r2 != 0) goto L_0x001f
            r4.remove(r1)
        L_0x001f:
            int r0 = r0 + (-1)
            goto L_0x0006
        L_0x0022:
            return
    }

    /* renamed from: a */
    private boolean m1101a(androidx.recyclerview.widget.C0786c.C0795i r5, androidx.recyclerview.widget.C0813j.AbstractC0821d0 r6) {
            r4 = this;
            androidx.recyclerview.widget.j$d0 r0 = r5.f2995b
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto L_0x000a
            r5.f2995b = r2
            goto L_0x0011
        L_0x000a:
            androidx.recyclerview.widget.j$d0 r0 = r5.f2994a
            if (r0 != r6) goto L_0x0027
            r5.f2994a = r2
            r3 = 1
        L_0x0011:
            android.view.View r5 = r6.f3179a
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.setAlpha(r0)
            android.view.View r5 = r6.f3179a
            r0 = 0
            r5.setTranslationX(r0)
            android.view.View r5 = r6.f3179a
            r5.setTranslationY(r0)
            r4.m570a(r6, r3)
            return r1
        L_0x0027:
            return r3
    }

    /* renamed from: b */
    private void m1098b(androidx.recyclerview.widget.C0786c.C0795i r2) {
            r1 = this;
            androidx.recyclerview.widget.j$d0 r0 = r2.f2994a
            if (r0 == 0) goto L_0x0007
            r1.m1101a(r2, r0)
        L_0x0007:
            androidx.recyclerview.widget.j$d0 r0 = r2.f2995b
            if (r0 == 0) goto L_0x000e
            r1.m1101a(r2, r0)
        L_0x000e:
            return
    }

    /* renamed from: u */
    private void m1094u(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r5) {
            r4 = this;
            android.view.View r0 = r5.f3179a
            android.view.ViewPropertyAnimator r1 = r0.animate()
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r2 = r4.f2964q
            r2.add(r5)
            long r2 = r4.m805f()
            android.view.ViewPropertyAnimator r2 = r1.setDuration(r2)
            r3 = 0
            android.view.ViewPropertyAnimator r2 = r2.alpha(r3)
            androidx.recyclerview.widget.c$d r3 = new androidx.recyclerview.widget.c$d
            r3.<init>(r4, r5, r1, r0)
            android.view.ViewPropertyAnimator r5 = r2.setListener(r3)
            r5.start()
            return
    }

    /* renamed from: v */
    private void m1093v(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r3) {
            r2 = this;
            android.animation.TimeInterpolator r0 = androidx.recyclerview.widget.C0786c.f2954s
            if (r0 != 0) goto L_0x000f
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            android.animation.TimeInterpolator r0 = r0.getInterpolator()
            androidx.recyclerview.widget.C0786c.f2954s = r0
        L_0x000f:
            android.view.View r0 = r3.f3179a
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.animation.TimeInterpolator r1 = androidx.recyclerview.widget.C0786c.f2954s
            r0.setInterpolator(r1)
            r2.mo810c(r3)
            return
    }

    /* renamed from: a */
    void m1102a(androidx.recyclerview.widget.C0786c.C0795i r7) {
            r6 = this;
            androidx.recyclerview.widget.j$d0 r0 = r7.f2994a
            r1 = 0
            if (r0 != 0) goto L_0x0007
            r0 = r1
            goto L_0x0009
        L_0x0007:
            android.view.View r0 = r0.f3179a
        L_0x0009:
            androidx.recyclerview.widget.j$d0 r2 = r7.f2995b
            if (r2 == 0) goto L_0x000f
            android.view.View r1 = r2.f3179a
        L_0x000f:
            r2 = 0
            if (r0 == 0) goto L_0x0047
            android.view.ViewPropertyAnimator r3 = r0.animate()
            long r4 = r6.m809d()
            android.view.ViewPropertyAnimator r3 = r3.setDuration(r4)
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r4 = r6.f2965r
            androidx.recyclerview.widget.j$d0 r5 = r7.f2994a
            r4.add(r5)
            int r4 = r7.f2998e
            int r5 = r7.f2996c
            int r4 = r4 - r5
            float r4 = (float) r4
            r3.translationX(r4)
            int r4 = r7.f2999f
            int r5 = r7.f2997d
            int r4 = r4 - r5
            float r4 = (float) r4
            r3.translationY(r4)
            android.view.ViewPropertyAnimator r4 = r3.alpha(r2)
            androidx.recyclerview.widget.c$g r5 = new androidx.recyclerview.widget.c$g
            r5.<init>(r6, r7, r3, r0)
            android.view.ViewPropertyAnimator r0 = r4.setListener(r5)
            r0.start()
        L_0x0047:
            if (r1 == 0) goto L_0x0076
            android.view.ViewPropertyAnimator r0 = r1.animate()
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r3 = r6.f2965r
            androidx.recyclerview.widget.j$d0 r4 = r7.f2995b
            r3.add(r4)
            android.view.ViewPropertyAnimator r3 = r0.translationX(r2)
            android.view.ViewPropertyAnimator r2 = r3.translationY(r2)
            long r3 = r6.m809d()
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = r2.alpha(r3)
            androidx.recyclerview.widget.c$h r3 = new androidx.recyclerview.widget.c$h
            r3.<init>(r6, r7, r0, r1)
            android.view.ViewPropertyAnimator r7 = r2.setListener(r3)
            r7.start()
        L_0x0076:
            return
    }

    /* renamed from: a */
    void m1100a(java.util.List<androidx.recyclerview.widget.C0813j.AbstractC0821d0> r3) {
            r2 = this;
            int r0 = r3.size()
            int r0 = r0 + (-1)
        L_0x0006:
            if (r0 < 0) goto L_0x001a
            java.lang.Object r1 = r3.get(r0)
            androidx.recyclerview.widget.j$d0 r1 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r1
            android.view.View r1 = r1.f3179a
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r1.cancel()
            int r0 = r0 + (-1)
            goto L_0x0006
        L_0x001a:
            return
    }

    @Override // androidx.recyclerview.widget.AbstractC0857m
    /* renamed from: a */
    public boolean mo574a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r9, int r10, int r11, int r12, int r13) {
            r8 = this;
            android.view.View r0 = r9.f3179a
            float r1 = r0.getTranslationX()
            int r1 = (int) r1
            int r4 = r10 + r1
            android.view.View r10 = r9.f3179a
            float r10 = r10.getTranslationY()
            int r10 = (int) r10
            int r5 = r11 + r10
            r8.m1093v(r9)
            int r10 = r12 - r4
            int r11 = r13 - r5
            if (r10 != 0) goto L_0x0022
            if (r11 != 0) goto L_0x0022
            r8.m560j(r9)
            r9 = 0
            return r9
        L_0x0022:
            if (r10 == 0) goto L_0x0029
            int r10 = -r10
            float r10 = (float) r10
            r0.setTranslationX(r10)
        L_0x0029:
            if (r11 == 0) goto L_0x0030
            int r10 = -r11
            float r10 = (float) r10
            r0.setTranslationY(r10)
        L_0x0030:
            java.util.ArrayList<androidx.recyclerview.widget.c$j> r10 = r8.f2957j
            androidx.recyclerview.widget.c$j r11 = new androidx.recyclerview.widget.c$j
            r2 = r11
            r3 = r9
            r6 = r12
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r10.add(r11)
            r9 = 1
            return r9
    }

    @Override // androidx.recyclerview.widget.AbstractC0857m
    /* renamed from: a */
    public boolean mo573a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r10, androidx.recyclerview.widget.C0813j.AbstractC0821d0 r11, int r12, int r13, int r14, int r15) {
            r9 = this;
            if (r10 != r11) goto L_0x000d
            r0 = r9
            r1 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            boolean r10 = r0.mo574a(r1, r2, r3, r4, r5)
            return r10
        L_0x000d:
            android.view.View r0 = r10.f3179a
            float r0 = r0.getTranslationX()
            android.view.View r1 = r10.f3179a
            float r1 = r1.getTranslationY()
            android.view.View r2 = r10.f3179a
            float r2 = r2.getAlpha()
            r9.m1093v(r10)
            int r3 = r14 - r12
            float r3 = (float) r3
            float r3 = r3 - r0
            int r3 = (int) r3
            int r4 = r15 - r13
            float r4 = (float) r4
            float r4 = r4 - r1
            int r4 = (int) r4
            android.view.View r5 = r10.f3179a
            r5.setTranslationX(r0)
            android.view.View r0 = r10.f3179a
            r0.setTranslationY(r1)
            android.view.View r0 = r10.f3179a
            r0.setAlpha(r2)
            if (r11 == 0) goto L_0x0054
            r9.m1093v(r11)
            android.view.View r0 = r11.f3179a
            int r1 = -r3
            float r1 = (float) r1
            r0.setTranslationX(r1)
            android.view.View r0 = r11.f3179a
            int r1 = -r4
            float r1 = (float) r1
            r0.setTranslationY(r1)
            android.view.View r0 = r11.f3179a
            r1 = 0
            r0.setAlpha(r1)
        L_0x0054:
            java.util.ArrayList<androidx.recyclerview.widget.c$i> r0 = r9.f2958k
            androidx.recyclerview.widget.c$i r8 = new androidx.recyclerview.widget.c$i
            r1 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.add(r8)
            r10 = 1
            return r10
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0829l
    /* renamed from: a */
    public boolean mo815a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r2, java.util.List<java.lang.Object> r3) {
            r1 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x000f
            boolean r2 = super.mo815a(r2, r3)
            if (r2 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r2 = 0
            goto L_0x0010
        L_0x000f:
            r2 = 1
        L_0x0010:
            return r2
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0829l
    /* renamed from: b */
    public void mo813b() {
            r7 = this;
            java.util.ArrayList<androidx.recyclerview.widget.c$j> r0 = r7.f2957j
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L_0x0008:
            r1 = 0
            if (r0 < 0) goto L_0x002a
            java.util.ArrayList<androidx.recyclerview.widget.c$j> r2 = r7.f2957j
            java.lang.Object r2 = r2.get(r0)
            androidx.recyclerview.widget.c$j r2 = (androidx.recyclerview.widget.C0786c.C0796j) r2
            androidx.recyclerview.widget.j$d0 r3 = r2.f3000a
            android.view.View r3 = r3.f3179a
            r3.setTranslationY(r1)
            r3.setTranslationX(r1)
            androidx.recyclerview.widget.j$d0 r1 = r2.f3000a
            r7.m560j(r1)
            java.util.ArrayList<androidx.recyclerview.widget.c$j> r1 = r7.f2957j
            r1.remove(r0)
            int r0 = r0 + (-1)
            goto L_0x0008
        L_0x002a:
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r7.f2955h
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L_0x0032:
            if (r0 < 0) goto L_0x0047
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r2 = r7.f2955h
            java.lang.Object r2 = r2.get(r0)
            androidx.recyclerview.widget.j$d0 r2 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r2
            r7.m558l(r2)
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r2 = r7.f2955h
            r2.remove(r0)
            int r0 = r0 + (-1)
            goto L_0x0032
        L_0x0047:
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r7.f2956i
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L_0x004f:
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 < 0) goto L_0x006b
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r3 = r7.f2956i
            java.lang.Object r3 = r3.get(r0)
            androidx.recyclerview.widget.j$d0 r3 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r3
            android.view.View r4 = r3.f3179a
            r4.setAlpha(r2)
            r7.m562h(r3)
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r2 = r7.f2956i
            r2.remove(r0)
            int r0 = r0 + (-1)
            goto L_0x004f
        L_0x006b:
            java.util.ArrayList<androidx.recyclerview.widget.c$i> r0 = r7.f2958k
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L_0x0073:
            if (r0 < 0) goto L_0x0083
            java.util.ArrayList<androidx.recyclerview.widget.c$i> r3 = r7.f2958k
            java.lang.Object r3 = r3.get(r0)
            androidx.recyclerview.widget.c$i r3 = (androidx.recyclerview.widget.C0786c.C0795i) r3
            r7.m1098b(r3)
            int r0 = r0 + (-1)
            goto L_0x0073
        L_0x0083:
            java.util.ArrayList<androidx.recyclerview.widget.c$i> r0 = r7.f2958k
            r0.clear()
            boolean r0 = r7.mo804g()
            if (r0 != 0) goto L_0x008f
            return
        L_0x008f:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.c$j>> r0 = r7.f2960m
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L_0x0097:
            if (r0 < 0) goto L_0x00d2
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.c$j>> r3 = r7.f2960m
            java.lang.Object r3 = r3.get(r0)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            int r4 = r4 + (-1)
        L_0x00a7:
            if (r4 < 0) goto L_0x00cf
            java.lang.Object r5 = r3.get(r4)
            androidx.recyclerview.widget.c$j r5 = (androidx.recyclerview.widget.C0786c.C0796j) r5
            androidx.recyclerview.widget.j$d0 r6 = r5.f3000a
            android.view.View r6 = r6.f3179a
            r6.setTranslationY(r1)
            r6.setTranslationX(r1)
            androidx.recyclerview.widget.j$d0 r5 = r5.f3000a
            r7.m560j(r5)
            r3.remove(r4)
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x00cc
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.c$j>> r5 = r7.f2960m
            r5.remove(r3)
        L_0x00cc:
            int r4 = r4 + (-1)
            goto L_0x00a7
        L_0x00cf:
            int r0 = r0 + (-1)
            goto L_0x0097
        L_0x00d2:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.j$d0>> r0 = r7.f2959l
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L_0x00da:
            if (r0 < 0) goto L_0x010e
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.j$d0>> r1 = r7.f2959l
            java.lang.Object r1 = r1.get(r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r3 = r1.size()
            int r3 = r3 + (-1)
        L_0x00ea:
            if (r3 < 0) goto L_0x010b
            java.lang.Object r4 = r1.get(r3)
            androidx.recyclerview.widget.j$d0 r4 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r4
            android.view.View r5 = r4.f3179a
            r5.setAlpha(r2)
            r7.m562h(r4)
            r1.remove(r3)
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x0108
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.j$d0>> r4 = r7.f2959l
            r4.remove(r1)
        L_0x0108:
            int r3 = r3 + (-1)
            goto L_0x00ea
        L_0x010b:
            int r0 = r0 + (-1)
            goto L_0x00da
        L_0x010e:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.c$i>> r0 = r7.f2961n
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L_0x0116:
            if (r0 < 0) goto L_0x0142
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.c$i>> r1 = r7.f2961n
            java.lang.Object r1 = r1.get(r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            int r2 = r2 + (-1)
        L_0x0126:
            if (r2 < 0) goto L_0x013f
            java.lang.Object r3 = r1.get(r2)
            androidx.recyclerview.widget.c$i r3 = (androidx.recyclerview.widget.C0786c.C0795i) r3
            r7.m1098b(r3)
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x013c
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.c$i>> r3 = r7.f2961n
            r3.remove(r1)
        L_0x013c:
            int r2 = r2 + (-1)
            goto L_0x0126
        L_0x013f:
            int r0 = r0 + (-1)
            goto L_0x0116
        L_0x0142:
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r7.f2964q
            r7.m1100a(r0)
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r7.f2963p
            r7.m1100a(r0)
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r7.f2962o
            r7.m1100a(r0)
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r7.f2965r
            r7.m1100a(r0)
            r7.m818a()
            return
    }

    /* renamed from: b */
    void m1097b(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            android.view.View r4 = r8.f3179a
            int r3 = r11 - r9
            int r5 = r12 - r10
            r9 = 0
            if (r3 == 0) goto L_0x0010
            android.view.ViewPropertyAnimator r10 = r4.animate()
            r10.translationX(r9)
        L_0x0010:
            if (r5 == 0) goto L_0x0019
            android.view.ViewPropertyAnimator r10 = r4.animate()
            r10.translationY(r9)
        L_0x0019:
            android.view.ViewPropertyAnimator r6 = r4.animate()
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r9 = r7.f2963p
            r9.add(r8)
            long r9 = r7.m807e()
            android.view.ViewPropertyAnimator r9 = r6.setDuration(r9)
            androidx.recyclerview.widget.c$f r10 = new androidx.recyclerview.widget.c$f
            r0 = r10
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            android.view.ViewPropertyAnimator r8 = r9.setListener(r10)
            r8.start()
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0829l
    /* renamed from: c */
    public void mo810c(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r8) {
            r7 = this;
            android.view.View r0 = r8.f3179a
            android.view.ViewPropertyAnimator r1 = r0.animate()
            r1.cancel()
            java.util.ArrayList<androidx.recyclerview.widget.c$j> r1 = r7.f2957j
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L_0x0011:
            r2 = 0
            if (r1 < 0) goto L_0x0031
            java.util.ArrayList<androidx.recyclerview.widget.c$j> r3 = r7.f2957j
            java.lang.Object r3 = r3.get(r1)
            androidx.recyclerview.widget.c$j r3 = (androidx.recyclerview.widget.C0786c.C0796j) r3
            androidx.recyclerview.widget.j$d0 r3 = r3.f3000a
            if (r3 != r8) goto L_0x002e
            r0.setTranslationY(r2)
            r0.setTranslationX(r2)
            r7.m560j(r8)
            java.util.ArrayList<androidx.recyclerview.widget.c$j> r2 = r7.f2957j
            r2.remove(r1)
        L_0x002e:
            int r1 = r1 + (-1)
            goto L_0x0011
        L_0x0031:
            java.util.ArrayList<androidx.recyclerview.widget.c$i> r1 = r7.f2958k
            r7.m1099a(r1, r8)
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r1 = r7.f2955h
            boolean r1 = r1.remove(r8)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x0046
            r0.setAlpha(r3)
            r7.m558l(r8)
        L_0x0046:
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r1 = r7.f2956i
            boolean r1 = r1.remove(r8)
            if (r1 == 0) goto L_0x0054
            r0.setAlpha(r3)
            r7.m562h(r8)
        L_0x0054:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.c$i>> r1 = r7.f2961n
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L_0x005c:
            if (r1 < 0) goto L_0x0077
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.c$i>> r4 = r7.f2961n
            java.lang.Object r4 = r4.get(r1)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r7.m1099a(r4, r8)
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0074
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.c$i>> r4 = r7.f2961n
            r4.remove(r1)
        L_0x0074:
            int r1 = r1 + (-1)
            goto L_0x005c
        L_0x0077:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.c$j>> r1 = r7.f2960m
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L_0x007f:
            if (r1 < 0) goto L_0x00b9
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.c$j>> r4 = r7.f2960m
            java.lang.Object r4 = r4.get(r1)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r5 = r4.size()
            int r5 = r5 + (-1)
        L_0x008f:
            if (r5 < 0) goto L_0x00b6
            java.lang.Object r6 = r4.get(r5)
            androidx.recyclerview.widget.c$j r6 = (androidx.recyclerview.widget.C0786c.C0796j) r6
            androidx.recyclerview.widget.j$d0 r6 = r6.f3000a
            if (r6 != r8) goto L_0x00b3
            r0.setTranslationY(r2)
            r0.setTranslationX(r2)
            r7.m560j(r8)
            r4.remove(r5)
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x00b6
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.c$j>> r4 = r7.f2960m
            r4.remove(r1)
            goto L_0x00b6
        L_0x00b3:
            int r5 = r5 + (-1)
            goto L_0x008f
        L_0x00b6:
            int r1 = r1 + (-1)
            goto L_0x007f
        L_0x00b9:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.j$d0>> r1 = r7.f2959l
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L_0x00c1:
            if (r1 < 0) goto L_0x00e5
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.j$d0>> r2 = r7.f2959l
            java.lang.Object r2 = r2.get(r1)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r4 = r2.remove(r8)
            if (r4 == 0) goto L_0x00e2
            r0.setAlpha(r3)
            r7.m562h(r8)
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00e2
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.j$d0>> r2 = r7.f2959l
            r2.remove(r1)
        L_0x00e2:
            int r1 = r1 + (-1)
            goto L_0x00c1
        L_0x00e5:
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r7.f2964q
            r0.remove(r8)
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r7.f2962o
            r0.remove(r8)
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r7.f2965r
            r0.remove(r8)
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r7.f2963p
            r0.remove(r8)
            r7.m1096j()
            return
    }

    @Override // androidx.recyclerview.widget.AbstractC0857m
    /* renamed from: f */
    public boolean mo564f(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r3) {
            r2 = this;
            r2.m1093v(r3)
            android.view.View r0 = r3.f3179a
            r1 = 0
            r0.setAlpha(r1)
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r2.f2956i
            r0.add(r3)
            r3 = 1
            return r3
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0829l
    /* renamed from: g */
    public boolean mo804g() {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r1.f2956i
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x005b
            java.util.ArrayList<androidx.recyclerview.widget.c$i> r0 = r1.f2958k
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x005b
            java.util.ArrayList<androidx.recyclerview.widget.c$j> r0 = r1.f2957j
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x005b
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r1.f2955h
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x005b
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r1.f2963p
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x005b
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r1.f2964q
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x005b
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r1.f2962o
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x005b
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r1.f2965r
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x005b
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.c$j>> r0 = r1.f2960m
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x005b
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.j$d0>> r0 = r1.f2959l
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x005b
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.c$i>> r0 = r1.f2961n
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r0 = 0
            goto L_0x005c
        L_0x005b:
            r0 = 1
        L_0x005c:
            return r0
    }

    @Override // androidx.recyclerview.widget.AbstractC0857m
    /* renamed from: g */
    public boolean mo563g(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r2) {
            r1 = this;
            r1.m1093v(r2)
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r1.f2955h
            r0.add(r2)
            r2 = 1
            return r2
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0829l
    /* renamed from: i */
    public void mo802i() {
            r10 = this;
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r0 = r10.f2955h
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            java.util.ArrayList<androidx.recyclerview.widget.c$j> r1 = r10.f2957j
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            java.util.ArrayList<androidx.recyclerview.widget.c$i> r2 = r10.f2958k
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ 1
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r3 = r10.f2956i
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ 1
            if (r0 != 0) goto L_0x0029
            if (r1 != 0) goto L_0x0029
            if (r3 != 0) goto L_0x0029
            if (r2 != 0) goto L_0x0029
            return
        L_0x0029:
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r4 = r10.f2955h
            java.util.Iterator r4 = r4.iterator()
        L_0x002f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x003f
            java.lang.Object r5 = r4.next()
            androidx.recyclerview.widget.j$d0 r5 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r5
            r10.m1094u(r5)
            goto L_0x002f
        L_0x003f:
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r4 = r10.f2955h
            r4.clear()
            r4 = 0
            if (r1 == 0) goto L_0x0077
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList<androidx.recyclerview.widget.c$j> r6 = r10.f2957j
            r5.addAll(r6)
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.c$j>> r6 = r10.f2960m
            r6.add(r5)
            java.util.ArrayList<androidx.recyclerview.widget.c$j> r6 = r10.f2957j
            r6.clear()
            androidx.recyclerview.widget.c$a r6 = new androidx.recyclerview.widget.c$a
            r6.<init>(r10, r5)
            if (r0 == 0) goto L_0x0074
            java.lang.Object r5 = r5.get(r4)
            androidx.recyclerview.widget.c$j r5 = (androidx.recyclerview.widget.C0786c.C0796j) r5
            androidx.recyclerview.widget.j$d0 r5 = r5.f3000a
            android.view.View r5 = r5.f3179a
            long r7 = r10.m805f()
            p000a.p018g.p029l.C0216r.m3431a(r5, r6, r7)
            goto L_0x0077
        L_0x0074:
            r6.run()
        L_0x0077:
            if (r2 == 0) goto L_0x00a9
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList<androidx.recyclerview.widget.c$i> r6 = r10.f2958k
            r5.addAll(r6)
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.c$i>> r6 = r10.f2961n
            r6.add(r5)
            java.util.ArrayList<androidx.recyclerview.widget.c$i> r6 = r10.f2958k
            r6.clear()
            androidx.recyclerview.widget.c$b r6 = new androidx.recyclerview.widget.c$b
            r6.<init>(r10, r5)
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r5 = r5.get(r4)
            androidx.recyclerview.widget.c$i r5 = (androidx.recyclerview.widget.C0786c.C0795i) r5
            androidx.recyclerview.widget.j$d0 r5 = r5.f2994a
            android.view.View r5 = r5.f3179a
            long r7 = r10.m805f()
            p000a.p018g.p029l.C0216r.m3431a(r5, r6, r7)
            goto L_0x00a9
        L_0x00a6:
            r6.run()
        L_0x00a9:
            if (r3 == 0) goto L_0x00f7
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r5 = r10.f2956i
            r3.addAll(r5)
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.j$d0>> r5 = r10.f2959l
            r5.add(r3)
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r5 = r10.f2956i
            r5.clear()
            androidx.recyclerview.widget.c$c r5 = new androidx.recyclerview.widget.c$c
            r5.<init>(r10, r3)
            if (r0 != 0) goto L_0x00cf
            if (r1 != 0) goto L_0x00cf
            if (r2 == 0) goto L_0x00cb
            goto L_0x00cf
        L_0x00cb:
            r5.run()
            goto L_0x00f7
        L_0x00cf:
            r6 = 0
            if (r0 == 0) goto L_0x00d8
            long r8 = r10.m805f()
            goto L_0x00d9
        L_0x00d8:
            r8 = r6
        L_0x00d9:
            if (r1 == 0) goto L_0x00e0
            long r0 = r10.m807e()
            goto L_0x00e1
        L_0x00e0:
            r0 = r6
        L_0x00e1:
            if (r2 == 0) goto L_0x00e7
            long r6 = r10.m809d()
        L_0x00e7:
            long r0 = java.lang.Math.max(r0, r6)
            long r8 = r8 + r0
            java.lang.Object r0 = r3.get(r4)
            androidx.recyclerview.widget.j$d0 r0 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r0
            android.view.View r0 = r0.f3179a
            p000a.p018g.p029l.C0216r.m3431a(r0, r5, r8)
        L_0x00f7:
            return
    }

    /* renamed from: j */
    void m1096j() {
            r1 = this;
            boolean r0 = r1.mo804g()
            if (r0 != 0) goto L_0x0009
            r1.m818a()
        L_0x0009:
            return
    }

    /* renamed from: t */
    void m1095t(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r6) {
            r5 = this;
            android.view.View r0 = r6.f3179a
            android.view.ViewPropertyAnimator r1 = r0.animate()
            java.util.ArrayList<androidx.recyclerview.widget.j$d0> r2 = r5.f2962o
            r2.add(r6)
            r2 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = r1.alpha(r2)
            long r3 = r5.m811c()
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r3)
            androidx.recyclerview.widget.c$e r3 = new androidx.recyclerview.widget.c$e
            r3.<init>(r5, r6, r0, r1)
            android.view.ViewPropertyAnimator r6 = r2.setListener(r3)
            r6.start()
            return
    }
}
