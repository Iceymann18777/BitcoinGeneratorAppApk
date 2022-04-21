package com.google.android.material.snackbar;

/* renamed from: com.google.android.material.snackbar.d */
/* loaded from: classes.dex */
public class C0991d extends android.widget.FrameLayout {

    /* renamed from: b */
    private final android.view.accessibility.AccessibilityManager f3627b;

    /* renamed from: c */
    private final p000a.p018g.p029l.p030a0.C0188b.AbstractC0189a f3628c;

    /* renamed from: d */
    private com.google.android.material.snackbar.AbstractC0990c f3629d;

    /* renamed from: e */
    private com.google.android.material.snackbar.AbstractC0989b f3630e;

    /* renamed from: com.google.android.material.snackbar.d$a */
    /* loaded from: classes.dex */
    class C0992a implements p000a.p018g.p029l.p030a0.C0188b.AbstractC0189a {

        /* renamed from: a */
        final /* synthetic */ com.google.android.material.snackbar.C0991d f3631a;

        C0992a(com.google.android.material.snackbar.C0991d r1) {
                r0 = this;
                r0.f3631a = r1
                r0.<init>()
                return
        }

        @Override // p000a.p018g.p029l.p030a0.C0188b.AbstractC0189a
        public void onTouchExplorationStateChanged(boolean r2) {
                r1 = this;
                com.google.android.material.snackbar.d r0 = r1.f3631a
                com.google.android.material.snackbar.C0991d.m56a(r0, r2)
                return
        }
    }

    protected C0991d(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    protected C0991d(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            int[] r0 = p050b.p051a.p052a.p053a.C0876i.SnackbarLayout
            android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r4, r0)
            int r0 = p050b.p051a.p052a.p053a.C0876i.SnackbarLayout_elevation
            boolean r0 = r4.hasValue(r0)
            if (r0 == 0) goto L_0x001c
            int r0 = p050b.p051a.p052a.p053a.C0876i.SnackbarLayout_elevation
            r1 = 0
            int r0 = r4.getDimensionPixelSize(r0, r1)
            float r0 = (float) r0
            p000a.p018g.p029l.C0216r.m3444a(r2, r0)
        L_0x001c:
            r4.recycle()
            java.lang.String r4 = "accessibility"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.view.accessibility.AccessibilityManager r3 = (android.view.accessibility.AccessibilityManager) r3
            r2.f3627b = r3
            com.google.android.material.snackbar.d$a r3 = new com.google.android.material.snackbar.d$a
            r3.<init>(r2)
            r2.f3628c = r3
            android.view.accessibility.AccessibilityManager r3 = r2.f3627b
            a.g.l.a0.b$a r4 = r2.f3628c
            p000a.p018g.p029l.p030a0.C0188b.m3547a(r3, r4)
            android.view.accessibility.AccessibilityManager r3 = r2.f3627b
            boolean r3 = r3.isTouchExplorationEnabled()
            r2.setClickableOrFocusableBasedOnAccessibility(r3)
            return
    }

    /* renamed from: a */
    static /* synthetic */ void m56a(com.google.android.material.snackbar.C0991d r0, boolean r1) {
            r0.setClickableOrFocusableBasedOnAccessibility(r1)
            return
    }

    private void setClickableOrFocusableBasedOnAccessibility(boolean r2) {
            r1 = this;
            r0 = r2 ^ 1
            r1.setClickable(r0)
            r1.setFocusable(r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.google.android.material.snackbar.b r0 = r1.f3630e
            if (r0 == 0) goto L_0x000a
            r0.onViewAttachedToWindow(r1)
        L_0x000a:
            p000a.p018g.p029l.C0216r.m3449B(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            com.google.android.material.snackbar.b r0 = r2.f3630e
            if (r0 == 0) goto L_0x000a
            r0.onViewDetachedFromWindow(r2)
        L_0x000a:
            android.view.accessibility.AccessibilityManager r0 = r2.f3627b
            a.g.l.a0.b$a r1 = r2.f3628c
            p000a.p018g.p029l.p030a0.C0188b.m3546b(r0, r1)
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            super.onLayout(r7, r8, r9, r10, r11)
            com.google.android.material.snackbar.c r0 = r6.f3629d
            if (r0 == 0) goto L_0x000f
            r1 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.m57a(r1, r2, r3, r4, r5)
        L_0x000f:
            return
    }

    void setOnAttachStateChangeListener(com.google.android.material.snackbar.AbstractC0989b r1) {
            r0 = this;
            r0.f3630e = r1
            return
    }

    void setOnLayoutChangeListener(com.google.android.material.snackbar.AbstractC0990c r1) {
            r0 = this;
            r0.f3629d = r1
            return
    }
}
