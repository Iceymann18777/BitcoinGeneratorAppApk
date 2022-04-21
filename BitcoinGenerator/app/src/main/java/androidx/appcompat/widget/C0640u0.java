package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.u0 */
/* loaded from: classes.dex */
public class C0640u0 implements androidx.appcompat.widget.AbstractC0569b0 {

    /* renamed from: a */
    androidx.appcompat.widget.Toolbar f2284a;

    /* renamed from: b */
    private int f2285b;

    /* renamed from: c */
    private android.view.View f2286c;

    /* renamed from: d */
    private android.view.View f2287d;

    /* renamed from: e */
    private android.graphics.drawable.Drawable f2288e;

    /* renamed from: f */
    private android.graphics.drawable.Drawable f2289f;

    /* renamed from: g */
    private android.graphics.drawable.Drawable f2290g;

    /* renamed from: h */
    private boolean f2291h;

    /* renamed from: i */
    java.lang.CharSequence f2292i;

    /* renamed from: j */
    private java.lang.CharSequence f2293j;

    /* renamed from: k */
    private java.lang.CharSequence f2294k;

    /* renamed from: l */
    android.view.Window.Callback f2295l;

    /* renamed from: m */
    boolean f2296m;

    /* renamed from: n */
    private androidx.appcompat.widget.C0570c f2297n;

    /* renamed from: o */
    private int f2298o;

    /* renamed from: p */
    private int f2299p;

    /* renamed from: q */
    private android.graphics.drawable.Drawable f2300q;

    /* renamed from: androidx.appcompat.widget.u0$a */
    /* loaded from: classes.dex */
    class View$OnClickListenerC0641a implements android.view.View.OnClickListener {

        /* renamed from: b */
        final androidx.appcompat.view.menu.C0483a f2301b;

        /* renamed from: c */
        final /* synthetic */ androidx.appcompat.widget.C0640u0 f2302c;

        View$OnClickListenerC0641a(androidx.appcompat.widget.C0640u0 r8) {
                r7 = this;
                r7.f2302c = r8
                r7.<init>()
                androidx.appcompat.view.menu.a r8 = new androidx.appcompat.view.menu.a
                androidx.appcompat.widget.u0 r0 = r7.f2302c
                androidx.appcompat.widget.Toolbar r0 = r0.f2284a
                android.content.Context r1 = r0.getContext()
                androidx.appcompat.widget.u0 r0 = r7.f2302c
                java.lang.CharSequence r6 = r0.f2292i
                r2 = 0
                r3 = 16908332(0x102002c, float:2.3877352E-38)
                r4 = 0
                r5 = 0
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r7.f2301b = r8
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                androidx.appcompat.widget.u0 r3 = r2.f2302c
                android.view.Window$Callback r0 = r3.f2295l
                if (r0 == 0) goto L_0x0010
                boolean r3 = r3.f2296m
                if (r3 == 0) goto L_0x0010
                r3 = 0
                androidx.appcompat.view.menu.a r1 = r2.f2301b
                r0.onMenuItemSelected(r3, r1)
            L_0x0010:
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.u0$b */
    /* loaded from: classes.dex */
    class C0642b extends p000a.p018g.p029l.C0228x {

        /* renamed from: a */
        private boolean f2303a;

        /* renamed from: b */
        final /* synthetic */ int f2304b;

        /* renamed from: c */
        final /* synthetic */ androidx.appcompat.widget.C0640u0 f2305c;

        C0642b(androidx.appcompat.widget.C0640u0 r1, int r2) {
                r0 = this;
                r0.f2305c = r1
                r0.f2304b = r2
                r0.<init>()
                r1 = 0
                r0.f2303a = r1
                return
        }

        @Override // p000a.p018g.p029l.AbstractC0227w
        /* renamed from: a */
        public void mo1850a(android.view.View r2) {
                r1 = this;
                boolean r2 = r1.f2303a
                if (r2 != 0) goto L_0x000d
                androidx.appcompat.widget.u0 r2 = r1.f2305c
                androidx.appcompat.widget.Toolbar r2 = r2.f2284a
                int r0 = r1.f2304b
                r2.setVisibility(r0)
            L_0x000d:
                return
        }

        @Override // p000a.p018g.p029l.C0228x, p000a.p018g.p029l.AbstractC0227w
        /* renamed from: b */
        public void mo1849b(android.view.View r2) {
                r1 = this;
                androidx.appcompat.widget.u0 r2 = r1.f2305c
                androidx.appcompat.widget.Toolbar r2 = r2.f2284a
                r0 = 0
                r2.setVisibility(r0)
                return
        }

        @Override // p000a.p018g.p029l.C0228x, p000a.p018g.p029l.AbstractC0227w
        /* renamed from: c */
        public void mo1848c(android.view.View r1) {
                r0 = this;
                r1 = 1
                r0.f2303a = r1
                return
        }
    }

    public C0640u0(androidx.appcompat.widget.Toolbar r3, boolean r4) {
            r2 = this;
            int r0 = p000a.p001a.C0007h.abc_action_bar_up_description
            int r1 = p000a.p001a.C0004e.abc_ic_ab_back_material
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public C0640u0(androidx.appcompat.widget.Toolbar r4, boolean r5, int r6, int r7) {
            r3 = this;
            r3.<init>()
            r7 = 0
            r3.f2298o = r7
            r3.f2299p = r7
            r3.f2284a = r4
            java.lang.CharSequence r0 = r4.getTitle()
            r3.f2292i = r0
            java.lang.CharSequence r0 = r4.getSubtitle()
            r3.f2293j = r0
            java.lang.CharSequence r0 = r3.f2292i
            if (r0 == 0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r3.f2291h = r0
            android.graphics.drawable.Drawable r0 = r4.getNavigationIcon()
            r3.f2290g = r0
            android.content.Context r4 = r4.getContext()
            r0 = 0
            int[] r1 = p000a.p001a.C0009j.ActionBar
            int r2 = p000a.p001a.C0000a.actionBarStyle
            androidx.appcompat.widget.t0 r4 = androidx.appcompat.widget.C0638t0.m1900a(r4, r0, r1, r2, r7)
            int r0 = p000a.p001a.C0009j.ActionBar_homeAsUpIndicator
            android.graphics.drawable.Drawable r0 = r4.m1899b(r0)
            r3.f2300q = r0
            if (r5 == 0) goto L_0x0109
            int r5 = p000a.p001a.C0009j.ActionBar_title
            java.lang.CharSequence r5 = r4.m1893e(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x004b
            r3.m1870c(r5)
        L_0x004b:
            int r5 = p000a.p001a.C0009j.ActionBar_subtitle
            java.lang.CharSequence r5 = r4.m1893e(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x005a
            r3.m1874b(r5)
        L_0x005a:
            int r5 = p000a.p001a.C0009j.ActionBar_logo
            android.graphics.drawable.Drawable r5 = r4.m1899b(r5)
            if (r5 == 0) goto L_0x0065
            r3.m1875b(r5)
        L_0x0065:
            int r5 = p000a.p001a.C0009j.ActionBar_icon
            android.graphics.drawable.Drawable r5 = r4.m1899b(r5)
            if (r5 == 0) goto L_0x0070
            r3.setIcon(r5)
        L_0x0070:
            android.graphics.drawable.Drawable r5 = r3.f2290g
            if (r5 != 0) goto L_0x007b
            android.graphics.drawable.Drawable r5 = r3.f2300q
            if (r5 == 0) goto L_0x007b
            r3.mo1884a(r5)
        L_0x007b:
            int r5 = p000a.p001a.C0009j.ActionBar_displayOptions
            int r5 = r4.m1894d(r5, r7)
            r3.mo1868d(r5)
            int r5 = p000a.p001a.C0009j.ActionBar_customNavigationLayout
            int r5 = r4.m1888g(r5, r7)
            if (r5 == 0) goto L_0x00a6
            androidx.appcompat.widget.Toolbar r0 = r3.f2284a
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            androidx.appcompat.widget.Toolbar r1 = r3.f2284a
            android.view.View r5 = r0.inflate(r5, r1, r7)
            r3.m1882a(r5)
            int r5 = r3.f2285b
            r5 = r5 | 16
            r3.mo1868d(r5)
        L_0x00a6:
            int r5 = p000a.p001a.C0009j.ActionBar_height
            int r5 = r4.m1890f(r5, r7)
            if (r5 <= 0) goto L_0x00bb
            androidx.appcompat.widget.Toolbar r0 = r3.f2284a
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.height = r5
            androidx.appcompat.widget.Toolbar r5 = r3.f2284a
            r5.setLayoutParams(r0)
        L_0x00bb:
            int r5 = p000a.p001a.C0009j.ActionBar_contentInsetStart
            r0 = -1
            int r5 = r4.m1898b(r5, r0)
            int r1 = p000a.p001a.C0009j.ActionBar_contentInsetEnd
            int r0 = r4.m1898b(r1, r0)
            if (r5 >= 0) goto L_0x00cc
            if (r0 < 0) goto L_0x00d9
        L_0x00cc:
            androidx.appcompat.widget.Toolbar r1 = r3.f2284a
            int r5 = java.lang.Math.max(r5, r7)
            int r0 = java.lang.Math.max(r0, r7)
            r1.m2192a(r5, r0)
        L_0x00d9:
            int r5 = p000a.p001a.C0009j.ActionBar_titleTextStyle
            int r5 = r4.m1888g(r5, r7)
            if (r5 == 0) goto L_0x00ea
            androidx.appcompat.widget.Toolbar r0 = r3.f2284a
            android.content.Context r1 = r0.getContext()
            r0.m2178b(r1, r5)
        L_0x00ea:
            int r5 = p000a.p001a.C0009j.ActionBar_subtitleTextStyle
            int r5 = r4.m1888g(r5, r7)
            if (r5 == 0) goto L_0x00fb
            androidx.appcompat.widget.Toolbar r0 = r3.f2284a
            android.content.Context r1 = r0.getContext()
            r0.m2191a(r1, r5)
        L_0x00fb:
            int r5 = p000a.p001a.C0009j.ActionBar_popupTheme
            int r5 = r4.m1888g(r5, r7)
            if (r5 == 0) goto L_0x010f
            androidx.appcompat.widget.Toolbar r7 = r3.f2284a
            r7.setPopupTheme(r5)
            goto L_0x010f
        L_0x0109:
            int r5 = r3.m1854p()
            r3.f2285b = r5
        L_0x010f:
            r4.m1908a()
            r3.m1865e(r6)
            androidx.appcompat.widget.Toolbar r4 = r3.f2284a
            java.lang.CharSequence r4 = r4.getNavigationContentDescription()
            r3.f2294k = r4
            androidx.appcompat.widget.Toolbar r4 = r3.f2284a
            androidx.appcompat.widget.u0$a r5 = new androidx.appcompat.widget.u0$a
            r5.<init>(r3)
            r4.setNavigationOnClickListener(r5)
            return
    }

    /* renamed from: d */
    private void m1867d(java.lang.CharSequence r2) {
            r1 = this;
            r1.f2292i = r2
            int r0 = r1.f2285b
            r0 = r0 & 8
            if (r0 == 0) goto L_0x000d
            androidx.appcompat.widget.Toolbar r0 = r1.f2284a
            r0.setTitle(r2)
        L_0x000d:
            return
    }

    /* renamed from: p */
    private int m1854p() {
            r2 = this;
            androidx.appcompat.widget.Toolbar r0 = r2.f2284a
            android.graphics.drawable.Drawable r0 = r0.getNavigationIcon()
            if (r0 == 0) goto L_0x0013
            r0 = 15
            androidx.appcompat.widget.Toolbar r1 = r2.f2284a
            android.graphics.drawable.Drawable r1 = r1.getNavigationIcon()
            r2.f2300q = r1
            goto L_0x0015
        L_0x0013:
            r0 = 11
        L_0x0015:
            return r0
    }

    /* renamed from: q */
    private void m1853q() {
            r2 = this;
            int r0 = r2.f2285b
            r0 = r0 & 4
            if (r0 == 0) goto L_0x001d
            java.lang.CharSequence r0 = r2.f2294k
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0016
            androidx.appcompat.widget.Toolbar r0 = r2.f2284a
            int r1 = r2.f2299p
            r0.setNavigationContentDescription(r1)
            goto L_0x001d
        L_0x0016:
            androidx.appcompat.widget.Toolbar r0 = r2.f2284a
            java.lang.CharSequence r1 = r2.f2294k
            r0.setNavigationContentDescription(r1)
        L_0x001d:
            return
    }

    /* renamed from: r */
    private void m1852r() {
            r2 = this;
            int r0 = r2.f2285b
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0010
            androidx.appcompat.widget.Toolbar r0 = r2.f2284a
            android.graphics.drawable.Drawable r1 = r2.f2290g
            if (r1 == 0) goto L_0x000d
            goto L_0x0013
        L_0x000d:
            android.graphics.drawable.Drawable r1 = r2.f2300q
            goto L_0x0013
        L_0x0010:
            androidx.appcompat.widget.Toolbar r0 = r2.f2284a
            r1 = 0
        L_0x0013:
            r0.setNavigationIcon(r1)
            return
    }

    /* renamed from: s */
    private void m1851s() {
            r2 = this;
            int r0 = r2.f2285b
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0012
            r0 = r0 & 1
            if (r0 == 0) goto L_0x000f
            android.graphics.drawable.Drawable r0 = r2.f2289f
            if (r0 == 0) goto L_0x000f
            goto L_0x0013
        L_0x000f:
            android.graphics.drawable.Drawable r0 = r2.f2288e
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            androidx.appcompat.widget.Toolbar r1 = r2.f2284a
            r1.setLogo(r0)
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: a */
    public p000a.p018g.p029l.C0223v mo1885a(int r3, long r4) {
            r2 = this;
            androidx.appcompat.widget.Toolbar r0 = r2.f2284a
            a.g.l.v r0 = p000a.p018g.p029l.C0216r.m3445a(r0)
            if (r3 != 0) goto L_0x000b
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x000c
        L_0x000b:
            r1 = 0
        L_0x000c:
            r0.m3372a(r1)
            r0.m3371a(r4)
            androidx.appcompat.widget.u0$b r4 = new androidx.appcompat.widget.u0$b
            r4.<init>(r2, r3)
            r0.m3370a(r4)
            return r0
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: a */
    public void mo1886a(int r2) {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f2284a
            r0.setVisibility(r2)
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: a */
    public void mo1884a(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.f2290g = r1
            r0.m1852r()
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: a */
    public void mo1883a(android.view.Menu r3, androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a r4) {
            r2 = this;
            androidx.appcompat.widget.c r0 = r2.f2297n
            if (r0 != 0) goto L_0x0018
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            androidx.appcompat.widget.Toolbar r1 = r2.f2284a
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            r2.f2297n = r0
            androidx.appcompat.widget.c r0 = r2.f2297n
            int r1 = p000a.p001a.C0005f.action_menu_presenter
            r0.m2447a(r1)
        L_0x0018:
            androidx.appcompat.widget.c r0 = r2.f2297n
            r0.mo2308a(r4)
            androidx.appcompat.widget.Toolbar r4 = r2.f2284a
            androidx.appcompat.view.menu.h r3 = (androidx.appcompat.view.menu.C0496h) r3
            androidx.appcompat.widget.c r0 = r2.f2297n
            r4.m2184a(r3, r0)
            return
    }

    /* renamed from: a */
    public void m1882a(android.view.View r3) {
            r2 = this;
            android.view.View r0 = r2.f2287d
            if (r0 == 0) goto L_0x000f
            int r1 = r2.f2285b
            r1 = r1 & 16
            if (r1 == 0) goto L_0x000f
            androidx.appcompat.widget.Toolbar r1 = r2.f2284a
            r1.removeView(r0)
        L_0x000f:
            r2.f2287d = r3
            if (r3 == 0) goto L_0x0020
            int r3 = r2.f2285b
            r3 = r3 & 16
            if (r3 == 0) goto L_0x0020
            androidx.appcompat.widget.Toolbar r3 = r2.f2284a
            android.view.View r0 = r2.f2287d
            r3.addView(r0)
        L_0x0020:
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: a */
    public void mo1881a(androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a r2, androidx.appcompat.view.menu.C0496h.AbstractC0497a r3) {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f2284a
            r0.m2183a(r2, r3)
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: a */
    public void mo1880a(androidx.appcompat.widget.C0619m0 r4) {
            r3 = this;
            android.view.View r0 = r3.f2286c
            if (r0 == 0) goto L_0x0011
            android.view.ViewParent r0 = r0.getParent()
            androidx.appcompat.widget.Toolbar r1 = r3.f2284a
            if (r0 != r1) goto L_0x0011
            android.view.View r0 = r3.f2286c
            r1.removeView(r0)
        L_0x0011:
            r3.f2286c = r4
            if (r4 == 0) goto L_0x0038
            int r0 = r3.f2298o
            r1 = 2
            if (r0 != r1) goto L_0x0038
            androidx.appcompat.widget.Toolbar r0 = r3.f2284a
            android.view.View r1 = r3.f2286c
            r2 = 0
            r0.addView(r1, r2)
            android.view.View r0 = r3.f2286c
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r0 = (androidx.appcompat.widget.Toolbar.C0559e) r0
            r1 = -2
            r0.width = r1
            r0.height = r1
            r1 = 8388691(0x800053, float:1.175506E-38)
            r0.f1393a = r1
            r0 = 1
            r4.setAllowCollapse(r0)
        L_0x0038:
            return
    }

    /* renamed from: a */
    public void m1879a(java.lang.CharSequence r1) {
            r0 = this;
            r0.f2294k = r1
            r0.m1853q()
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: a */
    public void mo1878a(boolean r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: a */
    public boolean mo1887a() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f2284a
            boolean r0 = r0.m2165k()
            return r0
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: b */
    public void mo1876b(int r2) {
            r1 = this;
            if (r2 == 0) goto L_0x000b
            android.content.Context r0 = r1.mo1856n()
            android.graphics.drawable.Drawable r2 = p000a.p001a.p002k.p003a.C0010a.m4259c(r0, r2)
            goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            r1.m1875b(r2)
            return
    }

    /* renamed from: b */
    public void m1875b(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.f2289f = r1
            r0.m1851s()
            return
    }

    /* renamed from: b */
    public void m1874b(java.lang.CharSequence r2) {
            r1 = this;
            r1.f2293j = r2
            int r0 = r1.f2285b
            r0 = r0 & 8
            if (r0 == 0) goto L_0x000d
            androidx.appcompat.widget.Toolbar r0 = r1.f2284a
            r0.setSubtitle(r2)
        L_0x000d:
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: b */
    public void mo1873b(boolean r2) {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f2284a
            r0.setCollapsible(r2)
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: b */
    public boolean mo1877b() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f2284a
            boolean r0 = r0.m2168h()
            return r0
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: c */
    public void mo1872c() {
            r1 = this;
            r0 = 1
            r1.f2296m = r0
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: c */
    public void mo1871c(int r2) {
            r1 = this;
            if (r2 != 0) goto L_0x0004
            r2 = 0
            goto L_0x000c
        L_0x0004:
            android.content.Context r0 = r1.mo1856n()
            java.lang.String r2 = r0.getString(r2)
        L_0x000c:
            r1.m1879a(r2)
            return
    }

    /* renamed from: c */
    public void m1870c(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 1
            r1.f2291h = r0
            r1.m1867d(r2)
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    public void collapseActionView() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f2284a
            r0.m2175c()
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: d */
    public void mo1868d(int r4) {
            r3 = this;
            int r0 = r3.f2285b
            r0 = r0 ^ r4
            r3.f2285b = r4
            if (r0 == 0) goto L_0x0052
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0015
            r1 = r4 & 4
            if (r1 == 0) goto L_0x0012
            r3.m1853q()
        L_0x0012:
            r3.m1852r()
        L_0x0015:
            r1 = r0 & 3
            if (r1 == 0) goto L_0x001c
            r3.m1851s()
        L_0x001c:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x003b
            r1 = r4 & 8
            if (r1 == 0) goto L_0x0030
            androidx.appcompat.widget.Toolbar r1 = r3.f2284a
            java.lang.CharSequence r2 = r3.f2292i
            r1.setTitle(r2)
            androidx.appcompat.widget.Toolbar r1 = r3.f2284a
            java.lang.CharSequence r2 = r3.f2293j
            goto L_0x0038
        L_0x0030:
            androidx.appcompat.widget.Toolbar r1 = r3.f2284a
            r2 = 0
            r1.setTitle(r2)
            androidx.appcompat.widget.Toolbar r1 = r3.f2284a
        L_0x0038:
            r1.setSubtitle(r2)
        L_0x003b:
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0052
            android.view.View r0 = r3.f2287d
            if (r0 == 0) goto L_0x0052
            r4 = r4 & 16
            if (r4 == 0) goto L_0x004d
            androidx.appcompat.widget.Toolbar r4 = r3.f2284a
            r4.addView(r0)
            goto L_0x0052
        L_0x004d:
            androidx.appcompat.widget.Toolbar r4 = r3.f2284a
            r4.removeView(r0)
        L_0x0052:
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: d */
    public boolean mo1869d() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f2284a
            boolean r0 = r0.m2167i()
            return r0
    }

    /* renamed from: e */
    public void m1865e(int r2) {
            r1 = this;
            int r0 = r1.f2299p
            if (r2 != r0) goto L_0x0005
            return
        L_0x0005:
            r1.f2299p = r2
            androidx.appcompat.widget.Toolbar r2 = r1.f2284a
            java.lang.CharSequence r2 = r2.getNavigationContentDescription()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0018
            int r2 = r1.f2299p
            r1.mo1871c(r2)
        L_0x0018:
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: e */
    public boolean mo1866e() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f2284a
            boolean r0 = r0.m2180b()
            return r0
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: f */
    public boolean mo1864f() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f2284a
            boolean r0 = r0.m2169g()
            return r0
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: g */
    public void mo1863g() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f2284a
            r0.m2173d()
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    public java.lang.CharSequence getTitle() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f2284a
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: h */
    public int mo1862h() {
            r1 = this;
            int r0 = r1.f2285b
            return r0
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: i */
    public void mo1861i() {
            r2 = this;
            java.lang.String r0 = "ToolbarWidgetWrapper"
            java.lang.String r1 = "Progress display unsupported"
            android.util.Log.i(r0, r1)
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: j */
    public android.view.Menu mo1860j() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f2284a
            android.view.Menu r0 = r0.getMenu()
            return r0
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: k */
    public boolean mo1859k() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f2284a
            boolean r0 = r0.m2170f()
            return r0
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: l */
    public android.view.ViewGroup mo1858l() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f2284a
            return r0
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: m */
    public void mo1857m() {
            r2 = this;
            java.lang.String r0 = "ToolbarWidgetWrapper"
            java.lang.String r1 = "Progress display unsupported"
            android.util.Log.i(r0, r1)
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: n */
    public android.content.Context mo1856n() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f2284a
            android.content.Context r0 = r0.getContext()
            return r0
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: o */
    public int mo1855o() {
            r1 = this;
            int r0 = r1.f2298o
            return r0
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    public void setIcon(int r2) {
            r1 = this;
            if (r2 == 0) goto L_0x000b
            android.content.Context r0 = r1.mo1856n()
            android.graphics.drawable.Drawable r2 = p000a.p001a.p002k.p003a.C0010a.m4259c(r0, r2)
            goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            r1.setIcon(r2)
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    public void setIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.f2288e = r1
            r0.m1851s()
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    public void setWindowCallback(android.view.Window.Callback r1) {
            r0 = this;
            r0.f2295l = r1
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    public void setWindowTitle(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = r1.f2291h
            if (r0 != 0) goto L_0x0007
            r1.m1867d(r2)
        L_0x0007:
            return
    }
}
