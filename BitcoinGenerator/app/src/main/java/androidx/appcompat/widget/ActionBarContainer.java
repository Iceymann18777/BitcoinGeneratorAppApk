package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ActionBarContainer extends android.widget.FrameLayout {

    /* renamed from: b */
    private boolean f1811b;

    /* renamed from: c */
    private android.view.View f1812c;

    /* renamed from: d */
    private android.view.View f1813d;

    /* renamed from: e */
    private android.view.View f1814e;

    /* renamed from: f */
    android.graphics.drawable.Drawable f1815f;

    /* renamed from: g */
    android.graphics.drawable.Drawable f1816g;

    /* renamed from: h */
    android.graphics.drawable.Drawable f1817h;

    /* renamed from: i */
    boolean f1818i;

    /* renamed from: j */
    boolean f1819j;

    /* renamed from: k */
    private int f1820k;

    public ActionBarContainer(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionBarContainer(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            androidx.appcompat.widget.b r0 = new androidx.appcompat.widget.b
            r0.<init>(r2)
            p000a.p018g.p029l.C0216r.m3434a(r2, r0)
            int[] r0 = p000a.p001a.C0009j.ActionBar
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0)
            int r4 = p000a.p001a.C0009j.ActionBar_background
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r4)
            r2.f1815f = r4
            int r4 = p000a.p001a.C0009j.ActionBar_backgroundStacked
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r4)
            r2.f1816g = r4
            int r4 = p000a.p001a.C0009j.ActionBar_height
            r0 = -1
            int r4 = r3.getDimensionPixelSize(r4, r0)
            r2.f1820k = r4
            int r4 = r2.getId()
            int r0 = p000a.p001a.C0005f.split_action_bar
            r1 = 1
            if (r4 != r0) goto L_0x003d
            r2.f1818i = r1
            int r4 = p000a.p001a.C0009j.ActionBar_backgroundSplit
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r4)
            r2.f1817h = r4
        L_0x003d:
            r3.recycle()
            boolean r3 = r2.f1818i
            r4 = 0
            if (r3 == 0) goto L_0x004b
            android.graphics.drawable.Drawable r3 = r2.f1817h
            if (r3 != 0) goto L_0x0054
        L_0x0049:
            r4 = 1
            goto L_0x0054
        L_0x004b:
            android.graphics.drawable.Drawable r3 = r2.f1815f
            if (r3 != 0) goto L_0x0054
            android.graphics.drawable.Drawable r3 = r2.f1816g
            if (r3 != 0) goto L_0x0054
            goto L_0x0049
        L_0x0054:
            r2.setWillNotDraw(r4)
            return
    }

    /* renamed from: a */
    private int m2291a(android.view.View r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r3 = r3.getMeasuredHeight()
            int r1 = r0.topMargin
            int r3 = r3 + r1
            int r0 = r0.bottomMargin
            int r3 = r3 + r0
            return r3
    }

    /* renamed from: b */
    private boolean m2290b(android.view.View r3) {
            r2 = this;
            if (r3 == 0) goto L_0x0013
            int r0 = r3.getVisibility()
            r1 = 8
            if (r0 == r1) goto L_0x0013
            int r3 = r3.getMeasuredHeight()
            if (r3 != 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r3 = 0
            goto L_0x0014
        L_0x0013:
            r3 = 1
        L_0x0014:
            return r3
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
            r2 = this;
            super.drawableStateChanged()
            android.graphics.drawable.Drawable r0 = r2.f1815f
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0016
            android.graphics.drawable.Drawable r0 = r2.f1815f
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r2.f1816g
            if (r0 == 0) goto L_0x0029
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0029
            android.graphics.drawable.Drawable r0 = r2.f1816g
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L_0x0029:
            android.graphics.drawable.Drawable r0 = r2.f1817h
            if (r0 == 0) goto L_0x003c
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x003c
            android.graphics.drawable.Drawable r0 = r2.f1817h
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L_0x003c:
            return
    }

    public android.view.View getTabContainer() {
            r1 = this;
            android.view.View r0 = r1.f1812c
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            android.graphics.drawable.Drawable r0 = r1.f1815f
            if (r0 == 0) goto L_0x000a
            r0.jumpToCurrentState()
        L_0x000a:
            android.graphics.drawable.Drawable r0 = r1.f1816g
            if (r0 == 0) goto L_0x0011
            r0.jumpToCurrentState()
        L_0x0011:
            android.graphics.drawable.Drawable r0 = r1.f1817h
            if (r0 == 0) goto L_0x0018
            r0.jumpToCurrentState()
        L_0x0018:
            return
    }

    @Override // android.view.View
    public void onFinishInflate() {
            r1 = this;
            super.onFinishInflate()
            int r0 = p000a.p001a.C0005f.action_bar
            android.view.View r0 = r1.findViewById(r0)
            r1.f1813d = r0
            int r0 = p000a.p001a.C0005f.action_context_bar
            android.view.View r0 = r1.findViewById(r0)
            r1.f1814e = r0
            return
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent r1) {
            r0 = this;
            super.onHoverEvent(r1)
            r1 = 1
            return r1
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            boolean r0 = r1.f1811b
            if (r0 != 0) goto L_0x000d
            boolean r2 = super.onInterceptTouchEvent(r2)
            if (r2 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            r2 = 0
            goto L_0x000e
        L_0x000d:
            r2 = 1
        L_0x000e:
            return r2
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
            r5 = this;
            super.onLayout(r6, r7, r8, r9, r10)
            android.view.View r6 = r5.f1812c
            r8 = 8
            r10 = 1
            r0 = 0
            if (r6 == 0) goto L_0x0013
            int r1 = r6.getVisibility()
            if (r1 == r8) goto L_0x0013
            r1 = 1
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            if (r6 == 0) goto L_0x0035
            int r2 = r6.getVisibility()
            if (r2 == r8) goto L_0x0035
            int r8 = r5.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r6.getMeasuredHeight()
            int r3 = r8 - r3
            int r4 = r2.bottomMargin
            int r3 = r3 - r4
            int r2 = r2.bottomMargin
            int r8 = r8 - r2
            r6.layout(r7, r3, r9, r8)
        L_0x0035:
            boolean r7 = r5.f1818i
            if (r7 == 0) goto L_0x004c
            android.graphics.drawable.Drawable r6 = r5.f1817h
            if (r6 == 0) goto L_0x004a
            int r7 = r5.getMeasuredWidth()
            int r8 = r5.getMeasuredHeight()
            r6.setBounds(r0, r0, r7, r8)
            goto L_0x00ba
        L_0x004a:
            r10 = 0
            goto L_0x00ba
        L_0x004c:
            android.graphics.drawable.Drawable r7 = r5.f1815f
            if (r7 == 0) goto L_0x009d
            android.view.View r7 = r5.f1813d
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L_0x0076
            android.graphics.drawable.Drawable r7 = r5.f1815f
            android.view.View r8 = r5.f1813d
            int r8 = r8.getLeft()
            android.view.View r9 = r5.f1813d
            int r9 = r9.getTop()
            android.view.View r0 = r5.f1813d
            int r0 = r0.getRight()
            android.view.View r2 = r5.f1813d
        L_0x006e:
            int r2 = r2.getBottom()
            r7.setBounds(r8, r9, r0, r2)
            goto L_0x009c
        L_0x0076:
            android.view.View r7 = r5.f1814e
            if (r7 == 0) goto L_0x0097
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L_0x0097
            android.graphics.drawable.Drawable r7 = r5.f1815f
            android.view.View r8 = r5.f1814e
            int r8 = r8.getLeft()
            android.view.View r9 = r5.f1814e
            int r9 = r9.getTop()
            android.view.View r0 = r5.f1814e
            int r0 = r0.getRight()
            android.view.View r2 = r5.f1814e
            goto L_0x006e
        L_0x0097:
            android.graphics.drawable.Drawable r7 = r5.f1815f
            r7.setBounds(r0, r0, r0, r0)
        L_0x009c:
            r0 = 1
        L_0x009d:
            r5.f1819j = r1
            if (r1 == 0) goto L_0x00b9
            android.graphics.drawable.Drawable r7 = r5.f1816g
            if (r7 == 0) goto L_0x00b9
            int r8 = r6.getLeft()
            int r9 = r6.getTop()
            int r0 = r6.getRight()
            int r6 = r6.getBottom()
            r7.setBounds(r8, r9, r0, r6)
            goto L_0x00ba
        L_0x00b9:
            r10 = r0
        L_0x00ba:
            if (r10 == 0) goto L_0x00bf
            r5.invalidate()
        L_0x00bf:
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int r4, int r5) {
            r3 = this;
            android.view.View r0 = r3.f1813d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L_0x001c
            int r0 = r3.f1820k
            if (r0 < 0) goto L_0x001c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L_0x001c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f1813d
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f1812c
            if (r0 == 0) goto L_0x006f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x006f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L_0x006f
            android.view.View r0 = r3.f1813d
            boolean r0 = r3.m2290b(r0)
            if (r0 != 0) goto L_0x0047
            android.view.View r0 = r3.f1813d
        L_0x0042:
            int r0 = r3.m2291a(r0)
            goto L_0x0053
        L_0x0047:
            android.view.View r0 = r3.f1814e
            boolean r0 = r3.m2290b(r0)
            if (r0 != 0) goto L_0x0052
            android.view.View r0 = r3.f1814e
            goto L_0x0042
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r4 != r1) goto L_0x005a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L_0x005d
        L_0x005a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x005d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f1812c
            int r1 = r3.m2291a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L_0x006f:
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            super.onTouchEvent(r1)
            r1 = 1
            return r1
    }

    public void setPrimaryBackground(android.graphics.drawable.Drawable r5) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f1815f
            if (r0 == 0) goto L_0x000d
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r4.f1815f
            r4.unscheduleDrawable(r0)
        L_0x000d:
            r4.f1815f = r5
            if (r5 == 0) goto L_0x0033
            r5.setCallback(r4)
            android.view.View r5 = r4.f1813d
            if (r5 == 0) goto L_0x0033
            android.graphics.drawable.Drawable r0 = r4.f1815f
            int r5 = r5.getLeft()
            android.view.View r1 = r4.f1813d
            int r1 = r1.getTop()
            android.view.View r2 = r4.f1813d
            int r2 = r2.getRight()
            android.view.View r3 = r4.f1813d
            int r3 = r3.getBottom()
            r0.setBounds(r5, r1, r2, r3)
        L_0x0033:
            boolean r5 = r4.f1818i
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x003e
            android.graphics.drawable.Drawable r5 = r4.f1817h
            if (r5 != 0) goto L_0x0047
            goto L_0x0048
        L_0x003e:
            android.graphics.drawable.Drawable r5 = r4.f1815f
            if (r5 != 0) goto L_0x0047
            android.graphics.drawable.Drawable r5 = r4.f1816g
            if (r5 != 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r0 = 0
        L_0x0048:
            r4.setWillNotDraw(r0)
            r4.invalidate()
            return
    }

    public void setSplitBackground(android.graphics.drawable.Drawable r4) {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.f1817h
            if (r0 == 0) goto L_0x000d
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r3.f1817h
            r3.unscheduleDrawable(r0)
        L_0x000d:
            r3.f1817h = r4
            r0 = 0
            if (r4 == 0) goto L_0x0028
            r4.setCallback(r3)
            boolean r4 = r3.f1818i
            if (r4 == 0) goto L_0x0028
            android.graphics.drawable.Drawable r4 = r3.f1817h
            if (r4 == 0) goto L_0x0028
            int r1 = r3.getMeasuredWidth()
            int r2 = r3.getMeasuredHeight()
            r4.setBounds(r0, r0, r1, r2)
        L_0x0028:
            boolean r4 = r3.f1818i
            r1 = 1
            if (r4 == 0) goto L_0x0033
            android.graphics.drawable.Drawable r4 = r3.f1817h
            if (r4 != 0) goto L_0x003c
        L_0x0031:
            r0 = 1
            goto L_0x003c
        L_0x0033:
            android.graphics.drawable.Drawable r4 = r3.f1815f
            if (r4 != 0) goto L_0x003c
            android.graphics.drawable.Drawable r4 = r3.f1816g
            if (r4 != 0) goto L_0x003c
            goto L_0x0031
        L_0x003c:
            r3.setWillNotDraw(r0)
            r3.invalidate()
            return
    }

    public void setStackedBackground(android.graphics.drawable.Drawable r5) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f1816g
            if (r0 == 0) goto L_0x000d
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r4.f1816g
            r4.unscheduleDrawable(r0)
        L_0x000d:
            r4.f1816g = r5
            if (r5 == 0) goto L_0x0037
            r5.setCallback(r4)
            boolean r5 = r4.f1819j
            if (r5 == 0) goto L_0x0037
            android.graphics.drawable.Drawable r5 = r4.f1816g
            if (r5 == 0) goto L_0x0037
            android.view.View r0 = r4.f1812c
            int r0 = r0.getLeft()
            android.view.View r1 = r4.f1812c
            int r1 = r1.getTop()
            android.view.View r2 = r4.f1812c
            int r2 = r2.getRight()
            android.view.View r3 = r4.f1812c
            int r3 = r3.getBottom()
            r5.setBounds(r0, r1, r2, r3)
        L_0x0037:
            boolean r5 = r4.f1818i
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0042
            android.graphics.drawable.Drawable r5 = r4.f1817h
            if (r5 != 0) goto L_0x004b
            goto L_0x004c
        L_0x0042:
            android.graphics.drawable.Drawable r5 = r4.f1815f
            if (r5 != 0) goto L_0x004b
            android.graphics.drawable.Drawable r5 = r4.f1816g
            if (r5 != 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            r4.setWillNotDraw(r0)
            r4.invalidate()
            return
    }

    public void setTabContainer(androidx.appcompat.widget.C0619m0 r3) {
            r2 = this;
            android.view.View r0 = r2.f1812c
            if (r0 == 0) goto L_0x0007
            r2.removeView(r0)
        L_0x0007:
            r2.f1812c = r3
            if (r3 == 0) goto L_0x001c
            r2.addView(r3)
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            r1 = -1
            r0.width = r1
            r1 = -2
            r0.height = r1
            r0 = 0
            r3.setAllowCollapse(r0)
        L_0x001c:
            return
    }

    public void setTransitioning(boolean r1) {
            r0 = this;
            r0.f1811b = r1
            if (r1 == 0) goto L_0x0007
            r1 = 393216(0x60000, float:5.51013E-40)
            goto L_0x0009
        L_0x0007:
            r1 = 262144(0x40000, float:3.67342E-40)
        L_0x0009:
            r0.setDescendantFocusability(r1)
            return
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
            r2 = this;
            super.setVisibility(r3)
            r0 = 0
            if (r3 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            android.graphics.drawable.Drawable r1 = r2.f1815f
            if (r1 == 0) goto L_0x0010
            r1.setVisible(r3, r0)
        L_0x0010:
            android.graphics.drawable.Drawable r1 = r2.f1816g
            if (r1 == 0) goto L_0x0017
            r1.setVisible(r3, r0)
        L_0x0017:
            android.graphics.drawable.Drawable r1 = r2.f1817h
            if (r1 == 0) goto L_0x001e
            r1.setVisible(r3, r0)
        L_0x001e:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.ActionMode startActionModeForChild(android.view.View r1, android.view.ActionMode.Callback r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.ActionMode startActionModeForChild(android.view.View r1, android.view.ActionMode.Callback r2, int r3) {
            r0 = this;
            if (r3 == 0) goto L_0x0007
            android.view.ActionMode r1 = super.startActionModeForChild(r1, r2, r3)
            return r1
        L_0x0007:
            r1 = 0
            return r1
    }

    @Override // android.view.View
    protected boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1815f
            if (r2 != r0) goto L_0x0008
            boolean r0 = r1.f1818i
            if (r0 == 0) goto L_0x001e
        L_0x0008:
            android.graphics.drawable.Drawable r0 = r1.f1816g
            if (r2 != r0) goto L_0x0010
            boolean r0 = r1.f1819j
            if (r0 != 0) goto L_0x001e
        L_0x0010:
            android.graphics.drawable.Drawable r0 = r1.f1817h
            if (r2 != r0) goto L_0x0018
            boolean r0 = r1.f1818i
            if (r0 != 0) goto L_0x001e
        L_0x0018:
            boolean r2 = super.verifyDrawable(r2)
            if (r2 == 0) goto L_0x0020
        L_0x001e:
            r2 = 1
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            return r2
    }
}
