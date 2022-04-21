package androidx.constraintlayout.widget;

/* renamed from: androidx.constraintlayout.widget.d */
/* loaded from: classes.dex */
public class C0669d extends android.view.ViewGroup {

    /* renamed from: b */
    androidx.constraintlayout.widget.C0666c f2551b;

    /* renamed from: androidx.constraintlayout.widget.d$a */
    /* loaded from: classes.dex */
    public static class C0670a extends androidx.constraintlayout.widget.ConstraintLayout.C0662a {

        /* renamed from: m0 */
        public float f2552m0;

        /* renamed from: n0 */
        public boolean f2553n0;

        /* renamed from: o0 */
        public float f2554o0;

        /* renamed from: p0 */
        public float f2555p0;

        /* renamed from: q0 */
        public float f2556q0;

        /* renamed from: r0 */
        public float f2557r0;

        /* renamed from: s0 */
        public float f2558s0;

        /* renamed from: t0 */
        public float f2559t0;

        /* renamed from: u0 */
        public float f2560u0;

        /* renamed from: v0 */
        public float f2561v0;

        /* renamed from: w0 */
        public float f2562w0;

        /* renamed from: x0 */
        public float f2563x0;

        /* renamed from: y0 */
        public float f2564y0;

        public C0670a(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 1065353216(0x3f800000, float:1.0)
                r0.f2552m0 = r1
                r2 = 0
                r0.f2553n0 = r2
                r2 = 0
                r0.f2554o0 = r2
                r0.f2555p0 = r2
                r0.f2556q0 = r2
                r0.f2557r0 = r2
                r0.f2558s0 = r1
                r0.f2559t0 = r1
                r0.f2560u0 = r2
                r0.f2561v0 = r2
                r0.f2562w0 = r2
                r0.f2563x0 = r2
                r0.f2564y0 = r2
                return
        }

        public C0670a(android.content.Context r4, android.util.AttributeSet r5) {
                r3 = this;
                r3.<init>(r4, r5)
                r0 = 1065353216(0x3f800000, float:1.0)
                r3.f2552m0 = r0
                r1 = 0
                r3.f2553n0 = r1
                r2 = 0
                r3.f2554o0 = r2
                r3.f2555p0 = r2
                r3.f2556q0 = r2
                r3.f2557r0 = r2
                r3.f2558s0 = r0
                r3.f2559t0 = r0
                r3.f2560u0 = r2
                r3.f2561v0 = r2
                r3.f2562w0 = r2
                r3.f2563x0 = r2
                r3.f2564y0 = r2
                int[] r0 = androidx.constraintlayout.widget.C0674h.ConstraintSet
                android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r0)
                int r5 = r4.getIndexCount()
            L_0x002b:
                if (r1 >= r5) goto L_0x00d1
                int r0 = r4.getIndex(r1)
                int r2 = androidx.constraintlayout.widget.C0674h.ConstraintSet_android_alpha
                if (r0 != r2) goto L_0x003f
                float r2 = r3.f2552m0
                float r0 = r4.getFloat(r0, r2)
                r3.f2552m0 = r0
                goto L_0x00cd
            L_0x003f:
                int r2 = androidx.constraintlayout.widget.C0674h.ConstraintSet_android_elevation
                if (r0 != r2) goto L_0x0050
                float r2 = r3.f2554o0
                float r0 = r4.getFloat(r0, r2)
                r3.f2554o0 = r0
                r0 = 1
                r3.f2553n0 = r0
                goto L_0x00cd
            L_0x0050:
                int r2 = androidx.constraintlayout.widget.C0674h.ConstraintSet_android_rotationX
                if (r0 != r2) goto L_0x005e
                float r2 = r3.f2556q0
                float r0 = r4.getFloat(r0, r2)
                r3.f2556q0 = r0
                goto L_0x00cd
            L_0x005e:
                int r2 = androidx.constraintlayout.widget.C0674h.ConstraintSet_android_rotationY
                if (r0 != r2) goto L_0x006b
                float r2 = r3.f2557r0
                float r0 = r4.getFloat(r0, r2)
                r3.f2557r0 = r0
                goto L_0x00cd
            L_0x006b:
                int r2 = androidx.constraintlayout.widget.C0674h.ConstraintSet_android_rotation
                if (r0 != r2) goto L_0x0078
                float r2 = r3.f2555p0
                float r0 = r4.getFloat(r0, r2)
                r3.f2555p0 = r0
                goto L_0x00cd
            L_0x0078:
                int r2 = androidx.constraintlayout.widget.C0674h.ConstraintSet_android_scaleX
                if (r0 != r2) goto L_0x0085
                float r2 = r3.f2558s0
                float r0 = r4.getFloat(r0, r2)
                r3.f2558s0 = r0
                goto L_0x00cd
            L_0x0085:
                int r2 = androidx.constraintlayout.widget.C0674h.ConstraintSet_android_scaleY
                if (r0 != r2) goto L_0x0092
                float r2 = r3.f2559t0
                float r0 = r4.getFloat(r0, r2)
                r3.f2559t0 = r0
                goto L_0x00cd
            L_0x0092:
                int r2 = androidx.constraintlayout.widget.C0674h.ConstraintSet_android_transformPivotX
                if (r0 != r2) goto L_0x009f
                float r2 = r3.f2560u0
                float r0 = r4.getFloat(r0, r2)
                r3.f2560u0 = r0
                goto L_0x00cd
            L_0x009f:
                int r2 = androidx.constraintlayout.widget.C0674h.ConstraintSet_android_transformPivotY
                if (r0 != r2) goto L_0x00ac
                float r2 = r3.f2561v0
                float r0 = r4.getFloat(r0, r2)
                r3.f2561v0 = r0
                goto L_0x00cd
            L_0x00ac:
                int r2 = androidx.constraintlayout.widget.C0674h.ConstraintSet_android_translationX
                if (r0 != r2) goto L_0x00b9
                float r2 = r3.f2562w0
            L_0x00b2:
                float r0 = r4.getFloat(r0, r2)
                r3.f2562w0 = r0
                goto L_0x00cd
            L_0x00b9:
                int r2 = androidx.constraintlayout.widget.C0674h.ConstraintSet_android_translationY
                if (r0 != r2) goto L_0x00c6
                float r2 = r3.f2563x0
                float r0 = r4.getFloat(r0, r2)
                r3.f2563x0 = r0
                goto L_0x00cd
            L_0x00c6:
                int r2 = androidx.constraintlayout.widget.C0674h.ConstraintSet_android_translationZ
                if (r0 != r2) goto L_0x00cd
                float r2 = r3.f2564y0
                goto L_0x00b2
            L_0x00cd:
                int r1 = r1 + 1
                goto L_0x002b
            L_0x00d1:
                return
        }
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.constraintlayout.widget.d$a r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.view.ViewGroup
    protected androidx.constraintlayout.widget.C0669d.C0670a generateDefaultLayoutParams() {
            r2 = this;
            androidx.constraintlayout.widget.d$a r0 = new androidx.constraintlayout.widget.d$a
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.constraintlayout.widget.d$a r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$a r0 = new androidx.constraintlayout.widget.ConstraintLayout$a
            r0.<init>(r2)
            return r0
    }

    @Override // android.view.ViewGroup
    public androidx.constraintlayout.widget.C0669d.C0670a generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.constraintlayout.widget.d$a r0 = new androidx.constraintlayout.widget.d$a
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    public androidx.constraintlayout.widget.C0666c getConstraintSet() {
            r1 = this;
            androidx.constraintlayout.widget.c r0 = r1.f2551b
            if (r0 != 0) goto L_0x000b
            androidx.constraintlayout.widget.c r0 = new androidx.constraintlayout.widget.c
            r0.<init>()
            r1.f2551b = r0
        L_0x000b:
            androidx.constraintlayout.widget.c r0 = r1.f2551b
            r0.m1735a(r1)
            androidx.constraintlayout.widget.c r0 = r1.f2551b
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            return
    }
}
