package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.f */
/* loaded from: classes.dex */
public class C0493f implements androidx.appcompat.view.menu.AbstractC0513p, android.widget.AdapterView.OnItemClickListener {

    /* renamed from: b */
    android.content.Context f1684b;

    /* renamed from: c */
    android.view.LayoutInflater f1685c;

    /* renamed from: d */
    androidx.appcompat.view.menu.C0496h f1686d;

    /* renamed from: e */
    androidx.appcompat.view.menu.ExpandedMenuView f1687e;

    /* renamed from: f */
    int f1688f;

    /* renamed from: g */
    int f1689g;

    /* renamed from: h */
    int f1690h;

    /* renamed from: i */
    private androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a f1691i;

    /* renamed from: j */
    androidx.appcompat.view.menu.C0493f.C0494a f1692j;

    /* renamed from: k */
    private int f1693k;

    /* renamed from: androidx.appcompat.view.menu.f$a */
    /* loaded from: classes.dex */
    private class C0494a extends android.widget.BaseAdapter {

        /* renamed from: b */
        private int f1694b;

        /* renamed from: c */
        final /* synthetic */ androidx.appcompat.view.menu.C0493f f1695c;

        public C0494a(androidx.appcompat.view.menu.C0493f r1) {
                r0 = this;
                r0.f1695c = r1
                r0.<init>()
                r1 = -1
                r0.f1694b = r1
                r0.m2426a()
                return
        }

        /* renamed from: a */
        void m2426a() {
                r5 = this;
                androidx.appcompat.view.menu.f r0 = r5.f1695c
                androidx.appcompat.view.menu.h r0 = r0.f1686d
                androidx.appcompat.view.menu.k r0 = r0.m2384f()
                if (r0 == 0) goto L_0x0027
                androidx.appcompat.view.menu.f r1 = r5.f1695c
                androidx.appcompat.view.menu.h r1 = r1.f1686d
                java.util.ArrayList r1 = r1.m2378j()
                int r2 = r1.size()
                r3 = 0
            L_0x0017:
                if (r3 >= r2) goto L_0x0027
                java.lang.Object r4 = r1.get(r3)
                androidx.appcompat.view.menu.k r4 = (androidx.appcompat.view.menu.C0501k) r4
                if (r4 != r0) goto L_0x0024
                r5.f1694b = r3
                return
            L_0x0024:
                int r3 = r3 + 1
                goto L_0x0017
            L_0x0027:
                r0 = -1
                r5.f1694b = r0
                return
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r2 = this;
                androidx.appcompat.view.menu.f r0 = r2.f1695c
                androidx.appcompat.view.menu.h r0 = r0.f1686d
                java.util.ArrayList r0 = r0.m2378j()
                int r0 = r0.size()
                androidx.appcompat.view.menu.f r1 = r2.f1695c
                int r1 = r1.f1688f
                int r0 = r0 - r1
                int r1 = r2.f1694b
                if (r1 >= 0) goto L_0x0016
                return r0
            L_0x0016:
                int r0 = r0 + (-1)
                return r0
        }

        @Override // android.widget.Adapter
        public androidx.appcompat.view.menu.C0501k getItem(int r3) {
                r2 = this;
                androidx.appcompat.view.menu.f r0 = r2.f1695c
                androidx.appcompat.view.menu.h r0 = r0.f1686d
                java.util.ArrayList r0 = r0.m2378j()
                androidx.appcompat.view.menu.f r1 = r2.f1695c
                int r1 = r1.f1688f
                int r3 = r3 + r1
                int r1 = r2.f1694b
                if (r1 < 0) goto L_0x0015
                if (r3 < r1) goto L_0x0015
                int r3 = r3 + 1
            L_0x0015:
                java.lang.Object r3 = r0.get(r3)
                androidx.appcompat.view.menu.k r3 = (androidx.appcompat.view.menu.C0501k) r3
                return r3
        }

        @Override // android.widget.Adapter
        public /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
                r0 = this;
                androidx.appcompat.view.menu.k r1 = r0.getItem(r1)
                return r1
        }

        @Override // android.widget.Adapter
        public long getItemId(int r3) {
                r2 = this;
                long r0 = (long) r3
                return r0
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
                r2 = this;
                r0 = 0
                if (r4 != 0) goto L_0x000d
                androidx.appcompat.view.menu.f r4 = r2.f1695c
                android.view.LayoutInflater r1 = r4.f1685c
                int r4 = r4.f1690h
                android.view.View r4 = r1.inflate(r4, r5, r0)
            L_0x000d:
                r5 = r4
                androidx.appcompat.view.menu.q$a r5 = (androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a) r5
                androidx.appcompat.view.menu.k r3 = r2.getItem(r3)
                r5.mo148a(r3, r0)
                return r4
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
                r0 = this;
                r0.m2426a()
                super.notifyDataSetChanged()
                return
        }
    }

    public C0493f(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f1690h = r1
            r0.f1689g = r2
            return
    }

    public C0493f(android.content.Context r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r3, r0)
            r1.f1684b = r2
            android.content.Context r2 = r1.f1684b
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r1.f1685c = r2
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public int mo136a() {
            r1 = this;
            int r0 = r1.f1693k
            return r0
    }

    /* renamed from: a */
    public androidx.appcompat.view.menu.AbstractC0515q m2429a(android.view.ViewGroup r4) {
            r3 = this;
            androidx.appcompat.view.menu.ExpandedMenuView r0 = r3.f1687e
            if (r0 != 0) goto L_0x0028
            android.view.LayoutInflater r0 = r3.f1685c
            int r1 = p000a.p001a.C0006g.abc_expanded_menu_layout
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            androidx.appcompat.view.menu.ExpandedMenuView r4 = (androidx.appcompat.view.menu.ExpandedMenuView) r4
            r3.f1687e = r4
            androidx.appcompat.view.menu.f$a r4 = r3.f1692j
            if (r4 != 0) goto L_0x001c
            androidx.appcompat.view.menu.f$a r4 = new androidx.appcompat.view.menu.f$a
            r4.<init>(r3)
            r3.f1692j = r4
        L_0x001c:
            androidx.appcompat.view.menu.ExpandedMenuView r4 = r3.f1687e
            androidx.appcompat.view.menu.f$a r0 = r3.f1692j
            r4.setAdapter(r0)
            androidx.appcompat.view.menu.ExpandedMenuView r4 = r3.f1687e
            r4.setOnItemClickListener(r3)
        L_0x0028:
            androidx.appcompat.view.menu.ExpandedMenuView r4 = r3.f1687e
            return r4
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo133a(android.content.Context r3, androidx.appcompat.view.menu.C0496h r4) {
            r2 = this;
            int r0 = r2.f1689g
            if (r0 == 0) goto L_0x0014
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            r1.<init>(r3, r0)
            r2.f1684b = r1
        L_0x000b:
            android.content.Context r3 = r2.f1684b
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r2.f1685c = r3
            goto L_0x001f
        L_0x0014:
            android.content.Context r0 = r2.f1684b
            if (r0 == 0) goto L_0x001f
            r2.f1684b = r3
            android.view.LayoutInflater r3 = r2.f1685c
            if (r3 != 0) goto L_0x001f
            goto L_0x000b
        L_0x001f:
            r2.f1686d = r4
            androidx.appcompat.view.menu.f$a r3 = r2.f1692j
            if (r3 == 0) goto L_0x0028
            r3.notifyDataSetChanged()
        L_0x0028:
            return
    }

    /* renamed from: a */
    public void m2430a(android.os.Bundle r2) {
            r1 = this;
            java.lang.String r0 = "android:menu:list"
            android.util.SparseArray r2 = r2.getSparseParcelableArray(r0)
            if (r2 == 0) goto L_0x000d
            androidx.appcompat.view.menu.ExpandedMenuView r0 = r1.f1687e
            r0.restoreHierarchyState(r2)
        L_0x000d:
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo130a(android.os.Parcelable r1) {
            r0 = this;
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.m2430a(r1)
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo126a(androidx.appcompat.view.menu.C0496h r2, boolean r3) {
            r1 = this;
            androidx.appcompat.view.menu.p$a r0 = r1.f1691i
            if (r0 == 0) goto L_0x0007
            r0.mo2108a(r2, r3)
        L_0x0007:
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo2308a(androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a r1) {
            r0 = this;
            r0.f1691i = r1
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo123a(boolean r1) {
            r0 = this;
            androidx.appcompat.view.menu.f$a r1 = r0.f1692j
            if (r1 == 0) goto L_0x0007
            r1.notifyDataSetChanged()
        L_0x0007:
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public boolean mo127a(androidx.appcompat.view.menu.C0496h r1, androidx.appcompat.view.menu.C0501k r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public boolean mo124a(androidx.appcompat.view.menu.SubMenuC0523v r3) {
            r2 = this;
            boolean r0 = r3.hasVisibleItems()
            if (r0 != 0) goto L_0x0008
            r3 = 0
            return r3
        L_0x0008:
            androidx.appcompat.view.menu.i r0 = new androidx.appcompat.view.menu.i
            r0.<init>(r3)
            r1 = 0
            r0.m2371a(r1)
            androidx.appcompat.view.menu.p$a r0 = r2.f1691i
            if (r0 == 0) goto L_0x0018
            r0.mo2109a(r3)
        L_0x0018:
            r3 = 1
            return r3
    }

    /* renamed from: b */
    public void m2428b(android.os.Bundle r3) {
            r2 = this;
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            androidx.appcompat.view.menu.ExpandedMenuView r1 = r2.f1687e
            if (r1 == 0) goto L_0x000c
            r1.saveHierarchyState(r0)
        L_0x000c:
            java.lang.String r1 = "android:menu:list"
            r3.putSparseParcelableArray(r1, r0)
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: b */
    public boolean mo122b() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: b */
    public boolean mo119b(androidx.appcompat.view.menu.C0496h r1, androidx.appcompat.view.menu.C0501k r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: c */
    public android.os.Parcelable mo117c() {
            r1 = this;
            androidx.appcompat.view.menu.ExpandedMenuView r0 = r1.f1687e
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.m2428b(r0)
            return r0
    }

    /* renamed from: d */
    public android.widget.ListAdapter m2427d() {
            r1 = this;
            androidx.appcompat.view.menu.f$a r0 = r1.f1692j
            if (r0 != 0) goto L_0x000b
            androidx.appcompat.view.menu.f$a r0 = new androidx.appcompat.view.menu.f$a
            r0.<init>(r1)
            r1.f1692j = r0
        L_0x000b:
            androidx.appcompat.view.menu.f$a r0 = r1.f1692j
            return r0
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            androidx.appcompat.view.menu.h r1 = r0.f1686d
            androidx.appcompat.view.menu.f$a r2 = r0.f1692j
            androidx.appcompat.view.menu.k r2 = r2.getItem(r3)
            r3 = 0
            r1.m2410a(r2, r0, r3)
            return
    }
}
