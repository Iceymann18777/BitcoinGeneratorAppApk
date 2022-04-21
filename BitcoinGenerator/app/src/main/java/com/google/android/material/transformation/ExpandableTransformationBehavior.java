package com.google.android.material.transformation;

/* loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends com.google.android.material.transformation.ExpandableBehavior {

    /* renamed from: b */
    private android.animation.AnimatorSet f3646b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    /* loaded from: classes.dex */
    class C0999a extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ com.google.android.material.transformation.ExpandableTransformationBehavior f3647a;

        C0999a(com.google.android.material.transformation.ExpandableTransformationBehavior r1) {
                r0 = this;
                r0.f3647a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                com.google.android.material.transformation.ExpandableTransformationBehavior r2 = r1.f3647a
                r0 = 0
                com.google.android.material.transformation.ExpandableTransformationBehavior.m41a(r2, r0)
                return
        }
    }

    public ExpandableTransformationBehavior() {
            r0 = this;
            r0.<init>()
            return
    }

    public ExpandableTransformationBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* renamed from: a */
    static /* synthetic */ android.animation.AnimatorSet m41a(com.google.android.material.transformation.ExpandableTransformationBehavior r0, android.animation.AnimatorSet r1) {
            r0.f3646b = r1
            return r1
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: a */
    protected boolean mo16a(android.view.View r4, android.view.View r5, boolean r6, boolean r7) {
            r3 = this;
            android.animation.AnimatorSet r0 = r3.f3646b
            r1 = 1
            if (r0 == 0) goto L_0x0007
            r0 = 1
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            if (r0 == 0) goto L_0x000f
            android.animation.AnimatorSet r2 = r3.f3646b
            r2.cancel()
        L_0x000f:
            android.animation.AnimatorSet r4 = r3.mo19b(r4, r5, r6, r0)
            r3.f3646b = r4
            android.animation.AnimatorSet r4 = r3.f3646b
            com.google.android.material.transformation.ExpandableTransformationBehavior$a r5 = new com.google.android.material.transformation.ExpandableTransformationBehavior$a
            r5.<init>(r3)
            r4.addListener(r5)
            android.animation.AnimatorSet r4 = r3.f3646b
            r4.start()
            if (r7 != 0) goto L_0x002b
            android.animation.AnimatorSet r4 = r3.f3646b
            r4.end()
        L_0x002b:
            return r1
    }

    /* renamed from: b */
    protected abstract android.animation.AnimatorSet mo19b(android.view.View r1, android.view.View r2, boolean r3, boolean r4);
}
