package p000a.p018g.p021e;

/* renamed from: a.g.e.a */
/* loaded from: classes.dex */
public final class C0141a {
    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            return
    }

    /* renamed from: a */
    private static int m3671a(int r0, int r1) {
            int r1 = 255 - r1
            int r0 = 255 - r0
            int r1 = r1 * r0
            int r1 = r1 / 255
            int r0 = 255 - r1
            return r0
    }

    /* renamed from: a */
    private static int m3670a(int r0, int r1, int r2, int r3, int r4) {
            if (r4 != 0) goto L_0x0004
            r0 = 0
            return r0
        L_0x0004:
            int r0 = r0 * 255
            int r0 = r0 * r1
            int r2 = r2 * r3
            int r1 = 255 - r1
            int r2 = r2 * r1
            int r0 = r0 + r2
            int r4 = r4 * 255
            int r0 = r0 / r4
            return r0
    }

    /* renamed from: b */
    public static int m3669b(int r6, int r7) {
            int r0 = android.graphics.Color.alpha(r7)
            int r1 = android.graphics.Color.alpha(r6)
            int r2 = m3671a(r1, r0)
            int r3 = android.graphics.Color.red(r6)
            int r4 = android.graphics.Color.red(r7)
            int r3 = m3670a(r3, r1, r4, r0, r2)
            int r4 = android.graphics.Color.green(r6)
            int r5 = android.graphics.Color.green(r7)
            int r4 = m3670a(r4, r1, r5, r0, r2)
            int r6 = android.graphics.Color.blue(r6)
            int r7 = android.graphics.Color.blue(r7)
            int r6 = m3670a(r6, r1, r7, r0, r2)
            int r6 = android.graphics.Color.argb(r2, r3, r4, r6)
            return r6
    }

    /* renamed from: c */
    public static int m3668c(int r1, int r2) {
            if (r2 < 0) goto L_0x000e
            r0 = 255(0xff, float:3.57E-43)
            if (r2 > r0) goto L_0x000e
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r0
            int r2 = r2 << 24
            r1 = r1 | r2
            return r1
        L_0x000e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "alpha must be between 0 and 255."
            r1.<init>(r2)
            throw r1
    }
}
