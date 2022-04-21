package p000a.p007b.p008a.p010b;

/* renamed from: a.b.a.b.b */
/* loaded from: classes.dex */
public class C0049b<K, V> implements java.lang.Iterable<java.util.Map.Entry<K, V>> {

    /* renamed from: b */
    p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> f165b;

    /* renamed from: c */
    private p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> f166c;

    /* renamed from: d */
    private java.util.WeakHashMap<p000a.p007b.p008a.p010b.C0049b.AbstractC0055f<K, V>, java.lang.Boolean> f167d;

    /* renamed from: e */
    private int f168e;

    /* renamed from: a.b.a.b.b$a */
    /* loaded from: classes.dex */
    static class C0050a<K, V> extends p000a.p007b.p008a.p010b.C0049b.AbstractC0054e<K, V> {
        C0050a(p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> r1, p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // p000a.p007b.p008a.p010b.C0049b.AbstractC0054e
        /* renamed from: b */
        p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> mo4135b(p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> r1) {
                r0 = this;
                a.b.a.b.b$c<K, V> r1 = r1.f172e
                return r1
        }

        @Override // p000a.p007b.p008a.p010b.C0049b.AbstractC0054e
        /* renamed from: c */
        p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> mo4134c(p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> r1) {
                r0 = this;
                a.b.a.b.b$c<K, V> r1 = r1.f171d
                return r1
        }
    }

    /* renamed from: a.b.a.b.b$b */
    /* loaded from: classes.dex */
    private static class C0051b<K, V> extends p000a.p007b.p008a.p010b.C0049b.AbstractC0054e<K, V> {
        C0051b(p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> r1, p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // p000a.p007b.p008a.p010b.C0049b.AbstractC0054e
        /* renamed from: b */
        p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> mo4135b(p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> r1) {
                r0 = this;
                a.b.a.b.b$c<K, V> r1 = r1.f171d
                return r1
        }

        @Override // p000a.p007b.p008a.p010b.C0049b.AbstractC0054e
        /* renamed from: c */
        p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> mo4134c(p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> r1) {
                r0 = this;
                a.b.a.b.b$c<K, V> r1 = r1.f172e
                return r1
        }
    }

    /* renamed from: a.b.a.b.b$c */
    /* loaded from: classes.dex */
    static class C0052c<K, V> implements java.util.Map.Entry<K, V> {

        /* renamed from: b */
        final K f169b;

        /* renamed from: c */
        final V f170c;

        /* renamed from: d */
        p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> f171d;

        /* renamed from: e */
        p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> f172e;

        C0052c(K r1, V r2) {
                r0 = this;
                r0.<init>()
                r0.f169b = r1
                r0.f170c = r2
                return
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L_0x0004
                return r0
            L_0x0004:
                boolean r1 = r5 instanceof p000a.p007b.p008a.p010b.C0049b.C0052c
                r2 = 0
                if (r1 != 0) goto L_0x000a
                return r2
            L_0x000a:
                a.b.a.b.b$c r5 = (p000a.p007b.p008a.p010b.C0049b.C0052c) r5
                K r1 = r4.f169b
                K r3 = r5.f169b
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L_0x0021
                V r1 = r4.f170c
                V r5 = r5.f170c
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L_0x0021
                goto L_0x0022
            L_0x0021:
                r0 = 0
            L_0x0022:
                return r0
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r1 = this;
                K r0 = r1.f169b
                return r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r1 = this;
                V r0 = r1.f170c
                return r0
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
                r2 = this;
                K r0 = r2.f169b
                int r0 = r0.hashCode()
                V r1 = r2.f170c
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                return r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "An entry modification is not supported"
                r2.<init>(r0)
                throw r2
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                K r1 = r2.f169b
                r0.append(r1)
                java.lang.String r1 = "="
                r0.append(r1)
                V r1 = r2.f170c
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: a.b.a.b.b$d */
    /* loaded from: classes.dex */
    private class C0053d implements java.util.Iterator<java.util.Map.Entry<K, V>>, p000a.p007b.p008a.p010b.C0049b.AbstractC0055f<K, V> {

        /* renamed from: b */
        private p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> f173b;

        /* renamed from: c */
        private boolean f174c;

        /* renamed from: d */
        final /* synthetic */ p000a.p007b.p008a.p010b.C0049b f175d;

        C0053d(p000a.p007b.p008a.p010b.C0049b r1) {
                r0 = this;
                r0.f175d = r1
                r0.<init>()
                r1 = 1
                r0.f174c = r1
                return
        }

        @Override // p000a.p007b.p008a.p010b.C0049b.AbstractC0055f
        /* renamed from: a */
        public void mo4133a(p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> r2) {
                r1 = this;
                a.b.a.b.b$c<K, V> r0 = r1.f173b
                if (r2 != r0) goto L_0x0011
                a.b.a.b.b$c<K, V> r2 = r0.f172e
                r1.f173b = r2
                a.b.a.b.b$c<K, V> r2 = r1.f173b
                if (r2 != 0) goto L_0x000e
                r2 = 1
                goto L_0x000f
            L_0x000e:
                r2 = 0
            L_0x000f:
                r1.f174c = r2
            L_0x0011:
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r3 = this;
                boolean r0 = r3.f174c
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x000f
                a.b.a.b.b r0 = r3.f175d
                a.b.a.b.b$c<K, V> r0 = r0.f165b
                if (r0 == 0) goto L_0x000d
                goto L_0x000e
            L_0x000d:
                r1 = 0
            L_0x000e:
                return r1
            L_0x000f:
                a.b.a.b.b$c<K, V> r0 = r3.f173b
                if (r0 == 0) goto L_0x0018
                a.b.a.b.b$c<K, V> r0 = r0.f171d
                if (r0 == 0) goto L_0x0018
                goto L_0x0019
            L_0x0018:
                r1 = 0
            L_0x0019:
                return r1
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                java.util.Map$Entry r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
                r1 = this;
                boolean r0 = r1.f174c
                if (r0 == 0) goto L_0x000e
                r0 = 0
                r1.f174c = r0
                a.b.a.b.b r0 = r1.f175d
                a.b.a.b.b$c<K, V> r0 = r0.f165b
            L_0x000b:
                r1.f173b = r0
                goto L_0x0017
            L_0x000e:
                a.b.a.b.b$c<K, V> r0 = r1.f173b
                if (r0 == 0) goto L_0x0015
                a.b.a.b.b$c<K, V> r0 = r0.f171d
                goto L_0x000b
            L_0x0015:
                r0 = 0
                goto L_0x000b
            L_0x0017:
                a.b.a.b.b$c<K, V> r0 = r1.f173b
                return r0
        }
    }

    /* renamed from: a.b.a.b.b$e */
    /* loaded from: classes.dex */
    private static abstract class AbstractC0054e<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>>, p000a.p007b.p008a.p010b.C0049b.AbstractC0055f<K, V> {

        /* renamed from: b */
        p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> f176b;

        /* renamed from: c */
        p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> f177c;

        AbstractC0054e(p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> r1, p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> r2) {
                r0 = this;
                r0.<init>()
                r0.f176b = r2
                r0.f177c = r1
                return
        }

        /* renamed from: a */
        private p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> m4136a() {
                r2 = this;
                a.b.a.b.b$c<K, V> r0 = r2.f177c
                a.b.a.b.b$c<K, V> r1 = r2.f176b
                if (r0 == r1) goto L_0x000e
                if (r1 != 0) goto L_0x0009
                goto L_0x000e
            L_0x0009:
                a.b.a.b.b$c r0 = r2.mo4134c(r0)
                return r0
            L_0x000e:
                r0 = 0
                return r0
        }

        @Override // p000a.p007b.p008a.p010b.C0049b.AbstractC0055f
        /* renamed from: a */
        public void mo4133a(p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> r2) {
                r1 = this;
                a.b.a.b.b$c<K, V> r0 = r1.f176b
                if (r0 != r2) goto L_0x000d
                a.b.a.b.b$c<K, V> r0 = r1.f177c
                if (r2 != r0) goto L_0x000d
                r0 = 0
                r1.f177c = r0
                r1.f176b = r0
            L_0x000d:
                a.b.a.b.b$c<K, V> r0 = r1.f176b
                if (r0 != r2) goto L_0x0017
                a.b.a.b.b$c r0 = r1.mo4135b(r0)
                r1.f176b = r0
            L_0x0017:
                a.b.a.b.b$c<K, V> r0 = r1.f177c
                if (r0 != r2) goto L_0x0021
                a.b.a.b.b$c r2 = r1.m4136a()
                r1.f177c = r2
            L_0x0021:
                return
        }

        /* renamed from: b */
        abstract p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> mo4135b(p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> r1);

        /* renamed from: c */
        abstract p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> mo4134c(p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> r1);

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                a.b.a.b.b$c<K, V> r0 = r1.f177c
                if (r0 == 0) goto L_0x0006
                r0 = 1
                goto L_0x0007
            L_0x0006:
                r0 = 0
            L_0x0007:
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                java.util.Map$Entry r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
                r2 = this;
                a.b.a.b.b$c<K, V> r0 = r2.f177c
                a.b.a.b.b$c r1 = r2.m4136a()
                r2.f177c = r1
                return r0
        }
    }

    /* renamed from: a.b.a.b.b$f */
    /* loaded from: classes.dex */
    interface AbstractC0055f<K, V> {
        /* renamed from: a */
        void mo4133a(p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> r1);
    }

    public C0049b() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r1.f167d = r0
            r0 = 0
            r1.f168e = r0
            return
    }

    /* renamed from: a */
    protected p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> mo4142a(K r3) {
            r2 = this;
            a.b.a.b.b$c<K, V> r0 = r2.f165b
        L_0x0002:
            if (r0 == 0) goto L_0x0010
            K r1 = r0.f169b
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x000d
            goto L_0x0010
        L_0x000d:
            a.b.a.b.b$c<K, V> r0 = r0.f171d
            goto L_0x0002
        L_0x0010:
            return r0
    }

    /* renamed from: a */
    protected p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> m4141a(K r2, V r3) {
            r1 = this;
            a.b.a.b.b$c r0 = new a.b.a.b.b$c
            r0.<init>(r2, r3)
            int r2 = r1.f168e
            int r2 = r2 + 1
            r1.f168e = r2
            a.b.a.b.b$c<K, V> r2 = r1.f166c
            if (r2 != 0) goto L_0x0016
            r1.f165b = r0
            a.b.a.b.b$c<K, V> r2 = r1.f165b
            r1.f166c = r2
            return r0
        L_0x0016:
            r2.f171d = r0
            r0.f172e = r2
            r1.f166c = r0
            return r0
    }

    /* renamed from: a */
    public java.util.Iterator<java.util.Map.Entry<K, V>> m4143a() {
            r3 = this;
            a.b.a.b.b$b r0 = new a.b.a.b.b$b
            a.b.a.b.b$c<K, V> r1 = r3.f166c
            a.b.a.b.b$c<K, V> r2 = r3.f165b
            r0.<init>(r1, r2)
            java.util.WeakHashMap<a.b.a.b.b$f<K, V>, java.lang.Boolean> r1 = r3.f167d
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.put(r0, r2)
            return r0
    }

    /* renamed from: b */
    public V mo4139b(K r2, V r3) {
            r1 = this;
            a.b.a.b.b$c r0 = r1.mo4142a(r2)
            if (r0 == 0) goto L_0x0009
            V r2 = r0.f170c
            return r2
        L_0x0009:
            r1.m4141a(r2, r3)
            r2 = 0
            return r2
    }

    /* renamed from: b */
    public java.util.Map.Entry<K, V> m4140b() {
            r1 = this;
            a.b.a.b.b$c<K, V> r0 = r1.f165b
            return r0
    }

    /* renamed from: c */
    public p000a.p007b.p008a.p010b.C0049b<K, V>.C0053d m4138c() {
            r3 = this;
            a.b.a.b.b$d r0 = new a.b.a.b.b$d
            r0.<init>(r3)
            java.util.WeakHashMap<a.b.a.b.b$f<K, V>, java.lang.Boolean> r1 = r3.f167d
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.put(r0, r2)
            return r0
    }

    /* renamed from: d */
    public java.util.Map.Entry<K, V> m4137d() {
            r1 = this;
            a.b.a.b.b$c<K, V> r0 = r1.f166c
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof p000a.p007b.p008a.p010b.C0049b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            a.b.a.b.b r6 = (p000a.p007b.p008a.p010b.C0049b) r6
            int r1 = r5.size()
            int r3 = r6.size()
            if (r1 == r3) goto L_0x0017
            return r2
        L_0x0017:
            java.util.Iterator r1 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L_0x001f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0042
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x0042
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r6.next()
            if (r3 != 0) goto L_0x0039
            if (r4 != 0) goto L_0x0041
        L_0x0039:
            if (r3 == 0) goto L_0x001f
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001f
        L_0x0041:
            return r2
        L_0x0042:
            boolean r1 = r1.hasNext()
            if (r1 != 0) goto L_0x004f
            boolean r6 = r6.hasNext()
            if (r6 != 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L_0x0005:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0017
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            int r2 = r2.hashCode()
            int r1 = r1 + r2
            goto L_0x0005
        L_0x0017:
            return r1
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            r3 = this;
            a.b.a.b.b$a r0 = new a.b.a.b.b$a
            a.b.a.b.b$c<K, V> r1 = r3.f165b
            a.b.a.b.b$c<K, V> r2 = r3.f166c
            r0.<init>(r1, r2)
            java.util.WeakHashMap<a.b.a.b.b$f<K, V>, java.lang.Boolean> r1 = r3.f167d
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.put(r0, r2)
            return r0
    }

    public V remove(K r4) {
            r3 = this;
            a.b.a.b.b$c r4 = r3.mo4142a(r4)
            r0 = 0
            if (r4 != 0) goto L_0x0008
            return r0
        L_0x0008:
            int r1 = r3.f168e
            int r1 = r1 + (-1)
            r3.f168e = r1
            java.util.WeakHashMap<a.b.a.b.b$f<K, V>, java.lang.Boolean> r1 = r3.f167d
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0030
            java.util.WeakHashMap<a.b.a.b.b$f<K, V>, java.lang.Boolean> r1 = r3.f167d
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0020:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r1.next()
            a.b.a.b.b$f r2 = (p000a.p007b.p008a.p010b.C0049b.AbstractC0055f) r2
            r2.mo4133a(r4)
            goto L_0x0020
        L_0x0030:
            a.b.a.b.b$c<K, V> r1 = r4.f172e
            if (r1 == 0) goto L_0x0039
            a.b.a.b.b$c<K, V> r2 = r4.f171d
            r1.f171d = r2
            goto L_0x003d
        L_0x0039:
            a.b.a.b.b$c<K, V> r1 = r4.f171d
            r3.f165b = r1
        L_0x003d:
            a.b.a.b.b$c<K, V> r1 = r4.f171d
            if (r1 == 0) goto L_0x0046
            a.b.a.b.b$c<K, V> r2 = r4.f172e
            r1.f172e = r2
            goto L_0x004a
        L_0x0046:
            a.b.a.b.b$c<K, V> r1 = r4.f172e
            r3.f166c = r1
        L_0x004a:
            r4.f171d = r0
            r4.f172e = r0
            V r4 = r4.f170c
            return r4
    }

    public int size() {
            r1 = this;
            int r0 = r1.f168e
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            java.util.Iterator r1 = r3.iterator()
        L_0x000e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x000e
            java.lang.String r2 = ", "
            r0.append(r2)
            goto L_0x000e
        L_0x002d:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
