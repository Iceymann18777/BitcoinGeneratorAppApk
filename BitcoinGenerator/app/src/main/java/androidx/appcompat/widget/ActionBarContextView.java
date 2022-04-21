package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.AbstractC0564a {

    /* renamed from: j */
    private java.lang.CharSequence f1821j;

    /* renamed from: k */
    private java.lang.CharSequence f1822k;

    /* renamed from: l */
    private android.view.View f1823l;

    /* renamed from: m */
    private android.view.View f1824m;

    /* renamed from: n */
    private android.widget.LinearLayout f1825n;

    /* renamed from: o */
    private android.widget.TextView f1826o;

    /* renamed from: p */
    private android.widget.TextView f1827p;

    /* renamed from: q */
    private int f1828q;

    /* renamed from: r */
    private int f1829r;

    /* renamed from: s */
    private boolean f1830s;

    /* renamed from: t */
    private int f1831t;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    /* loaded from: classes.dex */
    class View$OnClickListenerC0525a implements android.view.View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ p000a.p001a.p006m.AbstractC0029b f1832b;

        View$OnClickListenerC0525a(androidx.appcompat.widget.ActionBarContextView r1, p000a.p001a.p006m.AbstractC0029b r2) {
                r0 = this;
                r0.f1832b = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                a.a.m.b r1 = r0.f1832b
                r1.mo2472a()
                return
        }
    }

    public ActionBarContextView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionBarContextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = p000a.p001a.C0000a.actionModeStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public ActionBarContextView(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            int[] r0 = p000a.p001a.C0009j.ActionMode
            r1 = 0
            androidx.appcompat.widget.t0 r3 = androidx.appcompat.widget.C0638t0.m1900a(r3, r4, r0, r5, r1)
            int r4 = p000a.p001a.C0009j.ActionMode_background
            android.graphics.drawable.Drawable r4 = r3.m1899b(r4)
            p000a.p018g.p029l.C0216r.m3434a(r2, r4)
            int r4 = p000a.p001a.C0009j.ActionMode_titleTextStyle
            int r4 = r3.m1888g(r4, r1)
            r2.f1828q = r4
            int r4 = p000a.p001a.C0009j.ActionMode_subtitleTextStyle
            int r4 = r3.m1888g(r4, r1)
            r2.f1829r = r4
            int r4 = p000a.p001a.C0009j.ActionMode_height
            int r4 = r3.m1890f(r4, r1)
            r2.f2032f = r4
            int r4 = p000a.p001a.C0009j.ActionMode_closeItemLayout
            int r5 = p000a.p001a.C0006g.abc_action_mode_close_item_material
            int r4 = r3.m1888g(r4, r5)
            r2.f1831t = r4
            r3.m1908a()
            return
    }

    /* renamed from: e */
    private void m2284e() {
            r6 = this;
            android.widget.LinearLayout r0 = r6.f1825n
            if (r0 != 0) goto L_0x0055
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = p000a.p001a.C0006g.abc_action_bar_title_item
            r0.inflate(r1, r6)
            int r0 = r6.getChildCount()
            int r0 = r0 + (-1)
            android.view.View r0 = r6.getChildAt(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r6.f1825n = r0
            android.widget.LinearLayout r0 = r6.f1825n
            int r1 = p000a.p001a.C0005f.action_bar_title
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.f1826o = r0
            android.widget.LinearLayout r0 = r6.f1825n
            int r1 = p000a.p001a.C0005f.action_bar_subtitle
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.f1827p = r0
            int r0 = r6.f1828q
            if (r0 == 0) goto L_0x0046
            android.widget.TextView r0 = r6.f1826o
            android.content.Context r1 = r6.getContext()
            int r2 = r6.f1828q
            r0.setTextAppearance(r1, r2)
        L_0x0046:
            int r0 = r6.f1829r
            if (r0 == 0) goto L_0x0055
            android.widget.TextView r0 = r6.f1827p
            android.content.Context r1 = r6.getContext()
            int r2 = r6.f1829r
            r0.setTextAppearance(r1, r2)
        L_0x0055:
            android.widget.TextView r0 = r6.f1826o
            java.lang.CharSequence r1 = r6.f1821j
            r0.setText(r1)
            android.widget.TextView r0 = r6.f1827p
            java.lang.CharSequence r1 = r6.f1822k
            r0.setText(r1)
            java.lang.CharSequence r0 = r6.f1821j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            java.lang.CharSequence r1 = r6.f1822k
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r1 = r1 ^ 1
            android.widget.TextView r2 = r6.f1827p
            r3 = 0
            r4 = 8
            if (r1 == 0) goto L_0x007c
            r5 = 0
            goto L_0x007e
        L_0x007c:
            r5 = 8
        L_0x007e:
            r2.setVisibility(r5)
            android.widget.LinearLayout r2 = r6.f1825n
            if (r0 != 0) goto L_0x008a
            if (r1 == 0) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            r3 = 8
        L_0x008a:
            r2.setVisibility(r3)
            android.widget.LinearLayout r0 = r6.f1825n
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x009a
            android.widget.LinearLayout r0 = r6.f1825n
            r6.addView(r0)
        L_0x009a:
            return
    }

    /* renamed from: a */
    public void m2289a() {
            r1 = this;
            android.view.View r0 = r1.f1823l
            if (r0 != 0) goto L_0x0007
            r1.m2286c()
        L_0x0007:
            return
    }

    /* renamed from: a */
    public void m2288a(p000a.p001a.p006m.AbstractC0029b r4) {
            r3 = this;
            android.view.View r0 = r3.f1823l
            if (r0 != 0) goto L_0x001b
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f1831t
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f1823l = r0
        L_0x0015:
            android.view.View r0 = r3.f1823l
            r3.addView(r0)
            goto L_0x0022
        L_0x001b:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0022
            goto L_0x0015
        L_0x0022:
            android.view.View r0 = r3.f1823l
            int r1 = p000a.p001a.C0005f.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r3, r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.mo2464c()
            androidx.appcompat.view.menu.h r4 = (androidx.appcompat.view.menu.C0496h) r4
            androidx.appcompat.widget.c r0 = r3.f2031e
            if (r0 == 0) goto L_0x003f
            r0.m2122e()
        L_0x003f:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f2031e = r0
            androidx.appcompat.widget.c r0 = r3.f2031e
            r1 = 1
            r0.m2124c(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.c r1 = r3.f2031e
            android.content.Context r2 = r3.f2029c
            r4.m2407a(r1, r2)
            androidx.appcompat.widget.c r4 = r3.f2031e
            androidx.appcompat.view.menu.q r4 = r4.mo2128b(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f2030d = r4
            androidx.appcompat.widget.ActionMenuView r4 = r3.f2030d
            r1 = 0
            p000a.p018g.p029l.C0216r.m3434a(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f2030d
            r3.addView(r4, r0)
            return
    }

    /* renamed from: b */
    public boolean m2287b() {
            r1 = this;
            boolean r0 = r1.f1830s
            return r0
    }

    /* renamed from: c */
    public void m2286c() {
            r1 = this;
            r1.removeAllViews()
            r0 = 0
            r1.f1824m = r0
            r1.f2030d = r0
            return
    }

    /* renamed from: d */
    public boolean m2285d() {
            r1 = this;
            androidx.appcompat.widget.c r0 = r1.f2031e
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.m2114k()
            return r0
        L_0x0009:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // androidx.appcompat.widget.AbstractC0564a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
            r1 = this;
            int r0 = super.getAnimatedVisibility()
            return r0
    }

    @Override // androidx.appcompat.widget.AbstractC0564a
    public /* bridge */ /* synthetic */ int getContentHeight() {
            r1 = this;
            int r0 = super.getContentHeight()
            return r0
    }

    public java.lang.CharSequence getSubtitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f1822k
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f1821j
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            androidx.appcompat.widget.c r0 = r1.f2031e
            if (r0 == 0) goto L_0x000f
            r0.m2118g()
            androidx.appcompat.widget.c r0 = r1.f2031e
            r0.m2117h()
        L_0x000f:
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r3) {
            r2 = this;
            int r0 = r3.getEventType()
            r1 = 32
            if (r0 != r1) goto L_0x0025
            r3.setSource(r2)
            java.lang.Class<androidx.appcompat.widget.ActionBarContextView> r0 = androidx.appcompat.widget.ActionBarContextView.class
            java.lang.String r0 = r0.getName()
            r3.setClassName(r0)
            android.content.Context r0 = r2.getContext()
            java.lang.String r0 = r0.getPackageName()
            r3.setPackageName(r0)
            java.lang.CharSequence r0 = r2.f1821j
            r3.setContentDescription(r0)
            goto L_0x0028
        L_0x0025:
            super.onInitializeAccessibilityEvent(r3)
        L_0x0028:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
            r9 = this;
            boolean r10 = androidx.appcompat.widget.C0661z0.m1764a(r9)
            if (r10 == 0) goto L_0x000e
            int r0 = r13 - r11
            int r1 = r9.getPaddingRight()
            int r0 = r0 - r1
            goto L_0x0012
        L_0x000e:
            int r0 = r9.getPaddingLeft()
        L_0x0012:
            int r6 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r12 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r12 = r9.getPaddingBottom()
            int r12 = r14 - r12
            android.view.View r14 = r9.f1823l
            r7 = 8
            if (r14 == 0) goto L_0x0059
            int r14 = r14.getVisibility()
            if (r14 == r7) goto L_0x0059
            android.view.View r14 = r9.f1823l
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r14 = (android.view.ViewGroup.MarginLayoutParams) r14
            if (r10 == 0) goto L_0x003b
            int r1 = r14.rightMargin
            goto L_0x003d
        L_0x003b:
            int r1 = r14.leftMargin
        L_0x003d:
            if (r10 == 0) goto L_0x0042
            int r14 = r14.leftMargin
            goto L_0x0044
        L_0x0042:
            int r14 = r14.rightMargin
        L_0x0044:
            int r8 = androidx.appcompat.widget.AbstractC0564a.m2154a(r0, r1, r10)
            android.view.View r1 = r9.f1823l
            r0 = r9
            r2 = r8
            r3 = r6
            r4 = r12
            r5 = r10
            int r0 = r0.m2151a(r1, r2, r3, r4, r5)
            int r8 = r8 + r0
            int r14 = androidx.appcompat.widget.AbstractC0564a.m2154a(r8, r14, r10)
            goto L_0x005a
        L_0x0059:
            r14 = r0
        L_0x005a:
            android.widget.LinearLayout r0 = r9.f1825n
            if (r0 == 0) goto L_0x0074
            android.view.View r1 = r9.f1824m
            if (r1 != 0) goto L_0x0074
            int r0 = r0.getVisibility()
            if (r0 == r7) goto L_0x0074
            android.widget.LinearLayout r1 = r9.f1825n
            r0 = r9
            r2 = r14
            r3 = r6
            r4 = r12
            r5 = r10
            int r0 = r0.m2151a(r1, r2, r3, r4, r5)
            int r14 = r14 + r0
        L_0x0074:
            r2 = r14
            android.view.View r1 = r9.f1824m
            if (r1 == 0) goto L_0x0080
            r0 = r9
            r3 = r6
            r4 = r12
            r5 = r10
            r0.m2151a(r1, r2, r3, r4, r5)
        L_0x0080:
            if (r10 == 0) goto L_0x0088
            int r11 = r9.getPaddingLeft()
            r3 = r11
            goto L_0x008f
        L_0x0088:
            int r13 = r13 - r11
            int r11 = r9.getPaddingRight()
            int r13 = r13 - r11
            r3 = r13
        L_0x008f:
            androidx.appcompat.widget.ActionMenuView r2 = r9.f2030d
            if (r2 == 0) goto L_0x009c
            r10 = r10 ^ 1
            r1 = r9
            r4 = r6
            r5 = r12
            r6 = r10
            r1.m2151a(r2, r3, r4, r5, r6)
        L_0x009c:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r11, int r12) {
            r10 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r11)
            java.lang.String r1 = " can only be used "
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x010b
            int r0 = android.view.View.MeasureSpec.getMode(r12)
            if (r0 == 0) goto L_0x00eb
            int r11 = android.view.View.MeasureSpec.getSize(r11)
            int r0 = r10.f2032f
            if (r0 <= 0) goto L_0x0019
            goto L_0x001d
        L_0x0019:
            int r0 = android.view.View.MeasureSpec.getSize(r12)
        L_0x001d:
            int r12 = r10.getPaddingTop()
            int r1 = r10.getPaddingBottom()
            int r12 = r12 + r1
            int r1 = r10.getPaddingLeft()
            int r1 = r11 - r1
            int r3 = r10.getPaddingRight()
            int r1 = r1 - r3
            int r3 = r0 - r12
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4)
            android.view.View r6 = r10.f1823l
            r7 = 0
            if (r6 == 0) goto L_0x0050
            int r1 = r10.m2152a(r6, r1, r5, r7)
            android.view.View r6 = r10.f1823l
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r8 = r6.leftMargin
            int r6 = r6.rightMargin
            int r8 = r8 + r6
            int r1 = r1 - r8
        L_0x0050:
            androidx.appcompat.widget.ActionMenuView r6 = r10.f2030d
            if (r6 == 0) goto L_0x0060
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != r10) goto L_0x0060
            androidx.appcompat.widget.ActionMenuView r6 = r10.f2030d
            int r1 = r10.m2152a(r6, r1, r5, r7)
        L_0x0060:
            android.widget.LinearLayout r6 = r10.f1825n
            if (r6 == 0) goto L_0x0093
            android.view.View r8 = r10.f1824m
            if (r8 != 0) goto L_0x0093
            boolean r8 = r10.f1830s
            if (r8 == 0) goto L_0x008f
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r7)
            android.widget.LinearLayout r8 = r10.f1825n
            r8.measure(r6, r5)
            android.widget.LinearLayout r5 = r10.f1825n
            int r5 = r5.getMeasuredWidth()
            if (r5 > r1) goto L_0x007f
            r6 = 1
            goto L_0x0080
        L_0x007f:
            r6 = 0
        L_0x0080:
            if (r6 == 0) goto L_0x0083
            int r1 = r1 - r5
        L_0x0083:
            android.widget.LinearLayout r5 = r10.f1825n
            if (r6 == 0) goto L_0x0089
            r6 = 0
            goto L_0x008b
        L_0x0089:
            r6 = 8
        L_0x008b:
            r5.setVisibility(r6)
            goto L_0x0093
        L_0x008f:
            int r1 = r10.m2152a(r6, r1, r5, r7)
        L_0x0093:
            android.view.View r5 = r10.f1824m
            if (r5 == 0) goto L_0x00c9
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            int r6 = r5.width
            r8 = -2
            if (r6 == r8) goto L_0x00a3
            r6 = 1073741824(0x40000000, float:2.0)
            goto L_0x00a5
        L_0x00a3:
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00a5:
            int r9 = r5.width
            if (r9 < 0) goto L_0x00ad
            int r1 = java.lang.Math.min(r9, r1)
        L_0x00ad:
            int r9 = r5.height
            if (r9 == r8) goto L_0x00b2
            goto L_0x00b4
        L_0x00b2:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00b4:
            int r4 = r5.height
            if (r4 < 0) goto L_0x00bc
            int r3 = java.lang.Math.min(r4, r3)
        L_0x00bc:
            android.view.View r4 = r10.f1824m
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r4.measure(r1, r2)
        L_0x00c9:
            int r1 = r10.f2032f
            if (r1 > 0) goto L_0x00e7
            int r0 = r10.getChildCount()
            r1 = 0
        L_0x00d2:
            if (r7 >= r0) goto L_0x00e3
            android.view.View r2 = r10.getChildAt(r7)
            int r2 = r2.getMeasuredHeight()
            int r2 = r2 + r12
            if (r2 <= r1) goto L_0x00e0
            r1 = r2
        L_0x00e0:
            int r7 = r7 + 1
            goto L_0x00d2
        L_0x00e3:
            r10.setMeasuredDimension(r11, r1)
            goto L_0x00ea
        L_0x00e7:
            r10.setMeasuredDimension(r11, r0)
        L_0x00ea:
            return
        L_0x00eb:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.Class<androidx.appcompat.widget.ActionBarContextView> r0 = androidx.appcompat.widget.ActionBarContextView.class
            java.lang.String r0 = r0.getSimpleName()
            r12.append(r0)
            r12.append(r1)
            java.lang.String r0 = "with android:layout_height=\"wrap_content\""
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x010b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.Class<androidx.appcompat.widget.ActionBarContextView> r0 = androidx.appcompat.widget.ActionBarContextView.class
            java.lang.String r0 = r0.getSimpleName()
            r12.append(r0)
            r12.append(r1)
            java.lang.String r0 = "with android:layout_width=\"match_parent\" (or fill_parent)"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            goto L_0x012c
        L_0x012b:
            throw r11
        L_0x012c:
            goto L_0x012b
    }

    @Override // androidx.appcompat.widget.AbstractC0564a
    public void setContentHeight(int r1) {
            r0 = this;
            r0.f2032f = r1
            return
    }

    public void setCustomView(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.f1824m
            if (r0 == 0) goto L_0x0007
            r1.removeView(r0)
        L_0x0007:
            r1.f1824m = r2
            if (r2 == 0) goto L_0x0015
            android.widget.LinearLayout r0 = r1.f1825n
            if (r0 == 0) goto L_0x0015
            r1.removeView(r0)
            r0 = 0
            r1.f1825n = r0
        L_0x0015:
            if (r2 == 0) goto L_0x001a
            r1.addView(r2)
        L_0x001a:
            r1.requestLayout()
            return
    }

    public void setSubtitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.f1822k = r1
            r0.m2284e()
            return
    }

    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.f1821j = r1
            r0.m2284e()
            return
    }

    public void setTitleOptional(boolean r2) {
            r1 = this;
            boolean r0 = r1.f1830s
            if (r2 == r0) goto L_0x0007
            r1.requestLayout()
        L_0x0007:
            r1.f1830s = r2
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0564a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int r1) {
            r0 = this;
            super.setVisibility(r1)
            return
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }
}
