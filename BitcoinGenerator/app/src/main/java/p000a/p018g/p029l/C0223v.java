package p000a.p018g.p029l;

/* renamed from: a.g.l.v */
/* loaded from: classes.dex */
public final class C0223v {

    /* renamed from: a */
    private java.lang.ref.WeakReference<android.view.View> f675a;

    /* renamed from: b */
    java.lang.Runnable f676b;

    /* renamed from: c */
    java.lang.Runnable f677c;

    /* renamed from: d */
    int f678d;

    /* renamed from: a.g.l.v$a */
    /* loaded from: classes.dex */
    class C0224a extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ p000a.p018g.p029l.AbstractC0227w f679a;

        /* renamed from: b */
        final /* synthetic */ android.view.View f680b;

        C0224a(p000a.p018g.p029l.C0223v r1, p000a.p018g.p029l.AbstractC0227w r2, android.view.View r3) {
                r0 = this;
                r0.f679a = r2
                r0.f680b = r3
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r2) {
                r1 = this;
                a.g.l.w r2 = r1.f679a
                android.view.View r0 = r1.f680b
                r2.mo1848c(r0)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                a.g.l.w r2 = r1.f679a
                android.view.View r0 = r1.f680b
                r2.mo1850a(r0)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                a.g.l.w r2 = r1.f679a
                android.view.View r0 = r1.f680b
                r2.mo1849b(r0)
                return
        }
    }

    /* renamed from: a.g.l.v$b */
    /* loaded from: classes.dex */
    class C0225b implements android.animation.ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ p000a.p018g.p029l.AbstractC0229y f681a;

        /* renamed from: b */
        final /* synthetic */ android.view.View f682b;

        C0225b(p000a.p018g.p029l.C0223v r1, p000a.p018g.p029l.AbstractC0229y r2, android.view.View r3) {
                r0 = this;
                r0.f681a = r2
                r0.f682b = r3
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r2) {
                r1 = this;
                a.g.l.y r2 = r1.f681a
                android.view.View r0 = r1.f682b
                r2.mo2473a(r0)
                return
        }
    }

    /* renamed from: a.g.l.v$c */
    /* loaded from: classes.dex */
    static class C0226c implements p000a.p018g.p029l.AbstractC0227w {

        /* renamed from: a */
        p000a.p018g.p029l.C0223v f683a;

        /* renamed from: b */
        boolean f684b;

        C0226c(p000a.p018g.p029l.C0223v r1) {
                r0 = this;
                r0.<init>()
                r0.f683a = r1
                return
        }

        @Override // p000a.p018g.p029l.AbstractC0227w
        /* renamed from: a */
        public void mo1850a(android.view.View r4) {
                r3 = this;
                a.g.l.v r0 = r3.f683a
                int r0 = r0.f678d
                r1 = -1
                r2 = 0
                if (r0 <= r1) goto L_0x000f
                r4.setLayerType(r0, r2)
                a.g.l.v r0 = r3.f683a
                r0.f678d = r1
            L_0x000f:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 16
                if (r0 >= r1) goto L_0x0019
                boolean r0 = r3.f684b
                if (r0 != 0) goto L_0x0039
            L_0x0019:
                a.g.l.v r0 = r3.f683a
                java.lang.Runnable r1 = r0.f677c
                if (r1 == 0) goto L_0x0024
                r0.f677c = r2
                r1.run()
            L_0x0024:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r1 = r0 instanceof p000a.p018g.p029l.AbstractC0227w
                if (r1 == 0) goto L_0x0031
                r2 = r0
                a.g.l.w r2 = (p000a.p018g.p029l.AbstractC0227w) r2
            L_0x0031:
                if (r2 == 0) goto L_0x0036
                r2.mo1850a(r4)
            L_0x0036:
                r4 = 1
                r3.f684b = r4
            L_0x0039:
                return
        }

        @Override // p000a.p018g.p029l.AbstractC0227w
        /* renamed from: b */
        public void mo1849b(android.view.View r4) {
                r3 = this;
                r0 = 0
                r3.f684b = r0
                a.g.l.v r0 = r3.f683a
                int r0 = r0.f678d
                r1 = 0
                r2 = -1
                if (r0 <= r2) goto L_0x000f
                r0 = 2
                r4.setLayerType(r0, r1)
            L_0x000f:
                a.g.l.v r0 = r3.f683a
                java.lang.Runnable r2 = r0.f676b
                if (r2 == 0) goto L_0x001a
                r0.f676b = r1
                r2.run()
            L_0x001a:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof p000a.p018g.p029l.AbstractC0227w
                if (r2 == 0) goto L_0x0027
                r1 = r0
                a.g.l.w r1 = (p000a.p018g.p029l.AbstractC0227w) r1
            L_0x0027:
                if (r1 == 0) goto L_0x002c
                r1.mo1849b(r4)
            L_0x002c:
                return
        }

        @Override // p000a.p018g.p029l.AbstractC0227w
        /* renamed from: c */
        public void mo1848c(android.view.View r3) {
                r2 = this;
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r3.getTag(r0)
                boolean r1 = r0 instanceof p000a.p018g.p029l.AbstractC0227w
                if (r1 == 0) goto L_0x000d
                a.g.l.w r0 = (p000a.p018g.p029l.AbstractC0227w) r0
                goto L_0x000e
            L_0x000d:
                r0 = 0
            L_0x000e:
                if (r0 == 0) goto L_0x0013
                r0.mo1848c(r3)
            L_0x0013:
                return
        }
    }

    C0223v(android.view.View r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f676b = r0
            r1.f677c = r0
            r0 = -1
            r1.f678d = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.f675a = r0
            return
    }

    /* renamed from: a */
    private void m3368a(android.view.View r3, p000a.p018g.p029l.AbstractC0227w r4) {
            r2 = this;
            if (r4 == 0) goto L_0x000f
            android.view.ViewPropertyAnimator r0 = r3.animate()
            a.g.l.v$a r1 = new a.g.l.v$a
            r1.<init>(r2, r4, r3)
            r0.setListener(r1)
            goto L_0x0017
        L_0x000f:
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r4 = 0
            r3.setListener(r4)
        L_0x0017:
            return
    }

    /* renamed from: a */
    public p000a.p018g.p029l.C0223v m3372a(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f675a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0011
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.alpha(r2)
        L_0x0011:
            return r1
    }

    /* renamed from: a */
    public p000a.p018g.p029l.C0223v m3371a(long r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f675a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0011
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.setDuration(r2)
        L_0x0011:
            return r1
    }

    /* renamed from: a */
    public p000a.p018g.p029l.C0223v m3370a(p000a.p018g.p029l.AbstractC0227w r4) {
            r3 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r3.f675a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x001e
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r1 < r2) goto L_0x0011
            goto L_0x001b
        L_0x0011:
            r1 = 2113929216(0x7e000000, float:4.2535296E37)
            r0.setTag(r1, r4)
            a.g.l.v$c r4 = new a.g.l.v$c
            r4.<init>(r3)
        L_0x001b:
            r3.m3368a(r0, r4)
        L_0x001e:
            return r3
    }

    /* renamed from: a */
    public p000a.p018g.p029l.C0223v m3369a(p000a.p018g.p029l.AbstractC0229y r4) {
            r3 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r3.f675a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x001f
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 19
            if (r1 < r2) goto L_0x001f
            r1 = 0
            if (r4 == 0) goto L_0x0018
            a.g.l.v$b r1 = new a.g.l.v$b
            r1.<init>(r3, r4, r0)
        L_0x0018:
            android.view.ViewPropertyAnimator r4 = r0.animate()
            r4.setUpdateListener(r1)
        L_0x001f:
            return r3
    }

    /* renamed from: a */
    public p000a.p018g.p029l.C0223v m3367a(android.view.animation.Interpolator r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f675a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0011
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.setInterpolator(r2)
        L_0x0011:
            return r1
    }

    /* renamed from: a */
    public void m3373a() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f675a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0011
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
        L_0x0011:
            return
    }

    /* renamed from: b */
    public long m3366b() {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.f675a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0013
            android.view.ViewPropertyAnimator r0 = r0.animate()
            long r0 = r0.getDuration()
            return r0
        L_0x0013:
            r0 = 0
            return r0
    }

    /* renamed from: b */
    public p000a.p018g.p029l.C0223v m3365b(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f675a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0011
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.translationY(r2)
        L_0x0011:
            return r1
    }

    /* renamed from: b */
    public p000a.p018g.p029l.C0223v m3364b(long r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f675a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0011
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.setStartDelay(r2)
        L_0x0011:
            return r1
    }

    /* renamed from: c */
    public void m3363c() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f675a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0011
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.start()
        L_0x0011:
            return
    }
}
