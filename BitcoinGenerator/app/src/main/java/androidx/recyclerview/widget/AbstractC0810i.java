package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.i */
/* loaded from: classes.dex */
public abstract class AbstractC0810i {

    /* renamed from: a */
    protected final androidx.recyclerview.widget.C0813j.AbstractC0835o f3066a;

    /* renamed from: b */
    private int f3067b;

    /* renamed from: c */
    final android.graphics.Rect f3068c;

    /* renamed from: androidx.recyclerview.widget.i$a */
    /* loaded from: classes.dex */
    static class C0811a extends androidx.recyclerview.widget.AbstractC0810i {
        C0811a(androidx.recyclerview.widget.C0813j.AbstractC0835o r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: a */
        public int mo1041a() {
                r1 = this;
                androidx.recyclerview.widget.j$o r0 = r1.f3066a
                int r0 = r0.m665q()
                return r0
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: a */
        public int mo1039a(android.view.View r3) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.j$p r0 = (androidx.recyclerview.widget.C0813j.C0840p) r0
                androidx.recyclerview.widget.j$o r1 = r2.f3066a
                int r3 = r1.m679i(r3)
                int r0 = r0.rightMargin
                int r3 = r3 + r0
                return r3
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: a */
        public void mo1040a(int r2) {
                r1 = this;
                androidx.recyclerview.widget.j$o r0 = r1.f3066a
                r0.mo705d(r2)
                return
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: b */
        public int mo1038b() {
                r2 = this;
                androidx.recyclerview.widget.j$o r0 = r2.f3066a
                int r0 = r0.m665q()
                androidx.recyclerview.widget.j$o r1 = r2.f3066a
                int r1 = r1.m668o()
                int r0 = r0 - r1
                return r0
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: b */
        public int mo1037b(android.view.View r3) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.j$p r0 = (androidx.recyclerview.widget.C0813j.C0840p) r0
                androidx.recyclerview.widget.j$o r1 = r2.f3066a
                int r3 = r1.m681h(r3)
                int r1 = r0.leftMargin
                int r3 = r3 + r1
                int r0 = r0.rightMargin
                int r3 = r3 + r0
                return r3
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: c */
        public int mo1036c() {
                r1 = this;
                androidx.recyclerview.widget.j$o r0 = r1.f3066a
                int r0 = r0.m668o()
                return r0
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: c */
        public int mo1035c(android.view.View r3) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.j$p r0 = (androidx.recyclerview.widget.C0813j.C0840p) r0
                androidx.recyclerview.widget.j$o r1 = r2.f3066a
                int r3 = r1.m684g(r3)
                int r1 = r0.topMargin
                int r3 = r3 + r1
                int r0 = r0.bottomMargin
                int r3 = r3 + r0
                return r3
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: d */
        public int mo1034d() {
                r1 = this;
                androidx.recyclerview.widget.j$o r0 = r1.f3066a
                int r0 = r0.m664r()
                return r0
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: d */
        public int mo1033d(android.view.View r3) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.j$p r0 = (androidx.recyclerview.widget.C0813j.C0840p) r0
                androidx.recyclerview.widget.j$o r1 = r2.f3066a
                int r3 = r1.m689f(r3)
                int r0 = r0.leftMargin
                int r3 = r3 - r0
                return r3
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: e */
        public int mo1032e() {
                r1 = this;
                androidx.recyclerview.widget.j$o r0 = r1.f3066a
                int r0 = r0.m680i()
                return r0
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: e */
        public int mo1031e(android.view.View r4) {
                r3 = this;
                androidx.recyclerview.widget.j$o r0 = r3.f3066a
                android.graphics.Rect r1 = r3.f3068c
                r2 = 1
                r0.m760a(r4, r2, r1)
                android.graphics.Rect r4 = r3.f3068c
                int r4 = r4.right
                return r4
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: f */
        public int mo1030f() {
                r1 = this;
                androidx.recyclerview.widget.j$o r0 = r1.f3066a
                int r0 = r0.m670n()
                return r0
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: f */
        public int mo1029f(android.view.View r4) {
                r3 = this;
                androidx.recyclerview.widget.j$o r0 = r3.f3066a
                android.graphics.Rect r1 = r3.f3068c
                r2 = 1
                r0.m760a(r4, r2, r1)
                android.graphics.Rect r4 = r3.f3068c
                int r4 = r4.left
                return r4
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: g */
        public int mo1028g() {
                r2 = this;
                androidx.recyclerview.widget.j$o r0 = r2.f3066a
                int r0 = r0.m665q()
                androidx.recyclerview.widget.j$o r1 = r2.f3066a
                int r1 = r1.m670n()
                int r0 = r0 - r1
                androidx.recyclerview.widget.j$o r1 = r2.f3066a
                int r1 = r1.m668o()
                int r0 = r0 - r1
                return r0
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$b */
    /* loaded from: classes.dex */
    static class C0812b extends androidx.recyclerview.widget.AbstractC0810i {
        C0812b(androidx.recyclerview.widget.C0813j.AbstractC0835o r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: a */
        public int mo1041a() {
                r1 = this;
                androidx.recyclerview.widget.j$o r0 = r1.f3066a
                int r0 = r0.m682h()
                return r0
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: a */
        public int mo1039a(android.view.View r3) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.j$p r0 = (androidx.recyclerview.widget.C0813j.C0840p) r0
                androidx.recyclerview.widget.j$o r1 = r2.f3066a
                int r3 = r1.m695e(r3)
                int r0 = r0.bottomMargin
                int r3 = r3 + r0
                return r3
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: a */
        public void mo1040a(int r2) {
                r1 = this;
                androidx.recyclerview.widget.j$o r0 = r1.f3066a
                r0.mo696e(r2)
                return
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: b */
        public int mo1038b() {
                r2 = this;
                androidx.recyclerview.widget.j$o r0 = r2.f3066a
                int r0 = r0.m682h()
                androidx.recyclerview.widget.j$o r1 = r2.f3066a
                int r1 = r1.m672m()
                int r0 = r0 - r1
                return r0
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: b */
        public int mo1037b(android.view.View r3) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.j$p r0 = (androidx.recyclerview.widget.C0813j.C0840p) r0
                androidx.recyclerview.widget.j$o r1 = r2.f3066a
                int r3 = r1.m684g(r3)
                int r1 = r0.topMargin
                int r3 = r3 + r1
                int r0 = r0.bottomMargin
                int r3 = r3 + r0
                return r3
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: c */
        public int mo1036c() {
                r1 = this;
                androidx.recyclerview.widget.j$o r0 = r1.f3066a
                int r0 = r0.m672m()
                return r0
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: c */
        public int mo1035c(android.view.View r3) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.j$p r0 = (androidx.recyclerview.widget.C0813j.C0840p) r0
                androidx.recyclerview.widget.j$o r1 = r2.f3066a
                int r3 = r1.m681h(r3)
                int r1 = r0.leftMargin
                int r3 = r3 + r1
                int r0 = r0.rightMargin
                int r3 = r3 + r0
                return r3
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: d */
        public int mo1034d() {
                r1 = this;
                androidx.recyclerview.widget.j$o r0 = r1.f3066a
                int r0 = r0.m680i()
                return r0
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: d */
        public int mo1033d(android.view.View r3) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.j$p r0 = (androidx.recyclerview.widget.C0813j.C0840p) r0
                androidx.recyclerview.widget.j$o r1 = r2.f3066a
                int r3 = r1.m677j(r3)
                int r0 = r0.topMargin
                int r3 = r3 - r0
                return r3
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: e */
        public int mo1032e() {
                r1 = this;
                androidx.recyclerview.widget.j$o r0 = r1.f3066a
                int r0 = r0.m664r()
                return r0
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: e */
        public int mo1031e(android.view.View r4) {
                r3 = this;
                androidx.recyclerview.widget.j$o r0 = r3.f3066a
                android.graphics.Rect r1 = r3.f3068c
                r2 = 1
                r0.m760a(r4, r2, r1)
                android.graphics.Rect r4 = r3.f3068c
                int r4 = r4.bottom
                return r4
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: f */
        public int mo1030f() {
                r1 = this;
                androidx.recyclerview.widget.j$o r0 = r1.f3066a
                int r0 = r0.m666p()
                return r0
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: f */
        public int mo1029f(android.view.View r4) {
                r3 = this;
                androidx.recyclerview.widget.j$o r0 = r3.f3066a
                android.graphics.Rect r1 = r3.f3068c
                r2 = 1
                r0.m760a(r4, r2, r1)
                android.graphics.Rect r4 = r3.f3068c
                int r4 = r4.top
                return r4
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: g */
        public int mo1028g() {
                r2 = this;
                androidx.recyclerview.widget.j$o r0 = r2.f3066a
                int r0 = r0.m682h()
                androidx.recyclerview.widget.j$o r1 = r2.f3066a
                int r1 = r1.m666p()
                int r0 = r0 - r1
                androidx.recyclerview.widget.j$o r1 = r2.f3066a
                int r1 = r1.m672m()
                int r0 = r0 - r1
                return r0
        }
    }

    private AbstractC0810i(androidx.recyclerview.widget.C0813j.AbstractC0835o r2) {
            r1 = this;
            r1.<init>()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.f3067b = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.f3068c = r0
            r1.f3066a = r2
            return
    }

    /* synthetic */ AbstractC0810i(androidx.recyclerview.widget.C0813j.AbstractC0835o r1, androidx.recyclerview.widget.AbstractC0810i.C0811a r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* renamed from: a */
    public static androidx.recyclerview.widget.AbstractC0810i m1046a(androidx.recyclerview.widget.C0813j.AbstractC0835o r1) {
            androidx.recyclerview.widget.i$a r0 = new androidx.recyclerview.widget.i$a
            r0.<init>(r1)
            return r0
    }

    /* renamed from: a */
    public static androidx.recyclerview.widget.AbstractC0810i m1045a(androidx.recyclerview.widget.C0813j.AbstractC0835o r1, int r2) {
            if (r2 == 0) goto L_0x0012
            r0 = 1
            if (r2 != r0) goto L_0x000a
            androidx.recyclerview.widget.i r1 = m1044b(r1)
            return r1
        L_0x000a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "invalid orientation"
            r1.<init>(r2)
            throw r1
        L_0x0012:
            androidx.recyclerview.widget.i r1 = m1046a(r1)
            return r1
    }

    /* renamed from: b */
    public static androidx.recyclerview.widget.AbstractC0810i m1044b(androidx.recyclerview.widget.C0813j.AbstractC0835o r1) {
            androidx.recyclerview.widget.i$b r0 = new androidx.recyclerview.widget.i$b
            r0.<init>(r1)
            return r0
    }

    /* renamed from: a */
    public abstract int mo1041a();

    /* renamed from: a */
    public abstract int mo1039a(android.view.View r1);

    /* renamed from: a */
    public abstract void mo1040a(int r1);

    /* renamed from: b */
    public abstract int mo1038b();

    /* renamed from: b */
    public abstract int mo1037b(android.view.View r1);

    /* renamed from: c */
    public abstract int mo1036c();

    /* renamed from: c */
    public abstract int mo1035c(android.view.View r1);

    /* renamed from: d */
    public abstract int mo1034d();

    /* renamed from: d */
    public abstract int mo1033d(android.view.View r1);

    /* renamed from: e */
    public abstract int mo1032e();

    /* renamed from: e */
    public abstract int mo1031e(android.view.View r1);

    /* renamed from: f */
    public abstract int mo1030f();

    /* renamed from: f */
    public abstract int mo1029f(android.view.View r1);

    /* renamed from: g */
    public abstract int mo1028g();

    /* renamed from: h */
    public int m1043h() {
            r2 = this;
            int r0 = r2.f3067b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r0) goto L_0x0008
            r0 = 0
            goto L_0x000f
        L_0x0008:
            int r0 = r2.mo1028g()
            int r1 = r2.f3067b
            int r0 = r0 - r1
        L_0x000f:
            return r0
    }

    /* renamed from: i */
    public void m1042i() {
            r1 = this;
            int r0 = r1.mo1028g()
            r1.f3067b = r0
            return
    }
}
