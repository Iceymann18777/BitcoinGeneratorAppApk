package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.m0 */
/* loaded from: classes.dex */
public class C0619m0 extends android.widget.HorizontalScrollView implements android.widget.AdapterView.OnItemSelectedListener {

    /* renamed from: b */
    java.lang.Runnable f2209b;

    /* renamed from: c */
    private androidx.appcompat.widget.C0619m0.View$OnClickListenerC0622c f2210c;

    /* renamed from: d */
    androidx.appcompat.widget.C0593g0 f2211d;

    /* renamed from: e */
    private android.widget.Spinner f2212e;

    /* renamed from: f */
    private boolean f2213f;

    /* renamed from: g */
    int f2214g;

    /* renamed from: h */
    int f2215h;

    /* renamed from: i */
    private int f2216i;

    /* renamed from: j */
    private int f2217j;

    /* renamed from: androidx.appcompat.widget.m0$a */
    /* loaded from: classes.dex */
    class RunnableC0620a implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ android.view.View f2218b;

        /* renamed from: c */
        final /* synthetic */ androidx.appcompat.widget.C0619m0 f2219c;

        RunnableC0620a(androidx.appcompat.widget.C0619m0 r1, android.view.View r2) {
                r0 = this;
                r0.f2219c = r1
                r0.f2218b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.view.View r0 = r3.f2218b
                int r0 = r0.getLeft()
                androidx.appcompat.widget.m0 r1 = r3.f2219c
                int r1 = r1.getWidth()
                android.view.View r2 = r3.f2218b
                int r2 = r2.getWidth()
                int r1 = r1 - r2
                int r1 = r1 / 2
                int r0 = r0 - r1
                androidx.appcompat.widget.m0 r1 = r3.f2219c
                r2 = 0
                r1.smoothScrollTo(r0, r2)
                androidx.appcompat.widget.m0 r0 = r3.f2219c
                r1 = 0
                r0.f2209b = r1
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.m0$b */
    /* loaded from: classes.dex */
    private class C0621b extends android.widget.BaseAdapter {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.widget.C0619m0 f2220b;

        C0621b(androidx.appcompat.widget.C0619m0 r1) {
                r0 = this;
                r0.f2220b = r1
                r0.<init>()
                return
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r1 = this;
                androidx.appcompat.widget.m0 r0 = r1.f2220b
                androidx.appcompat.widget.g0 r0 = r0.f2211d
                int r0 = r0.getChildCount()
                return r0
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int r2) {
                r1 = this;
                androidx.appcompat.widget.m0 r0 = r1.f2220b
                androidx.appcompat.widget.g0 r0 = r0.f2211d
                android.view.View r2 = r0.getChildAt(r2)
                androidx.appcompat.widget.m0$d r2 = (androidx.appcompat.widget.C0619m0.C0623d) r2
                androidx.appcompat.app.a$c r2 = r2.m1958a()
                return r2
        }

        @Override // android.widget.Adapter
        public long getItemId(int r3) {
                r2 = this;
                long r0 = (long) r3
                return r0
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int r1, android.view.View r2, android.view.ViewGroup r3) {
                r0 = this;
                if (r2 != 0) goto L_0x0010
                androidx.appcompat.widget.m0 r2 = r0.f2220b
                java.lang.Object r1 = r0.getItem(r1)
                androidx.appcompat.app.a$c r1 = (androidx.appcompat.app.AbstractC0428a.AbstractC0431c) r1
                r3 = 1
                androidx.appcompat.widget.m0$d r2 = r2.m1962a(r1, r3)
                goto L_0x001c
            L_0x0010:
                r3 = r2
                androidx.appcompat.widget.m0$d r3 = (androidx.appcompat.widget.C0619m0.C0623d) r3
                java.lang.Object r1 = r0.getItem(r1)
                androidx.appcompat.app.a$c r1 = (androidx.appcompat.app.AbstractC0428a.AbstractC0431c) r1
                r3.m1957a(r1)
            L_0x001c:
                return r2
        }
    }

    /* renamed from: androidx.appcompat.widget.m0$c */
    /* loaded from: classes.dex */
    private class View$OnClickListenerC0622c implements android.view.View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.widget.C0619m0 f2221b;

        View$OnClickListenerC0622c(androidx.appcompat.widget.C0619m0 r1) {
                r0 = this;
                r0.f2221b = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r6) {
                r5 = this;
                r0 = r6
                androidx.appcompat.widget.m0$d r0 = (androidx.appcompat.widget.C0619m0.C0623d) r0
                androidx.appcompat.app.a$c r0 = r0.m1958a()
                r0.m2655e()
                androidx.appcompat.widget.m0 r0 = r5.f2221b
                androidx.appcompat.widget.g0 r0 = r0.f2211d
                int r0 = r0.getChildCount()
                r1 = 0
                r2 = 0
            L_0x0014:
                if (r2 >= r0) goto L_0x0029
                androidx.appcompat.widget.m0 r3 = r5.f2221b
                androidx.appcompat.widget.g0 r3 = r3.f2211d
                android.view.View r3 = r3.getChildAt(r2)
                if (r3 != r6) goto L_0x0022
                r4 = 1
                goto L_0x0023
            L_0x0022:
                r4 = 0
            L_0x0023:
                r3.setSelected(r4)
                int r2 = r2 + 1
                goto L_0x0014
            L_0x0029:
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.m0$d */
    /* loaded from: classes.dex */
    private class C0623d extends android.widget.LinearLayout {

        /* renamed from: b */
        private final int[] f2222b;

        /* renamed from: c */
        private androidx.appcompat.app.AbstractC0428a.AbstractC0431c f2223c;

        /* renamed from: d */
        private android.widget.TextView f2224d;

        /* renamed from: e */
        private android.widget.ImageView f2225e;

        /* renamed from: f */
        private android.view.View f2226f;

        /* renamed from: g */
        final /* synthetic */ androidx.appcompat.widget.C0619m0 f2227g;

        public C0623d(androidx.appcompat.widget.C0619m0 r4, android.content.Context r5, androidx.appcompat.app.AbstractC0428a.AbstractC0431c r6, boolean r7) {
                r3 = this;
                r3.f2227g = r4
                int r4 = p000a.p001a.C0000a.actionBarTabStyle
                r0 = 0
                r3.<init>(r5, r0, r4)
                r4 = 1
                int[] r4 = new int[r4]
                r1 = 0
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r4[r1] = r2
                r3.f2222b = r4
                r3.f2223c = r6
                int[] r4 = r3.f2222b
                int r6 = p000a.p001a.C0000a.actionBarTabStyle
                androidx.appcompat.widget.t0 r4 = androidx.appcompat.widget.C0638t0.m1900a(r5, r0, r4, r6, r1)
                boolean r5 = r4.m1889g(r1)
                if (r5 == 0) goto L_0x002a
                android.graphics.drawable.Drawable r5 = r4.m1899b(r1)
                r3.setBackgroundDrawable(r5)
            L_0x002a:
                r4.m1908a()
                if (r7 == 0) goto L_0x0035
                r4 = 8388627(0x800013, float:1.175497E-38)
                r3.setGravity(r4)
            L_0x0035:
                r3.m1956b()
                return
        }

        /* renamed from: a */
        public androidx.appcompat.app.AbstractC0428a.AbstractC0431c m1958a() {
                r1 = this;
                androidx.appcompat.app.a$c r0 = r1.f2223c
                return r0
        }

        /* renamed from: a */
        public void m1957a(androidx.appcompat.app.AbstractC0428a.AbstractC0431c r1) {
                r0 = this;
                r0.f2223c = r1
                r0.m1956b()
                return
        }

        /* renamed from: b */
        public void m1956b() {
                r10 = this;
                androidx.appcompat.app.a$c r0 = r10.f2223c
                android.view.View r1 = r0.m2658b()
                r2 = 8
                r3 = 0
                if (r1 == 0) goto L_0x0032
                android.view.ViewParent r0 = r1.getParent()
                if (r0 == r10) goto L_0x001b
                if (r0 == 0) goto L_0x0018
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                r0.removeView(r1)
            L_0x0018:
                r10.addView(r1)
            L_0x001b:
                r10.f2226f = r1
                android.widget.TextView r0 = r10.f2224d
                if (r0 == 0) goto L_0x0024
                r0.setVisibility(r2)
            L_0x0024:
                android.widget.ImageView r0 = r10.f2225e
                if (r0 == 0) goto L_0x00d3
                r0.setVisibility(r2)
                android.widget.ImageView r0 = r10.f2225e
                r0.setImageDrawable(r3)
                goto L_0x00d3
            L_0x0032:
                android.view.View r1 = r10.f2226f
                if (r1 == 0) goto L_0x003b
                r10.removeView(r1)
                r10.f2226f = r3
            L_0x003b:
                android.graphics.drawable.Drawable r1 = r0.m2657c()
                java.lang.CharSequence r4 = r0.m2656d()
                r5 = 16
                r6 = 0
                r7 = -2
                if (r1 == 0) goto L_0x0070
                android.widget.ImageView r8 = r10.f2225e
                if (r8 != 0) goto L_0x0065
                androidx.appcompat.widget.o r8 = new androidx.appcompat.widget.o
                android.content.Context r9 = r10.getContext()
                r8.<init>(r9)
                android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
                r9.<init>(r7, r7)
                r9.gravity = r5
                r8.setLayoutParams(r9)
                r10.addView(r8, r6)
                r10.f2225e = r8
            L_0x0065:
                android.widget.ImageView r8 = r10.f2225e
                r8.setImageDrawable(r1)
                android.widget.ImageView r1 = r10.f2225e
                r1.setVisibility(r6)
                goto L_0x007c
            L_0x0070:
                android.widget.ImageView r1 = r10.f2225e
                if (r1 == 0) goto L_0x007c
                r1.setVisibility(r2)
                android.widget.ImageView r1 = r10.f2225e
                r1.setImageDrawable(r3)
            L_0x007c:
                boolean r1 = android.text.TextUtils.isEmpty(r4)
                r1 = r1 ^ 1
                if (r1 == 0) goto L_0x00b2
                android.widget.TextView r2 = r10.f2224d
                if (r2 != 0) goto L_0x00a7
                androidx.appcompat.widget.y r2 = new androidx.appcompat.widget.y
                android.content.Context r8 = r10.getContext()
                int r9 = p000a.p001a.C0000a.actionBarTabTextStyle
                r2.<init>(r8, r3, r9)
                android.text.TextUtils$TruncateAt r8 = android.text.TextUtils.TruncateAt.END
                r2.setEllipsize(r8)
                android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
                r8.<init>(r7, r7)
                r8.gravity = r5
                r2.setLayoutParams(r8)
                r10.addView(r2)
                r10.f2224d = r2
            L_0x00a7:
                android.widget.TextView r2 = r10.f2224d
                r2.setText(r4)
                android.widget.TextView r2 = r10.f2224d
                r2.setVisibility(r6)
                goto L_0x00be
            L_0x00b2:
                android.widget.TextView r4 = r10.f2224d
                if (r4 == 0) goto L_0x00be
                r4.setVisibility(r2)
                android.widget.TextView r2 = r10.f2224d
                r2.setText(r3)
            L_0x00be:
                android.widget.ImageView r2 = r10.f2225e
                if (r2 == 0) goto L_0x00c9
                java.lang.CharSequence r4 = r0.m2659a()
                r2.setContentDescription(r4)
            L_0x00c9:
                if (r1 == 0) goto L_0x00cc
                goto L_0x00d0
            L_0x00cc:
                java.lang.CharSequence r3 = r0.m2659a()
            L_0x00d0:
                androidx.appcompat.widget.C0644v0.m1841a(r10, r3)
            L_0x00d3:
                return
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
                r1 = this;
                super.onInitializeAccessibilityEvent(r2)
                java.lang.Class<androidx.appcompat.app.a$c> r0 = androidx.appcompat.app.AbstractC0428a.AbstractC0431c.class
                java.lang.String r0 = r0.getName()
                r2.setClassName(r0)
                return
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
                r1 = this;
                super.onInitializeAccessibilityNodeInfo(r2)
                java.lang.Class<androidx.appcompat.app.a$c> r0 = androidx.appcompat.app.AbstractC0428a.AbstractC0431c.class
                java.lang.String r0 = r0.getName()
                r2.setClassName(r0)
                return
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int r2, int r3) {
                r1 = this;
                super.onMeasure(r2, r3)
                androidx.appcompat.widget.m0 r2 = r1.f2227g
                int r2 = r2.f2214g
                if (r2 <= 0) goto L_0x001c
                int r2 = r1.getMeasuredWidth()
                androidx.appcompat.widget.m0 r0 = r1.f2227g
                int r0 = r0.f2214g
                if (r2 <= r0) goto L_0x001c
                r2 = 1073741824(0x40000000, float:2.0)
                int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
                super.onMeasure(r2, r3)
            L_0x001c:
                return
        }

        @Override // android.view.View
        public void setSelected(boolean r2) {
                r1 = this;
                boolean r0 = r1.isSelected()
                if (r0 == r2) goto L_0x0008
                r0 = 1
                goto L_0x0009
            L_0x0008:
                r0 = 0
            L_0x0009:
                super.setSelected(r2)
                if (r0 == 0) goto L_0x0014
                if (r2 == 0) goto L_0x0014
                r2 = 4
                r1.sendAccessibilityEvent(r2)
            L_0x0014:
                return
        }
    }

    static {
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            return
    }

    /* renamed from: a */
    private android.widget.Spinner m1964a() {
            r4 = this;
            androidx.appcompat.widget.w r0 = new androidx.appcompat.widget.w
            android.content.Context r1 = r4.getContext()
            int r2 = p000a.p001a.C0000a.actionDropDownStyle
            r3 = 0
            r0.<init>(r1, r3, r2)
            androidx.appcompat.widget.g0$a r1 = new androidx.appcompat.widget.g0$a
            r2 = -2
            r3 = -1
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
            r0.setOnItemSelectedListener(r4)
            return r0
    }

    /* renamed from: b */
    private boolean m1961b() {
            r1 = this;
            android.widget.Spinner r0 = r1.f2212e
            if (r0 == 0) goto L_0x000c
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != r1) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            return r0
    }

    /* renamed from: c */
    private void m1960c() {
            r4 = this;
            boolean r0 = r4.m1961b()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            android.widget.Spinner r0 = r4.f2212e
            if (r0 != 0) goto L_0x0011
            android.widget.Spinner r0 = r4.m1964a()
            r4.f2212e = r0
        L_0x0011:
            androidx.appcompat.widget.g0 r0 = r4.f2211d
            r4.removeView(r0)
            android.widget.Spinner r0 = r4.f2212e
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r3 = -1
            r1.<init>(r2, r3)
            r4.addView(r0, r1)
            android.widget.Spinner r0 = r4.f2212e
            android.widget.SpinnerAdapter r0 = r0.getAdapter()
            if (r0 != 0) goto L_0x0034
            android.widget.Spinner r0 = r4.f2212e
            androidx.appcompat.widget.m0$b r1 = new androidx.appcompat.widget.m0$b
            r1.<init>(r4)
            r0.setAdapter(r1)
        L_0x0034:
            java.lang.Runnable r0 = r4.f2209b
            if (r0 == 0) goto L_0x003e
            r4.removeCallbacks(r0)
            r0 = 0
            r4.f2209b = r0
        L_0x003e:
            android.widget.Spinner r0 = r4.f2212e
            int r1 = r4.f2217j
            r0.setSelection(r1)
            return
    }

    /* renamed from: d */
    private boolean m1959d() {
            r5 = this;
            boolean r0 = r5.m1961b()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.widget.Spinner r0 = r5.f2212e
            r5.removeView(r0)
            androidx.appcompat.widget.g0 r0 = r5.f2211d
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r3 = -2
            r4 = -1
            r2.<init>(r3, r4)
            r5.addView(r0, r2)
            android.widget.Spinner r0 = r5.f2212e
            int r0 = r0.getSelectedItemPosition()
            r5.setTabSelected(r0)
            return r1
    }

    /* renamed from: a */
    androidx.appcompat.widget.C0619m0.C0623d m1962a(androidx.appcompat.app.AbstractC0428a.AbstractC0431c r3, boolean r4) {
            r2 = this;
            androidx.appcompat.widget.m0$d r0 = new androidx.appcompat.widget.m0$d
            android.content.Context r1 = r2.getContext()
            r0.<init>(r2, r1, r3, r4)
            if (r4 == 0) goto L_0x001b
            r3 = 0
            r0.setBackgroundDrawable(r3)
            android.widget.AbsListView$LayoutParams r3 = new android.widget.AbsListView$LayoutParams
            r4 = -1
            int r1 = r2.f2216i
            r3.<init>(r4, r1)
            r0.setLayoutParams(r3)
            goto L_0x002f
        L_0x001b:
            r3 = 1
            r0.setFocusable(r3)
            androidx.appcompat.widget.m0$c r3 = r2.f2210c
            if (r3 != 0) goto L_0x002a
            androidx.appcompat.widget.m0$c r3 = new androidx.appcompat.widget.m0$c
            r3.<init>(r2)
            r2.f2210c = r3
        L_0x002a:
            androidx.appcompat.widget.m0$c r3 = r2.f2210c
            r0.setOnClickListener(r3)
        L_0x002f:
            return r0
    }

    /* renamed from: a */
    public void m1963a(int r2) {
            r1 = this;
            androidx.appcompat.widget.g0 r0 = r1.f2211d
            android.view.View r2 = r0.getChildAt(r2)
            java.lang.Runnable r0 = r1.f2209b
            if (r0 == 0) goto L_0x000d
            r1.removeCallbacks(r0)
        L_0x000d:
            androidx.appcompat.widget.m0$a r0 = new androidx.appcompat.widget.m0$a
            r0.<init>(r1, r2)
            r1.f2209b = r0
            java.lang.Runnable r2 = r1.f2209b
            r1.post(r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            java.lang.Runnable r0 = r1.f2209b
            if (r0 == 0) goto L_0x000a
            r1.post(r0)
        L_0x000a:
            return
    }

    @Override // android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            android.content.Context r2 = r1.getContext()
            a.a.m.a r2 = p000a.p001a.p006m.C0028a.m4185a(r2)
            int r0 = r2.m4181e()
            r1.setContentHeight(r0)
            int r2 = r2.m4182d()
            r1.f2215h = r2
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            java.lang.Runnable r0 = r1.f2209b
            if (r0 == 0) goto L_0x000a
            r1.removeCallbacks(r0)
        L_0x000a:
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            androidx.appcompat.widget.m0$d r2 = (androidx.appcompat.widget.C0619m0.C0623d) r2
            androidx.appcompat.app.a$c r1 = r2.m1958a()
            r1.m2655e()
            return
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int r7, int r8) {
            r6 = this;
            int r8 = android.view.View.MeasureSpec.getMode(r7)
            r0 = 1
            r1 = 0
            r2 = 1073741824(0x40000000, float:2.0)
            if (r8 != r2) goto L_0x000c
            r3 = 1
            goto L_0x000d
        L_0x000c:
            r3 = 0
        L_0x000d:
            r6.setFillViewport(r3)
            androidx.appcompat.widget.g0 r4 = r6.f2211d
            int r4 = r4.getChildCount()
            if (r4 <= r0) goto L_0x003f
            if (r8 == r2) goto L_0x001e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 != r5) goto L_0x003f
        L_0x001e:
            r8 = 2
            if (r4 <= r8) goto L_0x002f
            int r8 = android.view.View.MeasureSpec.getSize(r7)
            float r8 = (float) r8
            r4 = 1053609165(0x3ecccccd, float:0.4)
            float r8 = r8 * r4
            int r8 = (int) r8
            r6.f2214g = r8
            goto L_0x0036
        L_0x002f:
            int r4 = android.view.View.MeasureSpec.getSize(r7)
            int r4 = r4 / r8
            r6.f2214g = r4
        L_0x0036:
            int r8 = r6.f2214g
            int r4 = r6.f2215h
            int r8 = java.lang.Math.min(r8, r4)
            goto L_0x0040
        L_0x003f:
            r8 = -1
        L_0x0040:
            r6.f2214g = r8
            int r8 = r6.f2216i
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r2)
            if (r3 != 0) goto L_0x004f
            boolean r2 = r6.f2213f
            if (r2 == 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            if (r0 == 0) goto L_0x0067
            androidx.appcompat.widget.g0 r0 = r6.f2211d
            r0.measure(r1, r8)
            androidx.appcompat.widget.g0 r0 = r6.f2211d
            int r0 = r0.getMeasuredWidth()
            int r1 = android.view.View.MeasureSpec.getSize(r7)
            if (r0 <= r1) goto L_0x0067
            r6.m1960c()
            goto L_0x006a
        L_0x0067:
            r6.m1959d()
        L_0x006a:
            int r0 = r6.getMeasuredWidth()
            super.onMeasure(r7, r8)
            int r7 = r6.getMeasuredWidth()
            if (r3 == 0) goto L_0x007e
            if (r0 == r7) goto L_0x007e
            int r7 = r6.f2217j
            r6.setTabSelected(r7)
        L_0x007e:
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView<?> r1) {
            r0 = this;
            return
    }

    public void setAllowCollapse(boolean r1) {
            r0 = this;
            r0.f2213f = r1
            return
    }

    public void setContentHeight(int r1) {
            r0 = this;
            r0.f2216i = r1
            r0.requestLayout()
            return
    }

    public void setTabSelected(int r6) {
            r5 = this;
            r5.f2217j = r6
            androidx.appcompat.widget.g0 r0 = r5.f2211d
            int r0 = r0.getChildCount()
            r1 = 0
            r2 = 0
        L_0x000a:
            if (r2 >= r0) goto L_0x0022
            androidx.appcompat.widget.g0 r3 = r5.f2211d
            android.view.View r3 = r3.getChildAt(r2)
            if (r2 != r6) goto L_0x0016
            r4 = 1
            goto L_0x0017
        L_0x0016:
            r4 = 0
        L_0x0017:
            r3.setSelected(r4)
            if (r4 == 0) goto L_0x001f
            r5.m1963a(r6)
        L_0x001f:
            int r2 = r2 + 1
            goto L_0x000a
        L_0x0022:
            android.widget.Spinner r0 = r5.f2212e
            if (r0 == 0) goto L_0x002b
            if (r6 < 0) goto L_0x002b
            r0.setSelection(r6)
        L_0x002b:
            return
    }
}
