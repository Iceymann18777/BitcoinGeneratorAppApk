package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class Toolbar extends android.view.ViewGroup {

    /* renamed from: A */
    private int f1973A;

    /* renamed from: B */
    private int f1974B;

    /* renamed from: C */
    private boolean f1975C;

    /* renamed from: D */
    private boolean f1976D;

    /* renamed from: E */
    private final java.util.ArrayList<android.view.View> f1977E;

    /* renamed from: F */
    private final java.util.ArrayList<android.view.View> f1978F;

    /* renamed from: G */
    private final int[] f1979G;

    /* renamed from: H */
    androidx.appcompat.widget.Toolbar.AbstractC0560f f1980H;

    /* renamed from: I */
    private final androidx.appcompat.widget.ActionMenuView.AbstractC0535e f1981I;

    /* renamed from: J */
    private androidx.appcompat.widget.C0640u0 f1982J;

    /* renamed from: K */
    private androidx.appcompat.widget.C0570c f1983K;

    /* renamed from: L */
    private androidx.appcompat.widget.Toolbar.C0558d f1984L;

    /* renamed from: M */
    private androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a f1985M;

    /* renamed from: N */
    private androidx.appcompat.view.menu.C0496h.AbstractC0497a f1986N;

    /* renamed from: O */
    private boolean f1987O;

    /* renamed from: P */
    private final java.lang.Runnable f1988P;

    /* renamed from: b */
    private androidx.appcompat.widget.ActionMenuView f1989b;

    /* renamed from: c */
    private android.widget.TextView f1990c;

    /* renamed from: d */
    private android.widget.TextView f1991d;

    /* renamed from: e */
    private android.widget.ImageButton f1992e;

    /* renamed from: f */
    private android.widget.ImageView f1993f;

    /* renamed from: g */
    private android.graphics.drawable.Drawable f1994g;

    /* renamed from: h */
    private java.lang.CharSequence f1995h;

    /* renamed from: i */
    android.widget.ImageButton f1996i;

    /* renamed from: j */
    android.view.View f1997j;

    /* renamed from: k */
    private android.content.Context f1998k;

    /* renamed from: l */
    private int f1999l;

    /* renamed from: m */
    private int f2000m;

    /* renamed from: n */
    private int f2001n;

    /* renamed from: o */
    int f2002o;

    /* renamed from: p */
    private int f2003p;

    /* renamed from: q */
    private int f2004q;

    /* renamed from: r */
    private int f2005r;

    /* renamed from: s */
    private int f2006s;

    /* renamed from: t */
    private int f2007t;

    /* renamed from: u */
    private androidx.appcompat.widget.C0617l0 f2008u;

    /* renamed from: v */
    private int f2009v;

    /* renamed from: w */
    private int f2010w;

    /* renamed from: x */
    private int f2011x;

    /* renamed from: y */
    private java.lang.CharSequence f2012y;

    /* renamed from: z */
    private java.lang.CharSequence f2013z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    /* loaded from: classes.dex */
    class C0555a implements androidx.appcompat.widget.ActionMenuView.AbstractC0535e {

        /* renamed from: a */
        final /* synthetic */ androidx.appcompat.widget.Toolbar f2014a;

        C0555a(androidx.appcompat.widget.Toolbar r1) {
                r0 = this;
                r0.f2014a = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0535e
        public boolean onMenuItemClick(android.view.MenuItem r2) {
                r1 = this;
                androidx.appcompat.widget.Toolbar r0 = r1.f2014a
                androidx.appcompat.widget.Toolbar$f r0 = r0.f1980H
                if (r0 == 0) goto L_0x000b
                boolean r2 = r0.onMenuItemClick(r2)
                return r2
            L_0x000b:
                r2 = 0
                return r2
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    /* loaded from: classes.dex */
    class RunnableC0556b implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.widget.Toolbar f2015b;

        RunnableC0556b(androidx.appcompat.widget.Toolbar r1) {
                r0 = this;
                r0.f2015b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                androidx.appcompat.widget.Toolbar r0 = r1.f2015b
                r0.m2165k()
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    /* loaded from: classes.dex */
    class View$OnClickListenerC0557c implements android.view.View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.widget.Toolbar f2016b;

        View$OnClickListenerC0557c(androidx.appcompat.widget.Toolbar r1) {
                r0 = this;
                r0.f2016b = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                androidx.appcompat.widget.Toolbar r1 = r0.f2016b
                r1.m2175c()
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    /* loaded from: classes.dex */
    private class C0558d implements androidx.appcompat.view.menu.AbstractC0513p {

        /* renamed from: b */
        androidx.appcompat.view.menu.C0496h f2017b;

        /* renamed from: c */
        androidx.appcompat.view.menu.C0501k f2018c;

        /* renamed from: d */
        final /* synthetic */ androidx.appcompat.widget.Toolbar f2019d;

        C0558d(androidx.appcompat.widget.Toolbar r1) {
                r0 = this;
                r0.f2019d = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p
        /* renamed from: a */
        public int mo136a() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p
        /* renamed from: a */
        public void mo133a(android.content.Context r2, androidx.appcompat.view.menu.C0496h r3) {
                r1 = this;
                androidx.appcompat.view.menu.h r2 = r1.f2017b
                if (r2 == 0) goto L_0x000b
                androidx.appcompat.view.menu.k r0 = r1.f2018c
                if (r0 == 0) goto L_0x000b
                r2.mo2300a(r0)
            L_0x000b:
                r1.f2017b = r3
                return
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p
        /* renamed from: a */
        public void mo130a(android.os.Parcelable r1) {
                r0 = this;
                return
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p
        /* renamed from: a */
        public void mo126a(androidx.appcompat.view.menu.C0496h r1, boolean r2) {
                r0 = this;
                return
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p
        /* renamed from: a */
        public void mo123a(boolean r5) {
                r4 = this;
                androidx.appcompat.view.menu.k r5 = r4.f2018c
                if (r5 == 0) goto L_0x0028
                androidx.appcompat.view.menu.h r5 = r4.f2017b
                r0 = 0
                if (r5 == 0) goto L_0x001f
                int r5 = r5.size()
                r1 = 0
            L_0x000e:
                if (r1 >= r5) goto L_0x001f
                androidx.appcompat.view.menu.h r2 = r4.f2017b
                android.view.MenuItem r2 = r2.getItem(r1)
                androidx.appcompat.view.menu.k r3 = r4.f2018c
                if (r2 != r3) goto L_0x001c
                r0 = 1
                goto L_0x001f
            L_0x001c:
                int r1 = r1 + 1
                goto L_0x000e
            L_0x001f:
                if (r0 != 0) goto L_0x0028
                androidx.appcompat.view.menu.h r5 = r4.f2017b
                androidx.appcompat.view.menu.k r0 = r4.f2018c
                r4.mo119b(r5, r0)
            L_0x0028:
                return
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p
        /* renamed from: a */
        public boolean mo127a(androidx.appcompat.view.menu.C0496h r4, androidx.appcompat.view.menu.C0501k r5) {
                r3 = this;
                androidx.appcompat.widget.Toolbar r4 = r3.f2019d
                r4.m2171e()
                androidx.appcompat.widget.Toolbar r4 = r3.f2019d
                android.widget.ImageButton r4 = r4.f1996i
                android.view.ViewParent r4 = r4.getParent()
                androidx.appcompat.widget.Toolbar r0 = r3.f2019d
                if (r4 == r0) goto L_0x0023
                boolean r1 = r4 instanceof android.view.ViewGroup
                if (r1 == 0) goto L_0x001c
                android.view.ViewGroup r4 = (android.view.ViewGroup) r4
                android.widget.ImageButton r0 = r0.f1996i
                r4.removeView(r0)
            L_0x001c:
                androidx.appcompat.widget.Toolbar r4 = r3.f2019d
                android.widget.ImageButton r0 = r4.f1996i
                r4.addView(r0)
            L_0x0023:
                androidx.appcompat.widget.Toolbar r4 = r3.f2019d
                android.view.View r0 = r5.getActionView()
                r4.f1997j = r0
                r3.f2018c = r5
                androidx.appcompat.widget.Toolbar r4 = r3.f2019d
                android.view.View r4 = r4.f1997j
                android.view.ViewParent r4 = r4.getParent()
                androidx.appcompat.widget.Toolbar r0 = r3.f2019d
                if (r4 == r0) goto L_0x0065
                boolean r1 = r4 instanceof android.view.ViewGroup
                if (r1 == 0) goto L_0x0044
                android.view.ViewGroup r4 = (android.view.ViewGroup) r4
                android.view.View r0 = r0.f1997j
                r4.removeView(r0)
            L_0x0044:
                androidx.appcompat.widget.Toolbar r4 = r3.f2019d
                androidx.appcompat.widget.Toolbar$e r4 = r4.generateDefaultLayoutParams()
                r0 = 8388611(0x800003, float:1.1754948E-38)
                androidx.appcompat.widget.Toolbar r1 = r3.f2019d
                int r2 = r1.f2002o
                r2 = r2 & 112(0x70, float:1.57E-43)
                r0 = r0 | r2
                r4.f1393a = r0
                r0 = 2
                r4.f2020b = r0
                android.view.View r0 = r1.f1997j
                r0.setLayoutParams(r4)
                androidx.appcompat.widget.Toolbar r4 = r3.f2019d
                android.view.View r0 = r4.f1997j
                r4.addView(r0)
            L_0x0065:
                androidx.appcompat.widget.Toolbar r4 = r3.f2019d
                r4.m2166j()
                androidx.appcompat.widget.Toolbar r4 = r3.f2019d
                r4.requestLayout()
                r4 = 1
                r5.m2363a(r4)
                androidx.appcompat.widget.Toolbar r5 = r3.f2019d
                android.view.View r5 = r5.f1997j
                boolean r0 = r5 instanceof p000a.p001a.p006m.AbstractC0031c
                if (r0 == 0) goto L_0x0080
                a.a.m.c r5 = (p000a.p001a.p006m.AbstractC0031c) r5
                r5.mo2232b()
            L_0x0080:
                return r4
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p
        /* renamed from: a */
        public boolean mo124a(androidx.appcompat.view.menu.SubMenuC0523v r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p
        /* renamed from: b */
        public boolean mo122b() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p
        /* renamed from: b */
        public boolean mo119b(androidx.appcompat.view.menu.C0496h r2, androidx.appcompat.view.menu.C0501k r3) {
                r1 = this;
                androidx.appcompat.widget.Toolbar r2 = r1.f2019d
                android.view.View r2 = r2.f1997j
                boolean r0 = r2 instanceof p000a.p001a.p006m.AbstractC0031c
                if (r0 == 0) goto L_0x000d
                a.a.m.c r2 = (p000a.p001a.p006m.AbstractC0031c) r2
                r2.mo2227c()
            L_0x000d:
                androidx.appcompat.widget.Toolbar r2 = r1.f2019d
                android.view.View r0 = r2.f1997j
                r2.removeView(r0)
                androidx.appcompat.widget.Toolbar r2 = r1.f2019d
                android.widget.ImageButton r0 = r2.f1996i
                r2.removeView(r0)
                androidx.appcompat.widget.Toolbar r2 = r1.f2019d
                r0 = 0
                r2.f1997j = r0
                r2.m2194a()
                r1.f2018c = r0
                androidx.appcompat.widget.Toolbar r2 = r1.f2019d
                r2.requestLayout()
                r2 = 0
                r3.m2363a(r2)
                r2 = 1
                return r2
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p
        /* renamed from: c */
        public android.os.Parcelable mo117c() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    /* loaded from: classes.dex */
    public static class C0559e extends androidx.appcompat.app.AbstractC0428a.C0429a {

        /* renamed from: b */
        int f2020b;

        public C0559e(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.f2020b = r1
                r1 = 8388627(0x800013, float:1.175497E-38)
                r0.f1393a = r1
                return
        }

        public C0559e(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.f2020b = r1
                return
        }

        public C0559e(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.f2020b = r1
                return
        }

        public C0559e(android.view.ViewGroup.MarginLayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.f2020b = r0
                r1.m2157a(r2)
                return
        }

        public C0559e(androidx.appcompat.app.AbstractC0428a.C0429a r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.f2020b = r1
                return
        }

        public C0559e(androidx.appcompat.widget.Toolbar.C0559e r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.f2020b = r0
                int r2 = r2.f2020b
                r1.f2020b = r2
                return
        }

        /* renamed from: a */
        void m2157a(android.view.ViewGroup.MarginLayoutParams r2) {
                r1 = this;
                int r0 = r2.leftMargin
                r1.leftMargin = r0
                int r0 = r2.topMargin
                r1.topMargin = r0
                int r0 = r2.rightMargin
                r1.rightMargin = r0
                int r2 = r2.bottomMargin
                r1.bottomMargin = r2
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    /* loaded from: classes.dex */
    public interface AbstractC0560f {
        boolean onMenuItemClick(android.view.MenuItem r1);
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    /* loaded from: classes.dex */
    public static class C0561g extends p000a.p033i.p034a.AbstractC0237a {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.Toolbar.C0561g> CREATOR = null;

        /* renamed from: d */
        int f2021d;

        /* renamed from: e */
        boolean f2022e;

        /* renamed from: androidx.appcompat.widget.Toolbar$g$a */
        /* loaded from: classes.dex */
        static class C0562a implements android.os.Parcelable.ClassLoaderCreator<androidx.appcompat.widget.Toolbar.C0561g> {
            C0562a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public androidx.appcompat.widget.Toolbar.C0561g createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    androidx.appcompat.widget.Toolbar$g r0 = new androidx.appcompat.widget.Toolbar$g
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public androidx.appcompat.widget.Toolbar.C0561g createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    androidx.appcompat.widget.Toolbar$g r0 = new androidx.appcompat.widget.Toolbar$g
                    r0.<init>(r2, r3)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                    r0 = this;
                    androidx.appcompat.widget.Toolbar$g r1 = r0.createFromParcel(r1)
                    return r1
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ androidx.appcompat.widget.Toolbar.C0561g createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                    r0 = this;
                    androidx.appcompat.widget.Toolbar$g r1 = r0.createFromParcel(r1, r2)
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public androidx.appcompat.widget.Toolbar.C0561g[] newArray(int r1) {
                    r0 = this;
                    androidx.appcompat.widget.Toolbar$g[] r1 = new androidx.appcompat.widget.Toolbar.C0561g[r1]
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    androidx.appcompat.widget.Toolbar$g[] r1 = r0.newArray(r1)
                    return r1
            }
        }

        static {
                androidx.appcompat.widget.Toolbar$g$a r0 = new androidx.appcompat.widget.Toolbar$g$a
                r0.<init>()
                androidx.appcompat.widget.Toolbar.C0561g.CREATOR = r0
                return
        }

        public C0561g(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                int r2 = r1.readInt()
                r0.f2021d = r2
                int r1 = r1.readInt()
                if (r1 == 0) goto L_0x0011
                r1 = 1
                goto L_0x0012
            L_0x0011:
                r1 = 0
            L_0x0012:
                r0.f2022e = r1
                return
        }

        public C0561g(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // p000a.p033i.p034a.AbstractC0237a, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.f2021d
                r1.writeInt(r2)
                boolean r2 = r0.f2022e
                r1.writeInt(r2)
                return
        }
    }

    public Toolbar(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public Toolbar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = p000a.p001a.C0000a.toolbarStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public Toolbar(android.content.Context r7, android.util.AttributeSet r8, int r9) {
            r6 = this;
            r6.<init>(r7, r8, r9)
            r7 = 8388627(0x800013, float:1.175497E-38)
            r6.f2011x = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f1977E = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f1978F = r7
            r7 = 2
            int[] r7 = new int[r7]
            r6.f1979G = r7
            androidx.appcompat.widget.Toolbar$a r7 = new androidx.appcompat.widget.Toolbar$a
            r7.<init>(r6)
            r6.f1981I = r7
            androidx.appcompat.widget.Toolbar$b r7 = new androidx.appcompat.widget.Toolbar$b
            r7.<init>(r6)
            r6.f1988P = r7
            android.content.Context r7 = r6.getContext()
            int[] r0 = p000a.p001a.C0009j.Toolbar
            r1 = 0
            androidx.appcompat.widget.t0 r7 = androidx.appcompat.widget.C0638t0.m1900a(r7, r8, r0, r9, r1)
            int r8 = p000a.p001a.C0009j.Toolbar_titleTextAppearance
            int r8 = r7.m1888g(r8, r1)
            r6.f2000m = r8
            int r8 = p000a.p001a.C0009j.Toolbar_subtitleTextAppearance
            int r8 = r7.m1888g(r8, r1)
            r6.f2001n = r8
            int r8 = p000a.p001a.C0009j.Toolbar_android_gravity
            int r9 = r6.f2011x
            int r8 = r7.m1892e(r8, r9)
            r6.f2011x = r8
            int r8 = p000a.p001a.C0009j.Toolbar_buttonGravity
            r9 = 48
            int r8 = r7.m1892e(r8, r9)
            r6.f2002o = r8
            int r8 = p000a.p001a.C0009j.Toolbar_titleMargin
            int r8 = r7.m1898b(r8, r1)
            int r9 = p000a.p001a.C0009j.Toolbar_titleMargins
            boolean r9 = r7.m1889g(r9)
            if (r9 == 0) goto L_0x006c
            int r9 = p000a.p001a.C0009j.Toolbar_titleMargins
            int r8 = r7.m1898b(r9, r8)
        L_0x006c:
            r6.f2007t = r8
            r6.f2006s = r8
            r6.f2005r = r8
            r6.f2004q = r8
            int r8 = p000a.p001a.C0009j.Toolbar_titleMarginStart
            r9 = -1
            int r8 = r7.m1898b(r8, r9)
            if (r8 < 0) goto L_0x007f
            r6.f2004q = r8
        L_0x007f:
            int r8 = p000a.p001a.C0009j.Toolbar_titleMarginEnd
            int r8 = r7.m1898b(r8, r9)
            if (r8 < 0) goto L_0x0089
            r6.f2005r = r8
        L_0x0089:
            int r8 = p000a.p001a.C0009j.Toolbar_titleMarginTop
            int r8 = r7.m1898b(r8, r9)
            if (r8 < 0) goto L_0x0093
            r6.f2006s = r8
        L_0x0093:
            int r8 = p000a.p001a.C0009j.Toolbar_titleMarginBottom
            int r8 = r7.m1898b(r8, r9)
            if (r8 < 0) goto L_0x009d
            r6.f2007t = r8
        L_0x009d:
            int r8 = p000a.p001a.C0009j.Toolbar_maxButtonHeight
            int r8 = r7.m1896c(r8, r9)
            r6.f2003p = r8
            int r8 = p000a.p001a.C0009j.Toolbar_contentInsetStart
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r8 = r7.m1898b(r8, r0)
            int r2 = p000a.p001a.C0009j.Toolbar_contentInsetEnd
            int r2 = r7.m1898b(r2, r0)
            int r3 = p000a.p001a.C0009j.Toolbar_contentInsetLeft
            int r3 = r7.m1896c(r3, r1)
            int r4 = p000a.p001a.C0009j.Toolbar_contentInsetRight
            int r4 = r7.m1896c(r4, r1)
            r6.m2164l()
            androidx.appcompat.widget.l0 r5 = r6.f2008u
            r5.m1970a(r3, r4)
            if (r8 != r0) goto L_0x00cb
            if (r2 == r0) goto L_0x00d0
        L_0x00cb:
            androidx.appcompat.widget.l0 r3 = r6.f2008u
            r3.m1967b(r8, r2)
        L_0x00d0:
            int r8 = p000a.p001a.C0009j.Toolbar_contentInsetStartWithNavigation
            int r8 = r7.m1898b(r8, r0)
            r6.f2009v = r8
            int r8 = p000a.p001a.C0009j.Toolbar_contentInsetEndWithActions
            int r8 = r7.m1898b(r8, r0)
            r6.f2010w = r8
            int r8 = p000a.p001a.C0009j.Toolbar_collapseIcon
            android.graphics.drawable.Drawable r8 = r7.m1899b(r8)
            r6.f1994g = r8
            int r8 = p000a.p001a.C0009j.Toolbar_collapseContentDescription
            java.lang.CharSequence r8 = r7.m1893e(r8)
            r6.f1995h = r8
            int r8 = p000a.p001a.C0009j.Toolbar_title
            java.lang.CharSequence r8 = r7.m1893e(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x00ff
            r6.setTitle(r8)
        L_0x00ff:
            int r8 = p000a.p001a.C0009j.Toolbar_subtitle
            java.lang.CharSequence r8 = r7.m1893e(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x010e
            r6.setSubtitle(r8)
        L_0x010e:
            android.content.Context r8 = r6.getContext()
            r6.f1998k = r8
            int r8 = p000a.p001a.C0009j.Toolbar_popupTheme
            int r8 = r7.m1888g(r8, r1)
            r6.setPopupTheme(r8)
            int r8 = p000a.p001a.C0009j.Toolbar_navigationIcon
            android.graphics.drawable.Drawable r8 = r7.m1899b(r8)
            if (r8 == 0) goto L_0x0128
            r6.setNavigationIcon(r8)
        L_0x0128:
            int r8 = p000a.p001a.C0009j.Toolbar_navigationContentDescription
            java.lang.CharSequence r8 = r7.m1893e(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0137
            r6.setNavigationContentDescription(r8)
        L_0x0137:
            int r8 = p000a.p001a.C0009j.Toolbar_logo
            android.graphics.drawable.Drawable r8 = r7.m1899b(r8)
            if (r8 == 0) goto L_0x0142
            r6.setLogo(r8)
        L_0x0142:
            int r8 = p000a.p001a.C0009j.Toolbar_logoDescription
            java.lang.CharSequence r8 = r7.m1893e(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0151
            r6.setLogoDescription(r8)
        L_0x0151:
            int r8 = p000a.p001a.C0009j.Toolbar_titleTextColor
            boolean r8 = r7.m1889g(r8)
            if (r8 == 0) goto L_0x0162
            int r8 = p000a.p001a.C0009j.Toolbar_titleTextColor
            int r8 = r7.m1905a(r8, r9)
            r6.setTitleTextColor(r8)
        L_0x0162:
            int r8 = p000a.p001a.C0009j.Toolbar_subtitleTextColor
            boolean r8 = r7.m1889g(r8)
            if (r8 == 0) goto L_0x0173
            int r8 = p000a.p001a.C0009j.Toolbar_subtitleTextColor
            int r8 = r7.m1905a(r8, r9)
            r6.setSubtitleTextColor(r8)
        L_0x0173:
            r7.m1908a()
            return
    }

    /* renamed from: a */
    private int m2193a(int r5) {
            r4 = this;
            int r0 = p000a.p018g.p029l.C0216r.m3411j(r4)
            int r5 = p000a.p018g.p029l.C0200c.m3490a(r5, r0)
            r5 = r5 & 7
            r1 = 1
            if (r5 == r1) goto L_0x0017
            r2 = 3
            if (r5 == r2) goto L_0x0017
            r3 = 5
            if (r5 == r3) goto L_0x0017
            if (r0 != r1) goto L_0x0016
            r2 = 5
        L_0x0016:
            return r2
        L_0x0017:
            return r5
    }

    /* renamed from: a */
    private int m2190a(android.view.View r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r0 = p000a.p018g.p029l.C0204f.m3479b(r2)
            int r2 = p000a.p018g.p029l.C0204f.m3480a(r2)
            int r0 = r0 + r2
            return r0
    }

    /* renamed from: a */
    private int m2189a(android.view.View r7, int r8) {
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r0 = (androidx.appcompat.widget.Toolbar.C0559e) r0
            int r7 = r7.getMeasuredHeight()
            r1 = 0
            if (r8 <= 0) goto L_0x0012
            int r8 = r7 - r8
            int r8 = r8 / 2
            goto L_0x0013
        L_0x0012:
            r8 = 0
        L_0x0013:
            int r2 = r0.f1393a
            int r2 = r6.m2179b(r2)
            r3 = 48
            if (r2 == r3) goto L_0x0058
            r3 = 80
            if (r2 == r3) goto L_0x0049
            int r8 = r6.getPaddingTop()
            int r2 = r6.getPaddingBottom()
            int r3 = r6.getHeight()
            int r4 = r3 - r8
            int r4 = r4 - r2
            int r4 = r4 - r7
            int r4 = r4 / 2
            int r5 = r0.topMargin
            if (r4 >= r5) goto L_0x0039
            r4 = r5
            goto L_0x0047
        L_0x0039:
            int r3 = r3 - r2
            int r3 = r3 - r7
            int r3 = r3 - r4
            int r3 = r3 - r8
            int r7 = r0.bottomMargin
            if (r3 >= r7) goto L_0x0047
            int r7 = r7 - r3
            int r4 = r4 - r7
            int r4 = java.lang.Math.max(r1, r4)
        L_0x0047:
            int r8 = r8 + r4
            return r8
        L_0x0049:
            int r1 = r6.getHeight()
            int r2 = r6.getPaddingBottom()
            int r1 = r1 - r2
            int r1 = r1 - r7
            int r7 = r0.bottomMargin
            int r1 = r1 - r7
            int r1 = r1 - r8
            return r1
        L_0x0058:
            int r7 = r6.getPaddingTop()
            int r7 = r7 - r8
            return r7
    }

    /* renamed from: a */
    private int m2187a(android.view.View r8, int r9, int r10, int r11, int r12, int[] r13) {
            r7 = this;
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r0.leftMargin
            r2 = 0
            r3 = r13[r2]
            int r1 = r1 - r3
            int r3 = r0.rightMargin
            r4 = 1
            r5 = r13[r4]
            int r3 = r3 - r5
            int r5 = java.lang.Math.max(r2, r1)
            int r6 = java.lang.Math.max(r2, r3)
            int r5 = r5 + r6
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r13[r2] = r1
            int r1 = -r3
            int r1 = java.lang.Math.max(r2, r1)
            r13[r4] = r1
            int r13 = r7.getPaddingLeft()
            int r1 = r7.getPaddingRight()
            int r13 = r13 + r1
            int r13 = r13 + r5
            int r13 = r13 + r10
            int r10 = r0.width
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r9, r13, r10)
            int r10 = r7.getPaddingTop()
            int r13 = r7.getPaddingBottom()
            int r10 = r10 + r13
            int r13 = r0.topMargin
            int r10 = r10 + r13
            int r13 = r0.bottomMargin
            int r10 = r10 + r13
            int r10 = r10 + r12
            int r12 = r0.height
            int r10 = android.view.ViewGroup.getChildMeasureSpec(r11, r10, r12)
            r8.measure(r9, r10)
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r5
            return r8
    }

    /* renamed from: a */
    private int m2186a(android.view.View r5, int r6, int[] r7, int r8) {
            r4 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r0 = (androidx.appcompat.widget.Toolbar.C0559e) r0
            int r1 = r0.leftMargin
            r2 = 0
            r3 = r7[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r6 = r6 + r3
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r7[r2] = r1
            int r7 = r4.m2189a(r5, r8)
            int r8 = r5.getMeasuredWidth()
            int r1 = r6 + r8
            int r2 = r5.getMeasuredHeight()
            int r2 = r2 + r7
            r5.layout(r6, r7, r1, r2)
            int r5 = r0.rightMargin
            int r8 = r8 + r5
            int r6 = r6 + r8
            return r6
    }

    /* renamed from: a */
    private int m2181a(java.util.List<android.view.View> r9, int[] r10) {
            r8 = this;
            r0 = 0
            r1 = r10[r0]
            r2 = 1
            r10 = r10[r2]
            int r2 = r9.size()
            r4 = r10
            r3 = r1
            r10 = 0
            r1 = 0
        L_0x000e:
            if (r10 >= r2) goto L_0x0040
            java.lang.Object r5 = r9.get(r10)
            android.view.View r5 = (android.view.View) r5
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r6 = (androidx.appcompat.widget.Toolbar.C0559e) r6
            int r7 = r6.leftMargin
            int r7 = r7 - r3
            int r3 = r6.rightMargin
            int r3 = r3 - r4
            int r4 = java.lang.Math.max(r0, r7)
            int r6 = java.lang.Math.max(r0, r3)
            int r7 = -r7
            int r7 = java.lang.Math.max(r0, r7)
            int r3 = -r3
            int r3 = java.lang.Math.max(r0, r3)
            int r5 = r5.getMeasuredWidth()
            int r4 = r4 + r5
            int r4 = r4 + r6
            int r1 = r1 + r4
            int r10 = r10 + 1
            r4 = r3
            r3 = r7
            goto L_0x000e
        L_0x0040:
            return r1
    }

    /* renamed from: a */
    private void m2188a(android.view.View r4, int r5, int r6, int r7, int r8, int r9) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r3.getPaddingLeft()
            int r2 = r3.getPaddingRight()
            int r1 = r1 + r2
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            int r1 = r1 + r6
            int r6 = r0.width
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r1, r6)
            int r6 = r3.getPaddingTop()
            int r1 = r3.getPaddingBottom()
            int r6 = r6 + r1
            int r1 = r0.topMargin
            int r6 = r6 + r1
            int r1 = r0.bottomMargin
            int r6 = r6 + r1
            int r6 = r6 + r8
            int r8 = r0.height
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r7, r6, r8)
            int r7 = android.view.View.MeasureSpec.getMode(r6)
            r8 = 1073741824(0x40000000, float:2.0)
            if (r7 == r8) goto L_0x004a
            if (r9 < 0) goto L_0x004a
            if (r7 == 0) goto L_0x0046
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r9 = java.lang.Math.min(r6, r9)
        L_0x0046:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r8)
        L_0x004a:
            r4.measure(r5, r6)
            return
    }

    /* renamed from: a */
    private void m2185a(android.view.View r3, boolean r4) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            if (r0 != 0) goto L_0x000b
            androidx.appcompat.widget.Toolbar$e r0 = r2.generateDefaultLayoutParams()
            goto L_0x0018
        L_0x000b:
            boolean r1 = r2.checkLayoutParams(r0)
            if (r1 != 0) goto L_0x0016
            androidx.appcompat.widget.Toolbar$e r0 = r2.generateLayoutParams(r0)
            goto L_0x0018
        L_0x0016:
            androidx.appcompat.widget.Toolbar$e r0 = (androidx.appcompat.widget.Toolbar.C0559e) r0
        L_0x0018:
            r1 = 1
            r0.f2020b = r1
            if (r4 == 0) goto L_0x002a
            android.view.View r4 = r2.f1997j
            if (r4 == 0) goto L_0x002a
            r3.setLayoutParams(r0)
            java.util.ArrayList<android.view.View> r4 = r2.f1978F
            r4.add(r3)
            goto L_0x002d
        L_0x002a:
            r2.addView(r3, r0)
        L_0x002d:
            return
    }

    /* renamed from: a */
    private void m2182a(java.util.List<android.view.View> r6, int r7) {
            r5 = this;
            int r0 = p000a.p018g.p029l.C0216r.m3411j(r5)
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            int r3 = r5.getChildCount()
            int r4 = p000a.p018g.p029l.C0216r.m3411j(r5)
            int r7 = p000a.p018g.p029l.C0200c.m3490a(r7, r4)
            r6.clear()
            if (r0 == 0) goto L_0x0041
            int r3 = r3 - r2
        L_0x001d:
            if (r3 < 0) goto L_0x0065
            android.view.View r0 = r5.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0559e) r1
            int r2 = r1.f2020b
            if (r2 != 0) goto L_0x003e
            boolean r2 = r5.m2172d(r0)
            if (r2 == 0) goto L_0x003e
            int r1 = r1.f1393a
            int r1 = r5.m2193a(r1)
            if (r1 != r7) goto L_0x003e
            r6.add(r0)
        L_0x003e:
            int r3 = r3 + (-1)
            goto L_0x001d
        L_0x0041:
            if (r1 >= r3) goto L_0x0065
            android.view.View r0 = r5.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r2 = (androidx.appcompat.widget.Toolbar.C0559e) r2
            int r4 = r2.f2020b
            if (r4 != 0) goto L_0x0062
            boolean r4 = r5.m2172d(r0)
            if (r4 == 0) goto L_0x0062
            int r2 = r2.f1393a
            int r2 = r5.m2193a(r2)
            if (r2 != r7) goto L_0x0062
            r6.add(r0)
        L_0x0062:
            int r1 = r1 + 1
            goto L_0x0041
        L_0x0065:
            return
    }

    /* renamed from: b */
    private int m2179b(int r2) {
            r1 = this;
            r2 = r2 & 112(0x70, float:1.57E-43)
            r0 = 16
            if (r2 == r0) goto L_0x0012
            r0 = 48
            if (r2 == r0) goto L_0x0012
            r0 = 80
            if (r2 == r0) goto L_0x0012
            int r2 = r1.f2011x
            r2 = r2 & 112(0x70, float:1.57E-43)
        L_0x0012:
            return r2
    }

    /* renamed from: b */
    private int m2177b(android.view.View r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r0 = r2.topMargin
            int r2 = r2.bottomMargin
            int r0 = r0 + r2
            return r0
    }

    /* renamed from: b */
    private int m2176b(android.view.View r6, int r7, int[] r8, int r9) {
            r5 = this;
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r0 = (androidx.appcompat.widget.Toolbar.C0559e) r0
            int r1 = r0.rightMargin
            r2 = 1
            r3 = r8[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r7 = r7 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r8[r2] = r1
            int r8 = r5.m2189a(r6, r9)
            int r9 = r6.getMeasuredWidth()
            int r1 = r7 - r9
            int r2 = r6.getMeasuredHeight()
            int r2 = r2 + r8
            r6.layout(r1, r8, r7, r2)
            int r6 = r0.leftMargin
            int r9 = r9 + r6
            int r7 = r7 - r9
            return r7
    }

    /* renamed from: c */
    private boolean m2174c(android.view.View r2) {
            r1 = this;
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == r1) goto L_0x0011
            java.util.ArrayList<android.view.View> r0 = r1.f1978F
            boolean r2 = r0.contains(r2)
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

    /* renamed from: d */
    private boolean m2172d(android.view.View r2) {
            r1 = this;
            if (r2 == 0) goto L_0x0012
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != r1) goto L_0x0012
            int r2 = r2.getVisibility()
            r0 = 8
            if (r2 == r0) goto L_0x0012
            r2 = 1
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            return r2
    }

    private android.view.MenuInflater getMenuInflater() {
            r2 = this;
            a.a.m.g r0 = new a.a.m.g
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            return r0
    }

    /* renamed from: l */
    private void m2164l() {
            r1 = this;
            androidx.appcompat.widget.l0 r0 = r1.f2008u
            if (r0 != 0) goto L_0x000b
            androidx.appcompat.widget.l0 r0 = new androidx.appcompat.widget.l0
            r0.<init>()
            r1.f2008u = r0
        L_0x000b:
            return
    }

    /* renamed from: m */
    private void m2163m() {
            r2 = this;
            android.widget.ImageView r0 = r2.f1993f
            if (r0 != 0) goto L_0x000f
            androidx.appcompat.widget.o r0 = new androidx.appcompat.widget.o
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.f1993f = r0
        L_0x000f:
            return
    }

    /* renamed from: n */
    private void m2162n() {
            r3 = this;
            r3.m2161o()
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1989b
            androidx.appcompat.view.menu.h r0 = r0.m2255j()
            if (r0 != 0) goto L_0x002b
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1989b
            android.view.Menu r0 = r0.getMenu()
            androidx.appcompat.view.menu.h r0 = (androidx.appcompat.view.menu.C0496h) r0
            androidx.appcompat.widget.Toolbar$d r1 = r3.f1984L
            if (r1 != 0) goto L_0x001e
            androidx.appcompat.widget.Toolbar$d r1 = new androidx.appcompat.widget.Toolbar$d
            r1.<init>(r3)
            r3.f1984L = r1
        L_0x001e:
            androidx.appcompat.widget.ActionMenuView r1 = r3.f1989b
            r2 = 1
            r1.setExpandedActionViewsExclusive(r2)
            androidx.appcompat.widget.Toolbar$d r1 = r3.f1984L
            android.content.Context r2 = r3.f1998k
            r0.m2407a(r1, r2)
        L_0x002b:
            return
    }

    /* renamed from: o */
    private void m2161o() {
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1989b
            if (r0 != 0) goto L_0x003f
            androidx.appcompat.widget.ActionMenuView r0 = new androidx.appcompat.widget.ActionMenuView
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f1989b = r0
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1989b
            int r1 = r3.f1999l
            r0.setPopupTheme(r1)
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1989b
            androidx.appcompat.widget.ActionMenuView$e r1 = r3.f1981I
            r0.setOnMenuItemClickListener(r1)
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1989b
            androidx.appcompat.view.menu.p$a r1 = r3.f1985M
            androidx.appcompat.view.menu.h$a r2 = r3.f1986N
            r0.m2264a(r1, r2)
            androidx.appcompat.widget.Toolbar$e r0 = r3.generateDefaultLayoutParams()
            r1 = 8388613(0x800005, float:1.175495E-38)
            int r2 = r3.f2002o
            r2 = r2 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r0.f1393a = r1
            androidx.appcompat.widget.ActionMenuView r1 = r3.f1989b
            r1.setLayoutParams(r0)
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1989b
            r1 = 0
            r3.m2185a(r0, r1)
        L_0x003f:
            return
    }

    /* renamed from: p */
    private void m2160p() {
            r4 = this;
            android.widget.ImageButton r0 = r4.f1992e
            if (r0 != 0) goto L_0x0025
            androidx.appcompat.widget.m r0 = new androidx.appcompat.widget.m
            android.content.Context r1 = r4.getContext()
            r2 = 0
            int r3 = p000a.p001a.C0000a.toolbarNavigationButtonStyle
            r0.<init>(r1, r2, r3)
            r4.f1992e = r0
            androidx.appcompat.widget.Toolbar$e r0 = r4.generateDefaultLayoutParams()
            r1 = 8388611(0x800003, float:1.1754948E-38)
            int r2 = r4.f2002o
            r2 = r2 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r0.f1393a = r1
            android.widget.ImageButton r1 = r4.f1992e
            r1.setLayoutParams(r0)
        L_0x0025:
            return
    }

    /* renamed from: q */
    private void m2159q() {
            r1 = this;
            java.lang.Runnable r0 = r1.f1988P
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r1.f1988P
            r1.post(r0)
            return
    }

    /* renamed from: r */
    private boolean m2158r() {
            r5 = this;
            boolean r0 = r5.f1987O
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r5.getChildCount()
            r2 = 0
        L_0x000b:
            if (r2 >= r0) goto L_0x0027
            android.view.View r3 = r5.getChildAt(r2)
            boolean r4 = r5.m2172d(r3)
            if (r4 == 0) goto L_0x0024
            int r4 = r3.getMeasuredWidth()
            if (r4 <= 0) goto L_0x0024
            int r3 = r3.getMeasuredHeight()
            if (r3 <= 0) goto L_0x0024
            return r1
        L_0x0024:
            int r2 = r2 + 1
            goto L_0x000b
        L_0x0027:
            r0 = 1
            return r0
    }

    /* renamed from: a */
    void m2194a() {
            r2 = this;
            java.util.ArrayList<android.view.View> r0 = r2.f1978F
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L_0x0008:
            if (r0 < 0) goto L_0x0018
            java.util.ArrayList<android.view.View> r1 = r2.f1978F
            java.lang.Object r1 = r1.get(r0)
            android.view.View r1 = (android.view.View) r1
            r2.addView(r1)
            int r0 = r0 + (-1)
            goto L_0x0008
        L_0x0018:
            java.util.ArrayList<android.view.View> r0 = r2.f1978F
            r0.clear()
            return
    }

    /* renamed from: a */
    public void m2192a(int r2, int r3) {
            r1 = this;
            r1.m2164l()
            androidx.appcompat.widget.l0 r0 = r1.f2008u
            r0.m1967b(r2, r3)
            return
    }

    /* renamed from: a */
    public void m2191a(android.content.Context r2, int r3) {
            r1 = this;
            r1.f2001n = r3
            android.widget.TextView r0 = r1.f1991d
            if (r0 == 0) goto L_0x0009
            r0.setTextAppearance(r2, r3)
        L_0x0009:
            return
    }

    /* renamed from: a */
    public void m2184a(androidx.appcompat.view.menu.C0496h r4, androidx.appcompat.widget.C0570c r5) {
            r3 = this;
            if (r4 != 0) goto L_0x0007
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1989b
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            r3.m2161o()
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1989b
            androidx.appcompat.view.menu.h r0 = r0.m2255j()
            if (r0 != r4) goto L_0x0013
            return
        L_0x0013:
            if (r0 == 0) goto L_0x001f
            androidx.appcompat.widget.c r1 = r3.f1983K
            r0.m2398b(r1)
            androidx.appcompat.widget.Toolbar$d r1 = r3.f1984L
            r0.m2398b(r1)
        L_0x001f:
            androidx.appcompat.widget.Toolbar$d r0 = r3.f1984L
            if (r0 != 0) goto L_0x002a
            androidx.appcompat.widget.Toolbar$d r0 = new androidx.appcompat.widget.Toolbar$d
            r0.<init>(r3)
            r3.f1984L = r0
        L_0x002a:
            r0 = 1
            r5.m2126b(r0)
            if (r4 == 0) goto L_0x003d
            android.content.Context r0 = r3.f1998k
            r4.m2407a(r5, r0)
            androidx.appcompat.widget.Toolbar$d r0 = r3.f1984L
            android.content.Context r1 = r3.f1998k
            r4.m2407a(r0, r1)
            goto L_0x0052
        L_0x003d:
            android.content.Context r4 = r3.f1998k
            r1 = 0
            r5.mo133a(r4, r1)
            androidx.appcompat.widget.Toolbar$d r4 = r3.f1984L
            android.content.Context r2 = r3.f1998k
            r4.mo133a(r2, r1)
            r5.mo123a(r0)
            androidx.appcompat.widget.Toolbar$d r4 = r3.f1984L
            r4.mo123a(r0)
        L_0x0052:
            androidx.appcompat.widget.ActionMenuView r4 = r3.f1989b
            int r0 = r3.f1999l
            r4.setPopupTheme(r0)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f1989b
            r4.setPresenter(r5)
            r3.f1983K = r5
            return
    }

    /* renamed from: a */
    public void m2183a(androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a r2, androidx.appcompat.view.menu.C0496h.AbstractC0497a r3) {
            r1 = this;
            r1.f1985M = r2
            r1.f1986N = r3
            androidx.appcompat.widget.ActionMenuView r0 = r1.f1989b
            if (r0 == 0) goto L_0x000b
            r0.m2264a(r2, r3)
        L_0x000b:
            return
    }

    /* renamed from: b */
    public void m2178b(android.content.Context r2, int r3) {
            r1 = this;
            r1.f2000m = r3
            android.widget.TextView r0 = r1.f1990c
            if (r0 == 0) goto L_0x0009
            r0.setTextAppearance(r2, r3)
        L_0x0009:
            return
    }

    /* renamed from: b */
    public boolean m2180b() {
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r1.f1989b
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.m2256i()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
    }

    /* renamed from: c */
    public void m2175c() {
            r1 = this;
            androidx.appcompat.widget.Toolbar$d r0 = r1.f1984L
            if (r0 != 0) goto L_0x0006
            r0 = 0
            goto L_0x0008
        L_0x0006:
            androidx.appcompat.view.menu.k r0 = r0.f2018c
        L_0x0008:
            if (r0 == 0) goto L_0x000d
            r0.collapseActionView()
        L_0x000d:
            return
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = super.checkLayoutParams(r2)
            if (r0 == 0) goto L_0x000c
            boolean r2 = r2 instanceof androidx.appcompat.widget.Toolbar.C0559e
            if (r2 == 0) goto L_0x000c
            r2 = 1
            goto L_0x000d
        L_0x000c:
            r2 = 0
        L_0x000d:
            return r2
    }

    /* renamed from: d */
    public void m2173d() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r1.f1989b
            if (r0 == 0) goto L_0x0007
            r0.m2262d()
        L_0x0007:
            return
    }

    /* renamed from: e */
    void m2171e() {
            r4 = this;
            android.widget.ImageButton r0 = r4.f1996i
            if (r0 != 0) goto L_0x0040
            androidx.appcompat.widget.m r0 = new androidx.appcompat.widget.m
            android.content.Context r1 = r4.getContext()
            r2 = 0
            int r3 = p000a.p001a.C0000a.toolbarNavigationButtonStyle
            r0.<init>(r1, r2, r3)
            r4.f1996i = r0
            android.widget.ImageButton r0 = r4.f1996i
            android.graphics.drawable.Drawable r1 = r4.f1994g
            r0.setImageDrawable(r1)
            android.widget.ImageButton r0 = r4.f1996i
            java.lang.CharSequence r1 = r4.f1995h
            r0.setContentDescription(r1)
            androidx.appcompat.widget.Toolbar$e r0 = r4.generateDefaultLayoutParams()
            r1 = 8388611(0x800003, float:1.1754948E-38)
            int r2 = r4.f2002o
            r2 = r2 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r0.f1393a = r1
            r1 = 2
            r0.f2020b = r1
            android.widget.ImageButton r1 = r4.f1996i
            r1.setLayoutParams(r0)
            android.widget.ImageButton r0 = r4.f1996i
            androidx.appcompat.widget.Toolbar$c r1 = new androidx.appcompat.widget.Toolbar$c
            r1.<init>(r4)
            r0.setOnClickListener(r1)
        L_0x0040:
            return
    }

    /* renamed from: f */
    public boolean m2170f() {
            r1 = this;
            androidx.appcompat.widget.Toolbar$d r0 = r1.f1984L
            if (r0 == 0) goto L_0x000a
            androidx.appcompat.view.menu.k r0 = r0.f2018c
            if (r0 == 0) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            return r0
    }

    /* renamed from: g */
    public boolean m2169g() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r1.f1989b
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.m2259f()
            if (r0 == 0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            return r0
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.appcompat.widget.Toolbar$e r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.view.ViewGroup
    protected androidx.appcompat.widget.Toolbar.C0559e generateDefaultLayoutParams() {
            r2 = this;
            androidx.appcompat.widget.Toolbar$e r0 = new androidx.appcompat.widget.Toolbar$e
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.appcompat.widget.Toolbar$e r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            androidx.appcompat.widget.Toolbar$e r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    public androidx.appcompat.widget.Toolbar.C0559e generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.appcompat.widget.Toolbar$e r0 = new androidx.appcompat.widget.Toolbar$e
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    protected androidx.appcompat.widget.Toolbar.C0559e generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.appcompat.widget.Toolbar.C0559e
            if (r0 == 0) goto L_0x000c
            androidx.appcompat.widget.Toolbar$e r0 = new androidx.appcompat.widget.Toolbar$e
            androidx.appcompat.widget.Toolbar$e r2 = (androidx.appcompat.widget.Toolbar.C0559e) r2
            r0.<init>(r2)
            return r0
        L_0x000c:
            boolean r0 = r2 instanceof androidx.appcompat.app.AbstractC0428a.C0429a
            if (r0 == 0) goto L_0x0018
            androidx.appcompat.widget.Toolbar$e r0 = new androidx.appcompat.widget.Toolbar$e
            androidx.appcompat.app.a$a r2 = (androidx.appcompat.app.AbstractC0428a.C0429a) r2
            r0.<init>(r2)
            return r0
        L_0x0018:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0024
            androidx.appcompat.widget.Toolbar$e r0 = new androidx.appcompat.widget.Toolbar$e
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            return r0
        L_0x0024:
            androidx.appcompat.widget.Toolbar$e r0 = new androidx.appcompat.widget.Toolbar$e
            r0.<init>(r2)
            return r0
    }

    public int getContentInsetEnd() {
            r1 = this;
            androidx.appcompat.widget.l0 r0 = r1.f2008u
            if (r0 == 0) goto L_0x0009
            int r0 = r0.m1971a()
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            return r0
    }

    public int getContentInsetEndWithActions() {
            r2 = this;
            int r0 = r2.f2010w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x0007
            goto L_0x000b
        L_0x0007:
            int r0 = r2.getContentInsetEnd()
        L_0x000b:
            return r0
    }

    public int getContentInsetLeft() {
            r1 = this;
            androidx.appcompat.widget.l0 r0 = r1.f2008u
            if (r0 == 0) goto L_0x0009
            int r0 = r0.m1968b()
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            return r0
    }

    public int getContentInsetRight() {
            r1 = this;
            androidx.appcompat.widget.l0 r0 = r1.f2008u
            if (r0 == 0) goto L_0x0009
            int r0 = r0.m1966c()
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            return r0
    }

    public int getContentInsetStart() {
            r1 = this;
            androidx.appcompat.widget.l0 r0 = r1.f2008u
            if (r0 == 0) goto L_0x0009
            int r0 = r0.m1965d()
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            return r0
    }

    public int getContentInsetStartWithNavigation() {
            r2 = this;
            int r0 = r2.f2009v
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x0007
            goto L_0x000b
        L_0x0007:
            int r0 = r2.getContentInsetStart()
        L_0x000b:
            return r0
    }

    public int getCurrentContentInsetEnd() {
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1989b
            r1 = 0
            if (r0 == 0) goto L_0x0013
            androidx.appcompat.view.menu.h r0 = r0.m2255j()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f2010w
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0029
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
        L_0x0029:
            return r0
    }

    public int getCurrentContentInsetLeft() {
            r2 = this;
            int r0 = p000a.p018g.p029l.C0216r.m3411j(r2)
            r1 = 1
            if (r0 != r1) goto L_0x000c
            int r0 = r2.getCurrentContentInsetEnd()
            goto L_0x0010
        L_0x000c:
            int r0 = r2.getCurrentContentInsetStart()
        L_0x0010:
            return r0
    }

    public int getCurrentContentInsetRight() {
            r2 = this;
            int r0 = p000a.p018g.p029l.C0216r.m3411j(r2)
            r1 = 1
            if (r0 != r1) goto L_0x000c
            int r0 = r2.getCurrentContentInsetStart()
            goto L_0x0010
        L_0x000c:
            int r0 = r2.getCurrentContentInsetEnd()
        L_0x0010:
            return r0
    }

    public int getCurrentContentInsetStart() {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.getNavigationIcon()
            if (r0 == 0) goto L_0x0016
            int r0 = r3.getContentInsetStart()
            int r1 = r3.f2009v
            r2 = 0
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x001a
        L_0x0016:
            int r0 = r3.getContentInsetStart()
        L_0x001a:
            return r0
    }

    public android.graphics.drawable.Drawable getLogo() {
            r1 = this;
            android.widget.ImageView r0 = r1.f1993f
            if (r0 == 0) goto L_0x0009
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            return r0
    }

    public java.lang.CharSequence getLogoDescription() {
            r1 = this;
            android.widget.ImageView r0 = r1.f1993f
            if (r0 == 0) goto L_0x0009
            java.lang.CharSequence r0 = r0.getContentDescription()
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            return r0
    }

    public android.view.Menu getMenu() {
            r1 = this;
            r1.m2162n()
            androidx.appcompat.widget.ActionMenuView r0 = r1.f1989b
            android.view.Menu r0 = r0.getMenu()
            return r0
    }

    public java.lang.CharSequence getNavigationContentDescription() {
            r1 = this;
            android.widget.ImageButton r0 = r1.f1992e
            if (r0 == 0) goto L_0x0009
            java.lang.CharSequence r0 = r0.getContentDescription()
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            return r0
    }

    public android.graphics.drawable.Drawable getNavigationIcon() {
            r1 = this;
            android.widget.ImageButton r0 = r1.f1992e
            if (r0 == 0) goto L_0x0009
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            return r0
    }

    androidx.appcompat.widget.C0570c getOuterActionMenuPresenter() {
            r1 = this;
            androidx.appcompat.widget.c r0 = r1.f1983K
            return r0
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
            r1 = this;
            r1.m2162n()
            androidx.appcompat.widget.ActionMenuView r0 = r1.f1989b
            android.graphics.drawable.Drawable r0 = r0.getOverflowIcon()
            return r0
    }

    android.content.Context getPopupContext() {
            r1 = this;
            android.content.Context r0 = r1.f1998k
            return r0
    }

    public int getPopupTheme() {
            r1 = this;
            int r0 = r1.f1999l
            return r0
    }

    public java.lang.CharSequence getSubtitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f2013z
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f2012y
            return r0
    }

    public int getTitleMarginBottom() {
            r1 = this;
            int r0 = r1.f2007t
            return r0
    }

    public int getTitleMarginEnd() {
            r1 = this;
            int r0 = r1.f2005r
            return r0
    }

    public int getTitleMarginStart() {
            r1 = this;
            int r0 = r1.f2004q
            return r0
    }

    public int getTitleMarginTop() {
            r1 = this;
            int r0 = r1.f2006s
            return r0
    }

    public androidx.appcompat.widget.AbstractC0569b0 getWrapper() {
            r2 = this;
            androidx.appcompat.widget.u0 r0 = r2.f1982J
            if (r0 != 0) goto L_0x000c
            androidx.appcompat.widget.u0 r0 = new androidx.appcompat.widget.u0
            r1 = 1
            r0.<init>(r2, r1)
            r2.f1982J = r0
        L_0x000c:
            androidx.appcompat.widget.u0 r0 = r2.f1982J
            return r0
    }

    /* renamed from: h */
    public boolean m2168h() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r1.f1989b
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.m2258g()
            if (r0 == 0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            return r0
    }

    /* renamed from: i */
    public boolean m2167i() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r1.f1989b
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.m2257h()
            if (r0 == 0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            return r0
    }

    /* renamed from: j */
    void m2166j() {
            r4 = this;
            int r0 = r4.getChildCount()
            int r0 = r0 + (-1)
        L_0x0006:
            if (r0 < 0) goto L_0x0026
            android.view.View r1 = r4.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r2 = (androidx.appcompat.widget.Toolbar.C0559e) r2
            int r2 = r2.f2020b
            r3 = 2
            if (r2 == r3) goto L_0x0023
            androidx.appcompat.widget.ActionMenuView r2 = r4.f1989b
            if (r1 == r2) goto L_0x0023
            r4.removeViewAt(r0)
            java.util.ArrayList<android.view.View> r2 = r4.f1978F
            r2.add(r1)
        L_0x0023:
            int r0 = r0 + (-1)
            goto L_0x0006
        L_0x0026:
            return
    }

    /* renamed from: k */
    public boolean m2165k() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r1.f1989b
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.m2254k()
            if (r0 == 0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            java.lang.Runnable r0 = r1.f1988P
            r1.removeCallbacks(r0)
            return
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent r6) {
            r5 = this;
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 9
            if (r0 != r2) goto L_0x000b
            r5.f1976D = r1
        L_0x000b:
            boolean r3 = r5.f1976D
            r4 = 1
            if (r3 != 0) goto L_0x001a
            boolean r6 = super.onHoverEvent(r6)
            if (r0 != r2) goto L_0x001a
            if (r6 != 0) goto L_0x001a
            r5.f1976D = r4
        L_0x001a:
            r6 = 10
            if (r0 == r6) goto L_0x0021
            r6 = 3
            if (r0 != r6) goto L_0x0023
        L_0x0021:
            r5.f1976D = r1
        L_0x0023:
            return r4
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
            r19 = this;
            r0 = r19
            int r1 = p000a.p018g.p029l.C0216r.m3411j(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f1979G
            r11[r2] = r3
            r11[r3] = r3
            int r12 = p000a.p018g.p029l.C0216r.m3410k(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f1992e
            boolean r13 = r0.m2172d(r13)
            if (r13 == 0) goto L_0x0053
            android.widget.ImageButton r13 = r0.f1992e
            if (r1 == 0) goto L_0x004e
            int r13 = r0.m2176b(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0055
        L_0x004e:
            int r13 = r0.m2186a(r13, r6, r11, r12)
            goto L_0x0054
        L_0x0053:
            r13 = r6
        L_0x0054:
            r14 = r10
        L_0x0055:
            android.widget.ImageButton r15 = r0.f1996i
            boolean r15 = r0.m2172d(r15)
            if (r15 == 0) goto L_0x006a
            android.widget.ImageButton r15 = r0.f1996i
            if (r1 == 0) goto L_0x0066
            int r14 = r0.m2176b(r15, r14, r11, r12)
            goto L_0x006a
        L_0x0066:
            int r13 = r0.m2186a(r15, r13, r11, r12)
        L_0x006a:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1989b
            boolean r15 = r0.m2172d(r15)
            if (r15 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1989b
            if (r1 == 0) goto L_0x007b
            int r13 = r0.m2186a(r15, r13, r11, r12)
            goto L_0x007f
        L_0x007b:
            int r14 = r0.m2176b(r15, r14, r11, r12)
        L_0x007f:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f1997j
            boolean r13 = r0.m2172d(r13)
            if (r13 == 0) goto L_0x00ba
            android.view.View r13 = r0.f1997j
            if (r1 == 0) goto L_0x00b6
            int r10 = r0.m2176b(r13, r10, r11, r12)
            goto L_0x00ba
        L_0x00b6:
            int r2 = r0.m2186a(r13, r2, r11, r12)
        L_0x00ba:
            android.widget.ImageView r13 = r0.f1993f
            boolean r13 = r0.m2172d(r13)
            if (r13 == 0) goto L_0x00cf
            android.widget.ImageView r13 = r0.f1993f
            if (r1 == 0) goto L_0x00cb
            int r10 = r0.m2176b(r13, r10, r11, r12)
            goto L_0x00cf
        L_0x00cb:
            int r2 = r0.m2186a(r13, r2, r11, r12)
        L_0x00cf:
            android.widget.TextView r13 = r0.f1990c
            boolean r13 = r0.m2172d(r13)
            android.widget.TextView r14 = r0.f1991d
            boolean r14 = r0.m2172d(r14)
            if (r13 == 0) goto L_0x00f6
            android.widget.TextView r15 = r0.f1990c
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.C0559e) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f1990c
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x00f9
        L_0x00f6:
            r23 = r7
            r3 = 0
        L_0x00f9:
            if (r14 == 0) goto L_0x0113
            android.widget.TextView r7 = r0.f1991d
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.C0559e) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f1991d
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x0115
        L_0x0113:
            r16 = r4
        L_0x0115:
            if (r13 != 0) goto L_0x0121
            if (r14 == 0) goto L_0x011a
            goto L_0x0121
        L_0x011a:
            r17 = r6
            r22 = r12
        L_0x011e:
            r7 = 0
            goto L_0x028c
        L_0x0121:
            if (r13 == 0) goto L_0x0126
            android.widget.TextView r4 = r0.f1990c
            goto L_0x0128
        L_0x0126:
            android.widget.TextView r4 = r0.f1991d
        L_0x0128:
            if (r14 == 0) goto L_0x012d
            android.widget.TextView r7 = r0.f1991d
            goto L_0x012f
        L_0x012d:
            android.widget.TextView r7 = r0.f1990c
        L_0x012f:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.C0559e) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.C0559e) r7
            if (r13 == 0) goto L_0x0145
            android.widget.TextView r15 = r0.f1990c
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x014f
        L_0x0145:
            if (r14 == 0) goto L_0x0153
            android.widget.TextView r15 = r0.f1991d
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x0153
        L_0x014f:
            r17 = r6
            r15 = 1
            goto L_0x0156
        L_0x0153:
            r17 = r6
            r15 = 0
        L_0x0156:
            int r6 = r0.f2011x
            r6 = r6 & 112(0x70, float:1.57E-43)
            r22 = r12
            r12 = 48
            if (r6 == r12) goto L_0x019e
            r12 = 80
            if (r6 == r12) goto L_0x0190
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r12 = r4.topMargin
            r24 = r2
            int r2 = r0.f2006s
            r18 = r14
            int r14 = r12 + r2
            if (r6 >= r14) goto L_0x0179
            int r6 = r12 + r2
            goto L_0x018e
        L_0x0179:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f2007t
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x018e
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x018e:
            int r8 = r8 + r6
            goto L_0x01ad
        L_0x0190:
            r24 = r2
            r18 = r14
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f2007t
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01ad
        L_0x019e:
            r24 = r2
            r18 = r14
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f2006s
            int r8 = r2 + r3
        L_0x01ad:
            if (r1 == 0) goto L_0x0222
            if (r15 == 0) goto L_0x01b5
            int r3 = r0.f2004q
            r1 = 1
            goto L_0x01b7
        L_0x01b5:
            r1 = 1
            r3 = 0
        L_0x01b7:
            r2 = r11[r1]
            int r3 = r3 - r2
            r2 = 0
            int r4 = java.lang.Math.max(r2, r3)
            int r10 = r10 - r4
            int r3 = -r3
            int r3 = java.lang.Math.max(r2, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x01ed
            android.widget.TextView r1 = r0.f1990c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0559e) r1
            android.widget.TextView r2 = r0.f1990c
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f1990c
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f1990c
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f2005r
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01ee
        L_0x01ed:
            r2 = r10
        L_0x01ee:
            if (r18 == 0) goto L_0x0216
            android.widget.TextView r1 = r0.f1991d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0559e) r1
            int r3 = r1.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f1991d
            int r3 = r3.getMeasuredWidth()
            int r3 = r10 - r3
            android.widget.TextView r4 = r0.f1991d
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f1991d
            r5.layout(r3, r8, r10, r4)
            int r3 = r0.f2005r
            int r3 = r10 - r3
            int r1 = r1.bottomMargin
            goto L_0x0217
        L_0x0216:
            r3 = r10
        L_0x0217:
            if (r15 == 0) goto L_0x021e
            int r1 = java.lang.Math.min(r2, r3)
            r10 = r1
        L_0x021e:
            r2 = r24
            goto L_0x011e
        L_0x0222:
            if (r15 == 0) goto L_0x0227
            int r3 = r0.f2004q
            goto L_0x0228
        L_0x0227:
            r3 = 0
        L_0x0228:
            r7 = 0
            r1 = r11[r7]
            int r3 = r3 - r1
            int r1 = java.lang.Math.max(r7, r3)
            int r2 = r24 + r1
            int r1 = -r3
            int r1 = java.lang.Math.max(r7, r1)
            r11[r7] = r1
            if (r13 == 0) goto L_0x025e
            android.widget.TextView r1 = r0.f1990c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0559e) r1
            android.widget.TextView r3 = r0.f1990c
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            android.widget.TextView r4 = r0.f1990c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f1990c
            r5.layout(r2, r8, r3, r4)
            int r5 = r0.f2005r
            int r3 = r3 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x025f
        L_0x025e:
            r3 = r2
        L_0x025f:
            if (r18 == 0) goto L_0x0285
            android.widget.TextView r1 = r0.f1991d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0559e) r1
            int r4 = r1.topMargin
            int r8 = r8 + r4
            android.widget.TextView r4 = r0.f1991d
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f1991d
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1991d
            r6.layout(r2, r8, r4, r5)
            int r5 = r0.f2005r
            int r4 = r4 + r5
            int r1 = r1.bottomMargin
            goto L_0x0286
        L_0x0285:
            r4 = r2
        L_0x0286:
            if (r15 == 0) goto L_0x028c
            int r2 = java.lang.Math.max(r3, r4)
        L_0x028c:
            java.util.ArrayList<android.view.View> r1 = r0.f1977E
            r3 = 3
            r0.m2182a(r1, r3)
            java.util.ArrayList<android.view.View> r1 = r0.f1977E
            int r1 = r1.size()
            r3 = r2
            r2 = 0
        L_0x029a:
            if (r2 >= r1) goto L_0x02ad
            java.util.ArrayList<android.view.View> r4 = r0.f1977E
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r3 = r0.m2186a(r4, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x029a
        L_0x02ad:
            r12 = r22
            java.util.ArrayList<android.view.View> r1 = r0.f1977E
            r2 = 5
            r0.m2182a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f1977E
            int r1 = r1.size()
            r2 = 0
        L_0x02bc:
            if (r2 >= r1) goto L_0x02cd
            java.util.ArrayList<android.view.View> r4 = r0.f1977E
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.m2176b(r4, r10, r11, r12)
            int r2 = r2 + 1
            goto L_0x02bc
        L_0x02cd:
            java.util.ArrayList<android.view.View> r1 = r0.f1977E
            r2 = 1
            r0.m2182a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f1977E
            int r1 = r0.m2181a(r1, r11)
            int r4 = r16 - r17
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r17 + r4
            int r2 = r1 / 2
            int r2 = r6 - r2
            int r1 = r1 + r2
            if (r2 >= r3) goto L_0x02e9
            goto L_0x02f0
        L_0x02e9:
            if (r1 <= r10) goto L_0x02ef
            int r1 = r1 - r10
            int r3 = r2 - r1
            goto L_0x02f0
        L_0x02ef:
            r3 = r2
        L_0x02f0:
            java.util.ArrayList<android.view.View> r1 = r0.f1977E
            int r1 = r1.size()
        L_0x02f6:
            if (r7 >= r1) goto L_0x0307
            java.util.ArrayList<android.view.View> r2 = r0.f1977E
            java.lang.Object r2 = r2.get(r7)
            android.view.View r2 = (android.view.View) r2
            int r3 = r0.m2186a(r2, r3, r11, r12)
            int r7 = r7 + 1
            goto L_0x02f6
        L_0x0307:
            java.util.ArrayList<android.view.View> r1 = r0.f1977E
            r1.clear()
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r17, int r18) {
            r16 = this;
            r7 = r16
            int[] r8 = r7.f1979G
            boolean r0 = androidx.appcompat.widget.C0661z0.m1764a(r16)
            r1 = 1
            r9 = 0
            if (r0 == 0) goto L_0x000f
            r10 = 1
            r11 = 0
            goto L_0x0011
        L_0x000f:
            r10 = 0
            r11 = 1
        L_0x0011:
            android.widget.ImageButton r0 = r7.f1992e
            boolean r0 = r7.m2172d(r0)
            if (r0 == 0) goto L_0x0053
            android.widget.ImageButton r1 = r7.f1992e
            r5 = 0
            int r6 = r7.f2003p
            r3 = 0
            r0 = r16
            r2 = r17
            r4 = r18
            r0.m2188a(r1, r2, r3, r4, r5, r6)
            android.widget.ImageButton r0 = r7.f1992e
            int r0 = r0.getMeasuredWidth()
            android.widget.ImageButton r1 = r7.f1992e
            int r1 = r7.m2190a(r1)
            int r0 = r0 + r1
            android.widget.ImageButton r1 = r7.f1992e
            int r1 = r1.getMeasuredHeight()
            android.widget.ImageButton r2 = r7.f1992e
            int r2 = r7.m2177b(r2)
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r9, r1)
            android.widget.ImageButton r2 = r7.f1992e
            int r2 = r2.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r9, r2)
            r12 = r1
            r13 = r2
            goto L_0x0056
        L_0x0053:
            r0 = 0
            r12 = 0
            r13 = 0
        L_0x0056:
            android.widget.ImageButton r1 = r7.f1996i
            boolean r1 = r7.m2172d(r1)
            if (r1 == 0) goto L_0x0095
            android.widget.ImageButton r1 = r7.f1996i
            r5 = 0
            int r6 = r7.f2003p
            r3 = 0
            r0 = r16
            r2 = r17
            r4 = r18
            r0.m2188a(r1, r2, r3, r4, r5, r6)
            android.widget.ImageButton r0 = r7.f1996i
            int r0 = r0.getMeasuredWidth()
            android.widget.ImageButton r1 = r7.f1996i
            int r1 = r7.m2190a(r1)
            int r0 = r0 + r1
            android.widget.ImageButton r1 = r7.f1996i
            int r1 = r1.getMeasuredHeight()
            android.widget.ImageButton r2 = r7.f1996i
            int r2 = r7.m2177b(r2)
            int r1 = r1 + r2
            int r12 = java.lang.Math.max(r12, r1)
            android.widget.ImageButton r1 = r7.f1996i
            int r1 = r1.getMeasuredState()
            int r13 = android.view.View.combineMeasuredStates(r13, r1)
        L_0x0095:
            int r1 = r16.getCurrentContentInsetStart()
            int r2 = java.lang.Math.max(r1, r0)
            int r14 = r9 + r2
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r9, r1)
            r8[r10] = r0
            androidx.appcompat.widget.ActionMenuView r0 = r7.f1989b
            boolean r0 = r7.m2172d(r0)
            if (r0 == 0) goto L_0x00e6
            androidx.appcompat.widget.ActionMenuView r1 = r7.f1989b
            r5 = 0
            int r6 = r7.f2003p
            r0 = r16
            r2 = r17
            r3 = r14
            r4 = r18
            r0.m2188a(r1, r2, r3, r4, r5, r6)
            androidx.appcompat.widget.ActionMenuView r0 = r7.f1989b
            int r0 = r0.getMeasuredWidth()
            androidx.appcompat.widget.ActionMenuView r1 = r7.f1989b
            int r1 = r7.m2190a(r1)
            int r0 = r0 + r1
            androidx.appcompat.widget.ActionMenuView r1 = r7.f1989b
            int r1 = r1.getMeasuredHeight()
            androidx.appcompat.widget.ActionMenuView r2 = r7.f1989b
            int r2 = r7.m2177b(r2)
            int r1 = r1 + r2
            int r12 = java.lang.Math.max(r12, r1)
            androidx.appcompat.widget.ActionMenuView r1 = r7.f1989b
            int r1 = r1.getMeasuredState()
            int r13 = android.view.View.combineMeasuredStates(r13, r1)
            goto L_0x00e7
        L_0x00e6:
            r0 = 0
        L_0x00e7:
            int r1 = r16.getCurrentContentInsetEnd()
            int r2 = java.lang.Math.max(r1, r0)
            int r10 = r14 + r2
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r9, r1)
            r8[r11] = r0
            android.view.View r0 = r7.f1997j
            boolean r0 = r7.m2172d(r0)
            if (r0 == 0) goto L_0x012b
            android.view.View r1 = r7.f1997j
            r5 = 0
            r0 = r16
            r2 = r17
            r3 = r10
            r4 = r18
            r6 = r8
            int r0 = r0.m2187a(r1, r2, r3, r4, r5, r6)
            int r10 = r10 + r0
            android.view.View r0 = r7.f1997j
            int r0 = r0.getMeasuredHeight()
            android.view.View r1 = r7.f1997j
            int r1 = r7.m2177b(r1)
            int r0 = r0 + r1
            int r12 = java.lang.Math.max(r12, r0)
            android.view.View r0 = r7.f1997j
            int r0 = r0.getMeasuredState()
            int r13 = android.view.View.combineMeasuredStates(r13, r0)
        L_0x012b:
            android.widget.ImageView r0 = r7.f1993f
            boolean r0 = r7.m2172d(r0)
            if (r0 == 0) goto L_0x015e
            android.widget.ImageView r1 = r7.f1993f
            r5 = 0
            r0 = r16
            r2 = r17
            r3 = r10
            r4 = r18
            r6 = r8
            int r0 = r0.m2187a(r1, r2, r3, r4, r5, r6)
            int r10 = r10 + r0
            android.widget.ImageView r0 = r7.f1993f
            int r0 = r0.getMeasuredHeight()
            android.widget.ImageView r1 = r7.f1993f
            int r1 = r7.m2177b(r1)
            int r0 = r0 + r1
            int r12 = java.lang.Math.max(r12, r0)
            android.widget.ImageView r0 = r7.f1993f
            int r0 = r0.getMeasuredState()
            int r13 = android.view.View.combineMeasuredStates(r13, r0)
        L_0x015e:
            int r11 = r16.getChildCount()
            r14 = r12
            r12 = r10
            r10 = 0
        L_0x0165:
            if (r10 >= r11) goto L_0x01a5
            android.view.View r15 = r7.getChildAt(r10)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r0 = (androidx.appcompat.widget.Toolbar.C0559e) r0
            int r0 = r0.f2020b
            if (r0 != 0) goto L_0x01a2
            boolean r0 = r7.m2172d(r15)
            if (r0 != 0) goto L_0x017c
            goto L_0x01a2
        L_0x017c:
            r5 = 0
            r0 = r16
            r1 = r15
            r2 = r17
            r3 = r12
            r4 = r18
            r6 = r8
            int r0 = r0.m2187a(r1, r2, r3, r4, r5, r6)
            int r12 = r12 + r0
            int r0 = r15.getMeasuredHeight()
            int r1 = r7.m2177b(r15)
            int r0 = r0 + r1
            int r0 = java.lang.Math.max(r14, r0)
            int r1 = r15.getMeasuredState()
            int r1 = android.view.View.combineMeasuredStates(r13, r1)
            r14 = r0
            r13 = r1
        L_0x01a2:
            int r10 = r10 + 1
            goto L_0x0165
        L_0x01a5:
            int r0 = r7.f2006s
            int r1 = r7.f2007t
            int r10 = r0 + r1
            int r0 = r7.f2004q
            int r1 = r7.f2005r
            int r11 = r0 + r1
            android.widget.TextView r0 = r7.f1990c
            boolean r0 = r7.m2172d(r0)
            if (r0 == 0) goto L_0x01f0
            android.widget.TextView r1 = r7.f1990c
            int r3 = r12 + r11
            r0 = r16
            r2 = r17
            r4 = r18
            r5 = r10
            r6 = r8
            r0.m2187a(r1, r2, r3, r4, r5, r6)
            android.widget.TextView r0 = r7.f1990c
            int r0 = r0.getMeasuredWidth()
            android.widget.TextView r1 = r7.f1990c
            int r1 = r7.m2190a(r1)
            int r0 = r0 + r1
            android.widget.TextView r1 = r7.f1990c
            int r1 = r1.getMeasuredHeight()
            android.widget.TextView r2 = r7.f1990c
            int r2 = r7.m2177b(r2)
            int r1 = r1 + r2
            android.widget.TextView r2 = r7.f1990c
            int r2 = r2.getMeasuredState()
            int r13 = android.view.View.combineMeasuredStates(r13, r2)
            r15 = r1
            r6 = r13
            r13 = r0
            goto L_0x01f3
        L_0x01f0:
            r6 = r13
            r13 = 0
            r15 = 0
        L_0x01f3:
            android.widget.TextView r0 = r7.f1991d
            boolean r0 = r7.m2172d(r0)
            if (r0 == 0) goto L_0x022a
            android.widget.TextView r1 = r7.f1991d
            int r3 = r12 + r11
            int r5 = r15 + r10
            r0 = r16
            r2 = r17
            r4 = r18
            r10 = r6
            r6 = r8
            int r0 = r0.m2187a(r1, r2, r3, r4, r5, r6)
            int r13 = java.lang.Math.max(r13, r0)
            android.widget.TextView r0 = r7.f1991d
            int r0 = r0.getMeasuredHeight()
            android.widget.TextView r1 = r7.f1991d
            int r1 = r7.m2177b(r1)
            int r0 = r0 + r1
            int r15 = r15 + r0
            android.widget.TextView r0 = r7.f1991d
            int r0 = r0.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r10, r0)
            goto L_0x022b
        L_0x022a:
            r10 = r6
        L_0x022b:
            int r12 = r12 + r13
            int r0 = java.lang.Math.max(r14, r15)
            int r1 = r16.getPaddingLeft()
            int r2 = r16.getPaddingRight()
            int r1 = r1 + r2
            int r12 = r12 + r1
            int r1 = r16.getPaddingTop()
            int r2 = r16.getPaddingBottom()
            int r1 = r1 + r2
            int r0 = r0 + r1
            int r1 = r16.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r12, r1)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r6
            r3 = r17
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            int r2 = r16.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r6 << 16
            r3 = r18
            int r0 = android.view.View.resolveSizeAndState(r0, r3, r2)
            boolean r2 = r16.m2158r()
            if (r2 == 0) goto L_0x026c
            r0 = 0
        L_0x026c:
            r7.setMeasuredDimension(r1, r0)
            return
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r4) {
            r3 = this;
            boolean r0 = r4 instanceof androidx.appcompat.widget.Toolbar.C0561g
            if (r0 != 0) goto L_0x0008
            super.onRestoreInstanceState(r4)
            return
        L_0x0008:
            androidx.appcompat.widget.Toolbar$g r4 = (androidx.appcompat.widget.Toolbar.C0561g) r4
            android.os.Parcelable r0 = r4.m3347a()
            super.onRestoreInstanceState(r0)
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1989b
            if (r0 == 0) goto L_0x001a
            androidx.appcompat.view.menu.h r0 = r0.m2255j()
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            int r1 = r4.f2021d
            if (r1 == 0) goto L_0x002e
            androidx.appcompat.widget.Toolbar$d r2 = r3.f1984L
            if (r2 == 0) goto L_0x002e
            if (r0 == 0) goto L_0x002e
            android.view.MenuItem r0 = r0.findItem(r1)
            if (r0 == 0) goto L_0x002e
            r0.expandActionView()
        L_0x002e:
            boolean r4 = r4.f2022e
            if (r4 == 0) goto L_0x0035
            r3.m2159q()
        L_0x0035:
            return
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 < r1) goto L_0x0009
            super.onRtlPropertiesChanged(r3)
        L_0x0009:
            r2.m2164l()
            androidx.appcompat.widget.l0 r0 = r2.f2008u
            r1 = 1
            if (r3 != r1) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            r0.m1969a(r1)
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            androidx.appcompat.widget.Toolbar$g r0 = new androidx.appcompat.widget.Toolbar$g
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            androidx.appcompat.widget.Toolbar$d r1 = r2.f1984L
            if (r1 == 0) goto L_0x0017
            androidx.appcompat.view.menu.k r1 = r1.f2018c
            if (r1 == 0) goto L_0x0017
            int r1 = r1.getItemId()
            r0.f2021d = r1
        L_0x0017:
            boolean r1 = r2.m2167i()
            r0.f2022e = r1
            return r0
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r5.getActionMasked()
            r1 = 0
            if (r0 != 0) goto L_0x0009
            r4.f1975C = r1
        L_0x0009:
            boolean r2 = r4.f1975C
            r3 = 1
            if (r2 != 0) goto L_0x0018
            boolean r5 = super.onTouchEvent(r5)
            if (r0 != 0) goto L_0x0018
            if (r5 != 0) goto L_0x0018
            r4.f1975C = r3
        L_0x0018:
            if (r0 == r3) goto L_0x001d
            r5 = 3
            if (r0 != r5) goto L_0x001f
        L_0x001d:
            r4.f1975C = r1
        L_0x001f:
            return r3
    }

    public void setCollapsible(boolean r1) {
            r0 = this;
            r0.f1987O = r1
            r0.requestLayout()
            return
    }

    public void setContentInsetEndWithActions(int r2) {
            r1 = this;
            if (r2 >= 0) goto L_0x0004
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0004:
            int r0 = r1.f2010w
            if (r2 == r0) goto L_0x0013
            r1.f2010w = r2
            android.graphics.drawable.Drawable r2 = r1.getNavigationIcon()
            if (r2 == 0) goto L_0x0013
            r1.requestLayout()
        L_0x0013:
            return
    }

    public void setContentInsetStartWithNavigation(int r2) {
            r1 = this;
            if (r2 >= 0) goto L_0x0004
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0004:
            int r0 = r1.f2009v
            if (r2 == r0) goto L_0x0013
            r1.f2009v = r2
            android.graphics.drawable.Drawable r2 = r1.getNavigationIcon()
            if (r2 == 0) goto L_0x0013
            r1.requestLayout()
        L_0x0013:
            return
    }

    public void setLogo(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p000a.p001a.p002k.p003a.C0010a.m4259c(r0, r2)
            r1.setLogo(r2)
            return
    }

    public void setLogo(android.graphics.drawable.Drawable r3) {
            r2 = this;
            if (r3 == 0) goto L_0x0014
            r2.m2163m()
            android.widget.ImageView r0 = r2.f1993f
            boolean r0 = r2.m2174c(r0)
            if (r0 != 0) goto L_0x002a
            android.widget.ImageView r0 = r2.f1993f
            r1 = 1
            r2.m2185a(r0, r1)
            goto L_0x002a
        L_0x0014:
            android.widget.ImageView r0 = r2.f1993f
            if (r0 == 0) goto L_0x002a
            boolean r0 = r2.m2174c(r0)
            if (r0 == 0) goto L_0x002a
            android.widget.ImageView r0 = r2.f1993f
            r2.removeView(r0)
            java.util.ArrayList<android.view.View> r0 = r2.f1978F
            android.widget.ImageView r1 = r2.f1993f
            r0.remove(r1)
        L_0x002a:
            android.widget.ImageView r0 = r2.f1993f
            if (r0 == 0) goto L_0x0031
            r0.setImageDrawable(r3)
        L_0x0031:
            return
    }

    public void setLogoDescription(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            r1.setLogoDescription(r2)
            return
    }

    public void setLogoDescription(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0009
            r1.m2163m()
        L_0x0009:
            android.widget.ImageView r0 = r1.f1993f
            if (r0 == 0) goto L_0x0010
            r0.setContentDescription(r2)
        L_0x0010:
            return
    }

    public void setNavigationContentDescription(int r2) {
            r1 = this;
            if (r2 == 0) goto L_0x000b
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            r1.setNavigationContentDescription(r2)
            return
    }

    public void setNavigationContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0009
            r1.m2160p()
        L_0x0009:
            android.widget.ImageButton r0 = r1.f1992e
            if (r0 == 0) goto L_0x0010
            r0.setContentDescription(r2)
        L_0x0010:
            return
    }

    public void setNavigationIcon(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p000a.p001a.p002k.p003a.C0010a.m4259c(r0, r2)
            r1.setNavigationIcon(r2)
            return
    }

    public void setNavigationIcon(android.graphics.drawable.Drawable r3) {
            r2 = this;
            if (r3 == 0) goto L_0x0014
            r2.m2160p()
            android.widget.ImageButton r0 = r2.f1992e
            boolean r0 = r2.m2174c(r0)
            if (r0 != 0) goto L_0x002a
            android.widget.ImageButton r0 = r2.f1992e
            r1 = 1
            r2.m2185a(r0, r1)
            goto L_0x002a
        L_0x0014:
            android.widget.ImageButton r0 = r2.f1992e
            if (r0 == 0) goto L_0x002a
            boolean r0 = r2.m2174c(r0)
            if (r0 == 0) goto L_0x002a
            android.widget.ImageButton r0 = r2.f1992e
            r2.removeView(r0)
            java.util.ArrayList<android.view.View> r0 = r2.f1978F
            android.widget.ImageButton r1 = r2.f1992e
            r0.remove(r1)
        L_0x002a:
            android.widget.ImageButton r0 = r2.f1992e
            if (r0 == 0) goto L_0x0031
            r0.setImageDrawable(r3)
        L_0x0031:
            return
    }

    public void setNavigationOnClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            r1.m2160p()
            android.widget.ImageButton r0 = r1.f1992e
            r0.setOnClickListener(r2)
            return
    }

    public void setOnMenuItemClickListener(androidx.appcompat.widget.Toolbar.AbstractC0560f r1) {
            r0 = this;
            r0.f1980H = r1
            return
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.m2162n()
            androidx.appcompat.widget.ActionMenuView r0 = r1.f1989b
            r0.setOverflowIcon(r2)
            return
    }

    public void setPopupTheme(int r3) {
            r2 = this;
            int r0 = r2.f1999l
            if (r0 == r3) goto L_0x001a
            r2.f1999l = r3
            if (r3 != 0) goto L_0x000f
            android.content.Context r3 = r2.getContext()
            r2.f1998k = r3
            goto L_0x001a
        L_0x000f:
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            r2.f1998k = r0
        L_0x001a:
            return
    }

    public void setSubtitle(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            r1.setSubtitle(r2)
            return
    }

    public void setSubtitle(java.lang.CharSequence r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0042
            android.widget.TextView r0 = r3.f1991d
            if (r0 != 0) goto L_0x0033
            android.content.Context r0 = r3.getContext()
            androidx.appcompat.widget.y r1 = new androidx.appcompat.widget.y
            r1.<init>(r0)
            r3.f1991d = r1
            android.widget.TextView r1 = r3.f1991d
            r1.setSingleLine()
            android.widget.TextView r1 = r3.f1991d
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r2)
            int r1 = r3.f2001n
            if (r1 == 0) goto L_0x002a
            android.widget.TextView r2 = r3.f1991d
            r2.setTextAppearance(r0, r1)
        L_0x002a:
            int r0 = r3.f1974B
            if (r0 == 0) goto L_0x0033
            android.widget.TextView r1 = r3.f1991d
            r1.setTextColor(r0)
        L_0x0033:
            android.widget.TextView r0 = r3.f1991d
            boolean r0 = r3.m2174c(r0)
            if (r0 != 0) goto L_0x0058
            android.widget.TextView r0 = r3.f1991d
            r1 = 1
            r3.m2185a(r0, r1)
            goto L_0x0058
        L_0x0042:
            android.widget.TextView r0 = r3.f1991d
            if (r0 == 0) goto L_0x0058
            boolean r0 = r3.m2174c(r0)
            if (r0 == 0) goto L_0x0058
            android.widget.TextView r0 = r3.f1991d
            r3.removeView(r0)
            java.util.ArrayList<android.view.View> r0 = r3.f1978F
            android.widget.TextView r1 = r3.f1991d
            r0.remove(r1)
        L_0x0058:
            android.widget.TextView r0 = r3.f1991d
            if (r0 == 0) goto L_0x005f
            r0.setText(r4)
        L_0x005f:
            r3.f2013z = r4
            return
    }

    public void setSubtitleTextColor(int r2) {
            r1 = this;
            r1.f1974B = r2
            android.widget.TextView r0 = r1.f1991d
            if (r0 == 0) goto L_0x0009
            r0.setTextColor(r2)
        L_0x0009:
            return
    }

    public void setTitle(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            r1.setTitle(r2)
            return
    }

    public void setTitle(java.lang.CharSequence r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0042
            android.widget.TextView r0 = r3.f1990c
            if (r0 != 0) goto L_0x0033
            android.content.Context r0 = r3.getContext()
            androidx.appcompat.widget.y r1 = new androidx.appcompat.widget.y
            r1.<init>(r0)
            r3.f1990c = r1
            android.widget.TextView r1 = r3.f1990c
            r1.setSingleLine()
            android.widget.TextView r1 = r3.f1990c
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r2)
            int r1 = r3.f2000m
            if (r1 == 0) goto L_0x002a
            android.widget.TextView r2 = r3.f1990c
            r2.setTextAppearance(r0, r1)
        L_0x002a:
            int r0 = r3.f1973A
            if (r0 == 0) goto L_0x0033
            android.widget.TextView r1 = r3.f1990c
            r1.setTextColor(r0)
        L_0x0033:
            android.widget.TextView r0 = r3.f1990c
            boolean r0 = r3.m2174c(r0)
            if (r0 != 0) goto L_0x0058
            android.widget.TextView r0 = r3.f1990c
            r1 = 1
            r3.m2185a(r0, r1)
            goto L_0x0058
        L_0x0042:
            android.widget.TextView r0 = r3.f1990c
            if (r0 == 0) goto L_0x0058
            boolean r0 = r3.m2174c(r0)
            if (r0 == 0) goto L_0x0058
            android.widget.TextView r0 = r3.f1990c
            r3.removeView(r0)
            java.util.ArrayList<android.view.View> r0 = r3.f1978F
            android.widget.TextView r1 = r3.f1990c
            r0.remove(r1)
        L_0x0058:
            android.widget.TextView r0 = r3.f1990c
            if (r0 == 0) goto L_0x005f
            r0.setText(r4)
        L_0x005f:
            r3.f2012y = r4
            return
    }

    public void setTitleMarginBottom(int r1) {
            r0 = this;
            r0.f2007t = r1
            r0.requestLayout()
            return
    }

    public void setTitleMarginEnd(int r1) {
            r0 = this;
            r0.f2005r = r1
            r0.requestLayout()
            return
    }

    public void setTitleMarginStart(int r1) {
            r0 = this;
            r0.f2004q = r1
            r0.requestLayout()
            return
    }

    public void setTitleMarginTop(int r1) {
            r0 = this;
            r0.f2006s = r1
            r0.requestLayout()
            return
    }

    public void setTitleTextColor(int r2) {
            r1 = this;
            r1.f1973A = r2
            android.widget.TextView r0 = r1.f1990c
            if (r0 == 0) goto L_0x0009
            r0.setTextColor(r2)
        L_0x0009:
            return
    }
}
