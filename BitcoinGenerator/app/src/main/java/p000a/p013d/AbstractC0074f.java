package p000a.p013d;

/* renamed from: a.d.f */
/* loaded from: classes.dex */
abstract class AbstractC0074f<K, V> {

    /* renamed from: a */
    p000a.p013d.AbstractC0074f<K, V>.C0076b f243a;

    /* renamed from: b */
    p000a.p013d.AbstractC0074f<K, V>.C0077c f244b;

    /* renamed from: c */
    p000a.p013d.AbstractC0074f<K, V>.C0079e f245c;

    /* renamed from: a.d.f$a */
    /* loaded from: classes.dex */
    final class C0075a<T> implements java.util.Iterator<T> {

        /* renamed from: b */
        final int f246b;

        /* renamed from: c */
        int f247c;

        /* renamed from: d */
        int f248d;

        /* renamed from: e */
        boolean f249e;

        /* renamed from: f */
        final /* synthetic */ p000a.p013d.AbstractC0074f f250f;

        C0075a(p000a.p013d.AbstractC0074f r2, int r3) {
                r1 = this;
                r1.f250f = r2
                r1.<init>()
                r0 = 0
                r1.f249e = r0
                r1.f246b = r3
                int r2 = r2.mo4030c()
                r1.f247c = r2
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f248d
                int r1 = r2.f247c
                if (r0 >= r1) goto L_0x0008
                r0 = 1
                goto L_0x0009
            L_0x0008:
                r0 = 0
            L_0x0009:
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r3 = this;
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0019
                a.d.f r0 = r3.f250f
                int r1 = r3.f248d
                int r2 = r3.f246b
                java.lang.Object r0 = r0.mo4041a(r1, r2)
                int r1 = r3.f248d
                r2 = 1
                int r1 = r1 + r2
                r3.f248d = r1
                r3.f249e = r2
                return r0
            L_0x0019:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                boolean r0 = r2.f249e
                if (r0 == 0) goto L_0x001b
                int r0 = r2.f248d
                int r0 = r0 + (-1)
                r2.f248d = r0
                int r0 = r2.f247c
                int r0 = r0 + (-1)
                r2.f247c = r0
                r0 = 0
                r2.f249e = r0
                a.d.f r0 = r2.f250f
                int r1 = r2.f248d
                r0.mo4042a(r1)
                return
            L_0x001b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }
    }

    /* renamed from: a.d.f$b */
    /* loaded from: classes.dex */
    final class C0076b implements java.util.Set<java.util.Map.Entry<K, V>> {

        /* renamed from: b */
        final /* synthetic */ p000a.p013d.AbstractC0074f f251b;

        C0076b(p000a.p013d.AbstractC0074f r1) {
                r0 = this;
                r0.f251b = r1
                r0.<init>()
                return
        }

        /* renamed from: a */
        public boolean m4025a(java.util.Map.Entry<K, V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
                r0 = this;
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                r0.m4025a(r1)
                r1 = 0
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(java.util.Collection<? extends java.util.Map.Entry<K, V>> r5) {
                r4 = this;
                a.d.f r0 = r4.f251b
                int r0 = r0.mo4030c()
                java.util.Iterator r5 = r5.iterator()
            L_0x000a:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L_0x0024
                java.lang.Object r1 = r5.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                a.d.f r2 = r4.f251b
                java.lang.Object r3 = r1.getKey()
                java.lang.Object r1 = r1.getValue()
                r2.mo4038a(r3, r1)
                goto L_0x000a
            L_0x0024:
                a.d.f r5 = r4.f251b
                int r5 = r5.mo4030c()
                if (r0 == r5) goto L_0x002e
                r5 = 1
                goto L_0x002f
            L_0x002e:
                r5 = 0
            L_0x002f:
                return r5
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
                r1 = this;
                a.d.f r0 = r1.f251b
                r0.mo4043a()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                a.d.f r0 = r3.f251b
                java.lang.Object r2 = r4.getKey()
                int r0 = r0.mo4039a(r2)
                if (r0 >= 0) goto L_0x0015
                return r1
            L_0x0015:
                a.d.f r1 = r3.f251b
                r2 = 1
                java.lang.Object r0 = r1.mo4041a(r0, r2)
                java.lang.Object r4 = r4.getValue()
                boolean r4 = p000a.p013d.C0071c.m4067a(r0, r4)
                return r4
        }

        @Override // java.util.Set, java.util.Collection
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

        @Override // java.util.Set, java.util.Collection
        public boolean equals(java.lang.Object r1) {
                r0 = this;
                boolean r1 = p000a.p013d.AbstractC0074f.m4036a(r0, r1)
                return r1
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
                r6 = this;
                a.d.f r0 = r6.f251b
                int r0 = r0.mo4030c()
                r1 = 1
                int r0 = r0 - r1
                r2 = 0
                r3 = 0
            L_0x000a:
                if (r0 < 0) goto L_0x002d
                a.d.f r4 = r6.f251b
                java.lang.Object r4 = r4.mo4041a(r0, r2)
                a.d.f r5 = r6.f251b
                java.lang.Object r5 = r5.mo4041a(r0, r1)
                if (r4 != 0) goto L_0x001c
                r4 = 0
                goto L_0x0020
            L_0x001c:
                int r4 = r4.hashCode()
            L_0x0020:
                if (r5 != 0) goto L_0x0024
                r5 = 0
                goto L_0x0028
            L_0x0024:
                int r5 = r5.hashCode()
            L_0x0028:
                r4 = r4 ^ r5
                int r3 = r3 + r4
                int r0 = r0 + (-1)
                goto L_0x000a
            L_0x002d:
                return r3
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                a.d.f r0 = r1.f251b
                int r0 = r0.mo4030c()
                if (r0 != 0) goto L_0x000a
                r0 = 1
                goto L_0x000b
            L_0x000a:
                r0 = 0
            L_0x000b:
                return r0
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r2 = this;
                a.d.f$d r0 = new a.d.f$d
                a.d.f r1 = r2.f251b
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(java.lang.Object r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(java.util.Collection<?> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(java.util.Collection<?> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
                r1 = this;
                a.d.f r0 = r1.f251b
                int r0 = r0.mo4030c()
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public java.lang.Object[] toArray() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }

    /* renamed from: a.d.f$c */
    /* loaded from: classes.dex */
    final class C0077c implements java.util.Set<K> {

        /* renamed from: b */
        final /* synthetic */ p000a.p013d.AbstractC0074f f252b;

        C0077c(p000a.p013d.AbstractC0074f r1) {
                r0 = this;
                r0.f252b = r1
                r0.<init>()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(java.util.Collection<? extends K> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
                r1 = this;
                a.d.f r0 = r1.f252b
                r0.mo4043a()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                a.d.f r0 = r1.f252b
                int r2 = r0.mo4039a(r2)
                if (r2 < 0) goto L_0x000a
                r2 = 1
                goto L_0x000b
            L_0x000a:
                r2 = 0
            L_0x000b:
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(java.util.Collection<?> r2) {
                r1 = this;
                a.d.f r0 = r1.f252b
                java.util.Map r0 = r0.mo4034b()
                boolean r2 = p000a.p013d.AbstractC0074f.m4037a(r0, r2)
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(java.lang.Object r1) {
                r0 = this;
                boolean r1 = p000a.p013d.AbstractC0074f.m4036a(r0, r1)
                return r1
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
                r4 = this;
                a.d.f r0 = r4.f252b
                int r0 = r0.mo4030c()
                int r0 = r0 + (-1)
                r1 = 0
                r2 = 0
            L_0x000a:
                if (r0 < 0) goto L_0x001e
                a.d.f r3 = r4.f252b
                java.lang.Object r3 = r3.mo4041a(r0, r1)
                if (r3 != 0) goto L_0x0016
                r3 = 0
                goto L_0x001a
            L_0x0016:
                int r3 = r3.hashCode()
            L_0x001a:
                int r2 = r2 + r3
                int r0 = r0 + (-1)
                goto L_0x000a
            L_0x001e:
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                a.d.f r0 = r1.f252b
                int r0 = r0.mo4030c()
                if (r0 != 0) goto L_0x000a
                r0 = 1
                goto L_0x000b
            L_0x000a:
                r0 = 0
            L_0x000b:
                return r0
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<K> iterator() {
                r3 = this;
                a.d.f$a r0 = new a.d.f$a
                a.d.f r1 = r3.f252b
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                a.d.f r0 = r1.f252b
                int r2 = r0.mo4039a(r2)
                if (r2 < 0) goto L_0x000f
                a.d.f r0 = r1.f252b
                r0.mo4042a(r2)
                r2 = 1
                return r2
            L_0x000f:
                r2 = 0
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(java.util.Collection<?> r2) {
                r1 = this;
                a.d.f r0 = r1.f252b
                java.util.Map r0 = r0.mo4034b()
                boolean r2 = p000a.p013d.AbstractC0074f.m4031b(r0, r2)
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(java.util.Collection<?> r2) {
                r1 = this;
                a.d.f r0 = r1.f252b
                java.util.Map r0 = r0.mo4034b()
                boolean r2 = p000a.p013d.AbstractC0074f.m4029c(r0, r2)
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
                r1 = this;
                a.d.f r0 = r1.f252b
                int r0 = r0.mo4030c()
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public java.lang.Object[] toArray() {
                r2 = this;
                a.d.f r0 = r2.f252b
                r1 = 0
                java.lang.Object[] r0 = r0.m4033b(r1)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] r3) {
                r2 = this;
                a.d.f r0 = r2.f252b
                r1 = 0
                java.lang.Object[] r3 = r0.m4035a(r3, r1)
                return r3
        }
    }

    /* renamed from: a.d.f$d */
    /* loaded from: classes.dex */
    final class C0078d implements java.util.Iterator<java.util.Map.Entry<K, V>>, java.util.Map.Entry<K, V> {

        /* renamed from: b */
        int f253b;

        /* renamed from: c */
        int f254c;

        /* renamed from: d */
        boolean f255d;

        /* renamed from: e */
        final /* synthetic */ p000a.p013d.AbstractC0074f f256e;

        C0078d(p000a.p013d.AbstractC0074f r2) {
                r1 = this;
                r1.f256e = r2
                r1.<init>()
                r0 = 0
                r1.f255d = r0
                int r2 = r2.mo4030c()
                int r2 = r2 + (-1)
                r1.f253b = r2
                r2 = -1
                r1.f254c = r2
                return
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object r5) {
                r4 = this;
                boolean r0 = r4.f255d
                if (r0 == 0) goto L_0x0033
                boolean r0 = r5 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L_0x000a
                return r1
            L_0x000a:
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                java.lang.Object r0 = r5.getKey()
                a.d.f r2 = r4.f256e
                int r3 = r4.f254c
                java.lang.Object r2 = r2.mo4041a(r3, r1)
                boolean r0 = p000a.p013d.C0071c.m4067a(r0, r2)
                r2 = 1
                if (r0 == 0) goto L_0x0032
                java.lang.Object r5 = r5.getValue()
                a.d.f r0 = r4.f256e
                int r3 = r4.f254c
                java.lang.Object r0 = r0.mo4041a(r3, r2)
                boolean r5 = p000a.p013d.C0071c.m4067a(r5, r0)
                if (r5 == 0) goto L_0x0032
                r1 = 1
            L_0x0032:
                return r1
            L_0x0033:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "This container does not support retaining Map.Entry objects"
                r5.<init>(r0)
                throw r5
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r3 = this;
                boolean r0 = r3.f255d
                if (r0 == 0) goto L_0x000e
                a.d.f r0 = r3.f256e
                int r1 = r3.f254c
                r2 = 0
                java.lang.Object r0 = r0.mo4041a(r1, r2)
                return r0
            L_0x000e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This container does not support retaining Map.Entry objects"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r3 = this;
                boolean r0 = r3.f255d
                if (r0 == 0) goto L_0x000e
                a.d.f r0 = r3.f256e
                int r1 = r3.f254c
                r2 = 1
                java.lang.Object r0 = r0.mo4041a(r1, r2)
                return r0
            L_0x000e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This container does not support retaining Map.Entry objects"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f254c
                int r1 = r2.f253b
                if (r0 >= r1) goto L_0x0008
                r0 = 1
                goto L_0x0009
            L_0x0008:
                r0 = 0
            L_0x0009:
                return r0
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
                r5 = this;
                boolean r0 = r5.f255d
                if (r0 == 0) goto L_0x0027
                a.d.f r0 = r5.f256e
                int r1 = r5.f254c
                r2 = 0
                java.lang.Object r0 = r0.mo4041a(r1, r2)
                a.d.f r1 = r5.f256e
                int r3 = r5.f254c
                r4 = 1
                java.lang.Object r1 = r1.mo4041a(r3, r4)
                if (r0 != 0) goto L_0x001a
                r0 = 0
                goto L_0x001e
            L_0x001a:
                int r0 = r0.hashCode()
            L_0x001e:
                if (r1 != 0) goto L_0x0021
                goto L_0x0025
            L_0x0021:
                int r2 = r1.hashCode()
            L_0x0025:
                r0 = r0 ^ r2
                return r0
            L_0x0027:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This container does not support retaining Map.Entry objects"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r0 = this;
                r0.next()
                return r0
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L_0x000f
                int r0 = r2.f254c
                r1 = 1
                int r0 = r0 + r1
                r2.f254c = r0
                r2.f255d = r1
                return r2
            L_0x000f:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                boolean r0 = r2.f255d
                if (r0 == 0) goto L_0x001b
                a.d.f r0 = r2.f256e
                int r1 = r2.f254c
                r0.mo4042a(r1)
                int r0 = r2.f254c
                int r0 = r0 + (-1)
                r2.f254c = r0
                int r0 = r2.f253b
                int r0 = r0 + (-1)
                r2.f253b = r0
                r0 = 0
                r2.f255d = r0
                return
            L_0x001b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r3) {
                r2 = this;
                boolean r0 = r2.f255d
                if (r0 == 0) goto L_0x000d
                a.d.f r0 = r2.f256e
                int r1 = r2.f254c
                java.lang.Object r3 = r0.mo4040a(r1, r3)
                return r3
            L_0x000d:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "This container does not support retaining Map.Entry objects"
                r3.<init>(r0)
                throw r3
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Object r1 = r2.getKey()
                r0.append(r1)
                java.lang.String r1 = "="
                r0.append(r1)
                java.lang.Object r1 = r2.getValue()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: a.d.f$e */
    /* loaded from: classes.dex */
    final class C0079e implements java.util.Collection<V> {

        /* renamed from: b */
        final /* synthetic */ p000a.p013d.AbstractC0074f f257b;

        C0079e(p000a.p013d.AbstractC0074f r1) {
                r0 = this;
                r0.f257b = r1
                r0.<init>()
                return
        }

        @Override // java.util.Collection
        public boolean add(V r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Collection
        public boolean addAll(java.util.Collection<? extends V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Collection
        public void clear() {
                r1 = this;
                a.d.f r0 = r1.f257b
                r0.mo4043a()
                return
        }

        @Override // java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                a.d.f r0 = r1.f257b
                int r2 = r0.mo4032b(r2)
                if (r2 < 0) goto L_0x000a
                r2 = 1
                goto L_0x000b
            L_0x000a:
                r2 = 0
            L_0x000b:
                return r2
        }

        @Override // java.util.Collection
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

        @Override // java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                a.d.f r0 = r1.f257b
                int r0 = r0.mo4030c()
                if (r0 != 0) goto L_0x000a
                r0 = 1
                goto L_0x000b
            L_0x000a:
                r0 = 0
            L_0x000b:
                return r0
        }

        @Override // java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
                r3 = this;
                a.d.f$a r0 = new a.d.f$a
                a.d.f r1 = r3.f257b
                r2 = 1
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.Collection
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                a.d.f r0 = r1.f257b
                int r2 = r0.mo4032b(r2)
                if (r2 < 0) goto L_0x000f
                a.d.f r0 = r1.f257b
                r0.mo4042a(r2)
                r2 = 1
                return r2
            L_0x000f:
                r2 = 0
                return r2
        }

        @Override // java.util.Collection
        public boolean removeAll(java.util.Collection<?> r6) {
                r5 = this;
                a.d.f r0 = r5.f257b
                int r0 = r0.mo4030c()
                r1 = 0
                r2 = 0
            L_0x0008:
                if (r1 >= r0) goto L_0x0023
                a.d.f r3 = r5.f257b
                r4 = 1
                java.lang.Object r3 = r3.mo4041a(r1, r4)
                boolean r3 = r6.contains(r3)
                if (r3 == 0) goto L_0x0021
                a.d.f r2 = r5.f257b
                r2.mo4042a(r1)
                int r1 = r1 + (-1)
                int r0 = r0 + (-1)
                r2 = 1
            L_0x0021:
                int r1 = r1 + r4
                goto L_0x0008
            L_0x0023:
                return r2
        }

        @Override // java.util.Collection
        public boolean retainAll(java.util.Collection<?> r6) {
                r5 = this;
                a.d.f r0 = r5.f257b
                int r0 = r0.mo4030c()
                r1 = 0
                r2 = 0
            L_0x0008:
                if (r1 >= r0) goto L_0x0023
                a.d.f r3 = r5.f257b
                r4 = 1
                java.lang.Object r3 = r3.mo4041a(r1, r4)
                boolean r3 = r6.contains(r3)
                if (r3 != 0) goto L_0x0021
                a.d.f r2 = r5.f257b
                r2.mo4042a(r1)
                int r1 = r1 + (-1)
                int r0 = r0 + (-1)
                r2 = 1
            L_0x0021:
                int r1 = r1 + r4
                goto L_0x0008
            L_0x0023:
                return r2
        }

        @Override // java.util.Collection
        public int size() {
                r1 = this;
                a.d.f r0 = r1.f257b
                int r0 = r0.mo4030c()
                return r0
        }

        @Override // java.util.Collection
        public java.lang.Object[] toArray() {
                r2 = this;
                a.d.f r0 = r2.f257b
                r1 = 1
                java.lang.Object[] r0 = r0.m4033b(r1)
                return r0
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] r3) {
                r2 = this;
                a.d.f r0 = r2.f257b
                r1 = 1
                java.lang.Object[] r3 = r0.m4035a(r3, r1)
                return r3
        }
    }

    AbstractC0074f() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static <K, V> boolean m4037a(java.util.Map<K, V> r1, java.util.Collection<?> r2) {
            java.util.Iterator r2 = r2.iterator()
        L_0x0004:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L_0x0004
            r1 = 0
            return r1
        L_0x0016:
            r1 = 1
            return r1
    }

    /* renamed from: a */
    public static <T> boolean m4036a(java.util.Set<T> r4, java.lang.Object r5) {
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof java.util.Set
            r2 = 0
            if (r1 == 0) goto L_0x001e
            java.util.Set r5 = (java.util.Set) r5
            int r1 = r4.size()     // Catch: NullPointerException | ClassCastException -> 0x001e
            int r3 = r5.size()     // Catch: NullPointerException | ClassCastException -> 0x001e
            if (r1 != r3) goto L_0x001c
            boolean r4 = r4.containsAll(r5)     // Catch: NullPointerException | ClassCastException -> 0x001e
            if (r4 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        L_0x001e:
            return r2
    }

    /* renamed from: b */
    public static <K, V> boolean m4031b(java.util.Map<K, V> r2, java.util.Collection<?> r3) {
            int r0 = r2.size()
            java.util.Iterator r3 = r3.iterator()
        L_0x0008:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0016
            java.lang.Object r1 = r3.next()
            r2.remove(r1)
            goto L_0x0008
        L_0x0016:
            int r2 = r2.size()
            if (r0 == r2) goto L_0x001e
            r2 = 1
            goto L_0x001f
        L_0x001e:
            r2 = 0
        L_0x001f:
            return r2
    }

    /* renamed from: c */
    public static <K, V> boolean m4029c(java.util.Map<K, V> r3, java.util.Collection<?> r4) {
            int r0 = r3.size()
            java.util.Set r1 = r3.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x000c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0020
            java.lang.Object r2 = r1.next()
            boolean r2 = r4.contains(r2)
            if (r2 != 0) goto L_0x000c
            r1.remove()
            goto L_0x000c
        L_0x0020:
            int r3 = r3.size()
            if (r0 == r3) goto L_0x0028
            r3 = 1
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            return r3
    }

    /* renamed from: a */
    protected abstract int mo4039a(java.lang.Object r1);

    /* renamed from: a */
    protected abstract java.lang.Object mo4041a(int r1, int r2);

    /* renamed from: a */
    protected abstract V mo4040a(int r1, V r2);

    /* renamed from: a */
    protected abstract void mo4043a();

    /* renamed from: a */
    protected abstract void mo4042a(int r1);

    /* renamed from: a */
    protected abstract void mo4038a(K r1, V r2);

    /* renamed from: a */
    public <T> T[] m4035a(T[] r4, int r5) {
            r3 = this;
            int r0 = r3.mo4030c()
            int r1 = r4.length
            if (r1 >= r0) goto L_0x0015
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r4 = r4.getComponentType()
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r0)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
        L_0x0015:
            r1 = 0
        L_0x0016:
            if (r1 >= r0) goto L_0x0021
            java.lang.Object r2 = r3.mo4041a(r1, r5)
            r4[r1] = r2
            int r1 = r1 + 1
            goto L_0x0016
        L_0x0021:
            int r5 = r4.length
            if (r5 <= r0) goto L_0x0027
            r5 = 0
            r4[r0] = r5
        L_0x0027:
            return r4
    }

    /* renamed from: b */
    protected abstract int mo4032b(java.lang.Object r1);

    /* renamed from: b */
    protected abstract java.util.Map<K, V> mo4034b();

    /* renamed from: b */
    public java.lang.Object[] m4033b(int r5) {
            r4 = this;
            int r0 = r4.mo4030c()
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
        L_0x0007:
            if (r2 >= r0) goto L_0x0012
            java.lang.Object r3 = r4.mo4041a(r2, r5)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L_0x0007
        L_0x0012:
            return r1
    }

    /* renamed from: c */
    protected abstract int mo4030c();

    /* renamed from: d */
    public java.util.Set<java.util.Map.Entry<K, V>> m4028d() {
            r1 = this;
            a.d.f<K, V>$b r0 = r1.f243a
            if (r0 != 0) goto L_0x000b
            a.d.f$b r0 = new a.d.f$b
            r0.<init>(r1)
            r1.f243a = r0
        L_0x000b:
            a.d.f<K, V>$b r0 = r1.f243a
            return r0
    }

    /* renamed from: e */
    public java.util.Set<K> m4027e() {
            r1 = this;
            a.d.f<K, V>$c r0 = r1.f244b
            if (r0 != 0) goto L_0x000b
            a.d.f$c r0 = new a.d.f$c
            r0.<init>(r1)
            r1.f244b = r0
        L_0x000b:
            a.d.f<K, V>$c r0 = r1.f244b
            return r0
    }

    /* renamed from: f */
    public java.util.Collection<V> m4026f() {
            r1 = this;
            a.d.f<K, V>$e r0 = r1.f245c
            if (r0 != 0) goto L_0x000b
            a.d.f$e r0 = new a.d.f$e
            r0.<init>(r1)
            r1.f245c = r0
        L_0x000b:
            a.d.f<K, V>$e r0 = r1.f245c
            return r0
    }
}
