package androidx.core.app;

/* renamed from: androidx.core.app.b */
/* loaded from: classes.dex */
public final class C0692b {
    /* renamed from: a */
    public static int m1633a(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x0013
            java.lang.Class<android.app.AppOpsManager> r0 = android.app.AppOpsManager.class
            java.lang.Object r2 = r2.getSystemService(r0)
            android.app.AppOpsManager r2 = (android.app.AppOpsManager) r2
            int r2 = r2.noteProxyOpNoThrow(r3, r4)
            return r2
        L_0x0013:
            r2 = 1
            return r2
    }

    /* renamed from: a */
    public static java.lang.String m1632a(java.lang.String r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x000b
            java.lang.String r2 = android.app.AppOpsManager.permissionToOp(r2)
            return r2
        L_0x000b:
            r2 = 0
            return r2
    }
}
