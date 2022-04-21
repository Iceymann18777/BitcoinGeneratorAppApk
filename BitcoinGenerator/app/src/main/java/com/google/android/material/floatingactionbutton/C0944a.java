package com.google.android.material.floatingactionbutton;

/* renamed from: com.google.android.material.floatingactionbutton.a */
/* loaded from: classes.dex */
class C0944a {

    /* renamed from: B */
    static final android.animation.TimeInterpolator f3498B = null;

    /* renamed from: C */
    static final int[] f3499C = null;

    /* renamed from: D */
    static final int[] f3500D = null;

    /* renamed from: E */
    static final int[] f3501E = null;

    /* renamed from: F */
    static final int[] f3502F = null;

    /* renamed from: G */
    static final int[] f3503G = null;

    /* renamed from: H */
    static final int[] f3504H = null;

    /* renamed from: A */
    private android.view.ViewTreeObserver.OnPreDrawListener f3505A;

    /* renamed from: a */
    int f3506a;

    /* renamed from: b */
    android.animation.Animator f3507b;

    /* renamed from: c */
    p050b.p051a.p052a.p053a.p054j.C0884h f3508c;

    /* renamed from: d */
    p050b.p051a.p052a.p053a.p054j.C0884h f3509d;

    /* renamed from: e */
    private p050b.p051a.p052a.p053a.p054j.C0884h f3510e;

    /* renamed from: f */
    private p050b.p051a.p052a.p053a.p054j.C0884h f3511f;

    /* renamed from: g */
    private final com.google.android.material.internal.C0978i f3512g;

    /* renamed from: h */
    p050b.p051a.p052a.p053a.p062q.C0908a f3513h;

    /* renamed from: i */
    private float f3514i;

    /* renamed from: j */
    android.graphics.drawable.Drawable f3515j;

    /* renamed from: k */
    android.graphics.drawable.Drawable f3516k;

    /* renamed from: l */
    com.google.android.material.internal.C0957a f3517l;

    /* renamed from: m */
    android.graphics.drawable.Drawable f3518m;

    /* renamed from: n */
    float f3519n;

    /* renamed from: o */
    float f3520o;

    /* renamed from: p */
    float f3521p;

    /* renamed from: q */
    int f3522q;

    /* renamed from: r */
    float f3523r;

    /* renamed from: s */
    private java.util.ArrayList<android.animation.Animator.AnimatorListener> f3524s;

    /* renamed from: t */
    private java.util.ArrayList<android.animation.Animator.AnimatorListener> f3525t;

    /* renamed from: u */
    final com.google.android.material.internal.C0983l f3526u;

    /* renamed from: v */
    final p050b.p051a.p052a.p053a.p062q.AbstractC0909b f3527v;

    /* renamed from: w */
    private final android.graphics.Rect f3528w;

    /* renamed from: x */
    private final android.graphics.RectF f3529x;

    /* renamed from: y */
    private final android.graphics.RectF f3530y;

    /* renamed from: z */
    private final android.graphics.Matrix f3531z;

    /* renamed from: com.google.android.material.floatingactionbutton.a$a */
    /* loaded from: classes.dex */
    class C0945a extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f3532a;

        /* renamed from: b */
        final /* synthetic */ boolean f3533b;

        /* renamed from: c */
        final /* synthetic */ com.google.android.material.floatingactionbutton.C0944a.AbstractC0951g f3534c;

        /* renamed from: d */
        final /* synthetic */ com.google.android.material.floatingactionbutton.C0944a f3535d;

        C0945a(com.google.android.material.floatingactionbutton.C0944a r1, boolean r2, com.google.android.material.floatingactionbutton.C0944a.AbstractC0951g r3) {
                r0 = this;
                r0.f3535d = r1
                r0.f3533b = r2
                r0.f3534c = r3
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r1) {
                r0 = this;
                r1 = 1
                r0.f3532a = r1
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r3) {
                r2 = this;
                com.google.android.material.floatingactionbutton.a r3 = r2.f3535d
                r0 = 0
                r3.f3506a = r0
                r0 = 0
                r3.f3507b = r0
                boolean r0 = r2.f3532a
                if (r0 != 0) goto L_0x0022
                com.google.android.material.internal.l r3 = r3.f3526u
                boolean r0 = r2.f3533b
                if (r0 == 0) goto L_0x0015
                r0 = 8
                goto L_0x0016
            L_0x0015:
                r0 = 4
            L_0x0016:
                boolean r1 = r2.f3533b
                r3.m70a(r0, r1)
                com.google.android.material.floatingactionbutton.a$g r3 = r2.f3534c
                if (r3 == 0) goto L_0x0022
                r3.mo161b()
            L_0x0022:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r4) {
                r3 = this;
                com.google.android.material.floatingactionbutton.a r0 = r3.f3535d
                com.google.android.material.internal.l r0 = r0.f3526u
                boolean r1 = r3.f3533b
                r2 = 0
                r0.m70a(r2, r1)
                com.google.android.material.floatingactionbutton.a r0 = r3.f3535d
                r1 = 1
                r0.f3506a = r1
                r0.f3507b = r4
                r3.f3532a = r2
                return
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$b */
    /* loaded from: classes.dex */
    class C0946b extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f3536a;

        /* renamed from: b */
        final /* synthetic */ com.google.android.material.floatingactionbutton.C0944a.AbstractC0951g f3537b;

        /* renamed from: c */
        final /* synthetic */ com.google.android.material.floatingactionbutton.C0944a f3538c;

        C0946b(com.google.android.material.floatingactionbutton.C0944a r1, boolean r2, com.google.android.material.floatingactionbutton.C0944a.AbstractC0951g r3) {
                r0 = this;
                r0.f3538c = r1
                r0.f3536a = r2
                r0.f3537b = r3
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                com.google.android.material.floatingactionbutton.a r2 = r1.f3538c
                r0 = 0
                r2.f3506a = r0
                r0 = 0
                r2.f3507b = r0
                com.google.android.material.floatingactionbutton.a$g r2 = r1.f3537b
                if (r2 == 0) goto L_0x000f
                r2.mo162a()
            L_0x000f:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r4) {
                r3 = this;
                com.google.android.material.floatingactionbutton.a r0 = r3.f3538c
                com.google.android.material.internal.l r0 = r0.f3526u
                boolean r1 = r3.f3536a
                r2 = 0
                r0.m70a(r2, r1)
                com.google.android.material.floatingactionbutton.a r0 = r3.f3538c
                r1 = 2
                r0.f3506a = r1
                r0.f3507b = r4
                return
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$c */
    /* loaded from: classes.dex */
    class ViewTreeObserver$OnPreDrawListenerC0947c implements android.view.ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        final /* synthetic */ com.google.android.material.floatingactionbutton.C0944a f3539b;

        ViewTreeObserver$OnPreDrawListenerC0947c(com.google.android.material.floatingactionbutton.C0944a r1) {
                r0 = this;
                r0.f3539b = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
                r1 = this;
                com.google.android.material.floatingactionbutton.a r0 = r1.f3539b
                r0.m170m()
                r0 = 1
                return r0
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$d */
    /* loaded from: classes.dex */
    private class C0948d extends com.google.android.material.floatingactionbutton.C0944a.AbstractC0953i {
        C0948d(com.google.android.material.floatingactionbutton.C0944a r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$e */
    /* loaded from: classes.dex */
    private class C0949e extends com.google.android.material.floatingactionbutton.C0944a.AbstractC0953i {

        /* renamed from: e */
        final /* synthetic */ com.google.android.material.floatingactionbutton.C0944a f3540e;

        C0949e(com.google.android.material.floatingactionbutton.C0944a r2) {
                r1 = this;
                r1.f3540e = r2
                r0 = 0
                r1.<init>(r2, r0)
                return
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$f */
    /* loaded from: classes.dex */
    private class C0950f extends com.google.android.material.floatingactionbutton.C0944a.AbstractC0953i {

        /* renamed from: e */
        final /* synthetic */ com.google.android.material.floatingactionbutton.C0944a f3541e;

        C0950f(com.google.android.material.floatingactionbutton.C0944a r2) {
                r1 = this;
                r1.f3541e = r2
                r0 = 0
                r1.<init>(r2, r0)
                return
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$g */
    /* loaded from: classes.dex */
    interface AbstractC0951g {
        /* renamed from: a */
        void mo162a();

        /* renamed from: b */
        void mo161b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$h */
    /* loaded from: classes.dex */
    private class C0952h extends com.google.android.material.floatingactionbutton.C0944a.AbstractC0953i {

        /* renamed from: e */
        final /* synthetic */ com.google.android.material.floatingactionbutton.C0944a f3542e;

        C0952h(com.google.android.material.floatingactionbutton.C0944a r2) {
                r1 = this;
                r1.f3542e = r2
                r0 = 0
                r1.<init>(r2, r0)
                return
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$i */
    /* loaded from: classes.dex */
    private abstract class AbstractC0953i extends android.animation.AnimatorListenerAdapter implements android.animation.ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f3543a;

        /* renamed from: b */
        private float f3544b;

        /* renamed from: c */
        private float f3545c;

        /* renamed from: d */
        final /* synthetic */ com.google.android.material.floatingactionbutton.C0944a f3546d;

        private AbstractC0953i(com.google.android.material.floatingactionbutton.C0944a r1) {
                r0 = this;
                r0.f3546d = r1
                r0.<init>()
                return
        }

        /* synthetic */ AbstractC0953i(com.google.android.material.floatingactionbutton.C0944a r1, com.google.android.material.floatingactionbutton.C0944a.C0945a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                com.google.android.material.floatingactionbutton.a r2 = r1.f3546d
                b.a.a.a.q.a r2 = r2.f3513h
                float r0 = r1.f3545c
                r2.m392b(r0)
                r2 = 0
                throw r2
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r5) {
                r4 = this;
                boolean r0 = r4.f3543a
                r1 = 0
                if (r0 != 0) goto L_0x000d
                com.google.android.material.floatingactionbutton.a r5 = r4.f3546d
                b.a.a.a.q.a r5 = r5.f3513h
                r5.m393b()
                throw r1
            L_0x000d:
                com.google.android.material.floatingactionbutton.a r0 = r4.f3546d
                b.a.a.a.q.a r0 = r0.f3513h
                float r2 = r4.f3544b
                float r3 = r4.f3545c
                float r3 = r3 - r2
                float r5 = r5.getAnimatedFraction()
                float r3 = r3 * r5
                float r2 = r2 + r3
                r0.m392b(r2)
                throw r1
        }
    }

    static {
            android.animation.TimeInterpolator r0 = p050b.p051a.p052a.p053a.p054j.C0877a.f3282b
            com.google.android.material.floatingactionbutton.C0944a.f3498B = r0
            r0 = 2
            int[] r1 = new int[r0]
            r1 = {x0032: FILL_ARRAY_DATA  , data: [16842919, 16842910} // fill-array
            com.google.android.material.floatingactionbutton.C0944a.f3499C = r1
            r1 = 3
            int[] r1 = new int[r1]
            r1 = {x003a: FILL_ARRAY_DATA  , data: [16843623, 16842908, 16842910} // fill-array
            com.google.android.material.floatingactionbutton.C0944a.f3500D = r1
            int[] r1 = new int[r0]
            r1 = {x0044: FILL_ARRAY_DATA  , data: [16842908, 16842910} // fill-array
            com.google.android.material.floatingactionbutton.C0944a.f3501E = r1
            int[] r0 = new int[r0]
            r0 = {x004c: FILL_ARRAY_DATA  , data: [16843623, 16842910} // fill-array
            com.google.android.material.floatingactionbutton.C0944a.f3502F = r0
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16842910(0x101009e, float:2.3694E-38)
            r0[r1] = r2
            com.google.android.material.floatingactionbutton.C0944a.f3503G = r0
            int[] r0 = new int[r1]
            com.google.android.material.floatingactionbutton.C0944a.f3504H = r0
            return
    }

    C0944a(com.google.android.material.internal.C0983l r2, p050b.p051a.p052a.p053a.p062q.AbstractC0909b r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f3506a = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.f3523r = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.f3528w = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.f3529x = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.f3530y = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.f3531z = r0
            r1.f3526u = r2
            r1.f3527v = r3
            com.google.android.material.internal.i r2 = new com.google.android.material.internal.i
            r2.<init>()
            r1.f3512g = r2
            com.google.android.material.internal.i r2 = r1.f3512g
            int[] r3 = com.google.android.material.floatingactionbutton.C0944a.f3499C
            com.google.android.material.floatingactionbutton.a$f r0 = new com.google.android.material.floatingactionbutton.a$f
            r0.<init>(r1)
            android.animation.ValueAnimator r0 = r1.m187a(r0)
            r2.m82a(r3, r0)
            com.google.android.material.internal.i r2 = r1.f3512g
            int[] r3 = com.google.android.material.floatingactionbutton.C0944a.f3500D
            com.google.android.material.floatingactionbutton.a$e r0 = new com.google.android.material.floatingactionbutton.a$e
            r0.<init>(r1)
            android.animation.ValueAnimator r0 = r1.m187a(r0)
            r2.m82a(r3, r0)
            com.google.android.material.internal.i r2 = r1.f3512g
            int[] r3 = com.google.android.material.floatingactionbutton.C0944a.f3501E
            com.google.android.material.floatingactionbutton.a$e r0 = new com.google.android.material.floatingactionbutton.a$e
            r0.<init>(r1)
            android.animation.ValueAnimator r0 = r1.m187a(r0)
            r2.m82a(r3, r0)
            com.google.android.material.internal.i r2 = r1.f3512g
            int[] r3 = com.google.android.material.floatingactionbutton.C0944a.f3502F
            com.google.android.material.floatingactionbutton.a$e r0 = new com.google.android.material.floatingactionbutton.a$e
            r0.<init>(r1)
            android.animation.ValueAnimator r0 = r1.m187a(r0)
            r2.m82a(r3, r0)
            com.google.android.material.internal.i r2 = r1.f3512g
            int[] r3 = com.google.android.material.floatingactionbutton.C0944a.f3503G
            com.google.android.material.floatingactionbutton.a$h r0 = new com.google.android.material.floatingactionbutton.a$h
            r0.<init>(r1)
            android.animation.ValueAnimator r0 = r1.m187a(r0)
            r2.m82a(r3, r0)
            com.google.android.material.internal.i r2 = r1.f3512g
            int[] r3 = com.google.android.material.floatingactionbutton.C0944a.f3504H
            com.google.android.material.floatingactionbutton.a$d r0 = new com.google.android.material.floatingactionbutton.a$d
            r0.<init>(r1)
            android.animation.ValueAnimator r0 = r1.m187a(r0)
            r2.m82a(r3, r0)
            com.google.android.material.internal.l r2 = r1.f3526u
            float r2 = r2.getRotation()
            r1.f3514i = r2
            return
    }

    /* renamed from: a */
    private android.animation.AnimatorSet m189a(p050b.p051a.p052a.p053a.p054j.C0884h r7, float r8, float r9, float r10) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.material.internal.l r1 = r6.f3526u
            android.util.Property r2 = android.view.View.ALPHA
            r3 = 1
            float[] r4 = new float[r3]
            r5 = 0
            r4[r5] = r8
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r1, r2, r4)
            java.lang.String r1 = "opacity"
            b.a.a.a.j.i r1 = r7.m470a(r1)
            r1.m465a(r8)
            r0.add(r8)
            com.google.android.material.internal.l r8 = r6.f3526u
            android.util.Property r1 = android.view.View.SCALE_X
            float[] r2 = new float[r3]
            r2[r5] = r9
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r8, r1, r2)
            java.lang.String r1 = "scale"
            b.a.a.a.j.i r2 = r7.m470a(r1)
            r2.m465a(r8)
            r0.add(r8)
            com.google.android.material.internal.l r8 = r6.f3526u
            android.util.Property r2 = android.view.View.SCALE_Y
            float[] r4 = new float[r3]
            r4[r5] = r9
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r8, r2, r4)
            b.a.a.a.j.i r9 = r7.m470a(r1)
            r9.m465a(r8)
            r0.add(r8)
            android.graphics.Matrix r8 = r6.f3531z
            r6.m194a(r10, r8)
            com.google.android.material.internal.l r8 = r6.f3526u
            b.a.a.a.j.f r9 = new b.a.a.a.j.f
            r9.<init>()
            b.a.a.a.j.g r10 = new b.a.a.a.j.g
            r10.<init>()
            android.graphics.Matrix[] r1 = new android.graphics.Matrix[r3]
            android.graphics.Matrix r2 = new android.graphics.Matrix
            android.graphics.Matrix r3 = r6.f3531z
            r2.<init>(r3)
            r1[r5] = r2
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofObject(r8, r9, r10, r1)
            java.lang.String r9 = "iconScale"
            b.a.a.a.j.i r7 = r7.m470a(r9)
            r7.m465a(r8)
            r0.add(r8)
            android.animation.AnimatorSet r7 = new android.animation.AnimatorSet
            r7.<init>()
            p050b.p051a.p052a.p053a.p054j.C0878b.m483a(r7, r0)
            return r7
    }

    /* renamed from: a */
    private android.animation.ValueAnimator m187a(com.google.android.material.floatingactionbutton.C0944a.AbstractC0953i r4) {
            r3 = this;
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            android.animation.TimeInterpolator r1 = com.google.android.material.floatingactionbutton.C0944a.f3498B
            r0.setInterpolator(r1)
            r1 = 100
            r0.setDuration(r1)
            r0.addListener(r4)
            r0.addUpdateListener(r4)
            r4 = 2
            float[] r4 = new float[r4]
            r4 = {x0020: FILL_ARRAY_DATA  , data: [0, 1065353216} // fill-array
            r0.setFloatValues(r4)
            return r0
    }

    /* renamed from: a */
    private void m194a(float r6, android.graphics.Matrix r7) {
            r5 = this;
            r7.reset()
            com.google.android.material.internal.l r0 = r5.f3526u
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L_0x0038
            int r1 = r5.f3522q
            if (r1 == 0) goto L_0x0038
            android.graphics.RectF r1 = r5.f3529x
            android.graphics.RectF r2 = r5.f3530y
            int r3 = r0.getIntrinsicWidth()
            float r3 = (float) r3
            int r0 = r0.getIntrinsicHeight()
            float r0 = (float) r0
            r4 = 0
            r1.set(r4, r4, r3, r0)
            int r0 = r5.f3522q
            float r3 = (float) r0
            float r0 = (float) r0
            r2.set(r4, r4, r3, r0)
            android.graphics.Matrix$ScaleToFit r0 = android.graphics.Matrix.ScaleToFit.CENTER
            r7.setRectToRect(r1, r2, r0)
            int r0 = r5.f3522q
            float r1 = (float) r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r0 = (float) r0
            float r0 = r0 / r2
            r7.postScale(r6, r6, r1, r0)
        L_0x0038:
            return
    }

    /* renamed from: q */
    private void m167q() {
            r1 = this;
            android.view.ViewTreeObserver$OnPreDrawListener r0 = r1.f3505A
            if (r0 != 0) goto L_0x000b
            com.google.android.material.floatingactionbutton.a$c r0 = new com.google.android.material.floatingactionbutton.a$c
            r0.<init>(r1)
            r1.f3505A = r0
        L_0x000b:
            return
    }

    /* renamed from: r */
    private p050b.p051a.p052a.p053a.p054j.C0884h m166r() {
            r2 = this;
            b.a.a.a.j.h r0 = r2.f3511f
            if (r0 != 0) goto L_0x0012
            com.google.android.material.internal.l r0 = r2.f3526u
            android.content.Context r0 = r0.getContext()
            int r1 = p050b.p051a.p052a.p053a.C0868a.design_fab_hide_motion_spec
            b.a.a.a.j.h r0 = p050b.p051a.p052a.p053a.p054j.C0884h.m472a(r0, r1)
            r2.f3511f = r0
        L_0x0012:
            b.a.a.a.j.h r0 = r2.f3511f
            return r0
    }

    /* renamed from: s */
    private p050b.p051a.p052a.p053a.p054j.C0884h m165s() {
            r2 = this;
            b.a.a.a.j.h r0 = r2.f3510e
            if (r0 != 0) goto L_0x0012
            com.google.android.material.internal.l r0 = r2.f3526u
            android.content.Context r0 = r0.getContext()
            int r1 = p050b.p051a.p052a.p053a.C0868a.design_fab_show_motion_spec
            b.a.a.a.j.h r0 = p050b.p051a.p052a.p053a.p054j.C0884h.m472a(r0, r1)
            r2.f3510e = r0
        L_0x0012:
            b.a.a.a.j.h r0 = r2.f3510e
            return r0
    }

    /* renamed from: t */
    private boolean m164t() {
            r1 = this;
            com.google.android.material.internal.l r0 = r1.f3526u
            boolean r0 = p000a.p018g.p029l.C0216r.m3397x(r0)
            if (r0 == 0) goto L_0x0012
            com.google.android.material.internal.l r0 = r1.f3526u
            boolean r0 = r0.isInEditMode()
            if (r0 != 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
    }

    /* renamed from: u */
    private void m163u() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 19
            if (r0 != r2) goto L_0x002b
            float r0 = r3.f3514i
            r2 = 1119092736(0x42b40000, float:90.0)
            float r0 = r0 % r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x001d
            com.google.android.material.internal.l r0 = r3.f3526u
            int r0 = r0.getLayerType()
            r2 = 1
            if (r0 == r2) goto L_0x002b
            com.google.android.material.internal.l r0 = r3.f3526u
            goto L_0x0028
        L_0x001d:
            com.google.android.material.internal.l r0 = r3.f3526u
            int r0 = r0.getLayerType()
            if (r0 == 0) goto L_0x002b
            com.google.android.material.internal.l r0 = r3.f3526u
            r2 = 0
        L_0x0028:
            r0.setLayerType(r2, r1)
        L_0x002b:
            b.a.a.a.q.a r0 = r3.f3513h
            if (r0 != 0) goto L_0x003b
            com.google.android.material.internal.a r0 = r3.f3517l
            if (r0 != 0) goto L_0x0034
            return
        L_0x0034:
            float r2 = r3.f3514i
            float r2 = -r2
            r0.m141a(r2)
            throw r1
        L_0x003b:
            float r2 = r3.f3514i
            float r2 = -r2
            r0.m396a(r2)
            throw r1
    }

    /* renamed from: a */
    final android.graphics.drawable.Drawable m196a() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f3518m
            return r0
    }

    /* renamed from: a */
    final void m195a(float r3) {
            r2 = this;
            float r0 = r2.f3519n
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0011
            r2.f3519n = r3
            float r3 = r2.f3519n
            float r0 = r2.f3520o
            float r1 = r2.f3521p
            r2.mo159a(r3, r0, r1)
        L_0x0011:
            return
    }

    /* renamed from: a */
    void mo159a(float r1, float r2, float r3) {
            r0 = this;
            b.a.a.a.q.a r2 = r0.f3513h
            if (r2 != 0) goto L_0x0005
            return
        L_0x0005:
            float r3 = r0.f3521p
            float r3 = r3 + r1
            r2.m395a(r1, r3)
            r1 = 0
            throw r1
    }

    /* renamed from: a */
    public void m193a(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r0 = r1.f3525t
            if (r0 != 0) goto L_0x000b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3525t = r0
        L_0x000b:
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r0 = r1.f3525t
            r0.add(r2)
            return
    }

    /* renamed from: a */
    void m192a(android.content.res.ColorStateList r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f3515j
            if (r0 == 0) goto L_0x0007
            androidx.core.graphics.drawable.C0698a.m1603a(r0, r2)
        L_0x0007:
            com.google.android.material.internal.a r0 = r1.f3517l
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            r0.m140a(r2)
            r2 = 0
            throw r2
    }

    /* renamed from: a */
    void m191a(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f3515j
            if (r0 == 0) goto L_0x0007
            androidx.core.graphics.drawable.C0698a.m1600a(r0, r2)
        L_0x0007:
            return
    }

    /* renamed from: a */
    void mo158a(android.graphics.Rect r2) {
            r1 = this;
            b.a.a.a.q.a r0 = r1.f3513h
            r0.getPadding(r2)
            r2 = 0
            throw r2
    }

    /* renamed from: a */
    final void m190a(p050b.p051a.p052a.p053a.p054j.C0884h r1) {
            r0 = this;
            r0.f3509d = r1
            return
    }

    /* renamed from: a */
    void m188a(com.google.android.material.floatingactionbutton.C0944a.AbstractC0951g r3, boolean r4) {
            r2 = this;
            boolean r0 = r2.m174g()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            android.animation.Animator r0 = r2.f3507b
            if (r0 == 0) goto L_0x000e
            r0.cancel()
        L_0x000e:
            boolean r0 = r2.m164t()
            if (r0 == 0) goto L_0x0046
            b.a.a.a.j.h r0 = r2.f3509d
            if (r0 == 0) goto L_0x0019
            goto L_0x001d
        L_0x0019:
            b.a.a.a.j.h r0 = r2.m166r()
        L_0x001d:
            r1 = 0
            android.animation.AnimatorSet r0 = r2.m189a(r0, r1, r1, r1)
            com.google.android.material.floatingactionbutton.a$a r1 = new com.google.android.material.floatingactionbutton.a$a
            r1.<init>(r2, r4, r3)
            r0.addListener(r1)
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r3 = r2.f3525t
            if (r3 == 0) goto L_0x0042
            java.util.Iterator r3 = r3.iterator()
        L_0x0032:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0042
            java.lang.Object r4 = r3.next()
            android.animation.Animator$AnimatorListener r4 = (android.animation.Animator.AnimatorListener) r4
            r0.addListener(r4)
            goto L_0x0032
        L_0x0042:
            r0.start()
            goto L_0x0056
        L_0x0046:
            com.google.android.material.internal.l r0 = r2.f3526u
            if (r4 == 0) goto L_0x004d
            r1 = 8
            goto L_0x004e
        L_0x004d:
            r1 = 4
        L_0x004e:
            r0.m70a(r1, r4)
            if (r3 == 0) goto L_0x0056
            r3.mo161b()
        L_0x0056:
            return
    }

    /* renamed from: a */
    void mo157a(int[] r2) {
            r1 = this;
            com.google.android.material.internal.i r0 = r1.f3512g
            r0.m83a(r2)
            return
    }

    /* renamed from: b */
    float mo156b() {
            r1 = this;
            float r0 = r1.f3519n
            return r0
    }

    /* renamed from: b */
    final void m186b(float r3) {
            r2 = this;
            float r0 = r2.f3520o
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0011
            r2.f3520o = r3
            float r3 = r2.f3519n
            float r0 = r2.f3520o
            float r1 = r2.f3521p
            r2.mo159a(r3, r0, r1)
        L_0x0011:
            return
    }

    /* renamed from: b */
    void m185b(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r0 = r1.f3524s
            if (r0 != 0) goto L_0x000b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3524s = r0
        L_0x000b:
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r0 = r1.f3524s
            r0.add(r2)
            return
    }

    /* renamed from: b */
    void mo155b(android.content.res.ColorStateList r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f3516k
            if (r0 == 0) goto L_0x000b
            android.content.res.ColorStateList r2 = p050b.p051a.p052a.p053a.p061p.C0907a.m398a(r2)
            androidx.core.graphics.drawable.C0698a.m1603a(r0, r2)
        L_0x000b:
            return
    }

    /* renamed from: b */
    void mo154b(android.graphics.Rect r1) {
            r0 = this;
            return
    }

    /* renamed from: b */
    final void m184b(p050b.p051a.p052a.p053a.p054j.C0884h r1) {
            r0 = this;
            r0.f3508c = r1
            return
    }

    /* renamed from: b */
    void m183b(com.google.android.material.floatingactionbutton.C0944a.AbstractC0951g r4, boolean r5) {
            r3 = this;
            boolean r0 = r3.m173h()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            android.animation.Animator r0 = r3.f3507b
            if (r0 == 0) goto L_0x000e
            r0.cancel()
        L_0x000e:
            boolean r0 = r3.m164t()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0062
            com.google.android.material.internal.l r0 = r3.f3526u
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0031
            com.google.android.material.internal.l r0 = r3.f3526u
            r2 = 0
            r0.setAlpha(r2)
            com.google.android.material.internal.l r0 = r3.f3526u
            r0.setScaleY(r2)
            com.google.android.material.internal.l r0 = r3.f3526u
            r0.setScaleX(r2)
            r3.m181c(r2)
        L_0x0031:
            b.a.a.a.j.h r0 = r3.f3508c
            if (r0 == 0) goto L_0x0036
            goto L_0x003a
        L_0x0036:
            b.a.a.a.j.h r0 = r3.m165s()
        L_0x003a:
            android.animation.AnimatorSet r0 = r3.m189a(r0, r1, r1, r1)
            com.google.android.material.floatingactionbutton.a$b r1 = new com.google.android.material.floatingactionbutton.a$b
            r1.<init>(r3, r5, r4)
            r0.addListener(r1)
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r4 = r3.f3524s
            if (r4 == 0) goto L_0x005e
            java.util.Iterator r4 = r4.iterator()
        L_0x004e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x005e
            java.lang.Object r5 = r4.next()
            android.animation.Animator$AnimatorListener r5 = (android.animation.Animator.AnimatorListener) r5
            r0.addListener(r5)
            goto L_0x004e
        L_0x005e:
            r0.start()
            goto L_0x007f
        L_0x0062:
            com.google.android.material.internal.l r0 = r3.f3526u
            r2 = 0
            r0.m70a(r2, r5)
            com.google.android.material.internal.l r5 = r3.f3526u
            r5.setAlpha(r1)
            com.google.android.material.internal.l r5 = r3.f3526u
            r5.setScaleY(r1)
            com.google.android.material.internal.l r5 = r3.f3526u
            r5.setScaleX(r1)
            r3.m181c(r1)
            if (r4 == 0) goto L_0x007f
            r4.mo162a()
        L_0x007f:
            return
    }

    /* renamed from: c */
    final p050b.p051a.p052a.p053a.p054j.C0884h m182c() {
            r1 = this;
            b.a.a.a.j.h r0 = r1.f3509d
            return r0
    }

    /* renamed from: c */
    final void m181c(float r2) {
            r1 = this;
            r1.f3523r = r2
            android.graphics.Matrix r0 = r1.f3531z
            r1.m194a(r2, r0)
            com.google.android.material.internal.l r2 = r1.f3526u
            r2.setImageMatrix(r0)
            return
    }

    /* renamed from: c */
    public void m180c(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r0 = r1.f3525t
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0.remove(r2)
            return
    }

    /* renamed from: d */
    float m179d() {
            r1 = this;
            float r0 = r1.f3520o
            return r0
    }

    /* renamed from: d */
    final void m178d(float r3) {
            r2 = this;
            float r0 = r2.f3521p
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0011
            r2.f3521p = r3
            float r3 = r2.f3519n
            float r0 = r2.f3520o
            float r1 = r2.f3521p
            r2.mo159a(r3, r0, r1)
        L_0x0011:
            return
    }

    /* renamed from: d */
    void m177d(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r0 = r1.f3524s
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0.remove(r2)
            return
    }

    /* renamed from: e */
    float m176e() {
            r1 = this;
            float r0 = r1.f3521p
            return r0
    }

    /* renamed from: f */
    final p050b.p051a.p052a.p053a.p054j.C0884h m175f() {
            r1 = this;
            b.a.a.a.j.h r0 = r1.f3508c
            return r0
    }

    /* renamed from: g */
    boolean m174g() {
            r4 = this;
            com.google.android.material.internal.l r0 = r4.f3526u
            int r0 = r0.getVisibility()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0010
            int r0 = r4.f3506a
            if (r0 != r2) goto L_0x000f
            r1 = 1
        L_0x000f:
            return r1
        L_0x0010:
            int r0 = r4.f3506a
            r3 = 2
            if (r0 == r3) goto L_0x0016
            r1 = 1
        L_0x0016:
            return r1
    }

    /* renamed from: h */
    boolean m173h() {
            r4 = this;
            com.google.android.material.internal.l r0 = r4.f3526u
            int r0 = r0.getVisibility()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0011
            int r0 = r4.f3506a
            r3 = 2
            if (r0 != r3) goto L_0x0010
            r1 = 1
        L_0x0010:
            return r1
        L_0x0011:
            int r0 = r4.f3506a
            if (r0 == r2) goto L_0x0016
            r1 = 1
        L_0x0016:
            return r1
    }

    /* renamed from: i */
    void mo153i() {
            r1 = this;
            com.google.android.material.internal.i r0 = r1.f3512g
            r0.m85a()
            return
    }

    /* renamed from: j */
    void m172j() {
            r2 = this;
            boolean r0 = r2.mo151n()
            if (r0 == 0) goto L_0x0014
            r2.m167q()
            com.google.android.material.internal.l r0 = r2.f3526u
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnPreDrawListener r1 = r2.f3505A
            r0.addOnPreDrawListener(r1)
        L_0x0014:
            return
    }

    /* renamed from: k */
    void mo152k() {
            r0 = this;
            return
    }

    /* renamed from: l */
    void m171l() {
            r2 = this;
            android.view.ViewTreeObserver$OnPreDrawListener r0 = r2.f3505A
            if (r0 == 0) goto L_0x0012
            com.google.android.material.internal.l r0 = r2.f3526u
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnPreDrawListener r1 = r2.f3505A
            r0.removeOnPreDrawListener(r1)
            r0 = 0
            r2.f3505A = r0
        L_0x0012:
            return
    }

    /* renamed from: m */
    void m170m() {
            r2 = this;
            com.google.android.material.internal.l r0 = r2.f3526u
            float r0 = r0.getRotation()
            float r1 = r2.f3514i
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 == 0) goto L_0x0011
            r2.f3514i = r0
            r2.m163u()
        L_0x0011:
            return
    }

    /* renamed from: n */
    boolean mo151n() {
            r1 = this;
            r0 = 1
            return r0
    }

    /* renamed from: o */
    final void m169o() {
            r1 = this;
            float r0 = r1.f3523r
            r1.m181c(r0)
            return
    }

    /* renamed from: p */
    final void m168p() {
            r5 = this;
            android.graphics.Rect r0 = r5.f3528w
            r5.mo158a(r0)
            r5.mo154b(r0)
            b.a.a.a.q.b r1 = r5.f3527v
            int r2 = r0.left
            int r3 = r0.top
            int r4 = r0.right
            int r0 = r0.bottom
            r1.mo199a(r2, r3, r4, r0)
            return
    }
}
