package p000a.p007b.p008a.p010b;

/* renamed from: a.b.a.b.a */
/* loaded from: classes.dex */
public class C0048a<K, V> extends p000a.p007b.p008a.p010b.C0049b<K, V> {

    /* renamed from: f */
    private java.util.HashMap<K, p000a.p007b.p008a.p010b.C0049b.C0052c<K, V>> f164f;

    public C0048a() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f164f = r0
            return
    }

    @Override // p000a.p007b.p008a.p010b.C0049b
    /* renamed from: a */
    protected p000a.p007b.p008a.p010b.C0049b.C0052c<K, V> mo4142a(K r2) {
            r1 = this;
            java.util.HashMap<K, a.b.a.b.b$c<K, V>> r0 = r1.f164f
            java.lang.Object r2 = r0.get(r2)
            a.b.a.b.b$c r2 = (p000a.p007b.p008a.p010b.C0049b.C0052c) r2
            return r2
    }

    @Override // p000a.p007b.p008a.p010b.C0049b
    /* renamed from: b */
    public V mo4139b(K r2, V r3) {
            r1 = this;
            a.b.a.b.b$c r0 = r1.mo4142a(r2)
            if (r0 == 0) goto L_0x0009
            V r2 = r0.f170c
            return r2
        L_0x0009:
            java.util.HashMap<K, a.b.a.b.b$c<K, V>> r0 = r1.f164f
            a.b.a.b.b$c r3 = r1.m4141a(r2, r3)
            r0.put(r2, r3)
            r2 = 0
            return r2
    }

    /* renamed from: b */
    public java.util.Map.Entry<K, V> m4144b(K r2) {
            r1 = this;
            boolean r0 = r1.contains(r2)
            if (r0 == 0) goto L_0x0011
            java.util.HashMap<K, a.b.a.b.b$c<K, V>> r0 = r1.f164f
            java.lang.Object r2 = r0.get(r2)
            a.b.a.b.b$c r2 = (p000a.p007b.p008a.p010b.C0049b.C0052c) r2
            a.b.a.b.b$c<K, V> r2 = r2.f172e
            return r2
        L_0x0011:
            r2 = 0
            return r2
    }

    public boolean contains(K r2) {
            r1 = this;
            java.util.HashMap<K, a.b.a.b.b$c<K, V>> r0 = r1.f164f
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // p000a.p007b.p008a.p010b.C0049b
    public V remove(K r3) {
            r2 = this;
            java.lang.Object r0 = super.remove(r3)
            java.util.HashMap<K, a.b.a.b.b$c<K, V>> r1 = r2.f164f
            r1.remove(r3)
            return r0
    }
}
