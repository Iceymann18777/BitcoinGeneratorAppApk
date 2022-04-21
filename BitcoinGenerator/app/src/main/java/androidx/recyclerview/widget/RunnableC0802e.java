package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.e */
/* loaded from: classes.dex */
final class RunnableC0802e implements java.lang.Runnable {

    /* renamed from: f */
    static final java.lang.ThreadLocal<androidx.recyclerview.widget.RunnableC0802e> f3041f = null;

    /* renamed from: g */
    static java.util.Comparator<androidx.recyclerview.widget.RunnableC0802e.C0805c> f3042g;

    /* renamed from: b */
    java.util.ArrayList<androidx.recyclerview.widget.C0813j> f3043b;

    /* renamed from: c */
    long f3044c;

    /* renamed from: d */
    long f3045d;

    /* renamed from: e */
    private java.util.ArrayList<androidx.recyclerview.widget.RunnableC0802e.C0805c> f3046e;

    /* renamed from: androidx.recyclerview.widget.e$a */
    /* loaded from: classes.dex */
    static class C0803a implements java.util.Comparator<androidx.recyclerview.widget.RunnableC0802e.C0805c> {
        C0803a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public int m1062a(androidx.recyclerview.widget.RunnableC0802e.C0805c r6, androidx.recyclerview.widget.RunnableC0802e.C0805c r7) {
                r5 = this;
                androidx.recyclerview.widget.j r0 = r6.f3054d
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x0008
                r0 = 1
                goto L_0x0009
            L_0x0008:
                r0 = 0
            L_0x0009:
                androidx.recyclerview.widget.j r3 = r7.f3054d
                if (r3 != 0) goto L_0x000f
                r3 = 1
                goto L_0x0010
            L_0x000f:
                r3 = 0
            L_0x0010:
                r4 = -1
                if (r0 == r3) goto L_0x001a
                androidx.recyclerview.widget.j r6 = r6.f3054d
                if (r6 != 0) goto L_0x0018
                goto L_0x0019
            L_0x0018:
                r2 = -1
            L_0x0019:
                return r2
            L_0x001a:
                boolean r0 = r6.f3051a
                boolean r3 = r7.f3051a
                if (r0 == r3) goto L_0x0024
                if (r0 == 0) goto L_0x0023
                r2 = -1
            L_0x0023:
                return r2
            L_0x0024:
                int r0 = r7.f3052b
                int r2 = r6.f3052b
                int r0 = r0 - r2
                if (r0 == 0) goto L_0x002c
                return r0
            L_0x002c:
                int r6 = r6.f3053c
                int r7 = r7.f3053c
                int r6 = r6 - r7
                if (r6 == 0) goto L_0x0034
                return r6
            L_0x0034:
                return r1
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(androidx.recyclerview.widget.RunnableC0802e.C0805c r1, androidx.recyclerview.widget.RunnableC0802e.C0805c r2) {
                r0 = this;
                androidx.recyclerview.widget.e$c r1 = (androidx.recyclerview.widget.RunnableC0802e.C0805c) r1
                androidx.recyclerview.widget.e$c r2 = (androidx.recyclerview.widget.RunnableC0802e.C0805c) r2
                int r1 = r0.m1062a(r1, r2)
                return r1
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$b */
    /* loaded from: classes.dex */
    static class C0804b implements androidx.recyclerview.widget.C0813j.AbstractC0835o.AbstractC0838c {

        /* renamed from: a */
        int f3047a;

        /* renamed from: b */
        int f3048b;

        /* renamed from: c */
        int[] f3049c;

        /* renamed from: d */
        int f3050d;

        C0804b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        void m1061a() {
                r2 = this;
                int[] r0 = r2.f3049c
                if (r0 == 0) goto L_0x0008
                r1 = -1
                java.util.Arrays.fill(r0, r1)
            L_0x0008:
                r0 = 0
                r2.f3050d = r0
                return
        }

        @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o.AbstractC0838c
        /* renamed from: a */
        public void mo655a(int r6, int r7) {
                r5 = this;
                if (r6 < 0) goto L_0x003f
                if (r7 < 0) goto L_0x0037
                int r0 = r5.f3050d
                int r0 = r0 * 2
                int[] r1 = r5.f3049c
                if (r1 != 0) goto L_0x0018
                r1 = 4
                int[] r1 = new int[r1]
                r5.f3049c = r1
                int[] r1 = r5.f3049c
                r2 = -1
                java.util.Arrays.fill(r1, r2)
                goto L_0x0028
            L_0x0018:
                int r2 = r1.length
                if (r0 < r2) goto L_0x0028
                int r2 = r0 * 2
                int[] r2 = new int[r2]
                r5.f3049c = r2
                int[] r2 = r5.f3049c
                int r3 = r1.length
                r4 = 0
                java.lang.System.arraycopy(r1, r4, r2, r4, r3)
            L_0x0028:
                int[] r1 = r5.f3049c
                r1[r0] = r6
                int r0 = r0 + 1
                r1[r0] = r7
                int r6 = r5.f3050d
                int r6 = r6 + 1
                r5.f3050d = r6
                return
            L_0x0037:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "Pixel distance must be non-negative"
                r6.<init>(r7)
                throw r6
            L_0x003f:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "Layout positions must be non-negative"
                r6.<init>(r7)
                throw r6
        }

        /* renamed from: a */
        void m1059a(androidx.recyclerview.widget.C0813j r5, boolean r6) {
                r4 = this;
                r0 = 0
                r4.f3050d = r0
                int[] r0 = r4.f3049c
                if (r0 == 0) goto L_0x000b
                r1 = -1
                java.util.Arrays.fill(r0, r1)
            L_0x000b:
                androidx.recyclerview.widget.j$o r0 = r5.f3124m
                androidx.recyclerview.widget.j$g r1 = r5.f3122l
                if (r1 == 0) goto L_0x004b
                if (r0 == 0) goto L_0x004b
                boolean r1 = r0.m660v()
                if (r1 == 0) goto L_0x004b
                if (r6 == 0) goto L_0x002d
                androidx.recyclerview.widget.a r1 = r5.f3108e
                boolean r1 = r1.m1142c()
                if (r1 != 0) goto L_0x003c
                androidx.recyclerview.widget.j$g r1 = r5.f3122l
                int r1 = r1.mo106a()
                r0.mo780a(r1, r4)
                goto L_0x003c
            L_0x002d:
                boolean r1 = r5.m929j()
                if (r1 != 0) goto L_0x003c
                int r1 = r4.f3047a
                int r2 = r4.f3048b
                androidx.recyclerview.widget.j$a0 r3 = r5.f3115h0
                r0.mo783a(r1, r2, r3, r4)
            L_0x003c:
                int r1 = r4.f3050d
                int r2 = r0.f3222m
                if (r1 <= r2) goto L_0x004b
                r0.f3222m = r1
                r0.f3223n = r6
                androidx.recyclerview.widget.j$v r5 = r5.f3104c
                r5.m592j()
            L_0x004b:
                return
        }

        /* renamed from: a */
        boolean m1060a(int r5) {
                r4 = this;
                int[] r0 = r4.f3049c
                r1 = 0
                if (r0 == 0) goto L_0x0017
                int r0 = r4.f3050d
                int r0 = r0 * 2
                r2 = 0
            L_0x000a:
                if (r2 >= r0) goto L_0x0017
                int[] r3 = r4.f3049c
                r3 = r3[r2]
                if (r3 != r5) goto L_0x0014
                r5 = 1
                return r5
            L_0x0014:
                int r2 = r2 + 2
                goto L_0x000a
            L_0x0017:
                return r1
        }

        /* renamed from: b */
        void m1058b(int r1, int r2) {
                r0 = this;
                r0.f3047a = r1
                r0.f3048b = r2
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$c */
    /* loaded from: classes.dex */
    static class C0805c {

        /* renamed from: a */
        public boolean f3051a;

        /* renamed from: b */
        public int f3052b;

        /* renamed from: c */
        public int f3053c;

        /* renamed from: d */
        public androidx.recyclerview.widget.C0813j f3054d;

        /* renamed from: e */
        public int f3055e;

        C0805c() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public void m1057a() {
                r2 = this;
                r0 = 0
                r2.f3051a = r0
                r2.f3052b = r0
                r2.f3053c = r0
                r1 = 0
                r2.f3054d = r1
                r2.f3055e = r0
                return
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.recyclerview.widget.RunnableC0802e.f3041f = r0
            androidx.recyclerview.widget.e$a r0 = new androidx.recyclerview.widget.e$a
            r0.<init>()
            androidx.recyclerview.widget.RunnableC0802e.f3042g = r0
            return
    }

    RunnableC0802e() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3043b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3046e = r0
            return
    }

    /* renamed from: a */
    private androidx.recyclerview.widget.C0813j.AbstractC0821d0 m1066a(androidx.recyclerview.widget.C0813j r3, int r4, long r5) {
            r2 = this;
            boolean r0 = m1068a(r3, r4)
            if (r0 == 0) goto L_0x0008
            r3 = 0
            return r3
        L_0x0008:
            androidx.recyclerview.widget.j$v r0 = r3.f3104c
            r1 = 0
            r3.m917q()     // Catch: all -> 0x002d
            androidx.recyclerview.widget.j$d0 r4 = r0.m625a(r4, r1, r5)     // Catch: all -> 0x002d
            if (r4 == 0) goto L_0x0029
            boolean r5 = r4.m867m()     // Catch: all -> 0x002d
            if (r5 == 0) goto L_0x0026
            boolean r5 = r4.m866n()     // Catch: all -> 0x002d
            if (r5 != 0) goto L_0x0026
            android.view.View r5 = r4.f3179a     // Catch: all -> 0x002d
            r0.m611b(r5)     // Catch: all -> 0x002d
            goto L_0x0029
        L_0x0026:
            r0.m618a(r4, r1)     // Catch: all -> 0x002d
        L_0x0029:
            r3.m973a(r1)
            return r4
        L_0x002d:
            r4 = move-exception
            r3.m973a(r1)
            throw r4
    }

    /* renamed from: a */
    private void m1072a() {
            r11 = this;
            java.util.ArrayList<androidx.recyclerview.widget.j> r0 = r11.f3043b
            int r0 = r0.size()
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0009:
            if (r2 >= r0) goto L_0x0026
            java.util.ArrayList<androidx.recyclerview.widget.j> r4 = r11.f3043b
            java.lang.Object r4 = r4.get(r2)
            androidx.recyclerview.widget.j r4 = (androidx.recyclerview.widget.C0813j) r4
            int r5 = r4.getWindowVisibility()
            if (r5 != 0) goto L_0x0023
            androidx.recyclerview.widget.e$b r5 = r4.f3113g0
            r5.m1059a(r4, r1)
            androidx.recyclerview.widget.e$b r4 = r4.f3113g0
            int r4 = r4.f3050d
            int r3 = r3 + r4
        L_0x0023:
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0026:
            java.util.ArrayList<androidx.recyclerview.widget.e$c> r2 = r11.f3046e
            r2.ensureCapacity(r3)
            r2 = 0
            r3 = 0
        L_0x002d:
            if (r2 >= r0) goto L_0x0092
            java.util.ArrayList<androidx.recyclerview.widget.j> r4 = r11.f3043b
            java.lang.Object r4 = r4.get(r2)
            androidx.recyclerview.widget.j r4 = (androidx.recyclerview.widget.C0813j) r4
            int r5 = r4.getWindowVisibility()
            if (r5 == 0) goto L_0x003e
            goto L_0x008f
        L_0x003e:
            androidx.recyclerview.widget.e$b r5 = r4.f3113g0
            int r6 = r5.f3047a
            int r6 = java.lang.Math.abs(r6)
            int r7 = r5.f3048b
            int r7 = java.lang.Math.abs(r7)
            int r6 = r6 + r7
            r7 = r3
            r3 = 0
        L_0x004f:
            int r8 = r5.f3050d
            int r8 = r8 * 2
            if (r3 >= r8) goto L_0x008e
            java.util.ArrayList<androidx.recyclerview.widget.e$c> r8 = r11.f3046e
            int r8 = r8.size()
            if (r7 < r8) goto L_0x0068
            androidx.recyclerview.widget.e$c r8 = new androidx.recyclerview.widget.e$c
            r8.<init>()
            java.util.ArrayList<androidx.recyclerview.widget.e$c> r9 = r11.f3046e
            r9.add(r8)
            goto L_0x0070
        L_0x0068:
            java.util.ArrayList<androidx.recyclerview.widget.e$c> r8 = r11.f3046e
            java.lang.Object r8 = r8.get(r7)
            androidx.recyclerview.widget.e$c r8 = (androidx.recyclerview.widget.RunnableC0802e.C0805c) r8
        L_0x0070:
            int[] r9 = r5.f3049c
            int r10 = r3 + 1
            r9 = r9[r10]
            if (r9 > r6) goto L_0x007a
            r10 = 1
            goto L_0x007b
        L_0x007a:
            r10 = 0
        L_0x007b:
            r8.f3051a = r10
            r8.f3052b = r6
            r8.f3053c = r9
            r8.f3054d = r4
            int[] r9 = r5.f3049c
            r9 = r9[r3]
            r8.f3055e = r9
            int r7 = r7 + 1
            int r3 = r3 + 2
            goto L_0x004f
        L_0x008e:
            r3 = r7
        L_0x008f:
            int r2 = r2 + 1
            goto L_0x002d
        L_0x0092:
            java.util.ArrayList<androidx.recyclerview.widget.e$c> r0 = r11.f3046e
            java.util.Comparator<androidx.recyclerview.widget.e$c> r1 = androidx.recyclerview.widget.RunnableC0802e.f3042g
            java.util.Collections.sort(r0, r1)
            return
    }

    /* renamed from: a */
    private void m1070a(androidx.recyclerview.widget.RunnableC0802e.C0805c r4, long r5) {
            r3 = this;
            boolean r0 = r4.f3051a
            if (r0 == 0) goto L_0x000a
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x000b
        L_0x000a:
            r0 = r5
        L_0x000b:
            androidx.recyclerview.widget.j r2 = r4.f3054d
            int r4 = r4.f3055e
            androidx.recyclerview.widget.j$d0 r4 = r3.m1066a(r2, r4, r0)
            if (r4 == 0) goto L_0x0030
            java.lang.ref.WeakReference<androidx.recyclerview.widget.j> r0 = r4.f3180b
            if (r0 == 0) goto L_0x0030
            boolean r0 = r4.m867m()
            if (r0 == 0) goto L_0x0030
            boolean r0 = r4.m866n()
            if (r0 != 0) goto L_0x0030
            java.lang.ref.WeakReference<androidx.recyclerview.widget.j> r4 = r4.f3180b
            java.lang.Object r4 = r4.get()
            androidx.recyclerview.widget.j r4 = (androidx.recyclerview.widget.C0813j) r4
            r3.m1065a(r4, r5)
        L_0x0030:
            return
    }

    /* renamed from: a */
    private void m1065a(androidx.recyclerview.widget.C0813j r4, long r5) {
            r3 = this;
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            boolean r0 = r4.f3081D
            if (r0 == 0) goto L_0x0012
            androidx.recyclerview.widget.b r0 = r4.f3110f
            int r0 = r0.m1124b()
            if (r0 == 0) goto L_0x0012
            r4.m914t()
        L_0x0012:
            androidx.recyclerview.widget.e$b r0 = r4.f3113g0
            r1 = 1
            r0.m1059a(r4, r1)
            int r1 = r0.f3050d
            if (r1 == 0) goto L_0x0042
            java.lang.String r1 = "RV Nested Prefetch"
            p000a.p018g.p025h.C0159a.m3606a(r1)     // Catch: all -> 0x003d
            androidx.recyclerview.widget.j$a0 r1 = r4.f3115h0     // Catch: all -> 0x003d
            androidx.recyclerview.widget.j$g r2 = r4.f3122l     // Catch: all -> 0x003d
            r1.m905a(r2)     // Catch: all -> 0x003d
            r1 = 0
        L_0x0029:
            int r2 = r0.f3050d     // Catch: all -> 0x003d
            int r2 = r2 * 2
            if (r1 >= r2) goto L_0x0039
            int[] r2 = r0.f3049c     // Catch: all -> 0x003d
            r2 = r2[r1]     // Catch: all -> 0x003d
            r3.m1066a(r4, r2, r5)     // Catch: all -> 0x003d
            int r1 = r1 + 2
            goto L_0x0029
        L_0x0039:
            p000a.p018g.p025h.C0159a.m3607a()
            goto L_0x0042
        L_0x003d:
            r4 = move-exception
            p000a.p018g.p025h.C0159a.m3607a()
            throw r4
        L_0x0042:
            return
    }

    /* renamed from: a */
    static boolean m1068a(androidx.recyclerview.widget.C0813j r5, int r6) {
            androidx.recyclerview.widget.b r0 = r5.f3110f
            int r0 = r0.m1124b()
            r1 = 0
            r2 = 0
        L_0x0008:
            if (r2 >= r0) goto L_0x0023
            androidx.recyclerview.widget.b r3 = r5.f3110f
            android.view.View r3 = r3.m1118d(r2)
            androidx.recyclerview.widget.j$d0 r3 = androidx.recyclerview.widget.C0813j.m924k(r3)
            int r4 = r3.f3181c
            if (r4 != r6) goto L_0x0020
            boolean r3 = r3.m866n()
            if (r3 != 0) goto L_0x0020
            r5 = 1
            return r5
        L_0x0020:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x0023:
            return r1
    }

    /* renamed from: b */
    private void m1064b(long r4) {
            r3 = this;
            r0 = 0
        L_0x0001:
            java.util.ArrayList<androidx.recyclerview.widget.e$c> r1 = r3.f3046e
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x001f
            java.util.ArrayList<androidx.recyclerview.widget.e$c> r1 = r3.f3046e
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.e$c r1 = (androidx.recyclerview.widget.RunnableC0802e.C0805c) r1
            androidx.recyclerview.widget.j r2 = r1.f3054d
            if (r2 != 0) goto L_0x0016
            goto L_0x001f
        L_0x0016:
            r3.m1070a(r1, r4)
            r1.m1057a()
            int r0 = r0 + 1
            goto L_0x0001
        L_0x001f:
            return
    }

    /* renamed from: a */
    void m1071a(long r1) {
            r0 = this;
            r0.m1072a()
            r0.m1064b(r1)
            return
    }

    /* renamed from: a */
    public void m1069a(androidx.recyclerview.widget.C0813j r2) {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.j> r0 = r1.f3043b
            r0.add(r2)
            return
    }

    /* renamed from: a */
    void m1067a(androidx.recyclerview.widget.C0813j r6, int r7, int r8) {
            r5 = this;
            boolean r0 = r6.isAttachedToWindow()
            if (r0 == 0) goto L_0x0017
            long r0 = r5.f3044c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0017
            long r0 = r6.getNanoTime()
            r5.f3044c = r0
            r6.post(r5)
        L_0x0017:
            androidx.recyclerview.widget.e$b r6 = r6.f3113g0
            r6.m1058b(r7, r8)
            return
    }

    /* renamed from: b */
    public void m1063b(androidx.recyclerview.widget.C0813j r2) {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.j> r0 = r1.f3043b
            r0.remove(r2)
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r8 = this;
            r0 = 0
            java.lang.String r2 = "RV Prefetch"
            p000a.p018g.p025h.C0159a.m3606a(r2)     // Catch: all -> 0x004f
            java.util.ArrayList<androidx.recyclerview.widget.j> r2 = r8.f3043b     // Catch: all -> 0x004f
            boolean r2 = r2.isEmpty()     // Catch: all -> 0x004f
            if (r2 == 0) goto L_0x0015
        L_0x000f:
            r8.f3044c = r0
            p000a.p018g.p025h.C0159a.m3607a()
            return
        L_0x0015:
            java.util.ArrayList<androidx.recyclerview.widget.j> r2 = r8.f3043b     // Catch: all -> 0x004f
            int r2 = r2.size()     // Catch: all -> 0x004f
            r3 = 0
            r4 = r0
        L_0x001d:
            if (r3 >= r2) goto L_0x0038
            java.util.ArrayList<androidx.recyclerview.widget.j> r6 = r8.f3043b     // Catch: all -> 0x004f
            java.lang.Object r6 = r6.get(r3)     // Catch: all -> 0x004f
            androidx.recyclerview.widget.j r6 = (androidx.recyclerview.widget.C0813j) r6     // Catch: all -> 0x004f
            int r7 = r6.getWindowVisibility()     // Catch: all -> 0x004f
            if (r7 != 0) goto L_0x0035
            long r6 = r6.getDrawingTime()     // Catch: all -> 0x004f
            long r4 = java.lang.Math.max(r6, r4)     // Catch: all -> 0x004f
        L_0x0035:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x0038:
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x003d
            goto L_0x000f
        L_0x003d:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: all -> 0x004f
            long r2 = r2.toNanos(r4)     // Catch: all -> 0x004f
            long r4 = r8.f3045d     // Catch: all -> 0x004f
            long r2 = r2 + r4
            r8.m1071a(r2)     // Catch: all -> 0x004f
            r8.f3044c = r0
            p000a.p018g.p025h.C0159a.m3607a()
            return
        L_0x004f:
            r2 = move-exception
            r8.f3044c = r0
            p000a.p018g.p025h.C0159a.m3607a()
            goto L_0x0057
        L_0x0056:
            throw r2
        L_0x0057:
            goto L_0x0056
    }
}
