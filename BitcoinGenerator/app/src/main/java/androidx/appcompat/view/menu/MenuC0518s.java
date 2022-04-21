package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.s */
/* loaded from: classes.dex */
class MenuC0518s extends androidx.appcompat.view.menu.AbstractC0485c<p000a.p018g.p022f.p023a.AbstractMenuC0155a> implements android.view.Menu {
    MenuC0518s(android.content.Context r1, p000a.p018g.p022f.p023a.AbstractMenuC0155a r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r2) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.a r0 = (p000a.p018g.p022f.p023a.AbstractMenuC0155a) r0
            android.view.MenuItem r2 = r0.add(r2)
            android.view.MenuItem r2 = r1.m2442a(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r2, int r3, int r4, int r5) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.a r0 = (p000a.p018g.p022f.p023a.AbstractMenuC0155a) r0
            android.view.MenuItem r2 = r0.add(r2, r3, r4, r5)
            android.view.MenuItem r2 = r1.m2442a(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r2, int r3, int r4, java.lang.CharSequence r5) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.a r0 = (p000a.p018g.p022f.p023a.AbstractMenuC0155a) r0
            android.view.MenuItem r2 = r0.add(r2, r3, r4, r5)
            android.view.MenuItem r2 = r1.m2442a(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(java.lang.CharSequence r2) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.a r0 = (p000a.p018g.p022f.p023a.AbstractMenuC0155a) r0
            android.view.MenuItem r2 = r0.add(r2)
            android.view.MenuItem r2 = r1.m2442a(r2)
            return r2
    }

    @Override // android.view.Menu
    public int addIntentOptions(int r13, int r14, int r15, android.content.ComponentName r16, android.content.Intent[] r17, android.content.Intent r18, int r19, android.view.MenuItem[] r20) {
            r12 = this;
            r0 = r12
            r1 = r20
            if (r1 == 0) goto L_0x0009
            int r2 = r1.length
            android.view.MenuItem[] r2 = new android.view.MenuItem[r2]
            goto L_0x000a
        L_0x0009:
            r2 = 0
        L_0x000a:
            T r3 = r0.f1646a
            a.g.f.a.a r3 = (p000a.p018g.p022f.p023a.AbstractMenuC0155a) r3
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r2
            int r3 = r3.addIntentOptions(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r2 == 0) goto L_0x002f
            r4 = 0
            int r5 = r2.length
        L_0x0022:
            if (r4 >= r5) goto L_0x002f
            r6 = r2[r4]
            android.view.MenuItem r6 = r12.m2442a(r6)
            r1[r4] = r6
            int r4 = r4 + 1
            goto L_0x0022
        L_0x002f:
            return r3
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r2) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.a r0 = (p000a.p018g.p022f.p023a.AbstractMenuC0155a) r0
            android.view.SubMenu r2 = r0.addSubMenu(r2)
            android.view.SubMenu r2 = r1.m2441a(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r2, int r3, int r4, int r5) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.a r0 = (p000a.p018g.p022f.p023a.AbstractMenuC0155a) r0
            android.view.SubMenu r2 = r0.addSubMenu(r2, r3, r4, r5)
            android.view.SubMenu r2 = r1.m2441a(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r2, int r3, int r4, java.lang.CharSequence r5) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.a r0 = (p000a.p018g.p022f.p023a.AbstractMenuC0155a) r0
            android.view.SubMenu r2 = r0.addSubMenu(r2, r3, r4, r5)
            android.view.SubMenu r2 = r1.m2441a(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(java.lang.CharSequence r2) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.a r0 = (p000a.p018g.p022f.p023a.AbstractMenuC0155a) r0
            android.view.SubMenu r2 = r0.addSubMenu(r2)
            android.view.SubMenu r2 = r1.m2441a(r2)
            return r2
    }

    @Override // android.view.Menu
    public void clear() {
            r1 = this;
            r1.m2440b()
            T r0 = r1.f1646a
            a.g.f.a.a r0 = (p000a.p018g.p022f.p023a.AbstractMenuC0155a) r0
            r0.clear()
            return
    }

    @Override // android.view.Menu
    public void close() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.a r0 = (p000a.p018g.p022f.p023a.AbstractMenuC0155a) r0
            r0.close()
            return
    }

    @Override // android.view.Menu
    public android.view.MenuItem findItem(int r2) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.a r0 = (p000a.p018g.p022f.p023a.AbstractMenuC0155a) r0
            android.view.MenuItem r2 = r0.findItem(r2)
            android.view.MenuItem r2 = r1.m2442a(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.MenuItem getItem(int r2) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.a r0 = (p000a.p018g.p022f.p023a.AbstractMenuC0155a) r0
            android.view.MenuItem r2 = r0.getItem(r2)
            android.view.MenuItem r2 = r1.m2442a(r2)
            return r2
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.a r0 = (p000a.p018g.p022f.p023a.AbstractMenuC0155a) r0
            boolean r0 = r0.hasVisibleItems()
            return r0
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int r2, android.view.KeyEvent r3) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.a r0 = (p000a.p018g.p022f.p023a.AbstractMenuC0155a) r0
            boolean r2 = r0.isShortcutKey(r2, r3)
            return r2
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int r2, int r3) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.a r0 = (p000a.p018g.p022f.p023a.AbstractMenuC0155a) r0
            boolean r2 = r0.performIdentifierAction(r2, r3)
            return r2
    }

    @Override // android.view.Menu
    public boolean performShortcut(int r2, android.view.KeyEvent r3, int r4) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.a r0 = (p000a.p018g.p022f.p023a.AbstractMenuC0155a) r0
            boolean r2 = r0.performShortcut(r2, r3, r4)
            return r2
    }

    @Override // android.view.Menu
    public void removeGroup(int r2) {
            r1 = this;
            r1.m2443a(r2)
            T r0 = r1.f1646a
            a.g.f.a.a r0 = (p000a.p018g.p022f.p023a.AbstractMenuC0155a) r0
            r0.removeGroup(r2)
            return
    }

    @Override // android.view.Menu
    public void removeItem(int r2) {
            r1 = this;
            r1.m2439b(r2)
            T r0 = r1.f1646a
            a.g.f.a.a r0 = (p000a.p018g.p022f.p023a.AbstractMenuC0155a) r0
            r0.removeItem(r2)
            return
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int r2, boolean r3, boolean r4) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.a r0 = (p000a.p018g.p022f.p023a.AbstractMenuC0155a) r0
            r0.setGroupCheckable(r2, r3, r4)
            return
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int r2, boolean r3) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.a r0 = (p000a.p018g.p022f.p023a.AbstractMenuC0155a) r0
            r0.setGroupEnabled(r2, r3)
            return
    }

    @Override // android.view.Menu
    public void setGroupVisible(int r2, boolean r3) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.a r0 = (p000a.p018g.p022f.p023a.AbstractMenuC0155a) r0
            r0.setGroupVisible(r2, r3)
            return
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean r2) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.a r0 = (p000a.p018g.p022f.p023a.AbstractMenuC0155a) r0
            r0.setQwertyMode(r2)
            return
    }

    @Override // android.view.Menu
    public int size() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.a r0 = (p000a.p018g.p022f.p023a.AbstractMenuC0155a) r0
            int r0 = r0.size()
            return r0
    }
}
