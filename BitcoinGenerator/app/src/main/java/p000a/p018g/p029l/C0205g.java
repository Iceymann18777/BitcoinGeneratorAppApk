package p000a.p018g.p029l;

/* renamed from: a.g.l.g */
/* loaded from: classes.dex */
public final class C0205g {
    /* renamed from: a */
    public static android.view.MenuItem m3477a(android.view.MenuItem r1, p000a.p018g.p029l.AbstractC0197b r2) {
            boolean r0 = r1 instanceof p000a.p018g.p022f.p023a.AbstractMenuItemC0156b
            if (r0 == 0) goto L_0x000b
            a.g.f.a.b r1 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r1
            a.g.f.a.b r1 = r1.mo2369a(r2)
            return r1
        L_0x000b:
            java.lang.String r2 = "MenuItemCompat"
            java.lang.String r0 = "setActionProvider: item does not implement SupportMenuItem; ignoring"
            android.util.Log.w(r2, r0)
            return r1
    }

    /* renamed from: a */
    public static void m3478a(android.view.MenuItem r2, char r3, int r4) {
            boolean r0 = r2 instanceof p000a.p018g.p022f.p023a.AbstractMenuItemC0156b
            if (r0 == 0) goto L_0x000a
            a.g.f.a.b r2 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r2
            r2.setAlphabeticShortcut(r3, r4)
            goto L_0x0013
        L_0x000a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x0013
            r2.setAlphabeticShortcut(r3, r4)
        L_0x0013:
            return
    }

    /* renamed from: a */
    public static void m3476a(android.view.MenuItem r2, android.content.res.ColorStateList r3) {
            boolean r0 = r2 instanceof p000a.p018g.p022f.p023a.AbstractMenuItemC0156b
            if (r0 == 0) goto L_0x000a
            a.g.f.a.b r2 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r2
            r2.setIconTintList(r3)
            goto L_0x0013
        L_0x000a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x0013
            r2.setIconTintList(r3)
        L_0x0013:
            return
    }

    /* renamed from: a */
    public static void m3475a(android.view.MenuItem r2, android.graphics.PorterDuff.Mode r3) {
            boolean r0 = r2 instanceof p000a.p018g.p022f.p023a.AbstractMenuItemC0156b
            if (r0 == 0) goto L_0x000a
            a.g.f.a.b r2 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r2
            r2.setIconTintMode(r3)
            goto L_0x0013
        L_0x000a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x0013
            r2.setIconTintMode(r3)
        L_0x0013:
            return
    }

    /* renamed from: a */
    public static void m3474a(android.view.MenuItem r2, java.lang.CharSequence r3) {
            boolean r0 = r2 instanceof p000a.p018g.p022f.p023a.AbstractMenuItemC0156b
            if (r0 == 0) goto L_0x000a
            a.g.f.a.b r2 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r2
            r2.setContentDescription(r3)
            goto L_0x0013
        L_0x000a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x0013
            r2.setContentDescription(r3)
        L_0x0013:
            return
    }

    /* renamed from: b */
    public static void m3473b(android.view.MenuItem r2, char r3, int r4) {
            boolean r0 = r2 instanceof p000a.p018g.p022f.p023a.AbstractMenuItemC0156b
            if (r0 == 0) goto L_0x000a
            a.g.f.a.b r2 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r2
            r2.setNumericShortcut(r3, r4)
            goto L_0x0013
        L_0x000a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x0013
            r2.setNumericShortcut(r3, r4)
        L_0x0013:
            return
    }

    /* renamed from: b */
    public static void m3472b(android.view.MenuItem r2, java.lang.CharSequence r3) {
            boolean r0 = r2 instanceof p000a.p018g.p022f.p023a.AbstractMenuItemC0156b
            if (r0 == 0) goto L_0x000a
            a.g.f.a.b r2 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r2
            r2.setTooltipText(r3)
            goto L_0x0013
        L_0x000a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x0013
            r2.setTooltipText(r3)
        L_0x0013:
            return
    }
}
