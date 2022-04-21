package com.google.android.material.internal;

/* renamed from: com.google.android.material.internal.i */
/* loaded from: classes.dex */
public final class C0978i {

    /* renamed from: a */
    private final java.util.ArrayList<com.google.android.material.internal.C0978i.C0980b> f3602a;

    /* renamed from: b */
    private com.google.android.material.internal.C0978i.C0980b f3603b;

    /* renamed from: c */
    android.animation.ValueAnimator f3604c;

    /* renamed from: d */
    private final android.animation.Animator.AnimatorListener f3605d;

    /* renamed from: com.google.android.material.internal.i$a */
    /* loaded from: classes.dex */
    class C0979a extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ com.google.android.material.internal.C0978i f3606a;

        C0979a(com.google.android.material.internal.C0978i r1) {
                r0 = this;
                r0.f3606a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r3) {
                r2 = this;
                com.google.android.material.internal.i r0 = r2.f3606a
                android.animation.ValueAnimator r1 = r0.f3604c
                if (r1 != r3) goto L_0x0009
                r3 = 0
                r0.f3604c = r3
            L_0x0009:
                return
        }
    }

    /* renamed from: com.google.android.material.internal.i$b */
    /* loaded from: classes.dex */
    static class C0980b {

        /* renamed from: a */
        final int[] f3607a;

        /* renamed from: b */
        final android.animation.ValueAnimator f3608b;

        C0980b(int[] r1, android.animation.ValueAnimator r2) {
                r0 = this;
                r0.<init>()
                r0.f3607a = r1
                r0.f3608b = r2
                return
        }
    }

    public C0978i() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3602a = r0
            r0 = 0
            r1.f3603b = r0
            r1.f3604c = r0
            com.google.android.material.internal.i$a r0 = new com.google.android.material.internal.i$a
            r0.<init>(r1)
            r1.f3605d = r0
            return
    }

    /* renamed from: a */
    private void m84a(com.google.android.material.internal.C0978i.C0980b r1) {
            r0 = this;
            android.animation.ValueAnimator r1 = r1.f3608b
            r0.f3604c = r1
            android.animation.ValueAnimator r1 = r0.f3604c
            r1.start()
            return
    }

    /* renamed from: b */
    private void m81b() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.f3604c
            if (r0 == 0) goto L_0x000a
            r0.cancel()
            r0 = 0
            r1.f3604c = r0
        L_0x000a:
            return
    }

    /* renamed from: a */
    public void m85a() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.f3604c
            if (r0 == 0) goto L_0x000a
            r0.end()
            r0 = 0
            r1.f3604c = r0
        L_0x000a:
            return
    }

    /* renamed from: a */
    public void m83a(int[] r5) {
            r4 = this;
            java.util.ArrayList<com.google.android.material.internal.i$b> r0 = r4.f3602a
            int r0 = r0.size()
            r1 = 0
        L_0x0007:
            if (r1 >= r0) goto L_0x001d
            java.util.ArrayList<com.google.android.material.internal.i$b> r2 = r4.f3602a
            java.lang.Object r2 = r2.get(r1)
            com.google.android.material.internal.i$b r2 = (com.google.android.material.internal.C0978i.C0980b) r2
            int[] r3 = r2.f3607a
            boolean r3 = android.util.StateSet.stateSetMatches(r3, r5)
            if (r3 == 0) goto L_0x001a
            goto L_0x001e
        L_0x001a:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x001d:
            r2 = 0
        L_0x001e:
            com.google.android.material.internal.i$b r5 = r4.f3603b
            if (r2 != r5) goto L_0x0023
            return
        L_0x0023:
            if (r5 == 0) goto L_0x0028
            r4.m81b()
        L_0x0028:
            r4.f3603b = r2
            if (r2 == 0) goto L_0x002f
            r4.m84a(r2)
        L_0x002f:
            return
    }

    /* renamed from: a */
    public void m82a(int[] r2, android.animation.ValueAnimator r3) {
            r1 = this;
            com.google.android.material.internal.i$b r0 = new com.google.android.material.internal.i$b
            r0.<init>(r2, r3)
            android.animation.Animator$AnimatorListener r2 = r1.f3605d
            r3.addListener(r2)
            java.util.ArrayList<com.google.android.material.internal.i$b> r2 = r1.f3602a
            r2.add(r0)
            return
    }
}
