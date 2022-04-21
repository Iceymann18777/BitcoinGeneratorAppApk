package p000a.p036j.p037a;

/* renamed from: a.j.a.q */
/* loaded from: classes.dex */
class ViewTreeObserver$OnPreDrawListenerC0303q implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {

    /* renamed from: b */
    private final android.view.View f995b;

    /* renamed from: c */
    private android.view.ViewTreeObserver f996c;

    /* renamed from: d */
    private final java.lang.Runnable f997d;

    private ViewTreeObserver$OnPreDrawListenerC0303q(android.view.View r1, java.lang.Runnable r2) {
            r0 = this;
            r0.<init>()
            r0.f995b = r1
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r0.f996c = r1
            r0.f997d = r2
            return
    }

    /* renamed from: a */
    public static p000a.p036j.p037a.ViewTreeObserver$OnPreDrawListenerC0303q m2950a(android.view.View r1, java.lang.Runnable r2) {
            a.j.a.q r0 = new a.j.a.q
            r0.<init>(r1, r2)
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            r2.addOnPreDrawListener(r0)
            r1.addOnAttachStateChangeListener(r0)
            return r0
    }

    /* renamed from: a */
    public void m2951a() {
            r1 = this;
            android.view.ViewTreeObserver r0 = r1.f996c
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L_0x000b
            android.view.ViewTreeObserver r0 = r1.f996c
            goto L_0x0011
        L_0x000b:
            android.view.View r0 = r1.f995b
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
        L_0x0011:
            r0.removeOnPreDrawListener(r1)
            android.view.View r0 = r1.f995b
            r0.removeOnAttachStateChangeListener(r1)
            return
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
            r1 = this;
            r1.m2951a()
            java.lang.Runnable r0 = r1.f997d
            r0.run()
            r0 = 1
            return r0
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r0.f996c = r1
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            r0.m2951a()
            return
    }
}
