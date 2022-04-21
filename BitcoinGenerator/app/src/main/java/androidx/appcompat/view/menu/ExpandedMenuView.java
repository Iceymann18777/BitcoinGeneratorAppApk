package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends android.widget.ListView implements androidx.appcompat.view.menu.C0496h.AbstractC0498b, androidx.appcompat.view.menu.AbstractC0515q, android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d */
    private static final int[] f1595d = null;

    /* renamed from: b */
    private androidx.appcompat.view.menu.C0496h f1596b;

    /* renamed from: c */
    private int f1597c;

    static {
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA  , data: [16842964, 16843049} // fill-array
            androidx.appcompat.view.menu.ExpandedMenuView.f1595d = r0
            return
    }

    public ExpandedMenuView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 16842868(0x1010074, float:2.3693883E-38)
            r1.<init>(r2, r3, r0)
            return
    }

    public ExpandedMenuView(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4)
            r2.setOnItemClickListener(r2)
            int[] r0 = androidx.appcompat.view.menu.ExpandedMenuView.f1595d
            r1 = 0
            androidx.appcompat.widget.t0 r3 = androidx.appcompat.widget.C0638t0.m1900a(r3, r4, r0, r5, r1)
            boolean r4 = r3.m1889g(r1)
            if (r4 == 0) goto L_0x001a
            android.graphics.drawable.Drawable r4 = r3.m1899b(r1)
            r2.setBackgroundDrawable(r4)
        L_0x001a:
            r4 = 1
            boolean r5 = r3.m1889g(r4)
            if (r5 == 0) goto L_0x0028
            android.graphics.drawable.Drawable r4 = r3.m1899b(r4)
            r2.setDivider(r4)
        L_0x0028:
            r3.m1908a()
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0515q
    /* renamed from: a */
    public void mo142a(androidx.appcompat.view.menu.C0496h r1) {
            r0 = this;
            r0.f1596b = r1
            return
    }

    @Override // androidx.appcompat.view.menu.C0496h.AbstractC0498b
    /* renamed from: a */
    public boolean mo2265a(androidx.appcompat.view.menu.C0501k r3) {
            r2 = this;
            androidx.appcompat.view.menu.h r0 = r2.f1596b
            r1 = 0
            boolean r3 = r0.m2411a(r3, r1)
            return r3
    }

    public int getWindowAnimations() {
            r1 = this;
            int r0 = r1.f1597c
            return r0
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            r0 = 0
            r1.setChildrenDrawingCacheEnabled(r0)
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            android.widget.ListAdapter r1 = r0.getAdapter()
            java.lang.Object r1 = r1.getItem(r3)
            androidx.appcompat.view.menu.k r1 = (androidx.appcompat.view.menu.C0501k) r1
            r0.mo2265a(r1)
            return
    }
}
