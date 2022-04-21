package androidx.appcompat.app;

/* renamed from: androidx.appcompat.app.i */
/* loaded from: classes.dex */
public class DialogC0464i extends android.app.Dialog implements androidx.appcompat.app.AbstractC0443f {

    /* renamed from: b */
    private androidx.appcompat.app.AbstractC0444g f1507b;

    /* renamed from: c */
    private final p000a.p018g.p029l.C0201d.AbstractC0202a f1508c;

    /* renamed from: androidx.appcompat.app.i$a */
    /* loaded from: classes.dex */
    class C0465a implements p000a.p018g.p029l.C0201d.AbstractC0202a {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.app.DialogC0464i f1509b;

        C0465a(androidx.appcompat.app.DialogC0464i r1) {
                r0 = this;
                r0.f1509b = r1
                r0.<init>()
                return
        }

        @Override // p000a.p018g.p029l.C0201d.AbstractC0202a
        /* renamed from: a */
        public boolean mo1631a(android.view.KeyEvent r2) {
                r1 = this;
                androidx.appcompat.app.i r0 = r1.f1509b
                boolean r2 = r0.m2526a(r2)
                return r2
        }
    }

    public DialogC0464i(android.content.Context r1, int r2) {
            r0 = this;
            int r2 = m2527a(r1, r2)
            r0.<init>(r1, r2)
            androidx.appcompat.app.i$a r1 = new androidx.appcompat.app.i$a
            r1.<init>(r0)
            r0.f1508c = r1
            androidx.appcompat.app.g r1 = r0.m2531a()
            r2 = 0
            r1.mo2613a(r2)
            androidx.appcompat.app.g r1 = r0.m2531a()
            r1.mo2620a()
            return
    }

    /* renamed from: a */
    private static int m2527a(android.content.Context r2, int r3) {
            if (r3 != 0) goto L_0x0013
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            int r0 = p000a.p001a.C0000a.dialogTheme
            r1 = 1
            r2.resolveAttribute(r0, r3, r1)
            int r3 = r3.resourceId
        L_0x0013:
            return r3
    }

    @Override // androidx.appcompat.app.AbstractC0443f
    /* renamed from: a */
    public p000a.p001a.p006m.AbstractC0029b mo2529a(p000a.p001a.p006m.AbstractC0029b.AbstractC0030a r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* renamed from: a */
    public androidx.appcompat.app.AbstractC0444g m2531a() {
            r1 = this;
            androidx.appcompat.app.g r0 = r1.f1507b
            if (r0 != 0) goto L_0x000a
            androidx.appcompat.app.g r0 = androidx.appcompat.app.AbstractC0444g.m2624a(r1, r1)
            r1.f1507b = r0
        L_0x000a:
            androidx.appcompat.app.g r0 = r1.f1507b
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC0443f
    /* renamed from: a */
    public void mo2528a(p000a.p001a.p006m.AbstractC0029b r1) {
            r0 = this;
            return
    }

    /* renamed from: a */
    public boolean m2530a(int r2) {
            r1 = this;
            androidx.appcompat.app.g r0 = r1.m2531a()
            boolean r2 = r0.mo2597b(r2)
            return r2
    }

    /* renamed from: a */
    boolean m2526a(android.view.KeyEvent r1) {
            r0 = this;
            boolean r1 = super.dispatchKeyEvent(r1)
            return r1
    }

    @Override // android.app.Dialog
    public void addContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            androidx.appcompat.app.g r0 = r1.m2531a()
            r0.mo2609a(r2, r3)
            return
    }

    @Override // androidx.appcompat.app.AbstractC0443f
    /* renamed from: b */
    public void mo2525b(p000a.p001a.p006m.AbstractC0029b r1) {
            r0 = this;
            return
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            a.g.l.d$a r1 = r2.f1508c
            boolean r3 = p000a.p018g.p029l.C0201d.m3488a(r1, r0, r2, r3)
            return r3
    }

    @Override // android.app.Dialog
    public <T extends android.view.View> T findViewById(int r2) {
            r1 = this;
            androidx.appcompat.app.g r0 = r1.m2531a()
            android.view.View r2 = r0.mo2619a(r2)
            return r2
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
            r1 = this;
            androidx.appcompat.app.g r0 = r1.m2531a()
            r0.mo2578f()
            return
    }

    @Override // android.app.Dialog
    protected void onCreate(android.os.Bundle r2) {
            r1 = this;
            androidx.appcompat.app.g r0 = r1.m2531a()
            r0.mo2581e()
            super.onCreate(r2)
            androidx.appcompat.app.g r0 = r1.m2531a()
            r0.mo2613a(r2)
            return
    }

    @Override // android.app.Dialog
    protected void onStop() {
            r1 = this;
            super.onStop()
            androidx.appcompat.app.g r0 = r1.m2531a()
            r0.mo2570j()
            return
    }

    @Override // android.app.Dialog
    public void setContentView(int r2) {
            r1 = this;
            androidx.appcompat.app.g r0 = r1.m2531a()
            r0.mo2588c(r2)
            return
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View r2) {
            r1 = this;
            androidx.appcompat.app.g r0 = r1.m2531a()
            r0.mo2610a(r2)
            return
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            androidx.appcompat.app.g r0 = r1.m2531a()
            r0.mo2593b(r2, r3)
            return
    }

    @Override // android.app.Dialog
    public void setTitle(int r3) {
            r2 = this;
            super.setTitle(r3)
            androidx.appcompat.app.g r0 = r2.m2531a()
            android.content.Context r1 = r2.getContext()
            java.lang.String r3 = r1.getString(r3)
            r0.mo2599a(r3)
            return
    }

    @Override // android.app.Dialog
    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            super.setTitle(r2)
            androidx.appcompat.app.g r0 = r1.m2531a()
            r0.mo2599a(r2)
            return
    }
}
