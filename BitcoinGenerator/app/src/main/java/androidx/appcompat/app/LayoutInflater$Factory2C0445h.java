package androidx.appcompat.app;

/* renamed from: androidx.appcompat.app.h */
/* loaded from: classes.dex */
class LayoutInflater$Factory2C0445h extends androidx.appcompat.app.AbstractC0444g implements androidx.appcompat.view.menu.C0496h.AbstractC0497a, android.view.LayoutInflater.Factory2 {

    /* renamed from: T */
    private static final boolean f1420T = false;

    /* renamed from: U */
    private static final int[] f1421U = null;

    /* renamed from: V */
    private static boolean f1422V;

    /* renamed from: A */
    boolean f1423A;

    /* renamed from: B */
    boolean f1424B;

    /* renamed from: C */
    boolean f1425C;

    /* renamed from: D */
    boolean f1426D;

    /* renamed from: E */
    private boolean f1427E;

    /* renamed from: F */
    private androidx.appcompat.app.LayoutInflater$Factory2C0445h.C0462n[] f1428F;

    /* renamed from: G */
    private androidx.appcompat.app.LayoutInflater$Factory2C0445h.C0462n f1429G;

    /* renamed from: H */
    private boolean f1430H;

    /* renamed from: I */
    boolean f1431I;

    /* renamed from: J */
    private int f1432J;

    /* renamed from: K */
    private boolean f1433K;

    /* renamed from: L */
    private androidx.appcompat.app.LayoutInflater$Factory2C0445h.C0459l f1434L;

    /* renamed from: M */
    boolean f1435M;

    /* renamed from: N */
    int f1436N;

    /* renamed from: O */
    private final java.lang.Runnable f1437O;

    /* renamed from: P */
    private boolean f1438P;

    /* renamed from: Q */
    private android.graphics.Rect f1439Q;

    /* renamed from: R */
    private android.graphics.Rect f1440R;

    /* renamed from: S */
    private androidx.appcompat.app.AppCompatViewInflater f1441S;

    /* renamed from: c */
    final android.content.Context f1442c;

    /* renamed from: d */
    final android.view.Window f1443d;

    /* renamed from: e */
    final android.view.Window.Callback f1444e;

    /* renamed from: f */
    final android.view.Window.Callback f1445f;

    /* renamed from: g */
    final androidx.appcompat.app.AbstractC0443f f1446g;

    /* renamed from: h */
    androidx.appcompat.app.AbstractC0428a f1447h;

    /* renamed from: i */
    android.view.MenuInflater f1448i;

    /* renamed from: j */
    private java.lang.CharSequence f1449j;

    /* renamed from: k */
    private androidx.appcompat.widget.AbstractC0566a0 f1450k;

    /* renamed from: l */
    private androidx.appcompat.app.LayoutInflater$Factory2C0445h.C0455i f1451l;

    /* renamed from: m */
    private androidx.appcompat.app.LayoutInflater$Factory2C0445h.C0463o f1452m;

    /* renamed from: n */
    p000a.p001a.p006m.AbstractC0029b f1453n;

    /* renamed from: o */
    androidx.appcompat.widget.ActionBarContextView f1454o;

    /* renamed from: p */
    android.widget.PopupWindow f1455p;

    /* renamed from: q */
    java.lang.Runnable f1456q;

    /* renamed from: r */
    p000a.p018g.p029l.C0223v f1457r;

    /* renamed from: s */
    private boolean f1458s;

    /* renamed from: t */
    private boolean f1459t;

    /* renamed from: u */
    private android.view.ViewGroup f1460u;

    /* renamed from: v */
    private android.widget.TextView f1461v;

    /* renamed from: w */
    private android.view.View f1462w;

    /* renamed from: x */
    private boolean f1463x;

    /* renamed from: y */
    private boolean f1464y;

    /* renamed from: z */
    boolean f1465z;

    /* renamed from: androidx.appcompat.app.h$a */
    /* loaded from: classes.dex */
    static class C0446a implements java.lang.Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ java.lang.Thread.UncaughtExceptionHandler f1466a;

        C0446a(java.lang.Thread.UncaughtExceptionHandler r1) {
                r0 = this;
                r0.f1466a = r1
                r0.<init>()
                return
        }

        /* renamed from: a */
        private boolean m2551a(java.lang.Throwable r3) {
                r2 = this;
                boolean r0 = r3 instanceof android.content.res.Resources.NotFoundException
                r1 = 0
                if (r0 == 0) goto L_0x001c
                java.lang.String r3 = r3.getMessage()
                if (r3 == 0) goto L_0x001c
                java.lang.String r0 = "drawable"
                boolean r0 = r3.contains(r0)
                if (r0 != 0) goto L_0x001b
                java.lang.String r0 = "Drawable"
                boolean r3 = r3.contains(r0)
                if (r3 == 0) goto L_0x001c
            L_0x001b:
                r1 = 1
            L_0x001c:
                return r1
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(java.lang.Thread r4, java.lang.Throwable r5) {
                r3 = this;
                boolean r0 = r3.m2551a(r5)
                if (r0 == 0) goto L_0x0034
                android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r5.getMessage()
                r1.append(r2)
                java.lang.String r2 = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info."
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                java.lang.Throwable r1 = r5.getCause()
                r0.initCause(r1)
                java.lang.StackTraceElement[] r5 = r5.getStackTrace()
                r0.setStackTrace(r5)
                java.lang.Thread$UncaughtExceptionHandler r5 = r3.f1466a
                r5.uncaughtException(r4, r0)
                goto L_0x0039
            L_0x0034:
                java.lang.Thread$UncaughtExceptionHandler r0 = r3.f1466a
                r0.uncaughtException(r4, r5)
            L_0x0039:
                return
        }
    }

    /* renamed from: androidx.appcompat.app.h$b */
    /* loaded from: classes.dex */
    class RunnableC0447b implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.app.LayoutInflater$Factory2C0445h f1467b;

        RunnableC0447b(androidx.appcompat.app.LayoutInflater$Factory2C0445h r1) {
                r0 = this;
                r0.f1467b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.appcompat.app.h r0 = r3.f1467b
                int r1 = r0.f1436N
                r1 = r1 & 1
                r2 = 0
                if (r1 == 0) goto L_0x000c
                r0.m2580e(r2)
            L_0x000c:
                androidx.appcompat.app.h r0 = r3.f1467b
                int r1 = r0.f1436N
                r1 = r1 & 4096(0x1000, float:5.74E-42)
                if (r1 == 0) goto L_0x0019
                r1 = 108(0x6c, float:1.51E-43)
                r0.m2580e(r1)
            L_0x0019:
                androidx.appcompat.app.h r0 = r3.f1467b
                r0.f1435M = r2
                r0.f1436N = r2
                return
        }
    }

    /* renamed from: androidx.appcompat.app.h$c */
    /* loaded from: classes.dex */
    class C0448c implements p000a.p018g.p029l.AbstractC0213o {

        /* renamed from: a */
        final /* synthetic */ androidx.appcompat.app.LayoutInflater$Factory2C0445h f1468a;

        C0448c(androidx.appcompat.app.LayoutInflater$Factory2C0445h r1) {
                r0 = this;
                r0.f1468a = r1
                r0.<init>()
                return
        }

        @Override // p000a.p018g.p029l.AbstractC0213o
        /* renamed from: a */
        public p000a.p018g.p029l.C0230z mo86a(android.view.View r5, p000a.p018g.p029l.C0230z r6) {
                r4 = this;
                int r0 = r6.m3355e()
                androidx.appcompat.app.h r1 = r4.f1468a
                int r1 = r1.m2571i(r0)
                if (r0 == r1) goto L_0x001c
                int r0 = r6.m3357c()
                int r2 = r6.m3356d()
                int r3 = r6.m3358b()
                a.g.l.z r6 = r6.m3361a(r0, r1, r2, r3)
            L_0x001c:
                a.g.l.z r5 = p000a.p018g.p029l.C0216r.m3426b(r5, r6)
                return r5
        }
    }

    /* renamed from: androidx.appcompat.app.h$d */
    /* loaded from: classes.dex */
    class C0449d implements androidx.appcompat.widget.AbstractC0586e0.AbstractC0587a {

        /* renamed from: a */
        final /* synthetic */ androidx.appcompat.app.LayoutInflater$Factory2C0445h f1469a;

        C0449d(androidx.appcompat.app.LayoutInflater$Factory2C0445h r1) {
                r0 = this;
                r0.f1469a = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.AbstractC0586e0.AbstractC0587a
        /* renamed from: a */
        public void mo2078a(android.graphics.Rect r3) {
                r2 = this;
                androidx.appcompat.app.h r0 = r2.f1469a
                int r1 = r3.top
                int r0 = r0.m2571i(r1)
                r3.top = r0
                return
        }
    }

    /* renamed from: androidx.appcompat.app.h$e */
    /* loaded from: classes.dex */
    class C0450e implements androidx.appcompat.widget.ContentFrameLayout.AbstractC0536a {

        /* renamed from: a */
        final /* synthetic */ androidx.appcompat.app.LayoutInflater$Factory2C0445h f1470a;

        C0450e(androidx.appcompat.app.LayoutInflater$Factory2C0445h r1) {
                r0 = this;
                r0.f1470a = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.AbstractC0536a
        /* renamed from: a */
        public void mo2245a() {
                r0 = this;
                return
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.AbstractC0536a
        public void onDetachedFromWindow() {
                r1 = this;
                androidx.appcompat.app.h r0 = r1.f1470a
                r0.m2567l()
                return
        }
    }

    /* renamed from: androidx.appcompat.app.h$f */
    /* loaded from: classes.dex */
    class RunnableC0451f implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.app.LayoutInflater$Factory2C0445h f1471b;

        /* renamed from: androidx.appcompat.app.h$f$a */
        /* loaded from: classes.dex */
        class C0452a extends p000a.p018g.p029l.C0228x {

            /* renamed from: a */
            final /* synthetic */ androidx.appcompat.app.LayoutInflater$Factory2C0445h.RunnableC0451f f1472a;

            C0452a(androidx.appcompat.app.LayoutInflater$Factory2C0445h.RunnableC0451f r1) {
                    r0 = this;
                    r0.f1472a = r1
                    r0.<init>()
                    return
            }

            @Override // p000a.p018g.p029l.AbstractC0227w
            /* renamed from: a */
            public void mo1850a(android.view.View r2) {
                    r1 = this;
                    androidx.appcompat.app.h$f r2 = r1.f1472a
                    androidx.appcompat.app.h r2 = r2.f1471b
                    androidx.appcompat.widget.ActionBarContextView r2 = r2.f1454o
                    r0 = 1065353216(0x3f800000, float:1.0)
                    r2.setAlpha(r0)
                    androidx.appcompat.app.h$f r2 = r1.f1472a
                    androidx.appcompat.app.h r2 = r2.f1471b
                    a.g.l.v r2 = r2.f1457r
                    r0 = 0
                    r2.m3370a(r0)
                    androidx.appcompat.app.h$f r2 = r1.f1472a
                    androidx.appcompat.app.h r2 = r2.f1471b
                    r2.f1457r = r0
                    return
            }

            @Override // p000a.p018g.p029l.C0228x, p000a.p018g.p029l.AbstractC0227w
            /* renamed from: b */
            public void mo1849b(android.view.View r2) {
                    r1 = this;
                    androidx.appcompat.app.h$f r2 = r1.f1472a
                    androidx.appcompat.app.h r2 = r2.f1471b
                    androidx.appcompat.widget.ActionBarContextView r2 = r2.f1454o
                    r0 = 0
                    r2.setVisibility(r0)
                    return
            }
        }

        RunnableC0451f(androidx.appcompat.app.LayoutInflater$Factory2C0445h r1) {
                r0 = this;
                r0.f1471b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                androidx.appcompat.app.h r0 = r4.f1471b
                android.widget.PopupWindow r1 = r0.f1455p
                androidx.appcompat.widget.ActionBarContextView r0 = r0.f1454o
                r2 = 0
                r3 = 55
                r1.showAtLocation(r0, r3, r2, r2)
                androidx.appcompat.app.h r0 = r4.f1471b
                r0.m2565m()
                androidx.appcompat.app.h r0 = r4.f1471b
                boolean r0 = r0.m2558t()
                r1 = 1065353216(0x3f800000, float:1.0)
                if (r0 == 0) goto L_0x003d
                androidx.appcompat.app.h r0 = r4.f1471b
                androidx.appcompat.widget.ActionBarContextView r0 = r0.f1454o
                r2 = 0
                r0.setAlpha(r2)
                androidx.appcompat.app.h r0 = r4.f1471b
                androidx.appcompat.widget.ActionBarContextView r2 = r0.f1454o
                a.g.l.v r2 = p000a.p018g.p029l.C0216r.m3445a(r2)
                r2.m3372a(r1)
                r0.f1457r = r2
                androidx.appcompat.app.h r0 = r4.f1471b
                a.g.l.v r0 = r0.f1457r
                androidx.appcompat.app.h$f$a r1 = new androidx.appcompat.app.h$f$a
                r1.<init>(r4)
                r0.m3370a(r1)
                goto L_0x004b
            L_0x003d:
                androidx.appcompat.app.h r0 = r4.f1471b
                androidx.appcompat.widget.ActionBarContextView r0 = r0.f1454o
                r0.setAlpha(r1)
                androidx.appcompat.app.h r0 = r4.f1471b
                androidx.appcompat.widget.ActionBarContextView r0 = r0.f1454o
                r0.setVisibility(r2)
            L_0x004b:
                return
        }
    }

    /* renamed from: androidx.appcompat.app.h$g */
    /* loaded from: classes.dex */
    class C0453g extends p000a.p018g.p029l.C0228x {

        /* renamed from: a */
        final /* synthetic */ androidx.appcompat.app.LayoutInflater$Factory2C0445h f1473a;

        C0453g(androidx.appcompat.app.LayoutInflater$Factory2C0445h r1) {
                r0 = this;
                r0.f1473a = r1
                r0.<init>()
                return
        }

        @Override // p000a.p018g.p029l.AbstractC0227w
        /* renamed from: a */
        public void mo1850a(android.view.View r2) {
                r1 = this;
                androidx.appcompat.app.h r2 = r1.f1473a
                androidx.appcompat.widget.ActionBarContextView r2 = r2.f1454o
                r0 = 1065353216(0x3f800000, float:1.0)
                r2.setAlpha(r0)
                androidx.appcompat.app.h r2 = r1.f1473a
                a.g.l.v r2 = r2.f1457r
                r0 = 0
                r2.m3370a(r0)
                androidx.appcompat.app.h r2 = r1.f1473a
                r2.f1457r = r0
                return
        }

        @Override // p000a.p018g.p029l.C0228x, p000a.p018g.p029l.AbstractC0227w
        /* renamed from: b */
        public void mo1849b(android.view.View r2) {
                r1 = this;
                androidx.appcompat.app.h r2 = r1.f1473a
                androidx.appcompat.widget.ActionBarContextView r2 = r2.f1454o
                r0 = 0
                r2.setVisibility(r0)
                androidx.appcompat.app.h r2 = r1.f1473a
                androidx.appcompat.widget.ActionBarContextView r2 = r2.f1454o
                r0 = 32
                r2.sendAccessibilityEvent(r0)
                androidx.appcompat.app.h r2 = r1.f1473a
                androidx.appcompat.widget.ActionBarContextView r2 = r2.f1454o
                android.view.ViewParent r2 = r2.getParent()
                boolean r2 = r2 instanceof android.view.View
                if (r2 == 0) goto L_0x002a
                androidx.appcompat.app.h r2 = r1.f1473a
                androidx.appcompat.widget.ActionBarContextView r2 = r2.f1454o
                android.view.ViewParent r2 = r2.getParent()
                android.view.View r2 = (android.view.View) r2
                p000a.p018g.p029l.C0216r.m3449B(r2)
            L_0x002a:
                return
        }
    }

    /* renamed from: androidx.appcompat.app.h$h */
    /* loaded from: classes.dex */
    private class C0454h implements androidx.appcompat.app.C0432b.AbstractC0434b {

        /* renamed from: a */
        final /* synthetic */ androidx.appcompat.app.LayoutInflater$Factory2C0445h f1474a;

        C0454h(androidx.appcompat.app.LayoutInflater$Factory2C0445h r1) {
                r0 = this;
                r0.f1474a = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: a */
        public void mo2549a(int r2) {
                r1 = this;
                androidx.appcompat.app.h r0 = r1.f1474a
                androidx.appcompat.app.a r0 = r0.mo2584d()
                if (r0 == 0) goto L_0x000b
                r0.mo2494b(r2)
            L_0x000b:
                return
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: a */
        public void mo2548a(android.graphics.drawable.Drawable r2, int r3) {
                r1 = this;
                androidx.appcompat.app.h r0 = r1.f1474a
                androidx.appcompat.app.a r0 = r0.mo2584d()
                if (r0 == 0) goto L_0x000e
                r0.mo2498a(r2)
                r0.mo2494b(r3)
            L_0x000e:
                return
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: a */
        public boolean mo2550a() {
                r1 = this;
                androidx.appcompat.app.h r0 = r1.f1474a
                androidx.appcompat.app.a r0 = r0.mo2584d()
                if (r0 == 0) goto L_0x0012
                int r0 = r0.mo2486g()
                r0 = r0 & 4
                if (r0 == 0) goto L_0x0012
                r0 = 1
                goto L_0x0013
            L_0x0012:
                r0 = 0
            L_0x0013:
                return r0
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: b */
        public android.content.Context mo2547b() {
                r1 = this;
                androidx.appcompat.app.h r0 = r1.f1474a
                android.content.Context r0 = r0.m2564n()
                return r0
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: c */
        public android.graphics.drawable.Drawable mo2546c() {
                r4 = this;
                android.content.Context r0 = r4.mo2547b()
                r1 = 1
                int[] r1 = new int[r1]
                int r2 = p000a.p001a.C0000a.homeAsUpIndicator
                r3 = 0
                r1[r3] = r2
                r2 = 0
                androidx.appcompat.widget.t0 r0 = androidx.appcompat.widget.C0638t0.m1901a(r0, r2, r1)
                android.graphics.drawable.Drawable r1 = r0.m1899b(r3)
                r0.m1908a()
                return r1
        }
    }

    /* renamed from: androidx.appcompat.app.h$i */
    /* loaded from: classes.dex */
    private final class C0455i implements androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.app.LayoutInflater$Factory2C0445h f1475b;

        C0455i(androidx.appcompat.app.LayoutInflater$Factory2C0445h r1) {
                r0 = this;
                r0.f1475b = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a
        /* renamed from: a */
        public void mo2108a(androidx.appcompat.view.menu.C0496h r1, boolean r2) {
                r0 = this;
                androidx.appcompat.app.h r2 = r0.f1475b
                r2.m2590b(r1)
                return
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a
        /* renamed from: a */
        public boolean mo2109a(androidx.appcompat.view.menu.C0496h r3) {
                r2 = this;
                androidx.appcompat.app.h r0 = r2.f1475b
                android.view.Window$Callback r0 = r0.m2562p()
                if (r0 == 0) goto L_0x000d
                r1 = 108(0x6c, float:1.51E-43)
                r0.onMenuOpened(r1, r3)
            L_0x000d:
                r3 = 1
                return r3
        }
    }

    /* renamed from: androidx.appcompat.app.h$j */
    /* loaded from: classes.dex */
    class C0456j implements p000a.p001a.p006m.AbstractC0029b.AbstractC0030a {

        /* renamed from: a */
        private p000a.p001a.p006m.AbstractC0029b.AbstractC0030a f1476a;

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.app.LayoutInflater$Factory2C0445h f1477b;

        /* renamed from: androidx.appcompat.app.h$j$a */
        /* loaded from: classes.dex */
        class C0457a extends p000a.p018g.p029l.C0228x {

            /* renamed from: a */
            final /* synthetic */ androidx.appcompat.app.LayoutInflater$Factory2C0445h.C0456j f1478a;

            C0457a(androidx.appcompat.app.LayoutInflater$Factory2C0445h.C0456j r1) {
                    r0 = this;
                    r0.f1478a = r1
                    r0.<init>()
                    return
            }

            @Override // p000a.p018g.p029l.AbstractC0227w
            /* renamed from: a */
            public void mo1850a(android.view.View r2) {
                    r1 = this;
                    androidx.appcompat.app.h$j r2 = r1.f1478a
                    androidx.appcompat.app.h r2 = r2.f1477b
                    androidx.appcompat.widget.ActionBarContextView r2 = r2.f1454o
                    r0 = 8
                    r2.setVisibility(r0)
                    androidx.appcompat.app.h$j r2 = r1.f1478a
                    androidx.appcompat.app.h r2 = r2.f1477b
                    android.widget.PopupWindow r0 = r2.f1455p
                    if (r0 == 0) goto L_0x0017
                    r0.dismiss()
                    goto L_0x0030
                L_0x0017:
                    androidx.appcompat.widget.ActionBarContextView r2 = r2.f1454o
                    android.view.ViewParent r2 = r2.getParent()
                    boolean r2 = r2 instanceof android.view.View
                    if (r2 == 0) goto L_0x0030
                    androidx.appcompat.app.h$j r2 = r1.f1478a
                    androidx.appcompat.app.h r2 = r2.f1477b
                    androidx.appcompat.widget.ActionBarContextView r2 = r2.f1454o
                    android.view.ViewParent r2 = r2.getParent()
                    android.view.View r2 = (android.view.View) r2
                    p000a.p018g.p029l.C0216r.m3449B(r2)
                L_0x0030:
                    androidx.appcompat.app.h$j r2 = r1.f1478a
                    androidx.appcompat.app.h r2 = r2.f1477b
                    androidx.appcompat.widget.ActionBarContextView r2 = r2.f1454o
                    r2.removeAllViews()
                    androidx.appcompat.app.h$j r2 = r1.f1478a
                    androidx.appcompat.app.h r2 = r2.f1477b
                    a.g.l.v r2 = r2.f1457r
                    r0 = 0
                    r2.m3370a(r0)
                    androidx.appcompat.app.h$j r2 = r1.f1478a
                    androidx.appcompat.app.h r2 = r2.f1477b
                    r2.f1457r = r0
                    return
            }
        }

        public C0456j(androidx.appcompat.app.LayoutInflater$Factory2C0445h r1, p000a.p001a.p006m.AbstractC0029b.AbstractC0030a r2) {
                r0 = this;
                r0.f1477b = r1
                r0.<init>()
                r0.f1476a = r2
                return
        }

        @Override // p000a.p001a.p006m.AbstractC0029b.AbstractC0030a
        /* renamed from: a */
        public void mo2545a(p000a.p001a.p006m.AbstractC0029b r3) {
                r2 = this;
                a.a.m.b$a r0 = r2.f1476a
                r0.mo2545a(r3)
                androidx.appcompat.app.h r3 = r2.f1477b
                android.widget.PopupWindow r0 = r3.f1455p
                if (r0 == 0) goto L_0x0018
                android.view.Window r3 = r3.f1443d
                android.view.View r3 = r3.getDecorView()
                androidx.appcompat.app.h r0 = r2.f1477b
                java.lang.Runnable r0 = r0.f1456q
                r3.removeCallbacks(r0)
            L_0x0018:
                androidx.appcompat.app.h r3 = r2.f1477b
                androidx.appcompat.widget.ActionBarContextView r0 = r3.f1454o
                if (r0 == 0) goto L_0x003b
                r3.m2565m()
                androidx.appcompat.app.h r3 = r2.f1477b
                androidx.appcompat.widget.ActionBarContextView r0 = r3.f1454o
                a.g.l.v r0 = p000a.p018g.p029l.C0216r.m3445a(r0)
                r1 = 0
                r0.m3372a(r1)
                r3.f1457r = r0
                androidx.appcompat.app.h r3 = r2.f1477b
                a.g.l.v r3 = r3.f1457r
                androidx.appcompat.app.h$j$a r0 = new androidx.appcompat.app.h$j$a
                r0.<init>(r2)
                r3.m3370a(r0)
            L_0x003b:
                androidx.appcompat.app.h r3 = r2.f1477b
                androidx.appcompat.app.f r0 = r3.f1446g
                if (r0 == 0) goto L_0x0046
                a.a.m.b r3 = r3.f1453n
                r0.mo2525b(r3)
            L_0x0046:
                androidx.appcompat.app.h r3 = r2.f1477b
                r0 = 0
                r3.f1453n = r0
                return
        }

        @Override // p000a.p001a.p006m.AbstractC0029b.AbstractC0030a
        /* renamed from: a */
        public boolean mo2544a(p000a.p001a.p006m.AbstractC0029b r2, android.view.Menu r3) {
                r1 = this;
                a.a.m.b$a r0 = r1.f1476a
                boolean r2 = r0.mo2544a(r2, r3)
                return r2
        }

        @Override // p000a.p001a.p006m.AbstractC0029b.AbstractC0030a
        /* renamed from: a */
        public boolean mo2543a(p000a.p001a.p006m.AbstractC0029b r2, android.view.MenuItem r3) {
                r1 = this;
                a.a.m.b$a r0 = r1.f1476a
                boolean r2 = r0.mo2543a(r2, r3)
                return r2
        }

        @Override // p000a.p001a.p006m.AbstractC0029b.AbstractC0030a
        /* renamed from: b */
        public boolean mo2542b(p000a.p001a.p006m.AbstractC0029b r2, android.view.Menu r3) {
                r1 = this;
                a.a.m.b$a r0 = r1.f1476a
                boolean r2 = r0.mo2542b(r2, r3)
                return r2
        }
    }

    /* renamed from: androidx.appcompat.app.h$k */
    /* loaded from: classes.dex */
    class C0458k extends p000a.p001a.p006m.Window$CallbackC0041i {

        /* renamed from: c */
        final /* synthetic */ androidx.appcompat.app.LayoutInflater$Factory2C0445h f1479c;

        C0458k(androidx.appcompat.app.LayoutInflater$Factory2C0445h r1, android.view.Window.Callback r2) {
                r0 = this;
                r0.f1479c = r1
                r0.<init>(r2)
                return
        }

        /* renamed from: a */
        final android.view.ActionMode m2541a(android.view.ActionMode.Callback r3) {
                r2 = this;
                a.a.m.f$a r0 = new a.a.m.f$a
                androidx.appcompat.app.h r1 = r2.f1479c
                android.content.Context r1 = r1.f1442c
                r0.<init>(r1, r3)
                androidx.appcompat.app.h r3 = r2.f1479c
                a.a.m.b r3 = r3.m2615a(r0)
                if (r3 == 0) goto L_0x0016
                android.view.ActionMode r3 = r0.m4170b(r3)
                return r3
            L_0x0016:
                r3 = 0
                return r3
        }

        @Override // p000a.p001a.p006m.Window$CallbackC0041i, android.view.Window.Callback
        public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
                r1 = this;
                androidx.appcompat.app.h r0 = r1.f1479c
                boolean r0 = r0.m2612a(r2)
                if (r0 != 0) goto L_0x0011
                boolean r2 = super.dispatchKeyEvent(r2)
                if (r2 == 0) goto L_0x000f
                goto L_0x0011
            L_0x000f:
                r2 = 0
                goto L_0x0012
            L_0x0011:
                r2 = 1
            L_0x0012:
                return r2
        }

        @Override // p000a.p001a.p006m.Window$CallbackC0041i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r3) {
                r2 = this;
                boolean r0 = super.dispatchKeyShortcutEvent(r3)
                if (r0 != 0) goto L_0x0015
                androidx.appcompat.app.h r0 = r2.f1479c
                int r1 = r3.getKeyCode()
                boolean r3 = r0.m2596b(r1, r3)
                if (r3 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r3 = 0
                goto L_0x0016
            L_0x0015:
                r3 = 1
            L_0x0016:
                return r3
        }

        @Override // p000a.p001a.p006m.Window$CallbackC0041i, android.view.Window.Callback
        public void onContentChanged() {
                r0 = this;
                return
        }

        @Override // p000a.p001a.p006m.Window$CallbackC0041i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int r2, android.view.Menu r3) {
                r1 = this;
                if (r2 != 0) goto L_0x0008
                boolean r0 = r3 instanceof androidx.appcompat.view.menu.C0496h
                if (r0 != 0) goto L_0x0008
                r2 = 0
                return r2
            L_0x0008:
                boolean r2 = super.onCreatePanelMenu(r2, r3)
                return r2
        }

        @Override // p000a.p001a.p006m.Window$CallbackC0041i, android.view.Window.Callback
        public boolean onMenuOpened(int r1, android.view.Menu r2) {
                r0 = this;
                super.onMenuOpened(r1, r2)
                androidx.appcompat.app.h r2 = r0.f1479c
                r2.m2575g(r1)
                r1 = 1
                return r1
        }

        @Override // p000a.p001a.p006m.Window$CallbackC0041i, android.view.Window.Callback
        public void onPanelClosed(int r1, android.view.Menu r2) {
                r0 = this;
                super.onPanelClosed(r1, r2)
                androidx.appcompat.app.h r2 = r0.f1479c
                r2.m2573h(r1)
                return
        }

        @Override // p000a.p001a.p006m.Window$CallbackC0041i, android.view.Window.Callback
        public boolean onPreparePanel(int r4, android.view.View r5, android.view.Menu r6) {
                r3 = this;
                boolean r0 = r6 instanceof androidx.appcompat.view.menu.C0496h
                if (r0 == 0) goto L_0x0008
                r0 = r6
                androidx.appcompat.view.menu.h r0 = (androidx.appcompat.view.menu.C0496h) r0
                goto L_0x0009
            L_0x0008:
                r0 = 0
            L_0x0009:
                r1 = 0
                if (r4 != 0) goto L_0x000f
                if (r0 != 0) goto L_0x000f
                return r1
            L_0x000f:
                if (r0 == 0) goto L_0x0015
                r2 = 1
                r0.m2393c(r2)
            L_0x0015:
                boolean r4 = super.onPreparePanel(r4, r5, r6)
                if (r0 == 0) goto L_0x001e
                r0.m2393c(r1)
            L_0x001e:
                return r4
        }

        @Override // p000a.p001a.p006m.Window$CallbackC0041i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> r4, android.view.Menu r5, int r6) {
                r3 = this;
                androidx.appcompat.app.h r0 = r3.f1479c
                r1 = 0
                r2 = 1
                androidx.appcompat.app.h$n r0 = r0.m2616a(r1, r2)
                if (r0 == 0) goto L_0x0012
                androidx.appcompat.view.menu.h r0 = r0.f1496j
                if (r0 == 0) goto L_0x0012
                super.onProvideKeyboardShortcuts(r4, r0, r6)
                goto L_0x0015
            L_0x0012:
                super.onProvideKeyboardShortcuts(r4, r5, r6)
            L_0x0015:
                return
        }

        @Override // p000a.p001a.p006m.Window$CallbackC0041i, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r3) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 23
                if (r0 < r1) goto L_0x0008
                r3 = 0
                return r3
            L_0x0008:
                androidx.appcompat.app.h r0 = r2.f1479c
                boolean r0 = r0.m2561q()
                if (r0 == 0) goto L_0x0015
                android.view.ActionMode r3 = r2.m2541a(r3)
                return r3
            L_0x0015:
                android.view.ActionMode r3 = super.onWindowStartingActionMode(r3)
                return r3
        }

        @Override // p000a.p001a.p006m.Window$CallbackC0041i, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r2, int r3) {
                r1 = this;
                androidx.appcompat.app.h r0 = r1.f1479c
                boolean r0 = r0.m2561q()
                if (r0 == 0) goto L_0x0010
                if (r3 == 0) goto L_0x000b
                goto L_0x0010
            L_0x000b:
                android.view.ActionMode r2 = r1.m2541a(r2)
                return r2
            L_0x0010:
                android.view.ActionMode r2 = super.onWindowStartingActionMode(r2, r3)
                return r2
        }
    }

    /* renamed from: androidx.appcompat.app.h$l */
    /* loaded from: classes.dex */
    final class C0459l {

        /* renamed from: a */
        private androidx.appcompat.app.C0474m f1480a;

        /* renamed from: b */
        private boolean f1481b;

        /* renamed from: c */
        private android.content.BroadcastReceiver f1482c;

        /* renamed from: d */
        private android.content.IntentFilter f1483d;

        /* renamed from: e */
        final /* synthetic */ androidx.appcompat.app.LayoutInflater$Factory2C0445h f1484e;

        /* renamed from: androidx.appcompat.app.h$l$a */
        /* loaded from: classes.dex */
        class C0460a extends android.content.BroadcastReceiver {

            /* renamed from: a */
            final /* synthetic */ androidx.appcompat.app.LayoutInflater$Factory2C0445h.C0459l f1485a;

            C0460a(androidx.appcompat.app.LayoutInflater$Factory2C0445h.C0459l r1) {
                    r0 = this;
                    r0.f1485a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context r1, android.content.Intent r2) {
                    r0 = this;
                    androidx.appcompat.app.h$l r1 = r0.f1485a
                    r1.m2539b()
                    return
            }
        }

        C0459l(androidx.appcompat.app.LayoutInflater$Factory2C0445h r1, androidx.appcompat.app.C0474m r2) {
                r0 = this;
                r0.f1484e = r1
                r0.<init>()
                r0.f1480a = r2
                boolean r1 = r2.m2509a()
                r0.f1481b = r1
                return
        }

        /* renamed from: a */
        void m2540a() {
                r2 = this;
                android.content.BroadcastReceiver r0 = r2.f1482c
                if (r0 == 0) goto L_0x000e
                androidx.appcompat.app.h r1 = r2.f1484e
                android.content.Context r1 = r1.f1442c
                r1.unregisterReceiver(r0)
                r0 = 0
                r2.f1482c = r0
            L_0x000e:
                return
        }

        /* renamed from: b */
        void m2539b() {
                r2 = this;
                androidx.appcompat.app.m r0 = r2.f1480a
                boolean r0 = r0.m2509a()
                boolean r1 = r2.f1481b
                if (r0 == r1) goto L_0x0011
                r2.f1481b = r0
                androidx.appcompat.app.h r0 = r2.f1484e
                r0.mo2620a()
            L_0x0011:
                return
        }

        /* renamed from: c */
        int m2538c() {
                r1 = this;
                androidx.appcompat.app.m r0 = r1.f1480a
                boolean r0 = r0.m2509a()
                r1.f1481b = r0
                boolean r0 = r1.f1481b
                if (r0 == 0) goto L_0x000e
                r0 = 2
                goto L_0x000f
            L_0x000e:
                r0 = 1
            L_0x000f:
                return r0
        }

        /* renamed from: d */
        void m2537d() {
                r3 = this;
                r3.m2540a()
                android.content.BroadcastReceiver r0 = r3.f1482c
                if (r0 != 0) goto L_0x000e
                androidx.appcompat.app.h$l$a r0 = new androidx.appcompat.app.h$l$a
                r0.<init>(r3)
                r3.f1482c = r0
            L_0x000e:
                android.content.IntentFilter r0 = r3.f1483d
                if (r0 != 0) goto L_0x002e
                android.content.IntentFilter r0 = new android.content.IntentFilter
                r0.<init>()
                r3.f1483d = r0
                android.content.IntentFilter r0 = r3.f1483d
                java.lang.String r1 = "android.intent.action.TIME_SET"
                r0.addAction(r1)
                android.content.IntentFilter r0 = r3.f1483d
                java.lang.String r1 = "android.intent.action.TIMEZONE_CHANGED"
                r0.addAction(r1)
                android.content.IntentFilter r0 = r3.f1483d
                java.lang.String r1 = "android.intent.action.TIME_TICK"
                r0.addAction(r1)
            L_0x002e:
                androidx.appcompat.app.h r0 = r3.f1484e
                android.content.Context r0 = r0.f1442c
                android.content.BroadcastReceiver r1 = r3.f1482c
                android.content.IntentFilter r2 = r3.f1483d
                r0.registerReceiver(r1, r2)
                return
        }
    }

    /* renamed from: androidx.appcompat.app.h$m */
    /* loaded from: classes.dex */
    private class C0461m extends androidx.appcompat.widget.ContentFrameLayout {

        /* renamed from: j */
        final /* synthetic */ androidx.appcompat.app.LayoutInflater$Factory2C0445h f1486j;

        public C0461m(androidx.appcompat.app.LayoutInflater$Factory2C0445h r1, android.content.Context r2) {
                r0 = this;
                r0.f1486j = r1
                r0.<init>(r2)
                return
        }

        /* renamed from: a */
        private boolean m2536a(int r2, int r3) {
                r1 = this;
                r0 = -5
                if (r2 < r0) goto L_0x0018
                if (r3 < r0) goto L_0x0018
                int r0 = r1.getWidth()
                int r0 = r0 + 5
                if (r2 > r0) goto L_0x0018
                int r2 = r1.getHeight()
                int r2 = r2 + 5
                if (r3 <= r2) goto L_0x0016
                goto L_0x0018
            L_0x0016:
                r2 = 0
                goto L_0x0019
            L_0x0018:
                r2 = 1
            L_0x0019:
                return r2
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
                r1 = this;
                androidx.appcompat.app.h r0 = r1.f1486j
                boolean r0 = r0.m2612a(r2)
                if (r0 != 0) goto L_0x0011
                boolean r2 = super.dispatchKeyEvent(r2)
                if (r2 == 0) goto L_0x000f
                goto L_0x0011
            L_0x000f:
                r2 = 0
                goto L_0x0012
            L_0x0011:
                r2 = 1
            L_0x0012:
                return r2
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(android.view.MotionEvent r3) {
                r2 = this;
                int r0 = r3.getAction()
                if (r0 != 0) goto L_0x001e
                float r0 = r3.getX()
                int r0 = (int) r0
                float r1 = r3.getY()
                int r1 = (int) r1
                boolean r0 = r2.m2536a(r0, r1)
                if (r0 == 0) goto L_0x001e
                androidx.appcompat.app.h r3 = r2.f1486j
                r0 = 0
                r3.m2583d(r0)
                r3 = 1
                return r3
            L_0x001e:
                boolean r3 = super.onInterceptTouchEvent(r3)
                return r3
        }

        @Override // android.view.View
        public void setBackgroundResource(int r2) {
                r1 = this;
                android.content.Context r0 = r1.getContext()
                android.graphics.drawable.Drawable r2 = p000a.p001a.p002k.p003a.C0010a.m4259c(r0, r2)
                r1.setBackgroundDrawable(r2)
                return
        }
    }

    /* renamed from: androidx.appcompat.app.h$n */
    /* loaded from: classes.dex */
    protected static final class C0462n {

        /* renamed from: a */
        int f1487a;

        /* renamed from: b */
        int f1488b;

        /* renamed from: c */
        int f1489c;

        /* renamed from: d */
        int f1490d;

        /* renamed from: e */
        int f1491e;

        /* renamed from: f */
        int f1492f;

        /* renamed from: g */
        android.view.ViewGroup f1493g;

        /* renamed from: h */
        android.view.View f1494h;

        /* renamed from: i */
        android.view.View f1495i;

        /* renamed from: j */
        androidx.appcompat.view.menu.C0496h f1496j;

        /* renamed from: k */
        androidx.appcompat.view.menu.C0493f f1497k;

        /* renamed from: l */
        android.content.Context f1498l;

        /* renamed from: m */
        boolean f1499m;

        /* renamed from: n */
        boolean f1500n;

        /* renamed from: o */
        boolean f1501o;

        /* renamed from: p */
        public boolean f1502p;

        /* renamed from: q */
        boolean f1503q;

        /* renamed from: r */
        boolean f1504r;

        /* renamed from: s */
        android.os.Bundle f1505s;

        C0462n(int r1) {
                r0 = this;
                r0.<init>()
                r0.f1487a = r1
                r1 = 0
                r0.f1503q = r1
                return
        }

        /* renamed from: a */
        androidx.appcompat.view.menu.AbstractC0515q m2532a(androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a r4) {
                r3 = this;
                androidx.appcompat.view.menu.h r0 = r3.f1496j
                if (r0 != 0) goto L_0x0006
                r4 = 0
                return r4
            L_0x0006:
                androidx.appcompat.view.menu.f r0 = r3.f1497k
                if (r0 != 0) goto L_0x0021
                androidx.appcompat.view.menu.f r0 = new androidx.appcompat.view.menu.f
                android.content.Context r1 = r3.f1498l
                int r2 = p000a.p001a.C0006g.abc_list_menu_item_layout
                r0.<init>(r1, r2)
                r3.f1497k = r0
                androidx.appcompat.view.menu.f r0 = r3.f1497k
                r0.mo2308a(r4)
                androidx.appcompat.view.menu.h r4 = r3.f1496j
                androidx.appcompat.view.menu.f r0 = r3.f1497k
                r4.m2408a(r0)
            L_0x0021:
                androidx.appcompat.view.menu.f r4 = r3.f1497k
                android.view.ViewGroup r0 = r3.f1493g
                androidx.appcompat.view.menu.q r4 = r4.m2429a(r0)
                return r4
        }

        /* renamed from: a */
        void m2534a(android.content.Context r5) {
                r4 = this;
                android.util.TypedValue r0 = new android.util.TypedValue
                r0.<init>()
                android.content.res.Resources r1 = r5.getResources()
                android.content.res.Resources$Theme r1 = r1.newTheme()
                android.content.res.Resources$Theme r2 = r5.getTheme()
                r1.setTo(r2)
                int r2 = p000a.p001a.C0000a.actionBarPopupTheme
                r3 = 1
                r1.resolveAttribute(r2, r0, r3)
                int r2 = r0.resourceId
                if (r2 == 0) goto L_0x0021
                r1.applyStyle(r2, r3)
            L_0x0021:
                int r2 = p000a.p001a.C0000a.panelMenuListTheme
                r1.resolveAttribute(r2, r0, r3)
                int r0 = r0.resourceId
                if (r0 == 0) goto L_0x002b
                goto L_0x002d
            L_0x002b:
                int r0 = p000a.p001a.C0008i.Theme_AppCompat_CompactMenu
            L_0x002d:
                r1.applyStyle(r0, r3)
                a.a.m.d r0 = new a.a.m.d
                r2 = 0
                r0.<init>(r5, r2)
                android.content.res.Resources$Theme r5 = r0.getTheme()
                r5.setTo(r1)
                r4.f1498l = r0
                int[] r5 = p000a.p001a.C0009j.AppCompatTheme
                android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5)
                int r0 = p000a.p001a.C0009j.AppCompatTheme_panelBackground
                int r0 = r5.getResourceId(r0, r2)
                r4.f1488b = r0
                int r0 = p000a.p001a.C0009j.AppCompatTheme_android_windowAnimationStyle
                int r0 = r5.getResourceId(r0, r2)
                r4.f1492f = r0
                r5.recycle()
                return
        }

        /* renamed from: a */
        void m2533a(androidx.appcompat.view.menu.C0496h r3) {
                r2 = this;
                androidx.appcompat.view.menu.h r0 = r2.f1496j
                if (r3 != r0) goto L_0x0005
                return
            L_0x0005:
                if (r0 == 0) goto L_0x000c
                androidx.appcompat.view.menu.f r1 = r2.f1497k
                r0.m2398b(r1)
            L_0x000c:
                r2.f1496j = r3
                if (r3 == 0) goto L_0x0017
                androidx.appcompat.view.menu.f r0 = r2.f1497k
                if (r0 == 0) goto L_0x0017
                r3.m2408a(r0)
            L_0x0017:
                return
        }

        /* renamed from: a */
        public boolean m2535a() {
                r3 = this;
                android.view.View r0 = r3.f1494h
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                android.view.View r0 = r3.f1495i
                r2 = 1
                if (r0 == 0) goto L_0x000c
                return r2
            L_0x000c:
                androidx.appcompat.view.menu.f r0 = r3.f1497k
                android.widget.ListAdapter r0 = r0.m2427d()
                int r0 = r0.getCount()
                if (r0 <= 0) goto L_0x0019
                r1 = 1
            L_0x0019:
                return r1
        }
    }

    /* renamed from: androidx.appcompat.app.h$o */
    /* loaded from: classes.dex */
    private final class C0463o implements androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.app.LayoutInflater$Factory2C0445h f1506b;

        C0463o(androidx.appcompat.app.LayoutInflater$Factory2C0445h r1) {
                r0 = this;
                r0.f1506b = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a
        /* renamed from: a */
        public void mo2108a(androidx.appcompat.view.menu.C0496h r5, boolean r6) {
                r4 = this;
                androidx.appcompat.view.menu.h r0 = r5.mo2297m()
                r1 = 1
                if (r0 == r5) goto L_0x0009
                r2 = 1
                goto L_0x000a
            L_0x0009:
                r2 = 0
            L_0x000a:
                androidx.appcompat.app.h r3 = r4.f1506b
                if (r2 == 0) goto L_0x000f
                r5 = r0
            L_0x000f:
                androidx.appcompat.app.h$n r5 = r3.m2611a(r5)
                if (r5 == 0) goto L_0x0029
                if (r2 == 0) goto L_0x0024
                androidx.appcompat.app.h r6 = r4.f1506b
                int r2 = r5.f1487a
                r6.m2617a(r2, r5, r0)
                androidx.appcompat.app.h r6 = r4.f1506b
                r6.m2602a(r5, r1)
                goto L_0x0029
            L_0x0024:
                androidx.appcompat.app.h r0 = r4.f1506b
                r0.m2602a(r5, r6)
            L_0x0029:
                return
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a
        /* renamed from: a */
        public boolean mo2109a(androidx.appcompat.view.menu.C0496h r3) {
                r2 = this;
                if (r3 != 0) goto L_0x0019
                androidx.appcompat.app.h r0 = r2.f1506b
                boolean r1 = r0.f1465z
                if (r1 == 0) goto L_0x0019
                android.view.Window$Callback r0 = r0.m2562p()
                if (r0 == 0) goto L_0x0019
                androidx.appcompat.app.h r1 = r2.f1506b
                boolean r1 = r1.f1431I
                if (r1 != 0) goto L_0x0019
                r1 = 108(0x6c, float:1.51E-43)
                r0.onMenuOpened(r1, r3)
            L_0x0019:
                r3 = 1
                return r3
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 1
            r3 = 21
            if (r0 >= r3) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            androidx.appcompat.app.LayoutInflater$Factory2C0445h.f1420T = r0
            int[] r0 = new int[r2]
            r3 = 16842836(0x1010054, float:2.3693793E-38)
            r0[r1] = r3
            androidx.appcompat.app.LayoutInflater$Factory2C0445h.f1421U = r0
            boolean r0 = androidx.appcompat.app.LayoutInflater$Factory2C0445h.f1420T
            if (r0 == 0) goto L_0x002c
            boolean r0 = androidx.appcompat.app.LayoutInflater$Factory2C0445h.f1422V
            if (r0 != 0) goto L_0x002c
            java.lang.Thread$UncaughtExceptionHandler r0 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            androidx.appcompat.app.h$a r1 = new androidx.appcompat.app.h$a
            r1.<init>(r0)
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r1)
            androidx.appcompat.app.LayoutInflater$Factory2C0445h.f1422V = r2
        L_0x002c:
            return
    }

    LayoutInflater$Factory2C0445h(android.content.Context r3, android.view.Window r4, androidx.appcompat.app.AbstractC0443f r5) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f1457r = r0
            r1 = 1
            r2.f1458s = r1
            r1 = -100
            r2.f1432J = r1
            androidx.appcompat.app.h$b r1 = new androidx.appcompat.app.h$b
            r1.<init>(r2)
            r2.f1437O = r1
            r2.f1442c = r3
            r2.f1443d = r4
            r2.f1446g = r5
            android.view.Window r4 = r2.f1443d
            android.view.Window$Callback r4 = r4.getCallback()
            r2.f1444e = r4
            android.view.Window$Callback r4 = r2.f1444e
            boolean r5 = r4 instanceof androidx.appcompat.app.LayoutInflater$Factory2C0445h.C0458k
            if (r5 != 0) goto L_0x004c
            androidx.appcompat.app.h$k r5 = new androidx.appcompat.app.h$k
            r5.<init>(r2, r4)
            r2.f1445f = r5
            android.view.Window r4 = r2.f1443d
            android.view.Window$Callback r5 = r2.f1445f
            r4.setCallback(r5)
            int[] r4 = androidx.appcompat.app.LayoutInflater$Factory2C0445h.f1421U
            androidx.appcompat.widget.t0 r3 = androidx.appcompat.widget.C0638t0.m1901a(r3, r0, r4)
            r4 = 0
            android.graphics.drawable.Drawable r4 = r3.m1897c(r4)
            if (r4 == 0) goto L_0x0048
            android.view.Window r5 = r2.f1443d
            r5.setBackgroundDrawable(r4)
        L_0x0048:
            r3.m1908a()
            return
        L_0x004c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "AppCompat has already installed itself into the Window"
            r3.<init>(r4)
            throw r3
    }

    /* renamed from: A */
    private boolean m2622A() {
            r6 = this;
            boolean r0 = r6.f1433K
            r1 = 0
            if (r0 == 0) goto L_0x0032
            android.content.Context r0 = r6.f1442c
            boolean r2 = r0 instanceof android.app.Activity
            if (r2 == 0) goto L_0x0032
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r2 = 1
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch: NameNotFoundException -> 0x0029
            android.content.Context r4 = r6.f1442c     // Catch: NameNotFoundException -> 0x0029
            android.content.Context r5 = r6.f1442c     // Catch: NameNotFoundException -> 0x0029
            java.lang.Class r5 = r5.getClass()     // Catch: NameNotFoundException -> 0x0029
            r3.<init>(r4, r5)     // Catch: NameNotFoundException -> 0x0029
            android.content.pm.ActivityInfo r0 = r0.getActivityInfo(r3, r1)     // Catch: NameNotFoundException -> 0x0029
            int r0 = r0.configChanges     // Catch: NameNotFoundException -> 0x0029
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x0028
            r1 = 1
        L_0x0028:
            return r1
        L_0x0029:
            r0 = move-exception
            java.lang.String r1 = "AppCompatDelegate"
            java.lang.String r3 = "Exception while getting ActivityInfo"
            android.util.Log.d(r1, r3, r0)
            return r2
        L_0x0032:
            return r1
    }

    /* renamed from: B */
    private void m2621B() {
            r2 = this;
            boolean r0 = r2.f1459t
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.util.AndroidRuntimeException r0 = new android.util.AndroidRuntimeException
            java.lang.String r1 = "Window feature must be requested before adding content"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: a */
    private void m2603a(androidx.appcompat.app.LayoutInflater$Factory2C0445h.C0462n r14, android.view.KeyEvent r15) {
            r13 = this;
            boolean r0 = r14.f1501o
            if (r0 != 0) goto L_0x00f2
            boolean r0 = r13.f1431I
            if (r0 == 0) goto L_0x000a
            goto L_0x00f2
        L_0x000a:
            int r0 = r14.f1487a
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0027
            android.content.Context r0 = r13.f1442c
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r3 = 4
            if (r0 != r3) goto L_0x0023
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 == 0) goto L_0x0027
            return
        L_0x0027:
            android.view.Window$Callback r0 = r13.m2562p()
            if (r0 == 0) goto L_0x003b
            int r3 = r14.f1487a
            androidx.appcompat.view.menu.h r4 = r14.f1496j
            boolean r0 = r0.onMenuOpened(r3, r4)
            if (r0 != 0) goto L_0x003b
            r13.m2602a(r14, r2)
            return
        L_0x003b:
            android.content.Context r0 = r13.f1442c
            java.lang.String r3 = "window"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L_0x0048
            return
        L_0x0048:
            boolean r15 = r13.m2591b(r14, r15)
            if (r15 != 0) goto L_0x004f
            return
        L_0x004f:
            android.view.ViewGroup r15 = r14.f1493g
            r3 = -1
            r4 = -2
            if (r15 == 0) goto L_0x006a
            boolean r15 = r14.f1503q
            if (r15 == 0) goto L_0x005a
            goto L_0x006a
        L_0x005a:
            android.view.View r15 = r14.f1495i
            if (r15 == 0) goto L_0x00d0
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            if (r15 == 0) goto L_0x00d0
            int r15 = r15.width
            if (r15 != r3) goto L_0x00d0
            r6 = -1
            goto L_0x00d1
        L_0x006a:
            android.view.ViewGroup r15 = r14.f1493g
            if (r15 != 0) goto L_0x0079
            boolean r15 = r13.m2592b(r14)
            if (r15 == 0) goto L_0x0078
            android.view.ViewGroup r15 = r14.f1493g
            if (r15 != 0) goto L_0x0088
        L_0x0078:
            return
        L_0x0079:
            boolean r3 = r14.f1503q
            if (r3 == 0) goto L_0x0088
            int r15 = r15.getChildCount()
            if (r15 <= 0) goto L_0x0088
            android.view.ViewGroup r15 = r14.f1493g
            r15.removeAllViews()
        L_0x0088:
            boolean r15 = r13.m2605a(r14)
            if (r15 == 0) goto L_0x00f2
            boolean r15 = r14.m2535a()
            if (r15 != 0) goto L_0x0095
            goto L_0x00f2
        L_0x0095:
            android.view.View r15 = r14.f1494h
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            if (r15 != 0) goto L_0x00a2
            android.view.ViewGroup$LayoutParams r15 = new android.view.ViewGroup$LayoutParams
            r15.<init>(r4, r4)
        L_0x00a2:
            int r3 = r14.f1488b
            android.view.ViewGroup r5 = r14.f1493g
            r5.setBackgroundResource(r3)
            android.view.View r3 = r14.f1494h
            android.view.ViewParent r3 = r3.getParent()
            if (r3 == 0) goto L_0x00bc
            boolean r5 = r3 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x00bc
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r5 = r14.f1494h
            r3.removeView(r5)
        L_0x00bc:
            android.view.ViewGroup r3 = r14.f1493g
            android.view.View r5 = r14.f1494h
            r3.addView(r5, r15)
            android.view.View r15 = r14.f1494h
            boolean r15 = r15.hasFocus()
            if (r15 != 0) goto L_0x00d0
            android.view.View r15 = r14.f1494h
            r15.requestFocus()
        L_0x00d0:
            r6 = -2
        L_0x00d1:
            r14.f1500n = r1
            android.view.WindowManager$LayoutParams r15 = new android.view.WindowManager$LayoutParams
            r7 = -2
            int r8 = r14.f1490d
            int r9 = r14.f1491e
            r10 = 1002(0x3ea, float:1.404E-42)
            r11 = 8519680(0x820000, float:1.1938615E-38)
            r12 = -3
            r5 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            int r1 = r14.f1489c
            r15.gravity = r1
            int r1 = r14.f1492f
            r15.windowAnimations = r1
            android.view.ViewGroup r1 = r14.f1493g
            r0.addView(r1, r15)
            r14.f1501o = r2
        L_0x00f2:
            return
    }

    /* renamed from: a */
    private void m2601a(androidx.appcompat.view.menu.C0496h r5, boolean r6) {
            r4 = this;
            androidx.appcompat.widget.a0 r5 = r4.f1450k
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0082
            boolean r5 = r5.mo2141e()
            if (r5 == 0) goto L_0x0082
            android.content.Context r5 = r4.f1442c
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 == 0) goto L_0x0020
            androidx.appcompat.widget.a0 r5 = r4.f1450k
            boolean r5 = r5.mo2144b()
            if (r5 == 0) goto L_0x0082
        L_0x0020:
            android.view.Window$Callback r5 = r4.m2562p()
            androidx.appcompat.widget.a0 r2 = r4.f1450k
            boolean r2 = r2.mo2142d()
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L_0x0044
            if (r6 != 0) goto L_0x0031
            goto L_0x0044
        L_0x0031:
            androidx.appcompat.widget.a0 r6 = r4.f1450k
            r6.mo2140f()
            boolean r6 = r4.f1431I
            if (r6 != 0) goto L_0x0081
            androidx.appcompat.app.h$n r6 = r4.m2616a(r1, r0)
            androidx.appcompat.view.menu.h r6 = r6.f1496j
            r5.onPanelClosed(r3, r6)
            goto L_0x0081
        L_0x0044:
            if (r5 == 0) goto L_0x0081
            boolean r6 = r4.f1431I
            if (r6 != 0) goto L_0x0081
            boolean r6 = r4.f1435M
            if (r6 == 0) goto L_0x0063
            int r6 = r4.f1436N
            r6 = r6 & r0
            if (r6 == 0) goto L_0x0063
            android.view.Window r6 = r4.f1443d
            android.view.View r6 = r6.getDecorView()
            java.lang.Runnable r2 = r4.f1437O
            r6.removeCallbacks(r2)
            java.lang.Runnable r6 = r4.f1437O
            r6.run()
        L_0x0063:
            androidx.appcompat.app.h$n r6 = r4.m2616a(r1, r0)
            androidx.appcompat.view.menu.h r0 = r6.f1496j
            if (r0 == 0) goto L_0x0081
            boolean r2 = r6.f1504r
            if (r2 != 0) goto L_0x0081
            android.view.View r2 = r6.f1495i
            boolean r0 = r5.onPreparePanel(r1, r2, r0)
            if (r0 == 0) goto L_0x0081
            androidx.appcompat.view.menu.h r6 = r6.f1496j
            r5.onMenuOpened(r3, r6)
            androidx.appcompat.widget.a0 r5 = r4.f1450k
            r5.mo2147a()
        L_0x0081:
            return
        L_0x0082:
            androidx.appcompat.app.h$n r5 = r4.m2616a(r1, r0)
            r5.f1503q = r0
            r4.m2602a(r5, r1)
            r6 = 0
            r4.m2603a(r5, r6)
            return
    }

    /* renamed from: a */
    private boolean m2606a(android.view.ViewParent r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.view.Window r1 = r3.f1443d
            android.view.View r1 = r1.getDecorView()
        L_0x000a:
            if (r4 != 0) goto L_0x000e
            r4 = 1
            return r4
        L_0x000e:
            if (r4 == r1) goto L_0x0023
            boolean r2 = r4 instanceof android.view.View
            if (r2 == 0) goto L_0x0023
            r2 = r4
            android.view.View r2 = (android.view.View) r2
            boolean r2 = p000a.p018g.p029l.C0216r.m3398w(r2)
            if (r2 == 0) goto L_0x001e
            goto L_0x0023
        L_0x001e:
            android.view.ViewParent r4 = r4.getParent()
            goto L_0x000a
        L_0x0023:
            return r0
    }

    /* renamed from: a */
    private boolean m2605a(androidx.appcompat.app.LayoutInflater$Factory2C0445h.C0462n r4) {
            r3 = this;
            android.view.View r0 = r4.f1495i
            r1 = 1
            if (r0 == 0) goto L_0x0008
            r4.f1494h = r0
            return r1
        L_0x0008:
            androidx.appcompat.view.menu.h r0 = r4.f1496j
            r2 = 0
            if (r0 != 0) goto L_0x000e
            return r2
        L_0x000e:
            androidx.appcompat.app.h$o r0 = r3.f1452m
            if (r0 != 0) goto L_0x0019
            androidx.appcompat.app.h$o r0 = new androidx.appcompat.app.h$o
            r0.<init>(r3)
            r3.f1452m = r0
        L_0x0019:
            androidx.appcompat.app.h$o r0 = r3.f1452m
            androidx.appcompat.view.menu.q r0 = r4.m2532a(r0)
            android.view.View r0 = (android.view.View) r0
            r4.f1494h = r0
            android.view.View r4 = r4.f1494h
            if (r4 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r1 = 0
        L_0x0029:
            return r1
    }

    /* renamed from: a */
    private boolean m2604a(androidx.appcompat.app.LayoutInflater$Factory2C0445h.C0462n r3, int r4, android.view.KeyEvent r5, int r6) {
            r2 = this;
            boolean r0 = r5.isSystem()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r3.f1499m
            if (r0 != 0) goto L_0x0012
            boolean r0 = r2.m2591b(r3, r5)
            if (r0 == 0) goto L_0x001a
        L_0x0012:
            androidx.appcompat.view.menu.h r0 = r3.f1496j
            if (r0 == 0) goto L_0x001a
            boolean r1 = r0.performShortcut(r4, r5, r6)
        L_0x001a:
            if (r1 == 0) goto L_0x0028
            r4 = 1
            r5 = r6 & 1
            if (r5 != 0) goto L_0x0028
            androidx.appcompat.widget.a0 r5 = r2.f1450k
            if (r5 != 0) goto L_0x0028
            r2.m2602a(r3, r4)
        L_0x0028:
            return r1
    }

    /* renamed from: b */
    private boolean m2592b(androidx.appcompat.app.LayoutInflater$Factory2C0445h.C0462n r3) {
            r2 = this;
            android.content.Context r0 = r2.m2564n()
            r3.m2534a(r0)
            androidx.appcompat.app.h$m r0 = new androidx.appcompat.app.h$m
            android.content.Context r1 = r3.f1498l
            r0.<init>(r2, r1)
            r3.f1493g = r0
            r0 = 81
            r3.f1489c = r0
            r3 = 1
            return r3
    }

    /* renamed from: b */
    private boolean m2591b(androidx.appcompat.app.LayoutInflater$Factory2C0445h.C0462n r9, android.view.KeyEvent r10) {
            r8 = this;
            boolean r0 = r8.f1431I
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r9.f1499m
            r2 = 1
            if (r0 == 0) goto L_0x000c
            return r2
        L_0x000c:
            androidx.appcompat.app.h$n r0 = r8.f1429G
            if (r0 == 0) goto L_0x0015
            if (r0 == r9) goto L_0x0015
            r8.m2602a(r0, r1)
        L_0x0015:
            android.view.Window$Callback r0 = r8.m2562p()
            if (r0 == 0) goto L_0x0023
            int r3 = r9.f1487a
            android.view.View r3 = r0.onCreatePanelView(r3)
            r9.f1495i = r3
        L_0x0023:
            int r3 = r9.f1487a
            if (r3 == 0) goto L_0x002e
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 != r4) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r3 = 0
            goto L_0x002f
        L_0x002e:
            r3 = 1
        L_0x002f:
            if (r3 == 0) goto L_0x0038
            androidx.appcompat.widget.a0 r4 = r8.f1450k
            if (r4 == 0) goto L_0x0038
            r4.mo2143c()
        L_0x0038:
            android.view.View r4 = r9.f1495i
            if (r4 != 0) goto L_0x00e6
            if (r3 == 0) goto L_0x0046
            androidx.appcompat.app.a r4 = r8.m2559s()
            boolean r4 = r4 instanceof androidx.appcompat.app.C0467k
            if (r4 != 0) goto L_0x00e6
        L_0x0046:
            androidx.appcompat.view.menu.h r4 = r9.f1496j
            r5 = 0
            if (r4 == 0) goto L_0x004f
            boolean r4 = r9.f1504r
            if (r4 == 0) goto L_0x0098
        L_0x004f:
            androidx.appcompat.view.menu.h r4 = r9.f1496j
            if (r4 != 0) goto L_0x005e
            boolean r4 = r8.m2585c(r9)
            if (r4 == 0) goto L_0x005d
            androidx.appcompat.view.menu.h r4 = r9.f1496j
            if (r4 != 0) goto L_0x005e
        L_0x005d:
            return r1
        L_0x005e:
            if (r3 == 0) goto L_0x0078
            androidx.appcompat.widget.a0 r4 = r8.f1450k
            if (r4 == 0) goto L_0x0078
            androidx.appcompat.app.h$i r4 = r8.f1451l
            if (r4 != 0) goto L_0x006f
            androidx.appcompat.app.h$i r4 = new androidx.appcompat.app.h$i
            r4.<init>(r8)
            r8.f1451l = r4
        L_0x006f:
            androidx.appcompat.widget.a0 r4 = r8.f1450k
            androidx.appcompat.view.menu.h r6 = r9.f1496j
            androidx.appcompat.app.h$i r7 = r8.f1451l
            r4.mo2145a(r6, r7)
        L_0x0078:
            androidx.appcompat.view.menu.h r4 = r9.f1496j
            r4.m2373s()
            int r4 = r9.f1487a
            androidx.appcompat.view.menu.h r6 = r9.f1496j
            boolean r4 = r0.onCreatePanelMenu(r4, r6)
            if (r4 != 0) goto L_0x0096
            r9.m2533a(r5)
            if (r3 == 0) goto L_0x0095
            androidx.appcompat.widget.a0 r9 = r8.f1450k
            if (r9 == 0) goto L_0x0095
            androidx.appcompat.app.h$i r10 = r8.f1451l
            r9.mo2145a(r5, r10)
        L_0x0095:
            return r1
        L_0x0096:
            r9.f1504r = r1
        L_0x0098:
            androidx.appcompat.view.menu.h r4 = r9.f1496j
            r4.m2373s()
            android.os.Bundle r4 = r9.f1505s
            if (r4 == 0) goto L_0x00a8
            androidx.appcompat.view.menu.h r6 = r9.f1496j
            r6.m2413a(r4)
            r9.f1505s = r5
        L_0x00a8:
            android.view.View r4 = r9.f1495i
            androidx.appcompat.view.menu.h r6 = r9.f1496j
            boolean r0 = r0.onPreparePanel(r1, r4, r6)
            if (r0 != 0) goto L_0x00c3
            if (r3 == 0) goto L_0x00bd
            androidx.appcompat.widget.a0 r10 = r8.f1450k
            if (r10 == 0) goto L_0x00bd
            androidx.appcompat.app.h$i r0 = r8.f1451l
            r10.mo2145a(r5, r0)
        L_0x00bd:
            androidx.appcompat.view.menu.h r9 = r9.f1496j
            r9.m2374r()
            return r1
        L_0x00c3:
            if (r10 == 0) goto L_0x00ca
            int r10 = r10.getDeviceId()
            goto L_0x00cb
        L_0x00ca:
            r10 = -1
        L_0x00cb:
            android.view.KeyCharacterMap r10 = android.view.KeyCharacterMap.load(r10)
            int r10 = r10.getKeyboardType()
            if (r10 == r2) goto L_0x00d7
            r10 = 1
            goto L_0x00d8
        L_0x00d7:
            r10 = 0
        L_0x00d8:
            r9.f1502p = r10
            androidx.appcompat.view.menu.h r10 = r9.f1496j
            boolean r0 = r9.f1502p
            r10.setQwertyMode(r0)
            androidx.appcompat.view.menu.h r10 = r9.f1496j
            r10.m2374r()
        L_0x00e6:
            r9.f1499m = r2
            r9.f1500n = r1
            r8.f1429G = r9
            return r2
    }

    /* renamed from: c */
    private boolean m2585c(androidx.appcompat.app.LayoutInflater$Factory2C0445h.C0462n r7) {
            r6 = this;
            android.content.Context r0 = r6.f1442c
            int r1 = r7.f1487a
            r2 = 1
            if (r1 == 0) goto L_0x000b
            r3 = 108(0x6c, float:1.51E-43)
            if (r1 != r3) goto L_0x0063
        L_0x000b:
            androidx.appcompat.widget.a0 r1 = r6.f1450k
            if (r1 == 0) goto L_0x0063
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r3 = r0.getTheme()
            int r4 = p000a.p001a.C0000a.actionBarTheme
            r3.resolveAttribute(r4, r1, r2)
            r4 = 0
            int r5 = r1.resourceId
            if (r5 == 0) goto L_0x0038
            android.content.res.Resources r4 = r0.getResources()
            android.content.res.Resources$Theme r4 = r4.newTheme()
            r4.setTo(r3)
            int r5 = r1.resourceId
            r4.applyStyle(r5, r2)
            int r5 = p000a.p001a.C0000a.actionBarWidgetTheme
            r4.resolveAttribute(r5, r1, r2)
            goto L_0x003d
        L_0x0038:
            int r5 = p000a.p001a.C0000a.actionBarWidgetTheme
            r3.resolveAttribute(r5, r1, r2)
        L_0x003d:
            int r5 = r1.resourceId
            if (r5 == 0) goto L_0x0053
            if (r4 != 0) goto L_0x004e
            android.content.res.Resources r4 = r0.getResources()
            android.content.res.Resources$Theme r4 = r4.newTheme()
            r4.setTo(r3)
        L_0x004e:
            int r1 = r1.resourceId
            r4.applyStyle(r1, r2)
        L_0x0053:
            if (r4 == 0) goto L_0x0063
            a.a.m.d r1 = new a.a.m.d
            r3 = 0
            r1.<init>(r0, r3)
            android.content.res.Resources$Theme r0 = r1.getTheme()
            r0.setTo(r4)
            r0 = r1
        L_0x0063:
            androidx.appcompat.view.menu.h r1 = new androidx.appcompat.view.menu.h
            r1.<init>(r0)
            r1.mo2302a(r6)
            r7.m2533a(r1)
            return r2
    }

    /* renamed from: d */
    private boolean m2582d(int r2, android.view.KeyEvent r3) {
            r1 = this;
            int r0 = r3.getRepeatCount()
            if (r0 != 0) goto L_0x0014
            r0 = 1
            androidx.appcompat.app.h$n r2 = r1.m2616a(r2, r0)
            boolean r0 = r2.f1501o
            if (r0 != 0) goto L_0x0014
            boolean r2 = r1.m2591b(r2, r3)
            return r2
        L_0x0014:
            r2 = 0
            return r2
    }

    /* renamed from: e */
    private boolean m2579e(int r4, android.view.KeyEvent r5) {
            r3 = this;
            a.a.m.b r0 = r3.f1453n
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.h$n r2 = r3.m2616a(r4, r0)
            if (r4 != 0) goto L_0x0043
            androidx.appcompat.widget.a0 r4 = r3.f1450k
            if (r4 == 0) goto L_0x0043
            boolean r4 = r4.mo2141e()
            if (r4 == 0) goto L_0x0043
            android.content.Context r4 = r3.f1442c
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            boolean r4 = r4.hasPermanentMenuKey()
            if (r4 != 0) goto L_0x0043
            androidx.appcompat.widget.a0 r4 = r3.f1450k
            boolean r4 = r4.mo2142d()
            if (r4 != 0) goto L_0x003c
            boolean r4 = r3.f1431I
            if (r4 != 0) goto L_0x0063
            boolean r4 = r3.m2591b(r2, r5)
            if (r4 == 0) goto L_0x0063
            androidx.appcompat.widget.a0 r4 = r3.f1450k
            boolean r4 = r4.mo2147a()
            goto L_0x006a
        L_0x003c:
            androidx.appcompat.widget.a0 r4 = r3.f1450k
            boolean r4 = r4.mo2140f()
            goto L_0x006a
        L_0x0043:
            boolean r4 = r2.f1501o
            if (r4 != 0) goto L_0x0065
            boolean r4 = r2.f1500n
            if (r4 == 0) goto L_0x004c
            goto L_0x0065
        L_0x004c:
            boolean r4 = r2.f1499m
            if (r4 == 0) goto L_0x0063
            boolean r4 = r2.f1504r
            if (r4 == 0) goto L_0x005b
            r2.f1499m = r1
            boolean r4 = r3.m2591b(r2, r5)
            goto L_0x005c
        L_0x005b:
            r4 = 1
        L_0x005c:
            if (r4 == 0) goto L_0x0063
            r3.m2603a(r2, r5)
            r4 = 1
            goto L_0x006a
        L_0x0063:
            r4 = 0
            goto L_0x006a
        L_0x0065:
            boolean r4 = r2.f1501o
            r3.m2602a(r2, r0)
        L_0x006a:
            if (r4 == 0) goto L_0x0083
            android.content.Context r5 = r3.f1442c
            java.lang.String r0 = "audio"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007c
            r5.playSoundEffect(r1)
            goto L_0x0083
        L_0x007c:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r5, r0)
        L_0x0083:
            return r4
    }

    /* renamed from: j */
    private void m2569j(int r3) {
            r2 = this;
            int r0 = r2.f1436N
            r1 = 1
            int r3 = r1 << r3
            r3 = r3 | r0
            r2.f1436N = r3
            boolean r3 = r2.f1435M
            if (r3 != 0) goto L_0x0019
            android.view.Window r3 = r2.f1443d
            android.view.View r3 = r3.getDecorView()
            java.lang.Runnable r0 = r2.f1437O
            p000a.p018g.p029l.C0216r.m3432a(r3, r0)
            r2.f1435M = r1
        L_0x0019:
            return
    }

    /* renamed from: k */
    private int m2568k(int r3) {
            r2 = this;
            java.lang.String r0 = "AppCompatDelegate"
            r1 = 8
            if (r3 != r1) goto L_0x000e
            java.lang.String r3 = "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature."
            android.util.Log.i(r0, r3)
            r3 = 108(0x6c, float:1.51E-43)
            return r3
        L_0x000e:
            r1 = 9
            if (r3 != r1) goto L_0x0019
            java.lang.String r3 = "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature."
            android.util.Log.i(r0, r3)
            r3 = 109(0x6d, float:1.53E-43)
        L_0x0019:
            return r3
    }

    /* renamed from: l */
    private boolean m2566l(int r5) {
            r4 = this;
            android.content.Context r0 = r4.f1442c
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r1 = r0.getConfiguration()
            int r2 = r1.uiMode
            r2 = r2 & 48
            r3 = 2
            if (r5 != r3) goto L_0x0014
            r5 = 32
            goto L_0x0016
        L_0x0014:
            r5 = 16
        L_0x0016:
            if (r2 == r5) goto L_0x0044
            boolean r2 = r4.m2622A()
            if (r2 == 0) goto L_0x0026
            android.content.Context r5 = r4.f1442c
            android.app.Activity r5 = (android.app.Activity) r5
            r5.recreate()
            goto L_0x0042
        L_0x0026:
            android.content.res.Configuration r2 = new android.content.res.Configuration
            r2.<init>(r1)
            android.util.DisplayMetrics r1 = r0.getDisplayMetrics()
            int r3 = r2.uiMode
            r3 = r3 & (-49)
            r5 = r5 | r3
            r2.uiMode = r5
            r0.updateConfiguration(r2, r1)
            int r5 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r5 >= r1) goto L_0x0042
            androidx.appcompat.app.C0466j.m2524a(r0)
        L_0x0042:
            r5 = 1
            return r5
        L_0x0044:
            r5 = 0
            return r5
    }

    /* renamed from: u */
    private void m2557u() {
            r5 = this;
            android.view.ViewGroup r0 = r5.f1460u
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            androidx.appcompat.widget.ContentFrameLayout r0 = (androidx.appcompat.widget.ContentFrameLayout) r0
            android.view.Window r1 = r5.f1443d
            android.view.View r1 = r1.getDecorView()
            int r2 = r1.getPaddingLeft()
            int r3 = r1.getPaddingTop()
            int r4 = r1.getPaddingRight()
            int r1 = r1.getPaddingBottom()
            r0.m2247a(r2, r3, r4, r1)
            android.content.Context r1 = r5.f1442c
            int[] r2 = p000a.p001a.C0009j.AppCompatTheme
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2)
            int r2 = p000a.p001a.C0009j.AppCompatTheme_windowMinWidthMajor
            android.util.TypedValue r3 = r0.getMinWidthMajor()
            r1.getValue(r2, r3)
            int r2 = p000a.p001a.C0009j.AppCompatTheme_windowMinWidthMinor
            android.util.TypedValue r3 = r0.getMinWidthMinor()
            r1.getValue(r2, r3)
            int r2 = p000a.p001a.C0009j.AppCompatTheme_windowFixedWidthMajor
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x004f
            int r2 = p000a.p001a.C0009j.AppCompatTheme_windowFixedWidthMajor
            android.util.TypedValue r3 = r0.getFixedWidthMajor()
            r1.getValue(r2, r3)
        L_0x004f:
            int r2 = p000a.p001a.C0009j.AppCompatTheme_windowFixedWidthMinor
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x0060
            int r2 = p000a.p001a.C0009j.AppCompatTheme_windowFixedWidthMinor
            android.util.TypedValue r3 = r0.getFixedWidthMinor()
            r1.getValue(r2, r3)
        L_0x0060:
            int r2 = p000a.p001a.C0009j.AppCompatTheme_windowFixedHeightMajor
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x0071
            int r2 = p000a.p001a.C0009j.AppCompatTheme_windowFixedHeightMajor
            android.util.TypedValue r3 = r0.getFixedHeightMajor()
            r1.getValue(r2, r3)
        L_0x0071:
            int r2 = p000a.p001a.C0009j.AppCompatTheme_windowFixedHeightMinor
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x0082
            int r2 = p000a.p001a.C0009j.AppCompatTheme_windowFixedHeightMinor
            android.util.TypedValue r3 = r0.getFixedHeightMinor()
            r1.getValue(r2, r3)
        L_0x0082:
            r1.recycle()
            r0.requestLayout()
            return
    }

    /* renamed from: v */
    private android.view.ViewGroup m2556v() {
            r7 = this;
            android.content.Context r0 = r7.f1442c
            int[] r1 = p000a.p001a.C0009j.AppCompatTheme
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            int r1 = p000a.p001a.C0009j.AppCompatTheme_windowActionBar
            boolean r1 = r0.hasValue(r1)
            if (r1 == 0) goto L_0x0199
            int r1 = p000a.p001a.C0009j.AppCompatTheme_windowNoTitle
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            r3 = 1
            if (r1 == 0) goto L_0x001e
            r7.mo2597b(r3)
            goto L_0x002b
        L_0x001e:
            int r1 = p000a.p001a.C0009j.AppCompatTheme_windowActionBar
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 == 0) goto L_0x002b
            r1 = 108(0x6c, float:1.51E-43)
            r7.mo2597b(r1)
        L_0x002b:
            int r1 = p000a.p001a.C0009j.AppCompatTheme_windowActionBarOverlay
            boolean r1 = r0.getBoolean(r1, r2)
            r4 = 109(0x6d, float:1.53E-43)
            if (r1 == 0) goto L_0x0038
            r7.mo2597b(r4)
        L_0x0038:
            int r1 = p000a.p001a.C0009j.AppCompatTheme_windowActionModeOverlay
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 == 0) goto L_0x0045
            r1 = 10
            r7.mo2597b(r1)
        L_0x0045:
            int r1 = p000a.p001a.C0009j.AppCompatTheme_android_windowIsFloating
            boolean r1 = r0.getBoolean(r1, r2)
            r7.f1425C = r1
            r0.recycle()
            android.view.Window r0 = r7.f1443d
            r0.getDecorView()
            android.content.Context r0 = r7.f1442c
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            boolean r1 = r7.f1426D
            r5 = 0
            if (r1 != 0) goto L_0x00d3
            boolean r1 = r7.f1425C
            if (r1 == 0) goto L_0x0072
            int r1 = p000a.p001a.C0006g.abc_dialog_title_material
            android.view.View r0 = r0.inflate(r1, r5)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r7.f1423A = r2
            r7.f1465z = r2
            goto L_0x00fc
        L_0x0072:
            boolean r0 = r7.f1465z
            if (r0 == 0) goto L_0x00d1
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r7.f1442c
            android.content.res.Resources$Theme r1 = r1.getTheme()
            int r6 = p000a.p001a.C0000a.actionBarTheme
            r1.resolveAttribute(r6, r0, r3)
            int r0 = r0.resourceId
            if (r0 == 0) goto L_0x0092
            a.a.m.d r1 = new a.a.m.d
            android.content.Context r3 = r7.f1442c
            r1.<init>(r3, r0)
            goto L_0x0094
        L_0x0092:
            android.content.Context r1 = r7.f1442c
        L_0x0094:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r1)
            int r1 = p000a.p001a.C0006g.abc_screen_toolbar
            android.view.View r0 = r0.inflate(r1, r5)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = p000a.p001a.C0005f.decor_content_parent
            android.view.View r1 = r0.findViewById(r1)
            androidx.appcompat.widget.a0 r1 = (androidx.appcompat.widget.AbstractC0566a0) r1
            r7.f1450k = r1
            androidx.appcompat.widget.a0 r1 = r7.f1450k
            android.view.Window$Callback r3 = r7.m2562p()
            r1.setWindowCallback(r3)
            boolean r1 = r7.f1423A
            if (r1 == 0) goto L_0x00bc
            androidx.appcompat.widget.a0 r1 = r7.f1450k
            r1.mo2146a(r4)
        L_0x00bc:
            boolean r1 = r7.f1463x
            if (r1 == 0) goto L_0x00c6
            androidx.appcompat.widget.a0 r1 = r7.f1450k
            r3 = 2
            r1.mo2146a(r3)
        L_0x00c6:
            boolean r1 = r7.f1464y
            if (r1 == 0) goto L_0x00fc
            androidx.appcompat.widget.a0 r1 = r7.f1450k
            r3 = 5
            r1.mo2146a(r3)
            goto L_0x00fc
        L_0x00d1:
            r0 = r5
            goto L_0x00fc
        L_0x00d3:
            boolean r1 = r7.f1424B
            if (r1 == 0) goto L_0x00da
            int r1 = p000a.p001a.C0006g.abc_screen_simple_overlay_action_mode
            goto L_0x00dc
        L_0x00da:
            int r1 = p000a.p001a.C0006g.abc_screen_simple
        L_0x00dc:
            android.view.View r0 = r0.inflate(r1, r5)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r1 < r3) goto L_0x00f1
            androidx.appcompat.app.h$c r1 = new androidx.appcompat.app.h$c
            r1.<init>(r7)
            p000a.p018g.p029l.C0216r.m3439a(r0, r1)
            goto L_0x00fc
        L_0x00f1:
            r1 = r0
            androidx.appcompat.widget.e0 r1 = (androidx.appcompat.widget.AbstractC0586e0) r1
            androidx.appcompat.app.h$d r3 = new androidx.appcompat.app.h$d
            r3.<init>(r7)
            r1.setOnFitSystemWindowsListener(r3)
        L_0x00fc:
            if (r0 == 0) goto L_0x0153
            androidx.appcompat.widget.a0 r1 = r7.f1450k
            if (r1 != 0) goto L_0x010c
            int r1 = p000a.p001a.C0005f.title
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r7.f1461v = r1
        L_0x010c:
            androidx.appcompat.widget.C0661z0.m1762b(r0)
            int r1 = p000a.p001a.C0005f.action_bar_activity_content
            android.view.View r1 = r0.findViewById(r1)
            androidx.appcompat.widget.ContentFrameLayout r1 = (androidx.appcompat.widget.ContentFrameLayout) r1
            android.view.Window r3 = r7.f1443d
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r3 = r3.findViewById(r4)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            if (r3 == 0) goto L_0x0145
        L_0x0124:
            int r6 = r3.getChildCount()
            if (r6 <= 0) goto L_0x0135
            android.view.View r6 = r3.getChildAt(r2)
            r3.removeViewAt(r2)
            r1.addView(r6)
            goto L_0x0124
        L_0x0135:
            r2 = -1
            r3.setId(r2)
            r1.setId(r4)
            boolean r2 = r3 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L_0x0145
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r3.setForeground(r5)
        L_0x0145:
            android.view.Window r2 = r7.f1443d
            r2.setContentView(r0)
            androidx.appcompat.app.h$e r2 = new androidx.appcompat.app.h$e
            r2.<init>(r7)
            r1.setAttachListener(r2)
            return r0
        L_0x0153:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "AppCompat does not support the current theme features: { windowActionBar: "
            r1.append(r2)
            boolean r2 = r7.f1465z
            r1.append(r2)
            java.lang.String r2 = ", windowActionBarOverlay: "
            r1.append(r2)
            boolean r2 = r7.f1423A
            r1.append(r2)
            java.lang.String r2 = ", android:windowIsFloating: "
            r1.append(r2)
            boolean r2 = r7.f1425C
            r1.append(r2)
            java.lang.String r2 = ", windowActionModeOverlay: "
            r1.append(r2)
            boolean r2 = r7.f1424B
            r1.append(r2)
            java.lang.String r2 = ", windowNoTitle: "
            r1.append(r2)
            boolean r2 = r7.f1426D
            r1.append(r2)
            java.lang.String r2 = " }"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0199:
            r0.recycle()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You need to use a Theme.AppCompat theme (or descendant) with this activity."
            r0.<init>(r1)
            goto L_0x01a5
        L_0x01a4:
            throw r0
        L_0x01a5:
            goto L_0x01a4
    }

    /* renamed from: w */
    private void m2555w() {
            r2 = this;
            androidx.appcompat.app.h$l r0 = r2.f1434L
            if (r0 != 0) goto L_0x0011
            androidx.appcompat.app.h$l r0 = new androidx.appcompat.app.h$l
            android.content.Context r1 = r2.f1442c
            androidx.appcompat.app.m r1 = androidx.appcompat.app.C0474m.m2508a(r1)
            r0.<init>(r2, r1)
            r2.f1434L = r0
        L_0x0011:
            return
    }

    /* renamed from: x */
    private void m2554x() {
            r2 = this;
            boolean r0 = r2.f1459t
            if (r0 != 0) goto L_0x0050
            android.view.ViewGroup r0 = r2.m2556v()
            r2.f1460u = r0
            java.lang.CharSequence r0 = r2.m2563o()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0031
            androidx.appcompat.widget.a0 r1 = r2.f1450k
            if (r1 == 0) goto L_0x001c
            r1.setWindowTitle(r0)
            goto L_0x0031
        L_0x001c:
            androidx.appcompat.app.a r1 = r2.m2559s()
            if (r1 == 0) goto L_0x002a
            androidx.appcompat.app.a r1 = r2.m2559s()
            r1.mo2496a(r0)
            goto L_0x0031
        L_0x002a:
            android.widget.TextView r1 = r2.f1461v
            if (r1 == 0) goto L_0x0031
            r1.setText(r0)
        L_0x0031:
            r2.m2557u()
            android.view.ViewGroup r0 = r2.f1460u
            r2.m2607a(r0)
            r0 = 1
            r2.f1459t = r0
            r0 = 0
            androidx.appcompat.app.h$n r0 = r2.m2616a(r0, r0)
            boolean r1 = r2.f1431I
            if (r1 != 0) goto L_0x0050
            if (r0 == 0) goto L_0x004b
            androidx.appcompat.view.menu.h r0 = r0.f1496j
            if (r0 != 0) goto L_0x0050
        L_0x004b:
            r0 = 108(0x6c, float:1.51E-43)
            r2.m2569j(r0)
        L_0x0050:
            return
    }

    /* renamed from: y */
    private int m2553y() {
            r2 = this;
            int r0 = r2.f1432J
            r1 = -100
            if (r0 == r1) goto L_0x0007
            goto L_0x000b
        L_0x0007:
            int r0 = androidx.appcompat.app.AbstractC0444g.m2623k()
        L_0x000b:
            return r0
    }

    /* renamed from: z */
    private void m2552z() {
            r3 = this;
            r3.m2554x()
            boolean r0 = r3.f1465z
            if (r0 == 0) goto L_0x0033
            androidx.appcompat.app.a r0 = r3.f1447h
            if (r0 == 0) goto L_0x000c
            goto L_0x0033
        L_0x000c:
            android.view.Window$Callback r0 = r3.f1444e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x001e
            androidx.appcompat.app.n r1 = new androidx.appcompat.app.n
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r3.f1423A
            r1.<init>(r0, r2)
        L_0x001b:
            r3.f1447h = r1
            goto L_0x002a
        L_0x001e:
            boolean r1 = r0 instanceof android.app.Dialog
            if (r1 == 0) goto L_0x002a
            androidx.appcompat.app.n r1 = new androidx.appcompat.app.n
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1.<init>(r0)
            goto L_0x001b
        L_0x002a:
            androidx.appcompat.app.a r0 = r3.f1447h
            if (r0 == 0) goto L_0x0033
            boolean r1 = r3.f1438P
            r0.mo2491c(r1)
        L_0x0033:
            return
    }

    /* renamed from: a */
    public p000a.p001a.p006m.AbstractC0029b m2615a(p000a.p001a.p006m.AbstractC0029b.AbstractC0030a r3) {
            r2 = this;
            if (r3 == 0) goto L_0x0032
            a.a.m.b r0 = r2.f1453n
            if (r0 == 0) goto L_0x0009
            r0.mo2472a()
        L_0x0009:
            androidx.appcompat.app.h$j r0 = new androidx.appcompat.app.h$j
            r0.<init>(r2, r3)
            androidx.appcompat.app.a r3 = r2.mo2584d()
            if (r3 == 0) goto L_0x0025
            a.a.m.b r3 = r3.mo2500a(r0)
            r2.f1453n = r3
            a.a.m.b r3 = r2.f1453n
            if (r3 == 0) goto L_0x0025
            androidx.appcompat.app.f r1 = r2.f1446g
            if (r1 == 0) goto L_0x0025
            r1.mo2528a(r3)
        L_0x0025:
            a.a.m.b r3 = r2.f1453n
            if (r3 != 0) goto L_0x002f
            a.a.m.b r3 = r2.m2595b(r0)
            r2.f1453n = r3
        L_0x002f:
            a.a.m.b r3 = r2.f1453n
            return r3
        L_0x0032:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "ActionMode callback can not be null."
            r3.<init>(r0)
            throw r3
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: a */
    public <T extends android.view.View> T mo2619a(int r2) {
            r1 = this;
            r1.m2554x()
            android.view.Window r0 = r1.f1443d
            android.view.View r2 = r0.findViewById(r2)
            return r2
    }

    /* renamed from: a */
    public android.view.View m2608a(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
            r11 = this;
            androidx.appcompat.app.AppCompatViewInflater r0 = r11.f1441S
            r1 = 0
            if (r0 != 0) goto L_0x0060
            android.content.Context r0 = r11.f1442c
            int[] r2 = p000a.p001a.C0009j.AppCompatTheme
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            int r2 = p000a.p001a.C0009j.AppCompatTheme_viewInflaterClass
            java.lang.String r0 = r0.getString(r2)
            if (r0 == 0) goto L_0x0059
            java.lang.Class<androidx.appcompat.app.AppCompatViewInflater> r2 = androidx.appcompat.app.AppCompatViewInflater.class
            java.lang.String r2 = r2.getName()
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0022
            goto L_0x0059
        L_0x0022:
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch: all -> 0x0037
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: all -> 0x0037
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch: all -> 0x0037
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: all -> 0x0037
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: all -> 0x0037
            androidx.appcompat.app.AppCompatViewInflater r2 = (androidx.appcompat.app.AppCompatViewInflater) r2     // Catch: all -> 0x0037
            r11.f1441S = r2     // Catch: all -> 0x0037
            goto L_0x0060
        L_0x0037:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to instantiate custom view inflater "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ". Falling back to default."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "AppCompatDelegate"
            android.util.Log.i(r3, r0, r2)
            androidx.appcompat.app.AppCompatViewInflater r0 = new androidx.appcompat.app.AppCompatViewInflater
            r0.<init>()
            goto L_0x005e
        L_0x0059:
            androidx.appcompat.app.AppCompatViewInflater r0 = new androidx.appcompat.app.AppCompatViewInflater
            r0.<init>()
        L_0x005e:
            r11.f1441S = r0
        L_0x0060:
            boolean r0 = androidx.appcompat.app.LayoutInflater$Factory2C0445h.f1420T
            if (r0 == 0) goto L_0x007e
            boolean r0 = r15 instanceof org.xmlpull.v1.XmlPullParser
            r2 = 1
            if (r0 == 0) goto L_0x0074
            r0 = r15
            org.xmlpull.v1.XmlPullParser r0 = (org.xmlpull.v1.XmlPullParser) r0
            int r0 = r0.getDepth()
            if (r0 <= r2) goto L_0x007c
            r1 = 1
            goto L_0x007c
        L_0x0074:
            r0 = r12
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            boolean r0 = r11.m2606a(r0)
            r1 = r0
        L_0x007c:
            r7 = r1
            goto L_0x007f
        L_0x007e:
            r7 = 0
        L_0x007f:
            androidx.appcompat.app.AppCompatViewInflater r2 = r11.f1441S
            boolean r8 = androidx.appcompat.app.LayoutInflater$Factory2C0445h.f1420T
            r9 = 1
            boolean r10 = androidx.appcompat.widget.C0659y0.m1791b()
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            android.view.View r12 = r2.createView(r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
    }

    /* renamed from: a */
    protected androidx.appcompat.app.LayoutInflater$Factory2C0445h.C0462n m2616a(int r4, boolean r5) {
            r3 = this;
            androidx.appcompat.app.h$n[] r5 = r3.f1428F
            if (r5 == 0) goto L_0x0007
            int r0 = r5.length
            if (r0 > r4) goto L_0x0015
        L_0x0007:
            int r0 = r4 + 1
            androidx.appcompat.app.h$n[] r0 = new androidx.appcompat.app.LayoutInflater$Factory2C0445h.C0462n[r0]
            if (r5 == 0) goto L_0x0012
            int r1 = r5.length
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r2, r1)
        L_0x0012:
            r3.f1428F = r0
            r5 = r0
        L_0x0015:
            r0 = r5[r4]
            if (r0 != 0) goto L_0x0020
            androidx.appcompat.app.h$n r0 = new androidx.appcompat.app.h$n
            r0.<init>(r4)
            r5[r4] = r0
        L_0x0020:
            return r0
    }

    /* renamed from: a */
    androidx.appcompat.app.LayoutInflater$Factory2C0445h.C0462n m2611a(android.view.Menu r6) {
            r5 = this;
            androidx.appcompat.app.h$n[] r0 = r5.f1428F
            r1 = 0
            if (r0 == 0) goto L_0x0007
            int r2 = r0.length
            goto L_0x0008
        L_0x0007:
            r2 = 0
        L_0x0008:
            if (r1 >= r2) goto L_0x0016
            r3 = r0[r1]
            if (r3 == 0) goto L_0x0013
            androidx.appcompat.view.menu.h r4 = r3.f1496j
            if (r4 != r6) goto L_0x0013
            return r3
        L_0x0013:
            int r1 = r1 + 1
            goto L_0x0008
        L_0x0016:
            r6 = 0
            return r6
    }

    /* renamed from: a */
    void m2617a(int r3, androidx.appcompat.app.LayoutInflater$Factory2C0445h.C0462n r4, android.view.Menu r5) {
            r2 = this;
            if (r5 != 0) goto L_0x0011
            if (r4 != 0) goto L_0x000d
            if (r3 < 0) goto L_0x000d
            androidx.appcompat.app.h$n[] r0 = r2.f1428F
            int r1 = r0.length
            if (r3 >= r1) goto L_0x000d
            r4 = r0[r3]
        L_0x000d:
            if (r4 == 0) goto L_0x0011
            androidx.appcompat.view.menu.h r5 = r4.f1496j
        L_0x0011:
            if (r4 == 0) goto L_0x0018
            boolean r4 = r4.f1501o
            if (r4 != 0) goto L_0x0018
            return
        L_0x0018:
            boolean r4 = r2.f1431I
            if (r4 != 0) goto L_0x0021
            android.view.Window$Callback r4 = r2.f1444e
            r4.onPanelClosed(r3, r5)
        L_0x0021:
            return
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: a */
    public void mo2614a(android.content.res.Configuration r2) {
            r1 = this;
            boolean r0 = r1.f1465z
            if (r0 == 0) goto L_0x0011
            boolean r0 = r1.f1459t
            if (r0 == 0) goto L_0x0011
            androidx.appcompat.app.a r0 = r1.mo2584d()
            if (r0 == 0) goto L_0x0011
            r0.mo2499a(r2)
        L_0x0011:
            androidx.appcompat.widget.j r2 = androidx.appcompat.widget.C0606j.m2013a()
            android.content.Context r0 = r1.f1442c
            r2.m2010a(r0)
            r1.mo2620a()
            return
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: a */
    public void mo2613a(android.os.Bundle r3) {
            r2 = this;
            android.view.Window$Callback r0 = r2.f1444e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x001e
            r1 = 0
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: IllegalArgumentException -> 0x000e
            java.lang.String r1 = androidx.core.app.C0694d.m1627b(r0)     // Catch: IllegalArgumentException -> 0x000e
            goto L_0x000f
        L_0x000e:
        L_0x000f:
            if (r1 == 0) goto L_0x001e
            androidx.appcompat.app.a r0 = r2.m2559s()
            r1 = 1
            if (r0 != 0) goto L_0x001b
            r2.f1438P = r1
            goto L_0x001e
        L_0x001b:
            r0.mo2491c(r1)
        L_0x001e:
            if (r3 == 0) goto L_0x002e
            int r0 = r2.f1432J
            r1 = -100
            if (r0 != r1) goto L_0x002e
            java.lang.String r0 = "appcompat:local_night_mode"
            int r3 = r3.getInt(r0, r1)
            r2.f1432J = r3
        L_0x002e:
            return
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: a */
    public void mo2610a(android.view.View r3) {
            r2 = this;
            r2.m2554x()
            android.view.ViewGroup r0 = r2.f1460u
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViews()
            r0.addView(r3)
            android.view.Window$Callback r3 = r2.f1444e
            r3.onContentChanged()
            return
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: a */
    public void mo2609a(android.view.View r3, android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            r2.m2554x()
            android.view.ViewGroup r0 = r2.f1460u
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.addView(r3, r4)
            android.view.Window$Callback r3 = r2.f1444e
            r3.onContentChanged()
            return
    }

    /* renamed from: a */
    void m2607a(android.view.ViewGroup r1) {
            r0 = this;
            return
    }

    /* renamed from: a */
    void m2602a(androidx.appcompat.app.LayoutInflater$Factory2C0445h.C0462n r4, boolean r5) {
            r3 = this;
            if (r5 == 0) goto L_0x0016
            int r0 = r4.f1487a
            if (r0 != 0) goto L_0x0016
            androidx.appcompat.widget.a0 r0 = r3.f1450k
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.mo2142d()
            if (r0 == 0) goto L_0x0016
            androidx.appcompat.view.menu.h r4 = r4.f1496j
            r3.m2590b(r4)
            return
        L_0x0016:
            android.content.Context r0 = r3.f1442c
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            r1 = 0
            if (r0 == 0) goto L_0x0035
            boolean r2 = r4.f1501o
            if (r2 == 0) goto L_0x0035
            android.view.ViewGroup r2 = r4.f1493g
            if (r2 == 0) goto L_0x0035
            r0.removeView(r2)
            if (r5 == 0) goto L_0x0035
            int r5 = r4.f1487a
            r3.m2617a(r5, r4, r1)
        L_0x0035:
            r5 = 0
            r4.f1499m = r5
            r4.f1500n = r5
            r4.f1501o = r5
            r4.f1494h = r1
            r5 = 1
            r4.f1503q = r5
            androidx.appcompat.app.h$n r5 = r3.f1429G
            if (r5 != r4) goto L_0x0047
            r3.f1429G = r1
        L_0x0047:
            return
    }

    @Override // androidx.appcompat.view.menu.C0496h.AbstractC0497a
    /* renamed from: a */
    public void mo65a(androidx.appcompat.view.menu.C0496h r2) {
            r1 = this;
            r0 = 1
            r1.m2601a(r2, r0)
            return
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: a */
    public void mo2600a(androidx.appcompat.widget.Toolbar r4) {
            r3 = this;
            android.view.Window$Callback r0 = r3.f1444e
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            androidx.appcompat.app.a r0 = r3.mo2584d()
            boolean r1 = r0 instanceof androidx.appcompat.app.C0476n
            if (r1 != 0) goto L_0x003e
            r1 = 0
            r3.f1448i = r1
            if (r0 == 0) goto L_0x0017
            r0.mo2516j()
        L_0x0017:
            if (r4 == 0) goto L_0x0031
            androidx.appcompat.app.k r0 = new androidx.appcompat.app.k
            android.view.Window$Callback r1 = r3.f1444e
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.CharSequence r1 = r1.getTitle()
            android.view.Window$Callback r2 = r3.f1445f
            r0.<init>(r4, r1, r2)
            r3.f1447h = r0
            android.view.Window r4 = r3.f1443d
            android.view.Window$Callback r0 = r0.m2514l()
            goto L_0x0037
        L_0x0031:
            r3.f1447h = r1
            android.view.Window r4 = r3.f1443d
            android.view.Window$Callback r0 = r3.f1445f
        L_0x0037:
            r4.setCallback(r0)
            r3.mo2578f()
            return
        L_0x003e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead."
            r4.<init>(r0)
            throw r4
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: a */
    public final void mo2599a(java.lang.CharSequence r2) {
            r1 = this;
            r1.f1449j = r2
            androidx.appcompat.widget.a0 r0 = r1.f1450k
            if (r0 == 0) goto L_0x000a
            r0.setWindowTitle(r2)
            goto L_0x001f
        L_0x000a:
            androidx.appcompat.app.a r0 = r1.m2559s()
            if (r0 == 0) goto L_0x0018
            androidx.appcompat.app.a r0 = r1.m2559s()
            r0.mo2496a(r2)
            goto L_0x001f
        L_0x0018:
            android.widget.TextView r0 = r1.f1461v
            if (r0 == 0) goto L_0x001f
            r0.setText(r2)
        L_0x001f:
            return
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: a */
    public boolean mo2620a() {
            r3 = this;
            int r0 = r3.m2553y()
            int r1 = r3.m2577f(r0)
            r2 = -1
            if (r1 == r2) goto L_0x0010
            boolean r1 = r3.m2566l(r1)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            if (r0 != 0) goto L_0x001b
            r3.m2555w()
            androidx.appcompat.app.h$l r0 = r3.f1434L
            r0.m2537d()
        L_0x001b:
            r0 = 1
            r3.f1433K = r0
            return r1
    }

    /* renamed from: a */
    boolean m2618a(int r4, android.view.KeyEvent r5) {
            r3 = this;
            r0 = 4
            r1 = 1
            r2 = 0
            if (r4 == r0) goto L_0x000e
            r0 = 82
            if (r4 == r0) goto L_0x000a
            goto L_0x001a
        L_0x000a:
            r3.m2582d(r2, r5)
            return r1
        L_0x000e:
            int r4 = r5.getFlags()
            r4 = r4 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            r3.f1430H = r1
        L_0x001a:
            return r2
    }

    /* renamed from: a */
    boolean m2612a(android.view.KeyEvent r4) {
            r3 = this;
            android.view.Window$Callback r0 = r3.f1444e
            boolean r1 = r0 instanceof p000a.p018g.p029l.C0201d.AbstractC0202a
            r2 = 1
            if (r1 != 0) goto L_0x000b
            boolean r0 = r0 instanceof androidx.appcompat.app.DialogC0464i
            if (r0 == 0) goto L_0x001a
        L_0x000b:
            android.view.Window r0 = r3.f1443d
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001a
            boolean r0 = p000a.p018g.p029l.C0201d.m3483a(r0, r4)
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            int r0 = r4.getKeyCode()
            r1 = 82
            if (r0 != r1) goto L_0x002b
            android.view.Window$Callback r0 = r3.f1444e
            boolean r0 = r0.dispatchKeyEvent(r4)
            if (r0 == 0) goto L_0x002b
            return r2
        L_0x002b:
            int r0 = r4.getKeyCode()
            int r1 = r4.getAction()
            if (r1 != 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r2 = 0
        L_0x0037:
            if (r2 == 0) goto L_0x003e
            boolean r4 = r3.m2618a(r0, r4)
            goto L_0x0042
        L_0x003e:
            boolean r4 = r3.m2587c(r0, r4)
        L_0x0042:
            return r4
    }

    @Override // androidx.appcompat.view.menu.C0496h.AbstractC0497a
    /* renamed from: a */
    public boolean mo64a(androidx.appcompat.view.menu.C0496h r3, android.view.MenuItem r4) {
            r2 = this;
            android.view.Window$Callback r0 = r2.m2562p()
            if (r0 == 0) goto L_0x001b
            boolean r1 = r2.f1431I
            if (r1 != 0) goto L_0x001b
            androidx.appcompat.view.menu.h r3 = r3.mo2297m()
            androidx.appcompat.app.h$n r3 = r2.m2611a(r3)
            if (r3 == 0) goto L_0x001b
            int r3 = r3.f1487a
            boolean r3 = r0.onMenuItemSelected(r3, r4)
            return r3
        L_0x001b:
            r3 = 0
            return r3
    }

    /* renamed from: b */
    p000a.p001a.p006m.AbstractC0029b m2595b(p000a.p001a.p006m.AbstractC0029b.AbstractC0030a r8) {
            r7 = this;
            r7.m2565m()
            a.a.m.b r0 = r7.f1453n
            if (r0 == 0) goto L_0x000a
            r0.mo2472a()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.LayoutInflater$Factory2C0445h.C0456j
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.h$j r0 = new androidx.appcompat.app.h$j
            r0.<init>(r7, r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.f r0 = r7.f1446g
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.f1431I
            if (r2 != 0) goto L_0x0022
            a.a.m.b r0 = r0.mo2529a(r8)     // Catch: AbstractMethodError -> 0x0022
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f1453n = r0
            goto L_0x0165
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f1454o
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d6
            boolean r0 = r7.f1425C
            if (r0 == 0) goto L_0x00b7
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f1442c
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = p000a.p001a.C0000a.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f1442c
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            a.a.m.d r4 = new a.a.m.d
            android.content.Context r6 = r7.f1442c
            r4.<init>(r6, r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f1442c
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f1454o = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = p000a.p001a.C0000a.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.f1455p = r5
            android.widget.PopupWindow r5 = r7.f1455p
            r6 = 2
            androidx.core.widget.C0719h.m1500a(r5, r6)
            android.widget.PopupWindow r5 = r7.f1455p
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f1454o
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f1455p
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = p000a.p001a.C0000a.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f1454o
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f1455p
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.h$f r0 = new androidx.appcompat.app.h$f
            r0.<init>(r7)
            r7.f1456q = r0
            goto L_0x00d6
        L_0x00b7:
            android.view.ViewGroup r0 = r7.f1460u
            int r4 = p000a.p001a.C0005f.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d6
            android.content.Context r4 = r7.m2564n()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.m2156a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f1454o = r0
        L_0x00d6:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f1454o
            if (r0 == 0) goto L_0x0165
            r7.m2565m()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f1454o
            r0.m2286c()
            a.a.m.e r0 = new a.a.m.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f1454o
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f1454o
            android.widget.PopupWindow r6 = r7.f1455p
            if (r6 != 0) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            r3 = 0
        L_0x00f2:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo2464c()
            boolean r8 = r8.mo2542b(r0, r3)
            if (r8 == 0) goto L_0x0163
            r0.mo2460i()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1454o
            r8.m2288a(r0)
            r7.f1453n = r0
            boolean r8 = r7.m2558t()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012d
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1454o
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1454o
            a.g.l.v r8 = p000a.p018g.p029l.C0216r.m3445a(r8)
            r8.m3372a(r0)
            r7.f1457r = r8
            a.g.l.v r8 = r7.f1457r
            androidx.appcompat.app.h$g r0 = new androidx.appcompat.app.h$g
            r0.<init>(r7)
            r8.m3370a(r0)
            goto L_0x0153
        L_0x012d:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1454o
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1454o
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1454o
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1454o
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0153
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1454o
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            p000a.p018g.p029l.C0216r.m3449B(r8)
        L_0x0153:
            android.widget.PopupWindow r8 = r7.f1455p
            if (r8 == 0) goto L_0x0165
            android.view.Window r8 = r7.f1443d
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f1456q
            r8.post(r0)
            goto L_0x0165
        L_0x0163:
            r7.f1453n = r1
        L_0x0165:
            a.a.m.b r8 = r7.f1453n
            if (r8 == 0) goto L_0x0170
            androidx.appcompat.app.f r0 = r7.f1446g
            if (r0 == 0) goto L_0x0170
            r0.mo2528a(r8)
        L_0x0170:
            a.a.m.b r8 = r7.f1453n
            return r8
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: b */
    public final androidx.appcompat.app.C0432b.AbstractC0434b mo2598b() {
            r1 = this;
            androidx.appcompat.app.h$h r0 = new androidx.appcompat.app.h$h
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: b */
    public void mo2594b(android.os.Bundle r1) {
            r0 = this;
            r0.m2554x()
            return
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: b */
    public void mo2593b(android.view.View r3, android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            r2.m2554x()
            android.view.ViewGroup r0 = r2.f1460u
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViews()
            r0.addView(r3, r4)
            android.view.Window$Callback r3 = r2.f1444e
            r3.onContentChanged()
            return
    }

    /* renamed from: b */
    void m2590b(androidx.appcompat.view.menu.C0496h r3) {
            r2 = this;
            boolean r0 = r2.f1427E
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r2.f1427E = r0
            androidx.appcompat.widget.a0 r0 = r2.f1450k
            r0.mo2139g()
            android.view.Window$Callback r0 = r2.m2562p()
            if (r0 == 0) goto L_0x001c
            boolean r1 = r2.f1431I
            if (r1 != 0) goto L_0x001c
            r1 = 108(0x6c, float:1.51E-43)
            r0.onPanelClosed(r1, r3)
        L_0x001c:
            r3 = 0
            r2.f1427E = r3
            return
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: b */
    public boolean mo2597b(int r5) {
            r4 = this;
            int r5 = r4.m2568k(r5)
            boolean r0 = r4.f1426D
            r1 = 0
            r2 = 108(0x6c, float:1.51E-43)
            if (r0 == 0) goto L_0x000e
            if (r5 != r2) goto L_0x000e
            return r1
        L_0x000e:
            boolean r0 = r4.f1465z
            r3 = 1
            if (r0 == 0) goto L_0x0017
            if (r5 != r3) goto L_0x0017
            r4.f1465z = r1
        L_0x0017:
            if (r5 == r3) goto L_0x004e
            r0 = 2
            if (r5 == r0) goto L_0x0048
            r0 = 5
            if (r5 == r0) goto L_0x0042
            r0 = 10
            if (r5 == r0) goto L_0x003c
            if (r5 == r2) goto L_0x0036
            r0 = 109(0x6d, float:1.53E-43)
            if (r5 == r0) goto L_0x0030
            android.view.Window r0 = r4.f1443d
            boolean r5 = r0.requestFeature(r5)
            return r5
        L_0x0030:
            r4.m2621B()
            r4.f1423A = r3
            return r3
        L_0x0036:
            r4.m2621B()
            r4.f1465z = r3
            return r3
        L_0x003c:
            r4.m2621B()
            r4.f1424B = r3
            return r3
        L_0x0042:
            r4.m2621B()
            r4.f1464y = r3
            return r3
        L_0x0048:
            r4.m2621B()
            r4.f1463x = r3
            return r3
        L_0x004e:
            r4.m2621B()
            r4.f1426D = r3
            return r3
    }

    /* renamed from: b */
    boolean m2596b(int r4, android.view.KeyEvent r5) {
            r3 = this;
            androidx.appcompat.app.a r0 = r3.mo2584d()
            r1 = 1
            if (r0 == 0) goto L_0x000e
            boolean r4 = r0.mo2501a(r4, r5)
            if (r4 == 0) goto L_0x000e
            return r1
        L_0x000e:
            androidx.appcompat.app.h$n r4 = r3.f1429G
            if (r4 == 0) goto L_0x0023
            int r0 = r5.getKeyCode()
            boolean r4 = r3.m2604a(r4, r0, r5, r1)
            if (r4 == 0) goto L_0x0023
            androidx.appcompat.app.h$n r4 = r3.f1429G
            if (r4 == 0) goto L_0x0022
            r4.f1500n = r1
        L_0x0022:
            return r1
        L_0x0023:
            androidx.appcompat.app.h$n r4 = r3.f1429G
            r0 = 0
            if (r4 != 0) goto L_0x003c
            androidx.appcompat.app.h$n r4 = r3.m2616a(r0, r1)
            r3.m2591b(r4, r5)
            int r2 = r5.getKeyCode()
            boolean r5 = r3.m2604a(r4, r2, r5, r1)
            r4.f1499m = r0
            if (r5 == 0) goto L_0x003c
            return r1
        L_0x003c:
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: c */
    public android.view.MenuInflater mo2589c() {
            r2 = this;
            android.view.MenuInflater r0 = r2.f1448i
            if (r0 != 0) goto L_0x0019
            r2.m2552z()
            a.a.m.g r0 = new a.a.m.g
            androidx.appcompat.app.a r1 = r2.f1447h
            if (r1 == 0) goto L_0x0012
            android.content.Context r1 = r1.mo2484h()
            goto L_0x0014
        L_0x0012:
            android.content.Context r1 = r2.f1442c
        L_0x0014:
            r0.<init>(r1)
            r2.f1448i = r0
        L_0x0019:
            android.view.MenuInflater r0 = r2.f1448i
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: c */
    public void mo2588c(int r3) {
            r2 = this;
            r2.m2554x()
            android.view.ViewGroup r0 = r2.f1460u
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViews()
            android.content.Context r1 = r2.f1442c
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r1.inflate(r3, r0)
            android.view.Window$Callback r3 = r2.f1444e
            r3.onContentChanged()
            return
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: c */
    public void mo2586c(android.os.Bundle r3) {
            r2 = this;
            int r0 = r2.f1432J
            r1 = -100
            if (r0 == r1) goto L_0x000b
            java.lang.String r1 = "appcompat:local_night_mode"
            r3.putInt(r1, r0)
        L_0x000b:
            return
    }

    /* renamed from: c */
    boolean m2587c(int r4, android.view.KeyEvent r5) {
            r3 = this;
            r0 = 4
            r1 = 1
            r2 = 0
            if (r4 == r0) goto L_0x000e
            r0 = 82
            if (r4 == r0) goto L_0x000a
            goto L_0x0029
        L_0x000a:
            r3.m2579e(r2, r5)
            return r1
        L_0x000e:
            boolean r4 = r3.f1430H
            r3.f1430H = r2
            androidx.appcompat.app.h$n r5 = r3.m2616a(r2, r2)
            if (r5 == 0) goto L_0x0022
            boolean r0 = r5.f1501o
            if (r0 == 0) goto L_0x0022
            if (r4 != 0) goto L_0x0021
            r3.m2602a(r5, r1)
        L_0x0021:
            return r1
        L_0x0022:
            boolean r4 = r3.m2560r()
            if (r4 == 0) goto L_0x0029
            return r1
        L_0x0029:
            return r2
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: d */
    public androidx.appcompat.app.AbstractC0428a mo2584d() {
            r1 = this;
            r1.m2552z()
            androidx.appcompat.app.a r0 = r1.f1447h
            return r0
    }

    /* renamed from: d */
    void m2583d(int r2) {
            r1 = this;
            r0 = 1
            androidx.appcompat.app.h$n r2 = r1.m2616a(r2, r0)
            r1.m2602a(r2, r0)
            return
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: e */
    public void mo2581e() {
            r2 = this;
            android.content.Context r0 = r2.f1442c
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.LayoutInflater$Factory r1 = r0.getFactory()
            if (r1 != 0) goto L_0x0010
            p000a.p018g.p029l.C0203e.m3481b(r0, r2)
            goto L_0x001f
        L_0x0010:
            android.view.LayoutInflater$Factory2 r0 = r0.getFactory2()
            boolean r0 = r0 instanceof androidx.appcompat.app.LayoutInflater$Factory2C0445h
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = "AppCompatDelegate"
            java.lang.String r1 = "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's"
            android.util.Log.i(r0, r1)
        L_0x001f:
            return
    }

    /* renamed from: e */
    void m2580e(int r5) {
            r4 = this;
            r0 = 1
            androidx.appcompat.app.h$n r1 = r4.m2616a(r5, r0)
            androidx.appcompat.view.menu.h r2 = r1.f1496j
            if (r2 == 0) goto L_0x0025
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            androidx.appcompat.view.menu.h r3 = r1.f1496j
            r3.m2395c(r2)
            int r3 = r2.size()
            if (r3 <= 0) goto L_0x001b
            r1.f1505s = r2
        L_0x001b:
            androidx.appcompat.view.menu.h r2 = r1.f1496j
            r2.m2373s()
            androidx.appcompat.view.menu.h r2 = r1.f1496j
            r2.clear()
        L_0x0025:
            r1.f1504r = r0
            r1.f1503q = r0
            r0 = 108(0x6c, float:1.51E-43)
            if (r5 == r0) goto L_0x002f
            if (r5 != 0) goto L_0x0040
        L_0x002f:
            androidx.appcompat.widget.a0 r5 = r4.f1450k
            if (r5 == 0) goto L_0x0040
            r5 = 0
            androidx.appcompat.app.h$n r0 = r4.m2616a(r5, r5)
            if (r0 == 0) goto L_0x0040
            r0.f1499m = r5
            r5 = 0
            r4.m2591b(r0, r5)
        L_0x0040:
            return
    }

    /* renamed from: f */
    int m2577f(int r3) {
            r2 = this;
            r0 = -100
            r1 = -1
            if (r3 == r0) goto L_0x0029
            if (r3 == 0) goto L_0x0008
            return r3
        L_0x0008:
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r3 < r0) goto L_0x001f
            android.content.Context r3 = r2.f1442c
            java.lang.Class<android.app.UiModeManager> r0 = android.app.UiModeManager.class
            java.lang.Object r3 = r3.getSystemService(r0)
            android.app.UiModeManager r3 = (android.app.UiModeManager) r3
            int r3 = r3.getNightMode()
            if (r3 != 0) goto L_0x001f
            return r1
        L_0x001f:
            r2.m2555w()
            androidx.appcompat.app.h$l r3 = r2.f1434L
            int r3 = r3.m2538c()
            return r3
        L_0x0029:
            return r1
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: f */
    public void mo2578f() {
            r1 = this;
            androidx.appcompat.app.a r0 = r1.mo2584d()
            if (r0 == 0) goto L_0x000d
            boolean r0 = r0.mo2517i()
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            r0 = 0
            r1.m2569j(r0)
            return
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: g */
    public void mo2576g() {
            r2 = this;
            boolean r0 = r2.f1435M
            if (r0 == 0) goto L_0x000f
            android.view.Window r0 = r2.f1443d
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r2.f1437O
            r0.removeCallbacks(r1)
        L_0x000f:
            r0 = 1
            r2.f1431I = r0
            androidx.appcompat.app.a r0 = r2.f1447h
            if (r0 == 0) goto L_0x0019
            r0.mo2516j()
        L_0x0019:
            androidx.appcompat.app.h$l r0 = r2.f1434L
            if (r0 == 0) goto L_0x0020
            r0.m2540a()
        L_0x0020:
            return
    }

    /* renamed from: g */
    void m2575g(int r2) {
            r1 = this;
            r0 = 108(0x6c, float:1.51E-43)
            if (r2 != r0) goto L_0x000e
            androidx.appcompat.app.a r2 = r1.mo2584d()
            if (r2 == 0) goto L_0x000e
            r0 = 1
            r2.mo2492b(r0)
        L_0x000e:
            return
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: h */
    public void mo2574h() {
            r2 = this;
            androidx.appcompat.app.a r0 = r2.mo2584d()
            if (r0 == 0) goto L_0x000a
            r1 = 1
            r0.mo2490d(r1)
        L_0x000a:
            return
    }

    /* renamed from: h */
    void m2573h(int r3) {
            r2 = this;
            r0 = 0
            r1 = 108(0x6c, float:1.51E-43)
            if (r3 != r1) goto L_0x000f
            androidx.appcompat.app.a r3 = r2.mo2584d()
            if (r3 == 0) goto L_0x001d
            r3.mo2492b(r0)
            goto L_0x001d
        L_0x000f:
            if (r3 != 0) goto L_0x001d
            r1 = 1
            androidx.appcompat.app.h$n r3 = r2.m2616a(r3, r1)
            boolean r1 = r3.f1501o
            if (r1 == 0) goto L_0x001d
            r2.m2602a(r3, r0)
        L_0x001d:
            return
    }

    /* renamed from: i */
    int m2571i(int r8) {
            r7 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f1454o
            r1 = 0
            if (r0 == 0) goto L_0x00a7
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x00a7
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f1454o
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            androidx.appcompat.widget.ActionBarContextView r2 = r7.f1454o
            boolean r2 = r2.isShown()
            r3 = 1
            if (r2 == 0) goto L_0x0095
            android.graphics.Rect r2 = r7.f1439Q
            if (r2 != 0) goto L_0x0030
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r7.f1439Q = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r7.f1440R = r2
        L_0x0030:
            android.graphics.Rect r2 = r7.f1439Q
            android.graphics.Rect r4 = r7.f1440R
            r2.set(r1, r8, r1, r1)
            android.view.ViewGroup r5 = r7.f1460u
            androidx.appcompat.widget.C0661z0.m1763a(r5, r2, r4)
            int r2 = r4.top
            if (r2 != 0) goto L_0x0042
            r2 = r8
            goto L_0x0043
        L_0x0042:
            r2 = 0
        L_0x0043:
            int r4 = r0.topMargin
            if (r4 == r2) goto L_0x0086
            r0.topMargin = r8
            android.view.View r2 = r7.f1462w
            if (r2 != 0) goto L_0x0075
            android.view.View r2 = new android.view.View
            android.content.Context r4 = r7.f1442c
            r2.<init>(r4)
            r7.f1462w = r2
            android.view.View r2 = r7.f1462w
            android.content.Context r4 = r7.f1442c
            android.content.res.Resources r4 = r4.getResources()
            int r5 = p000a.p001a.C0002c.abc_input_method_navigation_guard
            int r4 = r4.getColor(r5)
            r2.setBackgroundColor(r4)
            android.view.ViewGroup r2 = r7.f1460u
            android.view.View r4 = r7.f1462w
            android.view.ViewGroup$LayoutParams r5 = new android.view.ViewGroup$LayoutParams
            r6 = -1
            r5.<init>(r6, r8)
            r2.addView(r4, r6, r5)
            goto L_0x0084
        L_0x0075:
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            int r4 = r2.height
            if (r4 == r8) goto L_0x0084
            r2.height = r8
            android.view.View r4 = r7.f1462w
            r4.setLayoutParams(r2)
        L_0x0084:
            r2 = 1
            goto L_0x0087
        L_0x0086:
            r2 = 0
        L_0x0087:
            android.view.View r4 = r7.f1462w
            if (r4 == 0) goto L_0x008c
            goto L_0x008d
        L_0x008c:
            r3 = 0
        L_0x008d:
            boolean r4 = r7.f1424B
            if (r4 != 0) goto L_0x009f
            if (r3 == 0) goto L_0x009f
            r8 = 0
            goto L_0x009f
        L_0x0095:
            int r2 = r0.topMargin
            if (r2 == 0) goto L_0x009d
            r0.topMargin = r1
            r2 = 1
            goto L_0x009e
        L_0x009d:
            r2 = 0
        L_0x009e:
            r3 = 0
        L_0x009f:
            if (r2 == 0) goto L_0x00a8
            androidx.appcompat.widget.ActionBarContextView r2 = r7.f1454o
            r2.setLayoutParams(r0)
            goto L_0x00a8
        L_0x00a7:
            r3 = 0
        L_0x00a8:
            android.view.View r0 = r7.f1462w
            if (r0 == 0) goto L_0x00b4
            if (r3 == 0) goto L_0x00af
            goto L_0x00b1
        L_0x00af:
            r1 = 8
        L_0x00b1:
            r0.setVisibility(r1)
        L_0x00b4:
            return r8
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: i */
    public void mo2572i() {
            r0 = this;
            r0.mo2620a()
            return
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: j */
    public void mo2570j() {
            r2 = this;
            androidx.appcompat.app.a r0 = r2.mo2584d()
            if (r0 == 0) goto L_0x000a
            r1 = 0
            r0.mo2490d(r1)
        L_0x000a:
            androidx.appcompat.app.h$l r0 = r2.f1434L
            if (r0 == 0) goto L_0x0011
            r0.m2540a()
        L_0x0011:
            return
    }

    /* renamed from: l */
    void m2567l() {
            r2 = this;
            androidx.appcompat.widget.a0 r0 = r2.f1450k
            if (r0 == 0) goto L_0x0007
            r0.mo2139g()
        L_0x0007:
            android.widget.PopupWindow r0 = r2.f1455p
            if (r0 == 0) goto L_0x0026
            android.view.Window r0 = r2.f1443d
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r2.f1456q
            r0.removeCallbacks(r1)
            android.widget.PopupWindow r0 = r2.f1455p
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0023
            android.widget.PopupWindow r0 = r2.f1455p     // Catch: IllegalArgumentException -> 0x0023
            r0.dismiss()     // Catch: IllegalArgumentException -> 0x0023
        L_0x0023:
            r0 = 0
            r2.f1455p = r0
        L_0x0026:
            r2.m2565m()
            r0 = 0
            androidx.appcompat.app.h$n r0 = r2.m2616a(r0, r0)
            if (r0 == 0) goto L_0x0037
            androidx.appcompat.view.menu.h r0 = r0.f1496j
            if (r0 == 0) goto L_0x0037
            r0.close()
        L_0x0037:
            return
    }

    /* renamed from: m */
    void m2565m() {
            r1 = this;
            a.g.l.v r0 = r1.f1457r
            if (r0 == 0) goto L_0x0007
            r0.m3373a()
        L_0x0007:
            return
    }

    /* renamed from: n */
    final android.content.Context m2564n() {
            r1 = this;
            androidx.appcompat.app.a r0 = r1.mo2584d()
            if (r0 == 0) goto L_0x000b
            android.content.Context r0 = r0.mo2484h()
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 != 0) goto L_0x0010
            android.content.Context r0 = r1.f1442c
        L_0x0010:
            return r0
    }

    /* renamed from: o */
    final java.lang.CharSequence m2563o() {
            r2 = this;
            android.view.Window$Callback r0 = r2.f1444e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x000d
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
        L_0x000d:
            java.lang.CharSequence r0 = r2.f1449j
            return r0
    }

    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r1, java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r0 = this;
            android.view.View r1 = r0.m2608a(r1, r2, r3, r4)
            return r1
    }

    @Override // android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            android.view.View r2 = r1.onCreateView(r0, r2, r3, r4)
            return r2
    }

    /* renamed from: p */
    final android.view.Window.Callback m2562p() {
            r1 = this;
            android.view.Window r0 = r1.f1443d
            android.view.Window$Callback r0 = r0.getCallback()
            return r0
    }

    /* renamed from: q */
    public boolean m2561q() {
            r1 = this;
            boolean r0 = r1.f1458s
            return r0
    }

    /* renamed from: r */
    boolean m2560r() {
            r2 = this;
            a.a.m.b r0 = r2.f1453n
            r1 = 1
            if (r0 == 0) goto L_0x0009
            r0.mo2472a()
            return r1
        L_0x0009:
            androidx.appcompat.app.a r0 = r2.mo2584d()
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.mo2488f()
            if (r0 == 0) goto L_0x0016
            return r1
        L_0x0016:
            r0 = 0
            return r0
    }

    /* renamed from: s */
    final androidx.appcompat.app.AbstractC0428a m2559s() {
            r1 = this;
            androidx.appcompat.app.a r0 = r1.f1447h
            return r0
    }

    /* renamed from: t */
    final boolean m2558t() {
            r1 = this;
            boolean r0 = r1.f1459t
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.f1460u
            if (r0 == 0) goto L_0x0010
            boolean r0 = p000a.p018g.p029l.C0216r.m3397x(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
    }
}
