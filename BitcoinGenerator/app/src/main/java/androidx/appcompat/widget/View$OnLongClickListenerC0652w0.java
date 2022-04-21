package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.w0 */
/* loaded from: classes.dex */
class View$OnLongClickListenerC0652w0 implements android.view.View.OnLongClickListener, android.view.View.OnHoverListener, android.view.View.OnAttachStateChangeListener {

    /* renamed from: k */
    private static androidx.appcompat.widget.View$OnLongClickListenerC0652w0 f2333k;

    /* renamed from: l */
    private static androidx.appcompat.widget.View$OnLongClickListenerC0652w0 f2334l;

    /* renamed from: b */
    private final android.view.View f2335b;

    /* renamed from: c */
    private final java.lang.CharSequence f2336c;

    /* renamed from: d */
    private final int f2337d;

    /* renamed from: e */
    private final java.lang.Runnable f2338e;

    /* renamed from: f */
    private final java.lang.Runnable f2339f;

    /* renamed from: g */
    private int f2340g;

    /* renamed from: h */
    private int f2341h;

    /* renamed from: i */
    private androidx.appcompat.widget.C0657x0 f2342i;

    /* renamed from: j */
    private boolean f2343j;

    /* renamed from: androidx.appcompat.widget.w0$a */
    /* loaded from: classes.dex */
    class RunnableC0653a implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.widget.View$OnLongClickListenerC0652w0 f2344b;

        RunnableC0653a(androidx.appcompat.widget.View$OnLongClickListenerC0652w0 r1) {
                r0 = this;
                r0.f2344b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.appcompat.widget.w0 r0 = r2.f2344b
                r1 = 0
                r0.m1826a(r1)
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.w0$b */
    /* loaded from: classes.dex */
    class RunnableC0654b implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.widget.View$OnLongClickListenerC0652w0 f2345b;

        RunnableC0654b(androidx.appcompat.widget.View$OnLongClickListenerC0652w0 r1) {
                r0 = this;
                r0.f2345b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                androidx.appcompat.widget.w0 r0 = r1.f2345b
                r0.m1830a()
                return
        }
    }

    private View$OnLongClickListenerC0652w0(android.view.View r2, java.lang.CharSequence r3) {
            r1 = this;
            r1.<init>()
            androidx.appcompat.widget.w0$a r0 = new androidx.appcompat.widget.w0$a
            r0.<init>(r1)
            r1.f2338e = r0
            androidx.appcompat.widget.w0$b r0 = new androidx.appcompat.widget.w0$b
            r0.<init>(r1)
            r1.f2339f = r0
            r1.f2335b = r2
            r1.f2336c = r3
            android.view.View r2 = r1.f2335b
            android.content.Context r2 = r2.getContext()
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r2)
            int r2 = p000a.p018g.p029l.C0220s.m3386a(r2)
            r1.f2337d = r2
            r1.m1824c()
            android.view.View r2 = r1.f2335b
            r2.setOnLongClickListener(r1)
            android.view.View r2 = r1.f2335b
            r2.setOnHoverListener(r1)
            return
    }

    /* renamed from: a */
    public static void m1828a(android.view.View r2, java.lang.CharSequence r3) {
            androidx.appcompat.widget.w0 r0 = androidx.appcompat.widget.View$OnLongClickListenerC0652w0.f2333k
            r1 = 0
            if (r0 == 0) goto L_0x000c
            android.view.View r0 = r0.f2335b
            if (r0 != r2) goto L_0x000c
            m1827a(r1)
        L_0x000c:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0028
            androidx.appcompat.widget.w0 r3 = androidx.appcompat.widget.View$OnLongClickListenerC0652w0.f2334l
            if (r3 == 0) goto L_0x001d
            android.view.View r0 = r3.f2335b
            if (r0 != r2) goto L_0x001d
            r3.m1830a()
        L_0x001d:
            r2.setOnLongClickListener(r1)
            r3 = 0
            r2.setLongClickable(r3)
            r2.setOnHoverListener(r1)
            goto L_0x002d
        L_0x0028:
            androidx.appcompat.widget.w0 r0 = new androidx.appcompat.widget.w0
            r0.<init>(r2, r3)
        L_0x002d:
            return
    }

    /* renamed from: a */
    private static void m1827a(androidx.appcompat.widget.View$OnLongClickListenerC0652w0 r1) {
            androidx.appcompat.widget.w0 r0 = androidx.appcompat.widget.View$OnLongClickListenerC0652w0.f2333k
            if (r0 == 0) goto L_0x0007
            r0.m1825b()
        L_0x0007:
            androidx.appcompat.widget.View$OnLongClickListenerC0652w0.f2333k = r1
            androidx.appcompat.widget.w0 r1 = androidx.appcompat.widget.View$OnLongClickListenerC0652w0.f2333k
            if (r1 == 0) goto L_0x0010
            r1.m1823d()
        L_0x0010:
            return
    }

    /* renamed from: a */
    private boolean m1829a(android.view.MotionEvent r4) {
            r3 = this;
            float r0 = r4.getX()
            int r0 = (int) r0
            float r4 = r4.getY()
            int r4 = (int) r4
            int r1 = r3.f2340g
            int r1 = r0 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f2337d
            if (r1 > r2) goto L_0x0024
            int r1 = r3.f2341h
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f2337d
            if (r1 > r2) goto L_0x0024
            r4 = 0
            return r4
        L_0x0024:
            r3.f2340g = r0
            r3.f2341h = r4
            r4 = 1
            return r4
    }

    /* renamed from: b */
    private void m1825b() {
            r2 = this;
            android.view.View r0 = r2.f2335b
            java.lang.Runnable r1 = r2.f2338e
            r0.removeCallbacks(r1)
            return
    }

    /* renamed from: c */
    private void m1824c() {
            r1 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.f2340g = r0
            r1.f2341h = r0
            return
    }

    /* renamed from: d */
    private void m1823d() {
            r4 = this;
            android.view.View r0 = r4.f2335b
            java.lang.Runnable r1 = r4.f2338e
            int r2 = android.view.ViewConfiguration.getLongPressTimeout()
            long r2 = (long) r2
            r0.postDelayed(r1, r2)
            return
    }

    /* renamed from: a */
    void m1830a() {
            r3 = this;
            androidx.appcompat.widget.w0 r0 = androidx.appcompat.widget.View$OnLongClickListenerC0652w0.f2334l
            r1 = 0
            if (r0 != r3) goto L_0x0020
            androidx.appcompat.widget.View$OnLongClickListenerC0652w0.f2334l = r1
            androidx.appcompat.widget.x0 r0 = r3.f2342i
            if (r0 == 0) goto L_0x0019
            r0.m1799a()
            r3.f2342i = r1
            r3.m1824c()
            android.view.View r0 = r3.f2335b
            r0.removeOnAttachStateChangeListener(r3)
            goto L_0x0020
        L_0x0019:
            java.lang.String r0 = "TooltipCompatHandler"
            java.lang.String r2 = "sActiveHandler.mPopup == null"
            android.util.Log.e(r0, r2)
        L_0x0020:
            androidx.appcompat.widget.w0 r0 = androidx.appcompat.widget.View$OnLongClickListenerC0652w0.f2333k
            if (r0 != r3) goto L_0x0027
            m1827a(r1)
        L_0x0027:
            android.view.View r0 = r3.f2335b
            java.lang.Runnable r1 = r3.f2339f
            r0.removeCallbacks(r1)
            return
    }

    /* renamed from: a */
    void m1826a(boolean r8) {
            r7 = this;
            android.view.View r0 = r7.f2335b
            boolean r0 = p000a.p018g.p029l.C0216r.m3398w(r0)
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            r0 = 0
            m1827a(r0)
            androidx.appcompat.widget.w0 r0 = androidx.appcompat.widget.View$OnLongClickListenerC0652w0.f2334l
            if (r0 == 0) goto L_0x0014
            r0.m1830a()
        L_0x0014:
            androidx.appcompat.widget.View$OnLongClickListenerC0652w0.f2334l = r7
            r7.f2343j = r8
            androidx.appcompat.widget.x0 r8 = new androidx.appcompat.widget.x0
            android.view.View r0 = r7.f2335b
            android.content.Context r0 = r0.getContext()
            r8.<init>(r0)
            r7.f2342i = r8
            androidx.appcompat.widget.x0 r1 = r7.f2342i
            android.view.View r2 = r7.f2335b
            int r3 = r7.f2340g
            int r4 = r7.f2341h
            boolean r5 = r7.f2343j
            java.lang.CharSequence r6 = r7.f2336c
            r1.m1796a(r2, r3, r4, r5, r6)
            android.view.View r8 = r7.f2335b
            r8.addOnAttachStateChangeListener(r7)
            boolean r8 = r7.f2343j
            if (r8 == 0) goto L_0x0040
            r0 = 2500(0x9c4, double:1.235E-320)
            goto L_0x0055
        L_0x0040:
            android.view.View r8 = r7.f2335b
            int r8 = p000a.p018g.p029l.C0216r.m3404q(r8)
            r0 = 1
            r8 = r8 & r0
            if (r8 != r0) goto L_0x004d
            r0 = 3000(0xbb8, double:1.482E-320)
            goto L_0x004f
        L_0x004d:
            r0 = 15000(0x3a98, double:7.411E-320)
        L_0x004f:
            int r8 = android.view.ViewConfiguration.getLongPressTimeout()
            long r2 = (long) r8
            long r0 = r0 - r2
        L_0x0055:
            android.view.View r8 = r7.f2335b
            java.lang.Runnable r2 = r7.f2339f
            r8.removeCallbacks(r2)
            android.view.View r8 = r7.f2335b
            java.lang.Runnable r2 = r7.f2339f
            r8.postDelayed(r2, r0)
            return
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(android.view.View r3, android.view.MotionEvent r4) {
            r2 = this;
            androidx.appcompat.widget.x0 r3 = r2.f2342i
            r0 = 0
            if (r3 == 0) goto L_0x000a
            boolean r3 = r2.f2343j
            if (r3 == 0) goto L_0x000a
            return r0
        L_0x000a:
            android.view.View r3 = r2.f2335b
            android.content.Context r3 = r3.getContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r3 = r3.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r3 = (android.view.accessibility.AccessibilityManager) r3
            boolean r1 = r3.isEnabled()
            if (r1 == 0) goto L_0x0025
            boolean r3 = r3.isTouchExplorationEnabled()
            if (r3 == 0) goto L_0x0025
            return r0
        L_0x0025:
            int r3 = r4.getAction()
            r1 = 7
            if (r3 == r1) goto L_0x0038
            r4 = 10
            if (r3 == r4) goto L_0x0031
            goto L_0x004d
        L_0x0031:
            r2.m1824c()
            r2.m1830a()
            goto L_0x004d
        L_0x0038:
            android.view.View r3 = r2.f2335b
            boolean r3 = r3.isEnabled()
            if (r3 == 0) goto L_0x004d
            androidx.appcompat.widget.x0 r3 = r2.f2342i
            if (r3 != 0) goto L_0x004d
            boolean r3 = r2.m1829a(r4)
            if (r3 == 0) goto L_0x004d
            m1827a(r2)
        L_0x004d:
            return r0
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View r2) {
            r1 = this;
            int r0 = r2.getWidth()
            int r0 = r0 / 2
            r1.f2340g = r0
            int r2 = r2.getHeight()
            int r2 = r2 / 2
            r1.f2341h = r2
            r2 = 1
            r1.m1826a(r2)
            return r2
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            r0.m1830a()
            return
    }
}
