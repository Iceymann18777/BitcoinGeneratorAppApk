package androidx.coordinatorlayout.widget;

/* renamed from: androidx.coordinatorlayout.widget.a */
/* loaded from: classes.dex */
public final class C0685a<T> {

    /* renamed from: a */
    private final p000a.p018g.p028k.AbstractC0181d<java.util.ArrayList<T>> f2613a;

    /* renamed from: b */
    private final p000a.p013d.C0080g<T, java.util.ArrayList<T>> f2614b;

    /* renamed from: c */
    private final java.util.ArrayList<T> f2615c;

    /* renamed from: d */
    private final java.util.HashSet<T> f2616d;

    public C0685a() {
            r2 = this;
            r2.<init>()
            a.g.k.e r0 = new a.g.k.e
            r1 = 10
            r0.<init>(r1)
            r2.f2613a = r0
            a.d.g r0 = new a.d.g
            r0.<init>()
            r2.f2614b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f2615c = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.f2616d = r0
            return
    }

    /* renamed from: a */
    private void m1650a(T r5, java.util.ArrayList<T> r6, java.util.HashSet<T> r7) {
            r4 = this;
            boolean r0 = r6.contains(r5)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            boolean r0 = r7.contains(r5)
            if (r0 != 0) goto L_0x0032
            r7.add(r5)
            a.d.g<T, java.util.ArrayList<T>> r0 = r4.f2614b
            java.lang.Object r0 = r0.get(r5)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L_0x002b
            r1 = 0
            int r2 = r0.size()
        L_0x001f:
            if (r1 >= r2) goto L_0x002b
            java.lang.Object r3 = r0.get(r1)
            r4.m1650a(r3, r6, r7)
            int r1 = r1 + 1
            goto L_0x001f
        L_0x002b:
            r7.remove(r5)
            r6.add(r5)
            return
        L_0x0032:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = "This graph contains cyclic dependencies"
            r5.<init>(r6)
            goto L_0x003b
        L_0x003a:
            throw r5
        L_0x003b:
            goto L_0x003a
    }

    /* renamed from: a */
    private void m1649a(java.util.ArrayList<T> r2) {
            r1 = this;
            r2.clear()
            a.g.k.d<java.util.ArrayList<T>> r0 = r1.f2613a
            r0.mo3558a(r2)
            return
    }

    /* renamed from: c */
    private java.util.ArrayList<T> m1646c() {
            r1 = this;
            a.g.k.d<java.util.ArrayList<T>> r0 = r1.f2613a
            java.lang.Object r0 = r0.mo3559a()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L_0x000f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x000f:
            return r0
    }

    /* renamed from: a */
    public void m1653a() {
            r3 = this;
            a.d.g<T, java.util.ArrayList<T>> r0 = r3.f2614b
            int r0 = r0.size()
            r1 = 0
        L_0x0007:
            if (r1 >= r0) goto L_0x0019
            a.d.g<T, java.util.ArrayList<T>> r2 = r3.f2614b
            java.lang.Object r2 = r2.m4013d(r1)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 == 0) goto L_0x0016
            r3.m1649a(r2)
        L_0x0016:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x0019:
            a.d.g<T, java.util.ArrayList<T>> r0 = r3.f2614b
            r0.clear()
            return
    }

    /* renamed from: a */
    public void m1652a(T r3) {
            r2 = this;
            a.d.g<T, java.util.ArrayList<T>> r0 = r2.f2614b
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto L_0x000e
            a.d.g<T, java.util.ArrayList<T>> r0 = r2.f2614b
            r1 = 0
            r0.put(r3, r1)
        L_0x000e:
            return
    }

    /* renamed from: a */
    public void m1651a(T r3, T r4) {
            r2 = this;
            a.d.g<T, java.util.ArrayList<T>> r0 = r2.f2614b
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x0027
            a.d.g<T, java.util.ArrayList<T>> r0 = r2.f2614b
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L_0x0027
            a.d.g<T, java.util.ArrayList<T>> r0 = r2.f2614b
            java.lang.Object r0 = r0.get(r3)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L_0x0023
            java.util.ArrayList r0 = r2.m1646c()
            a.d.g<T, java.util.ArrayList<T>> r1 = r2.f2614b
            r1.put(r3, r0)
        L_0x0023:
            r0.add(r4)
            return
        L_0x0027:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "All nodes must be present in the graph before being added as an edge"
            r3.<init>(r4)
            throw r3
    }

    /* renamed from: b */
    public java.util.ArrayList<T> m1648b() {
            r5 = this;
            java.util.ArrayList<T> r0 = r5.f2615c
            r0.clear()
            java.util.HashSet<T> r0 = r5.f2616d
            r0.clear()
            a.d.g<T, java.util.ArrayList<T>> r0 = r5.f2614b
            int r0 = r0.size()
            r1 = 0
        L_0x0011:
            if (r1 >= r0) goto L_0x0023
            a.d.g<T, java.util.ArrayList<T>> r2 = r5.f2614b
            java.lang.Object r2 = r2.m4016b(r1)
            java.util.ArrayList<T> r3 = r5.f2615c
            java.util.HashSet<T> r4 = r5.f2616d
            r5.m1650a(r2, r3, r4)
            int r1 = r1 + 1
            goto L_0x0011
        L_0x0023:
            java.util.ArrayList<T> r0 = r5.f2615c
            return r0
    }

    /* renamed from: b */
    public boolean m1647b(T r2) {
            r1 = this;
            a.d.g<T, java.util.ArrayList<T>> r0 = r1.f2614b
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    /* renamed from: c */
    public java.util.List m1645c(T r2) {
            r1 = this;
            a.d.g<T, java.util.ArrayList<T>> r0 = r1.f2614b
            java.lang.Object r2 = r0.get(r2)
            java.util.List r2 = (java.util.List) r2
            return r2
    }

    /* renamed from: d */
    public java.util.List<T> m1644d(T r5) {
            r4 = this;
            a.d.g<T, java.util.ArrayList<T>> r0 = r4.f2614b
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L_0x0008:
            if (r2 >= r0) goto L_0x002d
            a.d.g<T, java.util.ArrayList<T>> r3 = r4.f2614b
            java.lang.Object r3 = r3.m4013d(r2)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 == 0) goto L_0x002a
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L_0x002a
            if (r1 != 0) goto L_0x0021
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0021:
            a.d.g<T, java.util.ArrayList<T>> r3 = r4.f2614b
            java.lang.Object r3 = r3.m4016b(r2)
            r1.add(r3)
        L_0x002a:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x002d:
            return r1
    }

    /* renamed from: e */
    public boolean m1643e(T r5) {
            r4 = this;
            a.d.g<T, java.util.ArrayList<T>> r0 = r4.f2614b
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L_0x0008:
            if (r2 >= r0) goto L_0x001f
            a.d.g<T, java.util.ArrayList<T>> r3 = r4.f2614b
            java.lang.Object r3 = r3.m4013d(r2)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 == 0) goto L_0x001c
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L_0x001c
            r5 = 1
            return r5
        L_0x001c:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x001f:
            return r1
    }
}
