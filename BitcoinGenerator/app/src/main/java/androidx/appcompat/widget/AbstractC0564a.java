package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.a */
/* loaded from: classes.dex */
abstract class AbstractC0564a extends android.view.ViewGroup {

    /* renamed from: b */
    protected final androidx.appcompat.widget.AbstractC0564a.C0565a f2028b;

    /* renamed from: c */
    protected final android.content.Context f2029c;

    /* renamed from: d */
    protected androidx.appcompat.widget.ActionMenuView f2030d;

    /* renamed from: e */
    protected androidx.appcompat.widget.C0570c f2031e;

    /* renamed from: f */
    protected int f2032f;

    /* renamed from: g */
    protected p000a.p018g.p029l.C0223v f2033g;

    /* renamed from: h */
    private boolean f2034h;

    /* renamed from: i */
    private boolean f2035i;

    /* renamed from: androidx.appcompat.widget.a$a */
    /* loaded from: classes.dex */
    protected class C0565a implements p000a.p018g.p029l.AbstractC0227w {

        /* renamed from: a */
        private boolean f2036a;

        /* renamed from: b */
        int f2037b;

        /* renamed from: c */
        final /* synthetic */ androidx.appcompat.widget.AbstractC0564a f2038c;

        protected C0565a(androidx.appcompat.widget.AbstractC0564a r1) {
                r0 = this;
                r0.f2038c = r1
                r0.<init>()
                r1 = 0
                r0.f2036a = r1
                return
        }

        /* renamed from: a */
        public androidx.appcompat.widget.AbstractC0564a.C0565a m2148a(p000a.p018g.p029l.C0223v r2, int r3) {
                r1 = this;
                androidx.appcompat.widget.a r0 = r1.f2038c
                r0.f2033g = r2
                r1.f2037b = r3
                return r1
        }

        @Override // p000a.p018g.p029l.AbstractC0227w
        /* renamed from: a */
        public void mo1850a(android.view.View r2) {
                r1 = this;
                boolean r2 = r1.f2036a
                if (r2 == 0) goto L_0x0005
                return
            L_0x0005:
                androidx.appcompat.widget.a r2 = r1.f2038c
                r0 = 0
                r2.f2033g = r0
                int r0 = r1.f2037b
                androidx.appcompat.widget.AbstractC0564a.m2149b(r2, r0)
                return
        }

        @Override // p000a.p018g.p029l.AbstractC0227w
        /* renamed from: b */
        public void mo1849b(android.view.View r2) {
                r1 = this;
                androidx.appcompat.widget.a r2 = r1.f2038c
                r0 = 0
                androidx.appcompat.widget.AbstractC0564a.m2150a(r2, r0)
                r1.f2036a = r0
                return
        }

        @Override // p000a.p018g.p029l.AbstractC0227w
        /* renamed from: c */
        public void mo1848c(android.view.View r1) {
                r0 = this;
                r1 = 1
                r0.f2036a = r1
                return
        }
    }

    AbstractC0564a(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    AbstractC0564a(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    AbstractC0564a(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            androidx.appcompat.widget.a$a r4 = new androidx.appcompat.widget.a$a
            r4.<init>(r2)
            r2.f2028b = r4
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources$Theme r5 = r3.getTheme()
            int r0 = p000a.p001a.C0000a.actionBarPopupTheme
            r1 = 1
            boolean r5 = r5.resolveAttribute(r0, r4, r1)
            if (r5 == 0) goto L_0x0028
            int r4 = r4.resourceId
            if (r4 == 0) goto L_0x0028
            android.view.ContextThemeWrapper r5 = new android.view.ContextThemeWrapper
            r5.<init>(r3, r4)
            r2.f2029c = r5
            goto L_0x002a
        L_0x0028:
            r2.f2029c = r3
        L_0x002a:
            return
    }

    /* renamed from: a */
    protected static int m2154a(int r0, int r1, boolean r2) {
            if (r2 == 0) goto L_0x0004
            int r0 = r0 - r1
            goto L_0x0005
        L_0x0004:
            int r0 = r0 + r1
        L_0x0005:
            return r0
    }

    /* renamed from: a */
    static /* synthetic */ void m2150a(androidx.appcompat.widget.AbstractC0564a r0, int r1) {
            super.setVisibility(r1)
            return
    }

    /* renamed from: b */
    static /* synthetic */ void m2149b(androidx.appcompat.widget.AbstractC0564a r0, int r1) {
            super.setVisibility(r1)
            return
    }

    /* renamed from: a */
    protected int m2152a(android.view.View r2, int r3, int r4, int r5) {
            r1 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            r2.measure(r0, r4)
            int r2 = r2.getMeasuredWidth()
            int r3 = r3 - r2
            int r3 = r3 - r5
            r2 = 0
            int r2 = java.lang.Math.max(r2, r3)
            return r2
    }

    /* renamed from: a */
    protected int m2151a(android.view.View r3, int r4, int r5, int r6, boolean r7) {
            r2 = this;
            int r0 = r3.getMeasuredWidth()
            int r1 = r3.getMeasuredHeight()
            int r6 = r6 - r1
            int r6 = r6 / 2
            int r5 = r5 + r6
            if (r7 == 0) goto L_0x0015
            int r6 = r4 - r0
            int r1 = r1 + r5
            r3.layout(r6, r5, r4, r1)
            goto L_0x001b
        L_0x0015:
            int r6 = r4 + r0
            int r1 = r1 + r5
            r3.layout(r4, r5, r6, r1)
        L_0x001b:
            if (r7 == 0) goto L_0x001e
            int r0 = -r0
        L_0x001e:
            return r0
    }

    /* renamed from: a */
    public p000a.p018g.p029l.C0223v m2153a(int r3, long r4) {
            r2 = this;
            a.g.l.v r0 = r2.f2033g
            if (r0 == 0) goto L_0x0007
            r0.m3373a()
        L_0x0007:
            r0 = 0
            if (r3 != 0) goto L_0x0028
            int r1 = r2.getVisibility()
            if (r1 == 0) goto L_0x0013
            r2.setAlpha(r0)
        L_0x0013:
            a.g.l.v r0 = p000a.p018g.p029l.C0216r.m3445a(r2)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.m3372a(r1)
            r0.m3371a(r4)
            androidx.appcompat.widget.a$a r4 = r2.f2028b
            r4.m2148a(r0, r3)
            r0.m3370a(r4)
            return r0
        L_0x0028:
            a.g.l.v r1 = p000a.p018g.p029l.C0216r.m3445a(r2)
            r1.m3372a(r0)
            r1.m3371a(r4)
            androidx.appcompat.widget.a$a r4 = r2.f2028b
            r4.m2148a(r1, r3)
            r1.m3370a(r4)
            return r1
    }

    public int getAnimatedVisibility() {
            r1 = this;
            a.g.l.v r0 = r1.f2033g
            if (r0 == 0) goto L_0x0009
            androidx.appcompat.widget.a$a r0 = r1.f2028b
            int r0 = r0.f2037b
            return r0
        L_0x0009:
            int r0 = r1.getVisibility()
            return r0
    }

    public int getContentHeight() {
            r1 = this;
            int r0 = r1.f2032f
            return r0
    }

    @Override // android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration r6) {
            r5 = this;
            super.onConfigurationChanged(r6)
            android.content.Context r0 = r5.getContext()
            int[] r1 = p000a.p001a.C0009j.ActionBar
            int r2 = p000a.p001a.C0000a.actionBarStyle
            r3 = 0
            r4 = 0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r4, r1, r2, r3)
            int r1 = p000a.p001a.C0009j.ActionBar_height
            int r1 = r0.getLayoutDimension(r1, r3)
            r5.setContentHeight(r1)
            r0.recycle()
            androidx.appcompat.widget.c r0 = r5.f2031e
            if (r0 == 0) goto L_0x0024
            r0.m2136a(r6)
        L_0x0024:
            return
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent r6) {
            r5 = this;
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 9
            if (r0 != r2) goto L_0x000b
            r5.f2035i = r1
        L_0x000b:
            boolean r3 = r5.f2035i
            r4 = 1
            if (r3 != 0) goto L_0x001a
            boolean r6 = super.onHoverEvent(r6)
            if (r0 != r2) goto L_0x001a
            if (r6 != 0) goto L_0x001a
            r5.f2035i = r4
        L_0x001a:
            r6 = 10
            if (r0 == r6) goto L_0x0021
            r6 = 3
            if (r0 != r6) goto L_0x0023
        L_0x0021:
            r5.f2035i = r1
        L_0x0023:
            return r4
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r5.getActionMasked()
            r1 = 0
            if (r0 != 0) goto L_0x0009
            r4.f2034h = r1
        L_0x0009:
            boolean r2 = r4.f2034h
            r3 = 1
            if (r2 != 0) goto L_0x0018
            boolean r5 = super.onTouchEvent(r5)
            if (r0 != 0) goto L_0x0018
            if (r5 != 0) goto L_0x0018
            r4.f2034h = r3
        L_0x0018:
            if (r0 == r3) goto L_0x001d
            r5 = 3
            if (r0 != r5) goto L_0x001f
        L_0x001d:
            r4.f2034h = r1
        L_0x001f:
            return r3
    }

    public abstract void setContentHeight(int r1);

    @Override // android.view.View
    public void setVisibility(int r2) {
            r1 = this;
            int r0 = r1.getVisibility()
            if (r2 == r0) goto L_0x0010
            a.g.l.v r0 = r1.f2033g
            if (r0 == 0) goto L_0x000d
            r0.m3373a()
        L_0x000d:
            super.setVisibility(r2)
        L_0x0010:
            return
    }
}
