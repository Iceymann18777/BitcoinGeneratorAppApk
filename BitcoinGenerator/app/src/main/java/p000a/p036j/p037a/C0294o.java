package p000a.p036j.p037a;

/* renamed from: a.j.a.o */
/* loaded from: classes.dex */
class C0294o extends p000a.p036j.p037a.AbstractC0299p {

    /* renamed from: a.j.a.o$a */
    /* loaded from: classes.dex */
    class C0295a extends android.transition.Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ android.graphics.Rect f975a;

        C0295a(p000a.p036j.p037a.C0294o r1, android.graphics.Rect r2) {
                r0 = this;
                r0.f975a = r2
                r0.<init>()
                return
        }

        @Override // android.transition.Transition.EpicenterCallback
        public android.graphics.Rect onGetEpicenter(android.transition.Transition r1) {
                r0 = this;
                android.graphics.Rect r1 = r0.f975a
                return r1
        }
    }

    /* renamed from: a.j.a.o$b */
    /* loaded from: classes.dex */
    class C0296b implements android.transition.Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ android.view.View f976a;

        /* renamed from: b */
        final /* synthetic */ java.util.ArrayList f977b;

        C0296b(p000a.p036j.p037a.C0294o r1, android.view.View r2, java.util.ArrayList r3) {
                r0 = this;
                r0.f976a = r2
                r0.f977b = r3
                r0.<init>()
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(android.transition.Transition r4) {
                r3 = this;
                r4.removeListener(r3)
                android.view.View r4 = r3.f976a
                r0 = 8
                r4.setVisibility(r0)
                java.util.ArrayList r4 = r3.f977b
                int r4 = r4.size()
                r0 = 0
                r1 = 0
            L_0x0012:
                if (r1 >= r4) goto L_0x0022
                java.util.ArrayList r2 = r3.f977b
                java.lang.Object r2 = r2.get(r1)
                android.view.View r2 = (android.view.View) r2
                r2.setVisibility(r0)
                int r1 = r1 + 1
                goto L_0x0012
            L_0x0022:
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(android.transition.Transition r1) {
                r0 = this;
                return
        }
    }

    /* renamed from: a.j.a.o$c */
    /* loaded from: classes.dex */
    class C0297c implements android.transition.Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ java.lang.Object f978a;

        /* renamed from: b */
        final /* synthetic */ java.util.ArrayList f979b;

        /* renamed from: c */
        final /* synthetic */ java.lang.Object f980c;

        /* renamed from: d */
        final /* synthetic */ java.util.ArrayList f981d;

        /* renamed from: e */
        final /* synthetic */ java.lang.Object f982e;

        /* renamed from: f */
        final /* synthetic */ java.util.ArrayList f983f;

        /* renamed from: g */
        final /* synthetic */ p000a.p036j.p037a.C0294o f984g;

        C0297c(p000a.p036j.p037a.C0294o r1, java.lang.Object r2, java.util.ArrayList r3, java.lang.Object r4, java.util.ArrayList r5, java.lang.Object r6, java.util.ArrayList r7) {
                r0 = this;
                r0.f984g = r1
                r0.f978a = r2
                r0.f979b = r3
                r0.f980c = r4
                r0.f981d = r5
                r0.f982e = r6
                r0.f983f = r7
                r0.<init>()
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(android.transition.Transition r4) {
                r3 = this;
                java.lang.Object r4 = r3.f978a
                r0 = 0
                if (r4 == 0) goto L_0x000c
                a.j.a.o r1 = r3.f984g
                java.util.ArrayList r2 = r3.f979b
                r1.mo2880a(r4, r2, r0)
            L_0x000c:
                java.lang.Object r4 = r3.f980c
                if (r4 == 0) goto L_0x0017
                a.j.a.o r1 = r3.f984g
                java.util.ArrayList r2 = r3.f981d
                r1.mo2880a(r4, r2, r0)
            L_0x0017:
                java.lang.Object r4 = r3.f982e
                if (r4 == 0) goto L_0x0022
                a.j.a.o r1 = r3.f984g
                java.util.ArrayList r2 = r3.f983f
                r1.mo2880a(r4, r2, r0)
            L_0x0022:
                return
        }
    }

    /* renamed from: a.j.a.o$d */
    /* loaded from: classes.dex */
    class C0298d extends android.transition.Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ android.graphics.Rect f985a;

        C0298d(p000a.p036j.p037a.C0294o r1, android.graphics.Rect r2) {
                r0 = this;
                r0.f985a = r2
                r0.<init>()
                return
        }

        @Override // android.transition.Transition.EpicenterCallback
        public android.graphics.Rect onGetEpicenter(android.transition.Transition r1) {
                r0 = this;
                android.graphics.Rect r1 = r0.f985a
                if (r1 == 0) goto L_0x000e
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x000b
                goto L_0x000e
            L_0x000b:
                android.graphics.Rect r1 = r0.f985a
                return r1
            L_0x000e:
                r1 = 0
                return r1
        }
    }

    C0294o() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    private static boolean m2963a(android.transition.Transition r1) {
            java.util.List r0 = r1.getTargetIds()
            boolean r0 = p000a.p036j.p037a.AbstractC0299p.m2956a(r0)
            if (r0 == 0) goto L_0x0021
            java.util.List r0 = r1.getTargetNames()
            boolean r0 = p000a.p036j.p037a.AbstractC0299p.m2956a(r0)
            if (r0 == 0) goto L_0x0021
            java.util.List r1 = r1.getTargetTypes()
            boolean r1 = p000a.p036j.p037a.AbstractC0299p.m2956a(r1)
            if (r1 != 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r1 = 0
            goto L_0x0022
        L_0x0021:
            r1 = 1
        L_0x0022:
            return r1
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: a */
    public java.lang.Object mo2883a(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            android.transition.Transition r2 = (android.transition.Transition) r2
            android.transition.Transition r3 = (android.transition.Transition) r3
            android.transition.Transition r4 = (android.transition.Transition) r4
            if (r2 == 0) goto L_0x001d
            if (r3 == 0) goto L_0x001d
            android.transition.TransitionSet r0 = new android.transition.TransitionSet
            r0.<init>()
            android.transition.TransitionSet r2 = r0.addTransition(r2)
            android.transition.TransitionSet r2 = r2.addTransition(r3)
            r3 = 1
            android.transition.TransitionSet r2 = r2.setOrdering(r3)
            goto L_0x0025
        L_0x001d:
            if (r2 == 0) goto L_0x0020
            goto L_0x0025
        L_0x0020:
            if (r3 == 0) goto L_0x0024
            r2 = r3
            goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            if (r4 == 0) goto L_0x0035
            android.transition.TransitionSet r3 = new android.transition.TransitionSet
            r3.<init>()
            if (r2 == 0) goto L_0x0031
            r3.addTransition(r2)
        L_0x0031:
            r3.addTransition(r4)
            return r3
        L_0x0035:
            return r2
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: a */
    public void mo2888a(android.view.ViewGroup r1, java.lang.Object r2) {
            r0 = this;
            android.transition.Transition r2 = (android.transition.Transition) r2
            android.transition.TransitionManager.beginDelayedTransition(r1, r2)
            return
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: a */
    public void mo2886a(java.lang.Object r2, android.graphics.Rect r3) {
            r1 = this;
            if (r2 == 0) goto L_0x000c
            android.transition.Transition r2 = (android.transition.Transition) r2
            a.j.a.o$d r0 = new a.j.a.o$d
            r0.<init>(r1, r3)
            r2.setEpicenterCallback(r0)
        L_0x000c:
            return
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: a */
    public void mo2885a(java.lang.Object r1, android.view.View r2) {
            r0 = this;
            if (r1 == 0) goto L_0x0007
            android.transition.Transition r1 = (android.transition.Transition) r1
            r1.addTarget(r2)
        L_0x0007:
            return
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: a */
    public void mo2884a(java.lang.Object r2, android.view.View r3, java.util.ArrayList<android.view.View> r4) {
            r1 = this;
            android.transition.Transition r2 = (android.transition.Transition) r2
            a.j.a.o$b r0 = new a.j.a.o$b
            r0.<init>(r1, r3, r4)
            r2.addListener(r0)
            return
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: a */
    public void mo2882a(java.lang.Object r11, java.lang.Object r12, java.util.ArrayList<android.view.View> r13, java.lang.Object r14, java.util.ArrayList<android.view.View> r15, java.lang.Object r16, java.util.ArrayList<android.view.View> r17) {
            r10 = this;
            r0 = r11
            android.transition.Transition r0 = (android.transition.Transition) r0
            a.j.a.o$c r9 = new a.j.a.o$c
            r1 = r9
            r2 = r10
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.addListener(r9)
            return
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: a */
    public void mo2881a(java.lang.Object r4, java.util.ArrayList<android.view.View> r5) {
            r3 = this;
            android.transition.Transition r4 = (android.transition.Transition) r4
            if (r4 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r4 instanceof android.transition.TransitionSet
            r1 = 0
            if (r0 == 0) goto L_0x001c
            android.transition.TransitionSet r4 = (android.transition.TransitionSet) r4
            int r0 = r4.getTransitionCount()
        L_0x0010:
            if (r1 >= r0) goto L_0x003e
            android.transition.Transition r2 = r4.getTransitionAt(r1)
            r3.mo2881a(r2, r5)
            int r1 = r1 + 1
            goto L_0x0010
        L_0x001c:
            boolean r0 = m2963a(r4)
            if (r0 != 0) goto L_0x003e
            java.util.List r0 = r4.getTargets()
            boolean r0 = p000a.p036j.p037a.AbstractC0299p.m2956a(r0)
            if (r0 == 0) goto L_0x003e
            int r0 = r5.size()
        L_0x0030:
            if (r1 >= r0) goto L_0x003e
            java.lang.Object r2 = r5.get(r1)
            android.view.View r2 = (android.view.View) r2
            r4.addTarget(r2)
            int r1 = r1 + 1
            goto L_0x0030
        L_0x003e:
            return
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: a */
    public void mo2880a(java.lang.Object r5, java.util.ArrayList<android.view.View> r6, java.util.ArrayList<android.view.View> r7) {
            r4 = this;
            android.transition.Transition r5 = (android.transition.Transition) r5
            boolean r0 = r5 instanceof android.transition.TransitionSet
            r1 = 0
            if (r0 == 0) goto L_0x0019
            android.transition.TransitionSet r5 = (android.transition.TransitionSet) r5
            int r0 = r5.getTransitionCount()
        L_0x000d:
            if (r1 >= r0) goto L_0x005f
            android.transition.Transition r2 = r5.getTransitionAt(r1)
            r4.mo2880a(r2, r6, r7)
            int r1 = r1 + 1
            goto L_0x000d
        L_0x0019:
            boolean r0 = m2963a(r5)
            if (r0 != 0) goto L_0x005f
            java.util.List r0 = r5.getTargets()
            if (r0 == 0) goto L_0x005f
            int r2 = r0.size()
            int r3 = r6.size()
            if (r2 != r3) goto L_0x005f
            boolean r0 = r0.containsAll(r6)
            if (r0 == 0) goto L_0x005f
            if (r7 != 0) goto L_0x0039
            r0 = 0
            goto L_0x003d
        L_0x0039:
            int r0 = r7.size()
        L_0x003d:
            if (r1 >= r0) goto L_0x004b
            java.lang.Object r2 = r7.get(r1)
            android.view.View r2 = (android.view.View) r2
            r5.addTarget(r2)
            int r1 = r1 + 1
            goto L_0x003d
        L_0x004b:
            int r7 = r6.size()
            int r7 = r7 + (-1)
        L_0x0051:
            if (r7 < 0) goto L_0x005f
            java.lang.Object r0 = r6.get(r7)
            android.view.View r0 = (android.view.View) r0
            r5.removeTarget(r0)
            int r7 = r7 + (-1)
            goto L_0x0051
        L_0x005f:
            return
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: a */
    public boolean mo2887a(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof android.transition.Transition
            return r1
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: b */
    public java.lang.Object mo2879b(java.lang.Object r1) {
            r0 = this;
            if (r1 == 0) goto L_0x0009
            android.transition.Transition r1 = (android.transition.Transition) r1
            android.transition.Transition r1 = r1.clone()
            goto L_0x000a
        L_0x0009:
            r1 = 0
        L_0x000a:
            return r1
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: b */
    public java.lang.Object mo2876b(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            android.transition.TransitionSet r0 = new android.transition.TransitionSet
            r0.<init>()
            if (r2 == 0) goto L_0x000c
            android.transition.Transition r2 = (android.transition.Transition) r2
            r0.addTransition(r2)
        L_0x000c:
            if (r3 == 0) goto L_0x0013
            android.transition.Transition r3 = (android.transition.Transition) r3
            r0.addTransition(r3)
        L_0x0013:
            if (r4 == 0) goto L_0x001a
            android.transition.Transition r4 = (android.transition.Transition) r4
            r0.addTransition(r4)
        L_0x001a:
            return r0
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: b */
    public void mo2878b(java.lang.Object r1, android.view.View r2) {
            r0 = this;
            if (r1 == 0) goto L_0x0007
            android.transition.Transition r1 = (android.transition.Transition) r1
            r1.removeTarget(r2)
        L_0x0007:
            return
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: b */
    public void mo2877b(java.lang.Object r5, android.view.View r6, java.util.ArrayList<android.view.View> r7) {
            r4 = this;
            android.transition.TransitionSet r5 = (android.transition.TransitionSet) r5
            java.util.List r0 = r5.getTargets()
            r0.clear()
            int r1 = r7.size()
            r2 = 0
        L_0x000e:
            if (r2 >= r1) goto L_0x001c
            java.lang.Object r3 = r7.get(r2)
            android.view.View r3 = (android.view.View) r3
            p000a.p036j.p037a.AbstractC0299p.m2955a(r0, r3)
            int r2 = r2 + 1
            goto L_0x000e
        L_0x001c:
            r0.add(r6)
            r7.add(r6)
            r4.mo2881a(r5, r7)
            return
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: b */
    public void mo2875b(java.lang.Object r2, java.util.ArrayList<android.view.View> r3, java.util.ArrayList<android.view.View> r4) {
            r1 = this;
            android.transition.TransitionSet r2 = (android.transition.TransitionSet) r2
            if (r2 == 0) goto L_0x0015
            java.util.List r0 = r2.getTargets()
            r0.clear()
            java.util.List r0 = r2.getTargets()
            r0.addAll(r4)
            r1.mo2880a(r2, r3, r4)
        L_0x0015:
            return
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: c */
    public java.lang.Object mo2874c(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L_0x0004
            r2 = 0
            return r2
        L_0x0004:
            android.transition.TransitionSet r0 = new android.transition.TransitionSet
            r0.<init>()
            android.transition.Transition r2 = (android.transition.Transition) r2
            r0.addTransition(r2)
            return r0
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: c */
    public void mo2873c(java.lang.Object r2, android.view.View r3) {
            r1 = this;
            if (r3 == 0) goto L_0x0014
            android.transition.Transition r2 = (android.transition.Transition) r2
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.m2962a(r3, r0)
            a.j.a.o$a r3 = new a.j.a.o$a
            r3.<init>(r1, r0)
            r2.setEpicenterCallback(r3)
        L_0x0014:
            return
    }
}
