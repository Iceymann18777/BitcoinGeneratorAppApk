package p000a.p018g.p029l;

/* renamed from: a.g.l.k */
/* loaded from: classes.dex */
public class C0209k {

    /* renamed from: a */
    private android.view.ViewParent f654a;

    /* renamed from: b */
    private android.view.ViewParent f655b;

    /* renamed from: c */
    private final android.view.View f656c;

    /* renamed from: d */
    private boolean f657d;

    /* renamed from: e */
    private int[] f658e;

    public C0209k(android.view.View r1) {
            r0 = this;
            r0.<init>()
            r0.f656c = r1
            return
    }

    /* renamed from: a */
    private void m3461a(int r2, android.view.ViewParent r3) {
            r1 = this;
            if (r2 == 0) goto L_0x0009
            r0 = 1
            if (r2 == r0) goto L_0x0006
            goto L_0x000b
        L_0x0006:
            r1.f655b = r3
            goto L_0x000b
        L_0x0009:
            r1.f654a = r3
        L_0x000b:
            return
    }

    /* renamed from: d */
    private android.view.ViewParent m3455d(int r2) {
            r1 = this;
            if (r2 == 0) goto L_0x000a
            r0 = 1
            if (r2 == r0) goto L_0x0007
            r2 = 0
            return r2
        L_0x0007:
            android.view.ViewParent r2 = r1.f655b
            return r2
        L_0x000a:
            android.view.ViewParent r2 = r1.f654a
            return r2
    }

    /* renamed from: a */
    public void m3460a(boolean r2) {
            r1 = this;
            boolean r0 = r1.f657d
            if (r0 == 0) goto L_0x0009
            android.view.View r0 = r1.f656c
            p000a.p018g.p029l.C0216r.m3448C(r0)
        L_0x0009:
            r1.f657d = r2
            return
    }

    /* renamed from: a */
    public boolean m3470a() {
            r1 = this;
            r0 = 0
            boolean r0 = r1.m3467a(r0)
            return r0
    }

    /* renamed from: a */
    public boolean m3469a(float r3, float r4) {
            r2 = this;
            boolean r0 = r2.m3459b()
            r1 = 0
            if (r0 == 0) goto L_0x0014
            android.view.ViewParent r0 = r2.m3455d(r1)
            if (r0 == 0) goto L_0x0014
            android.view.View r1 = r2.f656c
            boolean r3 = p000a.p018g.p029l.C0222u.m3380a(r0, r1, r3, r4)
            return r3
        L_0x0014:
            return r1
    }

    /* renamed from: a */
    public boolean m3468a(float r3, float r4, boolean r5) {
            r2 = this;
            boolean r0 = r2.m3459b()
            r1 = 0
            if (r0 == 0) goto L_0x0014
            android.view.ViewParent r0 = r2.m3455d(r1)
            if (r0 == 0) goto L_0x0014
            android.view.View r1 = r2.f656c
            boolean r3 = p000a.p018g.p029l.C0222u.m3379a(r0, r1, r3, r4, r5)
            return r3
        L_0x0014:
            return r1
    }

    /* renamed from: a */
    public boolean m3467a(int r1) {
            r0 = this;
            android.view.ViewParent r1 = r0.m3455d(r1)
            if (r1 == 0) goto L_0x0008
            r1 = 1
            goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            return r1
    }

    /* renamed from: a */
    public boolean m3466a(int r5, int r6) {
            r4 = this;
            boolean r0 = r4.m3467a(r6)
            r1 = 1
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r4.m3459b()
            if (r0 == 0) goto L_0x0035
            android.view.View r0 = r4.f656c
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r2 = r4.f656c
        L_0x0016:
            if (r0 == 0) goto L_0x0035
            android.view.View r3 = r4.f656c
            boolean r3 = p000a.p018g.p029l.C0222u.m3374b(r0, r2, r3, r5, r6)
            if (r3 == 0) goto L_0x0029
            r4.m3461a(r6, r0)
            android.view.View r3 = r4.f656c
            p000a.p018g.p029l.C0222u.m3375a(r0, r2, r3, r5, r6)
            return r1
        L_0x0029:
            boolean r3 = r0 instanceof android.view.View
            if (r3 == 0) goto L_0x0030
            r2 = r0
            android.view.View r2 = (android.view.View) r2
        L_0x0030:
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0016
        L_0x0035:
            r5 = 0
            return r5
    }

    /* renamed from: a */
    public boolean m3465a(int r8, int r9, int r10, int r11, int[] r12) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            boolean r8 = r0.m3464a(r1, r2, r3, r4, r5, r6)
            return r8
    }

    /* renamed from: a */
    public boolean m3464a(int r15, int r16, int r17, int r18, int[] r19, int r20) {
            r14 = this;
            r0 = r14
            r1 = r19
            boolean r2 = r14.m3459b()
            r3 = 0
            if (r2 == 0) goto L_0x0054
            r2 = r20
            android.view.ViewParent r4 = r14.m3455d(r2)
            if (r4 != 0) goto L_0x0013
            return r3
        L_0x0013:
            r11 = 1
            if (r15 != 0) goto L_0x0024
            if (r16 != 0) goto L_0x0024
            if (r17 != 0) goto L_0x0024
            if (r18 == 0) goto L_0x001d
            goto L_0x0024
        L_0x001d:
            if (r1 == 0) goto L_0x0054
            r1[r3] = r3
            r1[r11] = r3
            goto L_0x0054
        L_0x0024:
            if (r1 == 0) goto L_0x0032
            android.view.View r5 = r0.f656c
            r5.getLocationInWindow(r1)
            r5 = r1[r3]
            r6 = r1[r11]
            r12 = r5
            r13 = r6
            goto L_0x0034
        L_0x0032:
            r12 = 0
            r13 = 0
        L_0x0034:
            android.view.View r5 = r0.f656c
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r20
            p000a.p018g.p029l.C0222u.m3377a(r4, r5, r6, r7, r8, r9, r10)
            if (r1 == 0) goto L_0x0053
            android.view.View r2 = r0.f656c
            r2.getLocationInWindow(r1)
            r2 = r1[r3]
            int r2 = r2 - r12
            r1[r3] = r2
            r2 = r1[r11]
            int r2 = r2 - r13
            r1[r11] = r2
        L_0x0053:
            return r11
        L_0x0054:
            return r3
    }

    /* renamed from: a */
    public boolean m3463a(int r7, int r8, int[] r9, int[] r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            boolean r7 = r0.m3462a(r1, r2, r3, r4, r5)
            return r7
    }

    /* renamed from: a */
    public boolean m3462a(int r11, int r12, int[] r13, int[] r14, int r15) {
            r10 = this;
            boolean r0 = r10.m3459b()
            r1 = 0
            if (r0 == 0) goto L_0x0061
            android.view.ViewParent r2 = r10.m3455d(r15)
            if (r2 != 0) goto L_0x000e
            return r1
        L_0x000e:
            r0 = 1
            if (r11 != 0) goto L_0x001b
            if (r12 == 0) goto L_0x0014
            goto L_0x001b
        L_0x0014:
            if (r14 == 0) goto L_0x0061
            r14[r1] = r1
            r14[r0] = r1
            goto L_0x0061
        L_0x001b:
            if (r14 == 0) goto L_0x0029
            android.view.View r3 = r10.f656c
            r3.getLocationInWindow(r14)
            r3 = r14[r1]
            r4 = r14[r0]
            r8 = r3
            r9 = r4
            goto L_0x002b
        L_0x0029:
            r8 = 0
            r9 = 0
        L_0x002b:
            if (r13 != 0) goto L_0x0038
            int[] r13 = r10.f658e
            if (r13 != 0) goto L_0x0036
            r13 = 2
            int[] r13 = new int[r13]
            r10.f658e = r13
        L_0x0036:
            int[] r13 = r10.f658e
        L_0x0038:
            r13[r1] = r1
            r13[r0] = r1
            android.view.View r3 = r10.f656c
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r15
            p000a.p018g.p029l.C0222u.m3376a(r2, r3, r4, r5, r6, r7)
            if (r14 == 0) goto L_0x0056
            android.view.View r11 = r10.f656c
            r11.getLocationInWindow(r14)
            r11 = r14[r1]
            int r11 = r11 - r8
            r14[r1] = r11
            r11 = r14[r0]
            int r11 = r11 - r9
            r14[r0] = r11
        L_0x0056:
            r11 = r13[r1]
            if (r11 != 0) goto L_0x0060
            r11 = r13[r0]
            if (r11 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            return r0
        L_0x0061:
            return r1
    }

    /* renamed from: b */
    public boolean m3459b() {
            r1 = this;
            boolean r0 = r1.f657d
            return r0
    }

    /* renamed from: b */
    public boolean m3458b(int r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.m3466a(r2, r0)
            return r2
    }

    /* renamed from: c */
    public void m3457c() {
            r1 = this;
            r0 = 0
            r1.m3456c(r0)
            return
    }

    /* renamed from: c */
    public void m3456c(int r3) {
            r2 = this;
            android.view.ViewParent r0 = r2.m3455d(r3)
            if (r0 == 0) goto L_0x000f
            android.view.View r1 = r2.f656c
            p000a.p018g.p029l.C0222u.m3378a(r0, r1, r3)
            r0 = 0
            r2.m3461a(r3, r0)
        L_0x000f:
            return
    }
}
