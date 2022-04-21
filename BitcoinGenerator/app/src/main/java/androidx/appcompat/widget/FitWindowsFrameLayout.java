package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends android.widget.FrameLayout implements androidx.appcompat.widget.AbstractC0586e0 {

    /* renamed from: b */
    private androidx.appcompat.widget.AbstractC0586e0.AbstractC0587a f1895b;

    public FitWindowsFrameLayout(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public FitWindowsFrameLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(android.graphics.Rect r2) {
            r1 = this;
            androidx.appcompat.widget.e0$a r0 = r1.f1895b
            if (r0 == 0) goto L_0x0007
            r0.mo2078a(r2)
        L_0x0007:
            boolean r2 = super.fitSystemWindows(r2)
            return r2
    }

    @Override // androidx.appcompat.widget.AbstractC0586e0
    public void setOnFitSystemWindowsListener(androidx.appcompat.widget.AbstractC0586e0.AbstractC0587a r1) {
            r0 = this;
            r0.f1895b = r1
            return
    }
}
