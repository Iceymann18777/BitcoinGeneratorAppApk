package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.u */
/* loaded from: classes.dex */
public class C0639u extends android.widget.SeekBar {

    /* renamed from: b */
    private final androidx.appcompat.widget.C0643v f2283b;

    public C0639u(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = p000a.p001a.C0000a.seekBarStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public C0639u(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            androidx.appcompat.widget.v r1 = new androidx.appcompat.widget.v
            r1.<init>(r0)
            r0.f2283b = r1
            androidx.appcompat.widget.v r1 = r0.f2283b
            r1.mo1845a(r2, r3)
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.v r0 = r1.f2283b
            r0.m1844b()
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            androidx.appcompat.widget.v r0 = r1.f2283b
            r0.m1843c()
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(android.graphics.Canvas r2) {
            r1 = this;
            monitor-enter(r1)
            super.onDraw(r2)     // Catch: all -> 0x000b
            androidx.appcompat.widget.v r0 = r1.f2283b     // Catch: all -> 0x000b
            r0.m1847a(r2)     // Catch: all -> 0x000b
            monitor-exit(r1)
            return
        L_0x000b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
