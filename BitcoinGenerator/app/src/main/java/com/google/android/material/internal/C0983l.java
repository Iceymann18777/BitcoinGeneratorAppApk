package com.google.android.material.internal;

/* renamed from: com.google.android.material.internal.l */
/* loaded from: classes.dex */
public class C0983l extends android.widget.ImageButton {

    /* renamed from: b */
    private int f3611b;

    /* renamed from: a */
    public final void m70a(int r1, boolean r2) {
            r0 = this;
            super.setVisibility(r1)
            if (r2 == 0) goto L_0x0007
            r0.f3611b = r1
        L_0x0007:
            return
    }

    public final int getUserSetVisibility() {
            r1 = this;
            int r0 = r1.f3611b
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int r2) {
            r1 = this;
            r0 = 1
            r1.m70a(r2, r0)
            return
    }
}
