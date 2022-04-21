package p000a.p001a.p006m;

/* renamed from: a.a.m.f */
/* loaded from: classes.dex */
public class C0034f extends android.view.ActionMode {

    /* renamed from: a */
    final android.content.Context f100a;

    /* renamed from: b */
    final p000a.p001a.p006m.AbstractC0029b f101b;

    /* renamed from: a.a.m.f$a */
    /* loaded from: classes.dex */
    public static class C0035a implements p000a.p001a.p006m.AbstractC0029b.AbstractC0030a {

        /* renamed from: a */
        final android.view.ActionMode.Callback f102a;

        /* renamed from: b */
        final android.content.Context f103b;

        /* renamed from: c */
        final java.util.ArrayList<p000a.p001a.p006m.C0034f> f104c;

        /* renamed from: d */
        final p000a.p013d.C0080g<android.view.Menu, android.view.Menu> f105d;

        public C0035a(android.content.Context r1, android.view.ActionMode.Callback r2) {
                r0 = this;
                r0.<init>()
                r0.f103b = r1
                r0.f102a = r2
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.f104c = r1
                a.d.g r1 = new a.d.g
                r1.<init>()
                r0.f105d = r1
                return
        }

        /* renamed from: a */
        private android.view.Menu m4171a(android.view.Menu r3) {
                r2 = this;
                a.d.g<android.view.Menu, android.view.Menu> r0 = r2.f105d
                java.lang.Object r0 = r0.get(r3)
                android.view.Menu r0 = (android.view.Menu) r0
                if (r0 != 0) goto L_0x0018
                android.content.Context r0 = r2.f103b
                r1 = r3
                a.g.f.a.a r1 = (p000a.p018g.p022f.p023a.AbstractMenuC0155a) r1
                android.view.Menu r0 = androidx.appcompat.view.menu.C0517r.m2315a(r0, r1)
                a.d.g<android.view.Menu, android.view.Menu> r1 = r2.f105d
                r1.put(r3, r0)
            L_0x0018:
                return r0
        }

        @Override // p000a.p001a.p006m.AbstractC0029b.AbstractC0030a
        /* renamed from: a */
        public void mo2545a(p000a.p001a.p006m.AbstractC0029b r2) {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.f102a
                android.view.ActionMode r2 = r1.m4170b(r2)
                r0.onDestroyActionMode(r2)
                return
        }

        @Override // p000a.p001a.p006m.AbstractC0029b.AbstractC0030a
        /* renamed from: a */
        public boolean mo2544a(p000a.p001a.p006m.AbstractC0029b r2, android.view.Menu r3) {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.f102a
                android.view.ActionMode r2 = r1.m4170b(r2)
                android.view.Menu r3 = r1.m4171a(r3)
                boolean r2 = r0.onPrepareActionMode(r2, r3)
                return r2
        }

        @Override // p000a.p001a.p006m.AbstractC0029b.AbstractC0030a
        /* renamed from: a */
        public boolean mo2543a(p000a.p001a.p006m.AbstractC0029b r3, android.view.MenuItem r4) {
                r2 = this;
                android.view.ActionMode$Callback r0 = r2.f102a
                android.view.ActionMode r3 = r2.m4170b(r3)
                android.content.Context r1 = r2.f103b
                a.g.f.a.b r4 = (p000a.p018g.p022f.p023a.AbstractMenuItemC0156b) r4
                android.view.MenuItem r4 = androidx.appcompat.view.menu.C0517r.m2314a(r1, r4)
                boolean r3 = r0.onActionItemClicked(r3, r4)
                return r3
        }

        /* renamed from: b */
        public android.view.ActionMode m4170b(p000a.p001a.p006m.AbstractC0029b r5) {
                r4 = this;
                java.util.ArrayList<a.a.m.f> r0 = r4.f104c
                int r0 = r0.size()
                r1 = 0
            L_0x0007:
                if (r1 >= r0) goto L_0x001b
                java.util.ArrayList<a.a.m.f> r2 = r4.f104c
                java.lang.Object r2 = r2.get(r1)
                a.a.m.f r2 = (p000a.p001a.p006m.C0034f) r2
                if (r2 == 0) goto L_0x0018
                a.a.m.b r3 = r2.f101b
                if (r3 != r5) goto L_0x0018
                return r2
            L_0x0018:
                int r1 = r1 + 1
                goto L_0x0007
            L_0x001b:
                a.a.m.f r0 = new a.a.m.f
                android.content.Context r1 = r4.f103b
                r0.<init>(r1, r5)
                java.util.ArrayList<a.a.m.f> r5 = r4.f104c
                r5.add(r0)
                return r0
        }

        @Override // p000a.p001a.p006m.AbstractC0029b.AbstractC0030a
        /* renamed from: b */
        public boolean mo2542b(p000a.p001a.p006m.AbstractC0029b r2, android.view.Menu r3) {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.f102a
                android.view.ActionMode r2 = r1.m4170b(r2)
                android.view.Menu r3 = r1.m4171a(r3)
                boolean r2 = r0.onCreateActionMode(r2, r3)
                return r2
        }
    }

    public C0034f(android.content.Context r1, p000a.p001a.p006m.AbstractC0029b r2) {
            r0 = this;
            r0.<init>()
            r0.f100a = r1
            r0.f101b = r2
            return
    }

    @Override // android.view.ActionMode
    public void finish() {
            r1 = this;
            a.a.m.b r0 = r1.f101b
            r0.mo2472a()
            return
    }

    @Override // android.view.ActionMode
    public android.view.View getCustomView() {
            r1 = this;
            a.a.m.b r0 = r1.f101b
            android.view.View r0 = r0.mo2467b()
            return r0
    }

    @Override // android.view.ActionMode
    public android.view.Menu getMenu() {
            r2 = this;
            android.content.Context r0 = r2.f100a
            a.a.m.b r1 = r2.f101b
            android.view.Menu r1 = r1.mo2464c()
            a.g.f.a.a r1 = (p000a.p018g.p022f.p023a.AbstractMenuC0155a) r1
            android.view.Menu r0 = androidx.appcompat.view.menu.C0517r.m2315a(r0, r1)
            return r0
    }

    @Override // android.view.ActionMode
    public android.view.MenuInflater getMenuInflater() {
            r1 = this;
            a.a.m.b r0 = r1.f101b
            android.view.MenuInflater r0 = r0.mo2463d()
            return r0
    }

    @Override // android.view.ActionMode
    public java.lang.CharSequence getSubtitle() {
            r1 = this;
            a.a.m.b r0 = r1.f101b
            java.lang.CharSequence r0 = r0.mo2462e()
            return r0
    }

    @Override // android.view.ActionMode
    public java.lang.Object getTag() {
            r1 = this;
            a.a.m.b r0 = r1.f101b
            java.lang.Object r0 = r0.m4177f()
            return r0
    }

    @Override // android.view.ActionMode
    public java.lang.CharSequence getTitle() {
            r1 = this;
            a.a.m.b r0 = r1.f101b
            java.lang.CharSequence r0 = r0.mo2461g()
            return r0
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
            r1 = this;
            a.a.m.b r0 = r1.f101b
            boolean r0 = r0.m4176h()
            return r0
    }

    @Override // android.view.ActionMode
    public void invalidate() {
            r1 = this;
            a.a.m.b r0 = r1.f101b
            r0.mo2460i()
            return
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
            r1 = this;
            a.a.m.b r0 = r1.f101b
            boolean r0 = r0.mo2459j()
            return r0
    }

    @Override // android.view.ActionMode
    public void setCustomView(android.view.View r2) {
            r1 = this;
            a.a.m.b r0 = r1.f101b
            r0.mo2470a(r2)
            return
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int r2) {
            r1 = this;
            a.a.m.b r0 = r1.f101b
            r0.mo2471a(r2)
            return
    }

    @Override // android.view.ActionMode
    public void setSubtitle(java.lang.CharSequence r2) {
            r1 = this;
            a.a.m.b r0 = r1.f101b
            r0.mo2469a(r2)
            return
    }

    @Override // android.view.ActionMode
    public void setTag(java.lang.Object r2) {
            r1 = this;
            a.a.m.b r0 = r1.f101b
            r0.m4178a(r2)
            return
    }

    @Override // android.view.ActionMode
    public void setTitle(int r2) {
            r1 = this;
            a.a.m.b r0 = r1.f101b
            r0.mo2466b(r2)
            return
    }

    @Override // android.view.ActionMode
    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            a.a.m.b r0 = r1.f101b
            r0.mo2465b(r2)
            return
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean r2) {
            r1 = this;
            a.a.m.b r0 = r1.f101b
            r0.mo2468a(r2)
            return
    }
}
