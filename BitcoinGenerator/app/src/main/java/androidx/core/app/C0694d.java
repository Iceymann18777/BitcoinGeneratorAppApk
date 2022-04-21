package androidx.core.app;

/* renamed from: androidx.core.app.d */
/* loaded from: classes.dex */
public final class C0694d {
    /* renamed from: a */
    public static android.content.Intent m1630a(android.app.Activity r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x000d
            android.content.Intent r0 = r3.getParentActivityIntent()
            if (r0 == 0) goto L_0x000d
            return r0
        L_0x000d:
            java.lang.String r0 = m1627b(r3)
            r1 = 0
            if (r0 != 0) goto L_0x0015
            return r1
        L_0x0015:
            android.content.ComponentName r2 = new android.content.ComponentName
            r2.<init>(r3, r0)
            java.lang.String r3 = m1625b(r3, r2)     // Catch: NameNotFoundException -> 0x002f
            if (r3 != 0) goto L_0x0025
            android.content.Intent r3 = android.content.Intent.makeMainActivity(r2)     // Catch: NameNotFoundException -> 0x002f
            goto L_0x002e
        L_0x0025:
            android.content.Intent r3 = new android.content.Intent     // Catch: NameNotFoundException -> 0x002f
            r3.<init>()     // Catch: NameNotFoundException -> 0x002f
            android.content.Intent r3 = r3.setComponent(r2)     // Catch: NameNotFoundException -> 0x002f
        L_0x002e:
            return r3
        L_0x002f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "getParentActivityIntent: bad parentActivityName '"
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = "' in manifest"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "NavUtils"
            android.util.Log.e(r0, r3)
            return r1
    }

    /* renamed from: a */
    public static android.content.Intent m1628a(android.content.Context r2, android.content.ComponentName r3) {
            java.lang.String r0 = m1625b(r2, r3)
            if (r0 != 0) goto L_0x0008
            r2 = 0
            return r2
        L_0x0008:
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r3 = r3.getPackageName()
            r1.<init>(r3, r0)
            java.lang.String r2 = m1625b(r2, r1)
            if (r2 != 0) goto L_0x001c
            android.content.Intent r2 = android.content.Intent.makeMainActivity(r1)
            goto L_0x0025
        L_0x001c:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            android.content.Intent r2 = r2.setComponent(r1)
        L_0x0025:
            return r2
    }

    /* renamed from: a */
    public static void m1629a(android.app.Activity r2, android.content.Intent r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x000a
            r2.navigateUpTo(r3)
            goto L_0x0015
        L_0x000a:
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r3.addFlags(r0)
            r2.startActivity(r3)
            r2.finish()
        L_0x0015:
            return
    }

    /* renamed from: b */
    public static java.lang.String m1627b(android.app.Activity r1) {
            android.content.ComponentName r0 = r1.getComponentName()     // Catch: NameNotFoundException -> 0x0009
            java.lang.String r1 = m1625b(r1, r0)     // Catch: NameNotFoundException -> 0x0009
            return r1
        L_0x0009:
            r1 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: b */
    public static java.lang.String m1625b(android.content.Context r2, android.content.ComponentName r3) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            r1 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r3 = r0.getActivityInfo(r3, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x0015
            java.lang.String r0 = r3.parentActivityName
            if (r0 == 0) goto L_0x0015
            return r0
        L_0x0015:
            android.os.Bundle r0 = r3.metaData
            r1 = 0
            if (r0 != 0) goto L_0x001b
            return r1
        L_0x001b:
            android.os.Bundle r3 = r3.metaData
            java.lang.String r0 = "android.support.PARENT_ACTIVITY"
            java.lang.String r3 = r3.getString(r0)
            if (r3 != 0) goto L_0x0026
            return r1
        L_0x0026:
            r0 = 0
            char r0 = r3.charAt(r0)
            r1 = 46
            if (r0 != r1) goto L_0x0042
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r2.getPackageName()
            r0.append(r2)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L_0x0042:
            return r3
    }

    /* renamed from: b */
    public static boolean m1626b(android.app.Activity r2, android.content.Intent r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x000b
            boolean r2 = r2.shouldUpRecreateTask(r3)
            return r2
        L_0x000b:
            android.content.Intent r2 = r2.getIntent()
            java.lang.String r2 = r2.getAction()
            if (r2 == 0) goto L_0x001f
            java.lang.String r3 = "android.intent.action.MAIN"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x001f
            r2 = 1
            goto L_0x0020
        L_0x001f:
            r2 = 0
        L_0x0020:
            return r2
    }
}
