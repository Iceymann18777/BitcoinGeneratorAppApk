package androidx.lifecycle;

/* renamed from: androidx.lifecycle.e */
/* loaded from: classes.dex */
public abstract class AbstractC0742e {

    /* renamed from: androidx.lifecycle.e$a */
    /* loaded from: classes.dex */
    public enum EnumC0743a {
        private static final /* synthetic */ androidx.lifecycle.AbstractC0742e.EnumC0743a[] $VALUES = null;
        public static final androidx.lifecycle.AbstractC0742e.EnumC0743a ON_ANY = null;
        public static final androidx.lifecycle.AbstractC0742e.EnumC0743a ON_CREATE = null;
        public static final androidx.lifecycle.AbstractC0742e.EnumC0743a ON_DESTROY = null;
        public static final androidx.lifecycle.AbstractC0742e.EnumC0743a ON_PAUSE = null;
        public static final androidx.lifecycle.AbstractC0742e.EnumC0743a ON_RESUME = null;
        public static final androidx.lifecycle.AbstractC0742e.EnumC0743a ON_START = null;
        public static final androidx.lifecycle.AbstractC0742e.EnumC0743a ON_STOP = null;

        static {
                androidx.lifecycle.e$a r0 = new androidx.lifecycle.e$a
                r1 = 0
                java.lang.String r2 = "ON_CREATE"
                r0.<init>(r2, r1)
                androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_CREATE = r0
                androidx.lifecycle.e$a r0 = new androidx.lifecycle.e$a
                r2 = 1
                java.lang.String r3 = "ON_START"
                r0.<init>(r3, r2)
                androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_START = r0
                androidx.lifecycle.e$a r0 = new androidx.lifecycle.e$a
                r3 = 2
                java.lang.String r4 = "ON_RESUME"
                r0.<init>(r4, r3)
                androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_RESUME = r0
                androidx.lifecycle.e$a r0 = new androidx.lifecycle.e$a
                r4 = 3
                java.lang.String r5 = "ON_PAUSE"
                r0.<init>(r5, r4)
                androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_PAUSE = r0
                androidx.lifecycle.e$a r0 = new androidx.lifecycle.e$a
                r5 = 4
                java.lang.String r6 = "ON_STOP"
                r0.<init>(r6, r5)
                androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_STOP = r0
                androidx.lifecycle.e$a r0 = new androidx.lifecycle.e$a
                r6 = 5
                java.lang.String r7 = "ON_DESTROY"
                r0.<init>(r7, r6)
                androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_DESTROY = r0
                androidx.lifecycle.e$a r0 = new androidx.lifecycle.e$a
                r7 = 6
                java.lang.String r8 = "ON_ANY"
                r0.<init>(r8, r7)
                androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_ANY = r0
                r0 = 7
                androidx.lifecycle.e$a[] r0 = new androidx.lifecycle.AbstractC0742e.EnumC0743a[r0]
                androidx.lifecycle.e$a r8 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_CREATE
                r0[r1] = r8
                androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_START
                r0[r2] = r1
                androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_RESUME
                r0[r3] = r1
                androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_PAUSE
                r0[r4] = r1
                androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_STOP
                r0[r5] = r1
                androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_DESTROY
                r0[r6] = r1
                androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_ANY
                r0[r7] = r1
                androidx.lifecycle.AbstractC0742e.EnumC0743a.$VALUES = r0
                return
        }

        EnumC0743a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.lifecycle.AbstractC0742e.EnumC0743a valueOf(java.lang.String r1) {
                java.lang.Class<androidx.lifecycle.e$a> r0 = androidx.lifecycle.AbstractC0742e.EnumC0743a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.lifecycle.e$a r1 = (androidx.lifecycle.AbstractC0742e.EnumC0743a) r1
                return r1
        }

        public static androidx.lifecycle.AbstractC0742e.EnumC0743a[] values() {
                androidx.lifecycle.e$a[] r0 = androidx.lifecycle.AbstractC0742e.EnumC0743a.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.lifecycle.e$a[] r0 = (androidx.lifecycle.AbstractC0742e.EnumC0743a[]) r0
                return r0
        }
    }

    /* renamed from: androidx.lifecycle.e$b */
    /* loaded from: classes.dex */
    public enum EnumC0744b {

        /* renamed from: b */
        public static final androidx.lifecycle.AbstractC0742e.EnumC0744b f2807b = null;

        /* renamed from: c */
        public static final androidx.lifecycle.AbstractC0742e.EnumC0744b f2808c = null;

        /* renamed from: d */
        public static final androidx.lifecycle.AbstractC0742e.EnumC0744b f2809d = null;

        /* renamed from: e */
        public static final androidx.lifecycle.AbstractC0742e.EnumC0744b f2810e = null;

        /* renamed from: f */
        public static final androidx.lifecycle.AbstractC0742e.EnumC0744b f2811f = null;

        /* renamed from: g */
        private static final /* synthetic */ androidx.lifecycle.AbstractC0742e.EnumC0744b[] f2812g = null;

        static {
                androidx.lifecycle.e$b r0 = new androidx.lifecycle.e$b
                r1 = 0
                java.lang.String r2 = "DESTROYED"
                r0.<init>(r2, r1)
                androidx.lifecycle.AbstractC0742e.EnumC0744b.f2807b = r0
                androidx.lifecycle.e$b r0 = new androidx.lifecycle.e$b
                r2 = 1
                java.lang.String r3 = "INITIALIZED"
                r0.<init>(r3, r2)
                androidx.lifecycle.AbstractC0742e.EnumC0744b.f2808c = r0
                androidx.lifecycle.e$b r0 = new androidx.lifecycle.e$b
                r3 = 2
                java.lang.String r4 = "CREATED"
                r0.<init>(r4, r3)
                androidx.lifecycle.AbstractC0742e.EnumC0744b.f2809d = r0
                androidx.lifecycle.e$b r0 = new androidx.lifecycle.e$b
                r4 = 3
                java.lang.String r5 = "STARTED"
                r0.<init>(r5, r4)
                androidx.lifecycle.AbstractC0742e.EnumC0744b.f2810e = r0
                androidx.lifecycle.e$b r0 = new androidx.lifecycle.e$b
                r5 = 4
                java.lang.String r6 = "RESUMED"
                r0.<init>(r6, r5)
                androidx.lifecycle.AbstractC0742e.EnumC0744b.f2811f = r0
                r0 = 5
                androidx.lifecycle.e$b[] r0 = new androidx.lifecycle.AbstractC0742e.EnumC0744b[r0]
                androidx.lifecycle.e$b r6 = androidx.lifecycle.AbstractC0742e.EnumC0744b.f2807b
                r0[r1] = r6
                androidx.lifecycle.e$b r1 = androidx.lifecycle.AbstractC0742e.EnumC0744b.f2808c
                r0[r2] = r1
                androidx.lifecycle.e$b r1 = androidx.lifecycle.AbstractC0742e.EnumC0744b.f2809d
                r0[r3] = r1
                androidx.lifecycle.e$b r1 = androidx.lifecycle.AbstractC0742e.EnumC0744b.f2810e
                r0[r4] = r1
                androidx.lifecycle.e$b r1 = androidx.lifecycle.AbstractC0742e.EnumC0744b.f2811f
                r0[r5] = r1
                androidx.lifecycle.AbstractC0742e.EnumC0744b.f2812g = r0
                return
        }

        EnumC0744b(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.lifecycle.AbstractC0742e.EnumC0744b valueOf(java.lang.String r1) {
                java.lang.Class<androidx.lifecycle.e$b> r0 = androidx.lifecycle.AbstractC0742e.EnumC0744b.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.lifecycle.e$b r1 = (androidx.lifecycle.AbstractC0742e.EnumC0744b) r1
                return r1
        }

        public static androidx.lifecycle.AbstractC0742e.EnumC0744b[] values() {
                androidx.lifecycle.e$b[] r0 = androidx.lifecycle.AbstractC0742e.EnumC0744b.f2812g
                java.lang.Object r0 = r0.clone()
                androidx.lifecycle.e$b[] r0 = (androidx.lifecycle.AbstractC0742e.EnumC0744b[]) r0
                return r0
        }

        /* renamed from: a */
        public boolean m1387a(androidx.lifecycle.AbstractC0742e.EnumC0744b r1) {
                r0 = this;
                int r1 = r0.compareTo(r1)
                if (r1 < 0) goto L_0x0008
                r1 = 1
                goto L_0x0009
            L_0x0008:
                r1 = 0
            L_0x0009:
                return r1
        }
    }

    public AbstractC0742e() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public abstract androidx.lifecycle.AbstractC0742e.EnumC0744b mo1386a();

    /* renamed from: a */
    public abstract void mo1382a(androidx.lifecycle.AbstractC0745f r1);

    /* renamed from: b */
    public abstract void mo1377b(androidx.lifecycle.AbstractC0745f r1);
}
