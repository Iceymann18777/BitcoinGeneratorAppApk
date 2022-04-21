package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.l */
/* loaded from: classes.dex */
public class MenuItemC0503l extends androidx.appcompat.view.menu.AbstractC0485c<p000a.p018g.p022f.p023a.AbstractMenuItemC0156b> implements android.view.MenuItem {

    /* renamed from: e */
    private java.lang.reflect.Method f1765e;

    /* renamed from: androidx.appcompat.view.menu.l$a */
    /* loaded from: classes.dex */
    class C0504a extends p000a.p018g.p029l.AbstractC0197b {

        /* renamed from: b */
        final android.view.ActionProvider f1766b;

        /* renamed from: c */
        final /* synthetic */ androidx.appcompat.view.menu.MenuItemC0503l f1767c;

        public C0504a(androidx.appcompat.view.menu.MenuItemC0503l r1, android.content.Context r2, android.view.ActionProvider r3) {
                r0 = this;
                r0.f1767c = r1
                r0.<init>(r2)
                r0.f1766b = r3
                return
        }

        @Override // p000a.p018g.p029l.AbstractC0197b
        /* renamed from: a */
        public void mo2343a(android.view.SubMenu r3) {
                r2 = this;
                android.view.ActionProvider r0 = r2.f1766b
                androidx.appcompat.view.menu.l r1 = r2.f1767c
                android.view.SubMenu r3 = r1.m2441a(r3)
                r0.onPrepareSubMenu(r3)
                return
        }

        @Override // p000a.p018g.p029l.AbstractC0197b
        /* renamed from: a */
        public boolean mo2344a() {
                r1 = this;
                android.view.ActionProvider r0 = r1.f1766b
                boolean r0 = r0.hasSubMenu()
                return r0
        }

        @Override // p000a.p018g.p029l.AbstractC0197b
        /* renamed from: c */
        public android.view.View mo2342c() {
                r1 = this;
                android.view.ActionProvider r0 = r1.f1766b
                android.view.View r0 = r0.onCreateActionView()
                return r0
        }

        @Override // p000a.p018g.p029l.AbstractC0197b
        /* renamed from: d */
        public boolean mo2341d() {
                r1 = this;
                android.view.ActionProvider r0 = r1.f1766b
                boolean r0 = r0.onPerformDefaultAction()
                return r0
        }
    }

    /* renamed from: androidx.appcompat.view.menu.l$b */
    /* loaded from: classes.dex */
    static class C0505b extends android.widget.FrameLayout implements p000a.p001a.p006m.AbstractC0031c {

        /* renamed from: b */
        final android.view.CollapsibleActionView f1768b;

        C0505b(android.view.View r2) {
                r1 = this;
                android.content.Context r0 = r2.getContext()
                r1.<init>(r0)
                r0 = r2
                android.view.CollapsibleActionView r0 = (android.view.CollapsibleActionView) r0
                r1.f1768b = r0
                r1.addView(r2)
                return
        }

        /* renamed from: a */
        android.view.View m2340a() {
                r1 = this;
                android.view.CollapsibleActionView r0 = r1.f1768b
                android.view.View r0 = (android.view.View) r0
                return r0
        }

        @Override // p000a.p001a.p006m.AbstractC0031c
        /* renamed from: b */
        public void mo2232b() {
                r1 = this;
                android.view.CollapsibleActionView r0 = r1.f1768b
                r0.onActionViewExpanded()
                return
        }

        @Override // p000a.p001a.p006m.AbstractC0031c
        /* renamed from: c */
        public void mo2227c() {
                r1 = this;
                android.view.CollapsibleActionView r0 = r1.f1768b
                r0.onActionViewCollapsed()
                return
        }
    }

    /* renamed from: androidx.appcompat.view.menu.l$c */
    /* loaded from: classes.dex */
    private class MenuItem$OnActionExpandListenerC0506c extends androidx.appcompat.view.menu.C0486d<android.view.MenuItem.OnActionExpandListener> implements android.view.MenuItem.OnActionExpandListener {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.view.menu.MenuItemC0503l f1769b;

        MenuItem$OnActionExpandListenerC0506c(androidx.appcompat.view.menu.MenuItemC0503l r1, android.view.MenuItem.OnActionExpandListener r2) {
                r0 = this;
                r0.f1769b = r1
                r0.<init>(r2)
                return
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(android.view.MenuItem r3) {
                r2 = this;
                T r0 = r2.f1646a
                android.view.MenuItem$OnActionExpandListener r0 = (android.view.MenuItem.OnActionExpandListener) r0
                androidx.appcompat.view.menu.l r1 = r2.f1769b
                android.view.MenuItem r3 = r1.m2442a(r3)
                boolean r3 = r0.onMenuItemActionCollapse(r3)
                return r3
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(android.view.MenuItem r3) {
                r2 = this;
                T r0 = r2.f1646a
                android.view.MenuItem$OnActionExpandListener r0 = (android.view.MenuItem.OnActionExpandListener) r0
                androidx.appcompat.view.menu.l r1 = r2.f1769b
                android.view.MenuItem r3 = r1.m2442a(r3)
                boolean r3 = r0.onMenuItemActionExpand(r3)
                return r3
        }
    }

    /* renamed from: androidx.appcompat.view.menu.l$d */
    /* loaded from: classes.dex */
    private class MenuItem$OnMenuItemClickListenerC0507d extends androidx.appcompat.view.menu.C0486d<android.view.MenuItem.OnMenuItemClickListener> implements android.view.MenuItem.OnMenuItemClickListener {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.view.menu.MenuItemC0503l f1770b;

        MenuItem$OnMenuItemClickListenerC0507d(androidx.appcompat.view.menu.MenuItemC0503l r1, android.view.MenuItem.OnMenuItemClickListener r2) {
                r0 = this;
                r0.f1770b = r1
                r0.<init>(r2)
                return
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(android.view.MenuItem r3) {
                r2 = this;
                T r0 = r2.f1646a
                android.view.MenuItem$OnMenuItemClickListener r0 = (android.view.MenuItem.OnMenuItemClickListener) r0
                androidx.appcompat.view.menu.l r1 = r2.f1770b
                android.view.MenuItem r3 = r1.m2442a(r3)
                boolean r3 = r0.onMenuItemClick(r3)
                return r3
        }
    }

    MenuItemC0503l(android.content.Context r1, p000a.p018g.p022f.p023a.AbstractMenuItemC0156b r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* renamed from: a */
    androidx.appcompat.view.menu.MenuItemC0503l.C0504a mo2339a(android.view.ActionProvider r3) {
            r2 = this;
            androidx.appcompat.view.menu.l$a r0 = new androidx.appcompat.view.menu.l$a
            android.content.Context r1 = r2.f1643b
            r0.<init>(r2, r1, r3)
            return r0
    }

    /* renamed from: a */
    public void m2345a(boolean r7) {
            r6 = this;
            java.lang.reflect.Method r0 = r6.f1765e     // Catch: Exception -> 0x002c
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001c
            T r0 = r6.f1646a     // Catch: Exception -> 0x002c
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0     // Catch: Exception -> 0x002c
            java.lang.Class r0 = r0.getClass()     // Catch: Exception -> 0x002c
            java.lang.String r3 = "setExclusiveCheckable"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: Exception -> 0x002c
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: Exception -> 0x002c
            r4[r1] = r5     // Catch: Exception -> 0x002c
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch: Exception -> 0x002c
            r6.f1765e = r0     // Catch: Exception -> 0x002c
        L_0x001c:
            java.lang.reflect.Method r0 = r6.f1765e     // Catch: Exception -> 0x002c
            T r3 = r6.f1646a     // Catch: Exception -> 0x002c
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: Exception -> 0x002c
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: Exception -> 0x002c
            r2[r1] = r7     // Catch: Exception -> 0x002c
            r0.invoke(r3, r2)     // Catch: Exception -> 0x002c
            goto L_0x0034
        L_0x002c:
            r7 = move-exception
            java.lang.String r0 = "MenuItemWrapper"
            java.lang.String r1 = "Error while calling setExclusiveCheckable"
            android.util.Log.w(r0, r1, r7)
        L_0x0034:
            return
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            boolean r0 = r0.collapseActionView()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            boolean r0 = r0.expandActionView()
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
            r2 = this;
            T r0 = r2.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            a.g.l.b r0 = r0.mo2370a()
            boolean r1 = r0 instanceof androidx.appcompat.view.menu.MenuItemC0503l.C0504a
            if (r1 == 0) goto L_0x0011
            androidx.appcompat.view.menu.l$a r0 = (androidx.appcompat.view.menu.MenuItemC0503l.C0504a) r0
            android.view.ActionProvider r0 = r0.f1766b
            return r0
        L_0x0011:
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.View getActionView() {
            r2 = this;
            T r0 = r2.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            android.view.View r0 = r0.getActionView()
            boolean r1 = r0 instanceof androidx.appcompat.view.menu.MenuItemC0503l.C0505b
            if (r1 == 0) goto L_0x0012
            androidx.appcompat.view.menu.l$b r0 = (androidx.appcompat.view.menu.MenuItemC0503l.C0505b) r0
            android.view.View r0 = r0.m2340a()
        L_0x0012:
            return r0
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            int r0 = r0.getAlphabeticModifiers()
            return r0
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            char r0 = r0.getAlphabeticShortcut()
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getContentDescription() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            int r0 = r0.getGroupId()
            return r0
    }

    @Override // android.view.MenuItem
    public android.graphics.drawable.Drawable getIcon() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            android.graphics.drawable.Drawable r0 = r0.getIcon()
            return r0
    }

    @Override // android.view.MenuItem
    public android.content.res.ColorStateList getIconTintList() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            android.content.res.ColorStateList r0 = r0.getIconTintList()
            return r0
    }

    @Override // android.view.MenuItem
    public android.graphics.PorterDuff.Mode getIconTintMode() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            android.graphics.PorterDuff$Mode r0 = r0.getIconTintMode()
            return r0
    }

    @Override // android.view.MenuItem
    public android.content.Intent getIntent() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            android.content.Intent r0 = r0.getIntent()
            return r0
    }

    @Override // android.view.MenuItem
    public int getItemId() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            int r0 = r0.getItemId()
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            android.view.ContextMenu$ContextMenuInfo r0 = r0.getMenuInfo()
            return r0
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            int r0 = r0.getNumericModifiers()
            return r0
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            char r0 = r0.getNumericShortcut()
            return r0
    }

    @Override // android.view.MenuItem
    public int getOrder() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            int r0 = r0.getOrder()
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.SubMenu getSubMenu() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            android.view.SubMenu r0 = r0.getSubMenu()
            android.view.SubMenu r0 = r1.m2441a(r0)
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitle() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitleCondensed() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            java.lang.CharSequence r0 = r0.getTitleCondensed()
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTooltipText() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            java.lang.CharSequence r0 = r0.getTooltipText()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            boolean r0 = r0.hasSubMenu()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            boolean r0 = r0.isActionViewExpanded()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            boolean r0 = r0.isCheckable()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            boolean r0 = r0.isChecked()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            boolean r0 = r0.isEnabled()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            boolean r0 = r0.isVisible()
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionProvider(android.view.ActionProvider r2) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            if (r2 == 0) goto L_0x000b
            androidx.appcompat.view.menu.l$a r2 = r1.mo2339a(r2)
            goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            r0.mo2369a(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionView(int r3) {
            r2 = this;
            T r0 = r2.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            r0.setActionView(r3)
            T r3 = r2.f1646a
            a.g.f.a.b r3 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r3
            android.view.View r3 = r3.getActionView()
            boolean r0 = r3 instanceof android.view.CollapsibleActionView
            if (r0 == 0) goto L_0x001f
            T r0 = r2.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            androidx.appcompat.view.menu.l$b r1 = new androidx.appcompat.view.menu.l$b
            r1.<init>(r3)
            r0.setActionView(r1)
        L_0x001f:
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionView(android.view.View r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.view.CollapsibleActionView
            if (r0 == 0) goto L_0x000a
            androidx.appcompat.view.menu.l$b r0 = new androidx.appcompat.view.menu.l$b
            r0.<init>(r2)
            r2 = r0
        L_0x000a:
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            r0.setActionView(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char r2) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            r0.setAlphabeticShortcut(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char r2, int r3) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            r0.setAlphabeticShortcut(r2, r3)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setCheckable(boolean r2) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            r0.setCheckable(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setChecked(boolean r2) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            r0.setChecked(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            r0.setContentDescription(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setEnabled(boolean r2) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            r0.setEnabled(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(int r2) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            r0.setIconTintList(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            r0.setIconTintMode(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIntent(android.content.Intent r2) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            r0.setIntent(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char r2) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            r0.setNumericShortcut(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char r2, int r3) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            r0.setNumericShortcut(r2, r3)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener r3) {
            r2 = this;
            T r0 = r2.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            if (r3 == 0) goto L_0x000c
            androidx.appcompat.view.menu.l$c r1 = new androidx.appcompat.view.menu.l$c
            r1.<init>(r2, r3)
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            r0.setOnActionExpandListener(r1)
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener r3) {
            r2 = this;
            T r0 = r2.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            if (r3 == 0) goto L_0x000c
            androidx.appcompat.view.menu.l$d r1 = new androidx.appcompat.view.menu.l$d
            r1.<init>(r2, r3)
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            r0.setOnMenuItemClickListener(r1)
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char r2, char r3) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            r0.setShortcut(r2, r3)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char r2, char r3, int r4, int r5) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            r0.setShortcut(r2, r3, r4, r5)
            return r1
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int r2) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            r0.setShowAsAction(r2)
            return
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShowAsActionFlags(int r2) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            r0.setShowAsActionFlags(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(int r2) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            r0.setTitle(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(java.lang.CharSequence r2) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            r0.setTitle(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence r2) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            r0.setTitleCondensed(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTooltipText(java.lang.CharSequence r2) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            r0.setTooltipText(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setVisible(boolean r2) {
            r1 = this;
            T r0 = r1.f1646a
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            android.view.MenuItem r2 = r0.setVisible(r2)
            return r2
    }
}
