package androidx.appcompat.app;

/* renamed from: androidx.appcompat.app.d */
/* loaded from: classes.dex */
public class DialogInterfaceC0440d extends androidx.appcompat.app.DialogC0464i implements android.content.DialogInterface {

    /* renamed from: d */
    final androidx.appcompat.app.AlertController f1413d;

    /* renamed from: androidx.appcompat.app.d$a */
    /* loaded from: classes.dex */
    public static class C0441a {

        /* renamed from: a */
        private final androidx.appcompat.app.AlertController.C0419f f1414a;

        /* renamed from: b */
        private final int f1415b;

        public C0441a(android.content.Context r2) {
                r1 = this;
                r0 = 0
                int r0 = androidx.appcompat.app.DialogInterfaceC0440d.m2645a(r2, r0)
                r1.<init>(r2, r0)
                return
        }

        public C0441a(android.content.Context r4, int r5) {
                r3 = this;
                r3.<init>()
                androidx.appcompat.app.AlertController$f r0 = new androidx.appcompat.app.AlertController$f
                android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
                int r2 = androidx.appcompat.app.DialogInterfaceC0440d.m2645a(r4, r5)
                r1.<init>(r4, r2)
                r0.<init>(r1)
                r3.f1414a = r0
                r3.f1415b = r5
                return
        }

        /* renamed from: a */
        public androidx.appcompat.app.DialogInterfaceC0440d.C0441a m2643a(android.content.DialogInterface.OnKeyListener r2) {
                r1 = this;
                androidx.appcompat.app.AlertController$f r0 = r1.f1414a
                r0.f1370u = r2
                return r1
        }

        /* renamed from: a */
        public androidx.appcompat.app.DialogInterfaceC0440d.C0441a m2642a(android.graphics.drawable.Drawable r2) {
                r1 = this;
                androidx.appcompat.app.AlertController$f r0 = r1.f1414a
                r0.f1353d = r2
                return r1
        }

        /* renamed from: a */
        public androidx.appcompat.app.DialogInterfaceC0440d.C0441a m2641a(android.view.View r2) {
                r1 = this;
                androidx.appcompat.app.AlertController$f r0 = r1.f1414a
                r0.f1356g = r2
                return r1
        }

        /* renamed from: a */
        public androidx.appcompat.app.DialogInterfaceC0440d.C0441a m2640a(android.widget.ListAdapter r2, android.content.DialogInterface.OnClickListener r3) {
                r1 = this;
                androidx.appcompat.app.AlertController$f r0 = r1.f1414a
                r0.f1372w = r2
                r0.f1373x = r3
                return r1
        }

        /* renamed from: a */
        public androidx.appcompat.app.DialogInterfaceC0440d.C0441a m2639a(java.lang.CharSequence r2) {
                r1 = this;
                androidx.appcompat.app.AlertController$f r0 = r1.f1414a
                r0.f1355f = r2
                return r1
        }

        /* renamed from: a */
        public androidx.appcompat.app.DialogInterfaceC0440d m2644a() {
                r3 = this;
                androidx.appcompat.app.d r0 = new androidx.appcompat.app.d
                androidx.appcompat.app.AlertController$f r1 = r3.f1414a
                android.content.Context r1 = r1.f1350a
                int r2 = r3.f1415b
                r0.<init>(r1, r2)
                androidx.appcompat.app.AlertController$f r1 = r3.f1414a
                androidx.appcompat.app.AlertController r2 = r0.f1413d
                r1.m2664a(r2)
                androidx.appcompat.app.AlertController$f r1 = r3.f1414a
                boolean r1 = r1.f1367r
                r0.setCancelable(r1)
                androidx.appcompat.app.AlertController$f r1 = r3.f1414a
                boolean r1 = r1.f1367r
                if (r1 == 0) goto L_0x0023
                r1 = 1
                r0.setCanceledOnTouchOutside(r1)
            L_0x0023:
                androidx.appcompat.app.AlertController$f r1 = r3.f1414a
                android.content.DialogInterface$OnCancelListener r1 = r1.f1368s
                r0.setOnCancelListener(r1)
                androidx.appcompat.app.AlertController$f r1 = r3.f1414a
                android.content.DialogInterface$OnDismissListener r1 = r1.f1369t
                r0.setOnDismissListener(r1)
                androidx.appcompat.app.AlertController$f r1 = r3.f1414a
                android.content.DialogInterface$OnKeyListener r1 = r1.f1370u
                if (r1 == 0) goto L_0x003a
                r0.setOnKeyListener(r1)
            L_0x003a:
                return r0
        }

        /* renamed from: b */
        public android.content.Context m2638b() {
                r1 = this;
                androidx.appcompat.app.AlertController$f r0 = r1.f1414a
                android.content.Context r0 = r0.f1350a
                return r0
        }
    }

    protected DialogInterfaceC0440d(android.content.Context r2, int r3) {
            r1 = this;
            int r3 = m2645a(r2, r3)
            r1.<init>(r2, r3)
            androidx.appcompat.app.AlertController r2 = new androidx.appcompat.app.AlertController
            android.content.Context r3 = r1.getContext()
            android.view.Window r0 = r1.getWindow()
            r2.<init>(r3, r1, r0)
            r1.f1413d = r2
            return
    }

    /* renamed from: a */
    static int m2645a(android.content.Context r2, int r3) {
            int r0 = r3 >>> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            if (r0 < r1) goto L_0x0008
            return r3
        L_0x0008:
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            int r0 = p000a.p001a.C0000a.alertDialogTheme
            r2.resolveAttribute(r0, r3, r1)
            int r2 = r3.resourceId
            return r2
    }

    @Override // androidx.appcompat.app.DialogC0464i, android.app.Dialog
    protected void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            androidx.appcompat.app.AlertController r1 = r0.f1413d
            r1.m2690a()
            return
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r2, android.view.KeyEvent r3) {
            r1 = this;
            androidx.appcompat.app.AlertController r0 = r1.f1413d
            boolean r0 = r0.m2688a(r2, r3)
            if (r0 == 0) goto L_0x000a
            r2 = 1
            return r2
        L_0x000a:
            boolean r2 = super.onKeyDown(r2, r3)
            return r2
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int r2, android.view.KeyEvent r3) {
            r1 = this;
            androidx.appcompat.app.AlertController r0 = r1.f1413d
            boolean r0 = r0.m2674b(r2, r3)
            if (r0 == 0) goto L_0x000a
            r2 = 1
            return r2
        L_0x000a:
            boolean r2 = super.onKeyUp(r2, r3)
            return r2
    }

    @Override // androidx.appcompat.app.DialogC0464i, android.app.Dialog
    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            super.setTitle(r2)
            androidx.appcompat.app.AlertController r0 = r1.f1413d
            r0.m2671b(r2)
            return
    }
}
