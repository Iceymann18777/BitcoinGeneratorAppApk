package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ActionMenuView extends androidx.appcompat.widget.C0593g0 implements androidx.appcompat.view.menu.C0496h.AbstractC0498b, androidx.appcompat.view.menu.AbstractC0515q {

    /* renamed from: A */
    private int f1864A;

    /* renamed from: B */
    androidx.appcompat.widget.ActionMenuView.AbstractC0535e f1865B;

    /* renamed from: q */
    private androidx.appcompat.view.menu.C0496h f1866q;

    /* renamed from: r */
    private android.content.Context f1867r;

    /* renamed from: s */
    private int f1868s;

    /* renamed from: t */
    private boolean f1869t;

    /* renamed from: u */
    private androidx.appcompat.widget.C0570c f1870u;

    /* renamed from: v */
    private androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a f1871v;

    /* renamed from: w */
    androidx.appcompat.view.menu.C0496h.AbstractC0497a f1872w;

    /* renamed from: x */
    private boolean f1873x;

    /* renamed from: y */
    private int f1874y;

    /* renamed from: z */
    private int f1875z;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    /* loaded from: classes.dex */
    public interface AbstractC0531a {
        /* renamed from: b */
        boolean mo2112b();

        /* renamed from: c */
        boolean mo2111c();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    /* loaded from: classes.dex */
    private static class C0532b implements androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a {
        C0532b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a
        /* renamed from: a */
        public void mo2108a(androidx.appcompat.view.menu.C0496h r1, boolean r2) {
                r0 = this;
                return
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a
        /* renamed from: a */
        public boolean mo2109a(androidx.appcompat.view.menu.C0496h r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    /* loaded from: classes.dex */
    public static class C0533c extends androidx.appcompat.widget.C0593g0.C0594a {
        @android.view.ViewDebug.ExportedProperty

        /* renamed from: c */
        public boolean f1876c;
        @android.view.ViewDebug.ExportedProperty

        /* renamed from: d */
        public int f1877d;
        @android.view.ViewDebug.ExportedProperty

        /* renamed from: e */
        public int f1878e;
        @android.view.ViewDebug.ExportedProperty

        /* renamed from: f */
        public boolean f1879f;
        @android.view.ViewDebug.ExportedProperty

        /* renamed from: g */
        public boolean f1880g;

        /* renamed from: h */
        boolean f1881h;

        public C0533c(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.f1876c = r1
                return
        }

        public C0533c(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public C0533c(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public C0533c(androidx.appcompat.widget.ActionMenuView.C0533c r1) {
                r0 = this;
                r0.<init>(r1)
                boolean r1 = r1.f1876c
                r0.f1876c = r1
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    /* loaded from: classes.dex */
    private class C0534d implements androidx.appcompat.view.menu.C0496h.AbstractC0497a {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.widget.ActionMenuView f1882b;

        C0534d(androidx.appcompat.widget.ActionMenuView r1) {
                r0 = this;
                r0.f1882b = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.C0496h.AbstractC0497a
        /* renamed from: a */
        public void mo65a(androidx.appcompat.view.menu.C0496h r2) {
                r1 = this;
                androidx.appcompat.widget.ActionMenuView r0 = r1.f1882b
                androidx.appcompat.view.menu.h$a r0 = r0.f1872w
                if (r0 == 0) goto L_0x0009
                r0.mo65a(r2)
            L_0x0009:
                return
        }

        @Override // androidx.appcompat.view.menu.C0496h.AbstractC0497a
        /* renamed from: a */
        public boolean mo64a(androidx.appcompat.view.menu.C0496h r1, android.view.MenuItem r2) {
                r0 = this;
                androidx.appcompat.widget.ActionMenuView r1 = r0.f1882b
                androidx.appcompat.widget.ActionMenuView$e r1 = r1.f1865B
                if (r1 == 0) goto L_0x000e
                boolean r1 = r1.onMenuItemClick(r2)
                if (r1 == 0) goto L_0x000e
                r1 = 1
                goto L_0x000f
            L_0x000e:
                r1 = 0
            L_0x000f:
                return r1
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    /* loaded from: classes.dex */
    public interface AbstractC0535e {
        boolean onMenuItemClick(android.view.MenuItem r1);
    }

    public ActionMenuView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionMenuView(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            r4 = 0
            r2.setBaselineAligned(r4)
            android.content.res.Resources r0 = r3.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r1 = 1113587712(0x42600000, float:56.0)
            float r1 = r1 * r0
            int r1 = (int) r1
            r2.f1875z = r1
            r1 = 1082130432(0x40800000, float:4.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            r2.f1864A = r0
            r2.f1867r = r3
            r2.f1868s = r4
            return
    }

    /* renamed from: a */
    static int m2266a(android.view.View r5, int r6, int r7, int r8, int r9) {
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r0 = (androidx.appcompat.widget.ActionMenuView.C0533c) r0
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = r1 - r9
            int r8 = android.view.View.MeasureSpec.getMode(r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            boolean r9 = r5 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r9 == 0) goto L_0x001b
            r9 = r5
            androidx.appcompat.view.menu.ActionMenuItemView r9 = (androidx.appcompat.view.menu.ActionMenuItemView) r9
            goto L_0x001c
        L_0x001b:
            r9 = 0
        L_0x001c:
            r1 = 1
            r2 = 0
            if (r9 == 0) goto L_0x0028
            boolean r9 = r9.m2457d()
            if (r9 == 0) goto L_0x0028
            r9 = 1
            goto L_0x0029
        L_0x0028:
            r9 = 0
        L_0x0029:
            r3 = 2
            if (r7 <= 0) goto L_0x004d
            if (r9 == 0) goto L_0x0030
            if (r7 < r3) goto L_0x004d
        L_0x0030:
            int r7 = r7 * r6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r4)
            r5.measure(r7, r8)
            int r7 = r5.getMeasuredWidth()
            int r4 = r7 / r6
            int r7 = r7 % r6
            if (r7 == 0) goto L_0x0046
            int r4 = r4 + 1
        L_0x0046:
            if (r9 == 0) goto L_0x004b
            if (r4 >= r3) goto L_0x004b
            goto L_0x004e
        L_0x004b:
            r3 = r4
            goto L_0x004e
        L_0x004d:
            r3 = 0
        L_0x004e:
            boolean r7 = r0.f1876c
            if (r7 != 0) goto L_0x0055
            if (r9 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r1 = 0
        L_0x0056:
            r0.f1879f = r1
            r0.f1877d = r3
            int r6 = r6 * r3
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            r5.measure(r6, r8)
            return r3
    }

    /* renamed from: c */
    private void m2263c(int r30, int r31) {
            r29 = this;
            r0 = r29
            int r1 = android.view.View.MeasureSpec.getMode(r31)
            int r2 = android.view.View.MeasureSpec.getSize(r30)
            int r3 = android.view.View.MeasureSpec.getSize(r31)
            int r4 = r29.getPaddingLeft()
            int r5 = r29.getPaddingRight()
            int r4 = r4 + r5
            int r5 = r29.getPaddingTop()
            int r6 = r29.getPaddingBottom()
            int r5 = r5 + r6
            r6 = -2
            r7 = r31
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r7, r5, r6)
            int r2 = r2 - r4
            int r4 = r0.f1875z
            int r7 = r2 / r4
            int r8 = r2 % r4
            r9 = 0
            if (r7 != 0) goto L_0x0035
            r0.setMeasuredDimension(r2, r9)
            return
        L_0x0035:
            int r8 = r8 / r7
            int r4 = r4 + r8
            int r8 = r29.getChildCount()
            r14 = r7
            r7 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0045:
            if (r7 >= r8) goto L_0x00c5
            android.view.View r11 = r0.getChildAt(r7)
            int r9 = r11.getVisibility()
            r19 = r3
            r3 = 8
            if (r9 != r3) goto L_0x0057
            goto L_0x00bf
        L_0x0057:
            boolean r3 = r11 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            int r13 = r13 + 1
            if (r3 == 0) goto L_0x0066
            int r9 = r0.f1864A
            r20 = r13
            r13 = 0
            r11.setPadding(r9, r13, r9, r13)
            goto L_0x0069
        L_0x0066:
            r20 = r13
            r13 = 0
        L_0x0069:
            android.view.ViewGroup$LayoutParams r9 = r11.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r9 = (androidx.appcompat.widget.ActionMenuView.C0533c) r9
            r9.f1881h = r13
            r9.f1878e = r13
            r9.f1877d = r13
            r9.f1879f = r13
            r9.leftMargin = r13
            r9.rightMargin = r13
            if (r3 == 0) goto L_0x0088
            r3 = r11
            androidx.appcompat.view.menu.ActionMenuItemView r3 = (androidx.appcompat.view.menu.ActionMenuItemView) r3
            boolean r3 = r3.m2457d()
            if (r3 == 0) goto L_0x0088
            r3 = 1
            goto L_0x0089
        L_0x0088:
            r3 = 0
        L_0x0089:
            r9.f1880g = r3
            boolean r3 = r9.f1876c
            if (r3 == 0) goto L_0x0091
            r3 = 1
            goto L_0x0092
        L_0x0091:
            r3 = r14
        L_0x0092:
            int r3 = m2266a(r11, r4, r3, r6, r5)
            int r13 = java.lang.Math.max(r15, r3)
            boolean r15 = r9.f1879f
            if (r15 == 0) goto L_0x00a0
            int r16 = r16 + 1
        L_0x00a0:
            boolean r9 = r9.f1876c
            if (r9 == 0) goto L_0x00a5
            r12 = 1
        L_0x00a5:
            int r14 = r14 - r3
            int r9 = r11.getMeasuredHeight()
            int r10 = java.lang.Math.max(r10, r9)
            r9 = 1
            if (r3 != r9) goto L_0x00bb
            int r3 = r9 << r7
            r11 = r10
            long r9 = (long) r3
            long r9 = r17 | r9
            r17 = r9
            r10 = r11
            goto L_0x00bc
        L_0x00bb:
            r11 = r10
        L_0x00bc:
            r15 = r13
            r13 = r20
        L_0x00bf:
            int r7 = r7 + 1
            r3 = r19
            r9 = 0
            goto L_0x0045
        L_0x00c5:
            r19 = r3
            r3 = 2
            if (r12 == 0) goto L_0x00ce
            if (r13 != r3) goto L_0x00ce
            r5 = 1
            goto L_0x00cf
        L_0x00ce:
            r5 = 0
        L_0x00cf:
            r7 = 0
        L_0x00d0:
            r20 = 1
            if (r16 <= 0) goto L_0x0172
            if (r14 <= 0) goto L_0x0172
            r9 = 2147483647(0x7fffffff, float:NaN)
            r3 = 2147483647(0x7fffffff, float:NaN)
            r9 = 0
            r11 = 0
            r22 = 0
        L_0x00e0:
            if (r9 >= r8) goto L_0x0111
            android.view.View r24 = r0.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r24 = r24.getLayoutParams()
            r25 = r7
            r7 = r24
            androidx.appcompat.widget.ActionMenuView$c r7 = (androidx.appcompat.widget.ActionMenuView.C0533c) r7
            r24 = r10
            boolean r10 = r7.f1879f
            if (r10 != 0) goto L_0x00f7
            goto L_0x010a
        L_0x00f7:
            int r7 = r7.f1877d
            if (r7 >= r3) goto L_0x0102
            long r10 = r20 << r9
            r3 = r7
            r22 = r10
            r11 = 1
            goto L_0x010a
        L_0x0102:
            if (r7 != r3) goto L_0x010a
            long r26 = r20 << r9
            long r22 = r22 | r26
            int r11 = r11 + 1
        L_0x010a:
            int r9 = r9 + 1
            r10 = r24
            r7 = r25
            goto L_0x00e0
        L_0x0111:
            r25 = r7
            r24 = r10
            long r17 = r17 | r22
            if (r11 <= r14) goto L_0x011d
            r11 = r1
            r26 = r2
            goto L_0x0179
        L_0x011d:
            int r3 = r3 + 1
            r7 = 0
        L_0x0120:
            if (r7 >= r8) goto L_0x016c
            android.view.View r9 = r0.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r10 = (androidx.appcompat.widget.ActionMenuView.C0533c) r10
            r26 = r2
            r11 = 1
            int r2 = r11 << r7
            r11 = r1
            long r1 = (long) r2
            long r20 = r22 & r1
            r27 = 0
            int r25 = (r20 > r27 ? 1 : (r20 == r27 ? 0 : -1))
            if (r25 != 0) goto L_0x0144
            int r9 = r10.f1877d
            if (r9 != r3) goto L_0x0141
            long r17 = r17 | r1
        L_0x0141:
            r20 = r3
            goto L_0x0164
        L_0x0144:
            if (r5 == 0) goto L_0x0158
            boolean r1 = r10.f1880g
            if (r1 == 0) goto L_0x0158
            r1 = 1
            if (r14 != r1) goto L_0x0158
            int r2 = r0.f1864A
            int r1 = r2 + r4
            r20 = r3
            r3 = 0
            r9.setPadding(r1, r3, r2, r3)
            goto L_0x015a
        L_0x0158:
            r20 = r3
        L_0x015a:
            int r1 = r10.f1877d
            r2 = 1
            int r1 = r1 + r2
            r10.f1877d = r1
            r10.f1881h = r2
            int r14 = r14 + (-1)
        L_0x0164:
            int r7 = r7 + 1
            r1 = r11
            r3 = r20
            r2 = r26
            goto L_0x0120
        L_0x016c:
            r10 = r24
            r3 = 2
            r7 = 1
            goto L_0x00d0
        L_0x0172:
            r11 = r1
            r26 = r2
            r25 = r7
            r24 = r10
        L_0x0179:
            r1 = 1
            if (r12 != 0) goto L_0x0180
            if (r13 != r1) goto L_0x0180
            r2 = 1
            goto L_0x0181
        L_0x0180:
            r2 = 0
        L_0x0181:
            if (r14 <= 0) goto L_0x0233
            r9 = 0
            int r3 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x0233
            int r13 = r13 - r1
            if (r14 < r13) goto L_0x0190
            if (r2 != 0) goto L_0x0190
            if (r15 <= r1) goto L_0x0233
        L_0x0190:
            int r1 = java.lang.Long.bitCount(r17)
            float r1 = (float) r1
            if (r2 != 0) goto L_0x01cf
            long r2 = r17 & r20
            r5 = 1056964608(0x3f000000, float:0.5)
            r9 = 0
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            r13 = 0
            if (r7 == 0) goto L_0x01b1
            android.view.View r2 = r0.getChildAt(r13)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r2 = (androidx.appcompat.widget.ActionMenuView.C0533c) r2
            boolean r2 = r2.f1880g
            if (r2 != 0) goto L_0x01b1
            float r1 = r1 - r5
        L_0x01b1:
            int r2 = r8 + (-1)
            r3 = 1
            int r7 = r3 << r2
            long r9 = (long) r7
            long r9 = r17 & r9
            r15 = 0
            int r3 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r3 == 0) goto L_0x01d0
            android.view.View r2 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r2 = (androidx.appcompat.widget.ActionMenuView.C0533c) r2
            boolean r2 = r2.f1880g
            if (r2 != 0) goto L_0x01d0
            float r1 = r1 - r5
            goto L_0x01d0
        L_0x01cf:
            r13 = 0
        L_0x01d0:
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x01db
            int r14 = r14 * r4
            float r2 = (float) r14
            float r2 = r2 / r1
            int r9 = (int) r2
            goto L_0x01dc
        L_0x01db:
            r9 = 0
        L_0x01dc:
            r1 = 0
        L_0x01dd:
            if (r1 >= r8) goto L_0x0234
            r2 = 1
            int r3 = r2 << r1
            long r2 = (long) r3
            long r2 = r17 & r2
            r14 = 0
            int r5 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r5 != 0) goto L_0x01ee
            r2 = 1
            r5 = 2
            goto L_0x0230
        L_0x01ee:
            android.view.View r2 = r0.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r3 = (androidx.appcompat.widget.ActionMenuView.C0533c) r3
            boolean r2 = r2 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r2 == 0) goto L_0x0210
            r3.f1878e = r9
            r2 = 1
            r3.f1881h = r2
            if (r1 != 0) goto L_0x020d
            boolean r2 = r3.f1880g
            if (r2 != 0) goto L_0x020d
            int r2 = -r9
            r5 = 2
            int r2 = r2 / r5
            r3.leftMargin = r2
            goto L_0x020e
        L_0x020d:
            r5 = 2
        L_0x020e:
            r2 = 1
            goto L_0x021e
        L_0x0210:
            r5 = 2
            boolean r2 = r3.f1876c
            if (r2 == 0) goto L_0x0221
            r3.f1878e = r9
            r2 = 1
            r3.f1881h = r2
            int r7 = -r9
            int r7 = r7 / r5
            r3.rightMargin = r7
        L_0x021e:
            r25 = 1
            goto L_0x0230
        L_0x0221:
            r2 = 1
            if (r1 == 0) goto L_0x0228
            int r7 = r9 / 2
            r3.leftMargin = r7
        L_0x0228:
            int r7 = r8 + (-1)
            if (r1 == r7) goto L_0x0230
            int r7 = r9 / 2
            r3.rightMargin = r7
        L_0x0230:
            int r1 = r1 + 1
            goto L_0x01dd
        L_0x0233:
            r13 = 0
        L_0x0234:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r25 == 0) goto L_0x025a
        L_0x0238:
            if (r13 >= r8) goto L_0x025a
            android.view.View r2 = r0.getChildAt(r13)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r3 = (androidx.appcompat.widget.ActionMenuView.C0533c) r3
            boolean r5 = r3.f1881h
            if (r5 != 0) goto L_0x0249
            goto L_0x0257
        L_0x0249:
            int r5 = r3.f1877d
            int r5 = r5 * r4
            int r3 = r3.f1878e
            int r5 = r5 + r3
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
            r2.measure(r3, r6)
        L_0x0257:
            int r13 = r13 + 1
            goto L_0x0238
        L_0x025a:
            if (r11 == r1) goto L_0x025f
            r1 = r24
            goto L_0x0261
        L_0x025f:
            r1 = r19
        L_0x0261:
            r2 = r26
            r0.setMeasuredDimension(r2, r1)
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0515q
    /* renamed from: a */
    public void mo142a(androidx.appcompat.view.menu.C0496h r1) {
            r0 = this;
            r0.f1866q = r1
            return
    }

    /* renamed from: a */
    public void m2264a(androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a r1, androidx.appcompat.view.menu.C0496h.AbstractC0497a r2) {
            r0 = this;
            r0.f1871v = r1
            r0.f1872w = r2
            return
    }

    @Override // androidx.appcompat.view.menu.C0496h.AbstractC0498b
    /* renamed from: a */
    public boolean mo2265a(androidx.appcompat.view.menu.C0501k r3) {
            r2 = this;
            androidx.appcompat.view.menu.h r0 = r2.f1866q
            r1 = 0
            boolean r3 = r0.m2411a(r3, r1)
            return r3
    }

    @Override // androidx.appcompat.widget.C0593g0, android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            if (r1 == 0) goto L_0x0008
            boolean r1 = r1 instanceof androidx.appcompat.widget.ActionMenuView.C0533c
            if (r1 == 0) goto L_0x0008
            r1 = 1
            goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            return r1
    }

    /* renamed from: d */
    public void m2262d() {
            r1 = this;
            androidx.appcompat.widget.c r0 = r1.f1870u
            if (r0 == 0) goto L_0x0007
            r0.m2122e()
        L_0x0007:
            return
    }

    /* renamed from: d */
    protected boolean m2261d(int r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r5 + (-1)
            android.view.View r1 = r4.getChildAt(r1)
            android.view.View r2 = r4.getChildAt(r5)
            int r3 = r4.getChildCount()
            if (r5 >= r3) goto L_0x001f
            boolean r3 = r1 instanceof androidx.appcompat.widget.ActionMenuView.AbstractC0531a
            if (r3 == 0) goto L_0x001f
            androidx.appcompat.widget.ActionMenuView$a r1 = (androidx.appcompat.widget.ActionMenuView.AbstractC0531a) r1
            boolean r1 = r1.mo2111c()
            r0 = r0 | r1
        L_0x001f:
            if (r5 <= 0) goto L_0x002c
            boolean r5 = r2 instanceof androidx.appcompat.widget.ActionMenuView.AbstractC0531a
            if (r5 == 0) goto L_0x002c
            androidx.appcompat.widget.ActionMenuView$a r2 = (androidx.appcompat.widget.ActionMenuView.AbstractC0531a) r2
            boolean r5 = r2.mo2112b()
            r0 = r0 | r5
        L_0x002c:
            return r0
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* renamed from: e */
    public androidx.appcompat.widget.ActionMenuView.C0533c m2260e() {
            r2 = this;
            androidx.appcompat.widget.ActionMenuView$c r0 = r2.generateDefaultLayoutParams()
            r1 = 1
            r0.f1876c = r1
            return r0
    }

    /* renamed from: f */
    public boolean m2259f() {
            r1 = this;
            androidx.appcompat.widget.c r0 = r1.f1870u
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.m2118g()
            if (r0 == 0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            return r0
    }

    /* renamed from: g */
    public boolean m2258g() {
            r1 = this;
            androidx.appcompat.widget.c r0 = r1.f1870u
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.m2116i()
            if (r0 == 0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            return r0
    }

    @Override // androidx.appcompat.widget.C0593g0, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuView$c r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // androidx.appcompat.widget.C0593g0, android.view.ViewGroup
    protected androidx.appcompat.widget.ActionMenuView.C0533c generateDefaultLayoutParams() {
            r2 = this;
            androidx.appcompat.widget.ActionMenuView$c r0 = new androidx.appcompat.widget.ActionMenuView$c
            r1 = -2
            r0.<init>(r1, r1)
            r1 = 16
            r0.f2125b = r1
            return r0
    }

    @Override // androidx.appcompat.widget.C0593g0, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ androidx.appcompat.widget.C0593g0.C0594a generateDefaultLayoutParams() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuView$c r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // androidx.appcompat.widget.C0593g0, android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.appcompat.widget.ActionMenuView$c r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.C0593g0, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            androidx.appcompat.widget.ActionMenuView$c r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.C0593g0, android.view.ViewGroup
    public androidx.appcompat.widget.ActionMenuView.C0533c generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.appcompat.widget.ActionMenuView$c r0 = new androidx.appcompat.widget.ActionMenuView$c
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // androidx.appcompat.widget.C0593g0, android.view.ViewGroup
    protected androidx.appcompat.widget.ActionMenuView.C0533c generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            if (r2 == 0) goto L_0x001c
            boolean r0 = r2 instanceof androidx.appcompat.widget.ActionMenuView.C0533c
            if (r0 == 0) goto L_0x000e
            androidx.appcompat.widget.ActionMenuView$c r0 = new androidx.appcompat.widget.ActionMenuView$c
            androidx.appcompat.widget.ActionMenuView$c r2 = (androidx.appcompat.widget.ActionMenuView.C0533c) r2
            r0.<init>(r2)
            goto L_0x0013
        L_0x000e:
            androidx.appcompat.widget.ActionMenuView$c r0 = new androidx.appcompat.widget.ActionMenuView$c
            r0.<init>(r2)
        L_0x0013:
            int r2 = r0.f2125b
            if (r2 > 0) goto L_0x001b
            r2 = 16
            r0.f2125b = r2
        L_0x001b:
            return r0
        L_0x001c:
            androidx.appcompat.widget.ActionMenuView$c r2 = r1.generateDefaultLayoutParams()
            return r2
    }

    @Override // androidx.appcompat.widget.C0593g0, android.view.ViewGroup
    public /* bridge */ /* synthetic */ androidx.appcompat.widget.C0593g0.C0594a generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.appcompat.widget.ActionMenuView$c r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.C0593g0, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ androidx.appcompat.widget.C0593g0.C0594a generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            androidx.appcompat.widget.ActionMenuView$c r1 = r0.generateLayoutParams(r1)
            return r1
    }

    public android.view.Menu getMenu() {
            r3 = this;
            androidx.appcompat.view.menu.h r0 = r3.f1866q
            if (r0 != 0) goto L_0x0043
            android.content.Context r0 = r3.getContext()
            androidx.appcompat.view.menu.h r1 = new androidx.appcompat.view.menu.h
            r1.<init>(r0)
            r3.f1866q = r1
            androidx.appcompat.view.menu.h r1 = r3.f1866q
            androidx.appcompat.widget.ActionMenuView$d r2 = new androidx.appcompat.widget.ActionMenuView$d
            r2.<init>(r3)
            r1.mo2302a(r2)
            androidx.appcompat.widget.c r1 = new androidx.appcompat.widget.c
            r1.<init>(r0)
            r3.f1870u = r1
            androidx.appcompat.widget.c r0 = r3.f1870u
            r1 = 1
            r0.m2124c(r1)
            androidx.appcompat.widget.c r0 = r3.f1870u
            androidx.appcompat.view.menu.p$a r1 = r3.f1871v
            if (r1 == 0) goto L_0x002d
            goto L_0x0032
        L_0x002d:
            androidx.appcompat.widget.ActionMenuView$b r1 = new androidx.appcompat.widget.ActionMenuView$b
            r1.<init>()
        L_0x0032:
            r0.mo2308a(r1)
            androidx.appcompat.view.menu.h r0 = r3.f1866q
            androidx.appcompat.widget.c r1 = r3.f1870u
            android.content.Context r2 = r3.f1867r
            r0.m2407a(r1, r2)
            androidx.appcompat.widget.c r0 = r3.f1870u
            r0.m2130a(r3)
        L_0x0043:
            androidx.appcompat.view.menu.h r0 = r3.f1866q
            return r0
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
            r1 = this;
            r1.getMenu()
            androidx.appcompat.widget.c r0 = r1.f1870u
            android.graphics.drawable.Drawable r0 = r0.m2120f()
            return r0
    }

    public int getPopupTheme() {
            r1 = this;
            int r0 = r1.f1868s
            return r0
    }

    public int getWindowAnimations() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: h */
    public boolean m2257h() {
            r1 = this;
            androidx.appcompat.widget.c r0 = r1.f1870u
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.m2115j()
            if (r0 == 0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            return r0
    }

    /* renamed from: i */
    public boolean m2256i() {
            r1 = this;
            boolean r0 = r1.f1869t
            return r0
    }

    /* renamed from: j */
    public androidx.appcompat.view.menu.C0496h m2255j() {
            r1 = this;
            androidx.appcompat.view.menu.h r0 = r1.f1866q
            return r0
    }

    /* renamed from: k */
    public boolean m2254k() {
            r1 = this;
            androidx.appcompat.widget.c r0 = r1.f1870u
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.m2114k()
            if (r0 == 0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            return r0
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            androidx.appcompat.widget.c r2 = r1.f1870u
            if (r2 == 0) goto L_0x001d
            r0 = 0
            r2.mo123a(r0)
            androidx.appcompat.widget.c r2 = r1.f1870u
            boolean r2 = r2.m2115j()
            if (r2 == 0) goto L_0x001d
            androidx.appcompat.widget.c r2 = r1.f1870u
            r2.m2118g()
            androidx.appcompat.widget.c r2 = r1.f1870u
            r2.m2114k()
        L_0x001d:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.m2262d()
            return
    }

    @Override // androidx.appcompat.widget.C0593g0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
            r17 = this;
            r0 = r17
            boolean r1 = r0.f1873x
            if (r1 != 0) goto L_0x000a
            super.onLayout(r18, r19, r20, r21, r22)
            return
        L_0x000a:
            int r1 = r17.getChildCount()
            int r2 = r22 - r20
            int r2 = r2 / 2
            int r3 = r17.getDividerWidth()
            int r4 = r21 - r19
            int r5 = r17.getPaddingRight()
            int r5 = r4 - r5
            int r6 = r17.getPaddingLeft()
            int r5 = r5 - r6
            boolean r6 = androidx.appcompat.widget.C0661z0.m1764a(r17)
            r10 = r5
            r5 = 0
            r8 = 0
            r9 = 0
        L_0x002b:
            r11 = 8
            r12 = 1
            if (r5 >= r1) goto L_0x008f
            android.view.View r13 = r0.getChildAt(r5)
            int r14 = r13.getVisibility()
            if (r14 != r11) goto L_0x003b
            goto L_0x008c
        L_0x003b:
            android.view.ViewGroup$LayoutParams r11 = r13.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r11 = (androidx.appcompat.widget.ActionMenuView.C0533c) r11
            boolean r14 = r11.f1876c
            if (r14 == 0) goto L_0x007b
            int r8 = r13.getMeasuredWidth()
            boolean r14 = r0.m2261d(r5)
            if (r14 == 0) goto L_0x0050
            int r8 = r8 + r3
        L_0x0050:
            int r14 = r13.getMeasuredHeight()
            if (r6 == 0) goto L_0x0060
            int r15 = r17.getPaddingLeft()
            int r11 = r11.leftMargin
            int r15 = r15 + r11
            int r11 = r15 + r8
            goto L_0x0070
        L_0x0060:
            int r15 = r17.getWidth()
            int r16 = r17.getPaddingRight()
            int r15 = r15 - r16
            int r11 = r11.rightMargin
            int r11 = r15 - r11
            int r15 = r11 - r8
        L_0x0070:
            int r16 = r14 / 2
            int r7 = r2 - r16
            int r14 = r14 + r7
            r13.layout(r15, r7, r11, r14)
            int r10 = r10 - r8
            r8 = 1
            goto L_0x008c
        L_0x007b:
            int r7 = r13.getMeasuredWidth()
            int r12 = r11.leftMargin
            int r7 = r7 + r12
            int r11 = r11.rightMargin
            int r7 = r7 + r11
            int r10 = r10 - r7
            boolean r7 = r0.m2261d(r5)
            int r9 = r9 + 1
        L_0x008c:
            int r5 = r5 + 1
            goto L_0x002b
        L_0x008f:
            if (r1 != r12) goto L_0x00ae
            if (r8 != 0) goto L_0x00ae
            r3 = 0
            android.view.View r1 = r0.getChildAt(r3)
            int r3 = r1.getMeasuredWidth()
            int r5 = r1.getMeasuredHeight()
            int r4 = r4 / 2
            int r6 = r3 / 2
            int r4 = r4 - r6
            int r6 = r5 / 2
            int r2 = r2 - r6
            int r3 = r3 + r4
            int r5 = r5 + r2
            r1.layout(r4, r2, r3, r5)
            return
        L_0x00ae:
            r3 = r8 ^ 1
            int r9 = r9 - r3
            if (r9 <= 0) goto L_0x00b7
            int r7 = r10 / r9
            r3 = 0
            goto L_0x00b9
        L_0x00b7:
            r3 = 0
            r7 = 0
        L_0x00b9:
            int r4 = java.lang.Math.max(r3, r7)
            if (r6 == 0) goto L_0x00fc
            int r5 = r17.getWidth()
            int r6 = r17.getPaddingRight()
            int r5 = r5 - r6
        L_0x00c8:
            if (r3 >= r1) goto L_0x0134
            android.view.View r6 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r7 = (androidx.appcompat.widget.ActionMenuView.C0533c) r7
            int r8 = r6.getVisibility()
            if (r8 == r11) goto L_0x00f9
            boolean r8 = r7.f1876c
            if (r8 == 0) goto L_0x00df
            goto L_0x00f9
        L_0x00df:
            int r8 = r7.rightMargin
            int r5 = r5 - r8
            int r8 = r6.getMeasuredWidth()
            int r9 = r6.getMeasuredHeight()
            int r10 = r9 / 2
            int r10 = r2 - r10
            int r12 = r5 - r8
            int r9 = r9 + r10
            r6.layout(r12, r10, r5, r9)
            int r6 = r7.leftMargin
            int r8 = r8 + r6
            int r8 = r8 + r4
            int r5 = r5 - r8
        L_0x00f9:
            int r3 = r3 + 1
            goto L_0x00c8
        L_0x00fc:
            int r5 = r17.getPaddingLeft()
        L_0x0100:
            if (r3 >= r1) goto L_0x0134
            android.view.View r6 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r7 = (androidx.appcompat.widget.ActionMenuView.C0533c) r7
            int r8 = r6.getVisibility()
            if (r8 == r11) goto L_0x0131
            boolean r8 = r7.f1876c
            if (r8 == 0) goto L_0x0117
            goto L_0x0131
        L_0x0117:
            int r8 = r7.leftMargin
            int r5 = r5 + r8
            int r8 = r6.getMeasuredWidth()
            int r9 = r6.getMeasuredHeight()
            int r10 = r9 / 2
            int r10 = r2 - r10
            int r12 = r5 + r8
            int r9 = r9 + r10
            r6.layout(r5, r10, r12, r9)
            int r6 = r7.rightMargin
            int r8 = r8 + r6
            int r8 = r8 + r4
            int r5 = r5 + r8
        L_0x0131:
            int r3 = r3 + 1
            goto L_0x0100
        L_0x0134:
            return
    }

    @Override // androidx.appcompat.widget.C0593g0, android.view.View
    protected void onMeasure(int r6, int r7) {
            r5 = this;
            boolean r0 = r5.f1873x
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            r2 = 1
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 != r4) goto L_0x000e
            r1 = 1
            goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            r5.f1873x = r1
            boolean r1 = r5.f1873x
            if (r0 == r1) goto L_0x0017
            r5.f1874y = r3
        L_0x0017:
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            boolean r1 = r5.f1873x
            if (r1 == 0) goto L_0x002c
            androidx.appcompat.view.menu.h r1 = r5.f1866q
            if (r1 == 0) goto L_0x002c
            int r4 = r5.f1874y
            if (r0 == r4) goto L_0x002c
            r5.f1874y = r0
            r1.mo87b(r2)
        L_0x002c:
            int r0 = r5.getChildCount()
            boolean r1 = r5.f1873x
            if (r1 == 0) goto L_0x003a
            if (r0 <= 0) goto L_0x003a
            r5.m2263c(r6, r7)
            goto L_0x0051
        L_0x003a:
            r1 = 0
        L_0x003b:
            if (r1 >= r0) goto L_0x004e
            android.view.View r2 = r5.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r2 = (androidx.appcompat.widget.ActionMenuView.C0533c) r2
            r2.rightMargin = r3
            r2.leftMargin = r3
            int r1 = r1 + 1
            goto L_0x003b
        L_0x004e:
            super.onMeasure(r6, r7)
        L_0x0051:
            return
    }

    public void setExpandedActionViewsExclusive(boolean r2) {
            r1 = this;
            androidx.appcompat.widget.c r0 = r1.f1870u
            r0.m2126b(r2)
            return
    }

    public void setOnMenuItemClickListener(androidx.appcompat.widget.ActionMenuView.AbstractC0535e r1) {
            r0 = this;
            r0.f1865B = r1
            return
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.getMenu()
            androidx.appcompat.widget.c r0 = r1.f1870u
            r0.m2135a(r2)
            return
    }

    public void setOverflowReserved(boolean r1) {
            r0 = this;
            r0.f1869t = r1
            return
    }

    public void setPopupTheme(int r3) {
            r2 = this;
            int r0 = r2.f1868s
            if (r0 == r3) goto L_0x001a
            r2.f1868s = r3
            if (r3 != 0) goto L_0x000f
            android.content.Context r3 = r2.getContext()
            r2.f1867r = r3
            goto L_0x001a
        L_0x000f:
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            r2.f1867r = r0
        L_0x001a:
            return
    }

    public void setPresenter(androidx.appcompat.widget.C0570c r1) {
            r0 = this;
            r0.f1870u = r1
            androidx.appcompat.widget.c r1 = r0.f1870u
            r1.m2130a(r0)
            return
    }
}
