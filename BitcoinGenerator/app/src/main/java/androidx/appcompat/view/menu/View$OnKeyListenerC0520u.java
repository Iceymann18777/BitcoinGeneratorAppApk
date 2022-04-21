package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.u */
/* loaded from: classes.dex */
final class View$OnKeyListenerC0520u extends androidx.appcompat.view.menu.AbstractC0510n implements android.widget.PopupWindow.OnDismissListener, android.widget.AdapterView.OnItemClickListener, androidx.appcompat.view.menu.AbstractC0513p, android.view.View.OnKeyListener {

    /* renamed from: w */
    private static final int f1786w = 0;

    /* renamed from: c */
    private final android.content.Context f1787c;

    /* renamed from: d */
    private final androidx.appcompat.view.menu.C0496h f1788d;

    /* renamed from: e */
    private final androidx.appcompat.view.menu.C0495g f1789e;

    /* renamed from: f */
    private final boolean f1790f;

    /* renamed from: g */
    private final int f1791g;

    /* renamed from: h */
    private final int f1792h;

    /* renamed from: i */
    private final int f1793i;

    /* renamed from: j */
    final androidx.appcompat.widget.C0612j0 f1794j;

    /* renamed from: k */
    final android.view.ViewTreeObserver.OnGlobalLayoutListener f1795k;

    /* renamed from: l */
    private final android.view.View.OnAttachStateChangeListener f1796l;

    /* renamed from: m */
    private android.widget.PopupWindow.OnDismissListener f1797m;

    /* renamed from: n */
    private android.view.View f1798n;

    /* renamed from: o */
    android.view.View f1799o;

    /* renamed from: p */
    private androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a f1800p;

    /* renamed from: q */
    android.view.ViewTreeObserver f1801q;

    /* renamed from: r */
    private boolean f1802r;

    /* renamed from: s */
    private boolean f1803s;

    /* renamed from: t */
    private int f1804t;

    /* renamed from: u */
    private int f1805u;

    /* renamed from: v */
    private boolean f1806v;

    /* renamed from: androidx.appcompat.view.menu.u$a */
    /* loaded from: classes.dex */
    class ViewTreeObserver$OnGlobalLayoutListenerC0521a implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.view.menu.View$OnKeyListenerC0520u f1807b;

        ViewTreeObserver$OnGlobalLayoutListenerC0521a(androidx.appcompat.view.menu.View$OnKeyListenerC0520u r1) {
                r0 = this;
                r0.f1807b = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
                r1 = this;
                androidx.appcompat.view.menu.u r0 = r1.f1807b
                boolean r0 = r0.mo2036d()
                if (r0 == 0) goto L_0x002c
                androidx.appcompat.view.menu.u r0 = r1.f1807b
                androidx.appcompat.widget.j0 r0 = r0.f1794j
                boolean r0 = r0.m2024k()
                if (r0 != 0) goto L_0x002c
                androidx.appcompat.view.menu.u r0 = r1.f1807b
                android.view.View r0 = r0.f1799o
                if (r0 == 0) goto L_0x0027
                boolean r0 = r0.isShown()
                if (r0 != 0) goto L_0x001f
                goto L_0x0027
            L_0x001f:
                androidx.appcompat.view.menu.u r0 = r1.f1807b
                androidx.appcompat.widget.j0 r0 = r0.f1794j
                r0.mo1833f()
                goto L_0x002c
            L_0x0027:
                androidx.appcompat.view.menu.u r0 = r1.f1807b
                r0.dismiss()
            L_0x002c:
                return
        }
    }

    /* renamed from: androidx.appcompat.view.menu.u$b */
    /* loaded from: classes.dex */
    class View$OnAttachStateChangeListenerC0522b implements android.view.View.OnAttachStateChangeListener {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.view.menu.View$OnKeyListenerC0520u f1808b;

        View$OnAttachStateChangeListenerC0522b(androidx.appcompat.view.menu.View$OnKeyListenerC0520u r1) {
                r0 = this;
                r0.f1808b = r1
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
                androidx.appcompat.view.menu.u r0 = r2.f1808b
                android.view.ViewTreeObserver r0 = r0.f1801q
                if (r0 == 0) goto L_0x001d
                boolean r0 = r0.isAlive()
                if (r0 != 0) goto L_0x0014
                androidx.appcompat.view.menu.u r0 = r2.f1808b
                android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
                r0.f1801q = r1
            L_0x0014:
                androidx.appcompat.view.menu.u r0 = r2.f1808b
                android.view.ViewTreeObserver r1 = r0.f1801q
                android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r0.f1795k
                r1.removeGlobalOnLayoutListener(r0)
            L_0x001d:
                r3.removeOnAttachStateChangeListener(r2)
                return
        }
    }

    static {
            int r0 = p000a.p001a.C0006g.abc_popup_menu_item_layout
            androidx.appcompat.view.menu.View$OnKeyListenerC0520u.f1786w = r0
            return
    }

    public View$OnKeyListenerC0520u(android.content.Context r4, androidx.appcompat.view.menu.C0496h r5, android.view.View r6, int r7, int r8, boolean r9) {
            r3 = this;
            r3.<init>()
            androidx.appcompat.view.menu.u$a r0 = new androidx.appcompat.view.menu.u$a
            r0.<init>(r3)
            r3.f1795k = r0
            androidx.appcompat.view.menu.u$b r0 = new androidx.appcompat.view.menu.u$b
            r0.<init>(r3)
            r3.f1796l = r0
            r0 = 0
            r3.f1805u = r0
            r3.f1787c = r4
            r3.f1788d = r5
            r3.f1790f = r9
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r4)
            androidx.appcompat.view.menu.g r0 = new androidx.appcompat.view.menu.g
            boolean r1 = r3.f1790f
            int r2 = androidx.appcompat.view.menu.View$OnKeyListenerC0520u.f1786w
            r0.<init>(r5, r9, r1, r2)
            r3.f1789e = r0
            r3.f1792h = r7
            r3.f1793i = r8
            android.content.res.Resources r7 = r4.getResources()
            android.util.DisplayMetrics r8 = r7.getDisplayMetrics()
            int r8 = r8.widthPixels
            int r8 = r8 / 2
            int r9 = p000a.p001a.C0003d.abc_config_prefDialogWidth
            int r7 = r7.getDimensionPixelSize(r9)
            int r7 = java.lang.Math.max(r8, r7)
            r3.f1791g = r7
            r3.f1798n = r6
            androidx.appcompat.widget.j0 r6 = new androidx.appcompat.widget.j0
            android.content.Context r7 = r3.f1787c
            int r8 = r3.f1792h
            int r9 = r3.f1793i
            r0 = 0
            r6.<init>(r7, r0, r8, r9)
            r3.f1794j = r6
            r5.m2407a(r3, r4)
            return
    }

    /* renamed from: i */
    private boolean m2303i() {
            r7 = this;
            boolean r0 = r7.mo2036d()
            r1 = 1
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r7.f1802r
            r2 = 0
            if (r0 != 0) goto L_0x00c5
            android.view.View r0 = r7.f1798n
            if (r0 != 0) goto L_0x0013
            goto L_0x00c5
        L_0x0013:
            r7.f1799o = r0
            androidx.appcompat.widget.j0 r0 = r7.f1794j
            r0.m2044a(r7)
            androidx.appcompat.widget.j0 r0 = r7.f1794j
            r0.m2045a(r7)
            androidx.appcompat.widget.j0 r0 = r7.f1794j
            r0.m2043a(r1)
            android.view.View r0 = r7.f1799o
            android.view.ViewTreeObserver r3 = r7.f1801q
            if (r3 != 0) goto L_0x002c
            r3 = 1
            goto L_0x002d
        L_0x002c:
            r3 = 0
        L_0x002d:
            android.view.ViewTreeObserver r4 = r0.getViewTreeObserver()
            r7.f1801q = r4
            if (r3 == 0) goto L_0x003c
            android.view.ViewTreeObserver r3 = r7.f1801q
            android.view.ViewTreeObserver$OnGlobalLayoutListener r4 = r7.f1795k
            r3.addOnGlobalLayoutListener(r4)
        L_0x003c:
            android.view.View$OnAttachStateChangeListener r3 = r7.f1796l
            r0.addOnAttachStateChangeListener(r3)
            androidx.appcompat.widget.j0 r3 = r7.f1794j
            r3.m2047a(r0)
            androidx.appcompat.widget.j0 r0 = r7.f1794j
            int r3 = r7.f1805u
            r0.m2038c(r3)
            boolean r0 = r7.f1803s
            r3 = 0
            if (r0 != 0) goto L_0x0060
            androidx.appcompat.view.menu.g r0 = r7.f1789e
            android.content.Context r4 = r7.f1787c
            int r5 = r7.f1791g
            int r0 = androidx.appcompat.view.menu.AbstractC0510n.m2332a(r0, r3, r4, r5)
            r7.f1804t = r0
            r7.f1803s = r1
        L_0x0060:
            androidx.appcompat.widget.j0 r0 = r7.f1794j
            int r4 = r7.f1804t
            r0.m2041b(r4)
            androidx.appcompat.widget.j0 r0 = r7.f1794j
            r4 = 2
            r0.m2033e(r4)
            androidx.appcompat.widget.j0 r0 = r7.f1794j
            android.graphics.Rect r4 = r7.m2329h()
            r0.m2049a(r4)
            androidx.appcompat.widget.j0 r0 = r7.f1794j
            r0.mo1833f()
            androidx.appcompat.widget.j0 r0 = r7.f1794j
            android.widget.ListView r0 = r0.mo2034e()
            r0.setOnKeyListener(r7)
            boolean r4 = r7.f1806v
            if (r4 == 0) goto L_0x00b8
            androidx.appcompat.view.menu.h r4 = r7.f1788d
            java.lang.CharSequence r4 = r4.m2380h()
            if (r4 == 0) goto L_0x00b8
            android.content.Context r4 = r7.f1787c
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            int r5 = p000a.p001a.C0006g.abc_popup_menu_header_item_layout
            android.view.View r4 = r4.inflate(r5, r0, r2)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x00b2
            androidx.appcompat.view.menu.h r6 = r7.f1788d
            java.lang.CharSequence r6 = r6.m2380h()
            r5.setText(r6)
        L_0x00b2:
            r4.setEnabled(r2)
            r0.addHeaderView(r4, r3, r2)
        L_0x00b8:
            androidx.appcompat.widget.j0 r0 = r7.f1794j
            androidx.appcompat.view.menu.g r2 = r7.f1789e
            r0.mo1837a(r2)
            androidx.appcompat.widget.j0 r0 = r7.f1794j
            r0.mo1833f()
            return r1
        L_0x00c5:
            return r2
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: a */
    public void mo2312a(int r1) {
            r0 = this;
            r0.f1805u = r1
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
    public void mo2311a(android.view.View r1) {
            r0 = this;
            r0.f1798n = r1
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: a */
    public void mo2310a(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.f1797m = r1
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: a */
    public void mo2309a(androidx.appcompat.view.menu.C0496h r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo126a(androidx.appcompat.view.menu.C0496h r2, boolean r3) {
            r1 = this;
            androidx.appcompat.view.menu.h r0 = r1.f1788d
            if (r2 == r0) goto L_0x0005
            return
        L_0x0005:
            r1.dismiss()
            androidx.appcompat.view.menu.p$a r0 = r1.f1800p
            if (r0 == 0) goto L_0x000f
            r0.mo2108a(r2, r3)
        L_0x000f:
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo2308a(androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a r1) {
            r0 = this;
            r0.f1800p = r1
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo123a(boolean r1) {
            r0 = this;
            r1 = 0
            r0.f1803s = r1
            androidx.appcompat.view.menu.g r1 = r0.f1789e
            if (r1 == 0) goto L_0x000a
            r1.notifyDataSetChanged()
        L_0x000a:
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public boolean mo124a(androidx.appcompat.view.menu.SubMenuC0523v r10) {
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L_0x0064
            androidx.appcompat.view.menu.o r0 = new androidx.appcompat.view.menu.o
            android.content.Context r3 = r9.f1787c
            android.view.View r5 = r9.f1799o
            boolean r6 = r9.f1790f
            int r7 = r9.f1792h
            int r8 = r9.f1793i
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.appcompat.view.menu.p$a r2 = r9.f1800p
            r0.m2322a(r2)
            boolean r2 = androidx.appcompat.view.menu.AbstractC0510n.m2331b(r10)
            r0.m2321a(r2)
            android.widget.PopupWindow$OnDismissListener r2 = r9.f1797m
            r0.m2323a(r2)
            r2 = 0
            r9.f1797m = r2
            androidx.appcompat.view.menu.h r2 = r9.f1788d
            r2.m2402a(r1)
            androidx.appcompat.widget.j0 r2 = r9.f1794j
            int r2 = r2.m2031g()
            androidx.appcompat.widget.j0 r3 = r9.f1794j
            int r3 = r3.m2029h()
            int r4 = r9.f1805u
            android.view.View r5 = r9.f1798n
            int r5 = p000a.p018g.p029l.C0216r.m3411j(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L_0x0055
            android.view.View r4 = r9.f1798n
            int r4 = r4.getWidth()
            int r2 = r2 + r4
        L_0x0055:
            boolean r0 = r0.m2326a(r2, r3)
            if (r0 == 0) goto L_0x0064
            androidx.appcompat.view.menu.p$a r0 = r9.f1800p
            if (r0 == 0) goto L_0x0062
            r0.mo2109a(r10)
        L_0x0062:
            r10 = 1
            return r10
        L_0x0064:
            return r1
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: b */
    public void mo2307b(int r2) {
            r1 = this;
            androidx.appcompat.widget.j0 r0 = r1.f1794j
            r0.m2035d(r2)
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: b */
    public void mo2306b(boolean r2) {
            r1 = this;
            androidx.appcompat.view.menu.g r0 = r1.f1789e
            r0.m2424a(r2)
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
            androidx.appcompat.widget.j0 r0 = r1.f1794j
            r0.m2028h(r2)
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: c */
    public void mo2304c(boolean r1) {
            r0 = this;
            r0.f1806v = r1
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519t
    /* renamed from: d */
    public boolean mo2036d() {
            r1 = this;
            boolean r0 = r1.f1802r
            if (r0 != 0) goto L_0x000e
            androidx.appcompat.widget.j0 r0 = r1.f1794j
            boolean r0 = r0.mo2036d()
            if (r0 == 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519t
    public void dismiss() {
            r1 = this;
            boolean r0 = r1.mo2036d()
            if (r0 == 0) goto L_0x000b
            androidx.appcompat.widget.j0 r0 = r1.f1794j
            r0.dismiss()
        L_0x000b:
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519t
    /* renamed from: e */
    public android.widget.ListView mo2034e() {
            r1 = this;
            androidx.appcompat.widget.j0 r0 = r1.f1794j
            android.widget.ListView r0 = r0.mo2034e()
            return r0
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519t
    /* renamed from: f */
    public void mo1833f() {
            r2 = this;
            boolean r0 = r2.m2303i()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "StandardMenuPopup cannot be used without an anchor"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
            r2 = this;
            r0 = 1
            r2.f1802r = r0
            androidx.appcompat.view.menu.h r0 = r2.f1788d
            r0.close()
            android.view.ViewTreeObserver r0 = r2.f1801q
            if (r0 == 0) goto L_0x0024
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L_0x001a
            android.view.View r0 = r2.f1799o
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r2.f1801q = r0
        L_0x001a:
            android.view.ViewTreeObserver r0 = r2.f1801q
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.f1795k
            r0.removeGlobalOnLayoutListener(r1)
            r0 = 0
            r2.f1801q = r0
        L_0x0024:
            android.view.View r0 = r2.f1799o
            android.view.View$OnAttachStateChangeListener r1 = r2.f1796l
            r0.removeOnAttachStateChangeListener(r1)
            android.widget.PopupWindow$OnDismissListener r0 = r2.f1797m
            if (r0 == 0) goto L_0x0032
            r0.onDismiss()
        L_0x0032:
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
