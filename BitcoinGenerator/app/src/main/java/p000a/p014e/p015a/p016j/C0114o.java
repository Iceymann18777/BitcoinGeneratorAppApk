package p000a.p014e.p015a.p016j;

/* renamed from: a.e.a.j.o */
/* loaded from: classes.dex */
public class C0114o {

    /* renamed from: a */
    java.util.HashSet<p000a.p014e.p015a.p016j.C0114o> f522a;

    /* renamed from: b */
    int f523b;

    public C0114o() {
            r2 = this;
            r2.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 2
            r0.<init>(r1)
            r2.f522a = r0
            r0 = 0
            r2.f523b = r0
            return
    }

    /* renamed from: a */
    public void m3753a() {
            r2 = this;
            r0 = 1
            r2.f523b = r0
            java.util.HashSet<a.e.a.j.o> r0 = r2.f522a
            java.util.Iterator r0 = r0.iterator()
        L_0x0009:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0019
            java.lang.Object r1 = r0.next()
            a.e.a.j.o r1 = (p000a.p014e.p015a.p016j.C0114o) r1
            r1.mo3748e()
            goto L_0x0009
        L_0x0019:
            return
    }

    /* renamed from: a */
    public void m3752a(p000a.p014e.p015a.p016j.C0114o r2) {
            r1 = this;
            java.util.HashSet<a.e.a.j.o> r0 = r1.f522a
            r0.add(r2)
            return
    }

    /* renamed from: b */
    public void m3751b() {
            r2 = this;
            r0 = 0
            r2.f523b = r0
            java.util.HashSet<a.e.a.j.o> r0 = r2.f522a
            java.util.Iterator r0 = r0.iterator()
        L_0x0009:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0019
            java.lang.Object r1 = r0.next()
            a.e.a.j.o r1 = (p000a.p014e.p015a.p016j.C0114o) r1
            r1.m3751b()
            goto L_0x0009
        L_0x0019:
            return
    }

    /* renamed from: c */
    public boolean m3750c() {
            r2 = this;
            int r0 = r2.f523b
            r1 = 1
            if (r0 != r1) goto L_0x0006
            goto L_0x0007
        L_0x0006:
            r1 = 0
        L_0x0007:
            return r1
    }

    /* renamed from: d */
    public void mo3749d() {
            r1 = this;
            r0 = 0
            r1.f523b = r0
            java.util.HashSet<a.e.a.j.o> r0 = r1.f522a
            r0.clear()
            return
    }

    /* renamed from: e */
    public void mo3748e() {
            r0 = this;
            return
    }
}
