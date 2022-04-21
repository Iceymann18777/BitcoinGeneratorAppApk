package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.z */
/* loaded from: classes.dex */
class C0660z {

    /* renamed from: k */
    private static final android.graphics.RectF f2371k = null;

    /* renamed from: l */
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Method> f2372l;

    /* renamed from: a */
    private int f2373a;

    /* renamed from: b */
    private boolean f2374b;

    /* renamed from: c */
    private float f2375c;

    /* renamed from: d */
    private float f2376d;

    /* renamed from: e */
    private float f2377e;

    /* renamed from: f */
    private int[] f2378f;

    /* renamed from: g */
    private boolean f2379g;

    /* renamed from: h */
    private android.text.TextPaint f2380h;

    /* renamed from: i */
    private final android.widget.TextView f2381i;

    /* renamed from: j */
    private final android.content.Context f2382j;

    static {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            androidx.appcompat.widget.C0660z.f2371k = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            androidx.appcompat.widget.C0660z.f2372l = r0
            return
    }

    C0660z(android.widget.TextView r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f2373a = r0
            r2.f2374b = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.f2375c = r1
            r2.f2376d = r1
            r2.f2377e = r1
            int[] r1 = new int[r0]
            r2.f2378f = r1
            r2.f2379g = r0
            r2.f2381i = r3
            android.widget.TextView r3 = r2.f2381i
            android.content.Context r3 = r3.getContext()
            r2.f2382j = r3
            return
    }

    /* renamed from: a */
    private int m1782a(android.graphics.RectF r6) {
            r5 = this;
            int[] r0 = r5.f2378f
            int r0 = r0.length
            if (r0 == 0) goto L_0x0029
            r1 = 0
            r2 = 1
            int r0 = r0 - r2
            r1 = 1
            r2 = 0
        L_0x000a:
            if (r1 > r0) goto L_0x0024
            int r2 = r1 + r0
            int r2 = r2 / 2
            int[] r3 = r5.f2378f
            r3 = r3[r2]
            boolean r3 = r5.m1784a(r3, r6)
            if (r3 == 0) goto L_0x0020
            int r2 = r2 + 1
            r4 = r2
            r2 = r1
            r1 = r4
            goto L_0x000a
        L_0x0020:
            int r2 = r2 + (-1)
            r0 = r2
            goto L_0x000a
        L_0x0024:
            int[] r6 = r5.f2378f
            r6 = r6[r2]
            return r6
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "No available text sizes to choose from."
            r6.<init>(r0)
            goto L_0x0032
        L_0x0031:
            throw r6
        L_0x0032:
            goto L_0x0031
    }

    /* renamed from: a */
    private android.text.StaticLayout m1780a(java.lang.CharSequence r12, android.text.Layout.Alignment r13, int r14) {
            r11 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x0019
            android.widget.TextView r0 = r11.f2381i
            float r0 = r0.getLineSpacingMultiplier()
            android.widget.TextView r1 = r11.f2381i
            float r1 = r1.getLineSpacingExtra()
            android.widget.TextView r2 = r11.f2381i
            boolean r2 = r2.getIncludeFontPadding()
            goto L_0x0053
        L_0x0019:
            android.widget.TextView r0 = r11.f2381i
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.String r2 = "getLineSpacingMultiplier"
            java.lang.Object r0 = r11.m1778a(r0, r2, r1)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            android.widget.TextView r1 = r11.f2381i
            r2 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.String r3 = "getLineSpacingExtra"
            java.lang.Object r1 = r11.m1778a(r1, r3, r2)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            android.widget.TextView r2 = r11.f2381i
            r3 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "getIncludeFontPadding"
            java.lang.Object r2 = r11.m1778a(r2, r4, r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
        L_0x0053:
            r8 = r0
            r9 = r1
            r10 = r2
            android.text.StaticLayout r0 = new android.text.StaticLayout
            android.text.TextPaint r5 = r11.f2380h
            r3 = r0
            r4 = r12
            r6 = r14
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    /* renamed from: a */
    private android.text.StaticLayout m1779a(java.lang.CharSequence r5, android.text.Layout.Alignment r6, int r7, int r8) {
            r4 = this;
            android.widget.TextView r0 = r4.f2381i
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            java.lang.String r2 = "getTextDirectionHeuristic"
            java.lang.Object r0 = r4.m1778a(r0, r2, r1)
            android.text.TextDirectionHeuristic r0 = (android.text.TextDirectionHeuristic) r0
            int r1 = r5.length()
            android.text.TextPaint r2 = r4.f2380h
            r3 = 0
            android.text.StaticLayout$Builder r5 = android.text.StaticLayout.Builder.obtain(r5, r3, r1, r2, r7)
            android.text.StaticLayout$Builder r5 = r5.setAlignment(r6)
            android.widget.TextView r6 = r4.f2381i
            float r6 = r6.getLineSpacingExtra()
            android.widget.TextView r7 = r4.f2381i
            float r7 = r7.getLineSpacingMultiplier()
            android.text.StaticLayout$Builder r5 = r5.setLineSpacing(r6, r7)
            android.widget.TextView r6 = r4.f2381i
            boolean r6 = r6.getIncludeFontPadding()
            android.text.StaticLayout$Builder r5 = r5.setIncludePad(r6)
            android.widget.TextView r6 = r4.f2381i
            int r6 = r6.getBreakStrategy()
            android.text.StaticLayout$Builder r5 = r5.setBreakStrategy(r6)
            android.widget.TextView r6 = r4.f2381i
            int r6 = r6.getHyphenationFrequency()
            android.text.StaticLayout$Builder r5 = r5.setHyphenationFrequency(r6)
            r6 = -1
            if (r8 != r6) goto L_0x004f
            r8 = 2147483647(0x7fffffff, float:NaN)
        L_0x004f:
            android.text.StaticLayout$Builder r5 = r5.setMaxLines(r8)
            android.text.StaticLayout$Builder r5 = r5.setTextDirection(r0)
            android.text.StaticLayout r5 = r5.build()
            return r5
    }

    /* renamed from: a */
    private <T> T m1778a(java.lang.Object r5, java.lang.String r6, T r7) {
            r4 = this;
            r0 = 0
            java.lang.reflect.Method r1 = r4.m1777a(r6)     // Catch: all -> 0x000c, Exception -> 0x000e
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: all -> 0x000c, Exception -> 0x000e
            java.lang.Object r7 = r1.invoke(r5, r2)     // Catch: all -> 0x000c, Exception -> 0x000e
            goto L_0x002b
        L_0x000c:
            r5 = move-exception
            goto L_0x002c
        L_0x000e:
            r5 = move-exception
            r0 = 1
            java.lang.String r1 = "ACTVAutoSizeHelper"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: all -> 0x000c
            r2.<init>()     // Catch: all -> 0x000c
            java.lang.String r3 = "Failed to invoke TextView#"
            r2.append(r3)     // Catch: all -> 0x000c
            r2.append(r6)     // Catch: all -> 0x000c
            java.lang.String r6 = "() method"
            r2.append(r6)     // Catch: all -> 0x000c
            java.lang.String r6 = r2.toString()     // Catch: all -> 0x000c
            android.util.Log.w(r1, r6, r5)     // Catch: all -> 0x000c
        L_0x002b:
            return r7
        L_0x002c:
            throw r5
    }

    /* renamed from: a */
    private java.lang.reflect.Method m1777a(java.lang.String r4) {
            r3 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Method> r0 = androidx.appcompat.widget.C0660z.f2372l     // Catch: Exception -> 0x001f
            java.lang.Object r0 = r0.get(r4)     // Catch: Exception -> 0x001f
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: Exception -> 0x001f
            if (r0 != 0) goto L_0x001e
            java.lang.Class<android.widget.TextView> r0 = android.widget.TextView.class
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: Exception -> 0x001f
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r1)     // Catch: Exception -> 0x001f
            if (r0 == 0) goto L_0x001e
            r1 = 1
            r0.setAccessible(r1)     // Catch: Exception -> 0x001f
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Method> r1 = androidx.appcompat.widget.C0660z.f2372l     // Catch: Exception -> 0x001f
            r1.put(r4, r0)     // Catch: Exception -> 0x001f
        L_0x001e:
            return r0
        L_0x001f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to retrieve TextView#"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "() method"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "ACTVAutoSizeHelper"
            android.util.Log.w(r1, r4, r0)
            r4 = 0
            return r4
    }

    /* renamed from: a */
    private void m1789a(float r4) {
            r3 = this;
            android.widget.TextView r0 = r3.f2381i
            android.text.TextPaint r0 = r0.getPaint()
            float r0 = r0.getTextSize()
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x005a
            android.widget.TextView r0 = r3.f2381i
            android.text.TextPaint r0 = r0.getPaint()
            r0.setTextSize(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 18
            r1 = 0
            if (r4 < r0) goto L_0x0025
            android.widget.TextView r4 = r3.f2381i
            boolean r4 = r4.isInLayout()
            goto L_0x0026
        L_0x0025:
            r4 = 0
        L_0x0026:
            android.widget.TextView r0 = r3.f2381i
            android.text.Layout r0 = r0.getLayout()
            if (r0 == 0) goto L_0x005a
            r3.f2374b = r1
            java.lang.String r0 = "nullLayouts"
            java.lang.reflect.Method r0 = r3.m1777a(r0)     // Catch: Exception -> 0x0040
            if (r0 == 0) goto L_0x0048
            android.widget.TextView r2 = r3.f2381i     // Catch: Exception -> 0x0040
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: Exception -> 0x0040
            r0.invoke(r2, r1)     // Catch: Exception -> 0x0040
            goto L_0x0048
        L_0x0040:
            r0 = move-exception
            java.lang.String r1 = "ACTVAutoSizeHelper"
            java.lang.String r2 = "Failed to invoke TextView#nullLayouts() method"
            android.util.Log.w(r1, r2, r0)
        L_0x0048:
            if (r4 != 0) goto L_0x0050
            android.widget.TextView r4 = r3.f2381i
            r4.requestLayout()
            goto L_0x0055
        L_0x0050:
            android.widget.TextView r4 = r3.f2381i
            r4.forceLayout()
        L_0x0055:
            android.widget.TextView r4 = r3.f2381i
            r4.invalidate()
        L_0x005a:
            return
    }

    /* renamed from: a */
    private void m1788a(float r4, float r5, float r6) {
            r3 = this;
            java.lang.String r0 = "px) is less or equal to (0px)"
            r1 = 0
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x005f
            int r2 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0036
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x001c
            r0 = 1
            r3.f2373a = r0
            r3.f2376d = r4
            r3.f2377e = r5
            r3.f2375c = r6
            r4 = 0
            r3.f2379g = r4
            return
        L_0x001c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "The auto-size step granularity ("
            r5.append(r1)
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x0036:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Maximum auto-size text size ("
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = "px) is less or equal to minimum auto-size "
            r0.append(r5)
            java.lang.String r5 = "text size ("
            r0.append(r5)
            r0.append(r4)
            java.lang.String r4 = "px)"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r6.<init>(r4)
            throw r6
        L_0x005f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "Minimum auto-size text size ("
            r6.append(r1)
            r6.append(r4)
            r6.append(r0)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
    }

    /* renamed from: a */
    private void m1783a(android.content.res.TypedArray r5) {
            r4 = this;
            int r0 = r5.length()
            int[] r1 = new int[r0]
            if (r0 <= 0) goto L_0x001e
            r2 = 0
        L_0x0009:
            if (r2 >= r0) goto L_0x0015
            r3 = -1
            int r3 = r5.getDimensionPixelSize(r2, r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0015:
            int[] r5 = r4.m1776a(r1)
            r4.f2378f = r5
            r4.m1766j()
        L_0x001e:
            return
    }

    /* renamed from: a */
    private boolean m1784a(int r6, android.graphics.RectF r7) {
            r5 = this;
            android.widget.TextView r0 = r5.f2381i
            java.lang.CharSequence r0 = r0.getText()
            android.widget.TextView r1 = r5.f2381i
            android.text.method.TransformationMethod r1 = r1.getTransformationMethod()
            if (r1 == 0) goto L_0x0017
            android.widget.TextView r2 = r5.f2381i
            java.lang.CharSequence r1 = r1.getTransformation(r0, r2)
            if (r1 == 0) goto L_0x0017
            r0 = r1
        L_0x0017:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            r3 = -1
            if (r1 < r2) goto L_0x0025
            android.widget.TextView r1 = r5.f2381i
            int r1 = r1.getMaxLines()
            goto L_0x0026
        L_0x0025:
            r1 = -1
        L_0x0026:
            android.text.TextPaint r2 = r5.f2380h
            if (r2 != 0) goto L_0x0032
            android.text.TextPaint r2 = new android.text.TextPaint
            r2.<init>()
            r5.f2380h = r2
            goto L_0x0035
        L_0x0032:
            r2.reset()
        L_0x0035:
            android.text.TextPaint r2 = r5.f2380h
            android.widget.TextView r4 = r5.f2381i
            android.text.TextPaint r4 = r4.getPaint()
            r2.set(r4)
            android.text.TextPaint r2 = r5.f2380h
            float r6 = (float) r6
            r2.setTextSize(r6)
            android.widget.TextView r6 = r5.f2381i
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_NORMAL
            java.lang.String r4 = "getLayoutAlignment"
            java.lang.Object r6 = r5.m1778a(r6, r4, r2)
            android.text.Layout$Alignment r6 = (android.text.Layout.Alignment) r6
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r2 < r4) goto L_0x0063
            float r2 = r7.right
            int r2 = java.lang.Math.round(r2)
            android.text.StaticLayout r6 = r5.m1779a(r0, r6, r2, r1)
            goto L_0x006d
        L_0x0063:
            float r2 = r7.right
            int r2 = java.lang.Math.round(r2)
            android.text.StaticLayout r6 = r5.m1780a(r0, r6, r2)
        L_0x006d:
            r2 = 0
            r4 = 1
            if (r1 == r3) goto L_0x0087
            int r3 = r6.getLineCount()
            if (r3 > r1) goto L_0x0086
            int r1 = r6.getLineCount()
            int r1 = r1 - r4
            int r1 = r6.getLineEnd(r1)
            int r0 = r0.length()
            if (r1 == r0) goto L_0x0087
        L_0x0086:
            return r2
        L_0x0087:
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r7 = r7.bottom
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0093
            return r2
        L_0x0093:
            return r4
    }

    /* renamed from: a */
    private int[] m1776a(int[] r7) {
            r6 = this;
            int r0 = r7.length
            if (r0 != 0) goto L_0x0004
            return r7
        L_0x0004:
            java.util.Arrays.sort(r7)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 0
        L_0x000e:
            if (r3 >= r0) goto L_0x0028
            r4 = r7[r3]
            if (r4 <= 0) goto L_0x0025
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            int r5 = java.util.Collections.binarySearch(r1, r5)
            if (r5 >= 0) goto L_0x0025
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.add(r4)
        L_0x0025:
            int r3 = r3 + 1
            goto L_0x000e
        L_0x0028:
            int r3 = r1.size()
            if (r0 != r3) goto L_0x002f
            return r7
        L_0x002f:
            int r7 = r1.size()
            int[] r0 = new int[r7]
        L_0x0035:
            if (r2 >= r7) goto L_0x0046
            java.lang.Object r3 = r1.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0[r2] = r3
            int r2 = r2 + 1
            goto L_0x0035
        L_0x0046:
            return r0
    }

    /* renamed from: h */
    private void m1768h() {
            r2 = this;
            r0 = 0
            r2.f2373a = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.f2376d = r1
            r2.f2377e = r1
            r2.f2375c = r1
            int[] r1 = new int[r0]
            r2.f2378f = r1
            r2.f2374b = r0
            return
    }

    /* renamed from: i */
    private boolean m1767i() {
            r6 = this;
            boolean r0 = r6.m1765k()
            r1 = 0
            if (r0 == 0) goto L_0x004d
            int r0 = r6.f2373a
            r2 = 1
            if (r0 != r2) goto L_0x004d
            boolean r0 = r6.f2379g
            if (r0 == 0) goto L_0x0015
            int[] r0 = r6.f2378f
            int r0 = r0.length
            if (r0 != 0) goto L_0x004a
        L_0x0015:
            float r0 = r6.f2376d
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            r3 = 1
        L_0x001d:
            float r4 = r6.f2375c
            float r4 = r4 + r0
            int r4 = java.lang.Math.round(r4)
            float r5 = r6.f2377e
            int r5 = java.lang.Math.round(r5)
            if (r4 > r5) goto L_0x0032
            int r3 = r3 + 1
            float r4 = r6.f2375c
            float r0 = r0 + r4
            goto L_0x001d
        L_0x0032:
            int[] r0 = new int[r3]
            float r4 = r6.f2376d
        L_0x0036:
            if (r1 >= r3) goto L_0x0044
            int r5 = java.lang.Math.round(r4)
            r0[r1] = r5
            float r5 = r6.f2375c
            float r4 = r4 + r5
            int r1 = r1 + 1
            goto L_0x0036
        L_0x0044:
            int[] r0 = r6.m1776a(r0)
            r6.f2378f = r0
        L_0x004a:
            r6.f2374b = r2
            goto L_0x004f
        L_0x004d:
            r6.f2374b = r1
        L_0x004f:
            boolean r0 = r6.f2374b
            return r0
    }

    /* renamed from: j */
    private boolean m1766j() {
            r4 = this;
            int[] r0 = r4.f2378f
            int r0 = r0.length
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x0009
            r3 = 1
            goto L_0x000a
        L_0x0009:
            r3 = 0
        L_0x000a:
            r4.f2379g = r3
            boolean r3 = r4.f2379g
            if (r3 == 0) goto L_0x0023
            r4.f2373a = r2
            int[] r3 = r4.f2378f
            r1 = r3[r1]
            float r1 = (float) r1
            r4.f2376d = r1
            int r0 = r0 - r2
            r0 = r3[r0]
            float r0 = (float) r0
            r4.f2377e = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.f2375c = r0
        L_0x0023:
            boolean r0 = r4.f2379g
            return r0
    }

    /* renamed from: k */
    private boolean m1765k() {
            r1 = this;
            android.widget.TextView r0 = r1.f2381i
            boolean r0 = r0 instanceof androidx.appcompat.widget.C0614k
            r0 = r0 ^ 1
            return r0
    }

    /* renamed from: a */
    void m1790a() {
            r5 = this;
            boolean r0 = r5.m1769g()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r0 = r5.f2374b
            if (r0 == 0) goto L_0x008d
            android.widget.TextView r0 = r5.f2381i
            int r0 = r0.getMeasuredHeight()
            if (r0 <= 0) goto L_0x008c
            android.widget.TextView r0 = r5.f2381i
            int r0 = r0.getMeasuredWidth()
            if (r0 > 0) goto L_0x001c
            goto L_0x008c
        L_0x001c:
            android.widget.TextView r0 = r5.f2381i
            r1 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.String r3 = "getHorizontallyScrolling"
            java.lang.Object r0 = r5.m1778a(r0, r3, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0034
            r0 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0048
        L_0x0034:
            android.widget.TextView r0 = r5.f2381i
            int r0 = r0.getMeasuredWidth()
            android.widget.TextView r2 = r5.f2381i
            int r2 = r2.getTotalPaddingLeft()
            int r0 = r0 - r2
            android.widget.TextView r2 = r5.f2381i
            int r2 = r2.getTotalPaddingRight()
            int r0 = r0 - r2
        L_0x0048:
            android.widget.TextView r2 = r5.f2381i
            int r2 = r2.getHeight()
            android.widget.TextView r3 = r5.f2381i
            int r3 = r3.getCompoundPaddingBottom()
            int r2 = r2 - r3
            android.widget.TextView r3 = r5.f2381i
            int r3 = r3.getCompoundPaddingTop()
            int r2 = r2 - r3
            if (r0 <= 0) goto L_0x008c
            if (r2 > 0) goto L_0x0061
            goto L_0x008c
        L_0x0061:
            android.graphics.RectF r3 = androidx.appcompat.widget.C0660z.f2371k
            monitor-enter(r3)
            android.graphics.RectF r4 = androidx.appcompat.widget.C0660z.f2371k     // Catch: all -> 0x0089
            r4.setEmpty()     // Catch: all -> 0x0089
            android.graphics.RectF r4 = androidx.appcompat.widget.C0660z.f2371k     // Catch: all -> 0x0089
            float r0 = (float) r0     // Catch: all -> 0x0089
            r4.right = r0     // Catch: all -> 0x0089
            android.graphics.RectF r0 = androidx.appcompat.widget.C0660z.f2371k     // Catch: all -> 0x0089
            float r2 = (float) r2     // Catch: all -> 0x0089
            r0.bottom = r2     // Catch: all -> 0x0089
            android.graphics.RectF r0 = androidx.appcompat.widget.C0660z.f2371k     // Catch: all -> 0x0089
            int r0 = r5.m1782a(r0)     // Catch: all -> 0x0089
            float r0 = (float) r0     // Catch: all -> 0x0089
            android.widget.TextView r2 = r5.f2381i     // Catch: all -> 0x0089
            float r2 = r2.getTextSize()     // Catch: all -> 0x0089
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0087
            r5.m1786a(r1, r0)     // Catch: all -> 0x0089
        L_0x0087:
            monitor-exit(r3)     // Catch: all -> 0x0089
            goto L_0x008d
        L_0x0089:
            r0 = move-exception
            monitor-exit(r3)     // Catch: all -> 0x0089
            throw r0
        L_0x008c:
            return
        L_0x008d:
            r0 = 1
            r5.f2374b = r0
            return
    }

    /* renamed from: a */
    void m1787a(int r4) {
            r3 = this;
            boolean r0 = r3.m1765k()
            if (r0 == 0) goto L_0x004b
            if (r4 == 0) goto L_0x0048
            r0 = 1
            if (r4 != r0) goto L_0x0031
            android.content.Context r4 = r3.f2382j
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            r0 = 1094713344(0x41400000, float:12.0)
            r1 = 2
            float r0 = android.util.TypedValue.applyDimension(r1, r0, r4)
            r2 = 1121976320(0x42e00000, float:112.0)
            float r4 = android.util.TypedValue.applyDimension(r1, r2, r4)
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.m1788a(r0, r4, r1)
            boolean r4 = r3.m1767i()
            if (r4 == 0) goto L_0x004b
            r3.m1790a()
            goto L_0x004b
        L_0x0031:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown auto-size text type: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x0048:
            r3.m1768h()
        L_0x004b:
            return
    }

    /* renamed from: a */
    void m1786a(int r2, float r3) {
            r1 = this;
            android.content.Context r0 = r1.f2382j
            if (r0 != 0) goto L_0x0009
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            goto L_0x000d
        L_0x0009:
            android.content.res.Resources r0 = r0.getResources()
        L_0x000d:
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r2 = android.util.TypedValue.applyDimension(r2, r3, r0)
            r1.m1789a(r2)
            return
    }

    /* renamed from: a */
    void m1785a(int r2, int r3, int r4, int r5) {
            r1 = this;
            boolean r0 = r1.m1765k()
            if (r0 == 0) goto L_0x002b
            android.content.Context r0 = r1.f2382j
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r2 = (float) r2
            float r2 = android.util.TypedValue.applyDimension(r5, r2, r0)
            float r3 = (float) r3
            float r3 = android.util.TypedValue.applyDimension(r5, r3, r0)
            float r4 = (float) r4
            float r4 = android.util.TypedValue.applyDimension(r5, r4, r0)
            r1.m1788a(r2, r3, r4)
            boolean r2 = r1.m1767i()
            if (r2 == 0) goto L_0x002b
            r1.m1790a()
        L_0x002b:
            return
    }

    /* renamed from: a */
    void m1781a(android.util.AttributeSet r7, int r8) {
            r6 = this;
            android.content.Context r0 = r6.f2382j
            int[] r1 = p000a.p001a.C0009j.AppCompatTextView
            r2 = 0
            android.content.res.TypedArray r7 = r0.obtainStyledAttributes(r7, r1, r8, r2)
            int r8 = p000a.p001a.C0009j.AppCompatTextView_autoSizeTextType
            boolean r8 = r7.hasValue(r8)
            if (r8 == 0) goto L_0x0019
            int r8 = p000a.p001a.C0009j.AppCompatTextView_autoSizeTextType
            int r8 = r7.getInt(r8, r2)
            r6.f2373a = r8
        L_0x0019:
            int r8 = p000a.p001a.C0009j.AppCompatTextView_autoSizeStepGranularity
            boolean r8 = r7.hasValue(r8)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r8 == 0) goto L_0x002a
            int r8 = p000a.p001a.C0009j.AppCompatTextView_autoSizeStepGranularity
            float r8 = r7.getDimension(r8, r0)
            goto L_0x002c
        L_0x002a:
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x002c:
            int r1 = p000a.p001a.C0009j.AppCompatTextView_autoSizeMinTextSize
            boolean r1 = r7.hasValue(r1)
            if (r1 == 0) goto L_0x003b
            int r1 = p000a.p001a.C0009j.AppCompatTextView_autoSizeMinTextSize
            float r1 = r7.getDimension(r1, r0)
            goto L_0x003d
        L_0x003b:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x003d:
            int r3 = p000a.p001a.C0009j.AppCompatTextView_autoSizeMaxTextSize
            boolean r3 = r7.hasValue(r3)
            if (r3 == 0) goto L_0x004c
            int r3 = p000a.p001a.C0009j.AppCompatTextView_autoSizeMaxTextSize
            float r3 = r7.getDimension(r3, r0)
            goto L_0x004e
        L_0x004c:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x004e:
            int r4 = p000a.p001a.C0009j.AppCompatTextView_autoSizePresetSizes
            boolean r4 = r7.hasValue(r4)
            if (r4 == 0) goto L_0x006c
            int r4 = p000a.p001a.C0009j.AppCompatTextView_autoSizePresetSizes
            int r4 = r7.getResourceId(r4, r2)
            if (r4 <= 0) goto L_0x006c
            android.content.res.Resources r5 = r7.getResources()
            android.content.res.TypedArray r4 = r5.obtainTypedArray(r4)
            r6.m1783a(r4)
            r4.recycle()
        L_0x006c:
            r7.recycle()
            boolean r7 = r6.m1765k()
            if (r7 == 0) goto L_0x00aa
            int r7 = r6.f2373a
            r2 = 1
            if (r7 != r2) goto L_0x00ac
            boolean r7 = r6.f2379g
            if (r7 != 0) goto L_0x00a6
            android.content.Context r7 = r6.f2382j
            android.content.res.Resources r7 = r7.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            r2 = 2
            int r4 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x0093
            r1 = 1094713344(0x41400000, float:12.0)
            float r1 = android.util.TypedValue.applyDimension(r2, r1, r7)
        L_0x0093:
            int r4 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x009d
            r3 = 1121976320(0x42e00000, float:112.0)
            float r3 = android.util.TypedValue.applyDimension(r2, r3, r7)
        L_0x009d:
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x00a3
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x00a3:
            r6.m1788a(r1, r3, r8)
        L_0x00a6:
            r6.m1767i()
            goto L_0x00ac
        L_0x00aa:
            r6.f2373a = r2
        L_0x00ac:
            return
    }

    /* renamed from: a */
    void m1775a(int[] r6, int r7) {
            r5 = this;
            boolean r0 = r5.m1765k()
            if (r0 == 0) goto L_0x0062
            int r0 = r6.length
            r1 = 0
            if (r0 <= 0) goto L_0x0057
            int[] r2 = new int[r0]
            if (r7 != 0) goto L_0x0013
            int[] r2 = java.util.Arrays.copyOf(r6, r0)
            goto L_0x002f
        L_0x0013:
            android.content.Context r3 = r5.f2382j
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
        L_0x001d:
            if (r1 >= r0) goto L_0x002f
            r4 = r6[r1]
            float r4 = (float) r4
            float r4 = android.util.TypedValue.applyDimension(r7, r4, r3)
            int r4 = java.lang.Math.round(r4)
            r2[r1] = r4
            int r1 = r1 + 1
            goto L_0x001d
        L_0x002f:
            int[] r7 = r5.m1776a(r2)
            r5.f2378f = r7
            boolean r7 = r5.m1766j()
            if (r7 == 0) goto L_0x003c
            goto L_0x0059
        L_0x003c:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "None of the preset sizes is valid: "
            r0.append(r1)
            java.lang.String r6 = java.util.Arrays.toString(r6)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x0057:
            r5.f2379g = r1
        L_0x0059:
            boolean r6 = r5.m1767i()
            if (r6 == 0) goto L_0x0062
            r5.m1790a()
        L_0x0062:
            return
    }

    /* renamed from: b */
    int m1774b() {
            r1 = this;
            float r0 = r1.f2377e
            int r0 = java.lang.Math.round(r0)
            return r0
    }

    /* renamed from: c */
    int m1773c() {
            r1 = this;
            float r0 = r1.f2376d
            int r0 = java.lang.Math.round(r0)
            return r0
    }

    /* renamed from: d */
    int m1772d() {
            r1 = this;
            float r0 = r1.f2375c
            int r0 = java.lang.Math.round(r0)
            return r0
    }

    /* renamed from: e */
    int[] m1771e() {
            r1 = this;
            int[] r0 = r1.f2378f
            return r0
    }

    /* renamed from: f */
    int m1770f() {
            r1 = this;
            int r0 = r1.f2373a
            return r0
    }

    /* renamed from: g */
    boolean m1769g() {
            r1 = this;
            boolean r0 = r1.m1765k()
            if (r0 == 0) goto L_0x000c
            int r0 = r1.f2373a
            if (r0 == 0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            return r0
    }
}
