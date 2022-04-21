package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
public class ListMenuItemView extends android.widget.LinearLayout implements androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a, android.widget.AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b */
    private androidx.appcompat.view.menu.C0501k f1598b;

    /* renamed from: c */
    private android.widget.ImageView f1599c;

    /* renamed from: d */
    private android.widget.RadioButton f1600d;

    /* renamed from: e */
    private android.widget.TextView f1601e;

    /* renamed from: f */
    private android.widget.CheckBox f1602f;

    /* renamed from: g */
    private android.widget.TextView f1603g;

    /* renamed from: h */
    private android.widget.ImageView f1604h;

    /* renamed from: i */
    private android.widget.ImageView f1605i;

    /* renamed from: j */
    private android.widget.LinearLayout f1606j;

    /* renamed from: k */
    private android.graphics.drawable.Drawable f1607k;

    /* renamed from: l */
    private int f1608l;

    /* renamed from: m */
    private android.content.Context f1609m;

    /* renamed from: n */
    private boolean f1610n;

    /* renamed from: o */
    private android.graphics.drawable.Drawable f1611o;

    /* renamed from: p */
    private boolean f1612p;

    /* renamed from: q */
    private android.view.LayoutInflater f1613q;

    /* renamed from: r */
    private boolean f1614r;

    public ListMenuItemView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = p000a.p001a.C0000a.listMenuViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public ListMenuItemView(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            r3.<init>(r4, r5)
            android.content.Context r0 = r3.getContext()
            int[] r1 = p000a.p001a.C0009j.MenuView
            r2 = 0
            androidx.appcompat.widget.t0 r5 = androidx.appcompat.widget.C0638t0.m1900a(r0, r5, r1, r6, r2)
            int r6 = p000a.p001a.C0009j.MenuView_android_itemBackground
            android.graphics.drawable.Drawable r6 = r5.m1899b(r6)
            r3.f1607k = r6
            int r6 = p000a.p001a.C0009j.MenuView_android_itemTextAppearance
            r0 = -1
            int r6 = r5.m1888g(r6, r0)
            r3.f1608l = r6
            int r6 = p000a.p001a.C0009j.MenuView_preserveIconSpacing
            boolean r6 = r5.m1903a(r6, r2)
            r3.f1610n = r6
            r3.f1609m = r4
            int r6 = p000a.p001a.C0009j.MenuView_subMenuArrow
            android.graphics.drawable.Drawable r6 = r5.m1899b(r6)
            r3.f1611o = r6
            android.content.res.Resources$Theme r4 = r4.getTheme()
            r6 = 1
            int[] r6 = new int[r6]
            r0 = 16843049(0x1010129, float:2.369439E-38)
            r6[r2] = r0
            int r0 = p000a.p001a.C0000a.dropDownListViewStyle
            r1 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r1, r6, r0, r2)
            boolean r6 = r4.hasValue(r2)
            r3.f1612p = r6
            r5.m1908a()
            r4.recycle()
            return
    }

    /* renamed from: a */
    private void m2454a(android.view.View r2) {
            r1 = this;
            r0 = -1
            r1.m2453a(r2, r0)
            return
    }

    /* renamed from: a */
    private void m2453a(android.view.View r2, int r3) {
            r1 = this;
            android.widget.LinearLayout r0 = r1.f1606j
            if (r0 == 0) goto L_0x0008
            r0.addView(r2, r3)
            goto L_0x000b
        L_0x0008:
            r1.addView(r2, r3)
        L_0x000b:
            return
    }

    /* renamed from: b */
    private void m2451b() {
            r3 = this;
            android.view.LayoutInflater r0 = r3.getInflater()
            int r1 = p000a.p001a.C0006g.abc_list_menu_item_checkbox
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            r3.f1602f = r0
            android.widget.CheckBox r0 = r3.f1602f
            r3.m2454a(r0)
            return
    }

    /* renamed from: c */
    private void m2450c() {
            r3 = this;
            android.view.LayoutInflater r0 = r3.getInflater()
            int r1 = p000a.p001a.C0006g.abc_list_menu_item_icon
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.f1599c = r0
            android.widget.ImageView r0 = r3.f1599c
            r3.m2453a(r0, r2)
            return
    }

    /* renamed from: d */
    private void m2449d() {
            r3 = this;
            android.view.LayoutInflater r0 = r3.getInflater()
            int r1 = p000a.p001a.C0006g.abc_list_menu_item_radio
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r3.f1600d = r0
            android.widget.RadioButton r0 = r3.f1600d
            r3.m2454a(r0)
            return
    }

    private android.view.LayoutInflater getInflater() {
            r1 = this;
            android.view.LayoutInflater r0 = r1.f1613q
            if (r0 != 0) goto L_0x000e
            android.content.Context r0 = r1.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1.f1613q = r0
        L_0x000e:
            android.view.LayoutInflater r0 = r1.f1613q
            return r0
    }

    private void setSubMenuArrowVisible(boolean r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.f1604h
            if (r0 == 0) goto L_0x000d
            if (r2 == 0) goto L_0x0008
            r2 = 0
            goto L_0x000a
        L_0x0008:
            r2 = 8
        L_0x000a:
            r0.setVisibility(r2)
        L_0x000d:
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a
    /* renamed from: a */
    public void mo148a(androidx.appcompat.view.menu.C0501k r2, int r3) {
            r1 = this;
            r1.f1598b = r2
            boolean r3 = r2.isVisible()
            if (r3 == 0) goto L_0x000a
            r3 = 0
            goto L_0x000c
        L_0x000a:
            r3 = 8
        L_0x000c:
            r1.setVisibility(r3)
            java.lang.CharSequence r3 = r2.m2366a(r1)
            r1.setTitle(r3)
            boolean r3 = r2.isCheckable()
            r1.setCheckable(r3)
            boolean r3 = r2.m2347m()
            char r0 = r2.m2358d()
            r1.m2452a(r3, r0)
            android.graphics.drawable.Drawable r3 = r2.getIcon()
            r1.setIcon(r3)
            boolean r3 = r2.isEnabled()
            r1.setEnabled(r3)
            boolean r3 = r2.hasSubMenu()
            r1.setSubMenuArrowVisible(r3)
            java.lang.CharSequence r2 = r2.getContentDescription()
            r1.setContentDescription(r2)
            return
    }

    /* renamed from: a */
    public void m2452a(boolean r2, char r3) {
            r1 = this;
            if (r2 == 0) goto L_0x000c
            androidx.appcompat.view.menu.k r2 = r1.f1598b
            boolean r2 = r2.m2347m()
            if (r2 == 0) goto L_0x000c
            r2 = 0
            goto L_0x000e
        L_0x000c:
            r2 = 8
        L_0x000e:
            if (r2 != 0) goto L_0x001b
            android.widget.TextView r3 = r1.f1603g
            androidx.appcompat.view.menu.k r0 = r1.f1598b
            java.lang.String r0 = r0.m2356e()
            r3.setText(r0)
        L_0x001b:
            android.widget.TextView r3 = r1.f1603g
            int r3 = r3.getVisibility()
            if (r3 == r2) goto L_0x0028
            android.widget.TextView r3 = r1.f1603g
            r3.setVisibility(r2)
        L_0x0028:
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a
    /* renamed from: a */
    public boolean mo149a() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(android.graphics.Rect r5) {
            r4 = this;
            android.widget.ImageView r0 = r4.f1605i
            if (r0 == 0) goto L_0x0023
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0023
            android.widget.ImageView r0 = r4.f1605i
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r1 = r5.top
            android.widget.ImageView r2 = r4.f1605i
            int r2 = r2.getHeight()
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r0 = r0.bottomMargin
            int r2 = r2 + r0
            int r1 = r1 + r2
            r5.top = r1
        L_0x0023:
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a
    public androidx.appcompat.view.menu.C0501k getItemData() {
            r1 = this;
            androidx.appcompat.view.menu.k r0 = r1.f1598b
            return r0
    }

    @Override // android.view.View
    protected void onFinishInflate() {
            r3 = this;
            super.onFinishInflate()
            android.graphics.drawable.Drawable r0 = r3.f1607k
            p000a.p018g.p029l.C0216r.m3434a(r3, r0)
            int r0 = p000a.p001a.C0005f.title
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.f1601e = r0
            int r0 = r3.f1608l
            r1 = -1
            if (r0 == r1) goto L_0x001e
            android.widget.TextView r1 = r3.f1601e
            android.content.Context r2 = r3.f1609m
            r1.setTextAppearance(r2, r0)
        L_0x001e:
            int r0 = p000a.p001a.C0005f.shortcut
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.f1603g = r0
            int r0 = p000a.p001a.C0005f.submenuarrow
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.f1604h = r0
            android.widget.ImageView r0 = r3.f1604h
            if (r0 == 0) goto L_0x003b
            android.graphics.drawable.Drawable r1 = r3.f1611o
            r0.setImageDrawable(r1)
        L_0x003b:
            int r0 = p000a.p001a.C0005f.group_divider
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.f1605i = r0
            int r0 = p000a.p001a.C0005f.content
            android.view.View r0 = r3.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3.f1606j = r0
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int r4, int r5) {
            r3 = this;
            android.widget.ImageView r0 = r3.f1599c
            if (r0 == 0) goto L_0x0020
            boolean r0 = r3.f1610n
            if (r0 == 0) goto L_0x0020
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            android.widget.ImageView r1 = r3.f1599c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            int r2 = r0.height
            if (r2 <= 0) goto L_0x0020
            int r2 = r1.width
            if (r2 > 0) goto L_0x0020
            int r0 = r0.height
            r1.width = r0
        L_0x0020:
            super.onMeasure(r4, r5)
            return
    }

    public void setCheckable(boolean r4) {
            r3 = this;
            if (r4 != 0) goto L_0x000b
            android.widget.RadioButton r0 = r3.f1600d
            if (r0 != 0) goto L_0x000b
            android.widget.CheckBox r0 = r3.f1602f
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            androidx.appcompat.view.menu.k r0 = r3.f1598b
            boolean r0 = r0.m2351i()
            if (r0 == 0) goto L_0x001f
            android.widget.RadioButton r0 = r3.f1600d
            if (r0 != 0) goto L_0x001a
            r3.m2449d()
        L_0x001a:
            android.widget.RadioButton r0 = r3.f1600d
            android.widget.CheckBox r1 = r3.f1602f
            goto L_0x002a
        L_0x001f:
            android.widget.CheckBox r0 = r3.f1602f
            if (r0 != 0) goto L_0x0026
            r3.m2451b()
        L_0x0026:
            android.widget.CheckBox r0 = r3.f1602f
            android.widget.RadioButton r1 = r3.f1600d
        L_0x002a:
            r2 = 8
            if (r4 == 0) goto L_0x004d
            androidx.appcompat.view.menu.k r4 = r3.f1598b
            boolean r4 = r4.isChecked()
            r0.setChecked(r4)
            int r4 = r0.getVisibility()
            if (r4 == 0) goto L_0x0041
            r4 = 0
            r0.setVisibility(r4)
        L_0x0041:
            if (r1 == 0) goto L_0x005b
            int r4 = r1.getVisibility()
            if (r4 == r2) goto L_0x005b
            r1.setVisibility(r2)
            goto L_0x005b
        L_0x004d:
            android.widget.CheckBox r4 = r3.f1602f
            if (r4 == 0) goto L_0x0054
            r4.setVisibility(r2)
        L_0x0054:
            android.widget.RadioButton r4 = r3.f1600d
            if (r4 == 0) goto L_0x005b
            r4.setVisibility(r2)
        L_0x005b:
            return
    }

    public void setChecked(boolean r2) {
            r1 = this;
            androidx.appcompat.view.menu.k r0 = r1.f1598b
            boolean r0 = r0.m2351i()
            if (r0 == 0) goto L_0x0012
            android.widget.RadioButton r0 = r1.f1600d
            if (r0 != 0) goto L_0x000f
            r1.m2449d()
        L_0x000f:
            android.widget.RadioButton r0 = r1.f1600d
            goto L_0x001b
        L_0x0012:
            android.widget.CheckBox r0 = r1.f1602f
            if (r0 != 0) goto L_0x0019
            r1.m2451b()
        L_0x0019:
            android.widget.CheckBox r0 = r1.f1602f
        L_0x001b:
            r0.setChecked(r2)
            return
    }

    public void setForceShowIcon(boolean r1) {
            r0 = this;
            r0.f1614r = r1
            r0.f1610n = r1
            return
    }

    public void setGroupDividerEnabled(boolean r3) {
            r2 = this;
            android.widget.ImageView r0 = r2.f1605i
            if (r0 == 0) goto L_0x0011
            boolean r1 = r2.f1612p
            if (r1 != 0) goto L_0x000c
            if (r3 == 0) goto L_0x000c
            r3 = 0
            goto L_0x000e
        L_0x000c:
            r3 = 8
        L_0x000e:
            r0.setVisibility(r3)
        L_0x0011:
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r4) {
            r3 = this;
            androidx.appcompat.view.menu.k r0 = r3.f1598b
            boolean r0 = r0.m2348l()
            r1 = 0
            if (r0 != 0) goto L_0x0010
            boolean r0 = r3.f1614r
            if (r0 == 0) goto L_0x000e
            goto L_0x0010
        L_0x000e:
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            if (r0 != 0) goto L_0x0018
            boolean r2 = r3.f1610n
            if (r2 != 0) goto L_0x0018
            return
        L_0x0018:
            android.widget.ImageView r2 = r3.f1599c
            if (r2 != 0) goto L_0x0023
            if (r4 != 0) goto L_0x0023
            boolean r2 = r3.f1610n
            if (r2 != 0) goto L_0x0023
            return
        L_0x0023:
            android.widget.ImageView r2 = r3.f1599c
            if (r2 != 0) goto L_0x002a
            r3.m2450c()
        L_0x002a:
            if (r4 != 0) goto L_0x0039
            boolean r2 = r3.f1610n
            if (r2 == 0) goto L_0x0031
            goto L_0x0039
        L_0x0031:
            android.widget.ImageView r4 = r3.f1599c
            r0 = 8
            r4.setVisibility(r0)
            goto L_0x004f
        L_0x0039:
            android.widget.ImageView r2 = r3.f1599c
            if (r0 == 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r4 = 0
        L_0x003f:
            r2.setImageDrawable(r4)
            android.widget.ImageView r4 = r3.f1599c
            int r4 = r4.getVisibility()
            if (r4 == 0) goto L_0x004f
            android.widget.ImageView r4 = r3.f1599c
            r4.setVisibility(r1)
        L_0x004f:
            return
    }

    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            if (r2 == 0) goto L_0x0013
            android.widget.TextView r0 = r1.f1601e
            r0.setText(r2)
            android.widget.TextView r2 = r1.f1601e
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L_0x0022
            android.widget.TextView r2 = r1.f1601e
            r0 = 0
            goto L_0x001f
        L_0x0013:
            android.widget.TextView r2 = r1.f1601e
            int r2 = r2.getVisibility()
            r0 = 8
            if (r2 == r0) goto L_0x0022
            android.widget.TextView r2 = r1.f1601e
        L_0x001f:
            r2.setVisibility(r0)
        L_0x0022:
            return
    }
}
