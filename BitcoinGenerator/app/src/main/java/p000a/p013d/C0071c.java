package p000a.p013d;

/* renamed from: a.d.c */
/* loaded from: classes.dex */
class C0071c {

    /* renamed from: a */
    static final int[] f227a = null;

    /* renamed from: b */
    static final long[] f228b = null;

    /* renamed from: c */
    static final java.lang.Object[] f229c = null;

    static {
            r0 = 0
            int[] r1 = new int[r0]
            p000a.p013d.C0071c.f227a = r1
            long[] r1 = new long[r0]
            p000a.p013d.C0071c.f228b = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            p000a.p013d.C0071c.f229c = r0
            return
    }

    /* renamed from: a */
    public static int m4068a(int r2) {
            r0 = 4
        L_0x0001:
            r1 = 32
            if (r0 >= r1) goto L_0x000f
            r1 = 1
            int r1 = r1 << r0
            int r1 = r1 + (-12)
            if (r2 > r1) goto L_0x000c
            return r1
        L_0x000c:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x000f:
            return r2
    }

    /* renamed from: a */
    static int m4066a(int[] r3, int r4, int r5) {
            int r4 = r4 + (-1)
            r0 = 0
        L_0x0003:
            if (r0 > r4) goto L_0x0018
            int r1 = r0 + r4
            int r1 = r1 >>> 1
            r2 = r3[r1]
            if (r2 >= r5) goto L_0x0011
            int r1 = r1 + 1
            r0 = r1
            goto L_0x0003
        L_0x0011:
            if (r2 <= r5) goto L_0x0017
            int r1 = r1 + (-1)
            r4 = r1
            goto L_0x0003
        L_0x0017:
            return r1
        L_0x0018:
            r3 = r0 ^ (-1)
            return r3
    }

    /* renamed from: a */
    static int m4065a(long[] r5, int r6, long r7) {
            int r6 = r6 + (-1)
            r0 = 0
        L_0x0003:
            if (r0 > r6) goto L_0x001c
            int r1 = r0 + r6
            int r1 = r1 >>> 1
            r2 = r5[r1]
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0013
            int r1 = r1 + 1
            r0 = r1
            goto L_0x0003
        L_0x0013:
            int r6 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x001b
            int r1 = r1 + (-1)
            r6 = r1
            goto L_0x0003
        L_0x001b:
            return r1
        L_0x001c:
            r5 = r0 ^ (-1)
            return r5
    }

    /* renamed from: a */
    public static boolean m4067a(java.lang.Object r0, java.lang.Object r1) {
            if (r0 == r1) goto L_0x000d
            if (r0 == 0) goto L_0x000b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            r0 = 0
            goto L_0x000e
        L_0x000d:
            r0 = 1
        L_0x000e:
            return r0
    }

    /* renamed from: b */
    public static int m4064b(int r0) {
            int r0 = r0 * 4
            int r0 = m4068a(r0)
            int r0 = r0 / 4
            return r0
    }

    /* renamed from: c */
    public static int m4063c(int r0) {
            int r0 = r0 * 8
            int r0 = m4068a(r0)
            int r0 = r0 / 8
            return r0
    }
}
