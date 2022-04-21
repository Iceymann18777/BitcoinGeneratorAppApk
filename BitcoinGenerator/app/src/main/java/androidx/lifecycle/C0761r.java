package androidx.lifecycle;

/* renamed from: androidx.lifecycle.r */
/* loaded from: classes.dex */
public class C0761r {

    /* renamed from: a */
    private final java.util.HashMap<java.lang.String, androidx.lifecycle.AbstractC0758p> f2829a;

    public C0761r() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f2829a = r0
            return
    }

    /* renamed from: a */
    final androidx.lifecycle.AbstractC0758p m1345a(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.lifecycle.p> r0 = r1.f2829a
            java.lang.Object r2 = r0.get(r2)
            androidx.lifecycle.p r2 = (androidx.lifecycle.AbstractC0758p) r2
            return r2
    }

    /* renamed from: a */
    public final void m1346a() {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.lifecycle.p> r0 = r2.f2829a
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x001a
            java.lang.Object r1 = r0.next()
            androidx.lifecycle.p r1 = (androidx.lifecycle.AbstractC0758p) r1
            r1.mo1350a()
            goto L_0x000a
        L_0x001a:
            java.util.HashMap<java.lang.String, androidx.lifecycle.p> r0 = r2.f2829a
            r0.clear()
            return
    }

    /* renamed from: a */
    final void m1344a(java.lang.String r2, androidx.lifecycle.AbstractC0758p r3) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.lifecycle.p> r0 = r1.f2829a
            java.lang.Object r2 = r0.put(r2, r3)
            androidx.lifecycle.p r2 = (androidx.lifecycle.AbstractC0758p) r2
            if (r2 == 0) goto L_0x000d
            r2.mo1350a()
        L_0x000d:
            return
    }
}
