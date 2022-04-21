package p050b.p051a.p052a.p053a.p054j;

/* renamed from: b.a.a.a.j.i */
/* loaded from: classes.dex */
public class C0885i {

    /* renamed from: a */
    private long f3294a;

    /* renamed from: b */
    private long f3295b;

    /* renamed from: c */
    private android.animation.TimeInterpolator f3296c;

    /* renamed from: d */
    private int f3297d;

    /* renamed from: e */
    private int f3298e;

    public C0885i(long r3, long r5) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f3294a = r0
            r0 = 300(0x12c, double:1.48E-321)
            r2.f3295b = r0
            r0 = 0
            r2.f3296c = r0
            r0 = 0
            r2.f3297d = r0
            r0 = 1
            r2.f3298e = r0
            r2.f3294a = r3
            r2.f3295b = r5
            return
    }

    public C0885i(long r3, long r5, android.animation.TimeInterpolator r7) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f3294a = r0
            r0 = 300(0x12c, double:1.48E-321)
            r2.f3295b = r0
            r0 = 0
            r2.f3296c = r0
            r0 = 0
            r2.f3297d = r0
            r0 = 1
            r2.f3298e = r0
            r2.f3294a = r3
            r2.f3295b = r5
            r2.f3296c = r7
            return
    }

    /* renamed from: a */
    static p050b.p051a.p052a.p053a.p054j.C0885i m464a(android.animation.ValueAnimator r7) {
            b.a.a.a.j.i r6 = new b.a.a.a.j.i
            long r1 = r7.getStartDelay()
            long r3 = r7.getDuration()
            android.animation.TimeInterpolator r5 = m462b(r7)
            r0 = r6
            r0.<init>(r1, r3, r5)
            int r0 = r7.getRepeatCount()
            r6.f3297d = r0
            int r7 = r7.getRepeatMode()
            r6.f3298e = r7
            return r6
    }

    /* renamed from: b */
    private static android.animation.TimeInterpolator m462b(android.animation.ValueAnimator r1) {
            android.animation.TimeInterpolator r1 = r1.getInterpolator()
            boolean r0 = r1 instanceof android.view.animation.AccelerateDecelerateInterpolator
            if (r0 != 0) goto L_0x0019
            if (r1 != 0) goto L_0x000b
            goto L_0x0019
        L_0x000b:
            boolean r0 = r1 instanceof android.view.animation.AccelerateInterpolator
            if (r0 == 0) goto L_0x0012
            android.animation.TimeInterpolator r1 = p050b.p051a.p052a.p053a.p054j.C0877a.f3282b
            return r1
        L_0x0012:
            boolean r0 = r1 instanceof android.view.animation.DecelerateInterpolator
            if (r0 == 0) goto L_0x0018
            android.animation.TimeInterpolator r1 = p050b.p051a.p052a.p053a.p054j.C0877a.f3283c
        L_0x0018:
            return r1
        L_0x0019:
            android.animation.TimeInterpolator r1 = p050b.p051a.p052a.p053a.p054j.C0877a.f3281a
            return r1
    }

    /* renamed from: a */
    public long m466a() {
            r2 = this;
            long r0 = r2.f3294a
            return r0
    }

    /* renamed from: a */
    public void m465a(android.animation.Animator r3) {
            r2 = this;
            long r0 = r2.m466a()
            r3.setStartDelay(r0)
            long r0 = r2.m463b()
            r3.setDuration(r0)
            android.animation.TimeInterpolator r0 = r2.m461c()
            r3.setInterpolator(r0)
            boolean r0 = r3 instanceof android.animation.ValueAnimator
            if (r0 == 0) goto L_0x0029
            android.animation.ValueAnimator r3 = (android.animation.ValueAnimator) r3
            int r0 = r2.m460d()
            r3.setRepeatCount(r0)
            int r0 = r2.m459e()
            r3.setRepeatMode(r0)
        L_0x0029:
            return
    }

    /* renamed from: b */
    public long m463b() {
            r2 = this;
            long r0 = r2.f3295b
            return r0
    }

    /* renamed from: c */
    public android.animation.TimeInterpolator m461c() {
            r1 = this;
            android.animation.TimeInterpolator r0 = r1.f3296c
            if (r0 == 0) goto L_0x0005
            goto L_0x0007
        L_0x0005:
            android.animation.TimeInterpolator r0 = p050b.p051a.p052a.p053a.p054j.C0877a.f3281a
        L_0x0007:
            return r0
    }

    /* renamed from: d */
    public int m460d() {
            r1 = this;
            int r0 = r1.f3297d
            return r0
    }

    /* renamed from: e */
    public int m459e() {
            r1 = this;
            int r0 = r1.f3298e
            return r0
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            if (r6 != r7) goto L_0x0004
            r7 = 1
            return r7
        L_0x0004:
            r0 = 0
            if (r7 == 0) goto L_0x0057
            java.lang.Class<b.a.a.a.j.i> r1 = p050b.p051a.p052a.p053a.p054j.C0885i.class
            java.lang.Class r2 = r7.getClass()
            if (r1 == r2) goto L_0x0010
            goto L_0x0057
        L_0x0010:
            b.a.a.a.j.i r7 = (p050b.p051a.p052a.p053a.p054j.C0885i) r7
            long r1 = r6.m466a()
            long r3 = r7.m466a()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x001f
            return r0
        L_0x001f:
            long r1 = r6.m463b()
            long r3 = r7.m463b()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x002c
            return r0
        L_0x002c:
            int r1 = r6.m460d()
            int r2 = r7.m460d()
            if (r1 == r2) goto L_0x0037
            return r0
        L_0x0037:
            int r1 = r6.m459e()
            int r2 = r7.m459e()
            if (r1 == r2) goto L_0x0042
            return r0
        L_0x0042:
            android.animation.TimeInterpolator r0 = r6.m461c()
            java.lang.Class r0 = r0.getClass()
            android.animation.TimeInterpolator r7 = r7.m461c()
            java.lang.Class r7 = r7.getClass()
            boolean r7 = r0.equals(r7)
            return r7
        L_0x0057:
            return r0
    }

    public int hashCode() {
            r7 = this;
            long r0 = r7.m466a()
            long r2 = r7.m466a()
            r4 = 32
            long r2 = r2 >>> r4
            long r0 = r0 ^ r2
            int r1 = (int) r0
            int r1 = r1 * 31
            long r2 = r7.m463b()
            long r5 = r7.m463b()
            long r4 = r5 >>> r4
            long r2 = r2 ^ r4
            int r0 = (int) r2
            int r1 = r1 + r0
            int r1 = r1 * 31
            android.animation.TimeInterpolator r0 = r7.m461c()
            java.lang.Class r0 = r0.getClass()
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r7.m460d()
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r7.m459e()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 10
            r0.append(r1)
            java.lang.Class<b.a.a.a.j.i> r1 = p050b.p051a.p052a.p053a.p054j.C0885i.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r3)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " delay: "
            r0.append(r1)
            long r1 = r3.m466a()
            r0.append(r1)
            java.lang.String r1 = " duration: "
            r0.append(r1)
            long r1 = r3.m463b()
            r0.append(r1)
            java.lang.String r1 = " interpolator: "
            r0.append(r1)
            android.animation.TimeInterpolator r1 = r3.m461c()
            java.lang.Class r1 = r1.getClass()
            r0.append(r1)
            java.lang.String r1 = " repeatCount: "
            r0.append(r1)
            int r1 = r3.m460d()
            r0.append(r1)
            java.lang.String r1 = " repeatMode: "
            r0.append(r1)
            int r1 = r3.m459e()
            r0.append(r1)
            java.lang.String r1 = "}\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
