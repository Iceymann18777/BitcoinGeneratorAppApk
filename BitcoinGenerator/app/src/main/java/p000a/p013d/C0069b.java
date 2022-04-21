package p000a.p013d;

/* renamed from: a.d.b */
/* loaded from: classes.dex */
public final class C0069b<E> implements java.util.Collection<E>, java.util.Set<E> {

    /* renamed from: f */
    private static final int[] f216f = null;

    /* renamed from: g */
    private static final java.lang.Object[] f217g = null;

    /* renamed from: h */
    private static java.lang.Object[] f218h;

    /* renamed from: i */
    private static int f219i;

    /* renamed from: j */
    private static java.lang.Object[] f220j;

    /* renamed from: k */
    private static int f221k;

    /* renamed from: b */
    private int[] f222b;

    /* renamed from: c */
    java.lang.Object[] f223c;

    /* renamed from: d */
    int f224d;

    /* renamed from: e */
    private p000a.p013d.AbstractC0074f<E, E> f225e;

    /* renamed from: a.d.b$a */
    /* loaded from: classes.dex */
    class C0070a extends p000a.p013d.AbstractC0074f<E, E> {

        /* renamed from: d */
        final /* synthetic */ p000a.p013d.C0069b f226d;

        C0070a(p000a.p013d.C0069b r1) {
                r0 = this;
                r0.f226d = r1
                r0.<init>()
                return
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: a */
        protected int mo4039a(java.lang.Object r2) {
                r1 = this;
                a.d.b r0 = r1.f226d
                int r2 = r0.m4075a(r2)
                return r2
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: a */
        protected java.lang.Object mo4041a(int r1, int r2) {
                r0 = this;
                a.d.b r2 = r0.f226d
                java.lang.Object[] r2 = r2.f223c
                r1 = r2[r1]
                return r1
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: a */
        protected E mo4040a(int r1, E r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                java.lang.String r2 = "not a map"
                r1.<init>(r2)
                throw r1
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: a */
        protected void mo4043a() {
                r1 = this;
                a.d.b r0 = r1.f226d
                r0.clear()
                return
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: a */
        protected void mo4042a(int r2) {
                r1 = this;
                a.d.b r0 = r1.f226d
                r0.m4071b(r2)
                return
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: a */
        protected void mo4038a(E r1, E r2) {
                r0 = this;
                a.d.b r2 = r0.f226d
                r2.add(r1)
                return
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: b */
        protected int mo4032b(java.lang.Object r2) {
                r1 = this;
                a.d.b r0 = r1.f226d
                int r2 = r0.m4075a(r2)
                return r2
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: b */
        protected java.util.Map<E, E> mo4034b() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "not a map"
                r0.<init>(r1)
                throw r0
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: c */
        protected int mo4030c() {
                r1 = this;
                a.d.b r0 = r1.f226d
                int r0 = r0.f224d
                return r0
        }
    }

    static {
            r0 = 0
            int[] r1 = new int[r0]
            p000a.p013d.C0069b.f216f = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            p000a.p013d.C0069b.f217g = r0
            return
    }

    public C0069b() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public C0069b(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L_0x000e
            int[] r1 = p000a.p013d.C0069b.f216f
            r0.f222b = r1
            java.lang.Object[] r1 = p000a.p013d.C0069b.f217g
            r0.f223c = r1
            goto L_0x0011
        L_0x000e:
            r0.m4069d(r1)
        L_0x0011:
            r1 = 0
            r0.f224d = r1
            return
    }

    /* renamed from: a */
    private int m4074a(java.lang.Object r6, int r7) {
            r5 = this;
            int r0 = r5.f224d
            r1 = -1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int[] r2 = r5.f222b
            int r2 = p000a.p013d.C0071c.m4066a(r2, r0, r7)
            if (r2 >= 0) goto L_0x000f
            return r2
        L_0x000f:
            java.lang.Object[] r3 = r5.f223c
            r3 = r3[r2]
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x001a
            return r2
        L_0x001a:
            int r3 = r2 + 1
        L_0x001c:
            if (r3 >= r0) goto L_0x0032
            int[] r4 = r5.f222b
            r4 = r4[r3]
            if (r4 != r7) goto L_0x0032
            java.lang.Object[] r4 = r5.f223c
            r4 = r4[r3]
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x002f
            return r3
        L_0x002f:
            int r3 = r3 + 1
            goto L_0x001c
        L_0x0032:
            int r2 = r2 + (-1)
        L_0x0034:
            if (r2 < 0) goto L_0x004a
            int[] r0 = r5.f222b
            r0 = r0[r2]
            if (r0 != r7) goto L_0x004a
            java.lang.Object[] r0 = r5.f223c
            r0 = r0[r2]
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0047
            return r2
        L_0x0047:
            int r2 = r2 + (-1)
            goto L_0x0034
        L_0x004a:
            r6 = r3 ^ (-1)
            return r6
    }

    /* renamed from: a */
    private p000a.p013d.AbstractC0074f<E, E> m4077a() {
            r1 = this;
            a.d.f<E, E> r0 = r1.f225e
            if (r0 != 0) goto L_0x000b
            a.d.b$a r0 = new a.d.b$a
            r0.<init>(r1)
            r1.f225e = r0
        L_0x000b:
            a.d.f<E, E> r0 = r1.f225e
            return r0
    }

    /* renamed from: a */
    private static void m4073a(int[] r7, java.lang.Object[] r8, int r9) {
            int r0 = r7.length
            r1 = 0
            r2 = 2
            r3 = 0
            r4 = 10
            r5 = 1
            r6 = 8
            if (r0 != r6) goto L_0x002c
            java.lang.Class<a.d.b> r0 = p000a.p013d.C0069b.class
            monitor-enter(r0)
            int r6 = p000a.p013d.C0069b.f221k     // Catch: all -> 0x0029
            if (r6 >= r4) goto L_0x0027
            java.lang.Object[] r4 = p000a.p013d.C0069b.f220j     // Catch: all -> 0x0029
            r8[r3] = r4     // Catch: all -> 0x0029
            r8[r5] = r7     // Catch: all -> 0x0029
            int r9 = r9 - r5
        L_0x0019:
            if (r9 < r2) goto L_0x0020
            r8[r9] = r1     // Catch: all -> 0x0029
            int r9 = r9 + (-1)
            goto L_0x0019
        L_0x0020:
            p000a.p013d.C0069b.f220j = r8     // Catch: all -> 0x0029
            int r7 = p000a.p013d.C0069b.f221k     // Catch: all -> 0x0029
            int r7 = r7 + r5
            p000a.p013d.C0069b.f221k = r7     // Catch: all -> 0x0029
        L_0x0027:
            monitor-exit(r0)     // Catch: all -> 0x0029
            goto L_0x0051
        L_0x0029:
            r7 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x0029
            throw r7
        L_0x002c:
            int r0 = r7.length
            r6 = 4
            if (r0 != r6) goto L_0x0051
            java.lang.Class<a.d.b> r0 = p000a.p013d.C0069b.class
            monitor-enter(r0)
            int r6 = p000a.p013d.C0069b.f219i     // Catch: all -> 0x004e
            if (r6 >= r4) goto L_0x004c
            java.lang.Object[] r4 = p000a.p013d.C0069b.f218h     // Catch: all -> 0x004e
            r8[r3] = r4     // Catch: all -> 0x004e
            r8[r5] = r7     // Catch: all -> 0x004e
            int r9 = r9 - r5
        L_0x003e:
            if (r9 < r2) goto L_0x0045
            r8[r9] = r1     // Catch: all -> 0x004e
            int r9 = r9 + (-1)
            goto L_0x003e
        L_0x0045:
            p000a.p013d.C0069b.f218h = r8     // Catch: all -> 0x004e
            int r7 = p000a.p013d.C0069b.f219i     // Catch: all -> 0x004e
            int r7 = r7 + r5
            p000a.p013d.C0069b.f219i = r7     // Catch: all -> 0x004e
        L_0x004c:
            monitor-exit(r0)     // Catch: all -> 0x004e
            goto L_0x0051
        L_0x004e:
            r7 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x004e
            throw r7
        L_0x0051:
            return
    }

    /* renamed from: b */
    private int m4072b() {
            r5 = this;
            int r0 = r5.f224d
            r1 = -1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int[] r2 = r5.f222b
            r3 = 0
            int r2 = p000a.p013d.C0071c.m4066a(r2, r0, r3)
            if (r2 >= 0) goto L_0x0010
            return r2
        L_0x0010:
            java.lang.Object[] r3 = r5.f223c
            r3 = r3[r2]
            if (r3 != 0) goto L_0x0017
            return r2
        L_0x0017:
            int r3 = r2 + 1
        L_0x0019:
            if (r3 >= r0) goto L_0x002b
            int[] r4 = r5.f222b
            r4 = r4[r3]
            if (r4 != 0) goto L_0x002b
            java.lang.Object[] r4 = r5.f223c
            r4 = r4[r3]
            if (r4 != 0) goto L_0x0028
            return r3
        L_0x0028:
            int r3 = r3 + 1
            goto L_0x0019
        L_0x002b:
            int r2 = r2 + (-1)
        L_0x002d:
            if (r2 < 0) goto L_0x003f
            int[] r0 = r5.f222b
            r0 = r0[r2]
            if (r0 != 0) goto L_0x003f
            java.lang.Object[] r0 = r5.f223c
            r0 = r0[r2]
            if (r0 != 0) goto L_0x003c
            return r2
        L_0x003c:
            int r2 = r2 + (-1)
            goto L_0x002d
        L_0x003f:
            r0 = r3 ^ (-1)
            return r0
    }

    /* renamed from: d */
    private void m4069d(int r6) {
            r5 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            r3 = 8
            if (r6 != r3) goto L_0x002e
            java.lang.Class<a.d.b> r3 = p000a.p013d.C0069b.class
            monitor-enter(r3)
            java.lang.Object[] r4 = p000a.p013d.C0069b.f220j     // Catch: all -> 0x002b
            if (r4 == 0) goto L_0x0029
            java.lang.Object[] r6 = p000a.p013d.C0069b.f220j     // Catch: all -> 0x002b
            r5.f223c = r6     // Catch: all -> 0x002b
            r4 = r6[r1]     // Catch: all -> 0x002b
            java.lang.Object[] r4 = (java.lang.Object[]) r4     // Catch: all -> 0x002b
            p000a.p013d.C0069b.f220j = r4     // Catch: all -> 0x002b
            r4 = r6[r2]     // Catch: all -> 0x002b
            int[] r4 = (int[]) r4     // Catch: all -> 0x002b
            r5.f222b = r4     // Catch: all -> 0x002b
            r6[r2] = r0     // Catch: all -> 0x002b
            r6[r1] = r0     // Catch: all -> 0x002b
            int r6 = p000a.p013d.C0069b.f221k     // Catch: all -> 0x002b
            int r6 = r6 - r2
            p000a.p013d.C0069b.f221k = r6     // Catch: all -> 0x002b
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
            java.lang.Class<a.d.b> r3 = p000a.p013d.C0069b.class
            monitor-enter(r3)
            java.lang.Object[] r4 = p000a.p013d.C0069b.f218h     // Catch: all -> 0x0055
            if (r4 == 0) goto L_0x0053
            java.lang.Object[] r6 = p000a.p013d.C0069b.f218h     // Catch: all -> 0x0055
            r5.f223c = r6     // Catch: all -> 0x0055
            r4 = r6[r1]     // Catch: all -> 0x0055
            java.lang.Object[] r4 = (java.lang.Object[]) r4     // Catch: all -> 0x0055
            p000a.p013d.C0069b.f218h = r4     // Catch: all -> 0x0055
            r4 = r6[r2]     // Catch: all -> 0x0055
            int[] r4 = (int[]) r4     // Catch: all -> 0x0055
            r5.f222b = r4     // Catch: all -> 0x0055
            r6[r2] = r0     // Catch: all -> 0x0055
            r6[r1] = r0     // Catch: all -> 0x0055
            int r6 = p000a.p013d.C0069b.f219i     // Catch: all -> 0x0055
            int r6 = r6 - r2
            p000a.p013d.C0069b.f219i = r6     // Catch: all -> 0x0055
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
            r5.f222b = r0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r5.f223c = r6
            return
    }

    /* renamed from: a */
    public int m4075a(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L_0x0007
            int r2 = r1.m4072b()
            goto L_0x000f
        L_0x0007:
            int r0 = r2.hashCode()
            int r2 = r1.m4074a(r2, r0)
        L_0x000f:
            return r2
    }

    /* renamed from: a */
    public void m4076a(int r5) {
            r4 = this;
            int[] r0 = r4.f222b
            int r1 = r0.length
            if (r1 >= r5) goto L_0x0020
            java.lang.Object[] r1 = r4.f223c
            r4.m4069d(r5)
            int r5 = r4.f224d
            if (r5 <= 0) goto L_0x001b
            int[] r2 = r4.f222b
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r2, r3, r5)
            java.lang.Object[] r5 = r4.f223c
            int r2 = r4.f224d
            java.lang.System.arraycopy(r1, r3, r5, r3, r2)
        L_0x001b:
            int r5 = r4.f224d
            m4073a(r0, r1, r5)
        L_0x0020:
            return
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E r9) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L_0x0009
            int r1 = r8.m4072b()
            r2 = 0
            goto L_0x0014
        L_0x0009:
            int r1 = r9.hashCode()
            int r2 = r8.m4074a(r9, r1)
            r7 = r2
            r2 = r1
            r1 = r7
        L_0x0014:
            if (r1 < 0) goto L_0x0017
            return r0
        L_0x0017:
            r1 = r1 ^ (-1)
            int r3 = r8.f224d
            int[] r4 = r8.f222b
            int r4 = r4.length
            if (r3 < r4) goto L_0x0048
            r4 = 4
            r5 = 8
            if (r3 < r5) goto L_0x0029
            int r4 = r3 >> 1
            int r4 = r4 + r3
            goto L_0x002d
        L_0x0029:
            if (r3 < r4) goto L_0x002d
            r4 = 8
        L_0x002d:
            int[] r3 = r8.f222b
            java.lang.Object[] r5 = r8.f223c
            r8.m4069d(r4)
            int[] r4 = r8.f222b
            int r6 = r4.length
            if (r6 <= 0) goto L_0x0043
            int r6 = r3.length
            java.lang.System.arraycopy(r3, r0, r4, r0, r6)
            java.lang.Object[] r4 = r8.f223c
            int r6 = r5.length
            java.lang.System.arraycopy(r5, r0, r4, r0, r6)
        L_0x0043:
            int r0 = r8.f224d
            m4073a(r3, r5, r0)
        L_0x0048:
            int r0 = r8.f224d
            if (r1 >= r0) goto L_0x005c
            int[] r3 = r8.f222b
            int r4 = r1 + 1
            int r0 = r0 - r1
            java.lang.System.arraycopy(r3, r1, r3, r4, r0)
            java.lang.Object[] r0 = r8.f223c
            int r3 = r8.f224d
            int r3 = r3 - r1
            java.lang.System.arraycopy(r0, r1, r0, r4, r3)
        L_0x005c:
            int[] r0 = r8.f222b
            r0[r1] = r2
            java.lang.Object[] r0 = r8.f223c
            r0[r1] = r9
            int r9 = r8.f224d
            r0 = 1
            int r9 = r9 + r0
            r8.f224d = r9
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(java.util.Collection<? extends E> r3) {
            r2 = this;
            int r0 = r2.f224d
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.m4076a(r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L_0x000f:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x001f
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.add(r1)
            r0 = r0 | r1
            goto L_0x000f
        L_0x001f:
            return r0
    }

    /* renamed from: b */
    public E m4071b(int r8) {
            r7 = this;
            java.lang.Object[] r0 = r7.f223c
            r1 = r0[r8]
            int r2 = r7.f224d
            r3 = 0
            r4 = 1
            if (r2 > r4) goto L_0x001a
            int[] r8 = r7.f222b
            m4073a(r8, r0, r2)
            int[] r8 = p000a.p013d.C0069b.f216f
            r7.f222b = r8
            java.lang.Object[] r8 = p000a.p013d.C0069b.f217g
            r7.f223c = r8
            r7.f224d = r3
            goto L_0x0079
        L_0x001a:
            int[] r0 = r7.f222b
            int r5 = r0.length
            r6 = 8
            if (r5 <= r6) goto L_0x0059
            int r0 = r0.length
            int r0 = r0 / 3
            if (r2 >= r0) goto L_0x0059
            if (r2 <= r6) goto L_0x002c
            int r0 = r2 >> 1
            int r6 = r2 + r0
        L_0x002c:
            int[] r0 = r7.f222b
            java.lang.Object[] r2 = r7.f223c
            r7.m4069d(r6)
            int r5 = r7.f224d
            int r5 = r5 - r4
            r7.f224d = r5
            if (r8 <= 0) goto L_0x0044
            int[] r4 = r7.f222b
            java.lang.System.arraycopy(r0, r3, r4, r3, r8)
            java.lang.Object[] r4 = r7.f223c
            java.lang.System.arraycopy(r2, r3, r4, r3, r8)
        L_0x0044:
            int r3 = r7.f224d
            if (r8 >= r3) goto L_0x0079
            int r4 = r8 + 1
            int[] r5 = r7.f222b
            int r3 = r3 - r8
            java.lang.System.arraycopy(r0, r4, r5, r8, r3)
            java.lang.Object[] r0 = r7.f223c
            int r3 = r7.f224d
            int r3 = r3 - r8
            java.lang.System.arraycopy(r2, r4, r0, r8, r3)
            goto L_0x0079
        L_0x0059:
            int r0 = r7.f224d
            int r0 = r0 - r4
            r7.f224d = r0
            int r0 = r7.f224d
            if (r8 >= r0) goto L_0x0072
            int[] r2 = r7.f222b
            int r3 = r8 + 1
            int r0 = r0 - r8
            java.lang.System.arraycopy(r2, r3, r2, r8, r0)
            java.lang.Object[] r0 = r7.f223c
            int r2 = r7.f224d
            int r2 = r2 - r8
            java.lang.System.arraycopy(r0, r3, r0, r8, r2)
        L_0x0072:
            java.lang.Object[] r8 = r7.f223c
            int r0 = r7.f224d
            r2 = 0
            r8[r0] = r2
        L_0x0079:
            return r1
    }

    /* renamed from: c */
    public E m4070c(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.f223c
            r2 = r0[r2]
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
            r3 = this;
            int r0 = r3.f224d
            if (r0 == 0) goto L_0x0016
            int[] r1 = r3.f222b
            java.lang.Object[] r2 = r3.f223c
            m4073a(r1, r2, r0)
            int[] r0 = p000a.p013d.C0069b.f216f
            r3.f222b = r0
            java.lang.Object[] r0 = p000a.p013d.C0069b.f217g
            r3.f223c = r0
            r0 = 0
            r3.f224d = r0
        L_0x0016:
            return
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.m4075a(r1)
            if (r1 < 0) goto L_0x0008
            r1 = 1
            goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            return r1
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L_0x0004:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0004
            r2 = 0
            return r2
        L_0x0016:
            r2 = 1
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof java.util.Set
            r2 = 0
            if (r1 == 0) goto L_0x002a
            java.util.Set r5 = (java.util.Set) r5
            int r1 = r4.size()
            int r3 = r5.size()
            if (r1 == r3) goto L_0x0016
            return r2
        L_0x0016:
            r1 = 0
        L_0x0017:
            int r3 = r4.f224d     // Catch: NullPointerException | ClassCastException -> 0x002a
            if (r1 >= r3) goto L_0x0029
            java.lang.Object r3 = r4.m4070c(r1)     // Catch: NullPointerException | ClassCastException -> 0x002a
            boolean r3 = r5.contains(r3)     // Catch: NullPointerException | ClassCastException -> 0x002a
            if (r3 != 0) goto L_0x0026
            return r2
        L_0x0026:
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0029:
            return r0
        L_0x002a:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
            r5 = this;
            int[] r0 = r5.f222b
            int r1 = r5.f224d
            r2 = 0
            r3 = 0
        L_0x0006:
            if (r2 >= r1) goto L_0x000e
            r4 = r0[r2]
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L_0x0006
        L_0x000e:
            return r3
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.f224d
            if (r0 > 0) goto L_0x0006
            r0 = 1
            goto L_0x0007
        L_0x0006:
            r0 = 0
        L_0x0007:
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<E> iterator() {
            r1 = this;
            a.d.f r0 = r1.m4077a()
            java.util.Set r0 = r0.m4027e()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.m4075a(r1)
            if (r1 < 0) goto L_0x000b
            r0.m4071b(r1)
            r1 = 1
            return r1
        L_0x000b:
            r1 = 0
            return r1
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(java.util.Collection<?> r3) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L_0x0005:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0015
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.remove(r1)
            r0 = r0 | r1
            goto L_0x0005
        L_0x0015:
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(java.util.Collection<?> r5) {
            r4 = this;
            int r0 = r4.f224d
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
        L_0x0005:
            if (r0 < 0) goto L_0x0018
            java.lang.Object[] r3 = r4.f223c
            r3 = r3[r0]
            boolean r3 = r5.contains(r3)
            if (r3 != 0) goto L_0x0015
            r4.m4071b(r0)
            r2 = 1
        L_0x0015:
            int r0 = r0 + (-1)
            goto L_0x0005
        L_0x0018:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            int r0 = r1.f224d
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public java.lang.Object[] toArray() {
            r4 = this;
            int r0 = r4.f224d
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object[] r2 = r4.f223c
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r0)
            return r1
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] r4) {
            r3 = this;
            int r0 = r4.length
            int r1 = r3.f224d
            if (r0 >= r1) goto L_0x0015
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r4 = r4.getComponentType()
            int r0 = r3.f224d
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r0)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
        L_0x0015:
            java.lang.Object[] r0 = r3.f223c
            int r1 = r3.f224d
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            int r0 = r4.length
            int r1 = r3.f224d
            if (r0 <= r1) goto L_0x0025
            r0 = 0
            r4[r1] = r0
        L_0x0025:
            return r4
    }

    public java.lang.String toString() {
            r3 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0009
            java.lang.String r0 = "{}"
            return r0
        L_0x0009:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.f224d
            int r1 = r1 * 14
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r1 = 0
        L_0x0018:
            int r2 = r3.f224d
            if (r1 >= r2) goto L_0x0035
            if (r1 <= 0) goto L_0x0023
            java.lang.String r2 = ", "
            r0.append(r2)
        L_0x0023:
            java.lang.Object r2 = r3.m4070c(r1)
            if (r2 == r3) goto L_0x002d
            r0.append(r2)
            goto L_0x0032
        L_0x002d:
            java.lang.String r2 = "(this Set)"
            r0.append(r2)
        L_0x0032:
            int r1 = r1 + 1
            goto L_0x0018
        L_0x0035:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
