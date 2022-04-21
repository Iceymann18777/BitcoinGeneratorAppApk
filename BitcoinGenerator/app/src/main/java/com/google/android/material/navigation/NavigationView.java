package com.google.android.material.navigation;

/* loaded from: classes.dex */
public class NavigationView extends com.google.android.material.internal.C0976h {

    /* renamed from: j */
    private static final int[] f3612j = null;

    /* renamed from: k */
    private static final int[] f3613k = null;

    /* renamed from: e */
    private final com.google.android.material.internal.C0960d f3614e;

    /* renamed from: f */
    private final com.google.android.material.internal.C0961e f3615f;

    /* renamed from: g */
    com.google.android.material.navigation.NavigationView.AbstractC0985b f3616g;

    /* renamed from: h */
    private final int f3617h;

    /* renamed from: i */
    private android.view.MenuInflater f3618i;

    /* renamed from: com.google.android.material.navigation.NavigationView$a */
    /* loaded from: classes.dex */
    class C0984a implements androidx.appcompat.view.menu.C0496h.AbstractC0497a {

        /* renamed from: b */
        final /* synthetic */ com.google.android.material.navigation.NavigationView f3619b;

        C0984a(com.google.android.material.navigation.NavigationView r1) {
                r0 = this;
                r0.f3619b = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.C0496h.AbstractC0497a
        /* renamed from: a */
        public void mo65a(androidx.appcompat.view.menu.C0496h r1) {
                r0 = this;
                return
        }

        @Override // androidx.appcompat.view.menu.C0496h.AbstractC0497a
        /* renamed from: a */
        public boolean mo64a(androidx.appcompat.view.menu.C0496h r1, android.view.MenuItem r2) {
                r0 = this;
                com.google.android.material.navigation.NavigationView r1 = r0.f3619b
                com.google.android.material.navigation.NavigationView$b r1 = r1.f3616g
                if (r1 == 0) goto L_0x000e
                boolean r1 = r1.mo14a(r2)
                if (r1 == 0) goto L_0x000e
                r1 = 1
                goto L_0x000f
            L_0x000e:
                r1 = 0
            L_0x000f:
                return r1
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$b */
    /* loaded from: classes.dex */
    public interface AbstractC0985b {
        /* renamed from: a */
        boolean mo14a(android.view.MenuItem r1);
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$c */
    /* loaded from: classes.dex */
    public static class C0986c extends p000a.p033i.p034a.AbstractC0237a {
        public static final android.os.Parcelable.Creator<com.google.android.material.navigation.NavigationView.C0986c> CREATOR = null;

        /* renamed from: d */
        public android.os.Bundle f3620d;

        /* renamed from: com.google.android.material.navigation.NavigationView$c$a */
        /* loaded from: classes.dex */
        static class C0987a implements android.os.Parcelable.ClassLoaderCreator<com.google.android.material.navigation.NavigationView.C0986c> {
            C0987a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.navigation.NavigationView.C0986c createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    com.google.android.material.navigation.NavigationView$c r0 = new com.google.android.material.navigation.NavigationView$c
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public com.google.android.material.navigation.NavigationView.C0986c createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    com.google.android.material.navigation.NavigationView$c r0 = new com.google.android.material.navigation.NavigationView$c
                    r0.<init>(r2, r3)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                    r0 = this;
                    com.google.android.material.navigation.NavigationView$c r1 = r0.createFromParcel(r1)
                    return r1
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ com.google.android.material.navigation.NavigationView.C0986c createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                    r0 = this;
                    com.google.android.material.navigation.NavigationView$c r1 = r0.createFromParcel(r1, r2)
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.navigation.NavigationView.C0986c[] newArray(int r1) {
                    r0 = this;
                    com.google.android.material.navigation.NavigationView$c[] r1 = new com.google.android.material.navigation.NavigationView.C0986c[r1]
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    com.google.android.material.navigation.NavigationView$c[] r1 = r0.newArray(r1)
                    return r1
            }
        }

        static {
                com.google.android.material.navigation.NavigationView$c$a r0 = new com.google.android.material.navigation.NavigationView$c$a
                r0.<init>()
                com.google.android.material.navigation.NavigationView.C0986c.CREATOR = r0
                return
        }

        public C0986c(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                android.os.Bundle r1 = r1.readBundle(r2)
                r0.f3620d = r1
                return
        }

        public C0986c(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // p000a.p033i.p034a.AbstractC0237a, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                android.os.Bundle r2 = r0.f3620d
                r1.writeBundle(r2)
                return
        }
    }

    static {
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            r1[r2] = r3
            com.google.android.material.navigation.NavigationView.f3612j = r1
            int[] r0 = new int[r0]
            r1 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r0[r2] = r1
            com.google.android.material.navigation.NavigationView.f3613k = r0
            return
    }

    public NavigationView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public NavigationView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = p050b.p051a.p052a.p053a.C0869b.navigationViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public NavigationView(android.content.Context r10, android.util.AttributeSet r11, int r12) {
            r9 = this;
            r9.<init>(r10, r11, r12)
            com.google.android.material.internal.e r0 = new com.google.android.material.internal.e
            r0.<init>()
            r9.f3615f = r0
            com.google.android.material.internal.d r0 = new com.google.android.material.internal.d
            r0.<init>(r10)
            r9.f3614e = r0
            int[] r3 = p050b.p051a.p052a.p053a.C0876i.NavigationView
            int r5 = p050b.p051a.p052a.p053a.C0875h.Widget_Design_NavigationView
            r0 = 0
            int[] r6 = new int[r0]
            r1 = r10
            r2 = r11
            r4 = r12
            androidx.appcompat.widget.t0 r11 = com.google.android.material.internal.C0981j.m72d(r1, r2, r3, r4, r5, r6)
            int r12 = p050b.p051a.p052a.p053a.C0876i.NavigationView_android_background
            android.graphics.drawable.Drawable r12 = r11.m1899b(r12)
            p000a.p018g.p029l.C0216r.m3434a(r9, r12)
            int r12 = p050b.p051a.p052a.p053a.C0876i.NavigationView_elevation
            boolean r12 = r11.m1889g(r12)
            if (r12 == 0) goto L_0x003a
            int r12 = p050b.p051a.p052a.p053a.C0876i.NavigationView_elevation
            int r12 = r11.m1896c(r12, r0)
            float r12 = (float) r12
            p000a.p018g.p029l.C0216r.m3444a(r9, r12)
        L_0x003a:
            int r12 = p050b.p051a.p052a.p053a.C0876i.NavigationView_android_fitsSystemWindows
            boolean r12 = r11.m1903a(r12, r0)
            p000a.p018g.p029l.C0216r.m3429a(r9, r12)
            int r12 = p050b.p051a.p052a.p053a.C0876i.NavigationView_android_maxWidth
            int r12 = r11.m1896c(r12, r0)
            r9.f3617h = r12
            int r12 = p050b.p051a.p052a.p053a.C0876i.NavigationView_itemIconTint
            boolean r12 = r11.m1889g(r12)
            if (r12 == 0) goto L_0x005a
            int r12 = p050b.p051a.p052a.p053a.C0876i.NavigationView_itemIconTint
            android.content.res.ColorStateList r12 = r11.m1907a(r12)
            goto L_0x0061
        L_0x005a:
            r12 = 16842808(0x1010038, float:2.3693715E-38)
            android.content.res.ColorStateList r12 = r9.m66c(r12)
        L_0x0061:
            int r1 = p050b.p051a.p052a.p053a.C0876i.NavigationView_itemTextAppearance
            boolean r1 = r11.m1889g(r1)
            r2 = 1
            if (r1 == 0) goto L_0x0073
            int r1 = p050b.p051a.p052a.p053a.C0876i.NavigationView_itemTextAppearance
            int r1 = r11.m1888g(r1, r0)
            r3 = r1
            r1 = 1
            goto L_0x0075
        L_0x0073:
            r1 = 0
            r3 = 0
        L_0x0075:
            r4 = 0
            int r5 = p050b.p051a.p052a.p053a.C0876i.NavigationView_itemTextColor
            boolean r5 = r11.m1889g(r5)
            if (r5 == 0) goto L_0x0084
            int r4 = p050b.p051a.p052a.p053a.C0876i.NavigationView_itemTextColor
            android.content.res.ColorStateList r4 = r11.m1907a(r4)
        L_0x0084:
            if (r1 != 0) goto L_0x008f
            if (r4 != 0) goto L_0x008f
            r4 = 16842806(0x1010036, float:2.369371E-38)
            android.content.res.ColorStateList r4 = r9.m66c(r4)
        L_0x008f:
            int r5 = p050b.p051a.p052a.p053a.C0876i.NavigationView_itemBackground
            android.graphics.drawable.Drawable r5 = r11.m1899b(r5)
            int r6 = p050b.p051a.p052a.p053a.C0876i.NavigationView_itemHorizontalPadding
            boolean r6 = r11.m1889g(r6)
            if (r6 == 0) goto L_0x00a8
            int r6 = p050b.p051a.p052a.p053a.C0876i.NavigationView_itemHorizontalPadding
            int r6 = r11.m1896c(r6, r0)
            com.google.android.material.internal.e r7 = r9.f3615f
            r7.m116c(r6)
        L_0x00a8:
            int r6 = p050b.p051a.p052a.p053a.C0876i.NavigationView_itemIconPadding
            int r6 = r11.m1896c(r6, r0)
            com.google.android.material.internal.d r7 = r9.f3614e
            com.google.android.material.navigation.NavigationView$a r8 = new com.google.android.material.navigation.NavigationView$a
            r8.<init>(r9)
            r7.mo2302a(r8)
            com.google.android.material.internal.e r7 = r9.f3615f
            r7.m121b(r2)
            com.google.android.material.internal.e r2 = r9.f3615f
            com.google.android.material.internal.d r7 = r9.f3614e
            r2.mo133a(r10, r7)
            com.google.android.material.internal.e r10 = r9.f3615f
            r10.m132a(r12)
            if (r1 == 0) goto L_0x00d0
            com.google.android.material.internal.e r10 = r9.f3615f
            r10.m112e(r3)
        L_0x00d0:
            com.google.android.material.internal.e r10 = r9.f3615f
            r10.m120b(r4)
            com.google.android.material.internal.e r10 = r9.f3615f
            r10.m131a(r5)
            com.google.android.material.internal.e r10 = r9.f3615f
            r10.m114d(r6)
            com.google.android.material.internal.d r10 = r9.f3614e
            com.google.android.material.internal.e r12 = r9.f3615f
            r10.m2408a(r12)
            com.google.android.material.internal.e r10 = r9.f3615f
            androidx.appcompat.view.menu.q r10 = r10.m128a(r9)
            android.view.View r10 = (android.view.View) r10
            r9.addView(r10)
            int r10 = p050b.p051a.p052a.p053a.C0876i.NavigationView_menu
            boolean r10 = r11.m1889g(r10)
            if (r10 == 0) goto L_0x0102
            int r10 = p050b.p051a.p052a.p053a.C0876i.NavigationView_menu
            int r10 = r11.m1888g(r10, r0)
            r9.m67b(r10)
        L_0x0102:
            int r10 = p050b.p051a.p052a.p053a.C0876i.NavigationView_headerLayout
            boolean r10 = r11.m1889g(r10)
            if (r10 == 0) goto L_0x0113
            int r10 = p050b.p051a.p052a.p053a.C0876i.NavigationView_headerLayout
            int r10 = r11.m1888g(r10, r0)
            r9.m69a(r10)
        L_0x0113:
            r11.m1908a()
            return
    }

    /* renamed from: c */
    private android.content.res.ColorStateList m66c(int r10) {
            r9 = this;
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r9.getContext()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r2 = 1
            boolean r10 = r1.resolveAttribute(r10, r0, r2)
            r1 = 0
            if (r10 != 0) goto L_0x0016
            return r1
        L_0x0016:
            android.content.Context r10 = r9.getContext()
            int r3 = r0.resourceId
            android.content.res.ColorStateList r10 = p000a.p001a.p002k.p003a.C0010a.m4260b(r10, r3)
            android.content.Context r3 = r9.getContext()
            android.content.res.Resources$Theme r3 = r3.getTheme()
            int r4 = p000a.p001a.C0000a.colorPrimary
            boolean r3 = r3.resolveAttribute(r4, r0, r2)
            if (r3 != 0) goto L_0x0031
            return r1
        L_0x0031:
            int r0 = r0.data
            int r1 = r10.getDefaultColor()
            android.content.res.ColorStateList r3 = new android.content.res.ColorStateList
            r4 = 3
            int[][] r5 = new int[r4]
            int[] r6 = com.google.android.material.navigation.NavigationView.f3613k
            r7 = 0
            r5[r7] = r6
            int[] r6 = com.google.android.material.navigation.NavigationView.f3612j
            r5[r2] = r6
            int[] r6 = android.widget.FrameLayout.EMPTY_STATE_SET
            r8 = 2
            r5[r8] = r6
            int[] r4 = new int[r4]
            int[] r6 = com.google.android.material.navigation.NavigationView.f3613k
            int r10 = r10.getColorForState(r6, r1)
            r4[r7] = r10
            r4[r2] = r0
            r4[r8] = r1
            r3.<init>(r5, r4)
            return r3
    }

    private android.view.MenuInflater getMenuInflater() {
            r2 = this;
            android.view.MenuInflater r0 = r2.f3618i
            if (r0 != 0) goto L_0x000f
            a.a.m.g r0 = new a.a.m.g
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.f3618i = r0
        L_0x000f:
            android.view.MenuInflater r0 = r2.f3618i
            return r0
    }

    /* renamed from: a */
    public android.view.View m69a(int r2) {
            r1 = this;
            com.google.android.material.internal.e r0 = r1.f3615f
            android.view.View r2 = r0.m135a(r2)
            return r2
    }

    @Override // com.google.android.material.internal.C0976h
    /* renamed from: a */
    protected void mo68a(p000a.p018g.p029l.C0230z r2) {
            r1 = this;
            com.google.android.material.internal.e r0 = r1.f3615f
            r0.m134a(r2)
            return
    }

    /* renamed from: b */
    public void m67b(int r3) {
            r2 = this;
            com.google.android.material.internal.e r0 = r2.f3615f
            r1 = 1
            r0.m118b(r1)
            android.view.MenuInflater r0 = r2.getMenuInflater()
            com.google.android.material.internal.d r1 = r2.f3614e
            r0.inflate(r3, r1)
            com.google.android.material.internal.e r3 = r2.f3615f
            r0 = 0
            r3.m118b(r0)
            com.google.android.material.internal.e r3 = r2.f3615f
            r3.mo123a(r0)
            return
    }

    public android.view.MenuItem getCheckedItem() {
            r1 = this;
            com.google.android.material.internal.e r0 = r1.f3615f
            androidx.appcompat.view.menu.k r0 = r0.m115d()
            return r0
    }

    public int getHeaderCount() {
            r1 = this;
            com.google.android.material.internal.e r0 = r1.f3615f
            int r0 = r0.m113e()
            return r0
    }

    public android.graphics.drawable.Drawable getItemBackground() {
            r1 = this;
            com.google.android.material.internal.e r0 = r1.f3615f
            android.graphics.drawable.Drawable r0 = r0.m111f()
            return r0
    }

    public int getItemHorizontalPadding() {
            r1 = this;
            com.google.android.material.internal.e r0 = r1.f3615f
            int r0 = r0.m110g()
            return r0
    }

    public int getItemIconPadding() {
            r1 = this;
            com.google.android.material.internal.e r0 = r1.f3615f
            int r0 = r0.m109h()
            return r0
    }

    public android.content.res.ColorStateList getItemIconTintList() {
            r1 = this;
            com.google.android.material.internal.e r0 = r1.f3615f
            android.content.res.ColorStateList r0 = r0.m107j()
            return r0
    }

    public android.content.res.ColorStateList getItemTextColor() {
            r1 = this;
            com.google.android.material.internal.e r0 = r1.f3615f
            android.content.res.ColorStateList r0 = r0.m108i()
            return r0
    }

    public android.view.Menu getMenu() {
            r1 = this;
            com.google.android.material.internal.d r0 = r1.f3614e
            return r0
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r4, int r5) {
            r3 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x0010
            if (r0 == 0) goto L_0x000d
            goto L_0x001e
        L_0x000d:
            int r4 = r3.f3617h
            goto L_0x001a
        L_0x0010:
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            int r0 = r3.f3617h
            int r4 = java.lang.Math.min(r4, r0)
        L_0x001a:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
        L_0x001e:
            super.onMeasure(r4, r5)
            return
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.navigation.NavigationView.C0986c
            if (r0 != 0) goto L_0x0008
            super.onRestoreInstanceState(r2)
            return
        L_0x0008:
            com.google.android.material.navigation.NavigationView$c r2 = (com.google.android.material.navigation.NavigationView.C0986c) r2
            android.os.Parcelable r0 = r2.m3347a()
            super.onRestoreInstanceState(r0)
            com.google.android.material.internal.d r0 = r1.f3614e
            android.os.Bundle r2 = r2.f3620d
            r0.m2399b(r2)
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.navigation.NavigationView$c r1 = new com.google.android.material.navigation.NavigationView$c
            r1.<init>(r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.f3620d = r0
            com.google.android.material.internal.d r0 = r3.f3614e
            android.os.Bundle r2 = r1.f3620d
            r0.m2391d(r2)
            return r1
    }

    public void setCheckedItem(int r2) {
            r1 = this;
            com.google.android.material.internal.d r0 = r1.f3614e
            android.view.MenuItem r2 = r0.findItem(r2)
            if (r2 == 0) goto L_0x000f
            com.google.android.material.internal.e r0 = r1.f3615f
            androidx.appcompat.view.menu.k r2 = (androidx.appcompat.view.menu.C0501k) r2
            r0.m125a(r2)
        L_0x000f:
            return
    }

    public void setCheckedItem(android.view.MenuItem r2) {
            r1 = this;
            com.google.android.material.internal.d r0 = r1.f3614e
            int r2 = r2.getItemId()
            android.view.MenuItem r2 = r0.findItem(r2)
            if (r2 == 0) goto L_0x0014
            com.google.android.material.internal.e r0 = r1.f3615f
            androidx.appcompat.view.menu.k r2 = (androidx.appcompat.view.menu.C0501k) r2
            r0.m125a(r2)
            return
        L_0x0014:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Called setCheckedItem(MenuItem) with an item that is not in the current menu."
            r2.<init>(r0)
            throw r2
    }

    public void setItemBackground(android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.internal.e r0 = r1.f3615f
            r0.m131a(r2)
            return
    }

    public void setItemBackgroundResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p000a.p018g.p019d.C0124a.m3732b(r0, r2)
            r1.setItemBackground(r2)
            return
    }

    public void setItemHorizontalPadding(int r2) {
            r1 = this;
            com.google.android.material.internal.e r0 = r1.f3615f
            r0.m116c(r2)
            return
    }

    public void setItemHorizontalPaddingResource(int r3) {
            r2 = this;
            com.google.android.material.internal.e r0 = r2.f3615f
            android.content.res.Resources r1 = r2.getResources()
            int r3 = r1.getDimensionPixelSize(r3)
            r0.m116c(r3)
            return
    }

    public void setItemIconPadding(int r2) {
            r1 = this;
            com.google.android.material.internal.e r0 = r1.f3615f
            r0.m114d(r2)
            return
    }

    public void setItemIconPaddingResource(int r3) {
            r2 = this;
            com.google.android.material.internal.e r0 = r2.f3615f
            android.content.res.Resources r1 = r2.getResources()
            int r3 = r1.getDimensionPixelSize(r3)
            r0.m114d(r3)
            return
    }

    public void setItemIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.internal.e r0 = r1.f3615f
            r0.m132a(r2)
            return
    }

    public void setItemTextAppearance(int r2) {
            r1 = this;
            com.google.android.material.internal.e r0 = r1.f3615f
            r0.m112e(r2)
            return
    }

    public void setItemTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.internal.e r0 = r1.f3615f
            r0.m120b(r2)
            return
    }

    public void setNavigationItemSelectedListener(com.google.android.material.navigation.NavigationView.AbstractC0985b r1) {
            r0 = this;
            r0.f3616g = r1
            return
    }
}
