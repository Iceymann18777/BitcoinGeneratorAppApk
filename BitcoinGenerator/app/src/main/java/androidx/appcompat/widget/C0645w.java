package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.w */
/* loaded from: classes.dex */
public class C0645w extends android.widget.Spinner implements p000a.p018g.p029l.AbstractC0215q {

    /* renamed from: j */
    private static final int[] f2312j = null;

    /* renamed from: b */
    private final androidx.appcompat.widget.C0585e f2313b;

    /* renamed from: c */
    private final android.content.Context f2314c;

    /* renamed from: d */
    private androidx.appcompat.widget.AbstractView$OnTouchListenerC0589f0 f2315d;

    /* renamed from: e */
    private android.widget.SpinnerAdapter f2316e;

    /* renamed from: f */
    private final boolean f2317f;

    /* renamed from: g */
    androidx.appcompat.widget.C0645w.C0648c f2318g;

    /* renamed from: h */
    int f2319h;

    /* renamed from: i */
    final android.graphics.Rect f2320i;

    /* renamed from: androidx.appcompat.widget.w$a */
    /* loaded from: classes.dex */
    class C0646a extends androidx.appcompat.widget.AbstractView$OnTouchListenerC0589f0 {

        /* renamed from: k */
        final /* synthetic */ androidx.appcompat.widget.C0645w.C0648c f2321k;

        /* renamed from: l */
        final /* synthetic */ androidx.appcompat.widget.C0645w f2322l;

        C0646a(androidx.appcompat.widget.C0645w r1, android.view.View r2, androidx.appcompat.widget.C0645w.C0648c r3) {
                r0 = this;
                r0.f2322l = r1
                r0.f2321k = r3
                r0.<init>(r2)
                return
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0589f0
        /* renamed from: a */
        public androidx.appcompat.view.menu.AbstractC0519t mo1839a() {
                r1 = this;
                androidx.appcompat.widget.w$c r0 = r1.f2321k
                return r0
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0589f0
        /* renamed from: b */
        public boolean mo1838b() {
                r1 = this;
                androidx.appcompat.widget.w r0 = r1.f2322l
                androidx.appcompat.widget.w$c r0 = r0.f2318g
                boolean r0 = r0.mo2036d()
                if (r0 != 0) goto L_0x0011
                androidx.appcompat.widget.w r0 = r1.f2322l
                androidx.appcompat.widget.w$c r0 = r0.f2318g
                r0.mo1833f()
            L_0x0011:
                r0 = 1
                return r0
        }
    }

    /* renamed from: androidx.appcompat.widget.w$b */
    /* loaded from: classes.dex */
    private static class C0647b implements android.widget.ListAdapter, android.widget.SpinnerAdapter {

        /* renamed from: b */
        private android.widget.SpinnerAdapter f2323b;

        /* renamed from: c */
        private android.widget.ListAdapter f2324c;

        public C0647b(android.widget.SpinnerAdapter r3, android.content.res.Resources.Theme r4) {
                r2 = this;
                r2.<init>()
                r2.f2323b = r3
                boolean r0 = r3 instanceof android.widget.ListAdapter
                if (r0 == 0) goto L_0x000e
                r0 = r3
                android.widget.ListAdapter r0 = (android.widget.ListAdapter) r0
                r2.f2324c = r0
            L_0x000e:
                if (r4 == 0) goto L_0x0035
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 23
                if (r0 < r1) goto L_0x0026
                boolean r0 = r3 instanceof android.widget.ThemedSpinnerAdapter
                if (r0 == 0) goto L_0x0026
                android.widget.ThemedSpinnerAdapter r3 = (android.widget.ThemedSpinnerAdapter) r3
                android.content.res.Resources$Theme r0 = r3.getDropDownViewTheme()
                if (r0 == r4) goto L_0x0035
                r3.setDropDownViewTheme(r4)
                goto L_0x0035
            L_0x0026:
                boolean r0 = r3 instanceof androidx.appcompat.widget.AbstractC0630p0
                if (r0 == 0) goto L_0x0035
                androidx.appcompat.widget.p0 r3 = (androidx.appcompat.widget.AbstractC0630p0) r3
                android.content.res.Resources$Theme r0 = r3.getDropDownViewTheme()
                if (r0 != 0) goto L_0x0035
                r3.setDropDownViewTheme(r4)
            L_0x0035:
                return
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
                r1 = this;
                android.widget.ListAdapter r0 = r1.f2324c
                if (r0 == 0) goto L_0x0009
                boolean r0 = r0.areAllItemsEnabled()
                return r0
            L_0x0009:
                r0 = 1
                return r0
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.f2323b
                if (r0 != 0) goto L_0x0006
                r0 = 0
                goto L_0x000a
            L_0x0006:
                int r0 = r0.getCount()
            L_0x000a:
                return r0
        }

        @Override // android.widget.SpinnerAdapter
        public android.view.View getDropDownView(int r2, android.view.View r3, android.view.ViewGroup r4) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.f2323b
                if (r0 != 0) goto L_0x0006
                r2 = 0
                goto L_0x000a
            L_0x0006:
                android.view.View r2 = r0.getDropDownView(r2, r3, r4)
            L_0x000a:
                return r2
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int r2) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.f2323b
                if (r0 != 0) goto L_0x0006
                r2 = 0
                goto L_0x000a
            L_0x0006:
                java.lang.Object r2 = r0.getItem(r2)
            L_0x000a:
                return r2
        }

        @Override // android.widget.Adapter
        public long getItemId(int r3) {
                r2 = this;
                android.widget.SpinnerAdapter r0 = r2.f2323b
                if (r0 != 0) goto L_0x0007
                r0 = -1
                goto L_0x000b
            L_0x0007:
                long r0 = r0.getItemId(r3)
            L_0x000b:
                return r0
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int r1, android.view.View r2, android.view.ViewGroup r3) {
                r0 = this;
                android.view.View r1 = r0.getDropDownView(r1, r2, r3)
                return r1
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.f2323b
                if (r0 == 0) goto L_0x000c
                boolean r0 = r0.hasStableIds()
                if (r0 == 0) goto L_0x000c
                r0 = 1
                goto L_0x000d
            L_0x000c:
                r0 = 0
            L_0x000d:
                return r0
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
                r1 = this;
                int r0 = r1.getCount()
                if (r0 != 0) goto L_0x0008
                r0 = 1
                goto L_0x0009
            L_0x0008:
                r0 = 0
            L_0x0009:
                return r0
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int r2) {
                r1 = this;
                android.widget.ListAdapter r0 = r1.f2324c
                if (r0 == 0) goto L_0x0009
                boolean r2 = r0.isEnabled(r2)
                return r2
            L_0x0009:
                r2 = 1
                return r2
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(android.database.DataSetObserver r2) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.f2323b
                if (r0 == 0) goto L_0x0007
                r0.registerDataSetObserver(r2)
            L_0x0007:
                return
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(android.database.DataSetObserver r2) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.f2323b
                if (r0 == 0) goto L_0x0007
                r0.unregisterDataSetObserver(r2)
            L_0x0007:
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.w$c */
    /* loaded from: classes.dex */
    private class C0648c extends androidx.appcompat.widget.C0596h0 {

        /* renamed from: J */
        private java.lang.CharSequence f2325J;

        /* renamed from: K */
        android.widget.ListAdapter f2326K;

        /* renamed from: L */
        private final android.graphics.Rect f2327L;

        /* renamed from: M */
        final /* synthetic */ androidx.appcompat.widget.C0645w f2328M;

        /* renamed from: androidx.appcompat.widget.w$c$a */
        /* loaded from: classes.dex */
        class C0649a implements android.widget.AdapterView.OnItemClickListener {

            /* renamed from: b */
            final /* synthetic */ androidx.appcompat.widget.C0645w.C0648c f2329b;

            C0649a(androidx.appcompat.widget.C0645w.C0648c r1, androidx.appcompat.widget.C0645w r2) {
                    r0 = this;
                    r0.f2329b = r1
                    r0.<init>()
                    return
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(android.widget.AdapterView<?> r3, android.view.View r4, int r5, long r6) {
                    r2 = this;
                    androidx.appcompat.widget.w$c r3 = r2.f2329b
                    androidx.appcompat.widget.w r3 = r3.f2328M
                    r3.setSelection(r5)
                    androidx.appcompat.widget.w$c r3 = r2.f2329b
                    androidx.appcompat.widget.w r3 = r3.f2328M
                    android.widget.AdapterView$OnItemClickListener r3 = r3.getOnItemClickListener()
                    if (r3 == 0) goto L_0x001e
                    androidx.appcompat.widget.w$c r3 = r2.f2329b
                    androidx.appcompat.widget.w r6 = r3.f2328M
                    android.widget.ListAdapter r3 = r3.f2326K
                    long r0 = r3.getItemId(r5)
                    r6.performItemClick(r4, r5, r0)
                L_0x001e:
                    androidx.appcompat.widget.w$c r3 = r2.f2329b
                    r3.dismiss()
                    return
            }
        }

        /* renamed from: androidx.appcompat.widget.w$c$b */
        /* loaded from: classes.dex */
        class ViewTreeObserver$OnGlobalLayoutListenerC0650b implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

            /* renamed from: b */
            final /* synthetic */ androidx.appcompat.widget.C0645w.C0648c f2330b;

            ViewTreeObserver$OnGlobalLayoutListenerC0650b(androidx.appcompat.widget.C0645w.C0648c r1) {
                    r0 = this;
                    r0.f2330b = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                    r2 = this;
                    androidx.appcompat.widget.w$c r0 = r2.f2330b
                    androidx.appcompat.widget.w r1 = r0.f2328M
                    boolean r0 = r0.m1834b(r1)
                    if (r0 != 0) goto L_0x0010
                    androidx.appcompat.widget.w$c r0 = r2.f2330b
                    r0.dismiss()
                    goto L_0x001a
                L_0x0010:
                    androidx.appcompat.widget.w$c r0 = r2.f2330b
                    r0.m1832l()
                    androidx.appcompat.widget.w$c r0 = r2.f2330b
                    androidx.appcompat.widget.C0645w.C0648c.m1836a(r0)
                L_0x001a:
                    return
            }
        }

        /* renamed from: androidx.appcompat.widget.w$c$c */
        /* loaded from: classes.dex */
        class C0651c implements android.widget.PopupWindow.OnDismissListener {

            /* renamed from: b */
            final /* synthetic */ android.view.ViewTreeObserver.OnGlobalLayoutListener f2331b;

            /* renamed from: c */
            final /* synthetic */ androidx.appcompat.widget.C0645w.C0648c f2332c;

            C0651c(androidx.appcompat.widget.C0645w.C0648c r1, android.view.ViewTreeObserver.OnGlobalLayoutListener r2) {
                    r0 = this;
                    r0.f2332c = r1
                    r0.f2331b = r2
                    r0.<init>()
                    return
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                    r2 = this;
                    androidx.appcompat.widget.w$c r0 = r2.f2332c
                    androidx.appcompat.widget.w r0 = r0.f2328M
                    android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                    if (r0 == 0) goto L_0x000f
                    android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.f2331b
                    r0.removeGlobalOnLayoutListener(r1)
                L_0x000f:
                    return
            }
        }

        public C0648c(androidx.appcompat.widget.C0645w r1, android.content.Context r2, android.util.AttributeSet r3, int r4) {
                r0 = this;
                r0.f2328M = r1
                r0.<init>(r2, r3, r4)
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r0.f2327L = r2
                r0.m2047a(r1)
                r2 = 1
                r0.m2043a(r2)
                r2 = 0
                r0.m2032f(r2)
                androidx.appcompat.widget.w$c$a r2 = new androidx.appcompat.widget.w$c$a
                r2.<init>(r0, r1)
                r0.m2045a(r2)
                return
        }

        /* renamed from: a */
        static /* synthetic */ void m1836a(androidx.appcompat.widget.C0645w.C0648c r0) {
                super.mo1833f()
                return
        }

        @Override // androidx.appcompat.widget.C0596h0
        /* renamed from: a */
        public void mo1837a(android.widget.ListAdapter r1) {
                r0 = this;
                super.mo1837a(r1)
                r0.f2326K = r1
                return
        }

        /* renamed from: a */
        public void m1835a(java.lang.CharSequence r1) {
                r0 = this;
                r0.f2325J = r1
                return
        }

        /* renamed from: b */
        boolean m1834b(android.view.View r2) {
                r1 = this;
                boolean r0 = p000a.p018g.p029l.C0216r.m3398w(r2)
                if (r0 == 0) goto L_0x0010
                android.graphics.Rect r0 = r1.f2327L
                boolean r2 = r2.getGlobalVisibleRect(r0)
                if (r2 == 0) goto L_0x0010
                r2 = 1
                goto L_0x0011
            L_0x0010:
                r2 = 0
            L_0x0011:
                return r2
        }

        @Override // androidx.appcompat.widget.C0596h0, androidx.appcompat.view.menu.AbstractC0519t
        /* renamed from: f */
        public void mo1833f() {
                r3 = this;
                boolean r0 = r3.mo2036d()
                r3.m1832l()
                r1 = 2
                r3.m2033e(r1)
                super.mo1833f()
                android.widget.ListView r1 = r3.mo2034e()
                r2 = 1
                r1.setChoiceMode(r2)
                androidx.appcompat.widget.w r1 = r3.f2328M
                int r1 = r1.getSelectedItemPosition()
                r3.m2030g(r1)
                if (r0 == 0) goto L_0x0022
                return
            L_0x0022:
                androidx.appcompat.widget.w r0 = r3.f2328M
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                if (r0 == 0) goto L_0x003a
                androidx.appcompat.widget.w$c$b r1 = new androidx.appcompat.widget.w$c$b
                r1.<init>(r3)
                r0.addOnGlobalLayoutListener(r1)
                androidx.appcompat.widget.w$c$c r0 = new androidx.appcompat.widget.w$c$c
                r0.<init>(r3, r1)
                r3.m2044a(r0)
            L_0x003a:
                return
        }

        /* renamed from: l */
        void m1832l() {
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.m2039c()
                r1 = 0
                if (r0 == 0) goto L_0x0026
                androidx.appcompat.widget.w r1 = r8.f2328M
                android.graphics.Rect r1 = r1.f2320i
                r0.getPadding(r1)
                androidx.appcompat.widget.w r0 = r8.f2328M
                boolean r0 = androidx.appcompat.widget.C0661z0.m1764a(r0)
                if (r0 == 0) goto L_0x001d
                androidx.appcompat.widget.w r0 = r8.f2328M
                android.graphics.Rect r0 = r0.f2320i
                int r0 = r0.right
                goto L_0x0024
            L_0x001d:
                androidx.appcompat.widget.w r0 = r8.f2328M
                android.graphics.Rect r0 = r0.f2320i
                int r0 = r0.left
                int r0 = -r0
            L_0x0024:
                r1 = r0
                goto L_0x002e
            L_0x0026:
                androidx.appcompat.widget.w r0 = r8.f2328M
                android.graphics.Rect r0 = r0.f2320i
                r0.right = r1
                r0.left = r1
            L_0x002e:
                androidx.appcompat.widget.w r0 = r8.f2328M
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.w r2 = r8.f2328M
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.w r3 = r8.f2328M
                int r3 = r3.getWidth()
                androidx.appcompat.widget.w r4 = r8.f2328M
                int r5 = r4.f2319h
                r6 = -2
                if (r5 != r6) goto L_0x0078
                android.widget.ListAdapter r5 = r8.f2326K
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.m2039c()
                int r4 = r4.m1840a(r5, r6)
                androidx.appcompat.widget.w r5 = r8.f2328M
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.w r6 = r8.f2328M
                android.graphics.Rect r6 = r6.f2320i
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L_0x0070
                r4 = r5
            L_0x0070:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L_0x007e
            L_0x0078:
                r4 = -1
                if (r5 != r4) goto L_0x0082
                int r4 = r3 - r0
                int r4 = r4 - r2
            L_0x007e:
                r8.m2041b(r4)
                goto L_0x0085
            L_0x0082:
                r8.m2041b(r5)
            L_0x0085:
                androidx.appcompat.widget.w r4 = r8.f2328M
                boolean r4 = androidx.appcompat.widget.C0661z0.m1764a(r4)
                if (r4 == 0) goto L_0x0095
                int r3 = r3 - r2
                int r0 = r8.m2027i()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto L_0x0096
            L_0x0095:
                int r1 = r1 + r0
            L_0x0096:
                r8.m2035d(r1)
                return
        }

        /* renamed from: m */
        public java.lang.CharSequence m1831m() {
                r1 = this;
                java.lang.CharSequence r0 = r1.f2325J
                return r0
        }
    }

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16843505(0x10102f1, float:2.3695668E-38)
            r0[r1] = r2
            androidx.appcompat.widget.C0645w.f2312j = r0
            return
    }

    public C0645w(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = p000a.p001a.C0000a.spinnerStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public C0645w(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public C0645w(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public C0645w(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11, android.content.res.Resources.Theme r12) {
            r7 = this;
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.f2320i = r0
            int[] r0 = p000a.p001a.C0009j.Spinner
            r1 = 0
            androidx.appcompat.widget.t0 r0 = androidx.appcompat.widget.C0638t0.m1900a(r8, r9, r0, r10, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r7)
            r7.f2313b = r2
            r2 = 0
            if (r12 == 0) goto L_0x0023
            a.a.m.d r3 = new a.a.m.d
            r3.<init>(r8, r12)
        L_0x0020:
            r7.f2314c = r3
            goto L_0x003c
        L_0x0023:
            int r12 = p000a.p001a.C0009j.Spinner_popupTheme
            int r12 = r0.m1888g(r12, r1)
            if (r12 == 0) goto L_0x0031
            a.a.m.d r3 = new a.a.m.d
            r3.<init>(r8, r12)
            goto L_0x0020
        L_0x0031:
            int r12 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r12 >= r3) goto L_0x0039
            r12 = r8
            goto L_0x003a
        L_0x0039:
            r12 = r2
        L_0x003a:
            r7.f2314c = r12
        L_0x003c:
            android.content.Context r12 = r7.f2314c
            r3 = 1
            if (r12 == 0) goto L_0x00aa
            r12 = -1
            if (r11 != r12) goto L_0x0072
            int[] r12 = androidx.appcompat.widget.C0645w.f2312j     // Catch: all -> 0x005c, Exception -> 0x005f
            android.content.res.TypedArray r12 = r8.obtainStyledAttributes(r9, r12, r10, r1)     // Catch: all -> 0x005c, Exception -> 0x005f
            boolean r4 = r12.hasValue(r1)     // Catch: Exception -> 0x005a, all -> 0x006b
            if (r4 == 0) goto L_0x0054
            int r11 = r12.getInt(r1, r1)     // Catch: Exception -> 0x005a, all -> 0x006b
        L_0x0054:
            if (r12 == 0) goto L_0x0072
        L_0x0056:
            r12.recycle()
            goto L_0x0072
        L_0x005a:
            r4 = move-exception
            goto L_0x0061
        L_0x005c:
            r8 = move-exception
            r12 = r2
            goto L_0x006c
        L_0x005f:
            r4 = move-exception
            r12 = r2
        L_0x0061:
            java.lang.String r5 = "AppCompatSpinner"
            java.lang.String r6 = "Could not read android:spinnerMode"
            android.util.Log.i(r5, r6, r4)     // Catch: all -> 0x006b
            if (r12 == 0) goto L_0x0072
            goto L_0x0056
        L_0x006b:
            r8 = move-exception
        L_0x006c:
            if (r12 == 0) goto L_0x0071
            r12.recycle()
        L_0x0071:
            throw r8
        L_0x0072:
            if (r11 != r3) goto L_0x00aa
            androidx.appcompat.widget.w$c r11 = new androidx.appcompat.widget.w$c
            android.content.Context r12 = r7.f2314c
            r11.<init>(r7, r12, r9, r10)
            android.content.Context r12 = r7.f2314c
            int[] r4 = p000a.p001a.C0009j.Spinner
            androidx.appcompat.widget.t0 r12 = androidx.appcompat.widget.C0638t0.m1900a(r12, r9, r4, r10, r1)
            int r1 = p000a.p001a.C0009j.Spinner_android_dropDownWidth
            r4 = -2
            int r1 = r12.m1890f(r1, r4)
            r7.f2319h = r1
            int r1 = p000a.p001a.C0009j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r1 = r12.m1899b(r1)
            r11.m2048a(r1)
            int r1 = p000a.p001a.C0009j.Spinner_android_prompt
            java.lang.String r1 = r0.m1895d(r1)
            r11.m1835a(r1)
            r12.m1908a()
            r7.f2318g = r11
            androidx.appcompat.widget.w$a r12 = new androidx.appcompat.widget.w$a
            r12.<init>(r7, r7, r11)
            r7.f2315d = r12
        L_0x00aa:
            int r11 = p000a.p001a.C0009j.Spinner_android_entries
            java.lang.CharSequence[] r11 = r0.m1891f(r11)
            if (r11 == 0) goto L_0x00c2
            android.widget.ArrayAdapter r12 = new android.widget.ArrayAdapter
            r1 = 17367048(0x1090008, float:2.5162948E-38)
            r12.<init>(r8, r1, r11)
            int r8 = p000a.p001a.C0006g.support_simple_spinner_dropdown_item
            r12.setDropDownViewResource(r8)
            r7.setAdapter2(r12)
        L_0x00c2:
            r0.m1908a()
            r7.f2317f = r3
            android.widget.SpinnerAdapter r8 = r7.f2316e
            if (r8 == 0) goto L_0x00d0
            r7.setAdapter2(r8)
            r7.f2316e = r2
        L_0x00d0:
            androidx.appcompat.widget.e r8 = r7.f2313b
            r8.m2084a(r9, r10)
            return
    }

    /* renamed from: a */
    int m1840a(android.widget.SpinnerAdapter r11, android.graphics.drawable.Drawable r12) {
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r10.getMeasuredWidth()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r2 = r10.getMeasuredHeight()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            int r3 = r10.getSelectedItemPosition()
            int r3 = java.lang.Math.max(r0, r3)
            int r4 = r11.getCount()
            int r5 = r3 + 15
            int r4 = java.lang.Math.min(r4, r5)
            int r5 = r4 - r3
            int r5 = 15 - r5
            int r3 = r3 - r5
            int r3 = java.lang.Math.max(r0, r3)
            r5 = 0
            r7 = r5
            r6 = 0
        L_0x0032:
            if (r3 >= r4) goto L_0x005d
            int r8 = r11.getItemViewType(r3)
            if (r8 == r0) goto L_0x003c
            r7 = r5
            r0 = r8
        L_0x003c:
            android.view.View r7 = r11.getView(r3, r7, r10)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            if (r8 != 0) goto L_0x004f
            android.view.ViewGroup$LayoutParams r8 = new android.view.ViewGroup$LayoutParams
            r9 = -2
            r8.<init>(r9, r9)
            r7.setLayoutParams(r8)
        L_0x004f:
            r7.measure(r1, r2)
            int r8 = r7.getMeasuredWidth()
            int r6 = java.lang.Math.max(r6, r8)
            int r3 = r3 + 1
            goto L_0x0032
        L_0x005d:
            if (r12 == 0) goto L_0x006c
            android.graphics.Rect r11 = r10.f2320i
            r12.getPadding(r11)
            android.graphics.Rect r11 = r10.f2320i
            int r12 = r11.left
            int r11 = r11.right
            int r12 = r12 + r11
            int r6 = r6 + r12
        L_0x006c:
            return r6
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.e r0 = r1.f2313b
            if (r0 == 0) goto L_0x000a
            r0.m2089a()
        L_0x000a:
            return
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
            r2 = this;
            androidx.appcompat.widget.w$c r0 = r2.f2318g
            if (r0 == 0) goto L_0x0009
            int r0 = r0.m2031g()
            return r0
        L_0x0009:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x0014
            int r0 = super.getDropDownHorizontalOffset()
            return r0
        L_0x0014:
            r0 = 0
            return r0
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
            r2 = this;
            androidx.appcompat.widget.w$c r0 = r2.f2318g
            if (r0 == 0) goto L_0x0009
            int r0 = r0.m2029h()
            return r0
        L_0x0009:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x0014
            int r0 = super.getDropDownVerticalOffset()
            return r0
        L_0x0014:
            r0 = 0
            return r0
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
            r2 = this;
            androidx.appcompat.widget.w$c r0 = r2.f2318g
            if (r0 == 0) goto L_0x0007
            int r0 = r2.f2319h
            return r0
        L_0x0007:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x0012
            int r0 = super.getDropDownWidth()
            return r0
        L_0x0012:
            r0 = 0
            return r0
    }

    @Override // android.widget.Spinner
    public android.graphics.drawable.Drawable getPopupBackground() {
            r2 = this;
            androidx.appcompat.widget.w$c r0 = r2.f2318g
            if (r0 == 0) goto L_0x0009
            android.graphics.drawable.Drawable r0 = r0.m2039c()
            return r0
        L_0x0009:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x0014
            android.graphics.drawable.Drawable r0 = super.getPopupBackground()
            return r0
        L_0x0014:
            r0 = 0
            return r0
    }

    @Override // android.widget.Spinner
    public android.content.Context getPopupContext() {
            r2 = this;
            androidx.appcompat.widget.w$c r0 = r2.f2318g
            if (r0 == 0) goto L_0x0007
            android.content.Context r0 = r2.f2314c
            return r0
        L_0x0007:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x0012
            android.content.Context r0 = super.getPopupContext()
            return r0
        L_0x0012:
            r0 = 0
            return r0
    }

    @Override // android.widget.Spinner
    public java.lang.CharSequence getPrompt() {
            r1 = this;
            androidx.appcompat.widget.w$c r0 = r1.f2318g
            if (r0 == 0) goto L_0x0009
            java.lang.CharSequence r0 = r0.m1831m()
            goto L_0x000d
        L_0x0009:
            java.lang.CharSequence r0 = super.getPrompt()
        L_0x000d:
            return r0
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            androidx.appcompat.widget.e r0 = r1.f2313b
            if (r0 == 0) goto L_0x0009
            android.content.res.ColorStateList r0 = r0.m2083b()
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            return r0
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            androidx.appcompat.widget.e r0 = r1.f2313b
            if (r0 == 0) goto L_0x0009
            android.graphics.PorterDuff$Mode r0 = r0.m2080c()
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            return r0
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            androidx.appcompat.widget.w$c r0 = r1.f2318g
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.mo2036d()
            if (r0 == 0) goto L_0x0012
            androidx.appcompat.widget.w$c r0 = r1.f2318g
            r0.dismiss()
        L_0x0012:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int r3, int r4) {
            r2 = this;
            super.onMeasure(r3, r4)
            androidx.appcompat.widget.w$c r4 = r2.f2318g
            if (r4 == 0) goto L_0x0032
            int r4 = android.view.View.MeasureSpec.getMode(r3)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r0) goto L_0x0032
            int r4 = r2.getMeasuredWidth()
            android.widget.SpinnerAdapter r0 = r2.getAdapter()
            android.graphics.drawable.Drawable r1 = r2.getBackground()
            int r0 = r2.m1840a(r0, r1)
            int r4 = java.lang.Math.max(r4, r0)
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            int r3 = java.lang.Math.min(r4, r3)
            int r4 = r2.getMeasuredHeight()
            r2.setMeasuredDimension(r3, r4)
        L_0x0032:
            return
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            androidx.appcompat.widget.f0 r0 = r1.f2315d
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.onTouch(r1, r2)
            if (r0 == 0) goto L_0x000c
            r2 = 1
            return r2
        L_0x000c:
            boolean r2 = super.onTouchEvent(r2)
            return r2
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
            r1 = this;
            androidx.appcompat.widget.w$c r0 = r1.f2318g
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.mo2036d()
            if (r0 != 0) goto L_0x000f
            androidx.appcompat.widget.w$c r0 = r1.f2318g
            r0.mo1833f()
        L_0x000f:
            r0 = 1
            return r0
        L_0x0011:
            boolean r0 = super.performClick()
            return r0
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(android.widget.SpinnerAdapter r1) {
            r0 = this;
            android.widget.SpinnerAdapter r1 = (android.widget.SpinnerAdapter) r1
            r0.setAdapter2(r1)
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    /* renamed from: setAdapter  reason: avoid collision after fix types in other method */
    public void setAdapter2(android.widget.SpinnerAdapter r4) {
            r3 = this;
            boolean r0 = r3.f2317f
            if (r0 != 0) goto L_0x0007
            r3.f2316e = r4
            return
        L_0x0007:
            super.setAdapter(r4)
            androidx.appcompat.widget.w$c r0 = r3.f2318g
            if (r0 == 0) goto L_0x0024
            android.content.Context r0 = r3.f2314c
            if (r0 != 0) goto L_0x0016
            android.content.Context r0 = r3.getContext()
        L_0x0016:
            androidx.appcompat.widget.w$c r1 = r3.f2318g
            androidx.appcompat.widget.w$b r2 = new androidx.appcompat.widget.w$b
            android.content.res.Resources$Theme r0 = r0.getTheme()
            r2.<init>(r4, r0)
            r1.mo1837a(r2)
        L_0x0024:
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            super.setBackgroundDrawable(r2)
            androidx.appcompat.widget.e r0 = r1.f2313b
            if (r0 == 0) goto L_0x000a
            r0.m2085a(r2)
        L_0x000a:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            androidx.appcompat.widget.e r0 = r1.f2313b
            if (r0 == 0) goto L_0x000a
            r0.m2088a(r2)
        L_0x000a:
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int r3) {
            r2 = this;
            androidx.appcompat.widget.w$c r0 = r2.f2318g
            if (r0 == 0) goto L_0x0008
            r0.m2035d(r3)
            goto L_0x0011
        L_0x0008:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x0011
            super.setDropDownHorizontalOffset(r3)
        L_0x0011:
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int r3) {
            r2 = this;
            androidx.appcompat.widget.w$c r0 = r2.f2318g
            if (r0 == 0) goto L_0x0008
            r0.m2028h(r3)
            goto L_0x0011
        L_0x0008:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x0011
            super.setDropDownVerticalOffset(r3)
        L_0x0011:
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int r3) {
            r2 = this;
            androidx.appcompat.widget.w$c r0 = r2.f2318g
            if (r0 == 0) goto L_0x0007
            r2.f2319h = r3
            goto L_0x0010
        L_0x0007:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x0010
            super.setDropDownWidth(r3)
        L_0x0010:
            return
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            androidx.appcompat.widget.w$c r0 = r2.f2318g
            if (r0 == 0) goto L_0x0008
            r0.m2048a(r3)
            goto L_0x0011
        L_0x0008:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x0011
            super.setPopupBackgroundDrawable(r3)
        L_0x0011:
            return
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getPopupContext()
            android.graphics.drawable.Drawable r2 = p000a.p001a.p002k.p003a.C0010a.m4259c(r0, r2)
            r1.setPopupBackgroundDrawable(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setPrompt(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.w$c r0 = r1.f2318g
            if (r0 == 0) goto L_0x0008
            r0.m1835a(r2)
            goto L_0x000b
        L_0x0008:
            super.setPrompt(r2)
        L_0x000b:
            return
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.e r0 = r1.f2313b
            if (r0 == 0) goto L_0x0007
            r0.m2082b(r2)
        L_0x0007:
            return
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.e r0 = r1.f2313b
            if (r0 == 0) goto L_0x0007
            r0.m2086a(r2)
        L_0x0007:
            return
    }
}
