package p000a.p018g.p019d.p020c;

/* renamed from: a.g.d.c.e */
/* loaded from: classes.dex */
final class C0135e {
    /* renamed from: a */
    public static int m3690a(int r1) {
            r0 = 4
            if (r1 > r0) goto L_0x0006
            r1 = 8
            goto L_0x0008
        L_0x0006:
            int r1 = r1 * 2
        L_0x0008:
            return r1
    }

    /* renamed from: a */
    public static int[] m3689a(int[] r2, int r3, int r4) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 <= r1) goto L_0x0010
            int r0 = m3690a(r3)
            int[] r0 = new int[r0]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            r2 = r0
        L_0x0010:
            r2[r3] = r4
            return r2
    }

    /* renamed from: a */
    public static <T> T[] m3688a(T[] r2, int r3, T r4) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 <= r1) goto L_0x001c
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r0 = r0.getComponentType()
            int r1 = m3690a(r3)
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            r2 = r0
        L_0x001c:
            r2[r3] = r4
            return r2
    }
}
