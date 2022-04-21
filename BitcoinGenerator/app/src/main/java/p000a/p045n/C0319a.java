package p000a.p045n;

/* renamed from: a.n.a */
/* loaded from: classes.dex */
class C0319a {

    /* renamed from: a.n.a$a */
    /* loaded from: classes.dex */
    interface AbstractC0320a {
        void onAnimationPause(android.animation.Animator r1);

        void onAnimationResume(android.animation.Animator r1);
    }

    /* renamed from: a */
    static void m2935a(android.animation.Animator r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x000a
            r5.pause()
            goto L_0x0029
        L_0x000a:
            java.util.ArrayList r0 = r5.getListeners()
            if (r0 == 0) goto L_0x0029
            r1 = 0
            int r2 = r0.size()
        L_0x0015:
            if (r1 >= r2) goto L_0x0029
            java.lang.Object r3 = r0.get(r1)
            android.animation.Animator$AnimatorListener r3 = (android.animation.Animator.AnimatorListener) r3
            boolean r4 = r3 instanceof p000a.p045n.C0319a.AbstractC0320a
            if (r4 == 0) goto L_0x0026
            a.n.a$a r3 = (p000a.p045n.C0319a.AbstractC0320a) r3
            r3.onAnimationPause(r5)
        L_0x0026:
            int r1 = r1 + 1
            goto L_0x0015
        L_0x0029:
            return
    }

    /* renamed from: a */
    static void m2934a(android.animation.Animator r2, android.animation.AnimatorListenerAdapter r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x0009
            r2.addPauseListener(r3)
        L_0x0009:
            return
    }

    /* renamed from: b */
    static void m2933b(android.animation.Animator r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x000a
            r5.resume()
            goto L_0x0029
        L_0x000a:
            java.util.ArrayList r0 = r5.getListeners()
            if (r0 == 0) goto L_0x0029
            r1 = 0
            int r2 = r0.size()
        L_0x0015:
            if (r1 >= r2) goto L_0x0029
            java.lang.Object r3 = r0.get(r1)
            android.animation.Animator$AnimatorListener r3 = (android.animation.Animator.AnimatorListener) r3
            boolean r4 = r3 instanceof p000a.p045n.C0319a.AbstractC0320a
            if (r4 == 0) goto L_0x0026
            a.n.a$a r3 = (p000a.p045n.C0319a.AbstractC0320a) r3
            r3.onAnimationResume(r5)
        L_0x0026:
            int r1 = r1 + 1
            goto L_0x0015
        L_0x0029:
            return
    }
}
