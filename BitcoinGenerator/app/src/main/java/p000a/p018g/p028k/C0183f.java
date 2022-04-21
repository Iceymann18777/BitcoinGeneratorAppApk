package p000a.p018g.p028k;

/* renamed from: a.g.k.f */
/* loaded from: classes.dex */
public class C0183f<T> extends p000a.p018g.p028k.C0182e<T> {

    /* renamed from: c */
    private final java.lang.Object f635c;

    public C0183f(int r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.f635c = r1
            return
    }

    @Override // p000a.p018g.p028k.C0182e, p000a.p018g.p028k.AbstractC0181d
    /* renamed from: a */
    public T mo3559a() {
            r2 = this;
            java.lang.Object r0 = r2.f635c
            monitor-enter(r0)
            java.lang.Object r1 = super.mo3559a()     // Catch: all -> 0x0009
            monitor-exit(r0)     // Catch: all -> 0x0009
            return r1
        L_0x0009:
            r1 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x0009
            throw r1
    }

    @Override // p000a.p018g.p028k.C0182e, p000a.p018g.p028k.AbstractC0181d
    /* renamed from: a */
    public boolean mo3558a(T r2) {
            r1 = this;
            java.lang.Object r0 = r1.f635c
            monitor-enter(r0)
            boolean r2 = super.mo3558a(r2)     // Catch: all -> 0x0009
            monitor-exit(r0)     // Catch: all -> 0x0009
            return r2
        L_0x0009:
            r2 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x0009
            throw r2
    }
}
