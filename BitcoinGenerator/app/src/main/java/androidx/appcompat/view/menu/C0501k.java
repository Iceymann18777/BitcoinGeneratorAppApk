package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.k */
/* loaded from: classes.dex */
public final class C0501k implements p000a.p018g.p022f.p023a.AbstractMenuItemC0156b {

    /* renamed from: A */
    private android.view.View f1733A;

    /* renamed from: B */
    private p000a.p018g.p029l.AbstractC0197b f1734B;

    /* renamed from: C */
    private android.view.MenuItem.OnActionExpandListener f1735C;

    /* renamed from: D */
    private boolean f1736D;

    /* renamed from: E */
    private android.view.ContextMenu.ContextMenuInfo f1737E;

    /* renamed from: a */
    private final int f1738a;

    /* renamed from: b */
    private final int f1739b;

    /* renamed from: c */
    private final int f1740c;

    /* renamed from: d */
    private final int f1741d;

    /* renamed from: e */
    private java.lang.CharSequence f1742e;

    /* renamed from: f */
    private java.lang.CharSequence f1743f;

    /* renamed from: g */
    private android.content.Intent f1744g;

    /* renamed from: h */
    private char f1745h;

    /* renamed from: i */
    private int f1746i;

    /* renamed from: j */
    private char f1747j;

    /* renamed from: k */
    private int f1748k;

    /* renamed from: l */
    private android.graphics.drawable.Drawable f1749l;

    /* renamed from: m */
    private int f1750m;

    /* renamed from: n */
    androidx.appcompat.view.menu.C0496h f1751n;

    /* renamed from: o */
    private androidx.appcompat.view.menu.SubMenuC0523v f1752o;

    /* renamed from: p */
    private java.lang.Runnable f1753p;

    /* renamed from: q */
    private android.view.MenuItem.OnMenuItemClickListener f1754q;

    /* renamed from: r */
    private java.lang.CharSequence f1755r;

    /* renamed from: s */
    private java.lang.CharSequence f1756s;

    /* renamed from: t */
    private android.content.res.ColorStateList f1757t;

    /* renamed from: u */
    private android.graphics.PorterDuff.Mode f1758u;

    /* renamed from: v */
    private boolean f1759v;

    /* renamed from: w */
    private boolean f1760w;

    /* renamed from: x */
    private boolean f1761x;

    /* renamed from: y */
    private int f1762y;

    /* renamed from: z */
    private int f1763z;

    /* renamed from: androidx.appcompat.view.menu.k$a */
    /* loaded from: classes.dex */
    class C0502a implements p000a.p018g.p029l.AbstractC0197b.AbstractC0199b {

        /* renamed from: a */
        final /* synthetic */ androidx.appcompat.view.menu.C0501k f1764a;

        C0502a(androidx.appcompat.view.menu.C0501k r1) {
                r0 = this;
                r0.f1764a = r1
                r0.<init>()
                return
        }

        @Override // p000a.p018g.p029l.AbstractC0197b.AbstractC0199b
        public void onActionProviderVisibilityChanged(boolean r2) {
                r1 = this;
                androidx.appcompat.view.menu.k r2 = r1.f1764a
                androidx.appcompat.view.menu.h r0 = r2.f1751n
                r0.m2390d(r2)
                return
        }
    }

    C0501k(androidx.appcompat.view.menu.C0496h r3, int r4, int r5, int r6, int r7, java.lang.CharSequence r8, int r9) {
            r2 = this;
            r2.<init>()
            r0 = 4096(0x1000, float:5.74E-42)
            r2.f1746i = r0
            r2.f1748k = r0
            r0 = 0
            r2.f1750m = r0
            r1 = 0
            r2.f1757t = r1
            r2.f1758u = r1
            r2.f1759v = r0
            r2.f1760w = r0
            r2.f1761x = r0
            r1 = 16
            r2.f1762y = r1
            r2.f1763z = r0
            r2.f1736D = r0
            r2.f1751n = r3
            r2.f1738a = r5
            r2.f1739b = r4
            r2.f1740c = r6
            r2.f1741d = r7
            r2.f1742e = r8
            r2.f1763z = r9
            return
    }

    /* renamed from: a */
    private android.graphics.drawable.Drawable m2368a(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L_0x002b
            boolean r0 = r1.f1761x
            if (r0 == 0) goto L_0x002b
            boolean r0 = r1.f1759v
            if (r0 != 0) goto L_0x000e
            boolean r0 = r1.f1760w
            if (r0 == 0) goto L_0x002b
        L_0x000e:
            android.graphics.drawable.Drawable r2 = androidx.core.graphics.drawable.C0698a.m1591h(r2)
            android.graphics.drawable.Drawable r2 = r2.mutate()
            boolean r0 = r1.f1759v
            if (r0 == 0) goto L_0x001f
            android.content.res.ColorStateList r0 = r1.f1757t
            androidx.core.graphics.drawable.C0698a.m1603a(r2, r0)
        L_0x001f:
            boolean r0 = r1.f1760w
            if (r0 == 0) goto L_0x0028
            android.graphics.PorterDuff$Mode r0 = r1.f1758u
            androidx.core.graphics.drawable.C0698a.m1600a(r2, r0)
        L_0x0028:
            r0 = 0
            r1.f1761x = r0
        L_0x002b:
            return r2
    }

    /* renamed from: a */
    private static void m2364a(java.lang.StringBuilder r0, int r1, int r2, java.lang.String r3) {
            r1 = r1 & r2
            if (r1 != r2) goto L_0x0006
            r0.append(r3)
        L_0x0006:
            return
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b
    /* renamed from: a */
    public p000a.p018g.p022f.p023a.AbstractMenuItemC0156b mo2369a(p000a.p018g.p029l.AbstractC0197b r2) {
            r1 = this;
            a.g.l.b r0 = r1.f1734B
            if (r0 == 0) goto L_0x0007
            r0.m3491f()
        L_0x0007:
            r0 = 0
            r1.f1733A = r0
            r1.f1734B = r2
            androidx.appcompat.view.menu.h r2 = r1.f1751n
            r0 = 1
            r2.mo87b(r0)
            a.g.l.b r2 = r1.f1734B
            if (r2 == 0) goto L_0x001e
            androidx.appcompat.view.menu.k$a r0 = new androidx.appcompat.view.menu.k$a
            r0.<init>(r1)
            r2.mo2338a(r0)
        L_0x001e:
            return r1
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b
    /* renamed from: a */
    public p000a.p018g.p029l.AbstractC0197b mo2370a() {
            r1 = this;
            a.g.l.b r0 = r1.f1734B
            return r0
    }

    /* renamed from: a */
    java.lang.CharSequence m2366a(androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a r1) {
            r0 = this;
            if (r1 == 0) goto L_0x000d
            boolean r1 = r1.mo149a()
            if (r1 == 0) goto L_0x000d
            java.lang.CharSequence r1 = r0.getTitleCondensed()
            goto L_0x0011
        L_0x000d:
            java.lang.CharSequence r1 = r0.getTitle()
        L_0x0011:
            return r1
    }

    /* renamed from: a */
    void m2367a(android.view.ContextMenu.ContextMenuInfo r1) {
            r0 = this;
            r0.f1737E = r1
            return
    }

    /* renamed from: a */
    public void m2365a(androidx.appcompat.view.menu.SubMenuC0523v r2) {
            r1 = this;
            r1.f1752o = r2
            java.lang.CharSequence r0 = r1.getTitle()
            r2.setHeaderTitle(r0)
            return
    }

    /* renamed from: a */
    public void m2363a(boolean r2) {
            r1 = this;
            r1.f1736D = r2
            androidx.appcompat.view.menu.h r2 = r1.f1751n
            r0 = 0
            r2.mo87b(r0)
            return
    }

    /* renamed from: b */
    public void m2362b() {
            r1 = this;
            androidx.appcompat.view.menu.h r0 = r1.f1751n
            r0.m2394c(r1)
            return
    }

    /* renamed from: b */
    void m2361b(boolean r4) {
            r3 = this;
            int r0 = r3.f1762y
            r1 = r0 & (-3)
            r2 = 0
            if (r4 == 0) goto L_0x0009
            r4 = 2
            goto L_0x000a
        L_0x0009:
            r4 = 0
        L_0x000a:
            r4 = r4 | r1
            r3.f1762y = r4
            int r4 = r3.f1762y
            if (r0 == r4) goto L_0x0016
            androidx.appcompat.view.menu.h r4 = r3.f1751n
            r4.mo87b(r2)
        L_0x0016:
            return
    }

    /* renamed from: c */
    public int m2360c() {
            r1 = this;
            int r0 = r1.f1741d
            return r0
    }

    /* renamed from: c */
    public void m2359c(boolean r2) {
            r1 = this;
            int r0 = r1.f1762y
            r0 = r0 & (-5)
            if (r2 == 0) goto L_0x0008
            r2 = 4
            goto L_0x0009
        L_0x0008:
            r2 = 0
        L_0x0009:
            r2 = r2 | r0
            r1.f1762y = r2
            return
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public boolean collapseActionView() {
            r2 = this;
            int r0 = r2.f1763z
            r0 = r0 & 8
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.view.View r0 = r2.f1733A
            if (r0 != 0) goto L_0x000e
            r0 = 1
            return r0
        L_0x000e:
            android.view.MenuItem$OnActionExpandListener r0 = r2.f1735C
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.onMenuItemActionCollapse(r2)
            if (r0 == 0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            return r1
        L_0x001a:
            androidx.appcompat.view.menu.h r0 = r2.f1751n
            boolean r0 = r0.mo2300a(r2)
            return r0
    }

    /* renamed from: d */
    char m2358d() {
            r1 = this;
            androidx.appcompat.view.menu.h r0 = r1.f1751n
            boolean r0 = r0.mo2295p()
            if (r0 == 0) goto L_0x000b
            char r0 = r1.f1747j
            goto L_0x000d
        L_0x000b:
            char r0 = r1.f1745h
        L_0x000d:
            return r0
    }

    /* renamed from: d */
    public void m2357d(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L_0x0007
            int r1 = r0.f1762y
            r1 = r1 | 32
            goto L_0x000b
        L_0x0007:
            int r1 = r0.f1762y
            r1 = r1 & (-33)
        L_0x000b:
            r0.f1762y = r1
            return
    }

    /* renamed from: e */
    java.lang.String m2356e() {
            r6 = this;
            char r0 = r6.m2358d()
            if (r0 != 0) goto L_0x0009
            java.lang.String r0 = ""
            return r0
        L_0x0009:
            androidx.appcompat.view.menu.h r1 = r6.f1751n
            android.content.Context r1 = r1.m2388e()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            androidx.appcompat.view.menu.h r3 = r6.f1751n
            android.content.Context r3 = r3.m2388e()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            boolean r3 = r3.hasPermanentMenuKey()
            if (r3 == 0) goto L_0x0031
            int r3 = p000a.p001a.C0007h.abc_prepend_shortcut_label
            java.lang.String r3 = r1.getString(r3)
            r2.append(r3)
        L_0x0031:
            androidx.appcompat.view.menu.h r3 = r6.f1751n
            boolean r3 = r3.mo2295p()
            if (r3 == 0) goto L_0x003c
            int r3 = r6.f1748k
            goto L_0x003e
        L_0x003c:
            int r3 = r6.f1746i
        L_0x003e:
            r4 = 65536(0x10000, float:9.18355E-41)
            int r5 = p000a.p001a.C0007h.abc_menu_meta_shortcut_label
            java.lang.String r5 = r1.getString(r5)
            m2364a(r2, r3, r4, r5)
            r4 = 4096(0x1000, float:5.74E-42)
            int r5 = p000a.p001a.C0007h.abc_menu_ctrl_shortcut_label
            java.lang.String r5 = r1.getString(r5)
            m2364a(r2, r3, r4, r5)
            r4 = 2
            int r5 = p000a.p001a.C0007h.abc_menu_alt_shortcut_label
            java.lang.String r5 = r1.getString(r5)
            m2364a(r2, r3, r4, r5)
            r4 = 1
            int r5 = p000a.p001a.C0007h.abc_menu_shift_shortcut_label
            java.lang.String r5 = r1.getString(r5)
            m2364a(r2, r3, r4, r5)
            r4 = 4
            int r5 = p000a.p001a.C0007h.abc_menu_sym_shortcut_label
            java.lang.String r5 = r1.getString(r5)
            m2364a(r2, r3, r4, r5)
            int r4 = p000a.p001a.C0007h.abc_menu_function_shortcut_label
            java.lang.String r4 = r1.getString(r4)
            r5 = 8
            m2364a(r2, r3, r5, r4)
            if (r0 == r5) goto L_0x0091
            r3 = 10
            if (r0 == r3) goto L_0x008e
            r3 = 32
            if (r0 == r3) goto L_0x008b
            r2.append(r0)
            goto L_0x009a
        L_0x008b:
            int r0 = p000a.p001a.C0007h.abc_menu_space_shortcut_label
            goto L_0x0093
        L_0x008e:
            int r0 = p000a.p001a.C0007h.abc_menu_enter_shortcut_label
            goto L_0x0093
        L_0x0091:
            int r0 = p000a.p001a.C0007h.abc_menu_delete_shortcut_label
        L_0x0093:
            java.lang.String r0 = r1.getString(r0)
            r2.append(r0)
        L_0x009a:
            java.lang.String r0 = r2.toString()
            return r0
    }

    /* renamed from: e */
    boolean m2355e(boolean r4) {
            r3 = this;
            int r0 = r3.f1762y
            r1 = r0 & (-9)
            r2 = 0
            if (r4 == 0) goto L_0x0009
            r4 = 0
            goto L_0x000b
        L_0x0009:
            r4 = 8
        L_0x000b:
            r4 = r4 | r1
            r3.f1762y = r4
            int r4 = r3.f1762y
            if (r0 == r4) goto L_0x0013
            r2 = 1
        L_0x0013:
            return r2
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public boolean expandActionView() {
            r2 = this;
            boolean r0 = r2.m2354f()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.view.MenuItem$OnActionExpandListener r0 = r2.f1735C
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.onMenuItemActionExpand(r2)
            if (r0 == 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return r1
        L_0x0014:
            androidx.appcompat.view.menu.h r0 = r2.f1751n
            boolean r0 = r0.mo2299b(r2)
            return r0
    }

    /* renamed from: f */
    public boolean m2354f() {
            r2 = this;
            int r0 = r2.f1763z
            r0 = r0 & 8
            r1 = 0
            if (r0 == 0) goto L_0x001a
            android.view.View r0 = r2.f1733A
            if (r0 != 0) goto L_0x0015
            a.g.l.b r0 = r2.f1734B
            if (r0 == 0) goto L_0x0015
            android.view.View r0 = r0.mo2337a(r2)
            r2.f1733A = r0
        L_0x0015:
            android.view.View r0 = r2.f1733A
            if (r0 == 0) goto L_0x001a
            r1 = 1
        L_0x001a:
            return r1
    }

    /* renamed from: g */
    public boolean m2353g() {
            r4 = this;
            android.view.MenuItem$OnMenuItemClickListener r0 = r4.f1754q
            r1 = 1
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.onMenuItemClick(r4)
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            androidx.appcompat.view.menu.h r0 = r4.f1751n
            boolean r0 = r0.mo2301a(r0, r4)
            if (r0 == 0) goto L_0x0015
            return r1
        L_0x0015:
            java.lang.Runnable r0 = r4.f1753p
            if (r0 == 0) goto L_0x001d
            r0.run()
            return r1
        L_0x001d:
            android.content.Intent r0 = r4.f1744g
            if (r0 == 0) goto L_0x0035
            androidx.appcompat.view.menu.h r0 = r4.f1751n     // Catch: ActivityNotFoundException -> 0x002d
            android.content.Context r0 = r0.m2388e()     // Catch: ActivityNotFoundException -> 0x002d
            android.content.Intent r2 = r4.f1744g     // Catch: ActivityNotFoundException -> 0x002d
            r0.startActivity(r2)     // Catch: ActivityNotFoundException -> 0x002d
            return r1
        L_0x002d:
            r0 = move-exception
            java.lang.String r2 = "MenuItemImpl"
            java.lang.String r3 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r2, r3, r0)
        L_0x0035:
            a.g.l.b r0 = r4.f1734B
            if (r0 == 0) goto L_0x0040
            boolean r0 = r0.mo2341d()
            if (r0 == 0) goto L_0x0040
            return r1
        L_0x0040:
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This is not supported, use MenuItemCompat.getActionProvider()"
            r0.<init>(r1)
            throw r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public android.view.View getActionView() {
            r1 = this;
            android.view.View r0 = r1.f1733A
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            a.g.l.b r0 = r1.f1734B
            if (r0 == 0) goto L_0x0012
            android.view.View r0 = r0.mo2337a(r1)
            r1.f1733A = r0
            android.view.View r0 = r1.f1733A
            return r0
        L_0x0012:
            r0 = 0
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public int getAlphabeticModifiers() {
            r1 = this;
            int r0 = r1.f1748k
            return r0
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
            r1 = this;
            char r0 = r1.f1747j
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public java.lang.CharSequence getContentDescription() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f1755r
            return r0
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
            r1 = this;
            int r0 = r1.f1739b
            return r0
    }

    @Override // android.view.MenuItem
    public android.graphics.drawable.Drawable getIcon() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f1749l
            if (r0 == 0) goto L_0x0009
            android.graphics.drawable.Drawable r0 = r2.m2368a(r0)
            return r0
        L_0x0009:
            int r0 = r2.f1750m
            if (r0 == 0) goto L_0x0023
            androidx.appcompat.view.menu.h r0 = r2.f1751n
            android.content.Context r0 = r0.m2388e()
            int r1 = r2.f1750m
            android.graphics.drawable.Drawable r0 = p000a.p001a.p002k.p003a.C0010a.m4259c(r0, r1)
            r1 = 0
            r2.f1750m = r1
            r2.f1749l = r0
            android.graphics.drawable.Drawable r0 = r2.m2368a(r0)
            return r0
        L_0x0023:
            r0 = 0
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public android.content.res.ColorStateList getIconTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f1757t
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public android.graphics.PorterDuff.Mode getIconTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.f1758u
            return r0
    }

    @Override // android.view.MenuItem
    public android.content.Intent getIntent() {
            r1 = this;
            android.content.Intent r0 = r1.f1744g
            return r0
    }

    @Override // android.view.MenuItem
    @android.view.ViewDebug.CapturedViewProperty
    public int getItemId() {
            r1 = this;
            int r0 = r1.f1738a
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
            r1 = this;
            android.view.ContextMenu$ContextMenuInfo r0 = r1.f1737E
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public int getNumericModifiers() {
            r1 = this;
            int r0 = r1.f1746i
            return r0
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
            r1 = this;
            char r0 = r1.f1745h
            return r0
    }

    @Override // android.view.MenuItem
    public int getOrder() {
            r1 = this;
            int r0 = r1.f1740c
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.SubMenu getSubMenu() {
            r1 = this;
            androidx.appcompat.view.menu.v r0 = r1.f1752o
            return r0
    }

    @Override // android.view.MenuItem
    @android.view.ViewDebug.CapturedViewProperty
    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f1742e
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitleCondensed() {
            r3 = this;
            java.lang.CharSequence r0 = r3.f1743f
            if (r0 == 0) goto L_0x0005
            goto L_0x0007
        L_0x0005:
            java.lang.CharSequence r0 = r3.f1742e
        L_0x0007:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 18
            if (r1 >= r2) goto L_0x0017
            if (r0 == 0) goto L_0x0017
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L_0x0017
            java.lang.String r0 = r0.toString()
        L_0x0017:
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public java.lang.CharSequence getTooltipText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f1756s
            return r0
    }

    /* renamed from: h */
    public boolean m2352h() {
            r2 = this;
            int r0 = r2.f1762y
            r1 = 32
            r0 = r0 & r1
            if (r0 != r1) goto L_0x0009
            r0 = 1
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            return r0
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
            r1 = this;
            androidx.appcompat.view.menu.v r0 = r1.f1752o
            if (r0 == 0) goto L_0x0006
            r0 = 1
            goto L_0x0007
        L_0x0006:
            r0 = 0
        L_0x0007:
            return r0
    }

    /* renamed from: i */
    public boolean m2351i() {
            r1 = this;
            int r0 = r1.f1762y
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public boolean isActionViewExpanded() {
            r1 = this;
            boolean r0 = r1.f1736D
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
            r2 = this;
            int r0 = r2.f1762y
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L_0x0007
            goto L_0x0008
        L_0x0007:
            r1 = 0
        L_0x0008:
            return r1
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
            r2 = this;
            int r0 = r2.f1762y
            r1 = 2
            r0 = r0 & r1
            if (r0 != r1) goto L_0x0008
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
            int r0 = r1.f1762y
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
            r3 = this;
            a.g.l.b r0 = r3.f1734B
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.mo2335e()
            if (r0 == 0) goto L_0x001d
            int r0 = r3.f1762y
            r0 = r0 & 8
            if (r0 != 0) goto L_0x001b
            a.g.l.b r0 = r3.f1734B
            boolean r0 = r0.mo2336b()
            if (r0 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            return r1
        L_0x001d:
            int r0 = r3.f1762y
            r0 = r0 & 8
            if (r0 != 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            return r1
    }

    /* renamed from: j */
    public boolean m2350j() {
            r2 = this;
            int r0 = r2.f1763z
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L_0x0007
            goto L_0x0008
        L_0x0007:
            r1 = 0
        L_0x0008:
            return r1
    }

    /* renamed from: k */
    public boolean m2349k() {
            r2 = this;
            int r0 = r2.f1763z
            r1 = 2
            r0 = r0 & r1
            if (r0 != r1) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            return r0
    }

    /* renamed from: l */
    public boolean m2348l() {
            r1 = this;
            androidx.appcompat.view.menu.h r0 = r1.f1751n
            boolean r0 = r0.m2377k()
            return r0
    }

    /* renamed from: m */
    boolean m2347m() {
            r1 = this;
            androidx.appcompat.view.menu.h r0 = r1.f1751n
            boolean r0 = r0.mo2294q()
            if (r0 == 0) goto L_0x0010
            char r0 = r1.m2358d()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
    }

    /* renamed from: n */
    public boolean m2346n() {
            r2 = this;
            int r0 = r2.f1763z
            r1 = 4
            r0 = r0 & r1
            if (r0 != r1) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionProvider(android.view.ActionProvider r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This is not supported, use MenuItemCompat.setActionProvider()"
            r2.<init>(r0)
            throw r2
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public p000a.p018g.p022f.p023a.AbstractMenuItemC0156b setActionView(int r4) {
            r3 = this;
            androidx.appcompat.view.menu.h r0 = r3.f1751n
            android.content.Context r0 = r0.m2388e()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r0)
            r0 = 0
            android.view.View r4 = r1.inflate(r4, r2, r0)
            r3.setActionView(r4)
            return r3
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public p000a.p018g.p022f.p023a.AbstractMenuItemC0156b setActionView(android.view.View r3) {
            r2 = this;
            r2.f1733A = r3
            r0 = 0
            r2.f1734B = r0
            if (r3 == 0) goto L_0x0015
            int r0 = r3.getId()
            r1 = -1
            if (r0 != r1) goto L_0x0015
            int r0 = r2.f1738a
            if (r0 <= 0) goto L_0x0015
            r3.setId(r0)
        L_0x0015:
            androidx.appcompat.view.menu.h r3 = r2.f1751n
            r3.m2394c(r2)
            return r2
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public /* bridge */ /* synthetic */ android.view.MenuItem setActionView(int r1) {
            r0 = this;
            r0.setActionView(r1)
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public /* bridge */ /* synthetic */ android.view.MenuItem setActionView(android.view.View r1) {
            r0 = this;
            r0.setActionView(r1)
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char r2) {
            r1 = this;
            char r0 = r1.f1747j
            if (r0 != r2) goto L_0x0005
            return r1
        L_0x0005:
            char r2 = java.lang.Character.toLowerCase(r2)
            r1.f1747j = r2
            androidx.appcompat.view.menu.h r2 = r1.f1751n
            r0 = 0
            r2.mo87b(r0)
            return r1
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char r2, int r3) {
            r1 = this;
            char r0 = r1.f1747j
            if (r0 != r2) goto L_0x0009
            int r0 = r1.f1748k
            if (r0 != r3) goto L_0x0009
            return r1
        L_0x0009:
            char r2 = java.lang.Character.toLowerCase(r2)
            r1.f1747j = r2
            int r2 = android.view.KeyEvent.normalizeMetaState(r3)
            r1.f1748k = r2
            androidx.appcompat.view.menu.h r2 = r1.f1751n
            r3 = 0
            r2.mo87b(r3)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setCheckable(boolean r3) {
            r2 = this;
            int r0 = r2.f1762y
            r1 = r0 & (-2)
            r3 = r3 | r1
            r2.f1762y = r3
            int r3 = r2.f1762y
            if (r0 == r3) goto L_0x0011
            androidx.appcompat.view.menu.h r3 = r2.f1751n
            r0 = 0
            r3.mo87b(r0)
        L_0x0011:
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setChecked(boolean r2) {
            r1 = this;
            int r0 = r1.f1762y
            r0 = r0 & 4
            if (r0 == 0) goto L_0x000c
            androidx.appcompat.view.menu.h r2 = r1.f1751n
            r2.m2412a(r1)
            goto L_0x000f
        L_0x000c:
            r1.m2361b(r2)
        L_0x000f:
            return r1
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public p000a.p018g.p022f.p023a.AbstractMenuItemC0156b setContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            r1.f1755r = r2
            androidx.appcompat.view.menu.h r2 = r1.f1751n
            r0 = 0
            r2.mo87b(r0)
            return r1
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
            if (r2 == 0) goto L_0x0007
            int r2 = r1.f1762y
            r2 = r2 | 16
            goto L_0x000b
        L_0x0007:
            int r2 = r1.f1762y
            r2 = r2 & (-17)
        L_0x000b:
            r1.f1762y = r2
            androidx.appcompat.view.menu.h r2 = r1.f1751n
            r0 = 0
            r2.mo87b(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(int r2) {
            r1 = this;
            r0 = 0
            r1.f1749l = r0
            r1.f1750m = r2
            r2 = 1
            r1.f1761x = r2
            androidx.appcompat.view.menu.h r2 = r1.f1751n
            r0 = 0
            r2.mo87b(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r0 = 0
            r1.f1750m = r0
            r1.f1749l = r2
            r2 = 1
            r1.f1761x = r2
            androidx.appcompat.view.menu.h r2 = r1.f1751n
            r2.mo87b(r0)
            return r1
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public android.view.MenuItem setIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.f1757t = r2
            r2 = 1
            r1.f1759v = r2
            r1.f1761x = r2
            androidx.appcompat.view.menu.h r2 = r1.f1751n
            r0 = 0
            r2.mo87b(r0)
            return r1
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            r1.f1758u = r2
            r2 = 1
            r1.f1760w = r2
            r1.f1761x = r2
            androidx.appcompat.view.menu.h r2 = r1.f1751n
            r0 = 0
            r2.mo87b(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIntent(android.content.Intent r1) {
            r0 = this;
            r0.f1744g = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char r2) {
            r1 = this;
            char r0 = r1.f1745h
            if (r0 != r2) goto L_0x0005
            return r1
        L_0x0005:
            r1.f1745h = r2
            androidx.appcompat.view.menu.h r2 = r1.f1751n
            r0 = 0
            r2.mo87b(r0)
            return r1
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char r2, int r3) {
            r1 = this;
            char r0 = r1.f1745h
            if (r0 != r2) goto L_0x0009
            int r0 = r1.f1746i
            if (r0 != r3) goto L_0x0009
            return r1
        L_0x0009:
            r1.f1745h = r2
            int r2 = android.view.KeyEvent.normalizeMetaState(r3)
            r1.f1746i = r2
            androidx.appcompat.view.menu.h r2 = r1.f1751n
            r3 = 0
            r2.mo87b(r3)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener r1) {
            r0 = this;
            r0.f1735C = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener r1) {
            r0 = this;
            r0.f1754q = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char r1, char r2) {
            r0 = this;
            r0.f1745h = r1
            char r1 = java.lang.Character.toLowerCase(r2)
            r0.f1747j = r1
            androidx.appcompat.view.menu.h r1 = r0.f1751n
            r2 = 0
            r1.mo87b(r2)
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public android.view.MenuItem setShortcut(char r1, char r2, int r3, int r4) {
            r0 = this;
            r0.f1745h = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r3)
            r0.f1746i = r1
            char r1 = java.lang.Character.toLowerCase(r2)
            r0.f1747j = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r4)
            r0.f1748k = r1
            androidx.appcompat.view.menu.h r1 = r0.f1751n
            r2 = 0
            r1.mo87b(r2)
            return r0
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public void setShowAsAction(int r3) {
            r2 = this;
            r0 = r3 & 3
            if (r0 == 0) goto L_0x0013
            r1 = 1
            if (r0 == r1) goto L_0x0013
            r1 = 2
            if (r0 != r1) goto L_0x000b
            goto L_0x0013
        L_0x000b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive."
            r3.<init>(r0)
            throw r3
        L_0x0013:
            r2.f1763z = r3
            androidx.appcompat.view.menu.h r3 = r2.f1751n
            r3.m2394c(r2)
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
            androidx.appcompat.view.menu.h r0 = r1.f1751n
            android.content.Context r0 = r0.m2388e()
            java.lang.String r2 = r0.getString(r2)
            r1.setTitle(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(java.lang.CharSequence r3) {
            r2 = this;
            r2.f1742e = r3
            androidx.appcompat.view.menu.h r0 = r2.f1751n
            r1 = 0
            r0.mo87b(r1)
            androidx.appcompat.view.menu.v r0 = r2.f1752o
            if (r0 == 0) goto L_0x000f
            r0.setHeaderTitle(r3)
        L_0x000f:
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence r2) {
            r1 = this;
            r1.f1743f = r2
            androidx.appcompat.view.menu.h r2 = r1.f1751n
            r0 = 0
            r2.mo87b(r0)
            return r1
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public p000a.p018g.p022f.p023a.AbstractMenuItemC0156b setTooltipText(java.lang.CharSequence r2) {
            r1 = this;
            r1.f1756s = r2
            androidx.appcompat.view.menu.h r2 = r1.f1751n
            r0 = 0
            r2.mo87b(r0)
            return r1
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public /* bridge */ /* synthetic */ android.view.MenuItem setTooltipText(java.lang.CharSequence r1) {
            r0 = this;
            r0.setTooltipText(r1)
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setVisible(boolean r1) {
            r0 = this;
            boolean r1 = r0.m2355e(r1)
            if (r1 == 0) goto L_0x000b
            androidx.appcompat.view.menu.h r1 = r0.f1751n
            r1.m2390d(r0)
        L_0x000b:
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f1742e
            if (r0 == 0) goto L_0x0009
            java.lang.String r0 = r0.toString()
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            return r0
    }
}
