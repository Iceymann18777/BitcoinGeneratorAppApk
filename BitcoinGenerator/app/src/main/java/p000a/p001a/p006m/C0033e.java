package p000a.p001a.p006m;

/* renamed from: a.a.m.e */
/* loaded from: classes.dex */
public class C0033e extends p000a.p001a.p006m.AbstractC0029b implements androidx.appcompat.view.menu.C0496h.AbstractC0497a {

    /* renamed from: d */
    private android.content.Context f94d;

    /* renamed from: e */
    private androidx.appcompat.widget.ActionBarContextView f95e;

    /* renamed from: f */
    private p000a.p001a.p006m.AbstractC0029b.AbstractC0030a f96f;

    /* renamed from: g */
    private java.lang.ref.WeakReference<android.view.View> f97g;

    /* renamed from: h */
    private boolean f98h;

    /* renamed from: i */
    private androidx.appcompat.view.menu.C0496h f99i;

    public C0033e(android.content.Context r1, androidx.appcompat.widget.ActionBarContextView r2, p000a.p001a.p006m.AbstractC0029b.AbstractC0030a r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f94d = r1
            r0.f95e = r2
            r0.f96f = r3
            androidx.appcompat.view.menu.h r1 = new androidx.appcompat.view.menu.h
            android.content.Context r2 = r2.getContext()
            r1.<init>(r2)
            r2 = 1
            r1.m2396c(r2)
            r0.f99i = r1
            androidx.appcompat.view.menu.h r1 = r0.f99i
            r1.mo2302a(r0)
            return
    }

    @Override // p000a.p001a.p006m.AbstractC0029b
    /* renamed from: a */
    public void mo2472a() {
            r2 = this;
            boolean r0 = r2.f98h
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r2.f98h = r0
            androidx.appcompat.widget.ActionBarContextView r0 = r2.f95e
            r1 = 32
            r0.sendAccessibilityEvent(r1)
            a.a.m.b$a r0 = r2.f96f
            r0.mo2545a(r2)
            return
    }

    @Override // p000a.p001a.p006m.AbstractC0029b
    /* renamed from: a */
    public void mo2471a(int r2) {
            r1 = this;
            android.content.Context r0 = r1.f94d
            java.lang.String r2 = r0.getString(r2)
            r1.mo2469a(r2)
            return
    }

    @Override // p000a.p001a.p006m.AbstractC0029b
    /* renamed from: a */
    public void mo2470a(android.view.View r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f95e
            r0.setCustomView(r2)
            if (r2 == 0) goto L_0x000d
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            r1.f97g = r0
            return
    }

    @Override // androidx.appcompat.view.menu.C0496h.AbstractC0497a
    /* renamed from: a */
    public void mo65a(androidx.appcompat.view.menu.C0496h r1) {
            r0 = this;
            r0.mo2460i()
            androidx.appcompat.widget.ActionBarContextView r1 = r0.f95e
            r1.m2285d()
            return
    }

    @Override // p000a.p001a.p006m.AbstractC0029b
    /* renamed from: a */
    public void mo2469a(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f95e
            r0.setSubtitle(r2)
            return
    }

    @Override // p000a.p001a.p006m.AbstractC0029b
    /* renamed from: a */
    public void mo2468a(boolean r2) {
            r1 = this;
            super.mo2468a(r2)
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f95e
            r0.setTitleOptional(r2)
            return
    }

    @Override // androidx.appcompat.view.menu.C0496h.AbstractC0497a
    /* renamed from: a */
    public boolean mo64a(androidx.appcompat.view.menu.C0496h r1, android.view.MenuItem r2) {
            r0 = this;
            a.a.m.b$a r1 = r0.f96f
            boolean r1 = r1.mo2543a(r0, r2)
            return r1
    }

    @Override // p000a.p001a.p006m.AbstractC0029b
    /* renamed from: b */
    public android.view.View mo2467b() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f97g
            if (r0 == 0) goto L_0x000b
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            return r0
    }

    @Override // p000a.p001a.p006m.AbstractC0029b
    /* renamed from: b */
    public void mo2466b(int r2) {
            r1 = this;
            android.content.Context r0 = r1.f94d
            java.lang.String r2 = r0.getString(r2)
            r1.mo2465b(r2)
            return
    }

    @Override // p000a.p001a.p006m.AbstractC0029b
    /* renamed from: b */
    public void mo2465b(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f95e
            r0.setTitle(r2)
            return
    }

    @Override // p000a.p001a.p006m.AbstractC0029b
    /* renamed from: c */
    public android.view.Menu mo2464c() {
            r1 = this;
            androidx.appcompat.view.menu.h r0 = r1.f99i
            return r0
    }

    @Override // p000a.p001a.p006m.AbstractC0029b
    /* renamed from: d */
    public android.view.MenuInflater mo2463d() {
            r2 = this;
            a.a.m.g r0 = new a.a.m.g
            androidx.appcompat.widget.ActionBarContextView r1 = r2.f95e
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            return r0
    }

    @Override // p000a.p001a.p006m.AbstractC0029b
    /* renamed from: e */
    public java.lang.CharSequence mo2462e() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f95e
            java.lang.CharSequence r0 = r0.getSubtitle()
            return r0
    }

    @Override // p000a.p001a.p006m.AbstractC0029b
    /* renamed from: g */
    public java.lang.CharSequence mo2461g() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f95e
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // p000a.p001a.p006m.AbstractC0029b
    /* renamed from: i */
    public void mo2460i() {
            r2 = this;
            a.a.m.b$a r0 = r2.f96f
            androidx.appcompat.view.menu.h r1 = r2.f99i
            r0.mo2544a(r2, r1)
            return
    }

    @Override // p000a.p001a.p006m.AbstractC0029b
    /* renamed from: j */
    public boolean mo2459j() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f95e
            boolean r0 = r0.m2287b()
            return r0
    }
}
