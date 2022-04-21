package p000a.p018g.p029l.p030a0;

/* renamed from: a.g.l.a0.b */
/* loaded from: classes.dex */
public final class C0188b {

    /* renamed from: a.g.l.a0.b$a */
    /* loaded from: classes.dex */
    public interface AbstractC0189a {
        void onTouchExplorationStateChanged(boolean r1);
    }

    /* renamed from: a.g.l.a0.b$b  reason: invalid class name */
    /* loaded from: classes.dex */
    private static class accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0190b implements android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a */
        final p000a.p018g.p029l.p030a0.C0188b.AbstractC0189a f639a;

        accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0190b(p000a.p018g.p029l.p030a0.C0188b.AbstractC0189a r1) {
                r0 = this;
                r0.<init>()
                r0.f639a = r1
                return
        }

        public boolean equals(java.lang.Object r3) {
                r2 = this;
                if (r2 != r3) goto L_0x0004
                r3 = 1
                return r3
            L_0x0004:
                if (r3 == 0) goto L_0x001a
                java.lang.Class<a.g.l.a0.b$b> r0 = p000a.p018g.p029l.p030a0.C0188b.accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0190b.class
                java.lang.Class r1 = r3.getClass()
                if (r0 == r1) goto L_0x000f
                goto L_0x001a
            L_0x000f:
                a.g.l.a0.b$b r3 = (p000a.p018g.p029l.p030a0.C0188b.accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0190b) r3
                a.g.l.a0.b$a r0 = r2.f639a
                a.g.l.a0.b$a r3 = r3.f639a
                boolean r3 = r0.equals(r3)
                return r3
            L_0x001a:
                r3 = 0
                return r3
        }

        public int hashCode() {
                r1 = this;
                a.g.l.a0.b$a r0 = r1.f639a
                int r0 = r0.hashCode()
                return r0
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean r2) {
                r1 = this;
                a.g.l.a0.b$a r0 = r1.f639a
                r0.onTouchExplorationStateChanged(r2)
                return
        }
    }

    /* renamed from: a */
    public static boolean m3547a(android.view.accessibility.AccessibilityManager r3, p000a.p018g.p029l.p030a0.C0188b.AbstractC0189a r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 19
            if (r0 < r2) goto L_0x0014
            if (r4 != 0) goto L_0x000a
            return r1
        L_0x000a:
            a.g.l.a0.b$b r0 = new a.g.l.a0.b$b
            r0.<init>(r4)
            boolean r3 = r3.addTouchExplorationStateChangeListener(r0)
            return r3
        L_0x0014:
            return r1
    }

    /* renamed from: b */
    public static boolean m3546b(android.view.accessibility.AccessibilityManager r3, p000a.p018g.p029l.p030a0.C0188b.AbstractC0189a r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 19
            if (r0 < r2) goto L_0x0014
            if (r4 != 0) goto L_0x000a
            return r1
        L_0x000a:
            a.g.l.a0.b$b r0 = new a.g.l.a0.b$b
            r0.<init>(r4)
            boolean r3 = r3.removeTouchExplorationStateChangeListener(r0)
            return r3
        L_0x0014:
            return r1
    }
}
