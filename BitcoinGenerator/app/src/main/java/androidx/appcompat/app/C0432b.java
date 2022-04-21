package androidx.appcompat.app;

/* renamed from: androidx.appcompat.app.b */
/* loaded from: classes.dex */
public class C0432b implements androidx.drawerlayout.widget.DrawerLayout.AbstractC0727d {

    /* renamed from: a */
    private final androidx.appcompat.app.C0432b.AbstractC0434b f1394a;

    /* renamed from: b */
    private final androidx.drawerlayout.widget.DrawerLayout f1395b;

    /* renamed from: c */
    private p000a.p001a.p004l.p005a.C0025d f1396c;

    /* renamed from: d */
    private boolean f1397d;

    /* renamed from: e */
    boolean f1398e;

    /* renamed from: f */
    private final int f1399f;

    /* renamed from: g */
    private final int f1400g;

    /* renamed from: h */
    android.view.View.OnClickListener f1401h;

    /* renamed from: i */
    private boolean f1402i;

    /* renamed from: androidx.appcompat.app.b$a */
    /* loaded from: classes.dex */
    class View$OnClickListenerC0433a implements android.view.View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.app.C0432b f1403b;

        View$OnClickListenerC0433a(androidx.appcompat.app.C0432b r1) {
                r0 = this;
                r0.f1403b = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                androidx.appcompat.app.b r0 = r2.f1403b
                boolean r1 = r0.f1398e
                if (r1 == 0) goto L_0x000a
                r0.m2649c()
                goto L_0x0011
            L_0x000a:
                android.view.View$OnClickListener r0 = r0.f1401h
                if (r0 == 0) goto L_0x0011
                r0.onClick(r3)
            L_0x0011:
                return
        }
    }

    /* renamed from: androidx.appcompat.app.b$b */
    /* loaded from: classes.dex */
    public interface AbstractC0434b {
        /* renamed from: a */
        void mo2549a(int r1);

        /* renamed from: a */
        void mo2548a(android.graphics.drawable.Drawable r1, int r2);

        /* renamed from: a */
        boolean mo2550a();

        /* renamed from: b */
        android.content.Context mo2547b();

        /* renamed from: c */
        android.graphics.drawable.Drawable mo2546c();
    }

    /* renamed from: androidx.appcompat.app.b$c */
    /* loaded from: classes.dex */
    public interface AbstractC0435c {
        /* renamed from: c */
        androidx.appcompat.app.C0432b.AbstractC0434b mo2631c();
    }

    /* renamed from: androidx.appcompat.app.b$d */
    /* loaded from: classes.dex */
    private static class C0436d implements androidx.appcompat.app.C0432b.AbstractC0434b {

        /* renamed from: a */
        private final android.app.Activity f1404a;

        /* renamed from: b */
        private androidx.appcompat.app.C0438c.C0439a f1405b;

        C0436d(android.app.Activity r1) {
                r0 = this;
                r0.<init>()
                r0.f1404a = r1
                return
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: a */
        public void mo2549a(int r3) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 18
                if (r0 < r1) goto L_0x0012
                android.app.Activity r0 = r2.f1404a
                android.app.ActionBar r0 = r0.getActionBar()
                if (r0 == 0) goto L_0x001c
                r0.setHomeActionContentDescription(r3)
                goto L_0x001c
            L_0x0012:
                androidx.appcompat.app.c$a r0 = r2.f1405b
                android.app.Activity r1 = r2.f1404a
                androidx.appcompat.app.c$a r3 = androidx.appcompat.app.C0438c.m2647a(r0, r1, r3)
                r2.f1405b = r3
            L_0x001c:
                return
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: a */
        public void mo2548a(android.graphics.drawable.Drawable r4, int r5) {
                r3 = this;
                android.app.Activity r0 = r3.f1404a
                android.app.ActionBar r0 = r0.getActionBar()
                if (r0 == 0) goto L_0x0027
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 18
                if (r1 < r2) goto L_0x0015
                r0.setHomeAsUpIndicator(r4)
                r0.setHomeActionContentDescription(r5)
                goto L_0x0027
            L_0x0015:
                r1 = 1
                r0.setDisplayShowHomeEnabled(r1)
                androidx.appcompat.app.c$a r1 = r3.f1405b
                android.app.Activity r2 = r3.f1404a
                androidx.appcompat.app.c$a r4 = androidx.appcompat.app.C0438c.m2646a(r1, r2, r4, r5)
                r3.f1405b = r4
                r4 = 0
                r0.setDisplayShowHomeEnabled(r4)
            L_0x0027:
                return
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: a */
        public boolean mo2550a() {
                r1 = this;
                android.app.Activity r0 = r1.f1404a
                android.app.ActionBar r0 = r0.getActionBar()
                if (r0 == 0) goto L_0x0012
                int r0 = r0.getDisplayOptions()
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
                android.app.Activity r0 = r1.f1404a
                android.app.ActionBar r0 = r0.getActionBar()
                if (r0 == 0) goto L_0x000d
                android.content.Context r0 = r0.getThemedContext()
                return r0
            L_0x000d:
                android.app.Activity r0 = r1.f1404a
                return r0
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: c */
        public android.graphics.drawable.Drawable mo2546c() {
                r5 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 18
                if (r0 < r1) goto L_0x0023
                android.content.Context r0 = r5.mo2547b()
                r1 = 0
                r2 = 1
                int[] r2 = new int[r2]
                r3 = 16843531(0x101030b, float:2.369574E-38)
                r4 = 0
                r2[r4] = r3
                r3 = 16843470(0x10102ce, float:2.369557E-38)
                android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1, r2, r3, r4)
                android.graphics.drawable.Drawable r1 = r0.getDrawable(r4)
                r0.recycle()
                return r1
            L_0x0023:
                android.app.Activity r0 = r5.f1404a
                android.graphics.drawable.Drawable r0 = androidx.appcompat.app.C0438c.m2648a(r0)
                return r0
        }
    }

    /* renamed from: androidx.appcompat.app.b$e */
    /* loaded from: classes.dex */
    static class C0437e implements androidx.appcompat.app.C0432b.AbstractC0434b {

        /* renamed from: a */
        final androidx.appcompat.widget.Toolbar f1406a;

        /* renamed from: b */
        final android.graphics.drawable.Drawable f1407b;

        /* renamed from: c */
        final java.lang.CharSequence f1408c;

        C0437e(androidx.appcompat.widget.Toolbar r2) {
                r1 = this;
                r1.<init>()
                r1.f1406a = r2
                android.graphics.drawable.Drawable r0 = r2.getNavigationIcon()
                r1.f1407b = r0
                java.lang.CharSequence r2 = r2.getNavigationContentDescription()
                r1.f1408c = r2
                return
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: a */
        public void mo2549a(int r2) {
                r1 = this;
                if (r2 != 0) goto L_0x000a
                androidx.appcompat.widget.Toolbar r2 = r1.f1406a
                java.lang.CharSequence r0 = r1.f1408c
                r2.setNavigationContentDescription(r0)
                goto L_0x000f
            L_0x000a:
                androidx.appcompat.widget.Toolbar r0 = r1.f1406a
                r0.setNavigationContentDescription(r2)
            L_0x000f:
                return
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: a */
        public void mo2548a(android.graphics.drawable.Drawable r2, int r3) {
                r1 = this;
                androidx.appcompat.widget.Toolbar r0 = r1.f1406a
                r0.setNavigationIcon(r2)
                r1.mo2549a(r3)
                return
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: a */
        public boolean mo2550a() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: b */
        public android.content.Context mo2547b() {
                r1 = this;
                androidx.appcompat.widget.Toolbar r0 = r1.f1406a
                android.content.Context r0 = r0.getContext()
                return r0
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: c */
        public android.graphics.drawable.Drawable mo2546c() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f1407b
                return r0
        }
    }

    C0432b(android.app.Activity r2, androidx.appcompat.widget.Toolbar r3, androidx.drawerlayout.widget.DrawerLayout r4, p000a.p001a.p004l.p005a.C0025d r5, int r6, int r7) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f1397d = r0
            r1.f1398e = r0
            r0 = 0
            r1.f1402i = r0
            if (r3 == 0) goto L_0x001d
            androidx.appcompat.app.b$e r2 = new androidx.appcompat.app.b$e
            r2.<init>(r3)
            r1.f1394a = r2
            androidx.appcompat.app.b$a r2 = new androidx.appcompat.app.b$a
            r2.<init>(r1)
            r3.setNavigationOnClickListener(r2)
            goto L_0x0031
        L_0x001d:
            boolean r3 = r2 instanceof androidx.appcompat.app.C0432b.AbstractC0435c
            if (r3 == 0) goto L_0x002a
            androidx.appcompat.app.b$c r2 = (androidx.appcompat.app.C0432b.AbstractC0435c) r2
            androidx.appcompat.app.b$b r2 = r2.mo2631c()
            r1.f1394a = r2
            goto L_0x0031
        L_0x002a:
            androidx.appcompat.app.b$d r3 = new androidx.appcompat.app.b$d
            r3.<init>(r2)
            r1.f1394a = r3
        L_0x0031:
            r1.f1395b = r4
            r1.f1399f = r6
            r1.f1400g = r7
            if (r5 != 0) goto L_0x0047
            a.a.l.a.d r2 = new a.a.l.a.d
            androidx.appcompat.app.b$b r3 = r1.f1394a
            android.content.Context r3 = r3.mo2547b()
            r2.<init>(r3)
            r1.f1396c = r2
            goto L_0x0049
        L_0x0047:
            r1.f1396c = r5
        L_0x0049:
            r1.m2654a()
            return
    }

    public C0432b(android.app.Activity r8, androidx.drawerlayout.widget.DrawerLayout r9, androidx.appcompat.widget.Toolbar r10, int r11, int r12) {
            r7 = this;
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r9
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    /* renamed from: a */
    private void m2653a(float r3) {
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x000d
            a.a.l.a.d r0 = r2.f1396c
            r1 = 1
        L_0x0009:
            r0.m4195b(r1)
            goto L_0x0016
        L_0x000d:
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0016
            a.a.l.a.d r0 = r2.f1396c
            r1 = 0
            goto L_0x0009
        L_0x0016:
            a.a.l.a.d r0 = r2.f1396c
            r0.m4194c(r3)
            return
    }

    /* renamed from: a */
    android.graphics.drawable.Drawable m2654a() {
            r1 = this;
            androidx.appcompat.app.b$b r0 = r1.f1394a
            android.graphics.drawable.Drawable r0 = r0.mo2546c()
            return r0
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0727d
    /* renamed from: a */
    public void mo1425a(int r1) {
            r0 = this;
            return
    }

    /* renamed from: a */
    void m2652a(android.graphics.drawable.Drawable r3, int r4) {
            r2 = this;
            boolean r0 = r2.f1402i
            if (r0 != 0) goto L_0x0016
            androidx.appcompat.app.b$b r0 = r2.f1394a
            boolean r0 = r0.mo2550a()
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = "ActionBarDrawerToggle"
            java.lang.String r1 = "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);"
            android.util.Log.w(r0, r1)
            r0 = 1
            r2.f1402i = r0
        L_0x0016:
            androidx.appcompat.app.b$b r0 = r2.f1394a
            r0.mo2548a(r3, r4)
            return
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0727d
    /* renamed from: a */
    public void mo1424a(android.view.View r1) {
            r0 = this;
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.m2653a(r1)
            boolean r1 = r0.f1398e
            if (r1 == 0) goto L_0x000e
            int r1 = r0.f1400g
            r0.m2650b(r1)
        L_0x000e:
            return
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0727d
    /* renamed from: a */
    public void mo1423a(android.view.View r2, float r3) {
            r1 = this;
            boolean r2 = r1.f1397d
            r0 = 0
            if (r2 == 0) goto L_0x0013
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = java.lang.Math.max(r0, r3)
            float r2 = java.lang.Math.min(r2, r3)
            r1.m2653a(r2)
            goto L_0x0016
        L_0x0013:
            r1.m2653a(r0)
        L_0x0016:
            return
    }

    /* renamed from: b */
    public void m2651b() {
            r3 = this;
            androidx.drawerlayout.widget.DrawerLayout r0 = r3.f1395b
            r1 = 8388611(0x800003, float:1.1754948E-38)
            boolean r0 = r0.m1446e(r1)
            if (r0 == 0) goto L_0x000e
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            r3.m2653a(r0)
            boolean r0 = r3.f1398e
            if (r0 == 0) goto L_0x0028
            a.a.l.a.d r0 = r3.f1396c
            androidx.drawerlayout.widget.DrawerLayout r2 = r3.f1395b
            boolean r1 = r2.m1446e(r1)
            if (r1 == 0) goto L_0x0023
            int r1 = r3.f1400g
            goto L_0x0025
        L_0x0023:
            int r1 = r3.f1399f
        L_0x0025:
            r3.m2652a(r0, r1)
        L_0x0028:
            return
    }

    /* renamed from: b */
    void m2650b(int r2) {
            r1 = this;
            androidx.appcompat.app.b$b r0 = r1.f1394a
            r0.mo2549a(r2)
            return
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0727d
    /* renamed from: b */
    public void mo1422b(android.view.View r1) {
            r0 = this;
            r1 = 0
            r0.m2653a(r1)
            boolean r1 = r0.f1398e
            if (r1 == 0) goto L_0x000d
            int r1 = r0.f1399f
            r0.m2650b(r1)
        L_0x000d:
            return
    }

    /* renamed from: c */
    void m2649c() {
            r3 = this;
            androidx.drawerlayout.widget.DrawerLayout r0 = r3.f1395b
            r1 = 8388611(0x800003, float:1.1754948E-38)
            int r0 = r0.m1454c(r1)
            androidx.drawerlayout.widget.DrawerLayout r2 = r3.f1395b
            boolean r2 = r2.m1443f(r1)
            if (r2 == 0) goto L_0x001a
            r2 = 2
            if (r0 == r2) goto L_0x001a
            androidx.drawerlayout.widget.DrawerLayout r0 = r3.f1395b
            r0.m1476a(r1)
            goto L_0x0022
        L_0x001a:
            r2 = 1
            if (r0 == r2) goto L_0x0022
            androidx.drawerlayout.widget.DrawerLayout r0 = r3.f1395b
            r0.m1440g(r1)
        L_0x0022:
            return
    }
}
