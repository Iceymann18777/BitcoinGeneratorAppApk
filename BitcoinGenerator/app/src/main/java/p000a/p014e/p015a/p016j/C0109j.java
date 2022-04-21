package p000a.p014e.p015a.p016j;

/* renamed from: a.e.a.j.j */
/* loaded from: classes.dex */
public class C0109j extends p000a.p014e.p015a.p016j.C0102f {

    /* renamed from: k0 */
    protected p000a.p014e.p015a.p016j.C0102f[] f507k0;

    /* renamed from: l0 */
    protected int f508l0;

    public C0109j() {
            r1 = this;
            r1.<init>()
            r0 = 4
            a.e.a.j.f[] r0 = new p000a.p014e.p015a.p016j.C0102f[r0]
            r1.f507k0 = r0
            r0 = 0
            r1.f508l0 = r0
            return
    }

    /* renamed from: J */
    public void m3773J() {
            r1 = this;
            r0 = 0
            r1.f508l0 = r0
            return
    }

    /* renamed from: b */
    public void m3772b(p000a.p014e.p015a.p016j.C0102f r4) {
            r3 = this;
            int r0 = r3.f508l0
            int r0 = r0 + 1
            a.e.a.j.f[] r1 = r3.f507k0
            int r2 = r1.length
            if (r0 <= r2) goto L_0x0014
            int r0 = r1.length
            int r0 = r0 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            a.e.a.j.f[] r0 = (p000a.p014e.p015a.p016j.C0102f[]) r0
            r3.f507k0 = r0
        L_0x0014:
            a.e.a.j.f[] r0 = r3.f507k0
            int r1 = r3.f508l0
            r0[r1] = r4
            int r1 = r1 + 1
            r3.f508l0 = r1
            return
    }
}
