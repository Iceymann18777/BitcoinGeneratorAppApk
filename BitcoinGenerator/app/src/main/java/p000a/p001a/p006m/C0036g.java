package p000a.p001a.p006m;

/* renamed from: a.a.m.g */
/* loaded from: classes.dex */
public class C0036g extends android.view.MenuInflater {

    /* renamed from: e */
    static final java.lang.Class<?>[] f106e = null;

    /* renamed from: f */
    static final java.lang.Class<?>[] f107f = null;

    /* renamed from: a */
    final java.lang.Object[] f108a;

    /* renamed from: b */
    final java.lang.Object[] f109b;

    /* renamed from: c */
    android.content.Context f110c;

    /* renamed from: d */
    private java.lang.Object f111d;

    /* renamed from: a.a.m.g$a */
    /* loaded from: classes.dex */
    private static class MenuItem$OnMenuItemClickListenerC0037a implements android.view.MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        private static final java.lang.Class<?>[] f112c = null;

        /* renamed from: a */
        private java.lang.Object f113a;

        /* renamed from: b */
        private java.lang.reflect.Method f114b;

        static {
                r0 = 1
                java.lang.Class[] r0 = new java.lang.Class[r0]
                java.lang.Class<android.view.MenuItem> r1 = android.view.MenuItem.class
                r2 = 0
                r0[r2] = r1
                p000a.p001a.p006m.C0036g.MenuItem$OnMenuItemClickListenerC0037a.f112c = r0
                return
        }

        public MenuItem$OnMenuItemClickListenerC0037a(java.lang.Object r5, java.lang.String r6) {
                r4 = this;
                r4.<init>()
                r4.f113a = r5
                java.lang.Class r5 = r5.getClass()
                java.lang.Class<?>[] r0 = p000a.p001a.p006m.C0036g.MenuItem$OnMenuItemClickListenerC0037a.f112c     // Catch: Exception -> 0x0012
                java.lang.reflect.Method r0 = r5.getMethod(r6, r0)     // Catch: Exception -> 0x0012
                r4.f114b = r0     // Catch: Exception -> 0x0012
                return
            L_0x0012:
                r0 = move-exception
                android.view.InflateException r1 = new android.view.InflateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Couldn't resolve menu item onClick handler "
                r2.append(r3)
                r2.append(r6)
                java.lang.String r6 = " in class "
                r2.append(r6)
                java.lang.String r5 = r5.getName()
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r1.<init>(r5)
                r1.initCause(r0)
                throw r1
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(android.view.MenuItem r6) {
                r5 = this;
                java.lang.reflect.Method r0 = r5.f114b     // Catch: Exception -> 0x002b
                java.lang.Class r0 = r0.getReturnType()     // Catch: Exception -> 0x002b
                java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch: Exception -> 0x002b
                r2 = 0
                r3 = 1
                if (r0 != r1) goto L_0x001f
                java.lang.reflect.Method r0 = r5.f114b     // Catch: Exception -> 0x002b
                java.lang.Object r1 = r5.f113a     // Catch: Exception -> 0x002b
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: Exception -> 0x002b
                r3[r2] = r6     // Catch: Exception -> 0x002b
                java.lang.Object r6 = r0.invoke(r1, r3)     // Catch: Exception -> 0x002b
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: Exception -> 0x002b
                boolean r6 = r6.booleanValue()     // Catch: Exception -> 0x002b
                return r6
            L_0x001f:
                java.lang.reflect.Method r0 = r5.f114b     // Catch: Exception -> 0x002b
                java.lang.Object r1 = r5.f113a     // Catch: Exception -> 0x002b
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: Exception -> 0x002b
                r4[r2] = r6     // Catch: Exception -> 0x002b
                r0.invoke(r1, r4)     // Catch: Exception -> 0x002b
                return r3
            L_0x002b:
                r6 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r6)
                throw r0
        }
    }

    /* renamed from: a.a.m.g$b */
    /* loaded from: classes.dex */
    private class C0038b {

        /* renamed from: A */
        p000a.p018g.p029l.AbstractC0197b f115A;

        /* renamed from: B */
        private java.lang.CharSequence f116B;

        /* renamed from: C */
        private java.lang.CharSequence f117C;

        /* renamed from: D */
        private android.content.res.ColorStateList f118D;

        /* renamed from: E */
        private android.graphics.PorterDuff.Mode f119E;

        /* renamed from: F */
        final /* synthetic */ p000a.p001a.p006m.C0036g f120F;

        /* renamed from: a */
        private android.view.Menu f121a;

        /* renamed from: b */
        private int f122b;

        /* renamed from: c */
        private int f123c;

        /* renamed from: d */
        private int f124d;

        /* renamed from: e */
        private int f125e;

        /* renamed from: f */
        private boolean f126f;

        /* renamed from: g */
        private boolean f127g;

        /* renamed from: h */
        private boolean f128h;

        /* renamed from: i */
        private int f129i;

        /* renamed from: j */
        private int f130j;

        /* renamed from: k */
        private java.lang.CharSequence f131k;

        /* renamed from: l */
        private java.lang.CharSequence f132l;

        /* renamed from: m */
        private int f133m;

        /* renamed from: n */
        private char f134n;

        /* renamed from: o */
        private int f135o;

        /* renamed from: p */
        private char f136p;

        /* renamed from: q */
        private int f137q;

        /* renamed from: r */
        private int f138r;

        /* renamed from: s */
        private boolean f139s;

        /* renamed from: t */
        private boolean f140t;

        /* renamed from: u */
        private boolean f141u;

        /* renamed from: v */
        private int f142v;

        /* renamed from: w */
        private int f143w;

        /* renamed from: x */
        private java.lang.String f144x;

        /* renamed from: y */
        private java.lang.String f145y;

        /* renamed from: z */
        private java.lang.String f146z;

        public C0038b(p000a.p001a.p006m.C0036g r1, android.view.Menu r2) {
                r0 = this;
                r0.f120F = r1
                r0.<init>()
                r1 = 0
                r0.f118D = r1
                r0.f119E = r1
                r0.f121a = r2
                r0.m4158d()
                return
        }

        /* renamed from: a */
        private char m4163a(java.lang.String r2) {
                r1 = this;
                r0 = 0
                if (r2 != 0) goto L_0x0004
                return r0
            L_0x0004:
                char r2 = r2.charAt(r0)
                return r2
        }

        /* renamed from: a */
        private <T> T m4162a(java.lang.String r2, java.lang.Class<?>[] r3, java.lang.Object[] r4) {
                r1 = this;
                a.a.m.g r0 = r1.f120F     // Catch: Exception -> 0x0019
                android.content.Context r0 = r0.f110c     // Catch: Exception -> 0x0019
                java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: Exception -> 0x0019
                java.lang.Class r0 = r0.loadClass(r2)     // Catch: Exception -> 0x0019
                java.lang.reflect.Constructor r3 = r0.getConstructor(r3)     // Catch: Exception -> 0x0019
                r0 = 1
                r3.setAccessible(r0)     // Catch: Exception -> 0x0019
                java.lang.Object r2 = r3.newInstance(r4)     // Catch: Exception -> 0x0019
                return r2
            L_0x0019:
                r3 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = "Cannot instantiate class: "
                r4.append(r0)
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                java.lang.String r4 = "SupportMenuInflater"
                android.util.Log.w(r4, r2, r3)
                r2 = 0
                return r2
        }

        /* renamed from: a */
        private void m4164a(android.view.MenuItem r6) {
                r5 = this;
                boolean r0 = r5.f139s
                android.view.MenuItem r0 = r6.setChecked(r0)
                boolean r1 = r5.f140t
                android.view.MenuItem r0 = r0.setVisible(r1)
                boolean r1 = r5.f141u
                android.view.MenuItem r0 = r0.setEnabled(r1)
                int r1 = r5.f138r
                r2 = 0
                r3 = 1
                if (r1 < r3) goto L_0x001a
                r1 = 1
                goto L_0x001b
            L_0x001a:
                r1 = 0
            L_0x001b:
                android.view.MenuItem r0 = r0.setCheckable(r1)
                java.lang.CharSequence r1 = r5.f132l
                android.view.MenuItem r0 = r0.setTitleCondensed(r1)
                int r1 = r5.f133m
                r0.setIcon(r1)
                int r0 = r5.f142v
                if (r0 < 0) goto L_0x0031
                r6.setShowAsAction(r0)
            L_0x0031:
                java.lang.String r0 = r5.f146z
                if (r0 == 0) goto L_0x0058
                a.a.m.g r0 = r5.f120F
                android.content.Context r0 = r0.f110c
                boolean r0 = r0.isRestricted()
                if (r0 != 0) goto L_0x0050
                a.a.m.g$a r0 = new a.a.m.g$a
                a.a.m.g r1 = r5.f120F
                java.lang.Object r1 = r1.m4169a()
                java.lang.String r4 = r5.f146z
                r0.<init>(r1, r4)
                r6.setOnMenuItemClickListener(r0)
                goto L_0x0058
            L_0x0050:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "The android:onClick attribute cannot be used within a restricted context"
                r6.<init>(r0)
                throw r6
            L_0x0058:
                boolean r0 = r6 instanceof androidx.appcompat.view.menu.C0501k
                if (r0 == 0) goto L_0x005f
                r1 = r6
                androidx.appcompat.view.menu.k r1 = (androidx.appcompat.view.menu.C0501k) r1
            L_0x005f:
                int r1 = r5.f138r
                r4 = 2
                if (r1 < r4) goto L_0x0077
                if (r0 == 0) goto L_0x006d
                r0 = r6
                androidx.appcompat.view.menu.k r0 = (androidx.appcompat.view.menu.C0501k) r0
                r0.m2359c(r3)
                goto L_0x0077
            L_0x006d:
                boolean r0 = r6 instanceof androidx.appcompat.view.menu.MenuItemC0503l
                if (r0 == 0) goto L_0x0077
                r0 = r6
                androidx.appcompat.view.menu.l r0 = (androidx.appcompat.view.menu.MenuItemC0503l) r0
                r0.m2345a(r3)
            L_0x0077:
                java.lang.String r0 = r5.f144x
                if (r0 == 0) goto L_0x008b
                java.lang.Class<?>[] r1 = p000a.p001a.p006m.C0036g.f106e
                a.a.m.g r2 = r5.f120F
                java.lang.Object[] r2 = r2.f108a
                java.lang.Object r0 = r5.m4162a(r0, r1, r2)
                android.view.View r0 = (android.view.View) r0
                r6.setActionView(r0)
                r2 = 1
            L_0x008b:
                int r0 = r5.f143w
                if (r0 <= 0) goto L_0x009c
                if (r2 != 0) goto L_0x0095
                r6.setActionView(r0)
                goto L_0x009c
            L_0x0095:
                java.lang.String r0 = "SupportMenuInflater"
                java.lang.String r1 = "Ignoring attribute 'itemActionViewLayout'. Action view already specified."
                android.util.Log.w(r0, r1)
            L_0x009c:
                a.g.l.b r0 = r5.f115A
                if (r0 == 0) goto L_0x00a3
                p000a.p018g.p029l.C0205g.m3477a(r6, r0)
            L_0x00a3:
                java.lang.CharSequence r0 = r5.f116B
                p000a.p018g.p029l.C0205g.m3474a(r6, r0)
                java.lang.CharSequence r0 = r5.f117C
                p000a.p018g.p029l.C0205g.m3472b(r6, r0)
                char r0 = r5.f134n
                int r1 = r5.f135o
                p000a.p018g.p029l.C0205g.m3478a(r6, r0, r1)
                char r0 = r5.f136p
                int r1 = r5.f137q
                p000a.p018g.p029l.C0205g.m3473b(r6, r0, r1)
                android.graphics.PorterDuff$Mode r0 = r5.f119E
                if (r0 == 0) goto L_0x00c2
                p000a.p018g.p029l.C0205g.m3475a(r6, r0)
            L_0x00c2:
                android.content.res.ColorStateList r0 = r5.f118D
                if (r0 == 0) goto L_0x00c9
                p000a.p018g.p029l.C0205g.m3476a(r6, r0)
            L_0x00c9:
                return
        }

        /* renamed from: a */
        public void m4166a() {
                r5 = this;
                r0 = 1
                r5.f128h = r0
                android.view.Menu r0 = r5.f121a
                int r1 = r5.f122b
                int r2 = r5.f129i
                int r3 = r5.f130j
                java.lang.CharSequence r4 = r5.f131k
                android.view.MenuItem r0 = r0.add(r1, r2, r3, r4)
                r5.m4164a(r0)
                return
        }

        /* renamed from: a */
        public void m4165a(android.util.AttributeSet r3) {
                r2 = this;
                a.a.m.g r0 = r2.f120F
                android.content.Context r0 = r0.f110c
                int[] r1 = p000a.p001a.C0009j.MenuGroup
                android.content.res.TypedArray r3 = r0.obtainStyledAttributes(r3, r1)
                int r0 = p000a.p001a.C0009j.MenuGroup_android_id
                r1 = 0
                int r0 = r3.getResourceId(r0, r1)
                r2.f122b = r0
                int r0 = p000a.p001a.C0009j.MenuGroup_android_menuCategory
                int r0 = r3.getInt(r0, r1)
                r2.f123c = r0
                int r0 = p000a.p001a.C0009j.MenuGroup_android_orderInCategory
                int r0 = r3.getInt(r0, r1)
                r2.f124d = r0
                int r0 = p000a.p001a.C0009j.MenuGroup_android_checkableBehavior
                int r0 = r3.getInt(r0, r1)
                r2.f125e = r0
                int r0 = p000a.p001a.C0009j.MenuGroup_android_visible
                r1 = 1
                boolean r0 = r3.getBoolean(r0, r1)
                r2.f126f = r0
                int r0 = p000a.p001a.C0009j.MenuGroup_android_enabled
                boolean r0 = r3.getBoolean(r0, r1)
                r2.f127g = r0
                r3.recycle()
                return
        }

        /* renamed from: b */
        public android.view.SubMenu m4161b() {
                r5 = this;
                r0 = 1
                r5.f128h = r0
                android.view.Menu r0 = r5.f121a
                int r1 = r5.f122b
                int r2 = r5.f129i
                int r3 = r5.f130j
                java.lang.CharSequence r4 = r5.f131k
                android.view.SubMenu r0 = r0.addSubMenu(r1, r2, r3, r4)
                android.view.MenuItem r1 = r0.getItem()
                r5.m4164a(r1)
                return r0
        }

        /* renamed from: b */
        public void m4160b(android.util.AttributeSet r7) {
                r6 = this;
                a.a.m.g r0 = r6.f120F
                android.content.Context r0 = r0.f110c
                int[] r1 = p000a.p001a.C0009j.MenuItem
                android.content.res.TypedArray r7 = r0.obtainStyledAttributes(r7, r1)
                int r0 = p000a.p001a.C0009j.MenuItem_android_id
                r1 = 0
                int r0 = r7.getResourceId(r0, r1)
                r6.f129i = r0
                int r0 = p000a.p001a.C0009j.MenuItem_android_menuCategory
                int r2 = r6.f123c
                int r0 = r7.getInt(r0, r2)
                int r2 = p000a.p001a.C0009j.MenuItem_android_orderInCategory
                int r3 = r6.f124d
                int r2 = r7.getInt(r2, r3)
                r3 = -65536(0xffffffffffff0000, float:NaN)
                r0 = r0 & r3
                r3 = 65535(0xffff, float:9.1834E-41)
                r2 = r2 & r3
                r0 = r0 | r2
                r6.f130j = r0
                int r0 = p000a.p001a.C0009j.MenuItem_android_title
                java.lang.CharSequence r0 = r7.getText(r0)
                r6.f131k = r0
                int r0 = p000a.p001a.C0009j.MenuItem_android_titleCondensed
                java.lang.CharSequence r0 = r7.getText(r0)
                r6.f132l = r0
                int r0 = p000a.p001a.C0009j.MenuItem_android_icon
                int r0 = r7.getResourceId(r0, r1)
                r6.f133m = r0
                int r0 = p000a.p001a.C0009j.MenuItem_android_alphabeticShortcut
                java.lang.String r0 = r7.getString(r0)
                char r0 = r6.m4163a(r0)
                r6.f134n = r0
                int r0 = p000a.p001a.C0009j.MenuItem_alphabeticModifiers
                r2 = 4096(0x1000, float:5.74E-42)
                int r0 = r7.getInt(r0, r2)
                r6.f135o = r0
                int r0 = p000a.p001a.C0009j.MenuItem_android_numericShortcut
                java.lang.String r0 = r7.getString(r0)
                char r0 = r6.m4163a(r0)
                r6.f136p = r0
                int r0 = p000a.p001a.C0009j.MenuItem_numericModifiers
                int r0 = r7.getInt(r0, r2)
                r6.f137q = r0
                int r0 = p000a.p001a.C0009j.MenuItem_android_checkable
                boolean r0 = r7.hasValue(r0)
                if (r0 == 0) goto L_0x007e
                int r0 = p000a.p001a.C0009j.MenuItem_android_checkable
                boolean r0 = r7.getBoolean(r0, r1)
                goto L_0x0080
            L_0x007e:
                int r0 = r6.f125e
            L_0x0080:
                r6.f138r = r0
                int r0 = p000a.p001a.C0009j.MenuItem_android_checked
                boolean r0 = r7.getBoolean(r0, r1)
                r6.f139s = r0
                int r0 = p000a.p001a.C0009j.MenuItem_android_visible
                boolean r2 = r6.f126f
                boolean r0 = r7.getBoolean(r0, r2)
                r6.f140t = r0
                int r0 = p000a.p001a.C0009j.MenuItem_android_enabled
                boolean r2 = r6.f127g
                boolean r0 = r7.getBoolean(r0, r2)
                r6.f141u = r0
                int r0 = p000a.p001a.C0009j.MenuItem_showAsAction
                r2 = -1
                int r0 = r7.getInt(r0, r2)
                r6.f142v = r0
                int r0 = p000a.p001a.C0009j.MenuItem_android_onClick
                java.lang.String r0 = r7.getString(r0)
                r6.f146z = r0
                int r0 = p000a.p001a.C0009j.MenuItem_actionLayout
                int r0 = r7.getResourceId(r0, r1)
                r6.f143w = r0
                int r0 = p000a.p001a.C0009j.MenuItem_actionViewClass
                java.lang.String r0 = r7.getString(r0)
                r6.f144x = r0
                int r0 = p000a.p001a.C0009j.MenuItem_actionProviderClass
                java.lang.String r0 = r7.getString(r0)
                r6.f145y = r0
                java.lang.String r0 = r6.f145y
                if (r0 == 0) goto L_0x00cd
                r0 = 1
                goto L_0x00ce
            L_0x00cd:
                r0 = 0
            L_0x00ce:
                r3 = 0
                if (r0 == 0) goto L_0x00ea
                int r4 = r6.f143w
                if (r4 != 0) goto L_0x00ea
                java.lang.String r4 = r6.f144x
                if (r4 != 0) goto L_0x00ea
                java.lang.String r0 = r6.f145y
                java.lang.Class<?>[] r4 = p000a.p001a.p006m.C0036g.f107f
                a.a.m.g r5 = r6.f120F
                java.lang.Object[] r5 = r5.f109b
                java.lang.Object r0 = r6.m4162a(r0, r4, r5)
                a.g.l.b r0 = (p000a.p018g.p029l.AbstractC0197b) r0
                r6.f115A = r0
                goto L_0x00f5
            L_0x00ea:
                if (r0 == 0) goto L_0x00f3
                java.lang.String r0 = "SupportMenuInflater"
                java.lang.String r4 = "Ignoring attribute 'actionProviderClass'. Action view already specified."
                android.util.Log.w(r0, r4)
            L_0x00f3:
                r6.f115A = r3
            L_0x00f5:
                int r0 = p000a.p001a.C0009j.MenuItem_contentDescription
                java.lang.CharSequence r0 = r7.getText(r0)
                r6.f116B = r0
                int r0 = p000a.p001a.C0009j.MenuItem_tooltipText
                java.lang.CharSequence r0 = r7.getText(r0)
                r6.f117C = r0
                int r0 = p000a.p001a.C0009j.MenuItem_iconTintMode
                boolean r0 = r7.hasValue(r0)
                if (r0 == 0) goto L_0x011c
                int r0 = p000a.p001a.C0009j.MenuItem_iconTintMode
                int r0 = r7.getInt(r0, r2)
                android.graphics.PorterDuff$Mode r2 = r6.f119E
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0580c0.m2107a(r0, r2)
                r6.f119E = r0
                goto L_0x011e
            L_0x011c:
                r6.f119E = r3
            L_0x011e:
                int r0 = p000a.p001a.C0009j.MenuItem_iconTint
                boolean r0 = r7.hasValue(r0)
                if (r0 == 0) goto L_0x012f
                int r0 = p000a.p001a.C0009j.MenuItem_iconTint
                android.content.res.ColorStateList r0 = r7.getColorStateList(r0)
                r6.f118D = r0
                goto L_0x0131
            L_0x012f:
                r6.f118D = r3
            L_0x0131:
                r7.recycle()
                r6.f128h = r1
                return
        }

        /* renamed from: c */
        public boolean m4159c() {
                r1 = this;
                boolean r0 = r1.f128h
                return r0
        }

        /* renamed from: d */
        public void m4158d() {
                r1 = this;
                r0 = 0
                r1.f122b = r0
                r1.f123c = r0
                r1.f124d = r0
                r1.f125e = r0
                r0 = 1
                r1.f126f = r0
                r1.f127g = r0
                return
        }
    }

    static {
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r2 = 0
            r0[r2] = r1
            p000a.p001a.p006m.C0036g.f106e = r0
            java.lang.Class<?>[] r0 = p000a.p001a.p006m.C0036g.f106e
            p000a.p001a.p006m.C0036g.f107f = r0
            return
    }

    public C0036g(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            r2.f110c = r3
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r2.f108a = r0
            java.lang.Object[] r3 = r2.f108a
            r2.f109b = r3
            return
    }

    /* renamed from: a */
    private java.lang.Object m4168a(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0005
            return r2
        L_0x0005:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x0013
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            java.lang.Object r2 = r1.m4168a(r2)
        L_0x0013:
            return r2
    }

    /* renamed from: a */
    private void m4167a(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) {
            r12 = this;
            a.a.m.g$b r0 = new a.a.m.g$b
            r0.<init>(r12, r15)
            int r15 = r13.getEventType()
        L_0x0009:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L_0x0035
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L_0x001e
            int r15 = r13.next()
            goto L_0x003b
        L_0x001e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L_0x0035:
            int r15 = r13.next()
            if (r15 != r3) goto L_0x0009
        L_0x003b:
            r4 = 0
            r5 = 0
            r6 = r15
            r8 = r4
            r15 = 0
            r7 = 0
        L_0x0041:
            if (r15 != 0) goto L_0x00c7
            if (r6 == r3) goto L_0x00bf
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r6 == r1) goto L_0x008f
            r11 = 3
            if (r6 == r11) goto L_0x0050
            goto L_0x00ba
        L_0x0050:
            java.lang.String r6 = r13.getName()
            if (r7 == 0) goto L_0x005f
            boolean r11 = r6.equals(r8)
            if (r11 == 0) goto L_0x005f
            r8 = r4
            r7 = 0
            goto L_0x00ba
        L_0x005f:
            boolean r10 = r6.equals(r10)
            if (r10 == 0) goto L_0x0069
            r0.m4158d()
            goto L_0x00ba
        L_0x0069:
            boolean r9 = r6.equals(r9)
            if (r9 == 0) goto L_0x0087
            boolean r6 = r0.m4159c()
            if (r6 != 0) goto L_0x00ba
            a.g.l.b r6 = r0.f115A
            if (r6 == 0) goto L_0x0083
            boolean r6 = r6.mo2344a()
            if (r6 == 0) goto L_0x0083
            r0.m4161b()
            goto L_0x00ba
        L_0x0083:
            r0.m4166a()
            goto L_0x00ba
        L_0x0087:
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x00ba
            r15 = 1
            goto L_0x00ba
        L_0x008f:
            if (r7 == 0) goto L_0x0092
            goto L_0x00ba
        L_0x0092:
            java.lang.String r6 = r13.getName()
            boolean r10 = r6.equals(r10)
            if (r10 == 0) goto L_0x00a0
            r0.m4165a(r14)
            goto L_0x00ba
        L_0x00a0:
            boolean r9 = r6.equals(r9)
            if (r9 == 0) goto L_0x00aa
            r0.m4160b(r14)
            goto L_0x00ba
        L_0x00aa:
            boolean r9 = r6.equals(r2)
            if (r9 == 0) goto L_0x00b8
            android.view.SubMenu r6 = r0.m4161b()
            r12.m4167a(r13, r14, r6)
            goto L_0x00ba
        L_0x00b8:
            r8 = r6
            r7 = 1
        L_0x00ba:
            int r6 = r13.next()
            goto L_0x0041
        L_0x00bf:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        L_0x00c7:
            return
    }

    /* renamed from: a */
    java.lang.Object m4169a() {
            r1 = this;
            java.lang.Object r0 = r1.f111d
            if (r0 != 0) goto L_0x000c
            android.content.Context r0 = r1.f110c
            java.lang.Object r0 = r1.m4168a(r0)
            r1.f111d = r0
        L_0x000c:
            java.lang.Object r0 = r1.f111d
            return r0
    }

    @Override // android.view.MenuInflater
    public void inflate(int r4, android.view.Menu r5) {
            r3 = this;
            java.lang.String r0 = "Error inflating menu XML"
            boolean r1 = r5 instanceof p000a.p018g.p022f.p023a.AbstractMenuC0155a
            if (r1 != 0) goto L_0x000a
            super.inflate(r4, r5)
            return
        L_0x000a:
            r1 = 0
            android.content.Context r2 = r3.f110c     // Catch: all -> 0x0022, IOException -> 0x0024, XmlPullParserException -> 0x002b
            android.content.res.Resources r2 = r2.getResources()     // Catch: all -> 0x0022, IOException -> 0x0024, XmlPullParserException -> 0x002b
            android.content.res.XmlResourceParser r1 = r2.getLayout(r4)     // Catch: all -> 0x0022, IOException -> 0x0024, XmlPullParserException -> 0x002b
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r1)     // Catch: all -> 0x0022, IOException -> 0x0024, XmlPullParserException -> 0x002b
            r3.m4167a(r1, r4, r5)     // Catch: all -> 0x0022, IOException -> 0x0024, XmlPullParserException -> 0x002b
            if (r1 == 0) goto L_0x0021
            r1.close()
        L_0x0021:
            return
        L_0x0022:
            r4 = move-exception
            goto L_0x0032
        L_0x0024:
            r4 = move-exception
            android.view.InflateException r5 = new android.view.InflateException     // Catch: all -> 0x0022
            r5.<init>(r0, r4)     // Catch: all -> 0x0022
            throw r5     // Catch: all -> 0x0022
        L_0x002b:
            r4 = move-exception
            android.view.InflateException r5 = new android.view.InflateException     // Catch: all -> 0x0022
            r5.<init>(r0, r4)     // Catch: all -> 0x0022
            throw r5     // Catch: all -> 0x0022
        L_0x0032:
            if (r1 == 0) goto L_0x0037
            r1.close()
        L_0x0037:
            throw r4
    }
}
