package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.x0 */
/* loaded from: classes.dex */
class C0657x0 {

    /* renamed from: a */
    private final android.content.Context f2359a;

    /* renamed from: b */
    private final android.view.View f2360b;

    /* renamed from: c */
    private final android.widget.TextView f2361c;

    /* renamed from: d */
    private final android.view.WindowManager.LayoutParams f2362d;

    /* renamed from: e */
    private final android.graphics.Rect f2363e;

    /* renamed from: f */
    private final int[] f2364f;

    /* renamed from: g */
    private final int[] f2365g;

    C0657x0(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            r2.f2362d = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.f2363e = r0
            r0 = 2
            int[] r1 = new int[r0]
            r2.f2364f = r1
            int[] r0 = new int[r0]
            r2.f2365g = r0
            r2.f2359a = r3
            android.content.Context r3 = r2.f2359a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            int r0 = p000a.p001a.C0006g.abc_tooltip
            r1 = 0
            android.view.View r3 = r3.inflate(r0, r1)
            r2.f2360b = r3
            android.view.View r3 = r2.f2360b
            int r0 = p000a.p001a.C0005f.message
            android.view.View r3 = r3.findViewById(r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.f2361c = r3
            android.view.WindowManager$LayoutParams r3 = r2.f2362d
            java.lang.Class<androidx.appcompat.widget.x0> r0 = androidx.appcompat.widget.C0657x0.class
            java.lang.String r0 = r0.getSimpleName()
            r3.setTitle(r0)
            android.view.WindowManager$LayoutParams r3 = r2.f2362d
            android.content.Context r0 = r2.f2359a
            java.lang.String r0 = r0.getPackageName()
            r3.packageName = r0
            android.view.WindowManager$LayoutParams r3 = r2.f2362d
            r0 = 1002(0x3ea, float:1.404E-42)
            r3.type = r0
            r0 = -2
            r3.width = r0
            r3.height = r0
            r0 = -3
            r3.format = r0
            int r0 = p000a.p001a.C0008i.Animation_AppCompat_Tooltip
            r3.windowAnimations = r0
            r0 = 24
            r3.flags = r0
            return
    }

    /* renamed from: a */
    private static android.view.View m1798a(android.view.View r3) {
            android.view.View r0 = r3.getRootView()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r2 = r1 instanceof android.view.WindowManager.LayoutParams
            if (r2 == 0) goto L_0x0014
            android.view.WindowManager$LayoutParams r1 = (android.view.WindowManager.LayoutParams) r1
            int r1 = r1.type
            r2 = 2
            if (r1 != r2) goto L_0x0014
            return r0
        L_0x0014:
            android.content.Context r3 = r3.getContext()
        L_0x0018:
            boolean r1 = r3 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L_0x0032
            boolean r1 = r3 instanceof android.app.Activity
            if (r1 == 0) goto L_0x002b
            android.app.Activity r3 = (android.app.Activity) r3
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            return r3
        L_0x002b:
            android.content.ContextWrapper r3 = (android.content.ContextWrapper) r3
            android.content.Context r3 = r3.getBaseContext()
            goto L_0x0018
        L_0x0032:
            return r0
    }

    /* renamed from: a */
    private void m1797a(android.view.View r9, int r10, int r11, boolean r12, android.view.WindowManager.LayoutParams r13) {
            r8 = this;
            android.os.IBinder r0 = r9.getApplicationWindowToken()
            r13.token = r0
            android.content.Context r0 = r8.f2359a
            android.content.res.Resources r0 = r0.getResources()
            int r1 = p000a.p001a.C0003d.tooltip_precise_anchor_threshold
            int r0 = r0.getDimensionPixelOffset(r1)
            int r1 = r9.getWidth()
            if (r1 < r0) goto L_0x0019
            goto L_0x001f
        L_0x0019:
            int r10 = r9.getWidth()
            int r10 = r10 / 2
        L_0x001f:
            int r1 = r9.getHeight()
            r2 = 0
            if (r1 < r0) goto L_0x0036
            android.content.Context r0 = r8.f2359a
            android.content.res.Resources r0 = r0.getResources()
            int r1 = p000a.p001a.C0003d.tooltip_precise_anchor_extra_offset
            int r0 = r0.getDimensionPixelOffset(r1)
            int r1 = r11 + r0
            int r11 = r11 - r0
            goto L_0x003b
        L_0x0036:
            int r1 = r9.getHeight()
            r11 = 0
        L_0x003b:
            r0 = 49
            r13.gravity = r0
            android.content.Context r0 = r8.f2359a
            android.content.res.Resources r0 = r0.getResources()
            if (r12 == 0) goto L_0x004a
            int r3 = p000a.p001a.C0003d.tooltip_y_offset_touch
            goto L_0x004c
        L_0x004a:
            int r3 = p000a.p001a.C0003d.tooltip_y_offset_non_touch
        L_0x004c:
            int r0 = r0.getDimensionPixelOffset(r3)
            android.view.View r3 = m1798a(r9)
            if (r3 != 0) goto L_0x005e
            java.lang.String r9 = "TooltipPopup"
            java.lang.String r10 = "Cannot find app view"
            android.util.Log.e(r9, r10)
            return
        L_0x005e:
            android.graphics.Rect r4 = r8.f2363e
            r3.getWindowVisibleDisplayFrame(r4)
            android.graphics.Rect r4 = r8.f2363e
            int r5 = r4.left
            if (r5 >= 0) goto L_0x0092
            int r4 = r4.top
            if (r4 >= 0) goto L_0x0092
            android.content.Context r4 = r8.f2359a
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r5 = "status_bar_height"
            java.lang.String r6 = "dimen"
            java.lang.String r7 = "android"
            int r5 = r4.getIdentifier(r5, r6, r7)
            if (r5 == 0) goto L_0x0084
            int r5 = r4.getDimensionPixelSize(r5)
            goto L_0x0085
        L_0x0084:
            r5 = 0
        L_0x0085:
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            android.graphics.Rect r6 = r8.f2363e
            int r7 = r4.widthPixels
            int r4 = r4.heightPixels
            r6.set(r2, r5, r7, r4)
        L_0x0092:
            int[] r4 = r8.f2365g
            r3.getLocationOnScreen(r4)
            int[] r4 = r8.f2364f
            r9.getLocationOnScreen(r4)
            int[] r9 = r8.f2364f
            r4 = r9[r2]
            int[] r5 = r8.f2365g
            r6 = r5[r2]
            int r4 = r4 - r6
            r9[r2] = r4
            r4 = 1
            r6 = r9[r4]
            r5 = r5[r4]
            int r6 = r6 - r5
            r9[r4] = r6
            r9 = r9[r2]
            int r9 = r9 + r10
            int r10 = r3.getWidth()
            int r10 = r10 / 2
            int r9 = r9 - r10
            r13.x = r9
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            android.view.View r10 = r8.f2360b
            r10.measure(r9, r9)
            android.view.View r9 = r8.f2360b
            int r9 = r9.getMeasuredHeight()
            int[] r10 = r8.f2364f
            r2 = r10[r4]
            int r2 = r2 + r11
            int r2 = r2 - r0
            int r2 = r2 - r9
            r10 = r10[r4]
            int r10 = r10 + r1
            int r10 = r10 + r0
            if (r12 == 0) goto L_0x00da
            if (r2 < 0) goto L_0x00e3
            goto L_0x00e6
        L_0x00da:
            int r9 = r9 + r10
            android.graphics.Rect r11 = r8.f2363e
            int r11 = r11.height()
            if (r9 > r11) goto L_0x00e6
        L_0x00e3:
            r13.y = r10
            goto L_0x00e8
        L_0x00e6:
            r13.y = r2
        L_0x00e8:
            return
    }

    /* renamed from: a */
    void m1799a() {
            r2 = this;
            boolean r0 = r2.m1795b()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.content.Context r0 = r2.f2359a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.View r1 = r2.f2360b
            r0.removeView(r1)
            return
    }

    /* renamed from: a */
    void m1796a(android.view.View r8, int r9, int r10, boolean r11, java.lang.CharSequence r12) {
            r7 = this;
            boolean r0 = r7.m1795b()
            if (r0 == 0) goto L_0x0009
            r7.m1799a()
        L_0x0009:
            android.widget.TextView r0 = r7.f2361c
            r0.setText(r12)
            android.view.WindowManager$LayoutParams r6 = r7.f2362d
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.m1797a(r2, r3, r4, r5, r6)
            android.content.Context r8 = r7.f2359a
            java.lang.String r9 = "window"
            java.lang.Object r8 = r8.getSystemService(r9)
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            android.view.View r9 = r7.f2360b
            android.view.WindowManager$LayoutParams r10 = r7.f2362d
            r8.addView(r9, r10)
            return
    }

    /* renamed from: b */
    boolean m1795b() {
            r1 = this;
            android.view.View r0 = r1.f2360b
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            return r0
    }
}
