package p050b.p051a.p052a.p053a.p061p;

/* renamed from: b.a.a.a.p.a */
/* loaded from: classes.dex */
public class C0907a {

    /* renamed from: a */
    public static final boolean f3344a = false;

    /* renamed from: b */
    private static final int[] f3345b = null;

    /* renamed from: c */
    private static final int[] f3346c = null;

    /* renamed from: d */
    private static final int[] f3347d = null;

    /* renamed from: e */
    private static final int[] f3348e = null;

    /* renamed from: f */
    private static final int[] f3349f = null;

    /* renamed from: g */
    private static final int[] f3350g = null;

    /* renamed from: h */
    private static final int[] f3351h = null;

    /* renamed from: i */
    private static final int[] f3352i = null;

    /* renamed from: j */
    private static final int[] f3353j = null;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 0
            r3 = 21
            if (r0 < r3) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            p050b.p051a.p052a.p053a.p061p.C0907a.f3344a = r0
            int[] r0 = new int[r1]
            r3 = 16842919(0x10100a7, float:2.3694026E-38)
            r0[r2] = r3
            p050b.p051a.p052a.p053a.p061p.C0907a.f3345b = r0
            r0 = 2
            int[] r3 = new int[r0]
            r3 = {x0058: FILL_ARRAY_DATA  , data: [16843623, 16842908} // fill-array
            p050b.p051a.p052a.p053a.p061p.C0907a.f3346c = r3
            int[] r3 = new int[r1]
            r4 = 16842908(0x101009c, float:2.3693995E-38)
            r3[r2] = r4
            p050b.p051a.p052a.p053a.p061p.C0907a.f3347d = r3
            int[] r3 = new int[r1]
            r4 = 16843623(0x1010367, float:2.3696E-38)
            r3[r2] = r4
            p050b.p051a.p052a.p053a.p061p.C0907a.f3348e = r3
            int[] r3 = new int[r0]
            r3 = {x0060: FILL_ARRAY_DATA  , data: [16842913, 16842919} // fill-array
            p050b.p051a.p052a.p053a.p061p.C0907a.f3349f = r3
            r3 = 3
            int[] r3 = new int[r3]
            r3 = {x0068: FILL_ARRAY_DATA  , data: [16842913, 16843623, 16842908} // fill-array
            p050b.p051a.p052a.p053a.p061p.C0907a.f3350g = r3
            int[] r3 = new int[r0]
            r3 = {x0072: FILL_ARRAY_DATA  , data: [16842913, 16842908} // fill-array
            p050b.p051a.p052a.p053a.p061p.C0907a.f3351h = r3
            int[] r0 = new int[r0]
            r0 = {x007a: FILL_ARRAY_DATA  , data: [16842913, 16843623} // fill-array
            p050b.p051a.p052a.p053a.p061p.C0907a.f3352i = r0
            int[] r0 = new int[r1]
            r1 = 16842913(0x10100a1, float:2.369401E-38)
            r0[r2] = r1
            p050b.p051a.p052a.p053a.p061p.C0907a.f3353j = r0
            return
    }

    @android.annotation.TargetApi(21)
    /* renamed from: a */
    private static int m399a(int r2) {
            int r0 = android.graphics.Color.alpha(r2)
            int r0 = r0 * 2
            r1 = 255(0xff, float:3.57E-43)
            int r0 = java.lang.Math.min(r0, r1)
            int r2 = p000a.p018g.p021e.C0141a.m3668c(r2, r0)
            return r2
    }

    /* renamed from: a */
    private static int m397a(android.content.res.ColorStateList r1, int[] r2) {
            if (r1 == 0) goto L_0x000b
            int r0 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r2, r0)
            goto L_0x000c
        L_0x000b:
            r1 = 0
        L_0x000c:
            boolean r2 = p050b.p051a.p052a.p053a.p061p.C0907a.f3344a
            if (r2 == 0) goto L_0x0014
            int r1 = m399a(r1)
        L_0x0014:
            return r1
    }

    /* renamed from: a */
    public static android.content.res.ColorStateList m398a(android.content.res.ColorStateList r6) {
            boolean r0 = p050b.p051a.p052a.p053a.p061p.C0907a.f3344a
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0029
            int[][] r0 = new int[r1]
            int[] r1 = new int[r1]
            int[] r4 = p050b.p051a.p052a.p053a.p061p.C0907a.f3353j
            r0[r3] = r4
            int[] r4 = p050b.p051a.p052a.p053a.p061p.C0907a.f3349f
            int r4 = m397a(r6, r4)
            r1[r3] = r4
            int[] r3 = android.util.StateSet.NOTHING
            r0[r2] = r3
            int[] r3 = p050b.p051a.p052a.p053a.p061p.C0907a.f3345b
            int r6 = m397a(r6, r3)
            r1[r2] = r6
            android.content.res.ColorStateList r6 = new android.content.res.ColorStateList
            r6.<init>(r0, r1)
            return r6
        L_0x0029:
            r0 = 10
            int[][] r4 = new int[r0]
            int[] r0 = new int[r0]
            int[] r5 = p050b.p051a.p052a.p053a.p061p.C0907a.f3349f
            r4[r3] = r5
            int r5 = m397a(r6, r5)
            r0[r3] = r5
            int[] r5 = p050b.p051a.p052a.p053a.p061p.C0907a.f3350g
            r4[r2] = r5
            int r5 = m397a(r6, r5)
            r0[r2] = r5
            int[] r2 = p050b.p051a.p052a.p053a.p061p.C0907a.f3351h
            r4[r1] = r2
            int r2 = m397a(r6, r2)
            r0[r1] = r2
            r1 = 3
            int[] r2 = p050b.p051a.p052a.p053a.p061p.C0907a.f3352i
            r4[r1] = r2
            int r2 = m397a(r6, r2)
            r0[r1] = r2
            r1 = 4
            int[] r2 = p050b.p051a.p052a.p053a.p061p.C0907a.f3353j
            r4[r1] = r2
            r0[r1] = r3
            r1 = 5
            int[] r2 = p050b.p051a.p052a.p053a.p061p.C0907a.f3345b
            r4[r1] = r2
            int r2 = m397a(r6, r2)
            r0[r1] = r2
            r1 = 6
            int[] r2 = p050b.p051a.p052a.p053a.p061p.C0907a.f3346c
            r4[r1] = r2
            int r2 = m397a(r6, r2)
            r0[r1] = r2
            r1 = 7
            int[] r2 = p050b.p051a.p052a.p053a.p061p.C0907a.f3347d
            r4[r1] = r2
            int r2 = m397a(r6, r2)
            r0[r1] = r2
            r1 = 8
            int[] r2 = p050b.p051a.p052a.p053a.p061p.C0907a.f3348e
            r4[r1] = r2
            int r6 = m397a(r6, r2)
            r0[r1] = r6
            r6 = 9
            int[] r1 = android.util.StateSet.NOTHING
            r4[r6] = r1
            r0[r6] = r3
            android.content.res.ColorStateList r6 = new android.content.res.ColorStateList
            r6.<init>(r4, r0)
            return r6
    }
}
