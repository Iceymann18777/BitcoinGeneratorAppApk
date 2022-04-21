package androidx.lifecycle;

/* loaded from: classes.dex */
class FullLifecycleObserverAdapter implements androidx.lifecycle.AbstractC0741d {

    /* renamed from: a */
    private final androidx.lifecycle.AbstractC0739b f2779a;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0733a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2780a = null;

        static {
                androidx.lifecycle.e$a[] r0 = androidx.lifecycle.AbstractC0742e.EnumC0743a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.lifecycle.FullLifecycleObserverAdapter.C0733a.f2780a = r0
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.C0733a.f2780a     // Catch: NoSuchFieldError -> 0x0014
                androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_CREATE     // Catch: NoSuchFieldError -> 0x0014
                int r1 = r1.ordinal()     // Catch: NoSuchFieldError -> 0x0014
                r2 = 1
                r0[r1] = r2     // Catch: NoSuchFieldError -> 0x0014
            L_0x0014:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.C0733a.f2780a     // Catch: NoSuchFieldError -> 0x001f
                androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_START     // Catch: NoSuchFieldError -> 0x001f
                int r1 = r1.ordinal()     // Catch: NoSuchFieldError -> 0x001f
                r2 = 2
                r0[r1] = r2     // Catch: NoSuchFieldError -> 0x001f
            L_0x001f:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.C0733a.f2780a     // Catch: NoSuchFieldError -> 0x002a
                androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_RESUME     // Catch: NoSuchFieldError -> 0x002a
                int r1 = r1.ordinal()     // Catch: NoSuchFieldError -> 0x002a
                r2 = 3
                r0[r1] = r2     // Catch: NoSuchFieldError -> 0x002a
            L_0x002a:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.C0733a.f2780a     // Catch: NoSuchFieldError -> 0x0035
                androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_PAUSE     // Catch: NoSuchFieldError -> 0x0035
                int r1 = r1.ordinal()     // Catch: NoSuchFieldError -> 0x0035
                r2 = 4
                r0[r1] = r2     // Catch: NoSuchFieldError -> 0x0035
            L_0x0035:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.C0733a.f2780a     // Catch: NoSuchFieldError -> 0x0040
                androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_STOP     // Catch: NoSuchFieldError -> 0x0040
                int r1 = r1.ordinal()     // Catch: NoSuchFieldError -> 0x0040
                r2 = 5
                r0[r1] = r2     // Catch: NoSuchFieldError -> 0x0040
            L_0x0040:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.C0733a.f2780a     // Catch: NoSuchFieldError -> 0x004b
                androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_DESTROY     // Catch: NoSuchFieldError -> 0x004b
                int r1 = r1.ordinal()     // Catch: NoSuchFieldError -> 0x004b
                r2 = 6
                r0[r1] = r2     // Catch: NoSuchFieldError -> 0x004b
            L_0x004b:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.C0733a.f2780a     // Catch: NoSuchFieldError -> 0x0056
                androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_ANY     // Catch: NoSuchFieldError -> 0x0056
                int r1 = r1.ordinal()     // Catch: NoSuchFieldError -> 0x0056
                r2 = 7
                r0[r1] = r2     // Catch: NoSuchFieldError -> 0x0056
            L_0x0056:
                return
        }
    }

    FullLifecycleObserverAdapter(androidx.lifecycle.AbstractC0739b r1) {
            r0 = this;
            r0.<init>()
            r0.f2779a = r1
            return
    }

    @Override // androidx.lifecycle.AbstractC0741d
    /* renamed from: a */
    public void mo1388a(androidx.lifecycle.AbstractC0746g r2, androidx.lifecycle.AbstractC0742e.EnumC0743a r3) {
            r1 = this;
            int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.C0733a.f2780a
            int r3 = r3.ordinal()
            r3 = r0[r3]
            switch(r3) {
                case 1: goto L_0x0032;
                case 2: goto L_0x002c;
                case 3: goto L_0x0026;
                case 4: goto L_0x0020;
                case 5: goto L_0x001a;
                case 6: goto L_0x0014;
                case 7: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0037
        L_0x000c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "ON_ANY must not been send by anybody"
            r2.<init>(r3)
            throw r2
        L_0x0014:
            androidx.lifecycle.b r3 = r1.f2779a
            r3.m1393c(r2)
            goto L_0x0037
        L_0x001a:
            androidx.lifecycle.b r3 = r1.f2779a
            r3.m1392d(r2)
            goto L_0x0037
        L_0x0020:
            androidx.lifecycle.b r3 = r1.f2779a
            r3.m1394b(r2)
            goto L_0x0037
        L_0x0026:
            androidx.lifecycle.b r3 = r1.f2779a
            r3.m1395a(r2)
            goto L_0x0037
        L_0x002c:
            androidx.lifecycle.b r3 = r1.f2779a
            r3.m1390f(r2)
            goto L_0x0037
        L_0x0032:
            androidx.lifecycle.b r3 = r1.f2779a
            r3.m1391e(r2)
        L_0x0037:
            return
    }
}
