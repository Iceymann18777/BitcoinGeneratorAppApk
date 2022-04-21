package com.google.android.material.behavior;

import android.view.View;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c<V> {

    /* renamed from: a */
    private int f3406a;

    /* renamed from: b */
    private int f3407b;

    /* renamed from: c */
    private android.view.ViewPropertyAnimator f3408c;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    /* loaded from: classes.dex */
    class C0926a extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ com.google.android.material.behavior.HideBottomViewOnScrollBehavior f3409a;

        C0926a(com.google.android.material.behavior.HideBottomViewOnScrollBehavior r1) {
                r0 = this;
                r0.f3409a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                com.google.android.material.behavior.HideBottomViewOnScrollBehavior r2 = r1.f3409a
                r0 = 0
                com.google.android.material.behavior.HideBottomViewOnScrollBehavior.m312a(r2, r0)
                return
        }
    }

    public HideBottomViewOnScrollBehavior() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f3406a = r0
            r0 = 2
            r1.f3407b = r0
            return
    }

    public HideBottomViewOnScrollBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.f3406a = r1
            r1 = 2
            r0.f3407b = r1
            return
    }

    /* renamed from: a */
    static /* synthetic */ android.view.ViewPropertyAnimator m312a(com.google.android.material.behavior.HideBottomViewOnScrollBehavior r0, android.view.ViewPropertyAnimator r1) {
            r0.f3408c = r1
            return r1
    }

    /* renamed from: a */
    private void m314a(V r1, int r2, long r3, android.animation.TimeInterpolator r5) {
            r0 = this;
            android.view.ViewPropertyAnimator r1 = r1.animate()
            float r2 = (float) r2
            android.view.ViewPropertyAnimator r1 = r1.translationY(r2)
            android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r5)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r3)
            com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a r2 = new com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a
            r2.<init>(r0)
            android.view.ViewPropertyAnimator r1 = r1.setListener(r2)
            r0.f3408c = r1
            return
    }

    /* renamed from: a */
    protected void mo275a(V r8) {
            r7 = this;
            android.view.ViewPropertyAnimator r0 = r7.f3408c
            if (r0 == 0) goto L_0x000a
            r0.cancel()
            r8.clearAnimation()
        L_0x000a:
            r0 = 1
            r7.f3407b = r0
            int r3 = r7.f3406a
            r4 = 175(0xaf, double:8.65E-322)
            android.animation.TimeInterpolator r6 = p050b.p051a.p052a.p053a.p054j.C0877a.f3282b
            r1 = r7
            r2 = r8
            r1.m314a(r2, r3, r4, r6)
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public void mo313a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, int r4, int r5, int r6, int r7) {
            r0 = this;
            int r1 = r0.f3407b
            r3 = 1
            if (r1 == r3) goto L_0x000b
            if (r5 <= 0) goto L_0x000b
            r0.mo275a(r2)
            goto L_0x0015
        L_0x000b:
            int r1 = r0.f3407b
            r3 = 2
            if (r1 == r3) goto L_0x0015
            if (r5 >= 0) goto L_0x0015
            r0.mo270b(r2)
        L_0x0015:
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public boolean mo46a(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, int r4) {
            r1 = this;
            int r0 = r3.getMeasuredHeight()
            r1.f3406a = r0
            boolean r2 = super.mo46a(r2, r3, r4)
            return r2
    }

    /* renamed from: b */
    protected void mo270b(V r8) {
            r7 = this;
            android.view.ViewPropertyAnimator r0 = r7.f3408c
            if (r0 == 0) goto L_0x000a
            r0.cancel()
            r8.clearAnimation()
        L_0x000a:
            r0 = 2
            r7.f3407b = r0
            r3 = 0
            r4 = 225(0xe1, double:1.11E-321)
            android.animation.TimeInterpolator r6 = p050b.p051a.p052a.p053a.p054j.C0877a.f3283c
            r1 = r7
            r2 = r8
            r1.m314a(r2, r3, r4, r6)
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: b */
    public boolean mo311b(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, android.view.View r4, int r5) {
            r0 = this;
            r1 = 2
            if (r5 != r1) goto L_0x0005
            r1 = 1
            goto L_0x0006
        L_0x0005:
            r1 = 0
        L_0x0006:
            return r1
    }
}
