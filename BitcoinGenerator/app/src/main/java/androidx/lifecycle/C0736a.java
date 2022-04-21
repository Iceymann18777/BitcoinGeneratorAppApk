package androidx.lifecycle;

/* renamed from: androidx.lifecycle.a */
/* loaded from: classes.dex */
class C0736a {

    /* renamed from: c */
    static androidx.lifecycle.C0736a f2800c;

    /* renamed from: a */
    private final java.util.Map<java.lang.Class, androidx.lifecycle.C0736a.C0737a> f2801a;

    /* renamed from: b */
    private final java.util.Map<java.lang.Class, java.lang.Boolean> f2802b;

    /* renamed from: androidx.lifecycle.a$a */
    /* loaded from: classes.dex */
    static class C0737a {

        /* renamed from: a */
        final java.util.Map<androidx.lifecycle.AbstractC0742e.EnumC0743a, java.util.List<androidx.lifecycle.C0736a.C0738b>> f2803a;

        /* renamed from: b */
        final java.util.Map<androidx.lifecycle.C0736a.C0738b, androidx.lifecycle.AbstractC0742e.EnumC0743a> f2804b;

        C0737a(java.util.Map<androidx.lifecycle.C0736a.C0738b, androidx.lifecycle.AbstractC0742e.EnumC0743a> r5) {
                r4 = this;
                r4.<init>()
                r4.f2804b = r5
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r4.f2803a = r0
                java.util.Set r5 = r5.entrySet()
                java.util.Iterator r5 = r5.iterator()
            L_0x0014:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L_0x0042
                java.lang.Object r0 = r5.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getValue()
                androidx.lifecycle.e$a r1 = (androidx.lifecycle.AbstractC0742e.EnumC0743a) r1
                java.util.Map<androidx.lifecycle.e$a, java.util.List<androidx.lifecycle.a$b>> r2 = r4.f2803a
                java.lang.Object r2 = r2.get(r1)
                java.util.List r2 = (java.util.List) r2
                if (r2 != 0) goto L_0x003a
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Map<androidx.lifecycle.e$a, java.util.List<androidx.lifecycle.a$b>> r3 = r4.f2803a
                r3.put(r1, r2)
            L_0x003a:
                java.lang.Object r0 = r0.getKey()
                r2.add(r0)
                goto L_0x0014
            L_0x0042:
                return
        }

        /* renamed from: a */
        private static void m1397a(java.util.List<androidx.lifecycle.C0736a.C0738b> r2, androidx.lifecycle.AbstractC0746g r3, androidx.lifecycle.AbstractC0742e.EnumC0743a r4, java.lang.Object r5) {
                if (r2 == 0) goto L_0x0016
                int r0 = r2.size()
                int r0 = r0 + (-1)
            L_0x0008:
                if (r0 < 0) goto L_0x0016
                java.lang.Object r1 = r2.get(r0)
                androidx.lifecycle.a$b r1 = (androidx.lifecycle.C0736a.C0738b) r1
                r1.m1396a(r3, r4, r5)
                int r0 = r0 + (-1)
                goto L_0x0008
            L_0x0016:
                return
        }

        /* renamed from: a */
        void m1398a(androidx.lifecycle.AbstractC0746g r3, androidx.lifecycle.AbstractC0742e.EnumC0743a r4, java.lang.Object r5) {
                r2 = this;
                java.util.Map<androidx.lifecycle.e$a, java.util.List<androidx.lifecycle.a$b>> r0 = r2.f2803a
                java.lang.Object r0 = r0.get(r4)
                java.util.List r0 = (java.util.List) r0
                m1397a(r0, r3, r4, r5)
                java.util.Map<androidx.lifecycle.e$a, java.util.List<androidx.lifecycle.a$b>> r0 = r2.f2803a
                androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_ANY
                java.lang.Object r0 = r0.get(r1)
                java.util.List r0 = (java.util.List) r0
                m1397a(r0, r3, r4, r5)
                return
        }
    }

    /* renamed from: androidx.lifecycle.a$b */
    /* loaded from: classes.dex */
    static class C0738b {

        /* renamed from: a */
        final int f2805a;

        /* renamed from: b */
        final java.lang.reflect.Method f2806b;

        C0738b(int r1, java.lang.reflect.Method r2) {
                r0 = this;
                r0.<init>()
                r0.f2805a = r1
                r0.f2806b = r2
                java.lang.reflect.Method r1 = r0.f2806b
                r2 = 1
                r1.setAccessible(r2)
                return
        }

        /* renamed from: a */
        void m1396a(androidx.lifecycle.AbstractC0746g r5, androidx.lifecycle.AbstractC0742e.EnumC0743a r6, java.lang.Object r7) {
                r4 = this;
                int r0 = r4.f2805a     // Catch: IllegalAccessException -> 0x002a, InvocationTargetException -> 0x0031
                r1 = 0
                if (r0 == 0) goto L_0x0022
                r2 = 1
                if (r0 == r2) goto L_0x0018
                r3 = 2
                if (r0 == r3) goto L_0x000c
                goto L_0x0029
            L_0x000c:
                java.lang.reflect.Method r0 = r4.f2806b     // Catch: IllegalAccessException -> 0x002a, InvocationTargetException -> 0x0031
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: IllegalAccessException -> 0x002a, InvocationTargetException -> 0x0031
                r3[r1] = r5     // Catch: IllegalAccessException -> 0x002a, InvocationTargetException -> 0x0031
                r3[r2] = r6     // Catch: IllegalAccessException -> 0x002a, InvocationTargetException -> 0x0031
                r0.invoke(r7, r3)     // Catch: IllegalAccessException -> 0x002a, InvocationTargetException -> 0x0031
                goto L_0x0029
            L_0x0018:
                java.lang.reflect.Method r6 = r4.f2806b     // Catch: IllegalAccessException -> 0x002a, InvocationTargetException -> 0x0031
                java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: IllegalAccessException -> 0x002a, InvocationTargetException -> 0x0031
                r0[r1] = r5     // Catch: IllegalAccessException -> 0x002a, InvocationTargetException -> 0x0031
                r6.invoke(r7, r0)     // Catch: IllegalAccessException -> 0x002a, InvocationTargetException -> 0x0031
                goto L_0x0029
            L_0x0022:
                java.lang.reflect.Method r5 = r4.f2806b     // Catch: IllegalAccessException -> 0x002a, InvocationTargetException -> 0x0031
                java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: IllegalAccessException -> 0x002a, InvocationTargetException -> 0x0031
                r5.invoke(r7, r6)     // Catch: IllegalAccessException -> 0x002a, InvocationTargetException -> 0x0031
            L_0x0029:
                return
            L_0x002a:
                r5 = move-exception
                java.lang.RuntimeException r6 = new java.lang.RuntimeException
                r6.<init>(r5)
                throw r6
            L_0x0031:
                r5 = move-exception
                java.lang.RuntimeException r6 = new java.lang.RuntimeException
                java.lang.Throwable r5 = r5.getCause()
                java.lang.String r7 = "Failed to call observer method"
                r6.<init>(r7, r5)
                throw r6
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L_0x0004
                return r0
            L_0x0004:
                r1 = 0
                if (r5 == 0) goto L_0x002d
                java.lang.Class<androidx.lifecycle.a$b> r2 = androidx.lifecycle.C0736a.C0738b.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L_0x0010
                goto L_0x002d
            L_0x0010:
                androidx.lifecycle.a$b r5 = (androidx.lifecycle.C0736a.C0738b) r5
                int r2 = r4.f2805a
                int r3 = r5.f2805a
                if (r2 != r3) goto L_0x002b
                java.lang.reflect.Method r2 = r4.f2806b
                java.lang.String r2 = r2.getName()
                java.lang.reflect.Method r5 = r5.f2806b
                java.lang.String r5 = r5.getName()
                boolean r5 = r2.equals(r5)
                if (r5 == 0) goto L_0x002b
                goto L_0x002c
            L_0x002b:
                r0 = 0
            L_0x002c:
                return r0
            L_0x002d:
                return r1
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.f2805a
                int r0 = r0 * 31
                java.lang.reflect.Method r1 = r2.f2806b
                java.lang.String r1 = r1.getName()
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    static {
            androidx.lifecycle.a r0 = new androidx.lifecycle.a
            r0.<init>()
            androidx.lifecycle.C0736a.f2800c = r0
            return
    }

    C0736a() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f2801a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f2802b = r0
            return
    }

    /* renamed from: a */
    private androidx.lifecycle.C0736a.C0737a m1402a(java.lang.Class r12, java.lang.reflect.Method[] r13) {
            r11 = this;
            java.lang.Class r0 = r12.getSuperclass()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            if (r0 == 0) goto L_0x0016
            androidx.lifecycle.a$a r0 = r11.m1403a(r0)
            if (r0 == 0) goto L_0x0016
            java.util.Map<androidx.lifecycle.a$b, androidx.lifecycle.e$a> r0 = r0.f2804b
            r1.putAll(r0)
        L_0x0016:
            java.lang.Class[] r0 = r12.getInterfaces()
            int r2 = r0.length
            r3 = 0
            r4 = 0
        L_0x001d:
            if (r4 >= r2) goto L_0x004e
            r5 = r0[r4]
            androidx.lifecycle.a$a r5 = r11.m1403a(r5)
            java.util.Map<androidx.lifecycle.a$b, androidx.lifecycle.e$a> r5 = r5.f2804b
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x002f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x004b
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            androidx.lifecycle.a$b r7 = (androidx.lifecycle.C0736a.C0738b) r7
            java.lang.Object r6 = r6.getValue()
            androidx.lifecycle.e$a r6 = (androidx.lifecycle.AbstractC0742e.EnumC0743a) r6
            r11.m1401a(r1, r7, r6, r12)
            goto L_0x002f
        L_0x004b:
            int r4 = r4 + 1
            goto L_0x001d
        L_0x004e:
            if (r13 == 0) goto L_0x0051
            goto L_0x0055
        L_0x0051:
            java.lang.reflect.Method[] r13 = r11.m1399c(r12)
        L_0x0055:
            int r0 = r13.length
            r2 = 0
            r4 = 0
        L_0x0058:
            if (r2 >= r0) goto L_0x00c3
            r5 = r13[r2]
            java.lang.Class<androidx.lifecycle.n> r6 = androidx.lifecycle.AbstractC0755n.class
            java.lang.annotation.Annotation r6 = r5.getAnnotation(r6)
            androidx.lifecycle.n r6 = (androidx.lifecycle.AbstractC0755n) r6
            r7 = 1
            if (r6 != 0) goto L_0x0068
            goto L_0x00b8
        L_0x0068:
            java.lang.Class[] r4 = r5.getParameterTypes()
            int r8 = r4.length
            if (r8 <= 0) goto L_0x0083
            r8 = r4[r3]
            java.lang.Class<androidx.lifecycle.g> r9 = androidx.lifecycle.AbstractC0746g.class
            boolean r8 = r8.isAssignableFrom(r9)
            if (r8 == 0) goto L_0x007b
            r8 = 1
            goto L_0x0084
        L_0x007b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "invalid parameter type. Must be one and instanceof LifecycleOwner"
            r12.<init>(r13)
            throw r12
        L_0x0083:
            r8 = 0
        L_0x0084:
            androidx.lifecycle.e$a r6 = r6.value()
            int r9 = r4.length
            r10 = 2
            if (r9 <= r7) goto L_0x00ac
            r8 = r4[r7]
            java.lang.Class<androidx.lifecycle.e$a> r9 = androidx.lifecycle.AbstractC0742e.EnumC0743a.class
            boolean r8 = r8.isAssignableFrom(r9)
            if (r8 == 0) goto L_0x00a4
            androidx.lifecycle.e$a r8 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_ANY
            if (r6 != r8) goto L_0x009c
            r8 = 2
            goto L_0x00ac
        L_0x009c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Second arg is supported only for ON_ANY value"
            r12.<init>(r13)
            throw r12
        L_0x00a4:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "invalid parameter type. second arg must be an event"
            r12.<init>(r13)
            throw r12
        L_0x00ac:
            int r4 = r4.length
            if (r4 > r10) goto L_0x00bb
            androidx.lifecycle.a$b r4 = new androidx.lifecycle.a$b
            r4.<init>(r8, r5)
            r11.m1401a(r1, r4, r6, r12)
            r4 = 1
        L_0x00b8:
            int r2 = r2 + 1
            goto L_0x0058
        L_0x00bb:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "cannot have more than 2 params"
            r12.<init>(r13)
            throw r12
        L_0x00c3:
            androidx.lifecycle.a$a r13 = new androidx.lifecycle.a$a
            r13.<init>(r1)
            java.util.Map<java.lang.Class, androidx.lifecycle.a$a> r0 = r11.f2801a
            r0.put(r12, r13)
            java.util.Map<java.lang.Class, java.lang.Boolean> r0 = r11.f2802b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r0.put(r12, r1)
            return r13
    }

    /* renamed from: a */
    private void m1401a(java.util.Map<androidx.lifecycle.C0736a.C0738b, androidx.lifecycle.AbstractC0742e.EnumC0743a> r4, androidx.lifecycle.C0736a.C0738b r5, androidx.lifecycle.AbstractC0742e.EnumC0743a r6, java.lang.Class r7) {
            r3 = this;
            java.lang.Object r0 = r4.get(r5)
            androidx.lifecycle.e$a r0 = (androidx.lifecycle.AbstractC0742e.EnumC0743a) r0
            if (r0 == 0) goto L_0x0049
            if (r6 != r0) goto L_0x000b
            goto L_0x0049
        L_0x000b:
            java.lang.reflect.Method r4 = r5.f2806b
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Method "
            r1.append(r2)
            java.lang.String r4 = r4.getName()
            r1.append(r4)
            java.lang.String r4 = " in "
            r1.append(r4)
            java.lang.String r4 = r7.getName()
            r1.append(r4)
            java.lang.String r4 = " already declared with different @OnLifecycleEvent value: previous"
            r1.append(r4)
            java.lang.String r4 = " value "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = ", new value "
            r1.append(r4)
            r1.append(r6)
            java.lang.String r4 = r1.toString()
            r5.<init>(r4)
            throw r5
        L_0x0049:
            if (r0 != 0) goto L_0x004e
            r4.put(r5, r6)
        L_0x004e:
            return
    }

    /* renamed from: c */
    private java.lang.reflect.Method[] m1399c(java.lang.Class r3) {
            r2 = this;
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()     // Catch: NoClassDefFoundError -> 0x0005
            return r3
        L_0x0005:
            r3 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor."
            r0.<init>(r1, r3)
            throw r0
    }

    /* renamed from: a */
    androidx.lifecycle.C0736a.C0737a m1403a(java.lang.Class r2) {
            r1 = this;
            java.util.Map<java.lang.Class, androidx.lifecycle.a$a> r0 = r1.f2801a
            java.lang.Object r0 = r0.get(r2)
            androidx.lifecycle.a$a r0 = (androidx.lifecycle.C0736a.C0737a) r0
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x000b:
            r0 = 0
            androidx.lifecycle.a$a r2 = r1.m1402a(r2, r0)
            return r2
    }

    /* renamed from: b */
    boolean m1400b(java.lang.Class r7) {
            r6 = this;
            java.util.Map<java.lang.Class, java.lang.Boolean> r0 = r6.f2802b
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L_0x0015
            java.util.Map<java.lang.Class, java.lang.Boolean> r0 = r6.f2802b
            java.lang.Object r7 = r0.get(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x0015:
            java.lang.reflect.Method[] r0 = r6.m1399c(r7)
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x001c:
            if (r3 >= r1) goto L_0x0032
            r4 = r0[r3]
            java.lang.Class<androidx.lifecycle.n> r5 = androidx.lifecycle.AbstractC0755n.class
            java.lang.annotation.Annotation r4 = r4.getAnnotation(r5)
            androidx.lifecycle.n r4 = (androidx.lifecycle.AbstractC0755n) r4
            if (r4 == 0) goto L_0x002f
            r6.m1402a(r7, r0)
            r7 = 1
            return r7
        L_0x002f:
            int r3 = r3 + 1
            goto L_0x001c
        L_0x0032:
            java.util.Map<java.lang.Class, java.lang.Boolean> r0 = r6.f2802b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r0.put(r7, r1)
            return r2
    }
}
