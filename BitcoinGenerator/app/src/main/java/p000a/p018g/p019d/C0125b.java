package p000a.p018g.p019d;

/* renamed from: a.g.d.b */
/* loaded from: classes.dex */
public final class C0125b {
    /* renamed from: a */
    public static int m3731a(android.content.Context r3, java.lang.String r4) {
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = r3.getPackageName()
            int r3 = m3730a(r3, r4, r0, r1, r2)
            return r3
    }

    /* renamed from: a */
    public static int m3730a(android.content.Context r1, java.lang.String r2, int r3, int r4, java.lang.String r5) {
            int r3 = r1.checkPermission(r2, r3, r4)
            r0 = -1
            if (r3 != r0) goto L_0x0008
            return r0
        L_0x0008:
            java.lang.String r2 = androidx.core.app.C0692b.m1632a(r2)
            r3 = 0
            if (r2 != 0) goto L_0x0010
            return r3
        L_0x0010:
            if (r5 != 0) goto L_0x0024
            android.content.pm.PackageManager r5 = r1.getPackageManager()
            java.lang.String[] r4 = r5.getPackagesForUid(r4)
            if (r4 == 0) goto L_0x0023
            int r5 = r4.length
            if (r5 > 0) goto L_0x0020
            goto L_0x0023
        L_0x0020:
            r5 = r4[r3]
            goto L_0x0024
        L_0x0023:
            return r0
        L_0x0024:
            int r1 = androidx.core.app.C0692b.m1633a(r1, r2, r5)
            if (r1 == 0) goto L_0x002c
            r1 = -2
            return r1
        L_0x002c:
            return r3
    }
}
