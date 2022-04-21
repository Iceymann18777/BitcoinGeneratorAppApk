package p000a.p001a.p004l.p005a;

/* renamed from: a.a.l.a.b */
/* loaded from: classes.dex */
class C0020b extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {

    /* renamed from: b */
    private p000a.p001a.p004l.p005a.C0020b.AbstractC0023c f20b;

    /* renamed from: c */
    private android.graphics.Rect f21c;

    /* renamed from: d */
    private android.graphics.drawable.Drawable f22d;

    /* renamed from: e */
    private android.graphics.drawable.Drawable f23e;

    /* renamed from: f */
    private int f24f;

    /* renamed from: g */
    private boolean f25g;

    /* renamed from: h */
    private int f26h;

    /* renamed from: i */
    private boolean f27i;

    /* renamed from: j */
    private java.lang.Runnable f28j;

    /* renamed from: k */
    private long f29k;

    /* renamed from: l */
    private long f30l;

    /* renamed from: m */
    private p000a.p001a.p004l.p005a.C0020b.C0022b f31m;

    /* renamed from: a.a.l.a.b$a */
    /* loaded from: classes.dex */
    class RunnableC0021a implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ p000a.p001a.p004l.p005a.C0020b f32b;

        RunnableC0021a(p000a.p001a.p004l.p005a.C0020b r1) {
                r0 = this;
                r0.f32b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                a.a.l.a.b r0 = r2.f32b
                r1 = 1
                r0.m4230a(r1)
                a.a.l.a.b r0 = r2.f32b
                r0.invalidateSelf()
                return
        }
    }

    /* renamed from: a.a.l.a.b$b */
    /* loaded from: classes.dex */
    static class C0022b implements android.graphics.drawable.Drawable.Callback {

        /* renamed from: b */
        private android.graphics.drawable.Drawable.Callback f33b;

        C0022b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public p000a.p001a.p004l.p005a.C0020b.C0022b m4226a(android.graphics.drawable.Drawable.Callback r1) {
                r0 = this;
                r0.f33b = r1
                return r0
        }

        /* renamed from: a */
        public android.graphics.drawable.Drawable.Callback m4227a() {
                r2 = this;
                android.graphics.drawable.Drawable$Callback r0 = r2.f33b
                r1 = 0
                r2.f33b = r1
                return r0
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(android.graphics.drawable.Drawable r1) {
                r0 = this;
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(android.graphics.drawable.Drawable r2, java.lang.Runnable r3, long r4) {
                r1 = this;
                android.graphics.drawable.Drawable$Callback r0 = r1.f33b
                if (r0 == 0) goto L_0x0007
                r0.scheduleDrawable(r2, r3, r4)
            L_0x0007:
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(android.graphics.drawable.Drawable r2, java.lang.Runnable r3) {
                r1 = this;
                android.graphics.drawable.Drawable$Callback r0 = r1.f33b
                if (r0 == 0) goto L_0x0007
                r0.unscheduleDrawable(r2, r3)
            L_0x0007:
                return
        }
    }

    /* renamed from: a.a.l.a.b$c */
    /* loaded from: classes.dex */
    static abstract class AbstractC0023c extends android.graphics.drawable.Drawable.ConstantState {

        /* renamed from: A */
        int f34A;

        /* renamed from: B */
        int f35B;

        /* renamed from: C */
        boolean f36C;

        /* renamed from: D */
        android.graphics.ColorFilter f37D;

        /* renamed from: E */
        boolean f38E;

        /* renamed from: F */
        android.content.res.ColorStateList f39F;

        /* renamed from: G */
        android.graphics.PorterDuff.Mode f40G;

        /* renamed from: H */
        boolean f41H;

        /* renamed from: I */
        boolean f42I;

        /* renamed from: a */
        final p000a.p001a.p004l.p005a.C0020b f43a;

        /* renamed from: b */
        android.content.res.Resources f44b;

        /* renamed from: c */
        int f45c;

        /* renamed from: d */
        int f46d;

        /* renamed from: e */
        int f47e;

        /* renamed from: f */
        android.util.SparseArray<android.graphics.drawable.Drawable.ConstantState> f48f;

        /* renamed from: g */
        android.graphics.drawable.Drawable[] f49g;

        /* renamed from: h */
        int f50h;

        /* renamed from: i */
        boolean f51i;

        /* renamed from: j */
        boolean f52j;

        /* renamed from: k */
        android.graphics.Rect f53k;

        /* renamed from: l */
        boolean f54l;

        /* renamed from: m */
        boolean f55m;

        /* renamed from: n */
        int f56n;

        /* renamed from: o */
        int f57o;

        /* renamed from: p */
        int f58p;

        /* renamed from: q */
        int f59q;

        /* renamed from: r */
        boolean f60r;

        /* renamed from: s */
        int f61s;

        /* renamed from: t */
        boolean f62t;

        /* renamed from: u */
        boolean f63u;

        /* renamed from: v */
        boolean f64v;

        /* renamed from: w */
        boolean f65w;

        /* renamed from: x */
        boolean f66x;

        /* renamed from: y */
        boolean f67y;

        /* renamed from: z */
        int f68z;

        AbstractC0023c(p000a.p001a.p004l.p005a.C0020b.AbstractC0023c r3, p000a.p001a.p004l.p005a.C0020b r4, android.content.res.Resources r5) {
                r2 = this;
                r2.<init>()
                r0 = 160(0xa0, float:2.24E-43)
                r2.f45c = r0
                r0 = 0
                r2.f51i = r0
                r2.f54l = r0
                r1 = 1
                r2.f66x = r1
                r2.f34A = r0
                r2.f35B = r0
                r2.f43a = r4
                if (r5 == 0) goto L_0x0019
                r4 = r5
                goto L_0x001f
            L_0x0019:
                if (r3 == 0) goto L_0x001e
                android.content.res.Resources r4 = r3.f44b
                goto L_0x001f
            L_0x001e:
                r4 = 0
            L_0x001f:
                r2.f44b = r4
                if (r3 == 0) goto L_0x0026
                int r4 = r3.f45c
                goto L_0x0027
            L_0x0026:
                r4 = 0
            L_0x0027:
                int r4 = p000a.p001a.p004l.p005a.C0020b.m4232a(r5, r4)
                r2.f45c = r4
                if (r3 == 0) goto L_0x00ee
                int r4 = r3.f46d
                r2.f46d = r4
                int r4 = r3.f47e
                r2.f47e = r4
                r2.f64v = r1
                r2.f65w = r1
                boolean r4 = r3.f51i
                r2.f51i = r4
                boolean r4 = r3.f54l
                r2.f54l = r4
                boolean r4 = r3.f66x
                r2.f66x = r4
                boolean r4 = r3.f67y
                r2.f67y = r4
                int r4 = r3.f68z
                r2.f68z = r4
                int r4 = r3.f34A
                r2.f34A = r4
                int r4 = r3.f35B
                r2.f35B = r4
                boolean r4 = r3.f36C
                r2.f36C = r4
                android.graphics.ColorFilter r4 = r3.f37D
                r2.f37D = r4
                boolean r4 = r3.f38E
                r2.f38E = r4
                android.content.res.ColorStateList r4 = r3.f39F
                r2.f39F = r4
                android.graphics.PorterDuff$Mode r4 = r3.f40G
                r2.f40G = r4
                boolean r4 = r3.f41H
                r2.f41H = r4
                boolean r4 = r3.f42I
                r2.f42I = r4
                int r4 = r3.f45c
                int r5 = r2.f45c
                if (r4 != r5) goto L_0x009e
                boolean r4 = r3.f52j
                if (r4 == 0) goto L_0x0088
                android.graphics.Rect r4 = new android.graphics.Rect
                android.graphics.Rect r5 = r3.f53k
                r4.<init>(r5)
                r2.f53k = r4
                r2.f52j = r1
            L_0x0088:
                boolean r4 = r3.f55m
                if (r4 == 0) goto L_0x009e
                int r4 = r3.f56n
                r2.f56n = r4
                int r4 = r3.f57o
                r2.f57o = r4
                int r4 = r3.f58p
                r2.f58p = r4
                int r4 = r3.f59q
                r2.f59q = r4
                r2.f55m = r1
            L_0x009e:
                boolean r4 = r3.f60r
                if (r4 == 0) goto L_0x00a8
                int r4 = r3.f61s
                r2.f61s = r4
                r2.f60r = r1
            L_0x00a8:
                boolean r4 = r3.f62t
                if (r4 == 0) goto L_0x00b2
                boolean r4 = r3.f63u
                r2.f63u = r4
                r2.f62t = r1
            L_0x00b2:
                android.graphics.drawable.Drawable[] r4 = r3.f49g
                int r5 = r4.length
                android.graphics.drawable.Drawable[] r5 = new android.graphics.drawable.Drawable[r5]
                r2.f49g = r5
                int r5 = r3.f50h
                r2.f50h = r5
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r3 = r3.f48f
                if (r3 == 0) goto L_0x00c6
                android.util.SparseArray r3 = r3.clone()
                goto L_0x00cd
            L_0x00c6:
                android.util.SparseArray r3 = new android.util.SparseArray
                int r5 = r2.f50h
                r3.<init>(r5)
            L_0x00cd:
                r2.f48f = r3
                int r3 = r2.f50h
            L_0x00d1:
                if (r0 >= r3) goto L_0x00f6
                r5 = r4[r0]
                if (r5 == 0) goto L_0x00eb
                r5 = r4[r0]
                android.graphics.drawable.Drawable$ConstantState r5 = r5.getConstantState()
                if (r5 == 0) goto L_0x00e5
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r1 = r2.f48f
                r1.put(r0, r5)
                goto L_0x00eb
            L_0x00e5:
                android.graphics.drawable.Drawable[] r5 = r2.f49g
                r1 = r4[r0]
                r5[r0] = r1
            L_0x00eb:
                int r0 = r0 + 1
                goto L_0x00d1
            L_0x00ee:
                r3 = 10
                android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[r3]
                r2.f49g = r3
                r2.f50h = r0
            L_0x00f6:
                return
        }

        /* renamed from: b */
        private android.graphics.drawable.Drawable m4216b(android.graphics.drawable.Drawable r3) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 23
                if (r0 < r1) goto L_0x000b
                int r0 = r2.f68z
                r3.setLayoutDirection(r0)
            L_0x000b:
                android.graphics.drawable.Drawable r3 = r3.mutate()
                a.a.l.a.b r0 = r2.f43a
                r3.setCallback(r0)
                return r3
        }

        /* renamed from: n */
        private void m4203n() {
                r6 = this;
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r0 = r6.f48f
                if (r0 == 0) goto L_0x002d
                int r0 = r0.size()
                r1 = 0
            L_0x0009:
                if (r1 >= r0) goto L_0x002a
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r2 = r6.f48f
                int r2 = r2.keyAt(r1)
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r3 = r6.f48f
                java.lang.Object r3 = r3.valueAt(r1)
                android.graphics.drawable.Drawable$ConstantState r3 = (android.graphics.drawable.Drawable.ConstantState) r3
                android.graphics.drawable.Drawable[] r4 = r6.f49g
                android.content.res.Resources r5 = r6.f44b
                android.graphics.drawable.Drawable r3 = r3.newDrawable(r5)
                android.graphics.drawable.Drawable r3 = r6.m4216b(r3)
                r4[r2] = r3
                int r1 = r1 + 1
                goto L_0x0009
            L_0x002a:
                r0 = 0
                r6.f48f = r0
            L_0x002d:
                return
        }

        /* renamed from: a */
        public final int m4221a(android.graphics.drawable.Drawable r5) {
                r4 = this;
                int r0 = r4.f50h
                android.graphics.drawable.Drawable[] r1 = r4.f49g
                int r1 = r1.length
                if (r0 < r1) goto L_0x000c
                int r1 = r0 + 10
                r4.mo4190a(r0, r1)
            L_0x000c:
                r5.mutate()
                r1 = 1
                r2 = 0
                r5.setVisible(r2, r1)
                a.a.l.a.b r3 = r4.f43a
                r5.setCallback(r3)
                android.graphics.drawable.Drawable[] r3 = r4.f49g
                r3[r0] = r5
                int r3 = r4.f50h
                int r3 = r3 + r1
                r4.f50h = r3
                int r1 = r4.f47e
                int r5 = r5.getChangingConfigurations()
                r5 = r5 | r1
                r4.f47e = r5
                r4.m4205k()
                r5 = 0
                r4.f53k = r5
                r4.f52j = r2
                r4.f55m = r2
                r4.f64v = r2
                return r0
        }

        /* renamed from: a */
        public final android.graphics.drawable.Drawable m4224a(int r5) {
                r4 = this;
                android.graphics.drawable.Drawable[] r0 = r4.f49g
                r0 = r0[r5]
                if (r0 == 0) goto L_0x0007
                return r0
            L_0x0007:
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r0 = r4.f48f
                r1 = 0
                if (r0 == 0) goto L_0x0038
                int r0 = r0.indexOfKey(r5)
                if (r0 < 0) goto L_0x0038
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r2 = r4.f48f
                java.lang.Object r2 = r2.valueAt(r0)
                android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
                android.content.res.Resources r3 = r4.f44b
                android.graphics.drawable.Drawable r2 = r2.newDrawable(r3)
                android.graphics.drawable.Drawable r2 = r4.m4216b(r2)
                android.graphics.drawable.Drawable[] r3 = r4.f49g
                r3[r5] = r2
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r5 = r4.f48f
                r5.removeAt(r0)
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r5 = r4.f48f
                int r5 = r5.size()
                if (r5 != 0) goto L_0x0037
                r4.f48f = r1
            L_0x0037:
                return r2
            L_0x0038:
                return r1
        }

        /* renamed from: a */
        public void mo4190a(int r3, int r4) {
                r2 = this;
                android.graphics.drawable.Drawable[] r4 = new android.graphics.drawable.Drawable[r4]
                android.graphics.drawable.Drawable[] r0 = r2.f49g
                r1 = 0
                java.lang.System.arraycopy(r0, r1, r4, r1, r3)
                r2.f49g = r4
                return
        }

        /* renamed from: a */
        final void m4223a(android.content.res.Resources.Theme r6) {
                r5 = this;
                if (r6 == 0) goto L_0x0032
                r5.m4203n()
                int r0 = r5.f50h
                android.graphics.drawable.Drawable[] r1 = r5.f49g
                r2 = 0
            L_0x000a:
                if (r2 >= r0) goto L_0x002b
                r3 = r1[r2]
                if (r3 == 0) goto L_0x0028
                r3 = r1[r2]
                boolean r3 = r3.canApplyTheme()
                if (r3 == 0) goto L_0x0028
                r3 = r1[r2]
                r3.applyTheme(r6)
                int r3 = r5.f47e
                r4 = r1[r2]
                int r4 = r4.getChangingConfigurations()
                r3 = r3 | r4
                r5.f47e = r3
            L_0x0028:
                int r2 = r2 + 1
                goto L_0x000a
            L_0x002b:
                android.content.res.Resources r6 = r6.getResources()
                r5.m4222a(r6)
            L_0x0032:
                return
        }

        /* renamed from: a */
        final void m4222a(android.content.res.Resources r2) {
                r1 = this;
                if (r2 == 0) goto L_0x0015
                r1.f44b = r2
                int r0 = r1.f45c
                int r2 = p000a.p001a.p004l.p005a.C0020b.m4232a(r2, r0)
                int r0 = r1.f45c
                r1.f45c = r2
                if (r0 == r2) goto L_0x0015
                r2 = 0
                r1.f55m = r2
                r1.f52j = r2
            L_0x0015:
                return
        }

        /* renamed from: a */
        public final void m4220a(boolean r1) {
                r0 = this;
                r0.f54l = r1
                return
        }

        /* renamed from: a */
        public synchronized boolean m4225a() {
                r6 = this;
                monitor-enter(r6)
                boolean r0 = r6.f64v     // Catch: all -> 0x002a
                if (r0 == 0) goto L_0x0009
                boolean r0 = r6.f65w     // Catch: all -> 0x002a
                monitor-exit(r6)
                return r0
            L_0x0009:
                r6.m4203n()     // Catch: all -> 0x002a
                r0 = 1
                r6.f64v = r0     // Catch: all -> 0x002a
                int r1 = r6.f50h     // Catch: all -> 0x002a
                android.graphics.drawable.Drawable[] r2 = r6.f49g     // Catch: all -> 0x002a
                r3 = 0
                r4 = 0
            L_0x0015:
                if (r4 >= r1) goto L_0x0026
                r5 = r2[r4]     // Catch: all -> 0x002a
                android.graphics.drawable.Drawable$ConstantState r5 = r5.getConstantState()     // Catch: all -> 0x002a
                if (r5 != 0) goto L_0x0023
                r6.f65w = r3     // Catch: all -> 0x002a
                monitor-exit(r6)
                return r3
            L_0x0023:
                int r4 = r4 + 1
                goto L_0x0015
            L_0x0026:
                r6.f65w = r0     // Catch: all -> 0x002a
                monitor-exit(r6)
                return r0
            L_0x002a:
                r0 = move-exception
                monitor-exit(r6)
                goto L_0x002e
            L_0x002d:
                throw r0
            L_0x002e:
                goto L_0x002d
        }

        /* renamed from: b */
        protected void m4219b() {
                r6 = this;
                r0 = 1
                r6.f55m = r0
                r6.m4203n()
                int r0 = r6.f50h
                android.graphics.drawable.Drawable[] r1 = r6.f49g
                r2 = -1
                r6.f57o = r2
                r6.f56n = r2
                r2 = 0
                r6.f59q = r2
                r6.f58p = r2
            L_0x0014:
                if (r2 >= r0) goto L_0x0043
                r3 = r1[r2]
                int r4 = r3.getIntrinsicWidth()
                int r5 = r6.f56n
                if (r4 <= r5) goto L_0x0022
                r6.f56n = r4
            L_0x0022:
                int r4 = r3.getIntrinsicHeight()
                int r5 = r6.f57o
                if (r4 <= r5) goto L_0x002c
                r6.f57o = r4
            L_0x002c:
                int r4 = r3.getMinimumWidth()
                int r5 = r6.f58p
                if (r4 <= r5) goto L_0x0036
                r6.f58p = r4
            L_0x0036:
                int r3 = r3.getMinimumHeight()
                int r4 = r6.f59q
                if (r3 <= r4) goto L_0x0040
                r6.f59q = r3
            L_0x0040:
                int r2 = r2 + 1
                goto L_0x0014
            L_0x0043:
                return
        }

        /* renamed from: b */
        public final void m4218b(int r1) {
                r0 = this;
                r0.f34A = r1
                return
        }

        /* renamed from: b */
        public final void m4215b(boolean r1) {
                r0 = this;
                r0.f51i = r1
                return
        }

        /* renamed from: b */
        final boolean m4217b(int r8, int r9) {
                r7 = this;
                int r0 = r7.f50h
                android.graphics.drawable.Drawable[] r1 = r7.f49g
                r2 = 0
                r3 = 0
                r4 = 0
            L_0x0007:
                if (r3 >= r0) goto L_0x0021
                r5 = r1[r3]
                if (r5 == 0) goto L_0x001e
                int r5 = android.os.Build.VERSION.SDK_INT
                r6 = 23
                if (r5 < r6) goto L_0x001a
                r5 = r1[r3]
                boolean r5 = r5.setLayoutDirection(r8)
                goto L_0x001b
            L_0x001a:
                r5 = 0
            L_0x001b:
                if (r3 != r9) goto L_0x001e
                r4 = r5
            L_0x001e:
                int r3 = r3 + 1
                goto L_0x0007
            L_0x0021:
                r7.f68z = r8
                return r4
        }

        /* renamed from: c */
        final int m4214c() {
                r1 = this;
                android.graphics.drawable.Drawable[] r0 = r1.f49g
                int r0 = r0.length
                return r0
        }

        /* renamed from: c */
        public final void m4213c(int r1) {
                r0 = this;
                r0.f35B = r1
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
                r6 = this;
                int r0 = r6.f50h
                android.graphics.drawable.Drawable[] r1 = r6.f49g
                r2 = 0
                r3 = 0
            L_0x0006:
                if (r3 >= r0) goto L_0x0028
                r4 = r1[r3]
                r5 = 1
                if (r4 == 0) goto L_0x0014
                boolean r4 = r4.canApplyTheme()
                if (r4 == 0) goto L_0x0025
                return r5
            L_0x0014:
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r4 = r6.f48f
                java.lang.Object r4 = r4.get(r3)
                android.graphics.drawable.Drawable$ConstantState r4 = (android.graphics.drawable.Drawable.ConstantState) r4
                if (r4 == 0) goto L_0x0025
                boolean r4 = r4.canApplyTheme()
                if (r4 == 0) goto L_0x0025
                return r5
            L_0x0025:
                int r3 = r3 + 1
                goto L_0x0006
            L_0x0028:
                return r2
        }

        /* renamed from: d */
        public final int m4212d() {
                r1 = this;
                int r0 = r1.f50h
                return r0
        }

        /* renamed from: e */
        public final int m4211e() {
                r1 = this;
                boolean r0 = r1.f55m
                if (r0 != 0) goto L_0x0007
                r1.m4219b()
            L_0x0007:
                int r0 = r1.f57o
                return r0
        }

        /* renamed from: f */
        public final int m4210f() {
                r1 = this;
                boolean r0 = r1.f55m
                if (r0 != 0) goto L_0x0007
                r1.m4219b()
            L_0x0007:
                int r0 = r1.f59q
                return r0
        }

        /* renamed from: g */
        public final int m4209g() {
                r1 = this;
                boolean r0 = r1.f55m
                if (r0 != 0) goto L_0x0007
                r1.m4219b()
            L_0x0007:
                int r0 = r1.f58p
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r2 = this;
                int r0 = r2.f46d
                int r1 = r2.f47e
                r0 = r0 | r1
                return r0
        }

        /* renamed from: h */
        public final android.graphics.Rect m4208h() {
                r8 = this;
                boolean r0 = r8.f51i
                r1 = 0
                if (r0 == 0) goto L_0x0006
                return r1
            L_0x0006:
                android.graphics.Rect r0 = r8.f53k
                if (r0 != 0) goto L_0x0058
                boolean r0 = r8.f52j
                if (r0 == 0) goto L_0x000f
                goto L_0x0058
            L_0x000f:
                r8.m4203n()
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                int r2 = r8.f50h
                android.graphics.drawable.Drawable[] r3 = r8.f49g
                r4 = 0
                r5 = r1
                r1 = 0
            L_0x001e:
                if (r1 >= r2) goto L_0x0052
                r6 = r3[r1]
                boolean r6 = r6.getPadding(r0)
                if (r6 == 0) goto L_0x004f
                if (r5 != 0) goto L_0x002f
                android.graphics.Rect r5 = new android.graphics.Rect
                r5.<init>(r4, r4, r4, r4)
            L_0x002f:
                int r6 = r0.left
                int r7 = r5.left
                if (r6 <= r7) goto L_0x0037
                r5.left = r6
            L_0x0037:
                int r6 = r0.top
                int r7 = r5.top
                if (r6 <= r7) goto L_0x003f
                r5.top = r6
            L_0x003f:
                int r6 = r0.right
                int r7 = r5.right
                if (r6 <= r7) goto L_0x0047
                r5.right = r6
            L_0x0047:
                int r6 = r0.bottom
                int r7 = r5.bottom
                if (r6 <= r7) goto L_0x004f
                r5.bottom = r6
            L_0x004f:
                int r1 = r1 + 1
                goto L_0x001e
            L_0x0052:
                r0 = 1
                r8.f52j = r0
                r8.f53k = r5
                return r5
            L_0x0058:
                android.graphics.Rect r0 = r8.f53k
                return r0
        }

        /* renamed from: i */
        public final int m4207i() {
                r1 = this;
                boolean r0 = r1.f55m
                if (r0 != 0) goto L_0x0007
                r1.m4219b()
            L_0x0007:
                int r0 = r1.f56n
                return r0
        }

        /* renamed from: j */
        public final int m4206j() {
                r6 = this;
                boolean r0 = r6.f60r
                if (r0 == 0) goto L_0x0007
                int r0 = r6.f61s
                return r0
            L_0x0007:
                r6.m4203n()
                int r0 = r6.f50h
                android.graphics.drawable.Drawable[] r1 = r6.f49g
                if (r0 <= 0) goto L_0x0018
                r2 = 0
                r2 = r1[r2]
                int r2 = r2.getOpacity()
                goto L_0x0019
            L_0x0018:
                r2 = -2
            L_0x0019:
                r3 = 1
                r4 = r2
                r2 = 1
            L_0x001c:
                if (r2 >= r0) goto L_0x002b
                r5 = r1[r2]
                int r5 = r5.getOpacity()
                int r4 = android.graphics.drawable.Drawable.resolveOpacity(r4, r5)
                int r2 = r2 + 1
                goto L_0x001c
            L_0x002b:
                r6.f61s = r4
                r6.f60r = r3
                return r4
        }

        /* renamed from: k */
        void m4205k() {
                r1 = this;
                r0 = 0
                r1.f60r = r0
                r1.f62t = r0
                return
        }

        /* renamed from: l */
        public final boolean m4204l() {
                r1 = this;
                boolean r0 = r1.f54l
                return r0
        }

        /* renamed from: m */
        abstract void mo4187m();
    }

    C0020b() {
            r1 = this;
            r1.<init>()
            r0 = 255(0xff, float:3.57E-43)
            r1.f24f = r0
            r0 = -1
            r1.f26h = r0
            return
    }

    /* renamed from: a */
    static int m4232a(android.content.res.Resources r0, int r1) {
            if (r0 != 0) goto L_0x0003
            goto L_0x0009
        L_0x0003:
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.densityDpi
        L_0x0009:
            if (r1 != 0) goto L_0x000d
            r1 = 160(0xa0, float:2.24E-43)
        L_0x000d:
            return r1
    }

    /* renamed from: a */
    private void m4231a(android.graphics.drawable.Drawable r5) {
            r4 = this;
            a.a.l.a.b$b r0 = r4.f31m
            if (r0 != 0) goto L_0x000b
            a.a.l.a.b$b r0 = new a.a.l.a.b$b
            r0.<init>()
            r4.f31m = r0
        L_0x000b:
            a.a.l.a.b$b r0 = r4.f31m
            android.graphics.drawable.Drawable$Callback r1 = r5.getCallback()
            r0.m4226a(r1)
            r5.setCallback(r0)
            a.a.l.a.b$c r0 = r4.f20b     // Catch: all -> 0x00ab
            int r0 = r0.f34A     // Catch: all -> 0x00ab
            if (r0 > 0) goto L_0x0026
            boolean r0 = r4.f25g     // Catch: all -> 0x00ab
            if (r0 == 0) goto L_0x0026
            int r0 = r4.f24f     // Catch: all -> 0x00ab
            r5.setAlpha(r0)     // Catch: all -> 0x00ab
        L_0x0026:
            a.a.l.a.b$c r0 = r4.f20b     // Catch: all -> 0x00ab
            boolean r0 = r0.f38E     // Catch: all -> 0x00ab
            if (r0 == 0) goto L_0x0034
            a.a.l.a.b$c r0 = r4.f20b     // Catch: all -> 0x00ab
            android.graphics.ColorFilter r0 = r0.f37D     // Catch: all -> 0x00ab
            r5.setColorFilter(r0)     // Catch: all -> 0x00ab
            goto L_0x004e
        L_0x0034:
            a.a.l.a.b$c r0 = r4.f20b     // Catch: all -> 0x00ab
            boolean r0 = r0.f41H     // Catch: all -> 0x00ab
            if (r0 == 0) goto L_0x0041
            a.a.l.a.b$c r0 = r4.f20b     // Catch: all -> 0x00ab
            android.content.res.ColorStateList r0 = r0.f39F     // Catch: all -> 0x00ab
            androidx.core.graphics.drawable.C0698a.m1603a(r5, r0)     // Catch: all -> 0x00ab
        L_0x0041:
            a.a.l.a.b$c r0 = r4.f20b     // Catch: all -> 0x00ab
            boolean r0 = r0.f42I     // Catch: all -> 0x00ab
            if (r0 == 0) goto L_0x004e
            a.a.l.a.b$c r0 = r4.f20b     // Catch: all -> 0x00ab
            android.graphics.PorterDuff$Mode r0 = r0.f40G     // Catch: all -> 0x00ab
            androidx.core.graphics.drawable.C0698a.m1600a(r5, r0)     // Catch: all -> 0x00ab
        L_0x004e:
            boolean r0 = r4.isVisible()     // Catch: all -> 0x00ab
            r1 = 1
            r5.setVisible(r0, r1)     // Catch: all -> 0x00ab
            a.a.l.a.b$c r0 = r4.f20b     // Catch: all -> 0x00ab
            boolean r0 = r0.f66x     // Catch: all -> 0x00ab
            r5.setDither(r0)     // Catch: all -> 0x00ab
            int[] r0 = r4.getState()     // Catch: all -> 0x00ab
            r5.setState(r0)     // Catch: all -> 0x00ab
            int r0 = r4.getLevel()     // Catch: all -> 0x00ab
            r5.setLevel(r0)     // Catch: all -> 0x00ab
            android.graphics.Rect r0 = r4.getBounds()     // Catch: all -> 0x00ab
            r5.setBounds(r0)     // Catch: all -> 0x00ab
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: all -> 0x00ab
            r1 = 23
            if (r0 < r1) goto L_0x007f
            int r0 = r4.getLayoutDirection()     // Catch: all -> 0x00ab
            r5.setLayoutDirection(r0)     // Catch: all -> 0x00ab
        L_0x007f:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: all -> 0x00ab
            r1 = 19
            if (r0 < r1) goto L_0x008c
            a.a.l.a.b$c r0 = r4.f20b     // Catch: all -> 0x00ab
            boolean r0 = r0.f36C     // Catch: all -> 0x00ab
            r5.setAutoMirrored(r0)     // Catch: all -> 0x00ab
        L_0x008c:
            android.graphics.Rect r0 = r4.f21c     // Catch: all -> 0x00ab
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: all -> 0x00ab
            r2 = 21
            if (r1 < r2) goto L_0x00a1
            if (r0 == 0) goto L_0x00a1
            int r1 = r0.left     // Catch: all -> 0x00ab
            int r2 = r0.top     // Catch: all -> 0x00ab
            int r3 = r0.right     // Catch: all -> 0x00ab
            int r0 = r0.bottom     // Catch: all -> 0x00ab
            r5.setHotspotBounds(r1, r2, r3, r0)     // Catch: all -> 0x00ab
        L_0x00a1:
            a.a.l.a.b$b r0 = r4.f31m
            android.graphics.drawable.Drawable$Callback r0 = r0.m4227a()
            r5.setCallback(r0)
            return
        L_0x00ab:
            r0 = move-exception
            a.a.l.a.b$b r1 = r4.f31m
            android.graphics.drawable.Drawable$Callback r1 = r1.m4227a()
            r5.setCallback(r1)
            throw r0
    }

    @android.annotation.SuppressLint({"WrongConstant"})
    @android.annotation.TargetApi(23)
    /* renamed from: c */
    private boolean m4228c() {
            r2 = this;
            boolean r0 = r2.isAutoMirrored()
            r1 = 1
            if (r0 == 0) goto L_0x000e
            int r0 = r2.getLayoutDirection()
            if (r0 != r1) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            return r1
    }

    /* renamed from: a */
    p000a.p001a.p004l.p005a.C0020b.AbstractC0023c mo4193a() {
            r0 = this;
            r0 = 0
            throw r0
    }

    /* renamed from: a */
    protected void mo4192a(p000a.p001a.p004l.p005a.C0020b.AbstractC0023c r2) {
            r1 = this;
            r1.f20b = r2
            int r0 = r1.f26h
            if (r0 < 0) goto L_0x0013
            android.graphics.drawable.Drawable r2 = r2.m4224a(r0)
            r1.f22d = r2
            android.graphics.drawable.Drawable r2 = r1.f22d
            if (r2 == 0) goto L_0x0013
            r1.m4231a(r2)
        L_0x0013:
            r2 = 0
            r1.f23e = r2
            return
    }

    /* renamed from: a */
    final void m4233a(android.content.res.Resources r2) {
            r1 = this;
            a.a.l.a.b$c r0 = r1.f20b
            r0.m4222a(r2)
            return
    }

    /* renamed from: a */
    void m4230a(boolean r14) {
            r13 = this;
            r0 = 1
            r13.f25g = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f22d
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0036
            long r9 = r13.f29k
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0038
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0020
            int r9 = r13.f24f
            r3.setAlpha(r9)
            goto L_0x0036
        L_0x0020:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            a.a.l.a.b$c r9 = r13.f20b
            int r9 = r9.f34A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f24f
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x0039
        L_0x0036:
            r13.f29k = r7
        L_0x0038:
            r3 = 0
        L_0x0039:
            android.graphics.drawable.Drawable r9 = r13.f23e
            if (r9 == 0) goto L_0x0061
            long r10 = r13.f30l
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0063
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x004e
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f23e = r0
            goto L_0x0061
        L_0x004e:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            a.a.l.a.b$c r4 = r13.f20b
            int r4 = r4.f35B
            int r3 = r3 / r4
            int r4 = r13.f24f
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0064
        L_0x0061:
            r13.f30l = r7
        L_0x0063:
            r0 = r3
        L_0x0064:
            if (r14 == 0) goto L_0x0070
            if (r0 == 0) goto L_0x0070
            java.lang.Runnable r14 = r13.f28j
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0070:
            return
    }

    /* renamed from: a */
    boolean m4234a(int r10) {
            r9 = this;
            int r0 = r9.f26h
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            a.a.l.a.b$c r0 = r9.f20b
            int r0 = r0.f35B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f23e
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f22d
            if (r0 == 0) goto L_0x0029
            r9.f23e = r0
            a.a.l.a.b$c r0 = r9.f20b
            int r0 = r0.f35B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f30l = r0
            goto L_0x0035
        L_0x0029:
            r9.f23e = r4
            r9.f30l = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f22d
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            a.a.l.a.b$c r0 = r9.f20b
            int r1 = r0.f50h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.m4224a(r10)
            r9.f22d = r0
            r9.f26h = r10
            if (r0 == 0) goto L_0x005a
            a.a.l.a.b$c r10 = r9.f20b
            int r10 = r10.f34A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f29k = r2
        L_0x0051:
            r9.m4231a(r0)
            goto L_0x005a
        L_0x0055:
            r9.f22d = r4
            r10 = -1
            r9.f26h = r10
        L_0x005a:
            long r0 = r9.f29k
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f30l
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r0 = r9.f28j
            if (r0 != 0) goto L_0x0073
            a.a.l.a.b$a r0 = new a.a.l.a.b$a
            r0.<init>(r9)
            r9.f28j = r0
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r0)
        L_0x0076:
            r9.m4230a(r10)
        L_0x0079:
            r9.invalidateSelf()
            return r10
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme r2) {
            r1 = this;
            a.a.l.a.b$c r0 = r1.f20b
            r0.m4223a(r2)
            return
    }

    /* renamed from: b */
    int m4229b() {
            r1 = this;
            int r0 = r1.f26h
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
            r1 = this;
            a.a.l.a.b$c r0 = r1.f20b
            boolean r0 = r0.canApplyTheme()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f22d
            if (r0 == 0) goto L_0x0007
            r0.draw(r2)
        L_0x0007:
            android.graphics.drawable.Drawable r0 = r1.f23e
            if (r0 == 0) goto L_0x000e
            r0.draw(r2)
        L_0x000e:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            int r0 = r1.f24f
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
            r2 = this;
            int r0 = super.getChangingConfigurations()
            a.a.l.a.b$c r1 = r2.f20b
            int r1 = r1.getChangingConfigurations()
            r0 = r0 | r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r2 = this;
            a.a.l.a.b$c r0 = r2.f20b
            boolean r0 = r0.m4225a()
            if (r0 == 0) goto L_0x0013
            a.a.l.a.b$c r0 = r2.f20b
            int r1 = r2.getChangingConfigurations()
            r0.f46d = r1
            a.a.l.a.b$c r0 = r2.f20b
            return r0
        L_0x0013:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable getCurrent() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f22d
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.f21c
            if (r0 == 0) goto L_0x0008
            r2.set(r0)
            goto L_0x000b
        L_0x0008:
            super.getHotspotBounds(r2)
        L_0x000b:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            a.a.l.a.b$c r0 = r1.f20b
            boolean r0 = r0.m4204l()
            if (r0 == 0) goto L_0x000f
            a.a.l.a.b$c r0 = r1.f20b
            int r0 = r0.m4211e()
            return r0
        L_0x000f:
            android.graphics.drawable.Drawable r0 = r1.f22d
            if (r0 == 0) goto L_0x0018
            int r0 = r0.getIntrinsicHeight()
            goto L_0x0019
        L_0x0018:
            r0 = -1
        L_0x0019:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            a.a.l.a.b$c r0 = r1.f20b
            boolean r0 = r0.m4204l()
            if (r0 == 0) goto L_0x000f
            a.a.l.a.b$c r0 = r1.f20b
            int r0 = r0.m4207i()
            return r0
        L_0x000f:
            android.graphics.drawable.Drawable r0 = r1.f22d
            if (r0 == 0) goto L_0x0018
            int r0 = r0.getIntrinsicWidth()
            goto L_0x0019
        L_0x0018:
            r0 = -1
        L_0x0019:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
            r1 = this;
            a.a.l.a.b$c r0 = r1.f20b
            boolean r0 = r0.m4204l()
            if (r0 == 0) goto L_0x000f
            a.a.l.a.b$c r0 = r1.f20b
            int r0 = r0.m4210f()
            return r0
        L_0x000f:
            android.graphics.drawable.Drawable r0 = r1.f22d
            if (r0 == 0) goto L_0x0018
            int r0 = r0.getMinimumHeight()
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
            r1 = this;
            a.a.l.a.b$c r0 = r1.f20b
            boolean r0 = r0.m4204l()
            if (r0 == 0) goto L_0x000f
            a.a.l.a.b$c r0 = r1.f20b
            int r0 = r0.m4209g()
            return r0
        L_0x000f:
            android.graphics.drawable.Drawable r0 = r1.f22d
            if (r0 == 0) goto L_0x0018
            int r0 = r0.getMinimumWidth()
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f22d
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isVisible()
            if (r0 != 0) goto L_0x000b
            goto L_0x0012
        L_0x000b:
            a.a.l.a.b$c r0 = r1.f20b
            int r0 = r0.m4206j()
            goto L_0x0013
        L_0x0012:
            r0 = -2
        L_0x0013:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f22d
            if (r0 == 0) goto L_0x0007
            r0.getOutline(r2)
        L_0x0007:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect r4) {
            r3 = this;
            a.a.l.a.b$c r0 = r3.f20b
            android.graphics.Rect r0 = r0.m4208h()
            if (r0 == 0) goto L_0x001c
            r4.set(r0)
            int r1 = r0.left
            int r2 = r0.top
            r1 = r1 | r2
            int r2 = r0.bottom
            r1 = r1 | r2
            int r0 = r0.right
            r0 = r0 | r1
            if (r0 == 0) goto L_0x001a
            r0 = 1
            goto L_0x0029
        L_0x001a:
            r0 = 0
            goto L_0x0029
        L_0x001c:
            android.graphics.drawable.Drawable r0 = r3.f22d
            if (r0 == 0) goto L_0x0025
            boolean r0 = r0.getPadding(r4)
            goto L_0x0029
        L_0x0025:
            boolean r0 = super.getPadding(r4)
        L_0x0029:
            boolean r1 = r3.m4228c()
            if (r1 == 0) goto L_0x0037
            int r1 = r4.left
            int r2 = r4.right
            r4.left = r2
            r4.right = r1
        L_0x0037:
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            a.a.l.a.b$c r0 = r1.f20b
            if (r0 == 0) goto L_0x0007
            r0.m4205k()
        L_0x0007:
            android.graphics.drawable.Drawable r0 = r1.f22d
            if (r2 != r0) goto L_0x0018
            android.graphics.drawable.Drawable$Callback r2 = r1.getCallback()
            if (r2 == 0) goto L_0x0018
            android.graphics.drawable.Drawable$Callback r2 = r1.getCallback()
            r2.invalidateDrawable(r1)
        L_0x0018:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
            r1 = this;
            a.a.l.a.b$c r0 = r1.f20b
            boolean r0 = r0.f36C
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.f23e
            r1 = 1
            if (r0 == 0) goto L_0x000d
            r0.jumpToCurrentState()
            r0 = 0
            r7.f23e = r0
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            android.graphics.drawable.Drawable r2 = r7.f22d
            if (r2 == 0) goto L_0x0020
            r2.jumpToCurrentState()
            boolean r2 = r7.f25g
            if (r2 == 0) goto L_0x0020
            android.graphics.drawable.Drawable r2 = r7.f22d
            int r3 = r7.f24f
            r2.setAlpha(r3)
        L_0x0020:
            long r2 = r7.f30l
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x002b
            r7.f30l = r4
            r0 = 1
        L_0x002b:
            long r2 = r7.f29k
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0034
            r7.f29k = r4
            r0 = 1
        L_0x0034:
            if (r0 == 0) goto L_0x0039
            r7.invalidateSelf()
        L_0x0039:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r1 = this;
            boolean r0 = r1.f27i
            if (r0 != 0) goto L_0x0017
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r1) goto L_0x0017
            a.a.l.a.b$c r0 = r1.mo4193a()
            r0.mo4187m()
            r1.mo4192a(r0)
            r0 = 1
            r1.f27i = r0
        L_0x0017:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23e
            if (r0 == 0) goto L_0x0007
            r0.setBounds(r2)
        L_0x0007:
            android.graphics.drawable.Drawable r0 = r1.f22d
            if (r0 == 0) goto L_0x000e
            r0.setBounds(r2)
        L_0x000e:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int r3) {
            r2 = this;
            a.a.l.a.b$c r0 = r2.f20b
            int r1 = r2.m4229b()
            boolean r3 = r0.m4217b(r3, r1)
            return r3
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23e
            if (r0 == 0) goto L_0x0009
            boolean r2 = r0.setLevel(r2)
            return r2
        L_0x0009:
            android.graphics.drawable.Drawable r0 = r1.f22d
            if (r0 == 0) goto L_0x0012
            boolean r2 = r0.setLevel(r2)
            return r2
        L_0x0012:
            r2 = 0
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23e
            if (r0 == 0) goto L_0x0009
            boolean r2 = r0.setState(r2)
            return r2
        L_0x0009:
            android.graphics.drawable.Drawable r0 = r1.f22d
            if (r0 == 0) goto L_0x0012
            boolean r2 = r0.setState(r2)
            return r2
        L_0x0012:
            r2 = 0
            return r2
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable r2, java.lang.Runnable r3, long r4) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f22d
            if (r2 != r0) goto L_0x0011
            android.graphics.drawable.Drawable$Callback r2 = r1.getCallback()
            if (r2 == 0) goto L_0x0011
            android.graphics.drawable.Drawable$Callback r2 = r1.getCallback()
            r2.scheduleDrawable(r1, r3, r4)
        L_0x0011:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r7) {
            r6 = this;
            boolean r0 = r6.f25g
            if (r0 == 0) goto L_0x0008
            int r0 = r6.f24f
            if (r0 == r7) goto L_0x0021
        L_0x0008:
            r0 = 1
            r6.f25g = r0
            r6.f24f = r7
            android.graphics.drawable.Drawable r0 = r6.f22d
            if (r0 == 0) goto L_0x0021
            long r1 = r6.f29k
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x001d
            r0.setAlpha(r7)
            goto L_0x0021
        L_0x001d:
            r7 = 0
            r6.m4230a(r7)
        L_0x0021:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean r3) {
            r2 = this;
            a.a.l.a.b$c r0 = r2.f20b
            boolean r1 = r0.f36C
            if (r1 == r3) goto L_0x0011
            r0.f36C = r3
            android.graphics.drawable.Drawable r3 = r2.f22d
            if (r3 == 0) goto L_0x0011
            boolean r0 = r0.f36C
            androidx.core.graphics.drawable.C0698a.m1599a(r3, r0)
        L_0x0011:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r3) {
            r2 = this;
            a.a.l.a.b$c r0 = r2.f20b
            r1 = 1
            r0.f38E = r1
            android.graphics.ColorFilter r1 = r0.f37D
            if (r1 == r3) goto L_0x0012
            r0.f37D = r3
            android.graphics.drawable.Drawable r0 = r2.f22d
            if (r0 == 0) goto L_0x0012
            r0.setColorFilter(r3)
        L_0x0012:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean r3) {
            r2 = this;
            a.a.l.a.b$c r0 = r2.f20b
            boolean r1 = r0.f66x
            if (r1 == r3) goto L_0x0011
            r0.f66x = r3
            android.graphics.drawable.Drawable r3 = r2.f22d
            if (r3 == 0) goto L_0x0011
            boolean r0 = r0.f66x
            r3.setDither(r0)
        L_0x0011:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float r2, float r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f22d
            if (r0 == 0) goto L_0x0007
            androidx.core.graphics.drawable.C0698a.m1606a(r0, r2, r3)
        L_0x0007:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.graphics.Rect r0 = r1.f21c
            if (r0 != 0) goto L_0x000c
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r2, r3, r4, r5)
            r1.f21c = r0
            goto L_0x000f
        L_0x000c:
            r0.set(r2, r3, r4, r5)
        L_0x000f:
            android.graphics.drawable.Drawable r0 = r1.f22d
            if (r0 == 0) goto L_0x0016
            androidx.core.graphics.drawable.C0698a.m1604a(r0, r2, r3, r4, r5)
        L_0x0016:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            a.a.l.a.b$c r0 = r2.f20b
            r1 = 1
            r0.f41H = r1
            android.content.res.ColorStateList r1 = r0.f39F
            if (r1 == r3) goto L_0x0010
            r0.f39F = r3
            android.graphics.drawable.Drawable r0 = r2.f22d
            androidx.core.graphics.drawable.C0698a.m1603a(r0, r3)
        L_0x0010:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            a.a.l.a.b$c r0 = r2.f20b
            r1 = 1
            r0.f42I = r1
            android.graphics.PorterDuff$Mode r1 = r0.f40G
            if (r1 == r3) goto L_0x0010
            r0.f40G = r3
            android.graphics.drawable.Drawable r0 = r2.f22d
            androidx.core.graphics.drawable.C0698a.m1600a(r0, r3)
        L_0x0010:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = super.setVisible(r3, r4)
            android.graphics.drawable.Drawable r1 = r2.f23e
            if (r1 == 0) goto L_0x000b
            r1.setVisible(r3, r4)
        L_0x000b:
            android.graphics.drawable.Drawable r1 = r2.f22d
            if (r1 == 0) goto L_0x0012
            r1.setVisible(r3, r4)
        L_0x0012:
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(android.graphics.drawable.Drawable r2, java.lang.Runnable r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f22d
            if (r2 != r0) goto L_0x0011
            android.graphics.drawable.Drawable$Callback r2 = r1.getCallback()
            if (r2 == 0) goto L_0x0011
            android.graphics.drawable.Drawable$Callback r2 = r1.getCallback()
            r2.unscheduleDrawable(r1, r3)
        L_0x0011:
            return
    }
}
