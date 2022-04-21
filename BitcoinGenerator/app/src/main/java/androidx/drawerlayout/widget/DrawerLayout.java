package androidx.drawerlayout.widget;

/* loaded from: classes.dex */
public class DrawerLayout extends android.view.ViewGroup {

    /* renamed from: L */
    private static final int[] f2722L = null;

    /* renamed from: M */
    static final int[] f2723M = null;

    /* renamed from: N */
    static final boolean f2724N = false;

    /* renamed from: O */
    private static final boolean f2725O = false;

    /* renamed from: A */
    private java.lang.CharSequence f2726A;

    /* renamed from: B */
    private java.lang.CharSequence f2727B;

    /* renamed from: C */
    private java.lang.Object f2728C;

    /* renamed from: D */
    private boolean f2729D;

    /* renamed from: E */
    private android.graphics.drawable.Drawable f2730E;

    /* renamed from: F */
    private android.graphics.drawable.Drawable f2731F;

    /* renamed from: G */
    private android.graphics.drawable.Drawable f2732G;

    /* renamed from: H */
    private android.graphics.drawable.Drawable f2733H;

    /* renamed from: I */
    private final java.util.ArrayList<android.view.View> f2734I;

    /* renamed from: J */
    private android.graphics.Rect f2735J;

    /* renamed from: K */
    private android.graphics.Matrix f2736K;

    /* renamed from: b */
    private final androidx.drawerlayout.widget.DrawerLayout.C0726c f2737b;

    /* renamed from: c */
    private float f2738c;

    /* renamed from: d */
    private int f2739d;

    /* renamed from: e */
    private int f2740e;

    /* renamed from: f */
    private float f2741f;

    /* renamed from: g */
    private android.graphics.Paint f2742g;

    /* renamed from: h */
    private final p000a.p033i.p035b.C0240a f2743h;

    /* renamed from: i */
    private final p000a.p033i.p035b.C0240a f2744i;

    /* renamed from: j */
    private final androidx.drawerlayout.widget.DrawerLayout.C0731g f2745j;

    /* renamed from: k */
    private final androidx.drawerlayout.widget.DrawerLayout.C0731g f2746k;

    /* renamed from: l */
    private int f2747l;

    /* renamed from: m */
    private boolean f2748m;

    /* renamed from: n */
    private boolean f2749n;

    /* renamed from: o */
    private int f2750o;

    /* renamed from: p */
    private int f2751p;

    /* renamed from: q */
    private int f2752q;

    /* renamed from: r */
    private int f2753r;

    /* renamed from: s */
    private boolean f2754s;

    /* renamed from: t */
    private androidx.drawerlayout.widget.DrawerLayout.AbstractC0727d f2755t;

    /* renamed from: u */
    private java.util.List<androidx.drawerlayout.widget.DrawerLayout.AbstractC0727d> f2756u;

    /* renamed from: v */
    private float f2757v;

    /* renamed from: w */
    private float f2758w;

    /* renamed from: x */
    private android.graphics.drawable.Drawable f2759x;

    /* renamed from: y */
    private android.graphics.drawable.Drawable f2760y;

    /* renamed from: z */
    private android.graphics.drawable.Drawable f2761z;

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$a */
    /* loaded from: classes.dex */
    class View$OnApplyWindowInsetsListenerC0724a implements android.view.View.OnApplyWindowInsetsListener {
        View$OnApplyWindowInsetsListenerC0724a(androidx.drawerlayout.widget.DrawerLayout r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public android.view.WindowInsets onApplyWindowInsets(android.view.View r2, android.view.WindowInsets r3) {
                r1 = this;
                androidx.drawerlayout.widget.DrawerLayout r2 = (androidx.drawerlayout.widget.DrawerLayout) r2
                int r0 = r3.getSystemWindowInsetTop()
                if (r0 <= 0) goto L_0x000a
                r0 = 1
                goto L_0x000b
            L_0x000a:
                r0 = 0
            L_0x000b:
                r2.m1465a(r3, r0)
                android.view.WindowInsets r2 = r3.consumeSystemWindowInsets()
                return r2
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$b */
    /* loaded from: classes.dex */
    class C0725b extends p000a.p018g.p029l.C0185a {

        /* renamed from: c */
        private final android.graphics.Rect f2762c;

        /* renamed from: d */
        final /* synthetic */ androidx.drawerlayout.widget.DrawerLayout f2763d;

        C0725b(androidx.drawerlayout.widget.DrawerLayout r1) {
                r0 = this;
                r0.f2763d = r1
                r0.<init>()
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.f2762c = r1
                return
        }

        /* renamed from: a */
        private void m1429a(p000a.p018g.p029l.p030a0.C0191c r2, p000a.p018g.p029l.p030a0.C0191c r3) {
                r1 = this;
                android.graphics.Rect r0 = r1.f2762c
                r3.m3541a(r0)
                r2.m3527c(r0)
                r3.m3533b(r0)
                r2.m3522d(r0)
                boolean r0 = r3.m3500r()
                r2.m3507k(r0)
                java.lang.CharSequence r0 = r3.m3523d()
                r2.m3525c(r0)
                java.lang.CharSequence r0 = r3.m3535b()
                r2.m3538a(r0)
                java.lang.CharSequence r0 = r3.m3528c()
                r2.m3531b(r0)
                boolean r0 = r3.m3508k()
                r2.m3519e(r0)
                boolean r0 = r3.m3510j()
                r2.m3521d(r0)
                boolean r0 = r3.m3506l()
                r2.m3517f(r0)
                boolean r0 = r3.m3505m()
                r2.m3515g(r0)
                boolean r0 = r3.m3516g()
                r2.m3536a(r0)
                boolean r0 = r3.m3501q()
                r2.m3509j(r0)
                boolean r0 = r3.m3504n()
                r2.m3513h(r0)
                int r3 = r3.m3545a()
                r2.m3544a(r3)
                return
        }

        /* renamed from: a */
        private void m1428a(p000a.p018g.p029l.p030a0.C0191c r5, android.view.ViewGroup r6) {
                r4 = this;
                int r0 = r6.getChildCount()
                r1 = 0
            L_0x0005:
                if (r1 >= r0) goto L_0x0017
                android.view.View r2 = r6.getChildAt(r1)
                boolean r3 = androidx.drawerlayout.widget.DrawerLayout.m1430m(r2)
                if (r3 == 0) goto L_0x0014
                r5.m3540a(r2)
            L_0x0014:
                int r1 = r1 + 1
                goto L_0x0005
            L_0x0017:
                return
        }

        @Override // p000a.p018g.p029l.C0185a
        /* renamed from: a */
        public void mo143a(android.view.View r4, p000a.p018g.p029l.p030a0.C0191c r5) {
                r3 = this;
                boolean r0 = androidx.drawerlayout.widget.DrawerLayout.f2724N
                if (r0 == 0) goto L_0x0008
                super.mo143a(r4, r5)
                goto L_0x002a
            L_0x0008:
                a.g.l.a0.c r0 = p000a.p018g.p029l.p030a0.C0191c.m3542a(r5)
                super.mo143a(r4, r0)
                r5.m3526c(r4)
                android.view.ViewParent r1 = p000a.p018g.p029l.C0216r.m3406o(r4)
                boolean r2 = r1 instanceof android.view.View
                if (r2 == 0) goto L_0x001f
                android.view.View r1 = (android.view.View) r1
                r5.m3532b(r1)
            L_0x001f:
                r3.m1429a(r5, r0)
                r0.m3499s()
                android.view.ViewGroup r4 = (android.view.ViewGroup) r4
                r3.m1428a(r5, r4)
            L_0x002a:
                java.lang.Class<androidx.drawerlayout.widget.DrawerLayout> r4 = androidx.drawerlayout.widget.DrawerLayout.class
                java.lang.String r4 = r4.getName()
                r5.m3538a(r4)
                r4 = 0
                r5.m3517f(r4)
                r5.m3515g(r4)
                a.g.l.a0.c$a r4 = p000a.p018g.p029l.p030a0.C0191c.C0192a.f641b
                r5.m3543a(r4)
                a.g.l.a0.c$a r4 = p000a.p018g.p029l.p030a0.C0191c.C0192a.f642c
                r5.m3543a(r4)
                return
        }

        @Override // p000a.p018g.p029l.C0185a
        /* renamed from: a */
        public boolean mo1427a(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
                r2 = this;
                int r0 = r4.getEventType()
                r1 = 32
                if (r0 != r1) goto L_0x0027
                java.util.List r3 = r4.getText()
                androidx.drawerlayout.widget.DrawerLayout r4 = r2.f2763d
                android.view.View r4 = r4.m1450d()
                if (r4 == 0) goto L_0x0025
                androidx.drawerlayout.widget.DrawerLayout r0 = r2.f2763d
                int r4 = r0.m1445e(r4)
                androidx.drawerlayout.widget.DrawerLayout r0 = r2.f2763d
                java.lang.CharSequence r4 = r0.m1449d(r4)
                if (r4 == 0) goto L_0x0025
                r3.add(r4)
            L_0x0025:
                r3 = 1
                return r3
            L_0x0027:
                boolean r3 = super.mo1427a(r3, r4)
                return r3
        }

        @Override // p000a.p018g.p029l.C0185a
        /* renamed from: a */
        public boolean mo1426a(android.view.ViewGroup r2, android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
                r1 = this;
                boolean r0 = androidx.drawerlayout.widget.DrawerLayout.f2724N
                if (r0 != 0) goto L_0x000d
                boolean r0 = androidx.drawerlayout.widget.DrawerLayout.m1430m(r3)
                if (r0 == 0) goto L_0x000b
                goto L_0x000d
            L_0x000b:
                r2 = 0
                return r2
            L_0x000d:
                boolean r2 = super.mo1426a(r2, r3, r4)
                return r2
        }

        @Override // p000a.p018g.p029l.C0185a
        /* renamed from: b */
        public void mo150b(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
                r0 = this;
                super.mo150b(r1, r2)
                java.lang.Class<androidx.drawerlayout.widget.DrawerLayout> r1 = androidx.drawerlayout.widget.DrawerLayout.class
                java.lang.String r1 = r1.getName()
                r2.setClassName(r1)
                return
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$c */
    /* loaded from: classes.dex */
    static final class C0726c extends p000a.p018g.p029l.C0185a {
        C0726c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p000a.p018g.p029l.C0185a
        /* renamed from: a */
        public void mo143a(android.view.View r1, p000a.p018g.p029l.p030a0.C0191c r2) {
                r0 = this;
                super.mo143a(r1, r2)
                boolean r1 = androidx.drawerlayout.widget.DrawerLayout.m1430m(r1)
                if (r1 != 0) goto L_0x000d
                r1 = 0
                r2.m3532b(r1)
            L_0x000d:
                return
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$d */
    /* loaded from: classes.dex */
    public interface AbstractC0727d {
        /* renamed from: a */
        void mo1425a(int r1);

        /* renamed from: a */
        void mo1424a(android.view.View r1);

        /* renamed from: a */
        void mo1423a(android.view.View r1, float r2);

        /* renamed from: b */
        void mo1422b(android.view.View r1);
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e */
    /* loaded from: classes.dex */
    public static class C0728e extends android.view.ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f2764a;

        /* renamed from: b */
        float f2765b;

        /* renamed from: c */
        boolean f2766c;

        /* renamed from: d */
        int f2767d;

        public C0728e(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.f2764a = r1
                return
        }

        public C0728e(android.content.Context r3, android.util.AttributeSet r4) {
                r2 = this;
                r2.<init>(r3, r4)
                r0 = 0
                r2.f2764a = r0
                int[] r1 = androidx.drawerlayout.widget.DrawerLayout.f2723M
                android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r1)
                int r4 = r3.getInt(r0, r0)
                r2.f2764a = r4
                r3.recycle()
                return
        }

        public C0728e(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.f2764a = r1
                return
        }

        public C0728e(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.f2764a = r1
                return
        }

        public C0728e(androidx.drawerlayout.widget.DrawerLayout.C0728e r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.f2764a = r0
                int r2 = r2.f2764a
                r1.f2764a = r2
                return
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$f */
    /* loaded from: classes.dex */
    protected static class C0729f extends p000a.p033i.p034a.AbstractC0237a {
        public static final android.os.Parcelable.Creator<androidx.drawerlayout.widget.DrawerLayout.C0729f> CREATOR = null;

        /* renamed from: d */
        int f2768d;

        /* renamed from: e */
        int f2769e;

        /* renamed from: f */
        int f2770f;

        /* renamed from: g */
        int f2771g;

        /* renamed from: h */
        int f2772h;

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$f$a */
        /* loaded from: classes.dex */
        static class C0730a implements android.os.Parcelable.ClassLoaderCreator<androidx.drawerlayout.widget.DrawerLayout.C0729f> {
            C0730a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public androidx.drawerlayout.widget.DrawerLayout.C0729f createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    androidx.drawerlayout.widget.DrawerLayout$f r0 = new androidx.drawerlayout.widget.DrawerLayout$f
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public androidx.drawerlayout.widget.DrawerLayout.C0729f createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    androidx.drawerlayout.widget.DrawerLayout$f r0 = new androidx.drawerlayout.widget.DrawerLayout$f
                    r0.<init>(r2, r3)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                    r0 = this;
                    androidx.drawerlayout.widget.DrawerLayout$f r1 = r0.createFromParcel(r1)
                    return r1
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ androidx.drawerlayout.widget.DrawerLayout.C0729f createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                    r0 = this;
                    androidx.drawerlayout.widget.DrawerLayout$f r1 = r0.createFromParcel(r1, r2)
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public androidx.drawerlayout.widget.DrawerLayout.C0729f[] newArray(int r1) {
                    r0 = this;
                    androidx.drawerlayout.widget.DrawerLayout$f[] r1 = new androidx.drawerlayout.widget.DrawerLayout.C0729f[r1]
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    androidx.drawerlayout.widget.DrawerLayout$f[] r1 = r0.newArray(r1)
                    return r1
            }
        }

        static {
                androidx.drawerlayout.widget.DrawerLayout$f$a r0 = new androidx.drawerlayout.widget.DrawerLayout$f$a
                r0.<init>()
                androidx.drawerlayout.widget.DrawerLayout.C0729f.CREATOR = r0
                return
        }

        public C0729f(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r2 = 0
                r0.f2768d = r2
                int r2 = r1.readInt()
                r0.f2768d = r2
                int r2 = r1.readInt()
                r0.f2769e = r2
                int r2 = r1.readInt()
                r0.f2770f = r2
                int r2 = r1.readInt()
                r0.f2771g = r2
                int r1 = r1.readInt()
                r0.f2772h = r1
                return
        }

        public C0729f(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.f2768d = r1
                return
        }

        @Override // p000a.p033i.p034a.AbstractC0237a, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.f2768d
                r1.writeInt(r2)
                int r2 = r0.f2769e
                r1.writeInt(r2)
                int r2 = r0.f2770f
                r1.writeInt(r2)
                int r2 = r0.f2771g
                r1.writeInt(r2)
                int r2 = r0.f2772h
                r1.writeInt(r2)
                return
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$g */
    /* loaded from: classes.dex */
    private class C0731g extends p000a.p033i.p035b.C0240a.AbstractC0243c {

        /* renamed from: a */
        private final int f2773a;

        /* renamed from: b */
        private p000a.p033i.p035b.C0240a f2774b;

        /* renamed from: c */
        private final java.lang.Runnable f2775c;

        /* renamed from: d */
        final /* synthetic */ androidx.drawerlayout.widget.DrawerLayout f2776d;

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$g$a */
        /* loaded from: classes.dex */
        class RunnableC0732a implements java.lang.Runnable {

            /* renamed from: b */
            final /* synthetic */ androidx.drawerlayout.widget.DrawerLayout.C0731g f2777b;

            RunnableC0732a(androidx.drawerlayout.widget.DrawerLayout.C0731g r1) {
                    r0 = this;
                    r0.f2777b = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r1 = this;
                    androidx.drawerlayout.widget.DrawerLayout$g r0 = r1.f2777b
                    r0.m1421a()
                    return
            }
        }

        C0731g(androidx.drawerlayout.widget.DrawerLayout r1, int r2) {
                r0 = this;
                r0.f2776d = r1
                r0.<init>()
                androidx.drawerlayout.widget.DrawerLayout$g$a r1 = new androidx.drawerlayout.widget.DrawerLayout$g$a
                r1.<init>(r0)
                r0.f2775c = r1
                r0.f2773a = r2
                return
        }

        /* renamed from: c */
        private void m1415c() {
                r2 = this;
                int r0 = r2.f2773a
                r1 = 3
                if (r0 != r1) goto L_0x0006
                r1 = 5
            L_0x0006:
                androidx.drawerlayout.widget.DrawerLayout r0 = r2.f2776d
                android.view.View r0 = r0.m1462b(r1)
                if (r0 == 0) goto L_0x0013
                androidx.drawerlayout.widget.DrawerLayout r1 = r2.f2776d
                r1.m1470a(r0)
            L_0x0013:
                return
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: a */
        public int mo303a(android.view.View r2) {
                r1 = this;
                androidx.drawerlayout.widget.DrawerLayout r0 = r1.f2776d
                boolean r0 = r0.m1434i(r2)
                if (r0 == 0) goto L_0x000d
                int r2 = r2.getWidth()
                goto L_0x000e
            L_0x000d:
                r2 = 0
            L_0x000e:
                return r2
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: a */
        public int mo237a(android.view.View r2, int r3, int r4) {
                r1 = this;
                androidx.drawerlayout.widget.DrawerLayout r4 = r1.f2776d
                r0 = 3
                boolean r4 = r4.m1468a(r2, r0)
                if (r4 == 0) goto L_0x0018
                int r2 = r2.getWidth()
                int r2 = -r2
                r4 = 0
            L_0x000f:
                int r3 = java.lang.Math.min(r3, r4)
                int r2 = java.lang.Math.max(r2, r3)
                return r2
            L_0x0018:
                androidx.drawerlayout.widget.DrawerLayout r4 = r1.f2776d
                int r4 = r4.getWidth()
                int r2 = r2.getWidth()
                int r2 = r4 - r2
                goto L_0x000f
        }

        /* renamed from: a */
        void m1421a() {
                r6 = this;
                a.i.b.a r0 = r6.f2774b
                int r0 = r0.m3318c()
                int r1 = r6.f2773a
                r2 = 1
                r3 = 0
                r4 = 3
                if (r1 != r4) goto L_0x000f
                r1 = 1
                goto L_0x0010
            L_0x000f:
                r1 = 0
            L_0x0010:
                if (r1 == 0) goto L_0x0021
                androidx.drawerlayout.widget.DrawerLayout r5 = r6.f2776d
                android.view.View r4 = r5.m1462b(r4)
                if (r4 == 0) goto L_0x001f
                int r3 = r4.getWidth()
                int r3 = -r3
            L_0x001f:
                int r3 = r3 + r0
                goto L_0x002f
            L_0x0021:
                androidx.drawerlayout.widget.DrawerLayout r3 = r6.f2776d
                r4 = 5
                android.view.View r4 = r3.m1462b(r4)
                androidx.drawerlayout.widget.DrawerLayout r3 = r6.f2776d
                int r3 = r3.getWidth()
                int r3 = r3 - r0
            L_0x002f:
                if (r4 == 0) goto L_0x0067
                if (r1 == 0) goto L_0x0039
                int r0 = r4.getLeft()
                if (r0 < r3) goto L_0x0041
            L_0x0039:
                if (r1 != 0) goto L_0x0067
                int r0 = r4.getLeft()
                if (r0 <= r3) goto L_0x0067
            L_0x0041:
                androidx.drawerlayout.widget.DrawerLayout r0 = r6.f2776d
                int r0 = r0.m1448d(r4)
                if (r0 != 0) goto L_0x0067
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                androidx.drawerlayout.widget.DrawerLayout$e r0 = (androidx.drawerlayout.widget.DrawerLayout.C0728e) r0
                a.i.b.a r1 = r6.f2774b
                int r5 = r4.getTop()
                r1.m3319b(r4, r3, r5)
                r0.f2766c = r2
                androidx.drawerlayout.widget.DrawerLayout r0 = r6.f2776d
                r0.invalidate()
                r6.m1415c()
                androidx.drawerlayout.widget.DrawerLayout r0 = r6.f2776d
                r0.m1478a()
            L_0x0067:
                return
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: a */
        public void mo1420a(int r2, int r3) {
                r1 = this;
                r0 = 1
                r2 = r2 & r0
                if (r2 != r0) goto L_0x0008
                androidx.drawerlayout.widget.DrawerLayout r2 = r1.f2776d
                r0 = 3
                goto L_0x000b
            L_0x0008:
                androidx.drawerlayout.widget.DrawerLayout r2 = r1.f2776d
                r0 = 5
            L_0x000b:
                android.view.View r2 = r2.m1462b(r0)
                if (r2 == 0) goto L_0x001e
                androidx.drawerlayout.widget.DrawerLayout r0 = r1.f2776d
                int r0 = r0.m1448d(r2)
                if (r0 != 0) goto L_0x001e
                a.i.b.a r0 = r1.f2774b
                r0.m3334a(r2, r3)
            L_0x001e:
                return
        }

        /* renamed from: a */
        public void m1419a(p000a.p033i.p035b.C0240a r1) {
                r0 = this;
                r0.f2774b = r1
                return
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: a */
        public void mo238a(android.view.View r6, float r7, float r8) {
                r5 = this;
                androidx.drawerlayout.widget.DrawerLayout r8 = r5.f2776d
                float r8 = r8.m1442f(r6)
                int r0 = r6.getWidth()
                androidx.drawerlayout.widget.DrawerLayout r1 = r5.f2776d
                r2 = 3
                boolean r1 = r1.m1468a(r6, r2)
                r2 = 1056964608(0x3f000000, float:0.5)
                r3 = 0
                if (r1 == 0) goto L_0x0027
                int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r1 > 0) goto L_0x0025
                int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r7 != 0) goto L_0x0023
                int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r7 <= 0) goto L_0x0023
                goto L_0x0025
            L_0x0023:
                int r7 = -r0
                goto L_0x003b
            L_0x0025:
                r7 = 0
                goto L_0x003b
            L_0x0027:
                androidx.drawerlayout.widget.DrawerLayout r1 = r5.f2776d
                int r1 = r1.getWidth()
                int r4 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r4 < 0) goto L_0x0039
                int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r7 != 0) goto L_0x003a
                int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r7 <= 0) goto L_0x003a
            L_0x0039:
                int r1 = r1 - r0
            L_0x003a:
                r7 = r1
            L_0x003b:
                a.i.b.a r8 = r5.f2774b
                int r6 = r6.getTop()
                r8.m3312d(r7, r6)
                androidx.drawerlayout.widget.DrawerLayout r6 = r5.f2776d
                r6.invalidate()
                return
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: a */
        public void mo301a(android.view.View r1, int r2) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.drawerlayout.widget.DrawerLayout$e r1 = (androidx.drawerlayout.widget.DrawerLayout.C0728e) r1
                r2 = 0
                r1.f2766c = r2
                r0.m1415c()
                return
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: a */
        public void mo236a(android.view.View r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                int r3 = r1.getWidth()
                androidx.drawerlayout.widget.DrawerLayout r4 = r0.f2776d
                r5 = 3
                boolean r4 = r4.m1468a(r1, r5)
                if (r4 == 0) goto L_0x0010
                int r2 = r2 + r3
                float r2 = (float) r2
                goto L_0x0018
            L_0x0010:
                androidx.drawerlayout.widget.DrawerLayout r4 = r0.f2776d
                int r4 = r4.getWidth()
                int r4 = r4 - r2
                float r2 = (float) r4
            L_0x0018:
                float r3 = (float) r3
                float r2 = r2 / r3
                androidx.drawerlayout.widget.DrawerLayout r3 = r0.f2776d
                r3.m1452c(r1, r2)
                r3 = 0
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 != 0) goto L_0x0026
                r2 = 4
                goto L_0x0027
            L_0x0026:
                r2 = 0
            L_0x0027:
                r1.setVisibility(r2)
                androidx.drawerlayout.widget.DrawerLayout r1 = r0.f2776d
                r1.invalidate()
                return
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: b */
        public int mo233b(android.view.View r1, int r2, int r3) {
                r0 = this;
                int r1 = r1.getTop()
                return r1
        }

        /* renamed from: b */
        public void m1418b() {
                r2 = this;
                androidx.drawerlayout.widget.DrawerLayout r0 = r2.f2776d
                java.lang.Runnable r1 = r2.f2775c
                r0.removeCallbacks(r1)
                return
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: b */
        public void mo1416b(int r3, int r4) {
                r2 = this;
                androidx.drawerlayout.widget.DrawerLayout r3 = r2.f2776d
                java.lang.Runnable r4 = r2.f2775c
                r0 = 160(0xa0, double:7.9E-322)
                r3.postDelayed(r4, r0)
                return
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: b */
        public boolean mo1417b(int r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: b */
        public boolean mo234b(android.view.View r2, int r3) {
                r1 = this;
                androidx.drawerlayout.widget.DrawerLayout r3 = r1.f2776d
                boolean r3 = r3.m1434i(r2)
                if (r3 == 0) goto L_0x001c
                androidx.drawerlayout.widget.DrawerLayout r3 = r1.f2776d
                int r0 = r1.f2773a
                boolean r3 = r3.m1468a(r2, r0)
                if (r3 == 0) goto L_0x001c
                androidx.drawerlayout.widget.DrawerLayout r3 = r1.f2776d
                int r2 = r3.m1448d(r2)
                if (r2 != 0) goto L_0x001c
                r2 = 1
                goto L_0x001d
            L_0x001c:
                r2 = 0
            L_0x001d:
                return r2
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: c */
        public void mo232c(int r4) {
                r3 = this;
                androidx.drawerlayout.widget.DrawerLayout r0 = r3.f2776d
                int r1 = r3.f2773a
                a.i.b.a r2 = r3.f2774b
                android.view.View r2 = r2.m3328b()
                r0.m1474a(r1, r4, r2)
                return
        }
    }

    static {
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 16843828(0x1010434, float:2.3696574E-38)
            r1[r2] = r3
            androidx.drawerlayout.widget.DrawerLayout.f2722L = r1
            int[] r1 = new int[r0]
            r3 = 16842931(0x10100b3, float:2.369406E-38)
            r1[r2] = r3
            androidx.drawerlayout.widget.DrawerLayout.f2723M = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 19
            if (r1 < r3) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            androidx.drawerlayout.widget.DrawerLayout.f2724N = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r1 < r3) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            androidx.drawerlayout.widget.DrawerLayout.f2725O = r0
            return
    }

    public DrawerLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public DrawerLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public DrawerLayout(android.content.Context r6, android.util.AttributeSet r7, int r8) {
            r5 = this;
            r5.<init>(r6, r7, r8)
            androidx.drawerlayout.widget.DrawerLayout$c r7 = new androidx.drawerlayout.widget.DrawerLayout$c
            r7.<init>()
            r5.f2737b = r7
            r7 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
            r5.f2740e = r7
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r5.f2742g = r7
            r7 = 1
            r5.f2749n = r7
            r8 = 3
            r5.f2750o = r8
            r5.f2751p = r8
            r5.f2752q = r8
            r5.f2753r = r8
            r0 = 0
            r5.f2730E = r0
            r5.f2731F = r0
            r5.f2732G = r0
            r5.f2733H = r0
            r1 = 262144(0x40000, float:3.67342E-40)
            r5.setDescendantFocusability(r1)
            android.content.res.Resources r1 = r5.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r2 = 1115684864(0x42800000, float:64.0)
            float r2 = r2 * r1
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            r5.f2739d = r2
            r2 = 1137180672(0x43c80000, float:400.0)
            float r2 = r2 * r1
            androidx.drawerlayout.widget.DrawerLayout$g r3 = new androidx.drawerlayout.widget.DrawerLayout$g
            r3.<init>(r5, r8)
            r5.f2745j = r3
            androidx.drawerlayout.widget.DrawerLayout$g r8 = new androidx.drawerlayout.widget.DrawerLayout$g
            r3 = 5
            r8.<init>(r5, r3)
            r5.f2746k = r8
            androidx.drawerlayout.widget.DrawerLayout$g r8 = r5.f2745j
            r3 = 1065353216(0x3f800000, float:1.0)
            a.i.b.a r8 = p000a.p033i.p035b.C0240a.m3331a(r5, r3, r8)
            r5.f2743h = r8
            a.i.b.a r8 = r5.f2743h
            r8.m3313d(r7)
            a.i.b.a r8 = r5.f2743h
            r8.m3345a(r2)
            androidx.drawerlayout.widget.DrawerLayout$g r8 = r5.f2745j
            a.i.b.a r4 = r5.f2743h
            r8.m1419a(r4)
            androidx.drawerlayout.widget.DrawerLayout$g r8 = r5.f2746k
            a.i.b.a r8 = p000a.p033i.p035b.C0240a.m3331a(r5, r3, r8)
            r5.f2744i = r8
            a.i.b.a r8 = r5.f2744i
            r3 = 2
            r8.m3313d(r3)
            a.i.b.a r8 = r5.f2744i
            r8.m3345a(r2)
            androidx.drawerlayout.widget.DrawerLayout$g r8 = r5.f2746k
            a.i.b.a r2 = r5.f2744i
            r8.m1419a(r2)
            r5.setFocusableInTouchMode(r7)
            p000a.p018g.p029l.C0216r.m3418e(r5, r7)
            androidx.drawerlayout.widget.DrawerLayout$b r7 = new androidx.drawerlayout.widget.DrawerLayout$b
            r7.<init>(r5)
            p000a.p018g.p029l.C0216r.m3440a(r5, r7)
            r7 = 0
            r5.setMotionEventSplittingEnabled(r7)
            boolean r8 = p000a.p018g.p029l.C0216r.m3415g(r5)
            if (r8 == 0) goto L_0x00cd
            int r8 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r8 < r2) goto L_0x00cb
            androidx.drawerlayout.widget.DrawerLayout$a r8 = new androidx.drawerlayout.widget.DrawerLayout$a
            r8.<init>(r5)
            r5.setOnApplyWindowInsetsListener(r8)
            r8 = 1280(0x500, float:1.794E-42)
            r5.setSystemUiVisibility(r8)
            int[] r8 = androidx.drawerlayout.widget.DrawerLayout.f2722L
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r8)
            android.graphics.drawable.Drawable r7 = r6.getDrawable(r7)     // Catch: all -> 0x00c6
            r5.f2759x = r7     // Catch: all -> 0x00c6
            r6.recycle()
            goto L_0x00cd
        L_0x00c6:
            r7 = move-exception
            r6.recycle()
            throw r7
        L_0x00cb:
            r5.f2759x = r0
        L_0x00cd:
            r6 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 * r6
            r5.f2738c = r1
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.f2734I = r6
            return
    }

    /* renamed from: a */
    private boolean m1477a(float r2, float r3, android.view.View r4) {
            r1 = this;
            android.graphics.Rect r0 = r1.f2735J
            if (r0 != 0) goto L_0x000b
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.f2735J = r0
        L_0x000b:
            android.graphics.Rect r0 = r1.f2735J
            r4.getHitRect(r0)
            android.graphics.Rect r4 = r1.f2735J
            int r2 = (int) r2
            int r3 = (int) r3
            boolean r2 = r4.contains(r2, r3)
            return r2
    }

    /* renamed from: a */
    private boolean m1472a(android.graphics.drawable.Drawable r2, int r3) {
            r1 = this;
            if (r2 == 0) goto L_0x000e
            boolean r0 = androidx.core.graphics.drawable.C0698a.m1593f(r2)
            if (r0 != 0) goto L_0x0009
            goto L_0x000e
        L_0x0009:
            androidx.core.graphics.drawable.C0698a.m1605a(r2, r3)
            r2 = 1
            return r2
        L_0x000e:
            r2 = 0
            return r2
    }

    /* renamed from: a */
    private boolean m1471a(android.view.MotionEvent r4, android.view.View r5) {
            r3 = this;
            android.graphics.Matrix r0 = r5.getMatrix()
            boolean r0 = r0.isIdentity()
            if (r0 != 0) goto L_0x0016
            android.view.MotionEvent r4 = r3.m1460b(r4, r5)
            boolean r5 = r5.dispatchGenericMotionEvent(r4)
            r4.recycle()
            goto L_0x0036
        L_0x0016:
            int r0 = r3.getScrollX()
            int r1 = r5.getLeft()
            int r0 = r0 - r1
            float r0 = (float) r0
            int r1 = r3.getScrollY()
            int r2 = r5.getTop()
            int r1 = r1 - r2
            float r1 = (float) r1
            r4.offsetLocation(r0, r1)
            boolean r5 = r5.dispatchGenericMotionEvent(r4)
            float r0 = -r0
            float r1 = -r1
            r4.offsetLocation(r0, r1)
        L_0x0036:
            return r5
    }

    /* renamed from: b */
    private android.view.MotionEvent m1460b(android.view.MotionEvent r4, android.view.View r5) {
            r3 = this;
            int r0 = r3.getScrollX()
            int r1 = r5.getLeft()
            int r0 = r0 - r1
            float r0 = (float) r0
            int r1 = r3.getScrollY()
            int r2 = r5.getTop()
            int r1 = r1 - r2
            float r1 = (float) r1
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r4)
            r4.offsetLocation(r0, r1)
            android.graphics.Matrix r5 = r5.getMatrix()
            boolean r0 = r5.isIdentity()
            if (r0 != 0) goto L_0x003a
            android.graphics.Matrix r0 = r3.f2736K
            if (r0 != 0) goto L_0x0030
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r3.f2736K = r0
        L_0x0030:
            android.graphics.Matrix r0 = r3.f2736K
            r5.invert(r0)
            android.graphics.Matrix r5 = r3.f2736K
            r4.transform(r5)
        L_0x003a:
            return r4
    }

    /* renamed from: c */
    private void m1451c(android.view.View r5, boolean r6) {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x0020
            android.view.View r2 = r4.getChildAt(r1)
            if (r6 != 0) goto L_0x0013
            boolean r3 = r4.m1434i(r2)
            if (r3 == 0) goto L_0x0017
        L_0x0013:
            if (r6 == 0) goto L_0x0019
            if (r2 != r5) goto L_0x0019
        L_0x0017:
            r3 = 1
            goto L_0x001a
        L_0x0019:
            r3 = 4
        L_0x001a:
            p000a.p018g.p029l.C0216r.m3418e(r2, r3)
            int r1 = r1 + 1
            goto L_0x0005
        L_0x0020:
            return
    }

    /* renamed from: e */
    private boolean m1447e() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            r2 = 0
        L_0x0006:
            if (r2 >= r0) goto L_0x001b
            android.view.View r3 = r4.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r3 = (androidx.drawerlayout.widget.DrawerLayout.C0728e) r3
            boolean r3 = r3.f2766c
            if (r3 == 0) goto L_0x0018
            r0 = 1
            return r0
        L_0x0018:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x001b:
            return r1
    }

    /* renamed from: f */
    private boolean m1444f() {
            r1 = this;
            android.view.View r0 = r1.m1450d()
            if (r0 == 0) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            return r0
    }

    /* renamed from: g */
    private android.graphics.drawable.Drawable m1441g() {
            r2 = this;
            int r0 = p000a.p018g.p029l.C0216r.m3411j(r2)
            if (r0 != 0) goto L_0x0010
            android.graphics.drawable.Drawable r1 = r2.f2730E
            if (r1 == 0) goto L_0x001a
            r2.m1472a(r1, r0)
            android.graphics.drawable.Drawable r0 = r2.f2730E
            return r0
        L_0x0010:
            android.graphics.drawable.Drawable r1 = r2.f2731F
            if (r1 == 0) goto L_0x001a
            r2.m1472a(r1, r0)
            android.graphics.drawable.Drawable r0 = r2.f2731F
            return r0
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r2.f2732G
            return r0
    }

    /* renamed from: h */
    private android.graphics.drawable.Drawable m1438h() {
            r2 = this;
            int r0 = p000a.p018g.p029l.C0216r.m3411j(r2)
            if (r0 != 0) goto L_0x0010
            android.graphics.drawable.Drawable r1 = r2.f2731F
            if (r1 == 0) goto L_0x001a
            r2.m1472a(r1, r0)
            android.graphics.drawable.Drawable r0 = r2.f2731F
            return r0
        L_0x0010:
            android.graphics.drawable.Drawable r1 = r2.f2730E
            if (r1 == 0) goto L_0x001a
            r2.m1472a(r1, r0)
            android.graphics.drawable.Drawable r0 = r2.f2730E
            return r0
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r2.f2733H
            return r0
    }

    /* renamed from: h */
    static java.lang.String m1437h(int r2) {
            r0 = r2 & 3
            r1 = 3
            if (r0 != r1) goto L_0x0008
            java.lang.String r2 = "LEFT"
            return r2
        L_0x0008:
            r0 = r2 & 5
            r1 = 5
            if (r0 != r1) goto L_0x0010
            java.lang.String r2 = "RIGHT"
            return r2
        L_0x0010:
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            return r2
    }

    /* renamed from: i */
    private void m1435i() {
            r1 = this;
            boolean r0 = androidx.drawerlayout.widget.DrawerLayout.f2725O
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            android.graphics.drawable.Drawable r0 = r1.m1441g()
            r1.f2760y = r0
            android.graphics.drawable.Drawable r0 = r1.m1438h()
            r1.f2761z = r0
            return
    }

    /* renamed from: l */
    private static boolean m1431l(android.view.View r2) {
            android.graphics.drawable.Drawable r2 = r2.getBackground()
            r0 = 0
            if (r2 == 0) goto L_0x000f
            int r2 = r2.getOpacity()
            r1 = -1
            if (r2 != r1) goto L_0x000f
            r0 = 1
        L_0x000f:
            return r0
    }

    /* renamed from: m */
    static boolean m1430m(android.view.View r2) {
            int r0 = p000a.p018g.p029l.C0216r.m3413h(r2)
            r1 = 4
            if (r0 == r1) goto L_0x0010
            int r2 = p000a.p018g.p029l.C0216r.m3413h(r2)
            r0 = 2
            if (r2 == r0) goto L_0x0010
            r2 = 1
            goto L_0x0011
        L_0x0010:
            r2 = 0
        L_0x0011:
            return r2
    }

    /* renamed from: a */
    void m1478a() {
            r9 = this;
            boolean r0 = r9.f2754s
            if (r0 != 0) goto L_0x0028
            long r3 = android.os.SystemClock.uptimeMillis()
            r5 = 3
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r3
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r1, r3, r5, r6, r7, r8)
            int r1 = r9.getChildCount()
            r2 = 0
        L_0x0016:
            if (r2 >= r1) goto L_0x0022
            android.view.View r3 = r9.getChildAt(r2)
            r3.dispatchTouchEvent(r0)
            int r2 = r2 + 1
            goto L_0x0016
        L_0x0022:
            r0.recycle()
            r0 = 1
            r9.f2754s = r0
        L_0x0028:
            return
    }

    /* renamed from: a */
    public void m1476a(int r2) {
            r1 = this;
            r0 = 1
            r1.m1473a(r2, r0)
            return
    }

    /* renamed from: a */
    public void m1475a(int r4, int r5) {
            r3 = this;
            int r0 = p000a.p018g.p029l.C0216r.m3411j(r3)
            int r0 = p000a.p018g.p029l.C0200c.m3490a(r5, r0)
            r1 = 3
            if (r5 == r1) goto L_0x0022
            r2 = 5
            if (r5 == r2) goto L_0x001f
            r2 = 8388611(0x800003, float:1.1754948E-38)
            if (r5 == r2) goto L_0x001c
            r2 = 8388613(0x800005, float:1.175495E-38)
            if (r5 == r2) goto L_0x0019
            goto L_0x0024
        L_0x0019:
            r3.f2753r = r4
            goto L_0x0024
        L_0x001c:
            r3.f2752q = r4
            goto L_0x0024
        L_0x001f:
            r3.f2751p = r4
            goto L_0x0024
        L_0x0022:
            r3.f2750o = r4
        L_0x0024:
            if (r4 == 0) goto L_0x0030
            if (r0 != r1) goto L_0x002b
            a.i.b.a r5 = r3.f2743h
            goto L_0x002d
        L_0x002b:
            a.i.b.a r5 = r3.f2744i
        L_0x002d:
            r5.m3346a()
        L_0x0030:
            r5 = 1
            if (r4 == r5) goto L_0x0041
            r5 = 2
            if (r4 == r5) goto L_0x0037
            goto L_0x004a
        L_0x0037:
            android.view.View r4 = r3.m1462b(r0)
            if (r4 == 0) goto L_0x004a
            r3.m1432k(r4)
            goto L_0x004a
        L_0x0041:
            android.view.View r4 = r3.m1462b(r0)
            if (r4 == 0) goto L_0x004a
            r3.m1470a(r4)
        L_0x004a:
            return
    }

    /* renamed from: a */
    void m1474a(int r4, int r5, android.view.View r6) {
            r3 = this;
            a.i.b.a r4 = r3.f2743h
            int r4 = r4.m3311e()
            a.i.b.a r0 = r3.f2744i
            int r0 = r0.m3311e()
            r1 = 2
            r2 = 1
            if (r4 == r2) goto L_0x001a
            if (r0 != r2) goto L_0x0013
            goto L_0x001a
        L_0x0013:
            if (r4 == r1) goto L_0x001b
            if (r0 != r1) goto L_0x0018
            goto L_0x001b
        L_0x0018:
            r1 = 0
            goto L_0x001b
        L_0x001a:
            r1 = 1
        L_0x001b:
            if (r6 == 0) goto L_0x0039
            if (r5 != 0) goto L_0x0039
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r4 = (androidx.drawerlayout.widget.DrawerLayout.C0728e) r4
            float r4 = r4.f2765b
            r5 = 0
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0030
            r3.m1459b(r6)
            goto L_0x0039
        L_0x0030:
            r5 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x0039
            r3.m1453c(r6)
        L_0x0039:
            int r4 = r3.f2747l
            if (r1 == r4) goto L_0x0058
            r3.f2747l = r1
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$d> r4 = r3.f2756u
            if (r4 == 0) goto L_0x0058
            int r4 = r4.size()
            int r4 = r4 - r2
        L_0x0048:
            if (r4 < 0) goto L_0x0058
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$d> r5 = r3.f2756u
            java.lang.Object r5 = r5.get(r4)
            androidx.drawerlayout.widget.DrawerLayout$d r5 = (androidx.drawerlayout.widget.DrawerLayout.AbstractC0727d) r5
            r5.mo1425a(r1)
            int r4 = r4 + (-1)
            goto L_0x0048
        L_0x0058:
            return
    }

    /* renamed from: a */
    public void m1473a(int r3, boolean r4) {
            r2 = this;
            android.view.View r0 = r2.m1462b(r3)
            if (r0 == 0) goto L_0x000a
            r2.m1467a(r0, r4)
            return
        L_0x000a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No drawer view found with gravity "
            r0.append(r1)
            java.lang.String r3 = m1437h(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    /* renamed from: a */
    public void m1470a(android.view.View r2) {
            r1 = this;
            r0 = 1
            r1.m1467a(r2, r0)
            return
    }

    /* renamed from: a */
    void m1469a(android.view.View r3, float r4) {
            r2 = this;
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$d> r0 = r2.f2756u
            if (r0 == 0) goto L_0x001a
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L_0x000a:
            if (r0 < 0) goto L_0x001a
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$d> r1 = r2.f2756u
            java.lang.Object r1 = r1.get(r0)
            androidx.drawerlayout.widget.DrawerLayout$d r1 = (androidx.drawerlayout.widget.DrawerLayout.AbstractC0727d) r1
            r1.mo1423a(r3, r4)
            int r0 = r0 + (-1)
            goto L_0x000a
        L_0x001a:
            return
    }

    /* renamed from: a */
    public void m1467a(android.view.View r5, boolean r6) {
            r4 = this;
            boolean r0 = r4.m1434i(r5)
            if (r0 == 0) goto L_0x004b
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r0 = (androidx.drawerlayout.widget.DrawerLayout.C0728e) r0
            boolean r1 = r4.f2749n
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0017
            r0.f2765b = r3
            r0.f2767d = r2
            goto L_0x0047
        L_0x0017:
            r1 = 4
            if (r6 == 0) goto L_0x003c
            int r6 = r0.f2767d
            r6 = r6 | r1
            r0.f2767d = r6
            r6 = 3
            boolean r6 = r4.m1468a(r5, r6)
            if (r6 == 0) goto L_0x002e
            a.i.b.a r6 = r4.f2743h
            int r0 = r5.getWidth()
            int r0 = -r0
            goto L_0x0034
        L_0x002e:
            a.i.b.a r6 = r4.f2744i
            int r0 = r4.getWidth()
        L_0x0034:
            int r1 = r5.getTop()
            r6.m3319b(r5, r0, r1)
            goto L_0x0047
        L_0x003c:
            r4.m1458b(r5, r3)
            int r6 = r0.f2764a
            r4.m1474a(r6, r2, r5)
            r5.setVisibility(r1)
        L_0x0047:
            r4.invalidate()
            return
        L_0x004b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "View "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = " is not a sliding drawer"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
    }

    /* renamed from: a */
    public void m1466a(androidx.drawerlayout.widget.DrawerLayout.AbstractC0727d r2) {
            r1 = this;
            if (r2 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$d> r0 = r1.f2756u
            if (r0 != 0) goto L_0x000e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2756u = r0
        L_0x000e:
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$d> r0 = r1.f2756u
            r0.add(r2)
            return
    }

    /* renamed from: a */
    public void m1465a(java.lang.Object r1, boolean r2) {
            r0 = this;
            r0.f2728C = r1
            r0.f2729D = r2
            if (r2 != 0) goto L_0x000e
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            if (r1 != 0) goto L_0x000e
            r1 = 1
            goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            r0.setWillNotDraw(r1)
            r0.requestLayout()
            return
    }

    /* renamed from: a */
    void m1464a(boolean r10) {
            r9 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0007:
            if (r2 >= r0) goto L_0x004b
            android.view.View r4 = r9.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r5 = (androidx.drawerlayout.widget.DrawerLayout.C0728e) r5
            boolean r6 = r9.m1434i(r4)
            if (r6 == 0) goto L_0x0048
            if (r10 == 0) goto L_0x0020
            boolean r6 = r5.f2766c
            if (r6 != 0) goto L_0x0020
            goto L_0x0048
        L_0x0020:
            int r6 = r4.getWidth()
            r7 = 3
            boolean r7 = r9.m1468a(r4, r7)
            if (r7 == 0) goto L_0x0037
            a.i.b.a r7 = r9.f2743h
            int r6 = -r6
            int r8 = r4.getTop()
            boolean r4 = r7.m3319b(r4, r6, r8)
            goto L_0x0045
        L_0x0037:
            a.i.b.a r6 = r9.f2744i
            int r7 = r9.getWidth()
            int r8 = r4.getTop()
            boolean r4 = r6.m3319b(r4, r7, r8)
        L_0x0045:
            r3 = r3 | r4
            r5.f2766c = r1
        L_0x0048:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x004b:
            androidx.drawerlayout.widget.DrawerLayout$g r10 = r9.f2745j
            r10.m1418b()
            androidx.drawerlayout.widget.DrawerLayout$g r10 = r9.f2746k
            r10.m1418b()
            if (r3 == 0) goto L_0x005a
            r9.invalidate()
        L_0x005a:
            return
    }

    /* renamed from: a */
    boolean m1468a(android.view.View r1, int r2) {
            r0 = this;
            int r1 = r0.m1445e(r1)
            r1 = r1 & r2
            if (r1 != r2) goto L_0x0009
            r1 = 1
            goto L_0x000a
        L_0x0009:
            r1 = 0
        L_0x000a:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(java.util.ArrayList<android.view.View> r7, int r8, int r9) {
            r6 = this;
            int r0 = r6.getDescendantFocusability()
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 != r1) goto L_0x0009
            return
        L_0x0009:
            int r0 = r6.getChildCount()
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0010:
            if (r2 >= r0) goto L_0x002f
            android.view.View r4 = r6.getChildAt(r2)
            boolean r5 = r6.m1434i(r4)
            if (r5 == 0) goto L_0x0027
            boolean r5 = r6.m1436h(r4)
            if (r5 == 0) goto L_0x002c
            r4.addFocusables(r7, r8, r9)
            r3 = 1
            goto L_0x002c
        L_0x0027:
            java.util.ArrayList<android.view.View> r5 = r6.f2734I
            r5.add(r4)
        L_0x002c:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x002f:
            if (r3 != 0) goto L_0x004d
            java.util.ArrayList<android.view.View> r0 = r6.f2734I
            int r0 = r0.size()
        L_0x0037:
            if (r1 >= r0) goto L_0x004d
            java.util.ArrayList<android.view.View> r2 = r6.f2734I
            java.lang.Object r2 = r2.get(r1)
            android.view.View r2 = (android.view.View) r2
            int r3 = r2.getVisibility()
            if (r3 != 0) goto L_0x004a
            r2.addFocusables(r7, r8, r9)
        L_0x004a:
            int r1 = r1 + 1
            goto L_0x0037
        L_0x004d:
            java.util.ArrayList<android.view.View> r7 = r6.f2734I
            r7.clear()
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0 = this;
            super.addView(r1, r2, r3)
            android.view.View r2 = r0.m1455c()
            if (r2 != 0) goto L_0x0012
            boolean r2 = r0.m1434i(r1)
            if (r2 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r2 = 1
            goto L_0x0013
        L_0x0012:
            r2 = 4
        L_0x0013:
            p000a.p018g.p029l.C0216r.m3418e(r1, r2)
            boolean r2 = androidx.drawerlayout.widget.DrawerLayout.f2724N
            if (r2 != 0) goto L_0x001f
            androidx.drawerlayout.widget.DrawerLayout$c r2 = r0.f2737b
            p000a.p018g.p029l.C0216r.m3440a(r1, r2)
        L_0x001f:
            return
    }

    /* renamed from: b */
    android.view.View m1462b(int r5) {
            r4 = this;
            int r0 = p000a.p018g.p029l.C0216r.m3411j(r4)
            int r5 = p000a.p018g.p029l.C0200c.m3490a(r5, r0)
            r5 = r5 & 7
            int r0 = r4.getChildCount()
            r1 = 0
        L_0x000f:
            if (r1 >= r0) goto L_0x0021
            android.view.View r2 = r4.getChildAt(r1)
            int r3 = r4.m1445e(r2)
            r3 = r3 & 7
            if (r3 != r5) goto L_0x001e
            return r2
        L_0x001e:
            int r1 = r1 + 1
            goto L_0x000f
        L_0x0021:
            r5 = 0
            return r5
    }

    /* renamed from: b */
    public void m1463b() {
            r1 = this;
            r0 = 0
            r1.m1464a(r0)
            return
    }

    /* renamed from: b */
    public void m1461b(int r3, boolean r4) {
            r2 = this;
            android.view.View r0 = r2.m1462b(r3)
            if (r0 == 0) goto L_0x000a
            r2.m1457b(r0, r4)
            return
        L_0x000a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No drawer view found with gravity "
            r0.append(r1)
            java.lang.String r3 = m1437h(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    /* renamed from: b */
    void m1459b(android.view.View r4) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r0 = (androidx.drawerlayout.widget.DrawerLayout.C0728e) r0
            int r1 = r0.f2767d
            r2 = 1
            r1 = r1 & r2
            if (r1 != r2) goto L_0x003c
            r1 = 0
            r0.f2767d = r1
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$d> r0 = r3.f2756u
            if (r0 == 0) goto L_0x0028
            int r0 = r0.size()
            int r0 = r0 - r2
        L_0x0018:
            if (r0 < 0) goto L_0x0028
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$d> r2 = r3.f2756u
            java.lang.Object r2 = r2.get(r0)
            androidx.drawerlayout.widget.DrawerLayout$d r2 = (androidx.drawerlayout.widget.DrawerLayout.AbstractC0727d) r2
            r2.mo1422b(r4)
            int r0 = r0 + (-1)
            goto L_0x0018
        L_0x0028:
            r3.m1451c(r4, r1)
            boolean r4 = r3.hasWindowFocus()
            if (r4 == 0) goto L_0x003c
            android.view.View r4 = r3.getRootView()
            if (r4 == 0) goto L_0x003c
            r0 = 32
            r4.sendAccessibilityEvent(r0)
        L_0x003c:
            return
    }

    /* renamed from: b */
    void m1458b(android.view.View r3, float r4) {
            r2 = this;
            float r0 = r2.m1442f(r3)
            int r1 = r3.getWidth()
            float r1 = (float) r1
            float r0 = r0 * r1
            int r0 = (int) r0
            float r1 = r1 * r4
            int r1 = (int) r1
            int r1 = r1 - r0
            r0 = 3
            boolean r0 = r2.m1468a(r3, r0)
            if (r0 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            int r1 = -r1
        L_0x0019:
            r3.offsetLeftAndRight(r1)
            r2.m1452c(r3, r4)
            return
    }

    /* renamed from: b */
    public void m1457b(android.view.View r4, boolean r5) {
            r3 = this;
            boolean r0 = r3.m1434i(r4)
            if (r0 == 0) goto L_0x0057
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r0 = (androidx.drawerlayout.widget.DrawerLayout.C0728e) r0
            boolean r1 = r3.f2749n
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x001b
            r0.f2765b = r2
            r5 = 1
            r0.f2767d = r5
            r3.m1451c(r4, r5)
            goto L_0x0053
        L_0x001b:
            r1 = 0
            if (r5 == 0) goto L_0x0048
            int r5 = r0.f2767d
            r5 = r5 | 2
            r0.f2767d = r5
            r5 = 3
            boolean r5 = r3.m1468a(r4, r5)
            if (r5 == 0) goto L_0x0035
            a.i.b.a r5 = r3.f2743h
            int r0 = r4.getTop()
            r5.m3319b(r4, r1, r0)
            goto L_0x0053
        L_0x0035:
            a.i.b.a r5 = r3.f2744i
            int r0 = r3.getWidth()
            int r1 = r4.getWidth()
            int r0 = r0 - r1
            int r1 = r4.getTop()
            r5.m3319b(r4, r0, r1)
            goto L_0x0053
        L_0x0048:
            r3.m1458b(r4, r2)
            int r5 = r0.f2764a
            r3.m1474a(r5, r1, r4)
            r4.setVisibility(r1)
        L_0x0053:
            r3.invalidate()
            return
        L_0x0057:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "View "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " is not a sliding drawer"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
    }

    /* renamed from: b */
    public void m1456b(androidx.drawerlayout.widget.DrawerLayout.AbstractC0727d r2) {
            r1 = this;
            if (r2 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$d> r0 = r1.f2756u
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            r0.remove(r2)
            return
    }

    /* renamed from: c */
    public int m1454c(int r4) {
            r3 = this;
            int r0 = p000a.p018g.p029l.C0216r.m3411j(r3)
            r1 = 3
            if (r4 == r1) goto L_0x0042
            r2 = 5
            if (r4 == r2) goto L_0x0033
            r2 = 8388611(0x800003, float:1.1754948E-38)
            if (r4 == r2) goto L_0x0024
            r2 = 8388613(0x800005, float:1.175495E-38)
            if (r4 == r2) goto L_0x0015
            goto L_0x0051
        L_0x0015:
            int r4 = r3.f2753r
            if (r4 == r1) goto L_0x001a
            return r4
        L_0x001a:
            if (r0 != 0) goto L_0x001f
            int r4 = r3.f2751p
            goto L_0x0021
        L_0x001f:
            int r4 = r3.f2750o
        L_0x0021:
            if (r4 == r1) goto L_0x0051
            return r4
        L_0x0024:
            int r4 = r3.f2752q
            if (r4 == r1) goto L_0x0029
            return r4
        L_0x0029:
            if (r0 != 0) goto L_0x002e
            int r4 = r3.f2750o
            goto L_0x0030
        L_0x002e:
            int r4 = r3.f2751p
        L_0x0030:
            if (r4 == r1) goto L_0x0051
            return r4
        L_0x0033:
            int r4 = r3.f2751p
            if (r4 == r1) goto L_0x0038
            return r4
        L_0x0038:
            if (r0 != 0) goto L_0x003d
            int r4 = r3.f2753r
            goto L_0x003f
        L_0x003d:
            int r4 = r3.f2752q
        L_0x003f:
            if (r4 == r1) goto L_0x0051
            return r4
        L_0x0042:
            int r4 = r3.f2750o
            if (r4 == r1) goto L_0x0047
            return r4
        L_0x0047:
            if (r0 != 0) goto L_0x004c
            int r4 = r3.f2752q
            goto L_0x004e
        L_0x004c:
            int r4 = r3.f2753r
        L_0x004e:
            if (r4 == r1) goto L_0x0051
            return r4
        L_0x0051:
            r4 = 0
            return r4
    }

    /* renamed from: c */
    android.view.View m1455c() {
            r5 = this;
            int r0 = r5.getChildCount()
            r1 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x001b
            android.view.View r2 = r5.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r3 = (androidx.drawerlayout.widget.DrawerLayout.C0728e) r3
            int r3 = r3.f2767d
            r4 = 1
            r3 = r3 & r4
            if (r3 != r4) goto L_0x0018
            return r2
        L_0x0018:
            int r1 = r1 + 1
            goto L_0x0005
        L_0x001b:
            r0 = 0
            return r0
    }

    /* renamed from: c */
    void m1453c(android.view.View r4) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r0 = (androidx.drawerlayout.widget.DrawerLayout.C0728e) r0
            int r1 = r0.f2767d
            r2 = 1
            r1 = r1 & r2
            if (r1 != 0) goto L_0x0035
            r0.f2767d = r2
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$d> r0 = r3.f2756u
            if (r0 == 0) goto L_0x0027
            int r0 = r0.size()
            int r0 = r0 - r2
        L_0x0017:
            if (r0 < 0) goto L_0x0027
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$d> r1 = r3.f2756u
            java.lang.Object r1 = r1.get(r0)
            androidx.drawerlayout.widget.DrawerLayout$d r1 = (androidx.drawerlayout.widget.DrawerLayout.AbstractC0727d) r1
            r1.mo1424a(r4)
            int r0 = r0 + (-1)
            goto L_0x0017
        L_0x0027:
            r3.m1451c(r4, r2)
            boolean r4 = r3.hasWindowFocus()
            if (r4 == 0) goto L_0x0035
            r4 = 32
            r3.sendAccessibilityEvent(r4)
        L_0x0035:
            return
    }

    /* renamed from: c */
    void m1452c(android.view.View r3, float r4) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r0 = (androidx.drawerlayout.widget.DrawerLayout.C0728e) r0
            float r1 = r0.f2765b
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x000d
            return
        L_0x000d:
            r0.f2765b = r4
            r2.m1469a(r3, r4)
            return
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.drawerlayout.widget.DrawerLayout.C0728e
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

    @Override // android.view.View
    public void computeScroll() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            r2 = 0
        L_0x0006:
            if (r2 >= r0) goto L_0x001b
            android.view.View r3 = r4.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r3 = (androidx.drawerlayout.widget.DrawerLayout.C0728e) r3
            float r3 = r3.f2765b
            float r1 = java.lang.Math.max(r1, r3)
            int r2 = r2 + 1
            goto L_0x0006
        L_0x001b:
            r4.f2741f = r1
            a.i.b.a r0 = r4.f2743h
            r1 = 1
            boolean r0 = r0.m3329a(r1)
            a.i.b.a r2 = r4.f2744i
            boolean r1 = r2.m3329a(r1)
            if (r0 != 0) goto L_0x002e
            if (r1 == 0) goto L_0x0031
        L_0x002e:
            p000a.p018g.p029l.C0216r.m3450A(r4)
        L_0x0031:
            return
    }

    /* renamed from: d */
    public int m1448d(android.view.View r4) {
            r3 = this;
            boolean r0 = r3.m1434i(r4)
            if (r0 == 0) goto L_0x0013
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r4 = (androidx.drawerlayout.widget.DrawerLayout.C0728e) r4
            int r4 = r4.f2764a
            int r4 = r3.m1454c(r4)
            return r4
        L_0x0013:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "View "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " is not a drawer"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* renamed from: d */
    android.view.View m1450d() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x001b
            android.view.View r2 = r4.getChildAt(r1)
            boolean r3 = r4.m1434i(r2)
            if (r3 == 0) goto L_0x0018
            boolean r3 = r4.m1433j(r2)
            if (r3 == 0) goto L_0x0018
            return r2
        L_0x0018:
            int r1 = r1 + 1
            goto L_0x0005
        L_0x001b:
            r0 = 0
            return r0
    }

    /* renamed from: d */
    public java.lang.CharSequence m1449d(int r2) {
            r1 = this;
            int r0 = p000a.p018g.p029l.C0216r.m3411j(r1)
            int r2 = p000a.p018g.p029l.C0200c.m3490a(r2, r0)
            r0 = 3
            if (r2 != r0) goto L_0x000e
            java.lang.CharSequence r2 = r1.f2726A
            return r2
        L_0x000e:
            r0 = 5
            if (r2 != r0) goto L_0x0014
            java.lang.CharSequence r2 = r1.f2727B
            return r2
        L_0x0014:
            r2 = 0
            return r2
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = r7.getSource()
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0047
            int r0 = r7.getAction()
            r1 = 10
            if (r0 == r1) goto L_0x0047
            float r0 = r6.f2741f
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0018
            goto L_0x0047
        L_0x0018:
            int r0 = r6.getChildCount()
            if (r0 == 0) goto L_0x0045
            float r1 = r7.getX()
            float r2 = r7.getY()
            r3 = 1
            int r0 = r0 - r3
        L_0x0028:
            if (r0 < 0) goto L_0x0045
            android.view.View r4 = r6.getChildAt(r0)
            boolean r5 = r6.m1477a(r1, r2, r4)
            if (r5 == 0) goto L_0x0042
            boolean r5 = r6.m1439g(r4)
            if (r5 == 0) goto L_0x003b
            goto L_0x0042
        L_0x003b:
            boolean r4 = r6.m1471a(r7, r4)
            if (r4 == 0) goto L_0x0042
            return r3
        L_0x0042:
            int r0 = r0 + (-1)
            goto L_0x0028
        L_0x0045:
            r7 = 0
            return r7
        L_0x0047:
            boolean r7 = super.dispatchGenericMotionEvent(r7)
            return r7
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(android.graphics.Canvas r15, android.view.View r16, long r17) {
            r14 = this;
            r0 = r14
            r1 = r15
            r2 = r16
            int r3 = r14.getHeight()
            boolean r4 = r14.m1439g(r2)
            int r5 = r14.getWidth()
            int r6 = r15.save()
            r7 = 3
            r8 = 0
            if (r4 == 0) goto L_0x0061
            int r9 = r14.getChildCount()
            r11 = r5
            r5 = 0
            r10 = 0
        L_0x001f:
            if (r5 >= r9) goto L_0x0058
            android.view.View r12 = r14.getChildAt(r5)
            if (r12 == r2) goto L_0x0055
            int r13 = r12.getVisibility()
            if (r13 != 0) goto L_0x0055
            boolean r13 = m1431l(r12)
            if (r13 == 0) goto L_0x0055
            boolean r13 = r14.m1434i(r12)
            if (r13 == 0) goto L_0x0055
            int r13 = r12.getHeight()
            if (r13 >= r3) goto L_0x0040
            goto L_0x0055
        L_0x0040:
            boolean r13 = r14.m1468a(r12, r7)
            if (r13 == 0) goto L_0x004e
            int r12 = r12.getRight()
            if (r12 <= r10) goto L_0x0055
            r10 = r12
            goto L_0x0055
        L_0x004e:
            int r12 = r12.getLeft()
            if (r12 >= r11) goto L_0x0055
            r11 = r12
        L_0x0055:
            int r5 = r5 + 1
            goto L_0x001f
        L_0x0058:
            int r3 = r14.getHeight()
            r15.clipRect(r10, r8, r11, r3)
            r8 = r10
            goto L_0x0062
        L_0x0061:
            r11 = r5
        L_0x0062:
            boolean r9 = super.drawChild(r15, r16, r17)
            r15.restoreToCount(r6)
            float r3 = r0.f2741f
            r5 = 0
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x0099
            if (r4 == 0) goto L_0x0099
            int r2 = r0.f2740e
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r4 = r4 & r2
            int r4 = r4 >>> 24
            float r4 = (float) r4
            float r4 = r4 * r3
            int r3 = (int) r4
            int r3 = r3 << 24
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r4
            r2 = r2 | r3
            android.graphics.Paint r3 = r0.f2742g
            r3.setColor(r2)
            float r2 = (float) r8
            r3 = 0
            float r4 = (float) r11
            int r5 = r14.getHeight()
            float r5 = (float) r5
            android.graphics.Paint r6 = r0.f2742g
            r1 = r15
            r1.drawRect(r2, r3, r4, r5, r6)
            goto L_0x0123
        L_0x0099:
            android.graphics.drawable.Drawable r3 = r0.f2760y
            r4 = 1132396544(0x437f0000, float:255.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L_0x00de
            boolean r3 = r14.m1468a(r2, r7)
            if (r3 == 0) goto L_0x00de
            android.graphics.drawable.Drawable r3 = r0.f2760y
            int r3 = r3.getIntrinsicWidth()
            int r7 = r16.getRight()
            a.i.b.a r8 = r0.f2743h
            int r8 = r8.m3318c()
            float r10 = (float) r7
            float r8 = (float) r8
            float r10 = r10 / r8
            float r6 = java.lang.Math.min(r10, r6)
            float r5 = java.lang.Math.max(r5, r6)
            android.graphics.drawable.Drawable r6 = r0.f2760y
            int r8 = r16.getTop()
            int r3 = r3 + r7
            int r2 = r16.getBottom()
            r6.setBounds(r7, r8, r3, r2)
            android.graphics.drawable.Drawable r2 = r0.f2760y
            float r5 = r5 * r4
            int r3 = (int) r5
            r2.setAlpha(r3)
            android.graphics.drawable.Drawable r2 = r0.f2760y
        L_0x00da:
            r2.draw(r15)
            goto L_0x0123
        L_0x00de:
            android.graphics.drawable.Drawable r3 = r0.f2761z
            if (r3 == 0) goto L_0x0123
            r3 = 5
            boolean r3 = r14.m1468a(r2, r3)
            if (r3 == 0) goto L_0x0123
            android.graphics.drawable.Drawable r3 = r0.f2761z
            int r3 = r3.getIntrinsicWidth()
            int r7 = r16.getLeft()
            int r8 = r14.getWidth()
            int r8 = r8 - r7
            a.i.b.a r10 = r0.f2744i
            int r10 = r10.m3318c()
            float r8 = (float) r8
            float r10 = (float) r10
            float r8 = r8 / r10
            float r6 = java.lang.Math.min(r8, r6)
            float r5 = java.lang.Math.max(r5, r6)
            android.graphics.drawable.Drawable r6 = r0.f2761z
            int r3 = r7 - r3
            int r8 = r16.getTop()
            int r2 = r16.getBottom()
            r6.setBounds(r3, r8, r7, r2)
            android.graphics.drawable.Drawable r2 = r0.f2761z
            float r5 = r5 * r4
            int r3 = (int) r5
            r2.setAlpha(r3)
            android.graphics.drawable.Drawable r2 = r0.f2761z
            goto L_0x00da
        L_0x0123:
            return r9
    }

    /* renamed from: e */
    int m1445e(android.view.View r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r2 = (androidx.drawerlayout.widget.DrawerLayout.C0728e) r2
            int r2 = r2.f2764a
            int r0 = p000a.p018g.p029l.C0216r.m3411j(r1)
            int r2 = p000a.p018g.p029l.C0200c.m3490a(r2, r0)
            return r2
    }

    /* renamed from: e */
    public boolean m1446e(int r1) {
            r0 = this;
            android.view.View r1 = r0.m1462b(r1)
            if (r1 == 0) goto L_0x000b
            boolean r1 = r0.m1436h(r1)
            return r1
        L_0x000b:
            r1 = 0
            return r1
    }

    /* renamed from: f */
    float m1442f(android.view.View r1) {
            r0 = this;
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r1 = (androidx.drawerlayout.widget.DrawerLayout.C0728e) r1
            float r1 = r1.f2765b
            return r1
    }

    /* renamed from: f */
    public boolean m1443f(int r1) {
            r0 = this;
            android.view.View r1 = r0.m1462b(r1)
            if (r1 == 0) goto L_0x000b
            boolean r1 = r0.m1433j(r1)
            return r1
        L_0x000b:
            r1 = 0
            return r1
    }

    /* renamed from: g */
    public void m1440g(int r2) {
            r1 = this;
            r0 = 1
            r1.m1461b(r2, r0)
            return
    }

    /* renamed from: g */
    boolean m1439g(android.view.View r1) {
            r0 = this;
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r1 = (androidx.drawerlayout.widget.DrawerLayout.C0728e) r1
            int r1 = r1.f2764a
            if (r1 != 0) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            return r1
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            androidx.drawerlayout.widget.DrawerLayout$e r0 = new androidx.drawerlayout.widget.DrawerLayout$e
            r1 = -1
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.drawerlayout.widget.DrawerLayout$e r0 = new androidx.drawerlayout.widget.DrawerLayout$e
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.drawerlayout.widget.DrawerLayout.C0728e
            if (r0 == 0) goto L_0x000c
            androidx.drawerlayout.widget.DrawerLayout$e r0 = new androidx.drawerlayout.widget.DrawerLayout$e
            androidx.drawerlayout.widget.DrawerLayout$e r2 = (androidx.drawerlayout.widget.DrawerLayout.C0728e) r2
            r0.<init>(r2)
            goto L_0x001d
        L_0x000c:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0018
            androidx.drawerlayout.widget.DrawerLayout$e r0 = new androidx.drawerlayout.widget.DrawerLayout$e
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            goto L_0x001d
        L_0x0018:
            androidx.drawerlayout.widget.DrawerLayout$e r0 = new androidx.drawerlayout.widget.DrawerLayout$e
            r0.<init>(r2)
        L_0x001d:
            return r0
    }

    public float getDrawerElevation() {
            r1 = this;
            boolean r0 = androidx.drawerlayout.widget.DrawerLayout.f2725O
            if (r0 == 0) goto L_0x0007
            float r0 = r1.f2738c
            return r0
        L_0x0007:
            r0 = 0
            return r0
    }

    public android.graphics.drawable.Drawable getStatusBarBackgroundDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2759x
            return r0
    }

    /* renamed from: h */
    public boolean m1436h(android.view.View r4) {
            r3 = this;
            boolean r0 = r3.m1434i(r4)
            if (r0 == 0) goto L_0x0015
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r4 = (androidx.drawerlayout.widget.DrawerLayout.C0728e) r4
            int r4 = r4.f2767d
            r0 = 1
            r4 = r4 & r0
            if (r4 != r0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            return r0
        L_0x0015:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "View "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " is not a drawer"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* renamed from: i */
    boolean m1434i(android.view.View r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r0 = (androidx.drawerlayout.widget.DrawerLayout.C0728e) r0
            int r0 = r0.f2764a
            int r3 = p000a.p018g.p029l.C0216r.m3411j(r3)
            int r3 = p000a.p018g.p029l.C0200c.m3490a(r0, r3)
            r0 = r3 & 3
            r1 = 1
            if (r0 == 0) goto L_0x0016
            return r1
        L_0x0016:
            r3 = r3 & 5
            if (r3 == 0) goto L_0x001b
            return r1
        L_0x001b:
            r3 = 0
            return r3
    }

    /* renamed from: j */
    public boolean m1433j(android.view.View r4) {
            r3 = this;
            boolean r0 = r3.m1434i(r4)
            if (r0 == 0) goto L_0x0017
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r4 = (androidx.drawerlayout.widget.DrawerLayout.C0728e) r4
            float r4 = r4.f2765b
            r0 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0015
            r4 = 1
            goto L_0x0016
        L_0x0015:
            r4 = 0
        L_0x0016:
            return r4
        L_0x0017:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "View "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " is not a drawer"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* renamed from: k */
    public void m1432k(android.view.View r2) {
            r1 = this;
            r0 = 1
            r1.m1457b(r2, r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r0 = 1
            r1.f2749n = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            r0 = 1
            r1.f2749n = r0
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.f2729D
            if (r0 == 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r4.f2759x
            if (r0 == 0) goto L_0x002e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            r2 = 0
            if (r0 < r1) goto L_0x001d
            java.lang.Object r0 = r4.f2728C
            if (r0 == 0) goto L_0x001d
            android.view.WindowInsets r0 = (android.view.WindowInsets) r0
            int r0 = r0.getSystemWindowInsetTop()
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r1 = r4.f2759x
            int r3 = r4.getWidth()
            r1.setBounds(r2, r2, r3, r0)
            android.graphics.drawable.Drawable r0 = r4.f2759x
            r0.draw(r5)
        L_0x002e:
            return
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = r7.getActionMasked()
            a.i.b.a r1 = r6.f2743h
            boolean r1 = r1.m3321b(r7)
            a.i.b.a r2 = r6.f2744i
            boolean r2 = r2.m3321b(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0038
            if (r0 == r2) goto L_0x0031
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L_0x001e
            if (r0 == r4) goto L_0x0031
            goto L_0x0036
        L_0x001e:
            a.i.b.a r7 = r6.f2743h
            boolean r7 = r7.m3340a(r4)
            if (r7 == 0) goto L_0x0036
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.f2745j
            r7.m1418b()
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.f2746k
            r7.m1418b()
            goto L_0x0036
        L_0x0031:
            r6.m1464a(r2)
            r6.f2754s = r3
        L_0x0036:
            r7 = 0
            goto L_0x0060
        L_0x0038:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f2757v = r0
            r6.f2758w = r7
            float r4 = r6.f2741f
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x005d
            a.i.b.a r4 = r6.f2743h
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.m3324b(r0, r7)
            if (r7 == 0) goto L_0x005d
            boolean r7 = r6.m1439g(r7)
            if (r7 == 0) goto L_0x005d
            r7 = 1
            goto L_0x005e
        L_0x005d:
            r7 = 0
        L_0x005e:
            r6.f2754s = r3
        L_0x0060:
            if (r1 != 0) goto L_0x0070
            if (r7 != 0) goto L_0x0070
            boolean r7 = r6.m1447e()
            if (r7 != 0) goto L_0x0070
            boolean r7 = r6.f2754s
            if (r7 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = 0
        L_0x0070:
            return r2
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r2, android.view.KeyEvent r3) {
            r1 = this;
            r0 = 4
            if (r2 != r0) goto L_0x000e
            boolean r0 = r1.m1444f()
            if (r0 == 0) goto L_0x000e
            r3.startTracking()
            r2 = 1
            return r2
        L_0x000e:
            boolean r2 = super.onKeyDown(r2, r3)
            return r2
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int r2, android.view.KeyEvent r3) {
            r1 = this;
            r0 = 4
            if (r2 != r0) goto L_0x0018
            android.view.View r2 = r1.m1450d()
            if (r2 == 0) goto L_0x0012
            int r3 = r1.m1448d(r2)
            if (r3 != 0) goto L_0x0012
            r1.m1463b()
        L_0x0012:
            if (r2 == 0) goto L_0x0016
            r2 = 1
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            return r2
        L_0x0018:
            boolean r2 = super.onKeyUp(r2, r3)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
            r16 = this;
            r0 = r16
            r1 = 1
            r0.f2748m = r1
            int r2 = r20 - r18
            int r3 = r16.getChildCount()
            r5 = 0
        L_0x000c:
            if (r5 >= r3) goto L_0x00cc
            android.view.View r6 = r0.getChildAt(r5)
            int r7 = r6.getVisibility()
            r8 = 8
            if (r7 != r8) goto L_0x001c
            goto L_0x00c7
        L_0x001c:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r7 = (androidx.drawerlayout.widget.DrawerLayout.C0728e) r7
            boolean r8 = r0.m1439g(r6)
            if (r8 == 0) goto L_0x003d
            int r8 = r7.leftMargin
            int r9 = r7.topMargin
            int r10 = r6.getMeasuredWidth()
            int r10 = r10 + r8
            int r7 = r7.topMargin
            int r11 = r6.getMeasuredHeight()
            int r7 = r7 + r11
            r6.layout(r8, r9, r10, r7)
            goto L_0x00c7
        L_0x003d:
            int r8 = r6.getMeasuredWidth()
            int r9 = r6.getMeasuredHeight()
            r10 = 3
            boolean r10 = r0.m1468a(r6, r10)
            if (r10 == 0) goto L_0x0059
            int r10 = -r8
            float r11 = (float) r8
            float r12 = r7.f2765b
            float r12 = r12 * r11
            int r12 = (int) r12
            int r10 = r10 + r12
            int r12 = r8 + r10
            float r12 = (float) r12
            float r12 = r12 / r11
            goto L_0x0066
        L_0x0059:
            float r10 = (float) r8
            float r11 = r7.f2765b
            float r11 = r11 * r10
            int r11 = (int) r11
            int r11 = r2 - r11
            int r12 = r2 - r11
            float r12 = (float) r12
            float r12 = r12 / r10
            r10 = r11
        L_0x0066:
            float r11 = r7.f2765b
            int r11 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x006e
            r11 = 1
            goto L_0x006f
        L_0x006e:
            r11 = 0
        L_0x006f:
            int r13 = r7.f2764a
            r13 = r13 & 112(0x70, float:1.57E-43)
            r14 = 16
            if (r13 == r14) goto L_0x0093
            r14 = 80
            if (r13 == r14) goto L_0x0083
            int r13 = r7.topMargin
            int r8 = r8 + r10
            int r9 = r9 + r13
        L_0x007f:
            r6.layout(r10, r13, r8, r9)
            goto L_0x00af
        L_0x0083:
            int r9 = r21 - r19
            int r13 = r7.bottomMargin
            int r13 = r9 - r13
            int r14 = r6.getMeasuredHeight()
            int r13 = r13 - r14
            int r8 = r8 + r10
            int r14 = r7.bottomMargin
            int r9 = r9 - r14
            goto L_0x007f
        L_0x0093:
            int r13 = r21 - r19
            int r14 = r13 - r9
            int r14 = r14 / 2
            int r15 = r7.topMargin
            if (r14 >= r15) goto L_0x009f
            r14 = r15
            goto L_0x00aa
        L_0x009f:
            int r15 = r14 + r9
            int r1 = r7.bottomMargin
            int r4 = r13 - r1
            if (r15 <= r4) goto L_0x00aa
            int r13 = r13 - r1
            int r14 = r13 - r9
        L_0x00aa:
            int r8 = r8 + r10
            int r9 = r9 + r14
            r6.layout(r10, r14, r8, r9)
        L_0x00af:
            if (r11 == 0) goto L_0x00b4
            r0.m1452c(r6, r12)
        L_0x00b4:
            float r1 = r7.f2765b
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x00bd
            r4 = 0
            goto L_0x00be
        L_0x00bd:
            r4 = 4
        L_0x00be:
            int r1 = r6.getVisibility()
            if (r1 == r4) goto L_0x00c7
            r6.setVisibility(r4)
        L_0x00c7:
            int r5 = r5 + 1
            r1 = 1
            goto L_0x000c
        L_0x00cc:
            r1 = 0
            r0.f2748m = r1
            r0.f2749n = r1
            return
    }

    @Override // android.view.View
    @android.annotation.SuppressLint({"WrongConstant"})
    protected void onMeasure(int r18, int r19) {
            r17 = this;
            r0 = r17
            int r1 = android.view.View.MeasureSpec.getMode(r18)
            int r2 = android.view.View.MeasureSpec.getMode(r19)
            int r3 = android.view.View.MeasureSpec.getSize(r18)
            int r4 = android.view.View.MeasureSpec.getSize(r19)
            r5 = 300(0x12c, float:4.2E-43)
            r6 = 1073741824(0x40000000, float:2.0)
            if (r1 != r6) goto L_0x001a
            if (r2 == r6) goto L_0x0030
        L_0x001a:
            boolean r7 = r17.isInEditMode()
            if (r7 == 0) goto L_0x01c2
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r7) goto L_0x0025
            goto L_0x0029
        L_0x0025:
            if (r1 != 0) goto L_0x0029
            r3 = 300(0x12c, float:4.2E-43)
        L_0x0029:
            if (r2 != r7) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            if (r2 != 0) goto L_0x0030
            r4 = 300(0x12c, float:4.2E-43)
        L_0x0030:
            r0.setMeasuredDimension(r3, r4)
            java.lang.Object r1 = r0.f2728C
            r5 = 0
            if (r1 == 0) goto L_0x0040
            boolean r1 = p000a.p018g.p029l.C0216r.m3415g(r17)
            if (r1 == 0) goto L_0x0040
            r1 = 1
            goto L_0x0041
        L_0x0040:
            r1 = 0
        L_0x0041:
            int r7 = p000a.p018g.p029l.C0216r.m3411j(r17)
            int r8 = r17.getChildCount()
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x004c:
            if (r9 >= r8) goto L_0x01c1
            android.view.View r12 = r0.getChildAt(r9)
            int r13 = r12.getVisibility()
            r14 = 8
            if (r13 != r14) goto L_0x005c
            goto L_0x010b
        L_0x005c:
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r13 = (androidx.drawerlayout.widget.DrawerLayout.C0728e) r13
            r14 = 3
            if (r1 == 0) goto L_0x00ea
            int r15 = r13.f2764a
            int r15 = p000a.p018g.p029l.C0200c.m3490a(r15, r7)
            boolean r16 = p000a.p018g.p029l.C0216r.m3415g(r12)
            r6 = 21
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r16 == 0) goto L_0x00a5
            if (r2 < r6) goto L_0x00ea
            java.lang.Object r2 = r0.f2728C
            android.view.WindowInsets r2 = (android.view.WindowInsets) r2
            if (r15 != r14) goto L_0x008e
            int r6 = r2.getSystemWindowInsetLeft()
            int r15 = r2.getSystemWindowInsetTop()
            int r14 = r2.getSystemWindowInsetBottom()
            android.view.WindowInsets r2 = r2.replaceSystemWindowInsets(r6, r15, r5, r14)
            goto L_0x00a1
        L_0x008e:
            r6 = 5
            if (r15 != r6) goto L_0x00a1
            int r6 = r2.getSystemWindowInsetTop()
            int r14 = r2.getSystemWindowInsetRight()
            int r15 = r2.getSystemWindowInsetBottom()
            android.view.WindowInsets r2 = r2.replaceSystemWindowInsets(r5, r6, r14, r15)
        L_0x00a1:
            r12.dispatchApplyWindowInsets(r2)
            goto L_0x00ea
        L_0x00a5:
            if (r2 < r6) goto L_0x00ea
            java.lang.Object r2 = r0.f2728C
            android.view.WindowInsets r2 = (android.view.WindowInsets) r2
            r6 = 3
            if (r15 != r6) goto L_0x00bf
            int r6 = r2.getSystemWindowInsetLeft()
            int r14 = r2.getSystemWindowInsetTop()
            int r15 = r2.getSystemWindowInsetBottom()
            android.view.WindowInsets r2 = r2.replaceSystemWindowInsets(r6, r14, r5, r15)
            goto L_0x00d2
        L_0x00bf:
            r6 = 5
            if (r15 != r6) goto L_0x00d2
            int r6 = r2.getSystemWindowInsetTop()
            int r14 = r2.getSystemWindowInsetRight()
            int r15 = r2.getSystemWindowInsetBottom()
            android.view.WindowInsets r2 = r2.replaceSystemWindowInsets(r5, r6, r14, r15)
        L_0x00d2:
            int r6 = r2.getSystemWindowInsetLeft()
            r13.leftMargin = r6
            int r6 = r2.getSystemWindowInsetTop()
            r13.topMargin = r6
            int r6 = r2.getSystemWindowInsetRight()
            r13.rightMargin = r6
            int r2 = r2.getSystemWindowInsetBottom()
            r13.bottomMargin = r2
        L_0x00ea:
            boolean r2 = r0.m1439g(r12)
            if (r2 == 0) goto L_0x0111
            int r2 = r13.leftMargin
            int r2 = r3 - r2
            int r6 = r13.rightMargin
            int r2 = r2 - r6
            r6 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r6)
            int r14 = r13.topMargin
            int r14 = r4 - r14
            int r13 = r13.bottomMargin
            int r14 = r14 - r13
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r6)
            r12.measure(r2, r13)
        L_0x010b:
            r15 = r18
            r13 = r19
            goto L_0x0193
        L_0x0111:
            r6 = 1073741824(0x40000000, float:2.0)
            boolean r2 = r0.m1434i(r12)
            if (r2 == 0) goto L_0x0198
            boolean r2 = androidx.drawerlayout.widget.DrawerLayout.f2725O
            if (r2 == 0) goto L_0x012a
            float r2 = p000a.p018g.p029l.C0216r.m3417f(r12)
            float r14 = r0.f2738c
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 == 0) goto L_0x012a
            p000a.p018g.p029l.C0216r.m3444a(r12, r14)
        L_0x012a:
            int r2 = r0.m1445e(r12)
            r2 = r2 & 7
            r14 = 3
            if (r2 != r14) goto L_0x0135
            r14 = 1
            goto L_0x0136
        L_0x0135:
            r14 = 0
        L_0x0136:
            if (r14 == 0) goto L_0x013a
            if (r10 != 0) goto L_0x013f
        L_0x013a:
            if (r14 != 0) goto L_0x016e
            if (r11 != 0) goto L_0x013f
            goto L_0x016e
        L_0x013f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Child drawer has absolute gravity "
            r3.append(r4)
            java.lang.String r2 = m1437h(r2)
            r3.append(r2)
            java.lang.String r2 = " but this "
            r3.append(r2)
            java.lang.String r2 = "DrawerLayout"
            r3.append(r2)
            java.lang.String r2 = " already has a "
            r3.append(r2)
            java.lang.String r2 = "drawer view along that edge"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x016e:
            if (r14 == 0) goto L_0x0172
            r10 = 1
            goto L_0x0173
        L_0x0172:
            r11 = 1
        L_0x0173:
            int r2 = r0.f2739d
            int r14 = r13.leftMargin
            int r2 = r2 + r14
            int r14 = r13.rightMargin
            int r2 = r2 + r14
            int r14 = r13.width
            r15 = r18
            int r2 = android.view.ViewGroup.getChildMeasureSpec(r15, r2, r14)
            int r14 = r13.topMargin
            int r5 = r13.bottomMargin
            int r14 = r14 + r5
            int r5 = r13.height
            r13 = r19
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r13, r14, r5)
            r12.measure(r2, r5)
        L_0x0193:
            int r9 = r9 + 1
            r5 = 0
            goto L_0x004c
        L_0x0198:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Child "
            r2.append(r3)
            r2.append(r12)
            java.lang.String r3 = " at index "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = " does not have a valid layout_gravity - must be Gravity.LEFT, "
            r2.append(r3)
            java.lang.String r3 = "Gravity.RIGHT or Gravity.NO_GRAVITY"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01c1:
            return
        L_0x01c2:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "DrawerLayout must be measured with MeasureSpec.EXACTLY."
            r1.<init>(r2)
            goto L_0x01cb
        L_0x01ca:
            throw r1
        L_0x01cb:
            goto L_0x01ca
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r4) {
            r3 = this;
            boolean r0 = r4 instanceof androidx.drawerlayout.widget.DrawerLayout.C0729f
            if (r0 != 0) goto L_0x0008
            super.onRestoreInstanceState(r4)
            return
        L_0x0008:
            androidx.drawerlayout.widget.DrawerLayout$f r4 = (androidx.drawerlayout.widget.DrawerLayout.C0729f) r4
            android.os.Parcelable r0 = r4.m3347a()
            super.onRestoreInstanceState(r0)
            int r0 = r4.f2768d
            if (r0 == 0) goto L_0x001e
            android.view.View r0 = r3.m1462b(r0)
            if (r0 == 0) goto L_0x001e
            r3.m1432k(r0)
        L_0x001e:
            int r0 = r4.f2769e
            r1 = 3
            if (r0 == r1) goto L_0x0026
            r3.m1475a(r0, r1)
        L_0x0026:
            int r0 = r4.f2770f
            if (r0 == r1) goto L_0x002e
            r2 = 5
            r3.m1475a(r0, r2)
        L_0x002e:
            int r0 = r4.f2771g
            if (r0 == r1) goto L_0x0038
            r2 = 8388611(0x800003, float:1.1754948E-38)
            r3.m1475a(r0, r2)
        L_0x0038:
            int r4 = r4.f2772h
            if (r4 == r1) goto L_0x0042
            r0 = 8388613(0x800005, float:1.175495E-38)
            r3.m1475a(r4, r0)
        L_0x0042:
            return
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int r1) {
            r0 = this;
            r0.m1435i()
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r9 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.drawerlayout.widget.DrawerLayout$f r1 = new androidx.drawerlayout.widget.DrawerLayout$f
            r1.<init>(r0)
            int r0 = r9.getChildCount()
            r2 = 0
            r3 = 0
        L_0x000f:
            if (r3 >= r0) goto L_0x0036
            android.view.View r4 = r9.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r4 = (androidx.drawerlayout.widget.DrawerLayout.C0728e) r4
            int r5 = r4.f2767d
            r6 = 1
            if (r5 != r6) goto L_0x0022
            r5 = 1
            goto L_0x0023
        L_0x0022:
            r5 = 0
        L_0x0023:
            int r7 = r4.f2767d
            r8 = 2
            if (r7 != r8) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r6 = 0
        L_0x002a:
            if (r5 != 0) goto L_0x0032
            if (r6 == 0) goto L_0x002f
            goto L_0x0032
        L_0x002f:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x0032:
            int r0 = r4.f2764a
            r1.f2768d = r0
        L_0x0036:
            int r0 = r9.f2750o
            r1.f2769e = r0
            int r0 = r9.f2751p
            r1.f2770f = r0
            int r0 = r9.f2752q
            r1.f2771g = r0
            int r0 = r9.f2753r
            r1.f2772h = r0
            return r1
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r7) {
            r6 = this;
            a.i.b.a r0 = r6.f2743h
            r0.m3336a(r7)
            a.i.b.a r0 = r6.f2744i
            r0.m3336a(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0060
            if (r0 == r2) goto L_0x001e
            r7 = 3
            if (r0 == r7) goto L_0x001a
            goto L_0x006e
        L_0x001a:
            r6.m1464a(r2)
            goto L_0x006c
        L_0x001e:
            float r0 = r7.getX()
            float r7 = r7.getY()
            a.i.b.a r3 = r6.f2743h
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.m3324b(r4, r5)
            if (r3 == 0) goto L_0x005b
            boolean r3 = r6.m1439g(r3)
            if (r3 == 0) goto L_0x005b
            float r3 = r6.f2757v
            float r0 = r0 - r3
            float r3 = r6.f2758w
            float r7 = r7 - r3
            a.i.b.a r3 = r6.f2743h
            int r3 = r3.m3314d()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x005b
            android.view.View r7 = r6.m1455c()
            if (r7 == 0) goto L_0x005b
            int r7 = r6.m1448d(r7)
            r0 = 2
            if (r7 != r0) goto L_0x005c
        L_0x005b:
            r1 = 1
        L_0x005c:
            r6.m1464a(r1)
            goto L_0x006e
        L_0x0060:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f2757v = r0
            r6.f2758w = r7
        L_0x006c:
            r6.f2754s = r1
        L_0x006e:
            return r2
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean r1) {
            r0 = this;
            super.requestDisallowInterceptTouchEvent(r1)
            if (r1 == 0) goto L_0x0009
            r1 = 1
            r0.m1464a(r1)
        L_0x0009:
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
            r1 = this;
            boolean r0 = r1.f2748m
            if (r0 != 0) goto L_0x0007
            super.requestLayout()
        L_0x0007:
            return
    }

    public void setDrawerElevation(float r3) {
            r2 = this;
            r2.f2738c = r3
            r3 = 0
        L_0x0003:
            int r0 = r2.getChildCount()
            if (r3 >= r0) goto L_0x001b
            android.view.View r0 = r2.getChildAt(r3)
            boolean r1 = r2.m1434i(r0)
            if (r1 == 0) goto L_0x0018
            float r1 = r2.f2738c
            p000a.p018g.p029l.C0216r.m3444a(r0, r1)
        L_0x0018:
            int r3 = r3 + 1
            goto L_0x0003
        L_0x001b:
            return
    }

    @java.lang.Deprecated
    public void setDrawerListener(androidx.drawerlayout.widget.DrawerLayout.AbstractC0727d r2) {
            r1 = this;
            androidx.drawerlayout.widget.DrawerLayout$d r0 = r1.f2755t
            if (r0 == 0) goto L_0x0007
            r1.m1456b(r0)
        L_0x0007:
            if (r2 == 0) goto L_0x000c
            r1.m1466a(r2)
        L_0x000c:
            r1.f2755t = r2
            return
    }

    public void setDrawerLockMode(int r2) {
            r1 = this;
            r0 = 3
            r1.m1475a(r2, r0)
            r0 = 5
            r1.m1475a(r2, r0)
            return
    }

    public void setScrimColor(int r1) {
            r0 = this;
            r0.f2740e = r1
            r0.invalidate()
            return
    }

    public void setStatusBarBackground(int r2) {
            r1 = this;
            if (r2 == 0) goto L_0x000b
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p000a.p018g.p019d.C0124a.m3732b(r0, r2)
            goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            r1.f2759x = r2
            r1.invalidate()
            return
    }

    public void setStatusBarBackground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.f2759x = r1
            r0.invalidate()
            return
    }

    public void setStatusBarBackgroundColor(int r2) {
            r1 = this;
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r1.f2759x = r0
            r1.invalidate()
            return
    }
}
