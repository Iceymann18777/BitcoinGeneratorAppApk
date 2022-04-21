package com.google.android.material.snackbar;

/* renamed from: com.google.android.material.snackbar.f */
/* loaded from: classes.dex */
class C0994f {

    /* renamed from: e */
    private static com.google.android.material.snackbar.C0994f f3632e;

    /* renamed from: a */
    private final java.lang.Object f3633a;

    /* renamed from: b */
    private final android.os.Handler f3634b;

    /* renamed from: c */
    private com.google.android.material.snackbar.C0994f.C0997c f3635c;

    /* renamed from: d */
    private com.google.android.material.snackbar.C0994f.C0997c f3636d;

    /* renamed from: com.google.android.material.snackbar.f$a */
    /* loaded from: classes.dex */
    class C0995a implements android.os.Handler.Callback {

        /* renamed from: a */
        final /* synthetic */ com.google.android.material.snackbar.C0994f f3637a;

        C0995a(com.google.android.material.snackbar.C0994f r1) {
                r0 = this;
                r0.f3637a = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r2) {
                r1 = this;
                int r0 = r2.what
                if (r0 == 0) goto L_0x0006
                r2 = 0
                return r2
            L_0x0006:
                com.google.android.material.snackbar.f r0 = r1.f3637a
                java.lang.Object r2 = r2.obj
                com.google.android.material.snackbar.f$c r2 = (com.google.android.material.snackbar.C0994f.C0997c) r2
                r0.m53a(r2)
                r2 = 1
                return r2
        }
    }

    /* renamed from: com.google.android.material.snackbar.f$b */
    /* loaded from: classes.dex */
    interface AbstractC0996b {
        /* renamed from: a */
        void m48a(int r1);
    }

    /* renamed from: com.google.android.material.snackbar.f$c */
    /* loaded from: classes.dex */
    private static class C0997c {

        /* renamed from: a */
        final java.lang.ref.WeakReference<com.google.android.material.snackbar.C0994f.AbstractC0996b> f3638a;

        /* renamed from: b */
        int f3639b;

        /* renamed from: c */
        boolean f3640c;

        /* renamed from: a */
        boolean m47a(com.google.android.material.snackbar.C0994f.AbstractC0996b r2) {
                r1 = this;
                if (r2 == 0) goto L_0x000c
                java.lang.ref.WeakReference<com.google.android.material.snackbar.f$b> r0 = r1.f3638a
                java.lang.Object r0 = r0.get()
                if (r0 != r2) goto L_0x000c
                r2 = 1
                goto L_0x000d
            L_0x000c:
                r2 = 0
            L_0x000d:
                return r2
        }
    }

    private C0994f() {
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.f3633a = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            com.google.android.material.snackbar.f$a r2 = new com.google.android.material.snackbar.f$a
            r2.<init>(r3)
            r0.<init>(r1, r2)
            r3.f3634b = r0
            return
    }

    /* renamed from: a */
    static com.google.android.material.snackbar.C0994f m55a() {
            com.google.android.material.snackbar.f r0 = com.google.android.material.snackbar.C0994f.f3632e
            if (r0 != 0) goto L_0x000b
            com.google.android.material.snackbar.f r0 = new com.google.android.material.snackbar.f
            r0.<init>()
            com.google.android.material.snackbar.C0994f.f3632e = r0
        L_0x000b:
            com.google.android.material.snackbar.f r0 = com.google.android.material.snackbar.C0994f.f3632e
            return r0
    }

    /* renamed from: a */
    private boolean m52a(com.google.android.material.snackbar.C0994f.C0997c r3, int r4) {
            r2 = this;
            java.lang.ref.WeakReference<com.google.android.material.snackbar.f$b> r0 = r3.f3638a
            java.lang.Object r0 = r0.get()
            com.google.android.material.snackbar.f$b r0 = (com.google.android.material.snackbar.C0994f.AbstractC0996b) r0
            if (r0 == 0) goto L_0x0014
            android.os.Handler r1 = r2.f3634b
            r1.removeCallbacksAndMessages(r3)
            r0.m48a(r4)
            r3 = 1
            return r3
        L_0x0014:
            r3 = 0
            return r3
    }

    /* renamed from: b */
    private void m50b(com.google.android.material.snackbar.C0994f.C0997c r5) {
            r4 = this;
            int r0 = r5.f3639b
            r1 = -2
            if (r0 != r1) goto L_0x0006
            return
        L_0x0006:
            r1 = 2750(0xabe, float:3.854E-42)
            if (r0 <= 0) goto L_0x000b
            goto L_0x0013
        L_0x000b:
            r2 = -1
            if (r0 != r2) goto L_0x0011
            r0 = 1500(0x5dc, float:2.102E-42)
            goto L_0x0013
        L_0x0011:
            r0 = 2750(0xabe, float:3.854E-42)
        L_0x0013:
            android.os.Handler r1 = r4.f3634b
            r1.removeCallbacksAndMessages(r5)
            android.os.Handler r1 = r4.f3634b
            r2 = 0
            android.os.Message r5 = android.os.Message.obtain(r1, r2, r5)
            long r2 = (long) r0
            r1.sendMessageDelayed(r5, r2)
            return
    }

    /* renamed from: c */
    private boolean m49c(com.google.android.material.snackbar.C0994f.AbstractC0996b r2) {
            r1 = this;
            com.google.android.material.snackbar.f$c r0 = r1.f3635c
            if (r0 == 0) goto L_0x000c
            boolean r2 = r0.m47a(r2)
            if (r2 == 0) goto L_0x000c
            r2 = 1
            goto L_0x000d
        L_0x000c:
            r2 = 0
        L_0x000d:
            return r2
    }

    /* renamed from: a */
    public void m54a(com.google.android.material.snackbar.C0994f.AbstractC0996b r3) {
            r2 = this;
            java.lang.Object r0 = r2.f3633a
            monitor-enter(r0)
            boolean r3 = r2.m49c(r3)     // Catch: all -> 0x001d
            if (r3 == 0) goto L_0x001b
            com.google.android.material.snackbar.f$c r3 = r2.f3635c     // Catch: all -> 0x001d
            boolean r3 = r3.f3640c     // Catch: all -> 0x001d
            if (r3 != 0) goto L_0x001b
            com.google.android.material.snackbar.f$c r3 = r2.f3635c     // Catch: all -> 0x001d
            r1 = 1
            r3.f3640c = r1     // Catch: all -> 0x001d
            android.os.Handler r3 = r2.f3634b     // Catch: all -> 0x001d
            com.google.android.material.snackbar.f$c r1 = r2.f3635c     // Catch: all -> 0x001d
            r3.removeCallbacksAndMessages(r1)     // Catch: all -> 0x001d
        L_0x001b:
            monitor-exit(r0)     // Catch: all -> 0x001d
            return
        L_0x001d:
            r3 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x001d
            throw r3
    }

    /* renamed from: a */
    void m53a(com.google.android.material.snackbar.C0994f.C0997c r3) {
            r2 = this;
            java.lang.Object r0 = r2.f3633a
            monitor-enter(r0)
            com.google.android.material.snackbar.f$c r1 = r2.f3635c     // Catch: all -> 0x0011
            if (r1 == r3) goto L_0x000b
            com.google.android.material.snackbar.f$c r1 = r2.f3636d     // Catch: all -> 0x0011
            if (r1 != r3) goto L_0x000f
        L_0x000b:
            r1 = 2
            r2.m52a(r3, r1)     // Catch: all -> 0x0011
        L_0x000f:
            monitor-exit(r0)     // Catch: all -> 0x0011
            return
        L_0x0011:
            r3 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x0011
            throw r3
    }

    /* renamed from: b */
    public void m51b(com.google.android.material.snackbar.C0994f.AbstractC0996b r3) {
            r2 = this;
            java.lang.Object r0 = r2.f3633a
            monitor-enter(r0)
            boolean r3 = r2.m49c(r3)     // Catch: all -> 0x001b
            if (r3 == 0) goto L_0x0019
            com.google.android.material.snackbar.f$c r3 = r2.f3635c     // Catch: all -> 0x001b
            boolean r3 = r3.f3640c     // Catch: all -> 0x001b
            if (r3 == 0) goto L_0x0019
            com.google.android.material.snackbar.f$c r3 = r2.f3635c     // Catch: all -> 0x001b
            r1 = 0
            r3.f3640c = r1     // Catch: all -> 0x001b
            com.google.android.material.snackbar.f$c r3 = r2.f3635c     // Catch: all -> 0x001b
            r2.m50b(r3)     // Catch: all -> 0x001b
        L_0x0019:
            monitor-exit(r0)     // Catch: all -> 0x001b
            return
        L_0x001b:
            r3 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x001b
            throw r3
    }
}
