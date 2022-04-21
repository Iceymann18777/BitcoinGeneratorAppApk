package p000a.p036j.p037a;

/* renamed from: a.j.a.d */
/* loaded from: classes.dex */
public class ActivityC0255d extends androidx.core.app.ActivityC0693c implements androidx.lifecycle.AbstractC0762s, androidx.core.app.C0688a.AbstractC0689a, androidx.core.app.C0688a.AbstractC0691c {

    /* renamed from: c */
    final android.os.Handler f836c;

    /* renamed from: d */
    final p000a.p036j.p037a.C0260f f837d;

    /* renamed from: e */
    private androidx.lifecycle.C0761r f838e;

    /* renamed from: f */
    boolean f839f;

    /* renamed from: g */
    boolean f840g;

    /* renamed from: h */
    boolean f841h;

    /* renamed from: i */
    boolean f842i;

    /* renamed from: j */
    boolean f843j;

    /* renamed from: k */
    int f844k;

    /* renamed from: l */
    p000a.p013d.C0081h<java.lang.String> f845l;

    /* renamed from: a.j.a.d$a */
    /* loaded from: classes.dex */
    class HandlerC0256a extends android.os.Handler {

        /* renamed from: a */
        final /* synthetic */ p000a.p036j.p037a.ActivityC0255d f846a;

        HandlerC0256a(p000a.p036j.p037a.ActivityC0255d r1) {
                r0 = this;
                r0.f846a = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r3) {
                r2 = this;
                int r0 = r3.what
                r1 = 2
                if (r0 == r1) goto L_0x0009
                super.handleMessage(r3)
                goto L_0x0015
            L_0x0009:
                a.j.a.d r3 = r2.f846a
                r3.m3173f()
                a.j.a.d r3 = r2.f846a
                a.j.a.f r3 = r3.f837d
                r3.m3146i()
            L_0x0015:
                return
        }
    }

    /* renamed from: a.j.a.d$b */
    /* loaded from: classes.dex */
    class C0257b extends p000a.p036j.p037a.AbstractC0261g<p000a.p036j.p037a.ActivityC0255d> {

        /* renamed from: e */
        final /* synthetic */ p000a.p036j.p037a.ActivityC0255d f847e;

        public C0257b(p000a.p036j.p037a.ActivityC0255d r1) {
                r0 = this;
                r0.f847e = r1
                r0.<init>(r1)
                return
        }

        @Override // p000a.p036j.p037a.AbstractC0259e
        /* renamed from: a */
        public android.view.View mo3169a(int r2) {
                r1 = this;
                a.j.a.d r0 = r1.f847e
                android.view.View r2 = r0.findViewById(r2)
                return r2
        }

        @Override // p000a.p036j.p037a.AbstractC0261g
        /* renamed from: a */
        public void mo3141a(p000a.p036j.p037a.ComponentCallbacksC0248c r2) {
                r1 = this;
                a.j.a.d r0 = r1.f847e
                r0.m3180a(r2)
                return
        }

        @Override // p000a.p036j.p037a.AbstractC0261g
        /* renamed from: a */
        public void mo3140a(p000a.p036j.p037a.ComponentCallbacksC0248c r2, android.content.Intent r3, int r4, android.os.Bundle r5) {
                r1 = this;
                a.j.a.d r0 = r1.f847e
                r0.m3179a(r2, r3, r4, r5)
                return
        }

        @Override // p000a.p036j.p037a.AbstractC0261g
        /* renamed from: a */
        public void mo3139a(java.lang.String r2, java.io.FileDescriptor r3, java.io.PrintWriter r4, java.lang.String[] r5) {
                r1 = this;
                a.j.a.d r0 = r1.f847e
                r0.dump(r2, r3, r4, r5)
                return
        }

        @Override // p000a.p036j.p037a.AbstractC0259e
        /* renamed from: a */
        public boolean mo3170a() {
                r1 = this;
                a.j.a.d r0 = r1.f847e
                android.view.Window r0 = r0.getWindow()
                if (r0 == 0) goto L_0x0010
                android.view.View r0 = r0.peekDecorView()
                if (r0 == 0) goto L_0x0010
                r0 = 1
                goto L_0x0011
            L_0x0010:
                r0 = 0
            L_0x0011:
                return r0
        }

        @Override // p000a.p036j.p037a.AbstractC0261g
        /* renamed from: b */
        public boolean mo3137b(p000a.p036j.p037a.ComponentCallbacksC0248c r1) {
                r0 = this;
                a.j.a.d r1 = r0.f847e
                boolean r1 = r1.isFinishing()
                r1 = r1 ^ 1
                return r1
        }

        @Override // p000a.p036j.p037a.AbstractC0261g
        /* renamed from: f */
        public android.view.LayoutInflater mo3133f() {
                r2 = this;
                a.j.a.d r0 = r2.f847e
                android.view.LayoutInflater r0 = r0.getLayoutInflater()
                a.j.a.d r1 = r2.f847e
                android.view.LayoutInflater r0 = r0.cloneInContext(r1)
                return r0
        }

        @Override // p000a.p036j.p037a.AbstractC0261g
        /* renamed from: g */
        public int mo3132g() {
                r1 = this;
                a.j.a.d r0 = r1.f847e
                android.view.Window r0 = r0.getWindow()
                if (r0 != 0) goto L_0x000a
                r0 = 0
                goto L_0x0010
            L_0x000a:
                android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
                int r0 = r0.windowAnimations
            L_0x0010:
                return r0
        }

        @Override // p000a.p036j.p037a.AbstractC0261g
        /* renamed from: h */
        public boolean mo3131h() {
                r1 = this;
                a.j.a.d r0 = r1.f847e
                android.view.Window r0 = r0.getWindow()
                if (r0 == 0) goto L_0x000a
                r0 = 1
                goto L_0x000b
            L_0x000a:
                r0 = 0
            L_0x000b:
                return r0
        }

        @Override // p000a.p036j.p037a.AbstractC0261g
        /* renamed from: i */
        public void mo3130i() {
                r1 = this;
                a.j.a.d r0 = r1.f847e
                r0.mo2630h()
                return
        }
    }

    /* renamed from: a.j.a.d$c */
    /* loaded from: classes.dex */
    static final class C0258c {

        /* renamed from: a */
        androidx.lifecycle.C0761r f848a;

        /* renamed from: b */
        p000a.p036j.p037a.C0282j f849b;

        C0258c() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ActivityC0255d() {
            r1 = this;
            r1.<init>()
            a.j.a.d$a r0 = new a.j.a.d$a
            r0.<init>(r1)
            r1.f836c = r0
            a.j.a.d$b r0 = new a.j.a.d$b
            r0.<init>(r1)
            a.j.a.f r0 = p000a.p036j.p037a.C0260f.m3165a(r0)
            r1.f837d = r0
            r0 = 1
            r1.f841h = r0
            return
    }

    /* renamed from: a */
    static void m3181a(int r1) {
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r1 = r1 & r0
            if (r1 != 0) goto L_0x0006
            return
        L_0x0006:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Can only use lower 16 bits for requestCode"
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: a */
    private static boolean m3178a(p000a.p036j.p037a.AbstractC0262h r4, androidx.lifecycle.AbstractC0742e.EnumC0744b r5) {
            java.util.List r4 = r4.mo3071b()
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L_0x0009:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x003a
            java.lang.Object r1 = r4.next()
            a.j.a.c r1 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r1
            if (r1 != 0) goto L_0x0018
            goto L_0x0009
        L_0x0018:
            androidx.lifecycle.e r2 = r1.mo1368a()
            androidx.lifecycle.e$b r2 = r2.mo1386a()
            androidx.lifecycle.e$b r3 = androidx.lifecycle.AbstractC0742e.EnumC0744b.f2810e
            boolean r2 = r2.m1387a(r3)
            if (r2 == 0) goto L_0x002e
            androidx.lifecycle.h r0 = r1.f785T
            r0.m1384a(r5)
            r0 = 1
        L_0x002e:
            a.j.a.h r1 = r1.m3271O()
            if (r1 == 0) goto L_0x0009
            boolean r1 = m3178a(r1, r5)
            r0 = r0 | r1
            goto L_0x0009
        L_0x003a:
            return r0
    }

    /* renamed from: b */
    private int m3175b(p000a.p036j.p037a.ComponentCallbacksC0248c r4) {
            r3 = this;
            a.d.h<java.lang.String> r0 = r3.f845l
            int r0 = r0.m4008b()
            r1 = 65534(0xfffe, float:9.1833E-41)
            if (r0 >= r1) goto L_0x002e
        L_0x000b:
            a.d.h<java.lang.String> r0 = r3.f845l
            int r2 = r3.f844k
            int r0 = r0.m4004c(r2)
            if (r0 < 0) goto L_0x001d
            int r0 = r3.f844k
            int r0 = r0 + 1
            int r0 = r0 % r1
            r3.f844k = r0
            goto L_0x000b
        L_0x001d:
            int r0 = r3.f844k
            a.d.h<java.lang.String> r2 = r3.f845l
            java.lang.String r4 = r4.f794g
            r2.m4003c(r0, r4)
            int r4 = r3.f844k
            int r4 = r4 + 1
            int r4 = r4 % r1
            r3.f844k = r4
            return r0
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Too many pending Fragment activity results."
            r4.<init>(r0)
            goto L_0x0037
        L_0x0036:
            throw r4
        L_0x0037:
            goto L_0x0036
    }

    /* renamed from: i */
    private void m3171i() {
            r2 = this;
        L_0x0000:
            a.j.a.h r0 = r2.m3174e()
            androidx.lifecycle.e$b r1 = androidx.lifecycle.AbstractC0742e.EnumC0744b.f2809d
            boolean r0 = m3178a(r0, r1)
            if (r0 != 0) goto L_0x0000
            return
    }

    /* renamed from: a */
    final android.view.View m3176a(android.view.View r2, java.lang.String r3, android.content.Context r4, android.util.AttributeSet r5) {
            r1 = this;
            a.j.a.f r0 = r1.f837d
            android.view.View r2 = r0.m3159a(r2, r3, r4, r5)
            return r2
    }

    @Override // androidx.core.app.ActivityC0693c, androidx.lifecycle.AbstractC0746g
    /* renamed from: a */
    public androidx.lifecycle.AbstractC0742e mo1368a() {
            r1 = this;
            androidx.lifecycle.e r0 = super.mo1368a()
            return r0
    }

    /* renamed from: a */
    public void m3180a(p000a.p036j.p037a.ComponentCallbacksC0248c r1) {
            r0 = this;
            return
    }

    /* renamed from: a */
    public void m3179a(p000a.p036j.p037a.ComponentCallbacksC0248c r4, android.content.Intent r5, int r6, android.os.Bundle r7) {
            r3 = this;
            r0 = 1
            r3.f843j = r0
            r1 = -1
            r2 = 0
            if (r6 != r1) goto L_0x000d
            androidx.core.app.C0688a.m1635a(r3, r5, r1, r7)     // Catch: all -> 0x0022
            r3.f843j = r2
            return
        L_0x000d:
            m3181a(r6)     // Catch: all -> 0x0022
            int r4 = r3.m3175b(r4)     // Catch: all -> 0x0022
            int r4 = r4 + r0
            int r4 = r4 << 16
            r0 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r0
            int r4 = r4 + r6
            androidx.core.app.C0688a.m1635a(r3, r5, r4, r7)     // Catch: all -> 0x0022
            r3.f843j = r2
            return
        L_0x0022:
            r4 = move-exception
            r3.f843j = r2
            throw r4
    }

    /* renamed from: a */
    protected boolean m3177a(android.view.View r2, android.view.Menu r3) {
            r1 = this;
            r0 = 0
            boolean r2 = super.onPreparePanel(r0, r2, r3)
            return r2
    }

    @Override // androidx.lifecycle.AbstractC0762s
    /* renamed from: b */
    public androidx.lifecycle.C0761r mo1343b() {
            r2 = this;
            android.app.Application r0 = r2.getApplication()
            if (r0 == 0) goto L_0x0024
            androidx.lifecycle.r r0 = r2.f838e
            if (r0 != 0) goto L_0x0021
            java.lang.Object r0 = r2.getLastNonConfigurationInstance()
            a.j.a.d$c r0 = (p000a.p036j.p037a.ActivityC0255d.C0258c) r0
            if (r0 == 0) goto L_0x0016
            androidx.lifecycle.r r0 = r0.f848a
            r2.f838e = r0
        L_0x0016:
            androidx.lifecycle.r r0 = r2.f838e
            if (r0 != 0) goto L_0x0021
            androidx.lifecycle.r r0 = new androidx.lifecycle.r
            r0.<init>()
            r2.f838e = r0
        L_0x0021:
            androidx.lifecycle.r r0 = r2.f838e
            return r0
        L_0x0024:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call."
            r0.<init>(r1)
            throw r0
    }

    @Override // android.app.Activity
    public void dump(java.lang.String r3, java.io.FileDescriptor r4, java.io.PrintWriter r5, java.lang.String[] r6) {
            r2 = this;
            super.dump(r3, r4, r5, r6)
            r5.print(r3)
            java.lang.String r0 = "Local FragmentActivity "
            r5.print(r0)
            int r0 = java.lang.System.identityHashCode(r2)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " State:"
            r5.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.print(r0)
            java.lang.String r1 = "mCreated="
            r5.print(r1)
            boolean r1 = r2.f839f
            r5.print(r1)
            java.lang.String r1 = " mResumed="
            r5.print(r1)
            boolean r1 = r2.f840g
            r5.print(r1)
            java.lang.String r1 = " mStopped="
            r5.print(r1)
            boolean r1 = r2.f841h
            r5.print(r1)
            android.app.Application r1 = r2.getApplication()
            if (r1 == 0) goto L_0x005a
            a.l.a.a r1 = p000a.p041l.p042a.AbstractC0309a.m2949a(r2)
            r1.mo2947a(r0, r4, r5, r6)
        L_0x005a:
            a.j.a.f r0 = r2.f837d
            a.j.a.h r0 = r0.m3145j()
            r0.mo3077a(r3, r4, r5, r6)
            return
    }

    /* renamed from: e */
    public p000a.p036j.p037a.AbstractC0262h m3174e() {
            r1 = this;
            a.j.a.f r0 = r1.f837d
            a.j.a.h r0 = r0.m3145j()
            return r0
    }

    /* renamed from: f */
    protected void m3173f() {
            r1 = this;
            a.j.a.f r0 = r1.f837d
            r0.m3149f()
            return
    }

    /* renamed from: g */
    public java.lang.Object m3172g() {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    /* renamed from: h */
    public void mo2630h() {
            r0 = this;
            r0.invalidateOptionsMenu()
            return
    }

    @Override // android.app.Activity
    protected void onActivityResult(int r4, int r5, android.content.Intent r6) {
            r3 = this;
            a.j.a.f r0 = r3.f837d
            r0.m3144k()
            int r0 = r4 >> 16
            if (r0 == 0) goto L_0x0047
            int r0 = r0 + (-1)
            a.d.h<java.lang.String> r1 = r3.f845l
            java.lang.Object r1 = r1.m4007b(r0)
            java.lang.String r1 = (java.lang.String) r1
            a.d.h<java.lang.String> r2 = r3.f845l
            r2.m4001e(r0)
            java.lang.String r0 = "FragmentActivity"
            if (r1 != 0) goto L_0x0022
            java.lang.String r4 = "Activity result delivered for unknown Fragment."
            android.util.Log.w(r0, r4)
            return
        L_0x0022:
            a.j.a.f r2 = r3.f837d
            a.j.a.c r2 = r2.m3158a(r1)
            if (r2 != 0) goto L_0x003f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Activity result no fragment exists for who: "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            android.util.Log.w(r0, r4)
            goto L_0x0046
        L_0x003f:
            r0 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r0
            r2.m3257a(r4, r5, r6)
        L_0x0046:
            return
        L_0x0047:
            androidx.core.app.a$b r0 = androidx.core.app.C0688a.m1637a()
            if (r0 == 0) goto L_0x0054
            boolean r0 = r0.m1634a(r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0054
            return
        L_0x0054:
            super.onActivityResult(r4, r5, r6)
            return
    }

    @Override // android.app.Activity
    public void onBackPressed() {
            r4 = this;
            a.j.a.f r0 = r4.f837d
            a.j.a.h r0 = r0.m3145j()
            boolean r1 = r0.mo3055c()
            if (r1 == 0) goto L_0x0013
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 25
            if (r2 > r3) goto L_0x0013
            return
        L_0x0013:
            if (r1 != 0) goto L_0x001b
            boolean r0 = r0.mo3048d()
            if (r0 != 0) goto L_0x001e
        L_0x001b:
            super.onBackPressed()
        L_0x001e:
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            a.j.a.f r0 = r1.f837d
            r0.m3144k()
            a.j.a.f r0 = r1.f837d
            r0.m3164a(r2)
            return
    }

    @Override // androidx.core.app.ActivityC0693c, android.app.Activity
    protected void onCreate(android.os.Bundle r7) {
            r6 = this;
            a.j.a.f r0 = r6.f837d
            r1 = 0
            r0.m3166a(r1)
            super.onCreate(r7)
            java.lang.Object r0 = r6.getLastNonConfigurationInstance()
            a.j.a.d$c r0 = (p000a.p036j.p037a.ActivityC0255d.C0258c) r0
            if (r0 == 0) goto L_0x001b
            androidx.lifecycle.r r2 = r0.f848a
            if (r2 == 0) goto L_0x001b
            androidx.lifecycle.r r3 = r6.f838e
            if (r3 != 0) goto L_0x001b
            r6.f838e = r2
        L_0x001b:
            r2 = 0
            if (r7 == 0) goto L_0x006f
            java.lang.String r3 = "android:support:fragments"
            android.os.Parcelable r3 = r7.getParcelable(r3)
            a.j.a.f r4 = r6.f837d
            if (r0 == 0) goto L_0x002a
            a.j.a.j r1 = r0.f849b
        L_0x002a:
            r4.m3163a(r3, r1)
            java.lang.String r0 = "android:support:next_request_index"
            boolean r1 = r7.containsKey(r0)
            if (r1 == 0) goto L_0x006f
            int r0 = r7.getInt(r0)
            r6.f844k = r0
            java.lang.String r0 = "android:support:request_indicies"
            int[] r0 = r7.getIntArray(r0)
            java.lang.String r1 = "android:support:request_fragment_who"
            java.lang.String[] r7 = r7.getStringArray(r1)
            if (r0 == 0) goto L_0x0068
            if (r7 == 0) goto L_0x0068
            int r1 = r0.length
            int r3 = r7.length
            if (r1 == r3) goto L_0x0050
            goto L_0x0068
        L_0x0050:
            a.d.h r1 = new a.d.h
            int r3 = r0.length
            r1.<init>(r3)
            r6.f845l = r1
            r1 = 0
        L_0x0059:
            int r3 = r0.length
            if (r1 >= r3) goto L_0x006f
            a.d.h<java.lang.String> r3 = r6.f845l
            r4 = r0[r1]
            r5 = r7[r1]
            r3.m4003c(r4, r5)
            int r1 = r1 + 1
            goto L_0x0059
        L_0x0068:
            java.lang.String r7 = "FragmentActivity"
            java.lang.String r0 = "Invalid requestCode mapping in savedInstanceState."
            android.util.Log.w(r7, r0)
        L_0x006f:
            a.d.h<java.lang.String> r7 = r6.f845l
            if (r7 != 0) goto L_0x007c
            a.d.h r7 = new a.d.h
            r7.<init>()
            r6.f845l = r7
            r6.f844k = r2
        L_0x007c:
            a.j.a.f r7 = r6.f837d
            r7.m3156b()
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int r3, android.view.Menu r4) {
            r2 = this;
            if (r3 != 0) goto L_0x0012
            boolean r3 = super.onCreatePanelMenu(r3, r4)
            a.j.a.f r0 = r2.f837d
            android.view.MenuInflater r1 = r2.getMenuInflater()
            boolean r4 = r0.m3161a(r4, r1)
            r3 = r3 | r4
            return r3
        L_0x0012:
            boolean r3 = super.onCreatePanelMenu(r3, r4)
            return r3
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public android.view.View onCreateView(android.view.View r2, java.lang.String r3, android.content.Context r4, android.util.AttributeSet r5) {
            r1 = this;
            android.view.View r0 = r1.m3176a(r2, r3, r4, r5)
            if (r0 != 0) goto L_0x000b
            android.view.View r2 = super.onCreateView(r2, r3, r4, r5)
            return r2
        L_0x000b:
            return r0
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            android.view.View r0 = r1.m3176a(r0, r2, r3, r4)
            if (r0 != 0) goto L_0x000c
            android.view.View r2 = super.onCreateView(r2, r3, r4)
            return r2
        L_0x000c:
            return r0
    }

    @Override // android.app.Activity
    protected void onDestroy() {
            r1 = this;
            super.onDestroy()
            androidx.lifecycle.r r0 = r1.f838e
            if (r0 == 0) goto L_0x0012
            boolean r0 = r1.isChangingConfigurations()
            if (r0 != 0) goto L_0x0012
            androidx.lifecycle.r r0 = r1.f838e
            r0.m1346a()
        L_0x0012:
            a.j.a.f r0 = r1.f837d
            r0.m3152c()
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
            r1 = this;
            super.onLowMemory()
            a.j.a.f r0 = r1.f837d
            r0.m3151d()
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r2, android.view.MenuItem r3) {
            r1 = this;
            boolean r0 = super.onMenuItemSelected(r2, r3)
            if (r0 == 0) goto L_0x0008
            r2 = 1
            return r2
        L_0x0008:
            if (r2 == 0) goto L_0x0016
            r0 = 6
            if (r2 == r0) goto L_0x000f
            r2 = 0
            return r2
        L_0x000f:
            a.j.a.f r2 = r1.f837d
            boolean r2 = r2.m3160a(r3)
            return r2
        L_0x0016:
            a.j.a.f r2 = r1.f837d
            boolean r2 = r2.m3154b(r3)
            return r2
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean r2) {
            r1 = this;
            a.j.a.f r0 = r1.f837d
            r0.m3157a(r2)
            return
    }

    @Override // android.app.Activity
    protected void onNewIntent(android.content.Intent r1) {
            r0 = this;
            super.onNewIntent(r1)
            a.j.a.f r1 = r0.f837d
            r1.m3144k()
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int r2, android.view.Menu r3) {
            r1 = this;
            if (r2 == 0) goto L_0x0003
            goto L_0x0008
        L_0x0003:
            a.j.a.f r0 = r1.f837d
            r0.m3162a(r3)
        L_0x0008:
            super.onPanelClosed(r2, r3)
            return
    }

    @Override // android.app.Activity
    protected void onPause() {
            r2 = this;
            super.onPause()
            r0 = 0
            r2.f840g = r0
            android.os.Handler r0 = r2.f836c
            r1 = 2
            boolean r0 = r0.hasMessages(r1)
            if (r0 == 0) goto L_0x0017
            android.os.Handler r0 = r2.f836c
            r0.removeMessages(r1)
            r2.m3173f()
        L_0x0017:
            a.j.a.f r0 = r2.f837d
            r0.m3150e()
            return
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean r2) {
            r1 = this;
            a.j.a.f r0 = r1.f837d
            r0.m3153b(r2)
            return
    }

    @Override // android.app.Activity
    protected void onPostResume() {
            r2 = this;
            super.onPostResume()
            android.os.Handler r0 = r2.f836c
            r1 = 2
            r0.removeMessages(r1)
            r2.m3173f()
            a.j.a.f r0 = r2.f837d
            r0.m3146i()
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int r1, android.view.View r2, android.view.Menu r3) {
            r0 = this;
            if (r1 != 0) goto L_0x0010
            if (r3 == 0) goto L_0x0010
            boolean r1 = r0.m3177a(r2, r3)
            a.j.a.f r2 = r0.f837d
            boolean r2 = r2.m3155b(r3)
            r1 = r1 | r2
            return r1
        L_0x0010:
            boolean r1 = super.onPreparePanel(r1, r2, r3)
            return r1
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int r5, java.lang.String[] r6, int[] r7) {
            r4 = this;
            a.j.a.f r0 = r4.f837d
            r0.m3144k()
            int r0 = r5 >> 16
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0047
            int r0 = r0 + (-1)
            a.d.h<java.lang.String> r2 = r4.f845l
            java.lang.Object r2 = r2.m4007b(r0)
            java.lang.String r2 = (java.lang.String) r2
            a.d.h<java.lang.String> r3 = r4.f845l
            r3.m4001e(r0)
            java.lang.String r0 = "FragmentActivity"
            if (r2 != 0) goto L_0x0026
            java.lang.String r5 = "Activity result delivered for unknown Fragment."
            android.util.Log.w(r0, r5)
            return
        L_0x0026:
            a.j.a.f r3 = r4.f837d
            a.j.a.c r3 = r3.m3158a(r2)
            if (r3 != 0) goto L_0x0043
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Activity result no fragment exists for who: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            android.util.Log.w(r0, r5)
            goto L_0x0047
        L_0x0043:
            r5 = r5 & r1
            r3.m3254a(r5, r6, r7)
        L_0x0047:
            return
    }

    @Override // android.app.Activity
    protected void onResume() {
            r2 = this;
            super.onResume()
            android.os.Handler r0 = r2.f836c
            r1 = 2
            r0.sendEmptyMessage(r1)
            r0 = 1
            r2.f840g = r0
            a.j.a.f r0 = r2.f837d
            r0.m3146i()
            return
    }

    @Override // android.app.Activity
    public final java.lang.Object onRetainNonConfigurationInstance() {
            r3 = this;
            java.lang.Object r0 = r3.m3172g()
            a.j.a.f r1 = r3.f837d
            a.j.a.j r1 = r1.m3143l()
            if (r1 != 0) goto L_0x0014
            androidx.lifecycle.r r2 = r3.f838e
            if (r2 != 0) goto L_0x0014
            if (r0 != 0) goto L_0x0014
            r0 = 0
            return r0
        L_0x0014:
            a.j.a.d$c r0 = new a.j.a.d$c
            r0.<init>()
            androidx.lifecycle.r r2 = r3.f838e
            r0.f848a = r2
            r0.f849b = r1
            return r0
    }

    @Override // androidx.core.app.ActivityC0693c, android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle r5) {
            r4 = this;
            super.onSaveInstanceState(r5)
            r4.m3171i()
            a.j.a.f r0 = r4.f837d
            android.os.Parcelable r0 = r0.m3142m()
            if (r0 == 0) goto L_0x0013
            java.lang.String r1 = "android:support:fragments"
            r5.putParcelable(r1, r0)
        L_0x0013:
            a.d.h<java.lang.String> r0 = r4.f845l
            int r0 = r0.m4008b()
            if (r0 <= 0) goto L_0x005a
            int r0 = r4.f844k
            java.lang.String r1 = "android:support:next_request_index"
            r5.putInt(r1, r0)
            a.d.h<java.lang.String> r0 = r4.f845l
            int r0 = r0.m4008b()
            int[] r0 = new int[r0]
            a.d.h<java.lang.String> r1 = r4.f845l
            int r1 = r1.m4008b()
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
        L_0x0033:
            a.d.h<java.lang.String> r3 = r4.f845l
            int r3 = r3.m4008b()
            if (r2 >= r3) goto L_0x0050
            a.d.h<java.lang.String> r3 = r4.f845l
            int r3 = r3.m4002d(r2)
            r0[r2] = r3
            a.d.h<java.lang.String> r3 = r4.f845l
            java.lang.Object r3 = r3.m4000f(r2)
            java.lang.String r3 = (java.lang.String) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L_0x0033
        L_0x0050:
            java.lang.String r2 = "android:support:request_indicies"
            r5.putIntArray(r2, r0)
            java.lang.String r0 = "android:support:request_fragment_who"
            r5.putStringArray(r0, r1)
        L_0x005a:
            return
    }

    @Override // android.app.Activity
    protected void onStart() {
            r1 = this;
            super.onStart()
            r0 = 0
            r1.f841h = r0
            boolean r0 = r1.f839f
            if (r0 != 0) goto L_0x0012
            r0 = 1
            r1.f839f = r0
            a.j.a.f r0 = r1.f837d
            r0.m3167a()
        L_0x0012:
            a.j.a.f r0 = r1.f837d
            r0.m3144k()
            a.j.a.f r0 = r1.f837d
            r0.m3146i()
            a.j.a.f r0 = r1.f837d
            r0.m3148g()
            return
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
            r1 = this;
            a.j.a.f r0 = r1.f837d
            r0.m3144k()
            return
    }

    @Override // android.app.Activity
    protected void onStop() {
            r1 = this;
            super.onStop()
            r0 = 1
            r1.f841h = r0
            r1.m3171i()
            a.j.a.f r0 = r1.f837d
            r0.m3147h()
            return
    }

    @Override // android.app.Activity
    public void startActivityForResult(android.content.Intent r2, int r3) {
            r1 = this;
            boolean r0 = r1.f843j
            if (r0 != 0) goto L_0x000a
            r0 = -1
            if (r3 == r0) goto L_0x000a
            m3181a(r3)
        L_0x000a:
            super.startActivityForResult(r2, r3)
            return
    }

    @Override // android.app.Activity
    public void startActivityForResult(android.content.Intent r2, int r3, android.os.Bundle r4) {
            r1 = this;
            boolean r0 = r1.f843j
            if (r0 != 0) goto L_0x000a
            r0 = -1
            if (r3 == r0) goto L_0x000a
            m3181a(r3)
        L_0x000a:
            super.startActivityForResult(r2, r3, r4)
            return
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(android.content.IntentSender r2, int r3, android.content.Intent r4, int r5, int r6, int r7) {
            r1 = this;
            boolean r0 = r1.f842i
            if (r0 != 0) goto L_0x000a
            r0 = -1
            if (r3 == r0) goto L_0x000a
            m3181a(r3)
        L_0x000a:
            super.startIntentSenderForResult(r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(android.content.IntentSender r2, int r3, android.content.Intent r4, int r5, int r6, int r7, android.os.Bundle r8) {
            r1 = this;
            boolean r0 = r1.f842i
            if (r0 != 0) goto L_0x000a
            r0 = -1
            if (r3 == r0) goto L_0x000a
            m3181a(r3)
        L_0x000a:
            super.startIntentSenderForResult(r2, r3, r4, r5, r6, r7, r8)
            return
    }
}
