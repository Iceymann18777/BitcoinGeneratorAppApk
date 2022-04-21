package p000a.p018g.p021e;

/* renamed from: a.g.e.c */
/* loaded from: classes.dex */
public class C0145c {

    /* renamed from: a */
    private static final p000a.p018g.p021e.C0150h f560a = null;

    /* renamed from: b */
    private static final p000a.p013d.C0073e<java.lang.String, android.graphics.Typeface> f561b = null;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x000e
            a.g.e.g r0 = new a.g.e.g
            r0.<init>()
        L_0x000b:
            p000a.p018g.p021e.C0145c.f560a = r0
            goto L_0x003a
        L_0x000e:
            r1 = 26
            if (r0 < r1) goto L_0x0018
            a.g.e.f r0 = new a.g.e.f
            r0.<init>()
            goto L_0x000b
        L_0x0018:
            r1 = 24
            if (r0 < r1) goto L_0x0028
            boolean r0 = p000a.p018g.p021e.C0147e.m3646a()
            if (r0 == 0) goto L_0x0028
            a.g.e.e r0 = new a.g.e.e
            r0.<init>()
            goto L_0x000b
        L_0x0028:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x0034
            a.g.e.d r0 = new a.g.e.d
            r0.<init>()
            goto L_0x000b
        L_0x0034:
            a.g.e.h r0 = new a.g.e.h
            r0.<init>()
            goto L_0x000b
        L_0x003a:
            a.d.e r0 = new a.d.e
            r1 = 16
            r0.<init>(r1)
            p000a.p018g.p021e.C0145c.f561b = r0
            return
    }

    /* renamed from: a */
    public static android.graphics.Typeface m3652a(android.content.Context r7, p000a.p018g.p019d.p020c.C0128c.AbstractC0129a r8, android.content.res.Resources r9, int r10, int r11, p000a.p018g.p019d.p020c.C0136f.AbstractC0137a r12, android.os.Handler r13, boolean r14) {
            boolean r1 = r8 instanceof p000a.p018g.p019d.p020c.C0128c.C0132d
            if (r1 == 0) goto L_0x002c
            r0 = r8
            a.g.d.c.c$d r0 = (p000a.p018g.p019d.p020c.C0128c.C0132d) r0
            r1 = 1
            r4 = 0
            if (r14 == 0) goto L_0x0012
            int r5 = r0.m3697a()
            if (r5 != 0) goto L_0x0015
            goto L_0x0014
        L_0x0012:
            if (r12 != 0) goto L_0x0015
        L_0x0014:
            r4 = 1
        L_0x0015:
            if (r14 == 0) goto L_0x001d
            int r1 = r0.m3695c()
            r5 = r1
            goto L_0x001f
        L_0x001d:
            r1 = -1
            r5 = -1
        L_0x001f:
            a.g.i.a r1 = r0.m3696b()
            r0 = r7
            r2 = r12
            r3 = r13
            r6 = r11
            android.graphics.Typeface r0 = p000a.p018g.p026i.C0161b.m3597a(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0041
        L_0x002c:
            a.g.e.h r1 = p000a.p018g.p021e.C0145c.f560a
            r0 = r8
            a.g.d.c.c$b r0 = (p000a.p018g.p019d.p020c.C0128c.C0130b) r0
            android.graphics.Typeface r0 = r1.mo3627a(r7, r0, r9, r11)
            if (r12 == 0) goto L_0x0041
            if (r0 == 0) goto L_0x003d
            r12.m3682a(r0, r13)
            goto L_0x0041
        L_0x003d:
            r1 = -3
            r12.m3683a(r1, r13)
        L_0x0041:
            if (r0 == 0) goto L_0x004c
            a.d.e<java.lang.String, android.graphics.Typeface> r1 = p000a.p018g.p021e.C0145c.f561b
            java.lang.String r2 = m3649a(r9, r10, r11)
            r1.m4048a(r2, r0)
        L_0x004c:
            return r0
    }

    /* renamed from: a */
    public static android.graphics.Typeface m3651a(android.content.Context r6, android.content.res.Resources r7, int r8, java.lang.String r9, int r10) {
            a.g.e.h r0 = p000a.p018g.p021e.C0145c.f560a
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            android.graphics.Typeface r6 = r0.mo3626a(r1, r2, r3, r4, r5)
            if (r6 == 0) goto L_0x0016
            java.lang.String r7 = m3649a(r7, r8, r10)
            a.d.e<java.lang.String, android.graphics.Typeface> r8 = p000a.p018g.p021e.C0145c.f561b
            r8.m4048a(r7, r6)
        L_0x0016:
            return r6
    }

    /* renamed from: a */
    public static android.graphics.Typeface m3650a(android.content.Context r1, android.os.CancellationSignal r2, p000a.p018g.p026i.C0161b.C0167f[] r3, int r4) {
            a.g.e.h r0 = p000a.p018g.p021e.C0145c.f560a
            android.graphics.Typeface r1 = r0.mo3625a(r1, r2, r3, r4)
            return r1
    }

    /* renamed from: a */
    private static java.lang.String m3649a(android.content.res.Resources r1, int r2, int r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.getResourcePackageName(r2)
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r2)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            return r1
    }

    /* renamed from: b */
    public static android.graphics.Typeface m3648b(android.content.res.Resources r1, int r2, int r3) {
            a.d.e<java.lang.String, android.graphics.Typeface> r0 = p000a.p018g.p021e.C0145c.f561b
            java.lang.String r1 = m3649a(r1, r2, r3)
            java.lang.Object r1 = r0.m4046b(r1)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            return r1
    }
}
