package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.v */
/* loaded from: classes.dex */
public class SubMenuC0523v extends androidx.appcompat.view.menu.C0496h implements android.view.SubMenu {

    /* renamed from: B */
    private androidx.appcompat.view.menu.C0496h f1809B;

    /* renamed from: C */
    private androidx.appcompat.view.menu.C0501k f1810C;

    public SubMenuC0523v(android.content.Context r1, androidx.appcompat.view.menu.C0496h r2, androidx.appcompat.view.menu.C0501k r3) {
            r0 = this;
            r0.<init>(r1)
            r0.f1809B = r2
            r0.f1810C = r3
            return
    }

    @Override // androidx.appcompat.view.menu.C0496h
    /* renamed from: a */
    public void mo2302a(androidx.appcompat.view.menu.C0496h.AbstractC0497a r2) {
            r1 = this;
            androidx.appcompat.view.menu.h r0 = r1.f1809B
            r0.mo2302a(r2)
            return
    }

    @Override // androidx.appcompat.view.menu.C0496h
    /* renamed from: a */
    boolean mo2301a(androidx.appcompat.view.menu.C0496h r2, android.view.MenuItem r3) {
            r1 = this;
            boolean r0 = super.mo2301a(r2, r3)
            if (r0 != 0) goto L_0x0011
            androidx.appcompat.view.menu.h r0 = r1.f1809B
            boolean r2 = r0.mo2301a(r2, r3)
            if (r2 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r2 = 0
            goto L_0x0012
        L_0x0011:
            r2 = 1
        L_0x0012:
            return r2
    }

    @Override // androidx.appcompat.view.menu.C0496h
    /* renamed from: a */
    public boolean mo2300a(androidx.appcompat.view.menu.C0501k r2) {
            r1 = this;
            androidx.appcompat.view.menu.h r0 = r1.f1809B
            boolean r2 = r0.mo2300a(r2)
            return r2
    }

    @Override // androidx.appcompat.view.menu.C0496h
    /* renamed from: b */
    public boolean mo2299b(androidx.appcompat.view.menu.C0501k r2) {
            r1 = this;
            androidx.appcompat.view.menu.h r0 = r1.f1809B
            boolean r2 = r0.mo2299b(r2)
            return r2
    }

    @Override // androidx.appcompat.view.menu.C0496h
    /* renamed from: d */
    public java.lang.String mo2298d() {
            r3 = this;
            androidx.appcompat.view.menu.k r0 = r3.f1810C
            if (r0 == 0) goto L_0x0009
            int r0 = r0.getItemId()
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            if (r0 != 0) goto L_0x000e
            r0 = 0
            return r0
        L_0x000e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = super.mo2298d()
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // android.view.SubMenu
    public android.view.MenuItem getItem() {
            r1 = this;
            androidx.appcompat.view.menu.k r0 = r1.f1810C
            return r0
    }

    @Override // androidx.appcompat.view.menu.C0496h
    /* renamed from: m */
    public androidx.appcompat.view.menu.C0496h mo2297m() {
            r1 = this;
            androidx.appcompat.view.menu.h r0 = r1.f1809B
            androidx.appcompat.view.menu.h r0 = r0.mo2297m()
            return r0
    }

    @Override // androidx.appcompat.view.menu.C0496h
    /* renamed from: o */
    public boolean mo2296o() {
            r1 = this;
            androidx.appcompat.view.menu.h r0 = r1.f1809B
            boolean r0 = r0.mo2296o()
            return r0
    }

    @Override // androidx.appcompat.view.menu.C0496h
    /* renamed from: p */
    public boolean mo2295p() {
            r1 = this;
            androidx.appcompat.view.menu.h r0 = r1.f1809B
            boolean r0 = r0.mo2295p()
            return r0
    }

    @Override // androidx.appcompat.view.menu.C0496h
    /* renamed from: q */
    public boolean mo2294q() {
            r1 = this;
            androidx.appcompat.view.menu.h r0 = r1.f1809B
            boolean r0 = r0.mo2294q()
            return r0
    }

    @Override // androidx.appcompat.view.menu.C0496h, android.view.Menu
    public void setGroupDividerEnabled(boolean r2) {
            r1 = this;
            androidx.appcompat.view.menu.h r0 = r1.f1809B
            r0.setGroupDividerEnabled(r2)
            return
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderIcon(int r1) {
            r0 = this;
            super.m2392d(r1)
            r1 = r0
            android.view.SubMenu r1 = (android.view.SubMenu) r1
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.m2414a(r1)
            r1 = r0
            android.view.SubMenu r1 = (android.view.SubMenu) r1
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderTitle(int r1) {
            r0 = this;
            super.m2387e(r1)
            r1 = r0
            android.view.SubMenu r1 = (android.view.SubMenu) r1
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderTitle(java.lang.CharSequence r1) {
            r0 = this;
            super.m2405a(r1)
            r1 = r0
            android.view.SubMenu r1 = (android.view.SubMenu) r1
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderView(android.view.View r1) {
            r0 = this;
            super.m2409a(r1)
            r1 = r0
            android.view.SubMenu r1 = (android.view.SubMenu) r1
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setIcon(int r2) {
            r1 = this;
            androidx.appcompat.view.menu.k r0 = r1.f1810C
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.view.menu.k r0 = r1.f1810C
            r0.setIcon(r2)
            return r1
    }

    @Override // androidx.appcompat.view.menu.C0496h, android.view.Menu
    public void setQwertyMode(boolean r2) {
            r1 = this;
            androidx.appcompat.view.menu.h r0 = r1.f1809B
            r0.setQwertyMode(r2)
            return
    }

    /* renamed from: t */
    public android.view.Menu m2293t() {
            r1 = this;
            androidx.appcompat.view.menu.h r0 = r1.f1809B
            return r0
    }
}
