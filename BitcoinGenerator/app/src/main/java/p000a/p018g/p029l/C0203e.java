package p000a.p018g.p029l;

/* renamed from: a.g.l.e */
/* loaded from: classes.dex */
public final class C0203e {

    /* renamed from: a */
    private static java.lang.reflect.Field f652a;

    /* renamed from: b */
    private static boolean f653b;

    /* renamed from: a */
    private static void m3482a(android.view.LayoutInflater r6, android.view.LayoutInflater.Factory2 r7) {
            boolean r0 = p000a.p018g.p029l.C0203e.f653b
            java.lang.String r1 = "; inflation may have unexpected results."
            java.lang.String r2 = "LayoutInflaterCompatHC"
            if (r0 != 0) goto L_0x0039
            r0 = 1
            java.lang.Class<android.view.LayoutInflater> r3 = android.view.LayoutInflater.class
            java.lang.String r4 = "mFactory2"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: NoSuchFieldException -> 0x0019
            p000a.p018g.p029l.C0203e.f652a = r3     // Catch: NoSuchFieldException -> 0x0019
            java.lang.reflect.Field r3 = p000a.p018g.p029l.C0203e.f652a     // Catch: NoSuchFieldException -> 0x0019
            r3.setAccessible(r0)     // Catch: NoSuchFieldException -> 0x0019
            goto L_0x0037
        L_0x0019:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "forceSetFactory2 Could not find field 'mFactory2' on class "
            r4.append(r5)
            java.lang.Class<android.view.LayoutInflater> r5 = android.view.LayoutInflater.class
            java.lang.String r5 = r5.getName()
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r2, r4, r3)
        L_0x0037:
            p000a.p018g.p029l.C0203e.f653b = r0
        L_0x0039:
            java.lang.reflect.Field r0 = p000a.p018g.p029l.C0203e.f652a
            if (r0 == 0) goto L_0x0059
            r0.set(r6, r7)     // Catch: IllegalAccessException -> 0x0041
            goto L_0x0059
        L_0x0041:
            r7 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "forceSetFactory2 could not set the Factory2 on LayoutInflater "
            r0.append(r3)
            r0.append(r6)
            r0.append(r1)
            java.lang.String r6 = r0.toString()
            android.util.Log.e(r2, r6, r7)
        L_0x0059:
            return
    }

    /* renamed from: b */
    public static void m3481b(android.view.LayoutInflater r2, android.view.LayoutInflater.Factory2 r3) {
            r2.setFactory2(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L_0x001a
            android.view.LayoutInflater$Factory r0 = r2.getFactory()
            boolean r1 = r0 instanceof android.view.LayoutInflater.Factory2
            if (r1 == 0) goto L_0x0017
            android.view.LayoutInflater$Factory2 r0 = (android.view.LayoutInflater.Factory2) r0
            m3482a(r2, r0)
            goto L_0x001a
        L_0x0017:
            m3482a(r2, r3)
        L_0x001a:
            return
    }
}
