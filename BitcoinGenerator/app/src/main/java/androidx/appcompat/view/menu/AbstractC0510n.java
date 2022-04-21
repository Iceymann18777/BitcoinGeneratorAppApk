package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.n */
/* loaded from: classes.dex */
abstract class AbstractC0510n implements androidx.appcompat.view.menu.AbstractC0519t, androidx.appcompat.view.menu.AbstractC0513p, android.widget.AdapterView.OnItemClickListener {

    /* renamed from: b */
    private android.graphics.Rect f1772b;

    AbstractC0510n() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    protected static int m2332a(android.widget.ListAdapter r9, android.view.ViewGroup r10, android.content.Context r11, int r12) {
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            int r3 = r9.getCount()
            r4 = 0
            r6 = r10
            r7 = r4
            r10 = 0
            r5 = 0
        L_0x0012:
            if (r0 >= r3) goto L_0x0037
            int r8 = r9.getItemViewType(r0)
            if (r8 == r5) goto L_0x001c
            r7 = r4
            r5 = r8
        L_0x001c:
            if (r6 != 0) goto L_0x0023
            android.widget.FrameLayout r6 = new android.widget.FrameLayout
            r6.<init>(r11)
        L_0x0023:
            android.view.View r7 = r9.getView(r0, r7, r6)
            r7.measure(r1, r2)
            int r8 = r7.getMeasuredWidth()
            if (r8 < r12) goto L_0x0031
            return r12
        L_0x0031:
            if (r8 <= r10) goto L_0x0034
            r10 = r8
        L_0x0034:
            int r0 = r0 + 1
            goto L_0x0012
        L_0x0037:
            return r10
    }

    /* renamed from: a */
    protected static androidx.appcompat.view.menu.C0495g m2333a(android.widget.ListAdapter r1) {
            boolean r0 = r1 instanceof android.widget.HeaderViewListAdapter
            if (r0 == 0) goto L_0x000d
            android.widget.HeaderViewListAdapter r1 = (android.widget.HeaderViewListAdapter) r1
            android.widget.ListAdapter r1 = r1.getWrappedAdapter()
            androidx.appcompat.view.menu.g r1 = (androidx.appcompat.view.menu.C0495g) r1
            return r1
        L_0x000d:
            androidx.appcompat.view.menu.g r1 = (androidx.appcompat.view.menu.C0495g) r1
            return r1
    }

    /* renamed from: b */
    protected static boolean m2331b(androidx.appcompat.view.menu.C0496h r5) {
            int r0 = r5.size()
            r1 = 0
            r2 = 0
        L_0x0006:
            if (r2 >= r0) goto L_0x001d
            android.view.MenuItem r3 = r5.getItem(r2)
            boolean r4 = r3.isVisible()
            if (r4 == 0) goto L_0x001a
            android.graphics.drawable.Drawable r3 = r3.getIcon()
            if (r3 == 0) goto L_0x001a
            r1 = 1
            goto L_0x001d
        L_0x001a:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x001d:
            return r1
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public int mo136a() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: a */
    public abstract void mo2312a(int r1);

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo133a(android.content.Context r1, androidx.appcompat.view.menu.C0496h r2) {
            r0 = this;
            return
    }

    /* renamed from: a */
    public void m2334a(android.graphics.Rect r1) {
            r0 = this;
            r0.f1772b = r1
            return
    }

    /* renamed from: a */
    public abstract void mo2311a(android.view.View r1);

    /* renamed from: a */
    public abstract void mo2310a(android.widget.PopupWindow.OnDismissListener r1);

    /* renamed from: a */
    public abstract void mo2309a(androidx.appcompat.view.menu.C0496h r1);

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public boolean mo127a(androidx.appcompat.view.menu.C0496h r1, androidx.appcompat.view.menu.C0501k r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* renamed from: b */
    public abstract void mo2307b(int r1);

    /* renamed from: b */
    public abstract void mo2306b(boolean r1);

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: b */
    public boolean mo119b(androidx.appcompat.view.menu.C0496h r1, androidx.appcompat.view.menu.C0501k r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* renamed from: c */
    public abstract void mo2305c(int r1);

    /* renamed from: c */
    public abstract void mo2304c(boolean r1);

    /* renamed from: g */
    protected boolean mo2330g() {
            r1 = this;
            r0 = 1
            return r0
    }

    /* renamed from: h */
    public android.graphics.Rect m2329h() {
            r1 = this;
            android.graphics.Rect r0 = r1.f1772b
            return r0
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            android.widget.Adapter r1 = r1.getAdapter()
            android.widget.ListAdapter r1 = (android.widget.ListAdapter) r1
            androidx.appcompat.view.menu.g r2 = m2333a(r1)
            androidx.appcompat.view.menu.h r2 = r2.f1696b
            java.lang.Object r1 = r1.getItem(r3)
            android.view.MenuItem r1 = (android.view.MenuItem) r1
            boolean r3 = r0.mo2330g()
            if (r3 == 0) goto L_0x001a
            r3 = 0
            goto L_0x001b
        L_0x001a:
            r3 = 4
        L_0x001b:
            r2.m2410a(r1, r0, r3)
            return
    }
}
