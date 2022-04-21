package androidx.core.widget;

/* loaded from: classes.dex */
public class NestedScrollView extends android.widget.FrameLayout implements p000a.p018g.p029l.AbstractC0210l, p000a.p018g.p029l.AbstractC0207i, p000a.p018g.p029l.AbstractC0214p {

    /* renamed from: B */
    private static final androidx.core.widget.NestedScrollView.C0706a f2649B = null;

    /* renamed from: C */
    private static final int[] f2650C = null;

    /* renamed from: A */
    private androidx.core.widget.NestedScrollView.AbstractC0707b f2651A;

    /* renamed from: b */
    private long f2652b;

    /* renamed from: c */
    private final android.graphics.Rect f2653c;

    /* renamed from: d */
    private android.widget.OverScroller f2654d;

    /* renamed from: e */
    private android.widget.EdgeEffect f2655e;

    /* renamed from: f */
    private android.widget.EdgeEffect f2656f;

    /* renamed from: g */
    private int f2657g;

    /* renamed from: h */
    private boolean f2658h;

    /* renamed from: i */
    private boolean f2659i;

    /* renamed from: j */
    private android.view.View f2660j;

    /* renamed from: k */
    private boolean f2661k;

    /* renamed from: l */
    private android.view.VelocityTracker f2662l;

    /* renamed from: m */
    private boolean f2663m;

    /* renamed from: n */
    private boolean f2664n;

    /* renamed from: o */
    private int f2665o;

    /* renamed from: p */
    private int f2666p;

    /* renamed from: q */
    private int f2667q;

    /* renamed from: r */
    private int f2668r;

    /* renamed from: s */
    private final int[] f2669s;

    /* renamed from: t */
    private final int[] f2670t;

    /* renamed from: u */
    private int f2671u;

    /* renamed from: v */
    private int f2672v;

    /* renamed from: w */
    private androidx.core.widget.NestedScrollView.C0708c f2673w;

    /* renamed from: x */
    private final p000a.p018g.p029l.C0212n f2674x;

    /* renamed from: y */
    private final p000a.p018g.p029l.C0209k f2675y;

    /* renamed from: z */
    private float f2676z;

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    /* loaded from: classes.dex */
    static class C0706a extends p000a.p018g.p029l.C0185a {
        C0706a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p000a.p018g.p029l.C0185a
        /* renamed from: a */
        public void mo143a(android.view.View r3, p000a.p018g.p029l.p030a0.C0191c r4) {
                r2 = this;
                super.mo143a(r3, r4)
                androidx.core.widget.NestedScrollView r3 = (androidx.core.widget.NestedScrollView) r3
                java.lang.Class<android.widget.ScrollView> r0 = android.widget.ScrollView.class
                java.lang.String r0 = r0.getName()
                r4.m3538a(r0)
                boolean r0 = r3.isEnabled()
                if (r0 == 0) goto L_0x0034
                int r0 = r3.getScrollRange()
                if (r0 <= 0) goto L_0x0034
                r1 = 1
                r4.m3511i(r1)
                int r1 = r3.getScrollY()
                if (r1 <= 0) goto L_0x0029
                r1 = 8192(0x2000, float:1.14794E-41)
                r4.m3544a(r1)
            L_0x0029:
                int r3 = r3.getScrollY()
                if (r3 >= r0) goto L_0x0034
                r3 = 4096(0x1000, float:5.74E-42)
                r4.m3544a(r3)
            L_0x0034:
                return
        }

        @Override // p000a.p018g.p029l.C0185a
        /* renamed from: a */
        public boolean mo579a(android.view.View r3, int r4, android.os.Bundle r5) {
                r2 = this;
                boolean r5 = super.mo579a(r3, r4, r5)
                r0 = 1
                if (r5 == 0) goto L_0x0008
                return r0
            L_0x0008:
                androidx.core.widget.NestedScrollView r3 = (androidx.core.widget.NestedScrollView) r3
                boolean r5 = r3.isEnabled()
                r1 = 0
                if (r5 != 0) goto L_0x0012
                return r1
            L_0x0012:
                r5 = 4096(0x1000, float:5.74E-42)
                if (r4 == r5) goto L_0x003d
                r5 = 8192(0x2000, float:1.14794E-41)
                if (r4 == r5) goto L_0x001b
                return r1
            L_0x001b:
                int r4 = r3.getHeight()
                int r5 = r3.getPaddingBottom()
                int r4 = r4 - r5
                int r5 = r3.getPaddingTop()
                int r4 = r4 - r5
                int r5 = r3.getScrollY()
                int r5 = r5 - r4
                int r4 = java.lang.Math.max(r5, r1)
                int r5 = r3.getScrollY()
                if (r4 == r5) goto L_0x003c
                r3.m1562b(r1, r4)
                return r0
            L_0x003c:
                return r1
            L_0x003d:
                int r4 = r3.getHeight()
                int r5 = r3.getPaddingBottom()
                int r4 = r4 - r5
                int r5 = r3.getPaddingTop()
                int r4 = r4 - r5
                int r5 = r3.getScrollY()
                int r5 = r5 + r4
                int r4 = r3.getScrollRange()
                int r4 = java.lang.Math.min(r5, r4)
                int r5 = r3.getScrollY()
                if (r4 == r5) goto L_0x0062
                r3.m1562b(r1, r4)
                return r0
            L_0x0062:
                return r1
        }

        @Override // p000a.p018g.p029l.C0185a
        /* renamed from: b */
        public void mo150b(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                super.mo150b(r2, r3)
                androidx.core.widget.NestedScrollView r2 = (androidx.core.widget.NestedScrollView) r2
                java.lang.Class<android.widget.ScrollView> r0 = android.widget.ScrollView.class
                java.lang.String r0 = r0.getName()
                r3.setClassName(r0)
                int r0 = r2.getScrollRange()
                if (r0 <= 0) goto L_0x0016
                r0 = 1
                goto L_0x0017
            L_0x0016:
                r0 = 0
            L_0x0017:
                r3.setScrollable(r0)
                int r0 = r2.getScrollX()
                r3.setScrollX(r0)
                int r0 = r2.getScrollY()
                r3.setScrollY(r0)
                int r0 = r2.getScrollX()
                p000a.p018g.p029l.p030a0.C0196e.m3494a(r3, r0)
                int r2 = r2.getScrollRange()
                p000a.p018g.p029l.p030a0.C0196e.m3493b(r3, r2)
                return
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    /* loaded from: classes.dex */
    public interface AbstractC0707b {
        /* renamed from: a */
        void mo1545a(androidx.core.widget.NestedScrollView r1, int r2, int r3, int r4, int r5);
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    /* loaded from: classes.dex */
    static class C0708c extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.core.widget.NestedScrollView.C0708c> CREATOR = null;

        /* renamed from: b */
        public int f2677b;

        /* renamed from: androidx.core.widget.NestedScrollView$c$a */
        /* loaded from: classes.dex */
        static class C0709a implements android.os.Parcelable.Creator<androidx.core.widget.NestedScrollView.C0708c> {
            C0709a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.core.widget.NestedScrollView.C0708c createFromParcel(android.os.Parcel r2) {
                    r1 = this;
                    androidx.core.widget.NestedScrollView$c r0 = new androidx.core.widget.NestedScrollView$c
                    r0.<init>(r2)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ androidx.core.widget.NestedScrollView.C0708c createFromParcel(android.os.Parcel r1) {
                    r0 = this;
                    androidx.core.widget.NestedScrollView$c r1 = r0.createFromParcel(r1)
                    return r1
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.core.widget.NestedScrollView.C0708c[] newArray(int r1) {
                    r0 = this;
                    androidx.core.widget.NestedScrollView$c[] r1 = new androidx.core.widget.NestedScrollView.C0708c[r1]
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ androidx.core.widget.NestedScrollView.C0708c[] newArray(int r1) {
                    r0 = this;
                    androidx.core.widget.NestedScrollView$c[] r1 = r0.newArray(r1)
                    return r1
            }
        }

        static {
                androidx.core.widget.NestedScrollView$c$a r0 = new androidx.core.widget.NestedScrollView$c$a
                r0.<init>()
                androidx.core.widget.NestedScrollView.C0708c.CREATOR = r0
                return
        }

        C0708c(android.os.Parcel r1) {
                r0 = this;
                r0.<init>(r1)
                int r1 = r1.readInt()
                r0.f2677b = r1
                return
        }

        C0708c(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "HorizontalScrollView.SavedState{"
                r0.append(r1)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = " scrollPosition="
                r0.append(r1)
                int r1 = r2.f2677b
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.f2677b
                r1.writeInt(r2)
                return
        }
    }

    static {
            androidx.core.widget.NestedScrollView$a r0 = new androidx.core.widget.NestedScrollView$a
            r0.<init>()
            androidx.core.widget.NestedScrollView.f2649B = r0
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16843130(0x101017a, float:2.3694617E-38)
            r0[r1] = r2
            androidx.core.widget.NestedScrollView.f2650C = r0
            return
    }

    public NestedScrollView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public NestedScrollView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public NestedScrollView(android.content.Context r5, android.util.AttributeSet r6, int r7) {
            r4 = this;
            r4.<init>(r5, r6, r7)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r4.f2653c = r0
            r0 = 1
            r4.f2658h = r0
            r1 = 0
            r4.f2659i = r1
            r2 = 0
            r4.f2660j = r2
            r4.f2661k = r1
            r4.f2664n = r0
            r2 = -1
            r4.f2668r = r2
            r2 = 2
            int[] r3 = new int[r2]
            r4.f2669s = r3
            int[] r2 = new int[r2]
            r4.f2670t = r2
            r4.m1552e()
            int[] r2 = androidx.core.widget.NestedScrollView.f2650C
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r2, r7, r1)
            boolean r6 = r5.getBoolean(r1, r1)
            r4.setFillViewport(r6)
            r5.recycle()
            a.g.l.n r5 = new a.g.l.n
            r5.<init>(r4)
            r4.f2674x = r5
            a.g.l.k r5 = new a.g.l.k
            r5.<init>(r4)
            r4.f2675y = r5
            r4.setNestedScrollingEnabled(r0)
            androidx.core.widget.NestedScrollView$a r5 = androidx.core.widget.NestedScrollView.f2649B
            p000a.p018g.p029l.C0216r.m3440a(r4, r5)
            return
    }

    /* renamed from: a */
    private static int m1580a(int r1, int r2, int r3) {
            if (r2 >= r3) goto L_0x000c
            if (r1 >= 0) goto L_0x0005
            goto L_0x000c
        L_0x0005:
            int r0 = r2 + r1
            if (r0 <= r3) goto L_0x000b
            int r3 = r3 - r2
            return r3
        L_0x000b:
            return r1
        L_0x000c:
            r1 = 0
            return r1
    }

    /* renamed from: a */
    private android.view.View m1565a(boolean r13, int r14, int r15) {
            r12 = this;
            r0 = 2
            java.util.ArrayList r0 = r12.getFocusables(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = r3
            r3 = 0
            r5 = 0
        L_0x000e:
            if (r3 >= r1) goto L_0x0054
            java.lang.Object r6 = r0.get(r3)
            android.view.View r6 = (android.view.View) r6
            int r7 = r6.getTop()
            int r8 = r6.getBottom()
            r9 = 1
            if (r14 >= r8) goto L_0x0051
            if (r7 >= r15) goto L_0x0051
            if (r14 >= r7) goto L_0x0029
            if (r8 >= r15) goto L_0x0029
            r10 = 1
            goto L_0x002a
        L_0x0029:
            r10 = 0
        L_0x002a:
            if (r4 != 0) goto L_0x002f
            r4 = r6
            r5 = r10
            goto L_0x0051
        L_0x002f:
            if (r13 == 0) goto L_0x0037
            int r11 = r4.getTop()
            if (r7 < r11) goto L_0x003f
        L_0x0037:
            if (r13 != 0) goto L_0x0041
            int r7 = r4.getBottom()
            if (r8 <= r7) goto L_0x0041
        L_0x003f:
            r7 = 1
            goto L_0x0042
        L_0x0041:
            r7 = 0
        L_0x0042:
            if (r5 == 0) goto L_0x0049
            if (r10 == 0) goto L_0x0051
            if (r7 == 0) goto L_0x0051
            goto L_0x0050
        L_0x0049:
            if (r10 == 0) goto L_0x004e
            r4 = r6
            r5 = 1
            goto L_0x0051
        L_0x004e:
            if (r7 == 0) goto L_0x0051
        L_0x0050:
            r4 = r6
        L_0x0051:
            int r3 = r3 + 1
            goto L_0x000e
        L_0x0054:
            return r4
    }

    /* renamed from: a */
    private void m1573a(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionIndex()
            int r1 = r4.getPointerId(r0)
            int r2 = r3.f2668r
            if (r1 != r2) goto L_0x0025
            if (r0 != 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            float r1 = r4.getY(r0)
            int r1 = (int) r1
            r3.f2657g = r1
            int r4 = r4.getPointerId(r0)
            r3.f2668r = r4
            android.view.VelocityTracker r4 = r3.f2662l
            if (r4 == 0) goto L_0x0025
            r4.clear()
        L_0x0025:
            return
    }

    /* renamed from: a */
    private boolean m1582a() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L_0x002c
            android.view.View r0 = r4.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r0.getHeight()
            int r3 = r2.topMargin
            int r0 = r0 + r3
            int r2 = r2.bottomMargin
            int r0 = r0 + r2
            int r2 = r4.getHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            if (r0 <= r2) goto L_0x002c
            r1 = 1
        L_0x002c:
            return r1
    }

    /* renamed from: a */
    private boolean m1575a(android.graphics.Rect r3, boolean r4) {
            r2 = this;
            int r3 = r2.m1576a(r3)
            r0 = 0
            if (r3 == 0) goto L_0x0009
            r1 = 1
            goto L_0x000a
        L_0x0009:
            r1 = 0
        L_0x000a:
            if (r1 == 0) goto L_0x0015
            if (r4 == 0) goto L_0x0012
            r2.scrollBy(r0, r3)
            goto L_0x0015
        L_0x0012:
            r2.m1581a(r0, r3)
        L_0x0015:
            return r1
    }

    /* renamed from: a */
    private boolean m1572a(android.view.View r3) {
            r2 = this;
            int r0 = r2.getHeight()
            r1 = 0
            boolean r3 = r2.m1570a(r3, r1, r0)
            r3 = r3 ^ 1
            return r3
    }

    /* renamed from: a */
    private boolean m1570a(android.view.View r2, int r3, int r4) {
            r1 = this;
            android.graphics.Rect r0 = r1.f2653c
            r2.getDrawingRect(r0)
            android.graphics.Rect r0 = r1.f2653c
            r1.offsetDescendantRectToMyCoords(r2, r0)
            android.graphics.Rect r2 = r1.f2653c
            int r2 = r2.bottom
            int r2 = r2 + r3
            int r0 = r1.getScrollY()
            if (r2 < r0) goto L_0x0023
            android.graphics.Rect r2 = r1.f2653c
            int r2 = r2.top
            int r2 = r2 - r3
            int r3 = r1.getScrollY()
            int r3 = r3 + r4
            if (r2 > r3) goto L_0x0023
            r2 = 1
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            return r2
    }

    /* renamed from: a */
    private static boolean m1567a(android.view.View r2, android.view.View r3) {
            r0 = 1
            if (r2 != r3) goto L_0x0004
            return r0
        L_0x0004:
            android.view.ViewParent r2 = r2.getParent()
            boolean r1 = r2 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0015
            android.view.View r2 = (android.view.View) r2
            boolean r2 = m1567a(r2, r3)
            if (r2 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            return r0
    }

    /* renamed from: b */
    private void m1564b() {
            r1 = this;
            r0 = 0
            r1.f2661k = r0
            r1.m1548g()
            r1.mo1010a(r0)
            android.widget.EdgeEffect r0 = r1.f2655e
            if (r0 == 0) goto L_0x0015
            r0.onRelease()
            android.widget.EdgeEffect r0 = r1.f2656f
            r0.onRelease()
        L_0x0015:
            return
    }

    /* renamed from: b */
    private void m1560b(android.view.View r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.f2653c
            r2.getDrawingRect(r0)
            android.graphics.Rect r0 = r1.f2653c
            r1.offsetDescendantRectToMyCoords(r2, r0)
            android.graphics.Rect r2 = r1.f2653c
            int r2 = r1.m1576a(r2)
            if (r2 == 0) goto L_0x0016
            r0 = 0
            r1.scrollBy(r0, r2)
        L_0x0016:
            return
    }

    /* renamed from: b */
    private boolean m1561b(int r7, int r8, int r9) {
            r6 = this;
            int r0 = r6.getHeight()
            int r1 = r6.getScrollY()
            int r0 = r0 + r1
            r2 = 0
            r3 = 1
            r4 = 33
            if (r7 != r4) goto L_0x0011
            r4 = 1
            goto L_0x0012
        L_0x0011:
            r4 = 0
        L_0x0012:
            android.view.View r5 = r6.m1565a(r4, r8, r9)
            if (r5 != 0) goto L_0x0019
            r5 = r6
        L_0x0019:
            if (r8 < r1) goto L_0x001e
            if (r9 > r0) goto L_0x001e
            goto L_0x0028
        L_0x001e:
            if (r4 == 0) goto L_0x0022
            int r8 = r8 - r1
            goto L_0x0024
        L_0x0022:
            int r8 = r9 - r0
        L_0x0024:
            r6.m1547g(r8)
            r2 = 1
        L_0x0028:
            android.view.View r8 = r6.findFocus()
            if (r5 == r8) goto L_0x0031
            r5.requestFocus(r7)
        L_0x0031:
            return r2
    }

    /* renamed from: c */
    private void m1558c() {
            r2 = this;
            int r0 = r2.getOverScrollMode()
            r1 = 2
            if (r0 == r1) goto L_0x001e
            android.widget.EdgeEffect r0 = r2.f2655e
            if (r0 != 0) goto L_0x0023
            android.content.Context r0 = r2.getContext()
            android.widget.EdgeEffect r1 = new android.widget.EdgeEffect
            r1.<init>(r0)
            r2.f2655e = r1
            android.widget.EdgeEffect r1 = new android.widget.EdgeEffect
            r1.<init>(r0)
            r2.f2656f = r1
            goto L_0x0023
        L_0x001e:
            r0 = 0
            r2.f2655e = r0
            r2.f2656f = r0
        L_0x0023:
            return
    }

    /* renamed from: d */
    private void m1555d() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.f2662l
            if (r0 != 0) goto L_0x000b
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r1.f2662l = r0
            goto L_0x000e
        L_0x000b:
            r0.clear()
        L_0x000e:
            return
    }

    /* renamed from: d */
    private boolean m1553d(int r5, int r6) {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L_0x002a
            int r0 = r4.getScrollY()
            android.view.View r2 = r4.getChildAt(r1)
            int r3 = r2.getTop()
            int r3 = r3 - r0
            if (r6 < r3) goto L_0x002a
            int r3 = r2.getBottom()
            int r3 = r3 - r0
            if (r6 >= r3) goto L_0x002a
            int r6 = r2.getLeft()
            if (r5 < r6) goto L_0x002a
            int r6 = r2.getRight()
            if (r5 >= r6) goto L_0x002a
            r1 = 1
        L_0x002a:
            return r1
    }

    /* renamed from: e */
    private void m1552e() {
            r2 = this;
            android.widget.OverScroller r0 = new android.widget.OverScroller
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.f2654d = r0
            r0 = 1
            r2.setFocusable(r0)
            r0 = 262144(0x40000, float:3.67342E-40)
            r2.setDescendantFocusability(r0)
            r0 = 0
            r2.setWillNotDraw(r0)
            android.content.Context r0 = r2.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r1 = r0.getScaledTouchSlop()
            r2.f2665o = r1
            int r1 = r0.getScaledMinimumFlingVelocity()
            r2.f2666p = r1
            int r0 = r0.getScaledMaximumFlingVelocity()
            r2.f2667q = r0
            return
    }

    /* renamed from: f */
    private void m1550f() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.f2662l
            if (r0 != 0) goto L_0x000a
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r1.f2662l = r0
        L_0x000a:
            return
    }

    /* renamed from: g */
    private void m1548g() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.f2662l
            if (r0 == 0) goto L_0x000a
            r0.recycle()
            r0 = 0
            r1.f2662l = r0
        L_0x000a:
            return
    }

    /* renamed from: g */
    private void m1547g(int r3) {
            r2 = this;
            if (r3 == 0) goto L_0x000e
            boolean r0 = r2.f2664n
            r1 = 0
            if (r0 == 0) goto L_0x000b
            r2.m1581a(r1, r3)
            goto L_0x000e
        L_0x000b:
            r2.scrollBy(r1, r3)
        L_0x000e:
            return
    }

    private float getVerticalScrollFactorCompat() {
            r5 = this;
            float r0 = r5.f2676z
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0035
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r5.getContext()
            android.content.res.Resources$Theme r2 = r1.getTheme()
            r3 = 16842829(0x101004d, float:2.3693774E-38)
            r4 = 1
            boolean r2 = r2.resolveAttribute(r3, r0, r4)
            if (r2 == 0) goto L_0x002d
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r0 = r0.getDimension(r1)
            r5.f2676z = r0
            goto L_0x0035
        L_0x002d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expected theme to define listPreferredItemHeight."
            r0.<init>(r1)
            throw r0
        L_0x0035:
            float r0 = r5.f2676z
            return r0
    }

    /* renamed from: h */
    private void m1546h(int r5) {
            r4 = this;
            int r0 = r4.getScrollY()
            if (r0 > 0) goto L_0x0008
            if (r5 <= 0) goto L_0x0011
        L_0x0008:
            int r1 = r4.getScrollRange()
            if (r0 < r1) goto L_0x0013
            if (r5 >= 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r0 = 0
            goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            float r1 = (float) r5
            r2 = 0
            boolean r3 = r4.dispatchNestedPreFling(r2, r1)
            if (r3 != 0) goto L_0x0022
            r4.dispatchNestedFling(r2, r1, r0)
            r4.m1557c(r5)
        L_0x0022:
            return
    }

    /* renamed from: a */
    protected int m1576a(android.graphics.Rect r11) {
            r10 = this;
            int r0 = r10.getChildCount()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r0 = r10.getHeight()
            int r2 = r10.getScrollY()
            int r3 = r2 + r0
            int r4 = r10.getVerticalFadingEdgeLength()
            int r5 = r11.top
            if (r5 <= 0) goto L_0x001b
            int r2 = r2 + r4
        L_0x001b:
            android.view.View r5 = r10.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r6 = (android.widget.FrameLayout.LayoutParams) r6
            int r7 = r11.bottom
            int r8 = r5.getHeight()
            int r9 = r6.topMargin
            int r8 = r8 + r9
            int r9 = r6.bottomMargin
            int r8 = r8 + r9
            if (r7 >= r8) goto L_0x0036
            int r4 = r3 - r4
            goto L_0x0037
        L_0x0036:
            r4 = r3
        L_0x0037:
            int r7 = r11.bottom
            if (r7 <= r4) goto L_0x005a
            int r7 = r11.top
            if (r7 <= r2) goto L_0x005a
            int r7 = r11.height()
            if (r7 <= r0) goto L_0x0049
            int r11 = r11.top
            int r11 = r11 - r2
            goto L_0x004c
        L_0x0049:
            int r11 = r11.bottom
            int r11 = r11 - r4
        L_0x004c:
            int r11 = r11 + r1
            int r0 = r5.getBottom()
            int r1 = r6.bottomMargin
            int r0 = r0 + r1
            int r0 = r0 - r3
            int r1 = java.lang.Math.min(r11, r0)
            goto L_0x007a
        L_0x005a:
            int r3 = r11.top
            if (r3 >= r2) goto L_0x007a
            int r3 = r11.bottom
            if (r3 >= r4) goto L_0x007a
            int r3 = r11.height()
            if (r3 <= r0) goto L_0x006d
            int r11 = r11.bottom
            int r4 = r4 - r11
            int r1 = r1 - r4
            goto L_0x0071
        L_0x006d:
            int r11 = r11.top
            int r2 = r2 - r11
            int r1 = r1 - r2
        L_0x0071:
            int r11 = r10.getScrollY()
            int r11 = -r11
            int r1 = java.lang.Math.max(r1, r11)
        L_0x007a:
            return r1
    }

    @Override // p000a.p018g.p029l.AbstractC0207i
    /* renamed from: a */
    public void mo1010a(int r2) {
            r1 = this;
            a.g.l.k r0 = r1.f2675y
            r0.m3456c(r2)
            return
    }

    /* renamed from: a */
    public final void m1581a(int r6, int r7) {
            r5 = this;
            int r0 = r5.getChildCount()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r2 = r5.f2652b
            long r0 = r0 - r2
            r2 = 250(0xfa, double:1.235E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x005d
            r6 = 0
            android.view.View r0 = r5.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r0 = r0.getHeight()
            int r2 = r1.topMargin
            int r0 = r0 + r2
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r5.getHeight()
            int r2 = r5.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r5.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = r5.getScrollY()
            int r0 = r0 - r1
            int r0 = java.lang.Math.max(r6, r0)
            int r7 = r7 + r2
            int r7 = java.lang.Math.min(r7, r0)
            int r7 = java.lang.Math.max(r6, r7)
            int r7 = r7 - r2
            int r0 = r5.getScrollY()
            r5.f2672v = r0
            android.widget.OverScroller r0 = r5.f2654d
            int r1 = r5.getScrollX()
            r0.startScroll(r1, r2, r6, r7)
            p000a.p018g.p029l.C0216r.m3450A(r5)
            goto L_0x006d
        L_0x005d:
            android.widget.OverScroller r0 = r5.f2654d
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x006a
            android.widget.OverScroller r0 = r5.f2654d
            r0.abortAnimation()
        L_0x006a:
            r5.scrollBy(r6, r7)
        L_0x006d:
            long r6 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r5.f2652b = r6
            return
    }

    @Override // p000a.p018g.p029l.AbstractC0210l
    /* renamed from: a */
    public void mo1571a(android.view.View r2, int r3) {
            r1 = this;
            a.g.l.n r0 = r1.f2674x
            r0.m3453a(r2, r3)
            r1.mo1010a(r3)
            return
    }

    @Override // p000a.p018g.p029l.AbstractC0210l
    /* renamed from: a */
    public void mo1569a(android.view.View r8, int r9, int r10, int r11, int r12, int r13) {
            r7 = this;
            int r8 = r7.getScrollY()
            r9 = 0
            r7.scrollBy(r9, r12)
            int r9 = r7.getScrollY()
            int r2 = r9 - r8
            int r4 = r12 - r2
            r1 = 0
            r3 = 0
            r5 = 0
            r0 = r7
            r6 = r13
            r0.m1578a(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // p000a.p018g.p029l.AbstractC0210l
    /* renamed from: a */
    public void mo1568a(android.view.View r7, int r8, int r9, int[] r10, int r11) {
            r6 = this;
            r4 = 0
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r11
            r0.m1577a(r1, r2, r3, r4, r5)
            return
    }

    @Override // p000a.p018g.p029l.AbstractC0210l
    /* renamed from: a */
    public void mo1566a(android.view.View r2, android.view.View r3, int r4, int r5) {
            r1 = this;
            a.g.l.n r0 = r1.f2674x
            r0.m3451a(r2, r3, r4, r5)
            r2 = 2
            r1.m1556c(r2, r5)
            return
    }

    /* renamed from: a */
    boolean m1579a(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r7 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0053
            goto L_0x004e
        L_0x0053:
            r7 = r3
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r3 = r12.m1551e(r5)
            if (r3 != 0) goto L_0x007e
            android.widget.OverScroller r3 = r0.f2654d
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r3
            r14 = r7
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r7, r6, r2, r1)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
    }

    /* renamed from: a */
    public boolean m1578a(int r8, int r9, int r10, int r11, int[] r12, int r13) {
            r7 = this;
            a.g.l.k r0 = r7.f2675y
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            boolean r8 = r0.m3464a(r1, r2, r3, r4, r5, r6)
            return r8
    }

    /* renamed from: a */
    public boolean m1577a(int r7, int r8, int[] r9, int[] r10, int r11) {
            r6 = this;
            a.g.l.k r0 = r6.f2675y
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.m3462a(r1, r2, r3, r4, r5)
            return r7
    }

    /* renamed from: a */
    public boolean m1574a(android.view.KeyEvent r6) {
            r5 = this;
            android.graphics.Rect r0 = r5.f2653c
            r0.setEmpty()
            boolean r0 = r5.m1582a()
            r1 = 0
            r2 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L_0x0036
            boolean r0 = r5.isFocused()
            if (r0 == 0) goto L_0x0035
            int r6 = r6.getKeyCode()
            r0 = 4
            if (r6 == r0) goto L_0x0035
            android.view.View r6 = r5.findFocus()
            if (r6 != r5) goto L_0x0022
            r6 = 0
        L_0x0022:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r6 = r0.findNextFocus(r5, r6, r2)
            if (r6 == 0) goto L_0x0035
            if (r6 == r5) goto L_0x0035
            boolean r6 = r6.requestFocus(r2)
            if (r6 == 0) goto L_0x0035
            r1 = 1
        L_0x0035:
            return r1
        L_0x0036:
            int r0 = r6.getAction()
            if (r0 != 0) goto L_0x007a
            int r0 = r6.getKeyCode()
            r3 = 19
            r4 = 33
            if (r0 == r3) goto L_0x006b
            r3 = 20
            if (r0 == r3) goto L_0x005b
            r3 = 62
            if (r0 == r3) goto L_0x004f
            goto L_0x007a
        L_0x004f:
            boolean r6 = r6.isShiftPressed()
            if (r6 == 0) goto L_0x0057
            r2 = 33
        L_0x0057:
            r5.m1549f(r2)
            goto L_0x007a
        L_0x005b:
            boolean r6 = r6.isAltPressed()
            if (r6 != 0) goto L_0x0066
            boolean r1 = r5.m1563b(r2)
            goto L_0x007a
        L_0x0066:
            boolean r1 = r5.m1554d(r2)
            goto L_0x007a
        L_0x006b:
            boolean r6 = r6.isAltPressed()
            if (r6 != 0) goto L_0x0076
            boolean r1 = r5.m1563b(r4)
            goto L_0x007a
        L_0x0076:
            boolean r1 = r5.m1554d(r4)
        L_0x007a:
            return r1
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r2) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto L_0x000a
            super.addView(r2)
            return
        L_0x000a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "ScrollView can host only one direct child"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r2, int r3) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto L_0x000a
            super.addView(r2, r3)
            return
        L_0x000a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "ScrollView can host only one direct child"
            r2.<init>(r3)
            throw r2
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto L_0x000a
            super.addView(r2, r3, r4)
            return
        L_0x000a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "ScrollView can host only one direct child"
            r2.<init>(r3)
            throw r2
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto L_0x000a
            super.addView(r2, r3)
            return
        L_0x000a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "ScrollView can host only one direct child"
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: b */
    public final void m1562b(int r2, int r3) {
            r1 = this;
            int r0 = r1.getScrollX()
            int r2 = r2 - r0
            int r0 = r1.getScrollY()
            int r3 = r3 - r0
            r1.m1581a(r2, r3)
            return
    }

    /* renamed from: b */
    public boolean m1563b(int r8) {
            r7 = this;
            android.view.View r0 = r7.findFocus()
            if (r0 != r7) goto L_0x0007
            r0 = 0
        L_0x0007:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r7, r0, r8)
            int r2 = r7.getMaxScrollAmount()
            if (r1 == 0) goto L_0x0036
            int r3 = r7.getHeight()
            boolean r3 = r7.m1570a(r1, r2, r3)
            if (r3 == 0) goto L_0x0036
            android.graphics.Rect r2 = r7.f2653c
            r1.getDrawingRect(r2)
            android.graphics.Rect r2 = r7.f2653c
            r7.offsetDescendantRectToMyCoords(r1, r2)
            android.graphics.Rect r2 = r7.f2653c
            int r2 = r7.m1576a(r2)
            r7.m1547g(r2)
            r1.requestFocus(r8)
            goto L_0x007e
        L_0x0036:
            r1 = 33
            r3 = 0
            r4 = 130(0x82, float:1.82E-43)
            if (r8 != r1) goto L_0x0048
            int r1 = r7.getScrollY()
            if (r1 >= r2) goto L_0x0048
            int r2 = r7.getScrollY()
            goto L_0x0074
        L_0x0048:
            if (r8 != r4) goto L_0x0074
            int r1 = r7.getChildCount()
            if (r1 <= 0) goto L_0x0074
            android.view.View r1 = r7.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r5 = (android.widget.FrameLayout.LayoutParams) r5
            int r1 = r1.getBottom()
            int r5 = r5.bottomMargin
            int r1 = r1 + r5
            int r5 = r7.getScrollY()
            int r6 = r7.getHeight()
            int r5 = r5 + r6
            int r6 = r7.getPaddingBottom()
            int r5 = r5 - r6
            int r1 = r1 - r5
            int r2 = java.lang.Math.min(r1, r2)
        L_0x0074:
            if (r2 != 0) goto L_0x0077
            return r3
        L_0x0077:
            if (r8 != r4) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            int r2 = -r2
        L_0x007b:
            r7.m1547g(r2)
        L_0x007e:
            if (r0 == 0) goto L_0x009b
            boolean r8 = r0.isFocused()
            if (r8 == 0) goto L_0x009b
            boolean r8 = r7.m1572a(r0)
            if (r8 == 0) goto L_0x009b
            int r8 = r7.getDescendantFocusability()
            r0 = 131072(0x20000, float:1.83671E-40)
            r7.setDescendantFocusability(r0)
            r7.requestFocus()
            r7.setDescendantFocusability(r8)
        L_0x009b:
            r8 = 1
            return r8
    }

    @Override // p000a.p018g.p029l.AbstractC0210l
    /* renamed from: b */
    public boolean mo1559b(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            r1 = r3 & 2
            if (r1 == 0) goto L_0x0006
            r1 = 1
            goto L_0x0007
        L_0x0006:
            r1 = 0
        L_0x0007:
            return r1
    }

    /* renamed from: c */
    public void m1557c(int r14) {
            r13 = this;
            int r0 = r13.getChildCount()
            if (r0 <= 0) goto L_0x002c
            r0 = 2
            r1 = 1
            r13.m1556c(r0, r1)
            android.widget.OverScroller r2 = r13.f2654d
            int r3 = r13.getScrollX()
            int r4 = r13.getScrollY()
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = 2147483647(0x7fffffff, float:NaN)
            r11 = 0
            r12 = 0
            r6 = r14
            r2.fling(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            int r14 = r13.getScrollY()
            r13.f2672v = r14
            p000a.p018g.p029l.C0216r.m3450A(r13)
        L_0x002c:
            return
    }

    /* renamed from: c */
    public boolean m1556c(int r2, int r3) {
            r1 = this;
            a.g.l.k r0 = r1.f2675y
            boolean r2 = r0.m3466a(r2, r3)
            return r2
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
            r1 = this;
            int r0 = super.computeHorizontalScrollExtent()
            return r0
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
            r1 = this;
            int r0 = super.computeHorizontalScrollOffset()
            return r0
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
            r1 = this;
            int r0 = super.computeHorizontalScrollRange()
            return r0
    }

    @Override // android.view.View
    public void computeScroll() {
            r18 = this;
            r10 = r18
            android.widget.OverScroller r0 = r10.f2654d
            boolean r0 = r0.computeScrollOffset()
            r12 = 1
            if (r0 == 0) goto L_0x0093
            android.widget.OverScroller r0 = r10.f2654d
            r0.getCurrX()
            android.widget.OverScroller r0 = r10.f2654d
            int r13 = r0.getCurrY()
            int r0 = r10.f2672v
            int r6 = r13 - r0
            r1 = 0
            int[] r3 = r10.f2670t
            r4 = 0
            r5 = 1
            r0 = r18
            r2 = r6
            boolean r0 = r0.m1577a(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x002d
            int[] r0 = r10.f2670t
            r0 = r0[r12]
            int r6 = r6 - r0
        L_0x002d:
            r14 = r6
            if (r14 == 0) goto L_0x008d
            int r15 = r18.getScrollRange()
            int r9 = r18.getScrollY()
            r1 = 0
            int r3 = r18.getScrollX()
            r5 = 0
            r7 = 0
            r8 = 0
            r16 = 0
            r0 = r18
            r2 = r14
            r4 = r9
            r6 = r15
            r11 = r9
            r9 = r16
            r0.m1579a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int r0 = r18.getScrollY()
            int r2 = r0 - r11
            int r4 = r14 - r2
            r3 = 0
            r5 = 0
            r6 = 1
            r0 = r18
            boolean r0 = r0.m1578a(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x008d
            int r0 = r18.getOverScrollMode()
            if (r0 == 0) goto L_0x006e
            if (r0 != r12) goto L_0x006b
            if (r15 <= 0) goto L_0x006b
            goto L_0x006e
        L_0x006b:
            r17 = 0
            goto L_0x0070
        L_0x006e:
            r17 = 1
        L_0x0070:
            if (r17 == 0) goto L_0x008d
            r18.m1558c()
            if (r13 > 0) goto L_0x0086
            if (r11 <= 0) goto L_0x0086
            android.widget.EdgeEffect r0 = r10.f2655e
        L_0x007b:
            android.widget.OverScroller r1 = r10.f2654d
            float r1 = r1.getCurrVelocity()
            int r1 = (int) r1
            r0.onAbsorb(r1)
            goto L_0x008d
        L_0x0086:
            if (r13 < r15) goto L_0x008d
            if (r11 >= r15) goto L_0x008d
            android.widget.EdgeEffect r0 = r10.f2656f
            goto L_0x007b
        L_0x008d:
            r10.f2672v = r13
            p000a.p018g.p029l.C0216r.m3450A(r18)
            goto L_0x009f
        L_0x0093:
            boolean r0 = r10.m1551e(r12)
            if (r0 == 0) goto L_0x009c
            r10.mo1010a(r12)
        L_0x009c:
            r0 = 0
            r10.f2672v = r0
        L_0x009f:
            return
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
            r1 = this;
            int r0 = super.computeVerticalScrollExtent()
            return r0
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
            r2 = this;
            int r0 = super.computeVerticalScrollOffset()
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
            r4 = this;
            int r0 = r4.getChildCount()
            int r1 = r4.getHeight()
            int r2 = r4.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = r4.getPaddingTop()
            int r1 = r1 - r2
            if (r0 != 0) goto L_0x0015
            return r1
        L_0x0015:
            r0 = 0
            android.view.View r2 = r4.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r2 = r2.getBottom()
            int r3 = r3.bottomMargin
            int r2 = r2 + r3
            int r3 = r4.getScrollY()
            int r1 = r2 - r1
            int r0 = java.lang.Math.max(r0, r1)
            if (r3 >= 0) goto L_0x0035
            int r2 = r2 - r3
            goto L_0x0039
        L_0x0035:
            if (r3 <= r0) goto L_0x0039
            int r3 = r3 - r0
            int r2 = r2 + r3
        L_0x0039:
            return r2
    }

    /* renamed from: d */
    public boolean m1554d(int r6) {
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 130(0x82, float:1.82E-43)
            if (r6 != r2) goto L_0x0008
            r2 = 1
            goto L_0x0009
        L_0x0008:
            r2 = 0
        L_0x0009:
            int r3 = r5.getHeight()
            android.graphics.Rect r4 = r5.f2653c
            r4.top = r1
            r4.bottom = r3
            if (r2 == 0) goto L_0x003d
            int r1 = r5.getChildCount()
            if (r1 <= 0) goto L_0x003d
            int r1 = r1 - r0
            android.view.View r0 = r5.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            android.graphics.Rect r2 = r5.f2653c
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r5.getPaddingBottom()
            int r0 = r0 + r1
            r2.bottom = r0
            android.graphics.Rect r0 = r5.f2653c
            int r1 = r0.bottom
            int r1 = r1 - r3
            r0.top = r1
        L_0x003d:
            android.graphics.Rect r0 = r5.f2653c
            int r1 = r0.top
            int r0 = r0.bottom
            boolean r6 = r5.m1561b(r6, r1, r0)
            return r6
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            boolean r0 = super.dispatchKeyEvent(r2)
            if (r0 != 0) goto L_0x000f
            boolean r2 = r1.m1574a(r2)
            if (r2 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r2 = 0
            goto L_0x0010
        L_0x000f:
            r2 = 1
        L_0x0010:
            return r2
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float r2, float r3, boolean r4) {
            r1 = this;
            a.g.l.k r0 = r1.f2675y
            boolean r2 = r0.m3468a(r2, r3, r4)
            return r2
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float r2, float r3) {
            r1 = this;
            a.g.l.k r0 = r1.f2675y
            boolean r2 = r0.m3469a(r2, r3)
            return r2
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            boolean r7 = r0.m1577a(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int r8, int r9, int r10, int r11, int[] r12) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            boolean r8 = r0.m1578a(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r11) {
            r10 = this;
            super.draw(r11)
            android.widget.EdgeEffect r0 = r10.f2655e
            if (r0 == 0) goto L_0x00e2
            int r0 = r10.getScrollY()
            android.widget.EdgeEffect r1 = r10.f2655e
            boolean r1 = r1.isFinished()
            r2 = 0
            r3 = 21
            if (r1 != 0) goto L_0x0073
            int r1 = r11.save()
            int r4 = r10.getWidth()
            int r5 = r10.getHeight()
            int r6 = java.lang.Math.min(r2, r0)
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r3) goto L_0x0033
            boolean r7 = r10.getClipToPadding()
            if (r7 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r7 = 0
            goto L_0x0042
        L_0x0033:
            int r7 = r10.getPaddingLeft()
            int r8 = r10.getPaddingRight()
            int r7 = r7 + r8
            int r4 = r4 - r7
            int r7 = r10.getPaddingLeft()
            int r7 = r7 + r2
        L_0x0042:
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r3) goto L_0x005b
            boolean r8 = r10.getClipToPadding()
            if (r8 == 0) goto L_0x005b
            int r8 = r10.getPaddingTop()
            int r9 = r10.getPaddingBottom()
            int r8 = r8 + r9
            int r5 = r5 - r8
            int r8 = r10.getPaddingTop()
            int r6 = r6 + r8
        L_0x005b:
            float r7 = (float) r7
            float r6 = (float) r6
            r11.translate(r7, r6)
            android.widget.EdgeEffect r6 = r10.f2655e
            r6.setSize(r4, r5)
            android.widget.EdgeEffect r4 = r10.f2655e
            boolean r4 = r4.draw(r11)
            if (r4 == 0) goto L_0x0070
            p000a.p018g.p029l.C0216r.m3450A(r10)
        L_0x0070:
            r11.restoreToCount(r1)
        L_0x0073:
            android.widget.EdgeEffect r1 = r10.f2656f
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L_0x00e2
            int r1 = r11.save()
            int r4 = r10.getWidth()
            int r5 = r10.getHeight()
            int r6 = r10.getScrollRange()
            int r0 = java.lang.Math.max(r6, r0)
            int r0 = r0 + r5
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r3) goto L_0x009a
            boolean r6 = r10.getClipToPadding()
            if (r6 == 0) goto L_0x00a9
        L_0x009a:
            int r6 = r10.getPaddingLeft()
            int r7 = r10.getPaddingRight()
            int r6 = r6 + r7
            int r4 = r4 - r6
            int r6 = r10.getPaddingLeft()
            int r2 = r2 + r6
        L_0x00a9:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r3) goto L_0x00c2
            boolean r3 = r10.getClipToPadding()
            if (r3 == 0) goto L_0x00c2
            int r3 = r10.getPaddingTop()
            int r6 = r10.getPaddingBottom()
            int r3 = r3 + r6
            int r5 = r5 - r3
            int r3 = r10.getPaddingBottom()
            int r0 = r0 - r3
        L_0x00c2:
            int r2 = r2 - r4
            float r2 = (float) r2
            float r0 = (float) r0
            r11.translate(r2, r0)
            r0 = 1127481344(0x43340000, float:180.0)
            float r2 = (float) r4
            r3 = 0
            r11.rotate(r0, r2, r3)
            android.widget.EdgeEffect r0 = r10.f2656f
            r0.setSize(r4, r5)
            android.widget.EdgeEffect r0 = r10.f2656f
            boolean r0 = r0.draw(r11)
            if (r0 == 0) goto L_0x00df
            p000a.p018g.p029l.C0216r.m3450A(r10)
        L_0x00df:
            r11.restoreToCount(r1)
        L_0x00e2:
            return
    }

    /* renamed from: e */
    public boolean m1551e(int r2) {
            r1 = this;
            a.g.l.k r0 = r1.f2675y
            boolean r2 = r0.m3467a(r2)
            return r2
    }

    /* renamed from: f */
    public boolean m1549f(int r5) {
            r4 = this;
            r0 = 1
            r1 = 0
            r2 = 130(0x82, float:1.82E-43)
            if (r5 != r2) goto L_0x0008
            r2 = 1
            goto L_0x0009
        L_0x0008:
            r2 = 0
        L_0x0009:
            int r3 = r4.getHeight()
            if (r2 == 0) goto L_0x0040
            android.graphics.Rect r1 = r4.f2653c
            int r2 = r4.getScrollY()
            int r2 = r2 + r3
            r1.top = r2
            int r1 = r4.getChildCount()
            if (r1 <= 0) goto L_0x0051
            int r1 = r1 - r0
            android.view.View r0 = r4.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r4.getPaddingBottom()
            int r0 = r0 + r1
            android.graphics.Rect r1 = r4.f2653c
            int r2 = r1.top
            int r2 = r2 + r3
            if (r2 <= r0) goto L_0x0051
            int r0 = r0 - r3
            r1.top = r0
            goto L_0x0051
        L_0x0040:
            android.graphics.Rect r0 = r4.f2653c
            int r2 = r4.getScrollY()
            int r2 = r2 - r3
            r0.top = r2
            android.graphics.Rect r0 = r4.f2653c
            int r2 = r0.top
            if (r2 >= 0) goto L_0x0051
            r0.top = r1
        L_0x0051:
            android.graphics.Rect r0 = r4.f2653c
            int r1 = r0.top
            int r3 = r3 + r1
            r0.bottom = r3
            int r0 = r0.bottom
            boolean r5 = r4.m1561b(r5, r1, r0)
            return r5
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
            r5 = this;
            int r0 = r5.getChildCount()
            if (r0 != 0) goto L_0x0008
            r0 = 0
            return r0
        L_0x0008:
            r0 = 0
            android.view.View r0 = r5.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r2 = r5.getVerticalFadingEdgeLength()
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r5.getScrollY()
            int r0 = r0 - r1
            int r0 = r0 - r3
            if (r0 >= r2) goto L_0x0033
            float r0 = (float) r0
            float r1 = (float) r2
            float r0 = r0 / r1
            return r0
        L_0x0033:
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
    }

    public int getMaxScrollAmount() {
            r2 = this;
            int r0 = r2.getHeight()
            float r0 = (float) r0
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            int r0 = (int) r0
            return r0
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
            r1 = this;
            a.g.l.n r0 = r1.f2674x
            int r0 = r0.m3454a()
            return r0
    }

    int getScrollRange() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L_0x002e
            android.view.View r0 = r4.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r0.getHeight()
            int r3 = r2.topMargin
            int r0 = r0 + r3
            int r2 = r2.bottomMargin
            int r0 = r0 + r2
            int r2 = r4.getHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            int r0 = r0 - r2
            int r1 = java.lang.Math.max(r1, r0)
        L_0x002e:
            return r1
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
            r2 = this;
            int r0 = r2.getChildCount()
            if (r0 != 0) goto L_0x0008
            r0 = 0
            return r0
        L_0x0008:
            int r0 = r2.getVerticalFadingEdgeLength()
            int r1 = r2.getScrollY()
            if (r1 >= r0) goto L_0x0016
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            return r1
        L_0x0016:
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
            r1 = this;
            r0 = 0
            boolean r0 = r1.m1551e(r0)
            return r0
    }

    @Override // android.view.View, p000a.p018g.p029l.AbstractC0208j
    public boolean isNestedScrollingEnabled() {
            r1 = this;
            a.g.l.k r0 = r1.f2675y
            boolean r0 = r0.m3459b()
            return r0
    }

    @Override // android.view.ViewGroup
    protected void measureChild(android.view.View r3, int r4, int r5) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            int r0 = r2.getPaddingLeft()
            int r1 = r2.getPaddingRight()
            int r0 = r0 + r1
            int r5 = r5.width
            int r4 = android.widget.FrameLayout.getChildMeasureSpec(r4, r0, r5)
            r5 = 0
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r5)
            r3.measure(r4, r5)
            return
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(android.view.View r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            int r6 = r1.getPaddingLeft()
            int r0 = r1.getPaddingRight()
            int r6 = r6 + r0
            int r0 = r5.leftMargin
            int r6 = r6 + r0
            int r0 = r5.rightMargin
            int r6 = r6 + r0
            int r6 = r6 + r4
            int r4 = r5.width
            int r3 = android.widget.FrameLayout.getChildMeasureSpec(r3, r6, r4)
            int r4 = r5.topMargin
            int r5 = r5.bottomMargin
            int r4 = r4 + r5
            r5 = 0
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5)
            r2.measure(r3, r4)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r0 = 0
            r1.f2659i = r0
            return
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getSource()
            r0 = r0 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0044
            int r0 = r4.getAction()
            r2 = 8
            if (r0 == r2) goto L_0x0012
            goto L_0x0044
        L_0x0012:
            boolean r0 = r3.f2661k
            if (r0 != 0) goto L_0x0044
            r0 = 9
            float r4 = r4.getAxisValue(r0)
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0044
            float r0 = r3.getVerticalScrollFactorCompat()
            float r4 = r4 * r0
            int r4 = (int) r4
            int r0 = r3.getScrollRange()
            int r2 = r3.getScrollY()
            int r4 = r2 - r4
            if (r4 >= 0) goto L_0x0036
            r4 = 0
            goto L_0x0039
        L_0x0036:
            if (r4 <= r0) goto L_0x0039
            r4 = r0
        L_0x0039:
            if (r4 == r2) goto L_0x0044
            int r0 = r3.getScrollX()
            super.scrollTo(r0, r4)
            r4 = 1
            return r4
        L_0x0044:
            return r1
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
            r11 = this;
            int r0 = r12.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x000d
            boolean r3 = r11.f2661k
            if (r3 == 0) goto L_0x000d
            return r2
        L_0x000d:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            if (r0 == 0) goto L_0x00a2
            r4 = -1
            if (r0 == r2) goto L_0x007d
            if (r0 == r1) goto L_0x0024
            r1 = 3
            if (r0 == r1) goto L_0x007d
            r1 = 6
            if (r0 == r1) goto L_0x001f
            goto L_0x00d9
        L_0x001f:
            r11.m1573a(r12)
            goto L_0x00d9
        L_0x0024:
            int r0 = r11.f2668r
            if (r0 != r4) goto L_0x002a
            goto L_0x00d9
        L_0x002a:
            int r5 = r12.findPointerIndex(r0)
            if (r5 != r4) goto L_0x004d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r12.append(r1)
            r12.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r12)
            goto L_0x00d9
        L_0x004d:
            float r0 = r12.getY(r5)
            int r0 = (int) r0
            int r4 = r11.f2657g
            int r4 = r0 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r11.f2665o
            if (r4 <= r5) goto L_0x00d9
            int r4 = r11.getNestedScrollAxes()
            r1 = r1 & r4
            if (r1 != 0) goto L_0x00d9
            r11.f2661k = r2
            r11.f2657g = r0
            r11.m1550f()
            android.view.VelocityTracker r0 = r11.f2662l
            r0.addMovement(r12)
            r11.f2671u = r3
            android.view.ViewParent r12 = r11.getParent()
            if (r12 == 0) goto L_0x00d9
            r12.requestDisallowInterceptTouchEvent(r2)
            goto L_0x00d9
        L_0x007d:
            r11.f2661k = r3
            r11.f2668r = r4
            r11.m1548g()
            android.widget.OverScroller r4 = r11.f2654d
            int r5 = r11.getScrollX()
            int r6 = r11.getScrollY()
            r7 = 0
            r8 = 0
            r9 = 0
            int r10 = r11.getScrollRange()
            boolean r12 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L_0x009e
            p000a.p018g.p029l.C0216r.m3450A(r11)
        L_0x009e:
            r11.mo1010a(r3)
            goto L_0x00d9
        L_0x00a2:
            float r0 = r12.getY()
            int r0 = (int) r0
            float r4 = r12.getX()
            int r4 = (int) r4
            boolean r4 = r11.m1553d(r4, r0)
            if (r4 != 0) goto L_0x00b8
            r11.f2661k = r3
            r11.m1548g()
            goto L_0x00d9
        L_0x00b8:
            r11.f2657g = r0
            int r0 = r12.getPointerId(r3)
            r11.f2668r = r0
            r11.m1555d()
            android.view.VelocityTracker r0 = r11.f2662l
            r0.addMovement(r12)
            android.widget.OverScroller r12 = r11.f2654d
            r12.computeScrollOffset()
            android.widget.OverScroller r12 = r11.f2654d
            boolean r12 = r12.isFinished()
            r12 = r12 ^ r2
            r11.f2661k = r12
            r11.m1556c(r1, r3)
        L_0x00d9:
            boolean r12 = r11.f2661k
            return r12
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            r2 = 0
            r1.f2658h = r2
            android.view.View r3 = r1.f2660j
            if (r3 == 0) goto L_0x0015
            boolean r3 = m1567a(r3, r1)
            if (r3 == 0) goto L_0x0015
            android.view.View r3 = r1.f2660j
            r1.m1560b(r3)
        L_0x0015:
            r3 = 0
            r1.f2660j = r3
            boolean r5 = r1.f2659i
            if (r5 != 0) goto L_0x0063
            androidx.core.widget.NestedScrollView$c r5 = r1.f2673w
            if (r5 == 0) goto L_0x002d
            int r5 = r1.getScrollX()
            androidx.core.widget.NestedScrollView$c r0 = r1.f2673w
            int r0 = r0.f2677b
            r1.scrollTo(r5, r0)
            r1.f2673w = r3
        L_0x002d:
            int r3 = r1.getChildCount()
            if (r3 <= 0) goto L_0x0047
            android.view.View r2 = r1.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r2 = r2.getMeasuredHeight()
            int r5 = r3.topMargin
            int r2 = r2 + r5
            int r3 = r3.bottomMargin
            int r2 = r2 + r3
        L_0x0047:
            int r6 = r6 - r4
            int r3 = r1.getPaddingTop()
            int r6 = r6 - r3
            int r3 = r1.getPaddingBottom()
            int r6 = r6 - r3
            int r3 = r1.getScrollY()
            int r2 = m1580a(r3, r6, r2)
            if (r2 == r3) goto L_0x0063
            int r3 = r1.getScrollX()
            r1.scrollTo(r3, r2)
        L_0x0063:
            int r2 = r1.getScrollX()
            int r3 = r1.getScrollY()
            r1.scrollTo(r2, r3)
            r2 = 1
            r1.f2659i = r2
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r5, int r6) {
            r4 = this;
            super.onMeasure(r5, r6)
            boolean r0 = r4.f2663m
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            int r6 = android.view.View.MeasureSpec.getMode(r6)
            if (r6 != 0) goto L_0x000f
            return
        L_0x000f:
            int r6 = r4.getChildCount()
            if (r6 <= 0) goto L_0x0058
            r6 = 0
            android.view.View r6 = r4.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r1 = r6.getMeasuredHeight()
            int r2 = r4.getMeasuredHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            int r3 = r0.topMargin
            int r2 = r2 - r3
            int r3 = r0.bottomMargin
            int r2 = r2 - r3
            if (r1 >= r2) goto L_0x0058
            int r1 = r4.getPaddingLeft()
            int r3 = r4.getPaddingRight()
            int r1 = r1 + r3
            int r3 = r0.leftMargin
            int r1 = r1 + r3
            int r3 = r0.rightMargin
            int r1 = r1 + r3
            int r0 = r0.width
            int r5 = android.widget.FrameLayout.getChildMeasureSpec(r5, r1, r0)
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r6.measure(r5, r0)
        L_0x0058:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public boolean onNestedFling(android.view.View r1, float r2, float r3, boolean r4) {
            r0 = this;
            if (r4 != 0) goto L_0x0008
            int r1 = (int) r3
            r0.m1546h(r1)
            r1 = 1
            return r1
        L_0x0008:
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public boolean onNestedPreFling(android.view.View r1, float r2, float r3) {
            r0 = this;
            boolean r1 = r0.dispatchNestedPreFling(r2, r3)
            return r1
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
    protected void onOverScrolled(int r1, int r2, boolean r3, boolean r4) {
            r0 = this;
            super.scrollTo(r1, r2)
            return
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int r4, android.graphics.Rect r5) {
            r3 = this;
            r0 = 2
            if (r4 != r0) goto L_0x0006
            r4 = 130(0x82, float:1.82E-43)
            goto L_0x000b
        L_0x0006:
            r0 = 1
            if (r4 != r0) goto L_0x000b
            r4 = 33
        L_0x000b:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            if (r5 != 0) goto L_0x0017
            r1 = 0
            android.view.View r0 = r0.findNextFocus(r3, r1, r4)
            goto L_0x001b
        L_0x0017:
            android.view.View r0 = r0.findNextFocusFromRect(r3, r5, r4)
        L_0x001b:
            r1 = 0
            if (r0 != 0) goto L_0x001f
            return r1
        L_0x001f:
            boolean r2 = r3.m1572a(r0)
            if (r2 == 0) goto L_0x0026
            return r1
        L_0x0026:
            boolean r4 = r0.requestFocus(r4, r5)
            return r4
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.core.widget.NestedScrollView.C0708c
            if (r0 != 0) goto L_0x0008
            super.onRestoreInstanceState(r2)
            return
        L_0x0008:
            androidx.core.widget.NestedScrollView$c r2 = (androidx.core.widget.NestedScrollView.C0708c) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            r1.f2673w = r2
            r1.requestLayout()
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.core.widget.NestedScrollView$c r1 = new androidx.core.widget.NestedScrollView$c
            r1.<init>(r0)
            int r0 = r2.getScrollY()
            r1.f2677b = r0
            return r1
    }

    @Override // android.view.View
    protected void onScrollChanged(int r7, int r8, int r9, int r10) {
            r6 = this;
            super.onScrollChanged(r7, r8, r9, r10)
            androidx.core.widget.NestedScrollView$b r0 = r6.f2651A
            if (r0 == 0) goto L_0x000f
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.mo1545a(r1, r2, r3, r4, r5)
        L_0x000f:
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            android.view.View r1 = r0.findFocus()
            if (r1 == 0) goto L_0x0026
            if (r0 != r1) goto L_0x000c
            goto L_0x0026
        L_0x000c:
            r2 = 0
            boolean r2 = r0.m1570a(r1, r2, r4)
            if (r2 == 0) goto L_0x0026
            android.graphics.Rect r2 = r0.f2653c
            r1.getDrawingRect(r2)
            android.graphics.Rect r2 = r0.f2653c
            r0.offsetDescendantRectToMyCoords(r1, r2)
            android.graphics.Rect r1 = r0.f2653c
            int r1 = r0.m1576a(r1)
            r0.m1547g(r1)
        L_0x0026:
            return
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
    public boolean onTouchEvent(android.view.MotionEvent r24) {
            r23 = this;
            r10 = r23
            r11 = r24
            r23.m1550f()
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r24)
            int r0 = r24.getActionMasked()
            r13 = 0
            if (r0 != 0) goto L_0x0014
            r10.f2671u = r13
        L_0x0014:
            int r1 = r10.f2671u
            float r1 = (float) r1
            r14 = 0
            r12.offsetLocation(r14, r1)
            r1 = 2
            r15 = 1
            if (r0 == 0) goto L_0x021a
            r2 = -1
            if (r0 == r15) goto L_0x01e2
            if (r0 == r1) goto L_0x007f
            r1 = 3
            if (r0 == r1) goto L_0x0054
            r1 = 5
            if (r0 == r1) goto L_0x0041
            r1 = 6
            if (r0 == r1) goto L_0x002f
            goto L_0x0252
        L_0x002f:
            r23.m1573a(r24)
            int r0 = r10.f2668r
            int r0 = r11.findPointerIndex(r0)
            float r0 = r11.getY(r0)
            int r0 = (int) r0
            r10.f2657g = r0
            goto L_0x0252
        L_0x0041:
            int r0 = r24.getActionIndex()
            float r1 = r11.getY(r0)
            int r1 = (int) r1
            r10.f2657g = r1
            int r0 = r11.getPointerId(r0)
            r10.f2668r = r0
            goto L_0x0252
        L_0x0054:
            boolean r0 = r10.f2661k
            if (r0 == 0) goto L_0x0078
            int r0 = r23.getChildCount()
            if (r0 <= 0) goto L_0x0078
            android.widget.OverScroller r3 = r10.f2654d
            int r4 = r23.getScrollX()
            int r5 = r23.getScrollY()
            r6 = 0
            r7 = 0
            r8 = 0
            int r9 = r23.getScrollRange()
            boolean r0 = r3.springBack(r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x0078
        L_0x0075:
            p000a.p018g.p029l.C0216r.m3450A(r23)
        L_0x0078:
            r10.f2668r = r2
            r23.m1564b()
            goto L_0x0252
        L_0x007f:
            int r0 = r10.f2668r
            int r9 = r11.findPointerIndex(r0)
            if (r9 != r2) goto L_0x00a6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r0.append(r1)
            int r1 = r10.f2668r
            r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NestedScrollView"
            android.util.Log.e(r1, r0)
            goto L_0x0252
        L_0x00a6:
            float r0 = r11.getY(r9)
            int r6 = (int) r0
            int r0 = r10.f2657g
            int r7 = r0 - r6
            r1 = 0
            int[] r3 = r10.f2670t
            int[] r4 = r10.f2669s
            r5 = 0
            r0 = r23
            r2 = r7
            boolean r0 = r0.m1577a(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00d4
            int[] r0 = r10.f2670t
            r0 = r0[r15]
            int r7 = r7 - r0
            int[] r0 = r10.f2669s
            r0 = r0[r15]
            float r0 = (float) r0
            r12.offsetLocation(r14, r0)
            int r0 = r10.f2671u
            int[] r1 = r10.f2669s
            r1 = r1[r15]
            int r0 = r0 + r1
            r10.f2671u = r0
        L_0x00d4:
            boolean r0 = r10.f2661k
            if (r0 != 0) goto L_0x00f2
            int r0 = java.lang.Math.abs(r7)
            int r1 = r10.f2665o
            if (r0 <= r1) goto L_0x00f2
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L_0x00e9
            r0.requestDisallowInterceptTouchEvent(r15)
        L_0x00e9:
            r10.f2661k = r15
            int r0 = r10.f2665o
            if (r7 <= 0) goto L_0x00f1
            int r7 = r7 - r0
            goto L_0x00f2
        L_0x00f1:
            int r7 = r7 + r0
        L_0x00f2:
            r8 = r7
            boolean r0 = r10.f2661k
            if (r0 == 0) goto L_0x0252
            int[] r0 = r10.f2669s
            r0 = r0[r15]
            int r6 = r6 - r0
            r10.f2657g = r6
            int r16 = r23.getScrollY()
            int r7 = r23.getScrollRange()
            int r0 = r23.getOverScrollMode()
            if (r0 == 0) goto L_0x0114
            if (r0 != r15) goto L_0x0111
            if (r7 <= 0) goto L_0x0111
            goto L_0x0114
        L_0x0111:
            r17 = 0
            goto L_0x0116
        L_0x0114:
            r17 = 1
        L_0x0116:
            r1 = 0
            r3 = 0
            int r4 = r23.getScrollY()
            r5 = 0
            r18 = 0
            r19 = 0
            r20 = 1
            r0 = r23
            r2 = r8
            r6 = r7
            r21 = r7
            r7 = r18
            r14 = r8
            r8 = r19
            r22 = r9
            r9 = r20
            boolean r0 = r0.m1579a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x0143
            boolean r0 = r10.m1551e(r13)
            if (r0 != 0) goto L_0x0143
            android.view.VelocityTracker r0 = r10.f2662l
            r0.clear()
        L_0x0143:
            int r0 = r23.getScrollY()
            int r2 = r0 - r16
            int r4 = r14 - r2
            r1 = 0
            r3 = 0
            int[] r5 = r10.f2669s
            r6 = 0
            r0 = r23
            boolean r0 = r0.m1578a(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0173
            int r0 = r10.f2657g
            int[] r1 = r10.f2669s
            r2 = r1[r15]
            int r0 = r0 - r2
            r10.f2657g = r0
            r0 = r1[r15]
            float r0 = (float) r0
            r1 = 0
            r12.offsetLocation(r1, r0)
            int r0 = r10.f2671u
            int[] r1 = r10.f2669s
            r1 = r1[r15]
            int r0 = r0 + r1
            r10.f2671u = r0
            goto L_0x0252
        L_0x0173:
            if (r17 == 0) goto L_0x0252
            r23.m1558c()
            int r0 = r16 + r14
            if (r0 >= 0) goto L_0x01a2
            android.widget.EdgeEffect r0 = r10.f2655e
            float r1 = (float) r14
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            r2 = r22
            float r2 = r11.getX(r2)
            int r3 = r23.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            androidx.core.widget.C0715d.m1509a(r0, r1, r2)
            android.widget.EdgeEffect r0 = r10.f2656f
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01cc
            android.widget.EdgeEffect r0 = r10.f2656f
        L_0x019e:
            r0.onRelease()
            goto L_0x01cc
        L_0x01a2:
            r1 = r21
            r2 = r22
            if (r0 <= r1) goto L_0x01cc
            android.widget.EdgeEffect r0 = r10.f2656f
            float r1 = (float) r14
            int r3 = r23.getHeight()
            float r3 = (float) r3
            float r1 = r1 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r11.getX(r2)
            int r4 = r23.getWidth()
            float r4 = (float) r4
            float r2 = r2 / r4
            float r3 = r3 - r2
            androidx.core.widget.C0715d.m1509a(r0, r1, r3)
            android.widget.EdgeEffect r0 = r10.f2655e
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01cc
            android.widget.EdgeEffect r0 = r10.f2655e
            goto L_0x019e
        L_0x01cc:
            android.widget.EdgeEffect r0 = r10.f2655e
            if (r0 == 0) goto L_0x0252
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x01de
            android.widget.EdgeEffect r0 = r10.f2656f
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0252
        L_0x01de:
            p000a.p018g.p029l.C0216r.m3450A(r23)
            goto L_0x0252
        L_0x01e2:
            android.view.VelocityTracker r0 = r10.f2662l
            r1 = 1000(0x3e8, float:1.401E-42)
            int r3 = r10.f2667q
            float r3 = (float) r3
            r0.computeCurrentVelocity(r1, r3)
            int r1 = r10.f2668r
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r3 = r10.f2666p
            if (r1 <= r3) goto L_0x0201
            int r0 = -r0
            r10.m1546h(r0)
            goto L_0x0078
        L_0x0201:
            android.widget.OverScroller r3 = r10.f2654d
            int r4 = r23.getScrollX()
            int r5 = r23.getScrollY()
            r6 = 0
            r7 = 0
            r8 = 0
            int r9 = r23.getScrollRange()
            boolean r0 = r3.springBack(r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x0078
            goto L_0x0075
        L_0x021a:
            int r0 = r23.getChildCount()
            if (r0 != 0) goto L_0x0221
            return r13
        L_0x0221:
            android.widget.OverScroller r0 = r10.f2654d
            boolean r0 = r0.isFinished()
            r0 = r0 ^ r15
            r10.f2661k = r0
            if (r0 == 0) goto L_0x0235
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L_0x0235
            r0.requestDisallowInterceptTouchEvent(r15)
        L_0x0235:
            android.widget.OverScroller r0 = r10.f2654d
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0242
            android.widget.OverScroller r0 = r10.f2654d
            r0.abortAnimation()
        L_0x0242:
            float r0 = r24.getY()
            int r0 = (int) r0
            r10.f2657g = r0
            int r0 = r11.getPointerId(r13)
            r10.f2668r = r0
            r10.m1556c(r1, r13)
        L_0x0252:
            android.view.VelocityTracker r0 = r10.f2662l
            if (r0 == 0) goto L_0x0259
            r0.addMovement(r12)
        L_0x0259:
            r12.recycle()
            return r15
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View r2, android.view.View r3) {
            r1 = this;
            boolean r0 = r1.f2658h
            if (r0 != 0) goto L_0x0008
            r1.m1560b(r3)
            goto L_0x000a
        L_0x0008:
            r1.f2660j = r3
        L_0x000a:
            super.requestChildFocus(r2, r3)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View r3, android.graphics.Rect r4, boolean r5) {
            r2 = this;
            int r0 = r3.getLeft()
            int r1 = r3.getScrollX()
            int r0 = r0 - r1
            int r1 = r3.getTop()
            int r3 = r3.getScrollY()
            int r1 = r1 - r3
            r4.offset(r0, r1)
            boolean r3 = r2.m1575a(r4, r5)
            return r3
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L_0x0005
            r0.m1548g()
        L_0x0005:
            super.requestDisallowInterceptTouchEvent(r1)
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
            r1 = this;
            r0 = 1
            r1.f2658h = r0
            super.requestLayout()
            return
    }

    @Override // android.view.View
    public void scrollTo(int r7, int r8) {
            r6 = this;
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L_0x0058
            r0 = 0
            android.view.View r0 = r6.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r2 = r6.getWidth()
            int r3 = r6.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r6.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r0.getWidth()
            int r4 = r1.leftMargin
            int r3 = r3 + r4
            int r4 = r1.rightMargin
            int r3 = r3 + r4
            int r4 = r6.getHeight()
            int r5 = r6.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r6.getPaddingBottom()
            int r4 = r4 - r5
            int r0 = r0.getHeight()
            int r5 = r1.topMargin
            int r0 = r0 + r5
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r7 = m1580a(r7, r2, r3)
            int r8 = m1580a(r8, r4, r0)
            int r0 = r6.getScrollX()
            if (r7 != r0) goto L_0x0055
            int r0 = r6.getScrollY()
            if (r8 == r0) goto L_0x0058
        L_0x0055:
            super.scrollTo(r7, r8)
        L_0x0058:
            return
    }

    public void setFillViewport(boolean r2) {
            r1 = this;
            boolean r0 = r1.f2663m
            if (r2 == r0) goto L_0x0009
            r1.f2663m = r2
            r1.requestLayout()
        L_0x0009:
            return
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean r2) {
            r1 = this;
            a.g.l.k r0 = r1.f2675y
            r0.m3460a(r2)
            return
    }

    public void setOnScrollChangeListener(androidx.core.widget.NestedScrollView.AbstractC0707b r1) {
            r0 = this;
            r0.f2651A = r1
            return
    }

    public void setSmoothScrollingEnabled(boolean r1) {
            r0 = this;
            r0.f2664n = r1
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // android.view.View
    public boolean startNestedScroll(int r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.m1556c(r2, r0)
            return r2
    }

    @Override // android.view.View, p000a.p018g.p029l.AbstractC0208j
    public void stopNestedScroll() {
            r1 = this;
            r0 = 0
            r1.mo1010a(r0)
            return
    }
}
