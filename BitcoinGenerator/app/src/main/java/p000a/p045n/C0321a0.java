package p000a.p045n;

/* renamed from: a.n.a0 */
/* loaded from: classes.dex */
class C0321a0 implements p000a.p045n.AbstractC0337c0 {

    /* renamed from: a */
    protected p000a.p045n.C0321a0.C0322a f1014a;

    /* renamed from: a.n.a0$a */
    /* loaded from: classes.dex */
    static class C0322a extends android.view.ViewGroup {

        /* renamed from: b */
        android.view.ViewGroup f1015b;

        /* renamed from: c */
        android.view.View f1016c;

        /* renamed from: d */
        java.util.ArrayList<android.graphics.drawable.Drawable> f1017d;

        /* renamed from: e */
        p000a.p045n.C0321a0 f1018e;

        static {
                java.lang.Class<android.view.ViewGroup> r0 = android.view.ViewGroup.class
                java.lang.String r1 = "invalidateChildInParentFast"
                r2 = 3
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: NoSuchMethodException -> 0x0019
                r3 = 0
                java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: NoSuchMethodException -> 0x0019
                r2[r3] = r4     // Catch: NoSuchMethodException -> 0x0019
                r3 = 1
                java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: NoSuchMethodException -> 0x0019
                r2[r3] = r4     // Catch: NoSuchMethodException -> 0x0019
                r3 = 2
                java.lang.Class<android.graphics.Rect> r4 = android.graphics.Rect.class
                r2[r3] = r4     // Catch: NoSuchMethodException -> 0x0019
                r0.getDeclaredMethod(r1, r2)     // Catch: NoSuchMethodException -> 0x0019
            L_0x0019:
                return
        }

        C0322a(android.content.Context r1, android.view.ViewGroup r2, android.view.View r3, p000a.p045n.C0321a0 r4) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.f1017d = r1
                r0.f1015b = r2
                r0.f1016c = r3
                int r1 = r2.getWidth()
                r0.setRight(r1)
                int r1 = r2.getHeight()
                r0.setBottom(r1)
                r2.addView(r0)
                r0.f1018e = r4
                return
        }

        /* renamed from: a */
        private void m2927a(int[] r6) {
                r5 = this;
                r0 = 2
                int[] r1 = new int[r0]
                int[] r0 = new int[r0]
                android.view.ViewGroup r2 = r5.f1015b
                r2.getLocationOnScreen(r1)
                android.view.View r2 = r5.f1016c
                r2.getLocationOnScreen(r0)
                r2 = 0
                r3 = r0[r2]
                r4 = r1[r2]
                int r3 = r3 - r4
                r6[r2] = r3
                r2 = 1
                r0 = r0[r2]
                r1 = r1[r2]
                int r0 = r0 - r1
                r6[r2] = r0
                return
        }

        /* renamed from: a */
        public void m2929a(android.graphics.drawable.Drawable r2) {
                r1 = this;
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f1017d
                if (r0 != 0) goto L_0x000b
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f1017d = r0
            L_0x000b:
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f1017d
                boolean r0 = r0.contains(r2)
                if (r0 != 0) goto L_0x0022
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f1017d
                r0.add(r2)
                android.graphics.Rect r0 = r2.getBounds()
                r1.invalidate(r0)
                r2.setCallback(r1)
            L_0x0022:
                return
        }

        /* renamed from: a */
        public void m2928a(android.view.View r7) {
                r6 = this;
                android.view.ViewParent r0 = r7.getParent()
                boolean r0 = r0 instanceof android.view.ViewGroup
                r1 = 1
                if (r0 == 0) goto L_0x0049
                android.view.ViewParent r0 = r7.getParent()
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                android.view.ViewGroup r2 = r6.f1015b
                if (r0 == r2) goto L_0x003d
                android.view.ViewParent r2 = r0.getParent()
                if (r2 == 0) goto L_0x003d
                boolean r2 = p000a.p018g.p029l.C0216r.m3398w(r0)
                if (r2 == 0) goto L_0x003d
                r2 = 2
                int[] r3 = new int[r2]
                int[] r2 = new int[r2]
                r0.getLocationOnScreen(r3)
                android.view.ViewGroup r4 = r6.f1015b
                r4.getLocationOnScreen(r2)
                r4 = 0
                r5 = r3[r4]
                r4 = r2[r4]
                int r5 = r5 - r4
                p000a.p018g.p029l.C0216r.m3422c(r7, r5)
                r3 = r3[r1]
                r2 = r2[r1]
                int r3 = r3 - r2
                p000a.p018g.p029l.C0216r.m3420d(r7, r3)
            L_0x003d:
                r0.removeView(r7)
                android.view.ViewParent r2 = r7.getParent()
                if (r2 == 0) goto L_0x0049
                r0.removeView(r7)
            L_0x0049:
                int r0 = r6.getChildCount()
                int r0 = r0 - r1
                super.addView(r7, r0)
                return
        }

        /* renamed from: a */
        boolean m2930a() {
                r1 = this;
                int r0 = r1.getChildCount()
                if (r0 != 0) goto L_0x0012
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f1017d
                if (r0 == 0) goto L_0x0010
                int r0 = r0.size()
                if (r0 != 0) goto L_0x0012
            L_0x0010:
                r0 = 1
                goto L_0x0013
            L_0x0012:
                r0 = 0
            L_0x0013:
                return r0
        }

        /* renamed from: b */
        public void m2926b(android.graphics.drawable.Drawable r2) {
                r1 = this;
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f1017d
                if (r0 == 0) goto L_0x0012
                r0.remove(r2)
                android.graphics.Rect r0 = r2.getBounds()
                r1.invalidate(r0)
                r0 = 0
                r2.setCallback(r0)
            L_0x0012:
                return
        }

        /* renamed from: b */
        public void m2925b(android.view.View r1) {
                r0 = this;
                super.removeView(r1)
                boolean r1 = r0.m2930a()
                if (r1 == 0) goto L_0x000e
                android.view.ViewGroup r1 = r0.f1015b
                r1.removeView(r0)
            L_0x000e:
                return
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(android.graphics.Canvas r6) {
                r5 = this;
                r0 = 2
                int[] r1 = new int[r0]
                int[] r0 = new int[r0]
                android.view.ViewGroup r2 = r5.f1015b
                r2.getLocationOnScreen(r1)
                android.view.View r2 = r5.f1016c
                r2.getLocationOnScreen(r0)
                r2 = 0
                r3 = r0[r2]
                r4 = r1[r2]
                int r3 = r3 - r4
                float r3 = (float) r3
                r4 = 1
                r0 = r0[r4]
                r1 = r1[r4]
                int r0 = r0 - r1
                float r0 = (float) r0
                r6.translate(r3, r0)
                android.graphics.Rect r0 = new android.graphics.Rect
                android.view.View r1 = r5.f1016c
                int r1 = r1.getWidth()
                android.view.View r3 = r5.f1016c
                int r3 = r3.getHeight()
                r0.<init>(r2, r2, r1, r3)
                r6.clipRect(r0)
                super.dispatchDraw(r6)
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r5.f1017d
                if (r0 != 0) goto L_0x003d
                r0 = 0
                goto L_0x0041
            L_0x003d:
                int r0 = r0.size()
            L_0x0041:
                if (r2 >= r0) goto L_0x0051
                java.util.ArrayList<android.graphics.drawable.Drawable> r1 = r5.f1017d
                java.lang.Object r1 = r1.get(r2)
                android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
                r1.draw(r6)
                int r2 = r2 + 1
                goto L_0x0041
            L_0x0051:
                return
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(android.view.MotionEvent r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public android.view.ViewParent invalidateChildInParent(int[] r5, android.graphics.Rect r6) {
                r4 = this;
                android.view.ViewGroup r0 = r4.f1015b
                if (r0 == 0) goto L_0x002c
                r0 = 0
                r1 = r5[r0]
                r2 = 1
                r3 = r5[r2]
                r6.offset(r1, r3)
                android.view.ViewGroup r1 = r4.f1015b
                boolean r1 = r1 instanceof android.view.ViewGroup
                if (r1 == 0) goto L_0x0029
                r5[r0] = r0
                r5[r2] = r0
                r1 = 2
                int[] r1 = new int[r1]
                r4.m2927a(r1)
                r0 = r1[r0]
                r1 = r1[r2]
                r6.offset(r0, r1)
                android.view.ViewParent r5 = super.invalidateChildInParent(r5, r6)
                return r5
            L_0x0029:
                r4.invalidate(r6)
            L_0x002c:
                r5 = 0
                return r5
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(android.graphics.drawable.Drawable r1) {
                r0 = this;
                android.graphics.Rect r1 = r1.getBounds()
                r0.invalidate(r1)
                return
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                return
        }

        @Override // android.view.View
        protected boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
                r1 = this;
                boolean r0 = super.verifyDrawable(r2)
                if (r0 != 0) goto L_0x0013
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f1017d
                if (r0 == 0) goto L_0x0011
                boolean r2 = r0.contains(r2)
                if (r2 == 0) goto L_0x0011
                goto L_0x0013
            L_0x0011:
                r2 = 0
                goto L_0x0014
            L_0x0013:
                r2 = 1
            L_0x0014:
                return r2
        }
    }

    C0321a0(android.content.Context r2, android.view.ViewGroup r3, android.view.View r4) {
            r1 = this;
            r1.<init>()
            a.n.a0$a r0 = new a.n.a0$a
            r0.<init>(r2, r3, r4, r1)
            r1.f1014a = r0
            return
    }

    /* renamed from: c */
    static p000a.p045n.C0321a0 m2932c(android.view.View r5) {
            android.view.ViewGroup r0 = m2931d(r5)
            if (r0 == 0) goto L_0x0027
            int r1 = r0.getChildCount()
            r2 = 0
        L_0x000b:
            if (r2 >= r1) goto L_0x001d
            android.view.View r3 = r0.getChildAt(r2)
            boolean r4 = r3 instanceof p000a.p045n.C0321a0.C0322a
            if (r4 == 0) goto L_0x001a
            a.n.a0$a r3 = (p000a.p045n.C0321a0.C0322a) r3
            a.n.a0 r5 = r3.f1018e
            return r5
        L_0x001a:
            int r2 = r2 + 1
            goto L_0x000b
        L_0x001d:
            a.n.u r1 = new a.n.u
            android.content.Context r2 = r0.getContext()
            r1.<init>(r2, r0, r5)
            return r1
        L_0x0027:
            r5 = 0
            return r5
    }

    /* renamed from: d */
    static android.view.ViewGroup m2931d(android.view.View r2) {
        L_0x0000:
            if (r2 == 0) goto L_0x0021
            int r0 = r2.getId()
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            if (r0 != r1) goto L_0x0012
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0012
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            return r2
        L_0x0012:
            android.view.ViewParent r0 = r2.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0000
            android.view.ViewParent r2 = r2.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L_0x0000
        L_0x0021:
            r2 = 0
            return r2
    }

    @Override // p000a.p045n.AbstractC0337c0
    /* renamed from: a */
    public void mo2770a(android.graphics.drawable.Drawable r2) {
            r1 = this;
            a.n.a0$a r0 = r1.f1014a
            r0.m2926b(r2)
            return
    }

    @Override // p000a.p045n.AbstractC0337c0
    /* renamed from: b */
    public void mo2769b(android.graphics.drawable.Drawable r2) {
            r1 = this;
            a.n.a0$a r0 = r1.f1014a
            r0.m2929a(r2)
            return
    }
}
