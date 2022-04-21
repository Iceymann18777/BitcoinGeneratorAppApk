package p000a.p045n;

/* renamed from: a.n.d0 */
/* loaded from: classes.dex */
class C0341d0 {

    /* renamed from: a */
    private static final p000a.p045n.C0355h0 f1056a = null;

    /* renamed from: b */
    private static java.lang.reflect.Field f1057b;

    /* renamed from: c */
    private static boolean f1058c;

    /* renamed from: d */
    static final android.util.Property<android.view.View, java.lang.Float> f1059d = null;

    /* renamed from: a.n.d0$a */
    /* loaded from: classes.dex */
    static class C0342a extends android.util.Property<android.view.View, java.lang.Float> {
        C0342a(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* renamed from: a */
        public java.lang.Float m2893a(android.view.View r1) {
                r0 = this;
                float r1 = p000a.p045n.C0341d0.m2896c(r1)
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                return r1
        }

        /* renamed from: a */
        public void m2892a(android.view.View r1, java.lang.Float r2) {
                r0 = this;
                float r2 = r2.floatValue()
                p000a.p045n.C0341d0.m2902a(r1, r2)
                return
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ java.lang.Float get(android.view.View r1) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                java.lang.Float r1 = r0.m2893a(r1)
                return r1
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(android.view.View r1, java.lang.Float r2) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                java.lang.Float r2 = (java.lang.Float) r2
                r0.m2892a(r1, r2)
                return
        }
    }

    /* renamed from: a.n.d0$b */
    /* loaded from: classes.dex */
    static class C0343b extends android.util.Property<android.view.View, android.graphics.Rect> {
        C0343b(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* renamed from: a */
        public android.graphics.Rect m2891a(android.view.View r1) {
                r0 = this;
                android.graphics.Rect r1 = p000a.p018g.p029l.C0216r.m3421d(r1)
                return r1
        }

        /* renamed from: a */
        public void m2890a(android.view.View r1, android.graphics.Rect r2) {
                r0 = this;
                p000a.p018g.p029l.C0216r.m3435a(r1, r2)
                return
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ android.graphics.Rect get(android.view.View r1) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                android.graphics.Rect r1 = r0.m2891a(r1)
                return r1
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(android.view.View r1, android.graphics.Rect r2) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                android.graphics.Rect r2 = (android.graphics.Rect) r2
                r0.m2890a(r1, r2)
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 22
            if (r0 < r1) goto L_0x000e
            a.n.g0 r0 = new a.n.g0
            r0.<init>()
        L_0x000b:
            p000a.p045n.C0341d0.f1056a = r0
            goto L_0x0028
        L_0x000e:
            r1 = 21
            if (r0 < r1) goto L_0x0018
            a.n.f0 r0 = new a.n.f0
            r0.<init>()
            goto L_0x000b
        L_0x0018:
            r1 = 19
            if (r0 < r1) goto L_0x0022
            a.n.e0 r0 = new a.n.e0
            r0.<init>()
            goto L_0x000b
        L_0x0022:
            a.n.h0 r0 = new a.n.h0
            r0.<init>()
            goto L_0x000b
        L_0x0028:
            a.n.d0$a r0 = new a.n.d0$a
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r2 = "translationAlpha"
            r0.<init>(r1, r2)
            p000a.p045n.C0341d0.f1059d = r0
            a.n.d0$b r0 = new a.n.d0$b
            java.lang.Class<android.graphics.Rect> r1 = android.graphics.Rect.class
            java.lang.String r2 = "clipBounds"
            r0.<init>(r1, r2)
            return
    }

    /* renamed from: a */
    private static void m2904a() {
            boolean r0 = p000a.p045n.C0341d0.f1058c
            if (r0 != 0) goto L_0x001e
            r0 = 1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r2 = "mViewFlags"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: NoSuchFieldException -> 0x0015
            p000a.p045n.C0341d0.f1057b = r1     // Catch: NoSuchFieldException -> 0x0015
            java.lang.reflect.Field r1 = p000a.p045n.C0341d0.f1057b     // Catch: NoSuchFieldException -> 0x0015
            r1.setAccessible(r0)     // Catch: NoSuchFieldException -> 0x0015
            goto L_0x001c
        L_0x0015:
            java.lang.String r1 = "ViewUtils"
            java.lang.String r2 = "fetchViewFlagsField: "
            android.util.Log.i(r1, r2)
        L_0x001c:
            p000a.p045n.C0341d0.f1058c = r0
        L_0x001e:
            return
    }

    /* renamed from: a */
    static void m2903a(android.view.View r1) {
            a.n.h0 r0 = p000a.p045n.C0341d0.f1056a
            r0.mo2865a(r1)
            return
    }

    /* renamed from: a */
    static void m2902a(android.view.View r1, float r2) {
            a.n.h0 r0 = p000a.p045n.C0341d0.f1056a
            r0.mo2864a(r1, r2)
            return
    }

    /* renamed from: a */
    static void m2901a(android.view.View r2, int r3) {
            m2904a()
            java.lang.reflect.Field r0 = p000a.p045n.C0341d0.f1057b
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getInt(r2)     // Catch: IllegalAccessException -> 0x0013
            java.lang.reflect.Field r1 = p000a.p045n.C0341d0.f1057b     // Catch: IllegalAccessException -> 0x0013
            r0 = r0 & (-13)
            r3 = r3 | r0
            r1.setInt(r2, r3)     // Catch: IllegalAccessException -> 0x0013
        L_0x0013:
            return
    }

    /* renamed from: a */
    static void m2900a(android.view.View r6, int r7, int r8, int r9, int r10) {
            a.n.h0 r0 = p000a.p045n.C0341d0.f1056a
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.mo2863a(r1, r2, r3, r4, r5)
            return
    }

    /* renamed from: a */
    static void m2899a(android.view.View r1, android.graphics.Matrix r2) {
            a.n.h0 r0 = p000a.p045n.C0341d0.f1056a
            r0.mo2862a(r1, r2)
            return
    }

    /* renamed from: b */
    static p000a.p045n.AbstractC0337c0 m2898b(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 18
            if (r0 < r1) goto L_0x000c
            a.n.b0 r0 = new a.n.b0
            r0.<init>(r2)
            return r0
        L_0x000c:
            a.n.a0 r2 = p000a.p045n.C0321a0.m2932c(r2)
            return r2
    }

    /* renamed from: b */
    static void m2897b(android.view.View r1, android.graphics.Matrix r2) {
            a.n.h0 r0 = p000a.p045n.C0341d0.f1056a
            r0.mo2860b(r1, r2)
            return
    }

    /* renamed from: c */
    static float m2896c(android.view.View r1) {
            a.n.h0 r0 = p000a.p045n.C0341d0.f1056a
            float r1 = r0.mo2861b(r1)
            return r1
    }

    /* renamed from: d */
    static p000a.p045n.AbstractC0366l0 m2895d(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 18
            if (r0 < r1) goto L_0x000c
            a.n.k0 r0 = new a.n.k0
            r0.<init>(r2)
            return r0
        L_0x000c:
            a.n.j0 r0 = new a.n.j0
            android.os.IBinder r2 = r2.getWindowToken()
            r0.<init>(r2)
            return r0
    }

    /* renamed from: e */
    static void m2894e(android.view.View r1) {
            a.n.h0 r0 = p000a.p045n.C0341d0.f1056a
            r0.mo2859c(r1)
            return
    }
}
