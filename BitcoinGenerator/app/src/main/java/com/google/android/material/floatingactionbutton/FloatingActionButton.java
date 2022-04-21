package com.google.android.material.floatingactionbutton;

@androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0678d(com.google.android.material.floatingactionbutton.FloatingActionButton.Behavior.class)
/* loaded from: classes.dex */
public class FloatingActionButton extends com.google.android.material.internal.C0983l implements p000a.p018g.p029l.AbstractC0215q, androidx.core.widget.AbstractC0723k, p050b.p051a.p052a.p053a.p058m.AbstractC0902a {

    /* renamed from: c */
    private android.content.res.ColorStateList f3477c;

    /* renamed from: d */
    private android.graphics.PorterDuff.Mode f3478d;

    /* renamed from: e */
    private android.content.res.ColorStateList f3479e;

    /* renamed from: f */
    private android.graphics.PorterDuff.Mode f3480f;

    /* renamed from: g */
    private android.content.res.ColorStateList f3481g;

    /* renamed from: h */
    private int f3482h;

    /* renamed from: i */
    private int f3483i;

    /* renamed from: j */
    private int f3484j;

    /* renamed from: k */
    private int f3485k;

    /* renamed from: l */
    boolean f3486l;

    /* renamed from: m */
    final android.graphics.Rect f3487m;

    /* renamed from: n */
    private final android.graphics.Rect f3488n;

    /* renamed from: o */
    private final androidx.appcompat.widget.C0624n f3489o;

    /* renamed from: p */
    private final p050b.p051a.p052a.p053a.p058m.C0904c f3490p;

    /* renamed from: q */
    private com.google.android.material.floatingactionbutton.C0944a f3491q;

    /* loaded from: classes.dex */
    protected static class BaseBehavior<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> extends androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c<T> {

        /* renamed from: a */
        private android.graphics.Rect f3492a;

        /* renamed from: b */
        private com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC0942b f3493b;

        /* renamed from: c */
        private boolean f3494c;

        public BaseBehavior() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.f3494c = r0
                return
        }

        public BaseBehavior(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                r1.<init>(r2, r3)
                int[] r0 = p050b.p051a.p052a.p053a.C0876i.FloatingActionButton_Behavior_Layout
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
                int r3 = p050b.p051a.p052a.p053a.C0876i.FloatingActionButton_Behavior_Layout_behavior_autoHide
                r0 = 1
                boolean r3 = r2.getBoolean(r3, r0)
                r1.f3494c = r3
                r2.recycle()
                return
        }

        /* renamed from: a */
        private void m207a(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.floatingactionbutton.FloatingActionButton r8) {
                r6 = this;
                android.graphics.Rect r0 = r8.f3487m
                if (r0 == 0) goto L_0x0059
                int r1 = r0.centerX()
                if (r1 <= 0) goto L_0x0059
                int r1 = r0.centerY()
                if (r1 <= 0) goto L_0x0059
                android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r1
                int r2 = r8.getRight()
                int r3 = r7.getWidth()
                int r4 = r1.rightMargin
                int r3 = r3 - r4
                r4 = 0
                if (r2 < r3) goto L_0x0027
                int r2 = r0.right
                goto L_0x0034
            L_0x0027:
                int r2 = r8.getLeft()
                int r3 = r1.leftMargin
                if (r2 > r3) goto L_0x0033
                int r2 = r0.left
                int r2 = -r2
                goto L_0x0034
            L_0x0033:
                r2 = 0
            L_0x0034:
                int r3 = r8.getBottom()
                int r7 = r7.getHeight()
                int r5 = r1.bottomMargin
                int r7 = r7 - r5
                if (r3 < r7) goto L_0x0044
                int r4 = r0.bottom
                goto L_0x004f
            L_0x0044:
                int r7 = r8.getTop()
                int r1 = r1.topMargin
                if (r7 > r1) goto L_0x004f
                int r7 = r0.top
                int r4 = -r7
            L_0x004f:
                if (r4 == 0) goto L_0x0054
                p000a.p018g.p029l.C0216r.m3420d(r8, r4)
            L_0x0054:
                if (r2 == 0) goto L_0x0059
                p000a.p018g.p029l.C0216r.m3422c(r8, r2)
            L_0x0059:
                return
        }

        /* renamed from: a */
        private static boolean m211a(android.view.View r1) {
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                boolean r0 = r1 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f
                if (r0 == 0) goto L_0x0011
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r1
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r1 = r1.m1659d()
                boolean r1 = r1 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
                return r1
            L_0x0011:
                r1 = 0
                return r1
        }

        /* renamed from: a */
        private boolean m210a(android.view.View r4, com.google.android.material.floatingactionbutton.FloatingActionButton r5) {
                r3 = this;
                android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r0
                boolean r1 = r3.f3494c
                r2 = 0
                if (r1 != 0) goto L_0x000c
                return r2
            L_0x000c:
                int r0 = r0.m1660c()
                int r4 = r4.getId()
                if (r0 == r4) goto L_0x0017
                return r2
            L_0x0017:
                int r4 = r5.getUserSetVisibility()
                if (r4 == 0) goto L_0x001e
                return r2
            L_0x001e:
                r4 = 1
                return r4
        }

        /* renamed from: a */
        private boolean m208a(androidx.coordinatorlayout.widget.CoordinatorLayout r3, com.google.android.material.appbar.AppBarLayout r4, com.google.android.material.floatingactionbutton.FloatingActionButton r5) {
                r2 = this;
                boolean r0 = r2.m210a(r4, r5)
                r1 = 0
                if (r0 != 0) goto L_0x0008
                return r1
            L_0x0008:
                android.graphics.Rect r0 = r2.f3492a
                if (r0 != 0) goto L_0x0013
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r2.f3492a = r0
            L_0x0013:
                android.graphics.Rect r0 = r2.f3492a
                com.google.android.material.internal.C0958b.m139a(r3, r4, r0)
                int r3 = r0.bottom
                int r4 = r4.getMinimumHeightForVisibleOverlappingContent()
                if (r3 > r4) goto L_0x0026
                com.google.android.material.floatingactionbutton.FloatingActionButton$b r3 = r2.f3493b
                r5.m223a(r3, r1)
                goto L_0x002b
            L_0x0026:
                com.google.android.material.floatingactionbutton.FloatingActionButton$b r3 = r2.f3493b
                r5.m217b(r3, r1)
            L_0x002b:
                r3 = 1
                return r3
        }

        /* renamed from: b */
        private boolean m203b(android.view.View r4, com.google.android.material.floatingactionbutton.FloatingActionButton r5) {
                r3 = this;
                boolean r0 = r3.m210a(r4, r5)
                r1 = 0
                if (r0 != 0) goto L_0x0008
                return r1
            L_0x0008:
                android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r0
                int r4 = r4.getTop()
                int r2 = r5.getHeight()
                int r2 = r2 / 2
                int r0 = r0.topMargin
                int r2 = r2 + r0
                if (r4 >= r2) goto L_0x0023
                com.google.android.material.floatingactionbutton.FloatingActionButton$b r4 = r3.f3493b
                r5.m223a(r4, r1)
                goto L_0x0028
            L_0x0023:
                com.google.android.material.floatingactionbutton.FloatingActionButton$b r4 = r3.f3493b
                r5.m217b(r4, r1)
            L_0x0028:
                r4 = 1
                return r4
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: a */
        public void mo31a(androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f r2) {
                r1 = this;
                int r0 = r2.f2601h
                if (r0 != 0) goto L_0x0008
                r0 = 80
                r2.f2601h = r0
            L_0x0008:
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo46a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, int r3) {
                r0 = this;
                com.google.android.material.floatingactionbutton.FloatingActionButton r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r2
                boolean r1 = r0.m206a(r1, r2, r3)
                return r1
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo209a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.graphics.Rect r3) {
                r0 = this;
                com.google.android.material.floatingactionbutton.FloatingActionButton r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r2
                boolean r1 = r0.m205a(r1, r2, r3)
                return r1
        }

        /* renamed from: a */
        public boolean m206a(androidx.coordinatorlayout.widget.CoordinatorLayout r6, com.google.android.material.floatingactionbutton.FloatingActionButton r7, int r8) {
                r5 = this;
                java.util.List r0 = r6.m1704b(r7)
                int r1 = r0.size()
                r2 = 0
            L_0x0009:
                if (r2 >= r1) goto L_0x002e
                java.lang.Object r3 = r0.get(r2)
                android.view.View r3 = (android.view.View) r3
                boolean r4 = r3 instanceof com.google.android.material.appbar.AppBarLayout
                if (r4 == 0) goto L_0x001e
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                boolean r3 = r5.m208a(r6, r3, r7)
                if (r3 == 0) goto L_0x002b
                goto L_0x002e
            L_0x001e:
                boolean r4 = m211a(r3)
                if (r4 == 0) goto L_0x002b
                boolean r3 = r5.m203b(r3, r7)
                if (r3 == 0) goto L_0x002b
                goto L_0x002e
            L_0x002b:
                int r2 = r2 + 1
                goto L_0x0009
            L_0x002e:
                r6.m1697c(r7, r8)
                r5.m207a(r6, r7)
                r6 = 1
                return r6
        }

        /* renamed from: a */
        public boolean m205a(androidx.coordinatorlayout.widget.CoordinatorLayout r5, com.google.android.material.floatingactionbutton.FloatingActionButton r6, android.graphics.Rect r7) {
                r4 = this;
                android.graphics.Rect r5 = r6.f3487m
                int r0 = r6.getLeft()
                int r1 = r5.left
                int r0 = r0 + r1
                int r1 = r6.getTop()
                int r2 = r5.top
                int r1 = r1 + r2
                int r2 = r6.getRight()
                int r3 = r5.right
                int r2 = r2 - r3
                int r6 = r6.getBottom()
                int r5 = r5.bottom
                int r6 = r6 - r5
                r7.set(r0, r1, r2, r6)
                r5 = 1
                return r5
        }

        /* renamed from: a */
        public boolean m204a(androidx.coordinatorlayout.widget.CoordinatorLayout r2, com.google.android.material.floatingactionbutton.FloatingActionButton r3, android.view.View r4) {
                r1 = this;
                boolean r0 = r4 instanceof com.google.android.material.appbar.AppBarLayout
                if (r0 == 0) goto L_0x000a
                com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
                r1.m208a(r2, r4, r3)
                goto L_0x0013
            L_0x000a:
                boolean r2 = m211a(r4)
                if (r2 == 0) goto L_0x0013
                r1.m203b(r4, r3)
            L_0x0013:
                r2 = 0
                return r2
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: b */
        public /* bridge */ /* synthetic */ boolean mo43b(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                com.google.android.material.floatingactionbutton.FloatingActionButton r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r2
                boolean r1 = r0.m204a(r1, r2, r3)
                return r1
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior<com.google.android.material.floatingactionbutton.FloatingActionButton> {
        public Behavior() {
                r0 = this;
                r0.<init>()
                return
        }

        public Behavior(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    /* loaded from: classes.dex */
    class C0941a implements com.google.android.material.floatingactionbutton.C0944a.AbstractC0951g {

        /* renamed from: a */
        final /* synthetic */ com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC0942b f3495a;

        /* renamed from: b */
        final /* synthetic */ com.google.android.material.floatingactionbutton.FloatingActionButton f3496b;

        C0941a(com.google.android.material.floatingactionbutton.FloatingActionButton r1, com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC0942b r2) {
                r0 = this;
                r0.f3496b = r1
                r0.f3495a = r2
                r0.<init>()
                return
        }

        @Override // com.google.android.material.floatingactionbutton.C0944a.AbstractC0951g
        /* renamed from: a */
        public void mo162a() {
                r2 = this;
                com.google.android.material.floatingactionbutton.FloatingActionButton$b r0 = r2.f3495a
                com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r2.f3496b
                r0.m201b(r1)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.C0944a.AbstractC0951g
        /* renamed from: b */
        public void mo161b() {
                r2 = this;
                com.google.android.material.floatingactionbutton.FloatingActionButton$b r0 = r2.f3495a
                com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r2.f3496b
                r0.m202a(r1)
                return
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0942b {
        /* renamed from: a */
        public abstract void m202a(com.google.android.material.floatingactionbutton.FloatingActionButton r1);

        /* renamed from: b */
        public abstract void m201b(com.google.android.material.floatingactionbutton.FloatingActionButton r1);
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    /* loaded from: classes.dex */
    private class C0943c implements p050b.p051a.p052a.p053a.p062q.AbstractC0909b {

        /* renamed from: a */
        final /* synthetic */ com.google.android.material.floatingactionbutton.FloatingActionButton f3497a;

        C0943c(com.google.android.material.floatingactionbutton.FloatingActionButton r1) {
                r0 = this;
                r0.f3497a = r1
                r0.<init>()
                return
        }

        @Override // p050b.p051a.p052a.p053a.p062q.AbstractC0909b
        /* renamed from: a */
        public void mo199a(int r3, int r4, int r5, int r6) {
                r2 = this;
                com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.f3497a
                android.graphics.Rect r0 = r0.f3487m
                r0.set(r3, r4, r5, r6)
                com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.f3497a
                int r1 = com.google.android.material.floatingactionbutton.FloatingActionButton.m222a(r0)
                int r3 = r3 + r1
                com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r2.f3497a
                int r1 = com.google.android.material.floatingactionbutton.FloatingActionButton.m222a(r1)
                int r4 = r4 + r1
                com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r2.f3497a
                int r1 = com.google.android.material.floatingactionbutton.FloatingActionButton.m222a(r1)
                int r5 = r5 + r1
                com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r2.f3497a
                int r1 = com.google.android.material.floatingactionbutton.FloatingActionButton.m222a(r1)
                int r6 = r6 + r1
                r0.setPadding(r3, r4, r5, r6)
                return
        }

        @Override // p050b.p051a.p052a.p053a.p062q.AbstractC0909b
        /* renamed from: a */
        public void mo198a(android.graphics.drawable.Drawable r2) {
                r1 = this;
                com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r1.f3497a
                com.google.android.material.floatingactionbutton.FloatingActionButton.m221a(r0, r2)
                return
        }

        @Override // p050b.p051a.p052a.p053a.p062q.AbstractC0909b
        /* renamed from: a */
        public boolean mo200a() {
                r1 = this;
                com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r1.f3497a
                boolean r0 = r0.f3486l
                return r0
        }

        @Override // p050b.p051a.p052a.p053a.p062q.AbstractC0909b
        /* renamed from: b */
        public float mo197b() {
                r2 = this;
                com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.f3497a
                int r0 = r0.getSizeDimension()
                float r0 = (float) r0
                r1 = 1073741824(0x40000000, float:2.0)
                float r0 = r0 / r1
                return r0
        }
    }

    /* renamed from: a */
    private int m228a(int r4) {
            r3 = this;
            int r0 = r3.f3483i
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            android.content.res.Resources r0 = r3.getResources()
            r1 = -1
            r2 = 1
            if (r4 == r1) goto L_0x0019
            if (r4 == r2) goto L_0x0016
            int r4 = p050b.p051a.p052a.p053a.C0870c.design_fab_size_normal
        L_0x0011:
            int r4 = r0.getDimensionPixelSize(r4)
            return r4
        L_0x0016:
            int r4 = p050b.p051a.p052a.p053a.C0870c.design_fab_size_mini
            goto L_0x0011
        L_0x0019:
            android.content.res.Configuration r4 = r0.getConfiguration()
            int r4 = r4.screenWidthDp
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenHeightDp
            int r4 = java.lang.Math.max(r4, r0)
            r0 = 470(0x1d6, float:6.59E-43)
            if (r4 >= r0) goto L_0x0032
            int r4 = r3.m228a(r2)
            goto L_0x0037
        L_0x0032:
            r4 = 0
            int r4 = r3.m228a(r4)
        L_0x0037:
            return r4
    }

    /* renamed from: a */
    private static int m227a(int r2, int r3) {
            int r0 = android.view.View.MeasureSpec.getMode(r3)
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x001a
            if (r0 == 0) goto L_0x001e
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x0014
            r2 = r3
            goto L_0x001e
        L_0x0014:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
        L_0x001a:
            int r2 = java.lang.Math.min(r2, r3)
        L_0x001e:
            return r2
    }

    /* renamed from: a */
    static /* synthetic */ int m222a(com.google.android.material.floatingactionbutton.FloatingActionButton r0) {
            int r0 = r0.f3484j
            return r0
    }

    /* renamed from: a */
    private com.google.android.material.floatingactionbutton.C0944a.AbstractC0951g m224a(com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC0942b r2) {
            r1 = this;
            if (r2 != 0) goto L_0x0004
            r2 = 0
            return r2
        L_0x0004:
            com.google.android.material.floatingactionbutton.FloatingActionButton$a r0 = new com.google.android.material.floatingactionbutton.FloatingActionButton$a
            r0.<init>(r1, r2)
            return r0
    }

    /* renamed from: a */
    static /* synthetic */ void m221a(com.google.android.material.floatingactionbutton.FloatingActionButton r0, android.graphics.drawable.Drawable r1) {
            super.setBackgroundDrawable(r1)
            return
    }

    /* renamed from: c */
    private com.google.android.material.floatingactionbutton.C0944a m216c() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x0011
            com.google.android.material.floatingactionbutton.b r0 = new com.google.android.material.floatingactionbutton.b
            com.google.android.material.floatingactionbutton.FloatingActionButton$c r1 = new com.google.android.material.floatingactionbutton.FloatingActionButton$c
            r1.<init>(r2)
            r0.<init>(r2, r1)
            return r0
        L_0x0011:
            com.google.android.material.floatingactionbutton.a r0 = new com.google.android.material.floatingactionbutton.a
            com.google.android.material.floatingactionbutton.FloatingActionButton$c r1 = new com.google.android.material.floatingactionbutton.FloatingActionButton$c
            r1.<init>(r2)
            r0.<init>(r2, r1)
            return r0
    }

    /* renamed from: c */
    private void m214c(android.graphics.Rect r4) {
            r3 = this;
            int r0 = r4.left
            android.graphics.Rect r1 = r3.f3487m
            int r2 = r1.left
            int r0 = r0 + r2
            r4.left = r0
            int r0 = r4.top
            int r2 = r1.top
            int r0 = r0 + r2
            r4.top = r0
            int r0 = r4.right
            int r2 = r1.right
            int r0 = r0 - r2
            r4.right = r0
            int r0 = r4.bottom
            int r1 = r1.bottom
            int r0 = r0 - r1
            r4.bottom = r0
            return
    }

    /* renamed from: d */
    private void m213d() {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.getDrawable()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.content.res.ColorStateList r1 = r4.f3479e
            if (r1 != 0) goto L_0x000f
            androidx.core.graphics.drawable.C0698a.m1598b(r0)
            return
        L_0x000f:
            int[] r2 = r4.getDrawableState()
            r3 = 0
            int r1 = r1.getColorForState(r2, r3)
            android.graphics.PorterDuff$Mode r2 = r4.f3480f
            if (r2 != 0) goto L_0x001e
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
        L_0x001e:
            android.graphics.drawable.Drawable r0 = r0.mutate()
            android.graphics.PorterDuffColorFilter r1 = androidx.appcompat.widget.C0606j.m2011a(r1, r2)
            r0.setColorFilter(r1)
            return
    }

    private com.google.android.material.floatingactionbutton.C0944a getImpl() {
            r1 = this;
            com.google.android.material.floatingactionbutton.a r0 = r1.f3491q
            if (r0 != 0) goto L_0x000a
            com.google.android.material.floatingactionbutton.a r0 = r1.m216c()
            r1.f3491q = r0
        L_0x000a:
            com.google.android.material.floatingactionbutton.a r0 = r1.f3491q
            return r0
    }

    /* renamed from: a */
    public void m226a(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.a r0 = r1.getImpl()
            r0.m193a(r2)
            return
    }

    /* renamed from: a */
    void m223a(com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC0942b r2, boolean r3) {
            r1 = this;
            com.google.android.material.floatingactionbutton.a r0 = r1.getImpl()
            com.google.android.material.floatingactionbutton.a$g r2 = r1.m224a(r2)
            r0.m188a(r2, r3)
            return
    }

    @Override // p050b.p051a.p052a.p053a.p058m.AbstractC0903b
    /* renamed from: a */
    public boolean mo229a() {
            r1 = this;
            b.a.a.a.m.c r0 = r1.f3490p
            r0.m407b()
            r0 = 0
            throw r0
    }

    @java.lang.Deprecated
    /* renamed from: a */
    public boolean m225a(android.graphics.Rect r4) {
            r3 = this;
            boolean r0 = p000a.p018g.p029l.C0216r.m3397x(r3)
            r1 = 0
            if (r0 == 0) goto L_0x0017
            int r0 = r3.getWidth()
            int r2 = r3.getHeight()
            r4.set(r1, r1, r0, r2)
            r3.m214c(r4)
            r4 = 1
            return r4
        L_0x0017:
            return r1
    }

    /* renamed from: b */
    public void m219b(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.a r0 = r1.getImpl()
            r0.m185b(r2)
            return
    }

    /* renamed from: b */
    public void m218b(android.graphics.Rect r4) {
            r3 = this;
            int r0 = r3.getMeasuredWidth()
            int r1 = r3.getMeasuredHeight()
            r2 = 0
            r4.set(r2, r2, r0, r1)
            r3.m214c(r4)
            return
    }

    /* renamed from: b */
    void m217b(com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC0942b r2, boolean r3) {
            r1 = this;
            com.google.android.material.floatingactionbutton.a r0 = r1.getImpl()
            com.google.android.material.floatingactionbutton.a$g r2 = r1.m224a(r2)
            r0.m183b(r2, r3)
            return
    }

    /* renamed from: b */
    public boolean m220b() {
            r1 = this;
            com.google.android.material.floatingactionbutton.a r0 = r1.getImpl()
            boolean r0 = r0.m173h()
            return r0
    }

    /* renamed from: c */
    public void m215c(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.a r0 = r1.getImpl()
            r0.m180c(r2)
            return
    }

    /* renamed from: d */
    public void m212d(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.a r0 = r1.getImpl()
            r0.m177d(r2)
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
            r2 = this;
            super.drawableStateChanged()
            com.google.android.material.floatingactionbutton.a r0 = r2.getImpl()
            int[] r1 = r2.getDrawableState()
            r0.mo157a(r1)
            return
    }

    @Override // android.view.View
    public android.content.res.ColorStateList getBackgroundTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f3477c
            return r0
    }

    @Override // android.view.View
    public android.graphics.PorterDuff.Mode getBackgroundTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.f3478d
            return r0
    }

    public float getCompatElevation() {
            r1 = this;
            com.google.android.material.floatingactionbutton.a r0 = r1.getImpl()
            float r0 = r0.mo156b()
            return r0
    }

    public float getCompatHoveredFocusedTranslationZ() {
            r1 = this;
            com.google.android.material.floatingactionbutton.a r0 = r1.getImpl()
            float r0 = r0.m179d()
            return r0
    }

    public float getCompatPressedTranslationZ() {
            r1 = this;
            com.google.android.material.floatingactionbutton.a r0 = r1.getImpl()
            float r0 = r0.m176e()
            return r0
    }

    public android.graphics.drawable.Drawable getContentBackground() {
            r1 = this;
            com.google.android.material.floatingactionbutton.a r0 = r1.getImpl()
            android.graphics.drawable.Drawable r0 = r0.m196a()
            return r0
    }

    public int getCustomSize() {
            r1 = this;
            int r0 = r1.f3483i
            return r0
    }

    public int getExpandedComponentIdHint() {
            r1 = this;
            b.a.a.a.m.c r0 = r1.f3490p
            r0.m410a()
            r0 = 0
            throw r0
    }

    public p050b.p051a.p052a.p053a.p054j.C0884h getHideMotionSpec() {
            r1 = this;
            com.google.android.material.floatingactionbutton.a r0 = r1.getImpl()
            b.a.a.a.j.h r0 = r0.m182c()
            return r0
    }

    @java.lang.Deprecated
    public int getRippleColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f3481g
            if (r0 == 0) goto L_0x0009
            int r0 = r0.getDefaultColor()
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            return r0
    }

    public android.content.res.ColorStateList getRippleColorStateList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f3481g
            return r0
    }

    public p050b.p051a.p052a.p053a.p054j.C0884h getShowMotionSpec() {
            r1 = this;
            com.google.android.material.floatingactionbutton.a r0 = r1.getImpl()
            b.a.a.a.j.h r0 = r0.m175f()
            return r0
    }

    public int getSize() {
            r1 = this;
            int r0 = r1.f3482h
            return r0
    }

    int getSizeDimension() {
            r1 = this;
            int r0 = r1.f3482h
            int r0 = r1.m228a(r0)
            return r0
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.getBackgroundTintList()
            return r0
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.getBackgroundTintMode()
            return r0
    }

    @Override // androidx.core.widget.AbstractC0723k
    public android.content.res.ColorStateList getSupportImageTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f3479e
            return r0
    }

    @Override // androidx.core.widget.AbstractC0723k
    public android.graphics.PorterDuff.Mode getSupportImageTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.f3480f
            return r0
    }

    public boolean getUseCompatPadding() {
            r1 = this;
            boolean r0 = r1.f3486l
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            com.google.android.material.floatingactionbutton.a r0 = r1.getImpl()
            r0.mo153i()
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.google.android.material.floatingactionbutton.a r0 = r1.getImpl()
            r0.m172j()
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            com.google.android.material.floatingactionbutton.a r0 = r1.getImpl()
            r0.m171l()
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int r3, int r4) {
            r2 = this;
            int r0 = r2.getSizeDimension()
            int r1 = r2.f3485k
            int r1 = r0 - r1
            int r1 = r1 / 2
            r2.f3484j = r1
            com.google.android.material.floatingactionbutton.a r1 = r2.getImpl()
            r1.m168p()
            int r3 = m227a(r0, r3)
            int r4 = m227a(r0, r4)
            int r3 = java.lang.Math.min(r3, r4)
            android.graphics.Rect r4 = r2.f3487m
            int r0 = r4.left
            int r0 = r0 + r3
            int r1 = r4.right
            int r0 = r0 + r1
            int r1 = r4.top
            int r3 = r3 + r1
            int r4 = r4.bottom
            int r3 = r3 + r4
            r2.setMeasuredDimension(r0, r3)
            return
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r3) {
            r2 = this;
            boolean r0 = r3 instanceof p050b.p051a.p052a.p053a.p064s.C0912a
            if (r0 != 0) goto L_0x0008
            super.onRestoreInstanceState(r3)
            return
        L_0x0008:
            b.a.a.a.s.a r3 = (p050b.p051a.p052a.p053a.p064s.C0912a) r3
            android.os.Parcelable r0 = r3.m3347a()
            super.onRestoreInstanceState(r0)
            b.a.a.a.m.c r0 = r2.f3490p
            a.d.g<java.lang.String, android.os.Bundle> r3 = r3.f3355d
            java.lang.String r1 = "expandableWidgetHelper"
            java.lang.Object r3 = r3.get(r1)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r0.m408a(r3)
            r3 = 0
            throw r3
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            b.a.a.a.s.a r1 = new b.a.a.a.s.a
            r1.<init>(r0)
            a.d.g<java.lang.String, android.os.Bundle> r0 = r1.f3355d
            b.a.a.a.m.c r0 = r2.f3490p
            r0.m406c()
            r0 = 0
            throw r0
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getAction()
            if (r0 != 0) goto L_0x0022
            android.graphics.Rect r0 = r3.f3488n
            boolean r0 = r3.m225a(r0)
            if (r0 == 0) goto L_0x0022
            android.graphics.Rect r0 = r3.f3488n
            float r1 = r4.getX()
            int r1 = (int) r1
            float r2 = r4.getY()
            int r2 = (int) r2
            boolean r0 = r0.contains(r1, r2)
            if (r0 != 0) goto L_0x0022
            r4 = 0
            return r4
        L_0x0022:
            boolean r4 = super.onTouchEvent(r4)
            return r4
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
            r1 = this;
            java.lang.String r2 = "FloatingActionButton"
            java.lang.String r0 = "Setting a custom background is not supported."
            android.util.Log.i(r2, r0)
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            java.lang.String r2 = "FloatingActionButton"
            java.lang.String r0 = "Setting a custom background is not supported."
            android.util.Log.i(r2, r0)
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            java.lang.String r2 = "FloatingActionButton"
            java.lang.String r0 = "Setting a custom background is not supported."
            android.util.Log.i(r2, r0)
            return
    }

    @Override // android.view.View
    public void setBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f3477c
            if (r0 == r2) goto L_0x000d
            r1.f3477c = r2
            com.google.android.material.floatingactionbutton.a r0 = r1.getImpl()
            r0.m192a(r2)
        L_0x000d:
            return
    }

    @Override // android.view.View
    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.f3478d
            if (r0 == r2) goto L_0x000d
            r1.f3478d = r2
            com.google.android.material.floatingactionbutton.a r0 = r1.getImpl()
            r0.m191a(r2)
        L_0x000d:
            return
    }

    public void setCompatElevation(float r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.a r0 = r1.getImpl()
            r0.m195a(r2)
            return
    }

    public void setCompatElevationResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            float r2 = r0.getDimension(r2)
            r1.setCompatElevation(r2)
            return
    }

    public void setCompatHoveredFocusedTranslationZ(float r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.a r0 = r1.getImpl()
            r0.m186b(r2)
            return
    }

    public void setCompatHoveredFocusedTranslationZResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            float r2 = r0.getDimension(r2)
            r1.setCompatHoveredFocusedTranslationZ(r2)
            return
    }

    public void setCompatPressedTranslationZ(float r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.a r0 = r1.getImpl()
            r0.m178d(r2)
            return
    }

    public void setCompatPressedTranslationZResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            float r2 = r0.getDimension(r2)
            r1.setCompatPressedTranslationZ(r2)
            return
    }

    public void setCustomSize(int r2) {
            r1 = this;
            if (r2 < 0) goto L_0x0005
            r1.f3483i = r2
            return
        L_0x0005:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Custom size must be non-negative"
            r2.<init>(r0)
            throw r2
    }

    public void setExpandedComponentIdHint(int r2) {
            r1 = this;
            b.a.a.a.m.c r0 = r1.f3490p
            r0.m409a(r2)
            r2 = 0
            throw r2
    }

    public void setHideMotionSpec(p050b.p051a.p052a.p053a.p054j.C0884h r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.a r0 = r1.getImpl()
            r0.m190a(r2)
            return
    }

    public void setHideMotionSpecResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            b.a.a.a.j.h r2 = p050b.p051a.p052a.p053a.p054j.C0884h.m472a(r0, r2)
            r1.setHideMotionSpec(r2)
            return
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setImageDrawable(r1)
            com.google.android.material.floatingactionbutton.a r1 = r0.getImpl()
            r1.m169o()
            return
    }

    @Override // android.widget.ImageView
    public void setImageResource(int r2) {
            r1 = this;
            androidx.appcompat.widget.n r0 = r1.f3489o
            r0.m1954a(r2)
            return
    }

    public void setRippleColor(int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setRippleColor(r1)
            return
    }

    public void setRippleColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f3481g
            if (r0 == r2) goto L_0x000f
            r1.f3481g = r2
            com.google.android.material.floatingactionbutton.a r2 = r1.getImpl()
            android.content.res.ColorStateList r0 = r1.f3481g
            r2.mo155b(r0)
        L_0x000f:
            return
    }

    public void setShowMotionSpec(p050b.p051a.p052a.p053a.p054j.C0884h r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.a r0 = r1.getImpl()
            r0.m184b(r2)
            return
    }

    public void setShowMotionSpecResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            b.a.a.a.j.h r2 = p050b.p051a.p052a.p053a.p054j.C0884h.m472a(r0, r2)
            r1.setShowMotionSpec(r2)
            return
    }

    public void setSize(int r2) {
            r1 = this;
            r0 = 0
            r1.f3483i = r0
            int r0 = r1.f3482h
            if (r2 == r0) goto L_0x000c
            r1.f3482h = r2
            r1.requestLayout()
        L_0x000c:
            return
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.setBackgroundTintList(r1)
            return
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.setBackgroundTintMode(r1)
            return
    }

    @Override // androidx.core.widget.AbstractC0723k
    public void setSupportImageTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f3479e
            if (r0 == r2) goto L_0x0009
            r1.f3479e = r2
            r1.m213d()
        L_0x0009:
            return
    }

    @Override // androidx.core.widget.AbstractC0723k
    public void setSupportImageTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.f3480f
            if (r0 == r2) goto L_0x0009
            r1.f3480f = r2
            r1.m213d()
        L_0x0009:
            return
    }

    public void setUseCompatPadding(boolean r2) {
            r1 = this;
            boolean r0 = r1.f3486l
            if (r0 == r2) goto L_0x000d
            r1.f3486l = r2
            com.google.android.material.floatingactionbutton.a r2 = r1.getImpl()
            r2.mo152k()
        L_0x000d:
            return
    }
}
