package p000a.p013d;

/* renamed from: a.d.d */
/* loaded from: classes.dex */
public class C0072d<E> implements java.lang.Cloneable {

    /* renamed from: f */
    private static final java.lang.Object f230f = null;

    /* renamed from: b */
    private boolean f231b;

    /* renamed from: c */
    private long[] f232c;

    /* renamed from: d */
    private java.lang.Object[] f233d;

    /* renamed from: e */
    private int f234e;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000a.p013d.C0072d.f230f = r0
            return
    }

    public C0072d() {
            r1 = this;
            r0 = 10
            r1.<init>(r0)
            return
    }

    public C0072d(int r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f231b = r0
            if (r3 != 0) goto L_0x0011
            long[] r3 = p000a.p013d.C0071c.f228b
            r2.f232c = r3
            java.lang.Object[] r3 = p000a.p013d.C0071c.f229c
            r2.f233d = r3
            goto L_0x001d
        L_0x0011:
            int r3 = p000a.p013d.C0071c.m4063c(r3)
            long[] r1 = new long[r3]
            r2.f232c = r1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.f233d = r3
        L_0x001d:
            r2.f234e = r0
            return
    }

    /* renamed from: c */
    private void m4054c() {
            r9 = this;
            int r0 = r9.f234e
            long[] r1 = r9.f232c
            java.lang.Object[] r2 = r9.f233d
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0009:
            if (r4 >= r0) goto L_0x0021
            r6 = r2[r4]
            java.lang.Object r7 = p000a.p013d.C0072d.f230f
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
            r9.f231b = r3
            r9.f234e = r5
            return
    }

    /* renamed from: a */
    public long m4061a(int r4) {
            r3 = this;
            boolean r0 = r3.f231b
            if (r0 == 0) goto L_0x0007
            r3.m4054c()
        L_0x0007:
            long[] r0 = r3.f232c
            r1 = r0[r4]
            return r1
    }

    /* renamed from: a */
    public void m4062a() {
            r5 = this;
            int r0 = r5.f234e
            java.lang.Object[] r1 = r5.f233d
            r2 = 0
            r3 = 0
        L_0x0006:
            if (r3 >= r0) goto L_0x000e
            r4 = 0
            r1[r3] = r4
            int r3 = r3 + 1
            goto L_0x0006
        L_0x000e:
            r5.f234e = r2
            r5.f231b = r2
            return
    }

    /* renamed from: a */
    public void m4060a(long r3) {
            r2 = this;
            long[] r0 = r2.f232c
            int r1 = r2.f234e
            int r3 = p000a.p013d.C0071c.m4065a(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f233d
            r0 = r4[r3]
            java.lang.Object r1 = p000a.p013d.C0072d.f230f
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f231b = r3
        L_0x0017:
            return
    }

    /* renamed from: a */
    public void m4059a(long r7, E r9) {
            r6 = this;
            int r0 = r6.f234e
            if (r0 == 0) goto L_0x0012
            long[] r1 = r6.f232c
            int r0 = r0 + (-1)
            r0 = r1[r0]
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0012
            r6.m4051c(r7, r9)
            return
        L_0x0012:
            boolean r0 = r6.f231b
            if (r0 == 0) goto L_0x0020
            int r0 = r6.f234e
            long[] r1 = r6.f232c
            int r1 = r1.length
            if (r0 < r1) goto L_0x0020
            r6.m4054c()
        L_0x0020:
            int r0 = r6.f234e
            long[] r1 = r6.f232c
            int r1 = r1.length
            if (r0 < r1) goto L_0x0042
            int r1 = r0 + 1
            int r1 = p000a.p013d.C0071c.m4063c(r1)
            long[] r2 = new long[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long[] r3 = r6.f232c
            int r4 = r3.length
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r2, r5, r4)
            java.lang.Object[] r3 = r6.f233d
            int r4 = r3.length
            java.lang.System.arraycopy(r3, r5, r1, r5, r4)
            r6.f232c = r2
            r6.f233d = r1
        L_0x0042:
            long[] r1 = r6.f232c
            r1[r0] = r7
            java.lang.Object[] r7 = r6.f233d
            r7[r0] = r9
            int r0 = r0 + 1
            r6.f234e = r0
            return
    }

    /* renamed from: b */
    public int m4058b() {
            r1 = this;
            boolean r0 = r1.f231b
            if (r0 == 0) goto L_0x0007
            r1.m4054c()
        L_0x0007:
            int r0 = r1.f234e
            return r0
    }

    /* renamed from: b */
    public E m4056b(long r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.m4055b(r2, r0)
            return r2
    }

    /* renamed from: b */
    public E m4055b(long r3, E r5) {
            r2 = this;
            long[] r0 = r2.f232c
            int r1 = r2.f234e
            int r3 = p000a.p013d.C0071c.m4065a(r0, r1, r3)
            if (r3 < 0) goto L_0x0016
            java.lang.Object[] r4 = r2.f233d
            r0 = r4[r3]
            java.lang.Object r1 = p000a.p013d.C0072d.f230f
            if (r0 != r1) goto L_0x0013
            goto L_0x0016
        L_0x0013:
            r3 = r4[r3]
            return r3
        L_0x0016:
            return r5
    }

    /* renamed from: b */
    public void m4057b(int r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.f233d
            r1 = r0[r4]
            java.lang.Object r2 = p000a.p013d.C0072d.f230f
            if (r1 == r2) goto L_0x000d
            r0[r4] = r2
            r4 = 1
            r3.f231b = r4
        L_0x000d:
            return
    }

    /* renamed from: c */
    public int m4052c(long r3) {
            r2 = this;
            boolean r0 = r2.f231b
            if (r0 == 0) goto L_0x0007
            r2.m4054c()
        L_0x0007:
            long[] r0 = r2.f232c
            int r1 = r2.f234e
            int r3 = p000a.p013d.C0071c.m4065a(r0, r1, r3)
            return r3
    }

    /* renamed from: c */
    public E m4053c(int r2) {
            r1 = this;
            boolean r0 = r1.f231b
            if (r0 == 0) goto L_0x0007
            r1.m4054c()
        L_0x0007:
            java.lang.Object[] r0 = r1.f233d
            r2 = r0[r2]
            return r2
    }

    /* renamed from: c */
    public void m4051c(long r7, E r9) {
            r6 = this;
            long[] r0 = r6.f232c
            int r1 = r6.f234e
            int r0 = p000a.p013d.C0071c.m4065a(r0, r1, r7)
            if (r0 < 0) goto L_0x000f
            java.lang.Object[] r7 = r6.f233d
            r7[r0] = r9
            goto L_0x0082
        L_0x000f:
            r0 = r0 ^ (-1)
            int r1 = r6.f234e
            if (r0 >= r1) goto L_0x0024
            java.lang.Object[] r1 = r6.f233d
            r2 = r1[r0]
            java.lang.Object r3 = p000a.p013d.C0072d.f230f
            if (r2 != r3) goto L_0x0024
            long[] r2 = r6.f232c
            r2[r0] = r7
            r1[r0] = r9
            return
        L_0x0024:
            boolean r1 = r6.f231b
            if (r1 == 0) goto L_0x003c
            int r1 = r6.f234e
            long[] r2 = r6.f232c
            int r2 = r2.length
            if (r1 < r2) goto L_0x003c
            r6.m4054c()
            long[] r0 = r6.f232c
            int r1 = r6.f234e
            int r0 = p000a.p013d.C0071c.m4065a(r0, r1, r7)
            r0 = r0 ^ (-1)
        L_0x003c:
            int r1 = r6.f234e
            long[] r2 = r6.f232c
            int r2 = r2.length
            if (r1 < r2) goto L_0x005e
            int r1 = r1 + 1
            int r1 = p000a.p013d.C0071c.m4063c(r1)
            long[] r2 = new long[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long[] r3 = r6.f232c
            int r4 = r3.length
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r2, r5, r4)
            java.lang.Object[] r3 = r6.f233d
            int r4 = r3.length
            java.lang.System.arraycopy(r3, r5, r1, r5, r4)
            r6.f232c = r2
            r6.f233d = r1
        L_0x005e:
            int r1 = r6.f234e
            int r2 = r1 - r0
            if (r2 == 0) goto L_0x0074
            long[] r2 = r6.f232c
            int r3 = r0 + 1
            int r1 = r1 - r0
            java.lang.System.arraycopy(r2, r0, r2, r3, r1)
            java.lang.Object[] r1 = r6.f233d
            int r2 = r6.f234e
            int r2 = r2 - r0
            java.lang.System.arraycopy(r1, r0, r1, r3, r2)
        L_0x0074:
            long[] r1 = r6.f232c
            r1[r0] = r7
            java.lang.Object[] r7 = r6.f233d
            r7[r0] = r9
            int r7 = r6.f234e
            int r7 = r7 + 1
            r6.f234e = r7
        L_0x0082:
            return
    }

    public p000a.p013d.C0072d<E> clone() {
            r2 = this;
            java.lang.Object r0 = super.clone()     // Catch: CloneNotSupportedException -> 0x001b
            a.d.d r0 = (p000a.p013d.C0072d) r0     // Catch: CloneNotSupportedException -> 0x001b
            long[] r1 = r2.f232c     // Catch: CloneNotSupportedException -> 0x001b
            java.lang.Object r1 = r1.clone()     // Catch: CloneNotSupportedException -> 0x001b
            long[] r1 = (long[]) r1     // Catch: CloneNotSupportedException -> 0x001b
            r0.f232c = r1     // Catch: CloneNotSupportedException -> 0x001b
            java.lang.Object[] r1 = r2.f233d     // Catch: CloneNotSupportedException -> 0x001b
            java.lang.Object r1 = r1.clone()     // Catch: CloneNotSupportedException -> 0x001b
            java.lang.Object[] r1 = (java.lang.Object[]) r1     // Catch: CloneNotSupportedException -> 0x001b
            r0.f233d = r1     // Catch: CloneNotSupportedException -> 0x001b
            return r0
        L_0x001b:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            a.d.d r0 = r1.clone()
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.m4058b()
            if (r0 > 0) goto L_0x0009
            java.lang.String r0 = "{}"
            return r0
        L_0x0009:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.f234e
            int r1 = r1 * 28
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r1 = 0
        L_0x0018:
            int r2 = r4.f234e
            if (r1 >= r2) goto L_0x0041
            if (r1 <= 0) goto L_0x0023
            java.lang.String r2 = ", "
            r0.append(r2)
        L_0x0023:
            long r2 = r4.m4061a(r1)
            r0.append(r2)
            r2 = 61
            r0.append(r2)
            java.lang.Object r2 = r4.m4053c(r1)
            if (r2 == r4) goto L_0x0039
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
