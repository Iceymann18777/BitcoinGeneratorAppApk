package p000a.p045n;

/* renamed from: a.n.i0 */
/* loaded from: classes.dex */
public abstract class AbstractC0357i0 extends p000a.p045n.AbstractC0367m {

    /* renamed from: L */
    private static final java.lang.String[] f1085L = null;

    /* renamed from: K */
    private int f1086K;

    /* renamed from: a.n.i0$a */
    /* loaded from: classes.dex */
    class C0358a extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ p000a.p045n.AbstractC0387w f1087a;

        /* renamed from: b */
        final /* synthetic */ android.view.View f1088b;

        C0358a(p000a.p045n.AbstractC0357i0 r1, p000a.p045n.AbstractC0387w r2, android.view.View r3) {
                r0 = this;
                r0.f1087a = r2
                r0.f1088b = r3
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                a.n.w r2 = r1.f1087a
                android.view.View r0 = r1.f1088b
                r2.mo2768a(r0)
                return
        }
    }

    /* renamed from: a.n.i0$b */
    /* loaded from: classes.dex */
    private static class C0359b extends android.animation.AnimatorListenerAdapter implements p000a.p045n.AbstractC0367m.AbstractC0373f, p000a.p045n.C0319a.AbstractC0320a {

        /* renamed from: a */
        private final android.view.View f1089a;

        /* renamed from: b */
        private final int f1090b;

        /* renamed from: c */
        private final android.view.ViewGroup f1091c;

        /* renamed from: d */
        private final boolean f1092d;

        /* renamed from: e */
        private boolean f1093e;

        /* renamed from: f */
        boolean f1094f;

        C0359b(android.view.View r2, int r3, boolean r4) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f1094f = r0
                r1.f1089a = r2
                r1.f1090b = r3
                android.view.ViewParent r2 = r2.getParent()
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r1.f1091c = r2
                r1.f1092d = r4
                r2 = 1
                r1.m2849a(r2)
                return
        }

        /* renamed from: a */
        private void m2850a() {
                r2 = this;
                boolean r0 = r2.f1094f
                if (r0 != 0) goto L_0x0012
                android.view.View r0 = r2.f1089a
                int r1 = r2.f1090b
                p000a.p045n.C0341d0.m2901a(r0, r1)
                android.view.ViewGroup r0 = r2.f1091c
                if (r0 == 0) goto L_0x0012
                r0.invalidate()
            L_0x0012:
                r0 = 0
                r2.m2849a(r0)
                return
        }

        /* renamed from: a */
        private void m2849a(boolean r2) {
                r1 = this;
                boolean r0 = r1.f1092d
                if (r0 == 0) goto L_0x0011
                boolean r0 = r1.f1093e
                if (r0 == r2) goto L_0x0011
                android.view.ViewGroup r0 = r1.f1091c
                if (r0 == 0) goto L_0x0011
                r1.f1093e = r2
                p000a.p045n.C0388x.m2765a(r0, r2)
            L_0x0011:
                return
        }

        @Override // p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: a */
        public void mo2776a(p000a.p045n.AbstractC0367m r1) {
                r0 = this;
                return
        }

        @Override // p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: b */
        public void mo2775b(p000a.p045n.AbstractC0367m r1) {
                r0 = this;
                r0.m2850a()
                r1.mo2785b(r0)
                return
        }

        @Override // p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: c */
        public void mo2809c(p000a.p045n.AbstractC0367m r1) {
                r0 = this;
                r1 = 0
                r0.m2849a(r1)
                return
        }

        @Override // p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: d */
        public void mo2808d(p000a.p045n.AbstractC0367m r1) {
                r0 = this;
                r1 = 1
                r0.m2849a(r1)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r1) {
                r0 = this;
                r1 = 1
                r0.f1094f = r1
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r1) {
                r0 = this;
                r0.m2850a()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, p000a.p045n.C0319a.AbstractC0320a
        public void onAnimationPause(android.animation.Animator r2) {
                r1 = this;
                boolean r2 = r1.f1094f
                if (r2 != 0) goto L_0x000b
                android.view.View r2 = r1.f1089a
                int r0 = r1.f1090b
                p000a.p045n.C0341d0.m2901a(r2, r0)
            L_0x000b:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator r1) {
                r0 = this;
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, p000a.p045n.C0319a.AbstractC0320a
        public void onAnimationResume(android.animation.Animator r2) {
                r1 = this;
                boolean r2 = r1.f1094f
                if (r2 != 0) goto L_0x000a
                android.view.View r2 = r1.f1089a
                r0 = 0
                p000a.p045n.C0341d0.m2901a(r2, r0)
            L_0x000a:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r1) {
                r0 = this;
                return
        }
    }

    /* renamed from: a.n.i0$c */
    /* loaded from: classes.dex */
    private static class C0360c {

        /* renamed from: a */
        boolean f1095a;

        /* renamed from: b */
        boolean f1096b;

        /* renamed from: c */
        int f1097c;

        /* renamed from: d */
        int f1098d;

        /* renamed from: e */
        android.view.ViewGroup f1099e;

        /* renamed from: f */
        android.view.ViewGroup f1100f;

        C0360c() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "android:visibility:visibility"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "android:visibility:parent"
            r0[r1] = r2
            p000a.p045n.AbstractC0357i0.f1085L = r0
            return
    }

    public AbstractC0357i0() {
            r1 = this;
            r1.<init>()
            r0 = 3
            r1.f1086K = r0
            return
    }

    /* renamed from: b */
    private p000a.p045n.AbstractC0357i0.C0360c m2854b(p000a.p045n.C0383s r8, p000a.p045n.C0383s r9) {
            r7 = this;
            a.n.i0$c r0 = new a.n.i0$c
            r0.<init>()
            r1 = 0
            r0.f1095a = r1
            r0.f1096b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f1166a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f1166a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f1097c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f1166a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f1099e = r6
            goto L_0x0037
        L_0x0033:
            r0.f1097c = r4
            r0.f1099e = r3
        L_0x0037:
            if (r9 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f1166a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f1166a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f1098d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f1166a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f1100f = r2
            goto L_0x005e
        L_0x005a:
            r0.f1098d = r4
            r0.f1100f = r3
        L_0x005e:
            r2 = 1
            if (r8 == 0) goto L_0x0086
            if (r9 == 0) goto L_0x0086
            int r8 = r0.f1097c
            int r9 = r0.f1098d
            if (r8 != r9) goto L_0x0070
            android.view.ViewGroup r8 = r0.f1099e
            android.view.ViewGroup r9 = r0.f1100f
            if (r8 != r9) goto L_0x0070
            return r0
        L_0x0070:
            int r8 = r0.f1097c
            int r9 = r0.f1098d
            if (r8 == r9) goto L_0x007c
            if (r8 != 0) goto L_0x0079
            goto L_0x0097
        L_0x0079:
            if (r9 != 0) goto L_0x009a
            goto L_0x008c
        L_0x007c:
            android.view.ViewGroup r8 = r0.f1100f
            if (r8 != 0) goto L_0x0081
            goto L_0x0097
        L_0x0081:
            android.view.ViewGroup r8 = r0.f1099e
            if (r8 != 0) goto L_0x009a
            goto L_0x008c
        L_0x0086:
            if (r8 != 0) goto L_0x0091
            int r8 = r0.f1098d
            if (r8 != 0) goto L_0x0091
        L_0x008c:
            r0.f1096b = r2
        L_0x008e:
            r0.f1095a = r2
            goto L_0x009a
        L_0x0091:
            if (r9 != 0) goto L_0x009a
            int r8 = r0.f1097c
            if (r8 != 0) goto L_0x009a
        L_0x0097:
            r0.f1096b = r1
            goto L_0x008e
        L_0x009a:
            return r0
    }

    /* renamed from: d */
    private void m2851d(p000a.p045n.C0383s r4) {
            r3 = this;
            android.view.View r0 = r4.f1167b
            int r0 = r0.getVisibility()
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.f1166a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "android:visibility:visibility"
            r1.put(r2, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.f1166a
            android.view.View r1 = r4.f1167b
            android.view.ViewParent r1 = r1.getParent()
            java.lang.String r2 = "android:visibility:parent"
            r0.put(r2, r1)
            r0 = 2
            int[] r0 = new int[r0]
            android.view.View r1 = r4.f1167b
            r1.getLocationOnScreen(r0)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.f1166a
            java.lang.String r1 = "android:visibility:screenLocation"
            r4.put(r1, r0)
            return
    }

    /* renamed from: a */
    public android.animation.Animator m2856a(android.view.ViewGroup r3, p000a.p045n.C0383s r4, int r5, p000a.p045n.C0383s r6, int r7) {
            r2 = this;
            int r5 = r2.f1086K
            r7 = 1
            r5 = r5 & r7
            r0 = 0
            if (r5 != r7) goto L_0x002d
            if (r6 != 0) goto L_0x000a
            goto L_0x002d
        L_0x000a:
            if (r4 != 0) goto L_0x0026
            android.view.View r5 = r6.f1167b
            android.view.ViewParent r5 = r5.getParent()
            android.view.View r5 = (android.view.View) r5
            r7 = 0
            a.n.s r1 = r2.m2833a(r5, r7)
            a.n.s r5 = r2.m2825b(r5, r7)
            a.n.i0$c r5 = r2.m2854b(r1, r5)
            boolean r5 = r5.f1095a
            if (r5 == 0) goto L_0x0026
            return r0
        L_0x0026:
            android.view.View r5 = r6.f1167b
            android.animation.Animator r3 = r2.mo2855a(r3, r5, r4, r6)
            return r3
        L_0x002d:
            return r0
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public android.animation.Animator mo2831a(android.view.ViewGroup r9, p000a.p045n.C0383s r10, p000a.p045n.C0383s r11) {
            r8 = this;
            a.n.i0$c r0 = r8.m2854b(r10, r11)
            boolean r1 = r0.f1095a
            if (r1 == 0) goto L_0x002e
            android.view.ViewGroup r1 = r0.f1099e
            if (r1 != 0) goto L_0x0010
            android.view.ViewGroup r1 = r0.f1100f
            if (r1 == 0) goto L_0x002e
        L_0x0010:
            boolean r1 = r0.f1096b
            if (r1 == 0) goto L_0x0021
            int r5 = r0.f1097c
            int r7 = r0.f1098d
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r11
            android.animation.Animator r9 = r2.m2856a(r3, r4, r5, r6, r7)
            return r9
        L_0x0021:
            int r3 = r0.f1097c
            int r5 = r0.f1098d
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r11
            android.animation.Animator r9 = r0.m2853b(r1, r2, r3, r4, r5)
            return r9
        L_0x002e:
            r9 = 0
            return r9
    }

    /* renamed from: a */
    public abstract android.animation.Animator mo2855a(android.view.ViewGroup r1, android.view.View r2, p000a.p045n.C0383s r3, p000a.p045n.C0383s r4);

    /* renamed from: a */
    public void m2857a(int r2) {
            r1 = this;
            r0 = r2 & (-4)
            if (r0 != 0) goto L_0x0007
            r1.f1086K = r2
            return
        L_0x0007:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Only MODE_IN and MODE_OUT flags are allowed"
            r2.<init>(r0)
            throw r2
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public void mo2792a(p000a.p045n.C0383s r1) {
            r0 = this;
            r0.m2851d(r1)
            return
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public boolean mo2839a(p000a.p045n.C0383s r5, p000a.p045n.C0383s r6) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0006
            if (r6 != 0) goto L_0x0006
            return r0
        L_0x0006:
            if (r5 == 0) goto L_0x001b
            if (r6 == 0) goto L_0x001b
            java.util.Map<java.lang.String, java.lang.Object> r1 = r6.f1166a
            java.lang.String r2 = "android:visibility:visibility"
            boolean r1 = r1.containsKey(r2)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r5.f1166a
            boolean r2 = r3.containsKey(r2)
            if (r1 == r2) goto L_0x001b
            return r0
        L_0x001b:
            a.n.i0$c r5 = r4.m2854b(r5, r6)
            boolean r6 = r5.f1095a
            if (r6 == 0) goto L_0x002c
            int r6 = r5.f1097c
            if (r6 == 0) goto L_0x002b
            int r5 = r5.f1098d
            if (r5 != 0) goto L_0x002c
        L_0x002b:
            r0 = 1
        L_0x002c:
            return r0
    }

    /* renamed from: b */
    public android.animation.Animator m2853b(android.view.ViewGroup r7, p000a.p045n.C0383s r8, int r9, p000a.p045n.C0383s r10, int r11) {
            r6 = this;
            int r9 = r6.f1086K
            r0 = 2
            r9 = r9 & r0
            r1 = 0
            if (r9 == r0) goto L_0x0008
            return r1
        L_0x0008:
            if (r8 == 0) goto L_0x000d
            android.view.View r9 = r8.f1167b
            goto L_0x000e
        L_0x000d:
            r9 = r1
        L_0x000e:
            if (r10 == 0) goto L_0x0013
            android.view.View r2 = r10.f1167b
            goto L_0x0014
        L_0x0013:
            r2 = r1
        L_0x0014:
            r3 = 1
            if (r2 == 0) goto L_0x0036
            android.view.ViewParent r4 = r2.getParent()
            if (r4 != 0) goto L_0x001e
            goto L_0x0036
        L_0x001e:
            r4 = 4
            if (r11 != r4) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            if (r9 != r2) goto L_0x0026
        L_0x0024:
            r9 = r1
            goto L_0x007f
        L_0x0026:
            boolean r2 = r6.f1137w
            if (r2 == 0) goto L_0x002b
            goto L_0x0043
        L_0x002b:
            android.view.ViewParent r2 = r9.getParent()
            android.view.View r2 = (android.view.View) r2
        L_0x0031:
            android.view.View r9 = p000a.p045n.C0382r.m2772a(r7, r9, r2)
            goto L_0x0039
        L_0x0036:
            if (r2 == 0) goto L_0x003b
            r9 = r2
        L_0x0039:
            r2 = r1
            goto L_0x007f
        L_0x003b:
            if (r9 == 0) goto L_0x007d
            android.view.ViewParent r2 = r9.getParent()
            if (r2 != 0) goto L_0x0044
        L_0x0043:
            goto L_0x0039
        L_0x0044:
            android.view.ViewParent r2 = r9.getParent()
            boolean r2 = r2 instanceof android.view.View
            if (r2 == 0) goto L_0x007d
            android.view.ViewParent r2 = r9.getParent()
            android.view.View r2 = (android.view.View) r2
            a.n.s r4 = r6.m2825b(r2, r3)
            a.n.s r5 = r6.m2833a(r2, r3)
            a.n.i0$c r4 = r6.m2854b(r4, r5)
            boolean r4 = r4.f1095a
            if (r4 != 0) goto L_0x0063
            goto L_0x0031
        L_0x0063:
            android.view.ViewParent r4 = r2.getParent()
            if (r4 != 0) goto L_0x007b
            int r2 = r2.getId()
            r4 = -1
            if (r2 == r4) goto L_0x007b
            android.view.View r2 = r7.findViewById(r2)
            if (r2 == 0) goto L_0x007b
            boolean r2 = r6.f1137w
            if (r2 == 0) goto L_0x007b
            goto L_0x0039
        L_0x007b:
            r9 = r1
            goto L_0x0039
        L_0x007d:
            r9 = r1
            r2 = r9
        L_0x007f:
            r4 = 0
            if (r9 == 0) goto L_0x00c7
            if (r8 == 0) goto L_0x00c7
            java.util.Map<java.lang.String, java.lang.Object> r11 = r8.f1166a
            java.lang.String r1 = "android:visibility:screenLocation"
            java.lang.Object r11 = r11.get(r1)
            int[] r11 = (int[]) r11
            r1 = r11[r4]
            r11 = r11[r3]
            int[] r0 = new int[r0]
            r7.getLocationOnScreen(r0)
            r2 = r0[r4]
            int r1 = r1 - r2
            int r2 = r9.getLeft()
            int r1 = r1 - r2
            r9.offsetLeftAndRight(r1)
            r0 = r0[r3]
            int r11 = r11 - r0
            int r0 = r9.getTop()
            int r11 = r11 - r0
            r9.offsetTopAndBottom(r11)
            a.n.w r11 = p000a.p045n.C0388x.m2766a(r7)
            r11.mo2767b(r9)
            android.animation.Animator r7 = r6.mo2852b(r7, r9, r8, r10)
            if (r7 != 0) goto L_0x00be
            r11.mo2768a(r9)
            goto L_0x00c6
        L_0x00be:
            a.n.i0$a r8 = new a.n.i0$a
            r8.<init>(r6, r11, r9)
            r7.addListener(r8)
        L_0x00c6:
            return r7
        L_0x00c7:
            if (r2 == 0) goto L_0x00e9
            int r9 = r2.getVisibility()
            p000a.p045n.C0341d0.m2901a(r2, r4)
            android.animation.Animator r7 = r6.mo2852b(r7, r2, r8, r10)
            if (r7 == 0) goto L_0x00e5
            a.n.i0$b r8 = new a.n.i0$b
            r8.<init>(r2, r11, r3)
            r7.addListener(r8)
            p000a.p045n.C0319a.m2934a(r7, r8)
            r6.mo2795a(r8)
            goto L_0x00e8
        L_0x00e5:
            p000a.p045n.C0341d0.m2901a(r2, r9)
        L_0x00e8:
            return r7
        L_0x00e9:
            return r1
    }

    /* renamed from: b */
    public abstract android.animation.Animator mo2852b(android.view.ViewGroup r1, android.view.View r2, p000a.p045n.C0383s r3, p000a.p045n.C0383s r4);

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: c */
    public void mo2783c(p000a.p045n.C0383s r1) {
            r0 = this;
            r0.m2851d(r1)
            return
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: m */
    public java.lang.String[] mo2813m() {
            r1 = this;
            java.lang.String[] r0 = p000a.p045n.AbstractC0357i0.f1085L
            return r0
    }
}
