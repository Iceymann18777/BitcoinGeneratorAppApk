package androidx.appcompat.app;

/* renamed from: androidx.appcompat.app.m */
/* loaded from: classes.dex */
class C0474m {

    /* renamed from: d */
    private static androidx.appcompat.app.C0474m f1536d;

    /* renamed from: a */
    private final android.content.Context f1537a;

    /* renamed from: b */
    private final android.location.LocationManager f1538b;

    /* renamed from: c */
    private final androidx.appcompat.app.C0474m.C0475a f1539c;

    /* renamed from: androidx.appcompat.app.m$a */
    /* loaded from: classes.dex */
    private static class C0475a {

        /* renamed from: a */
        boolean f1540a;

        /* renamed from: b */
        long f1541b;

        /* renamed from: c */
        long f1542c;

        /* renamed from: d */
        long f1543d;

        /* renamed from: e */
        long f1544e;

        /* renamed from: f */
        long f1545f;

        C0475a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    C0474m(android.content.Context r2, android.location.LocationManager r3) {
            r1 = this;
            r1.<init>()
            androidx.appcompat.app.m$a r0 = new androidx.appcompat.app.m$a
            r0.<init>()
            r1.f1539c = r0
            r1.f1537a = r2
            r1.f1538b = r3
            return
    }

    /* renamed from: a */
    private android.location.Location m2506a(java.lang.String r3) {
            r2 = this;
            android.location.LocationManager r0 = r2.f1538b     // Catch: Exception -> 0x000f
            boolean r0 = r0.isProviderEnabled(r3)     // Catch: Exception -> 0x000f
            if (r0 == 0) goto L_0x0017
            android.location.LocationManager r0 = r2.f1538b     // Catch: Exception -> 0x000f
            android.location.Location r3 = r0.getLastKnownLocation(r3)     // Catch: Exception -> 0x000f
            return r3
        L_0x000f:
            r3 = move-exception
            java.lang.String r0 = "TwilightManager"
            java.lang.String r1 = "Failed to get last known location"
            android.util.Log.d(r0, r1, r3)
        L_0x0017:
            r3 = 0
            return r3
    }

    /* renamed from: a */
    static androidx.appcompat.app.C0474m m2508a(android.content.Context r2) {
            androidx.appcompat.app.m r0 = androidx.appcompat.app.C0474m.f1536d
            if (r0 != 0) goto L_0x0017
            android.content.Context r2 = r2.getApplicationContext()
            androidx.appcompat.app.m r0 = new androidx.appcompat.app.m
            java.lang.String r1 = "location"
            java.lang.Object r1 = r2.getSystemService(r1)
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            r0.<init>(r2, r1)
            androidx.appcompat.app.C0474m.f1536d = r0
        L_0x0017:
            androidx.appcompat.app.m r2 = androidx.appcompat.app.C0474m.f1536d
            return r2
    }

    /* renamed from: a */
    private void m2507a(android.location.Location r23) {
            r22 = this;
            r0 = r22
            androidx.appcompat.app.m$a r1 = r0.f1539c
            long r9 = java.lang.System.currentTimeMillis()
            androidx.appcompat.app.l r11 = androidx.appcompat.app.C0473l.m2511a()
            r12 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r9 - r12
            double r5 = r23.getLatitude()
            double r7 = r23.getLongitude()
            r2 = r11
            r2.m2510a(r3, r5, r7)
            long r14 = r11.f1533a
            double r5 = r23.getLatitude()
            double r7 = r23.getLongitude()
            r3 = r9
            r2.m2510a(r3, r5, r7)
            int r2 = r11.f1535c
            r3 = 1
            if (r2 != r3) goto L_0x0032
            r7 = 1
            goto L_0x0034
        L_0x0032:
            r3 = 0
            r7 = 0
        L_0x0034:
            long r5 = r11.f1534b
            long r3 = r11.f1533a
            long r12 = r12 + r9
            double r16 = r23.getLatitude()
            double r18 = r23.getLongitude()
            r2 = r11
            r20 = r14
            r14 = r3
            r3 = r12
            r12 = r5
            r5 = r16
            r0 = r7
            r7 = r18
            r2.m2510a(r3, r5, r7)
            long r2 = r11.f1534b
            r4 = 0
            r6 = -1
            int r8 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0070
            int r8 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x005e
            goto L_0x0070
        L_0x005e:
            int r6 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r6 <= 0) goto L_0x0064
            long r4 = r4 + r2
            goto L_0x006b
        L_0x0064:
            int r6 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r6 <= 0) goto L_0x006a
            long r4 = r4 + r14
            goto L_0x006b
        L_0x006a:
            long r4 = r4 + r12
        L_0x006b:
            r6 = 60000(0xea60, double:2.9644E-319)
            long r4 = r4 + r6
            goto L_0x0074
        L_0x0070:
            r4 = 43200000(0x2932e00, double:2.1343636E-316)
            long r4 = r4 + r9
        L_0x0074:
            r1.f1540a = r0
            r6 = r20
            r1.f1541b = r6
            r1.f1542c = r12
            r1.f1543d = r14
            r1.f1544e = r2
            r1.f1545f = r4
            return
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private android.location.Location m2505b() {
            r7 = this;
            android.content.Context r0 = r7.f1537a
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = p000a.p018g.p019d.C0125b.m3731a(r0, r1)
            r1 = 0
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "network"
            android.location.Location r0 = r7.m2506a(r0)
            goto L_0x0013
        L_0x0012:
            r0 = r1
        L_0x0013:
            android.content.Context r2 = r7.f1537a
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            int r2 = p000a.p018g.p019d.C0125b.m3731a(r2, r3)
            if (r2 != 0) goto L_0x0023
            java.lang.String r1 = "gps"
            android.location.Location r1 = r7.m2506a(r1)
        L_0x0023:
            if (r1 == 0) goto L_0x0035
            if (r0 == 0) goto L_0x0035
            long r2 = r1.getTime()
            long r4 = r0.getTime()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0034
            r0 = r1
        L_0x0034:
            return r0
        L_0x0035:
            if (r1 == 0) goto L_0x0038
            r0 = r1
        L_0x0038:
            return r0
    }

    /* renamed from: c */
    private boolean m2504c() {
            r5 = this;
            androidx.appcompat.app.m$a r0 = r5.f1539c
            long r0 = r0.f1545f
            long r2 = java.lang.System.currentTimeMillis()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
    }

    /* renamed from: a */
    boolean m2509a() {
            r2 = this;
            androidx.appcompat.app.m$a r0 = r2.f1539c
            boolean r1 = r2.m2504c()
            if (r1 == 0) goto L_0x000b
            boolean r0 = r0.f1540a
            return r0
        L_0x000b:
            android.location.Location r1 = r2.m2505b()
            if (r1 == 0) goto L_0x0017
            r2.m2507a(r1)
            boolean r0 = r0.f1540a
            return r0
        L_0x0017:
            java.lang.String r0 = "TwilightManager"
            java.lang.String r1 = "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values."
            android.util.Log.i(r0, r1)
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 11
            int r0 = r0.get(r1)
            r1 = 6
            if (r0 < r1) goto L_0x0032
            r1 = 22
            if (r0 < r1) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r0 = 0
            goto L_0x0033
        L_0x0032:
            r0 = 1
        L_0x0033:
            return r0
    }
}
