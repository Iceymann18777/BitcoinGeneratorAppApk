package androidx.appcompat.app;

/* renamed from: androidx.appcompat.app.e */
/* loaded from: classes.dex */
public class ActivityC0442e extends p000a.p036j.p037a.ActivityC0255d implements androidx.appcompat.app.AbstractC0443f, androidx.core.app.C0696f.AbstractC0697a, androidx.appcompat.app.C0432b.AbstractC0435c {

    /* renamed from: m */
    private androidx.appcompat.app.AbstractC0444g f1416m;

    /* renamed from: n */
    private int f1417n;

    /* renamed from: o */
    private android.content.res.Resources f1418o;

    public ActivityC0442e() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1417n = r0
            return
    }

    /* renamed from: a */
    private boolean m2637a(int r2, android.view.KeyEvent r3) {
            r1 = this;
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r2 >= r0) goto L_0x003e
            boolean r2 = r3.isCtrlPressed()
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getMetaState()
            boolean r2 = android.view.KeyEvent.metaStateHasNoModifiers(r2)
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getRepeatCount()
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getKeyCode()
            boolean r2 = android.view.KeyEvent.isModifierKey(r2)
            if (r2 != 0) goto L_0x003e
            android.view.Window r2 = r1.getWindow()
            if (r2 == 0) goto L_0x003e
            android.view.View r0 = r2.getDecorView()
            if (r0 == 0) goto L_0x003e
            android.view.View r2 = r2.getDecorView()
            boolean r2 = r2.dispatchKeyShortcutEvent(r3)
            if (r2 == 0) goto L_0x003e
            r2 = 1
            return r2
        L_0x003e:
            r2 = 0
            return r2
    }

    @Override // androidx.appcompat.app.AbstractC0443f
    /* renamed from: a */
    public p000a.p001a.p006m.AbstractC0029b mo2529a(p000a.p001a.p006m.AbstractC0029b.AbstractC0030a r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.app.AbstractC0443f
    /* renamed from: a */
    public void mo2528a(p000a.p001a.p006m.AbstractC0029b r1) {
            r0 = this;
            return
    }

    /* renamed from: a */
    public void m2636a(android.content.Intent r1) {
            r0 = this;
            androidx.core.app.C0694d.m1629a(r0, r1)
            return
    }

    /* renamed from: a */
    public void m2635a(androidx.appcompat.widget.Toolbar r2) {
            r1 = this;
            androidx.appcompat.app.g r0 = r1.m2629i()
            r0.mo2600a(r2)
            return
    }

    /* renamed from: a */
    public void m2634a(androidx.core.app.C0696f r1) {
            r0 = this;
            r1.m1620a(r0)
            return
    }

    @Override // android.app.Activity
    public void addContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            androidx.appcompat.app.g r0 = r1.m2629i()
            r0.mo2609a(r2, r3)
            return
    }

    @Override // androidx.appcompat.app.AbstractC0443f
    /* renamed from: b */
    public void mo2525b(p000a.p001a.p006m.AbstractC0029b r1) {
            r0 = this;
            return
    }

    /* renamed from: b */
    public void m2632b(androidx.core.app.C0696f r1) {
            r0 = this;
            return
    }

    /* renamed from: b */
    public boolean m2633b(android.content.Intent r1) {
            r0 = this;
            boolean r1 = androidx.core.app.C0694d.m1626b(r0, r1)
            return r1
    }

    @Override // androidx.appcompat.app.C0432b.AbstractC0435c
    /* renamed from: c */
    public androidx.appcompat.app.C0432b.AbstractC0434b mo2631c() {
            r1 = this;
            androidx.appcompat.app.g r0 = r1.m2629i()
            androidx.appcompat.app.b$b r0 = r0.mo2598b()
            return r0
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
            r3 = this;
            androidx.appcompat.app.a r0 = r3.m2628j()
            android.view.Window r1 = r3.getWindow()
            r2 = 0
            boolean r1 = r1.hasFeature(r2)
            if (r1 == 0) goto L_0x001a
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.mo2518e()
            if (r0 != 0) goto L_0x001a
        L_0x0017:
            super.closeOptionsMenu()
        L_0x001a:
            return
    }

    @Override // androidx.core.app.C0696f.AbstractC0697a
    /* renamed from: d */
    public android.content.Intent mo1615d() {
            r1 = this;
            android.content.Intent r0 = androidx.core.app.C0694d.m1630a(r1)
            return r0
    }

    @Override // androidx.core.app.ActivityC0693c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            int r0 = r4.getKeyCode()
            androidx.appcompat.app.a r1 = r3.m2628j()
            r2 = 82
            if (r0 != r2) goto L_0x0016
            if (r1 == 0) goto L_0x0016
            boolean r0 = r1.mo2519a(r4)
            if (r0 == 0) goto L_0x0016
            r4 = 1
            return r4
        L_0x0016:
            boolean r4 = super.dispatchKeyEvent(r4)
            return r4
    }

    @Override // android.app.Activity
    public <T extends android.view.View> T findViewById(int r2) {
            r1 = this;
            androidx.appcompat.app.g r0 = r1.m2629i()
            android.view.View r2 = r0.mo2619a(r2)
            return r2
    }

    @Override // android.app.Activity
    public android.view.MenuInflater getMenuInflater() {
            r1 = this;
            androidx.appcompat.app.g r0 = r1.m2629i()
            android.view.MenuInflater r0 = r0.mo2589c()
            return r0
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
            r2 = this;
            android.content.res.Resources r0 = r2.f1418o
            if (r0 != 0) goto L_0x0015
            boolean r0 = androidx.appcompat.widget.C0659y0.m1791b()
            if (r0 == 0) goto L_0x0015
            androidx.appcompat.widget.y0 r0 = new androidx.appcompat.widget.y0
            android.content.res.Resources r1 = super.getResources()
            r0.<init>(r2, r1)
            r2.f1418o = r0
        L_0x0015:
            android.content.res.Resources r0 = r2.f1418o
            if (r0 != 0) goto L_0x001d
            android.content.res.Resources r0 = super.getResources()
        L_0x001d:
            return r0
    }

    @Override // p000a.p036j.p037a.ActivityC0255d
    /* renamed from: h */
    public void mo2630h() {
            r1 = this;
            androidx.appcompat.app.g r0 = r1.m2629i()
            r0.mo2578f()
            return
    }

    /* renamed from: i */
    public androidx.appcompat.app.AbstractC0444g m2629i() {
            r1 = this;
            androidx.appcompat.app.g r0 = r1.f1416m
            if (r0 != 0) goto L_0x000a
            androidx.appcompat.app.g r0 = androidx.appcompat.app.AbstractC0444g.m2625a(r1, r1)
            r1.f1416m = r0
        L_0x000a:
            androidx.appcompat.app.g r0 = r1.f1416m
            return r0
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
            r1 = this;
            androidx.appcompat.app.g r0 = r1.m2629i()
            r0.mo2578f()
            return
    }

    /* renamed from: j */
    public androidx.appcompat.app.AbstractC0428a m2628j() {
            r1 = this;
            androidx.appcompat.app.g r0 = r1.m2629i()
            androidx.appcompat.app.a r0 = r0.mo2584d()
            return r0
    }

    @java.lang.Deprecated
    /* renamed from: k */
    public void m2627k() {
            r0 = this;
            return
    }

    /* renamed from: l */
    public boolean m2626l() {
            r2 = this;
            android.content.Intent r0 = r2.mo1615d()
            if (r0 == 0) goto L_0x0026
            boolean r1 = r2.m2633b(r0)
            if (r1 == 0) goto L_0x0021
            androidx.core.app.f r0 = androidx.core.app.C0696f.m1618a(r2)
            r2.m2634a(r0)
            r2.m2632b(r0)
            r0.m1621a()
            androidx.core.app.C0688a.m1636a(r2)     // Catch: IllegalStateException -> 0x001d
            goto L_0x0024
        L_0x001d:
            r2.finish()
            goto L_0x0024
        L_0x0021:
            r2.m2636a(r0)
        L_0x0024:
            r0 = 1
            return r0
        L_0x0026:
            r0 = 0
            return r0
    }

    @Override // p000a.p036j.p037a.ActivityC0255d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r3) {
            r2 = this;
            super.onConfigurationChanged(r3)
            androidx.appcompat.app.g r0 = r2.m2629i()
            r0.mo2614a(r3)
            android.content.res.Resources r0 = r2.f1418o
            if (r0 == 0) goto L_0x001b
            android.content.res.Resources r0 = super.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            android.content.res.Resources r1 = r2.f1418o
            r1.updateConfiguration(r3, r0)
        L_0x001b:
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
            r0 = this;
            r0.m2627k()
            return
    }

    @Override // p000a.p036j.p037a.ActivityC0255d, androidx.core.app.ActivityC0693c, android.app.Activity
    protected void onCreate(android.os.Bundle r4) {
            r3 = this;
            androidx.appcompat.app.g r0 = r3.m2629i()
            r0.mo2581e()
            r0.mo2613a(r4)
            boolean r0 = r0.mo2620a()
            if (r0 == 0) goto L_0x0028
            int r0 = r3.f1417n
            if (r0 == 0) goto L_0x0028
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L_0x0025
            android.content.res.Resources$Theme r0 = r3.getTheme()
            int r1 = r3.f1417n
            r2 = 0
            r3.onApplyThemeResource(r0, r1, r2)
            goto L_0x0028
        L_0x0025:
            r3.setTheme(r0)
        L_0x0028:
            super.onCreate(r4)
            return
    }

    @Override // p000a.p036j.p037a.ActivityC0255d, android.app.Activity
    protected void onDestroy() {
            r1 = this;
            super.onDestroy()
            androidx.appcompat.app.g r0 = r1.m2629i()
            r0.mo2576g()
            return
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r2, android.view.KeyEvent r3) {
            r1 = this;
            boolean r0 = r1.m2637a(r2, r3)
            if (r0 == 0) goto L_0x0008
            r2 = 1
            return r2
        L_0x0008:
            boolean r2 = super.onKeyDown(r2, r3)
            return r2
    }

    @Override // p000a.p036j.p037a.ActivityC0255d, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int r2, android.view.MenuItem r3) {
            r1 = this;
            boolean r2 = super.onMenuItemSelected(r2, r3)
            if (r2 == 0) goto L_0x0008
            r2 = 1
            return r2
        L_0x0008:
            androidx.appcompat.app.a r2 = r1.m2628j()
            int r3 = r3.getItemId()
            r0 = 16908332(0x102002c, float:2.3877352E-38)
            if (r3 != r0) goto L_0x0024
            if (r2 == 0) goto L_0x0024
            int r2 = r2.mo2486g()
            r2 = r2 & 4
            if (r2 == 0) goto L_0x0024
            boolean r2 = r1.m2626l()
            return r2
        L_0x0024:
            r2 = 0
            return r2
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int r1, android.view.Menu r2) {
            r0 = this;
            boolean r1 = super.onMenuOpened(r1, r2)
            return r1
    }

    @Override // p000a.p036j.p037a.ActivityC0255d, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int r1, android.view.Menu r2) {
            r0 = this;
            super.onPanelClosed(r1, r2)
            return
    }

    @Override // android.app.Activity
    protected void onPostCreate(android.os.Bundle r2) {
            r1 = this;
            super.onPostCreate(r2)
            androidx.appcompat.app.g r0 = r1.m2629i()
            r0.mo2594b(r2)
            return
    }

    @Override // p000a.p036j.p037a.ActivityC0255d, android.app.Activity
    protected void onPostResume() {
            r1 = this;
            super.onPostResume()
            androidx.appcompat.app.g r0 = r1.m2629i()
            r0.mo2574h()
            return
    }

    @Override // p000a.p036j.p037a.ActivityC0255d, androidx.core.app.ActivityC0693c, android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle r2) {
            r1 = this;
            super.onSaveInstanceState(r2)
            androidx.appcompat.app.g r0 = r1.m2629i()
            r0.mo2586c(r2)
            return
    }

    @Override // p000a.p036j.p037a.ActivityC0255d, android.app.Activity
    protected void onStart() {
            r1 = this;
            super.onStart()
            androidx.appcompat.app.g r0 = r1.m2629i()
            r0.mo2572i()
            return
    }

    @Override // p000a.p036j.p037a.ActivityC0255d, android.app.Activity
    protected void onStop() {
            r1 = this;
            super.onStop()
            androidx.appcompat.app.g r0 = r1.m2629i()
            r0.mo2570j()
            return
    }

    @Override // android.app.Activity
    protected void onTitleChanged(java.lang.CharSequence r1, int r2) {
            r0 = this;
            super.onTitleChanged(r1, r2)
            androidx.appcompat.app.g r2 = r0.m2629i()
            r2.mo2599a(r1)
            return
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
            r3 = this;
            androidx.appcompat.app.a r0 = r3.m2628j()
            android.view.Window r1 = r3.getWindow()
            r2 = 0
            boolean r1 = r1.hasFeature(r2)
            if (r1 == 0) goto L_0x001a
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.mo2515k()
            if (r0 != 0) goto L_0x001a
        L_0x0017:
            super.openOptionsMenu()
        L_0x001a:
            return
    }

    @Override // android.app.Activity
    public void setContentView(int r2) {
            r1 = this;
            androidx.appcompat.app.g r0 = r1.m2629i()
            r0.mo2588c(r2)
            return
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View r2) {
            r1 = this;
            androidx.appcompat.app.g r0 = r1.m2629i()
            r0.mo2610a(r2)
            return
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            androidx.appcompat.app.g r0 = r1.m2629i()
            r0.mo2593b(r2, r3)
            return
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int r1) {
            r0 = this;
            super.setTheme(r1)
            r0.f1417n = r1
            return
    }
}
