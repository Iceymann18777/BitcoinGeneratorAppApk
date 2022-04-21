package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.m */
/* loaded from: classes.dex */
class C0508m extends androidx.appcompat.view.menu.MenuItemC0503l {

    /* renamed from: androidx.appcompat.view.menu.m$a */
    /* loaded from: classes.dex */
    class ActionProvider$VisibilityListenerC0509a extends androidx.appcompat.view.menu.MenuItemC0503l.C0504a implements android.view.ActionProvider.VisibilityListener {

        /* renamed from: d */
        p000a.p018g.p029l.AbstractC0197b.AbstractC0199b f1771d;

        public ActionProvider$VisibilityListenerC0509a(androidx.appcompat.view.menu.C0508m r1, android.content.Context r2, android.view.ActionProvider r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // p000a.p018g.p029l.AbstractC0197b
        /* renamed from: a */
        public android.view.View mo2337a(android.view.MenuItem r2) {
                r1 = this;
                android.view.ActionProvider r0 = r1.f1766b
                android.view.View r2 = r0.onCreateActionView(r2)
                return r2
        }

        @Override // p000a.p018g.p029l.AbstractC0197b
        /* renamed from: a */
        public void mo2338a(p000a.p018g.p029l.AbstractC0197b.AbstractC0199b r2) {
                r1 = this;
                r1.f1771d = r2
                android.view.ActionProvider r0 = r1.f1766b
                if (r2 == 0) goto L_0x0008
                r2 = r1
                goto L_0x0009
            L_0x0008:
                r2 = 0
            L_0x0009:
                r0.setVisibilityListener(r2)
                return
        }

        @Override // p000a.p018g.p029l.AbstractC0197b
        /* renamed from: b */
        public boolean mo2336b() {
                r1 = this;
                android.view.ActionProvider r0 = r1.f1766b
                boolean r0 = r0.isVisible()
                return r0
        }

        @Override // p000a.p018g.p029l.AbstractC0197b
        /* renamed from: e */
        public boolean mo2335e() {
                r1 = this;
                android.view.ActionProvider r0 = r1.f1766b
                boolean r0 = r0.overridesItemVisibility()
                return r0
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean r2) {
                r1 = this;
                a.g.l.b$b r0 = r1.f1771d
                if (r0 == 0) goto L_0x0007
                r0.onActionProviderVisibilityChanged(r2)
            L_0x0007:
                return
        }
    }

    C0508m(android.content.Context r1, p000a.p018g.p022f.p023a.AbstractMenuItemC0156b r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // androidx.appcompat.view.menu.MenuItemC0503l
    /* renamed from: a */
    androidx.appcompat.view.menu.MenuItemC0503l.C0504a mo2339a(android.view.ActionProvider r3) {
            r2 = this;
            androidx.appcompat.view.menu.m$a r0 = new androidx.appcompat.view.menu.m$a
            android.content.Context r1 = r2.f1643b
            r0.<init>(r2, r1, r3)
            return r0
    }
}
