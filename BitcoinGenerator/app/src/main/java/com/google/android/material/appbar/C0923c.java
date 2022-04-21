package com.google.android.material.appbar;

import android.view.View;

/* renamed from: com.google.android.material.appbar.c */
/* loaded from: classes.dex */
class C0923c<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c<V> {

    /* renamed from: a */
    private com.google.android.material.appbar.C0924d f3398a;

    /* renamed from: b */
    private int f3399b;

    /* renamed from: c */
    private int f3400c;

    public C0923c() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f3399b = r0
            r1.f3400c = r0
            return
    }

    public C0923c(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.f3399b = r1
            r0.f3400c = r1
            return
    }

    /* renamed from: a */
    public boolean m323a(int r2) {
            r1 = this;
            com.google.android.material.appbar.d r0 = r1.f3398a
            if (r0 == 0) goto L_0x0009
            boolean r2 = r0.m317b(r2)
            return r2
        L_0x0009:
            r1.f3399b = r2
            r2 = 0
            return r2
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public boolean mo46a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, int r3) {
            r0 = this;
            r0.mo321b(r1, r2, r3)
            com.google.android.material.appbar.d r1 = r0.f3398a
            if (r1 != 0) goto L_0x000e
            com.google.android.material.appbar.d r1 = new com.google.android.material.appbar.d
            r1.<init>(r2)
            r0.f3398a = r1
        L_0x000e:
            com.google.android.material.appbar.d r1 = r0.f3398a
            r1.m318b()
            int r1 = r0.f3399b
            r2 = 0
            if (r1 == 0) goto L_0x001f
            com.google.android.material.appbar.d r3 = r0.f3398a
            r3.m317b(r1)
            r0.f3399b = r2
        L_0x001f:
            int r1 = r0.f3400c
            if (r1 == 0) goto L_0x002a
            com.google.android.material.appbar.d r3 = r0.f3398a
            r3.m319a(r1)
            r0.f3400c = r2
        L_0x002a:
            r1 = 1
            return r1
    }

    /* renamed from: b */
    public int m322b() {
            r1 = this;
            com.google.android.material.appbar.d r0 = r1.f3398a
            if (r0 == 0) goto L_0x0009
            int r0 = r0.m320a()
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            return r0
    }

    /* renamed from: b */
    protected void mo321b(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, int r3) {
            r0 = this;
            r1.m1697c(r2, r3)
            return
    }
}
