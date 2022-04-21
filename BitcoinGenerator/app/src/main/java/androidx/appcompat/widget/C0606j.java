package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.j */
/* loaded from: classes.dex */
public final class C0606j {

    /* renamed from: g */
    private static final android.graphics.PorterDuff.Mode f2175g = null;

    /* renamed from: h */
    private static androidx.appcompat.widget.C0606j f2176h;

    /* renamed from: i */
    private static final androidx.appcompat.widget.C0606j.C0609c f2177i = null;

    /* renamed from: j */
    private static final int[] f2178j = null;

    /* renamed from: k */
    private static final int[] f2179k = null;

    /* renamed from: l */
    private static final int[] f2180l = null;

    /* renamed from: m */
    private static final int[] f2181m = null;

    /* renamed from: n */
    private static final int[] f2182n = null;

    /* renamed from: o */
    private static final int[] f2183o = null;

    /* renamed from: a */
    private java.util.WeakHashMap<android.content.Context, p000a.p013d.C0081h<android.content.res.ColorStateList>> f2184a;

    /* renamed from: b */
    private p000a.p013d.C0067a<java.lang.String, androidx.appcompat.widget.C0606j.AbstractC0610d> f2185b;

    /* renamed from: c */
    private p000a.p013d.C0081h<java.lang.String> f2186c;

    /* renamed from: d */
    private final java.util.WeakHashMap<android.content.Context, p000a.p013d.C0072d<java.lang.ref.WeakReference<android.graphics.drawable.Drawable.ConstantState>>> f2187d;

    /* renamed from: e */
    private android.util.TypedValue f2188e;

    /* renamed from: f */
    private boolean f2189f;

    /* renamed from: androidx.appcompat.widget.j$a */
    /* loaded from: classes.dex */
    static class C0607a implements androidx.appcompat.widget.C0606j.AbstractC0610d {
        C0607a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.C0606j.AbstractC0610d
        /* renamed from: a */
        public android.graphics.drawable.Drawable mo1980a(android.content.Context r2, org.xmlpull.v1.XmlPullParser r3, android.util.AttributeSet r4, android.content.res.Resources.Theme r5) {
                r1 = this;
                android.content.res.Resources r0 = r2.getResources()     // Catch: Exception -> 0x0009
                a.a.l.a.a r2 = p000a.p001a.p004l.p005a.C0012a.m4253b(r2, r0, r3, r4, r5)     // Catch: Exception -> 0x0009
                return r2
            L_0x0009:
                r2 = move-exception
                java.lang.String r3 = "AsldcInflateDelegate"
                java.lang.String r4 = "Exception while inflating <animated-selector>"
                android.util.Log.e(r3, r4, r2)
                r2 = 0
                return r2
        }
    }

    /* renamed from: androidx.appcompat.widget.j$b */
    /* loaded from: classes.dex */
    private static class C0608b implements androidx.appcompat.widget.C0606j.AbstractC0610d {
        C0608b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.C0606j.AbstractC0610d
        /* renamed from: a */
        public android.graphics.drawable.Drawable mo1980a(android.content.Context r2, org.xmlpull.v1.XmlPullParser r3, android.util.AttributeSet r4, android.content.res.Resources.Theme r5) {
                r1 = this;
                android.content.res.Resources r0 = r2.getResources()     // Catch: Exception -> 0x0009
                a.o.a.a.c r2 = p000a.p046o.p047a.p048a.C0394c.m2759a(r2, r0, r3, r4, r5)     // Catch: Exception -> 0x0009
                return r2
            L_0x0009:
                r2 = move-exception
                java.lang.String r3 = "AvdcInflateDelegate"
                java.lang.String r4 = "Exception while inflating <animated-vector>"
                android.util.Log.e(r3, r4, r2)
                r2 = 0
                return r2
        }
    }

    /* renamed from: androidx.appcompat.widget.j$c */
    /* loaded from: classes.dex */
    private static class C0609c extends p000a.p013d.C0073e<java.lang.Integer, android.graphics.PorterDuffColorFilter> {
        public C0609c(int r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* renamed from: b */
        private static int m1981b(int r1, android.graphics.PorterDuff.Mode r2) {
                r0 = 31
                int r1 = r1 + r0
                int r1 = r1 * 31
                int r2 = r2.hashCode()
                int r1 = r1 + r2
                return r1
        }

        /* renamed from: a */
        android.graphics.PorterDuffColorFilter m1983a(int r1, android.graphics.PorterDuff.Mode r2) {
                r0 = this;
                int r1 = m1981b(r1, r2)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object r1 = r0.m4046b(r1)
                android.graphics.PorterDuffColorFilter r1 = (android.graphics.PorterDuffColorFilter) r1
                return r1
        }

        /* renamed from: a */
        android.graphics.PorterDuffColorFilter m1982a(int r1, android.graphics.PorterDuff.Mode r2, android.graphics.PorterDuffColorFilter r3) {
                r0 = this;
                int r1 = m1981b(r1, r2)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object r1 = r0.m4048a(r1, r3)
                android.graphics.PorterDuffColorFilter r1 = (android.graphics.PorterDuffColorFilter) r1
                return r1
        }
    }

    /* renamed from: androidx.appcompat.widget.j$d */
    /* loaded from: classes.dex */
    private interface AbstractC0610d {
        /* renamed from: a */
        android.graphics.drawable.Drawable mo1980a(android.content.Context r1, org.xmlpull.v1.XmlPullParser r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4);
    }

    /* renamed from: androidx.appcompat.widget.j$e */
    /* loaded from: classes.dex */
    private static class C0611e implements androidx.appcompat.widget.C0606j.AbstractC0610d {
        C0611e() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.C0606j.AbstractC0610d
        /* renamed from: a */
        public android.graphics.drawable.Drawable mo1980a(android.content.Context r1, org.xmlpull.v1.XmlPullParser r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4) {
                r0 = this;
                android.content.res.Resources r1 = r1.getResources()     // Catch: Exception -> 0x0009
                a.o.a.a.i r1 = p000a.p046o.p047a.p048a.C0404i.createFromXmlInner(r1, r2, r3, r4)     // Catch: Exception -> 0x0009
                return r1
            L_0x0009:
                r1 = move-exception
                java.lang.String r2 = "VdcInflateDelegate"
                java.lang.String r3 = "Exception while inflating <vector>"
                android.util.Log.e(r2, r3, r1)
                r1 = 0
                return r1
        }
    }

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            androidx.appcompat.widget.C0606j.f2175g = r0
            androidx.appcompat.widget.j$c r0 = new androidx.appcompat.widget.j$c
            r1 = 6
            r0.<init>(r1)
            androidx.appcompat.widget.C0606j.f2177i = r0
            r0 = 3
            int[] r2 = new int[r0]
            int r3 = p000a.p001a.C0004e.abc_textfield_search_default_mtrl_alpha
            r4 = 0
            r2[r4] = r3
            int r3 = p000a.p001a.C0004e.abc_textfield_default_mtrl_alpha
            r5 = 1
            r2[r5] = r3
            int r3 = p000a.p001a.C0004e.abc_ab_share_pack_mtrl_alpha
            r6 = 2
            r2[r6] = r3
            androidx.appcompat.widget.C0606j.f2178j = r2
            r2 = 7
            int[] r3 = new int[r2]
            int r7 = p000a.p001a.C0004e.abc_ic_commit_search_api_mtrl_alpha
            r3[r4] = r7
            int r7 = p000a.p001a.C0004e.abc_seekbar_tick_mark_material
            r3[r5] = r7
            int r7 = p000a.p001a.C0004e.abc_ic_menu_share_mtrl_alpha
            r3[r6] = r7
            int r7 = p000a.p001a.C0004e.abc_ic_menu_copy_mtrl_am_alpha
            r3[r0] = r7
            int r7 = p000a.p001a.C0004e.abc_ic_menu_cut_mtrl_alpha
            r8 = 4
            r3[r8] = r7
            int r7 = p000a.p001a.C0004e.abc_ic_menu_selectall_mtrl_alpha
            r9 = 5
            r3[r9] = r7
            int r7 = p000a.p001a.C0004e.abc_ic_menu_paste_mtrl_am_alpha
            r3[r1] = r7
            androidx.appcompat.widget.C0606j.f2179k = r3
            r3 = 10
            int[] r3 = new int[r3]
            int r7 = p000a.p001a.C0004e.abc_textfield_activated_mtrl_alpha
            r3[r4] = r7
            int r7 = p000a.p001a.C0004e.abc_textfield_search_activated_mtrl_alpha
            r3[r5] = r7
            int r7 = p000a.p001a.C0004e.abc_cab_background_top_mtrl_alpha
            r3[r6] = r7
            int r7 = p000a.p001a.C0004e.abc_text_cursor_material
            r3[r0] = r7
            int r7 = p000a.p001a.C0004e.abc_text_select_handle_left_mtrl_dark
            r3[r8] = r7
            int r7 = p000a.p001a.C0004e.abc_text_select_handle_middle_mtrl_dark
            r3[r9] = r7
            int r7 = p000a.p001a.C0004e.abc_text_select_handle_right_mtrl_dark
            r3[r1] = r7
            int r1 = p000a.p001a.C0004e.abc_text_select_handle_left_mtrl_light
            r3[r2] = r1
            int r1 = p000a.p001a.C0004e.abc_text_select_handle_middle_mtrl_light
            r2 = 8
            r3[r2] = r1
            int r1 = p000a.p001a.C0004e.abc_text_select_handle_right_mtrl_light
            r2 = 9
            r3[r2] = r1
            androidx.appcompat.widget.C0606j.f2180l = r3
            int[] r0 = new int[r0]
            int r1 = p000a.p001a.C0004e.abc_popup_background_mtrl_mult
            r0[r4] = r1
            int r1 = p000a.p001a.C0004e.abc_cab_background_internal_bg
            r0[r5] = r1
            int r1 = p000a.p001a.C0004e.abc_menu_hardkey_panel_mtrl_mult
            r0[r6] = r1
            androidx.appcompat.widget.C0606j.f2181m = r0
            int[] r0 = new int[r6]
            int r1 = p000a.p001a.C0004e.abc_tab_indicator_material
            r0[r4] = r1
            int r1 = p000a.p001a.C0004e.abc_textfield_search_material
            r0[r5] = r1
            androidx.appcompat.widget.C0606j.f2182n = r0
            int[] r0 = new int[r6]
            int r1 = p000a.p001a.C0004e.abc_btn_check_material
            r0[r4] = r1
            int r1 = p000a.p001a.C0004e.abc_btn_radio_material
            r0[r5] = r1
            androidx.appcompat.widget.C0606j.f2183o = r0
            return
    }

    public C0606j() {
            r2 = this;
            r2.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = 0
            r0.<init>(r1)
            r2.f2187d = r0
            return
    }

    /* renamed from: a */
    private static long m1997a(android.util.TypedValue r4) {
            int r0 = r4.assetCookie
            long r0 = (long) r0
            r2 = 32
            long r0 = r0 << r2
            int r4 = r4.data
            long r2 = (long) r4
            long r0 = r0 | r2
            return r0
    }

    /* renamed from: a */
    static android.graphics.PorterDuff.Mode m2012a(int r1) {
            int r0 = p000a.p001a.C0004e.abc_switch_thumb_material
            if (r1 != r0) goto L_0x0007
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0008
        L_0x0007:
            r1 = 0
        L_0x0008:
            return r1
    }

    /* renamed from: a */
    public static synchronized android.graphics.PorterDuffColorFilter m2011a(int r3, android.graphics.PorterDuff.Mode r4) {
            java.lang.Class<androidx.appcompat.widget.j> r0 = androidx.appcompat.widget.C0606j.class
            monitor-enter(r0)
            androidx.appcompat.widget.j$c r1 = androidx.appcompat.widget.C0606j.f2177i     // Catch: all -> 0x0017
            android.graphics.PorterDuffColorFilter r1 = r1.m1983a(r3, r4)     // Catch: all -> 0x0017
            if (r1 != 0) goto L_0x0015
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter     // Catch: all -> 0x0017
            r1.<init>(r3, r4)     // Catch: all -> 0x0017
            androidx.appcompat.widget.j$c r2 = androidx.appcompat.widget.C0606j.f2177i     // Catch: all -> 0x0017
            r2.m1982a(r3, r4, r1)     // Catch: all -> 0x0017
        L_0x0015:
            monitor-exit(r0)
            return r1
        L_0x0017:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    /* renamed from: a */
    private static android.graphics.PorterDuffColorFilter m2001a(android.content.res.ColorStateList r1, android.graphics.PorterDuff.Mode r2, int[] r3) {
            if (r1 == 0) goto L_0x000f
            if (r2 != 0) goto L_0x0005
            goto L_0x000f
        L_0x0005:
            r0 = 0
            int r1 = r1.getColorForState(r3, r0)
            android.graphics.PorterDuffColorFilter r1 = m2011a(r1, r2)
            return r1
        L_0x000f:
            r1 = 0
            return r1
    }

    /* renamed from: a */
    private android.graphics.drawable.Drawable m2005a(android.content.Context r5, int r6, boolean r7, android.graphics.drawable.Drawable r8) {
            r4 = this;
            android.content.res.ColorStateList r0 = r4.m1992b(r5, r6)
            if (r0 == 0) goto L_0x0021
            boolean r5 = androidx.appcompat.widget.C0580c0.m2106a(r8)
            if (r5 == 0) goto L_0x0010
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L_0x0010:
            android.graphics.drawable.Drawable r8 = androidx.core.graphics.drawable.C0698a.m1591h(r8)
            androidx.core.graphics.drawable.C0698a.m1603a(r8, r0)
            android.graphics.PorterDuff$Mode r5 = m2012a(r6)
            if (r5 == 0) goto L_0x008e
            androidx.core.graphics.drawable.C0698a.m1600a(r8, r5)
            goto L_0x008e
        L_0x0021:
            int r0 = p000a.p001a.C0004e.abc_seekbar_track_material
            r1 = 16908301(0x102000d, float:2.3877265E-38)
            r2 = 16908303(0x102000f, float:2.387727E-38)
            r3 = 16908288(0x1020000, float:2.387723E-38)
            if (r6 != r0) goto L_0x005e
            r6 = r8
            android.graphics.drawable.LayerDrawable r6 = (android.graphics.drawable.LayerDrawable) r6
            android.graphics.drawable.Drawable r7 = r6.findDrawableByLayerId(r3)
            int r0 = p000a.p001a.C0000a.colorControlNormal
            int r0 = androidx.appcompat.widget.C0628o0.m1919b(r5, r0)
            android.graphics.PorterDuff$Mode r3 = androidx.appcompat.widget.C0606j.f2175g
            m1999a(r7, r0, r3)
            android.graphics.drawable.Drawable r7 = r6.findDrawableByLayerId(r2)
            int r0 = p000a.p001a.C0000a.colorControlNormal
        L_0x0045:
            int r0 = androidx.appcompat.widget.C0628o0.m1919b(r5, r0)
            android.graphics.PorterDuff$Mode r2 = androidx.appcompat.widget.C0606j.f2175g
            m1999a(r7, r0, r2)
            android.graphics.drawable.Drawable r6 = r6.findDrawableByLayerId(r1)
            int r7 = p000a.p001a.C0000a.colorControlActivated
            int r5 = androidx.appcompat.widget.C0628o0.m1919b(r5, r7)
            android.graphics.PorterDuff$Mode r7 = androidx.appcompat.widget.C0606j.f2175g
            m1999a(r6, r5, r7)
            goto L_0x008e
        L_0x005e:
            int r0 = p000a.p001a.C0004e.abc_ratingbar_material
            if (r6 == r0) goto L_0x0075
            int r0 = p000a.p001a.C0004e.abc_ratingbar_indicator_material
            if (r6 == r0) goto L_0x0075
            int r0 = p000a.p001a.C0004e.abc_ratingbar_small_material
            if (r6 != r0) goto L_0x006b
            goto L_0x0075
        L_0x006b:
            boolean r5 = m2007a(r5, r6, r8)
            if (r5 != 0) goto L_0x008e
            if (r7 == 0) goto L_0x008e
            r8 = 0
            goto L_0x008e
        L_0x0075:
            r6 = r8
            android.graphics.drawable.LayerDrawable r6 = (android.graphics.drawable.LayerDrawable) r6
            android.graphics.drawable.Drawable r7 = r6.findDrawableByLayerId(r3)
            int r0 = p000a.p001a.C0000a.colorControlNormal
            int r0 = androidx.appcompat.widget.C0628o0.m1921a(r5, r0)
            android.graphics.PorterDuff$Mode r3 = androidx.appcompat.widget.C0606j.f2175g
            m1999a(r7, r0, r3)
            android.graphics.drawable.Drawable r7 = r6.findDrawableByLayerId(r2)
            int r0 = p000a.p001a.C0000a.colorControlActivated
            goto L_0x0045
        L_0x008e:
            return r8
    }

    /* renamed from: a */
    private synchronized android.graphics.drawable.Drawable m2004a(android.content.Context r4, long r5) {
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, a.d.d<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f2187d     // Catch: all -> 0x002d
            java.lang.Object r0 = r0.get(r4)     // Catch: all -> 0x002d
            a.d.d r0 = (p000a.p013d.C0072d) r0     // Catch: all -> 0x002d
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.m4056b(r5)     // Catch: all -> 0x002d
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: all -> 0x002d
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch: all -> 0x002d
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch: all -> 0x002d
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch: all -> 0x002d
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch: all -> 0x002d
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.m4060a(r5)     // Catch: all -> 0x002d
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    /* renamed from: a */
    public static synchronized androidx.appcompat.widget.C0606j m2013a() {
            java.lang.Class<androidx.appcompat.widget.j> r0 = androidx.appcompat.widget.C0606j.class
            monitor-enter(r0)
            androidx.appcompat.widget.j r1 = androidx.appcompat.widget.C0606j.f2176h     // Catch: all -> 0x0017
            if (r1 != 0) goto L_0x0013
            androidx.appcompat.widget.j r1 = new androidx.appcompat.widget.j     // Catch: all -> 0x0017
            r1.<init>()     // Catch: all -> 0x0017
            androidx.appcompat.widget.C0606j.f2176h = r1     // Catch: all -> 0x0017
            androidx.appcompat.widget.j r1 = androidx.appcompat.widget.C0606j.f2176h     // Catch: all -> 0x0017
            m1996a(r1)     // Catch: all -> 0x0017
        L_0x0013:
            androidx.appcompat.widget.j r1 = androidx.appcompat.widget.C0606j.f2176h     // Catch: all -> 0x0017
            monitor-exit(r0)
            return r1
        L_0x0017:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* renamed from: a */
    private void m2008a(android.content.Context r3, int r4, android.content.res.ColorStateList r5) {
            r2 = this;
            java.util.WeakHashMap<android.content.Context, a.d.h<android.content.res.ColorStateList>> r0 = r2.f2184a
            if (r0 != 0) goto L_0x000b
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r2.f2184a = r0
        L_0x000b:
            java.util.WeakHashMap<android.content.Context, a.d.h<android.content.res.ColorStateList>> r0 = r2.f2184a
            java.lang.Object r0 = r0.get(r3)
            a.d.h r0 = (p000a.p013d.C0081h) r0
            if (r0 != 0) goto L_0x001f
            a.d.h r0 = new a.d.h
            r0.<init>()
            java.util.WeakHashMap<android.content.Context, a.d.h<android.content.res.ColorStateList>> r1 = r2.f2184a
            r1.put(r3, r0)
        L_0x001f:
            r0.m4009a(r4, r5)
            return
    }

    /* renamed from: a */
    private static void m1999a(android.graphics.drawable.Drawable r1, int r2, android.graphics.PorterDuff.Mode r3) {
            boolean r0 = androidx.appcompat.widget.C0580c0.m2106a(r1)
            if (r0 == 0) goto L_0x000a
            android.graphics.drawable.Drawable r1 = r1.mutate()
        L_0x000a:
            if (r3 != 0) goto L_0x000e
            android.graphics.PorterDuff$Mode r3 = androidx.appcompat.widget.C0606j.f2175g
        L_0x000e:
            android.graphics.PorterDuffColorFilter r2 = m2011a(r2, r3)
            r1.setColorFilter(r2)
            return
    }

    /* renamed from: a */
    static void m1998a(android.graphics.drawable.Drawable r2, androidx.appcompat.widget.C0634r0 r3, int[] r4) {
            boolean r0 = androidx.appcompat.widget.C0580c0.m2106a(r2)
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r0 = r2.mutate()
            if (r0 == r2) goto L_0x0014
            java.lang.String r2 = "AppCompatDrawableManag"
            java.lang.String r3 = "Mutated drawable is not the same instance as the input."
            android.util.Log.d(r2, r3)
            return
        L_0x0014:
            boolean r0 = r3.f2275d
            if (r0 != 0) goto L_0x0021
            boolean r0 = r3.f2274c
            if (r0 == 0) goto L_0x001d
            goto L_0x0021
        L_0x001d:
            r2.clearColorFilter()
            goto L_0x0039
        L_0x0021:
            boolean r0 = r3.f2275d
            if (r0 == 0) goto L_0x0028
            android.content.res.ColorStateList r0 = r3.f2272a
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            boolean r1 = r3.f2274c
            if (r1 == 0) goto L_0x0030
            android.graphics.PorterDuff$Mode r3 = r3.f2273b
            goto L_0x0032
        L_0x0030:
            android.graphics.PorterDuff$Mode r3 = androidx.appcompat.widget.C0606j.f2175g
        L_0x0032:
            android.graphics.PorterDuffColorFilter r3 = m2001a(r0, r3, r4)
            r2.setColorFilter(r3)
        L_0x0039:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r3 > r4) goto L_0x0042
            r2.invalidateSelf()
        L_0x0042:
            return
    }

    /* renamed from: a */
    private static void m1996a(androidx.appcompat.widget.C0606j r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 >= r1) goto L_0x0024
            androidx.appcompat.widget.j$e r0 = new androidx.appcompat.widget.j$e
            r0.<init>()
            java.lang.String r1 = "vector"
            r2.m1995a(r1, r0)
            androidx.appcompat.widget.j$b r0 = new androidx.appcompat.widget.j$b
            r0.<init>()
            java.lang.String r1 = "animated-vector"
            r2.m1995a(r1, r0)
            androidx.appcompat.widget.j$a r0 = new androidx.appcompat.widget.j$a
            r0.<init>()
            java.lang.String r1 = "animated-selector"
            r2.m1995a(r1, r0)
        L_0x0024:
            return
    }

    /* renamed from: a */
    private void m1995a(java.lang.String r2, androidx.appcompat.widget.C0606j.AbstractC0610d r3) {
            r1 = this;
            a.d.a<java.lang.String, androidx.appcompat.widget.j$d> r0 = r1.f2185b
            if (r0 != 0) goto L_0x000b
            a.d.a r0 = new a.d.a
            r0.<init>()
            r1.f2185b = r0
        L_0x000b:
            a.d.a<java.lang.String, androidx.appcompat.widget.j$d> r0 = r1.f2185b
            r0.put(r2, r3)
            return
    }

    /* renamed from: a */
    static boolean m2007a(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0606j.f2175g
            int[] r1 = androidx.appcompat.widget.C0606j.f2178j
            boolean r1 = m1994a(r1, r7)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0015
            int r2 = p000a.p001a.C0000a.colorControlNormal
        L_0x0012:
            r7 = 1
            r1 = -1
            goto L_0x0044
        L_0x0015:
            int[] r1 = androidx.appcompat.widget.C0606j.f2180l
            boolean r1 = m1994a(r1, r7)
            if (r1 == 0) goto L_0x0020
            int r2 = p000a.p001a.C0000a.colorControlActivated
            goto L_0x0012
        L_0x0020:
            int[] r1 = androidx.appcompat.widget.C0606j.f2181m
            boolean r1 = m1994a(r1, r7)
            if (r1 == 0) goto L_0x002b
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0012
        L_0x002b:
            int r1 = p000a.p001a.C0004e.abc_list_divider_mtrl_alpha
            if (r7 != r1) goto L_0x003c
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r7 = 1109603123(0x42233333, float:40.8)
            int r7 = java.lang.Math.round(r7)
            r1 = r7
            r7 = 1
            goto L_0x0044
        L_0x003c:
            int r1 = p000a.p001a.C0004e.abc_dialog_material_background
            if (r7 != r1) goto L_0x0041
            goto L_0x0012
        L_0x0041:
            r7 = 0
            r1 = -1
            r2 = 0
        L_0x0044:
            if (r7 == 0) goto L_0x0061
            boolean r7 = androidx.appcompat.widget.C0580c0.m2106a(r8)
            if (r7 == 0) goto L_0x0050
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L_0x0050:
            int r6 = androidx.appcompat.widget.C0628o0.m1919b(r6, r2)
            android.graphics.PorterDuffColorFilter r6 = m2011a(r6, r0)
            r8.setColorFilter(r6)
            if (r1 == r3) goto L_0x0060
            r8.setAlpha(r1)
        L_0x0060:
            return r5
        L_0x0061:
            return r4
    }

    /* renamed from: a */
    private synchronized boolean m2003a(android.content.Context r3, long r4, android.graphics.drawable.Drawable r6) {
            r2 = this;
            monitor-enter(r2)
            android.graphics.drawable.Drawable$ConstantState r6 = r6.getConstantState()     // Catch: all -> 0x0028
            if (r6 == 0) goto L_0x0026
            java.util.WeakHashMap<android.content.Context, a.d.d<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r2.f2187d     // Catch: all -> 0x0028
            java.lang.Object r0 = r0.get(r3)     // Catch: all -> 0x0028
            a.d.d r0 = (p000a.p013d.C0072d) r0     // Catch: all -> 0x0028
            if (r0 != 0) goto L_0x001b
            a.d.d r0 = new a.d.d     // Catch: all -> 0x0028
            r0.<init>()     // Catch: all -> 0x0028
            java.util.WeakHashMap<android.content.Context, a.d.d<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r1 = r2.f2187d     // Catch: all -> 0x0028
            r1.put(r3, r0)     // Catch: all -> 0x0028
        L_0x001b:
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch: all -> 0x0028
            r3.<init>(r6)     // Catch: all -> 0x0028
            r0.m4051c(r4, r3)     // Catch: all -> 0x0028
            r3 = 1
        L_0x0024:
            monitor-exit(r2)
            return r3
        L_0x0026:
            r3 = 0
            goto L_0x0024
        L_0x0028:
            r3 = move-exception
            monitor-exit(r2)
            goto L_0x002c
        L_0x002b:
            throw r3
        L_0x002c:
            goto L_0x002b
    }

    /* renamed from: a */
    private static boolean m2000a(android.graphics.drawable.Drawable r1) {
            boolean r0 = r1 instanceof p000a.p046o.p047a.p048a.C0404i
            if (r0 != 0) goto L_0x0017
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r0 = "android.graphics.drawable.VectorDrawable"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r1 = 0
            goto L_0x0018
        L_0x0017:
            r1 = 1
        L_0x0018:
            return r1
    }

    /* renamed from: a */
    private static boolean m1994a(int[] r4, int r5) {
            int r0 = r4.length
            r1 = 0
            r2 = 0
        L_0x0003:
            if (r2 >= r0) goto L_0x000e
            r3 = r4[r2]
            if (r3 != r5) goto L_0x000b
            r4 = 1
            return r4
        L_0x000b:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x000e:
            return r1
    }

    /* renamed from: b */
    private void m1993b(android.content.Context r2) {
            r1 = this;
            boolean r0 = r1.f2189f
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r1.f2189f = r0
            int r0 = p000a.p001a.C0004e.abc_vector_test
            android.graphics.drawable.Drawable r2 = r1.m2009a(r2, r0)
            if (r2 == 0) goto L_0x0017
            boolean r2 = m2000a(r2)
            if (r2 == 0) goto L_0x0017
            return
        L_0x0017:
            r2 = 0
            r1.f2189f = r2
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: c */
    private android.content.res.ColorStateList m1991c(android.content.Context r2) {
            r1 = this;
            r0 = 0
            android.content.res.ColorStateList r2 = r1.m1990c(r2, r0)
            return r2
    }

    /* renamed from: c */
    private android.content.res.ColorStateList m1990c(android.content.Context r6, int r7) {
            r5 = this;
            r0 = 4
            int[][] r1 = new int[r0]
            int[] r0 = new int[r0]
            int r2 = p000a.p001a.C0000a.colorControlHighlight
            int r2 = androidx.appcompat.widget.C0628o0.m1919b(r6, r2)
            int r3 = p000a.p001a.C0000a.colorButtonNormal
            int r6 = androidx.appcompat.widget.C0628o0.m1921a(r6, r3)
            int[] r3 = androidx.appcompat.widget.C0628o0.f2254b
            r4 = 0
            r1[r4] = r3
            r0[r4] = r6
            int[] r6 = androidx.appcompat.widget.C0628o0.f2256d
            r3 = 1
            r1[r3] = r6
            int r6 = p000a.p018g.p021e.C0141a.m3669b(r2, r7)
            r0[r3] = r6
            int[] r6 = androidx.appcompat.widget.C0628o0.f2255c
            r3 = 2
            r1[r3] = r6
            int r6 = p000a.p018g.p021e.C0141a.m3669b(r2, r7)
            r0[r3] = r6
            int[] r6 = androidx.appcompat.widget.C0628o0.f2258f
            r2 = 3
            r1[r2] = r6
            r0[r2] = r7
            android.content.res.ColorStateList r6 = new android.content.res.ColorStateList
            r6.<init>(r1, r0)
            return r6
    }

    /* renamed from: d */
    private android.content.res.ColorStateList m1989d(android.content.Context r2) {
            r1 = this;
            int r0 = p000a.p001a.C0000a.colorAccent
            int r0 = androidx.appcompat.widget.C0628o0.m1919b(r2, r0)
            android.content.res.ColorStateList r2 = r1.m1990c(r2, r0)
            return r2
    }

    /* renamed from: d */
    private android.graphics.drawable.Drawable m1988d(android.content.Context r8, int r9) {
            r7 = this;
            android.util.TypedValue r0 = r7.f2188e
            if (r0 != 0) goto L_0x000b
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r7.f2188e = r0
        L_0x000b:
            android.util.TypedValue r0 = r7.f2188e
            android.content.res.Resources r1 = r8.getResources()
            r2 = 1
            r1.getValue(r9, r0, r2)
            long r3 = m1997a(r0)
            android.graphics.drawable.Drawable r1 = r7.m2004a(r8, r3)
            if (r1 == 0) goto L_0x0020
            return r1
        L_0x0020:
            int r5 = p000a.p001a.C0004e.abc_cab_background_top_material
            if (r9 != r5) goto L_0x003d
            android.graphics.drawable.LayerDrawable r1 = new android.graphics.drawable.LayerDrawable
            r9 = 2
            android.graphics.drawable.Drawable[] r9 = new android.graphics.drawable.Drawable[r9]
            r5 = 0
            int r6 = p000a.p001a.C0004e.abc_cab_background_internal_bg
            android.graphics.drawable.Drawable r6 = r7.m2009a(r8, r6)
            r9[r5] = r6
            int r5 = p000a.p001a.C0004e.abc_cab_background_top_mtrl_alpha
            android.graphics.drawable.Drawable r5 = r7.m2009a(r8, r5)
            r9[r2] = r5
            r1.<init>(r9)
        L_0x003d:
            if (r1 == 0) goto L_0x0047
            int r9 = r0.changingConfigurations
            r1.setChangingConfigurations(r9)
            r7.m2003a(r8, r3, r1)
        L_0x0047:
            return r1
    }

    /* renamed from: e */
    private android.content.res.ColorStateList m1987e(android.content.Context r2) {
            r1 = this;
            int r0 = p000a.p001a.C0000a.colorButtonNormal
            int r0 = androidx.appcompat.widget.C0628o0.m1919b(r2, r0)
            android.content.res.ColorStateList r2 = r1.m1990c(r2, r0)
            return r2
    }

    /* renamed from: e */
    private android.content.res.ColorStateList m1986e(android.content.Context r3, int r4) {
            r2 = this;
            java.util.WeakHashMap<android.content.Context, a.d.h<android.content.res.ColorStateList>> r0 = r2.f2184a
            r1 = 0
            if (r0 == 0) goto L_0x0014
            java.lang.Object r3 = r0.get(r3)
            a.d.h r3 = (p000a.p013d.C0081h) r3
            if (r3 == 0) goto L_0x0014
            java.lang.Object r3 = r3.m4007b(r4)
            r1 = r3
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
        L_0x0014:
            return r1
    }

    /* renamed from: f */
    private android.content.res.ColorStateList m1985f(android.content.Context r8) {
            r7 = this;
            r0 = 3
            int[][] r1 = new int[r0]
            int[] r0 = new int[r0]
            int r2 = p000a.p001a.C0000a.colorSwitchThumbNormal
            android.content.res.ColorStateList r2 = androidx.appcompat.widget.C0628o0.m1918c(r8, r2)
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0039
            boolean r6 = r2.isStateful()
            if (r6 == 0) goto L_0x0039
            int[] r6 = androidx.appcompat.widget.C0628o0.f2254b
            r1[r5] = r6
            r6 = r1[r5]
            int r6 = r2.getColorForState(r6, r5)
            r0[r5] = r6
            int[] r5 = androidx.appcompat.widget.C0628o0.f2257e
            r1[r4] = r5
            int r5 = p000a.p001a.C0000a.colorControlActivated
            int r8 = androidx.appcompat.widget.C0628o0.m1919b(r8, r5)
            r0[r4] = r8
            int[] r8 = androidx.appcompat.widget.C0628o0.f2258f
            r1[r3] = r8
            int r8 = r2.getDefaultColor()
            r0[r3] = r8
            goto L_0x005d
        L_0x0039:
            int[] r2 = androidx.appcompat.widget.C0628o0.f2254b
            r1[r5] = r2
            int r2 = p000a.p001a.C0000a.colorSwitchThumbNormal
            int r2 = androidx.appcompat.widget.C0628o0.m1921a(r8, r2)
            r0[r5] = r2
            int[] r2 = androidx.appcompat.widget.C0628o0.f2257e
            r1[r4] = r2
            int r2 = p000a.p001a.C0000a.colorControlActivated
            int r2 = androidx.appcompat.widget.C0628o0.m1919b(r8, r2)
            r0[r4] = r2
            int[] r2 = androidx.appcompat.widget.C0628o0.f2258f
            r1[r3] = r2
            int r2 = p000a.p001a.C0000a.colorSwitchThumbNormal
            int r8 = androidx.appcompat.widget.C0628o0.m1919b(r8, r2)
            r0[r3] = r8
        L_0x005d:
            android.content.res.ColorStateList r8 = new android.content.res.ColorStateList
            r8.<init>(r1, r0)
            return r8
    }

    /* renamed from: f */
    private android.graphics.drawable.Drawable m1984f(android.content.Context r11, int r12) {
            r10 = this;
            a.d.a<java.lang.String, androidx.appcompat.widget.j$d> r0 = r10.f2185b
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b2
            a.d.h<java.lang.String> r0 = r10.f2186c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.m4007b(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            a.d.a<java.lang.String, androidx.appcompat.widget.j$d> r3 = r10.f2185b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            a.d.h r0 = new a.d.h
            r0.<init>()
            r10.f2186c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f2188e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f2188e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f2188e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = m1997a(r0)
            android.graphics.drawable.Drawable r6 = r10.m2004a(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00aa
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch: Exception -> 0x00a2
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch: Exception -> 0x00a2
        L_0x0067:
            int r8 = r1.next()     // Catch: Exception -> 0x00a2
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch: Exception -> 0x00a2
            a.d.h<java.lang.String> r8 = r10.f2186c     // Catch: Exception -> 0x00a2
            r8.m4009a(r12, r3)     // Catch: Exception -> 0x00a2
            a.d.a<java.lang.String, androidx.appcompat.widget.j$d> r8 = r10.f2185b     // Catch: Exception -> 0x00a2
            java.lang.Object r3 = r8.get(r3)     // Catch: Exception -> 0x00a2
            androidx.appcompat.widget.j$d r3 = (androidx.appcompat.widget.C0606j.AbstractC0610d) r3     // Catch: Exception -> 0x00a2
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch: Exception -> 0x00a2
            android.graphics.drawable.Drawable r1 = r3.mo1980a(r11, r1, r7, r8)     // Catch: Exception -> 0x00a2
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00aa
            int r0 = r0.changingConfigurations     // Catch: Exception -> 0x00a2
            r6.setChangingConfigurations(r0)     // Catch: Exception -> 0x00a2
            r10.m2003a(r11, r4, r6)     // Catch: Exception -> 0x00a2
            goto L_0x00aa
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch: Exception -> 0x00a2
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch: Exception -> 0x00a2
            throw r11     // Catch: Exception -> 0x00a2
        L_0x00a2:
            r11 = move-exception
            java.lang.String r0 = "AppCompatDrawableManag"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00aa:
            if (r6 != 0) goto L_0x00b1
            a.d.h<java.lang.String> r11 = r10.f2186c
            r11.m4009a(r12, r2)
        L_0x00b1:
            return r6
        L_0x00b2:
            return r1
    }

    /* renamed from: a */
    public synchronized android.graphics.drawable.Drawable m2009a(android.content.Context r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            android.graphics.drawable.Drawable r2 = r1.m2006a(r2, r3, r0)     // Catch: all -> 0x0008
            monitor-exit(r1)
            return r2
        L_0x0008:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    /* renamed from: a */
    synchronized android.graphics.drawable.Drawable m2006a(android.content.Context r2, int r3, boolean r4) {
            r1 = this;
            monitor-enter(r1)
            r1.m1993b(r2)     // Catch: all -> 0x0021
            android.graphics.drawable.Drawable r0 = r1.m1984f(r2, r3)     // Catch: all -> 0x0021
            if (r0 != 0) goto L_0x000e
            android.graphics.drawable.Drawable r0 = r1.m1988d(r2, r3)     // Catch: all -> 0x0021
        L_0x000e:
            if (r0 != 0) goto L_0x0014
            android.graphics.drawable.Drawable r0 = p000a.p018g.p019d.C0124a.m3732b(r2, r3)     // Catch: all -> 0x0021
        L_0x0014:
            if (r0 == 0) goto L_0x001a
            android.graphics.drawable.Drawable r0 = r1.m2005a(r2, r3, r4, r0)     // Catch: all -> 0x0021
        L_0x001a:
            if (r0 == 0) goto L_0x001f
            androidx.appcompat.widget.C0580c0.m2105b(r0)     // Catch: all -> 0x0021
        L_0x001f:
            monitor-exit(r1)
            return r0
        L_0x0021:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    /* renamed from: a */
    synchronized android.graphics.drawable.Drawable m2002a(android.content.Context r2, androidx.appcompat.widget.C0659y0 r3, int r4) {
            r1 = this;
            monitor-enter(r1)
            android.graphics.drawable.Drawable r0 = r1.m1984f(r2, r4)     // Catch: all -> 0x0017
            if (r0 != 0) goto L_0x000b
            android.graphics.drawable.Drawable r0 = r3.m1792a(r4)     // Catch: all -> 0x0017
        L_0x000b:
            if (r0 == 0) goto L_0x0014
            r3 = 0
            android.graphics.drawable.Drawable r2 = r1.m2005a(r2, r4, r3, r0)     // Catch: all -> 0x0017
            monitor-exit(r1)
            return r2
        L_0x0014:
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x0017:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    /* renamed from: a */
    public synchronized void m2010a(android.content.Context r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.WeakHashMap<android.content.Context, a.d.d<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r1.f2187d     // Catch: all -> 0x0010
            java.lang.Object r2 = r0.get(r2)     // Catch: all -> 0x0010
            a.d.d r2 = (p000a.p013d.C0072d) r2     // Catch: all -> 0x0010
            if (r2 == 0) goto L_0x000e
            r2.m4062a()     // Catch: all -> 0x0010
        L_0x000e:
            monitor-exit(r1)
            return
        L_0x0010:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    /* renamed from: b */
    synchronized android.content.res.ColorStateList m1992b(android.content.Context r3, int r4) {
            r2 = this;
            monitor-enter(r2)
            android.content.res.ColorStateList r0 = r2.m1986e(r3, r4)     // Catch: all -> 0x007d
            if (r0 != 0) goto L_0x007b
            int r1 = p000a.p001a.C0004e.abc_edit_text_material     // Catch: all -> 0x007d
            if (r4 != r1) goto L_0x0013
            int r0 = p000a.p001a.C0002c.abc_tint_edittext     // Catch: all -> 0x007d
        L_0x000d:
            android.content.res.ColorStateList r0 = p000a.p001a.p002k.p003a.C0010a.m4260b(r3, r0)     // Catch: all -> 0x007d
            goto L_0x0076
        L_0x0013:
            int r1 = p000a.p001a.C0004e.abc_switch_track_mtrl_alpha     // Catch: all -> 0x007d
            if (r4 != r1) goto L_0x001a
            int r0 = p000a.p001a.C0002c.abc_tint_switch_track     // Catch: all -> 0x007d
            goto L_0x000d
        L_0x001a:
            int r1 = p000a.p001a.C0004e.abc_switch_thumb_material     // Catch: all -> 0x007d
            if (r4 != r1) goto L_0x0023
            android.content.res.ColorStateList r0 = r2.m1985f(r3)     // Catch: all -> 0x007d
            goto L_0x0076
        L_0x0023:
            int r1 = p000a.p001a.C0004e.abc_btn_default_mtrl_shape     // Catch: all -> 0x007d
            if (r4 != r1) goto L_0x002c
            android.content.res.ColorStateList r0 = r2.m1987e(r3)     // Catch: all -> 0x007d
            goto L_0x0076
        L_0x002c:
            int r1 = p000a.p001a.C0004e.abc_btn_borderless_material     // Catch: all -> 0x007d
            if (r4 != r1) goto L_0x0035
            android.content.res.ColorStateList r0 = r2.m1991c(r3)     // Catch: all -> 0x007d
            goto L_0x0076
        L_0x0035:
            int r1 = p000a.p001a.C0004e.abc_btn_colored_material     // Catch: all -> 0x007d
            if (r4 != r1) goto L_0x003e
            android.content.res.ColorStateList r0 = r2.m1989d(r3)     // Catch: all -> 0x007d
            goto L_0x0076
        L_0x003e:
            int r1 = p000a.p001a.C0004e.abc_spinner_mtrl_am_alpha     // Catch: all -> 0x007d
            if (r4 == r1) goto L_0x0073
            int r1 = p000a.p001a.C0004e.abc_spinner_textfield_background_material     // Catch: all -> 0x007d
            if (r4 != r1) goto L_0x0047
            goto L_0x0073
        L_0x0047:
            int[] r1 = androidx.appcompat.widget.C0606j.f2179k     // Catch: all -> 0x007d
            boolean r1 = m1994a(r1, r4)     // Catch: all -> 0x007d
            if (r1 == 0) goto L_0x0056
            int r0 = p000a.p001a.C0000a.colorControlNormal     // Catch: all -> 0x007d
            android.content.res.ColorStateList r0 = androidx.appcompat.widget.C0628o0.m1918c(r3, r0)     // Catch: all -> 0x007d
            goto L_0x0076
        L_0x0056:
            int[] r1 = androidx.appcompat.widget.C0606j.f2182n     // Catch: all -> 0x007d
            boolean r1 = m1994a(r1, r4)     // Catch: all -> 0x007d
            if (r1 == 0) goto L_0x0061
            int r0 = p000a.p001a.C0002c.abc_tint_default     // Catch: all -> 0x007d
            goto L_0x000d
        L_0x0061:
            int[] r1 = androidx.appcompat.widget.C0606j.f2183o     // Catch: all -> 0x007d
            boolean r1 = m1994a(r1, r4)     // Catch: all -> 0x007d
            if (r1 == 0) goto L_0x006c
            int r0 = p000a.p001a.C0002c.abc_tint_btn_checkable     // Catch: all -> 0x007d
            goto L_0x000d
        L_0x006c:
            int r1 = p000a.p001a.C0004e.abc_seekbar_thumb_material     // Catch: all -> 0x007d
            if (r4 != r1) goto L_0x0076
            int r0 = p000a.p001a.C0002c.abc_tint_seek_thumb     // Catch: all -> 0x007d
            goto L_0x000d
        L_0x0073:
            int r0 = p000a.p001a.C0002c.abc_tint_spinner     // Catch: all -> 0x007d
            goto L_0x000d
        L_0x0076:
            if (r0 == 0) goto L_0x007b
            r2.m2008a(r3, r4, r0)     // Catch: all -> 0x007d
        L_0x007b:
            monitor-exit(r2)
            return r0
        L_0x007d:
            r3 = move-exception
            monitor-exit(r2)
            goto L_0x0081
        L_0x0080:
            throw r3
        L_0x0081:
            goto L_0x0080
    }
}
