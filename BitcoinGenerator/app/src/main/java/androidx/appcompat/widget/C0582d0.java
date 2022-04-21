package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.d0 */
/* loaded from: classes.dex */
class C0582d0 extends android.widget.ListView {

    /* renamed from: b */
    private final android.graphics.Rect f2073b;

    /* renamed from: c */
    private int f2074c;

    /* renamed from: d */
    private int f2075d;

    /* renamed from: e */
    private int f2076e;

    /* renamed from: f */
    private int f2077f;

    /* renamed from: g */
    private int f2078g;

    /* renamed from: h */
    private java.lang.reflect.Field f2079h;

    /* renamed from: i */
    private androidx.appcompat.widget.C0582d0.C0583a f2080i;

    /* renamed from: j */
    private boolean f2081j;

    /* renamed from: k */
    private boolean f2082k;

    /* renamed from: l */
    private boolean f2083l;

    /* renamed from: m */
    private p000a.p018g.p029l.C0223v f2084m;

    /* renamed from: n */
    private androidx.core.widget.C0717f f2085n;

    /* renamed from: o */
    androidx.appcompat.widget.C0582d0.RunnableC0584b f2086o;

    /* renamed from: androidx.appcompat.widget.d0$a */
    /* loaded from: classes.dex */
    private static class C0583a extends p000a.p001a.p004l.p005a.C0024c {

        /* renamed from: c */
        private boolean f2087c;

        C0583a(android.graphics.drawable.Drawable r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 1
                r0.f2087c = r1
                return
        }

        /* renamed from: a */
        void m2092a(boolean r1) {
                r0 = this;
                r0.f2087c = r1
                return
        }

        @Override // p000a.p001a.p004l.p005a.C0024c, android.graphics.drawable.Drawable
        public void draw(android.graphics.Canvas r2) {
                r1 = this;
                boolean r0 = r1.f2087c
                if (r0 == 0) goto L_0x0007
                super.draw(r2)
            L_0x0007:
                return
        }

        @Override // p000a.p001a.p004l.p005a.C0024c, android.graphics.drawable.Drawable
        public void setHotspot(float r2, float r3) {
                r1 = this;
                boolean r0 = r1.f2087c
                if (r0 == 0) goto L_0x0007
                super.setHotspot(r2, r3)
            L_0x0007:
                return
        }

        @Override // p000a.p001a.p004l.p005a.C0024c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int r2, int r3, int r4, int r5) {
                r1 = this;
                boolean r0 = r1.f2087c
                if (r0 == 0) goto L_0x0007
                super.setHotspotBounds(r2, r3, r4, r5)
            L_0x0007:
                return
        }

        @Override // p000a.p001a.p004l.p005a.C0024c, android.graphics.drawable.Drawable
        public boolean setState(int[] r2) {
                r1 = this;
                boolean r0 = r1.f2087c
                if (r0 == 0) goto L_0x0009
                boolean r2 = super.setState(r2)
                return r2
            L_0x0009:
                r2 = 0
                return r2
        }

        @Override // p000a.p001a.p004l.p005a.C0024c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean r2, boolean r3) {
                r1 = this;
                boolean r0 = r1.f2087c
                if (r0 == 0) goto L_0x0009
                boolean r2 = super.setVisible(r2, r3)
                return r2
            L_0x0009:
                r2 = 0
                return r2
        }
    }

    /* renamed from: androidx.appcompat.widget.d0$b */
    /* loaded from: classes.dex */
    private class RunnableC0584b implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.widget.C0582d0 f2088b;

        RunnableC0584b(androidx.appcompat.widget.C0582d0 r1) {
                r0 = this;
                r0.f2088b = r1
                r0.<init>()
                return
        }

        /* renamed from: a */
        public void m2091a() {
                r2 = this;
                androidx.appcompat.widget.d0 r0 = r2.f2088b
                r1 = 0
                r0.f2086o = r1
                r0.removeCallbacks(r2)
                return
        }

        /* renamed from: b */
        public void m2090b() {
                r1 = this;
                androidx.appcompat.widget.d0 r0 = r1.f2088b
                r0.post(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.appcompat.widget.d0 r0 = r2.f2088b
                r1 = 0
                r0.f2086o = r1
                r0.drawableStateChanged()
                return
        }
    }

    C0582d0(android.content.Context r3, boolean r4) {
            r2 = this;
            int r0 = p000a.p001a.C0000a.dropDownListViewStyle
            r1 = 0
            r2.<init>(r3, r1, r0)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r2.f2073b = r3
            r3 = 0
            r2.f2074c = r3
            r2.f2075d = r3
            r2.f2076e = r3
            r2.f2077f = r3
            r2.f2082k = r4
            r2.setCacheColorHint(r3)
            java.lang.Class<android.widget.AbsListView> r3 = android.widget.AbsListView.class
            java.lang.String r4 = "mIsChildViewEnabled"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: NoSuchFieldException -> 0x002c
            r2.f2079h = r3     // Catch: NoSuchFieldException -> 0x002c
            java.lang.reflect.Field r3 = r2.f2079h     // Catch: NoSuchFieldException -> 0x002c
            r4 = 1
            r3.setAccessible(r4)     // Catch: NoSuchFieldException -> 0x002c
            goto L_0x0030
        L_0x002c:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0030:
            return
    }

    /* renamed from: a */
    private void m2103a() {
            r3 = this;
            r0 = 0
            r3.f2083l = r0
            r3.setPressed(r0)
            r3.drawableStateChanged()
            int r1 = r3.f2078g
            int r2 = r3.getFirstVisiblePosition()
            int r1 = r1 - r2
            android.view.View r1 = r3.getChildAt(r1)
            if (r1 == 0) goto L_0x0019
            r1.setPressed(r0)
        L_0x0019:
            a.g.l.v r0 = r3.f2084m
            if (r0 == 0) goto L_0x0023
            r0.m3373a()
            r0 = 0
            r3.f2084m = r0
        L_0x0023:
            return
    }

    /* renamed from: a */
    private void m2101a(int r6, android.view.View r7) {
            r5 = this;
            android.graphics.Rect r0 = r5.f2073b
            int r1 = r7.getLeft()
            int r2 = r7.getTop()
            int r3 = r7.getRight()
            int r4 = r7.getBottom()
            r0.set(r1, r2, r3, r4)
            int r1 = r0.left
            int r2 = r5.f2074c
            int r1 = r1 - r2
            r0.left = r1
            int r1 = r0.top
            int r2 = r5.f2075d
            int r1 = r1 - r2
            r0.top = r1
            int r1 = r0.right
            int r2 = r5.f2076e
            int r1 = r1 + r2
            r0.right = r1
            int r1 = r0.bottom
            int r2 = r5.f2077f
            int r1 = r1 + r2
            r0.bottom = r1
            java.lang.reflect.Field r0 = r5.f2079h     // Catch: IllegalAccessException -> 0x0052
            boolean r0 = r0.getBoolean(r5)     // Catch: IllegalAccessException -> 0x0052
            boolean r7 = r7.isEnabled()     // Catch: IllegalAccessException -> 0x0052
            if (r7 == r0) goto L_0x0056
            java.lang.reflect.Field r7 = r5.f2079h     // Catch: IllegalAccessException -> 0x0052
            if (r0 != 0) goto L_0x0043
            r0 = 1
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: IllegalAccessException -> 0x0052
            r7.set(r5, r0)     // Catch: IllegalAccessException -> 0x0052
            r7 = -1
            if (r6 == r7) goto L_0x0056
            r5.refreshDrawableState()     // Catch: IllegalAccessException -> 0x0052
            goto L_0x0056
        L_0x0052:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0056:
            return
    }

    /* renamed from: a */
    private void m2100a(int r2, android.view.View r3, float r4, float r5) {
            r1 = this;
            r1.m2094b(r2, r3)
            android.graphics.drawable.Drawable r3 = r1.getSelector()
            if (r3 == 0) goto L_0x000f
            r0 = -1
            if (r2 == r0) goto L_0x000f
            androidx.core.graphics.drawable.C0698a.m1606a(r3, r4, r5)
        L_0x000f:
            return
    }

    /* renamed from: a */
    private void m2099a(android.graphics.Canvas r3) {
            r2 = this;
            android.graphics.Rect r0 = r2.f2073b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0016
            android.graphics.drawable.Drawable r0 = r2.getSelector()
            if (r0 == 0) goto L_0x0016
            android.graphics.Rect r1 = r2.f2073b
            r0.setBounds(r1)
            r0.draw(r3)
        L_0x0016:
            return
    }

    /* renamed from: a */
    private void m2097a(android.view.View r3, int r4) {
            r2 = this;
            long r0 = r2.getItemIdAtPosition(r4)
            r2.performItemClick(r3, r4, r0)
            return
    }

    /* renamed from: a */
    private void m2096a(android.view.View r7, int r8, float r9, float r10) {
            r6 = this;
            r0 = 1
            r6.f2083l = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x000c
            r6.drawableHotspotChanged(r9, r10)
        L_0x000c:
            boolean r1 = r6.isPressed()
            if (r1 != 0) goto L_0x0015
            r6.setPressed(r0)
        L_0x0015:
            r6.layoutChildren()
            int r1 = r6.f2078g
            r3 = -1
            r4 = 0
            if (r1 == r3) goto L_0x0034
            int r3 = r6.getFirstVisiblePosition()
            int r1 = r1 - r3
            android.view.View r1 = r6.getChildAt(r1)
            if (r1 == 0) goto L_0x0034
            if (r1 == r7) goto L_0x0034
            boolean r3 = r1.isPressed()
            if (r3 == 0) goto L_0x0034
            r1.setPressed(r4)
        L_0x0034:
            r6.f2078g = r8
            int r1 = r7.getLeft()
            float r1 = (float) r1
            float r1 = r9 - r1
            int r3 = r7.getTop()
            float r3 = (float) r3
            float r3 = r10 - r3
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r2) goto L_0x004b
            r7.drawableHotspotChanged(r1, r3)
        L_0x004b:
            boolean r1 = r7.isPressed()
            if (r1 != 0) goto L_0x0054
            r7.setPressed(r0)
        L_0x0054:
            r6.m2100a(r8, r7, r9, r10)
            r6.setSelectorEnabled(r4)
            r6.refreshDrawableState()
            return
    }

    /* renamed from: b */
    private void m2094b(int r5, android.view.View r6) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.getSelector()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000d
            r3 = -1
            if (r5 == r3) goto L_0x000d
            r3 = 1
            goto L_0x000e
        L_0x000d:
            r3 = 0
        L_0x000e:
            if (r3 == 0) goto L_0x0013
            r0.setVisible(r2, r2)
        L_0x0013:
            r4.m2101a(r5, r6)
            if (r3 == 0) goto L_0x0030
            android.graphics.Rect r5 = r4.f2073b
            float r6 = r5.exactCenterX()
            float r5 = r5.exactCenterY()
            int r3 = r4.getVisibility()
            if (r3 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            r0.setVisible(r1, r2)
            androidx.core.graphics.drawable.C0698a.m1606a(r0, r6, r5)
        L_0x0030:
            return
    }

    /* renamed from: b */
    private boolean m2095b() {
            r1 = this;
            boolean r0 = r1.f2083l
            return r0
    }

    /* renamed from: c */
    private void m2093c() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.getSelector()
            if (r0 == 0) goto L_0x0019
            boolean r1 = r2.m2095b()
            if (r1 == 0) goto L_0x0019
            boolean r1 = r2.isPressed()
            if (r1 == 0) goto L_0x0019
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L_0x0019:
            return
    }

    private void setSelectorEnabled(boolean r2) {
            r1 = this;
            androidx.appcompat.widget.d0$a r0 = r1.f2080i
            if (r0 == 0) goto L_0x0007
            r0.m2092a(r2)
        L_0x0007:
            return
    }

    /* renamed from: a */
    public int m2102a(int r11, int r12, int r13, int r14, int r15) {
            r10 = this;
            int r12 = r10.getListPaddingTop()
            int r13 = r10.getListPaddingBottom()
            r10.getListPaddingLeft()
            r10.getListPaddingRight()
            int r0 = r10.getDividerHeight()
            android.graphics.drawable.Drawable r1 = r10.getDivider()
            android.widget.ListAdapter r2 = r10.getAdapter()
            int r12 = r12 + r13
            if (r2 != 0) goto L_0x001e
            return r12
        L_0x001e:
            r13 = 0
            if (r0 <= 0) goto L_0x0024
            if (r1 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            int r1 = r2.getCount()
            r3 = 0
            r4 = r12
            r6 = r3
            r12 = 0
            r5 = 0
            r7 = 0
        L_0x002f:
            if (r12 >= r1) goto L_0x007b
            int r8 = r2.getItemViewType(r12)
            if (r8 == r5) goto L_0x0039
            r6 = r3
            r5 = r8
        L_0x0039:
            android.view.View r6 = r2.getView(r12, r6, r10)
            android.view.ViewGroup$LayoutParams r8 = r6.getLayoutParams()
            if (r8 != 0) goto L_0x004a
            android.view.ViewGroup$LayoutParams r8 = r10.generateDefaultLayoutParams()
            r6.setLayoutParams(r8)
        L_0x004a:
            int r8 = r8.height
            if (r8 <= 0) goto L_0x0055
            r9 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            goto L_0x0059
        L_0x0055:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r13)
        L_0x0059:
            r6.measure(r11, r8)
            r6.forceLayout()
            if (r12 <= 0) goto L_0x0062
            int r4 = r4 + r0
        L_0x0062:
            int r8 = r6.getMeasuredHeight()
            int r4 = r4 + r8
            if (r4 < r14) goto L_0x0073
            if (r15 < 0) goto L_0x0072
            if (r12 <= r15) goto L_0x0072
            if (r7 <= 0) goto L_0x0072
            if (r4 == r14) goto L_0x0072
            r14 = r7
        L_0x0072:
            return r14
        L_0x0073:
            if (r15 < 0) goto L_0x0078
            if (r12 < r15) goto L_0x0078
            r7 = r4
        L_0x0078:
            int r12 = r12 + 1
            goto L_0x002f
        L_0x007b:
            return r4
    }

    /* renamed from: a */
    public boolean m2098a(android.view.MotionEvent r8, int r9) {
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r9 = 0
            r3 = 1
            goto L_0x0046
        L_0x0011:
            r9 = 0
            r3 = 0
            goto L_0x0046
        L_0x0014:
            r3 = 1
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = 1
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m2096a(r3, r5, r4, r9)
            if (r0 != r2) goto L_0x000e
            r7.m2097a(r3, r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.m2103a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            androidx.core.widget.f r9 = r7.f2085n
            if (r9 != 0) goto L_0x005a
            androidx.core.widget.f r9 = new androidx.core.widget.f
            r9.<init>(r7)
            r7.f2085n = r9
        L_0x005a:
            androidx.core.widget.f r9 = r7.f2085n
            r9.m1538a(r2)
            androidx.core.widget.f r9 = r7.f2085n
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            androidx.core.widget.f r8 = r7.f2085n
            if (r8 == 0) goto L_0x006c
            r8.m1538a(r1)
        L_0x006c:
            return r3
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas r1) {
            r0 = this;
            r0.m2099a(r1)
            super.dispatchDraw(r1)
            return
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
            r1 = this;
            androidx.appcompat.widget.d0$b r0 = r1.f2086o
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            super.drawableStateChanged()
            r0 = 1
            r1.setSelectorEnabled(r0)
            r1.m2093c()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
            r1 = this;
            boolean r0 = r1.f2082k
            if (r0 != 0) goto L_0x000d
            boolean r0 = super.hasFocus()
            if (r0 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            r0 = 0
            goto L_0x000e
        L_0x000d:
            r0 = 1
        L_0x000e:
            return r0
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
            r1 = this;
            boolean r0 = r1.f2082k
            if (r0 != 0) goto L_0x000d
            boolean r0 = super.hasWindowFocus()
            if (r0 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            r0 = 0
            goto L_0x000e
        L_0x000d:
            r0 = 1
        L_0x000e:
            return r0
    }

    @Override // android.view.View
    public boolean isFocused() {
            r1 = this;
            boolean r0 = r1.f2082k
            if (r0 != 0) goto L_0x000d
            boolean r0 = super.isFocused()
            if (r0 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            r0 = 0
            goto L_0x000e
        L_0x000d:
            r0 = 1
        L_0x000e:
            return r0
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
            r1 = this;
            boolean r0 = r1.f2082k
            if (r0 == 0) goto L_0x0008
            boolean r0 = r1.f2081j
            if (r0 != 0) goto L_0x000e
        L_0x0008:
            boolean r0 = super.isInTouchMode()
            if (r0 == 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            r0 = 0
            r1.f2086o = r0
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L_0x000b
            boolean r5 = super.onHoverEvent(r5)
            return r5
        L_0x000b:
            int r0 = r5.getActionMasked()
            r1 = 10
            if (r0 != r1) goto L_0x0023
            androidx.appcompat.widget.d0$b r1 = r4.f2086o
            if (r1 != 0) goto L_0x0023
            androidx.appcompat.widget.d0$b r1 = new androidx.appcompat.widget.d0$b
            r1.<init>(r4)
            r4.f2086o = r1
            androidx.appcompat.widget.d0$b r1 = r4.f2086o
            r1.m2090b()
        L_0x0023:
            boolean r1 = super.onHoverEvent(r5)
            r2 = 9
            r3 = -1
            if (r0 == r2) goto L_0x0034
            r2 = 7
            if (r0 != r2) goto L_0x0030
            goto L_0x0034
        L_0x0030:
            r4.setSelection(r3)
            goto L_0x0069
        L_0x0034:
            float r0 = r5.getX()
            int r0 = (int) r0
            float r5 = r5.getY()
            int r5 = (int) r5
            int r5 = r4.pointToPosition(r0, r5)
            if (r5 == r3) goto L_0x0069
            int r0 = r4.getSelectedItemPosition()
            if (r5 == r0) goto L_0x0069
            int r0 = r4.getFirstVisiblePosition()
            int r0 = r5 - r0
            android.view.View r0 = r4.getChildAt(r0)
            boolean r2 = r0.isEnabled()
            if (r2 == 0) goto L_0x0066
            int r0 = r0.getTop()
            int r2 = r4.getTop()
            int r0 = r0 - r2
            r4.setSelectionFromTop(r5, r0)
        L_0x0066:
            r4.m2093c()
        L_0x0069:
            return r1
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            int r0 = r3.getAction()
            if (r0 == 0) goto L_0x0007
            goto L_0x0017
        L_0x0007:
            float r0 = r3.getX()
            int r0 = (int) r0
            float r1 = r3.getY()
            int r1 = (int) r1
            int r0 = r2.pointToPosition(r0, r1)
            r2.f2078g = r0
        L_0x0017:
            androidx.appcompat.widget.d0$b r0 = r2.f2086o
            if (r0 == 0) goto L_0x001e
            r0.m2091a()
        L_0x001e:
            boolean r3 = super.onTouchEvent(r3)
            return r3
    }

    void setListSelectionHidden(boolean r1) {
            r0 = this;
            r0.f2081j = r1
            return
    }

    @Override // android.widget.AbsListView
    public void setSelector(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L_0x0008
            androidx.appcompat.widget.d0$a r0 = new androidx.appcompat.widget.d0$a
            r0.<init>(r2)
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            r1.f2080i = r0
            androidx.appcompat.widget.d0$a r0 = r1.f2080i
            super.setSelector(r0)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            if (r2 == 0) goto L_0x001a
            r2.getPadding(r0)
        L_0x001a:
            int r2 = r0.left
            r1.f2074c = r2
            int r2 = r0.top
            r1.f2075d = r2
            int r2 = r0.right
            r1.f2076e = r2
            int r2 = r0.bottom
            r1.f2077f = r2
            return
    }
}
