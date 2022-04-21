package p050b.p051a.p052a.p053a.p054j;

/* renamed from: b.a.a.a.j.h */
/* loaded from: classes.dex */
public class C0884h {

    /* renamed from: a */
    private final p000a.p013d.C0080g<java.lang.String, p050b.p051a.p052a.p053a.p054j.C0885i> f3293a;

    public C0884h() {
            r1 = this;
            r1.<init>()
            a.d.g r0 = new a.d.g
            r0.<init>()
            r1.f3293a = r0
            return
    }

    /* renamed from: a */
    public static p050b.p051a.p052a.p053a.p054j.C0884h m472a(android.content.Context r3, int r4) {
            r0 = 0
            android.animation.Animator r3 = android.animation.AnimatorInflater.loadAnimator(r3, r4)     // Catch: Exception -> 0x0024
            boolean r1 = r3 instanceof android.animation.AnimatorSet     // Catch: Exception -> 0x0024
            if (r1 == 0) goto L_0x0014
            android.animation.AnimatorSet r3 = (android.animation.AnimatorSet) r3     // Catch: Exception -> 0x0024
            java.util.ArrayList r3 = r3.getChildAnimations()     // Catch: Exception -> 0x0024
            b.a.a.a.j.h r3 = m468a(r3)     // Catch: Exception -> 0x0024
            return r3
        L_0x0014:
            if (r3 == 0) goto L_0x0023
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: Exception -> 0x0024
            r1.<init>()     // Catch: Exception -> 0x0024
            r1.add(r3)     // Catch: Exception -> 0x0024
            b.a.a.a.j.h r3 = m468a(r1)     // Catch: Exception -> 0x0024
            return r3
        L_0x0023:
            return r0
        L_0x0024:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Can't load animation resource ID #0x"
            r1.append(r2)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "MotionSpec"
            android.util.Log.w(r1, r4, r3)
            return r0
    }

    /* renamed from: a */
    private static p050b.p051a.p052a.p053a.p054j.C0884h m468a(java.util.List<android.animation.Animator> r4) {
            b.a.a.a.j.h r0 = new b.a.a.a.j.h
            r0.<init>()
            int r1 = r4.size()
            r2 = 0
        L_0x000a:
            if (r2 >= r1) goto L_0x0018
            java.lang.Object r3 = r4.get(r2)
            android.animation.Animator r3 = (android.animation.Animator) r3
            m471a(r0, r3)
            int r2 = r2 + 1
            goto L_0x000a
        L_0x0018:
            return r0
    }

    /* renamed from: a */
    private static void m471a(p050b.p051a.p052a.p053a.p054j.C0884h r2, android.animation.Animator r3) {
            boolean r0 = r3 instanceof android.animation.ObjectAnimator
            if (r0 == 0) goto L_0x0012
            android.animation.ObjectAnimator r3 = (android.animation.ObjectAnimator) r3
            java.lang.String r0 = r3.getPropertyName()
            b.a.a.a.j.i r3 = p050b.p051a.p052a.p053a.p054j.C0885i.m464a(r3)
            r2.m469a(r0, r3)
            return
        L_0x0012:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Animator must be an ObjectAnimator: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: a */
    public long m473a() {
            r9 = this;
            a.d.g<java.lang.String, b.a.a.a.j.i> r0 = r9.f3293a
            int r0 = r0.size()
            r1 = 0
            r3 = 0
        L_0x0009:
            if (r3 >= r0) goto L_0x0023
            a.d.g<java.lang.String, b.a.a.a.j.i> r4 = r9.f3293a
            java.lang.Object r4 = r4.m4013d(r3)
            b.a.a.a.j.i r4 = (p050b.p051a.p052a.p053a.p054j.C0885i) r4
            long r5 = r4.m466a()
            long r7 = r4.m463b()
            long r5 = r5 + r7
            long r1 = java.lang.Math.max(r1, r5)
            int r3 = r3 + 1
            goto L_0x0009
        L_0x0023:
            return r1
    }

    /* renamed from: a */
    public p050b.p051a.p052a.p053a.p054j.C0885i m470a(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.m467b(r2)
            if (r0 == 0) goto L_0x000f
            a.d.g<java.lang.String, b.a.a.a.j.i> r0 = r1.f3293a
            java.lang.Object r2 = r0.get(r2)
            b.a.a.a.j.i r2 = (p050b.p051a.p052a.p053a.p054j.C0885i) r2
            return r2
        L_0x000f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    /* renamed from: a */
    public void m469a(java.lang.String r2, p050b.p051a.p052a.p053a.p054j.C0885i r3) {
            r1 = this;
            a.d.g<java.lang.String, b.a.a.a.j.i> r0 = r1.f3293a
            r0.put(r2, r3)
            return
    }

    /* renamed from: b */
    public boolean m467b(java.lang.String r2) {
            r1 = this;
            a.d.g<java.lang.String, b.a.a.a.j.i> r0 = r1.f3293a
            java.lang.Object r2 = r0.get(r2)
            if (r2 == 0) goto L_0x000a
            r2 = 1
            goto L_0x000b
        L_0x000a:
            r2 = 0
        L_0x000b:
            return r2
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L_0x0004
            r3 = 1
            return r3
        L_0x0004:
            if (r3 == 0) goto L_0x001a
            java.lang.Class<b.a.a.a.j.h> r0 = p050b.p051a.p052a.p053a.p054j.C0884h.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto L_0x000f
            goto L_0x001a
        L_0x000f:
            b.a.a.a.j.h r3 = (p050b.p051a.p052a.p053a.p054j.C0884h) r3
            a.d.g<java.lang.String, b.a.a.a.j.i> r0 = r2.f3293a
            a.d.g<java.lang.String, b.a.a.a.j.i> r3 = r3.f3293a
            boolean r3 = r0.equals(r3)
            return r3
        L_0x001a:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r1 = this;
            a.d.g<java.lang.String, b.a.a.a.j.i> r0 = r1.f3293a
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 10
            r0.append(r1)
            java.lang.Class<b.a.a.a.j.h> r1 = p050b.p051a.p052a.p053a.p054j.C0884h.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " timings: "
            r0.append(r1)
            a.d.g<java.lang.String, b.a.a.a.j.i> r1 = r2.f3293a
            r0.append(r1)
            java.lang.String r1 = "}\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
