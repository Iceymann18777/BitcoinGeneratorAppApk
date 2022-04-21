package com.google.android.material.transformation;

/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c<android.view.View> {

    /* renamed from: a */
    private int f3641a;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    /* loaded from: classes.dex */
    class ViewTreeObserver$OnPreDrawListenerC0998a implements android.view.ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        final /* synthetic */ android.view.View f3642b;

        /* renamed from: c */
        final /* synthetic */ int f3643c;

        /* renamed from: d */
        final /* synthetic */ p050b.p051a.p052a.p053a.p058m.AbstractC0903b f3644d;

        /* renamed from: e */
        final /* synthetic */ com.google.android.material.transformation.ExpandableBehavior f3645e;

        ViewTreeObserver$OnPreDrawListenerC0998a(com.google.android.material.transformation.ExpandableBehavior r1, android.view.View r2, int r3, p050b.p051a.p052a.p053a.p058m.AbstractC0903b r4) {
                r0 = this;
                r0.f3645e = r1
                r0.f3642b = r2
                r0.f3643c = r3
                r0.f3644d = r4
                r0.<init>()
                return
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
                r5 = this;
                android.view.View r0 = r5.f3642b
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                r0.removeOnPreDrawListener(r5)
                com.google.android.material.transformation.ExpandableBehavior r0 = r5.f3645e
                int r0 = com.google.android.material.transformation.ExpandableBehavior.m45a(r0)
                int r1 = r5.f3643c
                r2 = 0
                if (r0 != r1) goto L_0x0024
                com.google.android.material.transformation.ExpandableBehavior r0 = r5.f3645e
                b.a.a.a.m.b r1 = r5.f3644d
                r3 = r1
                android.view.View r3 = (android.view.View) r3
                android.view.View r4 = r5.f3642b
                boolean r1 = r1.mo229a()
                r0.mo16a(r3, r4, r1, r2)
            L_0x0024:
                return r2
        }
    }

    public ExpandableBehavior() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f3641a = r0
            return
    }

    public ExpandableBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.f3641a = r1
            return
    }

    /* renamed from: a */
    static /* synthetic */ int m45a(com.google.android.material.transformation.ExpandableBehavior r0) {
            int r0 = r0.f3641a
            return r0
    }

    /* renamed from: a */
    private boolean m44a(boolean r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L_0x000d
            int r4 = r3.f3641a
            if (r4 == 0) goto L_0x000b
            r2 = 2
            if (r4 != r2) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            return r0
        L_0x000d:
            int r4 = r3.f3641a
            if (r4 != r1) goto L_0x0012
            r0 = 1
        L_0x0012:
            return r0
    }

    /* renamed from: a */
    protected abstract boolean mo16a(android.view.View r1, android.view.View r2, boolean r3, boolean r4);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public boolean mo46a(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, int r5) {
            r2 = this;
            boolean r5 = p000a.p018g.p029l.C0216r.m3397x(r4)
            if (r5 != 0) goto L_0x002f
            b.a.a.a.m.b r3 = r2.m42e(r3, r4)
            if (r3 == 0) goto L_0x002f
            boolean r5 = r3.mo229a()
            boolean r5 = r2.m44a(r5)
            if (r5 == 0) goto L_0x002f
            boolean r5 = r3.mo229a()
            if (r5 == 0) goto L_0x001e
            r5 = 1
            goto L_0x001f
        L_0x001e:
            r5 = 2
        L_0x001f:
            r2.f3641a = r5
            int r5 = r2.f3641a
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()
            com.google.android.material.transformation.ExpandableBehavior$a r1 = new com.google.android.material.transformation.ExpandableBehavior$a
            r1.<init>(r2, r4, r5, r3)
            r0.addOnPreDrawListener(r1)
        L_0x002f:
            r3 = 0
            return r3
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: b */
    public boolean mo43b(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
            r1 = this;
            b.a.a.a.m.b r4 = (p050b.p051a.p052a.p053a.p058m.AbstractC0903b) r4
            boolean r2 = r4.mo229a()
            boolean r2 = r1.m44a(r2)
            if (r2 == 0) goto L_0x0024
            boolean r2 = r4.mo229a()
            r0 = 1
            if (r2 == 0) goto L_0x0015
            r2 = 1
            goto L_0x0016
        L_0x0015:
            r2 = 2
        L_0x0016:
            r1.f3641a = r2
            r2 = r4
            android.view.View r2 = (android.view.View) r2
            boolean r4 = r4.mo229a()
            boolean r2 = r1.mo16a(r2, r3, r4, r0)
            return r2
        L_0x0024:
            r2 = 0
            return r2
    }

    /* renamed from: e */
    protected p050b.p051a.p052a.p053a.p058m.AbstractC0903b m42e(androidx.coordinatorlayout.widget.CoordinatorLayout r6, android.view.View r7) {
            r5 = this;
            java.util.List r0 = r6.m1704b(r7)
            int r1 = r0.size()
            r2 = 0
        L_0x0009:
            if (r2 >= r1) goto L_0x001d
            java.lang.Object r3 = r0.get(r2)
            android.view.View r3 = (android.view.View) r3
            boolean r4 = r5.mo20a(r6, r7, r3)
            if (r4 == 0) goto L_0x001a
            b.a.a.a.m.b r3 = (p050b.p051a.p052a.p053a.p058m.AbstractC0903b) r3
            return r3
        L_0x001a:
            int r2 = r2 + 1
            goto L_0x0009
        L_0x001d:
            r6 = 0
            return r6
    }
}
