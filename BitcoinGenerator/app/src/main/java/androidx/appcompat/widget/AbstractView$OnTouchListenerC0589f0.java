package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.f0 */
/* loaded from: classes.dex */
public abstract class AbstractView$OnTouchListenerC0589f0 implements android.view.View.OnTouchListener, android.view.View.OnAttachStateChangeListener {

    /* renamed from: b */
    private final float f2097b;

    /* renamed from: c */
    private final int f2098c;

    /* renamed from: d */
    private final int f2099d;

    /* renamed from: e */
    final android.view.View f2100e;

    /* renamed from: f */
    private java.lang.Runnable f2101f;

    /* renamed from: g */
    private java.lang.Runnable f2102g;

    /* renamed from: h */
    private boolean f2103h;

    /* renamed from: i */
    private int f2104i;

    /* renamed from: j */
    private final int[] f2105j;

    /* renamed from: androidx.appcompat.widget.f0$a */
    /* loaded from: classes.dex */
    private class RunnableC0590a implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.widget.AbstractView$OnTouchListenerC0589f0 f2106b;

        RunnableC0590a(androidx.appcompat.widget.AbstractView$OnTouchListenerC0589f0 r1) {
                r0 = this;
                r0.f2106b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.appcompat.widget.f0 r0 = r2.f2106b
                android.view.View r0 = r0.f2100e
                android.view.ViewParent r0 = r0.getParent()
                if (r0 == 0) goto L_0x000e
                r1 = 1
                r0.requestDisallowInterceptTouchEvent(r1)
            L_0x000e:
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.f0$b */
    /* loaded from: classes.dex */
    private class RunnableC0591b implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.widget.AbstractView$OnTouchListenerC0589f0 f2107b;

        RunnableC0591b(androidx.appcompat.widget.AbstractView$OnTouchListenerC0589f0 r1) {
                r0 = this;
                r0.f2107b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                androidx.appcompat.widget.f0 r0 = r1.f2107b
                r0.m2071d()
                return
        }
    }

    public AbstractView$OnTouchListenerC0589f0(android.view.View r3) {
            r2 = this;
            r2.<init>()
            r0 = 2
            int[] r1 = new int[r0]
            r2.f2105j = r1
            r2.f2100e = r3
            r1 = 1
            r3.setLongClickable(r1)
            r3.addOnAttachStateChangeListener(r2)
            android.content.Context r3 = r3.getContext()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            int r3 = r3.getScaledTouchSlop()
            float r3 = (float) r3
            r2.f2097b = r3
            int r3 = android.view.ViewConfiguration.getTapTimeout()
            r2.f2098c = r3
            int r3 = r2.f2098c
            int r1 = android.view.ViewConfiguration.getLongPressTimeout()
            int r3 = r3 + r1
            int r3 = r3 / r0
            r2.f2099d = r3
            return
    }

    /* renamed from: a */
    private boolean m2077a(android.view.MotionEvent r5) {
            r4 = this;
            android.view.View r0 = r4.f2100e
            androidx.appcompat.view.menu.t r1 = r4.mo1839a()
            r2 = 0
            if (r1 == 0) goto L_0x0046
            boolean r3 = r1.mo2036d()
            if (r3 != 0) goto L_0x0010
            goto L_0x0046
        L_0x0010:
            android.widget.ListView r1 = r1.mo2034e()
            androidx.appcompat.widget.d0 r1 = (androidx.appcompat.widget.C0582d0) r1
            if (r1 == 0) goto L_0x0046
            boolean r3 = r1.isShown()
            if (r3 != 0) goto L_0x001f
            goto L_0x0046
        L_0x001f:
            android.view.MotionEvent r3 = android.view.MotionEvent.obtainNoHistory(r5)
            r4.m2075a(r0, r3)
            r4.m2073b(r1, r3)
            int r0 = r4.f2104i
            boolean r0 = r1.m2098a(r3, r0)
            r3.recycle()
            int r5 = r5.getActionMasked()
            r1 = 1
            if (r5 == r1) goto L_0x003e
            r3 = 3
            if (r5 == r3) goto L_0x003e
            r5 = 1
            goto L_0x003f
        L_0x003e:
            r5 = 0
        L_0x003f:
            if (r0 == 0) goto L_0x0044
            if (r5 == 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r1 = 0
        L_0x0045:
            return r1
        L_0x0046:
            return r2
    }

    /* renamed from: a */
    private static boolean m2076a(android.view.View r2, float r3, float r4, float r5) {
            float r0 = -r5
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 < 0) goto L_0x0029
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0029
            int r0 = r2.getRight()
            int r1 = r2.getLeft()
            int r0 = r0 - r1
            float r0 = (float) r0
            float r0 = r0 + r5
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 >= 0) goto L_0x0029
            int r3 = r2.getBottom()
            int r2 = r2.getTop()
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 + r5
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0029
            r2 = 1
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            return r2
    }

    /* renamed from: a */
    private boolean m2075a(android.view.View r3, android.view.MotionEvent r4) {
            r2 = this;
            int[] r0 = r2.f2105j
            r3.getLocationOnScreen(r0)
            r3 = 0
            r3 = r0[r3]
            float r3 = (float) r3
            r1 = 1
            r0 = r0[r1]
            float r0 = (float) r0
            r4.offsetLocation(r3, r0)
            return r1
    }

    /* renamed from: b */
    private boolean m2074b(android.view.MotionEvent r6) {
            r5 = this;
            android.view.View r0 = r5.f2100e
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f2104i
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f2097b
            boolean r6 = m2076a(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.m2070e()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.m2070e()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f2104i = r6
            java.lang.Runnable r6 = r5.f2101f
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.f0$a r6 = new androidx.appcompat.widget.f0$a
            r6.<init>(r5)
            r5.f2101f = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f2101f
            int r1 = r5.f2098c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f2102g
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.f0$b r6 = new androidx.appcompat.widget.f0$b
            r6.<init>(r5)
            r5.f2102g = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f2102g
            int r1 = r5.f2099d
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
    }

    /* renamed from: b */
    private boolean m2073b(android.view.View r3, android.view.MotionEvent r4) {
            r2 = this;
            int[] r0 = r2.f2105j
            r3.getLocationOnScreen(r0)
            r3 = 0
            r3 = r0[r3]
            int r3 = -r3
            float r3 = (float) r3
            r1 = 1
            r0 = r0[r1]
            int r0 = -r0
            float r0 = (float) r0
            r4.offsetLocation(r3, r0)
            return r1
    }

    /* renamed from: e */
    private void m2070e() {
            r2 = this;
            java.lang.Runnable r0 = r2.f2102g
            if (r0 == 0) goto L_0x0009
            android.view.View r1 = r2.f2100e
            r1.removeCallbacks(r0)
        L_0x0009:
            java.lang.Runnable r0 = r2.f2101f
            if (r0 == 0) goto L_0x0012
            android.view.View r1 = r2.f2100e
            r1.removeCallbacks(r0)
        L_0x0012:
            return
    }

    /* renamed from: a */
    public abstract androidx.appcompat.view.menu.AbstractC0519t mo1839a();

    /* renamed from: b */
    protected abstract boolean mo1838b();

    /* renamed from: c */
    protected boolean mo2072c() {
            r2 = this;
            androidx.appcompat.view.menu.t r0 = r2.mo1839a()
            if (r0 == 0) goto L_0x000f
            boolean r1 = r0.mo2036d()
            if (r1 == 0) goto L_0x000f
            r0.dismiss()
        L_0x000f:
            r0 = 1
            return r0
    }

    /* renamed from: d */
    void m2071d() {
            r11 = this;
            r11.m2070e()
            android.view.View r0 = r11.f2100e
            boolean r1 = r0.isEnabled()
            if (r1 == 0) goto L_0x0036
            boolean r1 = r0.isLongClickable()
            if (r1 == 0) goto L_0x0012
            goto L_0x0036
        L_0x0012:
            boolean r1 = r11.mo1838b()
            if (r1 != 0) goto L_0x0019
            return
        L_0x0019:
            android.view.ViewParent r1 = r0.getParent()
            r2 = 1
            r1.requestDisallowInterceptTouchEvent(r2)
            long r5 = android.os.SystemClock.uptimeMillis()
            r7 = 3
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r5
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            r0.onTouchEvent(r1)
            r1.recycle()
            r11.f2103h = r2
        L_0x0036:
            return
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
            r10 = this;
            boolean r11 = r10.f2103h
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L_0x0017
            boolean r12 = r10.m2077a(r12)
            if (r12 != 0) goto L_0x0015
            boolean r12 = r10.mo2072c()
            if (r12 != 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r12 = 0
            goto L_0x003d
        L_0x0015:
            r12 = 1
            goto L_0x003d
        L_0x0017:
            boolean r12 = r10.m2074b(r12)
            if (r12 == 0) goto L_0x0025
            boolean r12 = r10.mo1838b()
            if (r12 == 0) goto L_0x0025
            r12 = 1
            goto L_0x0026
        L_0x0025:
            r12 = 0
        L_0x0026:
            if (r12 == 0) goto L_0x003d
            long r4 = android.os.SystemClock.uptimeMillis()
            r6 = 3
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r4
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r2, r4, r6, r7, r8, r9)
            android.view.View r3 = r10.f2100e
            r3.onTouchEvent(r2)
            r2.recycle()
        L_0x003d:
            r10.f2103h = r12
            if (r12 != 0) goto L_0x0045
            if (r11 == 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            return r0
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View r2) {
            r1 = this;
            r2 = 0
            r1.f2103h = r2
            r2 = -1
            r1.f2104i = r2
            java.lang.Runnable r2 = r1.f2101f
            if (r2 == 0) goto L_0x000f
            android.view.View r0 = r1.f2100e
            r0.removeCallbacks(r2)
        L_0x000f:
            return
    }
}
