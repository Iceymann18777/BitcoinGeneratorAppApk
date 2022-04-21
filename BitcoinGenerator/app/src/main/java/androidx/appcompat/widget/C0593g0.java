package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.g0 */
/* loaded from: classes.dex */
public class C0593g0 extends android.view.ViewGroup {

    /* renamed from: b */
    private boolean f2109b;

    /* renamed from: c */
    private int f2110c;

    /* renamed from: d */
    private int f2111d;

    /* renamed from: e */
    private int f2112e;

    /* renamed from: f */
    private int f2113f;

    /* renamed from: g */
    private int f2114g;

    /* renamed from: h */
    private float f2115h;

    /* renamed from: i */
    private boolean f2116i;

    /* renamed from: j */
    private int[] f2117j;

    /* renamed from: k */
    private int[] f2118k;

    /* renamed from: l */
    private android.graphics.drawable.Drawable f2119l;

    /* renamed from: m */
    private int f2120m;

    /* renamed from: n */
    private int f2121n;

    /* renamed from: o */
    private int f2122o;

    /* renamed from: p */
    private int f2123p;

    /* renamed from: androidx.appcompat.widget.g0$a */
    /* loaded from: classes.dex */
    public static class C0594a extends android.view.ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public float f2124a;

        /* renamed from: b */
        public int f2125b;

        public C0594a(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = -1
                r0.f2125b = r1
                r1 = 0
                r0.f2124a = r1
                return
        }

        public C0594a(android.content.Context r3, android.util.AttributeSet r4) {
                r2 = this;
                r2.<init>(r3, r4)
                r0 = -1
                r2.f2125b = r0
                int[] r1 = p000a.p001a.C0009j.LinearLayoutCompat_Layout
                android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r1)
                int r4 = p000a.p001a.C0009j.LinearLayoutCompat_Layout_android_layout_weight
                r1 = 0
                float r4 = r3.getFloat(r4, r1)
                r2.f2124a = r4
                int r4 = p000a.p001a.C0009j.LinearLayoutCompat_Layout_android_layout_gravity
                int r4 = r3.getInt(r4, r0)
                r2.f2125b = r4
                r3.recycle()
                return
        }

        public C0594a(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = -1
                r0.f2125b = r1
                return
        }
    }

    public C0593g0(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public C0593g0(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public C0593g0(android.content.Context r5, android.util.AttributeSet r6, int r7) {
            r4 = this;
            r4.<init>(r5, r6, r7)
            r0 = 1
            r4.f2109b = r0
            r1 = -1
            r4.f2110c = r1
            r2 = 0
            r4.f2111d = r2
            r3 = 8388659(0x800033, float:1.1755015E-38)
            r4.f2113f = r3
            int[] r3 = p000a.p001a.C0009j.LinearLayoutCompat
            androidx.appcompat.widget.t0 r5 = androidx.appcompat.widget.C0638t0.m1900a(r5, r6, r3, r7, r2)
            int r6 = p000a.p001a.C0009j.LinearLayoutCompat_android_orientation
            int r6 = r5.m1894d(r6, r1)
            if (r6 < 0) goto L_0x0022
            r4.setOrientation(r6)
        L_0x0022:
            int r6 = p000a.p001a.C0009j.LinearLayoutCompat_android_gravity
            int r6 = r5.m1894d(r6, r1)
            if (r6 < 0) goto L_0x002d
            r4.setGravity(r6)
        L_0x002d:
            int r6 = p000a.p001a.C0009j.LinearLayoutCompat_android_baselineAligned
            boolean r6 = r5.m1903a(r6, r0)
            if (r6 != 0) goto L_0x0038
            r4.setBaselineAligned(r6)
        L_0x0038:
            int r6 = p000a.p001a.C0009j.LinearLayoutCompat_android_weightSum
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r6 = r5.m1906a(r6, r7)
            r4.f2115h = r6
            int r6 = p000a.p001a.C0009j.LinearLayoutCompat_android_baselineAlignedChildIndex
            int r6 = r5.m1894d(r6, r1)
            r4.f2110c = r6
            int r6 = p000a.p001a.C0009j.LinearLayoutCompat_measureWithLargestChild
            boolean r6 = r5.m1903a(r6, r2)
            r4.f2116i = r6
            int r6 = p000a.p001a.C0009j.LinearLayoutCompat_divider
            android.graphics.drawable.Drawable r6 = r5.m1899b(r6)
            r4.setDividerDrawable(r6)
            int r6 = p000a.p001a.C0009j.LinearLayoutCompat_showDividers
            int r6 = r5.m1894d(r6, r2)
            r4.f2122o = r6
            int r6 = p000a.p001a.C0009j.LinearLayoutCompat_dividerPadding
            int r6 = r5.m1896c(r6, r2)
            r4.f2123p = r6
            r5.m1908a()
            return
    }

    /* renamed from: a */
    private void m2062a(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            int r4 = r4 + r2
            int r5 = r5 + r3
            r1.layout(r2, r3, r4, r5)
            return
    }

    /* renamed from: c */
    private void m2053c(int r11, int r12) {
            r10 = this;
            int r0 = r10.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r1 = 0
        L_0x000b:
            if (r1 >= r11) goto L_0x003a
            android.view.View r3 = r10.m2069a(r1)
            int r2 = r3.getVisibility()
            r4 = 8
            if (r2 == r4) goto L_0x0037
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            r8 = r2
            androidx.appcompat.widget.g0$a r8 = (androidx.appcompat.widget.C0593g0.C0594a) r8
            int r2 = r8.height
            r4 = -1
            if (r2 != r4) goto L_0x0037
            int r9 = r8.width
            int r2 = r3.getMeasuredWidth()
            r8.width = r2
            r5 = 0
            r7 = 0
            r2 = r10
            r4 = r12
            r6 = r0
            r2.measureChildWithMargins(r3, r4, r5, r6, r7)
            r8.width = r9
        L_0x0037:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x003a:
            return
    }

    /* renamed from: d */
    private void m2052d(int r11, int r12) {
            r10 = this;
            int r0 = r10.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r1 = 0
        L_0x000b:
            if (r1 >= r11) goto L_0x003a
            android.view.View r3 = r10.m2069a(r1)
            int r2 = r3.getVisibility()
            r4 = 8
            if (r2 == r4) goto L_0x0037
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            r8 = r2
            androidx.appcompat.widget.g0$a r8 = (androidx.appcompat.widget.C0593g0.C0594a) r8
            int r2 = r8.width
            r4 = -1
            if (r2 != r4) goto L_0x0037
            int r9 = r8.height
            int r2 = r3.getMeasuredHeight()
            r8.height = r2
            r5 = 0
            r7 = 0
            r2 = r10
            r4 = r0
            r6 = r12
            r2.measureChildWithMargins(r3, r4, r5, r6, r7)
            r8.height = r9
        L_0x0037:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x003a:
            return
    }

    /* renamed from: a */
    int m2064a(android.view.View r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* renamed from: a */
    int m2063a(android.view.View r1, int r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* renamed from: a */
    android.view.View m2069a(int r1) {
            r0 = this;
            android.view.View r1 = r0.getChildAt(r1)
            return r1
    }

    /* renamed from: a */
    void m2068a(int r39, int r40) {
            r38 = this;
            r7 = r38
            r8 = r39
            r9 = r40
            r10 = 0
            r7.f2114g = r10
            int r11 = r38.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r39)
            int r13 = android.view.View.MeasureSpec.getMode(r40)
            int[] r0 = r7.f2117j
            r14 = 4
            if (r0 == 0) goto L_0x001e
            int[] r0 = r7.f2118k
            if (r0 != 0) goto L_0x0026
        L_0x001e:
            int[] r0 = new int[r14]
            r7.f2117j = r0
            int[] r0 = new int[r14]
            r7.f2118k = r0
        L_0x0026:
            int[] r15 = r7.f2117j
            int[] r6 = r7.f2118k
            r16 = 3
            r5 = -1
            r15[r16] = r5
            r17 = 2
            r15[r17] = r5
            r18 = 1
            r15[r18] = r5
            r15[r10] = r5
            r6[r16] = r5
            r6[r17] = r5
            r6[r18] = r5
            r6[r10] = r5
            boolean r4 = r7.f2109b
            boolean r3 = r7.f2116i
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 != r2) goto L_0x004c
            r19 = 1
            goto L_0x004e
        L_0x004c:
            r19 = 0
        L_0x004e:
            r20 = 0
            r0 = 0
            r1 = 0
            r14 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 1
            r28 = 0
        L_0x0061:
            r29 = r6
            r5 = 8
            if (r1 >= r11) goto L_0x01fc
            android.view.View r6 = r7.m2069a(r1)
            if (r6 != 0) goto L_0x007c
            int r5 = r7.f2114g
            int r6 = r7.m2054c(r1)
            int r5 = r5 + r6
            r7.f2114g = r5
        L_0x0076:
            r33 = r3
            r37 = r4
            goto L_0x01ec
        L_0x007c:
            int r10 = r6.getVisibility()
            if (r10 != r5) goto L_0x0088
            int r5 = r7.m2063a(r6, r1)
            int r1 = r1 + r5
            goto L_0x0076
        L_0x0088:
            boolean r5 = r7.m2060b(r1)
            if (r5 == 0) goto L_0x0095
            int r5 = r7.f2114g
            int r10 = r7.f2120m
            int r5 = r5 + r10
            r7.f2114g = r5
        L_0x0095:
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            r10 = r5
            androidx.appcompat.widget.g0$a r10 = (androidx.appcompat.widget.C0593g0.C0594a) r10
            float r5 = r10.f2124a
            float r32 = r0 + r5
            if (r12 != r2) goto L_0x00e7
            int r0 = r10.width
            if (r0 != 0) goto L_0x00e7
            float r0 = r10.f2124a
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e7
            int r0 = r7.f2114g
            if (r19 == 0) goto L_0x00b7
            int r5 = r10.leftMargin
            int r2 = r10.rightMargin
            int r5 = r5 + r2
            int r0 = r0 + r5
            goto L_0x00c1
        L_0x00b7:
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r5 = r10.rightMargin
            int r2 = r2 + r5
            int r0 = java.lang.Math.max(r0, r2)
        L_0x00c1:
            r7.f2114g = r0
            if (r4 == 0) goto L_0x00d8
            r0 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r6.measure(r2, r2)
            r35 = r1
            r33 = r3
            r37 = r4
            r3 = r6
            r31 = -2
            goto L_0x0161
        L_0x00d8:
            r35 = r1
            r33 = r3
            r37 = r4
            r3 = r6
            r1 = 1073741824(0x40000000, float:2.0)
            r24 = 1
            r31 = -2
            goto L_0x0163
        L_0x00e7:
            int r0 = r10.width
            if (r0 != 0) goto L_0x00f6
            float r0 = r10.f2124a
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f6
            r5 = -2
            r10.width = r5
            r2 = 0
            goto L_0x00f9
        L_0x00f6:
            r5 = -2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00f9:
            int r0 = (r32 > r20 ? 1 : (r32 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x0102
            int r0 = r7.f2114g
            r30 = r0
            goto L_0x0104
        L_0x0102:
            r30 = 0
        L_0x0104:
            r34 = 0
            r0 = r38
            r35 = r1
            r1 = r6
            r36 = r2
            r2 = r35
            r33 = r3
            r3 = r39
            r37 = r4
            r4 = r30
            r9 = -1
            r30 = -2
            r5 = r40
            r30 = r6
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r31 = -2
            r6 = r34
            r0.m2061a(r1, r2, r3, r4, r5, r6)
            r0 = r36
            if (r0 == r9) goto L_0x012d
            r10.width = r0
        L_0x012d:
            int r0 = r30.getMeasuredWidth()
            if (r19 == 0) goto L_0x0144
            int r1 = r7.f2114g
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r3 = r10.rightMargin
            int r2 = r2 + r3
            r3 = r30
            int r4 = r7.m2055b(r3)
            int r2 = r2 + r4
            int r1 = r1 + r2
            goto L_0x0159
        L_0x0144:
            r3 = r30
            int r1 = r7.f2114g
            int r2 = r1 + r0
            int r4 = r10.leftMargin
            int r2 = r2 + r4
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r7.m2055b(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
        L_0x0159:
            r7.f2114g = r1
            if (r33 == 0) goto L_0x0161
            int r14 = java.lang.Math.max(r0, r14)
        L_0x0161:
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x0163:
            if (r13 == r1) goto L_0x016e
            int r0 = r10.height
            r2 = -1
            if (r0 != r2) goto L_0x016e
            r0 = 1
            r28 = 1
            goto L_0x016f
        L_0x016e:
            r0 = 0
        L_0x016f:
            int r2 = r10.topMargin
            int r4 = r10.bottomMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredHeight()
            int r4 = r4 + r2
            int r5 = r3.getMeasuredState()
            r6 = r26
            int r5 = android.view.View.combineMeasuredStates(r6, r5)
            if (r37 == 0) goto L_0x01ae
            int r6 = r3.getBaseline()
            r9 = -1
            if (r6 == r9) goto L_0x01ae
            int r9 = r10.f2125b
            if (r9 >= 0) goto L_0x0192
            int r9 = r7.f2113f
        L_0x0192:
            r9 = r9 & 112(0x70, float:1.57E-43)
            r25 = 4
            int r9 = r9 >> 4
            r9 = r9 & (-2)
            int r9 = r9 >> 1
            r1 = r15[r9]
            int r1 = java.lang.Math.max(r1, r6)
            r15[r9] = r1
            r1 = r29[r9]
            int r6 = r4 - r6
            int r1 = java.lang.Math.max(r1, r6)
            r29[r9] = r1
        L_0x01ae:
            r1 = r21
            int r1 = java.lang.Math.max(r1, r4)
            if (r27 == 0) goto L_0x01bd
            int r6 = r10.height
            r9 = -1
            if (r6 != r9) goto L_0x01bd
            r6 = 1
            goto L_0x01be
        L_0x01bd:
            r6 = 0
        L_0x01be:
            float r9 = r10.f2124a
            int r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r9 <= 0) goto L_0x01cf
            if (r0 == 0) goto L_0x01c7
            goto L_0x01c8
        L_0x01c7:
            r2 = r4
        L_0x01c8:
            r10 = r23
            int r23 = java.lang.Math.max(r10, r2)
            goto L_0x01dc
        L_0x01cf:
            r10 = r23
            if (r0 == 0) goto L_0x01d4
            r4 = r2
        L_0x01d4:
            r2 = r22
            int r22 = java.lang.Math.max(r2, r4)
            r23 = r10
        L_0x01dc:
            r10 = r35
            int r0 = r7.m2063a(r3, r10)
            int r0 = r0 + r10
            r21 = r1
            r26 = r5
            r27 = r6
            r1 = r0
            r0 = r32
        L_0x01ec:
            int r1 = r1 + 1
            r9 = r40
            r6 = r29
            r3 = r33
            r4 = r37
            r2 = 1073741824(0x40000000, float:2.0)
            r5 = -1
            r10 = 0
            goto L_0x0061
        L_0x01fc:
            r33 = r3
            r37 = r4
            r1 = r21
            r2 = r22
            r10 = r23
            r6 = r26
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r31 = -2
            int r3 = r7.f2114g
            if (r3 <= 0) goto L_0x021d
            boolean r3 = r7.m2060b(r11)
            if (r3 == 0) goto L_0x021d
            int r3 = r7.f2114g
            int r4 = r7.f2120m
            int r3 = r3 + r4
            r7.f2114g = r3
        L_0x021d:
            r3 = r15[r18]
            r4 = -1
            if (r3 != r4) goto L_0x0233
            r3 = 0
            r5 = r15[r3]
            if (r5 != r4) goto L_0x0233
            r3 = r15[r17]
            if (r3 != r4) goto L_0x0233
            r3 = r15[r16]
            if (r3 == r4) goto L_0x0230
            goto L_0x0233
        L_0x0230:
            r23 = r6
            goto L_0x0264
        L_0x0233:
            r3 = r15[r16]
            r4 = 0
            r5 = r15[r4]
            r9 = r15[r18]
            r4 = r15[r17]
            int r4 = java.lang.Math.max(r9, r4)
            int r4 = java.lang.Math.max(r5, r4)
            int r3 = java.lang.Math.max(r3, r4)
            r4 = r29[r16]
            r5 = 0
            r9 = r29[r5]
            r5 = r29[r18]
            r23 = r6
            r6 = r29[r17]
            int r5 = java.lang.Math.max(r5, r6)
            int r5 = java.lang.Math.max(r9, r5)
            int r4 = java.lang.Math.max(r4, r5)
            int r3 = r3 + r4
            int r1 = java.lang.Math.max(r1, r3)
        L_0x0264:
            if (r33 == 0) goto L_0x02c5
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == r3) goto L_0x026c
            if (r12 != 0) goto L_0x02c5
        L_0x026c:
            r3 = 0
            r7.f2114g = r3
            r3 = 0
        L_0x0270:
            if (r3 >= r11) goto L_0x02c5
            android.view.View r4 = r7.m2069a(r3)
            if (r4 != 0) goto L_0x0282
            int r4 = r7.f2114g
            int r5 = r7.m2054c(r3)
            int r4 = r4 + r5
            r7.f2114g = r4
            goto L_0x028f
        L_0x0282:
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 != r6) goto L_0x0292
            int r4 = r7.m2063a(r4, r3)
            int r3 = r3 + r4
        L_0x028f:
            r22 = r1
            goto L_0x02c0
        L_0x0292:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.appcompat.widget.g0$a r5 = (androidx.appcompat.widget.C0593g0.C0594a) r5
            int r6 = r7.f2114g
            if (r19 == 0) goto L_0x02ab
            int r9 = r5.leftMargin
            int r9 = r9 + r14
            int r5 = r5.rightMargin
            int r9 = r9 + r5
            int r4 = r7.m2055b(r4)
            int r9 = r9 + r4
            int r6 = r6 + r9
            r7.f2114g = r6
            goto L_0x028f
        L_0x02ab:
            int r9 = r6 + r14
            r22 = r1
            int r1 = r5.leftMargin
            int r9 = r9 + r1
            int r1 = r5.rightMargin
            int r9 = r9 + r1
            int r1 = r7.m2055b(r4)
            int r9 = r9 + r1
            int r1 = java.lang.Math.max(r6, r9)
            r7.f2114g = r1
        L_0x02c0:
            int r3 = r3 + 1
            r1 = r22
            goto L_0x0270
        L_0x02c5:
            r22 = r1
            int r1 = r7.f2114g
            int r3 = r38.getPaddingLeft()
            int r4 = r38.getPaddingRight()
            int r3 = r3 + r4
            int r1 = r1 + r3
            r7.f2114g = r1
            int r1 = r7.f2114g
            int r3 = r38.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r3)
            r3 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r8, r3)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r1
            int r4 = r7.f2114g
            int r3 = r3 - r4
            if (r24 != 0) goto L_0x0338
            if (r3 == 0) goto L_0x02f4
            int r5 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x02f4
            goto L_0x0338
        L_0x02f4:
            int r0 = java.lang.Math.max(r2, r10)
            if (r33 == 0) goto L_0x0330
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x0330
            r2 = 0
        L_0x02ff:
            if (r2 >= r11) goto L_0x0330
            android.view.View r3 = r7.m2069a(r2)
            if (r3 == 0) goto L_0x032d
            int r5 = r3.getVisibility()
            r6 = 8
            if (r5 != r6) goto L_0x0310
            goto L_0x032d
        L_0x0310:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.appcompat.widget.g0$a r5 = (androidx.appcompat.widget.C0593g0.C0594a) r5
            float r5 = r5.f2124a
            int r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x032d
            r5 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r5)
            int r9 = r3.getMeasuredHeight()
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r5)
            r3.measure(r6, r9)
        L_0x032d:
            int r2 = r2 + 1
            goto L_0x02ff
        L_0x0330:
            r3 = r40
            r26 = r11
            r2 = r22
            goto L_0x04cf
        L_0x0338:
            float r5 = r7.f2115h
            int r6 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r6 <= 0) goto L_0x033f
            r0 = r5
        L_0x033f:
            r5 = -1
            r15[r16] = r5
            r15[r17] = r5
            r15[r18] = r5
            r6 = 0
            r15[r6] = r5
            r29[r16] = r5
            r29[r17] = r5
            r29[r18] = r5
            r29[r6] = r5
            r7.f2114g = r6
            r10 = r2
            r9 = r23
            r6 = -1
            r2 = r0
            r0 = 0
        L_0x0359:
            if (r0 >= r11) goto L_0x0476
            android.view.View r14 = r7.m2069a(r0)
            if (r14 == 0) goto L_0x0465
            int r5 = r14.getVisibility()
            r4 = 8
            if (r5 != r4) goto L_0x036b
            goto L_0x0465
        L_0x036b:
            android.view.ViewGroup$LayoutParams r5 = r14.getLayoutParams()
            androidx.appcompat.widget.g0$a r5 = (androidx.appcompat.widget.C0593g0.C0594a) r5
            float r4 = r5.f2124a
            int r23 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r23 <= 0) goto L_0x03cb
            float r8 = (float) r3
            float r8 = r8 * r4
            float r8 = r8 / r2
            int r8 = (int) r8
            float r2 = r2 - r4
            int r3 = r3 - r8
            int r4 = r38.getPaddingTop()
            int r23 = r38.getPaddingBottom()
            int r4 = r4 + r23
            r23 = r2
            int r2 = r5.topMargin
            int r4 = r4 + r2
            int r2 = r5.bottomMargin
            int r4 = r4 + r2
            int r2 = r5.height
            r24 = r3
            r26 = r11
            r11 = -1
            r3 = r40
            int r2 = android.view.ViewGroup.getChildMeasureSpec(r3, r4, r2)
            int r4 = r5.width
            if (r4 != 0) goto L_0x03a9
            r4 = 1073741824(0x40000000, float:2.0)
            if (r12 == r4) goto L_0x03a6
            goto L_0x03ab
        L_0x03a6:
            if (r8 <= 0) goto L_0x03b3
            goto L_0x03b4
        L_0x03a9:
            r4 = 1073741824(0x40000000, float:2.0)
        L_0x03ab:
            int r30 = r14.getMeasuredWidth()
            int r8 = r30 + r8
            if (r8 >= 0) goto L_0x03b4
        L_0x03b3:
            r8 = 0
        L_0x03b4:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r4)
            r14.measure(r8, r2)
            int r2 = r14.getMeasuredState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r4
            int r9 = android.view.View.combineMeasuredStates(r9, r2)
            r2 = r23
            r4 = r24
            goto L_0x03d1
        L_0x03cb:
            r4 = r3
            r26 = r11
            r11 = -1
            r3 = r40
        L_0x03d1:
            int r8 = r7.f2114g
            if (r19 == 0) goto L_0x03ee
            int r23 = r14.getMeasuredWidth()
            int r11 = r5.leftMargin
            int r23 = r23 + r11
            int r11 = r5.rightMargin
            int r23 = r23 + r11
            int r11 = r7.m2055b(r14)
            int r23 = r23 + r11
            int r8 = r8 + r23
            r7.f2114g = r8
            r23 = r2
            goto L_0x0406
        L_0x03ee:
            int r11 = r14.getMeasuredWidth()
            int r11 = r11 + r8
            r23 = r2
            int r2 = r5.leftMargin
            int r11 = r11 + r2
            int r2 = r5.rightMargin
            int r11 = r11 + r2
            int r2 = r7.m2055b(r14)
            int r11 = r11 + r2
            int r2 = java.lang.Math.max(r8, r11)
            r7.f2114g = r2
        L_0x0406:
            r2 = 1073741824(0x40000000, float:2.0)
            if (r13 == r2) goto L_0x0411
            int r2 = r5.height
            r8 = -1
            if (r2 != r8) goto L_0x0411
            r2 = 1
            goto L_0x0412
        L_0x0411:
            r2 = 0
        L_0x0412:
            int r8 = r5.topMargin
            int r11 = r5.bottomMargin
            int r8 = r8 + r11
            int r11 = r14.getMeasuredHeight()
            int r11 = r11 + r8
            int r6 = java.lang.Math.max(r6, r11)
            if (r2 == 0) goto L_0x0423
            goto L_0x0424
        L_0x0423:
            r8 = r11
        L_0x0424:
            int r2 = java.lang.Math.max(r10, r8)
            if (r27 == 0) goto L_0x0431
            int r8 = r5.height
            r10 = -1
            if (r8 != r10) goto L_0x0432
            r8 = 1
            goto L_0x0433
        L_0x0431:
            r10 = -1
        L_0x0432:
            r8 = 0
        L_0x0433:
            if (r37 == 0) goto L_0x045d
            int r14 = r14.getBaseline()
            if (r14 == r10) goto L_0x045d
            int r5 = r5.f2125b
            if (r5 >= 0) goto L_0x0441
            int r5 = r7.f2113f
        L_0x0441:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r24 = 4
            int r5 = r5 >> 4
            r5 = r5 & (-2)
            int r5 = r5 >> 1
            r10 = r15[r5]
            int r10 = java.lang.Math.max(r10, r14)
            r15[r5] = r10
            r10 = r29[r5]
            int r11 = r11 - r14
            int r10 = java.lang.Math.max(r10, r11)
            r29[r5] = r10
            goto L_0x045f
        L_0x045d:
            r24 = 4
        L_0x045f:
            r10 = r2
            r27 = r8
            r2 = r23
            goto L_0x046c
        L_0x0465:
            r4 = r3
            r26 = r11
            r24 = 4
            r3 = r40
        L_0x046c:
            int r0 = r0 + 1
            r8 = r39
            r3 = r4
            r11 = r26
            r5 = -1
            goto L_0x0359
        L_0x0476:
            r3 = r40
            r26 = r11
            int r0 = r7.f2114g
            int r2 = r38.getPaddingLeft()
            int r4 = r38.getPaddingRight()
            int r2 = r2 + r4
            int r0 = r0 + r2
            r7.f2114g = r0
            r0 = r15[r18]
            r2 = -1
            if (r0 != r2) goto L_0x049d
            r0 = 0
            r4 = r15[r0]
            if (r4 != r2) goto L_0x049d
            r0 = r15[r17]
            if (r0 != r2) goto L_0x049d
            r0 = r15[r16]
            if (r0 == r2) goto L_0x049b
            goto L_0x049d
        L_0x049b:
            r0 = r6
            goto L_0x04cb
        L_0x049d:
            r0 = r15[r16]
            r2 = 0
            r4 = r15[r2]
            r5 = r15[r18]
            r8 = r15[r17]
            int r5 = java.lang.Math.max(r5, r8)
            int r4 = java.lang.Math.max(r4, r5)
            int r0 = java.lang.Math.max(r0, r4)
            r4 = r29[r16]
            r2 = r29[r2]
            r5 = r29[r18]
            r8 = r29[r17]
            int r5 = java.lang.Math.max(r5, r8)
            int r2 = java.lang.Math.max(r2, r5)
            int r2 = java.lang.Math.max(r4, r2)
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r6, r0)
        L_0x04cb:
            r2 = r0
            r23 = r9
            r0 = r10
        L_0x04cf:
            if (r27 != 0) goto L_0x04d6
            r4 = 1073741824(0x40000000, float:2.0)
            if (r13 == r4) goto L_0x04d6
            goto L_0x04d7
        L_0x04d6:
            r0 = r2
        L_0x04d7:
            int r2 = r38.getPaddingTop()
            int r4 = r38.getPaddingBottom()
            int r2 = r2 + r4
            int r0 = r0 + r2
            int r2 = r38.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r2)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r23 & r2
            r1 = r1 | r2
            int r2 = r23 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r3, r2)
            r7.setMeasuredDimension(r1, r0)
            if (r28 == 0) goto L_0x0500
            r0 = r39
            r1 = r26
            r7.m2053c(r1, r0)
        L_0x0500:
            return
    }

    /* renamed from: a */
    void m2067a(int r25, int r26, int r27, int r28) {
            r24 = this;
            r6 = r24
            boolean r0 = androidx.appcompat.widget.C0661z0.m1764a(r24)
            int r7 = r24.getPaddingTop()
            int r1 = r28 - r26
            int r2 = r24.getPaddingBottom()
            int r8 = r1 - r2
            int r1 = r1 - r7
            int r2 = r24.getPaddingBottom()
            int r9 = r1 - r2
            int r10 = r24.getVirtualChildCount()
            int r1 = r6.f2113f
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r1
            r11 = r1 & 112(0x70, float:1.57E-43)
            boolean r12 = r6.f2109b
            int[] r13 = r6.f2117j
            int[] r14 = r6.f2118k
            int r1 = p000a.p018g.p029l.C0216r.m3411j(r24)
            int r1 = p000a.p018g.p029l.C0200c.m3490a(r2, r1)
            r15 = 2
            r5 = 1
            if (r1 == r5) goto L_0x004b
            r2 = 5
            if (r1 == r2) goto L_0x003f
            int r1 = r24.getPaddingLeft()
            goto L_0x0056
        L_0x003f:
            int r1 = r24.getPaddingLeft()
            int r1 = r1 + r27
            int r1 = r1 - r25
            int r2 = r6.f2114g
            int r1 = r1 - r2
            goto L_0x0056
        L_0x004b:
            int r1 = r24.getPaddingLeft()
            int r2 = r27 - r25
            int r3 = r6.f2114g
            int r2 = r2 - r3
            int r2 = r2 / r15
            int r1 = r1 + r2
        L_0x0056:
            r2 = 0
            if (r0 == 0) goto L_0x0060
            int r0 = r10 + (-1)
            r16 = r0
            r17 = -1
            goto L_0x0064
        L_0x0060:
            r16 = 0
            r17 = 1
        L_0x0064:
            r3 = 0
        L_0x0065:
            if (r3 >= r10) goto L_0x0140
            int r0 = r17 * r3
            int r2 = r16 + r0
            android.view.View r0 = r6.m2069a(r2)
            if (r0 != 0) goto L_0x0078
            int r0 = r6.m2054c(r2)
            int r1 = r1 + r0
            goto L_0x012a
        L_0x0078:
            int r5 = r0.getVisibility()
            r15 = 8
            if (r5 == r15) goto L_0x0128
            int r15 = r0.getMeasuredWidth()
            int r5 = r0.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r18 = r0.getLayoutParams()
            r4 = r18
            androidx.appcompat.widget.g0$a r4 = (androidx.appcompat.widget.C0593g0.C0594a) r4
            r18 = r3
            if (r12 == 0) goto L_0x00a0
            int r3 = r4.height
            r19 = r10
            r10 = -1
            if (r3 == r10) goto L_0x00a2
            int r3 = r0.getBaseline()
            goto L_0x00a3
        L_0x00a0:
            r19 = r10
        L_0x00a2:
            r3 = -1
        L_0x00a3:
            int r10 = r4.f2125b
            if (r10 >= 0) goto L_0x00a8
            r10 = r11
        L_0x00a8:
            r10 = r10 & 112(0x70, float:1.57E-43)
            r20 = r11
            r11 = 16
            if (r10 == r11) goto L_0x00e4
            r11 = 48
            if (r10 == r11) goto L_0x00d4
            r11 = 80
            if (r10 == r11) goto L_0x00bd
            r3 = r7
            r11 = -1
        L_0x00ba:
            r21 = 1
            goto L_0x00f2
        L_0x00bd:
            int r10 = r8 - r5
            int r11 = r4.bottomMargin
            int r10 = r10 - r11
            r11 = -1
            if (r3 == r11) goto L_0x00d2
            int r21 = r0.getMeasuredHeight()
            int r21 = r21 - r3
            r3 = 2
            r22 = r14[r3]
            int r22 = r22 - r21
            int r10 = r10 - r22
        L_0x00d2:
            r3 = r10
            goto L_0x00ba
        L_0x00d4:
            r11 = -1
            int r10 = r4.topMargin
            int r10 = r10 + r7
            r21 = 1
            if (r3 == r11) goto L_0x00e2
            r22 = r13[r21]
            int r22 = r22 - r3
            int r10 = r10 + r22
        L_0x00e2:
            r3 = r10
            goto L_0x00f2
        L_0x00e4:
            r11 = -1
            r21 = 1
            int r3 = r9 - r5
            r10 = 2
            int r3 = r3 / r10
            int r3 = r3 + r7
            int r10 = r4.topMargin
            int r3 = r3 + r10
            int r10 = r4.bottomMargin
            int r3 = r3 - r10
        L_0x00f2:
            boolean r10 = r6.m2060b(r2)
            if (r10 == 0) goto L_0x00fb
            int r10 = r6.f2120m
            int r1 = r1 + r10
        L_0x00fb:
            int r10 = r4.leftMargin
            int r10 = r10 + r1
            int r1 = r6.m2064a(r0)
            int r22 = r10 + r1
            r1 = r0
            r0 = r24
            r25 = r1
            r11 = r2
            r2 = r22
            r22 = r7
            r23 = -1
            r7 = r4
            r4 = r15
            r0.m2062a(r1, r2, r3, r4, r5)
            int r0 = r7.rightMargin
            int r15 = r15 + r0
            r0 = r25
            int r1 = r6.m2055b(r0)
            int r15 = r15 + r1
            int r10 = r10 + r15
            int r0 = r6.m2063a(r0, r11)
            int r3 = r18 + r0
            r1 = r10
            goto L_0x0134
        L_0x0128:
            r18 = r3
        L_0x012a:
            r22 = r7
            r19 = r10
            r20 = r11
            r21 = 1
            r23 = -1
        L_0x0134:
            int r3 = r3 + 1
            r10 = r19
            r11 = r20
            r7 = r22
            r5 = 1
            r15 = 2
            goto L_0x0065
        L_0x0140:
            return
    }

    /* renamed from: a */
    void m2066a(android.graphics.Canvas r7) {
            r6 = this;
            int r0 = r6.getVirtualChildCount()
            boolean r1 = androidx.appcompat.widget.C0661z0.m1764a(r6)
            r2 = 0
        L_0x0009:
            if (r2 >= r0) goto L_0x003f
            android.view.View r3 = r6.m2069a(r2)
            if (r3 == 0) goto L_0x003c
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto L_0x003c
            boolean r4 = r6.m2060b(r2)
            if (r4 == 0) goto L_0x003c
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.appcompat.widget.g0$a r4 = (androidx.appcompat.widget.C0593g0.C0594a) r4
            if (r1 == 0) goto L_0x002f
            int r3 = r3.getRight()
            int r4 = r4.rightMargin
            int r3 = r3 + r4
            goto L_0x0039
        L_0x002f:
            int r3 = r3.getLeft()
            int r4 = r4.leftMargin
            int r3 = r3 - r4
            int r4 = r6.f2120m
            int r3 = r3 - r4
        L_0x0039:
            r6.m2056b(r7, r3)
        L_0x003c:
            int r2 = r2 + 1
            goto L_0x0009
        L_0x003f:
            boolean r2 = r6.m2060b(r0)
            if (r2 == 0) goto L_0x007a
            int r0 = r0 + (-1)
            android.view.View r0 = r6.m2069a(r0)
            if (r0 != 0) goto L_0x005d
            if (r1 == 0) goto L_0x0054
            int r0 = r6.getPaddingLeft()
            goto L_0x0077
        L_0x0054:
            int r0 = r6.getWidth()
            int r1 = r6.getPaddingRight()
            goto L_0x006b
        L_0x005d:
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            androidx.appcompat.widget.g0$a r2 = (androidx.appcompat.widget.C0593g0.C0594a) r2
            if (r1 == 0) goto L_0x0070
            int r0 = r0.getLeft()
            int r1 = r2.leftMargin
        L_0x006b:
            int r0 = r0 - r1
            int r1 = r6.f2120m
            int r0 = r0 - r1
            goto L_0x0077
        L_0x0070:
            int r0 = r0.getRight()
            int r1 = r2.rightMargin
            int r0 = r0 + r1
        L_0x0077:
            r6.m2056b(r7, r0)
        L_0x007a:
            return
    }

    /* renamed from: a */
    void m2065a(android.graphics.Canvas r5, int r6) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f2119l
            int r1 = r4.getPaddingLeft()
            int r2 = r4.f2123p
            int r1 = r1 + r2
            int r2 = r4.getWidth()
            int r3 = r4.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r4.f2123p
            int r2 = r2 - r3
            int r3 = r4.f2121n
            int r3 = r3 + r6
            r0.setBounds(r1, r6, r2, r3)
            android.graphics.drawable.Drawable r6 = r4.f2119l
            r6.draw(r5)
            return
    }

    /* renamed from: a */
    void m2061a(android.view.View r7, int r8, int r9, int r10, int r11, int r12) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            return
    }

    /* renamed from: b */
    int m2055b(android.view.View r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* renamed from: b */
    void m2059b(int r34, int r35) {
            r33 = this;
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = 0
            r7.f2114g = r10
            int r11 = r33.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r34)
            int r13 = android.view.View.MeasureSpec.getMode(r35)
            int r14 = r7.f2110c
            boolean r15 = r7.f2116i
            r16 = 0
            r17 = 1
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r18 = 0
            r19 = 1
            r20 = 0
        L_0x002a:
            r10 = 8
            r22 = r4
            if (r6 >= r11) goto L_0x019d
            android.view.View r4 = r7.m2069a(r6)
            if (r4 != 0) goto L_0x0047
            int r4 = r7.f2114g
            int r10 = r7.m2054c(r6)
            int r4 = r4 + r10
            r7.f2114g = r4
            r23 = r11
            r4 = r22
        L_0x0043:
            r22 = r13
            goto L_0x0191
        L_0x0047:
            r24 = r1
            int r1 = r4.getVisibility()
            if (r1 != r10) goto L_0x005b
            int r1 = r7.m2063a(r4, r6)
            int r6 = r6 + r1
            r23 = r11
            r4 = r22
            r1 = r24
            goto L_0x0043
        L_0x005b:
            boolean r1 = r7.m2060b(r6)
            if (r1 == 0) goto L_0x0068
            int r1 = r7.f2114g
            int r10 = r7.f2121n
            int r1 = r1 + r10
            r7.f2114g = r1
        L_0x0068:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r10 = r1
            androidx.appcompat.widget.g0$a r10 = (androidx.appcompat.widget.C0593g0.C0594a) r10
            float r1 = r10.f2124a
            float r25 = r0 + r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r13 != r1) goto L_0x00a6
            int r0 = r10.height
            if (r0 != 0) goto L_0x00a6
            float r0 = r10.f2124a
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a6
            int r0 = r7.f2114g
            int r1 = r10.topMargin
            int r1 = r1 + r0
            r26 = r2
            int r2 = r10.bottomMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r7.f2114g = r0
            r0 = r3
            r3 = r4
            r31 = r5
            r23 = r11
            r8 = r24
            r30 = r26
            r18 = 1
            r11 = r6
            r32 = r22
            r22 = r13
            r13 = r32
            goto L_0x0118
        L_0x00a6:
            r26 = r2
            int r0 = r10.height
            if (r0 != 0) goto L_0x00b7
            float r0 = r10.f2124a
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b7
            r0 = -2
            r10.height = r0
            r2 = 0
            goto L_0x00b9
        L_0x00b7:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00b9:
            r27 = 0
            int r0 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00c4
            int r0 = r7.f2114g
            r28 = r0
            goto L_0x00c6
        L_0x00c4:
            r28 = 0
        L_0x00c6:
            r0 = r33
            r8 = r24
            r23 = 1073741824(0x40000000, float:2.0)
            r1 = r4
            r29 = r2
            r30 = r26
            r2 = r6
            r9 = r3
            r3 = r34
            r24 = r4
            r23 = r11
            r11 = 1073741824(0x40000000, float:2.0)
            r32 = r22
            r22 = r13
            r13 = r32
            r4 = r27
            r31 = r5
            r5 = r35
            r11 = r6
            r6 = r28
            r0.m2061a(r1, r2, r3, r4, r5, r6)
            r0 = r29
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x00f5
            r10.height = r0
        L_0x00f5:
            int r0 = r24.getMeasuredHeight()
            int r1 = r7.f2114g
            int r2 = r1 + r0
            int r3 = r10.topMargin
            int r2 = r2 + r3
            int r3 = r10.bottomMargin
            int r2 = r2 + r3
            r3 = r24
            int r4 = r7.m2055b(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.f2114g = r1
            if (r15 == 0) goto L_0x0117
            int r0 = java.lang.Math.max(r0, r9)
            goto L_0x0118
        L_0x0117:
            r0 = r9
        L_0x0118:
            if (r14 < 0) goto L_0x0122
            int r6 = r11 + 1
            if (r14 != r6) goto L_0x0122
            int r1 = r7.f2114g
            r7.f2111d = r1
        L_0x0122:
            if (r11 >= r14) goto L_0x0133
            float r1 = r10.f2124a
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 > 0) goto L_0x012b
            goto L_0x0133
        L_0x012b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0133:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x0140
            int r1 = r10.width
            r2 = -1
            if (r1 != r2) goto L_0x0140
            r1 = 1
            r20 = 1
            goto L_0x0141
        L_0x0140:
            r1 = 0
        L_0x0141:
            int r2 = r10.leftMargin
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredWidth()
            int r4 = r4 + r2
            r5 = r30
            int r5 = java.lang.Math.max(r5, r4)
            int r6 = r3.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r8, r6)
            if (r19 == 0) goto L_0x0162
            int r8 = r10.width
            r9 = -1
            if (r8 != r9) goto L_0x0162
            r8 = 1
            goto L_0x0163
        L_0x0162:
            r8 = 0
        L_0x0163:
            float r9 = r10.f2124a
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x0175
            if (r1 == 0) goto L_0x016c
            goto L_0x016d
        L_0x016c:
            r2 = r4
        L_0x016d:
            int r4 = java.lang.Math.max(r13, r2)
            r13 = r4
            r1 = r31
            goto L_0x017f
        L_0x0175:
            if (r1 == 0) goto L_0x0178
            goto L_0x0179
        L_0x0178:
            r2 = r4
        L_0x0179:
            r1 = r31
            int r1 = java.lang.Math.max(r1, r2)
        L_0x017f:
            int r2 = r7.m2063a(r3, r11)
            int r2 = r2 + r11
            r3 = r0
            r19 = r8
            r4 = r13
            r0 = r25
            r32 = r5
            r5 = r1
            r1 = r6
            r6 = r2
            r2 = r32
        L_0x0191:
            int r6 = r6 + 1
            r8 = r34
            r9 = r35
            r13 = r22
            r11 = r23
            goto L_0x002a
        L_0x019d:
            r8 = r1
            r9 = r3
            r1 = r5
            r23 = r11
            r5 = r2
            r32 = r22
            r22 = r13
            r13 = r32
            int r2 = r7.f2114g
            if (r2 <= 0) goto L_0x01bd
            r2 = r23
            boolean r3 = r7.m2060b(r2)
            if (r3 == 0) goto L_0x01bf
            int r3 = r7.f2114g
            int r4 = r7.f2121n
            int r3 = r3 + r4
            r7.f2114g = r3
            goto L_0x01bf
        L_0x01bd:
            r2 = r23
        L_0x01bf:
            r3 = r22
            if (r15 == 0) goto L_0x020d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L_0x01c9
            if (r3 != 0) goto L_0x020d
        L_0x01c9:
            r4 = 0
            r7.f2114g = r4
            r4 = 0
        L_0x01cd:
            if (r4 >= r2) goto L_0x020d
            android.view.View r6 = r7.m2069a(r4)
            if (r6 != 0) goto L_0x01df
            int r6 = r7.f2114g
            int r11 = r7.m2054c(r4)
            int r6 = r6 + r11
        L_0x01dc:
            r7.f2114g = r6
            goto L_0x0208
        L_0x01df:
            int r11 = r6.getVisibility()
            if (r11 != r10) goto L_0x01eb
            int r6 = r7.m2063a(r6, r4)
            int r4 = r4 + r6
            goto L_0x0208
        L_0x01eb:
            android.view.ViewGroup$LayoutParams r11 = r6.getLayoutParams()
            androidx.appcompat.widget.g0$a r11 = (androidx.appcompat.widget.C0593g0.C0594a) r11
            int r14 = r7.f2114g
            int r21 = r14 + r9
            int r10 = r11.topMargin
            int r21 = r21 + r10
            int r10 = r11.bottomMargin
            int r21 = r21 + r10
            int r6 = r7.m2055b(r6)
            int r6 = r21 + r6
            int r6 = java.lang.Math.max(r14, r6)
            goto L_0x01dc
        L_0x0208:
            int r4 = r4 + 1
            r10 = 8
            goto L_0x01cd
        L_0x020d:
            int r4 = r7.f2114g
            int r6 = r33.getPaddingTop()
            int r10 = r33.getPaddingBottom()
            int r6 = r6 + r10
            int r4 = r4 + r6
            r7.f2114g = r4
            int r4 = r7.f2114g
            int r6 = r33.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r4, r6)
            r6 = r35
            r10 = r9
            r9 = 0
            int r4 = android.view.View.resolveSizeAndState(r4, r6, r9)
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r9 = r9 & r4
            int r11 = r7.f2114g
            int r9 = r9 - r11
            if (r18 != 0) goto L_0x027e
            if (r9 == 0) goto L_0x023d
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x023d
            goto L_0x027e
        L_0x023d:
            int r0 = java.lang.Math.max(r1, r13)
            if (r15 == 0) goto L_0x0279
            r1 = 1073741824(0x40000000, float:2.0)
            if (r3 == r1) goto L_0x0279
            r1 = 0
        L_0x0248:
            if (r1 >= r2) goto L_0x0279
            android.view.View r3 = r7.m2069a(r1)
            if (r3 == 0) goto L_0x0276
            int r9 = r3.getVisibility()
            r11 = 8
            if (r9 != r11) goto L_0x0259
            goto L_0x0276
        L_0x0259:
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            androidx.appcompat.widget.g0$a r9 = (androidx.appcompat.widget.C0593g0.C0594a) r9
            float r9 = r9.f2124a
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x0276
            int r9 = r3.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            r3.measure(r9, r13)
        L_0x0276:
            int r1 = r1 + 1
            goto L_0x0248
        L_0x0279:
            r11 = r34
            r1 = r8
            goto L_0x0368
        L_0x027e:
            float r10 = r7.f2115h
            int r11 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x0285
            r0 = r10
        L_0x0285:
            r10 = 0
            r7.f2114g = r10
            r11 = r0
            r0 = 0
            r32 = r8
            r8 = r1
            r1 = r32
        L_0x028f:
            if (r0 >= r2) goto L_0x0357
            android.view.View r13 = r7.m2069a(r0)
            int r14 = r13.getVisibility()
            r15 = 8
            if (r14 != r15) goto L_0x02a3
            r21 = r11
            r11 = r34
            goto L_0x0350
        L_0x02a3:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            androidx.appcompat.widget.g0$a r14 = (androidx.appcompat.widget.C0593g0.C0594a) r14
            float r10 = r14.f2124a
            int r18 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x02fb
            float r15 = (float) r9
            float r15 = r15 * r10
            float r15 = r15 / r11
            int r15 = (int) r15
            float r11 = r11 - r10
            int r9 = r9 - r15
            int r10 = r33.getPaddingLeft()
            int r18 = r33.getPaddingRight()
            int r10 = r10 + r18
            r18 = r9
            int r9 = r14.leftMargin
            int r10 = r10 + r9
            int r9 = r14.rightMargin
            int r10 = r10 + r9
            int r9 = r14.width
            r21 = r11
            r11 = r34
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r11, r10, r9)
            int r10 = r14.height
            if (r10 != 0) goto L_0x02de
            r10 = 1073741824(0x40000000, float:2.0)
            if (r3 == r10) goto L_0x02db
            goto L_0x02e0
        L_0x02db:
            if (r15 <= 0) goto L_0x02e8
            goto L_0x02e9
        L_0x02de:
            r10 = 1073741824(0x40000000, float:2.0)
        L_0x02e0:
            int r23 = r13.getMeasuredHeight()
            int r15 = r23 + r15
            if (r15 >= 0) goto L_0x02e9
        L_0x02e8:
            r15 = 0
        L_0x02e9:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
            r13.measure(r9, r15)
            int r9 = r13.getMeasuredState()
            r9 = r9 & (-256(0xffffffffffffff00, float:NaN))
            int r1 = android.view.View.combineMeasuredStates(r1, r9)
            goto L_0x0302
        L_0x02fb:
            r10 = r11
            r11 = r34
            r18 = r9
            r21 = r10
        L_0x0302:
            int r9 = r14.leftMargin
            int r10 = r14.rightMargin
            int r9 = r9 + r10
            int r10 = r13.getMeasuredWidth()
            int r10 = r10 + r9
            int r5 = java.lang.Math.max(r5, r10)
            r15 = 1073741824(0x40000000, float:2.0)
            if (r12 == r15) goto L_0x031d
            int r15 = r14.width
            r23 = r1
            r1 = -1
            if (r15 != r1) goto L_0x0320
            r15 = 1
            goto L_0x0321
        L_0x031d:
            r23 = r1
            r1 = -1
        L_0x0320:
            r15 = 0
        L_0x0321:
            if (r15 == 0) goto L_0x0324
            goto L_0x0325
        L_0x0324:
            r9 = r10
        L_0x0325:
            int r8 = java.lang.Math.max(r8, r9)
            if (r19 == 0) goto L_0x0331
            int r9 = r14.width
            if (r9 != r1) goto L_0x0331
            r9 = 1
            goto L_0x0332
        L_0x0331:
            r9 = 0
        L_0x0332:
            int r10 = r7.f2114g
            int r15 = r13.getMeasuredHeight()
            int r15 = r15 + r10
            int r1 = r14.topMargin
            int r15 = r15 + r1
            int r1 = r14.bottomMargin
            int r15 = r15 + r1
            int r1 = r7.m2055b(r13)
            int r15 = r15 + r1
            int r1 = java.lang.Math.max(r10, r15)
            r7.f2114g = r1
            r19 = r9
            r9 = r18
            r1 = r23
        L_0x0350:
            int r0 = r0 + 1
            r11 = r21
            r10 = 0
            goto L_0x028f
        L_0x0357:
            r11 = r34
            int r0 = r7.f2114g
            int r3 = r33.getPaddingTop()
            int r9 = r33.getPaddingBottom()
            int r3 = r3 + r9
            int r0 = r0 + r3
            r7.f2114g = r0
            r0 = r8
        L_0x0368:
            if (r19 != 0) goto L_0x036f
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L_0x036f
            goto L_0x0370
        L_0x036f:
            r0 = r5
        L_0x0370:
            int r3 = r33.getPaddingLeft()
            int r5 = r33.getPaddingRight()
            int r3 = r3 + r5
            int r0 = r0 + r3
            int r3 = r33.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r3)
            int r0 = android.view.View.resolveSizeAndState(r0, r11, r1)
            r7.setMeasuredDimension(r0, r4)
            if (r20 == 0) goto L_0x038e
            r7.m2052d(r2, r6)
        L_0x038e:
            return
    }

    /* renamed from: b */
    void m2058b(int r18, int r19, int r20, int r21) {
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f2113f
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L_0x003b
            r0 = 80
            if (r1 == r0) goto L_0x002f
            int r0 = r17.getPaddingTop()
            goto L_0x0047
        L_0x002f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f2114g
            int r0 = r0 - r1
            goto L_0x0047
        L_0x003b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f2114g
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L_0x0047:
            r1 = 0
            r12 = 0
        L_0x0049:
            if (r12 >= r10) goto L_0x00c7
            android.view.View r13 = r6.m2069a(r12)
            r14 = 1
            if (r13 != 0) goto L_0x0059
            int r1 = r6.m2054c(r12)
            int r0 = r0 + r1
            goto L_0x00c4
        L_0x0059:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto L_0x00c4
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.g0$a r5 = (androidx.appcompat.widget.C0593g0.C0594a) r5
            int r1 = r5.f2125b
            if (r1 >= 0) goto L_0x0075
            r1 = r11
        L_0x0075:
            int r2 = p000a.p018g.p029l.C0216r.m3411j(r17)
            int r1 = p000a.p018g.p029l.C0200c.m3490a(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L_0x008c
            r2 = 5
            if (r1 == r2) goto L_0x0089
            int r1 = r5.leftMargin
            int r1 = r1 + r7
        L_0x0087:
            r2 = r1
            goto L_0x0098
        L_0x0089:
            int r1 = r8 - r4
            goto L_0x0094
        L_0x008c:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
        L_0x0094:
            int r2 = r5.rightMargin
            int r1 = r1 - r2
            goto L_0x0087
        L_0x0098:
            boolean r1 = r6.m2060b(r12)
            if (r1 == 0) goto L_0x00a1
            int r1 = r6.f2121n
            int r0 = r0 + r1
        L_0x00a1:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.m2064a(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.m2062a(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.m2055b(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.m2063a(r13, r12)
            int r12 = r12 + r0
            r0 = r16
        L_0x00c4:
            r1 = 1
            int r12 = r12 + r1
            goto L_0x0049
        L_0x00c7:
            return
    }

    /* renamed from: b */
    void m2057b(android.graphics.Canvas r6) {
            r5 = this;
            int r0 = r5.getVirtualChildCount()
            r1 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x0031
            android.view.View r2 = r5.m2069a(r1)
            if (r2 == 0) goto L_0x002e
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 == r4) goto L_0x002e
            boolean r3 = r5.m2060b(r1)
            if (r3 == 0) goto L_0x002e
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.appcompat.widget.g0$a r3 = (androidx.appcompat.widget.C0593g0.C0594a) r3
            int r2 = r2.getTop()
            int r3 = r3.topMargin
            int r2 = r2 - r3
            int r3 = r5.f2121n
            int r2 = r2 - r3
            r5.m2065a(r6, r2)
        L_0x002e:
            int r1 = r1 + 1
            goto L_0x0005
        L_0x0031:
            boolean r1 = r5.m2060b(r0)
            if (r1 == 0) goto L_0x005c
            int r0 = r0 + (-1)
            android.view.View r0 = r5.m2069a(r0)
            if (r0 != 0) goto L_0x004c
            int r0 = r5.getHeight()
            int r1 = r5.getPaddingBottom()
            int r0 = r0 - r1
            int r1 = r5.f2121n
            int r0 = r0 - r1
            goto L_0x0059
        L_0x004c:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            androidx.appcompat.widget.g0$a r1 = (androidx.appcompat.widget.C0593g0.C0594a) r1
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
        L_0x0059:
            r5.m2065a(r6, r0)
        L_0x005c:
            return
    }

    /* renamed from: b */
    void m2056b(android.graphics.Canvas r6, int r7) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.f2119l
            int r1 = r5.getPaddingTop()
            int r2 = r5.f2123p
            int r1 = r1 + r2
            int r2 = r5.f2120m
            int r2 = r2 + r7
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r5.f2123p
            int r3 = r3 - r4
            r0.setBounds(r7, r1, r2, r3)
            android.graphics.drawable.Drawable r7 = r5.f2119l
            r7.draw(r6)
            return
    }

    /* renamed from: b */
    protected boolean m2060b(int r5) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 != 0) goto L_0x000b
            int r5 = r4.f2122o
            r5 = r5 & r1
            if (r5 == 0) goto L_0x000a
            r0 = 1
        L_0x000a:
            return r0
        L_0x000b:
            int r2 = r4.getChildCount()
            if (r5 != r2) goto L_0x0019
            int r5 = r4.f2122o
            r5 = r5 & 4
            if (r5 == 0) goto L_0x0018
            r0 = 1
        L_0x0018:
            return r0
        L_0x0019:
            int r2 = r4.f2122o
            r2 = r2 & 2
            if (r2 == 0) goto L_0x0033
            int r5 = r5 - r1
        L_0x0020:
            if (r5 < 0) goto L_0x0033
            android.view.View r2 = r4.getChildAt(r5)
            int r2 = r2.getVisibility()
            r3 = 8
            if (r2 == r3) goto L_0x0030
            r0 = 1
            goto L_0x0033
        L_0x0030:
            int r5 = r5 + (-1)
            goto L_0x0020
        L_0x0033:
            return r0
    }

    /* renamed from: c */
    int m2054c(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.appcompat.widget.C0593g0.C0594a
            return r1
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.appcompat.widget.g0$a r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.view.ViewGroup
    protected androidx.appcompat.widget.C0593g0.C0594a generateDefaultLayoutParams() {
            r3 = this;
            int r0 = r3.f2112e
            r1 = -2
            if (r0 != 0) goto L_0x000b
            androidx.appcompat.widget.g0$a r0 = new androidx.appcompat.widget.g0$a
            r0.<init>(r1, r1)
            return r0
        L_0x000b:
            r2 = 1
            if (r0 != r2) goto L_0x0015
            androidx.appcompat.widget.g0$a r0 = new androidx.appcompat.widget.g0$a
            r2 = -1
            r0.<init>(r2, r1)
            return r0
        L_0x0015:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.appcompat.widget.g0$a r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            androidx.appcompat.widget.g0$a r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    public androidx.appcompat.widget.C0593g0.C0594a generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.appcompat.widget.g0$a r0 = new androidx.appcompat.widget.g0$a
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    protected androidx.appcompat.widget.C0593g0.C0594a generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            androidx.appcompat.widget.g0$a r0 = new androidx.appcompat.widget.g0$a
            r0.<init>(r2)
            return r0
    }

    @Override // android.view.View
    public int getBaseline() {
            r5 = this;
            int r0 = r5.f2110c
            if (r0 >= 0) goto L_0x0009
            int r0 = super.getBaseline()
            return r0
        L_0x0009:
            int r0 = r5.getChildCount()
            int r1 = r5.f2110c
            if (r0 <= r1) goto L_0x0077
            android.view.View r0 = r5.getChildAt(r1)
            int r1 = r0.getBaseline()
            r2 = -1
            if (r1 != r2) goto L_0x0029
            int r0 = r5.f2110c
            if (r0 != 0) goto L_0x0021
            return r2
        L_0x0021:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline."
            r0.<init>(r1)
            throw r0
        L_0x0029:
            int r2 = r5.f2111d
            int r3 = r5.f2112e
            r4 = 1
            if (r3 != r4) goto L_0x006c
            int r3 = r5.f2113f
            r3 = r3 & 112(0x70, float:1.57E-43)
            r4 = 48
            if (r3 == r4) goto L_0x006c
            r4 = 16
            if (r3 == r4) goto L_0x0053
            r4 = 80
            if (r3 == r4) goto L_0x0041
            goto L_0x006c
        L_0x0041:
            int r2 = r5.getBottom()
            int r3 = r5.getTop()
            int r2 = r2 - r3
            int r3 = r5.getPaddingBottom()
            int r2 = r2 - r3
            int r3 = r5.f2114g
            int r2 = r2 - r3
            goto L_0x006c
        L_0x0053:
            int r3 = r5.getBottom()
            int r4 = r5.getTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r5.f2114g
            int r3 = r3 - r4
            int r3 = r3 / 2
            int r2 = r2 + r3
        L_0x006c:
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.g0$a r0 = (androidx.appcompat.widget.C0593g0.C0594a) r0
            int r0 = r0.topMargin
            int r2 = r2 + r0
            int r2 = r2 + r1
            return r2
        L_0x0077:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds."
            r0.<init>(r1)
            throw r0
    }

    public int getBaselineAlignedChildIndex() {
            r1 = this;
            int r0 = r1.f2110c
            return r0
    }

    public android.graphics.drawable.Drawable getDividerDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2119l
            return r0
    }

    public int getDividerPadding() {
            r1 = this;
            int r0 = r1.f2123p
            return r0
    }

    public int getDividerWidth() {
            r1 = this;
            int r0 = r1.f2120m
            return r0
    }

    public int getGravity() {
            r1 = this;
            int r0 = r1.f2113f
            return r0
    }

    public int getOrientation() {
            r1 = this;
            int r0 = r1.f2112e
            return r0
    }

    public int getShowDividers() {
            r1 = this;
            int r0 = r1.f2122o
            return r0
    }

    int getVirtualChildCount() {
            r1 = this;
            int r0 = r1.getChildCount()
            return r0
    }

    public float getWeightSum() {
            r1 = this;
            float r0 = r1.f2115h
            return r0
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f2119l
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r2.f2112e
            r1 = 1
            if (r0 != r1) goto L_0x000e
            r2.m2057b(r3)
            goto L_0x0011
        L_0x000e:
            r2.m2066a(r3)
        L_0x0011:
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2)
            java.lang.Class<androidx.appcompat.widget.g0> r0 = androidx.appcompat.widget.C0593g0.class
            java.lang.String r0 = r0.getName()
            r2.setClassName(r0)
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            super.onInitializeAccessibilityNodeInfo(r2)
            java.lang.Class<androidx.appcompat.widget.g0> r0 = androidx.appcompat.widget.C0593g0.class
            java.lang.String r0 = r0.getName()
            r2.setClassName(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            int r2 = r1.f2112e
            r0 = 1
            if (r2 != r0) goto L_0x0009
            r1.m2058b(r3, r4, r5, r6)
            goto L_0x000c
        L_0x0009:
            r1.m2067a(r3, r4, r5, r6)
        L_0x000c:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r3, int r4) {
            r2 = this;
            int r0 = r2.f2112e
            r1 = 1
            if (r0 != r1) goto L_0x0009
            r2.m2059b(r3, r4)
            goto L_0x000c
        L_0x0009:
            r2.m2068a(r3, r4)
        L_0x000c:
            return
    }

    public void setBaselineAligned(boolean r1) {
            r0 = this;
            r0.f2109b = r1
            return
    }

    public void setBaselineAlignedChildIndex(int r3) {
            r2 = this;
            if (r3 < 0) goto L_0x000b
            int r0 = r2.getChildCount()
            if (r3 >= r0) goto L_0x000b
            r2.f2110c = r3
            return
        L_0x000b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "base aligned child index out of range (0, "
            r0.append(r1)
            int r1 = r2.getChildCount()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public void setDividerDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f2119l
            if (r3 != r0) goto L_0x0005
            return
        L_0x0005:
            r2.f2119l = r3
            r0 = 0
            if (r3 == 0) goto L_0x0017
            int r1 = r3.getIntrinsicWidth()
            r2.f2120m = r1
            int r1 = r3.getIntrinsicHeight()
            r2.f2121n = r1
            goto L_0x001b
        L_0x0017:
            r2.f2120m = r0
            r2.f2121n = r0
        L_0x001b:
            if (r3 != 0) goto L_0x001e
            r0 = 1
        L_0x001e:
            r2.setWillNotDraw(r0)
            r2.requestLayout()
            return
    }

    public void setDividerPadding(int r1) {
            r0 = this;
            r0.f2123p = r1
            return
    }

    public void setGravity(int r2) {
            r1 = this;
            int r0 = r1.f2113f
            if (r0 == r2) goto L_0x0019
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r0 = r0 & r2
            if (r0 != 0) goto L_0x000e
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r2 = r2 | r0
        L_0x000e:
            r0 = r2 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0014
            r2 = r2 | 48
        L_0x0014:
            r1.f2113f = r2
            r1.requestLayout()
        L_0x0019:
            return
    }

    public void setHorizontalGravity(int r3) {
            r2 = this;
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r0
            int r1 = r2.f2113f
            r0 = r0 & r1
            if (r0 == r3) goto L_0x0013
            r0 = -8388616(0xffffffffff7ffff8, float:-3.402822E38)
            r0 = r0 & r1
            r3 = r3 | r0
            r2.f2113f = r3
            r2.requestLayout()
        L_0x0013:
            return
    }

    public void setMeasureWithLargestChildEnabled(boolean r1) {
            r0 = this;
            r0.f2116i = r1
            return
    }

    public void setOrientation(int r2) {
            r1 = this;
            int r0 = r1.f2112e
            if (r0 == r2) goto L_0x0009
            r1.f2112e = r2
            r1.requestLayout()
        L_0x0009:
            return
    }

    public void setShowDividers(int r2) {
            r1 = this;
            int r0 = r1.f2122o
            if (r2 == r0) goto L_0x0007
            r1.requestLayout()
        L_0x0007:
            r1.f2122o = r2
            return
    }

    public void setVerticalGravity(int r3) {
            r2 = this;
            r3 = r3 & 112(0x70, float:1.57E-43)
            int r0 = r2.f2113f
            r1 = r0 & 112(0x70, float:1.57E-43)
            if (r1 == r3) goto L_0x0010
            r0 = r0 & (-113(0xffffffffffffff8f, float:NaN))
            r3 = r3 | r0
            r2.f2113f = r3
            r2.requestLayout()
        L_0x0010:
            return
    }

    public void setWeightSum(float r2) {
            r1 = this;
            r0 = 0
            float r2 = java.lang.Math.max(r0, r2)
            r1.f2115h = r2
            return
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }
}
