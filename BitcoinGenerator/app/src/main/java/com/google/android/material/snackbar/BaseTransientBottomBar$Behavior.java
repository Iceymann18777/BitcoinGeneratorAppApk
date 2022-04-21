package com.google.android.material.snackbar;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends com.google.android.material.behavior.SwipeDismissBehavior<android.view.View> {

    /* renamed from: k */
    private final com.google.android.material.snackbar.C0988a f3621k;

    public BaseTransientBottomBar$Behavior() {
            r1 = this;
            r1.<init>()
            com.google.android.material.snackbar.a r0 = new com.google.android.material.snackbar.a
            r0.<init>(r1)
            r1.f3621k = r0
            return
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* renamed from: a */
    public boolean mo63a(android.view.View r2) {
            r1 = this;
            com.google.android.material.snackbar.a r0 = r1.f3621k
            boolean r2 = r0.m59a(r2)
            return r2
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public boolean mo62a(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.MotionEvent r4) {
            r1 = this;
            com.google.android.material.snackbar.a r0 = r1.f3621k
            r0.m58a(r2, r3, r4)
            boolean r2 = super.mo62a(r2, r3, r4)
            return r2
    }
}
