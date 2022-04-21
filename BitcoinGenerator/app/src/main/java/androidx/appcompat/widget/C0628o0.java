package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.o0 */
/* loaded from: classes.dex */
class C0628o0 {

    /* renamed from: a */
    private static final java.lang.ThreadLocal<android.util.TypedValue> f2253a = null;

    /* renamed from: b */
    static final int[] f2254b = null;

    /* renamed from: c */
    static final int[] f2255c = null;

    /* renamed from: d */
    static final int[] f2256d = null;

    /* renamed from: e */
    static final int[] f2257e = null;

    /* renamed from: f */
    static final int[] f2258f = null;

    /* renamed from: g */
    private static final int[] f2259g = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.appcompat.widget.C0628o0.f2253a = r0
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            r3 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r1[r2] = r3
            androidx.appcompat.widget.C0628o0.f2254b = r1
            int[] r1 = new int[r0]
            r3 = 16842908(0x101009c, float:2.3693995E-38)
            r1[r2] = r3
            androidx.appcompat.widget.C0628o0.f2255c = r1
            int[] r1 = new int[r0]
            r3 = 16843518(0x10102fe, float:2.3695705E-38)
            r1[r2] = r3
            int[] r1 = new int[r0]
            r3 = 16842919(0x10100a7, float:2.3694026E-38)
            r1[r2] = r3
            androidx.appcompat.widget.C0628o0.f2256d = r1
            int[] r1 = new int[r0]
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            r1[r2] = r3
            androidx.appcompat.widget.C0628o0.f2257e = r1
            int[] r1 = new int[r0]
            r3 = 16842913(0x10100a1, float:2.369401E-38)
            r1[r2] = r3
            int[] r1 = new int[r2]
            androidx.appcompat.widget.C0628o0.f2258f = r1
            int[] r0 = new int[r0]
            androidx.appcompat.widget.C0628o0.f2259g = r0
            return
    }

    /* renamed from: a */
    public static int m1921a(android.content.Context r4, int r5) {
            android.content.res.ColorStateList r0 = m1918c(r4, r5)
            if (r0 == 0) goto L_0x0017
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L_0x0017
            int[] r4 = androidx.appcompat.widget.C0628o0.f2254b
            int r5 = r0.getDefaultColor()
            int r4 = r0.getColorForState(r4, r5)
            return r4
        L_0x0017:
            android.util.TypedValue r0 = m1922a()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 16842803(0x1010033, float:2.36937E-38)
            r3 = 1
            r1.resolveAttribute(r2, r0, r3)
            float r0 = r0.getFloat()
            int r4 = m1920a(r4, r5, r0)
            return r4
    }

    /* renamed from: a */
    static int m1920a(android.content.Context r0, int r1, float r2) {
            int r0 = m1919b(r0, r1)
            int r1 = android.graphics.Color.alpha(r0)
            float r1 = (float) r1
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            int r0 = p000a.p018g.p021e.C0141a.m3668c(r0, r1)
            return r0
    }

    /* renamed from: a */
    private static android.util.TypedValue m1922a() {
            java.lang.ThreadLocal<android.util.TypedValue> r0 = androidx.appcompat.widget.C0628o0.f2253a
            java.lang.Object r0 = r0.get()
            android.util.TypedValue r0 = (android.util.TypedValue) r0
            if (r0 != 0) goto L_0x0014
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            java.lang.ThreadLocal<android.util.TypedValue> r1 = androidx.appcompat.widget.C0628o0.f2253a
            r1.set(r0)
        L_0x0014:
            return r0
    }

    /* renamed from: b */
    public static int m1919b(android.content.Context r2, int r3) {
            int[] r0 = androidx.appcompat.widget.C0628o0.f2259g
            r1 = 0
            r0[r1] = r3
            r3 = 0
            androidx.appcompat.widget.t0 r2 = androidx.appcompat.widget.C0638t0.m1901a(r2, r3, r0)
            int r3 = r2.m1905a(r1, r1)     // Catch: all -> 0x0012
            r2.m1908a()
            return r3
        L_0x0012:
            r3 = move-exception
            r2.m1908a()
            throw r3
    }

    /* renamed from: c */
    public static android.content.res.ColorStateList m1918c(android.content.Context r2, int r3) {
            int[] r0 = androidx.appcompat.widget.C0628o0.f2259g
            r1 = 0
            r0[r1] = r3
            r3 = 0
            androidx.appcompat.widget.t0 r2 = androidx.appcompat.widget.C0638t0.m1901a(r2, r3, r0)
            android.content.res.ColorStateList r3 = r2.m1907a(r1)     // Catch: all -> 0x0012
            r2.m1908a()
            return r3
        L_0x0012:
            r3 = move-exception
            r2.m1908a()
            throw r3
    }
}
