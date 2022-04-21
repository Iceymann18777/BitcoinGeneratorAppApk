package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.j0 */
/* loaded from: classes.dex */
public class C0612j0 extends androidx.appcompat.widget.C0596h0 implements androidx.appcompat.widget.AbstractC0605i0 {

    /* renamed from: K */
    private static java.lang.reflect.Method f2190K;

    /* renamed from: J */
    private androidx.appcompat.widget.AbstractC0605i0 f2191J;

    /* renamed from: androidx.appcompat.widget.j0$a */
    /* loaded from: classes.dex */
    public static class C0613a extends androidx.appcompat.widget.C0582d0 {

        /* renamed from: p */
        final int f2192p;

        /* renamed from: q */
        final int f2193q;

        /* renamed from: r */
        private androidx.appcompat.widget.AbstractC0605i0 f2194r;

        /* renamed from: s */
        private android.view.MenuItem f2195s;

        public C0613a(android.content.Context r4, boolean r5) {
                r3 = this;
                r3.<init>(r4, r5)
                android.content.res.Resources r4 = r4.getResources()
                android.content.res.Configuration r4 = r4.getConfiguration()
                int r5 = android.os.Build.VERSION.SDK_INT
                r0 = 21
                r1 = 22
                r2 = 17
                if (r5 < r2) goto L_0x0021
                r5 = 1
                int r4 = r4.getLayoutDirection()
                if (r5 != r4) goto L_0x0021
                r3.f2192p = r0
                r3.f2193q = r1
                goto L_0x0025
            L_0x0021:
                r3.f2192p = r1
                r3.f2193q = r0
            L_0x0025:
                return
        }

        @Override // androidx.appcompat.widget.C0582d0, android.view.View
        public boolean onHoverEvent(android.view.MotionEvent r6) {
                r5 = this;
                androidx.appcompat.widget.i0 r0 = r5.f2194r
                if (r0 == 0) goto L_0x0059
                android.widget.ListAdapter r0 = r5.getAdapter()
                boolean r1 = r0 instanceof android.widget.HeaderViewListAdapter
                if (r1 == 0) goto L_0x0017
                android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0
                int r1 = r0.getHeadersCount()
                android.widget.ListAdapter r0 = r0.getWrappedAdapter()
                goto L_0x0018
            L_0x0017:
                r1 = 0
            L_0x0018:
                androidx.appcompat.view.menu.g r0 = (androidx.appcompat.view.menu.C0495g) r0
                r2 = 0
                int r3 = r6.getAction()
                r4 = 10
                if (r3 == r4) goto L_0x0041
                float r3 = r6.getX()
                int r3 = (int) r3
                float r4 = r6.getY()
                int r4 = (int) r4
                int r3 = r5.pointToPosition(r3, r4)
                r4 = -1
                if (r3 == r4) goto L_0x0041
                int r3 = r3 - r1
                if (r3 < 0) goto L_0x0041
                int r1 = r0.getCount()
                if (r3 >= r1) goto L_0x0041
                androidx.appcompat.view.menu.k r2 = r0.getItem(r3)
            L_0x0041:
                android.view.MenuItem r1 = r5.f2195s
                if (r1 == r2) goto L_0x0059
                androidx.appcompat.view.menu.h r0 = r0.m2423b()
                if (r1 == 0) goto L_0x0050
                androidx.appcompat.widget.i0 r3 = r5.f2194r
                r3.mo1975b(r0, r1)
            L_0x0050:
                r5.f2195s = r2
                if (r2 == 0) goto L_0x0059
                androidx.appcompat.widget.i0 r1 = r5.f2194r
                r1.mo1978a(r0, r2)
            L_0x0059:
                boolean r6 = super.onHoverEvent(r6)
                return r6
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
                r4 = this;
                android.view.View r0 = r4.getSelectedView()
                androidx.appcompat.view.menu.ListMenuItemView r0 = (androidx.appcompat.view.menu.ListMenuItemView) r0
                r1 = 1
                if (r0 == 0) goto L_0x0029
                int r2 = r4.f2192p
                if (r5 != r2) goto L_0x0029
                boolean r5 = r0.isEnabled()
                if (r5 == 0) goto L_0x0028
                androidx.appcompat.view.menu.k r5 = r0.getItemData()
                boolean r5 = r5.hasSubMenu()
                if (r5 == 0) goto L_0x0028
                int r5 = r4.getSelectedItemPosition()
                long r2 = r4.getSelectedItemId()
                r4.performItemClick(r0, r5, r2)
            L_0x0028:
                return r1
            L_0x0029:
                if (r0 == 0) goto L_0x0042
                int r0 = r4.f2193q
                if (r5 != r0) goto L_0x0042
                r5 = -1
                r4.setSelection(r5)
                android.widget.ListAdapter r5 = r4.getAdapter()
                androidx.appcompat.view.menu.g r5 = (androidx.appcompat.view.menu.C0495g) r5
                androidx.appcompat.view.menu.h r5 = r5.m2423b()
                r6 = 0
                r5.m2402a(r6)
                return r1
            L_0x0042:
                boolean r5 = super.onKeyDown(r5, r6)
                return r5
        }

        public void setHoverListener(androidx.appcompat.widget.AbstractC0605i0 r1) {
                r0 = this;
                r0.f2194r = r1
                return
        }

        @Override // androidx.appcompat.widget.C0582d0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(android.graphics.drawable.Drawable r1) {
                r0 = this;
                super.setSelector(r1)
                return
        }
    }

    static {
            java.lang.Class<android.widget.PopupWindow> r0 = android.widget.PopupWindow.class
            java.lang.String r1 = "setTouchModal"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: NoSuchMethodException -> 0x0013
            r3 = 0
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: NoSuchMethodException -> 0x0013
            r2[r3] = r4     // Catch: NoSuchMethodException -> 0x0013
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: NoSuchMethodException -> 0x0013
            androidx.appcompat.widget.C0612j0.f2190K = r0     // Catch: NoSuchMethodException -> 0x0013
            goto L_0x001a
        L_0x0013:
            java.lang.String r0 = "MenuPopupWindow"
            java.lang.String r1 = "Could not find method setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r0, r1)
        L_0x001a:
            return
    }

    public C0612j0(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // androidx.appcompat.widget.C0596h0
    /* renamed from: a */
    androidx.appcompat.widget.C0582d0 mo1979a(android.content.Context r2, boolean r3) {
            r1 = this;
            androidx.appcompat.widget.j0$a r0 = new androidx.appcompat.widget.j0$a
            r0.<init>(r2, r3)
            r0.setHoverListener(r1)
            return r0
    }

    @Override // androidx.appcompat.widget.AbstractC0605i0
    /* renamed from: a */
    public void mo1978a(androidx.appcompat.view.menu.C0496h r2, android.view.MenuItem r3) {
            r1 = this;
            androidx.appcompat.widget.i0 r0 = r1.f2191J
            if (r0 == 0) goto L_0x0007
            r0.mo1978a(r2, r3)
        L_0x0007:
            return
    }

    /* renamed from: a */
    public void m1977a(androidx.appcompat.widget.AbstractC0605i0 r1) {
            r0 = this;
            r0.f2191J = r1
            return
    }

    /* renamed from: a */
    public void m1976a(java.lang.Object r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x000d
            android.widget.PopupWindow r0 = r2.f2136F
            android.transition.Transition r3 = (android.transition.Transition) r3
            r0.setEnterTransition(r3)
        L_0x000d:
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0605i0
    /* renamed from: b */
    public void mo1975b(androidx.appcompat.view.menu.C0496h r2, android.view.MenuItem r3) {
            r1 = this;
            androidx.appcompat.widget.i0 r0 = r1.f2191J
            if (r0 == 0) goto L_0x0007
            r0.mo1975b(r2, r3)
        L_0x0007:
            return
    }

    /* renamed from: b */
    public void m1974b(java.lang.Object r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x000d
            android.widget.PopupWindow r0 = r2.f2136F
            android.transition.Transition r3 = (android.transition.Transition) r3
            r0.setExitTransition(r3)
        L_0x000d:
            return
    }

    /* renamed from: c */
    public void m1973c(boolean r5) {
            r4 = this;
            java.lang.reflect.Method r0 = androidx.appcompat.widget.C0612j0.f2190K
            if (r0 == 0) goto L_0x001b
            android.widget.PopupWindow r1 = r4.f2136F     // Catch: Exception -> 0x0014
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: Exception -> 0x0014
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: Exception -> 0x0014
            r2[r3] = r5     // Catch: Exception -> 0x0014
            r0.invoke(r1, r2)     // Catch: Exception -> 0x0014
            goto L_0x001b
        L_0x0014:
            java.lang.String r5 = "MenuPopupWindow"
            java.lang.String r0 = "Could not invoke setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r5, r0)
        L_0x001b:
            return
    }
}
