package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
public class ActionMenuItemView extends androidx.appcompat.widget.C0658y implements androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a, android.view.View.OnClickListener, androidx.appcompat.widget.ActionMenuView.AbstractC0531a {

    /* renamed from: e */
    androidx.appcompat.view.menu.C0501k f1583e;

    /* renamed from: f */
    private java.lang.CharSequence f1584f;

    /* renamed from: g */
    private android.graphics.drawable.Drawable f1585g;

    /* renamed from: h */
    androidx.appcompat.view.menu.C0496h.AbstractC0498b f1586h;

    /* renamed from: i */
    private androidx.appcompat.widget.AbstractView$OnTouchListenerC0589f0 f1587i;

    /* renamed from: j */
    androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0482b f1588j;

    /* renamed from: k */
    private boolean f1589k;

    /* renamed from: l */
    private boolean f1590l;

    /* renamed from: m */
    private int f1591m;

    /* renamed from: n */
    private int f1592n;

    /* renamed from: o */
    private int f1593o;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    /* loaded from: classes.dex */
    private class C0481a extends androidx.appcompat.widget.AbstractView$OnTouchListenerC0589f0 {

        /* renamed from: k */
        final /* synthetic */ androidx.appcompat.view.menu.ActionMenuItemView f1594k;

        public C0481a(androidx.appcompat.view.menu.ActionMenuItemView r1) {
                r0 = this;
                r0.f1594k = r1
                r0.<init>(r1)
                return
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0589f0
        /* renamed from: a */
        public androidx.appcompat.view.menu.AbstractC0519t mo1839a() {
                r1 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = r1.f1594k
                androidx.appcompat.view.menu.ActionMenuItemView$b r0 = r0.f1588j
                if (r0 == 0) goto L_0x000b
                androidx.appcompat.view.menu.t r0 = r0.mo2113a()
                return r0
            L_0x000b:
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0589f0
        /* renamed from: b */
        protected boolean mo1838b() {
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = r3.f1594k
                androidx.appcompat.view.menu.h$b r1 = r0.f1586h
                r2 = 0
                if (r1 == 0) goto L_0x001c
                androidx.appcompat.view.menu.k r0 = r0.f1583e
                boolean r0 = r1.mo2265a(r0)
                if (r0 == 0) goto L_0x001c
                androidx.appcompat.view.menu.t r0 = r3.mo1839a()
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.mo2036d()
                if (r0 == 0) goto L_0x001c
                r2 = 1
            L_0x001c:
                return r2
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0482b {
        public AbstractC0482b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public abstract androidx.appcompat.view.menu.AbstractC0519t mo2113a();
    }

    public ActionMenuItemView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionMenuItemView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ActionMenuItemView(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            r3.<init>(r4, r5, r6)
            android.content.res.Resources r0 = r4.getResources()
            boolean r1 = r3.m2456e()
            r3.f1589k = r1
            int[] r1 = p000a.p001a.C0009j.ActionMenuItemView
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r6, r2)
            int r5 = p000a.p001a.C0009j.ActionMenuItemView_android_minWidth
            int r5 = r4.getDimensionPixelSize(r5, r2)
            r3.f1591m = r5
            r4.recycle()
            android.util.DisplayMetrics r4 = r0.getDisplayMetrics()
            float r4 = r4.density
            r5 = 1107296256(0x42000000, float:32.0)
            float r4 = r4 * r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r5
            int r4 = (int) r4
            r3.f1593o = r4
            r3.setOnClickListener(r3)
            r4 = -1
            r3.f1592n = r4
            r3.setSaveEnabled(r2)
            return
    }

    /* renamed from: e */
    private boolean m2456e() {
            r5 = this;
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.screenWidthDp
            int r2 = r0.screenHeightDp
            r3 = 480(0x1e0, float:6.73E-43)
            if (r1 >= r3) goto L_0x0022
            r4 = 640(0x280, float:8.97E-43)
            if (r1 < r4) goto L_0x001a
            if (r2 >= r3) goto L_0x0022
        L_0x001a:
            int r0 = r0.orientation
            r1 = 2
            if (r0 != r1) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r0 = 0
            goto L_0x0023
        L_0x0022:
            r0 = 1
        L_0x0023:
            return r0
    }

    /* renamed from: f */
    private void m2455f() {
            r4 = this;
            java.lang.CharSequence r0 = r4.f1584f
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            r0 = r0 ^ r1
            android.graphics.drawable.Drawable r2 = r4.f1585g
            if (r2 == 0) goto L_0x001e
            androidx.appcompat.view.menu.k r2 = r4.f1583e
            boolean r2 = r2.m2346n()
            if (r2 == 0) goto L_0x001d
            boolean r2 = r4.f1589k
            if (r2 != 0) goto L_0x001e
            boolean r2 = r4.f1590l
            if (r2 == 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            r0 = r0 & r1
            r1 = 0
            if (r0 == 0) goto L_0x0025
            java.lang.CharSequence r2 = r4.f1584f
            goto L_0x0026
        L_0x0025:
            r2 = r1
        L_0x0026:
            r4.setText(r2)
            androidx.appcompat.view.menu.k r2 = r4.f1583e
            java.lang.CharSequence r2 = r2.getContentDescription()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x003f
            if (r0 == 0) goto L_0x0039
            r2 = r1
            goto L_0x003f
        L_0x0039:
            androidx.appcompat.view.menu.k r2 = r4.f1583e
            java.lang.CharSequence r2 = r2.getTitle()
        L_0x003f:
            r4.setContentDescription(r2)
            androidx.appcompat.view.menu.k r2 = r4.f1583e
            java.lang.CharSequence r2 = r2.getTooltipText()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x005b
            if (r0 == 0) goto L_0x0051
            goto L_0x0057
        L_0x0051:
            androidx.appcompat.view.menu.k r0 = r4.f1583e
            java.lang.CharSequence r1 = r0.getTitle()
        L_0x0057:
            androidx.appcompat.widget.C0644v0.m1841a(r4, r1)
            goto L_0x005e
        L_0x005b:
            androidx.appcompat.widget.C0644v0.m1841a(r4, r2)
        L_0x005e:
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a
    /* renamed from: a */
    public void mo148a(androidx.appcompat.view.menu.C0501k r1, int r2) {
            r0 = this;
            r0.f1583e = r1
            android.graphics.drawable.Drawable r2 = r1.getIcon()
            r0.setIcon(r2)
            java.lang.CharSequence r2 = r1.m2366a(r0)
            r0.setTitle(r2)
            int r2 = r1.getItemId()
            r0.setId(r2)
            boolean r2 = r1.isVisible()
            if (r2 == 0) goto L_0x001f
            r2 = 0
            goto L_0x0021
        L_0x001f:
            r2 = 8
        L_0x0021:
            r0.setVisibility(r2)
            boolean r2 = r1.isEnabled()
            r0.setEnabled(r2)
            boolean r1 = r1.hasSubMenu()
            if (r1 == 0) goto L_0x003c
            androidx.appcompat.widget.f0 r1 = r0.f1587i
            if (r1 != 0) goto L_0x003c
            androidx.appcompat.view.menu.ActionMenuItemView$a r1 = new androidx.appcompat.view.menu.ActionMenuItemView$a
            r1.<init>(r0)
            r0.f1587i = r1
        L_0x003c:
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a
    /* renamed from: a */
    public boolean mo149a() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0531a
    /* renamed from: b */
    public boolean mo2112b() {
            r1 = this;
            boolean r0 = r1.m2457d()
            if (r0 == 0) goto L_0x0010
            androidx.appcompat.view.menu.k r0 = r1.f1583e
            android.graphics.drawable.Drawable r0 = r0.getIcon()
            if (r0 != 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
    }

    @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0531a
    /* renamed from: c */
    public boolean mo2111c() {
            r1 = this;
            boolean r0 = r1.m2457d()
            return r0
    }

    /* renamed from: d */
    public boolean m2457d() {
            r1 = this;
            java.lang.CharSequence r0 = r1.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    @Override // androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a
    public androidx.appcompat.view.menu.C0501k getItemData() {
            r1 = this;
            androidx.appcompat.view.menu.k r0 = r1.f1583e
            return r0
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            androidx.appcompat.view.menu.h$b r2 = r1.f1586h
            if (r2 == 0) goto L_0x0009
            androidx.appcompat.view.menu.k r0 = r1.f1583e
            r2.mo2265a(r0)
        L_0x0009:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            boolean r1 = r0.m2456e()
            r0.f1589k = r1
            r0.m2455f()
            return
    }

    @Override // androidx.appcompat.widget.C0658y, android.widget.TextView, android.view.View
    protected void onMeasure(int r6, int r7) {
            r5 = this;
            boolean r0 = r5.m2457d()
            if (r0 == 0) goto L_0x0019
            int r1 = r5.f1592n
            if (r1 < 0) goto L_0x0019
            int r2 = r5.getPaddingTop()
            int r3 = r5.getPaddingRight()
            int r4 = r5.getPaddingBottom()
            super.setPadding(r1, r2, r3, r4)
        L_0x0019:
            super.onMeasure(r6, r7)
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r2 = r5.getMeasuredWidth()
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r3) goto L_0x0033
            int r3 = r5.f1591m
            int r6 = java.lang.Math.min(r6, r3)
            goto L_0x0035
        L_0x0033:
            int r6 = r5.f1591m
        L_0x0035:
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r3) goto L_0x0046
            int r1 = r5.f1591m
            if (r1 <= 0) goto L_0x0046
            if (r2 >= r6) goto L_0x0046
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r3)
            super.onMeasure(r6, r7)
        L_0x0046:
            if (r0 != 0) goto L_0x006c
            android.graphics.drawable.Drawable r6 = r5.f1585g
            if (r6 == 0) goto L_0x006c
            int r6 = r5.getMeasuredWidth()
            android.graphics.drawable.Drawable r7 = r5.f1585g
            android.graphics.Rect r7 = r7.getBounds()
            int r7 = r7.width()
            int r6 = r6 - r7
            int r6 = r6 / 2
            int r7 = r5.getPaddingTop()
            int r0 = r5.getPaddingRight()
            int r1 = r5.getPaddingBottom()
            super.setPadding(r6, r7, r0, r1)
        L_0x006c:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r1) {
            r0 = this;
            r1 = 0
            super.onRestoreInstanceState(r1)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            androidx.appcompat.view.menu.k r0 = r1.f1583e
            boolean r0 = r0.hasSubMenu()
            if (r0 == 0) goto L_0x0014
            androidx.appcompat.widget.f0 r0 = r1.f1587i
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.onTouch(r1, r2)
            if (r0 == 0) goto L_0x0014
            r2 = 1
            return r2
        L_0x0014:
            boolean r2 = super.onTouchEvent(r2)
            return r2
    }

    public void setCheckable(boolean r1) {
            r0 = this;
            return
    }

    public void setChecked(boolean r1) {
            r0 = this;
            return
    }

    public void setExpandedFormat(boolean r2) {
            r1 = this;
            boolean r0 = r1.f1590l
            if (r0 == r2) goto L_0x000d
            r1.f1590l = r2
            androidx.appcompat.view.menu.k r2 = r1.f1583e
            if (r2 == 0) goto L_0x000d
            r2.m2362b()
        L_0x000d:
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r5) {
            r4 = this;
            r4.f1585g = r5
            if (r5 == 0) goto L_0x0028
            int r0 = r5.getIntrinsicWidth()
            int r1 = r5.getIntrinsicHeight()
            int r2 = r4.f1593o
            if (r0 <= r2) goto L_0x0018
            float r3 = (float) r2
            float r0 = (float) r0
            float r3 = r3 / r0
            float r0 = (float) r1
            float r0 = r0 * r3
            int r1 = (int) r0
            r0 = r2
        L_0x0018:
            int r2 = r4.f1593o
            if (r1 <= r2) goto L_0x0024
            float r3 = (float) r2
            float r1 = (float) r1
            float r3 = r3 / r1
            float r0 = (float) r0
            float r0 = r0 * r3
            int r0 = (int) r0
            r1 = r2
        L_0x0024:
            r2 = 0
            r5.setBounds(r2, r2, r0, r1)
        L_0x0028:
            r0 = 0
            r4.setCompoundDrawables(r5, r0, r0, r0)
            r4.m2455f()
            return
    }

    public void setItemInvoker(androidx.appcompat.view.menu.C0496h.AbstractC0498b r1) {
            r0 = this;
            r0.f1586h = r1
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.f1592n = r1
            super.setPadding(r1, r2, r3, r4)
            return
    }

    public void setPopupCallback(androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0482b r1) {
            r0 = this;
            r0.f1588j = r1
            return
    }

    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.f1584f = r1
            r0.m2455f()
            return
    }
}
