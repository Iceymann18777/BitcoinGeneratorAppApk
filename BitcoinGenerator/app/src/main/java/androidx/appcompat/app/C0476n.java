package androidx.appcompat.app;

/* renamed from: androidx.appcompat.app.n */
/* loaded from: classes.dex */
public class C0476n extends androidx.appcompat.app.AbstractC0428a implements androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0529d {

    /* renamed from: B */
    private static final android.view.animation.Interpolator f1546B = null;

    /* renamed from: C */
    private static final android.view.animation.Interpolator f1547C = null;

    /* renamed from: A */
    final p000a.p018g.p029l.AbstractC0229y f1548A;

    /* renamed from: a */
    android.content.Context f1549a;

    /* renamed from: b */
    private android.content.Context f1550b;

    /* renamed from: c */
    androidx.appcompat.widget.ActionBarOverlayLayout f1551c;

    /* renamed from: d */
    androidx.appcompat.widget.ActionBarContainer f1552d;

    /* renamed from: e */
    androidx.appcompat.widget.AbstractC0569b0 f1553e;

    /* renamed from: f */
    androidx.appcompat.widget.ActionBarContextView f1554f;

    /* renamed from: g */
    android.view.View f1555g;

    /* renamed from: h */
    androidx.appcompat.widget.C0619m0 f1556h;

    /* renamed from: i */
    private boolean f1557i;

    /* renamed from: j */
    androidx.appcompat.app.C0476n.C0480d f1558j;

    /* renamed from: k */
    p000a.p001a.p006m.AbstractC0029b f1559k;

    /* renamed from: l */
    p000a.p001a.p006m.AbstractC0029b.AbstractC0030a f1560l;

    /* renamed from: m */
    private boolean f1561m;

    /* renamed from: n */
    private java.util.ArrayList<androidx.appcompat.app.AbstractC0428a.AbstractC0430b> f1562n;

    /* renamed from: o */
    private boolean f1563o;

    /* renamed from: p */
    private int f1564p;

    /* renamed from: q */
    boolean f1565q;

    /* renamed from: r */
    boolean f1566r;

    /* renamed from: s */
    boolean f1567s;

    /* renamed from: t */
    private boolean f1568t;

    /* renamed from: u */
    private boolean f1569u;

    /* renamed from: v */
    p000a.p001a.p006m.C0039h f1570v;

    /* renamed from: w */
    private boolean f1571w;

    /* renamed from: x */
    boolean f1572x;

    /* renamed from: y */
    final p000a.p018g.p029l.AbstractC0227w f1573y;

    /* renamed from: z */
    final p000a.p018g.p029l.AbstractC0227w f1574z;

    /* renamed from: androidx.appcompat.app.n$a */
    /* loaded from: classes.dex */
    class C0477a extends p000a.p018g.p029l.C0228x {

        /* renamed from: a */
        final /* synthetic */ androidx.appcompat.app.C0476n f1575a;

        C0477a(androidx.appcompat.app.C0476n r1) {
                r0 = this;
                r0.f1575a = r1
                r0.<init>()
                return
        }

        @Override // p000a.p018g.p029l.AbstractC0227w
        /* renamed from: a */
        public void mo1850a(android.view.View r2) {
                r1 = this;
                androidx.appcompat.app.n r2 = r1.f1575a
                boolean r0 = r2.f1565q
                if (r0 == 0) goto L_0x0015
                android.view.View r2 = r2.f1555g
                if (r2 == 0) goto L_0x0015
                r0 = 0
                r2.setTranslationY(r0)
                androidx.appcompat.app.n r2 = r1.f1575a
                androidx.appcompat.widget.ActionBarContainer r2 = r2.f1552d
                r2.setTranslationY(r0)
            L_0x0015:
                androidx.appcompat.app.n r2 = r1.f1575a
                androidx.appcompat.widget.ActionBarContainer r2 = r2.f1552d
                r0 = 8
                r2.setVisibility(r0)
                androidx.appcompat.app.n r2 = r1.f1575a
                androidx.appcompat.widget.ActionBarContainer r2 = r2.f1552d
                r0 = 0
                r2.setTransitioning(r0)
                androidx.appcompat.app.n r2 = r1.f1575a
                r0 = 0
                r2.f1570v = r0
                r2.m2479l()
                androidx.appcompat.app.n r2 = r1.f1575a
                androidx.appcompat.widget.ActionBarOverlayLayout r2 = r2.f1551c
                if (r2 == 0) goto L_0x0037
                p000a.p018g.p029l.C0216r.m3449B(r2)
            L_0x0037:
                return
        }
    }

    /* renamed from: androidx.appcompat.app.n$b */
    /* loaded from: classes.dex */
    class C0478b extends p000a.p018g.p029l.C0228x {

        /* renamed from: a */
        final /* synthetic */ androidx.appcompat.app.C0476n f1576a;

        C0478b(androidx.appcompat.app.C0476n r1) {
                r0 = this;
                r0.f1576a = r1
                r0.<init>()
                return
        }

        @Override // p000a.p018g.p029l.AbstractC0227w
        /* renamed from: a */
        public void mo1850a(android.view.View r2) {
                r1 = this;
                androidx.appcompat.app.n r2 = r1.f1576a
                r0 = 0
                r2.f1570v = r0
                androidx.appcompat.widget.ActionBarContainer r2 = r2.f1552d
                r2.requestLayout()
                return
        }
    }

    /* renamed from: androidx.appcompat.app.n$c */
    /* loaded from: classes.dex */
    class C0479c implements p000a.p018g.p029l.AbstractC0229y {

        /* renamed from: a */
        final /* synthetic */ androidx.appcompat.app.C0476n f1577a;

        C0479c(androidx.appcompat.app.C0476n r1) {
                r0 = this;
                r0.f1577a = r1
                r0.<init>()
                return
        }

        @Override // p000a.p018g.p029l.AbstractC0229y
        /* renamed from: a */
        public void mo2473a(android.view.View r1) {
                r0 = this;
                androidx.appcompat.app.n r1 = r0.f1577a
                androidx.appcompat.widget.ActionBarContainer r1 = r1.f1552d
                android.view.ViewParent r1 = r1.getParent()
                android.view.View r1 = (android.view.View) r1
                r1.invalidate()
                return
        }
    }

    /* renamed from: androidx.appcompat.app.n$d */
    /* loaded from: classes.dex */
    public class C0480d extends p000a.p001a.p006m.AbstractC0029b implements androidx.appcompat.view.menu.C0496h.AbstractC0497a {

        /* renamed from: d */
        private final android.content.Context f1578d;

        /* renamed from: e */
        private final androidx.appcompat.view.menu.C0496h f1579e;

        /* renamed from: f */
        private p000a.p001a.p006m.AbstractC0029b.AbstractC0030a f1580f;

        /* renamed from: g */
        private java.lang.ref.WeakReference<android.view.View> f1581g;

        /* renamed from: h */
        final /* synthetic */ androidx.appcompat.app.C0476n f1582h;

        public C0480d(androidx.appcompat.app.C0476n r1, android.content.Context r2, p000a.p001a.p006m.AbstractC0029b.AbstractC0030a r3) {
                r0 = this;
                r0.f1582h = r1
                r0.<init>()
                r0.f1578d = r2
                r0.f1580f = r3
                androidx.appcompat.view.menu.h r1 = new androidx.appcompat.view.menu.h
                r1.<init>(r2)
                r2 = 1
                r1.m2396c(r2)
                r0.f1579e = r1
                androidx.appcompat.view.menu.h r1 = r0.f1579e
                r1.mo2302a(r0)
                return
        }

        @Override // p000a.p001a.p006m.AbstractC0029b
        /* renamed from: a */
        public void mo2472a() {
                r3 = this;
                androidx.appcompat.app.n r0 = r3.f1582h
                androidx.appcompat.app.n$d r1 = r0.f1558j
                if (r1 == r3) goto L_0x0007
                return
            L_0x0007:
                boolean r1 = r0.f1566r
                boolean r0 = r0.f1567s
                r2 = 0
                boolean r0 = androidx.appcompat.app.C0476n.m2495a(r1, r0, r2)
                if (r0 != 0) goto L_0x001b
                androidx.appcompat.app.n r0 = r3.f1582h
                r0.f1559k = r3
                a.a.m.b$a r1 = r3.f1580f
                r0.f1560l = r1
                goto L_0x0020
            L_0x001b:
                a.a.m.b$a r0 = r3.f1580f
                r0.mo2545a(r3)
            L_0x0020:
                r0 = 0
                r3.f1580f = r0
                androidx.appcompat.app.n r1 = r3.f1582h
                r1.m2489e(r2)
                androidx.appcompat.app.n r1 = r3.f1582h
                androidx.appcompat.widget.ActionBarContextView r1 = r1.f1554f
                r1.m2289a()
                androidx.appcompat.app.n r1 = r3.f1582h
                androidx.appcompat.widget.b0 r1 = r1.f1553e
                android.view.ViewGroup r1 = r1.mo1858l()
                r2 = 32
                r1.sendAccessibilityEvent(r2)
                androidx.appcompat.app.n r1 = r3.f1582h
                androidx.appcompat.widget.ActionBarOverlayLayout r2 = r1.f1551c
                boolean r1 = r1.f1572x
                r2.setHideOnContentScrollEnabled(r1)
                androidx.appcompat.app.n r1 = r3.f1582h
                r1.f1558j = r0
                return
        }

        @Override // p000a.p001a.p006m.AbstractC0029b
        /* renamed from: a */
        public void mo2471a(int r2) {
                r1 = this;
                androidx.appcompat.app.n r0 = r1.f1582h
                android.content.Context r0 = r0.f1549a
                android.content.res.Resources r0 = r0.getResources()
                java.lang.String r2 = r0.getString(r2)
                r1.mo2469a(r2)
                return
        }

        @Override // p000a.p001a.p006m.AbstractC0029b
        /* renamed from: a */
        public void mo2470a(android.view.View r2) {
                r1 = this;
                androidx.appcompat.app.n r0 = r1.f1582h
                androidx.appcompat.widget.ActionBarContextView r0 = r0.f1554f
                r0.setCustomView(r2)
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.f1581g = r0
                return
        }

        @Override // androidx.appcompat.view.menu.C0496h.AbstractC0497a
        /* renamed from: a */
        public void mo65a(androidx.appcompat.view.menu.C0496h r1) {
                r0 = this;
                a.a.m.b$a r1 = r0.f1580f
                if (r1 != 0) goto L_0x0005
                return
            L_0x0005:
                r0.mo2460i()
                androidx.appcompat.app.n r1 = r0.f1582h
                androidx.appcompat.widget.ActionBarContextView r1 = r1.f1554f
                r1.m2285d()
                return
        }

        @Override // p000a.p001a.p006m.AbstractC0029b
        /* renamed from: a */
        public void mo2469a(java.lang.CharSequence r2) {
                r1 = this;
                androidx.appcompat.app.n r0 = r1.f1582h
                androidx.appcompat.widget.ActionBarContextView r0 = r0.f1554f
                r0.setSubtitle(r2)
                return
        }

        @Override // p000a.p001a.p006m.AbstractC0029b
        /* renamed from: a */
        public void mo2468a(boolean r2) {
                r1 = this;
                super.mo2468a(r2)
                androidx.appcompat.app.n r0 = r1.f1582h
                androidx.appcompat.widget.ActionBarContextView r0 = r0.f1554f
                r0.setTitleOptional(r2)
                return
        }

        @Override // androidx.appcompat.view.menu.C0496h.AbstractC0497a
        /* renamed from: a */
        public boolean mo64a(androidx.appcompat.view.menu.C0496h r1, android.view.MenuItem r2) {
                r0 = this;
                a.a.m.b$a r1 = r0.f1580f
                if (r1 == 0) goto L_0x0009
                boolean r1 = r1.mo2543a(r0, r2)
                return r1
            L_0x0009:
                r1 = 0
                return r1
        }

        @Override // p000a.p001a.p006m.AbstractC0029b
        /* renamed from: b */
        public android.view.View mo2467b() {
                r1 = this;
                java.lang.ref.WeakReference<android.view.View> r0 = r1.f1581g
                if (r0 == 0) goto L_0x000b
                java.lang.Object r0 = r0.get()
                android.view.View r0 = (android.view.View) r0
                goto L_0x000c
            L_0x000b:
                r0 = 0
            L_0x000c:
                return r0
        }

        @Override // p000a.p001a.p006m.AbstractC0029b
        /* renamed from: b */
        public void mo2466b(int r2) {
                r1 = this;
                androidx.appcompat.app.n r0 = r1.f1582h
                android.content.Context r0 = r0.f1549a
                android.content.res.Resources r0 = r0.getResources()
                java.lang.String r2 = r0.getString(r2)
                r1.mo2465b(r2)
                return
        }

        @Override // p000a.p001a.p006m.AbstractC0029b
        /* renamed from: b */
        public void mo2465b(java.lang.CharSequence r2) {
                r1 = this;
                androidx.appcompat.app.n r0 = r1.f1582h
                androidx.appcompat.widget.ActionBarContextView r0 = r0.f1554f
                r0.setTitle(r2)
                return
        }

        @Override // p000a.p001a.p006m.AbstractC0029b
        /* renamed from: c */
        public android.view.Menu mo2464c() {
                r1 = this;
                androidx.appcompat.view.menu.h r0 = r1.f1579e
                return r0
        }

        @Override // p000a.p001a.p006m.AbstractC0029b
        /* renamed from: d */
        public android.view.MenuInflater mo2463d() {
                r2 = this;
                a.a.m.g r0 = new a.a.m.g
                android.content.Context r1 = r2.f1578d
                r0.<init>(r1)
                return r0
        }

        @Override // p000a.p001a.p006m.AbstractC0029b
        /* renamed from: e */
        public java.lang.CharSequence mo2462e() {
                r1 = this;
                androidx.appcompat.app.n r0 = r1.f1582h
                androidx.appcompat.widget.ActionBarContextView r0 = r0.f1554f
                java.lang.CharSequence r0 = r0.getSubtitle()
                return r0
        }

        @Override // p000a.p001a.p006m.AbstractC0029b
        /* renamed from: g */
        public java.lang.CharSequence mo2461g() {
                r1 = this;
                androidx.appcompat.app.n r0 = r1.f1582h
                androidx.appcompat.widget.ActionBarContextView r0 = r0.f1554f
                java.lang.CharSequence r0 = r0.getTitle()
                return r0
        }

        @Override // p000a.p001a.p006m.AbstractC0029b
        /* renamed from: i */
        public void mo2460i() {
                r2 = this;
                androidx.appcompat.app.n r0 = r2.f1582h
                androidx.appcompat.app.n$d r0 = r0.f1558j
                if (r0 == r2) goto L_0x0007
                return
            L_0x0007:
                androidx.appcompat.view.menu.h r0 = r2.f1579e
                r0.m2373s()
                a.a.m.b$a r0 = r2.f1580f     // Catch: all -> 0x0019
                androidx.appcompat.view.menu.h r1 = r2.f1579e     // Catch: all -> 0x0019
                r0.mo2544a(r2, r1)     // Catch: all -> 0x0019
                androidx.appcompat.view.menu.h r0 = r2.f1579e
                r0.m2374r()
                return
            L_0x0019:
                r0 = move-exception
                androidx.appcompat.view.menu.h r1 = r2.f1579e
                r1.m2374r()
                throw r0
        }

        @Override // p000a.p001a.p006m.AbstractC0029b
        /* renamed from: j */
        public boolean mo2459j() {
                r1 = this;
                androidx.appcompat.app.n r0 = r1.f1582h
                androidx.appcompat.widget.ActionBarContextView r0 = r0.f1554f
                boolean r0 = r0.m2287b()
                return r0
        }

        /* renamed from: k */
        public boolean m2458k() {
                r2 = this;
                androidx.appcompat.view.menu.h r0 = r2.f1579e
                r0.m2373s()
                a.a.m.b$a r0 = r2.f1580f     // Catch: all -> 0x0013
                androidx.appcompat.view.menu.h r1 = r2.f1579e     // Catch: all -> 0x0013
                boolean r0 = r0.mo2542b(r2, r1)     // Catch: all -> 0x0013
                androidx.appcompat.view.menu.h r1 = r2.f1579e
                r1.m2374r()
                return r0
            L_0x0013:
                r0 = move-exception
                androidx.appcompat.view.menu.h r1 = r2.f1579e
                r1.m2374r()
                throw r0
        }
    }

    static {
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            androidx.appcompat.app.C0476n.f1546B = r0
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            androidx.appcompat.app.C0476n.f1547C = r0
            return
    }

    public C0476n(android.app.Activity r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1562n = r0
            r0 = 0
            r1.f1564p = r0
            r0 = 1
            r1.f1565q = r0
            r1.f1569u = r0
            androidx.appcompat.app.n$a r0 = new androidx.appcompat.app.n$a
            r0.<init>(r1)
            r1.f1573y = r0
            androidx.appcompat.app.n$b r0 = new androidx.appcompat.app.n$b
            r0.<init>(r1)
            r1.f1574z = r0
            androidx.appcompat.app.n$c r0 = new androidx.appcompat.app.n$c
            r0.<init>(r1)
            r1.f1548A = r0
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            r1.m2493b(r2)
            if (r3 != 0) goto L_0x0042
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r2 = r2.findViewById(r3)
            r1.f1555g = r2
        L_0x0042:
            return
    }

    public C0476n(android.app.Dialog r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1562n = r0
            r0 = 0
            r1.f1564p = r0
            r0 = 1
            r1.f1565q = r0
            r1.f1569u = r0
            androidx.appcompat.app.n$a r0 = new androidx.appcompat.app.n$a
            r0.<init>(r1)
            r1.f1573y = r0
            androidx.appcompat.app.n$b r0 = new androidx.appcompat.app.n$b
            r0.<init>(r1)
            r1.f1574z = r0
            androidx.appcompat.app.n$c r0 = new androidx.appcompat.app.n$c
            r0.<init>(r1)
            r1.f1548A = r0
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            r1.m2493b(r2)
            return
    }

    /* renamed from: a */
    private androidx.appcompat.widget.AbstractC0569b0 m2497a(android.view.View r4) {
            r3 = this;
            boolean r0 = r4 instanceof androidx.appcompat.widget.AbstractC0569b0
            if (r0 == 0) goto L_0x0007
            androidx.appcompat.widget.b0 r4 = (androidx.appcompat.widget.AbstractC0569b0) r4
            return r4
        L_0x0007:
            boolean r0 = r4 instanceof androidx.appcompat.widget.Toolbar
            if (r0 == 0) goto L_0x0012
            androidx.appcompat.widget.Toolbar r4 = (androidx.appcompat.widget.Toolbar) r4
            androidx.appcompat.widget.b0 r4 = r4.getWrapper()
            return r4
        L_0x0012:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Can't make a decor toolbar out of "
            r1.append(r2)
            if (r4 == 0) goto L_0x0029
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            goto L_0x002b
        L_0x0029:
            java.lang.String r4 = "null"
        L_0x002b:
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* renamed from: a */
    static boolean m2495a(boolean r1, boolean r2, boolean r3) {
            r0 = 1
            if (r3 == 0) goto L_0x0004
            return r0
        L_0x0004:
            if (r1 != 0) goto L_0x000a
            if (r2 == 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            r1 = 0
            return r1
    }

    /* renamed from: b */
    private void m2493b(android.view.View r6) {
            r5 = this;
            int r0 = p000a.p001a.C0005f.decor_content_parent
            android.view.View r0 = r6.findViewById(r0)
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r5.f1551c = r0
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r5.f1551c
            if (r0 == 0) goto L_0x0011
            r0.setActionBarVisibilityCallback(r5)
        L_0x0011:
            int r0 = p000a.p001a.C0005f.action_bar
            android.view.View r0 = r6.findViewById(r0)
            androidx.appcompat.widget.b0 r0 = r5.m2497a(r0)
            r5.f1553e = r0
            int r0 = p000a.p001a.C0005f.action_context_bar
            android.view.View r0 = r6.findViewById(r0)
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r5.f1554f = r0
            int r0 = p000a.p001a.C0005f.action_bar_container
            android.view.View r6 = r6.findViewById(r0)
            androidx.appcompat.widget.ActionBarContainer r6 = (androidx.appcompat.widget.ActionBarContainer) r6
            r5.f1552d = r6
            androidx.appcompat.widget.b0 r6 = r5.f1553e
            if (r6 == 0) goto L_0x0098
            androidx.appcompat.widget.ActionBarContextView r0 = r5.f1554f
            if (r0 == 0) goto L_0x0098
            androidx.appcompat.widget.ActionBarContainer r0 = r5.f1552d
            if (r0 == 0) goto L_0x0098
            android.content.Context r6 = r6.mo1856n()
            r5.f1549a = r6
            androidx.appcompat.widget.b0 r6 = r5.f1553e
            int r6 = r6.mo1862h()
            r6 = r6 & 4
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L_0x0051
            r6 = 1
            goto L_0x0052
        L_0x0051:
            r6 = 0
        L_0x0052:
            if (r6 == 0) goto L_0x0056
            r5.f1557i = r0
        L_0x0056:
            android.content.Context r2 = r5.f1549a
            a.a.m.a r2 = p000a.p001a.p006m.C0028a.m4185a(r2)
            boolean r3 = r2.m4186a()
            if (r3 != 0) goto L_0x0067
            if (r6 == 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r6 = 0
            goto L_0x0068
        L_0x0067:
            r6 = 1
        L_0x0068:
            r5.m2481j(r6)
            boolean r6 = r2.m4180f()
            r5.m2480k(r6)
            android.content.Context r6 = r5.f1549a
            r2 = 0
            int[] r3 = p000a.p001a.C0009j.ActionBar
            int r4 = p000a.p001a.C0000a.actionBarStyle
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r2, r3, r4, r1)
            int r2 = p000a.p001a.C0009j.ActionBar_hideOnContentScroll
            boolean r2 = r6.getBoolean(r2, r1)
            if (r2 == 0) goto L_0x0088
            r5.m2482i(r0)
        L_0x0088:
            int r0 = p000a.p001a.C0009j.ActionBar_elevation
            int r0 = r6.getDimensionPixelSize(r0, r1)
            if (r0 == 0) goto L_0x0094
            float r0 = (float) r0
            r5.m2503a(r0)
        L_0x0094:
            r6.recycle()
            return
        L_0x0098:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<androidx.appcompat.app.n> r1 = androidx.appcompat.app.C0476n.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " can only be used "
            r0.append(r1)
            java.lang.String r1 = "with a compatible window decor layout"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
    }

    /* renamed from: k */
    private void m2480k(boolean r5) {
            r4 = this;
            r4.f1563o = r5
            boolean r5 = r4.f1563o
            r0 = 0
            if (r5 != 0) goto L_0x0014
            androidx.appcompat.widget.b0 r5 = r4.f1553e
            r5.mo1880a(r0)
            androidx.appcompat.widget.ActionBarContainer r5 = r4.f1552d
            androidx.appcompat.widget.m0 r0 = r4.f1556h
            r5.setTabContainer(r0)
            goto L_0x0020
        L_0x0014:
            androidx.appcompat.widget.ActionBarContainer r5 = r4.f1552d
            r5.setTabContainer(r0)
            androidx.appcompat.widget.b0 r5 = r4.f1553e
            androidx.appcompat.widget.m0 r0 = r4.f1556h
            r5.mo1880a(r0)
        L_0x0020:
            int r5 = r4.m2477m()
            r0 = 2
            r1 = 1
            r2 = 0
            if (r5 != r0) goto L_0x002b
            r5 = 1
            goto L_0x002c
        L_0x002b:
            r5 = 0
        L_0x002c:
            androidx.appcompat.widget.m0 r0 = r4.f1556h
            if (r0 == 0) goto L_0x0042
            if (r5 == 0) goto L_0x003d
            r0.setVisibility(r2)
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r4.f1551c
            if (r0 == 0) goto L_0x0042
            p000a.p018g.p029l.C0216r.m3449B(r0)
            goto L_0x0042
        L_0x003d:
            r3 = 8
            r0.setVisibility(r3)
        L_0x0042:
            androidx.appcompat.widget.b0 r0 = r4.f1553e
            boolean r3 = r4.f1563o
            if (r3 != 0) goto L_0x004c
            if (r5 == 0) goto L_0x004c
            r3 = 1
            goto L_0x004d
        L_0x004c:
            r3 = 0
        L_0x004d:
            r0.mo1873b(r3)
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r4.f1551c
            boolean r3 = r4.f1563o
            if (r3 != 0) goto L_0x0059
            if (r5 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r1 = 0
        L_0x005a:
            r0.setHasNonEmbeddedTabs(r1)
            return
    }

    /* renamed from: l */
    private void m2478l(boolean r4) {
            r3 = this;
            boolean r0 = r3.f1566r
            boolean r1 = r3.f1567s
            boolean r2 = r3.f1568t
            boolean r0 = m2495a(r0, r1, r2)
            if (r0 == 0) goto L_0x0017
            boolean r0 = r3.f1569u
            if (r0 != 0) goto L_0x0021
            r0 = 1
            r3.f1569u = r0
            r3.m2485g(r4)
            goto L_0x0021
        L_0x0017:
            boolean r0 = r3.f1569u
            if (r0 == 0) goto L_0x0021
            r0 = 0
            r3.f1569u = r0
            r3.m2487f(r4)
        L_0x0021:
            return
    }

    /* renamed from: n */
    private void m2476n() {
            r2 = this;
            boolean r0 = r2.f1568t
            if (r0 == 0) goto L_0x0011
            r0 = 0
            r2.f1568t = r0
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = r2.f1551c
            if (r1 == 0) goto L_0x000e
            r1.setShowingForActionMode(r0)
        L_0x000e:
            r2.m2478l(r0)
        L_0x0011:
            return
    }

    /* renamed from: o */
    private boolean m2475o() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r1.f1552d
            boolean r0 = p000a.p018g.p029l.C0216r.m3397x(r0)
            return r0
    }

    /* renamed from: p */
    private void m2474p() {
            r2 = this;
            boolean r0 = r2.f1568t
            if (r0 != 0) goto L_0x0012
            r0 = 1
            r2.f1568t = r0
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = r2.f1551c
            if (r1 == 0) goto L_0x000e
            r1.setShowingForActionMode(r0)
        L_0x000e:
            r0 = 0
            r2.m2478l(r0)
        L_0x0012:
            return
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: a */
    public p000a.p001a.p006m.AbstractC0029b mo2500a(p000a.p001a.p006m.AbstractC0029b.AbstractC0030a r3) {
            r2 = this;
            androidx.appcompat.app.n$d r0 = r2.f1558j
            if (r0 == 0) goto L_0x0007
            r0.mo2472a()
        L_0x0007:
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r2.f1551c
            r1 = 0
            r0.setHideOnContentScrollEnabled(r1)
            androidx.appcompat.widget.ActionBarContextView r0 = r2.f1554f
            r0.m2286c()
            androidx.appcompat.app.n$d r0 = new androidx.appcompat.app.n$d
            androidx.appcompat.widget.ActionBarContextView r1 = r2.f1554f
            android.content.Context r1 = r1.getContext()
            r0.<init>(r2, r1, r3)
            boolean r3 = r0.m2458k()
            if (r3 == 0) goto L_0x0039
            r2.f1558j = r0
            r0.mo2460i()
            androidx.appcompat.widget.ActionBarContextView r3 = r2.f1554f
            r3.m2288a(r0)
            r3 = 1
            r2.m2489e(r3)
            androidx.appcompat.widget.ActionBarContextView r3 = r2.f1554f
            r1 = 32
            r3.sendAccessibilityEvent(r1)
            return r0
        L_0x0039:
            r3 = 0
            return r3
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0529d
    /* renamed from: a */
    public void mo2272a() {
            r1 = this;
            a.a.m.h r0 = r1.f1570v
            if (r0 == 0) goto L_0x000a
            r0.m4157a()
            r0 = 0
            r1.f1570v = r0
        L_0x000a:
            return
    }

    /* renamed from: a */
    public void m2503a(float r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r1.f1552d
            p000a.p018g.p029l.C0216r.m3444a(r0, r2)
            return
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0529d
    /* renamed from: a */
    public void mo2271a(int r1) {
            r0 = this;
            r0.f1564p = r1
            return
    }

    /* renamed from: a */
    public void m2502a(int r3, int r4) {
            r2 = this;
            androidx.appcompat.widget.b0 r0 = r2.f1553e
            int r0 = r0.mo1862h()
            r1 = r4 & 4
            if (r1 == 0) goto L_0x000d
            r1 = 1
            r2.f1557i = r1
        L_0x000d:
            androidx.appcompat.widget.b0 r1 = r2.f1553e
            r3 = r3 & r4
            r4 = r4 ^ (-1)
            r4 = r4 & r0
            r3 = r3 | r4
            r1.mo1868d(r3)
            return
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: a */
    public void mo2499a(android.content.res.Configuration r1) {
            r0 = this;
            android.content.Context r1 = r0.f1549a
            a.a.m.a r1 = p000a.p001a.p006m.C0028a.m4185a(r1)
            boolean r1 = r1.m4180f()
            r0.m2480k(r1)
            return
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: a */
    public void mo2498a(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.widget.b0 r0 = r1.f1553e
            r0.mo1884a(r2)
            return
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: a */
    public void mo2496a(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.b0 r0 = r1.f1553e
            r0.setWindowTitle(r2)
            return
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0529d
    /* renamed from: a */
    public void mo2270a(boolean r1) {
            r0 = this;
            r0.f1565q = r1
            return
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: a */
    public boolean mo2501a(int r5, android.view.KeyEvent r6) {
            r4 = this;
            androidx.appcompat.app.n$d r0 = r4.f1558j
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.view.Menu r0 = r0.mo2464c()
            if (r0 == 0) goto L_0x0029
            if (r6 == 0) goto L_0x0013
            int r2 = r6.getDeviceId()
            goto L_0x0014
        L_0x0013:
            r2 = -1
        L_0x0014:
            android.view.KeyCharacterMap r2 = android.view.KeyCharacterMap.load(r2)
            int r2 = r2.getKeyboardType()
            r3 = 1
            if (r2 == r3) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            r0.setQwertyMode(r3)
            boolean r5 = r0.performShortcut(r5, r6, r1)
            return r5
        L_0x0029:
            return r1
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0529d
    /* renamed from: b */
    public void mo2269b() {
            r1 = this;
            boolean r0 = r1.f1567s
            if (r0 != 0) goto L_0x000a
            r0 = 1
            r1.f1567s = r0
            r1.m2478l(r0)
        L_0x000a:
            return
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: b */
    public void mo2494b(int r2) {
            r1 = this;
            androidx.appcompat.widget.b0 r0 = r1.f1553e
            r0.mo1871c(r2)
            return
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: b */
    public void mo2492b(boolean r4) {
            r3 = this;
            boolean r0 = r3.f1561m
            if (r4 != r0) goto L_0x0005
            return
        L_0x0005:
            r3.f1561m = r4
            java.util.ArrayList<androidx.appcompat.app.a$b> r0 = r3.f1562n
            int r0 = r0.size()
            r1 = 0
        L_0x000e:
            if (r1 >= r0) goto L_0x001e
            java.util.ArrayList<androidx.appcompat.app.a$b> r2 = r3.f1562n
            java.lang.Object r2 = r2.get(r1)
            androidx.appcompat.app.a$b r2 = (androidx.appcompat.app.AbstractC0428a.AbstractC0430b) r2
            r2.m2660a(r4)
            int r1 = r1 + 1
            goto L_0x000e
        L_0x001e:
            return
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0529d
    /* renamed from: c */
    public void mo2268c() {
            r1 = this;
            boolean r0 = r1.f1567s
            if (r0 == 0) goto L_0x000b
            r0 = 0
            r1.f1567s = r0
            r0 = 1
            r1.m2478l(r0)
        L_0x000b:
            return
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: c */
    public void mo2491c(boolean r2) {
            r1 = this;
            boolean r0 = r1.f1557i
            if (r0 != 0) goto L_0x0007
            r1.m2483h(r2)
        L_0x0007:
            return
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0529d
    /* renamed from: d */
    public void mo2267d() {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: d */
    public void mo2490d(boolean r1) {
            r0 = this;
            r0.f1571w = r1
            if (r1 != 0) goto L_0x000b
            a.a.m.h r1 = r0.f1570v
            if (r1 == 0) goto L_0x000b
            r1.m4157a()
        L_0x000b:
            return
    }

    /* renamed from: e */
    public void m2489e(boolean r9) {
            r8 = this;
            if (r9 == 0) goto L_0x0006
            r8.m2474p()
            goto L_0x0009
        L_0x0006:
            r8.m2476n()
        L_0x0009:
            boolean r0 = r8.m2475o()
            r1 = 4
            r2 = 8
            r3 = 0
            if (r0 == 0) goto L_0x003e
            r4 = 100
            r6 = 200(0xc8, double:9.9E-322)
            if (r9 == 0) goto L_0x0026
            androidx.appcompat.widget.b0 r9 = r8.f1553e
            a.g.l.v r9 = r9.mo1885a(r1, r4)
            androidx.appcompat.widget.ActionBarContextView r0 = r8.f1554f
            a.g.l.v r0 = r0.m2153a(r3, r6)
            goto L_0x0032
        L_0x0026:
            androidx.appcompat.widget.b0 r9 = r8.f1553e
            a.g.l.v r0 = r9.mo1885a(r3, r6)
            androidx.appcompat.widget.ActionBarContextView r9 = r8.f1554f
            a.g.l.v r9 = r9.m2153a(r2, r4)
        L_0x0032:
            a.a.m.h r1 = new a.a.m.h
            r1.<init>()
            r1.m4154a(r9, r0)
            r1.m4150c()
            goto L_0x0055
        L_0x003e:
            if (r9 == 0) goto L_0x004b
            androidx.appcompat.widget.b0 r9 = r8.f1553e
            r9.mo1886a(r1)
            androidx.appcompat.widget.ActionBarContextView r9 = r8.f1554f
            r9.setVisibility(r3)
            goto L_0x0055
        L_0x004b:
            androidx.appcompat.widget.b0 r9 = r8.f1553e
            r9.mo1886a(r3)
            androidx.appcompat.widget.ActionBarContextView r9 = r8.f1554f
            r9.setVisibility(r2)
        L_0x0055:
            return
    }

    /* renamed from: f */
    public void m2487f(boolean r5) {
            r4 = this;
            a.a.m.h r0 = r4.f1570v
            if (r0 == 0) goto L_0x0007
            r0.m4157a()
        L_0x0007:
            int r0 = r4.f1564p
            if (r0 != 0) goto L_0x0074
            boolean r0 = r4.f1571w
            if (r0 != 0) goto L_0x0011
            if (r5 == 0) goto L_0x0074
        L_0x0011:
            androidx.appcompat.widget.ActionBarContainer r0 = r4.f1552d
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContainer r0 = r4.f1552d
            r1 = 1
            r0.setTransitioning(r1)
            a.a.m.h r0 = new a.a.m.h
            r0.<init>()
            androidx.appcompat.widget.ActionBarContainer r2 = r4.f1552d
            int r2 = r2.getHeight()
            int r2 = -r2
            float r2 = (float) r2
            if (r5 == 0) goto L_0x003c
            r5 = 2
            int[] r5 = new int[r5]
            r5 = {x007c: FILL_ARRAY_DATA  , data: [0, 0} // fill-array
            androidx.appcompat.widget.ActionBarContainer r3 = r4.f1552d
            r3.getLocationInWindow(r5)
            r5 = r5[r1]
            float r5 = (float) r5
            float r2 = r2 - r5
        L_0x003c:
            androidx.appcompat.widget.ActionBarContainer r5 = r4.f1552d
            a.g.l.v r5 = p000a.p018g.p029l.C0216r.m3445a(r5)
            r5.m3365b(r2)
            a.g.l.y r1 = r4.f1548A
            r5.m3369a(r1)
            r0.m4155a(r5)
            boolean r5 = r4.f1565q
            if (r5 == 0) goto L_0x005f
            android.view.View r5 = r4.f1555g
            if (r5 == 0) goto L_0x005f
            a.g.l.v r5 = p000a.p018g.p029l.C0216r.m3445a(r5)
            r5.m3365b(r2)
            r0.m4155a(r5)
        L_0x005f:
            android.view.animation.Interpolator r5 = androidx.appcompat.app.C0476n.f1546B
            r0.m4152a(r5)
            r1 = 250(0xfa, double:1.235E-321)
            r0.m4156a(r1)
            a.g.l.w r5 = r4.f1573y
            r0.m4153a(r5)
            r4.f1570v = r0
            r0.m4150c()
            goto L_0x007a
        L_0x0074:
            a.g.l.w r5 = r4.f1573y
            r0 = 0
            r5.mo1850a(r0)
        L_0x007a:
            return
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: f */
    public boolean mo2488f() {
            r1 = this;
            androidx.appcompat.widget.b0 r0 = r1.f1553e
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.mo1859k()
            if (r0 == 0) goto L_0x0011
            androidx.appcompat.widget.b0 r0 = r1.f1553e
            r0.collapseActionView()
            r0 = 1
            return r0
        L_0x0011:
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: g */
    public int mo2486g() {
            r1 = this;
            androidx.appcompat.widget.b0 r0 = r1.f1553e
            int r0 = r0.mo1862h()
            return r0
    }

    /* renamed from: g */
    public void m2485g(boolean r5) {
            r4 = this;
            a.a.m.h r0 = r4.f1570v
            if (r0 == 0) goto L_0x0007
            r0.m4157a()
        L_0x0007:
            androidx.appcompat.widget.ActionBarContainer r0 = r4.f1552d
            r1 = 0
            r0.setVisibility(r1)
            int r0 = r4.f1564p
            r1 = 0
            if (r0 != 0) goto L_0x007e
            boolean r0 = r4.f1571w
            if (r0 != 0) goto L_0x0018
            if (r5 == 0) goto L_0x007e
        L_0x0018:
            androidx.appcompat.widget.ActionBarContainer r0 = r4.f1552d
            r0.setTranslationY(r1)
            androidx.appcompat.widget.ActionBarContainer r0 = r4.f1552d
            int r0 = r0.getHeight()
            int r0 = -r0
            float r0 = (float) r0
            if (r5 == 0) goto L_0x0037
            r5 = 2
            int[] r5 = new int[r5]
            r5 = {x00a4: FILL_ARRAY_DATA  , data: [0, 0} // fill-array
            androidx.appcompat.widget.ActionBarContainer r2 = r4.f1552d
            r2.getLocationInWindow(r5)
            r2 = 1
            r5 = r5[r2]
            float r5 = (float) r5
            float r0 = r0 - r5
        L_0x0037:
            androidx.appcompat.widget.ActionBarContainer r5 = r4.f1552d
            r5.setTranslationY(r0)
            a.a.m.h r5 = new a.a.m.h
            r5.<init>()
            androidx.appcompat.widget.ActionBarContainer r2 = r4.f1552d
            a.g.l.v r2 = p000a.p018g.p029l.C0216r.m3445a(r2)
            r2.m3365b(r1)
            a.g.l.y r3 = r4.f1548A
            r2.m3369a(r3)
            r5.m4155a(r2)
            boolean r2 = r4.f1565q
            if (r2 == 0) goto L_0x0069
            android.view.View r2 = r4.f1555g
            if (r2 == 0) goto L_0x0069
            r2.setTranslationY(r0)
            android.view.View r0 = r4.f1555g
            a.g.l.v r0 = p000a.p018g.p029l.C0216r.m3445a(r0)
            r0.m3365b(r1)
            r5.m4155a(r0)
        L_0x0069:
            android.view.animation.Interpolator r0 = androidx.appcompat.app.C0476n.f1547C
            r5.m4152a(r0)
            r0 = 250(0xfa, double:1.235E-321)
            r5.m4156a(r0)
            a.g.l.w r0 = r4.f1574z
            r5.m4153a(r0)
            r4.f1570v = r5
            r5.m4150c()
            goto L_0x009b
        L_0x007e:
            androidx.appcompat.widget.ActionBarContainer r5 = r4.f1552d
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContainer r5 = r4.f1552d
            r5.setTranslationY(r1)
            boolean r5 = r4.f1565q
            if (r5 == 0) goto L_0x0095
            android.view.View r5 = r4.f1555g
            if (r5 == 0) goto L_0x0095
            r5.setTranslationY(r1)
        L_0x0095:
            a.g.l.w r5 = r4.f1574z
            r0 = 0
            r5.mo1850a(r0)
        L_0x009b:
            androidx.appcompat.widget.ActionBarOverlayLayout r5 = r4.f1551c
            if (r5 == 0) goto L_0x00a2
            p000a.p018g.p029l.C0216r.m3449B(r5)
        L_0x00a2:
            return
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: h */
    public android.content.Context mo2484h() {
            r4 = this;
            android.content.Context r0 = r4.f1550b
            if (r0 != 0) goto L_0x0027
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r4.f1549a
            android.content.res.Resources$Theme r1 = r1.getTheme()
            int r2 = p000a.p001a.C0000a.actionBarWidgetTheme
            r3 = 1
            r1.resolveAttribute(r2, r0, r3)
            int r0 = r0.resourceId
            if (r0 == 0) goto L_0x0023
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            android.content.Context r2 = r4.f1549a
            r1.<init>(r2, r0)
            r4.f1550b = r1
            goto L_0x0027
        L_0x0023:
            android.content.Context r0 = r4.f1549a
            r4.f1550b = r0
        L_0x0027:
            android.content.Context r0 = r4.f1550b
            return r0
    }

    /* renamed from: h */
    public void m2483h(boolean r2) {
            r1 = this;
            r0 = 4
            if (r2 == 0) goto L_0x0005
            r2 = 4
            goto L_0x0006
        L_0x0005:
            r2 = 0
        L_0x0006:
            r1.m2502a(r2, r0)
            return
    }

    /* renamed from: i */
    public void m2482i(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L_0x0013
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r1.f1551c
            boolean r0 = r0.m2278i()
            if (r0 == 0) goto L_0x000b
            goto L_0x0013
        L_0x000b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll"
            r2.<init>(r0)
            throw r2
        L_0x0013:
            r1.f1572x = r2
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r1.f1551c
            r0.setHideOnContentScrollEnabled(r2)
            return
    }

    /* renamed from: j */
    public void m2481j(boolean r2) {
            r1 = this;
            androidx.appcompat.widget.b0 r0 = r1.f1553e
            r0.mo1878a(r2)
            return
    }

    /* renamed from: l */
    void m2479l() {
            r2 = this;
            a.a.m.b$a r0 = r2.f1560l
            if (r0 == 0) goto L_0x000e
            a.a.m.b r1 = r2.f1559k
            r0.mo2545a(r1)
            r0 = 0
            r2.f1559k = r0
            r2.f1560l = r0
        L_0x000e:
            return
    }

    /* renamed from: m */
    public int m2477m() {
            r1 = this;
            androidx.appcompat.widget.b0 r0 = r1.f1553e
            int r0 = r0.mo1855o()
            return r0
    }
}
