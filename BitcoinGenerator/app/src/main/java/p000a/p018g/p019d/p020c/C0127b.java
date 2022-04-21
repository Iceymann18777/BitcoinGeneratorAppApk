package p000a.p018g.p019d.p020c;

/* renamed from: a.g.d.c.b */
/* loaded from: classes.dex */
public final class C0127b {

    /* renamed from: a */
    private final android.graphics.Shader f537a;

    /* renamed from: b */
    private final android.content.res.ColorStateList f538b;

    /* renamed from: c */
    private int f539c;

    private C0127b(android.graphics.Shader r1, android.content.res.ColorStateList r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f537a = r1
            r0.f538b = r2
            r0.f539c = r3
            return
    }

    /* renamed from: a */
    static p000a.p018g.p019d.p020c.C0127b m3722a(android.content.res.ColorStateList r3) {
            a.g.d.c.b r0 = new a.g.d.c.b
            int r1 = r3.getDefaultColor()
            r2 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    /* renamed from: a */
    private static p000a.p018g.p019d.p020c.C0127b m3721a(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r7)
        L_0x0008:
            int r1 = r7.next()
            r2 = 2
            r3 = 1
            if (r1 == r2) goto L_0x0013
            if (r1 == r3) goto L_0x0013
            goto L_0x0008
        L_0x0013:
            if (r1 != r2) goto L_0x0070
            java.lang.String r1 = r7.getName()
            r2 = -1
            int r4 = r1.hashCode()
            r5 = 89650992(0x557f730, float:1.01546526E-35)
            if (r4 == r5) goto L_0x0033
            r5 = 1191572447(0x4705f3df, float:34291.87)
            if (r4 == r5) goto L_0x0029
            goto L_0x003c
        L_0x0029:
            java.lang.String r4 = "selector"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x003c
            r2 = 0
            goto L_0x003c
        L_0x0033:
            java.lang.String r4 = "gradient"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x003c
            r2 = 1
        L_0x003c:
            if (r2 == 0) goto L_0x0067
            if (r2 != r3) goto L_0x0049
            android.graphics.Shader r6 = p000a.p018g.p019d.p020c.C0133d.m3692a(r6, r7, r0, r8)
            a.g.d.c.b r6 = m3720a(r6)
            return r6
        L_0x0049:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r8.append(r7)
            java.lang.String r7 = ": unsupported complex color tag "
            r8.append(r7)
            r8.append(r1)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        L_0x0067:
            android.content.res.ColorStateList r6 = p000a.p018g.p019d.p020c.C0126a.m3726a(r6, r7, r0, r8)
            a.g.d.c.b r6 = m3722a(r6)
            return r6
        L_0x0070:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)
            goto L_0x0079
        L_0x0078:
            throw r6
        L_0x0079:
            goto L_0x0078
    }

    /* renamed from: a */
    static p000a.p018g.p019d.p020c.C0127b m3720a(android.graphics.Shader r3) {
            a.g.d.c.b r0 = new a.g.d.c.b
            r1 = 0
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    /* renamed from: b */
    static p000a.p018g.p019d.p020c.C0127b m3717b(int r2) {
            a.g.d.c.b r0 = new a.g.d.c.b
            r1 = 0
            r0.<init>(r1, r1, r2)
            return r0
    }

    /* renamed from: b */
    public static p000a.p018g.p019d.p020c.C0127b m3716b(android.content.res.Resources r0, int r1, android.content.res.Resources.Theme r2) {
            a.g.d.c.b r0 = m3721a(r0, r1, r2)     // Catch: Exception -> 0x0005
            return r0
        L_0x0005:
            r0 = move-exception
            java.lang.String r1 = "ComplexColorCompat"
            java.lang.String r2 = "Failed to inflate ComplexColor."
            android.util.Log.e(r1, r2, r0)
            r0 = 0
            return r0
    }

    /* renamed from: a */
    public int m3724a() {
            r1 = this;
            int r0 = r1.f539c
            return r0
    }

    /* renamed from: a */
    public void m3723a(int r1) {
            r0 = this;
            r0.f539c = r1
            return
    }

    /* renamed from: a */
    public boolean m3719a(int[] r3) {
            r2 = this;
            boolean r0 = r2.m3714d()
            if (r0 == 0) goto L_0x0018
            android.content.res.ColorStateList r0 = r2.f538b
            int r1 = r0.getDefaultColor()
            int r3 = r0.getColorForState(r3, r1)
            int r0 = r2.f539c
            if (r3 == r0) goto L_0x0018
            r0 = 1
            r2.f539c = r3
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            return r0
    }

    /* renamed from: b */
    public android.graphics.Shader m3718b() {
            r1 = this;
            android.graphics.Shader r0 = r1.f537a
            return r0
    }

    /* renamed from: c */
    public boolean m3715c() {
            r1 = this;
            android.graphics.Shader r0 = r1.f537a
            if (r0 == 0) goto L_0x0006
            r0 = 1
            goto L_0x0007
        L_0x0006:
            r0 = 0
        L_0x0007:
            return r0
    }

    /* renamed from: d */
    public boolean m3714d() {
            r1 = this;
            android.graphics.Shader r0 = r1.f537a
            if (r0 != 0) goto L_0x0010
            android.content.res.ColorStateList r0 = r1.f538b
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
    }

    /* renamed from: e */
    public boolean m3713e() {
            r1 = this;
            boolean r0 = r1.m3715c()
            if (r0 != 0) goto L_0x000d
            int r0 = r1.f539c
            if (r0 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            r0 = 0
            goto L_0x000e
        L_0x000d:
            r0 = 1
        L_0x000e:
            return r0
    }
}
