package p000a.p018g.p026i;

/* renamed from: a.g.i.b */
/* loaded from: classes.dex */
public class C0161b {

    /* renamed from: a */
    static final p000a.p013d.C0073e<java.lang.String, android.graphics.Typeface> f579a = null;

    /* renamed from: b */
    private static final p000a.p018g.p026i.C0169c f580b = null;

    /* renamed from: c */
    static final java.lang.Object f581c = null;

    /* renamed from: d */
    static final p000a.p013d.C0080g<java.lang.String, java.util.ArrayList<p000a.p018g.p026i.C0169c.AbstractC0174d<p000a.p018g.p026i.C0161b.C0168g>>> f582d = null;

    /* renamed from: e */
    private static final java.util.Comparator<byte[]> f583e = null;

    /* renamed from: a.g.i.b$a */
    /* loaded from: classes.dex */
    static class CallableC0162a implements java.util.concurrent.Callable<p000a.p018g.p026i.C0161b.C0168g> {

        /* renamed from: a */
        final /* synthetic */ android.content.Context f584a;

        /* renamed from: b */
        final /* synthetic */ p000a.p018g.p026i.C0160a f585b;

        /* renamed from: c */
        final /* synthetic */ int f586c;

        /* renamed from: d */
        final /* synthetic */ java.lang.String f587d;

        CallableC0162a(android.content.Context r1, p000a.p018g.p026i.C0160a r2, int r3, java.lang.String r4) {
                r0 = this;
                r0.f584a = r1
                r0.f585b = r2
                r0.f586c = r3
                r0.f587d = r4
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public p000a.p018g.p026i.C0161b.C0168g call() {
                r4 = this;
                android.content.Context r0 = r4.f584a
                a.g.i.a r1 = r4.f585b
                int r2 = r4.f586c
                a.g.i.b$g r0 = p000a.p018g.p026i.C0161b.m3598a(r0, r1, r2)
                android.graphics.Typeface r1 = r0.f598a
                if (r1 == 0) goto L_0x0015
                a.d.e<java.lang.String, android.graphics.Typeface> r2 = p000a.p018g.p026i.C0161b.f579a
                java.lang.String r3 = r4.f587d
                r2.m4048a(r3, r1)
            L_0x0015:
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ p000a.p018g.p026i.C0161b.C0168g call() {
                r1 = this;
                a.g.i.b$g r0 = r1.call()
                return r0
        }
    }

    /* renamed from: a.g.i.b$b */
    /* loaded from: classes.dex */
    static class C0163b implements p000a.p018g.p026i.C0169c.AbstractC0174d<p000a.p018g.p026i.C0161b.C0168g> {

        /* renamed from: a */
        final /* synthetic */ p000a.p018g.p019d.p020c.C0136f.AbstractC0137a f588a;

        /* renamed from: b */
        final /* synthetic */ android.os.Handler f589b;

        C0163b(p000a.p018g.p019d.p020c.C0136f.AbstractC0137a r1, android.os.Handler r2) {
                r0 = this;
                r0.f588a = r1
                r0.f589b = r2
                r0.<init>()
                return
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void m3590a(p000a.p018g.p026i.C0161b.C0168g r3) {
                r2 = this;
                if (r3 != 0) goto L_0x000b
                a.g.d.c.f$a r3 = r2.f588a
                r0 = 1
            L_0x0005:
                android.os.Handler r1 = r2.f589b
                r3.m3683a(r0, r1)
                goto L_0x001c
            L_0x000b:
                int r0 = r3.f599b
                if (r0 != 0) goto L_0x0019
                a.g.d.c.f$a r0 = r2.f588a
                android.graphics.Typeface r3 = r3.f598a
                android.os.Handler r1 = r2.f589b
                r0.m3682a(r3, r1)
                goto L_0x001c
            L_0x0019:
                a.g.d.c.f$a r3 = r2.f588a
                goto L_0x0005
            L_0x001c:
                return
        }

        @Override // p000a.p018g.p026i.C0169c.AbstractC0174d
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo3575a(p000a.p018g.p026i.C0161b.C0168g r1) {
                r0 = this;
                a.g.i.b$g r1 = (p000a.p018g.p026i.C0161b.C0168g) r1
                r0.m3590a(r1)
                return
        }
    }

    /* renamed from: a.g.i.b$c */
    /* loaded from: classes.dex */
    static class C0164c implements p000a.p018g.p026i.C0169c.AbstractC0174d<p000a.p018g.p026i.C0161b.C0168g> {

        /* renamed from: a */
        final /* synthetic */ java.lang.String f590a;

        C0164c(java.lang.String r1) {
                r0 = this;
                r0.f590a = r1
                r0.<init>()
                return
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void m3589a(p000a.p018g.p026i.C0161b.C0168g r5) {
                r4 = this;
                java.lang.Object r0 = p000a.p018g.p026i.C0161b.f581c
                monitor-enter(r0)
                a.d.g<java.lang.String, java.util.ArrayList<a.g.i.c$d<a.g.i.b$g>>> r1 = p000a.p018g.p026i.C0161b.f582d     // Catch: all -> 0x002d
                java.lang.String r2 = r4.f590a     // Catch: all -> 0x002d
                java.lang.Object r1 = r1.get(r2)     // Catch: all -> 0x002d
                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: all -> 0x002d
                if (r1 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch: all -> 0x002d
                return
            L_0x0011:
                a.d.g<java.lang.String, java.util.ArrayList<a.g.i.c$d<a.g.i.b$g>>> r2 = p000a.p018g.p026i.C0161b.f582d     // Catch: all -> 0x002d
                java.lang.String r3 = r4.f590a     // Catch: all -> 0x002d
                r2.remove(r3)     // Catch: all -> 0x002d
                monitor-exit(r0)     // Catch: all -> 0x002d
                r0 = 0
            L_0x001a:
                int r2 = r1.size()
                if (r0 >= r2) goto L_0x002c
                java.lang.Object r2 = r1.get(r0)
                a.g.i.c$d r2 = (p000a.p018g.p026i.C0169c.AbstractC0174d) r2
                r2.mo3575a(r5)
                int r0 = r0 + 1
                goto L_0x001a
            L_0x002c:
                return
            L_0x002d:
                r5 = move-exception
                monitor-exit(r0)     // Catch: all -> 0x002d
                goto L_0x0031
            L_0x0030:
                throw r5
            L_0x0031:
                goto L_0x0030
        }

        @Override // p000a.p018g.p026i.C0169c.AbstractC0174d
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo3575a(p000a.p018g.p026i.C0161b.C0168g r1) {
                r0 = this;
                a.g.i.b$g r1 = (p000a.p018g.p026i.C0161b.C0168g) r1
                r0.m3589a(r1)
                return
        }
    }

    /* renamed from: a.g.i.b$d */
    /* loaded from: classes.dex */
    static class C0165d implements java.util.Comparator<byte[]> {
        C0165d() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public int m3588a(byte[] r5, byte[] r6) {
                r4 = this;
                int r0 = r5.length
                int r1 = r6.length
                if (r0 == r1) goto L_0x0008
                int r5 = r5.length
                int r6 = r6.length
            L_0x0006:
                int r5 = r5 - r6
                return r5
            L_0x0008:
                r0 = 0
                r1 = 0
            L_0x000a:
                int r2 = r5.length
                if (r1 >= r2) goto L_0x001b
                r2 = r5[r1]
                r3 = r6[r1]
                if (r2 == r3) goto L_0x0018
                r5 = r5[r1]
                r6 = r6[r1]
                goto L_0x0006
            L_0x0018:
                int r1 = r1 + 1
                goto L_0x000a
            L_0x001b:
                return r0
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(byte[] r1, byte[] r2) {
                r0 = this;
                byte[] r1 = (byte[]) r1
                byte[] r2 = (byte[]) r2
                int r1 = r0.m3588a(r1, r2)
                return r1
        }
    }

    /* renamed from: a.g.i.b$e */
    /* loaded from: classes.dex */
    public static class C0166e {

        /* renamed from: a */
        private final int f591a;

        /* renamed from: b */
        private final p000a.p018g.p026i.C0161b.C0167f[] f592b;

        public C0166e(int r1, p000a.p018g.p026i.C0161b.C0167f[] r2) {
                r0 = this;
                r0.<init>()
                r0.f591a = r1
                r0.f592b = r2
                return
        }

        /* renamed from: a */
        public p000a.p018g.p026i.C0161b.C0167f[] m3587a() {
                r1 = this;
                a.g.i.b$f[] r0 = r1.f592b
                return r0
        }

        /* renamed from: b */
        public int m3586b() {
                r1 = this;
                int r0 = r1.f591a
                return r0
        }
    }

    /* renamed from: a.g.i.b$f */
    /* loaded from: classes.dex */
    public static class C0167f {

        /* renamed from: a */
        private final android.net.Uri f593a;

        /* renamed from: b */
        private final int f594b;

        /* renamed from: c */
        private final int f595c;

        /* renamed from: d */
        private final boolean f596d;

        /* renamed from: e */
        private final int f597e;

        public C0167f(android.net.Uri r1, int r2, int r3, boolean r4, int r5) {
                r0 = this;
                r0.<init>()
                p000a.p018g.p028k.C0184g.m3556a(r1)
                android.net.Uri r1 = (android.net.Uri) r1
                r0.f593a = r1
                r0.f594b = r2
                r0.f595c = r3
                r0.f596d = r4
                r0.f597e = r5
                return
        }

        /* renamed from: a */
        public int m3585a() {
                r1 = this;
                int r0 = r1.f597e
                return r0
        }

        /* renamed from: b */
        public int m3584b() {
                r1 = this;
                int r0 = r1.f594b
                return r0
        }

        /* renamed from: c */
        public android.net.Uri m3583c() {
                r1 = this;
                android.net.Uri r0 = r1.f593a
                return r0
        }

        /* renamed from: d */
        public int m3582d() {
                r1 = this;
                int r0 = r1.f595c
                return r0
        }

        /* renamed from: e */
        public boolean m3581e() {
                r1 = this;
                boolean r0 = r1.f596d
                return r0
        }
    }

    /* renamed from: a.g.i.b$g */
    /* loaded from: classes.dex */
    private static final class C0168g {

        /* renamed from: a */
        final android.graphics.Typeface f598a;

        /* renamed from: b */
        final int f599b;

        C0168g(android.graphics.Typeface r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f598a = r1
                r0.f599b = r2
                return
        }
    }

    static {
            a.d.e r0 = new a.d.e
            r1 = 16
            r0.<init>(r1)
            p000a.p018g.p026i.C0161b.f579a = r0
            a.g.i.c r0 = new a.g.i.c
            java.lang.String r1 = "fonts"
            r2 = 10
            r3 = 10000(0x2710, float:1.4013E-41)
            r0.<init>(r1, r2, r3)
            p000a.p018g.p026i.C0161b.f580b = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000a.p018g.p026i.C0161b.f581c = r0
            a.d.g r0 = new a.d.g
            r0.<init>()
            p000a.p018g.p026i.C0161b.f582d = r0
            a.g.i.b$d r0 = new a.g.i.b$d
            r0.<init>()
            p000a.p018g.p026i.C0161b.f583e = r0
            return
    }

    /* renamed from: a */
    public static p000a.p018g.p026i.C0161b.C0166e m3595a(android.content.Context r2, android.os.CancellationSignal r3, p000a.p018g.p026i.C0160a r4) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            android.content.res.Resources r1 = r2.getResources()
            android.content.pm.ProviderInfo r0 = m3593a(r0, r4, r1)
            if (r0 != 0) goto L_0x0016
            a.g.i.b$e r2 = new a.g.i.b$e
            r3 = 1
            r4 = 0
            r2.<init>(r3, r4)
            return r2
        L_0x0016:
            java.lang.String r0 = r0.authority
            a.g.i.b$f[] r2 = m3596a(r2, r4, r0, r3)
            a.g.i.b$e r3 = new a.g.i.b$e
            r4 = 0
            r3.<init>(r4, r2)
            return r3
    }

    /* renamed from: a */
    static p000a.p018g.p026i.C0161b.C0168g m3598a(android.content.Context r3, p000a.p018g.p026i.C0160a r4, int r5) {
            r0 = 0
            a.g.i.b$e r4 = m3595a(r3, r0, r4)     // Catch: NameNotFoundException -> 0x002b
            int r1 = r4.m3586b()
            r2 = -3
            if (r1 != 0) goto L_0x001d
            a.g.i.b$f[] r4 = r4.m3587a()
            android.graphics.Typeface r3 = p000a.p018g.p021e.C0145c.m3650a(r3, r0, r4, r5)
            a.g.i.b$g r4 = new a.g.i.b$g
            if (r3 == 0) goto L_0x0019
            r2 = 0
        L_0x0019:
            r4.<init>(r3, r2)
            return r4
        L_0x001d:
            int r3 = r4.m3586b()
            r4 = 1
            if (r3 != r4) goto L_0x0025
            r2 = -2
        L_0x0025:
            a.g.i.b$g r3 = new a.g.i.b$g
            r3.<init>(r0, r2)
            return r3
        L_0x002b:
            a.g.i.b$g r3 = new a.g.i.b$g
            r4 = -1
            r3.<init>(r0, r4)
            return r3
    }

    /* renamed from: a */
    public static android.content.pm.ProviderInfo m3593a(android.content.pm.PackageManager r5, p000a.p018g.p026i.C0160a r6, android.content.res.Resources r7) {
            java.lang.String r0 = r6.m3602d()
            r1 = 0
            android.content.pm.ProviderInfo r2 = r5.resolveContentProvider(r0, r1)
            if (r2 == 0) goto L_0x0073
            java.lang.String r3 = r2.packageName
            java.lang.String r4 = r6.m3601e()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0050
            java.lang.String r0 = r2.packageName
            r3 = 64
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r0, r3)
            android.content.pm.Signature[] r5 = r5.signatures
            java.util.List r5 = m3591a(r5)
            java.util.Comparator<byte[]> r0 = p000a.p018g.p026i.C0161b.f583e
            java.util.Collections.sort(r5, r0)
            java.util.List r6 = m3599a(r6, r7)
        L_0x002e:
            int r7 = r6.size()
            if (r1 >= r7) goto L_0x004e
            java.util.ArrayList r7 = new java.util.ArrayList
            java.lang.Object r0 = r6.get(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            r7.<init>(r0)
            java.util.Comparator<byte[]> r0 = p000a.p018g.p026i.C0161b.f583e
            java.util.Collections.sort(r7, r0)
            boolean r7 = m3592a(r5, r7)
            if (r7 == 0) goto L_0x004b
            return r2
        L_0x004b:
            int r1 = r1 + 1
            goto L_0x002e
        L_0x004e:
            r5 = 0
            return r5
        L_0x0050:
            android.content.pm.PackageManager$NameNotFoundException r5 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "Found content provider "
            r7.append(r1)
            r7.append(r0)
            java.lang.String r0 = ", but package was not "
            r7.append(r0)
            java.lang.String r6 = r6.m3601e()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        L_0x0073:
            android.content.pm.PackageManager$NameNotFoundException r5 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "No package found for authority: "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            goto L_0x008b
        L_0x008a:
            throw r5
        L_0x008b:
            goto L_0x008a
    }

    /* renamed from: a */
    public static android.graphics.Typeface m3597a(android.content.Context r2, p000a.p018g.p026i.C0160a r3, p000a.p018g.p019d.p020c.C0136f.AbstractC0137a r4, android.os.Handler r5, boolean r6, int r7, int r8) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.m3603c()
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            a.d.e<java.lang.String, android.graphics.Typeface> r1 = p000a.p018g.p026i.C0161b.f579a
            java.lang.Object r1 = r1.m4046b(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0028
            if (r4 == 0) goto L_0x0027
            r4.mo1800a(r1)
        L_0x0027:
            return r1
        L_0x0028:
            if (r6 == 0) goto L_0x0043
            r1 = -1
            if (r7 != r1) goto L_0x0043
            a.g.i.b$g r2 = m3598a(r2, r3, r8)
            if (r4 == 0) goto L_0x0040
            int r3 = r2.f599b
            if (r3 != 0) goto L_0x003d
            android.graphics.Typeface r3 = r2.f598a
            r4.m3682a(r3, r5)
            goto L_0x0040
        L_0x003d:
            r4.m3683a(r3, r5)
        L_0x0040:
            android.graphics.Typeface r2 = r2.f598a
            return r2
        L_0x0043:
            a.g.i.b$a r1 = new a.g.i.b$a
            r1.<init>(r2, r3, r8, r0)
            r2 = 0
            if (r6 == 0) goto L_0x0056
            a.g.i.c r3 = p000a.p018g.p026i.C0161b.f580b     // Catch: InterruptedException -> 0x0055
            java.lang.Object r3 = r3.m3578a(r1, r7)     // Catch: InterruptedException -> 0x0055
            a.g.i.b$g r3 = (p000a.p018g.p026i.C0161b.C0168g) r3     // Catch: InterruptedException -> 0x0055
            android.graphics.Typeface r2 = r3.f598a     // Catch: InterruptedException -> 0x0055
        L_0x0055:
            return r2
        L_0x0056:
            if (r4 != 0) goto L_0x005a
            r3 = r2
            goto L_0x005f
        L_0x005a:
            a.g.i.b$b r3 = new a.g.i.b$b
            r3.<init>(r4, r5)
        L_0x005f:
            java.lang.Object r4 = p000a.p018g.p026i.C0161b.f581c
            monitor-enter(r4)
            a.d.g<java.lang.String, java.util.ArrayList<a.g.i.c$d<a.g.i.b$g>>> r5 = p000a.p018g.p026i.C0161b.f582d     // Catch: all -> 0x0094
            boolean r5 = r5.containsKey(r0)     // Catch: all -> 0x0094
            if (r5 == 0) goto L_0x0079
            if (r3 == 0) goto L_0x0077
            a.d.g<java.lang.String, java.util.ArrayList<a.g.i.c$d<a.g.i.b$g>>> r5 = p000a.p018g.p026i.C0161b.f582d     // Catch: all -> 0x0094
            java.lang.Object r5 = r5.get(r0)     // Catch: all -> 0x0094
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: all -> 0x0094
            r5.add(r3)     // Catch: all -> 0x0094
        L_0x0077:
            monitor-exit(r4)     // Catch: all -> 0x0094
            return r2
        L_0x0079:
            if (r3 == 0) goto L_0x0088
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: all -> 0x0094
            r5.<init>()     // Catch: all -> 0x0094
            r5.add(r3)     // Catch: all -> 0x0094
            a.d.g<java.lang.String, java.util.ArrayList<a.g.i.c$d<a.g.i.b$g>>> r3 = p000a.p018g.p026i.C0161b.f582d     // Catch: all -> 0x0094
            r3.put(r0, r5)     // Catch: all -> 0x0094
        L_0x0088:
            monitor-exit(r4)     // Catch: all -> 0x0094
            a.g.i.c r3 = p000a.p018g.p026i.C0161b.f580b
            a.g.i.b$c r4 = new a.g.i.b$c
            r4.<init>(r0)
            r3.m3577a(r1, r4)
            return r2
        L_0x0094:
            r2 = move-exception
            monitor-exit(r4)     // Catch: all -> 0x0094
            throw r2
    }

    /* renamed from: a */
    private static java.util.List<java.util.List<byte[]>> m3599a(p000a.p018g.p026i.C0160a r1, android.content.res.Resources r2) {
            java.util.List r0 = r1.m3605a()
            if (r0 == 0) goto L_0x000b
            java.util.List r1 = r1.m3605a()
            return r1
        L_0x000b:
            int r1 = r1.m3604b()
            java.util.List r1 = p000a.p018g.p019d.p020c.C0128c.m3712a(r2, r1)
            return r1
    }

    /* renamed from: a */
    private static java.util.List<byte[]> m3591a(android.content.pm.Signature[] r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L_0x0006:
            int r2 = r3.length
            if (r1 >= r2) goto L_0x0015
            r2 = r3[r1]
            byte[] r2 = r2.toByteArray()
            r0.add(r2)
            int r1 = r1 + 1
            goto L_0x0006
        L_0x0015:
            return r0
    }

    /* renamed from: a */
    public static java.util.Map<android.net.Uri, java.nio.ByteBuffer> m3594a(android.content.Context r5, p000a.p018g.p026i.C0161b.C0167f[] r6, android.os.CancellationSignal r7) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r6.length
            r2 = 0
        L_0x0007:
            if (r2 >= r1) goto L_0x0027
            r3 = r6[r2]
            int r4 = r3.m3585a()
            if (r4 == 0) goto L_0x0012
            goto L_0x0024
        L_0x0012:
            android.net.Uri r3 = r3.m3583c()
            boolean r4 = r0.containsKey(r3)
            if (r4 == 0) goto L_0x001d
            goto L_0x0024
        L_0x001d:
            java.nio.ByteBuffer r4 = p000a.p018g.p021e.C0154i.m3613a(r5, r7, r3)
            r0.put(r3, r4)
        L_0x0024:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x0027:
            java.util.Map r5 = java.util.Collections.unmodifiableMap(r0)
            return r5
    }

    /* renamed from: a */
    private static boolean m3592a(java.util.List<byte[]> r4, java.util.List<byte[]> r5) {
            int r0 = r4.size()
            int r1 = r5.size()
            r2 = 0
            if (r0 == r1) goto L_0x000c
            return r2
        L_0x000c:
            r0 = 0
        L_0x000d:
            int r1 = r4.size()
            if (r0 >= r1) goto L_0x0029
            java.lang.Object r1 = r4.get(r0)
            byte[] r1 = (byte[]) r1
            java.lang.Object r3 = r5.get(r0)
            byte[] r3 = (byte[]) r3
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 != 0) goto L_0x0026
            return r2
        L_0x0026:
            int r0 = r0 + 1
            goto L_0x000d
        L_0x0029:
            r4 = 1
            return r4
    }

    /* renamed from: a */
    static p000a.p018g.p026i.C0161b.C0167f[] m3596a(android.content.Context r19, p000a.p018g.p026i.C0160a r20, java.lang.String r21, android.os.CancellationSignal r22) {
            r0 = r21
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r3 = "content"
            android.net.Uri$Builder r2 = r2.scheme(r3)
            android.net.Uri$Builder r2 = r2.authority(r0)
            android.net.Uri r2 = r2.build()
            android.net.Uri$Builder r4 = new android.net.Uri$Builder
            r4.<init>()
            android.net.Uri$Builder r3 = r4.scheme(r3)
            android.net.Uri$Builder r0 = r3.authority(r0)
            java.lang.String r3 = "file"
            android.net.Uri$Builder r0 = r0.appendPath(r3)
            android.net.Uri r0 = r0.build()
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: all -> 0x0137
            r5 = 16
            java.lang.String r7 = "font_variation_settings"
            r9 = 2
            r10 = 7
            java.lang.String r11 = "result_code"
            java.lang.String r12 = "font_italic"
            java.lang.String r13 = "font_weight"
            java.lang.String r14 = "font_ttc_index"
            java.lang.String r15 = "file_id"
            java.lang.String r3 = "_id"
            r6 = 1
            r8 = 0
            if (r4 <= r5) goto L_0x007e
            android.content.ContentResolver r4 = r19.getContentResolver()     // Catch: all -> 0x0137
            java.lang.String[] r10 = new java.lang.String[r10]     // Catch: all -> 0x0137
            r10[r8] = r3     // Catch: all -> 0x0137
            r10[r6] = r15     // Catch: all -> 0x0137
            r10[r9] = r14     // Catch: all -> 0x0137
            r5 = 3
            r10[r5] = r7     // Catch: all -> 0x0137
            r5 = 4
            r10[r5] = r13     // Catch: all -> 0x0137
            r5 = 5
            r10[r5] = r12     // Catch: all -> 0x0137
            r5 = 6
            r10[r5] = r11     // Catch: all -> 0x0137
            java.lang.String r7 = "query = ?"
            java.lang.String[] r9 = new java.lang.String[r6]     // Catch: all -> 0x0137
            java.lang.String r5 = r20.m3600f()     // Catch: all -> 0x0137
            r9[r8] = r5     // Catch: all -> 0x0137
            r16 = 0
            r5 = r2
            r18 = r1
            r1 = 1
            r6 = r10
            r10 = 0
            r8 = r9
            r9 = r16
            r1 = 0
            r10 = r22
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10)     // Catch: all -> 0x0137
            goto L_0x00ab
        L_0x007e:
            r18 = r1
            r1 = 0
            android.content.ContentResolver r4 = r19.getContentResolver()     // Catch: all -> 0x0137
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch: all -> 0x0137
            r6[r1] = r3     // Catch: all -> 0x0137
            r5 = 1
            r6[r5] = r15     // Catch: all -> 0x0137
            r6[r9] = r14     // Catch: all -> 0x0137
            r5 = 3
            r6[r5] = r7     // Catch: all -> 0x0137
            r5 = 4
            r6[r5] = r13     // Catch: all -> 0x0137
            r5 = 5
            r6[r5] = r12     // Catch: all -> 0x0137
            r5 = 6
            r6[r5] = r11     // Catch: all -> 0x0137
            java.lang.String r7 = "query = ?"
            r5 = 1
            java.lang.String[] r8 = new java.lang.String[r5]     // Catch: all -> 0x0137
            java.lang.String r5 = r20.m3600f()     // Catch: all -> 0x0137
            r8[r1] = r5     // Catch: all -> 0x0137
            r9 = 0
            r5 = r2
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9)     // Catch: all -> 0x0137
        L_0x00ab:
            if (r4 == 0) goto L_0x0127
            int r5 = r4.getCount()     // Catch: all -> 0x0125
            if (r5 <= 0) goto L_0x0127
            int r5 = r4.getColumnIndex(r11)     // Catch: all -> 0x0125
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: all -> 0x0125
            r6.<init>()     // Catch: all -> 0x0125
            int r3 = r4.getColumnIndex(r3)     // Catch: all -> 0x0125
            int r7 = r4.getColumnIndex(r15)     // Catch: all -> 0x0125
            int r8 = r4.getColumnIndex(r14)     // Catch: all -> 0x0125
            int r9 = r4.getColumnIndex(r13)     // Catch: all -> 0x0125
            int r10 = r4.getColumnIndex(r12)     // Catch: all -> 0x0125
        L_0x00d0:
            boolean r11 = r4.moveToNext()     // Catch: all -> 0x0125
            if (r11 == 0) goto L_0x0129
            r11 = -1
            if (r5 == r11) goto L_0x00e0
            int r12 = r4.getInt(r5)     // Catch: all -> 0x0125
            r18 = r12
            goto L_0x00e2
        L_0x00e0:
            r18 = 0
        L_0x00e2:
            if (r8 == r11) goto L_0x00ea
            int r12 = r4.getInt(r8)     // Catch: all -> 0x0125
            r15 = r12
            goto L_0x00eb
        L_0x00ea:
            r15 = 0
        L_0x00eb:
            if (r7 != r11) goto L_0x00f6
            long r12 = r4.getLong(r3)     // Catch: all -> 0x0125
            android.net.Uri r12 = android.content.ContentUris.withAppendedId(r2, r12)     // Catch: all -> 0x0125
            goto L_0x00fe
        L_0x00f6:
            long r12 = r4.getLong(r7)     // Catch: all -> 0x0125
            android.net.Uri r12 = android.content.ContentUris.withAppendedId(r0, r12)     // Catch: all -> 0x0125
        L_0x00fe:
            r14 = r12
            if (r9 == r11) goto L_0x0108
            int r12 = r4.getInt(r9)     // Catch: all -> 0x0125
            r16 = r12
            goto L_0x010c
        L_0x0108:
            r12 = 400(0x190, float:5.6E-43)
            r16 = 400(0x190, float:5.6E-43)
        L_0x010c:
            if (r10 == r11) goto L_0x0118
            int r11 = r4.getInt(r10)     // Catch: all -> 0x0125
            r12 = 1
            if (r11 != r12) goto L_0x0119
            r17 = 1
            goto L_0x011b
        L_0x0118:
            r12 = 1
        L_0x0119:
            r17 = 0
        L_0x011b:
            a.g.i.b$f r11 = new a.g.i.b$f     // Catch: all -> 0x0125
            r13 = r11
            r13.<init>(r14, r15, r16, r17, r18)     // Catch: all -> 0x0125
            r6.add(r11)     // Catch: all -> 0x0125
            goto L_0x00d0
        L_0x0125:
            r0 = move-exception
            goto L_0x0139
        L_0x0127:
            r6 = r18
        L_0x0129:
            if (r4 == 0) goto L_0x012e
            r4.close()
        L_0x012e:
            a.g.i.b$f[] r0 = new p000a.p018g.p026i.C0161b.C0167f[r1]
            java.lang.Object[] r0 = r6.toArray(r0)
            a.g.i.b$f[] r0 = (p000a.p018g.p026i.C0161b.C0167f[]) r0
            return r0
        L_0x0137:
            r0 = move-exception
            r4 = 0
        L_0x0139:
            if (r4 == 0) goto L_0x013e
            r4.close()
        L_0x013e:
            goto L_0x0140
        L_0x013f:
            throw r0
        L_0x0140:
            goto L_0x013f
    }
}
