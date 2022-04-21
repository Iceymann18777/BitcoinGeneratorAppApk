package p050b.p051a.p052a.p053a.p056l;

/* renamed from: b.a.a.a.l.a */
/* loaded from: classes.dex */
public final class C0890a {

    /* renamed from: b.a.a.a.l.a$a */
    /* loaded from: classes.dex */
    static class C0891a extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ p050b.p051a.p052a.p053a.p056l.AbstractC0895d f3333a;

        C0891a(p050b.p051a.p052a.p053a.p056l.AbstractC0895d r1) {
                r0 = this;
                r0.f3333a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r1) {
                r0 = this;
                b.a.a.a.l.d r1 = r0.f3333a
                r1.mo412a()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r1) {
                r0 = this;
                b.a.a.a.l.d r1 = r0.f3333a
                r1.mo411b()
                return
        }
    }

    /* renamed from: a */
    public static android.animation.Animator.AnimatorListener m430a(p050b.p051a.p052a.p053a.p056l.AbstractC0895d r1) {
            b.a.a.a.l.a$a r0 = new b.a.a.a.l.a$a
            r0.<init>(r1)
            return r0
    }

    /* renamed from: a */
    public static android.animation.Animator m429a(p050b.p051a.p052a.p053a.p056l.AbstractC0895d r6, float r7, float r8, float r9) {
            android.util.Property<b.a.a.a.l.d, b.a.a.a.l.d$e> r0 = p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0898c.f3338a
            android.animation.TypeEvaluator<b.a.a.a.l.d$e> r1 = p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0897b.f3336b
            r2 = 1
            b.a.a.a.l.d$e[] r3 = new p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0900e[r2]
            b.a.a.a.l.d$e r4 = new b.a.a.a.l.d$e
            r4.<init>(r7, r8, r9)
            r5 = 0
            r3[r5] = r4
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofObject(r6, r0, r1, r3)
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r1 < r3) goto L_0x0041
            b.a.a.a.l.d$e r1 = r6.getRevealInfo()
            if (r1 == 0) goto L_0x0039
            float r1 = r1.f3342c
            android.view.View r6 = (android.view.View) r6
            int r7 = (int) r7
            int r8 = (int) r8
            android.animation.Animator r6 = android.view.ViewAnimationUtils.createCircularReveal(r6, r7, r8, r1, r9)
            android.animation.AnimatorSet r7 = new android.animation.AnimatorSet
            r7.<init>()
            r8 = 2
            android.animation.Animator[] r8 = new android.animation.Animator[r8]
            r8[r5] = r0
            r8[r2] = r6
            r7.playTogether(r8)
            return r7
        L_0x0039:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Caller must set a non-null RevealInfo before calling this."
            r6.<init>(r7)
            throw r6
        L_0x0041:
            return r0
    }
}
