package p000a.p014e.p015a;

/* renamed from: a.e.a.h */
/* loaded from: classes.dex */
class C0090h<T> implements p000a.p014e.p015a.AbstractC0089g<T> {

    /* renamed from: a */
    private final java.lang.Object[] f333a;

    /* renamed from: b */
    private int f334b;

    C0090h(int r2) {
            r1 = this;
            r1.<init>()
            if (r2 <= 0) goto L_0x000a
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.f333a = r2
            return
        L_0x000a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The max pool size must be > 0"
            r2.<init>(r0)
            throw r2
    }

    @Override // p000a.p014e.p015a.AbstractC0089g
    /* renamed from: a */
    public T mo3928a() {
            r5 = this;
            int r0 = r5.f334b
            r1 = 0
            if (r0 <= 0) goto L_0x0012
            int r2 = r0 + (-1)
            java.lang.Object[] r3 = r5.f333a
            r4 = r3[r2]
            r3[r2] = r1
            int r0 = r0 + (-1)
            r5.f334b = r0
            return r4
        L_0x0012:
            return r1
    }

    @Override // p000a.p014e.p015a.AbstractC0089g
    /* renamed from: a */
    public void mo3926a(T[] r6, int r7) {
            r5 = this;
            int r0 = r6.length
            if (r7 <= r0) goto L_0x0004
            int r7 = r6.length
        L_0x0004:
            r0 = 0
        L_0x0005:
            if (r0 >= r7) goto L_0x0019
            r1 = r6[r0]
            int r2 = r5.f334b
            java.lang.Object[] r3 = r5.f333a
            int r4 = r3.length
            if (r2 >= r4) goto L_0x0016
            r3[r2] = r1
            int r2 = r2 + 1
            r5.f334b = r2
        L_0x0016:
            int r0 = r0 + 1
            goto L_0x0005
        L_0x0019:
            return
    }

    @Override // p000a.p014e.p015a.AbstractC0089g
    /* renamed from: a */
    public boolean mo3927a(T r4) {
            r3 = this;
            int r0 = r3.f334b
            java.lang.Object[] r1 = r3.f333a
            int r2 = r1.length
            if (r0 >= r2) goto L_0x000e
            r1[r0] = r4
            r4 = 1
            int r0 = r0 + r4
            r3.f334b = r0
            return r4
        L_0x000e:
            r4 = 0
            return r4
    }
}
