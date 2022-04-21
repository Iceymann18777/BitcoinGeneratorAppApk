package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.r */
/* loaded from: classes.dex */
public final class C0517r {
    /* renamed from: a */
    public static android.view.Menu m2315a(android.content.Context r1, p000a.p018g.p022f.p023a.AbstractMenuC0155a r2) {
            androidx.appcompat.view.menu.s r0 = new androidx.appcompat.view.menu.s
            r0.<init>(r1, r2)
            return r0
    }

    /* renamed from: a */
    public static android.view.MenuItem m2314a(android.content.Context r2, p000a.p018g.p022f.p023a.AbstractMenuItemC0156b r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x000c
            androidx.appcompat.view.menu.m r0 = new androidx.appcompat.view.menu.m
            r0.<init>(r2, r3)
            return r0
        L_0x000c:
            androidx.appcompat.view.menu.l r0 = new androidx.appcompat.view.menu.l
            r0.<init>(r2, r3)
            return r0
    }

    /* renamed from: a */
    public static android.view.SubMenu m2313a(android.content.Context r1, p000a.p018g.p022f.p023a.AbstractSubMenuC0157c r2) {
            androidx.appcompat.view.menu.w r0 = new androidx.appcompat.view.menu.w
            r0.<init>(r1, r2)
            return r0
    }
}
