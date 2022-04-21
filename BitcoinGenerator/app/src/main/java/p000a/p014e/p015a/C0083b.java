package p000a.p014e.p015a;

/* renamed from: a.e.a.b */
/* loaded from: classes.dex */
public class C0083b implements p000a.p014e.p015a.C0086e.AbstractC0087a {

    /* renamed from: a */
    p000a.p014e.p015a.C0091i f281a;

    /* renamed from: b */
    float f282b;

    /* renamed from: c */
    boolean f283c;

    /* renamed from: d */
    public final p000a.p014e.p015a.C0082a f284d;

    /* renamed from: e */
    boolean f285e;

    public C0083b(p000a.p014e.p015a.C0084c r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f281a = r0
            r0 = 0
            r1.f282b = r0
            r0 = 0
            r1.f285e = r0
            a.e.a.a r0 = new a.e.a.a
            r0.<init>(r1, r2)
            r1.f284d = r0
            return
    }

    /* renamed from: a */
    public p000a.p014e.p015a.C0083b m3983a(float r5, float r6, float r7, p000a.p014e.p015a.C0091i r8, p000a.p014e.p015a.C0091i r9, p000a.p014e.p015a.C0091i r10, p000a.p014e.p015a.C0091i r11) {
            r4 = this;
            r0 = 0
            r4.f282b = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x0047
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0010
            goto L_0x0047
        L_0x0010:
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x001f
            a.e.a.a r5 = r4.f284d
            r5.m3992a(r8, r2)
            a.e.a.a r5 = r4.f284d
            r5.m3992a(r9, r1)
            goto L_0x005b
        L_0x001f:
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x002e
            a.e.a.a r5 = r4.f284d
            r5.m3992a(r10, r2)
            a.e.a.a r5 = r4.f284d
            r5.m3992a(r11, r1)
            goto L_0x005b
        L_0x002e:
            float r5 = r5 / r6
            float r7 = r7 / r6
            float r5 = r5 / r7
            a.e.a.a r6 = r4.f284d
            r6.m3992a(r8, r2)
            a.e.a.a r6 = r4.f284d
            r6.m3992a(r9, r1)
            a.e.a.a r6 = r4.f284d
            r6.m3992a(r11, r5)
            a.e.a.a r6 = r4.f284d
            float r5 = -r5
            r6.m3992a(r10, r5)
            goto L_0x005b
        L_0x0047:
            a.e.a.a r5 = r4.f284d
            r5.m3992a(r8, r2)
            a.e.a.a r5 = r4.f284d
            r5.m3992a(r9, r1)
            a.e.a.a r5 = r4.f284d
            r5.m3992a(r11, r2)
            a.e.a.a r5 = r4.f284d
            r5.m3992a(r10, r1)
        L_0x005b:
            return r4
    }

    /* renamed from: a */
    public p000a.p014e.p015a.C0083b m3981a(p000a.p014e.p015a.C0086e r4, int r5) {
            r3 = this;
            a.e.a.a r0 = r3.f284d
            java.lang.String r1 = "ep"
            a.e.a.i r1 = r4.m3962a(r5, r1)
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.m3992a(r1, r2)
            a.e.a.a r0 = r3.f284d
            java.lang.String r1 = "em"
            a.e.a.i r4 = r4.m3962a(r5, r1)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.m3992a(r4, r5)
            return r3
    }

    /* renamed from: a */
    p000a.p014e.p015a.C0083b m3980a(p000a.p014e.p015a.C0091i r2, int r3) {
            r1 = this;
            a.e.a.a r0 = r1.f284d
            float r3 = (float) r3
            r0.m3992a(r2, r3)
            return r1
    }

    /* renamed from: a */
    public p000a.p014e.p015a.C0083b m3979a(p000a.p014e.p015a.C0091i r3, p000a.p014e.p015a.C0091i r4, int r5) {
            r2 = this;
            r0 = 0
            if (r5 == 0) goto L_0x000b
            if (r5 >= 0) goto L_0x0008
            int r5 = r5 * (-1)
            r0 = 1
        L_0x0008:
            float r5 = (float) r5
            r2.f282b = r5
        L_0x000b:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x001c
            a.e.a.a r0 = r2.f284d
            r0.m3992a(r3, r5)
            a.e.a.a r3 = r2.f284d
            r3.m3992a(r4, r1)
            goto L_0x0026
        L_0x001c:
            a.e.a.a r0 = r2.f284d
            r0.m3992a(r3, r1)
            a.e.a.a r3 = r2.f284d
            r3.m3992a(r4, r5)
        L_0x0026:
            return r2
    }

    /* renamed from: a */
    p000a.p014e.p015a.C0083b m3978a(p000a.p014e.p015a.C0091i r6, p000a.p014e.p015a.C0091i r7, int r8, float r9, p000a.p014e.p015a.C0091i r10, p000a.p014e.p015a.C0091i r11, int r12) {
            r5 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r7 != r10) goto L_0x0016
            a.e.a.a r8 = r5.f284d
            r8.m3992a(r6, r0)
            a.e.a.a r6 = r5.f284d
            r6.m3992a(r11, r0)
            a.e.a.a r6 = r5.f284d
            r8 = -1073741824(0xffffffffc0000000, float:-2.0)
            r6.m3992a(r7, r8)
            return r5
        L_0x0016:
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x003a
            a.e.a.a r9 = r5.f284d
            r9.m3992a(r6, r0)
            a.e.a.a r6 = r5.f284d
            r6.m3992a(r7, r2)
            a.e.a.a r6 = r5.f284d
            r6.m3992a(r10, r2)
            a.e.a.a r6 = r5.f284d
            r6.m3992a(r11, r0)
            if (r8 > 0) goto L_0x0036
            if (r12 <= 0) goto L_0x0088
        L_0x0036:
            int r6 = -r8
            int r6 = r6 + r12
            float r6 = (float) r6
            goto L_0x004a
        L_0x003a:
            r1 = 0
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x004d
            a.e.a.a r9 = r5.f284d
            r9.m3992a(r6, r2)
            a.e.a.a r6 = r5.f284d
            r6.m3992a(r7, r0)
            float r6 = (float) r8
        L_0x004a:
            r5.f282b = r6
            goto L_0x0088
        L_0x004d:
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 < 0) goto L_0x005d
            a.e.a.a r6 = r5.f284d
            r6.m3992a(r10, r2)
            a.e.a.a r6 = r5.f284d
            r6.m3992a(r11, r0)
            float r6 = (float) r12
            goto L_0x004a
        L_0x005d:
            a.e.a.a r1 = r5.f284d
            float r3 = r0 - r9
            float r4 = r3 * r0
            r1.m3992a(r6, r4)
            a.e.a.a r6 = r5.f284d
            float r1 = r3 * r2
            r6.m3992a(r7, r1)
            a.e.a.a r6 = r5.f284d
            float r2 = r2 * r9
            r6.m3992a(r10, r2)
            a.e.a.a r6 = r5.f284d
            float r0 = r0 * r9
            r6.m3992a(r11, r0)
            if (r8 > 0) goto L_0x007f
            if (r12 <= 0) goto L_0x0088
        L_0x007f:
            int r6 = -r8
            float r6 = (float) r6
            float r6 = r6 * r3
            float r7 = (float) r12
            float r7 = r7 * r9
            float r6 = r6 + r7
            goto L_0x004a
        L_0x0088:
            return r5
    }

    /* renamed from: a */
    p000a.p014e.p015a.C0083b m3977a(p000a.p014e.p015a.C0091i r3, p000a.p014e.p015a.C0091i r4, p000a.p014e.p015a.C0091i r5, float r6) {
            r2 = this;
            a.e.a.a r0 = r2.f284d
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.m3992a(r3, r1)
            a.e.a.a r3 = r2.f284d
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r6
            r3.m3992a(r4, r0)
            a.e.a.a r3 = r2.f284d
            r3.m3992a(r5, r6)
            return r2
    }

    /* renamed from: a */
    public p000a.p014e.p015a.C0083b m3976a(p000a.p014e.p015a.C0091i r3, p000a.p014e.p015a.C0091i r4, p000a.p014e.p015a.C0091i r5, int r6) {
            r2 = this;
            r0 = 0
            if (r6 == 0) goto L_0x000b
            if (r6 >= 0) goto L_0x0008
            int r6 = r6 * (-1)
            r0 = 1
        L_0x0008:
            float r6 = (float) r6
            r2.f282b = r6
        L_0x000b:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x0021
            a.e.a.a r0 = r2.f284d
            r0.m3992a(r3, r6)
            a.e.a.a r3 = r2.f284d
            r3.m3992a(r4, r1)
            a.e.a.a r3 = r2.f284d
            r3.m3992a(r5, r1)
            goto L_0x0030
        L_0x0021:
            a.e.a.a r0 = r2.f284d
            r0.m3992a(r3, r1)
            a.e.a.a r3 = r2.f284d
            r3.m3992a(r4, r6)
            a.e.a.a r3 = r2.f284d
            r3.m3992a(r5, r6)
        L_0x0030:
            return r2
    }

    /* renamed from: a */
    public p000a.p014e.p015a.C0083b m3975a(p000a.p014e.p015a.C0091i r3, p000a.p014e.p015a.C0091i r4, p000a.p014e.p015a.C0091i r5, p000a.p014e.p015a.C0091i r6, float r7) {
            r2 = this;
            a.e.a.a r0 = r2.f284d
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.m3992a(r3, r1)
            a.e.a.a r3 = r2.f284d
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.m3992a(r4, r0)
            a.e.a.a r3 = r2.f284d
            r3.m3992a(r5, r7)
            a.e.a.a r3 = r2.f284d
            float r4 = -r7
            r3.m3992a(r6, r4)
            return r2
    }

    @Override // p000a.p014e.p015a.C0086e.AbstractC0087a
    /* renamed from: a */
    public p000a.p014e.p015a.C0091i mo3930a(p000a.p014e.p015a.C0086e r2, boolean[] r3) {
            r1 = this;
            a.e.a.a r2 = r1.f284d
            r0 = 0
            a.e.a.i r2 = r2.m3988a(r3, r0)
            return r2
    }

    /* renamed from: a */
    void m3984a() {
            r2 = this;
            float r0 = r2.f282b
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0012
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = r0 * r1
            r2.f282b = r0
            a.e.a.a r0 = r2.f284d
            r0.m3987b()
        L_0x0012:
            return
    }

    @Override // p000a.p014e.p015a.C0086e.AbstractC0087a
    /* renamed from: a */
    public void mo3931a(p000a.p014e.p015a.C0086e.AbstractC0087a r6) {
            r5 = this;
            boolean r0 = r6 instanceof p000a.p014e.p015a.C0083b
            if (r0 == 0) goto L_0x0028
            a.e.a.b r6 = (p000a.p014e.p015a.C0083b) r6
            r0 = 0
            r5.f281a = r0
            a.e.a.a r0 = r5.f284d
            r0.m3999a()
            r0 = 0
        L_0x000f:
            a.e.a.a r1 = r6.f284d
            int r2 = r1.f270a
            if (r0 >= r2) goto L_0x0028
            a.e.a.i r1 = r1.m3997a(r0)
            a.e.a.a r2 = r6.f284d
            float r2 = r2.m3986b(r0)
            a.e.a.a r3 = r5.f284d
            r4 = 1
            r3.m3991a(r1, r2, r4)
            int r0 = r0 + 1
            goto L_0x000f
        L_0x0028:
            return
    }

    @Override // p000a.p014e.p015a.C0086e.AbstractC0087a
    /* renamed from: a */
    public void mo3929a(p000a.p014e.p015a.C0091i r4) {
            r3 = this;
            int r0 = r4.f339d
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 1
            if (r0 != r2) goto L_0x0008
            goto L_0x0022
        L_0x0008:
            r2 = 2
            if (r0 != r2) goto L_0x000e
            r1 = 1148846080(0x447a0000, float:1000.0)
            goto L_0x0022
        L_0x000e:
            r2 = 3
            if (r0 != r2) goto L_0x0015
            r1 = 1232348160(0x49742400, float:1000000.0)
            goto L_0x0022
        L_0x0015:
            r2 = 4
            if (r0 != r2) goto L_0x001c
            r1 = 1315859240(0x4e6e6b28, float:1.0E9)
            goto L_0x0022
        L_0x001c:
            r2 = 5
            if (r0 != r2) goto L_0x0022
            r1 = 1399379109(0x5368d4a5, float:1.0E12)
        L_0x0022:
            a.e.a.a r0 = r3.f284d
            r0.m3992a(r4, r1)
            return
    }

    /* renamed from: a */
    boolean m3982a(p000a.p014e.p015a.C0086e r3) {
            r2 = this;
            a.e.a.a r0 = r2.f284d
            a.e.a.i r3 = r0.m3994a(r3)
            r0 = 1
            if (r3 != 0) goto L_0x000b
            r3 = 1
            goto L_0x000f
        L_0x000b:
            r2.m3965d(r3)
            r3 = 0
        L_0x000f:
            a.e.a.a r1 = r2.f284d
            int r1 = r1.f270a
            if (r1 != 0) goto L_0x0017
            r2.f285e = r0
        L_0x0017:
            return r3
    }

    /* renamed from: b */
    p000a.p014e.p015a.C0083b m3972b(p000a.p014e.p015a.C0091i r1, int r2) {
            r0 = this;
            r0.f281a = r1
            float r2 = (float) r2
            r1.f340e = r2
            r0.f282b = r2
            r1 = 1
            r0.f285e = r1
            return r0
    }

    /* renamed from: b */
    public p000a.p014e.p015a.C0083b m3971b(p000a.p014e.p015a.C0091i r3, p000a.p014e.p015a.C0091i r4, p000a.p014e.p015a.C0091i r5, int r6) {
            r2 = this;
            r0 = 0
            if (r6 == 0) goto L_0x000b
            if (r6 >= 0) goto L_0x0008
            int r6 = r6 * (-1)
            r0 = 1
        L_0x0008:
            float r6 = (float) r6
            r2.f282b = r6
        L_0x000b:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x0021
            a.e.a.a r0 = r2.f284d
            r0.m3992a(r3, r6)
            a.e.a.a r3 = r2.f284d
            r3.m3992a(r4, r1)
            a.e.a.a r3 = r2.f284d
            r3.m3992a(r5, r6)
            goto L_0x0030
        L_0x0021:
            a.e.a.a r0 = r2.f284d
            r0.m3992a(r3, r1)
            a.e.a.a r3 = r2.f284d
            r3.m3992a(r4, r6)
            a.e.a.a r3 = r2.f284d
            r3.m3992a(r5, r1)
        L_0x0030:
            return r2
    }

    /* renamed from: b */
    public p000a.p014e.p015a.C0083b m3970b(p000a.p014e.p015a.C0091i r3, p000a.p014e.p015a.C0091i r4, p000a.p014e.p015a.C0091i r5, p000a.p014e.p015a.C0091i r6, float r7) {
            r2 = this;
            a.e.a.a r0 = r2.f284d
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.m3992a(r5, r1)
            a.e.a.a r5 = r2.f284d
            r5.m3992a(r6, r1)
            a.e.a.a r5 = r2.f284d
            r6 = -1090519040(0xffffffffbf000000, float:-0.5)
            r5.m3992a(r3, r6)
            a.e.a.a r3 = r2.f284d
            r3.m3992a(r4, r6)
            float r3 = -r7
            r2.f282b = r3
            return r2
    }

    /* renamed from: b */
    boolean m3974b() {
            r2 = this;
            a.e.a.i r0 = r2.f281a
            if (r0 == 0) goto L_0x0013
            a.e.a.i$a r0 = r0.f342g
            a.e.a.i$a r1 = p000a.p014e.p015a.C0091i.EnumC0092a.f346b
            if (r0 == r1) goto L_0x0011
            float r0 = r2.f282b
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0013
        L_0x0011:
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            return r0
    }

    /* renamed from: b */
    boolean m3973b(p000a.p014e.p015a.C0091i r2) {
            r1 = this;
            a.e.a.a r0 = r1.f284d
            boolean r2 = r0.m3993a(r2)
            return r2
    }

    /* renamed from: c */
    public p000a.p014e.p015a.C0083b m3967c(p000a.p014e.p015a.C0091i r2, int r3) {
            r1 = this;
            if (r3 >= 0) goto L_0x000c
            int r3 = r3 * (-1)
            float r3 = (float) r3
            r1.f282b = r3
            a.e.a.a r3 = r1.f284d
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0013
        L_0x000c:
            float r3 = (float) r3
            r1.f282b = r3
            a.e.a.a r3 = r1.f284d
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0013:
            r3.m3992a(r2, r0)
            return r1
    }

    /* renamed from: c */
    p000a.p014e.p015a.C0091i m3968c(p000a.p014e.p015a.C0091i r3) {
            r2 = this;
            a.e.a.a r0 = r2.f284d
            r1 = 0
            a.e.a.i r3 = r0.m3988a(r1, r3)
            return r3
    }

    /* renamed from: c */
    public boolean m3969c() {
            r2 = this;
            a.e.a.i r0 = r2.f281a
            if (r0 != 0) goto L_0x0013
            float r0 = r2.f282b
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0013
            a.e.a.a r0 = r2.f284d
            int r0 = r0.f270a
            if (r0 != 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            return r0
    }

    @Override // p000a.p014e.p015a.C0086e.AbstractC0087a
    public void clear() {
            r1 = this;
            a.e.a.a r0 = r1.f284d
            r0.m3999a()
            r0 = 0
            r1.f281a = r0
            r0 = 0
            r1.f282b = r0
            return
    }

    /* renamed from: d */
    public void m3966d() {
            r1 = this;
            r0 = 0
            r1.f281a = r0
            a.e.a.a r0 = r1.f284d
            r0.m3999a()
            r0 = 0
            r1.f282b = r0
            r0 = 0
            r1.f285e = r0
            return
    }

    /* renamed from: d */
    void m3965d(p000a.p014e.p015a.C0091i r4) {
            r3 = this;
            a.e.a.i r0 = r3.f281a
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L_0x000e
            a.e.a.a r2 = r3.f284d
            r2.m3992a(r0, r1)
            r0 = 0
            r3.f281a = r0
        L_0x000e:
            a.e.a.a r0 = r3.f284d
            r2 = 1
            float r0 = r0.m3989a(r4, r2)
            float r0 = r0 * r1
            r3.f281a = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0020
            return
        L_0x0020:
            float r4 = r3.f282b
            float r4 = r4 / r0
            r3.f282b = r4
            a.e.a.a r4 = r3.f284d
            r4.m3998a(r0)
            return
    }

    /* renamed from: e */
    java.lang.String m3964e() {
            r9 = this;
            a.e.a.i r0 = r9.f281a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0014
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            goto L_0x0021
        L_0x0014:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            a.e.a.i r1 = r9.f281a
            r0.append(r1)
        L_0x0021:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r9.f282b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0052
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.f282b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            a.e.a.a r5 = r9.f284d
            int r5 = r5.f270a
        L_0x0057:
            if (r2 >= r5) goto L_0x00d4
            a.e.a.a r6 = r9.f284d
            a.e.a.i r6 = r6.m3997a(r2)
            if (r6 != 0) goto L_0x0062
            goto L_0x00d1
        L_0x0062:
            a.e.a.a r7 = r9.f284d
            float r7 = r7.m3986b(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x006d
            goto L_0x00d1
        L_0x006d:
            java.lang.String r6 = r6.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0084
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00ad
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto L_0x00a4
        L_0x0084:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x009a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00ad
        L_0x009a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        L_0x00a4:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r8
        L_0x00ad:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00b9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x00c6
        L_0x00b9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        L_0x00c6:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = 1
        L_0x00d1:
            int r2 = r2 + 1
            goto L_0x0057
        L_0x00d4:
            if (r1 != 0) goto L_0x00e7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00e7:
            return r0
    }

    @Override // p000a.p014e.p015a.C0086e.AbstractC0087a
    public p000a.p014e.p015a.C0091i getKey() {
            r1 = this;
            a.e.a.i r0 = r1.f281a
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.m3964e()
            return r0
    }
}
