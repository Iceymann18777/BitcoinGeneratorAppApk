package com.google.android.material.appbar;

/* renamed from: com.google.android.material.appbar.e */
/* loaded from: classes.dex */
class C0925e {
    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16843848(0x1010448, float:2.369663E-38)
            r0[r1] = r2
            return
    }

    /* renamed from: a */
    static void m315a(android.view.View r11, float r12) {
            android.content.res.Resources r0 = r11.getResources()
            int r1 = p050b.p051a.p052a.p053a.C0873f.app_bar_elevation_anim_duration
            int r0 = r0.getInteger(r1)
            android.animation.StateListAnimator r1 = new android.animation.StateListAnimator
            r1.<init>()
            r2 = 3
            int[] r2 = new int[r2]
            r3 = 16842766(0x101000e, float:2.3693597E-38)
            r4 = 0
            r2[r4] = r3
            int r5 = p050b.p051a.p052a.p053a.C0869b.state_liftable
            r6 = 1
            r2[r6] = r5
            int r5 = p050b.p051a.p052a.p053a.C0869b.state_lifted
            int r5 = -r5
            r7 = 2
            r2[r7] = r5
            float[] r5 = new float[r6]
            r7 = 0
            r5[r4] = r7
            java.lang.String r8 = "elevation"
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r11, r8, r5)
            long r9 = (long) r0
            android.animation.ObjectAnimator r0 = r5.setDuration(r9)
            r1.addState(r2, r0)
            int[] r0 = new int[r6]
            r0[r4] = r3
            float[] r2 = new float[r6]
            r2[r4] = r12
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofFloat(r11, r8, r2)
            android.animation.ObjectAnimator r12 = r12.setDuration(r9)
            r1.addState(r0, r12)
            int[] r12 = new int[r4]
            float[] r0 = new float[r6]
            r0[r4] = r7
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r11, r8, r0)
            r2 = 0
            android.animation.ObjectAnimator r0 = r0.setDuration(r2)
            r1.addState(r12, r0)
            r11.setStateListAnimator(r1)
            return
    }
}
