package p000a.p013d;

/* renamed from: a.d.g */
/* loaded from: classes.dex */
public class C0080g<K, V> {

    /* renamed from: e */
    static java.lang.Object[] f258e;

    /* renamed from: f */
    static int f259f;

    /* renamed from: g */
    static java.lang.Object[] f260g;

    /* renamed from: h */
    static int f261h;

    /* renamed from: b */
    int[] f262b;

    /* renamed from: c */
    java.lang.Object[] f263c;

    /* renamed from: d */
    int f264d;

    public C0080g() {
            r1 = this;
            r1.<init>()
            int[] r0 = p000a.p013d.C0071c.f227a
            r1.f262b = r0
            java.lang.Object[] r0 = p000a.p013d.C0071c.f229c
            r1.f263c = r0
            r0 = 0
            r1.f264d = r0
            return
    }

    public C0080g(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L_0x000e
            int[] r1 = p000a.p013d.C0071c.f227a
            r0.f262b = r1
            java.lang.Object[] r1 = p000a.p013d.C0071c.f229c
            r0.f263c = r1
            goto L_0x0011
        L_0x000e:
            r0.m4012e(r1)
        L_0x0011:
            r1 = 0
            r0.f264d = r1
            return
    }

    public C0080g(p000a.p013d.C0080g<K, V> r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L_0x0008
            r0.m4021a(r1)
        L_0x0008:
            return
    }

    /* renamed from: a */
    private static int m4018a(int[] r0, int r1, int r2) {
            int r0 = p000a.p013d.C0071c.m4066a(r0, r1, r2)     // Catch: ArrayIndexOutOfBoundsException -> 0x0005
            return r0
        L_0x0005:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }

    /* renamed from: a */
    private static void m4017a(int[] r7, java.lang.Object[] r8, int r9) {
            int r0 = r7.length
            r1 = 0
            r2 = 2
            r3 = 0
            r4 = 10
            r5 = 1
            r6 = 8
            if (r0 != r6) goto L_0x002e
            java.lang.Class<a.d.a> r0 = p000a.p013d.C0067a.class
            monitor-enter(r0)
            int r6 = p000a.p013d.C0080g.f261h     // Catch: all -> 0x002b
            if (r6 >= r4) goto L_0x0029
            java.lang.Object[] r4 = p000a.p013d.C0080g.f260g     // Catch: all -> 0x002b
            r8[r3] = r4     // Catch: all -> 0x002b
            r8[r5] = r7     // Catch: all -> 0x002b
            int r7 = r9 << 1
            int r7 = r7 - r5
        L_0x001b:
            if (r7 < r2) goto L_0x0022
            r8[r7] = r1     // Catch: all -> 0x002b
            int r7 = r7 + (-1)
            goto L_0x001b
        L_0x0022:
            p000a.p013d.C0080g.f260g = r8     // Catch: all -> 0x002b
            int r7 = p000a.p013d.C0080g.f261h     // Catch: all -> 0x002b
            int r7 = r7 + r5
            p000a.p013d.C0080g.f261h = r7     // Catch: all -> 0x002b
        L_0x0029:
            monitor-exit(r0)     // Catch: all -> 0x002b
            goto L_0x0055
        L_0x002b:
            r7 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x002b
            throw r7
        L_0x002e:
            int r0 = r7.length
            r6 = 4
            if (r0 != r6) goto L_0x0055
            java.lang.Class<a.d.a> r0 = p000a.p013d.C0067a.class
            monitor-enter(r0)
            int r6 = p000a.p013d.C0080g.f259f     // Catch: all -> 0x0052
            if (r6 >= r4) goto L_0x0050
            java.lang.Object[] r4 = p000a.p013d.C0080g.f258e     // Catch: all -> 0x0052
            r8[r3] = r4     // Catch: all -> 0x0052
            r8[r5] = r7     // Catch: all -> 0x0052
            int r7 = r9 << 1
            int r7 = r7 - r5
        L_0x0042:
            if (r7 < r2) goto L_0x0049
            r8[r7] = r1     // Catch: all -> 0x0052
            int r7 = r7 + (-1)
            goto L_0x0042
        L_0x0049:
            p000a.p013d.C0080g.f258e = r8     // Catch: all -> 0x0052
            int r7 = p000a.p013d.C0080g.f259f     // Catch: all -> 0x0052
            int r7 = r7 + r5
            p000a.p013d.C0080g.f259f = r7     // Catch: all -> 0x0052
        L_0x0050:
            monitor-exit(r0)     // Catch: all -> 0x0052
            goto L_0x0055
        L_0x0052:
            r7 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x0052
            throw r7
        L_0x0055:
            return
    }

    /* renamed from: e */
    private void m4012e(int r6) {
            r5 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            r3 = 8
            if (r6 != r3) goto L_0x002e
            java.lang.Class<a.d.a> r3 = p000a.p013d.C0067a.class
            monitor-enter(r3)
            java.lang.Object[] r4 = p000a.p013d.C0080g.f260g     // Catch: all -> 0x002b
            if (r4 == 0) goto L_0x0029
            java.lang.Object[] r6 = p000a.p013d.C0080g.f260g     // Catch: all -> 0x002b
            r5.f263c = r6     // Catch: all -> 0x002b
            r4 = r6[r1]     // Catch: all -> 0x002b
            java.lang.Object[] r4 = (java.lang.Object[]) r4     // Catch: all -> 0x002b
            p000a.p013d.C0080g.f260g = r4     // Catch: all -> 0x002b
            r4 = r6[r2]     // Catch: all -> 0x002b
            int[] r4 = (int[]) r4     // Catch: all -> 0x002b
            r5.f262b = r4     // Catch: all -> 0x002b
            r6[r2] = r0     // Catch: all -> 0x002b
            r6[r1] = r0     // Catch: all -> 0x002b
            int r6 = p000a.p013d.C0080g.f261h     // Catch: all -> 0x002b
            int r6 = r6 - r2
            p000a.p013d.C0080g.f261h = r6     // Catch: all -> 0x002b
            monitor-exit(r3)     // Catch: all -> 0x002b
            return
        L_0x0029:
            monitor-exit(r3)     // Catch: all -> 0x002b
            goto L_0x0058
        L_0x002b:
            r6 = move-exception
            monitor-exit(r3)     // Catch: all -> 0x002b
            throw r6
        L_0x002e:
            r3 = 4
            if (r6 != r3) goto L_0x0058
            java.lang.Class<a.d.a> r3 = p000a.p013d.C0067a.class
            monitor-enter(r3)
            java.lang.Object[] r4 = p000a.p013d.C0080g.f258e     // Catch: all -> 0x0055
            if (r4 == 0) goto L_0x0053
            java.lang.Object[] r6 = p000a.p013d.C0080g.f258e     // Catch: all -> 0x0055
            r5.f263c = r6     // Catch: all -> 0x0055
            r4 = r6[r1]     // Catch: all -> 0x0055
            java.lang.Object[] r4 = (java.lang.Object[]) r4     // Catch: all -> 0x0055
            p000a.p013d.C0080g.f258e = r4     // Catch: all -> 0x0055
            r4 = r6[r2]     // Catch: all -> 0x0055
            int[] r4 = (int[]) r4     // Catch: all -> 0x0055
            r5.f262b = r4     // Catch: all -> 0x0055
            r6[r2] = r0     // Catch: all -> 0x0055
            r6[r1] = r0     // Catch: all -> 0x0055
            int r6 = p000a.p013d.C0080g.f259f     // Catch: all -> 0x0055
            int r6 = r6 - r2
            p000a.p013d.C0080g.f259f = r6     // Catch: all -> 0x0055
            monitor-exit(r3)     // Catch: all -> 0x0055
            return
        L_0x0053:
            monitor-exit(r3)     // Catch: all -> 0x0055
            goto L_0x0058
        L_0x0055:
            r6 = move-exception
            monitor-exit(r3)     // Catch: all -> 0x0055
            throw r6
        L_0x0058:
            int[] r0 = new int[r6]
            r5.f262b = r0
            int r6 = r6 << r2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r5.f263c = r6
            return
    }

    /* renamed from: a */
    int m4024a() {
            r6 = this;
            int r0 = r6.f264d
            r1 = -1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int[] r2 = r6.f262b
            r3 = 0
            int r2 = m4018a(r2, r0, r3)
            if (r2 >= 0) goto L_0x0010
            return r2
        L_0x0010:
            java.lang.Object[] r3 = r6.f263c
            int r4 = r2 << 1
            r3 = r3[r4]
            if (r3 != 0) goto L_0x0019
            return r2
        L_0x0019:
            int r3 = r2 + 1
        L_0x001b:
            if (r3 >= r0) goto L_0x002f
            int[] r4 = r6.f262b
            r4 = r4[r3]
            if (r4 != 0) goto L_0x002f
            java.lang.Object[] r4 = r6.f263c
            int r5 = r3 << 1
            r4 = r4[r5]
            if (r4 != 0) goto L_0x002c
            return r3
        L_0x002c:
            int r3 = r3 + 1
            goto L_0x001b
        L_0x002f:
            int r2 = r2 + (-1)
        L_0x0031:
            if (r2 < 0) goto L_0x0045
            int[] r0 = r6.f262b
            r0 = r0[r2]
            if (r0 != 0) goto L_0x0045
            java.lang.Object[] r0 = r6.f263c
            int r4 = r2 << 1
            r0 = r0[r4]
            if (r0 != 0) goto L_0x0042
            return r2
        L_0x0042:
            int r2 = r2 + (-1)
            goto L_0x0031
        L_0x0045:
            r0 = r3 ^ (-1)
            return r0
    }

    /* renamed from: a */
    public int m4020a(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L_0x0007
            int r2 = r1.m4024a()
            goto L_0x000f
        L_0x0007:
            int r0 = r2.hashCode()
            int r2 = r1.m4019a(r2, r0)
        L_0x000f:
            return r2
    }

    /* renamed from: a */
    int m4019a(java.lang.Object r7, int r8) {
            r6 = this;
            int r0 = r6.f264d
            r1 = -1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int[] r2 = r6.f262b
            int r2 = m4018a(r2, r0, r8)
            if (r2 >= 0) goto L_0x000f
            return r2
        L_0x000f:
            java.lang.Object[] r3 = r6.f263c
            int r4 = r2 << 1
            r3 = r3[r4]
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x001c
            return r2
        L_0x001c:
            int r3 = r2 + 1
        L_0x001e:
            if (r3 >= r0) goto L_0x0036
            int[] r4 = r6.f262b
            r4 = r4[r3]
            if (r4 != r8) goto L_0x0036
            java.lang.Object[] r4 = r6.f263c
            int r5 = r3 << 1
            r4 = r4[r5]
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0033
            return r3
        L_0x0033:
            int r3 = r3 + 1
            goto L_0x001e
        L_0x0036:
            int r2 = r2 + (-1)
        L_0x0038:
            if (r2 < 0) goto L_0x0050
            int[] r0 = r6.f262b
            r0 = r0[r2]
            if (r0 != r8) goto L_0x0050
            java.lang.Object[] r0 = r6.f263c
            int r4 = r2 << 1
            r0 = r0[r4]
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x004d
            return r2
        L_0x004d:
            int r2 = r2 + (-1)
            goto L_0x0038
        L_0x0050:
            r7 = r3 ^ (-1)
            return r7
    }

    /* renamed from: a */
    public V m4022a(int r3, V r4) {
            r2 = this;
            int r3 = r3 << 1
            int r3 = r3 + 1
            java.lang.Object[] r0 = r2.f263c
            r1 = r0[r3]
            r0[r3] = r4
            return r1
    }

    /* renamed from: a */
    public void m4023a(int r6) {
            r5 = this;
            int r0 = r5.f264d
            int[] r1 = r5.f262b
            int r2 = r1.length
            if (r2 >= r6) goto L_0x0020
            java.lang.Object[] r2 = r5.f263c
            r5.m4012e(r6)
            int r6 = r5.f264d
            if (r6 <= 0) goto L_0x001d
            int[] r6 = r5.f262b
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r6, r3, r0)
            java.lang.Object[] r6 = r5.f263c
            int r4 = r0 << 1
            java.lang.System.arraycopy(r2, r3, r6, r3, r4)
        L_0x001d:
            m4017a(r1, r2, r0)
        L_0x0020:
            int r6 = r5.f264d
            if (r6 != r0) goto L_0x0025
            return
        L_0x0025:
            java.util.ConcurrentModificationException r6 = new java.util.ConcurrentModificationException
            r6.<init>()
            throw r6
    }

    /* renamed from: a */
    public void m4021a(p000a.p013d.C0080g<? extends K, ? extends V> r5) {
            r4 = this;
            int r0 = r5.f264d
            int r1 = r4.f264d
            int r1 = r1 + r0
            r4.m4023a(r1)
            int r1 = r4.f264d
            r2 = 0
            if (r1 != 0) goto L_0x0022
            if (r0 <= 0) goto L_0x0032
            int[] r1 = r5.f262b
            int[] r3 = r4.f262b
            java.lang.System.arraycopy(r1, r2, r3, r2, r0)
            java.lang.Object[] r5 = r5.f263c
            java.lang.Object[] r1 = r4.f263c
            int r3 = r0 << 1
            java.lang.System.arraycopy(r5, r2, r1, r2, r3)
            r4.f264d = r0
            goto L_0x0032
        L_0x0022:
            if (r2 >= r0) goto L_0x0032
            java.lang.Object r1 = r5.m4016b(r2)
            java.lang.Object r3 = r5.m4013d(r2)
            r4.put(r1, r3)
            int r2 = r2 + 1
            goto L_0x0022
        L_0x0032:
            return
    }

    /* renamed from: b */
    int m4015b(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f264d
            int r0 = r0 * 2
            java.lang.Object[] r1 = r5.f263c
            r2 = 1
            if (r6 != 0) goto L_0x0015
            r6 = 1
        L_0x000a:
            if (r6 >= r0) goto L_0x0026
            r3 = r1[r6]
            if (r3 != 0) goto L_0x0012
            int r6 = r6 >> r2
            return r6
        L_0x0012:
            int r6 = r6 + 2
            goto L_0x000a
        L_0x0015:
            r3 = 1
        L_0x0016:
            if (r3 >= r0) goto L_0x0026
            r4 = r1[r3]
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x0023
            int r6 = r3 >> 1
            return r6
        L_0x0023:
            int r3 = r3 + 2
            goto L_0x0016
        L_0x0026:
            r6 = -1
            return r6
    }

    /* renamed from: b */
    public K m4016b(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.f263c
            int r2 = r2 << 1
            r2 = r0[r2]
            return r2
    }

    /* renamed from: c */
    public V m4014c(int r11) {
            r10 = this;
            java.lang.Object[] r0 = r10.f263c
            int r1 = r11 << 1
            int r2 = r1 + 1
            r2 = r0[r2]
            int r3 = r10.f264d
            r4 = 0
            r5 = 1
            if (r3 > r5) goto L_0x001d
            int[] r11 = r10.f262b
            m4017a(r11, r0, r3)
            int[] r11 = p000a.p013d.C0071c.f227a
            r10.f262b = r11
            java.lang.Object[] r11 = p000a.p013d.C0071c.f229c
            r10.f263c = r11
            r0 = 0
            goto L_0x0081
        L_0x001d:
            int r0 = r3 + (-1)
            int[] r6 = r10.f262b
            int r7 = r6.length
            r8 = 8
            if (r7 <= r8) goto L_0x0063
            int r6 = r6.length
            int r6 = r6 / 3
            if (r3 >= r6) goto L_0x0063
            if (r3 <= r8) goto L_0x0031
            int r6 = r3 >> 1
            int r8 = r3 + r6
        L_0x0031:
            int[] r6 = r10.f262b
            java.lang.Object[] r7 = r10.f263c
            r10.m4012e(r8)
            int r8 = r10.f264d
            if (r3 != r8) goto L_0x005d
            if (r11 <= 0) goto L_0x0048
            int[] r8 = r10.f262b
            java.lang.System.arraycopy(r6, r4, r8, r4, r11)
            java.lang.Object[] r8 = r10.f263c
            java.lang.System.arraycopy(r7, r4, r8, r4, r1)
        L_0x0048:
            if (r11 >= r0) goto L_0x0081
            int r4 = r11 + 1
            int[] r8 = r10.f262b
            int r9 = r0 - r11
            java.lang.System.arraycopy(r6, r4, r8, r11, r9)
            int r11 = r4 << 1
            java.lang.Object[] r4 = r10.f263c
            int r5 = r9 << 1
            java.lang.System.arraycopy(r7, r11, r4, r1, r5)
            goto L_0x0081
        L_0x005d:
            java.util.ConcurrentModificationException r11 = new java.util.ConcurrentModificationException
            r11.<init>()
            throw r11
        L_0x0063:
            if (r11 >= r0) goto L_0x0077
            int[] r4 = r10.f262b
            int r6 = r11 + 1
            int r7 = r0 - r11
            java.lang.System.arraycopy(r4, r6, r4, r11, r7)
            java.lang.Object[] r11 = r10.f263c
            int r4 = r6 << 1
            int r6 = r7 << 1
            java.lang.System.arraycopy(r11, r4, r11, r1, r6)
        L_0x0077:
            java.lang.Object[] r11 = r10.f263c
            int r1 = r0 << 1
            r4 = 0
            r11[r1] = r4
            int r1 = r1 + r5
            r11[r1] = r4
        L_0x0081:
            int r11 = r10.f264d
            if (r3 != r11) goto L_0x0088
            r10.f264d = r0
            return r2
        L_0x0088:
            java.util.ConcurrentModificationException r11 = new java.util.ConcurrentModificationException
            r11.<init>()
            throw r11
    }

    public void clear() {
            r4 = this;
            int r0 = r4.f264d
            if (r0 <= 0) goto L_0x0016
            int[] r1 = r4.f262b
            java.lang.Object[] r2 = r4.f263c
            int[] r3 = p000a.p013d.C0071c.f227a
            r4.f262b = r3
            java.lang.Object[] r3 = p000a.p013d.C0071c.f229c
            r4.f263c = r3
            r3 = 0
            r4.f264d = r3
            m4017a(r1, r2, r0)
        L_0x0016:
            int r0 = r4.f264d
            if (r0 > 0) goto L_0x001b
            return
        L_0x001b:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }

    public boolean containsKey(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.m4020a(r1)
            if (r1 < 0) goto L_0x0008
            r1 = 1
            goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            return r1
    }

    public boolean containsValue(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.m4015b(r1)
            if (r1 < 0) goto L_0x0008
            r1 = 1
            goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            return r1
    }

    /* renamed from: d */
    public V m4013d(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.f263c
            int r2 = r2 << 1
            int r2 = r2 + 1
            r2 = r0[r2]
            return r2
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof p000a.p013d.C0080g
            r2 = 0
            if (r1 == 0) goto L_0x003e
            a.d.g r7 = (p000a.p013d.C0080g) r7
            int r1 = r6.size()
            int r3 = r7.size()
            if (r1 == r3) goto L_0x0016
            return r2
        L_0x0016:
            r1 = 0
        L_0x0017:
            int r3 = r6.f264d     // Catch: NullPointerException | ClassCastException -> 0x003d
            if (r1 >= r3) goto L_0x003c
            java.lang.Object r3 = r6.m4016b(r1)     // Catch: NullPointerException | ClassCastException -> 0x003d
            java.lang.Object r4 = r6.m4013d(r1)     // Catch: NullPointerException | ClassCastException -> 0x003d
            java.lang.Object r5 = r7.get(r3)     // Catch: NullPointerException | ClassCastException -> 0x003d
            if (r4 != 0) goto L_0x0032
            if (r5 != 0) goto L_0x0031
            boolean r3 = r7.containsKey(r3)     // Catch: NullPointerException | ClassCastException -> 0x003d
            if (r3 != 0) goto L_0x0039
        L_0x0031:
            return r2
        L_0x0032:
            boolean r3 = r4.equals(r5)     // Catch: NullPointerException | ClassCastException -> 0x003d
            if (r3 != 0) goto L_0x0039
            return r2
        L_0x0039:
            int r1 = r1 + 1
            goto L_0x0017
        L_0x003c:
            return r0
        L_0x003d:
            return r2
        L_0x003e:
            boolean r1 = r7 instanceof java.util.Map
            if (r1 == 0) goto L_0x0076
            java.util.Map r7 = (java.util.Map) r7
            int r1 = r6.size()
            int r3 = r7.size()
            if (r1 == r3) goto L_0x004f
            return r2
        L_0x004f:
            r1 = 0
        L_0x0050:
            int r3 = r6.f264d     // Catch: NullPointerException | ClassCastException -> 0x0076
            if (r1 >= r3) goto L_0x0075
            java.lang.Object r3 = r6.m4016b(r1)     // Catch: NullPointerException | ClassCastException -> 0x0076
            java.lang.Object r4 = r6.m4013d(r1)     // Catch: NullPointerException | ClassCastException -> 0x0076
            java.lang.Object r5 = r7.get(r3)     // Catch: NullPointerException | ClassCastException -> 0x0076
            if (r4 != 0) goto L_0x006b
            if (r5 != 0) goto L_0x006a
            boolean r3 = r7.containsKey(r3)     // Catch: NullPointerException | ClassCastException -> 0x0076
            if (r3 != 0) goto L_0x0072
        L_0x006a:
            return r2
        L_0x006b:
            boolean r3 = r4.equals(r5)     // Catch: NullPointerException | ClassCastException -> 0x0076
            if (r3 != 0) goto L_0x0072
            return r2
        L_0x0072:
            int r1 = r1 + 1
            goto L_0x0050
        L_0x0075:
            return r0
        L_0x0076:
            return r2
    }

    public V get(java.lang.Object r2) {
            r1 = this;
            int r2 = r1.m4020a(r2)
            if (r2 < 0) goto L_0x000f
            java.lang.Object[] r0 = r1.f263c
            int r2 = r2 << 1
            int r2 = r2 + 1
            r2 = r0[r2]
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            return r2
    }

    public int hashCode() {
            r9 = this;
            int[] r0 = r9.f262b
            java.lang.Object[] r1 = r9.f263c
            int r2 = r9.f264d
            r3 = 1
            r4 = 0
            r3 = 0
            r5 = 0
            r6 = 1
        L_0x000b:
            if (r3 >= r2) goto L_0x0020
            r7 = r1[r6]
            r8 = r0[r3]
            if (r7 != 0) goto L_0x0015
            r7 = 0
            goto L_0x0019
        L_0x0015:
            int r7 = r7.hashCode()
        L_0x0019:
            r7 = r7 ^ r8
            int r5 = r5 + r7
            int r3 = r3 + 1
            int r6 = r6 + 2
            goto L_0x000b
        L_0x0020:
            return r5
    }

    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.f264d
            if (r0 > 0) goto L_0x0006
            r0 = 1
            goto L_0x0007
        L_0x0006:
            r0 = 0
        L_0x0007:
            return r0
    }

    public V put(K r10, V r11) {
            r9 = this;
            int r0 = r9.f264d
            r1 = 0
            if (r10 != 0) goto L_0x000b
            int r2 = r9.m4024a()
            r3 = 0
            goto L_0x0016
        L_0x000b:
            int r2 = r10.hashCode()
            int r3 = r9.m4019a(r10, r2)
            r8 = r3
            r3 = r2
            r2 = r8
        L_0x0016:
            if (r2 < 0) goto L_0x0023
            int r10 = r2 << 1
            int r10 = r10 + 1
            java.lang.Object[] r0 = r9.f263c
            r1 = r0[r10]
            r0[r10] = r11
            return r1
        L_0x0023:
            r2 = r2 ^ (-1)
            int[] r4 = r9.f262b
            int r4 = r4.length
            if (r0 < r4) goto L_0x005b
            r4 = 4
            r5 = 8
            if (r0 < r5) goto L_0x0033
            int r4 = r0 >> 1
            int r4 = r4 + r0
            goto L_0x0037
        L_0x0033:
            if (r0 < r4) goto L_0x0037
            r4 = 8
        L_0x0037:
            int[] r5 = r9.f262b
            java.lang.Object[] r6 = r9.f263c
            r9.m4012e(r4)
            int r4 = r9.f264d
            if (r0 != r4) goto L_0x0055
            int[] r4 = r9.f262b
            int r7 = r4.length
            if (r7 <= 0) goto L_0x0051
            int r7 = r5.length
            java.lang.System.arraycopy(r5, r1, r4, r1, r7)
            java.lang.Object[] r4 = r9.f263c
            int r7 = r6.length
            java.lang.System.arraycopy(r6, r1, r4, r1, r7)
        L_0x0051:
            m4017a(r5, r6, r0)
            goto L_0x005b
        L_0x0055:
            java.util.ConcurrentModificationException r10 = new java.util.ConcurrentModificationException
            r10.<init>()
            throw r10
        L_0x005b:
            if (r2 >= r0) goto L_0x0074
            int[] r1 = r9.f262b
            int r4 = r2 + 1
            int r5 = r0 - r2
            java.lang.System.arraycopy(r1, r2, r1, r4, r5)
            java.lang.Object[] r1 = r9.f263c
            int r5 = r2 << 1
            int r4 = r4 << 1
            int r6 = r9.f264d
            int r6 = r6 - r2
            int r6 = r6 << 1
            java.lang.System.arraycopy(r1, r5, r1, r4, r6)
        L_0x0074:
            int r1 = r9.f264d
            if (r0 != r1) goto L_0x008f
            int[] r0 = r9.f262b
            int r4 = r0.length
            if (r2 >= r4) goto L_0x008f
            r0[r2] = r3
            java.lang.Object[] r0 = r9.f263c
            int r2 = r2 << 1
            r0[r2] = r10
            int r2 = r2 + 1
            r0[r2] = r11
            int r1 = r1 + 1
            r9.f264d = r1
            r10 = 0
            return r10
        L_0x008f:
            java.util.ConcurrentModificationException r10 = new java.util.ConcurrentModificationException
            r10.<init>()
            throw r10
    }

    public V remove(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.m4020a(r1)
            if (r1 < 0) goto L_0x000b
            java.lang.Object r1 = r0.m4014c(r1)
            return r1
        L_0x000b:
            r1 = 0
            return r1
    }

    public int size() {
            r1 = this;
            int r0 = r1.f264d
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0009
            java.lang.String r0 = "{}"
            return r0
        L_0x0009:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.f264d
            int r1 = r1 * 28
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r1 = 0
        L_0x0018:
            int r2 = r4.f264d
            if (r1 >= r2) goto L_0x0047
            if (r1 <= 0) goto L_0x0023
            java.lang.String r2 = ", "
            r0.append(r2)
        L_0x0023:
            java.lang.Object r2 = r4.m4016b(r1)
            java.lang.String r3 = "(this Map)"
            if (r2 == r4) goto L_0x002f
            r0.append(r2)
            goto L_0x0032
        L_0x002f:
            r0.append(r3)
        L_0x0032:
            r2 = 61
            r0.append(r2)
            java.lang.Object r2 = r4.m4013d(r1)
            if (r2 == r4) goto L_0x0041
            r0.append(r2)
            goto L_0x0044
        L_0x0041:
            r0.append(r3)
        L_0x0044:
            int r1 = r1 + 1
            goto L_0x0018
        L_0x0047:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
