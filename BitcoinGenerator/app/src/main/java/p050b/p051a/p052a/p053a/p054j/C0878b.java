package p050b.p051a.p052a.p053a.p054j;

/* renamed from: b.a.a.a.j.b */
/* loaded from: classes.dex */
public class C0878b {
    /* renamed from: a */
    public static void m483a(android.animation.AnimatorSet r10, java.util.List<android.animation.Animator> r11) {
            int r0 = r11.size()
            r1 = 0
            r2 = 0
            r3 = r2
            r2 = 0
        L_0x0009:
            if (r2 >= r0) goto L_0x0021
            java.lang.Object r5 = r11.get(r2)
            android.animation.Animator r5 = (android.animation.Animator) r5
            long r6 = r5.getStartDelay()
            long r8 = r5.getDuration()
            long r6 = r6 + r8
            long r3 = java.lang.Math.max(r3, r6)
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0021:
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x0036: FILL_ARRAY_DATA  , data: [0, 0} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofInt(r0)
            r0.setDuration(r3)
            r11.add(r1, r0)
            r10.playTogether(r11)
            return
    }
}
