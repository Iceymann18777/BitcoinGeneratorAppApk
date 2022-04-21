package com.google.android.material.transformation;

/* loaded from: classes.dex */
public class FabTransformationScrimBehavior extends com.google.android.material.transformation.ExpandableTransformationBehavior {

    /* renamed from: c */
    private final p050b.p051a.p052a.p053a.p054j.C0885i f3661c;

    /* renamed from: d */
    private final p050b.p051a.p052a.p053a.p054j.C0885i f3662d;

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    /* loaded from: classes.dex */
    class C1005a extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f3663a;

        /* renamed from: b */
        final /* synthetic */ android.view.View f3664b;

        C1005a(com.google.android.material.transformation.FabTransformationScrimBehavior r1, boolean r2, android.view.View r3) {
                r0 = this;
                r0.f3663a = r2
                r0.f3664b = r3
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                boolean r2 = r1.f3663a
                if (r2 != 0) goto L_0x000a
                android.view.View r2 = r1.f3664b
                r0 = 4
                r2.setVisibility(r0)
            L_0x000a:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                boolean r2 = r1.f3663a
                if (r2 == 0) goto L_0x000a
                android.view.View r2 = r1.f3664b
                r0 = 0
                r2.setVisibility(r0)
            L_0x000a:
                return
        }
    }

    public FabTransformationScrimBehavior() {
            r5 = this;
            r5.<init>()
            b.a.a.a.j.i r0 = new b.a.a.a.j.i
            r1 = 150(0x96, double:7.4E-322)
            r3 = 75
            r0.<init>(r3, r1)
            r5.f3661c = r0
            b.a.a.a.j.i r0 = new b.a.a.a.j.i
            r3 = 0
            r0.<init>(r3, r1)
            r5.f3662d = r0
            return
    }

    public FabTransformationScrimBehavior(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            r4.<init>(r5, r6)
            b.a.a.a.j.i r5 = new b.a.a.a.j.i
            r0 = 150(0x96, double:7.4E-322)
            r2 = 75
            r5.<init>(r2, r0)
            r4.f3661c = r5
            b.a.a.a.j.i r5 = new b.a.a.a.j.i
            r2 = 0
            r5.<init>(r2, r0)
            r4.f3662d = r5
            return
    }

    /* renamed from: a */
    private void m21a(android.view.View r4, boolean r5, boolean r6, java.util.List<android.animation.Animator> r7, java.util.List<android.animation.Animator.AnimatorListener> r8) {
            r3 = this;
            if (r5 == 0) goto L_0x0005
            b.a.a.a.j.i r8 = r3.f3661c
            goto L_0x0007
        L_0x0005:
            b.a.a.a.j.i r8 = r3.f3662d
        L_0x0007:
            r0 = 0
            r1 = 0
            r2 = 1
            if (r5 == 0) goto L_0x001e
            if (r6 != 0) goto L_0x0011
            r4.setAlpha(r0)
        L_0x0011:
            android.util.Property r5 = android.view.View.ALPHA
            float[] r6 = new float[r2]
            r0 = 1065353216(0x3f800000, float:1.0)
            r6[r1] = r0
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r5, r6)
            goto L_0x0028
        L_0x001e:
            android.util.Property r5 = android.view.View.ALPHA
            float[] r6 = new float[r2]
            r6[r1] = r0
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r5, r6)
        L_0x0028:
            r8.m465a(r4)
            r7.add(r4)
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public boolean mo20a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3) {
            r0 = this;
            boolean r1 = r3 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            return r1
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: b */
    protected android.animation.AnimatorSet mo19b(android.view.View r7, android.view.View r8, boolean r9, boolean r10) {
            r6 = this;
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r7
            r0.m21a(r1, r2, r3, r4, r5)
            android.animation.AnimatorSet r10 = new android.animation.AnimatorSet
            r10.<init>()
            p050b.p051a.p052a.p053a.p054j.C0878b.m483a(r10, r7)
            com.google.android.material.transformation.FabTransformationScrimBehavior$a r7 = new com.google.android.material.transformation.FabTransformationScrimBehavior$a
            r7.<init>(r6, r9, r8)
            r10.addListener(r7)
            return r10
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: b */
    public boolean mo18b(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.MotionEvent r3) {
            r0 = this;
            boolean r1 = super.mo18b(r1, r2, r3)
            return r1
    }
}
