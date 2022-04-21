package p000a.p036j.p037a;

/* renamed from: a.j.a.a */
/* loaded from: classes.dex */
final class C0244a extends p000a.p036j.p037a.AbstractC0287m implements p000a.p036j.p037a.AbstractC0262h.AbstractC0263a, p000a.p036j.p037a.LayoutInflater$Factory2C0266i.AbstractC0280l {

    /* renamed from: a */
    final p000a.p036j.p037a.LayoutInflater$Factory2C0266i f726a;

    /* renamed from: b */
    java.util.ArrayList<p000a.p036j.p037a.C0244a.C0245a> f727b;

    /* renamed from: c */
    int f728c;

    /* renamed from: d */
    int f729d;

    /* renamed from: e */
    int f730e;

    /* renamed from: f */
    int f731f;

    /* renamed from: g */
    int f732g;

    /* renamed from: h */
    int f733h;

    /* renamed from: i */
    boolean f734i;

    /* renamed from: j */
    java.lang.String f735j;

    /* renamed from: k */
    boolean f736k;

    /* renamed from: l */
    int f737l;

    /* renamed from: m */
    int f738m;

    /* renamed from: n */
    java.lang.CharSequence f739n;

    /* renamed from: o */
    int f740o;

    /* renamed from: p */
    java.lang.CharSequence f741p;

    /* renamed from: q */
    java.util.ArrayList<java.lang.String> f742q;

    /* renamed from: r */
    java.util.ArrayList<java.lang.String> f743r;

    /* renamed from: s */
    boolean f744s;

    /* renamed from: t */
    java.util.ArrayList<java.lang.Runnable> f745t;

    /* renamed from: a.j.a.a$a */
    /* loaded from: classes.dex */
    static final class C0245a {

        /* renamed from: a */
        int f746a;

        /* renamed from: b */
        p000a.p036j.p037a.ComponentCallbacksC0248c f747b;

        /* renamed from: c */
        int f748c;

        /* renamed from: d */
        int f749d;

        /* renamed from: e */
        int f750e;

        /* renamed from: f */
        int f751f;

        C0245a() {
                r0 = this;
                r0.<init>()
                return
        }

        C0245a(int r1, p000a.p036j.p037a.ComponentCallbacksC0248c r2) {
                r0 = this;
                r0.<init>()
                r0.f746a = r1
                r0.f747b = r2
                return
        }
    }

    public C0244a(p000a.p036j.p037a.LayoutInflater$Factory2C0266i r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f727b = r0
            r0 = -1
            r1.f737l = r0
            r0 = 0
            r1.f744s = r0
            r1.f726a = r2
            return
    }

    /* renamed from: a */
    private void m3301a(int r4, p000a.p036j.p037a.ComponentCallbacksC0248c r5, java.lang.String r6, int r7) {
            r3 = this;
            java.lang.Class r0 = r5.getClass()
            int r1 = r0.getModifiers()
            boolean r2 = r0.isAnonymousClass()
            if (r2 != 0) goto L_0x00bf
            boolean r2 = java.lang.reflect.Modifier.isPublic(r1)
            if (r2 == 0) goto L_0x00bf
            boolean r2 = r0.isMemberClass()
            if (r2 == 0) goto L_0x0020
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 == 0) goto L_0x00bf
        L_0x0020:
            a.j.a.i r0 = r3.f726a
            r5.f806s = r0
            java.lang.String r0 = " now "
            java.lang.String r1 = ": was "
            if (r6 == 0) goto L_0x005c
            java.lang.String r2 = r5.f766A
            if (r2 == 0) goto L_0x005a
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x0035
            goto L_0x005a
        L_0x0035:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "Can't change tag of fragment "
            r7.append(r2)
            r7.append(r5)
            r7.append(r1)
            java.lang.String r5 = r5.f766A
            r7.append(r5)
            r7.append(r0)
            r7.append(r6)
            java.lang.String r5 = r7.toString()
            r4.<init>(r5)
            throw r4
        L_0x005a:
            r5.f766A = r6
        L_0x005c:
            if (r4 == 0) goto L_0x00b6
            r2 = -1
            if (r4 == r2) goto L_0x0092
            int r6 = r5.f812y
            if (r6 == 0) goto L_0x008d
            if (r6 != r4) goto L_0x0068
            goto L_0x008d
        L_0x0068:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "Can't change container ID of fragment "
            r7.append(r2)
            r7.append(r5)
            r7.append(r1)
            int r5 = r5.f812y
            r7.append(r5)
            r7.append(r0)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r6.<init>(r4)
            throw r6
        L_0x008d:
            r5.f812y = r4
            r5.f813z = r4
            goto L_0x00b6
        L_0x0092:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Can't add fragment "
            r7.append(r0)
            r7.append(r5)
            java.lang.String r5 = " with tag "
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = " to container view with no id"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r4.<init>(r5)
            throw r4
        L_0x00b6:
            a.j.a.a$a r4 = new a.j.a.a$a
            r4.<init>(r7, r5)
            r3.m3300a(r4)
            return
        L_0x00bf:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Fragment "
            r5.append(r6)
            java.lang.String r6 = r0.getCanonicalName()
            r5.append(r6)
            java.lang.String r6 = " must be a public static class to be  properly recreated from"
            r5.append(r6)
            java.lang.String r6 = " instance state."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    /* renamed from: b */
    private static boolean m3291b(p000a.p036j.p037a.C0244a.C0245a r1) {
            a.j.a.c r1 = r1.f747b
            if (r1 == 0) goto L_0x001c
            boolean r0 = r1.f799l
            if (r0 == 0) goto L_0x001c
            android.view.View r0 = r1.f775J
            if (r0 == 0) goto L_0x001c
            boolean r0 = r1.f768C
            if (r0 != 0) goto L_0x001c
            boolean r0 = r1.f767B
            if (r0 != 0) goto L_0x001c
            boolean r1 = r1.m3281D()
            if (r1 == 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            return r1
    }

    @Override // p000a.p036j.p037a.AbstractC0287m
    /* renamed from: a */
    public int mo2994a() {
            r1 = this;
            r0 = 0
            int r0 = r1.m3294a(r0)
            return r0
    }

    /* renamed from: a */
    int m3294a(boolean r4) {
            r3 = this;
            boolean r0 = r3.f736k
            if (r0 != 0) goto L_0x004a
            boolean r0 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r0 == 0) goto L_0x0031
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Commit: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
            a.g.k.b r0 = new a.g.k.b
            r0.<init>(r1)
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            r0 = 0
            java.lang.String r2 = "  "
            r3.m3298a(r2, r0, r1, r0)
            r1.close()
        L_0x0031:
            r0 = 1
            r3.f736k = r0
            boolean r0 = r3.f734i
            if (r0 == 0) goto L_0x003f
            a.j.a.i r0 = r3.f726a
            int r0 = r0.m3067b(r3)
            goto L_0x0040
        L_0x003f:
            r0 = -1
        L_0x0040:
            r3.f737l = r0
            a.j.a.i r0 = r3.f726a
            r0.m3094a(r3, r4)
            int r4 = r3.f737l
            return r4
        L_0x004a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "commit already called"
            r4.<init>(r0)
            throw r4
    }

    /* renamed from: a */
    p000a.p036j.p037a.ComponentCallbacksC0248c m3295a(java.util.ArrayList<p000a.p036j.p037a.ComponentCallbacksC0248c> r17, p000a.p036j.p037a.ComponentCallbacksC0248c r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r4 = r18
            r3 = 0
        L_0x0007:
            java.util.ArrayList<a.j.a.a$a> r5 = r0.f727b
            int r5 = r5.size()
            if (r3 >= r5) goto L_0x00be
            java.util.ArrayList<a.j.a.a$a> r5 = r0.f727b
            java.lang.Object r5 = r5.get(r3)
            a.j.a.a$a r5 = (p000a.p036j.p037a.C0244a.C0245a) r5
            int r6 = r5.f746a
            r7 = 0
            r8 = 1
            if (r6 == r8) goto L_0x00b6
            r9 = 2
            r10 = 3
            r11 = 9
            if (r6 == r9) goto L_0x0058
            if (r6 == r10) goto L_0x0041
            r9 = 6
            if (r6 == r9) goto L_0x0041
            r7 = 7
            if (r6 == r7) goto L_0x00b6
            r7 = 8
            if (r6 == r7) goto L_0x0031
            goto L_0x00bb
        L_0x0031:
            java.util.ArrayList<a.j.a.a$a> r6 = r0.f727b
            a.j.a.a$a r7 = new a.j.a.a$a
            r7.<init>(r11, r4)
            r6.add(r3, r7)
            int r3 = r3 + 1
            a.j.a.c r4 = r5.f747b
            goto L_0x00bb
        L_0x0041:
            a.j.a.c r6 = r5.f747b
            r1.remove(r6)
            a.j.a.c r5 = r5.f747b
            if (r5 != r4) goto L_0x00bb
            java.util.ArrayList<a.j.a.a$a> r4 = r0.f727b
            a.j.a.a$a r6 = new a.j.a.a$a
            r6.<init>(r11, r5)
            r4.add(r3, r6)
            int r3 = r3 + 1
            r4 = r7
            goto L_0x00bb
        L_0x0058:
            a.j.a.c r6 = r5.f747b
            int r9 = r6.f813z
            int r12 = r17.size()
            int r12 = r12 - r8
            r13 = r4
            r4 = r3
            r3 = 0
        L_0x0064:
            if (r12 < 0) goto L_0x00a4
            java.lang.Object r14 = r1.get(r12)
            a.j.a.c r14 = (p000a.p036j.p037a.ComponentCallbacksC0248c) r14
            int r15 = r14.f813z
            if (r15 != r9) goto L_0x00a1
            if (r14 != r6) goto L_0x0074
            r3 = 1
            goto L_0x00a1
        L_0x0074:
            if (r14 != r13) goto L_0x0083
            java.util.ArrayList<a.j.a.a$a> r13 = r0.f727b
            a.j.a.a$a r15 = new a.j.a.a$a
            r15.<init>(r11, r14)
            r13.add(r4, r15)
            int r4 = r4 + 1
            r13 = r7
        L_0x0083:
            a.j.a.a$a r15 = new a.j.a.a$a
            r15.<init>(r10, r14)
            int r2 = r5.f748c
            r15.f748c = r2
            int r2 = r5.f750e
            r15.f750e = r2
            int r2 = r5.f749d
            r15.f749d = r2
            int r2 = r5.f751f
            r15.f751f = r2
            java.util.ArrayList<a.j.a.a$a> r2 = r0.f727b
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r8
        L_0x00a1:
            int r12 = r12 + (-1)
            goto L_0x0064
        L_0x00a4:
            if (r3 == 0) goto L_0x00ae
            java.util.ArrayList<a.j.a.a$a> r2 = r0.f727b
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto L_0x00b3
        L_0x00ae:
            r5.f746a = r8
            r1.add(r6)
        L_0x00b3:
            r3 = r4
            r4 = r13
            goto L_0x00bb
        L_0x00b6:
            a.j.a.c r2 = r5.f747b
            r1.add(r2)
        L_0x00bb:
            int r3 = r3 + r8
            goto L_0x0007
        L_0x00be:
            return r4
    }

    @Override // p000a.p036j.p037a.AbstractC0287m
    /* renamed from: a */
    public p000a.p036j.p037a.AbstractC0287m mo2993a(int r2, p000a.p036j.p037a.ComponentCallbacksC0248c r3) {
            r1 = this;
            r0 = 0
            r1.m3302a(r2, r3, r0)
            return r1
    }

    /* renamed from: a */
    public p000a.p036j.p037a.AbstractC0287m m3302a(int r2, p000a.p036j.p037a.ComponentCallbacksC0248c r3, java.lang.String r4) {
            r1 = this;
            if (r2 == 0) goto L_0x0007
            r0 = 2
            r1.m3301a(r2, r3, r4, r0)
            return r1
        L_0x0007:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Must use non-zero containerViewId"
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: a */
    void m3303a(int r7) {
            r6 = this;
            boolean r0 = r6.f734i
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            java.lang.String r1 = "FragmentManager"
            if (r0 == 0) goto L_0x0027
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Bump nesting in "
            r0.append(r2)
            r0.append(r6)
            java.lang.String r2 = " by "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r1, r0)
        L_0x0027:
            java.util.ArrayList<a.j.a.a$a> r0 = r6.f727b
            int r0 = r0.size()
            r2 = 0
        L_0x002e:
            if (r2 >= r0) goto L_0x006a
            java.util.ArrayList<a.j.a.a$a> r3 = r6.f727b
            java.lang.Object r3 = r3.get(r2)
            a.j.a.a$a r3 = (p000a.p036j.p037a.C0244a.C0245a) r3
            a.j.a.c r4 = r3.f747b
            if (r4 == 0) goto L_0x0067
            int r5 = r4.f805r
            int r5 = r5 + r7
            r4.f805r = r5
            boolean r4 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r4 == 0) goto L_0x0067
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Bump nesting of "
            r4.append(r5)
            a.j.a.c r5 = r3.f747b
            r4.append(r5)
            java.lang.String r5 = " to "
            r4.append(r5)
            a.j.a.c r3 = r3.f747b
            int r3 = r3.f805r
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.v(r1, r3)
        L_0x0067:
            int r2 = r2 + 1
            goto L_0x002e
        L_0x006a:
            return
    }

    /* renamed from: a */
    void m3300a(p000a.p036j.p037a.C0244a.C0245a r2) {
            r1 = this;
            java.util.ArrayList<a.j.a.a$a> r0 = r1.f727b
            r0.add(r2)
            int r0 = r1.f728c
            r2.f748c = r0
            int r0 = r1.f729d
            r2.f749d = r0
            int r0 = r1.f730e
            r2.f750e = r0
            int r0 = r1.f731f
            r2.f751f = r0
            return
    }

    /* renamed from: a */
    void m3299a(p000a.p036j.p037a.ComponentCallbacksC0248c.AbstractC0254f r4) {
            r3 = this;
            r0 = 0
        L_0x0001:
            java.util.ArrayList<a.j.a.a$a> r1 = r3.f727b
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x001f
            java.util.ArrayList<a.j.a.a$a> r1 = r3.f727b
            java.lang.Object r1 = r1.get(r0)
            a.j.a.a$a r1 = (p000a.p036j.p037a.C0244a.C0245a) r1
            boolean r2 = m3291b(r1)
            if (r2 == 0) goto L_0x001c
            a.j.a.c r1 = r1.f747b
            r1.m3253a(r4)
        L_0x001c:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x001f:
            return
    }

    /* renamed from: a */
    public void m3298a(java.lang.String r1, java.io.FileDescriptor r2, java.io.PrintWriter r3, java.lang.String[] r4) {
            r0 = this;
            r2 = 1
            r0.m3297a(r1, r3, r2)
            return
    }

    /* renamed from: a */
    public void m3297a(java.lang.String r6, java.io.PrintWriter r7, boolean r8) {
            r5 = this;
            if (r8 == 0) goto L_0x00da
            r7.print(r6)
            java.lang.String r0 = "mName="
            r7.print(r0)
            java.lang.String r0 = r5.f735j
            r7.print(r0)
            java.lang.String r0 = " mIndex="
            r7.print(r0)
            int r0 = r5.f737l
            r7.print(r0)
            java.lang.String r0 = " mCommitted="
            r7.print(r0)
            boolean r0 = r5.f736k
            r7.println(r0)
            int r0 = r5.f732g
            if (r0 == 0) goto L_0x0046
            r7.print(r6)
            java.lang.String r0 = "mTransition=#"
            r7.print(r0)
            int r0 = r5.f732g
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mTransitionStyle=#"
            r7.print(r0)
            int r0 = r5.f733h
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.println(r0)
        L_0x0046:
            int r0 = r5.f728c
            if (r0 != 0) goto L_0x004e
            int r0 = r5.f729d
            if (r0 == 0) goto L_0x006d
        L_0x004e:
            r7.print(r6)
            java.lang.String r0 = "mEnterAnim=#"
            r7.print(r0)
            int r0 = r5.f728c
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mExitAnim=#"
            r7.print(r0)
            int r0 = r5.f729d
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.println(r0)
        L_0x006d:
            int r0 = r5.f730e
            if (r0 != 0) goto L_0x0075
            int r0 = r5.f731f
            if (r0 == 0) goto L_0x0094
        L_0x0075:
            r7.print(r6)
            java.lang.String r0 = "mPopEnterAnim=#"
            r7.print(r0)
            int r0 = r5.f730e
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mPopExitAnim=#"
            r7.print(r0)
            int r0 = r5.f731f
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.println(r0)
        L_0x0094:
            int r0 = r5.f738m
            if (r0 != 0) goto L_0x009c
            java.lang.CharSequence r0 = r5.f739n
            if (r0 == 0) goto L_0x00b7
        L_0x009c:
            r7.print(r6)
            java.lang.String r0 = "mBreadCrumbTitleRes=#"
            r7.print(r0)
            int r0 = r5.f738m
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mBreadCrumbTitleText="
            r7.print(r0)
            java.lang.CharSequence r0 = r5.f739n
            r7.println(r0)
        L_0x00b7:
            int r0 = r5.f740o
            if (r0 != 0) goto L_0x00bf
            java.lang.CharSequence r0 = r5.f741p
            if (r0 == 0) goto L_0x00da
        L_0x00bf:
            r7.print(r6)
            java.lang.String r0 = "mBreadCrumbShortTitleRes=#"
            r7.print(r0)
            int r0 = r5.f740o
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mBreadCrumbShortTitleText="
            r7.print(r0)
            java.lang.CharSequence r0 = r5.f741p
            r7.println(r0)
        L_0x00da:
            java.util.ArrayList<a.j.a.a$a> r0 = r5.f727b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01b2
            r7.print(r6)
            java.lang.String r0 = "Operations:"
            r7.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r1 = "    "
            r0.append(r1)
            r0.toString()
            java.util.ArrayList<a.j.a.a$a> r0 = r5.f727b
            int r0 = r0.size()
            r1 = 0
        L_0x0101:
            if (r1 >= r0) goto L_0x01b2
            java.util.ArrayList<a.j.a.a$a> r2 = r5.f727b
            java.lang.Object r2 = r2.get(r1)
            a.j.a.a$a r2 = (p000a.p036j.p037a.C0244a.C0245a) r2
            int r3 = r2.f746a
            switch(r3) {
                case 0: goto L_0x013f;
                case 1: goto L_0x013c;
                case 2: goto L_0x0139;
                case 3: goto L_0x0136;
                case 4: goto L_0x0133;
                case 5: goto L_0x0130;
                case 6: goto L_0x012d;
                case 7: goto L_0x012a;
                case 8: goto L_0x0127;
                case 9: goto L_0x0124;
                default: goto L_0x0110;
            }
        L_0x0110:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "cmd="
            r3.append(r4)
            int r4 = r2.f746a
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L_0x0141
        L_0x0124:
            java.lang.String r3 = "UNSET_PRIMARY_NAV"
            goto L_0x0141
        L_0x0127:
            java.lang.String r3 = "SET_PRIMARY_NAV"
            goto L_0x0141
        L_0x012a:
            java.lang.String r3 = "ATTACH"
            goto L_0x0141
        L_0x012d:
            java.lang.String r3 = "DETACH"
            goto L_0x0141
        L_0x0130:
            java.lang.String r3 = "SHOW"
            goto L_0x0141
        L_0x0133:
            java.lang.String r3 = "HIDE"
            goto L_0x0141
        L_0x0136:
            java.lang.String r3 = "REMOVE"
            goto L_0x0141
        L_0x0139:
            java.lang.String r3 = "REPLACE"
            goto L_0x0141
        L_0x013c:
            java.lang.String r3 = "ADD"
            goto L_0x0141
        L_0x013f:
            java.lang.String r3 = "NULL"
        L_0x0141:
            r7.print(r6)
            java.lang.String r4 = "  Op #"
            r7.print(r4)
            r7.print(r1)
            java.lang.String r4 = ": "
            r7.print(r4)
            r7.print(r3)
            java.lang.String r3 = " "
            r7.print(r3)
            a.j.a.c r3 = r2.f747b
            r7.println(r3)
            if (r8 == 0) goto L_0x01ae
            int r3 = r2.f748c
            if (r3 != 0) goto L_0x0168
            int r3 = r2.f749d
            if (r3 == 0) goto L_0x0187
        L_0x0168:
            r7.print(r6)
            java.lang.String r3 = "enterAnim=#"
            r7.print(r3)
            int r3 = r2.f748c
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r7.print(r3)
            java.lang.String r3 = " exitAnim=#"
            r7.print(r3)
            int r3 = r2.f749d
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r7.println(r3)
        L_0x0187:
            int r3 = r2.f750e
            if (r3 != 0) goto L_0x018f
            int r3 = r2.f751f
            if (r3 == 0) goto L_0x01ae
        L_0x018f:
            r7.print(r6)
            java.lang.String r3 = "popEnterAnim=#"
            r7.print(r3)
            int r3 = r2.f750e
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r7.print(r3)
            java.lang.String r3 = " popExitAnim=#"
            r7.print(r3)
            int r2 = r2.f751f
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r7.println(r2)
        L_0x01ae:
            int r1 = r1 + 1
            goto L_0x0101
        L_0x01b2:
            return
    }

    /* renamed from: a */
    boolean m3296a(java.util.ArrayList<p000a.p036j.p037a.C0244a> r10, int r11, int r12) {
            r9 = this;
            r0 = 0
            if (r12 != r11) goto L_0x0004
            return r0
        L_0x0004:
            java.util.ArrayList<a.j.a.a$a> r1 = r9.f727b
            int r1 = r1.size()
            r2 = -1
            r2 = 0
            r3 = -1
        L_0x000d:
            if (r2 >= r1) goto L_0x0053
            java.util.ArrayList<a.j.a.a$a> r4 = r9.f727b
            java.lang.Object r4 = r4.get(r2)
            a.j.a.a$a r4 = (p000a.p036j.p037a.C0244a.C0245a) r4
            a.j.a.c r4 = r4.f747b
            if (r4 == 0) goto L_0x001e
            int r4 = r4.f813z
            goto L_0x001f
        L_0x001e:
            r4 = 0
        L_0x001f:
            if (r4 == 0) goto L_0x0050
            if (r4 == r3) goto L_0x0050
            r3 = r11
        L_0x0024:
            if (r3 >= r12) goto L_0x004f
            java.lang.Object r5 = r10.get(r3)
            a.j.a.a r5 = (p000a.p036j.p037a.C0244a) r5
            java.util.ArrayList<a.j.a.a$a> r6 = r5.f727b
            int r6 = r6.size()
            r7 = 0
        L_0x0033:
            if (r7 >= r6) goto L_0x004c
            java.util.ArrayList<a.j.a.a$a> r8 = r5.f727b
            java.lang.Object r8 = r8.get(r7)
            a.j.a.a$a r8 = (p000a.p036j.p037a.C0244a.C0245a) r8
            a.j.a.c r8 = r8.f747b
            if (r8 == 0) goto L_0x0044
            int r8 = r8.f813z
            goto L_0x0045
        L_0x0044:
            r8 = 0
        L_0x0045:
            if (r8 != r4) goto L_0x0049
            r10 = 1
            return r10
        L_0x0049:
            int r7 = r7 + 1
            goto L_0x0033
        L_0x004c:
            int r3 = r3 + 1
            goto L_0x0024
        L_0x004f:
            r3 = r4
        L_0x0050:
            int r2 = r2 + 1
            goto L_0x000d
        L_0x0053:
            return r0
    }

    @Override // p000a.p036j.p037a.LayoutInflater$Factory2C0266i.AbstractC0280l
    /* renamed from: a */
    public boolean mo3004a(java.util.ArrayList<p000a.p036j.p037a.C0244a> r3, java.util.ArrayList<java.lang.Boolean> r4) {
            r2 = this;
            boolean r0 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.f855F
            if (r0 == 0) goto L_0x001a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Run: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L_0x001a:
            r3.add(r2)
            r3 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4.add(r3)
            boolean r3 = r2.f734i
            if (r3 == 0) goto L_0x002e
            a.j.a.i r3 = r2.f726a
            r3.m3106a(r2)
        L_0x002e:
            r3 = 1
            return r3
    }

    /* renamed from: b */
    p000a.p036j.p037a.ComponentCallbacksC0248c m3290b(java.util.ArrayList<p000a.p036j.p037a.ComponentCallbacksC0248c> r5, p000a.p036j.p037a.ComponentCallbacksC0248c r6) {
            r4 = this;
            r0 = 0
        L_0x0001:
            java.util.ArrayList<a.j.a.a$a> r1 = r4.f727b
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x0030
            java.util.ArrayList<a.j.a.a$a> r1 = r4.f727b
            java.lang.Object r1 = r1.get(r0)
            a.j.a.a$a r1 = (p000a.p036j.p037a.C0244a.C0245a) r1
            int r2 = r1.f746a
            r3 = 1
            if (r2 == r3) goto L_0x0028
            r3 = 3
            if (r2 == r3) goto L_0x0022
            switch(r2) {
                case 6: goto L_0x0022;
                case 7: goto L_0x0028;
                case 8: goto L_0x0020;
                case 9: goto L_0x001d;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x002d
        L_0x001d:
            a.j.a.c r6 = r1.f747b
            goto L_0x002d
        L_0x0020:
            r6 = 0
            goto L_0x002d
        L_0x0022:
            a.j.a.c r1 = r1.f747b
            r5.add(r1)
            goto L_0x002d
        L_0x0028:
            a.j.a.c r1 = r1.f747b
            r5.remove(r1)
        L_0x002d:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0030:
            return r6
    }

    /* renamed from: b */
    void m3293b() {
            r8 = this;
            java.util.ArrayList<a.j.a.a$a> r0 = r8.f727b
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L_0x0008:
            r3 = 1
            if (r2 >= r0) goto L_0x009d
            java.util.ArrayList<a.j.a.a$a> r4 = r8.f727b
            java.lang.Object r4 = r4.get(r2)
            a.j.a.a$a r4 = (p000a.p036j.p037a.C0244a.C0245a) r4
            a.j.a.c r5 = r4.f747b
            if (r5 == 0) goto L_0x001e
            int r6 = r8.f732g
            int r7 = r8.f733h
            r5.m3258a(r6, r7)
        L_0x001e:
            int r6 = r4.f746a
            switch(r6) {
                case 1: goto L_0x0080;
                case 2: goto L_0x0023;
                case 3: goto L_0x0075;
                case 4: goto L_0x006a;
                case 5: goto L_0x005f;
                case 6: goto L_0x0054;
                case 7: goto L_0x0049;
                case 8: goto L_0x0043;
                case 9: goto L_0x003c;
                default: goto L_0x0023;
            }
        L_0x0023:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown cmd: "
            r1.append(r2)
            int r2 = r4.f746a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x003c:
            a.j.a.i r6 = r8.f726a
            r7 = 0
            r6.m3019n(r7)
            goto L_0x008a
        L_0x0043:
            a.j.a.i r6 = r8.f726a
            r6.m3019n(r5)
            goto L_0x008a
        L_0x0049:
            int r6 = r4.f748c
            r5.m3259a(r6)
            a.j.a.i r6 = r8.f726a
            r6.m3104a(r5)
            goto L_0x008a
        L_0x0054:
            int r6 = r4.f749d
            r5.m3259a(r6)
            a.j.a.i r6 = r8.f726a
            r6.m3053c(r5)
            goto L_0x008a
        L_0x005f:
            int r6 = r4.f748c
            r5.m3259a(r6)
            a.j.a.i r6 = r8.f726a
            r6.m3017o(r5)
            goto L_0x008a
        L_0x006a:
            int r6 = r4.f749d
            r5.m3259a(r6)
            a.j.a.i r6 = r8.f726a
            r6.m3041e(r5)
            goto L_0x008a
        L_0x0075:
            int r6 = r4.f749d
            r5.m3259a(r6)
            a.j.a.i r6 = r8.f726a
            r6.m3025k(r5)
            goto L_0x008a
        L_0x0080:
            int r6 = r4.f748c
            r5.m3259a(r6)
            a.j.a.i r6 = r8.f726a
            r6.m3097a(r5, r1)
        L_0x008a:
            boolean r6 = r8.f744s
            if (r6 != 0) goto L_0x0099
            int r4 = r4.f746a
            if (r4 == r3) goto L_0x0099
            if (r5 == 0) goto L_0x0099
            a.j.a.i r3 = r8.f726a
            r3.m3032h(r5)
        L_0x0099:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x009d:
            boolean r0 = r8.f744s
            if (r0 != 0) goto L_0x00a8
            a.j.a.i r0 = r8.f726a
            int r1 = r0.f875m
            r0.m3108a(r1, r3)
        L_0x00a8:
            return
    }

    /* renamed from: b */
    void m3289b(boolean r7) {
            r6 = this;
            java.util.ArrayList<a.j.a.a$a> r0 = r6.f727b
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L_0x0008:
            if (r0 < 0) goto L_0x00a2
            java.util.ArrayList<a.j.a.a$a> r2 = r6.f727b
            java.lang.Object r2 = r2.get(r0)
            a.j.a.a$a r2 = (p000a.p036j.p037a.C0244a.C0245a) r2
            a.j.a.c r3 = r2.f747b
            if (r3 == 0) goto L_0x0021
            int r4 = r6.f732g
            int r4 = p000a.p036j.p037a.LayoutInflater$Factory2C0266i.m3042e(r4)
            int r5 = r6.f733h
            r3.m3258a(r4, r5)
        L_0x0021:
            int r4 = r2.f746a
            switch(r4) {
                case 1: goto L_0x0084;
                case 2: goto L_0x0026;
                case 3: goto L_0x0078;
                case 4: goto L_0x006d;
                case 5: goto L_0x0062;
                case 6: goto L_0x0057;
                case 7: goto L_0x004c;
                case 8: goto L_0x0045;
                case 9: goto L_0x003f;
                default: goto L_0x0026;
            }
        L_0x0026:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown cmd: "
            r0.append(r1)
            int r1 = r2.f746a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x003f:
            a.j.a.i r4 = r6.f726a
            r4.m3019n(r3)
            goto L_0x008e
        L_0x0045:
            a.j.a.i r4 = r6.f726a
            r5 = 0
            r4.m3019n(r5)
            goto L_0x008e
        L_0x004c:
            int r4 = r2.f751f
            r3.m3259a(r4)
            a.j.a.i r4 = r6.f726a
            r4.m3053c(r3)
            goto L_0x008e
        L_0x0057:
            int r4 = r2.f750e
            r3.m3259a(r4)
            a.j.a.i r4 = r6.f726a
            r4.m3104a(r3)
            goto L_0x008e
        L_0x0062:
            int r4 = r2.f751f
            r3.m3259a(r4)
            a.j.a.i r4 = r6.f726a
            r4.m3041e(r3)
            goto L_0x008e
        L_0x006d:
            int r4 = r2.f750e
            r3.m3259a(r4)
            a.j.a.i r4 = r6.f726a
            r4.m3017o(r3)
            goto L_0x008e
        L_0x0078:
            int r4 = r2.f750e
            r3.m3259a(r4)
            a.j.a.i r4 = r6.f726a
            r5 = 0
            r4.m3097a(r3, r5)
            goto L_0x008e
        L_0x0084:
            int r4 = r2.f751f
            r3.m3259a(r4)
            a.j.a.i r4 = r6.f726a
            r4.m3025k(r3)
        L_0x008e:
            boolean r4 = r6.f744s
            if (r4 != 0) goto L_0x009e
            int r2 = r2.f746a
            r4 = 3
            if (r2 == r4) goto L_0x009e
            if (r3 == 0) goto L_0x009e
            a.j.a.i r2 = r6.f726a
            r2.m3032h(r3)
        L_0x009e:
            int r0 = r0 + (-1)
            goto L_0x0008
        L_0x00a2:
            boolean r0 = r6.f744s
            if (r0 != 0) goto L_0x00af
            if (r7 == 0) goto L_0x00af
            a.j.a.i r7 = r6.f726a
            int r0 = r7.f875m
            r7.m3108a(r0, r1)
        L_0x00af:
            return
    }

    /* renamed from: b */
    boolean m3292b(int r5) {
            r4 = this;
            java.util.ArrayList<a.j.a.a$a> r0 = r4.f727b
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L_0x0008:
            if (r2 >= r0) goto L_0x0023
            java.util.ArrayList<a.j.a.a$a> r3 = r4.f727b
            java.lang.Object r3 = r3.get(r2)
            a.j.a.a$a r3 = (p000a.p036j.p037a.C0244a.C0245a) r3
            a.j.a.c r3 = r3.f747b
            if (r3 == 0) goto L_0x0019
            int r3 = r3.f813z
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            if (r3 == 0) goto L_0x0020
            if (r3 != r5) goto L_0x0020
            r5 = 1
            return r5
        L_0x0020:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x0023:
            return r1
    }

    /* renamed from: c */
    public java.lang.String m3288c() {
            r1 = this;
            java.lang.String r0 = r1.f735j
            return r0
    }

    /* renamed from: d */
    boolean m3287d() {
            r3 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            java.util.ArrayList<a.j.a.a$a> r2 = r3.f727b
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x001d
            java.util.ArrayList<a.j.a.a$a> r2 = r3.f727b
            java.lang.Object r2 = r2.get(r1)
            a.j.a.a$a r2 = (p000a.p036j.p037a.C0244a.C0245a) r2
            boolean r2 = m3291b(r2)
            if (r2 == 0) goto L_0x001a
            r0 = 1
            return r0
        L_0x001a:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x001d:
            return r0
    }

    /* renamed from: e */
    public void m3286e() {
            r3 = this;
            java.util.ArrayList<java.lang.Runnable> r0 = r3.f745t
            if (r0 == 0) goto L_0x001c
            r1 = 0
            int r0 = r0.size()
        L_0x0009:
            if (r1 >= r0) goto L_0x0019
            java.util.ArrayList<java.lang.Runnable> r2 = r3.f745t
            java.lang.Object r2 = r2.get(r1)
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            int r1 = r1 + 1
            goto L_0x0009
        L_0x0019:
            r0 = 0
            r3.f745t = r0
        L_0x001c:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.794E-43)
            r0.<init>(r1)
            java.lang.String r1 = "BackStackEntry{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            int r1 = r2.f737l
            if (r1 < 0) goto L_0x0025
            java.lang.String r1 = " #"
            r0.append(r1)
            int r1 = r2.f737l
            r0.append(r1)
        L_0x0025:
            java.lang.String r1 = r2.f735j
            if (r1 == 0) goto L_0x0033
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = r2.f735j
            r0.append(r1)
        L_0x0033:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
