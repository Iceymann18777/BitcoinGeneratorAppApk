package p000a.p045n;

/* renamed from: a.n.y */
/* loaded from: classes.dex */
class C0389y {

    /* renamed from: a */
    private static android.animation.LayoutTransition f1174a;

    /* renamed from: b */
    private static java.lang.reflect.Field f1175b;

    /* renamed from: c */
    private static boolean f1176c;

    /* renamed from: d */
    private static java.lang.reflect.Method f1177d;

    /* renamed from: e */
    private static boolean f1178e;

    /* renamed from: a.n.y$a */
    /* loaded from: classes.dex */
    static class C0390a extends android.animation.LayoutTransition {
        C0390a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.animation.LayoutTransition
        public boolean isChangingLayout() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    /* renamed from: a */
    private static void m2764a(android.animation.LayoutTransition r7) {
            boolean r0 = p000a.p045n.C0389y.f1178e
            java.lang.String r1 = "Failed to access cancel method by reflection"
            r2 = 0
            java.lang.String r3 = "ViewGroupUtilsApi14"
            if (r0 != 0) goto L_0x0021
            r0 = 1
            java.lang.Class<android.animation.LayoutTransition> r4 = android.animation.LayoutTransition.class
            java.lang.String r5 = "cancel"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: NoSuchMethodException -> 0x001c
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r5, r6)     // Catch: NoSuchMethodException -> 0x001c
            p000a.p045n.C0389y.f1177d = r4     // Catch: NoSuchMethodException -> 0x001c
            java.lang.reflect.Method r4 = p000a.p045n.C0389y.f1177d     // Catch: NoSuchMethodException -> 0x001c
            r4.setAccessible(r0)     // Catch: NoSuchMethodException -> 0x001c
            goto L_0x001f
        L_0x001c:
            android.util.Log.i(r3, r1)
        L_0x001f:
            p000a.p045n.C0389y.f1178e = r0
        L_0x0021:
            java.lang.reflect.Method r0 = p000a.p045n.C0389y.f1177d
            if (r0 == 0) goto L_0x0034
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: InvocationTargetException -> 0x002b, IllegalAccessException -> 0x0031
            r0.invoke(r7, r2)     // Catch: InvocationTargetException -> 0x002b, IllegalAccessException -> 0x0031
            goto L_0x0034
        L_0x002b:
            java.lang.String r7 = "Failed to invoke cancel method by reflection"
            android.util.Log.i(r3, r7)
            goto L_0x0034
        L_0x0031:
            android.util.Log.i(r3, r1)
        L_0x0034:
            return
    }

    /* renamed from: a */
    static void m2763a(android.view.ViewGroup r5, boolean r6) {
            android.animation.LayoutTransition r0 = p000a.p045n.C0389y.f1174a
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x002a
            a.n.y$a r0 = new a.n.y$a
            r0.<init>()
            p000a.p045n.C0389y.f1174a = r0
            android.animation.LayoutTransition r0 = p000a.p045n.C0389y.f1174a
            r4 = 2
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = p000a.p045n.C0389y.f1174a
            r0.setAnimator(r2, r3)
            android.animation.LayoutTransition r0 = p000a.p045n.C0389y.f1174a
            r0.setAnimator(r1, r3)
            android.animation.LayoutTransition r0 = p000a.p045n.C0389y.f1174a
            r4 = 3
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = p000a.p045n.C0389y.f1174a
            r4 = 4
            r0.setAnimator(r4, r3)
        L_0x002a:
            if (r6 == 0) goto L_0x004a
            android.animation.LayoutTransition r6 = r5.getLayoutTransition()
            if (r6 == 0) goto L_0x0044
            boolean r0 = r6.isRunning()
            if (r0 == 0) goto L_0x003b
            m2764a(r6)
        L_0x003b:
            android.animation.LayoutTransition r0 = p000a.p045n.C0389y.f1174a
            if (r6 == r0) goto L_0x0044
            int r0 = p000a.p045n.C0361j.transition_layout_save
            r5.setTag(r0, r6)
        L_0x0044:
            android.animation.LayoutTransition r6 = p000a.p045n.C0389y.f1174a
        L_0x0046:
            r5.setLayoutTransition(r6)
            goto L_0x0098
        L_0x004a:
            r5.setLayoutTransition(r3)
            boolean r6 = p000a.p045n.C0389y.f1176c
            java.lang.String r0 = "ViewGroupUtilsApi14"
            if (r6 != 0) goto L_0x006a
            java.lang.Class<android.view.ViewGroup> r6 = android.view.ViewGroup.class
            java.lang.String r4 = "mLayoutSuppressed"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r4)     // Catch: NoSuchFieldException -> 0x0063
            p000a.p045n.C0389y.f1175b = r6     // Catch: NoSuchFieldException -> 0x0063
            java.lang.reflect.Field r6 = p000a.p045n.C0389y.f1175b     // Catch: NoSuchFieldException -> 0x0063
            r6.setAccessible(r1)     // Catch: NoSuchFieldException -> 0x0063
            goto L_0x0068
        L_0x0063:
            java.lang.String r6 = "Failed to access mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r6)
        L_0x0068:
            p000a.p045n.C0389y.f1176c = r1
        L_0x006a:
            java.lang.reflect.Field r6 = p000a.p045n.C0389y.f1175b
            if (r6 == 0) goto L_0x0083
            boolean r6 = r6.getBoolean(r5)     // Catch: IllegalAccessException -> 0x007e
            if (r6 == 0) goto L_0x007c
            java.lang.reflect.Field r1 = p000a.p045n.C0389y.f1175b     // Catch: IllegalAccessException -> 0x007a
            r1.setBoolean(r5, r2)     // Catch: IllegalAccessException -> 0x007a
            goto L_0x007c
        L_0x007a:
            r2 = r6
            goto L_0x007e
        L_0x007c:
            r2 = r6
            goto L_0x0083
        L_0x007e:
            java.lang.String r6 = "Failed to get mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r6)
        L_0x0083:
            if (r2 == 0) goto L_0x0088
            r5.requestLayout()
        L_0x0088:
            int r6 = p000a.p045n.C0361j.transition_layout_save
            java.lang.Object r6 = r5.getTag(r6)
            android.animation.LayoutTransition r6 = (android.animation.LayoutTransition) r6
            if (r6 == 0) goto L_0x0098
            int r0 = p000a.p045n.C0361j.transition_layout_save
            r5.setTag(r0, r3)
            goto L_0x0046
        L_0x0098:
            return
    }
}
