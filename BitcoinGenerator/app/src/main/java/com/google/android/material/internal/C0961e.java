package com.google.android.material.internal;

/* renamed from: com.google.android.material.internal.e */
/* loaded from: classes.dex */
public class C0961e implements androidx.appcompat.view.menu.AbstractC0513p {

    /* renamed from: b */
    private com.google.android.material.internal.NavigationMenuView f3572b;

    /* renamed from: c */
    android.widget.LinearLayout f3573c;

    /* renamed from: d */
    private androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a f3574d;

    /* renamed from: e */
    androidx.appcompat.view.menu.C0496h f3575e;

    /* renamed from: f */
    private int f3576f;

    /* renamed from: g */
    com.google.android.material.internal.C0961e.C0964c f3577g;

    /* renamed from: h */
    android.view.LayoutInflater f3578h;

    /* renamed from: i */
    int f3579i;

    /* renamed from: j */
    boolean f3580j;

    /* renamed from: k */
    android.content.res.ColorStateList f3581k;

    /* renamed from: l */
    android.content.res.ColorStateList f3582l;

    /* renamed from: m */
    android.graphics.drawable.Drawable f3583m;

    /* renamed from: n */
    int f3584n;

    /* renamed from: o */
    int f3585o;

    /* renamed from: p */
    private int f3586p;

    /* renamed from: q */
    int f3587q;

    /* renamed from: r */
    final android.view.View.OnClickListener f3588r;

    /* renamed from: com.google.android.material.internal.e$a */
    /* loaded from: classes.dex */
    class View$OnClickListenerC0962a implements android.view.View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ com.google.android.material.internal.C0961e f3589b;

        View$OnClickListenerC0962a(com.google.android.material.internal.C0961e r1) {
                r0 = this;
                r0.f3589b = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                com.google.android.material.internal.NavigationMenuItemView r4 = (com.google.android.material.internal.NavigationMenuItemView) r4
                com.google.android.material.internal.e r0 = r3.f3589b
                r1 = 1
                r0.m118b(r1)
                androidx.appcompat.view.menu.k r4 = r4.getItemData()
                com.google.android.material.internal.e r0 = r3.f3589b
                androidx.appcompat.view.menu.h r1 = r0.f3575e
                r2 = 0
                boolean r0 = r1.m2410a(r4, r0, r2)
                if (r4 == 0) goto L_0x0026
                boolean r1 = r4.isCheckable()
                if (r1 == 0) goto L_0x0026
                if (r0 == 0) goto L_0x0026
                com.google.android.material.internal.e r0 = r3.f3589b
                com.google.android.material.internal.e$c r0 = r0.f3577g
                r0.m102a(r4)
            L_0x0026:
                com.google.android.material.internal.e r4 = r3.f3589b
                r4.m118b(r2)
                com.google.android.material.internal.e r4 = r3.f3589b
                r4.mo123a(r2)
                return
        }
    }

    /* renamed from: com.google.android.material.internal.e$b */
    /* loaded from: classes.dex */
    private static class C0963b extends com.google.android.material.internal.C0961e.AbstractC0972k {
        public C0963b(android.view.View r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* renamed from: com.google.android.material.internal.e$c */
    /* loaded from: classes.dex */
    private class C0964c extends androidx.recyclerview.widget.C0813j.AbstractC0824g<com.google.android.material.internal.C0961e.AbstractC0972k> {

        /* renamed from: c */
        private final java.util.ArrayList<com.google.android.material.internal.C0961e.AbstractC0966e> f3590c;

        /* renamed from: d */
        private androidx.appcompat.view.menu.C0501k f3591d;

        /* renamed from: e */
        private boolean f3592e;

        /* renamed from: f */
        final /* synthetic */ com.google.android.material.internal.C0961e f3593f;

        C0964c(com.google.android.material.internal.C0961e r1) {
                r0 = this;
                r0.f3593f = r1
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.f3590c = r1
                r0.m91g()
                return
        }

        /* renamed from: a */
        private void m104a(int r3, int r4) {
                r2 = this;
            L_0x0000:
                if (r3 >= r4) goto L_0x0010
                java.util.ArrayList<com.google.android.material.internal.e$e> r0 = r2.f3590c
                java.lang.Object r0 = r0.get(r3)
                com.google.android.material.internal.e$g r0 = (com.google.android.material.internal.C0961e.C0968g) r0
                r1 = 1
                r0.f3597b = r1
                int r3 = r3 + 1
                goto L_0x0000
            L_0x0010:
                return
        }

        /* renamed from: g */
        private void m91g() {
                r16 = this;
                r0 = r16
                boolean r1 = r0.f3592e
                if (r1 == 0) goto L_0x0007
                return
            L_0x0007:
                r1 = 1
                r0.f3592e = r1
                java.util.ArrayList<com.google.android.material.internal.e$e> r2 = r0.f3590c
                r2.clear()
                java.util.ArrayList<com.google.android.material.internal.e$e> r2 = r0.f3590c
                com.google.android.material.internal.e$d r3 = new com.google.android.material.internal.e$d
                r3.<init>()
                r2.add(r3)
                r2 = -1
                com.google.android.material.internal.e r3 = r0.f3593f
                androidx.appcompat.view.menu.h r3 = r3.f3575e
                java.util.ArrayList r3 = r3.m2375n()
                int r3 = r3.size()
                r4 = 0
                r2 = 0
                r5 = -1
                r6 = 0
                r7 = 0
            L_0x002b:
                if (r2 >= r3) goto L_0x0113
                com.google.android.material.internal.e r8 = r0.f3593f
                androidx.appcompat.view.menu.h r8 = r8.f3575e
                java.util.ArrayList r8 = r8.m2375n()
                java.lang.Object r8 = r8.get(r2)
                androidx.appcompat.view.menu.k r8 = (androidx.appcompat.view.menu.C0501k) r8
                boolean r9 = r8.isChecked()
                if (r9 == 0) goto L_0x0044
                r0.m102a(r8)
            L_0x0044:
                boolean r9 = r8.isCheckable()
                if (r9 == 0) goto L_0x004d
                r8.m2359c(r4)
            L_0x004d:
                boolean r9 = r8.hasSubMenu()
                if (r9 == 0) goto L_0x00c6
                android.view.SubMenu r9 = r8.getSubMenu()
                boolean r10 = r9.hasVisibleItems()
                if (r10 == 0) goto L_0x010e
                if (r2 == 0) goto L_0x006d
                java.util.ArrayList<com.google.android.material.internal.e$e> r10 = r0.f3590c
                com.google.android.material.internal.e$f r11 = new com.google.android.material.internal.e$f
                com.google.android.material.internal.e r12 = r0.f3593f
                int r12 = r12.f3587q
                r11.<init>(r12, r4)
                r10.add(r11)
            L_0x006d:
                java.util.ArrayList<com.google.android.material.internal.e$e> r10 = r0.f3590c
                com.google.android.material.internal.e$g r11 = new com.google.android.material.internal.e$g
                r11.<init>(r8)
                r10.add(r11)
                java.util.ArrayList<com.google.android.material.internal.e$e> r10 = r0.f3590c
                int r10 = r10.size()
                int r11 = r9.size()
                r12 = 0
                r13 = 0
            L_0x0083:
                if (r12 >= r11) goto L_0x00ba
                android.view.MenuItem r14 = r9.getItem(r12)
                androidx.appcompat.view.menu.k r14 = (androidx.appcompat.view.menu.C0501k) r14
                boolean r15 = r14.isVisible()
                if (r15 == 0) goto L_0x00b6
                if (r13 != 0) goto L_0x009a
                android.graphics.drawable.Drawable r15 = r14.getIcon()
                if (r15 == 0) goto L_0x009a
                r13 = 1
            L_0x009a:
                boolean r15 = r14.isCheckable()
                if (r15 == 0) goto L_0x00a3
                r14.m2359c(r4)
            L_0x00a3:
                boolean r15 = r8.isChecked()
                if (r15 == 0) goto L_0x00ac
                r0.m102a(r8)
            L_0x00ac:
                java.util.ArrayList<com.google.android.material.internal.e$e> r15 = r0.f3590c
                com.google.android.material.internal.e$g r1 = new com.google.android.material.internal.e$g
                r1.<init>(r14)
                r15.add(r1)
            L_0x00b6:
                int r12 = r12 + 1
                r1 = 1
                goto L_0x0083
            L_0x00ba:
                if (r13 == 0) goto L_0x010e
                java.util.ArrayList<com.google.android.material.internal.e$e> r1 = r0.f3590c
                int r1 = r1.size()
                r0.m104a(r10, r1)
                goto L_0x010e
            L_0x00c6:
                int r1 = r8.getGroupId()
                if (r1 == r5) goto L_0x00ef
                java.util.ArrayList<com.google.android.material.internal.e$e> r5 = r0.f3590c
                int r7 = r5.size()
                android.graphics.drawable.Drawable r5 = r8.getIcon()
                if (r5 == 0) goto L_0x00da
                r5 = 1
                goto L_0x00db
            L_0x00da:
                r5 = 0
            L_0x00db:
                if (r2 == 0) goto L_0x00ed
                int r7 = r7 + 1
                java.util.ArrayList<com.google.android.material.internal.e$e> r6 = r0.f3590c
                com.google.android.material.internal.e$f r9 = new com.google.android.material.internal.e$f
                com.google.android.material.internal.e r10 = r0.f3593f
                int r10 = r10.f3587q
                r9.<init>(r10, r10)
                r6.add(r9)
            L_0x00ed:
                r6 = r5
                goto L_0x0101
            L_0x00ef:
                if (r6 != 0) goto L_0x0101
                android.graphics.drawable.Drawable r5 = r8.getIcon()
                if (r5 == 0) goto L_0x0101
                java.util.ArrayList<com.google.android.material.internal.e$e> r5 = r0.f3590c
                int r5 = r5.size()
                r0.m104a(r7, r5)
                r6 = 1
            L_0x0101:
                com.google.android.material.internal.e$g r5 = new com.google.android.material.internal.e$g
                r5.<init>(r8)
                r5.f3597b = r6
                java.util.ArrayList<com.google.android.material.internal.e$e> r8 = r0.f3590c
                r8.add(r5)
                r5 = r1
            L_0x010e:
                int r2 = r2 + 1
                r1 = 1
                goto L_0x002b
            L_0x0113:
                r0.f3592e = r4
                return
        }

        @Override // androidx.recyclerview.widget.C0813j.AbstractC0824g
        /* renamed from: a */
        public int mo106a() {
                r1 = this;
                java.util.ArrayList<com.google.android.material.internal.e$e> r0 = r1.f3590c
                int r0 = r0.size()
                return r0
        }

        @Override // androidx.recyclerview.widget.C0813j.AbstractC0824g
        /* renamed from: a */
        public long mo105a(int r3) {
                r2 = this;
                long r0 = (long) r3
                return r0
        }

        /* renamed from: a */
        public void m103a(android.os.Bundle r7) {
                r6 = this;
                r0 = 0
                java.lang.String r1 = "android:menu:checked"
                int r1 = r7.getInt(r1, r0)
                if (r1 == 0) goto L_0x003b
                r2 = 1
                r6.f3592e = r2
                java.util.ArrayList<com.google.android.material.internal.e$e> r2 = r6.f3590c
                int r2 = r2.size()
                r3 = 0
            L_0x0013:
                if (r3 >= r2) goto L_0x0036
                java.util.ArrayList<com.google.android.material.internal.e$e> r4 = r6.f3590c
                java.lang.Object r4 = r4.get(r3)
                com.google.android.material.internal.e$e r4 = (com.google.android.material.internal.C0961e.AbstractC0966e) r4
                boolean r5 = r4 instanceof com.google.android.material.internal.C0961e.C0968g
                if (r5 == 0) goto L_0x0033
                com.google.android.material.internal.e$g r4 = (com.google.android.material.internal.C0961e.C0968g) r4
                androidx.appcompat.view.menu.k r4 = r4.m88a()
                if (r4 == 0) goto L_0x0033
                int r5 = r4.getItemId()
                if (r5 != r1) goto L_0x0033
                r6.m102a(r4)
                goto L_0x0036
            L_0x0033:
                int r3 = r3 + 1
                goto L_0x0013
            L_0x0036:
                r6.f3592e = r0
                r6.m91g()
            L_0x003b:
                java.lang.String r1 = "android:menu:action_views"
                android.util.SparseArray r7 = r7.getSparseParcelableArray(r1)
                if (r7 == 0) goto L_0x007b
                java.util.ArrayList<com.google.android.material.internal.e$e> r1 = r6.f3590c
                int r1 = r1.size()
            L_0x0049:
                if (r0 >= r1) goto L_0x007b
                java.util.ArrayList<com.google.android.material.internal.e$e> r2 = r6.f3590c
                java.lang.Object r2 = r2.get(r0)
                com.google.android.material.internal.e$e r2 = (com.google.android.material.internal.C0961e.AbstractC0966e) r2
                boolean r3 = r2 instanceof com.google.android.material.internal.C0961e.C0968g
                if (r3 != 0) goto L_0x0058
                goto L_0x0078
            L_0x0058:
                com.google.android.material.internal.e$g r2 = (com.google.android.material.internal.C0961e.C0968g) r2
                androidx.appcompat.view.menu.k r2 = r2.m88a()
                if (r2 != 0) goto L_0x0061
                goto L_0x0078
            L_0x0061:
                android.view.View r3 = r2.getActionView()
                if (r3 != 0) goto L_0x0068
                goto L_0x0078
            L_0x0068:
                int r2 = r2.getItemId()
                java.lang.Object r2 = r7.get(r2)
                com.google.android.material.internal.g r2 = (com.google.android.material.internal.C0974g) r2
                if (r2 != 0) goto L_0x0075
                goto L_0x0078
            L_0x0075:
                r3.restoreHierarchyState(r2)
            L_0x0078:
                int r0 = r0 + 1
                goto L_0x0049
            L_0x007b:
                return
        }

        /* renamed from: a */
        public void m102a(androidx.appcompat.view.menu.C0501k r3) {
                r2 = this;
                androidx.appcompat.view.menu.k r0 = r2.f3591d
                if (r0 == r3) goto L_0x0019
                boolean r0 = r3.isCheckable()
                if (r0 != 0) goto L_0x000b
                goto L_0x0019
            L_0x000b:
                androidx.appcompat.view.menu.k r0 = r2.f3591d
                if (r0 == 0) goto L_0x0013
                r1 = 0
                r0.setChecked(r1)
            L_0x0013:
                r2.f3591d = r3
                r0 = 1
                r3.setChecked(r0)
            L_0x0019:
                return
        }

        /* renamed from: a */
        public void m101a(com.google.android.material.internal.C0961e.AbstractC0972k r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.android.material.internal.C0961e.C0969h
                if (r0 == 0) goto L_0x000b
                android.view.View r2 = r2.f3179a
                com.google.android.material.internal.NavigationMenuItemView r2 = (com.google.android.material.internal.NavigationMenuItemView) r2
                r2.m147d()
            L_0x000b:
                return
        }

        /* renamed from: a */
        public void m100a(com.google.android.material.internal.C0961e.AbstractC0972k r4, int r5) {
                r3 = this;
                int r0 = r3.mo98b(r5)
                r1 = 0
                if (r0 == 0) goto L_0x003d
                r2 = 1
                if (r0 == r2) goto L_0x0025
                r2 = 2
                if (r0 == r2) goto L_0x000f
                goto L_0x0091
            L_0x000f:
                java.util.ArrayList<com.google.android.material.internal.e$e> r0 = r3.f3590c
                java.lang.Object r5 = r0.get(r5)
                com.google.android.material.internal.e$f r5 = (com.google.android.material.internal.C0961e.C0967f) r5
                android.view.View r4 = r4.f3179a
                int r0 = r5.m89b()
                int r5 = r5.m90a()
                r4.setPadding(r1, r0, r1, r5)
                goto L_0x0091
            L_0x0025:
                android.view.View r4 = r4.f3179a
                android.widget.TextView r4 = (android.widget.TextView) r4
                java.util.ArrayList<com.google.android.material.internal.e$e> r0 = r3.f3590c
                java.lang.Object r5 = r0.get(r5)
                com.google.android.material.internal.e$g r5 = (com.google.android.material.internal.C0961e.C0968g) r5
                androidx.appcompat.view.menu.k r5 = r5.m88a()
                java.lang.CharSequence r5 = r5.getTitle()
                r4.setText(r5)
                goto L_0x0091
            L_0x003d:
                android.view.View r4 = r4.f3179a
                com.google.android.material.internal.NavigationMenuItemView r4 = (com.google.android.material.internal.NavigationMenuItemView) r4
                com.google.android.material.internal.e r0 = r3.f3593f
                android.content.res.ColorStateList r0 = r0.f3582l
                r4.setIconTintList(r0)
                com.google.android.material.internal.e r0 = r3.f3593f
                boolean r2 = r0.f3580j
                if (r2 == 0) goto L_0x0053
                int r0 = r0.f3579i
                r4.setTextAppearance(r0)
            L_0x0053:
                com.google.android.material.internal.e r0 = r3.f3593f
                android.content.res.ColorStateList r0 = r0.f3581k
                if (r0 == 0) goto L_0x005c
                r4.setTextColor(r0)
            L_0x005c:
                com.google.android.material.internal.e r0 = r3.f3593f
                android.graphics.drawable.Drawable r0 = r0.f3583m
                if (r0 == 0) goto L_0x006b
                android.graphics.drawable.Drawable$ConstantState r0 = r0.getConstantState()
                android.graphics.drawable.Drawable r0 = r0.newDrawable()
                goto L_0x006c
            L_0x006b:
                r0 = 0
            L_0x006c:
                p000a.p018g.p029l.C0216r.m3434a(r4, r0)
                java.util.ArrayList<com.google.android.material.internal.e$e> r0 = r3.f3590c
                java.lang.Object r5 = r0.get(r5)
                com.google.android.material.internal.e$g r5 = (com.google.android.material.internal.C0961e.C0968g) r5
                boolean r0 = r5.f3597b
                r4.setNeedsEmptyIcon(r0)
                com.google.android.material.internal.e r0 = r3.f3593f
                int r0 = r0.f3584n
                r4.setHorizontalPadding(r0)
                com.google.android.material.internal.e r0 = r3.f3593f
                int r0 = r0.f3585o
                r4.setIconPadding(r0)
                androidx.appcompat.view.menu.k r5 = r5.m88a()
                r4.mo148a(r5, r1)
            L_0x0091:
                return
        }

        /* renamed from: a */
        public void m99a(boolean r1) {
                r0 = this;
                r0.f3592e = r1
                return
        }

        @Override // androidx.recyclerview.widget.C0813j.AbstractC0824g
        /* renamed from: b */
        public int mo98b(int r2) {
                r1 = this;
                java.util.ArrayList<com.google.android.material.internal.e$e> r0 = r1.f3590c
                java.lang.Object r2 = r0.get(r2)
                com.google.android.material.internal.e$e r2 = (com.google.android.material.internal.C0961e.AbstractC0966e) r2
                boolean r0 = r2 instanceof com.google.android.material.internal.C0961e.C0967f
                if (r0 == 0) goto L_0x000e
                r2 = 2
                return r2
            L_0x000e:
                boolean r0 = r2 instanceof com.google.android.material.internal.C0961e.C0965d
                if (r0 == 0) goto L_0x0014
                r2 = 3
                return r2
            L_0x0014:
                boolean r0 = r2 instanceof com.google.android.material.internal.C0961e.C0968g
                if (r0 == 0) goto L_0x0028
                com.google.android.material.internal.e$g r2 = (com.google.android.material.internal.C0961e.C0968g) r2
                androidx.appcompat.view.menu.k r2 = r2.m88a()
                boolean r2 = r2.hasSubMenu()
                if (r2 == 0) goto L_0x0026
                r2 = 1
                return r2
            L_0x0026:
                r2 = 0
                return r2
            L_0x0028:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.String r0 = "Unknown item type."
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.recyclerview.widget.C0813j.AbstractC0824g
        /* renamed from: b */
        public /* bridge */ /* synthetic */ com.google.android.material.internal.C0961e.AbstractC0972k mo97b(android.view.ViewGroup r1, int r2) {
                r0 = this;
                com.google.android.material.internal.e$k r1 = r0.mo97b(r1, r2)
                return r1
        }

        @Override // androidx.recyclerview.widget.C0813j.AbstractC0824g
        /* renamed from: b  reason: avoid collision after fix types in other method */
        public com.google.android.material.internal.C0961e.AbstractC0972k mo97b(android.view.ViewGroup r3, int r4) {
                r2 = this;
                if (r4 == 0) goto L_0x002b
                r0 = 1
                if (r4 == r0) goto L_0x0021
                r0 = 2
                if (r4 == r0) goto L_0x0017
                r3 = 3
                if (r4 == r3) goto L_0x000d
                r3 = 0
                return r3
            L_0x000d:
                com.google.android.material.internal.e$b r3 = new com.google.android.material.internal.e$b
                com.google.android.material.internal.e r4 = r2.f3593f
                android.widget.LinearLayout r4 = r4.f3573c
                r3.<init>(r4)
                return r3
            L_0x0017:
                com.google.android.material.internal.e$i r4 = new com.google.android.material.internal.e$i
                com.google.android.material.internal.e r0 = r2.f3593f
                android.view.LayoutInflater r0 = r0.f3578h
                r4.<init>(r0, r3)
                return r4
            L_0x0021:
                com.google.android.material.internal.e$j r4 = new com.google.android.material.internal.e$j
                com.google.android.material.internal.e r0 = r2.f3593f
                android.view.LayoutInflater r0 = r0.f3578h
                r4.<init>(r0, r3)
                return r4
            L_0x002b:
                com.google.android.material.internal.e$h r4 = new com.google.android.material.internal.e$h
                com.google.android.material.internal.e r0 = r2.f3593f
                android.view.LayoutInflater r1 = r0.f3578h
                android.view.View$OnClickListener r0 = r0.f3588r
                r4.<init>(r1, r3, r0)
                return r4
        }

        @Override // androidx.recyclerview.widget.C0813j.AbstractC0824g
        /* renamed from: b */
        public /* bridge */ /* synthetic */ void mo96b(com.google.android.material.internal.C0961e.AbstractC0972k r1, int r2) {
                r0 = this;
                com.google.android.material.internal.e$k r1 = (com.google.android.material.internal.C0961e.AbstractC0972k) r1
                r0.m100a(r1, r2)
                return
        }

        /* renamed from: d */
        public android.os.Bundle m95d() {
                r7 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                androidx.appcompat.view.menu.k r1 = r7.f3591d
                if (r1 == 0) goto L_0x0012
                int r1 = r1.getItemId()
                java.lang.String r2 = "android:menu:checked"
                r0.putInt(r2, r1)
            L_0x0012:
                android.util.SparseArray r1 = new android.util.SparseArray
                r1.<init>()
                r2 = 0
                java.util.ArrayList<com.google.android.material.internal.e$e> r3 = r7.f3590c
                int r3 = r3.size()
            L_0x001e:
                if (r2 >= r3) goto L_0x004e
                java.util.ArrayList<com.google.android.material.internal.e$e> r4 = r7.f3590c
                java.lang.Object r4 = r4.get(r2)
                com.google.android.material.internal.e$e r4 = (com.google.android.material.internal.C0961e.AbstractC0966e) r4
                boolean r5 = r4 instanceof com.google.android.material.internal.C0961e.C0968g
                if (r5 == 0) goto L_0x004b
                com.google.android.material.internal.e$g r4 = (com.google.android.material.internal.C0961e.C0968g) r4
                androidx.appcompat.view.menu.k r4 = r4.m88a()
                if (r4 == 0) goto L_0x0039
                android.view.View r5 = r4.getActionView()
                goto L_0x003a
            L_0x0039:
                r5 = 0
            L_0x003a:
                if (r5 == 0) goto L_0x004b
                com.google.android.material.internal.g r6 = new com.google.android.material.internal.g
                r6.<init>()
                r5.saveHierarchyState(r6)
                int r4 = r4.getItemId()
                r1.put(r4, r6)
            L_0x004b:
                int r2 = r2 + 1
                goto L_0x001e
            L_0x004e:
                java.lang.String r2 = "android:menu:action_views"
                r0.putSparseParcelableArray(r2, r1)
                return r0
        }

        @Override // androidx.recyclerview.widget.C0813j.AbstractC0824g
        /* renamed from: d */
        public /* bridge */ /* synthetic */ void mo94d(com.google.android.material.internal.C0961e.AbstractC0972k r1) {
                r0 = this;
                com.google.android.material.internal.e$k r1 = (com.google.android.material.internal.C0961e.AbstractC0972k) r1
                r0.m101a(r1)
                return
        }

        /* renamed from: e */
        public androidx.appcompat.view.menu.C0501k m93e() {
                r1 = this;
                androidx.appcompat.view.menu.k r0 = r1.f3591d
                return r0
        }

        /* renamed from: f */
        public void m92f() {
                r0 = this;
                r0.m91g()
                r0.m823c()
                return
        }
    }

    /* renamed from: com.google.android.material.internal.e$d */
    /* loaded from: classes.dex */
    private static class C0965d implements com.google.android.material.internal.C0961e.AbstractC0966e {
        C0965d() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: com.google.android.material.internal.e$e */
    /* loaded from: classes.dex */
    private interface AbstractC0966e {
    }

    /* renamed from: com.google.android.material.internal.e$f */
    /* loaded from: classes.dex */
    private static class C0967f implements com.google.android.material.internal.C0961e.AbstractC0966e {

        /* renamed from: a */
        private final int f3594a;

        /* renamed from: b */
        private final int f3595b;

        public C0967f(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f3594a = r1
                r0.f3595b = r2
                return
        }

        /* renamed from: a */
        public int m90a() {
                r1 = this;
                int r0 = r1.f3595b
                return r0
        }

        /* renamed from: b */
        public int m89b() {
                r1 = this;
                int r0 = r1.f3594a
                return r0
        }
    }

    /* renamed from: com.google.android.material.internal.e$g */
    /* loaded from: classes.dex */
    private static class C0968g implements com.google.android.material.internal.C0961e.AbstractC0966e {

        /* renamed from: a */
        private final androidx.appcompat.view.menu.C0501k f3596a;

        /* renamed from: b */
        boolean f3597b;

        C0968g(androidx.appcompat.view.menu.C0501k r1) {
                r0 = this;
                r0.<init>()
                r0.f3596a = r1
                return
        }

        /* renamed from: a */
        public androidx.appcompat.view.menu.C0501k m88a() {
                r1 = this;
                androidx.appcompat.view.menu.k r0 = r1.f3596a
                return r0
        }
    }

    /* renamed from: com.google.android.material.internal.e$h */
    /* loaded from: classes.dex */
    private static class C0969h extends com.google.android.material.internal.C0961e.AbstractC0972k {
        public C0969h(android.view.LayoutInflater r3, android.view.ViewGroup r4, android.view.View.OnClickListener r5) {
                r2 = this;
                int r0 = p050b.p051a.p052a.p053a.C0874g.design_navigation_item
                r1 = 0
                android.view.View r3 = r3.inflate(r0, r4, r1)
                r2.<init>(r3)
                android.view.View r3 = r2.f3179a
                r3.setOnClickListener(r5)
                return
        }
    }

    /* renamed from: com.google.android.material.internal.e$i */
    /* loaded from: classes.dex */
    private static class C0970i extends com.google.android.material.internal.C0961e.AbstractC0972k {
        public C0970i(android.view.LayoutInflater r3, android.view.ViewGroup r4) {
                r2 = this;
                int r0 = p050b.p051a.p052a.p053a.C0874g.design_navigation_item_separator
                r1 = 0
                android.view.View r3 = r3.inflate(r0, r4, r1)
                r2.<init>(r3)
                return
        }
    }

    /* renamed from: com.google.android.material.internal.e$j */
    /* loaded from: classes.dex */
    private static class C0971j extends com.google.android.material.internal.C0961e.AbstractC0972k {
        public C0971j(android.view.LayoutInflater r3, android.view.ViewGroup r4) {
                r2 = this;
                int r0 = p050b.p051a.p052a.p053a.C0874g.design_navigation_item_subheader
                r1 = 0
                android.view.View r3 = r3.inflate(r0, r4, r1)
                r2.<init>(r3)
                return
        }
    }

    /* renamed from: com.google.android.material.internal.e$k */
    /* loaded from: classes.dex */
    private static abstract class AbstractC0972k extends androidx.recyclerview.widget.C0813j.AbstractC0821d0 {
        public AbstractC0972k(android.view.View r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public C0961e() {
            r1 = this;
            r1.<init>()
            com.google.android.material.internal.e$a r0 = new com.google.android.material.internal.e$a
            r0.<init>(r1)
            r1.f3588r = r0
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public int mo136a() {
            r1 = this;
            int r0 = r1.f3576f
            return r0
    }

    /* renamed from: a */
    public android.view.View m135a(int r4) {
            r3 = this;
            android.view.LayoutInflater r0 = r3.f3578h
            android.widget.LinearLayout r1 = r3.f3573c
            r2 = 0
            android.view.View r4 = r0.inflate(r4, r1, r2)
            r3.m129a(r4)
            return r4
    }

    /* renamed from: a */
    public androidx.appcompat.view.menu.AbstractC0515q m128a(android.view.ViewGroup r4) {
            r3 = this;
            com.google.android.material.internal.NavigationMenuView r0 = r3.f3572b
            if (r0 != 0) goto L_0x0031
            android.view.LayoutInflater r0 = r3.f3578h
            int r1 = p050b.p051a.p052a.p053a.C0874g.design_navigation_menu
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            com.google.android.material.internal.NavigationMenuView r4 = (com.google.android.material.internal.NavigationMenuView) r4
            r3.f3572b = r4
            com.google.android.material.internal.e$c r4 = r3.f3577g
            if (r4 != 0) goto L_0x001c
            com.google.android.material.internal.e$c r4 = new com.google.android.material.internal.e$c
            r4.<init>(r3)
            r3.f3577g = r4
        L_0x001c:
            android.view.LayoutInflater r4 = r3.f3578h
            int r0 = p050b.p051a.p052a.p053a.C0874g.design_navigation_item_header
            com.google.android.material.internal.NavigationMenuView r1 = r3.f3572b
            android.view.View r4 = r4.inflate(r0, r1, r2)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r3.f3573c = r4
            com.google.android.material.internal.NavigationMenuView r4 = r3.f3572b
            com.google.android.material.internal.e$c r0 = r3.f3577g
            r4.setAdapter(r0)
        L_0x0031:
            com.google.android.material.internal.NavigationMenuView r4 = r3.f3572b
            return r4
    }

    /* renamed from: a */
    public void m134a(p000a.p018g.p029l.C0230z r5) {
            r4 = this;
            int r0 = r5.m3355e()
            int r1 = r4.f3586p
            if (r1 == r0) goto L_0x001e
            r4.f3586p = r0
            android.widget.LinearLayout r0 = r4.f3573c
            int r0 = r0.getChildCount()
            if (r0 != 0) goto L_0x001e
            com.google.android.material.internal.NavigationMenuView r0 = r4.f3572b
            int r1 = r4.f3586p
            int r2 = r0.getPaddingBottom()
            r3 = 0
            r0.setPadding(r3, r1, r3, r2)
        L_0x001e:
            android.widget.LinearLayout r0 = r4.f3573c
            p000a.p018g.p029l.C0216r.m3438a(r0, r5)
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo133a(android.content.Context r2, androidx.appcompat.view.menu.C0496h r3) {
            r1 = this;
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r2)
            r1.f3578h = r0
            r1.f3575e = r3
            android.content.res.Resources r2 = r2.getResources()
            int r3 = p050b.p051a.p052a.p053a.C0870c.design_navigation_separator_vertical_padding
            int r2 = r2.getDimensionPixelOffset(r3)
            r1.f3587q = r2
            return
    }

    /* renamed from: a */
    public void m132a(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.f3582l = r1
            r1 = 0
            r0.mo123a(r1)
            return
    }

    /* renamed from: a */
    public void m131a(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.f3583m = r1
            r1 = 0
            r0.mo123a(r1)
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo130a(android.os.Parcelable r3) {
            r2 = this;
            boolean r0 = r3 instanceof android.os.Bundle
            if (r0 == 0) goto L_0x002d
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.lang.String r0 = "android:menu:list"
            android.util.SparseArray r0 = r3.getSparseParcelableArray(r0)
            if (r0 == 0) goto L_0x0013
            com.google.android.material.internal.NavigationMenuView r1 = r2.f3572b
            r1.restoreHierarchyState(r0)
        L_0x0013:
            java.lang.String r0 = "android:menu:adapter"
            android.os.Bundle r0 = r3.getBundle(r0)
            if (r0 == 0) goto L_0x0020
            com.google.android.material.internal.e$c r1 = r2.f3577g
            r1.m103a(r0)
        L_0x0020:
            java.lang.String r0 = "android:menu:header"
            android.util.SparseArray r3 = r3.getSparseParcelableArray(r0)
            if (r3 == 0) goto L_0x002d
            android.widget.LinearLayout r0 = r2.f3573c
            r0.restoreHierarchyState(r3)
        L_0x002d:
            return
    }

    /* renamed from: a */
    public void m129a(android.view.View r3) {
            r2 = this;
            android.widget.LinearLayout r0 = r2.f3573c
            r0.addView(r3)
            com.google.android.material.internal.NavigationMenuView r3 = r2.f3572b
            int r0 = r3.getPaddingBottom()
            r1 = 0
            r3.setPadding(r1, r1, r1, r0)
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo126a(androidx.appcompat.view.menu.C0496h r2, boolean r3) {
            r1 = this;
            androidx.appcompat.view.menu.p$a r0 = r1.f3574d
            if (r0 == 0) goto L_0x0007
            r0.mo2108a(r2, r3)
        L_0x0007:
            return
    }

    /* renamed from: a */
    public void m125a(androidx.appcompat.view.menu.C0501k r2) {
            r1 = this;
            com.google.android.material.internal.e$c r0 = r1.f3577g
            r0.m102a(r2)
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo123a(boolean r1) {
            r0 = this;
            com.google.android.material.internal.e$c r1 = r0.f3577g
            if (r1 == 0) goto L_0x0007
            r1.m92f()
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
    public boolean mo124a(androidx.appcompat.view.menu.SubMenuC0523v r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* renamed from: b */
    public void m121b(int r1) {
            r0 = this;
            r0.f3576f = r1
            return
    }

    /* renamed from: b */
    public void m120b(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.f3581k = r1
            r1 = 0
            r0.mo123a(r1)
            return
    }

    /* renamed from: b */
    public void m118b(boolean r2) {
            r1 = this;
            com.google.android.material.internal.e$c r0 = r1.f3577g
            if (r0 == 0) goto L_0x0007
            r0.m99a(r2)
        L_0x0007:
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
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.material.internal.NavigationMenuView r1 = r3.f3572b
            if (r1 == 0) goto L_0x0018
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            com.google.android.material.internal.NavigationMenuView r2 = r3.f3572b
            r2.saveHierarchyState(r1)
            java.lang.String r2 = "android:menu:list"
            r0.putSparseParcelableArray(r2, r1)
        L_0x0018:
            com.google.android.material.internal.e$c r1 = r3.f3577g
            if (r1 == 0) goto L_0x0025
            android.os.Bundle r1 = r1.m95d()
            java.lang.String r2 = "android:menu:adapter"
            r0.putBundle(r2, r1)
        L_0x0025:
            android.widget.LinearLayout r1 = r3.f3573c
            if (r1 == 0) goto L_0x0038
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            android.widget.LinearLayout r2 = r3.f3573c
            r2.saveHierarchyState(r1)
            java.lang.String r2 = "android:menu:header"
            r0.putSparseParcelableArray(r2, r1)
        L_0x0038:
            return r0
    }

    /* renamed from: c */
    public void m116c(int r1) {
            r0 = this;
            r0.f3584n = r1
            r1 = 0
            r0.mo123a(r1)
            return
    }

    /* renamed from: d */
    public androidx.appcompat.view.menu.C0501k m115d() {
            r1 = this;
            com.google.android.material.internal.e$c r0 = r1.f3577g
            androidx.appcompat.view.menu.k r0 = r0.m93e()
            return r0
    }

    /* renamed from: d */
    public void m114d(int r1) {
            r0 = this;
            r0.f3585o = r1
            r1 = 0
            r0.mo123a(r1)
            return
    }

    /* renamed from: e */
    public int m113e() {
            r1 = this;
            android.widget.LinearLayout r0 = r1.f3573c
            int r0 = r0.getChildCount()
            return r0
    }

    /* renamed from: e */
    public void m112e(int r1) {
            r0 = this;
            r0.f3579i = r1
            r1 = 1
            r0.f3580j = r1
            r1 = 0
            r0.mo123a(r1)
            return
    }

    /* renamed from: f */
    public android.graphics.drawable.Drawable m111f() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f3583m
            return r0
    }

    /* renamed from: g */
    public int m110g() {
            r1 = this;
            int r0 = r1.f3584n
            return r0
    }

    /* renamed from: h */
    public int m109h() {
            r1 = this;
            int r0 = r1.f3585o
            return r0
    }

    /* renamed from: i */
    public android.content.res.ColorStateList m108i() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f3581k
            return r0
    }

    /* renamed from: j */
    public android.content.res.ColorStateList m107j() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f3582l
            return r0
    }
}
