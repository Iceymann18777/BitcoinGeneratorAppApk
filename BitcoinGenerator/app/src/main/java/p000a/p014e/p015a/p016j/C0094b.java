package p000a.p014e.p015a.p016j;

/* renamed from: a.e.a.j.b */
/* loaded from: classes.dex */
public class C0094b extends p000a.p014e.p015a.p016j.C0109j {

    /* renamed from: m0 */
    private int f352m0;

    /* renamed from: n0 */
    private java.util.ArrayList<p000a.p014e.p015a.p016j.C0112m> f353n0;

    /* renamed from: o0 */
    private boolean f354o0;

    public C0094b() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f352m0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            r2.f353n0 = r0
            r0 = 1
            r2.f354o0 = r0
            return
    }

    @Override // p000a.p014e.p015a.p016j.C0102f
    /* renamed from: F */
    public void mo3882F() {
            r1 = this;
            super.mo3882F()
            java.util.ArrayList<a.e.a.j.m> r0 = r1.f353n0
            r0.clear()
            return
    }

    @Override // p000a.p014e.p015a.p016j.C0102f
    /* renamed from: G */
    public void mo3881G() {
            r11 = this;
            int r0 = r11.f352m0
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0020
            if (r0 == r4) goto L_0x0018
            if (r0 == r3) goto L_0x0015
            if (r0 == r2) goto L_0x0012
            return
        L_0x0012:
            a.e.a.j.e r0 = r11.f456v
            goto L_0x001a
        L_0x0015:
            a.e.a.j.e r0 = r11.f454t
            goto L_0x0022
        L_0x0018:
            a.e.a.j.e r0 = r11.f455u
        L_0x001a:
            a.e.a.j.m r0 = r0.m3893d()
            r1 = 0
            goto L_0x0026
        L_0x0020:
            a.e.a.j.e r0 = r11.f453s
        L_0x0022:
            a.e.a.j.m r0 = r0.m3893d()
        L_0x0026:
            java.util.ArrayList<a.e.a.j.m> r5 = r11.f353n0
            int r5 = r5.size()
            r6 = 0
            r7 = 0
        L_0x002e:
            if (r7 >= r5) goto L_0x0058
            java.util.ArrayList<a.e.a.j.m> r8 = r11.f353n0
            java.lang.Object r8 = r8.get(r7)
            a.e.a.j.m r8 = (p000a.p014e.p015a.p016j.C0112m) r8
            int r9 = r8.f523b
            if (r9 == r4) goto L_0x003d
            return
        L_0x003d:
            int r9 = r11.f352m0
            if (r9 == 0) goto L_0x004b
            if (r9 != r3) goto L_0x0044
            goto L_0x004b
        L_0x0044:
            float r9 = r8.f514g
            int r10 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r10 <= 0) goto L_0x0055
            goto L_0x0051
        L_0x004b:
            float r9 = r8.f514g
            int r10 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x0055
        L_0x0051:
            a.e.a.j.m r1 = r8.f513f
            r6 = r1
            r1 = r9
        L_0x0055:
            int r7 = r7 + 1
            goto L_0x002e
        L_0x0058:
            a.e.a.f r5 = p000a.p014e.p015a.C0086e.m3934h()
            if (r5 == 0) goto L_0x0069
            a.e.a.f r5 = p000a.p014e.p015a.C0086e.m3934h()
            long r7 = r5.f331y
            r9 = 1
            long r7 = r7 + r9
            r5.f331y = r7
        L_0x0069:
            r0.f513f = r6
            r0.f514g = r1
            r0.m3753a()
            int r0 = r11.f352m0
            if (r0 == 0) goto L_0x0084
            if (r0 == r4) goto L_0x0081
            if (r0 == r3) goto L_0x007e
            if (r0 == r2) goto L_0x007b
            return
        L_0x007b:
            a.e.a.j.e r0 = r11.f454t
            goto L_0x0086
        L_0x007e:
            a.e.a.j.e r0 = r11.f456v
            goto L_0x0086
        L_0x0081:
            a.e.a.j.e r0 = r11.f453s
            goto L_0x0086
        L_0x0084:
            a.e.a.j.e r0 = r11.f455u
        L_0x0086:
            a.e.a.j.m r0 = r0.m3893d()
            r0.m3763a(r6, r1)
            return
    }

    @Override // p000a.p014e.p015a.p016j.C0102f
    /* renamed from: a */
    public void mo3782a(int r8) {
            r7 = this;
            a.e.a.j.f r8 = r7.f403D
            if (r8 != 0) goto L_0x0005
            return
        L_0x0005:
            a.e.a.j.g r8 = (p000a.p014e.p015a.p016j.C0105g) r8
            r0 = 2
            boolean r8 = r8.m3793t(r0)
            if (r8 != 0) goto L_0x000f
            return
        L_0x000f:
            int r8 = r7.f352m0
            r1 = 3
            r2 = 1
            if (r8 == 0) goto L_0x0025
            if (r8 == r2) goto L_0x0022
            if (r8 == r0) goto L_0x001f
            if (r8 == r1) goto L_0x001c
            return
        L_0x001c:
            a.e.a.j.e r8 = r7.f456v
            goto L_0x0027
        L_0x001f:
            a.e.a.j.e r8 = r7.f454t
            goto L_0x0027
        L_0x0022:
            a.e.a.j.e r8 = r7.f455u
            goto L_0x0027
        L_0x0025:
            a.e.a.j.e r8 = r7.f453s
        L_0x0027:
            a.e.a.j.m r8 = r8.m3893d()
            r3 = 5
            r8.m3760b(r3)
            int r3 = r7.f352m0
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x0044
            if (r3 != r2) goto L_0x0038
            goto L_0x0044
        L_0x0038:
            a.e.a.j.e r3 = r7.f453s
            a.e.a.j.m r3 = r3.m3893d()
            r3.m3763a(r5, r4)
            a.e.a.j.e r3 = r7.f455u
            goto L_0x004f
        L_0x0044:
            a.e.a.j.e r3 = r7.f454t
            a.e.a.j.m r3 = r3.m3893d()
            r3.m3763a(r5, r4)
            a.e.a.j.e r3 = r7.f456v
        L_0x004f:
            a.e.a.j.m r3 = r3.m3893d()
            r3.m3763a(r5, r4)
            java.util.ArrayList<a.e.a.j.m> r3 = r7.f353n0
            r3.clear()
            r3 = 0
        L_0x005c:
            int r4 = r7.f508l0
            if (r3 >= r4) goto L_0x0097
            a.e.a.j.f[] r4 = r7.f507k0
            r4 = r4[r3]
            boolean r6 = r7.f354o0
            if (r6 != 0) goto L_0x006f
            boolean r6 = r4.mo3783a()
            if (r6 != 0) goto L_0x006f
            goto L_0x0094
        L_0x006f:
            int r6 = r7.f352m0
            if (r6 == 0) goto L_0x0084
            if (r6 == r2) goto L_0x0081
            if (r6 == r0) goto L_0x007e
            if (r6 == r1) goto L_0x007b
            r4 = r5
            goto L_0x008a
        L_0x007b:
            a.e.a.j.e r4 = r4.f456v
            goto L_0x0086
        L_0x007e:
            a.e.a.j.e r4 = r4.f454t
            goto L_0x0086
        L_0x0081:
            a.e.a.j.e r4 = r4.f455u
            goto L_0x0086
        L_0x0084:
            a.e.a.j.e r4 = r4.f453s
        L_0x0086:
            a.e.a.j.m r4 = r4.m3893d()
        L_0x008a:
            if (r4 == 0) goto L_0x0094
            java.util.ArrayList<a.e.a.j.m> r6 = r7.f353n0
            r6.add(r4)
            r4.m3752a(r8)
        L_0x0094:
            int r3 = r3 + 1
            goto L_0x005c
        L_0x0097:
            return
    }

    @Override // p000a.p014e.p015a.p016j.C0102f
    /* renamed from: a */
    public void mo3781a(p000a.p014e.p015a.C0086e r11) {
            r10 = this;
            a.e.a.j.e[] r0 = r10.f400A
            a.e.a.j.e r1 = r10.f453s
            r2 = 0
            r0[r2] = r1
            a.e.a.j.e r1 = r10.f454t
            r3 = 2
            r0[r3] = r1
            a.e.a.j.e r1 = r10.f455u
            r4 = 1
            r0[r4] = r1
            a.e.a.j.e r1 = r10.f456v
            r5 = 3
            r0[r5] = r1
            r0 = 0
        L_0x0017:
            a.e.a.j.e[] r1 = r10.f400A
            int r6 = r1.length
            if (r0 >= r6) goto L_0x0029
            r6 = r1[r0]
            r1 = r1[r0]
            a.e.a.i r1 = r11.m3949a(r1)
            r6.f380i = r1
            int r0 = r0 + 1
            goto L_0x0017
        L_0x0029:
            int r0 = r10.f352m0
            if (r0 < 0) goto L_0x012c
            r6 = 4
            if (r0 >= r6) goto L_0x012c
            r0 = r1[r0]
            r1 = 0
        L_0x0033:
            int r6 = r10.f508l0
            if (r1 >= r6) goto L_0x0068
            a.e.a.j.f[] r6 = r10.f507k0
            r6 = r6[r1]
            boolean r7 = r10.f354o0
            if (r7 != 0) goto L_0x0046
            boolean r7 = r6.mo3783a()
            if (r7 != 0) goto L_0x0046
            goto L_0x0065
        L_0x0046:
            int r7 = r10.f352m0
            if (r7 == 0) goto L_0x004c
            if (r7 != r4) goto L_0x0056
        L_0x004c:
            a.e.a.j.f$b r7 = r6.m3838j()
            a.e.a.j.f$b r8 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f465d
            if (r7 != r8) goto L_0x0056
        L_0x0054:
            r1 = 1
            goto L_0x0069
        L_0x0056:
            int r7 = r10.f352m0
            if (r7 == r3) goto L_0x005c
            if (r7 != r5) goto L_0x0065
        L_0x005c:
            a.e.a.j.f$b r6 = r6.m3824q()
            a.e.a.j.f$b r7 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f465d
            if (r6 != r7) goto L_0x0065
            goto L_0x0054
        L_0x0065:
            int r1 = r1 + 1
            goto L_0x0033
        L_0x0068:
            r1 = 0
        L_0x0069:
            int r6 = r10.f352m0
            if (r6 == 0) goto L_0x007d
            if (r6 != r4) goto L_0x0070
            goto L_0x007d
        L_0x0070:
            a.e.a.j.f r6 = r10.m3836k()
            a.e.a.j.f$b r6 = r6.m3824q()
            a.e.a.j.f$b r7 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f464c
            if (r6 != r7) goto L_0x008a
            goto L_0x0089
        L_0x007d:
            a.e.a.j.f r6 = r10.m3836k()
            a.e.a.j.f$b r6 = r6.m3838j()
            a.e.a.j.f$b r7 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f464c
            if (r6 != r7) goto L_0x008a
        L_0x0089:
            r1 = 0
        L_0x008a:
            r6 = 0
        L_0x008b:
            int r7 = r10.f508l0
            if (r6 >= r7) goto L_0x00c3
            a.e.a.j.f[] r7 = r10.f507k0
            r7 = r7[r6]
            boolean r8 = r10.f354o0
            if (r8 != 0) goto L_0x009e
            boolean r8 = r7.mo3783a()
            if (r8 != 0) goto L_0x009e
            goto L_0x00c0
        L_0x009e:
            a.e.a.j.e[] r8 = r7.f400A
            int r9 = r10.f352m0
            r8 = r8[r9]
            a.e.a.i r8 = r11.m3949a(r8)
            a.e.a.j.e[] r7 = r7.f400A
            int r9 = r10.f352m0
            r7 = r7[r9]
            r7.f380i = r8
            if (r9 == 0) goto L_0x00bb
            if (r9 != r3) goto L_0x00b5
            goto L_0x00bb
        L_0x00b5:
            a.e.a.i r7 = r0.f380i
            r11.m3951a(r7, r8, r1)
            goto L_0x00c0
        L_0x00bb:
            a.e.a.i r7 = r0.f380i
            r11.m3944b(r7, r8, r1)
        L_0x00c0:
            int r6 = r6 + 1
            goto L_0x008b
        L_0x00c3:
            int r0 = r10.f352m0
            r6 = 5
            r7 = 6
            if (r0 != 0) goto L_0x00e4
            a.e.a.j.e r0 = r10.f455u
            a.e.a.i r0 = r0.f380i
            a.e.a.j.e r3 = r10.f453s
            a.e.a.i r3 = r3.f380i
            r11.m3953a(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x012c
            a.e.a.j.e r0 = r10.f453s
            a.e.a.i r0 = r0.f380i
            a.e.a.j.f r1 = r10.f403D
            a.e.a.j.e r1 = r1.f455u
        L_0x00de:
            a.e.a.i r1 = r1.f380i
            r11.m3953a(r0, r1, r2, r6)
            goto L_0x012c
        L_0x00e4:
            if (r0 != r4) goto L_0x00fc
            a.e.a.j.e r0 = r10.f453s
            a.e.a.i r0 = r0.f380i
            a.e.a.j.e r3 = r10.f455u
            a.e.a.i r3 = r3.f380i
            r11.m3953a(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x012c
            a.e.a.j.e r0 = r10.f453s
            a.e.a.i r0 = r0.f380i
            a.e.a.j.f r1 = r10.f403D
            a.e.a.j.e r1 = r1.f453s
            goto L_0x00de
        L_0x00fc:
            if (r0 != r3) goto L_0x0114
            a.e.a.j.e r0 = r10.f456v
            a.e.a.i r0 = r0.f380i
            a.e.a.j.e r3 = r10.f454t
            a.e.a.i r3 = r3.f380i
            r11.m3953a(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x012c
            a.e.a.j.e r0 = r10.f454t
            a.e.a.i r0 = r0.f380i
            a.e.a.j.f r1 = r10.f403D
            a.e.a.j.e r1 = r1.f456v
            goto L_0x00de
        L_0x0114:
            if (r0 != r5) goto L_0x012c
            a.e.a.j.e r0 = r10.f454t
            a.e.a.i r0 = r0.f380i
            a.e.a.j.e r3 = r10.f456v
            a.e.a.i r3 = r3.f380i
            r11.m3953a(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x012c
            a.e.a.j.e r0 = r10.f454t
            a.e.a.i r0 = r0.f380i
            a.e.a.j.f r1 = r10.f403D
            a.e.a.j.e r1 = r1.f454t
            goto L_0x00de
        L_0x012c:
            return
    }

    @Override // p000a.p014e.p015a.p016j.C0102f
    /* renamed from: a */
    public boolean mo3783a() {
            r1 = this;
            r0 = 1
            return r0
    }

    /* renamed from: c */
    public void m3907c(boolean r1) {
            r0 = this;
            r0.f354o0 = r1
            return
    }

    /* renamed from: t */
    public void m3906t(int r1) {
            r0 = this;
            r0.f352m0 = r1
            return
    }
}
