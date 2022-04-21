package p000a.p018g.p029l;

/* renamed from: a.g.l.r */
/* loaded from: classes.dex */
public class C0216r {

    /* renamed from: a */
    private static java.lang.reflect.Field f660a;

    /* renamed from: b */
    private static boolean f661b;

    /* renamed from: c */
    private static java.lang.reflect.Field f662c;

    /* renamed from: d */
    private static boolean f663d;

    /* renamed from: e */
    private static java.util.WeakHashMap<android.view.View, java.lang.String> f664e;

    /* renamed from: f */
    private static java.util.WeakHashMap<android.view.View, p000a.p018g.p029l.C0223v> f665f;

    /* renamed from: g */
    private static java.lang.reflect.Field f666g;

    /* renamed from: h */
    private static boolean f667h;

    /* renamed from: i */
    private static java.lang.ThreadLocal<android.graphics.Rect> f668i;

    /* renamed from: a.g.l.r$a */
    /* loaded from: classes.dex */
    static class View$OnApplyWindowInsetsListenerC0217a implements android.view.View.OnApplyWindowInsetsListener {

        /* renamed from: a */
        final /* synthetic */ p000a.p018g.p029l.AbstractC0213o f669a;

        View$OnApplyWindowInsetsListenerC0217a(p000a.p018g.p029l.AbstractC0213o r1) {
                r0 = this;
                r0.f669a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public android.view.WindowInsets onApplyWindowInsets(android.view.View r2, android.view.WindowInsets r3) {
                r1 = this;
                a.g.l.z r3 = p000a.p018g.p029l.C0230z.m3359a(r3)
                a.g.l.o r0 = r1.f669a
                a.g.l.z r2 = r0.mo86a(r2, r3)
                java.lang.Object r2 = p000a.p018g.p029l.C0230z.m3360a(r2)
                android.view.WindowInsets r2 = (android.view.WindowInsets) r2
                return r2
        }
    }

    /* renamed from: a.g.l.r$b */
    /* loaded from: classes.dex */
    public interface AbstractC0218b {
        /* renamed from: a */
        boolean m3394a(android.view.View r1, android.view.KeyEvent r2);
    }

    /* renamed from: a.g.l.r$c */
    /* loaded from: classes.dex */
    static class C0219c {

        /* renamed from: d */
        private static final java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> f670d = null;

        /* renamed from: a */
        private java.util.WeakHashMap<android.view.View, java.lang.Boolean> f671a;

        /* renamed from: b */
        private android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> f672b;

        /* renamed from: c */
        private java.lang.ref.WeakReference<android.view.KeyEvent> f673c;

        static {
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                p000a.p018g.p029l.C0216r.C0219c.f670d = r0
                return
        }

        C0219c() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f671a = r0
                r1.f672b = r0
                r1.f673c = r0
                return
        }

        /* renamed from: a */
        static p000a.p018g.p029l.C0216r.C0219c m3391a(android.view.View r2) {
                int r0 = p000a.p018g.C0122b.tag_unhandled_key_event_manager
                java.lang.Object r0 = r2.getTag(r0)
                a.g.l.r$c r0 = (p000a.p018g.p029l.C0216r.C0219c) r0
                if (r0 != 0) goto L_0x0014
                a.g.l.r$c r0 = new a.g.l.r$c
                r0.<init>()
                int r1 = p000a.p018g.C0122b.tag_unhandled_key_event_manager
                r2.setTag(r1, r0)
            L_0x0014:
                return r0
        }

        /* renamed from: a */
        private android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> m3393a() {
                r1 = this;
                android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> r0 = r1.f672b
                if (r0 != 0) goto L_0x000b
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r1.f672b = r0
            L_0x000b:
                android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> r0 = r1.f672b
                return r0
        }

        /* renamed from: b */
        private android.view.View m3388b(android.view.View r5, android.view.KeyEvent r6) {
                r4 = this;
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r4.f671a
                r1 = 0
                if (r0 == 0) goto L_0x0030
                boolean r0 = r0.containsKey(r5)
                if (r0 != 0) goto L_0x000c
                goto L_0x0030
            L_0x000c:
                boolean r0 = r5 instanceof android.view.ViewGroup
                if (r0 == 0) goto L_0x0029
                r0 = r5
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                int r2 = r0.getChildCount()
                int r2 = r2 + (-1)
            L_0x0019:
                if (r2 < 0) goto L_0x0029
                android.view.View r3 = r0.getChildAt(r2)
                android.view.View r3 = r4.m3388b(r3, r6)
                if (r3 == 0) goto L_0x0026
                return r3
            L_0x0026:
                int r2 = r2 + (-1)
                goto L_0x0019
            L_0x0029:
                boolean r6 = r4.m3387c(r5, r6)
                if (r6 == 0) goto L_0x0030
                return r5
            L_0x0030:
                return r1
        }

        /* renamed from: b */
        private void m3389b() {
                r6 = this;
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r6.f671a
                if (r0 == 0) goto L_0x0007
                r0.clear()
            L_0x0007:
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r0 = p000a.p018g.p029l.C0216r.C0219c.f670d
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0010
                return
            L_0x0010:
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r0 = p000a.p018g.p029l.C0216r.C0219c.f670d
                monitor-enter(r0)
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r1 = r6.f671a     // Catch: all -> 0x0061
                if (r1 != 0) goto L_0x001e
                java.util.WeakHashMap r1 = new java.util.WeakHashMap     // Catch: all -> 0x0061
                r1.<init>()     // Catch: all -> 0x0061
                r6.f671a = r1     // Catch: all -> 0x0061
            L_0x001e:
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r1 = p000a.p018g.p029l.C0216r.C0219c.f670d     // Catch: all -> 0x0061
                int r1 = r1.size()     // Catch: all -> 0x0061
                int r1 = r1 + (-1)
            L_0x0026:
                if (r1 < 0) goto L_0x005f
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r2 = p000a.p018g.p029l.C0216r.C0219c.f670d     // Catch: all -> 0x0061
                java.lang.Object r2 = r2.get(r1)     // Catch: all -> 0x0061
                java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: all -> 0x0061
                java.lang.Object r2 = r2.get()     // Catch: all -> 0x0061
                android.view.View r2 = (android.view.View) r2     // Catch: all -> 0x0061
                if (r2 != 0) goto L_0x003e
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r2 = p000a.p018g.p029l.C0216r.C0219c.f670d     // Catch: all -> 0x0061
                r2.remove(r1)     // Catch: all -> 0x0061
                goto L_0x005c
            L_0x003e:
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r3 = r6.f671a     // Catch: all -> 0x0061
                java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: all -> 0x0061
                r3.put(r2, r4)     // Catch: all -> 0x0061
                android.view.ViewParent r2 = r2.getParent()     // Catch: all -> 0x0061
            L_0x0049:
                boolean r3 = r2 instanceof android.view.View     // Catch: all -> 0x0061
                if (r3 == 0) goto L_0x005c
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r3 = r6.f671a     // Catch: all -> 0x0061
                r4 = r2
                android.view.View r4 = (android.view.View) r4     // Catch: all -> 0x0061
                java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: all -> 0x0061
                r3.put(r4, r5)     // Catch: all -> 0x0061
                android.view.ViewParent r2 = r2.getParent()     // Catch: all -> 0x0061
                goto L_0x0049
            L_0x005c:
                int r1 = r1 + (-1)
                goto L_0x0026
            L_0x005f:
                monitor-exit(r0)     // Catch: all -> 0x0061
                return
            L_0x0061:
                r1 = move-exception
                monitor-exit(r0)     // Catch: all -> 0x0061
                goto L_0x0065
            L_0x0064:
                throw r1
            L_0x0065:
                goto L_0x0064
        }

        /* renamed from: c */
        private boolean m3387c(android.view.View r5, android.view.KeyEvent r6) {
                r4 = this;
                int r0 = p000a.p018g.C0122b.tag_unhandled_key_listeners
                java.lang.Object r0 = r5.getTag(r0)
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                if (r0 == 0) goto L_0x0022
                int r1 = r0.size()
                r2 = 1
                int r1 = r1 - r2
            L_0x0010:
                if (r1 < 0) goto L_0x0022
                java.lang.Object r3 = r0.get(r1)
                a.g.l.r$b r3 = (p000a.p018g.p029l.C0216r.AbstractC0218b) r3
                boolean r3 = r3.m3394a(r5, r6)
                if (r3 == 0) goto L_0x001f
                return r2
            L_0x001f:
                int r1 = r1 + (-1)
                goto L_0x0010
            L_0x0022:
                r5 = 0
                return r5
        }

        /* renamed from: a */
        boolean m3392a(android.view.KeyEvent r6) {
                r5 = this;
                java.lang.ref.WeakReference<android.view.KeyEvent> r0 = r5.f673c
                r1 = 0
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.get()
                if (r0 != r6) goto L_0x000c
                return r1
            L_0x000c:
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r6)
                r5.f673c = r0
                r0 = 0
                android.util.SparseArray r2 = r5.m3393a()
                int r3 = r6.getAction()
                r4 = 1
                if (r3 != r4) goto L_0x0032
                int r3 = r6.getKeyCode()
                int r3 = r2.indexOfKey(r3)
                if (r3 < 0) goto L_0x0032
                java.lang.Object r0 = r2.valueAt(r3)
                java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
                r2.removeAt(r3)
            L_0x0032:
                if (r0 != 0) goto L_0x003e
                int r0 = r6.getKeyCode()
                java.lang.Object r0 = r2.get(r0)
                java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            L_0x003e:
                if (r0 == 0) goto L_0x0052
                java.lang.Object r0 = r0.get()
                android.view.View r0 = (android.view.View) r0
                if (r0 == 0) goto L_0x0051
                boolean r1 = p000a.p018g.p029l.C0216r.m3398w(r0)
                if (r1 == 0) goto L_0x0051
                r5.m3387c(r0, r6)
            L_0x0051:
                return r4
            L_0x0052:
                return r1
        }

        /* renamed from: a */
        boolean m3390a(android.view.View r3, android.view.KeyEvent r4) {
                r2 = this;
                int r0 = r4.getAction()
                if (r0 != 0) goto L_0x0009
                r2.m3389b()
            L_0x0009:
                android.view.View r3 = r2.m3388b(r3, r4)
                int r0 = r4.getAction()
                if (r0 != 0) goto L_0x002b
                int r4 = r4.getKeyCode()
                if (r3 == 0) goto L_0x002b
                boolean r0 = android.view.KeyEvent.isModifierKey(r4)
                if (r0 != 0) goto L_0x002b
                android.util.SparseArray r0 = r2.m3393a()
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r1.<init>(r3)
                r0.put(r4, r1)
            L_0x002b:
                if (r3 == 0) goto L_0x002f
                r3 = 1
                goto L_0x0030
            L_0x002f:
                r3 = 0
            L_0x0030:
                return r3
        }
    }

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 1
            r0.<init>(r1)
            r0 = 0
            p000a.p018g.p029l.C0216r.f665f = r0
            r0 = 0
            p000a.p018g.p029l.C0216r.f667h = r0
            return
    }

    /* renamed from: A */
    public static void m3450A(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x000a
            r2.postInvalidateOnAnimation()
            goto L_0x000d
        L_0x000a:
            r2.postInvalidate()
        L_0x000d:
            return
    }

    /* renamed from: B */
    public static void m3449B(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 20
            if (r0 < r1) goto L_0x000a
            r2.requestApplyInsets()
            goto L_0x0011
        L_0x000a:
            r1 = 16
            if (r0 < r1) goto L_0x0011
            r2.requestFitSystemWindows()
        L_0x0011:
            return
    }

    /* renamed from: C */
    public static void m3448C(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000a
            r2.stopNestedScroll()
            goto L_0x0013
        L_0x000a:
            boolean r0 = r2 instanceof p000a.p018g.p029l.AbstractC0208j
            if (r0 == 0) goto L_0x0013
            a.g.l.j r2 = (p000a.p018g.p029l.AbstractC0208j) r2
            r2.stopNestedScroll()
        L_0x0013:
            return
    }

    /* renamed from: D */
    private static void m3447D(android.view.View r2) {
            float r0 = r2.getTranslationY()
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            r2.setTranslationY(r1)
            r2.setTranslationY(r0)
            return
    }

    /* renamed from: a */
    public static p000a.p018g.p029l.C0223v m3445a(android.view.View r2) {
            java.util.WeakHashMap<android.view.View, a.g.l.v> r0 = p000a.p018g.p029l.C0216r.f665f
            if (r0 != 0) goto L_0x000b
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            p000a.p018g.p029l.C0216r.f665f = r0
        L_0x000b:
            java.util.WeakHashMap<android.view.View, a.g.l.v> r0 = p000a.p018g.p029l.C0216r.f665f
            java.lang.Object r0 = r0.get(r2)
            a.g.l.v r0 = (p000a.p018g.p029l.C0223v) r0
            if (r0 != 0) goto L_0x001f
            a.g.l.v r0 = new a.g.l.v
            r0.<init>(r2)
            java.util.WeakHashMap<android.view.View, a.g.l.v> r1 = p000a.p018g.p029l.C0216r.f665f
            r1.put(r2, r0)
        L_0x001f:
            return r0
    }

    /* renamed from: a */
    public static p000a.p018g.p029l.C0230z m3438a(android.view.View r2, p000a.p018g.p029l.C0230z r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x001c
            java.lang.Object r3 = p000a.p018g.p029l.C0230z.m3360a(r3)
            android.view.WindowInsets r3 = (android.view.WindowInsets) r3
            android.view.WindowInsets r2 = r2.dispatchApplyWindowInsets(r3)
            if (r2 == r3) goto L_0x0017
            android.view.WindowInsets r3 = new android.view.WindowInsets
            r3.<init>(r2)
        L_0x0017:
            a.g.l.z r2 = p000a.p018g.p029l.C0230z.m3359a(r3)
            return r2
        L_0x001c:
            return r3
    }

    /* renamed from: a */
    private static android.graphics.Rect m3446a() {
            java.lang.ThreadLocal<android.graphics.Rect> r0 = p000a.p018g.p029l.C0216r.f668i
            if (r0 != 0) goto L_0x000b
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            p000a.p018g.p029l.C0216r.f668i = r0
        L_0x000b:
            java.lang.ThreadLocal<android.graphics.Rect> r0 = p000a.p018g.p029l.C0216r.f668i
            java.lang.Object r0 = r0.get()
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            if (r0 != 0) goto L_0x001f
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            java.lang.ThreadLocal<android.graphics.Rect> r1 = p000a.p018g.p029l.C0216r.f668i
            r1.set(r0)
        L_0x001f:
            r0.setEmpty()
            return r0
    }

    /* renamed from: a */
    public static void m3444a(android.view.View r2, float r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x0009
            r2.setElevation(r3)
        L_0x0009:
            return
    }

    /* renamed from: a */
    private static void m3443a(android.view.View r0, int r1) {
            r0.offsetLeftAndRight(r1)
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L_0x0019
            m3447D(r0)
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0019
            android.view.View r0 = (android.view.View) r0
            m3447D(r0)
        L_0x0019:
            return
    }

    /* renamed from: a */
    public static void m3442a(android.view.View r2, int r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x0009
            r2.setScrollIndicators(r3, r4)
        L_0x0009:
            return
    }

    /* renamed from: a */
    public static void m3441a(android.view.View r2, int r3, int r4, int r5, int r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 < r1) goto L_0x000a
            r2.setPaddingRelative(r3, r4, r5, r6)
            goto L_0x000d
        L_0x000a:
            r2.setPadding(r3, r4, r5, r6)
        L_0x000d:
            return
    }

    /* renamed from: a */
    public static void m3440a(android.view.View r0, p000a.p018g.p029l.C0185a r1) {
            if (r1 != 0) goto L_0x0004
            r1 = 0
            goto L_0x0008
        L_0x0004:
            android.view.View$AccessibilityDelegate r1 = r1.m3554a()
        L_0x0008:
            r0.setAccessibilityDelegate(r1)
            return
    }

    /* renamed from: a */
    public static void m3439a(android.view.View r2, p000a.p018g.p029l.AbstractC0213o r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x0015
            if (r3 != 0) goto L_0x000d
            r3 = 0
            r2.setOnApplyWindowInsetsListener(r3)
            return
        L_0x000d:
            a.g.l.r$a r0 = new a.g.l.r$a
            r0.<init>(r3)
            r2.setOnApplyWindowInsetsListener(r0)
        L_0x0015:
            return
    }

    /* renamed from: a */
    public static void m3437a(android.view.View r2, android.content.res.ColorStateList r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x0036
            r2.setBackgroundTintList(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 != r1) goto L_0x003f
            android.graphics.drawable.Drawable r3 = r2.getBackground()
            android.content.res.ColorStateList r0 = r2.getBackgroundTintList()
            if (r0 != 0) goto L_0x0020
            android.graphics.PorterDuff$Mode r0 = r2.getBackgroundTintMode()
            if (r0 == 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r0 = 0
            goto L_0x0021
        L_0x0020:
            r0 = 1
        L_0x0021:
            if (r3 == 0) goto L_0x003f
            if (r0 == 0) goto L_0x003f
            boolean r0 = r3.isStateful()
            if (r0 == 0) goto L_0x0032
            int[] r0 = r2.getDrawableState()
            r3.setState(r0)
        L_0x0032:
            r2.setBackground(r3)
            goto L_0x003f
        L_0x0036:
            boolean r0 = r2 instanceof p000a.p018g.p029l.AbstractC0215q
            if (r0 == 0) goto L_0x003f
            a.g.l.q r2 = (p000a.p018g.p029l.AbstractC0215q) r2
            r2.setSupportBackgroundTintList(r3)
        L_0x003f:
            return
    }

    /* renamed from: a */
    public static void m3436a(android.view.View r2, android.graphics.PorterDuff.Mode r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x0036
            r2.setBackgroundTintMode(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 != r1) goto L_0x003f
            android.graphics.drawable.Drawable r3 = r2.getBackground()
            android.content.res.ColorStateList r0 = r2.getBackgroundTintList()
            if (r0 != 0) goto L_0x0020
            android.graphics.PorterDuff$Mode r0 = r2.getBackgroundTintMode()
            if (r0 == 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r0 = 0
            goto L_0x0021
        L_0x0020:
            r0 = 1
        L_0x0021:
            if (r3 == 0) goto L_0x003f
            if (r0 == 0) goto L_0x003f
            boolean r0 = r3.isStateful()
            if (r0 == 0) goto L_0x0032
            int[] r0 = r2.getDrawableState()
            r3.setState(r0)
        L_0x0032:
            r2.setBackground(r3)
            goto L_0x003f
        L_0x0036:
            boolean r0 = r2 instanceof p000a.p018g.p029l.AbstractC0215q
            if (r0 == 0) goto L_0x003f
            a.g.l.q r2 = (p000a.p018g.p029l.AbstractC0215q) r2
            r2.setSupportBackgroundTintMode(r3)
        L_0x003f:
            return
    }

    /* renamed from: a */
    public static void m3435a(android.view.View r2, android.graphics.Rect r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 18
            if (r0 < r1) goto L_0x0009
            r2.setClipBounds(r3)
        L_0x0009:
            return
    }

    /* renamed from: a */
    public static void m3434a(android.view.View r2, android.graphics.drawable.Drawable r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x000a
            r2.setBackground(r3)
            goto L_0x000d
        L_0x000a:
            r2.setBackgroundDrawable(r3)
        L_0x000d:
            return
    }

    /* renamed from: a */
    public static void m3432a(android.view.View r2, java.lang.Runnable r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x000a
            r2.postOnAnimation(r3)
            goto L_0x0011
        L_0x000a:
            long r0 = android.animation.ValueAnimator.getFrameDelay()
            r2.postDelayed(r3, r0)
        L_0x0011:
            return
    }

    /* renamed from: a */
    public static void m3431a(android.view.View r2, java.lang.Runnable r3, long r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x000a
            r2.postOnAnimationDelayed(r3, r4)
            goto L_0x0012
        L_0x000a:
            long r0 = android.animation.ValueAnimator.getFrameDelay()
            long r0 = r0 + r4
            r2.postDelayed(r3, r0)
        L_0x0012:
            return
    }

    /* renamed from: a */
    public static void m3430a(android.view.View r2, java.lang.String r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000a
            r2.setTransitionName(r3)
            goto L_0x001a
        L_0x000a:
            java.util.WeakHashMap<android.view.View, java.lang.String> r0 = p000a.p018g.p029l.C0216r.f664e
            if (r0 != 0) goto L_0x0015
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            p000a.p018g.p029l.C0216r.f664e = r0
        L_0x0015:
            java.util.WeakHashMap<android.view.View, java.lang.String> r0 = p000a.p018g.p029l.C0216r.f664e
            r0.put(r2, r3)
        L_0x001a:
            return
    }

    @java.lang.Deprecated
    /* renamed from: a */
    public static void m3429a(android.view.View r0, boolean r1) {
            r0.setFitsSystemWindows(r1)
            return
    }

    /* renamed from: a */
    static boolean m3433a(android.view.View r2, android.view.KeyEvent r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x0008
            r2 = 0
            return r2
        L_0x0008:
            a.g.l.r$c r0 = p000a.p018g.p029l.C0216r.C0219c.m3391a(r2)
            boolean r2 = r0.m3390a(r2, r3)
            return r2
    }

    /* renamed from: b */
    public static p000a.p018g.p029l.C0230z m3426b(android.view.View r2, p000a.p018g.p029l.C0230z r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x001c
            java.lang.Object r3 = p000a.p018g.p029l.C0230z.m3360a(r3)
            android.view.WindowInsets r3 = (android.view.WindowInsets) r3
            android.view.WindowInsets r2 = r2.onApplyWindowInsets(r3)
            if (r2 == r3) goto L_0x0017
            android.view.WindowInsets r3 = new android.view.WindowInsets
            r3.<init>(r2)
        L_0x0017:
            a.g.l.z r2 = p000a.p018g.p029l.C0230z.m3359a(r3)
            return r2
        L_0x001c:
            return r3
    }

    /* renamed from: b */
    public static android.content.res.ColorStateList m3428b(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000b
            android.content.res.ColorStateList r2 = r2.getBackgroundTintList()
            return r2
        L_0x000b:
            boolean r0 = r2 instanceof p000a.p018g.p029l.AbstractC0215q
            if (r0 == 0) goto L_0x0016
            a.g.l.q r2 = (p000a.p018g.p029l.AbstractC0215q) r2
            android.content.res.ColorStateList r2 = r2.getSupportBackgroundTintList()
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            return r2
    }

    /* renamed from: b */
    private static void m3427b(android.view.View r0, int r1) {
            r0.offsetTopAndBottom(r1)
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L_0x0019
            m3447D(r0)
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0019
            android.view.View r0 = (android.view.View) r0
            m3447D(r0)
        L_0x0019:
            return
    }

    /* renamed from: b */
    public static void m3424b(android.view.View r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x0009
            r2.setHasTransientState(r3)
        L_0x0009:
            return
    }

    /* renamed from: b */
    static boolean m3425b(android.view.View r2, android.view.KeyEvent r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x0008
            r2 = 0
            return r2
        L_0x0008:
            a.g.l.r$c r2 = p000a.p018g.p029l.C0216r.C0219c.m3391a(r2)
            boolean r2 = r2.m3392a(r3)
            return r2
    }

    /* renamed from: c */
    public static android.graphics.PorterDuff.Mode m3423c(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000b
            android.graphics.PorterDuff$Mode r2 = r2.getBackgroundTintMode()
            return r2
        L_0x000b:
            boolean r0 = r2 instanceof p000a.p018g.p029l.AbstractC0215q
            if (r0 == 0) goto L_0x0016
            a.g.l.q r2 = (p000a.p018g.p029l.AbstractC0215q) r2
            android.graphics.PorterDuff$Mode r2 = r2.getSupportBackgroundTintMode()
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            return r2
    }

    /* renamed from: c */
    public static void m3422c(android.view.View r6, int r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x000a
            r6.offsetLeftAndRight(r7)
            goto L_0x006b
        L_0x000a:
            r1 = 21
            if (r0 < r1) goto L_0x0068
            android.graphics.Rect r0 = m3446a()
            r1 = 0
            android.view.ViewParent r2 = r6.getParent()
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L_0x0047
            r1 = r2
            android.view.View r1 = (android.view.View) r1
            int r3 = r1.getLeft()
            int r4 = r1.getTop()
            int r5 = r1.getRight()
            int r1 = r1.getBottom()
            r0.set(r3, r4, r5, r1)
            int r1 = r6.getLeft()
            int r3 = r6.getTop()
            int r4 = r6.getRight()
            int r5 = r6.getBottom()
            boolean r1 = r0.intersects(r1, r3, r4, r5)
            r1 = r1 ^ 1
        L_0x0047:
            m3443a(r6, r7)
            if (r1 == 0) goto L_0x006b
            int r7 = r6.getLeft()
            int r1 = r6.getTop()
            int r3 = r6.getRight()
            int r6 = r6.getBottom()
            boolean r6 = r0.intersect(r7, r1, r3, r6)
            if (r6 == 0) goto L_0x006b
            android.view.View r2 = (android.view.View) r2
            r2.invalidate(r0)
            goto L_0x006b
        L_0x0068:
            m3443a(r6, r7)
        L_0x006b:
            return
    }

    /* renamed from: d */
    public static android.graphics.Rect m3421d(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 18
            if (r0 < r1) goto L_0x000b
            android.graphics.Rect r2 = r2.getClipBounds()
            return r2
        L_0x000b:
            r2 = 0
            return r2
    }

    /* renamed from: d */
    public static void m3420d(android.view.View r6, int r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x000a
            r6.offsetTopAndBottom(r7)
            goto L_0x006b
        L_0x000a:
            r1 = 21
            if (r0 < r1) goto L_0x0068
            android.graphics.Rect r0 = m3446a()
            r1 = 0
            android.view.ViewParent r2 = r6.getParent()
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L_0x0047
            r1 = r2
            android.view.View r1 = (android.view.View) r1
            int r3 = r1.getLeft()
            int r4 = r1.getTop()
            int r5 = r1.getRight()
            int r1 = r1.getBottom()
            r0.set(r3, r4, r5, r1)
            int r1 = r6.getLeft()
            int r3 = r6.getTop()
            int r4 = r6.getRight()
            int r5 = r6.getBottom()
            boolean r1 = r0.intersects(r1, r3, r4, r5)
            r1 = r1 ^ 1
        L_0x0047:
            m3427b(r6, r7)
            if (r1 == 0) goto L_0x006b
            int r7 = r6.getLeft()
            int r1 = r6.getTop()
            int r3 = r6.getRight()
            int r6 = r6.getBottom()
            boolean r6 = r0.intersect(r7, r1, r3, r6)
            if (r6 == 0) goto L_0x006b
            android.view.View r2 = (android.view.View) r2
            r2.invalidate(r0)
            goto L_0x006b
        L_0x0068:
            m3427b(r6, r7)
        L_0x006b:
            return
    }

    /* renamed from: e */
    public static android.view.Display m3419e(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 < r1) goto L_0x000b
            android.view.Display r2 = r2.getDisplay()
            return r2
        L_0x000b:
            boolean r0 = m3398w(r2)
            if (r0 == 0) goto L_0x0022
            android.content.Context r2 = r2.getContext()
            java.lang.String r0 = "window"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            android.view.Display r2 = r2.getDefaultDisplay()
            return r2
        L_0x0022:
            r2 = 0
            return r2
    }

    /* renamed from: e */
    public static void m3418e(android.view.View r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x000a
        L_0x0006:
            r2.setImportantForAccessibility(r3)
            goto L_0x0013
        L_0x000a:
            r1 = 16
            if (r0 < r1) goto L_0x0013
            r0 = 4
            if (r3 != r0) goto L_0x0006
            r3 = 2
            goto L_0x0006
        L_0x0013:
            return
    }

    /* renamed from: f */
    public static float m3417f(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000b
            float r2 = r2.getElevation()
            return r2
        L_0x000b:
            r2 = 0
            return r2
    }

    /* renamed from: f */
    public static void m3416f(android.view.View r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x0009
            r2.setImportantForAutofill(r3)
        L_0x0009:
            return
    }

    /* renamed from: g */
    public static void m3414g(android.view.View r1, int r2) {
            boolean r0 = r1 instanceof p000a.p018g.p029l.AbstractC0207i
            if (r0 == 0) goto L_0x000a
            a.g.l.i r1 = (p000a.p018g.p029l.AbstractC0207i) r1
            r1.mo1010a(r2)
            goto L_0x000f
        L_0x000a:
            if (r2 != 0) goto L_0x000f
            m3448C(r1)
        L_0x000f:
            return
    }

    /* renamed from: g */
    public static boolean m3415g(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x000b
            boolean r2 = r2.getFitsSystemWindows()
            return r2
        L_0x000b:
            r2 = 0
            return r2
    }

    /* renamed from: h */
    public static int m3413h(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x000b
            int r2 = r2.getImportantForAccessibility()
            return r2
        L_0x000b:
            r2 = 0
            return r2
    }

    @android.annotation.SuppressLint({"InlinedApi"})
    /* renamed from: i */
    public static int m3412i(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x000b
            int r2 = r2.getImportantForAutofill()
            return r2
        L_0x000b:
            r2 = 0
            return r2
    }

    /* renamed from: j */
    public static int m3411j(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 < r1) goto L_0x000b
            int r2 = r2.getLayoutDirection()
            return r2
        L_0x000b:
            r2 = 0
            return r2
    }

    /* renamed from: k */
    public static int m3410k(android.view.View r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x000b
            int r3 = r3.getMinimumHeight()
            return r3
        L_0x000b:
            boolean r0 = p000a.p018g.p029l.C0216r.f663d
            if (r0 != 0) goto L_0x0021
            r0 = 1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r2 = "mMinHeight"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: NoSuchFieldException -> 0x001f
            p000a.p018g.p029l.C0216r.f662c = r1     // Catch: NoSuchFieldException -> 0x001f
            java.lang.reflect.Field r1 = p000a.p018g.p029l.C0216r.f662c     // Catch: NoSuchFieldException -> 0x001f
            r1.setAccessible(r0)     // Catch: NoSuchFieldException -> 0x001f
        L_0x001f:
            p000a.p018g.p029l.C0216r.f663d = r0
        L_0x0021:
            java.lang.reflect.Field r0 = p000a.p018g.p029l.C0216r.f662c
            if (r0 == 0) goto L_0x0030
            java.lang.Object r3 = r0.get(r3)     // Catch: Exception -> 0x0030
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: Exception -> 0x0030
            int r3 = r3.intValue()     // Catch: Exception -> 0x0030
            return r3
        L_0x0030:
            r3 = 0
            return r3
    }

    /* renamed from: l */
    public static int m3409l(android.view.View r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x000b
            int r3 = r3.getMinimumWidth()
            return r3
        L_0x000b:
            boolean r0 = p000a.p018g.p029l.C0216r.f661b
            if (r0 != 0) goto L_0x0021
            r0 = 1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r2 = "mMinWidth"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: NoSuchFieldException -> 0x001f
            p000a.p018g.p029l.C0216r.f660a = r1     // Catch: NoSuchFieldException -> 0x001f
            java.lang.reflect.Field r1 = p000a.p018g.p029l.C0216r.f660a     // Catch: NoSuchFieldException -> 0x001f
            r1.setAccessible(r0)     // Catch: NoSuchFieldException -> 0x001f
        L_0x001f:
            p000a.p018g.p029l.C0216r.f661b = r0
        L_0x0021:
            java.lang.reflect.Field r0 = p000a.p018g.p029l.C0216r.f660a
            if (r0 == 0) goto L_0x0030
            java.lang.Object r3 = r0.get(r3)     // Catch: Exception -> 0x0030
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: Exception -> 0x0030
            int r3 = r3.intValue()     // Catch: Exception -> 0x0030
            return r3
        L_0x0030:
            r3 = 0
            return r3
    }

    /* renamed from: m */
    public static int m3408m(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 < r1) goto L_0x000b
            int r2 = r2.getPaddingEnd()
            return r2
        L_0x000b:
            int r2 = r2.getPaddingRight()
            return r2
    }

    /* renamed from: n */
    public static int m3407n(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 < r1) goto L_0x000b
            int r2 = r2.getPaddingStart()
            return r2
        L_0x000b:
            int r2 = r2.getPaddingLeft()
            return r2
    }

    /* renamed from: o */
    public static android.view.ViewParent m3406o(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x000b
            android.view.ViewParent r2 = r2.getParentForAccessibility()
            return r2
        L_0x000b:
            android.view.ViewParent r2 = r2.getParent()
            return r2
    }

    /* renamed from: p */
    public static java.lang.String m3405p(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000b
            java.lang.String r2 = r2.getTransitionName()
            return r2
        L_0x000b:
            java.util.WeakHashMap<android.view.View, java.lang.String> r0 = p000a.p018g.p029l.C0216r.f664e
            if (r0 != 0) goto L_0x0011
            r2 = 0
            return r2
        L_0x0011:
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    /* renamed from: q */
    public static int m3404q(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x000b
            int r2 = r2.getWindowSystemUiVisibility()
            return r2
        L_0x000b:
            r2 = 0
            return r2
    }

    /* renamed from: r */
    public static float m3403r(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000b
            float r2 = r2.getZ()
            return r2
        L_0x000b:
            r2 = 0
            return r2
    }

    /* renamed from: s */
    public static boolean m3402s(android.view.View r4) {
            boolean r0 = p000a.p018g.p029l.C0216r.f667h
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.reflect.Field r0 = p000a.p018g.p029l.C0216r.f666g
            r2 = 1
            if (r0 != 0) goto L_0x001e
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r3 = "mAccessibilityDelegate"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: all -> 0x001b
            p000a.p018g.p029l.C0216r.f666g = r0     // Catch: all -> 0x001b
            java.lang.reflect.Field r0 = p000a.p018g.p029l.C0216r.f666g     // Catch: all -> 0x001b
            r0.setAccessible(r2)     // Catch: all -> 0x001b
            goto L_0x001e
        L_0x001b:
            p000a.p018g.p029l.C0216r.f667h = r2
            return r1
        L_0x001e:
            java.lang.reflect.Field r0 = p000a.p018g.p029l.C0216r.f666g     // Catch: all -> 0x0028
            java.lang.Object r4 = r0.get(r4)     // Catch: all -> 0x0028
            if (r4 == 0) goto L_0x0027
            r1 = 1
        L_0x0027:
            return r1
        L_0x0028:
            p000a.p018g.p029l.C0216r.f667h = r2
            return r1
    }

    /* renamed from: t */
    public static boolean m3401t(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 15
            if (r0 < r1) goto L_0x000b
            boolean r2 = r2.hasOnClickListeners()
            return r2
        L_0x000b:
            r2 = 0
            return r2
    }

    /* renamed from: u */
    public static boolean m3400u(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x000b
            boolean r2 = r2.hasOverlappingRendering()
            return r2
        L_0x000b:
            r2 = 1
            return r2
    }

    /* renamed from: v */
    public static boolean m3399v(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x000b
            boolean r2 = r2.hasTransientState()
            return r2
        L_0x000b:
            r2 = 0
            return r2
    }

    /* renamed from: w */
    public static boolean m3398w(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x000b
            boolean r2 = r2.isAttachedToWindow()
            return r2
        L_0x000b:
            android.os.IBinder r2 = r2.getWindowToken()
            if (r2 == 0) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            return r2
    }

    /* renamed from: x */
    public static boolean m3397x(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x000b
            boolean r2 = r2.isLaidOut()
            return r2
        L_0x000b:
            int r0 = r2.getWidth()
            if (r0 <= 0) goto L_0x0019
            int r2 = r2.getHeight()
            if (r2 <= 0) goto L_0x0019
            r2 = 1
            goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            return r2
    }

    /* renamed from: y */
    public static boolean m3396y(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000b
            boolean r2 = r2.isNestedScrollingEnabled()
            return r2
        L_0x000b:
            boolean r0 = r2 instanceof p000a.p018g.p029l.AbstractC0208j
            if (r0 == 0) goto L_0x0016
            a.g.l.j r2 = (p000a.p018g.p029l.AbstractC0208j) r2
            boolean r2 = r2.isNestedScrollingEnabled()
            return r2
        L_0x0016:
            r2 = 0
            return r2
    }

    /* renamed from: z */
    public static boolean m3395z(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 < r1) goto L_0x000b
            boolean r2 = r2.isPaddingRelative()
            return r2
        L_0x000b:
            r2 = 0
            return r2
    }
}
