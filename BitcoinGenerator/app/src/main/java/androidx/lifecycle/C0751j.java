package androidx.lifecycle;

/* renamed from: androidx.lifecycle.j */
/* loaded from: classes.dex */
public class C0751j {

    /* renamed from: a */
    private static java.util.Map<java.lang.Class, java.lang.Integer> f2824a;

    /* renamed from: b */
    private static java.util.Map<java.lang.Class, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.AbstractC0740c>>> f2825b;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.lifecycle.C0751j.f2824a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.lifecycle.C0751j.f2825b = r0
            return
    }

    /* renamed from: a */
    private static androidx.lifecycle.AbstractC0740c m1364a(java.lang.reflect.Constructor<? extends androidx.lifecycle.AbstractC0740c> r2, java.lang.Object r3) {
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: InvocationTargetException -> 0x000d, InstantiationException -> 0x0014, IllegalAccessException -> 0x001b
            r1 = 0
            r0[r1] = r3     // Catch: InvocationTargetException -> 0x000d, InstantiationException -> 0x0014, IllegalAccessException -> 0x001b
            java.lang.Object r2 = r2.newInstance(r0)     // Catch: InvocationTargetException -> 0x000d, InstantiationException -> 0x0014, IllegalAccessException -> 0x001b
            androidx.lifecycle.c r2 = (androidx.lifecycle.AbstractC0740c) r2     // Catch: InvocationTargetException -> 0x000d, InstantiationException -> 0x0014, IllegalAccessException -> 0x001b
            return r2
        L_0x000d:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
        L_0x0014:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
        L_0x001b:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }

    /* renamed from: a */
    static androidx.lifecycle.AbstractC0741d m1366a(java.lang.Object r4) {
            boolean r0 = r4 instanceof androidx.lifecycle.AbstractC0739b
            if (r0 == 0) goto L_0x000c
            androidx.lifecycle.FullLifecycleObserverAdapter r0 = new androidx.lifecycle.FullLifecycleObserverAdapter
            androidx.lifecycle.b r4 = (androidx.lifecycle.AbstractC0739b) r4
            r0.<init>(r4)
            return r0
        L_0x000c:
            boolean r0 = r4 instanceof androidx.lifecycle.AbstractC0741d
            if (r0 == 0) goto L_0x0013
            androidx.lifecycle.d r4 = (androidx.lifecycle.AbstractC0741d) r4
            return r4
        L_0x0013:
            java.lang.Class r0 = r4.getClass()
            int r1 = m1363b(r0)
            r2 = 2
            if (r1 != r2) goto L_0x005f
            java.util.Map<java.lang.Class, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.c>>> r1 = androidx.lifecycle.C0751j.f2825b
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x003e
            java.lang.Object r0 = r0.get(r2)
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            androidx.lifecycle.c r4 = m1364a(r0, r4)
            androidx.lifecycle.SingleGeneratedAdapterObserver r0 = new androidx.lifecycle.SingleGeneratedAdapterObserver
            r0.<init>(r4)
            return r0
        L_0x003e:
            int r1 = r0.size()
            androidx.lifecycle.c[] r1 = new androidx.lifecycle.AbstractC0740c[r1]
        L_0x0044:
            int r3 = r0.size()
            if (r2 >= r3) goto L_0x0059
            java.lang.Object r3 = r0.get(r2)
            java.lang.reflect.Constructor r3 = (java.lang.reflect.Constructor) r3
            androidx.lifecycle.c r3 = m1364a(r3, r4)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L_0x0044
        L_0x0059:
            androidx.lifecycle.CompositeGeneratedAdaptersObserver r4 = new androidx.lifecycle.CompositeGeneratedAdaptersObserver
            r4.<init>(r1)
            return r4
        L_0x005f:
            androidx.lifecycle.ReflectiveGenericLifecycleObserver r0 = new androidx.lifecycle.ReflectiveGenericLifecycleObserver
            r0.<init>(r4)
            return r0
    }

    /* renamed from: a */
    public static java.lang.String m1365a(java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "."
            java.lang.String r2 = "_"
            java.lang.String r3 = r3.replace(r1, r2)
            r0.append(r3)
            java.lang.String r3 = "_LifecycleAdapter"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* renamed from: a */
    private static java.lang.reflect.Constructor<? extends androidx.lifecycle.AbstractC0740c> m1367a(java.lang.Class<?> r4) {
            java.lang.Package r0 = r4.getPackage()     // Catch: NoSuchMethodException -> 0x0058, ClassNotFoundException -> 0x005f
            java.lang.String r1 = r4.getCanonicalName()     // Catch: NoSuchMethodException -> 0x0058, ClassNotFoundException -> 0x005f
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = r0.getName()     // Catch: NoSuchMethodException -> 0x0058, ClassNotFoundException -> 0x005f
            goto L_0x0011
        L_0x000f:
            java.lang.String r0 = ""
        L_0x0011:
            boolean r2 = r0.isEmpty()     // Catch: NoSuchMethodException -> 0x0058, ClassNotFoundException -> 0x005f
            r3 = 1
            if (r2 == 0) goto L_0x0019
            goto L_0x0022
        L_0x0019:
            int r2 = r0.length()     // Catch: NoSuchMethodException -> 0x0058, ClassNotFoundException -> 0x005f
            int r2 = r2 + r3
            java.lang.String r1 = r1.substring(r2)     // Catch: NoSuchMethodException -> 0x0058, ClassNotFoundException -> 0x005f
        L_0x0022:
            java.lang.String r1 = m1365a(r1)     // Catch: NoSuchMethodException -> 0x0058, ClassNotFoundException -> 0x005f
            boolean r2 = r0.isEmpty()     // Catch: NoSuchMethodException -> 0x0058, ClassNotFoundException -> 0x005f
            if (r2 == 0) goto L_0x002d
            goto L_0x0041
        L_0x002d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: NoSuchMethodException -> 0x0058, ClassNotFoundException -> 0x005f
            r2.<init>()     // Catch: NoSuchMethodException -> 0x0058, ClassNotFoundException -> 0x005f
            r2.append(r0)     // Catch: NoSuchMethodException -> 0x0058, ClassNotFoundException -> 0x005f
            java.lang.String r0 = "."
            r2.append(r0)     // Catch: NoSuchMethodException -> 0x0058, ClassNotFoundException -> 0x005f
            r2.append(r1)     // Catch: NoSuchMethodException -> 0x0058, ClassNotFoundException -> 0x005f
            java.lang.String r1 = r2.toString()     // Catch: NoSuchMethodException -> 0x0058, ClassNotFoundException -> 0x005f
        L_0x0041:
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch: NoSuchMethodException -> 0x0058, ClassNotFoundException -> 0x005f
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch: NoSuchMethodException -> 0x0058, ClassNotFoundException -> 0x005f
            r2 = 0
            r1[r2] = r4     // Catch: NoSuchMethodException -> 0x0058, ClassNotFoundException -> 0x005f
            java.lang.reflect.Constructor r4 = r0.getDeclaredConstructor(r1)     // Catch: NoSuchMethodException -> 0x0058, ClassNotFoundException -> 0x005f
            boolean r0 = r4.isAccessible()     // Catch: NoSuchMethodException -> 0x0058, ClassNotFoundException -> 0x005f
            if (r0 != 0) goto L_0x0057
            r4.setAccessible(r3)     // Catch: NoSuchMethodException -> 0x0058, ClassNotFoundException -> 0x005f
        L_0x0057:
            return r4
        L_0x0058:
            r4 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r4)
            throw r0
        L_0x005f:
            r4 = 0
            return r4
    }

    /* renamed from: b */
    private static int m1363b(java.lang.Class<?> r3) {
            java.util.Map<java.lang.Class, java.lang.Integer> r0 = androidx.lifecycle.C0751j.f2824a
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x0015
            java.util.Map<java.lang.Class, java.lang.Integer> r0 = androidx.lifecycle.C0751j.f2824a
            java.lang.Object r3 = r0.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            return r3
        L_0x0015:
            int r0 = m1361d(r3)
            java.util.Map<java.lang.Class, java.lang.Integer> r1 = androidx.lifecycle.C0751j.f2824a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1.put(r3, r2)
            return r0
    }

    /* renamed from: c */
    private static boolean m1362c(java.lang.Class<?> r1) {
            if (r1 == 0) goto L_0x000c
            java.lang.Class<androidx.lifecycle.f> r0 = androidx.lifecycle.AbstractC0745f.class
            boolean r1 = r0.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            return r1
    }

    /* renamed from: d */
    private static int m1361d(java.lang.Class<?> r8) {
            java.lang.String r0 = r8.getCanonicalName()
            r1 = 1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.reflect.Constructor r0 = m1367a(r8)
            r2 = 2
            if (r0 == 0) goto L_0x0019
            java.util.Map<java.lang.Class, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.c>>> r1 = androidx.lifecycle.C0751j.f2825b
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.put(r8, r0)
            return r2
        L_0x0019:
            androidx.lifecycle.a r0 = androidx.lifecycle.C0736a.f2800c
            boolean r0 = r0.m1400b(r8)
            if (r0 == 0) goto L_0x0022
            return r1
        L_0x0022:
            java.lang.Class r0 = r8.getSuperclass()
            r3 = 0
            boolean r4 = m1362c(r0)
            if (r4 == 0) goto L_0x0041
            int r3 = m1363b(r0)
            if (r3 != r1) goto L_0x0034
            return r1
        L_0x0034:
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.Map<java.lang.Class, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.c>>> r4 = androidx.lifecycle.C0751j.f2825b
            java.lang.Object r0 = r4.get(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r3.<init>(r0)
        L_0x0041:
            java.lang.Class[] r0 = r8.getInterfaces()
            int r4 = r0.length
            r5 = 0
        L_0x0047:
            if (r5 >= r4) goto L_0x006e
            r6 = r0[r5]
            boolean r7 = m1362c(r6)
            if (r7 != 0) goto L_0x0052
            goto L_0x006b
        L_0x0052:
            int r7 = m1363b(r6)
            if (r7 != r1) goto L_0x0059
            return r1
        L_0x0059:
            if (r3 != 0) goto L_0x0060
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x0060:
            java.util.Map<java.lang.Class, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.c>>> r7 = androidx.lifecycle.C0751j.f2825b
            java.lang.Object r6 = r7.get(r6)
            java.util.Collection r6 = (java.util.Collection) r6
            r3.addAll(r6)
        L_0x006b:
            int r5 = r5 + 1
            goto L_0x0047
        L_0x006e:
            if (r3 == 0) goto L_0x0076
            java.util.Map<java.lang.Class, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.c>>> r0 = androidx.lifecycle.C0751j.f2825b
            r0.put(r8, r3)
            return r2
        L_0x0076:
            return r1
    }
}
