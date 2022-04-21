package com.google.android.material.internal;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends com.google.android.material.internal.C0959c implements androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a {

    /* renamed from: G */
    private static final int[] f3552G = null;

    /* renamed from: A */
    private android.widget.FrameLayout f3553A;

    /* renamed from: B */
    private androidx.appcompat.view.menu.C0501k f3554B;

    /* renamed from: C */
    private android.content.res.ColorStateList f3555C;

    /* renamed from: D */
    private boolean f3556D;

    /* renamed from: E */
    private android.graphics.drawable.Drawable f3557E;

    /* renamed from: F */
    private final p000a.p018g.p029l.C0185a f3558F;

    /* renamed from: w */
    private final int f3559w;

    /* renamed from: x */
    private boolean f3560x;

    /* renamed from: y */
    boolean f3561y;

    /* renamed from: z */
    private final android.widget.CheckedTextView f3562z;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    /* loaded from: classes.dex */
    class C0956a extends p000a.p018g.p029l.C0185a {

        /* renamed from: c */
        final /* synthetic */ com.google.android.material.internal.NavigationMenuItemView f3563c;

        C0956a(com.google.android.material.internal.NavigationMenuItemView r1) {
                r0 = this;
                r0.f3563c = r1
                r0.<init>()
                return
        }

        @Override // p000a.p018g.p029l.C0185a
        /* renamed from: a */
        public void mo143a(android.view.View r1, p000a.p018g.p029l.p030a0.C0191c r2) {
                r0 = this;
                super.mo143a(r1, r2)
                com.google.android.material.internal.NavigationMenuItemView r1 = r0.f3563c
                boolean r1 = r1.f3561y
                r2.m3529b(r1)
                return
        }
    }

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            r0[r1] = r2
            com.google.android.material.internal.NavigationMenuItemView.f3552G = r0
            return
    }

    public NavigationMenuItemView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public NavigationMenuItemView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public NavigationMenuItemView(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            com.google.android.material.internal.NavigationMenuItemView$a r3 = new com.google.android.material.internal.NavigationMenuItemView$a
            r3.<init>(r1)
            r1.f3558F = r3
            r3 = 0
            r1.setOrientation(r3)
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r2)
            int r4 = p050b.p051a.p052a.p053a.C0874g.design_navigation_menu_item
            r0 = 1
            r3.inflate(r4, r1, r0)
            android.content.res.Resources r2 = r2.getResources()
            int r3 = p050b.p051a.p052a.p053a.C0870c.design_navigation_icon_size
            int r2 = r2.getDimensionPixelSize(r3)
            r1.f3559w = r2
            int r2 = p050b.p051a.p052a.p053a.C0872e.design_menu_item_text
            android.view.View r2 = r1.findViewById(r2)
            android.widget.CheckedTextView r2 = (android.widget.CheckedTextView) r2
            r1.f3562z = r2
            android.widget.CheckedTextView r2 = r1.f3562z
            r2.setDuplicateParentStateEnabled(r0)
            android.widget.CheckedTextView r2 = r1.f3562z
            a.g.l.a r3 = r1.f3558F
            p000a.p018g.p029l.C0216r.m3440a(r2, r3)
            return
    }

    /* renamed from: e */
    private void m146e() {
            r2 = this;
            boolean r0 = r2.m144g()
            if (r0 == 0) goto L_0x0019
            android.widget.CheckedTextView r0 = r2.f3562z
            r1 = 8
            r0.setVisibility(r1)
            android.widget.FrameLayout r0 = r2.f3553A
            if (r0 == 0) goto L_0x0031
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.g0$a r0 = (androidx.appcompat.widget.C0593g0.C0594a) r0
            r1 = -1
            goto L_0x002a
        L_0x0019:
            android.widget.CheckedTextView r0 = r2.f3562z
            r1 = 0
            r0.setVisibility(r1)
            android.widget.FrameLayout r0 = r2.f3553A
            if (r0 == 0) goto L_0x0031
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.g0$a r0 = (androidx.appcompat.widget.C0593g0.C0594a) r0
            r1 = -2
        L_0x002a:
            r0.width = r1
            android.widget.FrameLayout r1 = r2.f3553A
            r1.setLayoutParams(r0)
        L_0x0031:
            return
    }

    /* renamed from: f */
    private android.graphics.drawable.StateListDrawable m145f() {
            r4 = this;
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r4.getContext()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            int r2 = p000a.p001a.C0000a.colorControlHighlight
            r3 = 1
            boolean r1 = r1.resolveAttribute(r2, r0, r3)
            if (r1 == 0) goto L_0x0033
            android.graphics.drawable.StateListDrawable r1 = new android.graphics.drawable.StateListDrawable
            r1.<init>()
            int[] r2 = com.google.android.material.internal.NavigationMenuItemView.f3552G
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable
            int r0 = r0.data
            r3.<init>(r0)
            r1.addState(r2, r3)
            int[] r0 = android.view.ViewGroup.EMPTY_STATE_SET
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r3 = 0
            r2.<init>(r3)
            r1.addState(r0, r2)
            return r1
        L_0x0033:
            r0 = 0
            return r0
    }

    /* renamed from: g */
    private boolean m144g() {
            r1 = this;
            androidx.appcompat.view.menu.k r0 = r1.f3554B
            java.lang.CharSequence r0 = r0.getTitle()
            if (r0 != 0) goto L_0x001a
            androidx.appcompat.view.menu.k r0 = r1.f3554B
            android.graphics.drawable.Drawable r0 = r0.getIcon()
            if (r0 != 0) goto L_0x001a
            androidx.appcompat.view.menu.k r0 = r1.f3554B
            android.view.View r0 = r0.getActionView()
            if (r0 == 0) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            return r0
    }

    private void setActionView(android.view.View r2) {
            r1 = this;
            if (r2 == 0) goto L_0x0020
            android.widget.FrameLayout r0 = r1.f3553A
            if (r0 != 0) goto L_0x0016
            int r0 = p050b.p051a.p052a.p053a.C0872e.design_menu_item_action_area_stub
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r0 = r0.inflate()
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1.f3553A = r0
        L_0x0016:
            android.widget.FrameLayout r0 = r1.f3553A
            r0.removeAllViews()
            android.widget.FrameLayout r0 = r1.f3553A
            r0.addView(r2)
        L_0x0020:
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a
    /* renamed from: a */
    public void mo148a(androidx.appcompat.view.menu.C0501k r1, int r2) {
            r0 = this;
            r0.f3554B = r1
            boolean r2 = r1.isVisible()
            if (r2 == 0) goto L_0x000a
            r2 = 0
            goto L_0x000c
        L_0x000a:
            r2 = 8
        L_0x000c:
            r0.setVisibility(r2)
            android.graphics.drawable.Drawable r2 = r0.getBackground()
            if (r2 != 0) goto L_0x001c
            android.graphics.drawable.StateListDrawable r2 = r0.m145f()
            p000a.p018g.p029l.C0216r.m3434a(r0, r2)
        L_0x001c:
            boolean r2 = r1.isCheckable()
            r0.setCheckable(r2)
            boolean r2 = r1.isChecked()
            r0.setChecked(r2)
            boolean r2 = r1.isEnabled()
            r0.setEnabled(r2)
            java.lang.CharSequence r2 = r1.getTitle()
            r0.setTitle(r2)
            android.graphics.drawable.Drawable r2 = r1.getIcon()
            r0.setIcon(r2)
            android.view.View r2 = r1.getActionView()
            r0.setActionView(r2)
            java.lang.CharSequence r2 = r1.getContentDescription()
            r0.setContentDescription(r2)
            java.lang.CharSequence r1 = r1.getTooltipText()
            androidx.appcompat.widget.C0644v0.m1841a(r0, r1)
            r0.m146e()
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a
    /* renamed from: a */
    public boolean mo149a() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: d */
    public void m147d() {
            r2 = this;
            android.widget.FrameLayout r0 = r2.f3553A
            if (r0 == 0) goto L_0x0007
            r0.removeAllViews()
        L_0x0007:
            android.widget.CheckedTextView r0 = r2.f3562z
            r1 = 0
            r0.setCompoundDrawables(r1, r1, r1, r1)
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a
    public androidx.appcompat.view.menu.C0501k getItemData() {
            r1 = this;
            androidx.appcompat.view.menu.k r0 = r1.f3554B
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int r2) {
            r1 = this;
            int r2 = r2 + 1
            int[] r2 = super.onCreateDrawableState(r2)
            androidx.appcompat.view.menu.k r0 = r1.f3554B
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.isCheckable()
            if (r0 == 0) goto L_0x001d
            androidx.appcompat.view.menu.k r0 = r1.f3554B
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x001d
            int[] r0 = com.google.android.material.internal.NavigationMenuItemView.f3552G
            android.view.ViewGroup.mergeDrawableStates(r2, r0)
        L_0x001d:
            return r2
    }

    public void setCheckable(boolean r3) {
            r2 = this;
            r2.refreshDrawableState()
            boolean r0 = r2.f3561y
            if (r0 == r3) goto L_0x0012
            r2.f3561y = r3
            a.g.l.a r3 = r2.f3558F
            android.widget.CheckedTextView r0 = r2.f3562z
            r1 = 2048(0x800, float:2.87E-42)
            r3.m3552a(r0, r1)
        L_0x0012:
            return
    }

    public void setChecked(boolean r2) {
            r1 = this;
            r1.refreshDrawableState()
            android.widget.CheckedTextView r0 = r1.f3562z
            r0.setChecked(r2)
            return
    }

    public void setHorizontalPadding(int r2) {
            r1 = this;
            r0 = 0
            r1.setPadding(r2, r0, r2, r0)
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0025
            boolean r1 = r3.f3556D
            if (r1 == 0) goto L_0x001f
            android.graphics.drawable.Drawable$ConstantState r1 = r4.getConstantState()
            if (r1 != 0) goto L_0x000e
            goto L_0x0012
        L_0x000e:
            android.graphics.drawable.Drawable r4 = r1.newDrawable()
        L_0x0012:
            android.graphics.drawable.Drawable r4 = androidx.core.graphics.drawable.C0698a.m1591h(r4)
            android.graphics.drawable.Drawable r4 = r4.mutate()
            android.content.res.ColorStateList r1 = r3.f3555C
            androidx.core.graphics.drawable.C0698a.m1603a(r4, r1)
        L_0x001f:
            int r1 = r3.f3559w
            r4.setBounds(r0, r0, r1, r1)
            goto L_0x004c
        L_0x0025:
            boolean r1 = r3.f3560x
            if (r1 == 0) goto L_0x004c
            android.graphics.drawable.Drawable r4 = r3.f3557E
            if (r4 != 0) goto L_0x004a
            android.content.res.Resources r4 = r3.getResources()
            int r1 = p050b.p051a.p052a.p053a.C0871d.navigation_empty_icon
            android.content.Context r2 = r3.getContext()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            android.graphics.drawable.Drawable r4 = p000a.p018g.p019d.p020c.C0136f.m3684a(r4, r1, r2)
            r3.f3557E = r4
            android.graphics.drawable.Drawable r4 = r3.f3557E
            if (r4 == 0) goto L_0x004a
            int r1 = r3.f3559w
            r4.setBounds(r0, r0, r1, r1)
        L_0x004a:
            android.graphics.drawable.Drawable r4 = r3.f3557E
        L_0x004c:
            android.widget.CheckedTextView r0 = r3.f3562z
            r1 = 0
            androidx.core.widget.C0720i.m1492a(r0, r4, r1, r1, r1)
            return
    }

    public void setIconPadding(int r2) {
            r1 = this;
            android.widget.CheckedTextView r0 = r1.f3562z
            r0.setCompoundDrawablePadding(r2)
            return
    }

    void setIconTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.f3555C = r1
            android.content.res.ColorStateList r1 = r0.f3555C
            if (r1 == 0) goto L_0x0008
            r1 = 1
            goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            r0.f3556D = r1
            androidx.appcompat.view.menu.k r1 = r0.f3554B
            if (r1 == 0) goto L_0x0016
            android.graphics.drawable.Drawable r1 = r1.getIcon()
            r0.setIcon(r1)
        L_0x0016:
            return
    }

    public void setNeedsEmptyIcon(boolean r1) {
            r0 = this;
            r0.f3560x = r1
            return
    }

    public void setTextAppearance(int r2) {
            r1 = this;
            android.widget.CheckedTextView r0 = r1.f3562z
            androidx.core.widget.C0720i.m1485d(r0, r2)
            return
    }

    public void setTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.widget.CheckedTextView r0 = r1.f3562z
            r0.setTextColor(r2)
            return
    }

    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            android.widget.CheckedTextView r0 = r1.f3562z
            r0.setText(r2)
            return
    }
}
