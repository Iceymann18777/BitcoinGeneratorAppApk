package p050b.p051a.p052a.p053a.p059n;

/* renamed from: b.a.a.a.n.a */
/* loaded from: classes.dex */
public final class C0905a {
    /* renamed from: a */
    public static float m405a(float r1, float r2, float r3) {
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r3
            float r0 = r0 * r1
            float r3 = r3 * r2
            float r0 = r0 + r3
            return r0
    }

    /* renamed from: a */
    public static float m404a(float r0, float r1, float r2, float r3) {
            float r2 = r2 - r0
            float r3 = r3 - r1
            double r0 = (double) r2
            double r2 = (double) r3
            double r0 = java.lang.Math.hypot(r0, r2)
            float r0 = (float) r0
            return r0
    }

    /* renamed from: a */
    public static float m403a(float r1, float r2, float r3, float r4, float r5, float r6) {
            float r0 = m404a(r1, r2, r3, r4)
            float r4 = m404a(r1, r2, r5, r4)
            float r5 = m404a(r1, r2, r5, r6)
            float r1 = m404a(r1, r2, r3, r6)
            float r1 = m402b(r0, r4, r5, r1)
            return r1
    }

    /* renamed from: b */
    private static float m402b(float r1, float r2, float r3, float r4) {
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x000d
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x000d
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x000d
            goto L_0x001e
        L_0x000d:
            int r1 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0017
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x0017
            r1 = r2
            goto L_0x001e
        L_0x0017:
            int r1 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x001d
            r1 = r3
            goto L_0x001e
        L_0x001d:
            r1 = r4
        L_0x001e:
            return r1
    }
}
