package androidx.coordinatorlayout.widget;

/* loaded from: classes.dex */
public class CoordinatorLayout extends android.view.ViewGroup implements p000a.p018g.p029l.AbstractC0210l {

    /* renamed from: u */
    static final java.lang.String f2568u = null;

    /* renamed from: v */
    static final java.lang.Class<?>[] f2569v = null;

    /* renamed from: w */
    static final java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.reflect.Constructor<androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c>>> f2570w = null;

    /* renamed from: x */
    static final java.util.Comparator<android.view.View> f2571x = null;

    /* renamed from: y */
    private static final p000a.p018g.p028k.AbstractC0181d<android.graphics.Rect> f2572y = null;

    /* renamed from: b */
    private final java.util.List<android.view.View> f2573b;

    /* renamed from: c */
    private final androidx.coordinatorlayout.widget.C0685a<android.view.View> f2574c;

    /* renamed from: d */
    private final java.util.List<android.view.View> f2575d;

    /* renamed from: e */
    private final java.util.List<android.view.View> f2576e;

    /* renamed from: f */
    private final int[] f2577f;

    /* renamed from: g */
    private android.graphics.Paint f2578g;

    /* renamed from: h */
    private boolean f2579h;

    /* renamed from: i */
    private boolean f2580i;

    /* renamed from: j */
    private int[] f2581j;

    /* renamed from: k */
    private android.view.View f2582k;

    /* renamed from: l */
    private android.view.View f2583l;

    /* renamed from: m */
    private androidx.coordinatorlayout.widget.CoordinatorLayout.ViewTreeObserver$OnPreDrawListenerC0681g f2584m;

    /* renamed from: n */
    private boolean f2585n;

    /* renamed from: o */
    private p000a.p018g.p029l.C0230z f2586o;

    /* renamed from: p */
    private boolean f2587p;

    /* renamed from: q */
    private android.graphics.drawable.Drawable f2588q;

    /* renamed from: r */
    android.view.ViewGroup.OnHierarchyChangeListener f2589r;

    /* renamed from: s */
    private p000a.p018g.p029l.AbstractC0213o f2590s;

    /* renamed from: t */
    private final p000a.p018g.p029l.C0212n f2591t;

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    /* loaded from: classes.dex */
    class C0675a implements p000a.p018g.p029l.AbstractC0213o {

        /* renamed from: a */
        final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout f2592a;

        C0675a(androidx.coordinatorlayout.widget.CoordinatorLayout r1) {
                r0 = this;
                r0.f2592a = r1
                r0.<init>()
                return
        }

        @Override // p000a.p018g.p029l.AbstractC0213o
        /* renamed from: a */
        public p000a.p018g.p029l.C0230z mo86a(android.view.View r1, p000a.p018g.p029l.C0230z r2) {
                r0 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r0.f2592a
                a.g.l.z r1 = r1.m1723a(r2)
                return r1
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    /* loaded from: classes.dex */
    public interface AbstractC0676b {
        androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0677c<V extends android.view.View> {
        public AbstractC0677c() {
                r0 = this;
                r0.<init>()
                return
        }

        public AbstractC0677c(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public p000a.p018g.p029l.C0230z m1683a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, p000a.p018g.p029l.C0230z r3) {
                r0 = this;
                return r3
        }

        /* renamed from: a */
        public void m1685a() {
                r0 = this;
                return
        }

        /* renamed from: a */
        public void mo31a(androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f r1) {
                r0 = this;
                return
        }

        /* renamed from: a */
        public void mo256a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.os.Parcelable r3) {
                r0 = this;
                return
        }

        /* renamed from: a */
        public void mo254a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, int r4) {
                r0 = this;
                if (r4 != 0) goto L_0x0005
                r0.m1675d(r1, r2, r3)
            L_0x0005:
                return
        }

        @java.lang.Deprecated
        /* renamed from: a */
        public void mo313a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, int r4, int r5, int r6, int r7) {
                r0 = this;
                return
        }

        /* renamed from: a */
        public void mo375a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, int r4, int r5, int r6, int r7, int r8) {
                r0 = this;
                if (r8 != 0) goto L_0x0005
                r0.mo313a(r1, r2, r3, r4, r5, r6, r7)
            L_0x0005:
                return
        }

        @java.lang.Deprecated
        /* renamed from: a */
        public void m1681a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, int r4, int r5, int[] r6) {
                r0 = this;
                return
        }

        /* renamed from: a */
        public void mo253a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, int r4, int r5, int[] r6, int r7) {
                r0 = this;
                if (r7 != 0) goto L_0x0005
                r0.m1681a(r1, r2, r3, r4, r5, r6)
            L_0x0005:
                return
        }

        @java.lang.Deprecated
        /* renamed from: a */
        public void m1680a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, android.view.View r4, int r5) {
                r0 = this;
                return
        }

        /* renamed from: a */
        public void m1679a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, android.view.View r4, int r5, int r6) {
                r0 = this;
                if (r6 != 0) goto L_0x0005
                r0.m1680a(r1, r2, r3, r4, r5)
            L_0x0005:
                return
        }

        /* renamed from: a */
        public boolean m1684a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2) {
                r0 = this;
                float r1 = r0.m1677c(r1, r2)
                r2 = 0
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 <= 0) goto L_0x000b
                r1 = 1
                goto L_0x000c
            L_0x000b:
                r1 = 0
            L_0x000c:
                return r1
        }

        /* renamed from: a */
        public boolean mo46a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, int r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: a */
        public boolean mo331a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, int r3, int r4, int r5, int r6) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: a */
        public boolean mo209a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.graphics.Rect r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: a */
        public boolean mo349a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.graphics.Rect r3, boolean r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: a */
        public boolean mo62a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.MotionEvent r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: a */
        public boolean mo20a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: a */
        public boolean mo255a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, float r4, float r5) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: a */
        public boolean m1682a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, float r4, float r5, boolean r6) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: b */
        public int m1678b(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2) {
                r0 = this;
                r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                return r1
        }

        /* renamed from: b */
        public boolean mo18b(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.MotionEvent r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: b */
        public boolean mo43b(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        @java.lang.Deprecated
        /* renamed from: b */
        public boolean mo311b(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, android.view.View r4, int r5) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: b */
        public boolean mo248b(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, android.view.View r4, int r5, int r6) {
                r0 = this;
                if (r6 != 0) goto L_0x0007
                boolean r1 = r0.mo311b(r1, r2, r3, r4, r5)
                return r1
            L_0x0007:
                r1 = 0
                return r1
        }

        /* renamed from: c */
        public float m1677c(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: c */
        public void m1676c(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3) {
                r0 = this;
                return
        }

        /* renamed from: d */
        public android.os.Parcelable mo241d(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2) {
                r0 = this;
                android.view.AbsSavedState r1 = android.view.View.BaseSavedState.EMPTY_STATE
                return r1
        }

        @java.lang.Deprecated
        /* renamed from: d */
        public void m1675d(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3) {
                r0 = this;
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.Deprecated
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    /* loaded from: classes.dex */
    public @interface AbstractC0678d {
        java.lang.Class<? extends androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    /* loaded from: classes.dex */
    private class ViewGroup$OnHierarchyChangeListenerC0679e implements android.view.ViewGroup.OnHierarchyChangeListener {

        /* renamed from: b */
        final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout f2593b;

        ViewGroup$OnHierarchyChangeListenerC0679e(androidx.coordinatorlayout.widget.CoordinatorLayout r1) {
                r0 = this;
                r0.f2593b = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(android.view.View r2, android.view.View r3) {
                r1 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r1.f2593b
                android.view.ViewGroup$OnHierarchyChangeListener r0 = r0.f2589r
                if (r0 == 0) goto L_0x0009
                r0.onChildViewAdded(r2, r3)
            L_0x0009:
                return
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(android.view.View r3, android.view.View r4) {
                r2 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.f2593b
                r1 = 2
                r0.m1725a(r1)
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.f2593b
                android.view.ViewGroup$OnHierarchyChangeListener r0 = r0.f2589r
                if (r0 == 0) goto L_0x000f
                r0.onChildViewRemoved(r3, r4)
            L_0x000f:
                return
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    /* loaded from: classes.dex */
    public static class C0680f extends android.view.ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c f2594a;

        /* renamed from: b */
        boolean f2595b;

        /* renamed from: c */
        public int f2596c;

        /* renamed from: d */
        public int f2597d;

        /* renamed from: e */
        public int f2598e;

        /* renamed from: f */
        int f2599f;

        /* renamed from: g */
        public int f2600g;

        /* renamed from: h */
        public int f2601h;

        /* renamed from: i */
        int f2602i;

        /* renamed from: j */
        int f2603j;

        /* renamed from: k */
        android.view.View f2604k;

        /* renamed from: l */
        android.view.View f2605l;

        /* renamed from: m */
        private boolean f2606m;

        /* renamed from: n */
        private boolean f2607n;

        /* renamed from: o */
        private boolean f2608o;

        /* renamed from: p */
        private boolean f2609p;

        /* renamed from: q */
        final android.graphics.Rect f2610q;

        public C0680f(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.f2595b = r1
                r0.f2596c = r1
                r0.f2597d = r1
                r2 = -1
                r0.f2598e = r2
                r0.f2599f = r2
                r0.f2600g = r1
                r0.f2601h = r1
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.f2610q = r1
                return
        }

        C0680f(android.content.Context r5, android.util.AttributeSet r6) {
                r4 = this;
                r4.<init>(r5, r6)
                r0 = 0
                r4.f2595b = r0
                r4.f2596c = r0
                r4.f2597d = r0
                r1 = -1
                r4.f2598e = r1
                r4.f2599f = r1
                r4.f2600g = r0
                r4.f2601h = r0
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r4.f2610q = r2
                int[] r2 = p000a.p017f.C0120c.CoordinatorLayout_Layout
                android.content.res.TypedArray r2 = r5.obtainStyledAttributes(r6, r2)
                int r3 = p000a.p017f.C0120c.CoordinatorLayout_Layout_android_layout_gravity
                int r3 = r2.getInteger(r3, r0)
                r4.f2596c = r3
                int r3 = p000a.p017f.C0120c.CoordinatorLayout_Layout_layout_anchor
                int r3 = r2.getResourceId(r3, r1)
                r4.f2599f = r3
                int r3 = p000a.p017f.C0120c.CoordinatorLayout_Layout_layout_anchorGravity
                int r3 = r2.getInteger(r3, r0)
                r4.f2597d = r3
                int r3 = p000a.p017f.C0120c.CoordinatorLayout_Layout_layout_keyline
                int r1 = r2.getInteger(r3, r1)
                r4.f2598e = r1
                int r1 = p000a.p017f.C0120c.CoordinatorLayout_Layout_layout_insetEdge
                int r1 = r2.getInt(r1, r0)
                r4.f2600g = r1
                int r1 = p000a.p017f.C0120c.CoordinatorLayout_Layout_layout_dodgeInsetEdges
                int r0 = r2.getInt(r1, r0)
                r4.f2601h = r0
                int r0 = p000a.p017f.C0120c.CoordinatorLayout_Layout_layout_behavior
                boolean r0 = r2.hasValue(r0)
                r4.f2595b = r0
                boolean r0 = r4.f2595b
                if (r0 == 0) goto L_0x0068
                int r0 = p000a.p017f.C0120c.CoordinatorLayout_Layout_layout_behavior
                java.lang.String r0 = r2.getString(r0)
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r5 = androidx.coordinatorlayout.widget.CoordinatorLayout.m1722a(r5, r6, r0)
                r4.f2594a = r5
            L_0x0068:
                r2.recycle()
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r5 = r4.f2594a
                if (r5 == 0) goto L_0x0072
                r5.mo31a(r4)
            L_0x0072:
                return
        }

        public C0680f(android.view.ViewGroup.LayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r2 = 0
                r1.f2595b = r2
                r1.f2596c = r2
                r1.f2597d = r2
                r0 = -1
                r1.f2598e = r0
                r1.f2599f = r0
                r1.f2600g = r2
                r1.f2601h = r2
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r1.f2610q = r2
                return
        }

        public C0680f(android.view.ViewGroup.MarginLayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r2 = 0
                r1.f2595b = r2
                r1.f2596c = r2
                r1.f2597d = r2
                r0 = -1
                r1.f2598e = r0
                r1.f2599f = r0
                r1.f2600g = r2
                r1.f2601h = r2
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r1.f2610q = r2
                return
        }

        public C0680f(androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f r2) {
                r1 = this;
                r1.<init>(r2)
                r2 = 0
                r1.f2595b = r2
                r1.f2596c = r2
                r1.f2597d = r2
                r0 = -1
                r1.f2598e = r0
                r1.f2599f = r0
                r1.f2600g = r2
                r1.f2601h = r2
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r1.f2610q = r2
                return
        }

        /* renamed from: a */
        private void m1669a(android.view.View r5, androidx.coordinatorlayout.widget.CoordinatorLayout r6) {
                r4 = this;
                int r0 = r4.f2599f
                android.view.View r0 = r6.findViewById(r0)
                r4.f2604k = r0
                android.view.View r0 = r4.f2604k
                r1 = 0
                if (r0 == 0) goto L_0x004a
                if (r0 != r6) goto L_0x0022
                boolean r5 = r6.isInEditMode()
                if (r5 == 0) goto L_0x001a
            L_0x0015:
                r4.f2605l = r1
                r4.f2604k = r1
                return
            L_0x001a:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "View can not be anchored to the the parent CoordinatorLayout"
                r5.<init>(r6)
                throw r5
            L_0x0022:
                android.view.ViewParent r2 = r0.getParent()
            L_0x0026:
                if (r2 == r6) goto L_0x0047
                if (r2 == 0) goto L_0x0047
                if (r2 != r5) goto L_0x003b
                boolean r5 = r6.isInEditMode()
                if (r5 == 0) goto L_0x0033
                goto L_0x0015
            L_0x0033:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "Anchor must not be a descendant of the anchored view"
                r5.<init>(r6)
                throw r5
            L_0x003b:
                boolean r3 = r2 instanceof android.view.View
                if (r3 == 0) goto L_0x0042
                r0 = r2
                android.view.View r0 = (android.view.View) r0
            L_0x0042:
                android.view.ViewParent r2 = r2.getParent()
                goto L_0x0026
            L_0x0047:
                r4.f2605l = r0
                return
            L_0x004a:
                boolean r0 = r6.isInEditMode()
                if (r0 == 0) goto L_0x0051
                goto L_0x0015
            L_0x0051:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Could not find CoordinatorLayout descendant view with id "
                r1.append(r2)
                android.content.res.Resources r6 = r6.getResources()
                int r2 = r4.f2599f
                java.lang.String r6 = r6.getResourceName(r2)
                r1.append(r6)
                java.lang.String r6 = " to anchor view "
                r1.append(r6)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                goto L_0x007b
            L_0x007a:
                throw r0
            L_0x007b:
                goto L_0x007a
        }

        /* renamed from: a */
        private boolean m1670a(android.view.View r2, int r3) {
                r1 = this;
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r2
                int r2 = r2.f2600g
                int r2 = p000a.p018g.p029l.C0200c.m3490a(r2, r3)
                if (r2 == 0) goto L_0x0019
                int r0 = r1.f2601h
                int r3 = p000a.p018g.p029l.C0200c.m3490a(r0, r3)
                r3 = r3 & r2
                if (r3 != r2) goto L_0x0019
                r2 = 1
                goto L_0x001a
            L_0x0019:
                r2 = 0
            L_0x001a:
                return r2
        }

        /* renamed from: b */
        private boolean m1662b(android.view.View r5, androidx.coordinatorlayout.widget.CoordinatorLayout r6) {
                r4 = this;
                android.view.View r0 = r4.f2604k
                int r0 = r0.getId()
                int r1 = r4.f2599f
                r2 = 0
                if (r0 == r1) goto L_0x000c
                return r2
            L_0x000c:
                android.view.View r0 = r4.f2604k
                android.view.ViewParent r1 = r0.getParent()
            L_0x0012:
                if (r1 == r6) goto L_0x002b
                if (r1 == 0) goto L_0x0025
                if (r1 != r5) goto L_0x0019
                goto L_0x0025
            L_0x0019:
                boolean r3 = r1 instanceof android.view.View
                if (r3 == 0) goto L_0x0020
                r0 = r1
                android.view.View r0 = (android.view.View) r0
            L_0x0020:
                android.view.ViewParent r1 = r1.getParent()
                goto L_0x0012
            L_0x0025:
                r5 = 0
                r4.f2605l = r5
                r4.f2604k = r5
                return r2
            L_0x002b:
                r4.f2605l = r0
                r5 = 1
                return r5
        }

        /* renamed from: a */
        android.view.View m1667a(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4) {
                r2 = this;
                int r0 = r2.f2599f
                r1 = -1
                if (r0 != r1) goto L_0x000b
                r3 = 0
                r2.f2605l = r3
                r2.f2604k = r3
                return r3
            L_0x000b:
                android.view.View r0 = r2.f2604k
                if (r0 == 0) goto L_0x0015
                boolean r0 = r2.m1662b(r4, r3)
                if (r0 != 0) goto L_0x0018
            L_0x0015:
                r2.m1669a(r4, r3)
            L_0x0018:
                android.view.View r3 = r2.f2604k
                return r3
        }

        /* renamed from: a */
        void m1672a(int r2, boolean r3) {
                r1 = this;
                if (r2 == 0) goto L_0x0009
                r0 = 1
                if (r2 == r0) goto L_0x0006
                goto L_0x000b
            L_0x0006:
                r1.f2608o = r3
                goto L_0x000b
            L_0x0009:
                r1.f2607n = r3
            L_0x000b:
                return
        }

        /* renamed from: a */
        void m1671a(android.graphics.Rect r2) {
                r1 = this;
                android.graphics.Rect r0 = r1.f2610q
                r0.set(r2)
                return
        }

        /* renamed from: a */
        public void m1668a(androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c r2) {
                r1 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f2594a
                if (r0 == r2) goto L_0x0013
                if (r0 == 0) goto L_0x0009
                r0.m1685a()
            L_0x0009:
                r1.f2594a = r2
                r0 = 1
                r1.f2595b = r0
                if (r2 == 0) goto L_0x0013
                r2.mo31a(r1)
            L_0x0013:
                return
        }

        /* renamed from: a */
        void m1665a(boolean r1) {
                r0 = this;
                r0.f2609p = r1
                return
        }

        /* renamed from: a */
        boolean m1674a() {
                r2 = this;
                android.view.View r0 = r2.f2604k
                if (r0 != 0) goto L_0x000b
                int r0 = r2.f2599f
                r1 = -1
                if (r0 == r1) goto L_0x000b
                r0 = 1
                goto L_0x000c
            L_0x000b:
                r0 = 0
            L_0x000c:
                return r0
        }

        /* renamed from: a */
        boolean m1673a(int r2) {
                r1 = this;
                if (r2 == 0) goto L_0x000a
                r0 = 1
                if (r2 == r0) goto L_0x0007
                r2 = 0
                return r2
            L_0x0007:
                boolean r2 = r1.f2608o
                return r2
            L_0x000a:
                boolean r2 = r1.f2607n
                return r2
        }

        /* renamed from: a */
        boolean m1666a(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
                r1 = this;
                android.view.View r0 = r1.f2605l
                if (r4 == r0) goto L_0x001b
                int r0 = p000a.p018g.p029l.C0216r.m3411j(r2)
                boolean r0 = r1.m1670a(r4, r0)
                if (r0 != 0) goto L_0x001b
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f2594a
                if (r0 == 0) goto L_0x0019
                boolean r2 = r0.mo20a(r2, r3, r4)
                if (r2 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r2 = 0
                goto L_0x001c
            L_0x001b:
                r2 = 1
            L_0x001c:
                return r2
        }

        /* renamed from: b */
        void m1663b(int r2) {
                r1 = this;
                r0 = 0
                r1.m1672a(r2, r0)
                return
        }

        /* renamed from: b */
        boolean m1664b() {
                r1 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f2594a
                if (r0 != 0) goto L_0x0007
                r0 = 0
                r1.f2606m = r0
            L_0x0007:
                boolean r0 = r1.f2606m
                return r0
        }

        /* renamed from: b */
        boolean m1661b(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4) {
                r2 = this;
                boolean r0 = r2.f2606m
                if (r0 == 0) goto L_0x0006
                r3 = 1
                return r3
            L_0x0006:
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r1 = r2.f2594a
                if (r1 == 0) goto L_0x000f
                boolean r3 = r1.m1684a(r3, r4)
                goto L_0x0010
            L_0x000f:
                r3 = 0
            L_0x0010:
                r3 = r3 | r0
                r2.f2606m = r3
                return r3
        }

        /* renamed from: c */
        public int m1660c() {
                r1 = this;
                int r0 = r1.f2599f
                return r0
        }

        /* renamed from: d */
        public androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c m1659d() {
                r1 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f2594a
                return r0
        }

        /* renamed from: e */
        boolean m1658e() {
                r1 = this;
                boolean r0 = r1.f2609p
                return r0
        }

        /* renamed from: f */
        android.graphics.Rect m1657f() {
                r1 = this;
                android.graphics.Rect r0 = r1.f2610q
                return r0
        }

        /* renamed from: g */
        void m1656g() {
                r1 = this;
                r0 = 0
                r1.f2609p = r0
                return
        }

        /* renamed from: h */
        void m1655h() {
                r1 = this;
                r0 = 0
                r1.f2606m = r0
                return
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    /* loaded from: classes.dex */
    class ViewTreeObserver$OnPreDrawListenerC0681g implements android.view.ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout f2611b;

        ViewTreeObserver$OnPreDrawListenerC0681g(androidx.coordinatorlayout.widget.CoordinatorLayout r1) {
                r0 = this;
                r0.f2611b = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
                r2 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.f2611b
                r1 = 0
                r0.m1725a(r1)
                r0 = 1
                return r0
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    /* loaded from: classes.dex */
    protected static class C0682h extends p000a.p033i.p034a.AbstractC0237a {
        public static final android.os.Parcelable.Creator<androidx.coordinatorlayout.widget.CoordinatorLayout.C0682h> CREATOR = null;

        /* renamed from: d */
        android.util.SparseArray<android.os.Parcelable> f2612d;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        /* loaded from: classes.dex */
        static class C0683a implements android.os.Parcelable.ClassLoaderCreator<androidx.coordinatorlayout.widget.CoordinatorLayout.C0682h> {
            C0683a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public androidx.coordinatorlayout.widget.CoordinatorLayout.C0682h createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    androidx.coordinatorlayout.widget.CoordinatorLayout$h r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$h
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public androidx.coordinatorlayout.widget.CoordinatorLayout.C0682h createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    androidx.coordinatorlayout.widget.CoordinatorLayout$h r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$h
                    r0.<init>(r2, r3)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                    r0 = this;
                    androidx.coordinatorlayout.widget.CoordinatorLayout$h r1 = r0.createFromParcel(r1)
                    return r1
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout.C0682h createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                    r0 = this;
                    androidx.coordinatorlayout.widget.CoordinatorLayout$h r1 = r0.createFromParcel(r1, r2)
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public androidx.coordinatorlayout.widget.CoordinatorLayout.C0682h[] newArray(int r1) {
                    r0 = this;
                    androidx.coordinatorlayout.widget.CoordinatorLayout$h[] r1 = new androidx.coordinatorlayout.widget.CoordinatorLayout.C0682h[r1]
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    androidx.coordinatorlayout.widget.CoordinatorLayout$h[] r1 = r0.newArray(r1)
                    return r1
            }
        }

        static {
                androidx.coordinatorlayout.widget.CoordinatorLayout$h$a r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$h$a
                r0.<init>()
                androidx.coordinatorlayout.widget.CoordinatorLayout.C0682h.CREATOR = r0
                return
        }

        public C0682h(android.os.Parcel r6, java.lang.ClassLoader r7) {
                r5 = this;
                r5.<init>(r6, r7)
                int r0 = r6.readInt()
                int[] r1 = new int[r0]
                r6.readIntArray(r1)
                android.os.Parcelable[] r6 = r6.readParcelableArray(r7)
                android.util.SparseArray r7 = new android.util.SparseArray
                r7.<init>(r0)
                r5.f2612d = r7
                r7 = 0
            L_0x0018:
                if (r7 >= r0) goto L_0x0026
                android.util.SparseArray<android.os.Parcelable> r2 = r5.f2612d
                r3 = r1[r7]
                r4 = r6[r7]
                r2.append(r3, r4)
                int r7 = r7 + 1
                goto L_0x0018
            L_0x0026:
                return
        }

        public C0682h(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // p000a.p033i.p034a.AbstractC0237a, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r6, int r7) {
                r5 = this;
                super.writeToParcel(r6, r7)
                android.util.SparseArray<android.os.Parcelable> r0 = r5.f2612d
                r1 = 0
                if (r0 == 0) goto L_0x000d
                int r0 = r0.size()
                goto L_0x000e
            L_0x000d:
                r0 = 0
            L_0x000e:
                r6.writeInt(r0)
                int[] r2 = new int[r0]
                android.os.Parcelable[] r3 = new android.os.Parcelable[r0]
            L_0x0015:
                if (r1 >= r0) goto L_0x002c
                android.util.SparseArray<android.os.Parcelable> r4 = r5.f2612d
                int r4 = r4.keyAt(r1)
                r2[r1] = r4
                android.util.SparseArray<android.os.Parcelable> r4 = r5.f2612d
                java.lang.Object r4 = r4.valueAt(r1)
                android.os.Parcelable r4 = (android.os.Parcelable) r4
                r3[r1] = r4
                int r1 = r1 + 1
                goto L_0x0015
            L_0x002c:
                r6.writeIntArray(r2)
                r6.writeParcelableArray(r3, r7)
                return
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    /* loaded from: classes.dex */
    static class C0684i implements java.util.Comparator<android.view.View> {
        C0684i() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public int m1654a(android.view.View r2, android.view.View r3) {
                r1 = this;
                float r2 = p000a.p018g.p029l.C0216r.m3403r(r2)
                float r3 = p000a.p018g.p029l.C0216r.m3403r(r3)
                int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r0 <= 0) goto L_0x000e
                r2 = -1
                return r2
            L_0x000e:
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 >= 0) goto L_0x0014
                r2 = 1
                return r2
            L_0x0014:
                r2 = 0
                return r2
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(android.view.View r1, android.view.View r2) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                android.view.View r2 = (android.view.View) r2
                int r1 = r0.m1654a(r1, r2)
                return r1
        }
    }

    static {
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.getName()
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            androidx.coordinatorlayout.widget.CoordinatorLayout.f2568u = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x001f
            androidx.coordinatorlayout.widget.CoordinatorLayout$i r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$i
            r0.<init>()
            androidx.coordinatorlayout.widget.CoordinatorLayout.f2571x = r0
            goto L_0x0021
        L_0x001f:
            androidx.coordinatorlayout.widget.CoordinatorLayout.f2571x = r1
        L_0x0021:
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            androidx.coordinatorlayout.widget.CoordinatorLayout.f2569v = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.coordinatorlayout.widget.CoordinatorLayout.f2570w = r0
            a.g.k.f r0 = new a.g.k.f
            r1 = 12
            r0.<init>(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout.f2572y = r0
            return
    }

    public CoordinatorLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public CoordinatorLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = p000a.p017f.C0118a.coordinatorLayoutStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public CoordinatorLayout(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            r3.<init>(r4, r5, r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f2573b = r0
            androidx.coordinatorlayout.widget.a r0 = new androidx.coordinatorlayout.widget.a
            r0.<init>()
            r3.f2574c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f2575d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f2576e = r0
            r0 = 2
            int[] r0 = new int[r0]
            r3.f2577f = r0
            a.g.l.n r0 = new a.g.l.n
            r0.<init>(r3)
            r3.f2591t = r0
            r0 = 0
            if (r6 != 0) goto L_0x0037
            int[] r6 = p000a.p017f.C0120c.CoordinatorLayout
            int r1 = p000a.p017f.C0119b.Widget_Support_CoordinatorLayout
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r6, r0, r1)
            goto L_0x003d
        L_0x0037:
            int[] r1 = p000a.p017f.C0120c.CoordinatorLayout
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r1, r6, r0)
        L_0x003d:
            int r6 = p000a.p017f.C0120c.CoordinatorLayout_keylines
            int r6 = r5.getResourceId(r6, r0)
            if (r6 == 0) goto L_0x0067
            android.content.res.Resources r4 = r4.getResources()
            int[] r6 = r4.getIntArray(r6)
            r3.f2581j = r6
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            int[] r6 = r3.f2581j
            int r6 = r6.length
        L_0x0058:
            if (r0 >= r6) goto L_0x0067
            int[] r1 = r3.f2581j
            r2 = r1[r0]
            float r2 = (float) r2
            float r2 = r2 * r4
            int r2 = (int) r2
            r1[r0] = r2
            int r0 = r0 + 1
            goto L_0x0058
        L_0x0067:
            int r4 = p000a.p017f.C0120c.CoordinatorLayout_statusBarBackground
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r4)
            r3.f2588q = r4
            r5.recycle()
            r3.m1687f()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r4 = new androidx.coordinatorlayout.widget.CoordinatorLayout$e
            r4.<init>(r3)
            super.setOnHierarchyChangeListener(r4)
            return
    }

    /* renamed from: a */
    private static int m1724a(int r0, int r1, int r2) {
            if (r0 >= r1) goto L_0x0003
            return r1
        L_0x0003:
            if (r0 <= r2) goto L_0x0006
            return r2
        L_0x0006:
            return r0
    }

    /* renamed from: a */
    static androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c m1722a(android.content.Context r4, android.util.AttributeSet r5, java.lang.String r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x0008
            r4 = 0
            return r4
        L_0x0008:
            java.lang.String r0 = "."
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L_0x0024
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.getPackageName()
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            goto L_0x0049
        L_0x0024:
            r0 = 46
            int r1 = r6.indexOf(r0)
            if (r1 < 0) goto L_0x002d
            goto L_0x0049
        L_0x002d:
            java.lang.String r1 = androidx.coordinatorlayout.widget.CoordinatorLayout.f2568u
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0049
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = androidx.coordinatorlayout.widget.CoordinatorLayout.f2568u
            r1.append(r2)
            r1.append(r0)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
        L_0x0049:
            java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.reflect.Constructor<androidx.coordinatorlayout.widget.CoordinatorLayout$c>>> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.f2570w     // Catch: Exception -> 0x0089
            java.lang.Object r0 = r0.get()     // Catch: Exception -> 0x0089
            java.util.Map r0 = (java.util.Map) r0     // Catch: Exception -> 0x0089
            if (r0 != 0) goto L_0x005d
            java.util.HashMap r0 = new java.util.HashMap     // Catch: Exception -> 0x0089
            r0.<init>()     // Catch: Exception -> 0x0089
            java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.reflect.Constructor<androidx.coordinatorlayout.widget.CoordinatorLayout$c>>> r1 = androidx.coordinatorlayout.widget.CoordinatorLayout.f2570w     // Catch: Exception -> 0x0089
            r1.set(r0)     // Catch: Exception -> 0x0089
        L_0x005d:
            java.lang.Object r1 = r0.get(r6)     // Catch: Exception -> 0x0089
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1     // Catch: Exception -> 0x0089
            r2 = 1
            if (r1 != 0) goto L_0x007a
            java.lang.ClassLoader r1 = r4.getClassLoader()     // Catch: Exception -> 0x0089
            java.lang.Class r1 = r1.loadClass(r6)     // Catch: Exception -> 0x0089
            java.lang.Class<?>[] r3 = androidx.coordinatorlayout.widget.CoordinatorLayout.f2569v     // Catch: Exception -> 0x0089
            java.lang.reflect.Constructor r1 = r1.getConstructor(r3)     // Catch: Exception -> 0x0089
            r1.setAccessible(r2)     // Catch: Exception -> 0x0089
            r0.put(r6, r1)     // Catch: Exception -> 0x0089
        L_0x007a:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: Exception -> 0x0089
            r3 = 0
            r0[r3] = r4     // Catch: Exception -> 0x0089
            r0[r2] = r5     // Catch: Exception -> 0x0089
            java.lang.Object r4 = r1.newInstance(r0)     // Catch: Exception -> 0x0089
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c) r4     // Catch: Exception -> 0x0089
            return r4
        L_0x0089:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Could not inflate Behavior subclass "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6, r4)
            throw r5
    }

    /* renamed from: a */
    private static void m1721a(android.graphics.Rect r1) {
            r1.setEmpty()
            a.g.k.d<android.graphics.Rect> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.f2572y
            r0.mo3558a(r1)
            return
    }

    /* renamed from: a */
    private void m1715a(android.view.View r6, int r7, android.graphics.Rect r8, android.graphics.Rect r9, androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f r10, int r11, int r12) {
            r5 = this;
            int r6 = r10.f2596c
            int r6 = m1699c(r6)
            int r6 = p000a.p018g.p029l.C0200c.m3490a(r6, r7)
            int r10 = r10.f2597d
            int r10 = m1694d(r10)
            int r7 = p000a.p018g.p029l.C0200c.m3490a(r10, r7)
            r10 = r6 & 7
            r6 = r6 & 112(0x70, float:1.57E-43)
            r0 = r7 & 7
            r7 = r7 & 112(0x70, float:1.57E-43)
            r1 = 5
            r2 = 1
            if (r0 == r2) goto L_0x0028
            if (r0 == r1) goto L_0x0025
            int r0 = r8.left
            goto L_0x0031
        L_0x0025:
            int r0 = r8.right
            goto L_0x0031
        L_0x0028:
            int r0 = r8.left
            int r3 = r8.width()
            int r3 = r3 / 2
            int r0 = r0 + r3
        L_0x0031:
            r3 = 80
            r4 = 16
            if (r7 == r4) goto L_0x003f
            if (r7 == r3) goto L_0x003c
            int r7 = r8.top
            goto L_0x0048
        L_0x003c:
            int r7 = r8.bottom
            goto L_0x0048
        L_0x003f:
            int r7 = r8.top
            int r8 = r8.height()
            int r8 = r8 / 2
            int r7 = r7 + r8
        L_0x0048:
            if (r10 == r2) goto L_0x004e
            if (r10 == r1) goto L_0x0051
            int r0 = r0 - r11
            goto L_0x0051
        L_0x004e:
            int r8 = r11 / 2
            int r0 = r0 - r8
        L_0x0051:
            if (r6 == r4) goto L_0x0057
            if (r6 == r3) goto L_0x005a
            int r7 = r7 - r12
            goto L_0x005a
        L_0x0057:
            int r6 = r12 / 2
            int r7 = r7 - r6
        L_0x005a:
            int r11 = r11 + r0
            int r12 = r12 + r7
            r9.set(r0, r7, r11, r12)
            return
    }

    /* renamed from: a */
    private void m1713a(android.view.View r9, android.graphics.Rect r10, int r11) {
            r8 = this;
            boolean r0 = p000a.p018g.p029l.C0216r.m3397x(r9)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            int r0 = r9.getWidth()
            if (r0 <= 0) goto L_0x00fc
            int r0 = r9.getHeight()
            if (r0 > 0) goto L_0x0015
            goto L_0x00fc
        L_0x0015:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r1 = r0.m1659d()
            android.graphics.Rect r2 = m1695d()
            android.graphics.Rect r3 = m1695d()
            int r4 = r9.getLeft()
            int r5 = r9.getTop()
            int r6 = r9.getRight()
            int r7 = r9.getBottom()
            r3.set(r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0070
            boolean r1 = r1.mo209a(r8, r9, r2)
            if (r1 == 0) goto L_0x0070
            boolean r1 = r3.contains(r2)
            if (r1 == 0) goto L_0x0049
            goto L_0x0073
        L_0x0049:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Rect should be within the child's bounds. Rect:"
            r10.append(r11)
            java.lang.String r11 = r2.toShortString()
            r10.append(r11)
            java.lang.String r11 = " | Bounds:"
            r10.append(r11)
            java.lang.String r11 = r3.toShortString()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0070:
            r2.set(r3)
        L_0x0073:
            m1721a(r3)
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x0080
            m1721a(r2)
            return
        L_0x0080:
            int r1 = r0.f2601h
            int r11 = p000a.p018g.p029l.C0200c.m3490a(r1, r11)
            r1 = r11 & 48
            r3 = 48
            r4 = 1
            r5 = 0
            if (r1 != r3) goto L_0x00a0
            int r1 = r2.top
            int r3 = r0.topMargin
            int r1 = r1 - r3
            int r3 = r0.f2603j
            int r1 = r1 - r3
            int r3 = r10.top
            if (r1 >= r3) goto L_0x00a0
            int r3 = r3 - r1
            r8.m1686f(r9, r3)
            r1 = 1
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            r3 = r11 & 80
            r6 = 80
            if (r3 != r6) goto L_0x00bd
            int r3 = r8.getHeight()
            int r6 = r2.bottom
            int r3 = r3 - r6
            int r6 = r0.bottomMargin
            int r3 = r3 - r6
            int r6 = r0.f2603j
            int r3 = r3 + r6
            int r6 = r10.bottom
            if (r3 >= r6) goto L_0x00bd
            int r3 = r3 - r6
            r8.m1686f(r9, r3)
            r1 = 1
        L_0x00bd:
            if (r1 != 0) goto L_0x00c2
            r8.m1686f(r9, r5)
        L_0x00c2:
            r1 = r11 & 3
            r3 = 3
            if (r1 != r3) goto L_0x00d9
            int r1 = r2.left
            int r3 = r0.leftMargin
            int r1 = r1 - r3
            int r3 = r0.f2602i
            int r1 = r1 - r3
            int r3 = r10.left
            if (r1 >= r3) goto L_0x00d9
            int r3 = r3 - r1
            r8.m1688e(r9, r3)
            r1 = 1
            goto L_0x00da
        L_0x00d9:
            r1 = 0
        L_0x00da:
            r3 = 5
            r11 = r11 & r3
            if (r11 != r3) goto L_0x00f4
            int r11 = r8.getWidth()
            int r3 = r2.right
            int r11 = r11 - r3
            int r3 = r0.rightMargin
            int r11 = r11 - r3
            int r0 = r0.f2602i
            int r11 = r11 + r0
            int r10 = r10.right
            if (r11 >= r10) goto L_0x00f4
            int r11 = r11 - r10
            r8.m1688e(r9, r11)
            r1 = 1
        L_0x00f4:
            if (r1 != 0) goto L_0x00f9
            r8.m1688e(r9, r5)
        L_0x00f9:
            m1721a(r2)
        L_0x00fc:
            return
    }

    /* renamed from: a */
    private void m1712a(android.view.View r5, android.view.View r6, int r7) {
            r4 = this;
            android.graphics.Rect r0 = m1695d()
            android.graphics.Rect r1 = m1695d()
            r4.m1714a(r6, r0)     // Catch: all -> 0x0020
            r4.m1716a(r5, r7, r0, r1)     // Catch: all -> 0x0020
            int r6 = r1.left     // Catch: all -> 0x0020
            int r7 = r1.top     // Catch: all -> 0x0020
            int r2 = r1.right     // Catch: all -> 0x0020
            int r3 = r1.bottom     // Catch: all -> 0x0020
            r5.layout(r6, r7, r2, r3)     // Catch: all -> 0x0020
            m1721a(r0)
            m1721a(r1)
            return
        L_0x0020:
            r5 = move-exception
            m1721a(r0)
            m1721a(r1)
            throw r5
    }

    /* renamed from: a */
    private void m1710a(androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f r6, android.graphics.Rect r7, int r8, int r9) {
            r5 = this;
            int r0 = r5.getWidth()
            int r1 = r5.getHeight()
            int r2 = r5.getPaddingLeft()
            int r3 = r6.leftMargin
            int r2 = r2 + r3
            int r3 = r7.left
            int r4 = r5.getPaddingRight()
            int r0 = r0 - r4
            int r0 = r0 - r8
            int r4 = r6.rightMargin
            int r0 = r0 - r4
            int r0 = java.lang.Math.min(r3, r0)
            int r0 = java.lang.Math.max(r2, r0)
            int r2 = r5.getPaddingTop()
            int r3 = r6.topMargin
            int r2 = r2 + r3
            int r3 = r7.top
            int r4 = r5.getPaddingBottom()
            int r1 = r1 - r4
            int r1 = r1 - r9
            int r6 = r6.bottomMargin
            int r1 = r1 - r6
            int r6 = java.lang.Math.min(r3, r1)
            int r6 = java.lang.Math.max(r2, r6)
            int r8 = r8 + r0
            int r9 = r9 + r6
            r7.set(r0, r6, r8, r9)
            return
    }

    /* renamed from: a */
    private void m1709a(java.util.List<android.view.View> r5) {
            r4 = this;
            r5.clear()
            boolean r0 = r4.isChildrenDrawingOrderEnabled()
            int r1 = r4.getChildCount()
            int r2 = r1 + (-1)
        L_0x000d:
            if (r2 < 0) goto L_0x0021
            if (r0 == 0) goto L_0x0016
            int r3 = r4.getChildDrawingOrder(r1, r2)
            goto L_0x0017
        L_0x0016:
            r3 = r2
        L_0x0017:
            android.view.View r3 = r4.getChildAt(r3)
            r5.add(r3)
            int r2 = r2 + (-1)
            goto L_0x000d
        L_0x0021:
            java.util.Comparator<android.view.View> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.f2571x
            if (r0 == 0) goto L_0x0028
            java.util.Collections.sort(r5, r0)
        L_0x0028:
            return
    }

    /* renamed from: a */
    private void m1708a(boolean r14) {
            r13 = this;
            int r0 = r13.getChildCount()
            r1 = 0
            r2 = 0
        L_0x0006:
            if (r2 >= r0) goto L_0x0034
            android.view.View r3 = r13.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r4
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = r4.m1659d()
            if (r4 == 0) goto L_0x0031
            long r7 = android.os.SystemClock.uptimeMillis()
            r9 = 3
            r10 = 0
            r11 = 0
            r12 = 0
            r5 = r7
            android.view.MotionEvent r5 = android.view.MotionEvent.obtain(r5, r7, r9, r10, r11, r12)
            if (r14 == 0) goto L_0x002b
            r4.mo62a(r13, r3, r5)
            goto L_0x002e
        L_0x002b:
            r4.mo18b(r13, r3, r5)
        L_0x002e:
            r5.recycle()
        L_0x0031:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x0034:
            r14 = 0
        L_0x0035:
            if (r14 >= r0) goto L_0x0047
            android.view.View r2 = r13.getChildAt(r14)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r2
            r2.m1655h()
            int r14 = r14 + 1
            goto L_0x0035
        L_0x0047:
            r14 = 0
            r13.f2582k = r14
            r13.f2579h = r1
            return
    }

    /* renamed from: a */
    private boolean m1720a(android.view.MotionEvent r24, int r25) {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            int r3 = r24.getActionMasked()
            java.util.List<android.view.View> r4 = r0.f2575d
            r0.m1709a(r4)
            int r5 = r4.size()
            r6 = 0
            r7 = 0
            r10 = r7
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x0019:
            if (r7 >= r5) goto L_0x0082
            java.lang.Object r11 = r4.get(r7)
            android.view.View r11 = (android.view.View) r11
            android.view.ViewGroup$LayoutParams r12 = r11.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r12 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r12
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r13 = r12.m1659d()
            r14 = 1
            if (r8 != 0) goto L_0x0030
            if (r9 == 0) goto L_0x0055
        L_0x0030:
            if (r3 == 0) goto L_0x0055
            if (r13 == 0) goto L_0x007f
            if (r10 != 0) goto L_0x0048
            long r17 = android.os.SystemClock.uptimeMillis()
            r19 = 3
            r20 = 0
            r21 = 0
            r22 = 0
            r15 = r17
            android.view.MotionEvent r10 = android.view.MotionEvent.obtain(r15, r17, r19, r20, r21, r22)
        L_0x0048:
            if (r2 == 0) goto L_0x0051
            if (r2 == r14) goto L_0x004d
            goto L_0x007f
        L_0x004d:
            r13.mo18b(r0, r11, r10)
            goto L_0x007f
        L_0x0051:
            r13.mo62a(r0, r11, r10)
            goto L_0x007f
        L_0x0055:
            if (r8 != 0) goto L_0x006b
            if (r13 == 0) goto L_0x006b
            if (r2 == 0) goto L_0x0063
            if (r2 == r14) goto L_0x005e
            goto L_0x0067
        L_0x005e:
            boolean r8 = r13.mo18b(r0, r11, r1)
            goto L_0x0067
        L_0x0063:
            boolean r8 = r13.mo62a(r0, r11, r1)
        L_0x0067:
            if (r8 == 0) goto L_0x006b
            r0.f2582k = r11
        L_0x006b:
            boolean r9 = r12.m1664b()
            boolean r11 = r12.m1661b(r0, r11)
            if (r11 == 0) goto L_0x0078
            if (r9 != 0) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r14 = 0
        L_0x0079:
            if (r11 == 0) goto L_0x007e
            if (r14 != 0) goto L_0x007e
            goto L_0x0082
        L_0x007e:
            r9 = r14
        L_0x007f:
            int r7 = r7 + 1
            goto L_0x0019
        L_0x0082:
            r4.clear()
            return r8
    }

    /* renamed from: b */
    private int m1706b(int r5) {
            r4 = this;
            int[] r0 = r4.f2581j
            r1 = 0
            java.lang.String r2 = "CoordinatorLayout"
            if (r0 != 0) goto L_0x0024
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "No keylines defined for "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = " - attempted index lookup "
            r0.append(r3)
            r0.append(r5)
        L_0x001c:
            java.lang.String r5 = r0.toString()
            android.util.Log.e(r2, r5)
            return r1
        L_0x0024:
            if (r5 < 0) goto L_0x002d
            int r3 = r0.length
            if (r5 < r3) goto L_0x002a
            goto L_0x002d
        L_0x002a:
            r5 = r0[r5]
            return r5
        L_0x002d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Keyline index "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r5 = " out of range for "
            r0.append(r5)
            r0.append(r4)
            goto L_0x001c
    }

    /* renamed from: b */
    private p000a.p018g.p029l.C0230z m1705b(p000a.p018g.p029l.C0230z r5) {
            r4 = this;
            boolean r0 = r5.m3353g()
            if (r0 == 0) goto L_0x0007
            return r5
        L_0x0007:
            r0 = 0
            int r1 = r4.getChildCount()
        L_0x000c:
            if (r0 >= r1) goto L_0x0032
            android.view.View r2 = r4.getChildAt(r0)
            boolean r3 = p000a.p018g.p029l.C0216r.m3415g(r2)
            if (r3 == 0) goto L_0x002f
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r3
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r3 = r3.m1659d()
            if (r3 == 0) goto L_0x002f
            a.g.l.z r5 = r3.m1683a(r4, r2, r5)
            boolean r2 = r5.m3353g()
            if (r2 == 0) goto L_0x002f
            goto L_0x0032
        L_0x002f:
            int r0 = r0 + 1
            goto L_0x000c
        L_0x0032:
            return r5
    }

    /* renamed from: b */
    private void m1702b(android.view.View r9, int r10, int r11) {
            r8 = this;
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r0
            int r1 = r0.f2596c
            int r1 = m1690e(r1)
            int r1 = p000a.p018g.p029l.C0200c.m3490a(r1, r11)
            r2 = r1 & 7
            r1 = r1 & 112(0x70, float:1.57E-43)
            int r3 = r8.getWidth()
            int r4 = r8.getHeight()
            int r5 = r9.getMeasuredWidth()
            int r6 = r9.getMeasuredHeight()
            r7 = 1
            if (r11 != r7) goto L_0x0029
            int r10 = r3 - r10
        L_0x0029:
            int r10 = r8.m1706b(r10)
            int r10 = r10 - r5
            r11 = 0
            if (r2 == r7) goto L_0x0037
            r7 = 5
            if (r2 == r7) goto L_0x0035
            goto L_0x003a
        L_0x0035:
            int r10 = r10 + r5
            goto L_0x003a
        L_0x0037:
            int r2 = r5 / 2
            int r10 = r10 + r2
        L_0x003a:
            r2 = 16
            if (r1 == r2) goto L_0x0046
            r2 = 80
            if (r1 == r2) goto L_0x0043
            goto L_0x0049
        L_0x0043:
            int r11 = r6 + 0
            goto L_0x0049
        L_0x0046:
            int r1 = r6 / 2
            int r11 = r11 + r1
        L_0x0049:
            int r1 = r8.getPaddingLeft()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r8.getPaddingRight()
            int r3 = r3 - r2
            int r3 = r3 - r5
            int r2 = r0.rightMargin
            int r3 = r3 - r2
            int r10 = java.lang.Math.min(r10, r3)
            int r10 = java.lang.Math.max(r1, r10)
            int r1 = r8.getPaddingTop()
            int r2 = r0.topMargin
            int r1 = r1 + r2
            int r2 = r8.getPaddingBottom()
            int r4 = r4 - r2
            int r4 = r4 - r6
            int r0 = r0.bottomMargin
            int r4 = r4 - r0
            int r11 = java.lang.Math.min(r11, r4)
            int r11 = java.lang.Math.max(r1, r11)
            int r5 = r5 + r10
            int r6 = r6 + r11
            r9.layout(r10, r11, r5, r6)
            return
    }

    /* renamed from: c */
    private static int m1699c(int r0) {
            if (r0 != 0) goto L_0x0004
            r0 = 17
        L_0x0004:
            return r0
    }

    /* renamed from: d */
    private static int m1694d(int r1) {
            r0 = r1 & 7
            if (r0 != 0) goto L_0x0008
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r1 = r1 | r0
        L_0x0008:
            r0 = r1 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x000e
            r1 = r1 | 48
        L_0x000e:
            return r1
    }

    /* renamed from: d */
    private static android.graphics.Rect m1695d() {
            a.g.k.d<android.graphics.Rect> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.f2572y
            java.lang.Object r0 = r0.mo3559a()
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            if (r0 != 0) goto L_0x000f
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
        L_0x000f:
            return r0
    }

    /* renamed from: d */
    private void m1692d(android.view.View r10, int r11) {
            r9 = this;
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r0
            android.graphics.Rect r7 = m1695d()
            int r1 = r9.getPaddingLeft()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r9.getPaddingTop()
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r3 = r9.getWidth()
            int r4 = r9.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r0.rightMargin
            int r3 = r3 - r4
            int r4 = r9.getHeight()
            int r5 = r9.getPaddingBottom()
            int r4 = r4 - r5
            int r5 = r0.bottomMargin
            int r4 = r4 - r5
            r7.set(r1, r2, r3, r4)
            a.g.l.z r1 = r9.f2586o
            if (r1 == 0) goto L_0x006f
            boolean r1 = p000a.p018g.p029l.C0216r.m3415g(r9)
            if (r1 == 0) goto L_0x006f
            boolean r1 = p000a.p018g.p029l.C0216r.m3415g(r10)
            if (r1 != 0) goto L_0x006f
            int r1 = r7.left
            a.g.l.z r2 = r9.f2586o
            int r2 = r2.m3357c()
            int r1 = r1 + r2
            r7.left = r1
            int r1 = r7.top
            a.g.l.z r2 = r9.f2586o
            int r2 = r2.m3355e()
            int r1 = r1 + r2
            r7.top = r1
            int r1 = r7.right
            a.g.l.z r2 = r9.f2586o
            int r2 = r2.m3356d()
            int r1 = r1 - r2
            r7.right = r1
            int r1 = r7.bottom
            a.g.l.z r2 = r9.f2586o
            int r2 = r2.m3358b()
            int r1 = r1 - r2
            r7.bottom = r1
        L_0x006f:
            android.graphics.Rect r8 = m1695d()
            int r0 = r0.f2596c
            int r1 = m1694d(r0)
            int r2 = r10.getMeasuredWidth()
            int r3 = r10.getMeasuredHeight()
            r4 = r7
            r5 = r8
            r6 = r11
            p000a.p018g.p029l.C0200c.m3489a(r1, r2, r3, r4, r5, r6)
            int r11 = r8.left
            int r0 = r8.top
            int r1 = r8.right
            int r2 = r8.bottom
            r10.layout(r11, r0, r1, r2)
            m1721a(r7)
            m1721a(r8)
            return
    }

    /* renamed from: e */
    private static int m1690e(int r0) {
            if (r0 != 0) goto L_0x0005
            r0 = 8388661(0x800035, float:1.1755018E-38)
        L_0x0005:
            return r0
    }

    /* renamed from: e */
    private void m1691e() {
            r8 = this;
            java.util.List<android.view.View> r0 = r8.f2573b
            r0.clear()
            androidx.coordinatorlayout.widget.a<android.view.View> r0 = r8.f2574c
            r0.m1653a()
            int r0 = r8.getChildCount()
            r1 = 0
            r2 = 0
        L_0x0010:
            if (r2 >= r0) goto L_0x004a
            android.view.View r3 = r8.getChildAt(r2)
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = r8.m1693d(r3)
            r4.m1667a(r8, r3)
            androidx.coordinatorlayout.widget.a<android.view.View> r5 = r8.f2574c
            r5.m1652a(r3)
            r5 = 0
        L_0x0023:
            if (r5 >= r0) goto L_0x0047
            if (r5 != r2) goto L_0x0028
            goto L_0x0044
        L_0x0028:
            android.view.View r6 = r8.getChildAt(r5)
            boolean r7 = r4.m1666a(r8, r3, r6)
            if (r7 == 0) goto L_0x0044
            androidx.coordinatorlayout.widget.a<android.view.View> r7 = r8.f2574c
            boolean r7 = r7.m1647b(r6)
            if (r7 != 0) goto L_0x003f
            androidx.coordinatorlayout.widget.a<android.view.View> r7 = r8.f2574c
            r7.m1652a(r6)
        L_0x003f:
            androidx.coordinatorlayout.widget.a<android.view.View> r7 = r8.f2574c
            r7.m1651a(r6, r3)
        L_0x0044:
            int r5 = r5 + 1
            goto L_0x0023
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x004a:
            java.util.List<android.view.View> r0 = r8.f2573b
            androidx.coordinatorlayout.widget.a<android.view.View> r1 = r8.f2574c
            java.util.ArrayList r1 = r1.m1648b()
            r0.addAll(r1)
            java.util.List<android.view.View> r0 = r8.f2573b
            java.util.Collections.reverse(r0)
            return
    }

    /* renamed from: e */
    private void m1688e(android.view.View r3, int r4) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r0
            int r1 = r0.f2602i
            if (r1 == r4) goto L_0x0011
            int r1 = r4 - r1
            p000a.p018g.p029l.C0216r.m3422c(r3, r1)
            r0.f2602i = r4
        L_0x0011:
            return
    }

    /* renamed from: e */
    private boolean m1689e(android.view.View r2) {
            r1 = this;
            androidx.coordinatorlayout.widget.a<android.view.View> r0 = r1.f2574c
            boolean r2 = r0.m1643e(r2)
            return r2
    }

    /* renamed from: f */
    private void m1687f() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L_0x0007
            return
        L_0x0007:
            boolean r0 = p000a.p018g.p029l.C0216r.m3415g(r2)
            if (r0 == 0) goto L_0x0023
            a.g.l.o r0 = r2.f2590s
            if (r0 != 0) goto L_0x0018
            androidx.coordinatorlayout.widget.CoordinatorLayout$a r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$a
            r0.<init>(r2)
            r2.f2590s = r0
        L_0x0018:
            a.g.l.o r0 = r2.f2590s
            p000a.p018g.p029l.C0216r.m3439a(r2, r0)
            r0 = 1280(0x500, float:1.794E-42)
            r2.setSystemUiVisibility(r0)
            goto L_0x0027
        L_0x0023:
            r0 = 0
            p000a.p018g.p029l.C0216r.m3439a(r2, r0)
        L_0x0027:
            return
    }

    /* renamed from: f */
    private void m1686f(android.view.View r3, int r4) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r0
            int r1 = r0.f2603j
            if (r1 == r4) goto L_0x0011
            int r1 = r4 - r1
            p000a.p018g.p029l.C0216r.m3420d(r3, r1)
            r0.f2603j = r4
        L_0x0011:
            return
    }

    /* renamed from: a */
    final p000a.p018g.p029l.C0230z m1723a(p000a.p018g.p029l.C0230z r4) {
            r3 = this;
            a.g.l.z r0 = r3.f2586o
            boolean r0 = p000a.p018g.p028k.C0180c.m3562a(r0, r4)
            if (r0 != 0) goto L_0x002f
            r3.f2586o = r4
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L_0x0016
            int r2 = r4.m3355e()
            if (r2 <= 0) goto L_0x0016
            r2 = 1
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            r3.f2587p = r2
            boolean r2 = r3.f2587p
            if (r2 != 0) goto L_0x0024
            android.graphics.drawable.Drawable r2 = r3.getBackground()
            if (r2 != 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            r3.setWillNotDraw(r0)
            a.g.l.z r4 = r3.m1705b(r4)
            r3.requestLayout()
        L_0x002f:
            return r4
    }

    /* renamed from: a */
    void m1726a() {
            r2 = this;
            boolean r0 = r2.f2580i
            if (r0 == 0) goto L_0x0018
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r2.f2584m
            if (r0 != 0) goto L_0x000f
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$g
            r0.<init>(r2)
            r2.f2584m = r0
        L_0x000f:
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r2.f2584m
            r0.addOnPreDrawListener(r1)
        L_0x0018:
            r0 = 1
            r2.f2585n = r0
            return
    }

    /* renamed from: a */
    final void m1725a(int r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = p000a.p018g.p029l.C0216r.m3411j(r17)
            java.util.List<android.view.View> r3 = r0.f2573b
            int r3 = r3.size()
            android.graphics.Rect r4 = m1695d()
            android.graphics.Rect r5 = m1695d()
            android.graphics.Rect r6 = m1695d()
            r7 = 0
            r8 = 0
        L_0x001c:
            if (r8 >= r3) goto L_0x0107
            java.util.List<android.view.View> r9 = r0.f2573b
            java.lang.Object r9 = r9.get(r8)
            android.view.View r9 = (android.view.View) r9
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r10
            if (r1 != 0) goto L_0x0038
            int r11 = r9.getVisibility()
            r12 = 8
            if (r11 != r12) goto L_0x0038
            goto L_0x0103
        L_0x0038:
            r11 = 0
        L_0x0039:
            if (r11 >= r8) goto L_0x004d
            java.util.List<android.view.View> r12 = r0.f2573b
            java.lang.Object r12 = r12.get(r11)
            android.view.View r12 = (android.view.View) r12
            android.view.View r13 = r10.f2605l
            if (r13 != r12) goto L_0x004a
            r0.m1703b(r9, r2)
        L_0x004a:
            int r11 = r11 + 1
            goto L_0x0039
        L_0x004d:
            r11 = 1
            r0.m1711a(r9, r11, r5)
            int r12 = r10.f2600g
            if (r12 == 0) goto L_0x00a9
            boolean r12 = r5.isEmpty()
            if (r12 != 0) goto L_0x00a9
            int r12 = r10.f2600g
            int r12 = p000a.p018g.p029l.C0200c.m3490a(r12, r2)
            r13 = r12 & 112(0x70, float:1.57E-43)
            r14 = 48
            if (r13 == r14) goto L_0x007c
            r14 = 80
            if (r13 == r14) goto L_0x006c
            goto L_0x0086
        L_0x006c:
            int r13 = r4.bottom
            int r14 = r17.getHeight()
            int r15 = r5.top
            int r14 = r14 - r15
            int r13 = java.lang.Math.max(r13, r14)
            r4.bottom = r13
            goto L_0x0086
        L_0x007c:
            int r13 = r4.top
            int r14 = r5.bottom
            int r13 = java.lang.Math.max(r13, r14)
            r4.top = r13
        L_0x0086:
            r12 = r12 & 7
            r13 = 3
            if (r12 == r13) goto L_0x009f
            r13 = 5
            if (r12 == r13) goto L_0x008f
            goto L_0x00a9
        L_0x008f:
            int r12 = r4.right
            int r13 = r17.getWidth()
            int r14 = r5.left
            int r13 = r13 - r14
            int r12 = java.lang.Math.max(r12, r13)
            r4.right = r12
            goto L_0x00a9
        L_0x009f:
            int r12 = r4.left
            int r13 = r5.right
            int r12 = java.lang.Math.max(r12, r13)
            r4.left = r12
        L_0x00a9:
            int r10 = r10.f2601h
            if (r10 == 0) goto L_0x00b6
            int r10 = r9.getVisibility()
            if (r10 != 0) goto L_0x00b6
            r0.m1713a(r9, r4, r2)
        L_0x00b6:
            r10 = 2
            if (r1 == r10) goto L_0x00c6
            r0.m1701b(r9, r6)
            boolean r12 = r6.equals(r5)
            if (r12 == 0) goto L_0x00c3
            goto L_0x0103
        L_0x00c3:
            r0.m1696c(r9, r5)
        L_0x00c6:
            int r12 = r8 + 1
        L_0x00c8:
            if (r12 >= r3) goto L_0x0103
            java.util.List<android.view.View> r13 = r0.f2573b
            java.lang.Object r13 = r13.get(r12)
            android.view.View r13 = (android.view.View) r13
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r14 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r14
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r15 = r14.m1659d()
            if (r15 == 0) goto L_0x0100
            boolean r16 = r15.mo20a(r0, r13, r9)
            if (r16 == 0) goto L_0x0100
            if (r1 != 0) goto L_0x00f0
            boolean r16 = r14.m1658e()
            if (r16 == 0) goto L_0x00f0
            r14.m1656g()
            goto L_0x0100
        L_0x00f0:
            if (r1 == r10) goto L_0x00f7
            boolean r13 = r15.mo43b(r0, r13, r9)
            goto L_0x00fb
        L_0x00f7:
            r15.m1676c(r0, r13, r9)
            r13 = 1
        L_0x00fb:
            if (r1 != r11) goto L_0x0100
            r14.m1665a(r13)
        L_0x0100:
            int r12 = r12 + 1
            goto L_0x00c8
        L_0x0103:
            int r8 = r8 + 1
            goto L_0x001c
        L_0x0107:
            m1721a(r4)
            m1721a(r5)
            m1721a(r6)
            return
    }

    /* renamed from: a */
    public void m1719a(android.view.View r5) {
            r4 = this;
            androidx.coordinatorlayout.widget.a<android.view.View> r0 = r4.f2574c
            java.util.List r0 = r0.m1645c(r5)
            if (r0 == 0) goto L_0x002d
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x002d
            r1 = 0
        L_0x000f:
            int r2 = r0.size()
            if (r1 >= r2) goto L_0x002d
            java.lang.Object r2 = r0.get(r1)
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r3
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r3 = r3.m1659d()
            if (r3 == 0) goto L_0x002a
            r3.mo43b(r4, r2, r5)
        L_0x002a:
            int r1 = r1 + 1
            goto L_0x000f
        L_0x002d:
            return
    }

    @Override // p000a.p018g.p029l.AbstractC0210l
    /* renamed from: a */
    public void mo1571a(android.view.View r6, int r7) {
            r5 = this;
            a.g.l.n r0 = r5.f2591t
            r0.m3453a(r6, r7)
            int r0 = r5.getChildCount()
            r1 = 0
        L_0x000a:
            if (r1 >= r0) goto L_0x002f
            android.view.View r2 = r5.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r3
            boolean r4 = r3.m1673a(r7)
            if (r4 != 0) goto L_0x001d
            goto L_0x002c
        L_0x001d:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = r3.m1659d()
            if (r4 == 0) goto L_0x0026
            r4.mo254a(r5, r2, r6, r7)
        L_0x0026:
            r3.m1663b(r7)
            r3.m1656g()
        L_0x002c:
            int r1 = r1 + 1
            goto L_0x000a
        L_0x002f:
            r6 = 0
            r5.f2583l = r6
            return
    }

    /* renamed from: a */
    public void m1717a(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            return
    }

    @Override // p000a.p018g.p029l.AbstractC0210l
    /* renamed from: a */
    public void mo1569a(android.view.View r15, int r16, int r17, int r18, int r19, int r20) {
            r14 = this;
            r9 = r14
            int r10 = r14.getChildCount()
            r0 = 0
            r11 = 0
        L_0x0007:
            r12 = 1
            if (r11 >= r10) goto L_0x0042
            android.view.View r2 = r14.getChildAt(r11)
            int r1 = r2.getVisibility()
            r3 = 8
            if (r1 != r3) goto L_0x0019
            r13 = r20
            goto L_0x003f
        L_0x0019:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r1
            r13 = r20
            boolean r3 = r1.m1673a(r13)
            if (r3 != 0) goto L_0x0028
            goto L_0x003f
        L_0x0028:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r1 = r1.m1659d()
            if (r1 == 0) goto L_0x003f
            r0 = r1
            r1 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r0.mo375a(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 1
        L_0x003f:
            int r11 = r11 + 1
            goto L_0x0007
        L_0x0042:
            if (r0 == 0) goto L_0x0047
            r14.m1725a(r12)
        L_0x0047:
            return
    }

    @Override // p000a.p018g.p029l.AbstractC0210l
    /* renamed from: a */
    public void mo1568a(android.view.View r17, int r18, int r19, int[] r20, int r21) {
            r16 = this;
            r8 = r16
            int r9 = r16.getChildCount()
            r10 = 0
            r0 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x000b:
            r14 = 1
            if (r11 >= r9) goto L_0x006e
            android.view.View r2 = r8.getChildAt(r11)
            int r1 = r2.getVisibility()
            r3 = 8
            if (r1 != r3) goto L_0x001d
            r15 = r21
            goto L_0x006b
        L_0x001d:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r1
            r15 = r21
            boolean r3 = r1.m1673a(r15)
            if (r3 != 0) goto L_0x002c
            goto L_0x006b
        L_0x002c:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r1 = r1.m1659d()
            if (r1 == 0) goto L_0x006b
            int[] r6 = r8.f2577f
            r6[r14] = r10
            r6[r10] = r10
            r0 = r1
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r7 = r21
            r0.mo253a(r1, r2, r3, r4, r5, r6, r7)
            int[] r0 = r8.f2577f
            if (r18 <= 0) goto L_0x0051
            r0 = r0[r10]
            int r0 = java.lang.Math.max(r12, r0)
            goto L_0x0057
        L_0x0051:
            r0 = r0[r10]
            int r0 = java.lang.Math.min(r12, r0)
        L_0x0057:
            int[] r1 = r8.f2577f
            if (r19 <= 0) goto L_0x0062
            r1 = r1[r14]
            int r1 = java.lang.Math.max(r13, r1)
            goto L_0x0068
        L_0x0062:
            r1 = r1[r14]
            int r1 = java.lang.Math.min(r13, r1)
        L_0x0068:
            r12 = r0
            r13 = r1
            r0 = 1
        L_0x006b:
            int r11 = r11 + 1
            goto L_0x000b
        L_0x006e:
            r20[r10] = r12
            r20[r14] = r13
            if (r0 == 0) goto L_0x0077
            r8.m1725a(r14)
        L_0x0077:
            return
    }

    /* renamed from: a */
    void m1716a(android.view.View r12, int r13, android.graphics.Rect r14, android.graphics.Rect r15) {
            r11 = this;
            android.view.ViewGroup$LayoutParams r0 = r12.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r0
            int r9 = r12.getMeasuredWidth()
            int r10 = r12.getMeasuredHeight()
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r0
            r7 = r9
            r8 = r10
            r1.m1715a(r2, r3, r4, r5, r6, r7, r8)
            r11.m1710a(r0, r15, r9, r10)
            return
    }

    /* renamed from: a */
    void m1714a(android.view.View r1, android.graphics.Rect r2) {
            r0 = this;
            androidx.coordinatorlayout.widget.C0686b.m1642a(r0, r1, r2)
            return
    }

    @Override // p000a.p018g.p029l.AbstractC0210l
    /* renamed from: a */
    public void mo1566a(android.view.View r10, android.view.View r11, int r12, int r13) {
            r9 = this;
            a.g.l.n r0 = r9.f2591t
            r0.m3451a(r10, r11, r12, r13)
            r9.f2583l = r11
            int r0 = r9.getChildCount()
            r1 = 0
        L_0x000c:
            if (r1 >= r0) goto L_0x0030
            android.view.View r4 = r9.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r2
            boolean r3 = r2.m1673a(r13)
            if (r3 != 0) goto L_0x001f
            goto L_0x002d
        L_0x001f:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r2 = r2.m1659d()
            if (r2 == 0) goto L_0x002d
            r3 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r2.m1679a(r3, r4, r5, r6, r7, r8)
        L_0x002d:
            int r1 = r1 + 1
            goto L_0x000c
        L_0x0030:
            return
    }

    /* renamed from: a */
    void m1711a(android.view.View r3, boolean r4, android.graphics.Rect r5) {
            r2 = this;
            boolean r0 = r3.isLayoutRequested()
            if (r0 != 0) goto L_0x0029
            int r0 = r3.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x000f
            goto L_0x0029
        L_0x000f:
            if (r4 == 0) goto L_0x0015
            r2.m1714a(r3, r5)
            goto L_0x0028
        L_0x0015:
            int r4 = r3.getLeft()
            int r0 = r3.getTop()
            int r1 = r3.getRight()
            int r3 = r3.getBottom()
            r5.set(r4, r0, r1, r3)
        L_0x0028:
            return
        L_0x0029:
            r5.setEmpty()
            return
    }

    /* renamed from: a */
    public boolean m1718a(android.view.View r2, int r3, int r4) {
            r1 = this;
            android.graphics.Rect r0 = m1695d()
            r1.m1714a(r2, r0)
            boolean r2 = r0.contains(r3, r4)     // Catch: all -> 0x000f
            m1721a(r0)
            return r2
        L_0x000f:
            r2 = move-exception
            m1721a(r0)
            throw r2
    }

    /* renamed from: b */
    public java.util.List<android.view.View> m1704b(android.view.View r2) {
            r1 = this;
            androidx.coordinatorlayout.widget.a<android.view.View> r0 = r1.f2574c
            java.util.List r2 = r0.m1644d(r2)
            java.util.List<android.view.View> r0 = r1.f2576e
            r0.clear()
            if (r2 == 0) goto L_0x0012
            java.util.List<android.view.View> r0 = r1.f2576e
            r0.addAll(r2)
        L_0x0012:
            java.util.List<android.view.View> r2 = r1.f2576e
            return r2
    }

    /* renamed from: b */
    void m1707b() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            r2 = 0
        L_0x0006:
            if (r2 >= r0) goto L_0x0017
            android.view.View r3 = r4.getChildAt(r2)
            boolean r3 = r4.m1689e(r3)
            if (r3 == 0) goto L_0x0014
            r1 = 1
            goto L_0x0017
        L_0x0014:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x0017:
            boolean r0 = r4.f2585n
            if (r1 == r0) goto L_0x0024
            if (r1 == 0) goto L_0x0021
            r4.m1726a()
            goto L_0x0024
        L_0x0021:
            r4.m1700c()
        L_0x0024:
            return
    }

    /* renamed from: b */
    void m1703b(android.view.View r17, int r18) {
            r16 = this;
            r8 = r16
            r9 = r17
            android.view.ViewGroup$LayoutParams r0 = r17.getLayoutParams()
            r10 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r10
            android.view.View r0 = r10.f2604k
            if (r0 == 0) goto L_0x0077
            android.graphics.Rect r11 = m1695d()
            android.graphics.Rect r12 = m1695d()
            android.graphics.Rect r13 = m1695d()
            android.view.View r0 = r10.f2604k
            r8.m1714a(r0, r11)
            r14 = 0
            r8.m1711a(r9, r14, r12)
            int r15 = r17.getMeasuredWidth()
            int r7 = r17.getMeasuredHeight()
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r11
            r4 = r13
            r5 = r10
            r6 = r15
            r18 = r7
            r0.m1715a(r1, r2, r3, r4, r5, r6, r7)
            int r0 = r13.left
            int r1 = r12.left
            if (r0 != r1) goto L_0x0047
            int r0 = r13.top
            int r1 = r12.top
            if (r0 == r1) goto L_0x0048
        L_0x0047:
            r14 = 1
        L_0x0048:
            r0 = r18
            r8.m1710a(r10, r13, r15, r0)
            int r0 = r13.left
            int r1 = r12.left
            int r0 = r0 - r1
            int r1 = r13.top
            int r2 = r12.top
            int r1 = r1 - r2
            if (r0 == 0) goto L_0x005c
            p000a.p018g.p029l.C0216r.m3422c(r9, r0)
        L_0x005c:
            if (r1 == 0) goto L_0x0061
            p000a.p018g.p029l.C0216r.m3420d(r9, r1)
        L_0x0061:
            if (r14 == 0) goto L_0x006e
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r10.m1659d()
            if (r0 == 0) goto L_0x006e
            android.view.View r1 = r10.f2604k
            r0.mo43b(r8, r9, r1)
        L_0x006e:
            m1721a(r11)
            m1721a(r12)
            m1721a(r13)
        L_0x0077:
            return
    }

    /* renamed from: b */
    void m1701b(android.view.View r1, android.graphics.Rect r2) {
            r0 = this;
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r1
            android.graphics.Rect r1 = r1.m1657f()
            r2.set(r1)
            return
    }

    @Override // p000a.p018g.p029l.AbstractC0210l
    /* renamed from: b */
    public boolean mo1559b(android.view.View r15, android.view.View r16, int r17, int r18) {
            r14 = this;
            r7 = r18
            int r8 = r14.getChildCount()
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0009:
            r12 = r14
            if (r10 >= r8) goto L_0x003f
            android.view.View r2 = r14.getChildAt(r10)
            int r0 = r2.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0019
            goto L_0x003c
        L_0x0019:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r13 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r13 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r13
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r13.m1659d()
            if (r0 == 0) goto L_0x0039
            r1 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            boolean r0 = r0.mo248b(r1, r2, r3, r4, r5, r6)
            r1 = r11 | r0
            r13.m1672a(r7, r0)
            r11 = r1
            goto L_0x003c
        L_0x0039:
            r13.m1672a(r7, r9)
        L_0x003c:
            int r10 = r10 + 1
            goto L_0x0009
        L_0x003f:
            return r11
    }

    /* renamed from: c */
    public java.util.List<android.view.View> m1698c(android.view.View r2) {
            r1 = this;
            androidx.coordinatorlayout.widget.a<android.view.View> r0 = r1.f2574c
            java.util.List r2 = r0.m1645c(r2)
            java.util.List<android.view.View> r0 = r1.f2576e
            r0.clear()
            if (r2 == 0) goto L_0x0012
            java.util.List<android.view.View> r0 = r1.f2576e
            r0.addAll(r2)
        L_0x0012:
            java.util.List<android.view.View> r2 = r1.f2576e
            return r2
    }

    /* renamed from: c */
    void m1700c() {
            r2 = this;
            boolean r0 = r2.f2580i
            if (r0 == 0) goto L_0x0011
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r2.f2584m
            if (r0 == 0) goto L_0x0011
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r2.f2584m
            r0.removeOnPreDrawListener(r1)
        L_0x0011:
            r0 = 0
            r2.f2585n = r0
            return
    }

    /* renamed from: c */
    public void m1697c(android.view.View r3, int r4) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r0
            boolean r1 = r0.m1674a()
            if (r1 != 0) goto L_0x0020
            android.view.View r1 = r0.f2604k
            if (r1 == 0) goto L_0x0014
            r2.m1712a(r3, r1, r4)
            goto L_0x001f
        L_0x0014:
            int r0 = r0.f2598e
            if (r0 < 0) goto L_0x001c
            r2.m1702b(r3, r0, r4)
            goto L_0x001f
        L_0x001c:
            r2.m1692d(r3, r4)
        L_0x001f:
            return
        L_0x0020:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete."
            r3.<init>(r4)
            throw r3
    }

    /* renamed from: c */
    void m1696c(android.view.View r1, android.graphics.Rect r2) {
            r0 = this;
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r1
            r1.m1671a(r2)
            return
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f
            if (r0 == 0) goto L_0x000c
            boolean r2 = super.checkLayoutParams(r2)
            if (r2 == 0) goto L_0x000c
            r2 = 1
            goto L_0x000d
        L_0x000c:
            r2 = 0
        L_0x000d:
            return r2
    }

    /* renamed from: d */
    androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f m1693d(android.view.View r7) {
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r0
            boolean r1 = r0.f2595b
            if (r1 != 0) goto L_0x007b
            boolean r1 = r7 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0676b
            java.lang.String r2 = "CoordinatorLayout"
            r3 = 1
            if (r1 == 0) goto L_0x0024
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r7 = (androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0676b) r7
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r7 = r7.getBehavior()
            if (r7 != 0) goto L_0x001e
            java.lang.String r1 = "Attached behavior class is null"
            android.util.Log.e(r2, r1)
        L_0x001e:
            r0.m1668a(r7)
        L_0x0021:
            r0.f2595b = r3
            goto L_0x007b
        L_0x0024:
            java.lang.Class r7 = r7.getClass()
            r1 = 0
        L_0x0029:
            if (r7 == 0) goto L_0x003a
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout$d> r1 = androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0678d.class
            java.lang.annotation.Annotation r1 = r7.getAnnotation(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout$d r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0678d) r1
            if (r1 != 0) goto L_0x003a
            java.lang.Class r7 = r7.getSuperclass()
            goto L_0x0029
        L_0x003a:
            if (r1 == 0) goto L_0x0021
            java.lang.Class r7 = r1.value()     // Catch: Exception -> 0x0053
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: Exception -> 0x0053
            java.lang.reflect.Constructor r7 = r7.getDeclaredConstructor(r5)     // Catch: Exception -> 0x0053
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: Exception -> 0x0053
            java.lang.Object r7 = r7.newInstance(r4)     // Catch: Exception -> 0x0053
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r7 = (androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c) r7     // Catch: Exception -> 0x0053
            r0.m1668a(r7)     // Catch: Exception -> 0x0053
            goto L_0x0021
        L_0x0053:
            r7 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Default behavior class "
            r4.append(r5)
            java.lang.Class r1 = r1.value()
            java.lang.String r1 = r1.getName()
            r4.append(r1)
            java.lang.String r1 = " could not be instantiated. Did you forget"
            r4.append(r1)
            java.lang.String r1 = " a default constructor?"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            android.util.Log.e(r2, r1, r7)
            goto L_0x0021
        L_0x007b:
            return r0
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(android.graphics.Canvas r9, android.view.View r10, long r11) {
            r8 = this;
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r1 = r0.f2594a
            if (r1 == 0) goto L_0x0088
            float r1 = r1.m1677c(r8, r10)
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0088
            android.graphics.Paint r2 = r8.f2578g
            if (r2 != 0) goto L_0x001e
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r8.f2578g = r2
        L_0x001e:
            android.graphics.Paint r2 = r8.f2578g
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r0.f2594a
            int r0 = r0.m1678b(r8, r10)
            r2.setColor(r0)
            android.graphics.Paint r0 = r8.f2578g
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            r2 = 0
            r3 = 255(0xff, float:3.57E-43)
            int r1 = m1724a(r1, r2, r3)
            r0.setAlpha(r1)
            int r0 = r9.save()
            boolean r1 = r10.isOpaque()
            if (r1 == 0) goto L_0x0061
            int r1 = r10.getLeft()
            float r3 = (float) r1
            int r1 = r10.getTop()
            float r4 = (float) r1
            int r1 = r10.getRight()
            float r5 = (float) r1
            int r1 = r10.getBottom()
            float r6 = (float) r1
            android.graphics.Region$Op r7 = android.graphics.Region.Op.DIFFERENCE
            r2 = r9
            r2.clipRect(r3, r4, r5, r6, r7)
        L_0x0061:
            int r1 = r8.getPaddingLeft()
            float r3 = (float) r1
            int r1 = r8.getPaddingTop()
            float r4 = (float) r1
            int r1 = r8.getWidth()
            int r2 = r8.getPaddingRight()
            int r1 = r1 - r2
            float r5 = (float) r1
            int r1 = r8.getHeight()
            int r2 = r8.getPaddingBottom()
            int r1 = r1 - r2
            float r6 = (float) r1
            android.graphics.Paint r7 = r8.f2578g
            r2 = r9
            r2.drawRect(r3, r4, r5, r6, r7)
            r9.restoreToCount(r0)
        L_0x0088:
            boolean r9 = super.drawChild(r9, r10, r11)
            return r9
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
            r4 = this;
            super.drawableStateChanged()
            int[] r0 = r4.getDrawableState()
            android.graphics.drawable.Drawable r1 = r4.f2588q
            r2 = 0
            if (r1 == 0) goto L_0x0017
            boolean r3 = r1.isStateful()
            if (r3 == 0) goto L_0x0017
            boolean r0 = r1.setState(r0)
            r2 = r2 | r0
        L_0x0017:
            if (r2 == 0) goto L_0x001c
            r4.invalidate()
        L_0x001c:
            return
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.view.ViewGroup
    protected androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f generateDefaultLayoutParams() {
            r2 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$f
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    public androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$f
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    protected androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f
            if (r0 == 0) goto L_0x000c
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$f
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r2
            r0.<init>(r2)
            return r0
        L_0x000c:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0018
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$f
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            return r0
        L_0x0018:
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$f
            r0.<init>(r2)
            return r0
    }

    final java.util.List<android.view.View> getDependencySortedChildren() {
            r1 = this;
            r1.m1691e()
            java.util.List<android.view.View> r0 = r1.f2573b
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public final p000a.p018g.p029l.C0230z getLastWindowInsets() {
            r1 = this;
            a.g.l.z r0 = r1.f2586o
            return r0
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
            r1 = this;
            a.g.l.n r0 = r1.f2591t
            int r0 = r0.m3454a()
            return r0
    }

    public android.graphics.drawable.Drawable getStatusBarBackground() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2588q
            return r0
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
            r3 = this;
            int r0 = super.getSuggestedMinimumHeight()
            int r1 = r3.getPaddingTop()
            int r2 = r3.getPaddingBottom()
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
            r3 = this;
            int r0 = super.getSuggestedMinimumWidth()
            int r1 = r3.getPaddingLeft()
            int r2 = r3.getPaddingRight()
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            r0 = 0
            r2.m1708a(r0)
            boolean r0 = r2.f2585n
            if (r0 == 0) goto L_0x001f
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r2.f2584m
            if (r0 != 0) goto L_0x0016
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$g
            r0.<init>(r2)
            r2.f2584m = r0
        L_0x0016:
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r2.f2584m
            r0.addOnPreDrawListener(r1)
        L_0x001f:
            a.g.l.z r0 = r2.f2586o
            if (r0 != 0) goto L_0x002c
            boolean r0 = p000a.p018g.p029l.C0216r.m3415g(r2)
            if (r0 == 0) goto L_0x002c
            p000a.p018g.p029l.C0216r.m3449B(r2)
        L_0x002c:
            r0 = 1
            r2.f2580i = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r3 = this;
            super.onDetachedFromWindow()
            r0 = 0
            r3.m1708a(r0)
            boolean r1 = r3.f2585n
            if (r1 == 0) goto L_0x0018
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r3.f2584m
            if (r1 == 0) goto L_0x0018
            android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r2 = r3.f2584m
            r1.removeOnPreDrawListener(r2)
        L_0x0018:
            android.view.View r1 = r3.f2583l
            if (r1 == 0) goto L_0x001f
            r3.onStopNestedScroll(r1)
        L_0x001f:
            r3.f2580i = r0
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.f2587p
            if (r0 == 0) goto L_0x0026
            android.graphics.drawable.Drawable r0 = r4.f2588q
            if (r0 == 0) goto L_0x0026
            a.g.l.z r0 = r4.f2586o
            r1 = 0
            if (r0 == 0) goto L_0x0015
            int r0 = r0.m3355e()
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 <= 0) goto L_0x0026
            android.graphics.drawable.Drawable r2 = r4.f2588q
            int r3 = r4.getWidth()
            r2.setBounds(r1, r1, r3, r0)
            android.graphics.drawable.Drawable r0 = r4.f2588q
            r0.draw(r5)
        L_0x0026:
            return
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionMasked()
            r1 = 1
            if (r0 != 0) goto L_0x000a
            r3.m1708a(r1)
        L_0x000a:
            r2 = 0
            boolean r4 = r3.m1720a(r4, r2)
            if (r0 == r1) goto L_0x0014
            r2 = 3
            if (r0 != r2) goto L_0x0017
        L_0x0014:
            r3.m1708a(r1)
        L_0x0017:
            return r4
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            int r2 = p000a.p018g.p029l.C0216r.m3411j(r1)
            java.util.List<android.view.View> r3 = r1.f2573b
            int r3 = r3.size()
            r4 = 0
        L_0x000b:
            if (r4 >= r3) goto L_0x0036
            java.util.List<android.view.View> r5 = r1.f2573b
            java.lang.Object r5 = r5.get(r4)
            android.view.View r5 = (android.view.View) r5
            int r6 = r5.getVisibility()
            r0 = 8
            if (r6 != r0) goto L_0x001e
            goto L_0x0033
        L_0x001e:
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.m1659d()
            if (r6 == 0) goto L_0x0030
            boolean r6 = r6.mo46a(r1, r5, r2)
            if (r6 != 0) goto L_0x0033
        L_0x0030:
            r1.m1697c(r5, r2)
        L_0x0033:
            int r4 = r4 + 1
            goto L_0x000b
        L_0x0036:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r31, int r32) {
            r30 = this;
            r7 = r30
            r30.m1691e()
            r30.m1707b()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = p000a.p018g.p029l.C0216r.m3411j(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = 1
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            a.g.l.z r3 = r7.f2586o
            if (r3 == 0) goto L_0x004b
            boolean r3 = p000a.p018g.p029l.C0216r.m3415g(r30)
            if (r3 == 0) goto L_0x004b
            r19 = 1
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f2573b
            int r6 = r2.size()
            r4 = r0
            r2 = r1
            r3 = 0
            r5 = 0
        L_0x0057:
            if (r5 >= r6) goto L_0x016c
            java.util.List<android.view.View> r0 = r7.f2573b
            java.lang.Object r0 = r0.get(r5)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0071
            r22 = r5
            r29 = r6
            goto L_0x0166
        L_0x0071:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r1
            int r0 = r1.f2598e
            if (r0 < 0) goto L_0x00b8
            if (r13 == 0) goto L_0x00b8
            int r0 = r7.m1706b(r0)
            int r11 = r1.f2596c
            int r11 = m1690e(r11)
            int r11 = p000a.p018g.p029l.C0200c.m3490a(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0095
            if (r12 == 0) goto L_0x009a
        L_0x0095:
            r2 = 5
            if (r11 != r2) goto L_0x00a6
            if (r12 == 0) goto L_0x00a6
        L_0x009a:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r11 = 0
            goto L_0x00bd
        L_0x00a6:
            if (r11 != r2) goto L_0x00aa
            if (r12 == 0) goto L_0x00af
        L_0x00aa:
            r2 = 3
            if (r11 != r2) goto L_0x00ba
            if (r12 == 0) goto L_0x00ba
        L_0x00af:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00bd
        L_0x00b8:
            r22 = r2
        L_0x00ba:
            r11 = 0
            r21 = 0
        L_0x00bd:
            if (r19 == 0) goto L_0x00ef
            boolean r0 = p000a.p018g.p029l.C0216r.m3415g(r20)
            if (r0 != 0) goto L_0x00ef
            a.g.l.z r0 = r7.f2586o
            int r0 = r0.m3357c()
            a.g.l.z r2 = r7.f2586o
            int r2 = r2.m3356d()
            int r0 = r0 + r2
            a.g.l.z r2 = r7.f2586o
            int r2 = r2.m3355e()
            a.g.l.z r11 = r7.f2586o
            int r11 = r11.m3358b()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f3
        L_0x00ef:
            r11 = r31
            r23 = r32
        L_0x00f3:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.m1659d()
            if (r0 == 0) goto L_0x011a
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r27 = r3
            r3 = r11
            r28 = r4
            r4 = r21
            r22 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.mo331a(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0133
            goto L_0x0126
        L_0x011a:
            r26 = r1
            r27 = r3
            r28 = r4
            r29 = r6
            r25 = r22
            r22 = r5
        L_0x0126:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.m1717a(r1, r2, r3, r4, r5)
        L_0x0133:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            r2 = r28
            int r0 = java.lang.Math.max(r2, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r25
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r27
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r4 = r0
            r3 = r2
            r2 = r1
        L_0x0166:
            int r5 = r22 + 1
            r6 = r29
            goto L_0x0057
        L_0x016c:
            r1 = r2
            r11 = r3
            r2 = r4
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r3 = r31
            int r0 = android.view.View.resolveSizeAndState(r2, r3, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public boolean onNestedFling(android.view.View r12, float r13, float r14, boolean r15) {
            r11 = this;
            int r0 = r11.getChildCount()
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0007:
            if (r2 >= r0) goto L_0x0036
            android.view.View r6 = r11.getChildAt(r2)
            int r4 = r6.getVisibility()
            r5 = 8
            if (r4 != r5) goto L_0x0016
            goto L_0x0033
        L_0x0016:
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r4
            boolean r5 = r4.m1673a(r1)
            if (r5 != 0) goto L_0x0023
            goto L_0x0033
        L_0x0023:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = r4.m1659d()
            if (r4 == 0) goto L_0x0033
            r5 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r10 = r15
            boolean r4 = r4.m1682a(r5, r6, r7, r8, r9, r10)
            r3 = r3 | r4
        L_0x0033:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x0036:
            if (r3 == 0) goto L_0x003c
            r12 = 1
            r11.m1725a(r12)
        L_0x003c:
            return r3
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public boolean onNestedPreFling(android.view.View r11, float r12, float r13) {
            r10 = this;
            int r0 = r10.getChildCount()
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0007:
            if (r2 >= r0) goto L_0x0035
            android.view.View r6 = r10.getChildAt(r2)
            int r4 = r6.getVisibility()
            r5 = 8
            if (r4 != r5) goto L_0x0016
            goto L_0x0032
        L_0x0016:
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r4
            boolean r5 = r4.m1673a(r1)
            if (r5 != 0) goto L_0x0023
            goto L_0x0032
        L_0x0023:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = r4.m1659d()
            if (r4 == 0) goto L_0x0032
            r5 = r10
            r7 = r11
            r8 = r12
            r9 = r13
            boolean r4 = r4.mo255a(r5, r6, r7, r8, r9)
            r3 = r3 | r4
        L_0x0032:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x0035:
            return r3
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public void onNestedPreScroll(android.view.View r7, int r8, int r9, int[] r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.mo1568a(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public void onNestedScroll(android.view.View r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.mo1569a(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public void onNestedScrollAccepted(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            r1.mo1566a(r2, r3, r4, r0)
            return
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r7) {
            r6 = this;
            boolean r0 = r7 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.C0682h
            if (r0 != 0) goto L_0x0008
            super.onRestoreInstanceState(r7)
            return
        L_0x0008:
            androidx.coordinatorlayout.widget.CoordinatorLayout$h r7 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0682h) r7
            android.os.Parcelable r0 = r7.m3347a()
            super.onRestoreInstanceState(r0)
            android.util.SparseArray<android.os.Parcelable> r7 = r7.f2612d
            r0 = 0
            int r1 = r6.getChildCount()
        L_0x0018:
            if (r0 >= r1) goto L_0x003d
            android.view.View r2 = r6.getChildAt(r0)
            int r3 = r2.getId()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = r6.m1693d(r2)
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = r4.m1659d()
            r5 = -1
            if (r3 == r5) goto L_0x003a
            if (r4 == 0) goto L_0x003a
            java.lang.Object r3 = r7.get(r3)
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            if (r3 == 0) goto L_0x003a
            r4.mo256a(r6, r2, r3)
        L_0x003a:
            int r0 = r0 + 1
            goto L_0x0018
        L_0x003d:
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r8 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$h r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$h
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            int r2 = r8.getChildCount()
            r3 = 0
        L_0x0013:
            if (r3 >= r2) goto L_0x0038
            android.view.View r4 = r8.getChildAt(r3)
            int r5 = r4.getId()
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.m1659d()
            r7 = -1
            if (r5 == r7) goto L_0x0035
            if (r6 == 0) goto L_0x0035
            android.os.Parcelable r4 = r6.mo241d(r8, r4)
            if (r4 == 0) goto L_0x0035
            r1.append(r5, r4)
        L_0x0035:
            int r3 = r3 + 1
            goto L_0x0013
        L_0x0038:
            r0.f2612d = r1
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public boolean onStartNestedScroll(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.mo1559b(r2, r3, r4, r0)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public void onStopNestedScroll(android.view.View r2) {
            r1 = this;
            r0 = 0
            r1.mo1571a(r2, r0)
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f2582k
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.m1720a(r1, r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.f2582k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.m1659d()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.f2582k
            boolean r6 = r6.mo18b(r0, r7, r1)
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            android.view.View r7 = r0.f2582k
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.m1708a(r5)
        L_0x0057:
            return r6
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View r2, android.graphics.Rect r3, boolean r4) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r0.m1659d()
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.mo349a(r1, r2, r3, r4)
            if (r0 == 0) goto L_0x0014
            r2 = 1
            return r2
        L_0x0014:
            boolean r2 = super.requestChildRectangleOnScreen(r2, r3, r4)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean r1) {
            r0 = this;
            super.requestDisallowInterceptTouchEvent(r1)
            if (r1 == 0) goto L_0x0010
            boolean r1 = r0.f2579h
            if (r1 != 0) goto L_0x0010
            r1 = 0
            r0.m1708a(r1)
            r1 = 1
            r0.f2579h = r1
        L_0x0010:
            return
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean r1) {
            r0 = this;
            super.setFitsSystemWindows(r1)
            r0.m1687f()
            return
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener r1) {
            r0 = this;
            r0.f2589r = r1
            return
    }

    public void setStatusBarBackground(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f2588q
            if (r0 == r3) goto L_0x0045
            r1 = 0
            if (r0 == 0) goto L_0x000a
            r0.setCallback(r1)
        L_0x000a:
            if (r3 == 0) goto L_0x0010
            android.graphics.drawable.Drawable r1 = r3.mutate()
        L_0x0010:
            r2.f2588q = r1
            android.graphics.drawable.Drawable r3 = r2.f2588q
            if (r3 == 0) goto L_0x0042
            boolean r3 = r3.isStateful()
            if (r3 == 0) goto L_0x0025
            android.graphics.drawable.Drawable r3 = r2.f2588q
            int[] r0 = r2.getDrawableState()
            r3.setState(r0)
        L_0x0025:
            android.graphics.drawable.Drawable r3 = r2.f2588q
            int r0 = p000a.p018g.p029l.C0216r.m3411j(r2)
            androidx.core.graphics.drawable.C0698a.m1605a(r3, r0)
            android.graphics.drawable.Drawable r3 = r2.f2588q
            int r0 = r2.getVisibility()
            r1 = 0
            if (r0 != 0) goto L_0x0039
            r0 = 1
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            r3.setVisible(r0, r1)
            android.graphics.drawable.Drawable r3 = r2.f2588q
            r3.setCallback(r2)
        L_0x0042:
            p000a.p018g.p029l.C0216r.m3450A(r2)
        L_0x0045:
            return
    }

    public void setStatusBarBackgroundColor(int r2) {
            r1 = this;
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r1.setStatusBarBackground(r0)
            return
    }

    public void setStatusBarBackgroundResource(int r2) {
            r1 = this;
            if (r2 == 0) goto L_0x000b
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p000a.p018g.p019d.C0124a.m3732b(r0, r2)
            goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            r1.setStatusBarBackground(r2)
            return
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
            r2 = this;
            super.setVisibility(r3)
            r0 = 0
            if (r3 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            android.graphics.drawable.Drawable r1 = r2.f2588q
            if (r1 == 0) goto L_0x0018
            boolean r1 = r1.isVisible()
            if (r1 == r3) goto L_0x0018
            android.graphics.drawable.Drawable r1 = r2.f2588q
            r1.setVisible(r3, r0)
        L_0x0018:
            return
    }

    @Override // android.view.View
    protected boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto L_0x000d
            android.graphics.drawable.Drawable r0 = r1.f2588q
            if (r2 != r0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            r2 = 0
            goto L_0x000e
        L_0x000d:
            r2 = 1
        L_0x000e:
            return r2
    }
}
