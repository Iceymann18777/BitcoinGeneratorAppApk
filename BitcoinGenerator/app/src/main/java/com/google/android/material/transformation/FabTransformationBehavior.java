package com.google.android.material.transformation;

/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends com.google.android.material.transformation.ExpandableTransformationBehavior {

    /* renamed from: c */
    private final android.graphics.Rect f3648c;

    /* renamed from: d */
    private final android.graphics.RectF f3649d;

    /* renamed from: e */
    private final android.graphics.RectF f3650e;

    /* renamed from: f */
    private final int[] f3651f;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    /* loaded from: classes.dex */
    class C1000a extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f3652a;

        /* renamed from: b */
        final /* synthetic */ android.view.View f3653b;

        /* renamed from: c */
        final /* synthetic */ android.view.View f3654c;

        C1000a(com.google.android.material.transformation.FabTransformationBehavior r1, boolean r2, android.view.View r3, android.view.View r4) {
                r0 = this;
                r0.f3652a = r2
                r0.f3653b = r3
                r0.f3654c = r4
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                boolean r2 = r1.f3652a
                if (r2 != 0) goto L_0x0017
                android.view.View r2 = r1.f3653b
                r0 = 4
                r2.setVisibility(r0)
                android.view.View r2 = r1.f3654c
                r0 = 1065353216(0x3f800000, float:1.0)
                r2.setAlpha(r0)
                android.view.View r2 = r1.f3654c
                r0 = 0
                r2.setVisibility(r0)
            L_0x0017:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                boolean r2 = r1.f3652a
                if (r2 == 0) goto L_0x0016
                android.view.View r2 = r1.f3653b
                r0 = 0
                r2.setVisibility(r0)
                android.view.View r2 = r1.f3654c
                r0 = 0
                r2.setAlpha(r0)
                android.view.View r2 = r1.f3654c
                r0 = 4
                r2.setVisibility(r0)
            L_0x0016:
                return
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    /* loaded from: classes.dex */
    class C1001b implements android.animation.ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ android.view.View f3655a;

        C1001b(com.google.android.material.transformation.FabTransformationBehavior r1, android.view.View r2) {
                r0 = this;
                r0.f3655a = r2
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r1) {
                r0 = this;
                android.view.View r1 = r0.f3655a
                r1.invalidate()
                return
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    /* loaded from: classes.dex */
    class C1002c extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ p050b.p051a.p052a.p053a.p056l.AbstractC0895d f3656a;

        /* renamed from: b */
        final /* synthetic */ android.graphics.drawable.Drawable f3657b;

        C1002c(com.google.android.material.transformation.FabTransformationBehavior r1, p050b.p051a.p052a.p053a.p056l.AbstractC0895d r2, android.graphics.drawable.Drawable r3) {
                r0 = this;
                r0.f3656a = r2
                r0.f3657b = r3
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                b.a.a.a.l.d r2 = r1.f3656a
                r0 = 0
                r2.setCircularRevealOverlayDrawable(r0)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                b.a.a.a.l.d r2 = r1.f3656a
                android.graphics.drawable.Drawable r0 = r1.f3657b
                r2.setCircularRevealOverlayDrawable(r0)
                return
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    /* loaded from: classes.dex */
    class C1003d extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ p050b.p051a.p052a.p053a.p056l.AbstractC0895d f3658a;

        C1003d(com.google.android.material.transformation.FabTransformationBehavior r1, p050b.p051a.p052a.p053a.p056l.AbstractC0895d r2) {
                r0 = this;
                r0.f3658a = r2
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                b.a.a.a.l.d r2 = r1.f3658a
                b.a.a.a.l.d$e r2 = r2.getRevealInfo()
                r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
                r2.f3342c = r0
                b.a.a.a.l.d r0 = r1.f3658a
                r0.setRevealInfo(r2)
                return
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    /* loaded from: classes.dex */
    protected static class C1004e {

        /* renamed from: a */
        public p050b.p051a.p052a.p053a.p054j.C0884h f3659a;

        /* renamed from: b */
        public p050b.p051a.p052a.p053a.p054j.C0886j f3660b;

        protected C1004e() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public FabTransformationBehavior() {
            r1 = this;
            r1.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.f3648c = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.f3649d = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.f3650e = r0
            r0 = 2
            int[] r0 = new int[r0]
            r1.f3651f = r0
            return
    }

    public FabTransformationBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f3648c = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f3649d = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f3650e = r1
            r1 = 2
            int[] r1 = new int[r1]
            r0.f3651f = r1
            return
    }

    /* renamed from: a */
    private float m36a(android.view.View r3, android.view.View r4, p050b.p051a.p052a.p053a.p054j.C0886j r5) {
            r2 = this;
            android.graphics.RectF r0 = r2.f3649d
            android.graphics.RectF r1 = r2.f3650e
            r2.m37a(r3, r0)
            r2.m37a(r4, r1)
            float r3 = r2.m25c(r3, r4, r5)
            float r3 = -r3
            r4 = 0
            r1.offset(r3, r4)
            float r3 = r0.centerX()
            float r4 = r1.left
            float r3 = r3 - r4
            return r3
    }

    /* renamed from: a */
    private float m30a(com.google.android.material.transformation.FabTransformationBehavior.C1004e r9, p050b.p051a.p052a.p053a.p054j.C0885i r10, float r11, float r12) {
            r8 = this;
            long r0 = r10.m466a()
            long r2 = r10.m463b()
            b.a.a.a.j.h r9 = r9.f3659a
            java.lang.String r4 = "expansion"
            b.a.a.a.j.i r9 = r9.m470a(r4)
            long r4 = r9.m466a()
            long r6 = r9.m463b()
            long r4 = r4 + r6
            r6 = 17
            long r4 = r4 + r6
            long r4 = r4 - r0
            float r9 = (float) r4
            float r0 = (float) r2
            float r9 = r9 / r0
            android.animation.TimeInterpolator r10 = r10.m461c()
            float r9 = r10.getInterpolation(r9)
            float r9 = p050b.p051a.p052a.p053a.p054j.C0877a.m484a(r11, r12, r9)
            return r9
    }

    /* renamed from: a */
    private android.view.ViewGroup m40a(android.view.View r2) {
            r1 = this;
            int r0 = p050b.p051a.p052a.p053a.C0872e.mtrl_child_content_container
            android.view.View r0 = r2.findViewById(r0)
            if (r0 == 0) goto L_0x000d
            android.view.ViewGroup r2 = r1.m26c(r0)
            return r2
        L_0x000d:
            boolean r0 = r2 instanceof com.google.android.material.transformation.C1007b
            if (r0 != 0) goto L_0x001b
            boolean r0 = r2 instanceof com.google.android.material.transformation.C1006a
            if (r0 == 0) goto L_0x0016
            goto L_0x001b
        L_0x0016:
            android.view.ViewGroup r2 = r1.m26c(r2)
            return r2
        L_0x001b:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0 = 0
            android.view.View r2 = r2.getChildAt(r0)
            android.view.ViewGroup r2 = r1.m26c(r2)
            return r2
    }

    /* renamed from: a */
    private void m39a(android.view.View r4, long r5, int r7, int r8, float r9, java.util.List<android.animation.Animator> r10) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x0019
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0019
            android.animation.Animator r4 = android.view.ViewAnimationUtils.createCircularReveal(r4, r7, r8, r9, r9)
            r4.setStartDelay(r0)
            r4.setDuration(r5)
            r10.add(r4)
        L_0x0019:
            return
    }

    /* renamed from: a */
    private void m38a(android.view.View r3, long r4, long r6, long r8, int r10, int r11, float r12, java.util.List<android.animation.Animator> r13) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x0019
            long r4 = r4 + r6
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x0019
            android.animation.Animator r3 = android.view.ViewAnimationUtils.createCircularReveal(r3, r10, r11, r12, r12)
            r3.setStartDelay(r4)
            long r8 = r8 - r4
            r3.setDuration(r8)
            r13.add(r3)
        L_0x0019:
            return
    }

    /* renamed from: a */
    private void m37a(android.view.View r4, android.graphics.RectF r5) {
            r3 = this;
            int r0 = r4.getWidth()
            float r0 = (float) r0
            int r1 = r4.getHeight()
            float r1 = (float) r1
            r2 = 0
            r5.set(r2, r2, r0, r1)
            int[] r0 = r3.f3651f
            r4.getLocationInWindow(r0)
            r1 = 0
            r1 = r0[r1]
            float r1 = (float) r1
            r2 = 1
            r0 = r0[r2]
            float r0 = (float) r0
            r5.offsetTo(r1, r0)
            float r0 = r4.getTranslationX()
            float r0 = -r0
            int r0 = (int) r0
            float r0 = (float) r0
            float r4 = r4.getTranslationY()
            float r4 = -r4
            int r4 = (int) r4
            float r4 = (float) r4
            r5.offset(r0, r4)
            return
    }

    /* renamed from: a */
    private void m35a(android.view.View r18, android.view.View r19, boolean r20, boolean r21, com.google.android.material.transformation.FabTransformationBehavior.C1004e r22, float r23, float r24, java.util.List<android.animation.Animator> r25, java.util.List<android.animation.Animator.AnimatorListener> r26) {
            r17 = this;
            r12 = r17
            r0 = r18
            r8 = r19
            r9 = r22
            boolean r1 = r8 instanceof p050b.p051a.p052a.p053a.p056l.AbstractC0895d
            if (r1 != 0) goto L_0x000d
            return
        L_0x000d:
            r13 = r8
            b.a.a.a.l.d r13 = (p050b.p051a.p052a.p053a.p056l.AbstractC0895d) r13
            b.a.a.a.j.j r1 = r9.f3660b
            float r1 = r12.m36a(r0, r8, r1)
            b.a.a.a.j.j r2 = r9.f3660b
            float r10 = r12.m28b(r0, r8, r2)
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r0
            android.graphics.Rect r2 = r12.f3648c
            r0.m225a(r2)
            android.graphics.Rect r0 = r12.f3648c
            int r0 = r0.width()
            float r0 = (float) r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r11 = r0 / r2
            b.a.a.a.j.h r0 = r9.f3659a
            java.lang.String r2 = "expansion"
            b.a.a.a.j.i r14 = r0.m470a(r2)
            if (r20 == 0) goto L_0x0074
            if (r21 != 0) goto L_0x0042
            b.a.a.a.l.d$e r0 = new b.a.a.a.l.d$e
            r0.<init>(r1, r10, r11)
            r13.setRevealInfo(r0)
        L_0x0042:
            if (r21 == 0) goto L_0x004b
            b.a.a.a.l.d$e r0 = r13.getRevealInfo()
            float r0 = r0.f3342c
            r11 = r0
        L_0x004b:
            r4 = 0
            r5 = 0
            r2 = r1
            r3 = r10
            r6 = r23
            r7 = r24
            float r0 = p050b.p051a.p052a.p053a.p059n.C0905a.m403a(r2, r3, r4, r5, r6, r7)
            android.animation.Animator r9 = p050b.p051a.p052a.p053a.p056l.C0890a.m429a(r13, r1, r10, r0)
            com.google.android.material.transformation.FabTransformationBehavior$d r0 = new com.google.android.material.transformation.FabTransformationBehavior$d
            r0.<init>(r12, r13)
            r9.addListener(r0)
            long r2 = r14.m466a()
            int r4 = (int) r1
            int r5 = (int) r10
            r0 = r17
            r1 = r19
            r6 = r11
            r7 = r25
            r0.m39a(r1, r2, r4, r5, r6, r7)
            goto L_0x00ab
        L_0x0074:
            b.a.a.a.l.d$e r0 = r13.getRevealInfo()
            float r6 = r0.f3342c
            android.animation.Animator r15 = p050b.p051a.p052a.p053a.p056l.C0890a.m429a(r13, r1, r10, r11)
            long r2 = r14.m466a()
            int r7 = (int) r1
            int r10 = (int) r10
            r0 = r17
            r1 = r19
            r4 = r7
            r5 = r10
            r16 = r7
            r7 = r25
            r0.m39a(r1, r2, r4, r5, r6, r7)
            long r2 = r14.m466a()
            long r4 = r14.m463b()
            b.a.a.a.j.h r0 = r9.f3659a
            long r6 = r0.m473a()
            r0 = r17
            r8 = r16
            r9 = r10
            r10 = r11
            r11 = r25
            r0.m38a(r1, r2, r4, r6, r8, r9, r10, r11)
            r9 = r15
        L_0x00ab:
            r14.m465a(r9)
            r0 = r25
            r0.add(r9)
            android.animation.Animator$AnimatorListener r0 = p050b.p051a.p052a.p053a.p056l.C0890a.m430a(r13)
            r1 = r26
            r1.add(r0)
            return
    }

    /* renamed from: a */
    private void m34a(android.view.View r2, android.view.View r3, boolean r4, boolean r5, com.google.android.material.transformation.FabTransformationBehavior.C1004e r6, java.util.List<android.animation.Animator> r7, java.util.List<android.animation.Animator.AnimatorListener> r8) {
            r1 = this;
            boolean r2 = r3 instanceof android.view.ViewGroup
            if (r2 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r2 = r3 instanceof p050b.p051a.p052a.p053a.p056l.AbstractC0895d
            if (r2 == 0) goto L_0x000e
            int r2 = p050b.p051a.p052a.p053a.p056l.C0893c.f3335a
            if (r2 != 0) goto L_0x000e
            return
        L_0x000e:
            android.view.ViewGroup r2 = r1.m40a(r3)
            if (r2 != 0) goto L_0x0015
            return
        L_0x0015:
            r3 = 0
            r8 = 0
            r0 = 1
            if (r4 == 0) goto L_0x0032
            if (r5 != 0) goto L_0x0025
            android.util.Property<android.view.ViewGroup, java.lang.Float> r4 = p050b.p051a.p052a.p053a.p054j.C0880d.f3286a
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r4.set(r2, r3)
        L_0x0025:
            android.util.Property<android.view.ViewGroup, java.lang.Float> r3 = p050b.p051a.p052a.p053a.p054j.C0880d.f3286a
            float[] r4 = new float[r0]
            r5 = 1065353216(0x3f800000, float:1.0)
            r4[r8] = r5
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r3, r4)
            goto L_0x003c
        L_0x0032:
            android.util.Property<android.view.ViewGroup, java.lang.Float> r4 = p050b.p051a.p052a.p053a.p054j.C0880d.f3286a
            float[] r5 = new float[r0]
            r5[r8] = r3
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r4, r5)
        L_0x003c:
            b.a.a.a.j.h r3 = r6.f3659a
            java.lang.String r4 = "contentFade"
            b.a.a.a.j.i r3 = r3.m470a(r4)
            r3.m465a(r2)
            r7.add(r2)
            return
    }

    /* renamed from: a */
    private void m33a(android.view.View r17, android.view.View r18, boolean r19, boolean r20, com.google.android.material.transformation.FabTransformationBehavior.C1004e r21, java.util.List<android.animation.Animator> r22, java.util.List<android.animation.Animator.AnimatorListener> r23, android.graphics.RectF r24) {
            r16 = this;
            r10 = r16
            r0 = r17
            r1 = r18
            r2 = r21
            r11 = r22
            b.a.a.a.j.j r3 = r2.f3660b
            float r3 = r10.m25c(r0, r1, r3)
            b.a.a.a.j.j r4 = r2.f3660b
            float r0 = r10.m23d(r0, r1, r4)
            r4 = 0
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 == 0) goto L_0x0046
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 != 0) goto L_0x0020
            goto L_0x0046
        L_0x0020:
            if (r19 == 0) goto L_0x0026
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 < 0) goto L_0x002c
        L_0x0026:
            if (r19 != 0) goto L_0x0039
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x0039
        L_0x002c:
            b.a.a.a.j.h r5 = r2.f3659a
            java.lang.String r6 = "translationXCurveUpwards"
            b.a.a.a.j.i r5 = r5.m470a(r6)
            b.a.a.a.j.h r6 = r2.f3659a
            java.lang.String r7 = "translationYCurveUpwards"
            goto L_0x0052
        L_0x0039:
            b.a.a.a.j.h r5 = r2.f3659a
            java.lang.String r6 = "translationXCurveDownwards"
            b.a.a.a.j.i r5 = r5.m470a(r6)
            b.a.a.a.j.h r6 = r2.f3659a
            java.lang.String r7 = "translationYCurveDownwards"
            goto L_0x0052
        L_0x0046:
            b.a.a.a.j.h r5 = r2.f3659a
            java.lang.String r6 = "translationXLinear"
            b.a.a.a.j.i r5 = r5.m470a(r6)
            b.a.a.a.j.h r6 = r2.f3659a
            java.lang.String r7 = "translationYLinear"
        L_0x0052:
            b.a.a.a.j.i r6 = r6.m470a(r7)
            r12 = r5
            r13 = r6
            r5 = 0
            r6 = 1
            if (r19 == 0) goto L_0x008c
            if (r20 != 0) goto L_0x0066
            float r7 = -r3
            r1.setTranslationX(r7)
            float r7 = -r0
            r1.setTranslationY(r7)
        L_0x0066:
            android.util.Property r7 = android.view.View.TRANSLATION_X
            float[] r8 = new float[r6]
            r8[r5] = r4
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofFloat(r1, r7, r8)
            android.util.Property r7 = android.view.View.TRANSLATION_Y
            float[] r6 = new float[r6]
            r6[r5] = r4
            android.animation.ObjectAnimator r15 = android.animation.ObjectAnimator.ofFloat(r1, r7, r6)
            float r5 = -r3
            float r6 = -r0
            r7 = 0
            r8 = 0
            r0 = r16
            r1 = r18
            r2 = r21
            r3 = r12
            r4 = r13
            r9 = r24
            r0.m32a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x00a2
        L_0x008c:
            android.util.Property r2 = android.view.View.TRANSLATION_X
            float[] r4 = new float[r6]
            float r3 = -r3
            r4[r5] = r3
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofFloat(r1, r2, r4)
            android.util.Property r2 = android.view.View.TRANSLATION_Y
            float[] r3 = new float[r6]
            float r0 = -r0
            r3[r5] = r0
            android.animation.ObjectAnimator r15 = android.animation.ObjectAnimator.ofFloat(r1, r2, r3)
        L_0x00a2:
            r12.m465a(r14)
            r13.m465a(r15)
            r11.add(r14)
            r11.add(r15)
            return
    }

    /* renamed from: a */
    private void m32a(android.view.View r1, com.google.android.material.transformation.FabTransformationBehavior.C1004e r2, p050b.p051a.p052a.p053a.p054j.C0885i r3, p050b.p051a.p052a.p053a.p054j.C0885i r4, float r5, float r6, float r7, float r8, android.graphics.RectF r9) {
            r0 = this;
            float r3 = r0.m30a(r2, r3, r5, r7)
            float r2 = r0.m30a(r2, r4, r6, r8)
            android.graphics.Rect r4 = r0.f3648c
            r1.getWindowVisibleDisplayFrame(r4)
            android.graphics.RectF r5 = r0.f3649d
            r5.set(r4)
            android.graphics.RectF r4 = r0.f3650e
            r0.m37a(r1, r4)
            r4.offset(r3, r2)
            r4.intersect(r5)
            r9.set(r4)
            return
    }

    /* renamed from: b */
    private float m28b(android.view.View r3, android.view.View r4, p050b.p051a.p052a.p053a.p054j.C0886j r5) {
            r2 = this;
            android.graphics.RectF r0 = r2.f3649d
            android.graphics.RectF r1 = r2.f3650e
            r2.m37a(r3, r0)
            r2.m37a(r4, r1)
            float r3 = r2.m23d(r3, r4, r5)
            float r3 = -r3
            r4 = 0
            r1.offset(r4, r3)
            float r3 = r0.centerY()
            float r4 = r1.top
            float r3 = r3 - r4
            return r3
    }

    /* renamed from: b */
    private int m29b(android.view.View r3) {
            r2 = this;
            android.content.res.ColorStateList r0 = p000a.p018g.p029l.C0216r.m3428b(r3)
            if (r0 == 0) goto L_0x0013
            int[] r3 = r3.getDrawableState()
            int r1 = r0.getDefaultColor()
            int r3 = r0.getColorForState(r3, r1)
            return r3
        L_0x0013:
            r3 = 0
            return r3
    }

    /* renamed from: b */
    private void m27b(android.view.View r3, android.view.View r4, boolean r5, boolean r6, com.google.android.material.transformation.FabTransformationBehavior.C1004e r7, java.util.List<android.animation.Animator> r8, java.util.List<android.animation.Animator.AnimatorListener> r9) {
            r2 = this;
            boolean r9 = r4 instanceof p050b.p051a.p052a.p053a.p056l.AbstractC0895d
            if (r9 != 0) goto L_0x0005
            return
        L_0x0005:
            b.a.a.a.l.d r4 = (p050b.p051a.p052a.p053a.p056l.AbstractC0895d) r4
            int r3 = r2.m29b(r3)
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r9 = r9 & r3
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L_0x0023
            if (r6 != 0) goto L_0x0018
            r4.setCircularRevealScrimColor(r3)
        L_0x0018:
            android.util.Property<b.a.a.a.l.d, java.lang.Integer> r3 = p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0899d.f3339a
            int[] r5 = new int[r1]
            r5[r0] = r9
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofInt(r4, r3, r5)
            goto L_0x002d
        L_0x0023:
            android.util.Property<b.a.a.a.l.d, java.lang.Integer> r5 = p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0899d.f3339a
            int[] r6 = new int[r1]
            r6[r0] = r3
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofInt(r4, r5, r6)
        L_0x002d:
            b.a.a.a.j.c r4 = p050b.p051a.p052a.p053a.p054j.C0879c.m482a()
            r3.setEvaluator(r4)
            b.a.a.a.j.h r4 = r7.f3659a
            java.lang.String r5 = "color"
            b.a.a.a.j.i r4 = r4.m470a(r5)
            r4.m465a(r3)
            r8.add(r3)
            return
    }

    /* renamed from: c */
    private float m25c(android.view.View r3, android.view.View r4, p050b.p051a.p052a.p053a.p054j.C0886j r5) {
            r2 = this;
            android.graphics.RectF r0 = r2.f3649d
            android.graphics.RectF r1 = r2.f3650e
            r2.m37a(r3, r0)
            r2.m37a(r4, r1)
            int r3 = r5.f3299a
            r3 = r3 & 7
            r4 = 1
            if (r3 == r4) goto L_0x0023
            r4 = 3
            if (r3 == r4) goto L_0x001e
            r4 = 5
            if (r3 == r4) goto L_0x0019
            r3 = 0
            goto L_0x002c
        L_0x0019:
            float r3 = r1.right
            float r4 = r0.right
            goto L_0x002b
        L_0x001e:
            float r3 = r1.left
            float r4 = r0.left
            goto L_0x002b
        L_0x0023:
            float r3 = r1.centerX()
            float r4 = r0.centerX()
        L_0x002b:
            float r3 = r3 - r4
        L_0x002c:
            float r4 = r5.f3300b
            float r3 = r3 + r4
            return r3
    }

    /* renamed from: c */
    private android.view.ViewGroup m26c(android.view.View r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0007
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            return r2
        L_0x0007:
            r2 = 0
            return r2
    }

    @android.annotation.TargetApi(21)
    /* renamed from: c */
    private void m24c(android.view.View r2, android.view.View r3, boolean r4, boolean r5, com.google.android.material.transformation.FabTransformationBehavior.C1004e r6, java.util.List<android.animation.Animator> r7, java.util.List<android.animation.Animator.AnimatorListener> r8) {
            r1 = this;
            float r8 = p000a.p018g.p029l.C0216r.m3417f(r3)
            float r2 = p000a.p018g.p029l.C0216r.m3417f(r2)
            float r8 = r8 - r2
            r2 = 0
            r0 = 1
            if (r4 == 0) goto L_0x001f
            if (r5 != 0) goto L_0x0013
            float r4 = -r8
            r3.setTranslationZ(r4)
        L_0x0013:
            android.util.Property r4 = android.view.View.TRANSLATION_Z
            float[] r5 = new float[r0]
            r8 = 0
            r5[r2] = r8
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r3, r4, r5)
            goto L_0x002a
        L_0x001f:
            android.util.Property r4 = android.view.View.TRANSLATION_Z
            float[] r5 = new float[r0]
            float r8 = -r8
            r5[r2] = r8
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r3, r4, r5)
        L_0x002a:
            b.a.a.a.j.h r3 = r6.f3659a
            java.lang.String r4 = "elevation"
            b.a.a.a.j.i r3 = r3.m470a(r4)
            r3.m465a(r2)
            r7.add(r2)
            return
    }

    /* renamed from: d */
    private float m23d(android.view.View r3, android.view.View r4, p050b.p051a.p052a.p053a.p054j.C0886j r5) {
            r2 = this;
            android.graphics.RectF r0 = r2.f3649d
            android.graphics.RectF r1 = r2.f3650e
            r2.m37a(r3, r0)
            r2.m37a(r4, r1)
            int r3 = r5.f3299a
            r3 = r3 & 112(0x70, float:1.57E-43)
            r4 = 16
            if (r3 == r4) goto L_0x0026
            r4 = 48
            if (r3 == r4) goto L_0x0021
            r4 = 80
            if (r3 == r4) goto L_0x001c
            r3 = 0
            goto L_0x002f
        L_0x001c:
            float r3 = r1.bottom
            float r4 = r0.bottom
            goto L_0x002e
        L_0x0021:
            float r3 = r1.top
            float r4 = r0.top
            goto L_0x002e
        L_0x0026:
            float r3 = r1.centerY()
            float r4 = r0.centerY()
        L_0x002e:
            float r3 = r3 - r4
        L_0x002f:
            float r4 = r5.f3301c
            float r3 = r3 + r4
            return r3
    }

    /* renamed from: d */
    private void m22d(android.view.View r5, android.view.View r6, boolean r7, boolean r8, com.google.android.material.transformation.FabTransformationBehavior.C1004e r9, java.util.List<android.animation.Animator> r10, java.util.List<android.animation.Animator.AnimatorListener> r11) {
            r4 = this;
            boolean r0 = r6 instanceof p050b.p051a.p052a.p053a.p056l.AbstractC0895d
            if (r0 == 0) goto L_0x0056
            boolean r0 = r5 instanceof android.widget.ImageView
            if (r0 != 0) goto L_0x0009
            goto L_0x0056
        L_0x0009:
            r0 = r6
            b.a.a.a.l.d r0 = (p050b.p051a.p052a.p053a.p056l.AbstractC0895d) r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.graphics.drawable.Drawable r5 = r5.getDrawable()
            if (r5 != 0) goto L_0x0015
            return
        L_0x0015:
            r5.mutate()
            r1 = 255(0xff, float:3.57E-43)
            r2 = 1
            r3 = 0
            if (r7 == 0) goto L_0x002e
            if (r8 != 0) goto L_0x0023
            r5.setAlpha(r1)
        L_0x0023:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r7 = p050b.p051a.p052a.p053a.p054j.C0881e.f3287b
            int[] r8 = new int[r2]
            r8[r3] = r3
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofInt(r5, r7, r8)
            goto L_0x0038
        L_0x002e:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r7 = p050b.p051a.p052a.p053a.p054j.C0881e.f3287b
            int[] r8 = new int[r2]
            r8[r3] = r1
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofInt(r5, r7, r8)
        L_0x0038:
            com.google.android.material.transformation.FabTransformationBehavior$b r8 = new com.google.android.material.transformation.FabTransformationBehavior$b
            r8.<init>(r4, r6)
            r7.addUpdateListener(r8)
            b.a.a.a.j.h r6 = r9.f3659a
            java.lang.String r8 = "iconFade"
            b.a.a.a.j.i r6 = r6.m470a(r8)
            r6.m465a(r7)
            r10.add(r7)
            com.google.android.material.transformation.FabTransformationBehavior$c r6 = new com.google.android.material.transformation.FabTransformationBehavior$c
            r6.<init>(r4, r0, r5)
            r11.add(r6)
        L_0x0056:
            return
    }

    /* renamed from: a */
    protected abstract com.google.android.material.transformation.FabTransformationBehavior.C1004e mo17a(android.content.Context r1, boolean r2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public void mo31a(androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f r2) {
            r1 = this;
            int r0 = r2.f2601h
            if (r0 != 0) goto L_0x0008
            r0 = 80
            r2.f2601h = r0
        L_0x0008:
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public boolean mo20a(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
            r1 = this;
            int r2 = r3.getVisibility()
            r0 = 8
            if (r2 == r0) goto L_0x001d
            boolean r2 = r4 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            r0 = 0
            if (r2 == 0) goto L_0x001c
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r4
            int r2 = r4.getExpandedComponentIdHint()
            if (r2 == 0) goto L_0x001b
            int r3 = r3.getId()
            if (r2 != r3) goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            return r0
        L_0x001d:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead."
            r2.<init>(r3)
            throw r2
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: b */
    protected android.animation.AnimatorSet mo19b(android.view.View r16, android.view.View r17, boolean r18, boolean r19) {
            r15 = this;
            r10 = r15
            r11 = r18
            android.content.Context r0 = r17.getContext()
            com.google.android.material.transformation.FabTransformationBehavior$e r12 = r15.mo17a(r0, r11)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x002a
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r12
            r6 = r13
            r7 = r14
            r0.m24c(r1, r2, r3, r4, r5, r6, r7)
        L_0x002a:
            android.graphics.RectF r9 = r10.f3649d
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r9
            r0.m33a(r1, r2, r3, r4, r5, r6, r7, r8)
            float r8 = r9.width()
            float r9 = r9.height()
            r0.m22d(r1, r2, r3, r4, r5, r6, r7)
            r6 = r8
            r7 = r9
            r8 = r13
            r9 = r14
            r0.m35a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r6 = r13
            r7 = r14
            r0.m27b(r1, r2, r3, r4, r5, r6, r7)
            r0.m34a(r1, r2, r3, r4, r5, r6, r7)
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            p050b.p051a.p052a.p053a.p054j.C0878b.m483a(r0, r13)
            com.google.android.material.transformation.FabTransformationBehavior$a r1 = new com.google.android.material.transformation.FabTransformationBehavior$a
            r2 = r16
            r3 = r17
            r1.<init>(r15, r11, r3, r2)
            r0.addListener(r1)
            r1 = 0
            int r2 = r14.size()
        L_0x006f:
            if (r1 >= r2) goto L_0x007d
            java.lang.Object r3 = r14.get(r1)
            android.animation.Animator$AnimatorListener r3 = (android.animation.Animator.AnimatorListener) r3
            r0.addListener(r3)
            int r1 = r1 + 1
            goto L_0x006f
        L_0x007d:
            return r0
    }
}
