package p000a.p001a.p004l.p005a;

/* renamed from: a.a.l.a.e */
/* loaded from: classes.dex */
class C0026e extends p000a.p001a.p004l.p005a.C0020b {

    /* renamed from: n */
    private p000a.p001a.p004l.p005a.C0026e.C0027a f83n;

    /* renamed from: o */
    private boolean f84o;

    /* renamed from: a.a.l.a.e$a */
    /* loaded from: classes.dex */
    static class C0027a extends p000a.p001a.p004l.p005a.C0020b.AbstractC0023c {

        /* renamed from: J */
        int[][] f85J;

        C0027a(p000a.p001a.p004l.p005a.C0026e.C0027a r1, p000a.p001a.p004l.p005a.C0026e r2, android.content.res.Resources r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                if (r1 == 0) goto L_0x000a
                int[][] r1 = r1.f85J
                r0.f85J = r1
                goto L_0x0012
            L_0x000a:
                int r1 = r0.m4214c()
                int[][] r1 = new int[r1]
                r0.f85J = r1
            L_0x0012:
                return
        }

        /* renamed from: a */
        int m4189a(int[] r5) {
                r4 = this;
                int[][] r0 = r4.f85J
                int r1 = r4.m4212d()
                r2 = 0
            L_0x0007:
                if (r2 >= r1) goto L_0x0015
                r3 = r0[r2]
                boolean r3 = android.util.StateSet.stateSetMatches(r3, r5)
                if (r3 == 0) goto L_0x0012
                return r2
            L_0x0012:
                int r2 = r2 + 1
                goto L_0x0007
            L_0x0015:
                r5 = -1
                return r5
        }

        /* renamed from: a */
        int m4188a(int[] r2, android.graphics.drawable.Drawable r3) {
                r1 = this;
                int r3 = r1.m4221a(r3)
                int[][] r0 = r1.f85J
                r0[r3] = r2
                return r3
        }

        @Override // p000a.p001a.p004l.p005a.C0020b.AbstractC0023c
        /* renamed from: a */
        public void mo4190a(int r3, int r4) {
                r2 = this;
                super.mo4190a(r3, r4)
                int[][] r4 = new int[r4]
                int[][] r0 = r2.f85J
                r1 = 0
                java.lang.System.arraycopy(r0, r1, r4, r1, r3)
                r2.f85J = r4
                return
        }

        @Override // p000a.p001a.p004l.p005a.C0020b.AbstractC0023c
        /* renamed from: m */
        void mo4187m() {
                r4 = this;
                int[][] r0 = r4.f85J
                int r1 = r0.length
                int[][] r1 = new int[r1]
                int r0 = r0.length
                int r0 = r0 + (-1)
            L_0x0008:
                if (r0 < 0) goto L_0x001f
                int[][] r2 = r4.f85J
                r3 = r2[r0]
                if (r3 == 0) goto L_0x0019
                r2 = r2[r0]
                java.lang.Object r2 = r2.clone()
                int[] r2 = (int[]) r2
                goto L_0x001a
            L_0x0019:
                r2 = 0
            L_0x001a:
                r1[r0] = r2
                int r0 = r0 + (-1)
                goto L_0x0008
            L_0x001f:
                r4.f85J = r1
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r2 = this;
                a.a.l.a.e r0 = new a.a.l.a.e
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
                r1 = this;
                a.a.l.a.e r0 = new a.a.l.a.e
                r0.<init>(r1, r2)
                return r0
        }
    }

    C0026e(p000a.p001a.p004l.p005a.C0026e.C0027a r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L_0x0008
            r0.mo4192a(r1)
        L_0x0008:
            return
    }

    C0026e(p000a.p001a.p004l.p005a.C0026e.C0027a r2, android.content.res.Resources r3) {
            r1 = this;
            r1.<init>()
            a.a.l.a.e$a r0 = new a.a.l.a.e$a
            r0.<init>(r2, r1, r3)
            r1.mo4192a(r0)
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
            return
    }

    @Override // p000a.p001a.p004l.p005a.C0020b
    /* renamed from: a */
    /* bridge */ /* synthetic */ p000a.p001a.p004l.p005a.C0020b.AbstractC0023c mo4193a() {
            r1 = this;
            a.a.l.a.e$a r0 = r1.mo4193a()
            return r0
    }

    @Override // p000a.p001a.p004l.p005a.C0020b
    /* renamed from: a */
    p000a.p001a.p004l.p005a.C0026e.C0027a mo4193a() {
            r3 = this;
            a.a.l.a.e$a r0 = new a.a.l.a.e$a
            a.a.l.a.e$a r1 = r3.f83n
            r2 = 0
            r0.<init>(r1, r3, r2)
            return r0
    }

    @Override // p000a.p001a.p004l.p005a.C0020b
    /* renamed from: a */
    protected void mo4192a(p000a.p001a.p004l.p005a.C0020b.AbstractC0023c r2) {
            r1 = this;
            super.mo4192a(r2)
            boolean r0 = r2 instanceof p000a.p001a.p004l.p005a.C0026e.C0027a
            if (r0 == 0) goto L_0x000b
            a.a.l.a.e$a r2 = (p000a.p001a.p004l.p005a.C0026e.C0027a) r2
            r1.f83n = r2
        L_0x000b:
            return
    }

    /* renamed from: a */
    int[] m4191a(android.util.AttributeSet r9) {
            r8 = this;
            int r0 = r9.getAttributeCount()
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0009:
            if (r3 >= r0) goto L_0x002b
            int r5 = r9.getAttributeNameResource(r3)
            if (r5 == 0) goto L_0x0028
            r6 = 16842960(0x10100d0, float:2.369414E-38)
            if (r5 == r6) goto L_0x0028
            r6 = 16843161(0x1010199, float:2.3694704E-38)
            if (r5 == r6) goto L_0x0028
            int r6 = r4 + 1
            boolean r7 = r9.getAttributeBooleanValue(r3, r2)
            if (r7 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            int r5 = -r5
        L_0x0025:
            r1[r4] = r5
            r4 = r6
        L_0x0028:
            int r3 = r3 + 1
            goto L_0x0009
        L_0x002b:
            int[] r9 = android.util.StateSet.trimStateSet(r1, r4)
            return r9
    }

    @Override // p000a.p001a.p004l.p005a.C0020b, android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme r1) {
            r0 = this;
            super.applyTheme(r1)
            int[] r1 = r0.getState()
            r0.onStateChange(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // p000a.p001a.p004l.p005a.C0020b, android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r1 = this;
            boolean r0 = r1.f84o
            if (r0 != 0) goto L_0x0011
            super.mutate()
            if (r1 != r1) goto L_0x0011
            a.a.l.a.e$a r0 = r1.f83n
            r0.mo4187m()
            r0 = 1
            r1.f84o = r0
        L_0x0011:
            return r1
    }

    @Override // p000a.p001a.p004l.p005a.C0020b, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r3) {
            r2 = this;
            boolean r0 = super.onStateChange(r3)
            a.a.l.a.e$a r1 = r2.f83n
            int r3 = r1.m4189a(r3)
            if (r3 >= 0) goto L_0x0014
            a.a.l.a.e$a r3 = r2.f83n
            int[] r1 = android.util.StateSet.WILD_CARD
            int r3 = r3.m4189a(r1)
        L_0x0014:
            boolean r3 = r2.m4234a(r3)
            if (r3 != 0) goto L_0x001f
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            goto L_0x0020
        L_0x001f:
            r3 = 1
        L_0x0020:
            return r3
    }
}
