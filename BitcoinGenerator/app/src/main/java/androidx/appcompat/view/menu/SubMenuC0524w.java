package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.w */
/* loaded from: classes.dex */
class SubMenuC0524w extends androidx.appcompat.view.menu.MenuC0518s implements android.view.SubMenu {
    SubMenuC0524w(android.content.Context r1, p000a.p018g.p022f.p023a.AbstractSubMenuC0157c r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* renamed from: c */
    public p000a.p018g.p022f.p023a.AbstractSubMenuC0157c m2292c() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.c r0 = (p000a.p018g.p022f.p023a.AbstractSubMenuC0157c) r0
            return r0
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
            r1 = this;
            a.g.f.a.c r0 = r1.m2292c()
            r0.clearHeader()
            return
    }

    @Override // android.view.SubMenu
    public android.view.MenuItem getItem() {
            r1 = this;
            a.g.f.a.c r0 = r1.m2292c()
            android.view.MenuItem r0 = r0.getItem()
            android.view.MenuItem r0 = r1.m2442a(r0)
            return r0
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderIcon(int r2) {
            r1 = this;
            a.g.f.a.c r0 = r1.m2292c()
            r0.setHeaderIcon(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            a.g.f.a.c r0 = r1.m2292c()
            r0.setHeaderIcon(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderTitle(int r2) {
            r1 = this;
            a.g.f.a.c r0 = r1.m2292c()
            r0.setHeaderTitle(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderTitle(java.lang.CharSequence r2) {
            r1 = this;
            a.g.f.a.c r0 = r1.m2292c()
            r0.setHeaderTitle(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderView(android.view.View r2) {
            r1 = this;
            a.g.f.a.c r0 = r1.m2292c()
            r0.setHeaderView(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setIcon(int r2) {
            r1 = this;
            a.g.f.a.c r0 = r1.m2292c()
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            a.g.f.a.c r0 = r1.m2292c()
            r0.setIcon(r2)
            return r1
    }
}
