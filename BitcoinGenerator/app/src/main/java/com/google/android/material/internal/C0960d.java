package com.google.android.material.internal;

/* renamed from: com.google.android.material.internal.d */
/* loaded from: classes.dex */
public class C0960d extends androidx.appcompat.view.menu.C0496h {
    public C0960d(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // androidx.appcompat.view.menu.C0496h, android.view.Menu
    public android.view.SubMenu addSubMenu(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            android.view.MenuItem r1 = r0.m2418a(r1, r2, r3, r4)
            androidx.appcompat.view.menu.k r1 = (androidx.appcompat.view.menu.C0501k) r1
            com.google.android.material.internal.f r2 = new com.google.android.material.internal.f
            android.content.Context r3 = r0.m2388e()
            r2.<init>(r3, r0, r1)
            r1.m2365a(r2)
            return r2
    }
}
