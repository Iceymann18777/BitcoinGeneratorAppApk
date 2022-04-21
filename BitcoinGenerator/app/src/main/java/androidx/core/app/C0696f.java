package androidx.core.app;

/* renamed from: androidx.core.app.f */
/* loaded from: classes.dex */
public final class C0696f implements java.lang.Iterable<android.content.Intent> {

    /* renamed from: b */
    private final java.util.ArrayList<android.content.Intent> f2621b;

    /* renamed from: c */
    private final android.content.Context f2622c;

    /* renamed from: androidx.core.app.f$a */
    /* loaded from: classes.dex */
    public interface AbstractC0697a {
        /* renamed from: d */
        android.content.Intent mo1615d();
    }

    private C0696f(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2621b = r0
            r1.f2622c = r2
            return
    }

    /* renamed from: a */
    public static androidx.core.app.C0696f m1618a(android.content.Context r1) {
            androidx.core.app.f r0 = new androidx.core.app.f
            r0.<init>(r1)
            return r0
    }

    /* renamed from: a */
    public androidx.core.app.C0696f m1620a(android.app.Activity r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.core.app.C0696f.AbstractC0697a
            if (r0 == 0) goto L_0x000c
            r0 = r2
            androidx.core.app.f$a r0 = (androidx.core.app.C0696f.AbstractC0697a) r0
            android.content.Intent r0 = r0.mo1615d()
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            if (r0 != 0) goto L_0x0013
            android.content.Intent r0 = androidx.core.app.C0694d.m1630a(r2)
        L_0x0013:
            if (r0 == 0) goto L_0x002b
            android.content.ComponentName r2 = r0.getComponent()
            if (r2 != 0) goto L_0x0025
            android.content.Context r2 = r1.f2622c
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            android.content.ComponentName r2 = r0.resolveActivity(r2)
        L_0x0025:
            r1.m1619a(r2)
            r1.m1617a(r0)
        L_0x002b:
            return r1
    }

    /* renamed from: a */
    public androidx.core.app.C0696f m1619a(android.content.ComponentName r3) {
            r2 = this;
            java.util.ArrayList<android.content.Intent> r0 = r2.f2621b
            int r0 = r0.size()
            android.content.Context r1 = r2.f2622c     // Catch: NameNotFoundException -> 0x001b
        L_0x0008:
            android.content.Intent r3 = androidx.core.app.C0694d.m1628a(r1, r3)     // Catch: NameNotFoundException -> 0x001b
            if (r3 == 0) goto L_0x001a
            java.util.ArrayList<android.content.Intent> r1 = r2.f2621b     // Catch: NameNotFoundException -> 0x001b
            r1.add(r0, r3)     // Catch: NameNotFoundException -> 0x001b
            android.content.Context r1 = r2.f2622c     // Catch: NameNotFoundException -> 0x001b
            android.content.ComponentName r3 = r3.getComponent()     // Catch: NameNotFoundException -> 0x001b
            goto L_0x0008
        L_0x001a:
            return r2
        L_0x001b:
            r3 = move-exception
            java.lang.String r0 = "TaskStackBuilder"
            java.lang.String r1 = "Bad ComponentName while traversing activity parent metadata"
            android.util.Log.e(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            goto L_0x002a
        L_0x0029:
            throw r0
        L_0x002a:
            goto L_0x0029
    }

    /* renamed from: a */
    public androidx.core.app.C0696f m1617a(android.content.Intent r2) {
            r1 = this;
            java.util.ArrayList<android.content.Intent> r0 = r1.f2621b
            r0.add(r2)
            return r1
    }

    /* renamed from: a */
    public void m1621a() {
            r1 = this;
            r0 = 0
            r1.m1616a(r0)
            return
    }

    /* renamed from: a */
    public void m1616a(android.os.Bundle r5) {
            r4 = this;
            java.util.ArrayList<android.content.Intent> r0 = r4.f2621b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0044
            java.util.ArrayList<android.content.Intent> r0 = r4.f2621b
            int r1 = r0.size()
            android.content.Intent[] r1 = new android.content.Intent[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            android.content.Intent[] r0 = (android.content.Intent[]) r0
            android.content.Intent r1 = new android.content.Intent
            r2 = 0
            r3 = r0[r2]
            r1.<init>(r3)
            r3 = 268484608(0x1000c000, float:2.539146E-29)
            android.content.Intent r1 = r1.addFlags(r3)
            r0[r2] = r1
            android.content.Context r1 = r4.f2622c
            boolean r5 = p000a.p018g.p019d.C0124a.m3733a(r1, r0, r5)
            if (r5 != 0) goto L_0x0043
            android.content.Intent r5 = new android.content.Intent
            int r1 = r0.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            r5.<init>(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r5.addFlags(r0)
            android.content.Context r0 = r4.f2622c
            r0.startActivity(r5)
        L_0x0043:
            return
        L_0x0044:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "No intents added to TaskStackBuilder; cannot startActivities"
            r5.<init>(r0)
            throw r5
    }

    @Override // java.lang.Iterable
    @java.lang.Deprecated
    public java.util.Iterator<android.content.Intent> iterator() {
            r1 = this;
            java.util.ArrayList<android.content.Intent> r0 = r1.f2621b
            java.util.Iterator r0 = r0.iterator()
            return r0
    }
}
