package p000a.p001a.p006m;

/* renamed from: a.a.m.i */
/* loaded from: classes.dex */
public class Window$CallbackC0041i implements android.view.Window.Callback {

    /* renamed from: b */
    final android.view.Window.Callback f156b;

    public Window$CallbackC0041i(android.view.Window.Callback r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L_0x0008
            r1.f156b = r2
            return
        L_0x0008:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Window callback may not be null"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f156b
            boolean r2 = r0.dispatchGenericMotionEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f156b
            boolean r2 = r0.dispatchKeyEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f156b
            boolean r2 = r0.dispatchKeyShortcutEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f156b
            boolean r2 = r0.dispatchPopulateAccessibilityEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f156b
            boolean r2 = r0.dispatchTouchEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f156b
            boolean r2 = r0.dispatchTrackballEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(android.view.ActionMode r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f156b
            r0.onActionModeFinished(r2)
            return
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(android.view.ActionMode r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f156b
            r0.onActionModeStarted(r2)
            return
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
            r1 = this;
            android.view.Window$Callback r0 = r1.f156b
            r0.onAttachedToWindow()
            return
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
            r1 = this;
            android.view.Window$Callback r0 = r1.f156b
            r0.onContentChanged()
            return
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int r2, android.view.Menu r3) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f156b
            boolean r2 = r0.onCreatePanelMenu(r2, r3)
            return r2
    }

    @Override // android.view.Window.Callback
    public android.view.View onCreatePanelView(int r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f156b
            android.view.View r2 = r0.onCreatePanelView(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
            r1 = this;
            android.view.Window$Callback r0 = r1.f156b
            r0.onDetachedFromWindow()
            return
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int r2, android.view.MenuItem r3) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f156b
            boolean r2 = r0.onMenuItemSelected(r2, r3)
            return r2
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int r2, android.view.Menu r3) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f156b
            boolean r2 = r0.onMenuOpened(r2, r3)
            return r2
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int r2, android.view.Menu r3) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f156b
            r0.onPanelClosed(r2, r3)
            return
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f156b
            r0.onPointerCaptureChanged(r2)
            return
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int r2, android.view.View r3, android.view.Menu r4) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f156b
            boolean r2 = r0.onPreparePanel(r2, r3, r4)
            return r2
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> r2, android.view.Menu r3, int r4) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f156b
            r0.onProvideKeyboardShortcuts(r2, r3, r4)
            return
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
            r1 = this;
            android.view.Window$Callback r0 = r1.f156b
            boolean r0 = r0.onSearchRequested()
            return r0
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(android.view.SearchEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f156b
            boolean r2 = r0.onSearchRequested(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f156b
            r0.onWindowAttributesChanged(r2)
            return
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f156b
            r0.onWindowFocusChanged(r2)
            return
    }

    @Override // android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f156b
            android.view.ActionMode r2 = r0.onWindowStartingActionMode(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r2, int r3) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f156b
            android.view.ActionMode r2 = r0.onWindowStartingActionMode(r2, r3)
            return r2
    }
}
