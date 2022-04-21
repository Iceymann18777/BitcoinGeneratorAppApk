package com.google.android.material.transformation;

/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends com.google.android.material.transformation.FabTransformationBehavior {

    /* renamed from: g */
    private java.util.Map<android.view.View, java.lang.Integer> f3665g;

    public FabTransformationSheetBehavior() {
            r0 = this;
            r0.<init>()
            return
    }

    public FabTransformationSheetBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* renamed from: a */
    private void m15a(android.view.View r9, boolean r10) {
            r8 = this;
            android.view.ViewParent r0 = r9.getParent()
            boolean r1 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r1 != 0) goto L_0x0009
            return
        L_0x0009:
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            int r1 = r0.getChildCount()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 16
            if (r2 < r3) goto L_0x001e
            if (r10 == 0) goto L_0x001e
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r1)
            r8.f3665g = r2
        L_0x001e:
            r2 = 0
            r4 = 0
        L_0x0020:
            if (r4 >= r1) goto L_0x0075
            android.view.View r5 = r0.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            boolean r6 = r6 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f
            if (r6 == 0) goto L_0x003e
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.m1659d()
            boolean r6 = r6 instanceof com.google.android.material.transformation.FabTransformationScrimBehavior
            if (r6 == 0) goto L_0x003e
            r6 = 1
            goto L_0x003f
        L_0x003e:
            r6 = 0
        L_0x003f:
            if (r5 == r9) goto L_0x0072
            if (r6 == 0) goto L_0x0044
            goto L_0x0072
        L_0x0044:
            if (r10 != 0) goto L_0x005d
            java.util.Map<android.view.View, java.lang.Integer> r6 = r8.f3665g
            if (r6 == 0) goto L_0x0072
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0072
            java.util.Map<android.view.View, java.lang.Integer> r6 = r8.f3665g
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            goto L_0x006f
        L_0x005d:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r3) goto L_0x006e
            java.util.Map<android.view.View, java.lang.Integer> r6 = r8.f3665g
            int r7 = r5.getImportantForAccessibility()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.put(r5, r7)
        L_0x006e:
            r6 = 4
        L_0x006f:
            p000a.p018g.p029l.C0216r.m3418e(r5, r6)
        L_0x0072:
            int r4 = r4 + 1
            goto L_0x0020
        L_0x0075:
            if (r10 != 0) goto L_0x007a
            r9 = 0
            r8.f3665g = r9
        L_0x007a:
            return
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* renamed from: a */
    protected com.google.android.material.transformation.FabTransformationBehavior.C1004e mo17a(android.content.Context r3, boolean r4) {
            r2 = this;
            if (r4 == 0) goto L_0x0005
            int r4 = p050b.p051a.p052a.p053a.C0868a.mtrl_fab_transformation_sheet_expand_spec
            goto L_0x0007
        L_0x0005:
            int r4 = p050b.p051a.p052a.p053a.C0868a.mtrl_fab_transformation_sheet_collapse_spec
        L_0x0007:
            com.google.android.material.transformation.FabTransformationBehavior$e r0 = new com.google.android.material.transformation.FabTransformationBehavior$e
            r0.<init>()
            b.a.a.a.j.h r3 = p050b.p051a.p052a.p053a.p054j.C0884h.m472a(r3, r4)
            r0.f3659a = r3
            b.a.a.a.j.j r3 = new b.a.a.a.j.j
            r4 = 17
            r1 = 0
            r3.<init>(r4, r1, r1)
            r0.f3660b = r3
            return r0
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: a */
    protected boolean mo16a(android.view.View r1, android.view.View r2, boolean r3, boolean r4) {
            r0 = this;
            r0.m15a(r2, r3)
            boolean r1 = super.mo16a(r1, r2, r3, r4)
            return r1
    }
}
