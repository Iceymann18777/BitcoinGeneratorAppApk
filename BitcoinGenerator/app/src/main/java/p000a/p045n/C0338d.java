package p000a.p045n;

/* renamed from: a.n.d */
/* loaded from: classes.dex */
public class C0338d extends p000a.p045n.AbstractC0357i0 {

    /* renamed from: a.n.d$a */
    /* loaded from: classes.dex */
    class C0339a extends p000a.p045n.C0374n {

        /* renamed from: a */
        final /* synthetic */ android.view.View f1053a;

        C0339a(p000a.p045n.C0338d r1, android.view.View r2) {
                r0 = this;
                r0.f1053a = r2
                r0.<init>()
                return
        }

        @Override // p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: b */
        public void mo2775b(p000a.p045n.AbstractC0367m r3) {
                r2 = this;
                android.view.View r0 = r2.f1053a
                r1 = 1065353216(0x3f800000, float:1.0)
                p000a.p045n.C0341d0.m2902a(r0, r1)
                android.view.View r0 = r2.f1053a
                p000a.p045n.C0341d0.m2903a(r0)
                r3.mo2785b(r2)
                return
        }
    }

    /* renamed from: a.n.d$b */
    /* loaded from: classes.dex */
    private static class C0340b extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        private final android.view.View f1054a;

        /* renamed from: b */
        private boolean f1055b;

        C0340b(android.view.View r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f1055b = r0
                r1.f1054a = r2
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r3) {
                r2 = this;
                android.view.View r3 = r2.f1054a
                r0 = 1065353216(0x3f800000, float:1.0)
                p000a.p045n.C0341d0.m2902a(r3, r0)
                boolean r3 = r2.f1055b
                if (r3 == 0) goto L_0x0012
                android.view.View r3 = r2.f1054a
                r0 = 0
                r1 = 0
                r3.setLayerType(r0, r1)
            L_0x0012:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r3) {
                r2 = this;
                android.view.View r3 = r2.f1054a
                boolean r3 = p000a.p018g.p029l.C0216r.m3400u(r3)
                if (r3 == 0) goto L_0x001a
                android.view.View r3 = r2.f1054a
                int r3 = r3.getLayerType()
                if (r3 != 0) goto L_0x001a
                r3 = 1
                r2.f1055b = r3
                android.view.View r3 = r2.f1054a
                r0 = 2
                r1 = 0
                r3.setLayerType(r0, r1)
            L_0x001a:
                return
        }
    }

    public C0338d(int r1) {
            r0 = this;
            r0.<init>()
            r0.m2857a(r1)
            return
    }

    /* renamed from: a */
    private static float m2906a(p000a.p045n.C0383s r1, float r2) {
            if (r1 == 0) goto L_0x0012
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f1166a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
    }

    /* renamed from: a */
    private android.animation.Animator m2905a(android.view.View r3, float r4, float r5) {
            r2 = this;
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0006
            r3 = 0
            return r3
        L_0x0006:
            p000a.p045n.C0341d0.m2902a(r3, r4)
            android.util.Property<android.view.View, java.lang.Float> r4 = p000a.p045n.C0341d0.f1059d
            r0 = 1
            float[] r0 = new float[r0]
            r1 = 0
            r0[r1] = r5
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r3, r4, r0)
            a.n.d$b r5 = new a.n.d$b
            r5.<init>(r3)
            r4.addListener(r5)
            a.n.d$a r5 = new a.n.d$a
            r5.<init>(r2, r3)
            r2.mo2795a(r5)
            return r4
    }

    @Override // p000a.p045n.AbstractC0357i0
    /* renamed from: a */
    public android.animation.Animator mo2855a(android.view.ViewGroup r2, android.view.View r3, p000a.p045n.C0383s r4, p000a.p045n.C0383s r5) {
            r1 = this;
            r2 = 0
            float r4 = m2906a(r4, r2)
            r5 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r2 = r4
        L_0x000d:
            android.animation.Animator r2 = r1.m2905a(r3, r2, r5)
            return r2
    }

    @Override // p000a.p045n.AbstractC0357i0
    /* renamed from: b */
    public android.animation.Animator mo2852b(android.view.ViewGroup r1, android.view.View r2, p000a.p045n.C0383s r3, p000a.p045n.C0383s r4) {
            r0 = this;
            p000a.p045n.C0341d0.m2894e(r2)
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = m2906a(r3, r1)
            r3 = 0
            android.animation.Animator r1 = r0.m2905a(r2, r1, r3)
            return r1
    }

    @Override // p000a.p045n.AbstractC0357i0, p000a.p045n.AbstractC0367m
    /* renamed from: c */
    public void mo2783c(p000a.p045n.C0383s r3) {
            r2 = this;
            super.mo2783c(r3)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.f1166a
            android.view.View r3 = r3.f1167b
            float r3 = p000a.p045n.C0341d0.m2896c(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.String r1 = "android:fade:transitionAlpha"
            r0.put(r1, r3)
            return
    }
}
