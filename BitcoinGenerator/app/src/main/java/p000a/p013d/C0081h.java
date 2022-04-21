package p000a.p013d;

/* renamed from: a.d.h */
/* loaded from: classes.dex */
public class C0081h<E> implements java.lang.Cloneable {

    /* renamed from: f */
    private static final java.lang.Object f265f = null;

    /* renamed from: b */
    private boolean f266b;

    /* renamed from: c */
    private int[] f267c;

    /* renamed from: d */
    private java.lang.Object[] f268d;

    /* renamed from: e */
    private int f269e;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000a.p013d.C0081h.f265f = r0
            return
    }

    public C0081h() {
            r1 = this;
            r0 = 10
            r1.<init>(r0)
            return
    }

    public C0081h(int r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f266b = r0
            if (r3 != 0) goto L_0x0011
            int[] r3 = p000a.p013d.C0071c.f227a
            r2.f267c = r3
            java.lang.Object[] r3 = p000a.p013d.C0071c.f229c
            r2.f268d = r3
            goto L_0x001d
        L_0x0011:
            int r3 = p000a.p013d.C0071c.m4064b(r3)
            int[] r1 = new int[r3]
            r2.f267c = r1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.f268d = r3
        L_0x001d:
            r2.f269e = r0
            return
    }

    /* renamed from: c */
    private void m4005c() {
            r8 = this;
            int r0 = r8.f269e
            int[] r1 = r8.f267c
            java.lang.Object[] r2 = r8.f268d
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0009:
            if (r4 >= r0) goto L_0x0021
            r6 = r2[r4]
            java.lang.Object r7 = p000a.p013d.C0081h.f265f
            if (r6 == r7) goto L_0x001e
            if (r4 == r5) goto L_0x001c
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L_0x001c:
            int r5 = r5 + 1
        L_0x001e:
            int r4 = r4 + 1
            goto L_0x0009
        L_0x0021:
            r8.f266b = r3
            r8.f269e = r5
            return
    }

    /* renamed from: a */
    public void m4011a() {
            r5 = this;
            int r0 = r5.f269e
            java.lang.Object[] r1 = r5.f268d
            r2 = 0
            r3 = 0
        L_0x0006:
            if (r3 >= r0) goto L_0x000e
            r4 = 0
            r1[r3] = r4
            int r3 = r3 + 1
            goto L_0x0006
        L_0x000e:
            r5.f269e = r2
            r5.f266b = r2
            return
    }

    /* renamed from: a */
    public void m4010a(int r4) {
            r3 = this;
            int[] r0 = r3.f267c
            int r1 = r3.f269e
            int r4 = p000a.p013d.C0071c.m4066a(r0, r1, r4)
            if (r4 < 0) goto L_0x0017
            java.lang.Object[] r0 = r3.f268d
            r1 = r0[r4]
            java.lang.Object r2 = p000a.p013d.C0081h.f265f
            if (r1 == r2) goto L_0x0017
            r0[r4] = r2
            r4 = 1
            r3.f266b = r4
        L_0x0017:
            return
    }

    /* renamed from: a */
    public void m4009a(int r7, E r8) {
            r6 = this;
            int r0 = r6.f269e
            if (r0 == 0) goto L_0x0010
            int[] r1 = r6.f267c
            int r0 = r0 + (-1)
            r0 = r1[r0]
            if (r7 > r0) goto L_0x0010
            r6.m4003c(r7, r8)
            return
        L_0x0010:
            boolean r0 = r6.f266b
            if (r0 == 0) goto L_0x001e
            int r0 = r6.f269e
            int[] r1 = r6.f267c
            int r1 = r1.length
            if (r0 < r1) goto L_0x001e
            r6.m4005c()
        L_0x001e:
            int r0 = r6.f269e
            int[] r1 = r6.f267c
            int r1 = r1.length
            if (r0 < r1) goto L_0x0040
            int r1 = r0 + 1
            int r1 = p000a.p013d.C0071c.m4064b(r1)
            int[] r2 = new int[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int[] r3 = r6.f267c
            int r4 = r3.length
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r2, r5, r4)
            java.lang.Object[] r3 = r6.f268d
            int r4 = r3.length
            java.lang.System.arraycopy(r3, r5, r1, r5, r4)
            r6.f267c = r2
            r6.f268d = r1
        L_0x0040:
            int[] r1 = r6.f267c
            r1[r0] = r7
            java.lang.Object[] r7 = r6.f268d
            r7[r0] = r8
            int r0 = r0 + 1
            r6.f269e = r0
            return
    }

    /* renamed from: b */
    public int m4008b() {
            r1 = this;
            boolean r0 = r1.f266b
            if (r0 == 0) goto L_0x0007
            r1.m4005c()
        L_0x0007:
            int r0 = r1.f269e
            return r0
    }

    /* renamed from: b */
    public E m4007b(int r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.m4006b(r2, r0)
            return r2
    }

    /* renamed from: b */
    public E m4006b(int r4, E r5) {
            r3 = this;
            int[] r0 = r3.f267c
            int r1 = r3.f269e
            int r4 = p000a.p013d.C0071c.m4066a(r0, r1, r4)
            if (r4 < 0) goto L_0x0016
            java.lang.Object[] r0 = r3.f268d
            r1 = r0[r4]
            java.lang.Object r2 = p000a.p013d.C0081h.f265f
            if (r1 != r2) goto L_0x0013
            goto L_0x0016
        L_0x0013:
            r4 = r0[r4]
            return r4
        L_0x0016:
            return r5
    }

    /* renamed from: c */
    public int m4004c(int r3) {
            r2 = this;
            boolean r0 = r2.f266b
            if (r0 == 0) goto L_0x0007
            r2.m4005c()
        L_0x0007:
            int[] r0 = r2.f267c
            int r1 = r2.f269e
            int r3 = p000a.p013d.C0071c.m4066a(r0, r1, r3)
            return r3
    }

    /* renamed from: c */
    public void m4003c(int r7, E r8) {
            r6 = this;
            int[] r0 = r6.f267c
            int r1 = r6.f269e
            int r0 = p000a.p013d.C0071c.m4066a(r0, r1, r7)
            if (r0 < 0) goto L_0x000f
            java.lang.Object[] r7 = r6.f268d
            r7[r0] = r8
            goto L_0x0082
        L_0x000f:
            r0 = r0 ^ (-1)
            int r1 = r6.f269e
            if (r0 >= r1) goto L_0x0024
            java.lang.Object[] r1 = r6.f268d
            r2 = r1[r0]
            java.lang.Object r3 = p000a.p013d.C0081h.f265f
            if (r2 != r3) goto L_0x0024
            int[] r2 = r6.f267c
            r2[r0] = r7
            r1[r0] = r8
            return
        L_0x0024:
            boolean r1 = r6.f266b
            if (r1 == 0) goto L_0x003c
            int r1 = r6.f269e
            int[] r2 = r6.f267c
            int r2 = r2.length
            if (r1 < r2) goto L_0x003c
            r6.m4005c()
            int[] r0 = r6.f267c
            int r1 = r6.f269e
            int r0 = p000a.p013d.C0071c.m4066a(r0, r1, r7)
            r0 = r0 ^ (-1)
        L_0x003c:
            int r1 = r6.f269e
            int[] r2 = r6.f267c
            int r2 = r2.length
            if (r1 < r2) goto L_0x005e
            int r1 = r1 + 1
            int r1 = p000a.p013d.C0071c.m4064b(r1)
            int[] r2 = new int[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int[] r3 = r6.f267c
            int r4 = r3.length
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r2, r5, r4)
            java.lang.Object[] r3 = r6.f268d
            int r4 = r3.length
            java.lang.System.arraycopy(r3, r5, r1, r5, r4)
            r6.f267c = r2
            r6.f268d = r1
        L_0x005e:
            int r1 = r6.f269e
            int r2 = r1 - r0
            if (r2 == 0) goto L_0x0074
            int[] r2 = r6.f267c
            int r3 = r0 + 1
            int r1 = r1 - r0
            java.lang.System.arraycopy(r2, r0, r2, r3, r1)
            java.lang.Object[] r1 = r6.f268d
            int r2 = r6.f269e
            int r2 = r2 - r0
            java.lang.System.arraycopy(r1, r0, r1, r3, r2)
        L_0x0074:
            int[] r1 = r6.f267c
            r1[r0] = r7
            java.lang.Object[] r7 = r6.f268d
            r7[r0] = r8
            int r7 = r6.f269e
            int r7 = r7 + 1
            r6.f269e = r7
        L_0x0082:
            return
    }

    public p000a.p013d.C0081h<E> clone() {
            r2 = this;
            java.lang.Object r0 = super.clone()     // Catch: CloneNotSupportedException -> 0x001b
            a.d.h r0 = (p000a.p013d.C0081h) r0     // Catch: CloneNotSupportedException -> 0x001b
            int[] r1 = r2.f267c     // Catch: CloneNotSupportedException -> 0x001b
            java.lang.Object r1 = r1.clone()     // Catch: CloneNotSupportedException -> 0x001b
            int[] r1 = (int[]) r1     // Catch: CloneNotSupportedException -> 0x001b
            r0.f267c = r1     // Catch: CloneNotSupportedException -> 0x001b
            java.lang.Object[] r1 = r2.f268d     // Catch: CloneNotSupportedException -> 0x001b
            java.lang.Object r1 = r1.clone()     // Catch: CloneNotSupportedException -> 0x001b
            java.lang.Object[] r1 = (java.lang.Object[]) r1     // Catch: CloneNotSupportedException -> 0x001b
            r0.f268d = r1     // Catch: CloneNotSupportedException -> 0x001b
            return r0
        L_0x001b:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            a.d.h r0 = r1.clone()
            return r0
    }

    /* renamed from: d */
    public int m4002d(int r2) {
            r1 = this;
            boolean r0 = r1.f266b
            if (r0 == 0) goto L_0x0007
            r1.m4005c()
        L_0x0007:
            int[] r0 = r1.f267c
            r2 = r0[r2]
            return r2
    }

    /* renamed from: e */
    public void m4001e(int r1) {
            r0 = this;
            r0.m4010a(r1)
            return
    }

    /* renamed from: f */
    public E m4000f(int r2) {
            r1 = this;
            boolean r0 = r1.f266b
            if (r0 == 0) goto L_0x0007
            r1.m4005c()
        L_0x0007:
            java.lang.Object[] r0 = r1.f268d
            r2 = r0[r2]
            return r2
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.m4008b()
            if (r0 > 0) goto L_0x0009
            java.lang.String r0 = "{}"
            return r0
        L_0x0009:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.f269e
            int r1 = r1 * 28
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r1 = 0
        L_0x0018:
            int r2 = r3.f269e
            if (r1 >= r2) goto L_0x0041
            if (r1 <= 0) goto L_0x0023
            java.lang.String r2 = ", "
            r0.append(r2)
        L_0x0023:
            int r2 = r3.m4002d(r1)
            r0.append(r2)
            r2 = 61
            r0.append(r2)
            java.lang.Object r2 = r3.m4000f(r1)
            if (r2 == r3) goto L_0x0039
            r0.append(r2)
            goto L_0x003e
        L_0x0039:
            java.lang.String r2 = "(this Map)"
            r0.append(r2)
        L_0x003e:
            int r1 = r1 + 1
            goto L_0x0018
        L_0x0041:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
