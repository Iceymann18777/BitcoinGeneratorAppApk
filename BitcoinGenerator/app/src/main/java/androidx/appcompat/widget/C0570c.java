package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.c */
/* loaded from: classes.dex */
class C0570c extends androidx.appcompat.view.menu.AbstractC0484b implements p000a.p018g.p029l.AbstractC0197b.AbstractC0198a {

    /* renamed from: A */
    androidx.appcompat.widget.C0570c.C0571a f2040A;

    /* renamed from: B */
    androidx.appcompat.widget.C0570c.RunnableC0573c f2041B;

    /* renamed from: C */
    private androidx.appcompat.widget.C0570c.C0572b f2042C;

    /* renamed from: D */
    final androidx.appcompat.widget.C0570c.C0577f f2043D;

    /* renamed from: E */
    int f2044E;

    /* renamed from: k */
    androidx.appcompat.widget.C0570c.C0574d f2045k;

    /* renamed from: l */
    private android.graphics.drawable.Drawable f2046l;

    /* renamed from: m */
    private boolean f2047m;

    /* renamed from: n */
    private boolean f2048n;

    /* renamed from: o */
    private boolean f2049o;

    /* renamed from: p */
    private int f2050p;

    /* renamed from: q */
    private int f2051q;

    /* renamed from: r */
    private int f2052r;

    /* renamed from: s */
    private boolean f2053s;

    /* renamed from: t */
    private boolean f2054t;

    /* renamed from: u */
    private boolean f2055u;

    /* renamed from: v */
    private boolean f2056v;

    /* renamed from: w */
    private int f2057w;

    /* renamed from: x */
    private final android.util.SparseBooleanArray f2058x;

    /* renamed from: y */
    private android.view.View f2059y;

    /* renamed from: z */
    androidx.appcompat.widget.C0570c.C0576e f2060z;

    /* renamed from: androidx.appcompat.widget.c$a */
    /* loaded from: classes.dex */
    private class C0571a extends androidx.appcompat.view.menu.C0511o {

        /* renamed from: m */
        final /* synthetic */ androidx.appcompat.widget.C0570c f2061m;

        public C0571a(androidx.appcompat.widget.C0570c r7, android.content.Context r8, androidx.appcompat.view.menu.SubMenuC0523v r9, android.view.View r10) {
                r6 = this;
                r6.f2061m = r7
                int r5 = p000a.p001a.C0000a.actionOverflowMenuStyle
                r4 = 0
                r0 = r6
                r1 = r8
                r2 = r9
                r3 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                android.view.MenuItem r8 = r9.getItem()
                androidx.appcompat.view.menu.k r8 = (androidx.appcompat.view.menu.C0501k) r8
                boolean r8 = r8.m2352h()
                if (r8 != 0) goto L_0x0025
                androidx.appcompat.widget.c$d r8 = r7.f2045k
                if (r8 != 0) goto L_0x0022
                androidx.appcompat.view.menu.q r8 = androidx.appcompat.widget.C0570c.m2125c(r7)
                android.view.View r8 = (android.view.View) r8
            L_0x0022:
                r6.m2324a(r8)
            L_0x0025:
                androidx.appcompat.widget.c$f r7 = r7.f2043D
                r6.m2322a(r7)
                return
        }

        @Override // androidx.appcompat.view.menu.C0511o
        /* renamed from: d */
        protected void mo2110d() {
                r2 = this;
                androidx.appcompat.widget.c r0 = r2.f2061m
                r1 = 0
                r0.f2040A = r1
                r1 = 0
                r0.f2044E = r1
                super.mo2110d()
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    /* loaded from: classes.dex */
    private class C0572b extends androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0482b {

        /* renamed from: a */
        final /* synthetic */ androidx.appcompat.widget.C0570c f2062a;

        C0572b(androidx.appcompat.widget.C0570c r1) {
                r0 = this;
                r0.f2062a = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0482b
        /* renamed from: a */
        public androidx.appcompat.view.menu.AbstractC0519t mo2113a() {
                r1 = this;
                androidx.appcompat.widget.c r0 = r1.f2062a
                androidx.appcompat.widget.c$a r0 = r0.f2040A
                if (r0 == 0) goto L_0x000b
                androidx.appcompat.view.menu.n r0 = r0.m2320b()
                goto L_0x000c
            L_0x000b:
                r0 = 0
            L_0x000c:
                return r0
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c */
    /* loaded from: classes.dex */
    private class RunnableC0573c implements java.lang.Runnable {

        /* renamed from: b */
        private androidx.appcompat.widget.C0570c.C0576e f2063b;

        /* renamed from: c */
        final /* synthetic */ androidx.appcompat.widget.C0570c f2064c;

        public RunnableC0573c(androidx.appcompat.widget.C0570c r1, androidx.appcompat.widget.C0570c.C0576e r2) {
                r0 = this;
                r0.f2064c = r1
                r0.<init>()
                r0.f2063b = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.appcompat.widget.c r0 = r2.f2064c
                androidx.appcompat.view.menu.h r0 = androidx.appcompat.widget.C0570c.m2123d(r0)
                if (r0 == 0) goto L_0x0011
                androidx.appcompat.widget.c r0 = r2.f2064c
                androidx.appcompat.view.menu.h r0 = androidx.appcompat.widget.C0570c.m2121e(r0)
                r0.m2422a()
            L_0x0011:
                androidx.appcompat.widget.c r0 = r2.f2064c
                androidx.appcompat.view.menu.q r0 = androidx.appcompat.widget.C0570c.m2119f(r0)
                android.view.View r0 = (android.view.View) r0
                if (r0 == 0) goto L_0x002f
                android.os.IBinder r0 = r0.getWindowToken()
                if (r0 == 0) goto L_0x002f
                androidx.appcompat.widget.c$e r0 = r2.f2063b
                boolean r0 = r0.m2317f()
                if (r0 == 0) goto L_0x002f
                androidx.appcompat.widget.c r0 = r2.f2064c
                androidx.appcompat.widget.c$e r1 = r2.f2063b
                r0.f2060z = r1
            L_0x002f:
                androidx.appcompat.widget.c r0 = r2.f2064c
                r1 = 0
                r0.f2041B = r1
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    /* loaded from: classes.dex */
    private class C0574d extends androidx.appcompat.widget.C0627o implements androidx.appcompat.widget.ActionMenuView.AbstractC0531a {

        /* renamed from: d */
        final /* synthetic */ androidx.appcompat.widget.C0570c f2065d;

        /* renamed from: androidx.appcompat.widget.c$d$a */
        /* loaded from: classes.dex */
        class C0575a extends androidx.appcompat.widget.AbstractView$OnTouchListenerC0589f0 {

            /* renamed from: k */
            final /* synthetic */ androidx.appcompat.widget.C0570c.C0574d f2066k;

            C0575a(androidx.appcompat.widget.C0570c.C0574d r1, android.view.View r2, androidx.appcompat.widget.C0570c r3) {
                    r0 = this;
                    r0.f2066k = r1
                    r0.<init>(r2)
                    return
            }

            @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0589f0
            /* renamed from: a */
            public androidx.appcompat.view.menu.AbstractC0519t mo1839a() {
                    r1 = this;
                    androidx.appcompat.widget.c$d r0 = r1.f2066k
                    androidx.appcompat.widget.c r0 = r0.f2065d
                    androidx.appcompat.widget.c$e r0 = r0.f2060z
                    if (r0 != 0) goto L_0x000a
                    r0 = 0
                    return r0
                L_0x000a:
                    androidx.appcompat.view.menu.n r0 = r0.m2320b()
                    return r0
            }

            @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0589f0
            /* renamed from: b */
            public boolean mo1838b() {
                    r1 = this;
                    androidx.appcompat.widget.c$d r0 = r1.f2066k
                    androidx.appcompat.widget.c r0 = r0.f2065d
                    r0.m2114k()
                    r0 = 1
                    return r0
            }

            @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0589f0
            /* renamed from: c */
            public boolean mo2072c() {
                    r2 = this;
                    androidx.appcompat.widget.c$d r0 = r2.f2066k
                    androidx.appcompat.widget.c r0 = r0.f2065d
                    androidx.appcompat.widget.c$c r1 = r0.f2041B
                    if (r1 == 0) goto L_0x000a
                    r0 = 0
                    return r0
                L_0x000a:
                    r0.m2118g()
                    r0 = 1
                    return r0
            }
        }

        public C0574d(androidx.appcompat.widget.C0570c r3, android.content.Context r4) {
                r2 = this;
                r2.f2065d = r3
                int r0 = p000a.p001a.C0000a.actionOverflowButtonStyle
                r1 = 0
                r2.<init>(r4, r1, r0)
                r4 = 1
                r2.setClickable(r4)
                r2.setFocusable(r4)
                r0 = 0
                r2.setVisibility(r0)
                r2.setEnabled(r4)
                java.lang.CharSequence r4 = r2.getContentDescription()
                androidx.appcompat.widget.C0644v0.m1841a(r2, r4)
                androidx.appcompat.widget.c$d$a r4 = new androidx.appcompat.widget.c$d$a
                r4.<init>(r2, r2, r3)
                r2.setOnTouchListener(r4)
                return
        }

        @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0531a
        /* renamed from: b */
        public boolean mo2112b() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0531a
        /* renamed from: c */
        public boolean mo2111c() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.view.View
        public boolean performClick() {
                r2 = this;
                boolean r0 = super.performClick()
                r1 = 1
                if (r0 == 0) goto L_0x0008
                return r1
            L_0x0008:
                r0 = 0
                r2.playSoundEffect(r0)
                androidx.appcompat.widget.c r0 = r2.f2065d
                r0.m2114k()
                return r1
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int r5, int r6, int r7, int r8) {
                r4 = this;
                boolean r5 = super.setFrame(r5, r6, r7, r8)
                android.graphics.drawable.Drawable r6 = r4.getDrawable()
                android.graphics.drawable.Drawable r7 = r4.getBackground()
                if (r6 == 0) goto L_0x003f
                if (r7 == 0) goto L_0x003f
                int r6 = r4.getWidth()
                int r8 = r4.getHeight()
                int r0 = java.lang.Math.max(r6, r8)
                int r0 = r0 / 2
                int r1 = r4.getPaddingLeft()
                int r2 = r4.getPaddingRight()
                int r1 = r1 - r2
                int r2 = r4.getPaddingTop()
                int r3 = r4.getPaddingBottom()
                int r2 = r2 - r3
                int r6 = r6 + r1
                int r6 = r6 / 2
                int r8 = r8 + r2
                int r8 = r8 / 2
                int r1 = r6 - r0
                int r2 = r8 - r0
                int r6 = r6 + r0
                int r8 = r8 + r0
                androidx.core.graphics.drawable.C0698a.m1604a(r7, r1, r2, r6, r8)
            L_0x003f:
                return r5
        }
    }

    /* renamed from: androidx.appcompat.widget.c$e */
    /* loaded from: classes.dex */
    private class C0576e extends androidx.appcompat.view.menu.C0511o {

        /* renamed from: m */
        final /* synthetic */ androidx.appcompat.widget.C0570c f2067m;

        public C0576e(androidx.appcompat.widget.C0570c r7, android.content.Context r8, androidx.appcompat.view.menu.C0496h r9, android.view.View r10, boolean r11) {
                r6 = this;
                r6.f2067m = r7
                int r5 = p000a.p001a.C0000a.actionOverflowMenuStyle
                r0 = r6
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r0.<init>(r1, r2, r3, r4, r5)
                r8 = 8388613(0x800005, float:1.175495E-38)
                r6.m2327a(r8)
                androidx.appcompat.widget.c$f r7 = r7.f2043D
                r6.m2322a(r7)
                return
        }

        @Override // androidx.appcompat.view.menu.C0511o
        /* renamed from: d */
        protected void mo2110d() {
                r2 = this;
                androidx.appcompat.widget.c r0 = r2.f2067m
                androidx.appcompat.view.menu.h r0 = androidx.appcompat.widget.C0570c.m2129a(r0)
                if (r0 == 0) goto L_0x0011
                androidx.appcompat.widget.c r0 = r2.f2067m
                androidx.appcompat.view.menu.h r0 = androidx.appcompat.widget.C0570c.m2127b(r0)
                r0.close()
            L_0x0011:
                androidx.appcompat.widget.c r0 = r2.f2067m
                r1 = 0
                r0.f2060z = r1
                super.mo2110d()
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    /* loaded from: classes.dex */
    private class C0577f implements androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.widget.C0570c f2068b;

        C0577f(androidx.appcompat.widget.C0570c r1) {
                r0 = this;
                r0.f2068b = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a
        /* renamed from: a */
        public void mo2108a(androidx.appcompat.view.menu.C0496h r3, boolean r4) {
                r2 = this;
                boolean r0 = r3 instanceof androidx.appcompat.view.menu.SubMenuC0523v
                if (r0 == 0) goto L_0x000c
                androidx.appcompat.view.menu.h r0 = r3.mo2297m()
                r1 = 0
                r0.m2402a(r1)
            L_0x000c:
                androidx.appcompat.widget.c r0 = r2.f2068b
                androidx.appcompat.view.menu.p$a r0 = r0.m2444d()
                if (r0 == 0) goto L_0x0017
                r0.mo2108a(r3, r4)
            L_0x0017:
                return
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a
        /* renamed from: a */
        public boolean mo2109a(androidx.appcompat.view.menu.C0496h r4) {
                r3 = this;
                r0 = 0
                if (r4 != 0) goto L_0x0004
                return r0
            L_0x0004:
                androidx.appcompat.widget.c r1 = r3.f2068b
                r2 = r4
                androidx.appcompat.view.menu.v r2 = (androidx.appcompat.view.menu.SubMenuC0523v) r2
                android.view.MenuItem r2 = r2.getItem()
                int r2 = r2.getItemId()
                r1.f2044E = r2
                androidx.appcompat.widget.c r1 = r3.f2068b
                androidx.appcompat.view.menu.p$a r1 = r1.m2444d()
                if (r1 == 0) goto L_0x001f
                boolean r0 = r1.mo2109a(r4)
            L_0x001f:
                return r0
        }
    }

    /* renamed from: androidx.appcompat.widget.c$g */
    /* loaded from: classes.dex */
    private static class C0578g implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.C0570c.C0578g> CREATOR = null;

        /* renamed from: b */
        public int f2069b;

        /* renamed from: androidx.appcompat.widget.c$g$a */
        /* loaded from: classes.dex */
        static class C0579a implements android.os.Parcelable.Creator<androidx.appcompat.widget.C0570c.C0578g> {
            C0579a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.appcompat.widget.C0570c.C0578g createFromParcel(android.os.Parcel r2) {
                    r1 = this;
                    androidx.appcompat.widget.c$g r0 = new androidx.appcompat.widget.c$g
                    r0.<init>(r2)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ androidx.appcompat.widget.C0570c.C0578g createFromParcel(android.os.Parcel r1) {
                    r0 = this;
                    androidx.appcompat.widget.c$g r1 = r0.createFromParcel(r1)
                    return r1
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.appcompat.widget.C0570c.C0578g[] newArray(int r1) {
                    r0 = this;
                    androidx.appcompat.widget.c$g[] r1 = new androidx.appcompat.widget.C0570c.C0578g[r1]
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ androidx.appcompat.widget.C0570c.C0578g[] newArray(int r1) {
                    r0 = this;
                    androidx.appcompat.widget.c$g[] r1 = r0.newArray(r1)
                    return r1
            }
        }

        static {
                androidx.appcompat.widget.c$g$a r0 = new androidx.appcompat.widget.c$g$a
                r0.<init>()
                androidx.appcompat.widget.C0570c.C0578g.CREATOR = r0
                return
        }

        C0578g() {
                r0 = this;
                r0.<init>()
                return
        }

        C0578g(android.os.Parcel r1) {
                r0 = this;
                r0.<init>()
                int r1 = r1.readInt()
                r0.f2069b = r1
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                int r2 = r0.f2069b
                r1.writeInt(r2)
                return
        }
    }

    public C0570c(android.content.Context r3) {
            r2 = this;
            int r0 = p000a.p001a.C0006g.abc_action_menu_layout
            int r1 = p000a.p001a.C0006g.abc_action_menu_item_layout
            r2.<init>(r3, r0, r1)
            android.util.SparseBooleanArray r3 = new android.util.SparseBooleanArray
            r3.<init>()
            r2.f2058x = r3
            androidx.appcompat.widget.c$f r3 = new androidx.appcompat.widget.c$f
            r3.<init>(r2)
            r2.f2043D = r3
            return
    }

    /* renamed from: a */
    private android.view.View m2134a(android.view.MenuItem r7) {
            r6 = this;
            androidx.appcompat.view.menu.q r0 = r6.f1641i
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r2 = r0.getChildCount()
            r3 = 0
        L_0x000d:
            if (r3 >= r2) goto L_0x0024
            android.view.View r4 = r0.getChildAt(r3)
            boolean r5 = r4 instanceof androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a
            if (r5 == 0) goto L_0x0021
            r5 = r4
            androidx.appcompat.view.menu.q$a r5 = (androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a) r5
            androidx.appcompat.view.menu.k r5 = r5.getItemData()
            if (r5 != r7) goto L_0x0021
            return r4
        L_0x0021:
            int r3 = r3 + 1
            goto L_0x000d
        L_0x0024:
            return r1
    }

    /* renamed from: a */
    static /* synthetic */ androidx.appcompat.view.menu.C0496h m2129a(androidx.appcompat.widget.C0570c r0) {
            androidx.appcompat.view.menu.h r0 = r0.f1636d
            return r0
    }

    /* renamed from: b */
    static /* synthetic */ androidx.appcompat.view.menu.C0496h m2127b(androidx.appcompat.widget.C0570c r0) {
            androidx.appcompat.view.menu.h r0 = r0.f1636d
            return r0
    }

    /* renamed from: c */
    static /* synthetic */ androidx.appcompat.view.menu.AbstractC0515q m2125c(androidx.appcompat.widget.C0570c r0) {
            androidx.appcompat.view.menu.q r0 = r0.f1641i
            return r0
    }

    /* renamed from: d */
    static /* synthetic */ androidx.appcompat.view.menu.C0496h m2123d(androidx.appcompat.widget.C0570c r0) {
            androidx.appcompat.view.menu.h r0 = r0.f1636d
            return r0
    }

    /* renamed from: e */
    static /* synthetic */ androidx.appcompat.view.menu.C0496h m2121e(androidx.appcompat.widget.C0570c r0) {
            androidx.appcompat.view.menu.h r0 = r0.f1636d
            return r0
    }

    /* renamed from: f */
    static /* synthetic */ androidx.appcompat.view.menu.AbstractC0515q m2119f(androidx.appcompat.widget.C0570c r0) {
            androidx.appcompat.view.menu.q r0 = r0.f1641i
            return r0
    }

    @Override // androidx.appcompat.view.menu.AbstractC0484b
    /* renamed from: a */
    public android.view.View mo2132a(androidx.appcompat.view.menu.C0501k r3, android.view.View r4, android.view.ViewGroup r5) {
            r2 = this;
            android.view.View r0 = r3.getActionView()
            if (r0 == 0) goto L_0x000c
            boolean r1 = r3.m2354f()
            if (r1 == 0) goto L_0x0010
        L_0x000c:
            android.view.View r0 = super.mo2132a(r3, r4, r5)
        L_0x0010:
            boolean r3 = r3.isActionViewExpanded()
            if (r3 == 0) goto L_0x0019
            r3 = 8
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            r0.setVisibility(r3)
            androidx.appcompat.widget.ActionMenuView r5 = (androidx.appcompat.widget.ActionMenuView) r5
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            boolean r4 = r5.checkLayoutParams(r3)
            if (r4 != 0) goto L_0x0030
            androidx.appcompat.widget.ActionMenuView$c r3 = r5.generateLayoutParams(r3)
            r0.setLayoutParams(r3)
        L_0x0030:
            return r0
    }

    @Override // androidx.appcompat.view.menu.AbstractC0484b, androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo133a(android.content.Context r5, androidx.appcompat.view.menu.C0496h r6) {
            r4 = this;
            super.mo133a(r5, r6)
            android.content.res.Resources r6 = r5.getResources()
            a.a.m.a r5 = p000a.p001a.p006m.C0028a.m4185a(r5)
            boolean r0 = r4.f2049o
            if (r0 != 0) goto L_0x0015
            boolean r0 = r5.m4179g()
            r4.f2048n = r0
        L_0x0015:
            boolean r0 = r4.f2055u
            if (r0 != 0) goto L_0x001f
            int r0 = r5.m4184b()
            r4.f2050p = r0
        L_0x001f:
            boolean r0 = r4.f2053s
            if (r0 != 0) goto L_0x0029
            int r5 = r5.m4183c()
            r4.f2052r = r5
        L_0x0029:
            int r5 = r4.f2050p
            boolean r0 = r4.f2048n
            r1 = 0
            if (r0 == 0) goto L_0x005e
            androidx.appcompat.widget.c$d r0 = r4.f2045k
            if (r0 != 0) goto L_0x0056
            androidx.appcompat.widget.c$d r0 = new androidx.appcompat.widget.c$d
            android.content.Context r2 = r4.f1634b
            r0.<init>(r4, r2)
            r4.f2045k = r0
            boolean r0 = r4.f2047m
            r2 = 0
            if (r0 == 0) goto L_0x004d
            androidx.appcompat.widget.c$d r0 = r4.f2045k
            android.graphics.drawable.Drawable r3 = r4.f2046l
            r0.setImageDrawable(r3)
            r4.f2046l = r1
            r4.f2047m = r2
        L_0x004d:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            androidx.appcompat.widget.c$d r2 = r4.f2045k
            r2.measure(r0, r0)
        L_0x0056:
            androidx.appcompat.widget.c$d r0 = r4.f2045k
            int r0 = r0.getMeasuredWidth()
            int r5 = r5 - r0
            goto L_0x0060
        L_0x005e:
            r4.f2045k = r1
        L_0x0060:
            r4.f2051q = r5
            r5 = 1113587712(0x42600000, float:56.0)
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r5
            int r5 = (int) r6
            r4.f2057w = r5
            r4.f2059y = r1
            return
    }

    /* renamed from: a */
    public void m2136a(android.content.res.Configuration r2) {
            r1 = this;
            boolean r2 = r1.f2053s
            if (r2 != 0) goto L_0x0010
            android.content.Context r2 = r1.f1635c
            a.a.m.a r2 = p000a.p001a.p006m.C0028a.m4185a(r2)
            int r2 = r2.m4183c()
            r1.f2052r = r2
        L_0x0010:
            androidx.appcompat.view.menu.h r2 = r1.f1636d
            if (r2 == 0) goto L_0x0018
            r0 = 1
            r2.mo87b(r0)
        L_0x0018:
            return
    }

    /* renamed from: a */
    public void m2135a(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.widget.c$d r0 = r1.f2045k
            if (r0 == 0) goto L_0x0008
            r0.setImageDrawable(r2)
            goto L_0x000d
        L_0x0008:
            r0 = 1
            r1.f2047m = r0
            r1.f2046l = r2
        L_0x000d:
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo130a(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.appcompat.widget.C0570c.C0578g
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            androidx.appcompat.widget.c$g r2 = (androidx.appcompat.widget.C0570c.C0578g) r2
            int r2 = r2.f2069b
            if (r2 <= 0) goto L_0x001c
            androidx.appcompat.view.menu.h r0 = r1.f1636d
            android.view.MenuItem r2 = r0.findItem(r2)
            if (r2 == 0) goto L_0x001c
            android.view.SubMenu r2 = r2.getSubMenu()
            androidx.appcompat.view.menu.v r2 = (androidx.appcompat.view.menu.SubMenuC0523v) r2
            r1.mo124a(r2)
        L_0x001c:
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0484b, androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo126a(androidx.appcompat.view.menu.C0496h r1, boolean r2) {
            r0 = this;
            r0.m2122e()
            super.mo126a(r1, r2)
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0484b
    /* renamed from: a */
    public void mo2131a(androidx.appcompat.view.menu.C0501k r2, androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a r3) {
            r1 = this;
            r0 = 0
            r3.mo148a(r2, r0)
            androidx.appcompat.view.menu.q r2 = r1.f1641i
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            androidx.appcompat.view.menu.ActionMenuItemView r3 = (androidx.appcompat.view.menu.ActionMenuItemView) r3
            r3.setItemInvoker(r2)
            androidx.appcompat.widget.c$b r2 = r1.f2042C
            if (r2 != 0) goto L_0x0018
            androidx.appcompat.widget.c$b r2 = new androidx.appcompat.widget.c$b
            r2.<init>(r1)
            r1.f2042C = r2
        L_0x0018:
            androidx.appcompat.widget.c$b r2 = r1.f2042C
            r3.setPopupCallback(r2)
            return
    }

    /* renamed from: a */
    public void m2130a(androidx.appcompat.widget.ActionMenuView r2) {
            r1 = this;
            r1.f1641i = r2
            androidx.appcompat.view.menu.h r0 = r1.f1636d
            r2.mo142a(r0)
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0484b, androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo123a(boolean r5) {
            r4 = this;
            super.mo123a(r5)
            androidx.appcompat.view.menu.q r5 = r4.f1641i
            android.view.View r5 = (android.view.View) r5
            r5.requestLayout()
            androidx.appcompat.view.menu.h r5 = r4.f1636d
            r0 = 0
            if (r5 == 0) goto L_0x002c
            java.util.ArrayList r5 = r5.m2397c()
            int r1 = r5.size()
            r2 = 0
        L_0x0018:
            if (r2 >= r1) goto L_0x002c
            java.lang.Object r3 = r5.get(r2)
            androidx.appcompat.view.menu.k r3 = (androidx.appcompat.view.menu.C0501k) r3
            a.g.l.b r3 = r3.mo2370a()
            if (r3 == 0) goto L_0x0029
            r3.m3492a(r4)
        L_0x0029:
            int r2 = r2 + 1
            goto L_0x0018
        L_0x002c:
            androidx.appcompat.view.menu.h r5 = r4.f1636d
            if (r5 == 0) goto L_0x0035
            java.util.ArrayList r5 = r5.m2378j()
            goto L_0x0036
        L_0x0035:
            r5 = 0
        L_0x0036:
            boolean r1 = r4.f2048n
            if (r1 == 0) goto L_0x0053
            if (r5 == 0) goto L_0x0053
            int r1 = r5.size()
            r2 = 1
            if (r1 != r2) goto L_0x0050
            java.lang.Object r5 = r5.get(r0)
            androidx.appcompat.view.menu.k r5 = (androidx.appcompat.view.menu.C0501k) r5
            boolean r5 = r5.isActionViewExpanded()
            r0 = r5 ^ 1
            goto L_0x0053
        L_0x0050:
            if (r1 <= 0) goto L_0x0053
            r0 = 1
        L_0x0053:
            androidx.appcompat.widget.c$d r5 = r4.f2045k
            if (r0 == 0) goto L_0x0083
            if (r5 != 0) goto L_0x0062
            androidx.appcompat.widget.c$d r5 = new androidx.appcompat.widget.c$d
            android.content.Context r0 = r4.f1634b
            r5.<init>(r4, r0)
            r4.f2045k = r5
        L_0x0062:
            androidx.appcompat.widget.c$d r5 = r4.f2045k
            android.view.ViewParent r5 = r5.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            androidx.appcompat.view.menu.q r0 = r4.f1641i
            if (r5 == r0) goto L_0x0094
            if (r5 == 0) goto L_0x0075
            androidx.appcompat.widget.c$d r0 = r4.f2045k
            r5.removeView(r0)
        L_0x0075:
            androidx.appcompat.view.menu.q r5 = r4.f1641i
            androidx.appcompat.widget.ActionMenuView r5 = (androidx.appcompat.widget.ActionMenuView) r5
            androidx.appcompat.widget.c$d r0 = r4.f2045k
            androidx.appcompat.widget.ActionMenuView$c r1 = r5.m2260e()
            r5.addView(r0, r1)
            goto L_0x0094
        L_0x0083:
            if (r5 == 0) goto L_0x0094
            android.view.ViewParent r5 = r5.getParent()
            androidx.appcompat.view.menu.q r0 = r4.f1641i
            if (r5 != r0) goto L_0x0094
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            androidx.appcompat.widget.c$d r5 = r4.f2045k
            r0.removeView(r5)
        L_0x0094:
            androidx.appcompat.view.menu.q r5 = r4.f1641i
            androidx.appcompat.widget.ActionMenuView r5 = (androidx.appcompat.widget.ActionMenuView) r5
            boolean r0 = r4.f2048n
            r5.setOverflowReserved(r0)
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0484b
    /* renamed from: a */
    public boolean mo2137a(int r1, androidx.appcompat.view.menu.C0501k r2) {
            r0 = this;
            boolean r1 = r2.m2352h()
            return r1
    }

    @Override // androidx.appcompat.view.menu.AbstractC0484b
    /* renamed from: a */
    public boolean mo2133a(android.view.ViewGroup r3, int r4) {
            r2 = this;
            android.view.View r0 = r3.getChildAt(r4)
            androidx.appcompat.widget.c$d r1 = r2.f2045k
            if (r0 != r1) goto L_0x000a
            r3 = 0
            return r3
        L_0x000a:
            boolean r3 = super.mo2133a(r3, r4)
            return r3
    }

    @Override // androidx.appcompat.view.menu.AbstractC0484b, androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public boolean mo124a(androidx.appcompat.view.menu.SubMenuC0523v r8) {
            r7 = this;
            boolean r0 = r8.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = r8
        L_0x0009:
            android.view.Menu r2 = r0.m2293t()
            androidx.appcompat.view.menu.h r3 = r7.f1636d
            if (r2 == r3) goto L_0x0018
            android.view.Menu r0 = r0.m2293t()
            androidx.appcompat.view.menu.v r0 = (androidx.appcompat.view.menu.SubMenuC0523v) r0
            goto L_0x0009
        L_0x0018:
            android.view.MenuItem r0 = r0.getItem()
            android.view.View r0 = r7.m2134a(r0)
            if (r0 != 0) goto L_0x0023
            return r1
        L_0x0023:
            android.view.MenuItem r2 = r8.getItem()
            int r2 = r2.getItemId()
            r7.f2044E = r2
            int r2 = r8.size()
            r3 = 0
        L_0x0032:
            r4 = 1
            if (r3 >= r2) goto L_0x004a
            android.view.MenuItem r5 = r8.getItem(r3)
            boolean r6 = r5.isVisible()
            if (r6 == 0) goto L_0x0047
            android.graphics.drawable.Drawable r5 = r5.getIcon()
            if (r5 == 0) goto L_0x0047
            r1 = 1
            goto L_0x004a
        L_0x0047:
            int r3 = r3 + 1
            goto L_0x0032
        L_0x004a:
            androidx.appcompat.widget.c$a r2 = new androidx.appcompat.widget.c$a
            android.content.Context r3 = r7.f1635c
            r2.<init>(r7, r3, r8, r0)
            r7.f2040A = r2
            androidx.appcompat.widget.c$a r0 = r7.f2040A
            r0.m2321a(r1)
            androidx.appcompat.widget.c$a r0 = r7.f2040A
            r0.m2318e()
            super.mo124a(r8)
            return r4
    }

    @Override // androidx.appcompat.view.menu.AbstractC0484b
    /* renamed from: b */
    public androidx.appcompat.view.menu.AbstractC0515q mo2128b(android.view.ViewGroup r2) {
            r1 = this;
            androidx.appcompat.view.menu.q r0 = r1.f1641i
            androidx.appcompat.view.menu.q r2 = super.mo2128b(r2)
            if (r0 == r2) goto L_0x000e
            r0 = r2
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            r0.setPresenter(r1)
        L_0x000e:
            return r2
    }

    /* renamed from: b */
    public void m2126b(boolean r1) {
            r0 = this;
            r0.f2056v = r1
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: b */
    public boolean mo122b() {
            r19 = this;
            r0 = r19
            androidx.appcompat.view.menu.h r1 = r0.f1636d
            r2 = 0
            if (r1 == 0) goto L_0x0010
            java.util.ArrayList r1 = r1.m2375n()
            int r3 = r1.size()
            goto L_0x0012
        L_0x0010:
            r1 = 0
            r3 = 0
        L_0x0012:
            int r4 = r0.f2052r
            int r5 = r0.f2051q
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            androidx.appcompat.view.menu.q r7 = r0.f1641i
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r11 = r4
            r4 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x0023:
            if (r4 >= r3) goto L_0x004c
            java.lang.Object r13 = r1.get(r4)
            androidx.appcompat.view.menu.k r13 = (androidx.appcompat.view.menu.C0501k) r13
            boolean r14 = r13.m2349k()
            if (r14 == 0) goto L_0x0034
            int r9 = r9 + 1
            goto L_0x003e
        L_0x0034:
            boolean r14 = r13.m2350j()
            if (r14 == 0) goto L_0x003d
            int r10 = r10 + 1
            goto L_0x003e
        L_0x003d:
            r8 = 1
        L_0x003e:
            boolean r12 = r0.f2056v
            if (r12 == 0) goto L_0x0049
            boolean r12 = r13.isActionViewExpanded()
            if (r12 == 0) goto L_0x0049
            r11 = 0
        L_0x0049:
            int r4 = r4 + 1
            goto L_0x0023
        L_0x004c:
            boolean r4 = r0.f2048n
            if (r4 == 0) goto L_0x0057
            if (r8 != 0) goto L_0x0055
            int r10 = r10 + r9
            if (r10 <= r11) goto L_0x0057
        L_0x0055:
            int r11 = r11 + (-1)
        L_0x0057:
            int r11 = r11 - r9
            android.util.SparseBooleanArray r4 = r0.f2058x
            r4.clear()
            boolean r8 = r0.f2054t
            if (r8 == 0) goto L_0x006a
            int r8 = r0.f2057w
            int r9 = r5 / r8
            int r10 = r5 % r8
            int r10 = r10 / r9
            int r8 = r8 + r10
            goto L_0x006c
        L_0x006a:
            r8 = 0
            r9 = 0
        L_0x006c:
            r10 = r5
            r5 = 0
            r13 = 0
        L_0x006f:
            if (r5 >= r3) goto L_0x0156
            java.lang.Object r14 = r1.get(r5)
            androidx.appcompat.view.menu.k r14 = (androidx.appcompat.view.menu.C0501k) r14
            boolean r15 = r14.m2349k()
            if (r15 == 0) goto L_0x00b2
            android.view.View r15 = r0.f2059y
            android.view.View r15 = r0.mo2132a(r14, r15, r7)
            android.view.View r12 = r0.f2059y
            if (r12 != 0) goto L_0x0089
            r0.f2059y = r15
        L_0x0089:
            boolean r12 = r0.f2054t
            if (r12 == 0) goto L_0x0093
            int r12 = androidx.appcompat.widget.ActionMenuView.m2266a(r15, r8, r9, r6, r2)
            int r9 = r9 - r12
            goto L_0x0096
        L_0x0093:
            r15.measure(r6, r6)
        L_0x0096:
            int r12 = r15.getMeasuredWidth()
            int r10 = r10 - r12
            if (r13 != 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r12 = r13
        L_0x009f:
            int r13 = r14.getGroupId()
            r15 = 1
            if (r13 == 0) goto L_0x00a9
            r4.put(r13, r15)
        L_0x00a9:
            r14.m2357d(r15)
            r17 = r3
            r13 = r12
        L_0x00af:
            r0 = 0
            goto L_0x014d
        L_0x00b2:
            boolean r12 = r14.m2350j()
            if (r12 == 0) goto L_0x0147
            int r12 = r14.getGroupId()
            boolean r15 = r4.get(r12)
            if (r11 > 0) goto L_0x00c4
            if (r15 == 0) goto L_0x00ce
        L_0x00c4:
            if (r10 <= 0) goto L_0x00ce
            boolean r2 = r0.f2054t
            if (r2 == 0) goto L_0x00cc
            if (r9 <= 0) goto L_0x00ce
        L_0x00cc:
            r2 = 1
            goto L_0x00cf
        L_0x00ce:
            r2 = 0
        L_0x00cf:
            r16 = r2
            if (r2 == 0) goto L_0x010d
            android.view.View r2 = r0.f2059y
            android.view.View r2 = r0.mo2132a(r14, r2, r7)
            r17 = r3
            android.view.View r3 = r0.f2059y
            if (r3 != 0) goto L_0x00e1
            r0.f2059y = r2
        L_0x00e1:
            boolean r3 = r0.f2054t
            if (r3 == 0) goto L_0x00f1
            r3 = 0
            int r18 = androidx.appcompat.widget.ActionMenuView.m2266a(r2, r8, r9, r6, r3)
            int r9 = r9 - r18
            if (r18 != 0) goto L_0x00f4
            r16 = 0
            goto L_0x00f4
        L_0x00f1:
            r2.measure(r6, r6)
        L_0x00f4:
            int r2 = r2.getMeasuredWidth()
            int r10 = r10 - r2
            if (r13 != 0) goto L_0x00fc
            r13 = r2
        L_0x00fc:
            boolean r2 = r0.f2054t
            if (r2 == 0) goto L_0x0103
            if (r10 < 0) goto L_0x0109
            goto L_0x0107
        L_0x0103:
            int r2 = r10 + r13
            if (r2 <= 0) goto L_0x0109
        L_0x0107:
            r2 = 1
            goto L_0x010a
        L_0x0109:
            r2 = 0
        L_0x010a:
            r2 = r16 & r2
            goto L_0x010f
        L_0x010d:
            r17 = r3
        L_0x010f:
            if (r2 == 0) goto L_0x0118
            if (r12 == 0) goto L_0x0118
            r3 = 1
            r4.put(r12, r3)
            goto L_0x013e
        L_0x0118:
            if (r15 == 0) goto L_0x013e
            r3 = 0
            r4.put(r12, r3)
            r3 = 0
        L_0x011f:
            if (r3 >= r5) goto L_0x013e
            java.lang.Object r15 = r1.get(r3)
            androidx.appcompat.view.menu.k r15 = (androidx.appcompat.view.menu.C0501k) r15
            int r0 = r15.getGroupId()
            if (r0 != r12) goto L_0x0139
            boolean r0 = r15.m2352h()
            if (r0 == 0) goto L_0x0135
            int r11 = r11 + 1
        L_0x0135:
            r0 = 0
            r15.m2357d(r0)
        L_0x0139:
            int r3 = r3 + 1
            r0 = r19
            goto L_0x011f
        L_0x013e:
            if (r2 == 0) goto L_0x0142
            int r11 = r11 + (-1)
        L_0x0142:
            r14.m2357d(r2)
            goto L_0x00af
        L_0x0147:
            r17 = r3
            r0 = 0
            r14.m2357d(r0)
        L_0x014d:
            int r5 = r5 + 1
            r2 = 0
            r0 = r19
            r3 = r17
            goto L_0x006f
        L_0x0156:
            r2 = 1
            return r2
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: c */
    public android.os.Parcelable mo117c() {
            r2 = this;
            androidx.appcompat.widget.c$g r0 = new androidx.appcompat.widget.c$g
            r0.<init>()
            int r1 = r2.f2044E
            r0.f2069b = r1
            return r0
    }

    /* renamed from: c */
    public void m2124c(boolean r1) {
            r0 = this;
            r0.f2048n = r1
            r1 = 1
            r0.f2049o = r1
            return
    }

    /* renamed from: e */
    public boolean m2122e() {
            r2 = this;
            boolean r0 = r2.m2118g()
            boolean r1 = r2.m2117h()
            r0 = r0 | r1
            return r0
    }

    /* renamed from: f */
    public android.graphics.drawable.Drawable m2120f() {
            r1 = this;
            androidx.appcompat.widget.c$d r0 = r1.f2045k
            if (r0 == 0) goto L_0x0009
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
        L_0x0009:
            boolean r0 = r1.f2047m
            if (r0 == 0) goto L_0x0010
            android.graphics.drawable.Drawable r0 = r1.f2046l
            return r0
        L_0x0010:
            r0 = 0
            return r0
    }

    /* renamed from: g */
    public boolean m2118g() {
            r3 = this;
            androidx.appcompat.widget.c$c r0 = r3.f2041B
            r1 = 1
            if (r0 == 0) goto L_0x0012
            androidx.appcompat.view.menu.q r2 = r3.f1641i
            if (r2 == 0) goto L_0x0012
            android.view.View r2 = (android.view.View) r2
            r2.removeCallbacks(r0)
            r0 = 0
            r3.f2041B = r0
            return r1
        L_0x0012:
            androidx.appcompat.widget.c$e r0 = r3.f2060z
            if (r0 == 0) goto L_0x001a
            r0.m2328a()
            return r1
        L_0x001a:
            r0 = 0
            return r0
    }

    /* renamed from: h */
    public boolean m2117h() {
            r1 = this;
            androidx.appcompat.widget.c$a r0 = r1.f2040A
            if (r0 == 0) goto L_0x0009
            r0.m2328a()
            r0 = 1
            return r0
        L_0x0009:
            r0 = 0
            return r0
    }

    /* renamed from: i */
    public boolean m2116i() {
            r1 = this;
            androidx.appcompat.widget.c$c r0 = r1.f2041B
            if (r0 != 0) goto L_0x000d
            boolean r0 = r1.m2115j()
            if (r0 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            r0 = 0
            goto L_0x000e
        L_0x000d:
            r0 = 1
        L_0x000e:
            return r0
    }

    /* renamed from: j */
    public boolean m2115j() {
            r1 = this;
            androidx.appcompat.widget.c$e r0 = r1.f2060z
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.m2319c()
            if (r0 == 0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            return r0
    }

    /* renamed from: k */
    public boolean m2114k() {
            r7 = this;
            boolean r0 = r7.f2048n
            if (r0 == 0) goto L_0x0044
            boolean r0 = r7.m2115j()
            if (r0 != 0) goto L_0x0044
            androidx.appcompat.view.menu.h r0 = r7.f1636d
            if (r0 == 0) goto L_0x0044
            androidx.appcompat.view.menu.q r1 = r7.f1641i
            if (r1 == 0) goto L_0x0044
            androidx.appcompat.widget.c$c r1 = r7.f2041B
            if (r1 != 0) goto L_0x0044
            java.util.ArrayList r0 = r0.m2378j()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0044
            androidx.appcompat.widget.c$e r0 = new androidx.appcompat.widget.c$e
            android.content.Context r3 = r7.f1635c
            androidx.appcompat.view.menu.h r4 = r7.f1636d
            androidx.appcompat.widget.c$d r5 = r7.f2045k
            r6 = 1
            r1 = r0
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            androidx.appcompat.widget.c$c r1 = new androidx.appcompat.widget.c$c
            r1.<init>(r7, r0)
            r7.f2041B = r1
            androidx.appcompat.view.menu.q r0 = r7.f1641i
            android.view.View r0 = (android.view.View) r0
            androidx.appcompat.widget.c$c r1 = r7.f2041B
            r0.post(r1)
            r0 = 0
            super.mo124a(r0)
            r0 = 1
            return r0
        L_0x0044:
            r0 = 0
            return r0
    }
}
