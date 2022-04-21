package p000a.p045n;

/* renamed from: a.n.k0 */
/* loaded from: classes.dex */
class C0364k0 implements p000a.p045n.AbstractC0366l0 {

    /* renamed from: a */
    private final android.view.WindowId f1103a;

    C0364k0(android.view.View r1) {
            r0 = this;
            r0.<init>()
            android.view.WindowId r1 = r1.getWindowId()
            r0.f1103a = r1
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000a.p045n.C0364k0
            if (r0 == 0) goto L_0x0012
            a.n.k0 r2 = (p000a.p045n.C0364k0) r2
            android.view.WindowId r2 = r2.f1103a
            android.view.WindowId r0 = r1.f1103a
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
            android.view.WindowId r0 = r1.f1103a
            int r0 = r0.hashCode()
            return r0
    }
}
