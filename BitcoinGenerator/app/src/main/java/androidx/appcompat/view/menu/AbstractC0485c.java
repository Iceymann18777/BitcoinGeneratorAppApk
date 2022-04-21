package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.c */
/* loaded from: classes.dex */
abstract class AbstractC0485c<T> extends androidx.appcompat.view.menu.C0486d<T> {

    /* renamed from: b */
    final android.content.Context f1643b;

    /* renamed from: c */
    private java.util.Map<p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem> f1644c;

    /* renamed from: d */
    private java.util.Map<p000a.p018g.p022f.p023a.AbstractSubMenuC0157c, android.view.SubMenu> f1645d;

    AbstractC0485c(android.content.Context r1, T r2) {
            r0 = this;
            r0.<init>(r2)
            r0.f1643b = r1
            return
    }

    /* renamed from: a */
    final android.view.MenuItem m2442a(android.view.MenuItem r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000a.p018g.p022f.p023a.AbstractMenuItemC0156b
            if (r0 == 0) goto L_0x0027
            r0 = r3
            a.g.f.a.b r0 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r0
            java.util.Map<a.g.f.a.b, android.view.MenuItem> r1 = r2.f1644c
            if (r1 != 0) goto L_0x0012
            a.d.a r1 = new a.d.a
            r1.<init>()
            r2.f1644c = r1
        L_0x0012:
            java.util.Map<a.g.f.a.b, android.view.MenuItem> r1 = r2.f1644c
            java.lang.Object r3 = r1.get(r3)
            android.view.MenuItem r3 = (android.view.MenuItem) r3
            if (r3 != 0) goto L_0x0027
            android.content.Context r3 = r2.f1643b
            android.view.MenuItem r3 = androidx.appcompat.view.menu.C0517r.m2314a(r3, r0)
            java.util.Map<a.g.f.a.b, android.view.MenuItem> r1 = r2.f1644c
            r1.put(r0, r3)
        L_0x0027:
            return r3
    }

    /* renamed from: a */
    final android.view.SubMenu m2441a(android.view.SubMenu r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000a.p018g.p022f.p023a.AbstractSubMenuC0157c
            if (r0 == 0) goto L_0x0027
            a.g.f.a.c r3 = (p000a.p018g.p022f.p023a.AbstractSubMenuC0157c) r3
            java.util.Map<a.g.f.a.c, android.view.SubMenu> r0 = r2.f1645d
            if (r0 != 0) goto L_0x0011
            a.d.a r0 = new a.d.a
            r0.<init>()
            r2.f1645d = r0
        L_0x0011:
            java.util.Map<a.g.f.a.c, android.view.SubMenu> r0 = r2.f1645d
            java.lang.Object r0 = r0.get(r3)
            android.view.SubMenu r0 = (android.view.SubMenu) r0
            if (r0 != 0) goto L_0x0026
            android.content.Context r0 = r2.f1643b
            android.view.SubMenu r0 = androidx.appcompat.view.menu.C0517r.m2313a(r0, r3)
            java.util.Map<a.g.f.a.c, android.view.SubMenu> r1 = r2.f1645d
            r1.put(r3, r0)
        L_0x0026:
            return r0
        L_0x0027:
            return r3
    }

    /* renamed from: a */
    final void m2443a(int r3) {
            r2 = this;
            java.util.Map<a.g.f.a.b, android.view.MenuItem> r0 = r2.f1644c
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x000d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0023
            java.lang.Object r1 = r0.next()
            android.view.MenuItem r1 = (android.view.MenuItem) r1
            int r1 = r1.getGroupId()
            if (r3 != r1) goto L_0x000d
            r0.remove()
            goto L_0x000d
        L_0x0023:
            return
    }

    /* renamed from: b */
    final void m2440b() {
            r1 = this;
            java.util.Map<a.g.f.a.b, android.view.MenuItem> r0 = r1.f1644c
            if (r0 == 0) goto L_0x0007
            r0.clear()
        L_0x0007:
            java.util.Map<a.g.f.a.c, android.view.SubMenu> r0 = r1.f1645d
            if (r0 == 0) goto L_0x000e
            r0.clear()
        L_0x000e:
            return
    }

    /* renamed from: b */
    final void m2439b(int r3) {
            r2 = this;
            java.util.Map<a.g.f.a.b, android.view.MenuItem> r0 = r2.f1644c
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x000d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0022
            java.lang.Object r1 = r0.next()
            android.view.MenuItem r1 = (android.view.MenuItem) r1
            int r1 = r1.getItemId()
            if (r3 != r1) goto L_0x000d
            r0.remove()
        L_0x0022:
            return
    }
}
