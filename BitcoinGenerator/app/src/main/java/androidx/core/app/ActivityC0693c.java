package androidx.core.app;

/* renamed from: androidx.core.app.c */
/* loaded from: classes.dex */
public class ActivityC0693c extends android.app.Activity implements androidx.lifecycle.AbstractC0746g, p000a.p018g.p029l.C0201d.AbstractC0202a {

    /* renamed from: b */
    private androidx.lifecycle.C0747h f2620b;

    public ActivityC0693c() {
            r1 = this;
            r1.<init>()
            a.d.g r0 = new a.d.g
            r0.<init>()
            androidx.lifecycle.h r0 = new androidx.lifecycle.h
            r0.<init>(r1)
            r1.f2620b = r0
            return
    }

    /* renamed from: a */
    public androidx.lifecycle.AbstractC0742e mo1368a() {
            r1 = this;
            androidx.lifecycle.h r0 = r1.f2620b
            return r0
    }

    @Override // p000a.p018g.p029l.C0201d.AbstractC0202a
    /* renamed from: a */
    public boolean mo1631a(android.view.KeyEvent r1) {
            r0 = this;
            boolean r1 = super.dispatchKeyEvent(r1)
            return r1
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x0012
            boolean r1 = p000a.p018g.p029l.C0201d.m3483a(r0, r3)
            if (r1 == 0) goto L_0x0012
            r3 = 1
            return r3
        L_0x0012:
            boolean r3 = p000a.p018g.p029l.C0201d.m3488a(r2, r0, r2, r3)
            return r3
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r2) {
            r1 = this;
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x0012
            boolean r0 = p000a.p018g.p029l.C0201d.m3483a(r0, r2)
            if (r0 == 0) goto L_0x0012
            r2 = 1
            return r2
        L_0x0012:
            boolean r2 = super.dispatchKeyShortcutEvent(r2)
            return r2
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            androidx.lifecycle.FragmentC0756o.m1358a(r0)
            return
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            androidx.lifecycle.h r0 = r2.f2620b
            androidx.lifecycle.e$b r1 = androidx.lifecycle.AbstractC0742e.EnumC0744b.f2809d
            r0.m1384a(r1)
            super.onSaveInstanceState(r3)
            return
    }
}
