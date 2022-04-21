package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.b */
/* loaded from: classes.dex */
class C0783b {

    /* renamed from: a */
    final androidx.recyclerview.widget.C0783b.AbstractC0785b f2949a;

    /* renamed from: b */
    final androidx.recyclerview.widget.C0783b.C0784a f2950b;

    /* renamed from: c */
    final java.util.List<android.view.View> f2951c;

    /* renamed from: androidx.recyclerview.widget.b$a */
    /* loaded from: classes.dex */
    static class C0784a {

        /* renamed from: a */
        long f2952a;

        /* renamed from: b */
        androidx.recyclerview.widget.C0783b.C0784a f2953b;

        C0784a() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.f2952a = r0
                return
        }

        /* renamed from: b */
        private void m1107b() {
                r1 = this;
                androidx.recyclerview.widget.b$a r0 = r1.f2953b
                if (r0 != 0) goto L_0x000b
                androidx.recyclerview.widget.b$a r0 = new androidx.recyclerview.widget.b$a
                r0.<init>()
                r1.f2953b = r0
            L_0x000b:
                return
        }

        /* renamed from: a */
        void m1110a() {
                r2 = this;
                r0 = 0
                r2.f2952a = r0
                androidx.recyclerview.widget.b$a r0 = r2.f2953b
                if (r0 == 0) goto L_0x000b
                r0.m1110a()
            L_0x000b:
                return
        }

        /* renamed from: a */
        void m1109a(int r7) {
                r6 = this;
                r0 = 64
                if (r7 < r0) goto L_0x000d
                androidx.recyclerview.widget.b$a r1 = r6.f2953b
                if (r1 == 0) goto L_0x0018
                int r7 = r7 - r0
                r1.m1109a(r7)
                goto L_0x0018
            L_0x000d:
                long r0 = r6.f2952a
                r2 = 1
                long r2 = r2 << r7
                r4 = -1
                long r2 = r2 ^ r4
                long r0 = r0 & r2
                r6.f2952a = r0
            L_0x0018:
                return
        }

        /* renamed from: a */
        void m1108a(int r13, boolean r14) {
                r12 = this;
                r0 = 64
                if (r13 < r0) goto L_0x000e
                r12.m1107b()
                androidx.recyclerview.widget.b$a r1 = r12.f2953b
                int r13 = r13 - r0
                r1.m1108a(r13, r14)
                goto L_0x0046
            L_0x000e:
                long r0 = r12.f2952a
                r2 = -9223372036854775808
                long r0 = r0 & r2
                r2 = 0
                r4 = 1
                r5 = 0
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 == 0) goto L_0x001d
                r0 = 1
                goto L_0x001e
            L_0x001d:
                r0 = 0
            L_0x001e:
                r1 = 1
                long r6 = r1 << r13
                long r6 = r6 - r1
                long r1 = r12.f2952a
                long r8 = r1 & r6
                r10 = -1
                long r6 = r6 ^ r10
                long r1 = r1 & r6
                long r1 = r1 << r4
                long r1 = r1 | r8
                r12.f2952a = r1
                if (r14 == 0) goto L_0x0035
                r12.m1103e(r13)
                goto L_0x0038
            L_0x0035:
                r12.m1109a(r13)
            L_0x0038:
                if (r0 != 0) goto L_0x003e
                androidx.recyclerview.widget.b$a r13 = r12.f2953b
                if (r13 == 0) goto L_0x0046
            L_0x003e:
                r12.m1107b()
                androidx.recyclerview.widget.b$a r13 = r12.f2953b
                r13.m1108a(r5, r0)
            L_0x0046:
                return
        }

        /* renamed from: b */
        int m1106b(int r7) {
                r6 = this;
                androidx.recyclerview.widget.b$a r0 = r6.f2953b
                r1 = 64
                r2 = 1
                if (r0 != 0) goto L_0x001c
                if (r7 < r1) goto L_0x0011
                long r0 = r6.f2952a
                int r7 = java.lang.Long.bitCount(r0)
                return r7
            L_0x0011:
                long r0 = r6.f2952a
                long r4 = r2 << r7
                long r4 = r4 - r2
                long r0 = r0 & r4
                int r7 = java.lang.Long.bitCount(r0)
                return r7
            L_0x001c:
                if (r7 >= r1) goto L_0x0029
                long r0 = r6.f2952a
                long r4 = r2 << r7
                long r4 = r4 - r2
                long r0 = r0 & r4
                int r7 = java.lang.Long.bitCount(r0)
                return r7
            L_0x0029:
                int r7 = r7 - r1
                int r7 = r0.m1106b(r7)
                long r0 = r6.f2952a
                int r0 = java.lang.Long.bitCount(r0)
                int r7 = r7 + r0
                return r7
        }

        /* renamed from: c */
        boolean m1105c(int r5) {
                r4 = this;
                r0 = 64
                if (r5 < r0) goto L_0x000f
                r4.m1107b()
                androidx.recyclerview.widget.b$a r1 = r4.f2953b
                int r5 = r5 - r0
                boolean r5 = r1.m1105c(r5)
                return r5
            L_0x000f:
                long r0 = r4.f2952a
                r2 = 1
                long r2 = r2 << r5
                long r0 = r0 & r2
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 == 0) goto L_0x001d
                r5 = 1
                goto L_0x001e
            L_0x001d:
                r5 = 0
            L_0x001e:
                return r5
        }

        /* renamed from: d */
        boolean m1104d(int r14) {
                r13 = this;
                r0 = 64
                if (r14 < r0) goto L_0x000f
                r13.m1107b()
                androidx.recyclerview.widget.b$a r1 = r13.f2953b
                int r14 = r14 - r0
                boolean r14 = r1.m1104d(r14)
                return r14
            L_0x000f:
                r0 = 1
                long r2 = r0 << r14
                long r4 = r13.f2952a
                long r4 = r4 & r2
                r6 = 0
                r14 = 1
                r8 = 0
                int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r9 == 0) goto L_0x0020
                r4 = 1
                goto L_0x0021
            L_0x0020:
                r4 = 0
            L_0x0021:
                long r5 = r13.f2952a
                r9 = -1
                long r11 = r2 ^ r9
                long r5 = r5 & r11
                r13.f2952a = r5
                long r2 = r2 - r0
                long r0 = r13.f2952a
                long r5 = r0 & r2
                long r2 = r2 ^ r9
                long r0 = r0 & r2
                long r0 = java.lang.Long.rotateRight(r0, r14)
                long r0 = r0 | r5
                r13.f2952a = r0
                androidx.recyclerview.widget.b$a r14 = r13.f2953b
                if (r14 == 0) goto L_0x004c
                boolean r14 = r14.m1105c(r8)
                if (r14 == 0) goto L_0x0047
                r14 = 63
                r13.m1103e(r14)
            L_0x0047:
                androidx.recyclerview.widget.b$a r14 = r13.f2953b
                r14.m1104d(r8)
            L_0x004c:
                return r4
        }

        /* renamed from: e */
        void m1103e(int r5) {
                r4 = this;
                r0 = 64
                if (r5 < r0) goto L_0x000e
                r4.m1107b()
                androidx.recyclerview.widget.b$a r1 = r4.f2953b
                int r5 = r5 - r0
                r1.m1103e(r5)
                goto L_0x0016
            L_0x000e:
                long r0 = r4.f2952a
                r2 = 1
                long r2 = r2 << r5
                long r0 = r0 | r2
                r4.f2952a = r0
            L_0x0016:
                return
        }

        public java.lang.String toString() {
                r3 = this;
                androidx.recyclerview.widget.b$a r0 = r3.f2953b
                if (r0 != 0) goto L_0x000b
                long r0 = r3.f2952a
                java.lang.String r0 = java.lang.Long.toBinaryString(r0)
                goto L_0x002b
            L_0x000b:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                androidx.recyclerview.widget.b$a r1 = r3.f2953b
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r1 = "xx"
                r0.append(r1)
                long r1 = r3.f2952a
                java.lang.String r1 = java.lang.Long.toBinaryString(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
            L_0x002b:
                return r0
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b */
    /* loaded from: classes.dex */
    interface AbstractC0785b {
        /* renamed from: a */
        int mo853a();

        /* renamed from: a */
        android.view.View mo852a(int r1);

        /* renamed from: a */
        void mo851a(android.view.View r1);

        /* renamed from: a */
        void mo850a(android.view.View r1, int r2);

        /* renamed from: a */
        void mo849a(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3);

        /* renamed from: b */
        void mo848b();

        /* renamed from: b */
        void mo847b(int r1);

        /* renamed from: b */
        void mo846b(android.view.View r1);

        /* renamed from: c */
        int mo844c(android.view.View r1);

        /* renamed from: c */
        void mo845c(int r1);

        /* renamed from: d */
        androidx.recyclerview.widget.C0813j.AbstractC0821d0 mo843d(android.view.View r1);
    }

    C0783b(androidx.recyclerview.widget.C0783b.AbstractC0785b r1) {
            r0 = this;
            r0.<init>()
            r0.f2949a = r1
            androidx.recyclerview.widget.b$a r1 = new androidx.recyclerview.widget.b$a
            r1.<init>()
            r0.f2950b = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f2951c = r1
            return
    }

    /* renamed from: f */
    private int m1114f(int r5) {
            r4 = this;
            r0 = -1
            if (r5 >= 0) goto L_0x0004
            return r0
        L_0x0004:
            androidx.recyclerview.widget.b$b r1 = r4.f2949a
            int r1 = r1.mo853a()
            r2 = r5
        L_0x000b:
            if (r2 >= r1) goto L_0x0027
            androidx.recyclerview.widget.b$a r3 = r4.f2950b
            int r3 = r3.m1106b(r2)
            int r3 = r2 - r3
            int r3 = r5 - r3
            if (r3 != 0) goto L_0x0025
        L_0x0019:
            androidx.recyclerview.widget.b$a r5 = r4.f2950b
            boolean r5 = r5.m1105c(r2)
            if (r5 == 0) goto L_0x0024
            int r2 = r2 + 1
            goto L_0x0019
        L_0x0024:
            return r2
        L_0x0025:
            int r2 = r2 + r3
            goto L_0x000b
        L_0x0027:
            return r0
    }

    /* renamed from: g */
    private void m1112g(android.view.View r2) {
            r1 = this;
            java.util.List<android.view.View> r0 = r1.f2951c
            r0.add(r2)
            androidx.recyclerview.widget.b$b r0 = r1.f2949a
            r0.mo846b(r2)
            return
    }

    /* renamed from: h */
    private boolean m1111h(android.view.View r2) {
            r1 = this;
            java.util.List<android.view.View> r0 = r1.f2951c
            boolean r0 = r0.remove(r2)
            if (r0 == 0) goto L_0x000f
            androidx.recyclerview.widget.b$b r0 = r1.f2949a
            r0.mo851a(r2)
            r2 = 1
            return r2
        L_0x000f:
            r2 = 0
            return r2
    }

    /* renamed from: a */
    int m1130a() {
            r2 = this;
            androidx.recyclerview.widget.b$b r0 = r2.f2949a
            int r0 = r0.mo853a()
            java.util.List<android.view.View> r1 = r2.f2951c
            int r1 = r1.size()
            int r0 = r0 - r1
            return r0
    }

    /* renamed from: a */
    void m1129a(int r2) {
            r1 = this;
            int r2 = r1.m1114f(r2)
            androidx.recyclerview.widget.b$a r0 = r1.f2950b
            r0.m1104d(r2)
            androidx.recyclerview.widget.b$b r0 = r1.f2949a
            r0.mo847b(r2)
            return
    }

    /* renamed from: a */
    void m1128a(android.view.View r4) {
            r3 = this;
            androidx.recyclerview.widget.b$b r0 = r3.f2949a
            int r0 = r0.mo844c(r4)
            if (r0 < 0) goto L_0x0011
            androidx.recyclerview.widget.b$a r1 = r3.f2950b
            r1.m1103e(r0)
            r3.m1112g(r4)
            return
        L_0x0011:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "view is not a child, cannot hide "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* renamed from: a */
    void m1127a(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4, boolean r5) {
            r1 = this;
            if (r3 >= 0) goto L_0x0009
            androidx.recyclerview.widget.b$b r3 = r1.f2949a
            int r3 = r3.mo853a()
            goto L_0x000d
        L_0x0009:
            int r3 = r1.m1114f(r3)
        L_0x000d:
            androidx.recyclerview.widget.b$a r0 = r1.f2950b
            r0.m1108a(r3, r5)
            if (r5 == 0) goto L_0x0017
            r1.m1112g(r2)
        L_0x0017:
            androidx.recyclerview.widget.b$b r5 = r1.f2949a
            r5.mo849a(r2, r3, r4)
            return
    }

    /* renamed from: a */
    void m1126a(android.view.View r2, int r3, boolean r4) {
            r1 = this;
            if (r3 >= 0) goto L_0x0009
            androidx.recyclerview.widget.b$b r3 = r1.f2949a
            int r3 = r3.mo853a()
            goto L_0x000d
        L_0x0009:
            int r3 = r1.m1114f(r3)
        L_0x000d:
            androidx.recyclerview.widget.b$a r0 = r1.f2950b
            r0.m1108a(r3, r4)
            if (r4 == 0) goto L_0x0017
            r1.m1112g(r2)
        L_0x0017:
            androidx.recyclerview.widget.b$b r4 = r1.f2949a
            r4.mo850a(r2, r3)
            return
    }

    /* renamed from: a */
    void m1125a(android.view.View r2, boolean r3) {
            r1 = this;
            r0 = -1
            r1.m1126a(r2, r0, r3)
            return
    }

    /* renamed from: b */
    int m1124b() {
            r1 = this;
            androidx.recyclerview.widget.b$b r0 = r1.f2949a
            int r0 = r0.mo853a()
            return r0
    }

    /* renamed from: b */
    int m1122b(android.view.View r3) {
            r2 = this;
            androidx.recyclerview.widget.b$b r0 = r2.f2949a
            int r3 = r0.mo844c(r3)
            r0 = -1
            if (r3 != r0) goto L_0x000a
            return r0
        L_0x000a:
            androidx.recyclerview.widget.b$a r1 = r2.f2950b
            boolean r1 = r1.m1105c(r3)
            if (r1 == 0) goto L_0x0013
            return r0
        L_0x0013:
            androidx.recyclerview.widget.b$a r0 = r2.f2950b
            int r0 = r0.m1106b(r3)
            int r3 = r3 - r0
            return r3
    }

    /* renamed from: b */
    android.view.View m1123b(int r6) {
            r5 = this;
            java.util.List<android.view.View> r0 = r5.f2951c
            int r0 = r0.size()
            r1 = 0
        L_0x0007:
            if (r1 >= r0) goto L_0x002d
            java.util.List<android.view.View> r2 = r5.f2951c
            java.lang.Object r2 = r2.get(r1)
            android.view.View r2 = (android.view.View) r2
            androidx.recyclerview.widget.b$b r3 = r5.f2949a
            androidx.recyclerview.widget.j$d0 r3 = r3.mo843d(r2)
            int r4 = r3.m871i()
            if (r4 != r6) goto L_0x002a
            boolean r4 = r3.m866n()
            if (r4 != 0) goto L_0x002a
            boolean r3 = r3.m864p()
            if (r3 != 0) goto L_0x002a
            return r2
        L_0x002a:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x002d:
            r6 = 0
            return r6
    }

    /* renamed from: c */
    android.view.View m1120c(int r2) {
            r1 = this;
            int r2 = r1.m1114f(r2)
            androidx.recyclerview.widget.b$b r0 = r1.f2949a
            android.view.View r2 = r0.mo852a(r2)
            return r2
    }

    /* renamed from: c */
    void m1121c() {
            r3 = this;
            androidx.recyclerview.widget.b$a r0 = r3.f2950b
            r0.m1110a()
            java.util.List<android.view.View> r0 = r3.f2951c
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L_0x000d:
            if (r0 < 0) goto L_0x0024
            androidx.recyclerview.widget.b$b r1 = r3.f2949a
            java.util.List<android.view.View> r2 = r3.f2951c
            java.lang.Object r2 = r2.get(r0)
            android.view.View r2 = (android.view.View) r2
            r1.mo851a(r2)
            java.util.List<android.view.View> r1 = r3.f2951c
            r1.remove(r0)
            int r0 = r0 + (-1)
            goto L_0x000d
        L_0x0024:
            androidx.recyclerview.widget.b$b r0 = r3.f2949a
            r0.mo848b()
            return
    }

    /* renamed from: c */
    boolean m1119c(android.view.View r2) {
            r1 = this;
            java.util.List<android.view.View> r0 = r1.f2951c
            boolean r2 = r0.contains(r2)
            return r2
    }

    /* renamed from: d */
    android.view.View m1118d(int r2) {
            r1 = this;
            androidx.recyclerview.widget.b$b r0 = r1.f2949a
            android.view.View r2 = r0.mo852a(r2)
            return r2
    }

    /* renamed from: d */
    void m1117d(android.view.View r3) {
            r2 = this;
            androidx.recyclerview.widget.b$b r0 = r2.f2949a
            int r0 = r0.mo844c(r3)
            if (r0 >= 0) goto L_0x0009
            return
        L_0x0009:
            androidx.recyclerview.widget.b$a r1 = r2.f2950b
            boolean r1 = r1.m1104d(r0)
            if (r1 == 0) goto L_0x0014
            r2.m1111h(r3)
        L_0x0014:
            androidx.recyclerview.widget.b$b r3 = r2.f2949a
            r3.mo845c(r0)
            return
    }

    /* renamed from: e */
    void m1116e(int r3) {
            r2 = this;
            int r3 = r2.m1114f(r3)
            androidx.recyclerview.widget.b$b r0 = r2.f2949a
            android.view.View r0 = r0.mo852a(r3)
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            androidx.recyclerview.widget.b$a r1 = r2.f2950b
            boolean r1 = r1.m1104d(r3)
            if (r1 == 0) goto L_0x0018
            r2.m1111h(r0)
        L_0x0018:
            androidx.recyclerview.widget.b$b r0 = r2.f2949a
            r0.mo845c(r3)
            return
    }

    /* renamed from: e */
    boolean m1115e(android.view.View r4) {
            r3 = this;
            androidx.recyclerview.widget.b$b r0 = r3.f2949a
            int r0 = r0.mo844c(r4)
            r1 = 1
            r2 = -1
            if (r0 != r2) goto L_0x000e
            r3.m1111h(r4)
            return r1
        L_0x000e:
            androidx.recyclerview.widget.b$a r2 = r3.f2950b
            boolean r2 = r2.m1105c(r0)
            if (r2 == 0) goto L_0x0024
            androidx.recyclerview.widget.b$a r2 = r3.f2950b
            r2.m1104d(r0)
            r3.m1111h(r4)
            androidx.recyclerview.widget.b$b r4 = r3.f2949a
            r4.mo845c(r0)
            return r1
        L_0x0024:
            r4 = 0
            return r4
    }

    /* renamed from: f */
    void m1113f(android.view.View r4) {
            r3 = this;
            androidx.recyclerview.widget.b$b r0 = r3.f2949a
            int r0 = r0.mo844c(r4)
            if (r0 < 0) goto L_0x0030
            androidx.recyclerview.widget.b$a r1 = r3.f2950b
            boolean r1 = r1.m1105c(r0)
            if (r1 == 0) goto L_0x0019
            androidx.recyclerview.widget.b$a r1 = r3.f2950b
            r1.m1109a(r0)
            r3.m1111h(r4)
            return
        L_0x0019:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "trying to unhide a view that was not hidden"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x0030:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "view is not a child, cannot hide "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            androidx.recyclerview.widget.b$a r1 = r2.f2950b
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = ", hidden list:"
            r0.append(r1)
            java.util.List<android.view.View> r1 = r2.f2951c
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
