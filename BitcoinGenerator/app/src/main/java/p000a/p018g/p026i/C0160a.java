package p000a.p018g.p026i;

/* renamed from: a.g.i.a */
/* loaded from: classes.dex */
public final class C0160a {

    /* renamed from: a */
    private final java.lang.String f573a;

    /* renamed from: b */
    private final java.lang.String f574b;

    /* renamed from: c */
    private final java.lang.String f575c;

    /* renamed from: d */
    private final java.util.List<java.util.List<byte[]>> f576d;

    /* renamed from: e */
    private final int f577e;

    /* renamed from: f */
    private final java.lang.String f578f;

    public C0160a(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.util.List<java.util.List<byte[]>> r4) {
            r0 = this;
            r0.<init>()
            p000a.p018g.p028k.C0184g.m3556a(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.f573a = r1
            p000a.p018g.p028k.C0184g.m3556a(r2)
            java.lang.String r2 = (java.lang.String) r2
            r0.f574b = r2
            p000a.p018g.p028k.C0184g.m3556a(r3)
            java.lang.String r3 = (java.lang.String) r3
            r0.f575c = r3
            p000a.p018g.p028k.C0184g.m3556a(r4)
            java.util.List r4 = (java.util.List) r4
            r0.f576d = r4
            r1 = 0
            r0.f577e = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = r0.f573a
            r1.<init>(r2)
            java.lang.String r2 = "-"
            r1.append(r2)
            java.lang.String r3 = r0.f574b
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = r0.f575c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.f578f = r1
            return
    }

    /* renamed from: a */
    public java.util.List<java.util.List<byte[]>> m3605a() {
            r1 = this;
            java.util.List<java.util.List<byte[]>> r0 = r1.f576d
            return r0
    }

    /* renamed from: b */
    public int m3604b() {
            r1 = this;
            int r0 = r1.f577e
            return r0
    }

    /* renamed from: c */
    public java.lang.String m3603c() {
            r1 = this;
            java.lang.String r0 = r1.f578f
            return r0
    }

    /* renamed from: d */
    public java.lang.String m3602d() {
            r1 = this;
            java.lang.String r0 = r1.f573a
            return r0
    }

    /* renamed from: e */
    public java.lang.String m3601e() {
            r1 = this;
            java.lang.String r0 = r1.f574b
            return r0
    }

    /* renamed from: f */
    public java.lang.String m3600f() {
            r1 = this;
            java.lang.String r0 = r1.f575c
            return r0
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "FontRequest {mProviderAuthority: "
            r1.append(r2)
            java.lang.String r2 = r6.f573a
            r1.append(r2)
            java.lang.String r2 = ", mProviderPackage: "
            r1.append(r2)
            java.lang.String r2 = r6.f574b
            r1.append(r2)
            java.lang.String r2 = ", mQuery: "
            r1.append(r2)
            java.lang.String r2 = r6.f575c
            r1.append(r2)
            java.lang.String r2 = ", mCertificates:"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 0
            r2 = 0
        L_0x0036:
            java.util.List<java.util.List<byte[]>> r3 = r6.f576d
            int r3 = r3.size()
            if (r2 >= r3) goto L_0x0074
            java.lang.String r3 = " ["
            r0.append(r3)
            java.util.List<java.util.List<byte[]>> r3 = r6.f576d
            java.lang.Object r3 = r3.get(r2)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
        L_0x004c:
            int r5 = r3.size()
            if (r4 >= r5) goto L_0x006c
            java.lang.String r5 = " \""
            r0.append(r5)
            java.lang.Object r5 = r3.get(r4)
            byte[] r5 = (byte[]) r5
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r1)
            r0.append(r5)
            java.lang.String r5 = "\""
            r0.append(r5)
            int r4 = r4 + 1
            goto L_0x004c
        L_0x006c:
            java.lang.String r3 = " ]"
            r0.append(r3)
            int r2 = r2 + 1
            goto L_0x0036
        L_0x0074:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "mCertificatesArray: "
            r1.append(r2)
            int r2 = r6.f577e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
