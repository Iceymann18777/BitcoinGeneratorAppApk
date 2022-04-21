package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.n0 */
/* loaded from: classes.dex */
class View$OnClickListenerC0625n0 extends p000a.p031h.p032a.AbstractC0236c implements android.view.View.OnClickListener {

    /* renamed from: m */
    private final androidx.appcompat.widget.SearchView f2232m;

    /* renamed from: n */
    private final android.app.SearchableInfo f2233n;

    /* renamed from: o */
    private final android.content.Context f2234o;

    /* renamed from: p */
    private final java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable.ConstantState> f2235p;

    /* renamed from: q */
    private final int f2236q;

    /* renamed from: r */
    private boolean f2237r;

    /* renamed from: s */
    private int f2238s;

    /* renamed from: t */
    private android.content.res.ColorStateList f2239t;

    /* renamed from: u */
    private int f2240u;

    /* renamed from: v */
    private int f2241v;

    /* renamed from: w */
    private int f2242w;

    /* renamed from: x */
    private int f2243x;

    /* renamed from: y */
    private int f2244y;

    /* renamed from: z */
    private int f2245z;

    /* renamed from: androidx.appcompat.widget.n0$a */
    /* loaded from: classes.dex */
    private static final class C0626a {

        /* renamed from: a */
        public final android.widget.TextView f2246a;

        /* renamed from: b */
        public final android.widget.TextView f2247b;

        /* renamed from: c */
        public final android.widget.ImageView f2248c;

        /* renamed from: d */
        public final android.widget.ImageView f2249d;

        /* renamed from: e */
        public final android.widget.ImageView f2250e;

        public C0626a(android.view.View r2) {
                r1 = this;
                r1.<init>()
                r0 = 16908308(0x1020014, float:2.3877285E-38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1.f2246a = r0
                r0 = 16908309(0x1020015, float:2.3877288E-38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1.f2247b = r0
                r0 = 16908295(0x1020007, float:2.387725E-38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r1.f2248c = r0
                r0 = 16908296(0x1020008, float:2.3877251E-38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r1.f2249d = r0
                int r0 = p000a.p001a.C0005f.edit_query
                android.view.View r2 = r2.findViewById(r0)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                r1.f2250e = r2
                return
        }
    }

    public View$OnClickListenerC0625n0(android.content.Context r4, androidx.appcompat.widget.SearchView r5, android.app.SearchableInfo r6, java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable.ConstantState> r7) {
            r3 = this;
            int r0 = r5.getSuggestionRowLayout()
            r1 = 1
            r2 = 0
            r3.<init>(r4, r0, r2, r1)
            r0 = 0
            r3.f2237r = r0
            r3.f2238s = r1
            r0 = -1
            r3.f2240u = r0
            r3.f2241v = r0
            r3.f2242w = r0
            r3.f2243x = r0
            r3.f2244y = r0
            r3.f2245z = r0
            android.content.Context r0 = r3.f689e
            java.lang.String r1 = "search"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.SearchManager r0 = (android.app.SearchManager) r0
            r3.f2232m = r5
            r3.f2233n = r6
            int r5 = r5.getSuggestionCommitIconResId()
            r3.f2236q = r5
            r3.f2234o = r4
            r3.f2235p = r7
            return
    }

    /* renamed from: a */
    private android.graphics.drawable.Drawable m1943a(android.content.ComponentName r7) {
            r6 = this;
            java.lang.String r0 = "SuggestionsAdapter"
            android.content.Context r1 = r6.f689e
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r2 = 128(0x80, float:1.794E-43)
            r3 = 0
            android.content.pm.ActivityInfo r2 = r1.getActivityInfo(r7, r2)     // Catch: NameNotFoundException -> 0x0044
            int r4 = r2.getIconResource()
            if (r4 != 0) goto L_0x0016
            return r3
        L_0x0016:
            java.lang.String r5 = r7.getPackageName()
            android.content.pm.ApplicationInfo r2 = r2.applicationInfo
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r5, r4, r2)
            if (r1 != 0) goto L_0x0043
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid icon resource "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " for "
            r1.append(r2)
            java.lang.String r7 = r7.flattenToShortString()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
        L_0x003f:
            android.util.Log.w(r0, r7)
            return r3
        L_0x0043:
            return r1
        L_0x0044:
            r7 = move-exception
            java.lang.String r7 = r7.toString()
            goto L_0x003f
    }

    /* renamed from: a */
    private android.graphics.drawable.Drawable m1934a(java.lang.String r2) {
            r1 = this;
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r1.f2235p
            java.lang.Object r2 = r0.get(r2)
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
            if (r2 != 0) goto L_0x000c
            r2 = 0
            return r2
        L_0x000c:
            android.graphics.drawable.Drawable r2 = r2.newDrawable()
            return r2
    }

    /* renamed from: a */
    private static java.lang.String m1941a(android.database.Cursor r2, int r3) {
            r0 = 0
            r1 = -1
            if (r3 != r1) goto L_0x0005
            return r0
        L_0x0005:
            java.lang.String r2 = r2.getString(r3)     // Catch: Exception -> 0x000a
            return r2
        L_0x000a:
            r2 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.String r1 = "unexpected error retrieving valid column from cursor, did the remote process die?"
            android.util.Log.e(r3, r1, r2)
            return r0
    }

    /* renamed from: a */
    public static java.lang.String m1940a(android.database.Cursor r0, java.lang.String r1) {
            int r1 = r0.getColumnIndex(r1)
            java.lang.String r0 = m1941a(r0, r1)
            return r0
    }

    /* renamed from: a */
    private void m1937a(android.widget.ImageView r1, android.graphics.drawable.Drawable r2, int r3) {
            r0 = this;
            r1.setImageDrawable(r2)
            if (r2 != 0) goto L_0x0009
            r1.setVisibility(r3)
            goto L_0x0014
        L_0x0009:
            r3 = 0
            r1.setVisibility(r3)
            r2.setVisible(r3, r3)
            r1 = 1
            r2.setVisible(r1, r3)
        L_0x0014:
            return
    }

    /* renamed from: a */
    private void m1936a(android.widget.TextView r1, java.lang.CharSequence r2) {
            r0 = this;
            r1.setText(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x000c
            r2 = 8
            goto L_0x000d
        L_0x000c:
            r2 = 0
        L_0x000d:
            r1.setVisibility(r2)
            return
    }

    /* renamed from: a */
    private void m1933a(java.lang.String r2, android.graphics.drawable.Drawable r3) {
            r1 = this;
            if (r3 == 0) goto L_0x000b
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r1.f2235p
            android.graphics.drawable.Drawable$ConstantState r3 = r3.getConstantState()
            r0.put(r2, r3)
        L_0x000b:
            return
    }

    /* renamed from: b */
    private android.graphics.drawable.Drawable m1932b(android.content.ComponentName r4) {
            r3 = this;
            java.lang.String r0 = r4.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r3.f2235p
            boolean r1 = r1.containsKey(r0)
            r2 = 0
            if (r1 == 0) goto L_0x0023
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r3.f2235p
            java.lang.Object r4 = r4.get(r0)
            android.graphics.drawable.Drawable$ConstantState r4 = (android.graphics.drawable.Drawable.ConstantState) r4
            if (r4 != 0) goto L_0x0018
            goto L_0x0022
        L_0x0018:
            android.content.Context r0 = r3.f2234o
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.Drawable r2 = r4.newDrawable(r0)
        L_0x0022:
            return r2
        L_0x0023:
            android.graphics.drawable.Drawable r4 = r3.m1943a(r4)
            if (r4 != 0) goto L_0x002a
            goto L_0x002e
        L_0x002a:
            android.graphics.drawable.Drawable$ConstantState r2 = r4.getConstantState()
        L_0x002e:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r3.f2235p
            r1.put(r0, r2)
            return r4
    }

    /* renamed from: b */
    private android.graphics.drawable.Drawable m1929b(android.net.Uri r7) {
            r6 = this;
            java.lang.String r0 = "Error closing icon stream for "
            java.lang.String r1 = "SuggestionsAdapter"
            r2 = 0
            java.lang.String r3 = r7.getScheme()     // Catch: FileNotFoundException -> 0x0085
            java.lang.String r4 = "android.resource"
            boolean r3 = r4.equals(r3)     // Catch: FileNotFoundException -> 0x0085
            if (r3 == 0) goto L_0x002d
            android.graphics.drawable.Drawable r7 = r6.m1939a(r7)     // Catch: NotFoundException -> 0x0016, FileNotFoundException -> 0x0085
            return r7
        L_0x0016:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch: FileNotFoundException -> 0x0085
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: FileNotFoundException -> 0x0085
            r3.<init>()     // Catch: FileNotFoundException -> 0x0085
            java.lang.String r4 = "Resource does not exist: "
            r3.append(r4)     // Catch: FileNotFoundException -> 0x0085
            r3.append(r7)     // Catch: FileNotFoundException -> 0x0085
            java.lang.String r3 = r3.toString()     // Catch: FileNotFoundException -> 0x0085
            r0.<init>(r3)     // Catch: FileNotFoundException -> 0x0085
            throw r0     // Catch: FileNotFoundException -> 0x0085
        L_0x002d:
            android.content.Context r3 = r6.f2234o     // Catch: FileNotFoundException -> 0x0085
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: FileNotFoundException -> 0x0085
            java.io.InputStream r3 = r3.openInputStream(r7)     // Catch: FileNotFoundException -> 0x0085
            if (r3 == 0) goto L_0x006e
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r3, r2)     // Catch: all -> 0x0055
            r3.close()     // Catch: IOException -> 0x0041
            goto L_0x0054
        L_0x0041:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: FileNotFoundException -> 0x0085
            r5.<init>()     // Catch: FileNotFoundException -> 0x0085
            r5.append(r0)     // Catch: FileNotFoundException -> 0x0085
            r5.append(r7)     // Catch: FileNotFoundException -> 0x0085
            java.lang.String r0 = r5.toString()     // Catch: FileNotFoundException -> 0x0085
            android.util.Log.e(r1, r0, r3)     // Catch: FileNotFoundException -> 0x0085
        L_0x0054:
            return r4
        L_0x0055:
            r4 = move-exception
            r3.close()     // Catch: IOException -> 0x005a
            goto L_0x006d
        L_0x005a:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: FileNotFoundException -> 0x0085
            r5.<init>()     // Catch: FileNotFoundException -> 0x0085
            r5.append(r0)     // Catch: FileNotFoundException -> 0x0085
            r5.append(r7)     // Catch: FileNotFoundException -> 0x0085
            java.lang.String r0 = r5.toString()     // Catch: FileNotFoundException -> 0x0085
            android.util.Log.e(r1, r0, r3)     // Catch: FileNotFoundException -> 0x0085
        L_0x006d:
            throw r4     // Catch: FileNotFoundException -> 0x0085
        L_0x006e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch: FileNotFoundException -> 0x0085
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: FileNotFoundException -> 0x0085
            r3.<init>()     // Catch: FileNotFoundException -> 0x0085
            java.lang.String r4 = "Failed to open "
            r3.append(r4)     // Catch: FileNotFoundException -> 0x0085
            r3.append(r7)     // Catch: FileNotFoundException -> 0x0085
            java.lang.String r3 = r3.toString()     // Catch: FileNotFoundException -> 0x0085
            r0.<init>(r3)     // Catch: FileNotFoundException -> 0x0085
            throw r0     // Catch: FileNotFoundException -> 0x0085
        L_0x0085:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Icon not found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r0.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r1, r7)
            return r2
    }

    /* renamed from: b */
    private android.graphics.drawable.Drawable m1927b(java.lang.String r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x0070
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L_0x0070
            java.lang.String r1 = "0"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0012
            goto L_0x0070
        L_0x0012:
            int r1 = java.lang.Integer.parseInt(r5)     // Catch: NotFoundException -> 0x0046, NumberFormatException -> 0x005d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: NotFoundException -> 0x0046, NumberFormatException -> 0x005d
            r2.<init>()     // Catch: NotFoundException -> 0x0046, NumberFormatException -> 0x005d
            java.lang.String r3 = "android.resource://"
            r2.append(r3)     // Catch: NotFoundException -> 0x0046, NumberFormatException -> 0x005d
            android.content.Context r3 = r4.f2234o     // Catch: NotFoundException -> 0x0046, NumberFormatException -> 0x005d
            java.lang.String r3 = r3.getPackageName()     // Catch: NotFoundException -> 0x0046, NumberFormatException -> 0x005d
            r2.append(r3)     // Catch: NotFoundException -> 0x0046, NumberFormatException -> 0x005d
            java.lang.String r3 = "/"
            r2.append(r3)     // Catch: NotFoundException -> 0x0046, NumberFormatException -> 0x005d
            r2.append(r1)     // Catch: NotFoundException -> 0x0046, NumberFormatException -> 0x005d
            java.lang.String r2 = r2.toString()     // Catch: NotFoundException -> 0x0046, NumberFormatException -> 0x005d
            android.graphics.drawable.Drawable r3 = r4.m1934a(r2)     // Catch: NotFoundException -> 0x0046, NumberFormatException -> 0x005d
            if (r3 == 0) goto L_0x003c
            return r3
        L_0x003c:
            android.content.Context r3 = r4.f2234o     // Catch: NotFoundException -> 0x0046, NumberFormatException -> 0x005d
            android.graphics.drawable.Drawable r1 = p000a.p018g.p019d.C0124a.m3732b(r3, r1)     // Catch: NotFoundException -> 0x0046, NumberFormatException -> 0x005d
            r4.m1933a(r2, r1)     // Catch: NotFoundException -> 0x0046, NumberFormatException -> 0x005d
            return r1
        L_0x0046:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Icon resource not found: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "SuggestionsAdapter"
            android.util.Log.w(r1, r5)
            return r0
        L_0x005d:
            android.graphics.drawable.Drawable r0 = r4.m1934a(r5)
            if (r0 == 0) goto L_0x0065
            return r0
        L_0x0065:
            android.net.Uri r0 = android.net.Uri.parse(r5)
            android.graphics.drawable.Drawable r0 = r4.m1929b(r0)
            r4.m1933a(r5, r0)
        L_0x0070:
            return r0
    }

    /* renamed from: b */
    private java.lang.CharSequence m1928b(java.lang.CharSequence r9) {
            r8 = this;
            android.content.res.ColorStateList r0 = r8.f2239t
            if (r0 != 0) goto L_0x0023
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r8.f689e
            android.content.res.Resources$Theme r1 = r1.getTheme()
            int r2 = p000a.p001a.C0000a.textColorSearchUrl
            r3 = 1
            r1.resolveAttribute(r2, r0, r3)
            android.content.Context r1 = r8.f689e
            android.content.res.Resources r1 = r1.getResources()
            int r0 = r0.resourceId
            android.content.res.ColorStateList r0 = r1.getColorStateList(r0)
            r8.f2239t = r0
        L_0x0023:
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r9)
            android.text.style.TextAppearanceSpan r7 = new android.text.style.TextAppearanceSpan
            r2 = 0
            r3 = 0
            r4 = 0
            android.content.res.ColorStateList r5 = r8.f2239t
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r1 = 0
            int r9 = r9.length()
            r2 = 33
            r0.setSpan(r7, r1, r9, r2)
            return r0
    }

    /* renamed from: d */
    private android.graphics.drawable.Drawable m1926d(android.database.Cursor r1) {
            r0 = this;
            android.app.SearchableInfo r1 = r0.f2233n
            android.content.ComponentName r1 = r1.getSearchActivity()
            android.graphics.drawable.Drawable r1 = r0.m1932b(r1)
            if (r1 == 0) goto L_0x000d
            return r1
        L_0x000d:
            android.content.Context r1 = r0.f689e
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            android.graphics.drawable.Drawable r1 = r1.getDefaultActivityIcon()
            return r1
    }

    /* renamed from: e */
    private android.graphics.drawable.Drawable m1925e(android.database.Cursor r3) {
            r2 = this;
            int r0 = r2.f2243x
            r1 = -1
            if (r0 != r1) goto L_0x0007
            r3 = 0
            return r3
        L_0x0007:
            java.lang.String r0 = r3.getString(r0)
            android.graphics.drawable.Drawable r0 = r2.m1927b(r0)
            if (r0 == 0) goto L_0x0012
            return r0
        L_0x0012:
            android.graphics.drawable.Drawable r3 = r2.m1926d(r3)
            return r3
    }

    /* renamed from: f */
    private android.graphics.drawable.Drawable m1924f(android.database.Cursor r3) {
            r2 = this;
            int r0 = r2.f2244y
            r1 = -1
            if (r0 != r1) goto L_0x0007
            r3 = 0
            return r3
        L_0x0007:
            java.lang.String r3 = r3.getString(r0)
            android.graphics.drawable.Drawable r3 = r2.m1927b(r3)
            return r3
    }

    /* renamed from: g */
    private void m1923g(android.database.Cursor r2) {
            r1 = this;
            if (r2 == 0) goto L_0x0007
            android.os.Bundle r2 = r2.getExtras()
            goto L_0x0008
        L_0x0007:
            r2 = 0
        L_0x0008:
            if (r2 == 0) goto L_0x0012
            java.lang.String r0 = "in_progress"
            boolean r2 = r2.getBoolean(r0)
            if (r2 == 0) goto L_0x0012
        L_0x0012:
            return
    }

    /* renamed from: a */
    android.database.Cursor m1944a(android.app.SearchableInfo r10, java.lang.String r11, int r12) {
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = r10.getSuggestAuthority()
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r3 = "content"
            android.net.Uri$Builder r2 = r2.scheme(r3)
            android.net.Uri$Builder r1 = r2.authority(r1)
            java.lang.String r2 = ""
            android.net.Uri$Builder r1 = r1.query(r2)
            android.net.Uri$Builder r1 = r1.fragment(r2)
            java.lang.String r2 = r10.getSuggestPath()
            if (r2 == 0) goto L_0x002d
            r1.appendEncodedPath(r2)
        L_0x002d:
            java.lang.String r2 = "search_suggest_query"
            r1.appendPath(r2)
            java.lang.String r6 = r10.getSuggestSelection()
            if (r6 == 0) goto L_0x003f
            r10 = 1
            java.lang.String[] r0 = new java.lang.String[r10]
            r10 = 0
            r0[r10] = r11
            goto L_0x0042
        L_0x003f:
            r1.appendPath(r11)
        L_0x0042:
            r7 = r0
            if (r12 <= 0) goto L_0x004e
            java.lang.String r10 = java.lang.String.valueOf(r12)
            java.lang.String r11 = "limit"
            r1.appendQueryParameter(r11, r10)
        L_0x004e:
            android.net.Uri r4 = r1.build()
            android.content.Context r10 = r9.f689e
            android.content.ContentResolver r3 = r10.getContentResolver()
            r5 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)
            return r10
    }

    @Override // p000a.p031h.p032a.C0234b.AbstractC0235a
    /* renamed from: a */
    public android.database.Cursor mo1935a(java.lang.CharSequence r4) {
            r3 = this;
            if (r4 != 0) goto L_0x0005
            java.lang.String r4 = ""
            goto L_0x0009
        L_0x0005:
            java.lang.String r4 = r4.toString()
        L_0x0009:
            androidx.appcompat.widget.SearchView r0 = r3.f2232m
            int r0 = r0.getVisibility()
            r1 = 0
            if (r0 != 0) goto L_0x0031
            androidx.appcompat.widget.SearchView r0 = r3.f2232m
            int r0 = r0.getWindowVisibility()
            if (r0 == 0) goto L_0x001b
            goto L_0x0031
        L_0x001b:
            android.app.SearchableInfo r0 = r3.f2233n     // Catch: RuntimeException -> 0x0029
            r2 = 50
            android.database.Cursor r4 = r3.m1944a(r0, r4, r2)     // Catch: RuntimeException -> 0x0029
            if (r4 == 0) goto L_0x0031
            r4.getCount()     // Catch: RuntimeException -> 0x0029
            return r4
        L_0x0029:
            r4 = move-exception
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r2 = "Search suggestions query threw an exception."
            android.util.Log.w(r0, r2, r4)
        L_0x0031:
            return r1
    }

    /* renamed from: a */
    android.graphics.drawable.Drawable m1939a(android.net.Uri r8) {
            r7 = this;
            java.lang.String r0 = r8.getAuthority()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x00ba
            android.content.Context r1 = r7.f689e     // Catch: NameNotFoundException -> 0x00a3
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: NameNotFoundException -> 0x00a3
            android.content.res.Resources r1 = r1.getResourcesForApplication(r0)     // Catch: NameNotFoundException -> 0x00a3
            java.util.List r2 = r8.getPathSegments()
            if (r2 == 0) goto L_0x008c
            int r3 = r2.size()
            r4 = 0
            r5 = 1
            if (r3 != r5) goto L_0x0044
            java.lang.Object r0 = r2.get(r4)     // Catch: NumberFormatException -> 0x002d
            java.lang.String r0 = (java.lang.String) r0     // Catch: NumberFormatException -> 0x002d
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: NumberFormatException -> 0x002d
            goto L_0x0057
        L_0x002d:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Single path segment is not a resource ID: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L_0x0044:
            r6 = 2
            if (r3 != r6) goto L_0x0075
            java.lang.Object r3 = r2.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            int r0 = r1.getIdentifier(r3, r2, r0)
        L_0x0057:
            if (r0 == 0) goto L_0x005e
            android.graphics.drawable.Drawable r8 = r1.getDrawable(r0)
            return r8
        L_0x005e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No resource found for: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L_0x0075:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "More than two path segments: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L_0x008c:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No path: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L_0x00a3:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No package found for authority: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L_0x00ba:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No authority: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
    }

    @Override // p000a.p031h.p032a.AbstractC0231a, p000a.p031h.p032a.C0234b.AbstractC0235a
    /* renamed from: a */
    public java.lang.CharSequence mo1942a(android.database.Cursor r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "suggest_intent_query"
            java.lang.String r1 = m1940a(r3, r1)
            if (r1 == 0) goto L_0x000d
            return r1
        L_0x000d:
            android.app.SearchableInfo r1 = r2.f2233n
            boolean r1 = r1.shouldRewriteQueryFromData()
            if (r1 == 0) goto L_0x001e
            java.lang.String r1 = "suggest_intent_data"
            java.lang.String r1 = m1940a(r3, r1)
            if (r1 == 0) goto L_0x001e
            return r1
        L_0x001e:
            android.app.SearchableInfo r1 = r2.f2233n
            boolean r1 = r1.shouldRewriteQueryFromText()
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = "suggest_text_1"
            java.lang.String r3 = m1940a(r3, r1)
            if (r3 == 0) goto L_0x002f
            return r3
        L_0x002f:
            return r0
    }

    /* renamed from: a */
    public void m1945a(int r1) {
            r0 = this;
            r0.f2238s = r1
            return
    }

    @Override // p000a.p031h.p032a.AbstractC0231a
    /* renamed from: a */
    public void mo1938a(android.view.View r7, android.content.Context r8, android.database.Cursor r9) {
            r6 = this;
            java.lang.Object r7 = r7.getTag()
            androidx.appcompat.widget.n0$a r7 = (androidx.appcompat.widget.View$OnClickListenerC0625n0.C0626a) r7
            int r8 = r6.f2245z
            r0 = 0
            r1 = -1
            if (r8 == r1) goto L_0x0011
            int r8 = r9.getInt(r8)
            goto L_0x0012
        L_0x0011:
            r8 = 0
        L_0x0012:
            android.widget.TextView r1 = r7.f2246a
            if (r1 == 0) goto L_0x0021
            int r1 = r6.f2240u
            java.lang.String r1 = m1941a(r9, r1)
            android.widget.TextView r2 = r7.f2246a
            r6.m1936a(r2, r1)
        L_0x0021:
            android.widget.TextView r1 = r7.f2247b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x005e
            int r1 = r6.f2242w
            java.lang.String r1 = m1941a(r9, r1)
            if (r1 == 0) goto L_0x0034
            java.lang.CharSequence r1 = r6.m1928b(r1)
            goto L_0x003a
        L_0x0034:
            int r1 = r6.f2241v
            java.lang.String r1 = m1941a(r9, r1)
        L_0x003a:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L_0x004d
            android.widget.TextView r4 = r7.f2246a
            if (r4 == 0) goto L_0x0059
            r4.setSingleLine(r0)
            android.widget.TextView r4 = r7.f2246a
            r4.setMaxLines(r2)
            goto L_0x0059
        L_0x004d:
            android.widget.TextView r4 = r7.f2246a
            if (r4 == 0) goto L_0x0059
            r4.setSingleLine(r3)
            android.widget.TextView r4 = r7.f2246a
            r4.setMaxLines(r3)
        L_0x0059:
            android.widget.TextView r4 = r7.f2247b
            r6.m1936a(r4, r1)
        L_0x005e:
            android.widget.ImageView r1 = r7.f2248c
            if (r1 == 0) goto L_0x006a
            android.graphics.drawable.Drawable r4 = r6.m1925e(r9)
            r5 = 4
            r6.m1937a(r1, r4, r5)
        L_0x006a:
            android.widget.ImageView r1 = r7.f2249d
            r4 = 8
            if (r1 == 0) goto L_0x0077
            android.graphics.drawable.Drawable r9 = r6.m1924f(r9)
            r6.m1937a(r1, r9, r4)
        L_0x0077:
            int r9 = r6.f2238s
            if (r9 == r2) goto L_0x0087
            if (r9 != r3) goto L_0x0081
            r8 = r8 & r3
            if (r8 == 0) goto L_0x0081
            goto L_0x0087
        L_0x0081:
            android.widget.ImageView r7 = r7.f2250e
            r7.setVisibility(r4)
            goto L_0x009c
        L_0x0087:
            android.widget.ImageView r8 = r7.f2250e
            r8.setVisibility(r0)
            android.widget.ImageView r8 = r7.f2250e
            android.widget.TextView r9 = r7.f2246a
            java.lang.CharSequence r9 = r9.getText()
            r8.setTag(r9)
            android.widget.ImageView r7 = r7.f2250e
            r7.setOnClickListener(r6)
        L_0x009c:
            return
    }

    @Override // p000a.p031h.p032a.AbstractC0236c, p000a.p031h.p032a.AbstractC0231a
    /* renamed from: b */
    public android.view.View mo1931b(android.content.Context r1, android.database.Cursor r2, android.view.ViewGroup r3) {
            r0 = this;
            android.view.View r1 = super.mo1931b(r1, r2, r3)
            androidx.appcompat.widget.n0$a r2 = new androidx.appcompat.widget.n0$a
            r2.<init>(r1)
            r1.setTag(r2)
            int r2 = p000a.p001a.C0005f.edit_query
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            int r3 = r0.f2236q
            r2.setImageResource(r3)
            return r1
    }

    @Override // p000a.p031h.p032a.AbstractC0231a, p000a.p031h.p032a.C0234b.AbstractC0235a
    /* renamed from: b */
    public void mo1930b(android.database.Cursor r3) {
            r2 = this;
            boolean r0 = r2.f2237r
            java.lang.String r1 = "SuggestionsAdapter"
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "Tried to change cursor after adapter was closed."
            android.util.Log.w(r1, r0)
            if (r3 == 0) goto L_0x0010
            r3.close()
        L_0x0010:
            return
        L_0x0011:
            super.mo1930b(r3)     // Catch: Exception -> 0x0047
            if (r3 == 0) goto L_0x004d
            java.lang.String r0 = "suggest_text_1"
            int r0 = r3.getColumnIndex(r0)     // Catch: Exception -> 0x0047
            r2.f2240u = r0     // Catch: Exception -> 0x0047
            java.lang.String r0 = "suggest_text_2"
            int r0 = r3.getColumnIndex(r0)     // Catch: Exception -> 0x0047
            r2.f2241v = r0     // Catch: Exception -> 0x0047
            java.lang.String r0 = "suggest_text_2_url"
            int r0 = r3.getColumnIndex(r0)     // Catch: Exception -> 0x0047
            r2.f2242w = r0     // Catch: Exception -> 0x0047
            java.lang.String r0 = "suggest_icon_1"
            int r0 = r3.getColumnIndex(r0)     // Catch: Exception -> 0x0047
            r2.f2243x = r0     // Catch: Exception -> 0x0047
            java.lang.String r0 = "suggest_icon_2"
            int r0 = r3.getColumnIndex(r0)     // Catch: Exception -> 0x0047
            r2.f2244y = r0     // Catch: Exception -> 0x0047
            java.lang.String r0 = "suggest_flags"
            int r3 = r3.getColumnIndex(r0)     // Catch: Exception -> 0x0047
            r2.f2245z = r3     // Catch: Exception -> 0x0047
            goto L_0x004d
        L_0x0047:
            r3 = move-exception
            java.lang.String r0 = "error changing cursor and caching columns"
            android.util.Log.e(r1, r0, r3)
        L_0x004d:
            return
    }

    @Override // p000a.p031h.p032a.AbstractC0231a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public android.view.View getDropDownView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            android.view.View r2 = super.getDropDownView(r2, r3, r4)     // Catch: RuntimeException -> 0x0005
            return r2
        L_0x0005:
            r2 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.String r0 = "Search suggestions cursor threw exception."
            android.util.Log.w(r3, r0, r2)
            android.content.Context r3 = r1.f689e
            android.database.Cursor r0 = r1.f688d
            android.view.View r3 = r1.mo3348a(r3, r0, r4)
            if (r3 == 0) goto L_0x0026
            java.lang.Object r4 = r3.getTag()
            androidx.appcompat.widget.n0$a r4 = (androidx.appcompat.widget.View$OnClickListenerC0625n0.C0626a) r4
            android.widget.TextView r4 = r4.f2246a
            java.lang.String r2 = r2.toString()
            r4.setText(r2)
        L_0x0026:
            return r3
    }

    @Override // p000a.p031h.p032a.AbstractC0231a, android.widget.Adapter
    public android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            android.view.View r2 = super.getView(r2, r3, r4)     // Catch: RuntimeException -> 0x0005
            return r2
        L_0x0005:
            r2 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.String r0 = "Search suggestions cursor threw exception."
            android.util.Log.w(r3, r0, r2)
            android.content.Context r3 = r1.f689e
            android.database.Cursor r0 = r1.f688d
            android.view.View r3 = r1.mo1931b(r3, r0, r4)
            if (r3 == 0) goto L_0x0026
            java.lang.Object r4 = r3.getTag()
            androidx.appcompat.widget.n0$a r4 = (androidx.appcompat.widget.View$OnClickListenerC0625n0.C0626a) r4
            android.widget.TextView r4 = r4.f2246a
            java.lang.String r2 = r2.toString()
            r4.setText(r2)
        L_0x0026:
            return r3
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
            r1 = this;
            super.notifyDataSetChanged()
            android.database.Cursor r0 = r1.mo3349a()
            r1.m1923g(r0)
            return
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
            r1 = this;
            super.notifyDataSetInvalidated()
            android.database.Cursor r0 = r1.mo3349a()
            r1.m1923g(r0)
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            java.lang.Object r2 = r2.getTag()
            boolean r0 = r2 instanceof java.lang.CharSequence
            if (r0 == 0) goto L_0x000f
            androidx.appcompat.widget.SearchView r0 = r1.f2232m
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.m2236a(r2)
        L_0x000f:
            return
    }
}
