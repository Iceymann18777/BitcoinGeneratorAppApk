package p000a.p036j.p037a;

/* renamed from: a.j.a.c */
/* loaded from: classes.dex */
public class ComponentCallbacksC0248c implements android.content.ComponentCallbacks, android.view.View.OnCreateContextMenuListener, androidx.lifecycle.AbstractC0746g, androidx.lifecycle.AbstractC0762s {

    /* renamed from: X */
    private static final p000a.p013d.C0080g<java.lang.String, java.lang.Class<?>> f764X = null;

    /* renamed from: Y */
    static final java.lang.Object f765Y = null;

    /* renamed from: A */
    java.lang.String f766A;

    /* renamed from: B */
    boolean f767B;

    /* renamed from: C */
    boolean f768C;

    /* renamed from: D */
    boolean f769D;

    /* renamed from: E */
    boolean f770E;

    /* renamed from: F */
    boolean f771F;

    /* renamed from: G */
    boolean f772G;

    /* renamed from: H */
    boolean f773H;

    /* renamed from: I */
    android.view.ViewGroup f774I;

    /* renamed from: J */
    android.view.View f775J;

    /* renamed from: K */
    android.view.View f776K;

    /* renamed from: L */
    boolean f777L;

    /* renamed from: M */
    boolean f778M;

    /* renamed from: N */
    p000a.p036j.p037a.ComponentCallbacksC0248c.C0252d f779N;

    /* renamed from: O */
    boolean f780O;

    /* renamed from: P */
    boolean f781P;

    /* renamed from: Q */
    float f782Q;

    /* renamed from: R */
    android.view.LayoutInflater f783R;

    /* renamed from: S */
    boolean f784S;

    /* renamed from: T */
    androidx.lifecycle.C0747h f785T;

    /* renamed from: U */
    androidx.lifecycle.C0747h f786U;

    /* renamed from: V */
    androidx.lifecycle.AbstractC0746g f787V;

    /* renamed from: W */
    androidx.lifecycle.C0753l<androidx.lifecycle.AbstractC0746g> f788W;

    /* renamed from: b */
    int f789b;

    /* renamed from: c */
    android.os.Bundle f790c;

    /* renamed from: d */
    android.util.SparseArray<android.os.Parcelable> f791d;

    /* renamed from: e */
    java.lang.Boolean f792e;

    /* renamed from: f */
    int f793f;

    /* renamed from: g */
    java.lang.String f794g;

    /* renamed from: h */
    android.os.Bundle f795h;

    /* renamed from: i */
    p000a.p036j.p037a.ComponentCallbacksC0248c f796i;

    /* renamed from: j */
    int f797j;

    /* renamed from: k */
    int f798k;

    /* renamed from: l */
    boolean f799l;

    /* renamed from: m */
    boolean f800m;

    /* renamed from: n */
    boolean f801n;

    /* renamed from: o */
    boolean f802o;

    /* renamed from: p */
    boolean f803p;

    /* renamed from: q */
    boolean f804q;

    /* renamed from: r */
    int f805r;

    /* renamed from: s */
    p000a.p036j.p037a.LayoutInflater$Factory2C0266i f806s;

    /* renamed from: t */
    p000a.p036j.p037a.AbstractC0261g f807t;

    /* renamed from: u */
    p000a.p036j.p037a.LayoutInflater$Factory2C0266i f808u;

    /* renamed from: v */
    p000a.p036j.p037a.C0282j f809v;

    /* renamed from: w */
    androidx.lifecycle.C0761r f810w;

    /* renamed from: x */
    p000a.p036j.p037a.ComponentCallbacksC0248c f811x;

    /* renamed from: y */
    int f812y;

    /* renamed from: z */
    int f813z;

    /* renamed from: a.j.a.c$a */
    /* loaded from: classes.dex */
    class RunnableC0249a implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ p000a.p036j.p037a.ComponentCallbacksC0248c f814b;

        RunnableC0249a(p000a.p036j.p037a.ComponentCallbacksC0248c r1) {
                r0 = this;
                r0.f814b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                a.j.a.c r0 = r1.f814b
                r0.m3224c()
                return
        }
    }

    /* renamed from: a.j.a.c$b */
    /* loaded from: classes.dex */
    class C0250b extends p000a.p036j.p037a.AbstractC0259e {

        /* renamed from: a */
        final /* synthetic */ p000a.p036j.p037a.ComponentCallbacksC0248c f815a;

        C0250b(p000a.p036j.p037a.ComponentCallbacksC0248c r1) {
                r0 = this;
                r0.f815a = r1
                r0.<init>()
                return
        }

        @Override // p000a.p036j.p037a.AbstractC0259e
        /* renamed from: a */
        public p000a.p036j.p037a.ComponentCallbacksC0248c mo3168a(android.content.Context r2, java.lang.String r3, android.os.Bundle r4) {
                r1 = this;
                a.j.a.c r0 = r1.f815a
                a.j.a.g r0 = r0.f807t
                a.j.a.c r2 = r0.mo3168a(r2, r3, r4)
                return r2
        }

        @Override // p000a.p036j.p037a.AbstractC0259e
        /* renamed from: a */
        public android.view.View mo3169a(int r2) {
                r1 = this;
                a.j.a.c r0 = r1.f815a
                android.view.View r0 = r0.f775J
                if (r0 == 0) goto L_0x000b
                android.view.View r2 = r0.findViewById(r2)
                return r2
            L_0x000b:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Fragment does not have a view"
                r2.<init>(r0)
                throw r2
        }

        @Override // p000a.p036j.p037a.AbstractC0259e
        /* renamed from: a */
        public boolean mo3170a() {
                r1 = this;
                a.j.a.c r0 = r1.f815a
                android.view.View r0 = r0.f775J
                if (r0 == 0) goto L_0x0008
                r0 = 1
                goto L_0x0009
            L_0x0008:
                r0 = 0
            L_0x0009:
                return r0
        }
    }

    /* renamed from: a.j.a.c$c */
    /* loaded from: classes.dex */
    class C0251c implements androidx.lifecycle.AbstractC0746g {

        /* renamed from: b */
        final /* synthetic */ p000a.p036j.p037a.ComponentCallbacksC0248c f816b;

        C0251c(p000a.p036j.p037a.ComponentCallbacksC0248c r1) {
                r0 = this;
                r0.f816b = r1
                r0.<init>()
                return
        }

        @Override // androidx.lifecycle.AbstractC0746g
        /* renamed from: a */
        public androidx.lifecycle.AbstractC0742e mo1368a() {
                r3 = this;
                a.j.a.c r0 = r3.f816b
                androidx.lifecycle.h r1 = r0.f786U
                if (r1 != 0) goto L_0x000f
                androidx.lifecycle.h r1 = new androidx.lifecycle.h
                androidx.lifecycle.g r2 = r0.f787V
                r1.<init>(r2)
                r0.f786U = r1
            L_0x000f:
                a.j.a.c r0 = r3.f816b
                androidx.lifecycle.h r0 = r0.f786U
                return r0
        }
    }

    /* renamed from: a.j.a.c$d */
    /* loaded from: classes.dex */
    static class C0252d {

        /* renamed from: a */
        android.view.View f817a;

        /* renamed from: b */
        android.animation.Animator f818b;

        /* renamed from: c */
        int f819c;

        /* renamed from: d */
        int f820d;

        /* renamed from: e */
        int f821e;

        /* renamed from: f */
        int f822f;

        /* renamed from: g */
        java.lang.Object f823g;

        /* renamed from: h */
        java.lang.Object f824h;

        /* renamed from: i */
        java.lang.Object f825i;

        /* renamed from: j */
        java.lang.Object f826j;

        /* renamed from: k */
        java.lang.Object f827k;

        /* renamed from: l */
        java.lang.Object f828l;

        /* renamed from: m */
        java.lang.Boolean f829m;

        /* renamed from: n */
        java.lang.Boolean f830n;

        /* renamed from: o */
        androidx.core.app.AbstractC0695e f831o;

        /* renamed from: p */
        androidx.core.app.AbstractC0695e f832p;

        /* renamed from: q */
        boolean f833q;

        /* renamed from: r */
        p000a.p036j.p037a.ComponentCallbacksC0248c.AbstractC0254f f834r;

        /* renamed from: s */
        boolean f835s;

        C0252d() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.f823g = r0
                java.lang.Object r1 = p000a.p036j.p037a.ComponentCallbacksC0248c.f765Y
                r2.f824h = r1
                r2.f825i = r0
                r2.f826j = r1
                r2.f827k = r0
                r2.f828l = r1
                r2.f831o = r0
                r2.f832p = r0
                return
        }
    }

    /* renamed from: a.j.a.c$e */
    /* loaded from: classes.dex */
    public static class C0253e extends java.lang.RuntimeException {
        public C0253e(java.lang.String r1, java.lang.Exception r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    /* renamed from: a.j.a.c$f */
    /* loaded from: classes.dex */
    interface AbstractC0254f {
        /* renamed from: a */
        void mo3003a();

        /* renamed from: b */
        void mo3002b();
    }

    static {
            a.d.g r0 = new a.d.g
            r0.<init>()
            p000a.p036j.p037a.ComponentCallbacksC0248c.f764X = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000a.p036j.p037a.ComponentCallbacksC0248c.f765Y = r0
            return
    }

    public ComponentCallbacksC0248c() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f789b = r0
            r0 = -1
            r1.f793f = r0
            r1.f797j = r0
            r0 = 1
            r1.f772G = r0
            r1.f778M = r0
            androidx.lifecycle.h r0 = new androidx.lifecycle.h
            r0.<init>(r1)
            r1.f785T = r0
            androidx.lifecycle.l r0 = new androidx.lifecycle.l
            r0.<init>()
            r1.f788W = r0
            return
    }

    /* renamed from: Z */
    private p000a.p036j.p037a.ComponentCallbacksC0248c.C0252d m3260Z() {
            r1 = this;
            a.j.a.c$d r0 = r1.f779N
            if (r0 != 0) goto L_0x000b
            a.j.a.c$d r0 = new a.j.a.c$d
            r0.<init>()
            r1.f779N = r0
        L_0x000b:
            a.j.a.c$d r0 = r1.f779N
            return r0
    }

    /* renamed from: a */
    public static p000a.p036j.p037a.ComponentCallbacksC0248c m3245a(android.content.Context r5, java.lang.String r6, android.os.Bundle r7) {
            java.lang.String r0 = " empty constructor that is public"
            java.lang.String r1 = ": make sure class name exists, is public, and has an"
            java.lang.String r2 = "Unable to instantiate fragment "
            a.d.g<java.lang.String, java.lang.Class<?>> r3 = p000a.p036j.p037a.ComponentCallbacksC0248c.f764X     // Catch: InvocationTargetException -> 0x003d, NoSuchMethodException -> 0x0058, IllegalAccessException -> 0x0073, InstantiationException -> 0x008f, ClassNotFoundException -> 0x00ab
            java.lang.Object r3 = r3.get(r6)     // Catch: InvocationTargetException -> 0x003d, NoSuchMethodException -> 0x0058, IllegalAccessException -> 0x0073, InstantiationException -> 0x008f, ClassNotFoundException -> 0x00ab
            java.lang.Class r3 = (java.lang.Class) r3     // Catch: InvocationTargetException -> 0x003d, NoSuchMethodException -> 0x0058, IllegalAccessException -> 0x0073, InstantiationException -> 0x008f, ClassNotFoundException -> 0x00ab
            if (r3 != 0) goto L_0x001d
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: InvocationTargetException -> 0x003d, NoSuchMethodException -> 0x0058, IllegalAccessException -> 0x0073, InstantiationException -> 0x008f, ClassNotFoundException -> 0x00ab
            java.lang.Class r3 = r5.loadClass(r6)     // Catch: InvocationTargetException -> 0x003d, NoSuchMethodException -> 0x0058, IllegalAccessException -> 0x0073, InstantiationException -> 0x008f, ClassNotFoundException -> 0x00ab
            a.d.g<java.lang.String, java.lang.Class<?>> r5 = p000a.p036j.p037a.ComponentCallbacksC0248c.f764X     // Catch: InvocationTargetException -> 0x003d, NoSuchMethodException -> 0x0058, IllegalAccessException -> 0x0073, InstantiationException -> 0x008f, ClassNotFoundException -> 0x00ab
            r5.put(r6, r3)     // Catch: InvocationTargetException -> 0x003d, NoSuchMethodException -> 0x0058, IllegalAccessException -> 0x0073, InstantiationException -> 0x008f, ClassNotFoundException -> 0x00ab
        L_0x001d:
            r5 = 0
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch: InvocationTargetException -> 0x003d, NoSuchMethodException -> 0x0058, IllegalAccessException -> 0x0073, InstantiationException -> 0x008f, ClassNotFoundException -> 0x00ab
            java.lang.reflect.Constructor r3 = r3.getConstructor(r4)     // Catch: InvocationTargetException -> 0x003d, NoSuchMethodException -> 0x0058, IllegalAccessException -> 0x0073, InstantiationException -> 0x008f, ClassNotFoundException -> 0x00ab
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: InvocationTargetException -> 0x003d, NoSuchMethodException -> 0x0058, IllegalAccessException -> 0x0073, InstantiationException -> 0x008f, ClassNotFoundException -> 0x00ab
            java.lang.Object r5 = r3.newInstance(r5)     // Catch: InvocationTargetException -> 0x003d, NoSuchMethodException -> 0x0058, IllegalAccessException -> 0x0073, InstantiationException -> 0x008f, ClassNotFoundException -> 0x00ab
            a.j.a.c r5 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r5     // Catch: InvocationTargetException -> 0x003d, NoSuchMethodException -> 0x0058, IllegalAccessException -> 0x0073, InstantiationException -> 0x008f, ClassNotFoundException -> 0x00ab
            if (r7 == 0) goto L_0x003c
            java.lang.Class r3 = r5.getClass()     // Catch: InvocationTargetException -> 0x003d, NoSuchMethodException -> 0x0058, IllegalAccessException -> 0x0073, InstantiationException -> 0x008f, ClassNotFoundException -> 0x00ab
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: InvocationTargetException -> 0x003d, NoSuchMethodException -> 0x0058, IllegalAccessException -> 0x0073, InstantiationException -> 0x008f, ClassNotFoundException -> 0x00ab
            r7.setClassLoader(r3)     // Catch: InvocationTargetException -> 0x003d, NoSuchMethodException -> 0x0058, IllegalAccessException -> 0x0073, InstantiationException -> 0x008f, ClassNotFoundException -> 0x00ab
            r5.m3195m(r7)     // Catch: InvocationTargetException -> 0x003d, NoSuchMethodException -> 0x0058, IllegalAccessException -> 0x0073, InstantiationException -> 0x008f, ClassNotFoundException -> 0x00ab
        L_0x003c:
            return r5
        L_0x003d:
            r5 = move-exception
            a.j.a.c$e r7 = new a.j.a.c$e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r6)
            java.lang.String r6 = ": calling Fragment constructor caused an exception"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6, r5)
            throw r7
        L_0x0058:
            r5 = move-exception
            a.j.a.c$e r7 = new a.j.a.c$e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r6)
            java.lang.String r6 = ": could not find Fragment constructor"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6, r5)
            throw r7
        L_0x0073:
            r5 = move-exception
            a.j.a.c$e r7 = new a.j.a.c$e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r6)
            r3.append(r1)
            r3.append(r0)
            java.lang.String r6 = r3.toString()
            r7.<init>(r6, r5)
            throw r7
        L_0x008f:
            r5 = move-exception
            a.j.a.c$e r7 = new a.j.a.c$e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r6)
            r3.append(r1)
            r3.append(r0)
            java.lang.String r6 = r3.toString()
            r7.<init>(r6, r5)
            throw r7
        L_0x00ab:
            r5 = move-exception
            a.j.a.c$e r7 = new a.j.a.c$e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r6)
            r3.append(r1)
            r3.append(r0)
            java.lang.String r6 = r3.toString()
            r7.<init>(r6, r5)
            throw r7
    }

    /* renamed from: a */
    static boolean m3246a(android.content.Context r1, java.lang.String r2) {
            a.d.g<java.lang.String, java.lang.Class<?>> r0 = p000a.p036j.p037a.ComponentCallbacksC0248c.f764X     // Catch: ClassNotFoundException -> 0x001e
            java.lang.Object r0 = r0.get(r2)     // Catch: ClassNotFoundException -> 0x001e
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: ClassNotFoundException -> 0x001e
            if (r0 != 0) goto L_0x0017
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: ClassNotFoundException -> 0x001e
            java.lang.Class r0 = r1.loadClass(r2)     // Catch: ClassNotFoundException -> 0x001e
            a.d.g<java.lang.String, java.lang.Class<?>> r1 = p000a.p036j.p037a.ComponentCallbacksC0248c.f764X     // Catch: ClassNotFoundException -> 0x001e
            r1.put(r2, r0)     // Catch: ClassNotFoundException -> 0x001e
        L_0x0017:
            java.lang.Class<a.j.a.c> r1 = p000a.p036j.p037a.ComponentCallbacksC0248c.class
            boolean r1 = r1.isAssignableFrom(r0)     // Catch: ClassNotFoundException -> 0x001e
            return r1
        L_0x001e:
            r1 = 0
            return r1
    }

    /* renamed from: A */
    void m3284A() {
            r3 = this;
            a.j.a.g r0 = r3.f807t
            if (r0 == 0) goto L_0x0018
            a.j.a.i r0 = new a.j.a.i
            r0.<init>()
            r3.f808u = r0
            a.j.a.i r0 = r3.f808u
            a.j.a.g r1 = r3.f807t
            a.j.a.c$b r2 = new a.j.a.c$b
            r2.<init>(r3)
            r0.m3096a(r1, r2, r3)
            return
        L_0x0018:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fragment has not been attached yet."
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: B */
    boolean m3283B() {
            r1 = this;
            a.j.a.c$d r0 = r1.f779N
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            boolean r0 = r0.f835s
            return r0
    }

    /* renamed from: C */
    final boolean m3282C() {
            r1 = this;
            int r0 = r1.f805r
            if (r0 <= 0) goto L_0x0006
            r0 = 1
            goto L_0x0007
        L_0x0006:
            r0 = 0
        L_0x0007:
            return r0
    }

    /* renamed from: D */
    boolean m3281D() {
            r1 = this;
            a.j.a.c$d r0 = r1.f779N
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            boolean r0 = r0.f833q
            return r0
    }

    /* renamed from: E */
    public final boolean m3280E() {
            r1 = this;
            a.j.a.i r0 = r1.f806s
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            boolean r0 = r0.mo3055c()
            return r0
    }

    /* renamed from: F */
    void m3279F() {
            r1 = this;
            a.j.a.i r0 = r1.f808u
            if (r0 == 0) goto L_0x0007
            r0.m3013r()
        L_0x0007:
            return
    }

    /* renamed from: G */
    public void mo13G() {
            r2 = this;
            r0 = 1
            r2.f773H = r0
            a.j.a.d r1 = r2.m3219d()
            if (r1 == 0) goto L_0x0010
            boolean r1 = r1.isChangingConfigurations()
            if (r1 == 0) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            androidx.lifecycle.r r1 = r2.f810w
            if (r1 == 0) goto L_0x001a
            if (r0 != 0) goto L_0x001a
            r1.m1346a()
        L_0x001a:
            return
    }

    /* renamed from: H */
    public void m3278H() {
            r0 = this;
            return
    }

    /* renamed from: I */
    public void m3277I() {
            r1 = this;
            r0 = 1
            r1.f773H = r0
            return
    }

    /* renamed from: J */
    public void m3276J() {
            r1 = this;
            r0 = 1
            r1.f773H = r0
            return
    }

    /* renamed from: K */
    public void m3275K() {
            r1 = this;
            r0 = 1
            r1.f773H = r0
            return
    }

    /* renamed from: L */
    public void m3274L() {
            r1 = this;
            r0 = 1
            r1.f773H = r0
            return
    }

    /* renamed from: M */
    public void m3273M() {
            r1 = this;
            r0 = 1
            r1.f773H = r0
            return
    }

    /* renamed from: N */
    public void m3272N() {
            r1 = this;
            r0 = 1
            r1.f773H = r0
            return
    }

    /* renamed from: O */
    p000a.p036j.p037a.AbstractC0262h m3271O() {
            r1 = this;
            a.j.a.i r0 = r1.f808u
            return r0
    }

    /* renamed from: P */
    void m3270P() {
            r3 = this;
            androidx.lifecycle.h r0 = r3.f785T
            androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_DESTROY
            r0.m1385a(r1)
            a.j.a.i r0 = r3.f808u
            if (r0 == 0) goto L_0x000e
            r0.m3036g()
        L_0x000e:
            r0 = 0
            r3.f789b = r0
            r3.f773H = r0
            r3.f784S = r0
            r3.mo13G()
            boolean r0 = r3.f773H
            if (r0 == 0) goto L_0x0020
            r0 = 0
            r3.f808u = r0
            return
        L_0x0020:
            a.j.a.r r0 = new a.j.a.r
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " did not call through to super.onDestroy()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: Q */
    void m3269Q() {
            r3 = this;
            android.view.View r0 = r3.f775J
            if (r0 == 0) goto L_0x000b
            androidx.lifecycle.h r0 = r3.f786U
            androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_DESTROY
            r0.m1385a(r1)
        L_0x000b:
            a.j.a.i r0 = r3.f808u
            if (r0 == 0) goto L_0x0012
            r0.m3033h()
        L_0x0012:
            r0 = 1
            r3.f789b = r0
            r0 = 0
            r3.f773H = r0
            r3.m3277I()
            boolean r1 = r3.f773H
            if (r1 == 0) goto L_0x0029
            a.l.a.a r1 = p000a.p041l.p042a.AbstractC0309a.m2949a(r3)
            r1.mo2948a()
            r3.f804q = r0
            return
        L_0x0029:
            a.j.a.r r0 = new a.j.a.r
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " did not call through to super.onDestroyView()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: R */
    void m3268R() {
            r3 = this;
            r0 = 0
            r3.f773H = r0
            r3.m3276J()
            r0 = 0
            r3.f783R = r0
            boolean r1 = r3.f773H
            if (r1 == 0) goto L_0x003d
            a.j.a.i r1 = r3.f808u
            if (r1 == 0) goto L_0x003c
            boolean r2 = r3.f770E
            if (r2 == 0) goto L_0x001b
            r1.m3036g()
            r3.f808u = r0
            goto L_0x003c
        L_0x001b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Child FragmentManager of "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " was not "
            r1.append(r2)
            java.lang.String r2 = " destroyed and this fragment is not retaining instance"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x003c:
            return
        L_0x003d:
            a.j.a.r r0 = new a.j.a.r
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " did not call through to super.onDetach()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: S */
    void m3267S() {
            r1 = this;
            r1.onLowMemory()
            a.j.a.i r0 = r1.f808u
            if (r0 == 0) goto L_0x000a
            r0.m3030i()
        L_0x000a:
            return
    }

    /* renamed from: T */
    void m3266T() {
            r3 = this;
            android.view.View r0 = r3.f775J
            if (r0 == 0) goto L_0x000b
            androidx.lifecycle.h r0 = r3.f786U
            androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_PAUSE
            r0.m1385a(r1)
        L_0x000b:
            androidx.lifecycle.h r0 = r3.f785T
            androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_PAUSE
            r0.m1385a(r1)
            a.j.a.i r0 = r3.f808u
            if (r0 == 0) goto L_0x0019
            r0.m3028j()
        L_0x0019:
            r0 = 3
            r3.f789b = r0
            r0 = 0
            r3.f773H = r0
            r3.m3275K()
            boolean r0 = r3.f773H
            if (r0 == 0) goto L_0x0027
            return
        L_0x0027:
            a.j.a.r r0 = new a.j.a.r
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " did not call through to super.onPause()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: U */
    void m3265U() {
            r3 = this;
            a.j.a.i r0 = r3.f808u
            if (r0 == 0) goto L_0x000c
            r0.m3013r()
            a.j.a.i r0 = r3.f808u
            r0.m3018o()
        L_0x000c:
            r0 = 4
            r3.f789b = r0
            r0 = 0
            r3.f773H = r0
            r3.m3274L()
            boolean r0 = r3.f773H
            if (r0 == 0) goto L_0x0038
            a.j.a.i r0 = r3.f808u
            if (r0 == 0) goto L_0x0025
            r0.m3026k()
            a.j.a.i r0 = r3.f808u
            r0.m3018o()
        L_0x0025:
            androidx.lifecycle.h r0 = r3.f785T
            androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_RESUME
            r0.m1385a(r1)
            android.view.View r0 = r3.f775J
            if (r0 == 0) goto L_0x0037
            androidx.lifecycle.h r0 = r3.f786U
            androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_RESUME
            r0.m1385a(r1)
        L_0x0037:
            return
        L_0x0038:
            a.j.a.r r0 = new a.j.a.r
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " did not call through to super.onResume()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: V */
    void m3264V() {
            r3 = this;
            a.j.a.i r0 = r3.f808u
            if (r0 == 0) goto L_0x000c
            r0.m3013r()
            a.j.a.i r0 = r3.f808u
            r0.m3018o()
        L_0x000c:
            r0 = 3
            r3.f789b = r0
            r0 = 0
            r3.f773H = r0
            r3.m3273M()
            boolean r0 = r3.f773H
            if (r0 == 0) goto L_0x0033
            a.j.a.i r0 = r3.f808u
            if (r0 == 0) goto L_0x0020
            r0.m3024l()
        L_0x0020:
            androidx.lifecycle.h r0 = r3.f785T
            androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_START
            r0.m1385a(r1)
            android.view.View r0 = r3.f775J
            if (r0 == 0) goto L_0x0032
            androidx.lifecycle.h r0 = r3.f786U
            androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_START
            r0.m1385a(r1)
        L_0x0032:
            return
        L_0x0033:
            a.j.a.r r0 = new a.j.a.r
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " did not call through to super.onStart()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: W */
    void m3263W() {
            r3 = this;
            android.view.View r0 = r3.f775J
            if (r0 == 0) goto L_0x000b
            androidx.lifecycle.h r0 = r3.f786U
            androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_STOP
            r0.m1385a(r1)
        L_0x000b:
            androidx.lifecycle.h r0 = r3.f785T
            androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_STOP
            r0.m1385a(r1)
            a.j.a.i r0 = r3.f808u
            if (r0 == 0) goto L_0x0019
            r0.m3022m()
        L_0x0019:
            r0 = 2
            r3.f789b = r0
            r0 = 0
            r3.f773H = r0
            r3.m3272N()
            boolean r0 = r3.f773H
            if (r0 == 0) goto L_0x0027
            return
        L_0x0027:
            a.j.a.r r0 = new a.j.a.r
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " did not call through to super.onStop()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: X */
    public final android.content.Context m3262X() {
            r3 = this;
            android.content.Context r0 = r3.m3202j()
            if (r0 == 0) goto L_0x0007
            return r0
        L_0x0007:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " not attached to a context."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: Y */
    public void m3261Y() {
            r2 = this;
            a.j.a.i r0 = r2.f806s
            if (r0 == 0) goto L_0x0030
            a.j.a.g r0 = r0.f876n
            if (r0 != 0) goto L_0x0009
            goto L_0x0030
        L_0x0009:
            android.os.Looper r0 = android.os.Looper.myLooper()
            a.j.a.i r1 = r2.f806s
            a.j.a.g r1 = r1.f876n
            android.os.Handler r1 = r1.m3134e()
            android.os.Looper r1 = r1.getLooper()
            if (r0 == r1) goto L_0x002c
            a.j.a.i r0 = r2.f806s
            a.j.a.g r0 = r0.f876n
            android.os.Handler r0 = r0.m3134e()
            a.j.a.c$a r1 = new a.j.a.c$a
            r1.<init>(r2)
            r0.postAtFrontOfQueue(r1)
            goto L_0x0037
        L_0x002c:
            r2.m3224c()
            goto L_0x0037
        L_0x0030:
            a.j.a.c$d r0 = r2.m3260Z()
            r1 = 0
            r0.f833q = r1
        L_0x0037:
            return
    }

    /* renamed from: a */
    p000a.p036j.p037a.ComponentCallbacksC0248c m3235a(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.f794g
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            a.j.a.i r0 = r1.f808u
            if (r0 == 0) goto L_0x0012
            a.j.a.c r2 = r0.m3059b(r2)
            return r2
        L_0x0012:
            r2 = 0
            return r2
    }

    @java.lang.Deprecated
    /* renamed from: a */
    public android.view.LayoutInflater m3241a(android.os.Bundle r2) {
            r1 = this;
            a.j.a.g r2 = r1.f807t
            if (r2 == 0) goto L_0x0014
            android.view.LayoutInflater r2 = r2.mo3133f()
            r1.m3204i()
            a.j.a.i r0 = r1.f808u
            r0.m3016p()
            p000a.p018g.p029l.C0203e.m3481b(r2, r0)
            return r2
        L_0x0014:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: a */
    public android.view.View mo11a(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* renamed from: a */
    public android.view.animation.Animation m3255a(int r1, boolean r2, int r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.lifecycle.AbstractC0746g
    /* renamed from: a */
    public androidx.lifecycle.AbstractC0742e mo1368a() {
            r1 = this;
            androidx.lifecycle.h r0 = r1.f785T
            return r0
    }

    /* renamed from: a */
    void m3259a(int r2) {
            r1 = this;
            a.j.a.c$d r0 = r1.f779N
            if (r0 != 0) goto L_0x0007
            if (r2 != 0) goto L_0x0007
            return
        L_0x0007:
            a.j.a.c$d r0 = r1.m3260Z()
            r0.f820d = r2
            return
    }

    /* renamed from: a */
    void m3258a(int r2, int r3) {
            r1 = this;
            a.j.a.c$d r0 = r1.f779N
            if (r0 != 0) goto L_0x0009
            if (r2 != 0) goto L_0x0009
            if (r3 != 0) goto L_0x0009
            return
        L_0x0009:
            r1.m3260Z()
            a.j.a.c$d r0 = r1.f779N
            r0.f821e = r2
            r0.f822f = r3
            return
    }

    /* renamed from: a */
    public void m3257a(int r1, int r2, android.content.Intent r3) {
            r0 = this;
            return
    }

    /* renamed from: a */
    final void m3256a(int r1, p000a.p036j.p037a.ComponentCallbacksC0248c r2) {
            r0 = this;
            r0.f793f = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r2 == 0) goto L_0x0011
            r1.<init>()
            java.lang.String r2 = r2.f794g
            r1.append(r2)
            java.lang.String r2 = ":"
            goto L_0x0016
        L_0x0011:
            r1.<init>()
            java.lang.String r2 = "android:fragment:"
        L_0x0016:
            r1.append(r2)
            int r2 = r0.f793f
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.f794g = r1
            return
    }

    /* renamed from: a */
    public void m3254a(int r1, java.lang.String[] r2, int[] r3) {
            r0 = this;
            return
    }

    /* renamed from: a */
    void m3253a(p000a.p036j.p037a.ComponentCallbacksC0248c.AbstractC0254f r3) {
            r2 = this;
            r2.m3260Z()
            a.j.a.c$d r0 = r2.f779N
            a.j.a.c$f r0 = r0.f834r
            if (r3 != r0) goto L_0x000a
            return
        L_0x000a:
            if (r3 == 0) goto L_0x0026
            if (r0 != 0) goto L_0x000f
            goto L_0x0026
        L_0x000f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Trying to set a replacement startPostponedEnterTransition on "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L_0x0026:
            a.j.a.c$d r0 = r2.f779N
            boolean r1 = r0.f833q
            if (r1 == 0) goto L_0x002e
            r0.f834r = r3
        L_0x002e:
            if (r3 == 0) goto L_0x0033
            r3.mo3002b()
        L_0x0033:
            return
    }

    /* renamed from: a */
    public void m3252a(p000a.p036j.p037a.ComponentCallbacksC0248c r1) {
            r0 = this;
            return
    }

    /* renamed from: a */
    void m3251a(android.animation.Animator r2) {
            r1 = this;
            a.j.a.c$d r0 = r1.m3260Z()
            r0.f818b = r2
            return
    }

    @java.lang.Deprecated
    /* renamed from: a */
    public void m3250a(android.app.Activity r1) {
            r0 = this;
            r1 = 1
            r0.f773H = r1
            return
    }

    @java.lang.Deprecated
    /* renamed from: a */
    public void m3249a(android.app.Activity r1, android.util.AttributeSet r2, android.os.Bundle r3) {
            r0 = this;
            r1 = 1
            r0.f773H = r1
            return
    }

    /* renamed from: a */
    public void m3248a(android.content.Context r2) {
            r1 = this;
            r2 = 1
            r1.f773H = r2
            a.j.a.g r2 = r1.f807t
            if (r2 != 0) goto L_0x0009
            r2 = 0
            goto L_0x000d
        L_0x0009:
            android.app.Activity r2 = r2.m3138b()
        L_0x000d:
            if (r2 == 0) goto L_0x0015
            r0 = 0
            r1.f773H = r0
            r1.m3250a(r2)
        L_0x0015:
            return
    }

    /* renamed from: a */
    public void m3247a(android.content.Context r2, android.util.AttributeSet r3, android.os.Bundle r4) {
            r1 = this;
            r2 = 1
            r1.f773H = r2
            a.j.a.g r2 = r1.f807t
            if (r2 != 0) goto L_0x0009
            r2 = 0
            goto L_0x000d
        L_0x0009:
            android.app.Activity r2 = r2.m3138b()
        L_0x000d:
            if (r2 == 0) goto L_0x0015
            r0 = 0
            r1.f773H = r0
            r1.m3249a(r2, r3, r4)
        L_0x0015:
            return
    }

    /* renamed from: a */
    public void m3244a(android.content.Intent r2) {
            r1 = this;
            r0 = 0
            r1.m3243a(r2, r0)
            return
    }

    /* renamed from: a */
    public void m3243a(android.content.Intent r3, android.os.Bundle r4) {
            r2 = this;
            a.j.a.g r0 = r2.f807t
            if (r0 == 0) goto L_0x0009
            r1 = -1
            r0.mo3140a(r2, r3, r1, r4)
            return
        L_0x0009:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Fragment "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = " not attached to Activity"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    /* renamed from: a */
    void m3242a(android.content.res.Configuration r2) {
            r1 = this;
            r1.onConfigurationChanged(r2)
            a.j.a.i r0 = r1.f808u
            if (r0 == 0) goto L_0x000a
            r0.m3089a(r2)
        L_0x000a:
            return
    }

    /* renamed from: a */
    public void m3240a(android.view.Menu r1) {
            r0 = this;
            return
    }

    /* renamed from: a */
    public void m3239a(android.view.Menu r1, android.view.MenuInflater r2) {
            r0 = this;
            return
    }

    /* renamed from: a */
    void m3237a(android.view.View r2) {
            r1 = this;
            a.j.a.c$d r0 = r1.m3260Z()
            r0.f817a = r2
            return
    }

    /* renamed from: a */
    public void m3236a(android.view.View r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    /* renamed from: a */
    public void m3234a(java.lang.String r3, java.io.FileDescriptor r4, java.io.PrintWriter r5, java.lang.String[] r6) {
            r2 = this;
            r5.print(r3)
            java.lang.String r0 = "mFragmentId=#"
            r5.print(r0)
            int r0 = r2.f812y
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " mContainerId=#"
            r5.print(r0)
            int r0 = r2.f813z
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " mTag="
            r5.print(r0)
            java.lang.String r0 = r2.f766A
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mState="
            r5.print(r0)
            int r0 = r2.f789b
            r5.print(r0)
            java.lang.String r0 = " mIndex="
            r5.print(r0)
            int r0 = r2.f793f
            r5.print(r0)
            java.lang.String r0 = " mWho="
            r5.print(r0)
            java.lang.String r0 = r2.f794g
            r5.print(r0)
            java.lang.String r0 = " mBackStackNesting="
            r5.print(r0)
            int r0 = r2.f805r
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mAdded="
            r5.print(r0)
            boolean r0 = r2.f799l
            r5.print(r0)
            java.lang.String r0 = " mRemoving="
            r5.print(r0)
            boolean r0 = r2.f800m
            r5.print(r0)
            java.lang.String r0 = " mFromLayout="
            r5.print(r0)
            boolean r0 = r2.f801n
            r5.print(r0)
            java.lang.String r0 = " mInLayout="
            r5.print(r0)
            boolean r0 = r2.f802o
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mHidden="
            r5.print(r0)
            boolean r0 = r2.f767B
            r5.print(r0)
            java.lang.String r0 = " mDetached="
            r5.print(r0)
            boolean r0 = r2.f768C
            r5.print(r0)
            java.lang.String r0 = " mMenuVisible="
            r5.print(r0)
            boolean r0 = r2.f772G
            r5.print(r0)
            java.lang.String r0 = " mHasMenu="
            r5.print(r0)
            boolean r0 = r2.f771F
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mRetainInstance="
            r5.print(r0)
            boolean r0 = r2.f769D
            r5.print(r0)
            java.lang.String r0 = " mRetaining="
            r5.print(r0)
            boolean r0 = r2.f770E
            r5.print(r0)
            java.lang.String r0 = " mUserVisibleHint="
            r5.print(r0)
            boolean r0 = r2.f778M
            r5.println(r0)
            a.j.a.i r0 = r2.f806s
            if (r0 == 0) goto L_0x00dc
            r5.print(r3)
            java.lang.String r0 = "mFragmentManager="
            r5.print(r0)
            a.j.a.i r0 = r2.f806s
            r5.println(r0)
        L_0x00dc:
            a.j.a.g r0 = r2.f807t
            if (r0 == 0) goto L_0x00ed
            r5.print(r3)
            java.lang.String r0 = "mHost="
            r5.print(r0)
            a.j.a.g r0 = r2.f807t
            r5.println(r0)
        L_0x00ed:
            a.j.a.c r0 = r2.f811x
            if (r0 == 0) goto L_0x00fe
            r5.print(r3)
            java.lang.String r0 = "mParentFragment="
            r5.print(r0)
            a.j.a.c r0 = r2.f811x
            r5.println(r0)
        L_0x00fe:
            android.os.Bundle r0 = r2.f795h
            if (r0 == 0) goto L_0x010f
            r5.print(r3)
            java.lang.String r0 = "mArguments="
            r5.print(r0)
            android.os.Bundle r0 = r2.f795h
            r5.println(r0)
        L_0x010f:
            android.os.Bundle r0 = r2.f790c
            if (r0 == 0) goto L_0x0120
            r5.print(r3)
            java.lang.String r0 = "mSavedFragmentState="
            r5.print(r0)
            android.os.Bundle r0 = r2.f790c
            r5.println(r0)
        L_0x0120:
            android.util.SparseArray<android.os.Parcelable> r0 = r2.f791d
            if (r0 == 0) goto L_0x0131
            r5.print(r3)
            java.lang.String r0 = "mSavedViewState="
            r5.print(r0)
            android.util.SparseArray<android.os.Parcelable> r0 = r2.f791d
            r5.println(r0)
        L_0x0131:
            a.j.a.c r0 = r2.f796i
            if (r0 == 0) goto L_0x014c
            r5.print(r3)
            java.lang.String r0 = "mTarget="
            r5.print(r0)
            a.j.a.c r0 = r2.f796i
            r5.print(r0)
            java.lang.String r0 = " mTargetRequestCode="
            r5.print(r0)
            int r0 = r2.f798k
            r5.println(r0)
        L_0x014c:
            int r0 = r2.m3192p()
            if (r0 == 0) goto L_0x0161
            r5.print(r3)
            java.lang.String r0 = "mNextAnim="
            r5.print(r0)
            int r0 = r2.m3192p()
            r5.println(r0)
        L_0x0161:
            android.view.ViewGroup r0 = r2.f774I
            if (r0 == 0) goto L_0x0172
            r5.print(r3)
            java.lang.String r0 = "mContainer="
            r5.print(r0)
            android.view.ViewGroup r0 = r2.f774I
            r5.println(r0)
        L_0x0172:
            android.view.View r0 = r2.f775J
            if (r0 == 0) goto L_0x0183
            r5.print(r3)
            java.lang.String r0 = "mView="
            r5.print(r0)
            android.view.View r0 = r2.f775J
            r5.println(r0)
        L_0x0183:
            android.view.View r0 = r2.f776K
            if (r0 == 0) goto L_0x0194
            r5.print(r3)
            java.lang.String r0 = "mInnerView="
            r5.print(r0)
            android.view.View r0 = r2.f775J
            r5.println(r0)
        L_0x0194:
            android.view.View r0 = r2.m3208g()
            if (r0 == 0) goto L_0x01b8
            r5.print(r3)
            java.lang.String r0 = "mAnimatingAway="
            r5.print(r0)
            android.view.View r0 = r2.m3208g()
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mStateAfterAnimating="
            r5.print(r0)
            int r0 = r2.m3184x()
            r5.println(r0)
        L_0x01b8:
            android.content.Context r0 = r2.m3202j()
            if (r0 == 0) goto L_0x01c5
            a.l.a.a r0 = p000a.p041l.p042a.AbstractC0309a.m2949a(r2)
            r0.mo2947a(r3, r4, r5, r6)
        L_0x01c5:
            a.j.a.i r0 = r2.f808u
            if (r0 == 0) goto L_0x01fd
            r5.print(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Child "
            r0.append(r1)
            a.j.a.i r1 = r2.f808u
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.println(r0)
            a.j.a.i r0 = r2.f808u
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "  "
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.mo3077a(r3, r4, r5, r6)
        L_0x01fd:
            return
    }

    /* renamed from: a */
    public void m3233a(boolean r1) {
            r0 = this;
            return
    }

    /* renamed from: a */
    public boolean m3238a(android.view.MenuItem r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* renamed from: b */
    public android.animation.Animator m3231b(int r1, boolean r2, int r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.lifecycle.AbstractC0762s
    /* renamed from: b */
    public androidx.lifecycle.C0761r mo1343b() {
            r2 = this;
            android.content.Context r0 = r2.m3202j()
            if (r0 == 0) goto L_0x0014
            androidx.lifecycle.r r0 = r2.f810w
            if (r0 != 0) goto L_0x0011
            androidx.lifecycle.r r0 = new androidx.lifecycle.r
            r0.<init>()
            r2.f810w = r0
        L_0x0011:
            androidx.lifecycle.r r0 = r2.f810w
            return r0
        L_0x0014:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't access ViewModels from detached fragment"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: b */
    void m3232b(int r2) {
            r1 = this;
            a.j.a.c$d r0 = r1.m3260Z()
            r0.f819c = r2
            return
    }

    /* renamed from: b */
    public void m3230b(android.os.Bundle r1) {
            r0 = this;
            r1 = 1
            r0.f773H = r1
            return
    }

    /* renamed from: b */
    void m3229b(android.view.LayoutInflater r2, android.view.ViewGroup r3, android.os.Bundle r4) {
            r1 = this;
            a.j.a.i r0 = r1.f808u
            if (r0 == 0) goto L_0x0007
            r0.m3013r()
        L_0x0007:
            r0 = 1
            r1.f804q = r0
            a.j.a.c$c r0 = new a.j.a.c$c
            r0.<init>(r1)
            r1.f787V = r0
            r0 = 0
            r1.f786U = r0
            android.view.View r2 = r1.mo11a(r2, r3, r4)
            r1.f775J = r2
            android.view.View r2 = r1.f775J
            if (r2 == 0) goto L_0x002b
            androidx.lifecycle.g r2 = r1.f787V
            r2.mo1368a()
            androidx.lifecycle.l<androidx.lifecycle.g> r2 = r1.f788W
            androidx.lifecycle.g r3 = r1.f787V
            r2.mo1360a(r3)
            goto L_0x0031
        L_0x002b:
            androidx.lifecycle.h r2 = r1.f786U
            if (r2 != 0) goto L_0x0032
            r1.f787V = r0
        L_0x0031:
            return
        L_0x0032:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Called getViewLifecycleOwner() but onCreateView() returned null"
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: b */
    public void m3228b(android.view.Menu r1) {
            r0 = this;
            return
    }

    /* renamed from: b */
    public void m3225b(boolean r1) {
            r0 = this;
            return
    }

    /* renamed from: b */
    boolean m3227b(android.view.Menu r3, android.view.MenuInflater r4) {
            r2 = this;
            boolean r0 = r2.f767B
            r1 = 0
            if (r0 != 0) goto L_0x001b
            boolean r0 = r2.f771F
            if (r0 == 0) goto L_0x0012
            boolean r0 = r2.f772G
            if (r0 == 0) goto L_0x0012
            r0 = 1
            r2.m3239a(r3, r4)
            r1 = 1
        L_0x0012:
            a.j.a.i r0 = r2.f808u
            if (r0 == 0) goto L_0x001b
            boolean r3 = r0.m3084a(r3, r4)
            r1 = r1 | r3
        L_0x001b:
            return r1
    }

    /* renamed from: b */
    public boolean m3226b(android.view.MenuItem r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* renamed from: c */
    void m3224c() {
            r3 = this;
            a.j.a.c$d r0 = r3.f779N
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x000e
        L_0x0006:
            r2 = 0
            r0.f833q = r2
            a.j.a.c$f r2 = r0.f834r
            r0.f834r = r1
            r1 = r2
        L_0x000e:
            if (r1 == 0) goto L_0x0013
            r1.mo3003a()
        L_0x0013:
            return
    }

    /* renamed from: c */
    public void m3223c(android.os.Bundle r2) {
            r1 = this;
            r0 = 1
            r1.f773H = r0
            r1.m3199k(r2)
            a.j.a.i r2 = r1.f808u
            if (r2 == 0) goto L_0x0015
            boolean r2 = r2.m3054c(r0)
            if (r2 != 0) goto L_0x0015
            a.j.a.i r2 = r1.f808u
            r2.m3039f()
        L_0x0015:
            return
    }

    /* renamed from: c */
    void m3222c(android.view.Menu r2) {
            r1 = this;
            boolean r0 = r1.f767B
            if (r0 != 0) goto L_0x0016
            boolean r0 = r1.f771F
            if (r0 == 0) goto L_0x000f
            boolean r0 = r1.f772G
            if (r0 == 0) goto L_0x000f
            r1.m3240a(r2)
        L_0x000f:
            a.j.a.i r0 = r1.f808u
            if (r0 == 0) goto L_0x0016
            r0.m3085a(r2)
        L_0x0016:
            return
    }

    /* renamed from: c */
    public void m3220c(boolean r1) {
            r0 = this;
            return
    }

    /* renamed from: c */
    boolean m3221c(android.view.MenuItem r3) {
            r2 = this;
            boolean r0 = r2.f767B
            if (r0 != 0) goto L_0x0017
            boolean r0 = r2.m3238a(r3)
            r1 = 1
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            a.j.a.i r0 = r2.f808u
            if (r0 == 0) goto L_0x0017
            boolean r3 = r0.m3083a(r3)
            if (r3 == 0) goto L_0x0017
            return r1
        L_0x0017:
            r3 = 0
            return r3
    }

    /* renamed from: d */
    public final p000a.p036j.p037a.ActivityC0255d m3219d() {
            r1 = this;
            a.j.a.g r0 = r1.f807t
            if (r0 != 0) goto L_0x0006
            r0 = 0
            goto L_0x000c
        L_0x0006:
            android.app.Activity r0 = r0.m3138b()
            a.j.a.d r0 = (p000a.p036j.p037a.ActivityC0255d) r0
        L_0x000c:
            return r0
    }

    /* renamed from: d */
    public android.view.LayoutInflater m3218d(android.os.Bundle r1) {
            r0 = this;
            android.view.LayoutInflater r1 = r0.m3241a(r1)
            return r1
    }

    /* renamed from: d */
    void m3215d(boolean r2) {
            r1 = this;
            r1.m3225b(r2)
            a.j.a.i r0 = r1.f808u
            if (r0 == 0) goto L_0x000a
            r0.m3072a(r2)
        L_0x000a:
            return
    }

    /* renamed from: d */
    boolean m3217d(android.view.Menu r3) {
            r2 = this;
            boolean r0 = r2.f767B
            r1 = 0
            if (r0 != 0) goto L_0x001b
            boolean r0 = r2.f771F
            if (r0 == 0) goto L_0x0012
            boolean r0 = r2.f772G
            if (r0 == 0) goto L_0x0012
            r0 = 1
            r2.m3228b(r3)
            r1 = 1
        L_0x0012:
            a.j.a.i r0 = r2.f808u
            if (r0 == 0) goto L_0x001b
            boolean r3 = r0.m3062b(r3)
            r1 = r1 | r3
        L_0x001b:
            return r1
    }

    /* renamed from: d */
    boolean m3216d(android.view.MenuItem r3) {
            r2 = this;
            boolean r0 = r2.f767B
            if (r0 != 0) goto L_0x001f
            boolean r0 = r2.f771F
            r1 = 1
            if (r0 == 0) goto L_0x0014
            boolean r0 = r2.f772G
            if (r0 == 0) goto L_0x0014
            boolean r0 = r2.m3226b(r3)
            if (r0 == 0) goto L_0x0014
            return r1
        L_0x0014:
            a.j.a.i r0 = r2.f808u
            if (r0 == 0) goto L_0x001f
            boolean r3 = r0.m3061b(r3)
            if (r3 == 0) goto L_0x001f
            return r1
        L_0x001f:
            r3 = 0
            return r3
    }

    /* renamed from: e */
    public void m3213e(android.os.Bundle r1) {
            r0 = this;
            return
    }

    /* renamed from: e */
    void m3212e(boolean r2) {
            r1 = this;
            r1.m3220c(r2)
            a.j.a.i r0 = r1.f808u
            if (r0 == 0) goto L_0x000a
            r0.m3056b(r2)
        L_0x000a:
            return
    }

    /* renamed from: e */
    public boolean m3214e() {
            r1 = this;
            a.j.a.c$d r0 = r1.f779N
            if (r0 == 0) goto L_0x000e
            java.lang.Boolean r0 = r0.f830n
            if (r0 != 0) goto L_0x0009
            goto L_0x000e
        L_0x0009:
            boolean r0 = r0.booleanValue()
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            return r0
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.equals(r1)
            return r1
    }

    /* renamed from: f */
    public void m3210f(android.os.Bundle r1) {
            r0 = this;
            r1 = 1
            r0.f773H = r1
            return
    }

    /* renamed from: f */
    void m3209f(boolean r2) {
            r1 = this;
            a.j.a.c$d r0 = r1.m3260Z()
            r0.f835s = r2
            return
    }

    /* renamed from: f */
    public boolean m3211f() {
            r1 = this;
            a.j.a.c$d r0 = r1.f779N
            if (r0 == 0) goto L_0x000e
            java.lang.Boolean r0 = r0.f829m
            if (r0 != 0) goto L_0x0009
            goto L_0x000e
        L_0x0009:
            boolean r0 = r0.booleanValue()
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            return r0
    }

    /* renamed from: g */
    android.view.View m3208g() {
            r1 = this;
            a.j.a.c$d r0 = r1.f779N
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            android.view.View r0 = r0.f817a
            return r0
    }

    /* renamed from: g */
    void m3207g(android.os.Bundle r3) {
            r2 = this;
            a.j.a.i r0 = r2.f808u
            if (r0 == 0) goto L_0x0007
            r0.m3013r()
        L_0x0007:
            r0 = 2
            r2.f789b = r0
            r0 = 0
            r2.f773H = r0
            r2.m3230b(r3)
            boolean r3 = r2.f773H
            if (r3 == 0) goto L_0x001c
            a.j.a.i r3 = r2.f808u
            if (r3 == 0) goto L_0x001b
            r3.m3043e()
        L_0x001b:
            return
        L_0x001c:
            a.j.a.r r3 = new a.j.a.r
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fragment "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = " did not call through to super.onActivityCreated()"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    /* renamed from: h */
    android.animation.Animator m3206h() {
            r1 = this;
            a.j.a.c$d r0 = r1.f779N
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            android.animation.Animator r0 = r0.f818b
            return r0
    }

    /* renamed from: h */
    void m3205h(android.os.Bundle r3) {
            r2 = this;
            a.j.a.i r0 = r2.f808u
            if (r0 == 0) goto L_0x0007
            r0.m3013r()
        L_0x0007:
            r0 = 1
            r2.f789b = r0
            r1 = 0
            r2.f773H = r1
            r2.m3223c(r3)
            r2.f784S = r0
            boolean r3 = r2.f773H
            if (r3 == 0) goto L_0x001e
            androidx.lifecycle.h r3 = r2.f785T
            androidx.lifecycle.e$a r0 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_CREATE
            r3.m1385a(r0)
            return
        L_0x001e:
            a.j.a.r r3 = new a.j.a.r
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fragment "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = " did not call through to super.onCreate()"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public final int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    /* renamed from: i */
    public final p000a.p036j.p037a.AbstractC0262h m3204i() {
            r2 = this;
            a.j.a.i r0 = r2.f808u
            if (r0 != 0) goto L_0x002c
            r2.m3284A()
            int r0 = r2.f789b
            r1 = 4
            if (r0 < r1) goto L_0x0012
            a.j.a.i r0 = r2.f808u
            r0.m3026k()
            goto L_0x002c
        L_0x0012:
            r1 = 3
            if (r0 < r1) goto L_0x001b
            a.j.a.i r0 = r2.f808u
            r0.m3024l()
            goto L_0x002c
        L_0x001b:
            r1 = 2
            if (r0 < r1) goto L_0x0024
            a.j.a.i r0 = r2.f808u
            r0.m3043e()
            goto L_0x002c
        L_0x0024:
            r1 = 1
            if (r0 < r1) goto L_0x002c
            a.j.a.i r0 = r2.f808u
            r0.m3039f()
        L_0x002c:
            a.j.a.i r0 = r2.f808u
            return r0
    }

    /* renamed from: i */
    android.view.LayoutInflater m3203i(android.os.Bundle r1) {
            r0 = this;
            android.view.LayoutInflater r1 = r0.m3218d(r1)
            r0.f783R = r1
            android.view.LayoutInflater r1 = r0.f783R
            return r1
    }

    /* renamed from: j */
    public android.content.Context m3202j() {
            r1 = this;
            a.j.a.g r0 = r1.f807t
            if (r0 != 0) goto L_0x0006
            r0 = 0
            goto L_0x000a
        L_0x0006:
            android.content.Context r0 = r0.m3136c()
        L_0x000a:
            return r0
    }

    /* renamed from: j */
    void m3201j(android.os.Bundle r3) {
            r2 = this;
            r2.m3213e(r3)
            a.j.a.i r0 = r2.f808u
            if (r0 == 0) goto L_0x0012
            android.os.Parcelable r0 = r0.m3010u()
            if (r0 == 0) goto L_0x0012
            java.lang.String r1 = "android:support:fragments"
            r3.putParcelable(r1, r0)
        L_0x0012:
            return
    }

    /* renamed from: k */
    public java.lang.Object m3200k() {
            r1 = this;
            a.j.a.c$d r0 = r1.f779N
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            java.lang.Object r0 = r0.f823g
            return r0
    }

    /* renamed from: k */
    void m3199k(android.os.Bundle r3) {
            r2 = this;
            if (r3 == 0) goto L_0x0020
            java.lang.String r0 = "android:support:fragments"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            if (r3 == 0) goto L_0x0020
            a.j.a.i r0 = r2.f808u
            if (r0 != 0) goto L_0x0011
            r2.m3284A()
        L_0x0011:
            a.j.a.i r0 = r2.f808u
            a.j.a.j r1 = r2.f809v
            r0.m3086a(r3, r1)
            r3 = 0
            r2.f809v = r3
            a.j.a.i r3 = r2.f808u
            r3.m3039f()
        L_0x0020:
            return
    }

    /* renamed from: l */
    androidx.core.app.AbstractC0695e m3198l() {
            r1 = this;
            a.j.a.c$d r0 = r1.f779N
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            androidx.core.app.e r0 = r0.f831o
            return r0
    }

    /* renamed from: l */
    final void m3197l(android.os.Bundle r3) {
            r2 = this;
            android.util.SparseArray<android.os.Parcelable> r0 = r2.f791d
            if (r0 == 0) goto L_0x000c
            android.view.View r1 = r2.f776K
            r1.restoreHierarchyState(r0)
            r0 = 0
            r2.f791d = r0
        L_0x000c:
            r0 = 0
            r2.f773H = r0
            r2.m3210f(r3)
            boolean r3 = r2.f773H
            if (r3 == 0) goto L_0x0022
            android.view.View r3 = r2.f775J
            if (r3 == 0) goto L_0x0021
            androidx.lifecycle.h r3 = r2.f786U
            androidx.lifecycle.e$a r0 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_CREATE
            r3.m1385a(r0)
        L_0x0021:
            return
        L_0x0022:
            a.j.a.r r3 = new a.j.a.r
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fragment "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = " did not call through to super.onViewStateRestored()"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    /* renamed from: m */
    public java.lang.Object m3196m() {
            r1 = this;
            a.j.a.c$d r0 = r1.f779N
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            java.lang.Object r0 = r0.f825i
            return r0
    }

    /* renamed from: m */
    public void m3195m(android.os.Bundle r2) {
            r1 = this;
            int r0 = r1.f793f
            if (r0 < 0) goto L_0x0013
            boolean r0 = r1.m3280E()
            if (r0 != 0) goto L_0x000b
            goto L_0x0013
        L_0x000b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Fragment already active and state has been saved"
            r2.<init>(r0)
            throw r2
        L_0x0013:
            r1.f795h = r2
            return
    }

    /* renamed from: n */
    androidx.core.app.AbstractC0695e m3194n() {
            r1 = this;
            a.j.a.c$d r0 = r1.f779N
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            androidx.core.app.e r0 = r0.f832p
            return r0
    }

    /* renamed from: o */
    public final p000a.p036j.p037a.AbstractC0262h m3193o() {
            r1 = this;
            a.j.a.i r0 = r1.f806s
            return r0
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            r1 = 1
            r0.f773H = r1
            return
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu r2, android.view.View r3, android.view.ContextMenu.ContextMenuInfo r4) {
            r1 = this;
            a.j.a.d r0 = r1.m3219d()
            r0.onCreateContextMenu(r2, r3, r4)
            return
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
            r1 = this;
            r0 = 1
            r1.f773H = r0
            return
    }

    /* renamed from: p */
    int m3192p() {
            r1 = this;
            a.j.a.c$d r0 = r1.f779N
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            int r0 = r0.f820d
            return r0
    }

    /* renamed from: q */
    int m3191q() {
            r1 = this;
            a.j.a.c$d r0 = r1.f779N
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            int r0 = r0.f821e
            return r0
    }

    /* renamed from: r */
    int m3190r() {
            r1 = this;
            a.j.a.c$d r0 = r1.f779N
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            int r0 = r0.f822f
            return r0
    }

    /* renamed from: s */
    public java.lang.Object m3189s() {
            r2 = this;
            a.j.a.c$d r0 = r2.f779N
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            java.lang.Object r0 = r0.f826j
            java.lang.Object r1 = p000a.p036j.p037a.ComponentCallbacksC0248c.f765Y
            if (r0 != r1) goto L_0x0010
            java.lang.Object r0 = r2.m3196m()
        L_0x0010:
            return r0
    }

    /* renamed from: t */
    public final android.content.res.Resources m3188t() {
            r1 = this;
            android.content.Context r0 = r1.m3262X()
            android.content.res.Resources r0 = r0.getResources()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.794E-43)
            r0.<init>(r1)
            p000a.p018g.p028k.C0178a.m3564a(r2, r0)
            int r1 = r2.f793f
            if (r1 < 0) goto L_0x0018
            java.lang.String r1 = " #"
            r0.append(r1)
            int r1 = r2.f793f
            r0.append(r1)
        L_0x0018:
            int r1 = r2.f812y
            if (r1 == 0) goto L_0x002a
            java.lang.String r1 = " id=0x"
            r0.append(r1)
            int r1 = r2.f812y
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
        L_0x002a:
            java.lang.String r1 = r2.f766A
            if (r1 == 0) goto L_0x0038
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = r2.f766A
            r0.append(r1)
        L_0x0038:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* renamed from: u */
    public java.lang.Object m3187u() {
            r2 = this;
            a.j.a.c$d r0 = r2.f779N
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            java.lang.Object r0 = r0.f824h
            java.lang.Object r1 = p000a.p036j.p037a.ComponentCallbacksC0248c.f765Y
            if (r0 != r1) goto L_0x0010
            java.lang.Object r0 = r2.m3200k()
        L_0x0010:
            return r0
    }

    /* renamed from: v */
    public java.lang.Object m3186v() {
            r1 = this;
            a.j.a.c$d r0 = r1.f779N
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            java.lang.Object r0 = r0.f827k
            return r0
    }

    /* renamed from: w */
    public java.lang.Object m3185w() {
            r2 = this;
            a.j.a.c$d r0 = r2.f779N
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            java.lang.Object r0 = r0.f828l
            java.lang.Object r1 = p000a.p036j.p037a.ComponentCallbacksC0248c.f765Y
            if (r0 != r1) goto L_0x0010
            java.lang.Object r0 = r2.m3186v()
        L_0x0010:
            return r0
    }

    /* renamed from: x */
    int m3184x() {
            r1 = this;
            a.j.a.c$d r0 = r1.f779N
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            int r0 = r0.f819c
            return r0
    }

    /* renamed from: y */
    public android.view.View m3183y() {
            r1 = this;
            android.view.View r0 = r1.f775J
            return r0
    }

    /* renamed from: z */
    void m3182z() {
            r2 = this;
            r0 = -1
            r2.f793f = r0
            r0 = 0
            r2.f794g = r0
            r1 = 0
            r2.f799l = r1
            r2.f800m = r1
            r2.f801n = r1
            r2.f802o = r1
            r2.f803p = r1
            r2.f805r = r1
            r2.f806s = r0
            r2.f808u = r0
            r2.f807t = r0
            r2.f812y = r1
            r2.f813z = r1
            r2.f766A = r0
            r2.f767B = r1
            r2.f768C = r1
            r2.f770E = r1
            return
    }
}
