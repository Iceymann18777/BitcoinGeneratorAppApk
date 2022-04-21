package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends android.view.ViewGroup implements androidx.appcompat.widget.AbstractC0566a0, p000a.p018g.p029l.AbstractC0211m {

    /* renamed from: C */
    static final int[] f1833C = null;

    /* renamed from: A */
    private final java.lang.Runnable f1834A;

    /* renamed from: B */
    private final p000a.p018g.p029l.C0212n f1835B;

    /* renamed from: b */
    private int f1836b;

    /* renamed from: c */
    private int f1837c;

    /* renamed from: d */
    private androidx.appcompat.widget.ContentFrameLayout f1838d;

    /* renamed from: e */
    androidx.appcompat.widget.ActionBarContainer f1839e;

    /* renamed from: f */
    private androidx.appcompat.widget.AbstractC0569b0 f1840f;

    /* renamed from: g */
    private android.graphics.drawable.Drawable f1841g;

    /* renamed from: h */
    private boolean f1842h;

    /* renamed from: i */
    private boolean f1843i;

    /* renamed from: j */
    private boolean f1844j;

    /* renamed from: k */
    private boolean f1845k;

    /* renamed from: l */
    boolean f1846l;

    /* renamed from: m */
    private int f1847m;

    /* renamed from: n */
    private int f1848n;

    /* renamed from: o */
    private final android.graphics.Rect f1849o;

    /* renamed from: p */
    private final android.graphics.Rect f1850p;

    /* renamed from: q */
    private final android.graphics.Rect f1851q;

    /* renamed from: r */
    private final android.graphics.Rect f1852r;

    /* renamed from: s */
    private final android.graphics.Rect f1853s;

    /* renamed from: t */
    private final android.graphics.Rect f1854t;

    /* renamed from: u */
    private final android.graphics.Rect f1855u;

    /* renamed from: v */
    private androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0529d f1856v;

    /* renamed from: w */
    private android.widget.OverScroller f1857w;

    /* renamed from: x */
    android.view.ViewPropertyAnimator f1858x;

    /* renamed from: y */
    final android.animation.AnimatorListenerAdapter f1859y;

    /* renamed from: z */
    private final java.lang.Runnable f1860z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    /* loaded from: classes.dex */
    class C0526a extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ androidx.appcompat.widget.ActionBarOverlayLayout f1861a;

        C0526a(androidx.appcompat.widget.ActionBarOverlayLayout r1) {
                r0 = this;
                r0.f1861a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r2) {
                r1 = this;
                androidx.appcompat.widget.ActionBarOverlayLayout r2 = r1.f1861a
                r0 = 0
                r2.f1858x = r0
                r0 = 0
                r2.f1846l = r0
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                androidx.appcompat.widget.ActionBarOverlayLayout r2 = r1.f1861a
                r0 = 0
                r2.f1858x = r0
                r0 = 0
                r2.f1846l = r0
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    /* loaded from: classes.dex */
    class RunnableC0527b implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.widget.ActionBarOverlayLayout f1862b;

        RunnableC0527b(androidx.appcompat.widget.ActionBarOverlayLayout r1) {
                r0 = this;
                r0.f1862b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.appcompat.widget.ActionBarOverlayLayout r0 = r3.f1862b
                r0.m2279h()
                androidx.appcompat.widget.ActionBarOverlayLayout r0 = r3.f1862b
                androidx.appcompat.widget.ActionBarContainer r1 = r0.f1839e
                android.view.ViewPropertyAnimator r1 = r1.animate()
                r2 = 0
                android.view.ViewPropertyAnimator r1 = r1.translationY(r2)
                androidx.appcompat.widget.ActionBarOverlayLayout r2 = r3.f1862b
                android.animation.AnimatorListenerAdapter r2 = r2.f1859y
                android.view.ViewPropertyAnimator r1 = r1.setListener(r2)
                r0.f1858x = r1
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    /* loaded from: classes.dex */
    class RunnableC0528c implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.widget.ActionBarOverlayLayout f1863b;

        RunnableC0528c(androidx.appcompat.widget.ActionBarOverlayLayout r1) {
                r0 = this;
                r0.f1863b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.appcompat.widget.ActionBarOverlayLayout r0 = r3.f1863b
                r0.m2279h()
                androidx.appcompat.widget.ActionBarOverlayLayout r0 = r3.f1863b
                androidx.appcompat.widget.ActionBarContainer r1 = r0.f1839e
                android.view.ViewPropertyAnimator r1 = r1.animate()
                androidx.appcompat.widget.ActionBarOverlayLayout r2 = r3.f1863b
                androidx.appcompat.widget.ActionBarContainer r2 = r2.f1839e
                int r2 = r2.getHeight()
                int r2 = -r2
                float r2 = (float) r2
                android.view.ViewPropertyAnimator r1 = r1.translationY(r2)
                androidx.appcompat.widget.ActionBarOverlayLayout r2 = r3.f1863b
                android.animation.AnimatorListenerAdapter r2 = r2.f1859y
                android.view.ViewPropertyAnimator r1 = r1.setListener(r2)
                r0.f1858x = r1
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    /* loaded from: classes.dex */
    public interface AbstractC0529d {
        /* renamed from: a */
        void mo2272a();

        /* renamed from: a */
        void mo2271a(int r1);

        /* renamed from: a */
        void mo2270a(boolean r1);

        /* renamed from: b */
        void mo2269b();

        /* renamed from: c */
        void mo2268c();

        /* renamed from: d */
        void mo2267d();
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    /* loaded from: classes.dex */
    public static class C0530e extends android.view.ViewGroup.MarginLayoutParams {
        public C0530e(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public C0530e(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public C0530e(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    static {
            r0 = 2
            int[] r0 = new int[r0]
            int r1 = p000a.p001a.C0000a.actionBarSize
            r2 = 0
            r0[r2] = r1
            r1 = 1
            r2 = 16842841(0x1010059, float:2.3693807E-38)
            r0[r1] = r2
            androidx.appcompat.widget.ActionBarOverlayLayout.f1833C = r0
            return
    }

    public ActionBarOverlayLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionBarOverlayLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r2 = 0
            r0.f1837c = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.f1849o = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.f1850p = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.f1851q = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.f1852r = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.f1853s = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.f1854t = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.f1855u = r2
            androidx.appcompat.widget.ActionBarOverlayLayout$a r2 = new androidx.appcompat.widget.ActionBarOverlayLayout$a
            r2.<init>(r0)
            r0.f1859y = r2
            androidx.appcompat.widget.ActionBarOverlayLayout$b r2 = new androidx.appcompat.widget.ActionBarOverlayLayout$b
            r2.<init>(r0)
            r0.f1860z = r2
            androidx.appcompat.widget.ActionBarOverlayLayout$c r2 = new androidx.appcompat.widget.ActionBarOverlayLayout$c
            r2.<init>(r0)
            r0.f1834A = r2
            r0.m2282a(r1)
            a.g.l.n r1 = new a.g.l.n
            r1.<init>(r0)
            r0.f1835B = r1
            return
    }

    /* renamed from: a */
    private androidx.appcompat.widget.AbstractC0569b0 m2281a(android.view.View r4) {
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
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* renamed from: a */
    private void m2282a(android.content.Context r5) {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int[] r1 = androidx.appcompat.widget.ActionBarOverlayLayout.f1833C
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            r1 = 0
            int r2 = r0.getDimensionPixelSize(r1, r1)
            r4.f1836b = r2
            r2 = 1
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r2)
            r4.f1841g = r3
            android.graphics.drawable.Drawable r3 = r4.f1841g
            if (r3 != 0) goto L_0x0022
            r3 = 1
            goto L_0x0023
        L_0x0022:
            r3 = 0
        L_0x0023:
            r4.setWillNotDraw(r3)
            r0.recycle()
            android.content.pm.ApplicationInfo r0 = r5.getApplicationInfo()
            int r0 = r0.targetSdkVersion
            r3 = 19
            if (r0 >= r3) goto L_0x0034
            r1 = 1
        L_0x0034:
            r4.f1842h = r1
            android.widget.OverScroller r0 = new android.widget.OverScroller
            r0.<init>(r5)
            r4.f1857w = r0
            return
    }

    /* renamed from: a */
    private boolean m2283a(float r10, float r11) {
            r9 = this;
            android.widget.OverScroller r0 = r9.f1857w
            int r4 = (int) r11
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r0.fling(r1, r2, r3, r4, r5, r6, r7, r8)
            android.widget.OverScroller r10 = r9.f1857w
            int r10 = r10.getFinalY()
            androidx.appcompat.widget.ActionBarContainer r11 = r9.f1839e
            int r11 = r11.getHeight()
            if (r10 <= r11) goto L_0x0020
            r10 = 1
            goto L_0x0021
        L_0x0020:
            r10 = 0
        L_0x0021:
            return r10
    }

    /* renamed from: a */
    private boolean m2280a(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0530e) r3
            r0 = 1
            if (r5 == 0) goto L_0x0013
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L_0x0013
            r3.leftMargin = r1
            r5 = 1
            goto L_0x0014
        L_0x0013:
            r5 = 0
        L_0x0014:
            if (r6 == 0) goto L_0x001f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L_0x001f
            r3.topMargin = r1
            r5 = 1
        L_0x001f:
            if (r8 == 0) goto L_0x002a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L_0x002a
            r3.rightMargin = r8
            r5 = 1
        L_0x002a:
            if (r7 == 0) goto L_0x0035
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L_0x0035
            r3.bottomMargin = r4
            r5 = 1
        L_0x0035:
            return r5
    }

    /* renamed from: k */
    private void m2276k() {
            r1 = this;
            r1.m2279h()
            java.lang.Runnable r0 = r1.f1834A
            r0.run()
            return
    }

    /* renamed from: l */
    private void m2275l() {
            r3 = this;
            r3.m2279h()
            java.lang.Runnable r0 = r3.f1834A
            r1 = 600(0x258, double:2.964E-321)
            r3.postDelayed(r0, r1)
            return
    }

    /* renamed from: m */
    private void m2274m() {
            r3 = this;
            r3.m2279h()
            java.lang.Runnable r0 = r3.f1860z
            r1 = 600(0x258, double:2.964E-321)
            r3.postDelayed(r0, r1)
            return
    }

    /* renamed from: n */
    private void m2273n() {
            r1 = this;
            r1.m2279h()
            java.lang.Runnable r0 = r1.f1860z
            r0.run()
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0566a0
    /* renamed from: a */
    public void mo2146a(int r2) {
            r1 = this;
            r1.m2277j()
            r0 = 2
            if (r2 == r0) goto L_0x0019
            r0 = 5
            if (r2 == r0) goto L_0x0013
            r0 = 109(0x6d, float:1.53E-43)
            if (r2 == r0) goto L_0x000e
            goto L_0x001e
        L_0x000e:
            r2 = 1
            r1.setOverlayMode(r2)
            goto L_0x001e
        L_0x0013:
            androidx.appcompat.widget.b0 r2 = r1.f1840f
            r2.mo1857m()
            goto L_0x001e
        L_0x0019:
            androidx.appcompat.widget.b0 r2 = r1.f1840f
            r2.mo1861i()
        L_0x001e:
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0566a0
    /* renamed from: a */
    public void mo2145a(android.view.Menu r2, androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a r3) {
            r1 = this;
            r1.m2277j()
            androidx.appcompat.widget.b0 r0 = r1.f1840f
            r0.mo1883a(r2, r3)
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0566a0
    /* renamed from: a */
    public boolean mo2147a() {
            r1 = this;
            r1.m2277j()
            androidx.appcompat.widget.b0 r0 = r1.f1840f
            boolean r0 = r0.mo1887a()
            return r0
    }

    @Override // androidx.appcompat.widget.AbstractC0566a0
    /* renamed from: b */
    public boolean mo2144b() {
            r1 = this;
            r1.m2277j()
            androidx.appcompat.widget.b0 r0 = r1.f1840f
            boolean r0 = r0.mo1877b()
            return r0
    }

    @Override // androidx.appcompat.widget.AbstractC0566a0
    /* renamed from: c */
    public void mo2143c() {
            r1 = this;
            r1.m2277j()
            androidx.appcompat.widget.b0 r0 = r1.f1840f
            r0.mo1872c()
            return
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.appcompat.widget.ActionBarOverlayLayout.C0530e
            return r1
    }

    @Override // androidx.appcompat.widget.AbstractC0566a0
    /* renamed from: d */
    public boolean mo2142d() {
            r1 = this;
            r1.m2277j()
            androidx.appcompat.widget.b0 r0 = r1.f1840f
            boolean r0 = r0.mo1869d()
            return r0
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r6) {
            r5 = this;
            super.draw(r6)
            android.graphics.drawable.Drawable r0 = r5.f1841g
            if (r0 == 0) goto L_0x003d
            boolean r0 = r5.f1842h
            if (r0 != 0) goto L_0x003d
            androidx.appcompat.widget.ActionBarContainer r0 = r5.f1839e
            int r0 = r0.getVisibility()
            r1 = 0
            if (r0 != 0) goto L_0x0027
            androidx.appcompat.widget.ActionBarContainer r0 = r5.f1839e
            int r0 = r0.getBottom()
            float r0 = (float) r0
            androidx.appcompat.widget.ActionBarContainer r2 = r5.f1839e
            float r2 = r2.getTranslationY()
            float r0 = r0 + r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r2
            int r0 = (int) r0
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            android.graphics.drawable.Drawable r2 = r5.f1841g
            int r3 = r5.getWidth()
            android.graphics.drawable.Drawable r4 = r5.f1841g
            int r4 = r4.getIntrinsicHeight()
            int r4 = r4 + r0
            r2.setBounds(r1, r0, r3, r4)
            android.graphics.drawable.Drawable r0 = r5.f1841g
            r0.draw(r6)
        L_0x003d:
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0566a0
    /* renamed from: e */
    public boolean mo2141e() {
            r1 = this;
            r1.m2277j()
            androidx.appcompat.widget.b0 r0 = r1.f1840f
            boolean r0 = r0.mo1866e()
            return r0
    }

    @Override // androidx.appcompat.widget.AbstractC0566a0
    /* renamed from: f */
    public boolean mo2140f() {
            r1 = this;
            r1.m2277j()
            androidx.appcompat.widget.b0 r0 = r1.f1840f
            boolean r0 = r0.mo1864f()
            return r0
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(android.graphics.Rect r9) {
            r8 = this;
            r8.m2277j()
            int r0 = p000a.p018g.p029l.C0216r.m3404q(r8)
            r0 = r0 & 256(0x100, float:3.59E-43)
            androidx.appcompat.widget.ActionBarContainer r2 = r8.f1839e
            r4 = 1
            r5 = 1
            r6 = 0
            r7 = 1
            r1 = r8
            r3 = r9
            boolean r0 = r1.m2280a(r2, r3, r4, r5, r6, r7)
            android.graphics.Rect r1 = r8.f1852r
            r1.set(r9)
            android.graphics.Rect r9 = r8.f1852r
            android.graphics.Rect r1 = r8.f1849o
            androidx.appcompat.widget.C0661z0.m1763a(r8, r9, r1)
            android.graphics.Rect r9 = r8.f1853s
            android.graphics.Rect r1 = r8.f1852r
            boolean r9 = r9.equals(r1)
            r1 = 1
            if (r9 != 0) goto L_0x0034
            android.graphics.Rect r9 = r8.f1853s
            android.graphics.Rect r0 = r8.f1852r
            r9.set(r0)
            r0 = 1
        L_0x0034:
            android.graphics.Rect r9 = r8.f1850p
            android.graphics.Rect r2 = r8.f1849o
            boolean r9 = r9.equals(r2)
            if (r9 != 0) goto L_0x0046
            android.graphics.Rect r9 = r8.f1850p
            android.graphics.Rect r0 = r8.f1849o
            r9.set(r0)
            r0 = 1
        L_0x0046:
            if (r0 == 0) goto L_0x004b
            r8.requestLayout()
        L_0x004b:
            return r1
    }

    @Override // androidx.appcompat.widget.AbstractC0566a0
    /* renamed from: g */
    public void mo2139g() {
            r1 = this;
            r1.m2277j()
            androidx.appcompat.widget.b0 r0 = r1.f1840f
            r0.mo1863g()
            return
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$e r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.view.ViewGroup
    protected androidx.appcompat.widget.ActionBarOverlayLayout.C0530e generateDefaultLayoutParams() {
            r2 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$e r0 = new androidx.appcompat.widget.ActionBarOverlayLayout$e
            r1 = -1
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$e r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$e r0 = new androidx.appcompat.widget.ActionBarOverlayLayout$e
            r0.<init>(r2)
            return r0
    }

    @Override // android.view.ViewGroup
    public androidx.appcompat.widget.ActionBarOverlayLayout.C0530e generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$e r0 = new androidx.appcompat.widget.ActionBarOverlayLayout$e
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    public int getActionBarHideOffset() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r1.f1839e
            if (r0 == 0) goto L_0x000b
            float r0 = r0.getTranslationY()
            int r0 = (int) r0
            int r0 = -r0
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            return r0
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
            r1 = this;
            a.g.l.n r0 = r1.f1835B
            int r0 = r0.m3454a()
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r1 = this;
            r1.m2277j()
            androidx.appcompat.widget.b0 r0 = r1.f1840f
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    /* renamed from: h */
    void m2279h() {
            r1 = this;
            java.lang.Runnable r0 = r1.f1860z
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r1.f1834A
            r1.removeCallbacks(r0)
            android.view.ViewPropertyAnimator r0 = r1.f1858x
            if (r0 == 0) goto L_0x0011
            r0.cancel()
        L_0x0011:
            return
    }

    /* renamed from: i */
    public boolean m2278i() {
            r1 = this;
            boolean r0 = r1.f1843i
            return r0
    }

    /* renamed from: j */
    void m2277j() {
            r1 = this;
            androidx.appcompat.widget.ContentFrameLayout r0 = r1.f1838d
            if (r0 != 0) goto L_0x0024
            int r0 = p000a.p001a.C0005f.action_bar_activity_content
            android.view.View r0 = r1.findViewById(r0)
            androidx.appcompat.widget.ContentFrameLayout r0 = (androidx.appcompat.widget.ContentFrameLayout) r0
            r1.f1838d = r0
            int r0 = p000a.p001a.C0005f.action_bar_container
            android.view.View r0 = r1.findViewById(r0)
            androidx.appcompat.widget.ActionBarContainer r0 = (androidx.appcompat.widget.ActionBarContainer) r0
            r1.f1839e = r0
            int r0 = p000a.p001a.C0005f.action_bar
            android.view.View r0 = r1.findViewById(r0)
            androidx.appcompat.widget.b0 r0 = r1.m2281a(r0)
            r1.f1840f = r0
        L_0x0024:
            return
    }

    @Override // android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            android.content.Context r1 = r0.getContext()
            r0.m2282a(r1)
            p000a.p018g.p029l.C0216r.m3449B(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.m2279h()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            int r5 = r4.getChildCount()
            int r6 = r4.getPaddingLeft()
            r4.getPaddingRight()
            int r7 = r4.getPaddingTop()
            r4.getPaddingBottom()
            r8 = 0
        L_0x0013:
            if (r8 >= r5) goto L_0x003d
            android.view.View r9 = r4.getChildAt(r8)
            int r0 = r9.getVisibility()
            r1 = 8
            if (r0 == r1) goto L_0x003a
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r0 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0530e) r0
            int r1 = r9.getMeasuredWidth()
            int r2 = r9.getMeasuredHeight()
            int r3 = r0.leftMargin
            int r3 = r3 + r6
            int r0 = r0.topMargin
            int r0 = r0 + r7
            int r1 = r1 + r3
            int r2 = r2 + r0
            r9.layout(r3, r0, r1, r2)
        L_0x003a:
            int r8 = r8 + 1
            goto L_0x0013
        L_0x003d:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r14, int r15) {
            r13 = this;
            r13.m2277j()
            androidx.appcompat.widget.ActionBarContainer r1 = r13.f1839e
            r3 = 0
            r5 = 0
            r0 = r13
            r2 = r14
            r4 = r15
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ActionBarContainer r0 = r13.f1839e
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r0 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0530e) r0
            androidx.appcompat.widget.ActionBarContainer r1 = r13.f1839e
            int r1 = r1.getMeasuredWidth()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            androidx.appcompat.widget.ActionBarContainer r3 = r13.f1839e
            int r3 = r3.getMeasuredHeight()
            int r4 = r0.topMargin
            int r3 = r3 + r4
            int r0 = r0.bottomMargin
            int r3 = r3 + r0
            int r0 = java.lang.Math.max(r2, r3)
            androidx.appcompat.widget.ActionBarContainer r3 = r13.f1839e
            int r3 = r3.getMeasuredState()
            int r3 = android.view.View.combineMeasuredStates(r2, r3)
            int r4 = p000a.p018g.p029l.C0216r.m3404q(r13)
            r4 = r4 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x004a
            r4 = 1
            goto L_0x004b
        L_0x004a:
            r4 = 0
        L_0x004b:
            if (r4 == 0) goto L_0x005f
            int r5 = r13.f1836b
            boolean r6 = r13.f1844j
            if (r6 == 0) goto L_0x0071
            androidx.appcompat.widget.ActionBarContainer r6 = r13.f1839e
            android.view.View r6 = r6.getTabContainer()
            if (r6 == 0) goto L_0x0071
            int r6 = r13.f1836b
            int r5 = r5 + r6
            goto L_0x0071
        L_0x005f:
            androidx.appcompat.widget.ActionBarContainer r5 = r13.f1839e
            int r5 = r5.getVisibility()
            r6 = 8
            if (r5 == r6) goto L_0x0070
            androidx.appcompat.widget.ActionBarContainer r5 = r13.f1839e
            int r5 = r5.getMeasuredHeight()
            goto L_0x0071
        L_0x0070:
            r5 = 0
        L_0x0071:
            android.graphics.Rect r6 = r13.f1851q
            android.graphics.Rect r7 = r13.f1849o
            r6.set(r7)
            android.graphics.Rect r6 = r13.f1854t
            android.graphics.Rect r7 = r13.f1852r
            r6.set(r7)
            boolean r6 = r13.f1843i
            if (r6 != 0) goto L_0x0088
            if (r4 != 0) goto L_0x0088
            android.graphics.Rect r4 = r13.f1851q
            goto L_0x008a
        L_0x0088:
            android.graphics.Rect r4 = r13.f1854t
        L_0x008a:
            int r6 = r4.top
            int r6 = r6 + r5
            r4.top = r6
            int r5 = r4.bottom
            int r5 = r5 + r2
            r4.bottom = r5
            androidx.appcompat.widget.ContentFrameLayout r7 = r13.f1838d
            android.graphics.Rect r8 = r13.f1851q
            r9 = 1
            r10 = 1
            r11 = 1
            r12 = 1
            r6 = r13
            r6.m2280a(r7, r8, r9, r10, r11, r12)
            android.graphics.Rect r2 = r13.f1855u
            android.graphics.Rect r4 = r13.f1854t
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x00b8
            android.graphics.Rect r2 = r13.f1855u
            android.graphics.Rect r4 = r13.f1854t
            r2.set(r4)
            androidx.appcompat.widget.ContentFrameLayout r2 = r13.f1838d
            android.graphics.Rect r4 = r13.f1854t
            r2.m2246a(r4)
        L_0x00b8:
            androidx.appcompat.widget.ContentFrameLayout r6 = r13.f1838d
            r8 = 0
            r10 = 0
            r5 = r13
            r7 = r14
            r9 = r15
            r5.measureChildWithMargins(r6, r7, r8, r9, r10)
            androidx.appcompat.widget.ContentFrameLayout r2 = r13.f1838d
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r2 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0530e) r2
            androidx.appcompat.widget.ContentFrameLayout r4 = r13.f1838d
            int r4 = r4.getMeasuredWidth()
            int r5 = r2.leftMargin
            int r4 = r4 + r5
            int r5 = r2.rightMargin
            int r4 = r4 + r5
            int r1 = java.lang.Math.max(r1, r4)
            androidx.appcompat.widget.ContentFrameLayout r4 = r13.f1838d
            int r4 = r4.getMeasuredHeight()
            int r5 = r2.topMargin
            int r4 = r4 + r5
            int r2 = r2.bottomMargin
            int r4 = r4 + r2
            int r0 = java.lang.Math.max(r0, r4)
            androidx.appcompat.widget.ContentFrameLayout r2 = r13.f1838d
            int r2 = r2.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r3, r2)
            int r3 = r13.getPaddingLeft()
            int r4 = r13.getPaddingRight()
            int r3 = r3 + r4
            int r1 = r1 + r3
            int r3 = r13.getPaddingTop()
            int r4 = r13.getPaddingBottom()
            int r3 = r3 + r4
            int r0 = r0 + r3
            int r3 = r13.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r3)
            int r3 = r13.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r3)
            int r14 = android.view.View.resolveSizeAndState(r1, r14, r2)
            int r1 = r2 << 16
            int r15 = android.view.View.resolveSizeAndState(r0, r15, r1)
            r13.setMeasuredDimension(r14, r15)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public boolean onNestedFling(android.view.View r1, float r2, float r3, boolean r4) {
            r0 = this;
            boolean r1 = r0.f1845k
            if (r1 == 0) goto L_0x0018
            if (r4 != 0) goto L_0x0007
            goto L_0x0018
        L_0x0007:
            boolean r1 = r0.m2283a(r2, r3)
            if (r1 == 0) goto L_0x0011
            r0.m2276k()
            goto L_0x0014
        L_0x0011:
            r0.m2273n()
        L_0x0014:
            r1 = 1
            r0.f1846l = r1
            return r1
        L_0x0018:
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public boolean onNestedPreFling(android.view.View r1, float r2, float r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public void onNestedPreScroll(android.view.View r1, int r2, int r3, int[] r4) {
            r0 = this;
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            int r1 = r0.f1847m
            int r1 = r1 + r3
            r0.f1847m = r1
            int r1 = r0.f1847m
            r0.setActionBarHideOffset(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public void onNestedScrollAccepted(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            a.g.l.n r0 = r1.f1835B
            r0.m3452a(r2, r3, r4)
            int r2 = r1.getActionBarHideOffset()
            r1.f1847m = r2
            r1.m2279h()
            androidx.appcompat.widget.ActionBarOverlayLayout$d r2 = r1.f1856v
            if (r2 == 0) goto L_0x0015
            r2.mo2272a()
        L_0x0015:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public boolean onStartNestedScroll(android.view.View r1, android.view.View r2, int r3) {
            r0 = this;
            r1 = r3 & 2
            if (r1 == 0) goto L_0x0010
            androidx.appcompat.widget.ActionBarContainer r1 = r0.f1839e
            int r1 = r1.getVisibility()
            if (r1 == 0) goto L_0x000d
            goto L_0x0010
        L_0x000d:
            boolean r1 = r0.f1845k
            return r1
        L_0x0010:
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public void onStopNestedScroll(android.view.View r2) {
            r1 = this;
            boolean r2 = r1.f1845k
            if (r2 == 0) goto L_0x0019
            boolean r2 = r1.f1846l
            if (r2 != 0) goto L_0x0019
            int r2 = r1.f1847m
            androidx.appcompat.widget.ActionBarContainer r0 = r1.f1839e
            int r0 = r0.getHeight()
            if (r2 > r0) goto L_0x0016
            r1.m2274m()
            goto L_0x0019
        L_0x0016:
            r1.m2275l()
        L_0x0019:
            androidx.appcompat.widget.ActionBarOverlayLayout$d r2 = r1.f1856v
            if (r2 == 0) goto L_0x0020
            r2.mo2267d()
        L_0x0020:
            return
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x0009
            super.onWindowSystemUiVisibilityChanged(r5)
        L_0x0009:
            r4.m2277j()
            int r0 = r4.f1848n
            r0 = r0 ^ r5
            r4.f1848n = r5
            r1 = r5 & 4
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0019
            r1 = 1
            goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            r5 = r5 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L_0x001f
            r2 = 1
        L_0x001f:
            androidx.appcompat.widget.ActionBarOverlayLayout$d r5 = r4.f1856v
            if (r5 == 0) goto L_0x0038
            r3 = r2 ^ 1
            r5.mo2270a(r3)
            if (r1 != 0) goto L_0x0033
            if (r2 != 0) goto L_0x002d
            goto L_0x0033
        L_0x002d:
            androidx.appcompat.widget.ActionBarOverlayLayout$d r5 = r4.f1856v
            r5.mo2269b()
            goto L_0x0038
        L_0x0033:
            androidx.appcompat.widget.ActionBarOverlayLayout$d r5 = r4.f1856v
            r5.mo2268c()
        L_0x0038:
            r5 = r0 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L_0x0043
            androidx.appcompat.widget.ActionBarOverlayLayout$d r5 = r4.f1856v
            if (r5 == 0) goto L_0x0043
            p000a.p018g.p029l.C0216r.m3449B(r4)
        L_0x0043:
            return
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int r2) {
            r1 = this;
            super.onWindowVisibilityChanged(r2)
            r1.f1837c = r2
            androidx.appcompat.widget.ActionBarOverlayLayout$d r0 = r1.f1856v
            if (r0 == 0) goto L_0x000c
            r0.mo2271a(r2)
        L_0x000c:
            return
    }

    public void setActionBarHideOffset(int r2) {
            r1 = this;
            r1.m2279h()
            androidx.appcompat.widget.ActionBarContainer r0 = r1.f1839e
            int r0 = r0.getHeight()
            int r2 = java.lang.Math.min(r2, r0)
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            androidx.appcompat.widget.ActionBarContainer r0 = r1.f1839e
            int r2 = -r2
            float r2 = (float) r2
            r0.setTranslationY(r2)
            return
    }

    public void setActionBarVisibilityCallback(androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0529d r2) {
            r1 = this;
            r1.f1856v = r2
            android.os.IBinder r2 = r1.getWindowToken()
            if (r2 == 0) goto L_0x0019
            androidx.appcompat.widget.ActionBarOverlayLayout$d r2 = r1.f1856v
            int r0 = r1.f1837c
            r2.mo2271a(r0)
            int r2 = r1.f1848n
            if (r2 == 0) goto L_0x0019
            r1.onWindowSystemUiVisibilityChanged(r2)
            p000a.p018g.p029l.C0216r.m3449B(r1)
        L_0x0019:
            return
    }

    public void setHasNonEmbeddedTabs(boolean r1) {
            r0 = this;
            r0.f1844j = r1
            return
    }

    public void setHideOnContentScrollEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.f1845k
            if (r2 == r0) goto L_0x000f
            r1.f1845k = r2
            if (r2 != 0) goto L_0x000f
            r1.m2279h()
            r2 = 0
            r1.setActionBarHideOffset(r2)
        L_0x000f:
            return
    }

    public void setIcon(int r2) {
            r1 = this;
            r1.m2277j()
            androidx.appcompat.widget.b0 r0 = r1.f1840f
            r0.setIcon(r2)
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.m2277j()
            androidx.appcompat.widget.b0 r0 = r1.f1840f
            r0.setIcon(r2)
            return
    }

    public void setLogo(int r2) {
            r1 = this;
            r1.m2277j()
            androidx.appcompat.widget.b0 r0 = r1.f1840f
            r0.mo1876b(r2)
            return
    }

    public void setOverlayMode(boolean r2) {
            r1 = this;
            r1.f1843i = r2
            if (r2 == 0) goto L_0x0014
            android.content.Context r2 = r1.getContext()
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            int r2 = r2.targetSdkVersion
            r0 = 19
            if (r2 >= r0) goto L_0x0014
            r2 = 1
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            r1.f1842h = r2
            return
    }

    public void setShowingForActionMode(boolean r1) {
            r0 = this;
            return
    }

    public void setUiOptions(int r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0566a0
    public void setWindowCallback(android.view.Window.Callback r2) {
            r1 = this;
            r1.m2277j()
            androidx.appcompat.widget.b0 r0 = r1.f1840f
            r0.setWindowCallback(r2)
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0566a0
    public void setWindowTitle(java.lang.CharSequence r2) {
            r1 = this;
            r1.m2277j()
            androidx.appcompat.widget.b0 r0 = r1.f1840f
            r0.setWindowTitle(r2)
            return
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }
}
