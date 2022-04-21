package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.h0 */
/* loaded from: classes.dex */
public class C0596h0 implements androidx.appcompat.view.menu.AbstractC0519t {

    /* renamed from: G */
    private static java.lang.reflect.Method f2128G;

    /* renamed from: H */
    private static java.lang.reflect.Method f2129H;

    /* renamed from: I */
    private static java.lang.reflect.Method f2130I;

    /* renamed from: A */
    private final androidx.appcompat.widget.C0596h0.RunnableC0599c f2131A;

    /* renamed from: B */
    final android.os.Handler f2132B;

    /* renamed from: C */
    private final android.graphics.Rect f2133C;

    /* renamed from: D */
    private android.graphics.Rect f2134D;

    /* renamed from: E */
    private boolean f2135E;

    /* renamed from: F */
    android.widget.PopupWindow f2136F;

    /* renamed from: b */
    private android.content.Context f2137b;

    /* renamed from: c */
    private android.widget.ListAdapter f2138c;

    /* renamed from: d */
    androidx.appcompat.widget.C0582d0 f2139d;

    /* renamed from: e */
    private int f2140e;

    /* renamed from: f */
    private int f2141f;

    /* renamed from: g */
    private int f2142g;

    /* renamed from: h */
    private int f2143h;

    /* renamed from: i */
    private int f2144i;

    /* renamed from: j */
    private boolean f2145j;

    /* renamed from: k */
    private boolean f2146k;

    /* renamed from: l */
    private boolean f2147l;

    /* renamed from: m */
    private int f2148m;

    /* renamed from: n */
    private boolean f2149n;

    /* renamed from: o */
    private boolean f2150o;

    /* renamed from: p */
    int f2151p;

    /* renamed from: q */
    private android.view.View f2152q;

    /* renamed from: r */
    private int f2153r;

    /* renamed from: s */
    private android.database.DataSetObserver f2154s;

    /* renamed from: t */
    private android.view.View f2155t;

    /* renamed from: u */
    private android.graphics.drawable.Drawable f2156u;

    /* renamed from: v */
    private android.widget.AdapterView.OnItemClickListener f2157v;

    /* renamed from: w */
    private android.widget.AdapterView.OnItemSelectedListener f2158w;

    /* renamed from: x */
    final androidx.appcompat.widget.C0596h0.RunnableC0603g f2159x;

    /* renamed from: y */
    private final androidx.appcompat.widget.C0596h0.View$OnTouchListenerC0602f f2160y;

    /* renamed from: z */
    private final androidx.appcompat.widget.C0596h0.C0601e f2161z;

    /* renamed from: androidx.appcompat.widget.h0$a */
    /* loaded from: classes.dex */
    class RunnableC0597a implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.widget.C0596h0 f2162b;

        RunnableC0597a(androidx.appcompat.widget.C0596h0 r1) {
                r0 = this;
                r0.f2162b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                androidx.appcompat.widget.h0 r0 = r1.f2162b
                android.view.View r0 = r0.m2042b()
                if (r0 == 0) goto L_0x0013
                android.os.IBinder r0 = r0.getWindowToken()
                if (r0 == 0) goto L_0x0013
                androidx.appcompat.widget.h0 r0 = r1.f2162b
                r0.mo1833f()
            L_0x0013:
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.h0$b */
    /* loaded from: classes.dex */
    class C0598b implements android.widget.AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.widget.C0596h0 f2163b;

        C0598b(androidx.appcompat.widget.C0596h0 r1) {
                r0 = this;
                r0.f2163b = r1
                r0.<init>()
                return
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                r0 = this;
                r1 = -1
                if (r3 == r1) goto L_0x000d
                androidx.appcompat.widget.h0 r1 = r0.f2163b
                androidx.appcompat.widget.d0 r1 = r1.f2139d
                if (r1 == 0) goto L_0x000d
                r2 = 0
                r1.setListSelectionHidden(r2)
            L_0x000d:
                return
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(android.widget.AdapterView<?> r1) {
                r0 = this;
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.h0$c */
    /* loaded from: classes.dex */
    private class RunnableC0599c implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.widget.C0596h0 f2164b;

        RunnableC0599c(androidx.appcompat.widget.C0596h0 r1) {
                r0 = this;
                r0.f2164b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                androidx.appcompat.widget.h0 r0 = r1.f2164b
                r0.m2051a()
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.h0$d */
    /* loaded from: classes.dex */
    private class C0600d extends android.database.DataSetObserver {

        /* renamed from: a */
        final /* synthetic */ androidx.appcompat.widget.C0596h0 f2165a;

        C0600d(androidx.appcompat.widget.C0596h0 r1) {
                r0 = this;
                r0.f2165a = r1
                r0.<init>()
                return
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
                r1 = this;
                androidx.appcompat.widget.h0 r0 = r1.f2165a
                boolean r0 = r0.mo2036d()
                if (r0 == 0) goto L_0x000d
                androidx.appcompat.widget.h0 r0 = r1.f2165a
                r0.mo1833f()
            L_0x000d:
                return
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
                r1 = this;
                androidx.appcompat.widget.h0 r0 = r1.f2165a
                r0.dismiss()
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.h0$e */
    /* loaded from: classes.dex */
    private class C0601e implements android.widget.AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ androidx.appcompat.widget.C0596h0 f2166a;

        C0601e(androidx.appcompat.widget.C0596h0 r1) {
                r0 = this;
                r0.f2166a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(android.widget.AbsListView r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(android.widget.AbsListView r1, int r2) {
                r0 = this;
                r1 = 1
                if (r2 != r1) goto L_0x0025
                androidx.appcompat.widget.h0 r1 = r0.f2166a
                boolean r1 = r1.m2025j()
                if (r1 != 0) goto L_0x0025
                androidx.appcompat.widget.h0 r1 = r0.f2166a
                android.widget.PopupWindow r1 = r1.f2136F
                android.view.View r1 = r1.getContentView()
                if (r1 == 0) goto L_0x0025
                androidx.appcompat.widget.h0 r1 = r0.f2166a
                android.os.Handler r2 = r1.f2132B
                androidx.appcompat.widget.h0$g r1 = r1.f2159x
                r2.removeCallbacks(r1)
                androidx.appcompat.widget.h0 r1 = r0.f2166a
                androidx.appcompat.widget.h0$g r1 = r1.f2159x
                r1.run()
            L_0x0025:
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.h0$f */
    /* loaded from: classes.dex */
    private class View$OnTouchListenerC0602f implements android.view.View.OnTouchListener {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.widget.C0596h0 f2167b;

        View$OnTouchListenerC0602f(androidx.appcompat.widget.C0596h0 r1) {
                r0 = this;
                r0.f2167b = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View r3, android.view.MotionEvent r4) {
                r2 = this;
                int r3 = r4.getAction()
                float r0 = r4.getX()
                int r0 = (int) r0
                float r4 = r4.getY()
                int r4 = (int) r4
                if (r3 != 0) goto L_0x0040
                androidx.appcompat.widget.h0 r1 = r2.f2167b
                android.widget.PopupWindow r1 = r1.f2136F
                if (r1 == 0) goto L_0x0040
                boolean r1 = r1.isShowing()
                if (r1 == 0) goto L_0x0040
                if (r0 < 0) goto L_0x0040
                androidx.appcompat.widget.h0 r1 = r2.f2167b
                android.widget.PopupWindow r1 = r1.f2136F
                int r1 = r1.getWidth()
                if (r0 >= r1) goto L_0x0040
                if (r4 < 0) goto L_0x0040
                androidx.appcompat.widget.h0 r0 = r2.f2167b
                android.widget.PopupWindow r0 = r0.f2136F
                int r0 = r0.getHeight()
                if (r4 >= r0) goto L_0x0040
                androidx.appcompat.widget.h0 r3 = r2.f2167b
                android.os.Handler r4 = r3.f2132B
                androidx.appcompat.widget.h0$g r3 = r3.f2159x
                r0 = 250(0xfa, double:1.235E-321)
                r4.postDelayed(r3, r0)
                goto L_0x004c
            L_0x0040:
                r4 = 1
                if (r3 != r4) goto L_0x004c
                androidx.appcompat.widget.h0 r3 = r2.f2167b
                android.os.Handler r4 = r3.f2132B
                androidx.appcompat.widget.h0$g r3 = r3.f2159x
                r4.removeCallbacks(r3)
            L_0x004c:
                r3 = 0
                return r3
        }
    }

    /* renamed from: androidx.appcompat.widget.h0$g */
    /* loaded from: classes.dex */
    private class RunnableC0603g implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.widget.C0596h0 f2168b;

        RunnableC0603g(androidx.appcompat.widget.C0596h0 r1) {
                r0 = this;
                r0.f2168b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.appcompat.widget.h0 r0 = r3.f2168b
                androidx.appcompat.widget.d0 r0 = r0.f2139d
                if (r0 == 0) goto L_0x0037
                boolean r0 = p000a.p018g.p029l.C0216r.m3398w(r0)
                if (r0 == 0) goto L_0x0037
                androidx.appcompat.widget.h0 r0 = r3.f2168b
                androidx.appcompat.widget.d0 r0 = r0.f2139d
                int r0 = r0.getCount()
                androidx.appcompat.widget.h0 r1 = r3.f2168b
                androidx.appcompat.widget.d0 r1 = r1.f2139d
                int r1 = r1.getChildCount()
                if (r0 <= r1) goto L_0x0037
                androidx.appcompat.widget.h0 r0 = r3.f2168b
                androidx.appcompat.widget.d0 r0 = r0.f2139d
                int r0 = r0.getChildCount()
                androidx.appcompat.widget.h0 r1 = r3.f2168b
                int r2 = r1.f2151p
                if (r0 > r2) goto L_0x0037
                android.widget.PopupWindow r0 = r1.f2136F
                r1 = 2
                r0.setInputMethodMode(r1)
                androidx.appcompat.widget.h0 r0 = r3.f2168b
                r0.mo1833f()
            L_0x0037:
                return
        }
    }

    static {
            java.lang.String r0 = "ListPopupWindow"
            r1 = 0
            r2 = 1
            java.lang.Class<android.widget.PopupWindow> r3 = android.widget.PopupWindow.class
            java.lang.String r4 = "setClipToScreenEnabled"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: NoSuchMethodException -> 0x0015
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: NoSuchMethodException -> 0x0015
            r5[r1] = r6     // Catch: NoSuchMethodException -> 0x0015
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: NoSuchMethodException -> 0x0015
            androidx.appcompat.widget.C0596h0.f2128G = r3     // Catch: NoSuchMethodException -> 0x0015
            goto L_0x001a
        L_0x0015:
            java.lang.String r3 = "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well."
            android.util.Log.i(r0, r3)
        L_0x001a:
            java.lang.Class<android.widget.PopupWindow> r3 = android.widget.PopupWindow.class
            r4 = 3
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: NoSuchMethodException -> 0x0035
            java.lang.Class<android.view.View> r5 = android.view.View.class
            r4[r1] = r5     // Catch: NoSuchMethodException -> 0x0035
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: NoSuchMethodException -> 0x0035
            r4[r2] = r5     // Catch: NoSuchMethodException -> 0x0035
            r5 = 2
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: NoSuchMethodException -> 0x0035
            r4[r5] = r6     // Catch: NoSuchMethodException -> 0x0035
            java.lang.String r5 = "getMaxAvailableHeight"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r5, r4)     // Catch: NoSuchMethodException -> 0x0035
            androidx.appcompat.widget.C0596h0.f2129H = r3     // Catch: NoSuchMethodException -> 0x0035
            goto L_0x003a
        L_0x0035:
            java.lang.String r3 = "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well."
            android.util.Log.i(r0, r3)
        L_0x003a:
            java.lang.Class<android.widget.PopupWindow> r3 = android.widget.PopupWindow.class
            java.lang.String r4 = "setEpicenterBounds"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: NoSuchMethodException -> 0x004b
            java.lang.Class<android.graphics.Rect> r5 = android.graphics.Rect.class
            r2[r1] = r5     // Catch: NoSuchMethodException -> 0x004b
            java.lang.reflect.Method r1 = r3.getDeclaredMethod(r4, r2)     // Catch: NoSuchMethodException -> 0x004b
            androidx.appcompat.widget.C0596h0.f2130I = r1     // Catch: NoSuchMethodException -> 0x004b
            goto L_0x0050
        L_0x004b:
            java.lang.String r1 = "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well."
            android.util.Log.i(r0, r1)
        L_0x0050:
            return
    }

    public C0596h0(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public C0596h0(android.content.Context r4, android.util.AttributeSet r5, int r6, int r7) {
            r3 = this;
            r3.<init>()
            r0 = -2
            r3.f2140e = r0
            r3.f2141f = r0
            r0 = 1002(0x3ea, float:1.404E-42)
            r3.f2144i = r0
            r0 = 0
            r3.f2148m = r0
            r3.f2149n = r0
            r3.f2150o = r0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r3.f2151p = r1
            r3.f2153r = r0
            androidx.appcompat.widget.h0$g r1 = new androidx.appcompat.widget.h0$g
            r1.<init>(r3)
            r3.f2159x = r1
            androidx.appcompat.widget.h0$f r1 = new androidx.appcompat.widget.h0$f
            r1.<init>(r3)
            r3.f2160y = r1
            androidx.appcompat.widget.h0$e r1 = new androidx.appcompat.widget.h0$e
            r1.<init>(r3)
            r3.f2161z = r1
            androidx.appcompat.widget.h0$c r1 = new androidx.appcompat.widget.h0$c
            r1.<init>(r3)
            r3.f2131A = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r3.f2133C = r1
            r3.f2137b = r4
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = r4.getMainLooper()
            r1.<init>(r2)
            r3.f2132B = r1
            int[] r1 = p000a.p001a.C0009j.ListPopupWindow
            android.content.res.TypedArray r1 = r4.obtainStyledAttributes(r5, r1, r6, r7)
            int r2 = p000a.p001a.C0009j.ListPopupWindow_android_dropDownHorizontalOffset
            int r2 = r1.getDimensionPixelOffset(r2, r0)
            r3.f2142g = r2
            int r2 = p000a.p001a.C0009j.ListPopupWindow_android_dropDownVerticalOffset
            int r0 = r1.getDimensionPixelOffset(r2, r0)
            r3.f2143h = r0
            int r0 = r3.f2143h
            r2 = 1
            if (r0 == 0) goto L_0x0067
            r3.f2145j = r2
        L_0x0067:
            r1.recycle()
            androidx.appcompat.widget.q r0 = new androidx.appcompat.widget.q
            r0.<init>(r4, r5, r6, r7)
            r3.f2136F = r0
            android.widget.PopupWindow r4 = r3.f2136F
            r4.setInputMethodMode(r2)
            return
    }

    /* renamed from: a */
    private int m2046a(android.view.View r6, int r7, boolean r8) {
            r5 = this;
            java.lang.reflect.Method r0 = androidx.appcompat.widget.C0596h0.f2129H
            if (r0 == 0) goto L_0x002c
            android.widget.PopupWindow r1 = r5.f2136F     // Catch: Exception -> 0x0025
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: Exception -> 0x0025
            r3 = 0
            r2[r3] = r6     // Catch: Exception -> 0x0025
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch: Exception -> 0x0025
            r2[r3] = r4     // Catch: Exception -> 0x0025
            r3 = 2
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: Exception -> 0x0025
            r2[r3] = r8     // Catch: Exception -> 0x0025
            java.lang.Object r8 = r0.invoke(r1, r2)     // Catch: Exception -> 0x0025
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: Exception -> 0x0025
            int r6 = r8.intValue()     // Catch: Exception -> 0x0025
            return r6
        L_0x0025:
            java.lang.String r8 = "ListPopupWindow"
            java.lang.String r0 = "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version."
            android.util.Log.i(r8, r0)
        L_0x002c:
            android.widget.PopupWindow r8 = r5.f2136F
            int r6 = r8.getMaxAvailableHeight(r6, r7)
            return r6
    }

    /* renamed from: c */
    private void m2037c(boolean r5) {
            r4 = this;
            java.lang.reflect.Method r0 = androidx.appcompat.widget.C0596h0.f2128G
            if (r0 == 0) goto L_0x001b
            android.widget.PopupWindow r1 = r4.f2136F     // Catch: Exception -> 0x0014
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: Exception -> 0x0014
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: Exception -> 0x0014
            r2[r3] = r5     // Catch: Exception -> 0x0014
            r0.invoke(r1, r2)     // Catch: Exception -> 0x0014
            goto L_0x001b
        L_0x0014:
            java.lang.String r5 = "ListPopupWindow"
            java.lang.String r0 = "Could not call setClipToScreenEnabled() on PopupWindow. Oh well."
            android.util.Log.i(r5, r0)
        L_0x001b:
            return
    }

    /* renamed from: l */
    private int m2023l() {
            r12 = this;
            androidx.appcompat.widget.d0 r0 = r12.f2139d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00bf
            android.content.Context r0 = r12.f2137b
            androidx.appcompat.widget.h0$a r5 = new androidx.appcompat.widget.h0$a
            r5.<init>(r12)
            boolean r5 = r12.f2135E
            r5 = r5 ^ r3
            androidx.appcompat.widget.d0 r5 = r12.mo1979a(r0, r5)
            r12.f2139d = r5
            android.graphics.drawable.Drawable r5 = r12.f2156u
            if (r5 == 0) goto L_0x0022
            androidx.appcompat.widget.d0 r6 = r12.f2139d
            r6.setSelector(r5)
        L_0x0022:
            androidx.appcompat.widget.d0 r5 = r12.f2139d
            android.widget.ListAdapter r6 = r12.f2138c
            r5.setAdapter(r6)
            androidx.appcompat.widget.d0 r5 = r12.f2139d
            android.widget.AdapterView$OnItemClickListener r6 = r12.f2157v
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.d0 r5 = r12.f2139d
            r5.setFocusable(r3)
            androidx.appcompat.widget.d0 r5 = r12.f2139d
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.d0 r5 = r12.f2139d
            androidx.appcompat.widget.h0$b r6 = new androidx.appcompat.widget.h0$b
            r6.<init>(r12)
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.d0 r5 = r12.f2139d
            androidx.appcompat.widget.h0$e r6 = r12.f2161z
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.f2158w
            if (r5 == 0) goto L_0x0054
            androidx.appcompat.widget.d0 r6 = r12.f2139d
            r6.setOnItemSelectedListener(r5)
        L_0x0054:
            androidx.appcompat.widget.d0 r5 = r12.f2139d
            android.view.View r6 = r12.f2152q
            if (r6 == 0) goto L_0x00b8
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.f2153r
            if (r8 == 0) goto L_0x008f
            if (r8 == r3) goto L_0x0088
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.f2153r
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L_0x0095
        L_0x0088:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x0095
        L_0x008f:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x0095:
            int r0 = r12.f2141f
            if (r0 < 0) goto L_0x009c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x009e
        L_0x009c:
            r0 = 0
            r5 = 0
        L_0x009e:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00b9
        L_0x00b8:
            r0 = 0
        L_0x00b9:
            android.widget.PopupWindow r6 = r12.f2136F
            r6.setContentView(r5)
            goto L_0x00dd
        L_0x00bf:
            android.widget.PopupWindow r0 = r12.f2136F
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.f2152q
            if (r0 == 0) goto L_0x00dc
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00dd
        L_0x00dc:
            r0 = 0
        L_0x00dd:
            android.widget.PopupWindow r5 = r12.f2136F
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00f9
            android.graphics.Rect r6 = r12.f2133C
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.f2133C
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.f2145j
            if (r7 != 0) goto L_0x00ff
            int r6 = -r6
            r12.f2143h = r6
            goto L_0x00ff
        L_0x00f9:
            android.graphics.Rect r5 = r12.f2133C
            r5.setEmpty()
            r5 = 0
        L_0x00ff:
            android.widget.PopupWindow r6 = r12.f2136F
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            r3 = 0
        L_0x010a:
            android.view.View r4 = r12.m2042b()
            int r6 = r12.f2143h
            int r3 = r12.m2046a(r4, r6, r3)
            boolean r4 = r12.f2149n
            if (r4 != 0) goto L_0x0163
            int r4 = r12.f2140e
            if (r4 != r2) goto L_0x011d
            goto L_0x0163
        L_0x011d:
            int r4 = r12.f2141f
            r6 = -2
            if (r4 == r6) goto L_0x012c
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x012c
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
        L_0x012a:
            r7 = r1
            goto L_0x0145
        L_0x012c:
            android.content.Context r2 = r12.f2137b
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f2133C
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x012a
        L_0x0145:
            androidx.appcompat.widget.d0 r6 = r12.f2139d
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.m2102a(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0161
            androidx.appcompat.widget.d0 r2 = r12.f2139d
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.d0 r3 = r12.f2139d
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0161:
            int r1 = r1 + r0
            return r1
        L_0x0163:
            int r3 = r3 + r5
            return r3
    }

    /* renamed from: m */
    private void m2022m() {
            r2 = this;
            android.view.View r0 = r2.f2152q
            if (r0 == 0) goto L_0x0013
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0013
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r1 = r2.f2152q
            r0.removeView(r1)
        L_0x0013:
            return
    }

    /* renamed from: a */
    androidx.appcompat.widget.C0582d0 mo1979a(android.content.Context r2, boolean r3) {
            r1 = this;
            androidx.appcompat.widget.d0 r0 = new androidx.appcompat.widget.d0
            r0.<init>(r2, r3)
            return r0
    }

    /* renamed from: a */
    public void m2051a() {
            r2 = this;
            androidx.appcompat.widget.d0 r0 = r2.f2139d
            if (r0 == 0) goto L_0x000b
            r1 = 1
            r0.setListSelectionHidden(r1)
            r0.requestLayout()
        L_0x000b:
            return
    }

    /* renamed from: a */
    public void m2050a(int r2) {
            r1 = this;
            android.widget.PopupWindow r0 = r1.f2136F
            r0.setAnimationStyle(r2)
            return
    }

    /* renamed from: a */
    public void m2049a(android.graphics.Rect r1) {
            r0 = this;
            r0.f2134D = r1
            return
    }

    /* renamed from: a */
    public void m2048a(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.widget.PopupWindow r0 = r1.f2136F
            r0.setBackgroundDrawable(r2)
            return
    }

    /* renamed from: a */
    public void m2047a(android.view.View r1) {
            r0 = this;
            r0.f2155t = r1
            return
    }

    /* renamed from: a */
    public void m2045a(android.widget.AdapterView.OnItemClickListener r1) {
            r0 = this;
            r0.f2157v = r1
            return
    }

    /* renamed from: a */
    public void mo1837a(android.widget.ListAdapter r3) {
            r2 = this;
            android.database.DataSetObserver r0 = r2.f2154s
            if (r0 != 0) goto L_0x000c
            androidx.appcompat.widget.h0$d r0 = new androidx.appcompat.widget.h0$d
            r0.<init>(r2)
            r2.f2154s = r0
            goto L_0x0013
        L_0x000c:
            android.widget.ListAdapter r1 = r2.f2138c
            if (r1 == 0) goto L_0x0013
            r1.unregisterDataSetObserver(r0)
        L_0x0013:
            r2.f2138c = r3
            if (r3 == 0) goto L_0x001c
            android.database.DataSetObserver r0 = r2.f2154s
            r3.registerDataSetObserver(r0)
        L_0x001c:
            androidx.appcompat.widget.d0 r3 = r2.f2139d
            if (r3 == 0) goto L_0x0025
            android.widget.ListAdapter r0 = r2.f2138c
            r3.setAdapter(r0)
        L_0x0025:
            return
    }

    /* renamed from: a */
    public void m2044a(android.widget.PopupWindow.OnDismissListener r2) {
            r1 = this;
            android.widget.PopupWindow r0 = r1.f2136F
            r0.setOnDismissListener(r2)
            return
    }

    /* renamed from: a */
    public void m2043a(boolean r2) {
            r1 = this;
            r1.f2135E = r2
            android.widget.PopupWindow r0 = r1.f2136F
            r0.setFocusable(r2)
            return
    }

    /* renamed from: b */
    public android.view.View m2042b() {
            r1 = this;
            android.view.View r0 = r1.f2155t
            return r0
    }

    /* renamed from: b */
    public void m2041b(int r3) {
            r2 = this;
            android.widget.PopupWindow r0 = r2.f2136F
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L_0x0018
            android.graphics.Rect r1 = r2.f2133C
            r0.getPadding(r1)
            android.graphics.Rect r0 = r2.f2133C
            int r1 = r0.left
            int r0 = r0.right
            int r1 = r1 + r0
            int r1 = r1 + r3
            r2.f2141f = r1
            goto L_0x001b
        L_0x0018:
            r2.m2026i(r3)
        L_0x001b:
            return
    }

    /* renamed from: b */
    public void m2040b(boolean r2) {
            r1 = this;
            r0 = 1
            r1.f2147l = r0
            r1.f2146k = r2
            return
    }

    /* renamed from: c */
    public android.graphics.drawable.Drawable m2039c() {
            r1 = this;
            android.widget.PopupWindow r0 = r1.f2136F
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            return r0
    }

    /* renamed from: c */
    public void m2038c(int r1) {
            r0 = this;
            r0.f2148m = r1
            return
    }

    /* renamed from: d */
    public void m2035d(int r1) {
            r0 = this;
            r0.f2142g = r1
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519t
    /* renamed from: d */
    public boolean mo2036d() {
            r1 = this;
            android.widget.PopupWindow r0 = r1.f2136F
            boolean r0 = r0.isShowing()
            return r0
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519t
    public void dismiss() {
            r2 = this;
            android.widget.PopupWindow r0 = r2.f2136F
            r0.dismiss()
            r2.m2022m()
            android.widget.PopupWindow r0 = r2.f2136F
            r1 = 0
            r0.setContentView(r1)
            r2.f2139d = r1
            android.os.Handler r0 = r2.f2132B
            androidx.appcompat.widget.h0$g r1 = r2.f2159x
            r0.removeCallbacks(r1)
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519t
    /* renamed from: e */
    public android.widget.ListView mo2034e() {
            r1 = this;
            androidx.appcompat.widget.d0 r0 = r1.f2139d
            return r0
    }

    /* renamed from: e */
    public void m2033e(int r2) {
            r1 = this;
            android.widget.PopupWindow r0 = r1.f2136F
            r0.setInputMethodMode(r2)
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519t
    /* renamed from: f */
    public void mo1833f() {
            r13 = this;
            int r0 = r13.m2023l()
            boolean r1 = r13.m2025j()
            android.widget.PopupWindow r2 = r13.f2136F
            int r3 = r13.f2144i
            androidx.core.widget.C0719h.m1500a(r2, r3)
            android.widget.PopupWindow r2 = r13.f2136F
            boolean r2 = r2.isShowing()
            r3 = 1
            r4 = -2
            r5 = 0
            r6 = -1
            if (r2 == 0) goto L_0x0090
            android.view.View r2 = r13.m2042b()
            boolean r2 = p000a.p018g.p029l.C0216r.m3398w(r2)
            if (r2 != 0) goto L_0x0026
            return
        L_0x0026:
            int r2 = r13.f2141f
            if (r2 != r6) goto L_0x002c
            r2 = -1
            goto L_0x0036
        L_0x002c:
            if (r2 != r4) goto L_0x0036
            android.view.View r2 = r13.m2042b()
            int r2 = r2.getWidth()
        L_0x0036:
            int r7 = r13.f2140e
            if (r7 != r6) goto L_0x0064
            if (r1 == 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r0 = -1
        L_0x003e:
            if (r1 == 0) goto L_0x0052
            android.widget.PopupWindow r1 = r13.f2136F
            int r4 = r13.f2141f
            if (r4 != r6) goto L_0x0048
            r4 = -1
            goto L_0x0049
        L_0x0048:
            r4 = 0
        L_0x0049:
            r1.setWidth(r4)
            android.widget.PopupWindow r1 = r13.f2136F
            r1.setHeight(r5)
            goto L_0x0068
        L_0x0052:
            android.widget.PopupWindow r1 = r13.f2136F
            int r4 = r13.f2141f
            if (r4 != r6) goto L_0x005a
            r4 = -1
            goto L_0x005b
        L_0x005a:
            r4 = 0
        L_0x005b:
            r1.setWidth(r4)
            android.widget.PopupWindow r1 = r13.f2136F
            r1.setHeight(r6)
            goto L_0x0068
        L_0x0064:
            if (r7 != r4) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r0 = r7
        L_0x0068:
            android.widget.PopupWindow r1 = r13.f2136F
            boolean r4 = r13.f2150o
            if (r4 != 0) goto L_0x0073
            boolean r4 = r13.f2149n
            if (r4 != 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r3 = 0
        L_0x0074:
            r1.setOutsideTouchable(r3)
            android.widget.PopupWindow r7 = r13.f2136F
            android.view.View r8 = r13.m2042b()
            int r9 = r13.f2142g
            int r10 = r13.f2143h
            if (r2 >= 0) goto L_0x0085
            r11 = -1
            goto L_0x0086
        L_0x0085:
            r11 = r2
        L_0x0086:
            if (r0 >= 0) goto L_0x008a
            r12 = -1
            goto L_0x008b
        L_0x008a:
            r12 = r0
        L_0x008b:
            r7.update(r8, r9, r10, r11, r12)
            goto L_0x011f
        L_0x0090:
            int r1 = r13.f2141f
            if (r1 != r6) goto L_0x0096
            r1 = -1
            goto L_0x00a0
        L_0x0096:
            if (r1 != r4) goto L_0x00a0
            android.view.View r1 = r13.m2042b()
            int r1 = r1.getWidth()
        L_0x00a0:
            int r2 = r13.f2140e
            if (r2 != r6) goto L_0x00a6
            r0 = -1
            goto L_0x00aa
        L_0x00a6:
            if (r2 != r4) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r0 = r2
        L_0x00aa:
            android.widget.PopupWindow r2 = r13.f2136F
            r2.setWidth(r1)
            android.widget.PopupWindow r1 = r13.f2136F
            r1.setHeight(r0)
            r13.m2037c(r3)
            android.widget.PopupWindow r0 = r13.f2136F
            boolean r1 = r13.f2150o
            if (r1 != 0) goto L_0x00c3
            boolean r1 = r13.f2149n
            if (r1 != 0) goto L_0x00c3
            r1 = 1
            goto L_0x00c4
        L_0x00c3:
            r1 = 0
        L_0x00c4:
            r0.setOutsideTouchable(r1)
            android.widget.PopupWindow r0 = r13.f2136F
            androidx.appcompat.widget.h0$f r1 = r13.f2160y
            r0.setTouchInterceptor(r1)
            boolean r0 = r13.f2147l
            if (r0 == 0) goto L_0x00d9
            android.widget.PopupWindow r0 = r13.f2136F
            boolean r1 = r13.f2146k
            androidx.core.widget.C0719h.m1498a(r0, r1)
        L_0x00d9:
            java.lang.reflect.Method r0 = androidx.appcompat.widget.C0596h0.f2130I
            if (r0 == 0) goto L_0x00f1
            android.widget.PopupWindow r1 = r13.f2136F     // Catch: Exception -> 0x00e9
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: Exception -> 0x00e9
            android.graphics.Rect r3 = r13.f2134D     // Catch: Exception -> 0x00e9
            r2[r5] = r3     // Catch: Exception -> 0x00e9
            r0.invoke(r1, r2)     // Catch: Exception -> 0x00e9
            goto L_0x00f1
        L_0x00e9:
            r0 = move-exception
            java.lang.String r1 = "ListPopupWindow"
            java.lang.String r2 = "Could not invoke setEpicenterBounds on PopupWindow"
            android.util.Log.e(r1, r2, r0)
        L_0x00f1:
            android.widget.PopupWindow r0 = r13.f2136F
            android.view.View r1 = r13.m2042b()
            int r2 = r13.f2142g
            int r3 = r13.f2143h
            int r4 = r13.f2148m
            androidx.core.widget.C0719h.m1499a(r0, r1, r2, r3, r4)
            androidx.appcompat.widget.d0 r0 = r13.f2139d
            r0.setSelection(r6)
            boolean r0 = r13.f2135E
            if (r0 == 0) goto L_0x0111
            androidx.appcompat.widget.d0 r0 = r13.f2139d
            boolean r0 = r0.isInTouchMode()
            if (r0 == 0) goto L_0x0114
        L_0x0111:
            r13.m2051a()
        L_0x0114:
            boolean r0 = r13.f2135E
            if (r0 != 0) goto L_0x011f
            android.os.Handler r0 = r13.f2132B
            androidx.appcompat.widget.h0$c r1 = r13.f2131A
            r0.post(r1)
        L_0x011f:
            return
    }

    /* renamed from: f */
    public void m2032f(int r1) {
            r0 = this;
            r0.f2153r = r1
            return
    }

    /* renamed from: g */
    public int m2031g() {
            r1 = this;
            int r0 = r1.f2142g
            return r0
    }

    /* renamed from: g */
    public void m2030g(int r3) {
            r2 = this;
            androidx.appcompat.widget.d0 r0 = r2.f2139d
            boolean r1 = r2.mo2036d()
            if (r1 == 0) goto L_0x001b
            if (r0 == 0) goto L_0x001b
            r1 = 0
            r0.setListSelectionHidden(r1)
            r0.setSelection(r3)
            int r1 = r0.getChoiceMode()
            if (r1 == 0) goto L_0x001b
            r1 = 1
            r0.setItemChecked(r3, r1)
        L_0x001b:
            return
    }

    /* renamed from: h */
    public int m2029h() {
            r1 = this;
            boolean r0 = r1.f2145j
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            int r0 = r1.f2143h
            return r0
    }

    /* renamed from: h */
    public void m2028h(int r1) {
            r0 = this;
            r0.f2143h = r1
            r1 = 1
            r0.f2145j = r1
            return
    }

    /* renamed from: i */
    public int m2027i() {
            r1 = this;
            int r0 = r1.f2141f
            return r0
    }

    /* renamed from: i */
    public void m2026i(int r1) {
            r0 = this;
            r0.f2141f = r1
            return
    }

    /* renamed from: j */
    public boolean m2025j() {
            r2 = this;
            android.widget.PopupWindow r0 = r2.f2136F
            int r0 = r0.getInputMethodMode()
            r1 = 2
            if (r0 != r1) goto L_0x000b
            r0 = 1
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            return r0
    }

    /* renamed from: k */
    public boolean m2024k() {
            r1 = this;
            boolean r0 = r1.f2135E
            return r0
    }
}
