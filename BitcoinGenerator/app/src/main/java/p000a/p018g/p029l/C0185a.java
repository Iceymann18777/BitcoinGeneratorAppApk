package p000a.p018g.p029l;

/* renamed from: a.g.l.a */
/* loaded from: classes.dex */
public class C0185a {

    /* renamed from: b */
    private static final android.view.View.AccessibilityDelegate f636b = null;

    /* renamed from: a */
    private final android.view.View.AccessibilityDelegate f637a;

    /* renamed from: a.g.l.a$a */
    /* loaded from: classes.dex */
    private static final class C0186a extends android.view.View.AccessibilityDelegate {

        /* renamed from: a */
        private final p000a.p018g.p029l.C0185a f638a;

        C0186a(p000a.p018g.p029l.C0185a r1) {
                r0 = this;
                r0.<init>()
                r0.f638a = r1
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                a.g.l.a r0 = r1.f638a
                boolean r2 = r0.mo1427a(r2, r3)
                return r2
        }

        @Override // android.view.View.AccessibilityDelegate
        public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View r2) {
                r1 = this;
                a.g.l.a r0 = r1.f638a
                a.g.l.a0.d r2 = r0.m3553a(r2)
                if (r2 == 0) goto L_0x000f
                java.lang.Object r2 = r2.m3495a()
                android.view.accessibility.AccessibilityNodeProvider r2 = (android.view.accessibility.AccessibilityNodeProvider) r2
                goto L_0x0010
            L_0x000f:
                r2 = 0
            L_0x0010:
                return r2
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                a.g.l.a r0 = r1.f638a
                r0.mo150b(r2, r3)
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(android.view.View r2, android.view.accessibility.AccessibilityNodeInfo r3) {
                r1 = this;
                a.g.l.a r0 = r1.f638a
                a.g.l.a0.c r3 = p000a.p018g.p029l.p030a0.C0191c.m3539a(r3)
                r0.mo143a(r2, r3)
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                a.g.l.a r0 = r1.f638a
                r0.m3551c(r2, r3)
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup r2, android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
                r1 = this;
                a.g.l.a r0 = r1.f638a
                boolean r2 = r0.mo1426a(r2, r3, r4)
                return r2
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(android.view.View r2, int r3, android.os.Bundle r4) {
                r1 = this;
                a.g.l.a r0 = r1.f638a
                boolean r2 = r0.mo579a(r2, r3, r4)
                return r2
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(android.view.View r2, int r3) {
                r1 = this;
                a.g.l.a r0 = r1.f638a
                r0.m3552a(r2, r3)
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                a.g.l.a r0 = r1.f638a
                r0.m3550d(r2, r3)
                return
        }
    }

    static {
            android.view.View$AccessibilityDelegate r0 = new android.view.View$AccessibilityDelegate
            r0.<init>()
            p000a.p018g.p029l.C0185a.f636b = r0
            return
    }

    public C0185a() {
            r1 = this;
            r1.<init>()
            a.g.l.a$a r0 = new a.g.l.a$a
            r0.<init>(r1)
            r1.f637a = r0
            return
    }

    /* renamed from: a */
    public p000a.p018g.p029l.p030a0.C0195d m3553a(android.view.View r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x0014
            android.view.View$AccessibilityDelegate r0 = p000a.p018g.p029l.C0185a.f636b
            android.view.accessibility.AccessibilityNodeProvider r3 = r0.getAccessibilityNodeProvider(r3)
            if (r3 == 0) goto L_0x0014
            a.g.l.a0.d r0 = new a.g.l.a0.d
            r0.<init>(r3)
            return r0
        L_0x0014:
            r3 = 0
            return r3
    }

    /* renamed from: a */
    android.view.View.AccessibilityDelegate m3554a() {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.f637a
            return r0
    }

    /* renamed from: a */
    public void m3552a(android.view.View r2, int r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = p000a.p018g.p029l.C0185a.f636b
            r0.sendAccessibilityEvent(r2, r3)
            return
    }

    /* renamed from: a */
    public void mo143a(android.view.View r2, p000a.p018g.p029l.p030a0.C0191c r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = p000a.p018g.p029l.C0185a.f636b
            android.view.accessibility.AccessibilityNodeInfo r3 = r3.m3498t()
            r0.onInitializeAccessibilityNodeInfo(r2, r3)
            return
    }

    /* renamed from: a */
    public boolean mo579a(android.view.View r3, int r4, android.os.Bundle r5) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x000d
            android.view.View$AccessibilityDelegate r0 = p000a.p018g.p029l.C0185a.f636b
            boolean r3 = r0.performAccessibilityAction(r3, r4, r5)
            return r3
        L_0x000d:
            r3 = 0
            return r3
    }

    /* renamed from: a */
    public boolean mo1427a(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = p000a.p018g.p029l.C0185a.f636b
            boolean r2 = r0.dispatchPopulateAccessibilityEvent(r2, r3)
            return r2
    }

    /* renamed from: a */
    public boolean mo1426a(android.view.ViewGroup r2, android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = p000a.p018g.p029l.C0185a.f636b
            boolean r2 = r0.onRequestSendAccessibilityEvent(r2, r3, r4)
            return r2
    }

    /* renamed from: b */
    public void mo150b(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = p000a.p018g.p029l.C0185a.f636b
            r0.onInitializeAccessibilityEvent(r2, r3)
            return
    }

    /* renamed from: c */
    public void m3551c(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = p000a.p018g.p029l.C0185a.f636b
            r0.onPopulateAccessibilityEvent(r2, r3)
            return
    }

    /* renamed from: d */
    public void m3550d(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = p000a.p018g.p029l.C0185a.f636b
            r0.sendAccessibilityEventUnchecked(r2, r3)
            return
    }
}
