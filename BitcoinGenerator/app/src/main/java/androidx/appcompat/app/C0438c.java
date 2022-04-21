package androidx.appcompat.app;

/* renamed from: androidx.appcompat.app.c */
/* loaded from: classes.dex */
class C0438c {

    /* renamed from: a */
    private static final int[] f1409a = null;

    /* renamed from: androidx.appcompat.app.c$a */
    /* loaded from: classes.dex */
    static class C0439a {

        /* renamed from: a */
        public java.lang.reflect.Method f1410a;

        /* renamed from: b */
        public java.lang.reflect.Method f1411b;

        /* renamed from: c */
        public android.widget.ImageView f1412c;

        C0439a(android.app.Activity r6) {
                r5 = this;
                r5.<init>()
                r0 = 0
                r1 = 1
                java.lang.Class<android.app.ActionBar> r2 = android.app.ActionBar.class
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: NoSuchMethodException -> 0x0026
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                r3[r0] = r4     // Catch: NoSuchMethodException -> 0x0026
                java.lang.String r4 = "setHomeAsUpIndicator"
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r3)     // Catch: NoSuchMethodException -> 0x0026
                r5.f1410a = r2     // Catch: NoSuchMethodException -> 0x0026
                java.lang.Class<android.app.ActionBar> r2 = android.app.ActionBar.class
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: NoSuchMethodException -> 0x0026
                java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: NoSuchMethodException -> 0x0026
                r3[r0] = r4     // Catch: NoSuchMethodException -> 0x0026
                java.lang.String r4 = "setHomeActionContentDescription"
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r3)     // Catch: NoSuchMethodException -> 0x0026
                r5.f1411b = r2     // Catch: NoSuchMethodException -> 0x0026
                return
            L_0x0026:
                r2 = 16908332(0x102002c, float:2.3877352E-38)
                android.view.View r6 = r6.findViewById(r2)
                if (r6 != 0) goto L_0x0031
                return
            L_0x0031:
                android.view.ViewParent r6 = r6.getParent()
                android.view.ViewGroup r6 = (android.view.ViewGroup) r6
                int r3 = r6.getChildCount()
                r4 = 2
                if (r3 == r4) goto L_0x003f
                return
            L_0x003f:
                android.view.View r0 = r6.getChildAt(r0)
                android.view.View r6 = r6.getChildAt(r1)
                int r1 = r0.getId()
                if (r1 != r2) goto L_0x004e
                goto L_0x004f
            L_0x004e:
                r6 = r0
            L_0x004f:
                boolean r0 = r6 instanceof android.widget.ImageView
                if (r0 == 0) goto L_0x0058
                android.widget.ImageView r6 = (android.widget.ImageView) r6
                r5.f1412c = r6
            L_0x0058:
                return
        }
    }

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16843531(0x101030b, float:2.369574E-38)
            r0[r1] = r2
            androidx.appcompat.app.C0438c.f1409a = r0
            return
    }

    /* renamed from: a */
    public static android.graphics.drawable.Drawable m2648a(android.app.Activity r1) {
            int[] r0 = androidx.appcompat.app.C0438c.f1409a
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r0)
            r0 = 0
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r1.recycle()
            return r0
    }

    /* renamed from: a */
    public static androidx.appcompat.app.C0438c.C0439a m2647a(androidx.appcompat.app.C0438c.C0439a r3, android.app.Activity r4, int r5) {
            if (r3 != 0) goto L_0x0007
            androidx.appcompat.app.c$a r3 = new androidx.appcompat.app.c$a
            r3.<init>(r4)
        L_0x0007:
            java.lang.reflect.Method r0 = r3.f1410a
            if (r0 == 0) goto L_0x0034
            android.app.ActionBar r4 = r4.getActionBar()     // Catch: Exception -> 0x002c
            java.lang.reflect.Method r0 = r3.f1411b     // Catch: Exception -> 0x002c
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: Exception -> 0x002c
            r2 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: Exception -> 0x002c
            r1[r2] = r5     // Catch: Exception -> 0x002c
            r0.invoke(r4, r1)     // Catch: Exception -> 0x002c
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch: Exception -> 0x002c
            r0 = 19
            if (r5 > r0) goto L_0x0034
            java.lang.CharSequence r5 = r4.getSubtitle()     // Catch: Exception -> 0x002c
            r4.setSubtitle(r5)     // Catch: Exception -> 0x002c
            goto L_0x0034
        L_0x002c:
            r4 = move-exception
            java.lang.String r5 = "ActionBarDrawerToggleHC"
            java.lang.String r0 = "Couldn't set content description via JB-MR2 API"
            android.util.Log.w(r5, r0, r4)
        L_0x0034:
            return r3
    }

    /* renamed from: a */
    public static androidx.appcompat.app.C0438c.C0439a m2646a(androidx.appcompat.app.C0438c.C0439a r5, android.app.Activity r6, android.graphics.drawable.Drawable r7, int r8) {
            androidx.appcompat.app.c$a r5 = new androidx.appcompat.app.c$a
            r5.<init>(r6)
            java.lang.reflect.Method r0 = r5.f1410a
            java.lang.String r1 = "ActionBarDrawerToggleHC"
            if (r0 == 0) goto L_0x002f
            android.app.ActionBar r6 = r6.getActionBar()     // Catch: Exception -> 0x0028
            java.lang.reflect.Method r0 = r5.f1410a     // Catch: Exception -> 0x0028
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: Exception -> 0x0028
            r4 = 0
            r3[r4] = r7     // Catch: Exception -> 0x0028
            r0.invoke(r6, r3)     // Catch: Exception -> 0x0028
            java.lang.reflect.Method r7 = r5.f1411b     // Catch: Exception -> 0x0028
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: Exception -> 0x0028
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: Exception -> 0x0028
            r0[r4] = r8     // Catch: Exception -> 0x0028
            r7.invoke(r6, r0)     // Catch: Exception -> 0x0028
            goto L_0x003c
        L_0x0028:
            r6 = move-exception
            java.lang.String r7 = "Couldn't set home-as-up indicator via JB-MR2 API"
            android.util.Log.w(r1, r7, r6)
            goto L_0x003c
        L_0x002f:
            android.widget.ImageView r6 = r5.f1412c
            if (r6 == 0) goto L_0x0037
            r6.setImageDrawable(r7)
            goto L_0x003c
        L_0x0037:
            java.lang.String r6 = "Couldn't set home-as-up indicator"
            android.util.Log.w(r1, r6)
        L_0x003c:
            return r5
    }
}
