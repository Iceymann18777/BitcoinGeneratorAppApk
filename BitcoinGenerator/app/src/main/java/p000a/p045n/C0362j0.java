package p000a.p045n;

/* renamed from: a.n.j0 */
/* loaded from: classes.dex */
class C0362j0 implements p000a.p045n.AbstractC0366l0 {

    /* renamed from: a */
    private final android.os.IBinder f1101a;

    C0362j0(android.os.IBinder r1) {
            r0 = this;
            r0.<init>()
            r0.f1101a = r1
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000a.p045n.C0362j0
            if (r0 == 0) goto L_0x0012
            a.n.j0 r2 = (p000a.p045n.C0362j0) r2
            android.os.IBinder r2 = r2.f1101a
            android.os.IBinder r0 = r1.f1101a
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0012
            r2 = 1
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            return r2
    }

    public int hashCode() {
            r1 = this;
            android.os.IBinder r0 = r1.f1101a
            int r0 = r0.hashCode()
            return r0
    }
}
