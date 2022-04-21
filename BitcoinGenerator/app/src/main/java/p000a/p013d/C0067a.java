package p000a.p013d;

/* renamed from: a.d.a */
/* loaded from: classes.dex */
public class C0067a<K, V> extends p000a.p013d.C0080g<K, V> implements java.util.Map<K, V> {

    /* renamed from: i */
    p000a.p013d.AbstractC0074f<K, V> f214i;

    /* renamed from: a.d.a$a */
    /* loaded from: classes.dex */
    class C0068a extends p000a.p013d.AbstractC0074f<K, V> {

        /* renamed from: d */
        final /* synthetic */ p000a.p013d.C0067a f215d;

        C0068a(p000a.p013d.C0067a r1) {
                r0 = this;
                r0.f215d = r1
                r0.<init>()
                return
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: a */
        protected int mo4039a(java.lang.Object r2) {
                r1 = this;
                a.d.a r0 = r1.f215d
                int r2 = r0.m4020a(r2)
                return r2
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: a */
        protected java.lang.Object mo4041a(int r2, int r3) {
                r1 = this;
                a.d.a r0 = r1.f215d
                java.lang.Object[] r0 = r0.f263c
                int r2 = r2 << 1
                int r2 = r2 + r3
                r2 = r0[r2]
                return r2
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: a */
        protected V mo4040a(int r2, V r3) {
                r1 = this;
                a.d.a r0 = r1.f215d
                java.lang.Object r2 = r0.m4022a(r2, r3)
                return r2
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: a */
        protected void mo4043a() {
                r1 = this;
                a.d.a r0 = r1.f215d
                r0.clear()
                return
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: a */
        protected void mo4042a(int r2) {
                r1 = this;
                a.d.a r0 = r1.f215d
                r0.m4014c(r2)
                return
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: a */
        protected void mo4038a(K r2, V r3) {
                r1 = this;
                a.d.a r0 = r1.f215d
                r0.put(r2, r3)
                return
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: b */
        protected int mo4032b(java.lang.Object r2) {
                r1 = this;
                a.d.a r0 = r1.f215d
                int r2 = r0.m4015b(r2)
                return r2
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: b */
        protected java.util.Map<K, V> mo4034b() {
                r1 = this;
                a.d.a r0 = r1.f215d
                return r0
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: c */
        protected int mo4030c() {
                r1 = this;
                a.d.a r0 = r1.f215d
                int r0 = r0.f264d
                return r0
        }
    }

    public C0067a() {
            r0 = this;
            r0.<init>()
            return
    }

    public C0067a(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public C0067a(p000a.p013d.C0080g r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* renamed from: b */
    private p000a.p013d.AbstractC0074f<K, V> m4078b() {
            r1 = this;
            a.d.f<K, V> r0 = r1.f214i
            if (r0 != 0) goto L_0x000b
            a.d.a$a r0 = new a.d.a$a
            r0.<init>(r1)
            r1.f214i = r0
        L_0x000b:
            a.d.f<K, V> r0 = r1.f214i
            return r0
    }

    /* renamed from: a */
    public boolean m4079a(java.util.Collection<?> r1) {
            r0 = this;
            boolean r1 = p000a.p013d.AbstractC0074f.m4029c(r0, r1)
            return r1
    }

    @Override // java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            a.d.f r0 = r1.m4078b()
            java.util.Set r0 = r0.m4028d()
            return r0
    }

    @Override // java.util.Map
    public java.util.Set<K> keySet() {
            r1 = this;
            a.d.f r0 = r1.m4078b()
            java.util.Set r0 = r0.m4027e()
            return r0
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> r3) {
            r2 = this;
            int r0 = r2.f264d
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.m4023a(r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0012:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.put(r1, r0)
            goto L_0x0012
        L_0x002a:
            return
    }

    @Override // java.util.Map
    public java.util.Collection<V> values() {
            r1 = this;
            a.d.f r0 = r1.m4078b()
            java.util.Collection r0 = r0.m4026f()
            return r0
    }
}
