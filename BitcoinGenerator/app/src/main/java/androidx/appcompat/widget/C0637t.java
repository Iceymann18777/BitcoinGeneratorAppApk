package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.t */
/* loaded from: classes.dex */
public class C0637t extends android.widget.RatingBar {

    /* renamed from: b */
    private final androidx.appcompat.widget.C0633r f2279b;

    public C0637t(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = p000a.p001a.C0000a.ratingBarStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public C0637t(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            androidx.appcompat.widget.r r1 = new androidx.appcompat.widget.r
            r1.<init>(r0)
            r0.f2279b = r1
            androidx.appcompat.widget.r r1 = r0.f2279b
            r1.mo1845a(r2, r3)
            return
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            super.onMeasure(r2, r3)     // Catch: all -> 0x0024
            androidx.appcompat.widget.r r3 = r1.f2279b     // Catch: all -> 0x0024
            android.graphics.Bitmap r3 = r3.m1913a()     // Catch: all -> 0x0024
            if (r3 == 0) goto L_0x0022
            int r3 = r3.getWidth()     // Catch: all -> 0x0024
            int r0 = r1.getNumStars()     // Catch: all -> 0x0024
            int r3 = r3 * r0
            r0 = 0
            int r2 = android.view.View.resolveSizeAndState(r3, r2, r0)     // Catch: all -> 0x0024
            int r3 = r1.getMeasuredHeight()     // Catch: all -> 0x0024
            r1.setMeasuredDimension(r2, r3)     // Catch: all -> 0x0024
        L_0x0022:
            monitor-exit(r1)
            return
        L_0x0024:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
