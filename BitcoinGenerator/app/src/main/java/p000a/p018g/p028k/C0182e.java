package p000a.p018g.p028k;

/* renamed from: a.g.k.e */
/* loaded from: classes.dex */
public class C0182e<T> implements p000a.p018g.p028k.AbstractC0181d<T> {

    /* renamed from: a */
    private final java.lang.Object[] f633a;

    /* renamed from: b */
    private int f634b;

    public C0182e(int r2) {
            r1 = this;
            r1.<init>()
            if (r2 <= 0) goto L_0x000a
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.f633a = r2
            return
        L_0x000a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The max pool size must be > 0"
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: b */
    private boolean m3560b(T r4) {
            r3 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            int r2 = r3.f634b
            if (r1 >= r2) goto L_0x0011
            java.lang.Object[] r2 = r3.f633a
            r2 = r2[r1]
            if (r2 != r4) goto L_0x000e
            r4 = 1
            return r4
        L_0x000e:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x0011:
            return r0
    }

    @Override // p000a.p018g.p028k.AbstractC0181d
    /* renamed from: a */
    public T mo3559a() {
            r5 = this;
            int r0 = r5.f634b
            r1 = 0
            if (r0 <= 0) goto L_0x0012
            int r2 = r0 + (-1)
            java.lang.Object[] r3 = r5.f633a
            r4 = r3[r2]
            r3[r2] = r1
            int r0 = r0 + (-1)
            r5.f634b = r0
            return r4
        L_0x0012:
            return r1
    }

    @Override // p000a.p018g.p028k.AbstractC0181d
    /* renamed from: a */
    public boolean mo3558a(T r4) {
            r3 = this;
            boolean r0 = r3.m3560b(r4)
            if (r0 != 0) goto L_0x0016
            int r0 = r3.f634b
            java.lang.Object[] r1 = r3.f633a
            int r2 = r1.length
            if (r0 >= r2) goto L_0x0014
            r1[r0] = r4
            r4 = 1
            int r0 = r0 + r4
            r3.f634b = r0
            return r4
        L_0x0014:
            r4 = 0
            return r4
        L_0x0016:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already in the pool!"
            r4.<init>(r0)
            throw r4
    }
}
