package p000a.p014e.p015a.p016j;

/* renamed from: a.e.a.j.q */
/* loaded from: classes.dex */
public class C0117q extends p000a.p014e.p015a.p016j.C0102f {

    /* renamed from: k0 */
    protected java.util.ArrayList<p000a.p014e.p015a.p016j.C0102f> f534k0;

    public C0117q() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f534k0 = r0
            return
    }

    @Override // p000a.p014e.p015a.p016j.C0102f
    /* renamed from: D */
    public void mo3743D() {
            r1 = this;
            java.util.ArrayList<a.e.a.j.f> r0 = r1.f534k0
            r0.clear()
            super.mo3743D()
            return
    }

    @Override // p000a.p014e.p015a.p016j.C0102f
    /* renamed from: H */
    public void mo3742H() {
            r5 = this;
            super.mo3742H()
            java.util.ArrayList<a.e.a.j.f> r0 = r5.f534k0
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            int r0 = r0.size()
            r1 = 0
        L_0x000d:
            if (r1 >= r0) goto L_0x002c
            java.util.ArrayList<a.e.a.j.f> r2 = r5.f534k0
            java.lang.Object r2 = r2.get(r1)
            a.e.a.j.f r2 = (p000a.p014e.p015a.p016j.C0102f) r2
            int r3 = r5.m3844g()
            int r4 = r5.m3842h()
            r2.mo3737b(r3, r4)
            boolean r3 = r2 instanceof p000a.p014e.p015a.p016j.C0105g
            if (r3 != 0) goto L_0x0029
            r2.mo3742H()
        L_0x0029:
            int r1 = r1 + 1
            goto L_0x000d
        L_0x002c:
            return
    }

    /* renamed from: J */
    public p000a.p014e.p015a.p016j.C0105g m3741J() {
            r4 = this;
            a.e.a.j.f r0 = r4.m3836k()
            boolean r1 = r4 instanceof p000a.p014e.p015a.p016j.C0105g
            if (r1 == 0) goto L_0x000c
            r1 = r4
            a.e.a.j.g r1 = (p000a.p014e.p015a.p016j.C0105g) r1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            if (r0 == 0) goto L_0x001c
            a.e.a.j.f r2 = r0.m3836k()
            boolean r3 = r0 instanceof p000a.p014e.p015a.p016j.C0105g
            if (r3 == 0) goto L_0x001a
            r1 = r0
            a.e.a.j.g r1 = (p000a.p014e.p015a.p016j.C0105g) r1
        L_0x001a:
            r0 = r2
            goto L_0x000d
        L_0x001c:
            return r1
    }

    /* renamed from: K */
    public void mo3740K() {
            r4 = this;
            r4.mo3742H()
            java.util.ArrayList<a.e.a.j.f> r0 = r4.f534k0
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            int r0 = r0.size()
            r1 = 0
        L_0x000d:
            if (r1 >= r0) goto L_0x0023
            java.util.ArrayList<a.e.a.j.f> r2 = r4.f534k0
            java.lang.Object r2 = r2.get(r1)
            a.e.a.j.f r2 = (p000a.p014e.p015a.p016j.C0102f) r2
            boolean r3 = r2 instanceof p000a.p014e.p015a.p016j.C0117q
            if (r3 == 0) goto L_0x0020
            a.e.a.j.q r2 = (p000a.p014e.p015a.p016j.C0117q) r2
            r2.mo3740K()
        L_0x0020:
            int r1 = r1 + 1
            goto L_0x000d
        L_0x0023:
            return
    }

    /* renamed from: L */
    public void m3739L() {
            r1 = this;
            java.util.ArrayList<a.e.a.j.f> r0 = r1.f534k0
            r0.clear()
            return
    }

    @Override // p000a.p014e.p015a.p016j.C0102f
    /* renamed from: a */
    public void mo3738a(p000a.p014e.p015a.C0084c r4) {
            r3 = this;
            super.mo3738a(r4)
            java.util.ArrayList<a.e.a.j.f> r0 = r3.f534k0
            int r0 = r0.size()
            r1 = 0
        L_0x000a:
            if (r1 >= r0) goto L_0x001a
            java.util.ArrayList<a.e.a.j.f> r2 = r3.f534k0
            java.lang.Object r2 = r2.get(r1)
            a.e.a.j.f r2 = (p000a.p014e.p015a.p016j.C0102f) r2
            r2.mo3738a(r4)
            int r1 = r1 + 1
            goto L_0x000a
        L_0x001a:
            return
    }

    @Override // p000a.p014e.p015a.p016j.C0102f
    /* renamed from: b */
    public void mo3737b(int r4, int r5) {
            r3 = this;
            super.mo3737b(r4, r5)
            java.util.ArrayList<a.e.a.j.f> r4 = r3.f534k0
            int r4 = r4.size()
            r5 = 0
        L_0x000a:
            if (r5 >= r4) goto L_0x0022
            java.util.ArrayList<a.e.a.j.f> r0 = r3.f534k0
            java.lang.Object r0 = r0.get(r5)
            a.e.a.j.f r0 = (p000a.p014e.p015a.p016j.C0102f) r0
            int r1 = r3.m3828o()
            int r2 = r3.m3826p()
            r0.mo3737b(r1, r2)
            int r5 = r5 + 1
            goto L_0x000a
        L_0x0022:
            return
    }

    /* renamed from: b */
    public void m3736b(p000a.p014e.p015a.p016j.C0102f r2) {
            r1 = this;
            java.util.ArrayList<a.e.a.j.f> r0 = r1.f534k0
            r0.add(r2)
            a.e.a.j.f r0 = r2.m3836k()
            if (r0 == 0) goto L_0x0014
            a.e.a.j.f r0 = r2.m3836k()
            a.e.a.j.q r0 = (p000a.p014e.p015a.p016j.C0117q) r0
            r0.m3735c(r2)
        L_0x0014:
            r2.m3870a(r1)
            return
    }

    /* renamed from: c */
    public void m3735c(p000a.p014e.p015a.p016j.C0102f r2) {
            r1 = this;
            java.util.ArrayList<a.e.a.j.f> r0 = r1.f534k0
            r0.remove(r2)
            r0 = 0
            r2.m3870a(r0)
            return
    }
}
