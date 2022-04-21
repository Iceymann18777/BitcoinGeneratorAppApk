package com.google.android.material.snackbar;

/* renamed from: com.google.android.material.snackbar.a */
/* loaded from: classes.dex */
public class C0988a {

    /* renamed from: a */
    private com.google.android.material.snackbar.C0994f.AbstractC0996b f3626a;

    public C0988a(com.google.android.material.behavior.SwipeDismissBehavior<?> r2) {
            r1 = this;
            r1.<init>()
            r0 = 1036831949(0x3dcccccd, float:0.1)
            r2.m305b(r0)
            r0 = 1058642330(0x3f19999a, float:0.6)
            r2.m310a(r0)
            r0 = 0
            r2.m308a(r0)
            return
    }

    /* renamed from: a */
    public void m58a(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.MotionEvent r4) {
            r1 = this;
            int r0 = r4.getActionMasked()
            if (r0 == 0) goto L_0x0017
            r2 = 1
            if (r0 == r2) goto L_0x000d
            r2 = 3
            if (r0 == r2) goto L_0x000d
            goto L_0x0030
        L_0x000d:
            com.google.android.material.snackbar.f r2 = com.google.android.material.snackbar.C0994f.m55a()
            com.google.android.material.snackbar.f$b r3 = r1.f3626a
            r2.m51b(r3)
            goto L_0x0030
        L_0x0017:
            float r0 = r4.getX()
            int r0 = (int) r0
            float r4 = r4.getY()
            int r4 = (int) r4
            boolean r2 = r2.m1718a(r3, r0, r4)
            if (r2 == 0) goto L_0x0030
            com.google.android.material.snackbar.f r2 = com.google.android.material.snackbar.C0994f.m55a()
            com.google.android.material.snackbar.f$b r3 = r1.f3626a
            r2.m54a(r3)
        L_0x0030:
            return
    }

    /* renamed from: a */
    public boolean m59a(android.view.View r1) {
            r0 = this;
            boolean r1 = r1 instanceof com.google.android.material.snackbar.C0991d
            return r1
    }
}
