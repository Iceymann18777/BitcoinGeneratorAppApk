package p000a.p038k.p039a.p040a;

/* renamed from: a.k.a.a.d  reason: invalid class name */
/* loaded from: classes.dex */
abstract class AbstractanimationInterpolatorC0308d implements android.view.animation.Interpolator {

    /* renamed from: a */
    private final float[] f1001a;

    /* renamed from: b */
    private final float f1002b;

    protected AbstractanimationInterpolatorC0308d(float[] r2) {
            r1 = this;
            r1.<init>()
            r1.f1001a = r2
            float[] r2 = r1.f1001a
            int r2 = r2.length
            int r2 = r2 + (-1)
            float r2 = (float) r2
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 / r2
            r1.f1002b = r0
            return
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float r5) {
            r4 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 < 0) goto L_0x0007
            return r0
        L_0x0007:
            r0 = 0
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 > 0) goto L_0x000d
            return r0
        L_0x000d:
            float[] r0 = r4.f1001a
            int r1 = r0.length
            int r1 = r1 + (-1)
            float r1 = (float) r1
            float r1 = r1 * r5
            int r1 = (int) r1
            int r0 = r0.length
            int r0 = r0 + (-2)
            int r0 = java.lang.Math.min(r1, r0)
            float r1 = (float) r0
            float r2 = r4.f1002b
            float r1 = r1 * r2
            float r5 = r5 - r1
            float r5 = r5 / r2
            float[] r1 = r4.f1001a
            r2 = r1[r0]
            int r3 = r0 + 1
            r3 = r1[r3]
            r0 = r1[r0]
            float r3 = r3 - r0
            float r5 = r5 * r3
            float r2 = r2 + r5
            return r2
    }
}
