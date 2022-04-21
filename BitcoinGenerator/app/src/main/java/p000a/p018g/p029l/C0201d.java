package p000a.p018g.p029l;

/* renamed from: a.g.l.d */
/* loaded from: classes.dex */
public class C0201d {

    /* renamed from: a */
    private static boolean f648a = false;

    /* renamed from: b */
    private static java.lang.reflect.Method f649b = null;

    /* renamed from: c */
    private static boolean f650c = false;

    /* renamed from: d */
    private static java.lang.reflect.Field f651d;

    /* renamed from: a.g.l.d$a */
    /* loaded from: classes.dex */
    public interface AbstractC0202a {
        /* renamed from: a */
        boolean mo1631a(android.view.KeyEvent r1);
    }

    /* renamed from: a */
    private static android.content.DialogInterface.OnKeyListener m3485a(android.app.Dialog r3) {
            boolean r0 = p000a.p018g.p029l.C0201d.f650c
            if (r0 != 0) goto L_0x0016
            r0 = 1
            java.lang.Class<android.app.Dialog> r1 = android.app.Dialog.class
            java.lang.String r2 = "mOnKeyListener"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: NoSuchFieldException -> 0x0014
            p000a.p018g.p029l.C0201d.f651d = r1     // Catch: NoSuchFieldException -> 0x0014
            java.lang.reflect.Field r1 = p000a.p018g.p029l.C0201d.f651d     // Catch: NoSuchFieldException -> 0x0014
            r1.setAccessible(r0)     // Catch: NoSuchFieldException -> 0x0014
        L_0x0014:
            p000a.p018g.p029l.C0201d.f650c = r0
        L_0x0016:
            java.lang.reflect.Field r0 = p000a.p018g.p029l.C0201d.f651d
            if (r0 == 0) goto L_0x0021
            java.lang.Object r3 = r0.get(r3)     // Catch: IllegalAccessException -> 0x0021
            android.content.DialogInterface$OnKeyListener r3 = (android.content.DialogInterface.OnKeyListener) r3     // Catch: IllegalAccessException -> 0x0021
            return r3
        L_0x0021:
            r3 = 0
            return r3
    }

    /* renamed from: a */
    public static boolean m3488a(p000a.p018g.p029l.C0201d.AbstractC0202a r3, android.view.View r4, android.view.Window.Callback r5, android.view.KeyEvent r6) {
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x000f
            boolean r3 = r3.mo1631a(r6)
            return r3
        L_0x000f:
            boolean r1 = r5 instanceof android.app.Activity
            if (r1 == 0) goto L_0x001a
            android.app.Activity r5 = (android.app.Activity) r5
            boolean r3 = m3486a(r5, r6)
            return r3
        L_0x001a:
            boolean r1 = r5 instanceof android.app.Dialog
            if (r1 == 0) goto L_0x0025
            android.app.Dialog r5 = (android.app.Dialog) r5
            boolean r3 = m3484a(r5, r6)
            return r3
        L_0x0025:
            if (r4 == 0) goto L_0x002d
            boolean r4 = p000a.p018g.p029l.C0216r.m3433a(r4, r6)
            if (r4 != 0) goto L_0x0033
        L_0x002d:
            boolean r3 = r3.mo1631a(r6)
            if (r3 == 0) goto L_0x0034
        L_0x0033:
            r0 = 1
        L_0x0034:
            return r0
    }

    /* renamed from: a */
    private static boolean m3487a(android.app.ActionBar r6, android.view.KeyEvent r7) {
            boolean r0 = p000a.p018g.p029l.C0201d.f648a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001a
            java.lang.Class r0 = r6.getClass()     // Catch: NoSuchMethodException -> 0x0018
            java.lang.String r3 = "onMenuKeyEvent"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: NoSuchMethodException -> 0x0018
            java.lang.Class<android.view.KeyEvent> r5 = android.view.KeyEvent.class
            r4[r2] = r5     // Catch: NoSuchMethodException -> 0x0018
            java.lang.reflect.Method r0 = r0.getMethod(r3, r4)     // Catch: NoSuchMethodException -> 0x0018
            p000a.p018g.p029l.C0201d.f649b = r0     // Catch: NoSuchMethodException -> 0x0018
        L_0x0018:
            p000a.p018g.p029l.C0201d.f648a = r1
        L_0x001a:
            java.lang.reflect.Method r0 = p000a.p018g.p029l.C0201d.f649b
            if (r0 == 0) goto L_0x002d
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: IllegalAccessException | InvocationTargetException -> 0x002d
            r1[r2] = r7     // Catch: IllegalAccessException | InvocationTargetException -> 0x002d
            java.lang.Object r6 = r0.invoke(r6, r1)     // Catch: IllegalAccessException | InvocationTargetException -> 0x002d
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: IllegalAccessException | InvocationTargetException -> 0x002d
            boolean r6 = r6.booleanValue()     // Catch: IllegalAccessException | InvocationTargetException -> 0x002d
            return r6
        L_0x002d:
            return r2
    }

    /* renamed from: a */
    private static boolean m3486a(android.app.Activity r5, android.view.KeyEvent r6) {
            r5.onUserInteraction()
            android.view.Window r0 = r5.getWindow()
            r1 = 8
            boolean r1 = r0.hasFeature(r1)
            r2 = 1
            if (r1 == 0) goto L_0x0025
            android.app.ActionBar r1 = r5.getActionBar()
            int r3 = r6.getKeyCode()
            r4 = 82
            if (r3 != r4) goto L_0x0025
            if (r1 == 0) goto L_0x0025
            boolean r1 = m3487a(r1, r6)
            if (r1 == 0) goto L_0x0025
            return r2
        L_0x0025:
            boolean r1 = r0.superDispatchKeyEvent(r6)
            if (r1 == 0) goto L_0x002c
            return r2
        L_0x002c:
            android.view.View r0 = r0.getDecorView()
            boolean r1 = p000a.p018g.p029l.C0216r.m3433a(r0, r6)
            if (r1 == 0) goto L_0x0037
            return r2
        L_0x0037:
            if (r0 == 0) goto L_0x003e
            android.view.KeyEvent$DispatcherState r0 = r0.getKeyDispatcherState()
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            boolean r5 = r6.dispatch(r5, r0, r5)
            return r5
    }

    /* renamed from: a */
    private static boolean m3484a(android.app.Dialog r3, android.view.KeyEvent r4) {
            android.content.DialogInterface$OnKeyListener r0 = m3485a(r3)
            r1 = 1
            if (r0 == 0) goto L_0x0012
            int r2 = r4.getKeyCode()
            boolean r0 = r0.onKey(r3, r2, r4)
            if (r0 == 0) goto L_0x0012
            return r1
        L_0x0012:
            android.view.Window r0 = r3.getWindow()
            boolean r2 = r0.superDispatchKeyEvent(r4)
            if (r2 == 0) goto L_0x001d
            return r1
        L_0x001d:
            android.view.View r0 = r0.getDecorView()
            boolean r2 = p000a.p018g.p029l.C0216r.m3433a(r0, r4)
            if (r2 == 0) goto L_0x0028
            return r1
        L_0x0028:
            if (r0 == 0) goto L_0x002f
            android.view.KeyEvent$DispatcherState r0 = r0.getKeyDispatcherState()
            goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            boolean r3 = r4.dispatch(r3, r0, r3)
            return r3
    }

    /* renamed from: a */
    public static boolean m3483a(android.view.View r0, android.view.KeyEvent r1) {
            boolean r0 = p000a.p018g.p029l.C0216r.m3425b(r0, r1)
            return r0
    }
}
