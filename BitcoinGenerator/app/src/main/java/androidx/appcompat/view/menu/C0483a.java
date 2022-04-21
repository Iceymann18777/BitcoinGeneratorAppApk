package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.a */
/* loaded from: classes.dex */
public class C0483a implements p000a.p018g.p022f.p023a.AbstractMenuItemC0156b {

    /* renamed from: a */
    private final int f1615a;

    /* renamed from: b */
    private final int f1616b;

    /* renamed from: c */
    private final int f1617c;

    /* renamed from: d */
    private java.lang.CharSequence f1618d;

    /* renamed from: e */
    private java.lang.CharSequence f1619e;

    /* renamed from: f */
    private android.content.Intent f1620f;

    /* renamed from: g */
    private char f1621g;

    /* renamed from: h */
    private int f1622h;

    /* renamed from: i */
    private char f1623i;

    /* renamed from: j */
    private int f1624j;

    /* renamed from: k */
    private android.graphics.drawable.Drawable f1625k;

    /* renamed from: l */
    private android.content.Context f1626l;

    /* renamed from: m */
    private java.lang.CharSequence f1627m;

    /* renamed from: n */
    private java.lang.CharSequence f1628n;

    /* renamed from: o */
    private android.content.res.ColorStateList f1629o;

    /* renamed from: p */
    private android.graphics.PorterDuff.Mode f1630p;

    /* renamed from: q */
    private boolean f1631q;

    /* renamed from: r */
    private boolean f1632r;

    /* renamed from: s */
    private int f1633s;

    public C0483a(android.content.Context r1, int r2, int r3, int r4, int r5, java.lang.CharSequence r6) {
            r0 = this;
            r0.<init>()
            r4 = 4096(0x1000, float:5.74E-42)
            r0.f1622h = r4
            r0.f1624j = r4
            r4 = 0
            r0.f1629o = r4
            r0.f1630p = r4
            r4 = 0
            r0.f1631q = r4
            r0.f1632r = r4
            r4 = 16
            r0.f1633s = r4
            r0.f1626l = r1
            r0.f1615a = r3
            r0.f1616b = r2
            r0.f1617c = r5
            r0.f1618d = r6
            return
    }

    /* renamed from: b */
    private void m2448b() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f1625k
            if (r0 == 0) goto L_0x0032
            boolean r0 = r2.f1631q
            if (r0 != 0) goto L_0x000c
            boolean r0 = r2.f1632r
            if (r0 == 0) goto L_0x0032
        L_0x000c:
            android.graphics.drawable.Drawable r0 = r2.f1625k
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.C0698a.m1591h(r0)
            r2.f1625k = r0
            android.graphics.drawable.Drawable r0 = r2.f1625k
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r2.f1625k = r0
            boolean r0 = r2.f1631q
            if (r0 == 0) goto L_0x0027
            android.graphics.drawable.Drawable r0 = r2.f1625k
            android.content.res.ColorStateList r1 = r2.f1629o
            androidx.core.graphics.drawable.C0698a.m1603a(r0, r1)
        L_0x0027:
            boolean r0 = r2.f1632r
            if (r0 == 0) goto L_0x0032
            android.graphics.drawable.Drawable r0 = r2.f1625k
            android.graphics.PorterDuff$Mode r1 = r2.f1630p
            androidx.core.graphics.drawable.C0698a.m1600a(r0, r1)
        L_0x0032:
            return
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b
    /* renamed from: a */
    public p000a.p018g.p022f.p023a.AbstractMenuItemC0156b mo2369a(p000a.p018g.p029l.AbstractC0197b r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b
    /* renamed from: a */
    public p000a.p018g.p029l.AbstractC0197b mo2370a() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public boolean collapseActionView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public boolean expandActionView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public android.view.View getActionView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public int getAlphabeticModifiers() {
            r1 = this;
            int r0 = r1.f1624j
            return r0
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
            r1 = this;
            char r0 = r1.f1623i
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public java.lang.CharSequence getContentDescription() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f1627m
            return r0
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
            r1 = this;
            int r0 = r1.f1616b
            return r0
    }

    @Override // android.view.MenuItem
    public android.graphics.drawable.Drawable getIcon() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1625k
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public android.content.res.ColorStateList getIconTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f1629o
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public android.graphics.PorterDuff.Mode getIconTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.f1630p
            return r0
    }

    @Override // android.view.MenuItem
    public android.content.Intent getIntent() {
            r1 = this;
            android.content.Intent r0 = r1.f1620f
            return r0
    }

    @Override // android.view.MenuItem
    public int getItemId() {
            r1 = this;
            int r0 = r1.f1615a
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public int getNumericModifiers() {
            r1 = this;
            int r0 = r1.f1622h
            return r0
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
            r1 = this;
            char r0 = r1.f1621g
            return r0
    }

    @Override // android.view.MenuItem
    public int getOrder() {
            r1 = this;
            int r0 = r1.f1617c
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.SubMenu getSubMenu() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f1618d
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitleCondensed() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f1619e
            if (r0 == 0) goto L_0x0005
            goto L_0x0007
        L_0x0005:
            java.lang.CharSequence r0 = r1.f1618d
        L_0x0007:
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public java.lang.CharSequence getTooltipText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f1628n
            return r0
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public boolean isActionViewExpanded() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
            r2 = this;
            int r0 = r2.f1633s
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0007
            goto L_0x0008
        L_0x0007:
            r1 = 0
        L_0x0008:
            return r1
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
            r1 = this;
            int r0 = r1.f1633s
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
            r1 = this;
            int r0 = r1.f1633s
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
            r1 = this;
            int r0 = r1.f1633s
            r0 = r0 & 8
            if (r0 != 0) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionProvider(android.view.ActionProvider r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public p000a.p018g.p022f.p023a.AbstractMenuItemC0156b setActionView(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public p000a.p018g.p022f.p023a.AbstractMenuItemC0156b setActionView(android.view.View r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public /* bridge */ /* synthetic */ android.view.MenuItem setActionView(int r1) {
            r0 = this;
            r0.setActionView(r1)
            r1 = 0
            throw r1
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public /* bridge */ /* synthetic */ android.view.MenuItem setActionView(android.view.View r1) {
            r0 = this;
            r0.setActionView(r1)
            r1 = 0
            throw r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char r1) {
            r0 = this;
            char r1 = java.lang.Character.toLowerCase(r1)
            r0.f1623i = r1
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char r1, int r2) {
            r0 = this;
            char r1 = java.lang.Character.toLowerCase(r1)
            r0.f1623i = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r2)
            r0.f1624j = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setCheckable(boolean r2) {
            r1 = this;
            int r0 = r1.f1633s
            r0 = r0 & (-2)
            r2 = r2 | r0
            r1.f1633s = r2
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setChecked(boolean r2) {
            r1 = this;
            int r0 = r1.f1633s
            r0 = r0 & (-3)
            if (r2 == 0) goto L_0x0008
            r2 = 2
            goto L_0x0009
        L_0x0008:
            r2 = 0
        L_0x0009:
            r2 = r2 | r0
            r1.f1633s = r2
            return r1
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public p000a.p018g.p022f.p023a.AbstractMenuItemC0156b setContentDescription(java.lang.CharSequence r1) {
            r0 = this;
            r0.f1627m = r1
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public /* bridge */ /* synthetic */ android.view.MenuItem setContentDescription(java.lang.CharSequence r1) {
            r0 = this;
            r0.setContentDescription(r1)
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setEnabled(boolean r2) {
            r1 = this;
            int r0 = r1.f1633s
            r0 = r0 & (-17)
            if (r2 == 0) goto L_0x0009
            r2 = 16
            goto L_0x000a
        L_0x0009:
            r2 = 0
        L_0x000a:
            r2 = r2 | r0
            r1.f1633s = r2
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(int r2) {
            r1 = this;
            android.content.Context r0 = r1.f1626l
            android.graphics.drawable.Drawable r2 = p000a.p018g.p019d.C0124a.m3732b(r0, r2)
            r1.f1625k = r2
            r1.m2448b()
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.f1625k = r1
            r0.m2448b()
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public android.view.MenuItem setIconTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.f1629o = r1
            r1 = 1
            r0.f1631q = r1
            r0.m2448b()
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.f1630p = r1
            r1 = 1
            r0.f1632r = r1
            r0.m2448b()
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIntent(android.content.Intent r1) {
            r0 = this;
            r0.f1620f = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char r1) {
            r0 = this;
            r0.f1621g = r1
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char r1, int r2) {
            r0 = this;
            r0.f1621g = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r2)
            r0.f1622h = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener r1) {
            r0 = this;
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char r1, char r2) {
            r0 = this;
            r0.f1621g = r1
            char r1 = java.lang.Character.toLowerCase(r2)
            r0.f1623i = r1
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public android.view.MenuItem setShortcut(char r1, char r2, int r3, int r4) {
            r0 = this;
            r0.f1621g = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r3)
            r0.f1622h = r1
            char r1 = java.lang.Character.toLowerCase(r2)
            r0.f1623i = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r4)
            r0.f1624j = r1
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public void setShowAsAction(int r1) {
            r0 = this;
            return
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public p000a.p018g.p022f.p023a.AbstractMenuItemC0156b setShowAsActionFlags(int r1) {
            r0 = this;
            r0.setShowAsAction(r1)
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public /* bridge */ /* synthetic */ android.view.MenuItem setShowAsActionFlags(int r1) {
            r0 = this;
            r0.setShowAsActionFlags(r1)
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(int r2) {
            r1 = this;
            android.content.Context r0 = r1.f1626l
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r2 = r0.getString(r2)
            r1.f1618d = r2
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.f1618d = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence r1) {
            r0 = this;
            r0.f1619e = r1
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public p000a.p018g.p022f.p023a.AbstractMenuItemC0156b setTooltipText(java.lang.CharSequence r1) {
            r0 = this;
            r0.f1628n = r1
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public /* bridge */ /* synthetic */ android.view.MenuItem setTooltipText(java.lang.CharSequence r1) {
            r0 = this;
            r0.setTooltipText(r1)
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setVisible(boolean r3) {
            r2 = this;
            int r0 = r2.f1633s
            r1 = 8
            r0 = r0 & r1
            if (r3 == 0) goto L_0x0008
            r1 = 0
        L_0x0008:
            r3 = r0 | r1
            r2.f1633s = r3
            return r2
    }
}
