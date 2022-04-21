package androidx.core.widget;

/* renamed from: androidx.core.widget.c */
/* loaded from: classes.dex */
public final class C0714c {

    /* renamed from: a */
    private static java.lang.reflect.Field f2709a;

    /* renamed from: b */
    private static boolean f2710b;

    /* renamed from: a */
    public static android.graphics.drawable.Drawable m1512a(android.widget.CompoundButton r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x000b
            android.graphics.drawable.Drawable r4 = r4.getButtonDrawable()
            return r4
        L_0x000b:
            boolean r0 = androidx.core.widget.C0714c.f2710b
            java.lang.String r1 = "CompoundButtonCompat"
            if (r0 != 0) goto L_0x002a
            r0 = 1
            java.lang.Class<android.widget.CompoundButton> r2 = android.widget.CompoundButton.class
            java.lang.String r3 = "mButtonDrawable"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: NoSuchFieldException -> 0x0022
            androidx.core.widget.C0714c.f2709a = r2     // Catch: NoSuchFieldException -> 0x0022
            java.lang.reflect.Field r2 = androidx.core.widget.C0714c.f2709a     // Catch: NoSuchFieldException -> 0x0022
            r2.setAccessible(r0)     // Catch: NoSuchFieldException -> 0x0022
            goto L_0x0028
        L_0x0022:
            r2 = move-exception
            java.lang.String r3 = "Failed to retrieve mButtonDrawable field"
            android.util.Log.i(r1, r3, r2)
        L_0x0028:
            androidx.core.widget.C0714c.f2710b = r0
        L_0x002a:
            java.lang.reflect.Field r0 = androidx.core.widget.C0714c.f2709a
            r2 = 0
            if (r0 == 0) goto L_0x003e
            java.lang.Object r4 = r0.get(r4)     // Catch: IllegalAccessException -> 0x0036
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4     // Catch: IllegalAccessException -> 0x0036
            return r4
        L_0x0036:
            r4 = move-exception
            java.lang.String r0 = "Failed to get button drawable via reflection"
            android.util.Log.i(r1, r0, r4)
            androidx.core.widget.C0714c.f2709a = r2
        L_0x003e:
            return r2
    }

    /* renamed from: a */
    public static void m1511a(android.widget.CompoundButton r2, android.content.res.ColorStateList r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000a
            r2.setButtonTintList(r3)
            goto L_0x0013
        L_0x000a:
            boolean r0 = r2 instanceof androidx.core.widget.AbstractC0722j
            if (r0 == 0) goto L_0x0013
            androidx.core.widget.j r2 = (androidx.core.widget.AbstractC0722j) r2
            r2.setSupportButtonTintList(r3)
        L_0x0013:
            return
    }

    /* renamed from: a */
    public static void m1510a(android.widget.CompoundButton r2, android.graphics.PorterDuff.Mode r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000a
            r2.setButtonTintMode(r3)
            goto L_0x0013
        L_0x000a:
            boolean r0 = r2 instanceof androidx.core.widget.AbstractC0722j
            if (r0 == 0) goto L_0x0013
            androidx.core.widget.j r2 = (androidx.core.widget.AbstractC0722j) r2
            r2.setSupportButtonTintMode(r3)
        L_0x0013:
            return
    }
}
