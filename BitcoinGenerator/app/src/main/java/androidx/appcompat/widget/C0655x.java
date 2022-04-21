package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.x */
/* loaded from: classes.dex */
class C0655x {

    /* renamed from: a */
    private final android.widget.TextView f2346a;

    /* renamed from: b */
    private androidx.appcompat.widget.C0634r0 f2347b;

    /* renamed from: c */
    private androidx.appcompat.widget.C0634r0 f2348c;

    /* renamed from: d */
    private androidx.appcompat.widget.C0634r0 f2349d;

    /* renamed from: e */
    private androidx.appcompat.widget.C0634r0 f2350e;

    /* renamed from: f */
    private androidx.appcompat.widget.C0634r0 f2351f;

    /* renamed from: g */
    private androidx.appcompat.widget.C0634r0 f2352g;

    /* renamed from: h */
    private final androidx.appcompat.widget.C0660z f2353h;

    /* renamed from: i */
    private int f2354i;

    /* renamed from: j */
    private android.graphics.Typeface f2355j;

    /* renamed from: k */
    private boolean f2356k;

    /* renamed from: androidx.appcompat.widget.x$a */
    /* loaded from: classes.dex */
    class C0656a extends p000a.p018g.p019d.p020c.C0136f.AbstractC0137a {

        /* renamed from: a */
        final /* synthetic */ java.lang.ref.WeakReference f2357a;

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.widget.C0655x f2358b;

        C0656a(androidx.appcompat.widget.C0655x r1, java.lang.ref.WeakReference r2) {
                r0 = this;
                r0.f2358b = r1
                r0.f2357a = r2
                r0.<init>()
                return
        }

        @Override // p000a.p018g.p019d.p020c.C0136f.AbstractC0137a
        /* renamed from: a */
        public void mo1801a(int r1) {
                r0 = this;
                return
        }

        @Override // p000a.p018g.p019d.p020c.C0136f.AbstractC0137a
        /* renamed from: a */
        public void mo1800a(android.graphics.Typeface r3) {
                r2 = this;
                androidx.appcompat.widget.x r0 = r2.f2358b
                java.lang.ref.WeakReference r1 = r2.f2357a
                r0.m1813a(r1, r3)
                return
        }
    }

    C0655x(android.widget.TextView r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f2354i = r0
            r1.f2346a = r2
            androidx.appcompat.widget.z r2 = new androidx.appcompat.widget.z
            android.widget.TextView r0 = r1.f2346a
            r2.<init>(r0)
            r1.f2353h = r2
            return
    }

    /* renamed from: a */
    private static androidx.appcompat.widget.C0634r0 m1817a(android.content.Context r0, androidx.appcompat.widget.C0606j r1, int r2) {
            android.content.res.ColorStateList r0 = r1.m1992b(r0, r2)
            if (r0 == 0) goto L_0x0011
            androidx.appcompat.widget.r0 r1 = new androidx.appcompat.widget.r0
            r1.<init>()
            r2 = 1
            r1.f2275d = r2
            r1.f2272a = r0
            return r1
        L_0x0011:
            r0 = 0
            return r0
    }

    /* renamed from: a */
    private void m1816a(android.content.Context r5, androidx.appcompat.widget.C0638t0 r6) {
            r4 = this;
            int r0 = p000a.p001a.C0009j.TextAppearance_android_textStyle
            int r1 = r4.f2354i
            int r0 = r6.m1894d(r0, r1)
            r4.f2354i = r0
            int r0 = p000a.p001a.C0009j.TextAppearance_android_fontFamily
            boolean r0 = r6.m1889g(r0)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0041
            int r0 = p000a.p001a.C0009j.TextAppearance_fontFamily
            boolean r0 = r6.m1889g(r0)
            if (r0 == 0) goto L_0x001d
            goto L_0x0041
        L_0x001d:
            int r5 = p000a.p001a.C0009j.TextAppearance_android_typeface
            boolean r5 = r6.m1889g(r5)
            if (r5 == 0) goto L_0x0040
            r4.f2356k = r1
            int r5 = p000a.p001a.C0009j.TextAppearance_android_typeface
            int r5 = r6.m1894d(r5, r2)
            if (r5 == r2) goto L_0x003c
            r6 = 2
            if (r5 == r6) goto L_0x0039
            r6 = 3
            if (r5 == r6) goto L_0x0036
            goto L_0x0040
        L_0x0036:
            android.graphics.Typeface r5 = android.graphics.Typeface.MONOSPACE
            goto L_0x003e
        L_0x0039:
            android.graphics.Typeface r5 = android.graphics.Typeface.SERIF
            goto L_0x003e
        L_0x003c:
            android.graphics.Typeface r5 = android.graphics.Typeface.SANS_SERIF
        L_0x003e:
            r4.f2355j = r5
        L_0x0040:
            return
        L_0x0041:
            r0 = 0
            r4.f2355j = r0
            int r0 = p000a.p001a.C0009j.TextAppearance_fontFamily
            boolean r0 = r6.m1889g(r0)
            if (r0 == 0) goto L_0x004f
            int r0 = p000a.p001a.C0009j.TextAppearance_fontFamily
            goto L_0x0051
        L_0x004f:
            int r0 = p000a.p001a.C0009j.TextAppearance_android_fontFamily
        L_0x0051:
            boolean r5 = r5.isRestricted()
            if (r5 != 0) goto L_0x0074
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            android.widget.TextView r3 = r4.f2346a
            r5.<init>(r3)
            androidx.appcompat.widget.x$a r3 = new androidx.appcompat.widget.x$a
            r3.<init>(r4, r5)
            int r5 = r4.f2354i     // Catch: UnsupportedOperationException | NotFoundException -> 0x0073
            android.graphics.Typeface r5 = r6.m1904a(r0, r5, r3)     // Catch: UnsupportedOperationException | NotFoundException -> 0x0073
            r4.f2355j = r5     // Catch: UnsupportedOperationException | NotFoundException -> 0x0073
            android.graphics.Typeface r5 = r4.f2355j     // Catch: UnsupportedOperationException | NotFoundException -> 0x0073
            if (r5 != 0) goto L_0x0070
            r1 = 1
        L_0x0070:
            r4.f2356k = r1     // Catch: UnsupportedOperationException | NotFoundException -> 0x0073
            goto L_0x0074
        L_0x0073:
        L_0x0074:
            android.graphics.Typeface r5 = r4.f2355j
            if (r5 != 0) goto L_0x0086
            java.lang.String r5 = r6.m1895d(r0)
            if (r5 == 0) goto L_0x0086
            int r6 = r4.f2354i
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r6)
            r4.f2355j = r5
        L_0x0086:
            return
    }

    /* renamed from: a */
    private void m1815a(android.graphics.drawable.Drawable r2, androidx.appcompat.widget.C0634r0 r3) {
            r1 = this;
            if (r2 == 0) goto L_0x000d
            if (r3 == 0) goto L_0x000d
            android.widget.TextView r0 = r1.f2346a
            int[] r0 = r0.getDrawableState()
            androidx.appcompat.widget.C0606j.m1998a(r2, r3, r0)
        L_0x000d:
            return
    }

    /* renamed from: b */
    private void m1808b(int r2, float r3) {
            r1 = this;
            androidx.appcompat.widget.z r0 = r1.f2353h
            r0.m1786a(r2, r3)
            return
    }

    /* renamed from: a */
    void m1822a() {
            r5 = this;
            androidx.appcompat.widget.r0 r0 = r5.f2347b
            r1 = 2
            r2 = 0
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.r0 r0 = r5.f2348c
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.r0 r0 = r5.f2349d
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.r0 r0 = r5.f2350e
            if (r0 == 0) goto L_0x0036
        L_0x0012:
            android.widget.TextView r0 = r5.f2346a
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawables()
            r3 = r0[r2]
            androidx.appcompat.widget.r0 r4 = r5.f2347b
            r5.m1815a(r3, r4)
            r3 = 1
            r3 = r0[r3]
            androidx.appcompat.widget.r0 r4 = r5.f2348c
            r5.m1815a(r3, r4)
            r3 = r0[r1]
            androidx.appcompat.widget.r0 r4 = r5.f2349d
            r5.m1815a(r3, r4)
            r3 = 3
            r0 = r0[r3]
            androidx.appcompat.widget.r0 r3 = r5.f2350e
            r5.m1815a(r0, r3)
        L_0x0036:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r0 < r3) goto L_0x0058
            androidx.appcompat.widget.r0 r0 = r5.f2351f
            if (r0 != 0) goto L_0x0044
            androidx.appcompat.widget.r0 r0 = r5.f2352g
            if (r0 == 0) goto L_0x0058
        L_0x0044:
            android.widget.TextView r0 = r5.f2346a
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            r2 = r0[r2]
            androidx.appcompat.widget.r0 r3 = r5.f2351f
            r5.m1815a(r2, r3)
            r0 = r0[r1]
            androidx.appcompat.widget.r0 r1 = r5.f2352g
            r5.m1815a(r0, r1)
        L_0x0058:
            return
    }

    /* renamed from: a */
    void m1821a(int r2) {
            r1 = this;
            androidx.appcompat.widget.z r0 = r1.f2353h
            r0.m1787a(r2)
            return
    }

    /* renamed from: a */
    void m1820a(int r2, float r3) {
            r1 = this;
            boolean r0 = androidx.core.widget.AbstractC0713b.f2708a
            if (r0 != 0) goto L_0x000d
            boolean r0 = r1.m1802h()
            if (r0 != 0) goto L_0x000d
            r1.m1808b(r2, r3)
        L_0x000d:
            return
    }

    /* renamed from: a */
    void m1819a(int r2, int r3, int r4, int r5) {
            r1 = this;
            androidx.appcompat.widget.z r0 = r1.f2353h
            r0.m1785a(r2, r3, r4, r5)
            return
    }

    /* renamed from: a */
    void m1818a(android.content.Context r4, int r5) {
            r3 = this;
            int[] r0 = p000a.p001a.C0009j.TextAppearance
            androidx.appcompat.widget.t0 r5 = androidx.appcompat.widget.C0638t0.m1902a(r4, r5, r0)
            int r0 = p000a.p001a.C0009j.TextAppearance_textAllCaps
            boolean r0 = r5.m1889g(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0018
            int r0 = p000a.p001a.C0009j.TextAppearance_textAllCaps
            boolean r0 = r5.m1903a(r0, r1)
            r3.m1812a(r0)
        L_0x0018:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 >= r2) goto L_0x0033
            int r0 = p000a.p001a.C0009j.TextAppearance_android_textColor
            boolean r0 = r5.m1889g(r0)
            if (r0 == 0) goto L_0x0033
            int r0 = p000a.p001a.C0009j.TextAppearance_android_textColor
            android.content.res.ColorStateList r0 = r5.m1907a(r0)
            if (r0 == 0) goto L_0x0033
            android.widget.TextView r2 = r3.f2346a
            r2.setTextColor(r0)
        L_0x0033:
            int r0 = p000a.p001a.C0009j.TextAppearance_android_textSize
            boolean r0 = r5.m1889g(r0)
            if (r0 == 0) goto L_0x004a
            int r0 = p000a.p001a.C0009j.TextAppearance_android_textSize
            r2 = -1
            int r0 = r5.m1896c(r0, r2)
            if (r0 != 0) goto L_0x004a
            android.widget.TextView r0 = r3.f2346a
            r2 = 0
            r0.setTextSize(r1, r2)
        L_0x004a:
            r3.m1816a(r4, r5)
            r5.m1908a()
            android.graphics.Typeface r4 = r3.f2355j
            if (r4 == 0) goto L_0x005b
            android.widget.TextView r5 = r3.f2346a
            int r0 = r3.f2354i
            r5.setTypeface(r4, r0)
        L_0x005b:
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: a */
    void m1814a(android.util.AttributeSet r18, int r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            android.widget.TextView r3 = r0.f2346a
            android.content.Context r3 = r3.getContext()
            androidx.appcompat.widget.j r4 = androidx.appcompat.widget.C0606j.m2013a()
            int[] r5 = p000a.p001a.C0009j.AppCompatTextHelper
            r6 = 0
            androidx.appcompat.widget.t0 r5 = androidx.appcompat.widget.C0638t0.m1900a(r3, r1, r5, r2, r6)
            int r7 = p000a.p001a.C0009j.AppCompatTextHelper_android_textAppearance
            r8 = -1
            int r7 = r5.m1888g(r7, r8)
            int r9 = p000a.p001a.C0009j.AppCompatTextHelper_android_drawableLeft
            boolean r9 = r5.m1889g(r9)
            if (r9 == 0) goto L_0x0032
            int r9 = p000a.p001a.C0009j.AppCompatTextHelper_android_drawableLeft
            int r9 = r5.m1888g(r9, r6)
            androidx.appcompat.widget.r0 r9 = m1817a(r3, r4, r9)
            r0.f2347b = r9
        L_0x0032:
            int r9 = p000a.p001a.C0009j.AppCompatTextHelper_android_drawableTop
            boolean r9 = r5.m1889g(r9)
            if (r9 == 0) goto L_0x0046
            int r9 = p000a.p001a.C0009j.AppCompatTextHelper_android_drawableTop
            int r9 = r5.m1888g(r9, r6)
            androidx.appcompat.widget.r0 r9 = m1817a(r3, r4, r9)
            r0.f2348c = r9
        L_0x0046:
            int r9 = p000a.p001a.C0009j.AppCompatTextHelper_android_drawableRight
            boolean r9 = r5.m1889g(r9)
            if (r9 == 0) goto L_0x005a
            int r9 = p000a.p001a.C0009j.AppCompatTextHelper_android_drawableRight
            int r9 = r5.m1888g(r9, r6)
            androidx.appcompat.widget.r0 r9 = m1817a(r3, r4, r9)
            r0.f2349d = r9
        L_0x005a:
            int r9 = p000a.p001a.C0009j.AppCompatTextHelper_android_drawableBottom
            boolean r9 = r5.m1889g(r9)
            if (r9 == 0) goto L_0x006e
            int r9 = p000a.p001a.C0009j.AppCompatTextHelper_android_drawableBottom
            int r9 = r5.m1888g(r9, r6)
            androidx.appcompat.widget.r0 r9 = m1817a(r3, r4, r9)
            r0.f2350e = r9
        L_0x006e:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 17
            if (r9 < r10) goto L_0x009c
            int r9 = p000a.p001a.C0009j.AppCompatTextHelper_android_drawableStart
            boolean r9 = r5.m1889g(r9)
            if (r9 == 0) goto L_0x0088
            int r9 = p000a.p001a.C0009j.AppCompatTextHelper_android_drawableStart
            int r9 = r5.m1888g(r9, r6)
            androidx.appcompat.widget.r0 r9 = m1817a(r3, r4, r9)
            r0.f2351f = r9
        L_0x0088:
            int r9 = p000a.p001a.C0009j.AppCompatTextHelper_android_drawableEnd
            boolean r9 = r5.m1889g(r9)
            if (r9 == 0) goto L_0x009c
            int r9 = p000a.p001a.C0009j.AppCompatTextHelper_android_drawableEnd
            int r9 = r5.m1888g(r9, r6)
            androidx.appcompat.widget.r0 r4 = m1817a(r3, r4, r9)
            r0.f2352g = r4
        L_0x009c:
            r5.m1908a()
            android.widget.TextView r4 = r0.f2346a
            android.text.method.TransformationMethod r4 = r4.getTransformationMethod()
            boolean r4 = r4 instanceof android.text.method.PasswordTransformationMethod
            r5 = 1
            r9 = 23
            r10 = 0
            if (r7 == r8) goto L_0x0109
            int[] r11 = p000a.p001a.C0009j.TextAppearance
            androidx.appcompat.widget.t0 r7 = androidx.appcompat.widget.C0638t0.m1902a(r3, r7, r11)
            if (r4 != 0) goto L_0x00c6
            int r11 = p000a.p001a.C0009j.TextAppearance_textAllCaps
            boolean r11 = r7.m1889g(r11)
            if (r11 == 0) goto L_0x00c6
            int r11 = p000a.p001a.C0009j.TextAppearance_textAllCaps
            boolean r11 = r7.m1903a(r11, r6)
            r12 = r11
            r11 = 1
            goto L_0x00c8
        L_0x00c6:
            r11 = 0
            r12 = 0
        L_0x00c8:
            r0.m1816a(r3, r7)
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 >= r9) goto L_0x0103
            int r13 = p000a.p001a.C0009j.TextAppearance_android_textColor
            boolean r13 = r7.m1889g(r13)
            if (r13 == 0) goto L_0x00de
            int r13 = p000a.p001a.C0009j.TextAppearance_android_textColor
            android.content.res.ColorStateList r13 = r7.m1907a(r13)
            goto L_0x00df
        L_0x00de:
            r13 = r10
        L_0x00df:
            int r14 = p000a.p001a.C0009j.TextAppearance_android_textColorHint
            boolean r14 = r7.m1889g(r14)
            if (r14 == 0) goto L_0x00ee
            int r14 = p000a.p001a.C0009j.TextAppearance_android_textColorHint
            android.content.res.ColorStateList r14 = r7.m1907a(r14)
            goto L_0x00ef
        L_0x00ee:
            r14 = r10
        L_0x00ef:
            int r15 = p000a.p001a.C0009j.TextAppearance_android_textColorLink
            boolean r15 = r7.m1889g(r15)
            if (r15 == 0) goto L_0x00fd
            int r10 = p000a.p001a.C0009j.TextAppearance_android_textColorLink
            android.content.res.ColorStateList r10 = r7.m1907a(r10)
        L_0x00fd:
            r16 = r13
            r13 = r10
            r10 = r16
            goto L_0x0105
        L_0x0103:
            r13 = r10
            r14 = r13
        L_0x0105:
            r7.m1908a()
            goto L_0x010d
        L_0x0109:
            r13 = r10
            r14 = r13
            r11 = 0
            r12 = 0
        L_0x010d:
            int[] r7 = p000a.p001a.C0009j.TextAppearance
            androidx.appcompat.widget.t0 r7 = androidx.appcompat.widget.C0638t0.m1900a(r3, r1, r7, r2, r6)
            if (r4 != 0) goto L_0x0124
            int r15 = p000a.p001a.C0009j.TextAppearance_textAllCaps
            boolean r15 = r7.m1889g(r15)
            if (r15 == 0) goto L_0x0124
            int r11 = p000a.p001a.C0009j.TextAppearance_textAllCaps
            boolean r12 = r7.m1903a(r11, r6)
            goto L_0x0125
        L_0x0124:
            r5 = r11
        L_0x0125:
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 >= r9) goto L_0x0153
            int r9 = p000a.p001a.C0009j.TextAppearance_android_textColor
            boolean r9 = r7.m1889g(r9)
            if (r9 == 0) goto L_0x0137
            int r9 = p000a.p001a.C0009j.TextAppearance_android_textColor
            android.content.res.ColorStateList r10 = r7.m1907a(r9)
        L_0x0137:
            int r9 = p000a.p001a.C0009j.TextAppearance_android_textColorHint
            boolean r9 = r7.m1889g(r9)
            if (r9 == 0) goto L_0x0145
            int r9 = p000a.p001a.C0009j.TextAppearance_android_textColorHint
            android.content.res.ColorStateList r14 = r7.m1907a(r9)
        L_0x0145:
            int r9 = p000a.p001a.C0009j.TextAppearance_android_textColorLink
            boolean r9 = r7.m1889g(r9)
            if (r9 == 0) goto L_0x0153
            int r9 = p000a.p001a.C0009j.TextAppearance_android_textColorLink
            android.content.res.ColorStateList r13 = r7.m1907a(r9)
        L_0x0153:
            int r9 = android.os.Build.VERSION.SDK_INT
            r11 = 28
            if (r9 < r11) goto L_0x016f
            int r9 = p000a.p001a.C0009j.TextAppearance_android_textSize
            boolean r9 = r7.m1889g(r9)
            if (r9 == 0) goto L_0x016f
            int r9 = p000a.p001a.C0009j.TextAppearance_android_textSize
            int r9 = r7.m1896c(r9, r8)
            if (r9 != 0) goto L_0x016f
            android.widget.TextView r9 = r0.f2346a
            r11 = 0
            r9.setTextSize(r6, r11)
        L_0x016f:
            r0.m1816a(r3, r7)
            r7.m1908a()
            if (r10 == 0) goto L_0x017c
            android.widget.TextView r7 = r0.f2346a
            r7.setTextColor(r10)
        L_0x017c:
            if (r14 == 0) goto L_0x0183
            android.widget.TextView r7 = r0.f2346a
            r7.setHintTextColor(r14)
        L_0x0183:
            if (r13 == 0) goto L_0x018a
            android.widget.TextView r7 = r0.f2346a
            r7.setLinkTextColor(r13)
        L_0x018a:
            if (r4 != 0) goto L_0x0191
            if (r5 == 0) goto L_0x0191
            r0.m1812a(r12)
        L_0x0191:
            android.graphics.Typeface r4 = r0.f2355j
            if (r4 == 0) goto L_0x019c
            android.widget.TextView r5 = r0.f2346a
            int r7 = r0.f2354i
            r5.setTypeface(r4, r7)
        L_0x019c:
            androidx.appcompat.widget.z r4 = r0.f2353h
            r4.m1781a(r1, r2)
            boolean r2 = androidx.core.widget.AbstractC0713b.f2708a
            if (r2 == 0) goto L_0x01e0
            androidx.appcompat.widget.z r2 = r0.f2353h
            int r2 = r2.m1770f()
            if (r2 == 0) goto L_0x01e0
            androidx.appcompat.widget.z r2 = r0.f2353h
            int[] r2 = r2.m1771e()
            int r4 = r2.length
            if (r4 <= 0) goto L_0x01e0
            android.widget.TextView r4 = r0.f2346a
            int r4 = r4.getAutoSizeStepGranularity()
            float r4 = (float) r4
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x01db
            android.widget.TextView r2 = r0.f2346a
            androidx.appcompat.widget.z r4 = r0.f2353h
            int r4 = r4.m1773c()
            androidx.appcompat.widget.z r5 = r0.f2353h
            int r5 = r5.m1774b()
            androidx.appcompat.widget.z r7 = r0.f2353h
            int r7 = r7.m1772d()
            r2.setAutoSizeTextTypeUniformWithConfiguration(r4, r5, r7, r6)
            goto L_0x01e0
        L_0x01db:
            android.widget.TextView r4 = r0.f2346a
            r4.setAutoSizeTextTypeUniformWithPresetSizes(r2, r6)
        L_0x01e0:
            int[] r2 = p000a.p001a.C0009j.AppCompatTextView
            androidx.appcompat.widget.t0 r1 = androidx.appcompat.widget.C0638t0.m1901a(r3, r1, r2)
            int r2 = p000a.p001a.C0009j.AppCompatTextView_firstBaselineToTopHeight
            int r2 = r1.m1896c(r2, r8)
            int r3 = p000a.p001a.C0009j.AppCompatTextView_lastBaselineToBottomHeight
            int r3 = r1.m1896c(r3, r8)
            int r4 = p000a.p001a.C0009j.AppCompatTextView_lineHeight
            int r4 = r1.m1896c(r4, r8)
            r1.m1908a()
            if (r2 == r8) goto L_0x0202
            android.widget.TextView r1 = r0.f2346a
            androidx.core.widget.C0720i.m1495a(r1, r2)
        L_0x0202:
            if (r3 == r8) goto L_0x0209
            android.widget.TextView r1 = r0.f2346a
            androidx.core.widget.C0720i.m1489b(r1, r3)
        L_0x0209:
            if (r4 == r8) goto L_0x0210
            android.widget.TextView r1 = r0.f2346a
            androidx.core.widget.C0720i.m1487c(r1, r4)
        L_0x0210:
            return
    }

    /* renamed from: a */
    void m1813a(java.lang.ref.WeakReference<android.widget.TextView> r2, android.graphics.Typeface r3) {
            r1 = this;
            boolean r0 = r1.f2356k
            if (r0 == 0) goto L_0x0013
            r1.f2355j = r3
            java.lang.Object r2 = r2.get()
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L_0x0013
            int r0 = r1.f2354i
            r2.setTypeface(r3, r0)
        L_0x0013:
            return
    }

    /* renamed from: a */
    void m1812a(boolean r2) {
            r1 = this;
            android.widget.TextView r0 = r1.f2346a
            r0.setAllCaps(r2)
            return
    }

    /* renamed from: a */
    void m1811a(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            boolean r1 = androidx.core.widget.AbstractC0713b.f2708a
            if (r1 != 0) goto L_0x0007
            r0.m1809b()
        L_0x0007:
            return
    }

    /* renamed from: a */
    void m1810a(int[] r2, int r3) {
            r1 = this;
            androidx.appcompat.widget.z r0 = r1.f2353h
            r0.m1775a(r2, r3)
            return
    }

    /* renamed from: b */
    void m1809b() {
            r1 = this;
            androidx.appcompat.widget.z r0 = r1.f2353h
            r0.m1790a()
            return
    }

    /* renamed from: c */
    int m1807c() {
            r1 = this;
            androidx.appcompat.widget.z r0 = r1.f2353h
            int r0 = r0.m1774b()
            return r0
    }

    /* renamed from: d */
    int m1806d() {
            r1 = this;
            androidx.appcompat.widget.z r0 = r1.f2353h
            int r0 = r0.m1773c()
            return r0
    }

    /* renamed from: e */
    int m1805e() {
            r1 = this;
            androidx.appcompat.widget.z r0 = r1.f2353h
            int r0 = r0.m1772d()
            return r0
    }

    /* renamed from: f */
    int[] m1804f() {
            r1 = this;
            androidx.appcompat.widget.z r0 = r1.f2353h
            int[] r0 = r0.m1771e()
            return r0
    }

    /* renamed from: g */
    int m1803g() {
            r1 = this;
            androidx.appcompat.widget.z r0 = r1.f2353h
            int r0 = r0.m1770f()
            return r0
    }

    /* renamed from: h */
    boolean m1802h() {
            r1 = this;
            androidx.appcompat.widget.z r0 = r1.f2353h
            boolean r0 = r0.m1769g()
            return r0
    }
}
