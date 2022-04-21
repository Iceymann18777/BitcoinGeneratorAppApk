package p000a.p014e.p015a.p016j;

/* renamed from: a.e.a.j.m */
/* loaded from: classes.dex */
public class C0112m extends p000a.p014e.p015a.p016j.C0114o {

    /* renamed from: c */
    p000a.p014e.p015a.p016j.C0097e f510c;

    /* renamed from: d */
    p000a.p014e.p015a.p016j.C0112m f511d;

    /* renamed from: e */
    float f512e;

    /* renamed from: f */
    p000a.p014e.p015a.p016j.C0112m f513f;

    /* renamed from: g */
    float f514g;

    /* renamed from: h */
    int f515h;

    /* renamed from: i */
    private p000a.p014e.p015a.p016j.C0112m f516i;

    /* renamed from: j */
    private p000a.p014e.p015a.p016j.C0113n f517j;

    /* renamed from: k */
    private int f518k;

    /* renamed from: l */
    private p000a.p014e.p015a.p016j.C0113n f519l;

    /* renamed from: m */
    private int f520m;

    public C0112m(p000a.p014e.p015a.p016j.C0097e r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f515h = r0
            r0 = 0
            r2.f517j = r0
            r1 = 1
            r2.f518k = r1
            r2.f519l = r0
            r2.f520m = r1
            r2.f510c = r3
            return
    }

    /* renamed from: a */
    java.lang.String m3766a(int r2) {
            r1 = this;
            r0 = 1
            if (r2 != r0) goto L_0x0006
            java.lang.String r2 = "DIRECT"
            return r2
        L_0x0006:
            r0 = 2
            if (r2 != r0) goto L_0x000c
            java.lang.String r2 = "CENTER"
            return r2
        L_0x000c:
            r0 = 3
            if (r2 != r0) goto L_0x0012
            java.lang.String r2 = "MATCH"
            return r2
        L_0x0012:
            r0 = 4
            if (r2 != r0) goto L_0x0018
            java.lang.String r2 = "CHAIN"
            return r2
        L_0x0018:
            r0 = 5
            if (r2 != r0) goto L_0x001e
            java.lang.String r2 = "BARRIER"
            return r2
        L_0x001e:
            java.lang.String r2 = "UNCONNECTED"
            return r2
    }

    /* renamed from: a */
    public void m3765a(int r1, p000a.p014e.p015a.p016j.C0112m r2, int r3) {
            r0 = this;
            r0.f515h = r1
            r0.f511d = r2
            float r1 = (float) r3
            r0.f512e = r1
            a.e.a.j.m r1 = r0.f511d
            r1.m3752a(r0)
            return
    }

    /* renamed from: a */
    void m3764a(p000a.p014e.p015a.C0086e r5) {
            r4 = this;
            a.e.a.j.e r0 = r4.f510c
            a.e.a.i r0 = r0.m3892e()
            a.e.a.j.m r1 = r4.f513f
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r1 != 0) goto L_0x0014
            float r1 = r4.f514g
            float r1 = r1 + r2
            int r1 = (int) r1
            r5.m3955a(r0, r1)
            goto L_0x0022
        L_0x0014:
            a.e.a.j.e r1 = r1.f510c
            a.e.a.i r1 = r5.m3949a(r1)
            float r3 = r4.f514g
            float r3 = r3 + r2
            int r2 = (int) r3
            r3 = 6
            r5.m3953a(r0, r1, r2, r3)
        L_0x0022:
            return
    }

    /* renamed from: a */
    public void m3763a(p000a.p014e.p015a.p016j.C0112m r2, float r3) {
            r1 = this;
            int r0 = r1.f523b
            if (r0 == 0) goto L_0x000e
            a.e.a.j.m r0 = r1.f513f
            if (r0 == r2) goto L_0x001d
            float r0 = r1.f514g
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x001d
        L_0x000e:
            r1.f513f = r2
            r1.f514g = r3
            int r2 = r1.f523b
            r3 = 1
            if (r2 != r3) goto L_0x001a
            r1.m3751b()
        L_0x001a:
            r1.m3753a()
        L_0x001d:
            return
    }

    /* renamed from: a */
    public void m3762a(p000a.p014e.p015a.p016j.C0112m r1, int r2) {
            r0 = this;
            r0.f511d = r1
            float r1 = (float) r2
            r0.f512e = r1
            a.e.a.j.m r1 = r0.f511d
            r1.m3752a(r0)
            return
    }

    /* renamed from: a */
    public void m3761a(p000a.p014e.p015a.p016j.C0112m r1, int r2, p000a.p014e.p015a.p016j.C0113n r3) {
            r0 = this;
            r0.f511d = r1
            a.e.a.j.m r1 = r0.f511d
            r1.m3752a(r0)
            r0.f517j = r3
            r0.f518k = r2
            a.e.a.j.n r1 = r0.f517j
            r1.m3752a(r0)
            return
    }

    /* renamed from: b */
    public void m3760b(int r1) {
            r0 = this;
            r0.f515h = r1
            return
    }

    /* renamed from: b */
    public void m3759b(p000a.p014e.p015a.p016j.C0112m r1, float r2) {
            r0 = this;
            r0.f516i = r1
            return
    }

    /* renamed from: b */
    public void m3758b(p000a.p014e.p015a.p016j.C0112m r1, int r2, p000a.p014e.p015a.p016j.C0113n r3) {
            r0 = this;
            r0.f516i = r1
            r0.f519l = r3
            r0.f520m = r2
            return
    }

    @Override // p000a.p014e.p015a.p016j.C0114o
    /* renamed from: d */
    public void mo3749d() {
            r3 = this;
            super.mo3749d()
            r0 = 0
            r3.f511d = r0
            r1 = 0
            r3.f512e = r1
            r3.f517j = r0
            r2 = 1
            r3.f518k = r2
            r3.f519l = r0
            r3.f520m = r2
            r3.f513f = r0
            r3.f514g = r1
            r3.f516i = r0
            r0 = 0
            r3.f515h = r0
            return
    }

    @Override // p000a.p014e.p015a.p016j.C0114o
    /* renamed from: e */
    public void mo3748e() {
            r8 = this;
            int r0 = r8.f523b
            r1 = 1
            if (r0 != r1) goto L_0x0006
            return
        L_0x0006:
            int r0 = r8.f515h
            r2 = 4
            if (r0 != r2) goto L_0x000c
            return
        L_0x000c:
            a.e.a.j.n r0 = r8.f517j
            if (r0 == 0) goto L_0x001e
            int r2 = r0.f523b
            if (r2 == r1) goto L_0x0015
            return
        L_0x0015:
            int r2 = r8.f518k
            float r2 = (float) r2
            float r0 = r0.f521c
            float r2 = r2 * r0
            r8.f512e = r2
        L_0x001e:
            a.e.a.j.n r0 = r8.f519l
            if (r0 == 0) goto L_0x0029
            int r2 = r0.f523b
            if (r2 == r1) goto L_0x0027
            return
        L_0x0027:
            float r0 = r0.f521c
        L_0x0029:
            int r0 = r8.f515h
            if (r0 != r1) goto L_0x004e
            a.e.a.j.m r0 = r8.f511d
            if (r0 == 0) goto L_0x0035
            int r0 = r0.f523b
            if (r0 != r1) goto L_0x004e
        L_0x0035:
            a.e.a.j.m r0 = r8.f511d
            if (r0 != 0) goto L_0x003e
            r8.f513f = r8
            float r0 = r8.f512e
            goto L_0x0047
        L_0x003e:
            a.e.a.j.m r1 = r0.f513f
            r8.f513f = r1
            float r0 = r0.f514g
            float r1 = r8.f512e
            float r0 = r0 + r1
        L_0x0047:
            r8.f514g = r0
            r8.m3753a()
            goto L_0x018b
        L_0x004e:
            int r0 = r8.f515h
            r2 = 2
            r3 = 1
            if (r0 != r2) goto L_0x0132
            a.e.a.j.m r0 = r8.f511d
            if (r0 == 0) goto L_0x0132
            int r0 = r0.f523b
            if (r0 != r1) goto L_0x0132
            a.e.a.j.m r0 = r8.f516i
            if (r0 == 0) goto L_0x0132
            a.e.a.j.m r0 = r0.f511d
            if (r0 == 0) goto L_0x0132
            int r0 = r0.f523b
            if (r0 != r1) goto L_0x0132
            a.e.a.f r0 = p000a.p014e.p015a.C0086e.m3934h()
            if (r0 == 0) goto L_0x0078
            a.e.a.f r0 = p000a.p014e.p015a.C0086e.m3934h()
            long r5 = r0.f328v
            long r5 = r5 + r3
            r0.f328v = r5
        L_0x0078:
            a.e.a.j.m r0 = r8.f511d
            a.e.a.j.m r0 = r0.f513f
            r8.f513f = r0
            a.e.a.j.m r0 = r8.f516i
            a.e.a.j.m r2 = r0.f511d
            a.e.a.j.m r2 = r2.f513f
            r0.f513f = r2
            a.e.a.j.e r0 = r8.f510c
            a.e.a.j.e$d r0 = r0.f374c
            a.e.a.j.e$d r2 = p000a.p014e.p015a.p016j.C0097e.EnumC0101d.f392e
            r3 = 0
            if (r0 == r2) goto L_0x0095
            a.e.a.j.e$d r2 = p000a.p014e.p015a.p016j.C0097e.EnumC0101d.f393f
            if (r0 != r2) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            r1 = 0
        L_0x0095:
            if (r1 == 0) goto L_0x00a0
            a.e.a.j.m r0 = r8.f511d
            float r0 = r0.f514g
            a.e.a.j.m r2 = r8.f516i
            a.e.a.j.m r2 = r2.f511d
            goto L_0x00a8
        L_0x00a0:
            a.e.a.j.m r0 = r8.f516i
            a.e.a.j.m r0 = r0.f511d
            float r0 = r0.f514g
            a.e.a.j.m r2 = r8.f511d
        L_0x00a8:
            float r2 = r2.f514g
            float r0 = r0 - r2
            a.e.a.j.e r2 = r8.f510c
            a.e.a.j.e$d r4 = r2.f374c
            a.e.a.j.e$d r5 = p000a.p014e.p015a.p016j.C0097e.EnumC0101d.f390c
            if (r4 == r5) goto L_0x00c7
            a.e.a.j.e$d r5 = p000a.p014e.p015a.p016j.C0097e.EnumC0101d.f392e
            if (r4 != r5) goto L_0x00b8
            goto L_0x00c7
        L_0x00b8:
            a.e.a.j.f r2 = r2.f373b
            int r2 = r2.m3840i()
            float r2 = (float) r2
            float r0 = r0 - r2
            a.e.a.j.e r2 = r8.f510c
            a.e.a.j.f r2 = r2.f373b
            float r2 = r2.f422W
            goto L_0x00d7
        L_0x00c7:
            a.e.a.j.e r2 = r8.f510c
            a.e.a.j.f r2 = r2.f373b
            int r2 = r2.m3820s()
            float r2 = (float) r2
            float r0 = r0 - r2
            a.e.a.j.e r2 = r8.f510c
            a.e.a.j.f r2 = r2.f373b
            float r2 = r2.f421V
        L_0x00d7:
            a.e.a.j.e r4 = r8.f510c
            int r4 = r4.m3895b()
            a.e.a.j.m r5 = r8.f516i
            a.e.a.j.e r5 = r5.f510c
            int r5 = r5.m3895b()
            a.e.a.j.e r6 = r8.f510c
            a.e.a.j.e r6 = r6.m3890g()
            a.e.a.j.m r7 = r8.f516i
            a.e.a.j.e r7 = r7.f510c
            a.e.a.j.e r7 = r7.m3890g()
            if (r6 != r7) goto L_0x00f9
            r2 = 1056964608(0x3f000000, float:0.5)
            r5 = 0
            goto L_0x00fa
        L_0x00f9:
            r3 = r4
        L_0x00fa:
            float r3 = (float) r3
            float r0 = r0 - r3
            float r4 = (float) r5
            float r0 = r0 - r4
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x011a
            a.e.a.j.m r1 = r8.f516i
            a.e.a.j.m r6 = r1.f511d
            float r6 = r6.f514g
            float r6 = r6 + r4
            float r4 = r0 * r2
            float r6 = r6 + r4
            r1.f514g = r6
            a.e.a.j.m r1 = r8.f511d
            float r1 = r1.f514g
            float r1 = r1 - r3
            float r5 = r5 - r2
            float r0 = r0 * r5
            float r1 = r1 - r0
            r8.f514g = r1
            goto L_0x0176
        L_0x011a:
            a.e.a.j.m r1 = r8.f511d
            float r1 = r1.f514g
            float r1 = r1 + r3
            float r3 = r0 * r2
            float r1 = r1 + r3
            r8.f514g = r1
            a.e.a.j.m r1 = r8.f516i
            a.e.a.j.m r3 = r1.f511d
            float r3 = r3.f514g
            float r3 = r3 - r4
            float r5 = r5 - r2
            float r0 = r0 * r5
            float r3 = r3 - r0
            r1.f514g = r3
            goto L_0x0176
        L_0x0132:
            int r0 = r8.f515h
            r2 = 3
            if (r0 != r2) goto L_0x017f
            a.e.a.j.m r0 = r8.f511d
            if (r0 == 0) goto L_0x017f
            int r0 = r0.f523b
            if (r0 != r1) goto L_0x017f
            a.e.a.j.m r0 = r8.f516i
            if (r0 == 0) goto L_0x017f
            a.e.a.j.m r0 = r0.f511d
            if (r0 == 0) goto L_0x017f
            int r0 = r0.f523b
            if (r0 != r1) goto L_0x017f
            a.e.a.f r0 = p000a.p014e.p015a.C0086e.m3934h()
            if (r0 == 0) goto L_0x015a
            a.e.a.f r0 = p000a.p014e.p015a.C0086e.m3934h()
            long r1 = r0.f329w
            long r1 = r1 + r3
            r0.f329w = r1
        L_0x015a:
            a.e.a.j.m r0 = r8.f511d
            a.e.a.j.m r1 = r0.f513f
            r8.f513f = r1
            a.e.a.j.m r1 = r8.f516i
            a.e.a.j.m r2 = r1.f511d
            a.e.a.j.m r3 = r2.f513f
            r1.f513f = r3
            float r0 = r0.f514g
            float r3 = r8.f512e
            float r0 = r0 + r3
            r8.f514g = r0
            float r0 = r2.f514g
            float r2 = r1.f512e
            float r0 = r0 + r2
            r1.f514g = r0
        L_0x0176:
            r8.m3753a()
            a.e.a.j.m r0 = r8.f516i
            r0.m3753a()
            goto L_0x018b
        L_0x017f:
            int r0 = r8.f515h
            r1 = 5
            if (r0 != r1) goto L_0x018b
            a.e.a.j.e r0 = r8.f510c
            a.e.a.j.f r0 = r0.f373b
            r0.mo3881G()
        L_0x018b:
            return
    }

    /* renamed from: f */
    public float m3757f() {
            r1 = this;
            float r0 = r1.f514g
            return r0
    }

    /* renamed from: g */
    public void m3756g() {
            r4 = this;
            a.e.a.j.e r0 = r4.f510c
            a.e.a.j.e r0 = r0.m3890g()
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            a.e.a.j.e r1 = r0.m3890g()
            a.e.a.j.e r2 = r4.f510c
            if (r1 != r2) goto L_0x001a
            r1 = 4
            r4.f515h = r1
            a.e.a.j.m r2 = r0.m3893d()
            r2.f515h = r1
        L_0x001a:
            a.e.a.j.e r1 = r4.f510c
            int r1 = r1.m3895b()
            a.e.a.j.e r2 = r4.f510c
            a.e.a.j.e$d r2 = r2.f374c
            a.e.a.j.e$d r3 = p000a.p014e.p015a.p016j.C0097e.EnumC0101d.f392e
            if (r2 == r3) goto L_0x002c
            a.e.a.j.e$d r3 = p000a.p014e.p015a.p016j.C0097e.EnumC0101d.f393f
            if (r2 != r3) goto L_0x002d
        L_0x002c:
            int r1 = -r1
        L_0x002d:
            a.e.a.j.m r0 = r0.m3893d()
            r4.m3762a(r0, r1)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.f523b
            r1 = 1
            if (r0 != r1) goto L_0x0057
            a.e.a.j.m r0 = r3.f513f
            java.lang.String r1 = ", RESOLVED: "
            java.lang.String r2 = "["
            if (r0 != r3) goto L_0x0035
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            a.e.a.j.e r2 = r3.f510c
            r0.append(r2)
            r0.append(r1)
            float r1 = r3.f514g
            r0.append(r1)
            java.lang.String r1 = "]  type: "
        L_0x0024:
            r0.append(r1)
            int r1 = r3.f515h
            java.lang.String r1 = r3.m3766a(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0035:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            a.e.a.j.e r2 = r3.f510c
            r0.append(r2)
            r0.append(r1)
            a.e.a.j.m r1 = r3.f513f
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            float r1 = r3.f514g
            r0.append(r1)
            java.lang.String r1 = "] type: "
            goto L_0x0024
        L_0x0057:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{ "
            r0.append(r1)
            a.e.a.j.e r1 = r3.f510c
            r0.append(r1)
            java.lang.String r1 = " UNRESOLVED} type: "
            goto L_0x0024
    }
}
