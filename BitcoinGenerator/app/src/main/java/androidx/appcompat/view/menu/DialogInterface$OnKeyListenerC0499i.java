package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.i */
/* loaded from: classes.dex */
class DialogInterface$OnKeyListenerC0499i implements android.content.DialogInterface.OnKeyListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a {

    /* renamed from: b */
    private androidx.appcompat.view.menu.C0496h f1729b;

    /* renamed from: c */
    private androidx.appcompat.app.DialogInterfaceC0440d f1730c;

    /* renamed from: d */
    androidx.appcompat.view.menu.C0493f f1731d;

    /* renamed from: e */
    private androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a f1732e;

    public DialogInterface$OnKeyListenerC0499i(androidx.appcompat.view.menu.C0496h r1) {
            r0 = this;
            r0.<init>()
            r0.f1729b = r1
            return
    }

    /* renamed from: a */
    public void m2372a() {
            r1 = this;
            androidx.appcompat.app.d r0 = r1.f1730c
            if (r0 == 0) goto L_0x0007
            r0.dismiss()
        L_0x0007:
            return
    }

    /* renamed from: a */
    public void m2371a(android.os.IBinder r6) {
            r5 = this;
            androidx.appcompat.view.menu.h r0 = r5.f1729b
            androidx.appcompat.app.d$a r1 = new androidx.appcompat.app.d$a
            android.content.Context r2 = r0.m2388e()
            r1.<init>(r2)
            androidx.appcompat.view.menu.f r2 = new androidx.appcompat.view.menu.f
            android.content.Context r3 = r1.m2638b()
            int r4 = p000a.p001a.C0006g.abc_list_menu_item_layout
            r2.<init>(r3, r4)
            r5.f1731d = r2
            androidx.appcompat.view.menu.f r2 = r5.f1731d
            r2.mo2308a(r5)
            androidx.appcompat.view.menu.h r2 = r5.f1729b
            androidx.appcompat.view.menu.f r3 = r5.f1731d
            r2.m2408a(r3)
            androidx.appcompat.view.menu.f r2 = r5.f1731d
            android.widget.ListAdapter r2 = r2.m2427d()
            r1.m2640a(r2, r5)
            android.view.View r2 = r0.m2379i()
            if (r2 == 0) goto L_0x0037
            r1.m2641a(r2)
            goto L_0x0045
        L_0x0037:
            android.graphics.drawable.Drawable r2 = r0.m2381g()
            r1.m2642a(r2)
            java.lang.CharSequence r0 = r0.m2380h()
            r1.m2639a(r0)
        L_0x0045:
            r1.m2643a(r5)
            androidx.appcompat.app.d r0 = r1.m2644a()
            r5.f1730c = r0
            androidx.appcompat.app.d r0 = r5.f1730c
            r0.setOnDismissListener(r5)
            androidx.appcompat.app.d r0 = r5.f1730c
            android.view.Window r0 = r0.getWindow()
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            r1 = 1003(0x3eb, float:1.406E-42)
            r0.type = r1
            if (r6 == 0) goto L_0x0065
            r0.token = r6
        L_0x0065:
            int r6 = r0.flags
            r1 = 131072(0x20000, float:1.83671E-40)
            r6 = r6 | r1
            r0.flags = r6
            androidx.appcompat.app.d r6 = r5.f1730c
            r6.show()
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a
    /* renamed from: a */
    public void mo2108a(androidx.appcompat.view.menu.C0496h r2, boolean r3) {
            r1 = this;
            if (r3 != 0) goto L_0x0006
            androidx.appcompat.view.menu.h r0 = r1.f1729b
            if (r2 != r0) goto L_0x0009
        L_0x0006:
            r1.m2372a()
        L_0x0009:
            androidx.appcompat.view.menu.p$a r0 = r1.f1732e
            if (r0 == 0) goto L_0x0010
            r0.mo2108a(r2, r3)
        L_0x0010:
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a
    /* renamed from: a */
    public boolean mo2109a(androidx.appcompat.view.menu.C0496h r2) {
            r1 = this;
            androidx.appcompat.view.menu.p$a r0 = r1.f1732e
            if (r0 == 0) goto L_0x0009
            boolean r2 = r0.mo2109a(r2)
            return r2
        L_0x0009:
            r2 = 0
            return r2
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface r2, int r3) {
            r1 = this;
            androidx.appcompat.view.menu.h r2 = r1.f1729b
            androidx.appcompat.view.menu.f r0 = r1.f1731d
            android.widget.ListAdapter r0 = r0.m2427d()
            java.lang.Object r3 = r0.getItem(r3)
            androidx.appcompat.view.menu.k r3 = (androidx.appcompat.view.menu.C0501k) r3
            r0 = 0
            r2.m2411a(r3, r0)
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface r3) {
            r2 = this;
            androidx.appcompat.view.menu.f r3 = r2.f1731d
            androidx.appcompat.view.menu.h r0 = r2.f1729b
            r1 = 1
            r3.mo126a(r0, r1)
            return
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(android.content.DialogInterface r3, int r4, android.view.KeyEvent r5) {
            r2 = this;
            r0 = 82
            if (r4 == r0) goto L_0x0007
            r0 = 4
            if (r4 != r0) goto L_0x005b
        L_0x0007:
            int r0 = r5.getAction()
            r1 = 1
            if (r0 != 0) goto L_0x002c
            int r0 = r5.getRepeatCount()
            if (r0 != 0) goto L_0x002c
            androidx.appcompat.app.d r3 = r2.f1730c
            android.view.Window r3 = r3.getWindow()
            if (r3 == 0) goto L_0x005b
            android.view.View r3 = r3.getDecorView()
            if (r3 == 0) goto L_0x005b
            android.view.KeyEvent$DispatcherState r3 = r3.getKeyDispatcherState()
            if (r3 == 0) goto L_0x005b
            r3.startTracking(r5, r2)
            return r1
        L_0x002c:
            int r0 = r5.getAction()
            if (r0 != r1) goto L_0x005b
            boolean r0 = r5.isCanceled()
            if (r0 != 0) goto L_0x005b
            androidx.appcompat.app.d r0 = r2.f1730c
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x005b
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x005b
            android.view.KeyEvent$DispatcherState r0 = r0.getKeyDispatcherState()
            if (r0 == 0) goto L_0x005b
            boolean r0 = r0.isTracking(r5)
            if (r0 == 0) goto L_0x005b
            androidx.appcompat.view.menu.h r4 = r2.f1729b
            r4.m2402a(r1)
            r3.dismiss()
            return r1
        L_0x005b:
            androidx.appcompat.view.menu.h r3 = r2.f1729b
            r0 = 0
            boolean r3 = r3.performShortcut(r4, r5, r0)
            return r3
    }
}
