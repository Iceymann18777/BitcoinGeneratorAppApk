package androidx.lifecycle;

/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements androidx.lifecycle.AbstractC0741d {

    /* renamed from: a */
    private final java.lang.Object f2797a;

    /* renamed from: b */
    private final androidx.lifecycle.C0736a.C0737a f2798b;

    ReflectiveGenericLifecycleObserver(java.lang.Object r2) {
            r1 = this;
            r1.<init>()
            r1.f2797a = r2
            androidx.lifecycle.a r2 = androidx.lifecycle.C0736a.f2800c
            java.lang.Object r0 = r1.f2797a
            java.lang.Class r0 = r0.getClass()
            androidx.lifecycle.a$a r2 = r2.m1403a(r0)
            r1.f2798b = r2
            return
    }

    @Override // androidx.lifecycle.AbstractC0741d
    /* renamed from: a */
    public void mo1388a(androidx.lifecycle.AbstractC0746g r3, androidx.lifecycle.AbstractC0742e.EnumC0743a r4) {
            r2 = this;
            androidx.lifecycle.a$a r0 = r2.f2798b
            java.lang.Object r1 = r2.f2797a
            r0.m1398a(r3, r4, r1)
            return
    }
}
