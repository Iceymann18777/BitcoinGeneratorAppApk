package androidx.core.widget;

/* renamed from: androidx.core.widget.f */
/* loaded from: classes.dex */
public class C0717f extends androidx.core.widget.AbstractView$OnTouchListenerC0710a {

    /* renamed from: t */
    private final android.widget.ListView f2711t;

    public C0717f(android.widget.ListView r1) {
            r0 = this;
            r0.<init>(r1)
            r0.f2711t = r1
            return
    }

    @Override // androidx.core.widget.AbstractView$OnTouchListenerC0710a
    /* renamed from: a */
    public void mo1503a(int r1, int r2) {
            r0 = this;
            android.widget.ListView r1 = r0.f2711t
            androidx.core.widget.C0718g.m1501a(r1, r2)
            return
    }

    @Override // androidx.core.widget.AbstractView$OnTouchListenerC0710a
    /* renamed from: a */
    public boolean mo1504a(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.core.widget.AbstractView$OnTouchListenerC0710a
    /* renamed from: b */
    public boolean mo1502b(int r8) {
            r7 = this;
            android.widget.ListView r0 = r7.f2711t
            int r1 = r0.getCount()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r3 = r0.getChildCount()
            int r4 = r0.getFirstVisiblePosition()
            int r5 = r4 + r3
            r6 = 1
            if (r8 <= 0) goto L_0x0029
            if (r5 < r1) goto L_0x0038
            int r3 = r3 - r6
            android.view.View r8 = r0.getChildAt(r3)
            int r8 = r8.getBottom()
            int r0 = r0.getHeight()
            if (r8 > r0) goto L_0x0038
            return r2
        L_0x0029:
            if (r8 >= 0) goto L_0x0039
            if (r4 > 0) goto L_0x0038
            android.view.View r8 = r0.getChildAt(r2)
            int r8 = r8.getTop()
            if (r8 < 0) goto L_0x0038
            return r2
        L_0x0038:
            return r6
        L_0x0039:
            return r2
    }
}
