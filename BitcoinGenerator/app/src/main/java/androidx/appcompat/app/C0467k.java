package androidx.appcompat.app;

/* renamed from: androidx.appcompat.app.k */
/* loaded from: classes.dex */
class C0467k extends androidx.appcompat.app.AbstractC0428a {

    /* renamed from: a */
    androidx.appcompat.widget.AbstractC0569b0 f1518a;

    /* renamed from: b */
    boolean f1519b;

    /* renamed from: c */
    android.view.Window.Callback f1520c;

    /* renamed from: d */
    private boolean f1521d;

    /* renamed from: e */
    private boolean f1522e;

    /* renamed from: f */
    private java.util.ArrayList<androidx.appcompat.app.AbstractC0428a.AbstractC0430b> f1523f;

    /* renamed from: g */
    private final java.lang.Runnable f1524g;

    /* renamed from: h */
    private final androidx.appcompat.widget.Toolbar.AbstractC0560f f1525h;

    /* renamed from: androidx.appcompat.app.k$a */
    /* loaded from: classes.dex */
    class RunnableC0468a implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.app.C0467k f1526b;

        RunnableC0468a(androidx.appcompat.app.C0467k r1) {
                r0 = this;
                r0.f1526b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                androidx.appcompat.app.k r0 = r1.f1526b
                r0.m2513m()
                return
        }
    }

    /* renamed from: androidx.appcompat.app.k$b */
    /* loaded from: classes.dex */
    class C0469b implements androidx.appcompat.widget.Toolbar.AbstractC0560f {

        /* renamed from: a */
        final /* synthetic */ androidx.appcompat.app.C0467k f1527a;

        C0469b(androidx.appcompat.app.C0467k r1) {
                r0 = this;
                r0.f1527a = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.Toolbar.AbstractC0560f
        public boolean onMenuItemClick(android.view.MenuItem r3) {
                r2 = this;
                androidx.appcompat.app.k r0 = r2.f1527a
                android.view.Window$Callback r0 = r0.f1520c
                r1 = 0
                boolean r3 = r0.onMenuItemSelected(r1, r3)
                return r3
        }
    }

    /* renamed from: androidx.appcompat.app.k$c */
    /* loaded from: classes.dex */
    private final class C0470c implements androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a {

        /* renamed from: b */
        private boolean f1528b;

        /* renamed from: c */
        final /* synthetic */ androidx.appcompat.app.C0467k f1529c;

        C0470c(androidx.appcompat.app.C0467k r1) {
                r0 = this;
                r0.f1529c = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a
        /* renamed from: a */
        public void mo2108a(androidx.appcompat.view.menu.C0496h r2, boolean r3) {
                r1 = this;
                boolean r3 = r1.f1528b
                if (r3 == 0) goto L_0x0005
                return
            L_0x0005:
                r3 = 1
                r1.f1528b = r3
                androidx.appcompat.app.k r3 = r1.f1529c
                androidx.appcompat.widget.b0 r3 = r3.f1518a
                r3.mo1863g()
                androidx.appcompat.app.k r3 = r1.f1529c
                android.view.Window$Callback r3 = r3.f1520c
                if (r3 == 0) goto L_0x001a
                r0 = 108(0x6c, float:1.51E-43)
                r3.onPanelClosed(r0, r2)
            L_0x001a:
                r2 = 0
                r1.f1528b = r2
                return
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a
        /* renamed from: a */
        public boolean mo2109a(androidx.appcompat.view.menu.C0496h r3) {
                r2 = this;
                androidx.appcompat.app.k r0 = r2.f1529c
                android.view.Window$Callback r0 = r0.f1520c
                if (r0 == 0) goto L_0x000d
                r1 = 108(0x6c, float:1.51E-43)
                r0.onMenuOpened(r1, r3)
                r3 = 1
                return r3
            L_0x000d:
                r3 = 0
                return r3
        }
    }

    /* renamed from: androidx.appcompat.app.k$d */
    /* loaded from: classes.dex */
    private final class C0471d implements androidx.appcompat.view.menu.C0496h.AbstractC0497a {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.app.C0467k f1530b;

        C0471d(androidx.appcompat.app.C0467k r1) {
                r0 = this;
                r0.f1530b = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.C0496h.AbstractC0497a
        /* renamed from: a */
        public void mo65a(androidx.appcompat.view.menu.C0496h r5) {
                r4 = this;
                androidx.appcompat.app.k r0 = r4.f1530b
                android.view.Window$Callback r1 = r0.f1520c
                if (r1 == 0) goto L_0x002b
                androidx.appcompat.widget.b0 r0 = r0.f1518a
                boolean r0 = r0.mo1869d()
                r1 = 108(0x6c, float:1.51E-43)
                if (r0 == 0) goto L_0x0018
                androidx.appcompat.app.k r0 = r4.f1530b
                android.view.Window$Callback r0 = r0.f1520c
                r0.onPanelClosed(r1, r5)
                goto L_0x002b
            L_0x0018:
                androidx.appcompat.app.k r0 = r4.f1530b
                android.view.Window$Callback r0 = r0.f1520c
                r2 = 0
                r3 = 0
                boolean r0 = r0.onPreparePanel(r2, r3, r5)
                if (r0 == 0) goto L_0x002b
                androidx.appcompat.app.k r0 = r4.f1530b
                android.view.Window$Callback r0 = r0.f1520c
                r0.onMenuOpened(r1, r5)
            L_0x002b:
                return
        }

        @Override // androidx.appcompat.view.menu.C0496h.AbstractC0497a
        /* renamed from: a */
        public boolean mo64a(androidx.appcompat.view.menu.C0496h r1, android.view.MenuItem r2) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* renamed from: androidx.appcompat.app.k$e */
    /* loaded from: classes.dex */
    private class C0472e extends p000a.p001a.p006m.Window$CallbackC0041i {

        /* renamed from: c */
        final /* synthetic */ androidx.appcompat.app.C0467k f1531c;

        public C0472e(androidx.appcompat.app.C0467k r1, android.view.Window.Callback r2) {
                r0 = this;
                r0.f1531c = r1
                r0.<init>(r2)
                return
        }

        @Override // p000a.p001a.p006m.Window$CallbackC0041i, android.view.Window.Callback
        public android.view.View onCreatePanelView(int r2) {
                r1 = this;
                if (r2 != 0) goto L_0x0010
                android.view.View r2 = new android.view.View
                androidx.appcompat.app.k r0 = r1.f1531c
                androidx.appcompat.widget.b0 r0 = r0.f1518a
                android.content.Context r0 = r0.mo1856n()
                r2.<init>(r0)
                return r2
            L_0x0010:
                android.view.View r2 = super.onCreatePanelView(r2)
                return r2
        }

        @Override // p000a.p001a.p006m.Window$CallbackC0041i, android.view.Window.Callback
        public boolean onPreparePanel(int r1, android.view.View r2, android.view.Menu r3) {
                r0 = this;
                boolean r1 = super.onPreparePanel(r1, r2, r3)
                if (r1 == 0) goto L_0x0016
                androidx.appcompat.app.k r2 = r0.f1531c
                boolean r3 = r2.f1519b
                if (r3 != 0) goto L_0x0016
                androidx.appcompat.widget.b0 r2 = r2.f1518a
                r2.mo1872c()
                androidx.appcompat.app.k r2 = r0.f1531c
                r3 = 1
                r2.f1519b = r3
            L_0x0016:
                return r1
        }
    }

    C0467k(androidx.appcompat.widget.Toolbar r3, java.lang.CharSequence r4, android.view.Window.Callback r5) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f1523f = r0
            androidx.appcompat.app.k$a r0 = new androidx.appcompat.app.k$a
            r0.<init>(r2)
            r2.f1524g = r0
            androidx.appcompat.app.k$b r0 = new androidx.appcompat.app.k$b
            r0.<init>(r2)
            r2.f1525h = r0
            androidx.appcompat.widget.u0 r0 = new androidx.appcompat.widget.u0
            r1 = 0
            r0.<init>(r3, r1)
            r2.f1518a = r0
            androidx.appcompat.app.k$e r0 = new androidx.appcompat.app.k$e
            r0.<init>(r2, r5)
            r2.f1520c = r0
            androidx.appcompat.widget.b0 r5 = r2.f1518a
            android.view.Window$Callback r0 = r2.f1520c
            r5.setWindowCallback(r0)
            androidx.appcompat.widget.Toolbar$f r5 = r2.f1525h
            r3.setOnMenuItemClickListener(r5)
            androidx.appcompat.widget.b0 r3 = r2.f1518a
            r3.setWindowTitle(r4)
            return
    }

    /* renamed from: n */
    private android.view.Menu m2512n() {
            r3 = this;
            boolean r0 = r3.f1521d
            if (r0 != 0) goto L_0x0016
            androidx.appcompat.widget.b0 r0 = r3.f1518a
            androidx.appcompat.app.k$c r1 = new androidx.appcompat.app.k$c
            r1.<init>(r3)
            androidx.appcompat.app.k$d r2 = new androidx.appcompat.app.k$d
            r2.<init>(r3)
            r0.mo1881a(r1, r2)
            r0 = 1
            r3.f1521d = r0
        L_0x0016:
            androidx.appcompat.widget.b0 r0 = r3.f1518a
            android.view.Menu r0 = r0.mo1860j()
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: a */
    public void mo2499a(android.content.res.Configuration r1) {
            r0 = this;
            super.mo2499a(r1)
            return
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: a */
    public void mo2498a(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.widget.b0 r0 = r1.f1518a
            r0.mo1884a(r2)
            return
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: a */
    public void mo2496a(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.b0 r0 = r1.f1518a
            r0.setWindowTitle(r2)
            return
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: a */
    public boolean mo2501a(int r5, android.view.KeyEvent r6) {
            r4 = this;
            android.view.Menu r0 = r4.m2512n()
            r1 = 0
            if (r0 == 0) goto L_0x0024
            if (r6 == 0) goto L_0x000e
            int r2 = r6.getDeviceId()
            goto L_0x000f
        L_0x000e:
            r2 = -1
        L_0x000f:
            android.view.KeyCharacterMap r2 = android.view.KeyCharacterMap.load(r2)
            int r2 = r2.getKeyboardType()
            r3 = 1
            if (r2 == r3) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            r0.setQwertyMode(r3)
            boolean r5 = r0.performShortcut(r5, r6, r1)
            return r5
        L_0x0024:
            return r1
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: a */
    public boolean mo2519a(android.view.KeyEvent r2) {
            r1 = this;
            int r2 = r2.getAction()
            r0 = 1
            if (r2 != r0) goto L_0x000a
            r1.mo2515k()
        L_0x000a:
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: b */
    public void mo2494b(int r2) {
            r1 = this;
            androidx.appcompat.widget.b0 r0 = r1.f1518a
            r0.mo1871c(r2)
            return
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: b */
    public void mo2492b(boolean r4) {
            r3 = this;
            boolean r0 = r3.f1522e
            if (r4 != r0) goto L_0x0005
            return
        L_0x0005:
            r3.f1522e = r4
            java.util.ArrayList<androidx.appcompat.app.a$b> r0 = r3.f1523f
            int r0 = r0.size()
            r1 = 0
        L_0x000e:
            if (r1 >= r0) goto L_0x001e
            java.util.ArrayList<androidx.appcompat.app.a$b> r2 = r3.f1523f
            java.lang.Object r2 = r2.get(r1)
            androidx.appcompat.app.a$b r2 = (androidx.appcompat.app.AbstractC0428a.AbstractC0430b) r2
            r2.m2660a(r4)
            int r1 = r1 + 1
            goto L_0x000e
        L_0x001e:
            return
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: c */
    public void mo2491c(boolean r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: d */
    public void mo2490d(boolean r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: e */
    public boolean mo2518e() {
            r1 = this;
            androidx.appcompat.widget.b0 r0 = r1.f1518a
            boolean r0 = r0.mo1864f()
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: f */
    public boolean mo2488f() {
            r1 = this;
            androidx.appcompat.widget.b0 r0 = r1.f1518a
            boolean r0 = r0.mo1859k()
            if (r0 == 0) goto L_0x000f
            androidx.appcompat.widget.b0 r0 = r1.f1518a
            r0.collapseActionView()
            r0 = 1
            return r0
        L_0x000f:
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: g */
    public int mo2486g() {
            r1 = this;
            androidx.appcompat.widget.b0 r0 = r1.f1518a
            int r0 = r0.mo1862h()
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: h */
    public android.content.Context mo2484h() {
            r1 = this;
            androidx.appcompat.widget.b0 r0 = r1.f1518a
            android.content.Context r0 = r0.mo1856n()
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: i */
    public boolean mo2517i() {
            r2 = this;
            androidx.appcompat.widget.b0 r0 = r2.f1518a
            android.view.ViewGroup r0 = r0.mo1858l()
            java.lang.Runnable r1 = r2.f1524g
            r0.removeCallbacks(r1)
            androidx.appcompat.widget.b0 r0 = r2.f1518a
            android.view.ViewGroup r0 = r0.mo1858l()
            java.lang.Runnable r1 = r2.f1524g
            p000a.p018g.p029l.C0216r.m3432a(r0, r1)
            r0 = 1
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: j */
    void mo2516j() {
            r2 = this;
            androidx.appcompat.widget.b0 r0 = r2.f1518a
            android.view.ViewGroup r0 = r0.mo1858l()
            java.lang.Runnable r1 = r2.f1524g
            r0.removeCallbacks(r1)
            return
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: k */
    public boolean mo2515k() {
            r1 = this;
            androidx.appcompat.widget.b0 r0 = r1.f1518a
            boolean r0 = r0.mo1887a()
            return r0
    }

    /* renamed from: l */
    public android.view.Window.Callback m2514l() {
            r1 = this;
            android.view.Window$Callback r0 = r1.f1520c
            return r0
    }

    /* renamed from: m */
    void m2513m() {
            r5 = this;
            android.view.Menu r0 = r5.m2512n()
            boolean r1 = r0 instanceof androidx.appcompat.view.menu.C0496h
            r2 = 0
            if (r1 == 0) goto L_0x000d
            r1 = r0
            androidx.appcompat.view.menu.h r1 = (androidx.appcompat.view.menu.C0496h) r1
            goto L_0x000e
        L_0x000d:
            r1 = r2
        L_0x000e:
            if (r1 == 0) goto L_0x0013
            r1.m2373s()
        L_0x0013:
            r0.clear()     // Catch: all -> 0x0030
            android.view.Window$Callback r3 = r5.f1520c     // Catch: all -> 0x0030
            r4 = 0
            boolean r3 = r3.onCreatePanelMenu(r4, r0)     // Catch: all -> 0x0030
            if (r3 == 0) goto L_0x0027
            android.view.Window$Callback r3 = r5.f1520c     // Catch: all -> 0x0030
            boolean r2 = r3.onPreparePanel(r4, r2, r0)     // Catch: all -> 0x0030
            if (r2 != 0) goto L_0x002a
        L_0x0027:
            r0.clear()     // Catch: all -> 0x0030
        L_0x002a:
            if (r1 == 0) goto L_0x002f
            r1.m2374r()
        L_0x002f:
            return
        L_0x0030:
            r0 = move-exception
            if (r1 == 0) goto L_0x0036
            r1.m2374r()
        L_0x0036:
            throw r0
    }
}
