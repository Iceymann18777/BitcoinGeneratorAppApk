package p000a.p001a.p006m;

/* renamed from: a.a.m.d */
/* loaded from: classes.dex */
public class C0032d extends android.content.ContextWrapper {

    /* renamed from: a */
    private int f89a;

    /* renamed from: b */
    private android.content.res.Resources.Theme f90b;

    /* renamed from: c */
    private android.view.LayoutInflater f91c;

    /* renamed from: d */
    private android.content.res.Configuration f92d;

    /* renamed from: e */
    private android.content.res.Resources f93e;

    public C0032d() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public C0032d(android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f89a = r2
            return
    }

    public C0032d(android.content.Context r1, android.content.res.Resources.Theme r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f90b = r2
            return
    }

    /* renamed from: b */
    private android.content.res.Resources m4173b() {
            r3 = this;
            android.content.res.Resources r0 = r3.f93e
            if (r0 != 0) goto L_0x001e
            android.content.res.Configuration r0 = r3.f92d
            if (r0 != 0) goto L_0x000f
            android.content.res.Resources r0 = super.getResources()
        L_0x000c:
            r3.f93e = r0
            goto L_0x001e
        L_0x000f:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r1 < r2) goto L_0x001e
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            goto L_0x000c
        L_0x001e:
            android.content.res.Resources r0 = r3.f93e
            return r0
    }

    /* renamed from: c */
    private void m4172c() {
            r3 = this;
            android.content.res.Resources$Theme r0 = r3.f90b
            if (r0 != 0) goto L_0x0006
            r0 = 1
            goto L_0x0007
        L_0x0006:
            r0 = 0
        L_0x0007:
            if (r0 == 0) goto L_0x0022
            android.content.res.Resources r1 = r3.getResources()
            android.content.res.Resources$Theme r1 = r1.newTheme()
            r3.f90b = r1
            android.content.Context r1 = r3.getBaseContext()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            if (r1 == 0) goto L_0x0022
            android.content.res.Resources$Theme r2 = r3.f90b
            r2.setTo(r1)
        L_0x0022:
            android.content.res.Resources$Theme r1 = r3.f90b
            int r2 = r3.f89a
            r3.m4174a(r1, r2, r0)
            return
    }

    /* renamed from: a */
    public int m4175a() {
            r1 = this;
            int r0 = r1.f89a
            return r0
    }

    /* renamed from: a */
    protected void m4174a(android.content.res.Resources.Theme r1, int r2, boolean r3) {
            r0 = this;
            r3 = 1
            r1.applyStyle(r2, r3)
            return
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(android.content.Context r1) {
            r0 = this;
            super.attachBaseContext(r1)
            return
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.content.res.AssetManager r0 = r0.getAssets()
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
            r1 = this;
            android.content.res.Resources r0 = r1.m4173b()
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "layout_inflater"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x001d
            android.view.LayoutInflater r2 = r1.f91c
            if (r2 != 0) goto L_0x001a
            android.content.Context r2 = r1.getBaseContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            android.view.LayoutInflater r2 = r2.cloneInContext(r1)
            r1.f91c = r2
        L_0x001a:
            android.view.LayoutInflater r2 = r1.f91c
            return r2
        L_0x001d:
            android.content.Context r0 = r1.getBaseContext()
            java.lang.Object r2 = r0.getSystemService(r2)
            return r2
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources.Theme getTheme() {
            r1 = this;
            android.content.res.Resources$Theme r0 = r1.f90b
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            int r0 = r1.f89a
            if (r0 != 0) goto L_0x000d
            int r0 = p000a.p001a.C0008i.Theme_AppCompat_Light
            r1.f89a = r0
        L_0x000d:
            r1.m4172c()
            android.content.res.Resources$Theme r0 = r1.f90b
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int r2) {
            r1 = this;
            int r0 = r1.f89a
            if (r0 == r2) goto L_0x0009
            r1.f89a = r2
            r1.m4172c()
        L_0x0009:
            return
    }
}
