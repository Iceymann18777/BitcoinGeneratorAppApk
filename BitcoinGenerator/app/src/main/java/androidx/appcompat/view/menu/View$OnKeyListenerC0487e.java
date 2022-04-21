package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.e */
/* loaded from: classes.dex */
final class View$OnKeyListenerC0487e extends androidx.appcompat.view.menu.AbstractC0510n implements androidx.appcompat.view.menu.AbstractC0513p, android.view.View.OnKeyListener, android.widget.PopupWindow.OnDismissListener {

    /* renamed from: C */
    private static final int f1647C = 0;

    /* renamed from: A */
    private android.widget.PopupWindow.OnDismissListener f1648A;

    /* renamed from: B */
    boolean f1649B;

    /* renamed from: c */
    private final android.content.Context f1650c;

    /* renamed from: d */
    private final int f1651d;

    /* renamed from: e */
    private final int f1652e;

    /* renamed from: f */
    private final int f1653f;

    /* renamed from: g */
    private final boolean f1654g;

    /* renamed from: h */
    final android.os.Handler f1655h;

    /* renamed from: i */
    private final java.util.List<androidx.appcompat.view.menu.C0496h> f1656i;

    /* renamed from: j */
    final java.util.List<androidx.appcompat.view.menu.View$OnKeyListenerC0487e.C0492d> f1657j;

    /* renamed from: k */
    final android.view.ViewTreeObserver.OnGlobalLayoutListener f1658k;

    /* renamed from: l */
    private final android.view.View.OnAttachStateChangeListener f1659l;

    /* renamed from: m */
    private final androidx.appcompat.widget.AbstractC0605i0 f1660m;

    /* renamed from: n */
    private int f1661n;

    /* renamed from: o */
    private int f1662o;

    /* renamed from: p */
    private android.view.View f1663p;

    /* renamed from: q */
    android.view.View f1664q;

    /* renamed from: r */
    private int f1665r;

    /* renamed from: s */
    private boolean f1666s;

    /* renamed from: t */
    private boolean f1667t;

    /* renamed from: u */
    private int f1668u;

    /* renamed from: v */
    private int f1669v;

    /* renamed from: w */
    private boolean f1670w;

    /* renamed from: x */
    private boolean f1671x;

    /* renamed from: y */
    private androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a f1672y;

    /* renamed from: z */
    android.view.ViewTreeObserver f1673z;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    /* loaded from: classes.dex */
    class ViewTreeObserver$OnGlobalLayoutListenerC0488a implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.view.menu.View$OnKeyListenerC0487e f1674b;

        ViewTreeObserver$OnGlobalLayoutListenerC0488a(androidx.appcompat.view.menu.View$OnKeyListenerC0487e r1) {
                r0 = this;
                r0.f1674b = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
                r2 = this;
                androidx.appcompat.view.menu.e r0 = r2.f1674b
                boolean r0 = r0.mo2036d()
                if (r0 == 0) goto L_0x0051
                androidx.appcompat.view.menu.e r0 = r2.f1674b
                java.util.List<androidx.appcompat.view.menu.e$d> r0 = r0.f1657j
                int r0 = r0.size()
                if (r0 <= 0) goto L_0x0051
                androidx.appcompat.view.menu.e r0 = r2.f1674b
                java.util.List<androidx.appcompat.view.menu.e$d> r0 = r0.f1657j
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                androidx.appcompat.view.menu.e$d r0 = (androidx.appcompat.view.menu.View$OnKeyListenerC0487e.C0492d) r0
                androidx.appcompat.widget.j0 r0 = r0.f1681a
                boolean r0 = r0.m2024k()
                if (r0 != 0) goto L_0x0051
                androidx.appcompat.view.menu.e r0 = r2.f1674b
                android.view.View r0 = r0.f1664q
                if (r0 == 0) goto L_0x004c
                boolean r0 = r0.isShown()
                if (r0 != 0) goto L_0x0032
                goto L_0x004c
            L_0x0032:
                androidx.appcompat.view.menu.e r0 = r2.f1674b
                java.util.List<androidx.appcompat.view.menu.e$d> r0 = r0.f1657j
                java.util.Iterator r0 = r0.iterator()
            L_0x003a:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0051
                java.lang.Object r1 = r0.next()
                androidx.appcompat.view.menu.e$d r1 = (androidx.appcompat.view.menu.View$OnKeyListenerC0487e.C0492d) r1
                androidx.appcompat.widget.j0 r1 = r1.f1681a
                r1.mo1833f()
                goto L_0x003a
            L_0x004c:
                androidx.appcompat.view.menu.e r0 = r2.f1674b
                r0.dismiss()
            L_0x0051:
                return
        }
    }

    /* renamed from: androidx.appcompat.view.menu.e$b */
    /* loaded from: classes.dex */
    class View$OnAttachStateChangeListenerC0489b implements android.view.View.OnAttachStateChangeListener {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.view.menu.View$OnKeyListenerC0487e f1675b;

        View$OnAttachStateChangeListenerC0489b(androidx.appcompat.view.menu.View$OnKeyListenerC0487e r1) {
                r0 = this;
                r0.f1675b = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View r1) {
                r0 = this;
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View r3) {
                r2 = this;
                androidx.appcompat.view.menu.e r0 = r2.f1675b
                android.view.ViewTreeObserver r0 = r0.f1673z
                if (r0 == 0) goto L_0x001d
                boolean r0 = r0.isAlive()
                if (r0 != 0) goto L_0x0014
                androidx.appcompat.view.menu.e r0 = r2.f1675b
                android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
                r0.f1673z = r1
            L_0x0014:
                androidx.appcompat.view.menu.e r0 = r2.f1675b
                android.view.ViewTreeObserver r1 = r0.f1673z
                android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r0.f1658k
                r1.removeGlobalOnLayoutListener(r0)
            L_0x001d:
                r3.removeOnAttachStateChangeListener(r2)
                return
        }
    }

    /* renamed from: androidx.appcompat.view.menu.e$c */
    /* loaded from: classes.dex */
    class C0490c implements androidx.appcompat.widget.AbstractC0605i0 {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.view.menu.View$OnKeyListenerC0487e f1676b;

        /* renamed from: androidx.appcompat.view.menu.e$c$a */
        /* loaded from: classes.dex */
        class RunnableC0491a implements java.lang.Runnable {

            /* renamed from: b */
            final /* synthetic */ androidx.appcompat.view.menu.View$OnKeyListenerC0487e.C0492d f1677b;

            /* renamed from: c */
            final /* synthetic */ android.view.MenuItem f1678c;

            /* renamed from: d */
            final /* synthetic */ androidx.appcompat.view.menu.C0496h f1679d;

            /* renamed from: e */
            final /* synthetic */ androidx.appcompat.view.menu.View$OnKeyListenerC0487e.C0490c f1680e;

            RunnableC0491a(androidx.appcompat.view.menu.View$OnKeyListenerC0487e.C0490c r1, androidx.appcompat.view.menu.View$OnKeyListenerC0487e.C0492d r2, android.view.MenuItem r3, androidx.appcompat.view.menu.C0496h r4) {
                    r0 = this;
                    r0.f1680e = r1
                    r0.f1677b = r2
                    r0.f1678c = r3
                    r0.f1679d = r4
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r3 = this;
                    androidx.appcompat.view.menu.e$d r0 = r3.f1677b
                    if (r0 == 0) goto L_0x0017
                    androidx.appcompat.view.menu.e$c r1 = r3.f1680e
                    androidx.appcompat.view.menu.e r1 = r1.f1676b
                    r2 = 1
                    r1.f1649B = r2
                    androidx.appcompat.view.menu.h r0 = r0.f1682b
                    r1 = 0
                    r0.m2402a(r1)
                    androidx.appcompat.view.menu.e$c r0 = r3.f1680e
                    androidx.appcompat.view.menu.e r0 = r0.f1676b
                    r0.f1649B = r1
                L_0x0017:
                    android.view.MenuItem r0 = r3.f1678c
                    boolean r0 = r0.isEnabled()
                    if (r0 == 0) goto L_0x002f
                    android.view.MenuItem r0 = r3.f1678c
                    boolean r0 = r0.hasSubMenu()
                    if (r0 == 0) goto L_0x002f
                    androidx.appcompat.view.menu.h r0 = r3.f1679d
                    android.view.MenuItem r1 = r3.f1678c
                    r2 = 4
                    r0.m2411a(r1, r2)
                L_0x002f:
                    return
            }
        }

        C0490c(androidx.appcompat.view.menu.View$OnKeyListenerC0487e r1) {
                r0 = this;
                r0.f1676b = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.AbstractC0605i0
        /* renamed from: a */
        public void mo1978a(androidx.appcompat.view.menu.C0496h r6, android.view.MenuItem r7) {
                r5 = this;
                androidx.appcompat.view.menu.e r0 = r5.f1676b
                android.os.Handler r0 = r0.f1655h
                r1 = 0
                r0.removeCallbacksAndMessages(r1)
                androidx.appcompat.view.menu.e r0 = r5.f1676b
                java.util.List<androidx.appcompat.view.menu.e$d> r0 = r0.f1657j
                int r0 = r0.size()
                r2 = 0
            L_0x0011:
                r3 = -1
                if (r2 >= r0) goto L_0x0026
                androidx.appcompat.view.menu.e r4 = r5.f1676b
                java.util.List<androidx.appcompat.view.menu.e$d> r4 = r4.f1657j
                java.lang.Object r4 = r4.get(r2)
                androidx.appcompat.view.menu.e$d r4 = (androidx.appcompat.view.menu.View$OnKeyListenerC0487e.C0492d) r4
                androidx.appcompat.view.menu.h r4 = r4.f1682b
                if (r6 != r4) goto L_0x0023
                goto L_0x0027
            L_0x0023:
                int r2 = r2 + 1
                goto L_0x0011
            L_0x0026:
                r2 = -1
            L_0x0027:
                if (r2 != r3) goto L_0x002a
                return
            L_0x002a:
                int r2 = r2 + 1
                androidx.appcompat.view.menu.e r0 = r5.f1676b
                java.util.List<androidx.appcompat.view.menu.e$d> r0 = r0.f1657j
                int r0 = r0.size()
                if (r2 >= r0) goto L_0x0041
                androidx.appcompat.view.menu.e r0 = r5.f1676b
                java.util.List<androidx.appcompat.view.menu.e$d> r0 = r0.f1657j
                java.lang.Object r0 = r0.get(r2)
                r1 = r0
                androidx.appcompat.view.menu.e$d r1 = (androidx.appcompat.view.menu.View$OnKeyListenerC0487e.C0492d) r1
            L_0x0041:
                androidx.appcompat.view.menu.e$c$a r0 = new androidx.appcompat.view.menu.e$c$a
                r0.<init>(r5, r1, r7, r6)
                long r1 = android.os.SystemClock.uptimeMillis()
                r3 = 200(0xc8, double:9.9E-322)
                long r1 = r1 + r3
                androidx.appcompat.view.menu.e r7 = r5.f1676b
                android.os.Handler r7 = r7.f1655h
                r7.postAtTime(r0, r6, r1)
                return
        }

        @Override // androidx.appcompat.widget.AbstractC0605i0
        /* renamed from: b */
        public void mo1975b(androidx.appcompat.view.menu.C0496h r1, android.view.MenuItem r2) {
                r0 = this;
                androidx.appcompat.view.menu.e r2 = r0.f1676b
                android.os.Handler r2 = r2.f1655h
                r2.removeCallbacksAndMessages(r1)
                return
        }
    }

    /* renamed from: androidx.appcompat.view.menu.e$d */
    /* loaded from: classes.dex */
    private static class C0492d {

        /* renamed from: a */
        public final androidx.appcompat.widget.C0612j0 f1681a;

        /* renamed from: b */
        public final androidx.appcompat.view.menu.C0496h f1682b;

        /* renamed from: c */
        public final int f1683c;

        public C0492d(androidx.appcompat.widget.C0612j0 r1, androidx.appcompat.view.menu.C0496h r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.f1681a = r1
                r0.f1682b = r2
                r0.f1683c = r3
                return
        }

        /* renamed from: a */
        public android.widget.ListView m2431a() {
                r1 = this;
                androidx.appcompat.widget.j0 r0 = r1.f1681a
                android.widget.ListView r0 = r0.mo2034e()
                return r0
        }
    }

    static {
            int r0 = p000a.p001a.C0006g.abc_cascading_menu_item_layout
            androidx.appcompat.view.menu.View$OnKeyListenerC0487e.f1647C = r0
            return
    }

    public View$OnKeyListenerC0487e(android.content.Context r2, android.view.View r3, int r4, int r5, boolean r6) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1656i = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1657j = r0
            androidx.appcompat.view.menu.e$a r0 = new androidx.appcompat.view.menu.e$a
            r0.<init>(r1)
            r1.f1658k = r0
            androidx.appcompat.view.menu.e$b r0 = new androidx.appcompat.view.menu.e$b
            r0.<init>(r1)
            r1.f1659l = r0
            androidx.appcompat.view.menu.e$c r0 = new androidx.appcompat.view.menu.e$c
            r0.<init>(r1)
            r1.f1660m = r0
            r0 = 0
            r1.f1661n = r0
            r1.f1662o = r0
            r1.f1650c = r2
            r1.f1663p = r3
            r1.f1652e = r4
            r1.f1653f = r5
            r1.f1654g = r6
            r1.f1670w = r0
            int r3 = r1.m2432j()
            r1.f1665r = r3
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r3 = r2.getDisplayMetrics()
            int r3 = r3.widthPixels
            int r3 = r3 / 2
            int r4 = p000a.p001a.C0003d.abc_config_prefDialogWidth
            int r2 = r2.getDimensionPixelSize(r4)
            int r2 = java.lang.Math.max(r3, r2)
            r1.f1651d = r2
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
            r1.f1655h = r2
            return
    }

    /* renamed from: a */
    private android.view.MenuItem m2437a(androidx.appcompat.view.menu.C0496h r5, androidx.appcompat.view.menu.C0496h r6) {
            r4 = this;
            int r0 = r5.size()
            r1 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x001b
            android.view.MenuItem r2 = r5.getItem(r1)
            boolean r3 = r2.hasSubMenu()
            if (r3 == 0) goto L_0x0018
            android.view.SubMenu r3 = r2.getSubMenu()
            if (r6 != r3) goto L_0x0018
            return r2
        L_0x0018:
            int r1 = r1 + 1
            goto L_0x0005
        L_0x001b:
            r5 = 0
            return r5
    }

    /* renamed from: a */
    private android.view.View m2438a(androidx.appcompat.view.menu.View$OnKeyListenerC0487e.C0492d r8, androidx.appcompat.view.menu.C0496h r9) {
            r7 = this;
            androidx.appcompat.view.menu.h r0 = r8.f1682b
            android.view.MenuItem r9 = r7.m2437a(r0, r9)
            r0 = 0
            if (r9 != 0) goto L_0x000a
            return r0
        L_0x000a:
            android.widget.ListView r8 = r8.m2431a()
            android.widget.ListAdapter r1 = r8.getAdapter()
            boolean r2 = r1 instanceof android.widget.HeaderViewListAdapter
            r3 = 0
            if (r2 == 0) goto L_0x0024
            android.widget.HeaderViewListAdapter r1 = (android.widget.HeaderViewListAdapter) r1
            int r2 = r1.getHeadersCount()
            android.widget.ListAdapter r1 = r1.getWrappedAdapter()
            androidx.appcompat.view.menu.g r1 = (androidx.appcompat.view.menu.C0495g) r1
            goto L_0x0027
        L_0x0024:
            androidx.appcompat.view.menu.g r1 = (androidx.appcompat.view.menu.C0495g) r1
            r2 = 0
        L_0x0027:
            int r4 = r1.getCount()
        L_0x002b:
            r5 = -1
            if (r3 >= r4) goto L_0x0038
            androidx.appcompat.view.menu.k r6 = r1.getItem(r3)
            if (r9 != r6) goto L_0x0035
            goto L_0x0039
        L_0x0035:
            int r3 = r3 + 1
            goto L_0x002b
        L_0x0038:
            r3 = -1
        L_0x0039:
            if (r3 != r5) goto L_0x003c
            return r0
        L_0x003c:
            int r3 = r3 + r2
            int r9 = r8.getFirstVisiblePosition()
            int r3 = r3 - r9
            if (r3 < 0) goto L_0x0050
            int r9 = r8.getChildCount()
            if (r3 < r9) goto L_0x004b
            goto L_0x0050
        L_0x004b:
            android.view.View r8 = r8.getChildAt(r3)
            return r8
        L_0x0050:
            return r0
    }

    /* renamed from: c */
    private int m2436c(androidx.appcompat.view.menu.C0496h r4) {
            r3 = this;
            java.util.List<androidx.appcompat.view.menu.e$d> r0 = r3.f1657j
            int r0 = r0.size()
            r1 = 0
        L_0x0007:
            if (r1 >= r0) goto L_0x0019
            java.util.List<androidx.appcompat.view.menu.e$d> r2 = r3.f1657j
            java.lang.Object r2 = r2.get(r1)
            androidx.appcompat.view.menu.e$d r2 = (androidx.appcompat.view.menu.View$OnKeyListenerC0487e.C0492d) r2
            androidx.appcompat.view.menu.h r2 = r2.f1682b
            if (r4 != r2) goto L_0x0016
            return r1
        L_0x0016:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x0019:
            r4 = -1
            return r4
    }

    /* renamed from: d */
    private int m2435d(int r7) {
            r6 = this;
            java.util.List<androidx.appcompat.view.menu.e$d> r0 = r6.f1657j
            int r1 = r0.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            androidx.appcompat.view.menu.e$d r0 = (androidx.appcompat.view.menu.View$OnKeyListenerC0487e.C0492d) r0
            android.widget.ListView r0 = r0.m2431a()
            r1 = 2
            int[] r1 = new int[r1]
            r0.getLocationOnScreen(r1)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.view.View r4 = r6.f1664q
            r4.getWindowVisibleDisplayFrame(r3)
            int r4 = r6.f1665r
            r5 = 0
            if (r4 != r2) goto L_0x0035
            r1 = r1[r5]
            int r0 = r0.getWidth()
            int r1 = r1 + r0
            int r1 = r1 + r7
            int r7 = r3.right
            if (r1 <= r7) goto L_0x0034
            return r5
        L_0x0034:
            return r2
        L_0x0035:
            r0 = r1[r5]
            int r0 = r0 - r7
            if (r0 >= 0) goto L_0x003b
            return r2
        L_0x003b:
            return r5
    }

    /* renamed from: d */
    private void m2434d(androidx.appcompat.view.menu.C0496h r15) {
            r14 = this;
            android.content.Context r0 = r14.f1650c
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            androidx.appcompat.view.menu.g r1 = new androidx.appcompat.view.menu.g
            boolean r2 = r14.f1654g
            int r3 = androidx.appcompat.view.menu.View$OnKeyListenerC0487e.f1647C
            r1.<init>(r15, r0, r2, r3)
            boolean r2 = r14.mo2036d()
            r3 = 1
            if (r2 != 0) goto L_0x001e
            boolean r2 = r14.f1670w
            if (r2 == 0) goto L_0x001e
            r1.m2424a(r3)
            goto L_0x002b
        L_0x001e:
            boolean r2 = r14.mo2036d()
            if (r2 == 0) goto L_0x002b
            boolean r2 = androidx.appcompat.view.menu.AbstractC0510n.m2331b(r15)
            r1.m2424a(r2)
        L_0x002b:
            android.content.Context r2 = r14.f1650c
            int r4 = r14.f1651d
            r5 = 0
            int r2 = androidx.appcompat.view.menu.AbstractC0510n.m2332a(r1, r5, r2, r4)
            androidx.appcompat.widget.j0 r4 = r14.m2433i()
            r4.mo1837a(r1)
            r4.m2041b(r2)
            int r1 = r14.f1662o
            r4.m2038c(r1)
            java.util.List<androidx.appcompat.view.menu.e$d> r1 = r14.f1657j
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x005d
            java.util.List<androidx.appcompat.view.menu.e$d> r1 = r14.f1657j
            int r6 = r1.size()
            int r6 = r6 - r3
            java.lang.Object r1 = r1.get(r6)
            androidx.appcompat.view.menu.e$d r1 = (androidx.appcompat.view.menu.View$OnKeyListenerC0487e.C0492d) r1
            android.view.View r6 = r14.m2438a(r1, r15)
            goto L_0x005f
        L_0x005d:
            r1 = r5
            r6 = r1
        L_0x005f:
            r7 = 0
            if (r6 == 0) goto L_0x00d1
            r4.m1973c(r7)
            r4.m1976a(r5)
            int r8 = r14.m2435d(r2)
            if (r8 != r3) goto L_0x0070
            r9 = 1
            goto L_0x0071
        L_0x0070:
            r9 = 0
        L_0x0071:
            r14.f1665r = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r10 = 26
            r11 = 5
            if (r8 < r10) goto L_0x0080
            r4.m2047a(r6)
            r8 = 0
            r12 = 0
            goto L_0x00b1
        L_0x0080:
            r8 = 2
            int[] r10 = new int[r8]
            android.view.View r12 = r14.f1663p
            r12.getLocationOnScreen(r10)
            int[] r8 = new int[r8]
            r6.getLocationOnScreen(r8)
            int r12 = r14.f1662o
            r12 = r12 & 7
            if (r12 != r11) goto L_0x00a7
            r12 = r10[r7]
            android.view.View r13 = r14.f1663p
            int r13 = r13.getWidth()
            int r12 = r12 + r13
            r10[r7] = r12
            r12 = r8[r7]
            int r13 = r6.getWidth()
            int r12 = r12 + r13
            r8[r7] = r12
        L_0x00a7:
            r12 = r8[r7]
            r13 = r10[r7]
            int r12 = r12 - r13
            r8 = r8[r3]
            r10 = r10[r3]
            int r8 = r8 - r10
        L_0x00b1:
            int r10 = r14.f1662o
            r10 = r10 & r11
            if (r10 != r11) goto L_0x00be
            if (r9 == 0) goto L_0x00b9
            goto L_0x00c4
        L_0x00b9:
            int r2 = r6.getWidth()
            goto L_0x00c6
        L_0x00be:
            if (r9 == 0) goto L_0x00c6
            int r2 = r6.getWidth()
        L_0x00c4:
            int r12 = r12 + r2
            goto L_0x00c7
        L_0x00c6:
            int r12 = r12 - r2
        L_0x00c7:
            r4.m2035d(r12)
            r4.m2040b(r3)
            r4.m2028h(r8)
            goto L_0x00ea
        L_0x00d1:
            boolean r2 = r14.f1666s
            if (r2 == 0) goto L_0x00da
            int r2 = r14.f1668u
            r4.m2035d(r2)
        L_0x00da:
            boolean r2 = r14.f1667t
            if (r2 == 0) goto L_0x00e3
            int r2 = r14.f1669v
            r4.m2028h(r2)
        L_0x00e3:
            android.graphics.Rect r2 = r14.m2329h()
            r4.m2049a(r2)
        L_0x00ea:
            androidx.appcompat.view.menu.e$d r2 = new androidx.appcompat.view.menu.e$d
            int r3 = r14.f1665r
            r2.<init>(r4, r15, r3)
            java.util.List<androidx.appcompat.view.menu.e$d> r3 = r14.f1657j
            r3.add(r2)
            r4.mo1833f()
            android.widget.ListView r2 = r4.mo2034e()
            r2.setOnKeyListener(r14)
            if (r1 != 0) goto L_0x012d
            boolean r1 = r14.f1671x
            if (r1 == 0) goto L_0x012d
            java.lang.CharSequence r1 = r15.m2380h()
            if (r1 == 0) goto L_0x012d
            int r1 = p000a.p001a.C0006g.abc_popup_menu_header_item_layout
            android.view.View r0 = r0.inflate(r1, r2, r7)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.setEnabled(r7)
            java.lang.CharSequence r15 = r15.m2380h()
            r1.setText(r15)
            r2.addHeaderView(r0, r5, r7)
            r4.mo1833f()
        L_0x012d:
            return
    }

    /* renamed from: i */
    private androidx.appcompat.widget.C0612j0 m2433i() {
            r5 = this;
            androidx.appcompat.widget.j0 r0 = new androidx.appcompat.widget.j0
            android.content.Context r1 = r5.f1650c
            int r2 = r5.f1652e
            int r3 = r5.f1653f
            r4 = 0
            r0.<init>(r1, r4, r2, r3)
            androidx.appcompat.widget.i0 r1 = r5.f1660m
            r0.m1977a(r1)
            r0.m2045a(r5)
            r0.m2044a(r5)
            android.view.View r1 = r5.f1663p
            r0.m2047a(r1)
            int r1 = r5.f1662o
            r0.m2038c(r1)
            r1 = 1
            r0.m2043a(r1)
            r1 = 2
            r0.m2033e(r1)
            return r0
    }

    /* renamed from: j */
    private int m2432j() {
            r2 = this;
            android.view.View r0 = r2.f1663p
            int r0 = p000a.p018g.p029l.C0216r.m3411j(r0)
            r1 = 1
            if (r0 != r1) goto L_0x000a
            r1 = 0
        L_0x000a:
            return r1
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: a */
    public void mo2312a(int r2) {
            r1 = this;
            int r0 = r1.f1661n
            if (r0 == r2) goto L_0x0012
            r1.f1661n = r2
            android.view.View r0 = r1.f1663p
            int r0 = p000a.p018g.p029l.C0216r.m3411j(r0)
            int r2 = p000a.p018g.p029l.C0200c.m3490a(r2, r0)
            r1.f1662o = r2
        L_0x0012:
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo130a(android.os.Parcelable r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: a */
    public void mo2311a(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.f1663p
            if (r0 == r2) goto L_0x0014
            r1.f1663p = r2
            int r2 = r1.f1661n
            android.view.View r0 = r1.f1663p
            int r0 = p000a.p018g.p029l.C0216r.m3411j(r0)
            int r2 = p000a.p018g.p029l.C0200c.m3490a(r2, r0)
            r1.f1662o = r2
        L_0x0014:
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: a */
    public void mo2310a(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.f1648A = r1
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: a */
    public void mo2309a(androidx.appcompat.view.menu.C0496h r2) {
            r1 = this;
            android.content.Context r0 = r1.f1650c
            r2.m2407a(r1, r0)
            boolean r0 = r1.mo2036d()
            if (r0 == 0) goto L_0x000f
            r1.m2434d(r2)
            goto L_0x0014
        L_0x000f:
            java.util.List<androidx.appcompat.view.menu.h> r0 = r1.f1656i
            r0.add(r2)
        L_0x0014:
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo126a(androidx.appcompat.view.menu.C0496h r6, boolean r7) {
            r5 = this;
            int r0 = r5.m2436c(r6)
            if (r0 >= 0) goto L_0x0007
            return
        L_0x0007:
            int r1 = r0 + 1
            java.util.List<androidx.appcompat.view.menu.e$d> r2 = r5.f1657j
            int r2 = r2.size()
            r3 = 0
            if (r1 >= r2) goto L_0x001f
            java.util.List<androidx.appcompat.view.menu.e$d> r2 = r5.f1657j
            java.lang.Object r1 = r2.get(r1)
            androidx.appcompat.view.menu.e$d r1 = (androidx.appcompat.view.menu.View$OnKeyListenerC0487e.C0492d) r1
            androidx.appcompat.view.menu.h r1 = r1.f1682b
            r1.m2402a(r3)
        L_0x001f:
            java.util.List<androidx.appcompat.view.menu.e$d> r1 = r5.f1657j
            java.lang.Object r0 = r1.remove(r0)
            androidx.appcompat.view.menu.e$d r0 = (androidx.appcompat.view.menu.View$OnKeyListenerC0487e.C0492d) r0
            androidx.appcompat.view.menu.h r1 = r0.f1682b
            r1.m2398b(r5)
            boolean r1 = r5.f1649B
            r2 = 0
            if (r1 == 0) goto L_0x003b
            androidx.appcompat.widget.j0 r1 = r0.f1681a
            r1.m1974b(r2)
            androidx.appcompat.widget.j0 r1 = r0.f1681a
            r1.m2050a(r3)
        L_0x003b:
            androidx.appcompat.widget.j0 r0 = r0.f1681a
            r0.dismiss()
            java.util.List<androidx.appcompat.view.menu.e$d> r0 = r5.f1657j
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0055
            java.util.List<androidx.appcompat.view.menu.e$d> r1 = r5.f1657j
            int r4 = r0 + (-1)
            java.lang.Object r1 = r1.get(r4)
            androidx.appcompat.view.menu.e$d r1 = (androidx.appcompat.view.menu.View$OnKeyListenerC0487e.C0492d) r1
            int r1 = r1.f1683c
            goto L_0x0059
        L_0x0055:
            int r1 = r5.m2432j()
        L_0x0059:
            r5.f1665r = r1
            if (r0 != 0) goto L_0x0088
            r5.dismiss()
            androidx.appcompat.view.menu.p$a r7 = r5.f1672y
            if (r7 == 0) goto L_0x0068
            r0 = 1
            r7.mo2108a(r6, r0)
        L_0x0068:
            android.view.ViewTreeObserver r6 = r5.f1673z
            if (r6 == 0) goto L_0x007b
            boolean r6 = r6.isAlive()
            if (r6 == 0) goto L_0x0079
            android.view.ViewTreeObserver r6 = r5.f1673z
            android.view.ViewTreeObserver$OnGlobalLayoutListener r7 = r5.f1658k
            r6.removeGlobalOnLayoutListener(r7)
        L_0x0079:
            r5.f1673z = r2
        L_0x007b:
            android.view.View r6 = r5.f1664q
            android.view.View$OnAttachStateChangeListener r7 = r5.f1659l
            r6.removeOnAttachStateChangeListener(r7)
            android.widget.PopupWindow$OnDismissListener r6 = r5.f1648A
            r6.onDismiss()
            goto L_0x0097
        L_0x0088:
            if (r7 == 0) goto L_0x0097
            java.util.List<androidx.appcompat.view.menu.e$d> r6 = r5.f1657j
            java.lang.Object r6 = r6.get(r3)
            androidx.appcompat.view.menu.e$d r6 = (androidx.appcompat.view.menu.View$OnKeyListenerC0487e.C0492d) r6
            androidx.appcompat.view.menu.h r6 = r6.f1682b
            r6.m2402a(r3)
        L_0x0097:
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo2308a(androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a r1) {
            r0 = this;
            r0.f1672y = r1
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo123a(boolean r2) {
            r1 = this;
            java.util.List<androidx.appcompat.view.menu.e$d> r2 = r1.f1657j
            java.util.Iterator r2 = r2.iterator()
        L_0x0006:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r2.next()
            androidx.appcompat.view.menu.e$d r0 = (androidx.appcompat.view.menu.View$OnKeyListenerC0487e.C0492d) r0
            android.widget.ListView r0 = r0.m2431a()
            android.widget.ListAdapter r0 = r0.getAdapter()
            androidx.appcompat.view.menu.g r0 = androidx.appcompat.view.menu.AbstractC0510n.m2333a(r0)
            r0.notifyDataSetChanged()
            goto L_0x0006
        L_0x0022:
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public boolean mo124a(androidx.appcompat.view.menu.SubMenuC0523v r5) {
            r4 = this;
            java.util.List<androidx.appcompat.view.menu.e$d> r0 = r4.f1657j
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L_0x001f
            java.lang.Object r1 = r0.next()
            androidx.appcompat.view.menu.e$d r1 = (androidx.appcompat.view.menu.View$OnKeyListenerC0487e.C0492d) r1
            androidx.appcompat.view.menu.h r3 = r1.f1682b
            if (r5 != r3) goto L_0x0006
            android.widget.ListView r5 = r1.m2431a()
            r5.requestFocus()
            return r2
        L_0x001f:
            boolean r0 = r5.hasVisibleItems()
            if (r0 == 0) goto L_0x0030
            r4.mo2309a(r5)
            androidx.appcompat.view.menu.p$a r0 = r4.f1672y
            if (r0 == 0) goto L_0x002f
            r0.mo2109a(r5)
        L_0x002f:
            return r2
        L_0x0030:
            r5 = 0
            return r5
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: b */
    public void mo2307b(int r2) {
            r1 = this;
            r0 = 1
            r1.f1666s = r0
            r1.f1668u = r2
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: b */
    public void mo2306b(boolean r1) {
            r0 = this;
            r0.f1670w = r1
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: b */
    public boolean mo122b() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: c */
    public android.os.Parcelable mo117c() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: c */
    public void mo2305c(int r2) {
            r1 = this;
            r0 = 1
            r1.f1667t = r0
            r1.f1669v = r2
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: c */
    public void mo2304c(boolean r1) {
            r0 = this;
            r0.f1671x = r1
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519t
    /* renamed from: d */
    public boolean mo2036d() {
            r2 = this;
            java.util.List<androidx.appcompat.view.menu.e$d> r0 = r2.f1657j
            int r0 = r0.size()
            r1 = 0
            if (r0 <= 0) goto L_0x001a
            java.util.List<androidx.appcompat.view.menu.e$d> r0 = r2.f1657j
            java.lang.Object r0 = r0.get(r1)
            androidx.appcompat.view.menu.e$d r0 = (androidx.appcompat.view.menu.View$OnKeyListenerC0487e.C0492d) r0
            androidx.appcompat.widget.j0 r0 = r0.f1681a
            boolean r0 = r0.mo2036d()
            if (r0 == 0) goto L_0x001a
            r1 = 1
        L_0x001a:
            return r1
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519t
    public void dismiss() {
            r4 = this;
            java.util.List<androidx.appcompat.view.menu.e$d> r0 = r4.f1657j
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0028
            java.util.List<androidx.appcompat.view.menu.e$d> r1 = r4.f1657j
            androidx.appcompat.view.menu.e$d[] r2 = new androidx.appcompat.view.menu.View$OnKeyListenerC0487e.C0492d[r0]
            java.lang.Object[] r1 = r1.toArray(r2)
            androidx.appcompat.view.menu.e$d[] r1 = (androidx.appcompat.view.menu.View$OnKeyListenerC0487e.C0492d[]) r1
            int r0 = r0 + (-1)
        L_0x0014:
            if (r0 < 0) goto L_0x0028
            r2 = r1[r0]
            androidx.appcompat.widget.j0 r3 = r2.f1681a
            boolean r3 = r3.mo2036d()
            if (r3 == 0) goto L_0x0025
            androidx.appcompat.widget.j0 r2 = r2.f1681a
            r2.dismiss()
        L_0x0025:
            int r0 = r0 + (-1)
            goto L_0x0014
        L_0x0028:
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519t
    /* renamed from: e */
    public android.widget.ListView mo2034e() {
            r2 = this;
            java.util.List<androidx.appcompat.view.menu.e$d> r0 = r2.f1657j
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000a
            r0 = 0
            goto L_0x001c
        L_0x000a:
            java.util.List<androidx.appcompat.view.menu.e$d> r0 = r2.f1657j
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            androidx.appcompat.view.menu.e$d r0 = (androidx.appcompat.view.menu.View$OnKeyListenerC0487e.C0492d) r0
            android.widget.ListView r0 = r0.m2431a()
        L_0x001c:
            return r0
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519t
    /* renamed from: f */
    public void mo1833f() {
            r2 = this;
            boolean r0 = r2.mo2036d()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.util.List<androidx.appcompat.view.menu.h> r0 = r2.f1656i
            java.util.Iterator r0 = r0.iterator()
        L_0x000d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x001d
            java.lang.Object r1 = r0.next()
            androidx.appcompat.view.menu.h r1 = (androidx.appcompat.view.menu.C0496h) r1
            r2.m2434d(r1)
            goto L_0x000d
        L_0x001d:
            java.util.List<androidx.appcompat.view.menu.h> r0 = r2.f1656i
            r0.clear()
            android.view.View r0 = r2.f1663p
            r2.f1664q = r0
            android.view.View r0 = r2.f1664q
            if (r0 == 0) goto L_0x0049
            android.view.ViewTreeObserver r0 = r2.f1673z
            if (r0 != 0) goto L_0x0030
            r0 = 1
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            android.view.View r1 = r2.f1664q
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r2.f1673z = r1
            if (r0 == 0) goto L_0x0042
            android.view.ViewTreeObserver r0 = r2.f1673z
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.f1658k
            r0.addOnGlobalLayoutListener(r1)
        L_0x0042:
            android.view.View r0 = r2.f1664q
            android.view.View$OnAttachStateChangeListener r1 = r2.f1659l
            r0.addOnAttachStateChangeListener(r1)
        L_0x0049:
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: g */
    protected boolean mo2330g() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
            r5 = this;
            java.util.List<androidx.appcompat.view.menu.e$d> r0 = r5.f1657j
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L_0x0008:
            if (r2 >= r0) goto L_0x001e
            java.util.List<androidx.appcompat.view.menu.e$d> r3 = r5.f1657j
            java.lang.Object r3 = r3.get(r2)
            androidx.appcompat.view.menu.e$d r3 = (androidx.appcompat.view.menu.View$OnKeyListenerC0487e.C0492d) r3
            androidx.appcompat.widget.j0 r4 = r3.f1681a
            boolean r4 = r4.mo2036d()
            if (r4 != 0) goto L_0x001b
            goto L_0x001f
        L_0x001b:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x001e:
            r3 = 0
        L_0x001f:
            if (r3 == 0) goto L_0x0026
            androidx.appcompat.view.menu.h r0 = r3.f1682b
            r0.m2402a(r1)
        L_0x0026:
            return
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            int r1 = r3.getAction()
            r3 = 1
            if (r1 != r3) goto L_0x000f
            r1 = 82
            if (r2 != r1) goto L_0x000f
            r0.dismiss()
            return r3
        L_0x000f:
            r1 = 0
            return r1
    }
}
