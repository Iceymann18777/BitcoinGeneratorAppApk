package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.m */
/* loaded from: classes.dex */
public abstract class AbstractC0857m extends androidx.recyclerview.widget.C0813j.AbstractC0829l {

    /* renamed from: g */
    boolean f3258g;

    public AbstractC0857m() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f3258g = r0
            return
    }

    /* renamed from: a */
    public final void m570a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1, boolean r2) {
            r0 = this;
            r0.m566c(r1, r2)
            r0.m812b(r1)
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0829l
    /* renamed from: a */
    public boolean mo575a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r2) {
            r1 = this;
            boolean r0 = r1.f3258g
            if (r0 == 0) goto L_0x000d
            boolean r2 = r2.m866n()
            if (r2 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            r2 = 0
            goto L_0x000e
        L_0x000d:
            r2 = 1
        L_0x000e:
            return r2
    }

    /* renamed from: a */
    public abstract boolean mo574a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1, int r2, int r3, int r4, int r5);

    /* renamed from: a */
    public abstract boolean mo573a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1, androidx.recyclerview.widget.C0813j.AbstractC0821d0 r2, int r3, int r4, int r5, int r6);

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0829l
    /* renamed from: a */
    public boolean mo572a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r8, androidx.recyclerview.widget.C0813j.AbstractC0821d0 r9, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r10, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r11) {
            r7 = this;
            int r3 = r10.f3207a
            int r4 = r10.f3208b
            boolean r0 = r9.m856x()
            if (r0 == 0) goto L_0x0011
            int r11 = r10.f3207a
            int r10 = r10.f3208b
            r6 = r10
            r5 = r11
            goto L_0x0017
        L_0x0011:
            int r10 = r11.f3207a
            int r11 = r11.f3208b
            r5 = r10
            r6 = r11
        L_0x0017:
            r0 = r7
            r1 = r8
            r2 = r9
            boolean r8 = r0.mo573a(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0829l
    /* renamed from: a */
    public boolean mo571a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r9, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r10, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r11) {
            r8 = this;
            if (r10 == 0) goto L_0x001d
            int r0 = r10.f3207a
            int r1 = r11.f3207a
            if (r0 != r1) goto L_0x000e
            int r0 = r10.f3208b
            int r1 = r11.f3208b
            if (r0 == r1) goto L_0x001d
        L_0x000e:
            int r4 = r10.f3207a
            int r5 = r10.f3208b
            int r6 = r11.f3207a
            int r7 = r11.f3208b
            r2 = r8
            r3 = r9
            boolean r9 = r2.mo574a(r3, r4, r5, r6, r7)
            return r9
        L_0x001d:
            boolean r9 = r8.mo564f(r9)
            return r9
    }

    /* renamed from: b */
    public final void m568b(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1, boolean r2) {
            r0 = this;
            r0.m565d(r1, r2)
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0829l
    /* renamed from: b */
    public boolean mo569b(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r7, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r8, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r9) {
            r6 = this;
            int r2 = r8.f3207a
            int r3 = r8.f3208b
            android.view.View r8 = r7.f3179a
            if (r9 != 0) goto L_0x000d
            int r0 = r8.getLeft()
            goto L_0x000f
        L_0x000d:
            int r0 = r9.f3207a
        L_0x000f:
            r4 = r0
            if (r9 != 0) goto L_0x0017
            int r9 = r8.getTop()
            goto L_0x0019
        L_0x0017:
            int r9 = r9.f3208b
        L_0x0019:
            r5 = r9
            boolean r9 = r7.m864p()
            if (r9 != 0) goto L_0x0038
            if (r2 != r4) goto L_0x0024
            if (r3 == r5) goto L_0x0038
        L_0x0024:
            int r9 = r8.getWidth()
            int r9 = r9 + r4
            int r0 = r8.getHeight()
            int r0 = r0 + r5
            r8.layout(r4, r5, r9, r0)
            r0 = r6
            r1 = r7
            boolean r7 = r0.mo574a(r1, r2, r3, r4, r5)
            return r7
        L_0x0038:
            boolean r7 = r6.mo563g(r7)
            return r7
    }

    /* renamed from: c */
    public void m566c(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1, boolean r2) {
            r0 = this;
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0829l
    /* renamed from: c */
    public boolean mo567c(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r7, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r8, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r9) {
            r6 = this;
            int r0 = r8.f3207a
            int r1 = r9.f3207a
            if (r0 != r1) goto L_0x0012
            int r0 = r8.f3208b
            int r1 = r9.f3208b
            if (r0 == r1) goto L_0x000d
            goto L_0x0012
        L_0x000d:
            r6.m560j(r7)
            r7 = 0
            return r7
        L_0x0012:
            int r2 = r8.f3207a
            int r3 = r8.f3208b
            int r4 = r9.f3207a
            int r5 = r9.f3208b
            r0 = r6
            r1 = r7
            boolean r7 = r0.mo574a(r1, r2, r3, r4, r5)
            return r7
    }

    /* renamed from: d */
    public void m565d(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1, boolean r2) {
            r0 = this;
            return
    }

    /* renamed from: f */
    public abstract boolean mo564f(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1);

    /* renamed from: g */
    public abstract boolean mo563g(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1);

    /* renamed from: h */
    public final void m562h(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1) {
            r0 = this;
            r0.m556n(r1)
            r0.m812b(r1)
            return
    }

    /* renamed from: i */
    public final void m561i(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1) {
            r0 = this;
            r0.m555o(r1)
            return
    }

    /* renamed from: j */
    public final void m560j(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1) {
            r0 = this;
            r0.m554p(r1)
            r0.m812b(r1)
            return
    }

    /* renamed from: k */
    public final void m559k(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1) {
            r0 = this;
            r0.m553q(r1)
            return
    }

    /* renamed from: l */
    public final void m558l(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1) {
            r0 = this;
            r0.m552r(r1)
            r0.m812b(r1)
            return
    }

    /* renamed from: m */
    public final void m557m(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1) {
            r0 = this;
            r0.m551s(r1)
            return
    }

    /* renamed from: n */
    public void m556n(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1) {
            r0 = this;
            return
    }

    /* renamed from: o */
    public void m555o(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1) {
            r0 = this;
            return
    }

    /* renamed from: p */
    public void m554p(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1) {
            r0 = this;
            return
    }

    /* renamed from: q */
    public void m553q(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1) {
            r0 = this;
            return
    }

    /* renamed from: r */
    public void m552r(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1) {
            r0 = this;
            return
    }

    /* renamed from: s */
    public void m551s(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1) {
            r0 = this;
            return
    }
}
