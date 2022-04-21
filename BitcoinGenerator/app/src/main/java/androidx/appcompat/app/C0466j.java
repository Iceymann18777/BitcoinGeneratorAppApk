package androidx.appcompat.app;

/* renamed from: androidx.appcompat.app.j */
/* loaded from: classes.dex */
class C0466j {

    /* renamed from: a */
    private static java.lang.reflect.Field f1510a;

    /* renamed from: b */
    private static boolean f1511b;

    /* renamed from: c */
    private static java.lang.Class f1512c;

    /* renamed from: d */
    private static boolean f1513d;

    /* renamed from: e */
    private static java.lang.reflect.Field f1514e;

    /* renamed from: f */
    private static boolean f1515f;

    /* renamed from: g */
    private static java.lang.reflect.Field f1516g;

    /* renamed from: h */
    private static boolean f1517h;

    /* renamed from: a */
    static void m2524a(android.content.res.Resources r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x0007
            return
        L_0x0007:
            r1 = 24
            if (r0 < r1) goto L_0x000f
            m2520d(r2)
            goto L_0x001e
        L_0x000f:
            r1 = 23
            if (r0 < r1) goto L_0x0017
            m2521c(r2)
            goto L_0x001e
        L_0x0017:
            r1 = 21
            if (r0 < r1) goto L_0x001e
            m2522b(r2)
        L_0x001e:
            return
    }

    /* renamed from: a */
    private static void m2523a(java.lang.Object r4) {
            boolean r0 = androidx.appcompat.app.C0466j.f1513d
            r1 = 1
            java.lang.String r2 = "ResourcesFlusher"
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "android.content.res.ThemedResourceCache"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: ClassNotFoundException -> 0x0010
            androidx.appcompat.app.C0466j.f1512c = r0     // Catch: ClassNotFoundException -> 0x0010
            goto L_0x0016
        L_0x0010:
            r0 = move-exception
            java.lang.String r3 = "Could not find ThemedResourceCache class"
            android.util.Log.e(r2, r3, r0)
        L_0x0016:
            androidx.appcompat.app.C0466j.f1513d = r1
        L_0x0018:
            java.lang.Class r0 = androidx.appcompat.app.C0466j.f1512c
            if (r0 != 0) goto L_0x001d
            return
        L_0x001d:
            boolean r3 = androidx.appcompat.app.C0466j.f1515f
            if (r3 != 0) goto L_0x0037
            java.lang.String r3 = "mUnthemedEntries"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: NoSuchFieldException -> 0x002f
            androidx.appcompat.app.C0466j.f1514e = r0     // Catch: NoSuchFieldException -> 0x002f
            java.lang.reflect.Field r0 = androidx.appcompat.app.C0466j.f1514e     // Catch: NoSuchFieldException -> 0x002f
            r0.setAccessible(r1)     // Catch: NoSuchFieldException -> 0x002f
            goto L_0x0035
        L_0x002f:
            r0 = move-exception
            java.lang.String r3 = "Could not retrieve ThemedResourceCache#mUnthemedEntries field"
            android.util.Log.e(r2, r3, r0)
        L_0x0035:
            androidx.appcompat.app.C0466j.f1515f = r1
        L_0x0037:
            java.lang.reflect.Field r0 = androidx.appcompat.app.C0466j.f1514e
            if (r0 != 0) goto L_0x003c
            return
        L_0x003c:
            r1 = 0
            java.lang.Object r4 = r0.get(r4)     // Catch: IllegalAccessException -> 0x0044
            android.util.LongSparseArray r4 = (android.util.LongSparseArray) r4     // Catch: IllegalAccessException -> 0x0044
            goto L_0x004b
        L_0x0044:
            r4 = move-exception
            java.lang.String r0 = "Could not retrieve value from ThemedResourceCache#mUnthemedEntries"
            android.util.Log.e(r2, r0, r4)
            r4 = r1
        L_0x004b:
            if (r4 == 0) goto L_0x0050
            r4.clear()
        L_0x0050:
            return
    }

    /* renamed from: b */
    private static void m2522b(android.content.res.Resources r4) {
            boolean r0 = androidx.appcompat.app.C0466j.f1511b
            java.lang.String r1 = "ResourcesFlusher"
            if (r0 != 0) goto L_0x001f
            r0 = 1
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.String r3 = "mDrawableCache"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: NoSuchFieldException -> 0x0017
            androidx.appcompat.app.C0466j.f1510a = r2     // Catch: NoSuchFieldException -> 0x0017
            java.lang.reflect.Field r2 = androidx.appcompat.app.C0466j.f1510a     // Catch: NoSuchFieldException -> 0x0017
            r2.setAccessible(r0)     // Catch: NoSuchFieldException -> 0x0017
            goto L_0x001d
        L_0x0017:
            r2 = move-exception
            java.lang.String r3 = "Could not retrieve Resources#mDrawableCache field"
            android.util.Log.e(r1, r3, r2)
        L_0x001d:
            androidx.appcompat.app.C0466j.f1511b = r0
        L_0x001f:
            java.lang.reflect.Field r0 = androidx.appcompat.app.C0466j.f1510a
            if (r0 == 0) goto L_0x0037
            r2 = 0
            java.lang.Object r4 = r0.get(r4)     // Catch: IllegalAccessException -> 0x002b
            java.util.Map r4 = (java.util.Map) r4     // Catch: IllegalAccessException -> 0x002b
            goto L_0x0032
        L_0x002b:
            r4 = move-exception
            java.lang.String r0 = "Could not retrieve value from Resources#mDrawableCache"
            android.util.Log.e(r1, r0, r4)
            r4 = r2
        L_0x0032:
            if (r4 == 0) goto L_0x0037
            r4.clear()
        L_0x0037:
            return
    }

    /* renamed from: c */
    private static void m2521c(android.content.res.Resources r4) {
            boolean r0 = androidx.appcompat.app.C0466j.f1511b
            java.lang.String r1 = "ResourcesFlusher"
            if (r0 != 0) goto L_0x001f
            r0 = 1
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.String r3 = "mDrawableCache"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: NoSuchFieldException -> 0x0017
            androidx.appcompat.app.C0466j.f1510a = r2     // Catch: NoSuchFieldException -> 0x0017
            java.lang.reflect.Field r2 = androidx.appcompat.app.C0466j.f1510a     // Catch: NoSuchFieldException -> 0x0017
            r2.setAccessible(r0)     // Catch: NoSuchFieldException -> 0x0017
            goto L_0x001d
        L_0x0017:
            r2 = move-exception
            java.lang.String r3 = "Could not retrieve Resources#mDrawableCache field"
            android.util.Log.e(r1, r3, r2)
        L_0x001d:
            androidx.appcompat.app.C0466j.f1511b = r0
        L_0x001f:
            r0 = 0
            java.lang.reflect.Field r2 = androidx.appcompat.app.C0466j.f1510a
            if (r2 == 0) goto L_0x002f
            java.lang.Object r0 = r2.get(r4)     // Catch: IllegalAccessException -> 0x0029
            goto L_0x002f
        L_0x0029:
            r4 = move-exception
            java.lang.String r2 = "Could not retrieve value from Resources#mDrawableCache"
            android.util.Log.e(r1, r2, r4)
        L_0x002f:
            if (r0 != 0) goto L_0x0032
            return
        L_0x0032:
            m2523a(r0)
            return
    }

    /* renamed from: d */
    private static void m2520d(android.content.res.Resources r5) {
            boolean r0 = androidx.appcompat.app.C0466j.f1517h
            r1 = 1
            java.lang.String r2 = "ResourcesFlusher"
            if (r0 != 0) goto L_0x001f
            java.lang.Class<android.content.res.Resources> r0 = android.content.res.Resources.class
            java.lang.String r3 = "mResourcesImpl"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: NoSuchFieldException -> 0x0017
            androidx.appcompat.app.C0466j.f1516g = r0     // Catch: NoSuchFieldException -> 0x0017
            java.lang.reflect.Field r0 = androidx.appcompat.app.C0466j.f1516g     // Catch: NoSuchFieldException -> 0x0017
            r0.setAccessible(r1)     // Catch: NoSuchFieldException -> 0x0017
            goto L_0x001d
        L_0x0017:
            r0 = move-exception
            java.lang.String r3 = "Could not retrieve Resources#mResourcesImpl field"
            android.util.Log.e(r2, r3, r0)
        L_0x001d:
            androidx.appcompat.app.C0466j.f1517h = r1
        L_0x001f:
            java.lang.reflect.Field r0 = androidx.appcompat.app.C0466j.f1516g
            if (r0 != 0) goto L_0x0024
            return
        L_0x0024:
            r3 = 0
            java.lang.Object r5 = r0.get(r5)     // Catch: IllegalAccessException -> 0x002a
            goto L_0x0031
        L_0x002a:
            r5 = move-exception
            java.lang.String r0 = "Could not retrieve value from Resources#mResourcesImpl"
            android.util.Log.e(r2, r0, r5)
            r5 = r3
        L_0x0031:
            if (r5 != 0) goto L_0x0034
            return
        L_0x0034:
            boolean r0 = androidx.appcompat.app.C0466j.f1511b
            if (r0 != 0) goto L_0x0052
            java.lang.Class r0 = r5.getClass()     // Catch: NoSuchFieldException -> 0x004a
            java.lang.String r4 = "mDrawableCache"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r4)     // Catch: NoSuchFieldException -> 0x004a
            androidx.appcompat.app.C0466j.f1510a = r0     // Catch: NoSuchFieldException -> 0x004a
            java.lang.reflect.Field r0 = androidx.appcompat.app.C0466j.f1510a     // Catch: NoSuchFieldException -> 0x004a
            r0.setAccessible(r1)     // Catch: NoSuchFieldException -> 0x004a
            goto L_0x0050
        L_0x004a:
            r0 = move-exception
            java.lang.String r4 = "Could not retrieve ResourcesImpl#mDrawableCache field"
            android.util.Log.e(r2, r4, r0)
        L_0x0050:
            androidx.appcompat.app.C0466j.f1511b = r1
        L_0x0052:
            java.lang.reflect.Field r0 = androidx.appcompat.app.C0466j.f1510a
            if (r0 == 0) goto L_0x0061
            java.lang.Object r3 = r0.get(r5)     // Catch: IllegalAccessException -> 0x005b
            goto L_0x0061
        L_0x005b:
            r5 = move-exception
            java.lang.String r0 = "Could not retrieve value from ResourcesImpl#mDrawableCache"
            android.util.Log.e(r2, r0, r5)
        L_0x0061:
            if (r3 == 0) goto L_0x0066
            m2523a(r3)
        L_0x0066:
            return
    }
}
